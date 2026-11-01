package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
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
public final class C15004 extends AbstractC6617 {

    /* JADX INFO: renamed from: ᩳ */
    public static final String[] f42868 = {MotionUtils.EASING_TYPE_PATH, "recursive", "namePattern", "namePatternType", "nameMatchMode", "nameCaseSensitive", "minSize", "maxSize", "minModifiedAt", "maxModifiedAt", "contentPattern", "contentPatternType", "contentCaseSensitive", "cursor", "limit"};

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f42869;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f42870;

    /* JADX INFO: renamed from: ܽ */
    public final C4867 f42871;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Find regular files under an allowed directory. All enabled filters are ANDed; each file appears at most once. Includes hidden files, does not enter archives or follow recognized links. Directory names and metadata never prune recursion. Start with path=\".\", recursive=true, cursor=\"\", limit=200; use empty patterns and times and size=-1 to disable filters. Content is automatically decoded using BOM, editor encoding records and detection, then searched as text with no file-size cap. Streaming matching uses sliding windows: very long matches and regex anchors/lookarounds near window boundaries may differ from whole-file regex matching. Content regex uses multiline ^/$; dot does not match newlines unless enabled in the expression. Empty files participate in enabled content matching. Search is not a filesystem snapshot; continuation may reuse directory metadata for up to 30 seconds. An empty page can still have more search work. A page completes its current file before yielding; large files may take longer than a client timeout. Copy the purpose=continue action unchanged. Keep warnings from all pages to identify incomplete searches.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Search Local Files";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_search";
    }

    public C15004(C4867 c4867) {
        this.f42871 = c4867;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f42869 == null) {
            this.f42869 = m34367();
        }
        return this.f42869;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f42870 == null) {
            this.f42870 = C3935.m7765("Result for mt_file_search.", C3935.m7762(JSON.object().add("directoryPath", C3935.m7775("string", "Normalized absolute root, fixed for continuation and the base of every relative path.")).add("listing", C3935.m7771("One matching regular file per element: f size modifiedAt relativePath. Split only at the first three ASCII spaces. Size is bytes or - when unknown; modifiedAt is ISO-8601 or -. Preserve the remaining raw path without trimming, unquoting or splitting on newlines.")).add("pagination", C20175.m45657(JSON.object().add("hasMore", C3935.m7775(ClassTransform.BOOLEAN, "Whether more traversal remains, not whether another match is guaranteed. Can be true with an empty listing.")), "string", "Opaque continuation cursor; empty on the final page. Bound to this root, filters, page size and access policy.", "nextCursor", "Remaining search work.")).add("warnings", C9417.m21913("type", "array", "description", "Reasons and counts of items not evaluated on this page. Empty means no observed search failures, not a filesystem snapshot. Permission-excluded paths are outside the search scope and are not disclosed.").add("items", C20175.m45657(JSON.object().add("reason", C3935.m7769("metadata_unavailable: required size/time unknown; file_unreadable: disappeared or changed type before opening; content_search_failed: read/decode failure or regex timeout/stack limit; name_match_failed: filename regex timeout/stack limit; directory_unreadable: subtree could not be traversed.", "metadata_unavailable", "file_unreadable", "content_search_failed", "name_match_failed", "directory_unreadable")), "integer", "Number of affected files or directories on this page; one unreadable directory can hide many files.", "count", "One aggregated reason."))).add("failedFiles", C9417.m21913("type", "array", "description", "First 20 failed files on this page, in traversal order. Warnings count all failures, including omitted files and unreadable directories. These files were not determined to be non-matches; narrow the name filter to inspect omitted failures. Permission-excluded paths are not disclosed.").add("items", C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute path usable with file tools.")).add("reason", C3935.m7769("invalid_encoding: strict decoding failed; read_timeout: file read timed out; content_search_failed: another read failure or incomplete regex matching; other reasons match the aggregated warning.", "invalid_encoding", "read_timeout", "content_search_failed", "metadata_unavailable", "file_unreadable", "name_match_failed")), "One file whose search could not complete."))), "One file search page."), C5595.m12396("mt_file_search"), C3935.m7768("One directly executable search continuation when hasMore=true, otherwise empty.", C3935.m7763(m34367(), "mt_file_search", "continue")));
        }
        return this.f42870;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_search", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        String str;
        C5617 c5617 = new C5617();
        String[] strArr = f42868;
        C7887.m18222(jSONObject, c5617, "Invalid mt_file_search argument", strArr);
        String strM34365 = m34365(jSONObject, MotionUtils.EASING_TYPE_PATH);
        boolean zM34362 = m34362(jSONObject, "recursive");
        String strM34366 = m34365(jSONObject, "namePattern");
        String strM34360 = m34360(jSONObject, "namePatternType", "literal", "regex");
        String strM34361 = m34360(jSONObject, "nameMatchMode", "exact", "contains");
        boolean zM34363 = m34362(jSONObject, "nameCaseSensitive");
        long jM34363 = m34363(jSONObject, "minSize");
        long jM34364 = m34363(jSONObject, "maxSize");
        Long lM34366 = m34366(jSONObject, "minModifiedAt");
        Long lM34367 = m34366(jSONObject, "maxModifiedAt");
        if (jM34363 != -1 && jM34364 != -1 && jM34363 >= jM34364) {
            throw m34364(jSONObject.get("maxSize"), "minSize must be less than maxSize", "maxSize");
        }
        if (lM34366 != null && lM34367 != null && lM34366.longValue() >= lM34367.longValue()) {
            throw m34364(jSONObject.get("maxModifiedAt"), "minModifiedAt must be before maxModifiedAt", "maxModifiedAt");
        }
        String strM34367 = m34365(jSONObject, "contentPattern");
        String strM34362 = m34360(jSONObject, "contentPatternType", "literal", "regex");
        boolean zM34364 = m34362(jSONObject, "contentCaseSensitive");
        String strM34368 = m34365(jSONObject, "cursor");
        String str2 = "cursor";
        int iM50963 = (int) C22777.m50963(jSONObject, "limit", 1L, 1000L);
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
        jSONObjectObject.put("minSize", jM34363).put("maxSize", jM34364);
        C17606 c17606M10330 = this.f42871.m10330(strM34365, zM34362, strM34368, iM50963, C16111.m36665(C16111.m36668().digest(jSONObjectObject.toString().getBytes(StandardCharsets.UTF_8))), new C10902(strM34366, strM34360.equals("regex"), strM34361.equals("exact"), zM34363, jM34363, jM34364, lM34366, lM34367, strM34367, strM34362.equals("regex"), zM34364));
        C19619 c19619M40089 = c17606M10330.m40089();
        JSONArray jSONArrayArray = JSON.array();
        ArrayList arrayList = c19619M40089.f59664;
        String str5 = c19619M40089.f59663;
        boolean z = c19619M40089.f59660;
        String str6 = c19619M40089.f59659;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        JSONObject jSONObjectAdd = JSON.object().add("directoryPath", str6).add("listing", jSONArrayArray).add("pagination", JSON.object().add("hasMore", z).add("nextCursor", str5)).add("warnings", c17606M10330.m40090()).add("failedFiles", c17606M10330.m40088());
        JSONArray jSONArrayArray2 = JSON.array();
        if (z) {
            jSONArrayArray2.add(C11982.m27418(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, str6).put(str4, str5), "mt_file_search", "continue", "Continue the same file search, even when this page has no matches."));
        }
        return new C14663(C21370.m48410(jSONObjectAdd, jSONArrayArray2));
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m34365(JSONObject jSONObject, String str) throws C5276 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m34364(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m34362(JSONObject jSONObject, String str) throws C5276 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m34364(jSONValue, strConcat, str);
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34360(JSONObject jSONObject, String str, String str2, String str3) throws C5276 {
        String strM34365 = m34365(jSONObject, str);
        if (strM34365.equals(str2) || strM34365.equals(str3)) {
            return strM34365;
        }
        throw m34364(jSONObject.get(str), C20865.m47154("Expected ", str2, " or ", str3), str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m34363(JSONObject jSONObject, String str) throws C5276 {
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
        throw m34364(jSONValue, "Expected -1 or a non-negative safe integer byte count", str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Long m34366(JSONObject jSONObject, String str) throws C5276 {
        String strM34365 = m34365(jSONObject, str);
        if (strM34365.isEmpty()) {
            return null;
        }
        try {
            C21151 c21151 = C21151.parse(strM34365);
            if (c21151.getNano() % BasicLabelFormatter.MILLION != 0) {
                throw new C17796("Sub-millisecond precision");
            }
            return Long.valueOf(c21151.toInstant().toEpochMilli());
        } catch (ArithmeticException | C17796 unused) {
            throw m34364(jSONObject.get(str), "Expected ISO-8601 with Z or an explicit UTC offset, at most millisecond precision", str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m34364(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, ".").add("recursive", true).add("namePattern", "").add("namePatternType", "literal").add("nameMatchMode", "contains").add("nameCaseSensitive", false).add("minSize", -1).add("maxSize", -1).add("minModifiedAt", "").add("maxModifiedAt", "").add("contentPattern", "").add("contentPatternType", "literal").add("contentCaseSensitive", false).add("cursor", "").add("limit", 200));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m34367() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute or Home-relative directory. Use . for Home; empty is invalid.")).add("recursive", C3935.m7775(ClassTransform.BOOLEAN, "Search readable subdirectories without following recognized links; recommended true.")).add("namePattern", C3935.m7775("string", "Expression matched against basename including extension, never the parent path. Empty disables name filtering. Literal * is not a wildcard.")).add("namePatternType", C3935.m7769("Expression syntax; recommended literal. Ignored when namePattern is empty.", "literal", "regex")).add("nameMatchMode", C3935.m7769("exact matches the whole basename; contains finds a substring or a regex match. Recommended contains; ignored when namePattern is empty.", "exact", "contains")).add("nameCaseSensitive", C3935.m7775(ClassTransform.BOOLEAN, "Use true for case-sensitive names; recommended false uses Unicode case-insensitive matching. Ignored when namePattern is empty.")).add("minSize", C3935.m7775("integer", "Inclusive minimum bytes; -1 disables. Otherwise 0..9007199254740991. Unknown size cannot satisfy an enabled size filter.")).add("maxSize", C3935.m7775("integer", "Exclusive maximum bytes; -1 disables. Otherwise 0..9007199254740991 and greater than an enabled minSize.")).add("minModifiedAt", C3935.m7775("string", "Inclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Unknown time cannot satisfy an enabled time filter.")).add("maxModifiedAt", C3935.m7775("string", "Exclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Must be after an enabled minModifiedAt.")).add("contentPattern", C3935.m7775("string", "Require at least one match in decoded file content; empty disables. Literal and regex content matching both use streaming windows, not a file prefix.")).add("contentPatternType", C3935.m7769("Content syntax; recommended literal. Ignored when contentPattern is empty.", "literal", "regex")).add("contentCaseSensitive", C3935.m7775(ClassTransform.BOOLEAN, "Use true for case-sensitive content; recommended false uses Unicode case-insensitive matching. Ignored when contentPattern is empty.")).add("cursor", C3935.m7775("string", "Empty for a new search. For continuation copy the returned action unchanged; changing filters or access policy invalidates the cursor.")), "integer", "Maximum matches per page, 1..1000; recommended 200. A scan budget can yield fewer or zero matches; keep unchanged for continuation.", "limit", "Arguments for mt_file_search; every field is required.");
    }
}
