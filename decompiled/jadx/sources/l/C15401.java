package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܶᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15401 extends AbstractC21027 {
    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C15401((InterfaceC0418) interfaceC15234, this);
    }

    @Override // l.InterfaceC0418
    public final boolean tryAdvance(LongConsumer longConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        InterfaceC15234 interfaceC15234 = this.a;
        if (z) {
            boolean z2 = false;
            this.c = false;
            while (true) {
                zTryAdvance = ((InterfaceC0418) interfaceC15234).tryAdvance((LongConsumer) this);
                if (!zTryAdvance || !a() || !this.e.test(this.f)) {
                    break;
                }
                z2 = true;
            }
            if (zTryAdvance) {
                if (z2) {
                    this.b.set(true);
                }
                longConsumer.accept(this.f);
            }
            return zTryAdvance;
        }
        return ((InterfaceC0418) interfaceC15234).tryAdvance(longConsumer);
    }
}
