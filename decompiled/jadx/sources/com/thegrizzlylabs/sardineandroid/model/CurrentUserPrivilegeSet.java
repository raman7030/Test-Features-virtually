package com.thegrizzlylabs.sardineandroid.model;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Root
public class CurrentUserPrivilegeSet {

    @ElementList(inline = true, type = Privilege.class)
    public List privileges;
}
