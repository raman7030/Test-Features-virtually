package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f584;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f585;

    public DeleteObjectRequest(String str, String str2) {
        this.f585 = str;
        this.f584 = str2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m559() {
        return this.f585;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m558() {
        return this.f584;
    }
}
