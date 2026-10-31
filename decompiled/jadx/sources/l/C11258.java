package l;

/* JADX INFO: renamed from: l.ۧ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes4.dex */
public final class C11258 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3307 f33737;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f33738;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11467 f33739;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13582 f33740;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13331 f33741;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22755 f33742;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7540 f33743;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22755 f33744;

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return i + 32;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16030 - ((C11258) obj).f16030;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27860(C3454 c3454) {
        C22755 c22755M50831 = C22755.m50831(this.f33742.m50835(), c3454);
        int i = this.f33738;
        C22755 c22755M50832 = C22755.m50831(this.f33744.m50835(), c3454);
        C13582 c13582 = this.f33740;
        C13331 c13331M32313 = null;
        C13582 c13582M32666 = c13582 != null ? c13582.m32666(c3454) : null;
        C11467 c11467 = this.f33739;
        C11467 c11467M28270 = c11467 != null ? C11467.m28270(c11467.m28273(), c3454) : null;
        C3307 c3307 = this.f33737;
        C3307 c3307M10107 = c3307 != null ? c3307.m10107(c3454) : null;
        C7540 c7540 = this.f33743;
        C7540 c7540M20240 = c7540 != null ? c7540.m20240(c3454) : null;
        C13331 c13331 = this.f33741;
        if (c13331 != null) {
            AbstractC16404[] abstractC16404Arr = c13331.m32314().f19421;
            AbstractC16404[] abstractC16404Arr2 = new AbstractC16404[abstractC16404Arr.length];
            int length = abstractC16404Arr.length;
            for (int i2 = 0; i2 < length; i2++) {
                abstractC16404Arr2[i2] = AbstractC16404.m38658(c3454, abstractC16404Arr[i2]);
            }
            c13331M32313 = C13331.m32313(c3454, new C6276(abstractC16404Arr2));
        }
        C11258 c11258 = new C11258(c3454);
        c11258.f33742 = c22755M50831;
        c11258.f33738 = i;
        c11258.f33744 = c22755M50832;
        c11258.f33740 = c13582M32666;
        c11258.f33739 = c11467M28270;
        c11258.f33737 = c3307M10107;
        c11258.f33743 = c7540M20240;
        c11258.f33741 = c13331M32313;
        if (c7540M20240 != null) {
            c7540M20240.m20244(c11258);
        }
        if (c3307M10107 != null) {
            c3307M10107.m10110(c11258);
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        AbstractC5116 abstractC5116M1314;
        C3454 c3454 = this.f16031;
        this.f33742 = (C22755) c3454.f10926.m1314(c10720.m26904());
        this.f33738 = c10720.m26904();
        C0176 c0176 = c3454.f10926;
        int iM26904 = c10720.m26904();
        AbstractC5116 abstractC5116M1315 = null;
        if (iM26904 == -1) {
            c0176.getClass();
            abstractC5116M1314 = null;
        } else {
            abstractC5116M1314 = c0176.m1314(iM26904);
        }
        this.f33744 = (C22755) abstractC5116M1314;
        this.f33740 = (C13582) c12172.m29651(EnumC14993.TYPE_TYPE_LIST, c10720.m26904());
        C0176 c0177 = c3454.f10947;
        int iM26905 = c10720.m26904();
        if (iM26905 == -1) {
            c0177.getClass();
        } else {
            abstractC5116M1315 = c0177.m1314(iM26905);
        }
        this.f33739 = (C11467) abstractC5116M1315;
        this.f33737 = (C3307) c12172.m29651(EnumC14993.TYPE_ANNOTATIONS_DIRECTORY_ITEM, c10720.m26904());
        this.f33743 = (C7540) c12172.m29651(EnumC14993.TYPE_CLASS_DATA_ITEM, c10720.m26904());
        this.f33741 = (C13331) c12172.m29651(EnumC14993.TYPE_ENCODED_ARRAY_ITEM, c10720.m26904());
        C7540 c7540 = this.f33743;
        if (c7540 != null) {
            c7540.m20244(this);
        }
        C3307 c3307 = this.f33737;
        if (c3307 != null) {
            c3307.m10110(this);
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5302(this.f33742.f16032);
        c1547.m5302(this.f33738);
        C22755 c22755 = this.f33744;
        c1547.m5302(c22755 == null ? -1 : c22755.f16032);
        C13582 c13582 = this.f33740;
        c1547.m5302(c13582 == null ? 0 : c13582.f16030);
        C11467 c11467 = this.f33739;
        c1547.m5302(c11467 != null ? c11467.f16032 : -1);
        C3307 c3307 = this.f33737;
        c1547.m5302(c3307 == null ? 0 : c3307.f16030);
        C7540 c7540 = this.f33743;
        c1547.m5302(c7540 == null ? 0 : c7540.f16030);
        C13331 c13331 = this.f33741;
        c1547.m5302(c13331 != null ? c13331.f16030 : 0);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return "class_def_item: " + this.f33742.m50835();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22755 m27862() {
        return this.f33742;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7540 m27863() {
        return this.f33743;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C13331 m27861() {
        if (this.f33741 == null) {
            this.f33741 = C13331.m32313(this.f16031, new C6276(new AbstractC16404[0]));
        }
        return this.f33741;
    }
}
