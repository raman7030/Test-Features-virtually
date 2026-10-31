package l;

import android.net.Uri;
import com.alipay.sdk.m.n.b;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۜܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y739 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6909 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18702(String str) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m18704(String str, String str2) {
        String strM18702;
        if (str.startsWith("/") && str.endsWith("/") && str.indexOf(0) == -1 && str.indexOf(92) == -1 && (strM18702 = m18702(str2)) != null && !strM18702.isEmpty()) {
            return str.concat(strM18702);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m18701(String str, String str2) {
        String strM18702 = m18702(str2);
        if (strM18702 == null || strM18702.isEmpty()) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        Uri.Builder builderAuthority = new Uri.Builder().scheme(b.a).authority(str);
        int i = 0;
        while (i < strM18702.length()) {
            int iIndexOf = strM18702.indexOf(47, i);
            if (iIndexOf == -1) {
                iIndexOf = strM18702.length();
            }
            builderAuthority.appendPath(strM18702.substring(i, iIndexOf));
            i = iIndexOf + 1;
        }
        return builderAuthority.build();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18703(Uri uri, String str) {
        return uri != null && b.a.equalsIgnoreCase(uri.getScheme()) && str.equalsIgnoreCase(uri.getAuthority());
    }
}
