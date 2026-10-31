package l;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G73R */
/* JADX INFO: loaded from: classes2.dex */
public final class C0393 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f1842 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1887() {
        this.f1842.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1888(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            str2 = str.substring(0, iLastIndexOf + 1) + str2;
        }
        boolean zEquals = str.equals(str2);
        HashMap map = this.f1842;
        if (zEquals) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m1889(String str, String str2) throws IOException {
        int i = 0;
        String strM39860 = C16999.m39860(str, false);
        String strM39881 = C16999.m39881(strM39860, str2);
        int iLastIndexOf = strM39860.lastIndexOf(47);
        String str3 = (String) this.f1842.get(C16999.m39860(iLastIndexOf == -1 ? strM39881 : strM39860.substring(0, iLastIndexOf + 1) + strM39881, true));
        if (str3 == null) {
            return strM39881;
        }
        String strM39861 = C16999.m39860(str3, true);
        int iLastIndexOf2 = strM39860.lastIndexOf(47);
        String strSubstring = iLastIndexOf2 == -1 ? "" : strM39860.substring(0, iLastIndexOf2);
        String[] strArrSplit = strSubstring.isEmpty() ? new String[0] : strSubstring.split("/");
        String[] strArrSplit2 = strM39861.isEmpty() ? new String[0] : strM39861.split("/");
        while (i < strArrSplit.length && i < strArrSplit2.length && strArrSplit[i].equals(strArrSplit2[i])) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = i; i2 < strArrSplit.length; i2++) {
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append("..");
        }
        while (i < strArrSplit2.length) {
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append(strArrSplit2[i]);
            i++;
        }
        return sb.length() == 0 ? "." : sb.toString();
    }
}
