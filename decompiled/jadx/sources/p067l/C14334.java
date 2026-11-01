package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.۫ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6XW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14334 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f40999;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f41000;

    /* JADX INFO: renamed from: ܽ */
    public final C24983 f41001;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Inspect an allowed local path: absolute path, type, byte size, modified time, and current access. Ordinary files also return targetVersion for later writes. Links and other special nodes are reported but are not followed.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Stat Local File";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_stat";
    }

    public C14334(C24983 c24983) {
        this.f41001 = c24983;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f40999 == null) {
            this.f40999 = C20175.m45657(JSON.object(), "string", "Non-empty absolute or Home-relative local path. URI forms are not accepted.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat.");
        }
        return this.f40999;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f41000 == null) {
            this.f41000 = C3935.m7765("Result for mt_file_stat.", C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute identity of the requested path.")).add("type", C3935.m7775("string", "file, directory, link, or other.")).add("size", C3935.m7772("integer", "Ordinary file length in bytes, or null when not applicable or unknown.")).add("modifiedAt", C3935.m7772("string", "ISO 8601 local timestamp, or null when the backend cannot provide one.")).add(C0655am.f2262Q, C3935.m7775("string", "Current read_only or read_write MCP access for this path.")).add("targetVersion", C3935.m7772("string", "Whole-file version token of 16 lowercase hex digits, or null for non-files.")), "Local file metadata."), C5595.m12396("mt_file_stat"), C3935.m7764("mt_file_stat has no automatic follow-up action."));
        }
        return this.f41000;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_stat", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        List listAsList = Arrays.asList(MotionUtils.EASING_TYPE_PATH);
        HashSet hashSet = new HashSet();
        for (String str : jSONObject.names()) {
            if (!listAsList.contains(str) || !hashSet.add(str)) {
                throw C5276.m11406("Invalid mt_file_stat argument", str, jSONObject.get(str), JSON.array(MotionUtils.EASING_TYPE_PATH), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
            }
        }
        if (!hashSet.contains(MotionUtils.EASING_TYPE_PATH)) {
            throw C5276.m11406("Invalid path", MotionUtils.EASING_TYPE_PATH, (JSONValue) null, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
        }
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
        }
        C16265 c16265M54883 = this.f41001.m54883(jSONValue.asString());
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c16265M54883.f47834).add("type", c16265M54883.f47833);
        Long l2 = c16265M54883.f47836;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("size", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
        String str2 = c16265M54883.f47832;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("modifiedAt", str2 == null ? JSON.NULL : JSON.value(str2)).add(C0655am.f2262Q, c16265M54883.f47831);
        String str3 = c16265M54883.f47835;
        return new C14663(C21370.m48410(jSONObjectAdd3.add("targetVersion", str3 == null ? JSON.NULL : JSON.value(str3)), JSON.array()));
    }
}
