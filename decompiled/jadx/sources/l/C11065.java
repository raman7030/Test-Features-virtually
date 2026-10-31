package l;

/* JADX INFO: renamed from: l.ۧܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11065 extends AbstractC2598 {
    public final Object[] c;

    public C11065(InterfaceC5214 interfaceC5214, Object[] objArr) {
        super(interfaceC5214);
        this.c = objArr;
    }

    public C11065(C11065 c11065, InterfaceC5214 interfaceC5214, int i) {
        super(c11065, interfaceC5214, i);
        this.c = c11065.c;
    }

    @Override // l.AbstractC2598
    public final AbstractC2598 b(int i, int i2) {
        return new C11065(this, this.a.a(i), i2);
    }

    @Override // l.AbstractC2598
    public final void a() {
        this.a.k(this.c, this.b);
    }
}
