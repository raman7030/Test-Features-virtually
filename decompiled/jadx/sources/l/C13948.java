package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13948 extends AbstractC9759 {
    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C13948((InterfaceC18764) interfaceC15234, this);
    }

    @Override // l.InterfaceC18764
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTest;
        if (this.c && a() && ((InterfaceC18764) this.a).tryAdvance((IntConsumer) this)) {
            zTest = this.e.test(this.f);
            if (zTest) {
                intConsumer.accept(this.f);
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
    public final InterfaceC18764 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC18764) super.trySplit();
    }
}
