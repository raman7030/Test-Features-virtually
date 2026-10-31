package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public class EmailAddressGrantee implements Grantee {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f590 = null;

    @Override // com.amazonaws.services.s3.model.Grantee
    /* JADX INFO: renamed from: ֫ */
    public final void mo539(String str) {
        this.f590 = str;
    }

    public final int hashCode() {
        String str = this.f590;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailAddressGrantee emailAddressGrantee = (EmailAddressGrantee) obj;
        String str = this.f590;
        if (str == null) {
            if (emailAddressGrantee.f590 != null) {
                return false;
            }
        } else if (!str.equals(emailAddressGrantee.f590)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f590;
    }
}
