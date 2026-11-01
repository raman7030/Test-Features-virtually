package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩷ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22273 extends AbstractC7758 {
    @Override // p067l.AbstractC14463, p067l.InterfaceC14147, p067l.InterfaceC20165
    public final InterfaceC2804 sequential() {
        this.f41311h.f41321r = false;
        return this;
    }

    @Override // p067l.AbstractC14463, p067l.InterfaceC14147, p067l.InterfaceC20165
    public final InterfaceC2804 parallel() {
        this.f41311h.f41321r = true;
        return this;
    }

    @Override // p067l.AbstractC7758, p067l.InterfaceC2804
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.f41311h.f41321r) {
            super.forEach(doubleConsumer);
        } else {
            AbstractC7758.m17908u0(m33097s0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // p067l.AbstractC7758, p067l.InterfaceC2804
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.f41311h.f41321r) {
            super.forEachOrdered(doubleConsumer);
        } else {
            AbstractC7758.m17908u0(m33097s0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // p067l.InterfaceC14147
    public final InterfaceC14147 unordered() {
        return !EnumC9335.ORDERED.m21660s(this.f41316m) ? this : new C24363(this, EnumC9335.f25423r, 0);
    }

    @Override // p067l.AbstractC14463, p067l.InterfaceC14147
    public final /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return spliterator();
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
