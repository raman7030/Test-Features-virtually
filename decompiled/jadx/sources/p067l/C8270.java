package p067l;

/* JADX INFO: renamed from: l.ۛܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8270 extends AbstractC3400 {

    /* JADX INFO: renamed from: b */
    public boolean f21909b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C24954 f21910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8270(C24954 c24954, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f21910c = c24954;
        this.f21909b = true;
    }

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f6750a.mo4231c(-1L);
    }

    @Override // p067l.InterfaceC12274, p067l.InterfaceC2925
    public final void accept(int i) {
        if (this.f21909b) {
            boolean zTest = this.f21910c.f79680s.test(i);
            this.f21909b = zTest;
            if (zTest) {
                this.f6750a.accept(i);
            }
        }
    }

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        return !this.f21909b || this.f6750a.mo4233f();
    }
}
