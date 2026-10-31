package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6W0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6240 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17178(JSONObject jSONObject, String str) throws C3059 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364(strConcat, str, jSONValue, JSON.array(), JSON.object());
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17177(JSONObject jSONObject) throws C3059 {
        String strM17178 = m17178(jSONObject, "targetVersion");
        if (strM17178.length() == 16) {
            boolean z = true;
            for (int i = 0; i < strM17178.length(); i++) {
                char cCharAt = strM17178.charAt(i);
                if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                    z = false;
                }
            }
            if (z) {
                return strM17178;
            }
        }
        throw C3059.m9364("Copy an existing file's 16 lowercase hex targetVersion; empty and missing are invalid", "targetVersion", jSONObject.get("targetVersion"), JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m17179(String str, long j, long j2) {
        return C3059.m9365("FILE_SIZE_OUT_OF_RANGE", str, "warning", (JSONArray) null, JSON.object().add("limit", j).add("actual", j2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m17175() {
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Existing regular file; absolute or Home-relative path. Empty is invalid.")).add("targetVersion", C1648.m5545("string", "Copy the existing file's current targetVersion. Empty and missing are invalid."));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m17176(String str, boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute file path.")).add("size", C1648.m5545("integer", "Final raw file size in bytes.")).add("targetVersion", C1648.m5545("string", "Final whole-file version; copy unchanged for subsequent operations.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether the final bytes differ from the original file.")).add("warnings", C1648.m5541("Metadata or publication limitations; empty when none."));
        if (z) {
            jSONObjectAdd.add("encoding", C1648.m5545("string", "Actual unchanged encoding token including its physical BOM."));
        }
        String strM14172 = C4860.m14172("Result for ", str, ".");
        JSONObject jSONObjectM5532 = C1648.m5532(jSONObjectAdd, "Final file state.");
        JSONObject jSONObjectM10357 = C3395.m10357(str);
        JSONObject jSONObjectAdd2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "See the target read tool.")).add("targetVersion", C1648.m5545("string", "See the target read tool."));
        if (z) {
            jSONObjectAdd2.add("encoding", C1648.m5545("string", "See mt_file_read_text.")).add("startLine", C1648.m5545("integer", "See mt_file_read_text.")).add("startColumn", C1648.m5545("integer", "See mt_file_read_text.")).add("limit", C1648.m5545("integer", "See mt_file_read_text.")).add("maxChars", C1648.m5545("integer", "See mt_file_read_text."));
        } else {
            jSONObjectAdd2.add("byteOffset", C1648.m5545("integer", "See mt_file_read_bytes.")).add("maxBytes", C1648.m5545("integer", "See mt_file_read_bytes."));
        }
        return C1648.m5535(strM14172, jSONObjectM5532, jSONObjectM10357, C1648.m5538("Success provides an inspection near the affected file tail.", C1648.m5533(C1648.m5532(jSONObjectAdd2, "Arguments for the read tool."), z ? "mt_file_read_text" : "mt_file_read_bytes", "inspect")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12936 m17180(C7882 c7882, String str, long j, long j2) {
        JSONObject jSONObjectObject = JSON.object();
        String str2 = c7882.f24425;
        JSONObject jSONObjectAdd = jSONObjectObject.add(MotionUtils.EASING_TYPE_PATH, str2).add("size", c7882.f24426);
        String str3 = c7882.f24428;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("targetVersion", str3).add("changed", c7882.f24424).add("warnings", c7882.f24427);
        JSONObject jSONObjectAdd3 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("targetVersion", str3);
        boolean z = str != null;
        if (z) {
            jSONObjectAdd2.add("encoding", str);
            jSONObjectAdd3.add("encoding", str).add("startLine", j).add("startColumn", j2).add("limit", 500).add("maxChars", 49152);
        } else {
            jSONObjectAdd3.add("byteOffset", j2).add("maxBytes", 256);
        }
        return new C12936(C19993.m46095(jSONObjectAdd2, JSON.array().add(C10115.m25398(jSONObjectAdd3, z ? "mt_file_read_text" : "mt_file_read_bytes", "inspect", "Inspect the final file near the affected tail."))));
    }
}
