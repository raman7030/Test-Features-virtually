package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 098S */
/* JADX INFO: loaded from: classes.dex */
public class C17266 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C17266 f51379;

    /* JADX INFO: renamed from: ֫ */
    public int f51380;

    /* JADX INFO: renamed from: ۧ */
    public int f51381;

    /* JADX INFO: renamed from: ܽ */
    public int[] f51382;

    /* JADX INFO: renamed from: ֫ */
    public static native long m39050(long j);

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39055(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    static {
        ApplicationC14266.m56479(118);
        f51379 = new C17266(1);
    }

    public C17266() {
        this.f51381 = 0;
        this.f51382 = new int[1];
        this.f51380 = 0;
    }

    public C17266(int i) {
        this.f51381 = 0;
        this.f51382 = new int[]{i};
        this.f51380 = 1;
    }

    public C17266(int[] iArr) {
        this.f51381 = 0;
        this.f51382 = iArr;
        this.f51380 = iArr.length;
    }

    public C17266(C19279 c19279) {
        this.f51381 = 0;
        int[] iArr = c19279.f55579;
        int length = iArr.length;
        this.f51380 = length;
        this.f51382 = Arrays.copyOf(iArr, length);
    }

    public C17266(C17266 c17266) {
        this.f51381 = 0;
        int i = c17266.f51380;
        this.f51380 = i;
        int[] iArr = c17266.f51382;
        int i2 = c17266.f51381;
        this.f51382 = Arrays.copyOfRange(iArr, i2, i + i2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX INFO: renamed from: ᩳ */
    public final C19279 m39077(int i) {
        int[] iArrCopyOfRange;
        int i2 = this.f51380;
        if (i2 != 0 && i != 0) {
            int i3 = this.f51381;
            if (i3 <= 0) {
                iArrCopyOfRange = this.f51382;
                if (iArrCopyOfRange.length != i2) {
                    iArrCopyOfRange = Arrays.copyOfRange(this.f51382, i3, i2 + i3);
                }
            } else {
                iArrCopyOfRange = Arrays.copyOfRange(this.f51382, i3, i2 + i3);
            }
            return new C19279(iArrCopyOfRange, i);
        }
        return C15925.f46050;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m39067(C17266 c17266) {
        int i = c17266.f51380;
        int i2 = this.f51380;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int[] iArr = c17266.f51382;
        int i3 = this.f51381;
        int i4 = c17266.f51381;
        while (i3 < this.f51380 + this.f51381) {
            int i5 = this.f51382[i3] - Integer.MIN_VALUE;
            int i6 = iArr[i4] - Integer.MIN_VALUE;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            i3++;
            i4++;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܿ */
    private final int m39058() {
        int i = this.f51380;
        if (i == 0) {
            return -1;
        }
        do {
            i--;
            if (i <= 0) {
                break;
            }
        } while (this.f51382[this.f51381 + i] == 0);
        int i2 = this.f51382[this.f51381 + i];
        if (i2 == 0) {
            return -1;
        }
        return Integer.numberOfTrailingZeros(i2) + (((this.f51380 - 1) - i) << 5);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m39078() {
        int i = this.f51380;
        if (i == 0) {
            this.f51381 = 0;
            return;
        }
        int i2 = this.f51381;
        if (this.f51382[i2] != 0) {
            return;
        }
        int i3 = i + i2;
        do {
            i2++;
            if (i2 >= i3) {
                break;
            }
        } while (this.f51382[i2] == 0);
        int i4 = this.f51381;
        int i5 = i2 - i4;
        int i6 = this.f51380 - i5;
        this.f51380 = i6;
        this.f51381 = i6 != 0 ? i4 + i5 : 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39070(int i, C17266 c17266) {
        if (i == 1) {
            int i2 = this.f51380;
            if (c17266.f51382.length < i2) {
                c17266.f51382 = new int[i2];
            }
            System.arraycopy(this.f51382, this.f51381, c17266.f51382, 0, i2);
            c17266.f51380 = i2;
            c17266.f51381 = 0;
            return;
        }
        if (i == 0) {
            c17266.f51380 = 0;
            c17266.f51381 = 0;
            int length = c17266.f51382.length;
            for (int i3 = 0; i3 < length; i3++) {
                c17266.f51382[i3] = 0;
            }
            return;
        }
        long j = ((long) i) & 4294967295L;
        int[] iArr = c17266.f51382;
        int length2 = iArr.length;
        int i4 = this.f51380;
        int i5 = i4 + 1;
        if (length2 < i5) {
            iArr = new int[i5];
        }
        long j2 = 0;
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            long j3 = ((((long) this.f51382[this.f51381 + i6]) & 4294967295L) * j) + j2;
            iArr[i6 + 1] = (int) j3;
            j2 = j3 >>> 32;
        }
        if (j2 == 0) {
            c17266.f51381 = 1;
            c17266.f51380 = this.f51380;
        } else {
            c17266.f51381 = 0;
            c17266.f51380 = this.f51380 + 1;
            iArr[0] = (int) j2;
        }
        c17266.f51382 = iArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m39071() {
        return this.f51380 == 1 && this.f51382[this.f51381] == 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m39075() {
        return this.f51380 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39066() {
        int i = this.f51380;
        return i == 0 || (this.f51382[(this.f51381 + i) - 1] & 1) == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17266 m39072(C17266 c17266) {
        if (!c17266.m39075() && (c17266.f51382[(c17266.f51381 + c17266.f51380) - 1] & 1) == 1) {
            return m39059(c17266);
        }
        if (m39066()) {
            throw new RuntimeException();
        }
        int iM39058 = c17266.m39058();
        C17266 c17267 = new C17266(c17266);
        c17267.m39074(iM39058);
        if (c17267.m39071()) {
            return m39068(iM39058);
        }
        C17266 c17266M39059 = m39059(c17267);
        C17266 c17266M39068 = m39068(iM39058);
        C17266 c17266M39052 = m39052(new C17266(1), new C17266(c17267), iM39058);
        C17266 c17266M39069 = c17267.m39068(iM39058);
        C17266 c17268 = new C17266();
        C17266 c17269 = new C17266();
        C17266 c172610 = new C17266();
        c17266M39059.m39063(iM39058);
        c17266M39059.m39079(c17266M39052, c172610);
        c17266M39068.m39079(c17267, c17268);
        c17268.m39079(c17266M39069, c17269);
        c172610.m39065(c17269);
        return c172610.m39062(c17266, c17268);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39074(int i) {
        int i2 = this.f51380;
        if (i2 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        this.f51380 = i2 - i3;
        if (i4 == 0) {
            return;
        }
        if (i4 >= 32 - Integer.numberOfLeadingZeros(this.f51382[this.f51381])) {
            m39061(32 - i4);
            this.f51380--;
        } else {
            m39057(i4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39063(int i) {
        int i2;
        if (this.f51380 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        int iNumberOfLeadingZeros = 32 - (32 - Integer.numberOfLeadingZeros(this.f51382[this.f51381]));
        if (i <= iNumberOfLeadingZeros) {
            m39061(i4);
            return;
        }
        int i5 = this.f51380 + i3;
        int i6 = i5 + 1;
        if (i4 > iNumberOfLeadingZeros) {
            i5 = i6;
        }
        int[] iArr = this.f51382;
        if (iArr.length < i5) {
            int[] iArr2 = new int[i5];
            for (int i7 = 0; i7 < this.f51380; i7++) {
                iArr2[i7] = this.f51382[this.f51381 + i7];
            }
            this.f51382 = iArr2;
            this.f51380 = i5;
            this.f51381 = 0;
        } else if (iArr.length - this.f51381 >= i5) {
            int i8 = 0;
            while (true) {
                int i9 = this.f51380;
                if (i8 >= i5 - i9) {
                    break;
                }
                this.f51382[this.f51381 + i9 + i8] = 0;
                i8++;
            }
        } else {
            int i10 = 0;
            while (true) {
                i2 = this.f51380;
                if (i10 >= i2) {
                    break;
                }
                int[] iArr3 = this.f51382;
                iArr3[i10] = iArr3[this.f51381 + i10];
                i10++;
            }
            while (i2 < i5) {
                this.f51382[i2] = 0;
                i2++;
            }
            this.f51381 = 0;
        }
        this.f51380 = i5;
        if (i4 == 0) {
            return;
        }
        if (i4 <= iNumberOfLeadingZeros) {
            m39061(i4);
        } else {
            m39057(32 - i4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39054(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i2 = length + i;
            long j2 = (((long) iArr[length]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m39048(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        long j = ((long) i) & 4294967295L;
        int i4 = i3 + i2;
        int i5 = i2 - 1;
        long j2 = 0;
        while (i5 >= 0) {
            long j3 = ((((long) iArr2[i5]) & 4294967295L) * j) + j2;
            long j4 = ((long) iArr[i4]) - j3;
            int i6 = i4 - 1;
            iArr[i4] = (int) j4;
            j2 = ((long) ((j4 & 4294967295L) > (((long) (~((int) j3))) & 4294967295L) ? 1 : 0)) + (j3 >>> 32);
            i5--;
            i4 = i6;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: ܳ */
    private final void m39057(int i) {
        int[] iArr = this.f51382;
        int i2 = 32 - i;
        int i3 = (this.f51381 + this.f51380) - 1;
        int i4 = iArr[i3];
        while (true) {
            int i5 = this.f51381;
            if (i3 > i5) {
                int i6 = iArr[i3 - 1];
                iArr[i3] = (i4 >>> i) | (i6 << i2);
                i3--;
                i4 = i6;
            } else {
                iArr[i5] = iArr[i5] >>> i;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private final void m39061(int i) {
        int[] iArr = this.f51382;
        int i2 = 32 - i;
        int i3 = this.f51381;
        int i4 = iArr[i3];
        int i5 = (this.f51380 + i3) - 1;
        while (i3 < i5) {
            int i6 = i3 + 1;
            int i7 = iArr[i6];
            iArr[i3] = (i4 << i) | (i7 >>> i2);
            i3 = i6;
            i4 = i7;
        }
        int i8 = (this.f51381 + this.f51380) - 1;
        iArr[i8] = iArr[i8] << i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39065(C17266 c17266) {
        int i = this.f51380;
        int i2 = c17266.f51380;
        int i3 = i > i2 ? i : i2;
        int[] iArr = this.f51382;
        if (iArr.length < i3) {
            iArr = new int[i3];
        }
        int length = iArr.length - 1;
        long j = 0;
        while (i > 0 && i2 > 0) {
            int i4 = i - 1;
            int i5 = i2 - 1;
            long j2 = (((long) this.f51382[this.f51381 + i4]) & 4294967295L) + (((long) c17266.f51382[c17266.f51381 + i5]) & 4294967295L) + j;
            iArr[length] = (int) j2;
            j = j2 >>> 32;
            length--;
            i = i4;
            i2 = i5;
        }
        while (i > 0) {
            i--;
            if (j == 0 && iArr == this.f51382 && length == this.f51381 + i) {
                return;
            }
            long j3 = (((long) this.f51382[this.f51381 + i]) & 4294967295L) + j;
            iArr[length] = (int) j3;
            length--;
            j = j3 >>> 32;
        }
        while (i2 > 0) {
            i2--;
            long j4 = (((long) c17266.f51382[c17266.f51381 + i2]) & 4294967295L) + j;
            iArr[length] = (int) j4;
            j = j4 >>> 32;
            length--;
        }
        if (j > 0) {
            i3++;
            if (iArr.length < i3) {
                int[] iArr2 = new int[i3];
                System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
                iArr2[0] = 1;
                iArr = iArr2;
            } else {
                iArr[length] = 1;
            }
        }
        this.f51382 = iArr;
        this.f51380 = i3;
        this.f51381 = iArr.length - i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39064(int i, C17266 c17266) {
        if (c17266.m39075()) {
            return;
        }
        int i2 = this.f51380;
        int i3 = c17266.f51380 + i;
        int i4 = i2 > i3 ? i2 : i3;
        int[] iArr = this.f51382;
        if (iArr.length < i4) {
            iArr = new int[i4];
        } else {
            Arrays.fill(iArr, this.f51381 + i2, iArr.length, 0);
        }
        int length = iArr.length;
        System.arraycopy(this.f51382, this.f51381, iArr, length - i2, i2);
        int i5 = i3 - i2;
        int i6 = (length - 1) - i2;
        int iMin = Math.min(i5, c17266.f51382.length - c17266.f51381);
        int i7 = i6 + 1;
        int i8 = i7 - i5;
        System.arraycopy(c17266.f51382, c17266.f51381, iArr, i8, iMin);
        for (int i9 = i8 + iMin; i9 < i7; i9++) {
            iArr[i9] = 0;
        }
        this.f51382 = iArr;
        this.f51380 = i4;
        this.f51381 = iArr.length - i4;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m39076(C17266 c17266) {
        C17266 c17267;
        C17266 c17268;
        int[] iArr = this.f51382;
        int iM39067 = m39067(c17266);
        if (iM39067 == 0) {
            this.f51380 = 0;
            this.f51381 = 0;
            return 0;
        }
        if (iM39067 < 0) {
            c17268 = c17266;
            c17267 = this;
        } else {
            c17267 = c17266;
            c17268 = this;
        }
        int i = c17268.f51380;
        if (iArr.length < i) {
            iArr = new int[i];
        }
        int i2 = c17267.f51380;
        int length = iArr.length - 1;
        long j = 0;
        int i3 = i;
        while (i2 > 0) {
            i3--;
            i2--;
            j = ((((long) c17268.f51382[c17268.f51381 + i3]) & 4294967295L) - (((long) c17267.f51382[c17267.f51381 + i2]) & 4294967295L)) - ((long) ((int) (-(j >> 32))));
            iArr[length] = (int) j;
            length--;
        }
        while (i3 > 0) {
            i3--;
            j = (((long) c17268.f51382[c17268.f51381 + i3]) & 4294967295L) - ((long) ((int) (-(j >> 32))));
            iArr[length] = (int) j;
            length--;
        }
        this.f51382 = iArr;
        this.f51380 = i;
        this.f51381 = iArr.length - i;
        m39078();
        return iM39067;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m39079(C17266 c17266, C17266 c17267) {
        C17266 c17268 = this;
        C17266 c17269 = c17266;
        int i = c17268.f51380;
        int i2 = c17269.f51380;
        int i3 = i + i2;
        if (c17267.f51382.length < i3) {
            c17267.f51382 = new int[i3];
        }
        c17267.f51381 = 0;
        c17267.f51380 = i3;
        int i4 = i2 - 1;
        int i5 = i3 - 1;
        long j = 0;
        int i6 = i4;
        while (i6 >= 0) {
            long j2 = ((((long) c17269.f51382[c17269.f51381 + i6]) & 4294967295L) * (((long) c17268.f51382[(i - 1) + c17268.f51381]) & 4294967295L)) + j;
            c17267.f51382[i5] = (int) j2;
            j = j2 >>> 32;
            i6--;
            i5--;
        }
        c17267.f51382[i - 1] = (int) j;
        int i7 = i - 2;
        while (i7 >= 0) {
            int i8 = i2 + i7;
            long j3 = 0;
            int i9 = i4;
            while (i9 >= 0) {
                long j4 = (((long) c17269.f51382[c17269.f51381 + i9]) & 4294967295L) * (((long) c17268.f51382[c17268.f51381 + i7]) & 4294967295L);
                int[] iArr = c17267.f51382;
                long j5 = j4 + (((long) iArr[i8]) & 4294967295L) + j3;
                iArr[i8] = (int) j5;
                j3 = j5 >>> 32;
                i9--;
                i8--;
                c17268 = this;
                c17269 = c17266;
                i2 = i2;
            }
            c17267.f51382[i7] = (int) j3;
            i7--;
            c17268 = this;
            c17269 = c17266;
            i2 = i2;
        }
        c17267.m39078();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17266 m39062(C17266 c17266, C17266 c17267) {
        int i = c17266.f51380;
        if (i < 80 || this.f51380 - i < 40) {
            return m39073(c17266, c17267);
        }
        return m39069(c17266, c17267);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17266 m39073(C17266 c17266, C17266 c17267) {
        int i;
        int[] iArrCopyOfRange;
        C17266 c17268;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        C17266 c17269;
        int[] iArr;
        int i6;
        long j;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr2;
        int i13;
        int i14;
        int i15;
        int iMin;
        long j2;
        int i16;
        int i17;
        long j3;
        if (c17266.f51380 == 0) {
            throw new RuntimeException();
        }
        if (this.f51380 == 0) {
            c17267.f51381 = 0;
            c17267.f51380 = 0;
            return new C17266();
        }
        int iM39067 = m39067(c17266);
        if (iM39067 < 0) {
            c17267.f51381 = 0;
            c17267.f51380 = 0;
            return new C17266(this);
        }
        if (iM39067 != 0) {
            c17267.f51380 = 0;
            c17267.f51381 = 0;
            int length = c17267.f51382.length;
            for (int i18 = 0; i18 < length; i18++) {
                c17267.f51382[i18] = 0;
            }
            char c = ' ';
            if (c17266.f51380 == 1) {
                int i19 = c17266.f51382[c17266.f51381];
                long j4 = ((long) i19) & 4294967295L;
                int i20 = this.f51380;
                if (i20 == 1) {
                    long j5 = 4294967295L & ((long) this.f51382[this.f51381]);
                    int i21 = (int) (j5 / j4);
                    i16 = (int) (j5 - (((long) i21) * j4));
                    c17267.f51382[0] = i21;
                    c17267.f51380 = i21 == 0 ? 0 : 1;
                    c17267.f51381 = 0;
                } else {
                    if (c17267.f51382.length < i20) {
                        c17267.f51382 = new int[i20];
                    }
                    c17267.f51381 = 0;
                    c17267.f51380 = i20;
                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i19);
                    int i22 = this.f51382[this.f51381];
                    long j6 = ((long) i22) & 4294967295L;
                    if (j6 < j4) {
                        j2 = 0;
                        c17267.f51382[0] = 0;
                    } else {
                        int i23 = (int) (j6 / j4);
                        c17267.f51382[0] = i23;
                        i22 = (int) (j6 - (((long) i23) * j4));
                        j6 = ((long) i22) & 4294967295L;
                        j2 = 0;
                    }
                    int i24 = this.f51380;
                    while (true) {
                        int i25 = i24 - 1;
                        if (i25 <= 0) {
                            break;
                        }
                        int i26 = iNumberOfLeadingZeros;
                        long j7 = (((long) this.f51382[(this.f51381 + this.f51380) - i25]) & 4294967295L) | (j6 << c);
                        if (j7 >= j2) {
                            i17 = (int) (j7 / j4);
                            j3 = j7 - (((long) i17) * j4);
                        } else {
                            long jM39049 = m39049(i19, j7);
                            i17 = (int) (jM39049 & 4294967295L);
                            j3 = jM39049 >>> 32;
                        }
                        int i27 = (int) j3;
                        c17267.f51382[this.f51380 - i25] = i17;
                        j6 = ((long) i27) & 4294967295L;
                        iNumberOfLeadingZeros = i26;
                        i22 = i27;
                        i24 = i25;
                        c = ' ';
                    }
                    int i28 = iNumberOfLeadingZeros;
                    c17267.m39078();
                    i16 = i28 > 0 ? i22 % i19 : i22;
                }
                if (i16 == 0) {
                    return new C17266();
                }
                return new C17266(i16);
            }
            if (this.f51380 >= 6 && (iMin = Math.min(m39058(), c17266.m39058())) >= 96) {
                C17266 c172610 = new C17266(this);
                C17266 c172611 = new C17266(c17266);
                c172610.m39074(iMin);
                c172611.m39074(iMin);
                C17266 c17266M39073 = c172610.m39073(c172611, c17267);
                c17266M39073.m39063(iMin);
                return c17266M39073;
            }
            int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(c17266.f51382[c17266.f51381]);
            int i29 = c17266.f51380;
            if (iNumberOfLeadingZeros2 > 0) {
                int[] iArr3 = new int[i29];
                i = i29;
                m39053(c17266.f51381, i29, c17266.f51382, 0, iArr3, iNumberOfLeadingZeros2);
                if (Integer.numberOfLeadingZeros(this.f51382[this.f51381]) >= iNumberOfLeadingZeros2) {
                    int[] iArr4 = new int[this.f51380 + 1];
                    c17268 = new C17266(iArr4);
                    c17268.f51380 = this.f51380;
                    c17268.f51381 = 1;
                    m39053(this.f51381, this.f51380, this.f51382, 1, iArr4, iNumberOfLeadingZeros2);
                    iArrCopyOfRange = iArr3;
                } else {
                    int[] iArr5 = new int[this.f51380 + 2];
                    C17266 c172612 = new C17266(iArr5);
                    c172612.f51380 = this.f51380 + 1;
                    c172612.f51381 = 1;
                    int i30 = this.f51381;
                    int i31 = 32 - iNumberOfLeadingZeros2;
                    int i32 = 1;
                    int i33 = 0;
                    while (true) {
                        i15 = this.f51380 + 1;
                        if (i32 >= i15) {
                            break;
                        }
                        int i34 = this.f51382[i30];
                        iArr5[i32] = (i33 << iNumberOfLeadingZeros2) | (i34 >>> i31);
                        i32++;
                        i30++;
                        i33 = i34;
                    }
                    iArr5[i15] = i33 << iNumberOfLeadingZeros2;
                    iArrCopyOfRange = iArr3;
                    c17268 = c172612;
                }
            } else {
                i = i29;
                int[] iArr6 = c17266.f51382;
                int i35 = c17266.f51381;
                iArrCopyOfRange = Arrays.copyOfRange(iArr6, i35, i35 + i);
                int[] iArr7 = new int[this.f51380 + 1];
                c17268 = new C17266(iArr7);
                System.arraycopy(this.f51382, this.f51381, iArr7, 1, this.f51380);
                c17268.f51380 = this.f51380;
                c17268.f51381 = 1;
            }
            int i36 = c17268.f51380;
            int i37 = i36 - i;
            int i38 = i37 + 1;
            if (c17267.f51382.length < i38) {
                c17267.f51382 = new int[i38];
                c17267.f51381 = 0;
            }
            c17267.f51380 = i38;
            int[] iArr8 = c17267.f51382;
            int i39 = c17268.f51380;
            if (i39 == i36) {
                c17268.f51381 = 0;
                c17268.f51382[0] = 0;
                c17268.f51380 = i39 + 1;
            }
            int i40 = iArrCopyOfRange[0];
            int i41 = iNumberOfLeadingZeros2;
            long j8 = ((long) i40) & 4294967295L;
            int i42 = iArrCopyOfRange[1];
            int i43 = 0;
            while (i43 < i37) {
                int[] iArr9 = c17268.f51382;
                int i44 = c17268.f51381;
                int i45 = iArr9[i43 + i44];
                int i46 = i45 - Integer.MIN_VALUE;
                int i47 = i43 + 1;
                int i48 = iArr9[i47 + i44];
                if (i45 == i40) {
                    i7 = i45 + i48;
                    z2 = i7 + Integer.MIN_VALUE < i46;
                    i8 = -1;
                } else {
                    long j9 = (((long) i45) << 32) | (((long) i48) & 4294967295L);
                    if (j9 >= 0) {
                        i6 = (int) (j9 / j8);
                        j = j9 - (((long) i6) * j8);
                    } else {
                        long jM390410 = m39049(i40, j9);
                        i6 = (int) (jM390410 & 4294967295L);
                        j = jM390410 >>> 32;
                    }
                    int i49 = (int) j;
                    z2 = false;
                    int i50 = i6;
                    i7 = i49;
                    i8 = i50;
                }
                if (i8 == 0) {
                    i10 = i40;
                    i11 = i42;
                    i14 = i;
                    iArr2 = iArr8;
                    i13 = i41;
                } else {
                    if (z2) {
                        i9 = i46;
                        i10 = i40;
                        i11 = i42;
                        i12 = i;
                        iArr2 = iArr8;
                        i13 = i41;
                    } else {
                        long j10 = ((long) c17268.f51382[i43 + 2 + c17268.f51381]) & 4294967295L;
                        int[] iArr10 = iArr8;
                        i13 = i41;
                        long j11 = ((long) i7) & 4294967295L;
                        i9 = i46;
                        i10 = i40;
                        i12 = i;
                        long j12 = ((long) i42) & 4294967295L;
                        i11 = i42;
                        iArr2 = iArr10;
                        long j13 = (((long) i8) & 4294967295L) * j12;
                        if (m39055(j13, (j11 << 32) | j10)) {
                            long j14 = ((long) ((int) (j11 + j8))) & 4294967295L;
                            i8 = (j14 < j8 || !m39055(j13 - j12, (j14 << 32) | j10)) ? i8 - 1 : i8 - 2;
                        }
                    }
                    int[] iArr11 = c17268.f51382;
                    int i51 = c17268.f51381 + i43;
                    iArr11[i51] = 0;
                    i14 = i12;
                    if (m39048(i8, i14, iArr11, iArrCopyOfRange, i51) - Integer.MIN_VALUE > i9) {
                        m39054(i47 + c17268.f51381, iArrCopyOfRange, c17268.f51382);
                        i8--;
                    }
                    iArr2[i43] = i8;
                }
                i = i14;
                i43 = i47;
                i37 = i37;
                i38 = i38;
                i41 = i13;
                i40 = i10;
                i42 = i11;
                iArr8 = iArr2;
            }
            int i52 = i40;
            int i53 = i42;
            int i54 = i;
            int i55 = i37;
            int i56 = i38;
            int[] iArr12 = iArr8;
            int i57 = i41;
            int[] iArr13 = c17268.f51382;
            int i58 = c17268.f51381;
            int i59 = iArr13[i55 + i58];
            int i60 = i59 - Integer.MIN_VALUE;
            int i61 = iArr13[i56 + i58];
            if (i59 == i52) {
                i3 = i59 + i61;
                z = i3 + Integer.MIN_VALUE < i60;
                i4 = -1;
            } else {
                long j15 = (((long) i59) << 32) | (((long) i61) & 4294967295L);
                if (j15 >= 0) {
                    i2 = (int) (j15 / j8);
                    i3 = (int) (j15 - (((long) i2) * j8));
                } else {
                    long jM390411 = m39049(i52, j15);
                    i2 = (int) (jM390411 & 4294967295L);
                    i3 = (int) (jM390411 >>> 32);
                }
                i4 = i2;
                z = false;
            }
            if (i4 != 0) {
                if (z) {
                    i5 = i60;
                    c17269 = c17268;
                    iArr = iArrCopyOfRange;
                } else {
                    long j16 = ((long) c17268.f51382[i55 + 2 + c17268.f51381]) & 4294967295L;
                    long j17 = ((long) i3) & 4294967295L;
                    i5 = i60;
                    c17269 = c17268;
                    long j18 = ((long) i53) & 4294967295L;
                    iArr = iArrCopyOfRange;
                    long j19 = (((long) i4) & 4294967295L) * j18;
                    if (m39055(j19, (j17 << 32) | j16)) {
                        long j20 = ((long) ((int) (j17 + j8))) & 4294967295L;
                        i4 = (j20 < j8 || !m39055(j19 - j18, (j20 << 32) | j16)) ? i4 - 1 : i4 - 2;
                    }
                }
                c17268 = c17269;
                int[] iArr14 = c17268.f51382;
                int i62 = i55 + c17268.f51381;
                iArr14[i62] = 0;
                int[] iArr15 = iArr;
                if (m39048(i4, i54, iArr14, iArr15, i62) - Integer.MIN_VALUE > i5) {
                    m39054(i56 + c17268.f51381, iArr15, c17268.f51382);
                    i4--;
                }
                iArr12[i55] = i4;
            }
            if (i57 > 0) {
                c17268.m39074(i57);
            }
            c17268.m39078();
            c17267.m39078();
            return c17268;
        }
        int[] iArr16 = c17267.f51382;
        c17267.f51380 = 1;
        iArr16[0] = 1;
        c17267.f51381 = 0;
        return new C17266();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17266 m39069(C17266 c17266, C17266 c17267) {
        long jNumberOfLeadingZeros;
        char c;
        C17266 c17268;
        int i;
        C17266 c17269;
        long j;
        int i2 = this.f51380;
        int i3 = c17266.f51380;
        c17267.f51380 = 0;
        c17267.f51381 = 0;
        if (i2 < i3) {
            return this;
        }
        int i4 = 1;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i3 / 80));
        int i5 = (((i3 + iNumberOfLeadingZeros) - 1) / iNumberOfLeadingZeros) * iNumberOfLeadingZeros;
        long j2 = ((long) i5) * 32;
        int i6 = c17266.f51380;
        if (i6 == 0) {
            c = ' ';
            jNumberOfLeadingZeros = 0;
        } else {
            jNumberOfLeadingZeros = (((long) i6) * 32) - ((long) Integer.numberOfLeadingZeros(c17266.f51382[c17266.f51381]));
            c = ' ';
        }
        int iMax = (int) Math.max(0L, j2 - jNumberOfLeadingZeros);
        C17266 c172610 = new C17266(c17266);
        if (iMax > 0) {
            c172610.m39063(iMax);
        }
        C17266 c172611 = new C17266(this);
        if (iMax > 0) {
            c172611.m39063(iMax);
        }
        int i7 = c172611.f51380;
        int iNumberOfLeadingZeros2 = (int) (((i7 == 0 ? 0L : (((long) i7) * 32) - ((long) Integer.numberOfLeadingZeros(c172611.f51382[c172611.f51381]))) + j2) / j2);
        if (iNumberOfLeadingZeros2 < 2) {
            iNumberOfLeadingZeros2 = 2;
        }
        C17266 c17266M39051 = c172611.m39051(iNumberOfLeadingZeros2 - 1, iNumberOfLeadingZeros2, i5);
        int i8 = iNumberOfLeadingZeros2 - 2;
        C17266 c17266M39052 = c172611.m39051(i8, iNumberOfLeadingZeros2, i5);
        c17266M39052.m39064(i5, c17266M39051);
        C17266 c172612 = new C17266();
        while (i8 > 0) {
            C17266 c17266M39060 = c17266M39052.m39060(c172610, c172612);
            C17266 c17266M39053 = c172611.m39051(i8 - 1, iNumberOfLeadingZeros2, i5);
            c17266M39053.m39064(i5, c17266M39060);
            int i9 = i8 * i5;
            if (c172612.m39075()) {
                c17268 = c172611;
                i = i5;
                c17269 = c17266M39053;
            } else {
                int i10 = c17267.f51380;
                int i11 = c172612.f51380 + i9;
                int i12 = i10 > i11 ? i10 : i11;
                int[] iArr = c17267.f51382;
                if (iArr.length < i12) {
                    iArr = new int[i12];
                }
                int length = iArr.length - i4;
                long j3 = 0;
                while (i10 > 0 && i11 > 0) {
                    int i13 = i10 - 1;
                    i11--;
                    int i14 = c172612.f51381 + i11;
                    C17266 c172613 = c172611;
                    int[] iArr2 = c172612.f51382;
                    int i15 = i5;
                    long j4 = (((long) c17267.f51382[c17267.f51381 + i13]) & 4294967295L) + (((long) (i14 < iArr2.length ? iArr2[i14] : 0)) & 4294967295L) + j3;
                    iArr[length] = (int) j4;
                    j3 = j4 >>> c;
                    length--;
                    i5 = i15;
                    c17266M39053 = c17266M39053;
                    i10 = i13;
                    c172611 = c172613;
                }
                c17268 = c172611;
                i = i5;
                c17269 = c17266M39053;
                while (true) {
                    if (i10 > 0) {
                        i10--;
                        if (j3 != 0 || iArr != c17267.f51382 || length != c17267.f51381 + i10) {
                            long j5 = (((long) c17267.f51382[c17267.f51381 + i10]) & 4294967295L) + j3;
                            iArr[length] = (int) j5;
                            j3 = j5 >>> c;
                            length--;
                        }
                    } else {
                        while (i11 > 0) {
                            i11--;
                            int i16 = c172612.f51381 + i11;
                            int[] iArr3 = c172612.f51382;
                            long j6 = (((long) (i16 < iArr3.length ? iArr3[i16] : 0)) & 4294967295L) + j3;
                            iArr[length] = (int) j6;
                            j3 = j6 >>> c;
                            length--;
                        }
                        j = 0;
                        if (j3 > 0) {
                            i12++;
                            if (iArr.length < i12) {
                                int[] iArr4 = new int[i12];
                                System.arraycopy(iArr, 0, iArr4, 1, iArr.length);
                                iArr4[0] = 1;
                                iArr = iArr4;
                            } else {
                                iArr[length] = 1;
                            }
                        }
                        c17267.f51382 = iArr;
                        c17267.f51380 = i12;
                        c17267.f51381 = iArr.length - i12;
                        break;
                    }
                }
                i8--;
                c172611 = c17268;
                i5 = i;
                c17266M39052 = c17269;
                i4 = 1;
            }
            j = 0;
            i8--;
            c172611 = c17268;
            i5 = i;
            c17266M39052 = c17269;
            i4 = 1;
        }
        C17266 c17266M39061 = c17266M39052.m39060(c172610, c172612);
        c17267.m39065(c172612);
        c17266M39061.m39074(iMax);
        return c17266M39061;
    }

    /* JADX INFO: renamed from: ܿ */
    private C17266 m39060(C17266 c17266, C17266 c17267) {
        int i = c17266.f51380;
        if (i % 2 != 0 || i < 80) {
            return m39073(c17266, c17267);
        }
        C17266 c17268 = new C17266(this);
        int i2 = i / 2;
        int i3 = i2 * 32;
        if (i3 / 32 >= c17268.f51380) {
            c17268.f51380 = 0;
            c17268.f51381 = 0;
        } else {
            c17268.m39074(i3);
        }
        int i4 = this.f51380;
        if (i4 >= i2) {
            this.f51381 = (i4 - i2) + this.f51381;
            this.f51380 = i2;
        }
        C17266 c17269 = new C17266();
        m39064(i2, c17268.m39056(c17266, c17269));
        C17266 c17266M39056 = m39056(c17266, c17267);
        c17267.m39064(i2, c17269);
        return c17266M39056;
    }

    /* JADX INFO: renamed from: ܳ */
    private C17266 m39056(C17266 c17266, C17266 c17267) {
        C19279 c19279;
        C17266 c17268;
        int i = c17266.f51380 / 2;
        C17266 c17269 = new C17266(this);
        int i2 = i * 32;
        int i3 = i2 / 32;
        if (i3 >= c17269.f51380) {
            c17269.f51380 = 0;
            c17269.f51381 = 0;
        } else {
            c17269.m39074(i2);
        }
        C17266 c172610 = new C17266(c17266);
        if (i3 >= c172610.f51380) {
            c172610.f51380 = 0;
            c172610.f51381 = 0;
        } else {
            c172610.m39074(i2);
        }
        if (c17266.m39075()) {
            c19279 = C15925.f46050;
        } else if (c17266.f51380 < i) {
            c19279 = c17266.m39077(1);
        } else {
            int i4 = i;
            while (i4 > 0 && c17266.f51382[(c17266.f51381 + c17266.f51380) - i4] == 0) {
                i4--;
            }
            int i5 = i4 > 0 ? 1 : 0;
            int[] iArr = c17266.f51382;
            int i6 = c17266.f51381 + c17266.f51380;
            c19279 = new C19279(Arrays.copyOfRange(iArr, i6 - i4, i6), i5);
        }
        int i7 = c17266.f51380;
        int i8 = this.f51380 - i;
        if (i8 >= i7) {
            if (i8 <= i7) {
                int[] iArr2 = c17266.f51382;
                int i9 = this.f51381;
                int i10 = c17266.f51381;
                while (true) {
                    if (i9 < this.f51381 + i8) {
                        int i11 = this.f51382[i9] - Integer.MIN_VALUE;
                        int i12 = iArr2[i10] - Integer.MIN_VALUE;
                        if (i11 < i12) {
                            c17269 = c17269.m39060(c172610, c17267);
                            c17267.m39078();
                            c17268 = new C17266(c17267.m39077(!c17267.m39075() ? 1 : 0).m43954(c19279));
                        } else if (i11 <= i12) {
                            i9++;
                            i10++;
                        }
                    }
                }
            }
            if (i > c17267.f51382.length) {
                c17267.f51382 = new int[i];
            }
            Arrays.fill(c17267.f51382, -1);
            c17267.f51381 = 0;
            c17267.f51380 = i;
            c17269.m39065(c172610);
            c172610.m39063(i2);
            c17269.m39076(c172610);
            c17268 = new C17266(c19279);
            c17268.m39063(i2);
            c17268.m39076(new C17266(c19279));
        } else {
            c17269 = c17269.m39060(c172610, c17267);
            c17267.m39078();
            c17268 = new C17266(c17267.m39077(!c17267.m39075() ? 1 : 0).m43954(c19279));
        }
        c17269.m39063(i2);
        C17266 c172611 = new C17266(this);
        int i13 = c172611.f51381 + c172611.f51380;
        if (i13 >= i) {
            c172611.f51381 = i13 - i;
            c172611.f51380 = i;
        }
        c172611.m39078();
        c17269.m39065(c172611);
        while (c17269.m39067(c17268) < 0) {
            c17269.m39065(c17266);
            c17267.m39076(f51379);
        }
        c17269.m39076(c17268);
        return c17269;
    }

    /* JADX INFO: renamed from: ֫ */
    private C17266 m39051(int i, int i2, int i3) {
        int i4 = i * i3;
        int i5 = this.f51380;
        if (i4 >= i5) {
            return new C17266();
        }
        int i6 = i == i2 + (-1) ? i5 : (i + 1) * i3;
        if (i6 > i5) {
            return new C17266();
        }
        int[] iArr = this.f51382;
        int i7 = this.f51381;
        return new C17266(Arrays.copyOfRange(iArr, (i7 + i5) - i6, (i7 + i5) - i4));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39053(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        int i5 = 32 - i4;
        int i6 = iArr[i];
        int i7 = 0;
        while (i7 < i2 - 1) {
            i++;
            int i8 = iArr[i];
            iArr2[i3 + i7] = (i6 << i4) | (i8 >>> i5);
            i7++;
            i6 = i8;
        }
        iArr2[(i3 + i2) - 1] = i6 << i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m39049(int i, long j) {
        long j2 = ((long) i) & 4294967295L;
        if (j2 == 1) {
            return ((long) ((int) j)) & 4294967295L;
        }
        long j3 = (j >>> 1) / (j2 >>> 1);
        long j4 = j - (j3 * j2);
        while (j4 < 0) {
            j4 += j2;
            j3--;
        }
        while (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        return (j4 << 32) | (j3 & 4294967295L);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17266 m39068(int i) {
        if (m39066()) {
            throw new RuntimeException();
        }
        if (i <= 64) {
            int[] iArr = this.f51382;
            int i2 = this.f51381;
            int i3 = this.f51380;
            int i4 = iArr[(i2 + i3) - 1];
            int iM51252 = C22934.m51252(i4, i4, 2, i4);
            int iM51253 = C22934.m51252(i4, iM51252, 2, iM51252);
            int iM51254 = C22934.m51252(i4, iM51253, 2, iM51253);
            int iM51255 = C22934.m51252(i4, iM51254, 2, iM51254);
            if (i < 33) {
                if (i != 32) {
                    iM51255 &= (1 << i) - 1;
                }
                return new C17266(iM51255);
            }
            int i5 = i2 + i3;
            long j = ((long) iArr[i5 - 1]) & 4294967295L;
            if (i3 > 1) {
                j |= ((long) iArr[i5 - 2]) << 32;
            }
            long j2 = ((long) iM51255) & 4294967295L;
            long j3 = (2 - (j * j2)) * j2;
            if (i != 64) {
                j3 &= (1 << i) - 1;
            }
            C17266 c17266 = new C17266(new int[]{(int) (j3 >>> 32), (int) j3});
            c17266.f51380 = 2;
            c17266.m39078();
            return c17266;
        }
        C17266 c17267 = new C17266(1);
        c17267.m39063(i);
        C17266 c17268 = new C17266(c17267);
        C17266 c17269 = new C17266(this);
        C17266 c172610 = new C17266();
        C17266 c17266M39062 = c17267.m39062(c17269, c172610);
        C17266 c172611 = new C17266(c172610);
        C17266 c172612 = new C17266(1);
        C17266 c172613 = new C17266();
        while (!c17266M39062.m39071()) {
            c17269 = c17269.m39062(c17266M39062, c172610);
            if (c17269.f51380 == 0) {
                throw new RuntimeException();
            }
            if (c172610.f51380 == 1) {
                c172611.m39070(c172610.f51382[c172610.f51381], c172613);
            } else {
                c172610.m39079(c172611, c172613);
            }
            c172612.m39065(c172613);
            if (c17269.m39071()) {
                return c172612;
            }
            c17266M39062 = c17266M39062.m39062(c17269, c172613);
            if (c17266M39062.f51380 == 0) {
                throw new RuntimeException();
            }
            if (c172613.f51380 == 1) {
                c172612.m39070(c172613.f51382[c172613.f51381], c172610);
            } else {
                c172613.m39079(c172612, c172610);
            }
            c172611.m39065(c172610);
        }
        c17268.m39076(c172611);
        return c17268;
    }

    /* JADX INFO: renamed from: ܿ */
    private C17266 m39059(C17266 c17266) {
        int iM39058;
        C17266 c17267 = new C17266(c17266);
        C17266 c17268 = new C17266(this);
        C17266 c17269 = new C17266(c17267);
        C5868 c5868 = new C5868(1);
        c5868.f14432 = 1;
        C5868 c5869 = new C5868();
        c5869.f14432 = 1;
        if (c17268.m39066()) {
            iM39058 = c17268.m39058();
            c17268.m39074(iM39058);
            c5869.m39063(iM39058);
        } else {
            iM39058 = 0;
        }
        while (!c17268.m39071()) {
            if (c17268.m39075()) {
                throw new RuntimeException();
            }
            if (c17268.m39067(c17269) < 0) {
                C17266 c172610 = c17269;
                c17269 = c17268;
                c17268 = c172610;
                C5868 c58610 = c5869;
                c5869 = c5868;
                c5868 = c58610;
            }
            if (((c17268.f51382[(c17268.f51381 + c17268.f51380) - 1] ^ c17269.f51382[(c17269.f51381 + c17269.f51380) - 1]) & 3) == 0) {
                c17268.m39076(c17269);
                int i = c5868.f14432;
                if (i == c5869.f14432) {
                    c5868.f14432 = i * c5868.m39076(c5869);
                } else {
                    c5868.m39065(c5869);
                }
            } else {
                c17268.m39065(c17269);
                int i2 = c5868.f14432;
                if (i2 == c5869.f14432) {
                    c5868.m39065(c5869);
                } else {
                    c5868.f14432 = i2 * c5868.m39076(c5869);
                }
            }
            int iM39059 = c17268.m39058();
            c17268.m39074(iM39059);
            c5869.m39063(iM39059);
            iM39058 += iM39059;
        }
        if (c5868.m39067(c17267) >= 0) {
            C17266 c17266M39062 = c5868.m39062(c17267, new C17266());
            int i3 = c17266M39062.f51380;
            if (c5868.f51382.length < i3) {
                c5868.f51382 = new int[i3];
            }
            System.arraycopy(c17266M39062.f51382, c17266M39062.f51381, c5868.f51382, 0, i3);
            c5868.f51380 = i3;
            c5868.f51381 = 0;
        }
        int i4 = c5868.f14432;
        if (i4 < 0) {
            if (i4 == 1) {
                c5868.m39065(c17267);
            } else {
                c5868.f14432 = i4 * c5868.m39076(c17267);
            }
        }
        return m39052(c5868, c17267, iM39058);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17266 m39052(C17266 c17266, C17266 c17267, int i) {
        C17266 c17268 = new C17266();
        int i2 = c17267.f51382[(c17267.f51381 + c17267.f51380) - 1];
        int iM51252 = C22934.m51252(i2, i2, 2, i2);
        int iM51253 = C22934.m51252(i2, iM51252, 2, iM51252);
        int iM51254 = C22934.m51252(i2, iM51253, 2, iM51253);
        int i3 = -C22934.m51252(i2, iM51254, 2, iM51254);
        int i4 = i >> 5;
        for (int i5 = 0; i5 < i4; i5++) {
            c17267.m39070(c17266.f51382[(c17266.f51381 + c17266.f51380) - 1] * i3, c17268);
            c17266.m39065(c17268);
            c17266.f51380--;
        }
        int i6 = i & 31;
        if (i6 != 0) {
            c17267.m39070((i3 * c17266.f51382[(c17266.f51381 + c17266.f51380) - 1]) & ((1 << i6) - 1), c17268);
            c17266.m39065(c17268);
            c17266.m39074(i6);
        }
        return c17266.m39067(c17267) >= 0 ? c17266.m39062(c17267, new C17266()) : c17266;
    }
}
