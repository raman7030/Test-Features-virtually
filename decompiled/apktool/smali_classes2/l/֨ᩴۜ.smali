.class public final Ll/֨ᩴۜ;
.super Ll/ۙۛ᩻;
.source "T6Y7"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ᩳۖۜ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 53
    iput-object p1, p0, Ll/֨ᩴۜ;->ܽ:Ll/ᩳۖۜ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "path"

    const-string v1, "encoding"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "targetVersion"

    .line 304
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "limit"

    .line 305
    invoke-virtual {p2, p3, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "maxChars"

    .line 306
    invoke-virtual {p2, p3, p6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "startLine"

    .line 307
    invoke-virtual {p2, p3, p7, p8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "startColumn"

    .line 308
    invoke-virtual {p2, p3, p9, p10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "mt_file_read_text"

    .line 301
    invoke-static {p2, p3, p0, p1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
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
    invoke-static {p0, v0, p1}, Ll/֨ᩴۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 5

    .line 352
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "path"

    const-string v2, "file.txt"

    const-string v3, "encoding"

    const-string v4, ""

    .line 0
    invoke-static {v1, v2, v3, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 356
    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "limit"

    const/16 v3, 0x1f4

    .line 357
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "maxChars"

    const v3, 0xc000

    .line 358
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "startLine"

    const/4 v3, 0x0

    .line 359
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "startColumn"

    .line 360
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 352
    invoke-static {p1, p2, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;JJLl/۟ܺۜ;)Ll/ۗۛ᩻;
    .locals 3

    const-string v0, "operation"

    const-string v1, "read_text"

    const-string v2, "path"

    .line 0
    invoke-static {v2, p0, v0, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "backendReason"

    const-string v1, "text_position_out_of_range"

    .line 249
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "startLine"

    .line 250
    invoke-virtual {p0, v0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "startColumn"

    .line 251
    invoke-virtual {p0, p1, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "finalLine"

    iget-wide p2, p5, Ll/۟ܺۜ;->ܽ:J

    .line 252
    invoke-virtual {p0, p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "finalColumn"

    iget-wide p2, p5, Ll/۟ܺۜ;->ۧ:J

    .line 253
    invoke-virtual {p0, p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_OFFSET_OUT_OF_RANGE"

    const-string p2, "The requested text line and column are outside the file."

    const-string p3, "warning"

    const/4 p4, 0x0

    .line 243
    invoke-static {p1, p2, p3, p4, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    const-string v0, "path"

    const-string v1, "policyRevision"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "operation"

    const-string v0, "read_text"

    .line 275
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "backendReason"

    const-string v0, "metadata_changed"

    .line 276
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_CHANGED_DURING_READ"

    const-string v0, "The file changed while its text was being read."

    const-string v1, "warning"

    const/4 v2, 0x0

    .line 269
    invoke-static {p1, v0, v1, v2, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ll/ۗۛ᩻;
    .locals 12

    .line 283
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-string v1, "retry"

    const-string v2, "Discard earlier pages and restart from the current file version."

    move-object v3, p0

    move-object v4, p3

    move-object v5, p2

    move/from16 v6, p4

    move/from16 v7, p5

    invoke-static/range {v1 .. v11}, Ll/֨ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "path"

    const-string v2, "policyRevision"

    move-object/from16 v4, p6

    .line 0
    invoke-static {v1, p0, v2, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "operation"

    const-string v3, "read_text"

    .line 292
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "backendReason"

    const-string v3, "target_version_mismatch"

    .line 293
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "expectedTargetVersion"

    move-object v3, p1

    .line 294
    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "actualTargetVersion"

    move-object v3, p2

    .line 295
    invoke-virtual {v1, v2, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "FILE_TARGET_VERSION_MISMATCH"

    const-string v3, "The file targetVersion no longer matches the current content."

    const-string v4, "warning"

    .line 286
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method private ֫(Ll/۫᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 215
    sget-object v0, Ll/ۚᩴۜ;->֫:[I

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Ll/֨ᩴۜ;->ܽ:Ll/ᩳۖۜ;

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

    const-string v1, "The requested node type cannot be read as text."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 223
    throw p1

    :cond_1
    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "Symbolic links cannot be read by the generic text tool."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 221
    throw p1

    :cond_2
    const-string v0, "FILE_NOT_REGULAR"

    const-string v1, "Directories cannot be read as text."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 219
    throw p1

    .line 218
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public static ֫(Ll/۫᩵ܿ;Ll/۫᩵ܿ;J)Z
    .locals 5

    .line 231
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 234
    :cond_0
    invoke-virtual {p0}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    invoke-virtual {p0}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v0

    cmp-long p0, v0, p2

    if-nez p0, :cond_2

    .line 235
    :cond_1
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v0

    cmp-long p0, v0, v2

    if-ltz p0, :cond_3

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide p0

    cmp-long v0, p0, p2

    if-eqz v0, :cond_3

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩻()Lbin/mt/json/JSONObject;
    .locals 5

    .line 312
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Non-empty absolute path or path relative to the Home captured at call start."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 313
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Pass \"\" (empty string) for editor-compatible automatic detection, or an exact lowercase token returned by this tool."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "encoding"

    .line 315
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Pass \"\" (empty string) on the first read; later copy the previous result unchanged."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 317
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "Maximum logical lines touched, 1..2000; pass 500 by default."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "limit"

    .line 319
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Maximum Unicode code points, 2..131072; pass 49152 by default. Minimum 2 keeps CRLF indivisible."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxChars"

    .line 321
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Zero-based logical line in 0..9007199254740991; pass 0 initially."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "startLine"

    .line 323
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "startColumn"

    const-string v3, "Zero-based Unicode code-point column in 0..9007199254740991; pass 0 initially."

    const-string v4, "Arguments for mt_file_read_text."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 73
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

    const-string v0, "mt_file_read_text"

    .line 119
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 339
    new-instance v2, Ll/֡ᩴۜ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-string v8, "startLine"

    const-string v9, "startColumn"

    const-string v3, "path"

    const-string v4, "encoding"

    const-string v5, "targetVersion"

    const-string v6, "limit"

    const-string v7, "maxChars"

    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "Unknown file text read argument"

    invoke-static {v0, v2, v4, v3}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v8, "path"

    .line 128
    invoke-static {v0, v8}, Ll/֨ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "encoding"

    .line 129
    invoke-static {v0, v10}, Ll/֨ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v15, "targetVersion"

    .line 130
    invoke-static {v0, v15}, Ll/֨ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-wide/16 v4, 0x1

    const-wide/16 v6, 0x7d0

    const-string v3, "limit"

    move-object/from16 v2, p1

    .line 131
    invoke-static/range {v2 .. v7}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v2

    long-to-int v14, v2

    const-wide/16 v4, 0x2

    const-wide/32 v6, 0x20000

    const-string v3, "maxChars"

    move-object/from16 v2, p1

    .line 132
    invoke-static/range {v2 .. v7}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v2

    long-to-int v11, v2

    const-wide/16 v16, 0x0

    const-wide v18, 0x1fffffffffffffL

    const-string v3, "startLine"

    move-object/from16 v2, p1

    move-wide/from16 v4, v16

    move-wide/from16 v6, v18

    .line 133
    invoke-static/range {v2 .. v7}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v21

    const-string v3, "startColumn"

    .line 135
    invoke-static/range {v2 .. v7}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v23

    .line 138
    iget-object v2, v1, Ll/֨ᩴۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v2}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v3

    .line 139
    invoke-static {v9, v3, v8}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 140
    invoke-virtual {v2, v4}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v6

    .line 141
    :try_start_0
    invoke-virtual {v2, v4}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v7

    .line 142
    invoke-direct {v1, v7, v4}, Ll/֨ᩴۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 145
    :try_start_1
    invoke-virtual {v7}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0
    :try_end_1
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ll/ۛܺۜ; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v9, v11

    move-object v11, v0

    move-object/from16 p1, v13

    move/from16 v25, v14

    move-wide/from16 v13, v21

    move-object v0, v15

    move-wide/from16 v15, v23

    move/from16 v17, v25

    move/from16 v18, v9

    :try_start_2
    invoke-static/range {v11 .. v18}, Ll/֫ۖۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;JJII)Ll/۟ܺۜ;

    move-result-object v11
    :try_end_2
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ll/ۛܺۜ; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-boolean v12, v11, Ll/۟ܺۜ;->ᩳ:Z

    iget-object v13, v11, Ll/۟ܺۜ;->ܺ:Ljava/lang/String;

    .line 160
    invoke-virtual {v2, v4}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v2

    .line 161
    iget-wide v14, v11, Ll/۟ܺۜ;->ۘ:J

    invoke-static {v7, v2, v14, v15}, Ll/֨ᩴۜ;->֫(Ll/۫᩵ܿ;Ll/۫᩵ܿ;J)Z

    move-result v2

    if-nez v2, :cond_4

    .line 164
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    move-object/from16 v14, p1

    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, v11, Ll/۟ܺۜ;->ܺ:Ljava/lang/String;

    iget-object v2, v11, Ll/۟ܺۜ;->֫:Ljava/lang/String;

    iget-object v3, v3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    move-object/from16 v16, v4

    move-object/from16 v17, v14

    move-object/from16 v18, v0

    move-object/from16 v19, v2

    move/from16 v20, v25

    move/from16 v21, v9

    move-object/from16 v22, v3

    invoke-static/range {v16 .. v22}, Ll/֨ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 168
    :cond_1
    :goto_0
    iget-boolean v2, v11, Ll/۟ܺۜ;->᩻:Z

    if-eqz v2, :cond_3

    .line 172
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    if-eqz v12, :cond_2

    const-string v16, "continue"

    const-string v17, "Continue reading text from the same file version."

    .line 174
    iget-object v3, v11, Ll/۟ܺۜ;->֫:Ljava/lang/String;

    iget-object v5, v11, Ll/۟ܺۜ;->ܺ:Ljava/lang/String;

    iget-wide v14, v11, Ll/۟ܺۜ;->ܳ:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object/from16 p1, v6

    :try_start_4
    iget-wide v6, v11, Ll/۟ܺۜ;->ܿ:J

    move-object/from16 v18, v4

    move-object/from16 v19, v3

    move-object/from16 v20, v5

    move/from16 v21, v25

    move/from16 v22, v9

    move-wide/from16 v23, v14

    move-wide/from16 v25, v6

    invoke-static/range {v16 .. v26}, Ll/֨ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    :cond_2
    move-object/from16 p1, v6

    .line 179
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 180
    invoke-virtual {v3, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "text"

    iget-object v5, v11, Ll/۟ܺۜ;->ۖ:Ljava/lang/String;

    .line 181
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v11, Ll/۟ܺۜ;->֫:Ljava/lang/String;

    .line 182
    invoke-virtual {v3, v10, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 183
    invoke-virtual {v3, v0, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "startLine"

    iget-wide v4, v11, Ll/۟ܺۜ;->ۡ:J

    .line 184
    invoke-virtual {v0, v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "startColumn"

    iget-wide v4, v11, Ll/۟ܺۜ;->ۢ:J

    .line 185
    invoke-virtual {v0, v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "nextLine"

    iget-wide v4, v11, Ll/۟ܺۜ;->ܳ:J

    .line 186
    invoke-virtual {v0, v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "nextColumn"

    iget-wide v4, v11, Ll/۟ܺۜ;->ܿ:J

    .line 187
    invoke-virtual {v0, v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "returnedLineCount"

    iget v4, v11, Ll/۟ܺۜ;->᩷:I

    .line 188
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "returnedCodePoints"

    iget v4, v11, Ll/۟ܺۜ;->ۜ:I

    .line 189
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "hasMore"

    .line 190
    invoke-virtual {v0, v3, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 191
    new-instance v3, Ll/۬ۛ᩻;

    invoke-static {v0, v2}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v3, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 192
    invoke-virtual/range {p1 .. p1}, Ll/ۤۖۜ;->close()V

    return-object v3

    :cond_3
    move-object/from16 p1, v6

    move-object/from16 v20, v4

    move-object/from16 v25, v11

    .line 169
    :try_start_5
    invoke-static/range {v20 .. v25}, Ll/֨ᩴۜ;->֫(Ljava/lang/String;JJLl/۟ܺۜ;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_4
    move-object/from16 p1, v6

    .line 162
    invoke-static {v4, v5}, Ll/֨ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_0
    move-exception v0

    :goto_2
    move-object/from16 v14, p1

    move-object/from16 p1, v6

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    move-object/from16 p1, v6

    .line 158
    invoke-static {v4, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :catch_3
    move-exception v0

    :goto_3
    move-object/from16 p1, v6

    move v9, v11

    move/from16 v25, v14

    move-object v14, v13

    goto :goto_4

    :catch_4
    move-exception v0

    goto :goto_3

    .line 148
    :goto_4
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v6, :cond_6

    .line 203
    :try_start_6
    invoke-virtual {v7}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v6

    const-wide/16 v10, 0x0

    const/4 v8, 0x1

    invoke-static {v6, v10, v11, v8}, Ll/ᩳۡۜ;->֫(Ll/ܶ᩵ܿ;JI)Ll/ܽۡۜ;

    move-result-object v6
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 207
    :try_start_7
    invoke-virtual {v2, v4}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v2

    .line 208
    iget-wide v10, v6, Ll/ܽۡۜ;->ܿ:J

    invoke-static {v7, v2, v10, v11}, Ll/֨ᩴۜ;->֫(Ll/۫᩵ܿ;Ll/۫᩵ܿ;J)Z

    move-result v2

    if-nez v2, :cond_5

    .line 150
    iget-object v2, v6, Ll/ܽۡۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 152
    iget-object v0, v6, Ll/ܽۡۜ;->ᩳ:Ljava/lang/String;

    const-string v19, ""

    iget-object v2, v3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    move-object/from16 v16, v4

    move-object/from16 v17, v14

    move-object/from16 v18, v0

    move/from16 v20, v25

    move/from16 v21, v9

    move-object/from16 v22, v2

    invoke-static/range {v16 .. v22}, Ll/֨ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 209
    :cond_5
    invoke-static {v4, v5}, Ll/֨ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_5
    move-exception v0

    .line 205
    invoke-static {v4, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_6
    const-string v2, "FILE_TEXT_DECODE_FAILED"

    const-string v3, "The file is not valid in the selected text encoding."

    const-string v6, "warning"

    const-string v7, "path"

    const-string v8, "policyRevision"

    .line 0
    invoke-static {v7, v4, v8, v5}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "operation"

    const-string v7, "read_text"

    .line 264
    invoke-virtual {v4, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "backendReason"

    .line 265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const/4 v4, 0x0

    .line 258
    invoke-static {v2, v3, v6, v4, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 156
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_1
    move-exception v0

    move-object/from16 p1, v6

    :goto_5
    move-object v2, v0

    .line 140
    :try_start_8
    invoke-virtual/range {p1 .. p1}, Ll/ۤۖۜ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read one strict text page from a regular local file while preserving LF, CRLF, and CR exactly. On the first call pass encoding=\"\", targetVersion=\"\", startLine=0, startColumn=0, limit=500, and maxChars=49152. Positions and maxChars count Unicode code points. maxChars must be 2..131072 so a CRLF pair is never split; limit is 1..2000 logical lines touched by the page. An empty encoding selects automatic detection. A non-empty encoding reloads with that exact lowercase token and does not transcode. Copy the returned encoding and targetVersion unchanged into continuation calls."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read File Text"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/֨ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 79
    invoke-static {}, Ll/֨ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/֨ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 81
    :cond_0
    iget-object v0, p0, Ll/֨ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 86
    iget-object v0, p0, Ll/֨ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 88
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute file path fixed for this call."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "path"

    .line 89
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Strictly decoded text with original LF, CRLF, and CR preserved."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "text"

    .line 91
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Actual lowercase editor encoding token; physical BOM is included in the token."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "encoding"

    .line 93
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whole-file raw-byte version as 16 lowercase hex digits."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 95
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Zero-based logical line requested for this page."

    const-string v2, "integer"

    .line 110
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "startLine"

    .line 97
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Zero-based Unicode code-point column requested for this page."

    .line 110
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "startColumn"

    .line 99
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Logical line at which a continuation should start."

    .line 110
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "nextLine"

    .line 101
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Unicode code-point column at which a continuation should start."

    .line 110
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "nextColumn"

    .line 103
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Number of distinct logical lines touched by returned text."

    .line 110
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "returnedLineCount"

    .line 105
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Number of Unicode code points in text, including each CR and LF."

    .line 110
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "returnedCodePoints"

    .line 107
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether decoded text remains at nextLine and nextColumn."

    const-string v2, "boolean"

    const-string v3, "hasMore"

    const-string v4, "One original-newline text page bound to a whole-file version."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_read_text"

    .line 112
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "continue"

    .line 333
    invoke-static {}, Ll/֨ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 332
    invoke-static {v4, v1, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "retry"

    .line 335
    invoke-static {}, Ll/֨ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 334
    invoke-static {v5, v1, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v4, 0x2

    new-array v4, v4, [Lbin/mt/json/JSONObject;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v1, v4, v3

    const-string v1, "Contains one directly executable continuation when hasMore=true; a version mismatch contains one restart action."

    .line 330
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Result for mt_file_read_text."

    .line 111
    invoke-static {v3, v0, v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/֨ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 114
    :cond_0
    iget-object v0, p0, Ll/֨ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_read_text"

    return-object v0
.end method
