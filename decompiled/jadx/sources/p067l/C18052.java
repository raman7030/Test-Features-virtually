package p067l;

/* JADX INFO: renamed from: l.ܽ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18052 extends AbstractC8765 {

    /* JADX INFO: renamed from: b */
    public boolean f53895b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5983 f53896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18052(C5983 c5983, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f53896c = c5983;
        this.f53895b = true;
    }

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f23785a.mo4231c(-1L);
    }

    @Override // p067l.InterfaceC7580, p067l.InterfaceC2925
    public final void accept(double d) {
        if (this.f53895b) {
            boolean zTest = this.f53896c.f14798t.test(d);
            this.f53895b = zTest;
            if (zTest) {
                this.f23785a.accept(d);
            }
        }
    }

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        return !this.f53895b || this.f23785a.mo4233f();
    }
}
