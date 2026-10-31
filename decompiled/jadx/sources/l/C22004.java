package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩹ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes2.dex */
public final class C22004 extends AbstractC19929 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19888 f70536;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22004(C19888 c19888) {
        super(c19888.f31293);
        this.f70536 = c19888;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22004(C19888 c19888, int i, int i2) {
        super(i, i2);
        this.f70536 = c19888;
    }

    @Override // l.AbstractC19929
    /* JADX INFO: renamed from: ۧ */
    public final int mo13906() {
        return this.f70536.f31292;
    }

    @Override // l.AbstractC7933
    /* JADX INFO: renamed from: ֫ */
    public final long mo13904(int i) {
        return this.f70536.f64274.f14034[i];
    }

    @Override // l.AbstractC7933
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC0877 mo13905(int i, int i2) {
        return new C22004(this.f70536, i, i2);
    }

    @Override // l.AbstractC23099, l.InterfaceC1124
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f24556 >= mo21240()) {
            return false;
        }
        long[] jArr = this.f70536.f64274.f14034;
        int i = this.f24556;
        this.f24556 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // l.AbstractC23099, l.InterfaceC1124
    public final void forEachRemaining(LongConsumer longConsumer) {
        long[] jArr = this.f70536.f64274.f14034;
        int iMo21240 = mo21240();
        while (true) {
            int i = this.f24556;
            if (i >= iMo21240) {
                return;
            }
            this.f24556 = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }
}
