package org.simpleframework.xml.convert;

import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class Registry {
    public final Cache cache = new ConcurrentCache();
    public final RegistryBinder binder = new RegistryBinder();

    public Converter lookup(Class cls) {
        Converter converter = (Converter) this.cache.fetch(cls);
        return converter == null ? create(cls) : converter;
    }

    private Converter create(Class cls) {
        Converter converterLookup = this.binder.lookup(cls);
        if (converterLookup != null) {
            this.cache.cache(cls, converterLookup);
        }
        return converterLookup;
    }

    public Registry bind(Class cls, Class cls2) {
        if (cls != null) {
            this.binder.bind(cls, cls2);
        }
        return this;
    }

    public Registry bind(Class cls, Converter converter) {
        if (cls != null) {
            this.cache.cache(cls, converter);
        }
        return this;
    }
}
