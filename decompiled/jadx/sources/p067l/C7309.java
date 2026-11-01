package p067l;

/* JADX INFO: renamed from: l.ۚ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: NAQ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7309 implements InterfaceC22580 {

    /* JADX INFO: renamed from: ᩶ */
    public static C2582 f19134 = new C2582(200);

    /* JADX INFO: renamed from: ᩸ */
    public int f19135;

    /* JADX INFO: renamed from: ᩹ */
    public int f19136;

    @Override // p067l.InterfaceC9838
    /* JADX INFO: renamed from: ܽ */
    public final int mo10470() {
        return 10;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7309 m16882(int i, int i2) {
        C7309 c7309 = (C7309) f19134.m3892();
        if (c7309 != null) {
            c7309.f19135 = i;
            c7309.f19136 = i2;
            return c7309;
        }
        C7309 c73010 = new C7309();
        c73010.f19135 = i;
        c73010.f19136 = i2;
        return c73010;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m16883() {
        f19134.m3890(this);
    }

    @Override // p067l.InterfaceC9838
    /* JADX INFO: renamed from: ᩳ */
    public final int mo16884() {
        return this.f19135;
    }

    @Override // p067l.InterfaceC22580
    public final int getLineNumber() {
        return this.f19136;
    }
}
