package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public enum AWSServiceMetrics implements MetricType {
    HttpClientGetConnectionTime("HttpClient");


    /* JADX INFO: renamed from: ᩸ */
    public final String f1981;

    AWSServiceMetrics(String str) {
        this.f1981 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m1902() {
        return this.f1981;
    }
}
