package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۙ */
    public String f1744;

    /* JADX INFO: renamed from: ᩶ */
    public String f1745;

    public DeleteObjectRequest(String str, String str2) {
        this.f1745 = str;
        this.f1744 = str2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1725() {
        return this.f1745;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m1724() {
        return this.f1744;
    }
}
