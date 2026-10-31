package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Set {

    @Element
    public Prop prop;

    public Prop getProp() {
        return this.prop;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }
}
