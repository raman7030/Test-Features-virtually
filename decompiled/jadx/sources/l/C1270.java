package l;

/* JADX INFO: renamed from: l.֨ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1270 extends AbstractC23827 implements InterfaceC19868 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C6915 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1270(C6915 c6915, InterfaceC0585 interfaceC0585, boolean z) {
        super(interfaceC0585);
        this.e = c6915;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.t.test(obj);
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
            this.a.accept(obj);
        }
    }

    @Override // l.InterfaceC19868
    public final long h() {
        return this.b;
    }
}
