package com.amazonaws.metrics;

import com.amazonaws.services.p061s3.metrics.S3ServiceMetric;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleMetricType implements MetricType {
    public final int hashCode() {
        return ((S3ServiceMetric) this).name().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MetricType) {
            return ((S3ServiceMetric) this).name().equals(((MetricType) obj).name());
        }
        return false;
    }

    public final String toString() {
        return ((S3ServiceMetric) this).name();
    }
}
