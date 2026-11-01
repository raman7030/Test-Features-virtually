package p067l;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩺ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24270 {
    /* JADX INFO: renamed from: ֫ */
    public static C8177 m53609(Object[] objArr, Object[] objArr2) {
        for (Object obj : objArr) {
        }
        for (Object obj2 : objArr2) {
        }
        int iMin = Math.min(objArr.length, objArr2.length);
        int i = 0;
        for (int i2 = 0; i2 < iMin && objArr[i2].equals(objArr2[i2]); i2++) {
            i++;
        }
        int iMin2 = Math.min(objArr.length, objArr2.length) - i;
        int i3 = 0;
        for (int i4 = 0; i4 < iMin2 && objArr[(objArr.length - i4) - 1].equals(objArr2[(objArr2.length - i4) - 1]); i4++) {
            i3++;
        }
        C3429 c3429M53606 = m53606(objArr.length, objArr2.length, i, i3);
        if (c3429M53606 != null) {
            return (C8177) c3429M53606.m6083();
        }
        C12201 c12201 = new C12201(((objArr.length + objArr2.length) - (i * 2)) - (i3 * 2));
        return m53608(c12201.m28174(i, i3, objArr), c12201.m28174(i, i3, objArr2), new C13542(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3429 m53606(int i, int i2, int i3, int i4) {
        int i5 = (i - i3) - i4;
        int i6 = (i2 - i3) - i4;
        if (i5 == 0 || i6 == 0) {
            return new C3429((i5 == 0 && i6 == 0) ? null : new C8177(i3, i3, i5, i6));
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8177 m53608(int[] iArr, int[] iArr2, C13542 c13542) throws C15552 {
        BitSet[] bitSetArrM9205;
        C13131 c13131 = new C13131();
        int[][] iArrM30035 = c13131.m30035(iArr, iArr2);
        int[] iArr3 = iArrM30035[0];
        if (iArr3.length == 0 && iArrM30035[1].length == 0) {
            c13542.m30832(iArr.length, iArr2.length);
            return c13542.m30830();
        }
        try {
            int[] iArr4 = iArrM30035[1];
            C9518 c9518 = new C9518(iArr3, iArr4, 0, iArr3.length, 0, iArr4.length, new BitSet(iArr3.length), new BitSet(iArr4.length));
            c9518.m22140();
            bitSetArrM9205 = c9518.m22141();
        } catch (C15552 unused) {
            C4413 c4413 = new C4413(iArrM30035[0], iArrM30035[1]);
            c4413.m9204();
            bitSetArrM9205 = c4413.m9205();
            System.out.println("Successful fallback to patience diff");
        }
        c13131.m30034(bitSetArrM9205, c13542);
        return c13542.m30830();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8177 m53607(int[] iArr, int[] iArr2) {
        int iMin = Math.min(iArr.length, iArr2.length);
        int i = 0;
        for (int i2 = 0; i2 < iMin && iArr[i2] == iArr2[i2]; i2++) {
            i++;
        }
        int iMin2 = Math.min(iArr.length, iArr2.length) - i;
        int i3 = 0;
        for (int i4 = 0; i4 < iMin2 && iArr[(iArr.length - i4) - 1] == iArr2[(iArr2.length - i4) - 1]; i4++) {
            i3++;
        }
        C3429 c3429M53606 = m53606(iArr.length, iArr2.length, i, i3);
        if (c3429M53606 != null) {
            return (C8177) c3429M53606.m6083();
        }
        boolean z = (i == 0 && i3 == 0) ? false : true;
        if (z) {
            iArr = Arrays.copyOfRange(iArr, i, iArr.length - i3);
        }
        if (z) {
            iArr2 = Arrays.copyOfRange(iArr2, i, iArr2.length - i3);
        }
        return m53608(iArr, iArr2, new C13542(i));
    }
}
