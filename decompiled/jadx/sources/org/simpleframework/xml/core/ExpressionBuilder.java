package org.simpleframework.xml.core;

import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.LimitedCache;

/* JADX INFO: loaded from: classes2.dex */
public class ExpressionBuilder {
    public final Cache cache = new LimitedCache();
    public final Format format;
    public final Class type;

    public ExpressionBuilder(Detail detail, Support support) {
        this.format = support.getFormat();
        this.type = detail.getType();
    }

    public Expression build(String str) {
        Expression expression = (Expression) this.cache.fetch(str);
        return expression == null ? create(str) : expression;
    }

    private Expression create(String str) {
        PathParser pathParser = new PathParser(str, new ClassType(this.type), this.format);
        Cache cache = this.cache;
        if (cache != null) {
            cache.cache(str, pathParser);
        }
        return pathParser;
    }
}
