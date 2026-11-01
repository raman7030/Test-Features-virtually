package p067l;

/* JADX INFO: renamed from: l.᩻ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BCI */
/* JADX INFO: loaded from: classes.dex */
public final class C24794 {

    /* JADX INFO: renamed from: ֫ */
    public static final C24794 f79245 = new C24794();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m54473(C5348 c5348, C22783 c22783, C22783 c22784) {
        if (c22783.getType() == C9566.f26325) {
            if (!(c22784.m50974() instanceof C4873)) {
                if ((c22783.m50974() instanceof C4873) && c5348.m11605() == 15) {
                    C4873 c4873 = (C4873) c22783.m50974();
                    c4873.getClass();
                    int iMo4598 = c4873.mo4598();
                    return ((short) iMo4598) == iMo4598;
                }
            } else {
                C4873 c4874 = (C4873) c22784.m50974();
                switch (c5348.m11605()) {
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                        c4874.getClass();
                        int iMo4599 = c4874.mo4598();
                        if (((short) iMo4599) == iMo4599) {
                            return true;
                        }
                        break;
                    case 15:
                        int iMo45910 = C4873.m10335(-c4874.mo4598()).mo4598();
                        return ((short) iMo45910) == iMo45910;
                    case 23:
                    case 24:
                    case 25:
                        c4874.getClass();
                        int iMo45911 = c4874.mo4598();
                        if (((byte) iMo45911) == iMo45911) {
                            return true;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
