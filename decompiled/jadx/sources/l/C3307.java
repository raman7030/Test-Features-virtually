package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۗܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 85TO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3307 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18522[] f10360;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10363 f10361;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22050[] f10362;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10363[] f10363;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6129[] f10364;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22050[] f10365;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C10363[] f10366;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C11258 f10367;

    public C3307(C3454 c3454) {
        super(c3454);
        this.f10367 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3307 m10107(C3454 c3454) {
        C18522[] c18522Arr;
        C10363[] c10363Arr;
        C22050[] c22050Arr;
        C10363[] c10363Arr2;
        C22050[] c22050Arr2;
        C6129[] c6129Arr;
        C18522[] c18522Arr2 = this.f10360;
        int i = 0;
        if (c18522Arr2 != null) {
            c18522Arr = new C18522[c18522Arr2.length];
            int length = c18522Arr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                c18522Arr[i3] = c18522Arr2[i2].m43042(c3454);
                i2++;
                i3++;
            }
        } else {
            c18522Arr = null;
        }
        C10363[] c10363Arr3 = this.f10366;
        if (c10363Arr3 != null) {
            c10363Arr = new C10363[c10363Arr3.length];
            int length2 = c10363Arr3.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2) {
                c10363Arr[i5] = c10363Arr3[i4].m26169(c3454);
                i4++;
                i5++;
            }
        } else {
            c10363Arr = null;
        }
        C22050[] c22050Arr3 = this.f10365;
        if (c22050Arr3 != null) {
            c22050Arr = new C22050[c22050Arr3.length];
            int length3 = c22050Arr3.length;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length3) {
                c22050Arr[i7] = c22050Arr3[i6].m49613(c3454);
                i6++;
                i7++;
            }
        } else {
            c22050Arr = null;
        }
        C10363[] c10363Arr4 = this.f10363;
        if (c10363Arr4 != null) {
            c10363Arr2 = new C10363[c10363Arr4.length];
            int length4 = c10363Arr4.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length4) {
                c10363Arr2[i9] = c10363Arr4[i8].m26169(c3454);
                i8++;
                i9++;
            }
        } else {
            c10363Arr2 = null;
        }
        C22050[] c22050Arr4 = this.f10362;
        if (c22050Arr4 != null) {
            c22050Arr2 = new C22050[c22050Arr4.length];
            int length5 = c22050Arr4.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length5) {
                c22050Arr2[i11] = c22050Arr4[i10].m49613(c3454);
                i10++;
                i11++;
            }
        } else {
            c22050Arr2 = null;
        }
        C6129[] c6129Arr2 = this.f10364;
        if (c6129Arr2 != null) {
            c6129Arr = new C6129[c6129Arr2.length];
            int length6 = c6129Arr2.length;
            int i12 = 0;
            while (i < length6) {
                c6129Arr[i12] = c6129Arr2[i].m17049(c3454);
                i++;
                i12++;
            }
        } else {
            c6129Arr = null;
        }
        C10363 c10363 = this.f10361;
        C10363 c10363M26169 = c10363 == null ? null : c10363.m26169(c3454);
        C3307 c3307 = new C3307(c3454);
        c3307.f10367 = null;
        c3307.f10361 = c10363M26169;
        c3307.f10360 = c18522Arr;
        c3307.f10366 = c10363Arr;
        c3307.f10365 = c22050Arr;
        c3307.f10363 = c10363Arr2;
        c3307.f10362 = c22050Arr2;
        c3307.f10364 = c6129Arr;
        return (C3307) c3454.f10928.m25237(c3307);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        C3454 c3454;
        this.f10361 = (C10363) c12172.m29651(EnumC14993.TYPE_ANNOTATION_SET_ITEM, c10720.m26904());
        int iM26904 = c10720.m26904();
        this.f10360 = new C18522[iM26904];
        this.f10366 = new C10363[iM26904];
        int iM26905 = c10720.m26904();
        this.f10365 = new C22050[iM26905];
        this.f10363 = new C10363[iM26905];
        int iM26906 = c10720.m26904();
        this.f10362 = new C22050[iM26906];
        this.f10364 = new C6129[iM26906];
        int i = 0;
        while (true) {
            int length = this.f10366.length;
            c3454 = this.f16031;
            if (i >= length) {
                break;
            }
            try {
                this.f10360[i] = (C18522) c3454.f10937.m1314(c10720.m26904());
                this.f10366[i] = (C10363) c12172.m29647(EnumC14993.TYPE_ANNOTATION_SET_ITEM, c10720.m26904());
                i++;
            } catch (Exception e) {
                throw C16363.m38521("Error occured while reading FieldAnnotation at index " + i, e);
            }
        }
        for (int i2 = 0; i2 < this.f10363.length; i2++) {
            try {
                this.f10365[i2] = (C22050) c3454.f10929.m1314(c10720.m26904());
                this.f10363[i2] = (C10363) c12172.m29647(EnumC14993.TYPE_ANNOTATION_SET_ITEM, c10720.m26904());
            } catch (Exception e2) {
                throw C16363.m38521("Error occured while reading MethodAnnotation at index " + i2, e2);
            }
        }
        for (int i3 = 0; i3 < this.f10364.length; i3++) {
            try {
                this.f10362[i3] = (C22050) c3454.f10929.m1314(c10720.m26904());
                this.f10364[i3] = (C6129) c12172.m29647(EnumC14993.TYPE_ANNOTATION_SET_REF_LIST, c10720.m26904());
            } catch (Exception e3) {
                throw C16363.m38521("Error occured while reading ParameterAnnotation at index " + i3, e3);
            }
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo10104(int i) {
        int i2 = i + 16;
        C10363[] c10363Arr = this.f10366;
        int length = c10363Arr == null ? 0 : c10363Arr.length;
        C10363[] c10363Arr2 = this.f10363;
        int length2 = length + (c10363Arr2 == null ? 0 : c10363Arr2.length);
        C6129[] c6129Arr = this.f10364;
        return C20094.m46314(length2, c6129Arr != null ? c6129Arr.length : 0, 8, i2);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10108(C1547 c1547) {
        C10363 c10363 = this.f10361;
        c1547.m5302(c10363 == null ? 0 : c10363.f16030);
        C10363[] c10363Arr = this.f10366;
        c1547.m5302(c10363Arr == null ? 0 : c10363Arr.length);
        C10363[] c10363Arr2 = this.f10363;
        c1547.m5302(c10363Arr2 == null ? 0 : c10363Arr2.length);
        C6129[] c6129Arr = this.f10364;
        c1547.m5302(c6129Arr == null ? 0 : c6129Arr.length);
        if (this.f10366 != null) {
            for (int i = 0; i < this.f10366.length; i++) {
                c1547.m5302(this.f10360[i].f16032);
                c1547.m5302(this.f10366[i].f16030);
            }
        }
        if (this.f10363 != null) {
            for (int i2 = 0; i2 < this.f10363.length; i2++) {
                c1547.m5302(this.f10365[i2].f16032);
                c1547.m5302(this.f10363[i2].f16030);
            }
        }
        if (this.f10364 != null) {
            for (int i3 = 0; i3 < this.f10364.length; i3++) {
                c1547.m5302(this.f10362[i3].f16032);
                c1547.m5302(this.f10364[i3].f16030);
            }
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo10106() {
        if (this.f10367 == null) {
            return C13540.m32584(new StringBuilder("annotation_directory_item @0x"), this.f16030);
        }
        return "annotation_directory_item @0x" + Integer.toHexString(this.f16030) + " (" + this.f10367.m27862() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C3307 c3307) {
        if (!m10103()) {
            if (c3307.m10103()) {
                return -1;
            }
            return this.f10367.f16030 - c3307.f10367.f16030;
        }
        if (c3307.m10103()) {
            return this.f10361.compareTo(c3307.f10361);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m10103() {
        if (this.f10361 == null) {
            return false;
        }
        C10363[] c10363Arr = this.f10366;
        if (c10363Arr != null && c10363Arr.length != 0) {
            return false;
        }
        C10363[] c10363Arr2 = this.f10363;
        if (c10363Arr2 != null && c10363Arr2.length != 0) {
            return false;
        }
        C6129[] c6129Arr = this.f10364;
        return c6129Arr == null || c6129Arr.length == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10110(C11258 c11258) {
        this.f10367 = c11258;
    }

    public final int hashCode() {
        if (!m10103()) {
            return super.hashCode();
        }
        return this.f10361.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3307.class.equals(obj.getClass()) && compareTo((C3307) obj) == 0;
    }
}
