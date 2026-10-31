package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultMatcher implements Matcher {
    public Matcher matcher;
    public Matcher primitive = new PrimitiveMatcher();
    public Matcher stock = new PackageMatcher();
    public Matcher array = new ArrayMatcher(this);

    public DefaultMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public Transform match(Class cls) {
        Transform transformMatch = this.matcher.match(cls);
        return transformMatch != null ? transformMatch : matchType(cls);
    }

    private Transform matchType(Class cls) {
        if (cls.isArray()) {
            return this.array.match(cls);
        }
        if (cls.isPrimitive()) {
            return this.primitive.match(cls);
        }
        return this.stock.match(cls);
    }
}
