package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.event.ProgressListener;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GetObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f1753;

    /* JADX INFO: renamed from: ۙ */
    public ArrayList f1754;

    /* JADX INFO: renamed from: ۫ */
    public S3ObjectIdBuilder f1755;

    /* JADX INFO: renamed from: ۬ */
    public long[] f1756;

    /* JADX INFO: renamed from: ᩶ */
    public ProgressListener f1757;

    public GetObjectRequest(String str, String str2) {
        S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();
        this.f1755 = s3ObjectIdBuilder;
        this.f1754 = new ArrayList();
        this.f1753 = new ArrayList();
        s3ObjectIdBuilder.m1821(str);
        s3ObjectIdBuilder.m1823(str2);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1739() {
        return this.f1755.m1820();
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m1738() {
        return this.f1755.m1822();
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m1736() {
        this.f1755.getClass();
        return null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long[] m1740() {
        long[] jArr = this.f1756;
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1734(long j, long j2) {
        this.f1756 = new long[]{j, j2};
    }

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList m1737() {
        return this.f1754;
    }

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList m1735() {
        return this.f1753;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: ֫ */
    public final void mo1326(ProgressListener progressListener) {
        this.f1757 = progressListener;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: ֫ */
    public final ProgressListener mo1325() {
        return this.f1757;
    }
}
