package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22852 extends AbstractC11401 {
    @Override // l.AbstractC11401, l.InterfaceC17664
    public final void forEach(Consumer consumer) {
        if (!this.h.r) {
            s0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // l.AbstractC11401, l.InterfaceC17664
    public final void forEachOrdered(Consumer consumer) {
        if (!this.h.r) {
            s0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // l.InterfaceC12393
    public final InterfaceC12393 unordered() {
        return !EnumC7330.ORDERED.s(this.m) ? this : new C21626(this, EnumC7330.r);
    }

    @Override // l.AbstractC12725
    public final boolean p0() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        throw new UnsupportedOperationException();
    }
}
