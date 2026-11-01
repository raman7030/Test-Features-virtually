package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩺ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24383 extends AbstractC22353 {
    @Override // p067l.AbstractC13635
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo21942b(InterfaceC16847 interfaceC16847) {
        return new C24383((InterfaceC2766) interfaceC16847, this);
    }

    @Override // p067l.InterfaceC2766
    public final boolean tryAdvance(LongConsumer longConsumer) {
        boolean zTest;
        if (this.f38387c && m31013a() && ((InterfaceC2766) this.f38385a).tryAdvance((LongConsumer) this)) {
            zTest = this.f70552e.test(this.f70553f);
            if (zTest) {
                longConsumer.accept(this.f70553f);
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
    public final InterfaceC2766 trySplit() {
        if (this.f38386b.get()) {
            return null;
        }
        return (InterfaceC2766) super.trySplit();
    }
}
