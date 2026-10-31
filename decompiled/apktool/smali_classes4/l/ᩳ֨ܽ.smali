.class public final Ll/ᩳ֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# static fields
.field public static final ֫:Ll/۟ۘܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v0, 0x3c00

    const-wide/16 v2, 0x0

    .line 1410
    invoke-static/range {v0 .. v5}, Ll/۟ۘܽ;->֫(JJZZ)Ll/۟ۘܽ;

    move-result-object v0

    sput-object v0, Ll/ᩳ֨ܽ;->֫:Ll/۟ۘܽ;

    return-void
.end method

.method public static ֫(Ll/ۖ֨ܽ;)Ll/۟ۘܽ;
    .locals 17

    move-object/from16 v0, p0

    .line 1556
    instance-of v1, v0, Ll/ۢ֨ܽ;

    .line 1557
    instance-of v2, v0, Ll/ۡ֨ܽ;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    instance-of v2, v0, Ll/ܺ֨ܽ;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 1558
    :goto_1
    instance-of v4, v0, Ll/ᩴ֨ܽ;

    if-nez v4, :cond_3

    instance-of v4, v0, Ll/᩵֨ܽ;

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v4, 0x1

    :goto_3
    if-nez v1, :cond_4

    if-nez v2, :cond_4

    if-nez v4, :cond_4

    .line 1560
    sget-object v0, Ll/۟ۘܽ;->ۜ:Ll/۟ۘܽ;

    return-object v0

    .line 1562
    :cond_4
    iget-object v0, v0, Ll/ۖ֨ܽ;->ۧ:[I

    aget v0, v0, v3

    const/16 v3, 0x80

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x1

    const/16 v9, 0x40

    if-eqz v1, :cond_8

    if-ltz v0, :cond_5

    if-ge v0, v9, :cond_5

    shl-long v1, v7, v0

    move-wide v10, v1

    goto :goto_4

    :cond_5
    move-wide v10, v5

    :goto_4
    if-lt v0, v9, :cond_6

    if-ge v0, v3, :cond_6

    add-int/lit8 v1, v0, -0x40

    shl-long v5, v7, v1

    :cond_6
    move-wide v12, v5

    if-lt v0, v3, :cond_7

    const/4 v0, 0x1

    const/4 v14, 0x1

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_5
    const/4 v15, 0x0

    .line 1567
    invoke-static/range {v10 .. v15}, Ll/۟ۘܽ;->֫(JJZZ)Ll/۟ۘܽ;

    move-result-object v0

    return-object v0

    :cond_8
    const/4 v10, 0x0

    move-wide v11, v5

    move-wide v13, v11

    :goto_6
    if-ge v10, v3, :cond_e

    if-eqz v4, :cond_9

    if-eq v0, v10, :cond_b

    .line 1574
    invoke-static {v10}, Ll/ۗᩳۘ;->ۧ(I)I

    move-result v5

    if-ne v0, v5, :cond_d

    goto :goto_7

    :cond_9
    if-eqz v2, :cond_a

    if-eq v0, v10, :cond_b

    .line 1576
    invoke-static {v10}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result v5

    if-ne v0, v5, :cond_d

    goto :goto_7

    :cond_a
    if-ne v0, v10, :cond_d

    :cond_b
    :goto_7
    if-ge v10, v9, :cond_c

    shl-long v5, v7, v10

    or-long/2addr v5, v11

    move-wide v11, v5

    goto :goto_8

    :cond_c
    add-int/lit8 v5, v10, -0x40

    shl-long v5, v7, v5

    or-long/2addr v5, v13

    move-wide v13, v5

    :cond_d
    :goto_8
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_e
    if-eqz v1, :cond_10

    if-lt v0, v3, :cond_f

    goto :goto_9

    :cond_f
    const/4 v0, 0x0

    const/4 v15, 0x0

    goto :goto_a

    :cond_10
    :goto_9
    const/4 v0, 0x1

    const/4 v15, 0x1

    :goto_a
    const/16 v16, 0x0

    .line 1589
    invoke-static/range {v11 .. v16}, Ll/۟ۘܽ;->֫(JJZZ)Ll/۟ۘܽ;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/۟ۘܽ;
    .locals 18

    .line 1417
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 1418
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 1419
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1420
    new-instance v3, Ll/ܽ֨ܽ;

    move-object/from16 v4, p0

    invoke-direct {v3, v4}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1421
    sget-object v3, Ll/۟ۘܽ;->ۜ:Ll/۟ۘܽ;

    move-object v4, v3

    .line 1422
    :cond_0
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_23

    const/4 v5, 0x1

    .line 0
    invoke-static {v2, v5}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v6

    .line 1423
    check-cast v6, Ll/ܽ֨ܽ;

    .line 1424
    iget-object v7, v6, Ll/ܽ֨ܽ;->ۧ:Ll/ۛۚܽ;

    .line 1425
    iget v8, v6, Ll/ܽ֨ܽ;->ᩳ:I

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/4 v11, 0x3

    if-nez v8, :cond_1c

    .line 1426
    sget-object v8, Ll/۟ۘܽ;->ܳ:Ll/۟ۘܽ;

    if-eqz v7, :cond_1b

    sget-object v12, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    if-eq v7, v12, :cond_1b

    instance-of v12, v7, Ll/ܶۚܽ;

    if-nez v12, :cond_1b

    instance-of v12, v7, Ll/᩶ۚܽ;

    if-eqz v12, :cond_1

    goto/16 :goto_8

    .line 1429
    :cond_1
    invoke-virtual {v1, v7}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 1430
    invoke-virtual {v1, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟ۘܽ;

    goto/16 :goto_9

    .line 1431
    :cond_2
    invoke-virtual {v0, v7}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto/16 :goto_6

    .line 1434
    :cond_3
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v7, v12}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1435
    iput-boolean v5, v6, Ll/ܽ֨ܽ;->ܳ:Z

    .line 1436
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    const-class v13, Ll/ۛۚܽ;

    if-ne v12, v13, :cond_4

    goto/16 :goto_8

    .line 1438
    :cond_4
    instance-of v8, v7, Ll/ۖ֨ܽ;

    if-eqz v8, :cond_6

    move-object v8, v7

    check-cast v8, Ll/ۖ֨ܽ;

    .line 1439
    iget-object v9, v8, Ll/ۖ֨ܽ;->ۧ:[I

    array-length v9, v9

    if-nez v9, :cond_5

    .line 1440
    iput v5, v6, Ll/ܽ֨ܽ;->ᩳ:I

    .line 1441
    new-instance v5, Ll/ܽ֨ܽ;

    iget-object v6, v7, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v5, v6}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1444
    :cond_5
    invoke-static {v8}, Ll/ᩳ֨ܽ;->֫(Ll/ۖ֨ܽ;)Ll/۟ۘܽ;

    move-result-object v4

    goto/16 :goto_9

    .line 1445
    :cond_6
    instance-of v8, v7, Ll/᩻ۚܽ;

    if-eqz v8, :cond_7

    move-object v4, v7

    check-cast v4, Ll/᩻ۚܽ;

    .line 1446
    iget-object v4, v4, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-static {v4}, Ll/ᩳ֨ܽ;->֫(Ll/ۧۚܽ;)Ll/۟ۘܽ;

    move-result-object v4

    goto/16 :goto_9

    .line 1447
    :cond_7
    instance-of v8, v7, Ll/᩹ۚܽ;

    if-eqz v8, :cond_8

    .line 1448
    sget-object v4, Ll/ᩳ֨ܽ;->֫:Ll/۟ۘܽ;

    goto/16 :goto_9

    .line 1449
    :cond_8
    instance-of v8, v7, Ll/ܿ۠ܽ;

    if-eqz v8, :cond_9

    const/16 v16, 0x1

    const/16 v17, 0x0

    const-wide/16 v12, -0x1

    const-wide/16 v14, -0x1

    .line 1450
    invoke-static/range {v12 .. v17}, Ll/۟ۘܽ;->֫(JJZZ)Ll/۟ۘܽ;

    move-result-object v4

    goto/16 :goto_9

    .line 1451
    :cond_9
    instance-of v8, v7, Ll/ۜۚܽ;

    if-eqz v8, :cond_a

    move-object v4, v7

    check-cast v4, Ll/ۜۚܽ;

    .line 1452
    iget-object v8, v4, Ll/ۜۚܽ;->ܽ:Ll/ۧۚܽ;

    invoke-static {v8}, Ll/ᩳ֨ܽ;->֫(Ll/ۧۚܽ;)Ll/۟ۘܽ;

    move-result-object v8

    .line 1453
    iget v4, v4, Ll/ۜۚܽ;->ۧ:I

    if-gtz v4, :cond_1b

    .line 1454
    iput-object v8, v6, Ll/ܽ֨ܽ;->ܽ:Ll/۟ۘܽ;

    .line 1455
    iput v10, v6, Ll/ܽ֨ܽ;->ᩳ:I

    .line 1456
    new-instance v4, Ll/ܽ֨ܽ;

    iget-object v5, v7, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v4, v5}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v4, v8

    goto/16 :goto_0

    .line 1459
    :cond_a
    instance-of v8, v7, Ll/᩷ۚܽ;

    const/4 v10, 0x0

    if-eqz v8, :cond_e

    check-cast v7, Ll/᩷ۚܽ;

    .line 1460
    iget v8, v7, Ll/᩷ۚܽ;->ᩳ:I

    if-lez v8, :cond_b

    const/4 v10, 0x1

    :cond_b
    iput-boolean v10, v6, Ll/ܽ֨ܽ;->ܿ:Z

    .line 1461
    iget v8, v7, Ll/᩷ۚܽ;->ܽ:I

    if-nez v8, :cond_c

    goto :goto_1

    :cond_c
    const/4 v5, 0x3

    :goto_1
    iput v5, v6, Ll/ܽ֨ܽ;->ᩳ:I

    .line 1462
    new-instance v5, Ll/ܽ֨ܽ;

    if-nez v8, :cond_d

    iget-object v6, v7, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_2

    :cond_d
    iget-object v6, v7, Ll/᩷ۚܽ;->ۧ:Ll/ۛۚܽ;

    :goto_2
    invoke-direct {v5, v6}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1464
    :cond_e
    instance-of v8, v7, Ll/֡ۚܽ;

    if-eqz v8, :cond_12

    check-cast v7, Ll/֡ۚܽ;

    .line 1465
    iget v8, v7, Ll/֡ۚܽ;->ܿ:I

    if-lez v8, :cond_f

    const/4 v10, 0x1

    :cond_f
    iput-boolean v10, v6, Ll/ܽ֨ܽ;->ܿ:Z

    .line 1466
    iget v8, v7, Ll/֡ۚܽ;->ᩳ:I

    if-nez v8, :cond_10

    goto :goto_3

    :cond_10
    const/4 v5, 0x3

    :goto_3
    iput v5, v6, Ll/ܽ֨ܽ;->ᩳ:I

    .line 1467
    new-instance v5, Ll/ܽ֨ܽ;

    if-nez v8, :cond_11

    iget-object v6, v7, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_4

    :cond_11
    iget-object v6, v7, Ll/֡ۚܽ;->ۧ:Ll/ۛۚܽ;

    :goto_4
    invoke-direct {v5, v6}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1469
    :cond_12
    instance-of v8, v7, Ll/ۧ֨ܽ;

    if-eqz v8, :cond_14

    check-cast v7, Ll/ۧ֨ܽ;

    .line 1470
    iget-object v8, v7, Ll/ۧ֨ܽ;->ܽ:Ll/֫֨ܽ;

    sget-object v9, Ll/֫֨ܽ;->᩶:Ll/֫֨ܽ;

    if-ne v8, v9, :cond_13

    goto :goto_5

    :cond_13
    const/4 v5, 0x0

    :goto_5
    iput-boolean v5, v6, Ll/ܽ֨ܽ;->ܿ:Z

    .line 1471
    iput v11, v6, Ll/ܽ֨ܽ;->ᩳ:I

    .line 1472
    new-instance v5, Ll/ܽ֨ܽ;

    iget-object v6, v7, Ll/ۧ֨ܽ;->ۧ:Ll/ۛۚܽ;

    invoke-direct {v5, v6}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1474
    :cond_14
    instance-of v8, v7, Ll/ۨ֡ܽ;

    if-eqz v8, :cond_18

    move-object v4, v7

    check-cast v4, Ll/ۨ֡ܽ;

    .line 1476
    iget v8, v4, Ll/ۨ֡ܽ;->ܿ:I

    sget-object v11, Ll/۟ۘܽ;->᩻:Ll/۟ۘܽ;

    if-lez v8, :cond_17

    .line 1477
    iput-object v11, v6, Ll/ܽ֨ܽ;->ܽ:Ll/۟ۘܽ;

    .line 1478
    iput v9, v6, Ll/ܽ֨ܽ;->ᩳ:I

    .line 1479
    iget-object v5, v4, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v5, v5, v10

    if-nez v5, :cond_15

    .line 1480
    iget-object v4, v4, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    iget-object v5, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 1482
    :cond_15
    instance-of v4, v5, Ll/ۢ֨ܽ;

    if-eqz v4, :cond_16

    move-object v4, v5

    check-cast v4, Ll/ۢ֨ܽ;

    iget-object v6, v4, Ll/ۖ֨ܽ;->ۧ:[I

    array-length v6, v6

    if-lez v6, :cond_16

    .line 1483
    invoke-static {v4}, Ll/ᩳ֨ܽ;->֫(Ll/ۖ֨ܽ;)Ll/۟ۘܽ;

    move-result-object v4

    goto/16 :goto_0

    .line 1485
    :cond_16
    new-instance v4, Ll/ܽ֨ܽ;

    invoke-direct {v4, v5}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v4, v11

    goto/16 :goto_0

    :cond_17
    move-object v4, v11

    goto/16 :goto_9

    .line 1611
    :cond_18
    instance-of v8, v7, Ll/ᩳ۠ܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/ۚ֡ܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/۟֡ܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/۟֨ܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/ۖۚܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/ۢۚܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/֫۠ܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/ۚۚܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/֨ۚܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/᩺֡ܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/ܰۚܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/ۤۚܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/֨֡ܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/ۨۚܽ;

    if-nez v8, :cond_1a

    instance-of v8, v7, Ll/ۛ֡ܽ;

    if-eqz v8, :cond_19

    goto :goto_7

    :cond_19
    :goto_6
    move-object v4, v3

    goto/16 :goto_9

    .line 1490
    :cond_1a
    :goto_7
    iput v5, v6, Ll/ܽ֨ܽ;->ᩳ:I

    .line 1491
    new-instance v5, Ll/ܽ֨ܽ;

    iget-object v6, v7, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v5, v6}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1b
    :goto_8
    move-object v4, v8

    goto/16 :goto_9

    :cond_1c
    if-ne v8, v10, :cond_1d

    .line 1499
    iget-object v8, v6, Ll/ܽ֨ܽ;->ܽ:Ll/۟ۘܽ;

    invoke-virtual {v8, v4}, Ll/۟ۘܽ;->֫(Ll/۟ۘܽ;)Ll/۟ۘܽ;

    move-result-object v4

    goto :goto_9

    :cond_1d
    if-ne v8, v11, :cond_1f

    .line 1501
    invoke-virtual {v4}, Ll/۟ۘܽ;->ܿ()Z

    move-result v8

    if-nez v8, :cond_22

    .line 1502
    iget-boolean v8, v6, Ll/ܽ֨ܽ;->ܿ:Z

    if-eqz v8, :cond_1e

    invoke-virtual {v4}, Ll/۟ۘܽ;->ᩳ()Z

    move-result v8

    if-nez v8, :cond_1e

    .line 1503
    invoke-virtual {v4}, Ll/۟ۘܽ;->᩻()Ll/۟ۘܽ;

    move-result-object v4

    goto :goto_9

    .line 1505
    :cond_1e
    invoke-virtual {v4}, Ll/۟ۘܽ;->᩻()Ll/۟ۘܽ;

    move-result-object v5

    iput-object v5, v6, Ll/ܽ֨ܽ;->ܽ:Ll/۟ۘܽ;

    .line 1506
    iput v10, v6, Ll/ܽ֨ܽ;->ᩳ:I

    .line 1507
    new-instance v5, Ll/ܽ֨ܽ;

    iget-object v6, v7, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v5, v6}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1f
    if-ne v8, v9, :cond_22

    .line 1512
    iget-object v8, v6, Ll/ܽ֨ܽ;->ܽ:Ll/۟ۘܽ;

    invoke-virtual {v8, v4}, Ll/۟ۘܽ;->֫(Ll/۟ۘܽ;)Ll/۟ۘܽ;

    move-result-object v4

    .line 1513
    move-object v8, v7

    check-cast v8, Ll/ۨ֡ܽ;

    .line 1514
    invoke-virtual {v4}, Ll/۟ۘܽ;->ܿ()Z

    move-result v9

    if-nez v9, :cond_22

    iget v9, v6, Ll/ܽ֨ܽ;->֫:I

    add-int/2addr v9, v5

    iput v9, v6, Ll/ܽ֨ܽ;->֫:I

    iget v10, v8, Ll/ۨ֡ܽ;->ܿ:I

    if-ge v9, v10, :cond_22

    .line 1515
    iput-object v4, v6, Ll/ܽ֨ܽ;->ܽ:Ll/۟ۘܽ;

    .line 1516
    iget-object v5, v8, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v5, v5, v9

    if-nez v5, :cond_20

    .line 1517
    iget-object v5, v8, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    iget-object v5, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 1518
    :cond_20
    instance-of v6, v5, Ll/ۢ֨ܽ;

    if-eqz v6, :cond_21

    move-object v6, v5

    check-cast v6, Ll/ۢ֨ܽ;

    iget-object v7, v6, Ll/ۖ֨ܽ;->ۧ:[I

    array-length v7, v7

    if-lez v7, :cond_21

    .line 1519
    invoke-static {v6}, Ll/ᩳ֨ܽ;->֫(Ll/ۖ֨ܽ;)Ll/۟ۘܽ;

    move-result-object v4

    goto/16 :goto_0

    .line 1521
    :cond_21
    new-instance v6, Ll/ܽ֨ܽ;

    invoke-direct {v6, v5}, Ll/ܽ֨ܽ;-><init>(Ll/ۛۚܽ;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 0
    :cond_22
    :goto_9
    invoke-static {v2, v5}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    .line 1527
    iget-boolean v5, v6, Ll/ܽ֨ܽ;->ܳ:Z

    if-eqz v5, :cond_0

    .line 1528
    invoke-virtual {v0, v7}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1529
    invoke-virtual {v1, v7, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_23
    return-object v4
.end method

.method public static ֫(Ll/ۧۚܽ;)Ll/۟ۘܽ;
    .locals 9

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    move-wide v3, v0

    move-wide v5, v3

    :goto_0
    const/16 v0, 0x80

    if-ge v2, v0, :cond_2

    .line 1597
    invoke-interface {p0, v2}, Ll/ۧۚܽ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x1

    const/16 v7, 0x40

    if-ge v2, v7, :cond_1

    shl-long/2addr v0, v2

    or-long/2addr v0, v3

    move-wide v3, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v2, -0x40

    shl-long/2addr v0, v7

    or-long/2addr v0, v5

    move-wide v5, v0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 1606
    invoke-static/range {v3 .. v8}, Ll/۟ۘܽ;->֫(JJZZ)Ll/۟ۘܽ;

    move-result-object p0

    return-object p0
.end method
