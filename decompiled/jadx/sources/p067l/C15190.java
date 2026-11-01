package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15190 implements InterfaceC12628 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f43350;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f43351;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f43352;

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
        return C3910.m7732(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
        return C3910.m7733(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    public final C9667 negate() {
        C7933 c7933 = C16057.f47257;
        return C9667.m22548(this);
    }

    public C15190(int[] iArr, int[] iArr2, int[] iArr3) {
        this.f43352 = iArr;
        this.f43350 = iArr2;
        this.f43351 = iArr3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC12628 m34625(ArrayList arrayList, boolean z) {
        int[] iArr;
        int iMax = 0;
        if (arrayList.size() == 1) {
            int[] iArr2 = (int[]) arrayList.get(0);
            iArr = new int[]{iArr2[0], iArr2[1]};
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList);
            C8150.sort(arrayList2, new C23908());
            ArrayList arrayList3 = new ArrayList();
            int[] iArr3 = (int[]) ((int[]) arrayList2.get(0)).clone();
            for (int i = 1; i < arrayList2.size(); i++) {
                int[] iArr4 = (int[]) arrayList2.get(i);
                int i2 = iArr4[0];
                int i3 = iArr3[1];
                if (i2 <= i3 + 1) {
                    iArr3[1] = Math.max(i3, iArr4[1]);
                } else {
                    arrayList3.add(iArr3);
                    iArr3 = (int[]) iArr4.clone();
                }
            }
            arrayList3.add(iArr3);
            int[] iArr5 = new int[arrayList3.size() * 2];
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                int i5 = i4 * 2;
                iArr5[i5] = ((int[]) arrayList3.get(i4))[0];
                iArr5[i5 + 1] = ((int[]) arrayList3.get(i4))[1];
            }
            iArr = iArr5;
        }
        for (int i6 = 1; i6 < iArr.length; i6 += 2) {
            iMax = Math.max(iMax, iArr[i6]);
        }
        int[] iArrM34628 = m34628(C16057.f47256, iArr);
        int[] iArrM34629 = iMax >= 65536 ? m34628(C5133.f12067, iArr) : null;
        if (iMax < 65536 && !z && !C6474.f16725) {
            return new C7815(iArr, iArrM34628);
        }
        return new C15190(iArr, iArrM34628, iArrM34629);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m34628(int[] iArr, int[] iArr2) {
        int[] iArrCopyOf = new int[64];
        int i = 0;
        for (int i2 : iArr) {
            if (!m34626(i2, iArr2)) {
                int upperCase = Character.toUpperCase(i2);
                if (m34626(upperCase, iArr2) || m34626(Character.toLowerCase(upperCase), iArr2)) {
                    if (i == iArrCopyOf.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
                    }
                    iArrCopyOf[i] = i2;
                    i++;
                }
            }
        }
        return Arrays.copyOf(iArrCopyOf, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m34626(int i, int[] iArr) {
        int length = (iArr.length / 2) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = i3 * 2;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            if (i < i5) {
                length = i3 - 1;
            } else {
                if (i <= i6) {
                    return true;
                }
                i2 = i3 + 1;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        int[] iArr = this.f43352;
        if (m34626(i, iArr)) {
            return true;
        }
        if (i < 65536) {
            return m34627(this.f43350, i);
        }
        int[] iArr2 = this.f43351;
        if (iArr2 != null) {
            return m34627(iArr2, i);
        }
        int upperCase = Character.toUpperCase(i);
        return m34626(upperCase, iArr) || m34626(Character.toLowerCase(upperCase), iArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m34627(int[] iArr, int i) {
        if (iArr.length > 16) {
            return Arrays.binarySearch(iArr, i) >= 0;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
            if (i2 > i) {
                return false;
            }
        }
        return false;
    }
}
