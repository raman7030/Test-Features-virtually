package l;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91T6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11496 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f34346;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f34347;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String f34348;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28324() {
        f34346 = true;
        if (!f34347 && C9255.m23780()) {
            C17721.m41507();
            Iterator it = C17721.f54213.iterator();
            while (it.hasNext()) {
                if (((C10666) it.next()).f32083.equals("/system")) {
                    return;
                }
            }
            try {
                Process processExec = Runtime.getRuntime().exec("magisk -v");
                if (C23509.m51948(processExec, 200L) && processExec.exitValue() == 0 && !C22194.m49848(processExec.getInputStream(), Charset.defaultCharset()).toLowerCase().contains("lite")) {
                    if (C16999.m39866("/sbin/.magisk/mirror/system_root/system", new String[0]).mo23120()) {
                        f34347 = true;
                        f34348 = "/sbin/.magisk/mirror/system_root/system";
                        C22518.m50483(new C5851(0));
                    } else if (C16999.m39866("/sbin/.magisk/mirror/system", new String[0]).mo23120()) {
                        f34347 = true;
                        f34348 = "/sbin/.magisk/mirror/system";
                        C22518.m50483(new C5851(0));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28323(String str) {
        if (!f34346) {
            m28324();
        }
        if (!f34347) {
            return str;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.equals("/system") && !lowerCase.startsWith("/system/")) {
            return str;
        }
        return f34348 + str.substring(7);
    }
}
