.class public final Ll/ᩳᩴۜ;
.super Ll/ۙۛ᩻;
.source "Q6XN"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ܶۡۜ;


# direct methods
.method public constructor <init>(Ll/ܶۡۜ;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ᩳᩴۜ;->ܽ:Ll/ܶۡۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 69
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "destructiveHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 1

    const-string v0, "mt_file_delete"

    .line 97
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 4

    .line 117
    new-instance v0, Ll/ܽᩴۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "path"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "Invalid file delete argument"

    invoke-static {p1, v0, v3, v2}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    .line 104
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 105
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Ll/ᩳᩴۜ;->ܽ:Ll/ܶۡۜ;

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܶۡۜ;->֫(Ljava/lang/String;)Ll/۠ۡۜ;

    move-result-object p1

    .line 109
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v2, p1, Ll/۠ۡۜ;->֫:Ljava/lang/String;

    .line 110
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    new-instance v1, Lbin/mt/json/JSONArray;

    iget-object p1, p1, Ll/۠ۡۜ;->ۧ:Lbin/mt/json/JSONArray;

    invoke-direct {v1, p1}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string p1, "warnings"

    .line 111
    invoke-virtual {v0, p1, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 112
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p1, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    .line 123
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 124
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "file.bin"

    invoke-virtual {v2, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Invalid path"

    .line 123
    invoke-static {v3, v1, p1, v0, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 106
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Permanently delete exactly one allowed regular local file. The deletion does not use a recycle bin, does not follow or remove recognized symbolic links, does not accept directories or wildcards, and does not use targetVersion. Paths may be absolute or relative to Home. If deletion fails, inspect error diagnostics before retrying."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Delete Local File"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 74
    iget-object v0, p0, Ll/ᩳᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 128
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Non-empty absolute path or path relative to the Home captured at call start."

    const-string v2, "string"

    const-string v3, "path"

    const-string v4, "Arguments for mt_file_delete."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 75
    iput-object v0, p0, Ll/ᩳᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 77
    :cond_0
    iget-object v0, p0, Ll/ᩳᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 82
    iget-object v0, p0, Ll/ᩳᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 84
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute path fixed for this call."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "path"

    .line 85
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "description"

    const-string v3, "Non-fatal file change notification degradation."

    const-string v4, "type"

    const-string v5, "array"

    .line 0
    invoke-static {v4, v5, v1, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "One warning message."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "items"

    .line 136
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    .line 87
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful permanent file deletion."

    .line 83
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_delete"

    .line 89
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_file_delete has no automatic follow-up action."

    invoke-static {v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_file_delete."

    .line 88
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 92
    :cond_0
    iget-object v0, p0, Ll/ᩳᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_delete"

    return-object v0
.end method
