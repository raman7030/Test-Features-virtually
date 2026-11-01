package p067l;

/* JADX INFO: renamed from: l.᩸᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes.dex */
public class C23158 extends AbstractC17101 {

    /* JADX INFO: renamed from: ۙ */
    public volatile InterfaceC5723 f72759 = ConcurrentMapC16391.f48157;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC25109 f72760;

    /* JADX INFO: renamed from: ᩸ */
    public final int f72761;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f72762;

    public C23158(Object obj, int i, InterfaceC25109 interfaceC25109) {
        this.f72762 = obj;
        this.f72761 = i;
        this.f72760 = interfaceC25109;
    }

    @Override // p067l.AbstractC17101, p067l.InterfaceC25109
    public final Object getKey() {
        return this.f72762;
    }

    @Override // p067l.AbstractC17101, p067l.InterfaceC25109
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC5723 mo19584() {
        return this.f72759;
    }

    @Override // p067l.AbstractC17101, p067l.InterfaceC25109
    /* JADX INFO: renamed from: ֫ */
    public final void mo19576(InterfaceC5723 interfaceC5723) {
        this.f72759 = interfaceC5723;
    }

    @Override // p067l.AbstractC17101, p067l.InterfaceC25109
    public final int getHash() {
        return this.f72761;
    }

    @Override // p067l.AbstractC17101, p067l.InterfaceC25109
    public final InterfaceC25109 getNext() {
        return this.f72760;
    }
}
