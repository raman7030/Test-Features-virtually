package p067l;

/* JADX INFO: renamed from: l.ۚۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UA1Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C7385 extends AbstractC20126 {
    /* JADX INFO: renamed from: ֫ */
    public final String m17108(String str, EnumC2690 enumC2690) {
        int iOrdinal = enumC2690.ordinal();
        int i = 1;
        if (iOrdinal == 0) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            int iIndexOf = str.indexOf(".local.");
            int iLastIndexOf = str.lastIndexOf(45);
            if (iLastIndexOf < 0) {
                sb.append(str.substring(0, iIndexOf));
            } else {
                try {
                    int i2 = Integer.parseInt(str.substring(iLastIndexOf + 1, iIndexOf)) + 1;
                    sb.append(str.substring(0, iLastIndexOf));
                    i = i2;
                } catch (Exception unused) {
                    sb.append(str.substring(0, iIndexOf));
                }
            }
            sb.append('-');
            sb.append(i);
            sb.append(".local.");
            return sb.toString();
        }
        if (iOrdinal != 1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 5);
        int iLastIndexOf2 = str.lastIndexOf(40);
        int iLastIndexOf3 = str.lastIndexOf(41);
        if (iLastIndexOf2 >= 0 && iLastIndexOf2 < iLastIndexOf3) {
            try {
                sb2.append(str.substring(0, iLastIndexOf2));
                sb2.append('(');
                sb2.append(Integer.parseInt(str.substring(iLastIndexOf2 + 1, iLastIndexOf3)) + 1);
                sb2.append(')');
            } catch (NumberFormatException unused2) {
                sb2.setLength(0);
                sb2.append(str);
                sb2.append(" (2)");
            }
        } else {
            sb2.append(str);
            sb2.append(" (2)");
        }
        return sb2.toString();
    }
}
