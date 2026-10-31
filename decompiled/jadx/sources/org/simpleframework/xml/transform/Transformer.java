package org.simpleframework.xml.transform;

import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class Transformer {
    public final Cache cache = new ConcurrentCache();
    public final Cache error = new ConcurrentCache();
    public final Matcher matcher;

    public Transformer(Matcher matcher) {
        this.matcher = new DefaultMatcher(matcher);
    }

    public Object read(String str, Class cls) throws TransformException {
        Transform transformLookup = lookup(cls);
        if (transformLookup == null) {
            throw new TransformException("Transform of %s not supported", cls);
        }
        return transformLookup.read(str);
    }

    public String write(Object obj, Class cls) throws TransformException {
        Transform transformLookup = lookup(cls);
        if (transformLookup == null) {
            throw new TransformException("Transform of %s not supported", cls);
        }
        return transformLookup.write(obj);
    }

    public boolean valid(Class cls) {
        return lookup(cls) != null;
    }

    private Transform lookup(Class cls) {
        if (this.error.contains(cls)) {
            return null;
        }
        Transform transform = (Transform) this.cache.fetch(cls);
        return transform != null ? transform : match(cls);
    }

    private Transform match(Class cls) {
        Transform transformMatch = this.matcher.match(cls);
        if (transformMatch != null) {
            this.cache.cache(cls, transformMatch);
            return transformMatch;
        }
        this.error.cache(cls, this);
        return transformMatch;
    }
}
