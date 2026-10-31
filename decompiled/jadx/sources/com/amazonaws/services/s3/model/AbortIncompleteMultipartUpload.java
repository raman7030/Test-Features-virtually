package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class AbortIncompleteMultipartUpload implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f519;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m493(int i) {
        this.f519 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f519 == ((AbortIncompleteMultipartUpload) obj).f519;
    }

    public final int hashCode() {
        return this.f519;
    }

    public final Object clone() {
        try {
            return (AbortIncompleteMultipartUpload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
        }
    }
}
