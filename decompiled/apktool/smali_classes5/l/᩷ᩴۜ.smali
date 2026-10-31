.class public final Ll/᩷ᩴۜ;
.super Ll/ۙۛ᩻;
.source "R6XW"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩻ܺۜ;


# direct methods
.method public constructor <init>(Ll/᩻ܺۜ;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 49
    iput-object p1, p0, Ll/᩷ᩴۜ;->ܽ:Ll/᩻ܺۜ;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "Invalid "

    .line 148
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 43
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 46
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 44
    :cond_0
    invoke-static {p0, v0, p1}, Ll/᩷ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static synthetic ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩷ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 5

    .line 176
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 177
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "path"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "recursive"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "cursor"

    .line 178
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "limit"

    const/16 v3, 0xc8

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 176
    invoke-static {p1, p2, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ᩻()Lbin/mt/json/JSONObject;
    .locals 5

    .line 182
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Absolute or Home-relative directory. Pass \"\" (empty string) for the current Home directory."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 183
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Whether to traverse readable subdirectories depth-first without following recognized links."

    const-string v3, "boolean"

    .line 124
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "recursive"

    .line 185
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Pass \"\" (empty string) initially; later copy the server-provided cursor unchanged."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "cursor"

    .line 187
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Page size from 1 to 1000; recommended value is 200 and must remain unchanged for a cursor."

    const-string v2, "integer"

    const-string v3, "limit"

    const-string v4, "Arguments for mt_file_list."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
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
    .locals 1

    const-string v0, "mt_file_list"

    .line 105
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 11

    .line 142
    new-instance v0, Ll/ۜᩴۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "path"

    const-string v2, "recursive"

    const-string v3, "cursor"

    const-string v4, "limit"

    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "Invalid mt_file_list argument"

    invoke-static {p1, v0, v6, v5}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    .line 111
    invoke-static {p1, v1}, Ll/᩷ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 52
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 55
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v5

    .line 113
    invoke-static {p1, v3}, Ll/᩷ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 159
    invoke-virtual {p1, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    const-string v7, "Invalid limit"

    if-eqz p1, :cond_3

    .line 160
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 165
    :try_start_0
    invoke-static {p1}, Ll/֨ۙ᩵;->ۧ(Lbin/mt/json/JSONValue;)I

    move-result v7
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v8, 0x1

    if-lt v7, v8, :cond_2

    const/16 v8, 0x3e8

    if-gt v7, v8, :cond_2

    .line 115
    iget-object p1, p0, Ll/᩷ᩴۜ;->ܽ:Ll/᩻ܺۜ;

    invoke-virtual {p1, v0, v7, v6, v5}, Ll/᩻ܺۜ;->֫(Ljava/lang/String;ILjava/lang/String;Z)Ll/ᩳܺۜ;

    move-result-object p1

    iget-object v0, p1, Ll/ᩳܺۜ;->֫:Ljava/lang/String;

    iget-object v5, p1, Ll/ᩳܺۜ;->ܿ:Ljava/lang/String;

    iget-boolean v6, p1, Ll/ᩳܺۜ;->ۧ:Z

    .line 116
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "hasMore"

    .line 117
    invoke-virtual {v7, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "nextCursor"

    .line 118
    invoke-virtual {v7, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 119
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    .line 120
    iget-object v9, p1, Ll/ᩳܺۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 121
    invoke-virtual {v8, v10}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 123
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "directoryPath"

    .line 124
    invoke-virtual {v9, v10, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "listing"

    .line 125
    invoke-virtual {v9, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "pagination"

    .line 126
    invoke-virtual {v8, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 127
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    if-eqz v6, :cond_1

    .line 131
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 132
    invoke-virtual {v6, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-boolean v1, p1, Ll/ᩳܺۜ;->ܳ:Z

    .line 133
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 134
    invoke-virtual {v0, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget p1, p1, Ll/ᩳܺۜ;->ܽ:I

    .line 135
    invoke-virtual {v0, v4, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "mt_file_list"

    const-string v1, "continue"

    const-string v2, "Continue this exact local directory traversal."

    .line 129
    invoke-static {p1, v0, v1, v2}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {v8, p1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 137
    :cond_1
    new-instance p1, Ll/۬ۛ᩻;

    invoke-static {v7, v8}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object p1

    :cond_2
    const-string v0, "limit must be between 1 and 1000"

    .line 170
    invoke-static {p1, v0, v4}, Ll/᩷ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 167
    :catch_0
    invoke-static {p1, v7, v4}, Ll/᩷ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 161
    :cond_3
    invoke-static {p1, v7, v4}, Ll/᩷ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_4
    const-string p1, "Invalid recursive"

    .line 53
    invoke-static {v5, p1, v2}, Ll/᩷ᩴۜ;->ۧ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "List an allowed local directory as a compact entry list. path accepts an absolute path or a Home-relative path; only this tool accepts path=\"\" as current Home. Pass cursor=\"\" initially, limit=200 unless another page size is needed, and no more than 1000. The listing includes hidden entries, uses absolute data.directoryPath as its fixed base, and recursively traverses readable directories depth-first without following recognized links. Later pages may reuse directory metadata for up to 30 seconds; start with an empty cursor for a fresh listing. This is not a filesystem snapshot. Copy nextActions[0].arguments unchanged for later pages."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "List Local Files"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/᩷ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 75
    invoke-static {}, Ll/᩷ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 77
    :cond_0
    iget-object v0, p0, Ll/᩷ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 82
    iget-object v0, p0, Ll/᩷ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 83
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether another page remains for this directory traversal."

    const-string v2, "boolean"

    .line 124
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "hasMore"

    .line 84
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextCursor"

    const-string v2, "Opaque cursor copied unchanged; empty string on the last page."

    const-string v3, "string"

    const-string v4, "File list pagination."

    .line 0
    invoke-static {v0, v3, v2, v1, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 88
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Normalized absolute directory used as the base for every listed path."

    .line 96
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "directoryPath"

    .line 89
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "One entry per array element, formatted as type size modifiedAt relativePath. Split only at the first three ASCII spaces; preserve the remaining raw relativePath without trimming, unquoting, or splitting on newlines. Types: f=file, d=directory, l=link, o=other. Size is bytes for known regular files, otherwise -; modifiedAt is an ISO-8601 timestamp or -. Empty array for no entries."

    .line 91
    invoke-static {v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "listing"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    .line 93
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "One local directory listing page."

    .line 88
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_list"

    .line 95
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "continue"

    .line 98
    invoke-static {}, Ll/᩷ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 97
    invoke-static {v4, v1, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v1, "Contains one directly executable mt_file_list continuation when hasMore=true; otherwise empty."

    .line 95
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Result for mt_file_list."

    .line 94
    invoke-static {v3, v0, v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 100
    :cond_0
    iget-object v0, p0, Ll/᩷ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_list"

    return-object v0
.end method
