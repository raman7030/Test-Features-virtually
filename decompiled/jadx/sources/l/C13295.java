package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06WR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13295 extends AbstractC4470 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f39801 = {MotionUtils.EASING_TYPE_PATH, "recursive", "namePattern", "namePatternType", "nameMatchMode", "nameCaseSensitive", "minSize", "maxSize", "minModifiedAt", "maxModifiedAt", "contentPattern", "contentPatternType", "contentCaseSensitive", "cursor", "limit"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f39802;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f39803;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2629 f39804;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Find regular files under an allowed directory. All enabled filters are ANDed; each file appears at most once. Includes hidden files, does not enter archives or follow recognized links. Directory names and metadata never prune recursion. Start with path=\".\", recursive=true, cursor=\"\", limit=200; use empty patterns and times and size=-1 to disable filters. Content is automatically decoded using BOM, editor encoding records and detection, then searched as text with no file-size cap. Streaming matching uses sliding windows: very long matches and regex anchors/lookarounds near window boundaries may differ from whole-file regex matching. Content regex uses multiline ^/$; dot does not match newlines unless enabled in the expression. Empty files participate in enabled content matching. Search is not a filesystem snapshot; continuation may reuse directory metadata for up to 30 seconds. An empty page can still have more search work. A page completes its current file before yielding; large files may take longer than a client timeout. Copy the purpose=continue action unchanged. Keep warnings from all pages to identify incomplete searches.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Search Local Files";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_search";
    }

    public C13295(C2629 c2629) {
        this.f39804 = c2629;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f39802 == null) {
            this.f39802 = m32266();
        }
        return this.f39802;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f39803 == null) {
            this.f39803 = C1648.m5535("Result for mt_file_search.", C1648.m5532(JSON.object().add("directoryPath", C1648.m5545("string", "Normalized absolute root, fixed for continuation and the base of every relative path.")).add("listing", C1648.m5541("One matching regular file per element: f size modifiedAt relativePath. Split only at the first three ASCII spaces. Size is bytes or - when unknown; modifiedAt is ISO-8601 or -. Preserve the remaining raw path without trimming, unquoting or splitting on newlines.")).add("pagination", C18736.m43390(JSON.object().add("hasMore", C1648.m5545(ClassTransform.BOOLEAN, "Whether more traversal remains, not whether another match is guaranteed. Can be true with an empty listing.")), "string", "Opaque continuation cursor; empty on the final page. Bound to this root, filters, page size and access policy.", "nextCursor", "Remaining search work.")).add("warnings", C7416.m19939("type", "array", "description", "Reasons and counts of items not evaluated on this page. Empty means no observed search failures, not a filesystem snapshot. Permission-excluded paths are outside the search scope and are not disclosed.").add("items", C18736.m43390(JSON.object().add("reason", C1648.m5539("metadata_unavailable: required size/time unknown; file_unreadable: disappeared or changed type before opening; content_search_failed: read/decode failure or regex timeout/stack limit; name_match_failed: filename regex timeout/stack limit; directory_unreadable: subtree could not be traversed.", "metadata_unavailable", "file_unreadable", "content_search_failed", "name_match_failed", "directory_unreadable")), "integer", "Number of affected files or directories on this page; one unreadable directory can hide many files.", "count", "One aggregated reason."))).add("failedFiles", C7416.m19939("type", "array", "description", "First 20 failed files on this page, in traversal order. Warnings count all failures, including omitted files and unreadable directories. These files were not determined to be non-matches; narrow the name filter to inspect omitted failures. Permission-excluded paths are not disclosed.").add("items", C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute path usable with file tools.")).add("reason", C1648.m5539("invalid_encoding: strict decoding failed; read_timeout: file read timed out; content_search_failed: another read failure or incomplete regex matching; other reasons match the aggregated warning.", "invalid_encoding", "read_timeout", "content_search_failed", "metadata_unavailable", "file_unreadable", "name_match_failed")), "One file whose search could not complete."))), "One file search page."), C3395.m10357("mt_file_search"), C1648.m5538("One directly executable search continuation when hasMore=true, otherwise empty.", C1648.m5533(m32266(), "mt_file_search", "continue")));
        }
        return this.f39803;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_search", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        String str;
        C3418 c3418 = new C3418();
        String[] strArr = f39801;
        C5807.m16297(jSONObject, c3418, "Invalid mt_file_search argument", strArr);
        String strM32264 = m32264(jSONObject, MotionUtils.EASING_TYPE_PATH);
        boolean zM32261 = m32261(jSONObject, "recursive");
        String strM32265 = m32264(jSONObject, "namePattern");
        String strM32259 = m32259(jSONObject, "namePatternType", "literal", "regex");
        String strM322510 = m32259(jSONObject, "nameMatchMode", "exact", "contains");
        boolean zM32262 = m32261(jSONObject, "nameCaseSensitive");
        long jM32262 = m32262(jSONObject, "minSize");
        long jM32263 = m32262(jSONObject, "maxSize");
        Long lM32265 = m32265(jSONObject, "minModifiedAt");
        Long lM32266 = m32265(jSONObject, "maxModifiedAt");
        if (jM32262 != -1 && jM32263 != -1 && jM32262 >= jM32263) {
            throw m32263(jSONObject.get("maxSize"), "minSize must be less than maxSize", "maxSize");
        }
        if (lM32265 != null && lM32266 != null && lM32265.longValue() >= lM32266.longValue()) {
            throw m32263(jSONObject.get("maxModifiedAt"), "minModifiedAt must be before maxModifiedAt", "maxModifiedAt");
        }
        String strM32266 = m32264(jSONObject, "contentPattern");
        String strM322511 = m32259(jSONObject, "contentPatternType", "literal", "regex");
        boolean zM32263 = m32261(jSONObject, "contentCaseSensitive");
        String strM32267 = m32264(jSONObject, "cursor");
        String str2 = "cursor";
        int iM48626 = (int) C21474.m48626(jSONObject, "limit", 1L, 1000L);
        JSONObject jSONObjectObject = JSON.object();
        int i = 0;
        while (i < 15) {
            String str3 = strArr[i];
            if (str3.equals(MotionUtils.EASING_TYPE_PATH)) {
                str = str2;
            } else {
                str = str2;
                if (!str3.equals(str) && !str3.equals("limit")) {
                    jSONObjectObject.add(str3, jSONObject.get(str3));
                }
            }
            i++;
            str2 = str;
        }
        String str4 = str2;
        jSONObjectObject.put("minSize", jM32262).put("maxSize", jM32263);
        C16033 c16033M8286 = this.f39804.m8286(strM32264, zM32261, strM32267, iM48626, C14460.m34531(C14460.m34534().digest(jSONObjectObject.toString().getBytes(StandardCharsets.UTF_8))), new C8979(strM32265, strM32259.equals("regex"), strM322510.equals("exact"), zM32262, jM32262, jM32263, lM32265, lM32266, strM32266, strM322511.equals("regex"), zM32263));
        C18151 c18151M37902 = c16033M8286.m37902();
        JSONArray jSONArrayArray = JSON.array();
        ArrayList arrayList = c18151M37902.f56449;
        String str5 = c18151M37902.f56448;
        boolean z = c18151M37902.f56445;
        String str6 = c18151M37902.f56444;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        JSONObject jSONObjectAdd = JSON.object().add("directoryPath", str6).add("listing", jSONArrayArray).add("pagination", JSON.object().add("hasMore", z).add("nextCursor", str5)).add("warnings", c16033M8286.m37903()).add("failedFiles", c16033M8286.m37901());
        JSONArray jSONArrayArray2 = JSON.array();
        if (z) {
            jSONArrayArray2.add(C10115.m25398(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, str6).put(str4, str5), "mt_file_search", "continue", "Continue the same file search, even when this page has no matches."));
        }
        return new C12936(C19993.m46095(jSONObjectAdd, jSONArrayArray2));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m32264(JSONObject jSONObject, String str) throws C3059 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m32263(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32261(JSONObject jSONObject, String str) throws C3059 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m32263(jSONValue, strConcat, str);
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32259(JSONObject jSONObject, String str, String str2, String str3) throws C3059 {
        String strM32264 = m32264(jSONObject, str);
        if (strM32264.equals(str2) || strM32264.equals(str3)) {
            return strM32264;
        }
        throw m32263(jSONObject.get(str), C19462.m44858("Expected ", str2, " or ", str3), str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m32262(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue != null && jSONValue.isNumber()) {
            try {
                long jLongValueExact = new BigDecimal(jSONValue.toString()).longValueExact();
                if (jLongValueExact >= -1 && jLongValueExact <= 9007199254740991L) {
                    return jLongValueExact;
                }
            } catch (ArithmeticException | NumberFormatException unused) {
            }
        }
        throw m32263(jSONValue, "Expected -1 or a non-negative safe integer byte count", str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Long m32265(JSONObject jSONObject, String str) throws C3059 {
        String strM32264 = m32264(jSONObject, str);
        if (strM32264.isEmpty()) {
            return null;
        }
        try {
            C19762 c19762 = C19762.parse(strM32264);
            if (c19762.getNano() % BasicLabelFormatter.MILLION != 0) {
                throw new C16232("Sub-millisecond precision");
            }
            return Long.valueOf(c19762.toInstant().toEpochMilli());
        } catch (ArithmeticException | C16232 unused) {
            throw m32263(jSONObject.get(str), "Expected ISO-8601 with Z or an explicit UTC offset, at most millisecond precision", str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m32263(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, ".").add("recursive", true).add("namePattern", "").add("namePatternType", "literal").add("nameMatchMode", "contains").add("nameCaseSensitive", false).add("minSize", -1).add("maxSize", -1).add("minModifiedAt", "").add("maxModifiedAt", "").add("contentPattern", "").add("contentPatternType", "literal").add("contentCaseSensitive", false).add("cursor", "").add("limit", 200));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m32266() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute or Home-relative directory. Use . for Home; empty is invalid.")).add("recursive", C1648.m5545(ClassTransform.BOOLEAN, "Search readable subdirectories without following recognized links; recommended true.")).add("namePattern", C1648.m5545("string", "Expression matched against basename including extension, never the parent path. Empty disables name filtering. Literal * is not a wildcard.")).add("namePatternType", C1648.m5539("Expression syntax; recommended literal. Ignored when namePattern is empty.", "literal", "regex")).add("nameMatchMode", C1648.m5539("exact matches the whole basename; contains finds a substring or a regex match. Recommended contains; ignored when namePattern is empty.", "exact", "contains")).add("nameCaseSensitive", C1648.m5545(ClassTransform.BOOLEAN, "Use true for case-sensitive names; recommended false uses Unicode case-insensitive matching. Ignored when namePattern is empty.")).add("minSize", C1648.m5545("integer", "Inclusive minimum bytes; -1 disables. Otherwise 0..9007199254740991. Unknown size cannot satisfy an enabled size filter.")).add("maxSize", C1648.m5545("integer", "Exclusive maximum bytes; -1 disables. Otherwise 0..9007199254740991 and greater than an enabled minSize.")).add("minModifiedAt", C1648.m5545("string", "Inclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Unknown time cannot satisfy an enabled time filter.")).add("maxModifiedAt", C1648.m5545("string", "Exclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Must be after an enabled minModifiedAt.")).add("contentPattern", C1648.m5545("string", "Require at least one match in decoded file content; empty disables. Literal and regex content matching both use streaming windows, not a file prefix.")).add("contentPatternType", C1648.m5539("Content syntax; recommended literal. Ignored when contentPattern is empty.", "literal", "regex")).add("contentCaseSensitive", C1648.m5545(ClassTransform.BOOLEAN, "Use true for case-sensitive content; recommended false uses Unicode case-insensitive matching. Ignored when contentPattern is empty.")).add("cursor", C1648.m5545("string", "Empty for a new search. For continuation copy the returned action unchanged; changing filters or access policy invalidates the cursor.")), "integer", "Maximum matches per page, 1..1000; recommended 200. A scan budget can yield fewer or zero matches; keep unchanged for continuation.", "limit", "Arguments for mt_file_search; every field is required.");
    }
}
