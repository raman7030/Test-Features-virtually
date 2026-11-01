package p067l;

/* JADX INFO: renamed from: l.ۚܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7520 extends AbstractC3400 implements InterfaceC21251 {

    /* JADX INFO: renamed from: b */
    public long f19748b;

    /* JADX INFO: renamed from: c */
    public boolean f19749c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f19750d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C21170 f19751e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7520(C21170 c21170, InterfaceC2925 interfaceC2925, boolean z) {
        super(interfaceC2925);
        this.f19751e = c21170;
        this.f19750d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // p067l.InterfaceC12274, p067l.InterfaceC2925
    public final void accept(int i) {
        boolean z;
        if (this.f19749c) {
            z = true;
        } else {
            boolean zTest = this.f19751e.f66523s.test(i);
            this.f19749c = !zTest;
            if (zTest) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = this.f19750d;
        if (z2 && !z) {
            this.f19748b++;
        }
        if (z2 || z) {
            this.f6750a.accept(i);
        }
    }

    @Override // p067l.InterfaceC21251
    /* JADX INFO: renamed from: h */
    public final long mo6574h() {
        return this.f19748b;
    }
}
