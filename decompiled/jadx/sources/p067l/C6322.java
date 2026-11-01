package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes3.dex */
public final class C6322 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public C11016[] f16381;

    /* JADX INFO: renamed from: ۙ */
    public C23086 f16382;

    /* JADX INFO: renamed from: ۛ */
    public C15568 f16383;

    /* JADX INFO: renamed from: ۤ */
    public int f16384;

    /* JADX INFO: renamed from: ۨ */
    public int f16385;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC4310[] f16386;

    /* JADX INFO: renamed from: ۬ */
    public int f16387;

    /* JADX INFO: renamed from: ᩺ */
    public C4981[] f16388;

    public C6322(C5651 c5651, int i, int i2, int i3, AbstractC4310[] abstractC4310Arr, C4981[] c4981Arr, C11016[] c11016Arr) {
        super(c5651);
        this.f16385 = i;
        this.f16387 = i2;
        this.f16384 = i3;
        this.f16382 = null;
        this.f16386 = abstractC4310Arr;
        this.f16388 = c4981Arr;
        this.f16381 = c11016Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6322 m14453(C5651 c5651, int i, ArrayList arrayList) {
        AbstractC4310[] abstractC4310Arr;
        if (arrayList.size() > 0) {
            AbstractC4310[] abstractC4310Arr2 = new AbstractC4310[arrayList.size()];
            arrayList.toArray(abstractC4310Arr2);
            abstractC4310Arr = abstractC4310Arr2;
        } else {
            abstractC4310Arr = null;
        }
        return (C6322) c5651.f13753.m27254(new C6322(c5651, i, 1, 0, abstractC4310Arr, null, null));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6322 m14455(C5651 c5651) {
        int i;
        C4981[] c4981Arr;
        C11016 c11016;
        C15276 c15276 = this.f16383.f44483.f73397.f41698;
        if (c15276 == null) {
            i = 0;
        } else {
            int iM53169 = 0;
            for (C23994 c23994 : c15276.f43597) {
                iM53169 += c23994.m53169();
            }
            i = iM53169;
        }
        if ((this.f16383.f44484 & EnumC9242.STATIC.getValue()) == 0) {
            i++;
        }
        this.f16387 = i;
        ArrayList arrayList = new ArrayList(3);
        C4981[] c4981Arr2 = this.f16388;
        C11016[] c11016Arr = null;
        if (c4981Arr2 == null) {
            c4981Arr = null;
        } else {
            C4981[] c4981Arr3 = new C4981[c4981Arr2.length];
            int i2 = 0;
            while (true) {
                C4981[] c4981Arr4 = this.f16388;
                if (i2 >= c4981Arr4.length) {
                    break;
                }
                C4981 c4981 = c4981Arr4[i2];
                C11016 c11017 = c4981.f11347;
                C17720[] c17720Arr = c11017.f30512;
                if (c17720Arr == null) {
                    c11016 = null;
                } else {
                    C17720[] c17720Arr2 = new C17720[c17720Arr.length];
                    int i3 = 0;
                    while (true) {
                        C17720[] c17720Arr3 = c11017.f30512;
                        if (i3 >= c17720Arr3.length) {
                            break;
                        }
                        C17720 c17720 = c17720Arr3[i3];
                        c17720Arr2[i3] = new C17720(C23994.m53164(c17720.f52919.m53168(), c5651), c17720.m40272());
                        i3++;
                    }
                    c11016 = new C11016(c17720Arr2, c11017.m25420());
                }
                arrayList.add(c11016);
                c4981Arr3[i2] = new C4981(c4981.m10547(), c4981.m10548(), c11016);
                i2++;
            }
            c4981Arr = c4981Arr3;
        }
        if (arrayList.size() > 0) {
            c11016Arr = new C11016[arrayList.size()];
            arrayList.toArray(c11016Arr);
        }
        C11016[] c11016Arr2 = c11016Arr;
        int i4 = this.f16385;
        int i5 = this.f16387;
        int i6 = this.f16384;
        AbstractC4310[] abstractC4310Arr = this.f16386;
        for (AbstractC4310 abstractC4310 : abstractC4310Arr) {
            switch (C11687.f32592[abstractC4310.mo5081().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    AbstractC18391 abstractC18391 = (AbstractC18391) abstractC4310;
                    int i7 = C11687.f32593[abstractC4310.f9623.f80335.ordinal()];
                    if (i7 == 1) {
                        abstractC18391.m41866(((C19971) abstractC18391.m41867()).m45320(c5651));
                    } else if (i7 == 2) {
                        abstractC18391.m41866(((C23324) abstractC18391.m41867()).m51949(c5651));
                    } else if (i7 == 3) {
                        abstractC18391.m41866(C23994.m53164(((C23994) abstractC18391.m41867()).m53168(), c5651));
                    } else if (i7 == 4) {
                        abstractC18391.m41866(C13266.m30314(((C13266) abstractC18391.m41867()).m30317(), c5651));
                    }
                    break;
            }
        }
        return (C6322) c5651.f13753.m27254(new C6322(c5651, i4, i5, i6, abstractC4310Arr, c4981Arr, c11016Arr2));
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        C5651 c5651;
        AbstractC4310 abstractC4310Mo12672;
        this.f16385 = c12556.m28947();
        this.f16387 = c12556.m28947();
        this.f16384 = c12556.m28947();
        int iM28947 = c12556.m28947();
        C23086 c23086 = (C23086) c13936.m31713(EnumC16617.TYPE_DEBUG_INFO_ITEM, c12556.m28944());
        this.f16382 = c23086;
        if (c23086 != null) {
            c23086.m51487(this);
        }
        int iM28944 = c12556.m28944();
        ArrayList arrayList = new ArrayList();
        byte[] bArrM28942 = c12556.m28942(iM28944 * 2);
        int iMo8841 = 0;
        while (true) {
            int length = bArrM28942.length;
            c5651 = this.f18865;
            if (iMo8841 >= length) {
                break;
            }
            try {
                EnumC25097 enumC25097M55081 = EnumC25097.m55081(bArrM28942[iMo8841]);
                if (enumC25097M55081 == null) {
                    System.err.println("Unknown opcode  address: " + C9731.m22752(iMo8841));
                    break;
                }
                EnumC25097 enumC25097 = EnumC25097.f80112;
                if (enumC25097M55081 == enumC25097) {
                    byte b = bArrM28942[iMo8841 + 1];
                    if (b == 0) {
                        abstractC4310Mo12672 = new C11056(enumC25097, 0);
                    } else if (b == 1) {
                        abstractC4310Mo12672 = new C8393(bArrM28942, iMo8841);
                    } else if (b == 2) {
                        abstractC4310Mo12672 = new C15768(bArrM28942, iMo8841);
                    } else {
                        abstractC4310Mo12672 = b != 3 ? null : new C16419(bArrM28942, iMo8841);
                    }
                } else {
                    abstractC4310Mo12672 = enumC25097M55081.f80338.f80465.mo12672(c5651, enumC25097M55081, bArrM28942, iMo8841);
                }
                arrayList.add(abstractC4310Mo12672);
                iMo8841 += abstractC4310Mo12672.mo8841(iMo8841 / 2) * 2;
            } catch (Exception e) {
                throw C17919.m40738("Error occurred at code address " + (iMo8841 * 2), e);
            }
        }
        AbstractC4310[] abstractC4310Arr = new AbstractC4310[arrayList.size()];
        this.f16386 = abstractC4310Arr;
        arrayList.toArray(abstractC4310Arr);
        if (iM28947 > 0) {
            c12556.m28939(4);
            int iM28938 = c12556.m28938();
            c12556.m28945((iM28947 * 8) + iM28938);
            int iM28939 = c12556.m28938();
            int iM28943 = c12556.m28943();
            C24625 c24625 = new C24625(iM28943);
            this.f16381 = new C11016[iM28943];
            for (int i = 0; i < iM28943; i++) {
                try {
                    int iM289310 = c12556.m28938() - iM28939;
                    this.f16381[i] = new C11016(c5651, c12556);
                    c24625.m54284(iM289310, this.f16381[i]);
                } catch (Exception e2) {
                    throw C17919.m40738("Error while reading EncodedCatchHandler at index " + i, e2);
                }
            }
            int iM289311 = c12556.m28938();
            c12556.m28945(iM28938);
            this.f16388 = new C4981[iM28947];
            for (int i2 = 0; i2 < iM28947; i2++) {
                try {
                    this.f16388[i2] = new C4981(c12556, c24625);
                } catch (Exception e3) {
                    throw C17919.m40738("Error while reading TryItem at index " + i2, e3);
                }
            }
            c12556.m28945(iM289311);
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        if (this.f16383 == null) {
            return C1514.m34687(new StringBuilder("code_item @0x"), this.f18864);
        }
        return "code_item @0x" + Integer.toHexString(this.f18864) + " (" + this.f16383.f44483.m51950() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C6322 c6322) {
        C15568 c15568 = this.f16383;
        if (c15568 == null) {
            return c6322.f16383 == null ? 0 : -1;
        }
        C15568 c15569 = c6322.f16383;
        if (c15569 == null) {
            return 1;
        }
        return c15568.f44483.compareTo(c15569.f44483);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14456(C15568 c15568) {
        this.f16383 = c15568;
    }

    public final C15568 getParent() {
        return this.f16383;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        int iMo8841 = 0;
        for (AbstractC4310 abstractC4310 : this.f16386) {
            iMo8841 += abstractC4310.mo8841(iMo8841);
        }
        int iM53892 = C24420.m53892(iMo8841, 2, 16, i);
        C4981[] c4981Arr = this.f16388;
        if (c4981Arr != null && c4981Arr.length > 0) {
            int length = (c4981Arr.length * 8) + ((iM53892 + 3) & (-4));
            iM53892 = C12981.m29759(this.f16381.length) + length;
            for (C11016 c11016 : this.f16381) {
                iM53892 = C11016.m25417(iM53892, length, c11016);
            }
        }
        return iM53892;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        int iMo8841 = 0;
        for (AbstractC4310 abstractC4310 : this.f16386) {
            iMo8841 += abstractC4310.mo8841(iMo8841);
        }
        c3838.m7533(this.f16385);
        c3838.m7533(this.f16387);
        c3838.m7533(this.f16384);
        C4981[] c4981Arr = this.f16388;
        if (c4981Arr == null) {
            c3838.m7533(0);
        } else {
            c3838.m7533(c4981Arr.length);
        }
        C23086 c23086 = this.f16382;
        if (c23086 == null) {
            c3838.m7531(0);
        } else {
            c3838.m7531(c23086.f18864);
        }
        c3838.m7531(iMo8841);
        int iM8842 = 0;
        for (AbstractC4310 abstractC4311 : this.f16386) {
            iM8842 = abstractC4311.m8842(c3838, iM8842);
        }
        C4981[] c4981Arr2 = this.f16388;
        if (c4981Arr2 == null || c4981Arr2.length <= 0) {
            return;
        }
        if (iM8842 % 2 != 0) {
            c3838.m7533(0);
        }
        for (C4981 c4981 : this.f16388) {
            C4981.m10546(c4981, c3838);
        }
        c3838.m7530(this.f16381.length);
        for (C11016 c11016 : this.f16381) {
            C11016.m25419(c11016, c3838);
        }
    }
}
