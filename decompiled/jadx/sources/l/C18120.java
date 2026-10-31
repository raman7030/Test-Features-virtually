package l;

/* JADX INFO: renamed from: l.ᩳܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18120 extends AbstractC6024 {
    public long b;
    public long c;
    public final /* synthetic */ C18826 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18120(C18826 c18826, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.d = c18826;
        this.b = c18826.s;
        long j = c18826.t;
        this.c = j < 0 ? C13132.FOREVER_NS : j;
    }

    @Override // l.AbstractC6024, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(AbstractC22331.a(j, this.d.s, this.c));
    }

    @Override // l.InterfaceC14696, l.InterfaceC0585
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 == 0) {
            long j3 = this.c;
            if (j3 > 0) {
                this.c = j3 - 1;
                this.a.accept(j);
                return;
            }
            return;
        }
        this.b = j2 - 1;
    }

    @Override // l.AbstractC6024, l.InterfaceC0585
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
