.class public final Ll/ۗۗۖ;
.super Ll/۟ۗۖ;
.source "U5KR"


# static fields
.field public static ᩻:Ljava/util/Comparator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 389
    new-instance v0, Ll/ۙۗۖ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۗۗۖ;->᩻:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ljava/lang/Object;Ll/֫ۙۖ;Ll/֫ۙۖ;)Ljava/lang/Object;
    .locals 0

    .line 388
    check-cast p1, [Ll/۬ۗۖ;

    check-cast p2, [Ll/۬ۗۖ;

    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۗۗۖ;->֫([Ll/۬ۗۖ;[Ll/۬ۗۖ;Ll/֫ۙۖ;Ll/֫ۙۖ;)[Ll/۬ۗۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳ᩶ۖ;Ll/۠᩶ۖ;)Ll/ܰۗۖ;
    .locals 0

    .line 572
    invoke-super {p0, p1, p2}, Ll/۟ۗۖ;->֫(Ll/ᩳ᩶ۖ;Ll/۠᩶ۖ;)Ll/ܰۗۖ;

    move-result-object p2

    check-cast p2, Ll/۬ۗۖ;

    .line 573
    iput-object p1, p2, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    const/4 p1, 0x1

    .line 574
    iput-boolean p1, p2, Ll/۬ۗۖ;->ܳ:Z

    return-object p2
.end method

.method public final ֫(Ll/ܰۗۖ;)V
    .locals 1

    .line 388
    check-cast p1, Ll/۬ۗۖ;

    const/4 v0, 0x1

    .line 580
    iput-boolean v0, p1, Ll/۬ۗۖ;->ܳ:Z

    return-void
.end method

.method public final ֫([Ll/۬ۗۖ;[Ll/۬ۗۖ;Ll/֫ۙۖ;Ll/֫ۙۖ;)[Ll/۬ۗۖ;
    .locals 9

    .line 472
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 473
    iget-object v1, p4, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v2, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-ne v1, v2, :cond_0

    .line 474
    check-cast p4, Ll/۬᩶ۖ;

    .line 475
    iget-object p4, p4, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz p4, :cond_0

    .line 477
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸᩶ۖ;

    .line 91
    iget-object v2, v1, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 478
    check-cast v2, Ll/ᩳ᩶ۖ;

    .line 479
    iget v2, v2, Ll/ᩳ᩶ۖ;->ۗ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_4

    .line 486
    invoke-virtual {p0}, Ll/۟ۗۖ;->ᩳ()[Ll/ܰۗۖ;

    move-result-object p2

    check-cast p2, [Ll/۬ۗۖ;

    const/4 v2, 0x0

    .line 490
    :goto_1
    array-length v3, p2

    if-ge v2, v3, :cond_3

    .line 491
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    .line 494
    :cond_1
    aget-object v3, p1, v2

    if-eqz v3, :cond_2

    .line 567
    new-instance v4, Ll/۬ۗۖ;

    invoke-direct {v4, p4}, Ll/۬ۗۖ;-><init>(I)V

    .line 497
    iget-object v5, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    iput-object v3, v4, Ll/۬ۗۖ;->ᩳ:Ll/۬ۗۖ;

    .line 499
    iget v5, v3, Ll/۬ۗۖ;->֫:I

    add-int/2addr v5, v1

    iput v5, v4, Ll/۬ۗۖ;->֫:I

    .line 500
    iget-object v3, v3, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    iput-object v3, v4, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    .line 501
    aput-object v4, p2, v2

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    if-nez v2, :cond_8

    const/4 v3, 0x0

    .line 508
    :goto_4
    array-length v4, p2

    if-ge v3, v4, :cond_8

    .line 509
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_5

    .line 512
    :cond_5
    aget-object v4, p1, v3

    .line 513
    aget-object v5, p2, v3

    if-eqz v4, :cond_7

    if-eqz v5, :cond_7

    .line 515
    iget-object v6, v5, Ll/۬ۗۖ;->ܽ:Ljava/util/ArrayList;

    if-nez v6, :cond_6

    .line 516
    new-instance v6, Ljava/util/ArrayList;

    const/4 v7, 0x5

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v6, v5, Ll/۬ۗۖ;->ܽ:Ljava/util/ArrayList;

    .line 518
    :cond_6
    iget-object v5, v5, Ll/۬ۗۖ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 524
    :cond_8
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸᩶ۖ;

    .line 91
    iget-object v4, v3, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 525
    check-cast v4, Ll/ᩳ᩶ۖ;

    if-eqz v2, :cond_9

    .line 529
    new-instance v5, Ll/۬ۗۖ;

    invoke-direct {v5, p4}, Ll/۬ۗۖ;-><init>(I)V

    .line 530
    iput-object v4, v5, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    .line 531
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    iput-object v6, v5, Ll/۬ۗۖ;->ܿ:Ljava/util/HashMap;

    .line 532
    iget v6, v4, Ll/ᩳ᩶ۖ;->ۗ:I

    aput-object v5, p2, v6

    goto :goto_7

    .line 534
    :cond_9
    iget v5, v4, Ll/ᩳ᩶ۖ;->ۗ:I

    aget-object v5, p2, v5

    .line 537
    :goto_7
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 539
    iget v4, v4, Ll/ᩳ᩶ۖ;->ۗ:I

    aget-object v4, p1, v4

    if-eqz v4, :cond_a

    .line 541
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    :cond_a
    iget-object v3, v3, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 544
    invoke-virtual {v3}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v3

    array-length v4, v3

    const/4 v7, 0x0

    :goto_8
    if-ge v7, v4, :cond_c

    aget-object v8, v3, v7

    .line 545
    check-cast v8, Ll/ᩳ᩶ۖ;

    .line 546
    iget v8, v8, Ll/ᩳ᩶ۖ;->ۗ:I

    aget-object v8, p1, v8

    if-eqz v8, :cond_b

    .line 548
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    .line 551
    :cond_c
    sget-object v3, Ll/ۗۗۖ;->᩻:Ljava/util/Comparator;

    invoke-static {v6, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 552
    invoke-virtual {v6, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ۗۖ;

    .line 554
    iput-boolean v1, v3, Ll/۬ۗۖ;->ܳ:Z

    .line 555
    iget-object v4, v5, Ll/۬ۗۖ;->ܿ:Ljava/util/HashMap;

    iget-object v3, v3, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    invoke-virtual {v4, p3, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_d
    return-object p2
.end method

.method public final ֫(I)[Ll/ܰۗۖ;
    .locals 0

    .line 562
    new-array p1, p1, [Ll/۬ۗۖ;

    return-object p1
.end method

.method public final ܽ()V
    .locals 8

    .line 428
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 429
    new-instance v1, Ll/ۛۗۖ;

    invoke-direct {v1}, Ll/ۛۗۖ;-><init>()V

    .line 430
    iget-object v2, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ll/ۛۗۖ;->addAll(Ljava/util/Collection;)Z

    .line 432
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_5

    .line 433
    invoke-virtual {v1}, Ll/ۛۗۖ;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۗۖ;

    .line 434
    iget-boolean v4, v2, Ll/۬ۗۖ;->ܳ:Z

    if-eqz v4, :cond_0

    .line 435
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 438
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 440
    iget-object v4, v2, Ll/۬ۗۖ;->ᩳ:Ll/۬ۗۖ;

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    .line 441
    iget-boolean v6, v4, Ll/۬ۗۖ;->ܳ:Z

    if-nez v6, :cond_2

    .line 442
    iput-boolean v5, v4, Ll/۬ۗۖ;->ܳ:Z

    .line 443
    invoke-virtual {v1, v4}, Ll/ۛۗۖ;->add(Ljava/lang/Object;)Z

    .line 447
    :cond_2
    iget-object v4, v2, Ll/۬ۗۖ;->ܽ:Ljava/util/ArrayList;

    if-eqz v4, :cond_0

    .line 448
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_0

    .line 449
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬ۗۖ;

    if-eqz v6, :cond_3

    .line 450
    iget-boolean v7, v6, Ll/۬ۗۖ;->ܳ:Z

    if-nez v7, :cond_3

    .line 451
    iput-boolean v5, v6, Ll/۬ۗۖ;->ܳ:Z

    .line 452
    invoke-virtual {v1, v6}, Ll/ۛۗۖ;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 455
    :cond_4
    iput-object v3, v2, Ll/۬ۗۖ;->ܽ:Ljava/util/ArrayList;

    goto :goto_0

    .line 460
    :cond_5
    iget-object v0, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۗۖ;

    .line 461
    iput-object v3, v1, Ll/۬ۗۖ;->ᩳ:Ll/۬ۗۖ;

    goto :goto_2

    .line 463
    :cond_6
    iput-object v3, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method public final ܿ()Ll/ܰۗۖ;
    .locals 2

    .line 567
    new-instance v0, Ll/۬ۗۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۬ۗۖ;-><init>(I)V

    return-object v0
.end method
