package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p037n.C0171b;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۜܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y739 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8935 {
    /* JADX INFO: renamed from: ֫ */
    public static String m20651(String str) {
        if (str != null) {
            int i = 0;
            if (str.indexOf(0) == -1 && str.indexOf(92) == -1) {
                ArrayDeque<String> arrayDeque = new ArrayDeque();
                int length = str.length();
                while (i <= length) {
                    int iIndexOf = str.indexOf(47, i);
                    if (iIndexOf == -1) {
                        iIndexOf = length;
                    }
                    String strSubstring = str.substring(i, iIndexOf);
                    if (!strSubstring.isEmpty() && !strSubstring.equals(".")) {
                        if (strSubstring.equals("..")) {
                            if (arrayDeque.isEmpty()) {
                                return null;
                            }
                            arrayDeque.removeLast();
                        } else {
                            arrayDeque.addLast(strSubstring);
                        }
                    }
                    if (iIndexOf == length) {
                        break;
                    }
                    i = iIndexOf + 1;
                }
                StringBuilder sb = new StringBuilder(str.length());
                for (String str2 : arrayDeque) {
                    if (sb.length() != 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
                return sb.toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m20653(String str, String str2) {
        String strM20651;
        if (str.startsWith("/") && str.endsWith("/") && str.indexOf(0) == -1 && str.indexOf(92) == -1 && (strM20651 = m20651(str2)) != null && !strM20651.isEmpty()) {
            return str.concat(strM20651);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m20650(String str, String str2) {
        String strM20651 = m20651(str2);
        if (strM20651 == null || strM20651.isEmpty()) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        Uri.Builder builderAuthority = new Uri.Builder().scheme(C0171b.f688a).authority(str);
        int i = 0;
        while (i < strM20651.length()) {
            int iIndexOf = strM20651.indexOf(47, i);
            if (iIndexOf == -1) {
                iIndexOf = strM20651.length();
            }
            builderAuthority.appendPath(strM20651.substring(i, iIndexOf));
            i = iIndexOf + 1;
        }
        return builderAuthority.build();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20652(Uri uri, String str) {
        return uri != null && C0171b.f688a.equalsIgnoreCase(uri.getScheme()) && str.equalsIgnoreCase(uri.getAuthority());
    }
}
