package p067l;

/* JADX INFO: renamed from: l.ᩴܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20240 extends AbstractC8094 implements InterfaceC21251 {

    /* JADX INFO: renamed from: b */
    public long f62571b;

    /* JADX INFO: renamed from: c */
    public boolean f62572c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f62573d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5487 f62574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20240(C5487 c5487, InterfaceC2925 interfaceC2925, boolean z) {
        super(interfaceC2925);
        this.f62574e = c5487;
        this.f62573d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // p067l.InterfaceC16336, p067l.InterfaceC2925
    public final void accept(long j) {
        boolean z;
        if (this.f62572c) {
            z = true;
        } else {
            boolean zTest = this.f62574e.f13131s.test(j);
            this.f62572c = !zTest;
            if (zTest) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = this.f62573d;
        if (z2 && !z) {
            this.f62571b++;
        }
        if (z2 || z) {
            this.f21348a.accept(j);
        }
    }

    @Override // p067l.InterfaceC21251
    /* JADX INFO: renamed from: h */
    public final long mo6574h() {
        return this.f62571b;
    }
}
