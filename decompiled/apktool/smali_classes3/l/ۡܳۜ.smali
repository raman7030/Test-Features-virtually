.class public final Ll/ۡܳۜ;
.super Ll/ۙۛ᩻;
.source "H79G"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ۖܳۜ;


# direct methods
.method public constructor <init>(Ll/ۖܳۜ;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ۡܳۜ;->ܽ:Ll/ۖܳۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 59
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 115
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "suggestedLocator"

    .line 116
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 117
    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 2

    .line 137
    :try_start_0
    iget-object v0, p0, Ll/ۡܳۜ;->ܽ:Ll/ۖܳۜ;

    invoke-static {p1}, Ll/۬ܳۜ;->֨(Lbin/mt/json/JSONObject;)Ll/֫ۜۜ;

    move-result-object p1

    new-instance v1, Ll/ܺۨ᩻;

    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 137
    invoke-virtual {v0, p1, v1}, Ll/ۖܳۜ;->֫(Ll/֫ۜۜ;Ll/ܺۨ᩻;)Ll/۬ۛ᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    sget v0, Ll/ۡۨ᩻;->֫:I

    return-object p1

    :catchall_0
    move-exception p1

    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 141
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Use this when you need text from a known APK locator string: zip_entry text, decoded axml, dex_class smali, dex_method smali, or dex_field smali. Returned text is LF-normalized. Ordinary zip_entry text is decoded only up to the first 10485760 uncompressed bytes (10 MiB); source truncation cannot be bypassed by paging. For editable locators (zip_entry, axml, dex_class, dex_method), copy data.targetVersion to mt_apk_edit_text; dex_field is read-only and its targetVersion is informational. startLine/startColumn are read positions only, and edit_text does not accept line coordinates. Copy the full locator string exactly. Do not use this for resource table values or raw ZIP entry bytes; use mt_apk_resource_read for resource locators and mt_apk_read_bytes for zip_entry bytes. Continue pages via nextActions."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read APK Text"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۡܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Copy the full locator string returned by nextActions, mt_apk_list, mt_apk_dex_read_class_outline, or mt_apk_search. Accepted prefixes: zip_entry:, axml:, dex_class:, dex_method:, dex_field:. dex_class requires a dex descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Text page line count. Pass 500 by default; maximum 2000.\"\n  },\n  \"maxChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code points in data.textWindow.text. Pass 49152 by default; maximum 131072.\"\n  },\n  \"startLine\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based first line within this read target. Pass 0 by default. For dex_method and dex_field this is member-relative, not class-smali absolute. Smali .line N directives are original Java source debug lines; do not use them as read_text positions. edit_text does not accept line coordinates.\"\n  },\n  \"startColumn\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based code point column within startLine. Pass 0 by default.\"\n  }\n}\n"

    .line 70
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۡܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۡܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 113
    :cond_0
    invoke-static {}, Ll/ۜܳۜ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۡܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_read_text"

    return-object v0
.end method
