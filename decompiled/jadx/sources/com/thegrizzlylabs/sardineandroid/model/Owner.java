package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Owner {

    @ElementList(required = false, type = Object.class)
    public List content;

    @Element(required = false)
    public String href;

    @Element(required = false)
    public Unauthenticated unauthenticated;

    public List getContent() {
        if (this.content == null) {
            this.content = new ArrayList();
        }
        return this.content;
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String str) {
        this.href = str;
    }

    public Unauthenticated getUnauthenticated() {
        return this.unauthenticated;
    }

    public void setUnauthenticated(Unauthenticated unauthenticated) {
        this.unauthenticated = unauthenticated;
    }
}
