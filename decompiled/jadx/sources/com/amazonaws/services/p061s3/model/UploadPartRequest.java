package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class UploadPartRequest extends AmazonWebServiceRequest implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ */
    public long f1832;

    /* JADX INFO: renamed from: ۙ */
    public File f1833;

    /* JADX INFO: renamed from: ۛ */
    public int f1834;

    /* JADX INFO: renamed from: ۤ */
    public String f1835;

    /* JADX INFO: renamed from: ۨ */
    public long f1836;

    /* JADX INFO: renamed from: ۫ */
    public transient InputStream f1837;

    /* JADX INFO: renamed from: ۬ */
    public int f1838;

    /* JADX INFO: renamed from: ᩶ */
    public String f1839;

    /* JADX INFO: renamed from: ᩺ */
    public String f1840;

    /* JADX INFO: renamed from: ܳ */
    public final int m1849() {
        return this.f1838;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1839(int i) {
        this.f1838 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1842(InputStream inputStream) {
        this.f1837 = inputStream;
    }

    /* JADX INFO: renamed from: ۜ */
    public final InputStream m1844() {
        return this.f1837;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1855() {
        return this.f1839;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1843(String str) {
        this.f1839 = str;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m1856() {
        return this.f1835;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1848(String str) {
        this.f1835 = str;
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m1851() {
        return this.f1840;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m1853(String str) {
        this.f1840 = str;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m1846() {
        return this.f1834;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m1852(int i) {
        this.f1834 = i;
    }

    /* JADX INFO: renamed from: ۡ */
    public final long m1845() {
        return this.f1836;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1847(long j) {
        this.f1836 = j;
    }

    /* JADX INFO: renamed from: ܶۧ */
    public final File m1850() {
        return this.f1833;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1841(File file) {
        this.f1833 = file;
    }

    /* JADX INFO: renamed from: ܿ */
    public final long m1854() {
        return this.f1832;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1840(long j) {
        this.f1832 = j;
    }
}
