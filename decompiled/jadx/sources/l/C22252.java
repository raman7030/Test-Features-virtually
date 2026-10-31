package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩹ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22252 extends AbstractC9011 {
    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C22252((InterfaceC8160) interfaceC15234, this);
    }

    @Override // l.InterfaceC8160
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        InterfaceC15234 interfaceC15234 = this.a;
        if (z) {
            boolean z2 = false;
            this.c = false;
            while (true) {
                zTryAdvance = ((InterfaceC8160) interfaceC15234).tryAdvance((DoubleConsumer) this);
                if (!zTryAdvance || !a() || !this.e.test(this.f)) {
                    break;
                }
                z2 = true;
            }
            if (zTryAdvance) {
                if (z2) {
                    this.b.set(true);
                }
                doubleConsumer.accept(this.f);
            }
            return zTryAdvance;
        }
        return ((InterfaceC8160) interfaceC15234).tryAdvance(doubleConsumer);
    }
}
