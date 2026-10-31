package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class QuotaUsedBytes {

    @ElementList(required = false, type = String.class)
    public List content;

    public List getContent() {
        if (this.content == null) {
            this.content = new ArrayList();
        }
        return this.content;
    }
}
