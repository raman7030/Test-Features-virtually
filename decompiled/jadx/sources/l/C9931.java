package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L8ZE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9931 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Map f30004;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m25038(String str) {
        int i;
        if (str.startsWith(a.p) && str.endsWith(l.b)) {
            String strM36561 = C15472.m36561(1, 1, str);
            if (strM36561.startsWith("#")) {
                String strSubstring = strM36561.substring(1);
                if (strSubstring.startsWith("x") || strSubstring.startsWith("X")) {
                    strSubstring = strSubstring.substring(1);
                    i = 16;
                } else {
                    i = 10;
                }
                try {
                    int i2 = Integer.parseInt(strSubstring, i);
                    return i2 == 0 ? "�" : new String(Character.toChars(i2));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) f30004.get(strM36561);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C9931.class.getResourceAsStream("/org/commonmark/internal/util/entities.txt"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        if (!line.isEmpty()) {
                            int iIndexOf = line.indexOf("=");
                            map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                        }
                    } else {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        f30004 = map;
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                throw new IllegalStateException("Failed reading data for HTML named character references", e);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }
}
