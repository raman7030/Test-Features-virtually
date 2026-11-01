package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܳܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z76Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C16225 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f47746;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f47747;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f47748;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Patch raw bytes in one zip_entry inside an APK edit session identified by a non-empty editSessionId; the base workspace cannot be modified. Use it as the deliberate raw-byte fallback for equal-length in-place replacement only. For executable ELF instructions, prefer mt_apk_native_patch_instructions so ELF mapping, instruction mode, alignment, assembly, and replacement length are validated; do not hand-encode machine instructions for this tool when the change can be expressed through mt_apk_native_patch_instructions.replacementAssembly. Use this tool for ELF code only when exact raw machine bytes are intentionally required or the semantic instruction tool does not apply. Each patches[] item provides byteOffset, expectedHex, and replacementHex; expectedHex is checked against the entry view at the start of the call before any bytes are written. Runtime accepts 1..200 items, each 1..4096 bytes, total 1..65536 bytes; ranges must not overlap, adjacent ranges are valid, and replacementHex equal to expectedHex is a valid no-op counted in bytesPatched. expectedHex/replacementHex are case-insensitive hex without separators and must have the same byte count. This tool accepts only zip_entry: locators and rejects dex, resources.arsc, AXML, directories, missing, or deleted entries. Text entries may be patched as raw bytes; afterward read_text/edit_text works only if the bytes still decode, and old read_text targetVersion values are stale. For SO/ELF entries, no ELF semantics are checked; verify with mt_apk_read_bytes or native read/disassemble/xref tools after patching.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Patch APK Bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_patch_bytes";
    }

    public C16225(C21180 c21180) {
        this.f47748 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f47746;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: is accepted.\"\n  },\n  \"patches\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic byte replacements for this one locator. Runtime requires 1..200 items, no overlapping byte ranges, max 4096 bytes per item and 65536 total bytes.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"byteOffset\": {\n          \"type\": \"integer\",\n          \"description\": \"0-based byte offset inside the ZIP entry. Runtime accepts 0..2147483647.\"\n        },\n        \"expectedHex\": {\n          \"type\": \"string\",\n          \"description\": \"Current bytes expected at byteOffset, as non-empty even-length hex without spaces. Case-insensitive input.\"\n        },\n        \"replacementHex\": {\n          \"type\": \"string\",\n          \"description\": \"Replacement bytes, as non-empty even-length hex without spaces. It must have the same byte count as expectedHex. For executable ELF instructions, prefer mt_apk_native_patch_instructions instead of hand-encoding machine instructions here.\"\n        }\n      },\n      \"required\": [\n        \"byteOffset\",\n        \"expectedHex\",\n        \"replacementHex\"\n      ]\n    }\n  }\n}\n");
        this.f47746 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f47747;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM30918 = C13590.m30918();
        this.f47747 = jSONObjectM30918;
        return jSONObjectM30918;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C13590.m30911(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        C21180 c21180 = this.f47748;
        try {
            C18173.m41392();
            C9779 c9779M34089 = C14884.m34089(jSONObject);
            InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
            try {
                C14000 c14000M47836 = c21180.m47836(c9779M34089);
                int i = C10798.f29931;
                C14663 c14663 = new C14663(C13590.m30912(c14000M47836));
                interfaceC21173M47846.close();
                return c14663;
            } catch (Throwable th) {
                try {
                    interfaceC21173M47846.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            int i2 = C10798.f29931;
            throw th3;
        }
    }
}
