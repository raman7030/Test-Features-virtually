.class public final Ll/ᩳ۬᩻;
.super Ljava/lang/Object;
.source "Y6VM"


# static fields
.field public static volatile ֫:Ll/ᩳ۬᩻;


# direct methods
.method public static ֫(Ll/ۚۜۜ;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 31
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    iget-object v2, p0, Ll/ۚۜۜ;->ᩳ:Ljava/lang/String;

    .line 32
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editSessionId"

    iget-object v2, p0, Ll/ۚۜۜ;->֫:Ljava/lang/String;

    .line 33
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ۚۜۜ;->ܽ:Ljava/lang/String;

    iget-object p0, p0, Ll/ۚۜۜ;->ۧ:Ljava/lang/String;

    .line 34
    invoke-static {v1, p0}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "locator"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "deleted"

    const/4 v1, 0x1

    .line 35
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 31
    invoke-static {p0, v0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 247
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "verify_workspace"

    invoke-static {p0, p3, v1, p4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string p3, "fatal"

    .line 249
    invoke-static {p0, p1, p2, p3}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "view"

    const-string v0, "dex_classes"

    .line 192
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "prefix"

    const-string v0, ""

    .line 193
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "limit"

    const/16 v0, 0xc8

    .line 194
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "CLASS_NOT_FOUND"

    const-string v0, "Class not found"

    const-string v1, "mt_apk_list"

    const-string v2, "Verify dex classes in workspace"

    .line 187
    invoke-static {p0, p1, v0, v1, v2}, Ll/ᩳ۬᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 6

    const-string v1, "Field not found"

    const-string v2, "Verify class outline for field signatures"

    const-string v0, "FIELD_NOT_FOUND"

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    .line 223
    invoke-static/range {v0 .. v5}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 6

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p3, v1, p4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v0, "dex_class"

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v2, p5

    .line 237
    invoke-static/range {v0 .. v5}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-string p5, "locator"

    invoke-virtual {p3, p5, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string p4, "limit"

    const/16 p5, 0xc8

    .line 239
    invoke-virtual {p3, p4, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string p4, "mt_apk_dex_read_class_outline"

    .line 232
    invoke-static {p3, p0, p1, p4, p2}, Ll/ᩳ۬᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;
    .locals 6

    const-string v0, "path"

    const-string v1, "fatal"

    const-string v2, "Workspace is corrupt."

    const-string v3, "WORKSPACE_CORRUPT"

    if-eqz p0, :cond_0

    .line 53
    :try_start_0
    invoke-static {p0, v0}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 54
    invoke-static {}, Ll/᩹ۤ᩻;->֫()Ll/᩸ۤ᩻;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸ۤ᩻;->֫()Ll/۟ۢۜ;

    move-result-object v4

    .line 55
    invoke-virtual {v4, p0}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    .line 56
    invoke-static {p0, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 57
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 58
    invoke-virtual {v4, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "temporary"

    .line 59
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 62
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string v0, "mt_apk_workspace_open"

    const-string v4, "retry"

    const-string v5, "Recreate workspace from source APK"

    invoke-static {p0, v0, v4, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p1, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 60
    invoke-static {p0, v3, v2, v1}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    .line 70
    invoke-static {p0, v3, v2, v1}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()Ll/ᩳ۬᩻;
    .locals 2

    .line 19
    sget-object v0, Ll/ᩳ۬᩻;->֫:Ll/ᩳ۬᩻;

    const-string v1, "MCP host is not installed"

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public static ֫(Ll/ᩳ۬᩻;)V
    .locals 0

    .line 14
    sput-object p0, Ll/ᩳ۬᩻;->֫:Ll/ᩳ۬᩻;

    return-void
.end method

.method public static ۧ()Ll/ۗۛ᩻;
    .locals 4

    const-string v0, "fatal"

    .line 37
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "OUT_OF_MEMORY"

    const-string v3, "Not enough memory to complete this operation."

    .line 35
    invoke-static {v1, v2, v3, v0}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "view"

    const-string v0, "resource_table"

    .line 117
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "prefix"

    const-string v0, ""

    .line 118
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "limit"

    const/16 v0, 0xc8

    .line 119
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "RESOURCE_NOT_FOUND"

    const-string v0, "Resource not found."

    const-string v1, "mt_apk_list"

    const-string v2, "Verify resource table entries in workspace"

    .line 112
    invoke-static {p0, p1, v0, v1, v2}, Ll/ᩳ۬᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 6

    const-string v1, "Method not found"

    const-string v2, "Verify class outline for method signatures"

    const-string v0, "METHOD_NOT_FOUND"

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    .line 208
    invoke-static/range {v0 .. v5}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 6

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v0, "zip_entry"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    .line 166
    invoke-static/range {v0 .. v5}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "locator"

    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "byteOffset"

    const/4 p2, 0x0

    .line 167
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "maxBytes"

    const/16 p2, 0x100

    .line 168
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 169
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string p2, "retry"

    const-string v0, "Read this ZIP entry as hex bytes"

    const-string v1, "mt_apk_read_bytes"

    invoke-static {p0, v1, p2, v0}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p1, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string p1, "Not a text entry. Use mt_apk_read_bytes to inspect raw bytes."

    const-string p2, "fatal"

    const-string v0, "NOT_TEXT_ENTRY"

    .line 171
    invoke-static {p0, v0, p1, p2}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 10

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v0, "axml"

    const/4 v2, 0x0

    const/4 v8, 0x0

    move-object v1, p2

    move-object v3, v8

    move-object v4, v6

    move-object v5, v7

    .line 134
    invoke-static/range {v0 .. v5}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "axml"

    move-object v1, p2

    .line 138
    invoke-static/range {v0 .. v5}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "locator"

    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "limit"

    const/16 p2, 0x1f4

    .line 139
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "maxChars"

    const p2, 0xc000

    .line 140
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "startLine"

    const/4 p2, 0x0

    .line 141
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "startColumn"

    .line 142
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 143
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string p2, "retry"

    const-string v0, "Read this ZIP entry as decoded AXML"

    const-string v1, "mt_apk_read_text"

    invoke-static {p0, v1, p2, v0}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p1, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 148
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "suggestedLocator"

    invoke-virtual {p1, p2, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "NOT_TEXT_ENTRY"

    const-string v0, "Not a text entry. This ZIP entry appears to be Android Binary XML (AXML). Use the suggested axml:<entry> locator."

    const-string v1, "fatal"

    .line 145
    invoke-static {p2, v0, v1, p0, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    .line 21
    invoke-static {}, Ll/᩵ܶ᩷;->ܽ()Ll/᩵ܶ᩷;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
