package l;

/* JADX INFO: renamed from: l.ۨۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470D */
/* JADX INFO: loaded from: classes3.dex */
public final class C11460 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12165 f34234;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12870 f34235;

    public C11460(C12165 c12165) {
        C11003.requireNonNull(c12165);
        this.f34234 = c12165;
        this.f34235 = new C12870(c12165);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10049 m28268(C14986 c14986) {
        int i;
        int i2;
        int iM29629;
        int iM35503;
        C4404 c4404M31305 = this.f34235.m31305(c14986);
        if (c14986.m35506()) {
            return new C10049(-1, -1, -1, -1, EnumC5815.NO_CHANGE, c4404M31305);
        }
        if (c4404M31305.m13132()) {
            return new C10049(0, 0, -1, -1, EnumC5815.UNKNOWN_DEPENDENCY, c4404M31305);
        }
        int iM35501 = c14986.m35501();
        C12165 c12165 = this.f34234;
        int iM29632 = c12165.m29632(iM35501);
        for (int i3 = 0; i3 < c4404M31305.m13133(); i3++) {
            iM29632 = Math.min(iM29632, c12165.m29633(c4404M31305.m13131(i3)));
        }
        int iM13130 = c4404M31305.m13130();
        if (iM13130 >= c12165.m29630() || (iM29629 = c12165.m29629(Math.max(c14986.m35510(c14986.m35504() - 1), iM13130 + 1))) < 0 || iM29629 >= c12165.m29630() || (iM35503 = c14986.m35503(iM29629, EnumC0875.AFTER)) < 0 || iM35503 >= c14986.m35509() || c12165.m29630() - iM29629 != c14986.m35509() - iM35503) {
            i = -1;
            i2 = -1;
        } else {
            i = iM29629;
            i2 = iM35503;
        }
        return new C10049(iM29632, c14986.m35503(iM29632, EnumC0875.BEFORE), i, i2, c4404M31305.m13133() == 0 ? EnumC5815.LOCAL_CHANGE : EnumC5815.AFFECTED_DEPENDENCY, c4404M31305);
    }
}
