package p067l;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G73R */
/* JADX INFO: loaded from: classes2.dex */
public final class C2742 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f4619 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m4279() {
        this.f4619.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4280(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            str2 = str.substring(0, iLastIndexOf + 1) + str2;
        }
        boolean zEquals = str.equals(str2);
        HashMap map = this.f4619;
        if (zEquals) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m4281(String str, String str2) throws IOException {
        int i = 0;
        String strM42103 = C18524.m42103(str, false);
        String strM42124 = C18524.m42124(strM42103, str2);
        int iLastIndexOf = strM42103.lastIndexOf(47);
        String str3 = (String) this.f4619.get(C18524.m42103(iLastIndexOf == -1 ? strM42124 : strM42103.substring(0, iLastIndexOf + 1) + strM42124, true));
        if (str3 == null) {
            return strM42124;
        }
        String strM42104 = C18524.m42103(str3, true);
        int iLastIndexOf2 = strM42103.lastIndexOf(47);
        String strSubstring = iLastIndexOf2 == -1 ? "" : strM42103.substring(0, iLastIndexOf2);
        String[] strArrSplit = strSubstring.isEmpty() ? new String[0] : strSubstring.split("/");
        String[] strArrSplit2 = strM42104.isEmpty() ? new String[0] : strM42104.split("/");
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
