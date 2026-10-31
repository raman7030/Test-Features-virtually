.class public final Ll/֨֫ۜ;
.super Ll/ۙۛ᩻;
.source "T761"


# instance fields
.field public final ֫:Ll/᩹ۧۜ;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ܰ۟᩻;

.field public final ܿ:Ll/᩵᩻ۜ;

.field public ᩳ:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 2

    .line 31
    new-instance v0, Ll/᩹ۧۜ;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v1, Ll/ܰ۟᩻;

    .line 22
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 46
    iput-object p1, p0, Ll/֨֫ۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 47
    iput-object v0, p0, Ll/֨֫ۜ;->֫:Ll/᩹ۧۜ;

    .line 48
    iput-object v1, p0, Ll/֨֫ۜ;->ܽ:Ll/ܰ۟᩻;

    return-void
.end method

.method public static ֫(Ll/֨֫ۜ;Ll/ۚ۟᩻;Ll/۟۟᩻;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 136
    iget-object p2, p2, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    .line 152
    :try_start_0
    iget-object p0, p0, Ll/֨֫ۜ;->֫:Ll/᩹ۧۜ;

    iget-wide v0, p1, Ll/ۚ۟᩻;->֫:J

    const-string v2, "virtual"

    iget-object v3, p1, Ll/ۚ۟᩻;->ܽ:Ljava/lang/String;

    .line 153
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x1

    .line 114
    invoke-static {p2, v0, v1, v2, p0}, Ll/ܺܺۢ;->֫(Ljava/lang/String;JZZ)Ll/ۘܺۢ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    invoke-static {p1, p0}, Ll/۫֫ۜ;->֫(Ll/ۚ۟᩻;Ll/ۘܺۢ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    :catch_0
    const-string p0, "NATIVE_ANALYZER_FAILED"

    const-string p1, "Native ELF analysis failed."

    .line 155
    invoke-static {p0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static synthetic ֫(Ll/֨֫ۜ;Ll/ۚ۟᩻;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 133
    iget-object v0, p0, Ll/֨֫ۜ;->ܽ:Ll/ܰ۟᩻;

    iget-object v1, p1, Ll/ۚ۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v2, p1, Ll/ۚ۟᩻;->ܿ:Ljava/lang/String;

    new-instance v3, Ll/ۚ֫ۜ;

    invoke-direct {v3, p0, p1}, Ll/ۚ֫ۜ;-><init>(Ll/֨֫ۜ;Ll/ۚ۟᩻;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p3, v1, v2, v3}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbin/mt/json/JSONObject;

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 68
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

    .line 480
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 119
    iget-object v0, p0, Ll/֨֫ۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 129
    :try_start_0
    invoke-static {p1}, Ll/ۙ۟᩻;->ᩳ(Lbin/mt/json/JSONObject;)Ll/ۚ۟᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v1, p1, Ll/ۚ۟᩻;->᩻:Ljava/lang/String;

    .line 131
    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 132
    :try_start_2
    new-instance v3, Ll/֡֫ۜ;

    invoke-direct {v3, p0, p1}, Ll/֡֫ۜ;-><init>(Ll/֨֫ۜ;Ll/ۚ۟᩻;)V

    invoke-virtual {v0, v1, v3}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ll/ܺ᩻ۜ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONObject;

    .line 139
    new-instance v4, Ll/۬ۛ᩻;

    invoke-direct {v4, v3}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    :try_start_3
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 143
    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 145
    sget p1, Ll/ۡۨ᩻;->֫:I

    return-object v4

    :catchall_0
    move-exception v1

    .line 131
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

    .line 143
    iget-object p1, p1, Ll/ۚ۟᩻;->᩻:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 145
    :cond_0
    sget p1, Ll/ۡۨ᩻;->֫:I

    .line 146
    throw v1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Map an ELF virtual address to a file offset, or the reverse, inside a zip_entry shared object. file_offset refers to SO bytes, not APK container offsets. Check data.found and data.mapping.isLoaded before treating an address as loaded; only disassemble when data.mapping.isExecutable=true. data.mapping.enclosingSymbol provides best-effort symbol context and follow-up hints for mt_apk_native_analyze_control_flow. A miss returns data.found=false rather than an error. See mapping fields for symbol and instruction-mode limitations."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Map Native Address"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/֨֫ۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to map the edited session view; pass an empty string to map the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  }\n}\n"

    .line 76
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/֨֫ۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/֨֫ۜ;->ᩳ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 109
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/֨֫ۜ;->ᩳ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_native_map_address"

    return-object v0
.end method
