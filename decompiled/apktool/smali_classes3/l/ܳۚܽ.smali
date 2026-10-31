.class public final Ll/ܳۚܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# instance fields
.field public ֫:[J

.field public ۜ:I

.field public ۢ:Ljava/util/ArrayList;

.field public ۧ:Z

.field public ܳ:Z

.field public final ܽ:I

.field public ܿ:I

.field public ᩳ:Z

.field public final ᩷:Ljava/util/ArrayList;

.field public final ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܳۚܽ;->᩷:Ljava/util/ArrayList;

    .line 250
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܳۚܽ;->᩻:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 252
    iput-boolean v0, p0, Ll/ܳۚܽ;->ܳ:Z

    .line 254
    iput v0, p0, Ll/ܳۚܽ;->ۜ:I

    const/4 v1, -0x1

    .line 255
    iput v1, p0, Ll/ܳۚܽ;->ܿ:I

    .line 256
    iput-boolean v0, p0, Ll/ܳۚܽ;->ᩳ:Z

    .line 259
    iput p1, p0, Ll/ܳۚܽ;->ܽ:I

    return-void
.end method

.method private ܽ()[I
    .locals 10

    .line 467
    iget-object v0, p0, Ll/ܳۚܽ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-array v0, v2, [I

    return-object v0

    .line 471
    :cond_0
    new-instance v1, Ll/ܿۚܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 473
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 474
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    invoke-virtual {v3}, [I->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    const/4 v4, 0x1

    const/4 v5, 0x1

    .line 475
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    .line 476
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [I

    .line 477
    aget v7, v6, v2

    aget v8, v3, v4

    add-int/lit8 v9, v8, 0x1

    if-gt v7, v9, :cond_1

    .line 479
    aget v6, v6, v4

    invoke-static {v8, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    aput v6, v3, v4

    goto :goto_1

    .line 481
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    invoke-virtual {v6}, [I->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 485
    :cond_2
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [I

    const/4 v3, 0x0

    .line 488
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v3, v5, :cond_3

    mul-int/lit8 v5, v3, 0x2

    .line 489
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [I

    aget v6, v6, v2

    aput v6, v0, v5

    add-int/2addr v5, v4

    .line 490
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [I

    aget v6, v6, v4

    aput v6, v0, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final ֫()Ll/ۧۚܽ;
    .locals 8

    .line 353
    iget-object v0, p0, Ll/ܳۚܽ;->ۢ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܳۚܽ;->᩻:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 354
    iget-object v0, p0, Ll/ܳۚܽ;->ۢ:Ljava/util/ArrayList;

    iget-boolean v2, p0, Ll/ܳۚܽ;->ᩳ:Z

    invoke-static {v0, v2}, Ll/ܰ֨ܽ;->֫(Ljava/util/ArrayList;Z)Ll/ۧۚܽ;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    :cond_0
    iget v0, p0, Ll/ܳۚܽ;->ۜ:I

    if-nez v0, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 360
    iget-boolean v0, p0, Ll/ܳۚܽ;->ܳ:Z

    if-eqz v0, :cond_1

    .line 361
    new-instance v0, Ll/ܽۚܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 363
    :cond_1
    new-instance v0, Ll/ᩳۚܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 367
    :cond_2
    iget v0, p0, Ll/ܳۚܽ;->ۜ:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_6

    .line 368
    iget-boolean v0, p0, Ll/ܳۚܽ;->ܳ:Z

    if-eqz v0, :cond_3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧۚܽ;

    invoke-interface {v0}, Ll/ۧۚܽ;->negate()Ll/۟᩵ܽ;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧۚܽ;

    .line 369
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 370
    iget-boolean v3, p0, Ll/ܳۚܽ;->ܳ:Z

    if-eqz v3, :cond_4

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧۚܽ;

    invoke-interface {v3}, Ll/ۧۚܽ;->negate()Ll/۟᩵ܽ;

    move-result-object v3

    invoke-interface {v0, v3}, Ll/ۧۚܽ;->֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧۚܽ;

    invoke-interface {v0, v3}, Ll/ۧۚܽ;->ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object v0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-object v0

    .line 375
    :cond_6
    iget-object v0, p0, Ll/ܳۚܽ;->֫:[J

    const/16 v4, 0x400

    if-nez v0, :cond_7

    new-array v0, v4, [J

    iput-object v0, p0, Ll/ܳۚܽ;->֫:[J

    .line 377
    :cond_7
    iget-object v0, p0, Ll/ܳۚܽ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 383
    iget-boolean v0, p0, Ll/ܳۚܽ;->ܳ:Z

    if-eqz v0, :cond_9

    .line 384
    iget-object v0, p0, Ll/ܳۚܽ;->֫:[J

    .line 459
    array-length v2, v0

    new-array v2, v2, [J

    .line 460
    :goto_2
    array-length v4, v0

    if-ge v3, v4, :cond_8

    .line 461
    aget-wide v4, v0, v3

    not-long v4, v4

    aput-wide v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 385
    :cond_8
    invoke-direct {p0}, Ll/ܳۚܽ;->ܽ()[I

    move-result-object v0

    goto :goto_3

    .line 387
    :cond_9
    iget-object v0, p0, Ll/ܳۚܽ;->֫:[J

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    .line 388
    invoke-direct {p0}, Ll/ܳۚܽ;->ܽ()[I

    move-result-object v0

    .line 390
    :goto_3
    new-instance v3, Ll/ᩴۚܽ;

    iget-boolean v4, p0, Ll/ܳۚܽ;->ܳ:Z

    invoke-direct {v3, v2, v0, v4}, Ll/ᩴۚܽ;-><init>([J[IZ)V

    goto/16 :goto_7

    .line 391
    :cond_a
    iget-boolean v0, p0, Ll/ܳۚܽ;->ᩳ:Z

    iget v5, p0, Ll/ܳۚܽ;->ܽ:I

    if-nez v0, :cond_e

    iget-boolean v0, p0, Ll/ܳۚܽ;->ܳ:Z

    if-eqz v0, :cond_b

    goto :goto_4

    .line 409
    :cond_b
    iget-object v0, p0, Ll/ܳۚܽ;->֫:[J

    .line 410
    iput-boolean v2, p0, Ll/ܳۚܽ;->ۧ:Z

    and-int/lit8 v2, v5, 0x2

    if-eqz v2, :cond_d

    and-int/lit8 v2, v5, 0x40

    if-eqz v2, :cond_c

    .line 413
    new-instance v3, Ll/ۤ֨ܽ;

    invoke-direct {v3, v0}, Ll/ۤ֨ܽ;-><init>([J)V

    goto :goto_7

    .line 415
    :cond_c
    new-instance v3, Ll/ᩴ֡ܽ;

    invoke-direct {v3, v0}, Ll/ᩴ֡ܽ;-><init>([J)V

    goto :goto_7

    .line 418
    :cond_d
    new-instance v3, Ll/ܶ֡ܽ;

    invoke-direct {v3, v0}, Ll/ܶ֡ܽ;-><init>([J)V

    goto :goto_7

    .line 395
    :cond_e
    :goto_4
    iget-boolean v0, p0, Ll/ܳۚܽ;->ܳ:Z

    if-eqz v0, :cond_f

    iget-object v0, p0, Ll/ܳۚܽ;->֫:[J

    .line 459
    array-length v2, v0

    new-array v2, v2, [J

    const/4 v4, 0x0

    .line 460
    :goto_5
    array-length v6, v0

    if-ge v4, v6, :cond_10

    .line 461
    aget-wide v6, v0, v4

    not-long v6, v6

    aput-wide v6, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 396
    :cond_f
    iget-object v0, p0, Ll/ܳۚܽ;->֫:[J

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    :cond_10
    and-int/lit8 v0, v5, 0x2

    if-eqz v0, :cond_12

    and-int/lit8 v0, v5, 0x40

    if-eqz v0, :cond_11

    .line 399
    new-instance v0, Ll/ۨ֨ܽ;

    iget-boolean v3, p0, Ll/ܳۚܽ;->ܳ:Z

    invoke-direct {v0, v2, v3}, Ll/ۨ֨ܽ;-><init>([JZ)V

    goto :goto_6

    .line 401
    :cond_11
    new-instance v0, Ll/᩵֡ܽ;

    iget-boolean v3, p0, Ll/ܳۚܽ;->ܳ:Z

    invoke-direct {v0, v2, v3}, Ll/᩵֡ܽ;-><init>([JZ)V

    goto :goto_6

    .line 404
    :cond_12
    new-instance v0, Ll/ᩴۚܽ;

    new-array v3, v3, [I

    iget-boolean v4, p0, Ll/ܳۚܽ;->ܳ:Z

    invoke-direct {v0, v2, v3, v4}, Ll/ᩴۚܽ;-><init>([J[IZ)V

    :goto_6
    move-object v3, v0

    .line 423
    :goto_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۚܽ;

    .line 424
    iget-boolean v2, p0, Ll/ܳۚܽ;->ܳ:Z

    if-eqz v2, :cond_13

    .line 426
    invoke-interface {v1}, Ll/ۧۚܽ;->negate()Ll/۟᩵ܽ;

    move-result-object v1

    invoke-interface {v3, v1}, Ll/ۧۚܽ;->֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object v1

    goto :goto_9

    .line 428
    :cond_13
    invoke-interface {v3, v1}, Ll/ۧۚܽ;->ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object v1

    :goto_9
    move-object v3, v1

    goto :goto_8

    :cond_14
    return-object v3
.end method

.method public final ֫(I)V
    .locals 2

    .line 287
    iget v0, p0, Ll/ܳۚܽ;->ܽ:I

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_2

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    .line 290
    invoke-static {p1}, Ll/ۗᩳۘ;->ۧ(I)I

    move-result p1

    .line 283
    invoke-virtual {p0, p1, p1}, Ll/ܳۚܽ;->֫(II)V

    return-void

    .line 293
    :cond_0
    invoke-static {p1}, Ll/᩹۠ܽ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result p1

    .line 283
    :cond_1
    invoke-virtual {p0, p1, p1}, Ll/ܳۚܽ;->֫(II)V

    return-void

    :cond_2
    invoke-virtual {p0, p1, p1}, Ll/ܳۚܽ;->֫(II)V

    return-void
.end method

.method public final ֫(II)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 263
    iget v3, v0, Ll/ܳۚܽ;->ۜ:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, v0, Ll/ܳۚܽ;->ۜ:I

    const/4 v3, 0x0

    .line 265
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v5

    const v6, 0xffff

    .line 266
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-gt v5, v6, :cond_5

    const/16 v7, 0x80

    if-ge v6, v7, :cond_0

    const/4 v7, 0x2

    goto :goto_0

    :cond_0
    const/16 v7, 0x400

    .line 437
    :goto_0
    iget-object v8, v0, Ll/ܳۚܽ;->֫:[J

    if-nez v8, :cond_1

    new-array v3, v7, [J

    iput-object v3, v0, Ll/ܳۚܽ;->֫:[J

    goto :goto_1

    .line 438
    :cond_1
    array-length v9, v8

    if-lt v9, v7, :cond_2

    iget-boolean v9, v0, Ll/ܳۚܽ;->ۧ:Z

    if-eqz v9, :cond_3

    .line 440
    :cond_2
    array-length v9, v8

    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v7

    iput-object v7, v0, Ll/ܳۚܽ;->֫:[J

    .line 441
    iput-boolean v3, v0, Ll/ܳۚܽ;->ۧ:Z

    :cond_3
    :goto_1
    ushr-int/lit8 v3, v5, 0x6

    ushr-int/lit8 v7, v6, 0x6

    const-wide/16 v8, -0x1

    shl-long v10, v8, v5

    and-int/lit8 v12, v6, 0x3f

    rsub-int/lit8 v12, v12, 0x3f

    ushr-long v12, v8, v12

    if-ne v3, v7, :cond_4

    .line 449
    iget-object v7, v0, Ll/ܳۚܽ;->֫:[J

    aget-wide v8, v7, v3

    and-long/2addr v10, v12

    or-long/2addr v8, v10

    aput-wide v8, v7, v3

    goto :goto_2

    .line 451
    :cond_4
    iget-object v14, v0, Ll/ܳۚܽ;->֫:[J

    aget-wide v15, v14, v3

    or-long/2addr v10, v15

    aput-wide v10, v14, v3

    add-int/2addr v3, v4

    .line 452
    invoke-static {v14, v3, v7, v8, v9}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 453
    iget-object v3, v0, Ll/ܳۚܽ;->֫:[J

    aget-wide v8, v3, v7

    or-long/2addr v8, v12

    aput-wide v8, v3, v7

    .line 269
    :goto_2
    iget v3, v0, Ll/ܳۚܽ;->ܿ:I

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v0, Ll/ܳۚܽ;->ܿ:I

    const v3, 0xdfff

    if-gt v5, v3, :cond_5

    const v3, 0xd800

    if-lt v6, v3, :cond_5

    .line 272
    iput-boolean v4, v0, Ll/ܳۚܽ;->ᩳ:Z

    :cond_5
    const/high16 v3, 0x10000

    if-lt v2, v3, :cond_6

    .line 277
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 278
    iget-object v3, v0, Ll/ܳۚܽ;->᩷:Ljava/util/ArrayList;

    filled-new-array {v1, v2}, [I

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method

.method public final ֫(Ll/ۧۚܽ;)V
    .locals 1

    .line 339
    iget-object v0, p0, Ll/ܳۚܽ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 343
    iput-boolean p1, p0, Ll/ܳۚܽ;->ܳ:Z

    return-void
.end method

.method public final ۧ(II)V
    .locals 4

    .line 301
    iget v0, p0, Ll/ܳۚܽ;->ܽ:I

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_5

    and-int/lit8 v0, v0, 0x40

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 313
    iget-object v0, p0, Ll/ܳۚܽ;->ۢ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 314
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܳۚܽ;->ۢ:Ljava/util/ArrayList;

    .line 316
    :cond_0
    iget-object v0, p0, Ll/ܳۚܽ;->ۢ:Ljava/util/ArrayList;

    filled-new-array {p1, p2}, [I

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    iget-boolean v0, p0, Ll/ܳۚܽ;->ᩳ:Z

    if-nez v0, :cond_4

    const v0, 0xdfff

    if-gt p1, v0, :cond_4

    const p1, 0xd800

    if-lt p2, p1, :cond_4

    .line 319
    iput-boolean v1, p0, Ll/ܳۚܽ;->ᩳ:Z

    return-void

    :cond_1
    const/16 v0, 0x41

    .line 323
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/16 v2, 0x5a

    .line 324
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-gt v0, v2, :cond_3

    if-ge p1, v0, :cond_2

    add-int/lit8 v3, v0, -0x1

    .line 326
    invoke-virtual {p0, p1, v3}, Ll/ܳۚܽ;->֫(II)V

    .line 327
    :cond_2
    invoke-static {v0}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result p1

    invoke-static {v2}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Ll/ܳۚܽ;->֫(II)V

    if-ge v2, p2, :cond_4

    add-int/2addr v2, v1

    .line 328
    invoke-virtual {p0, v2, p2}, Ll/ܳۚܽ;->֫(II)V

    return-void

    :cond_3
    if-gt p1, p2, :cond_4

    .line 330
    invoke-virtual {p0, p1, p2}, Ll/ܳۚܽ;->֫(II)V

    :cond_4
    return-void

    .line 334
    :cond_5
    invoke-virtual {p0, p1, p2}, Ll/ܳۚܽ;->֫(II)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 347
    iget v0, p0, Ll/ܳۚܽ;->ۜ:I

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܳۚܽ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܳۚܽ;->ۢ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 348
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
