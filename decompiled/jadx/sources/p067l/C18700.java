package p067l;

/* JADX INFO: renamed from: l.ܿۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBF6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18700 extends AbstractC19371 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final C23648 f55854;

    /* JADX INFO: renamed from: ᩹ */
    public final C12468 f55855;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f55854.compareTo(((C18700) obj).f55854);
    }

    public C18700(C23648 c23648, int i, C21677 c21677, InterfaceC12548 interfaceC12548) {
        super(i);
        this.f55854 = c23648;
        if (c21677 == null) {
            this.f55855 = null;
        } else {
            this.f55855 = new C12468(c23648, c21677, (i & 8) != 0, interfaceC12548);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C18700) && this.f55854.compareTo(((C18700) obj).f55854) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C18700.class.getName());
        sb.append('{');
        sb.append(C16351.m37153(m44104()));
        sb.append(' ');
        sb.append(this.f55854);
        C12468 c12468 = this.f55855;
        if (c12468 != null) {
            sb.append(' ');
            sb.append(c12468);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42669(C3948 c3948) {
        C22724 c22724M7857 = c3948.m7857();
        C6630 c6630M7850 = c3948.m7850();
        c22724M7857.m50876(this.f55854);
        C12468 c12468 = this.f55855;
        if (c12468 != null) {
            c6630M7850.m15102((AbstractC5289) c12468);
        }
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f55854.mo4819();
    }

    @Override // p067l.AbstractC19371
    /* JADX INFO: renamed from: ֫ */
    public final int mo41070(C3948 c3948, C19705 c19705, int i, int i2) {
        C22724 c22724M7857 = c3948.m7857();
        C23648 c23648 = this.f55854;
        int iM50874 = c22724M7857.m50874((AbstractC18283) c23648);
        int i3 = iM50874 - i;
        int iM44104 = m44104();
        C12468 c12468 = this.f55855;
        int iM11432 = c12468 == null ? 0 : c12468.m11432();
        if ((iM11432 != 0) != ((iM44104 & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (c19705.m44765()) {
            c19705.m44760(0, String.format("  [%x] %s", Integer.valueOf(i2), c23648.mo4819()));
            c19705.m44760(C3395.m5939(i3), "    method_idx:   ".concat(C16351.m37155(iM50874)));
            c19705.m44760(C3395.m5939(iM44104), "    access_flags: " + C4007.m7985(iM44104));
            c19705.m44760(C3395.m5939(iM11432), "    code_off:     ".concat(C16351.m37155(iM11432)));
        }
        c19705.m44766(i3);
        c19705.m44766(iM44104);
        c19705.m44766(iM11432);
        return iM50874;
    }
}
