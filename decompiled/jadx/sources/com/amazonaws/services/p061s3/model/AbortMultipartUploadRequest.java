package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class AbortMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۗ */
    public String f1680;

    /* JADX INFO: renamed from: ۙ */
    public String f1681;

    /* JADX INFO: renamed from: ᩶ */
    public String f1682;

    public AbortMultipartUploadRequest(String str, String str2, String str3) {
        this.f1682 = str;
        this.f1681 = str2;
        this.f1680 = str3;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1662() {
        return this.f1682;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m1661() {
        return this.f1681;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m1660() {
        return this.f1680;
    }
}
