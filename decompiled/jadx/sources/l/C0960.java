package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0960 extends AbstractC23805 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8016 f3615;

    @Override // l.AbstractC18161, l.InterfaceC15234
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0960(C8016 c8016, int i, int i2) {
        super(i, i2);
        this.f3615 = c8016;
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo3394(int i) {
        return this.f3615.f24754.f14284[i];
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16749 mo3395(int i, int i2) {
        return new C0960(this.f3615, i, i2);
    }

    @Override // l.AbstractC23141, l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        C4488 c4488 = this.f3615.f24754;
        int[] iArr = c4488.f14284;
        int i = c4488.f14280;
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
