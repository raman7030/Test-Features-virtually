package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class GetObjectMetadataRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f592;

    public GetObjectMetadataRequest(String str, String str2) {
        this.f592 = str;
        this.f591 = str2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m567() {
        return this.f592;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m566() {
        return this.f591;
    }
}
