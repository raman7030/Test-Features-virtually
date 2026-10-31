package l;

/* JADX INFO: renamed from: l.᩻ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BCI */
/* JADX INFO: loaded from: classes.dex */
public final class C23596 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C23596 f76501 = new C23596();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52070(C3135 c3135, C21480 c21480, C21480 c21481) {
        if (c21480.getType() == C7573.f23413) {
            if (!(c21481.m48637() instanceof C2635)) {
                if ((c21480.m48637() instanceof C2635) && c3135.m9562() == 15) {
                    C2635 c2635 = (C2635) c21480.m48637();
                    c2635.getClass();
                    int iMo2231 = c2635.mo2231();
                    return ((short) iMo2231) == iMo2231;
                }
            } else {
                C2635 c2636 = (C2635) c21481.m48637();
                switch (c3135.m9562()) {
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                        c2636.getClass();
                        int iMo2232 = c2636.mo2231();
                        if (((short) iMo2232) == iMo2232) {
                            return true;
                        }
                        break;
                    case 15:
                        int iMo2233 = C2635.m8291(-c2636.mo2231()).mo2231();
                        return ((short) iMo2233) == iMo2233;
                    case 23:
                    case 24:
                    case 25:
                        c2636.getClass();
                        int iMo2234 = c2636.mo2231();
                        if (((byte) iMo2234) == iMo2234) {
                            return true;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
