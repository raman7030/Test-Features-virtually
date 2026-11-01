package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* JADX INFO: renamed from: l.ܰۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H79P */
/* JADX INFO: loaded from: classes3.dex */
public final class C15451 {

    /* JADX INFO: renamed from: ֫ */
    public final C12100 f44142;

    /* JADX INFO: renamed from: ۧ */
    public final JSONObject f44143;

    /* JADX INFO: renamed from: ܽ */
    public final C13993 f44144;

    public C15451(C12100 c12100, JSONObject jSONObject, C13993 c13993) {
        this.f44142 = c12100;
        this.f44143 = jSONObject;
        this.f44144 = c13993;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24169 m35201(JSONObject jSONObject) {
        C24169 c24169M53446;
        JSONValue jSONValue = jSONObject.get("id");
        JSONValue jSONValue2 = jSONObject.get("jsonrpc");
        JSONValue jSONValue3 = jSONObject.get(AbstractC0213e.f995s);
        if (jSONValue2 == null || !jSONValue2.isString() || !UMCrashManager.CM_VERSION.equals(jSONValue2.asString()) || jSONValue3 == null || !jSONValue3.isString()) {
            return C24169.m53446(EnumC3490.BAD_REQUEST, C12653.m29097(jSONValue, -32600, "Invalid Request"));
        }
        String strAsString = jSONValue3.asString();
        if (jSONValue == null && "tools/call".equals(strAsString)) {
            return C24169.m53445(EnumC3490.ACCEPTED);
        }
        try {
            if ("initialize".equals(strAsString)) {
                c24169M53446 = C24169.m53446(EnumC3490.OK, C12653.m29096(m35198(m35200(jSONObject)), jSONValue));
            } else {
                if ("notifications/initialized".equals(strAsString)) {
                    return C24169.m53445(EnumC3490.ACCEPTED);
                }
                if ("ping".equals(strAsString)) {
                    c24169M53446 = C24169.m53446(EnumC3490.OK, C12653.m29096(JSON.object(), jSONValue));
                } else if ("tools/list".equals(strAsString)) {
                    c24169M53446 = C24169.m53446(EnumC3490.OK, C12653.m29096(JSON.object().add("tools", this.f44144.m31798()), jSONValue));
                } else if ("tools/call".equals(strAsString)) {
                    c24169M53446 = C24169.m53446(EnumC3490.OK, C12653.m29096(m35199(m35197(jSONObject, "params")), jSONValue));
                } else {
                    c24169M53446 = C24169.m53446(EnumC3490.OK, C12653.m29097(jSONValue, -32601, "Method not found"));
                }
            }
        } catch (C5276 e) {
            c24169M53446 = C24169.m53446(EnumC3490.OK, C12653.m29097(jSONValue, -32602, e.getMessage()));
        } catch (Exception unused) {
            c24169M53446 = C24169.m53446(EnumC3490.OK, C12653.m29097(jSONValue, -32603, "Internal error"));
        }
        return jSONValue == null ? C24169.m53445(EnumC3490.ACCEPTED) : c24169M53446;
    }

    /* JADX INFO: renamed from: ֫ */
    private JSONObject m35198(String str) {
        return JSON.object().add("protocolVersion", str).add("serverInfo", this.f44143).add("capabilities", JSON.object().add("tools", JSON.object()));
    }

    /* JADX INFO: renamed from: ܽ */
    private String m35200(JSONObject jSONObject) throws C5276 {
        JSONObject jSONObjectM35197 = m35197(jSONObject, "params");
        if (jSONObjectM35197 == null) {
            throw C5276.m11406("Missing protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = jSONObjectM35197.get("protocolVersion");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406("Invalid protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return this.f44142.m27952(jSONValue.asString());
    }

    /* JADX INFO: renamed from: ۧ */
    private JSONObject m35199(JSONObject jSONObject) throws C5276 {
        if (jSONObject == null) {
            throw C5276.m11406("Missing params", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = jSONObject.get("name");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406("Missing name", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONObject jSONObjectM35197 = m35197(jSONObject, "arguments");
        if (jSONObjectM35197 == null) {
            jSONObjectM35197 = JSON.object();
        }
        return this.f44144.m31799(jSONObjectM35197, jSONValue.asString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m35197(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        if (!jSONValue.isObject()) {
            throw C5276.m11406("Invalid ".concat(str), (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asObject();
    }
}
