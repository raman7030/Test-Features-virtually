package org.simpleframework.xml.util;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Resolver extends AbstractSet {
    public final Stack stack = new Stack();
    public final Cache cache = new Cache();

    public Match resolve(String str) {
        List listResolveAll = (List) this.cache.get(str);
        if (listResolveAll == null) {
            listResolveAll = resolveAll(str);
        }
        if (listResolveAll.isEmpty()) {
            return null;
        }
        return (Match) listResolveAll.get(0);
    }

    public List resolveAll(String str) {
        List list = (List) this.cache.get(str);
        if (list != null) {
            return list;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            return null;
        }
        return resolveAll(str, charArray);
    }

    private List resolveAll(String str, char[] cArr) {
        ArrayList arrayList = new ArrayList();
        for (Match match : this.stack) {
            if (match(cArr, match.getPattern().toCharArray())) {
                this.cache.put(str, arrayList);
                arrayList.add(match);
            }
        }
        return arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Match match) {
        this.stack.push(match);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.stack.sequence();
    }

    public boolean remove(Match match) {
        this.cache.clear();
        return this.stack.remove(match);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.stack.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.cache.clear();
        this.stack.clear();
    }

    private boolean match(char[] cArr, char[] cArr2) {
        return match(cArr, 0, cArr2, 0);
    }

    private boolean match(char[] cArr, int i, char[] cArr2, int i2) {
        while (i2 < cArr2.length && i < cArr.length) {
            if (cArr2[i2] == '*') {
                do {
                    char c = cArr2[i2];
                    if (c == '*') {
                        i2++;
                    } else {
                        if (c == '?' && (i2 = i2 + 1) >= cArr2.length) {
                            return true;
                        }
                        while (i < cArr.length) {
                            char c2 = cArr[i];
                            char c3 = cArr2[i2];
                            if (c2 == c3 || c3 == '?') {
                                if (cArr2[i2 - 1] == '?') {
                                    break;
                                }
                                if (match(cArr, i, cArr2, i2)) {
                                    return true;
                                }
                            }
                            i++;
                        }
                        if (cArr.length == i) {
                            return false;
                        }
                    }
                } while (i2 < cArr2.length);
                return true;
            }
            int i3 = i + 1;
            int i4 = i2 + 1;
            if (cArr[i] != cArr2[i2] && cArr2[i2] != '?') {
                return false;
            }
            i = i3;
            i2 = i4;
        }
        if (cArr2.length == i2) {
            return cArr.length == i;
        }
        while (cArr2[i2] == '*') {
            i2++;
            if (i2 >= cArr2.length) {
                return true;
            }
        }
        return false;
    }

    public class Cache extends LimitedCache {
        public Cache() {
            super(1024);
        }
    }

    public class Stack extends LinkedList {
        public Stack() {
        }

        @Override // java.util.LinkedList, java.util.Deque
        public void push(Match match) {
            Resolver.this.cache.clear();
            addFirst(match);
        }

        public void purge(int i) {
            Resolver.this.cache.clear();
            remove(i);
        }

        public Iterator sequence() {
            return new Sequence();
        }

        public class Sequence implements Iterator {
            public int cursor;

            public Sequence() {
                this.cursor = Stack.this.size();
            }

            @Override // java.util.Iterator
            public Match next() {
                if (!hasNext()) {
                    return null;
                }
                Stack stack = Stack.this;
                int i = this.cursor - 1;
                this.cursor = i;
                return (Match) stack.get(i);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.cursor > 0;
            }

            @Override // java.util.Iterator
            public void remove() {
                Stack.this.purge(this.cursor);
            }
        }
    }
}
