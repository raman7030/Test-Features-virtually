.class public final Ll/۬ۢۧ;
.super Ljava/lang/Object;
.source "U8NM"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֫:Ll/۫ۢۧ;

.field public final ۖ:Ll/ᩳ֨֫;

.field public ۘ:Z

.field public ۜ:I

.field public final ۡ:Z

.field public ۢ:J

.field public final ۧ:Ll/ۗۢۧ;

.field public ܳ:Ll/᩸᩷ۧ;

.field public ܺ:J

.field public ܽ:[Ll/ۛۢۧ;

.field public ܿ:J

.field public ᩳ:Ll/ۛۢۧ;

.field public ᩴ:I

.field public final ᩵:Ll/ۤۘۧ;

.field public ᩷:J

.field public ᩻:I


# direct methods
.method public constructor <init>(ILl/ۤۘۧ;)V
    .locals 1

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    iput-object p2, p0, Ll/۬ۢۧ;->᩵:Ll/ۤۘۧ;

    const/4 p2, 0x1

    and-int/2addr p1, p2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 182
    :goto_0
    iput-boolean p2, p0, Ll/۬ۢۧ;->ۡ:Z

    .line 183
    new-instance p1, Ll/ᩳ֨֫;

    const/16 p2, 0xc

    invoke-direct {p1, p2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/۬ۢۧ;->ۖ:Ll/ᩳ֨֫;

    .line 184
    new-instance p1, Ll/ۗۢۧ;

    .line 580
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 184
    iput-object p1, p0, Ll/۬ۢۧ;->ۧ:Ll/ۗۢۧ;

    .line 185
    new-instance p1, Ll/᩹ܽܽ;

    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 185
    iput-object p1, p0, Ll/۬ۢۧ;->ܳ:Ll/᩸᩷ۧ;

    new-array p1, v0, [Ll/ۛۢۧ;

    .line 186
    iput-object p1, p0, Ll/۬ۢۧ;->ܽ:[Ll/ۛۢۧ;

    const-wide/16 p1, -0x1

    .line 187
    iput-wide p1, p0, Ll/۬ۢۧ;->ۢ:J

    .line 188
    iput-wide p1, p0, Ll/۬ۢۧ;->᩷:J

    const/4 p1, -0x1

    .line 189
    iput p1, p0, Ll/۬ۢۧ;->᩻:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 190
    iput-wide p1, p0, Ll/۬ۢۧ;->ܿ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ۢۧ;)[Ll/ۛۢۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۢۧ;->ܽ:[Ll/ۛۢۧ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 354
    iget-wide v2, v0, Ll/۬ۢۧ;->ܺ:J

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, -0x1

    cmp-long v8, v2, v6

    if-eqz v8, :cond_2

    .line 355
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    .line 356
    iget-wide v8, v0, Ll/۬ۢۧ;->ܺ:J

    cmp-long v10, v8, v2

    if-ltz v10, :cond_1

    const-wide/32 v10, 0x40000

    add-long/2addr v10, v2

    cmp-long v12, v8, v10

    if-lez v12, :cond_0

    goto :goto_0

    :cond_0
    sub-long/2addr v8, v2

    long-to-int v2, v8

    .line 363
    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    goto :goto_1

    :cond_1
    :goto_0
    move-object/from16 v2, p2

    .line 358
    iput-wide v8, v2, Ll/᩻ۢۧ;->֫:J

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v2, 0x0

    .line 366
    :goto_2
    iput-wide v6, v0, Ll/۬ۢۧ;->ܺ:J

    if-eqz v2, :cond_3

    return v4

    .line 221
    :cond_3
    iget v2, v0, Ll/۬ۢۧ;->ᩴ:I

    const/4 v8, 0x6

    const/16 v9, 0x10

    const v11, 0x5453494c

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/16 v14, 0xc

    const-wide/16 v15, 0x8

    iget-object v10, v0, Ll/۬ۢۧ;->ۧ:Ll/ۗۢۧ;

    iget-object v3, v0, Ll/۬ۢۧ;->ۖ:Ll/ᩳ֨֫;

    packed-switch v2, :pswitch_data_0

    .line 315
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 460
    :pswitch_0
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v6

    iget-wide v8, v0, Ll/۬ۢۧ;->᩷:J

    cmp-long v2, v6, v8

    if-ltz v2, :cond_4

    const/4 v1, -0x1

    return v1

    .line 462
    :cond_4
    iget-object v2, v0, Ll/۬ۢۧ;->ᩳ:Ll/ۛۢۧ;

    if-eqz v2, :cond_6

    .line 463
    invoke-virtual {v2, v1}, Ll/ۛۢۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 464
    iput-object v13, v0, Ll/۬ۢۧ;->ᩳ:Ll/ۛۢۧ;

    :cond_5
    return v5

    .line 542
    :cond_6
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    and-long/2addr v6, v8

    cmp-long v2, v6, v8

    if-nez v2, :cond_7

    .line 543
    invoke-interface {v1, v4}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 468
    :cond_7
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-interface {v1, v5, v14, v2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 469
    invoke-virtual {v3, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 470
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v2

    if-ne v2, v11, :cond_9

    .line 472
    invoke-virtual {v3, v12}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 473
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v2

    const v3, 0x69766f6d

    if-ne v2, v3, :cond_8

    const/16 v12, 0xc

    .line 474
    :cond_8
    invoke-interface {v1, v12}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 475
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    return v5

    .line 478
    :cond_9
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    const v4, 0x4b4e554a    # 1.352225E7f

    if-ne v2, v4, :cond_a

    .line 480
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v1

    int-to-long v3, v3

    add-long/2addr v1, v3

    add-long/2addr v1, v15

    iput-wide v1, v0, Ll/۬ۢۧ;->ܺ:J

    return v5

    .line 483
    :cond_a
    invoke-interface {v1, v12}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 484
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 451
    iget-object v4, v0, Ll/۬ۢۧ;->ܽ:[Ll/ۛۢۧ;

    array-length v6, v4

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_c

    aget-object v8, v4, v7

    .line 452
    invoke-virtual {v8, v2}, Ll/ۛۢۧ;->֫(I)Z

    move-result v9

    if-eqz v9, :cond_b

    move-object v13, v8

    goto :goto_4

    :cond_b
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_c
    :goto_4
    if-nez v13, :cond_d

    .line 488
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v1

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, v0, Ll/۬ۢۧ;->ܺ:J

    return v5

    .line 491
    :cond_d
    invoke-virtual {v13, v3}, Ll/ۛۢۧ;->ۧ(I)V

    .line 492
    iput-object v13, v0, Ll/۬ۢۧ;->ᩳ:Ll/ۛۢۧ;

    return v5

    .line 306
    :pswitch_1
    new-instance v2, Ll/ᩳ֨֫;

    iget v3, v0, Ll/۬ۢۧ;->ۜ:I

    invoke-direct {v2, v3}, Ll/ᩳ֨֫;-><init>(I)V

    .line 307
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    iget v6, v0, Ll/۬ۢۧ;->ۜ:I

    invoke-interface {v1, v3, v5, v6}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 434
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    if-ge v1, v9, :cond_e

    const-wide/16 v6, 0x0

    :goto_5
    const/4 v10, 0x4

    goto :goto_7

    .line 438
    :cond_e
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 439
    invoke-virtual {v2, v12}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 440
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    int-to-long v6, v3

    .line 444
    iget-wide v10, v0, Ll/۬ۢۧ;->ۢ:J

    cmp-long v3, v6, v10

    if-lez v3, :cond_f

    const-wide/16 v6, 0x0

    goto :goto_6

    :cond_f
    add-long/2addr v10, v15

    move-wide v6, v10

    .line 445
    :goto_6
    invoke-virtual {v2, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_5

    .line 405
    :goto_7
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    if-lt v1, v9, :cond_14

    .line 406
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩷()I

    move-result v1

    .line 407
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    .line 408
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩷()I

    move-result v11

    int-to-long v11, v11

    add-long/2addr v11, v6

    .line 409
    invoke-virtual {v2, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 451
    iget-object v10, v0, Ll/۬ۢۧ;->ܽ:[Ll/ۛۢۧ;

    array-length v13, v10

    const/4 v14, 0x0

    :goto_8
    if-ge v14, v13, :cond_11

    aget-object v15, v10, v14

    .line 452
    invoke-virtual {v15, v1}, Ll/ۛۢۧ;->֫(I)Z

    move-result v16

    if-eqz v16, :cond_10

    goto :goto_9

    :cond_10
    add-int/lit8 v14, v14, 0x1

    goto :goto_8

    :cond_11
    const/4 v15, 0x0

    :goto_9
    if-nez v15, :cond_12

    goto :goto_5

    :cond_12
    and-int/lit8 v1, v3, 0x10

    if-ne v1, v9, :cond_13

    const/4 v1, 0x1

    goto :goto_a

    :cond_13
    const/4 v1, 0x0

    .line 415
    :goto_a
    invoke-virtual {v15, v11, v12, v1}, Ll/ۛۢۧ;->֫(JZ)V

    goto :goto_5

    .line 418
    :cond_14
    iget-object v1, v0, Ll/۬ۢۧ;->ܽ:[Ll/ۛۢۧ;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_b
    if-ge v3, v2, :cond_15

    aget-object v6, v1, v3

    .line 419
    invoke-virtual {v6}, Ll/ۛۢۧ;->֫()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    .line 421
    :cond_15
    iput-boolean v4, v0, Ll/۬ۢۧ;->ۘ:Z

    .line 422
    iget-object v1, v0, Ll/۬ۢۧ;->ܽ:[Ll/ۛۢۧ;

    array-length v1, v1

    if-nez v1, :cond_16

    .line 423
    iget-object v1, v0, Ll/۬ۢۧ;->ܳ:Ll/᩸᩷ۧ;

    new-instance v2, Ll/᩷ۢۧ;

    iget-wide v3, v0, Ll/۬ۢۧ;->ܿ:J

    invoke-direct {v2, v3, v4}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {v1, v2}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    goto :goto_c

    .line 425
    :cond_16
    iget-object v1, v0, Ll/۬ۢۧ;->ܳ:Ll/᩸᩷ۧ;

    new-instance v2, Ll/ۙۢۧ;

    iget-wide v3, v0, Ll/۬ۢۧ;->ܿ:J

    invoke-direct {v2, v0, v3, v4}, Ll/ۙۢۧ;-><init>(Ll/۬ۢۧ;J)V

    invoke-interface {v1, v2}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 309
    :goto_c
    iput v8, v0, Ll/۬ۢۧ;->ᩴ:I

    .line 310
    iget-wide v1, v0, Ll/۬ۢۧ;->ۢ:J

    iput-wide v1, v0, Ll/۬ۢۧ;->ܺ:J

    return v5

    .line 293
    :pswitch_2
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-interface {v1, v2, v5, v12}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 294
    invoke-virtual {v3, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 295
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v2

    .line 296
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    const v4, 0x31786469

    if-ne v2, v4, :cond_17

    const/4 v1, 0x5

    .line 298
    iput v1, v0, Ll/۬ۢۧ;->ᩴ:I

    .line 299
    iput v3, v0, Ll/۬ۢۧ;->ۜ:I

    return v5

    .line 302
    :cond_17
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v1

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, v0, Ll/۬ۢۧ;->ܺ:J

    return v5

    .line 254
    :pswitch_3
    iget-wide v8, v0, Ll/۬ۢۧ;->ۢ:J

    cmp-long v2, v8, v6

    if-eqz v2, :cond_18

    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v6

    const/16 v2, 0x10

    iget-wide v8, v0, Ll/۬ۢۧ;->ۢ:J

    cmp-long v12, v6, v8

    if-eqz v12, :cond_19

    .line 255
    iput-wide v8, v0, Ll/۬ۢۧ;->ܺ:J

    return v5

    :cond_18
    const/16 v2, 0x10

    .line 258
    :cond_19
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    invoke-interface {v1, v5, v14, v6}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 259
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 260
    invoke-virtual {v3, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 261
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v6

    iput v6, v10, Ll/ۗۢۧ;->֫:I

    .line 596
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v6

    iput v6, v10, Ll/ۗۢۧ;->ܽ:I

    .line 597
    iput v5, v10, Ll/ۗۢۧ;->ۧ:I

    .line 262
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    .line 263
    iget v6, v10, Ll/ۗۢۧ;->֫:I

    const v7, 0x46464952

    if-ne v6, v7, :cond_1a

    .line 266
    invoke-interface {v1, v14}, Ll/۠᩷ۧ;->ܽ(I)V

    return v5

    :cond_1a
    if-ne v6, v11, :cond_1e

    const v6, 0x69766f6d

    if-eq v3, v6, :cond_1b

    goto :goto_d

    .line 274
    :cond_1b
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v6

    iput-wide v6, v0, Ll/۬ۢۧ;->ۢ:J

    .line 276
    iget v3, v10, Ll/ۗۢۧ;->ܽ:I

    int-to-long v8, v3

    add-long/2addr v6, v8

    add-long/2addr v6, v15

    iput-wide v6, v0, Ll/۬ۢۧ;->᩷:J

    .line 277
    iget-boolean v3, v0, Ll/۬ۢۧ;->ۘ:Z

    if-nez v3, :cond_1d

    .line 278
    iget-object v3, v0, Ll/۬ۢۧ;->֫:Ll/۫ۢۧ;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    iget v3, v3, Ll/۫ۢۧ;->֫:I

    and-int/2addr v3, v2

    if-ne v3, v2, :cond_1c

    const/4 v1, 0x4

    .line 279
    iput v1, v0, Ll/۬ۢۧ;->ᩴ:I

    .line 280
    iget-wide v1, v0, Ll/۬ۢۧ;->᩷:J

    iput-wide v1, v0, Ll/۬ۢۧ;->ܺ:J

    return v5

    .line 283
    :cond_1c
    iget-object v2, v0, Ll/۬ۢۧ;->ܳ:Ll/᩸᩷ۧ;

    new-instance v3, Ll/᩷ۢۧ;

    iget-wide v6, v0, Ll/۬ۢۧ;->ܿ:J

    invoke-direct {v3, v6, v7}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {v2, v3}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 284
    iput-boolean v4, v0, Ll/۬ۢۧ;->ۘ:Z

    .line 289
    :cond_1d
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v1

    const-wide/16 v3, 0xc

    add-long/2addr v1, v3

    iput-wide v1, v0, Ll/۬ۢۧ;->ܺ:J

    const/4 v1, 0x6

    .line 290
    iput v1, v0, Ll/۬ۢۧ;->ᩴ:I

    return v5

    .line 271
    :cond_1e
    :goto_d
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v1

    iget v3, v10, Ll/ۗۢۧ;->ܽ:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    add-long/2addr v1, v15

    iput-wide v1, v0, Ll/۬ۢۧ;->ܺ:J

    return v5

    .line 247
    :pswitch_4
    iget v2, v0, Ll/۬ۢۧ;->᩻:I

    add-int/lit8 v2, v2, -0x4

    .line 248
    new-instance v3, Ll/ᩳ֨֫;

    invoke-direct {v3, v2}, Ll/ᩳ֨֫;-><init>(I)V

    .line 249
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    invoke-interface {v1, v6, v5, v2}, Ll/۠᩷ۧ;->readFully([BII)V

    const v1, 0x6c726468

    .line 371
    invoke-static {v1, v3}, Ll/ۨۢۧ;->֫(ILl/ᩳ֨֫;)Ll/ۨۢۧ;

    move-result-object v2

    .line 372
    invoke-virtual {v2}, Ll/ۨۢۧ;->getType()I

    move-result v3

    if-ne v3, v1, :cond_29

    .line 376
    const-class v1, Ll/۫ۢۧ;

    invoke-virtual {v2, v1}, Ll/ۨۢۧ;->֫(Ljava/lang/Class;)Ll/᩶ۢۧ;

    move-result-object v1

    check-cast v1, Ll/۫ۢۧ;

    if-eqz v1, :cond_28

    .line 381
    iput-object v1, v0, Ll/۬ۢۧ;->֫:Ll/۫ۢۧ;

    .line 383
    iget v3, v1, Ll/۫ۢۧ;->ܽ:I

    int-to-long v6, v3

    iget v1, v1, Ll/۫ۢۧ;->ۧ:I

    int-to-long v8, v1

    mul-long v6, v6, v8

    iput-wide v6, v0, Ll/۬ۢۧ;->ܿ:J

    .line 384
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 386
    iget-object v2, v2, Ll/ۨۢۧ;->֫:Ll/ܳ۬ܺ;

    .line 375
    invoke-virtual {v2, v5}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v2

    const/4 v3, 0x0

    .line 386
    :cond_1f
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_27

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶ۢۧ;

    .line 387
    invoke-interface {v6}, Ll/᩶ۢۧ;->getType()I

    move-result v7

    const v8, 0x6c727473

    if-ne v7, v8, :cond_1f

    .line 388
    check-cast v6, Ll/ۨۢۧ;

    add-int/lit8 v7, v3, 0x1

    .line 500
    const-class v8, Ll/ۤۢۧ;

    invoke-virtual {v6, v8}, Ll/ۨۢۧ;->֫(Ljava/lang/Class;)Ll/᩶ۢۧ;

    move-result-object v8

    check-cast v8, Ll/ۤۢۧ;

    .line 501
    const-class v9, Ll/᩺ۢۧ;

    invoke-virtual {v6, v9}, Ll/ۨۢۧ;->֫(Ljava/lang/Class;)Ll/᩶ۢۧ;

    move-result-object v9

    check-cast v9, Ll/᩺ۢۧ;

    if-nez v8, :cond_20

    const-string v3, "Missing Stream Header"

    .line 503
    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_f

    :cond_20
    if-nez v9, :cond_21

    const-string v3, "Missing Stream Format"

    .line 507
    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_f

    .line 92
    :cond_21
    iget v10, v8, Ll/ۤۢۧ;->֫:I

    int-to-long v11, v10

    iget v10, v8, Ll/ۤۢۧ;->ᩳ:I

    int-to-long v13, v10

    const-wide/32 v15, 0xf4240

    mul-long v13, v13, v15

    iget v10, v8, Ll/ۤۢۧ;->ۧ:I

    int-to-long v4, v10

    sget-object v10, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide v15, v4

    invoke-static/range {v11 .. v17}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v4

    .line 511
    iget-object v9, v9, Ll/᩺ۢۧ;->֫:Ll/۠ᩴ֫;

    .line 512
    invoke-virtual {v9}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v10

    .line 513
    invoke-virtual {v10, v3}, Ll/֨ᩴ֫;->ܺ(I)V

    .line 514
    iget v11, v8, Ll/ۤۢۧ;->ܳ:I

    if-eqz v11, :cond_22

    .line 516
    invoke-virtual {v10, v11}, Ll/֨ᩴ֫;->ۖ(I)V

    .line 518
    :cond_22
    const-class v11, Ll/ܰۢۧ;

    invoke-virtual {v6, v11}, Ll/ۨۢۧ;->֫(Ljava/lang/Class;)Ll/᩶ۢۧ;

    move-result-object v6

    check-cast v6, Ll/ܰۢۧ;

    if-eqz v6, :cond_23

    .line 520
    iget-object v6, v6, Ll/ܰۢۧ;->֫:Ljava/lang/String;

    invoke-virtual {v10, v6}, Ll/֨ᩴ֫;->ᩳ(Ljava/lang/String;)V

    .line 522
    :cond_23
    iget-object v6, v9, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v6}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result v6

    const/4 v9, 0x1

    if-eq v6, v9, :cond_25

    const/4 v9, 0x2

    if-ne v6, v9, :cond_24

    goto :goto_10

    :cond_24
    :goto_f
    const/4 v3, 0x0

    goto :goto_11

    .line 524
    :cond_25
    :goto_10
    iget-object v9, v0, Ll/۬ۢۧ;->ܳ:Ll/᩸᩷ۧ;

    invoke-interface {v9, v3, v6}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v6

    .line 525
    invoke-virtual {v10}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v9

    invoke-interface {v6, v9}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 526
    invoke-interface {v6, v4, v5}, Ll/᩵ۢۧ;->֫(J)V

    .line 527
    iget-wide v9, v0, Ll/۬ۢۧ;->ܿ:J

    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v0, Ll/۬ۢۧ;->ܿ:J

    .line 528
    new-instance v4, Ll/ۛۢۧ;

    invoke-direct {v4, v3, v8, v6}, Ll/ۛۢۧ;-><init>(ILl/ۤۢۧ;Ll/᩵ۢۧ;)V

    move-object v3, v4

    :goto_11
    if-eqz v3, :cond_26

    .line 394
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_26
    move v3, v7

    const/4 v4, 0x1

    const/4 v5, 0x0

    goto/16 :goto_e

    :cond_27
    const/4 v3, 0x0

    new-array v2, v3, [Ll/ۛۢۧ;

    .line 398
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ۛۢۧ;

    iput-object v1, v0, Ll/۬ۢۧ;->ܽ:[Ll/ۛۢۧ;

    .line 399
    iget-object v1, v0, Ll/۬ۢۧ;->ܳ:Ll/᩸᩷ۧ;

    invoke-interface {v1}, Ll/᩸᩷ۧ;->ܳ()V

    const/4 v1, 0x3

    .line 251
    iput v1, v0, Ll/۬ۢۧ;->ᩴ:I

    return v3

    :cond_28
    const-string v1, "AviHeader not found"

    const/4 v2, 0x0

    .line 378
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_29
    const/4 v1, 0x0

    .line 373
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unexpected header list type "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    invoke-virtual {v2}, Ll/ۨۢۧ;->getType()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 373
    invoke-static {v2, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 234
    :pswitch_5
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v1, v2, v4, v14}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 235
    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 586
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v1

    iput v1, v10, Ll/ۗۢۧ;->֫:I

    .line 596
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v1

    iput v1, v10, Ll/ۗۢۧ;->ܽ:I

    .line 597
    iput v4, v10, Ll/ۗۢۧ;->ۧ:I

    .line 587
    iget v1, v10, Ll/ۗۢۧ;->֫:I

    if-ne v1, v11, :cond_2b

    .line 591
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩷()I

    move-result v1

    iput v1, v10, Ll/ۗۢۧ;->ۧ:I

    const v2, 0x6c726468

    if-ne v1, v2, :cond_2a

    .line 242
    iget v1, v10, Ll/ۗۢۧ;->ܽ:I

    iput v1, v0, Ll/۬ۢۧ;->᩻:I

    const/4 v1, 0x2

    .line 243
    iput v1, v0, Ll/۬ۢۧ;->ᩴ:I

    return v4

    .line 238
    :cond_2a
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "hdrl expected, found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v10, Ll/ۗۢۧ;->ۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_2b
    const/4 v1, 0x0

    .line 588
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "LIST expected, found: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v10, Ll/ۗۢۧ;->֫:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 225
    :pswitch_6
    invoke-virtual/range {p0 .. p1}, Ll/۬ۢۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 226
    invoke-interface {v1, v14}, Ll/۠᩷ۧ;->ܽ(I)V

    const/4 v1, 0x1

    .line 231
    iput v1, v0, Ll/۬ۢۧ;->ᩴ:I

    const/4 v1, 0x0

    return v1

    :cond_2c
    const-string v1, "AVI Header List not found"

    .line 228
    invoke-static {v1, v13}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 3

    const-wide/16 p3, -0x1

    .line 321
    iput-wide p3, p0, Ll/۬ۢۧ;->ܺ:J

    const/4 p3, 0x0

    .line 322
    iput-object p3, p0, Ll/۬ۢۧ;->ᩳ:Ll/ۛۢۧ;

    .line 323
    iget-object p3, p0, Ll/۬ۢۧ;->ܽ:[Ll/ۛۢۧ;

    array-length p4, p3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_0

    aget-object v2, p3, v1

    .line 324
    invoke-virtual {v2, p1, p2}, Ll/ۛۢۧ;->ۧ(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 p3, 0x0

    cmp-long v1, p1, p3

    if-nez v1, :cond_2

    .line 327
    iget-object p1, p0, Ll/۬ۢۧ;->ܽ:[Ll/ۛۢۧ;

    array-length p1, p1

    if-nez p1, :cond_1

    .line 329
    iput v0, p0, Ll/۬ۢۧ;->ᩴ:I

    return-void

    :cond_1
    const/4 p1, 0x3

    .line 331
    iput p1, p0, Ll/۬ۢۧ;->ᩴ:I

    return-void

    :cond_2
    const/4 p1, 0x6

    .line 335
    iput p1, p0, Ll/۬ۢۧ;->ᩴ:I

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 2

    const/4 v0, 0x0

    .line 197
    iput v0, p0, Ll/۬ۢۧ;->ᩴ:I

    .line 199
    iget-boolean v0, p0, Ll/۬ۢۧ;->ۡ:Z

    if-eqz v0, :cond_0

    .line 200
    new-instance v0, Ll/ۡᩴۧ;

    iget-object v1, p0, Ll/۬ۢۧ;->᩵:Ll/ۤۘۧ;

    invoke-direct {v0, p1, v1}, Ll/ۡᩴۧ;-><init>(Ll/᩸᩷ۧ;Ll/ۜᩴۧ;)V

    move-object p1, v0

    .line 201
    :cond_0
    iput-object p1, p0, Ll/۬ۢۧ;->ܳ:Ll/᩸᩷ۧ;

    const-wide/16 v0, -0x1

    .line 202
    iput-wide v0, p0, Ll/۬ۢۧ;->ܺ:J

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 4

    .line 207
    iget-object v0, p0, Ll/۬ۢۧ;->ۖ:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    const/16 v2, 0xc

    const/4 v3, 0x0

    invoke-interface {p1, v3, v2, v1}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 208
    invoke-virtual {v0, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 209
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩷()I

    move-result p1

    const v1, 0x46464952

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    .line 212
    invoke-virtual {v0, p1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 213
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩷()I

    move-result p1

    const v0, 0x20495641

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v3
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
