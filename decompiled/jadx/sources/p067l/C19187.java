package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩳ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96L4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19187 extends AbstractC18516 {
    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Read a page of text from a ZIP file entry, preserving original line endings. This preview does not verify the complete entry; use mt_zip_test for integrity. Keep the ZIP unchanged and use the returned continuation to read more. Later pages may take longer because reading starts from the entry beginning. To edit, extract the file, edit it with File tools, then replace it with mt_zip_update.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Read ZIP Text";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_zip_read_text";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C20175.m45657(AbstractC18516.m42069(true).add("entryPath", C3935.m7775("string", "Exact full ZIP file path, without a trailing /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization.")).add("encoding", C3935.m7775("string", "Text content encoding, not ZIP filename encoding. Pass an empty string for automatic detection, or specify a lowercase token such as utf-8 if decoding fails or text looks wrong. For continuation, use the returned encoding unchanged.")).add("startLine", C3935.m7775("integer", "Zero-based logical line, 0..9007199254740991; initially 0.")).add("startColumn", C3935.m7775("integer", "Zero-based Unicode code-point column, 0..9007199254740991; initially 0.")).add("limit", C3935.m7775("integer", "Maximum logical lines touched, 1..2000; suggested 500.")), "integer", "Maximum Unicode code points, 2..131072; suggested 49152. CRLF is kept together.", "maxChars", "Arguments for mt_zip_read_text.");
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ᩻ */
    public final JSONObject mo28741() {
        return C20175.m45657(AbstractC18516.m42070().add(TextBundle.TEXT_ENTRY, C3935.m7775("string", "Original decoded text, preserving LF, CRLF and CR.")).add("encoding", C3935.m7775("string", "Actual lowercase text encoding token; a -bom suffix means the entry has that BOM.")).add("startLine", C3935.m7775("integer", "Zero-based original line where this page starts.")).add("startColumn", C3935.m7775("integer", "Zero-based Unicode code-point column where this page starts.")).add("nextLine", C3935.m7775("integer", "Zero-based line for the next page.")).add("nextColumn", C3935.m7775("integer", "Zero-based Unicode code-point column for the next page.")).add("returnedLineCount", C3935.m7775("integer", "Number of distinct logical lines touched by returned text.")).add("returnedCodePoints", C3935.m7775("integer", "Number of Unicode code points in text, including each CR and LF.")), ClassTransform.BOOLEAN, "Whether another code point exists after this page.", "hasMore", "One uncompressed text page.");
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo35950() {
        return new String[]{"finalLine", "finalColumn"};
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ۧ */
    public final JSONObject mo28740(JSONObject jSONObject) {
        return this.f55303.m4904(jSONObject);
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ֫ */
    public final JSONArray mo28739(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!jSONObject2.getBoolean("hasMore")) {
            return JSON.array();
        }
        return JSON.array().add(C11982.m27418(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, jSONObject2.getString(MotionUtils.EASING_TYPE_PATH)).put("encoding", jSONObject2.getString("encoding")).put("startLine", jSONObject2.getLong("nextLine")).put("startColumn", jSONObject2.getLong("nextColumn")), "mt_zip_read_text", "continue", "Read the next text page from the unchanged ZIP entry."));
    }
}
