package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24087 extends AbstractC13204 {
    @Override // p067l.AbstractC13204, p067l.InterfaceC19157
    public final void forEach(Consumer consumer) {
        if (!this.f41311h.f41321r) {
            m33097s0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // p067l.AbstractC13204, p067l.InterfaceC19157
    public final void forEachOrdered(Consumer consumer) {
        if (!this.f41311h.f41321r) {
            m33097s0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // p067l.InterfaceC14147
    public final InterfaceC14147 unordered() {
        return !EnumC9335.ORDERED.m21660s(this.f41316m) ? this : new C22922(this, EnumC9335.f25423r);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4007p0() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        throw new UnsupportedOperationException();
    }
}
