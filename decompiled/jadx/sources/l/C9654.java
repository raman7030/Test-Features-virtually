package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9654 extends AbstractC6375 {
    @Override // l.AbstractC12725, l.InterfaceC12393, l.InterfaceC18725
    public final InterfaceC11315 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // l.AbstractC12725, l.InterfaceC12393, l.InterfaceC18725
    public final InterfaceC11315 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.AbstractC6375, l.InterfaceC11315
    public final void forEach(IntConsumer intConsumer) {
        if (this.h.r) {
            super.forEach(intConsumer);
        } else {
            AbstractC6375.u0(s0()).forEachRemaining(intConsumer);
        }
    }

    @Override // l.AbstractC6375, l.InterfaceC11315
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.h.r) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC6375.u0(s0()).forEachRemaining(intConsumer);
        }
    }

    @Override // l.InterfaceC12393
    public final InterfaceC12393 unordered() {
        return !EnumC7330.ORDERED.s(this.m) ? this : new C13990(this, EnumC7330.r, 1);
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
