package p067l;

/* JADX INFO: renamed from: l.ۨۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470D */
/* JADX INFO: loaded from: classes3.dex */
public final class C13260 {

    /* JADX INFO: renamed from: ֫ */
    public final C13930 f37230;

    /* JADX INFO: renamed from: ۧ */
    public final C14600 f37231;

    public C13260(C13930 c13930) {
        C12826.requireNonNull(c13930);
        this.f37230 = c13930;
        this.f37231 = new C14600(c13930);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11919 m30312(C16611 c16611) {
        int i;
        int i2;
        int iM31691;
        int iM37659;
        C6554 c6554M33391 = this.f37231.m33391(c16611);
        if (c16611.m37662()) {
            return new C11919(-1, -1, -1, -1, EnumC7895.NO_CHANGE, c6554M33391);
        }
        if (c6554M33391.m14996()) {
            return new C11919(0, 0, -1, -1, EnumC7895.UNKNOWN_DEPENDENCY, c6554M33391);
        }
        int iM37657 = c16611.m37657();
        C13930 c13930 = this.f37230;
        int iM31694 = c13930.m31694(iM37657);
        for (int i3 = 0; i3 < c6554M33391.m14997(); i3++) {
            iM31694 = Math.min(iM31694, c13930.m31695(c6554M33391.m14995(i3)));
        }
        int iM14994 = c6554M33391.m14994();
        if (iM14994 >= c13930.m31692() || (iM31691 = c13930.m31691(Math.max(c16611.m37666(c16611.m37660() - 1), iM14994 + 1))) < 0 || iM31691 >= c13930.m31692() || (iM37659 = c16611.m37659(iM31691, EnumC3200.AFTER)) < 0 || iM37659 >= c16611.m37665() || c13930.m31692() - iM31691 != c16611.m37665() - iM37659) {
            i = -1;
            i2 = -1;
        } else {
            i = iM31691;
            i2 = iM37659;
        }
        return new C11919(iM31694, c16611.m37659(iM31694, EnumC3200.BEFORE), i, i2, c6554M33391.m14997() == 0 ? EnumC7895.LOCAL_CHANGE : EnumC7895.AFFECTED_DEPENDENCY, c6554M33391);
    }
}
