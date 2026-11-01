package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۛ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F762 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7997 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C23506 f21017;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f21018;

    /* JADX INFO: renamed from: ܳ */
    public final C21180 f21019;

    /* JADX INFO: renamed from: ܽ */
    public final C5315 f21020;

    /* JADX INFO: renamed from: ܿ */
    public JSONObject f21021;

    /* JADX INFO: renamed from: ᩳ */
    public final C15372 f21022;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Disassemble an instruction window from an executable ELF mapping. Use mt_apk_native_map_address when unsure whether an address is code. file_offset means an offset inside the SO entry, not the APK. Pass editSessionId=\"\" for the base APK. The result disassemblyText uses \"0x<hex-address>: <hex-bytes> <assembly>\"; displayed addresses are virtual addresses with the 0x prefix and no leading zero padding. Machine bytes are contiguous lowercase hex in original byte order. archBits is the ELF bit width, while instructionSet and instructionWidth describe the decoded instructions. Missing symbol metadata falls back to the requested byte window. If incompleteInstructionAtEnd=true, retry the same address with a larger maxBytes. When hasMore=true, copy the purpose=continue action from nextActions and call its tool, mt_apk_native_disassemble, with its complete arguments for the next window. Do not pass this action to mt_apk_continue. To edit code, first disassemble the same location with a non-empty editSessionId, then use mt_apk_native_patch_instructions. Use addressKind=virtual, effectiveAddress or any displayed address copied unchanged, and resolvedInstructionMode. Build expectedHex by concatenating the byte columns of contiguous selected lines, at most 256 bytes. Use mt_apk_patch_bytes only when exact raw machine bytes are intentionally required.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Disassemble Native Bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_native_disassemble";
    }

    public C7997(C21180 c21180) {
        C23506 c23506 = new C23506();
        C15372 c15372 = new C15372();
        this.f21019 = c21180;
        this.f21017 = c23506;
        this.f21022 = c15372;
        this.f21020 = new C5315();
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f21018;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to disassemble the edited session view; pass an empty string to disassemble the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"stopAtSymbolBoundary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Whether to stop before the end of the containing best-effort sized ELF symbol when available. Use true when following an xref/source address for containing-symbol context; use false for a normal maxBytes-bounded window without a symbol-end cap. This does not move the start address back to the symbol start.\"\n  },\n  \"maxBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum bytes in the instruction window. Valid range is 1..4096.\"\n  },\n  \"maxInstructions\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum instructions to include in disassemblyText. Valid range is 1..200.\"\n  }\n}\n");
        this.f21018 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f21021;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM31563 = C13863.m31563();
        this.f21021 = jSONObjectM31563;
        return jSONObjectM31563;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws Throwable {
        final C20068 c20068M15147;
        C21180 c21180 = this.f21019;
        try {
            c20068M15147 = C6656.m15147(jSONObject);
            try {
                String str = c20068M15147.f60976;
                InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
                try {
                    C14663 c14663 = new C14663((JSONObject) c21180.m47824(str, new InterfaceC17825() { // from class: l.۫۟᩻
                        @Override // p067l.InterfaceC17825
                        /* JADX INFO: renamed from: ֫ */
                        public final JSONObject mo3479(C16484 c16484, C17384 c17384) {
                            return C7997.m18534(this.f39576, c20068M15147, c16484, c17384);
                        }
                    }));
                    interfaceC21173M47846.close();
                    c21180.m47844(str);
                    int i = C10798.f29931;
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
                th = th3;
                if (c20068M15147 != null) {
                    c21180.m47844(c20068M15147.f60976);
                }
                int i2 = C10798.f29931;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c20068M15147 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ JSONObject m18534(final C7997 c7997, final C20068 c20068, C16484 c16484, C17384 c17384) {
        C15372 c15372 = c7997.f21022;
        String str = c20068.f60982;
        String str2 = c20068.f60981;
        InterfaceC24090 interfaceC24090 = new InterfaceC24090() { // from class: l.ۤ۟᩻
            @Override // p067l.InterfaceC24090
            /* JADX INFO: renamed from: ֫ */
            public final Object mo16462(C9338 c9338) {
                C7997 c7998 = this.f33502;
                return C14702.m33626(c7998.f21017, c9338, c20068, c7998.f21020);
            }
        };
        c15372.getClass();
        return (JSONObject) C15372.m35036(c16484, c17384, str, str2, interfaceC24090);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        JSONValue jSONValueM19763;
        if (C8498.m19774(c5276)) {
            jSONValueM19763 = C8498.m19763(c5276);
        } else {
            jSONValueM19763 = JSON.NULL;
        }
        return C21370.m48412(c5276, jSONValueM19763, c5276.f12407);
    }
}
