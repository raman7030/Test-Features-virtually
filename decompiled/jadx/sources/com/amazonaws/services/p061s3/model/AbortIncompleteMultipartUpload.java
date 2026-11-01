package com.amazonaws.services.p061s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class AbortIncompleteMultipartUpload implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public int f1679;

    /* JADX INFO: renamed from: ֫ */
    public final void m1659(int i) {
        this.f1679 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f1679 == ((AbortIncompleteMultipartUpload) obj).f1679;
    }

    public final int hashCode() {
        return this.f1679;
    }

    public final Object clone() {
        try {
            return (AbortIncompleteMultipartUpload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
        }
    }
}
