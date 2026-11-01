package p067l;

/* JADX INFO: renamed from: l.֨ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3576 extends AbstractC25014 implements InterfaceC21251 {

    /* JADX INFO: renamed from: b */
    public long f7260b;

    /* JADX INFO: renamed from: c */
    public boolean f7261c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f7262d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C8941 f7263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3576(C8941 c8941, InterfaceC2925 interfaceC2925, boolean z) {
        super(interfaceC2925);
        this.f7263e = c8941;
        this.f7262d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        if (this.f7261c) {
            z = true;
        } else {
            boolean zTest = this.f7263e.f24232t.test(obj);
            this.f7261c = !zTest;
            if (zTest) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = this.f7262d;
        if (z2 && !z) {
            this.f7260b++;
        }
        if (z2 || z) {
            this.f79851a.accept(obj);
        }
    }

    @Override // p067l.InterfaceC21251
    /* JADX INFO: renamed from: h */
    public final long mo6574h() {
        return this.f7260b;
    }
}
