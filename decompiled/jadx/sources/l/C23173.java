package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WI */
/* JADX INFO: loaded from: classes.dex */
public final class C23173 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12821 f74466;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Keep the original byte range [0, size) and discard the tail. size=0 empties the file; the current size is a successful no-op. A size greater than the current file is rejected, never zero-filled. May split encoded characters and does not guarantee valid text. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Truncate File Bytes";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_truncate_bytes";
    }

    public C23173(C12821 c12821) {
        this.f74466 = c12821;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        return C18736.m43390(C6240.m17175(), "integer", "Final byte size to keep, 0..9007199254740991 and no greater than current size. Use 0 to empty.", "size", "Arguments for mt_file_truncate_bytes.");
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        return C6240.m17176("mt_file_truncate_bytes", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_truncate_bytes", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        C5807.m16297(jSONObject, new C10474(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "size");
        String strM17178 = C6240.m17178(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM17177 = C6240.m17177(jSONObject);
        long jM48626 = C21474.m48626(jSONObject, "size", 0L, 9007199254740991L);
        C21679.m48948();
        return C6240.m17180(this.f74466.m31189(strM17178, strM17177, new C11885(jM48626)), null, 0L, Math.max(0L, jM48626 - 256));
    }
}
