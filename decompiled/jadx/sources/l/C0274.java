package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֡۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0274 extends AbstractC19162 {
    @Override // l.AbstractC12725, l.InterfaceC12393, l.InterfaceC18725
    public final InterfaceC18725 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // l.AbstractC12725, l.InterfaceC12393, l.InterfaceC18725
    public final InterfaceC18725 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.AbstractC19162, l.InterfaceC18725
    public final void forEach(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEach(longConsumer);
        } else {
            AbstractC19162.u0(s0()).forEachRemaining(longConsumer);
        }
    }

    @Override // l.AbstractC19162, l.InterfaceC18725
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC19162.u0(s0()).forEachRemaining(longConsumer);
        }
    }

    @Override // l.InterfaceC12393
    public final InterfaceC12393 unordered() {
        return !EnumC7330.ORDERED.s(this.m) ? this : new C9738(this, EnumC7330.r, 2);
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
