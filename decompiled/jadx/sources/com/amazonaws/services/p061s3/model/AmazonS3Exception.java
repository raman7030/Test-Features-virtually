package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonServiceException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AmazonS3Exception extends AmazonServiceException implements Serializable {
    public static final long serialVersionUID = 7573680383273658477L;

    /* JADX INFO: renamed from: ۫ */
    public String f1696;

    /* JADX INFO: renamed from: ۬ */
    public HashMap f1697;

    /* JADX INFO: renamed from: ܿ */
    public final void m1691(String str) {
        this.f1696 = str;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Map m1690() {
        return this.f1697;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1689(HashMap map) {
        this.f1697 = map;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ", S3 Extended Request ID: " + this.f1696;
    }
}
