package l;

/* JADX INFO: renamed from: l.ۤ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10502 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f31500 = new int[128];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f31501;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f31502;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795[] f31503;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f31504;

    public C10502(InterfaceC10795[] interfaceC10795Arr, int[] iArr, int i, int i2) {
        this.f31503 = interfaceC10795Arr;
        this.f31504 = iArr;
        this.f31502 = i;
        this.f31501 = i2;
        for (int i3 = 0; i3 < this.f31500.length; i3++) {
            for (int i4 = 0; i4 < interfaceC10795Arr.length; i4++) {
                if (interfaceC10795Arr[i4].mo2465(i3)) {
                    this.f31500[i3] = iArr[i4];
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10502 m26403(C12910 c12910) {
        int i;
        C5855 c5855;
        C5855 c5856;
        C5855 c5857;
        int i2;
        C5855 c5858;
        C0916 c0916;
        C5855 c5859;
        C5855 c58510;
        C0916 c0917;
        int i3;
        if (c12910 == null) {
            return null;
        }
        int i4 = c12910.f38736;
        int i5 = c12910.f38735;
        if (c12910.getClass() != C12910.class || (i = c12910.f38738) < 0 || c12910.f38739 < i || c12910.f38740 < -1 || i5 < 0 || i4 < 0 || i5 == i4 || (c5855 = c12910.f17958) == null || c5855.getClass() != C15026.class || (c5856 = c12910.f38737) == null || c5856.getClass() != C5150.class) {
            return null;
        }
        C5150 c5150 = (C5150) c12910.f38737;
        boolean z = c5150.f16093;
        int i6 = c5150.f16092;
        if (!z || i6 != i5 || (c5857 = c5150.f17958) == null || c5857.getClass() != C11355.class) {
            return null;
        }
        C11355 c11355 = (C11355) c5150.f17958;
        C5855[] c5855Arr = c11355.f33989;
        C5855 c58511 = c11355.f33991;
        if (c5855Arr == null || (i2 = c11355.f33990) < 1 || i2 > c5855Arr.length || c58511 == null || c58511.getClass() != C22643.class || (c5858 = c58511.f17958) == null || c5858.getClass() != C0916.class || c5150.f16094 != (c0916 = (C0916) c58511.f17958) || !c0916.f3504 || c0916.f3502 != 0 || c0916.f3503 != i6 || c0916.f17958 != c12910) {
            return null;
        }
        int i7 = c11355.f33990;
        InterfaceC10795[] interfaceC10795Arr = new InterfaceC10795[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < c11355.f33990; i8++) {
            C5855 c58512 = c11355.f33989[i8];
            if (c58512 == null) {
                return null;
            }
            if (c58512.getClass() != C5150.class && c58512.getClass() != C12765.class) {
                return null;
            }
            C5150 c5151 = (C5150) c58512;
            int i9 = c5151.f16092;
            if (!c5151.f16093 || i9 < 0 || i9 == i5 || i9 == i4 || (c5859 = c5151.f17958) == null || c5859.getClass() != C19822.class) {
                return null;
            }
            C23494 c23494 = (C23494) c5151.f17958;
            if (c23494.f75432 == null || (c58510 = c23494.f17958) == null || c58510.getClass() != C0916.class || c5151.f16094 != (c0917 = (C0916) c23494.f17958) || !c0917.f3504 || c0917.f3503 != i9 || (i3 = c0917.f3502) <= 0 || (i3 & 1) != 0 || c0917.f17958 != c58511) {
                return null;
            }
            interfaceC10795Arr[i8] = c23494.f75432;
            iArr[i8] = i3;
        }
        return new C10502(interfaceC10795Arr, iArr, c12910.f38738, c12910.f38739);
    }
}
