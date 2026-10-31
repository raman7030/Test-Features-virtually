package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class SyncCollection {
    public Limit limit;
    public Prop prop;
    public String syncLevel;
    public String syncToken;

    public String getSyncToken() {
        return this.syncToken;
    }

    public void setSyncToken(String str) {
        this.syncToken = str;
    }

    public String getSyncLevel() {
        return this.syncLevel;
    }

    public void setSyncLevel(String str) {
        this.syncLevel = str;
    }

    public Limit getLimit() {
        return this.limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    public Prop getProp() {
        return this.prop;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }
}
