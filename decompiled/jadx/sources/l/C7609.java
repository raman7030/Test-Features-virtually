package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S77V */
/* JADX INFO: loaded from: classes3.dex */
public final class C7609 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m20392(C21412 c21412) {
        return C19993.m46095(JSON.object().add("workspaceId", c21412.f68959).add("editSessionId", c21412.f68958).add("locator", C13169.m31959(c21412.f68965, c21412.f68961)).add("newTargetVersion", c21412.f68964), JSON.array());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m20391(C2070 c2070) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c2070.f6903).add("editSessionId", c2070.f6904).add("changed", c2070.f6901).add("changedCount", c2070.f6902).add("noOpCount", c2070.f6906);
        ArrayList<C7300> arrayList = c2070.f6905;
        JSONArray jSONArrayArray = JSON.array();
        for (C7300 c7300 : arrayList) {
            jSONArrayArray.add(JSON.object().add("index", c7300.f22406).add("locator", C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, c7300.f22409)).add("variant", c7300.f22408).add("changed", c7300.f22405).add("newTargetVersion", c7300.f22407));
        }
        return C19993.m46095(jSONObjectAdd.add("results", jSONArrayArray), JSON.array());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m20397(C3059 c3059) {
        return C19993.m46097(c3059, C16895.m39755(c3059.f9609, "workspaceId", JSON.object(), "workspaceId"), m20394(c3059));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static JSONObject m20398(C3059 c3059) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c3059.f9609;
        JSONObject jSONObjectM39755 = C16895.m39755(jSONObject, "currentTargetVersion", C16895.m39755(jSONObject, "editSessionId", C16895.m39755(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId").add("locator", m20393(c3059)), "currentTargetVersion");
        JSONValue jSONValue = jSONObject.get("failedEditIndex");
        if (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM39755.add("failedEditIndex", jSONValue);
        JSONArray jSONArray = jSONObject.getJSONArray("failures");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                JSONValue jSONValue2 = jSONObjectAsObject.get("line");
                JSONValue jSONValue3 = jSONObjectAsObject.get("column");
                JSONValue jSONValueM30622 = C12464.m30622(jSONObjectAsObject);
                String string = jSONObjectAsObject.getString("className", null);
                Iterator it2 = it;
                String string2 = jSONObjectAsObject.getString("errorCode", null);
                String string3 = jSONObjectAsObject.getString("message", null);
                JSONObject jSONObject2 = jSONObjectAdd;
                Integer numValueOf = (jSONValue2 == null || jSONValue2.isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1));
                Integer numValueOf2 = (jSONValue3 == null || jSONValue3.isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1));
                jSONArrayArray.add(JSON.object().add("locator", jSONValueM30622).add("className", string).add("errorCode", string2).add("message", string3).add("line", numValueOf == null ? JSON.NULL : JSON.value(numValueOf.intValue())).add("column", numValueOf2 == null ? JSON.NULL : JSON.value(numValueOf2.intValue())));
                it = it2;
                jSONObjectAdd = jSONObject2;
            }
        }
        return C19993.m46097(c3059, jSONObjectAdd.add("failures", jSONArrayArray), m20394(c3059));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m20399(C3059 c3059) {
        JSONObject jSONObject = c3059.f9609;
        JSONObject jSONObject2 = jSONObject.getJSONObject("resourceNamePolicy");
        JSONObject jSONObjectM39755 = C16895.m39755(jSONObject, "currentTargetVersion", C16895.m39755(jSONObject, "variant", C16895.m39755(jSONObject, "editSessionId", C16895.m39755(jSONObject, "workspaceId", JSON.object(), "workspaceId"), "editSessionId").add("locator", m20393(c3059)), "variant"), "currentTargetVersion");
        JSONValue jSONValue = jSONObject.get("failedEditIndex");
        if (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM39755.add("failedEditIndex", jSONValue).add("resourceNamePolicy", jSONObject2 == null ? JSON.NULL : new JSONObject(jSONObject2));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c3059.f9604.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            if ("mt_apk_resource_read".equals(jSONObjectAsObject.getString("tool", null))) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C19993.m46097(c3059, jSONObjectAdd, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m20395() {
        return C1648.m5535("Result for mt_apk_session_create. data returns the new edit session id.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id used for this edit session.")).add("editSessionId", C1648.m5542("string", "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace.")), "Successful mt_apk_session_create data."), C1648.m5540(C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id, or null.")), "mt_apk_session_create diagnostics.")), m20390());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m20396() {
        return C1648.m5535("Result for mt_apk_edit_text. data returns the edited locator and new targetVersion for the next edit of the same target.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id used for this edit session.")).add("editSessionId", C1648.m5542("string", "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace.")).add("locator", C1648.m5542("string", "Edited locator for this edit_text request.")).add("newTargetVersion", C1648.m5542("string", "Version token of the edited target after this successful edit (16 lowercase hex digits, or missing); pass this for the next edit of the same target.")), "Successful edit_text data."), C1648.m5540(C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id, or null.")).add("editSessionId", C1648.m5542("string", "Edit session id to keep using when fixing current failures, or null.")).add("locator", C1648.m5542("string", "Rejected edit_text request locator, or null.")).add("currentTargetVersion", C1648.m5542("string", "Only set for TARGET_VERSION_MISMATCH; current targetVersion at rejection time. Prefer nextActions to re-read and copy data.targetVersion; use this value directly only for the same target and editSessionId when not re-reading.")).add("failedEditIndex", C1648.m5542("integer", "0-based edits[] index for runtime failures tied to one edit, or JSON null for parameter errors, stale targetVersion, and prepare failures.")).add("failures", C7416.m19939("type", "array", "description", "Edit session prepare failures bound to locator. Success data describes current saved session failures; edit_text error diagnostics describe the rejected candidate text.").add("items", C1648.m5532(JSON.object().add("locator", C1648.m5542("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C1648.m5542("string", "Dex class descriptor.")).add("errorCode", C1648.m5542("string", "Failure code.")).add("message", C1648.m5542("string", "Compiler error message.")).add("line", C1648.m5542("integer", "0-based line in the failed text, or null.")).add("column", C1648.m5542("integer", "0-based column in the failed text, or null.")), "One edit session prepare failure."))), "edit_text diagnostics.")), m20390());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m20390() {
        return C1648.m5538("Edit success emits no follow-up actions; errors may return retry or workspace verification actions.", C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry"), C1648.m5533(C11166.m27699(), "mt_apk_read_text", "retry"), C1648.m5533(C11166.m27698(), "mt_apk_read_bytes", "retry"), C1648.m5533(C11166.m27708(), "mt_apk_list", "verify_workspace"), C1648.m5533(C11166.m27712(), "mt_apk_dex_read_class_outline", "verify_workspace"));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONArray m20394(C3059 c3059) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c3059.f9604.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_workspace_open".equals(string) || "mt_apk_read_text".equals(string) || "mt_apk_read_bytes".equals(string) || "mt_apk_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m20393(C3059 c3059) {
        JSONObject jSONObject = c3059.f9609;
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue != null && !jSONValue.isNull()) {
            return C0899.m3254(jSONValue);
        }
        return C13169.m31959(jSONObject.getString("targetType", null), jSONObject.getString("target", null));
    }
}
