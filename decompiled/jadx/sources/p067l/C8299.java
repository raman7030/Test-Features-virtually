package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6W0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8299 {
    /* JADX INFO: renamed from: ֫ */
    public static String m19116(JSONObject jSONObject, String str) throws C5276 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406(strConcat, str, jSONValue, JSON.array(), JSON.object());
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m19115(JSONObject jSONObject) throws C5276 {
        String strM19116 = m19116(jSONObject, "targetVersion");
        if (strM19116.length() == 16) {
            boolean z = true;
            for (int i = 0; i < strM19116.length(); i++) {
                char cCharAt = strM19116.charAt(i);
                if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                    z = false;
                }
            }
            if (z) {
                return strM19116;
            }
        }
        throw C5276.m11406("Copy an existing file's 16 lowercase hex targetVersion; empty and missing are invalid", "targetVersion", jSONObject.get("targetVersion"), JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m19117(String str, long j, long j2) {
        return C5276.m11407("FILE_SIZE_OUT_OF_RANGE", str, "warning", (JSONArray) null, JSON.object().add("limit", j).add("actual", j2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m19113() {
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Existing regular file; absolute or Home-relative path. Empty is invalid.")).add("targetVersion", C3935.m7775("string", "Copy the existing file's current targetVersion. Empty and missing are invalid."));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m19114(String str, boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute file path.")).add("size", C3935.m7775("integer", "Final raw file size in bytes.")).add("targetVersion", C3935.m7775("string", "Final whole-file version; copy unchanged for subsequent operations.")).add("changed", C3935.m7775(ClassTransform.BOOLEAN, "Whether the final bytes differ from the original file.")).add("warnings", C3935.m7771("Metadata or publication limitations; empty when none."));
        if (z) {
            jSONObjectAdd.add("encoding", C3935.m7775("string", "Actual unchanged encoding token including its physical BOM."));
        }
        String strM16053 = C6988.m16053("Result for ", str, ".");
        JSONObject jSONObjectM7762 = C3935.m7762(jSONObjectAdd, "Final file state.");
        JSONObject jSONObjectM12396 = C5595.m12396(str);
        JSONObject jSONObjectAdd2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "See the target read tool.")).add("targetVersion", C3935.m7775("string", "See the target read tool."));
        if (z) {
            jSONObjectAdd2.add("encoding", C3935.m7775("string", "See mt_file_read_text.")).add("startLine", C3935.m7775("integer", "See mt_file_read_text.")).add("startColumn", C3935.m7775("integer", "See mt_file_read_text.")).add("limit", C3935.m7775("integer", "See mt_file_read_text.")).add("maxChars", C3935.m7775("integer", "See mt_file_read_text."));
        } else {
            jSONObjectAdd2.add("byteOffset", C3935.m7775("integer", "See mt_file_read_bytes.")).add("maxBytes", C3935.m7775("integer", "See mt_file_read_bytes."));
        }
        return C3935.m7765(strM16053, jSONObjectM7762, jSONObjectM12396, C3935.m7768("Success provides an inspection near the affected file tail.", C3935.m7763(C3935.m7762(jSONObjectAdd2, "Arguments for the read tool."), z ? "mt_file_read_text" : "mt_file_read_bytes", "inspect")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14663 m19118(C9859 c9859, String str, long j, long j2) {
        JSONObject jSONObjectObject = JSON.object();
        String str2 = c9859.f27341;
        JSONObject jSONObjectAdd = jSONObjectObject.add(MotionUtils.EASING_TYPE_PATH, str2).add("size", c9859.f27342);
        String str3 = c9859.f27344;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("targetVersion", str3).add("changed", c9859.f27340).add("warnings", c9859.f27343);
        JSONObject jSONObjectAdd3 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("targetVersion", str3);
        boolean z = str != null;
        if (z) {
            jSONObjectAdd2.add("encoding", str);
            jSONObjectAdd3.add("encoding", str).add("startLine", j).add("startColumn", j2).add("limit", 500).add("maxChars", 49152);
        } else {
            jSONObjectAdd3.add("byteOffset", j2).add("maxBytes", 256);
        }
        return new C14663(C21370.m48410(jSONObjectAdd2, JSON.array().add(C11982.m27418(jSONObjectAdd3, z ? "mt_file_read_text" : "mt_file_read_bytes", "inspect", "Inspect the final file near the affected tail."))));
    }
}
