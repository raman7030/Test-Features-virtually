package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۛ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F762 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5922 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22241 f18163;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f18164;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19793 f18165;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3100 f18166;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public JSONObject f18167;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13682 f18168;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Disassemble an instruction window from an executable ELF mapping. Use mt_apk_native_map_address when unsure whether an address is code. file_offset means an offset inside the SO entry, not the APK. Pass editSessionId=\"\" for the base APK. The result disassemblyText uses \"0x<hex-address>: <hex-bytes> <assembly>\"; displayed addresses are virtual addresses with the 0x prefix and no leading zero padding. Machine bytes are contiguous lowercase hex in original byte order. archBits is the ELF bit width, while instructionSet and instructionWidth describe the decoded instructions. Missing symbol metadata falls back to the requested byte window. If incompleteInstructionAtEnd=true, retry the same address with a larger maxBytes. When hasMore=true, copy the purpose=continue action from nextActions and call its tool, mt_apk_native_disassemble, with its complete arguments for the next window. Do not pass this action to mt_apk_continue. To edit code, first disassemble the same location with a non-empty editSessionId, then use mt_apk_native_patch_instructions. Use addressKind=virtual, effectiveAddress or any displayed address copied unchanged, and resolvedInstructionMode. Build expectedHex by concatenating the byte columns of contiguous selected lines, at most 256 bytes. Use mt_apk_patch_bytes only when exact raw machine bytes are intentionally required.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Disassemble Native Bytes";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_native_disassemble";
    }

    public C5922(C19793 c19793) {
        C22241 c22241 = new C22241();
        C13682 c13682 = new C13682();
        this.f18165 = c19793;
        this.f18163 = c22241;
        this.f18168 = c13682;
        this.f18166 = new C3100();
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f18164;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to disassemble the edited session view; pass an empty string to disassemble the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"stopAtSymbolBoundary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Whether to stop before the end of the containing best-effort sized ELF symbol when available. Use true when following an xref/source address for containing-symbol context; use false for a normal maxBytes-bounded window without a symbol-end cap. This does not move the start address back to the symbol start.\"\n  },\n  \"maxBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum bytes in the instruction window. Valid range is 1..4096.\"\n  },\n  \"maxInstructions\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum instructions to include in disassemblyText. Valid range is 1..200.\"\n  }\n}\n");
        this.f18164 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f18167;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM29500 = C12095.m29500();
        this.f18167 = jSONObjectM29500;
        return jSONObjectM29500;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws Throwable {
        final C18623 c18623M13264;
        C19793 c19793 = this.f18165;
        try {
            c18623M13264 = C4511.m13264(jSONObject);
            try {
                String str = c18623M13264.f57753;
                InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
                try {
                    C12936 c12936 = new C12936((JSONObject) c19793.m45513(str, new InterfaceC16263() { // from class: l.۫۟᩻
                        @Override // l.InterfaceC16263
                        /* JADX INFO: renamed from: ֫ */
                        public final JSONObject mo1083(C14852 c14852, C15799 c15799) {
                            return C5922.m16608(this.f36560, c18623M13264, c14852, c15799);
                        }
                    }));
                    interfaceC19785M45535.close();
                    c19793.m45533(str);
                    int i = C8869.f27007;
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
                th = th3;
                if (c18623M13264 != null) {
                    c19793.m45533(c18623M13264.f57753);
                }
                int i2 = C8869.f27007;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c18623M13264 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m16608(final C5922 c5922, final C18623 c18623, C14852 c14852, C15799 c15799) {
        C13682 c13682 = c5922.f18168;
        String str = c18623.f57759;
        String str2 = c18623.f57758;
        InterfaceC22855 interfaceC22855 = new InterfaceC22855() { // from class: l.ۤ۟᩻
            @Override // l.InterfaceC22855
            /* JADX INFO: renamed from: ֫ */
            public final Object mo14558(C7333 c7333) {
                C5922 c5923 = this.f30540;
                return C12977.m31541(c5923.f18163, c7333, c18623, c5923.f18166);
            }
        };
        c13682.getClass();
        return (JSONObject) C13682.m32921(c14852, c15799, str, str2, interfaceC22855);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        JSONValue jSONValueM17816;
        if (C6450.m17827(c3059)) {
            jSONValueM17816 = C6450.m17816(c3059);
        } else {
            jSONValueM17816 = JSON.NULL;
        }
        return C19993.m46097(c3059, jSONValueM17816, c3059.f9604);
    }
}
