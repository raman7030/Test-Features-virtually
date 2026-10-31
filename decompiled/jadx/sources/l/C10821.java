package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* JADX INFO: renamed from: l.ۧۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J79K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10821 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m27053(EnumC1180 enumC1180, JSONValue jSONValue, int i, String str) {
        return AbstractC4708.m13784(enumC1180, "application/json", m27052(jSONValue, i, str).toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m27051(JSONObject jSONObject, JSONValue jSONValue) {
        JSONObject jSONObjectAdd = JSON.object().add("jsonrpc", UMCrashManager.CM_VERSION);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return jSONObjectAdd.add("id", jSONValue).add(o.c, jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m27052(JSONValue jSONValue, int i, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("jsonrpc", UMCrashManager.CM_VERSION);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return jSONObjectAdd.add("id", jSONValue).add(d.O, JSON.object().add("code", i).add("message", str));
    }
}
