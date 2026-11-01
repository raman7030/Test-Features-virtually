package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes4.dex */
public final class C11408 extends AbstractC22312 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C10737 f31828;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11408(C10737 c10737) {
        super(c10737.f40887);
        this.f31828 = c10737;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11408(C10737 c10737, int i, int i2) {
        super(i, i2);
        this.f31828 = c10737;
    }

    @Override // p067l.AbstractC22312
    /* JADX INFO: renamed from: ۧ */
    public final int mo26381() {
        return this.f31828.f40886;
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final int mo5713(int i) {
        return this.f31828.f29735.f52158[i];
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18287 mo5714(int i, int i2) {
        return new C11408(this.f31828, i, i2);
    }

    @Override // p067l.AbstractC24362, p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f59683 >= mo44527()) {
            return false;
        }
        int[] iArr = this.f31828.f29735.f52158;
        int i = this.f59683;
        this.f59683 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // p067l.AbstractC24362, p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f31828.f29735.f52158;
        int iMo44527 = mo44527();
        while (true) {
            int i = this.f59683;
            if (i >= iMo44527) {
                return;
            }
            this.f59683 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
