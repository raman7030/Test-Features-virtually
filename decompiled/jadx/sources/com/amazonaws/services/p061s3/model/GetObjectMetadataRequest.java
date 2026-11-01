package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class GetObjectMetadataRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۙ */
    public String f1751;

    /* JADX INFO: renamed from: ᩶ */
    public String f1752;

    public GetObjectMetadataRequest(String str, String str2) {
        this.f1752 = str;
        this.f1751 = str2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1733() {
        return this.f1752;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m1732() {
        return this.f1751;
    }
}
