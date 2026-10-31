package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۟ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7435 extends AbstractC9011 {
    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C7435((InterfaceC8160) interfaceC15234, this);
    }

    @Override // l.InterfaceC8160
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        boolean zTest;
        if (this.c && a() && ((InterfaceC8160) this.a).tryAdvance((DoubleConsumer) this)) {
            zTest = this.e.test(this.f);
            if (zTest) {
                doubleConsumer.accept(this.f);
                return true;
            }
        } else {
            zTest = true;
        }
        this.c = false;
        if (!zTest) {
            this.b.set(true);
        }
        return false;
    }

    @Override // l.AbstractC11854, l.InterfaceC15234
    public final InterfaceC8160 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC8160) super.trySplit();
    }
}
