package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.math.BigDecimal;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩹ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6WI */
/* JADX INFO: loaded from: classes.dex */
public final class C23722 extends AbstractC6617 {

    /* JADX INFO: renamed from: ᩳ */
    public static final String[] f75494 = {MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "contentPattern", "contentPatternType", "contentCaseSensitive", "writeText", "replacementMode", "replaceMode", "expectedReplacements"};

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f75495;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f75496;

    /* JADX INFO: renamed from: ܽ */
    public final C14553 f75497;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Replace text in one existing regular file. First call mt_file_read_text and copy path, encoding and targetVersion. Matches are non-overlapping and evaluated against the whole original text; inserted text is never searched again. Regex uses multiline ^/$; dot excludes newlines unless enabled in the expression. Zero-width regex matches use the regex engine's UTF-16 position advancement, including EOF once. Zero matches are a successful no-op unless expectedReplacements disagrees. A timeout, stack limit, cancellation, invalid encoding or replacement count mismatch aborts preparation without changing the file. Original raw bytes are limited to 524288 bytes; encoded output is limited to 10485760 bytes (10 MiB); contentPattern plus writeText are limited to 524288 Unicode code points. Preserves encoding, BOM and original newline characters, with no automatic backup or transcoding. Rejects replacements that change the physical BOM, including exposing a leading U+FEFF. Publication guarantees depend on the file backend; inspect error state before retrying a failed write.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Replace File Text";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_replace_text";
    }

    public C23722(C14553 c14553) {
        this.f75497 = c14553;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f75495 == null) {
            this.f75495 = C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Existing regular file; absolute or Home-relative path. Empty is invalid.")).add("targetVersion", C3935.m7775("string", "Copy the existing file's version from mt_file_read_text or mt_file_stat. Empty and missing are invalid.")).add("encoding", C3935.m7775("string", "Copy the non-empty exact token from mt_file_read_text, including its BOM suffix.")).add("contentPattern", C3935.m7775("string", "Non-empty literal or regex to find in the original whole-file text.")).add("contentPatternType", C3935.m7769("Pattern syntax; recommended literal.", "literal", "regex")).add("contentCaseSensitive", C3935.m7775(ClassTransform.BOOLEAN, "Recommended true; false uses Unicode case-insensitive matching.")).add("writeText", C3935.m7775("string", "Replacement text. Empty deletes selected matches. No automatic newline.")).add("replacementMode", C3935.m7769("literal preserves writeText exactly. template requires regex and supports $0..$9, ${number}, ${name}, and escapes \\n, \\r, \\t, \\\\, \\$. Other escapes or unknown groups are invalid; unmatched optional groups expand to empty. Use ${12} for group 12; $12 means group 1 followed by 2. Recommended literal.", "literal", "template")).add("replaceMode", C3935.m7769("first selects the first non-overlapping match; all selects every non-overlapping match. Recommended all.", "first", ProviderConfigurationPermission.ALL_STR)), "integer", "Expected selected count after applying replaceMode, 0..9007199254740991; -1 disables the check. A mismatch rejects the entire operation before publication.", "expectedReplacements", "Arguments for mt_file_replace_text; all fields are required.");
        }
        return this.f75495;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f75496 == null) {
            this.f75496 = C3935.m7765("Result for mt_file_replace_text.", C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute file path.")).add("encoding", C3935.m7775("string", "Actual encoding token, including any physical BOM.")).add("size", C3935.m7775("integer", "Final raw file size in bytes.")).add("targetVersion", C3935.m7775("string", "Final raw-byte version; copy unchanged for subsequent operations.")).add("replacements", C3935.m7775("integer", "Number of original matches selected for replacement, even when writeText leaves their content unchanged.")).add("changed", C3935.m7775(ClassTransform.BOOLEAN, "Whether final bytes differ from the pre-operation file.")).add("warnings", C3935.m7771("Metadata or publication guarantee limitations; empty when none.")), "Final file state after text replacement."), C5595.m12396("mt_file_replace_text"), C25063.m55002());
        }
        return this.f75496;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_replace_text", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C10311(), "Invalid mt_file_replace_text argument", f75494);
        String strM52747 = m52747(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM52748 = m52747(jSONObject, "targetVersion");
        if (strM52748.length() == 16) {
            for (int i = 0; i < strM52748.length(); i++) {
                char cCharAt = strM52748.charAt(i);
                if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'f')) {
                }
            }
            String strM52749 = m52747(jSONObject, "encoding");
            if (strM52749.isEmpty()) {
                throw m52754(jSONObject.get("encoding"), "Copy the encoding returned by mt_file_read_text", "encoding");
            }
            C18615 c18615M36058 = C15932.m36058(strM52749);
            String strM527410 = m52747(jSONObject, "contentPattern");
            if (strM527410.isEmpty()) {
                throw m52754(jSONObject.get("contentPattern"), "contentPattern must not be empty", "contentPattern");
            }
            String strM527411 = m52747(jSONObject, "writeText");
            if (((long) strM527410.codePointCount(0, strM527410.length())) + ((long) strM527411.codePointCount(0, strM527411.length())) > 524288) {
                throw m52754(jSONObject.get("writeText"), "contentPattern plus writeText exceed 524288 Unicode code points", "writeText");
            }
            boolean zEquals = m52748(jSONObject, "contentPatternType", "literal", "regex").equals("regex");
            JSONValue jSONValue = jSONObject.get("contentCaseSensitive");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw m52754(jSONValue, "Invalid contentCaseSensitive", "contentCaseSensitive");
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            boolean zEquals2 = m52748(jSONObject, "replacementMode", "literal", "template").equals("template");
            if (zEquals2 && !zEquals) {
                throw m52754(jSONObject.get("replacementMode"), "template requires contentPatternType=regex", "replacementMode");
            }
            boolean zEquals3 = m52748(jSONObject, "replaceMode", "first", ProviderConfigurationPermission.ALL_STR).equals("first");
            JSONValue jSONValue2 = jSONObject.get("expectedReplacements");
            if (jSONValue2 != null && jSONValue2.isNumber()) {
                try {
                    long jLongValueExact = new BigDecimal(jSONValue2.toString()).longValueExact();
                    if (jLongValueExact >= -1 && jLongValueExact <= 9007199254740991L) {
                        int i2 = zEquals ? 8 : 16;
                        if (!zAsBoolean) {
                            i2 |= 66;
                        }
                        try {
                            try {
                                C10569 c10569 = new C10569(C13259.m30303(i2, strM527410), strM527411, zEquals2);
                                try {
                                    C10569.m24356();
                                    String[] strArr = {strM52749};
                                    int[] iArr = {0};
                                    C6878[] c6878Arr = {null};
                                    C9859 c9859M33275 = this.f75497.m33275(strM52747, strM52748, new C17015(strM52747, strM52749, strArr, c10569, zEquals3, iArr, jLongValueExact, c6878Arr, c18615M36058));
                                    String str = c9859M33275.f27344;
                                    String str2 = c9859M33275.f27341;
                                    C6878 c6878 = c6878Arr[0];
                                    if (c6878 != null) {
                                        C14924.m34146(c6878);
                                    }
                                    return new C14663(C21370.m48410(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("encoding", strArr[0]).add("size", c9859M33275.f27342).add("targetVersion", str).add("replacements", iArr[0]).add("changed", c9859M33275.f27340).add("warnings", c9859M33275.f27343), JSON.array().add(C25063.m54995("inspect", "Read text from the final file version.", str2, strArr[0], str))));
                                } catch (C24650 e) {
                                    throw m52756(e, (String) null);
                                }
                            } catch (IllegalArgumentException e2) {
                                throw m52754(jSONObject.get("writeText"), e2.getMessage(), "writeText");
                            }
                        } catch (PatternSyntaxException e3) {
                            throw m52754(jSONObject.get("contentPattern"), "Invalid regular expression: " + e3.getDescription(), "contentPattern");
                        }
                    }
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            throw m52754(jSONValue2, "Expected -1 or a non-negative safe integer", "expectedReplacements");
        }
        throw m52754(jSONObject.get("targetVersion"), "Copy an existing file's 16 lowercase hex targetVersion", "targetVersion");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m52751(String str, String str2, String str3) {
        return C5276.m11407(str, str2, "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m52756(C24650 c24650, String str) {
        int i = C23052.f72441[c24650.f78009.ordinal()];
        if (i == 1) {
            return C5276.m11407("FILE_TEXT_REPLACE_CANCELED", "Text replacement was canceled before publication.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (i == 2) {
            return C5276.m11407("FILE_TEXT_REPLACE_FAILED", "Regex matching did not complete. Simplify the expression before retrying.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (i != 3) {
            throw new IncompatibleClassChangeError();
        }
        return m52755(str, JSON.NULL);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m52755(String str, JSONValue jSONValue) {
        return C5276.m11407("FILE_TEXT_RESULT_TOO_LARGE", "The replacement result exceeds the 10485760-byte text limit.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("limit", 10485760).add("actual", jSONValue));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52753(String str) throws C5276 {
        try {
            C10569.m24356();
        } catch (C24650 e) {
            throw m52756(e, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52747(JSONObject jSONObject, String str) throws C5276 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m52754(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52748(JSONObject jSONObject, String str, String str2, String str3) throws C5276 {
        String strM52747 = m52747(jSONObject, str);
        if (strM52747.equals(str2) || strM52747.equals(str3)) {
            return strM52747;
        }
        throw m52754(jSONObject.get(str), C20865.m47154("Expected ", str2, " or ", str3), str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m52754(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), JSON.object());
    }
}
