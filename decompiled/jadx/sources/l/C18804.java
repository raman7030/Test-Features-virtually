package l;

/* JADX INFO: renamed from: l.ᩴܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18804 extends AbstractC6024 implements InterfaceC19868 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C3281 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18804(C3281 c3281, InterfaceC0585 interfaceC0585, boolean z) {
        super(interfaceC0585);
        this.e = c3281;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // l.InterfaceC14696, l.InterfaceC0585
    public final void accept(long j) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.s.test(j);
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
            this.a.accept(j);
        }
    }

    @Override // l.InterfaceC19868
    public final long h() {
        return this.b;
    }
}
