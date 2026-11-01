package com.amazonaws.services.p061s3.model;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectSummary {

    /* JADX INFO: renamed from: ֫ */
    public String f1817;

    /* JADX INFO: renamed from: ۧ */
    public String f1818;

    /* JADX INFO: renamed from: ܳ */
    public long f1819;

    /* JADX INFO: renamed from: ܽ */
    public String f1820;

    /* JADX INFO: renamed from: ܿ */
    public Owner f1821;

    /* JADX INFO: renamed from: ᩳ */
    public Date f1822;

    /* JADX INFO: renamed from: ᩻ */
    public String f1823;

    /* JADX INFO: renamed from: ֫ */
    public final void m1827(String str) {
        this.f1817 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m1824() {
        return this.f1820;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m1832(String str) {
        this.f1820 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1830(String str) {
        this.f1818 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m1831() {
        return this.f1819;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1825(long j) {
        this.f1819 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Date m1829() {
        return this.f1822;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1828(Date date) {
        this.f1822 = date;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1826(Owner owner) {
        this.f1821 = owner;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m1833(String str) {
        this.f1823 = str;
    }

    public final String toString() {
        return "S3ObjectSummary{bucketName='" + this.f1817 + "', key='" + this.f1820 + "', eTag='" + this.f1818 + "', size=" + this.f1819 + ", lastModified=" + this.f1822 + ", storageClass='" + this.f1823 + "', owner=" + this.f1821 + '}';
    }
}
