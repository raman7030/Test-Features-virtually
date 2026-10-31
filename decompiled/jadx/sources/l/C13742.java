package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13742 extends AbstractC23805 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7393 f41028;

    @Override // l.AbstractC18161, l.InterfaceC15234
    public final int characteristics() {
        return 17744;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13742(C7393 c7393) {
        super(c7393.f22757, c7393.f22754);
        this.f41028 = c7393;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13742(C7393 c7393, int i, int i2) {
        super(i, i2);
        this.f41028 = c7393;
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫ */
    public final int mo3394(int i) {
        return this.f41028.f22756[i];
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16749 mo3395(int i, int i2) {
        return new C13742(this.f41028, i, i2);
    }

    @Override // l.AbstractC23141, l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f56469;
        if (i >= this.f77025) {
            return false;
        }
        int[] iArr = this.f41028.f22756;
        this.f56469 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.AbstractC23141, l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f41028.f22756;
        while (true) {
            int i = this.f56469;
            if (i >= this.f77025) {
                return;
            }
            this.f56469 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
