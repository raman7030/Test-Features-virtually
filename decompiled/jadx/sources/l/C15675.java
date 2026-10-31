package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 098S */
/* JADX INFO: loaded from: classes.dex */
public class C15675 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C15675 f48241;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48242;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f48243;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f48244;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native long m36884(long j);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36889(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    static {
        ApplicationC12518.m30701(118);
        f48241 = new C15675(1);
    }

    public C15675() {
        this.f48243 = 0;
        this.f48244 = new int[1];
        this.f48242 = 0;
    }

    public C15675(int i) {
        this.f48243 = 0;
        this.f48244 = new int[]{i};
        this.f48242 = 1;
    }

    public C15675(int[] iArr) {
        this.f48243 = 0;
        this.f48244 = iArr;
        this.f48242 = iArr.length;
    }

    public C15675(C17793 c17793) {
        this.f48243 = 0;
        int[] iArr = c17793.f52396;
        int length = iArr.length;
        this.f48242 = length;
        this.f48244 = Arrays.copyOf(iArr, length);
    }

    public C15675(C15675 c15675) {
        this.f48243 = 0;
        int i = c15675.f48242;
        this.f48242 = i;
        int[] iArr = c15675.f48244;
        int i2 = c15675.f48243;
        this.f48244 = Arrays.copyOfRange(iArr, i2, i + i2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17793 m36911(int i) {
        int[] iArrCopyOfRange;
        int i2 = this.f48242;
        if (i2 != 0 && i != 0) {
            int i3 = this.f48243;
            if (i3 <= 0) {
                iArrCopyOfRange = this.f48244;
                if (iArrCopyOfRange.length != i2) {
                    iArrCopyOfRange = Arrays.copyOfRange(this.f48244, i3, i2 + i3);
                }
            } else {
                iArrCopyOfRange = Arrays.copyOfRange(this.f48244, i3, i2 + i3);
            }
            return new C17793(iArrCopyOfRange, i);
        }
        return C14264.f42957;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36901(C15675 c15675) {
        int i = c15675.f48242;
        int i2 = this.f48242;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int[] iArr = c15675.f48244;
        int i3 = this.f48243;
        int i4 = c15675.f48243;
        while (i3 < this.f48242 + this.f48243) {
            int i5 = this.f48244[i3] - Integer.MIN_VALUE;
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private final int m36892() {
        int i = this.f48242;
        if (i == 0) {
            return -1;
        }
        do {
            i--;
            if (i <= 0) {
                break;
            }
        } while (this.f48244[this.f48243 + i] == 0);
        int i2 = this.f48244[this.f48243 + i];
        if (i2 == 0) {
            return -1;
        }
        return Integer.numberOfTrailingZeros(i2) + (((this.f48242 - 1) - i) << 5);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36912() {
        int i = this.f48242;
        if (i == 0) {
            this.f48243 = 0;
            return;
        }
        int i2 = this.f48243;
        if (this.f48244[i2] != 0) {
            return;
        }
        int i3 = i + i2;
        do {
            i2++;
            if (i2 >= i3) {
                break;
            }
        } while (this.f48244[i2] == 0);
        int i4 = this.f48243;
        int i5 = i2 - i4;
        int i6 = this.f48242 - i5;
        this.f48242 = i6;
        this.f48243 = i6 != 0 ? i4 + i5 : 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36904(int i, C15675 c15675) {
        if (i == 1) {
            int i2 = this.f48242;
            if (c15675.f48244.length < i2) {
                c15675.f48244 = new int[i2];
            }
            System.arraycopy(this.f48244, this.f48243, c15675.f48244, 0, i2);
            c15675.f48242 = i2;
            c15675.f48243 = 0;
            return;
        }
        if (i == 0) {
            c15675.f48242 = 0;
            c15675.f48243 = 0;
            int length = c15675.f48244.length;
            for (int i3 = 0; i3 < length; i3++) {
                c15675.f48244[i3] = 0;
            }
            return;
        }
        long j = ((long) i) & 4294967295L;
        int[] iArr = c15675.f48244;
        int length2 = iArr.length;
        int i4 = this.f48242;
        int i5 = i4 + 1;
        if (length2 < i5) {
            iArr = new int[i5];
        }
        long j2 = 0;
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            long j3 = ((((long) this.f48244[this.f48243 + i6]) & 4294967295L) * j) + j2;
            iArr[i6 + 1] = (int) j3;
            j2 = j3 >>> 32;
        }
        if (j2 == 0) {
            c15675.f48243 = 1;
            c15675.f48242 = this.f48242;
        } else {
            c15675.f48243 = 0;
            c15675.f48242 = this.f48242 + 1;
            iArr[0] = (int) j2;
        }
        c15675.f48244 = iArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m36905() {
        return this.f48242 == 1 && this.f48244[this.f48243] == 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m36909() {
        return this.f48242 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36900() {
        int i = this.f48242;
        return i == 0 || (this.f48244[(this.f48243 + i) - 1] & 1) == 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15675 m36906(C15675 c15675) {
        if (!c15675.m36909() && (c15675.f48244[(c15675.f48243 + c15675.f48242) - 1] & 1) == 1) {
            return m36893(c15675);
        }
        if (m36900()) {
            throw new RuntimeException();
        }
        int iM36892 = c15675.m36892();
        C15675 c15676 = new C15675(c15675);
        c15676.m36908(iM36892);
        if (c15676.m36905()) {
            return m36902(iM36892);
        }
        C15675 c15675M36893 = m36893(c15676);
        C15675 c15675M36902 = m36902(iM36892);
        C15675 c15675M36886 = m36886(new C15675(1), new C15675(c15676), iM36892);
        C15675 c15675M36903 = c15676.m36902(iM36892);
        C15675 c15677 = new C15675();
        C15675 c15678 = new C15675();
        C15675 c15679 = new C15675();
        c15675M36893.m36897(iM36892);
        c15675M36893.m36913(c15675M36886, c15679);
        c15675M36902.m36913(c15676, c15677);
        c15677.m36913(c15675M36903, c15678);
        c15679.m36899(c15678);
        return c15679.m36896(c15675, c15677);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36908(int i) {
        int i2 = this.f48242;
        if (i2 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        this.f48242 = i2 - i3;
        if (i4 == 0) {
            return;
        }
        if (i4 >= 32 - Integer.numberOfLeadingZeros(this.f48244[this.f48243])) {
            m36895(32 - i4);
            this.f48242--;
        } else {
            m36891(i4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36897(int i) {
        int i2;
        if (this.f48242 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        int iNumberOfLeadingZeros = 32 - (32 - Integer.numberOfLeadingZeros(this.f48244[this.f48243]));
        if (i <= iNumberOfLeadingZeros) {
            m36895(i4);
            return;
        }
        int i5 = this.f48242 + i3;
        int i6 = i5 + 1;
        if (i4 > iNumberOfLeadingZeros) {
            i5 = i6;
        }
        int[] iArr = this.f48244;
        if (iArr.length < i5) {
            int[] iArr2 = new int[i5];
            for (int i7 = 0; i7 < this.f48242; i7++) {
                iArr2[i7] = this.f48244[this.f48243 + i7];
            }
            this.f48244 = iArr2;
            this.f48242 = i5;
            this.f48243 = 0;
        } else if (iArr.length - this.f48243 >= i5) {
            int i8 = 0;
            while (true) {
                int i9 = this.f48242;
                if (i8 >= i5 - i9) {
                    break;
                }
                this.f48244[this.f48243 + i9 + i8] = 0;
                i8++;
            }
        } else {
            int i10 = 0;
            while (true) {
                i2 = this.f48242;
                if (i10 >= i2) {
                    break;
                }
                int[] iArr3 = this.f48244;
                iArr3[i10] = iArr3[this.f48243 + i10];
                i10++;
            }
            while (i2 < i5) {
                this.f48244[i2] = 0;
                i2++;
            }
            this.f48243 = 0;
        }
        this.f48242 = i5;
        if (i4 == 0) {
            return;
        }
        if (i4 <= iNumberOfLeadingZeros) {
            m36895(i4);
        } else {
            m36891(32 - i4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36888(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i2 = length + i;
            long j2 = (((long) iArr[length]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36882(int i, int i2, int[] iArr, int[] iArr2, int i3) {
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private final void m36891(int i) {
        int[] iArr = this.f48244;
        int i2 = 32 - i;
        int i3 = (this.f48243 + this.f48242) - 1;
        int i4 = iArr[i3];
        while (true) {
            int i5 = this.f48243;
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private final void m36895(int i) {
        int[] iArr = this.f48244;
        int i2 = 32 - i;
        int i3 = this.f48243;
        int i4 = iArr[i3];
        int i5 = (this.f48242 + i3) - 1;
        while (i3 < i5) {
            int i6 = i3 + 1;
            int i7 = iArr[i6];
            iArr[i3] = (i4 << i) | (i7 >>> i2);
            i3 = i6;
            i4 = i7;
        }
        int i8 = (this.f48243 + this.f48242) - 1;
        iArr[i8] = iArr[i8] << i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36899(C15675 c15675) {
        int i = this.f48242;
        int i2 = c15675.f48242;
        int i3 = i > i2 ? i : i2;
        int[] iArr = this.f48244;
        if (iArr.length < i3) {
            iArr = new int[i3];
        }
        int length = iArr.length - 1;
        long j = 0;
        while (i > 0 && i2 > 0) {
            int i4 = i - 1;
            int i5 = i2 - 1;
            long j2 = (((long) this.f48244[this.f48243 + i4]) & 4294967295L) + (((long) c15675.f48244[c15675.f48243 + i5]) & 4294967295L) + j;
            iArr[length] = (int) j2;
            j = j2 >>> 32;
            length--;
            i = i4;
            i2 = i5;
        }
        while (i > 0) {
            i--;
            if (j == 0 && iArr == this.f48244 && length == this.f48243 + i) {
                return;
            }
            long j3 = (((long) this.f48244[this.f48243 + i]) & 4294967295L) + j;
            iArr[length] = (int) j3;
            length--;
            j = j3 >>> 32;
        }
        while (i2 > 0) {
            i2--;
            long j4 = (((long) c15675.f48244[c15675.f48243 + i2]) & 4294967295L) + j;
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
        this.f48244 = iArr;
        this.f48242 = i3;
        this.f48243 = iArr.length - i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36898(int i, C15675 c15675) {
        if (c15675.m36909()) {
            return;
        }
        int i2 = this.f48242;
        int i3 = c15675.f48242 + i;
        int i4 = i2 > i3 ? i2 : i3;
        int[] iArr = this.f48244;
        if (iArr.length < i4) {
            iArr = new int[i4];
        } else {
            Arrays.fill(iArr, this.f48243 + i2, iArr.length, 0);
        }
        int length = iArr.length;
        System.arraycopy(this.f48244, this.f48243, iArr, length - i2, i2);
        int i5 = i3 - i2;
        int i6 = (length - 1) - i2;
        int iMin = Math.min(i5, c15675.f48244.length - c15675.f48243);
        int i7 = i6 + 1;
        int i8 = i7 - i5;
        System.arraycopy(c15675.f48244, c15675.f48243, iArr, i8, iMin);
        for (int i9 = i8 + iMin; i9 < i7; i9++) {
            iArr[i9] = 0;
        }
        this.f48244 = iArr;
        this.f48242 = i4;
        this.f48243 = iArr.length - i4;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m36910(C15675 c15675) {
        C15675 c15676;
        C15675 c15677;
        int[] iArr = this.f48244;
        int iM36901 = m36901(c15675);
        if (iM36901 == 0) {
            this.f48242 = 0;
            this.f48243 = 0;
            return 0;
        }
        if (iM36901 < 0) {
            c15677 = c15675;
            c15676 = this;
        } else {
            c15676 = c15675;
            c15677 = this;
        }
        int i = c15677.f48242;
        if (iArr.length < i) {
            iArr = new int[i];
        }
        int i2 = c15676.f48242;
        int length = iArr.length - 1;
        long j = 0;
        int i3 = i;
        while (i2 > 0) {
            i3--;
            i2--;
            j = ((((long) c15677.f48244[c15677.f48243 + i3]) & 4294967295L) - (((long) c15676.f48244[c15676.f48243 + i2]) & 4294967295L)) - ((long) ((int) (-(j >> 32))));
            iArr[length] = (int) j;
            length--;
        }
        while (i3 > 0) {
            i3--;
            j = (((long) c15677.f48244[c15677.f48243 + i3]) & 4294967295L) - ((long) ((int) (-(j >> 32))));
            iArr[length] = (int) j;
            length--;
        }
        this.f48244 = iArr;
        this.f48242 = i;
        this.f48243 = iArr.length - i;
        m36912();
        return iM36901;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36913(C15675 c15675, C15675 c15676) {
        C15675 c15677 = this;
        C15675 c15678 = c15675;
        int i = c15677.f48242;
        int i2 = c15678.f48242;
        int i3 = i + i2;
        if (c15676.f48244.length < i3) {
            c15676.f48244 = new int[i3];
        }
        c15676.f48243 = 0;
        c15676.f48242 = i3;
        int i4 = i2 - 1;
        int i5 = i3 - 1;
        long j = 0;
        int i6 = i4;
        while (i6 >= 0) {
            long j2 = ((((long) c15678.f48244[c15678.f48243 + i6]) & 4294967295L) * (((long) c15677.f48244[(i - 1) + c15677.f48243]) & 4294967295L)) + j;
            c15676.f48244[i5] = (int) j2;
            j = j2 >>> 32;
            i6--;
            i5--;
        }
        c15676.f48244[i - 1] = (int) j;
        int i7 = i - 2;
        while (i7 >= 0) {
            int i8 = i2 + i7;
            long j3 = 0;
            int i9 = i4;
            while (i9 >= 0) {
                long j4 = (((long) c15678.f48244[c15678.f48243 + i9]) & 4294967295L) * (((long) c15677.f48244[c15677.f48243 + i7]) & 4294967295L);
                int[] iArr = c15676.f48244;
                long j5 = j4 + (((long) iArr[i8]) & 4294967295L) + j3;
                iArr[i8] = (int) j5;
                j3 = j5 >>> 32;
                i9--;
                i8--;
                c15677 = this;
                c15678 = c15675;
                i2 = i2;
            }
            c15676.f48244[i7] = (int) j3;
            i7--;
            c15677 = this;
            c15678 = c15675;
            i2 = i2;
        }
        c15676.m36912();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15675 m36896(C15675 c15675, C15675 c15676) {
        int i = c15675.f48242;
        if (i < 80 || this.f48242 - i < 40) {
            return m36907(c15675, c15676);
        }
        return m36903(c15675, c15676);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15675 m36907(C15675 c15675, C15675 c15676) {
        int i;
        int[] iArrCopyOfRange;
        C15675 c15677;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        C15675 c15678;
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
        if (c15675.f48242 == 0) {
            throw new RuntimeException();
        }
        if (this.f48242 == 0) {
            c15676.f48243 = 0;
            c15676.f48242 = 0;
            return new C15675();
        }
        int iM36901 = m36901(c15675);
        if (iM36901 < 0) {
            c15676.f48243 = 0;
            c15676.f48242 = 0;
            return new C15675(this);
        }
        if (iM36901 != 0) {
            c15676.f48242 = 0;
            c15676.f48243 = 0;
            int length = c15676.f48244.length;
            for (int i18 = 0; i18 < length; i18++) {
                c15676.f48244[i18] = 0;
            }
            char c = ' ';
            if (c15675.f48242 == 1) {
                int i19 = c15675.f48244[c15675.f48243];
                long j4 = ((long) i19) & 4294967295L;
                int i20 = this.f48242;
                if (i20 == 1) {
                    long j5 = 4294967295L & ((long) this.f48244[this.f48243]);
                    int i21 = (int) (j5 / j4);
                    i16 = (int) (j5 - (((long) i21) * j4));
                    c15676.f48244[0] = i21;
                    c15676.f48242 = i21 == 0 ? 0 : 1;
                    c15676.f48243 = 0;
                } else {
                    if (c15676.f48244.length < i20) {
                        c15676.f48244 = new int[i20];
                    }
                    c15676.f48243 = 0;
                    c15676.f48242 = i20;
                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i19);
                    int i22 = this.f48244[this.f48243];
                    long j6 = ((long) i22) & 4294967295L;
                    if (j6 < j4) {
                        j2 = 0;
                        c15676.f48244[0] = 0;
                    } else {
                        int i23 = (int) (j6 / j4);
                        c15676.f48244[0] = i23;
                        i22 = (int) (j6 - (((long) i23) * j4));
                        j6 = ((long) i22) & 4294967295L;
                        j2 = 0;
                    }
                    int i24 = this.f48242;
                    while (true) {
                        int i25 = i24 - 1;
                        if (i25 <= 0) {
                            break;
                        }
                        int i26 = iNumberOfLeadingZeros;
                        long j7 = (((long) this.f48244[(this.f48243 + this.f48242) - i25]) & 4294967295L) | (j6 << c);
                        if (j7 >= j2) {
                            i17 = (int) (j7 / j4);
                            j3 = j7 - (((long) i17) * j4);
                        } else {
                            long jM36883 = m36883(i19, j7);
                            i17 = (int) (jM36883 & 4294967295L);
                            j3 = jM36883 >>> 32;
                        }
                        int i27 = (int) j3;
                        c15676.f48244[this.f48242 - i25] = i17;
                        j6 = ((long) i27) & 4294967295L;
                        iNumberOfLeadingZeros = i26;
                        i22 = i27;
                        i24 = i25;
                        c = ' ';
                    }
                    int i28 = iNumberOfLeadingZeros;
                    c15676.m36912();
                    i16 = i28 > 0 ? i22 % i19 : i22;
                }
                if (i16 == 0) {
                    return new C15675();
                }
                return new C15675(i16);
            }
            if (this.f48242 >= 6 && (iMin = Math.min(m36892(), c15675.m36892())) >= 96) {
                C15675 c15679 = new C15675(this);
                C15675 c156710 = new C15675(c15675);
                c15679.m36908(iMin);
                c156710.m36908(iMin);
                C15675 c15675M36907 = c15679.m36907(c156710, c15676);
                c15675M36907.m36897(iMin);
                return c15675M36907;
            }
            int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(c15675.f48244[c15675.f48243]);
            int i29 = c15675.f48242;
            if (iNumberOfLeadingZeros2 > 0) {
                int[] iArr3 = new int[i29];
                i = i29;
                m36887(c15675.f48243, i29, c15675.f48244, 0, iArr3, iNumberOfLeadingZeros2);
                if (Integer.numberOfLeadingZeros(this.f48244[this.f48243]) >= iNumberOfLeadingZeros2) {
                    int[] iArr4 = new int[this.f48242 + 1];
                    c15677 = new C15675(iArr4);
                    c15677.f48242 = this.f48242;
                    c15677.f48243 = 1;
                    m36887(this.f48243, this.f48242, this.f48244, 1, iArr4, iNumberOfLeadingZeros2);
                    iArrCopyOfRange = iArr3;
                } else {
                    int[] iArr5 = new int[this.f48242 + 2];
                    C15675 c156711 = new C15675(iArr5);
                    c156711.f48242 = this.f48242 + 1;
                    c156711.f48243 = 1;
                    int i30 = this.f48243;
                    int i31 = 32 - iNumberOfLeadingZeros2;
                    int i32 = 1;
                    int i33 = 0;
                    while (true) {
                        i15 = this.f48242 + 1;
                        if (i32 >= i15) {
                            break;
                        }
                        int i34 = this.f48244[i30];
                        iArr5[i32] = (i33 << iNumberOfLeadingZeros2) | (i34 >>> i31);
                        i32++;
                        i30++;
                        i33 = i34;
                    }
                    iArr5[i15] = i33 << iNumberOfLeadingZeros2;
                    iArrCopyOfRange = iArr3;
                    c15677 = c156711;
                }
            } else {
                i = i29;
                int[] iArr6 = c15675.f48244;
                int i35 = c15675.f48243;
                iArrCopyOfRange = Arrays.copyOfRange(iArr6, i35, i35 + i);
                int[] iArr7 = new int[this.f48242 + 1];
                c15677 = new C15675(iArr7);
                System.arraycopy(this.f48244, this.f48243, iArr7, 1, this.f48242);
                c15677.f48242 = this.f48242;
                c15677.f48243 = 1;
            }
            int i36 = c15677.f48242;
            int i37 = i36 - i;
            int i38 = i37 + 1;
            if (c15676.f48244.length < i38) {
                c15676.f48244 = new int[i38];
                c15676.f48243 = 0;
            }
            c15676.f48242 = i38;
            int[] iArr8 = c15676.f48244;
            int i39 = c15677.f48242;
            if (i39 == i36) {
                c15677.f48243 = 0;
                c15677.f48244[0] = 0;
                c15677.f48242 = i39 + 1;
            }
            int i40 = iArrCopyOfRange[0];
            int i41 = iNumberOfLeadingZeros2;
            long j8 = ((long) i40) & 4294967295L;
            int i42 = iArrCopyOfRange[1];
            int i43 = 0;
            while (i43 < i37) {
                int[] iArr9 = c15677.f48244;
                int i44 = c15677.f48243;
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
                        long jM36884 = m36883(i40, j9);
                        i6 = (int) (jM36884 & 4294967295L);
                        j = jM36884 >>> 32;
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
                        long j10 = ((long) c15677.f48244[i43 + 2 + c15677.f48243]) & 4294967295L;
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
                        if (m36889(j13, (j11 << 32) | j10)) {
                            long j14 = ((long) ((int) (j11 + j8))) & 4294967295L;
                            i8 = (j14 < j8 || !m36889(j13 - j12, (j14 << 32) | j10)) ? i8 - 1 : i8 - 2;
                        }
                    }
                    int[] iArr11 = c15677.f48244;
                    int i51 = c15677.f48243 + i43;
                    iArr11[i51] = 0;
                    i14 = i12;
                    if (m36882(i8, i14, iArr11, iArrCopyOfRange, i51) - Integer.MIN_VALUE > i9) {
                        m36888(i47 + c15677.f48243, iArrCopyOfRange, c15677.f48244);
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
            int[] iArr13 = c15677.f48244;
            int i58 = c15677.f48243;
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
                    long jM36885 = m36883(i52, j15);
                    i2 = (int) (jM36885 & 4294967295L);
                    i3 = (int) (jM36885 >>> 32);
                }
                i4 = i2;
                z = false;
            }
            if (i4 != 0) {
                if (z) {
                    i5 = i60;
                    c15678 = c15677;
                    iArr = iArrCopyOfRange;
                } else {
                    long j16 = ((long) c15677.f48244[i55 + 2 + c15677.f48243]) & 4294967295L;
                    long j17 = ((long) i3) & 4294967295L;
                    i5 = i60;
                    c15678 = c15677;
                    long j18 = ((long) i53) & 4294967295L;
                    iArr = iArrCopyOfRange;
                    long j19 = (((long) i4) & 4294967295L) * j18;
                    if (m36889(j19, (j17 << 32) | j16)) {
                        long j20 = ((long) ((int) (j17 + j8))) & 4294967295L;
                        i4 = (j20 < j8 || !m36889(j19 - j18, (j20 << 32) | j16)) ? i4 - 1 : i4 - 2;
                    }
                }
                c15677 = c15678;
                int[] iArr14 = c15677.f48244;
                int i62 = i55 + c15677.f48243;
                iArr14[i62] = 0;
                int[] iArr15 = iArr;
                if (m36882(i4, i54, iArr14, iArr15, i62) - Integer.MIN_VALUE > i5) {
                    m36888(i56 + c15677.f48243, iArr15, c15677.f48244);
                    i4--;
                }
                iArr12[i55] = i4;
            }
            if (i57 > 0) {
                c15677.m36908(i57);
            }
            c15677.m36912();
            c15676.m36912();
            return c15677;
        }
        int[] iArr16 = c15676.f48244;
        c15676.f48242 = 1;
        iArr16[0] = 1;
        c15676.f48243 = 0;
        return new C15675();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15675 m36903(C15675 c15675, C15675 c15676) {
        long jNumberOfLeadingZeros;
        char c;
        C15675 c15677;
        int i;
        C15675 c15678;
        long j;
        int i2 = this.f48242;
        int i3 = c15675.f48242;
        c15676.f48242 = 0;
        c15676.f48243 = 0;
        if (i2 < i3) {
            return this;
        }
        int i4 = 1;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i3 / 80));
        int i5 = (((i3 + iNumberOfLeadingZeros) - 1) / iNumberOfLeadingZeros) * iNumberOfLeadingZeros;
        long j2 = ((long) i5) * 32;
        int i6 = c15675.f48242;
        if (i6 == 0) {
            c = ' ';
            jNumberOfLeadingZeros = 0;
        } else {
            jNumberOfLeadingZeros = (((long) i6) * 32) - ((long) Integer.numberOfLeadingZeros(c15675.f48244[c15675.f48243]));
            c = ' ';
        }
        int iMax = (int) Math.max(0L, j2 - jNumberOfLeadingZeros);
        C15675 c15679 = new C15675(c15675);
        if (iMax > 0) {
            c15679.m36897(iMax);
        }
        C15675 c156710 = new C15675(this);
        if (iMax > 0) {
            c156710.m36897(iMax);
        }
        int i7 = c156710.f48242;
        int iNumberOfLeadingZeros2 = (int) (((i7 == 0 ? 0L : (((long) i7) * 32) - ((long) Integer.numberOfLeadingZeros(c156710.f48244[c156710.f48243]))) + j2) / j2);
        if (iNumberOfLeadingZeros2 < 2) {
            iNumberOfLeadingZeros2 = 2;
        }
        C15675 c15675M36885 = c156710.m36885(iNumberOfLeadingZeros2 - 1, iNumberOfLeadingZeros2, i5);
        int i8 = iNumberOfLeadingZeros2 - 2;
        C15675 c15675M36886 = c156710.m36885(i8, iNumberOfLeadingZeros2, i5);
        c15675M36886.m36898(i5, c15675M36885);
        C15675 c156711 = new C15675();
        while (i8 > 0) {
            C15675 c15675M36894 = c15675M36886.m36894(c15679, c156711);
            C15675 c15675M36887 = c156710.m36885(i8 - 1, iNumberOfLeadingZeros2, i5);
            c15675M36887.m36898(i5, c15675M36894);
            int i9 = i8 * i5;
            if (c156711.m36909()) {
                c15677 = c156710;
                i = i5;
                c15678 = c15675M36887;
            } else {
                int i10 = c15676.f48242;
                int i11 = c156711.f48242 + i9;
                int i12 = i10 > i11 ? i10 : i11;
                int[] iArr = c15676.f48244;
                if (iArr.length < i12) {
                    iArr = new int[i12];
                }
                int length = iArr.length - i4;
                long j3 = 0;
                while (i10 > 0 && i11 > 0) {
                    int i13 = i10 - 1;
                    i11--;
                    int i14 = c156711.f48243 + i11;
                    C15675 c156712 = c156710;
                    int[] iArr2 = c156711.f48244;
                    int i15 = i5;
                    long j4 = (((long) c15676.f48244[c15676.f48243 + i13]) & 4294967295L) + (((long) (i14 < iArr2.length ? iArr2[i14] : 0)) & 4294967295L) + j3;
                    iArr[length] = (int) j4;
                    j3 = j4 >>> c;
                    length--;
                    i5 = i15;
                    c15675M36887 = c15675M36887;
                    i10 = i13;
                    c156710 = c156712;
                }
                c15677 = c156710;
                i = i5;
                c15678 = c15675M36887;
                while (true) {
                    if (i10 > 0) {
                        i10--;
                        if (j3 != 0 || iArr != c15676.f48244 || length != c15676.f48243 + i10) {
                            long j5 = (((long) c15676.f48244[c15676.f48243 + i10]) & 4294967295L) + j3;
                            iArr[length] = (int) j5;
                            j3 = j5 >>> c;
                            length--;
                        }
                    } else {
                        while (i11 > 0) {
                            i11--;
                            int i16 = c156711.f48243 + i11;
                            int[] iArr3 = c156711.f48244;
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
                        c15676.f48244 = iArr;
                        c15676.f48242 = i12;
                        c15676.f48243 = iArr.length - i12;
                        break;
                    }
                }
                i8--;
                c156710 = c15677;
                i5 = i;
                c15675M36886 = c15678;
                i4 = 1;
            }
            j = 0;
            i8--;
            c156710 = c15677;
            i5 = i;
            c15675M36886 = c15678;
            i4 = 1;
        }
        C15675 c15675M36895 = c15675M36886.m36894(c15679, c156711);
        c15676.m36899(c156711);
        c15675M36895.m36908(iMax);
        return c15675M36895;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C15675 m36894(C15675 c15675, C15675 c15676) {
        int i = c15675.f48242;
        if (i % 2 != 0 || i < 80) {
            return m36907(c15675, c15676);
        }
        C15675 c15677 = new C15675(this);
        int i2 = i / 2;
        int i3 = i2 * 32;
        if (i3 / 32 >= c15677.f48242) {
            c15677.f48242 = 0;
            c15677.f48243 = 0;
        } else {
            c15677.m36908(i3);
        }
        int i4 = this.f48242;
        if (i4 >= i2) {
            this.f48243 = (i4 - i2) + this.f48243;
            this.f48242 = i2;
        }
        C15675 c15678 = new C15675();
        m36898(i2, c15677.m36890(c15675, c15678));
        C15675 c15675M36890 = m36890(c15675, c15676);
        c15676.m36898(i2, c15678);
        return c15675M36890;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C15675 m36890(C15675 c15675, C15675 c15676) {
        C17793 c17793;
        C15675 c15677;
        int i = c15675.f48242 / 2;
        C15675 c15678 = new C15675(this);
        int i2 = i * 32;
        int i3 = i2 / 32;
        if (i3 >= c15678.f48242) {
            c15678.f48242 = 0;
            c15678.f48243 = 0;
        } else {
            c15678.m36908(i2);
        }
        C15675 c15679 = new C15675(c15675);
        if (i3 >= c15679.f48242) {
            c15679.f48242 = 0;
            c15679.f48243 = 0;
        } else {
            c15679.m36908(i2);
        }
        if (c15675.m36909()) {
            c17793 = C14264.f42957;
        } else if (c15675.f48242 < i) {
            c17793 = c15675.m36911(1);
        } else {
            int i4 = i;
            while (i4 > 0 && c15675.f48244[(c15675.f48243 + c15675.f48242) - i4] == 0) {
                i4--;
            }
            int i5 = i4 > 0 ? 1 : 0;
            int[] iArr = c15675.f48244;
            int i6 = c15675.f48243 + c15675.f48242;
            c17793 = new C17793(Arrays.copyOfRange(iArr, i6 - i4, i6), i5);
        }
        int i7 = c15675.f48242;
        int i8 = this.f48242 - i;
        if (i8 >= i7) {
            if (i8 <= i7) {
                int[] iArr2 = c15675.f48244;
                int i9 = this.f48243;
                int i10 = c15675.f48243;
                while (true) {
                    if (i9 < this.f48243 + i8) {
                        int i11 = this.f48244[i9] - Integer.MIN_VALUE;
                        int i12 = iArr2[i10] - Integer.MIN_VALUE;
                        if (i11 < i12) {
                            c15678 = c15678.m36894(c15679, c15676);
                            c15676.m36912();
                            c15677 = new C15675(c15676.m36911(!c15676.m36909() ? 1 : 0).m41708(c17793));
                        } else if (i11 <= i12) {
                            i9++;
                            i10++;
                        }
                    }
                }
            }
            if (i > c15676.f48244.length) {
                c15676.f48244 = new int[i];
            }
            Arrays.fill(c15676.f48244, -1);
            c15676.f48243 = 0;
            c15676.f48242 = i;
            c15678.m36899(c15679);
            c15679.m36897(i2);
            c15678.m36910(c15679);
            c15677 = new C15675(c17793);
            c15677.m36897(i2);
            c15677.m36910(new C15675(c17793));
        } else {
            c15678 = c15678.m36894(c15679, c15676);
            c15676.m36912();
            c15677 = new C15675(c15676.m36911(!c15676.m36909() ? 1 : 0).m41708(c17793));
        }
        c15678.m36897(i2);
        C15675 c156710 = new C15675(this);
        int i13 = c156710.f48243 + c156710.f48242;
        if (i13 >= i) {
            c156710.f48243 = i13 - i;
            c156710.f48242 = i;
        }
        c156710.m36912();
        c15678.m36899(c156710);
        while (c15678.m36901(c15677) < 0) {
            c15678.m36899(c15675);
            c15676.m36910(f48241);
        }
        c15678.m36910(c15677);
        return c15678;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15675 m36885(int i, int i2, int i3) {
        int i4 = i * i3;
        int i5 = this.f48242;
        if (i4 >= i5) {
            return new C15675();
        }
        int i6 = i == i2 + (-1) ? i5 : (i + 1) * i3;
        if (i6 > i5) {
            return new C15675();
        }
        int[] iArr = this.f48244;
        int i7 = this.f48243;
        return new C15675(Arrays.copyOfRange(iArr, (i7 + i5) - i6, (i7 + i5) - i4));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36887(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m36883(int i, long j) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15675 m36902(int i) {
        if (m36900()) {
            throw new RuntimeException();
        }
        if (i <= 64) {
            int[] iArr = this.f48244;
            int i2 = this.f48243;
            int i3 = this.f48242;
            int i4 = iArr[(i2 + i3) - 1];
            int iM48904 = C21639.m48904(i4, i4, 2, i4);
            int iM48905 = C21639.m48904(i4, iM48904, 2, iM48904);
            int iM48906 = C21639.m48904(i4, iM48905, 2, iM48905);
            int iM48907 = C21639.m48904(i4, iM48906, 2, iM48906);
            if (i < 33) {
                if (i != 32) {
                    iM48907 &= (1 << i) - 1;
                }
                return new C15675(iM48907);
            }
            int i5 = i2 + i3;
            long j = ((long) iArr[i5 - 1]) & 4294967295L;
            if (i3 > 1) {
                j |= ((long) iArr[i5 - 2]) << 32;
            }
            long j2 = ((long) iM48907) & 4294967295L;
            long j3 = (2 - (j * j2)) * j2;
            if (i != 64) {
                j3 &= (1 << i) - 1;
            }
            C15675 c15675 = new C15675(new int[]{(int) (j3 >>> 32), (int) j3});
            c15675.f48242 = 2;
            c15675.m36912();
            return c15675;
        }
        C15675 c15676 = new C15675(1);
        c15676.m36897(i);
        C15675 c15677 = new C15675(c15676);
        C15675 c15678 = new C15675(this);
        C15675 c15679 = new C15675();
        C15675 c15675M36896 = c15676.m36896(c15678, c15679);
        C15675 c156710 = new C15675(c15679);
        C15675 c156711 = new C15675(1);
        C15675 c156712 = new C15675();
        while (!c15675M36896.m36905()) {
            c15678 = c15678.m36896(c15675M36896, c15679);
            if (c15678.f48242 == 0) {
                throw new RuntimeException();
            }
            if (c15679.f48242 == 1) {
                c156710.m36904(c15679.f48244[c15679.f48243], c156712);
            } else {
                c15679.m36913(c156710, c156712);
            }
            c156711.m36899(c156712);
            if (c15678.m36905()) {
                return c156711;
            }
            c15675M36896 = c15675M36896.m36896(c15678, c156712);
            if (c15675M36896.f48242 == 0) {
                throw new RuntimeException();
            }
            if (c156712.f48242 == 1) {
                c156711.m36904(c156712.f48244[c156712.f48243], c15679);
            } else {
                c156712.m36913(c156711, c15679);
            }
            c156710.m36899(c15679);
        }
        c15677.m36910(c156710);
        return c15677;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C15675 m36893(C15675 c15675) {
        int iM36892;
        C15675 c15676 = new C15675(c15675);
        C15675 c15677 = new C15675(this);
        C15675 c15678 = new C15675(c15676);
        C3682 c3682 = new C3682(1);
        c3682.f11628 = 1;
        C3682 c3683 = new C3682();
        c3683.f11628 = 1;
        if (c15677.m36900()) {
            iM36892 = c15677.m36892();
            c15677.m36908(iM36892);
            c3683.m36897(iM36892);
        } else {
            iM36892 = 0;
        }
        while (!c15677.m36905()) {
            if (c15677.m36909()) {
                throw new RuntimeException();
            }
            if (c15677.m36901(c15678) < 0) {
                C15675 c15679 = c15678;
                c15678 = c15677;
                c15677 = c15679;
                C3682 c3684 = c3683;
                c3683 = c3682;
                c3682 = c3684;
            }
            if (((c15677.f48244[(c15677.f48243 + c15677.f48242) - 1] ^ c15678.f48244[(c15678.f48243 + c15678.f48242) - 1]) & 3) == 0) {
                c15677.m36910(c15678);
                int i = c3682.f11628;
                if (i == c3683.f11628) {
                    c3682.f11628 = i * c3682.m36910(c3683);
                } else {
                    c3682.m36899(c3683);
                }
            } else {
                c15677.m36899(c15678);
                int i2 = c3682.f11628;
                if (i2 == c3683.f11628) {
                    c3682.m36899(c3683);
                } else {
                    c3682.f11628 = i2 * c3682.m36910(c3683);
                }
            }
            int iM36893 = c15677.m36892();
            c15677.m36908(iM36893);
            c3683.m36897(iM36893);
            iM36892 += iM36893;
        }
        if (c3682.m36901(c15676) >= 0) {
            C15675 c15675M36896 = c3682.m36896(c15676, new C15675());
            int i3 = c15675M36896.f48242;
            if (c3682.f48244.length < i3) {
                c3682.f48244 = new int[i3];
            }
            System.arraycopy(c15675M36896.f48244, c15675M36896.f48243, c3682.f48244, 0, i3);
            c3682.f48242 = i3;
            c3682.f48243 = 0;
        }
        int i4 = c3682.f11628;
        if (i4 < 0) {
            if (i4 == 1) {
                c3682.m36899(c15676);
            } else {
                c3682.f11628 = i4 * c3682.m36910(c15676);
            }
        }
        return m36886(c3682, c15676, iM36892);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15675 m36886(C15675 c15675, C15675 c15676, int i) {
        C15675 c15677 = new C15675();
        int i2 = c15676.f48244[(c15676.f48243 + c15676.f48242) - 1];
        int iM48904 = C21639.m48904(i2, i2, 2, i2);
        int iM48905 = C21639.m48904(i2, iM48904, 2, iM48904);
        int iM48906 = C21639.m48904(i2, iM48905, 2, iM48905);
        int i3 = -C21639.m48904(i2, iM48906, 2, iM48906);
        int i4 = i >> 5;
        for (int i5 = 0; i5 < i4; i5++) {
            c15676.m36904(c15675.f48244[(c15675.f48243 + c15675.f48242) - 1] * i3, c15677);
            c15675.m36899(c15677);
            c15675.f48242--;
        }
        int i6 = i & 31;
        if (i6 != 0) {
            c15676.m36904((i3 * c15675.f48244[(c15675.f48243 + c15675.f48242) - 1]) & ((1 << i6) - 1), c15677);
            c15675.m36899(c15677);
            c15675.m36908(i6);
        }
        return c15675.m36901(c15676) >= 0 ? c15675.m36896(c15676, new C15675()) : c15675;
    }
}
