package com.amazonaws.services.p061s3.model;

import com.amazonaws.services.p061s3.internal.S3RequesterChargedResult;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AccessControlList implements Serializable, S3RequesterChargedResult {
    public static final long serialVersionUID = 8095040648034788376L;

    /* JADX INFO: renamed from: ᩶ */
    public Owner f1693 = null;

    /* JADX INFO: renamed from: ᩸ */
    public LinkedList f1694;

    /* JADX INFO: renamed from: ᩹ */
    public HashSet f1695;

    @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1631(boolean z) {
    }

    /* JADX INFO: renamed from: ۧ */
    public final Owner m1688() {
        return this.f1693;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1687(Owner owner) {
        this.f1693 = owner;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m1686() {
        HashSet hashSet = this.f1695;
        if (hashSet != null && this.f1694 != null) {
            throw new IllegalStateException("Both grant set and grant list cannot be null");
        }
        if (this.f1694 == null) {
            if (hashSet == null) {
                this.f1694 = new LinkedList();
            } else {
                this.f1694 = new LinkedList(this.f1695);
                this.f1695 = null;
            }
        }
        return this.f1694;
    }

    public final int hashCode() {
        Owner owner = this.f1693;
        int iHashCode = ((owner == null ? 0 : owner.hashCode()) + 31) * 31;
        HashSet hashSet = this.f1695;
        int iHashCode2 = (iHashCode + (hashSet == null ? 0 : hashSet.hashCode())) * 31;
        LinkedList linkedList = this.f1694;
        return iHashCode2 + (linkedList != null ? linkedList.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlList accessControlList = (AccessControlList) obj;
        Owner owner = this.f1693;
        if (owner == null) {
            if (accessControlList.f1693 != null) {
                return false;
            }
        } else if (!owner.equals(accessControlList.f1693)) {
            return false;
        }
        HashSet hashSet = this.f1695;
        if (hashSet == null) {
            if (accessControlList.f1695 != null) {
                return false;
            }
        } else if (!hashSet.equals(accessControlList.f1695)) {
            return false;
        }
        LinkedList linkedList = this.f1694;
        if (linkedList == null) {
            return accessControlList.f1694 == null;
        }
        return linkedList.equals(accessControlList.f1694);
    }

    public final String toString() {
        return "AccessControlList [owner=" + this.f1693 + ", grants=" + m1686() + "]";
    }
}
