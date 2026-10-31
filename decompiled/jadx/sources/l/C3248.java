package l;

/* JADX INFO: renamed from: l.ۗ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8L1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3248 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15894 f10204;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f10205;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f10206;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f10207;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13125 f10208;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f10209;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f10210;

    public C3248(C13125 c13125, String str, int i, C15894 c15894) {
        this.f10208 = c13125;
        this.f10209 = str;
        this.f10206 = i;
        this.f10210 = c15894 == null ? -1L : c15894.f49111;
        if (c15894 == null || !c15894.m37669()) {
            return;
        }
        this.f10204 = c15894;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9945(AbstractC4846 abstractC4846, AbstractC4846 abstractC4847) {
        C15894 c15894;
        int i = this.f10206;
        if (i >= abstractC4846.mo14107()) {
            if (i >= abstractC4847.mo14107()) {
                i = -1;
                break;
            }
        } else {
            C13125 c13125 = this.f10208;
            abstractC4846.m14106(i, c13125.f39271);
            int i2 = c13125.f39271.f65760;
            while (true) {
                if (i2 > c13125.f39271.f65752) {
                    i = -1;
                    break;
                }
                int iMo14098 = abstractC4847.mo14098(abstractC4846.mo14102(i2));
                if (iMo14098 != -1) {
                    i = abstractC4847.mo14104(iMo14098, c13125.f39269, false).f72806;
                    break;
                }
                i2++;
            }
        }
        this.f10206 = i;
        return i != -1 && ((c15894 = this.f10204) == null || abstractC4847.mo14098(c15894.f49112) != -1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9943(int i, C15894 c15894) {
        if (c15894 == null) {
            return i == this.f10206;
        }
        long j = c15894.f49111;
        C15894 c15895 = this.f10204;
        if (c15895 == null) {
            return !c15894.m37669() && j == this.f10210;
        }
        return j == c15895.f49111 && c15894.f49108 == c15895.f49108 && c15894.f49109 == c15895.f49109;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9946(int i, C15894 c15894) {
        if (this.f10210 == -1 && i == this.f10206 && c15894 != null) {
            long j = c15894.f49111;
            if (j >= this.f10208.m31789()) {
                this.f10210 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9944(C0425 c0425) {
        C15894 c15894 = c0425.f1895;
        AbstractC4846 abstractC4846 = c0425.f1892;
        if (c15894 == null) {
            return this.f10206 != c0425.f1893;
        }
        long j = this.f10210;
        if (j == -1) {
            return false;
        }
        if (c15894.f49111 > j) {
            return true;
        }
        C15894 c15895 = this.f10204;
        if (c15895 == null) {
            return false;
        }
        int i = c15895.f49108;
        int iMo14098 = abstractC4846.mo14098(c15894.f49112);
        int iMo14099 = abstractC4846.mo14098(c15895.f49112);
        if (c15894.f49111 < c15895.f49111 || iMo14098 < iMo14099) {
            return false;
        }
        if (iMo14098 > iMo14099) {
            return true;
        }
        if (c15894.m37669()) {
            int i2 = c15894.f49108;
            int i3 = c15894.f49109;
            if (i2 <= i) {
                return i2 == i && i3 > c15895.f49109;
            }
            return true;
        }
        int i4 = c15894.f49110;
        return i4 == -1 || i4 > i;
    }
}
