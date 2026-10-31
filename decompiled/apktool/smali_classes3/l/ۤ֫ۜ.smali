.class public final Ll/ۤ֫ۜ;
.super Ljava/lang/Object;
.source "W77C"


# static fields
.field public static final ֫:[B

.field public static final ۧ:[B

.field public static final ܽ:[B

.field public static final ᩳ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "1F2003D5"

    .line 24
    invoke-static {v0}, Ll/ۤ֫ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۤ֫ۜ;->֫:[B

    const-string v0, "00F020E3"

    .line 25
    invoke-static {v0}, Ll/ۤ֫ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۤ֫ۜ;->ۧ:[B

    const-string v0, "00BF"

    .line 26
    invoke-static {v0}, Ll/ۤ֫ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۤ֫ۜ;->ܽ:[B

    const-string v0, "90"

    .line 27
    invoke-static {v0}, Ll/ۤ֫ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۤ֫ۜ;->ᩳ:[B

    return-void
.end method

.method public static ֫(IILjava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    .line 311
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 312
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "expectedBytes"

    .line 313
    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "assembledBytes"

    .line 314
    invoke-virtual {p0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "paddingMode"

    .line 315
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "NATIVE_PATCH_LENGTH_MISMATCH"

    const-string p2, "Assembled bytes do not fit the expected patch window."

    const-string v1, "warning"

    .line 309
    invoke-static {p1, p2, v1, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/RuntimeException;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 277
    invoke-virtual {p5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 279
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string p5, "<path>"

    .line 281
    invoke-virtual {v0, p6, p5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p5

    .line 282
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result p6

    const/16 v0, 0x200

    if-le p6, v0, :cond_1

    const/4 p6, 0x0

    .line 283
    invoke-virtual {p5, p6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p5

    .line 287
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p6

    .line 288
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "arch"

    .line 289
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "bits"

    .line 290
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "address"

    .line 291
    invoke-static {p2, p3}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "instructionMode"

    .line 292
    invoke-virtual {p0, p1, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "message"

    .line 293
    invoke-virtual {p0, p1, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "NATIVE_ASSEMBLY_FAILED"

    const-string p2, "Native instruction assembly failed."

    const-string p3, "warning"

    .line 285
    invoke-static {p1, p2, p3, p6, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۠۟᩻;JLjava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    .line 263
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 264
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    iget-object v3, p0, Ll/۠۟᩻;->ܺ:Ljava/lang/String;

    .line 265
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    iget-object v3, p0, Ll/۠۟᩻;->ᩳ:Ljava/lang/String;

    .line 266
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "locator"

    iget-object v3, p0, Ll/۠۟᩻;->᩷:Ljava/lang/String;

    .line 267
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "patchedFileOffset"

    .line 268
    invoke-static {p1, p2}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "byteOffset"

    .line 269
    invoke-virtual {v1, v2, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "expectedHex"

    iget-object p0, p0, Ll/۠۟᩻;->᩻:Ljava/lang/String;

    .line 270
    invoke-virtual {p1, p2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "actualHex"

    .line 271
    invoke-virtual {p0, p1, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "PATCH_EXPECTED_MISMATCH"

    const-string p2, "Current bytes do not match expectedHex."

    const-string p3, "warning"

    .line 261
    invoke-static {p1, p2, p3, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/۠۟᩻;)Ll/ۙ֫ۜ;
    .locals 28

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    .line 42
    iget-object v2, v0, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    invoke-static {v2}, Ll/ۨ۟᩻;->ᩳ(Ljava/lang/String;)Ll/ۨ۟᩻;

    move-result-object v3

    .line 43
    invoke-static {v3, v1}, Ll/᩵֫ۜ;->֫(Ll/ۨ۟᩻;Ll/۠۟᩻;)Ljava/lang/String;

    move-result-object v8

    iget-object v4, v1, Ll/۠۟᩻;->ۢ:Ljava/lang/String;

    iget-wide v5, v1, Ll/۠۟᩻;->֫:J

    iget-object v7, v1, Ll/۠۟᩻;->ܳ:[B

    const-string v9, "virtual"

    .line 44
    iget-object v10, v1, Ll/۠۟᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const-string v10, "thumb"

    if-eqz v9, :cond_0

    .line 50
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    const-wide/16 v11, -0x2

    and-long/2addr v5, v11

    .line 96
    :cond_0
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    .line 114
    invoke-static {v2, v5, v6, v9, v11}, Ll/ܺܺۢ;->֫(Ljava/lang/String;JZZ)Ll/ۘܺۢ;

    move-result-object v11
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_5

    .line 50
    invoke-static {v11}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    .line 51
    iget-boolean v12, v11, Ll/ۘܺۢ;->ۧ:Z

    if-eqz v12, :cond_16

    .line 55
    iget-boolean v12, v11, Ll/ۘܺۢ;->ܿ:Z

    if-eqz v12, :cond_15

    if-nez v9, :cond_1

    .line 60
    iget-wide v5, v11, Ll/ۘܺۢ;->ܺ:J

    :cond_1
    move-wide v12, v5

    .line 62
    iget-wide v14, v11, Ll/ۘܺۢ;->ۜ:J

    .line 63
    iget-wide v5, v0, Ll/۟۟᩻;->᩹:J

    array-length v9, v7

    const-wide/16 v16, 0x0

    cmp-long v18, v14, v16

    if-ltz v18, :cond_14

    move-object/from16 v19, v7

    move-object/from16 v18, v8

    .line 108
    iget-wide v7, v11, Ll/ۘܺۢ;->᩻:J

    cmp-long v20, v7, v16

    if-ltz v20, :cond_14

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    iget-wide v2, v11, Ll/ۘܺۢ;->ۡ:J

    cmp-long v22, v2, v16

    if-ltz v22, :cond_14

    cmp-long v22, v7, v2

    if-gtz v22, :cond_14

    cmp-long v22, v14, v5

    if-gtz v22, :cond_14

    const-wide v22, 0x7fffffffffffffffL

    sub-long v24, v22, v7

    move-object/from16 v26, v10

    int-to-long v9, v9

    cmp-long v27, v24, v9

    if-ltz v27, :cond_14

    add-long/2addr v7, v9

    cmp-long v24, v7, v2

    if-gtz v24, :cond_14

    sub-long v22, v22, v14

    cmp-long v2, v22, v9

    if-ltz v2, :cond_14

    add-long/2addr v9, v14

    cmp-long v2, v9, v5

    if-gtz v2, :cond_14

    cmp-long v2, v12, v16

    if-ltz v2, :cond_13

    const-wide/32 v2, 0x7fffffff

    cmp-long v5, v14, v2

    if-gtz v5, :cond_13

    .line 67
    iget-object v2, v1, Ll/۠۟᩻;->ۧ:Ljava/lang/String;

    .line 140
    invoke-virtual/range {v21 .. v21}, Ll/ۨ۟᩻;->֫()Ljava/lang/String;

    move-result-object v3

    const-string v5, "arm"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const/4 v3, 0x1

    move-object/from16 v8, v18

    move-object/from16 v3, v21

    move-object/from16 v6, v26

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    move-object/from16 v3, v21

    .line 173
    iget v6, v3, Ll/ۨ۟᩻;->ۧ:I

    const/16 v7, 0x28

    move-object/from16 v8, v18

    if-ne v6, v7, :cond_3

    move-object/from16 v6, v26

    .line 144
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/4 v7, 0x2

    goto :goto_0

    :cond_3
    move-object/from16 v6, v26

    :cond_4
    const/4 v7, 0x4

    :goto_0
    int-to-long v9, v7

    const-wide/16 v21, 0x1

    sub-long v9, v9, v21

    and-long/2addr v9, v12

    cmp-long v18, v9, v16

    if-nez v18, :cond_12

    move-object/from16 v9, v19

    .line 69
    array-length v2, v9

    .line 160
    new-array v2, v2, [B

    .line 161
    :try_start_1
    new-instance v7, Ljava/io/RandomAccessFile;

    new-instance v10, Ljava/io/File;

    move-object/from16 v16, v11

    move-object/from16 v11, v20

    invoke-direct {v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v11, "r"

    invoke-direct {v7, v10, v11}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4

    .line 162
    :try_start_2
    invoke-virtual {v7, v14, v15}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 163
    invoke-virtual {v7, v2}, Ljava/io/RandomAccessFile;->readFully([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    :try_start_3
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 70
    invoke-static {v2, v9}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_11

    .line 74
    invoke-virtual {v3}, Ll/ۨ۟᩻;->֫()Ljava/lang/String;

    move-result-object v7

    .line 75
    invoke-virtual {v3, v8}, Ll/ۨ۟᩻;->֫(Ljava/lang/String;)I

    move-result v2

    .line 76
    iget-object v10, v1, Ll/۠۟᩻;->ۡ:Ljava/lang/String;

    iget-object v11, v0, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    .line 151
    :try_start_4
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    invoke-static {v7, v2, v12, v13, v10}, Ll/ܺܺۢ;->֫(Ljava/lang/String;IJLjava/lang/String;)Ll/ᩴܺۢ;

    move-result-object v0
    :try_end_4
    .catch Ll/᩺ܺۢ; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 177
    :try_start_5
    invoke-virtual {v0}, Ll/ᩴܺۢ;->֫()[B

    move-result-object v10
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1

    .line 181
    iget-object v11, v0, Ll/ᩴܺۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    iget v11, v0, Ll/ᩴܺۢ;->ܽ:I

    if-ne v2, v11, :cond_10

    iget-wide v1, v0, Ll/ᩴܺۢ;->֫:J

    cmp-long v11, v12, v1

    if-nez v11, :cond_10

    array-length v1, v10

    if-eqz v1, :cond_10

    iget v0, v0, Ll/ᩴܺۢ;->ܿ:I

    array-length v1, v10

    if-ne v0, v1, :cond_10

    .line 185
    array-length v0, v10

    const/16 v1, 0x100

    const-string v2, "warning"

    if-gt v0, v1, :cond_f

    .line 195
    array-length v0, v9

    .line 196
    array-length v1, v10

    if-gt v1, v0, :cond_e

    const-string v1, "none"

    .line 199
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 200
    array-length v1, v10

    if-ne v1, v0, :cond_6

    .line 203
    invoke-virtual {v10}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :cond_5
    move-object v11, v0

    goto :goto_3

    .line 201
    :cond_6
    array-length v1, v10

    invoke-static {v0, v1, v4}, Ll/ۤ֫ۜ;->֫(IILjava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 205
    :cond_7
    array-length v1, v10

    sub-int v1, v0, v1

    .line 219
    invoke-virtual {v3}, Ll/ۨ۟᩻;->֫()Ljava/lang/String;

    move-result-object v4

    .line 220
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 138
    iget v11, v3, Ll/ۨ۟᩻;->֫:I

    move-object/from16 p2, v2

    const/16 v2, 0x40

    if-ne v11, v2, :cond_9

    .line 221
    sget-object v2, Ll/ۤ֫ۜ;->֫:[B

    goto :goto_1

    :cond_8
    move-object/from16 p2, v2

    .line 223
    :cond_9
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 224
    sget-object v2, Ll/ۤ֫ۜ;->ܽ:[B

    goto :goto_1

    .line 226
    :cond_a
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 227
    sget-object v2, Ll/ۤ֫ۜ;->ۧ:[B

    goto :goto_1

    .line 229
    :cond_b
    sget-object v2, Ll/ۤ֫ۜ;->ᩳ:[B

    .line 207
    :goto_1
    array-length v4, v2

    rem-int v4, v1, v4

    if-nez v4, :cond_d

    .line 211
    invoke-static {v10, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    .line 212
    array-length v1, v10

    :goto_2
    array-length v4, v0

    if-ge v1, v4, :cond_5

    .line 213
    array-length v4, v2

    const/4 v5, 0x0

    invoke-static {v2, v5, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 212
    array-length v4, v2

    add-int/2addr v1, v4

    goto :goto_2

    :goto_3
    long-to-int v0, v14

    .line 234
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 235
    new-instance v2, Ll/ܰ᩻ۜ;

    invoke-direct {v2, v0, v9, v11}, Ll/ܰ᩻ۜ;-><init>(I[B[B)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    new-instance v0, Ll/۟᩻ۜ;

    move-object/from16 v4, p4

    iget-object v2, v4, Ll/۠۟᩻;->ܺ:Ljava/lang/String;

    iget-object v5, v4, Ll/۠۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v6, v4, Ll/۠۟᩻;->ܿ:Ljava/lang/String;

    invoke-direct {v0, v2, v5, v6, v1}, Ll/۟᩻ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 249
    :try_start_6
    invoke-virtual {v2, v1, v0}, Ll/ܺ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/۟᩻ۜ;)Ll/۫ۜۜ;
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_0

    .line 85
    new-instance v17, Ll/ۙ֫ۜ;

    .line 138
    iget v9, v3, Ll/ۨ۟᩻;->֫:I

    .line 87
    invoke-virtual {v3, v8}, Ll/ۨ۟᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 88
    invoke-virtual {v3, v8}, Ll/ۨ۟᩻;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v17

    move-object/from16 v1, p4

    move-object v2, v8

    move-wide v3, v12

    move-object/from16 v5, v16

    move-object v6, v7

    move v7, v9

    move-object/from16 v8, v18

    move-object/from16 v9, v19

    move-object v12, v10

    move-object v13, v11

    move-wide v10, v14

    invoke-direct/range {v0 .. v13}, Ll/ۙ֫ۜ;-><init>(Ll/۠۟᩻;Ljava/lang/String;JLl/ۘܺۢ;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;J[B[B)V

    return-object v17

    :catch_0
    move-exception v0

    move-object v1, v0

    const-string v0, "PATCH_EXPECTED_MISMATCH"

    .line 251
    iget-object v2, v1, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "actualHex"

    const-string v2, ""

    .line 253
    iget-object v1, v1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 252
    invoke-static {v4, v14, v15, v0}, Ll/ۤ֫ۜ;->֫(Ll/۠۟᩻;JLjava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 255
    :cond_c
    throw v1

    .line 208
    :cond_d
    invoke-virtual {v3, v8}, Ll/ۨ۟᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 209
    invoke-virtual {v3, v8}, Ll/ۨ۟᩻;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 322
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 323
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "remainingBytes"

    .line 324
    invoke-virtual {v4, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "instructionSet"

    .line 325
    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "instructionWidth"

    .line 326
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "NATIVE_PATCH_NOP_UNAVAILABLE"

    const-string v2, "Remaining patch window cannot be filled with NOP instructions."

    move-object/from16 v5, p2

    .line 320
    invoke-static {v1, v2, v5, v3, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 208
    throw v0

    :cond_e
    move-object v12, v10

    .line 197
    array-length v1, v12

    invoke-static {v0, v1, v4}, Ll/ۤ֫ۜ;->֫(IILjava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_f
    move-object v5, v2

    move-object v12, v10

    .line 186
    array-length v0, v9

    array-length v1, v12

    .line 300
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 301
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "expectedBytes"

    .line 302
    invoke-virtual {v3, v6, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "assembledBytes"

    .line 303
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "paddingMode"

    .line 304
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "NATIVE_PATCH_TOO_LARGE"

    const-string v3, "Native instruction patch window is too large."

    .line 298
    invoke-static {v1, v3, v5, v2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 186
    throw v0

    .line 183
    :cond_10
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 179
    :catch_1
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    move-object v9, v0

    move-object v4, v7

    move v5, v2

    move-wide v6, v12

    move-object v10, v11

    .line 155
    invoke-static/range {v4 .. v10}, Ll/ۤ֫ۜ;->֫(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/RuntimeException;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_3
    move-exception v0

    move-object v9, v0

    move-object v4, v7

    move v5, v2

    move-wide v6, v12

    move-object v10, v11

    .line 153
    invoke-static/range {v4 .. v10}, Ll/ۤ֫ۜ;->֫(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/RuntimeException;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_11
    move-object v4, v1

    .line 71
    invoke-static {v2}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v14, v15, v0}, Ll/ۤ֫ۜ;->֫(Ll/۠۟᩻;JLjava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 161
    :try_start_7
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_8
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4

    :catch_4
    const-string v0, "ENTRY_READ_FAILED"

    const-string v1, "Failed to read native byte window."

    .line 166
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 130
    :cond_12
    invoke-static {v2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "-byte aligned effective virtual address"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 131
    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "address must map to an aligned instruction address"

    const-string v4, "address"

    .line 128
    invoke-static {v3, v4, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 65
    :cond_13
    invoke-static {}, Ll/۫֫ۜ;->ܿ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 114
    :cond_14
    invoke-static {}, Ll/۫֫ۜ;->ܿ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_15
    const-string v0, "NATIVE_ADDRESS_NOT_EXECUTABLE"

    const-string v1, "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable."

    .line 56
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_16
    const-string v0, "NATIVE_ADDRESS_NOT_MAPPED"

    const-string v1, "Native address is not mapped in the ELF file."

    .line 52
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_5
    const-string v0, "NATIVE_ANALYZER_FAILED"

    const-string v1, "Native ELF analysis failed."

    .line 330
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 98
    throw v0
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 6

    .line 335
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 336
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    .line 338
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    add-int/lit8 v3, v3, 0x1

    .line 339
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    shl-int/lit8 v4, v4, 0x4

    or-int/2addr v3, v4

    int-to-byte v3, v3

    .line 340
    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
