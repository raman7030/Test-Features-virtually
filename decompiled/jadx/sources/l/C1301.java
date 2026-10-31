package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֨ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6Y7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1301 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f4631;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f4632;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17760 f4633;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Read one strict text page from a regular local file while preserving LF, CRLF, and CR exactly. On the first call pass encoding=\"\", targetVersion=\"\", startLine=0, startColumn=0, limit=500, and maxChars=49152. Positions and maxChars count Unicode code points. maxChars must be 2..131072 so a CRLF pair is never split; limit is 1..2000 logical lines touched by the page. An empty encoding selects automatic detection. A non-empty encoding reloads with that exact lowercase token and does not transcode. Copy the returned encoding and targetVersion unchanged into continuation calls.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Read File Text";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_read_text";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4482(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m4483(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    public C1301(C17760 c17760) {
        this.f4633 = c17760;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f4631 == null) {
            this.f4631 = m4489();
        }
        return this.f4631;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f4632 == null) {
            this.f4632 = C1648.m5535("Result for mt_file_read_text.", C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute file path fixed for this call.")).add(TextBundle.TEXT_ENTRY, C1648.m5545("string", "Strictly decoded text with original LF, CRLF, and CR preserved.")).add("encoding", C1648.m5545("string", "Actual lowercase editor encoding token; physical BOM is included in the token.")).add("targetVersion", C1648.m5545("string", "Whole-file raw-byte version as 16 lowercase hex digits.")).add("startLine", C1648.m5545("integer", "Zero-based logical line requested for this page.")).add("startColumn", C1648.m5545("integer", "Zero-based Unicode code-point column requested for this page.")).add("nextLine", C1648.m5545("integer", "Logical line at which a continuation should start.")).add("nextColumn", C1648.m5545("integer", "Unicode code-point column at which a continuation should start.")).add("returnedLineCount", C1648.m5545("integer", "Number of distinct logical lines touched by returned text.")).add("returnedCodePoints", C1648.m5545("integer", "Number of Unicode code points in text, including each CR and LF.")), ClassTransform.BOOLEAN, "Whether decoded text remains at nextLine and nextColumn.", "hasMore", "One original-newline text page bound to a whole-file version."), C3395.m10357("mt_file_read_text"), C1648.m5538("Contains one directly executable continuation when hasMore=true; a version mismatch contains one restart action.", C1648.m5533(m4489(), "mt_file_read_text", "continue"), C1648.m5533(m4489(), "mt_file_read_text", "retry")));
        }
        return this.f4632;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_read_text", c3059);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4487(C12619 c12619, String str) throws C3059 {
        int i = C5535.f17130[c12619.m30885().ordinal()];
        C17760 c17760 = this.f4633;
        if (i == 2) {
            c17760.getClass();
            throw C17760.m41606(str);
        }
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "Directories cannot be read as text.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links cannot be read by the generic text tool.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be read as text.", str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m4488(C12619 c12619, C12619 c126110, long j) {
        if (c126110.m30885() != EnumC3447.REGULAR) {
            return true;
        }
        if (c12619.m30884() < 0 || c12619.m30884() == j) {
            return c126110.m30884() >= 0 && c126110.m30884() != j;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m4484(String str, long j, long j2, C7567 c7567) {
        return C3059.m9365("FILE_OFFSET_OUT_OF_RANGE", "The requested text line and column are outside the file.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "operation", "read_text").add("backendReason", "text_position_out_of_range").add("startLine", j).add("startColumn", j2).add("finalLine", c7567.f23370).add("finalColumn", c7567.f23367));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m4485(String str, String str2) {
        return C3059.m9365("FILE_CHANGED_DURING_READ", "The file changed while its text was being read.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str2).add("operation", "read_text").add("backendReason", "metadata_changed"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m4486(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return C3059.m9365("FILE_TARGET_VERSION_MISMATCH", "The file targetVersion no longer matches the current content.", "warning", JSON.array().add(m4481("retry", "Discard earlier pages and restart from the current file version.", str, str4, str3, i, i2, 0L, 0L)), C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str5).add("operation", "read_text").add("backendReason", "target_version_mismatch").add("expectedTargetVersion", str2).add("actualTargetVersion", str3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m4481(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, long j2) {
        return C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", i).add("maxChars", i2).add("startLine", j).add("startColumn", j2), "mt_file_read_text", str, str2);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m4489() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("encoding", C1648.m5545("string", "Pass \"\" (empty string) for editor-compatible automatic detection, or an exact lowercase token returned by this tool.")).add("targetVersion", C1648.m5545("string", "Pass \"\" (empty string) on the first read; later copy the previous result unchanged.")).add("limit", C1648.m5545("integer", "Maximum logical lines touched, 1..2000; pass 500 by default.")).add("maxChars", C1648.m5545("integer", "Maximum Unicode code points, 2..131072; pass 49152 by default. Minimum 2 keeps CRLF indivisible.")).add("startLine", C1648.m5545("integer", "Zero-based logical line in 0..9007199254740991; pass 0 initially.")), "integer", "Zero-based Unicode code-point column in 0..9007199254740991; pass 0 initially.", "startColumn", "Arguments for mt_file_read_text.");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a5 A[Catch: all -> 0x017b, TryCatch #6 {all -> 0x017b, blocks: (B:22:0x00e2, B:24:0x00fc, B:28:0x015f, B:29:0x0163, B:30:0x0164, B:31:0x016a, B:45:0x0188, B:47:0x018e, B:48:0x0199, B:50:0x01a5, B:52:0x01ad, B:53:0x01c3, B:54:0x01c4, B:55:0x01c8, B:59:0x01cf, B:60:0x01f8, B:57:0x01ca, B:58:0x01ce, B:37:0x0174, B:38:0x017a, B:4:0x007d, B:6:0x0090), top: B:75:0x0076, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ad A[Catch: all -> 0x017b, TryCatch #6 {all -> 0x017b, blocks: (B:22:0x00e2, B:24:0x00fc, B:28:0x015f, B:29:0x0163, B:30:0x0164, B:31:0x016a, B:45:0x0188, B:47:0x018e, B:48:0x0199, B:50:0x01a5, B:52:0x01ad, B:53:0x01c3, B:54:0x01c4, B:55:0x01c8, B:59:0x01cf, B:60:0x01f8, B:57:0x01ca, B:58:0x01ce, B:37:0x0174, B:38:0x017a, B:4:0x007d, B:6:0x0090), top: B:75:0x0076, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01c4 A[Catch: all -> 0x017b, TryCatch #6 {all -> 0x017b, blocks: (B:22:0x00e2, B:24:0x00fc, B:28:0x015f, B:29:0x0163, B:30:0x0164, B:31:0x016a, B:45:0x0188, B:47:0x018e, B:48:0x0199, B:50:0x01a5, B:52:0x01ad, B:53:0x01c3, B:54:0x01c4, B:55:0x01c8, B:59:0x01cf, B:60:0x01f8, B:57:0x01ca, B:58:0x01ce, B:37:0x0174, B:38:0x017a, B:4:0x007d, B:6:0x0090), top: B:75:0x0076, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v0, types: [bin.mt.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [l.ۤۖۜ] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r6v4, types: [l.ۤۖۜ] */
    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws Throwable {
        ?? r28;
        Throwable th;
        int i;
        int i2;
        ?? r14;
        C16534 c16534M41948;
        C5807.m16297(jSONObject, new C0595(), "Unknown file text read argument", MotionUtils.EASING_TYPE_PATH, "encoding", "targetVersion", "limit", "maxChars", "startLine", "startColumn");
        String strM4482 = m4482((JSONObject) jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM4483 = m4482((JSONObject) jSONObject, "encoding");
        String strM4484 = m4482((JSONObject) jSONObject, "targetVersion");
        int iM48626 = (int) C21474.m48626((JSONObject) jSONObject, "limit", 1L, 2000L);
        int iM48627 = (int) C21474.m48626((JSONObject) jSONObject, "maxChars", 2L, 131072L);
        long jM48626 = C21474.m48626((JSONObject) jSONObject, "startLine", 0L, 9007199254740991L);
        long jM48627 = C21474.m48626((JSONObject) jSONObject, "startColumn", 0L, 9007199254740991L);
        C17760 c17760 = this.f4633;
        C7383 c7383M41607 = c17760.m41607();
        String strM41599 = C17760.m41599(strM4482, c7383M41607, MotionUtils.EASING_TYPE_PATH);
        String str = c7383M41607.f22729;
        jSONObject = c17760.m41608(strM41599);
        try {
            try {
                C12619 c12619M41613 = c17760.m41613(strM41599);
                m4487(c12619M41613, strM41599);
                try {
                    try {
                        i = iM48627;
                        jSONObject = strM4484;
                        i2 = iM48626;
                        try {
                            C7567 c7567M5240 = C1532.m5240(c12619M41613.m30882(), strM4483, jM48626, jM48627, i2, i);
                            boolean z = c7567M5240.f23372;
                            String str2 = c7567M5240.f23369;
                            if (m4488(c12619M41613, c17760.m41613(strM41599), c7567M5240.f23363)) {
                                throw m4485(strM41599, str);
                            }
                            if (!jSONObject.isEmpty() && !jSONObject.equals(str2)) {
                                throw m4486(strM41599, jSONObject, c7567M5240.f23369, c7567M5240.f23361, i2, i, c7383M41607.f22729);
                            }
                            if (!c7567M5240.f23374) {
                                throw m4484(strM41599, jM48626, jM48627, c7567M5240);
                            }
                            JSONArray jSONArrayArray = JSON.array();
                            if (z) {
                                jSONArrayArray.add(m4481("continue", "Continue reading text from the same file version.", strM41599, c7567M5240.f23361, c7567M5240.f23369, i2, i, c7567M5240.f23368, c7567M5240.f23371));
                            }
                            C12936 c12936 = new C12936(C19993.m46095(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM41599).add(TextBundle.TEXT_ENTRY, c7567M5240.f23362).add("encoding", c7567M5240.f23361).add("targetVersion", str2).add("startLine", c7567M5240.f23365).add("startColumn", c7567M5240.f23366).add("nextLine", c7567M5240.f23368).add("nextColumn", c7567M5240.f23371).add("returnedLineCount", c7567M5240.f23373).add("returnedCodePoints", c7567M5240.f23364).add("hasMore", z), jSONArrayArray));
                            jSONObject.close();
                            return c12936;
                        } catch (CharacterCodingException e) {
                            e = e;
                            r14 = jSONObject;
                            if (!r14.isEmpty()) {
                                try {
                                    c16534M41948 = C17946.m41948(c12619M41613.m30882(), 0L, 1);
                                    if (!m4488(c12619M41613, c17760.m41613(strM41599), c16534M41948.f50811)) {
                                        throw m4485(strM41599, str);
                                    }
                                    if (!r14.equals(c16534M41948.f50812)) {
                                        throw m4486(strM41599, r14, c16534M41948.f50812, "", i2, i, c7383M41607.f22729);
                                    }
                                } catch (IOException e2) {
                                    throw C17760.m41601(strM41599, e2);
                                }
                            }
                            throw C3059.m9365("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, strM41599, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                        } catch (C6156 e3) {
                            e = e3;
                            r14 = jSONObject;
                            if (!r14.isEmpty()) {
                                c16534M41948 = C17946.m41948(c12619M41613.m30882(), 0L, 1);
                                if (!m4488(c12619M41613, c17760.m41613(strM41599), c16534M41948.f50811)) {
                                    throw m4485(strM41599, str);
                                }
                                if (!r14.equals(c16534M41948.f50812)) {
                                    throw m4486(strM41599, r14, c16534M41948.f50812, "", i2, i, c7383M41607.f22729);
                                }
                            }
                            throw C3059.m9365("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, strM41599, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                        }
                    } catch (IOException e4) {
                        throw C17760.m41601(strM41599, e4);
                    }
                } catch (CharacterCodingException e5) {
                    e = e5;
                    i = iM48627;
                    i2 = iM48626;
                    r14 = strM4484;
                    if (!r14.isEmpty()) {
                        c16534M41948 = C17946.m41948(c12619M41613.m30882(), 0L, 1);
                        if (!m4488(c12619M41613, c17760.m41613(strM41599), c16534M41948.f50811)) {
                            throw m4485(strM41599, str);
                        }
                        if (!r14.equals(c16534M41948.f50812)) {
                            throw m4486(strM41599, r14, c16534M41948.f50812, "", i2, i, c7383M41607.f22729);
                        }
                    }
                    throw C3059.m9365("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, strM41599, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                } catch (C6156 e6) {
                    e = e6;
                    i = iM48627;
                    i2 = iM48626;
                    r14 = strM4484;
                    if (!r14.isEmpty()) {
                        c16534M41948 = C17946.m41948(c12619M41613.m30882(), 0L, 1);
                        if (!m4488(c12619M41613, c17760.m41613(strM41599), c16534M41948.f50811)) {
                            throw m4485(strM41599, str);
                        }
                        if (!r14.equals(c16534M41948.f50812)) {
                            throw m4486(strM41599, r14, c16534M41948.f50812, "", i2, i, c7383M41607.f22729);
                        }
                    }
                    throw C3059.m9365("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, strM41599, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                }
            } catch (Throwable th2) {
                th = th2;
                r28 = jSONObject;
                th = th;
                try {
                    r28.close();
                    throw th;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            r28 = jSONObject;
            th = th;
            r28.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m4483(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), C7416.m19939(MotionUtils.EASING_TYPE_PATH, "file.txt", "encoding", "").add("targetVersion", "").add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0));
    }
}
