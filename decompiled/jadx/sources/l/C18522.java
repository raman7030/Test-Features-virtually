package l;

/* JADX INFO: renamed from: l.ᩴۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4GR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18522 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C22755 f57394;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f57395;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f57396;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22755 f57397;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11467 f57398;

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return i + 8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18522 c18522 = (C18522) obj;
        int iM50832 = this.f57394.compareTo(c18522.f57394);
        if (iM50832 != 0) {
            return iM50832;
        }
        int iCompareTo = this.f57398.compareTo(c18522.f57398);
        return iCompareTo != 0 ? iCompareTo : this.f57397.compareTo(c18522.f57397);
    }

    public C18522(C3454 c3454) {
        super(c3454);
        this.f57396 = 0;
        this.f57395 = null;
    }

    public C18522(C3454 c3454, C22755 c22755, C22755 c22756, C11467 c11467) {
        this(c3454);
        this.f57394 = c22755;
        this.f57397 = c22756;
        this.f57398 = c11467;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18522 m43041(C3454 c3454, C22755 c22755, C22755 c22756, C11467 c11467) {
        return (C18522) c3454.f10937.m25237(new C18522(c3454, c22755, c22756, c11467));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18522 m43042(C3454 c3454) {
        return (C18522) c3454.f10937.m25237(new C18522(c3454, C22755.m50831(this.f57394.m50835(), c3454), C22755.m50831(this.f57397.m50835(), c3454), C11467.m28270(this.f57398.m28273(), c3454)));
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        C3454 c3454 = this.f16031;
        this.f57394 = (C22755) c3454.f10926.m1314(c10720.m26907());
        this.f57397 = (C22755) c3454.f10926.m1314(c10720.m26907());
        this.f57398 = (C11467) c3454.f10947.m1314(c10720.m26904());
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5304(this.f57394.f16032);
        c1547.m5304(this.f57397.f16032);
        c1547.m5302(this.f57398.f16032);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return m43043();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m43043() {
        if (this.f57395 == null) {
            String strM50835 = this.f57394.m50835();
            String strM28273 = this.f57398.m28273();
            String strM50836 = this.f57397.m50835();
            StringBuffer stringBuffer = new StringBuffer(strM50836.length() + strM28273.length() + strM50835.length() + 3);
            stringBuffer.append(strM50835);
            stringBuffer.append("->");
            stringBuffer.append(strM28273);
            stringBuffer.append(":");
            stringBuffer.append(strM50836);
            this.f57395 = stringBuffer.toString();
        }
        return this.f57395;
    }

    public final int hashCode() {
        if (this.f57396 == 0) {
            int iHashCode = this.f57394.hashCode();
            this.f57396 = iHashCode;
            int iHashCode2 = this.f57397.hashCode() + (iHashCode * 31);
            this.f57396 = iHashCode2;
            this.f57396 = this.f57398.hashCode() + (iHashCode2 * 31);
        }
        return this.f57396;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18522.class.equals(obj.getClass())) {
            C18522 c18522 = (C18522) obj;
            if (this.f57394 == c18522.f57394 && this.f57397 == c18522.f57397 && this.f57398 == c18522.f57398) {
                return true;
            }
        }
        return false;
    }
}
