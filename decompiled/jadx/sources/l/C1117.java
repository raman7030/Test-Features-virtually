package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֨۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6RB */
/* JADX INFO: loaded from: classes2.dex */
public final class C1117 implements InterfaceC5403 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18757 f4072;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0185 f4073;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f4074;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4075;

    public C1117(C0185 c0185, C18757 c18757) {
        this.f4073 = c0185;
        this.f4072 = c18757;
    }

    @Override // l.InterfaceC5403
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 mo3833(C21115 c21115, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        Object obj = c21115.f68104;
        C0185 c0185 = this.f4073;
        C7603 c7603 = C7603.f23492;
        if (obj != c0185 || c21115.f68105 != this.f4072 || i3 < 0) {
            return c7603.mo3833(c21115, i, str, i2, i3, i4, i5, i6);
        }
        int i7 = this.f4075;
        this.f4075 = i7 + 1;
        if (str != null || i2 < 0 || i2 > 1 || i < -1 || i > 1073741823) {
            InterfaceC0463 interfaceC0463Mo3833 = c7603.mo3833(c21115, i, str, i2, i3, i4, i5, i6);
            ((C13952) interfaceC0463Mo3833).m33392(i7);
            return interfaceC0463Mo3833;
        }
        return new C5351(this, i3, i4, i7, (i << 1) | i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3829(C1117 c1117, int i) {
        C18757 c18757 = c1117.f4072;
        if (c1117.f4074 == null) {
            int i2 = 1;
            int i3 = 1;
            for (int i4 = 0; i4 < c18757.size(); i4++) {
                if ((i4 & 1023) == 0) {
                    C18757.m43430();
                }
                if (c18757.m43431(i4) == '\n') {
                    i3++;
                }
            }
            int[] iArr = new int[i3];
            for (int i5 = 0; i5 < c18757.size(); i5++) {
                if ((i5 & 1023) == 0) {
                    C18757.m43430();
                }
                if (c18757.m43431(i5) == '\n') {
                    iArr[i2] = i5 + 1;
                    i2++;
                }
            }
            c1117.f4074 = iArr;
        }
        int iBinarySearch = Arrays.binarySearch(c1117.f4074, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 2;
    }
}
