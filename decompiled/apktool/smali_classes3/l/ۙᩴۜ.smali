.class public final Ll/ۙᩴۜ;
.super Ll/ۙۛ᩻;
.source "N6VJ"


# static fields
.field public static final ۧ:[Ljava/lang/String;


# instance fields
.field public final ֫:Ll/ۚܺۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const-string v8, "maxChars"

    const-string v9, "cursor"

    const-string v0, "path"

    const-string v1, "encoding"

    const-string v2, "pattern"

    const-string v3, "patternType"

    const-string v4, "caseSensitive"

    const-string v5, "contextBefore"

    const-string v6, "contextAfter"

    const-string v7, "limit"

    .line 19
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۙᩴۜ;->ۧ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۚܺۜ;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    iput-object p1, p0, Ll/ۙᩴۜ;->֫:Ll/ۚܺۜ;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    const-string v0, "array"

    const-string v1, "description"

    const-string v2, "type"

    .line 0
    invoke-static {v2, v0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "items"

    .line 136
    invoke-virtual {p1, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 132
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {p1, p2, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 42
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 43
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "Expected a string"

    .line 44
    invoke-static {p0, v0, p1}, Ll/ۙᩴۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ᩻()Lbin/mt/json/JSONObject;
    .locals 5

    .line 140
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Absolute or Home-relative regular file path; empty is invalid."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 141
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Recommended empty for automatic detection on the first call. Otherwise an exact editor encoding token; copy the resolved token for continuation."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "encoding"

    .line 142
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Non-empty literal or regex, at most 16384 UTF-16 units. Literal * is not a wildcard."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "pattern"

    .line 143
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "literal"

    const-string v3, "regex"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "Search syntax; recommended literal. LF, CRLF and CR delimit lines and are excluded from matching. Regex applies independently to each line, never across lines."

    .line 144
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "patternType"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Recommended false enables Unicode case-insensitive matching."

    const-string v3, "boolean"

    .line 124
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "caseSensitive"

    .line 145
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v3, "Requested preceding lines, 0..100; recommended 10. May be clipped with a warning."

    .line 110
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "contextBefore"

    .line 146
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Requested following lines, 0..100; recommended 20. May continue on later pages."

    .line 110
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "contextAfter"

    .line 147
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Maximum newly delivered matching lines in this page, 1..200; recommended 50."

    .line 110
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "limit"

    .line 148
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Total returned original-text Unicode code points, 1024..131072; recommended 32768. CRLF is never split."

    .line 110
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxChars"

    .line 149
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "cursor"

    const-string v3, "Empty starts a search; otherwise copy continuation arguments unchanged. Retries resume the same logical position but page boundaries may differ. After an application process restart, start a new search."

    const-string v4, "All fields are required; copy continuation arguments unchanged."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 28
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

    const-string v0, "mt_file_search_text"

    .line 68
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 20

    move-object/from16 v7, p1

    const-string v8, "mt_file_search_text"

    .line 72
    new-instance v0, Ll/᩶ᩴۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "Invalid mt_file_search_text argument"

    sget-object v2, Ll/ۙᩴۜ;->ۧ:[Ljava/lang/String;

    invoke-static {v7, v0, v1, v2}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v9, "path"

    .line 74
    invoke-static {v7, v9}, Ll/ۙᩴۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v10, "encoding"

    .line 75
    invoke-static {v7, v10}, Ll/ۙᩴۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v1, "pattern"

    .line 76
    invoke-static {v7, v1}, Ll/ۙᩴۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 77
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x4000

    if-gt v2, v3, :cond_8

    const-string v1, "patternType"

    .line 80
    invoke-static {v7, v1}, Ll/ۙᩴۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "literal"

    .line 81
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v12, "regex"

    if-nez v2, :cond_1

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v7, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 132
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Expected literal or regex"

    invoke-static {v4, v1, v0, v2, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 82
    throw v0

    :cond_1
    :goto_0
    const-string v1, "caseSensitive"

    .line 51
    invoke-virtual {v7, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 52
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 55
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v17

    const-wide/16 v3, 0x0

    const-wide/16 v13, 0x64

    const-string v2, "contextBefore"

    move-object/from16 v1, p1

    move-wide v5, v13

    .line 86
    invoke-static/range {v1 .. v6}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v1

    long-to-int v15, v1

    const-string v2, "contextAfter"

    move-object/from16 v1, p1

    .line 87
    invoke-static/range {v1 .. v6}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v1

    long-to-int v14, v1

    const-wide/16 v3, 0x1

    const-wide/16 v5, 0xc8

    const-string v2, "limit"

    move-object/from16 v1, p1

    .line 88
    invoke-static/range {v1 .. v6}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v1

    long-to-int v13, v1

    const-wide/16 v3, 0x400

    const-wide/32 v5, 0x20000

    const-string v2, "maxChars"

    move-object/from16 v1, p1

    .line 89
    invoke-static/range {v1 .. v6}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v1

    long-to-int v2, v1

    const-string v1, "cursor"

    .line 90
    invoke-static {v7, v1}, Ll/ۙᩴۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    .line 93
    :try_start_0
    iget-object v5, v4, Ll/ۙᩴۜ;->֫:Ll/ۚܺۜ;

    new-instance v6, Ll/᩵ܺۜ;

    .line 94
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    move-object v11, v6

    move/from16 v16, v13

    move v13, v15

    move/from16 v15, v16

    move/from16 v16, v2

    invoke-direct/range {v11 .. v19}, Ll/᩵ܺۜ;-><init>(ZIIIIZLjava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-virtual {v5, v0, v6, v3}, Ll/ۚܺۜ;->֫(Ljava/lang/String;Ll/᩵ܺۜ;Ljava/lang/String;)Ll/֡ܺۜ;

    move-result-object v0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 100
    invoke-virtual {v0}, Ll/֡ܺۜ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 101
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3, v7}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    .line 103
    invoke-virtual {v0}, Ll/֡ܺۜ;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v9, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 104
    invoke-virtual {v0}, Ll/֡ܺۜ;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v10}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v10, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0}, Ll/֡ܺۜ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v1, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "continue"

    const-string v5, "Continue from this logical position, even when this page has no new matches."

    .line 101
    invoke-static {v1, v8, v3, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v2, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 106
    :cond_2
    new-instance v1, Ll/۬ۛ᩻;

    invoke-virtual {v0}, Ll/֡ܺۜ;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0, v2}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1

    :catch_0
    move-exception v0

    .line 111
    new-instance v2, Lbin/mt/json/JSONObject;

    invoke-direct {v2, v7}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v3, "FILE_INVALID_CURSOR"

    .line 113
    iget-object v5, v0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "FILE_CHANGED_DURING_READ"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "FILE_SEARCH_CANCELED"

    .line 118
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Ll/ۗۛ᩻;->ۤ:Z

    if-eqz v1, :cond_6

    const-string v1, "Retry the same search position after cancellation has cleared."

    goto :goto_2

    :cond_4
    :goto_1
    const-string v3, ""

    .line 114
    invoke-virtual {v2, v1, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 115
    iget-object v1, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const/4 v3, 0x0

    invoke-virtual {v1, v9, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 116
    invoke-virtual {v2, v9, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_5
    const-string v1, "Restart with the current query and encoding. Treat earlier pages as a separate search."

    .line 123
    :goto_2
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    const-string v5, "retry"

    invoke-static {v2, v8, v5, v1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v3, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 97
    :cond_6
    throw v0

    :cond_7
    move-object/from16 v4, p0

    const-string v0, "Expected a boolean"

    .line 53
    invoke-static {v2, v0, v1}, Ll/ۙᩴۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_8
    move-object/from16 v4, p0

    .line 78
    invoke-virtual {v7, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 132
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Expected a non-empty pattern of at most 16384 UTF-16 units"

    invoke-static {v5, v1, v0, v2, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 78
    throw v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Search one regular text file line by line and return matching line numbers with original context. Use mt_file_search to find files in a directory. For a first call, use the recommended parameter values below and cursor=\"\". Search completed logs: detected changes require restarting the search; this is not a filesystem snapshot. Follow continue actions even on empty pages; stop calling to abandon a search. Slow files may exceed client timeouts. Decoding errors, lines above 1048576 UTF-16 units and regex resource exhaustion return partial results; inspect stopReason and keep warnings from every page."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Search File Text"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 38
    invoke-static {}, Ll/ۙᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 10

    .line 41
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "Zero-based original logical line."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "startLine"

    .line 42
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Zero-based Unicode code-point column on startLine."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "startColumn"

    .line 43
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "string"

    const-string v3, "Original text including original line endings; never inserts ellipses or line numbers. Long lines may continue in another page."

    const-string v4, "text"

    const-string v5, "One original text fragment."

    .line 0
    invoke-static {v0, v2, v3, v4, v5}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 45
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "line_too_long"

    const-string v5, "match_resource_limit"

    const-string v6, "context_clipped"

    const-string v7, "context_incomplete"

    const-string v8, "invalid_encoding"

    filled-new-array {v6, v7, v8, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "context_clipped only reduces displayed context; context_incomplete means requested following context could not be finished. Other reasons stop matching at the indicated line."

    .line 46
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "reason"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "line"

    const-string v5, "Zero-based affected logical line."

    const-string v6, "A limit or incomplete search location."

    .line 0
    invoke-static {v3, v1, v5, v4, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 49
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Normalized absolute source path."

    .line 96
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "path"

    .line 50
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Resolved lowercase encoding token, including physical BOM when present."

    .line 96
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "encoding"

    .line 51
    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "One newly delivered matching line."

    .line 110
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Newly delivered matching lines in ascending order, zero-based. Each line counts once, including zero-width matches. Context may repeat earlier matches; long-line continuation fragments do not count again. Empty files have no lines; a final newline adds no extra empty line."

    .line 52
    invoke-static {v4, v5}, Ll/ۙᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "matchedLines"

    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Original fragments in file order; adjacent fragments within a page are merged. Context may overlap across pages."

    .line 54
    invoke-static {v0, v4}, Ll/ۙᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "blocks"

    invoke-virtual {v2, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Exclusive original-byte boundary of the contiguous prefix with completed matching decisions, including BOM. May stay unchanged while pending text is delivered."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "searchedThroughByteOffset"

    .line 55
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Observed original byte length at search start; null if unavailable."

    .line 117
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "scanSize"

    .line 56
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "resource_limit"

    const-string v9, "decode_error"

    const-string v4, "eof"

    const-string v5, "match_limit"

    const-string v6, "output_limit"

    const-string v7, "scan_budget"

    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "eof means both matching and output finished. match_limit, output_limit and scan_budget have a continue action. resource_limit and decode_error terminate incompletely; inspect warnings."

    .line 57
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "stopReason"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Keep warnings from all pages; context clipping does not imply skipped matching."

    .line 59
    invoke-static {v3, v1}, Ll/ۙᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "One text search page."

    .line 49
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_search_text"

    .line 61
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "continue"

    .line 63
    invoke-static {}, Ll/ۙᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4, v1, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "retry"

    .line 64
    invoke-static {}, Ll/ۙᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-static {v5, v1, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v4, 0x2

    new-array v4, v4, [Lbin/mt/json/JSONObject;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v1, v4, v3

    const-string v1, "continue resumes pending results; retry recovers a rejected call as described by the action. Empty after eof or terminal partial results."

    .line 61
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Result for mt_file_search_text."

    .line 60
    invoke-static {v3, v0, v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_search_text"

    return-object v0
.end method
