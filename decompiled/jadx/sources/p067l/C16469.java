package p067l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܳ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C16469 {

    /* JADX INFO: renamed from: ֫ */
    public final C4045[] f48365;

    /* JADX INFO: renamed from: ܿ */
    public final AtomicLong f48368 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicInteger f48369 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ܽ */
    public final AtomicLong f48367 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۧ */
    public final AtomicInteger f48366 = new AtomicInteger(0);

    public C16469(AbstractC23625 abstractC23625, String[] strArr, boolean z) {
        this.f48365 = new C4045[strArr.length];
        for (int i = 0; i < strArr.length && !abstractC23625.mo3924(); i++) {
            C4045[] c4045Arr = this.f48365;
            C4045 c4045M55251 = C25187.m55251(abstractC23625, new String[]{strArr[i]}, z);
            c4045Arr[i] = c4045M55251;
            this.f48368.addAndGet(c4045M55251.m8106());
            this.f48369.addAndGet(c4045M55251.m8104());
            this.f48367.addAndGet(c4045M55251.m8103());
            this.f48366.addAndGet(c4045M55251.m8099());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4045 m37393(int i) {
        return this.f48365[i];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m37398() {
        return this.f48368.get();
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m37395() {
        return this.f48367.get();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m37396() {
        return this.f48369.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37392() {
        return this.f48366.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37394(long j) {
        this.f48367.addAndGet(j);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m37397() {
        this.f48366.incrementAndGet();
    }
}
