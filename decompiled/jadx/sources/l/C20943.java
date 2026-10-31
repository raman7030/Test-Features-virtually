package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩷ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20943 extends AbstractC5670 {
    @Override // l.AbstractC12725, l.InterfaceC12393, l.InterfaceC18725
    public final InterfaceC0458 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // l.AbstractC12725, l.InterfaceC12393, l.InterfaceC18725
    public final InterfaceC0458 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.AbstractC5670, l.InterfaceC0458
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEach(doubleConsumer);
        } else {
            AbstractC5670.u0(s0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // l.AbstractC5670, l.InterfaceC0458
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEachOrdered(doubleConsumer);
        } else {
            AbstractC5670.u0(s0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // l.InterfaceC12393
    public final InterfaceC12393 unordered() {
        return !EnumC7330.ORDERED.s(this.m) ? this : new C23142(this, EnumC7330.r, 0);
    }

    @Override // l.AbstractC12725, l.InterfaceC12393
    public final /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return spliterator();
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
