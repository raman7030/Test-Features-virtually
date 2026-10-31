.class public final Ll/ۢܳۜ;
.super Ll/ۙۛ᩻;
.source "K6WN"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 22
    iput-object p1, p0, Ll/ۢܳۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 42
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 77
    invoke-static {p1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 3

    .line 82
    invoke-static {p1}, Ll/۬ܳۜ;->ۚ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object p1

    .line 83
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    .line 84
    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۢܳۜ;->ܽ:Ll/᩵᩻ۜ;

    .line 85
    invoke-virtual {v2, p1}, Ll/᩵᩻ۜ;->ۧ(Ljava/lang/String;)Ll/۠ܿۜ;

    move-result-object p1

    const/4 v2, 0x1

    invoke-static {p1, v2}, Ll/֨ܳۜ;->֫(Ll/۠ܿۜ;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "signature"

    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 86
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 83
    invoke-static {p1, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read full signing certificate metadata for the original APK saved in a workspace: certificate digests, subject, issuer, validity dates, and algorithms. This detects signature data without verifying signature validity or installability. Edit-session changes are not included. To inspect a built APK, first open that output with mt_apk_workspace_open, then pass its workspaceId. For a compact summary, use mt_apk_workspace_open or mt_apk_build results."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read APK Signature Details"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۢܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open. Reads that workspace\'s original APK, excluding edit-session changes.\"\n  }\n}\n"

    .line 48
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܳۜ;->֫:Lbin/mt/json/JSONObject;

    .line 57
    :cond_0
    iget-object v0, p0, Ll/ۢܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 62
    iget-object v0, p0, Ll/ۢܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 64
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Workspace id used for this read."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    .line 65
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "signature"

    const/4 v2, 0x1

    .line 66
    invoke-static {v2}, Ll/֨ܳۜ;->֫(Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Original APK certificate metadata."

    .line 64
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 67
    invoke-static {}, Ll/۫ܳۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "retry"

    .line 70
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "mt_apk_workspace_open"

    .line 69
    invoke-static {v4, v5, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    new-array v2, v2, [Lbin/mt/json/JSONObject;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "Empty on success; workspace errors may offer reopening the source APK."

    .line 68
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_read_signature."

    .line 63
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 72
    :cond_0
    iget-object v0, p0, Ll/ۢܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_read_signature"

    return-object v0
.end method
