package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23848 extends AbstractC21279 implements InterfaceC18764 {
    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C3947.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C3947.b(this, consumer);
    }

    @Override // l.AbstractC21279
    public final AbstractC21279 e(InterfaceC15234 interfaceC15234) {
        return new C23848(this.b, interfaceC15234, this.a);
    }

    @Override // l.AbstractC21279
    public final void d() {
        C19532 c19532 = new C19532();
        this.h = c19532;
        C11003.requireNonNull(c19532);
        this.e = this.b.g0(new C6230(c19532, 1));
        this.f = new C17022(17, this);
    }

    @Override // l.AbstractC21279, l.InterfaceC15234
    public final InterfaceC1124 trySplit() {
        return (InterfaceC18764) super.trySplit();
    }

    @Override // l.AbstractC21279, l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        return (InterfaceC18764) super.trySplit();
    }

    @Override // l.AbstractC21279, l.InterfaceC15234
    public final InterfaceC18764 trySplit() {
        return (InterfaceC18764) super.trySplit();
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        C11003.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            C19532 c19532 = (C19532) this.h;
            long j = this.g;
            int iR = c19532.r(j);
            if (c19532.c == 0 && iR == 0) {
                i = ((int[]) c19532.e)[(int) j];
            } else {
                i = ((int[][]) c19532.f)[iR][(int) (j - c19532.d[iR])];
            }
            intConsumer.accept(i);
        }
        return zA;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            C11003.requireNonNull(intConsumer);
            c();
            C11003.requireNonNull(intConsumer);
            C6230 c6230 = new C6230(intConsumer, 0);
            this.b.f0(this.d, c6230);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
