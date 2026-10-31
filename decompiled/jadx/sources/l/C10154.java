package l;

/* JADX INFO: renamed from: l.ۤ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10154 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 f30535;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8743 f30536;

    public C10154(C8743 c8743, C18621 c18621) {
        this.f30536 = c8743;
        this.f30535 = c18621;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0030  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25491(C8743 c8743, C18621 c18621) {
        int iM43177 = c18621.m43177();
        if (iM43177 != 200 && iM43177 != 410 && iM43177 != 414 && iM43177 != 501 && iM43177 != 203 && iM43177 != 204) {
            if (iM43177 == 307) {
                if (c18621.m43169("Expires") == null && c18621.m43176().m27427() == -1 && !c18621.m43176().m27425() && !c18621.m43176().m27423()) {
                    return false;
                }
            } else if (iM43177 != 308 && iM43177 != 404 && iM43177 != 405) {
                switch (iM43177) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (c18621.m43169("Expires") == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return (c18621.m43176().m27424() || c8743.m22617().m27424()) ? false : true;
    }
}
