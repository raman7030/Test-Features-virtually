package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Link {
    public List dst;
    public List src;

    public List getSrc() {
        if (this.src == null) {
            this.src = new ArrayList();
        }
        return this.src;
    }

    public List getDst() {
        if (this.dst == null) {
            this.dst = new ArrayList();
        }
        return this.dst;
    }
}
