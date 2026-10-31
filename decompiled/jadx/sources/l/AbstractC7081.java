package l;

/* JADX INFO: renamed from: l.ۜ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7081 extends AbstractC6375 {
    @Override // l.AbstractC12725
    public final boolean p0() {
        return true;
    }

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

    @Override // l.InterfaceC12393
    public final InterfaceC12393 unordered() {
        return !EnumC7330.ORDERED.s(this.m) ? this : new C13990(this, EnumC7330.r, 1);
    }

    @Override // l.AbstractC12725, l.InterfaceC12393
    public final /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return spliterator();
    }
}
