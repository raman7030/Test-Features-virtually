.class public final Ll/۟ᩴۜ;
.super Ll/ۙۛ᩻;
.source "S6XE"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/۬ۖۜ;


# direct methods
.method public constructor <init>(Ll/۬ۖۜ;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 48
    iput-object p1, p0, Ll/۟ᩴۜ;->ܽ:Ll/۬ۖۜ;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
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
    const-string v0, "Invalid string argument"

    .line 44
    invoke-static {p0, v0, p1}, Ll/۟ᩴۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 5

    .line 213
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "targetVersion"

    const-string v2, "missing"

    const-string v3, "path"

    const-string v4, "file.bin"

    .line 0
    invoke-static {v3, v4, v1, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "hex"

    const-string v3, "00FF"

    .line 216
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 213
    invoke-static {p1, p2, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 73
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

    const-string v0, "mt_file_write_bytes"

    .line 98
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 12

    .line 202
    new-instance v0, Ll/ܰᩴۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "path"

    const-string v2, "targetVersion"

    const-string v3, "hex"

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "Invalid file byte write argument"

    invoke-static {p1, v0, v5, v4}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    .line 105
    invoke-static {p1, v1}, Ll/۟ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 106
    invoke-static {p1, v2}, Ll/۟ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 107
    invoke-static {p1, v3}, Ll/۟ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 108
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/high16 v5, 0x200000

    const-string v6, "backendReason"

    const-string v7, "parse_hex"

    const-string v8, "operation"

    const/4 v9, 0x0

    const-string v10, "warning"

    const-string v11, "FILE_INVALID_HEX"

    if-gt v3, v5, :cond_0

    .line 113
    :try_start_0
    invoke-static {p1}, Ll/ܰۘܺ;->֫(Ljava/lang/String;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    new-instance v3, Ll/ۗܽܽ;

    const/4 v5, 0x3

    invoke-direct {v3, v5, p1}, Ll/ۗܽܽ;-><init>(ILjava/lang/Object;)V

    iget-object p1, p0, Ll/۟ᩴۜ;->ܽ:Ll/۬ۖۜ;

    invoke-virtual {p1, v0, v4, v3}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;)Ll/۠ۖۜ;

    move-result-object p1

    iget-object v0, p1, Ll/۠ۖۜ;->ᩳ:Ljava/lang/String;

    iget-object v3, p1, Ll/۠ۖۜ;->ۧ:Ljava/lang/String;

    .line 119
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 0
    invoke-static {v1, v3, v2, v0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "byteOffset"

    const-wide/16 v7, 0x0

    .line 198
    invoke-virtual {v5, v6, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "maxBytes"

    const/16 v7, 0x100

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_file_read_bytes"

    const-string v7, "inspect"

    const-string v8, "Read back the beginning of the written file using its new targetVersion."

    .line 196
    invoke-static {v5, v6, v7, v8}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 119
    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 123
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 124
    invoke-virtual {v5, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "changed"

    iget-boolean v5, p1, Ll/۠ۖۜ;->֫:Z

    .line 125
    invoke-virtual {v1, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    new-instance v3, Lbin/mt/json/JSONArray;

    iget-object v5, p1, Ll/۠ۖۜ;->ܿ:Lbin/mt/json/JSONArray;

    invoke-direct {v3, v5}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string v5, "warnings"

    .line 126
    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "size"

    iget-wide v5, p1, Ll/۠ۖۜ;->ܽ:J

    .line 127
    invoke-virtual {v1, v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 128
    invoke-virtual {p1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 129
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {p1, v4}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    :catch_0
    move-exception p1

    .line 115
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "invalid_hex"

    .line 0
    invoke-static {v8, v7, v6, v0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 133
    invoke-static {v11, p1, v10, v9, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 115
    throw p1

    .line 109
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    int-to-long v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    const-string p1, "hex_too_large"

    .line 0
    invoke-static {v8, v7, v6, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "limit"

    const/high16 v3, 0x100000

    .line 145
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "actual"

    .line 146
    invoke-virtual {p1, v2, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "Hex input exceeds the 1048576-byte write limit."

    .line 140
    invoke-static {v11, v0, v10, v9, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 109
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Create or fully replace one regular local file from raw hexadecimal bytes. Use targetVersion=\"missing\" only to create a missing file; otherwise copy the current targetVersion from mt_file_stat or mt_file_read_bytes. hex is case-insensitive, contains no separators, may be empty, and is limited to 1048576 raw bytes. Paths may be absolute or relative to the Home captured at call start. Inspect the reported state after a failed write."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Write File Bytes"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 78
    iget-object v0, p0, Ll/۟ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 150
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Absolute path or path relative to the Home captured at call start."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 151
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Use missing for creation, otherwise the current 16-digit lowercase hex version token."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "targetVersion"

    .line 153
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "hex"

    const-string v3, "Zero through 1048576 raw bytes as even-length hexadecimal without separators."

    const-string v4, "Arguments for mt_file_write_bytes."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 79
    iput-object v0, p0, Ll/۟ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 81
    :cond_0
    iget-object v0, p0, Ll/۟ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 8

    .line 86
    iget-object v0, p0, Ll/۟ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 160
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute target path fixed for this call."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "path"

    .line 161
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether target content changed."

    const-string v4, "boolean"

    .line 124
    invoke-static {v4, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "changed"

    .line 163
    invoke-virtual {v0, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "description"

    const-string v4, "Non-fatal metadata, cleanup, or notification degradation."

    const-string v5, "type"

    const-string v6, "array"

    .line 0
    invoke-static {v5, v6, v1, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "One warning message."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "items"

    .line 175
    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "warnings"

    .line 165
    invoke-virtual {v0, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Final raw byte size."

    const-string v4, "integer"

    .line 110
    invoke-static {v4, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "size"

    .line 166
    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Final whole-file version token of 16 lowercase hex digits."

    const-string v5, "targetVersion"

    const-string v6, "Successful complete binary file write."

    .line 0
    invoke-static {v0, v2, v1, v5, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_write_bytes"

    .line 91
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 186
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Normalized absolute file path."

    .line 96
    invoke-static {v2, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 187
    invoke-virtual {v6, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Whole-file targetVersion returned by this write."

    .line 96
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 188
    invoke-virtual {v3, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Zero-based byte offset."

    .line 110
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "byteOffset"

    .line 190
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxBytes"

    const-string v5, "See mt_file_read_bytes."

    const-string v6, "Arguments for mt_file_read_bytes."

    .line 0
    invoke-static {v2, v4, v5, v3, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_file_read_bytes"

    const-string v4, "inspect"

    .line 181
    invoke-static {v2, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-string v2, "Success returns one read_bytes verification action."

    .line 179
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_file_write_bytes."

    .line 89
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/۟ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 93
    :cond_0
    iget-object v0, p0, Ll/۟ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_write_bytes"

    return-object v0
.end method
