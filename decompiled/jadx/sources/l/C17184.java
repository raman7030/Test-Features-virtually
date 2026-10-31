package l;

/* JADX INFO: renamed from: l.ܿۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBF6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17184 extends AbstractC17890 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22390 f52673;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10626 f52674;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f52673.compareTo(((C17184) obj).f52673);
    }

    public C17184(C22390 c22390, int i, C20316 c20316, InterfaceC10711 interfaceC10711) {
        super(i);
        this.f52673 = c22390;
        if (c20316 == null) {
            this.f52674 = null;
        } else {
            this.f52674 = new C10626(c22390, c20316, (i & 8) != 0, interfaceC10711);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17184) && this.f52673.compareTo(((C17184) obj).f52673) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C17184.class.getName());
        sb.append('{');
        sb.append(C14712.m35006(m41857()));
        sb.append(' ');
        sb.append(this.f52673);
        C10626 c10626 = this.f52674;
        if (c10626 != null) {
            sb.append(' ');
            sb.append(c10626);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40424(C1662 c1662) {
        C21418 c21418M5627 = c1662.m5627();
        C4484 c4484M5620 = c1662.m5620();
        c21418M5627.m48540(this.f52673);
        C10626 c10626 = this.f52674;
        if (c10626 != null) {
            c4484M5620.m13220((AbstractC3073) c10626);
        }
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return this.f52673.mo2463();
    }

    @Override // l.AbstractC17890
    /* JADX INFO: renamed from: ֫ */
    public final int mo38844(C1662 c1662, C18241 c18241, int i, int i2) {
        C21418 c21418M5627 = c1662.m5627();
        C22390 c22390 = this.f52673;
        int iM48538 = c21418M5627.m48538((AbstractC16745) c22390);
        int i3 = iM48538 - i;
        int iM41857 = m41857();
        C10626 c10626 = this.f52674;
        int iM9390 = c10626 == null ? 0 : c10626.m9390();
        if ((iM9390 != 0) != ((iM41857 & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (c18241.m42506()) {
            c18241.m42501(0, String.format("  [%x] %s", Integer.valueOf(i2), c22390.mo2463()));
            c18241.m42501(C1080.m3668(i3), "    method_idx:   ".concat(C14712.m35008(iM48538)));
            c18241.m42501(C1080.m3668(iM41857), "    access_flags: " + C1724.m5775(iM41857));
            c18241.m42501(C1080.m3668(iM9390), "    code_off:     ".concat(C14712.m35008(iM9390)));
        }
        c18241.m42507(i3);
        c18241.m42507(iM41857);
        c18241.m42507(iM9390);
        return iM48538;
    }
}
