package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C74Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C6450 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m17820(C18623 c18623) {
        String[] strArr = {"thumb", "arm"};
        return C3059.m9365("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF disassembly requires instructionMode=arm or instructionMode=thumb.", "fatal", m17812(c18623, strArr), m17815(c18623.f57753, c18623.f57759, c18623.f57761, c18623.f57757, c18623.f57755, c18623.f57756, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m17824(C18623 c18623) {
        String[] strArr = {"thumb"};
        return C3059.m9365("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m17812(c18623, strArr), m17815(c18623.f57753, c18623.f57759, c18623.f57761, c18623.f57757, c18623.f57755, c18623.f57756, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m17819(C8039 c8039) {
        String[] strArr = {"thumb", "arm"};
        return C3059.m9365("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF instruction patch requires instructionMode=arm or instructionMode=thumb.", "fatal", m17811(c8039, strArr), m17815(c8039.f24787, c8039.f24790, c8039.f24791, c8039.f24788, c8039.f24785, c8039.f24782, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m17823(C8039 c8039) {
        String[] strArr = {"thumb"};
        return C3059.m9365("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m17811(c8039, strArr), m17815(c8039.f24787, c8039.f24790, c8039.f24791, c8039.f24788, c8039.f24785, c8039.f24782, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m17821(C19329 c19329) {
        String[] strArr = {"thumb", "arm"};
        return C3059.m9365("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF function CFG requires instructionMode=arm or instructionMode=thumb.", "fatal", m17813(c19329, strArr), m17815(c19329.f60774, c19329.f60777, c19329.f60779, c19329.f60775, c19329.f60772, c19329.f60773, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m17825(C19329 c19329) {
        String[] strArr = {"thumb"};
        return C3059.m9365("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m17813(c19329, strArr), m17815(c19329.f60774, c19329.f60777, c19329.f60779, c19329.f60775, c19329.f60772, c19329.f60773, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m17826(C22150 c22150) {
        String[] strArr = {"thumb", "arm"};
        return C3059.m9365("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF xref scan requires instructionMode=thumb or instructionMode=arm.", "fatal", m17814(c22150, strArr), m17817(c22150, "arm32_mode_required", ("virtual".equals(c22150.f71870) && (c22150.f71858 & 1) == 1) ? "odd target virtual address does not identify source instruction mode" : "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m17822(C22150 c22150) {
        String[] strArr = {"auto"};
        C3059 c3059M9364 = C3059.m9364("instructionMode must be auto for scanKind=data", "instructionMode", JSON.value(c22150.f71864), JSON.array("auto"), JSON.object().add("instructionMode", "auto"));
        JSONObject jSONObject = c3059M9364.f9609;
        for (JSONObject.Member member : m17817(c22150, "data_scan_requires_auto", "data scan does not decode instructions", strArr)) {
            jSONObject.put(member.getName(), member.getValue());
        }
        return c3059M9364.m9370(m17814(c22150, strArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m17816(C3059 c3059) {
        JSONObject jSONObject = c3059.f9609;
        return JSON.object().add("workspaceId", m17818(jSONObject, "workspaceId")).add("editSessionId", m17818(jSONObject, "editSessionId")).add("locator", m17818(jSONObject, "locator")).add("addressKind", m17818(jSONObject, "addressKind")).add("address", m17818(jSONObject, "address")).add("instructionMode", m17818(jSONObject, "instructionMode")).add("reason", m17818(jSONObject, "reason")).add("addressModeHint", m17818(jSONObject, "addressModeHint")).add("retryInstructionModes", m17810(jSONObject.getJSONArray("retryInstructionModes")));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m17828(C3059 c3059) {
        JSONObject jSONObject = c3059.f9609;
        return m17816(c3059).add("scanKind", m17818(jSONObject, "scanKind")).add("referenceKinds", m17810(jSONObject.getJSONArray("referenceKinds")));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m17827(C3059 c3059) {
        return !m17818(c3059.f9609, "reason").isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m17817(C22150 c22150, String str, String str2, String[] strArr) {
        JSONObject jSONObjectAdd = m17815(c22150.f71877, c22150.f71875, c22150.f71859, c22150.f71870, c22150.f71866, c22150.f71864, str, str2, strArr).add("scanKind", c22150.f71868);
        List list = c22150.f71861;
        JSONArray jSONArrayArray = JSON.array();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArrayArray.add((String) it.next());
            }
        }
        return jSONObjectAdd.add("referenceKinds", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m17815(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr) {
        JSONObject jSONObjectAdd = C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", str3).add("addressKind", str4).add("address", str5).add("instructionMode", str6).add("reason", str7).add("addressModeHint", str8);
        JSONArray jSONArrayArray = JSON.array();
        for (String str9 : strArr) {
            jSONArrayArray.add(str9);
        }
        return jSONObjectAdd.add("retryInstructionModes", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m17812(C18623 c18623, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry as ARM" : "Retry with instructionMode=auto";
            }
            jSONArrayArray.add(C10115.m25398(JSON.object().add("workspaceId", c18623.f57753).add("editSessionId", c18623.f57759).add("locator", c18623.f57761).add("addressKind", c18623.f57757).add("address", c18623.f57755).add("instructionMode", str2).add("stopAtSymbolBoundary", c18623.f57754).add("maxBytes", c18623.f57752).add("maxInstructions", c18623.f57760), "mt_apk_native_disassemble", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m17814(C22150 c22150, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry xref as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry xref as ARM" : "Retry xref with instructionMode=auto";
            }
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c22150.f71877).add("editSessionId", c22150.f71875).add("locator", c22150.f71859).add("addressKind", c22150.f71870).add("address", c22150.f71866).add("instructionMode", str2).add("scanKind", c22150.f71868);
            List list = c22150.f71861;
            JSONArray jSONArrayArray2 = JSON.array();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArrayArray2.add((String) it.next());
                }
            }
            jSONArrayArray.add(C10115.m25398(jSONObjectAdd.add("referenceKinds", jSONArrayArray2).add("maxScanBytes", c22150.f71860).add("limit", c22150.f71869), "mt_apk_native_xref", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m17811(C8039 c8039, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry patch as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry patch as ARM" : "Retry patch with instructionMode=auto";
            }
            jSONArrayArray.add(C10115.m25398(JSON.object().add("workspaceId", c8039.f24787).add("editSessionId", c8039.f24790).add("locator", c8039.f24791).add("addressKind", c8039.f24788).add("address", c8039.f24785).add("instructionMode", str2).add("expectedHex", c8039.f24792).add("replacementAssembly", c8039.f24783).add("paddingMode", c8039.f24784), "mt_apk_native_patch_instructions", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m17813(C19329 c19329, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry function CFG as Thumb; this new graph replaces the previous result";
            } else {
                str = "arm".equals(str2) ? "Retry function CFG as ARM; this new graph replaces the previous result" : "Retry function CFG with instructionMode=auto; this new graph replaces the previous result";
            }
            jSONArrayArray.add(C10115.m25398(JSON.object().add("workspaceId", c19329.f60774).add("editSessionId", c19329.f60777).add("locator", c19329.f60779).add("addressKind", c19329.f60775).add("address", c19329.f60772).add("instructionMode", str2).add("outputMode", c19329.f60770).add("maxAnalysisBytes", c19329.f60769).add("maxBlocks", c19329.f60778).add("maxInstructions", c19329.f60771), "mt_apk_native_analyze_control_flow", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17818(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? "" : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m17810(JSONArray jSONArray) {
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONValue jSONValue = (JSONValue) it.next();
                if (jSONValue.isString()) {
                    jSONArrayArray.add(jSONValue.asString());
                }
            }
        }
        return jSONArrayArray;
    }
}
