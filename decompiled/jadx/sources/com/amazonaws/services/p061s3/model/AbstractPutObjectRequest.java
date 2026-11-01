package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۗ */
    public File f1683;

    /* JADX INFO: renamed from: ۙ */
    public CannedAccessControlList f1684;

    /* JADX INFO: renamed from: ۛ */
    public String f1685;

    /* JADX INFO: renamed from: ۤ */
    public ObjectMetadata f1686;

    /* JADX INFO: renamed from: ۨ */
    public SSEAwsKeyManagementParams f1687;

    /* JADX INFO: renamed from: ۫ */
    public String f1688;

    /* JADX INFO: renamed from: ۬ */
    public transient InputStream f1689;

    /* JADX INFO: renamed from: ܰ */
    public ObjectTagging f1690;

    /* JADX INFO: renamed from: ᩶ */
    public String f1691;

    /* JADX INFO: renamed from: ᩺ */
    public String f1692;

    public AbstractPutObjectRequest(File file, String str, String str2) {
        this.f1691 = str;
        this.f1688 = str2;
        this.f1683 = file;
    }

    public AbstractPutObjectRequest(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        this.f1691 = str;
        this.f1688 = str2;
        this.f1689 = inputStream;
        this.f1686 = objectMetadata;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1684() {
        return this.f1691;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m1670() {
        return this.f1688;
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m1680() {
        return this.f1692;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1677(String str) {
        this.f1692 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractPutObjectRequest mo1683(String str) {
        this.f1692 = str;
        return this;
    }

    /* JADX INFO: renamed from: ܶۧ */
    public final File m1679() {
        return this.f1683;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final ObjectMetadata m1685() {
        return this.f1686;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1665(ObjectMetadata objectMetadata) {
        this.f1686 = objectMetadata;
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractPutObjectRequest mo1674(ObjectMetadata objectMetadata) {
        this.f1686 = objectMetadata;
        return this;
    }

    /* JADX INFO: renamed from: ܿ */
    public final CannedAccessControlList m1682() {
        return this.f1684;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1664(CannedAccessControlList cannedAccessControlList) {
        this.f1684 = cannedAccessControlList;
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractPutObjectRequest mo1673(CannedAccessControlList cannedAccessControlList) {
        this.f1684 = cannedAccessControlList;
        return this;
    }

    /* JADX INFO: renamed from: ܳ */
    public final InputStream m1678() {
        return this.f1689;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractPutObjectRequest mo1663(InputStream inputStream) {
        this.f1689 = inputStream;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1668(String str) {
        this.f1685 = str;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m1672() {
        return this.f1685;
    }

    /* JADX INFO: renamed from: ܽ */
    public AbstractPutObjectRequest mo1681(String str) {
        this.f1685 = str;
        return this;
    }

    /* JADX INFO: renamed from: ۖ */
    public final ObjectTagging m1669() {
        return this.f1690;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1666(ObjectTagging objectTagging) {
        this.f1690 = objectTagging;
    }

    /* JADX INFO: renamed from: ۡ */
    public final SSEAwsKeyManagementParams m1671() {
        return this.f1687;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1667(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f1687 = sSEAwsKeyManagementParams;
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractPutObjectRequest mo1676(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f1687 = sSEAwsKeyManagementParams;
        return this;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public AbstractPutObjectRequest mo55493clone() {
        return (AbstractPutObjectRequest) super.mo55493clone();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractPutObjectRequest m1675(PutObjectRequest putObjectRequest) {
        m1327(putObjectRequest);
        ObjectMetadata objectMetadata = this.f1686;
        putObjectRequest.mo1673(this.f1684);
        putObjectRequest.mo1663(this.f1689);
        putObjectRequest.mo1674(objectMetadata == null ? null : objectMetadata.m55494clone());
        putObjectRequest.mo1681(this.f1685);
        putObjectRequest.mo1683(this.f1692);
        putObjectRequest.mo1676(this.f1687);
        return putObjectRequest;
    }
}
