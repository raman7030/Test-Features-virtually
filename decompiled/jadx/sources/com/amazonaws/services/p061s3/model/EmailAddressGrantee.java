package com.amazonaws.services.p061s3.model;

/* JADX INFO: loaded from: classes.dex */
public class EmailAddressGrantee implements Grantee {

    /* JADX INFO: renamed from: ᩸ */
    public String f1750 = null;

    @Override // com.amazonaws.services.p061s3.model.Grantee
    /* JADX INFO: renamed from: ֫ */
    public final void mo1705(String str) {
        this.f1750 = str;
    }

    public final int hashCode() {
        String str = this.f1750;
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
        String str = this.f1750;
        if (str == null) {
            if (emailAddressGrantee.f1750 != null) {
                return false;
            }
        } else if (!str.equals(emailAddressGrantee.f1750)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f1750;
    }
}
