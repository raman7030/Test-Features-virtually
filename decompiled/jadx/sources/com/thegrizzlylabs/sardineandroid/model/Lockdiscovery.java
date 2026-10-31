package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Lockdiscovery {

    @ElementList(inline = true, required = false, type = Activelock.class)
    public List activelock;

    public List getActivelock() {
        if (this.activelock == null) {
            this.activelock = new ArrayList();
        }
        return this.activelock;
    }
}
