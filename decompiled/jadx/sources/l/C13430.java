package l;

/* JADX INFO: renamed from: l.۬᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13430 extends AbstractC6024 {
    public boolean b;
    public final /* synthetic */ C18098 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13430(C18098 c18098, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.c = c18098;
        this.b = true;
    }

    @Override // l.AbstractC6024, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC14696, l.InterfaceC0585
    public final void accept(long j) {
        if (this.b) {
            boolean zTest = this.c.s.test(j);
            this.b = zTest;
            if (zTest) {
                this.a.accept(j);
            }
        }
    }

    @Override // l.AbstractC6024, l.InterfaceC0585
    public final boolean f() {
        return !this.b || this.a.f();
    }
}
