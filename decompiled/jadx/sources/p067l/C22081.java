package p067l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.᩷۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 07SK */
/* JADX INFO: loaded from: classes4.dex */
public final class C22081 {

    /* JADX INFO: renamed from: ֫ */
    public final C12693 f69455;

    /* JADX INFO: renamed from: ۜ */
    public final byte[] f69456;

    /* JADX INFO: renamed from: ۧ */
    public final int[][] f69457;

    /* JADX INFO: renamed from: ܳ */
    public int f69458;

    /* JADX INFO: renamed from: ܽ */
    public final int[][] f69459;

    /* JADX INFO: renamed from: ܿ */
    public final char[] f69460;

    /* JADX INFO: renamed from: ᩳ */
    public int f69461;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f69462;

    /* JADX INFO: renamed from: ֫ */
    public final void m49701() throws IOException {
        int i;
        char[] cArr;
        byte[] bArr;
        int[][] iArr;
        int[] iArr2;
        int[][] iArr3 = this.f69457;
        int length = iArr3.length;
        int i2 = this.f69458;
        int i3 = -1;
        char c = 0;
        int i4 = 0;
        int i5 = i2;
        while (true) {
            i = this.f69461;
            if (i4 >= length) {
                break;
            }
            int i6 = length - i4;
            int i7 = i5 / i6;
            int i8 = i3 + 1;
            int i9 = 0;
            while (true) {
                iArr2 = this.f69462;
                if (i9 >= i7 || i3 >= i - 1) {
                    break;
                }
                i3++;
                i9 += iArr2[i3];
            }
            if (i3 > i8 && i4 != 0 && i4 != length - 1 && (i6 & 1) == 0) {
                i9 -= iArr2[i3];
                i3--;
            }
            int[] iArr4 = iArr3[i4];
            for (int i10 = 0; i10 < i; i10++) {
                if (i10 < i8 || i10 > i3) {
                    iArr4[i10] = 15;
                }
            }
            i5 -= i9;
            i4++;
        }
        int i11 = 3;
        while (true) {
            cArr = this.f69460;
            bArr = this.f69456;
            if (i11 < 0) {
                break;
            }
            boolean z = i11 == 0;
            int length2 = iArr3.length;
            int[] iArr5 = new int[2];
            iArr5[1] = i;
            iArr5[c] = length2;
            int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr5);
            int i12 = 0;
            int i13 = 0;
            while (i12 < i2) {
                int iMin = Math.min(i12 + 50, i2);
                int i14 = iMin - 1;
                short[] sArr = new short[length2];
                int i15 = i12;
                while (i15 <= i14) {
                    char c2 = cArr[i15];
                    int i16 = i12;
                    int i17 = 0;
                    while (i17 < length2) {
                        sArr[i17] = (short) (sArr[i17] + iArr3[i17][c2]);
                        i17++;
                        iMin = iMin;
                    }
                    i15++;
                    i12 = i16;
                }
                int i18 = i12;
                int i19 = iMin;
                short s = sArr[0];
                byte b = 1;
                byte b2 = 0;
                while (b < length2) {
                    int i20 = i2;
                    short s2 = sArr[b];
                    if (s2 < s) {
                        s = s2;
                        b2 = b;
                    }
                    b = (byte) (b + 1);
                    i2 = i20;
                }
                int i21 = i2;
                int[] iArr7 = iArr6[b2];
                for (int i22 = i18; i22 <= i14; i22++) {
                    char c3 = cArr[i22];
                    iArr7[c3] = iArr7[c3] + 1;
                }
                if (z) {
                    bArr[i13] = b2;
                    i13++;
                }
                i2 = i21;
                i12 = i19;
            }
            int i23 = i2;
            for (int i24 = 0; i24 < length2; i24++) {
                int[] iArr8 = iArr6[i24];
                int[] iArr9 = iArr3[i24];
                int[] iArr10 = new int[i];
                int[] iArr11 = new int[i];
                for (int i25 = 0; i25 < i; i25++) {
                    iArr10[i25] = (iArr8[i25] << 9) | i25;
                }
                Arrays.sort(iArr10);
                for (int i26 = 0; i26 < i; i26++) {
                    iArr11[i26] = iArr10[i26] >>> 9;
                }
                C24158.m53416(iArr11);
                for (int i27 = 0; i27 < i; i27++) {
                    iArr9[iArr10[i27] & SecP521R1Field.P16] = iArr11[i27];
                }
            }
            i11--;
            c = 0;
            i2 = i23;
        }
        int i28 = i2;
        int length3 = iArr3.length;
        int i29 = 0;
        while (true) {
            iArr = this.f69459;
            if (i29 >= length3) {
                break;
            }
            int[] iArr12 = iArr3[i29];
            int i30 = 32;
            int i31 = 0;
            for (int i32 = 0; i32 < i; i32++) {
                int i33 = iArr12[i32];
                if (i33 > i31) {
                    i31 = i33;
                }
                if (i33 < i30) {
                    i30 = i33;
                }
            }
            int i34 = 0;
            while (i30 <= i31) {
                for (int i35 = 0; i35 < i; i35++) {
                    if ((iArr3[i29][i35] & 255) == i30) {
                        iArr[i29][i35] = (i30 << 24) | i34;
                        i34++;
                    }
                }
                i34 <<= 1;
                i30++;
            }
            i29++;
        }
        int length4 = bArr.length;
        int length5 = iArr3.length;
        C12693 c12693 = this.f69455;
        int i36 = 3;
        c12693.m29211(3, length5);
        c12693.m29211(15, length4);
        C5987 c5987 = new C5987();
        for (byte b3 : bArr) {
            int iM13427 = c5987.m13427(b3);
            while (true) {
                int i37 = iM13427 - 1;
                if (iM13427 > 0) {
                    c12693.m29212(true);
                    iM13427 = i37;
                }
            }
            c12693.m29212(false);
        }
        int i38 = 0;
        while (i38 < length5) {
            int[] iArr13 = iArr3[i38];
            int i39 = iArr13[0];
            c12693.m29211(5, i39);
            int i40 = 0;
            while (i40 < i) {
                int i41 = iArr13[i40];
                if (i39 < i41) {
                    i36 = 2;
                }
                int iAbs = Math.abs(i41 - i39);
                while (true) {
                    int i42 = iAbs - 1;
                    if (iAbs > 0) {
                        c12693.m29211(2, i36);
                        iAbs = i42;
                    }
                }
                c12693.m29212(false);
                i40++;
                i36 = 3;
                i39 = i41;
            }
            i38++;
            i36 = 3;
        }
        int i43 = 0;
        int i44 = 0;
        while (i43 < i28) {
            int iMin2 = Math.min(i43 + 50, i28) - 1;
            int i45 = i44 + 1;
            int[] iArr14 = iArr[bArr[i44]];
            while (i43 <= iMin2) {
                int i46 = i43 + 1;
                int i47 = iArr14[cArr[i43]];
                c12693.m29211(i47 >>> 24, i47);
                i43 = i46;
            }
            i44 = i45;
        }
    }

    public C22081(C12693 c12693, char[] cArr, int i, int i2, int[] iArr) {
        this.f69455 = c12693;
        this.f69460 = cArr;
        this.f69458 = i;
        this.f69461 = i2;
        this.f69462 = iArr;
        int i3 = i >= 2400 ? 6 : i >= 1200 ? 5 : i >= 600 ? 4 : i >= 200 ? 3 : 2;
        Class cls = Integer.TYPE;
        this.f69457 = (int[][]) Array.newInstance((Class<?>) cls, i3, i2);
        this.f69459 = (int[][]) Array.newInstance((Class<?>) cls, i3, i2);
        this.f69456 = new byte[(i + 49) / 50];
    }
}
