package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Lockentry {

    @Element(required = false)
    public Exclusive exclusive;

    @Element(required = false)
    public Lockscope lockscope;

    @Element(required = false)
    public Locktype locktype;

    @Element(required = false)
    public Shared shared;

    @Element(required = false)
    public Write write;

    public Lockscope getLockscope() {
        if (this.lockscope == null && (this.exclusive != null || this.shared != null)) {
            Lockscope lockscope = new Lockscope();
            lockscope.setExclusive(this.exclusive);
            lockscope.setShared(this.shared);
            setLockscope(lockscope);
        }
        return this.lockscope;
    }

    public void setLockscope(Lockscope lockscope) {
        this.lockscope = lockscope;
        this.exclusive = null;
        this.shared = null;
    }

    public Locktype getLocktype() {
        if (this.locktype == null && this.write != null) {
            Locktype locktype = new Locktype();
            locktype.setWrite(this.write);
            setLocktype(locktype);
        }
        return this.locktype;
    }

    public void setLocktype(Locktype locktype) {
        this.locktype = locktype;
        this.write = null;
    }
}
