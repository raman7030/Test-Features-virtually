package p067l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩷۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AH0 */
/* JADX INFO: loaded from: classes4.dex */
public class C22209 {

    /* JADX INFO: renamed from: ܽ */
    public int f70245;

    /* JADX INFO: renamed from: ᩳ */
    public long f70246;

    /* JADX INFO: renamed from: ۧ */
    public final AtomicLong f70244 = new AtomicLong();

    /* JADX INFO: renamed from: ֫ */
    public final AtomicInteger f70243 = new AtomicInteger();

    public C22209() {
    }

    public C22209(int i, long j) {
        this.f70246 = j;
        this.f70245 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50037() {
        return C24158.m53411(this.f70246 - this.f70244.get());
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m50039() {
        return this.f70246;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m50040() {
        return C24158.m53411(this.f70246);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m50041() {
        return this.f70245 - this.f70243.get();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m50046() {
        return this.f70245;
    }

    /* JADX INFO: renamed from: ܿ */
    public final long m50043() {
        return this.f70244.get();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m50044() {
        return this.f70243.get();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m50042() {
        if (this.f70246 == 0) {
            return 0;
        }
        return (int) ((this.f70244.get() * 100) / this.f70246);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50038(long j) {
        long jAddAndGet = this.f70244.addAndGet(j);
        if (jAddAndGet > this.f70246) {
            this.f70246 = jAddAndGet;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m50045() {
        this.f70243.incrementAndGet();
    }
}
