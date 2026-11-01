package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۟ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9435 extends AbstractC10933 {
    @Override // p067l.AbstractC13635
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo21942b(InterfaceC16847 interfaceC16847) {
        return new C9435((InterfaceC10124) interfaceC16847, this);
    }

    @Override // p067l.InterfaceC10124
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        boolean zTest;
        if (this.f38387c && m31013a() && ((InterfaceC10124) this.f38385a).tryAdvance((DoubleConsumer) this)) {
            zTest = this.f30304e.test(this.f30305f);
            if (zTest) {
                doubleConsumer.accept(this.f30305f);
                return true;
            }
        } else {
            zTest = true;
        }
        this.f38387c = false;
        if (!zTest) {
            this.f38386b.set(true);
        }
        return false;
    }

    @Override // p067l.AbstractC13635, p067l.InterfaceC16847
    public final InterfaceC10124 trySplit() {
        if (this.f38386b.get()) {
            return null;
        }
        return (InterfaceC10124) super.trySplit();
    }
}
