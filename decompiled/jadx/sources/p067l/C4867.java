package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
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
public final class C4867 {

    /* JADX INFO: renamed from: ֫ */
    public final C24983 f11093;

    /* JADX INFO: renamed from: ۧ */
    public final C19247 f11094;

    public C4867(C19247 c19247, C24983 c24983) {
        this.f11094 = c19247;
        this.f11093 = c24983;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17606 m10330(String str, boolean z, String str2, int i, String str3, C10902 c10902) throws C5276 {
        m10326();
        C13259 c13259M10324 = c10902.f30216.isEmpty() ? null : m10324(c10902.f30216, "namePattern", c10902.f30215, c10902.f30222, false);
        C13259 c13259M10325 = c10902.f30217.isEmpty() ? null : m10324(c10902.f30217, "contentPattern", c10902.f30219, c10902.f30213, true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayArray = JSON.array();
        C19619 c19619M54885 = this.f11093.m54885(str, z, str2, i, str3, new C22302(this, c13259M10324, c10902, linkedHashMap, jSONArrayArray, c13259M10325));
        JSONArray jSONArrayArray2 = JSON.array();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONArrayArray2.add(JSON.object().add("reason", (String) entry.getKey()).add("count", ((Integer) entry.getValue()).intValue()));
        }
        return new C17606(c19619M54885, jSONArrayArray2, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10327(JSONArray jSONArray, C14362 c14362, String str) {
        if (jSONArray.size() < 20) {
            jSONArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c14362.m32959().mo25505()).add("reason", str));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13259 m10324(String str, String str2, boolean z, boolean z2, boolean z3) throws C5276 {
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
            return C13259.m30303(i, str);
        } catch (PatternSyntaxException e) {
            throw C5276.m11406("Invalid regular expression: " + e.getDescription(), str2, JSON.value(str), JSON.array(), JSON.object().add(str2, ""));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10328(LinkedHashMap linkedHashMap, String str) {
        C15525.merge(linkedHashMap, str, 1, new C12535());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10326() {
        if (Thread.currentThread().isInterrupted()) {
            throw C5276.m11407("FILE_SEARCH_CANCELED", "The file search was canceled. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10329(InputStream inputStream, C13259 c13259) throws C5276, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new C11573(inputStream));
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
        C18615 c18615M36053 = C15932.m36053("", bArrCopyOf);
        bufferedInputStream.reset();
        for (int i4 = 0; i4 < c18615M36053.f55584; i4++) {
            if (bufferedInputStream.read() < 0) {
                throw new IOException("File ended inside its BOM.");
            }
        }
        CharsetDecoder charsetDecoderNewDecoder = c18615M36053.f55585.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C6295 c6295 = new C6295(inputStreamReader);
            try {
                boolean zM14300 = c6295.m14300(c13259, new C12490(1), true);
                c6295.close();
                inputStreamReader.close();
                return zM14300;
            } catch (Throwable th) {
                try {
                    c6295.close();
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
