package l;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.֨֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64F5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0799 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2925 = 0;

    static {
        C11816.m28900("\"\\");
        C11816.m28900("\t ,=");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m3017(C18621 c18621) {
        String strM26137 = c18621.m43180().m26137("Content-Length");
        if (strM26137 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM26137);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m3018(C10338 c10338) {
        Set treeSet = Collections.EMPTY_SET;
        int iM26139 = c10338.m26139();
        for (int i = 0; i < iM26139; i++) {
            if ("Vary".equalsIgnoreCase(c10338.m26136(i))) {
                String strM26140 = c10338.m26140(i);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strM26140.split(",")) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3019(C18621 c18621) {
        if (c18621.m43168().m22620().equals("HEAD")) {
            return false;
        }
        int iM43177 = c18621.m43177();
        return (((iM43177 >= 100 && iM43177 < 200) || iM43177 == 204 || iM43177 == 304) && m3017(c18621) == -1 && !"chunked".equalsIgnoreCase(c18621.m43169("Transfer-Encoding"))) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3016(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3015(int i, String str) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
