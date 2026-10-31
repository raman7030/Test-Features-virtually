package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.util.DateUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import l.C20195;

/* JADX INFO: loaded from: classes.dex */
public class ObjectMetadata implements ServerSideEncryptionResult, S3RequesterChargedResult, ObjectExpirationResult, ObjectRestoreResult, Cloneable, Serializable {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String f630;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Map f631;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Date f632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TreeMap f633;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Date f634;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Date f635;

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ܽ */
    public final void mo469(String str) {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    /* JADX INFO: renamed from: ܽ */
    public final void mo472(boolean z) {
    }

    static {
        SSEAlgorithm.AES256.getAlgorithm();
        f630 = SSEAlgorithm.KMS.getAlgorithm();
    }

    public ObjectMetadata() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f631 = new TreeMap(comparator);
        this.f633 = new TreeMap(comparator);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Map m635() {
        return this.f631;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m620(Map map) {
        this.f631 = map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m617(Object obj, String str) {
        this.f633.put(str, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m619(String str, String str2) {
        this.f631.put(str, str2);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Map m627() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(this.f633);
        return C20195.unmodifiableMap(treeMap);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Object m626() {
        return this.f633.get("Content-Length");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m615() {
        Long l2 = (Long) this.f633.get("Content-Length");
        if (l2 == null) {
            return 0L;
        }
        return l2.longValue();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m636() {
        int iLastIndexOf;
        String str = (String) this.f633.get("Content-Range");
        if (str != null && (iLastIndexOf = str.lastIndexOf("/")) >= 0) {
            return Long.parseLong(str.substring(iLastIndexOf + 1));
        }
        return m615();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m616(long j) {
        this.f633.put("Content-Length", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m634() {
        return (String) this.f633.get("Content-Type");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m637(String str) {
        this.f633.put("Content-Type", str);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m638(String str) {
        this.f633.put("Content-Encoding", str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m618(String str) {
        this.f633.put("Cache-Control", str);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m625(String str) {
        TreeMap treeMap = this.f633;
        if (str == null) {
            treeMap.remove("Content-MD5");
        } else {
            treeMap.put("Content-MD5", str);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m631() {
        return (String) this.f633.get("Content-MD5");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m629(String str) {
        this.f633.put("Content-Disposition", str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m633() {
        return (String) this.f633.get("ETag");
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m614() {
        return (String) this.f633.get("x-amz-version-id");
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m630() {
        return (String) this.f633.get("x-amz-server-side-encryption");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩳ */
    public final void mo485(String str) {
        this.f633.put("x-amz-server-side-encryption", str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m621() {
        return (String) this.f633.get("x-amz-server-side-encryption-customer-algorithm");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ۧ */
    public final void mo482(String str) {
        this.f633.put("x-amz-server-side-encryption-customer-algorithm", str);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m622() {
        return (String) this.f633.get("x-amz-server-side-encryption-customer-key-MD5");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ܿ */
    public final void mo484(String str) {
        this.f633.put("x-amz-server-side-encryption-customer-key-MD5", str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Date m628() {
        return DateUtils.m770(this.f634);
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo468(Date date) {
        this.f634 = date;
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    /* JADX INFO: renamed from: ۧ */
    public final void mo471(Date date) {
        this.f632 = date;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m632(Date date) {
        this.f635 = date;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Date m624() {
        return DateUtils.m770(this.f635);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final ObjectMetadata m639clone() {
        TreeMap treeMap = this.f633;
        ObjectMetadata objectMetadata = new ObjectMetadata();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        objectMetadata.f631 = new TreeMap(comparator);
        objectMetadata.f633 = new TreeMap(comparator);
        objectMetadata.f631 = this.f631 == null ? null : new TreeMap(this.f631);
        objectMetadata.f633 = treeMap != null ? new TreeMap((Map) treeMap) : null;
        objectMetadata.f634 = DateUtils.m770(this.f634);
        objectMetadata.f635 = DateUtils.m770(this.f635);
        objectMetadata.f632 = DateUtils.m770(this.f632);
        return objectMetadata;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m623() {
        return this.f633.get("x-amz-request-charged") != null;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo465(boolean z) {
        if (z) {
            this.f633.put("x-amz-request-charged", "requester");
        }
    }
}
