package org.simpleframework.xml.core;

import org.simpleframework.xml.filter.Filter;

/* JADX INFO: loaded from: classes2.dex */
public class TemplateFilter implements Filter {
    public Context context;
    public Filter filter;

    public TemplateFilter(Context context, Filter filter) {
        this.context = context;
        this.filter = filter;
    }

    @Override // org.simpleframework.xml.filter.Filter
    public String replace(String str) {
        Object attribute = this.context.getAttribute(str);
        if (attribute != null) {
            return attribute.toString();
        }
        return this.filter.replace(str);
    }
}
