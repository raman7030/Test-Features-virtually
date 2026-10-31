package com.amazonaws.metrics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteThroughputProvider {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f270;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f271;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ThroughputMetricType f272;

    public ByteThroughputProvider(ThroughputMetricType throughputMetricType) {
        this.f272 = throughputMetricType;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m349() {
        return this.f270;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m350() {
        return this.f271;
    }

    public final String toString() {
        return String.format("providerId=%s, throughputType=%s, byteCount=%d, duration=%d", super.toString(), this.f272, Integer.valueOf(this.f270), Long.valueOf(this.f271));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo348(int i, long j) {
        this.f270 += i;
        this.f271 = (System.nanoTime() - j) + this.f271;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m351() {
        this.f270 = 0;
        this.f271 = 0L;
    }
}
