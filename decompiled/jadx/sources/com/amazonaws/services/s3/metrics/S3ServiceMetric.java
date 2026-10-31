package com.amazonaws.services.s3.metrics;

import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.SimpleMetricType;
import com.amazonaws.metrics.ThroughputMetricType;

/* JADX INFO: loaded from: classes.dex */
public class S3ServiceMetric extends SimpleMetricType implements MetricType {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final S3ServiceMetric[] f516;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AnonymousClass1 f517;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f518;

    /* JADX INFO: renamed from: com.amazonaws.services.s3.metrics.S3ServiceMetric$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final class AnonymousClass1 extends S3ThroughputMetric {
    }

    /* JADX INFO: renamed from: com.amazonaws.services.s3.metrics.S3ServiceMetric$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final class AnonymousClass2 extends S3ThroughputMetric {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public abstract class S3ThroughputMetric extends S3ServiceMetric implements ThroughputMetricType {
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("S3".concat("DownloadThroughput"));
        f517 = anonymousClass1;
        f516 = new S3ServiceMetric[]{anonymousClass1, new S3ServiceMetric("S3".concat("DownloadByteCount")), new AnonymousClass2("S3".concat("UploadThroughput")), new S3ServiceMetric("S3".concat("UploadByteCount"))};
    }

    public S3ServiceMetric(String str) {
        this.f518 = str;
    }

    @Override // com.amazonaws.metrics.MetricType
    public final String name() {
        return this.f518;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static S3ServiceMetric[] m492() {
        return (S3ServiceMetric[]) f516.clone();
    }
}
