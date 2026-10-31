package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Source {
    public List link;

    public List getLink() {
        if (this.link == null) {
            this.link = new ArrayList();
        }
        return this.link;
    }
}
