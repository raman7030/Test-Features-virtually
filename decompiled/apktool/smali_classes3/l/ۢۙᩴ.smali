.class public final Ll/ۢۙᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܳۙᩴ;


# virtual methods
.method public final l(Ll/ۤۙᩴ;Ljava/lang/StringBuilder;)Z
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 3414
    sget-object v2, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v2}, Ll/ۤۙᩴ;->a(Ll/ۤۗᩴ;)Ljava/lang/Long;

    move-result-object v2

    .line 238
    iget-object v0, v0, Ll/ۤۙᩴ;->a:Ll/ۖۗᩴ;

    .line 3416
    sget-object v3, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    invoke-interface {v0, v3}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 3417
    invoke-interface {v0, v3}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v4, 0x0

    if-nez v2, :cond_1

    return v4

    .line 3422
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    if-eqz v0, :cond_2

    .line 3423
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_1

    :cond_2
    const-wide/16 v9, 0x0

    .line 669
    :goto_1
    iget-object v0, v3, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {v0, v9, v10, v3}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v0

    const-string v2, ":00"

    const-wide/16 v9, 0x1

    const/4 v3, 0x1

    const-wide v11, 0xe79747c00L

    const-wide v13, -0xe79747c00L

    const-wide v7, 0x497968bd80L

    cmp-long v15, v5, v13

    if-ltz v15, :cond_4

    const-wide v13, 0x3afff44180L

    sub-long/2addr v5, v13

    .line 3428
    invoke-static {v5, v6, v7, v8}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v13

    add-long/2addr v13, v9

    .line 3429
    invoke-static {v5, v6, v7, v8}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide v5

    sub-long/2addr v5, v11

    .line 3430
    sget-object v7, Ll/ᩳ۬ᩴ;->f:Ll/ᩳ۬ᩴ;

    invoke-static {v5, v6, v4, v7}, Ll/᩺ۙᩴ;->Z(JILl/ᩳ۬ᩴ;)Ll/᩺ۙᩴ;

    move-result-object v5

    const-wide/16 v6, 0x0

    cmp-long v8, v13, v6

    if-lez v8, :cond_3

    const/16 v6, 0x2b

    .line 3432
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3434
    :cond_3
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 859
    iget-object v5, v5, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    .line 729
    iget-byte v5, v5, Ll/۟ۙᩴ;->c:B

    if-nez v5, :cond_8

    .line 3436
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    add-long/2addr v5, v11

    .line 3441
    div-long v13, v5, v7

    .line 3442
    rem-long/2addr v5, v7

    sub-long v7, v5, v11

    .line 3443
    sget-object v11, Ll/ᩳ۬ᩴ;->f:Ll/ᩳ۬ᩴ;

    invoke-static {v7, v8, v4, v11}, Ll/᩺ۙᩴ;->Z(JILl/ᩳ۬ᩴ;)Ll/᩺ۙᩴ;

    move-result-object v7

    .line 3444
    invoke-virtual/range {p2 .. p2}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    .line 3445
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 859
    iget-object v11, v7, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    .line 729
    iget-byte v11, v11, Ll/۟ۙᩴ;->c:B

    if-nez v11, :cond_5

    .line 3447
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    const-wide/16 v11, 0x0

    cmp-long v2, v13, v11

    if-gez v2, :cond_8

    .line 750
    iget-object v2, v7, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 762
    iget v2, v2, Ll/ᩴ᩹ᩴ;->a:I

    const/16 v7, -0x2710

    if-ne v2, v7, :cond_6

    add-int/lit8 v2, v8, 0x2

    sub-long/2addr v13, v9

    .line 3451
    invoke-static {v13, v14}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v8, v2, v5}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_6
    const-wide/16 v9, 0x0

    cmp-long v2, v5, v9

    if-nez v2, :cond_7

    .line 3453
    invoke-virtual {v1, v8, v13, v14}, Ljava/lang/StringBuilder;->insert(IJ)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_7
    add-int/2addr v8, v3

    .line 3455
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    invoke-virtual {v1, v8, v5, v6}, Ljava/lang/StringBuilder;->insert(IJ)Ljava/lang/StringBuilder;

    :cond_8
    :goto_2
    if-gtz v0, :cond_9

    goto :goto_4

    :cond_9
    const/16 v2, 0x2e

    .line 3461
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v2, 0x5f5e100

    :goto_3
    if-gtz v0, :cond_b

    .line 3463
    rem-int/lit8 v5, v4, 0x3

    if-nez v5, :cond_b

    const/4 v5, -0x2

    if-ge v4, v5, :cond_a

    goto :goto_5

    :cond_a
    :goto_4
    const/16 v0, 0x5a

    .line 3472
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v3

    .line 3466
    :cond_b
    :goto_5
    div-int v5, v0, v2

    add-int/lit8 v6, v5, 0x30

    int-to-char v6, v6

    .line 3467
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    mul-int v5, v5, v2

    sub-int/2addr v0, v5

    .line 3469
    div-int/lit8 v2, v2, 0xa

    add-int/lit8 v4, v4, 0x1

    goto :goto_3
.end method

.method public final m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I
    .locals 16

    move-object/from16 v6, p1

    move/from16 v7, p3

    .line 3481
    new-instance v0, Ll/ۙۙᩴ;

    invoke-direct {v0}, Ll/ۙۙᩴ;-><init>()V

    sget-object v1, Ll/ۛ᩶ᩴ;->f:Ll/ۛ᩶ᩴ;

    .line 3482
    invoke-virtual {v0, v1}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    const/16 v1, 0x54

    invoke-virtual {v0, v1}, Ll/ۙۙᩴ;->d(C)V

    sget-object v1, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    const/4 v2, 0x2

    .line 3483
    invoke-virtual {v0, v1, v2}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    const/16 v3, 0x3a

    invoke-virtual {v0, v3}, Ll/ۙۙᩴ;->d(C)V

    sget-object v4, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    .line 3484
    invoke-virtual {v0, v4, v2}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    invoke-virtual {v0, v3}, Ll/ۙۙᩴ;->d(C)V

    sget-object v3, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    .line 3485
    invoke-virtual {v0, v3, v2}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    sget-object v8, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    const/4 v2, 0x0

    const/16 v5, 0x9

    const/4 v9, 0x1

    .line 3486
    invoke-virtual {v0, v8, v2, v5, v9}, Ll/ۙۙᩴ;->b(Ll/ᩴۗᩴ;IIZ)V

    const/16 v5, 0x5a

    .line 3487
    invoke-virtual {v0, v5}, Ll/ۙۙᩴ;->d(C)V

    .line 2203
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    .line 2224
    sget-object v10, Ll/ܿۙᩴ;->SMART:Ll/ܿۙᩴ;

    const/4 v11, 0x0

    invoke-virtual {v0, v5, v10, v11}, Ll/ۙۙᩴ;->q(Ljava/util/Locale;Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    move-result-object v0

    .line 2077
    iget-object v0, v0, Ll/ۛ᩶ᩴ;->a:Ll/ᩳۙᩴ;

    .line 2343
    iget-boolean v5, v0, Ll/ᩳۙᩴ;->b:Z

    if-nez v5, :cond_0

    goto :goto_0

    .line 2346
    :cond_0
    new-instance v5, Ll/ᩳۙᩴ;

    iget-object v0, v0, Ll/ᩳۙᩴ;->a:[Ll/ܳۙᩴ;

    invoke-direct {v5, v0, v2}, Ll/ᩳۙᩴ;-><init>([Ll/ܳۙᩴ;Z)V

    move-object v0, v5

    .line 131
    :goto_0
    new-instance v5, Ll/ۗۙᩴ;

    iget-object v10, v6, Ll/ۗۙᩴ;->a:Ll/ۛ᩶ᩴ;

    invoke-direct {v5, v10}, Ll/ۗۙᩴ;-><init>(Ll/ۛ᩶ᩴ;)V

    .line 132
    iget-boolean v10, v6, Ll/ۗۙᩴ;->b:Z

    iput-boolean v10, v5, Ll/ۗۙᩴ;->b:Z

    .line 133
    iget-boolean v10, v6, Ll/ۗۙᩴ;->c:Z

    iput-boolean v10, v5, Ll/ۗۙᩴ;->c:Z

    move-object/from16 v10, p2

    .line 3490
    invoke-virtual {v0, v5, v10, v7}, Ll/ᩳۙᩴ;->m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I

    move-result v10

    if-gez v10, :cond_1

    return v10

    .line 3496
    :cond_1
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    invoke-virtual {v5, v0}, Ll/ۗۙᩴ;->d(Ll/ᩴۗᩴ;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    .line 3497
    sget-object v0, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-virtual {v5, v0}, Ll/ۗۙᩴ;->d(Ll/ᩴۗᩴ;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    .line 3498
    sget-object v13, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-virtual {v5, v13}, Ll/ۗۙᩴ;->d(Ll/ᩴۗᩴ;)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Long;->intValue()I

    move-result v13

    .line 3499
    invoke-virtual {v5, v1}, Ll/ۗۙᩴ;->d(Ll/ᩴۗᩴ;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    .line 3500
    invoke-virtual {v5, v4}, Ll/ۗۙᩴ;->d(Ll/ᩴۗᩴ;)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->intValue()I

    move-result v4

    .line 3501
    invoke-virtual {v5, v3}, Ll/ۗۙᩴ;->d(Ll/ᩴۗᩴ;)Ljava/lang/Long;

    move-result-object v3

    .line 3502
    invoke-virtual {v5, v8}, Ll/ۗۙᩴ;->d(Ll/ᩴۗᩴ;)Ljava/lang/Long;

    move-result-object v5

    if-eqz v3, :cond_2

    .line 3503
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    move-result v3

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v5, :cond_3

    .line 3504
    invoke-virtual {v5}, Ljava/lang/Long;->intValue()I

    move-result v5

    move v14, v5

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    const/4 v14, 0x0

    :goto_2
    const/16 v5, 0x18

    if-ne v1, v5, :cond_4

    if-nez v4, :cond_4

    if-nez v3, :cond_4

    if-nez v14, :cond_4

    const/4 v1, 0x0

    goto :goto_3

    :cond_4
    const/16 v5, 0x17

    if-ne v1, v5, :cond_5

    const/16 v5, 0x3b

    if-ne v4, v5, :cond_5

    const/16 v5, 0x3c

    if-ne v3, v5, :cond_5

    .line 424
    invoke-virtual/range {p1 .. p1}, Ll/ۗۙᩴ;->c()Ll/ܽۙᩴ;

    move-result-object v3

    iput-boolean v9, v3, Ll/ܽۙᩴ;->d:Z

    const/16 v3, 0x3b

    :cond_5
    const/4 v9, 0x0

    :goto_3
    long-to-int v5, v11

    .line 3513
    rem-int/lit16 v5, v5, 0x2710

    .line 3516
    :try_start_0
    sget-object v15, Ll/᩺ۙᩴ;->c:Ll/᩺ۙᩴ;

    .line 361
    invoke-static {v5, v0, v13}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    .line 362
    invoke-static {v1, v4, v3, v2}, Ll/۟ۙᩴ;->Z(IIII)Ll/۟ۙᩴ;

    move-result-object v1

    .line 363
    new-instance v2, Ll/᩺ۙᩴ;

    invoke-direct {v2, v0, v1}, Ll/᩺ۙᩴ;-><init>(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)V

    int-to-long v3, v9

    .line 1286
    invoke-virtual {v0, v3, v4}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    .line 1287
    invoke-virtual {v2, v0, v1}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v0

    .line 3517
    sget-object v1, Ll/ᩳ۬ᩴ;->f:Ll/ᩳ۬ᩴ;

    .line 0
    invoke-static {v0, v1}, Ll/᩺ۚᩴ;->j(Ll/ܰ᩹ᩴ;Ll/ᩳ۬ᩴ;)J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    .line 3518
    div-long/2addr v11, v2

    const-wide v2, 0x497968bd80L

    invoke-static {v11, v12, v2, v3}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    add-long/2addr v2, v0

    .line 3523
    sget-object v1, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    move-object/from16 v0, p1

    move/from16 v4, p3

    move v5, v10

    invoke-virtual/range {v0 .. v5}, Ll/ۗۙᩴ;->f(Ll/ۤۗᩴ;JII)I

    move-result v5

    int-to-long v2, v14

    move-object v1, v8

    .line 3524
    invoke-virtual/range {v0 .. v5}, Ll/ۗۙᩴ;->f(Ll/ۤۗᩴ;JII)I

    move-result v0

    return v0

    :catch_0
    not-int v0, v7

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Instant()"

    return-object v0
.end method
