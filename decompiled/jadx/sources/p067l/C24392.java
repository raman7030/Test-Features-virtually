package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WI */
/* JADX INFO: loaded from: classes.dex */
public final class C24392 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C14553 f77211;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Keep the original byte range [0, size) and discard the tail. size=0 empties the file; the current size is a successful no-op. A size greater than the current file is rejected, never zero-filled. May split encoded characters and does not guarantee valid text. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Truncate File Bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_truncate_bytes";
    }

    public C24392(C14553 c14553) {
        this.f77211 = c14553;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C20175.m45657(C8299.m19113(), "integer", "Final byte size to keep, 0..9007199254740991 and no greater than current size. Use 0 to empty.", "size", "Arguments for mt_file_truncate_bytes.");
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        return C8299.m19114("mt_file_truncate_bytes", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_truncate_bytes", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C12323(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "size");
        String strM19116 = C8299.m19116(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM19115 = C8299.m19115(jSONObject);
        long jM50963 = C22777.m50963(jSONObject, "size", 0L, 9007199254740991L);
        C22972.m51297();
        return C8299.m19118(this.f77211.m33275(strM19116, strM19115, new C13664(jM50963)), null, 0L, Math.max(0L, jM50963 - 256));
    }
}
