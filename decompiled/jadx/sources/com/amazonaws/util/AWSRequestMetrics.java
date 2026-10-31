package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AWSRequestMetrics {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TimingInfo f794;

    public enum Field implements MetricType {
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        ClientExecuteTime,
        CredentialsRequestTime,
        Exception,
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        RequestSigningTime,
        ResponseProcessingTime,
        RequestCount,
        RetryCount,
        HttpClientRetryCount,
        HttpClientSendRequestTime,
        HttpClientReceiveResponseTime,
        RetryPauseTime,
        ServiceEndpoint,
        ServiceName,
        StatusCode
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo732(Field field) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo733(Field field, long j) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo734(Field field, Serializable serializable) {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo735(Field field) {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo736(Field field) {
    }

    public AWSRequestMetrics() {
        System.currentTimeMillis();
        this.f794 = new TimingInfo(System.nanoTime(), null);
    }

    public AWSRequestMetrics(TimingInfo timingInfo) {
        this.f794 = timingInfo;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TimingInfo m731() {
        return this.f794;
    }
}
