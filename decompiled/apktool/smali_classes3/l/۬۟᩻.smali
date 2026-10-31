.class public final Ll/۬۟᩻;
.super Ljava/lang/Object;
.source "S76D"


# direct methods
.method public static ֫(JJ)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    sub-long/2addr v0, p0

    cmp-long v2, v0, p2

    if-ltz v2, :cond_0

    add-long/2addr p0, p2

    return-wide p0

    .line 363
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/ᩴ۟᩻;Ll/ۗ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 47

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 35
    iget-object v2, v0, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    iget-wide v3, v0, Ll/۟۟᩻;->᩹:J

    invoke-static {v2}, Ll/ۨ۟᩻;->ᩳ(Ljava/lang/String;)Ll/ۨ۟᩻;

    move-result-object v8

    .line 124
    invoke-static {v8, v1}, Ll/᩵֫ۜ;->֫(Ll/ۨ۟᩻;Ll/ᩴ۟᩻;)Ljava/lang/String;

    move-result-object v13

    iget-boolean v5, v1, Ll/ᩴ۟᩻;->ۢ:Z

    iget-wide v6, v1, Ll/ᩴ۟᩻;->֫:J

    .line 37
    iget-object v9, v1, Ll/ᩴ۟᩻;->ܽ:Ljava/lang/String;

    const-string v10, "virtual"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    const-string v11, "thumb"

    .line 50
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    const-wide/16 v11, -0x2

    and-long/2addr v6, v11

    .line 40
    :cond_0
    iget-object v0, v0, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    iget-boolean v11, v1, Ll/ᩴ۟᩻;->ۢ:Z

    move-object/from16 v14, p3

    move-object v15, v0

    move-wide/from16 v16, v6

    move/from16 v18, v10

    move/from16 v19, v11

    .line 135
    invoke-virtual/range {v14 .. v19}, Ll/ۗ۟᩻;->֫(Ljava/lang/String;JZZ)Ll/ۘܺۢ;

    move-result-object v12

    const-string v14, "Native ELF analysis failed."

    const-string v15, "NATIVE_ANALYZER_FAILED"

    if-eqz v12, :cond_1

    move-object v0, v12

    goto :goto_0

    .line 141
    :cond_1
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    invoke-static {v0, v6, v7, v10, v11}, Ll/ܺܺۢ;->֫(Ljava/lang/String;JZZ)Ll/ۘܺۢ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    .line 42
    :goto_0
    iget-wide v11, v0, Ll/ۘܺۢ;->ۡ:J

    move-wide/from16 v16, v6

    iget-wide v6, v0, Ll/ۘܺۢ;->᩻:J

    move-object/from16 p1, v14

    move-object/from16 v18, v15

    iget-wide v14, v0, Ll/ۘܺۢ;->ܺ:J

    invoke-static {v0}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    move-object/from16 v19, v9

    .line 43
    iget-boolean v9, v0, Ll/ۘܺۢ;->ۧ:Z

    if-eqz v9, :cond_27

    .line 47
    iget-boolean v9, v0, Ll/ۘܺۢ;->ܿ:Z

    if-eqz v9, :cond_26

    move-object/from16 v20, v8

    .line 51
    iget-wide v8, v0, Ll/ۘܺۢ;->ۜ:J

    move/from16 v27, v10

    move-wide/from16 v21, v11

    if-nez v10, :cond_2

    move-wide v10, v14

    goto :goto_1

    :cond_2
    move-wide/from16 v10, v16

    :goto_1
    const/4 v12, 0x0

    if-nez v5, :cond_3

    .line 178
    invoke-static {v12}, Ll/۬֫ۜ;->֫(Z)Ll/۬֫ۜ;

    move-result-object v12

    move-object/from16 v25, v0

    move-wide/from16 v29, v3

    move-object/from16 v28, v13

    move-wide/from16 v23, v14

    move-object v15, v2

    move-object v13, v12

    goto :goto_2

    .line 180
    :cond_3
    invoke-static {v0}, Ll/۫֫ۜ;->ۧ(Ll/ۘܺۢ;)V

    .line 181
    iget-object v12, v0, Ll/ۘܺۢ;->֫:Ll/ۖܺۢ;

    .line 182
    iget-boolean v1, v12, Ll/ۖܺۢ;->ۧ:Z

    const/16 v17, 0x1

    move-object/from16 v28, v13

    move-wide/from16 v23, v14

    iget-wide v13, v12, Ll/ۖܺۢ;->ۜ:J

    if-nez v1, :cond_4

    .line 183
    invoke-static/range {v17 .. v17}, Ll/۬֫ۜ;->֫(Z)Ll/۬֫ۜ;

    move-result-object v1

    move-object/from16 v25, v0

    move-object v13, v1

    move-object v15, v2

    move-wide/from16 v29, v3

    goto :goto_2

    :cond_4
    move-object/from16 v25, v0

    .line 185
    iget-wide v0, v12, Ll/ۖܺۢ;->ܿ:J

    invoke-static {v13, v14, v0, v1}, Ll/۬۟᩻;->֫(JJ)J

    move-result-wide v0

    move-object v15, v2

    move-wide/from16 v29, v3

    .line 269
    iget-wide v2, v12, Ll/ۖܺۢ;->ܳ:J

    invoke-static {v13, v14, v2, v3}, Ll/۬۟᩻;->֫(JJ)J

    move-result-wide v2

    cmp-long v4, v0, v10

    if-nez v4, :cond_25

    cmp-long v0, v10, v2

    if-gez v0, :cond_25

    const/4 v0, 0x0

    .line 190
    invoke-static {v12, v2, v3, v0}, Ll/۬֫ۜ;->֫(Ll/ۖܺۢ;JZ)Ll/۬֫ۜ;

    move-result-object v0

    move-object v13, v0

    .line 163
    :goto_2
    iget-wide v0, v13, Ll/۬֫ۜ;->ᩳ:J

    iget-boolean v2, v13, Ll/۬֫ۜ;->֫:Z

    const-wide/16 v3, 0x0

    cmp-long v12, v8, v3

    if-ltz v12, :cond_24

    cmp-long v12, v6, v3

    if-ltz v12, :cond_24

    cmp-long v12, v21, v3

    if-ltz v12, :cond_24

    cmp-long v12, v6, v21

    if-gtz v12, :cond_24

    cmp-long v12, v8, v29

    if-gtz v12, :cond_24

    cmp-long v12, v23, v3

    if-ltz v12, :cond_24

    cmp-long v12, v10, v3

    if-ltz v12, :cond_24

    move-object/from16 v14, p3

    move-wide/from16 v23, v10

    move-object/from16 v11, v25

    .line 58
    invoke-virtual {v14, v15, v11, v5}, Ll/ۗ۟᩻;->֫(Ljava/lang/String;Ll/ۘܺۢ;Z)V

    sub-long v5, v21, v6

    sub-long v10, v29, v8

    .line 60
    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-gtz v7, :cond_6

    if-nez v2, :cond_5

    .line 67
    invoke-virtual/range {v20 .. v20}, Ll/ۨ۟᩻;->֫()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v10, v20

    .line 138
    iget v6, v10, Ll/ۨ۟᩻;->֫:I

    move-object/from16 v1, v28

    .line 68
    invoke-virtual {v10, v1}, Ll/ۨ۟᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 69
    invoke-virtual {v10, v1}, Ll/ۨ۟᩻;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 0
    sget-object v12, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v14, 0x0

    .line 70
    sget-object v16, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    move-object/from16 v15, v16

    move-object/from16 v17, v16

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide/from16 v2, v23

    const/4 v11, 0x0

    move-object/from16 v0, v25

    move-object/from16 v20, v0

    move-object/from16 v0, p2

    move-object/from16 v4, v20

    .line 66
    invoke-static/range {v0 .. v17}, Ll/۫֫ۜ;->֫(Ll/ᩴ۟᩻;Ljava/lang/String;JLl/ۘܺۢ;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIZLjava/util/List;Ll/۬֫ۜ;ZLbin/mt/json/JSONValue;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 64
    :cond_5
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_6
    move-object/from16 v10, v20

    move-wide/from16 v3, v23

    move-object/from16 v20, v25

    move-object/from16 v11, v28

    move-object v7, v13

    if-nez v2, :cond_7

    :goto_3
    move-object/from16 v13, p2

    goto :goto_4

    :cond_7
    sub-long v13, v0, v3

    const-wide/16 v16, 0x0

    cmp-long v21, v13, v16

    if-lez v21, :cond_23

    .line 203
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    goto :goto_3

    .line 74
    :goto_4
    iget v14, v13, Ll/ᩴ۟᩻;->ۜ:I

    move-wide/from16 v28, v0

    int-to-long v0, v14

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v14, v0

    if-eqz v2, :cond_9

    if-eqz v14, :cond_8

    goto :goto_5

    .line 76
    :cond_8
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 78
    :cond_9
    :goto_5
    invoke-virtual {v10}, Ll/ۨ۟᩻;->֫()Ljava/lang/String;

    move-result-object v1

    .line 79
    invoke-virtual {v10, v11}, Ll/ۨ۟᩻;->֫(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v30, v10

    const-string v10, "x86"

    .line 212
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0xe

    goto :goto_6

    :cond_a
    const-string v10, "arm"

    .line 214
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x10

    if-ne v0, v10, :cond_b

    const/4 v10, 0x2

    :goto_6
    move-object/from16 p3, v11

    move/from16 v31, v12

    int-to-long v11, v14

    move/from16 v33, v0

    move-object/from16 v32, v1

    int-to-long v0, v10

    add-long/2addr v11, v0

    .line 220
    invoke-static {v5, v6, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    goto :goto_7

    :cond_b
    move/from16 v33, v0

    move-object/from16 v32, v1

    move-object/from16 p3, v11

    move/from16 v31, v12

    move v1, v14

    :goto_7
    const-wide v10, 0x7fffffffffffffffL

    sub-long v34, v10, v3

    int-to-long v10, v1

    cmp-long v0, v34, v10

    if-ltz v0, :cond_22

    .line 273
    new-array v0, v1, [B

    .line 274
    :try_start_1
    new-instance v10, Ljava/io/RandomAccessFile;

    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v12, "r"

    invoke-direct {v10, v11, v12}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 275
    :try_start_2
    invoke-virtual {v10, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 276
    invoke-virtual {v10, v0}, Ljava/io/RandomAccessFile;->readFully([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 278
    :try_start_3
    invoke-virtual {v10}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 85
    iget v10, v13, Ll/ᩴ۟᩻;->᩷:I

    .line 151
    :try_start_4
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v21, v32

    move/from16 v22, v33

    move-wide/from16 v23, v3

    move-object/from16 v25, v0

    move/from16 v26, v10

    .line 123
    invoke-static/range {v21 .. v26}, Ll/ܺܺۢ;->֫(Ljava/lang/String;IJ[BI)Ll/֡ܺۢ;

    move-result-object v10
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    .line 286
    iget-object v11, v10, Ll/֡ܺۢ;->֫:Ljava/lang/String;

    move-object/from16 v12, v32

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_21

    iget v11, v10, Ll/֡ܺۢ;->ۧ:I

    move/from16 v15, v33

    if-ne v15, v11, :cond_21

    .line 293
    iget v11, v10, Ll/֡ܺۢ;->ܽ:I

    if-ltz v11, :cond_20

    if-gt v11, v1, :cond_20

    .line 303
    iget-boolean v15, v10, Ll/֡ܺۢ;->ᩳ:Z

    if-eqz v15, :cond_d

    if-ge v11, v1, :cond_c

    goto :goto_8

    .line 305
    :cond_c
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_d
    :goto_8
    move-wide/from16 v21, v8

    .line 91
    iget v8, v13, Ll/ᩴ۟᩻;->᩷:I

    .line 317
    iget-object v9, v10, Ll/֡ܺۢ;->ܿ:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    if-gt v10, v8, :cond_1f

    .line 320
    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 322
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_13

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 p0, v9

    move-object/from16 v9, v18

    check-cast v9, Ll/᩵ܺۢ;

    move-object/from16 v32, v12

    .line 323
    iget v12, v9, Ll/᩵ܺۢ;->֫:I

    if-lez v12, :cond_12

    sub-int v13, v11, v12

    if-gt v10, v13, :cond_12

    move-wide/from16 v23, v5

    int-to-long v5, v10

    const-wide/16 v16, 0x0

    cmp-long v13, v5, v16

    if-ltz v13, :cond_11

    if-ltz v31, :cond_11

    cmp-long v13, v34, v5

    if-ltz v13, :cond_11

    add-long v39, v3, v5

    if-ltz v10, :cond_10

    if-ltz v12, :cond_10

    sub-int v5, v1, v12

    if-gt v10, v5, :cond_10

    mul-int/lit8 v5, v12, 0x2

    .line 345
    new-array v5, v5, [C

    const/4 v6, 0x0

    :goto_a
    if-ge v6, v12, :cond_e

    add-int v13, v10, v6

    .line 347
    aget-byte v13, v0, v13

    move-object/from16 v25, v0

    and-int/lit16 v0, v13, 0xff

    mul-int/lit8 v18, v6, 0x2

    .line 348
    sget-object v26, Ll/ܳۤۡ;->ۧ:[C

    ushr-int/lit8 v0, v0, 0x4

    aget-char v0, v26, v0

    aput-char v0, v5, v18

    add-int/lit8 v18, v18, 0x1

    and-int/lit8 v0, v13, 0xf

    .line 349
    aget-char v0, v26, v0

    aput-char v0, v5, v18

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, v25

    goto :goto_a

    :cond_e
    move-object/from16 v25, v0

    .line 351
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    .line 328
    iget-object v5, v9, Ll/᩵ܺۢ;->ۧ:Ljava/lang/String;

    .line 594
    new-instance v6, Ll/᩶֫ۜ;

    if-nez v5, :cond_f

    const-string v5, ""

    move/from16 v26, v1

    move-object/from16 v41, v5

    goto :goto_b

    :cond_f
    const/16 v13, 0xd

    move/from16 v26, v1

    const/16 v1, 0x20

    .line 1695
    invoke-virtual {v5, v13, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    const/16 v13, 0xa

    invoke-virtual {v5, v13, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v41, v1

    :goto_b
    move-object/from16 v36, v6

    move-object/from16 v37, v0

    move/from16 v38, v12

    .line 594
    invoke-direct/range {v36 .. v41}, Ll/᩶֫ۜ;-><init>(Ljava/lang/String;IJLjava/lang/String;)V

    .line 327
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    iget v0, v9, Ll/᩵ܺۢ;->֫:I

    add-int/2addr v10, v0

    move-object/from16 v9, p0

    move-object/from16 v13, p2

    move-wide/from16 v5, v23

    move-object/from16 v0, v25

    move/from16 v1, v26

    move-object/from16 v12, v32

    goto/16 :goto_9

    .line 342
    :cond_10
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 356
    :cond_11
    invoke-static {}, Ll/۫֫ۜ;->ܿ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 324
    :cond_12
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_13
    move-wide/from16 v23, v5

    move-object/from16 v32, v12

    if-ne v10, v11, :cond_1e

    .line 230
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    if-eqz v15, :cond_14

    if-ge v11, v14, :cond_14

    const/4 v0, 0x1

    goto :goto_c

    :cond_14
    const/4 v0, 0x0

    .line 234
    :goto_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v10, 0x0

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩶֫ۜ;

    if-lt v10, v14, :cond_15

    goto :goto_e

    .line 238
    :cond_15
    iget v6, v5, Ll/᩶֫ۜ;->ܽ:I

    sub-int v8, v14, v10

    if-le v6, v8, :cond_16

    const/4 v0, 0x1

    const/4 v11, 0x1

    goto :goto_f

    .line 242
    :cond_16
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    iget v5, v5, Ll/᩶֫ۜ;->ܽ:I

    add-int/2addr v10, v5

    goto :goto_d

    :cond_17
    :goto_e
    move v11, v0

    :goto_f
    if-nez v2, :cond_18

    move-object v13, v7

    move-object/from16 p0, v12

    goto :goto_11

    :cond_18
    int-to-long v0, v10

    .line 254
    invoke-static {v3, v4, v0, v1}, Ll/۬۟᩻;->֫(JJ)J

    move-result-wide v0

    .line 262
    iget-object v2, v7, Ll/۬֫ۜ;->ܿ:Ljava/lang/String;

    iget-object v5, v7, Ll/۬֫ۜ;->ۧ:Ljava/lang/String;

    iget-wide v8, v7, Ll/۬֫ۜ;->᩷:J

    move-object/from16 p0, v12

    iget-wide v12, v7, Ll/۬֫ۜ;->ܳ:J

    iget-wide v6, v7, Ll/۬֫ۜ;->ۜ:J

    const-string v38, ""

    const-wide/16 v41, -0x1

    move-object/from16 v36, v2

    move-object/from16 v37, v5

    move-wide/from16 v39, v8

    move-wide/from16 v43, v12

    move-wide/from16 v45, v6

    .line 127
    invoke-static/range {v36 .. v46}, Ll/ۖܺۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJ)Ll/ۖܺۢ;

    move-result-object v2

    cmp-long v5, v0, v28

    if-nez v5, :cond_19

    const/4 v0, 0x1

    goto :goto_10

    :cond_19
    const/4 v0, 0x0

    :goto_10
    move-wide/from16 v5, v28

    .line 255
    invoke-static {v2, v5, v6, v0}, Ll/۬֫ۜ;->֫(Ll/ۖܺۢ;JZ)Ll/۬֫ۜ;

    move-result-object v0

    move-object v13, v0

    :goto_11
    if-nez v11, :cond_1a

    if-lez v10, :cond_1a

    int-to-long v0, v10

    cmp-long v2, v0, v23

    if-gez v2, :cond_1a

    const/4 v0, 0x1

    const/4 v15, 0x1

    goto :goto_12

    :cond_1a
    const/4 v0, 0x0

    const/4 v15, 0x0

    .line 101
    :goto_12
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    if-eqz v15, :cond_1d

    if-eqz v27, :cond_1b

    move-wide v8, v3

    goto :goto_13

    :cond_1b
    move-wide/from16 v8, v21

    :goto_13
    int-to-long v0, v10

    const-wide/16 v5, 0x0

    cmp-long v2, v0, v5

    if-ltz v2, :cond_1c

    cmp-long v2, v8, v5

    if-ltz v2, :cond_1c

    const-wide v5, 0x7fffffffffffffffL

    sub-long/2addr v5, v8

    cmp-long v2, v5, v0

    if-ltz v2, :cond_1c

    add-long/2addr v8, v0

    .line 107
    invoke-static/range {v19 .. v19}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 108
    invoke-static {v8, v9}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    .line 109
    invoke-static/range {p3 .. p3}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    move-object/from16 v16, v0

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    goto :goto_14

    .line 356
    :cond_1c
    invoke-static {}, Ll/۫֫ۜ;->ܿ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1d
    move-object/from16 v16, v0

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    :goto_14
    move-object/from16 v0, v30

    .line 138
    iget v6, v0, Ll/ۨ۟᩻;->֫:I

    move-object/from16 v1, p3

    .line 112
    invoke-virtual {v0, v1}, Ll/ۨ۟᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 113
    invoke-virtual {v0, v1}, Ll/ۨ۟᩻;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v0, p2

    move-object/from16 v5, v32

    move-wide v2, v3

    move-object/from16 v4, v20

    move v9, v14

    move-object/from16 v12, p0

    move v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    .line 111
    invoke-static/range {v0 .. v17}, Ll/۫֫ۜ;->֫(Ll/ᩴ۟᩻;Ljava/lang/String;JLl/ۘܺۢ;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIZLjava/util/List;Ll/۬֫ۜ;ZLbin/mt/json/JSONValue;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 332
    :cond_1e
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 318
    :cond_1f
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 295
    :cond_20
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 287
    :cond_21
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_0
    move-object/from16 v0, p1

    move-object/from16 v1, v18

    .line 369
    invoke-static {v1, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 153
    throw v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 274
    :try_start_5
    invoke-virtual {v10}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_15

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_15
    throw v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1

    :catch_1
    const-string v0, "ENTRY_READ_FAILED"

    const-string v1, "Failed to read native byte window."

    .line 279
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 82
    :cond_22
    invoke-static {}, Ll/۫֫ۜ;->ܿ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 201
    :cond_23
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 166
    :cond_24
    invoke-static {}, Ll/۫֫ۜ;->ܿ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 188
    :cond_25
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_26
    const-string v0, "NATIVE_ADDRESS_NOT_EXECUTABLE"

    const-string v1, "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable."

    .line 48
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_27
    const-string v0, "NATIVE_ADDRESS_NOT_MAPPED"

    const-string v1, "Native address is not mapped in the ELF file."

    .line 44
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_2
    move-object v0, v14

    move-object v1, v15

    .line 369
    invoke-static {v1, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 143
    throw v0
.end method
