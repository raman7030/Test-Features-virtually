package org.simpleframework.xml.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class WeakCache implements Cache {
    public SegmentList list;

    public WeakCache() {
        this(10);
    }

    public WeakCache(int i) {
        this.list = new SegmentList(i);
    }

    @Override // org.simpleframework.xml.util.Cache
    public boolean isEmpty() {
        Iterator it = this.list.iterator();
        while (it.hasNext()) {
            if (!((Segment) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // org.simpleframework.xml.util.Cache
    public void cache(Object obj, Object obj2) {
        map(obj).cache(obj, obj2);
    }

    @Override // org.simpleframework.xml.util.Cache
    public Object take(Object obj) {
        return map(obj).take(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public Object fetch(Object obj) {
        return map(obj).fetch(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public boolean contains(Object obj) {
        return map(obj).contains(obj);
    }

    private Segment map(Object obj) {
        return this.list.get(obj);
    }

    public class SegmentList implements Iterable {
        public List list = new ArrayList();
        public int size;

        public SegmentList(int i) {
            this.size = i;
            create(i);
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.list.iterator();
        }

        public Segment get(Object obj) {
            int iSegment = segment(obj);
            if (iSegment < this.size) {
                return (Segment) this.list.get(iSegment);
            }
            return null;
        }

        private void create(int i) {
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    return;
                }
                this.list.add(new Segment());
                i = i2;
            }
        }

        private int segment(Object obj) {
            return Math.abs(obj.hashCode() % this.size);
        }
    }

    public class Segment extends WeakHashMap {
        public synchronized void cache(Object obj, Object obj2) {
            put(obj, obj2);
        }

        public synchronized boolean contains(Object obj) {
            return containsKey(obj);
        }

        public synchronized Object fetch(Object obj) {
            return get(obj);
        }

        public synchronized Object take(Object obj) {
            return remove(obj);
        }

        public Segment() {
        }
    }
}
