package com.amazonaws.metrics;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class MetricFilterInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final ByteThroughputHelper f1434;

    @Override // com.amazonaws.internal.SdkFilterInputStream, com.amazonaws.internal.MetricAware
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1445() {
        return true;
    }

    public MetricFilterInputStream(ThroughputMetricType throughputMetricType, InputStream inputStream) {
        super(inputStream);
        this.f1434 = new ByteThroughputHelper(throughputMetricType);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        m1447();
        ByteThroughputHelper byteThroughputHelper = this.f1434;
        byteThroughputHelper.getClass();
        if (TimeUnit.NANOSECONDS.toSeconds(byteThroughputHelper.m1516()) > 10 && byteThroughputHelper.m1515() > 0) {
            AwsSdkMetrics.m1505().getClass();
            byteThroughputHelper.m1517();
        }
        long jNanoTime = System.nanoTime();
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 > 0) {
            this.f1434.mo1514(i3, jNanoTime);
        }
        return i3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ByteThroughputHelper byteThroughputHelper = this.f1434;
        if (byteThroughputHelper.m1515() > 0) {
            AwsSdkMetrics.m1505().getClass();
            byteThroughputHelper.m1517();
        }
        ((FilterInputStream) this).in.close();
        m1447();
    }
}
