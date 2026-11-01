package com.amazonaws.services.p061s3.metrics;

import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.SimpleMetricType;
import com.amazonaws.metrics.ThroughputMetricType;

/* JADX INFO: loaded from: classes.dex */
public class S3ServiceMetric extends SimpleMetricType implements MetricType {

    /* JADX INFO: renamed from: ᩶ */
    public static final S3ServiceMetric[] f1676;

    /* JADX INFO: renamed from: ᩹ */
    public static final C02751 f1677;

    /* JADX INFO: renamed from: ᩸ */
    public final String f1678;

    /* JADX INFO: renamed from: com.amazonaws.services.s3.metrics.S3ServiceMetric$1 */
    /* JADX INFO: loaded from: classes2.dex */
    public final class C02751 extends S3ThroughputMetric {
    }

    /* JADX INFO: renamed from: com.amazonaws.services.s3.metrics.S3ServiceMetric$2 */
    /* JADX INFO: loaded from: classes2.dex */
    public final class C02762 extends S3ThroughputMetric {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public abstract class S3ThroughputMetric extends S3ServiceMetric implements ThroughputMetricType {
    }

    static {
        C02751 c02751 = new C02751("S3".concat("DownloadThroughput"));
        f1677 = c02751;
        f1676 = new S3ServiceMetric[]{c02751, new S3ServiceMetric("S3".concat("DownloadByteCount")), new C02762("S3".concat("UploadThroughput")), new S3ServiceMetric("S3".concat("UploadByteCount"))};
    }

    public S3ServiceMetric(String str) {
        this.f1678 = str;
    }

    @Override // com.amazonaws.metrics.MetricType
    public final String name() {
        return this.f1678;
    }

    /* JADX INFO: renamed from: ֫ */
    public static S3ServiceMetric[] m1658() {
        return (S3ServiceMetric[]) f1676.clone();
    }
}
