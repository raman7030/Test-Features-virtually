package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6XE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9640 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f26539;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f26540;

    /* JADX INFO: renamed from: ܽ */
    public final C14553 f26541;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Create or fully replace one regular local file from raw hexadecimal bytes. Use targetVersion=\"missing\" only to create a missing file; otherwise copy the current targetVersion from mt_file_stat or mt_file_read_bytes. hex is case-insensitive, contains no separators, may be empty, and is limited to 1048576 raw bytes. Paths may be absolute or relative to the Home captured at call start. Inspect the reported state after a failed write.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Write File Bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_write_bytes";
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22436(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m22437(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    public C9640(C14553 c14553) {
        this.f26541 = c14553;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f26539 == null) {
            this.f26539 = C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C3935.m7775("string", "Use missing for creation, otherwise the current 16-digit lowercase hex version token.")), "string", "Zero through 1048576 raw bytes as even-length hexadecimal without separators.", "hex", "Arguments for mt_file_write_bytes.");
        }
        return this.f26539;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f26540 == null) {
            this.f26540 = C3935.m7765("Result for mt_file_write_bytes.", C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute target path fixed for this call.")).add("changed", C3935.m7775(ClassTransform.BOOLEAN, "Whether target content changed.")).add("warnings", C9417.m21913("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C3935.m7775("string", "One warning message."))).add("size", C3935.m7775("integer", "Final raw byte size.")), "string", "Final whole-file version token of 16 lowercase hex digits.", "targetVersion", "Successful complete binary file write."), C5595.m12396("mt_file_write_bytes"), C3935.m7768("Success returns one read_bytes verification action.", C3935.m7763(C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute file path.")).add("targetVersion", C3935.m7775("string", "Whole-file targetVersion returned by this write.")).add("byteOffset", C3935.m7775("integer", "Zero-based byte offset.")), "integer", "See mt_file_read_bytes.", "maxBytes", "Arguments for mt_file_read_bytes."), "mt_file_read_bytes", "inspect")));
        }
        return this.f26540;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_write_bytes", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C15674(), "Invalid file byte write argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "hex");
        String strM22436 = m22436(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM22437 = m22436(jSONObject, "targetVersion");
        String strM22438 = m22436(jSONObject, "hex");
        if (strM22438.length() > 2097152) {
            throw C5276.m11407("FILE_INVALID_HEX", "Hex input exceeds the 1048576-byte write limit.", "warning", (JSONArray) null, C9417.m21913("operation", "parse_hex", "backendReason", "hex_too_large").add("limit", 1048576).add("actual", (((long) strM22438.length()) + 1) / 2));
        }
        try {
            C9859 c9859M33275 = this.f26541.m33275(strM22436, strM22437, new C5564(3, C15268.m34733(strM22438)));
            String str = c9859M33275.f27344;
            String str2 = c9859M33275.f27341;
            return new C14663(C21370.m48410(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("changed", c9859M33275.f27340).add("warnings", new JSONArray(c9859M33275.f27343)).add("size", c9859M33275.f27342).add("targetVersion", str), JSON.array().add(C11982.m27418(C9417.m21913(MotionUtils.EASING_TYPE_PATH, str2, "targetVersion", str).add("byteOffset", 0L).add("maxBytes", 256), "mt_file_read_bytes", "inspect", "Read back the beginning of the written file using its new targetVersion."))));
        } catch (IllegalArgumentException e) {
            throw C5276.m11407("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, C9417.m21913("operation", "parse_hex", "backendReason", "invalid_hex"));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m22437(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), C9417.m21913(MotionUtils.EASING_TYPE_PATH, "file.bin", "targetVersion", "missing").add("hex", "00FF"));
    }
}
