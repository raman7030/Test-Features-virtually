package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Location {
    public String href;

    public String getHref() {
        return this.href;
    }

    public void setHref(String str) {
        this.href = str;
    }
}
