package l;

/* JADX INFO: renamed from: l.ۚܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5420 extends AbstractC1085 implements InterfaceC19868 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C19782 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5420(C19782 c19782, InterfaceC0585 interfaceC0585, boolean z) {
        super(interfaceC0585);
        this.e = c19782;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // l.InterfaceC10422, l.InterfaceC0585
    public final void accept(int i) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.s.test(i);
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
            this.a.accept(i);
        }
    }

    @Override // l.InterfaceC19868
    public final long h() {
        return this.b;
    }
}
