package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CopyObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۙ */
    public String f1733;

    /* JADX INFO: renamed from: ۤ */
    public String f1734;

    /* JADX INFO: renamed from: ۫ */
    public String f1735;

    /* JADX INFO: renamed from: ᩶ */
    public String f1737;

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f1732 = new ArrayList();

    /* JADX INFO: renamed from: ۬ */
    public ArrayList f1736 = new ArrayList();

    public CopyObjectRequest(String str, String str2, String str3, String str4) {
        this.f1735 = str;
        this.f1734 = str2;
        this.f1737 = str3;
        this.f1733 = str4;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m1715() {
        return this.f1735;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m1711() {
        return this.f1734;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1714() {
        return this.f1737;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m1713() {
        return this.f1733;
    }

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList m1712() {
        return this.f1732;
    }

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList m1710() {
        return this.f1736;
    }
}
