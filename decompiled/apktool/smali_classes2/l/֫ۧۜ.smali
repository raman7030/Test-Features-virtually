.class public final Ll/֫ۧۜ;
.super Ljava/lang/Object;
.source "E76K"


# direct methods
.method public static ֫(Ll/ܶ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 374
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    iget-object v2, p0, Ll/ܶ۟᩻;->ۡ:Ljava/lang/String;

    .line 375
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editSessionId"

    iget-object v2, p0, Ll/ܶ۟᩻;->ᩳ:Ljava/lang/String;

    .line 376
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "locator"

    iget-object v2, p0, Ll/ܶ۟᩻;->ۜ:Ljava/lang/String;

    .line 377
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "addressKind"

    iget-object v2, p0, Ll/ܶ۟᩻;->ܽ:Ljava/lang/String;

    .line 378
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "address"

    iget-object v2, p0, Ll/ܶ۟᩻;->ۧ:Ljava/lang/String;

    .line 379
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "paddingMode"

    iget-object p0, p0, Ll/ܶ۟᩻;->᩷:Ljava/lang/String;

    .line 380
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ۟᩻;[B)Ljava/lang/String;
    .locals 3

    .line 293
    iget-object p0, p0, Ll/ܶ۟᩻;->᩷:Ljava/lang/String;

    const-string v0, "null_pad"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 p0, 0x0

    .line 295
    :goto_0
    array-length v0, p1

    if-ge p0, v0, :cond_0

    aget-byte v0, p1, p0

    if-eqz v0, :cond_0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 298
    :cond_0
    invoke-static {p1, p0, v1}, Ll/֫ۧۜ;->֫([BIZ)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v0, "space_pad"

    .line 300
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 301
    array-length p0, p1

    :goto_1
    if-lez p0, :cond_2

    add-int/lit8 v0, p0, -0x1

    .line 302
    aget-byte v0, p1, v0

    const/16 v2, 0x20

    if-ne v0, v2, :cond_2

    add-int/lit8 p0, p0, -0x1

    goto :goto_1

    .line 305
    :cond_2
    invoke-static {p1, p0, v1}, Ll/֫ۧۜ;->֫([BIZ)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 307
    :cond_3
    array-length p0, p1

    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, Ll/֫ۧۜ;->֫([BIZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([BIZ)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    if-eqz p2, :cond_0

    .line 312
    aget-byte v2, p0, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 317
    :cond_1
    :try_start_0
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object p2

    sget-object v1, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 318
    invoke-virtual {p2, v1}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object p2

    .line 319
    invoke-virtual {p2, v1}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object p2

    .line 320
    invoke-static {p0, v0, p1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p0

    .line 321
    invoke-virtual {p0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :goto_1
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/ܶ۟᩻;)Ll/ۗ֫ۜ;
    .locals 25

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    .line 42
    iget-object v2, v0, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    invoke-static {v2}, Ll/ۨ۟᩻;->ܿ(Ljava/lang/String;)V

    .line 66
    iget-object v3, v1, Ll/ܶ۟᩻;->ܽ:Ljava/lang/String;

    iget-object v4, v1, Ll/ܶ۟᩻;->᩷:Ljava/lang/String;

    iget-object v5, v1, Ll/ܶ۟᩻;->ܳ:[B

    iget-wide v6, v1, Ll/ܶ۟᩻;->֫:J

    const-string v8, "virtual"

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v9, :cond_1

    .line 70
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    invoke-static {v2, v6, v7, v10, v11}, Ll/ܺܺۢ;->֫(Ljava/lang/String;JZZ)Ll/ۘܺۢ;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 75
    :try_start_1
    invoke-static {v6}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_0

    .line 79
    iget-boolean v7, v6, Ll/ۘܺۢ;->ۧ:Z

    if-eqz v7, :cond_0

    iget-boolean v7, v6, Ll/ۘܺۢ;->ܳ:Z

    if-eqz v7, :cond_0

    .line 83
    new-instance v7, Ll/ܰ֫ۜ;

    iget-wide v13, v6, Ll/ۘܺۢ;->ܺ:J

    iget-wide v9, v6, Ll/ۘܺۢ;->ۜ:J

    move-object v12, v7

    move-wide v15, v9

    move-object/from16 v17, v6

    invoke-direct/range {v12 .. v17}, Ll/ܰ֫ۜ;-><init>(JJLl/ۘܺۢ;)V

    goto :goto_1

    :cond_0
    const-string v0, "NATIVE_ADDRESS_NOT_MAPPED"

    const-string v1, "Native virtual address is not mapped to file-backed ELF bytes."

    .line 80
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 77
    :catch_0
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_1
    const-string v0, "NATIVE_ANALYZER_FAILED"

    const-string v1, "Native ELF analysis failed."

    .line 368
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 72
    throw v0

    .line 104
    :cond_1
    invoke-static {v6, v7}, Ll/ۘܺۢ;->֫(J)Ll/ۘܺۢ;

    move-result-object v9

    const-wide/16 v10, -0x1

    .line 89
    :try_start_2
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x0

    .line 114
    invoke-static {v2, v6, v7, v12, v12}, Ll/ܺܺۢ;->֫(Ljava/lang/String;JZZ)Ll/ۘܺۢ;

    move-result-object v12

    .line 90
    invoke-static {v12}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    .line 91
    iget-boolean v13, v12, Ll/ۘܺۢ;->ۧ:Z

    if-eqz v13, :cond_2

    .line 93
    iget-wide v10, v12, Ll/ۘܺۢ;->ܺ:J
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    move-wide v13, v10

    move-object/from16 v17, v12

    goto :goto_0

    .line 104
    :catch_2
    invoke-static {v6, v7}, Ll/ۘܺۢ;->֫(J)Ll/ۘܺۢ;

    move-result-object v9

    :cond_2
    move-object/from16 v17, v9

    move-wide v13, v10

    .line 100
    :goto_0
    new-instance v7, Ll/ܰ֫ۜ;

    iget-wide v9, v1, Ll/ܶ۟᩻;->֫:J

    move-object v12, v7

    move-wide v15, v9

    invoke-direct/range {v12 .. v17}, Ll/ܰ֫ۜ;-><init>(JJLl/ۘܺۢ;)V

    .line 113
    :goto_1
    array-length v6, v5

    .line 114
    iget-object v9, v1, Ll/ܶ۟᩻;->ۢ:[B

    array-length v10, v9

    const-string v11, "none"

    .line 115
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const-string v12, "space_pad"

    const-string v13, "warning"

    if-eqz v11, :cond_4

    if-ne v6, v10, :cond_3

    .line 119
    invoke-static {v1, v6}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;I)V

    .line 120
    new-instance v6, Ll/۟֫ۜ;

    const/4 v10, 0x0

    invoke-direct {v6, v5, v9, v10, v10}, Ll/۟֫ۜ;-><init>([B[BIZ)V

    move-object/from16 v16, v4

    move-object/from16 p2, v13

    goto/16 :goto_3

    .line 330
    :cond_3
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 331
    invoke-static/range {p4 .. p4}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "expectedTextByteCount"

    array-length v3, v5

    .line 332
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "replacementTextByteCount"

    array-length v3, v9

    .line 333
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "NATIVE_STRING_LENGTH_MISMATCH"

    const-string v3, "replacementText does not fit the native string patch window."

    .line 328
    invoke-static {v2, v3, v13, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 117
    throw v0

    .line 123
    :cond_4
    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 124
    invoke-static {v6, v10}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 125
    invoke-static {v1, v11}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;I)V

    .line 140
    new-array v14, v11, [B

    .line 141
    array-length v15, v5

    move-object/from16 p2, v13

    const/4 v13, 0x0

    invoke-static {v5, v13, v14, v13, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    array-length v13, v5

    const/16 v15, 0x20

    invoke-static {v14, v13, v11, v15}, Ljava/util/Arrays;->fill([BIIB)V

    .line 140
    new-array v13, v11, [B

    .line 141
    array-length v15, v9

    move-object/from16 v16, v4

    const/4 v4, 0x0

    invoke-static {v9, v4, v13, v4, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    array-length v9, v9

    const/16 v15, 0x20

    invoke-static {v13, v9, v11, v15}, Ljava/util/Arrays;->fill([BIIB)V

    .line 128
    new-instance v9, Ll/۟֫ۜ;

    sub-int/2addr v10, v6

    .line 129
    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-direct {v9, v14, v13, v6, v4}, Ll/۟֫ۜ;-><init>([B[BIZ)V

    goto :goto_2

    :cond_5
    move-object/from16 v16, v4

    move-object/from16 p2, v13

    const/4 v4, 0x0

    .line 131
    invoke-static {v6, v10}, Ljava/lang/Math;->max(II)I

    move-result v11

    add-int/lit8 v11, v11, 0x1

    .line 132
    invoke-static {v1, v11}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;I)V

    .line 140
    new-array v13, v11, [B

    .line 141
    array-length v14, v5

    invoke-static {v5, v4, v13, v4, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    array-length v14, v5

    invoke-static {v13, v14, v11, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 140
    new-array v14, v11, [B

    .line 141
    array-length v15, v9

    invoke-static {v9, v4, v14, v4, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    array-length v9, v9

    invoke-static {v14, v9, v11, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 135
    new-instance v9, Ll/۟֫ۜ;

    sub-int/2addr v10, v6

    .line 136
    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    move-result v4

    const/4 v6, 0x1

    invoke-direct {v9, v13, v14, v4, v6}, Ll/۟֫ۜ;-><init>([B[BIZ)V

    :goto_2
    move-object v6, v9

    .line 45
    :goto_3
    iget-wide v9, v0, Ll/۟۟᩻;->᩹:J

    iget-object v4, v6, Ll/۟֫ۜ;->ۧ:[B

    array-length v0, v4

    const-string v11, "patchedFileOffset"

    const-wide/16 v17, 0x0

    .line 154
    iget-wide v13, v7, Ll/ܰ֫ۜ;->ۧ:J

    cmp-long v15, v13, v17

    if-ltz v15, :cond_13

    const-wide/32 v21, 0x7fffffff

    cmp-long v23, v13, v21

    if-gtz v23, :cond_13

    cmp-long v21, v13, v9

    if-gtz v21, :cond_13

    const-wide v19, 0x7fffffffffffffffL

    sub-long v21, v19, v13

    move-object/from16 p3, v11

    move-object/from16 v23, v12

    int-to-long v11, v0

    cmp-long v24, v21, v11

    if-ltz v24, :cond_12

    add-long/2addr v11, v13

    cmp-long v21, v11, v9

    if-lez v21, :cond_6

    goto/16 :goto_b

    .line 46
    :cond_6
    array-length v0, v4

    .line 173
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    iget-object v8, v7, Ll/ܰ֫ۜ;->ܽ:Ll/ۘܺۢ;

    if-nez v3, :cond_7

    move-object v3, v7

    move-object v15, v8

    goto :goto_4

    .line 177
    :cond_7
    iget-wide v9, v8, Ll/ۘܺۢ;->᩻:J

    cmp-long v3, v9, v17

    if-ltz v3, :cond_11

    iget-wide v11, v8, Ll/ۘܺۢ;->ۡ:J

    cmp-long v3, v11, v17

    if-ltz v3, :cond_11

    cmp-long v3, v9, v11

    if-gtz v3, :cond_11

    const-wide v17, 0x7fffffffffffffffL

    sub-long v17, v17, v9

    move-object v3, v7

    move-object v15, v8

    int-to-long v7, v0

    cmp-long v0, v17, v7

    if-ltz v0, :cond_11

    add-long/2addr v9, v7

    cmp-long v0, v9, v11

    if-gtz v0, :cond_11

    .line 47
    :goto_4
    array-length v0, v4

    .line 185
    new-array v7, v0, [B

    .line 186
    :try_start_3
    new-instance v8, Ljava/io/RandomAccessFile;

    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v2, "r"

    invoke-direct {v8, v9, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 187
    :try_start_4
    invoke-virtual {v8, v13, v14}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 188
    invoke-virtual {v8, v7}, Ljava/io/RandomAccessFile;->readFully([B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 190
    :try_start_5
    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4

    .line 218
    array-length v2, v5

    if-lt v0, v2, :cond_10

    const/4 v2, 0x0

    .line 221
    :goto_5
    array-length v8, v5

    if-ge v2, v8, :cond_8

    .line 222
    aget-byte v8, v7, v2

    aget-byte v9, v5, v2

    if-ne v8, v9, :cond_10

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    move-object/from16 v2, v16

    move-object/from16 v8, v23

    .line 206
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x20

    goto :goto_6

    :cond_9
    const/4 v8, 0x0

    .line 208
    :goto_6
    array-length v9, v5

    :goto_7
    const-string v10, "actualHex"

    if-ge v9, v0, :cond_b

    .line 209
    aget-byte v11, v7, v9

    if-ne v11, v8, :cond_a

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    .line 210
    :cond_a
    array-length v3, v5

    invoke-static {v7, v3, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    .line 341
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 342
    invoke-static/range {p4 .. p4}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 343
    invoke-static {v13, v14}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v8, p3

    invoke-virtual {v5, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "byteOffset"

    .line 344
    invoke-virtual {v5, v6, v13, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "expectedText"

    iget-object v8, v1, Ll/ܶ۟᩻;->᩻:Ljava/lang/String;

    .line 345
    invoke-virtual {v5, v6, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "actualText"

    .line 346
    invoke-static {v1, v7}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "expectedHex"

    .line 347
    invoke-static {v4}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 348
    invoke-static {v7}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v10, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "requiredPaddingBytes"

    array-length v5, v0

    .line 349
    invoke-virtual {v1, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "actualPaddingHex"

    .line 350
    invoke-static {v0}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "null_pad"

    .line 352
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "terminatorRequired"

    .line 351
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "NATIVE_STRING_PADDING_MISMATCH"

    const-string v2, "Native string padding bytes do not match paddingMode."

    move-object/from16 v4, p2

    .line 339
    invoke-static {v1, v2, v4, v3, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 212
    throw v0

    :cond_b
    long-to-int v0, v13

    .line 232
    new-instance v2, Ljava/util/ArrayList;

    const/4 v5, 0x1

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 233
    new-instance v5, Ll/ܰ᩻ۜ;

    iget-object v7, v6, Ll/۟֫ۜ;->֫:[B

    invoke-direct {v5, v0, v4, v7}, Ll/ܰ᩻ۜ;-><init>(I[B[B)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    new-instance v0, Ll/۟᩻ۜ;

    iget-object v5, v1, Ll/ܶ۟᩻;->ۡ:Ljava/lang/String;

    iget-object v7, v1, Ll/ܶ۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v8, v1, Ll/ܶ۟᩻;->ܿ:Ljava/lang/String;

    invoke-direct {v0, v5, v7, v8, v2}, Ll/۟᩻ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    move-object/from16 v2, p0

    move-object/from16 v5, p1

    .line 247
    :try_start_6
    invoke-virtual {v5, v2, v0}, Ll/ܺ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/۟᩻ۜ;)Ll/۫ۜۜ;
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_3

    .line 54
    new-instance v11, Ll/ۗ֫ۜ;

    iget v9, v6, Ll/۟֫ۜ;->ܽ:I

    iget-boolean v10, v6, Ll/۟֫ۜ;->ᩳ:Z

    iget-wide v4, v3, Ll/ܰ֫ۜ;->֫:J

    iget-wide v7, v3, Ll/ܰ֫ۜ;->ۧ:J

    iget-object v12, v6, Ll/۟֫ۜ;->ۧ:[B

    iget-object v13, v6, Ll/۟֫ۜ;->֫:[B

    move-object v0, v11

    move-object/from16 v1, p4

    move-wide v2, v4

    move-object v4, v15

    move-wide v5, v7

    move-object v7, v12

    move-object v8, v13

    invoke-direct/range {v0 .. v10}, Ll/ۗ֫ۜ;-><init>(Ll/ܶ۟᩻;JLl/ۘܺۢ;J[B[BIZ)V

    return-object v11

    :catch_3
    move-exception v0

    move-object v2, v0

    const-string v0, "PATCH_EXPECTED_MISMATCH"

    .line 249
    iget-object v3, v2, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 250
    iget-object v0, v2, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, ""

    .line 251
    invoke-virtual {v0, v10, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 258
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_d

    .line 261
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    new-array v3, v2, [B

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v2, :cond_e

    mul-int/lit8 v6, v5, 0x2

    .line 263
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x10

    invoke-static {v7, v8}, Ljava/lang/Character;->digit(CI)I

    move-result v7

    add-int/lit8 v6, v6, 0x1

    .line 264
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6, v8}, Ljava/lang/Character;->digit(CI)I

    move-result v6

    if-ltz v7, :cond_c

    if-ltz v6, :cond_c

    shl-int/lit8 v7, v7, 0x4

    or-int/2addr v6, v7

    int-to-byte v6, v6

    .line 268
    aput-byte v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_c
    const/4 v0, 0x0

    new-array v3, v0, [B

    goto :goto_9

    :cond_d
    const/4 v0, 0x0

    new-array v3, v0, [B

    .line 250
    :cond_e
    :goto_9
    invoke-static {v1, v13, v14, v4, v3}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;J[B[B)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 253
    :cond_f
    throw v2

    .line 204
    :cond_10
    invoke-static {v1, v13, v14, v4, v7}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;J[B[B)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 186
    :try_start_7
    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_a

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_8
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4

    :catch_4
    const-string v0, "ENTRY_READ_FAILED"

    const-string v1, "Failed to read native string byte window."

    .line 191
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 180
    :cond_11
    invoke-static {}, Ll/۫֫ۜ;->ܿ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_12
    :goto_b
    move-object/from16 v4, p2

    move-object/from16 v8, p3

    goto :goto_c

    :cond_13
    move-object/from16 v4, p2

    move-object v8, v11

    .line 158
    :goto_c
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 159
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 160
    invoke-static {v13, v14}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-ltz v15, :cond_15

    const-wide v5, 0x7fffffffffffffffL

    sub-long/2addr v5, v13

    int-to-long v7, v0

    cmp-long v0, v5, v7

    if-gez v0, :cond_14

    goto :goto_d

    :cond_14
    add-long/2addr v13, v7

    .line 162
    invoke-static {v13, v14}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    goto :goto_e

    :cond_15
    :goto_d
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_e
    const-string v3, "endByteOffset"

    .line 161
    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "entrySize"

    .line 163
    invoke-virtual {v0, v2, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "NATIVE_STRING_RANGE_OUT_OF_ENTRY"

    const-string v3, "Native string patch window is outside the ZIP entry."

    .line 156
    invoke-static {v2, v3, v4, v1, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ll/ܶ۟᩻;J[B[B)Ll/ۗۛ᩻;
    .locals 4

    .line 278
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 279
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    iget-object v3, p0, Ll/ܶ۟᩻;->ۡ:Ljava/lang/String;

    .line 280
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    iget-object v3, p0, Ll/ܶ۟᩻;->ᩳ:Ljava/lang/String;

    .line 281
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "locator"

    iget-object v3, p0, Ll/ܶ۟᩻;->ۜ:Ljava/lang/String;

    .line 282
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "patchedFileOffset"

    .line 283
    invoke-static {p1, p2}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "byteOffset"

    .line 284
    invoke-virtual {v1, v2, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "paddingMode"

    iget-object v1, p0, Ll/ܶ۟᩻;->᩷:Ljava/lang/String;

    .line 285
    invoke-virtual {p1, p2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "expectedText"

    iget-object v1, p0, Ll/ܶ۟᩻;->᩻:Ljava/lang/String;

    .line 286
    invoke-virtual {p1, p2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "actualText"

    .line 287
    invoke-static {p0, p4}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;[B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "expectedHex"

    .line 288
    invoke-static {p3}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "actualHex"

    .line 289
    invoke-static {p4}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "PATCH_EXPECTED_MISMATCH"

    const-string p2, "Current bytes do not match expectedText."

    const-string p3, "warning"

    .line 276
    invoke-static {p1, p2, p3, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ۟᩻;I)V
    .locals 5

    const/16 v0, 0x1000

    if-gt p1, v0, :cond_0

    return-void

    .line 359
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 360
    invoke-static {p0}, Ll/֫ۧۜ;->֫(Ll/ܶ۟᩻;)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object v3, p0, Ll/ܶ۟᩻;->ܳ:[B

    array-length v3, v3

    const-string v4, "expectedTextByteCount"

    .line 361
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object p0, p0, Ll/ܶ۟᩻;->ۢ:[B

    array-length p0, p0

    const-string v3, "replacementTextByteCount"

    .line 362
    invoke-virtual {v2, v3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v2, "bytesPatched"

    .line 363
    invoke-virtual {p0, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "limitBytes"

    .line 364
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "NATIVE_STRING_TOO_LARGE"

    const-string v0, "Native string patch window is too large."

    const-string v2, "warning"

    .line 357
    invoke-static {p1, v0, v2, v1, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 149
    throw p0
.end method
