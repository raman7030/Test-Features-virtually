package l;

/* JADX INFO: renamed from: l.۬ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8M4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13236 implements InterfaceC18882 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18882 f39624;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f39625;

    public C13236(InterfaceC18882 interfaceC18882, long j) {
        this.f39624 = interfaceC18882;
        this.f39625 = j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18882 m32097() {
        return this.f39624;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6412() {
        return this.f39624.mo6412();
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final void mo6411() {
        this.f39624.mo6411();
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final int mo6410(C3002 c3002, C21843 c21843, int i) {
        int iMo6410 = this.f39624.mo6410(c3002, c21843, i);
        if (iMo6410 == -4) {
            c21843.f69997 += this.f39625;
        }
        return iMo6410;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final int mo6409(long j) {
        return this.f39624.mo6409(j - this.f39625);
    }
}
