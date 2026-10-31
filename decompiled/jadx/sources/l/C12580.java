package l;

/* JADX INFO: renamed from: l.۫ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12580 extends AbstractC23827 {
    public long b;
    public long c;
    public final /* synthetic */ C17498 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12580(C17498 c17498, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.d = c17498;
        this.b = c17498.s;
        long j = c17498.t;
        this.c = j < 0 ? C13132.FOREVER_NS : j;
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(AbstractC22331.a(j, this.d.s, this.c));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(obj);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
