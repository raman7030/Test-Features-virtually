package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8528 extends AbstractC21348 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C21940 f22889;

    @Override // p067l.AbstractC16652, p067l.InterfaceC16847
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8528(C21940 c21940, int i, int i2) {
        super(i, i2);
        this.f22889 = c21940;
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7515(int i) {
        return this.f22889.f68977.f31140[i];
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9948 mo7516(int i, int i2) {
        return new C8528(this.f22889, i, i2);
    }

    @Override // p067l.AbstractC16652, p067l.AbstractC25073, p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C11211 c11211 = this.f22889.f68977;
        Object[] objArr = c11211.f31140;
        int i = c11211.f31141;
        while (true) {
            int i2 = this.f48922;
            if (i2 >= i) {
                return;
            }
            this.f48922 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
