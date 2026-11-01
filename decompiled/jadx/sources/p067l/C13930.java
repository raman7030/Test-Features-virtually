package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13930 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC22648 f39293;

    /* JADX INFO: renamed from: ۜ */
    public final int[] f39294;

    /* JADX INFO: renamed from: ۧ */
    public final C21307[] f39295;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f39296;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f39297;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f39298;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f39299;

    /* JADX INFO: renamed from: ᩷ */
    public final int[] f39300;

    /* JADX INFO: renamed from: ᩻ */
    public final int f39301;

    public C13930(C5213 c5213, EnumC22648 enumC22648) {
        this.f39301 = c5213.f12241;
        int[] iArrCopyOf = Arrays.copyOf(c5213.f12239, c5213.f12240);
        this.f39298 = iArrCopyOf;
        this.f39295 = (C21307[]) Arrays.copyOf(c5213.f12238, c5213.f12240);
        this.f39293 = enumC22648;
        int[] iArrCopyOf2 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length + 1);
        iArrCopyOf2[iArrCopyOf.length] = 0;
        Arrays.sort(iArrCopyOf2);
        int i = 0;
        for (int i2 : iArrCopyOf2) {
            if (i == 0 || iArrCopyOf2[i - 1] != i2) {
                iArrCopyOf2[i] = i2;
                i++;
            }
        }
        this.f39297 = Arrays.copyOf(iArrCopyOf2, i);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (C21307 c21307 : this.f39295) {
            i3 = c21307.m48215() != -1 ? i3 + 1 : i3;
            i4 = c21307.m48214() ? i4 + 1 : i4;
            if (c21307.m48212() != EnumC22648.COMPLETE) {
                i5++;
            }
        }
        long[] jArr = new long[i3];
        this.f39299 = new int[i4];
        this.f39294 = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            C21307[] c21307Arr = this.f39295;
            if (i6 >= c21307Arr.length) {
                break;
            }
            C21307 c21308 = c21307Arr[i6];
            if (c21308.m48215() != -1) {
                jArr[i7] = (((long) Math.min(this.f39298[i6], this.f39295[i6].m48215())) << 32) | (((long) i6) & 4294967295L);
                i7++;
            }
            if (c21308.m48214()) {
                this.f39299[i8] = i6;
                i8++;
            }
            if (c21308.m48212() != EnumC22648.COMPLETE) {
                this.f39294[i9] = i6;
                i9++;
            }
            i6++;
        }
        Arrays.sort(jArr);
        this.f39300 = new int[i7];
        this.f39296 = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.f39300[i10] = (int) jArr[i10];
        }
        m31679(0, i7);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m31679(int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = (i + i2) >>> 1;
        int i4 = this.f39300[i3];
        int iMax = Math.max(Math.max(Math.max(this.f39298[i4], this.f39295[i4].m48208()), m31679(i, i3)), m31679(i3 + 1, i2));
        this.f39296[i3] = iMax;
        return iMax;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m31683(C13930 c13930, int i) {
        return Math.min(c13930.f39298[i], c13930.f39295[i].m48215());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31680(C13930 c13930, int i) {
        return Math.max(c13930.f39298[i], c13930.f39295[i].m48208());
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31692() {
        return this.f39301;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31690() {
        return this.f39295.length;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m31695(int i) {
        return this.f39298[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21307 m31693(int i) {
        return this.f39295[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m31694(int i) {
        C12826.checkFromToIndex(i, i, this.f39301);
        int[] iArr = this.f39297;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return iArr[iBinarySearch];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31691(int i) {
        C12826.checkFromToIndex(i, i, this.f39301);
        int[] iArr = this.f39297;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        if (iBinarySearch < iArr.length) {
            return iArr[iBinarySearch];
        }
        return -1;
    }
}
