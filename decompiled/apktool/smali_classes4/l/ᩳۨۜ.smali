.class public final Ll/ᩳۨۜ;
.super Ljava/lang/Object;
.source "B6MB"


# direct methods
.method public static ֫(F)I
    .locals 2

    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    .line 541
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x49742400    # 1000000.0f

    cmpl-float v0, p0, v0

    if-gtz v0, :cond_0

    float-to-double v0, p0

    .line 543
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p0, v0

    const/4 v0, 0x1

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    .line 542
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Image has no finite dimensions"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(I[B)I
    .locals 1

    .line 575
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 p0, p0, 0x1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x8

    or-int/2addr p0, v0

    return p0
.end method

.method public static synthetic ֫(Ll/ۢ᩺ۜ;Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Landroid/graphics/BitmapFactory$Options;
    .locals 0

    .line 70
    invoke-static {p0}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 71
    invoke-static {p1, p2}, Ll/ۙۨۜ;->ۧ(Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Landroid/graphics/BitmapFactory$Options;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩺ۨۜ;Ll/ۨۨۜ;Ll/ۤۛۜ;Ll/᩶ۛۜ;JLl/ۡ᩺ۜ;)Ll/ܰۛۜ;
    .locals 47

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    .line 240
    iget-object v2, v0, Ll/ۤۛۜ;->᩸:[B

    const-string v3, "opacity"

    .line 314
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v4

    const-string v5, "http://xmlpull.org/v1/doc/features.html#process-docdecl"

    const/4 v6, 0x0

    .line 315
    invoke-interface {v4, v5, v6}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    const-string v5, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v7, 0x1

    .line 316
    invoke-interface {v4, v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 317
    new-instance v5, Ljava/io/ByteArrayInputStream;

    iget v0, v0, Ll/ۤۛۜ;->᩶:I

    invoke-direct {v5, v2, v6, v0}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    const/4 v8, 0x0

    invoke-interface {v4, v5, v8}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 319
    new-instance v9, Ll/۟ۛۜ;

    invoke-direct {v9, v6}, Ll/۟ۛۜ;-><init>(I)V

    .line 320
    new-instance v5, Ljava/util/ArrayDeque;

    invoke-direct {v5}, Ljava/util/ArrayDeque;-><init>()V

    .line 321
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 325
    invoke-virtual {v5, v9}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 326
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v8

    const-wide/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-wide/from16 v20, v17

    move-wide/from16 v22, v20

    move-wide/from16 v24, v22

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x1

    :goto_0
    const/4 v11, 0x2

    if-eq v8, v7, :cond_41

    .line 327
    invoke-static/range {p6 .. p6}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    const/16 v7, 0xa

    if-ne v8, v7, :cond_1

    .line 329
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v7

    const-string v14, "<!ENTITY"

    invoke-virtual {v7, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    .line 330
    :cond_0
    new-instance v0, Ll/֫ۨۜ;

    const-string v1, "SVG entity declarations are not supported"

    .line 438
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 330
    throw v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_8

    :cond_1
    :goto_1
    const-wide/32 v26, 0x100000

    if-ne v8, v11, :cond_3a

    const-string v7, "http://www.w3.org/2000/svg"

    if-nez v15, :cond_3

    .line 334
    :try_start_1
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v8

    const-string v11, "svg"

    .line 335
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_3

    .line 336
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    .line 337
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Image XML root is not SVG"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    add-int/lit8 v15, v15, 0x1

    const/16 v8, 0x2000

    if-gt v15, v8, :cond_39

    add-int/lit8 v12, v12, 0x1

    const/16 v8, 0x40

    if-gt v12, v8, :cond_39

    .line 340
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    .line 341
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_5

    .line 342
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_5

    .line 343
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    const/4 v7, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v7, 0x1

    :goto_4
    if-nez v13, :cond_38

    if-eqz v7, :cond_6

    .line 345
    invoke-static {v8}, Ll/۬֨ܺ;->ܽ(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_6

    goto/16 :goto_1a

    :cond_6
    if-nez v7, :cond_7

    .line 349
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۟ۛۜ;

    invoke-virtual {v5, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    move/from16 v29, v0

    move-object/from16 v30, v2

    move-object/from16 v31, v5

    move-object/from16 v32, v9

    goto/16 :goto_1d

    :cond_7
    const-string v7, "image"

    .line 350
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_37

    .line 352
    new-instance v7, Ll/۟ۛۜ;

    invoke-direct {v7, v6}, Ll/۟ۛۜ;-><init>(I)V

    iget-object v6, v7, Ll/۟ۛۜ;->ܳ:Ljava/util/ArrayList;

    const-string v11, "defs"

    .line 353
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_8

    const-string v14, "radialGradient"

    move/from16 p2, v12

    const-string v12, "linearGradient"

    move/from16 v28, v15

    const-string v15, "pattern"

    move/from16 v29, v0

    const-string v0, "mask"

    if-nez v11, :cond_9

    :try_start_2
    const-string v11, "symbol"

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    const-string v11, "marker"

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    const-string v11, "clipPath"

    .line 354
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    const-string v11, "view"

    .line 355
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    goto :goto_5

    :cond_8
    const/4 v11, 0x0

    goto :goto_6

    :cond_9
    :goto_5
    const/4 v11, 0x1

    :goto_6
    iput-boolean v11, v7, Ll/۟ۛۜ;->ܽ:Z

    const-string v11, "title"

    .line 356
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_8

    move-object/from16 v30, v2

    const-string v2, "style"

    if-nez v11, :cond_b

    :try_start_3
    const-string v11, "desc"

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_7

    :cond_a
    const/4 v11, 0x0

    goto :goto_8

    :cond_b
    :goto_7
    const/4 v11, 0x1

    .line 358
    :goto_8
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_c

    const/16 v16, 0x1

    .line 359
    :cond_c
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v31
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_8

    const-string v1, "filter"

    if-nez v31, :cond_d

    :try_start_4
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v31

    if-nez v31, :cond_d

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v31

    if-nez v31, :cond_d

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_e

    :cond_d
    const/16 v19, 0x0

    .line 361
    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v31

    move-object/from16 v32, v9

    move-object/from16 v9, v31

    check-cast v9, Ll/۟ۛۜ;

    iget-object v9, v9, Ll/۟ۛۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    invoke-virtual {v5, v7}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    const/4 v9, 0x0

    const/16 v31, 0x0

    move-object/from16 v31, v5

    move-object/from16 v33, v6

    move/from16 v34, v13

    move-wide/from16 v5, v24

    const/16 v24, 0x0

    .line 363
    :goto_9
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v13

    if-ge v9, v13, :cond_36

    .line 364
    invoke-interface {v4, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v4, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v25

    move-object/from16 v35, v15

    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v36, v10

    move/from16 v37, v11

    .line 365
    iget-wide v10, v7, Ll/۟ۛۜ;->֫:J

    move-object/from16 v38, v14

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v14

    move-object/from16 v39, v8

    move/from16 v25, v9

    int-to-long v8, v14

    add-long/2addr v10, v8

    iput-wide v10, v7, Ll/۟ۛۜ;->֫:J

    .line 366
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v8

    int-to-long v8, v8

    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    const-string v8, "d"

    .line 367
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    const-string v8, "points"

    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    goto :goto_a

    .line 372
    :cond_f
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v8

    int-to-long v8, v8

    add-long v22, v22, v8

    move-wide/from16 v44, v5

    goto/16 :goto_f

    :cond_10
    :goto_a
    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide/from16 v40, v17

    .line 451
    :goto_b
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v8, v11, :cond_1f

    .line 452
    invoke-virtual {v15, v8}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v14, 0x30

    const-wide/16 v42, 0x1

    move-wide/from16 v44, v5

    const/16 v5, 0x2e

    if-lt v11, v14, :cond_11

    const/16 v6, 0x39

    if-le v11, v6, :cond_12

    :cond_11
    if-ne v11, v5, :cond_15

    :cond_12
    if-eqz v9, :cond_13

    if-ne v11, v5, :cond_14

    if-eqz v10, :cond_14

    :cond_13
    add-long v40, v40, v42

    :cond_14
    if-ne v11, v5, :cond_1e

    const/4 v10, 0x1

    goto :goto_d

    :cond_15
    const/16 v5, 0x2d

    const/16 v6, 0x65

    if-eq v11, v5, :cond_1c

    const/16 v5, 0x2b

    if-ne v11, v5, :cond_16

    goto :goto_c

    :cond_16
    if-eq v11, v6, :cond_17

    const/16 v5, 0x45

    if-ne v11, v5, :cond_18

    :cond_17
    if-eqz v9, :cond_18

    goto :goto_e

    :cond_18
    const/16 v5, 0x41

    if-lt v11, v5, :cond_19

    const/16 v5, 0x5a

    if-le v11, v5, :cond_1a

    :cond_19
    const/16 v5, 0x61

    if-lt v11, v5, :cond_1b

    const/16 v5, 0x7a

    if-gt v11, v5, :cond_1b

    :cond_1a
    add-long v40, v40, v42

    :cond_1b
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    goto :goto_e

    :cond_1c
    :goto_c
    if-eqz v8, :cond_1d

    add-int/lit8 v5, v8, -0x1

    .line 458
    invoke-virtual {v15, v5}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v9, v6, :cond_1e

    invoke-virtual {v15, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x45

    if-eq v5, v6, :cond_1e

    :cond_1d
    add-long v40, v40, v42

    const/4 v10, 0x0

    :cond_1e
    :goto_d
    const/4 v5, 0x1

    const/4 v9, 0x1

    :goto_e
    add-int/lit8 v8, v8, 0x1

    move-wide/from16 v5, v44

    goto :goto_b

    :cond_1f
    move-wide/from16 v44, v5

    add-long v20, v20, v40

    .line 370
    iget-wide v5, v7, Ll/۟ۛۜ;->ᩳ:J

    add-long v5, v5, v40

    iput-wide v5, v7, Ll/۟ۛۜ;->ᩳ:J

    :goto_f
    const-wide/32 v5, 0x40000

    cmp-long v8, v20, v5

    if-gtz v8, :cond_35

    cmp-long v5, v22, v26

    if-gtz v5, :cond_35

    .line 375
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-static {v15}, Ll/۬֨ܺ;->ᩳ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_20

    .line 376
    iget v5, v7, Ll/۟ۛۜ;->ܿ:I

    const/4 v6, 0x1

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, v7, Ll/۟ۛۜ;->ܿ:I

    .line 377
    :cond_20
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    const-string v5, "none"

    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_21

    const/4 v5, 0x3

    iput v5, v7, Ll/۟ۛۜ;->ܿ:I

    .line 379
    :cond_21
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_23

    invoke-virtual {v15, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_22

    invoke-virtual {v15, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_23

    :cond_22
    const/4 v5, 0x1

    const/16 v16, 0x1

    .line 380
    :cond_23
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_25

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_25

    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_25

    .line 381
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_24

    invoke-virtual {v15, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_25

    invoke-virtual {v15, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_25

    invoke-virtual {v15, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_24

    goto :goto_10

    :cond_24
    move/from16 v9, v25

    goto :goto_11

    :cond_25
    :goto_10
    const/4 v5, 0x0

    move/from16 v9, v25

    const/16 v19, 0x0

    .line 383
    :goto_11
    invoke-interface {v4, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object v5

    .line 384
    invoke-interface {v4, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v6
    :try_end_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_8

    if-nez v37, :cond_29

    if-nez v24, :cond_29

    const-string v8, "xml"

    if-eqz v5, :cond_26

    .line 385
    :try_start_5
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_26

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_29

    :cond_26
    const-string v10, "id"

    .line 386
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_27

    move-object/from16 v10, v36

    .line 388
    invoke-virtual {v10, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_28

    invoke-virtual {v10, v15, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :cond_27
    move-object/from16 v10, v36

    .line 390
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2a

    const-string v5, "space"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2a

    :cond_28
    :goto_12
    const/4 v5, 0x1

    const/16 v24, 0x1

    goto :goto_13

    :cond_29
    move-object/from16 v10, v36

    :cond_2a
    :goto_13
    const-string v5, "href"

    .line 392
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_5
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_8

    const-string v8, "SVG external resources are not supported"

    const-string v11, "#"

    if-eqz v5, :cond_31

    :try_start_6
    const-string v5, "use"

    move-object/from16 v14, v39

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    const-string v5, "tref"

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    const-string v5, "textPath"

    .line 393
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    move-object/from16 v5, v38

    .line 394
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25

    if-nez v25, :cond_2c

    move-object/from16 v36, v0

    move-object/from16 v0, v35

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_2b

    goto :goto_14

    :cond_2b
    move-object/from16 v35, v0

    goto :goto_15

    :cond_2c
    move-object/from16 v36, v0

    move-object/from16 v0, v35

    goto :goto_14

    :cond_2d
    move-object/from16 v36, v0

    move-object/from16 v0, v35

    move-object/from16 v5, v38

    :goto_14
    if-eqz v6, :cond_2f

    .line 395
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v25

    if-nez v25, :cond_2f

    move-object/from16 v35, v0

    const-string v0, "http://www.w3.org/1999/xlink"

    .line 396
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    goto :goto_16

    :cond_2e
    :goto_15
    move-object/from16 v6, v33

    goto :goto_17

    :cond_2f
    move-object/from16 v35, v0

    .line 397
    :goto_16
    invoke-static {v15}, Ll/۬֨ܺ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 398
    invoke-virtual {v0, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_30

    const/4 v6, 0x1

    .line 399
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v6, v33

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    .line 398
    :cond_30
    new-instance v0, Ll/֫ۨۜ;

    .line 438
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 398
    throw v0

    :cond_31
    move-object/from16 v36, v0

    move-object/from16 v6, v33

    move-object/from16 v5, v38

    move-object/from16 v14, v39

    :goto_17
    if-eqz v37, :cond_32

    goto :goto_19

    .line 404
    :cond_32
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 405
    invoke-static {v13, v15, v6}, Ll/۬֨ܺ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 406
    :goto_18
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v0, v13, :cond_34

    .line 407
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 408
    invoke-virtual {v13, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_33

    const/4 v15, 0x1

    .line 409
    invoke-virtual {v13, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v0, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_18

    .line 408
    :cond_33
    new-instance v0, Ll/֫ۨۜ;

    .line 438
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 408
    throw v0

    :cond_34
    :goto_19
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v33, v6

    move-object v8, v14

    move-object/from16 v15, v35

    move-object/from16 v0, v36

    move/from16 v11, v37

    move-object v14, v5

    move-wide/from16 v5, v44

    goto/16 :goto_9

    .line 374
    :cond_35
    new-instance v0, Ll/ۨۛۜ;

    const-string v1, "SVG data exceeds safe parse limits"

    .line 443
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 374
    throw v0

    :cond_36
    move-wide/from16 v24, v5

    move/from16 v13, v34

    goto :goto_1b

    .line 351
    :cond_37
    new-instance v0, Ll/֫ۨۜ;

    const-string v1, "SVG embedded images are not supported"

    .line 438
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 351
    throw v0

    :cond_38
    :goto_1a
    move/from16 v29, v0

    move-object/from16 v30, v2

    move-object/from16 v31, v5

    move-object/from16 v32, v9

    move/from16 p2, v12

    move/from16 v34, v13

    move/from16 v28, v15

    add-int/lit8 v13, v34, 0x1

    :goto_1b
    move/from16 v12, p2

    move/from16 v15, v28

    goto :goto_1d

    .line 339
    :cond_39
    new-instance v0, Ll/ۨۛۜ;

    const-string v1, "SVG structure exceeds safe render limits"

    .line 443
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 339
    throw v0

    :cond_3a
    move/from16 v29, v0

    move-object/from16 v30, v2

    move-object/from16 v31, v5

    move-object/from16 v32, v9

    move/from16 v34, v13

    const/4 v0, 0x3

    if-ne v8, v0, :cond_3c

    add-int/lit8 v12, v12, -0x1

    if-lez v34, :cond_3b

    add-int/lit8 v13, v34, -0x1

    goto :goto_1d

    .line 414
    :cond_3b
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_1c

    :cond_3c
    if-nez v34, :cond_40

    if-lez v15, :cond_40

    const/4 v0, 0x4

    if-eq v8, v0, :cond_3d

    const/4 v0, 0x5

    if-ne v8, v0, :cond_40

    .line 417
    :cond_3d
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۛۜ;

    iget-wide v1, v0, Ll/۟ۛۜ;->֫:J

    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v1, v5

    iput-wide v1, v0, Ll/۟ۛۜ;->֫:J

    .line 418
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->isWhitespace()Z

    move-result v0

    if-nez v0, :cond_3e

    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    add-long v22, v22, v0

    :cond_3e
    cmp-long v0, v22, v26

    if-gtz v0, :cond_3f

    goto :goto_1c

    .line 419
    :cond_3f
    new-instance v0, Ll/ۨۛۜ;

    const-string v1, "SVG text exceeds safe parse limits"

    .line 443
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 419
    throw v0

    :cond_40
    :goto_1c
    move/from16 v13, v34

    .line 326
    :goto_1d
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    move-result v8

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p3

    move/from16 v0, v29

    move-object/from16 v2, v30

    move-object/from16 v5, v31

    move-object/from16 v9, v32

    goto/16 :goto_0

    :cond_41
    move/from16 v29, v0

    move-object/from16 v30, v2

    move-object/from16 v32, v9

    const/4 v0, 0x0

    if-eqz v15, :cond_57

    const/4 v1, 0x5

    new-array v1, v1, [J

    .line 424
    fill-array-data v1, :array_0

    .line 425
    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    const/4 v2, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x3

    move-object/from16 v9, v32

    move-object v12, v1

    move v4, v15

    move/from16 v15, v16

    move-object/from16 v16, p6

    invoke-static/range {v9 .. v16}, Ll/ᩳۨۜ;->֫(Ll/۟ۛۜ;Ljava/util/HashMap;Ljava/util/HashSet;[JIIZLl/ۡ᩺ۜ;)V

    int-to-long v4, v4

    const-wide/16 v6, 0x200

    mul-long v4, v4, v6

    const-wide/32 v6, 0x10000

    add-long/2addr v4, v6

    const-wide/16 v8, 0x20

    mul-long v20, v20, v8

    add-long v20, v20, v4

    const-wide/16 v4, 0x2

    mul-long v22, v22, v4

    add-long v22, v22, v20

    mul-long v24, v24, v4

    add-long v4, v24, v22

    .line 429
    aget-wide v8, v1, v3

    long-to-int v3, v8

    add-int/lit8 v13, v3, 0x1

    aget-wide v8, v1, v0

    long-to-int v0, v8

    aget-wide v10, v1, v2

    if-eqz v19, :cond_42

    const-wide/16 v14, 0x80

    cmp-long v2, v8, v14

    if-gtz v2, :cond_42

    const/4 v2, 0x1

    aget-wide v8, v1, v2
    :try_end_6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_8

    const-wide/16 v1, 0x10

    cmp-long v12, v8, v1

    if-gtz v12, :cond_42

    const-wide/16 v1, 0x4000

    cmp-long v8, v10, v1

    if-gtz v8, :cond_42

    const/4 v1, 0x1

    goto :goto_1e

    :cond_42
    const/4 v1, 0x0

    :goto_1e
    move-object/from16 v2, p3

    .line 243
    invoke-static {v2, v4, v5}, Ll/ᩳۨۜ;->֫(Ll/᩶ۛۜ;J)Ll/᩹ۛۜ;

    move-result-object v4

    .line 252
    :try_start_7
    new-instance v5, Ljava/io/ByteArrayInputStream;

    const/4 v8, 0x0

    move/from16 v12, v29

    move-object/from16 v9, v30

    invoke-direct {v5, v9, v8, v12}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-static {v5}, Ll/ܽ֨ܺ;->֫(Ljava/io/InputStream;)Ll/ܽ֨ܺ;

    move-result-object v9

    .line 253
    invoke-static/range {p6 .. p6}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 254
    invoke-virtual {v9}, Ll/ܽ֨ܺ;->ܽ()Landroid/graphics/RectF;

    move-result-object v5

    .line 255
    invoke-virtual {v9}, Ll/ܽ֨ܺ;->ᩳ()F

    move-result v12

    invoke-virtual {v9}, Ll/ܽ֨ܺ;->ۧ()F

    move-result v14

    const/4 v15, 0x0

    cmpl-float v16, v12, v15

    if-gtz v16, :cond_43

    if-eqz v5, :cond_43

    .line 256
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v12

    goto :goto_1f

    :catchall_0
    move-exception v0

    goto/16 :goto_2e

    :catch_0
    move-exception v0

    goto/16 :goto_2f

    :cond_43
    :goto_1f
    cmpl-float v16, v14, v15

    if-gtz v16, :cond_44

    if-eqz v5, :cond_44

    .line 257
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v14

    .line 258
    :cond_44
    invoke-static {v12}, Ll/ᩳۨۜ;->֫(F)I

    move-result v12

    invoke-static {v14}, Ll/ᩳۨۜ;->֫(F)I

    move-result v14

    .line 259
    sget-object v8, Ll/᩶ۨۜ;->֫:Ll/᩶ۨۜ;

    invoke-virtual {v8, v12, v14}, Ll/᩶ۨۜ;->֫(II)V

    if-nez v5, :cond_45

    int-to-float v5, v12

    int-to-float v8, v14

    .line 260
    invoke-virtual {v9, v5, v8}, Ll/ܽ֨ܺ;->֫(FF)V

    .line 263
    :cond_45
    invoke-static {v9}, Ll/۬֨ܺ;->֫(Ll/ܽ֨ܺ;)Z

    move-result v5

    if-nez v5, :cond_46

    .line 264
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1c

    if-lt v5, v8, :cond_46

    if-eqz v1, :cond_46

    const/4 v8, 0x1

    goto :goto_20

    :cond_46
    const/4 v8, 0x0

    :goto_20
    if-eqz v8, :cond_47

    const-wide/16 v16, 0x8

    mul-long v10, v10, v16

    add-long/2addr v10, v6

    int-to-long v0, v0

    const-wide/16 v5, 0x100

    mul-long v0, v0, v5

    add-long v17, v0, v10

    :cond_47
    move-wide/from16 v0, v17

    if-eqz v8, :cond_48

    .line 266
    invoke-static {v2, v0, v1}, Ll/ᩳۨۜ;->֫(Ll/᩶ۛۜ;J)Ll/᩹ۛۜ;

    move-result-object v0
    :try_end_7
    .catch Ll/᩵֨ܺ; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_21

    :cond_48
    const/4 v0, 0x0

    :goto_21
    move-object v1, v0

    .line 267
    :try_start_8
    invoke-virtual/range {p3 .. p3}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v5

    invoke-virtual/range {p3 .. p3}, Ll/᩶ۛۜ;->ۧ()J

    move-result-wide v10

    sub-long/2addr v5, v10

    move-wide/from16 v10, p4

    .line 269
    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    const/4 v0, 0x1

    :goto_22
    const v7, 0x8000

    if-gt v0, v7, :cond_4f

    .line 548
    invoke-static {v12, v0}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v10

    const-wide/16 v16, 0x800

    cmp-long v7, v10, v16

    if-gtz v7, :cond_4d

    .line 549
    invoke-static {v14, v0}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v10

    cmp-long v7, v10, v16

    if-gtz v7, :cond_4d

    .line 556
    invoke-static {v12, v14, v0}, Ll/ۙۨۜ;->֫(III)J

    move-result-wide v10

    move/from16 p2, v8

    int-to-long v7, v13

    mul-long v10, v10, v7

    cmp-long v7, v10, v5

    if-gtz v7, :cond_4e

    .line 270
    invoke-static {v12, v0}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v5

    long-to-int v6, v5

    .line 271
    invoke-static {v14, v0}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v7

    long-to-int v0, v7

    int-to-long v7, v6

    int-to-long v10, v0

    mul-long v7, v7, v10

    const-wide/16 v10, 0x4

    mul-long v7, v7, v10

    int-to-long v10, v3

    mul-long v10, v10, v7

    .line 273
    invoke-static {v2, v10, v11}, Ll/ᩳۨۜ;->֫(Ll/᩶ۛۜ;J)Ll/᩹ۛۜ;

    move-result-object v3
    :try_end_8
    .catch Ll/᩵֨ܺ; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 274
    :try_start_9
    invoke-static {v2, v7, v8}, Ll/ᩳۨۜ;->֫(Ll/᩶ۛۜ;J)Ll/᩹ۛۜ;

    move-result-object v2
    :try_end_9
    .catch Ll/᩵֨ܺ; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 275
    :try_start_a
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v0, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5
    :try_end_a
    .catch Ll/᩵֨ܺ; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 276
    :try_start_b
    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    int-to-float v6, v6

    int-to-float v8, v12

    div-float/2addr v6, v8

    int-to-float v0, v0

    int-to-float v10, v14

    div-float/2addr v0, v10

    .line 277
    invoke-virtual {v7, v6, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 278
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, v15, v15, v8, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v9, v7, v0}, Ll/ܽ֨ܺ;->֫(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 279
    invoke-static/range {p6 .. p6}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 280
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v0

    int-to-long v6, v0

    invoke-virtual {v2, v6, v7}, Ll/᩹ۛۜ;->ۧ(J)Z

    move-result v0
    :try_end_b
    .catch Ll/᩵֨ܺ; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    if-eqz v0, :cond_4c

    if-eqz p2, :cond_49

    .line 283
    :try_start_c
    invoke-virtual {v9, v12, v14}, Ll/ܽ֨ܺ;->֫(II)Landroid/graphics/Picture;

    move-result-object v6
    :try_end_c
    .catch Ll/᩵֨ܺ; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 284
    :try_start_d
    invoke-static/range {p6 .. p6}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 285
    new-instance v0, Ll/ܿܰۜ;

    const/4 v9, 0x0

    move-object v8, v0

    move-object v10, v6

    move v11, v12

    move v7, v12

    move v12, v14

    move/from16 v16, v14

    move-object v14, v1

    invoke-direct/range {v8 .. v14}, Ll/ܿܰۜ;-><init>(Ll/ܽ֨ܺ;Landroid/graphics/Picture;IIILl/᩹ۛۜ;)V
    :try_end_d
    .catch Ll/᩵֨ܺ; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    const/4 v1, 0x0

    goto :goto_23

    :catchall_1
    move-exception v0

    const/4 v7, 0x0

    goto/16 :goto_31

    :catch_1
    move-exception v0

    const/4 v7, 0x0

    goto/16 :goto_30

    :catchall_2
    move-exception v0

    const/4 v6, 0x0

    move-object v7, v6

    goto :goto_24

    :catch_2
    move-exception v0

    goto/16 :goto_26

    :cond_49
    move v7, v12

    move/from16 v16, v14

    .line 289
    :try_start_e
    new-instance v0, Ll/ܿܰۜ;

    const/4 v10, 0x0

    move-object v8, v0

    move v11, v7

    move/from16 v12, v16

    move-object v14, v4

    invoke-direct/range {v8 .. v14}, Ll/ܿܰۜ;-><init>(Ll/ܽ֨ܺ;Landroid/graphics/Picture;IIILl/᩹ۛۜ;)V
    :try_end_e
    .catch Ll/᩵֨ܺ; {:try_start_e .. :try_end_e} :catch_4
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    const/4 v4, 0x0

    :goto_23
    move-object v6, v4

    move-object v4, v1

    move-object v1, v0

    .line 292
    :try_start_f
    new-instance v0, Ll/ܰۛۜ;

    const-string v24, "image/svg+xml"

    .line 537
    new-instance v8, Ll/ܶۨۜ;

    invoke-virtual/range {p0 .. p0}, Ll/᩺ۨۜ;->᩻()Ljava/lang/String;

    move-result-object v20

    const/16 v23, 0x1

    move-object/from16 v19, v8

    move/from16 v21, v7

    move/from16 v22, v16

    move-object/from16 v25, p1

    invoke-direct/range {v19 .. v25}, Ll/ܶۨۜ;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ۨۨۜ;)V

    .line 292
    invoke-direct {v0, v8, v5, v2, v1}, Ll/ܰۛۜ;-><init>(Ll/ܶۨۜ;Landroid/graphics/Bitmap;Ll/᩹ۛۜ;Ll/ܿܰۜ;)V
    :try_end_f
    .catch Ll/᩵֨ܺ; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 303
    invoke-virtual {v3}, Ll/᩹ۛۜ;->close()V

    if-eqz v4, :cond_4a

    .line 306
    invoke-virtual {v4}, Ll/᩹ۛۜ;->close()V

    :cond_4a
    if-eqz v6, :cond_4b

    .line 307
    invoke-virtual {v6}, Ll/᩹ۛۜ;->close()V

    :cond_4b
    return-object v0

    :catchall_3
    move-exception v0

    move-object v7, v1

    move-object v1, v4

    move-object v4, v6

    :goto_24
    const/4 v6, 0x0

    goto/16 :goto_31

    :catch_3
    move-exception v0

    move-object/from16 v46, v6

    move-object v6, v1

    move-object v1, v4

    move-object/from16 v4, v46

    goto/16 :goto_2d

    :catchall_4
    move-exception v0

    goto :goto_25

    :catch_4
    move-exception v0

    goto :goto_26

    .line 281
    :cond_4c
    :try_start_10
    new-instance v0, Ll/֨ۨۜ;

    const-string v6, "SVG raster allocation exceeds budget"

    .line 330
    invoke-direct {v0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 281
    throw v0
    :try_end_10
    .catch Ll/᩵֨ܺ; {:try_start_10 .. :try_end_10} :catch_4
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :goto_25
    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v46, v7

    move-object v7, v6

    move-object/from16 v6, v46

    goto/16 :goto_31

    :goto_26
    const/4 v6, 0x0

    goto :goto_2d

    :catchall_5
    move-exception v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    goto :goto_29

    :catch_5
    move-exception v0

    const/4 v5, 0x0

    move-object v6, v5

    goto :goto_2c

    :catchall_6
    move-exception v0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v6, v5

    goto :goto_28

    :catch_6
    move-exception v0

    const/4 v2, 0x0

    goto :goto_2b

    :cond_4d
    move/from16 p2, v8

    :cond_4e
    move v7, v12

    move/from16 v16, v14

    mul-int/lit8 v0, v0, 0x2

    move/from16 v8, p2

    move v12, v7

    move/from16 v14, v16

    goto/16 :goto_22

    :catchall_7
    move-exception v0

    goto :goto_27

    :catch_7
    move-exception v0

    goto :goto_2a

    .line 552
    :cond_4f
    :try_start_11
    new-instance v0, Ll/֨ۨۜ;

    const-string v2, "Animation frames do not fit allocation limit"

    .line 330
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 552
    throw v0
    :try_end_11
    .catch Ll/᩵֨ܺ; {:try_start_11 .. :try_end_11} :catch_7
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :goto_27
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, v3

    move-object v3, v5

    :goto_28
    move-object v5, v2

    const/4 v2, 0x0

    :goto_29
    const/4 v7, 0x0

    move-object/from16 v46, v7

    move-object v7, v5

    move-object/from16 v5, v46

    goto :goto_31

    :goto_2a
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2b
    const/4 v5, 0x0

    move-object v6, v2

    move-object v2, v5

    :goto_2c
    const/4 v5, 0x0

    :goto_2d
    const/4 v7, 0x0

    move-object/from16 v46, v7

    move-object v7, v6

    move-object/from16 v6, v46

    goto :goto_30

    :goto_2e
    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    goto :goto_31

    :goto_2f
    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v46, v7

    move-object v7, v1

    move-object/from16 v1, v46

    .line 299
    :goto_30
    :try_start_12
    new-instance v8, Ljava/io/IOException;

    const-string v9, "SVG could not be parsed"

    invoke-direct {v8, v9, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v8
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    :catchall_8
    move-exception v0

    :goto_31
    if-eqz v5, :cond_50

    .line 301
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    :cond_50
    if-eqz v2, :cond_51

    .line 302
    invoke-virtual {v2}, Ll/᩹ۛۜ;->close()V

    :cond_51
    if-eqz v3, :cond_52

    .line 303
    invoke-virtual {v3}, Ll/᩹ۛۜ;->close()V

    :cond_52
    if-eqz v7, :cond_53

    const/4 v2, 0x0

    .line 104
    invoke-virtual {v7, v2}, Ll/ܿܰۜ;->֫(Ll/᩹ۛۜ;)V

    :cond_53
    if-eqz v6, :cond_54

    const/4 v2, 0x1

    .line 305
    invoke-virtual {v6, v2, v2}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    invoke-virtual {v6}, Landroid/graphics/Picture;->endRecording()V

    :cond_54
    if-eqz v1, :cond_55

    .line 306
    invoke-virtual {v1}, Ll/᩹ۛۜ;->close()V

    :cond_55
    if-eqz v4, :cond_56

    .line 307
    invoke-virtual {v4}, Ll/᩹ۛۜ;->close()V

    .line 308
    :cond_56
    throw v0

    .line 422
    :cond_57
    :try_start_13
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SVG root element is missing"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_13
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_13 .. :try_end_13} :catch_8

    :catch_8
    move-exception v0

    .line 432
    new-instance v1, Ljava/io/IOException;

    const-string v2, "SVG XML could not be parsed"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    nop

    :array_0
    .array-data 8
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public static ֫(Ll/᩺ۨۜ;Ll/᩺ۛۜ;Ll/᩶ۛۜ;JJLl/ۡ᩺ۜ;)Ll/ܰۛۜ;
    .locals 21

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-wide/from16 v1, p3

    .line 83
    invoke-static/range {p7 .. p7}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1d

    cmp-long v5, p5, v3

    if-lez v5, :cond_1d

    .line 85
    iget-object v7, v0, Ll/᩺ۛۜ;->ۧ:Ll/ۨۨۜ;

    .line 86
    invoke-virtual {v8, v7}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    iget-wide v5, v7, Ll/ۨۨۜ;->ܽ:J

    .line 87
    iget-object v0, v0, Ll/᩺ۛۜ;->֫:Ll/ۤ۠ۜ;

    iget-object v0, v0, Ll/ۤ۠ۜ;->ۧ:Ll/۫۠ۜ;

    .line 88
    sget-object v9, Ll/۫۠ۜ;->᩶:Ll/۫۠ۜ;

    const/4 v15, 0x0

    if-eq v0, v9, :cond_1c

    sget-object v9, Ll/۫۠ۜ;->۬:Ll/۫۠ۜ;

    if-eq v0, v9, :cond_1c

    sget-object v9, Ll/۫۠ۜ;->۫:Ll/۫۠ۜ;

    if-eq v0, v9, :cond_1c

    sget-object v9, Ll/۫۠ۜ;->᩹:Ll/۫۠ۜ;

    const/16 v10, 0x1c

    if-ne v0, v9, :cond_0

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v11, v10, :cond_0

    goto/16 :goto_11

    .line 90
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v11

    invoke-static {v1, v2, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    .line 91
    sget-object v1, Ll/۫۠ۜ;->ۙ:Ll/۫۠ۜ;

    if-ne v0, v1, :cond_9

    .line 58
    invoke-virtual/range {p0 .. p0}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v10, v8

    goto :goto_0

    .line 108
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v1

    .line 109
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "file:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 110
    new-instance v3, Ll/۬ۨۜ;

    invoke-direct {v3, v1, v2}, Ll/۬ۨۜ;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v10, v3

    :goto_0
    if-nez v0, :cond_2

    move-object v11, v7

    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {v10}, Ll/᩺ۨۜ;->᩵()Ll/ۨۨۜ;

    move-result-object v0

    move-object v11, v0

    .line 61
    :goto_1
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v0, Ll/ۡۨۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 63
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 65
    new-instance v3, Ljava/util/concurrent/FutureTask;

    new-instance v0, Ll/ܺۨۜ;

    move-object v9, v0

    move-object/from16 v12, p2

    move-wide/from16 v13, p5

    move-object v4, v15

    move-object/from16 v15, p7

    move-object/from16 v16, v1

    invoke-direct/range {v9 .. v16}, Ll/ܺۨۜ;-><init>(Ll/᩺ۨۜ;Ll/ۨۨۜ;Ll/᩶ۛۜ;JLl/ۡ᩺ۜ;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V

    invoke-direct {v3, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 66
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 72
    :goto_2
    :try_start_0
    invoke-virtual {v3}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ll/ۚۨۜ;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_c
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :try_start_1
    invoke-virtual {v8, v7}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 76
    invoke-static/range {p7 .. p7}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_3

    .line 97
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 93
    :cond_3
    new-instance v0, Ll/ܰۛۜ;

    iget v1, v9, Ll/ۚۨۜ;->ܽ֫:I

    iget v2, v9, Ll/ۚۨۜ;->ۤ:I

    .line 537
    new-instance v3, Ll/ܶۨۜ;

    invoke-virtual/range {p0 .. p0}, Ll/᩺ۨۜ;->᩻()Ljava/lang/String;

    move-result-object v4

    const-string v5, "image/gif"

    const/4 v6, 0x1

    move-object/from16 p0, v3

    move-object/from16 p1, v4

    move/from16 p2, v1

    move/from16 p3, v2

    move/from16 p4, v6

    move-object/from16 p5, v5

    move-object/from16 p6, v7

    invoke-direct/range {p0 .. p6}, Ll/ܶۨۜ;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ۨۨۜ;)V

    .line 93
    invoke-direct {v0, v3, v9}, Ll/ܰۛۜ;-><init>(Ll/ܶۨۜ;Ll/֨ۛۜ;)V

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    .line 235
    :goto_3
    :try_start_2
    invoke-virtual {v9, v4}, Ll/ۚۨۜ;->֫(Ll/᩹ۛۜ;)V

    .line 80
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_a
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_4
    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_7

    :catch_5
    move-exception v0

    goto :goto_6

    :catch_6
    move-exception v0

    goto :goto_6

    :catch_7
    move-exception v0

    goto :goto_6

    :catch_8
    move-exception v0

    move v2, v5

    .line 85
    :goto_4
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 86
    instance-of v3, v0, Ljava/io/IOException;

    if-nez v3, :cond_6

    .line 87
    instance-of v3, v0, Ljava/lang/RuntimeException;

    if-nez v3, :cond_5

    .line 88
    instance-of v3, v0, Ljava/lang/Error;

    if-eqz v3, :cond_4

    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 89
    :cond_4
    new-instance v3, Ljava/io/IOException;

    const-string v4, "GIF worker failed"

    invoke-direct {v3, v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 87
    :cond_5
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 86
    :cond_6
    check-cast v0, Ljava/io/IOException;

    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_a
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_9
    move-exception v0

    goto :goto_5

    :catch_a
    move-exception v0

    goto :goto_5

    :catch_b
    move-exception v0

    :goto_5
    move v5, v2

    :goto_6
    if-nez v5, :cond_7

    .line 93
    :try_start_4
    invoke-virtual {v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V

    .line 94
    :cond_7
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_7
    if-eqz v6, :cond_8

    .line 97
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 98
    :cond_8
    throw v0

    :catch_c
    :goto_8
    const/4 v6, 0x1

    goto/16 :goto_2

    :cond_9
    if-ne v0, v9, :cond_a

    .line 95
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v10, :cond_a

    move-object/from16 v1, p0

    move-object v2, v7

    move-object/from16 v3, p2

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    .line 96
    invoke-static/range {v1 .. v6}, Ll/ۤܰۜ;->֫(Ll/᩺ۨۜ;Ll/ۨۨۜ;Ll/᩶ۛۜ;JLl/ۡ᩺ۜ;)Ll/ۤܰۜ;

    move-result-object v0

    .line 98
    new-instance v1, Ll/ܰۛۜ;

    new-instance v2, Ll/ܶۨۜ;

    invoke-virtual/range {p0 .. p0}, Ll/᩺ۨۜ;->᩻()Ljava/lang/String;

    move-result-object v3

    iget v4, v0, Ll/ۤܰۜ;->᩵֫:I

    iget v5, v0, Ll/ۤܰۜ;->֫֫:I

    iget v6, v0, Ll/ۤܰۜ;->᩷֫:I

    const-string v8, "image/webp"

    move-object/from16 p0, v2

    move-object/from16 p1, v3

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move-object/from16 p5, v8

    move-object/from16 p6, v7

    invoke-direct/range {p0 .. p6}, Ll/ܶۨۜ;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ۨۨۜ;)V

    invoke-direct {v1, v2, v0}, Ll/ܰۛۜ;-><init>(Ll/ܶۨۜ;Ll/֨ۛۜ;)V

    return-object v1

    .line 121
    :cond_a
    invoke-virtual/range {p2 .. p2}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v0

    const-wide/16 v9, 0x2

    .line 122
    div-long v13, v0, v9

    const-wide/32 v9, 0x800000

    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    cmp-long v2, v5, v3

    if-ltz v2, :cond_b

    goto :goto_9

    :cond_b
    const-wide/32 v5, 0x8000

    .line 123
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    :goto_9
    cmp-long v15, v5, v3

    if-lez v15, :cond_1b

    const-string v3, "Special image input exceeds byte limit"

    cmp-long v4, v5, v9

    if-gtz v4, :cond_1a

    cmp-long v4, v5, v0

    if-gez v4, :cond_19

    move-object/from16 v4, p2

    .line 128
    invoke-static {v4, v5, v6}, Ll/ᩳۨۜ;->֫(Ll/᩶ۛۜ;J)Ll/᩹ۛۜ;

    move-result-object v9

    long-to-int v6, v5

    .line 130
    :try_start_5
    new-array v5, v6, [B

    .line 132
    invoke-virtual {v8, v7}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 133
    invoke-virtual/range {p0 .. p0}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    const/4 v10, 0x0

    move-object v15, v4

    .line 135
    :goto_a
    :try_start_6
    invoke-static/range {p7 .. p7}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 136
    array-length v4, v5

    if-ne v10, v4, :cond_11

    .line 137
    invoke-virtual {v6}, Ljava/io/InputStream;->read()I

    move-result v4

    if-gez v4, :cond_c

    move-wide/from16 v16, v11

    move-object v11, v7

    goto/16 :goto_b

    :cond_c
    if-gez v2, :cond_10

    move/from16 p1, v2

    .line 140
    array-length v2, v5

    move-wide/from16 v16, v11

    const/high16 v11, 0x800000

    if-ge v2, v11, :cond_f

    .line 141
    array-length v2, v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    int-to-long v11, v2

    const-string v2, "Input growth exceeds allocation limit"

    cmp-long v18, v11, v13

    if-gez v18, :cond_e

    .line 143
    :try_start_7
    array-length v11, v5

    int-to-long v11, v11

    const-wide/16 v18, 0x2

    mul-long v11, v11, v18

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    long-to-int v12, v11

    .line 144
    array-length v11, v5

    move-wide/from16 p3, v13

    int-to-long v13, v11

    move-object v11, v7

    int-to-long v7, v12

    add-long/2addr v13, v7

    cmp-long v20, v13, v0

    if-gtz v20, :cond_d

    .line 146
    invoke-static {v15, v7, v8}, Ll/ᩳۨۜ;->֫(Ll/᩶ۛۜ;J)Ll/᩹ۛۜ;

    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 148
    :try_start_8
    new-array v7, v12, [B

    const/4 v8, 0x0

    .line 149
    invoke-static {v5, v8, v7, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v5, v10, 0x1

    int-to-byte v4, v4

    .line 150
    aput-byte v4, v7, v10

    .line 152
    invoke-virtual {v9}, Ll/᩹ۛۜ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object/from16 v8, p0

    move-object v9, v2

    move v10, v5

    move-object v5, v7

    move-object v12, v11

    goto/16 :goto_f

    :catchall_1
    move-exception v0

    .line 156
    :try_start_9
    invoke-virtual {v2}, Ll/᩹ۛۜ;->close()V

    .line 157
    throw v0

    .line 145
    :cond_d
    new-instance v0, Ll/֨ۨۜ;

    .line 330
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 145
    throw v0

    .line 142
    :cond_e
    new-instance v0, Ll/֨ۨۜ;

    .line 330
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 142
    throw v0

    .line 140
    :cond_f
    new-instance v0, Ll/ۨۛۜ;

    .line 443
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 140
    throw v0

    .line 139
    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Special image input size changed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    move/from16 p1, v2

    move-wide/from16 v16, v11

    move-wide/from16 p3, v13

    const-wide/16 v18, 0x2

    move-object v11, v7

    .line 159
    array-length v2, v5

    sub-int/2addr v2, v10

    invoke-virtual {v6, v5, v10, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-gez v2, :cond_12

    goto :goto_b

    :cond_12
    if-nez v2, :cond_16

    .line 162
    invoke-virtual {v6}, Ljava/io/InputStream;->read()I

    move-result v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    if-gez v2, :cond_15

    :goto_b
    if-eqz v6, :cond_13

    .line 168
    :try_start_a
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    :cond_13
    move-object/from16 v8, p0

    move-object v7, v11

    .line 169
    invoke-virtual {v8, v7}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 170
    new-instance v11, Ll/ۤۛۜ;

    invoke-direct {v11, v5, v10, v9}, Ll/ۤۛۜ;-><init>([BILl/᩹ۛۜ;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 105
    :try_start_b
    invoke-static/range {p7 .. p7}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    move-object/from16 v1, p0

    move-object v2, v7

    move-object v3, v11

    move-object/from16 v4, p2

    move-wide/from16 v5, v16

    move-object v12, v7

    move-object/from16 v7, p7

    .line 106
    invoke-static/range {v1 .. v7}, Ll/ᩳۨۜ;->֫(Ll/᩺ۨۜ;Ll/ۨۨۜ;Ll/ۤۛۜ;Ll/᩶ۛۜ;JLl/ۡ᩺ۜ;)Ll/ܰۛۜ;

    move-result-object v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 107
    :try_start_c
    invoke-virtual {v8, v12}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 108
    invoke-static/range {p7 .. p7}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 115
    invoke-virtual {v11}, Ll/ۤۛۜ;->close()V

    return-object v1

    :catchall_2
    move-exception v0

    goto :goto_c

    :catchall_3
    move-exception v0

    const/4 v1, 0x0

    :goto_c
    if-eqz v1, :cond_14

    const/4 v2, 0x0

    .line 663
    :try_start_d
    invoke-virtual {v1, v2}, Ll/ܰۛۜ;->֫(Ll/᩹ۛۜ;)V

    .line 114
    :cond_14
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception v0

    move-object v1, v0

    .line 102
    :try_start_e
    invoke-virtual {v11}, Ll/ۤۛۜ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    goto :goto_d

    :catchall_5
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v1

    :cond_15
    move-object/from16 v8, p0

    move-object v12, v11

    add-int/lit8 v4, v10, 0x1

    int-to-byte v2, v2

    .line 164
    :try_start_f
    aput-byte v2, v5, v10
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    goto :goto_e

    :cond_16
    move-object/from16 v8, p0

    move-object v12, v11

    add-int v4, v10, v2

    :goto_e
    move-object/from16 v15, p2

    move v10, v4

    :goto_f
    move/from16 v2, p1

    move-object/from16 v4, p2

    move-wide/from16 v13, p3

    move-object v7, v12

    move-wide/from16 v11, v16

    goto/16 :goto_a

    :catchall_6
    move-exception v0

    move-object v1, v0

    if-eqz v6, :cond_17

    .line 133
    :try_start_10
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_10

    :catchall_7
    move-exception v0

    move-object v2, v0

    :try_start_11
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_17
    :goto_10
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception v0

    if-eqz v9, :cond_18

    .line 174
    invoke-virtual {v9}, Ll/᩹ۛۜ;->close()V

    .line 175
    :cond_18
    throw v0

    .line 127
    :cond_19
    new-instance v0, Ll/֨ۨۜ;

    const-string v1, "Special image input exceeds allocation limit"

    .line 330
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 127
    throw v0

    .line 125
    :cond_1a
    new-instance v0, Ll/ۨۛۜ;

    .line 443
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 125
    throw v0

    .line 124
    :cond_1b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Special image input is empty"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    :goto_11
    move-object v13, v15

    return-object v13

    .line 84
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Format allocation limit must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/᩶ۛۜ;J)Ll/᩹ۛۜ;
    .locals 0

    .line 560
    invoke-virtual {p0, p1, p2}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    .line 561
    :cond_0
    new-instance p0, Ll/֨ۨۜ;

    const-string p1, "Special image reservation exceeds budget"

    .line 330
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 561
    throw p0
.end method

.method public static ֫(Ll/᩺ۨۜ;Ll/ۢ᩺ۜ;)Ll/᩺ۛۜ;
    .locals 4

    .line 63
    invoke-static {p1}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 64
    invoke-virtual {p0}, Ll/᩺ۨۜ;->᩵()Ll/ۨۨۜ;

    move-result-object v0

    .line 66
    sget-object v1, Ll/᩶ۨۜ;->֫:Ll/᩶ۨۜ;

    invoke-static {v0, v1}, Ll/ۙۨۜ;->֫(Ll/ۨۨۜ;Ll/᩶ۨۜ;)V

    .line 68
    invoke-static {p0, v1}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Ll/۠ۨۜ;

    move-result-object v2

    .line 69
    :try_start_0
    new-instance v3, Ll/۫ۛۜ;

    invoke-direct {v3, p1, p0, v1}, Ll/۫ۛۜ;-><init>(Ll/ۢ᩺ۜ;Ll/᩺ۨۜ;Ll/᩶ۨۜ;)V

    invoke-static {v2, v3}, Ll/ۛ۠ۜ;->֫(Ljava/io/InputStream;Ll/۬۠ۜ;)Ll/ۤ۠ۜ;

    move-result-object v1

    .line 73
    invoke-virtual {v2}, Ll/۠ۨۜ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 75
    invoke-virtual {p0, v0}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 76
    invoke-static {p1}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 77
    new-instance p0, Ll/᩺ۛۜ;

    invoke-direct {p0, v0, v1}, Ll/᩺ۛۜ;-><init>(Ll/ۨۨۜ;Ll/ۤ۠ۜ;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 68
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static ֫(II[B)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    add-int v1, p0, v0

    mul-int/lit8 v2, v0, 0x8

    ushr-int v2, p1, v2

    int-to-byte v2, v2

    .line 231
    aput-byte v2, p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/۟ۛۜ;Ljava/util/HashMap;Ljava/util/HashSet;[JIIZLl/ۡ᩺ۜ;)V
    .locals 14

    move-object v0, p0

    move-object/from16 v9, p2

    move/from16 v10, p4

    .line 476
    invoke-static/range {p7 .. p7}, Ll/ᩳۨۜ;->֫(Ll/ܿۖ᩷;)V

    const/4 v1, 0x0

    .line 477
    aget-wide v2, p3, v1

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    aput-wide v2, p3, v1

    const-wide/32 v4, 0x8000

    cmp-long v1, v2, v4

    if-gtz v1, :cond_7

    const/16 v1, 0x40

    if-gt v10, v1, :cond_7

    invoke-virtual {v9, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    .line 479
    aget-wide v2, p3, v1

    int-to-long v4, v10

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    aput-wide v2, p3, v1

    const/4 v1, 0x2

    .line 480
    aget-wide v2, p3, v1

    iget-wide v4, v0, Ll/۟ۛۜ;->֫:J

    add-long/2addr v2, v4

    aput-wide v2, p3, v1

    const/4 v1, 0x4

    .line 481
    aget-wide v2, p3, v1

    iget-wide v4, v0, Ll/۟ۛۜ;->ᩳ:J

    add-long/2addr v2, v4

    aput-wide v2, p3, v1

    const-wide/32 v4, 0x100000

    cmp-long v1, v2, v4

    if-gtz v1, :cond_6

    const/4 v1, 0x3

    if-eqz p6, :cond_0

    if-lez v10, :cond_0

    const/4 v2, 0x3

    goto :goto_0

    .line 483
    :cond_0
    iget v2, v0, Ll/۟ۛۜ;->ܿ:I

    :goto_0
    add-int v11, p5, v2

    .line 484
    aget-wide v2, p3, v1

    int-to-long v4, v11

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    aput-wide v2, p3, v1

    .line 486
    iget-object v1, v0, Ll/۟ۛۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_1
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۛۜ;

    .line 487
    iget-boolean v2, v1, Ll/۟ۛۜ;->ܽ:Z

    if-eqz v2, :cond_2

    if-eqz p6, :cond_1

    :cond_2
    add-int/lit8 v5, v10, 0x1

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v6, v11

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v8}, Ll/ᩳۨۜ;->֫(Ll/۟ۛۜ;Ljava/util/HashMap;Ljava/util/HashSet;[JIIZLl/ۡ᩺ۜ;)V

    goto :goto_1

    .line 489
    :cond_3
    iget-object v1, v0, Ll/۟ۛۜ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_4
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object v13, p1

    .line 490
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۛۜ;

    if-eqz v1, :cond_4

    add-int/lit8 v5, v10, 0x1

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v6, v11

    move/from16 v7, p6

    move-object/from16 v8, p7

    .line 491
    invoke-static/range {v1 .. v8}, Ll/ᩳۨۜ;->֫(Ll/۟ۛۜ;Ljava/util/HashMap;Ljava/util/HashSet;[JIIZLl/ۡ᩺ۜ;)V

    goto :goto_2

    .line 493
    :cond_5
    invoke-virtual {v9, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void

    .line 482
    :cond_6
    new-instance v0, Ll/ۨۛۜ;

    const-string v1, "SVG expanded geometry exceeds safe render limits"

    .line 443
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 482
    throw v0

    .line 478
    :cond_7
    new-instance v0, Ll/ۨۛۜ;

    const-string v1, "SVG references exceed safe render limits"

    .line 443
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 478
    throw v0
.end method

.method public static ֫(Ll/ܿۖ᩷;)V
    .locals 1

    .line 566
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string v0, "Image decode cancelled"

    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;I[B)Z
    .locals 4

    const/4 v0, 0x0

    if-ltz p1, :cond_3

    .line 570
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, p1

    array-length v2, p2

    if-le v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 571
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    add-int v2, p1, v1

    aget-byte v2, p2, v2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static ۧ(I[B)I
    .locals 1

    .line 576
    invoke-static {p0, p1}, Ll/ᩳۨۜ;->֫(I[B)I

    move-result v0

    add-int/lit8 p0, p0, 0x2

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x10

    or-int/2addr p0, v0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;I[B)V
    .locals 3

    const/4 v0, 0x0

    .line 227
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    add-int v1, p1, v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ܽ(I[B)J
    .locals 4

    .line 577
    invoke-static {p0, p1}, Ll/ᩳۨۜ;->ۧ(I[B)I

    move-result v0

    int-to-long v0, v0

    const-wide/32 v2, 0xffffff

    and-long/2addr v0, v2

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    int-to-long p0, p0

    const-wide/16 v2, 0xff

    and-long/2addr p0, v2

    const/16 v2, 0x18

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method
