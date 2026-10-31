package l;

/* JADX INFO: renamed from: l.᩹ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K4XP */
/* JADX INFO: loaded from: classes.dex */
public final class C22050 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C22755 f70678;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f70679;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C12877 f70680;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11467 f70681;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f70682;

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return i + 8;
    }

    public C22050(C3454 c3454) {
        super(c3454);
        this.f70682 = 0;
        this.f70679 = null;
    }

    public C22050(C3454 c3454, C22755 c22755, C12877 c12877, C11467 c11467) {
        this(c3454);
        this.f70678 = c22755;
        this.f70680 = c12877;
        this.f70681 = c11467;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22050 m49611(C3454 c3454, C22755 c22755, C12877 c12877, C11467 c11467) {
        return (C22050) c3454.f10929.m25237(new C22050(c3454, c22755, c12877, c11467));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22050 m49613(C3454 c3454) {
        return (C22050) c3454.f10929.m25237(new C22050(c3454, C22755.m50831(this.f70678.m50835(), c3454), this.f70680.m31311(c3454), C11467.m28270(this.f70681.m28273(), c3454)));
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        C3454 c3454 = this.f16031;
        this.f70678 = (C22755) c3454.f10926.m1314(c10720.m26907());
        this.f70680 = (C12877) c3454.f10931.m1314(c10720.m26907());
        this.f70681 = (C11467) c3454.f10947.m1314(c10720.m26904());
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5304(this.f70678.f16032);
        c1547.m5304(this.f70680.f16032);
        c1547.m5302(this.f70681.f16032);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return "method_id_item: " + m49614();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C22050 c22050) {
        int iM50832 = this.f70678.compareTo(c22050.f70678);
        if (iM50832 != 0) {
            return iM50832;
        }
        int iCompareTo = this.f70681.compareTo(c22050.f70681);
        return iCompareTo != 0 ? iCompareTo : this.f70680.compareTo(c22050.f70680);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m49614() {
        if (this.f70679 == null) {
            String strM50835 = this.f70678.m50835();
            String strM28273 = this.f70681.m28273();
            String strM31312 = this.f70680.m31312();
            StringBuilder sb = new StringBuilder(strM31312.length() + strM28273.length() + strM50835.length() + 2);
            sb.append(strM50835);
            sb.append("->");
            sb.append(strM28273);
            sb.append(strM31312);
            this.f70679 = sb.toString();
        }
        return this.f70679;
    }

    public final int hashCode() {
        if (this.f70682 == 0) {
            int iHashCode = this.f70678.hashCode();
            this.f70682 = iHashCode;
            int iHashCode2 = this.f70680.hashCode() + (iHashCode * 31);
            this.f70682 = iHashCode2;
            this.f70682 = this.f70681.hashCode() + (iHashCode2 * 31);
        }
        return this.f70682;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22050.class.equals(obj.getClass())) {
            C22050 c22050 = (C22050) obj;
            if (this.f70678 == c22050.f70678 && this.f70680 == c22050.f70680 && this.f70681 == c22050.f70681) {
                return true;
            }
        }
        return false;
    }
}
