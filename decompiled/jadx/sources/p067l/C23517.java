package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩹ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23517 extends AbstractC10933 {
    @Override // p067l.AbstractC13635
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo21942b(InterfaceC16847 interfaceC16847) {
        return new C23517((InterfaceC10124) interfaceC16847, this);
    }

    @Override // p067l.InterfaceC10124
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        boolean zTryAdvance;
        boolean z = this.f38387c;
        InterfaceC16847 interfaceC16847 = this.f38385a;
        if (z) {
            boolean z2 = false;
            this.f38387c = false;
            while (true) {
                zTryAdvance = ((InterfaceC10124) interfaceC16847).tryAdvance((DoubleConsumer) this);
                if (!zTryAdvance || !m31013a() || !this.f30304e.test(this.f30305f)) {
                    break;
                }
                z2 = true;
            }
            if (zTryAdvance) {
                if (z2) {
                    this.f38386b.set(true);
                }
                doubleConsumer.accept(this.f30305f);
            }
            return zTryAdvance;
        }
        return ((InterfaceC10124) interfaceC16847).tryAdvance(doubleConsumer);
    }
}
