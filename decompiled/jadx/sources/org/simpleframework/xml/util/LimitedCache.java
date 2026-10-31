package org.simpleframework.xml.util;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LimitedCache extends LinkedHashMap implements Cache {
    public final int capacity;

    public LimitedCache() {
        this(50000);
    }

    public LimitedCache(int i) {
        this.capacity = i;
    }

    @Override // org.simpleframework.xml.util.Cache
    public void cache(Object obj, Object obj2) {
        put(obj, obj2);
    }

    @Override // org.simpleframework.xml.util.Cache
    public Object take(Object obj) {
        return remove(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public Object fetch(Object obj) {
        return get(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public boolean contains(Object obj) {
        return containsKey(obj);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.capacity;
    }
}
