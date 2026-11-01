package com.amazonaws.services.p061s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CanonicalGrantee implements Grantee, Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public String f1727 = null;

    @Override // com.amazonaws.services.p061s3.model.Grantee
    /* JADX INFO: renamed from: ֫ */
    public final void mo1705(String str) {
        this.f1727 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            return this.f1727.equals(((CanonicalGrantee) obj).f1727);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1727.hashCode();
    }
}
