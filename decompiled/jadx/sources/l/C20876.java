package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩷۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AH0 */
/* JADX INFO: loaded from: classes4.dex */
public class C20876 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67559;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f67560;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f67558 = new AtomicLong();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f67557 = new AtomicInteger();

    public C20876() {
    }

    public C20876(int i, long j) {
        this.f67560 = j;
        this.f67559 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47707() {
        return C22927.m51020(this.f67560 - this.f67558.get());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m47709() {
        return this.f67560;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m47710() {
        return C22927.m51020(this.f67560);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m47711() {
        return this.f67559 - this.f67557.get();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m47716() {
        return this.f67559;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m47713() {
        return this.f67558.get();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47714() {
        return this.f67557.get();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m47712() {
        if (this.f67560 == 0) {
            return 0;
        }
        return (int) ((this.f67558.get() * 100) / this.f67560);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47708(long j) {
        long jAddAndGet = this.f67558.addAndGet(j);
        if (jAddAndGet > this.f67560) {
            this.f67560 = jAddAndGet;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47715() {
        this.f67557.incrementAndGet();
    }
}
