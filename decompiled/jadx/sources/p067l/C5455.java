package p067l;

/* JADX INFO: renamed from: l.ۗ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8L1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5455 {

    /* JADX INFO: renamed from: ֫ */
    public C17474 f13013;

    /* JADX INFO: renamed from: ۧ */
    public boolean f13014;

    /* JADX INFO: renamed from: ܳ */
    public int f13015;

    /* JADX INFO: renamed from: ܽ */
    public boolean f13016;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C14842 f13017;

    /* JADX INFO: renamed from: ᩳ */
    public final String f13018;

    /* JADX INFO: renamed from: ᩻ */
    public long f13019;

    public C5455(C14842 c14842, String str, int i, C17474 c17474) {
        this.f13017 = c14842;
        this.f13018 = str;
        this.f13015 = i;
        this.f13019 = c17474 == null ? -1L : c17474.f52251;
        if (c17474 == null || !c17474.m39842()) {
            return;
        }
        this.f13013 = c17474;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m11978(AbstractC6974 abstractC6974, AbstractC6974 abstractC6975) {
        C17474 c17474;
        int i = this.f13015;
        if (i >= abstractC6974.mo15987()) {
            if (i >= abstractC6975.mo15987()) {
                i = -1;
                break;
            }
        } else {
            C14842 c14842 = this.f13017;
            abstractC6974.m15986(i, c14842.f42326);
            int i2 = c14842.f42326.f68436;
            while (true) {
                if (i2 > c14842.f42326.f68428) {
                    i = -1;
                    break;
                }
                int iMo15978 = abstractC6975.mo15978(abstractC6974.mo15982(i2));
                if (iMo15978 != -1) {
                    i = abstractC6975.mo15984(iMo15978, c14842.f42324, false).f75532;
                    break;
                }
                i2++;
            }
        }
        this.f13015 = i;
        return i != -1 && ((c17474 = this.f13013) == null || abstractC6975.mo15978(c17474.f52252) != -1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m11976(int i, C17474 c17474) {
        if (c17474 == null) {
            return i == this.f13015;
        }
        long j = c17474.f52251;
        C17474 c17475 = this.f13013;
        if (c17475 == null) {
            return !c17474.m39842() && j == this.f13019;
        }
        return j == c17475.f52251 && c17474.f52248 == c17475.f52248 && c17474.f52249 == c17475.f52249;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11979(int i, C17474 c17474) {
        if (this.f13019 == -1 && i == this.f13015 && c17474 != null) {
            long j = c17474.f52251;
            if (j >= this.f13017.m33881()) {
                this.f13019 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m11977(C2772 c2772) {
        C17474 c17474 = c2772.f4671;
        AbstractC6974 abstractC6974 = c2772.f4668;
        if (c17474 == null) {
            return this.f13015 != c2772.f4669;
        }
        long j = this.f13019;
        if (j == -1) {
            return false;
        }
        if (c17474.f52251 > j) {
            return true;
        }
        C17474 c17475 = this.f13013;
        if (c17475 == null) {
            return false;
        }
        int i = c17475.f52248;
        int iMo15978 = abstractC6974.mo15978(c17474.f52252);
        int iMo15979 = abstractC6974.mo15978(c17475.f52252);
        if (c17474.f52251 < c17475.f52251 || iMo15978 < iMo15979) {
            return false;
        }
        if (iMo15978 > iMo15979) {
            return true;
        }
        if (c17474.m39842()) {
            int i2 = c17474.f52248;
            int i3 = c17474.f52249;
            if (i2 <= i) {
                return i2 == i && i3 > c17475.f52249;
            }
            return true;
        }
        int i4 = c17474.f52250;
        return i4 == -1 || i4 > i;
    }
}
