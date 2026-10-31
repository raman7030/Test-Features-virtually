package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Error {
    public Object any;

    public Object getAny() {
        return this.any;
    }

    public void setAny(Object obj) {
        this.any = obj;
    }
}
