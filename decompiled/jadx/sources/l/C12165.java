package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12165 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC21338 f36282;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f36283;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19927[] f36284;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f36285;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f36286;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f36287;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f36288;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f36289;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f36290;

    public C12165(C2993 c2993, EnumC21338 enumC21338) {
        this.f36290 = c2993.f9442;
        int[] iArrCopyOf = Arrays.copyOf(c2993.f9440, c2993.f9441);
        this.f36287 = iArrCopyOf;
        this.f36284 = (C19927[]) Arrays.copyOf(c2993.f9439, c2993.f9441);
        this.f36282 = enumC21338;
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
        this.f36286 = Arrays.copyOf(iArrCopyOf2, i);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (C19927 c19927 : this.f36284) {
            i3 = c19927.m45902() != -1 ? i3 + 1 : i3;
            i4 = c19927.m45901() ? i4 + 1 : i4;
            if (c19927.m45899() != EnumC21338.COMPLETE) {
                i5++;
            }
        }
        long[] jArr = new long[i3];
        this.f36288 = new int[i4];
        this.f36283 = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            C19927[] c19927Arr = this.f36284;
            if (i6 >= c19927Arr.length) {
                break;
            }
            C19927 c19928 = c19927Arr[i6];
            if (c19928.m45902() != -1) {
                jArr[i7] = (((long) Math.min(this.f36287[i6], this.f36284[i6].m45902())) << 32) | (((long) i6) & 4294967295L);
                i7++;
            }
            if (c19928.m45901()) {
                this.f36288[i8] = i6;
                i8++;
            }
            if (c19928.m45899() != EnumC21338.COMPLETE) {
                this.f36283[i9] = i6;
                i9++;
            }
            i6++;
        }
        Arrays.sort(jArr);
        this.f36289 = new int[i7];
        this.f36285 = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.f36289[i10] = (int) jArr[i10];
        }
        m29617(0, i7);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m29617(int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = (i + i2) >>> 1;
        int i4 = this.f36289[i3];
        int iMax = Math.max(Math.max(Math.max(this.f36287[i4], this.f36284[i4].m45895()), m29617(i, i3)), m29617(i3 + 1, i2));
        this.f36285[i3] = iMax;
        return iMax;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29621(C12165 c12165, int i) {
        return Math.min(c12165.f36287[i], c12165.f36284[i].m45902());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29618(C12165 c12165, int i) {
        return Math.max(c12165.f36287[i], c12165.f36284[i].m45895());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29630() {
        return this.f36290;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29628() {
        return this.f36284.length;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m29633(int i) {
        return this.f36287[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19927 m29631(int i) {
        return this.f36284[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m29632(int i) {
        C11003.checkFromToIndex(i, i, this.f36290);
        int[] iArr = this.f36286;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return iArr[iBinarySearch];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29629(int i) {
        C11003.checkFromToIndex(i, i, this.f36290);
        int[] iArr = this.f36286;
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
