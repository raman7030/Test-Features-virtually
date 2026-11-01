package p067l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6370 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m14577(String str) throws IOException {
        C18724 c18724M16220 = C7050.m16220();
        C11349 c11349 = new C11349();
        c11349.m26292(str);
        C20066 c20066Execute = c18724M16220.m42716(c11349.m26284()).execute();
        if (c20066Execute.m45439()) {
            AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
            if (abstractC2630M45436 == null) {
                throw new IOException("Response body is null");
            }
            return abstractC2630M45436.m4014();
        }
        throw new IOException("Response code: " + c20066Execute.m45443() + "\nMessage: " + c20066Execute.m45437());
    }

    /* JADX INFO: renamed from: ۧ */
    public static HashMap m14578(String str) {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            String strSubstring = null;
            StringBuilder sb = null;
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String strTrim = line.trim();
                    if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
                        if (strSubstring != null) {
                            map.put(strSubstring, sb.toString());
                        }
                        strSubstring = strTrim.substring(1, strTrim.length() - 1);
                        sb = new StringBuilder();
                    } else if (strSubstring != null) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(line);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                return map;
            }
            if (strSubstring != null) {
                map.put(strSubstring, sb.toString());
            }
            bufferedReader.close();
            return map;
        } catch (IOException unused) {
            return map;
        }
    }
}
