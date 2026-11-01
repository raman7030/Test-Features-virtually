package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.C0708d;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۙᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6958 extends AbstractC6617 {

    /* JADX INFO: renamed from: ۧ */
    public static final String[] f18094 = {MotionUtils.EASING_TYPE_PATH, "encoding", "pattern", "patternType", "caseSensitive", "contextBefore", "contextAfter", "limit", "maxChars", "cursor"};

    /* JADX INFO: renamed from: ֫ */
    public final C7549 f18095;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Search one regular text file line by line and return matching line numbers with original context. Use mt_file_search to find files in a directory. For a first call, use the recommended parameter values below and cursor=\"\". Search completed logs: detected changes require restarting the search; this is not a filesystem snapshot. Follow continue actions even on empty pages; stop calling to abandon a search. Slow files may exceed client timeouts. Decoding errors, lines above 1048576 UTF-16 units and regex resource exhaustion return partial results; inspect stopReason and keep warnings from every page.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Search File Text";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_search_text";
    }

    public C6958(C7549 c7549) {
        this.f18095 = c7549;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return m15946();
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        return C3935.m7765("Result for mt_file_search_text.", C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute source path.")).add("encoding", C3935.m7775("string", "Resolved lowercase encoding token, including physical BOM when present.")).add("matchedLines", m15943(C3935.m7775("integer", "One newly delivered matching line."), "Newly delivered matching lines in ascending order, zero-based. Each line counts once, including zero-width matches. Context may repeat earlier matches; long-line continuation fragments do not count again. Empty files have no lines; a final newline adds no extra empty line.")).add("blocks", m15943(C20175.m45657(JSON.object().add("startLine", C3935.m7775("integer", "Zero-based original logical line.")).add("startColumn", C3935.m7775("integer", "Zero-based Unicode code-point column on startLine.")), "string", "Original text including original line endings; never inserts ellipses or line numbers. Long lines may continue in another page.", TextBundle.TEXT_ENTRY, "One original text fragment."), "Original fragments in file order; adjacent fragments within a page are merged. Context may overlap across pages.")).add("searchedThroughByteOffset", C3935.m7775("integer", "Exclusive original-byte boundary of the contiguous prefix with completed matching decisions, including BOM. May stay unchanged while pending text is delivered.")).add("scanSize", C3935.m7772("integer", "Observed original byte length at search start; null if unavailable.")).add("stopReason", C3935.m7769("eof means both matching and output finished. match_limit, output_limit and scan_budget have a continue action. resource_limit and decode_error terminate incompletely; inspect warnings.", C0708d.f2613aB, "match_limit", "output_limit", "scan_budget", "resource_limit", "decode_error")).add("warnings", m15943(C20175.m45657(JSON.object().add("reason", C3935.m7769("context_clipped only reduces displayed context; context_incomplete means requested following context could not be finished. Other reasons stop matching at the indicated line.", "context_clipped", "context_incomplete", "invalid_encoding", "line_too_long", "match_resource_limit")), "integer", "Zero-based affected logical line.", "line", "A limit or incomplete search location."), "Keep warnings from all pages; context clipping does not imply skipped matching.")), "One text search page."), C5595.m12396("mt_file_search_text"), C3935.m7768("continue resumes pending results; retry recovers a rejected call as described by the action. Empty after eof or terminal partial results.", C3935.m7763(m15946(), "mt_file_search_text", "continue"), C3935.m7763(m15946(), "mt_file_search_text", "retry")));
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m15945(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m15944(jSONValue, "Expected a string", str);
        }
        return jSONValue.asString();
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_search_text", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws Throwable {
        String str;
        C7887.m18222(jSONObject, new C21711(), "Invalid mt_file_search_text argument", f18094);
        String strM15945 = m15945(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM15946 = m15945(jSONObject, "encoding");
        String strM15947 = m15945(jSONObject, "pattern");
        if (strM15947.isEmpty() || strM15947.length() > 16384) {
            throw C5276.m11406("Expected a non-empty pattern of at most 16384 UTF-16 units", "pattern", jSONObject.get("pattern"), JSON.array(), JSON.object());
        }
        String strM15948 = m15945(jSONObject, "patternType");
        if (strM15948.equals("literal") || strM15948.equals("regex")) {
            JSONValue jSONValue = jSONObject.get("caseSensitive");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw m15944(jSONValue, "Expected a boolean", "caseSensitive");
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            int iM50963 = (int) C22777.m50963(jSONObject, "contextBefore", 0L, 100L);
            int iM50964 = (int) C22777.m50963(jSONObject, "contextAfter", 0L, 100L);
            int iM50965 = (int) C22777.m50963(jSONObject, "limit", 1L, 200L);
            int iM50966 = (int) C22777.m50963(jSONObject, "maxChars", ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, 131072L);
            try {
                C2854 c2854M17468 = this.f18095.m17468(strM15945, new C20961(strM15948.equals("regex"), iM50963, iM50964, iM50965, iM50966, zAsBoolean, strM15946, strM15947), m15945(jSONObject, "cursor"));
                JSONArray jSONArrayArray = JSON.array();
                if (!c2854M17468.m4580().isEmpty()) {
                    jSONArrayArray.add(C11982.m27418(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, c2854M17468.m4581().getString(MotionUtils.EASING_TYPE_PATH)).put("encoding", c2854M17468.m4581().getString("encoding")).put("cursor", c2854M17468.m4580()), "mt_file_search_text", "continue", "Continue from this logical position, even when this page has no new matches."));
                }
                return new C14663(C21370.m48410(c2854M17468.m4581(), jSONArrayArray));
            } catch (C5276 e) {
                JSONObject jSONObject2 = new JSONObject(jSONObject);
                String str2 = e.f12413;
                if (str2.equals("FILE_INVALID_CURSOR") || str2.equals("FILE_CHANGED_DURING_READ")) {
                    jSONObject2.put("cursor", "");
                    String string = e.f12412.getString(MotionUtils.EASING_TYPE_PATH, null);
                    if (string != null) {
                        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, string);
                    }
                    str = "Restart with the current query and encoding. Treat earlier pages as a separate search.";
                } else {
                    if (!str2.equals("FILE_SEARCH_CANCELED") || !e.f12409) {
                        throw e;
                    }
                    str = "Retry the same search position after cancellation has cleared.";
                }
                throw e.m11412(JSON.array().add(C11982.m27418(jSONObject2, "mt_file_search_text", "retry", str)));
            }
        }
        throw C5276.m11406("Expected literal or regex", "patternType", jSONObject.get("patternType"), JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m15944(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m15943(JSONObject jSONObject, String str) {
        return C9417.m21913("type", "array", "description", str).add("items", jSONObject);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m15946() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute or Home-relative regular file path; empty is invalid.")).add("encoding", C3935.m7775("string", "Recommended empty for automatic detection on the first call. Otherwise an exact editor encoding token; copy the resolved token for continuation.")).add("pattern", C3935.m7775("string", "Non-empty literal or regex, at most 16384 UTF-16 units. Literal * is not a wildcard.")).add("patternType", C3935.m7769("Search syntax; recommended literal. LF, CRLF and CR delimit lines and are excluded from matching. Regex applies independently to each line, never across lines.", "literal", "regex")).add("caseSensitive", C3935.m7775(ClassTransform.BOOLEAN, "Recommended false enables Unicode case-insensitive matching.")).add("contextBefore", C3935.m7775("integer", "Requested preceding lines, 0..100; recommended 10. May be clipped with a warning.")).add("contextAfter", C3935.m7775("integer", "Requested following lines, 0..100; recommended 20. May continue on later pages.")).add("limit", C3935.m7775("integer", "Maximum newly delivered matching lines in this page, 1..200; recommended 50.")).add("maxChars", C3935.m7775("integer", "Total returned original-text Unicode code points, 1024..131072; recommended 32768. CRLF is never split.")), "string", "Empty starts a search; otherwise copy continuation arguments unchanged. Retries resume the same logical position but page boundaries may differ. After an application process restart, start a new search.", "cursor", "All fields are required; copy continuation arguments unchanged.");
    }
}
