package p067l;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۧ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C13131 {

    /* JADX INFO: renamed from: ۧ */
    public final int[][] f36890 = new int[2][];

    /* JADX INFO: renamed from: ܽ */
    public final int[] f36891 = {-1, -1};

    /* JADX INFO: renamed from: ֫ */
    public final int[] f36889 = {-1, -1};

    /* JADX INFO: renamed from: ֫ */
    public final int[][] m30035(int[] iArr, int[] iArr2) {
        int[] iArrM30033 = m30033(0, iArr2, iArr);
        return new int[][]{iArrM30033, m30033(1, iArrM30033, iArr2)};
    }

    /* JADX INFO: renamed from: ֫ */
    private int[] m30033(int i, int[] iArr, int[] iArr2) {
        this.f36891[i] = iArr2.length;
        int[] iArr3 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        Arrays.sort(iArr3);
        C17441 c17441 = new C17441(iArr2.length);
        C17441 c17442 = new C17441(iArr2.length);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            int i3 = iArr2[i2];
            if (Arrays.binarySearch(iArr3, i3) >= 0) {
                c17441.add(i3);
                c17442.add(i2);
            }
        }
        this.f36890[i] = c17442.mo5873();
        this.f36889[i] = c17441.size();
        return c17441.mo5873();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30034(BitSet[] bitSetArr, C13542 c13542) {
        int i;
        int[][] iArr;
        BitSet bitSet;
        BitSet bitSet2;
        int i2;
        int[] iArr2 = this.f36889;
        int i3 = iArr2[0];
        int[] iArr3 = this.f36891;
        if (i3 == iArr3[0] && iArr2[1] == iArr3[1]) {
            bitSet = bitSetArr[0];
            bitSet2 = bitSetArr[1];
        } else {
            BitSet bitSet3 = new BitSet(iArr3[0]);
            BitSet bitSet4 = new BitSet(iArr3[1]);
            int iM30032 = 0;
            int iM30033 = 0;
            while (true) {
                i = iArr2[0];
                iArr = this.f36890;
                if (iM30032 >= i && iM30033 >= iArr2[1]) {
                    break;
                }
                if (iM30032 < i && iM30033 < iArr2[1] && !bitSetArr[0].get(iM30032) && !bitSetArr[1].get(iM30033)) {
                    iM30032 = m30032(iArr[0], iM30032, bitSet3, iArr3[0]);
                    iM30033 = m30032(iArr[1], iM30033, bitSet4, iArr3[1]);
                } else if (bitSetArr[0].get(iM30032)) {
                    bitSet3.set(iArr[0][iM30032]);
                    iM30032 = m30032(iArr[0], iM30032, bitSet3, iArr3[0]);
                } else if (bitSetArr[1].get(iM30033)) {
                    bitSet4.set(iArr[1][iM30033]);
                    iM30033 = m30032(iArr[1], iM30033, bitSet4, iArr3[1]);
                }
            }
            if (i == 0) {
                bitSet3.set(0, iArr3[0]);
            } else {
                bitSet3.set(0, iArr[0][0]);
            }
            if (iArr2[1] == 0) {
                bitSet4.set(0, iArr3[1]);
            } else {
                bitSet4.set(0, iArr[1][0]);
            }
            bitSet = bitSet3;
            bitSet2 = bitSet4;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = iArr3[0];
            if (i4 >= i2 || i5 >= iArr3[1]) {
                break;
            }
            int i6 = i4;
            while (i6 < iArr3[0] && i5 < iArr3[1] && !bitSet.get(i6) && !bitSet2.get(i5)) {
                i6++;
                i5++;
            }
            if (i6 > i4) {
                c13542.m30831(i6 - i4);
            }
            i4 = i6;
            int i7 = 0;
            while (i4 < iArr3[0] && bitSet.get(i4)) {
                i7++;
                i4++;
            }
            int i8 = 0;
            while (i5 < iArr3[1] && bitSet2.get(i5)) {
                i8++;
                i5++;
            }
            if (i7 != 0 || i8 != 0) {
                c13542.m30832(i7, i8);
            }
        }
        if (i4 == i2 && i5 == iArr3[1]) {
            return;
        }
        c13542.m30832(i2 - i4, iArr3[1] - i5);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m30032(int[] iArr, int i, BitSet bitSet, int i2) {
        int i3 = i + 1;
        if (i3 < iArr.length) {
            bitSet.set(iArr[i] + 1, iArr[i3]);
            return i3;
        }
        bitSet.set(iArr[i] + 1, i2);
        return i3;
    }
}
