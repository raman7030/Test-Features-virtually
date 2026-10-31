package org.simpleframework.xml.util;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class Dictionary extends AbstractSet {
    public final Table map = new Table();

    public class Table extends HashMap {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Entry entry) {
        return this.map.put(entry.getName(), entry) != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.map.values().iterator();
    }

    public Entry get(String str) {
        return (Entry) this.map.get(str);
    }

    public Entry remove(String str) {
        return (Entry) this.map.remove(str);
    }
}
