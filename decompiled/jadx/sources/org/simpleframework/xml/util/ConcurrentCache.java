package org.simpleframework.xml.util;

import l.ConcurrentMapC10942;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentCache extends ConcurrentMapC10942 implements Cache {
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

    @Override // l.ConcurrentMapC10942, org.simpleframework.xml.util.Cache
    public boolean contains(Object obj) {
        return containsKey(obj);
    }
}
