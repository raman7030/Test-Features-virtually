package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root(strict = false)
public class Prop implements EntityWithAnyElement {

    @Element(required = false)
    public Acl acl;
    public List any;

    @Element(required = false)
    public String creationdate;

    @Element(name = "current-user-privilege-set")
    public CurrentUserPrivilegeSet currentUserPrivilegeSet;

    @Element(required = false)
    public String displayname;

    @Element(required = false)
    public String getcontentlanguage;

    @Element(required = false)
    public String getcontentlength;

    @Element(required = false)
    public String getcontenttype;

    @Element(required = false)
    public String getetag;

    @Element(required = false)
    public String getlastmodified;

    @Element(required = false)
    public Group group;

    @Element(required = false)
    public Lockdiscovery lockdiscovery;

    @Element(required = false)
    public Owner owner;

    @Element(name = "principal-collection-set", required = false)
    public PrincipalCollectionSet principalCollectionSet;

    @Element(name = "current-user-principal", required = false)
    public PrincipalURL principalURL;

    @Element(name = "quota-available-bytes", required = false)
    public QuotaAvailableBytes quotaAvailableBytes;

    @Element(name = "quota-used-bytes", required = false)
    public QuotaUsedBytes quotaUsedBytes;

    @Element(required = false)
    public Resourcetype resourcetype;

    @Element(required = false)
    public Supportedlock supportedlock;

    public Resourcetype getResourcetype() {
        return this.resourcetype;
    }

    public void setResourcetype(Resourcetype resourcetype) {
        this.resourcetype = resourcetype;
    }

    public String getCreationdate() {
        return this.creationdate;
    }

    public String getGetlastmodified() {
        return this.getlastmodified;
    }

    public String getGetetag() {
        return this.getetag;
    }

    public String getGetcontenttype() {
        return this.getcontenttype;
    }

    public String getGetcontentlength() {
        return this.getcontentlength;
    }

    public String getGetcontentlanguage() {
        return this.getcontentlanguage;
    }

    public String getDisplayname() {
        return this.displayname;
    }

    public void setCreationdate(String str) {
        this.creationdate = str;
    }

    public void setDisplayname(String str) {
        this.displayname = str;
    }

    public void setGetcontentlanguage(String str) {
        this.getcontentlanguage = str;
    }

    public void setGetcontentlength(String str) {
        this.getcontentlength = str;
    }

    public void setGetcontenttype(String str) {
        this.getcontenttype = str;
    }

    public void setGetetag(String str) {
        this.getetag = str;
    }

    public void setGetlastmodified(String str) {
        this.getlastmodified = str;
    }

    public void setSupportedlock(Supportedlock supportedlock) {
        this.supportedlock = supportedlock;
    }

    public Supportedlock getSupportedlock() {
        return this.supportedlock;
    }

    public Lockdiscovery getLockdiscovery() {
        return this.lockdiscovery;
    }

    public void setLockdiscovery(Lockdiscovery lockdiscovery) {
        this.lockdiscovery = lockdiscovery;
    }

    public QuotaAvailableBytes getQuotaAvailableBytes() {
        return this.quotaAvailableBytes;
    }

    public void setQuotaAvailableBytes(QuotaAvailableBytes quotaAvailableBytes) {
        this.quotaAvailableBytes = quotaAvailableBytes;
    }

    public QuotaUsedBytes getQuotaUsedBytes() {
        return this.quotaUsedBytes;
    }

    public void setQuotaUsedBytes(QuotaUsedBytes quotaUsedBytes) {
        this.quotaUsedBytes = quotaUsedBytes;
    }

    @Override // com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement
    public List getAny() {
        if (this.any == null) {
            this.any = new ArrayList();
        }
        return this.any;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Acl getAcl() {
        return this.acl;
    }

    public void setAcl(Acl acl) {
        this.acl = acl;
    }

    public PrincipalCollectionSet getPrincipalCollectionSet() {
        return this.principalCollectionSet;
    }

    public void setPrincipalCollectionSet(PrincipalCollectionSet principalCollectionSet) {
        this.principalCollectionSet = principalCollectionSet;
    }

    public PrincipalURL getPrincipalURL() {
        return this.principalURL;
    }

    public void setPrincipalURL(PrincipalURL principalURL) {
        this.principalURL = principalURL;
    }

    public void setCurrentUserPrivilegeSet(CurrentUserPrivilegeSet currentUserPrivilegeSet) {
        this.currentUserPrivilegeSet = currentUserPrivilegeSet;
    }

    public CurrentUserPrivilegeSet getCurrentUserPrivilegeSet() {
        return this.currentUserPrivilegeSet;
    }
}
