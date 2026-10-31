package l;

import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.۬ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13184 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f39418;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12626 f39419;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EnumC11774 f39420;

    public C13184(C3454 c3454) {
        super(c3454);
        this.f39418 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13184 m32008(C3454 c3454) {
        EnumC11774 enumC11774 = this.f39420;
        C12626 c12626 = this.f39419;
        C22755 c22755 = c12626.f38050;
        C11467[] c11467Arr = null;
        C22755 c22755M50831 = c22755 == null ? null : C22755.m50831(c22755.m50835(), c3454);
        C11467[] c11467Arr2 = c12626.f38049;
        if (c11467Arr2 != null) {
            int length = c11467Arr2.length;
            C11467[] c11467Arr3 = new C11467[length];
            for (int i = 0; i < length; i++) {
                c11467Arr3[i] = C11467.m28270(c11467Arr2[i].m28273(), c3454);
            }
            c11467Arr = c11467Arr3;
        }
        C12626 c12627 = new C12626(c22755M50831, c11467Arr, c12626.m30892(c3454));
        C13184 c13184 = new C13184(c3454);
        c13184.f39418 = 0;
        c13184.f39420 = enumC11774;
        c13184.f39419 = c12627;
        return (C13184) c3454.f10945.m25237(c13184);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        this.f39420 = EnumC11774.m28811(c10720.m26901());
        this.f39419 = new C12626(this.f16031, c10720);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return this.f39419.mo5433(i + 1);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5300(this.f39420.f35137);
        this.f39419.mo5434(c1547);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return C13540.m32584(new StringBuilder("annotation_item @0x"), this.f16030);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C13184 c13184) {
        int i = this.f39420.f35137 - c13184.f39420.f35137;
        return i == 0 ? this.f39419.compareTo(c13184.f39419) : i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12626 m32009() {
        return this.f39419;
    }

    public final int hashCode() {
        if (this.f39418 == 0) {
            byte b = this.f39420.f35137;
            this.f39418 = b;
            this.f39418 = this.f39419.hashCode() + (b * bo.j);
        }
        return this.f39418;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13184.class.equals(obj.getClass())) {
            C13184 c13184 = (C13184) obj;
            if (this.f39420 == c13184.f39420 && this.f39419.equals(c13184.f39419)) {
                return true;
            }
        }
        return false;
    }
}
