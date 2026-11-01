package com.amazonaws.metrics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteThroughputProvider {

    /* JADX INFO: renamed from: ֫ */
    public int f1430;

    /* JADX INFO: renamed from: ۧ */
    public long f1431;

    /* JADX INFO: renamed from: ܽ */
    public final ThroughputMetricType f1432;

    public ByteThroughputProvider(ThroughputMetricType throughputMetricType) {
        this.f1432 = throughputMetricType;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m1515() {
        return this.f1430;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m1516() {
        return this.f1431;
    }

    public final String toString() {
        return String.format("providerId=%s, throughputType=%s, byteCount=%d, duration=%d", super.toString(), this.f1432, Integer.valueOf(this.f1430), Long.valueOf(this.f1431));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1514(int i, long j) {
        this.f1430 += i;
        this.f1431 = (System.nanoTime() - j) + this.f1431;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m1517() {
        this.f1430 = 0;
        this.f1431 = 0L;
    }
}
