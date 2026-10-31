package l;

/* JADX INFO: renamed from: l.ۙܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C4798 extends AbstractC2598 {
    public final Object c;

    public C4798(InterfaceC23558 interfaceC23558, Object obj) {
        super(interfaceC23558);
        this.c = obj;
    }

    public C4798(C4798 c4798, InterfaceC23558 interfaceC23558, int i) {
        super(c4798, interfaceC23558, i);
        this.c = c4798.c;
    }

    @Override // l.AbstractC2598
    public final AbstractC2598 b(int i, int i2) {
        return new C4798(this, ((InterfaceC23558) this.a).a(i), i2);
    }

    @Override // l.AbstractC2598
    public final void a() {
        ((InterfaceC23558) this.a).e(this.b, this.c);
    }
}
