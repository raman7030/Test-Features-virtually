package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16LA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16991 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0616 f52123;

    /* JADX INFO: renamed from: ۜ */
    public String[] mo33818() {
        return new String[0];
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract JSONObject mo26701(JSONObject jSONObject);

    /* JADX INFO: renamed from: ᩻ */
    public abstract JSONObject mo26702();

    public AbstractC16991(C0616 c0616) {
        this.f52123 = c0616;
    }

    /* JADX INFO: renamed from: ֫ */
    public JSONArray mo26700(JSONObject jSONObject, JSONObject jSONObject2) {
        return JSON.array();
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObjectM5538;
        String str;
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5542("string", "Normalized archive path when available.")).add("entryPath", C1648.m5542("string", "Affected ZIP entry when available; empty for the archive."));
        String[] strArrMo33818 = mo33818();
        int length = strArrMo33818.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str2 = strArrMo33818[i];
                str2.getClass();
                switch (str2) {
                    case "size":
                        str = "Observed uncompressed entry length in bytes for an offset error.";
                        break;
                    case "finalLine":
                        str = "Zero-based logical line at the observed entry EOF.";
                        break;
                    case "finalColumn":
                        str = "Zero-based Unicode code-point column at the observed entry EOF.";
                        break;
                    default:
                        str = "Number of ordinary entries fully validated before testing stopped.";
                        break;
                }
                jSONObjectAdd.add(str2, C1648.m5542("integer", str));
                i++;
            } else {
                if (this instanceof C14168) {
                    jSONObjectM5538 = C1648.m5534("No automatic follow-up action.");
                } else {
                    jSONObjectM5538 = C1648.m5538("Executable continuation; list cursor errors may provide a restart.", C1648.m5533(mo3038(), mo3040(), "continue"), C1648.m5533(mo3038(), mo3040(), "retry"));
                }
                return C1648.m5535("Result for " + mo3040() + ".", mo26702(), C1648.m5540(C1648.m5532(jSONObjectAdd, "ZIP read diagnostics.")), jSONObjectM5538);
            }
        }
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c3059.f9609;
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectObject.add(MotionUtils.EASING_TYPE_PATH, jSONValue);
        JSONValue jSONValue2 = jSONObject.get("entryPath");
        if (jSONValue2 == null) {
            jSONValue2 = JSON.NULL;
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entryPath", jSONValue2);
        for (String str : mo33818()) {
            JSONValue jSONValue3 = jSONObject.get(str);
            if (jSONValue3 == null) {
                jSONValue3 = JSON.NULL;
            }
            jSONObjectAdd2.add(str, jSONValue3);
        }
        return C19993.m46097(c3059, jSONObjectAdd2, c3059.f9604);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        try {
            JSONObject jSONObjectMo26701 = mo26701(jSONObject);
            return new C12936(C19993.m46095(jSONObjectMo26701, mo26700(jSONObject, jSONObjectMo26701)));
        } catch (C3059 e) {
            if ((this instanceof C10642) && "ZIP_INVALID_CURSOR".equals(e.f9610)) {
                throw e.m9370(JSON.array().add(C10115.m25398(new JSONObject(jSONObject).put("cursor", "").put(MotionUtils.EASING_TYPE_PATH, e.f9609.getString(MotionUtils.EASING_TYPE_PATH)), "mt_zip_list", "retry", "Discard earlier pages and restart the ZIP listing.")));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m39826(boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute or Home-relative ZIP file path; split archives are not supported."));
        if (z) {
            jSONObjectAdd.add("password", C1648.m5545("string", "Password for the selected entry; pass an empty string if that entry is unencrypted, even when other entries are encrypted."));
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m39827() {
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute archive path.")).add("entryPath", C1648.m5545("string", "Exact case-sensitive path inside the ZIP."));
    }
}
