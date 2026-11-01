package p067l;

/* JADX INFO: renamed from: l.ᩴۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4GR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19971 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public C23994 f60615;

    /* JADX INFO: renamed from: ۙ */
    public String f60616;

    /* JADX INFO: renamed from: ۤ */
    public int f60617;

    /* JADX INFO: renamed from: ۫ */
    public C23994 f60618;

    /* JADX INFO: renamed from: ۬ */
    public C13266 f60619;

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return i + 8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C19971 c19971 = (C19971) obj;
        int iM53165 = this.f60615.compareTo(c19971.f60615);
        if (iM53165 != 0) {
            return iM53165;
        }
        int iCompareTo = this.f60619.compareTo(c19971.f60619);
        return iCompareTo != 0 ? iCompareTo : this.f60618.compareTo(c19971.f60618);
    }

    public C19971(C5651 c5651) {
        super(c5651);
        this.f60617 = 0;
        this.f60616 = null;
    }

    public C19971(C5651 c5651, C23994 c23994, C23994 c23995, C13266 c13266) {
        this(c5651);
        this.f60615 = c23994;
        this.f60618 = c23995;
        this.f60619 = c13266;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19971 m45319(C5651 c5651, C23994 c23994, C23994 c23995, C13266 c13266) {
        return (C19971) c5651.f13738.m27254(new C19971(c5651, c23994, c23995, c13266));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19971 m45320(C5651 c5651) {
        return (C19971) c5651.f13738.m27254(new C19971(c5651, C23994.m53164(this.f60615.m53168(), c5651), C23994.m53164(this.f60618.m53168(), c5651), C13266.m30314(this.f60619.m30317(), c5651)));
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        C5651 c5651 = this.f18865;
        this.f60615 = (C23994) c5651.f13727.m3722(c12556.m28947());
        this.f60618 = (C23994) c5651.f13727.m3722(c12556.m28947());
        this.f60619 = (C13266) c5651.f13748.m3722(c12556.m28944());
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7533(this.f60615.f18866);
        c3838.m7533(this.f60618.f18866);
        c3838.m7531(this.f60619.f18866);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return m45321();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m45321() {
        if (this.f60616 == null) {
            String strM53168 = this.f60615.m53168();
            String strM30317 = this.f60619.m30317();
            String strM53169 = this.f60618.m53168();
            StringBuffer stringBuffer = new StringBuffer(strM53169.length() + strM30317.length() + strM53168.length() + 3);
            stringBuffer.append(strM53168);
            stringBuffer.append("->");
            stringBuffer.append(strM30317);
            stringBuffer.append(":");
            stringBuffer.append(strM53169);
            this.f60616 = stringBuffer.toString();
        }
        return this.f60616;
    }

    public final int hashCode() {
        if (this.f60617 == 0) {
            int iHashCode = this.f60615.hashCode();
            this.f60617 = iHashCode;
            int iHashCode2 = this.f60618.hashCode() + (iHashCode * 31);
            this.f60617 = iHashCode2;
            this.f60617 = this.f60619.hashCode() + (iHashCode2 * 31);
        }
        return this.f60617;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19971.class.equals(obj.getClass())) {
            C19971 c19971 = (C19971) obj;
            if (this.f60615 == c19971.f60615 && this.f60618 == c19971.f60618 && this.f60619 == c19971.f60619) {
                return true;
            }
        }
        return false;
    }
}
