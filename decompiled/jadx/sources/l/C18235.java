package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6XN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18235 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f56661;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f56662;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15122 f56663;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Permanently delete exactly one allowed regular local file. The deletion does not use a recycle bin, does not follow or remove recognized symbolic links, does not accept directories or wildcards, and does not use targetVersion. Paths may be absolute or relative to Home. If deletion fails, inspect error diagnostics before retrying.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Delete Local File";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_delete";
    }

    public C18235(C15122 c15122) {
        this.f56663 = c15122;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f56661 == null) {
            this.f56661 = C18736.m43390(JSON.object(), "string", "Non-empty absolute path or path relative to the Home captured at call start.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_delete.");
        }
        return this.f56661;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f56662 == null) {
            this.f56662 = C1648.m5535("Result for mt_file_delete.", C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute path fixed for this call.")).add("warnings", C7416.m19939("type", "array", "description", "Non-fatal file change notification degradation.").add("items", C1648.m5545("string", "One warning message."))), "Successful permanent file deletion."), C3395.m10357("mt_file_delete"), C1648.m5534("mt_file_delete has no automatic follow-up action."));
        }
        return this.f56662;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_delete", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        C5807.m16297(jSONObject, new C16823(), "Invalid file delete argument", MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "file.bin"));
        }
        C8068 c8068M35826 = this.f56663.m35826(jSONValue.asString());
        return new C12936(C19993.m46095(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c8068M35826.f24872).add("warnings", new JSONArray(c8068M35826.f24873)), JSON.array()));
    }
}
