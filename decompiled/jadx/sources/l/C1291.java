package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.֨ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1291 extends AbstractC21279 implements InterfaceC8160 {
    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC16169.b(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC16169.g(this, consumer);
    }

    @Override // l.AbstractC21279
    public final AbstractC21279 e(InterfaceC15234 interfaceC15234) {
        return new C1291(this.b, interfaceC15234, this.a);
    }

    @Override // l.AbstractC21279
    public final void d() {
        C12559 c12559 = new C12559();
        this.h = c12559;
        C11003.requireNonNull(c12559);
        this.e = this.b.g0(new C6936(c12559, 1));
        this.f = new C17022(16, this);
    }

    @Override // l.AbstractC21279, l.InterfaceC15234
    public final InterfaceC1124 trySplit() {
        return (InterfaceC8160) super.trySplit();
    }

    @Override // l.AbstractC21279, l.InterfaceC15234
    public final InterfaceC8160 trySplit() {
        return (InterfaceC8160) super.trySplit();
    }

    @Override // l.AbstractC21279, l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        return (InterfaceC8160) super.trySplit();
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        C11003.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            C12559 c12559 = (C12559) this.h;
            long j = this.g;
            int iR = c12559.r(j);
            if (c12559.c == 0 && iR == 0) {
                d = ((double[]) c12559.e)[(int) j];
            } else {
                d = ((double[][]) c12559.f)[iR][(int) (j - c12559.d[iR])];
            }
            doubleConsumer.accept(d);
        }
        return zA;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            C11003.requireNonNull(doubleConsumer);
            c();
            C11003.requireNonNull(doubleConsumer);
            C6936 c6936 = new C6936(doubleConsumer, 0);
            this.b.f0(this.d, c6936);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
