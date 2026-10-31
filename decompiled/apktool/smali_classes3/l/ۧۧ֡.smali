.class public final Ll/ۧۧ֡;
.super Ljava/lang/Object;
.source "04FP"


# instance fields
.field public ֫:[Ll/۟֫֡;

.field public ۜ:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I

.field public final ᩻:Ll/۫ܽ֡;


# direct methods
.method public constructor <init>(Ll/۫ܽ֡;)V
    .locals 1

    .line 400
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 383
    iput v0, p0, Ll/ۧۧ֡;->ۜ:I

    const/16 v0, 0x8

    new-array v0, v0, [Ll/۟֫֡;

    .line 390
    iput-object v0, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    const/4 v0, 0x7

    .line 392
    iput v0, p0, Ll/ۧۧ֡;->ܳ:I

    const/4 v0, 0x0

    .line 393
    iput v0, p0, Ll/ۧۧ֡;->ᩳ:I

    .line 394
    iput v0, p0, Ll/ۧۧ֡;->ۧ:I

    const/16 v0, 0x1000

    .line 402
    iput v0, p0, Ll/ۧۧ֡;->ܿ:I

    .line 404
    iput-object p1, p0, Ll/ۧۧ֡;->᩻:Ll/۫ܽ֡;

    return-void
.end method

.method private ֫(Ll/۟֫֡;)V
    .locals 6

    .line 434
    iget v0, p1, Ll/۟֫֡;->֫:I

    .line 437
    iget v1, p0, Ll/ۧۧ֡;->ܿ:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    .line 408
    iget-object p1, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    iget-object p1, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۧۧ֡;->ܳ:I

    .line 410
    iput v2, p0, Ll/ۧۧ֡;->ᩳ:I

    .line 411
    iput v2, p0, Ll/ۧۧ֡;->ۧ:I

    return-void

    .line 443
    :cond_0
    iget v3, p0, Ll/ۧۧ֡;->ۧ:I

    add-int/2addr v3, v0

    sub-int/2addr v3, v1

    .line 444
    invoke-direct {p0, v3}, Ll/ۧۧ֡;->ۧ(I)V

    .line 446
    iget v1, p0, Ll/ۧۧ֡;->ᩳ:I

    add-int/lit8 v1, v1, 0x1

    iget-object v3, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    array-length v4, v3

    if-le v1, v4, :cond_1

    .line 447
    array-length v1, v3

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [Ll/۟֫֡;

    .line 448
    array-length v4, v3

    array-length v5, v3

    invoke-static {v3, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 449
    iget-object v2, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۧۧ֡;->ܳ:I

    .line 450
    iput-object v1, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    .line 452
    :cond_1
    iget v1, p0, Ll/ۧۧ֡;->ܳ:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Ll/ۧۧ֡;->ܳ:I

    .line 453
    iget-object v2, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    aput-object p1, v2, v1

    .line 454
    iget p1, p0, Ll/ۧۧ֡;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۧۧ֡;->ᩳ:I

    .line 455
    iget p1, p0, Ll/ۧۧ֡;->ۧ:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۧۧ֡;->ۧ:I

    return-void
.end method

.method private ۧ(I)V
    .locals 4

    if-lez p1, :cond_1

    .line 419
    iget-object v0, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Ll/ۧۧ֡;->ܳ:I

    if-lt v0, v2, :cond_0

    if-lez p1, :cond_0

    .line 420
    iget-object v2, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    aget-object v2, v2, v0

    iget v2, v2, Ll/۟֫֡;->֫:I

    sub-int/2addr p1, v2

    .line 421
    iget v3, p0, Ll/ۧۧ֡;->ۧ:I

    sub-int/2addr v3, v2

    iput v3, p0, Ll/ۧۧ֡;->ۧ:I

    .line 422
    iget v2, p0, Ll/ۧۧ֡;->ᩳ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۧۧ֡;->ᩳ:I

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 425
    :cond_0
    iget-object p1, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    add-int/lit8 v2, v2, 0x1

    add-int v0, v2, v1

    iget v3, p0, Ll/ۧۧ֡;->ᩳ:I

    invoke-static {p1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 427
    iget-object p1, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    iget v0, p0, Ll/ۧۧ֡;->ܳ:I

    add-int/lit8 v0, v0, 0x1

    add-int v2, v0, v1

    const/4 v3, 0x0

    invoke-static {p1, v0, v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 428
    iget p1, p0, Ll/ۧۧ֡;->ܳ:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ۧۧ֡;->ܳ:I

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    const/16 v0, 0x4000

    .line 566
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 569
    iget v0, p0, Ll/ۧۧ֡;->ܿ:I

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-ge p1, v0, :cond_1

    .line 572
    iget v0, p0, Ll/ۧۧ֡;->ۜ:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ۧۧ֡;->ۜ:I

    :cond_1
    const/4 v0, 0x1

    .line 575
    iput-boolean v0, p0, Ll/ۧۧ֡;->ܽ:Z

    .line 576
    iput p1, p0, Ll/ۧۧ֡;->ܿ:I

    .line 581
    iget v1, p0, Ll/ۧۧ֡;->ۧ:I

    if-ge p1, v1, :cond_3

    if-nez p1, :cond_2

    .line 408
    iget-object p1, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    iget-object p1, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    array-length p1, p1

    sub-int/2addr p1, v0

    iput p1, p0, Ll/ۧۧ֡;->ܳ:I

    const/4 p1, 0x0

    .line 410
    iput p1, p0, Ll/ۧۧ֡;->ᩳ:I

    .line 411
    iput p1, p0, Ll/ۧۧ֡;->ۧ:I

    return-void

    :cond_2
    sub-int/2addr v1, p1

    .line 585
    invoke-direct {p0, v1}, Ll/ۧۧ֡;->ۧ(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final ֫(III)V
    .locals 1

    .line 533
    iget-object v0, p0, Ll/ۧۧ֡;->᩻:Ll/۫ܽ֡;

    if-ge p1, p2, :cond_0

    or-int/2addr p1, p3

    .line 534
    invoke-virtual {v0, p1}, Ll/۫ܽ֡;->writeByte(I)V

    return-void

    :cond_0
    or-int/2addr p3, p2

    .line 539
    invoke-virtual {v0, p3}, Ll/۫ܽ֡;->writeByte(I)V

    sub-int/2addr p1, p2

    :goto_0
    const/16 p2, 0x80

    if-lt p1, p2, :cond_1

    and-int/lit8 p3, p1, 0x7f

    or-int/2addr p2, p3

    .line 545
    invoke-virtual {v0, p2}, Ll/۫ܽ֡;->writeByte(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    .line 548
    :cond_1
    invoke-virtual {v0, p1}, Ll/۫ܽ֡;->writeByte(I)V

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 13

    .line 461
    iget-boolean v0, p0, Ll/ۧۧ֡;->ܽ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 462
    iget v0, p0, Ll/ۧۧ֡;->ۜ:I

    iget v2, p0, Ll/ۧۧ֡;->ܿ:I

    const/16 v3, 0x20

    const/16 v4, 0x1f

    if-ge v0, v2, :cond_0

    .line 464
    invoke-virtual {p0, v0, v4, v3}, Ll/ۧۧ֡;->֫(III)V

    .line 466
    :cond_0
    iput-boolean v1, p0, Ll/ۧۧ֡;->ܽ:Z

    const v0, 0x7fffffff

    .line 467
    iput v0, p0, Ll/ۧۧ֡;->ۜ:I

    .line 468
    iget v0, p0, Ll/ۧۧ֡;->ܿ:I

    invoke-virtual {p0, v0, v4, v3}, Ll/ۧۧ֡;->֫(III)V

    .line 471
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_b

    .line 472
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟֫֡;

    .line 473
    iget-object v4, v3, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    invoke-virtual {v4}, Ll/ۨܽ֡;->ۡ()Ll/ۨܽ֡;

    move-result-object v4

    .line 474
    iget-object v5, v3, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    .line 478
    sget-object v6, Ll/ܽۧ֡;->֫:Ljava/util/Map;

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    const/4 v7, 0x1

    const/4 v8, -0x1

    if-eqz v6, :cond_3

    .line 480
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    add-int/lit8 v9, v6, 0x1

    if-le v9, v7, :cond_4

    const/16 v10, 0x8

    if-ge v9, v10, :cond_4

    .line 486
    sget-object v10, Ll/ܽۧ֡;->ۧ:[Ll/۟֫֡;

    aget-object v11, v10, v6

    iget-object v11, v11, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    invoke-static {v11, v5}, Ll/᩶۟᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    move v6, v9

    goto :goto_1

    .line 488
    :cond_2
    aget-object v10, v10, v9

    iget-object v10, v10, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    invoke-static {v10, v5}, Ll/᩶۟᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    add-int/lit8 v6, v6, 0x2

    move v12, v9

    move v9, v6

    move v6, v12

    goto :goto_1

    :cond_3
    const/4 v9, -0x1

    :cond_4
    const/4 v6, -0x1

    move v6, v9

    const/4 v9, -0x1

    :goto_1
    if-ne v9, v8, :cond_7

    .line 495
    iget v10, p0, Ll/ۧۧ֡;->ܳ:I

    add-int/2addr v10, v7

    iget-object v7, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    array-length v7, v7

    :goto_2
    if-ge v10, v7, :cond_7

    .line 496
    iget-object v11, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    aget-object v11, v11, v10

    iget-object v11, v11, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    invoke-static {v11, v4}, Ll/᩶۟᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 497
    iget-object v11, p0, Ll/ۧۧ֡;->֫:[Ll/۟֫֡;

    aget-object v11, v11, v10

    iget-object v11, v11, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    invoke-static {v11, v5}, Ll/᩶۟᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 498
    iget v7, p0, Ll/ۧۧ֡;->ܳ:I

    sub-int/2addr v10, v7

    sget-object v7, Ll/ܽۧ֡;->ۧ:[Ll/۟֫֡;

    array-length v7, v7

    add-int v9, v10, v7

    goto :goto_3

    :cond_5
    if-ne v6, v8, :cond_6

    .line 501
    iget v6, p0, Ll/ۧۧ֡;->ܳ:I

    sub-int v6, v10, v6

    sget-object v11, Ll/ܽۧ֡;->ۧ:[Ll/۟֫֡;

    array-length v11, v11

    add-int/2addr v6, v11

    :cond_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    if-eq v9, v8, :cond_8

    const/16 v3, 0x7f

    const/16 v4, 0x80

    .line 509
    invoke-virtual {p0, v9, v3, v4}, Ll/ۧۧ֡;->֫(III)V

    goto :goto_4

    :cond_8
    const/16 v7, 0x40

    if-ne v6, v8, :cond_9

    .line 512
    iget-object v6, p0, Ll/ۧۧ֡;->᩻:Ll/۫ܽ֡;

    invoke-virtual {v6, v7}, Ll/۫ܽ֡;->writeByte(I)V

    .line 513
    invoke-virtual {p0, v4}, Ll/ۧۧ֡;->֫(Ll/ۨܽ֡;)V

    .line 514
    invoke-virtual {p0, v5}, Ll/ۧۧ֡;->֫(Ll/ۨܽ֡;)V

    .line 515
    invoke-direct {p0, v3}, Ll/ۧۧ֡;->֫(Ll/۟֫֡;)V

    goto :goto_4

    .line 516
    :cond_9
    sget-object v8, Ll/۟֫֡;->ᩳ:Ll/ۨܽ֡;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    invoke-virtual {v8}, Ll/ۨܽ֡;->᩷()I

    move-result v9

    invoke-virtual {v4, v8, v9}, Ll/ۨܽ֡;->֫(Ll/ۨܽ֡;I)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 516
    sget-object v8, Ll/۟֫֡;->ܳ:Ll/ۨܽ֡;

    invoke-virtual {v8, v4}, Ll/ۨܽ֡;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    const/16 v3, 0xf

    .line 519
    invoke-virtual {p0, v6, v3, v1}, Ll/ۧۧ֡;->֫(III)V

    .line 520
    invoke-virtual {p0, v5}, Ll/ۧۧ֡;->֫(Ll/ۨܽ֡;)V

    goto :goto_4

    :cond_a
    const/16 v4, 0x3f

    .line 523
    invoke-virtual {p0, v6, v4, v7}, Ll/ۧۧ֡;->֫(III)V

    .line 524
    invoke-virtual {p0, v5}, Ll/ۧۧ֡;->֫(Ll/ۨܽ֡;)V

    .line 525
    invoke-direct {p0, v3}, Ll/ۧۧ֡;->֫(Ll/۟֫֡;)V

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public final ֫(Ll/ۨܽ֡;)V
    .locals 4

    .line 552
    invoke-static {}, Ll/᩺ۧ֡;->֫()Ll/᩺ۧ֡;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/᩺ۧ֡;->֫(Ll/ۨܽ֡;)I

    move-result v0

    invoke-virtual {p1}, Ll/ۨܽ֡;->᩷()I

    move-result v1

    iget-object v2, p0, Ll/ۧۧ֡;->᩻:Ll/۫ܽ֡;

    const/16 v3, 0x7f

    if-ge v0, v1, :cond_0

    .line 553
    new-instance v0, Ll/۫ܽ֡;

    invoke-direct {v0}, Ll/۫ܽ֡;-><init>()V

    .line 554
    invoke-static {}, Ll/᩺ۧ֡;->֫()Ll/᩺ۧ֡;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Ll/᩺ۧ֡;->֫(Ll/ۨܽ֡;Ll/۫ܽ֡;)V

    .line 555
    invoke-virtual {v0}, Ll/۫ܽ֡;->ᩳ()Ll/ۨܽ֡;

    move-result-object p1

    .line 556
    invoke-virtual {p1}, Ll/ۨܽ֡;->᩷()I

    move-result v0

    const/16 v1, 0x80

    invoke-virtual {p0, v0, v3, v1}, Ll/ۧۧ֡;->֫(III)V

    .line 557
    invoke-virtual {v2, p1}, Ll/۫ܽ֡;->֫(Ll/ۨܽ֡;)V

    return-void

    .line 559
    :cond_0
    invoke-virtual {p1}, Ll/ۨܽ֡;->᩷()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v3, v1}, Ll/ۧۧ֡;->֫(III)V

    .line 560
    invoke-virtual {v2, p1}, Ll/۫ܽ֡;->֫(Ll/ۨܽ֡;)V

    return-void
.end method
