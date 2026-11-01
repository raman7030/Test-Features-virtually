package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f1728;

    /* JADX INFO: renamed from: ۙ */
    public String f1729;

    /* JADX INFO: renamed from: ۬ */
    public String f1730;

    /* JADX INFO: renamed from: ᩶ */
    public String f1731;

    public CompleteMultipartUploadRequest(String str, String str2, String str3, ArrayList arrayList) {
        new ArrayList();
        this.f1731 = str;
        this.f1729 = str2;
        this.f1730 = str3;
        this.f1728 = arrayList;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1709() {
        return this.f1731;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m1708() {
        return this.f1729;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m1706() {
        return this.f1730;
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m1707() {
        return this.f1728;
    }
}
