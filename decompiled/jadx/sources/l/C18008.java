package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J75M */
/* JADX INFO: loaded from: classes5.dex */
public final class C18008 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22241 f56159;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f56160;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13682 f56161;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19793 f56162;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public JSONObject f56163;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Patch one UTF-8 string in an ELF shared object using a non-empty editSessionId. expectedText guards against stale content. Choose paddingMode for equal-length, NUL-terminated, or space-padded text; growth can only consume existing padding. The complete patch window is limited to 4096 UTF-8 bytes. This tool does not resize entries, update length fields, rewrite pointers, or relocate references. Use mt_apk_patch_bytes for raw bytes or embedded NUL. Success returns beforeHex/afterHex and an mt_apk_read_bytes action to inspect the patched window.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Patch Native UTF-8 String";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_native_patch_string";
    }

    public C18008(C19793 c19793) {
        C22241 c22241 = new C22241();
        C13682 c13682 = new C13682();
        this.f56162 = c19793;
        this.f56159 = c22241;
        this.f56161 = c13682;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f56160;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. virtual maps an ELF virtual address to file-backed bytes. file_offset uses an ELF file offset within the SO zip_entry bytes; it is not an APK container offset and does not require a loaded mapping.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or SO file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"expectedText\": {\n    \"type\": \"string\",\n    \"description\": \"Current UTF-8 text at the target address. This is the stale-view guard; copy it from native_strings context or decoded bytes. Must be non-empty, valid for strict UTF-8 encoding, and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"replacementText\": {\n    \"type\": \"string\",\n    \"description\": \"Replacement UTF-8 text. Empty string is allowed for null_pad or space_pad; none still requires equal UTF-8 byte length. Must be valid for strict UTF-8 encoding and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"null_pad\", \"space_pad\"],\n    \"description\": \"All lengths below are UTF-8 byte lengths. none requires equal lengths and patches exactly expectedText bytes. null_pad is for NUL-terminated C strings: the window is max(expectedText bytes, replacementText bytes)+1, and growth requires existing zero padding plus a final NUL. space_pad is for fixed-width visible strings: the window is max(expectedText bytes, replacementText bytes), and growth requires existing ASCII spaces. Both padded modes verify the padding they consume. The complete window limit is 4096 UTF-8 bytes; null_pad includes its final NUL, so its longest text is 4095 UTF-8 bytes.\"\n  }\n}\n");
        this.f56160 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f56163;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM29510 = C12095.m29510();
        this.f56163 = jSONObjectM29510;
        return jSONObjectM29510;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C12095.m29501(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        C19793 c19793 = this.f56162;
        final C15093 c15093M13271 = null;
        try {
            C16629.m39164();
            c15093M13271 = C4511.m13271(jSONObject);
            String str = c15093M13271.f46099;
            InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
            try {
                JSONObject jSONObject2 = (JSONObject) c19793.m45512(str, new InterfaceC2859() { // from class: l.ۧۧۜ
                    @Override // l.InterfaceC2859
                    /* JADX INFO: renamed from: ֫ */
                    public final JSONObject mo8746(C14852 c14852, C15799 c15799) {
                        return C18008.m42059(c15799, c15093M13271, this.f32986, c14852);
                    }
                });
                int i = C8869.f27007;
                C12936 c12936 = new C12936(jSONObject2);
                interfaceC19785M45535.close();
                c19793.m45533(str);
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
            if (c15093M13271 != null) {
                c19793.m45533(c15093M13271.f46099);
            }
            int i2 = C8869.f27007;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m42059(final C15799 c15799, final C15093 c15093, final C18008 c18008, final C14852 c14852) {
        C13682 c13682 = c18008.f56161;
        String str = c15093.f46105;
        String str2 = c15093.f46104;
        InterfaceC22855 interfaceC22855 = new InterfaceC22855() { // from class: l.ܽۧۜ
            @Override // l.InterfaceC22855
            /* JADX INFO: renamed from: ֫ */
            public final Object mo14558(C7333 c7333) {
                return C12095.m29478(C1780.m5932(c14852, c15799, c18008.f56159, c7333, c15093));
            }
        };
        c13682.getClass();
        return (JSONObject) C13682.m32921(c14852, c15799, str, str2, interfaceC22855);
    }
}
