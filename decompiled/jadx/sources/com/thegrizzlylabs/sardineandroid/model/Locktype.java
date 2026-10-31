package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Locktype {

    @Element(name = "null", required = false)
    public Null aNull;

    @Element(required = false)
    public Write write;

    public Write getWrite() {
        return this.write;
    }

    public void setWrite(Write write) {
        this.write = write;
    }
}
