package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Resourcetype implements EntityWithAnyElement {
    public List any;

    @Element(required = false)
    public Collection collection;
    public Principal principal;

    public Collection getCollection() {
        return this.collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Principal getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    @Override // com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement
    public List getAny() {
        if (this.any == null) {
            this.any = new ArrayList();
        }
        return this.any;
    }
}
