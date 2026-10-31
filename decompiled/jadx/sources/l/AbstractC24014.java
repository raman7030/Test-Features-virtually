package l;

/* JADX INFO: renamed from: l.᩻᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24014 extends AbstractC5670 {
    @Override // l.AbstractC12725
    public final boolean p0() {
        return false;
    }

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

    @Override // l.InterfaceC12393
    public final InterfaceC12393 unordered() {
        return !EnumC7330.ORDERED.s(this.m) ? this : new C23142(this, EnumC7330.r, 0);
    }

    @Override // l.AbstractC12725, l.InterfaceC12393
    public final /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return spliterator();
    }
}
