package org.simpleframework.xml.util;

/* JADX INFO: loaded from: classes2.dex */
public interface Cache {
    void cache(Object obj, Object obj2);

    boolean contains(Object obj);

    Object fetch(Object obj);

    boolean isEmpty();

    Object take(Object obj);
}
