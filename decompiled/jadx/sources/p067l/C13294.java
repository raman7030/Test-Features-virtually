package p067l;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91T6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13294 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f37343;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f37344;

    /* JADX INFO: renamed from: ܽ */
    public static String f37345;

    /* JADX INFO: renamed from: ֫ */
    public static void m30368() {
        f37343 = true;
        if (!f37344 && C11164.m25781()) {
            C19210.m43753();
            Iterator it = C19210.f57404.iterator();
            while (it.hasNext()) {
                if (((C12505) it.next()).f35054.equals("/system")) {
                    return;
                }
            }
            try {
                Process processExec = Runtime.getRuntime().exec("magisk -v");
                if (C24711.m54350(processExec, 200L) && processExec.exitValue() == 0 && !C23461.m52175(processExec.getInputStream(), Charset.defaultCharset()).toLowerCase().contains("lite")) {
                    if (C18524.m42109("/sbin/.magisk/mirror/system_root/system", new String[0]).mo25094()) {
                        f37344 = true;
                        f37345 = "/sbin/.magisk/mirror/system_root/system";
                        C23770.m52825(new C7929(0));
                    } else if (C18524.m42109("/sbin/.magisk/mirror/system", new String[0]).mo25094()) {
                        f37344 = true;
                        f37345 = "/sbin/.magisk/mirror/system";
                        C23770.m52825(new C7929(0));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m30367(String str) {
        if (!f37343) {
            m30368();
        }
        if (!f37344) {
            return str;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.equals("/system") && !lowerCase.startsWith("/system/")) {
            return str;
        }
        return f37345 + str.substring(7);
    }
}
