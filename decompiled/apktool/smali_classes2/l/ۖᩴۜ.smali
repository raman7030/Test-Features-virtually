.class public final Ll/ۖᩴۜ;
.super Ll/ۙۛ᩻;
.source "P6XC"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/۬ۖۜ;


# direct methods
.method public constructor <init>(Ll/۬ۖۜ;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 56
    iput-object p1, p0, Ll/ۖᩴۜ;->ܽ:Ll/۬ۖۜ;

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

    .line 381
    invoke-virtual {p2, p3, p4, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "maxBytes"

    invoke-virtual {p2, p3, p6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "mt_file_read_bytes"

    .line 379
    invoke-static {p2, p3, p0, p1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 2

    const-string v0, "patches["

    const-string v1, "]"

    .line 0
    invoke-static {p0, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;Ljava/util/ArrayList;)V
    .locals 9

    .line 123
    :try_start_0
    invoke-static {p0, p2}, Ll/ۧۡۜ;->֫(Ll/ܶۖۜ;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    invoke-static {p0, p1, p2}, Ll/ۧۡۜ;->֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;Ljava/util/ArrayList;)V

    return-void

    :catch_0
    move-exception p1

    const-string v0, "FILE_PATCH_EXPECTED_MISMATCH"

    .line 125
    iget-object v1, p1, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 126
    iget-object v0, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v1, "byteOffset"

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 304
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 308
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    :goto_1
    move-wide v6, v0

    .line 295
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۡۜ;

    .line 296
    iget-wide v1, v0, Ll/֫ۡۜ;->֫:J

    cmp-long v3, v1, v6

    if-eqz v3, :cond_2

    goto :goto_2

    .line 297
    :cond_2
    iget-object p2, v0, Ll/֫ۡۜ;->ܽ:[B

    array-length p2, p2

    move v8, p2

    goto :goto_3

    :cond_3
    const/4 p2, 0x1

    const/4 v8, 0x1

    .line 128
    :goto_3
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p2

    iget-object v0, p0, Ll/ܶۖۜ;->ۧ:Ll/ܶ᩵ܿ;

    .line 131
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Ll/ܶۖۜ;->ᩳ:Ljava/lang/String;

    const-string v2, "retry"

    const-string v3, "Read the current bytes at the mismatched patch window before retrying."

    .line 128
    invoke-static/range {v2 .. v8}, Ll/ۖᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p2, p0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 133
    :cond_4
    throw p1
.end method

.method public static ֫(ILbin/mt/json/JSONObject;Ljava/lang/String;)[B
    .locals 3

    .line 222
    invoke-virtual {p1, p2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    .line 223
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ۖᩴۜ;->֫(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    .line 0
    invoke-static {v0, v1, v2, p2}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p1, :cond_2

    .line 224
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 228
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    .line 229
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const-string v2, "1..4096 bytes"

    if-nez v1, :cond_1

    .line 233
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v1, 0x2000

    if-gt p1, v1, :cond_0

    .line 239
    :try_start_0
    invoke-static {v0}, Ll/ܰۘܺ;->֫(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 242
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string p2, "backendReason"

    const-string v0, "invalid_hex"

    const-string v1, "operation"

    const-string v2, "parse_patches"

    .line 0
    invoke-static {v1, v2, p2, v0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string v0, "failedPatchIndex"

    .line 245
    invoke-virtual {p2, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p2, "FILE_INVALID_HEX"

    const-string v0, "warning"

    const/4 v1, 0x0

    .line 241
    invoke-static {p2, p1, v0, v1, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 235
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    int-to-long p0, p0

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    const-wide/16 v0, 0x2

    div-long/2addr p0, v0

    invoke-static {p0, p1}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-virtual {p1, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 236
    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Patch item exceeds the 4096-byte limit"

    .line 401
    invoke-static {v1, p2, p0, p1, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 234
    throw p0

    .line 231
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-virtual {p0, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Patch hex must not be empty"

    .line 401
    invoke-static {v1, p2, p1, p0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 230
    throw p0

    .line 226
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v0, "non-empty hexadecimal string"

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Invalid patch hex argument"

    .line 401
    invoke-static {v1, p2, p1, p0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 225
    throw p0
.end method

.method public static ۜ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 370
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Normalized absolute file path."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 371
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Whole-file targetVersion."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 372
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "Zero-based byte offset."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "byteOffset"

    .line 373
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxBytes"

    const-string v3, "See mt_file_read_bytes."

    const-string v4, "Arguments for mt_file_read_bytes."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩻()Lbin/mt/json/JSONObject;
    .locals 5

    const-string v0, "targetVersion"

    const-string v1, "<copy current targetVersion>"

    const-string v2, "path"

    const-string v3, "file.bin"

    .line 0
    invoke-static {v2, v3, v0, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 388
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "byteOffset"

    const/4 v4, 0x0

    .line 389
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "expectedHex"

    const-string v4, "00"

    .line 390
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "replacementHex"

    const-string v4, "FF"

    .line 391
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 388
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "patches"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 82
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

    const-string v0, "mt_file_patch_bytes"

    .line 105
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 22

    move-object/from16 v0, p1

    .line 267
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 268
    invoke-virtual/range {p1 .. p1}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "patches"

    const-string v5, "targetVersion"

    const-string v6, "path"

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 269
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 270
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 272
    :cond_1
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Invalid file byte patch argument"

    .line 401
    invoke-static {v4, v3, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 271
    throw v0

    .line 275
    :cond_2
    filled-new-array {v6, v5, v4}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :goto_1
    const/4 v7, 0x0

    const/4 v8, 0x3

    if-ge v3, v8, :cond_4

    aget-object v8, v2, v3

    .line 276
    invoke-virtual {v1, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const-string v0, "Missing parameter: "

    .line 0
    invoke-static {v0, v8}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 278
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 401
    invoke-static {v0, v8, v7, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 277
    throw v0

    .line 112
    :cond_4
    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 285
    invoke-virtual {v0, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    const-string v3, "string"

    const-string v7, "Invalid string argument"

    if-eqz v2, :cond_16

    .line 286
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v8

    if-eqz v8, :cond_16

    .line 290
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    .line 113
    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 285
    invoke-virtual {v0, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    if-eqz v8, :cond_15

    .line 286
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v9

    if-eqz v9, :cond_15

    .line 290
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "missing"

    .line 114
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    .line 157
    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 158
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v3

    if-eqz v3, :cond_13

    .line 162
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 163
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    const/4 v7, 0x1

    if-lt v3, v7, :cond_12

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    const/16 v7, 0xc8

    if-gt v3, v7, :cond_12

    .line 167
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v7

    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v15, 0x0

    .line 169
    :goto_2
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v8

    const-string v9, "byteOffset"

    if-ge v15, v8, :cond_e

    .line 170
    invoke-virtual {v0, v15}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v8

    if-eqz v8, :cond_d

    .line 171
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v10

    if-eqz v10, :cond_d

    .line 175
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 250
    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 251
    invoke-virtual {v8}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const-string v13, "expectedHex"

    const-string v14, "replacementHex"

    move-object/from16 p1, v0

    const-string v0, "."

    if-eqz v12, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 252
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_5

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    .line 253
    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    :cond_5
    invoke-virtual {v10, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    move-object/from16 v0, p1

    goto :goto_3

    .line 254
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v15}, Ll/ۖᩴۜ;->֫(I)Ljava/lang/String;

    move-result-object v2

    .line 0
    invoke-static {v1, v2, v0, v12}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 255
    invoke-virtual {v8, v12}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Invalid patch item argument"

    .line 401
    invoke-static {v4, v0, v1, v2, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 254
    throw v0

    .line 258
    :cond_7
    filled-new-array {v9, v13, v14}, [Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    :goto_4
    const/4 v12, 0x3

    if-ge v11, v12, :cond_9

    aget-object v12, v9, v11

    .line 259
    invoke-virtual {v10, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_8
    const-string v1, "Missing patch parameter: "

    .line 0
    invoke-static {v1, v12}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 260
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 261
    invoke-static {v15}, Ll/ۖᩴۜ;->֫(I)Ljava/lang/String;

    move-result-object v3

    .line 0
    invoke-static {v2, v3, v0, v12}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 261
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v4, 0x0

    .line 401
    invoke-static {v1, v0, v4, v2, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 260
    throw v0

    :cond_9
    const-wide/16 v18, 0x0

    const-wide v20, 0x1fffffffffffffL

    const-string v17, "byteOffset"

    move-object/from16 v16, v8

    .line 177
    invoke-static/range {v16 .. v21}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v10

    .line 179
    invoke-static {v15, v8, v13}, Ll/ۖᩴۜ;->֫(ILbin/mt/json/JSONObject;Ljava/lang/String;)[B

    move-result-object v0

    .line 180
    invoke-static {v15, v8, v14}, Ll/ۖᩴۜ;->֫(ILbin/mt/json/JSONObject;Ljava/lang/String;)[B

    move-result-object v12

    .line 181
    array-length v9, v0

    array-length v13, v12

    if-ne v9, v13, :cond_c

    .line 186
    array-length v8, v0

    const/16 v9, 0x1000

    if-gt v8, v9, :cond_b

    .line 191
    array-length v8, v0

    add-int/2addr v7, v8

    const/high16 v8, 0x10000

    if-gt v7, v8, :cond_a

    .line 196
    array-length v8, v0

    int-to-long v8, v8

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    invoke-static {v15}, Ll/ۖᩴۜ;->֫(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v16, v12

    const-string v12, ".byteOffset"

    .line 0
    invoke-static {v13, v14, v12}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 196
    invoke-static {v12, v10, v11, v8, v9}, Ll/᩸ۡۜ;->֫(Ljava/lang/String;JJ)J

    move-result-wide v12

    .line 198
    new-instance v14, Ll/֫ۡۜ;

    move-object v8, v14

    move v9, v15

    move-object/from16 v17, v5

    move-object v5, v14

    move-object v14, v0

    move/from16 v18, v15

    move-object/from16 v15, v16

    invoke-direct/range {v8 .. v15}, Ll/֫ۡۜ;-><init>(IJJ[B[B)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v18, 0x1

    move-object/from16 v0, p1

    move-object/from16 v5, v17

    goto/16 :goto_2

    .line 194
    :cond_a
    invoke-static {v7}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "1..65536 bytes"

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Patch byte budget exceeds 65536 bytes"

    .line 401
    invoke-static {v3, v4, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 193
    throw v0

    :cond_b
    move/from16 v18, v15

    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    invoke-static/range {v18 .. v18}, Ll/ۖᩴۜ;->֫(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, ".expectedHex"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 188
    array-length v0, v0

    invoke-static {v0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 189
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "1..4096 bytes"

    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Patch item exceeds the 4096-byte limit"

    .line 401
    invoke-static {v4, v1, v0, v2, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 187
    throw v0

    :cond_c
    move/from16 v18, v15

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    invoke-static/range {v18 .. v18}, Ll/ۖᩴۜ;->֫(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, ".replacementHex"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 183
    invoke-virtual {v8, v14}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    .line 184
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "same byte count as expectedHex"

    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "expectedHex and replacementHex must contain the same byte count"

    .line 401
    invoke-static {v4, v0, v1, v2, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 182
    throw v0

    :cond_d
    move/from16 v18, v15

    .line 172
    invoke-static/range {v18 .. v18}, Ll/ۖᩴۜ;->֫(I)Ljava/lang/String;

    move-result-object v0

    .line 173
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "object"

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Invalid patch item"

    .line 401
    invoke-static {v3, v0, v8, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 172
    throw v0

    :cond_e
    move-object/from16 v17, v5

    .line 201
    new-instance v0, Ll/ܺᩴۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v0, 0x1

    .line 202
    :goto_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_10

    add-int/lit8 v4, v0, -0x1

    .line 203
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫ۡۜ;

    .line 204
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫ۡۜ;

    .line 205
    iget-wide v7, v5, Ll/֫ۡۜ;->֫:J

    iget-wide v10, v4, Ll/֫ۡۜ;->ۧ:J

    cmp-long v12, v7, v10

    if-ltz v12, :cond_f

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_f
    const-string v0, "backendReason"

    const-string v1, "overlapping_ranges"

    const-string v2, "operation"

    const-string v3, "parse_patches"

    .line 0
    invoke-static {v2, v3, v0, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "failedPatchIndex"

    .line 210
    iget v2, v5, Ll/֫ۡۜ;->ᩳ:I

    .line 211
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "conflictingPatchIndex"

    iget v2, v4, Ll/֫ۡۜ;->ᩳ:I

    .line 212
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v5, Ll/֫ۡۜ;->֫:J

    .line 213
    invoke-virtual {v0, v9, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "endByteOffset"

    iget-wide v2, v5, Ll/֫ۡۜ;->ۧ:J

    .line 214
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "FILE_PATCH_OVERLAP"

    const-string v2, "Byte patch ranges must not overlap."

    const-string v3, "warning"

    const/4 v4, 0x0

    .line 206
    invoke-static {v1, v2, v3, v4, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 120
    :cond_10
    new-instance v0, Ll/֫᩺᩷;

    invoke-direct {v0, v3}, Ll/֫᩺᩷;-><init>(Ljava/lang/Object;)V

    move-object/from16 v5, p0

    iget-object v4, v5, Ll/ۖᩴۜ;->ܽ:Ll/۬ۖۜ;

    invoke-virtual {v4, v1, v2, v0}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;)Ll/۠ۖۜ;

    move-result-object v0

    const/4 v1, 0x0

    .line 138
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۡۜ;

    .line 139
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    iget-object v9, v0, Ll/۠ۖۜ;->ۧ:Ljava/lang/String;

    iget-object v10, v0, Ll/۠ۖۜ;->ᩳ:Ljava/lang/String;

    iget-wide v11, v2, Ll/֫ۡۜ;->֫:J

    iget-object v2, v2, Ll/֫ۡۜ;->ܽ:[B

    array-length v13, v2

    const-string v7, "inspect"

    const-string v8, "Read back the first patched window using the new targetVersion."

    invoke-static/range {v7 .. v13}, Ll/ۖᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v4, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 144
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v7, v0, Ll/۠ۖۜ;->ۧ:Ljava/lang/String;

    .line 145
    invoke-virtual {v4, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "changed"

    iget-boolean v7, v0, Ll/۠ۖۜ;->֫:Z

    .line 146
    invoke-virtual {v4, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    new-instance v6, Lbin/mt/json/JSONArray;

    iget-object v7, v0, Ll/۠ۖۜ;->ܿ:Lbin/mt/json/JSONArray;

    invoke-direct {v6, v7}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string v7, "warnings"

    .line 147
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "size"

    iget-wide v7, v0, Ll/۠ۖۜ;->ܽ:J

    .line 148
    invoke-virtual {v4, v6, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v0, v0, Ll/۠ۖۜ;->ᩳ:Ljava/lang/String;

    move-object/from16 v6, v17

    .line 149
    invoke-virtual {v4, v6, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 316
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫ۡۜ;

    .line 317
    iget-object v4, v4, Ll/֫ۡۜ;->ܽ:[B

    array-length v4, v4

    add-int/2addr v1, v4

    goto :goto_6

    :cond_11
    const-string v3, "bytesPatched"

    .line 150
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 151
    new-instance v1, Ll/۬ۛ᩻;

    invoke-static {v0, v2}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1

    :cond_12
    move-object/from16 v5, p0

    move-object/from16 p1, v0

    .line 165
    invoke-virtual/range {p1 .. p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-static {v0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "1..200"

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "patches must contain 1 through 200 items"

    .line 401
    invoke-static {v3, v4, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 164
    throw v0

    :cond_13
    move-object/from16 v5, p0

    .line 160
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "array"

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Invalid patches argument"

    .line 401
    invoke-static {v3, v4, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 159
    throw v0

    :cond_14
    move-object v6, v5

    move-object/from16 v5, p0

    .line 116
    invoke-virtual {v0, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 117
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "<16 lowercase hex digits>"

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/ۖᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_file_patch_bytes cannot create a missing file"

    .line 401
    invoke-static {v3, v6, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 115
    throw v0

    :cond_15
    move-object v6, v5

    move-object/from16 v5, p0

    .line 288
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 401
    invoke-static {v7, v6, v8, v0, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 287
    throw v0

    :cond_16
    move-object/from16 v5, p0

    .line 288
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 401
    invoke-static {v7, v6, v2, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 287
    throw v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Apply 1..200 equal-length raw byte patches to one existing regular local file. Copy targetVersion from mt_file_stat or mt_file_read_bytes; missing is not accepted. Each item contains a 0-based byteOffset plus non-empty, even-length expectedHex and replacementHex of the same size. Inputs are case-insensitive hex without separators. Each item is limited to 4096 bytes and the call to 65536 patched bytes. Ranges must not overlap; adjacent ranges are valid. All expected windows are checked before patched bytes are written. Large files are supported."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Patch File Bytes"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 87
    iget-object v0, p0, Ll/ۖᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 324
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Zero-based byte offset in 0..9007199254740991."

    const-string v2, "integer"

    .line 110
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "byteOffset"

    .line 325
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Current non-empty bytes as even-length hexadecimal without separators."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "expectedHex"

    .line 327
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "replacementHex"

    const-string v3, "Equal-length replacement bytes as hexadecimal without separators."

    const-string v4, "One equal-length raw byte patch."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "description"

    const-string v3, "Runtime accepts 1..200 non-overlapping items."

    const-string v4, "type"

    const-string v5, "array"

    invoke-static {v4, v5, v2, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "items"

    .line 333
    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 334
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Absolute path or path relative to the Home captured at call start."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    .line 335
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Current 16-digit lowercase hex version token; missing is not accepted."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "targetVersion"

    .line 337
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "patches"

    .line 339
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Arguments for mt_file_patch_bytes."

    .line 334
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 88
    iput-object v0, p0, Ll/ۖᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 90
    :cond_0
    iget-object v0, p0, Ll/ۖᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 95
    iget-object v0, p0, Ll/ۖᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 343
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Normalized absolute target path."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 344
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Whether target bytes changed."

    const-string v3, "boolean"

    .line 124
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "changed"

    .line 345
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "description"

    const-string v3, "Non-fatal metadata, cleanup, or notification degradation."

    const-string v4, "type"

    const-string v5, "array"

    .line 0
    invoke-static {v4, v5, v2, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "One warning message."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "items"

    .line 357
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "warnings"

    .line 346
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v3, "Final raw byte size."

    .line 110
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "size"

    .line 347
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Final whole-file version token of 16 lowercase hex digits."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "targetVersion"

    .line 348
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "bytesPatched"

    const-string v3, "Total requested patch bytes, including no-op replacements."

    const-string v4, "Successful local byte patch result."

    .line 0
    invoke-static {v0, v2, v3, v1, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_patch_bytes"

    .line 98
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "inspect"

    .line 364
    invoke-static {}, Ll/ۖᩴۜ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_file_read_bytes"

    .line 363
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "retry"

    .line 366
    invoke-static {}, Ll/ۖᩴۜ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 365
    invoke-static {v5, v4, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Lbin/mt/json/JSONObject;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v3, v4, v2

    const-string v2, "Success and expected-byte mismatch return a read_bytes action."

    .line 361
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_file_patch_bytes."

    .line 96
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۖᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 100
    :cond_0
    iget-object v0, p0, Ll/ۖᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_patch_bytes"

    return-object v0
.end method
