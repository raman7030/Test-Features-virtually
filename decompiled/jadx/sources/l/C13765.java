package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* JADX INFO: renamed from: l.ܰۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H79P */
/* JADX INFO: loaded from: classes3.dex */
public final class C13765 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10239 f41065;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject f41066;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12231 f41067;

    public C13765(C10239 c10239, JSONObject jSONObject, C12231 c12231) {
        this.f41065 = c10239;
        this.f41066 = jSONObject;
        this.f41067 = c12231;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22938 m33086(JSONObject jSONObject) {
        C22938 c22938M51055;
        JSONValue jSONValue = jSONObject.get("id");
        JSONValue jSONValue2 = jSONObject.get("jsonrpc");
        JSONValue jSONValue3 = jSONObject.get(e.s);
        if (jSONValue2 == null || !jSONValue2.isString() || !UMCrashManager.CM_VERSION.equals(jSONValue2.asString()) || jSONValue3 == null || !jSONValue3.isString()) {
            return C22938.m51055(EnumC1180.BAD_REQUEST, C10821.m27052(jSONValue, -32600, "Invalid Request"));
        }
        String strAsString = jSONValue3.asString();
        if (jSONValue == null && "tools/call".equals(strAsString)) {
            return C22938.m51054(EnumC1180.ACCEPTED);
        }
        try {
            if ("initialize".equals(strAsString)) {
                c22938M51055 = C22938.m51055(EnumC1180.OK, C10821.m27051(m33083(m33085(jSONObject)), jSONValue));
            } else {
                if ("notifications/initialized".equals(strAsString)) {
                    return C22938.m51054(EnumC1180.ACCEPTED);
                }
                if ("ping".equals(strAsString)) {
                    c22938M51055 = C22938.m51055(EnumC1180.OK, C10821.m27051(JSON.object(), jSONValue));
                } else if ("tools/list".equals(strAsString)) {
                    c22938M51055 = C22938.m51055(EnumC1180.OK, C10821.m27051(JSON.object().add("tools", this.f41067.m29736()), jSONValue));
                } else if ("tools/call".equals(strAsString)) {
                    c22938M51055 = C22938.m51055(EnumC1180.OK, C10821.m27051(m33084(m33082(jSONObject, "params")), jSONValue));
                } else {
                    c22938M51055 = C22938.m51055(EnumC1180.OK, C10821.m27052(jSONValue, -32601, "Method not found"));
                }
            }
        } catch (C3059 e) {
            c22938M51055 = C22938.m51055(EnumC1180.OK, C10821.m27052(jSONValue, -32602, e.getMessage()));
        } catch (Exception unused) {
            c22938M51055 = C22938.m51055(EnumC1180.OK, C10821.m27052(jSONValue, -32603, "Internal error"));
        }
        return jSONValue == null ? C22938.m51054(EnumC1180.ACCEPTED) : c22938M51055;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private JSONObject m33083(String str) {
        return JSON.object().add("protocolVersion", str).add("serverInfo", this.f41066).add("capabilities", JSON.object().add("tools", JSON.object()));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private String m33085(JSONObject jSONObject) throws C3059 {
        JSONObject jSONObjectM33082 = m33082(jSONObject, "params");
        if (jSONObjectM33082 == null) {
            throw C3059.m9364("Missing protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = jSONObjectM33082.get("protocolVersion");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return this.f41065.m25930(jSONValue.asString());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private JSONObject m33084(JSONObject jSONObject) throws C3059 {
        if (jSONObject == null) {
            throw C3059.m9364("Missing params", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = jSONObject.get("name");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Missing name", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONObject jSONObjectM33082 = m33082(jSONObject, "arguments");
        if (jSONObjectM33082 == null) {
            jSONObjectM33082 = JSON.object();
        }
        return this.f41067.m29737(jSONObjectM33082, jSONValue.asString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m33082(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        if (!jSONValue.isObject()) {
            throw C3059.m9364("Invalid ".concat(str), (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asObject();
    }
}
