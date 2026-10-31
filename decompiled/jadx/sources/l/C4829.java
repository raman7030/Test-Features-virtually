package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۙᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4829 extends AbstractC4470 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f15261 = {MotionUtils.EASING_TYPE_PATH, "encoding", "pattern", "patternType", "caseSensitive", "contextBefore", "contextAfter", "limit", "maxChars", "cursor"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5451 f15262;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Search one regular text file line by line and return matching line numbers with original context. Use mt_file_search to find files in a directory. For a first call, use the recommended parameter values below and cursor=\"\". Search completed logs: detected changes require restarting the search; this is not a filesystem snapshot. Follow continue actions even on empty pages; stop calling to abandon a search. Slow files may exceed client timeouts. Decoding errors, lines above 1048576 UTF-16 units and regex resource exhaustion return partial results; inspect stopReason and keep warnings from every page.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Search File Text";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_search_text";
    }

    public C4829(C5451 c5451) {
        this.f15262 = c5451;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        return m14066();
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        return C1648.m5535("Result for mt_file_search_text.", C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute source path.")).add("encoding", C1648.m5545("string", "Resolved lowercase encoding token, including physical BOM when present.")).add("matchedLines", m14063(C1648.m5545("integer", "One newly delivered matching line."), "Newly delivered matching lines in ascending order, zero-based. Each line counts once, including zero-width matches. Context may repeat earlier matches; long-line continuation fragments do not count again. Empty files have no lines; a final newline adds no extra empty line.")).add("blocks", m14063(C18736.m43390(JSON.object().add("startLine", C1648.m5545("integer", "Zero-based original logical line.")).add("startColumn", C1648.m5545("integer", "Zero-based Unicode code-point column on startLine.")), "string", "Original text including original line endings; never inserts ellipses or line numbers. Long lines may continue in another page.", TextBundle.TEXT_ENTRY, "One original text fragment."), "Original fragments in file order; adjacent fragments within a page are merged. Context may overlap across pages.")).add("searchedThroughByteOffset", C1648.m5545("integer", "Exclusive original-byte boundary of the contiguous prefix with completed matching decisions, including BOM. May stay unchanged while pending text is delivered.")).add("scanSize", C1648.m5542("integer", "Observed original byte length at search start; null if unavailable.")).add("stopReason", C1648.m5539("eof means both matching and output finished. match_limit, output_limit and scan_budget have a continue action. resource_limit and decode_error terminate incompletely; inspect warnings.", d.aB, "match_limit", "output_limit", "scan_budget", "resource_limit", "decode_error")).add("warnings", m14063(C18736.m43390(JSON.object().add("reason", C1648.m5539("context_clipped only reduces displayed context; context_incomplete means requested following context could not be finished. Other reasons stop matching at the indicated line.", "context_clipped", "context_incomplete", "invalid_encoding", "line_too_long", "match_resource_limit")), "integer", "Zero-based affected logical line.", "line", "A limit or incomplete search location."), "Keep warnings from all pages; context clipping does not imply skipped matching.")), "One text search page."), C3395.m10357("mt_file_search_text"), C1648.m5538("continue resumes pending results; retry recovers a rejected call as described by the action. Empty after eof or terminal partial results.", C1648.m5533(m14066(), "mt_file_search_text", "continue"), C1648.m5533(m14066(), "mt_file_search_text", "retry")));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m14065(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m14064(jSONValue, "Expected a string", str);
        }
        return jSONValue.asString();
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_search_text", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws Throwable {
        String str;
        C5807.m16297(jSONObject, new C20352(), "Invalid mt_file_search_text argument", f15261);
        String strM14065 = m14065(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM14066 = m14065(jSONObject, "encoding");
        String strM14067 = m14065(jSONObject, "pattern");
        if (strM14067.isEmpty() || strM14067.length() > 16384) {
            throw C3059.m9364("Expected a non-empty pattern of at most 16384 UTF-16 units", "pattern", jSONObject.get("pattern"), JSON.array(), JSON.object());
        }
        String strM14068 = m14065(jSONObject, "patternType");
        if (strM14068.equals("literal") || strM14068.equals("regex")) {
            JSONValue jSONValue = jSONObject.get("caseSensitive");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw m14064(jSONValue, "Expected a boolean", "caseSensitive");
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            int iM48626 = (int) C21474.m48626(jSONObject, "contextBefore", 0L, 100L);
            int iM48627 = (int) C21474.m48626(jSONObject, "contextAfter", 0L, 100L);
            int iM48628 = (int) C21474.m48626(jSONObject, "limit", 1L, 200L);
            int iM48629 = (int) C21474.m48626(jSONObject, "maxChars", ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, 131072L);
            try {
                C0511 c0511M15557 = this.f15262.m15557(strM14065, new C19563(strM14068.equals("regex"), iM48626, iM48627, iM48628, iM48629, zAsBoolean, strM14066, strM14067), m14065(jSONObject, "cursor"));
                JSONArray jSONArrayArray = JSON.array();
                if (!c0511M15557.m2213().isEmpty()) {
                    jSONArrayArray.add(C10115.m25398(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, c0511M15557.m2214().getString(MotionUtils.EASING_TYPE_PATH)).put("encoding", c0511M15557.m2214().getString("encoding")).put("cursor", c0511M15557.m2213()), "mt_file_search_text", "continue", "Continue from this logical position, even when this page has no new matches."));
                }
                return new C12936(C19993.m46095(c0511M15557.m2214(), jSONArrayArray));
            } catch (C3059 e) {
                JSONObject jSONObject2 = new JSONObject(jSONObject);
                String str2 = e.f9610;
                if (str2.equals("FILE_INVALID_CURSOR") || str2.equals("FILE_CHANGED_DURING_READ")) {
                    jSONObject2.put("cursor", "");
                    String string = e.f9609.getString(MotionUtils.EASING_TYPE_PATH, null);
                    if (string != null) {
                        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, string);
                    }
                    str = "Restart with the current query and encoding. Treat earlier pages as a separate search.";
                } else {
                    if (!str2.equals("FILE_SEARCH_CANCELED") || !e.f9606) {
                        throw e;
                    }
                    str = "Retry the same search position after cancellation has cleared.";
                }
                throw e.m9370(JSON.array().add(C10115.m25398(jSONObject2, "mt_file_search_text", "retry", str)));
            }
        }
        throw C3059.m9364("Expected literal or regex", "patternType", jSONObject.get("patternType"), JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m14064(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m14063(JSONObject jSONObject, String str) {
        return C7416.m19939("type", "array", "description", str).add("items", jSONObject);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m14066() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute or Home-relative regular file path; empty is invalid.")).add("encoding", C1648.m5545("string", "Recommended empty for automatic detection on the first call. Otherwise an exact editor encoding token; copy the resolved token for continuation.")).add("pattern", C1648.m5545("string", "Non-empty literal or regex, at most 16384 UTF-16 units. Literal * is not a wildcard.")).add("patternType", C1648.m5539("Search syntax; recommended literal. LF, CRLF and CR delimit lines and are excluded from matching. Regex applies independently to each line, never across lines.", "literal", "regex")).add("caseSensitive", C1648.m5545(ClassTransform.BOOLEAN, "Recommended false enables Unicode case-insensitive matching.")).add("contextBefore", C1648.m5545("integer", "Requested preceding lines, 0..100; recommended 10. May be clipped with a warning.")).add("contextAfter", C1648.m5545("integer", "Requested following lines, 0..100; recommended 20. May continue on later pages.")).add("limit", C1648.m5545("integer", "Maximum newly delivered matching lines in this page, 1..200; recommended 50.")).add("maxChars", C1648.m5545("integer", "Total returned original-text Unicode code points, 1024..131072; recommended 32768. CRLF is never split.")), "string", "Empty starts a search; otherwise copy continuation arguments unchanged. Retries resume the same logical position but page boundaries may differ. After an application process restart, start a new search.", "cursor", "All fields are required; copy continuation arguments unchanged.");
    }
}
