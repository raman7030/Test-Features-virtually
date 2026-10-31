package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CopyObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f573;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f574;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f575;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f577;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f572 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f576 = new ArrayList();

    public CopyObjectRequest(String str, String str2, String str3, String str4) {
        this.f575 = str;
        this.f574 = str2;
        this.f577 = str3;
        this.f573 = str4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m549() {
        return this.f575;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m545() {
        return this.f574;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m548() {
        return this.f577;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m547() {
        return this.f573;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m546() {
        return this.f572;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m544() {
        return this.f576;
    }
}
