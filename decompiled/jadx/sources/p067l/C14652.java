package p067l;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.۬ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9B5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14652 {
    /* JADX INFO: renamed from: ֫ */
    public static String m33522(boolean z) {
        String string = C7050.f18355.getString("custom_su_command", null);
        if (string != null) {
            string = string.trim();
        }
        if (string != null && string.length() > 0) {
            if (string.equals("magisk su")) {
                try {
                    String strM33521 = m33521("magisk su -h");
                    StringBuilder sb = new StringBuilder(string);
                    if (z && strM33521.contains("--interactive")) {
                        sb.append(" --interactive");
                    }
                    if (strM33521.contains("--target")) {
                        sb.append(" --target 1");
                        return sb.toString();
                    }
                    if (strM33521.contains("--mount-master")) {
                        sb.append(" --mount-master");
                        return sb.toString();
                    }
                } catch (Throwable unused) {
                }
            } else if (string.contains("-")) {
                return string;
            }
        }
        if (string == null || string.isEmpty()) {
            string = "su";
        }
        try {
            String strM33522 = m33521(string.concat(" -h"));
            StringBuilder sb2 = new StringBuilder(string);
            if (z && strM33522.contains("--interactive")) {
                sb2.append(" --interactive");
            }
            if (strM33522.contains("--target")) {
                sb2.append(" --target 1");
                return sb2.toString();
            }
            if (strM33522.contains("--mount-master")) {
                sb2.append(" --mount-master");
                return sb2.toString();
            }
            return string;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null && message.contains("Permission denied")) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33521(String str) throws InterruptedException, TimeoutException, IOException {
        Process processExec = Runtime.getRuntime().exec(str);
        long jCurrentTimeMillis = System.currentTimeMillis() + 300;
        while (true) {
            try {
                processExec.exitValue();
                return new String(C2700.m4194(processExec.getInputStream(), 0)).trim();
            } catch (IllegalThreadStateException unused) {
                if (System.currentTimeMillis() > jCurrentTimeMillis) {
                    processExec.destroy();
                    throw new TimeoutException();
                }
                Thread.sleep(1L);
            }
        }
    }
}
