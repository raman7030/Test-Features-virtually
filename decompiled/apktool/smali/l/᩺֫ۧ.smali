.class public final Ll/᩺֫ۧ;
.super Ljava/lang/Object;
.source "T8RT"

# interfaces
.implements Ll/ۡۧۧ;


# instance fields
.field public ֫:Ll/ܶ۠֫;

.field public ۜ:J

.field public ۡ:Ll/ۤۘۧ;

.field public ۢ:Z

.field public final ۧ:Ll/ۛ֫ۧ;

.field public ܳ:J

.field public ܽ:Ll/ۤۨ֫;

.field public ܿ:F

.field public ᩳ:J

.field public ᩷:Ll/ۧܳۧ;

.field public ᩻:F


# direct methods
.method public constructor <init>(Ll/ܶ۠֫;Ll/᩶᩷ۧ;)V
    .locals 2

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    iput-object p1, p0, Ll/᩺֫ۧ;->֫:Ll/ܶ۠֫;

    .line 183
    new-instance v0, Ll/ۤۘۧ;

    .line 51
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-object v0, p0, Ll/᩺֫ۧ;->ۡ:Ll/ۤۘۧ;

    .line 184
    new-instance v1, Ll/ۛ֫ۧ;

    invoke-direct {v1, p2, v0}, Ll/ۛ֫ۧ;-><init>(Ll/᩶᩷ۧ;Ll/ۤۘۧ;)V

    iput-object v1, p0, Ll/᩺֫ۧ;->ۧ:Ll/ۛ֫ۧ;

    .line 185
    invoke-virtual {v1, p1}, Ll/ۛ֫ۧ;->֫(Ll/ܶ۠֫;)V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 186
    iput-wide p1, p0, Ll/᩺֫ۧ;->ۜ:J

    .line 187
    iput-wide p1, p0, Ll/᩺֫ۧ;->ܳ:J

    .line 188
    iput-wide p1, p0, Ll/᩺֫ۧ;->ᩳ:J

    const p1, -0x800001

    .line 189
    iput p1, p0, Ll/᩺֫ۧ;->᩻:F

    .line 190
    iput p1, p0, Ll/᩺֫ۧ;->ܿ:F

    const/4 p1, 0x1

    .line 191
    iput-boolean p1, p0, Ll/᩺֫ۧ;->ۢ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/Class;Ll/ܶ۠֫;)Ll/ۡۧۧ;
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    .line 879
    const-class v2, Ll/ܶ۠֫;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v3

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡۧۧ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 881
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static synthetic ֫(Ll/᩺֫ۧ;Ll/۠ᩴ֫;)[Ll/֨᩷ۧ;
    .locals 1

    .line 557
    iget-object v0, p0, Ll/᩺֫ۧ;->ۡ:Ll/ۤۘۧ;

    invoke-virtual {v0, p1}, Ll/ۤۘۧ;->֫(Ll/۠ᩴ֫;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 558
    new-instance v0, Ll/ܽᩴۧ;

    iget-object p0, p0, Ll/᩺֫ۧ;->ۡ:Ll/ۤۘۧ;

    .line 559
    invoke-virtual {p0, p1}, Ll/ۤۘۧ;->ܽ(Ll/۠ᩴ֫;)Ll/ۢᩴۧ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܽᩴۧ;-><init>(Ll/ۢᩴۧ;)V

    goto :goto_0

    .line 560
    :cond_0
    new-instance v0, Ll/ۨ֫ۧ;

    invoke-direct {v0, p1}, Ll/ۨ֫ۧ;-><init>(Ll/۠ᩴ֫;)V

    :goto_0
    const/4 p0, 0x1

    new-array p0, p0, [Ll/֨᩷ۧ;

    const/4 p1, 0x0

    aput-object v0, p0, p1

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۧ᩵֫;)Ll/ۘۧۧ;
    .locals 9

    .line 480
    iget-object v0, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    iget-object v1, p1, Ll/ۧ᩵֫;->ۧ:Ll/ۛᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    iget-object v0, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    iget-object v2, v0, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    iget-object v3, v0, Ll/ۨᩴ֫;->ܽ:Ljava/lang/String;

    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    const-string v5, "ssai"

    .line 482
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 155
    :cond_0
    throw v4

    :cond_1
    :goto_0
    const-string v2, "application/x-image-uri"

    .line 485
    invoke-static {v3, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    .line 493
    iget-object v2, v0, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    .line 494
    invoke-static {v2, v3}, Ll/ۘ֨֫;->֫(Landroid/net/Uri;Ljava/lang/String;)I

    move-result v2

    .line 496
    iget-wide v3, v0, Ll/ۨᩴ֫;->ۧ:J

    iget-object v0, p0, Ll/᩺֫ۧ;->ۧ:Ll/ۛ֫ۧ;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v7, v3, v5

    if-eqz v7, :cond_2

    .line 497
    invoke-virtual {v0}, Ll/ۛ֫ۧ;->ۧ()V

    :cond_2
    const/4 v3, 0x2

    if-ne v2, v3, :cond_3

    .line 501
    iget-object v3, p0, Ll/᩺֫ۧ;->ܽ:Ll/ۤۨ֫;

    if-eqz v3, :cond_3

    .line 503
    iget-object v0, p0, Ll/᩺֫ۧ;->᩷:Ll/ۧܳۧ;

    if-eqz v0, :cond_4

    .line 104
    invoke-virtual {v3, v0}, Ll/ۤۨ֫;->֫(Ll/ۧܳۧ;)V

    goto :goto_1

    .line 508
    :cond_3
    :try_start_0
    invoke-virtual {v0, v2}, Ll/ۛ֫ۧ;->֫(I)Ll/ۡۧۧ;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 514
    :cond_4
    :goto_1
    invoke-virtual {v1}, Ll/ۛᩴ֫;->֫()Ll/ۤᩴ֫;

    move-result-object v0

    .line 515
    iget-wide v7, v1, Ll/ۛᩴ֫;->ܿ:J

    cmp-long v2, v7, v5

    if-nez v2, :cond_5

    .line 516
    iget-wide v7, p0, Ll/᩺֫ۧ;->ۜ:J

    invoke-virtual {v0, v7, v8}, Ll/ۤᩴ֫;->ܽ(J)V

    .line 518
    :cond_5
    iget v2, v1, Ll/ۛᩴ֫;->ᩳ:F

    const v4, -0x800001

    cmpl-float v2, v2, v4

    if-nez v2, :cond_6

    .line 519
    iget v2, p0, Ll/᩺֫ۧ;->᩻:F

    invoke-virtual {v0, v2}, Ll/ۤᩴ֫;->ۧ(F)V

    .line 521
    :cond_6
    iget v2, v1, Ll/ۛᩴ֫;->ۧ:F

    cmpl-float v2, v2, v4

    if-nez v2, :cond_7

    .line 522
    iget v2, p0, Ll/᩺֫ۧ;->ܿ:F

    invoke-virtual {v0, v2}, Ll/ۤᩴ֫;->֫(F)V

    .line 524
    :cond_7
    iget-wide v7, v1, Ll/ۛᩴ֫;->ܽ:J

    cmp-long v2, v7, v5

    if-nez v2, :cond_8

    .line 525
    iget-wide v7, p0, Ll/᩺֫ۧ;->ܳ:J

    invoke-virtual {v0, v7, v8}, Ll/ۤᩴ֫;->ۧ(J)V

    .line 527
    :cond_8
    iget-wide v7, v1, Ll/ۛᩴ֫;->֫:J

    cmp-long v2, v7, v5

    if-nez v2, :cond_9

    .line 528
    iget-wide v4, p0, Ll/᩺֫ۧ;->ᩳ:J

    invoke-virtual {v0, v4, v5}, Ll/ۤᩴ֫;->֫(J)V

    .line 530
    :cond_9
    invoke-virtual {v0}, Ll/ۤᩴ֫;->֫()Ll/ۛᩴ֫;

    move-result-object v0

    .line 532
    invoke-virtual {v0, v1}, Ll/ۛᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 533
    invoke-virtual {p1}, Ll/ۧ᩵֫;->֫()Ll/᩹ᩴ֫;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/᩹ᩴ֫;->֫(Ll/ۛᩴ֫;)V

    invoke-virtual {p1}, Ll/᩹ᩴ֫;->֫()Ll/ۧ᩵֫;

    move-result-object p1

    .line 536
    :cond_a
    iget-object v0, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    invoke-interface {v3, p1}, Ll/ۡۧۧ;->֫(Ll/ۧ᩵֫;)Ll/ۘۧۧ;

    move-result-object v1

    .line 539
    iget-object v0, v0, Ll/ۨᩴ֫;->ܿ:Ll/ܳ۬ܺ;

    .line 540
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_10

    .line 541
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [Ll/ۘۧۧ;

    const/4 v3, 0x0

    .line 542
    aput-object v1, v2, v3

    .line 543
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_f

    .line 544
    iget-boolean v1, p0, Ll/᩺֫ۧ;->ۢ:Z

    iget-object v4, p0, Ll/᩺֫ۧ;->֫:Ll/ܶ۠֫;

    if-eqz v1, :cond_d

    .line 545
    new-instance v1, Ll/֨ᩴ֫;

    invoke-direct {v1}, Ll/֨ᩴ֫;-><init>()V

    .line 547
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫᩵֫;

    iget-object v5, v5, Ll/֫᩵֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 548
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫᩵֫;

    iget-object v5, v5, Ll/֫᩵֫;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 549
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫᩵֫;

    iget v5, v5, Ll/֫᩵֫;->ܳ:I

    invoke-virtual {v1, v5}, Ll/֨ᩴ֫;->ܶ(I)V

    .line 550
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫᩵֫;

    iget v5, v5, Ll/֫᩵֫;->ܿ:I

    invoke-virtual {v1, v5}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 551
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫᩵֫;

    iget-object v5, v5, Ll/֫᩵֫;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ll/֨ᩴ֫;->ᩳ(Ljava/lang/String;)V

    .line 552
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫᩵֫;

    iget-object v5, v5, Ll/֫᩵֫;->֫:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    .line 553
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    .line 554
    new-instance v5, Ll/ۜۙ᩻;

    invoke-direct {v5, p0, v1}, Ll/ۜۙ᩻;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 562
    new-instance v6, Ll/ܳܽۧ;

    invoke-direct {v6, v4, v5}, Ll/ܳܽۧ;-><init>(Ll/ܶ۠֫;Ll/᩶᩷ۧ;)V

    .line 566
    iget-object v4, p0, Ll/᩺֫ۧ;->ۡ:Ll/ۤۘۧ;

    invoke-virtual {v4, v1}, Ll/ۤۘۧ;->֫(Ll/۠ᩴ֫;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 568
    invoke-virtual {v1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v4

    const-string v5, "application/x-media3-cues"

    .line 569
    invoke-virtual {v4, v5}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object v5, v1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 570
    invoke-virtual {v4, v5}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    iget-object v5, p0, Ll/᩺֫ۧ;->ۡ:Ll/ۤۘۧ;

    .line 572
    invoke-virtual {v5, v1}, Ll/ۤۘۧ;->ۧ(Ll/۠ᩴ֫;)I

    move-result v1

    .line 571
    invoke-virtual {v4, v1}, Ll/֨ᩴ֫;->ܳ(I)V

    .line 573
    invoke-virtual {v4}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    .line 564
    :cond_b
    invoke-virtual {v6, v1}, Ll/ܳܽۧ;->֫(Ll/۠ᩴ֫;)V

    .line 575
    iget-object v1, p0, Ll/᩺֫ۧ;->᩷:Ll/ۧܳۧ;

    if-eqz v1, :cond_c

    .line 576
    invoke-virtual {v6, v1}, Ll/ܳܽۧ;->ۧ(Ll/ۧܳۧ;)V

    :cond_c
    add-int/lit8 v1, v3, 0x1

    .line 580
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫᩵֫;

    iget-object v4, v4, Ll/֫᩵֫;->᩻:Landroid/net/Uri;

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    .line 55
    new-instance v5, Ll/᩹ᩴ֫;

    invoke-direct {v5}, Ll/᩹ᩴ֫;-><init>()V

    invoke-virtual {v5, v4}, Ll/᩹ᩴ֫;->ۧ(Ljava/lang/String;)V

    invoke-virtual {v5}, Ll/᩹ᩴ֫;->֫()Ll/ۧ᩵֫;

    move-result-object v4

    .line 579
    invoke-virtual {v6, v4}, Ll/ܳܽۧ;->֫(Ll/ۧ᩵֫;)Ll/᩻ܽۧ;

    move-result-object v4

    aput-object v4, v2, v1

    goto :goto_3

    .line 582
    :cond_d
    new-instance v1, Ll/᩶ܽۧ;

    invoke-direct {v1, v4}, Ll/᩶ܽۧ;-><init>(Ll/ܶ۠֫;)V

    .line 584
    iget-object v4, p0, Ll/᩺֫ۧ;->᩷:Ll/ۧܳۧ;

    if-eqz v4, :cond_e

    .line 585
    invoke-virtual {v1, v4}, Ll/᩶ܽۧ;->֫(Ll/ۧܳۧ;)V

    :cond_e
    add-int/lit8 v4, v3, 0x1

    .line 589
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫᩵֫;

    .line 588
    invoke-virtual {v1, v5}, Ll/᩶ܽۧ;->֫(Ll/֫᩵֫;)Ll/ۙܽۧ;

    move-result-object v1

    aput-object v1, v2, v4

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2

    .line 593
    :cond_f
    new-instance v1, Ll/ۗۧۧ;

    invoke-direct {v1, v2}, Ll/ۗۧۧ;-><init>([Ll/ۘۧۧ;)V

    .line 601
    :cond_10
    iget-object p1, p1, Ll/ۧ᩵֫;->֫:Ll/ۗᩴ֫;

    iget-boolean v0, p1, Ll/ۙᩴ֫;->ܽ:Z

    iget-wide v2, p1, Ll/ۙᩴ֫;->ۧ:J

    iget-wide v4, p1, Ll/ۙᩴ֫;->ܿ:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-nez v8, :cond_11

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, v2, v6

    if-nez v8, :cond_11

    if-nez v0, :cond_11

    return-object v1

    .line 606
    :cond_11
    new-instance v6, Ll/ᩴ֫ۧ;

    invoke-direct {v6, v1}, Ll/ᩴ֫ۧ;-><init>(Ll/ۘۧۧ;)V

    .line 607
    invoke-virtual {v6, v4, v5}, Ll/ᩴ֫ۧ;->ۧ(J)V

    .line 608
    invoke-virtual {v6, v2, v3}, Ll/ᩴ֫ۧ;->֫(J)V

    iget-boolean v1, p1, Ll/ۙᩴ֫;->ܳ:Z

    xor-int/lit8 v1, v1, 0x1

    .line 609
    invoke-virtual {v6, v1}, Ll/ᩴ֫ۧ;->ܽ(Z)V

    iget-boolean v1, p1, Ll/ۙᩴ֫;->ᩳ:Z

    .line 610
    invoke-virtual {v6, v1}, Ll/ᩴ֫ۧ;->֫(Z)V

    .line 611
    invoke-virtual {v6, v0}, Ll/ᩴ֫ۧ;->ᩳ(Z)V

    iget-boolean p1, p1, Ll/ۙᩴ֫;->֫:Z

    .line 612
    invoke-virtual {v6, p1}, Ll/ᩴ֫ۧ;->ۧ(Z)V

    .line 613
    invoke-virtual {v6}, Ll/ᩴ֫ۧ;->֫()Ll/ۚ֫ۧ;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 510
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 488
    :cond_12
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 155
    throw v4
.end method

.method public final ֫()Ll/ۡۧۧ;
    .locals 1

    .line 220
    iget-object v0, p0, Ll/᩺֫ۧ;->ۧ:Ll/ۛ֫ۧ;

    invoke-virtual {v0}, Ll/ۛ֫ۧ;->֫()V

    return-object p0
.end method

.method public final ֫(Ll/ۤۘۧ;)Ll/ۡۧۧ;
    .locals 1

    .line 210
    iput-object p1, p0, Ll/᩺֫ۧ;->ۡ:Ll/ۤۘۧ;

    .line 211
    iget-object v0, p0, Ll/᩺֫ۧ;->ۧ:Ll/ۛ֫ۧ;

    invoke-virtual {v0, p1}, Ll/ۛ֫ۧ;->֫(Ll/ۤۘۧ;)V

    return-object p0
.end method

.method public final bridge synthetic ֫(Ll/ۧܳۧ;)Ll/ۡۧۧ;
    .locals 0

    .line 100
    invoke-virtual {p0, p1}, Ll/᩺֫ۧ;->ۧ(Ll/ۧܳۧ;)V

    return-object p0
.end method

.method public final ֫(Z)Ll/ۡۧۧ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 200
    iput-boolean p1, p0, Ll/᩺֫ۧ;->ۢ:Z

    .line 201
    iget-object v0, p0, Ll/᩺֫ۧ;->ۧ:Ll/ۛ֫ۧ;

    invoke-virtual {v0, p1}, Ll/ۛ֫ۧ;->֫(Z)V

    return-object p0
.end method

.method public final ֫(Ll/ۤۨ֫;)V
    .locals 0

    .line 467
    iput-object p1, p0, Ll/᩺֫ۧ;->ܽ:Ll/ۤۨ֫;

    return-void
.end method

.method public final ۧ(Ll/ۧܳۧ;)V
    .locals 1

    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 450
    invoke-static {p1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll/᩺֫ۧ;->᩷:Ll/ۧܳۧ;

    .line 455
    iget-object v0, p0, Ll/᩺֫ۧ;->ۧ:Ll/ۛ֫ۧ;

    invoke-virtual {v0, p1}, Ll/ۛ֫ۧ;->֫(Ll/ۧܳۧ;)V

    return-void
.end method
