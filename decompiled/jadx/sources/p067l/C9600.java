package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S77V */
/* JADX INFO: loaded from: classes3.dex */
public final class C9600 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m22371(C22718 c22718) {
        return C21370.m48410(JSON.object().add("workspaceId", c22718.f71657).add("editSessionId", c22718.f71656).add("locator", C14884.m34055(c22718.f71663, c22718.f71659)).add("newTargetVersion", c22718.f71662), JSON.array());
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m22370(C4336 c4336) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c4336.f9687).add("editSessionId", c4336.f9688).add("changed", c4336.f9685).add("changedCount", c4336.f9686).add("noOpCount", c4336.f9690);
        ArrayList<C9306> arrayList = c4336.f9689;
        JSONArray jSONArrayArray = JSON.array();
        for (C9306 c9306 : arrayList) {
            jSONArrayArray.add(JSON.object().add("index", c9306.f25297).add("locator", C14884.m34021("resource", (String) null, (String) null, (String) null, (String) null, c9306.f25300)).add("variant", c9306.f25299).add("changed", c9306.f25296).add("newTargetVersion", c9306.f25298));
        }
        return C21370.m48410(jSONObjectAdd.add("results", jSONArrayArray), JSON.array());
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONObject m22376(C5276 c5276) {
        return C21370.m48412(c5276, C18426.m41996(c5276.f12412, "workspaceId", JSON.object(), "workspaceId"), m22373(c5276));
    }

    /* JADX INFO: renamed from: ܿ */
    public static JSONObject m22377(C5276 c5276) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c5276.f12412;
        JSONObject jSONObjectM41996 = C18426.m41996(jSONObject, "currentTargetVersion", C18426.m41996(jSONObject, "editSessionId", C18426.m41996(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId").add("locator", m22372(c5276)), "currentTargetVersion");
        JSONValue jSONValue = jSONObject.get("failedEditIndex");
        if (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM41996.add("failedEditIndex", jSONValue);
        JSONArray jSONArray = jSONObject.getJSONArray("failures");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                JSONValue jSONValue2 = jSONObjectAsObject.get("line");
                JSONValue jSONValue3 = jSONObjectAsObject.get("column");
                JSONValue jSONValueM32687 = C14214.m32687(jSONObjectAsObject);
                String string = jSONObjectAsObject.getString("className", null);
                Iterator it2 = it;
                String string2 = jSONObjectAsObject.getString("errorCode", null);
                String string3 = jSONObjectAsObject.getString("message", null);
                JSONObject jSONObject2 = jSONObjectAdd;
                Integer numValueOf = (jSONValue2 == null || jSONValue2.isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1));
                Integer numValueOf2 = (jSONValue3 == null || jSONValue3.isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1));
                jSONArrayArray.add(JSON.object().add("locator", jSONValueM32687).add("className", string).add("errorCode", string2).add("message", string3).add("line", numValueOf == null ? JSON.NULL : JSON.value(numValueOf.intValue())).add("column", numValueOf2 == null ? JSON.NULL : JSON.value(numValueOf2.intValue())));
                it = it2;
                jSONObjectAdd = jSONObject2;
            }
        }
        return C21370.m48412(c5276, jSONObjectAdd.add("failures", jSONArrayArray), m22373(c5276));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static JSONObject m22378(C5276 c5276) {
        JSONObject jSONObject = c5276.f12412;
        JSONObject jSONObject2 = jSONObject.getJSONObject("resourceNamePolicy");
        JSONObject jSONObjectM41996 = C18426.m41996(jSONObject, "currentTargetVersion", C18426.m41996(jSONObject, "variant", C18426.m41996(jSONObject, "editSessionId", C18426.m41996(jSONObject, "workspaceId", JSON.object(), "workspaceId"), "editSessionId").add("locator", m22372(c5276)), "variant"), "currentTargetVersion");
        JSONValue jSONValue = jSONObject.get("failedEditIndex");
        if (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM41996.add("failedEditIndex", jSONValue).add("resourceNamePolicy", jSONObject2 == null ? JSON.NULL : new JSONObject(jSONObject2));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c5276.f12407.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            if ("mt_apk_resource_read".equals(jSONObjectAsObject.getString("tool", null))) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C21370.m48412(c5276, jSONObjectAdd, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m22374() {
        return C3935.m7765("Result for mt_apk_session_create. data returns the new edit session id.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id used for this edit session.")).add("editSessionId", C3935.m7772("string", "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace.")), "Successful mt_apk_session_create data."), C3935.m7770(C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id, or null.")), "mt_apk_session_create diagnostics.")), m22369());
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONObject m22375() {
        return C3935.m7765("Result for mt_apk_edit_text. data returns the edited locator and new targetVersion for the next edit of the same target.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id used for this edit session.")).add("editSessionId", C3935.m7772("string", "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace.")).add("locator", C3935.m7772("string", "Edited locator for this edit_text request.")).add("newTargetVersion", C3935.m7772("string", "Version token of the edited target after this successful edit (16 lowercase hex digits, or missing); pass this for the next edit of the same target.")), "Successful edit_text data."), C3935.m7770(C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id, or null.")).add("editSessionId", C3935.m7772("string", "Edit session id to keep using when fixing current failures, or null.")).add("locator", C3935.m7772("string", "Rejected edit_text request locator, or null.")).add("currentTargetVersion", C3935.m7772("string", "Only set for TARGET_VERSION_MISMATCH; current targetVersion at rejection time. Prefer nextActions to re-read and copy data.targetVersion; use this value directly only for the same target and editSessionId when not re-reading.")).add("failedEditIndex", C3935.m7772("integer", "0-based edits[] index for runtime failures tied to one edit, or JSON null for parameter errors, stale targetVersion, and prepare failures.")).add("failures", C9417.m21913("type", "array", "description", "Edit session prepare failures bound to locator. Success data describes current saved session failures; edit_text error diagnostics describe the rejected candidate text.").add("items", C3935.m7762(JSON.object().add("locator", C3935.m7772("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C3935.m7772("string", "Dex class descriptor.")).add("errorCode", C3935.m7772("string", "Failure code.")).add("message", C3935.m7772("string", "Compiler error message.")).add("line", C3935.m7772("integer", "0-based line in the failed text, or null.")).add("column", C3935.m7772("integer", "0-based column in the failed text, or null.")), "One edit session prepare failure."))), "edit_text diagnostics.")), m22369());
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m22369() {
        return C3935.m7768("Edit success emits no follow-up actions; errors may return retry or workspace verification actions.", C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry"), C3935.m7763(C12981.m29761(), "mt_apk_read_text", "retry"), C3935.m7763(C12981.m29760(), "mt_apk_read_bytes", "retry"), C3935.m7763(C12981.m29770(), "mt_apk_list", "verify_workspace"), C3935.m7763(C12981.m29774(), "mt_apk_dex_read_class_outline", "verify_workspace"));
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONArray m22373(C5276 c5276) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c5276.f12407.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_workspace_open".equals(string) || "mt_apk_read_text".equals(string) || "mt_apk_read_bytes".equals(string) || "mt_apk_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m22372(C5276 c5276) {
        JSONObject jSONObject = c5276.f12412;
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue != null && !jSONValue.isNull()) {
            return C3223.m5573(jSONValue);
        }
        return C14884.m34055(jSONObject.getString("targetType", null), jSONObject.getString("target", null));
    }
}
