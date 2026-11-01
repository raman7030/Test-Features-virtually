package p067l;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۖ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5002 extends AbstractC19083 {

    /* JADX INFO: renamed from: ֡ */
    public final int[][] f11415;

    /* JADX INFO: renamed from: ֨ */
    public final int[][] f11416;

    /* JADX INFO: renamed from: ۖ */
    public int f11417;

    /* JADX INFO: renamed from: ۗ */
    public final C11708 f11418;

    /* JADX INFO: renamed from: ۘ */
    public final int[] f11419;

    /* JADX INFO: renamed from: ۙ */
    public int f11420;

    /* JADX INFO: renamed from: ۚ */
    public final int f11421;

    /* JADX INFO: renamed from: ۠ */
    public final C17741 f11422;

    /* JADX INFO: renamed from: ۬ */
    public int f11423;

    /* JADX INFO: renamed from: ܶ */
    public final AbstractC15335 f11424;

    /* JADX INFO: renamed from: ᩴ */
    public int f11425;

    /* JADX INFO: renamed from: ᩵ */
    public int f11426;

    /* JADX INFO: renamed from: ᩶ */
    public final C17070 f11427;

    /* JADX INFO: renamed from: ᩸ */
    public final C11708 f11428;

    /* JADX INFO: renamed from: ᩹ */
    public final int f11429;

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo10623();

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5002 m10608(C17070 c17070, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C6422 c6422) {
        if (i3 == 1) {
            return new C6343(c17070, i, i2, i4, i5, i6, i7, i8, c6422);
        }
        if (i3 == 2) {
            return new C20425(c17070, i, i2, i4, i5, i6, i7, i8, c6422);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10618(C6422 c6422) {
        this.f11424.mo18398(c6422);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m10611(int i) {
        if (i <= 4 && i >= 0) {
            return i;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
        return ((31 - iNumberOfLeadingZeros) << 1) + ((i >>> (30 - iNumberOfLeadingZeros)) & 1);
    }

    public AbstractC5002(C17070 c17070, AbstractC15335 abstractC15335, int i, int i2, int i3, int i4) {
        super(i2);
        this.f11426 = 0;
        this.f11417 = 0;
        Class cls = Integer.TYPE;
        this.f11416 = (int[][]) Array.newInstance((Class<?>) cls, 4, 128);
        this.f11419 = new int[16];
        this.f11425 = 0;
        this.f11420 = -1;
        this.f11423 = 0;
        this.f11427 = c17070;
        this.f11424 = abstractC15335;
        this.f11429 = i4;
        this.f11422 = new C17741(this, i);
        this.f11428 = new C11708(this, i2, i4);
        this.f11418 = new C11708(this, i2, i4);
        int iM10611 = m10611(i3 - 1) + 1;
        this.f11421 = iM10611;
        this.f11415 = (int[][]) Array.newInstance((Class<?>) cls, 4, iM10611);
        mo10616();
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15335 m10622() {
        return this.f11424;
    }

    @Override // p067l.AbstractC19083
    /* JADX INFO: renamed from: ֫ */
    public void mo10616() {
        super.mo10616();
        this.f11422.m40324();
        this.f11428.mo26910();
        this.f11418.mo26910();
        this.f11426 = 0;
        this.f11417 = 0;
        this.f11423 = this.f11420 + 1 + this.f11423;
        this.f11420 = -1;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m10621() {
        return this.f11423;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m10625() {
        this.f11423 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m10620() {
        try {
            if (!this.f11424.m34908() && !m10612()) {
                return false;
            }
            while (this.f11423 <= 2096879 && this.f11427.m38717() <= 65510) {
                if (!m10610()) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            throw new Error();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m10612() {
        if (!this.f11424.m34903(0)) {
            return false;
        }
        m10617(1);
        this.f11427.m38716(this.f56947[this.f56944.m5006()], 0, 0);
        this.f11422.m40323();
        this.f11420--;
        this.f11423++;
        return true;
    }

    /* JADX INFO: renamed from: ۢ */
    private boolean m10610() {
        int i = this.f11420 + 1;
        AbstractC15335 abstractC15335 = this.f11424;
        if (!abstractC15335.m34903(i)) {
            return false;
        }
        int iMo10623 = mo10623();
        int iM34905 = (abstractC15335.m34905() - this.f11420) & this.f56941;
        int i2 = this.f11425;
        short[][] sArr = this.f56947;
        C2989 c2989 = this.f56944;
        C17070 c17070 = this.f11427;
        if (i2 == -1) {
            c17070.m38716(sArr[c2989.m5006()], iM34905, 0);
            this.f11422.m40322();
        } else {
            c17070.m38716(sArr[c2989.m5006()], iM34905, 1);
            int i3 = this.f11425;
            int[] iArr = this.f56940;
            short[] sArr2 = this.f56946;
            if (i3 < 4) {
                c17070.m38716(sArr2, c2989.m5006(), 1);
                int i4 = this.f11425;
                short[] sArr3 = this.f56943;
                if (i4 == 0) {
                    c17070.m38716(sArr3, c2989.m5006(), 0);
                    c17070.m38716(this.f56949[c2989.m5006()], iM34905, iMo10623 != 1 ? 1 : 0);
                } else {
                    int i5 = iArr[i4];
                    c17070.m38716(sArr3, c2989.m5006(), 1);
                    short[] sArr4 = this.f56939;
                    if (i4 == 1) {
                        c17070.m38716(sArr4, c2989.m5006(), 0);
                    } else {
                        c17070.m38716(sArr4, c2989.m5006(), 1);
                        c17070.m38716(this.f56948, c2989.m5006(), i4 - 2);
                        if (i4 == 3) {
                            iArr[3] = iArr[2];
                        }
                        iArr[2] = iArr[1];
                    }
                    iArr[1] = iArr[0];
                    iArr[0] = i5;
                }
                if (iMo10623 == 1) {
                    c2989.m5013();
                } else {
                    this.f11418.m26911(iMo10623, iM34905);
                    c2989.m5011();
                }
            } else {
                c17070.m38716(sArr2, c2989.m5006(), 0);
                int i6 = this.f11425 - 4;
                c2989.m5009();
                this.f11428.m26911(iMo10623, iM34905);
                int iM10611 = m10611(i6);
                c17070.m38715(this.f56942[iMo10623 < 6 ? iMo10623 - 2 : 3], iM10611);
                if (iM10611 >= 4) {
                    int i7 = iM10611 >>> 1;
                    int i8 = i6 - (((iM10611 & 1) | 2) << (i7 - 1));
                    if (iM10611 < 14) {
                        short[] sArr5 = this.f56945[iM10611 - 4];
                        int length = sArr5.length | i8;
                        int i9 = 1;
                        do {
                            int i10 = length & 1;
                            length >>>= 1;
                            c17070.m38716(sArr5, i9, i10);
                            i9 = (i9 << 1) | i10;
                        } while (length != 1);
                    } else {
                        c17070.m38718(i8 >>> 4, i7 - 5);
                        short[] sArr6 = this.f56938;
                        int length2 = (i8 & 15) | sArr6.length;
                        int i11 = 1;
                        do {
                            int i12 = length2 & 1;
                            length2 >>>= 1;
                            c17070.m38716(sArr6, i11, i12);
                            i11 = (i11 << 1) | i12;
                        } while (length2 != 1);
                        this.f11417--;
                    }
                }
                iArr[3] = iArr[2];
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = i6;
                this.f11426--;
            }
        }
        this.f11420 -= iMo10623;
        this.f11423 += iMo10623;
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4331 m10624() {
        this.f11420++;
        return this.f11424.mo18399();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10617(int i) {
        this.f11420 += i;
        this.f11424.mo18400(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10615(int i, C2989 c2989, int i2) {
        return m10614(C17070.m38710(this.f56946[c2989.m5006()], 1) + C17070.m38710(this.f56947[c2989.m5006()][i2], 1), 0, c2989, i2) + this.f11418.m26912(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10614(int i, int i2, C2989 c2989, int i3) {
        short[] sArr = this.f56943;
        if (i2 == 0) {
            return C17070.m38710(this.f56949[c2989.m5006()][i3], 1) + C17070.m38710(sArr[c2989.m5006()], 0) + i;
        }
        int iM38710 = C17070.m38710(sArr[c2989.m5006()], 1) + i;
        short[] sArr2 = this.f56939;
        if (i2 == 1) {
            return C17070.m38710(sArr2[c2989.m5006()], 0) + iM38710;
        }
        return C17070.m38710(this.f56948[c2989.m5006()], i2 - 2) + C17070.m38710(sArr2[c2989.m5006()], 1) + iM38710;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10613(int i, int i2, int i3, int i4) {
        int iM26912 = i + this.f11428.m26912(i3, i4);
        int i5 = i3 < 6 ? i3 - 2 : 3;
        if (i2 < 128) {
            return iM26912 + this.f11416[i5][i2];
        }
        return this.f11415[i5][m10611(i2)] + this.f11419[i2 & 15] + iM26912;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m10619() {
        int[][] iArr;
        int i;
        int[][] iArr2;
        int i2;
        int i3 = 1;
        if (this.f11426 <= 0) {
            this.f11426 = 128;
            int i4 = 0;
            while (true) {
                iArr = this.f11416;
                i = 14;
                iArr2 = this.f11415;
                if (i4 >= 4) {
                    break;
                }
                int i5 = 0;
                while (true) {
                    i2 = this.f11421;
                    if (i5 >= i2) {
                        break;
                    }
                    iArr2[i4][i5] = C17070.m38709(this.f56942[i4], i5);
                    i5++;
                }
                while (i < i2) {
                    int[] iArr3 = iArr2[i4];
                    int i6 = iArr3[i];
                    int i7 = C17070.f50472;
                    iArr3[i] = i6 + (((i >>> 1) - 5) << 4);
                    i++;
                }
                for (int i8 = 0; i8 < 4; i8++) {
                    iArr[i4][i8] = iArr2[i4][i8];
                }
                i4++;
            }
            int i9 = 4;
            int i10 = 4;
            while (i9 < i) {
                int i11 = ((i9 & 1) | 2) << ((i9 >>> 1) - i3);
                int i12 = i9 - 4;
                short[][] sArr = this.f56945;
                int length = sArr[i12].length;
                int i13 = 0;
                while (i13 < length) {
                    short[] sArr2 = sArr[i12];
                    int i14 = C17070.f50472;
                    int length2 = (i10 - i11) | sArr2.length;
                    int iM38710 = 0;
                    int i15 = 1;
                    do {
                        int i16 = length2 & 1;
                        length2 >>>= i3;
                        iM38710 += C17070.m38710(sArr2[i15], i16);
                        i15 = (i15 << 1) | i16;
                        i3 = 1;
                    } while (length2 != 1);
                    for (int i17 = 0; i17 < 4; i17++) {
                        iArr[i17][i10] = iArr2[i17][i9] + iM38710;
                    }
                    i10++;
                    i13++;
                    i3 = 1;
                }
                i9++;
                i = 14;
                i3 = 1;
            }
        }
        if (this.f11417 <= 0) {
            this.f11417 = 16;
            for (int i18 = 0; i18 < 16; i18++) {
                int i19 = C17070.f50472;
                short[] sArr3 = this.f56938;
                int length3 = sArr3.length | i18;
                int iM38711 = 0;
                int i20 = 1;
                do {
                    int i21 = length3 & 1;
                    length3 >>>= 1;
                    iM38711 += C17070.m38710(sArr3[i20], i21);
                    i20 = (i20 << 1) | i21;
                } while (length3 != 1);
                this.f11419[i18] = iM38711;
            }
        }
        this.f11428.m26913();
        this.f11418.m26913();
    }
}
