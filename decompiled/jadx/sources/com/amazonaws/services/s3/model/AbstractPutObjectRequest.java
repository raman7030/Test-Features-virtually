package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public File f523;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CannedAccessControlList f524;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f525;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f526;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public SSEAwsKeyManagementParams f527;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f528;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InputStream f529;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ObjectTagging f530;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f531;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f532;

    public AbstractPutObjectRequest(File file, String str, String str2) {
        this.f531 = str;
        this.f528 = str2;
        this.f523 = file;
    }

    public AbstractPutObjectRequest(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        this.f531 = str;
        this.f528 = str2;
        this.f529 = inputStream;
        this.f526 = objectMetadata;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m518() {
        return this.f531;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m504() {
        return this.f528;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m514() {
        return this.f532;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m511(String str) {
        this.f532 = str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo517(String str) {
        this.f532 = str;
        return this;
    }

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final File m513() {
        return this.f523;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ObjectMetadata m519() {
        return this.f526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m499(ObjectMetadata objectMetadata) {
        this.f526 = objectMetadata;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo508(ObjectMetadata objectMetadata) {
        this.f526 = objectMetadata;
        return this;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CannedAccessControlList m516() {
        return this.f524;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m498(CannedAccessControlList cannedAccessControlList) {
        this.f524 = cannedAccessControlList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo507(CannedAccessControlList cannedAccessControlList) {
        this.f524 = cannedAccessControlList;
        return this;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InputStream m512() {
        return this.f529;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo497(InputStream inputStream) {
        this.f529 = inputStream;
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m502(String str) {
        this.f525 = str;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m506() {
        return this.f525;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo515(String str) {
        this.f525 = str;
        return this;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ObjectTagging m503() {
        return this.f530;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m500(ObjectTagging objectTagging) {
        this.f530 = objectTagging;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final SSEAwsKeyManagementParams m505() {
        return this.f527;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m501(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f527 = sSEAwsKeyManagementParams;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo510(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f527 = sSEAwsKeyManagementParams;
        return this;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public AbstractPutObjectRequest mo162clone() {
        return (AbstractPutObjectRequest) super.mo162clone();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractPutObjectRequest m509(PutObjectRequest putObjectRequest) {
        m160(putObjectRequest);
        ObjectMetadata objectMetadata = this.f526;
        putObjectRequest.mo507(this.f524);
        putObjectRequest.mo497(this.f529);
        putObjectRequest.mo508(objectMetadata == null ? null : objectMetadata.m639clone());
        putObjectRequest.mo515(this.f525);
        putObjectRequest.mo517(this.f532);
        putObjectRequest.mo510(this.f527);
        return putObjectRequest;
    }
}
