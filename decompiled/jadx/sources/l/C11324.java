package l;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۧ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11324 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[][] f33891 = new int[2][];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f33892 = {-1, -1};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f33890 = {-1, -1};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[][] m27974(int[] iArr, int[] iArr2) {
        int[] iArrM27972 = m27972(0, iArr2, iArr);
        return new int[][]{iArrM27972, m27972(1, iArrM27972, iArr2)};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int[] m27972(int i, int[] iArr, int[] iArr2) {
        this.f33892[i] = iArr2.length;
        int[] iArr3 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        Arrays.sort(iArr3);
        C15859 c15859 = new C15859(iArr2.length);
        C15859 c158510 = new C15859(iArr2.length);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            int i3 = iArr2[i2];
            if (Arrays.binarySearch(iArr3, i3) >= 0) {
                c15859.add(i3);
                c158510.add(i2);
            }
        }
        this.f33891[i] = c158510.mo3586();
        this.f33890[i] = c15859.size();
        return c15859.mo3586();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27973(BitSet[] bitSetArr, C11757 c11757) {
        int i;
        int[][] iArr;
        BitSet bitSet;
        BitSet bitSet2;
        int i2;
        int[] iArr2 = this.f33890;
        int i3 = iArr2[0];
        int[] iArr3 = this.f33892;
        if (i3 == iArr3[0] && iArr2[1] == iArr3[1]) {
            bitSet = bitSetArr[0];
            bitSet2 = bitSetArr[1];
        } else {
            BitSet bitSet3 = new BitSet(iArr3[0]);
            BitSet bitSet4 = new BitSet(iArr3[1]);
            int iM27971 = 0;
            int iM27972 = 0;
            while (true) {
                i = iArr2[0];
                iArr = this.f33891;
                if (iM27971 >= i && iM27972 >= iArr2[1]) {
                    break;
                }
                if (iM27971 < i && iM27972 < iArr2[1] && !bitSetArr[0].get(iM27971) && !bitSetArr[1].get(iM27972)) {
                    iM27971 = m27971(iArr[0], iM27971, bitSet3, iArr3[0]);
                    iM27972 = m27971(iArr[1], iM27972, bitSet4, iArr3[1]);
                } else if (bitSetArr[0].get(iM27971)) {
                    bitSet3.set(iArr[0][iM27971]);
                    iM27971 = m27971(iArr[0], iM27971, bitSet3, iArr3[0]);
                } else if (bitSetArr[1].get(iM27972)) {
                    bitSet4.set(iArr[1][iM27972]);
                    iM27972 = m27971(iArr[1], iM27972, bitSet4, iArr3[1]);
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
                c11757.m28784(i6 - i4);
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
                c11757.m28785(i7, i8);
            }
        }
        if (i4 == i2 && i5 == iArr3[1]) {
            return;
        }
        c11757.m28785(i2 - i4, iArr3[1] - i5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27971(int[] iArr, int i, BitSet bitSet, int i2) {
        int i3 = i + 1;
        if (i3 < iArr.length) {
            bitSet.set(iArr[i] + 1, iArr[i3]);
            return i3;
        }
        bitSet.set(iArr[i] + 1, i2);
        return i3;
    }
}
