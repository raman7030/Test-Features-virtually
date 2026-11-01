package p067l;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.֨֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64F5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3127 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f5696 = 0;

    static {
        C13598.m30949("\"\\");
        C13598.m30949("\t ,=");
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m5330(C20066 c20066) {
        String strM28162 = c20066.m45446().m28162("Content-Length");
        if (strM28162 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM28162);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Set m5331(C12194 c12194) {
        Set treeSet = Collections.EMPTY_SET;
        int iM28164 = c12194.m28164();
        for (int i = 0; i < iM28164; i++) {
            if ("Vary".equalsIgnoreCase(c12194.m28161(i))) {
                String strM28165 = c12194.m28165(i);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strM28165.split(",")) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m5332(C20066 c20066) {
        if (c20066.m45434().m24589().equals("HEAD")) {
            return false;
        }
        int iM45443 = c20066.m45443();
        return (((iM45443 >= 100 && iM45443 < 200) || iM45443 == 204 || iM45443 == 304) && m5330(c20066) == -1 && !"chunked".equalsIgnoreCase(c20066.m45435("Transfer-Encoding"))) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m5329(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m5328(int i, String str) {
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
