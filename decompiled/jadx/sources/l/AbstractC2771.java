package l;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۖ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2771 extends AbstractC17587 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int[][] f8621;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[][] f8622;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f8623;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C9827 f8624;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int[] f8625;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f8626;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f8627;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C16175 f8628;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f8629;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC13644 f8630;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f8631;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f8632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15469 f8633;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9827 f8634;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f8635;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public abstract int mo8560();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2771 m8545(C15469 c15469, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C4265 c4265) {
        if (i3 == 1) {
            return new C4182(c15469, i, i2, i4, i5, i6, i7, i8, c4265);
        }
        if (i3 == 2) {
            return new C18999(c15469, i, i2, i4, i5, i6, i7, i8, c4265);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8555(C4265 c4265) {
        this.f8630.mo16472(c4265);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m8548(int i) {
        if (i <= 4 && i >= 0) {
            return i;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
        return ((31 - iNumberOfLeadingZeros) << 1) + ((i >>> (30 - iNumberOfLeadingZeros)) & 1);
    }

    public AbstractC2771(C15469 c15469, AbstractC13644 abstractC13644, int i, int i2, int i3, int i4) {
        super(i2);
        this.f8632 = 0;
        this.f8623 = 0;
        Class cls = Integer.TYPE;
        this.f8622 = (int[][]) Array.newInstance((Class<?>) cls, 4, 128);
        this.f8625 = new int[16];
        this.f8631 = 0;
        this.f8626 = -1;
        this.f8629 = 0;
        this.f8633 = c15469;
        this.f8630 = abstractC13644;
        this.f8635 = i4;
        this.f8628 = new C16175(this, i);
        this.f8634 = new C9827(this, i2, i4);
        this.f8624 = new C9827(this, i2, i4);
        int iM8548 = m8548(i3 - 1) + 1;
        this.f8627 = iM8548;
        this.f8621 = (int[][]) Array.newInstance((Class<?>) cls, 4, iM8548);
        mo8553();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC13644 m8559() {
        return this.f8630;
    }

    @Override // l.AbstractC17587
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8553() {
        super.mo8553();
        this.f8628.m38112();
        this.f8634.mo24895();
        this.f8624.mo24895();
        this.f8632 = 0;
        this.f8623 = 0;
        this.f8629 = this.f8626 + 1 + this.f8629;
        this.f8626 = -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m8558() {
        return this.f8629;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m8562() {
        this.f8629 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m8557() {
        try {
            if (!this.f8630.m32793() && !m8549()) {
                return false;
            }
            while (this.f8629 <= 2096879 && this.f8633.m36558() <= 65510) {
                if (!m8547()) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            throw new Error();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m8549() {
        if (!this.f8630.m32788(0)) {
            return false;
        }
        m8554(1);
        this.f8633.m36557(this.f53753[this.f53750.m2666()], 0, 0);
        this.f8628.m38111();
        this.f8626--;
        this.f8629++;
        return true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m8547() {
        int i = this.f8626 + 1;
        AbstractC13644 abstractC13644 = this.f8630;
        if (!abstractC13644.m32788(i)) {
            return false;
        }
        int iMo8560 = mo8560();
        int iM32790 = (abstractC13644.m32790() - this.f8626) & this.f53747;
        int i2 = this.f8631;
        short[][] sArr = this.f53753;
        C0653 c0653 = this.f53750;
        C15469 c15469 = this.f8633;
        if (i2 == -1) {
            c15469.m36557(sArr[c0653.m2666()], iM32790, 0);
            this.f8628.m38110();
        } else {
            c15469.m36557(sArr[c0653.m2666()], iM32790, 1);
            int i3 = this.f8631;
            int[] iArr = this.f53746;
            short[] sArr2 = this.f53752;
            if (i3 < 4) {
                c15469.m36557(sArr2, c0653.m2666(), 1);
                int i4 = this.f8631;
                short[] sArr3 = this.f53749;
                if (i4 == 0) {
                    c15469.m36557(sArr3, c0653.m2666(), 0);
                    c15469.m36557(this.f53755[c0653.m2666()], iM32790, iMo8560 != 1 ? 1 : 0);
                } else {
                    int i5 = iArr[i4];
                    c15469.m36557(sArr3, c0653.m2666(), 1);
                    short[] sArr4 = this.f53745;
                    if (i4 == 1) {
                        c15469.m36557(sArr4, c0653.m2666(), 0);
                    } else {
                        c15469.m36557(sArr4, c0653.m2666(), 1);
                        c15469.m36557(this.f53754, c0653.m2666(), i4 - 2);
                        if (i4 == 3) {
                            iArr[3] = iArr[2];
                        }
                        iArr[2] = iArr[1];
                    }
                    iArr[1] = iArr[0];
                    iArr[0] = i5;
                }
                if (iMo8560 == 1) {
                    c0653.m2673();
                } else {
                    this.f8624.m24896(iMo8560, iM32790);
                    c0653.m2671();
                }
            } else {
                c15469.m36557(sArr2, c0653.m2666(), 0);
                int i6 = this.f8631 - 4;
                c0653.m2669();
                this.f8634.m24896(iMo8560, iM32790);
                int iM8548 = m8548(i6);
                c15469.m36556(this.f53748[iMo8560 < 6 ? iMo8560 - 2 : 3], iM8548);
                if (iM8548 >= 4) {
                    int i7 = iM8548 >>> 1;
                    int i8 = i6 - (((iM8548 & 1) | 2) << (i7 - 1));
                    if (iM8548 < 14) {
                        short[] sArr5 = this.f53751[iM8548 - 4];
                        int length = sArr5.length | i8;
                        int i9 = 1;
                        do {
                            int i10 = length & 1;
                            length >>>= 1;
                            c15469.m36557(sArr5, i9, i10);
                            i9 = (i9 << 1) | i10;
                        } while (length != 1);
                    } else {
                        c15469.m36559(i8 >>> 4, i7 - 5);
                        short[] sArr6 = this.f53744;
                        int length2 = (i8 & 15) | sArr6.length;
                        int i11 = 1;
                        do {
                            int i12 = length2 & 1;
                            length2 >>>= 1;
                            c15469.m36557(sArr6, i11, i12);
                            i11 = (i11 << 1) | i12;
                        } while (length2 != 1);
                        this.f8623--;
                    }
                }
                iArr[3] = iArr[2];
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = i6;
                this.f8632--;
            }
        }
        this.f8626 -= iMo8560;
        this.f8629 += iMo8560;
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2065 m8561() {
        this.f8626++;
        return this.f8630.mo16473();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8554(int i) {
        this.f8626 += i;
        this.f8630.mo16474(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8552(int i, C0653 c0653, int i2) {
        return m8551(C15469.m36551(this.f53752[c0653.m2666()], 1) + C15469.m36551(this.f53753[c0653.m2666()][i2], 1), 0, c0653, i2) + this.f8624.m24897(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8551(int i, int i2, C0653 c0653, int i3) {
        short[] sArr = this.f53749;
        if (i2 == 0) {
            return C15469.m36551(this.f53755[c0653.m2666()][i3], 1) + C15469.m36551(sArr[c0653.m2666()], 0) + i;
        }
        int iM36551 = C15469.m36551(sArr[c0653.m2666()], 1) + i;
        short[] sArr2 = this.f53745;
        if (i2 == 1) {
            return C15469.m36551(sArr2[c0653.m2666()], 0) + iM36551;
        }
        return C15469.m36551(this.f53754[c0653.m2666()], i2 - 2) + C15469.m36551(sArr2[c0653.m2666()], 1) + iM36551;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8550(int i, int i2, int i3, int i4) {
        int iM24897 = i + this.f8634.m24897(i3, i4);
        int i5 = i3 < 6 ? i3 - 2 : 3;
        if (i2 < 128) {
            return iM24897 + this.f8622[i5][i2];
        }
        return this.f8621[i5][m8548(i2)] + this.f8625[i2 & 15] + iM24897;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m8556() {
        int[][] iArr;
        int i;
        int[][] iArr2;
        int i2;
        int i3 = 1;
        if (this.f8632 <= 0) {
            this.f8632 = 128;
            int i4 = 0;
            while (true) {
                iArr = this.f8622;
                i = 14;
                iArr2 = this.f8621;
                if (i4 >= 4) {
                    break;
                }
                int i5 = 0;
                while (true) {
                    i2 = this.f8627;
                    if (i5 >= i2) {
                        break;
                    }
                    iArr2[i4][i5] = C15469.m36550(this.f53748[i4], i5);
                    i5++;
                }
                while (i < i2) {
                    int[] iArr3 = iArr2[i4];
                    int i6 = iArr3[i];
                    int i7 = C15469.f47341;
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
                short[][] sArr = this.f53751;
                int length = sArr[i12].length;
                int i13 = 0;
                while (i13 < length) {
                    short[] sArr2 = sArr[i12];
                    int i14 = C15469.f47341;
                    int length2 = (i10 - i11) | sArr2.length;
                    int iM36551 = 0;
                    int i15 = 1;
                    do {
                        int i16 = length2 & 1;
                        length2 >>>= i3;
                        iM36551 += C15469.m36551(sArr2[i15], i16);
                        i15 = (i15 << 1) | i16;
                        i3 = 1;
                    } while (length2 != 1);
                    for (int i17 = 0; i17 < 4; i17++) {
                        iArr[i17][i10] = iArr2[i17][i9] + iM36551;
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
        if (this.f8623 <= 0) {
            this.f8623 = 16;
            for (int i18 = 0; i18 < 16; i18++) {
                int i19 = C15469.f47341;
                short[] sArr3 = this.f53744;
                int length3 = sArr3.length | i18;
                int iM36552 = 0;
                int i20 = 1;
                do {
                    int i21 = length3 & 1;
                    length3 >>>= 1;
                    iM36552 += C15469.m36551(sArr3[i20], i21);
                    i20 = (i20 << 1) | i21;
                } while (length3 != 1);
                this.f8625[i18] = iM36552;
            }
        }
        this.f8634.m24898();
        this.f8624.m24898();
    }
}
