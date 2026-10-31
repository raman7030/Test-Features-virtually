package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Propstat {

    @Element(required = false)
    public Error error;

    @Element
    public Prop prop;

    @Element(required = false)
    public String responsedescription;

    @Element
    public String status;

    public Prop getProp() {
        return this.prop;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public Error getError() {
        return this.error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public String getResponsedescription() {
        return this.responsedescription;
    }

    public void setResponsedescription(String str) {
        this.responsedescription = str;
    }
}
