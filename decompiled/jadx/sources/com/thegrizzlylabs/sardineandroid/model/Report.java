package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Report {
    public Element any;

    public Element getAny() {
        return this.any;
    }

    public void setAny(Element element) {
        this.any = element;
    }
}
