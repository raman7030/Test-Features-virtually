.class public final Ll/֫֡ۜ;
.super Ll/ۙۛ᩻;
.source "Z6M0"


# instance fields
.field public final ֫:Ll/ۢ᩵ۜ;


# direct methods
.method public constructor <init>(Ll/ۢ᩵ۜ;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 19
    iput-object p1, p0, Ll/֫֡ۜ;->֫:Ll/ۢ᩵ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 39
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

    const/4 v0, 0x1

    .line 61
    invoke-static {p1, v0}, Ll/᩷֡ۜ;->֫(Ll/ۗۛ᩻;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 2

    .line 66
    new-instance v0, Ll/۬ۛ᩻;

    iget-object v1, p0, Ll/֫֡ۜ;->֫:Ll/ۢ᩵ۜ;

    invoke-virtual {v1, p1}, Ll/ۢ᩵ۜ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p1, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Extract files or directory contents from a ZIP to explicit local destinations. Unsafe extraction paths, destination conflicts, or symbolic links in the selected entries reject the entire request before output is created. Required directories are created. Extraction cannot overwrite its source ZIP. Failure or cancellation can leave completed files and directories; check the reported progress before retrying."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Extract ZIP"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 44
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Exact full ZIP file path or directory path ending in /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization. An empty string selects the ZIP root. Directory mappings remove the selected prefix: docs/ to out/ maps docs/a.txt to out/a.txt; / to out/ maps /a.txt to out/a.txt."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "entryPath"

    .line 45
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "destinationPath"

    const-string v3, "Absolute or Home-relative destination. For a file, specify the complete target filename; the ZIP source name does not affect it. For a directory, end in /. The remaining ZIP suffix must not start with / or contain a .. segment; . segments are removed, characters such as ? and * become _, and whitespace becomes spaces. Use individual file mappings to choose exact filenames."

    const-string v4, "One extraction mapping."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 47
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Absolute or Home-relative source ZIP file; split archives are not supported."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    .line 48
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 49
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "type"

    const-string v5, "array"

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "items"

    invoke-virtual {v3, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "description"

    const-string v4, "Non-empty extraction mappings. Expanded entries must not collide at the same local destination or require a file as a parent directory."

    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "entries"

    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "One password used for all selected encrypted files; pass an empty string if none are encrypted. Extract files requiring different passwords in separate calls."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "password"

    .line 50
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Allow replacing existing regular destination files; recommended false."

    const-string v2, "boolean"

    const-string v3, "overwrite"

    const-string v4, "Arguments for mt_zip_extract."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "mt_zip_extract"

    const/4 v1, 0x1

    .line 56
    invoke-static {v0, v1}, Ll/᩷֡ۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_zip_extract"

    return-object v0
.end method
