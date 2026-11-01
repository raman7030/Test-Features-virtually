package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۙۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6546 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C14553 f16896;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Append raw hexadecimal bytes at the original EOF, preserving all existing bytes. No separator, newline or BOM is added. Empty hex is a successful no-op. The final file size must be at most 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Append File Bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_append_bytes";
    }

    public C6546(C14553 c14553) {
        this.f16896 = c14553;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C20175.m45657(C8299.m19113(), "string", "Append 0..1048576 raw bytes as even-length, case-insensitive hexadecimal without separators. Empty is a no-op.", "hex", "Arguments for mt_file_append_bytes.");
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        return C8299.m19114("mt_file_append_bytes", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_append_bytes", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C12323(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "hex");
        String strM19116 = C8299.m19116(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM19115 = C8299.m19115(jSONObject);
        String strM19117 = C8299.m19116(jSONObject, "hex");
        if (strM19117.length() > 2097152) {
            throw C8299.m19117("Appended bytes exceed the 1048576-byte limit.", 1048576L, (((long) strM19117.length()) + 1) / 2);
        }
        try {
            byte[] bArrM34733 = C15268.m34733(strM19117);
            C22972.m51297();
            long[] jArr = {0};
            return C8299.m19118(this.f16896.m33275(strM19116, strM19115, new C21299(jArr, bArrM34733)), null, 0L, Math.max(0L, jArr[0] - 32));
        } catch (IllegalArgumentException e) {
            throw C5276.m11407("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, JSON.object());
        }
    }
}
