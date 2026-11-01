package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩵ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6Y2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21041 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f66016;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f66017;

    /* JADX INFO: renamed from: ܽ */
    public final C19247 f66018;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Read one raw byte page from a regular local file. First call: targetVersion=\"\", byteOffset=0, maxBytes=256; maximum 65536 bytes per page. Returns uppercase hex and a whole-file targetVersion. Copy that version unchanged into later pages to avoid combining different file versions. Paths may be absolute or relative to Home. Large files are supported.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Read File Bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_read_bytes";
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m47453(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406("Invalid string argument", str, jSONValue, JSON.array().add("string"), JSON.object().add(str, "targetVersion".equals(str) ? "" : "file.bin"));
        }
        return jSONValue.asString();
    }

    public C21041(C19247 c19247) {
        this.f66018 = c19247;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f66016 == null) {
            this.f66016 = m47457();
        }
        return this.f66016;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f66017 == null) {
            this.f66017 = C3935.m7765("Result for mt_file_read_bytes.", C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute file path fixed for this call.")).add("hex", C3935.m7775("string", "Returned raw bytes as uppercase hexadecimal without separators.")).add("byteOffset", C3935.m7775("integer", "Zero-based byte offset of the first returned byte.")).add("nextByteOffset", C3935.m7775("integer", "Byte offset immediately after this page.")).add("totalBytes", C3935.m7775("integer", "Total file size observed by the complete streaming scan.")).add("hasMore", C3935.m7775(ClassTransform.BOOLEAN, "Whether bytes remain after nextByteOffset.")), "string", "Whole-file content version as 16 lowercase hex digits.", "targetVersion", "One raw byte page bound to a whole-file version."), C5595.m12396("mt_file_read_bytes"), C3935.m7768("Contains one directly executable continuation when hasMore=true; a version mismatch error contains one restart action.", C3935.m7763(m47457(), "mt_file_read_bytes", "continue"), C3935.m7763(m47457(), "mt_file_read_bytes", "retry")));
        }
        return this.f66017;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_read_bytes", c5276);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47456(C14362 c14362, String str) throws C5276 {
        int i = C20370.f62972[c14362.m32962().ordinal()];
        C19247 c19247 = this.f66018;
        if (i == 2) {
            c19247.getClass();
            throw C19247.m43851(str);
        }
        if (i == 3) {
            throw C21740.m49020(c14362, c19247, "FILE_NOT_REGULAR", "Directories cannot be read as raw file bytes.", str);
        }
        if (i == 4) {
            throw C21740.m49020(c14362, c19247, "FILE_IS_SYMLINK", "Symbolic links cannot be read by the generic byte tool.", str);
        }
        if (i == 5) {
            throw C21740.m49020(c14362, c19247, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be read as file bytes.", str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m47454(int i, String str, String str2, String str3, String str4) {
        return C5276.m11407("FILE_TARGET_VERSION_MISMATCH", "The file targetVersion no longer matches the current content.", "warning", JSON.array().add(m47452("retry", "Discard earlier pages and restart at byteOffset 0 using the current file version.", str, str3, 0L, i)), C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str4).add("operation", "read").add("backendReason", "target_version_mismatch").add("expectedTargetVersion", str2).add("actualTargetVersion", str3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m47455(long j, long j2, String str, String str2) {
        return C5276.m11407("FILE_OFFSET_OUT_OF_RANGE", "Byte offset is beyond the end of the file.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str2).add("operation", "read").add("backendReason", "offset_after_end").add("byteOffset", j).add("totalBytes", j2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m47452(String str, String str2, String str3, String str4, long j, int i) {
        return C11982.m27418(C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "targetVersion", str4).add("byteOffset", j).add("maxBytes", i), "mt_file_read_bytes", str, str2);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m47457() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C3935.m7775("string", "Pass \"\" (empty string) on the first read; later pass the previous result unchanged.")).add("byteOffset", C3935.m7775("integer", "Zero-based byte offset in 0..9007199254740991; pass 0 by default.")), "integer", "Page size from 1 through 65536; pass 256 by default.", "maxBytes", "Arguments for mt_file_read_bytes.");
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C6288(), "Invalid file byte read argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "byteOffset", "maxBytes");
        String strM47453 = m47453(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM47454 = m47453(jSONObject, "targetVersion");
        long jM50963 = C22777.m50963(jSONObject, "byteOffset", 0L, 9007199254740991L);
        int iM50963 = (int) C22777.m50963(jSONObject, "maxBytes", 1L, 65536L);
        C19247 c19247 = this.f66018;
        C9385 c9385M43852 = c19247.m43852();
        String strM43844 = C19247.m43844(strM47453, c9385M43852, MotionUtils.EASING_TYPE_PATH);
        String str = c9385M43852.f25641;
        C11872 c11872M43853 = c19247.m43853(strM43844);
        try {
            C14362 c14362M43858 = c19247.m43858(strM43844);
            m47456(c14362M43858, strM43844);
            try {
                C18082 c18082M44197 = C19424.m44197(c14362M43858.m32959(), jM50963, iM50963);
                long j = c18082M44197.f53989;
                long j2 = c18082M44197.f53990;
                String str2 = c18082M44197.f53991;
                C14362 c14362M43859 = c19247.m43858(strM43844);
                if (c14362M43859.m32962() != EnumC5645.REGULAR || ((c14362M43858.m32961() >= 0 && c14362M43858.m32961() != j2) || (c14362M43859.m32961() >= 0 && c14362M43859.m32961() != j2))) {
                    throw C5276.m11407("FILE_CHANGED_DURING_READ", "The file changed while its bytes were being read.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, strM43844, "policyRevision", str).add("operation", "read").add("backendReason", "metadata_changed"));
                }
                if (!strM47454.isEmpty() && !strM47454.equals(str2)) {
                    throw m47454(iM50963, strM43844, strM47454, str2, str);
                }
                long j3 = c18082M44197.f53990;
                if (jM50963 > j3) {
                    throw m47455(jM50963, j3, strM43844, c9385M43852.f25641);
                }
                JSONArray jSONArrayArray = JSON.array();
                long j4 = c18082M44197.f53989;
                if (j4 < j2) {
                    jSONArrayArray.add(m47452("continue", "Continue reading the next byte page from the same file version.", strM43844, c18082M44197.f53991, j4, iM50963));
                }
                C14663 c14663 = new C14663(C21370.m48410(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM43844).add("hex", C15268.m34730(c18082M44197.f53988)).add("byteOffset", c18082M44197.f53987).add("nextByteOffset", j).add("totalBytes", j2).add("hasMore", j < j2).add("targetVersion", str2), jSONArrayArray));
                c11872M43853.close();
                return c14663;
            } catch (IOException e) {
                throw C19247.m43846(strM43844, e);
            }
        } catch (Throwable th) {
            try {
                c11872M43853.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
