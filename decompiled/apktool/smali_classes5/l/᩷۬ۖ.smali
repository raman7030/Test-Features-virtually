.class public final Ll/᩷۬ۖ;
.super Ll/ۤ᩵ۚ;
.source "A4XC"


# direct methods
.method public static ֫(Ll/ۚ᩹ۖ;Ljava/util/HashMap;)V
    .locals 7

    .line 267
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩶ۖ;

    add-int/lit8 v4, v2, 0x1

    .line 268
    iput v2, v3, Ll/ᩳ᩶ۖ;->ۗ:I

    move v2, v4

    goto :goto_0

    .line 272
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 273
    iget-object v3, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    new-instance v4, Ll/ᩳ۬ۖ;

    invoke-direct {v4, v2, v0, p1}, Ll/ᩳ۬ۖ;-><init>(ILjava/util/ArrayList;Ljava/util/HashMap;)V

    invoke-static {v3, v4}, Ll/ܶۙۖ;->֫(Ll/ܽۙۖ;Ll/֡ۙۖ;)V

    .line 444
    new-instance v2, Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 445
    new-instance v3, Ll/ۛۗۖ;

    invoke-direct {v3}, Ll/ۛۗۖ;-><init>()V

    .line 446
    invoke-virtual {v3, v0}, Ll/ۛۗۖ;->addAll(Ljava/util/Collection;)Z

    .line 447
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 448
    :cond_1
    :goto_1
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v4, 0x1

    if-nez v0, :cond_5

    .line 449
    invoke-virtual {v3}, Ll/ۛۗۖ;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜ۬ۖ;

    .line 450
    iget-boolean v5, v0, Ll/ۜ۬ۖ;->ܳ:Z

    if-eqz v5, :cond_1

    .line 451
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    .line 454
    :cond_2
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 456
    iget-object v5, v0, Ll/ۜ۬ۖ;->ᩳ:Ll/ۜ۬ۖ;

    if-eqz v5, :cond_3

    .line 458
    iget-boolean v6, v5, Ll/ۜ۬ۖ;->ܳ:Z

    if-nez v6, :cond_3

    .line 459
    iput-boolean v4, v5, Ll/ۜ۬ۖ;->ܳ:Z

    .line 460
    invoke-virtual {v3, v5}, Ll/ۛۗۖ;->add(Ljava/lang/Object;)Z

    .line 464
    :cond_3
    iget-object v0, v0, Ll/ۜ۬ۖ;->ܽ:Ljava/util/HashSet;

    if-eqz v0, :cond_1

    .line 465
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۜ۬ۖ;

    .line 466
    iget-boolean v6, v5, Ll/ۜ۬ۖ;->ܳ:Z

    if-nez v6, :cond_4

    .line 467
    iput-boolean v4, v5, Ll/ۜ۬ۖ;->ܳ:Z

    .line 468
    invoke-virtual {v3, v5}, Ll/ۛۗۖ;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 405
    :cond_5
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ۬ۖ;

    .line 406
    iget-object v3, v2, Ll/ۜ۬ۖ;->֫:Ll/᩻۬ۖ;

    iget-object v5, v2, Ll/ۜ۬ۖ;->ۧ:Ll/ᩳ᩶ۖ;

    iget-object v3, v3, Ll/᩻۬ۖ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-le v3, v4, :cond_7

    .line 407
    invoke-virtual {p1, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 409
    :cond_7
    iget-object v3, v2, Ll/ۜ۬ۖ;->ᩳ:Ll/ۜ۬ۖ;

    if-eqz v3, :cond_6

    iget-object v2, v2, Ll/ۜ۬ۖ;->ܽ:Ljava/util/HashSet;

    if-eqz v2, :cond_6

    .line 411
    iget-object v3, v3, Ll/ۜ۬ۖ;->ܿ:Ljava/util/BitSet;

    .line 412
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۜ۬ۖ;

    .line 413
    iget-object v6, v6, Ll/ۜ۬ۖ;->ܿ:Ljava/util/BitSet;

    invoke-virtual {v3, v6}, Ljava/util/BitSet;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    .line 414
    invoke-virtual {p1, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 422
    :cond_9
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_a
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 423
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 424
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳ᩶ۖ;

    .line 425
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻۬ۖ;

    .line 426
    iget-object v3, v0, Ll/᩻۬ۖ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫ۙۖ;

    .line 427
    iget-object v4, v4, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    check-cast v4, [Ll/ۜ۬ۖ;

    .line 428
    iget v5, v2, Ll/ᩳ᩶ۖ;->ۗ:I

    aget-object v4, v4, v5

    .line 429
    iget-object v4, v4, Ll/ۜ۬ۖ;->ܿ:Ljava/util/BitSet;

    .line 430
    invoke-virtual {v4, v1}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result v5

    iget v6, v0, Ll/᩻۬ۖ;->ܽ:I

    if-lt v5, v6, :cond_c

    invoke-virtual {v4, v6}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v4

    if-ltz v4, :cond_b

    .line 431
    :cond_c
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_4

    .line 438
    :cond_d
    iget-object p0, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {p0}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۙۖ;

    const/4 v0, 0x0

    .line 439
    iput-object v0, p1, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    goto :goto_5

    :cond_e
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩹ۖ;)Z
    .locals 16

    move-object/from16 v0, p1

    .line 514
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 515
    iget-object v2, v0, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    goto/16 :goto_2

    .line 518
    :cond_0
    invoke-static/range {p1 .. p1}, Ll/ܶۙۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 519
    new-instance v3, Ll/ܿ۬ۖ;

    invoke-direct {v3, v1}, Ll/ܿ۬ۖ;-><init>(Ljava/util/HashMap;)V

    invoke-static {v0, v3}, Ll/ܶۙۖ;->֫(Ll/ۚ᩹ۖ;Ll/᩵ۙۖ;)V

    .line 564
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v3

    if-lez v3, :cond_4

    .line 565
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 566
    iget-object v5, v0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    if-eqz v5, :cond_3

    .line 567
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬᩶ۖ;

    .line 568
    iget-object v6, v6, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz v6, :cond_1

    .line 569
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩸᩶ۖ;

    .line 91
    iget-object v8, v7, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 570
    check-cast v8, Ll/ᩳ᩶ۖ;

    invoke-virtual {v3, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 96
    iget-object v7, v7, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 571
    invoke-virtual {v7}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_2

    aget-object v10, v7, v9

    .line 572
    check-cast v10, Ll/ᩳ᩶ۖ;

    invoke-virtual {v3, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 578
    :cond_3
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v5

    if-lez v5, :cond_4

    .line 579
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳ᩶ۖ;

    .line 580
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 119
    :cond_4
    :goto_2
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_a

    .line 479
    :cond_5
    new-instance v3, Ljava/util/BitSet;

    invoke-direct {v3}, Ljava/util/BitSet;-><init>()V

    .line 480
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    .line 481
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 482
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻۬ۖ;

    .line 484
    iget-object v7, v6, Ll/᩻۬ۖ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֫ۙۖ;

    .line 485
    iget-object v9, v8, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v10, Ll/۟᩶ۖ;->ۙ:Ll/۟᩶ۖ;

    if-ne v9, v10, :cond_7

    .line 486
    invoke-virtual {v8}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v8

    check-cast v8, Ll/ۨ᩹ۖ;

    iget-object v8, v8, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v8

    .line 487
    invoke-virtual {v3, v4}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v9

    if-ltz v9, :cond_6

    if-lt v9, v8, :cond_9

    .line 489
    :cond_6
    invoke-virtual {v3, v4, v8}, Ljava/util/BitSet;->set(II)V

    goto :goto_4

    .line 495
    :cond_7
    invoke-virtual {v8}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v8

    check-cast v8, Ll/۫᩹ۖ;

    .line 118
    iget-object v8, v8, Ll/֡᩶ۖ;->۬:Ll/۠᩶ۖ;

    .line 496
    check-cast v8, Ll/ۨ᩹ۖ;

    iget-object v8, v8, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    .line 497
    invoke-virtual {v3, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-nez v9, :cond_9

    .line 498
    invoke-virtual {v3, v8}, Ljava/util/BitSet;->set(I)V

    goto :goto_4

    .line 505
    :cond_8
    invoke-virtual {v3, v4}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result v7

    iget v6, v6, Ll/᩻۬ۖ;->ܽ:I

    if-lt v7, v6, :cond_9

    invoke-virtual {v3, v6}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v6

    if-ltz v6, :cond_a

    .line 506
    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 508
    :cond_a
    invoke-virtual {v3}, Ljava/util/BitSet;->clear()V

    goto :goto_3

    .line 124
    :cond_b
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_a

    .line 228
    :cond_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳ᩶ۖ;

    .line 229
    iput v6, v5, Ll/ᩳ᩶ۖ;->ۗ:I

    goto :goto_5

    .line 232
    :cond_d
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v3

    const/16 v5, 0x32

    if-ge v3, v5, :cond_e

    .line 233
    invoke-static {v0, v1}, Ll/᩷۬ۖ;->֫(Ll/ۚ᩹ۖ;Ljava/util/HashMap;)V

    goto :goto_9

    .line 238
    :cond_e
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 239
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 240
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 243
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v5, :cond_f

    .line 244
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_f

    .line 245
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    .line 246
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩳ᩶ۖ;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩻۬ۖ;

    invoke-virtual {v7, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    .line 248
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ᩳ᩶ۖ;

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    .line 250
    :cond_f
    invoke-static {v0, v7}, Ll/᩷۬ۖ;->֫(Ll/ۚ᩹ۖ;Ljava/util/HashMap;)V

    .line 251
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ᩳ᩶ۖ;

    .line 252
    iput v6, v11, Ll/ᩳ᩶ۖ;->ۗ:I

    goto :goto_8

    .line 254
    :cond_10
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 255
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 256
    invoke-virtual {v7}, Ljava/util/HashMap;->clear()V

    goto :goto_6

    .line 258
    :cond_11
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 261
    :goto_9
    invoke-static/range {p1 .. p1}, Ll/ܶۙۖ;->ۧ(Ll/ۚ᩹ۖ;)I

    .line 130
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v3

    if-nez v3, :cond_12

    :goto_a
    return v4

    .line 140
    :cond_12
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 141
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 142
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳ᩶ۖ;

    .line 143
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩻۬ۖ;

    .line 144
    iget v7, v4, Ll/᩻۬ۖ;->ܽ:I

    iget-object v8, v4, Ll/᩻۬ۖ;->ۧ:Ljava/util/ArrayList;

    iget-object v9, v4, Ll/᩻۬ۖ;->ܿ:Ljava/util/ArrayList;

    new-array v7, v7, [Ll/۠᩶ۖ;

    .line 145
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_14
    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_17

    .line 146
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/֫ۙۖ;

    .line 147
    iget-object v12, v11, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v13, Ll/۟᩶ۖ;->ۙ:Ll/۟᩶ۖ;

    if-ne v12, v13, :cond_15

    .line 148
    invoke-virtual {v11}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v12

    check-cast v12, Ll/ᩳ᩶ۖ;

    if-ne v12, v5, :cond_14

    .line 150
    invoke-virtual {v11}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v11

    check-cast v11, Ll/ۨ᩹ۖ;

    iget-object v11, v11, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    .line 151
    invoke-static {v11}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v12

    const/4 v13, 0x0

    :goto_d
    if-ge v13, v12, :cond_14

    .line 153
    invoke-static {v11, v13}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v14

    .line 331
    new-instance v15, Ll/ۨ᩹ۖ;

    invoke-direct {v15, v14}, Ll/ۨ᩹ۖ;-><init>(Ljava/lang/Object;)V

    .line 153
    aput-object v15, v7, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_d

    .line 157
    :cond_15
    invoke-virtual {v11}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v12

    check-cast v12, Ll/۫᩹ۖ;

    .line 113
    iget-object v13, v12, Ll/֡᩶ۖ;->ۗ:Ll/۠᩶ۖ;

    .line 158
    check-cast v13, Ll/ᩳ᩶ۖ;

    if-ne v13, v5, :cond_14

    .line 118
    iget-object v12, v12, Ll/֡᩶ۖ;->۬:Ll/۠᩶ۖ;

    .line 160
    check-cast v12, Ll/ۨ᩹ۖ;

    iget-object v12, v12, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    .line 161
    invoke-virtual {v11}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v13

    .line 162
    iget-object v14, v13, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v15, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-eq v14, v15, :cond_16

    sget-object v15, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-eq v14, v15, :cond_16

    .line 163
    new-instance v14, Ll/ᩳ᩶ۖ;

    invoke-direct {v14, v6}, Ll/ᩳ᩶ۖ;-><init>(I)V

    .line 164
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    iget-object v15, v0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-static {v14, v13}, Ll/ᩳۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠᩶ۖ;)Ll/᩸᩶ۖ;

    move-result-object v13

    invoke-virtual {v15, v11, v13}, Ll/ܽۙۖ;->ۧ(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    move-object v13, v14

    .line 168
    :cond_16
    aput-object v13, v7, v12

    goto :goto_c

    .line 185
    :cond_17
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 186
    iget-object v10, v0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    iget-object v11, v4, Ll/᩻۬ۖ;->֫:Ll/᩸᩶ۖ;

    invoke-virtual {v10, v11}, Ll/ܽۙۖ;->ܽ(Ll/֫ۙۖ;)V

    .line 187
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֫ۙۖ;

    .line 188
    iget-object v11, v0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v11, v10}, Ll/ܽۙۖ;->ܽ(Ll/֫ۙۖ;)V

    goto :goto_e

    .line 190
    :cond_18
    new-instance v8, Ll/ܽ۬ۖ;

    invoke-direct {v8, v5, v4, v7, v3}, Ll/ܽ۬ۖ;-><init>(Ll/ᩳ᩶ۖ;Ll/᩻۬ۖ;[Ll/۠᩶ۖ;Ljava/util/ArrayList;)V

    .line 207
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1a

    const/4 v4, 0x0

    .line 208
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫ۙۖ;

    .line 209
    iget-object v7, v0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v7, v5}, Ll/ܽۙۖ;->֫(Ll/֫ۙۖ;)Z

    move-result v7

    if-eqz v7, :cond_19

    .line 210
    invoke-static {v5, v8, v4}, Ll/ܶۙۖ;->ۧ(Ll/֫ۙۖ;Ll/۠ۙۖ;Z)V

    goto/16 :goto_b

    .line 212
    :cond_19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_f
    if-ge v5, v4, :cond_13

    .line 214
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠᩶ۖ;

    invoke-static {v7, v8}, Ll/ܶۙۖ;->ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;

    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    .line 217
    :cond_1a
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_1b

    goto/16 :goto_b

    .line 220
    :cond_1b
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "array is used multiple times"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    const/4 v0, 0x1

    return v0
.end method
