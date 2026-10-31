package org.simpleframework.xml.stream;

import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class Builder implements Style {
    public final Cache attributes = new ConcurrentCache();
    public final Cache elements = new ConcurrentCache();
    public final Style style;

    public Builder(Style style) {
        this.style = style;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        String str2 = (String) this.attributes.fetch(str);
        if (str2 != null) {
            return str2;
        }
        String attribute = this.style.getAttribute(str);
        if (attribute != null) {
            this.attributes.cache(str, attribute);
        }
        return attribute;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        String str2 = (String) this.elements.fetch(str);
        if (str2 != null) {
            return str2;
        }
        String element = this.style.getElement(str);
        if (element != null) {
            this.elements.cache(str, element);
        }
        return element;
    }

    public void setAttribute(String str, String str2) {
        this.attributes.cache(str, str2);
    }

    public void setElement(String str, String str2) {
        this.elements.cache(str, str2);
    }
}
