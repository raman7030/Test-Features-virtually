.class public final Ll/ۧܽܿ;
.super Ljava/lang/Object;
.source "35OM"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ֫֫:I

.field public final ۗ:Ll/۟᩺ᩳ;

.field public final ۙ:I

.field public final ۛ:Z

.field public final ۟:I

.field public final ۤ:Ll/ᩳܽܿ;

.field public ۧ֫:Z

.field public final synthetic ۨ:Ll/ܿܽܿ;

.field public final ۫:I

.field public final ۬:Ll/ᩴۨᩳ;

.field public final ܰ:I

.field public ᩶:Ll/֫ۛᩳ;

.field public volatile ᩸:Z

.field public final ᩹:I

.field public final ᩺:I


# direct methods
.method public constructor <init>(Ll/ܿܽܿ;ILl/ᩳܽܿ;II)V
    .locals 2

    .line 476
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    .line 463
    iget-object v0, p1, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    iput-object v0, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    .line 464
    invoke-virtual {p1}, Ll/ۗۤᩳ;->۫()I

    move-result v0

    iput v0, p0, Ll/ۧܽܿ;->۟:I

    .line 465
    iget-object v0, p1, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۜܽ()I

    move-result v1

    iput v1, p0, Ll/ۧܽܿ;->۫:I

    .line 466
    invoke-static {p1}, Ll/ܿܽܿ;->ۧ(Ll/ܿܽܿ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    iput p1, p0, Ll/ۧܽܿ;->᩹:I

    .line 468
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩻֫()I

    move-result p1

    iput p1, p0, Ll/ۧܽܿ;->֫֫:I

    .line 469
    invoke-virtual {v0}, Ll/۫ۨᩳ;->֫ܽ()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۧܽܿ;->ۛ:Z

    .line 470
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩻ܽ()Ll/ᩴۨᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۧܽܿ;->۬:Ll/ᩴۨᩳ;

    .line 477
    iput p2, p0, Ll/ۧܽܿ;->ۙ:I

    .line 478
    iput-object p3, p0, Ll/ۧܽܿ;->ۤ:Ll/ᩳܽܿ;

    .line 479
    iput p4, p0, Ll/ۧܽܿ;->ܰ:I

    .line 480
    iput p5, p0, Ll/ۧܽܿ;->᩺:I

    return-void
.end method

.method public static synthetic ֫(Ll/ۧܽܿ;Ljava/lang/Throwable;)V
    .locals 2

    .line 553
    :try_start_0
    iget-object v0, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {v0}, Ll/ܿܽܿ;->ܽ(Ll/ܿܽܿ;)Ll/ۧܽܿ;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto/16 :goto_0

    .line 555
    :cond_0
    iget-boolean v0, p0, Ll/ۧܽܿ;->ۧ֫:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-boolean v0, v0, Ll/ۗۤᩳ;->ᩳ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v1, v0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v1, v1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    if-ne v1, v0, :cond_1

    iget-object v0, v0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    iget-object v1, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    if-ne v0, v1, :cond_1

    .line 556
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iget v1, p0, Ll/ۧܽܿ;->۟:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Ll/ۧܽܿ;->᩹:I

    iget-object v1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {v1}, Ll/ܿܽܿ;->ۧ(Ll/ܿܽܿ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 557
    invoke-virtual {p0}, Ll/ۧܽܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 558
    iget-object v0, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {v0, p1}, Ll/ܿܽܿ;->֫(Ll/ܿܽܿ;Ljava/lang/Throwable;)V

    .line 561
    :cond_2
    iget-object p1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {p1}, Ll/ܿܽܿ;->ܿ(Ll/ܿܽܿ;)V

    .line 562
    iget-object p1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v0, p1, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-static {p1}, Ll/ܿܽܿ;->֫(Ll/ܿܽܿ;)Ll/᩷۟ᩳ;

    move-result-object p1

    if-eq v0, p1, :cond_3

    iget-object p1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {p1}, Ll/ܿܽܿ;->֫(Ll/ܿܽܿ;)Ll/᩷۟ᩳ;

    move-result-object v0

    iput-object v0, p1, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 563
    :cond_3
    iget-object p1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/ܿܽܿ;->ۧ(Ll/ܿܽܿ;Ll/᩷۟ᩳ;)V

    .line 564
    iget-object p1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-boolean p1, p1, Ll/ۗۤᩳ;->۬:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    const/4 v0, 0x0

    iput-boolean v0, p1, Ll/ۗۤᩳ;->ܳ֫:Z

    .line 565
    :cond_4
    iget-object p1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object p1, p1, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 566
    iget-object p1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v0, p1, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 568
    :goto_0
    iget-object p0, p0, Ll/ۧܽܿ;->᩶:Ll/֫ۛᩳ;

    invoke-virtual {p0}, Ll/֫ۛᩳ;->run()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p0, p0, Ll/ۧܽܿ;->᩶:Ll/֫ۛᩳ;

    invoke-virtual {p0}, Ll/֫ۛᩳ;->run()V

    .line 569
    throw p1
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 490
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 493
    :try_start_0
    iget-object v2, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-boolean v2, v2, Ll/ۗۤᩳ;->۬:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ll/ۧܽܿ;->֫()Z

    move-result v2

    if-nez v2, :cond_0

    const-wide/16 v2, 0xa

    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    .line 494
    :cond_0
    invoke-virtual {p0}, Ll/ۧܽܿ;->֫()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v2, :cond_1

    .line 549
    iget-object v1, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v1, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 551
    new-instance v0, Ll/᩻ۛᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩻ۛᩳ;-><init>(ILjava/lang/Object;)V

    goto/16 :goto_d

    .line 495
    :cond_1
    :try_start_1
    iget-object v2, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v2}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 496
    :try_start_2
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v3

    iget v4, p0, Ll/ۧܽܿ;->۟:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eq v3, v4, :cond_2

    .line 545
    :try_start_3
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 549
    iget-object v1, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v1, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 551
    new-instance v0, Ll/᩻ۛᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩻ۛᩳ;-><init>(ILjava/lang/Object;)V

    goto/16 :goto_d

    .line 498
    :cond_2
    :try_start_4
    new-instance v3, Ll/᩷۟ᩳ;

    invoke-direct {v3}, Ll/᩷۟ᩳ;-><init>()V

    .line 499
    iget-boolean v4, p0, Ll/ۧܽܿ;->ۛ:Z

    if-eqz v4, :cond_3

    invoke-virtual {v2}, Ll/۟᩸ᩳ;->length()I

    move-result v4

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->length()I

    move-result v5

    invoke-virtual {v2, v4, v5}, Ll/۟᩸ᩳ;->֫(II)Ll/᩺᩸ᩳ;

    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 501
    :try_start_5
    new-instance v5, Ll/ۨܰᩳ;

    invoke-direct {v5}, Ll/ۨܰᩳ;-><init>()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 503
    :goto_2
    invoke-virtual {p0}, Ll/ۧܽܿ;->֫()Z

    move-result v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v8, :cond_4

    .line 509
    :try_start_6
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 545
    :try_start_7
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 549
    iget-object v1, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v1, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 551
    new-instance v0, Ll/᩻ۛᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩻ۛᩳ;-><init>(ILjava/lang/Object;)V

    goto/16 :goto_d

    .line 504
    :cond_4
    :try_start_8
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->֫()I

    move-result v8

    if-gez v8, :cond_5

    .line 505
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->length()I

    move-result v9

    goto :goto_3

    :cond_5
    move v9, v8

    :goto_3
    add-int/lit8 v10, v7, 0x1

    invoke-virtual {v5, v6, v9, v7}, Ll/ۨܰᩳ;->֫(III)V

    .line 506
    invoke-virtual {v3, v5}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    add-int/lit8 v6, v8, 0x1

    if-gez v8, :cond_f

    .line 509
    :try_start_9
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->close()V

    .line 510
    new-instance v4, Ll/᩺ۧܿ;

    invoke-direct {v4, p0}, Ll/᩺ۧܿ;-><init>(Ll/ۧܽܿ;)V

    invoke-static {v2, v3, v1, v4}, Ll/ۡܽܿ;->֫(Ll/۟᩸ᩳ;Ll/᩷۟ᩳ;Ll/ۙ۟ᩳ;Ljava/util/function/BooleanSupplier;)Ljava/util/ArrayList;

    move-result-object v4

    .line 511
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 512
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ܽܿ;

    .line 513
    new-instance v8, Ll/۟ۧܿ;

    invoke-direct {v8, p0, v3, v7}, Ll/۟ۧܿ;-><init>(Ll/ۧܽܿ;Ll/᩷۟ᩳ;Ll/᩷ܽܿ;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    .line 515
    :goto_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v3, v6, :cond_7

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ܽܿ;

    invoke-virtual {v6}, Ll/᩷ܽܿ;->֫()I

    move-result v6

    iget v7, p0, Ll/ۧܽܿ;->ܰ:I

    if-ge v6, v7, :cond_7

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 516
    :cond_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    sget v6, Ll/ۜܽܿ;->᩷:I

    const/4 v7, 0x1

    add-int/2addr v3, v7

    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 517
    new-instance v4, Ll/ۨۧܿ;

    invoke-direct {v4, v2}, Ll/ۨۧܿ;-><init>(Ll/۟᩸ᩳ;)V

    invoke-virtual {v5, v0, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v6

    new-instance v8, Ll/᩺ۧܿ;

    invoke-direct {v8, p0}, Ll/᩺ۧܿ;-><init>(Ll/ۧܽܿ;)V

    invoke-static {v4, v6, v8}, Ll/ۜܽܿ;->֫(Ljava/util/function/Supplier;Ljava/util/List;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;

    move-result-object v4

    .line 518
    iget-object v6, p0, Ll/ۧܽܿ;->ۤ:Ll/ᩳܽܿ;

    invoke-static {v6}, Ll/ᩳܽܿ;->ᩳ(Ll/ᩳܽܿ;)Ll/ۢ۫ۡ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v6

    :goto_6
    if-eqz v4, :cond_9

    .line 519
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v3, v8, :cond_9

    invoke-virtual {p0}, Ll/ۧܽܿ;->֫()Z

    move-result v8

    if-nez v8, :cond_9

    .line 520
    invoke-virtual {v4}, Ll/᩷۟ᩳ;->size()I

    move-result v8

    iget v9, p0, Ll/ۧܽܿ;->ܰ:I

    invoke-static {v4, v9}, Ll/ܿܽܿ;->֫(Ll/᩷۟ᩳ;I)I

    move-result v9

    sub-int/2addr v8, v9

    int-to-long v8, v8

    const-wide/16 v10, 0x1

    sub-long/2addr v8, v10

    long-to-float v8, v8

    mul-float v8, v8, v6

    iget v9, p0, Ll/ۧܽܿ;->֫֫:I

    iget v10, p0, Ll/ۧܽܿ;->᩺:I

    add-int/2addr v9, v10

    int-to-float v9, v9

    cmpg-float v8, v8, v9

    if-gtz v8, :cond_9

    .line 521
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    sget v9, Ll/ۜܽܿ;->᩷:I

    add-int/2addr v9, v3

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 522
    new-instance v9, Ll/ۨۧܿ;

    invoke-direct {v9, v2}, Ll/ۨۧܿ;-><init>(Ll/۟᩸ᩳ;)V

    invoke-virtual {v5, v3, v8}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v3

    new-instance v10, Ll/᩺ۧܿ;

    invoke-direct {v10, p0}, Ll/᩺ۧܿ;-><init>(Ll/ۧܽܿ;)V

    invoke-static {v9, v3, v10}, Ll/ۜܽܿ;->֫(Ljava/util/function/Supplier;Ljava/util/List;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;

    move-result-object v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-nez v3, :cond_8

    .line 545
    :try_start_a
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 549
    iget-object v1, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v1, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 551
    new-instance v0, Ll/᩻ۛᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩻ۛᩳ;-><init>(ILjava/lang/Object;)V

    goto/16 :goto_d

    .line 524
    :cond_8
    :try_start_b
    invoke-virtual {v4, v3}, Ll/᩷۟ᩳ;->֫(Ll/᩷۟ᩳ;)V

    move v3, v8

    goto :goto_6

    :cond_9
    if-eqz v4, :cond_e

    .line 527
    invoke-virtual {p0}, Ll/ۧܽܿ;->֫()Z

    move-result v6

    if-eqz v6, :cond_a

    goto/16 :goto_9

    .line 528
    :cond_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v3, v6, :cond_b

    .line 529
    iget-object v3, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    sget v6, Ll/ۜܽܿ;->᩷:I

    invoke-static {v3, v5, v6, v4}, Ll/ܿܽܿ;->֫(Ll/ܿܽܿ;IILl/᩷۟ᩳ;)V

    .line 575
    iget v3, p0, Ll/ۧܽܿ;->ܰ:I

    invoke-static {v4, v3}, Ll/ܿܽܿ;->֫(Ll/᩷۟ᩳ;I)I

    move-result v3

    .line 576
    new-instance v5, Ll/֫ܽܿ;

    invoke-direct {v5, p0, v7, v4, v3}, Ll/֫ܽܿ;-><init>(Ll/ۧܽܿ;ZLl/᩷۟ᩳ;I)V

    invoke-static {v5}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_7

    .line 533
    :cond_b
    iget-object v6, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    sget v9, Ll/ۜܽܿ;->᩷:I

    invoke-static {v6, v8, v9, v4}, Ll/ܿܽܿ;->֫(Ll/ܿܽܿ;IILl/᩷۟ᩳ;)V

    .line 575
    iget v6, p0, Ll/ۧܽܿ;->ܰ:I

    invoke-static {v4, v6}, Ll/ܿܽܿ;->֫(Ll/᩷۟ᩳ;I)I

    move-result v6

    .line 576
    new-instance v8, Ll/֫ܽܿ;

    invoke-direct {v8, p0, v0, v4, v6}, Ll/֫ܽܿ;-><init>(Ll/ۧܽܿ;ZLl/᩷۟ᩳ;I)V

    invoke-static {v8}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 536
    new-instance v6, Ll/ۨۧܿ;

    invoke-direct {v6, v2}, Ll/ۨۧܿ;-><init>(Ll/۟᩸ᩳ;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v5, v3, v8}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v3

    new-instance v8, Ll/᩺ۧܿ;

    invoke-direct {v8, p0}, Ll/᩺ۧܿ;-><init>(Ll/ۧܽܿ;)V

    invoke-static {v6, v3, v8}, Ll/ۜܽܿ;->֫(Ljava/util/function/Supplier;Ljava/util/List;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;

    move-result-object v3

    if-eqz v3, :cond_d

    .line 537
    invoke-virtual {p0}, Ll/ۧܽܿ;->֫()Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_8

    .line 539
    :cond_c
    new-instance v6, Ll/᩷۟ᩳ;

    invoke-direct {v6, v4}, Ll/᩷۟ᩳ;-><init>(Ljava/util/Collection;)V

    .line 540
    invoke-virtual {v6, v3}, Ll/᩷۟ᩳ;->֫(Ll/᩷۟ᩳ;)V

    .line 541
    iget-object v3, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v3, v4, v9, v6}, Ll/ܿܽܿ;->֫(Ll/ܿܽܿ;IILl/᩷۟ᩳ;)V

    .line 575
    iget v3, p0, Ll/ۧܽܿ;->ܰ:I

    invoke-static {v6, v3}, Ll/ܿܽܿ;->֫(Ll/᩷۟ᩳ;I)I

    move-result v3

    .line 576
    new-instance v4, Ll/֫ܽܿ;

    invoke-direct {v4, p0, v7, v6, v3}, Ll/֫ܽܿ;-><init>(Ll/ۧܽܿ;ZLl/᩷۟ᩳ;I)V

    invoke-static {v4}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 545
    :goto_7
    :try_start_c
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/Error; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 549
    iget-object v1, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v1, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 551
    new-instance v0, Ll/᩻ۛᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩻ۛᩳ;-><init>(ILjava/lang/Object;)V

    goto :goto_d

    .line 545
    :cond_d
    :goto_8
    :try_start_d
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/lang/Error; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 549
    iget-object v1, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v1, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 551
    new-instance v0, Ll/᩻ۛᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩻ۛᩳ;-><init>(ILjava/lang/Object;)V

    goto :goto_d

    .line 545
    :cond_e
    :goto_9
    :try_start_e
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/lang/Error; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 549
    iget-object v1, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v1, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 551
    new-instance v0, Ll/᩻ۛᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩻ۛᩳ;-><init>(ILjava/lang/Object;)V

    goto :goto_d

    :cond_f
    move v7, v10

    goto/16 :goto_2

    :catchall_0
    move-exception v3

    .line 499
    :try_start_f
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto :goto_a

    :catchall_1
    move-exception v4

    :try_start_10
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    :catchall_2
    move-exception v3

    .line 495
    :try_start_11
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    goto :goto_b

    :catchall_3
    move-exception v2

    :try_start_12
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v3
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/lang/Error; {:try_start_12 .. :try_end_12} :catch_0
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    :catchall_4
    move-exception v1

    goto :goto_e

    :catch_0
    move-exception v2

    goto :goto_c

    :catch_1
    move-exception v2

    .line 547
    :goto_c
    :try_start_13
    invoke-virtual {p0}, Ll/ۧܽܿ;->֫()Z

    move-result v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    if-nez v3, :cond_10

    move-object v1, v2

    .line 549
    :cond_10
    iget-object v2, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v2, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 551
    new-instance v0, Ll/ܰۧܿ;

    invoke-direct {v0, p0, v1}, Ll/ܰۧܿ;-><init>(Ll/ۧܽܿ;Ljava/lang/Throwable;)V

    :goto_d
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 549
    :goto_e
    iget-object v2, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v2, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 551
    new-instance v0, Ll/᩻ۛᩳ;

    const/4 v2, 0x2

    invoke-direct {v0, v2, p0}, Ll/᩻ۛᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 571
    throw v1
.end method

.method public final ֫()Z
    .locals 2

    .line 484
    iget-boolean v0, p0, Ll/ۧܽܿ;->᩸:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {v0}, Ll/ܿܽܿ;->ܽ(Ll/ܿܽܿ;)Ll/ۧܽܿ;

    move-result-object v0

    if-ne v0, p0, :cond_1

    iget-object v0, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-boolean v0, v0, Ll/ۗۤᩳ;->ᩳ:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/ۧܽܿ;->᩹:I

    iget-object v1, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {v1}, Ll/ܿܽܿ;->ۧ(Ll/ܿܽܿ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v1, v0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v1, v1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    if-ne v1, v0, :cond_1

    iget-object v0, v0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    iget-object v1, p0, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    if-ne v0, v1, :cond_1

    .line 485
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iget v1, p0, Ll/ۧܽܿ;->۟:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
