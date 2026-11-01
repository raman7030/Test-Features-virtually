package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩺֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C75V */
/* JADX INFO: loaded from: classes.dex */
public final class C23921 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C23506 f75919;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f75920;

    /* JADX INFO: renamed from: ܽ */
    public final C15372 f75921;

    /* JADX INFO: renamed from: ܿ */
    public final C21180 f75922;

    /* JADX INFO: renamed from: ᩳ */
    public JSONObject f75923;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Patch executable ELF instructions using assembly source with a non-empty editSessionId. Prefer this to hand-encoding bytes for mt_apk_patch_bytes. Copy expectedHex from current mt_apk_read_bytes or mt_apk_native_disassemble output for the same editSessionId and locator; it both guards against stale reads and defines the equal-length patch window. file_offset is inside the SO entry, not the APK. Only loaded executable file-backed mappings can be patched. Alignment, instruction mode, assembly, length, and expected bytes are checked; a failure leaves the entry unchanged. Success returns assembledHex and afterHex including optional NOP padding, with nextActions to verify the result. This only validates local machine-code replacement, not control flow, stack balance, register conventions, relocations, or function semantics.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Patch Native Instructions";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_native_patch_instructions";
    }

    public C23921(C21180 c21180) {
        C23506 c23506 = new C23506();
        C15372 c15372 = new C15372();
        this.f75922 = c21180;
        this.f75919 = c23506;
        this.f75921 = c15372;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f75920;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. The mapped effective virtual address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit; x86 has no additional alignment requirement.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"expectedHex\": {\n    \"type\": \"string\",\n    \"description\": \"Stale-view guard bytes currently present at the patch address. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it. Use non-empty even-length hex without spaces. This defines the equal-length patch window; runtime accepts at most 256 bytes.\"\n  },\n  \"replacementAssembly\": {\n    \"type\": \"string\",\n    \"description\": \"Assembly source text containing instructions and labels only, assembled at the effective virtual address. This is not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly; do not include wa, seek commands, patch commands, or file paths. Runtime accepts 1..4096 characters.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"nop\"],\n    \"description\": \"Use none to require exact assembled length, or nop to fill a shorter assembled result with architecture NOP bytes.\"\n  }\n}\n");
        this.f75920 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f75923;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM31560 = C13863.m31560();
        this.f75923 = jSONObjectM31560;
        return jSONObjectM31560;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C13863.m31542(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        C21180 c21180 = this.f75922;
        final C10009 c10009M15156 = null;
        try {
            C18173.m41392();
            c10009M15156 = C6656.m15156(jSONObject);
            String str = c10009M15156.f27701;
            InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
            try {
                JSONObject jSONObject2 = (JSONObject) c21180.m47823(str, new InterfaceC5086() { // from class: l.ۛ֫ۜ
                    @Override // p067l.InterfaceC5086
                    /* JADX INFO: renamed from: ֫ */
                    public final JSONObject mo10813(C16484 c16484, C17384 c17384) {
                        return C23921.m52990(c17384, c10009M15156, this.f20518, c16484);
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
            if (c10009M15156 != null) {
                c21180.m47844(c10009M15156.f27701);
            }
            int i2 = C10798.f29931;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ JSONObject m52990(final C17384 c17384, final C10009 c10009, final C23921 c23921, final C16484 c16484) {
        C15372 c15372 = c23921.f75921;
        String str = c10009.f27704;
        String str2 = c10009.f27703;
        InterfaceC24090 interfaceC24090 = new InterfaceC24090() { // from class: l.ۨ֫ۜ
            @Override // p067l.InterfaceC24090
            /* JADX INFO: renamed from: ֫ */
            public final Object mo16462(C9338 c9338) {
                return C13863.m31544(C11852.m27160(c16484, c17384, c23921.f75919, c9338, c10009));
            }
        };
        c15372.getClass();
        return (JSONObject) C15372.m35036(c16484, c17384, str, str2, interfaceC24090);
    }
}
