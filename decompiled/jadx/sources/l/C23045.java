package l;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩺ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23045 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6112 m51216(Object[] objArr, Object[] objArr2) {
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
        C1116 c1116M51213 = m51213(objArr.length, objArr2.length, i, i3);
        if (c1116M51213 != null) {
            return (C6112) c1116M51213.m3826();
        }
        C10346 c10346 = new C10346(((objArr.length + objArr2.length) - (i * 2)) - (i3 * 2));
        return m51215(c10346.m26147(i, i3, objArr), c10346.m26147(i, i3, objArr2), new C11757(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1116 m51213(int i, int i2, int i3, int i4) {
        int i5 = (i - i3) - i4;
        int i6 = (i2 - i3) - i4;
        if (i5 == 0 || i6 == 0) {
            return new C1116((i5 == 0 && i6 == 0) ? null : new C6112(i3, i3, i5, i6));
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6112 m51215(int[] iArr, int[] iArr2, C11757 c11757) throws C13872 {
        BitSet[] bitSetArrM7110;
        C11324 c11324 = new C11324();
        int[][] iArrM27974 = c11324.m27974(iArr, iArr2);
        int[] iArr3 = iArrM27974[0];
        if (iArr3.length == 0 && iArrM27974[1].length == 0) {
            c11757.m28785(iArr.length, iArr2.length);
            return c11757.m28783();
        }
        try {
            int[] iArr4 = iArrM27974[1];
            C7523 c7523 = new C7523(iArr3, iArr4, 0, iArr3.length, 0, iArr4.length, new BitSet(iArr3.length), new BitSet(iArr4.length));
            c7523.m20164();
            bitSetArrM7110 = c7523.m20165();
        } catch (C13872 unused) {
            C2151 c2151 = new C2151(iArrM27974[0], iArrM27974[1]);
            c2151.m7109();
            bitSetArrM7110 = c2151.m7110();
            System.out.println("Successful fallback to patience diff");
        }
        c11324.m27973(bitSetArrM7110, c11757);
        return c11757.m28783();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6112 m51214(int[] iArr, int[] iArr2) {
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
        C1116 c1116M51213 = m51213(iArr.length, iArr2.length, i, i3);
        if (c1116M51213 != null) {
            return (C6112) c1116M51213.m3826();
        }
        boolean z = (i == 0 && i3 == 0) ? false : true;
        if (z) {
            iArr = Arrays.copyOfRange(iArr, i, iArr.length - i3);
        }
        if (z) {
            iArr2 = Arrays.copyOfRange(iArr2, i, iArr2.length - i3);
        }
        return m51215(iArr, iArr2, new C11757(i));
    }
}
