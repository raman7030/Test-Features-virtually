package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Locktoken {

    @Element
    public String href;

    public String getHref() {
        return this.href;
    }
}
