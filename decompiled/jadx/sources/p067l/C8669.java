package p067l;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۜ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C8669 {

    /* JADX INFO: renamed from: ֫ */
    public final C3975 f23276;

    /* JADX INFO: renamed from: ۜ */
    public final int[] f23277 = new int[6];

    /* JADX INFO: renamed from: ۧ */
    public final int[][] f23278;

    /* JADX INFO: renamed from: ܳ */
    public int f23279;

    /* JADX INFO: renamed from: ܽ */
    public final int[][] f23280;

    /* JADX INFO: renamed from: ܿ */
    public int f23281;

    /* JADX INFO: renamed from: ᩳ */
    public final int[][] f23282;

    /* JADX INFO: renamed from: ᩷ */
    public final byte[] f23283;

    /* JADX INFO: renamed from: ᩻ */
    public int f23284;

    /* JADX INFO: renamed from: ֫ */
    public final int m20110() throws IOException {
        int i = this.f23284 + 1;
        this.f23284 = i;
        if (i % 50 == 0) {
            int i2 = this.f23279 + 1;
            this.f23279 = i2;
            byte[] bArr = this.f23283;
            if (i2 == bArr.length) {
                throw new C24762("Error decoding BZip2 block");
            }
            this.f23281 = bArr[i2] & 255;
        }
        int i3 = this.f23281;
        int[] iArr = this.f23280[i3];
        int i4 = this.f23277[i3];
        C3975 c3975 = this.f23276;
        int iM7935 = c3975.m7935(i4);
        while (i4 <= 23) {
            if (iM7935 <= iArr[i4]) {
                return this.f23282[i3][iM7935 - this.f23278[i3][i4]];
            }
            iM7935 = (iM7935 << 1) | c3975.m7935(1);
            i4++;
        }
        throw new C24762("Error decoding BZip2 block");
    }

    public C8669(C3975 c3975, int i, byte[][] bArr, byte[] bArr2) {
        Class cls = Integer.TYPE;
        this.f23278 = (int[][]) Array.newInstance((Class<?>) cls, 6, 25);
        this.f23280 = (int[][]) Array.newInstance((Class<?>) cls, 6, 24);
        this.f23282 = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f23279 = -1;
        this.f23284 = -1;
        this.f23276 = c3975;
        this.f23283 = bArr2;
        this.f23281 = bArr2[0];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int[] iArr = this.f23278[i2];
            int[] iArr2 = this.f23280[i2];
            int[] iArr3 = this.f23282[i2];
            byte[] bArr3 = bArr[i2];
            int iMin = 23;
            int iMax = 0;
            for (int i3 = 0; i3 < i; i3++) {
                iMax = Math.max((int) bArr3[i3], iMax);
                iMin = Math.min((int) bArr3[i3], iMin);
            }
            this.f23277[i2] = iMin;
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
