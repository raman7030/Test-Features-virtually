package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.۫ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6XW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12590 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f37971;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f37972;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23795 f37973;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Inspect an allowed local path: absolute path, type, byte size, modified time, and current access. Ordinary files also return targetVersion for later writes. Links and other special nodes are reported but are not followed.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Stat Local File";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_stat";
    }

    public C12590(C23795 c23795) {
        this.f37973 = c23795;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f37971 == null) {
            this.f37971 = C18736.m43390(JSON.object(), "string", "Non-empty absolute or Home-relative local path. URI forms are not accepted.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat.");
        }
        return this.f37971;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f37972 == null) {
            this.f37972 = C1648.m5535("Result for mt_file_stat.", C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute identity of the requested path.")).add("type", C1648.m5545("string", "file, directory, link, or other.")).add("size", C1648.m5542("integer", "Ordinary file length in bytes, or null when not applicable or unknown.")).add("modifiedAt", C1648.m5542("string", "ISO 8601 local timestamp, or null when the backend cannot provide one.")).add(am.Q, C1648.m5545("string", "Current read_only or read_write MCP access for this path.")).add("targetVersion", C1648.m5542("string", "Whole-file version token of 16 lowercase hex digits, or null for non-files.")), "Local file metadata."), C3395.m10357("mt_file_stat"), C1648.m5534("mt_file_stat has no automatic follow-up action."));
        }
        return this.f37972;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_stat", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        List listAsList = Arrays.asList(MotionUtils.EASING_TYPE_PATH);
        HashSet hashSet = new HashSet();
        for (String str : jSONObject.names()) {
            if (!listAsList.contains(str) || !hashSet.add(str)) {
                throw C3059.m9364("Invalid mt_file_stat argument", str, jSONObject.get(str), JSON.array(MotionUtils.EASING_TYPE_PATH), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
            }
        }
        if (!hashSet.contains(MotionUtils.EASING_TYPE_PATH)) {
            throw C3059.m9364("Invalid path", MotionUtils.EASING_TYPE_PATH, (JSONValue) null, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
        }
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
        }
        C14622 c14622M52474 = this.f37973.m52474(jSONValue.asString());
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c14622M52474.f44727).add("type", c14622M52474.f44726);
        Long l2 = c14622M52474.f44729;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("size", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
        String str2 = c14622M52474.f44725;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("modifiedAt", str2 == null ? JSON.NULL : JSON.value(str2)).add(am.Q, c14622M52474.f44724);
        String str3 = c14622M52474.f44728;
        return new C12936(C19993.m46095(jSONObjectAdd3.add("targetVersion", str3 == null ? JSON.NULL : JSON.value(str3)), JSON.array()));
    }
}
