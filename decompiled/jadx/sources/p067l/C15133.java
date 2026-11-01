package p067l;

/* JADX INFO: renamed from: l.۬᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15133 extends AbstractC8094 {

    /* JADX INFO: renamed from: b */
    public boolean f43211b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C19569 f43212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15133(C19569 c19569, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f43212c = c19569;
        this.f43211b = true;
    }

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f21348a.mo4231c(-1L);
    }

    @Override // p067l.InterfaceC16336, p067l.InterfaceC2925
    public final void accept(long j) {
        if (this.f43211b) {
            boolean zTest = this.f43212c.f59564s.test(j);
            this.f43211b = zTest;
            if (zTest) {
                this.f21348a.accept(j);
            }
        }
    }

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        return !this.f43211b || this.f21348a.mo4233f();
    }
}
