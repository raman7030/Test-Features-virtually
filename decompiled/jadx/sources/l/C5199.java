package l;

/* JADX INFO: renamed from: l.ۚ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: NAQ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5199 implements InterfaceC21267 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static C0225 f16293 = new C0225(200);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f16294;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f16295;

    @Override // l.InterfaceC7860
    /* JADX INFO: renamed from: ܽ */
    public final int mo8424() {
        return 10;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5199 m14972(int i, int i2) {
        C5199 c5199 = (C5199) f16293.m1479();
        if (c5199 != null) {
            c5199.f16294 = i;
            c5199.f16295 = i2;
            return c5199;
        }
        C5199 c51910 = new C5199();
        c51910.f16294 = i;
        c51910.f16295 = i2;
        return c51910;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m14973() {
        f16293.m1477(this);
    }

    @Override // l.InterfaceC7860
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo14974() {
        return this.f16294;
    }

    @Override // l.InterfaceC21267
    public final int getLineNumber() {
        return this.f16295;
    }
}
