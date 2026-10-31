package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f568;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f569;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f570;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f571;

    public CompleteMultipartUploadRequest(String str, String str2, String str3, ArrayList arrayList) {
        new ArrayList();
        this.f571 = str;
        this.f569 = str2;
        this.f570 = str3;
        this.f568 = arrayList;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m543() {
        return this.f571;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m542() {
        return this.f569;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m540() {
        return this.f570;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m541() {
        return this.f568;
    }
}
