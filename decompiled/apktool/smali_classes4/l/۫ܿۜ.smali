.class public final Ll/۫ܿۜ;
.super Ll/ۙۛ᩻;
.source "0780"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 33
    iput-object p1, p0, Ll/۫ܿۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 56
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 74
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "workspaceId"

    .line 0
    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "editSessionId"

    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "outputPath"

    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const/4 v2, 0x0

    const-string v3, "overlaySaved"

    .line 78
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "failures"

    .line 79
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Ll/۫ܳۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 52
    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 108
    iget-object v0, p0, Ll/۫ܿۜ;->ܽ:Ll/᩵᩻ۜ;

    const-string v1, "/"

    .line 118
    :try_start_0
    invoke-static {}, Ll/ܽۨ᩻;->֫()V

    .line 119
    invoke-static {p1}, Ll/۬ܳۜ;->ᩳ(Lbin/mt/json/JSONObject;)Ll/᩸᩻ۜ;

    move-result-object p1

    iget-object v2, p1, Ll/᩸᩻ۜ;->ۧ:Ljava/lang/String;

    .line 120
    invoke-static {}, Ll/᩹ۤ᩻;->֫()Ll/᩸ۤ᩻;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۤ᩻;->֫()Ll/۟ۢۜ;

    move-result-object v3

    .line 122
    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    .line 123
    invoke-static {v2, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    iget-object v4, v3, Ll/۟ۢۜ;->ۧ:Ljava/lang/String;

    :goto_0
    if-nez v4, :cond_1

    move-object v4, v2

    .line 127
    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 128
    invoke-virtual {v3, v2}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v3, v2}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 131
    :cond_2
    invoke-virtual {v3, v4}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 134
    invoke-static {}, Ll/᩹ۤ᩻;->ۧ()Ll/ۛۖۜ;

    move-result-object v1

    invoke-virtual {v1, v4}, Ll/ۛۖۜ;->ۧ(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 135
    :try_start_1
    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 136
    :try_start_2
    iget-object v3, v3, Ll/۟ۢۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1, v3}, Ll/᩵᩻ۜ;->֫(Ll/᩸᩻ۜ;Ljava/lang/String;)Ll/ۘۜۜ;

    move-result-object p1

    .line 137
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 138
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {p1}, Ll/᩻֡ۚ;->֫(Ll/ۘۜۜ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    :try_start_3
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v1}, Ll/ۤۖۜ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    return-object v0

    :catchall_0
    move-exception p1

    .line 133
    :try_start_5
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_7
    invoke-virtual {v1}, Ll/ۤۖۜ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    :try_start_8
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception p1

    .line 141
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 142
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Build the current edit session into a new APK without modifying the source APK. For pre-build content checks without producing an APK, use mt_apk_session_check with runBuildChecks=true; passing them does not guarantee this build will succeed. All saved text, resource, byte edits, and deletions are included. Existing ZIP entries keep their compression method; new entries use APK compression rules. sign=true uses the signing key configured in MT MCP settings. sign=false skips signing but may preserve original signature data; it does not guarantee a valid signature on the changed APK. outputName is a file name in Home or an absolute path. The output file and its existing parent directory must have read-write access under the MCP file policy. An empty name selects <sourceBase>_mcp_<editSessionId>_sign.apk or <sourceBase>_mcp_<editSessionId>_unsigned.apk with the same overwrite policy as an explicit name. overwrite=false rejects an existing file; pass true only to allow replacement. Use nextActions to inspect the built APK."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Build APK"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/۫ܿۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"outputName\": {\n    \"type\": \"string\",\n    \"description\": \"Output APK file name in Home or an absolute path. The file and its existing parent directory must have MCP read-write access. Relative directory paths and URIs are not accepted. Use an empty string for the default name.\"\n  },\n  \"overwrite\": {\n    \"type\": \"boolean\",\n    \"description\": \"Applies to both default and explicit output names. If the output exists and overwrite=false, returns OUTPUT_ALREADY_EXISTS. Pass true only to allow replacement.\"\n  },\n  \"sign\": {\n    \"type\": \"boolean\",\n    \"description\": \"Required. Pass true normally to sign the output APK, or false to skip signing.\"\n  }\n}\n"

    .line 64
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/۫ܿۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 11

    .line 92
    iget-object v0, p0, Ll/۫ܿۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 83
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this build."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 84
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this build."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "editSessionId"

    .line 85
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Absolute path of the published APK output file."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "outputPath"

    .line 86
    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Published APK file name."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "apkFileName"

    .line 87
    invoke-virtual {v0, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v6, "Published APK size in bytes."

    .line 110
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "size"

    .line 88
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "boolean"

    const-string v7, "Whether this build performed APK signing; false does not imply that preserved original signature data is absent."

    .line 124
    invoke-static {v6, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "signingPerformed"

    .line 89
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Signing schemes requested by MT MCP settings when signingPerformed=true; empty when signingPerformed=false."

    .line 90
    invoke-static {v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "signSchemes"

    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const/4 v7, 0x0

    .line 110
    invoke-static {v7}, Ll/֨ܳۜ;->֫(Z)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Signature data summary read without full verification. When build signingPerformed=false, this may still report original V1 entries or preserved V2/V3 data. Use mt_apk_read_signature after opening the built APK for full certificate attributes."

    const-string v10, "description"

    .line 111
    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v9, "signatureSummary"

    .line 91
    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "Dex entries rewritten or created during dex merge."

    .line 92
    invoke-static {v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "changedDexEntries"

    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "Modified or deleted class count applied to the build."

    .line 110
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "changedClassCount"

    .line 93
    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "Deleted class count applied to the build."

    .line 110
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "deletedClassCount"

    .line 94
    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "New AXML or ordinary ZIP entries added by the edit session."

    .line 95
    invoke-static {v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "addedZipEntries"

    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "Existing AXML or ordinary ZIP entries replaced by the edit session, including raw byte patches; resource patches appear here as resources.arsc."

    .line 96
    invoke-static {v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "changedZipEntries"

    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "Existing AXML or ordinary ZIP entries deleted by the edit session."

    .line 97
    invoke-static {v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "deletedZipEntries"

    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "Successful build data."

    .line 83
    invoke-static {v0, v8}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 101
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Workspace id, or null."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 102
    invoke-virtual {v8, v3, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Edit session id, or null."

    .line 103
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-virtual {v3, v4, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Output path related to the error, or null."

    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 104
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session."

    .line 124
    invoke-static {v6, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "overlaySaved"

    .line 105
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "array"

    const-string v5, "Edit session prepare failures when build stops before packaging."

    const-string v6, "type"

    .line 0
    invoke-static {v6, v4, v10, v5}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 119
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "locator"

    .line 120
    invoke-virtual {v5, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Dex class descriptor."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "className"

    .line 121
    invoke-virtual {v5, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Failure code."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "errorCode"

    .line 122
    invoke-virtual {v5, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Compiler error message."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "message"

    .line 123
    invoke-virtual {v5, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "0-based line, or null."

    .line 117
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "line"

    .line 124
    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "0-based column, or null."

    .line 117
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "column"

    .line 125
    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "One edit session prepare failure."

    .line 119
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "items"

    invoke-virtual {v4, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "failures"

    .line 106
    invoke-virtual {v3, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Build diagnostics."

    .line 101
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 29
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "inspect"

    .line 131
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_workspace_open"

    .line 130
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    aput-object v2, v3, v7

    const-string v2, "Successful build returns mt_apk_workspace_open with temporary=true for the published APK."

    .line 129
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_build. data describes the published APK output, including signing results and changed dex/class counts."

    .line 27
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 95
    iput-object v0, p0, Ll/۫ܿۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_build"

    return-object v0
.end method
