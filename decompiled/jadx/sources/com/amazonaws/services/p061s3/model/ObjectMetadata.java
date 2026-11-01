package com.amazonaws.services.p061s3.model;

import com.amazonaws.services.p061s3.internal.ObjectExpirationResult;
import com.amazonaws.services.p061s3.internal.ObjectRestoreResult;
import com.amazonaws.services.p061s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult;
import com.amazonaws.util.DateUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public class ObjectMetadata implements ServerSideEncryptionResult, S3RequesterChargedResult, ObjectExpirationResult, ObjectRestoreResult, Cloneable, Serializable {

    /* JADX INFO: renamed from: ۬ */
    public static final String f1790;

    /* JADX INFO: renamed from: ۗ */
    public Map f1791;

    /* JADX INFO: renamed from: ۙ */
    public Date f1792;

    /* JADX INFO: renamed from: ᩶ */
    public TreeMap f1793;

    /* JADX INFO: renamed from: ᩸ */
    public Date f1794;

    /* JADX INFO: renamed from: ᩹ */
    public Date f1795;

    @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ܽ */
    public final void mo1635(String str) {
    }

    @Override // com.amazonaws.services.p061s3.internal.ObjectRestoreResult
    /* JADX INFO: renamed from: ܽ */
    public final void mo1638(boolean z) {
    }

    static {
        SSEAlgorithm.AES256.getAlgorithm();
        f1790 = SSEAlgorithm.KMS.getAlgorithm();
    }

    public ObjectMetadata() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f1791 = new TreeMap(comparator);
        this.f1793 = new TreeMap(comparator);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final Map m1801() {
        return this.f1791;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1786(Map map) {
        this.f1791 = map;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1783(Object obj, String str) {
        this.f1793.put(str, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1785(String str, String str2) {
        this.f1791.put(str, str2);
    }

    /* JADX INFO: renamed from: ۢ */
    public final Map m1793() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(this.f1793);
        return C21562.unmodifiableMap(treeMap);
    }

    /* JADX INFO: renamed from: ۡ */
    public final Object m1792() {
        return this.f1793.get("Content-Length");
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m1781() {
        Long l2 = (Long) this.f1793.get("Content-Length");
        if (l2 == null) {
            return 0L;
        }
        return l2.longValue();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m1802() {
        int iLastIndexOf;
        String str = (String) this.f1793.get("Content-Range");
        if (str != null && (iLastIndexOf = str.lastIndexOf("/")) >= 0) {
            return Long.parseLong(str.substring(iLastIndexOf + 1));
        }
        return m1781();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1782(long j) {
        this.f1793.put("Content-Length", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1800() {
        return (String) this.f1793.get("Content-Type");
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m1803(String str) {
        this.f1793.put("Content-Type", str);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m1804(String str) {
        this.f1793.put("Content-Encoding", str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1784(String str) {
        this.f1793.put("Cache-Control", str);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m1791(String str) {
        TreeMap treeMap = this.f1793;
        if (str == null) {
            treeMap.remove("Content-MD5");
        } else {
            treeMap.put("Content-MD5", str);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m1797() {
        return (String) this.f1793.get("Content-MD5");
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m1795(String str) {
        this.f1793.put("Content-Disposition", str);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m1799() {
        return (String) this.f1793.get("ETag");
    }

    /* JADX INFO: renamed from: ֡ */
    public final String m1780() {
        return (String) this.f1793.get("x-amz-version-id");
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m1796() {
        return (String) this.f1793.get("x-amz-server-side-encryption");
    }

    @Override // com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1651(String str) {
        this.f1793.put("x-amz-server-side-encryption", str);
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m1787() {
        return (String) this.f1793.get("x-amz-server-side-encryption-customer-algorithm");
    }

    @Override // com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ۧ */
    public final void mo1648(String str) {
        this.f1793.put("x-amz-server-side-encryption-customer-algorithm", str);
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m1788() {
        return (String) this.f1793.get("x-amz-server-side-encryption-customer-key-MD5");
    }

    @Override // com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ܿ */
    public final void mo1650(String str) {
        this.f1793.put("x-amz-server-side-encryption-customer-key-MD5", str);
    }

    /* JADX INFO: renamed from: ܳ */
    public final Date m1794() {
        return DateUtils.m1935(this.f1794);
    }

    @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1634(Date date) {
        this.f1794 = date;
    }

    @Override // com.amazonaws.services.p061s3.internal.ObjectRestoreResult
    /* JADX INFO: renamed from: ۧ */
    public final void mo1637(Date date) {
        this.f1792 = date;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m1798(Date date) {
        this.f1795 = date;
    }

    /* JADX INFO: renamed from: ۜ */
    public final Date m1790() {
        return DateUtils.m1935(this.f1795);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final ObjectMetadata m55494clone() {
        TreeMap treeMap = this.f1793;
        ObjectMetadata objectMetadata = new ObjectMetadata();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        objectMetadata.f1791 = new TreeMap(comparator);
        objectMetadata.f1793 = new TreeMap(comparator);
        objectMetadata.f1791 = this.f1791 == null ? null : new TreeMap(this.f1791);
        objectMetadata.f1793 = treeMap != null ? new TreeMap((Map) treeMap) : null;
        objectMetadata.f1794 = DateUtils.m1935(this.f1794);
        objectMetadata.f1795 = DateUtils.m1935(this.f1795);
        objectMetadata.f1792 = DateUtils.m1935(this.f1792);
        return objectMetadata;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m1789() {
        return this.f1793.get("x-amz-request-charged") != null;
    }

    @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1631(boolean z) {
        if (z) {
            this.f1793.put("x-amz-request-charged", "requester");
        }
    }
}
