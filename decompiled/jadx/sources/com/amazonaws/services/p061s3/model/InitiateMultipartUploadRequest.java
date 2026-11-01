package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class InitiateMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۗ */
    public String f1766;

    /* JADX INFO: renamed from: ۙ */
    public CannedAccessControlList f1767;

    /* JADX INFO: renamed from: ۤ */
    public ObjectTagging f1768;

    /* JADX INFO: renamed from: ۫ */
    public SSEAwsKeyManagementParams f1769;

    /* JADX INFO: renamed from: ۬ */
    public ObjectMetadata f1770;

    /* JADX INFO: renamed from: ᩶ */
    public String f1771;

    public InitiateMultipartUploadRequest(String str, String str2) {
        this.f1771 = str;
        this.f1766 = str2;
    }

    public InitiateMultipartUploadRequest(String str, String str2, ObjectMetadata objectMetadata) {
        this.f1771 = str;
        this.f1766 = str2;
        this.f1770 = objectMetadata;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1752() {
        return this.f1771;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m1750() {
        return this.f1766;
    }

    /* JADX INFO: renamed from: ܿ */
    public final CannedAccessControlList m1751() {
        return this.f1767;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1746(CannedAccessControlList cannedAccessControlList) {
        this.f1767 = cannedAccessControlList;
    }

    /* JADX INFO: renamed from: ۜ */
    public final SSEAwsKeyManagementParams m1749() {
        return this.f1769;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1748(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f1769 = sSEAwsKeyManagementParams;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final ObjectTagging m1753() {
        return this.f1768;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1747(ObjectTagging objectTagging) {
        this.f1768 = objectTagging;
    }
}
