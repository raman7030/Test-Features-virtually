package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4210 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m12701(String str) throws IOException {
        C17209 c17209M14323 = C4925.m14323();
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        C18621 c18621Execute = c17209M14323.m40469(c9449.m24274()).execute();
        if (c18621Execute.m43173()) {
            AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
            if (abstractC0275M43170 == null) {
                throw new IOException("Response body is null");
            }
            return abstractC0275M43170.m1614();
        }
        throw new IOException("Response code: " + c18621Execute.m43177() + "\nMessage: " + c18621Execute.m43171());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m12702(String str) {
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
