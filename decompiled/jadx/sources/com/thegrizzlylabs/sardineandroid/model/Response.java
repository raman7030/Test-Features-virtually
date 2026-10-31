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
public class Response {
    public Error error;

    @Element
    public String href;
    public Location location;

    @ElementList(inline = true, required = false, type = Propstat.class)
    public List propstat;
    public String responsedescription;
    public String status;

    public String getHref() {
        return this.href;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public List getPropstat() {
        if (this.propstat == null) {
            this.propstat = new ArrayList();
        }
        return this.propstat;
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

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
