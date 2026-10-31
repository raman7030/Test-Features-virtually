package l;

/* JADX INFO: renamed from: l.֫֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Q8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1487 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5148(InterfaceC7256 interfaceC7256) {
        StringBuilder sb = new StringBuilder(interfaceC7256.size());
        for (int i = 0; i < interfaceC7256.size(); i++) {
            byte bMo19423 = interfaceC7256.mo19423(i);
            if (bMo19423 == 34) {
                sb.append("\\\"");
            } else if (bMo19423 == 39) {
                sb.append("\\'");
            } else if (bMo19423 != 92) {
                switch (bMo19423) {
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
                        if (bMo19423 >= 32 && bMo19423 <= 126) {
                            sb.append((char) bMo19423);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bMo19423 >>> 6) & 3) + 48));
                            sb.append((char) (((bMo19423 >>> 3) & 7) + 48));
                            sb.append((char) ((bMo19423 & 7) + 48));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5147(AbstractC5886 abstractC5886) {
        return m5148(new C22778(abstractC5886));
    }
}
