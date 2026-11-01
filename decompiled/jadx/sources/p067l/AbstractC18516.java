package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16LA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18516 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C2954 f55303;

    /* JADX INFO: renamed from: ۜ */
    public String[] mo35950() {
        return new String[0];
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract JSONObject mo28740(JSONObject jSONObject);

    /* JADX INFO: renamed from: ᩻ */
    public abstract JSONObject mo28741();

    public AbstractC18516(C2954 c2954) {
        this.f55303 = c2954;
    }

    /* JADX INFO: renamed from: ֫ */
    public JSONArray mo28739(JSONObject jSONObject, JSONObject jSONObject2) {
        return JSON.array();
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObjectM7768;
        String str;
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7772("string", "Normalized archive path when available.")).add("entryPath", C3935.m7772("string", "Affected ZIP entry when available; empty for the archive."));
        String[] strArrMo35950 = mo35950();
        int length = strArrMo35950.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str2 = strArrMo35950[i];
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
                jSONObjectAdd.add(str2, C3935.m7772("integer", str));
                i++;
            } else {
                if (this instanceof C15833) {
                    jSONObjectM7768 = C3935.m7764("No automatic follow-up action.");
                } else {
                    jSONObjectM7768 = C3935.m7768("Executable continuation; list cursor errors may provide a restart.", C3935.m7763(mo5351(), mo5353(), "continue"), C3935.m7763(mo5351(), mo5353(), "retry"));
                }
                return C3935.m7765("Result for " + mo5353() + ".", mo28741(), C3935.m7770(C3935.m7762(jSONObjectAdd, "ZIP read diagnostics.")), jSONObjectM7768);
            }
        }
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c5276.f12412;
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
        for (String str : mo35950()) {
            JSONValue jSONValue3 = jSONObject.get(str);
            if (jSONValue3 == null) {
                jSONValue3 = JSON.NULL;
            }
            jSONObjectAdd2.add(str, jSONValue3);
        }
        return C21370.m48412(c5276, jSONObjectAdd2, c5276.f12407);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        try {
            JSONObject jSONObjectMo28740 = mo28740(jSONObject);
            return new C14663(C21370.m48410(jSONObjectMo28740, mo28739(jSONObject, jSONObjectMo28740)));
        } catch (C5276 e) {
            if ((this instanceof C12482) && "ZIP_INVALID_CURSOR".equals(e.f12413)) {
                throw e.m11412(JSON.array().add(C11982.m27418(new JSONObject(jSONObject).put("cursor", "").put(MotionUtils.EASING_TYPE_PATH, e.f12412.getString(MotionUtils.EASING_TYPE_PATH)), "mt_zip_list", "retry", "Discard earlier pages and restart the ZIP listing.")));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m42069(boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute or Home-relative ZIP file path; split archives are not supported."));
        if (z) {
            jSONObjectAdd.add("password", C3935.m7775("string", "Password for the selected entry; pass an empty string if that entry is unencrypted, even when other entries are encrypted."));
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static JSONObject m42070() {
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute archive path.")).add("entryPath", C3935.m7775("string", "Exact case-sensitive path inside the ZIP."));
    }
}
