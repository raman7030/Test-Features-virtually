package l;

/* JADX INFO: renamed from: l.ܽ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16502 extends AbstractC6730 {
    public boolean b;
    public final /* synthetic */ C3803 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16502(C3803 c3803, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.c = c3803;
        this.b = true;
    }

    @Override // l.AbstractC6730, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC5483, l.InterfaceC0585
    public final void accept(double d) {
        if (this.b) {
            boolean zTest = this.c.t.test(d);
            this.b = zTest;
            if (zTest) {
                this.a.accept(d);
            }
        }
    }

    @Override // l.AbstractC6730, l.InterfaceC0585
    public final boolean f() {
        return !this.b || this.a.f();
    }
}
