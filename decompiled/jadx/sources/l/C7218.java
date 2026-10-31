package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7218 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f22100;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f22101;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6657 f22102;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Create an allowed local directory with fixed mkdir -p behavior, including every missing parent directory. An existing directory succeeds with changed=false; any existing non-directory component fails. Paths may be absolute or relative to the Home captured at call start. Creating multiple levels is not atomic; a failure may leave created parent directories, with partial progress reported in error diagnostics.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Create Local Directory";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_create_directory";
    }

    public C7218(C6657 c6657) {
        this.f22102 = c6657;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f22100 == null) {
            this.f22100 = C18736.m43390(JSON.object(), "string", "Non-empty absolute path or path relative to the Home captured at call start.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_create_directory; parent creation is always enabled.");
        }
        return this.f22100;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f22101 == null) {
            this.f22101 = C1648.m5535("Result for mt_file_create_directory.", C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute target directory path.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether at least one directory was created.")).add("warnings", C7416.m19939("type", "array", "description", "Non-fatal directory change notification degradation.").add("items", C1648.m5545("string", "One warning message."))), "Successful mkdir -p operation."), C3395.m10357("mt_file_create_directory"), C1648.m5534("mt_file_create_directory has no automatic follow-up action."));
        }
        return this.f22101;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_create_directory", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        C5807.m16297(jSONObject, new C13567(), "Invalid directory create argument", MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "parent/child"));
        }
        C23590 c23590M18192 = this.f22102.m18192(jSONValue.asString());
        return new C12936(C19993.m46095(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c23590M18192.f76478).add("changed", c23590M18192.f76476).add("warnings", new JSONArray(c23590M18192.f76479)), JSON.array()));
    }
}
