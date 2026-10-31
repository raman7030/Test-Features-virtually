.class public final Ll/᩻ᩴۜ;
.super Ll/ۙۛ᩻;
.source "D6X1"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/۬ۖۜ;


# direct methods
.method public constructor <init>(Ll/۬ۖۜ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 58
    iput-object p1, p0, Ll/᩻ᩴۜ;->ܽ:Ll/۬ۖۜ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    const-string v0, "path"

    const-string v1, "operation"

    const-string v2, "edit_text"

    .line 0
    invoke-static {v0, p0, v1, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "backendReason"

    .line 493
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    const-string v0, "path"

    const-string v1, "targetVersion"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "encoding"

    .line 604
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 605
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string p2, "matchText"

    const-string v0, "old text"

    const-string v1, "mode"

    const-string v2, "replace_match"

    .line 0
    invoke-static {v1, v2, p2, v0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string v0, "writeText"

    const-string v1, "new text"

    .line 608
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 605
    invoke-virtual {p1, p2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string p2, "edits"

    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "path"

    const-string v1, "encoding"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "targetVersion"

    .line 502
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "limit"

    const/16 p4, 0x1f4

    .line 503
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "maxChars"

    const p4, 0xc000

    .line 504
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "startLine"

    const/4 p4, 0x0

    .line 505
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "startColumn"

    .line 506
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "mt_file_read_text"

    .line 498
    invoke-static {p2, p3, p0, p1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 587
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 583
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "edits["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 587
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 387
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 388
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 392
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p1, "Invalid string argument"

    .line 390
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 593
    invoke-static {p1, p3, p0, v0, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 389
    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 1

    .line 472
    invoke-static {p2, p3}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "limit"

    .line 473
    invoke-virtual {p3, v0, p4, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-wide/16 p4, 0x0

    cmp-long v0, p6, p4

    if-gez v0, :cond_0

    .line 474
    sget-object p4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p6, p7}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p4

    :goto_0
    const-string p5, "actual"

    invoke-virtual {p3, p5, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p3

    if-eqz p9, :cond_2

    .line 475
    invoke-virtual {p9}, Ljava/lang/String;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_2

    const-string p4, "missing"

    .line 476
    invoke-virtual {p4, p9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    goto :goto_1

    .line 477
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p4

    const-string p5, "inspect"

    const-string p6, "Read the file in pages."

    invoke-static {p5, p6, p2, p8, p9}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-virtual {p4, p2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p2

    goto :goto_2

    :cond_2
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p2

    :goto_2
    const-string p4, "FILE_TEXT_RESULT_TOO_LARGE"

    .line 481
    invoke-virtual {p4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_3

    const-string p4, "warning"

    .line 482
    invoke-static {p0, p1, p4, p2, p3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_3
    const-string p4, "fatal"

    .line 485
    invoke-static {p0, p1, p4, p2, p3}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    const-string v0, "missing"

    .line 446
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 447
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "retry"

    const-string v2, "Re-read the current file from the beginning; continue pagination if needed."

    invoke-static {v1, v2, p2, p5, p3}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    invoke-virtual {v0, p3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p3

    .line 451
    :goto_0
    invoke-static {p2, p4}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 452
    sget-object p4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const-string p5, "limit"

    invoke-virtual {p2, p5, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p5, "actual"

    .line 453
    invoke-virtual {p2, p5, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p4, "warning"

    .line 454
    invoke-static {p0, p1, p4, p3, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;[Ljava/lang/String;Ljava/util/ArrayList;[Ll/ۙܺۜ;Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    .line 154
    iget-boolean v2, v1, Ll/ܶۖۜ;->֫:Z

    iget-object v3, v1, Ll/ܶۖۜ;->ᩳ:Ljava/lang/String;

    iget-object v4, v1, Ll/ܶۖۜ;->ۧ:Ll/ܶ᩵ܿ;

    const-string v5, "warning"

    const/high16 v6, 0xa00000

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    .line 155
    invoke-static {v1, v6}, Ll/᩻ᩴۜ;->֫(Ll/ܶۖۜ;I)[B

    move-result-object v2

    .line 158
    :try_start_0
    invoke-static {v0, v2}, Ll/۬ܺۜ;->֫(Ljava/lang/String;[B)Ll/᩶ܺۜ;

    move-result-object v0
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/᩹ܺۜ; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    iget-object v2, v0, Ll/᩶ܺۜ;->ۧ:Ljava/lang/String;

    .line 171
    iget-object v0, v0, Ll/᩶ܺۜ;->֫:Ljava/lang/String;

    aput-object v0, p1, v7

    goto :goto_0

    .line 167
    :catch_0
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v1, Ll/ܶۖۜ;->ᩳ:Ljava/lang/String;

    const-string v2, "bom_mismatch"

    const-string v3, ""

    const-string v4, "FILE_TEXT_ENCODING_MISMATCH"

    const-string v5, "The encoding token BOM does not match the current file. Re-read the file and copy its returned encoding."

    move-object/from16 p0, v4

    move-object/from16 p1, v5

    move-object/from16 p2, v0

    move-object/from16 p3, v1

    move-object/from16 p4, v2

    move-object/from16 p5, v3

    .line 165
    invoke-static/range {p0 .. p5}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 162
    :catch_1
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 461
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "path"

    const-string v4, "targetVersion"

    .line 0
    invoke-static {v2, v0, v4, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "byteOffset"

    .line 515
    invoke-virtual {v2, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxBytes"

    const/16 v4, 0x100

    .line 516
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_file_read_bytes"

    const-string v4, "inspect"

    const-string v6, "Inspect the current raw bytes before choosing another text encoding."

    .line 511
    invoke-static {v2, v3, v4, v6}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 461
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "FILE_TEXT_DECODE_FAILED"

    const-string v3, "decode_failed"

    .line 466
    invoke-static {v0, v3}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "The file is not valid in the selected text encoding."

    .line 464
    invoke-static {v2, v3, v5, v1, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 160
    throw v0

    .line 174
    :cond_0
    aput-object v0, p1, v7

    const-string v2, ""

    :goto_0
    move-object/from16 v0, p2

    .line 179
    :try_start_1
    invoke-static {v2, v0}, Ll/ܽۘۜ;->֫(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ll/ܰۖۜ; {:try_start_1 .. :try_end_1} :catch_4

    .line 185
    :try_start_2
    aget-object v2, p1, v7

    invoke-static {v6, v0, v2}, Ll/۬ܺۜ;->֫(ILjava/lang/String;Ljava/lang/String;)Ll/ۙܺۜ;

    move-result-object v0

    aput-object v0, p3, v7
    :try_end_2
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ll/ۗܺۜ; {:try_start_2 .. :try_end_2} :catch_2

    .line 198
    iget-object v0, v0, Ll/ۙܺۜ;->֫:[B

    move-object/from16 v1, p5

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    return-void

    :catch_2
    move-exception v0

    .line 195
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v10

    aget-object v16, p1, v7

    iget-object v1, v1, Ll/ܶۖۜ;->ᩳ:Ljava/lang/String;

    const-string v8, "FILE_TEXT_RESULT_TOO_LARGE"

    const-string v9, "The encoded text exceeds the 10485760-byte result limit."

    const-string v11, "encoded_result"

    const-wide/32 v12, 0xa00000

    .line 193
    iget-wide v14, v0, Ll/ۗܺۜ;->᩸:J

    move-object/from16 v17, v1

    invoke-static/range {v8 .. v17}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 190
    :catch_3
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v1, Ll/ܶۖۜ;->ᩳ:Ljava/lang/String;

    const-string v2, "unmappable_text"

    aget-object v3, p1, v7

    const-string v4, "FILE_TEXT_ENCODE_FAILED"

    const-string v5, "The edited text contains characters that cannot be represented in the selected encoding."

    move-object/from16 p0, v4

    move-object/from16 p1, v5

    move-object/from16 p2, v0

    move-object/from16 p3, v1

    move-object/from16 p4, v2

    move-object/from16 p5, v3

    .line 188
    invoke-static/range {p0 .. p5}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_4
    move-exception v0

    move-object v1, v0

    .line 181
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    aget-object v2, p1, v7

    .line 410
    sget-object v4, Ll/ܳᩴۜ;->֫:[I

    iget-object v6, v1, Ll/ܰۖۜ;->᩶:Ll/֫ۘۜ;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v4, v4, v6

    const/4 v6, 0x1

    const-string v7, "matchText"

    iget v8, v1, Ll/ܰۖۜ;->᩸:I

    iget v9, v1, Ll/ܰۖۜ;->᩹:I

    if-eq v4, v6, :cond_3

    const/4 v6, 0x2

    if-eq v4, v6, :cond_2

    const/4 v6, 0x3

    if-ne v4, v6, :cond_1

    const-string v1, "] overlaps edits["

    const-string v4, "]; matched ranges cannot overlap."

    const-string v6, "edits["

    .line 0
    invoke-static {v6, v9, v1, v4, v8}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "FILE_TEXT_MATCH_OVERLAP"

    const-string v6, "match_overlap"

    goto :goto_1

    .line 429
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 419
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v7}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, " appears multiple times. Use longer surrounding context that appears once."

    .line 0
    invoke-static {v1, v4, v6}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "FILE_TEXT_MATCH_AMBIGUOUS"

    const-string v6, "match_ambiguous"

    goto :goto_1

    .line 413
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v7}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, " was not found in the current text. Re-read and retry with current text."

    .line 0
    invoke-static {v1, v4, v6}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "FILE_TEXT_MATCH_NOT_FOUND"

    const-string v6, "match_not_found"

    .line 431
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    const-string v10, "retry"

    const-string v11, "Re-read the current file from the beginning; continue pagination if needed."

    invoke-static {v10, v11, v0, v2, v3}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v7, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 434
    invoke-static {v0, v6}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "failedEditIndex"

    .line 435
    invoke-virtual {v0, v3, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-gez v8, :cond_4

    .line 437
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_4
    invoke-static {v8}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v3

    :goto_2
    const-string v6, "conflictingEditIndex"

    .line 436
    invoke-virtual {v0, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 438
    invoke-static {v4, v1, v5, v2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 181
    throw v0
.end method

.method public static ֫(Ll/ܶۖۜ;I)[B
    .locals 14

    .line 220
    iget-wide v0, p0, Ll/ܶۖۜ;->ܽ:J

    iget-object v2, p0, Ll/ܶۖۜ;->ۧ:Ll/ܶ᩵ܿ;

    int-to-long v7, p1

    const-string v3, "-byte text edit limit."

    const-string v4, "The existing file exceeds the "

    cmp-long v5, v0, v7

    if-gtz v5, :cond_6

    const-wide/16 v5, 0x0

    const/16 v9, 0x2000

    cmp-long v10, v0, v5

    if-ltz v10, :cond_0

    long-to-int v1, v0

    goto :goto_0

    .line 226
    :cond_0
    invoke-static {p1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 227
    :goto_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    new-array v1, v9, [B

    .line 229
    invoke-virtual {p0}, Ll/ܶۖۜ;->֫()Ljava/io/InputStream;

    move-result-object v13

    :goto_1
    add-int/lit8 v5, p1, 0x1

    .line 231
    :try_start_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v9, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v13, v1, v6, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-gez v5, :cond_1

    goto :goto_2

    :cond_1
    if-nez v5, :cond_3

    .line 236
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v5, :cond_2

    .line 251
    :goto_2
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V

    .line 252
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    .line 240
    :cond_2
    :try_start_1
    invoke-virtual {v0, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_3

    .line 242
    :cond_3
    invoke-virtual {v0, v1, v6, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 244
    :goto_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v5

    if-gt v5, p1, :cond_4

    goto :goto_1

    :cond_4
    const-string v1, "FILE_TEXT_TARGET_TOO_LARGE"

    .line 245
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 247
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    const-string v6, "target_too_large"

    .line 248
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    int-to-long v9, p1

    const-string v11, ""

    iget-object v12, p0, Ll/ܶۖۜ;->ᩳ:Ljava/lang/String;

    move-object v3, v1

    .line 245
    invoke-static/range {v3 .. v12}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    if-eqz v13, :cond_5

    .line 229
    :try_start_2
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_4
    throw p0

    .line 0
    :cond_6
    invoke-static {p1, v4, v3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 223
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    iget-wide v9, p0, Ll/ܶۖۜ;->ܽ:J

    const-string v11, ""

    iget-object v12, p0, Ll/ܶۖۜ;->ᩳ:Ljava/lang/String;

    const-string v3, "FILE_TEXT_TARGET_TOO_LARGE"

    const-string v6, "target_too_large"

    .line 221
    invoke-static/range {v3 .. v12}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۜ()Lbin/mt/json/JSONObject;
    .locals 10

    .line 548
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Normalized absolute path."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    .line 549
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Exact token for verification or empty string to auto-detect."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "encoding"

    .line 550
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Exact current version bound to this read."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "targetVersion"

    .line 552
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "integer"

    const-string v7, "Logical line limit."

    .line 110
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "limit"

    .line 554
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Unicode code-point limit."

    .line 110
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "maxChars"

    .line 555
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Zero-based line."

    .line 110
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "startLine"

    .line 556
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "startColumn"

    const-string v8, "Zero-based column."

    const-string v9, "Arguments for mt_file_read_text."

    .line 0
    invoke-static {v0, v5, v8, v7, v9}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 559
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 560
    invoke-virtual {v7, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 561
    invoke-virtual {v2, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Zero-based byte offset."

    .line 110
    invoke-static {v5, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "byteOffset"

    .line 563
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "maxBytes"

    const-string v3, "Maximum raw bytes."

    const-string v4, "Arguments for mt_file_read_bytes."

    .line 0
    invoke-static {v1, v5, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_file_read_text"

    const-string v3, "inspect"

    .line 567
    invoke-static {v0, v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "retry"

    .line 569
    invoke-static {v0, v2, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "mt_file_read_bytes"

    .line 571
    invoke-static {v1, v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lbin/mt/json/JSONObject;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const-string v0, "Contains a text verification read after success, a current-file retry read after a recoverable match error, or a raw-byte inspection after decode failure."

    .line 565
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩻()Lbin/mt/json/JSONObject;
    .locals 3

    const-string v0, "<copy from mt_file_read_text>"

    const-string v1, "utf-8"

    const-string v2, "file.txt"

    .line 597
    invoke-static {v2, v0, v1}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 78
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    .line 79
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "destructiveHint"

    const/4 v2, 0x1

    .line 80
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 1

    const-string v0, "mt_file_edit_text"

    .line 116
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 29

    move-object/from16 v0, p1

    .line 345
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 346
    invoke-virtual/range {p1 .. p1}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "edits"

    const-string v5, "encoding"

    const-string v6, "targetVersion"

    const-string v7, "path"

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 347
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 348
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 349
    :cond_0
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 351
    :cond_1
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/᩻ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Unknown file text edit argument"

    .line 593
    invoke-static {v4, v3, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 350
    throw v0

    .line 354
    :cond_2
    filled-new-array {v7, v6, v5, v4}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :goto_1
    const/4 v8, 0x0

    const-string v9, "Missing parameter: "

    const/4 v10, 0x4

    if-ge v3, v10, :cond_4

    aget-object v10, v2, v3

    .line 355
    invoke-virtual {v1, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 0
    :cond_3
    invoke-static {v9, v10}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 357
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/᩻ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 593
    invoke-static {v0, v10, v8, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 356
    throw v0

    .line 125
    :cond_4
    invoke-static {}, Ll/᩻ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 382
    invoke-static {v0, v7, v1, v7}, Ll/᩻ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-static {}, Ll/᩻ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 382
    invoke-static {v0, v6, v2, v6}, Ll/᩻ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 127
    invoke-static {}, Ll/᩻ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 382
    invoke-static {v0, v5, v3, v5}, Ll/᩻ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 129
    invoke-static {}, Ll/᩻ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 397
    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    if-eqz v10, :cond_1d

    .line 398
    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v11

    if-eqz v11, :cond_1d

    .line 401
    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v8

    .line 259
    invoke-static {v1, v2, v3}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 260
    invoke-virtual {v8}, Lbin/mt/json/JSONArray;->size()I

    move-result v11

    const/4 v12, 0x1

    if-lt v11, v12, :cond_1c

    invoke-virtual {v8}, Lbin/mt/json/JSONArray;->size()I

    move-result v11

    const/16 v12, 0xc8

    if-gt v11, v12, :cond_1c

    .line 264
    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v8}, Lbin/mt/json/JSONArray;->size()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, -0x1

    move-object/from16 v16, v6

    .line 267
    :goto_2
    invoke-virtual {v8}, Lbin/mt/json/JSONArray;->size()I

    move-result v6

    move-object/from16 v17, v7

    const-string v7, "write_target"

    move-object/from16 v18, v1

    const-string v1, "replace_match"

    move-object/from16 v19, v5

    const-string v5, "insert_before_match"

    const-string v0, "insert_after_match"

    move-object/from16 v20, v3

    const-string v3, "mode"

    if-ge v14, v6, :cond_15

    .line 268
    invoke-virtual {v8, v14}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v6

    if-eqz v6, :cond_14

    .line 269
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v21

    if-eqz v21, :cond_14

    .line 273
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v6

    move-object/from16 v21, v8

    .line 364
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 365
    invoke-virtual {v6}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v22

    invoke-interface/range {v22 .. v22}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_3
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    move-object/from16 v24, v2

    const-string v2, "matchText"

    move/from16 v25, v15

    const-string v15, "writeText"

    if-eqz v23, :cond_7

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v26, v4

    move-object/from16 v4, v23

    check-cast v4, Ljava/lang/String;

    .line 366
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_5

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 367
    :cond_5
    invoke-virtual {v8, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object/from16 v2, v24

    move/from16 v15, v25

    move-object/from16 v4, v26

    goto :goto_3

    .line 368
    :cond_6
    invoke-static {v14, v4}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 369
    invoke-virtual {v6, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "Unknown edit item argument"

    .line 593
    invoke-static {v3, v0, v1, v2, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 368
    throw v0

    :cond_7
    move-object/from16 v26, v4

    .line 372
    filled-new-array {v3, v2, v15}, [Ljava/lang/String;

    move-result-object v4

    const/16 v22, 0x0

    move-object/from16 v23, v11

    move-wide/from16 v27, v12

    const/4 v11, 0x0

    :goto_4
    const/4 v12, 0x3

    if-ge v11, v12, :cond_9

    aget-object v12, v4, v11

    .line 373
    invoke-virtual {v8, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 374
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v14, v12}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 375
    invoke-static {v14, v12}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    const/4 v3, 0x0

    .line 593
    invoke-static {v0, v1, v3, v2, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 374
    throw v0

    .line 275
    :cond_9
    invoke-static {v14, v3}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v3, v10, v4}, Ll/᩻ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 277
    invoke-static {v14, v2}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 276
    invoke-static {v6, v2, v10, v8}, Ll/᩻ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 279
    invoke-static {v14, v15}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 278
    invoke-static {v6, v15, v10, v11}, Ll/᩻ᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 310
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    .line 311
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_6

    .line 313
    :cond_a
    invoke-static {v14, v2}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, ""

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 314
    invoke-static {v2}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "write_target requires empty matchText"

    .line 593
    invoke-static {v3, v0, v1, v2, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 312
    throw v0

    .line 318
    :cond_b
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    .line 319
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_6

    .line 321
    :cond_c
    invoke-static {v14, v2}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    .line 322
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "replace_match requires non-empty matchText"

    .line 593
    invoke-static {v3, v0, v1, v2, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 320
    throw v0

    .line 326
    :cond_d
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_f

    .line 327
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    goto :goto_5

    .line 340
    :cond_e
    invoke-static {v14, v3}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 341
    invoke-static {v4}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    .line 576
    filled-new-array {v7, v1, v5, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "Invalid text edit mode"

    .line 593
    invoke-static {v1, v2, v3, v0, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 340
    throw v0

    .line 328
    :cond_f
    :goto_5
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    .line 333
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    .line 281
    :goto_6
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    move v15, v14

    goto :goto_7

    :cond_10
    move/from16 v15, v25

    .line 305
    :goto_7
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v8, v1, v0}, Ljava/lang/String;->codePointCount(II)I

    move-result v0

    int-to-long v2, v0

    add-long v12, v27, v2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->codePointCount(II)I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v12, v0

    const-wide/32 v0, 0x80000

    cmp-long v2, v12, v0

    if-gtz v2, :cond_11

    .line 291
    new-instance v0, Ll/᩺ۖۜ;

    invoke-direct {v0, v4, v8, v6}, Ll/᩺ۖۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, v23

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p1

    move-object v11, v2

    move-object/from16 v7, v17

    move-object/from16 v1, v18

    move-object/from16 v5, v19

    move-object/from16 v3, v20

    move-object/from16 v8, v21

    move-object/from16 v2, v24

    move-object/from16 v4, v26

    goto/16 :goto_2

    .line 289
    :cond_11
    invoke-static {v12, v13}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "0..524288"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "All matchText and writeText values may contain at most 524288 Unicode code points in total"

    move-object/from16 v4, v26

    .line 593
    invoke-static {v2, v4, v0, v1, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 287
    throw v0

    :cond_12
    const-string v0, " requires non-empty writeText"

    .line 0
    invoke-static {v4, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 335
    invoke-static {v14, v15}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    .line 336
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 593
    invoke-static {v0, v1, v2, v3, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 334
    throw v0

    :cond_13
    const-string v0, " requires non-empty matchText"

    .line 0
    invoke-static {v4, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 330
    invoke-static {v14, v2}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v8}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    .line 331
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 593
    invoke-static {v0, v1, v2, v3, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 329
    throw v0

    :cond_14
    const-string v0, "edits["

    const-string v1, "]"

    .line 0
    invoke-static {v14, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 271
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "Invalid edits item"

    .line 593
    invoke-static {v2, v0, v6, v1, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 270
    throw v0

    :cond_15
    move-object/from16 v24, v2

    move-object v2, v11

    move/from16 v25, v15

    .line 293
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v8, 0x1

    if-le v6, v8, :cond_17

    if-gez v25, :cond_16

    goto :goto_8

    :cond_16
    move/from16 v15, v25

    .line 295
    invoke-static {v15, v3}, Ll/᩻ᩴۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 296
    invoke-static {v7}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    filled-new-array {v1, v5, v0}, [Ljava/lang/String;

    move-result-object v0

    .line 297
    invoke-static {v0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "write_target must be the only edit"

    .line 593
    invoke-static {v1, v2, v3, v0, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 294
    throw v0

    :cond_17
    :goto_8
    const-string v0, "missing"

    move-object/from16 v1, v24

    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 133
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    .line 137
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_18

    const/4 v0, 0x0

    .line 138
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۖۜ;

    iget-object v0, v0, Ll/᩺ۖۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_9

    :cond_18
    move-object/from16 v0, p1

    .line 140
    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "one write_target"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 141
    invoke-static {}, Ll/᩻ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "targetVersion=missing requires one write_target edit"

    .line 593
    invoke-static {v3, v4, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 139
    throw v0

    .line 135
    :cond_19
    invoke-static/range {v20 .. v20}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Ll/᩻ᩴۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Creating a text file requires a non-empty encoding token"

    move-object/from16 v4, v19

    .line 593
    invoke-static {v3, v4, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 134
    throw v0

    :cond_1a
    :goto_9
    move-object/from16 v4, v19

    .line 145
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    .line 146
    invoke-static/range {v20 .. v20}, Ll/ܳۘۜ;->ܽ(Ljava/lang/String;)Ll/ܿۘۜ;

    .line 149
    :cond_1b
    filled-new-array/range {v20 .. v20}, [Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ll/ۙܺۜ;

    .line 151
    new-instance v5, Ll/ܿᩴۜ;

    move-object/from16 v6, v20

    invoke-direct {v5, v6, v0, v2, v3}, Ll/ܿᩴۜ;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/ArrayList;[Ll/ۙܺۜ;)V

    move-object/from16 v2, p0

    iget-object v6, v2, Ll/᩻ᩴۜ;->ܽ:Ll/۬ۖۜ;

    move-object/from16 v7, v18

    invoke-virtual {v6, v7, v1, v5}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;)Ll/۠ۖۜ;

    move-result-object v1

    iget-object v5, v1, Ll/۠ۖۜ;->ᩳ:Ljava/lang/String;

    iget-object v6, v1, Ll/۠ۖۜ;->ۧ:Ljava/lang/String;

    const/4 v7, 0x0

    .line 202
    aget-object v3, v3, v7

    invoke-static {v3}, Ll/۬ܺۜ;->֫(Ll/ۙܺۜ;)V

    .line 203
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    const-string v8, "Verify text from the published file version."

    aget-object v9, v0, v7

    const-string v10, "inspect"

    invoke-static {v10, v8, v6, v9, v5}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-virtual {v3, v8}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 207
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    move-object/from16 v9, v17

    .line 208
    invoke-virtual {v8, v9, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    aget-object v0, v0, v7

    .line 209
    invoke-virtual {v6, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "size"

    iget-wide v6, v1, Ll/۠ۖۜ;->ܽ:J

    .line 210
    invoke-virtual {v0, v4, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v4, v16

    .line 211
    invoke-virtual {v0, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "changed"

    iget-boolean v5, v1, Ll/۠ۖۜ;->֫:Z

    .line 212
    invoke-virtual {v0, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "warnings"

    iget-object v1, v1, Ll/۠ۖۜ;->ܿ:Lbin/mt/json/JSONArray;

    .line 213
    invoke-virtual {v0, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 214
    new-instance v1, Ll/۬ۛ᩻;

    invoke-static {v0, v3}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1

    :cond_1c
    move-object/from16 v2, p0

    move-object/from16 v21, v8

    const-string v0, "1..200"

    .line 261
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 262
    invoke-static {v0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "edits must contain 1..200 items"

    move-object/from16 v3, v21

    .line 593
    invoke-static {v1, v4, v3, v0, v10}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 261
    throw v0

    :cond_1d
    move-object/from16 v2, p0

    const-string v0, "Invalid array argument"

    .line 399
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 593
    invoke-static {v0, v4, v10, v1, v8}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 399
    throw v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Create or edit one regular local text file with strict decoding and encoding while preserving its real LF, CRLF, and CR characters. For an existing file, first call mt_file_read_text and copy its exact absolute path, encoding, and targetVersion. For creation pass targetVersion=\"missing\", a non-empty encoding such as \"utf-8\", and one write_target edit. edits[] accepts 1..200 items with mode, matchText, and writeText. write_target must be the only edit. Local replace_match, insert_before_match, and insert_after_match modes require a non-empty matchText that occurs exactly once in the same original text; matched ranges cannot overlap. No mode adds a newline automatically. The existing raw file and encoded result are each limited to 10485760 bytes (10 MiB); all request matchText plus writeText total at most 524288 Unicode code points. The same encoding is used for strict decode and encode, so this tool does not transcode and never replaces malformed or unmappable text. The encoding token preserves or creates its declared BOM exactly. The tool creates no backup file; inspect the reported state after a failed write."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Edit File Text"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 85
    iget-object v0, p0, Ll/᩻ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 521
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "insert_before_match"

    const-string v2, "insert_after_match"

    const-string v3, "write_target"

    const-string v4, "replace_match"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "write_target, replace_match, insert_before_match, or insert_after_match."

    .line 522
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mode"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Empty for write_target; otherwise exact non-empty text occurring once in the original file."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "matchText"

    .line 528
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "writeText"

    const-string v3, "Exact text to write; no newline is added. May be empty for write_target or replace_match."

    const-string v4, "One edit against the same original text."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "description"

    const-string v3, "1..200 edits; all matchText and writeText values total at most 524288 Unicode code points."

    const-string v4, "type"

    const-string v5, "array"

    invoke-static {v4, v5, v2, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "items"

    .line 535
    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 536
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Non-empty absolute path or path relative to the Home captured at call start."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    .line 537
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Copy the exact version returned by mt_file_read_text, or pass \"missing\" only to create a new file."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "targetVersion"

    .line 539
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "For existing files copy the actual lowercase token from mt_file_read_text; for creation pass \"utf-8\" normally (no BOM), or \"utf-8-bom\" when a BOM is needed."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "encoding"

    .line 541
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "edits"

    .line 543
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Arguments for mt_file_edit_text."

    .line 536
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 86
    iput-object v0, p0, Ll/᩻ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    .line 88
    :cond_0
    iget-object v0, p0, Ll/᩻ᩴۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 4

    .line 93
    iget-object v0, p0, Ll/᩻ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 95
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute path fixed for this operation."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "path"

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Actual lowercase editor encoding token used for decode and encode."

    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "encoding"

    .line 98
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Final raw file size in bytes."

    const-string v3, "integer"

    .line 110
    invoke-static {v3, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "size"

    .line 100
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Final raw-byte version as 16 lowercase hex digits."

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetVersion"

    .line 102
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether final bytes differ from the pre-operation state."

    const-string v2, "boolean"

    .line 124
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "changed"

    .line 104
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Metadata or publication guarantee limitations; empty when none."

    .line 106
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Final state after the complete text edit was published."

    .line 94
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_edit_text"

    .line 109
    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {}, Ll/᩻ᩴۜ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_file_edit_text."

    .line 108
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 111
    :cond_0
    iget-object v0, p0, Ll/᩻ᩴۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_edit_text"

    return-object v0
.end method
