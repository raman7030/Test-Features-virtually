package l;

/* JADX INFO: renamed from: l.ۧܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11142 extends AbstractC18197 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f33448;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f33449;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f33450;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f33451;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f33452;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f33453;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f33454;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f33455;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f33456;

    @Override // l.AbstractC18197
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ boolean mo26321(AbstractC18197 abstractC18197) {
        return false;
    }

    public C11142(int i, C13312 c13312, int i2, C23156 c23156, int i3, String str, String str2) {
        AbstractC14545 abstractC14545Of;
        int iM18691;
        super(i, c13312, i2);
        int i4 = 0;
        this.f33451 = C11010.m27352(i3, false);
        int i5 = this.f56580.f25628;
        int i6 = c23156.f35567;
        AbstractC14545 abstractC14545 = c23156.f35573;
        int i7 = i5 & (~i6);
        this.f33454 = (i7 & 1) != 0;
        this.f33453 = (i7 & 2) != 0;
        if (str2 != null) {
            abstractC14545Of = AbstractC14545.of((Object) str2);
        } else {
            abstractC14545Of = abstractC14545.isEmpty() ? AbstractC14545.of((Object) "") : abstractC14545;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= abstractC14545Of.size()) {
                i8 = Integer.MAX_VALUE;
                iM18691 = 0;
                break;
            } else {
                iM18691 = C6908.m18691(this.f56580, (String) abstractC14545Of.get(i8), c23156.f35562);
                if (iM18691 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f33449 = i8;
        this.f33452 = iM18691;
        int i9 = str2 != null ? 1088 : c23156.f35574;
        int i10 = this.f56580.f25608;
        int i11 = C6908.f21317;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.f33456 = iBitCount;
        this.f33448 = (1088 & this.f56580.f25608) != 0;
        int iM18692 = C6908.m18691(this.f56580, str, C6908.m18693(str) == null);
        this.f33455 = iM18692;
        boolean z = iM18691 > 0 || (abstractC14545.isEmpty() && iBitCount > 0) || this.f33454 || (this.f33453 && iM18692 > 0);
        if (C11010.m27352(i3, c23156.f74426) && z) {
            i4 = 1;
        }
        this.f33450 = i4;
    }

    @Override // l.AbstractC18197
    /* JADX INFO: renamed from: ֫ */
    public final int mo26319() {
        return this.f33450;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C11142 c11142) {
        AbstractC6497 abstractC6497Mo17951 = AbstractC6497.m17946().mo17952(this.f33451, c11142.f33451).mo17951(Integer.valueOf(this.f33449), Integer.valueOf(c11142.f33449), AbstractC10232.m25861().mo22482());
        int i = c11142.f33452;
        int i2 = this.f33452;
        AbstractC6497 abstractC6497Mo17949 = abstractC6497Mo17951.mo17949(i2, i);
        int i3 = c11142.f33456;
        int i4 = this.f33456;
        AbstractC6497 abstractC6497Mo179410 = abstractC6497Mo17949.mo17949(i4, i3).mo17952(this.f33454, c11142.f33454).mo17951(Boolean.valueOf(this.f33453), Boolean.valueOf(c11142.f33453), i2 == 0 ? AbstractC10232.m25861() : AbstractC10232.m25861().mo22482()).mo17949(this.f33455, c11142.f33455);
        if (i4 == 0) {
            abstractC6497Mo179410 = abstractC6497Mo179410.mo17953(this.f33448, c11142.f33448);
        }
        return abstractC6497Mo179410.mo17948();
    }
}
