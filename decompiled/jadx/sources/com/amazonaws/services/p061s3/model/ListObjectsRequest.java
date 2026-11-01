package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public class ListObjectsRequest extends AmazonWebServiceRequest {

    /* JADX INFO: renamed from: ۗ */
    public String f1776;

    /* JADX INFO: renamed from: ۙ */
    public String f1777;

    /* JADX INFO: renamed from: ۫ */
    public String f1778;

    /* JADX INFO: renamed from: ۬ */
    public Integer f1779;

    /* JADX INFO: renamed from: ᩶ */
    public String f1780;

    public ListObjectsRequest(String str, String str2, String str3, String str4, Integer num) {
        this.f1780 = str;
        this.f1778 = str2;
        this.f1776 = str3;
        this.f1777 = str4;
        this.f1779 = num;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1765() {
        return this.f1780;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m1766() {
        return this.f1778;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m1763() {
        return this.f1776;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m1764() {
        return this.f1777;
    }

    /* JADX INFO: renamed from: ۜ */
    public final Integer m1762() {
        return this.f1779;
    }
}
