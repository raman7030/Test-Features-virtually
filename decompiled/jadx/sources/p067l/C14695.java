package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C14695 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f41914 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC8146 f41915 = AbstractC8146.m18918("\r\n", "\n", "\r");

    /* JADX INFO: renamed from: ܽ */
    public static boolean m33620(String str) {
        return f41915.contains(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m33617(int i, String str) {
        AbstractC21520 it = f41915.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.startsWith(str2, i)) {
                return str2.length();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33618(String str) {
        AbstractC21520 it = f41915.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.endsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m33619(String str) {
        char cCharAt;
        int i = 0;
        while (i < str.length() && (cCharAt = str.charAt(i)) != '\n') {
            i++;
            if (cCharAt == '\r') {
                return (i >= str.length() || str.charAt(i) != '\n') ? "\r" : "\r\n";
            }
        }
        return "\n";
    }

    /* JADX INFO: renamed from: ܿ */
    public static Iterator m33621(String str) {
        return new C5308(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Iterator m33622(String str) {
        return new C6649(str);
    }
}
