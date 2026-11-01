package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֨۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6RB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3430 implements InterfaceC7503 {

    /* JADX INFO: renamed from: ֫ */
    public final C20195 f6843;

    /* JADX INFO: renamed from: ۧ */
    public final C2544 f6844;

    /* JADX INFO: renamed from: ܽ */
    public int[] f6845;

    /* JADX INFO: renamed from: ᩳ */
    public int f6846;

    public C3430(C2544 c2544, C20195 c20195) {
        this.f6844 = c2544;
        this.f6843 = c20195;
    }

    @Override // p067l.InterfaceC7503
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2808 mo6090(C22436 c22436, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        Object obj = c22436.f70786;
        C2544 c2544 = this.f6844;
        C9594 c9594 = C9594.f26405;
        if (obj != c2544 || c22436.f70787 != this.f6843 || i3 < 0) {
            return c9594.mo6090(c22436, i, str, i2, i3, i4, i5, i6);
        }
        int i7 = this.f6846;
        this.f6846 = i7 + 1;
        if (str != null || i2 < 0 || i2 > 1 || i < -1 || i > 1073741823) {
            InterfaceC2808 interfaceC2808Mo6090 = c9594.mo6090(c22436, i, str, i2, i3, i4, i5, i6);
            ((C15628) interfaceC2808Mo6090).m35511(i7);
            return interfaceC2808Mo6090;
        }
        return new C7454(this, i3, i4, i7, (i << 1) | i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m6086(C3430 c3430, int i) {
        C20195 c20195 = c3430.f6843;
        if (c3430.f6845 == null) {
            int i2 = 1;
            int i3 = 1;
            for (int i4 = 0; i4 < c20195.size(); i4++) {
                if ((i4 & 1023) == 0) {
                    C20195.m45697();
                }
                if (c20195.m45698(i4) == '\n') {
                    i3++;
                }
            }
            int[] iArr = new int[i3];
            for (int i5 = 0; i5 < c20195.size(); i5++) {
                if ((i5 & 1023) == 0) {
                    C20195.m45697();
                }
                if (c20195.m45698(i5) == '\n') {
                    iArr[i2] = i5 + 1;
                    i2++;
                }
            }
            c3430.f6845 = iArr;
        }
        int iBinarySearch = Arrays.binarySearch(c3430.f6845, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 2;
    }
}
