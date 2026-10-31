package l;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۜ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6630 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1691 f20400;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f20401 = new int[6];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[][] f20402;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20403;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[][] f20404;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20405;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[][] f20406;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f20407;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f20408;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18158() throws IOException {
        int i = this.f20408 + 1;
        this.f20408 = i;
        if (i % 50 == 0) {
            int i2 = this.f20403 + 1;
            this.f20403 = i2;
            byte[] bArr = this.f20407;
            if (i2 == bArr.length) {
                throw new C23563("Error decoding BZip2 block");
            }
            this.f20405 = bArr[i2] & 255;
        }
        int i3 = this.f20405;
        int[] iArr = this.f20404[i3];
        int i4 = this.f20401[i3];
        C1691 c1691 = this.f20400;
        int iM5702 = c1691.m5702(i4);
        while (i4 <= 23) {
            if (iM5702 <= iArr[i4]) {
                return this.f20406[i3][iM5702 - this.f20402[i3][i4]];
            }
            iM5702 = (iM5702 << 1) | c1691.m5702(1);
            i4++;
        }
        throw new C23563("Error decoding BZip2 block");
    }

    public C6630(C1691 c1691, int i, byte[][] bArr, byte[] bArr2) {
        Class cls = Integer.TYPE;
        this.f20402 = (int[][]) Array.newInstance((Class<?>) cls, 6, 25);
        this.f20404 = (int[][]) Array.newInstance((Class<?>) cls, 6, 24);
        this.f20406 = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f20403 = -1;
        this.f20408 = -1;
        this.f20400 = c1691;
        this.f20407 = bArr2;
        this.f20405 = bArr2[0];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int[] iArr = this.f20402[i2];
            int[] iArr2 = this.f20404[i2];
            int[] iArr3 = this.f20406[i2];
            byte[] bArr3 = bArr[i2];
            int iMin = 23;
            int iMax = 0;
            for (int i3 = 0; i3 < i; i3++) {
                iMax = Math.max((int) bArr3[i3], iMax);
                iMin = Math.min((int) bArr3[i3], iMin);
            }
            this.f20401[i2] = iMin;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr3[i4] + 1;
                iArr[i5] = iArr[i5] + 1;
            }
            for (int i6 = 1; i6 < 25; i6++) {
                iArr[i6] = iArr[i6] + iArr[i6 - 1];
            }
            int i7 = 0;
            int i8 = iMin;
            while (i8 <= iMax) {
                int i9 = i8 + 1;
                int i10 = iArr[i9];
                int i11 = iArr[i8];
                int i12 = (i10 - i11) + i7;
                iArr[i8] = i7 - i11;
                iArr2[i8] = i12 - 1;
                i7 = i12 << 1;
                i8 = i9;
            }
            int i13 = 0;
            while (iMin <= iMax) {
                for (int i14 = 0; i14 < i; i14++) {
                    if (bArr3[i14] == iMin) {
                        iArr3[i13] = i14;
                        i13++;
                    }
                }
                iMin++;
            }
        }
    }
}
