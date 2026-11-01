package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.umeng.analytics.pro.C0708d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* JADX INFO: renamed from: l.ۧۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J79K */
/* JADX INFO: loaded from: classes3.dex */
public final class C12653 {
    /* JADX INFO: renamed from: ֫ */
    public static C10196 m29098(EnumC3490 enumC3490, JSONValue jSONValue, int i, String str) {
        return AbstractC6843.m15660(enumC3490, "application/json", m29097(jSONValue, i, str).toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m29096(JSONObject jSONObject, JSONValue jSONValue) {
        JSONObject jSONObjectAdd = JSON.object().add("jsonrpc", UMCrashManager.CM_VERSION);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return jSONObjectAdd.add("id", jSONValue).add(C0252o.f1208c, jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m29097(JSONValue jSONValue, int i, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("jsonrpc", UMCrashManager.CM_VERSION);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return jSONObjectAdd.add("id", jSONValue).add(C0708d.f2599O, JSON.object().add("code", i).add("message", str));
    }
}
