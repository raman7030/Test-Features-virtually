package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.umeng.analytics.pro.C0708d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3935 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7762(JSONObject jSONObject, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("type", "object").add("additionalProperties", false);
        if (str != null) {
            jSONObjectAdd.add("description", str);
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("properties", jSONObject);
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONObject.names().iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        jSONObjectAdd2.add(AnnotationHandler.REQUIRED, jSONArrayArray);
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONObject m7774(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put("type", JSON.array().add("object").add("null"));
        return jSONObject2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7765(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        return m7762(JSON.object().add("ok", m7775(ClassTransform.BOOLEAN, "Whether the tool call succeeded.")).add(AbstractC0213e.f989m, m7774(jSONObject)).add(C0708d.f2599O, m7774(jSONObject2)).add("nextActions", jSONObject3), str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m7770(JSONObject jSONObject) {
        return m7762(JSON.object().add("code", m7775("string", "Business error code.")).add("message", m7775("string", "Human-readable error message.")).add("severity", m7769("info: informational condition; warning: expected or correctable rejection; fatal: blocking execution, access, or capability failure under current conditions, not a permanently impossible task. Use recoverable and retrySameArguments to decide recovery; severity alone does not determine retry.", "info", "warning", "fatal")).add("recoverable", m7775(ClassTransform.BOOLEAN, "Whether this task has a correction path, possibly by correcting arguments or changing state. This does not imply retrying unchanged arguments, guarantee success, or authorize a different target, access, or destructive scope. nextActions may be empty when the correction requires caller judgment.")).add("retrySameArguments", m7775(ClassTransform.BOOLEAN, "Whether retrying the same arguments is appropriate.")).add("argument", m7772("string", "Invalid argument name, or null when not applicable.")).add("badValue", m7772("string", "Invalid value as text: strings are returned unchanged; other non-null values are JSON-encoded. Null for JSON null or an unavailable value; use badValueType to distinguish them. Do not JSON-parse a string badValue.")).add("badValueType", m7772("string", "Original invalid value JSON type: string, number, boolean, array, object, or null; null when not applicable.")).add("allowedValues", m7771("Allowed values as strings.")).add("example", m7772("string", "JSON-encoded example text, or null when not applicable.")).add("diagnostics", m7774(jSONObject)), "Tool error details when ok=false.");
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONObject m7775(String str, String str2) {
        JSONObject jSONObjectAdd = JSON.object().add("type", str);
        if (str2 != null) {
            jSONObjectAdd.add("description", str2);
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m7772(String str, String str2) {
        JSONObject jSONObjectAdd = JSON.object().add("type", JSON.array().add(str).add("null"));
        jSONObjectAdd.add("description", str2);
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7766(String str, String str2) {
        return m7775("string", str2).add("enum", JSON.array().add(str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7769(String str, String... strArr) {
        JSONObject jSONObjectM7775 = m7775("string", str);
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            jSONArrayArray.add(str2);
        }
        return jSONObjectM7775.add("enum", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m7771(String str) {
        return C9417.m21913("type", "array", "description", str).add("items", m7775("string", "String value."));
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m7773(String str, String... strArr) {
        JSONObject jSONObjectM7769 = m7769(str, strArr);
        jSONObjectM7769.put("type", JSON.array("string", "null"));
        jSONObjectM7769.getJSONArray("enum").add(JSON.NULL);
        return jSONObjectM7769;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7767(String str, String str2, String str3) {
        return m7762(JSON.object().add("hasMore", m7775(ClassTransform.BOOLEAN, "Whether another page is available.")).add("nextCursor", m7772("string", "Opaque cursor for mt_apk_continue, or null on the last page.")).add("returnedCount", m7775("integer", str)).add("limitMax", m7775("integer", str2)).add("totalAvailableCount", m7772("integer", str3)), "Pagination metadata.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7768(String str, JSONObject... jSONObjectArr) {
        JSONArray jSONArrayArray = JSON.array();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (JSONObject jSONObject : jSONObjectArr) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getJSONObject("properties"));
            JSONObject jSONObject3 = jSONObject2.getJSONObject("purpose");
            jSONObject2.remove("purpose");
            String string = new JSONObject(jSONObject).put("properties", jSONObject2).toString();
            JSONArray jSONArray = (JSONArray) linkedHashMap.get(string);
            if (jSONArray == null) {
                JSONArray jSONArray2 = new JSONArray(jSONObject3.getJSONArray("enum"));
                linkedHashMap.put(string, jSONArray2);
                jSONObject2.put("purpose", new JSONObject(jSONObject3).put("enum", jSONArray2));
                jSONArrayArray.add(new JSONObject(jSONObject).put("properties", new JSONObject(jSONObject.getJSONObject("properties")).put("purpose", jSONObject2.getJSONObject("purpose"))));
            } else {
                for (JSONValue jSONValue : jSONObject3.getJSONArray("enum")) {
                    if (!jSONArray.values().contains(jSONValue)) {
                        jSONArray.add(jSONValue);
                    }
                }
            }
        }
        return C9417.m21913("type", "array", "description", str).add("items", JSON.object().add("anyOf", jSONArrayArray));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7764(String str) {
        return C9417.m21913("type", "array", "description", str).add("items", m7762(JSON.object(), "Unused nextActions item; this array is always empty."));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7763(JSONObject jSONObject, String str, String str2) {
        return m7762(JSON.object().add("tool", m7766(str, "Tool to call.")).add("purpose", m7766(str2, "Action purpose.")).add("description", m7775("string", "Why this action is useful.")).add("arguments", m7761(jSONObject).put("description", "Copy these arguments unchanged. Parameter meanings are defined by the target tool inputSchema.")), (String) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7761(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.remove("description");
        JSONObject<JSONObject.Member> jSONObject3 = jSONObject.getJSONObject("properties");
        if (jSONObject3 != null) {
            JSONObject jSONObjectObject = JSON.object();
            for (JSONObject.Member member : jSONObject3) {
                jSONObjectObject.add(member.getName(), m7761(member.getValue().asObject()));
            }
            jSONObject2.put("properties", jSONObjectObject);
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("items");
        if (jSONObject4 != null) {
            jSONObject2.put("items", m7761(jSONObject4));
        }
        return jSONObject2;
    }
}
