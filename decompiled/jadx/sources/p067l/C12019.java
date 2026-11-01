package p067l;

/* JADX INFO: renamed from: l.ۤ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FE */
/* JADX INFO: loaded from: classes3.dex */
public final class C12019 {

    /* JADX INFO: renamed from: ֫ */
    public final C20066 f33497;

    /* JADX INFO: renamed from: ۧ */
    public final C10678 f33498;

    public C12019(C10678 c10678, C20066 c20066) {
        this.f33498 = c10678;
        this.f33497 = c20066;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0030  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m27510(C10678 c10678, C20066 c20066) {
        int iM45443 = c20066.m45443();
        if (iM45443 != 200 && iM45443 != 410 && iM45443 != 414 && iM45443 != 501 && iM45443 != 203 && iM45443 != 204) {
            if (iM45443 == 307) {
                if (c20066.m45435("Expires") == null && c20066.m45442().m29489() == -1 && !c20066.m45442().m29487() && !c20066.m45442().m29485()) {
                    return false;
                }
            } else if (iM45443 != 308 && iM45443 != 404 && iM45443 != 405) {
                switch (iM45443) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (c20066.m45435("Expires") == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return (c20066.m45442().m29486() || c10678.m24586().m29486()) ? false : true;
    }
}
