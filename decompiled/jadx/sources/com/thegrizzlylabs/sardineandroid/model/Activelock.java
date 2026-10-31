package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root(strict = false)
public class Activelock {

    @Element
    public String depth;

    @Element
    public Lockscope lockscope;

    @Element(required = false)
    public Locktoken locktoken;

    @Element
    public Locktype locktype;

    @Element(required = false)
    public Owner owner;

    @Element(required = false)
    public String timeout;

    public Lockscope getLockscope() {
        return this.lockscope;
    }

    public void setLockscope(Lockscope lockscope) {
        this.lockscope = lockscope;
    }

    public Locktype getLocktype() {
        return this.locktype;
    }

    public void setLocktype(Locktype locktype) {
        this.locktype = locktype;
    }

    public String getDepth() {
        return this.depth;
    }

    public void setDepth(String str) {
        this.depth = str;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getTimeout() {
        return this.timeout;
    }

    public void setTimeout(String str) {
        this.timeout = str;
    }

    public Locktoken getLocktoken() {
        return this.locktoken;
    }

    public void setLocktoken(Locktoken locktoken) {
        this.locktoken = locktoken;
    }
}
