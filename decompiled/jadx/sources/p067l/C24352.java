package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y75Z */
/* JADX INFO: loaded from: classes.dex */
public final class C24352 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f77122;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f77123;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f77124;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Check an APK edit session without producing or signing an APK. runBuildChecks=false reports pending work and recorded failures. runBuildChecks=true runs pre-build content checks: prepare edited content, check changed entry readability, and merge Dex. It does not validate output paths, signing configuration, final APK packaging, or installability. Inspect buildCheckStatus and failures; passed applies only to these content checks.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "APK Edit Session Check";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_session_check";
    }

    public C24352(C21180 c21180) {
        this.f77124 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f77122;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"runBuildChecks\": {\n    \"type\": \"boolean\",\n    \"description\": \"Pass false for current edit session status only. Pass true to run the pre-build content checks described above without producing or signing an APK.\"\n  }\n}\n");
        this.f77122 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c5276.f12412;
        JSONObject jSONObjectAdd = C18426.m41996(jSONObject, "editSessionId", C18426.m41996(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId").add("runBuildChecks", jSONObject.getBoolean("runBuildChecks", false)).add("overlaySaved", jSONObject.getBoolean("overlaySaved", false)).add("failures", C14214.m32685(jSONObject.getJSONArray("failures")));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c5276.f12407.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_workspace_open".equals(string) || "mt_apk_read_text".equals(string) || "mt_apk_read_bytes".equals(string) || "mt_apk_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C21370.m48412(c5276, jSONObjectAdd, jSONArrayArray);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f77123;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM35171 = C1524.m35171();
        this.f77123 = jSONObjectM35171;
        return jSONObjectM35171;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            C18173.m41392();
            try {
                C7097 c7097M34047 = C14884.m34047(jSONObject);
                try {
                    C16681 c16681M47838 = this.f77124.m47838(c7097M34047);
                    int i = C10798.f29931;
                    return new C14663(C1524.m35167(c16681M47838));
                } catch (C5276 e) {
                    m53706(e, c7097M34047);
                    throw e;
                }
            } catch (C5276 e2) {
                JSONObject jSONObject2 = e2.f12412;
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
            int i2 = C10798.f29931;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53706(C5276 c5276, C7097 c7097) {
        JSONObject jSONObject = c5276.f12412;
        JSONValue jSONValueValue = JSON.value(c7097.f18502);
        if (!jSONObject.contains("workspaceId")) {
            jSONObject.put("workspaceId", jSONValueValue);
        }
        JSONValue jSONValueValue2 = JSON.value(c7097.f18500);
        if (!jSONObject.contains("editSessionId")) {
            jSONObject.put("editSessionId", jSONValueValue2);
        }
        JSONValue jSONValueValue3 = JSON.value(c7097.f18501);
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
