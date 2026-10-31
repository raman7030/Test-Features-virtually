package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۙۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4396 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12821 f14080;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Append raw hexadecimal bytes at the original EOF, preserving all existing bytes. No separator, newline or BOM is added. Empty hex is a successful no-op. The final file size must be at most 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Append File Bytes";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_append_bytes";
    }

    public C4396(C12821 c12821) {
        this.f14080 = c12821;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        return C18736.m43390(C6240.m17175(), "string", "Append 0..1048576 raw bytes as even-length, case-insensitive hexadecimal without separators. Empty is a no-op.", "hex", "Arguments for mt_file_append_bytes.");
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        return C6240.m17176("mt_file_append_bytes", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_append_bytes", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        C5807.m16297(jSONObject, new C10474(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "hex");
        String strM17178 = C6240.m17178(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM17177 = C6240.m17177(jSONObject);
        String strM17179 = C6240.m17178(jSONObject, "hex");
        if (strM17179.length() > 2097152) {
            throw C6240.m17179("Appended bytes exceed the 1048576-byte limit.", 1048576L, (((long) strM17179.length()) + 1) / 2);
        }
        try {
            byte[] bArrM32621 = C13573.m32621(strM17179);
            C21679.m48948();
            long[] jArr = {0};
            return C6240.m17180(this.f14080.m31189(strM17178, strM17177, new C19919(jArr, bArrM32621)), null, 0L, Math.max(0L, jArr[0] - 32));
        } catch (IllegalArgumentException e) {
            throw C3059.m9365("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, JSON.object());
        }
    }
}
