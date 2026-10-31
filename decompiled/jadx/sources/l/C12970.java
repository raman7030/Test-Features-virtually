package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12970 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38870 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f38871 = AbstractC6079.m16987("\r\n", "\n", "\r");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31535(String str) {
        return f38871.contains(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31532(int i, String str) {
        AbstractC20151 it = f38871.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.startsWith(str2, i)) {
                return str2.length();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31533(String str) {
        AbstractC20151 it = f38871.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.endsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m31534(String str) {
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Iterator m31536(String str) {
        return new C3093(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Iterator m31537(String str) {
        return new C4504(str);
    }
}
