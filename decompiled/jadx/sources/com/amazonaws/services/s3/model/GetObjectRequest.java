package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.event.ProgressListener;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GetObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f593;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f594;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public S3ObjectIdBuilder f595;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long[] f596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ProgressListener f597;

    public GetObjectRequest(String str, String str2) {
        S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();
        this.f595 = s3ObjectIdBuilder;
        this.f594 = new ArrayList();
        this.f593 = new ArrayList();
        s3ObjectIdBuilder.m656(str);
        s3ObjectIdBuilder.m658(str2);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m573() {
        return this.f595.m655();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m572() {
        return this.f595.m657();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m570() {
        this.f595.getClass();
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long[] m574() {
        long[] jArr = this.f596;
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m568(long j, long j2) {
        this.f596 = new long[]{j, j2};
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m571() {
        return this.f594;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m569() {
        return this.f593;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: ֫ */
    public final void mo159(ProgressListener progressListener) {
        this.f597 = progressListener;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: ֫ */
    public final ProgressListener mo158() {
        return this.f597;
    }
}
