package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes3.dex */
public final class C4160 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C9099[] f13568;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21799 f13569;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C13889 f13570;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f13571;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f13572;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC2043[] f13573;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f13574;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C2749[] f13575;

    public C4160(C3454 c3454, int i, int i2, int i3, AbstractC2043[] abstractC2043Arr, C2749[] c2749Arr, C9099[] c9099Arr) {
        super(c3454);
        this.f13572 = i;
        this.f13574 = i2;
        this.f13571 = i3;
        this.f13569 = null;
        this.f13573 = abstractC2043Arr;
        this.f13575 = c2749Arr;
        this.f13568 = c9099Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4160 m12579(C3454 c3454, int i, ArrayList arrayList) {
        AbstractC2043[] abstractC2043Arr;
        if (arrayList.size() > 0) {
            AbstractC2043[] abstractC2043Arr2 = new AbstractC2043[arrayList.size()];
            arrayList.toArray(abstractC2043Arr2);
            abstractC2043Arr = abstractC2043Arr2;
        } else {
            abstractC2043Arr = null;
        }
        return (C4160) c3454.f10952.m25237(new C4160(c3454, i, 1, 0, abstractC2043Arr, null, null));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4160 m12581(C3454 c3454) {
        int i;
        C2749[] c2749Arr;
        C9099 c9099;
        C13582 c13582 = this.f13570.f41402.f70680.f38655;
        if (c13582 == null) {
            i = 0;
        } else {
            int iM50836 = 0;
            for (C22755 c22755 : c13582.f40520) {
                iM50836 += c22755.m50836();
            }
            i = iM50836;
        }
        if ((this.f13570.f41403 & EnumC7233.STATIC.getValue()) == 0) {
            i++;
        }
        this.f13574 = i;
        ArrayList arrayList = new ArrayList(3);
        C2749[] c2749Arr2 = this.f13575;
        C9099[] c9099Arr = null;
        if (c2749Arr2 == null) {
            c2749Arr = null;
        } else {
            C2749[] c2749Arr3 = new C2749[c2749Arr2.length];
            int i2 = 0;
            while (true) {
                C2749[] c2749Arr4 = this.f13575;
                if (i2 >= c2749Arr4.length) {
                    break;
                }
                C2749 c2749 = c2749Arr4[i2];
                C9099 c90910 = c2749.f8553;
                C16153[] c16153Arr = c90910.f27575;
                if (c16153Arr == null) {
                    c9099 = null;
                } else {
                    C16153[] c16153Arr2 = new C16153[c16153Arr.length];
                    int i3 = 0;
                    while (true) {
                        C16153[] c16153Arr3 = c90910.f27575;
                        if (i3 >= c16153Arr3.length) {
                            break;
                        }
                        C16153 c16153 = c16153Arr3[i3];
                        c16153Arr2[i3] = new C16153(C22755.m50831(c16153.f49753.m50835(), c3454), c16153.m38080());
                        i3++;
                    }
                    c9099 = new C9099(c16153Arr2, c90910.m23473());
                }
                arrayList.add(c9099);
                c2749Arr3[i2] = new C2749(c2749.m8500(), c2749.m8501(), c9099);
                i2++;
            }
            c2749Arr = c2749Arr3;
        }
        if (arrayList.size() > 0) {
            c9099Arr = new C9099[arrayList.size()];
            arrayList.toArray(c9099Arr);
        }
        C9099[] c9099Arr2 = c9099Arr;
        int i4 = this.f13572;
        int i5 = this.f13574;
        int i6 = this.f13571;
        AbstractC2043[] abstractC2043Arr = this.f13573;
        for (AbstractC2043 abstractC2043 : abstractC2043Arr) {
            switch (C9805.f29641[abstractC2043.mo2742().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    AbstractC16859 abstractC16859 = (AbstractC16859) abstractC2043;
                    int i7 = C9805.f29642[abstractC2043.f6840.f77584.ordinal()];
                    if (i7 == 1) {
                        abstractC16859.m39630(((C18522) abstractC16859.m39631()).m43042(c3454));
                    } else if (i7 == 2) {
                        abstractC16859.m39630(((C22050) abstractC16859.m39631()).m49613(c3454));
                    } else if (i7 == 3) {
                        abstractC16859.m39630(C22755.m50831(((C22755) abstractC16859.m39631()).m50835(), c3454));
                    } else if (i7 == 4) {
                        abstractC16859.m39630(C11467.m28270(((C11467) abstractC16859.m39631()).m28273(), c3454));
                    }
                    break;
            }
        }
        return (C4160) c3454.f10952.m25237(new C4160(c3454, i4, i5, i6, abstractC2043Arr, c2749Arr, c9099Arr2));
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        C3454 c3454;
        AbstractC2043 abstractC2043Mo10677;
        this.f13572 = c10720.m26907();
        this.f13574 = c10720.m26907();
        this.f13571 = c10720.m26907();
        int iM26907 = c10720.m26907();
        C21799 c21799 = (C21799) c12172.m29651(EnumC14993.TYPE_DEBUG_INFO_ITEM, c10720.m26904());
        this.f13569 = c21799;
        if (c21799 != null) {
            c21799.m49137(this);
        }
        int iM26904 = c10720.m26904();
        ArrayList arrayList = new ArrayList();
        byte[] bArrM26902 = c10720.m26902(iM26904 * 2);
        int iMo6715 = 0;
        while (true) {
            int length = bArrM26902.length;
            c3454 = this.f16031;
            if (iMo6715 >= length) {
                break;
            }
            try {
                EnumC23915 enumC23915M52675 = EnumC23915.m52675(bArrM26902[iMo6715]);
                if (enumC23915M52675 == null) {
                    System.err.println("Unknown opcode  address: " + C7746.m20771(iMo6715));
                    break;
                }
                EnumC23915 enumC23915 = EnumC23915.f77361;
                if (enumC23915M52675 == enumC23915) {
                    byte b = bArrM26902[iMo6715 + 1];
                    if (b == 0) {
                        abstractC2043Mo10677 = new C9141(enumC23915, 0);
                    } else if (b == 1) {
                        abstractC2043Mo10677 = new C6339(bArrM26902, iMo6715);
                    } else if (b == 2) {
                        abstractC2043Mo10677 = new C14099(bArrM26902, iMo6715);
                    } else {
                        abstractC2043Mo10677 = b != 3 ? null : new C14784(bArrM26902, iMo6715);
                    }
                } else {
                    abstractC2043Mo10677 = enumC23915M52675.f77587.f77713.mo10677(c3454, enumC23915M52675, bArrM26902, iMo6715);
                }
                arrayList.add(abstractC2043Mo10677);
                iMo6715 += abstractC2043Mo10677.mo6715(iMo6715 / 2) * 2;
            } catch (Exception e) {
                throw C16363.m38521("Error occurred at code address " + (iMo6715 * 2), e);
            }
        }
        AbstractC2043[] abstractC2043Arr = new AbstractC2043[arrayList.size()];
        this.f13573 = abstractC2043Arr;
        arrayList.toArray(abstractC2043Arr);
        if (iM26907 > 0) {
            c10720.m26899(4);
            int iM26898 = c10720.m26898();
            c10720.m26905((iM26907 * 8) + iM26898);
            int iM26899 = c10720.m26898();
            int iM26903 = c10720.m26903();
            C23419 c23419 = new C23419(iM26903);
            this.f13568 = new C9099[iM26903];
            for (int i = 0; i < iM26903; i++) {
                try {
                    int iM268910 = c10720.m26898() - iM26899;
                    this.f13568[i] = new C9099(c3454, c10720);
                    c23419.m51886(iM268910, this.f13568[i]);
                } catch (Exception e2) {
                    throw C16363.m38521("Error while reading EncodedCatchHandler at index " + i, e2);
                }
            }
            int iM268911 = c10720.m26898();
            c10720.m26905(iM26898);
            this.f13575 = new C2749[iM26907];
            for (int i2 = 0; i2 < iM26907; i2++) {
                try {
                    this.f13575[i2] = new C2749(c10720, c23419);
                } catch (Exception e3) {
                    throw C16363.m38521("Error while reading TryItem at index " + i2, e3);
                }
            }
            c10720.m26905(iM268911);
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        if (this.f13570 == null) {
            return C13540.m32584(new StringBuilder("code_item @0x"), this.f16030);
        }
        return "code_item @0x" + Integer.toHexString(this.f16030) + " (" + this.f13570.f41402.m49614() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C4160 c4160) {
        C13889 c13889 = this.f13570;
        if (c13889 == null) {
            return c4160.f13570 == null ? 0 : -1;
        }
        C13889 c138810 = c4160.f13570;
        if (c138810 == null) {
            return 1;
        }
        return c13889.f41402.compareTo(c138810.f41402);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12582(C13889 c13889) {
        this.f13570 = c13889;
    }

    public final C13889 getParent() {
        return this.f13570;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        int iMo6715 = 0;
        for (AbstractC2043 abstractC2043 : this.f13573) {
            iMo6715 += abstractC2043.mo6715(iMo6715);
        }
        int iM51496 = C23202.m51496(iMo6715, 2, 16, i);
        C2749[] c2749Arr = this.f13575;
        if (c2749Arr != null && c2749Arr.length > 0) {
            int length = (c2749Arr.length * 8) + ((iM51496 + 3) & (-4));
            iM51496 = C11166.m27697(this.f13568.length) + length;
            for (C9099 c9099 : this.f13568) {
                iM51496 = C9099.m23470(iM51496, length, c9099);
            }
        }
        return iM51496;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        int iMo6715 = 0;
        for (AbstractC2043 abstractC2043 : this.f13573) {
            iMo6715 += abstractC2043.mo6715(iMo6715);
        }
        c1547.m5304(this.f13572);
        c1547.m5304(this.f13574);
        c1547.m5304(this.f13571);
        C2749[] c2749Arr = this.f13575;
        if (c2749Arr == null) {
            c1547.m5304(0);
        } else {
            c1547.m5304(c2749Arr.length);
        }
        C21799 c21799 = this.f13569;
        if (c21799 == null) {
            c1547.m5302(0);
        } else {
            c1547.m5302(c21799.f16030);
        }
        c1547.m5302(iMo6715);
        int iM6716 = 0;
        for (AbstractC2043 abstractC2044 : this.f13573) {
            iM6716 = abstractC2044.m6716(c1547, iM6716);
        }
        C2749[] c2749Arr2 = this.f13575;
        if (c2749Arr2 == null || c2749Arr2.length <= 0) {
            return;
        }
        if (iM6716 % 2 != 0) {
            c1547.m5304(0);
        }
        for (C2749 c2749 : this.f13575) {
            C2749.m8499(c2749, c1547);
        }
        c1547.m5301(this.f13568.length);
        for (C9099 c9099 : this.f13568) {
            C9099.m23472(c9099, c1547);
        }
    }
}
