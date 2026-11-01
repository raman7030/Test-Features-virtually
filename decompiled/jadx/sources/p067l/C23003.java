package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23003 extends AbstractC11644 {
    @Override // p067l.AbstractC13635
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo21942b(InterfaceC16847 interfaceC16847) {
        return new C23003((InterfaceC20202) interfaceC16847, this);
    }

    @Override // p067l.InterfaceC20202
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTryAdvance;
        boolean z = this.f38387c;
        InterfaceC16847 interfaceC16847 = this.f38385a;
        if (z) {
            boolean z2 = false;
            this.f38387c = false;
            while (true) {
                zTryAdvance = ((InterfaceC20202) interfaceC16847).tryAdvance((IntConsumer) this);
                if (!zTryAdvance || !m31013a() || !this.f32485e.test(this.f32486f)) {
                    break;
                }
                z2 = true;
            }
            if (zTryAdvance) {
                if (z2) {
                    this.f38386b.set(true);
                }
                intConsumer.accept(this.f32486f);
            }
            return zTryAdvance;
        }
        return ((InterfaceC20202) interfaceC16847).tryAdvance(intConsumer);
    }
}
