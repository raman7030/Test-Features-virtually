.class public final Ll/ᩳ֫ۜ;
.super Ll/ۙۛ᩻;
.source "E752"


# instance fields
.field public final ֫:Ll/᩹ۧۜ;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ܰ۟᩻;

.field public final ܿ:Ll/᩵᩻ۜ;

.field public ᩳ:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 2

    .line 30
    new-instance v0, Ll/᩹ۧۜ;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v1, Ll/ܰ۟᩻;

    .line 22
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 47
    iput-object p1, p0, Ll/ᩳ֫ۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 48
    iput-object v0, p0, Ll/ᩳ֫ۜ;->֫:Ll/᩹ۧۜ;

    .line 49
    iput-object v1, p0, Ll/ᩳ֫ۜ;->ܽ:Ll/ܰ۟᩻;

    return-void
.end method

.method public static synthetic ֫(Ll/ᩳ֫ۜ;Ll/᩵۟᩻;Ll/۟۟᩻;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 160
    iget-object p0, p0, Ll/ᩳ֫ۜ;->֫:Ll/᩹ۧۜ;

    invoke-static {p0, p2, p1}, Ll/֫֫ۜ;->֫(Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/᩵۟᩻;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ᩳ֫ۜ;Ll/᩵۟᩻;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 157
    iget-object v0, p0, Ll/ᩳ֫ۜ;->ܽ:Ll/ܰ۟᩻;

    iget-object v1, p1, Ll/᩵۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v2, p1, Ll/᩵۟᩻;->ܿ:Ljava/lang/String;

    new-instance v3, Ll/ܽ֫ۜ;

    invoke-direct {v3, p0, p1}, Ll/ܽ֫ۜ;-><init>(Ll/ᩳ֫ۜ;Ll/᩵۟᩻;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p3, v1, v2, v3}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbin/mt/json/JSONObject;

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 69
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 499
    invoke-static {p1}, Ll/ۜ֫ۜ;->ۧ(Ll/ۗۛ᩻;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 500
    invoke-static {p1}, Ll/ۜ֫ۜ;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object v0

    goto :goto_0

    .line 501
    :cond_0
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_0
    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    .line 498
    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 142
    iget-object v0, p0, Ll/ᩳ֫ۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 153
    :try_start_0
    invoke-static {p1}, Ll/ۙ۟᩻;->ۧ(Lbin/mt/json/JSONObject;)Ll/᩵۟᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v1, p1, Ll/᩵۟᩻;->ܺ:Ljava/lang/String;

    .line 155
    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 156
    :try_start_2
    new-instance v3, Ll/ۧ֫ۜ;

    invoke-direct {v3, p0, p1}, Ll/ۧ֫ۜ;-><init>(Ll/ᩳ֫ۜ;Ll/᩵۟᩻;)V

    invoke-virtual {v0, v1, v3}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ll/ܺ᩻ۜ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONObject;

    .line 162
    new-instance v4, Ll/۬ۛ᩻;

    invoke-direct {v4, v3}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 163
    :try_start_3
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 166
    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 168
    sget p1, Ll/ۡۨ᩻;->֫:I

    return-object v4

    :catchall_0
    move-exception v1

    .line 155
    :try_start_4
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_5
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    goto :goto_1

    :catchall_3
    move-exception v1

    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_0

    .line 166
    iget-object p1, p1, Ll/᩵۟᩻;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 168
    :cond_0
    sget p1, Ll/ۡۨ᩻;->֫:I

    .line 169
    throw v1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Build a bounded direct static control-flow graph within one ELF function. Use a symbol start from mt_apk_native_map_address or an instruction source from mt_apk_native_xref. An address inside a sized FUNC symbol resolves to that function; missing or unreliable symbols fall back to the requested executable address. Use outputMode=summary for triage, full for blocks and edges. Recommended budgets: maxAnalysisBytes=16384, maxBlocks=256, maxInstructions=2000. Calls are not followed or represented as CFG edges; indirect jumps and switch tables may remain unresolved. Shape hints describe only the analyzed subgraph, not the whole function. This tool does not paginate. When a budget stops analysis, nextActions may rerun with larger budgets; the new graph replaces the old one and must not be merged. Invalid instructions, indirect jumps, mode transitions, and non-executable targets cannot be resolved by increasing budgets. Use mt_apk_native_disassemble for exact bytes or patch context."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Analyze Native Control Flow"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ᩳ֫ۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass an empty string for the base APK, or the id from mt_apk_session_create for the edited view.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for an ELF virtual address or file_offset for an ELF file offset inside the SO entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned function symbol address or address inside a function candidate. Accepts decimal or 0x/0X hex in 0..9223372036854775807.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode: auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from an odd virtual address; otherwise retry diagnostics offer explicit modes.\"\n  },\n  \"outputMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"full\", \"summary\"],\n    \"description\": \"Required output mode. Use full to populate blocks, edges, externalFlows, and unresolvedFlows. In summary mode, blocks, edges, externalFlows, and unresolvedFlows remain present as empty arrays while analysisSummary and observedGraphSummary retain observed counts.\"\n  },\n  \"maxAnalysisBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Unique successfully decoded instruction-byte budget. Recommended 16384; valid range 16..65536.\"\n  },\n  \"maxBlocks\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum basic-block candidates to examine. Recommended 256; valid range 1..4096. Rejected candidates count toward this limit.\"\n  },\n  \"maxInstructions\": {\n    \"type\": \"integer\",\n    \"description\": \"Unique successfully decoded instruction budget. Recommended 2000; valid range 1..10000.\"\n  }\n}\n"

    .line 77
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ֫ۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ᩳ֫ۜ;->ᩳ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 132
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ֫ۜ;->ᩳ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_native_analyze_control_flow"

    return-object v0
.end method
