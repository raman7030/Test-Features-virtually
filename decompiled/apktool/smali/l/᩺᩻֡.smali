.class public Ll/᩺᩻֡;
.super Ll/ۨܳ֡;
.source "AARN"


# static fields
.field public static final ܺ:Z


# instance fields
.field public final ۜ:[Ll/ۛۜ֡;

.field public final ۡ:Ll/ۢܳ֡;

.field public ۢ:Ll/᩻ۜ֡;

.field public ܳ:Ll/ۡܳ֡;

.field public ܿ:Ll/֫ܳ֡;

.field public ᩳ:Ll/ۛۜ֡;

.field public ᩷:Ll/ۧ᩷֡;

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2244
    :try_start_0
    new-instance v0, Ll/ۨ᩻֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 257
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Ll/᩺᩻֡;->ܺ:Z

    return-void
.end method

.method public constructor <init>(Ll/ۢܳ֡;Ll/᩸ܳ֡;[Ll/ۛۜ֡;Ll/ᩳۜ֡;)V
    .locals 0

    .line 294
    invoke-direct {p0, p2, p4}, Ll/ۨܳ֡;-><init>(Ll/᩸ܳ֡;Ll/ᩳۜ֡;)V

    .line 265
    sget-object p2, Ll/᩻ۜ֡;->᩹:Ll/᩻ۜ֡;

    iput-object p2, p0, Ll/᩺᩻֡;->ۢ:Ll/᩻ۜ֡;

    .line 295
    iput-object p1, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    .line 296
    iput-object p3, p0, Ll/᩺᩻֡;->ۜ:[Ll/ۛۜ֡;

    return-void
.end method

.method public static ֫(Ll/᩺ܳ֡;Z)Z
    .locals 7

    .line 1626
    instance-of v0, p0, Ll/ۢۜ֡;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    instance-of v0, p0, Ll/᩹ۜ֡;

    if-eqz v0, :cond_0

    return v1

    .line 203
    :cond_0
    iget-boolean v0, p0, Ll/᩺ܳ֡;->ۧ:Z

    const/4 v2, 0x0

    .line 154
    :goto_0
    iget-object v3, p0, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ge v2, v3, :cond_5

    .line 1629
    invoke-virtual {p0, v2}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v3

    .line 1630
    invoke-virtual {v3}, Ll/۬ۜ֡;->֫()I

    move-result v5

    if-eqz v0, :cond_1

    if-eq v5, v4, :cond_3

    goto :goto_1

    .line 1633
    :cond_1
    invoke-virtual {v3}, Ll/۬ۜ֡;->ۧ()Z

    move-result v6

    if-nez v6, :cond_4

    if-eqz p1, :cond_3

    const/4 v6, 0x5

    if-eq v5, v6, :cond_2

    const/4 v6, 0x2

    if-eq v5, v6, :cond_2

    const/4 v6, 0x7

    if-ne v5, v6, :cond_3

    :cond_2
    const/4 v5, -0x1

    .line 1635
    invoke-virtual {v3, v5, v4}, Ll/۬ۜ֡;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return v1

    :cond_5
    return v4

    :cond_6
    return v1
.end method

.method public static ܿ(Ll/۬ܳ֡;)I
    .locals 3

    .line 359
    iget-object p0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2084
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳ֡;

    if-nez v1, :cond_1

    .line 2086
    iget v1, v2, Ll/᩹ܳ֡;->֫:I

    goto :goto_0

    .line 2088
    :cond_1
    iget v2, v2, Ll/᩹ܳ֡;->֫:I

    if-eq v2, v1, :cond_0

    return v0

    :cond_2
    return v1
.end method

.method public static ᩳ(Ll/۬ܳ֡;)I
    .locals 5

    .line 1315
    new-instance v0, Ll/᩻᩷֡;

    const/4 v1, 0x0

    new-array v2, v1, [I

    invoke-direct {v0, v2}, Ll/᩻᩷֡;-><init>([I)V

    .line 359
    iget-object p0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 1316
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳ֡;

    .line 135
    iget v3, v2, Ll/᩹ܳ֡;->ܽ:I

    const v4, -0x40000001    # -1.9999999f

    and-int/2addr v3, v4

    if-gtz v3, :cond_1

    .line 1317
    iget-object v3, v2, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    instance-of v3, v3, Ll/ۢۜ֡;

    if-eqz v3, :cond_0

    iget-object v3, v2, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v3}, Ll/ܽۜ֡;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1318
    :cond_1
    iget v2, v2, Ll/᩹ܳ֡;->֫:I

    invoke-virtual {v0, v2}, Ll/᩻᩷֡;->֫(I)V

    goto :goto_0

    .line 1321
    :cond_2
    invoke-virtual {v0}, Ll/᩻᩷֡;->ܿ()I

    move-result p0

    if-nez p0, :cond_3

    return v1

    .line 1322
    :cond_3
    invoke-virtual {v0}, Ll/᩻᩷֡;->֫()I

    move-result p0

    return p0
.end method


# virtual methods
.method public ֫(ILl/֫ܳ֡;Ll/ۡܳ֡;)I
    .locals 7

    .line 322
    iput-object p2, p0, Ll/᩺᩻֡;->ܿ:Ll/֫ܳ֡;

    .line 323
    invoke-interface {p2}, Ll/ܳܳ֡;->index()I

    move-result v0

    iput v0, p0, Ll/᩺᩻֡;->᩻:I

    .line 324
    iput-object p3, p0, Ll/᩺᩻֡;->ܳ:Ll/ۡܳ֡;

    .line 325
    iget-object v0, p0, Ll/᩺᩻֡;->ۜ:[Ll/ۛۜ֡;

    aget-object v2, v0, p1

    .line 326
    iput-object v2, p0, Ll/᩺᩻֡;->ᩳ:Ll/ۛۜ֡;

    .line 328
    invoke-interface {p2}, Ll/ܳܳ֡;->֫()I

    .line 329
    iget p1, p0, Ll/᩺᩻֡;->᩻:I

    const/4 v0, 0x0

    .line 335
    :try_start_0
    invoke-virtual {v2}, Ll/ۛۜ֡;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 338
    iget-object v1, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    invoke-virtual {v1}, Ll/ۢܳ֡;->֡()I

    move-result v1

    invoke-virtual {v2, v1}, Ll/ۛۜ֡;->֫(I)Ll/ܰۜ֡;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p3

    goto :goto_2

    .line 342
    :cond_0
    iget-object v1, v2, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    :goto_0
    if-nez v1, :cond_3

    if-nez p3, :cond_1

    .line 346
    sget-object p3, Ll/ۡܳ֡;->ܳ:Ll/ۡܳ֡;

    .line 348
    :cond_1
    iget-object v1, v2, Ll/ۛۜ֡;->֫:Ll/ۜ᩻֡;

    sget-object v3, Ll/ۡܳ֡;->ܳ:Ll/ۡܳ֡;

    const/4 v4, 0x0

    .line 349
    invoke-virtual {p0, v1, v3, v4}, Ll/᩺᩻֡;->֫(Ll/᩺ܳ֡;Ll/ۡܳ֡;Z)Ll/۬ܳ֡;

    move-result-object v1

    .line 353
    invoke-virtual {v2}, Ll/ۛۜ֡;->֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 360
    iget-object v3, v2, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    iput-object v1, v3, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    .line 361
    invoke-virtual {p0, v1}, Ll/᩺᩻֡;->֫(Ll/۬ܳ֡;)Ll/۬ܳ֡;

    move-result-object v1

    .line 362
    new-instance v3, Ll/ܰۜ֡;

    invoke-direct {v3, v1}, Ll/ܰۜ֡;-><init>(Ll/۬ܳ֡;)V

    invoke-virtual {p0, v2, v3}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;)Ll/ܰۜ֡;

    move-result-object v1

    .line 363
    iget-object v3, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    invoke-virtual {v3}, Ll/ۢܳ֡;->֡()I

    move-result v3

    invoke-virtual {v2, v3, v1}, Ll/ۛۜ֡;->֫(ILl/ܰۜ֡;)V

    goto :goto_1

    .line 366
    :cond_2
    new-instance v3, Ll/ܰۜ֡;

    invoke-direct {v3, v1}, Ll/ܰۜ֡;-><init>(Ll/۬ܳ֡;)V

    invoke-virtual {p0, v2, v3}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;)Ll/ܰۜ֡;

    move-result-object v1

    .line 367
    iput-object v1, v2, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    :cond_3
    :goto_1
    move-object v6, p3

    move-object v3, v1

    move-object v1, p0

    move-object v4, p2

    move v5, p1

    .line 371
    invoke-virtual/range {v1 .. v6}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;Ll/֫ܳ֡;ILl/ۡܳ֡;)I

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 376
    iput-object v0, p0, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    .line 377
    iput-object v0, p0, Ll/᩺᩻֡;->ᩳ:Ll/ۛۜ֡;

    .line 378
    invoke-interface {p2, p1}, Ll/ܳܳ֡;->֫(I)V

    .line 379
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return p3

    .line 376
    :goto_2
    iput-object v0, p0, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    .line 377
    iput-object v0, p0, Ll/᩺᩻֡;->ᩳ:Ll/ۛۜ֡;

    .line 378
    invoke-interface {p2, p1}, Ll/ܳܳ֡;->֫(I)V

    .line 379
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    throw p3
.end method

.method public final ֫(Ll/ۛۜ֡;Ll/ܰۜ֡;Ll/֫ܳ֡;ILl/ۡܳ֡;)I
    .locals 15

    move-object v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p3

    move/from16 v10, p4

    move-object/from16 v11, p5

    const/4 v0, 0x1

    .line 427
    invoke-interface {v9, v0}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v1

    move v2, v1

    move-object/from16 v1, p2

    .line 430
    :goto_0
    invoke-virtual {p0, v2, v1}, Ll/᩺᩻֡;->֫(ILl/ܰۜ֡;)Ll/ܰۜ֡;

    move-result-object v3

    if-nez v3, :cond_0

    .line 432
    invoke-virtual {p0, v8, v1, v2}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;I)Ll/ܰۜ֡;

    move-result-object v3

    :cond_0
    move-object v12, v3

    .line 435
    sget-object v3, Ll/ۨܳ֡;->ܽ:Ll/ܰۜ֡;

    if-ne v12, v3, :cond_2

    .line 445
    invoke-virtual {p0, v10, v9, v11}, Ll/᩺᩻֡;->ۧ(ILl/֫ܳ֡;Ll/ۡܳ֡;)Ll/᩷ܳ֡;

    move-result-object v0

    .line 446
    invoke-interface/range {p3 .. p4}, Ll/ܳܳ֡;->֫(I)V

    .line 447
    iget-object v1, v1, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    invoke-virtual {p0, v1, v11}, Ll/᩺᩻֡;->֫(Ll/۬ܳ֡;Ll/ۡܳ֡;)I

    move-result v1

    if-eqz v1, :cond_1

    return v1

    .line 451
    :cond_1
    throw v0

    .line 454
    :cond_2
    iget-boolean v1, v12, Ll/ܰۜ֡;->᩻:Z

    const/4 v13, 0x0

    if-eqz v1, :cond_8

    iget-object v1, v7, Ll/᩺᩻֡;->ۢ:Ll/᩻ۜ֡;

    sget-object v3, Ll/᩻ۜ֡;->ۙ:Ll/᩻ۜ֡;

    if-eq v1, v3, :cond_8

    .line 456
    iget-object v1, v12, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    iget-object v1, v1, Ll/۬ܳ֡;->ۗ:Ljava/util/BitSet;

    .line 457
    iget-object v2, v12, Ll/ܰۜ֡;->ܿ:[Ll/᩺ۜ֡;

    if-eqz v2, :cond_6

    .line 459
    invoke-interface/range {p3 .. p3}, Ll/ܳܳ֡;->index()I

    move-result v1

    if-eq v1, v10, :cond_3

    .line 461
    invoke-interface/range {p3 .. p4}, Ll/ܳܳ֡;->֫(I)V

    .line 464
    :cond_3
    iget-object v2, v12, Ll/ܰۜ֡;->ܿ:[Ll/᩺ۜ֡;

    invoke-virtual {p0, v2, v11}, Ll/᩺᩻֡;->֫([Ll/᩺ۜ֡;Ll/ۡܳ֡;)Ljava/util/BitSet;

    move-result-object v2

    .line 465
    invoke-virtual {v2}, Ljava/util/BitSet;->cardinality()I

    move-result v3

    if-ne v3, v0, :cond_4

    .line 467
    invoke-virtual {v2, v13}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    return v0

    :cond_4
    if-eq v1, v10, :cond_5

    .line 473
    invoke-interface {v9, v1}, Ll/ܳܳ֡;->֫(I)V

    :cond_5
    move-object v5, v2

    goto :goto_1

    :cond_6
    move-object v5, v1

    .line 479
    :goto_1
    iget-object v1, v8, Ll/ۛۜ֡;->֫:Ll/ۜ᩻֡;

    .line 480
    invoke-virtual {p0, v1, v11, v0}, Ll/᩺᩻֡;->֫(Ll/᩺ܳ֡;Ll/ۡܳ֡;Z)Ll/۬ܳ֡;

    move-result-object v13

    .line 482
    iget-object v6, v12, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    invoke-interface/range {p3 .. p3}, Ll/ܳܳ֡;->index()I

    move-result v4

    .line 2196
    iget-object v0, v7, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ll/ᩴܳ֡;->ᩳ()Ll/ܺܳ֡;

    move-result-object v0

    iget-object v1, v7, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    move-object/from16 v2, p1

    move/from16 v3, p4

    invoke-virtual/range {v0 .. v6}, Ll/ܺܳ֡;->֫(Ll/ۢܳ֡;Ll/ۛۜ֡;IILjava/util/BitSet;Ll/۬ܳ֡;)V

    :cond_7
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object v3, v13

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    .line 483
    invoke-virtual/range {v0 .. v6}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;Ll/۬ܳ֡;Ll/֫ܳ֡;ILl/ۡܳ֡;)I

    move-result v0

    return v0

    .line 489
    :cond_8
    iget-boolean v1, v12, Ll/ܰۜ֡;->ܽ:Z

    if-eqz v1, :cond_c

    .line 490
    iget-object v1, v12, Ll/ܰۜ֡;->ܿ:[Ll/᩺ۜ֡;

    if-nez v1, :cond_9

    .line 491
    iget v0, v12, Ll/ܰۜ֡;->ܳ:I

    return v0

    .line 494
    :cond_9
    invoke-interface/range {p3 .. p3}, Ll/ܳܳ֡;->index()I

    move-result v3

    .line 495
    invoke-interface/range {p3 .. p4}, Ll/ܳܳ֡;->֫(I)V

    .line 496
    iget-object v1, v12, Ll/ܰۜ֡;->ܿ:[Ll/᩺ۜ֡;

    invoke-virtual {p0, v1, v11}, Ll/᩺᩻֡;->֫([Ll/᩺ۜ֡;Ll/ۡܳ֡;)Ljava/util/BitSet;

    move-result-object v14

    .line 497
    invoke-virtual {v14}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    if-eqz v1, :cond_b

    if-eq v1, v0, :cond_a

    const/4 v4, 0x0

    .line 507
    iget-object v6, v12, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    move-object v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    move-object v5, v14

    invoke-virtual/range {v0 .. v6}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;IIZLjava/util/BitSet;Ll/۬ܳ֡;)V

    .line 508
    invoke-virtual {v14, v13}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    return v0

    .line 502
    :cond_a
    invoke-virtual {v14, v13}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    return v0

    .line 499
    :cond_b
    invoke-virtual {p0, v10, v9, v11}, Ll/᩺᩻֡;->ۧ(ILl/֫ܳ֡;Ll/ۡܳ֡;)Ll/᩷ܳ֡;

    move-result-object v0

    throw v0

    :cond_c
    const/4 v1, -0x1

    if-eq v2, v1, :cond_d

    .line 515
    invoke-interface/range {p3 .. p3}, Ll/ܳܳ֡;->ۧ()V

    .line 516
    invoke-interface {v9, v0}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v1

    move v2, v1

    :cond_d
    move-object v1, v12

    goto/16 :goto_0
.end method

.method public ֫(Ll/ۛۜ֡;Ll/ܰۜ֡;Ll/۬ܳ֡;Ll/֫ܳ֡;ILl/ۡܳ֡;)I
    .locals 8

    .line 640
    invoke-interface {p4, p5}, Ll/ܳܳ֡;->֫(I)V

    const/4 p2, 0x1

    .line 641
    invoke-interface {p4, p2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    .line 647
    :goto_0
    invoke-virtual {p0, p3, v0, p2}, Ll/᩺᩻֡;->֫(Ll/۬ܳ֡;IZ)Ll/۬ܳ֡;

    move-result-object v7

    if-nez v7, :cond_1

    .line 658
    invoke-virtual {p0, p5, p4, p6}, Ll/᩺᩻֡;->ۧ(ILl/֫ܳ֡;Ll/ۡܳ֡;)Ll/᩷ܳ֡;

    move-result-object p1

    .line 659
    invoke-interface {p4, p5}, Ll/ܳܳ֡;->֫(I)V

    .line 660
    invoke-virtual {p0, p3, p6}, Ll/᩺᩻֡;->֫(Ll/۬ܳ֡;Ll/ۡܳ֡;)I

    move-result p2

    if-eqz p2, :cond_0

    return p2

    .line 664
    :cond_0
    throw p1

    .line 667
    :cond_1
    invoke-static {v7}, Ll/᩻ۜ֡;->ܽ(Ll/۬ܳ֡;)Ljava/util/Collection;

    move-result-object p3

    .line 677
    invoke-static {v7}, Ll/᩺᩻֡;->ܿ(Ll/۬ܳ֡;)I

    move-result v1

    iput v1, v7, Ll/۬ܳ֡;->ۨ:I

    if-eqz v1, :cond_2

    goto :goto_1

    .line 683
    :cond_2
    iget-object v1, p0, Ll/᩺᩻֡;->ۢ:Ll/᩻ۜ֡;

    sget-object v2, Ll/᩻ۜ֡;->᩶:Ll/᩻ۜ֡;

    if-eq v1, v2, :cond_3

    .line 684
    invoke-static {p3}, Ll/᩻ۜ֡;->ۜ(Ljava/util/Collection;)I

    move-result v1

    if-eqz v1, :cond_5

    :goto_1
    const/4 p2, 0x0

    move p2, v1

    const/4 v5, 0x0

    goto :goto_2

    .line 692
    :cond_3
    invoke-static {p3}, Ll/᩻ۜ֡;->֫(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 693
    invoke-static {p3}, Ll/᩻ۜ֡;->ۧ(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 696
    invoke-static {p3}, Ll/᩻ۜ֡;->ᩳ(Ljava/util/Collection;)I

    move-result v1

    const/4 p2, 0x1

    move p2, v1

    const/4 v5, 0x1

    .line 714
    :goto_2
    iget p3, v7, Ll/۬ܳ֡;->ۨ:I

    if-eqz p3, :cond_4

    .line 715
    invoke-interface {p4}, Ll/ܳܳ֡;->index()I

    move-result v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, v7

    move v5, p5

    invoke-virtual/range {v1 .. v6}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;ILl/۬ܳ֡;II)V

    return p2

    .line 746
    :cond_4
    invoke-interface {p4}, Ll/ܳܳ֡;->index()I

    move-result v4

    .line 747
    invoke-virtual {v7}, Ll/۬ܳ֡;->ۧ()Ljava/util/BitSet;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move v3, p5

    .line 746
    invoke-virtual/range {v1 .. v7}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;IIZLjava/util/BitSet;Ll/۬ܳ֡;)V

    return p2

    :cond_5
    const/4 p3, -0x1

    if-eq v0, p3, :cond_6

    .line 706
    invoke-interface {p4}, Ll/ܳܳ֡;->ۧ()V

    .line 707
    invoke-interface {p4, p2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result p3

    move v0, p3

    :cond_6
    move-object p3, v7

    goto :goto_0
.end method

.method public final ֫(Ll/۬ܳ֡;Ll/ۡܳ֡;)I
    .locals 6

    .line 1338
    iget-boolean v0, p1, Ll/۬ܳ֡;->۫:Z

    invoke-virtual {p0, v0}, Ll/᩺᩻֡;->֫(Z)Ll/۬ܳ֡;

    move-result-object v0

    .line 1339
    iget-boolean v1, p1, Ll/۬ܳ֡;->۫:Z

    invoke-virtual {p0, v1}, Ll/᩺᩻֡;->֫(Z)Ll/۬ܳ֡;

    move-result-object v1

    .line 359
    iget-object p1, p1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 1340
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳ֡;

    .line 1341
    iget-object v3, v2, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    sget-object v4, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    const/4 v5, 0x0

    if-eq v3, v4, :cond_1

    .line 1426
    iget-object v4, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    invoke-virtual {v3, v4, p2}, Ll/ۚۜ֡;->֫(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 132
    :cond_0
    invoke-virtual {v1, v2, v5}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v0, v2, v5}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    goto :goto_0

    .line 1300
    :cond_2
    invoke-static {v0}, Ll/᩺᩻֡;->ᩳ(Ll/۬ܳ֡;)I

    move-result p1

    if-eqz p1, :cond_3

    return p1

    .line 328
    :cond_3
    iget-object p1, v1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_4

    .line 1306
    invoke-static {v1}, Ll/᩺᩻֡;->ᩳ(Ll/۬ܳ֡;)I

    move-result p1

    if-eqz p1, :cond_4

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫([Ll/᩺ۜ֡;Ll/ۡܳ֡;)Ljava/util/BitSet;
    .locals 6

    .line 1367
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 1368
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    .line 1369
    iget-object v4, v3, Ll/᩺ۜ֡;->ۧ:Ll/ۚۜ֡;

    iget v3, v3, Ll/᩺ۜ֡;->֫:I

    sget-object v5, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    if-ne v4, v5, :cond_0

    .line 1370
    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    goto :goto_1

    .line 1426
    :cond_0
    iget-object v5, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    invoke-virtual {v4, v5, p2}, Ll/ۚۜ֡;->֫(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1385
    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final ֫(Ll/۬ܳ֡;)Ll/۬ܳ֡;
    .locals 10

    .line 1123
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1124
    iget-boolean v1, p1, Ll/۬ܳ֡;->۫:Z

    invoke-virtual {p0, v1}, Ll/᩺᩻֡;->֫(Z)Ll/۬ܳ֡;

    move-result-object v1

    .line 359
    iget-object p1, p1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 1125
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/᩹ܳ֡;

    .line 1127
    iget v2, v4, Ll/᩹ܳ֡;->֫:I

    iget-object v5, v4, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 1131
    :cond_0
    iget-object v2, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    iget-object v3, p0, Ll/᩺᩻֡;->ܳ:Ll/ۡܳ֡;

    invoke-virtual {v5, v2, v3}, Ll/ۚۜ֡;->ۧ(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Ll/ۚۜ֡;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_0

    .line 1137
    :cond_1
    iget-object v2, v4, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v2, v2, Ll/᩺ܳ֡;->ܿ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, v4, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v6, v5, :cond_2

    .line 1139
    iget-object v5, v4, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget-object v7, v4, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object v9, p0, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    move-object v2, v1

    move-object v3, v4

    move-object v4, v5

    move-object v5, v7

    move-object v7, v9

    invoke-virtual/range {v2 .. v7}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;Ll/ۧ᩷֡;)V

    goto :goto_0

    .line 1142
    :cond_2
    iget-object v2, p0, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    invoke-virtual {v1, v4, v2}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    goto :goto_0

    .line 359
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 1146
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳ֡;

    .line 1147
    iget v4, v2, Ll/᩹ܳ֡;->֫:I

    if-ne v4, v3, :cond_4

    goto :goto_1

    .line 139
    :cond_4
    iget v4, v2, Ll/᩹ܳ֡;->ܽ:I

    const/high16 v5, 0x40000000    # 2.0f

    and-int/2addr v4, v5

    if-eqz v4, :cond_5

    goto :goto_2

    .line 1157
    :cond_5
    iget-object v4, v2, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v4, v4, Ll/᩺ܳ֡;->ܿ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽۜ֡;

    if-eqz v4, :cond_6

    .line 1158
    iget-object v5, v2, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v4, v5}, Ll/ܽۜ֡;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_1

    .line 1164
    :cond_6
    :goto_2
    iget-object v4, p0, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    invoke-virtual {v1, v2, v4}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    goto :goto_1

    :cond_7
    return-object v1
.end method

.method public ֫(Ll/۬ܳ֡;IZ)Ll/۬ܳ֡;
    .locals 20

    move-object/from16 v8, p0

    move/from16 v9, p2

    move/from16 v10, p3

    .line 763
    iget-object v0, v8, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    if-nez v0, :cond_0

    .line 764
    new-instance v0, Ll/ۧ᩷֡;

    invoke-direct {v0}, Ll/ۧ᩷֡;-><init>()V

    iput-object v0, v8, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    .line 767
    :cond_0
    invoke-virtual {v8, v10}, Ll/᩺᩻֡;->֫(Z)Ll/۬ܳ֡;

    move-result-object v11

    iget-object v0, v11, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    move-object/from16 v1, p1

    .line 359
    iget-object v1, v1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v12, 0x0

    move-object v13, v12

    .line 782
    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v14, v8, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    const/4 v6, -0x1

    if-eqz v1, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Ll/᩹ܳ֡;

    .line 785
    iget-object v1, v15, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    instance-of v2, v1, Ll/ۢۜ֡;

    if-eqz v2, :cond_4

    if-nez v10, :cond_2

    if-ne v9, v6, :cond_1

    :cond_2
    if-nez v13, :cond_3

    .line 789
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 792
    :cond_3
    invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 154
    :cond_4
    iget-object v1, v1, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v6, :cond_1

    .line 800
    iget-object v1, v15, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    invoke-virtual {v1, v5}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v1

    .line 1171
    iget v2, v14, Ll/᩸ܳ֡;->ᩳ:I

    invoke-virtual {v1, v9, v2}, Ll/۬ۜ֡;->֫(II)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1172
    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    move-object v3, v1

    goto :goto_2

    :cond_5
    move-object v3, v12

    :goto_2
    if-eqz v3, :cond_6

    .line 803
    iget-object v4, v15, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object v2, v15, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    iget-object v1, v8, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    move-object/from16 v16, v1

    move-object v1, v11

    move-object/from16 v17, v2

    move-object v2, v15

    move/from16 v18, v5

    move-object/from16 v5, v17

    move/from16 v17, v6

    move-object/from16 v6, v16

    invoke-virtual/range {v1 .. v6}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;Ll/ۧ᩷֡;)V

    goto :goto_3

    :cond_6
    move/from16 v18, v5

    move/from16 v17, v6

    :goto_3
    add-int/lit8 v5, v18, 0x1

    move/from16 v6, v17

    goto :goto_1

    :cond_7
    const/4 v1, 0x1

    if-nez v13, :cond_9

    if-eq v9, v6, :cond_9

    .line 328
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v2, v1, :cond_8

    goto :goto_4

    .line 829
    :cond_8
    invoke-static {v11}, Ll/᩺᩻֡;->ܿ(Ll/۬ܳ֡;)I

    move-result v1

    if-eqz v1, :cond_9

    :goto_4
    move-object v1, v11

    goto :goto_5

    :cond_9
    move-object v1, v12

    :goto_5
    if-nez v1, :cond_c

    .line 840
    invoke-virtual {v8, v10}, Ll/᩺᩻֡;->֫(Z)Ll/۬ܳ֡;

    move-result-object v16

    .line 841
    new-instance v17, Ljava/util/HashSet;

    invoke-direct/range {v17 .. v17}, Ljava/util/HashSet;-><init>()V

    if-ne v9, v6, :cond_a

    const/4 v1, 0x1

    const/16 v18, 0x1

    goto :goto_6

    :cond_a
    const/4 v1, 0x0

    const/16 v18, 0x0

    .line 359
    :goto_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v19

    .line 843
    :goto_7
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/᩹ܳ֡;

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    move/from16 v5, p3

    const/4 v15, -0x1

    move v6, v7

    move/from16 v7, v18

    .line 1444
    invoke-virtual/range {v0 .. v7}, Ll/᩺᩻֡;->֫(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    const/4 v6, -0x1

    goto :goto_7

    :cond_b
    const/4 v15, -0x1

    move-object/from16 v1, v16

    goto :goto_8

    :cond_c
    const/4 v15, -0x1

    :goto_8
    if-ne v9, v15, :cond_12

    if-ne v1, v11, :cond_d

    const/4 v15, 0x1

    goto :goto_9

    :cond_d
    const/4 v15, 0x0

    .line 913
    :goto_9
    invoke-static {v1}, Ll/᩻ۜ֡;->֫(Ll/۬ܳ֡;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_b

    .line 917
    :cond_e
    iget-boolean v0, v1, Ll/۬ܳ֡;->۫:Z

    invoke-virtual {v8, v0}, Ll/᩺᩻֡;->֫(Z)Ll/۬ܳ֡;

    move-result-object v0

    .line 359
    iget-object v1, v1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 918
    :cond_f
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll/᩹ܳ֡;

    .line 919
    iget-object v2, v3, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    instance-of v4, v2, Ll/ۢۜ֡;

    if-eqz v4, :cond_10

    .line 920
    iget-object v2, v8, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    invoke-virtual {v0, v3, v2}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    goto :goto_a

    :cond_10
    if-eqz v15, :cond_f

    .line 203
    iget-boolean v4, v2, Ll/᩺ܳ֡;->ۧ:Z

    if-eqz v4, :cond_f

    .line 925
    invoke-virtual {v14, v2}, Ll/᩸ܳ֡;->֫(Ll/᩺ܳ֡;)Ll/᩻᩷֡;

    move-result-object v2

    const/4 v4, -0x2

    .line 926
    invoke-virtual {v2, v4}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 927
    iget-object v2, v14, Ll/᩸ܳ֡;->᩻:[Ll/ۢۜ֡;

    iget-object v4, v3, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v4, v4, Ll/᩺ܳ֡;->ᩳ:I

    aget-object v4, v2, v4

    .line 928
    iget-object v5, v3, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object v6, v3, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    iget-object v7, v8, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    move-object v2, v0

    invoke-virtual/range {v2 .. v7}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;Ll/ۧ᩷֡;)V

    goto :goto_a

    :cond_11
    move-object v1, v0

    :cond_12
    :goto_b
    if-eqz v13, :cond_14

    if-eqz v10, :cond_13

    .line 877
    invoke-static {v1}, Ll/᩻ۜ֡;->ܿ(Ll/۬ܳ֡;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 879
    :cond_13
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳ֡;

    .line 880
    iget-object v3, v8, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    invoke-virtual {v1, v2, v3}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    goto :goto_c

    .line 333
    :cond_14
    iget-object v0, v1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    return-object v12

    :cond_15
    return-object v1
.end method

.method public final ֫(Ll/᩺ܳ֡;Ll/ۡܳ֡;Z)Ll/۬ܳ֡;
    .locals 10

    .line 942
    iget-object v0, p0, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    invoke-static {v0, p2}, Ll/ܽۜ֡;->֫(Ll/᩸ܳ֡;Ll/᩵ܳ֡;)Ll/۠ۜ֡;

    move-result-object p2

    .line 943
    invoke-virtual {p0, p3}, Ll/᩺᩻֡;->֫(Z)Ll/۬ܳ֡;

    move-result-object v8

    const/4 v0, 0x0

    .line 154
    :goto_0
    iget-object v1, p1, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 950
    invoke-virtual {p1, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v1

    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 951
    new-instance v2, Ll/᩹ܳ֡;

    add-int/lit8 v9, v0, 0x1

    invoke-direct {v2, v1, v9, p2}, Ll/᩹ܳ֡;-><init>(Ll/᩺ܳ֡;ILl/ܽۜ֡;)V

    .line 952
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, v2

    move-object v2, v8

    move v5, p3

    .line 1444
    invoke-virtual/range {v0 .. v7}, Ll/᩺᩻֡;->֫(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    move v0, v9

    goto :goto_0

    :cond_0
    return-object v8
.end method

.method public ֫(Z)Ll/۬ܳ֡;
    .locals 2

    .line 754
    new-instance v0, Ll/۬ܳ֡;

    const/4 v1, 0x0

    .line 110
    invoke-direct {v0, p1, v1}, Ll/۬ܳ֡;-><init>(ZZ)V

    return-object v0
.end method

.method public ֫(ILl/ܰۜ֡;)Ll/ܰۜ֡;
    .locals 1

    .line 533
    iget-object p2, p2, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    if-eqz p2, :cond_1

    add-int/lit8 p1, p1, 0x1

    if-ltz p1, :cond_1

    .line 534
    array-length v0, p2

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 538
    :cond_0
    aget-object p1, p2, p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(Ll/ۛۜ֡;Ll/ܰۜ֡;)Ll/ܰۜ֡;
    .locals 4

    .line 2164
    sget-object v0, Ll/ۨܳ֡;->ܽ:Ll/ܰۜ֡;

    if-ne p2, v0, :cond_0

    return-object p2

    .line 2168
    :cond_0
    iget-object v0, p1, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    monitor-enter v0

    .line 2169
    :try_start_0
    iget-object v1, p1, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۜ֡;

    if-eqz v1, :cond_1

    .line 2173
    monitor-exit v0

    return-object v1

    .line 2176
    :cond_1
    iget-object v1, p1, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    iput v1, p2, Ll/ܰۜ֡;->ۜ:I

    .line 2178
    iget-object v1, p2, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    .line 372
    iget-boolean v2, v1, Ll/۬ܳ֡;->ۛ:Z

    if-nez v2, :cond_5

    .line 273
    iget-object v1, v1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    if-nez v2, :cond_4

    .line 274
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    .line 276
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳ֡;

    .line 278
    iget-object v3, v2, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {p0, v3}, Ll/ۨܳ֡;->֫(Ll/ܽۜ֡;)Ll/ܽۜ֡;

    move-result-object v3

    iput-object v3, v2, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    goto :goto_0

    .line 2180
    :cond_3
    :goto_1
    iget-object v1, p2, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    invoke-virtual {v1}, Ll/۬ܳ֡;->ܽ()V

    goto :goto_2

    .line 273
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This set is readonly"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2185
    :cond_5
    :goto_2
    iget-object p1, p1, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    invoke-virtual {p1, p2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2186
    monitor-exit v0

    return-object p2

    :catchall_0
    move-exception p1

    .line 2187
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ֫(Ll/ۛۜ֡;Ll/ܰۜ֡;I)Ll/ܰۜ֡;
    .locals 11

    .line 554
    iget-object v0, p2, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p3, v1}, Ll/᩺᩻֡;->֫(Ll/۬ܳ֡;IZ)Ll/۬ܳ֡;

    move-result-object v0

    if-nez v0, :cond_0

    .line 556
    sget-object v0, Ll/ۨܳ֡;->ܽ:Ll/ܰۜ֡;

    invoke-virtual {p0, p1, p2, p3, v0}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;ILl/ܰۜ֡;)Ll/ܰۜ֡;

    return-object v0

    .line 561
    :cond_0
    new-instance v2, Ll/ܰۜ֡;

    invoke-direct {v2, v0}, Ll/ܰۜ֡;-><init>(Ll/۬ܳ֡;)V

    .line 563
    invoke-static {v0}, Ll/᩺᩻֡;->ܿ(Ll/۬ܳ֡;)I

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 576
    iput-boolean v4, v2, Ll/ܰۜ֡;->ܽ:Z

    .line 577
    iget-object v0, v2, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    iput v3, v0, Ll/۬ܳ֡;->ۨ:I

    .line 578
    iput v3, v2, Ll/ܰۜ֡;->ܳ:I

    goto :goto_0

    .line 580
    :cond_1
    invoke-virtual {p0, v0}, Ll/᩺᩻֡;->ܽ(Ll/۬ܳ֡;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 582
    iget-object v3, v2, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    invoke-virtual {p0, v0}, Ll/᩺᩻֡;->ۧ(Ll/۬ܳ֡;)Ljava/util/BitSet;

    move-result-object v0

    iput-object v0, v3, Ll/۬ܳ֡;->ۗ:Ljava/util/BitSet;

    .line 583
    iput-boolean v4, v2, Ll/ܰۜ֡;->᩻:Z

    .line 585
    iput-boolean v4, v2, Ll/ܰۜ֡;->ܽ:Z

    .line 586
    iget-object v0, v2, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    iget-object v0, v0, Ll/۬ܳ֡;->ۗ:Ljava/util/BitSet;

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    iput v0, v2, Ll/ܰۜ֡;->ܳ:I

    .line 589
    :cond_2
    :goto_0
    iget-boolean v0, v2, Ll/ܰۜ֡;->ܽ:Z

    if-eqz v0, :cond_13

    iget-object v0, v2, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    iget-boolean v0, v0, Ll/۬ܳ֡;->ۤ:Z

    if-eqz v0, :cond_13

    .line 590
    iget-object v0, p0, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    iget v3, p1, Ll/ۛۜ֡;->ۧ:I

    invoke-virtual {v0, v3}, Ll/᩸ܳ֡;->֫(I)Ll/ۜ᩻֡;

    move-result-object v0

    .line 154
    iget-object v0, v0, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 612
    iget-object v3, v2, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    .line 2017
    iget v5, v3, Ll/۬ܳ֡;->ۨ:I

    if-eqz v5, :cond_3

    .line 2018
    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    .line 2019
    iget v3, v3, Ll/۬ܳ֡;->ۨ:I

    invoke-virtual {v5, v3}, Ljava/util/BitSet;->set(I)V

    goto :goto_1

    .line 2022
    :cond_3
    iget-object v5, v3, Ll/۬ܳ֡;->ۗ:Ljava/util/BitSet;

    .line 613
    :goto_1
    iget-object v3, v2, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    add-int/lit8 v6, v0, 0x1

    .line 1194
    new-array v6, v6, [Ll/ۚۜ֡;

    .line 359
    iget-object v3, v3, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 1195
    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩹ܳ֡;

    .line 1196
    iget v8, v7, Ll/᩹ܳ֡;->֫:I

    invoke-virtual {v5, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 1197
    iget v8, v7, Ll/᩹ܳ֡;->֫:I

    aget-object v9, v6, v8

    iget-object v7, v7, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    if-nez v9, :cond_5

    move-object v9, v7

    goto :goto_4

    :cond_5
    if-nez v7, :cond_6

    goto :goto_4

    .line 420
    :cond_6
    sget-object v10, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    if-eq v9, v10, :cond_8

    if-ne v7, v10, :cond_7

    goto :goto_3

    .line 421
    :cond_7
    new-instance v10, Ll/ۘۜ֡;

    invoke-direct {v10, v9, v7}, Ll/ۘۜ֡;-><init>(Ll/ۚۜ֡;Ll/ۚۜ֡;)V

    .line 422
    iget-object v7, v10, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    array-length v9, v7

    if-ne v9, v4, :cond_8

    .line 423
    aget-object v9, v7, v1

    goto :goto_4

    :cond_8
    :goto_3
    move-object v9, v10

    .line 1197
    :goto_4
    aput-object v9, v6, v8

    goto :goto_2

    :cond_9
    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_5
    if-gt v3, v0, :cond_c

    .line 1203
    aget-object v7, v6, v3

    if-nez v7, :cond_a

    .line 1204
    sget-object v7, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    aput-object v7, v6, v3

    goto :goto_6

    .line 1206
    :cond_a
    sget-object v8, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    if-eq v7, v8, :cond_b

    add-int/lit8 v4, v4, 0x1

    :cond_b
    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_c
    const/4 v0, 0x0

    if-nez v4, :cond_d

    move-object v6, v0

    :cond_d
    if-eqz v6, :cond_12

    .line 1225
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x1

    const/4 v7, 0x0

    .line 1227
    :goto_7
    array-length v8, v6

    if-ge v4, v8, :cond_10

    .line 1228
    aget-object v8, v6, v4

    if-eqz v5, :cond_e

    .line 1233
    invoke-virtual {v5, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_e

    .line 1234
    new-instance v9, Ll/᩺ۜ֡;

    .line 96
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 97
    iput v4, v9, Ll/᩺ۜ֡;->֫:I

    .line 98
    iput-object v8, v9, Ll/᩺ۜ֡;->ۧ:Ll/ۚۜ֡;

    .line 1234
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1236
    :cond_e
    sget-object v9, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    if-eq v8, v9, :cond_f

    const/4 v7, 0x1

    :cond_f
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_10
    if-nez v7, :cond_11

    goto :goto_8

    :cond_11
    new-array v0, v1, [Ll/᩺ۜ֡;

    .line 1244
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩺ۜ֡;

    .line 615
    :goto_8
    iput-object v0, v2, Ll/ܰۜ֡;->ܿ:[Ll/᩺ۜ֡;

    .line 616
    iput v1, v2, Ll/ܰۜ֡;->ܳ:I

    goto :goto_9

    .line 622
    :cond_12
    invoke-virtual {v5, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    iput v0, v2, Ll/ܰۜ֡;->ܳ:I

    .line 591
    :goto_9
    iget-object v0, v2, Ll/ܰۜ֡;->ܿ:[Ll/᩺ۜ֡;

    if-eqz v0, :cond_13

    .line 592
    iput v1, v2, Ll/ܰۜ֡;->ܳ:I

    .line 597
    :cond_13
    invoke-virtual {p0, p1, p2, p3, v2}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;ILl/ܰۜ֡;)Ll/ܰۜ֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۛۜ֡;Ll/ܰۜ֡;ILl/ܰۜ֡;)Ll/ܰۜ֡;
    .locals 1

    if-nez p4, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2128
    :cond_0
    invoke-virtual {p0, p1, p4}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;)Ll/ܰۜ֡;

    move-result-object p1

    if-eqz p2, :cond_3

    const/4 p4, -0x1

    if-lt p3, p4, :cond_3

    .line 2129
    iget-object p4, p0, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    iget p4, p4, Ll/᩸ܳ֡;->ᩳ:I

    if-le p3, p4, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p2

    .line 2133
    monitor-enter v0

    .line 2134
    :try_start_0
    iget-object p4, p2, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    if-nez p4, :cond_2

    .line 2135
    iget-object p4, p0, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    iget p4, p4, Ll/᩸ܳ֡;->ᩳ:I

    add-int/lit8 p4, p4, 0x2

    new-array p4, p4, [Ll/ܰۜ֡;

    iput-object p4, p2, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    .line 2138
    :cond_2
    iget-object p2, p2, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    add-int/lit8 p3, p3, 0x1

    aput-object p1, p2, p3

    .line 2139
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_0
    return-object p1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۛۜ֡;IIZLjava/util/BitSet;Ll/۬ܳ֡;)V
    .locals 9

    .line 2222
    iget-object v0, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ᩴܳ֡;->ᩳ()Ll/ܺܳ֡;

    move-result-object v1

    iget-object v2, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v1 .. v8}, Ll/ܺܳ֡;->֫(Ll/ۢܳ֡;Ll/ۛۜ֡;IIZLjava/util/BitSet;Ll/۬ܳ֡;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۛۜ֡;ILl/۬ܳ֡;II)V
    .locals 8

    .line 2205
    iget-object v0, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ᩴܳ֡;->ᩳ()Ll/ܺܳ֡;

    move-result-object v1

    iget-object v2, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    move-object v3, p1

    move v4, p4

    move v5, p5

    move v6, p2

    move-object v7, p3

    invoke-virtual/range {v1 .. v7}, Ll/ܺܳ֡;->֫(Ll/ۢܳ֡;Ll/ۛۜ֡;IIILl/۬ܳ֡;)V

    :cond_0
    return-void
.end method

.method public ֫(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V
    .locals 11

    move-object v8, p0

    move-object v9, p1

    .line 1460
    iget-object v0, v9, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    instance-of v0, v0, Ll/ۢۜ֡;

    if-eqz v0, :cond_4

    .line 1463
    iget-object v0, v9, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v0}, Ll/ܽۜ֡;->ۧ()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    const/4 v10, 0x0

    .line 1464
    :goto_0
    iget-object v0, v9, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v0}, Ll/ܽۜ֡;->ܽ()I

    move-result v0

    if-ge v10, v0, :cond_2

    .line 1465
    iget-object v0, v9, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v0, v10}, Ll/ܽۜ֡;->ۧ(I)I

    move-result v0

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_1

    if-eqz p5, :cond_0

    .line 1467
    iget-object v2, v9, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    sget-object v3, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    iget-object v4, v9, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    iget-object v5, v8, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    move-object v0, p2

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;Ll/ۧ᩷֡;)V

    goto :goto_1

    .line 1474
    :cond_0
    invoke-virtual/range {p0 .. p7}, Ll/᩺᩻֡;->ۧ(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    goto :goto_1

    .line 1479
    :cond_1
    iget-object v0, v8, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    iget-object v0, v0, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    iget-object v1, v9, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v1, v10}, Ll/ܽۜ֡;->ۧ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܳ֡;

    .line 1480
    iget-object v1, v9, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v1, v10}, Ll/ܽۜ֡;->֫(I)Ll/ܽۜ֡;

    move-result-object v1

    .line 1481
    new-instance v2, Ll/᩹ܳ֡;

    iget v3, v9, Ll/᩹ܳ֡;->֫:I

    iget-object v4, v9, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    invoke-direct {v2, v0, v3, v1, v4}, Ll/᩹ܳ֡;-><init>(Ll/᩺ܳ֡;ILl/ܽۜ֡;Ll/ۚۜ֡;)V

    .line 1490
    iget v0, v9, Ll/᩹ܳ֡;->ܽ:I

    iput v0, v2, Ll/᩹ܳ֡;->ܽ:I

    add-int/lit8 v6, p6, -0x1

    move-object v0, p0

    move-object v1, v2

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move/from16 v5, p5

    move/from16 v7, p7

    .line 1492
    invoke-virtual/range {v0 .. v7}, Ll/᩺᩻֡;->֫(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    if-eqz p5, :cond_4

    .line 1499
    iget-object v0, v8, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    move-object v1, p2

    invoke-virtual {p2, p1, v0}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    return-void

    :cond_4
    move-object v1, p2

    .line 1509
    invoke-virtual/range {p0 .. p7}, Ll/᩺᩻֡;->ۧ(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    return-void
.end method

.method public ֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V
    .locals 19

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    .line 203
    iget-boolean v0, v10, Ll/᩺ܳ֡;->ۧ:Z

    if-nez v0, :cond_0

    .line 1608
    iget-object v0, v9, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object v1, v9, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    move-object/from16 v15, p0

    iget-object v2, v15, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    move-object/from16 p4, p1

    move-object/from16 p5, p2

    move-object/from16 p6, v0

    move-object/from16 p7, v1

    move-object/from16 p8, v2

    invoke-virtual/range {p3 .. p8}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;Ll/ۧ᩷֡;)V

    return-void

    :cond_0
    move-object/from16 v15, p0

    const/4 v0, 0x0

    const/4 v14, 0x0

    .line 154
    :goto_0
    iget-object v0, v10, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v14, v0, :cond_2

    .line 1612
    invoke-virtual {v10, v14}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v0

    iget-object v2, v0, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    move/from16 v13, p8

    .line 1613
    invoke-static {v2, v13}, Ll/᩺᩻֡;->֫(Ll/᩺ܳ֡;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    .line 1614
    invoke-virtual/range {v0 .. v8}, Ll/᩺᩻֡;->֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    move v0, v14

    goto :goto_1

    .line 1618
    :cond_1
    new-instance v12, Ll/᩹ܳ֡;

    .line 97
    iget-object v0, v9, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object v1, v9, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    invoke-direct {v12, v9, v2, v0, v1}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    move-object/from16 v11, p0

    move-object/from16 v13, p3

    move v0, v14

    move-object/from16 v14, p4

    move/from16 v15, p5

    move/from16 v16, p6

    move/from16 v17, p7

    move/from16 v18, p8

    .line 1618
    invoke-virtual/range {v11 .. v18}, Ll/᩺᩻֡;->֫(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    :goto_1
    add-int/lit8 v14, v0, 0x1

    move-object/from16 v15, p0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public ۧ(Ll/۬ܳ֡;)Ljava/util/BitSet;
    .locals 0

    .line 1975
    invoke-static {p1}, Ll/᩻ۜ֡;->ܽ(Ll/۬ܳ֡;)Ljava/util/Collection;

    move-result-object p1

    .line 1976
    invoke-static {p1}, Ll/᩻ۜ֡;->ܽ(Ljava/util/Collection;)Ljava/util/BitSet;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(ILl/֫ܳ֡;Ll/ۡܳ֡;)Ll/᩷ܳ֡;
    .locals 7

    .line 2076
    new-instance v6, Ll/᩷ܳ֡;

    .line 2077
    invoke-virtual {p2, p1}, Ll/֫ܳ֡;->᩻(I)Ll/֡ܳ֡;

    move-result-object v3

    const/4 p1, 0x1

    .line 2078
    invoke-virtual {p2, p1}, Ll/֫ܳ֡;->ᩳ(I)Ll/֡ܳ֡;

    move-result-object v4

    iget-object v1, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    move-object v0, v6

    move-object v2, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ܳ֡;-><init>(Ll/ۢܳ֡;Ll/֫ܳ֡;Ll/֡ܳ֡;Ll/֡ܳ֡;Ll/ۡܳ֡;)V

    return-object v6
.end method

.method public final ۧ(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V
    .locals 17

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move/from16 v13, p7

    .line 1522
    iget-object v14, v10, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget-object v15, v10, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    .line 203
    iget-boolean v0, v14, Ll/᩺ܳ֡;->ۧ:Z

    if-nez v0, :cond_0

    .line 1525
    iget-object v0, v9, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    invoke-virtual {v11, v10, v0}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x0

    .line 154
    :goto_0
    iget-object v1, v14, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v8, v1, :cond_1b

    const/16 v1, 0xa

    const/4 v2, 0x1

    if-nez v8, :cond_a

    .line 1731
    sget-boolean v3, Ll/᩺᩻֡;->ܺ:Z

    if-eqz v3, :cond_1

    goto/16 :goto_5

    .line 1737
    :cond_1
    invoke-virtual {v14}, Ll/᩺ܳ֡;->ۧ()I

    move-result v3

    if-ne v3, v1, :cond_a

    move-object v1, v14

    check-cast v1, Ll/᩹ۜ֡;

    iget-boolean v1, v1, Ll/᩹ۜ֡;->ۢ:Z

    if-eqz v1, :cond_a

    iget-object v1, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 1739
    invoke-virtual {v1}, Ll/ܽۜ֡;->ۧ()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 1740
    invoke-virtual {v1}, Ll/ܽۜ֡;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_5

    .line 1747
    :cond_2
    iget-object v1, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v1}, Ll/ܽۜ֡;->ܽ()I

    move-result v1

    const/4 v3, 0x0

    .line 1748
    :goto_1
    iget-object v4, v9, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    if-ge v3, v1, :cond_4

    .line 1749
    iget-object v4, v4, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    iget-object v5, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v5, v3}, Ll/ܽۜ֡;->ۧ(I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺ܳ֡;

    .line 1750
    iget v4, v4, Ll/᩺ܳ֡;->ᩳ:I

    iget v5, v14, Ll/᩺ܳ֡;->ᩳ:I

    if-eq v4, v5, :cond_3

    goto/16 :goto_5

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1753
    :cond_4
    invoke-virtual {v14, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v3

    iget-object v3, v3, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    check-cast v3, Ll/᩻᩻֡;

    .line 1754
    iget-object v3, v3, Ll/᩻᩻֡;->ۢ:Ll/ܳ᩻֡;

    iget v3, v3, Ll/᩺ܳ֡;->ܿ:I

    .line 1755
    iget-object v5, v4, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩻֡;

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v1, :cond_9

    .line 1760
    iget-object v6, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v6, v5}, Ll/ܽۜ֡;->ۧ(I)I

    move-result v6

    .line 1761
    iget-object v7, v4, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺ܳ֡;

    .line 154
    iget-object v7, v6, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v7, v2, :cond_a

    .line 1764
    invoke-virtual {v6, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v7

    invoke-virtual {v7}, Ll/۬ۜ֡;->ۧ()Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_5

    .line 1769
    :cond_5
    invoke-virtual {v6, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v0

    iget-object v0, v0, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 1770
    invoke-virtual {v6}, Ll/᩺ܳ֡;->ۧ()I

    move-result v7

    const/16 v2, 0x8

    if-ne v7, v2, :cond_6

    if-ne v0, v14, :cond_6

    goto :goto_3

    :cond_6
    if-ne v6, v3, :cond_7

    goto :goto_3

    :cond_7
    if-ne v0, v3, :cond_8

    :goto_3
    const/4 v0, 0x0

    goto :goto_4

    .line 1786
    :cond_8
    invoke-virtual {v0}, Ll/᩺ܳ֡;->ۧ()I

    move-result v6

    if-ne v6, v2, :cond_a

    .line 154
    iget-object v2, v0, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v6, 0x1

    if-ne v2, v6, :cond_a

    const/4 v2, 0x0

    .line 1788
    invoke-virtual {v0, v2}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v6

    invoke-virtual {v6}, Ll/۬ۜ֡;->ۧ()Z

    move-result v6

    if-eqz v6, :cond_a

    .line 1789
    invoke-virtual {v0, v2}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v0

    iget-object v0, v0, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    if-ne v0, v14, :cond_a

    goto :goto_3

    :goto_4
    add-int/lit8 v5, v5, 0x1

    const/4 v2, 0x1

    goto :goto_2

    :cond_9
    move/from16 v16, v8

    goto :goto_7

    .line 1534
    :cond_a
    :goto_5
    invoke-virtual {v14, v8}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v0

    .line 1535
    instance-of v1, v0, Ll/֫᩻֡;

    if-nez v1, :cond_b

    if-eqz p4, :cond_b

    const/4 v1, 0x1

    const/4 v5, 0x1

    goto :goto_6

    :cond_b
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 1537
    :goto_6
    invoke-virtual/range {p0 .. p0}, Ll/᩺᩻֡;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 203
    iget-boolean v1, v14, Ll/᩺ܳ֡;->ۧ:Z

    if-eqz v1, :cond_c

    .line 1538
    instance-of v1, v14, Ll/ۢۜ֡;

    if-nez v1, :cond_c

    .line 1539
    invoke-virtual {v0}, Ll/۬ۜ֡;->֫()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_c

    iget-object v1, v0, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 1540
    invoke-static {v1, v13}, Ll/᩺᩻֡;->֫(Ll/᩺ܳ֡;Z)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1542
    iget-object v2, v0, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v16, v8

    move/from16 v8, p7

    invoke-virtual/range {v0 .. v8}, Ll/᩺᩻֡;->֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    :goto_7
    move-object v8, v11

    goto/16 :goto_f

    :cond_c
    move/from16 v16, v8

    if-nez p6, :cond_d

    const/4 v1, 0x1

    goto :goto_8

    :cond_d
    const/4 v1, 0x0

    .line 1815
    :goto_8
    invoke-virtual {v0}, Ll/۬ۜ֡;->֫()I

    move-result v2

    iget-object v3, v9, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    const/16 v4, 0xa

    if-eq v2, v4, :cond_11

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_a

    .line 1829
    :pswitch_0
    move-object v1, v0

    check-cast v1, Ll/֫᩻֡;

    .line 1855
    new-instance v2, Ll/᩹ܳ֡;

    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 97
    iget-object v3, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v2, v10, v1, v3, v15}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    move-object v1, v2

    goto/16 :goto_b

    .line 1823
    :pswitch_1
    move-object v2, v0

    check-cast v2, Ll/ۧۜ֡;

    iget v4, v2, Ll/ۧۜ֡;->ᩳ:I

    iget v6, v2, Ll/ۧۜ֡;->ܿ:I

    iget-boolean v7, v2, Ll/ۧۜ֡;->ܽ:Z

    if-eqz v5, :cond_10

    if-eqz v7, :cond_e

    if-eqz v7, :cond_10

    if-eqz v1, :cond_10

    :cond_e
    if-eqz p5, :cond_f

    .line 1930
    iget-object v1, v9, Ll/᩺᩻֡;->ܿ:Ll/֫ܳ֡;

    invoke-interface {v1}, Ll/ܳܳ֡;->index()I

    move-result v1

    .line 1931
    iget-object v8, v9, Ll/᩺᩻֡;->ܿ:Ll/֫ܳ֡;

    iget v11, v9, Ll/᩺᩻֡;->᩻:I

    invoke-interface {v8, v11}, Ll/ܳܳ֡;->֫(I)V

    .line 41
    new-instance v8, Ll/֡ۜ֡;

    invoke-direct {v8, v6, v4, v7}, Ll/֡ۜ֡;-><init>(IIZ)V

    .line 1932
    iget-object v4, v9, Ll/᩺᩻֡;->ܳ:Ll/ۡܳ֡;

    .line 1426
    invoke-virtual {v8, v3, v4}, Ll/֡ۜ֡;->֫(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Z

    move-result v3

    .line 1933
    iget-object v4, v9, Ll/᩺᩻֡;->ܿ:Ll/֫ܳ֡;

    invoke-interface {v4, v1}, Ll/ܳܳ֡;->֫(I)V

    if-eqz v3, :cond_12

    .line 1935
    new-instance v1, Ll/᩹ܳ֡;

    iget-object v2, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 97
    iget-object v3, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v1, v10, v2, v3, v15}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    goto/16 :goto_b

    .line 41
    :cond_f
    new-instance v1, Ll/֡ۜ֡;

    invoke-direct {v1, v6, v4, v7}, Ll/֡ۜ֡;-><init>(IIZ)V

    .line 1940
    invoke-static {v15, v1}, Ll/ۚۜ֡;->֫(Ll/ۚۜ֡;Ll/ۚۜ֡;)Ll/ۚۜ֡;

    move-result-object v1

    .line 1941
    new-instance v3, Ll/᩹ܳ֡;

    iget-object v2, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 103
    iget-object v4, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v3, v10, v2, v4, v1}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    goto :goto_9

    .line 1945
    :cond_10
    new-instance v1, Ll/᩹ܳ֡;

    iget-object v2, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 97
    iget-object v3, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v1, v10, v2, v3, v15}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    goto/16 :goto_b

    .line 1817
    :pswitch_2
    move-object v1, v0

    check-cast v1, Ll/ۡۜ֡;

    .line 1959
    iget-object v2, v1, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    .line 1960
    iget-object v3, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget v2, v2, Ll/᩺ܳ֡;->ܿ:I

    .line 1961
    invoke-static {v3, v2}, Ll/۠ۜ֡;->֫(Ll/ܽۜ֡;I)Ll/۠ۜ֡;

    move-result-object v2

    .line 1962
    new-instance v3, Ll/᩹ܳ֡;

    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 115
    invoke-direct {v3, v10, v1, v2, v15}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    :goto_9
    move-object v1, v3

    goto/16 :goto_b

    :pswitch_3
    if-eqz v13, :cond_12

    const/4 v1, -0x1

    const/4 v2, 0x1

    .line 1840
    invoke-virtual {v0, v1, v2}, Ll/۬ۜ֡;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 1841
    new-instance v1, Ll/᩹ܳ֡;

    iget-object v2, v0, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 97
    iget-object v3, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v1, v10, v2, v3, v15}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    goto :goto_b

    .line 1832
    :pswitch_4
    new-instance v1, Ll/᩹ܳ֡;

    iget-object v2, v0, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 97
    iget-object v3, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v1, v10, v2, v3, v15}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    goto :goto_b

    .line 1820
    :cond_11
    move-object v2, v0

    check-cast v2, Ll/֫ۜ֡;

    iget v4, v2, Ll/֫ۜ֡;->ܽ:I

    if-eqz v5, :cond_14

    if-eqz v1, :cond_14

    if-eqz p5, :cond_13

    .line 1882
    iget-object v1, v9, Ll/᩺᩻֡;->ܿ:Ll/֫ܳ֡;

    invoke-interface {v1}, Ll/ܳܳ֡;->index()I

    move-result v1

    .line 1883
    iget-object v6, v9, Ll/᩺᩻֡;->ܿ:Ll/֫ܳ֡;

    iget v7, v9, Ll/᩺᩻֡;->᩻:I

    invoke-interface {v6, v7}, Ll/ܳܳ֡;->֫(I)V

    .line 37
    new-instance v6, Ll/᩵ۜ֡;

    invoke-direct {v6, v4}, Ll/᩵ۜ֡;-><init>(I)V

    .line 143
    iget v4, v6, Ll/᩵ۜ֡;->᩸:I

    invoke-virtual {v3, v4}, Ll/ۢܳ֡;->֫(I)Z

    move-result v3

    .line 1885
    iget-object v4, v9, Ll/᩺᩻֡;->ܿ:Ll/֫ܳ֡;

    invoke-interface {v4, v1}, Ll/ܳܳ֡;->֫(I)V

    if-eqz v3, :cond_12

    .line 1887
    new-instance v1, Ll/᩹ܳ֡;

    iget-object v2, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 97
    iget-object v3, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v1, v10, v2, v3, v15}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    goto :goto_b

    :cond_12
    :goto_a
    const/4 v1, 0x0

    goto :goto_b

    .line 37
    :cond_13
    new-instance v1, Ll/᩵ۜ֡;

    invoke-direct {v1, v4}, Ll/᩵ۜ֡;-><init>(I)V

    .line 1892
    invoke-static {v15, v1}, Ll/ۚۜ֡;->֫(Ll/ۚۜ֡;Ll/ۚۜ֡;)Ll/ۚۜ֡;

    move-result-object v1

    .line 1893
    new-instance v3, Ll/᩹ܳ֡;

    iget-object v2, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 103
    iget-object v4, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v3, v10, v2, v4, v1}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    goto :goto_9

    .line 1897
    :cond_14
    new-instance v3, Ll/᩹ܳ֡;

    iget-object v1, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 97
    iget-object v2, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v3, v10, v1, v2, v15}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    goto :goto_9

    :goto_b
    if-eqz v1, :cond_1a

    .line 1550
    instance-of v2, v14, Ll/ۢۜ֡;

    if-eqz v2, :cond_17

    .line 1558
    iget-object v2, v9, Ll/᩺᩻֡;->ᩳ:Ll/ۛۜ֡;

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Ll/ۛۜ֡;->֫()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 1559
    check-cast v0, Ll/ۢ᩻֡;

    invoke-virtual {v0}, Ll/ۢ᩻֡;->ᩳ()I

    move-result v0

    .line 1560
    iget-object v2, v9, Ll/᩺᩻֡;->ᩳ:Ll/ۛۜ֡;

    iget-object v2, v2, Ll/ۛۜ֡;->֫:Ll/ۜ᩻֡;

    iget v2, v2, Ll/᩺ܳ֡;->ᩳ:I

    if-ne v0, v2, :cond_15

    .line 144
    iget v0, v1, Ll/᩹ܳ֡;->ܽ:I

    const/high16 v2, 0x40000000    # 2.0f

    or-int/2addr v0, v2

    iput v0, v1, Ll/᩹ܳ֡;->ܽ:I

    .line 1565
    :cond_15
    iget v0, v1, Ll/᩹ܳ֡;->ܽ:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, v1, Ll/᩹ܳ֡;->ܽ:I

    .line 1567
    invoke-virtual {v12, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_e

    :cond_16
    move-object/from16 v8, p2

    .line 1572
    iput-boolean v2, v8, Ll/۬ܳ֡;->۬:Z

    add-int/lit8 v0, p6, -0x1

    goto :goto_c

    :cond_17
    move-object/from16 v8, p2

    .line 1578
    invoke-virtual {v0}, Ll/۬ۜ֡;->ۧ()Z

    move-result v2

    if-nez v2, :cond_18

    invoke-virtual {v12, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_f

    .line 1583
    :cond_18
    instance-of v0, v0, Ll/ۡۜ֡;

    if-eqz v0, :cond_19

    if-ltz p6, :cond_19

    add-int/lit8 v0, p6, 0x1

    :goto_c
    move v6, v0

    goto :goto_d

    :cond_19
    move/from16 v6, p6

    :goto_d
    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move v4, v5

    move/from16 v5, p5

    move/from16 v7, p7

    .line 1591
    invoke-virtual/range {v0 .. v7}, Ll/᩺᩻֡;->֫(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    goto :goto_f

    :cond_1a
    :goto_e
    move-object/from16 v8, p2

    :goto_f
    add-int/lit8 v0, v16, 0x1

    const/4 v1, 0x0

    move-object v11, v8

    move v8, v0

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_1b
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ll/᩻ۜ֡;
    .locals 1

    .line 2232
    iget-object v0, p0, Ll/᩺᩻֡;->ۢ:Ll/᩻ۜ֡;

    return-object v0
.end method

.method public ܽ(Ll/۬ܳ֡;)Z
    .locals 1

    .line 603
    iget-object v0, p0, Ll/᩺᩻֡;->ۢ:Ll/᩻ۜ֡;

    invoke-static {v0, p1}, Ll/᩻ۜ֡;->֫(Ll/᩻ۜ֡;Ll/۬ܳ֡;)Z

    move-result p1

    return p1
.end method
