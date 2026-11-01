package p067l;

/* JADX INFO: renamed from: l.ۧ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12533 extends AbstractC8765 implements InterfaceC21251 {

    /* JADX INFO: renamed from: b */
    public long f35161b;

    /* JADX INFO: renamed from: c */
    public boolean f35162c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f35163d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5983 f35164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12533(C5983 c5983, InterfaceC2925 interfaceC2925, boolean z) {
        super(interfaceC2925);
        this.f35164e = c5983;
        this.f35163d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // p067l.InterfaceC7580, p067l.InterfaceC2925
    public final void accept(double d) {
        boolean z;
        if (this.f35162c) {
            z = true;
        } else {
            boolean zTest = this.f35164e.f14798t.test(d);
            this.f35162c = !zTest;
            if (zTest) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = this.f35163d;
        if (z2 && !z) {
            this.f35161b++;
        }
        if (z2 || z) {
            this.f23785a.accept(d);
        }
    }

    @Override // p067l.InterfaceC21251
    /* JADX INFO: renamed from: h */
    public final long mo6574h() {
        return this.f35161b;
    }
}
