package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ᩳۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19257 extends AbstractC22650 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C18586 f57550;

    @Override // p067l.AbstractC9908, p067l.InterfaceC16847
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19257(C18586 c18586, int i, int i2) {
        super(i, i2);
        this.f57550 = c18586;
    }

    @Override // p067l.AbstractC9908
    /* JADX INFO: renamed from: ֫ */
    public final long mo15784(int i) {
        return this.f57550.f55499.f31145[i];
    }

    @Override // p067l.AbstractC9908
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3202 mo15785(int i, int i2) {
        return new C19257(this.f57550, i, i2);
    }

    @Override // p067l.AbstractC24322, p067l.InterfaceC3437
    public final void forEachRemaining(LongConsumer longConsumer) {
        C11211 c11211 = this.f57550.f55499;
        long[] jArr = c11211.f31145;
        int i = c11211.f31141;
        while (true) {
            int i2 = this.f27470;
            if (i2 >= i) {
                return;
            }
            this.f27470 = i2 + 1;
            longConsumer.accept(jArr[i2]);
        }
    }
}
