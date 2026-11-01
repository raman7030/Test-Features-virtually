package p067l;

/* JADX INFO: renamed from: l.֫֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Q8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3781 {
    /* JADX INFO: renamed from: ֫ */
    public static String m7390(InterfaceC9264 interfaceC9264) {
        StringBuilder sb = new StringBuilder(interfaceC9264.size());
        for (int i = 0; i < interfaceC9264.size(); i++) {
            byte bMo21389 = interfaceC9264.mo21389(i);
            if (bMo21389 == 34) {
                sb.append("\\\"");
            } else if (bMo21389 == 39) {
                sb.append("\\'");
            } else if (bMo21389 != 92) {
                switch (bMo21389) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo21389 >= 32 && bMo21389 <= 126) {
                            sb.append((char) bMo21389);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bMo21389 >>> 6) & 3) + 48));
                            sb.append((char) (((bMo21389 >>> 3) & 7) + 48));
                            sb.append((char) ((bMo21389 & 7) + 48));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m7389(AbstractC7962 abstractC7962) {
        return m7390(new C24016(abstractC7962));
    }
}
