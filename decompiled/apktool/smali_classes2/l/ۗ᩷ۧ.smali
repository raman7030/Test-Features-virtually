.class public final Ll/ۗ᩷ۧ;
.super Ljava/lang/Object;
.source "68JC"


# direct methods
.method public static ֫(ILl/ᩳ֨֫;)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, -0x1

    return p0

    :pswitch_0
    add-int/lit8 p0, p0, -0x8

    const/16 p1, 0x100

    shl-int p0, p1, p0

    return p0

    .line 182
    :pswitch_1
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0

    .line 180
    :pswitch_2
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0

    :pswitch_3
    add-int/lit8 p0, p0, -0x2

    const/16 p1, 0x240

    shl-int p0, p1, p0

    return p0

    :pswitch_4
    const/16 p0, 0xc0

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ᩳ֨֫;Ll/ۛ᩷ۧ;ILl/ۙ᩷ۧ;)Z
    .locals 18

    move-object/from16 v0, p1

    .line 54
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 56
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    const/16 v4, 0x10

    ushr-long v4, v2, v4

    move/from16 v6, p2

    int-to-long v6, v6

    const/4 v8, 0x0

    cmp-long v9, v4, v6

    if-eqz v9, :cond_0

    goto/16 :goto_6

    :cond_0
    const-wide/16 v6, 0x1

    and-long/2addr v4, v6

    const/4 v9, 0x1

    cmp-long v10, v4, v6

    if-nez v10, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0xc

    shr-long v10, v2, v5

    const-wide/16 v12, 0xf

    and-long/2addr v10, v12

    long-to-int v11, v10

    const/16 v10, 0x8

    shr-long v14, v2, v10

    and-long/2addr v14, v12

    long-to-int v10, v14

    const/4 v14, 0x4

    shr-long v14, v2, v14

    and-long/2addr v12, v14

    long-to-int v13, v12

    shr-long v14, v2, v9

    const-wide/16 v16, 0x7

    and-long v14, v14, v16

    long-to-int v12, v14

    and-long/2addr v2, v6

    cmp-long v14, v2, v6

    if-nez v14, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    const/4 v3, 0x7

    if-gt v13, v3, :cond_3

    .line 207
    iget v3, v0, Ll/ۛ᩷ۧ;->ܽ:I

    sub-int/2addr v3, v9

    if-ne v13, v3, :cond_a

    goto :goto_2

    :cond_3
    const/16 v3, 0xa

    if-gt v13, v3, :cond_a

    .line 209
    iget v3, v0, Ll/ۛ᩷ۧ;->ܽ:I

    const/4 v6, 0x2

    if-ne v3, v6, :cond_a

    :goto_2
    if-nez v12, :cond_4

    goto :goto_3

    .line 227
    :cond_4
    iget v3, v0, Ll/ۛ᩷ۧ;->ۧ:I

    if-ne v12, v3, :cond_a

    :goto_3
    if-nez v2, :cond_a

    .line 252
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->۬()J

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_5

    goto :goto_4

    .line 258
    :cond_5
    iget v4, v0, Ll/ۛ᩷ۧ;->ᩳ:I

    int-to-long v6, v4

    mul-long v2, v2, v6

    :goto_4
    move-object/from16 v4, p3

    iput-wide v2, v4, Ll/ۙ᩷ۧ;->֫:J

    move-object/from16 v2, p0

    .line 277
    invoke-static {v11, v2}, Ll/ۗ᩷ۧ;->֫(ILl/ᩳ֨֫;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_a

    .line 278
    iget v4, v0, Ll/ۛ᩷ۧ;->ᩳ:I

    if-gt v3, v4, :cond_a

    .line 295
    iget v3, v0, Ll/ۛ᩷ۧ;->᩷:I

    if-nez v10, :cond_6

    goto :goto_5

    :cond_6
    const/16 v4, 0xb

    if-gt v10, v4, :cond_7

    .line 299
    iget v0, v0, Ll/ۛ᩷ۧ;->ۢ:I

    if-ne v10, v0, :cond_a

    goto :goto_5

    :cond_7
    if-ne v10, v5, :cond_8

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    if-ne v0, v3, :cond_a

    goto :goto_5

    :cond_8
    const/16 v0, 0xe

    if-gt v10, v0, :cond_a

    .line 303
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v4

    if-ne v10, v0, :cond_9

    mul-int/lit8 v4, v4, 0xa

    :cond_9
    if-ne v4, v3, :cond_a

    .line 326
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 327
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    .line 329
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    sub-int/2addr v3, v9

    invoke-static {v1, v3, v2}, Ll/ۘ֨֫;->֫(II[B)I

    move-result v1

    if-ne v0, v1, :cond_a

    return v9

    :catch_0
    :cond_a
    :goto_6
    return v8
.end method
