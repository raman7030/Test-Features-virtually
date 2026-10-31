.class public final Ll/᩻۫ۢ;
.super Ll/ᩳۜ֡;
.source "C6PQ"


# instance fields
.field public final ۜ:[Z

.field public final ۡ:I

.field public final ۢ:I

.field public ۧ:I

.field public final ܳ:I

.field public final ܺ:Ll/ۢ۫ۢ;

.field public final ܽ:I

.field public final ܿ:[Ll/ۛۜ֡;

.field public ᩳ:I

.field public final ᩷:I

.field public final ᩻:Ljava/util/IdentityHashMap;


# direct methods
.method public constructor <init>(Ll/᩸ܳ֡;)V
    .locals 11

    .line 368
    invoke-direct {p0}, Ll/ᩳۜ֡;-><init>()V

    .line 364
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/᩻۫ۢ;->᩻:Ljava/util/IdentityHashMap;

    .line 129
    iget-object v0, p1, Ll/᩸ܳ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 369
    new-array v1, v0, [Ll/ۛۜ֡;

    iput-object v1, p0, Ll/᩻۫ۢ;->ܿ:[Ll/ۛۜ֡;

    .line 370
    new-array v0, v0, [Z

    iput-object v0, p0, Ll/᩻۫ۢ;->ۜ:[Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 371
    :goto_0
    iget-object v2, p0, Ll/᩻۫ۢ;->ܿ:[Ll/ۛۜ֡;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    new-instance v3, Ll/ۛۜ֡;

    invoke-virtual {p1, v1}, Ll/᩸ܳ֡;->֫(I)Ll/ۜ᩻֡;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Ll/ۛۜ֡;-><init>(Ll/ۜ᩻֡;I)V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 456
    :cond_0
    sget-object v1, Ll/ۙ۬ۢ;->֡:Ll/᩸ܳ֡;

    const/4 v2, 0x2

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-eq p1, v1, :cond_1

    goto/16 :goto_2

    .line 457
    :cond_1
    iget-object v1, p1, Ll/᩸ܳ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۜ᩻֡;

    .line 458
    iget v6, v5, Ll/᩺ܳ֡;->ᩳ:I

    const/16 v7, 0x2d

    if-ne v6, v7, :cond_2

    instance-of v6, v5, Ll/᩹ۜ֡;

    if-eqz v6, :cond_2

    iget-boolean v6, v5, Ll/ۜ᩻֡;->᩷:Z

    if-nez v6, :cond_2

    .line 459
    invoke-virtual {v5}, Ll/᩺ܳ֡;->֫()I

    move-result v6

    if-eq v6, v2, :cond_3

    goto :goto_1

    .line 460
    :cond_3
    invoke-virtual {v5, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v6

    iget-object v6, v6, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 461
    invoke-virtual {v5, v4}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v8

    iget-object v8, v8, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 462
    instance-of v9, v6, Ll/᩸ۜ֡;

    if-eqz v9, :cond_2

    invoke-virtual {v6}, Ll/᩺ܳ֡;->֫()I

    move-result v9

    if-ne v9, v4, :cond_2

    instance-of v9, v8, Ll/۬᩻֡;

    if-eqz v9, :cond_2

    .line 463
    invoke-virtual {v8}, Ll/᩺ܳ֡;->֫()I

    move-result v9

    if-ne v9, v4, :cond_2

    .line 464
    invoke-virtual {v8, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v8

    iget-object v8, v8, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    iget-object v9, p1, Ll/᩸ܳ֡;->᩻:[Ll/ۢۜ֡;

    aget-object v7, v9, v7

    if-eq v8, v7, :cond_4

    goto :goto_1

    .line 465
    :cond_4
    invoke-virtual {v6, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v6

    iget-object v6, v6, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 466
    invoke-virtual {v6}, Ll/᩺ܳ֡;->֫()I

    move-result v7

    if-ne v7, v4, :cond_2

    invoke-virtual {v6, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v6

    instance-of v7, v6, Ll/ۡۜ֡;

    if-eqz v7, :cond_2

    check-cast v6, Ll/ۡۜ֡;

    iget v6, v6, Ll/ۡۜ֡;->ܿ:I

    const/16 v7, 0x2e

    if-ne v6, v7, :cond_2

    .line 467
    iget v1, v5, Ll/ۜ᩻֡;->ۜ:I

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v1, -0x1

    .line 372
    :goto_3
    iput v1, p0, Ll/᩻۫ۢ;->ۡ:I

    .line 413
    sget-object v1, Ll/ۙ۬ۢ;->֡:Ll/᩸ܳ֡;

    if-eq p1, v1, :cond_6

    goto/16 :goto_4

    .line 414
    :cond_6
    iget-object v5, p1, Ll/᩸ܳ֡;->ܳ:[Ll/᩷ۜ֡;

    const/16 v6, 0x2a

    aget-object v5, v5, v6

    invoke-static {v5}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v5

    .line 415
    invoke-virtual {v5}, Ll/᩺ܳ֡;->֫()I

    move-result v7

    if-ne v7, v4, :cond_c

    invoke-virtual {v5, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v5

    instance-of v7, v5, Ll/ۡۜ֡;

    if-eqz v7, :cond_c

    check-cast v5, Ll/ۡۜ֡;

    iget v7, v5, Ll/ۡۜ֡;->ܿ:I

    const/16 v8, 0x2c

    if-eq v7, v8, :cond_7

    goto/16 :goto_4

    .line 417
    :cond_7
    iget-object v5, v5, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    invoke-static {v5}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v5

    .line 418
    instance-of v7, v5, Ll/᩹ۜ֡;

    if-eqz v7, :cond_c

    check-cast v5, Ll/᩹ۜ֡;

    iget-boolean v7, v5, Ll/ۜ᩻֡;->᩷:Z

    if-nez v7, :cond_c

    .line 419
    invoke-virtual {v5}, Ll/᩺ܳ֡;->֫()I

    move-result v7

    if-eq v7, v2, :cond_8

    goto/16 :goto_4

    .line 420
    :cond_8
    invoke-virtual {v5, v4}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v7

    iget-object v7, v7, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 421
    invoke-virtual {v5, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v9

    iget-object v9, v9, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    instance-of v10, v9, Ll/᩸ۜ֡;

    if-eqz v10, :cond_c

    check-cast v9, Ll/᩸ۜ֡;

    .line 422
    invoke-virtual {v9}, Ll/᩺ܳ֡;->֫()I

    move-result v10

    if-ne v10, v2, :cond_c

    instance-of v10, v7, Ll/۬᩻֡;

    if-eqz v10, :cond_c

    .line 423
    invoke-virtual {v7}, Ll/᩺ܳ֡;->֫()I

    move-result v10

    if-ne v10, v4, :cond_c

    .line 424
    invoke-virtual {v7, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v7

    iget-object v7, v7, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    iget-object v10, p1, Ll/᩸ܳ֡;->᩻:[Ll/ۢۜ֡;

    aget-object v6, v10, v6

    if-eq v7, v6, :cond_9

    goto :goto_4

    .line 425
    :cond_9
    invoke-virtual {v9, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v6

    iget-object v6, v6, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-static {v6}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v6

    .line 426
    invoke-virtual {v6}, Ll/᩺ܳ֡;->֫()I

    move-result v7

    if-ne v7, v4, :cond_c

    invoke-virtual {v6, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v6

    instance-of v7, v6, Ll/ۡۜ֡;

    if-eqz v7, :cond_c

    check-cast v6, Ll/ۡۜ֡;

    iget v7, v6, Ll/ۡۜ֡;->ܿ:I

    const/16 v10, 0x2b

    if-eq v7, v10, :cond_a

    goto :goto_4

    .line 428
    :cond_a
    iget-object v6, v6, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    invoke-static {v6}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v6

    .line 429
    invoke-virtual {v6}, Ll/᩺ܳ֡;->֫()I

    move-result v7

    if-ne v7, v4, :cond_c

    invoke-virtual {v6, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v6

    instance-of v7, v6, Ll/ۡۜ֡;

    if-eqz v7, :cond_c

    check-cast v6, Ll/ۡۜ֡;

    iget v7, v6, Ll/ۡۜ֡;->ܿ:I

    if-ne v7, v8, :cond_c

    iget-object v6, v6, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    .line 431
    invoke-static {v6}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v6

    iget-object v7, v9, Ll/᩻᩻֡;->ۢ:Ll/ܳ᩻֡;

    if-eq v6, v7, :cond_b

    goto :goto_4

    .line 432
    :cond_b
    iget v5, v5, Ll/ۜ᩻֡;->ۜ:I

    goto :goto_5

    :cond_c
    :goto_4
    const/4 v5, -0x1

    .line 373
    :goto_5
    iput v5, p0, Ll/᩻۫ۢ;->ܽ:I

    if-eq p1, v1, :cond_d

    goto :goto_8

    .line 438
    :cond_d
    iget-object v1, p1, Ll/᩸ܳ֡;->ܳ:[Ll/᩷ۜ֡;

    const/16 v5, 0x48

    aget-object v1, v1, v5

    invoke-static {v1}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v1

    .line 439
    instance-of v6, v1, Ll/ᩳ᩻֡;

    if-eqz v6, :cond_15

    check-cast v1, Ll/ᩳ᩻֡;

    invoke-virtual {v1}, Ll/᩺ܳ֡;->֫()I

    move-result v6

    const/4 v7, 0x3

    if-eq v6, v7, :cond_e

    goto :goto_8

    :cond_e
    const/4 v6, 0x0

    :goto_6
    if-ge v6, v7, :cond_14

    .line 441
    invoke-virtual {v1, v6}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v8

    iget-object v8, v8, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-static {v8}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v8

    .line 442
    invoke-virtual {v8}, Ll/᩺ܳ֡;->֫()I

    move-result v9

    if-eq v9, v4, :cond_f

    goto :goto_8

    .line 443
    :cond_f
    invoke-virtual {v8, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v8

    if-ge v6, v2, :cond_11

    .line 445
    instance-of v9, v8, Ll/ܽ᩻֡;

    if-eqz v9, :cond_15

    move-object v9, v8

    check-cast v9, Ll/ܽ᩻֡;

    iget v9, v9, Ll/ܽ᩻֡;->ܽ:I

    if-nez v6, :cond_10

    const/16 v10, 0x5d

    goto :goto_7

    :cond_10
    const/4 v10, -0x1

    :goto_7
    if-eq v9, v10, :cond_12

    goto :goto_8

    .line 447
    :cond_11
    instance-of v9, v8, Ll/ۧۜ֡;

    if-eqz v9, :cond_15

    move-object v9, v8

    check-cast v9, Ll/ۧۜ֡;

    iget v9, v9, Ll/ۧۜ֡;->ܿ:I

    if-eq v9, v5, :cond_12

    goto :goto_8

    .line 449
    :cond_12
    iget-object v8, v8, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-static {v8}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v8

    iget-object v9, v1, Ll/᩻᩻֡;->ۢ:Ll/ܳ᩻֡;

    if-eq v8, v9, :cond_13

    goto :goto_8

    :cond_13
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 451
    :cond_14
    iget v3, v1, Ll/ۜ᩻֡;->ۜ:I

    .line 374
    :cond_15
    :goto_8
    iput v3, p0, Ll/᩻۫ۢ;->ܳ:I

    const/16 v8, 0x48

    const/4 v9, 0x1

    const/16 v5, 0xd

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v4, p1

    .line 375
    invoke-static/range {v4 .. v9}, Ll/᩻۫ۢ;->֫(Ll/᩸ܳ֡;IIZIZ)I

    move-result v0

    iput v0, p0, Ll/᩻۫ۢ;->᩷:I

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/16 v2, 0x1a

    const/16 v3, 0x25

    const/4 v4, 0x1

    move-object v1, p1

    .line 377
    invoke-static/range {v1 .. v6}, Ll/᩻۫ۢ;->֫(Ll/᩸ܳ֡;IIZIZ)I

    move-result v0

    iput v0, p0, Ll/᩻۫ۢ;->ۢ:I

    .line 379
    invoke-static {p1}, Ll/ۢ۫ۢ;->֫(Ll/᩸ܳ֡;)Ll/ۢ۫ۢ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻۫ۢ;->ܺ:Ll/ۢ۫ۢ;

    return-void
.end method

.method public static ֫(Ll/᩸ܳ֡;IIZIZ)I
    .locals 5

    .line 385
    sget-object v0, Ll/ۙ۬ۢ;->֡:Ll/᩸ܳ֡;

    const/4 v1, -0x1

    if-eq p0, v0, :cond_0

    goto :goto_1

    .line 387
    :cond_0
    iget-object p0, p0, Ll/᩸ܳ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, -0x1

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ᩻֡;

    .line 388
    iget v3, v2, Ll/᩺ܳ֡;->ᩳ:I

    if-ne v3, p1, :cond_1

    instance-of v3, v2, Ll/ᩳ᩻֡;

    if-eqz v3, :cond_1

    check-cast v2, Ll/ᩳ᩻֡;

    .line 389
    invoke-virtual {v2}, Ll/᩺ܳ֡;->֫()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 390
    invoke-static {v2, v3, p2, p3}, Ll/᩻۫ۢ;->֫(Ll/ᩳ᩻֡;IIZ)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    .line 391
    invoke-static {v2, v3, p4, p5}, Ll/᩻۫ۢ;->֫(Ll/ᩳ᩻֡;IIZ)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    if-eq v0, v1, :cond_4

    :goto_1
    return v1

    .line 393
    :cond_4
    iget v0, v2, Ll/ۜ᩻֡;->ۜ:I

    goto :goto_0

    :cond_5
    return v0
.end method

.method public static ֫(Ll/ᩳ᩻֡;IIZ)Z
    .locals 3

    .line 400
    invoke-virtual {p0, p1}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object p1

    iget-object p1, p1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-static {p1}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_1

    .line 402
    invoke-virtual {p1}, Ll/᩺ܳ֡;->֫()I

    move-result p3

    if-ne p3, v0, :cond_3

    invoke-virtual {p1, v1}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object p1

    instance-of p3, p1, Ll/ۧۜ֡;

    if-eqz p3, :cond_3

    check-cast p1, Ll/ۧۜ֡;

    iget p3, p1, Ll/ۧۜ֡;->ܿ:I

    iget v2, p0, Ll/᩺ܳ֡;->ᩳ:I

    if-eq p3, v2, :cond_0

    goto :goto_1

    .line 404
    :cond_0
    iget-object p1, p1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-static {p1}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object p1

    :cond_1
    if-gez p2, :cond_2

    .line 406
    iget-object p0, p0, Ll/᩻᩻֡;->ۢ:Ll/ܳ᩻֡;

    if-ne p1, p0, :cond_3

    goto :goto_0

    .line 407
    :cond_2
    invoke-virtual {p1}, Ll/᩺ܳ֡;->֫()I

    move-result p3

    if-ne p3, v0, :cond_3

    invoke-virtual {p1, v1}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object p1

    instance-of p3, p1, Ll/ۡۜ֡;

    if-eqz p3, :cond_3

    check-cast p1, Ll/ۡۜ֡;

    iget p3, p1, Ll/ۡۜ֡;->ܿ:I

    if-ne p3, p2, :cond_3

    iget-object p1, p1, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    .line 408
    invoke-static {p1}, Ll/ۢ۫ۢ;->֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object p1

    iget-object p0, p0, Ll/᩻᩻֡;->ۢ:Ll/ܳ᩻֡;

    if-ne p1, p0, :cond_3

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method


# virtual methods
.method public final ۧ()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 474
    :goto_0
    iget-object v2, p0, Ll/᩻۫ۢ;->ܿ:[Ll/ۛۜ֡;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    new-instance v3, Ll/ۛۜ֡;

    aget-object v4, v2, v1

    iget-object v4, v4, Ll/ۛۜ֡;->֫:Ll/ۜ᩻֡;

    invoke-direct {v3, v4, v1}, Ll/ۛۜ֡;-><init>(Ll/ۜ᩻֡;I)V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 475
    :cond_0
    iget-object v1, p0, Ll/ᩳۜ֡;->֫:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 476
    iget-object v1, p0, Ll/᩻۫ۢ;->᩻:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->clear()V

    .line 477
    iput v0, p0, Ll/᩻۫ۢ;->ᩳ:I

    return-void
.end method
