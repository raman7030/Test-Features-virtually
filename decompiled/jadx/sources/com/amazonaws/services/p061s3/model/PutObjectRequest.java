package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class PutObjectRequest extends AbstractPutObjectRequest implements Serializable {

    /* JADX INFO: renamed from: ۟ */
    public boolean f1810;

    public PutObjectRequest(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        super(str, str2, inputStream, objectMetadata);
    }

    @Override // com.amazonaws.services.p061s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public final AmazonWebServiceRequest mo55493clone() {
        PutObjectRequest putObjectRequest = (PutObjectRequest) super.mo55493clone();
        m1675(putObjectRequest);
        return putObjectRequest;
    }

    @Override // com.amazonaws.services.p061s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public final AbstractPutObjectRequest mo55493clone() {
        PutObjectRequest putObjectRequest = (PutObjectRequest) super.mo55493clone();
        m1675(putObjectRequest);
        return putObjectRequest;
    }

    @Override // com.amazonaws.services.p061s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public final Object mo55493clone() {
        PutObjectRequest putObjectRequest = (PutObjectRequest) super.mo55493clone();
        m1675(putObjectRequest);
        return putObjectRequest;
    }

    @Override // com.amazonaws.services.p061s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractPutObjectRequest mo1683(String str) {
        super.mo1683(str);
        return this;
    }

    @Override // com.amazonaws.services.p061s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ۧ */
    public final AbstractPutObjectRequest mo1674(ObjectMetadata objectMetadata) {
        super.mo1674(objectMetadata);
        return this;
    }

    @Override // com.amazonaws.services.p061s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ۧ */
    public final AbstractPutObjectRequest mo1673(CannedAccessControlList cannedAccessControlList) {
        super.mo1673(cannedAccessControlList);
        return this;
    }

    @Override // com.amazonaws.services.p061s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ֫ */
    public final AbstractPutObjectRequest mo1663(InputStream inputStream) {
        super.mo1663(inputStream);
        return this;
    }

    @Override // com.amazonaws.services.p061s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ܽ */
    public final AbstractPutObjectRequest mo1681(String str) {
        super.mo1681(str);
        return this;
    }

    @Override // com.amazonaws.services.p061s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ۧ */
    public final AbstractPutObjectRequest mo1676(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        super.mo1676(sSEAwsKeyManagementParams);
        return this;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m1814() {
        return this.f1810;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1813(boolean z) {
        this.f1810 = z;
    }
}
