package l;

/* JADX INFO: renamed from: l.᩸ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04J6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21611 extends AbstractC2541 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f69388;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f69389;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f69390;

    public C21611(C12918 c12918, int i) {
        this.f69389 = c12918;
        this.f69390 = i;
        C1149 c1149M31417 = c12918.m31417(8);
        if (c1149M31417 != null && i < c1149M31417.m3946()) {
            this.f69388 = (i * 8) + c1149M31417.m3947();
            return;
        }
        throw new C4452(null, "Method handle index out of bounds: %d", Integer.valueOf(i));
    }

    @Override // l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ۧ */
    public final int mo2849() {
        return this.f69389.m31418().m11936(this.f69388);
    }

    @Override // l.InterfaceC19583
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC8293 mo2850() {
        C12918 c12918 = this.f69389;
        int iM11936 = c12918.m31418().m11936(this.f69388 + 4);
        switch (mo2849()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C15259(c12918, iM11936);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return c12918.m31409(iM11936);
            default:
                throw new C15431(null, "Invalid method handle type: %d", Integer.valueOf(mo2849()));
        }
    }

    @Override // l.AbstractC19475, l.InterfaceC8293
    /* JADX INFO: renamed from: ܿ */
    public final void mo10018() throws C1237 {
        int i = this.f69390;
        if (i >= 0) {
            C1149 c1149M31417 = this.f69389.m31417(8);
            if (i < (c1149M31417 == null ? 0 : c1149M31417.m3946())) {
                try {
                    mo2850();
                    return;
                } catch (C15431 e) {
                    throw new C1237(C19370.m44628(i, "methodhandle@"), e);
                }
            }
        }
        throw new C1237(C19370.m44628(i, "methodhandle@"));
    }
}
