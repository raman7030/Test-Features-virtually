package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes3.dex */
public final class C14079 {

    /* JADX INFO: renamed from: ֫ */
    public final C21180 f39890;

    /* JADX INFO: renamed from: ۧ */
    public final C14553 f39891;

    public C14079(C14553 c14553, C21180 c21180) {
        this.f39891 = c14553;
        this.f39890 = c21180;
    }

    /* JADX INFO: renamed from: ۧ */
    private C14749 m31943(C6703 c6703, String str, boolean z) throws C5276 {
        C6507 c6507M33274 = this.f39891.m33274(str, z, new C22797(this, c6703, new C8636(c6703.f17390, c6703.f17392, c6703.f17389)));
        c6703.f17395 = c6507M33274.f16811;
        c6703.f17388 = true;
        c6703.f17387 = true;
        c6703.f17394 = c6507M33274.f16813;
        JSONArray jSONArray = c6507M33274.f16812;
        c6703.f17386 = new JSONArray(jSONArray);
        c6703.f17385 = "local_publish";
        C11042 c11042 = (C11042) c6507M33274.f16815;
        c6703.f17393 = c11042.f30583;
        long j = c6507M33274.f16814;
        c6703.f17384 = j;
        if (c11042.f30582 != j) {
            throw m31938("Published local size does not match the workspace byte count.");
        }
        return new C14749(c6703.f17391, c11042.f30585, c11042.f30584, c11042.f30586, c6507M33274.f16811, new JSONArray(jSONArray), c6507M33274.f16814);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C11042 m31940(C14079 c14079, C6703 c6703, C8636 c8636, BufferedOutputStream bufferedOutputStream) {
        c6703.f17385 = "workspace_read";
        C5362 c5362 = new C5362(bufferedOutputStream);
        try {
            C11042 c11042M47833 = c14079.f39890.m47833(c8636, c5362);
            c6703.f17393 = c11042M47833.f30583;
            if (c11042M47833.f30582 != c5362.f12644) {
                throw m31938("Workspace entry byte count does not match bytes written.");
            }
            c6703.f17385 = "local_publish";
            C6703.m15303(c6703, c5362);
            return c11042M47833;
        } catch (Throwable th) {
            C6703.m15303(c6703, c5362);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14749 m31942(C6703 c6703, String str, boolean z) throws C5276 {
        C22048 c22048 = new C22048(c6703.f17390, c6703.f17392, c6703.f17389, z);
        c6703.f17385 = "local_read";
        C11042 c11042M33276 = this.f39891.m33276(str, new C23467(this, c6703, c22048));
        c6703.f17388 = true;
        c6703.f17387 = true;
        c6703.f17386 = JSON.array();
        c6703.f17393 = c11042M33276.f30583;
        long j = c11042M33276.f30582;
        c6703.f17384 = j;
        if (j < 0) {
            throw m31938("Workspace returned an invalid copied byte count.");
        }
        return new C14749(c6703.f17391, c11042M33276.f30585, c11042M33276.f30584, c11042M33276.f30586, c6703.f17395, JSON.array(), c11042M33276.f30582);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C11042 m31941(C14079 c14079, C6703 c6703, C22048 c22048, C22601 c22601) {
        c6703.f17395 = c22601.f71340;
        c6703.f17394 = "atomic";
        c6703.f17385 = "overlay_publish";
        return c14079.f39890.m47834(c22048, new C21456(c22601, c6703));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m31938(String str) {
        return C5276.m11411("WORKSPACE_ENTRY_SOURCE_INVALID", str, "fatal", null, JSON.object().add("backendReason", "byte_count_mismatch"));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14749 m31944(String str, String str2, String str3, String str4, String str5, boolean z) throws C5276 {
        JSONValue jSONValue;
        if ("workspace_to_local".equals(str) || "local_to_edit_session".equals(str)) {
            if ("local_to_edit_session".equals(str) && (str3 == null || str3.isEmpty())) {
                throw C5276.m11406("local_to_edit_session requires a non-empty editSessionId", "editSessionId", str3 != null ? JSON.value(str3) : null, JSON.array(), JSON.object().add("editSessionId", "ab12cd34"));
            }
            C6703 c6703 = new C6703(str, str2, str3, str4);
            try {
                if ("workspace_to_local".equals(str)) {
                    return m31943(c6703, str5, z);
                }
                return m31942(c6703, str5, z);
            } catch (IOException e) {
                throw m31939(C5276.m11411("EDIT_SESSION_STORAGE_FAILED", "Failed to write the workspace ZIP entry.", "fatal", null, JSON.object().add("operation", "overlay_publish").add("backendReason", e.getClass().getSimpleName())), c6703);
            } catch (C5276 e2) {
                e = e2;
                if (e.f12408) {
                    throw e;
                }
                String str6 = e.f12413;
                if ("EDIT_SESSION_STORAGE_FAILED".equals(str6)) {
                    JSONObject jSONObjectObject = JSON.object();
                    for (JSONObject.Member member : e.f12412) {
                        jSONObjectObject.put(member.getName(), member.getValue());
                    }
                    jSONObjectObject.put("backendReason", "workspace_storage_failure");
                    e = C5276.m11411(str6, "Edit session storage failed.", e.f12414, e.f12407, jSONObjectObject);
                }
                String str7 = e.f12413;
                JSONObject jSONObject = e.f12412;
                JSONValue jSONValue2 = jSONObject.get("localPath");
                if (jSONValue2 != null && jSONValue2.isString()) {
                    c6703.f17395 = jSONValue2.asString();
                } else if (("FILE_ACCESS_DENIED".equals(str7) || "FILE_ACCESS_ROOT_PROTECTED".equals(str7)) && (jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH)) != null && jSONValue.isString()) {
                    c6703.f17395 = jSONObject.get(MotionUtils.EASING_TYPE_PATH).asString();
                }
                JSONValue jSONValue3 = jSONObject.get("changed");
                if (jSONValue3 != null && jSONValue3.isBoolean()) {
                    c6703.f17388 = jSONValue3.asBoolean();
                }
                JSONValue jSONValue4 = jSONObject.get("stateKnown");
                if (jSONValue4 != null && jSONValue4.isBoolean()) {
                    c6703.f17387 = jSONValue4.asBoolean();
                }
                JSONValue jSONValue5 = jSONObject.get("operationMode");
                if (jSONValue5 != null && jSONValue5.isString()) {
                    c6703.f17394 = jSONValue5.asString();
                }
                JSONValue jSONValue6 = jSONObject.get("warnings");
                if (jSONValue6 != null && jSONValue6.isArray()) {
                    c6703.f17386 = new JSONArray(jSONValue6.asArray());
                }
                JSONValue jSONValue7 = jSONObject.get("bytesCopied");
                if (jSONValue7 != null) {
                    c6703.f17384 = jSONValue7.isNumber() ? jSONValue7.asLong() : -1L;
                }
                JSONValue jSONValue8 = jSONObject.get("editRevision");
                if (jSONValue8 != null && jSONValue8.isNumber()) {
                    c6703.f17393 = Integer.valueOf(jSONValue8.asInt());
                }
                if ("EDIT_SESSION_STORAGE_FAILED".equals(str7)) {
                    c6703.f17384 = -1L;
                }
                throw m31939(e, c6703);
            }
        }
        throw C5276.m11406("Invalid direction", "direction", str != null ? JSON.value(str) : null, JSON.array("workspace_to_local", "local_to_edit_session"), JSON.object().add("direction", "workspace_to_local"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m31939(C5276 c5276, C6703 c6703) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject<JSONObject.Member> jSONObject = c5276.f12412;
        JSONArray jSONArray = c5276.f12407;
        String str = c5276.f12414;
        String str2 = c5276.f12413;
        for (JSONObject.Member member : jSONObject) {
            jSONObjectObject.put(member.getName(), member.getValue());
        }
        JSONObject jSONObjectPut = jSONObjectObject.put("direction", c6703.f17391).put("workspaceId", c6703.f17390);
        String str3 = c6703.f17392;
        jSONObjectPut.put("editSessionId", str3 == null ? JSON.NULL : JSON.value(str3)).put("entryName", c6703.f17389).put("locator", C14884.m34021("zip_entry", c6703.f17389, (String) null, (String) null, (String) null, (String) null));
        String str4 = c6703.f17395;
        if (str4 != null) {
            jSONObjectObject.put("localPath", str4);
        }
        JSONValue jSONValue = jSONObjectObject.get("operation");
        if (jSONValue == null || !jSONValue.isString()) {
            String str5 = c6703.f17385;
            jSONObjectObject.put("operation", str5 == null ? JSON.NULL : JSON.value(str5));
        }
        JSONValue jSONValue2 = jSONObjectObject.get("backendReason");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            jSONObjectObject.put("backendReason", JSON.NULL);
        }
        JSONObject jSONObjectPut2 = jSONObjectObject.put("changed", c6703.f17388);
        String str6 = c6703.f17394;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("operationMode", str6 == null ? JSON.NULL : JSON.value(str6)).put("stateKnown", c6703.f17387).put("warnings", new JSONArray(c6703.f17386));
        long j = c6703.f17384;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("bytesCopied", j < 0 ? JSON.NULL : JSON.value(j));
        Integer num = c6703.f17393;
        jSONObjectPut4.put("editRevision", num == null ? JSON.NULL : JSON.value(num.intValue())).put("safeToRetry", c6703.f17387 && !c6703.f17388);
        if (c5276.f12410) {
            return C5276.m11407(str2, c5276.getMessage(), str, jSONArray, jSONObjectObject);
        }
        return C5276.m11411(str2, c5276.getMessage(), str, jSONArray, jSONObjectObject);
    }
}
