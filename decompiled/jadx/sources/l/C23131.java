package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y75Z */
/* JADX INFO: loaded from: classes.dex */
public final class C23131 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f74376;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f74377;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f74378;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Check an APK edit session without producing or signing an APK. runBuildChecks=false reports pending work and recorded failures. runBuildChecks=true runs pre-build content checks: prepare edited content, check changed entry readability, and merge Dex. It does not validate output paths, signing configuration, final APK packaging, or installability. Inspect buildCheckStatus and failures; passed applies only to these content checks.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "APK Edit Session Check";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_session_check";
    }

    public C23131(C19793 c19793) {
        this.f74378 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f74376;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"runBuildChecks\": {\n    \"type\": \"boolean\",\n    \"description\": \"Pass false for current edit session status only. Pass true to run the pre-build content checks described above without producing or signing an APK.\"\n  }\n}\n");
        this.f74376 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c3059.f9609;
        JSONObject jSONObjectAdd = C16895.m39755(jSONObject, "editSessionId", C16895.m39755(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId").add("runBuildChecks", jSONObject.getBoolean("runBuildChecks", false)).add("overlaySaved", jSONObject.getBoolean("overlaySaved", false)).add("failures", C12464.m30620(jSONObject.getJSONArray("failures")));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c3059.f9604.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_workspace_open".equals(string) || "mt_apk_read_text".equals(string) || "mt_apk_read_bytes".equals(string) || "mt_apk_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C19993.m46097(c3059, jSONObjectAdd, jSONArrayArray);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f74377;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM33057 = C13746.m33057();
        this.f74377 = jSONObjectM33057;
        return jSONObjectM33057;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            C16629.m39164();
            try {
                C4975 c4975M31951 = C13169.m31951(jSONObject);
                try {
                    C15060 c15060M45527 = this.f74378.m45527(c4975M31951);
                    int i = C8869.f27007;
                    return new C12936(C13746.m33053(c15060M45527));
                } catch (C3059 e) {
                    m51312(e, c4975M31951);
                    throw e;
                }
            } catch (C3059 e2) {
                JSONObject jSONObject2 = e2.f9609;
                JSONValue jSONValue = jSONObject.get("workspaceId");
                if (jSONValue == null || !jSONValue.isString()) {
                    jSONValue = JSON.NULL;
                }
                JSONObject jSONObjectPut = jSONObject2.put("workspaceId", jSONValue);
                JSONValue jSONValue2 = jSONObject.get("editSessionId");
                if (jSONValue2 == null || !jSONValue2.isString()) {
                    jSONValue2 = JSON.NULL;
                }
                jSONObjectPut.put("editSessionId", jSONValue2).put("runBuildChecks", false).put("overlaySaved", false).put("failures", JSON.array());
                throw e2;
            }
        } catch (Throwable th) {
            int i2 = C8869.f27007;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51312(C3059 c3059, C4975 c4975) {
        JSONObject jSONObject = c3059.f9609;
        JSONValue jSONValueValue = JSON.value(c4975.f15668);
        if (!jSONObject.contains("workspaceId")) {
            jSONObject.put("workspaceId", jSONValueValue);
        }
        JSONValue jSONValueValue2 = JSON.value(c4975.f15666);
        if (!jSONObject.contains("editSessionId")) {
            jSONObject.put("editSessionId", jSONValueValue2);
        }
        JSONValue jSONValueValue3 = JSON.value(c4975.f15667);
        if (!jSONObject.contains("runBuildChecks")) {
            jSONObject.put("runBuildChecks", jSONValueValue3);
        }
        JSONValue jSONValueValue4 = JSON.value(false);
        if (!jSONObject.contains("overlaySaved")) {
            jSONObject.put("overlaySaved", jSONValueValue4);
        }
        JSONArray jSONArrayArray = JSON.array();
        if (jSONObject.contains("failures")) {
            return;
        }
        jSONObject.put("failures", jSONArrayArray);
    }
}
