package l;

/* JADX INFO: renamed from: l.᩵ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19616 extends AbstractC1085 {
    public long b;
    public long c;
    public final /* synthetic */ C13264 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19616(C13264 c13264, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.d = c13264;
        this.b = c13264.s;
        long j = c13264.t;
        this.c = j < 0 ? C13132.FOREVER_NS : j;
    }

    @Override // l.AbstractC1085, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(AbstractC22331.a(j, this.d.s, this.c));
    }

    @Override // l.InterfaceC10422, l.InterfaceC0585
    public final void accept(int i) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(i);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // l.AbstractC1085, l.InterfaceC0585
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
