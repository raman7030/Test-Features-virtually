package p067l;

/* JADX INFO: renamed from: l.۫᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14394 {

    /* JADX INFO: renamed from: ֫ */
    public final int f41137;

    /* JADX INFO: renamed from: ۧ */
    public final int f41138;

    /* JADX INFO: renamed from: ܳ */
    public final int f41139;

    /* JADX INFO: renamed from: ܽ */
    public final int f41140;

    /* JADX INFO: renamed from: ܿ */
    public final int f41141;

    /* JADX INFO: renamed from: ᩳ */
    public final int f41142;

    public C14394(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f41137 = i;
        this.f41138 = i2;
        this.f41140 = i3;
        this.f41141 = i4;
        this.f41142 = i5;
        this.f41139 = i6;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14394 m33010(C11319 c11319) {
        int length;
        int length2;
        int i;
        int length3;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = c11319.f31519;
        String str2 = c11319.f31518;
        if (str2 == null) {
            str2 = "";
        }
        if (!"dex_field".equals(str)) {
            if ("dex_method".equals(str)) {
                int iIndexOf = str2.indexOf(40);
                int iIndexOf2 = iIndexOf >= 0 ? str2.indexOf(41, iIndexOf + 1) : -1;
                int length4 = iIndexOf >= 0 ? iIndexOf : str2.length();
                int length5 = iIndexOf >= 0 ? iIndexOf + 1 : str2.length();
                int length6 = iIndexOf2 >= 0 ? iIndexOf2 : str2.length();
                i = length5;
                length3 = iIndexOf2 >= 0 ? iIndexOf2 + 1 : str2.length();
                i2 = length4;
                i3 = length6;
                i4 = 0;
                i5 = 0;
            } else {
                length = 0;
                length2 = 0;
            }
            return new C14394(i4, i5, i2, i, i3, length3);
        }
        int iIndexOf3 = str2.indexOf(58);
        length = iIndexOf3 >= 0 ? iIndexOf3 : str2.length();
        length2 = iIndexOf3 >= 0 ? iIndexOf3 + 1 : str2.length();
        i5 = length2;
        i4 = length;
        i2 = 0;
        i = 0;
        i3 = 0;
        length3 = 0;
        return new C14394(i4, i5, i2, i, i3, length3);
    }
}
