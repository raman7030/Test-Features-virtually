package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6XE */
/* JADX INFO: loaded from: classes3.dex */
public final class C7651 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f23625;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f23626;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12821 f23627;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Create or fully replace one regular local file from raw hexadecimal bytes. Use targetVersion=\"missing\" only to create a missing file; otherwise copy the current targetVersion from mt_file_stat or mt_file_read_bytes. hex is case-insensitive, contains no separators, may be empty, and is limited to 1048576 raw bytes. Paths may be absolute or relative to the Home captured at call start. Inspect the reported state after a failed write.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Write File Bytes";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_write_bytes";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20456(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m20457(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    public C7651(C12821 c12821) {
        this.f23627 = c12821;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f23625 == null) {
            this.f23625 = C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C1648.m5545("string", "Use missing for creation, otherwise the current 16-digit lowercase hex version token.")), "string", "Zero through 1048576 raw bytes as even-length hexadecimal without separators.", "hex", "Arguments for mt_file_write_bytes.");
        }
        return this.f23625;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f23626 == null) {
            this.f23626 = C1648.m5535("Result for mt_file_write_bytes.", C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute target path fixed for this call.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether target content changed.")).add("warnings", C7416.m19939("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C1648.m5545("string", "One warning message."))).add("size", C1648.m5545("integer", "Final raw byte size.")), "string", "Final whole-file version token of 16 lowercase hex digits.", "targetVersion", "Successful complete binary file write."), C3395.m10357("mt_file_write_bytes"), C1648.m5538("Success returns one read_bytes verification action.", C1648.m5533(C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute file path.")).add("targetVersion", C1648.m5545("string", "Whole-file targetVersion returned by this write.")).add("byteOffset", C1648.m5545("integer", "Zero-based byte offset.")), "integer", "See mt_file_read_bytes.", "maxBytes", "Arguments for mt_file_read_bytes."), "mt_file_read_bytes", "inspect")));
        }
        return this.f23626;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_write_bytes", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        C5807.m16297(jSONObject, new C14000(), "Invalid file byte write argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "hex");
        String strM20456 = m20456(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM20457 = m20456(jSONObject, "targetVersion");
        String strM20458 = m20456(jSONObject, "hex");
        if (strM20458.length() > 2097152) {
            throw C3059.m9365("FILE_INVALID_HEX", "Hex input exceeds the 1048576-byte write limit.", "warning", (JSONArray) null, C7416.m19939("operation", "parse_hex", "backendReason", "hex_too_large").add("limit", 1048576).add("actual", (((long) strM20458.length()) + 1) / 2));
        }
        try {
            C7882 c7882M31189 = this.f23627.m31189(strM20456, strM20457, new C3362(3, C13573.m32621(strM20458)));
            String str = c7882M31189.f24428;
            String str2 = c7882M31189.f24425;
            return new C12936(C19993.m46095(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("changed", c7882M31189.f24424).add("warnings", new JSONArray(c7882M31189.f24427)).add("size", c7882M31189.f24426).add("targetVersion", str), JSON.array().add(C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str2, "targetVersion", str).add("byteOffset", 0L).add("maxBytes", 256), "mt_file_read_bytes", "inspect", "Read back the beginning of the written file using its new targetVersion."))));
        } catch (IllegalArgumentException e) {
            throw C3059.m9365("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, C7416.m19939("operation", "parse_hex", "backendReason", "invalid_hex"));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m20457(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), C7416.m19939(MotionUtils.EASING_TYPE_PATH, "file.bin", "targetVersion", "missing").add("hex", "00FF"));
    }
}
