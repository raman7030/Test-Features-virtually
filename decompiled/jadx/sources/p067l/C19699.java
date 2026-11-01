package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6XN */
/* JADX INFO: loaded from: classes5.dex */
public final class C19699 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f59880;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f59881;

    /* JADX INFO: renamed from: ܽ */
    public final C16740 f59882;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Permanently delete exactly one allowed regular local file. The deletion does not use a recycle bin, does not follow or remove recognized symbolic links, does not accept directories or wildcards, and does not use targetVersion. Paths may be absolute or relative to Home. If deletion fails, inspect error diagnostics before retrying.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Delete Local File";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_delete";
    }

    public C19699(C16740 c16740) {
        this.f59882 = c16740;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f59880 == null) {
            this.f59880 = C20175.m45657(JSON.object(), "string", "Non-empty absolute path or path relative to the Home captured at call start.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_delete.");
        }
        return this.f59880;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f59881 == null) {
            this.f59881 = C3935.m7765("Result for mt_file_delete.", C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute path fixed for this call.")).add("warnings", C9417.m21913("type", "array", "description", "Non-fatal file change notification degradation.").add("items", C3935.m7775("string", "One warning message."))), "Successful permanent file deletion."), C5595.m12396("mt_file_delete"), C3935.m7764("mt_file_delete has no automatic follow-up action."));
        }
        return this.f59881;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_delete", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C18357(), "Invalid file delete argument", MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "file.bin"));
        }
        C10036 c10036M37984 = this.f59882.m37984(jSONValue.asString());
        return new C14663(C21370.m48410(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c10036M37984.f27785).add("warnings", new JSONArray(c10036M37984.f27786)), JSON.array()));
    }
}
