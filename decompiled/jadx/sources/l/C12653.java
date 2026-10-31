package l;

/* JADX INFO: renamed from: l.۫᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12653 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f38109;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f38110;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f38111;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38112;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f38113;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f38114;

    public C12653(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f38109 = i;
        this.f38110 = i2;
        this.f38112 = i3;
        this.f38113 = i4;
        this.f38114 = i5;
        this.f38111 = i6;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12653 m30932(C9418 c9418) {
        int length;
        int length2;
        int i;
        int length3;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = c9418.f28572;
        String str2 = c9418.f28571;
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
            return new C12653(i4, i5, i2, i, i3, length3);
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
        return new C12653(i4, i5, i2, i, i3, length3);
    }
}
