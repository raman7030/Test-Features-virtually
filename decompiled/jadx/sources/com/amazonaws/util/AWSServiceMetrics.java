package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public enum AWSServiceMetrics implements MetricType {
    HttpClientGetConnectionTime("HttpClient");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f821;

    AWSServiceMetrics(String str) {
        this.f821 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m737() {
        return this.f821;
    }
}
