package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 577G */
/* JADX INFO: loaded from: classes3.dex */
public final class C14214 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m32686() {
        return C3935.m7762(JSON.object(), "No tool-specific diagnostics.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m32685(JSONArray jSONArray) {
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                JSONValue jSONValue = jSONObjectAsObject.get("line");
                JSONValue jSONValue2 = jSONObjectAsObject.get("column");
                jSONArrayArray.add(JSON.object().add("locator", m32687(jSONObjectAsObject)).add("className", jSONObjectAsObject.getString("className", null)).add("errorCode", jSONObjectAsObject.getString("errorCode", null)).add("message", jSONObjectAsObject.getString("message", null)).add("line", (jSONValue == null || jSONValue.isNull()) ? JSON.NULL : JSON.value(jSONObjectAsObject.getInt("line", -1))).add("column", (jSONValue2 == null || jSONValue2.isNull()) ? JSON.NULL : JSON.value(jSONObjectAsObject.getInt("column", -1))));
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m32687(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue != null && !jSONValue.isNull()) {
            return C3223.m5573(jSONValue);
        }
        return C14884.m34055(jSONObject.getString("targetType", null), jSONObject.getString("target", null));
    }
}
