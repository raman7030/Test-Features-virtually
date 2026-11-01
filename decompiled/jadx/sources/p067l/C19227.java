package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.ᩳ֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E752 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19227 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C23506 f57477;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f57478;

    /* JADX INFO: renamed from: ܽ */
    public final C15372 f57479;

    /* JADX INFO: renamed from: ܿ */
    public final C21180 f57480;

    /* JADX INFO: renamed from: ᩳ */
    public JSONObject f57481;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Build a bounded direct static control-flow graph within one ELF function. Use a symbol start from mt_apk_native_map_address or an instruction source from mt_apk_native_xref. An address inside a sized FUNC symbol resolves to that function; missing or unreliable symbols fall back to the requested executable address. Use outputMode=summary for triage, full for blocks and edges. Recommended budgets: maxAnalysisBytes=16384, maxBlocks=256, maxInstructions=2000. Calls are not followed or represented as CFG edges; indirect jumps and switch tables may remain unresolved. Shape hints describe only the analyzed subgraph, not the whole function. This tool does not paginate. When a budget stops analysis, nextActions may rerun with larger budgets; the new graph replaces the old one and must not be merged. Invalid instructions, indirect jumps, mode transitions, and non-executable targets cannot be resolved by increasing budgets. Use mt_apk_native_disassemble for exact bytes or patch context.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Analyze Native Control Flow";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_native_analyze_control_flow";
    }

    public C19227(C21180 c21180) {
        C23506 c23506 = new C23506();
        C15372 c15372 = new C15372();
        this.f57480 = c21180;
        this.f57477 = c23506;
        this.f57479 = c15372;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f57478;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass an empty string for the base APK, or the id from mt_apk_session_create for the edited view.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for an ELF virtual address or file_offset for an ELF file offset inside the SO entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned function symbol address or address inside a function candidate. Accepts decimal or 0x/0X hex in 0..9223372036854775807.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode: auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from an odd virtual address; otherwise retry diagnostics offer explicit modes.\"\n  },\n  \"outputMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"full\", \"summary\"],\n    \"description\": \"Required output mode. Use full to populate blocks, edges, externalFlows, and unresolvedFlows. In summary mode, blocks, edges, externalFlows, and unresolvedFlows remain present as empty arrays while analysisSummary and observedGraphSummary retain observed counts.\"\n  },\n  \"maxAnalysisBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Unique successfully decoded instruction-byte budget. Recommended 16384; valid range 16..65536.\"\n  },\n  \"maxBlocks\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum basic-block candidates to examine. Recommended 256; valid range 1..4096. Rejected candidates count toward this limit.\"\n  },\n  \"maxInstructions\": {\n    \"type\": \"integer\",\n    \"description\": \"Unique successfully decoded instruction budget. Recommended 2000; valid range 1..10000.\"\n  }\n}\n");
        this.f57478 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f57481;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM31572 = C13863.m31572();
        this.f57481 = jSONObjectM31572;
        return jSONObjectM31572;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws Throwable {
        final C20739 c20739M15153;
        C21180 c21180 = this.f57480;
        try {
            c20739M15153 = C6656.m15153(jSONObject);
            try {
                String str = c20739M15153.f64006;
                InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
                try {
                    C14663 c14663 = new C14663((JSONObject) c21180.m47824(str, new InterfaceC17825() { // from class: l.ۧ֫ۜ
                        @Override // p067l.InterfaceC17825
                        /* JADX INFO: renamed from: ֫ */
                        public final JSONObject mo3479(C16484 c16484, C17384 c17384) {
                            return C19227.m43802(this.f35128, c20739M15153, c16484, c17384);
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
                if (c20739M15153 != null) {
                    c21180.m47844(c20739M15153.f64006);
                }
                int i2 = C10798.f29931;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c20739M15153 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ JSONObject m43802(final C19227 c19227, final C20739 c20739, C16484 c16484, C17384 c17384) {
        C15372 c15372 = c19227.f57479;
        String str = c20739.f64009;
        String str2 = c20739.f64008;
        InterfaceC24090 interfaceC24090 = new InterfaceC24090() { // from class: l.ܽ֫ۜ
            @Override // p067l.InterfaceC24090
            /* JADX INFO: renamed from: ֫ */
            public final Object mo16462(C9338 c9338) {
                return C3804.m7422(this.f53447.f57477, c9338, c20739);
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
