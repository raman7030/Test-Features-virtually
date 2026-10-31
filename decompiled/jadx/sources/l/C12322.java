package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12322 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19793 f36876;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12821 f36877;

    public C12322(C12821 c12821, C19793 c19793) {
        this.f36877 = c12821;
        this.f36876 = c19793;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C13027 m29883(C4561 c4561, String str, boolean z) throws C3059 {
        C4355 c4355M31188 = this.f36877.m31188(str, z, new C21495(this, c4561, new C6595(c4561.f14561, c4561.f14563, c4561.f14560)));
        c4561.f14566 = c4355M31188.f13995;
        c4561.f14559 = true;
        c4561.f14558 = true;
        c4561.f14565 = c4355M31188.f13997;
        JSONArray jSONArray = c4355M31188.f13996;
        c4561.f14557 = new JSONArray(jSONArray);
        c4561.f14556 = "local_publish";
        C9126 c9126 = (C9126) c4355M31188.f13999;
        c4561.f14564 = c9126.f27643;
        long j = c4355M31188.f13998;
        c4561.f14555 = j;
        if (c9126.f27642 != j) {
            throw m29878("Published local size does not match the workspace byte count.");
        }
        return new C13027(c4561.f14562, c9126.f27645, c9126.f27644, c9126.f27646, c4355M31188.f13995, new JSONArray(jSONArray), c4355M31188.f13998);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C9126 m29880(C12322 c12322, C4561 c4561, C6595 c6595, BufferedOutputStream bufferedOutputStream) {
        c4561.f14556 = "workspace_read";
        C3150 c3150 = new C3150(bufferedOutputStream);
        try {
            C9126 c9126M45522 = c12322.f36876.m45522(c6595, c3150);
            c4561.f14564 = c9126M45522.f27643;
            if (c9126M45522.f27642 != c3150.f9841) {
                throw m29878("Workspace entry byte count does not match bytes written.");
            }
            c4561.f14556 = "local_publish";
            C4561.m13415(c4561, c3150);
            return c9126M45522;
        } catch (Throwable th) {
            C4561.m13415(c4561, c3150);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C13027 m29882(C4561 c4561, String str, boolean z) throws C3059 {
        C20707 c20707 = new C20707(c4561.f14561, c4561.f14563, c4561.f14560, z);
        c4561.f14556 = "local_read";
        C9126 c9126M31190 = this.f36877.m31190(str, new C22200(this, c4561, c20707));
        c4561.f14559 = true;
        c4561.f14558 = true;
        c4561.f14557 = JSON.array();
        c4561.f14564 = c9126M31190.f27643;
        long j = c9126M31190.f27642;
        c4561.f14555 = j;
        if (j < 0) {
            throw m29878("Workspace returned an invalid copied byte count.");
        }
        return new C13027(c4561.f14562, c9126M31190.f27645, c9126M31190.f27644, c9126M31190.f27646, c4561.f14566, JSON.array(), c9126M31190.f27642);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C9126 m29881(C12322 c12322, C4561 c4561, C20707 c20707, C21289 c21289) {
        c4561.f14566 = c21289.f68648;
        c4561.f14565 = "atomic";
        c4561.f14556 = "overlay_publish";
        return c12322.f36876.m45523(c20707, new C20084(c21289, c4561));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m29878(String str) {
        return C3059.m9369("WORKSPACE_ENTRY_SOURCE_INVALID", str, "fatal", null, JSON.object().add("backendReason", "byte_count_mismatch"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13027 m29884(String str, String str2, String str3, String str4, String str5, boolean z) throws C3059 {
        JSONValue jSONValue;
        if ("workspace_to_local".equals(str) || "local_to_edit_session".equals(str)) {
            if ("local_to_edit_session".equals(str) && (str3 == null || str3.isEmpty())) {
                throw C3059.m9364("local_to_edit_session requires a non-empty editSessionId", "editSessionId", str3 != null ? JSON.value(str3) : null, JSON.array(), JSON.object().add("editSessionId", "ab12cd34"));
            }
            C4561 c4561 = new C4561(str, str2, str3, str4);
            try {
                if ("workspace_to_local".equals(str)) {
                    return m29883(c4561, str5, z);
                }
                return m29882(c4561, str5, z);
            } catch (IOException e) {
                throw m29879(C3059.m9369("EDIT_SESSION_STORAGE_FAILED", "Failed to write the workspace ZIP entry.", "fatal", null, JSON.object().add("operation", "overlay_publish").add("backendReason", e.getClass().getSimpleName())), c4561);
            } catch (C3059 e2) {
                e = e2;
                if (e.f9605) {
                    throw e;
                }
                String str6 = e.f9610;
                if ("EDIT_SESSION_STORAGE_FAILED".equals(str6)) {
                    JSONObject jSONObjectObject = JSON.object();
                    for (JSONObject.Member member : e.f9609) {
                        jSONObjectObject.put(member.getName(), member.getValue());
                    }
                    jSONObjectObject.put("backendReason", "workspace_storage_failure");
                    e = C3059.m9369(str6, "Edit session storage failed.", e.f9611, e.f9604, jSONObjectObject);
                }
                String str7 = e.f9610;
                JSONObject jSONObject = e.f9609;
                JSONValue jSONValue2 = jSONObject.get("localPath");
                if (jSONValue2 != null && jSONValue2.isString()) {
                    c4561.f14566 = jSONValue2.asString();
                } else if (("FILE_ACCESS_DENIED".equals(str7) || "FILE_ACCESS_ROOT_PROTECTED".equals(str7)) && (jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH)) != null && jSONValue.isString()) {
                    c4561.f14566 = jSONObject.get(MotionUtils.EASING_TYPE_PATH).asString();
                }
                JSONValue jSONValue3 = jSONObject.get("changed");
                if (jSONValue3 != null && jSONValue3.isBoolean()) {
                    c4561.f14559 = jSONValue3.asBoolean();
                }
                JSONValue jSONValue4 = jSONObject.get("stateKnown");
                if (jSONValue4 != null && jSONValue4.isBoolean()) {
                    c4561.f14558 = jSONValue4.asBoolean();
                }
                JSONValue jSONValue5 = jSONObject.get("operationMode");
                if (jSONValue5 != null && jSONValue5.isString()) {
                    c4561.f14565 = jSONValue5.asString();
                }
                JSONValue jSONValue6 = jSONObject.get("warnings");
                if (jSONValue6 != null && jSONValue6.isArray()) {
                    c4561.f14557 = new JSONArray(jSONValue6.asArray());
                }
                JSONValue jSONValue7 = jSONObject.get("bytesCopied");
                if (jSONValue7 != null) {
                    c4561.f14555 = jSONValue7.isNumber() ? jSONValue7.asLong() : -1L;
                }
                JSONValue jSONValue8 = jSONObject.get("editRevision");
                if (jSONValue8 != null && jSONValue8.isNumber()) {
                    c4561.f14564 = Integer.valueOf(jSONValue8.asInt());
                }
                if ("EDIT_SESSION_STORAGE_FAILED".equals(str7)) {
                    c4561.f14555 = -1L;
                }
                throw m29879(e, c4561);
            }
        }
        throw C3059.m9364("Invalid direction", "direction", str != null ? JSON.value(str) : null, JSON.array("workspace_to_local", "local_to_edit_session"), JSON.object().add("direction", "workspace_to_local"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m29879(C3059 c3059, C4561 c4561) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject<JSONObject.Member> jSONObject = c3059.f9609;
        JSONArray jSONArray = c3059.f9604;
        String str = c3059.f9611;
        String str2 = c3059.f9610;
        for (JSONObject.Member member : jSONObject) {
            jSONObjectObject.put(member.getName(), member.getValue());
        }
        JSONObject jSONObjectPut = jSONObjectObject.put("direction", c4561.f14562).put("workspaceId", c4561.f14561);
        String str3 = c4561.f14563;
        jSONObjectPut.put("editSessionId", str3 == null ? JSON.NULL : JSON.value(str3)).put("entryName", c4561.f14560).put("locator", C13169.m31925("zip_entry", c4561.f14560, (String) null, (String) null, (String) null, (String) null));
        String str4 = c4561.f14566;
        if (str4 != null) {
            jSONObjectObject.put("localPath", str4);
        }
        JSONValue jSONValue = jSONObjectObject.get("operation");
        if (jSONValue == null || !jSONValue.isString()) {
            String str5 = c4561.f14556;
            jSONObjectObject.put("operation", str5 == null ? JSON.NULL : JSON.value(str5));
        }
        JSONValue jSONValue2 = jSONObjectObject.get("backendReason");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            jSONObjectObject.put("backendReason", JSON.NULL);
        }
        JSONObject jSONObjectPut2 = jSONObjectObject.put("changed", c4561.f14559);
        String str6 = c4561.f14565;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("operationMode", str6 == null ? JSON.NULL : JSON.value(str6)).put("stateKnown", c4561.f14558).put("warnings", new JSONArray(c4561.f14557));
        long j = c4561.f14555;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("bytesCopied", j < 0 ? JSON.NULL : JSON.value(j));
        Integer num = c4561.f14564;
        jSONObjectPut4.put("editRevision", num == null ? JSON.NULL : JSON.value(num.intValue())).put("safeToRetry", c4561.f14558 && !c4561.f14559);
        if (c3059.f9607) {
            return C3059.m9365(str2, c3059.getMessage(), str, jSONArray, jSONObjectObject);
        }
        return C3059.m9369(str2, c3059.getMessage(), str, jSONArray, jSONObjectObject);
    }
}
