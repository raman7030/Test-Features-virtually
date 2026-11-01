package p067l;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6252 extends AbstractC7593 {
    /* JADX INFO: renamed from: ֫ */
    public abstract Pair mo14188(C4911 c4911, int[][][] iArr, int[] iArr2, C17474 c17474, AbstractC6974 abstractC6974);

    @Override // p067l.AbstractC7593
    /* JADX INFO: renamed from: ֫ */
    public final void mo14190(Object obj) {
    }

    @Override // p067l.AbstractC7593
    /* JADX INFO: renamed from: ֫ */
    public final C3569 mo14189(InterfaceC19537[] interfaceC19537Arr, C8243 c8243, C17474 c17474, AbstractC6974 abstractC6974) {
        boolean z;
        int[] iArr;
        C8243 c8244 = c8243;
        int[] iArr2 = new int[interfaceC19537Arr.length + 1];
        int length = interfaceC19537Arr.length + 1;
        C15020[][] c15020Arr = new C15020[length][];
        int[][][] iArr3 = new int[interfaceC19537Arr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = c8244.f21837;
            c15020Arr[i] = new C15020[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = interfaceC19537Arr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = interfaceC19537Arr[i3].mo16265();
        }
        int i4 = 0;
        while (i4 < c8244.f21837) {
            C15020 c15020M19034 = c8244.m19034(i4);
            int i5 = c15020M19034.f42920;
            int i6 = c15020M19034.f42921;
            boolean z2 = i5 == 5;
            int length3 = interfaceC19537Arr.length;
            int i7 = 0;
            int i8 = 0;
            boolean z3 = true;
            while (i7 < interfaceC19537Arr.length) {
                InterfaceC19537 interfaceC19537 = interfaceC19537Arr[i7];
                int iMax = 0;
                int i9 = 0;
                while (i9 < i6) {
                    iMax = Math.max(iMax, interfaceC19537.mo18494(c15020M19034.m34395(i9)) & 7);
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
            if (length3 == interfaceC19537Arr.length) {
                iArr = new int[i6];
            } else {
                InterfaceC19537 interfaceC19538 = interfaceC19537Arr[length3];
                int[] iArr7 = new int[i6];
                for (int i10 = 0; i10 < i6; i10++) {
                    iArr7[i10] = interfaceC19538.mo18494(c15020M19034.m34395(i10));
                }
                iArr = iArr7;
            }
            int i11 = iArr2[length3];
            c15020Arr[length3][i11] = c15020M19034;
            iArr3[length3][i11] = iArr;
            iArr2[length3] = i11 + 1;
            i4++;
            c8244 = c8243;
            iArr4 = iArr6;
        }
        int[] iArr8 = iArr4;
        C8243[] c8243Arr = new C8243[interfaceC19537Arr.length];
        String[] strArr = new String[interfaceC19537Arr.length];
        int[] iArr9 = new int[interfaceC19537Arr.length];
        for (int i12 = 0; i12 < interfaceC19537Arr.length; i12++) {
            int i13 = iArr2[i12];
            c8243Arr[i12] = new C8243((C15020[]) C5792.m13009(i13, c15020Arr[i12]));
            iArr3[i12] = (int[][]) C5792.m13009(i13, iArr3[i12]);
            strArr[i12] = interfaceC19537Arr[i12].getName();
            iArr9[i12] = ((AbstractC7054) interfaceC19537Arr[i12]).mo8290();
        }
        C4911 c4911 = new C4911(iArr9, c8243Arr, iArr8, iArr3, new C8243((C15020[]) C5792.m13009(iArr2[interfaceC19537Arr.length], c15020Arr[interfaceC19537Arr.length])));
        Pair pairMo14188 = mo14188(c4911, iArr3, iArr8, c17474, abstractC6974);
        InterfaceC20334[] interfaceC20334Arr = (InterfaceC20334[]) pairMo14188.second;
        List[] listArr = new List[interfaceC20334Arr.length];
        for (int i14 = 0; i14 < interfaceC20334Arr.length; i14++) {
            InterfaceC20334 interfaceC20334 = interfaceC20334Arr[i14];
            listArr[i14] = interfaceC20334 != null ? AbstractC16192.m36873of((Object) interfaceC20334) : AbstractC16192.m36872of();
        }
        C4123 c4123 = new C4123();
        for (int i15 = 0; i15 < c4911.m10416(); i15++) {
            C8243 c8243M10421 = c4911.m10421(i15);
            List list = listArr[i15];
            for (int i16 = 0; i16 < c8243M10421.f21837; i16++) {
                C15020 c15020M19035 = c8243M10421.m19034(i16);
                boolean z5 = c4911.m10418(i15, i16) != 0;
                int i17 = c15020M19035.f42921;
                int[] iArr10 = new int[i17];
                boolean[] zArr = new boolean[i17];
                for (int i18 = 0; i18 < c15020M19035.f42921; i18++) {
                    iArr10[i18] = c4911.m10419(i15, i16, i18);
                    int i19 = 0;
                    while (true) {
                        if (i19 >= list.size()) {
                            z = false;
                            break;
                        }
                        InterfaceC20334 interfaceC20335 = (InterfaceC20334) list.get(i19);
                        if (interfaceC20335.mo4759().equals(c15020M19035) && interfaceC20335.indexOf(i18) != -1) {
                            z = true;
                            break;
                        }
                        i19++;
                    }
                    zArr[i18] = z;
                }
                c4123.m18184(new C24408(c15020M19035, z5, iArr10, zArr));
            }
        }
        C8243 c8243M10420 = c4911.m10420();
        for (int i20 = 0; i20 < c8243M10420.f21837; i20++) {
            C15020 c15020M19036 = c8243M10420.m19034(i20);
            int[] iArr11 = new int[c15020M19036.f42921];
            Arrays.fill(iArr11, 0);
            c4123.m18184(new C24408(c15020M19036, false, iArr11, new boolean[c15020M19036.f42921]));
        }
        return new C3569((C18866[]) pairMo14188.first, (InterfaceC11617[]) pairMo14188.second, new C15690(c4123.m8329()), c4911);
    }
}
