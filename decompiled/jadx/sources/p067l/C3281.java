package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3281 extends AbstractC24993 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C9987 f6391;

    @Override // p067l.AbstractC19629, p067l.InterfaceC16847
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3281(C9987 c9987, int i, int i2) {
        super(i, i2);
        this.f6391 = c9987;
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final int mo5713(int i) {
        return this.f6391.f27668.f17111[i];
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18287 mo5714(int i, int i2) {
        return new C3281(this.f6391, i, i2);
    }

    @Override // p067l.AbstractC24362, p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        C6634 c6634 = this.f6391.f27668;
        int[] iArr = c6634.f17111;
        int i = c6634.f17107;
        while (true) {
            int i2 = this.f59683;
            if (i2 >= i) {
                return;
            }
            this.f59683 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
