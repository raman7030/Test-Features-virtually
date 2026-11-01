package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AWSRequestMetrics {

    /* JADX INFO: renamed from: ֫ */
    public final TimingInfo f1954;

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

    /* JADX INFO: renamed from: ֫ */
    public void mo1897(Field field) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1898(Field field, long j) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1899(Field field, Serializable serializable) {
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo1900(Field field) {
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo1901(Field field) {
    }

    public AWSRequestMetrics() {
        System.currentTimeMillis();
        this.f1954 = new TimingInfo(System.nanoTime(), null);
    }

    public AWSRequestMetrics(TimingInfo timingInfo) {
        this.f1954 = timingInfo;
    }

    /* JADX INFO: renamed from: ֫ */
    public final TimingInfo m1896() {
        return this.f1954;
    }
}
