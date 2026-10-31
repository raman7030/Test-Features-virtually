package l;

/* JADX INFO: renamed from: l.ۖ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2848 extends AbstractC6730 {
    public long b;
    public long c;
    public final /* synthetic */ C20487 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2848(C20487 c20487, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.d = c20487;
        this.b = c20487.s;
        long j = c20487.t;
        this.c = j < 0 ? C13132.FOREVER_NS : j;
    }

    @Override // l.AbstractC6730, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(AbstractC22331.a(j, this.d.s, this.c));
    }

    @Override // l.InterfaceC5483, l.InterfaceC0585
    public final void accept(double d) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(d);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // l.AbstractC6730, l.InterfaceC0585
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
