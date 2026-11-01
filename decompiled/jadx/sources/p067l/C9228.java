package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9228 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f24985;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f24986;

    /* JADX INFO: renamed from: ܽ */
    public final C8695 f24987;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Create an allowed local directory with fixed mkdir -p behavior, including every missing parent directory. An existing directory succeeds with changed=false; any existing non-directory component fails. Paths may be absolute or relative to the Home captured at call start. Creating multiple levels is not atomic; a failure may leave created parent directories, with partial progress reported in error diagnostics.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Create Local Directory";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_create_directory";
    }

    public C9228(C8695 c8695) {
        this.f24987 = c8695;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f24985 == null) {
            this.f24985 = C20175.m45657(JSON.object(), "string", "Non-empty absolute path or path relative to the Home captured at call start.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_create_directory; parent creation is always enabled.");
        }
        return this.f24985;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f24986 == null) {
            this.f24986 = C3935.m7765("Result for mt_file_create_directory.", C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute target directory path.")).add("changed", C3935.m7775(ClassTransform.BOOLEAN, "Whether at least one directory was created.")).add("warnings", C9417.m21913("type", "array", "description", "Non-fatal directory change notification degradation.").add("items", C3935.m7775("string", "One warning message."))), "Successful mkdir -p operation."), C5595.m12396("mt_file_create_directory"), C3935.m7764("mt_file_create_directory has no automatic follow-up action."));
        }
        return this.f24986;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_create_directory", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C15262(), "Invalid directory create argument", MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "parent/child"));
        }
        C24788 c24788M20140 = this.f24987.m20140(jSONValue.asString());
        return new C14663(C21370.m48410(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c24788M20140.f79223).add("changed", c24788M20140.f79221).add("warnings", new JSONArray(c24788M20140.f79224)), JSON.array()));
    }
}
