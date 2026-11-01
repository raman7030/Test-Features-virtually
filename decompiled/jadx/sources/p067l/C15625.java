package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15625 extends AbstractC11644 {
    @Override // p067l.AbstractC13635
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo21942b(InterfaceC16847 interfaceC16847) {
        return new C15625((InterfaceC20202) interfaceC16847, this);
    }

    @Override // p067l.InterfaceC20202
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTest;
        if (this.f38387c && m31013a() && ((InterfaceC20202) this.f38385a).tryAdvance((IntConsumer) this)) {
            zTest = this.f32485e.test(this.f32486f);
            if (zTest) {
                intConsumer.accept(this.f32486f);
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
    public final InterfaceC20202 trySplit() {
        if (this.f38386b.get()) {
            return null;
        }
        return (InterfaceC20202) super.trySplit();
    }
}
