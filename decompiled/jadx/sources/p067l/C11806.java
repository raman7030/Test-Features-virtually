package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L8ZE */
/* JADX INFO: loaded from: classes3.dex */
public final class C11806 {

    /* JADX INFO: renamed from: ֫ */
    public static final Map f32962;

    /* JADX INFO: renamed from: ֫ */
    public static String m27055(String str) {
        int i;
        if (str.startsWith(C0233a.f1084p) && str.endsWith(C0249l.f1196b)) {
            String strM38720 = C17073.m38720(1, 1, str);
            if (strM38720.startsWith("#")) {
                String strSubstring = strM38720.substring(1);
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
            String str2 = (String) f32962.get(strM38720);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C11806.class.getResourceAsStream("/org/commonmark/internal/util/entities.txt"), StandardCharsets.UTF_8));
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
                        f32962 = map;
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
