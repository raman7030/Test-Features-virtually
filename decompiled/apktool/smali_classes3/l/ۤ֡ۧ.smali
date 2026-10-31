.class public final Ll/ۤ֡ۧ;
.super Ljava/lang/Object;
.source "S8PU"


# direct methods
.method public static ֫(Ll/ܽ֨֫;III)I
    .locals 8

    .line 561
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/16 v1, 0x1f

    const/4 v2, 0x1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 562
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    shl-int v0, v2, p1

    sub-int/2addr v0, v2

    shl-int v1, v2, p2

    sub-int/2addr v1, v2

    int-to-long v3, v0

    int-to-long v5, v1

    add-long/2addr v3, v5

    long-to-int v5, v3

    int-to-long v5, v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_6

    shl-int/2addr v2, p3

    int-to-long v2, v2

    add-long/2addr v5, v2

    long-to-int v2, v5

    int-to-long v2, v2

    cmp-long v4, v5, v2

    if-nez v4, :cond_5

    .line 567
    invoke-virtual {p0}, Ll/ܽ֨֫;->֫()I

    move-result v2

    if-ge v2, p1, :cond_1

    goto :goto_1

    .line 571
    :cond_1
    invoke-virtual {p0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p1

    if-ne p1, v0, :cond_4

    .line 573
    invoke-virtual {p0}, Ll/ܽ֨֫;->֫()I

    move-result v0

    if-ge v0, p2, :cond_2

    goto :goto_1

    .line 576
    :cond_2
    invoke-virtual {p0, p2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p2

    add-int/2addr p1, p2

    if-ne p2, v1, :cond_4

    .line 580
    invoke-virtual {p0}, Ll/ܽ֨֫;->֫()I

    move-result p2

    if-ge p2, p3, :cond_3

    :goto_1
    const/4 p0, -0x1

    return p0

    .line 583
    :cond_3
    invoke-virtual {p0, p3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p0

    add-int/2addr p0, p1

    return p0

    :cond_4
    return p1

    .line 0
    :cond_5
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0
.end method

.method public static ֫(Ll/ܽ֨֫;)Ll/۫֡ۧ;
    .locals 18

    move-object/from16 v0, p0

    const/16 v1, 0x8

    .line 190
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/4 v3, 0x5

    .line 193
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    const/16 v5, 0x1f

    if-ne v4, v5, :cond_0

    const/16 v4, 0x18

    .line 195
    invoke-virtual {v0, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    goto/16 :goto_0

    :cond_0
    packed-switch v4, :pswitch_data_0

    .line 303
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported sampling rate index "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :pswitch_1
    const/16 v4, 0x2580

    goto/16 :goto_0

    :pswitch_2
    const/16 v4, 0x3200

    goto/16 :goto_0

    :pswitch_3
    const/16 v4, 0x3840

    goto :goto_0

    :pswitch_4
    const/16 v4, 0x42b3

    goto :goto_0

    :pswitch_5
    const/16 v4, 0x4b00

    goto :goto_0

    :pswitch_6
    const/16 v4, 0x4e20

    goto :goto_0

    :pswitch_7
    const/16 v4, 0x6400

    goto :goto_0

    :pswitch_8
    const/16 v4, 0x7080

    goto :goto_0

    :pswitch_9
    const v4, 0x8566

    goto :goto_0

    :pswitch_a
    const v4, 0x9600

    goto :goto_0

    :pswitch_b
    const v4, 0x9c40

    goto :goto_0

    :pswitch_c
    const v4, 0xc800

    goto :goto_0

    :pswitch_d
    const v4, 0xe100

    goto :goto_0

    :pswitch_e
    const/16 v4, 0x1cb6

    goto :goto_0

    :pswitch_f
    const/16 v4, 0x1f40

    goto :goto_0

    :pswitch_10
    const/16 v4, 0x2b11

    goto :goto_0

    :pswitch_11
    const/16 v4, 0x2ee0

    goto :goto_0

    :pswitch_12
    const/16 v4, 0x3e80

    goto :goto_0

    :pswitch_13
    const/16 v4, 0x5622

    goto :goto_0

    :pswitch_14
    const/16 v4, 0x5dc0

    goto :goto_0

    :pswitch_15
    const/16 v4, 0x7d00

    goto :goto_0

    :pswitch_16
    const v4, 0xac44

    goto :goto_0

    :pswitch_17
    const v4, 0xbb80

    goto :goto_0

    :pswitch_18
    const v4, 0xfa00

    goto :goto_0

    :pswitch_19
    const v4, 0x15888

    goto :goto_0

    :pswitch_1a
    const v4, 0x17700

    :goto_0
    const/4 v5, 0x3

    .line 200
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    const-string v7, "Unsupported coreSbrFrameLengthIndex "

    const/4 v8, 0x2

    const/4 v9, 0x4

    const/4 v10, 0x1

    if-eqz v6, :cond_4

    if-eq v6, v10, :cond_3

    if-eq v6, v8, :cond_2

    if-eq v6, v5, :cond_2

    if-ne v6, v9, :cond_1

    const/16 v11, 0x1000

    goto :goto_1

    .line 116
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_2
    const/16 v11, 0x800

    goto :goto_1

    :cond_3
    const/16 v11, 0x400

    goto :goto_1

    :cond_4
    const/16 v11, 0x300

    :goto_1
    if-eqz v6, :cond_8

    if-eq v6, v10, :cond_8

    if-eq v6, v8, :cond_7

    if-eq v6, v5, :cond_6

    if-ne v6, v9, :cond_5

    const/4 v6, 0x1

    goto :goto_2

    .line 141
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_6
    const/4 v6, 0x3

    goto :goto_2

    :cond_7
    const/4 v6, 0x2

    goto :goto_2

    :cond_8
    const/4 v6, 0x0

    .line 204
    :goto_2
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 206
    invoke-static/range {p0 .. p0}, Ll/ۤ֡ۧ;->ܽ(Ll/ܽ֨֫;)V

    .line 402
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v7

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_3
    add-int/lit8 v14, v7, 0x1

    const/16 v15, 0x10

    if-ge v12, v14, :cond_b

    .line 405
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v14

    .line 406
    invoke-static {v0, v3, v1, v15}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    move-result v15

    add-int/2addr v15, v10

    add-int/2addr v13, v15

    if-eqz v14, :cond_9

    if-ne v14, v8, :cond_a

    .line 411
    :cond_9
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v14

    if-eqz v14, :cond_a

    .line 412
    invoke-static/range {p0 .. p0}, Ll/ۤ֡ۧ;->ܽ(Ll/ܽ֨֫;)V

    :cond_a
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 431
    :cond_b
    invoke-static {v0, v9, v1, v15}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    move-result v3

    add-int/2addr v3, v10

    .line 432
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܳ()V

    const/4 v7, 0x0

    :goto_4
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    if-ge v7, v3, :cond_1b

    .line 435
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    const/16 v14, 0xd

    if-eqz v12, :cond_18

    if-eq v12, v10, :cond_e

    if-eq v12, v5, :cond_c

    goto/16 :goto_6

    .line 485
    :cond_c
    invoke-static {v0, v9, v1, v15}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    .line 486
    invoke-static {v0, v9, v1, v15}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    move-result v10

    .line 488
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v12

    if-eqz v12, :cond_d

    const/4 v12, 0x0

    .line 489
    invoke-static {v0, v1, v15, v12}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    .line 491
    :cond_d
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܳ()V

    if-lez v10, :cond_1a

    mul-int/lit8 v10, v10, 0x8

    .line 494
    invoke-virtual {v0, v10}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_6

    .line 512
    :cond_e
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 513
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v10

    if-eqz v10, :cond_f

    .line 517
    invoke-virtual {v0, v14}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_f
    if-eqz v10, :cond_10

    .line 447
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܳ()V

    :cond_10
    if-lez v6, :cond_11

    .line 451
    invoke-static/range {p0 .. p0}, Ll/ۤ֡ۧ;->ۧ(Ll/ܽ֨֫;)V

    .line 452
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    goto :goto_5

    :cond_11
    const/4 v10, 0x0

    :goto_5
    if-lez v10, :cond_15

    const/4 v12, 0x6

    .line 456
    invoke-virtual {v0, v12}, Ll/ܽ֨֫;->ܿ(I)V

    .line 457
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v14

    .line 458
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ܿ(I)V

    .line 459
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v15

    const/4 v1, 0x5

    if-eqz v15, :cond_12

    .line 460
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_12
    if-eq v10, v8, :cond_13

    if-ne v10, v5, :cond_14

    .line 463
    :cond_13
    invoke-virtual {v0, v12}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_14
    if-ne v14, v8, :cond_15

    .line 466
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܳ()V

    :cond_15
    add-int/lit8 v1, v13, -0x1

    int-to-double v14, v1

    .line 470
    invoke-static {v14, v15}, Ljava/lang/Math;->log(D)D

    move-result-wide v14

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->log(D)D

    move-result-wide v16

    div-double v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Math;->floor(D)D

    move-result-wide v14

    double-to-int v1, v14

    add-int/lit8 v1, v1, 0x1

    .line 471
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    if-lez v10, :cond_16

    .line 473
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v12

    if-eqz v12, :cond_16

    .line 474
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    .line 477
    :cond_16
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v12

    if-eqz v12, :cond_17

    .line 478
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_17
    if-nez v6, :cond_1a

    if-nez v10, :cond_1a

    .line 481
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܳ()V

    goto :goto_6

    .line 512
    :cond_18
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 513
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 517
    invoke-virtual {v0, v14}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_19
    if-lez v6, :cond_1a

    .line 441
    invoke-static/range {p0 .. p0}, Ll/ۤ֡ۧ;->ۧ(Ll/ܽ֨֫;)V

    :cond_1a
    :goto_6
    add-int/lit8 v7, v7, 0x1

    const/4 v10, 0x1

    const/16 v15, 0x10

    const/16 v1, 0x8

    goto/16 :goto_4

    .line 210
    :cond_1b
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1e

    const/16 v1, 0x8

    .line 212
    invoke-static {v0, v8, v9, v1}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    const/4 v6, 0x0

    :goto_7
    if-ge v6, v5, :cond_1e

    const/16 v7, 0x10

    .line 214
    invoke-static {v0, v9, v1, v7}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    move-result v8

    .line 215
    invoke-static {v0, v9, v1, v7}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    move-result v7

    const/4 v10, 0x7

    if-ne v8, v10, :cond_1d

    .line 218
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    .line 219
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ܿ(I)V

    .line 220
    new-array v7, v3, [B

    const/4 v8, 0x0

    :goto_8
    if-ge v8, v3, :cond_1c

    .line 222
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    int-to-byte v10, v10

    aput-byte v10, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_1c
    move-object v3, v7

    goto :goto_9

    :cond_1d
    mul-int/lit8 v7, v7, 0x8

    .line 225
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ܿ(I)V

    :goto_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_1e
    sparse-switch v4, :sswitch_data_0

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported sampling rate "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :sswitch_0
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    goto :goto_a

    :sswitch_1
    const-wide/high16 v16, 0x3ff8000000000000L    # 1.5

    goto :goto_a

    :sswitch_2
    const-wide/high16 v16, 0x4008000000000000L    # 3.0

    :goto_a
    :sswitch_3
    int-to-double v0, v4

    mul-double v0, v0, v16

    double-to-int v0, v0

    int-to-double v4, v11

    mul-double v4, v4, v16

    double-to-int v1, v4

    .line 236
    new-instance v4, Ll/۫֡ۧ;

    invoke-direct {v4, v2, v3, v0, v1}, Ll/۫֡ۧ;-><init>(I[BII)V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x396c -> :sswitch_2
        0x3e80 -> :sswitch_2
        0x5622 -> :sswitch_3
        0x5dc0 -> :sswitch_3
        0x72d8 -> :sswitch_1
        0x7d00 -> :sswitch_1
        0xac44 -> :sswitch_0
        0xbb80 -> :sswitch_0
        0xe5b0 -> :sswitch_1
        0xfa00 -> :sswitch_1
        0x15888 -> :sswitch_0
        0x17700 -> :sswitch_0
    .end sparse-switch
.end method

.method public static ֫(Ll/ܽ֨֫;Ll/۬֡ۧ;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 60
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܽ()I

    const/4 v2, 0x3

    const/16 v3, 0x8

    .line 61
    invoke-static {v0, v2, v3, v3}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    move-result v2

    iput v2, v1, Ll/۬֡ۧ;->ܽ:I

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-ne v2, v5, :cond_0

    return v4

    :cond_0
    const/4 v2, 0x2

    .line 609
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    const/16 v7, 0x20

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    const/16 v8, 0x3f

    const/4 v9, 0x1

    if-gt v6, v8, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 610
    :goto_0
    invoke-static {v6}, Ll/᩺֡֫;->֫(Z)V

    const-wide/16 v10, 0x3

    const-wide/16 v12, 0xff

    .line 614
    invoke-static {v10, v11, v12, v13}, Ll/۠᩺ܺ;->֫(JJ)J

    move-result-wide v14

    const-wide v5, 0x100000000L

    .line 613
    invoke-static {v14, v15, v5, v6}, Ll/۠᩺ܺ;->֫(JJ)J

    .line 616
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->֫()I

    move-result v5

    const-wide/16 v14, -0x1

    if-ge v5, v2, :cond_2

    goto :goto_1

    .line 620
    :cond_2
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܽ(I)J

    move-result-wide v5

    cmp-long v16, v5, v10

    if-nez v16, :cond_5

    .line 622
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->֫()I

    move-result v10

    if-ge v10, v3, :cond_3

    goto :goto_1

    .line 626
    :cond_3
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ܽ(I)J

    move-result-wide v10

    add-long/2addr v5, v10

    cmp-long v3, v10, v12

    if-nez v3, :cond_5

    .line 630
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->֫()I

    move-result v3

    if-ge v3, v7, :cond_4

    :goto_1
    move-wide v5, v14

    goto :goto_2

    .line 634
    :cond_4
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ܽ(I)J

    move-result-wide v10

    add-long/2addr v5, v10

    .line 66
    :cond_5
    :goto_2
    iput-wide v5, v1, Ll/۬֡ۧ;->֫:J

    cmp-long v3, v5, v14

    if-nez v3, :cond_6

    return v4

    :cond_6
    const-wide/16 v10, 0x10

    cmp-long v3, v5, v10

    if-gtz v3, :cond_c

    const-wide/16 v10, 0x0

    cmp-long v3, v5, v10

    if-nez v3, :cond_a

    .line 77
    iget v3, v1, Ll/۬֡ۧ;->ܽ:I

    const/4 v5, 0x0

    if-eq v3, v9, :cond_9

    if-eq v3, v2, :cond_8

    const/16 v2, 0x11

    if-eq v3, v2, :cond_7

    goto :goto_3

    :cond_7
    const-string v0, "AudioTruncation packet with invalid packet label 0"

    .line 82
    invoke-static {v0, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_8
    const-string v0, "Mpegh3daFrame packet with invalid packet label 0"

    .line 85
    invoke-static {v0, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_9
    const-string v0, "Mpegh3daConfig packet with invalid packet label 0"

    .line 79
    invoke-static {v0, v5}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_a
    :goto_3
    const/16 v2, 0xb

    const/16 v3, 0x18

    .line 92
    invoke-static {v0, v2, v3, v3}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    move-result v0

    iput v0, v1, Ll/۬֡ۧ;->ۧ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_b

    return v9

    :cond_b
    return v4

    .line 72
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Contains sub-stream with an invalid packet label "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, v1, Ll/۬֡ۧ;->֫:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0
.end method

.method public static ۧ(Ll/ܽ֨֫;)V
    .locals 2

    const/4 v0, 0x3

    .line 529
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v0, 0x8

    .line 530
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    .line 531
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v0

    .line 532
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    .line 534
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_0
    if-eqz v1, :cond_1

    const/4 v0, 0x6

    .line 538
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_1
    return-void
.end method

.method public static ܽ(Ll/ܽ֨֫;)V
    .locals 11

    const/4 v0, 0x2

    .line 333
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    const/4 v2, 0x6

    if-nez v1, :cond_0

    .line 335
    invoke-virtual {p0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    return-void

    :cond_0
    const/16 v3, 0x10

    const/4 v4, 0x5

    const/16 v5, 0x8

    .line 339
    invoke-static {p0, v4, v5, v3}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;III)I

    move-result v3

    const/4 v5, 0x1

    add-int/2addr v3, v5

    const/4 v6, 0x7

    if-ne v1, v5, :cond_1

    mul-int/lit8 v3, v3, 0x7

    .line 341
    invoke-virtual {p0, v3}, Ll/ܽ֨֫;->ܿ(I)V

    return-void

    :cond_1
    if-ne v1, v0, :cond_9

    .line 357
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x5

    :goto_0
    if-eqz v1, :cond_3

    const/4 v4, 0x7

    :cond_3
    if-eqz v1, :cond_4

    const/16 v2, 0x8

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v3, :cond_9

    .line 365
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    const/16 v9, 0xb4

    if-eqz v8, :cond_5

    .line 366
    invoke-virtual {p0, v6}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v8, 0x0

    goto :goto_2

    .line 368
    :cond_5
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    const/4 v10, 0x3

    if-ne v8, v10, :cond_6

    .line 370
    invoke-virtual {p0, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    mul-int v8, v8, v7

    if-eqz v8, :cond_6

    .line 373
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܳ()V

    .line 376
    :cond_6
    invoke-virtual {p0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    mul-int v8, v8, v7

    if-eqz v8, :cond_7

    if-eq v8, v9, :cond_7

    .line 379
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܳ()V

    .line 381
    :cond_7
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܳ()V

    :goto_2
    if-eqz v8, :cond_8

    if-eq v8, v9, :cond_8

    .line 385
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_8

    add-int/lit8 v1, v1, 0x1

    :cond_8
    add-int/2addr v1, v5

    goto :goto_1

    :cond_9
    return-void
.end method
