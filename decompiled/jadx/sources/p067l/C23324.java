package p067l;

/* JADX INFO: renamed from: l.᩹ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K4XP */
/* JADX INFO: loaded from: classes.dex */
public final class C23324 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public C23994 f73395;

    /* JADX INFO: renamed from: ۙ */
    public String f73396;

    /* JADX INFO: renamed from: ۤ */
    public C14606 f73397;

    /* JADX INFO: renamed from: ۫ */
    public C13266 f73398;

    /* JADX INFO: renamed from: ۬ */
    public int f73399;

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return i + 8;
    }

    public C23324(C5651 c5651) {
        super(c5651);
        this.f73399 = 0;
        this.f73396 = null;
    }

    public C23324(C5651 c5651, C23994 c23994, C14606 c14606, C13266 c13266) {
        this(c5651);
        this.f73395 = c23994;
        this.f73397 = c14606;
        this.f73398 = c13266;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23324 m51947(C5651 c5651, C23994 c23994, C14606 c14606, C13266 c13266) {
        return (C23324) c5651.f13730.m27254(new C23324(c5651, c23994, c14606, c13266));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23324 m51949(C5651 c5651) {
        return (C23324) c5651.f13730.m27254(new C23324(c5651, C23994.m53164(this.f73395.m53168(), c5651), this.f73397.m33397(c5651), C13266.m30314(this.f73398.m30317(), c5651)));
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        C5651 c5651 = this.f18865;
        this.f73395 = (C23994) c5651.f13727.m3722(c12556.m28947());
        this.f73397 = (C14606) c5651.f13732.m3722(c12556.m28947());
        this.f73398 = (C13266) c5651.f13748.m3722(c12556.m28944());
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7533(this.f73395.f18866);
        c3838.m7533(this.f73397.f18866);
        c3838.m7531(this.f73398.f18866);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return "method_id_item: " + m51950();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C23324 c23324) {
        int iM53165 = this.f73395.compareTo(c23324.f73395);
        if (iM53165 != 0) {
            return iM53165;
        }
        int iCompareTo = this.f73398.compareTo(c23324.f73398);
        return iCompareTo != 0 ? iCompareTo : this.f73397.compareTo(c23324.f73397);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m51950() {
        if (this.f73396 == null) {
            String strM53168 = this.f73395.m53168();
            String strM30317 = this.f73398.m30317();
            String strM33398 = this.f73397.m33398();
            StringBuilder sb = new StringBuilder(strM33398.length() + strM30317.length() + strM53168.length() + 2);
            sb.append(strM53168);
            sb.append("->");
            sb.append(strM30317);
            sb.append(strM33398);
            this.f73396 = sb.toString();
        }
        return this.f73396;
    }

    public final int hashCode() {
        if (this.f73399 == 0) {
            int iHashCode = this.f73395.hashCode();
            this.f73399 = iHashCode;
            int iHashCode2 = this.f73397.hashCode() + (iHashCode * 31);
            this.f73399 = iHashCode2;
            this.f73399 = this.f73398.hashCode() + (iHashCode2 * 31);
        }
        return this.f73399;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23324.class.equals(obj.getClass())) {
            C23324 c23324 = (C23324) obj;
            if (this.f73395 == c23324.f73395 && this.f73397 == c23324.f73397 && this.f73398 == c23324.f73398) {
                return true;
            }
        }
        return false;
    }
}
