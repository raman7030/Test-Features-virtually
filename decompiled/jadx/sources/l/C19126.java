package l;

/* JADX INFO: renamed from: l.᩵֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IH */
/* JADX INFO: loaded from: classes4.dex */
public final class C19126 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f60276;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19126 m44156(C17714 c17714) {
        String str;
        c17714.m41478(2);
        int iM41456 = c17714.m41456();
        int i = iM41456 >> 1;
        int iM41457 = ((c17714.m41456() >> 3) & 31) | ((iM41456 & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbM15339 = C5368.m15339(str);
        sbM15339.append(i < 10 ? ".0" : ".");
        sbM15339.append(i);
        sbM15339.append(iM41457 < 10 ? ".0" : ".");
        sbM15339.append(iM41457);
        return new C19126(sbM15339.toString());
    }

    public C19126(String str) {
        this.f60276 = str;
    }
}
