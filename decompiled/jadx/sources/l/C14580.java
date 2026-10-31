package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܳܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z76Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C14580 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f44638;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f44639;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f44640;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Patch raw bytes in one zip_entry inside an APK edit session identified by a non-empty editSessionId; the base workspace cannot be modified. Use it as the deliberate raw-byte fallback for equal-length in-place replacement only. For executable ELF instructions, prefer mt_apk_native_patch_instructions so ELF mapping, instruction mode, alignment, assembly, and replacement length are validated; do not hand-encode machine instructions for this tool when the change can be expressed through mt_apk_native_patch_instructions.replacementAssembly. Use this tool for ELF code only when exact raw machine bytes are intentionally required or the semantic instruction tool does not apply. Each patches[] item provides byteOffset, expectedHex, and replacementHex; expectedHex is checked against the entry view at the start of the call before any bytes are written. Runtime accepts 1..200 items, each 1..4096 bytes, total 1..65536 bytes; ranges must not overlap, adjacent ranges are valid, and replacementHex equal to expectedHex is a valid no-op counted in bytesPatched. expectedHex/replacementHex are case-insensitive hex without separators and must have the same byte count. This tool accepts only zip_entry: locators and rejects dex, resources.arsc, AXML, directories, missing, or deleted entries. Text entries may be patched as raw bytes; afterward read_text/edit_text works only if the bytes still decode, and old read_text targetVersion values are stale. For SO/ELF entries, no ELF semantics are checked; verify with mt_apk_read_bytes or native read/disassemble/xref tools after patching.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Patch APK Bytes";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_patch_bytes";
    }

    public C14580(C19793 c19793) {
        this.f44640 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f44638;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: is accepted.\"\n  },\n  \"patches\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic byte replacements for this one locator. Runtime requires 1..200 items, no overlapping byte ranges, max 4096 bytes per item and 65536 total bytes.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"byteOffset\": {\n          \"type\": \"integer\",\n          \"description\": \"0-based byte offset inside the ZIP entry. Runtime accepts 0..2147483647.\"\n        },\n        \"expectedHex\": {\n          \"type\": \"string\",\n          \"description\": \"Current bytes expected at byteOffset, as non-empty even-length hex without spaces. Case-insensitive input.\"\n        },\n        \"replacementHex\": {\n          \"type\": \"string\",\n          \"description\": \"Replacement bytes, as non-empty even-length hex without spaces. It must have the same byte count as expectedHex. For executable ELF instructions, prefer mt_apk_native_patch_instructions instead of hand-encoding machine instructions here.\"\n        }\n      },\n      \"required\": [\n        \"byteOffset\",\n        \"expectedHex\",\n        \"replacementHex\"\n      ]\n    }\n  }\n}\n");
        this.f44638 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f44639;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM28869 = C11807.m28869();
        this.f44639 = jSONObjectM28869;
        return jSONObjectM28869;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C11807.m28862(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        C19793 c19793 = this.f44640;
        try {
            C16629.m39164();
            C7797 c7797M31993 = C13169.m31993(jSONObject);
            InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
            try {
                C12239 c12239M45525 = c19793.m45525(c7797M31993);
                int i = C8869.f27007;
                C12936 c12936 = new C12936(C11807.m28863(c12239M45525));
                interfaceC19785M45535.close();
                return c12936;
            } catch (Throwable th) {
                try {
                    interfaceC19785M45535.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            int i2 = C8869.f27007;
            throw th3;
        }
    }
}
