package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Grant {

    @ElementList(required = false, type = Object.class)
    public List content;

    @ElementList(inline = true, type = Privilege.class)
    public List privilege;

    public List getContent() {
        if (this.content == null) {
            this.content = new ArrayList();
        }
        return this.content;
    }

    public List getPrivilege() {
        return this.privilege;
    }

    public void setPrivilege(List list) {
        this.privilege = list;
    }
}
