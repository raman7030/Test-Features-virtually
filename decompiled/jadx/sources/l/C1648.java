package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1648 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5532(JSONObject jSONObject, String str) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m5544(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put("type", JSON.array().add("object").add("null"));
        return jSONObject2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5535(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        return m5532(JSON.object().add("ok", m5545(ClassTransform.BOOLEAN, "Whether the tool call succeeded.")).add(e.m, m5544(jSONObject)).add(d.O, m5544(jSONObject2)).add("nextActions", jSONObject3), str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m5540(JSONObject jSONObject) {
        return m5532(JSON.object().add("code", m5545("string", "Business error code.")).add("message", m5545("string", "Human-readable error message.")).add("severity", m5539("info: informational condition; warning: expected or correctable rejection; fatal: blocking execution, access, or capability failure under current conditions, not a permanently impossible task. Use recoverable and retrySameArguments to decide recovery; severity alone does not determine retry.", "info", "warning", "fatal")).add("recoverable", m5545(ClassTransform.BOOLEAN, "Whether this task has a correction path, possibly by correcting arguments or changing state. This does not imply retrying unchanged arguments, guarantee success, or authorize a different target, access, or destructive scope. nextActions may be empty when the correction requires caller judgment.")).add("retrySameArguments", m5545(ClassTransform.BOOLEAN, "Whether retrying the same arguments is appropriate.")).add("argument", m5542("string", "Invalid argument name, or null when not applicable.")).add("badValue", m5542("string", "Invalid value as text: strings are returned unchanged; other non-null values are JSON-encoded. Null for JSON null or an unavailable value; use badValueType to distinguish them. Do not JSON-parse a string badValue.")).add("badValueType", m5542("string", "Original invalid value JSON type: string, number, boolean, array, object, or null; null when not applicable.")).add("allowedValues", m5541("Allowed values as strings.")).add("example", m5542("string", "JSON-encoded example text, or null when not applicable.")).add("diagnostics", m5544(jSONObject)), "Tool error details when ok=false.");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m5545(String str, String str2) {
        JSONObject jSONObjectAdd = JSON.object().add("type", str);
        if (str2 != null) {
            jSONObjectAdd.add("description", str2);
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m5542(String str, String str2) {
        JSONObject jSONObjectAdd = JSON.object().add("type", JSON.array().add(str).add("null"));
        jSONObjectAdd.add("description", str2);
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5536(String str, String str2) {
        return m5545("string", str2).add("enum", JSON.array().add(str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5539(String str, String... strArr) {
        JSONObject jSONObjectM5545 = m5545("string", str);
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            jSONArrayArray.add(str2);
        }
        return jSONObjectM5545.add("enum", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m5541(String str) {
        return C7416.m19939("type", "array", "description", str).add("items", m5545("string", "String value."));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m5543(String str, String... strArr) {
        JSONObject jSONObjectM5539 = m5539(str, strArr);
        jSONObjectM5539.put("type", JSON.array("string", "null"));
        jSONObjectM5539.getJSONArray("enum").add(JSON.NULL);
        return jSONObjectM5539;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5537(String str, String str2, String str3) {
        return m5532(JSON.object().add("hasMore", m5545(ClassTransform.BOOLEAN, "Whether another page is available.")).add("nextCursor", m5542("string", "Opaque cursor for mt_apk_continue, or null on the last page.")).add("returnedCount", m5545("integer", str)).add("limitMax", m5545("integer", str2)).add("totalAvailableCount", m5542("integer", str3)), "Pagination metadata.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5538(String str, JSONObject... jSONObjectArr) {
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
        return C7416.m19939("type", "array", "description", str).add("items", JSON.object().add("anyOf", jSONArrayArray));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5534(String str) {
        return C7416.m19939("type", "array", "description", str).add("items", m5532(JSON.object(), "Unused nextActions item; this array is always empty."));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5533(JSONObject jSONObject, String str, String str2) {
        return m5532(JSON.object().add("tool", m5536(str, "Tool to call.")).add("purpose", m5536(str2, "Action purpose.")).add("description", m5545("string", "Why this action is useful.")).add("arguments", m5531(jSONObject).put("description", "Copy these arguments unchanged. Parameter meanings are defined by the target tool inputSchema.")), (String) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5531(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.remove("description");
        JSONObject<JSONObject.Member> jSONObject3 = jSONObject.getJSONObject("properties");
        if (jSONObject3 != null) {
            JSONObject jSONObjectObject = JSON.object();
            for (JSONObject.Member member : jSONObject3) {
                jSONObjectObject.add(member.getName(), m5531(member.getValue().asObject()));
            }
            jSONObject2.put("properties", jSONObjectObject);
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("items");
        if (jSONObject4 != null) {
            jSONObject2.put("items", m5531(jSONObject4));
        }
        return jSONObject2;
    }
}
