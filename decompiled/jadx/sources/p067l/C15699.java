package p067l;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.ܰ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C15699 {

    /* JADX INFO: renamed from: ֫ */
    public final C3237 f45495;

    /* JADX INFO: renamed from: ۧ */
    public final AtomicLong f45496 = new AtomicLong();

    /* JADX INFO: renamed from: ܽ */
    public final AtomicLong f45497 = new AtomicLong();

    /* JADX INFO: renamed from: ᩳ */
    public final long f45498;

    public C15699(long j, C3237 c3237) {
        this.f45498 = j;
        this.f45495 = c3237;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35757(final long j) {
        if (j > 0) {
            C8744.updateAndGet(this.f45496, new LongUnaryOperator() { // from class: l.ۨ᩵ܳ
                public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                    return C20026.$default$andThen(this, longUnaryOperator);
                }

                public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                    return C20026.$default$compose(this, longUnaryOperator);
                }

                @Override // java.util.function.LongUnaryOperator
                public final long applyAsLong(long j2) {
                    return C18521.m42093(j2, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35758(long j, long j2) {
        this.f45497.set(0L);
        if (j == 0) {
            j2 = 1;
        }
        m35757(j2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35760(final long j) {
        if (j > 0) {
            C8744.updateAndGet(this.f45497, new LongUnaryOperator() { // from class: l.᩺᩵ܳ
                public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                    return C20026.$default$andThen(this, longUnaryOperator);
                }

                public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                    return C20026.$default$compose(this, longUnaryOperator);
                }

                @Override // java.util.function.LongUnaryOperator
                public final long applyAsLong(long j2) {
                    return C18521.m42093(j2, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35756() {
        this.f45497.set(0L);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35759() {
        this.f45497.set(0L);
        this.f45496.set(this.f45498);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35761() {
        long jM42093 = C18521.m42093(this.f45496.get(), this.f45497.get());
        long j = this.f45498;
        this.f45495.m13477(Math.min(jM42093, j), j);
    }
}
