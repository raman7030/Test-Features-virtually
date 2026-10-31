.class public abstract Ll/ܽۜ֡;
.super Ljava/lang/Object;
.source "LAS4"


# static fields
.field public static final ۧ:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/ܽۜ֡;->ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    sget-object v0, Ll/ܽۜ֡;->ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 55
    iput p1, p0, Ll/ܽۜ֡;->֫:I

    return-void
.end method

.method public static ֫(Ll/᩸ܳ֡;Ll/᩵ܳ֡;)Ll/۠ۜ֡;
    .locals 2

    if-nez p1, :cond_0

    .line 62
    sget-object p1, Ll/ۡܳ֡;->ܳ:Ll/ۡܳ֡;

    .line 66
    :cond_0
    iget-object v0, p1, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    if-eqz v0, :cond_2

    sget-object v1, Ll/ۡܳ֡;->ܳ:Ll/ۡܳ֡;

    if-ne p1, v1, :cond_1

    goto :goto_0

    .line 71
    :cond_1
    sget-object v1, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    .line 72
    invoke-static {p0, v0}, Ll/ܽۜ֡;->֫(Ll/᩸ܳ֡;Ll/᩵ܳ֡;)Ll/۠ۜ֡;

    move-result-object v0

    .line 74
    iget-object p0, p0, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    iget p1, p1, Ll/᩵ܳ֡;->֫:I

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩺ܳ֡;

    const/4 p1, 0x0

    .line 75
    invoke-virtual {p0, p1}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object p0

    check-cast p0, Ll/ۡۜ֡;

    .line 76
    iget-object p0, p0, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    iget p0, p0, Ll/᩺ܳ֡;->ܿ:I

    invoke-static {v0, p0}, Ll/۠ۜ֡;->֫(Ll/ܽۜ֡;I)Ll/۠ۜ֡;

    move-result-object p0

    return-object p0

    .line 67
    :cond_2
    :goto_0
    sget-object p0, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    return-object p0
.end method

.method public static ֫(Ll/ܽۜ֡;Ll/ܽۜ֡;ZLl/ۧ᩷֡;)Ll/ܽۜ֡;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    if-eq v0, v1, :cond_30

    .line 141
    invoke-virtual/range {p0 .. p1}, Ll/ܽۜ֡;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_e

    .line 143
    :cond_0
    instance-of v4, v0, Ll/۠ۜ֡;

    const v5, 0x7fffffff

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_15

    instance-of v8, v1, Ll/۠ۜ֡;

    if-eqz v8, :cond_15

    .line 144
    check-cast v0, Ll/۠ۜ֡;

    iget-object v4, v0, Ll/۠ۜ֡;->ܽ:Ll/ܽۜ֡;

    iget v8, v0, Ll/۠ۜ֡;->ᩳ:I

    check-cast v1, Ll/۠ۜ֡;

    iget-object v9, v1, Ll/۠ۜ֡;->ܽ:Ll/ܽۜ֡;

    iget v10, v1, Ll/۠ۜ֡;->ᩳ:I

    if-eqz v3, :cond_2

    .line 201
    invoke-virtual {v3, v0, v1}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܽۜ֡;

    if-eqz v11, :cond_1

    return-object v11

    .line 203
    :cond_1
    invoke-virtual {v3, v1, v0}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܽۜ֡;

    if-eqz v11, :cond_2

    return-object v11

    :cond_2
    const/4 v11, 0x2

    const/4 v12, 0x0

    if-eqz v2, :cond_4

    .line 303
    sget-object v5, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    if-ne v0, v5, :cond_3

    goto :goto_1

    :cond_3
    if-ne v1, v5, :cond_7

    goto :goto_1

    .line 307
    :cond_4
    sget-object v13, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    if-ne v0, v13, :cond_5

    if-ne v1, v13, :cond_5

    move-object v5, v13

    goto :goto_1

    :cond_5
    if-ne v0, v13, :cond_6

    .line 309
    filled-new-array {v10, v5}, [I

    move-result-object v5

    new-array v13, v11, [Ll/ܽۜ֡;

    aput-object v9, v13, v6

    aput-object v12, v13, v7

    .line 311
    new-instance v14, Ll/ۧ᩻֡;

    invoke-direct {v14, v13, v5}, Ll/ۧ᩻֡;-><init>([Ll/ܽۜ֡;[I)V

    :goto_0
    move-object v5, v14

    goto :goto_1

    :cond_6
    if-ne v1, v13, :cond_7

    .line 316
    filled-new-array {v8, v5}, [I

    move-result-object v5

    new-array v13, v11, [Ll/ܽۜ֡;

    aput-object v4, v13, v6

    aput-object v12, v13, v7

    .line 318
    new-instance v14, Ll/ۧ᩻֡;

    invoke-direct {v14, v13, v5}, Ll/ۧ᩻֡;-><init>([Ll/ܽۜ֡;[I)V

    goto :goto_0

    :cond_7
    move-object v5, v12

    :goto_1
    if-eqz v5, :cond_9

    if-eqz v3, :cond_8

    .line 209
    invoke-virtual {v3, v0, v1, v5}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;Ll/ܽۜ֡;)V

    :cond_8
    return-object v5

    :cond_9
    if-ne v8, v10, :cond_d

    .line 214
    invoke-static {v4, v9, v2, v3}, Ll/ܽۜ֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;ZLl/ۧ᩷֡;)Ll/ܽۜ֡;

    move-result-object v2

    if-ne v2, v4, :cond_a

    return-object v0

    :cond_a
    if-ne v2, v9, :cond_b

    return-object v1

    .line 222
    :cond_b
    invoke-static {v2, v8}, Ll/۠ۜ֡;->֫(Ll/ܽۜ֡;I)Ll/۠ۜ֡;

    move-result-object v2

    if-eqz v3, :cond_c

    .line 223
    invoke-virtual {v3, v0, v1, v2}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;Ll/ܽۜ֡;)V

    :cond_c
    return-object v2

    :cond_d
    if-eq v0, v1, :cond_e

    if-eqz v4, :cond_f

    .line 229
    invoke-virtual {v4, v9}, Ll/ܽۜ֡;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    :cond_e
    move-object v12, v4

    :cond_f
    if-eqz v12, :cond_12

    new-array v2, v11, [I

    aput v8, v2, v6

    aput v10, v2, v7

    if-le v8, v10, :cond_10

    aput v10, v2, v6

    aput v8, v2, v7

    :cond_10
    new-array v4, v11, [Ll/ܽۜ֡;

    aput-object v12, v4, v6

    aput-object v12, v4, v7

    .line 240
    new-instance v5, Ll/ۧ᩻֡;

    invoke-direct {v5, v4, v2}, Ll/ۧ᩻֡;-><init>([Ll/ܽۜ֡;[I)V

    if-eqz v3, :cond_11

    .line 241
    invoke-virtual {v3, v0, v1, v5}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;Ll/ܽۜ֡;)V

    :cond_11
    return-object v5

    :cond_12
    new-array v2, v11, [I

    aput v8, v2, v6

    aput v10, v2, v7

    new-array v5, v11, [Ll/ܽۜ֡;

    aput-object v4, v5, v6

    aput-object v9, v5, v7

    if-le v8, v10, :cond_13

    aput v10, v2, v6

    aput v8, v2, v7

    new-array v5, v11, [Ll/ܽۜ֡;

    aput-object v9, v5, v6

    aput-object v4, v5, v7

    .line 254
    :cond_13
    new-instance v4, Ll/ۧ᩻֡;

    invoke-direct {v4, v5, v2}, Ll/ۧ᩻֡;-><init>([Ll/ܽۜ֡;[I)V

    if-eqz v3, :cond_14

    .line 255
    invoke-virtual {v3, v0, v1, v4}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;Ll/ܽۜ֡;)V

    :cond_14
    return-object v4

    :cond_15
    if-eqz v2, :cond_17

    .line 152
    instance-of v5, v0, Ll/᩷᩻֡;

    if-eqz v5, :cond_16

    return-object v0

    .line 153
    :cond_16
    instance-of v5, v1, Ll/᩷᩻֡;

    if-eqz v5, :cond_17

    return-object v1

    :cond_17
    if-eqz v4, :cond_18

    .line 158
    new-instance v4, Ll/ۧ᩻֡;

    check-cast v0, Ll/۠ۜ֡;

    invoke-direct {v4, v0}, Ll/ۧ᩻֡;-><init>(Ll/۠ۜ֡;)V

    move-object v0, v4

    .line 160
    :cond_18
    instance-of v4, v1, Ll/۠ۜ֡;

    if-eqz v4, :cond_19

    .line 161
    new-instance v4, Ll/ۧ᩻֡;

    check-cast v1, Ll/۠ۜ֡;

    invoke-direct {v4, v1}, Ll/ۧ᩻֡;-><init>(Ll/۠ۜ֡;)V

    move-object v1, v4

    .line 163
    :cond_19
    check-cast v0, Ll/ۧ᩻֡;

    check-cast v1, Ll/ۧ᩻֡;

    if-eqz v3, :cond_1b

    .line 352
    invoke-virtual {v3, v0, v1}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽۜ֡;

    if-eqz v4, :cond_1a

    .line 354
    sget-boolean v0, Ll/᩺᩻֡;->ܺ:Z

    return-object v4

    .line 357
    :cond_1a
    invoke-virtual {v3, v1, v0}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽۜ֡;

    if-eqz v4, :cond_1b

    .line 359
    sget-boolean v0, Ll/᩺᩻֡;->ܺ:Z

    return-object v4

    .line 369
    :cond_1b
    iget-object v4, v0, Ll/ۧ᩻֡;->ᩳ:[I

    iget-object v5, v0, Ll/ۧ᩻֡;->ܽ:[Ll/ܽۜ֡;

    array-length v6, v4

    iget-object v7, v1, Ll/ۧ᩻֡;->ᩳ:[I

    iget-object v8, v1, Ll/ۧ᩻֡;->ܽ:[Ll/ܽۜ֡;

    array-length v9, v7

    add-int/2addr v6, v9

    new-array v6, v6, [I

    .line 371
    array-length v9, v4

    array-length v10, v7

    add-int/2addr v9, v10

    new-array v10, v9, [Ll/ܽۜ֡;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 374
    :goto_2
    array-length v15, v4

    if-ge v11, v15, :cond_22

    array-length v15, v7

    if-ge v12, v15, :cond_22

    .line 375
    aget-object v15, v5, v11

    .line 376
    aget-object v14, v8, v12

    move-object/from16 p1, v0

    .line 377
    aget v0, v4, v11

    move-object/from16 v16, v1

    aget v1, v7, v12

    if-ne v0, v1, :cond_20

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_1c

    if-nez v15, :cond_1c

    if-nez v14, :cond_1c

    const/4 v1, 0x1

    goto :goto_3

    :cond_1c
    const/4 v1, 0x0

    :goto_3
    if-eqz v15, :cond_1d

    if-eqz v14, :cond_1d

    .line 384
    invoke-virtual {v15, v14}, Ll/ܽۜ֡;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1d

    const/16 v17, 0x1

    goto :goto_4

    :cond_1d
    const/16 v17, 0x0

    :goto_4
    if-nez v1, :cond_1f

    if-eqz v17, :cond_1e

    goto :goto_5

    .line 391
    :cond_1e
    invoke-static {v15, v14, v2, v3}, Ll/ܽۜ֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;ZLl/ۧ᩷֡;)Ll/ܽۜ֡;

    move-result-object v1

    .line 392
    aput-object v1, v10, v13

    .line 393
    aput v0, v6, v13

    goto :goto_6

    .line 386
    :cond_1f
    :goto_5
    aput-object v15, v10, v13

    .line 387
    aput v0, v6, v13

    :goto_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    :cond_20
    if-ge v0, v1, :cond_21

    .line 399
    aput-object v15, v10, v13

    .line 400
    aput v0, v6, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    .line 404
    :cond_21
    aput-object v14, v10, v13

    .line 405
    aput v1, v6, v13

    :goto_7
    add-int/lit8 v12, v12, 0x1

    :goto_8
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p1

    move-object/from16 v1, v16

    goto :goto_2

    :cond_22
    move-object/from16 p1, v0

    move-object/from16 v16, v1

    .line 412
    array-length v0, v4

    if-ge v11, v0, :cond_23

    .line 413
    :goto_9
    array-length v0, v4

    if-ge v11, v0, :cond_24

    .line 414
    aget-object v0, v5, v11

    aput-object v0, v10, v13

    .line 415
    aget v0, v4, v11

    aput v0, v6, v13

    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    .line 420
    :cond_23
    :goto_a
    array-length v0, v7

    if-ge v12, v0, :cond_24

    .line 421
    aget-object v0, v8, v12

    aput-object v0, v10, v13

    .line 422
    aget v0, v7, v12

    aput v0, v6, v13

    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v12, v12, 0x1

    goto :goto_a

    :cond_24
    if-ge v13, v9, :cond_27

    const/4 v0, 0x1

    if-ne v13, v0, :cond_26

    const/4 v0, 0x0

    .line 430
    aget-object v1, v10, v0

    aget v0, v6, v0

    .line 431
    invoke-static {v1, v0}, Ll/۠ۜ֡;->֫(Ll/ܽۜ֡;I)Ll/۠ۜ֡;

    move-result-object v0

    if-eqz v3, :cond_25

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    .line 433
    invoke-virtual {v3, v1, v2, v0}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;Ll/ܽۜ֡;)V

    :cond_25
    return-object v0

    :cond_26
    move-object/from16 v1, p1

    move-object/from16 v2, v16

    .line 436
    invoke-static {v10, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, [Ll/ܽۜ֡;

    .line 437
    invoke-static {v6, v13}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    goto :goto_b

    :cond_27
    move-object/from16 v1, p1

    move-object/from16 v2, v16

    .line 440
    :goto_b
    new-instance v0, Ll/ۧ᩻֡;

    invoke-direct {v0, v10, v6}, Ll/ۧ᩻֡;-><init>([Ll/ܽۜ֡;[I)V

    .line 445
    invoke-virtual {v0, v1}, Ll/ۧ᩻֡;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    if-eqz v3, :cond_28

    .line 446
    invoke-virtual {v3, v1, v2, v1}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;Ll/ܽۜ֡;)V

    .line 447
    :cond_28
    sget-boolean v0, Ll/᩺᩻֡;->ܺ:Z

    return-object v1

    .line 450
    :cond_29
    invoke-virtual {v0, v2}, Ll/ۧ᩻֡;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2b

    if-eqz v3, :cond_2a

    .line 451
    invoke-virtual {v3, v1, v2, v2}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;Ll/ܽۜ֡;)V

    .line 452
    :cond_2a
    sget-boolean v0, Ll/᩺᩻֡;->ܺ:Z

    return-object v2

    .line 472
    :cond_2b
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const/4 v5, 0x0

    .line 475
    :goto_c
    array-length v6, v10

    if-ge v5, v6, :cond_2d

    .line 476
    aget-object v6, v10, v5

    .line 477
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2c

    .line 478
    invoke-virtual {v4, v6, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2c
    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :cond_2d
    const/4 v5, 0x0

    .line 482
    :goto_d
    array-length v6, v10

    if-ge v5, v6, :cond_2e

    .line 483
    aget-object v6, v10, v5

    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽۜ֡;

    aput-object v6, v10, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    :cond_2e
    if-eqz v3, :cond_2f

    .line 458
    invoke-virtual {v3, v1, v2, v0}, Ll/ۧ᩷֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;Ll/ܽۜ֡;)V

    .line 460
    :cond_2f
    sget-boolean v1, Ll/᩺᩻֡;->ܺ:Z

    :cond_30
    :goto_e
    return-object v0
.end method

.method public static ֫(Ll/ܽۜ֡;Ll/ᩳۜ֡;Ljava/util/IdentityHashMap;)Ll/ܽۜ֡;
    .locals 7

    .line 549
    invoke-virtual {p0}, Ll/ܽۜ֡;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 553
    :cond_0
    invoke-virtual {p2, p0}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۜ֡;

    if-eqz v0, :cond_1

    return-object v0

    .line 558
    :cond_1
    invoke-virtual {p1, p0}, Ll/ᩳۜ֡;->֫(Ll/ܽۜ֡;)Ll/ܽۜ֡;

    move-result-object v0

    iget-object v1, p1, Ll/ᩳۜ֡;->֫:Ljava/util/HashMap;

    if-eqz v0, :cond_2

    .line 560
    invoke-virtual {p2, p0, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    .line 565
    :cond_2
    invoke-virtual {p0}, Ll/ܽۜ֡;->ܽ()I

    move-result v0

    new-array v0, v0, [Ll/ܽۜ֡;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 566
    :goto_0
    array-length v5, v0

    const/4 v6, 0x1

    if-ge v3, v5, :cond_7

    .line 567
    invoke-virtual {p0, v3}, Ll/ܽۜ֡;->֫(I)Ll/ܽۜ֡;

    move-result-object v5

    invoke-static {v5, p1, p2}, Ll/ܽۜ֡;->֫(Ll/ܽۜ֡;Ll/ᩳۜ֡;Ljava/util/IdentityHashMap;)Ll/ܽۜ֡;

    move-result-object v5

    if-nez v4, :cond_3

    .line 568
    invoke-virtual {p0, v3}, Ll/ܽۜ֡;->֫(I)Ll/ܽۜ֡;

    move-result-object v6

    if-eq v5, v6, :cond_6

    :cond_3
    if-nez v4, :cond_5

    .line 570
    invoke-virtual {p0}, Ll/ܽۜ֡;->ܽ()I

    move-result v0

    new-array v0, v0, [Ll/ܽۜ֡;

    const/4 v4, 0x0

    .line 571
    :goto_1
    invoke-virtual {p0}, Ll/ܽۜ֡;->ܽ()I

    move-result v6

    if-ge v4, v6, :cond_4

    .line 572
    invoke-virtual {p0, v4}, Ll/ܽۜ֡;->֫(I)Ll/ܽۜ֡;

    move-result-object v6

    aput-object v6, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    .line 578
    :cond_5
    aput-object v5, v0, v3

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    if-nez v4, :cond_a

    .line 25
    sget-object p1, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    if-ne p0, p1, :cond_8

    goto :goto_2

    .line 26
    :cond_8
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۜ֡;

    if-eqz p1, :cond_9

    goto :goto_2

    .line 31
    :cond_9
    invoke-virtual {v1, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    :goto_2
    invoke-virtual {p2, p0, p0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    .line 589
    :cond_a
    array-length p1, v0

    if-nez p1, :cond_b

    .line 590
    sget-object p1, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    goto :goto_3

    .line 592
    :cond_b
    array-length p1, v0

    if-ne p1, v6, :cond_c

    .line 593
    aget-object p1, v0, v2

    invoke-virtual {p0, v2}, Ll/ܽۜ֡;->ۧ(I)I

    move-result v0

    invoke-static {p1, v0}, Ll/۠ۜ֡;->֫(Ll/ܽۜ֡;I)Ll/۠ۜ֡;

    move-result-object p1

    goto :goto_3

    .line 596
    :cond_c
    move-object p1, p0

    check-cast p1, Ll/ۧ᩻֡;

    .line 597
    new-instance v2, Ll/ۧ᩻֡;

    iget-object p1, p1, Ll/ۧ᩻֡;->ᩳ:[I

    invoke-direct {v2, v0, p1}, Ll/ۧ᩻֡;-><init>([Ll/ܽۜ֡;[I)V

    move-object p1, v2

    .line 25
    :goto_3
    sget-object v0, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    if-ne p1, v0, :cond_d

    goto :goto_4

    .line 26
    :cond_d
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۜ֡;

    if-eqz v0, :cond_e

    goto :goto_4

    .line 31
    :cond_e
    invoke-virtual {v1, p1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 601
    :goto_4
    invoke-virtual {p2, p1, p1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    invoke-virtual {p2, p0, p1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method


# virtual methods
.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public final hashCode()I
    .locals 1

    .line 97
    iget v0, p0, Ll/ܽۜ֡;->֫:I

    return v0
.end method

.method public abstract ֫(I)Ll/ܽۜ֡;
.end method

.method public final ֫()Z
    .locals 3

    .line 92
    invoke-virtual {p0}, Ll/ܽۜ֡;->ܽ()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ll/ܽۜ֡;->ۧ(I)I

    move-result v0

    const v2, 0x7fffffff

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract ۧ(I)I
.end method

.method public ۧ()Z
    .locals 1

    .line 87
    sget-object v0, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract ܽ()I
.end method
