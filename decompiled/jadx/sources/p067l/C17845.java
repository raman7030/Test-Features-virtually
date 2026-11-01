package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܽ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6KP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17845 extends AbstractC18516 {
    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Read a hex page of one ZIP entry's uncompressed bytes. Offsets refer to entry content, not the ZIP file itself. Later offsets may require decompressing from the beginning. This preview does not verify the complete entry; use mt_zip_test for integrity. Keep the ZIP unchanged and use the returned continuation to read more.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Read ZIP Bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_zip_read_bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C20175.m45657(AbstractC18516.m42069(true).add("entryPath", C3935.m7775("string", "Exact full ZIP file path, without a trailing /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization.")).add("byteOffset", C3935.m7775("integer", "Zero-based uncompressed byte offset, 0..9007199254740991; initially 0.")), "integer", "Maximum bytes per page, 1..65536; suggested 256.", "maxBytes", "Arguments for mt_zip_read_bytes.");
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ᩻ */
    public final JSONObject mo28741() {
        return C20175.m45657(AbstractC18516.m42070().add("byteOffset", C3935.m7775("integer", "Zero-based offset of the first returned byte.")).add("hex", C3935.m7775("string", "Uppercase hexadecimal without separators; empty when reading at EOF.")).add("nextByteOffset", C3935.m7775("integer", "Offset immediately after the returned bytes.")).add("totalBytes", C3935.m7775("integer", "Uncompressed entry size from ZIP metadata, or the observed length when this read reaches EOF. -1 if unavailable or above 9007199254740991. Does not require a full scan.")), ClassTransform.BOOLEAN, "Whether bytes remain after nextByteOffset.", "hasMore", "One uncompressed byte page.");
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo35950() {
        return new String[]{"size"};
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ۧ */
    public final JSONObject mo28740(JSONObject jSONObject) {
        return this.f55303.m4903(jSONObject);
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ֫ */
    public final JSONArray mo28739(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!jSONObject2.getBoolean("hasMore")) {
            return JSON.array();
        }
        return JSON.array().add(C11982.m27418(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, jSONObject2.getString(MotionUtils.EASING_TYPE_PATH)).put("byteOffset", jSONObject2.getLong("nextByteOffset")), "mt_zip_read_bytes", "continue", "Read the next byte page from the unchanged ZIP entry."));
    }
}
