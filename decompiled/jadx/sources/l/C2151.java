package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֫᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1L5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2151 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f7116;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final BitSet f7117;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f7118;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f7119;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f7120;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f7121;

    public C2151(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int length2 = iArr2.length;
        BitSet bitSet = new BitSet(iArr.length);
        BitSet bitSet2 = new BitSet(iArr2.length);
        this.f7120 = iArr;
        this.f7118 = iArr2;
        this.f7119 = length;
        this.f7121 = length2;
        this.f7116 = bitSet;
        this.f7117 = bitSet2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7109() throws C13872 {
        m7108(0, this.f7119, 0, this.f7121, 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7108(int i, int i2, int i3, int i4, int i5) throws C13872 {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int i7;
        if (i2 == 0 && i4 == 0) {
            return;
        }
        BitSet bitSet = this.f7117;
        BitSet bitSet2 = this.f7116;
        if (i2 != 0 && i4 != 0) {
            int iMin = Math.min(i2, i4);
            int i8 = 0;
            int i9 = 0;
            while (true) {
                iArr = this.f7118;
                iArr2 = this.f7120;
                if (i8 >= iMin || iArr2[i + i8] != iArr[i3 + i8]) {
                    break;
                }
                i9++;
                i8++;
            }
            int i10 = i + i9;
            int i11 = i3 + i9;
            int i12 = i2 - i9;
            int i13 = i4 - i9;
            int iMin2 = Math.min(i12, i13);
            int i14 = 0;
            for (int i15 = 1; i15 <= iMin2 && iArr2[(i10 + i12) - i15] == iArr[(i11 + i13) - i15]; i15++) {
                i14++;
            }
            int i16 = i12 - i14;
            int i17 = i13 - i14;
            if (i16 != 0 && i17 != 0) {
                int i18 = this.f7121;
                int i19 = this.f7119;
                if (i5 != 0 || i16 * 2 < i19 || i17 * 2 < i18) {
                    int iMax = Math.max(-1, i5 - 1);
                    int[][] iArrM39793 = new C16967(i10, i16, this.f7120, i11, this.f7118, i17).m39793();
                    if (iArrM39793 == null) {
                        if (iMax < 0 || i16 * 2 < i19 || i17 * 2 < i18) {
                            new C7523(this.f7120, this.f7118, i10, i16, i11, i17, bitSet2, bitSet).m20163();
                            return;
                        }
                        throw new C13872();
                    }
                    int[] iArr4 = iArrM39793[0];
                    int length = iArr4.length;
                    m7108(i10, iArr4[0], i11, iArrM39793[1][0], iMax);
                    int i20 = 1;
                    while (true) {
                        iArr3 = iArrM39793[0];
                        if (i20 >= iArr3.length) {
                            break;
                        }
                        int i21 = i20 - 1;
                        int i22 = iArr3[i21] + 1;
                        int[] iArr5 = iArrM39793[1];
                        int i23 = iArr5[i21] + 1;
                        int i24 = iArr3[i20] - i22;
                        int i25 = iArr5[i20] - i23;
                        if (i24 > 0 || i25 > 0) {
                            m7108(i22 + i10, i24, i11 + i23, i25, iMax);
                        }
                        i20++;
                    }
                    int i26 = length - 1;
                    int i27 = iArr3[i26];
                    int i28 = i16 - 1;
                    if (i27 == i28) {
                        i6 = 0;
                    } else {
                        i28 = i27 + 1;
                        i6 = i16 - i28;
                    }
                    int i29 = iArrM39793[1][i26];
                    int i30 = i17 - 1;
                    if (i29 == i30) {
                        i7 = 0;
                    } else {
                        i30 = i29 + 1;
                        i7 = i17 - i30;
                    }
                    m7108(i28 + i10, i6, i30 + i11, i7, iMax);
                    return;
                }
                throw new C13872();
            }
            bitSet2.set(i10, i16 + i10);
            bitSet.set(i11, i11 + i17);
            return;
        }
        bitSet2.set(i, i2 + i);
        bitSet.set(i3, i3 + i4);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final BitSet[] m7110() {
        return new BitSet[]{this.f7116, this.f7117};
    }
}
