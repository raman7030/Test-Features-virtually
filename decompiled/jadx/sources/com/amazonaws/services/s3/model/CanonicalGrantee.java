package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CanonicalGrantee implements Grantee, Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f567 = null;

    @Override // com.amazonaws.services.s3.model.Grantee
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo539(String str) {
        this.f567 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            return this.f567.equals(((CanonicalGrantee) obj).f567);
        }
        return false;
    }

    public final int hashCode() {
        return this.f567.hashCode();
    }
}
