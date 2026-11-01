package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֨ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6Y7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3605 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f7403;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f7404;

    /* JADX INFO: renamed from: ܽ */
    public final C19247 f7405;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Read one strict text page from a regular local file while preserving LF, CRLF, and CR exactly. On the first call pass encoding=\"\", targetVersion=\"\", startLine=0, startColumn=0, limit=500, and maxChars=49152. Positions and maxChars count Unicode code points. maxChars must be 2..131072 so a CRLF pair is never split; limit is 1..2000 logical lines touched by the page. An empty encoding selects automatic detection. A non-empty encoding reloads with that exact lowercase token and does not transcode. Copy the returned encoding and targetVersion unchanged into continuation calls.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Read File Text";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_read_text";
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m6714(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m6715(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    public C3605(C19247 c19247) {
        this.f7405 = c19247;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f7403 == null) {
            this.f7403 = m6721();
        }
        return this.f7403;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f7404 == null) {
            this.f7404 = C3935.m7765("Result for mt_file_read_text.", C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute file path fixed for this call.")).add(TextBundle.TEXT_ENTRY, C3935.m7775("string", "Strictly decoded text with original LF, CRLF, and CR preserved.")).add("encoding", C3935.m7775("string", "Actual lowercase editor encoding token; physical BOM is included in the token.")).add("targetVersion", C3935.m7775("string", "Whole-file raw-byte version as 16 lowercase hex digits.")).add("startLine", C3935.m7775("integer", "Zero-based logical line requested for this page.")).add("startColumn", C3935.m7775("integer", "Zero-based Unicode code-point column requested for this page.")).add("nextLine", C3935.m7775("integer", "Logical line at which a continuation should start.")).add("nextColumn", C3935.m7775("integer", "Unicode code-point column at which a continuation should start.")).add("returnedLineCount", C3935.m7775("integer", "Number of distinct logical lines touched by returned text.")).add("returnedCodePoints", C3935.m7775("integer", "Number of Unicode code points in text, including each CR and LF.")), ClassTransform.BOOLEAN, "Whether decoded text remains at nextLine and nextColumn.", "hasMore", "One original-newline text page bound to a whole-file version."), C5595.m12396("mt_file_read_text"), C3935.m7768("Contains one directly executable continuation when hasMore=true; a version mismatch contains one restart action.", C3935.m7763(m6721(), "mt_file_read_text", "continue"), C3935.m7763(m6721(), "mt_file_read_text", "retry")));
        }
        return this.f7404;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_read_text", c5276);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m6719(C14362 c14362, String str) throws C5276 {
        int i = C7629.f19972[c14362.m32962().ordinal()];
        C19247 c19247 = this.f7405;
        if (i == 2) {
            c19247.getClass();
            throw C19247.m43851(str);
        }
        if (i == 3) {
            throw C21740.m49020(c14362, c19247, "FILE_NOT_REGULAR", "Directories cannot be read as text.", str);
        }
        if (i == 4) {
            throw C21740.m49020(c14362, c19247, "FILE_IS_SYMLINK", "Symbolic links cannot be read by the generic text tool.", str);
        }
        if (i == 5) {
            throw C21740.m49020(c14362, c19247, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be read as text.", str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m6720(C14362 c14362, C14362 c14363, long j) {
        if (c14363.m32962() != EnumC5645.REGULAR) {
            return true;
        }
        if (c14362.m32961() < 0 || c14362.m32961() == j) {
            return c14363.m32961() >= 0 && c14363.m32961() != j;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m6716(String str, long j, long j2, C9560 c9560) {
        return C5276.m11407("FILE_OFFSET_OUT_OF_RANGE", "The requested text line and column are outside the file.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "operation", "read_text").add("backendReason", "text_position_out_of_range").add("startLine", j).add("startColumn", j2).add("finalLine", c9560.f26282).add("finalColumn", c9560.f26279));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m6717(String str, String str2) {
        return C5276.m11407("FILE_CHANGED_DURING_READ", "The file changed while its text was being read.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str2).add("operation", "read_text").add("backendReason", "metadata_changed"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m6718(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return C5276.m11407("FILE_TARGET_VERSION_MISMATCH", "The file targetVersion no longer matches the current content.", "warning", JSON.array().add(m6713("retry", "Discard earlier pages and restart from the current file version.", str, str4, str3, i, i2, 0L, 0L)), C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str5).add("operation", "read_text").add("backendReason", "target_version_mismatch").add("expectedTargetVersion", str2).add("actualTargetVersion", str3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m6713(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, long j2) {
        return C11982.m27418(C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", i).add("maxChars", i2).add("startLine", j).add("startColumn", j2), "mt_file_read_text", str, str2);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m6721() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("encoding", C3935.m7775("string", "Pass \"\" (empty string) for editor-compatible automatic detection, or an exact lowercase token returned by this tool.")).add("targetVersion", C3935.m7775("string", "Pass \"\" (empty string) on the first read; later copy the previous result unchanged.")).add("limit", C3935.m7775("integer", "Maximum logical lines touched, 1..2000; pass 500 by default.")).add("maxChars", C3935.m7775("integer", "Maximum Unicode code points, 2..131072; pass 49152 by default. Minimum 2 keeps CRLF indivisible.")).add("startLine", C3935.m7775("integer", "Zero-based logical line in 0..9007199254740991; pass 0 initially.")), "integer", "Zero-based Unicode code-point column in 0..9007199254740991; pass 0 initially.", "startColumn", "Arguments for mt_file_read_text.");
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
    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws Throwable {
        ?? r28;
        Throwable th;
        int i;
        int i2;
        ?? r14;
        C18082 c18082M44197;
        C7887.m18222(jSONObject, new C2934(), "Unknown file text read argument", MotionUtils.EASING_TYPE_PATH, "encoding", "targetVersion", "limit", "maxChars", "startLine", "startColumn");
        String strM6714 = m6714((JSONObject) jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM6715 = m6714((JSONObject) jSONObject, "encoding");
        String strM6716 = m6714((JSONObject) jSONObject, "targetVersion");
        int iM50963 = (int) C22777.m50963((JSONObject) jSONObject, "limit", 1L, 2000L);
        int iM50964 = (int) C22777.m50963((JSONObject) jSONObject, "maxChars", 2L, 131072L);
        long jM50963 = C22777.m50963((JSONObject) jSONObject, "startLine", 0L, 9007199254740991L);
        long jM50964 = C22777.m50963((JSONObject) jSONObject, "startColumn", 0L, 9007199254740991L);
        C19247 c19247 = this.f7405;
        C9385 c9385M43852 = c19247.m43852();
        String strM43844 = C19247.m43844(strM6714, c9385M43852, MotionUtils.EASING_TYPE_PATH);
        String str = c9385M43852.f25641;
        jSONObject = c19247.m43853(strM43844);
        try {
            try {
                C14362 c14362M43858 = c19247.m43858(strM43844);
                m6719(c14362M43858, strM43844);
                try {
                    try {
                        i = iM50964;
                        jSONObject = strM6716;
                        i2 = iM50963;
                        try {
                            C9560 c9560M7468 = C3824.m7468(c14362M43858.m32959(), strM6715, jM50963, jM50964, i2, i);
                            boolean z = c9560M7468.f26284;
                            String str2 = c9560M7468.f26281;
                            if (m6720(c14362M43858, c19247.m43858(strM43844), c9560M7468.f26275)) {
                                throw m6717(strM43844, str);
                            }
                            if (!jSONObject.isEmpty() && !jSONObject.equals(str2)) {
                                throw m6718(strM43844, jSONObject, c9560M7468.f26281, c9560M7468.f26273, i2, i, c9385M43852.f25641);
                            }
                            if (!c9560M7468.f26286) {
                                throw m6716(strM43844, jM50963, jM50964, c9560M7468);
                            }
                            JSONArray jSONArrayArray = JSON.array();
                            if (z) {
                                jSONArrayArray.add(m6713("continue", "Continue reading text from the same file version.", strM43844, c9560M7468.f26273, c9560M7468.f26281, i2, i, c9560M7468.f26280, c9560M7468.f26283));
                            }
                            C14663 c14663 = new C14663(C21370.m48410(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM43844).add(TextBundle.TEXT_ENTRY, c9560M7468.f26274).add("encoding", c9560M7468.f26273).add("targetVersion", str2).add("startLine", c9560M7468.f26277).add("startColumn", c9560M7468.f26278).add("nextLine", c9560M7468.f26280).add("nextColumn", c9560M7468.f26283).add("returnedLineCount", c9560M7468.f26285).add("returnedCodePoints", c9560M7468.f26276).add("hasMore", z), jSONArrayArray));
                            jSONObject.close();
                            return c14663;
                        } catch (CharacterCodingException e) {
                            e = e;
                            r14 = jSONObject;
                            if (!r14.isEmpty()) {
                                try {
                                    c18082M44197 = C19424.m44197(c14362M43858.m32959(), 0L, 1);
                                    if (!m6720(c14362M43858, c19247.m43858(strM43844), c18082M44197.f53990)) {
                                        throw m6717(strM43844, str);
                                    }
                                    if (!r14.equals(c18082M44197.f53991)) {
                                        throw m6718(strM43844, r14, c18082M44197.f53991, "", i2, i, c9385M43852.f25641);
                                    }
                                } catch (IOException e2) {
                                    throw C19247.m43846(strM43844, e2);
                                }
                            }
                            throw C5276.m11407("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, strM43844, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                        } catch (C8219 e3) {
                            e = e3;
                            r14 = jSONObject;
                            if (!r14.isEmpty()) {
                                c18082M44197 = C19424.m44197(c14362M43858.m32959(), 0L, 1);
                                if (!m6720(c14362M43858, c19247.m43858(strM43844), c18082M44197.f53990)) {
                                    throw m6717(strM43844, str);
                                }
                                if (!r14.equals(c18082M44197.f53991)) {
                                    throw m6718(strM43844, r14, c18082M44197.f53991, "", i2, i, c9385M43852.f25641);
                                }
                            }
                            throw C5276.m11407("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, strM43844, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                        }
                    } catch (IOException e4) {
                        throw C19247.m43846(strM43844, e4);
                    }
                } catch (CharacterCodingException e5) {
                    e = e5;
                    i = iM50964;
                    i2 = iM50963;
                    r14 = strM6716;
                    if (!r14.isEmpty()) {
                        c18082M44197 = C19424.m44197(c14362M43858.m32959(), 0L, 1);
                        if (!m6720(c14362M43858, c19247.m43858(strM43844), c18082M44197.f53990)) {
                            throw m6717(strM43844, str);
                        }
                        if (!r14.equals(c18082M44197.f53991)) {
                            throw m6718(strM43844, r14, c18082M44197.f53991, "", i2, i, c9385M43852.f25641);
                        }
                    }
                    throw C5276.m11407("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, strM43844, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                } catch (C8219 e6) {
                    e = e6;
                    i = iM50964;
                    i2 = iM50963;
                    r14 = strM6716;
                    if (!r14.isEmpty()) {
                        c18082M44197 = C19424.m44197(c14362M43858.m32959(), 0L, 1);
                        if (!m6720(c14362M43858, c19247.m43858(strM43844), c18082M44197.f53990)) {
                            throw m6717(strM43844, str);
                        }
                        if (!r14.equals(c18082M44197.f53991)) {
                            throw m6718(strM43844, r14, c18082M44197.f53991, "", i2, i, c9385M43852.f25641);
                        }
                    }
                    throw C5276.m11407("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, strM43844, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
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

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m6715(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), C9417.m21913(MotionUtils.EASING_TYPE_PATH, "file.txt", "encoding", "").add("targetVersion", "").add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0));
    }
}
