package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܶᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17006 extends AbstractC22353 {
    @Override // p067l.AbstractC13635
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo21942b(InterfaceC16847 interfaceC16847) {
        return new C17006((InterfaceC2766) interfaceC16847, this);
    }

    @Override // p067l.InterfaceC2766
    public final boolean tryAdvance(LongConsumer longConsumer) {
        boolean zTryAdvance;
        boolean z = this.f38387c;
        InterfaceC16847 interfaceC16847 = this.f38385a;
        if (z) {
            boolean z2 = false;
            this.f38387c = false;
            while (true) {
                zTryAdvance = ((InterfaceC2766) interfaceC16847).tryAdvance((LongConsumer) this);
                if (!zTryAdvance || !m31013a() || !this.f70552e.test(this.f70553f)) {
                    break;
                }
                z2 = true;
            }
            if (zTryAdvance) {
                if (z2) {
                    this.f38386b.set(true);
                }
                longConsumer.accept(this.f70553f);
            }
            return zTryAdvance;
        }
        return ((InterfaceC2766) interfaceC16847).tryAdvance(longConsumer);
    }
}
