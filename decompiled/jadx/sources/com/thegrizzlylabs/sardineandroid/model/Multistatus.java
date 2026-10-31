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
public class Multistatus {

    @ElementList(inline = true, type = Response.class)
    public List response;

    @Element(required = false)
    public String responsedescription;
    public String syncToken;

    public List getResponse() {
        if (this.response == null) {
            this.response = new ArrayList();
        }
        return this.response;
    }

    public String getResponsedescription() {
        return this.responsedescription;
    }

    public void setResponsedescription(String str) {
        this.responsedescription = str;
    }

    public String getSyncToken() {
        return this.syncToken;
    }

    public void setSyncToken(String str) {
        this.syncToken = str;
    }
}
