.class public final Ll/۫ᩴۜ;
.super Ll/ۙۛ᩻;
.source "N6XW"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩻ܺۜ;


# direct methods
.method public constructor <init>(Ll/᩻ܺۜ;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 44
    iput-object p1, p0, Ll/۫ᩴۜ;->ܽ:Ll/᩻ܺۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 64
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

    const-string v0, "mt_file_stat"

    .line 100
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 7

    const-string v0, "path"

    .line 124
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 31
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 32
    invoke-virtual {p1}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "/absolute/or/home-relative/path"

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 33
    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    .line 125
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 126
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v0, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Invalid mt_file_stat argument"

    .line 125
    invoke-static {v2, v4, p1, v1, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 34
    throw p1

    .line 127
    :cond_1
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "Invalid path"

    if-eqz v1, :cond_6

    .line 106
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 107
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 110
    iget-object v1, p0, Ll/۫ᩴۜ;->ܽ:Ll/᩻ܺۜ;

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/᩻ܺۜ;->֫(Ljava/lang/String;)Ll/ܳܺۜ;

    move-result-object p1

    .line 111
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p1, Ll/ܳܺۜ;->ܽ:Ljava/lang/String;

    .line 112
    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    iget-object v2, p1, Ll/ܳܺۜ;->ܳ:Ljava/lang/String;

    .line 113
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 114
    iget-object v1, p1, Ll/ܳܺۜ;->ᩳ:Ljava/lang/Long;

    if-nez v1, :cond_2

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    :goto_1
    const-string v2, "size"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 115
    iget-object v1, p1, Ll/ܳܺۜ;->ۧ:Ljava/lang/String;

    if-nez v1, :cond_3

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    :goto_2
    const-string v2, "modifiedAt"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "access"

    iget-object v2, p1, Ll/ܳܺۜ;->֫:Ljava/lang/String;

    .line 116
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 117
    iget-object p1, p1, Ll/ܳܺۜ;->ܿ:Ljava/lang/String;

    if-nez p1, :cond_4

    .line 118
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_3

    :cond_4
    invoke-static {p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_3
    const-string v1, "targetVersion"

    .line 117
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 119
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p1, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    .line 134
    :cond_5
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 135
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v0, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 134
    invoke-static {v2, v0, p1, v1, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 108
    throw p1

    .line 134
    :cond_6
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 135
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v3, 0x0

    .line 134
    invoke-static {v2, v0, v3, p1, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 129
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Inspect an allowed local path: absolute path, type, byte size, modified time, and current access. Ordinary files also return targetVersion for later writes. Links and other special nodes are reported but are not followed."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Stat Local File"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 69
    iget-object v0, p0, Ll/۫ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 139
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Non-empty absolute or Home-relative local path. URI forms are not accepted."

    const-string v2, "string"

    const-string v3, "path"

    const-string v4, "Arguments for mt_file_stat."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 70
    iput-object v0, p0, Ll/۫ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 72
    :cond_0
    iget-object v0, p0, Ll/۫ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 4

    .line 77
    iget-object v0, p0, Ll/۫ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 78
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute identity of the requested path."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "path"

    .line 79
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "file, directory, link, or other."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "type"

    .line 81
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Ordinary file length in bytes, or null when not applicable or unknown."

    const-string v3, "integer"

    .line 117
    invoke-static {v3, v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "size"

    .line 83
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ISO 8601 local timestamp, or null when the backend cannot provide one."

    .line 103
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "modifiedAt"

    .line 85
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Current read_only or read_write MCP access for this path."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "access"

    .line 87
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whole-file version token of 16 lowercase hex digits, or null for non-files."

    .line 103
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 89
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Local file metadata."

    .line 78
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_stat"

    .line 92
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_file_stat has no automatic follow-up action."

    invoke-static {v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_file_stat."

    .line 91
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/۫ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 95
    :cond_0
    iget-object v0, p0, Ll/۫ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_stat"

    return-object v0
.end method
