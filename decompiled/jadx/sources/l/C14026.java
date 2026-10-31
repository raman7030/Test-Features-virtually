package l;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.ܰ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C14026 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0914 f42412;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f42413 = new AtomicLong();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f42414 = new AtomicLong();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f42415;

    public C14026(long j, C0914 c0914) {
        this.f42415 = j;
        this.f42412 = c0914;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33637(final long j) {
        if (j > 0) {
            C6708.updateAndGet(this.f42413, new LongUnaryOperator() { // from class: l.ۨ᩵ܳ
                public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                    return C18579.$default$andThen(this, longUnaryOperator);
                }

                public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                    return C18579.$default$compose(this, longUnaryOperator);
                }

                @Override // java.util.function.LongUnaryOperator
                public final long applyAsLong(long j2) {
                    return C16996.m39850(j2, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33638(long j, long j2) {
        this.f42414.set(0L);
        if (j == 0) {
            j2 = 1;
        }
        m33637(j2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33640(final long j) {
        if (j > 0) {
            C6708.updateAndGet(this.f42414, new LongUnaryOperator() { // from class: l.᩺᩵ܳ
                public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                    return C18579.$default$andThen(this, longUnaryOperator);
                }

                public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                    return C18579.$default$compose(this, longUnaryOperator);
                }

                @Override // java.util.function.LongUnaryOperator
                public final long applyAsLong(long j2) {
                    return C16996.m39850(j2, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33636() {
        this.f42414.set(0L);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33639() {
        this.f42414.set(0L);
        this.f42413.set(this.f42415);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33641() {
        long jM39850 = C16996.m39850(this.f42413.get(), this.f42414.get());
        long j = this.f42415;
        this.f42412.m11541(Math.min(jM39850, j), j);
    }
}
