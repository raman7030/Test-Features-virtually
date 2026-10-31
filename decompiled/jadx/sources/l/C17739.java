package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ᩳ֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E752 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17739 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22241 f54285;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f54286;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13682 f54287;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19793 f54288;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public JSONObject f54289;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Build a bounded direct static control-flow graph within one ELF function. Use a symbol start from mt_apk_native_map_address or an instruction source from mt_apk_native_xref. An address inside a sized FUNC symbol resolves to that function; missing or unreliable symbols fall back to the requested executable address. Use outputMode=summary for triage, full for blocks and edges. Recommended budgets: maxAnalysisBytes=16384, maxBlocks=256, maxInstructions=2000. Calls are not followed or represented as CFG edges; indirect jumps and switch tables may remain unresolved. Shape hints describe only the analyzed subgraph, not the whole function. This tool does not paginate. When a budget stops analysis, nextActions may rerun with larger budgets; the new graph replaces the old one and must not be merged. Invalid instructions, indirect jumps, mode transitions, and non-executable targets cannot be resolved by increasing budgets. Use mt_apk_native_disassemble for exact bytes or patch context.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Analyze Native Control Flow";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_native_analyze_control_flow";
    }

    public C17739(C19793 c19793) {
        C22241 c22241 = new C22241();
        C13682 c13682 = new C13682();
        this.f54288 = c19793;
        this.f54285 = c22241;
        this.f54287 = c13682;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f54286;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass an empty string for the base APK, or the id from mt_apk_session_create for the edited view.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for an ELF virtual address or file_offset for an ELF file offset inside the SO entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned function symbol address or address inside a function candidate. Accepts decimal or 0x/0X hex in 0..9223372036854775807.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode: auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from an odd virtual address; otherwise retry diagnostics offer explicit modes.\"\n  },\n  \"outputMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"full\", \"summary\"],\n    \"description\": \"Required output mode. Use full to populate blocks, edges, externalFlows, and unresolvedFlows. In summary mode, blocks, edges, externalFlows, and unresolvedFlows remain present as empty arrays while analysisSummary and observedGraphSummary retain observed counts.\"\n  },\n  \"maxAnalysisBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Unique successfully decoded instruction-byte budget. Recommended 16384; valid range 16..65536.\"\n  },\n  \"maxBlocks\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum basic-block candidates to examine. Recommended 256; valid range 1..4096. Rejected candidates count toward this limit.\"\n  },\n  \"maxInstructions\": {\n    \"type\": \"integer\",\n    \"description\": \"Unique successfully decoded instruction budget. Recommended 2000; valid range 1..10000.\"\n  }\n}\n");
        this.f54286 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f54289;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM29509 = C12095.m29509();
        this.f54289 = jSONObjectM29509;
        return jSONObjectM29509;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws Throwable {
        final C19329 c19329M13270;
        C19793 c19793 = this.f54288;
        try {
            c19329M13270 = C4511.m13270(jSONObject);
            try {
                String str = c19329M13270.f60774;
                InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
                try {
                    C12936 c12936 = new C12936((JSONObject) c19793.m45513(str, new InterfaceC16263() { // from class: l.ۧ֫ۜ
                        @Override // l.InterfaceC16263
                        /* JADX INFO: renamed from: ֫ */
                        public final JSONObject mo1083(C14852 c14852, C15799 c15799) {
                            return C17739.m41557(this.f32157, c19329M13270, c14852, c15799);
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
                if (c19329M13270 != null) {
                    c19793.m45533(c19329M13270.f60774);
                }
                int i2 = C8869.f27007;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c19329M13270 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m41557(final C17739 c17739, final C19329 c19329, C14852 c14852, C15799 c15799) {
        C13682 c13682 = c17739.f54287;
        String str = c19329.f60777;
        String str2 = c19329.f60776;
        InterfaceC22855 interfaceC22855 = new InterfaceC22855() { // from class: l.ܽ֫ۜ
            @Override // l.InterfaceC22855
            /* JADX INFO: renamed from: ֫ */
            public final Object mo14558(C7333 c7333) {
                return C1511.m5196(this.f50275.f54285, c7333, c19329);
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
