package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܽ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6KP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16285 extends AbstractC16991 {
    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Read a hex page of one ZIP entry's uncompressed bytes. Offsets refer to entry content, not the ZIP file itself. Later offsets may require decompressing from the beginning. This preview does not verify the complete entry; use mt_zip_test for integrity. Keep the ZIP unchanged and use the returned continuation to read more.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Read ZIP Bytes";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_zip_read_bytes";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        return C18736.m43390(AbstractC16991.m39826(true).add("entryPath", C1648.m5545("string", "Exact full ZIP file path, without a trailing /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization.")).add("byteOffset", C1648.m5545("integer", "Zero-based uncompressed byte offset, 0..9007199254740991; initially 0.")), "integer", "Maximum bytes per page, 1..65536; suggested 256.", "maxBytes", "Arguments for mt_zip_read_bytes.");
    }

    @Override // l.AbstractC16991
    /* JADX INFO: renamed from: ᩻ */
    public final JSONObject mo26702() {
        return C18736.m43390(AbstractC16991.m39827().add("byteOffset", C1648.m5545("integer", "Zero-based offset of the first returned byte.")).add("hex", C1648.m5545("string", "Uppercase hexadecimal without separators; empty when reading at EOF.")).add("nextByteOffset", C1648.m5545("integer", "Offset immediately after the returned bytes.")).add("totalBytes", C1648.m5545("integer", "Uncompressed entry size from ZIP metadata, or the observed length when this read reaches EOF. -1 if unavailable or above 9007199254740991. Does not require a full scan.")), ClassTransform.BOOLEAN, "Whether bytes remain after nextByteOffset.", "hasMore", "One uncompressed byte page.");
    }

    @Override // l.AbstractC16991
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo33818() {
        return new String[]{"size"};
    }

    @Override // l.AbstractC16991
    /* JADX INFO: renamed from: ۧ */
    public final JSONObject mo26701(JSONObject jSONObject) {
        return this.f52123.m2547(jSONObject);
    }

    @Override // l.AbstractC16991
    /* JADX INFO: renamed from: ֫ */
    public final JSONArray mo26700(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!jSONObject2.getBoolean("hasMore")) {
            return JSON.array();
        }
        return JSON.array().add(C10115.m25398(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, jSONObject2.getString(MotionUtils.EASING_TYPE_PATH)).put("byteOffset", jSONObject2.getLong("nextByteOffset")), "mt_zip_read_bytes", "continue", "Read the next byte page from the unchanged ZIP entry."));
    }
}
