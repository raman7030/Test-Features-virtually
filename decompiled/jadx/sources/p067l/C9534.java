package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۟ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9534 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public C24286[] f26213;

    /* JADX INFO: renamed from: ۙ */
    public C15568[] f26214;

    /* JADX INFO: renamed from: ۤ */
    public C15568[] f26215;

    /* JADX INFO: renamed from: ۫ */
    public C24286[] f26216;

    /* JADX INFO: renamed from: ۬ */
    public C13068 f26217;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C9534 c9534 = (C9534) obj;
        C13068 c13068 = this.f26217;
        if (c13068 == null) {
            return c9534.f26217 == null ? 0 : -1;
        }
        C13068 c13069 = c9534.f26217;
        if (c13069 == null) {
            return 1;
        }
        return c13068.f18864 - c13069.f18864;
    }

    public C9534(C5651 c5651) {
        super(c5651);
        this.f26217 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9534 m22216(C5651 c5651) {
        C24286[] c24286Arr;
        C24286[] c24286Arr2;
        C15568[] c15568Arr;
        C15568[] c15568Arr2;
        C24286[] c24286Arr3 = this.f26216;
        if (c24286Arr3 == null || c24286Arr3.length == 0) {
            c24286Arr = null;
        } else {
            c24286Arr = new C24286[c24286Arr3.length];
            int length = c24286Arr3.length;
            for (int i = 0; i < length; i++) {
                C24286 c24286 = this.f26216[i];
                c24286Arr[i] = new C24286(c24286.f76932.m45320(c5651), c24286.f76931);
            }
        }
        C24286[] c24286Arr4 = this.f26213;
        if (c24286Arr4 == null || c24286Arr4.length == 0) {
            c24286Arr2 = null;
        } else {
            c24286Arr2 = new C24286[c24286Arr4.length];
            int length2 = c24286Arr4.length;
            for (int i2 = 0; i2 < length2; i2++) {
                C24286 c24287 = this.f26213[i2];
                c24286Arr2[i2] = new C24286(c24287.f76932.m45320(c5651), c24287.f76931);
            }
        }
        C15568[] c15568Arr3 = this.f26214;
        if (c15568Arr3 == null || c15568Arr3.length == 0) {
            c15568Arr = null;
        } else {
            c15568Arr = new C15568[c15568Arr3.length];
            int length3 = c15568Arr3.length;
            for (int i3 = 0; i3 < length3; i3++) {
                C15568 c15568 = this.f26214[i3];
                C23324 c23324M51949 = c15568.f44483.m51949(c5651);
                int i4 = c15568.f44484;
                C6322 c6322 = c15568.f44485;
                c15568Arr[i3] = new C15568(c23324M51949, i4, c6322 != null ? c6322.m14455(c5651) : null);
            }
        }
        C15568[] c15568Arr4 = this.f26215;
        if (c15568Arr4 == null || c15568Arr4.length == 0) {
            c15568Arr2 = null;
        } else {
            c15568Arr2 = new C15568[c15568Arr4.length];
            int length4 = c15568Arr4.length;
            for (int i5 = 0; i5 < length4; i5++) {
                C15568 c15569 = this.f26215[i5];
                C23324 c23324M519410 = c15569.f44483.m51949(c5651);
                int i6 = c15569.f44484;
                C6322 c6323 = c15569.f44485;
                c15568Arr2[i5] = new C15568(c23324M519410, i6, c6323 != null ? c6323.m14455(c5651) : null);
            }
        }
        C9534 c9534 = new C9534(c5651);
        c9534.f26217 = null;
        if (c24286Arr == null) {
            c24286Arr = new C24286[0];
        }
        c9534.f26216 = c24286Arr;
        if (c24286Arr2 == null) {
            c24286Arr2 = new C24286[0];
        }
        c9534.f26213 = c24286Arr2;
        if (c15568Arr == null) {
            c15568Arr = new C15568[0];
        }
        c9534.f26214 = c15568Arr;
        if (c15568Arr2 == null) {
            c15568Arr2 = new C15568[0];
        }
        c9534.f26215 = c15568Arr2;
        return (C9534) c5651.f13745.m27254(c9534);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        C5651 c5651;
        this.f26216 = new C24286[c12556.m28943()];
        this.f26213 = new C24286[c12556.m28943()];
        this.f26214 = new C15568[c12556.m28943()];
        this.f26215 = new C15568[c12556.m28943()];
        int length = this.f26216.length;
        C15568 c15568 = null;
        int i = 0;
        int i2 = 0;
        C24286 c24286 = null;
        while (true) {
            c5651 = this.f18865;
            if (i2 >= length) {
                break;
            }
            try {
                C24286[] c24286Arr = this.f26216;
                C24286 c24287 = new C24286(c5651, c12556, c24286);
                c24286Arr[i2] = c24287;
                i2++;
                c24286 = c24287;
            } catch (Exception e) {
                throw C17919.m40738("Error while reading static field at index " + i2, e);
            }
        }
        int length2 = this.f26213.length;
        int i3 = 0;
        C24286 c24288 = null;
        while (i3 < length2) {
            try {
                C24286[] c24286Arr2 = this.f26213;
                C24286 c24289 = new C24286(c5651, c12556, c24288);
                c24286Arr2[i3] = c24289;
                i3++;
                c24288 = c24289;
            } catch (Exception e2) {
                throw C17919.m40738("Error while reading instance field at index " + i3, e2);
            }
        }
        int length3 = this.f26214.length;
        int i4 = 0;
        C15568 c15569 = null;
        while (i4 < length3) {
            try {
                C15568[] c15568Arr = this.f26214;
                C15568 c155610 = new C15568(c5651, c13936, c12556, c15569);
                c15568Arr[i4] = c155610;
                i4++;
                c15569 = c155610;
            } catch (Exception e3) {
                throw C17919.m40738("Error while reading direct method at index " + i4, e3);
            }
        }
        int length4 = this.f26215.length;
        while (i < length4) {
            try {
                C15568[] c15568Arr2 = this.f26215;
                C15568 c155611 = new C15568(c5651, c13936, c12556, c15568);
                c15568Arr2[i] = c155611;
                i++;
                c15568 = c155611;
            } catch (Exception e4) {
                throw C17919.m40738("Error while reading virtual method at index " + i, e4);
            }
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        int iM29759 = C12981.m29759(this.f26215.length) + C12981.m29759(this.f26214.length) + C12981.m29759(this.f26213.length) + C12981.m29759(this.f26216.length) + i;
        C24286[] c24286Arr = this.f26216;
        int length = c24286Arr.length;
        C15568 c15568 = null;
        int i2 = 0;
        int i3 = 0;
        C24286 c24286 = null;
        while (i3 < length) {
            C24286 c24287 = c24286Arr[i3];
            iM29759 = C24286.m53613(c24287, iM29759, c24286);
            i3++;
            c24286 = c24287;
        }
        C24286[] c24286Arr2 = this.f26213;
        int length2 = c24286Arr2.length;
        int i4 = 0;
        C24286 c24288 = null;
        while (i4 < length2) {
            C24286 c24289 = c24286Arr2[i4];
            iM29759 = C24286.m53613(c24289, iM29759, c24288);
            i4++;
            c24288 = c24289;
        }
        C15568[] c15568Arr = this.f26214;
        int length3 = c15568Arr.length;
        int i5 = 0;
        C15568 c15569 = null;
        while (i5 < length3) {
            C15568 c155610 = c15568Arr[i5];
            iM29759 = C15568.m35417(c155610, iM29759, c15569);
            i5++;
            c15569 = c155610;
        }
        C15568[] c15568Arr2 = this.f26215;
        int length4 = c15568Arr2.length;
        while (i2 < length4) {
            C15568 c155611 = c15568Arr2[i2];
            iM29759 = C15568.m35417(c155611, iM29759, c15568);
            i2++;
            c15568 = c155611;
        }
        return iM29759;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7530(this.f26216.length);
        c3838.m7530(this.f26213.length);
        c3838.m7530(this.f26214.length);
        c3838.m7530(this.f26215.length);
        C24286[] c24286Arr = this.f26216;
        int length = c24286Arr.length;
        C15568 c15568 = null;
        int i = 0;
        int i2 = 0;
        C24286 c24286 = null;
        while (i2 < length) {
            C24286 c24287 = c24286Arr[i2];
            C24286.m53614(c24287, c3838, c24286);
            i2++;
            c24286 = c24287;
        }
        C24286[] c24286Arr2 = this.f26213;
        int length2 = c24286Arr2.length;
        int i3 = 0;
        C24286 c24288 = null;
        while (i3 < length2) {
            C24286 c24289 = c24286Arr2[i3];
            C24286.m53614(c24289, c3838, c24288);
            i3++;
            c24288 = c24289;
        }
        C15568[] c15568Arr = this.f26214;
        int length3 = c15568Arr.length;
        int i4 = 0;
        C15568 c15569 = null;
        while (i4 < length3) {
            C15568 c155610 = c15568Arr[i4];
            C15568.m35418(c155610, c3838, c15569);
            i4++;
            c15569 = c155610;
        }
        C15568[] c15568Arr2 = this.f26215;
        int length4 = c15568Arr2.length;
        while (i < length4) {
            C15568 c155611 = c15568Arr2[i];
            C15568.m35418(c155611, c3838, c15568);
            i++;
            c15568 = c155611;
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        if (this.f26217 == null) {
            return C1514.m34687(new StringBuilder("class_data_item @0x"), this.f18864);
        }
        return "class_data_item @0x" + Integer.toHexString(this.f18864) + " (" + this.f26217.m29923() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22220(C13068 c13068) {
        this.f26217 = c13068;
    }

    /* JADX INFO: renamed from: ۨ֫ */
    public final C24286[] m22226() {
        return this.f26216;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public final void m22219(int i, C24286 c24286, String str) {
        if (i >= -1) {
            C24286[] c24286Arr = this.f26216;
            if (i > c24286Arr.length - 1) {
                return;
            }
            c24286Arr[i] = c24286;
            C8333 c8333M34414 = this.f26217.m29922().m34414();
            AbstractC17958 abstractC17958M22215 = null;
            if (!c24286.m53615()) {
                AbstractC17958[] abstractC17958Arr = c8333M34414.f22284;
                if (i < abstractC17958Arr.length) {
                    abstractC17958Arr[i] = null;
                    return;
                }
                return;
            }
            AbstractC17958[] abstractC17958Arr2 = c8333M34414.f22284;
            int length = abstractC17958Arr2.length;
            C24286[] c24286Arr2 = this.f26216;
            if (length < c24286Arr2.length) {
                AbstractC17958[] abstractC17958Arr3 = new AbstractC17958[c24286Arr2.length];
                c8333M34414.f22284 = abstractC17958Arr3;
                System.arraycopy(abstractC17958Arr2, 0, abstractC17958Arr3, 0, abstractC17958Arr2.length);
            }
            AbstractC17958[] abstractC17958Arr4 = this.f26217.m29922().m34414().f22284;
            String strM53168 = c24286.f76932.f60618.m53168();
            C5651 c5651 = this.f18865;
            if (!strM53168.startsWith("[")) {
                try {
                    int iHashCode = strM53168.hashCode();
                    if (iHashCode != 70) {
                        if (iHashCode != 83) {
                            if (iHashCode != 90) {
                                if (iHashCode != 1379658506) {
                                    if (iHashCode != 73) {
                                        if (iHashCode != 74) {
                                            switch (iHashCode) {
                                                case 66:
                                                    if (strM53168.equals("B")) {
                                                        abstractC17958M22215 = new C15708(Integer.valueOf(str).byteValue());
                                                    }
                                                    break;
                                                case 67:
                                                    if (strM53168.equals("C")) {
                                                        abstractC17958M22215 = new C9674(str.charAt(0));
                                                    }
                                                    break;
                                                case 68:
                                                    if (strM53168.equals("D")) {
                                                        abstractC17958M22215 = new C3877(Double.valueOf(str).doubleValue());
                                                    }
                                                    break;
                                            }
                                        } else if (strM53168.equals("J")) {
                                            abstractC17958M22215 = new C8571(Long.valueOf(str).longValue());
                                        }
                                    } else if (strM53168.equals("I")) {
                                        abstractC17958M22215 = new C24664(Integer.valueOf(str).intValue());
                                    }
                                } else if (strM53168.equals("Ljava/lang/String;")) {
                                    abstractC17958M22215 = new C17287(new C13266(c5651, C7901.m18245(str, c5651)));
                                }
                            } else if (strM53168.equals("Z")) {
                                abstractC17958M22215 = new C24426(str.equals("true"));
                            }
                        } else if (strM53168.equals("S")) {
                            abstractC17958M22215 = new C10583(Short.valueOf(str).shortValue());
                        }
                    } else if (strM53168.equals("F")) {
                        abstractC17958M22215 = new C15946(Float.valueOf(str).floatValue());
                    }
                } catch (Throwable unused) {
                    abstractC17958M22215 = m22215(strM53168, c5651);
                }
            }
            abstractC17958Arr4[i] = abstractC17958M22215;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22218(int i, C24286 c24286) {
        if (i >= -1) {
            C24286[] c24286Arr = this.f26213;
            if (i > c24286Arr.length - 1) {
                return;
            }
            c24286Arr[i] = c24286;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22217(int i, C15568 c15568) {
        if (i >= -1) {
            C15568[] c15568Arr = this.f26214;
            if (i > c15568Arr.length - 1) {
                return;
            }
            c15568Arr[i] = c15568;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22224(int i, C15568 c15568) {
        if (i >= -1) {
            C15568[] c15568Arr = this.f26215;
            if (i > c15568Arr.length - 1) {
                return;
            }
            c15568Arr[i] = c15568;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22222(C24286 c24286) {
        if (c24286.m53616()) {
            C24286[] c24286Arr = this.f26216;
            int length = c24286Arr.length;
            int i = length + 1;
            C24286[] c24286Arr2 = new C24286[i];
            this.f26216 = c24286Arr2;
            System.arraycopy(c24286Arr, 0, c24286Arr2, 0, length);
            this.f26216[length] = c24286;
            C8333 c8333M34414 = this.f26217.m29922().m34414();
            AbstractC17958[] abstractC17958Arr = c8333M34414.f22284;
            AbstractC17958[] abstractC17958Arr2 = new AbstractC17958[i];
            c8333M34414.f22284 = abstractC17958Arr2;
            System.arraycopy(abstractC17958Arr, 0, abstractC17958Arr2, 0, abstractC17958Arr.length);
            if (c24286.m53615()) {
                c8333M34414.f22284[length] = m22215(c24286.f76932.f60618.m53168(), this.f18865);
                return;
            }
            return;
        }
        C24286[] c24286Arr3 = this.f26213;
        int length2 = c24286Arr3.length;
        C24286[] c24286Arr4 = new C24286[length2 + 1];
        this.f26213 = c24286Arr4;
        System.arraycopy(c24286Arr3, 0, c24286Arr4, 0, length2);
        this.f26213[length2] = c24286;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22221(C15568 c15568) {
        if (c15568.m35419()) {
            C15568[] c15568Arr = this.f26214;
            int length = c15568Arr.length;
            C15568[] c15568Arr2 = new C15568[length + 1];
            this.f26214 = c15568Arr2;
            System.arraycopy(c15568Arr, 0, c15568Arr2, 0, length);
            this.f26214[length] = c15568;
            return;
        }
        C15568[] c15568Arr3 = this.f26215;
        int length2 = c15568Arr3.length;
        C15568[] c15568Arr4 = new C15568[length2 + 1];
        this.f26215 = c15568Arr4;
        System.arraycopy(c15568Arr3, 0, c15568Arr4, 0, length2);
        this.f26215[length2] = c15568;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22223(int i) {
        C15568[] c15568Arr = this.f26214;
        int length = c15568Arr.length;
        C15568[] c15568Arr2 = new C15568[length - 1];
        this.f26214 = c15568Arr2;
        System.arraycopy(c15568Arr, i + 1, c15568Arr2, i, (length - i) - 1);
        System.arraycopy(c15568Arr, 0, this.f26214, 0, i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m22228(int i) {
        C15568[] c15568Arr = this.f26215;
        int length = c15568Arr.length;
        C15568[] c15568Arr2 = new C15568[length - 1];
        this.f26215 = c15568Arr2;
        System.arraycopy(c15568Arr, i + 1, c15568Arr2, i, (length - i) - 1);
        System.arraycopy(c15568Arr, 0, this.f26215, 0, i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m22229(int i) {
        C8333 c8333M34414 = this.f26217.m29922().m34414();
        int length = this.f26216.length;
        AbstractC17958[] abstractC17958Arr = c8333M34414.f22284;
        if (abstractC17958Arr.length < length) {
            AbstractC17958[] abstractC17958Arr2 = new AbstractC17958[length];
            c8333M34414.f22284 = abstractC17958Arr2;
            System.arraycopy(abstractC17958Arr, 0, abstractC17958Arr2, 0, abstractC17958Arr.length);
        }
        C24286[] c24286Arr = this.f26216;
        AbstractC17958[] abstractC17958Arr3 = c8333M34414.f22284;
        int i2 = length - 1;
        C24286[] c24286Arr2 = new C24286[i2];
        this.f26216 = c24286Arr2;
        c8333M34414.f22284 = new AbstractC17958[i2];
        int i3 = i + 1;
        int i4 = (length - i) - 1;
        System.arraycopy(c24286Arr, i3, c24286Arr2, i, i4);
        System.arraycopy(c24286Arr, 0, this.f26216, 0, i);
        System.arraycopy(abstractC17958Arr3, i3, c8333M34414.f22284, i, i4);
        System.arraycopy(abstractC17958Arr3, 0, c8333M34414.f22284, 0, i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22231(int i) {
        C24286[] c24286Arr = this.f26213;
        int length = c24286Arr.length;
        C24286[] c24286Arr2 = new C24286[length - 1];
        this.f26213 = c24286Arr2;
        System.arraycopy(c24286Arr, i + 1, c24286Arr2, i, (length - i) - 1);
        System.arraycopy(c24286Arr, 0, this.f26213, 0, i);
    }

    /* JADX INFO: renamed from: ܰۧ */
    public final C24286[] m22227() {
        return this.f26213;
    }

    /* JADX INFO: renamed from: ۧܽ */
    public final C15568[] m22225() {
        return this.f26214;
    }

    /* JADX INFO: renamed from: ܿܽ */
    public final C15568[] m22230() {
        return this.f26215;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17958 m22215(String str, C5651 c5651) {
        if (str.startsWith("[")) {
            return null;
        }
        switch (str) {
            case "B":
                return new C15708((byte) 0);
            case "C":
                return new C9674('C');
            case "D":
                return new C3877(0.0d);
            case "F":
                return new C15946(0.0f);
            case "I":
                return new C24664(0);
            case "J":
                return new C8571(0L);
            case "S":
                return new C10583((short) 0);
            case "Z":
                return new C24426(false);
            case "Ljava/lang/String;":
                return new C17287(new C13266(c5651, C7901.m18245("", c5651)));
            default:
                return null;
        }
    }
}
