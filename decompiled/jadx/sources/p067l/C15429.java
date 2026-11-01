package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15429 extends AbstractC24993 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C9395 f44106;

    @Override // p067l.AbstractC19629, p067l.InterfaceC16847
    public final int characteristics() {
        return 17744;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15429(C9395 c9395) {
        super(c9395.f25669, c9395.f25666);
        this.f44106 = c9395;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15429(C9395 c9395, int i, int i2) {
        super(i, i2);
        this.f44106 = c9395;
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final int mo5713(int i) {
        return this.f44106.f25668[i];
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18287 mo5714(int i, int i2) {
        return new C15429(this.f44106, i, i2);
    }

    @Override // p067l.AbstractC24362, p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f59683;
        if (i >= this.f79777) {
            return false;
        }
        int[] iArr = this.f44106.f25668;
        this.f59683 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // p067l.AbstractC24362, p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f44106.f25668;
        while (true) {
            int i = this.f59683;
            if (i >= this.f79777) {
                return;
            }
            this.f59683 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
