package com.amazonaws.services.p061s3.model;

/* JADX INFO: loaded from: classes.dex */
public class Grant {

    /* JADX INFO: renamed from: ֫ */
    public Grantee f1758;

    /* JADX INFO: renamed from: ۧ */
    public Permission f1759;

    public Grant(Grantee grantee, Permission permission) {
        this.f1758 = grantee;
        this.f1759 = permission;
    }

    public final int hashCode() {
        Grantee grantee = this.f1758;
        int iHashCode = ((grantee == null ? 0 : grantee.hashCode()) + 31) * 31;
        Permission permission = this.f1759;
        return iHashCode + (permission != null ? permission.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant grant = (Grant) obj;
        Grantee grantee = grant.f1758;
        Grantee grantee2 = this.f1758;
        if (grantee2 == null) {
            if (grantee != null) {
                return false;
            }
        } else if (!grantee2.equals(grantee)) {
            return false;
        }
        return this.f1759 == grant.f1759;
    }

    public final String toString() {
        return "Grant [grantee=" + this.f1758 + ", permission=" + this.f1759 + "]";
    }
}
