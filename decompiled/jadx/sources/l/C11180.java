package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11180 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f33558;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f33559;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0306 f33560;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Permanently delete one allowed local directory. Use recursive=false for an empty directory, or recursive=true to remove the entire tree. The root path must be a real directory; symbolic links are rejected as roots. During recursive deletion, recognized links inside the tree are unlinked without following their targets. Access roots and trees containing them are rejected. Recursive deletion is not atomic; a failure may leave a partially deleted tree. Inspect error diagnostics for partial progress and whether retrying is safe.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Delete Local Directory";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_delete_directory";
    }

    public C11180(C0306 c0306) {
        this.f33560 = c0306;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f33558 == null) {
            this.f33558 = C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Non-empty absolute path or path relative to the Home captured at call start. Must identify a real directory, not a symbolic link.")), ClassTransform.BOOLEAN, "False deletes only an empty directory; true permanently deletes the checked tree.", "recursive", "Arguments for mt_file_delete_directory.");
        }
        return this.f33558;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f33559 == null) {
            this.f33559 = C1648.m5535("Result for mt_file_delete_directory.", C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute directory path fixed for this call.")).add("warnings", C7416.m19939("type", "array", "description", "Non-fatal backend or directory change notification degradation.").add("items", C1648.m5545("string", "One warning message."))).add("deletedFiles", C1648.m5545("integer", "Number of regular files and recognized links confirmed deleted.")), "integer", "Number of directories confirmed deleted, including the root.", "deletedDirectories", "Successful permanent directory deletion."), C3395.m10357("mt_file_delete_directory"), C1648.m5534("mt_file_delete_directory has no automatic follow-up action."));
        }
        return this.f33559;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_delete_directory", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        C5807.m16297(jSONObject, new C2007(), "Invalid directory delete argument", MotionUtils.EASING_TYPE_PATH, "recursive");
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue2 = jSONObject.get("recursive");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m27722(jSONValue, "Invalid path", MotionUtils.EASING_TYPE_PATH);
        }
        if (jSONValue2 == null || !jSONValue2.isBoolean()) {
            throw m27722(jSONValue2, "Invalid recursive flag", "recursive");
        }
        C19358 c19358M1698 = this.f33560.m1698(jSONValue.asString(), jSONValue2.asBoolean());
        return new C12936(C19993.m46095(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c19358M1698.f62670).add("warnings", new JSONArray(c19358M1698.f62671)).add("deletedFiles", c19358M1698.f62669).add("deletedDirectories", c19358M1698.f62668), JSON.array()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m27722(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "directory").add("recursive", false));
    }
}
