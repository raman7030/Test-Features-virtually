package com.amazonaws.services.p061s3.model;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class Bucket implements Serializable {
    public static final long serialVersionUID = -8646831898339939580L;

    /* JADX INFO: renamed from: ᩹ */
    public String f1700 = null;

    /* JADX INFO: renamed from: ᩶ */
    public Owner f1698 = null;

    /* JADX INFO: renamed from: ᩸ */
    public Date f1699 = null;

    public final String toString() {
        return "S3Bucket [name=" + this.f1700 + ", creationDate=" + this.f1699 + ", owner=" + this.f1698 + "]";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1692(Owner owner) {
        this.f1698 = owner;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1694(Date date) {
        this.f1699 = date;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1693(String str) {
        this.f1700 = str;
    }
}
