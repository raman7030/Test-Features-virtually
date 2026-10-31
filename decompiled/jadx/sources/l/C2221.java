package l;

/* JADX INFO: renamed from: l.ۖ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8LH */
/* JADX INFO: loaded from: classes2.dex */
public final class C2221 implements InterfaceC18882 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18882 f7269;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f7270;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3632 f7271;

    public C2221(C3632 c3632, InterfaceC18882 interfaceC18882) {
        this.f7271 = c3632;
        this.f7269 = interfaceC18882;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7396() {
        this.f7270 = false;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6412() {
        return !this.f7271.m11125() && this.f7269.mo6412();
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final void mo6411() {
        this.f7269.mo6411();
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final int mo6410(C3002 c3002, C21843 c21843, int i) {
        C3632 c3632 = this.f7271;
        if (c3632.m11125()) {
            return -3;
        }
        if (this.f7270) {
            c21843.m12693(4);
            return -4;
        }
        long jMo2266 = c3632.mo2266();
        int iMo6410 = this.f7269.mo6410(c3002, c21843, i);
        if (iMo6410 == -5) {
            C8353 c8353 = c3002.f9455;
            c8353.getClass();
            int i2 = c8353.f25630;
            int i3 = c8353.f25629;
            if (i3 == 0 && i2 == 0) {
                return -5;
            }
            if (c3632.f11482 != 0) {
                i3 = 0;
            }
            if (c3632.f11484 != Long.MIN_VALUE) {
                i2 = 0;
            }
            C1297 c1297M21948 = c8353.m21948();
            c1297M21948.m4477(i3);
            c1297M21948.m4458(i2);
            c3002.f9455 = c1297M21948.m4440();
            return -5;
        }
        long j = c3632.f11484;
        if (j == Long.MIN_VALUE || ((iMo6410 != -4 || c21843.f69997 < j) && !(iMo6410 == -3 && jMo2266 == Long.MIN_VALUE && !c21843.f69996))) {
            return iMo6410;
        }
        c21843.mo7();
        c21843.m12693(4);
        this.f7270 = true;
        return -4;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final int mo6409(long j) {
        if (this.f7271.m11125()) {
            return -3;
        }
        return this.f7269.mo6409(j);
    }
}
