package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12994 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f36559;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f36560;

    /* JADX INFO: renamed from: ܽ */
    public final C2659 f36561;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Permanently delete one allowed local directory. Use recursive=false for an empty directory, or recursive=true to remove the entire tree. The root path must be a real directory; symbolic links are rejected as roots. During recursive deletion, recognized links inside the tree are unlinked without following their targets. Access roots and trees containing them are rejected. Recursive deletion is not atomic; a failure may leave a partially deleted tree. Inspect error diagnostics for partial progress and whether retrying is safe.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Delete Local Directory";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_delete_directory";
    }

    public C12994(C2659 c2659) {
        this.f36561 = c2659;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f36559 == null) {
            this.f36559 = C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Non-empty absolute path or path relative to the Home captured at call start. Must identify a real directory, not a symbolic link.")), ClassTransform.BOOLEAN, "False deletes only an empty directory; true permanently deletes the checked tree.", "recursive", "Arguments for mt_file_delete_directory.");
        }
        return this.f36559;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f36560 == null) {
            this.f36560 = C3935.m7765("Result for mt_file_delete_directory.", C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute directory path fixed for this call.")).add("warnings", C9417.m21913("type", "array", "description", "Non-fatal backend or directory change notification degradation.").add("items", C3935.m7775("string", "One warning message."))).add("deletedFiles", C3935.m7775("integer", "Number of regular files and recognized links confirmed deleted.")), "integer", "Number of directories confirmed deleted, including the root.", "deletedDirectories", "Successful permanent directory deletion."), C5595.m12396("mt_file_delete_directory"), C3935.m7764("mt_file_delete_directory has no automatic follow-up action."));
        }
        return this.f36560;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_delete_directory", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C4276(), "Invalid directory delete argument", MotionUtils.EASING_TYPE_PATH, "recursive");
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue2 = jSONObject.get("recursive");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m29784(jSONValue, "Invalid path", MotionUtils.EASING_TYPE_PATH);
        }
        if (jSONValue2 == null || !jSONValue2.isBoolean()) {
            throw m29784(jSONValue2, "Invalid recursive flag", "recursive");
        }
        C20766 c20766M4096 = this.f36561.m4096(jSONValue.asString(), jSONValue2.asBoolean());
        return new C14663(C21370.m48410(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c20766M4096.f65283).add("warnings", new JSONArray(c20766M4096.f65284)).add("deletedFiles", c20766M4096.f65282).add("deletedDirectories", c20766M4096.f65281), JSON.array()));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m29784(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "directory").add("recursive", false));
    }
}
