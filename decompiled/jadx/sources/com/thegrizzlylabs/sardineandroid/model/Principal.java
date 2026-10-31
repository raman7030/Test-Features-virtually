package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Principal {

    @Element(required = false)
    public All all;

    @Element(required = false)
    public Authenticated authenticated;

    @Element(required = false)
    public String href;

    @Element(required = false)
    public Property property;

    @Element(required = false)
    public Self self;

    @Element(required = false)
    public Unauthenticated unauthenticated;

    public String getHref() {
        return this.href;
    }

    public void setHref(String str) {
        this.href = str;
    }

    public Property getProperty() {
        return this.property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public All getAll() {
        return this.all;
    }

    public void setAll(All all) {
        this.all = all;
    }

    public Authenticated getAuthenticated() {
        return this.authenticated;
    }

    public void setAuthenticated(Authenticated authenticated) {
        this.authenticated = authenticated;
    }

    public Unauthenticated getUnauthenticated() {
        return this.unauthenticated;
    }

    public void setUnauthenticated(Unauthenticated unauthenticated) {
        this.unauthenticated = unauthenticated;
    }

    public Self getSelf() {
        return this.self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }
}
