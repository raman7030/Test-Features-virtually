package l;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4086 extends AbstractC5497 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Pair mo12283(C2675 c2675, int[][][] iArr, int[] iArr2, C15894 c15894, AbstractC4846 abstractC4846);

    @Override // l.AbstractC5497
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12285(Object obj) {
    }

    @Override // l.AbstractC5497
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1263 mo12284(InterfaceC18065[] interfaceC18065Arr, C6181 c6181, C15894 c15894, AbstractC4846 abstractC4846) {
        boolean z;
        int[] iArr;
        C6181 c6182 = c6181;
        int[] iArr2 = new int[interfaceC18065Arr.length + 1];
        int length = interfaceC18065Arr.length + 1;
        C13312[][] c13312Arr = new C13312[length][];
        int[][][] iArr3 = new int[interfaceC18065Arr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = c6182.f18978;
            c13312Arr[i] = new C13312[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = interfaceC18065Arr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = interfaceC18065Arr[i3].mo14368();
        }
        int i4 = 0;
        while (i4 < c6182.f18978) {
            C13312 c13312M17102 = c6182.m17102(i4);
            int i5 = c13312M17102.f39853;
            int i6 = c13312M17102.f39854;
            boolean z2 = i5 == 5;
            int length3 = interfaceC18065Arr.length;
            int i7 = 0;
            int i8 = 0;
            boolean z3 = true;
            while (i7 < interfaceC18065Arr.length) {
                InterfaceC18065 interfaceC18065 = interfaceC18065Arr[i7];
                int iMax = 0;
                int i9 = 0;
                while (i9 < i6) {
                    iMax = Math.max(iMax, interfaceC18065.mo16568(c13312M17102.m32295(i9)) & 7);
                    i9++;
                    iArr4 = iArr4;
                }
                int[] iArr5 = iArr4;
                boolean z4 = iArr2[i7] == 0;
                if (iMax > i8 || (iMax == i8 && z2 && !z3 && z4)) {
                    z3 = z4;
                    length3 = i7;
                    i8 = iMax;
                }
                i7++;
                iArr4 = iArr5;
            }
            int[] iArr6 = iArr4;
            if (length3 == interfaceC18065Arr.length) {
                iArr = new int[i6];
            } else {
                InterfaceC18065 interfaceC18066 = interfaceC18065Arr[length3];
                int[] iArr7 = new int[i6];
                for (int i10 = 0; i10 < i6; i10++) {
                    iArr7[i10] = interfaceC18066.mo16568(c13312M17102.m32295(i10));
                }
                iArr = iArr7;
            }
            int i11 = iArr2[length3];
            c13312Arr[length3][i11] = c13312M17102;
            iArr3[length3][i11] = iArr;
            iArr2[length3] = i11 + 1;
            i4++;
            c6182 = c6181;
            iArr4 = iArr6;
        }
        int[] iArr8 = iArr4;
        C6181[] c6181Arr = new C6181[interfaceC18065Arr.length];
        String[] strArr = new String[interfaceC18065Arr.length];
        int[] iArr9 = new int[interfaceC18065Arr.length];
        for (int i12 = 0; i12 < interfaceC18065Arr.length; i12++) {
            int i13 = iArr2[i12];
            c6181Arr[i12] = new C6181((C13312[]) C3603.m11033(i13, c13312Arr[i12]));
            iArr3[i12] = (int[][]) C3603.m11033(i13, iArr3[i12]);
            strArr[i12] = interfaceC18065Arr[i12].getName();
            iArr9[i12] = ((AbstractC4930) interfaceC18065Arr[i12]).mo6092();
        }
        C2675 c2675 = new C2675(iArr9, c6181Arr, iArr8, iArr3, new C6181((C13312[]) C3603.m11033(iArr2[interfaceC18065Arr.length], c13312Arr[interfaceC18065Arr.length])));
        Pair pairMo12283 = mo12283(c2675, iArr3, iArr8, c15894, abstractC4846);
        InterfaceC18903[] interfaceC18903Arr = (InterfaceC18903[]) pairMo12283.second;
        List[] listArr = new List[interfaceC18903Arr.length];
        for (int i14 = 0; i14 < interfaceC18903Arr.length; i14++) {
            InterfaceC18903 interfaceC18903 = interfaceC18903Arr[i14];
            listArr[i14] = interfaceC18903 != null ? AbstractC14545.of((Object) interfaceC18903) : AbstractC14545.of();
        }
        C1846 c1846 = new C1846();
        for (int i15 = 0; i15 < c2675.m8370(); i15++) {
            C6181 c6181M8375 = c2675.m8375(i15);
            List list = listArr[i15];
            for (int i16 = 0; i16 < c6181M8375.f18978; i16++) {
                C13312 c13312M17103 = c6181M8375.m17102(i16);
                boolean z5 = c2675.m8372(i15, i16) != 0;
                int i17 = c13312M17103.f39854;
                int[] iArr10 = new int[i17];
                boolean[] zArr = new boolean[i17];
                for (int i18 = 0; i18 < c13312M17103.f39854; i18++) {
                    iArr10[i18] = c2675.m8373(i15, i16, i18);
                    int i19 = 0;
                    while (true) {
                        if (i19 >= list.size()) {
                            z = false;
                            break;
                        }
                        InterfaceC18903 interfaceC18904 = (InterfaceC18903) list.get(i19);
                        if (interfaceC18904.mo2388().equals(c13312M17103) && interfaceC18904.indexOf(i18) != -1) {
                            z = true;
                            break;
                        }
                        i19++;
                    }
                    zArr[i18] = z;
                }
                c1846.m16264(new C23190(c13312M17103, z5, iArr10, zArr));
            }
        }
        C6181 c6181M8374 = c2675.m8374();
        for (int i20 = 0; i20 < c6181M8374.f18978; i20++) {
            C13312 c13312M17104 = c6181M8374.m17102(i20);
            int[] iArr11 = new int[c13312M17104.f39854];
            Arrays.fill(iArr11, 0);
            c1846.m16264(new C23190(c13312M17104, false, iArr11, new boolean[c13312M17104.f39854]));
        }
        return new C1263((C17359[]) pairMo12283.first, (InterfaceC9731[]) pairMo12283.second, new C14017(c1846.m6131()), c2675);
    }
}
