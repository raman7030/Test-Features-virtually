package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21711 extends AbstractC9759 {
    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C21711((InterfaceC18764) interfaceC15234, this);
    }

    @Override // l.InterfaceC18764
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        InterfaceC15234 interfaceC15234 = this.a;
        if (z) {
            boolean z2 = false;
            this.c = false;
            while (true) {
                zTryAdvance = ((InterfaceC18764) interfaceC15234).tryAdvance((IntConsumer) this);
                if (!zTryAdvance || !a() || !this.e.test(this.f)) {
                    break;
                }
                z2 = true;
            }
            if (zTryAdvance) {
                if (z2) {
                    this.b.set(true);
                }
                intConsumer.accept(this.f);
            }
            return zTryAdvance;
        }
        return ((InterfaceC18764) interfaceC15234).tryAdvance(intConsumer);
    }
}
