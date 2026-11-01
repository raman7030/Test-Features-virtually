package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J75M */
/* JADX INFO: loaded from: classes5.dex */
public final class C19483 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C23506 f59356;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f59357;

    /* JADX INFO: renamed from: ܽ */
    public final C15372 f59358;

    /* JADX INFO: renamed from: ܿ */
    public final C21180 f59359;

    /* JADX INFO: renamed from: ᩳ */
    public JSONObject f59360;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Patch one UTF-8 string in an ELF shared object using a non-empty editSessionId. expectedText guards against stale content. Choose paddingMode for equal-length, NUL-terminated, or space-padded text; growth can only consume existing padding. The complete patch window is limited to 4096 UTF-8 bytes. This tool does not resize entries, update length fields, rewrite pointers, or relocate references. Use mt_apk_patch_bytes for raw bytes or embedded NUL. Success returns beforeHex/afterHex and an mt_apk_read_bytes action to inspect the patched window.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Patch Native UTF-8 String";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_native_patch_string";
    }

    public C19483(C21180 c21180) {
        C23506 c23506 = new C23506();
        C15372 c15372 = new C15372();
        this.f59359 = c21180;
        this.f59356 = c23506;
        this.f59358 = c15372;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f59357;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. virtual maps an ELF virtual address to file-backed bytes. file_offset uses an ELF file offset within the SO zip_entry bytes; it is not an APK container offset and does not require a loaded mapping.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or SO file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"expectedText\": {\n    \"type\": \"string\",\n    \"description\": \"Current UTF-8 text at the target address. This is the stale-view guard; copy it from native_strings context or decoded bytes. Must be non-empty, valid for strict UTF-8 encoding, and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"replacementText\": {\n    \"type\": \"string\",\n    \"description\": \"Replacement UTF-8 text. Empty string is allowed for null_pad or space_pad; none still requires equal UTF-8 byte length. Must be valid for strict UTF-8 encoding and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"null_pad\", \"space_pad\"],\n    \"description\": \"All lengths below are UTF-8 byte lengths. none requires equal lengths and patches exactly expectedText bytes. null_pad is for NUL-terminated C strings: the window is max(expectedText bytes, replacementText bytes)+1, and growth requires existing zero padding plus a final NUL. space_pad is for fixed-width visible strings: the window is max(expectedText bytes, replacementText bytes), and growth requires existing ASCII spaces. Both padded modes verify the padding they consume. The complete window limit is 4096 UTF-8 bytes; null_pad includes its final NUL, so its longest text is 4095 UTF-8 bytes.\"\n  }\n}\n");
        this.f59357 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f59360;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM31573 = C13863.m31573();
        this.f59360 = jSONObjectM31573;
        return jSONObjectM31573;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C13863.m31564(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        C21180 c21180 = this.f59359;
        final C16713 c16713M15154 = null;
        try {
            C18173.m41392();
            c16713M15154 = C6656.m15154(jSONObject);
            String str = c16713M15154.f49219;
            InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
            try {
                JSONObject jSONObject2 = (JSONObject) c21180.m47823(str, new InterfaceC5086() { // from class: l.ۧۧۜ
                    @Override // p067l.InterfaceC5086
                    /* JADX INFO: renamed from: ֫ */
                    public final JSONObject mo10813(C16484 c16484, C17384 c17384) {
                        return C19483.m44309(c17384, c16713M15154, this.f35978, c16484);
                    }
                });
                int i = C10798.f29931;
                C14663 c14663 = new C14663(jSONObject2);
                interfaceC21173M47846.close();
                c21180.m47844(str);
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
            if (c16713M15154 != null) {
                c21180.m47844(c16713M15154.f49219);
            }
            int i2 = C10798.f29931;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ JSONObject m44309(final C17384 c17384, final C16713 c16713, final C19483 c19483, final C16484 c16484) {
        C15372 c15372 = c19483.f59358;
        String str = c16713.f49225;
        String str2 = c16713.f49224;
        InterfaceC24090 interfaceC24090 = new InterfaceC24090() { // from class: l.ܽۧۜ
            @Override // p067l.InterfaceC24090
            /* JADX INFO: renamed from: ֫ */
            public final Object mo16462(C9338 c9338) {
                return C13863.m31541(C4060.m8127(c16484, c17384, c19483.f59356, c9338, c16713));
            }
        };
        c15372.getClass();
        return (JSONObject) C15372.m35036(c16484, c17384, str, str2, interfaceC24090);
    }
}
