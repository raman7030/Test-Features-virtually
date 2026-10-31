package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5545 extends AbstractC23805 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1311 f17151;

    @Override // l.AbstractC18161, l.InterfaceC15234
    public final int characteristics() {
        return 16720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5545(C1311 c1311, int i, int i2) {
        super(i, i2);
        this.f17151 = c1311;
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫ */
    public final int mo3394(int i) {
        return this.f17151.f4712.f25673[i];
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16749 mo3395(int i, int i2) {
        return new C5545(this.f17151, i, i2);
    }

    @Override // l.AbstractC23141, l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        C8367 c8367 = this.f17151.f4712;
        int[] iArr = c8367.f25673;
        int i = c8367.f25674;
        while (true) {
            int i2 = this.f56469;
            if (i2 >= i) {
                return;
            }
            this.f56469 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
