package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C74Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C8498 {
    /* JADX INFO: renamed from: ֫ */
    public static C5276 m19767(C20068 c20068) {
        String[] strArr = {"thumb", "arm"};
        return C5276.m11407("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF disassembly requires instructionMode=arm or instructionMode=thumb.", "fatal", m19759(c20068, strArr), m19762(c20068.f60976, c20068.f60982, c20068.f60984, c20068.f60980, c20068.f60978, c20068.f60979, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m19771(C20068 c20068) {
        String[] strArr = {"thumb"};
        return C5276.m11407("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m19759(c20068, strArr), m19762(c20068.f60976, c20068.f60982, c20068.f60984, c20068.f60980, c20068.f60978, c20068.f60979, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m19766(C10009 c10009) {
        String[] strArr = {"thumb", "arm"};
        return C5276.m11407("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF instruction patch requires instructionMode=arm or instructionMode=thumb.", "fatal", m19758(c10009, strArr), m19762(c10009.f27701, c10009.f27704, c10009.f27705, c10009.f27702, c10009.f27699, c10009.f27696, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m19770(C10009 c10009) {
        String[] strArr = {"thumb"};
        return C5276.m11407("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m19758(c10009, strArr), m19762(c10009.f27701, c10009.f27704, c10009.f27705, c10009.f27702, c10009.f27699, c10009.f27696, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m19768(C20739 c20739) {
        String[] strArr = {"thumb", "arm"};
        return C5276.m11407("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF function CFG requires instructionMode=arm or instructionMode=thumb.", "fatal", m19760(c20739, strArr), m19762(c20739.f64006, c20739.f64009, c20739.f64011, c20739.f64007, c20739.f64004, c20739.f64005, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m19772(C20739 c20739) {
        String[] strArr = {"thumb"};
        return C5276.m11407("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m19760(c20739, strArr), m19762(c20739.f64006, c20739.f64009, c20739.f64011, c20739.f64007, c20739.f64004, c20739.f64005, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m19773(C23420 c23420) {
        String[] strArr = {"thumb", "arm"};
        return C5276.m11407("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF xref scan requires instructionMode=thumb or instructionMode=arm.", "fatal", m19761(c23420, strArr), m19764(c23420, "arm32_mode_required", ("virtual".equals(c23420.f74592) && (c23420.f74580 & 1) == 1) ? "odd target virtual address does not identify source instruction mode" : "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m19769(C23420 c23420) {
        String[] strArr = {"auto"};
        C5276 c5276M11406 = C5276.m11406("instructionMode must be auto for scanKind=data", "instructionMode", JSON.value(c23420.f74586), JSON.array("auto"), JSON.object().add("instructionMode", "auto"));
        JSONObject jSONObject = c5276M11406.f12412;
        for (JSONObject.Member member : m19764(c23420, "data_scan_requires_auto", "data scan does not decode instructions", strArr)) {
            jSONObject.put(member.getName(), member.getValue());
        }
        return c5276M11406.m11412(m19761(c23420, strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m19763(C5276 c5276) {
        JSONObject jSONObject = c5276.f12412;
        return JSON.object().add("workspaceId", m19765(jSONObject, "workspaceId")).add("editSessionId", m19765(jSONObject, "editSessionId")).add("locator", m19765(jSONObject, "locator")).add("addressKind", m19765(jSONObject, "addressKind")).add("address", m19765(jSONObject, "address")).add("instructionMode", m19765(jSONObject, "instructionMode")).add("reason", m19765(jSONObject, "reason")).add("addressModeHint", m19765(jSONObject, "addressModeHint")).add("retryInstructionModes", m19757(jSONObject.getJSONArray("retryInstructionModes")));
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONObject m19775(C5276 c5276) {
        JSONObject jSONObject = c5276.f12412;
        return m19763(c5276).add("scanKind", m19765(jSONObject, "scanKind")).add("referenceKinds", m19757(jSONObject.getJSONArray("referenceKinds")));
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m19774(C5276 c5276) {
        return !m19765(c5276.f12412, "reason").isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m19764(C23420 c23420, String str, String str2, String[] strArr) {
        JSONObject jSONObjectAdd = m19762(c23420.f74599, c23420.f74597, c23420.f74581, c23420.f74592, c23420.f74588, c23420.f74586, str, str2, strArr).add("scanKind", c23420.f74590);
        List list = c23420.f74583;
        JSONArray jSONArrayArray = JSON.array();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArrayArray.add((String) it.next());
            }
        }
        return jSONObjectAdd.add("referenceKinds", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m19762(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr) {
        JSONObject jSONObjectAdd = C9417.m21913("workspaceId", str, "editSessionId", str2).add("locator", str3).add("addressKind", str4).add("address", str5).add("instructionMode", str6).add("reason", str7).add("addressModeHint", str8);
        JSONArray jSONArrayArray = JSON.array();
        for (String str9 : strArr) {
            jSONArrayArray.add(str9);
        }
        return jSONObjectAdd.add("retryInstructionModes", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m19759(C20068 c20068, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry as ARM" : "Retry with instructionMode=auto";
            }
            jSONArrayArray.add(C11982.m27418(JSON.object().add("workspaceId", c20068.f60976).add("editSessionId", c20068.f60982).add("locator", c20068.f60984).add("addressKind", c20068.f60980).add("address", c20068.f60978).add("instructionMode", str2).add("stopAtSymbolBoundary", c20068.f60977).add("maxBytes", c20068.f60975).add("maxInstructions", c20068.f60983), "mt_apk_native_disassemble", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m19761(C23420 c23420, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry xref as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry xref as ARM" : "Retry xref with instructionMode=auto";
            }
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c23420.f74599).add("editSessionId", c23420.f74597).add("locator", c23420.f74581).add("addressKind", c23420.f74592).add("address", c23420.f74588).add("instructionMode", str2).add("scanKind", c23420.f74590);
            List list = c23420.f74583;
            JSONArray jSONArrayArray2 = JSON.array();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArrayArray2.add((String) it.next());
                }
            }
            jSONArrayArray.add(C11982.m27418(jSONObjectAdd.add("referenceKinds", jSONArrayArray2).add("maxScanBytes", c23420.f74582).add("limit", c23420.f74591), "mt_apk_native_xref", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m19758(C10009 c10009, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry patch as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry patch as ARM" : "Retry patch with instructionMode=auto";
            }
            jSONArrayArray.add(C11982.m27418(JSON.object().add("workspaceId", c10009.f27701).add("editSessionId", c10009.f27704).add("locator", c10009.f27705).add("addressKind", c10009.f27702).add("address", c10009.f27699).add("instructionMode", str2).add("expectedHex", c10009.f27706).add("replacementAssembly", c10009.f27697).add("paddingMode", c10009.f27698), "mt_apk_native_patch_instructions", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m19760(C20739 c20739, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry function CFG as Thumb; this new graph replaces the previous result";
            } else {
                str = "arm".equals(str2) ? "Retry function CFG as ARM; this new graph replaces the previous result" : "Retry function CFG with instructionMode=auto; this new graph replaces the previous result";
            }
            jSONArrayArray.add(C11982.m27418(JSON.object().add("workspaceId", c20739.f64006).add("editSessionId", c20739.f64009).add("locator", c20739.f64011).add("addressKind", c20739.f64007).add("address", c20739.f64004).add("instructionMode", str2).add("outputMode", c20739.f64002).add("maxAnalysisBytes", c20739.f64001).add("maxBlocks", c20739.f64010).add("maxInstructions", c20739.f64003), "mt_apk_native_analyze_control_flow", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m19765(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? "" : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m19757(JSONArray jSONArray) {
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
