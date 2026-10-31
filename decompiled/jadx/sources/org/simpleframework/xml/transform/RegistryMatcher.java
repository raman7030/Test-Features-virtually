package org.simpleframework.xml.transform;

import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class RegistryMatcher implements Matcher {
    public final Cache transforms = new ConcurrentCache();
    public final Cache types = new ConcurrentCache();

    public void bind(Class cls, Class cls2) {
        this.types.cache(cls, cls2);
    }

    public void bind(Class cls, Transform transform) {
        this.transforms.cache(cls, transform);
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public Transform match(Class cls) {
        Transform transform = (Transform) this.transforms.fetch(cls);
        return transform == null ? create(cls) : transform;
    }

    private Transform create(Class cls) {
        Class cls2 = (Class) this.types.fetch(cls);
        if (cls2 != null) {
            return create(cls, cls2);
        }
        return null;
    }

    private Transform create(Class cls, Class cls2) {
        Transform transform = (Transform) cls2.newInstance();
        if (transform != null) {
            this.transforms.cache(cls, transform);
        }
        return transform;
    }
}
