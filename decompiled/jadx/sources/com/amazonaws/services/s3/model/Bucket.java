package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class Bucket implements Serializable {
    public static final long serialVersionUID = -8646831898339939580L;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f540 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Owner f538 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Date f539 = null;

    public final String toString() {
        return "S3Bucket [name=" + this.f540 + ", creationDate=" + this.f539 + ", owner=" + this.f538 + "]";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m526(Owner owner) {
        this.f538 = owner;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m528(Date date) {
        this.f539 = date;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m527(String str) {
        this.f540 = str;
    }
}
