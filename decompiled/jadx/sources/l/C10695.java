package l;

/* JADX INFO: renamed from: l.ۧ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10695 extends AbstractC6730 implements InterfaceC19868 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C3803 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10695(C3803 c3803, InterfaceC0585 interfaceC0585, boolean z) {
        super(interfaceC0585);
        this.e = c3803;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // l.InterfaceC5483, l.InterfaceC0585
    public final void accept(double d) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.t.test(d);
            this.c = !zTest;
            if (zTest) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = this.d;
        if (z2 && !z) {
            this.b++;
        }
        if (z2 || z) {
            this.a.accept(d);
        }
    }

    @Override // l.InterfaceC19868
    public final long h() {
        return this.b;
    }
}
