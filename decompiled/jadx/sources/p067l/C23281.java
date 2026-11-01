package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩹ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes2.dex */
public final class C23281 extends AbstractC21309 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C21270 f73250;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23281(C21270 c21270) {
        super(c21270.f34258);
        this.f73250 = c21270;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23281(C21270 c21270, int i, int i2) {
        super(i, i2);
        this.f73250 = c21270;
    }

    @Override // p067l.AbstractC21309
    /* JADX INFO: renamed from: ۧ */
    public final int mo15786() {
        return this.f73250.f34257;
    }

    @Override // p067l.AbstractC9908
    /* JADX INFO: renamed from: ֫ */
    public final long mo15784(int i) {
        return this.f73250.f66910.f16849[i];
    }

    @Override // p067l.AbstractC9908
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3202 mo15785(int i, int i2) {
        return new C23281(this.f73250, i, i2);
    }

    @Override // p067l.AbstractC24322, p067l.InterfaceC3437
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f27470 >= mo23206()) {
            return false;
        }
        long[] jArr = this.f73250.f66910.f16849;
        int i = this.f27470;
        this.f27470 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // p067l.AbstractC24322, p067l.InterfaceC3437
    public final void forEachRemaining(LongConsumer longConsumer) {
        long[] jArr = this.f73250.f66910.f16849;
        int iMo23206 = mo23206();
        while (true) {
            int i = this.f27470;
            if (i >= iMo23206) {
                return;
            }
            this.f27470 = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }
}
