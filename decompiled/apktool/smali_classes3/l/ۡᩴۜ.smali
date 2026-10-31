.class public final Ll/ۡᩴۜ;
.super Ll/ۙۛ᩻;
.source "16WX"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public final ۧ:Ll/۬ۡۜ;

.field public ܽ:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/۬ۡۜ;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ۡᩴۜ;->ۧ:Ll/۬ۡۜ;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 5

    .line 170
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "destinationPath"

    const-string v2, "new/name.bin"

    const-string v3, "sourcePath"

    const-string v4, "old/name.bin"

    .line 0
    invoke-static {v3, v4, v1, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "overwrite"

    const/4 v3, 0x0

    .line 174
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 170
    invoke-static {p1, p2, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 65
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

    const-string v0, "mt_file_move"

    .line 87
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 7

    .line 152
    new-instance v0, Ll/ۢᩴۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "sourcePath"

    const-string v2, "destinationPath"

    const-string v3, "overwrite"

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "Invalid mt_file_move argument"

    invoke-static {p1, v0, v5, v4}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    .line 42
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v4, "Invalid string argument"

    if-eqz v0, :cond_2

    .line 43
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 46
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 43
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 46
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v4

    .line 51
    invoke-virtual {p1, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 52
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 55
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p1

    .line 97
    iget-object v3, p0, Ll/ۡᩴۜ;->ۧ:Ll/۬ۡۜ;

    invoke-virtual {v3, v0, v4, p1}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۡۜ;

    move-result-object p1

    iget-object v0, p1, Ll/ۗۡۜ;->֫:Ljava/lang/String;

    .line 99
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    invoke-virtual {v3, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 100
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v5, p1, Ll/ۗۡۜ;->ۧ:Ljava/lang/String;

    .line 101
    invoke-virtual {v4, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 102
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    iget-object v2, p1, Ll/ۗۡۜ;->ܽ:Ljava/lang/String;

    .line 103
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "warnings"

    iget-object p1, p1, Ll/ۗۡۜ;->ᩳ:Lbin/mt/json/JSONArray;

    .line 104
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 105
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "inspect"

    const-string v4, "Inspect the moved node at its normalized destination path."

    const-string v5, "mt_file_stat"

    .line 106
    invoke-static {v3, v5, v2, v4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 105
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p1, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    :cond_0
    const-string v0, "Invalid boolean argument"

    .line 53
    invoke-static {p1, v0, v3}, Ll/ۡᩴۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 44
    :cond_1
    invoke-static {v5, v4, v2}, Ll/ۡᩴۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {v0, v4, v1}, Ll/ۡᩴۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Move or rename one regular local file or directory. Paths may be absolute or relative to Home and must differ; the destination parent must exist. For files, overwrite=true permits replacing an existing regular file. Directories require overwrite=false and a missing destination; they cannot be merged, replaced, or moved into themselves or descendants. Moves that require copying then deleting are unsupported. Some storage locations cannot change the parent and basename together: move with the same basename first, then rename. After a failure, inspect the reported state before retrying."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Move Local File"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 70
    iget-object v0, p0, Ll/ۡᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 113
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Non-empty absolute or Home-relative source path."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "sourcePath"

    .line 114
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Non-empty absolute or Home-relative destination path."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "destinationPath"

    .line 116
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "For a regular file, allow direct replacement of an existing regular file; must be false for a directory."

    const-string v2, "boolean"

    const-string v3, "overwrite"

    const-string v4, "Arguments for mt_file_move."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 71
    iput-object v0, p0, Ll/ۡᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 73
    :cond_0
    iget-object v0, p0, Ll/ۡᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 7

    .line 78
    iget-object v0, p0, Ll/ۡᩴۜ;->ܽ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 123
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute source identity that no longer exists."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "sourcePath"

    .line 124
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute destination identity of the moved node."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "destinationPath"

    .line 126
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Moved node type: file or directory."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "type"

    .line 128
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "description"

    const-string v4, "Non-fatal notification or backend metadata degradation."

    const-string v5, "array"

    .line 0
    invoke-static {v3, v5, v1, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "One warning message."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "items"

    .line 137
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "warnings"

    .line 130
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful direct local file move."

    .line 123
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_move"

    .line 80
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 145
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    const-string v5, "Normalized absolute moved destination path."

    const-string v6, "Arguments for mt_file_stat."

    .line 0
    invoke-static {v3, v2, v5, v4, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_file_stat"

    const-string v4, "inspect"

    .line 143
    invoke-static {v2, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-string v2, "Success returns one mt_file_stat verification action."

    .line 141
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_file_move."

    .line 79
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۡᩴۜ;->ܽ:Lbin/mt/json/JSONObject;

    .line 82
    :cond_0
    iget-object v0, p0, Ll/ۡᩴۜ;->ܽ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_move"

    return-object v0
.end method
