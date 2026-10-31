package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۖܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2629 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23795 f8298;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f8299;

    public C2629(C17760 c17760, C23795 c23795) {
        this.f8299 = c17760;
        this.f8298 = c23795;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16033 m8286(String str, boolean z, String str2, int i, String str3, C8979 c8979) throws C3059 {
        m8282();
        C11459 c11459M8280 = c8979.f27281.isEmpty() ? null : m8280(c8979.f27281, "namePattern", c8979.f27280, c8979.f27287, false);
        C11459 c11459M8281 = c8979.f27282.isEmpty() ? null : m8280(c8979.f27282, "contentPattern", c8979.f27284, c8979.f27278, true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayArray = JSON.array();
        C18151 c18151M52476 = this.f8298.m52476(str, z, str2, i, str3, new C20974(this, c11459M8280, c8979, linkedHashMap, jSONArrayArray, c11459M8281));
        JSONArray jSONArrayArray2 = JSON.array();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONArrayArray2.add(JSON.object().add("reason", (String) entry.getKey()).add("count", ((Integer) entry.getValue()).intValue()));
        }
        return new C16033(c18151M52476, jSONArrayArray2, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8283(JSONArray jSONArray, C12619 c12619, String str) {
        if (jSONArray.size() < 20) {
            jSONArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c12619.m30882().mo23554()).add("reason", str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11459 m8280(String str, String str2, boolean z, boolean z2, boolean z3) throws C3059 {
        int i;
        if (z) {
            i = z3 ? 8 : 0;
        } else {
            i = 16;
        }
        if (!z2) {
            i |= 66;
        }
        try {
            return C11459.m28259(i, str);
        } catch (PatternSyntaxException e) {
            throw C3059.m9364("Invalid regular expression: " + e.getDescription(), str2, JSON.value(str), JSON.array(), JSON.object().add(str2, ""));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8284(LinkedHashMap linkedHashMap, String str) {
        C13843.merge(linkedHashMap, str, 1, new C10697());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8282() {
        if (Thread.currentThread().isInterrupted()) {
            throw C3059.m9365("FILE_SEARCH_CANCELED", "The file search was canceled. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8285(InputStream inputStream, C11459 c11459) throws C3059, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new C9685(inputStream));
        bufferedInputStream.mark(32768);
        byte[] bArrCopyOf = new byte[32768];
        int i = 0;
        while (i < 32768) {
            int i2 = bufferedInputStream.read(bArrCopyOf, i, 32768 - i);
            if (i2 < 0) {
                break;
            }
            if (i2 == 0) {
                int i3 = bufferedInputStream.read();
                if (i3 < 0) {
                    break;
                }
                bArrCopyOf[i] = (byte) i3;
                i++;
            } else {
                i += i2;
            }
        }
        if (i < 32768) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i);
        }
        C17095 c17095M33920 = C14272.m33920("", bArrCopyOf);
        bufferedInputStream.reset();
        for (int i4 = 0; i4 < c17095M33920.f52401; i4++) {
            if (bufferedInputStream.read() < 0) {
                throw new IOException("File ended inside its BOM.");
            }
        }
        CharsetDecoder charsetDecoderNewDecoder = c17095M33920.f52402.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C4131 c4131 = new C4131(inputStreamReader);
            try {
                boolean zM12410 = c4131.m12410(c11459, new C10650(1), true);
                c4131.close();
                inputStreamReader.close();
                return zM12410;
            } catch (Throwable th) {
                try {
                    c4131.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                inputStreamReader.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
