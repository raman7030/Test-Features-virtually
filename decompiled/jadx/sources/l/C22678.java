package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩺֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C75V */
/* JADX INFO: loaded from: classes.dex */
public final class C22678 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22241 f73194;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f73195;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13682 f73196;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19793 f73197;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public JSONObject f73198;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Patch executable ELF instructions using assembly source with a non-empty editSessionId. Prefer this to hand-encoding bytes for mt_apk_patch_bytes. Copy expectedHex from current mt_apk_read_bytes or mt_apk_native_disassemble output for the same editSessionId and locator; it both guards against stale reads and defines the equal-length patch window. file_offset is inside the SO entry, not the APK. Only loaded executable file-backed mappings can be patched. Alignment, instruction mode, assembly, length, and expected bytes are checked; a failure leaves the entry unchanged. Success returns assembledHex and afterHex including optional NOP padding, with nextActions to verify the result. This only validates local machine-code replacement, not control flow, stack balance, register conventions, relocations, or function semantics.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Patch Native Instructions";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_native_patch_instructions";
    }

    public C22678(C19793 c19793) {
        C22241 c22241 = new C22241();
        C13682 c13682 = new C13682();
        this.f73197 = c19793;
        this.f73194 = c22241;
        this.f73196 = c13682;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f73195;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. The mapped effective virtual address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit; x86 has no additional alignment requirement.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"expectedHex\": {\n    \"type\": \"string\",\n    \"description\": \"Stale-view guard bytes currently present at the patch address. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it. Use non-empty even-length hex without spaces. This defines the equal-length patch window; runtime accepts at most 256 bytes.\"\n  },\n  \"replacementAssembly\": {\n    \"type\": \"string\",\n    \"description\": \"Assembly source text containing instructions and labels only, assembled at the effective virtual address. This is not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly; do not include wa, seek commands, patch commands, or file paths. Runtime accepts 1..4096 characters.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"nop\"],\n    \"description\": \"Use none to require exact assembled length, or nop to fill a shorter assembled result with architecture NOP bytes.\"\n  }\n}\n");
        this.f73195 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f73198;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM29497 = C12095.m29497();
        this.f73198 = jSONObjectM29497;
        return jSONObjectM29497;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C12095.m29479(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        C19793 c19793 = this.f73197;
        final C8039 c8039M13273 = null;
        try {
            C16629.m39164();
            c8039M13273 = C4511.m13273(jSONObject);
            String str = c8039M13273.f24787;
            InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
            try {
                JSONObject jSONObject2 = (JSONObject) c19793.m45512(str, new InterfaceC2859() { // from class: l.ۛ֫ۜ
                    @Override // l.InterfaceC2859
                    /* JADX INFO: renamed from: ֫ */
                    public final JSONObject mo8746(C14852 c14852, C15799 c15799) {
                        return C22678.m50664(c15799, c8039M13273, this.f17673, c14852);
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
            if (c8039M13273 != null) {
                c19793.m45533(c8039M13273.f24787);
            }
            int i2 = C8869.f27007;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m50664(final C15799 c15799, final C8039 c8039, final C22678 c22678, final C14852 c14852) {
        C13682 c13682 = c22678.f73196;
        String str = c8039.f24790;
        String str2 = c8039.f24789;
        InterfaceC22855 interfaceC22855 = new InterfaceC22855() { // from class: l.ۨ֫ۜ
            @Override // l.InterfaceC22855
            /* JADX INFO: renamed from: ֫ */
            public final Object mo14558(C7333 c7333) {
                return C12095.m29481(C9979.m25143(c14852, c15799, c22678.f73194, c7333, c8039));
            }
        };
        c13682.getClass();
        return (JSONObject) C13682.m32921(c14852, c15799, str, str2, interfaceC22855);
    }
}
