package org.simpleframework.xml.convert;

import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class RegistryBinder {
    public final Cache cache = new ConcurrentCache();
    public final ConverterFactory factory = new ConverterFactory();

    public Converter lookup(Class cls) {
        Class cls2 = (Class) this.cache.fetch(cls);
        if (cls2 != null) {
            return create(cls2);
        }
        return null;
    }

    private Converter create(Class cls) {
        return this.factory.getInstance(cls);
    }

    public void bind(Class cls, Class cls2) {
        this.cache.cache(cls, cls2);
    }
}
