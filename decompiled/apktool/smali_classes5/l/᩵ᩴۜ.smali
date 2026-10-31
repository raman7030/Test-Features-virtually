.class public final Ll/᩵ᩴۜ;
.super Ll/ۙۛ᩻;
.source "N6Y2"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ᩳۖۜ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 50
    iput-object p1, p0, Ll/᩵ᩴۜ;->ܽ:Ll/ᩳۖۜ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "path"

    const-string v1, "targetVersion"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "byteOffset"

    .line 240
    invoke-virtual {p2, p3, p4, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "maxBytes"

    .line 241
    invoke-virtual {p2, p3, p6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "mt_file_read_bytes"

    .line 236
    invoke-static {p2, p3, p0, p1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

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

    .line 276
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "string"

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 277
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 278
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, ""

    goto :goto_0

    :cond_1
    const-string v2, "file.bin"

    .line 277
    :goto_0
    invoke-virtual {v1, p1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid string argument"

    .line 275
    invoke-static {v2, p1, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 44
    throw p0
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 8

    .line 205
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v2, "Discard earlier pages and restart at byteOffset 0 using the current file version."

    const-wide/16 v5, 0x0

    const-string v1, "retry"

    move-object v3, p1

    move-object v4, p3

    move v7, p0

    invoke-static/range {v1 .. v7}, Ll/᩵ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v0, "path"

    const-string v1, "policyRevision"

    .line 0
    invoke-static {v0, p1, v1, p4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p4, "operation"

    const-string v0, "read"

    .line 214
    invoke-virtual {p1, p4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p4, "backendReason"

    const-string v0, "target_version_mismatch"

    .line 215
    invoke-virtual {p1, p4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p4, "expectedTargetVersion"

    .line 216
    invoke-virtual {p1, p4, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "actualTargetVersion"

    .line 217
    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "FILE_TARGET_VERSION_MISMATCH"

    const-string p3, "The file targetVersion no longer matches the current content."

    const-string p4, "warning"

    .line 208
    invoke-static {p2, p3, p4, p0, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(JJLjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "path"

    const-string v1, "policyRevision"

    .line 0
    invoke-static {v0, p4, v1, p5}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p4

    const-string p5, "operation"

    const-string v0, "read"

    .line 228
    invoke-virtual {p4, p5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p4

    const-string p5, "backendReason"

    const-string v0, "offset_after_end"

    .line 229
    invoke-virtual {p4, p5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p4

    const-string p5, "byteOffset"

    .line 230
    invoke-virtual {p4, p5, p0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "totalBytes"

    .line 231
    invoke-virtual {p0, p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_OFFSET_OUT_OF_RANGE"

    const-string p2, "Byte offset is beyond the end of the file."

    const-string p3, "warning"

    const/4 p4, 0x0

    .line 222
    invoke-static {p1, p2, p3, p4, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/۫᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 165
    sget-object v0, Ll/ᩴᩴۜ;->֫:[I

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Ll/᩵ᩴۜ;->ܽ:Ll/ᩳۖۜ;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "The requested node type cannot be read as file bytes."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 173
    throw p1

    :cond_1
    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "Symbolic links cannot be read by the generic byte tool."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 171
    throw p1

    :cond_2
    const-string v0, "FILE_NOT_REGULAR"

    const-string v1, "Directories cannot be read as raw file bytes."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 169
    throw p1

    .line 168
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public static ᩻()Lbin/mt/json/JSONObject;
    .locals 5

    .line 245
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Absolute path or path relative to the Home captured at call start."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 246
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Pass \"\" (empty string) on the first read; later pass the previous result unchanged."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 248
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "Zero-based byte offset in 0..9007199254740991; pass 0 by default."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "byteOffset"

    .line 250
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxBytes"

    const-string v3, "Page size from 1 through 65536; pass 256 by default."

    const-string v4, "Arguments for mt_file_read_bytes."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 70
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

    const-string v0, "mt_file_read_bytes"

    .line 108
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 266
    new-instance v2, Ll/ۘᩴۜ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-string v3, "maxBytes"

    const-string v8, "path"

    const-string v9, "targetVersion"

    const-string v10, "byteOffset"

    filled-new-array {v8, v9, v10, v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "Invalid file byte read argument"

    invoke-static {v0, v2, v4, v3}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    .line 117
    invoke-static {v0, v8}, Ll/᩵ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 118
    invoke-static {v0, v9}, Ll/᩵ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-wide/16 v4, 0x0

    const-wide v6, 0x1fffffffffffffL

    const-string v3, "byteOffset"

    move-object/from16 v2, p1

    .line 119
    invoke-static/range {v2 .. v7}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v13

    const-wide/16 v4, 0x1

    const-wide/32 v6, 0x10000

    const-string v3, "maxBytes"

    .line 121
    invoke-static/range {v2 .. v7}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v2

    long-to-int v0, v2

    .line 123
    iget-object v2, v1, Ll/᩵ᩴۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v2}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v3

    .line 124
    invoke-static {v11, v3, v8}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 125
    invoke-virtual {v2, v4}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v6

    .line 126
    :try_start_0
    invoke-virtual {v2, v4}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v7

    .line 127
    invoke-direct {v1, v7, v4}, Ll/᩵ᩴۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    :try_start_1
    invoke-virtual {v7}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v11

    invoke-static {v11, v13, v14, v0}, Ll/ᩳۡۜ;->֫(Ll/ܶ᩵ܿ;JI)Ll/ܽۡۜ;

    move-result-object v11
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    :try_start_2
    iget-wide v9, v11, Ll/ܽۡۜ;->ܽ:J

    move-wide/from16 v24, v9

    iget-wide v9, v11, Ll/ܽۡۜ;->ܿ:J

    iget-object v15, v11, Ll/ܽۡۜ;->ᩳ:Ljava/lang/String;

    .line 134
    invoke-virtual {v2, v4}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v2

    .line 181
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    move-object/from16 p1, v3

    sget-object v3, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v1, v3, :cond_8

    .line 184
    invoke-virtual {v7}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v16

    const-wide/16 v18, 0x0

    cmp-long v1, v16, v18

    if-ltz v1, :cond_0

    invoke-virtual {v7}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v16

    cmp-long v1, v16, v9

    if-nez v1, :cond_8

    .line 185
    :cond_0
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v16

    cmp-long v1, v16, v18

    if-ltz v1, :cond_1

    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v1

    cmp-long v3, v1, v9

    if-nez v3, :cond_8

    .line 138
    :cond_1
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 139
    :cond_2
    invoke-static {v0, v4, v12, v15, v5}, Ll/᩵ᩴۜ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 142
    :cond_3
    :goto_0
    iget-wide v1, v11, Ll/ܽۡۜ;->ܿ:J

    cmp-long v3, v13, v1

    if-gtz v3, :cond_7

    .line 146
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 92
    iget-wide v2, v11, Ll/ܽۡۜ;->ܽ:J

    cmp-long v5, v2, v9

    if-gez v5, :cond_4

    const/4 v5, 0x1

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_5

    const-string v5, "continue"

    const-string v16, "Continue reading the next byte page from the same file version."

    .line 148
    iget-object v7, v11, Ll/ܽۡۜ;->ᩳ:Ljava/lang/String;

    move-object v12, v15

    move-object v15, v5

    move-object/from16 v17, v4

    move-object/from16 v18, v7

    move-wide/from16 v19, v2

    move/from16 v21, v0

    invoke-static/range {v15 .. v21}, Ll/᩵ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_2

    :cond_5
    move-object v12, v15

    .line 152
    :goto_2
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 153
    invoke-virtual {v0, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "hex"

    iget-object v3, v11, Ll/ܽۡۜ;->ۧ:[B

    .line 154
    invoke-static {v3}, Ll/ܰۘܺ;->֫([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v2, v11, Ll/ܽۡۜ;->֫:J

    move-object/from16 v4, v23

    .line 155
    invoke-virtual {v0, v4, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "nextByteOffset"

    move-wide/from16 v3, v24

    .line 156
    invoke-virtual {v0, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "totalBytes"

    .line 157
    invoke-virtual {v0, v2, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "hasMore"

    cmp-long v5, v3, v9

    if-gez v5, :cond_6

    const/4 v3, 0x1

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    .line 158
    :goto_3
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v2, v22

    .line 159
    invoke-virtual {v0, v2, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 160
    new-instance v2, Ll/۬ۛ᩻;

    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v2, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 161
    invoke-virtual {v6}, Ll/ۤۖۜ;->close()V

    return-object v2

    :cond_7
    move-object/from16 v0, p1

    .line 143
    :try_start_3
    iget-object v0, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    move-wide v15, v1

    move-object/from16 v17, v4

    move-object/from16 v18, v0

    invoke-static/range {v13 .. v18}, Ll/᩵ᩴۜ;->֫(JJLjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_8
    const-string v0, "FILE_CHANGED_DURING_READ"

    const-string v1, "The file changed while its bytes were being read."

    const-string v2, "warning"

    const-string v3, "path"

    const-string v7, "policyRevision"

    .line 0
    invoke-static {v3, v4, v7, v5}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "operation"

    const-string v5, "read"

    .line 198
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "backendReason"

    const-string v5, "metadata_changed"

    .line 199
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v4, 0x0

    .line 192
    invoke-static {v0, v1, v2, v4, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 136
    throw v0

    :catch_0
    move-exception v0

    .line 132
    invoke-static {v4, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 125
    :try_start_4
    invoke-virtual {v6}, Ll/ۤۖۜ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read one raw byte page from a regular local file. First call: targetVersion=\"\", byteOffset=0, maxBytes=256; maximum 65536 bytes per page. Returns uppercase hex and a whole-file targetVersion. Copy that version unchanged into later pages to avoid combining different file versions. Paths may be absolute or relative to Home. Large files are supported."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read File Bytes"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/᩵ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 76
    invoke-static {}, Ll/᩵ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 78
    :cond_0
    iget-object v0, p0, Ll/᩵ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 83
    iget-object v0, p0, Ll/᩵ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 85
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute file path fixed for this call."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "path"

    .line 86
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Returned raw bytes as uppercase hexadecimal without separators."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "hex"

    .line 88
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Zero-based byte offset of the first returned byte."

    const-string v3, "integer"

    .line 110
    invoke-static {v3, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "byteOffset"

    .line 90
    invoke-virtual {v0, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Byte offset immediately after this page."

    .line 110
    invoke-static {v3, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "nextByteOffset"

    .line 92
    invoke-virtual {v0, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Total file size observed by the complete streaming scan."

    .line 110
    invoke-static {v3, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "totalBytes"

    .line 94
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether bytes remain after nextByteOffset."

    const-string v3, "boolean"

    .line 124
    invoke-static {v3, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "hasMore"

    .line 96
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "targetVersion"

    const-string v3, "Whole-file content version as 16 lowercase hex digits."

    const-string v4, "One raw byte page bound to a whole-file version."

    .line 0
    invoke-static {v0, v2, v3, v1, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_read_bytes"

    .line 101
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "continue"

    .line 260
    invoke-static {}, Ll/᩵ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 259
    invoke-static {v4, v1, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "retry"

    .line 262
    invoke-static {}, Ll/᩵ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 261
    invoke-static {v5, v1, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v4, 0x2

    new-array v4, v4, [Lbin/mt/json/JSONObject;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v1, v4, v3

    const-string v1, "Contains one directly executable continuation when hasMore=true; a version mismatch error contains one restart action."

    .line 257
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Result for mt_file_read_bytes."

    .line 100
    invoke-static {v3, v0, v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 103
    :cond_0
    iget-object v0, p0, Ll/᩵ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_read_bytes"

    return-object v0
.end method
