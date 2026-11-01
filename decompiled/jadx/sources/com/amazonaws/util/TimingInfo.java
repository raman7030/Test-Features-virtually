package com.amazonaws.util;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfo {

    /* JADX INFO: renamed from: ֫ */
    public Long f2005;

    /* JADX INFO: renamed from: ۧ */
    public final long f2006;

    /* JADX INFO: renamed from: ֫ */
    public void mo1956(long j, String str) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1957(String str) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1958(String str, TimingInfo timingInfo) {
    }

    public TimingInfo(long j, Long l2) {
        this.f2006 = j;
        this.f2005 = l2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m1960() {
        return this.f2006;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m1959() {
        Long l2 = this.f2005;
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    public final String toString() {
        Double dValueOf;
        if (m1961()) {
            dValueOf = Double.valueOf(TimeUnit.NANOSECONDS.toMicros(this.f2005.longValue() - this.f2006) / 1000.0d);
        } else {
            dValueOf = null;
        }
        return String.valueOf(dValueOf == null ? -1.0d : dValueOf.doubleValue());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m1961() {
        return this.f2005 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1955() {
        this.f2005 = Long.valueOf(System.nanoTime());
    }
}
