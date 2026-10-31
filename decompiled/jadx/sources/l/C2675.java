package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2675 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f8377;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[][][] f8378;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6181 f8379;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f8380;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f8381;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6181[] f8382;

    public C2675(int[] iArr, C6181[] c6181Arr, int[] iArr2, int[][][] iArr3, C6181 c6181) {
        this.f8381 = iArr;
        this.f8382 = c6181Arr;
        this.f8378 = iArr3;
        this.f8380 = iArr2;
        this.f8379 = c6181;
        this.f8377 = iArr.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8370() {
        return this.f8377;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8371(int i) {
        return this.f8381[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6181 m8375(int i) {
        return this.f8382[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8373(int i, int i2, int i3) {
        return this.f8378[i][i2][i3] & 7;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8372(int i, int i2) {
        C6181[] c6181Arr = this.f8382;
        int i3 = c6181Arr[i].m17102(i2).f39854;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (m8373(i, i2, i6) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
        int iMin = 16;
        String str = null;
        boolean z = false;
        int i7 = 0;
        while (i4 < iArrCopyOf.length) {
            String str2 = c6181Arr[i].m17102(i2).m32295(iArrCopyOf[i4]).f25614;
            int i8 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z |= !C11003.equals(str, str2);
            }
            iMin = Math.min(iMin, this.f8378[i][i2][i4] & 24);
            i4++;
            i7 = i8;
        }
        return z ? Math.min(iMin, this.f8380[i]) : iMin;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6181 m8374() {
        return this.f8379;
    }
}
