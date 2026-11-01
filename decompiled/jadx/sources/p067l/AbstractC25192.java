package p067l;

/* JADX INFO: renamed from: l.᩻᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC25192 extends AbstractC7758 {
    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4007p0() {
        return false;
    }

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

    @Override // p067l.InterfaceC14147
    public final InterfaceC14147 unordered() {
        return !EnumC9335.ORDERED.m21660s(this.f41316m) ? this : new C24363(this, EnumC9335.f25423r, 0);
    }

    @Override // p067l.AbstractC14463, p067l.InterfaceC14147
    public final /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return spliterator();
    }
}
