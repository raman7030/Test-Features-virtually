package p067l;

/* JADX INFO: renamed from: l.᩵֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IH */
/* JADX INFO: loaded from: classes4.dex */
public final class C20545 {

    /* JADX INFO: renamed from: ֫ */
    public final String f63508;

    /* JADX INFO: renamed from: ֫ */
    public static C20545 m46450(C19203 c19203) {
        String str;
        c19203.m43724(2);
        int iM43702 = c19203.m43702();
        int i = iM43702 >> 1;
        int iM43703 = ((c19203.m43702() >> 3) & 31) | ((iM43702 & 1) << 5);
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
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(i < 10 ? ".0" : ".");
        sbM17248.append(i);
        sbM17248.append(iM43703 < 10 ? ".0" : ".");
        sbM17248.append(iM43703);
        return new C20545(sbM17248.toString());
    }

    public C20545(String str) {
        this.f63508 = str;
    }
}
