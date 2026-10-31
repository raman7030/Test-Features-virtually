package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۟ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7540 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C23062[] f23300;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13889[] f23301;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13889[] f23302;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23062[] f23303;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11258 f23304;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7540 c7540 = (C7540) obj;
        C11258 c11258 = this.f23304;
        if (c11258 == null) {
            return c7540.f23304 == null ? 0 : -1;
        }
        C11258 c11259 = c7540.f23304;
        if (c11259 == null) {
            return 1;
        }
        return c11258.f16030 - c11259.f16030;
    }

    public C7540(C3454 c3454) {
        super(c3454);
        this.f23304 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7540 m20240(C3454 c3454) {
        C23062[] c23062Arr;
        C23062[] c23062Arr2;
        C13889[] c13889Arr;
        C13889[] c13889Arr2;
        C23062[] c23062Arr3 = this.f23303;
        if (c23062Arr3 == null || c23062Arr3.length == 0) {
            c23062Arr = null;
        } else {
            c23062Arr = new C23062[c23062Arr3.length];
            int length = c23062Arr3.length;
            for (int i = 0; i < length; i++) {
                C23062 c23062 = this.f23303[i];
                c23062Arr[i] = new C23062(c23062.f74187.m43042(c3454), c23062.f74186);
            }
        }
        C23062[] c23062Arr4 = this.f23300;
        if (c23062Arr4 == null || c23062Arr4.length == 0) {
            c23062Arr2 = null;
        } else {
            c23062Arr2 = new C23062[c23062Arr4.length];
            int length2 = c23062Arr4.length;
            for (int i2 = 0; i2 < length2; i2++) {
                C23062 c23063 = this.f23300[i2];
                c23062Arr2[i2] = new C23062(c23063.f74187.m43042(c3454), c23063.f74186);
            }
        }
        C13889[] c13889Arr3 = this.f23301;
        if (c13889Arr3 == null || c13889Arr3.length == 0) {
            c13889Arr = null;
        } else {
            c13889Arr = new C13889[c13889Arr3.length];
            int length3 = c13889Arr3.length;
            for (int i3 = 0; i3 < length3; i3++) {
                C13889 c13889 = this.f23301[i3];
                C22050 c22050M49613 = c13889.f41402.m49613(c3454);
                int i4 = c13889.f41403;
                C4160 c4160 = c13889.f41404;
                c13889Arr[i3] = new C13889(c22050M49613, i4, c4160 != null ? c4160.m12581(c3454) : null);
            }
        }
        C13889[] c13889Arr4 = this.f23302;
        if (c13889Arr4 == null || c13889Arr4.length == 0) {
            c13889Arr2 = null;
        } else {
            c13889Arr2 = new C13889[c13889Arr4.length];
            int length4 = c13889Arr4.length;
            for (int i5 = 0; i5 < length4; i5++) {
                C13889 c138810 = this.f23302[i5];
                C22050 c22050M49614 = c138810.f41402.m49613(c3454);
                int i6 = c138810.f41403;
                C4160 c4161 = c138810.f41404;
                c13889Arr2[i5] = new C13889(c22050M49614, i6, c4161 != null ? c4161.m12581(c3454) : null);
            }
        }
        C7540 c7540 = new C7540(c3454);
        c7540.f23304 = null;
        if (c23062Arr == null) {
            c23062Arr = new C23062[0];
        }
        c7540.f23303 = c23062Arr;
        if (c23062Arr2 == null) {
            c23062Arr2 = new C23062[0];
        }
        c7540.f23300 = c23062Arr2;
        if (c13889Arr == null) {
            c13889Arr = new C13889[0];
        }
        c7540.f23301 = c13889Arr;
        if (c13889Arr2 == null) {
            c13889Arr2 = new C13889[0];
        }
        c7540.f23302 = c13889Arr2;
        return (C7540) c3454.f10944.m25237(c7540);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        C3454 c3454;
        this.f23303 = new C23062[c10720.m26903()];
        this.f23300 = new C23062[c10720.m26903()];
        this.f23301 = new C13889[c10720.m26903()];
        this.f23302 = new C13889[c10720.m26903()];
        int length = this.f23303.length;
        C13889 c13889 = null;
        int i = 0;
        int i2 = 0;
        C23062 c23062 = null;
        while (true) {
            c3454 = this.f16031;
            if (i2 >= length) {
                break;
            }
            try {
                C23062[] c23062Arr = this.f23303;
                C23062 c23063 = new C23062(c3454, c10720, c23062);
                c23062Arr[i2] = c23063;
                i2++;
                c23062 = c23063;
            } catch (Exception e) {
                throw C16363.m38521("Error while reading static field at index " + i2, e);
            }
        }
        int length2 = this.f23300.length;
        int i3 = 0;
        C23062 c23064 = null;
        while (i3 < length2) {
            try {
                C23062[] c23062Arr2 = this.f23300;
                C23062 c23065 = new C23062(c3454, c10720, c23064);
                c23062Arr2[i3] = c23065;
                i3++;
                c23064 = c23065;
            } catch (Exception e2) {
                throw C16363.m38521("Error while reading instance field at index " + i3, e2);
            }
        }
        int length3 = this.f23301.length;
        int i4 = 0;
        C13889 c138810 = null;
        while (i4 < length3) {
            try {
                C13889[] c13889Arr = this.f23301;
                C13889 c138811 = new C13889(c3454, c12172, c10720, c138810);
                c13889Arr[i4] = c138811;
                i4++;
                c138810 = c138811;
            } catch (Exception e3) {
                throw C16363.m38521("Error while reading direct method at index " + i4, e3);
            }
        }
        int length4 = this.f23302.length;
        while (i < length4) {
            try {
                C13889[] c13889Arr2 = this.f23302;
                C13889 c138812 = new C13889(c3454, c12172, c10720, c13889);
                c13889Arr2[i] = c138812;
                i++;
                c13889 = c138812;
            } catch (Exception e4) {
                throw C16363.m38521("Error while reading virtual method at index " + i, e4);
            }
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        int iM27697 = C11166.m27697(this.f23302.length) + C11166.m27697(this.f23301.length) + C11166.m27697(this.f23300.length) + C11166.m27697(this.f23303.length) + i;
        C23062[] c23062Arr = this.f23303;
        int length = c23062Arr.length;
        C13889 c13889 = null;
        int i2 = 0;
        int i3 = 0;
        C23062 c23062 = null;
        while (i3 < length) {
            C23062 c23063 = c23062Arr[i3];
            iM27697 = C23062.m51220(c23063, iM27697, c23062);
            i3++;
            c23062 = c23063;
        }
        C23062[] c23062Arr2 = this.f23300;
        int length2 = c23062Arr2.length;
        int i4 = 0;
        C23062 c23064 = null;
        while (i4 < length2) {
            C23062 c23065 = c23062Arr2[i4];
            iM27697 = C23062.m51220(c23065, iM27697, c23064);
            i4++;
            c23064 = c23065;
        }
        C13889[] c13889Arr = this.f23301;
        int length3 = c13889Arr.length;
        int i5 = 0;
        C13889 c138810 = null;
        while (i5 < length3) {
            C13889 c138811 = c13889Arr[i5];
            iM27697 = C13889.m33298(c138811, iM27697, c138810);
            i5++;
            c138810 = c138811;
        }
        C13889[] c13889Arr2 = this.f23302;
        int length4 = c13889Arr2.length;
        while (i2 < length4) {
            C13889 c138812 = c13889Arr2[i2];
            iM27697 = C13889.m33298(c138812, iM27697, c13889);
            i2++;
            c13889 = c138812;
        }
        return iM27697;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5301(this.f23303.length);
        c1547.m5301(this.f23300.length);
        c1547.m5301(this.f23301.length);
        c1547.m5301(this.f23302.length);
        C23062[] c23062Arr = this.f23303;
        int length = c23062Arr.length;
        C13889 c13889 = null;
        int i = 0;
        int i2 = 0;
        C23062 c23062 = null;
        while (i2 < length) {
            C23062 c23063 = c23062Arr[i2];
            C23062.m51221(c23063, c1547, c23062);
            i2++;
            c23062 = c23063;
        }
        C23062[] c23062Arr2 = this.f23300;
        int length2 = c23062Arr2.length;
        int i3 = 0;
        C23062 c23064 = null;
        while (i3 < length2) {
            C23062 c23065 = c23062Arr2[i3];
            C23062.m51221(c23065, c1547, c23064);
            i3++;
            c23064 = c23065;
        }
        C13889[] c13889Arr = this.f23301;
        int length3 = c13889Arr.length;
        int i4 = 0;
        C13889 c138810 = null;
        while (i4 < length3) {
            C13889 c138811 = c13889Arr[i4];
            C13889.m33299(c138811, c1547, c138810);
            i4++;
            c138810 = c138811;
        }
        C13889[] c13889Arr2 = this.f23302;
        int length4 = c13889Arr2.length;
        while (i < length4) {
            C13889 c138812 = c13889Arr2[i];
            C13889.m33299(c138812, c1547, c13889);
            i++;
            c13889 = c138812;
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        if (this.f23304 == null) {
            return C13540.m32584(new StringBuilder("class_data_item @0x"), this.f16030);
        }
        return "class_data_item @0x" + Integer.toHexString(this.f16030) + " (" + this.f23304.m27862() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20244(C11258 c11258) {
        this.f23304 = c11258;
    }

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final C23062[] m20250() {
        return this.f23303;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20243(int i, C23062 c23062, String str) {
        if (i >= -1) {
            C23062[] c23062Arr = this.f23303;
            if (i > c23062Arr.length - 1) {
                return;
            }
            c23062Arr[i] = c23062;
            C6276 c6276M32314 = this.f23304.m27861().m32314();
            AbstractC16404 abstractC16404M20239 = null;
            if (!c23062.m51222()) {
                AbstractC16404[] abstractC16404Arr = c6276M32314.f19421;
                if (i < abstractC16404Arr.length) {
                    abstractC16404Arr[i] = null;
                    return;
                }
                return;
            }
            AbstractC16404[] abstractC16404Arr2 = c6276M32314.f19421;
            int length = abstractC16404Arr2.length;
            C23062[] c23062Arr2 = this.f23303;
            if (length < c23062Arr2.length) {
                AbstractC16404[] abstractC16404Arr3 = new AbstractC16404[c23062Arr2.length];
                c6276M32314.f19421 = abstractC16404Arr3;
                System.arraycopy(abstractC16404Arr2, 0, abstractC16404Arr3, 0, abstractC16404Arr2.length);
            }
            AbstractC16404[] abstractC16404Arr4 = this.f23304.m27861().m32314().f19421;
            String strM50835 = c23062.f74187.f57397.m50835();
            C3454 c3454 = this.f16031;
            if (!strM50835.startsWith("[")) {
                try {
                    int iHashCode = strM50835.hashCode();
                    if (iHashCode != 70) {
                        if (iHashCode != 83) {
                            if (iHashCode != 90) {
                                if (iHashCode != 1379658506) {
                                    if (iHashCode != 73) {
                                        if (iHashCode != 74) {
                                            switch (iHashCode) {
                                                case 66:
                                                    if (strM50835.equals("B")) {
                                                        abstractC16404M20239 = new C14036(Integer.valueOf(str).byteValue());
                                                    }
                                                    break;
                                                case 67:
                                                    if (strM50835.equals("C")) {
                                                        abstractC16404M20239 = new C7687(str.charAt(0));
                                                    }
                                                    break;
                                                case 68:
                                                    if (strM50835.equals("D")) {
                                                        abstractC16404M20239 = new C1588(Double.valueOf(str).doubleValue());
                                                    }
                                                    break;
                                            }
                                        } else if (strM50835.equals("J")) {
                                            abstractC16404M20239 = new C6527(Long.valueOf(str).longValue());
                                        }
                                    } else if (strM50835.equals("I")) {
                                        abstractC16404M20239 = new C23460(Integer.valueOf(str).intValue());
                                    }
                                } else if (strM50835.equals("Ljava/lang/String;")) {
                                    abstractC16404M20239 = new C15698(new C11467(c3454, C5822.m16320(str, c3454)));
                                }
                            } else if (strM50835.equals("Z")) {
                                abstractC16404M20239 = new C23209(str.equals("true"));
                            }
                        } else if (strM50835.equals("S")) {
                            abstractC16404M20239 = new C8644(Short.valueOf(str).shortValue());
                        }
                    } else if (strM50835.equals("F")) {
                        abstractC16404M20239 = new C14287(Float.valueOf(str).floatValue());
                    }
                } catch (Throwable unused) {
                    abstractC16404M20239 = m20239(strM50835, c3454);
                }
            }
            abstractC16404Arr4[i] = abstractC16404M20239;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20242(int i, C23062 c23062) {
        if (i >= -1) {
            C23062[] c23062Arr = this.f23300;
            if (i > c23062Arr.length - 1) {
                return;
            }
            c23062Arr[i] = c23062;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20241(int i, C13889 c13889) {
        if (i >= -1) {
            C13889[] c13889Arr = this.f23301;
            if (i > c13889Arr.length - 1) {
                return;
            }
            c13889Arr[i] = c13889;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20248(int i, C13889 c13889) {
        if (i >= -1) {
            C13889[] c13889Arr = this.f23302;
            if (i > c13889Arr.length - 1) {
                return;
            }
            c13889Arr[i] = c13889;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20246(C23062 c23062) {
        if (c23062.m51223()) {
            C23062[] c23062Arr = this.f23303;
            int length = c23062Arr.length;
            int i = length + 1;
            C23062[] c23062Arr2 = new C23062[i];
            this.f23303 = c23062Arr2;
            System.arraycopy(c23062Arr, 0, c23062Arr2, 0, length);
            this.f23303[length] = c23062;
            C6276 c6276M32314 = this.f23304.m27861().m32314();
            AbstractC16404[] abstractC16404Arr = c6276M32314.f19421;
            AbstractC16404[] abstractC16404Arr2 = new AbstractC16404[i];
            c6276M32314.f19421 = abstractC16404Arr2;
            System.arraycopy(abstractC16404Arr, 0, abstractC16404Arr2, 0, abstractC16404Arr.length);
            if (c23062.m51222()) {
                c6276M32314.f19421[length] = m20239(c23062.f74187.f57397.m50835(), this.f16031);
                return;
            }
            return;
        }
        C23062[] c23062Arr3 = this.f23300;
        int length2 = c23062Arr3.length;
        C23062[] c23062Arr4 = new C23062[length2 + 1];
        this.f23300 = c23062Arr4;
        System.arraycopy(c23062Arr3, 0, c23062Arr4, 0, length2);
        this.f23300[length2] = c23062;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20245(C13889 c13889) {
        if (c13889.m33300()) {
            C13889[] c13889Arr = this.f23301;
            int length = c13889Arr.length;
            C13889[] c13889Arr2 = new C13889[length + 1];
            this.f23301 = c13889Arr2;
            System.arraycopy(c13889Arr, 0, c13889Arr2, 0, length);
            this.f23301[length] = c13889;
            return;
        }
        C13889[] c13889Arr3 = this.f23302;
        int length2 = c13889Arr3.length;
        C13889[] c13889Arr4 = new C13889[length2 + 1];
        this.f23302 = c13889Arr4;
        System.arraycopy(c13889Arr3, 0, c13889Arr4, 0, length2);
        this.f23302[length2] = c13889;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20247(int i) {
        C13889[] c13889Arr = this.f23301;
        int length = c13889Arr.length;
        C13889[] c13889Arr2 = new C13889[length - 1];
        this.f23301 = c13889Arr2;
        System.arraycopy(c13889Arr, i + 1, c13889Arr2, i, (length - i) - 1);
        System.arraycopy(c13889Arr, 0, this.f23301, 0, i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m20252(int i) {
        C13889[] c13889Arr = this.f23302;
        int length = c13889Arr.length;
        C13889[] c13889Arr2 = new C13889[length - 1];
        this.f23302 = c13889Arr2;
        System.arraycopy(c13889Arr, i + 1, c13889Arr2, i, (length - i) - 1);
        System.arraycopy(c13889Arr, 0, this.f23302, 0, i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m20253(int i) {
        C6276 c6276M32314 = this.f23304.m27861().m32314();
        int length = this.f23303.length;
        AbstractC16404[] abstractC16404Arr = c6276M32314.f19421;
        if (abstractC16404Arr.length < length) {
            AbstractC16404[] abstractC16404Arr2 = new AbstractC16404[length];
            c6276M32314.f19421 = abstractC16404Arr2;
            System.arraycopy(abstractC16404Arr, 0, abstractC16404Arr2, 0, abstractC16404Arr.length);
        }
        C23062[] c23062Arr = this.f23303;
        AbstractC16404[] abstractC16404Arr3 = c6276M32314.f19421;
        int i2 = length - 1;
        C23062[] c23062Arr2 = new C23062[i2];
        this.f23303 = c23062Arr2;
        c6276M32314.f19421 = new AbstractC16404[i2];
        int i3 = i + 1;
        int i4 = (length - i) - 1;
        System.arraycopy(c23062Arr, i3, c23062Arr2, i, i4);
        System.arraycopy(c23062Arr, 0, this.f23303, 0, i);
        System.arraycopy(abstractC16404Arr3, i3, c6276M32314.f19421, i, i4);
        System.arraycopy(abstractC16404Arr3, 0, c6276M32314.f19421, 0, i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20255(int i) {
        C23062[] c23062Arr = this.f23300;
        int length = c23062Arr.length;
        C23062[] c23062Arr2 = new C23062[length - 1];
        this.f23300 = c23062Arr2;
        System.arraycopy(c23062Arr, i + 1, c23062Arr2, i, (length - i) - 1);
        System.arraycopy(c23062Arr, 0, this.f23300, 0, i);
    }

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public final C23062[] m20251() {
        return this.f23300;
    }

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public final C13889[] m20249() {
        return this.f23301;
    }

    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public final C13889[] m20254() {
        return this.f23302;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16404 m20239(String str, C3454 c3454) {
        if (str.startsWith("[")) {
            return null;
        }
        switch (str) {
            case "B":
                return new C14036((byte) 0);
            case "C":
                return new C7687('C');
            case "D":
                return new C1588(0.0d);
            case "F":
                return new C14287(0.0f);
            case "I":
                return new C23460(0);
            case "J":
                return new C6527(0L);
            case "S":
                return new C8644((short) 0);
            case "Z":
                return new C23209(false);
            case "Ljava/lang/String;":
                return new C15698(new C11467(c3454, C5822.m16320("", c3454)));
            default:
                return null;
        }
    }
}
