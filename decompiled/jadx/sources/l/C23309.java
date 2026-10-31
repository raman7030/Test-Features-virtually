package l;

/* JADX INFO: renamed from: l.᩺᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23309 extends AbstractC0275 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1505 f74924;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f74925;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f74926;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f74927;

    public C23309(C1505 c1505, String str, String str2) {
        this.f74924 = c1505;
        this.f74925 = str;
        this.f74927 = str2;
        this.f74926 = C23852.m52567(new C12021(c1505.m5185(1), c1505));
    }

    @Override // l.AbstractC0275
    /* JADX INFO: renamed from: ܳ */
    public final C13864 mo1613() {
        String str = this.f74925;
        if (str == null) {
            return null;
        }
        try {
            return C13864.m33217(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l.AbstractC0275
    /* JADX INFO: renamed from: ᩳ */
    public final long mo1615() {
        try {
            String str = this.f74927;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1L;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // l.AbstractC0275
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC6171 mo1616() {
        return this.f74926;
    }
}
