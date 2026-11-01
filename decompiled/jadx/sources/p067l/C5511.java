package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۗܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 85TO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5511 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public C19971[] f13169;

    /* JADX INFO: renamed from: ۙ */
    public C12217 f13170;

    /* JADX INFO: renamed from: ۛ */
    public C23324[] f13171;

    /* JADX INFO: renamed from: ۤ */
    public C12217[] f13172;

    /* JADX INFO: renamed from: ۨ */
    public C8193[] f13173;

    /* JADX INFO: renamed from: ۫ */
    public C23324[] f13174;

    /* JADX INFO: renamed from: ۬ */
    public C12217[] f13175;

    /* JADX INFO: renamed from: ᩺ */
    public C13068 f13176;

    public C5511(C5651 c5651) {
        super(c5651);
        this.f13176 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5511 m12143(C5651 c5651) {
        C19971[] c19971Arr;
        C12217[] c12217Arr;
        C23324[] c23324Arr;
        C12217[] c12217Arr2;
        C23324[] c23324Arr2;
        C8193[] c8193Arr;
        C19971[] c19971Arr2 = this.f13169;
        int i = 0;
        if (c19971Arr2 != null) {
            c19971Arr = new C19971[c19971Arr2.length];
            int length = c19971Arr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                c19971Arr[i3] = c19971Arr2[i2].m45320(c5651);
                i2++;
                i3++;
            }
        } else {
            c19971Arr = null;
        }
        C12217[] c12217Arr3 = this.f13175;
        if (c12217Arr3 != null) {
            c12217Arr = new C12217[c12217Arr3.length];
            int length2 = c12217Arr3.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2) {
                c12217Arr[i5] = c12217Arr3[i4].m28197(c5651);
                i4++;
                i5++;
            }
        } else {
            c12217Arr = null;
        }
        C23324[] c23324Arr3 = this.f13174;
        if (c23324Arr3 != null) {
            c23324Arr = new C23324[c23324Arr3.length];
            int length3 = c23324Arr3.length;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length3) {
                c23324Arr[i7] = c23324Arr3[i6].m51949(c5651);
                i6++;
                i7++;
            }
        } else {
            c23324Arr = null;
        }
        C12217[] c12217Arr4 = this.f13172;
        if (c12217Arr4 != null) {
            c12217Arr2 = new C12217[c12217Arr4.length];
            int length4 = c12217Arr4.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length4) {
                c12217Arr2[i9] = c12217Arr4[i8].m28197(c5651);
                i8++;
                i9++;
            }
        } else {
            c12217Arr2 = null;
        }
        C23324[] c23324Arr4 = this.f13171;
        if (c23324Arr4 != null) {
            c23324Arr2 = new C23324[c23324Arr4.length];
            int length5 = c23324Arr4.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length5) {
                c23324Arr2[i11] = c23324Arr4[i10].m51949(c5651);
                i10++;
                i11++;
            }
        } else {
            c23324Arr2 = null;
        }
        C8193[] c8193Arr2 = this.f13173;
        if (c8193Arr2 != null) {
            c8193Arr = new C8193[c8193Arr2.length];
            int length6 = c8193Arr2.length;
            int i12 = 0;
            while (i < length6) {
                c8193Arr[i12] = c8193Arr2[i].m18980(c5651);
                i++;
                i12++;
            }
        } else {
            c8193Arr = null;
        }
        C12217 c12217 = this.f13170;
        C12217 c12217M28197 = c12217 == null ? null : c12217.m28197(c5651);
        C5511 c5511 = new C5511(c5651);
        c5511.f13176 = null;
        c5511.f13170 = c12217M28197;
        c5511.f13169 = c19971Arr;
        c5511.f13175 = c12217Arr;
        c5511.f13174 = c23324Arr;
        c5511.f13172 = c12217Arr2;
        c5511.f13171 = c23324Arr2;
        c5511.f13173 = c8193Arr;
        return (C5511) c5651.f13729.m27254(c5511);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        C5651 c5651;
        this.f13170 = (C12217) c13936.m31713(EnumC16617.TYPE_ANNOTATION_SET_ITEM, c12556.m28944());
        int iM28944 = c12556.m28944();
        this.f13169 = new C19971[iM28944];
        this.f13175 = new C12217[iM28944];
        int iM28945 = c12556.m28944();
        this.f13174 = new C23324[iM28945];
        this.f13172 = new C12217[iM28945];
        int iM28946 = c12556.m28944();
        this.f13171 = new C23324[iM28946];
        this.f13173 = new C8193[iM28946];
        int i = 0;
        while (true) {
            int length = this.f13175.length;
            c5651 = this.f18865;
            if (i >= length) {
                break;
            }
            try {
                this.f13169[i] = (C19971) c5651.f13738.m3722(c12556.m28944());
                this.f13175[i] = (C12217) c13936.m31709(EnumC16617.TYPE_ANNOTATION_SET_ITEM, c12556.m28944());
                i++;
            } catch (Exception e) {
                throw C17919.m40738("Error occured while reading FieldAnnotation at index " + i, e);
            }
        }
        for (int i2 = 0; i2 < this.f13172.length; i2++) {
            try {
                this.f13174[i2] = (C23324) c5651.f13730.m3722(c12556.m28944());
                this.f13172[i2] = (C12217) c13936.m31709(EnumC16617.TYPE_ANNOTATION_SET_ITEM, c12556.m28944());
            } catch (Exception e2) {
                throw C17919.m40738("Error occured while reading MethodAnnotation at index " + i2, e2);
            }
        }
        for (int i3 = 0; i3 < this.f13173.length; i3++) {
            try {
                this.f13171[i3] = (C23324) c5651.f13730.m3722(c12556.m28944());
                this.f13173[i3] = (C8193) c13936.m31709(EnumC16617.TYPE_ANNOTATION_SET_REF_LIST, c12556.m28944());
            } catch (Exception e3) {
                throw C17919.m40738("Error occured while reading ParameterAnnotation at index " + i3, e3);
            }
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        int i2 = i + 16;
        C12217[] c12217Arr = this.f13175;
        int length = c12217Arr == null ? 0 : c12217Arr.length;
        C12217[] c12217Arr2 = this.f13172;
        int length2 = length + (c12217Arr2 == null ? 0 : c12217Arr2.length);
        C8193[] c8193Arr = this.f13173;
        return C21466.m48630(length2, c8193Arr != null ? c8193Arr.length : 0, 8, i2);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        C12217 c12217 = this.f13170;
        c3838.m7531(c12217 == null ? 0 : c12217.f18864);
        C12217[] c12217Arr = this.f13175;
        c3838.m7531(c12217Arr == null ? 0 : c12217Arr.length);
        C12217[] c12217Arr2 = this.f13172;
        c3838.m7531(c12217Arr2 == null ? 0 : c12217Arr2.length);
        C8193[] c8193Arr = this.f13173;
        c3838.m7531(c8193Arr == null ? 0 : c8193Arr.length);
        if (this.f13175 != null) {
            for (int i = 0; i < this.f13175.length; i++) {
                c3838.m7531(this.f13169[i].f18866);
                c3838.m7531(this.f13175[i].f18864);
            }
        }
        if (this.f13172 != null) {
            for (int i2 = 0; i2 < this.f13172.length; i2++) {
                c3838.m7531(this.f13174[i2].f18866);
                c3838.m7531(this.f13172[i2].f18864);
            }
        }
        if (this.f13173 != null) {
            for (int i3 = 0; i3 < this.f13173.length; i3++) {
                c3838.m7531(this.f13171[i3].f18866);
                c3838.m7531(this.f13173[i3].f18864);
            }
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        if (this.f13176 == null) {
            return C1514.m34687(new StringBuilder("annotation_directory_item @0x"), this.f18864);
        }
        return "annotation_directory_item @0x" + Integer.toHexString(this.f18864) + " (" + this.f13176.m29923() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C5511 c5511) {
        if (!m12139()) {
            if (c5511.m12139()) {
                return -1;
            }
            return this.f13176.f18864 - c5511.f13176.f18864;
        }
        if (c5511.m12139()) {
            return this.f13170.compareTo(c5511.f13170);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᩻ */
    private boolean m12139() {
        if (this.f13170 == null) {
            return false;
        }
        C12217[] c12217Arr = this.f13175;
        if (c12217Arr != null && c12217Arr.length != 0) {
            return false;
        }
        C12217[] c12217Arr2 = this.f13172;
        if (c12217Arr2 != null && c12217Arr2.length != 0) {
            return false;
        }
        C8193[] c8193Arr = this.f13173;
        return c8193Arr == null || c8193Arr.length == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12146(C13068 c13068) {
        this.f13176 = c13068;
    }

    public final int hashCode() {
        if (!m12139()) {
            return super.hashCode();
        }
        return this.f13170.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5511.class.equals(obj.getClass()) && compareTo((C5511) obj) == 0;
    }
}
