package l;

/* JADX INFO: renamed from: l.۟᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7777 implements InterfaceC17066 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f24029;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17066 f24030;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f24031;

    public /* synthetic */ C7777(InterfaceC17066 interfaceC17066, boolean z, AbstractActivityC3346 abstractActivityC3346) {
        this.f24030 = interfaceC17066;
        this.f24031 = z;
        this.f24029 = abstractActivityC3346;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        if (this.f24030.mo1526()) {
            return true;
        }
        if (!this.f24031) {
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f24029;
        return abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed();
    }
}
