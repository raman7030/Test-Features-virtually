.class public final Ll/᩷ۡ᩻;
.super Ll/۟ܶۡ;
.source "TAIM"


# instance fields
.field public final synthetic ۖ:Ll/ܽۢܳ;

.field public ۜ:Ll/ۙ֡ܿ;

.field public final synthetic ۡ:Ll/۟ۢ֫;

.field public final synthetic ۢ:Ljava/util/ArrayList;

.field public ܳ:Ll/֫۬ܿ;

.field public final synthetic ܺ:Ll/ۗۢ᩻;

.field public final synthetic ᩷:Ll/ۚۡ᩻;

.field public ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۚۡ᩻;Ll/ܽۢܳ;Ll/᩷ۡ֫;Ljava/util/ArrayList;Ll/ۗۢ᩻;)V
    .locals 0

    .line 496
    iput-object p1, p0, Ll/᩷ۡ᩻;->᩷:Ll/ۚۡ᩻;

    iput-object p2, p0, Ll/᩷ۡ᩻;->ۖ:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/᩷ۡ᩻;->ۡ:Ll/۟ۢ֫;

    iput-object p4, p0, Ll/᩷ۡ᩻;->ۢ:Ljava/util/ArrayList;

    iput-object p5, p0, Ll/᩷ۡ᩻;->ܺ:Ll/ۗۢ᩻;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 497
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩷ۡ᩻;->᩻:Ljava/util/ArrayList;

    .line 498
    new-instance p1, Ll/ۙ֡ܿ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ۙ֡ܿ;-><init>(I)V

    iput-object p1, p0, Ll/᩷ۡ᩻;->ۜ:Ll/ۙ֡ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 568
    iget-object v0, p0, Ll/᩷ۡ᩻;->᩷:Ll/ۚۡ᩻;

    invoke-static {v0}, Ll/ۚۡ᩻;->ۧ(Ll/ۚۡ᩻;)V

    .line 569
    iget-object v1, p0, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {v1}, Ll/֫۬ܿ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f12003d

    .line 570
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    const v1, 0x7f120ac1

    .line 571
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/᩷ۡ᩻;->ۖ:Ll/ܽۢܳ;

    iget-object v3, p0, Ll/᩷ۡ᩻;->ۢ:Ljava/util/ArrayList;

    invoke-static {v0, v2, v3, v1}, Ll/ۚۡ᩻;->֫(Ll/ۚۡ᩻;Ll/ܽۢܳ;Ljava/util/ArrayList;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 4

    .line 577
    iget-object v0, p0, Ll/᩷ۡ᩻;->᩷:Ll/ۚۡ᩻;

    invoke-static {v0}, Ll/ۚۡ᩻;->ۧ(Ll/ۚۡ᩻;)V

    .line 578
    iget-object v0, p0, Ll/᩷ۡ᩻;->ۖ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    new-instance v2, Ll/᩻ۡ᩻;

    iget-object v3, p0, Ll/᩷ۡ᩻;->ۢ:Ljava/util/ArrayList;

    invoke-direct {v2, p0, v0, v3}, Ll/᩻ۡ᩻;-><init>(Ll/᩷ۡ᩻;Ll/ܽۢܳ;Ljava/util/ArrayList;)V

    invoke-virtual {v1, p1, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 503
    new-instance v0, Ll/֫۬ܿ;

    iget-object v1, p0, Ll/᩷ۡ᩻;->ۖ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֫۬ܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f120ac2

    .line 122
    invoke-static {v1}, Ll/ۙ᩸᩷;->ܽ(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֫۬ܿ;->ܿ(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 77
    invoke-virtual {v0, v1}, Ll/֫۬ܿ;->֫(Ll/֨۫᩷;)V

    .line 506
    invoke-virtual {v0}, Ll/֫۬ܿ;->ܳ()V

    iput-object v0, p0, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 12

    .line 515
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 517
    iget-object v1, p0, Ll/᩷ۡ᩻;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۢܳ;

    .line 518
    invoke-virtual {v4}, Ll/ۛۢܳ;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 519
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 520
    invoke-virtual {v4}, Ll/ۛۢܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    add-long/2addr v2, v4

    goto :goto_0

    .line 523
    :cond_1
    new-instance v1, Ll/᩷۫ܳ;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v1, v4, v2, v3}, Ll/᩷۫ܳ;-><init>(IJ)V

    .line 525
    iget-object v2, p0, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ll/֫۬ܿ;->֫(Z)V

    .line 526
    new-instance v2, Ll/۠ۢ᩻;

    iget-object v3, p0, Ll/᩷ۡ᩻;->ܺ:Ll/ۗۢ᩻;

    invoke-direct {v2, v3}, Ll/۠ۢ᩻;-><init>(Ll/ۗۢ᩻;)V

    .line 527
    new-instance v3, Ll/ۜۡ᩻;

    invoke-direct {v3, p0, v1}, Ll/ۜۡ᩻;-><init>(Ll/᩷ۡ᩻;Ll/᩷۫ܳ;)V

    .line 547
    iget-object v10, p0, Ll/᩷ۡ᩻;->ۜ:Ll/ۙ֡ܿ;

    invoke-virtual {v10}, Ll/ۙ֡ܿ;->ۧ()V

    .line 549
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ll/ۛۢܳ;

    .line 550
    iget-object v4, p0, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {v11}, Ll/ۛۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/֫۬ܿ;->ܽ(Ljava/lang/CharSequence;)V

    .line 551
    invoke-virtual {v11}, Ll/ۛۢܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 552
    invoke-virtual {v11}, Ll/ۛۢܳ;->ۧ()Ljava/lang/String;

    move-result-object v7

    .line 553
    sget-boolean v8, Ll/᩶ۖ᩷;->֫:Z

    .line 101
    sget-object v5, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    move-object v4, v2

    move-object v9, v3

    invoke-virtual/range {v4 .. v9}, Ll/۠ۢ᩻;->֫(Ll/ܰܺܳ;Ljava/lang/String;Ljava/lang/String;ZLl/ۚ᩸ܿ;)V

    .line 510
    iget-object v4, p0, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {v4}, Ll/֫۬ܿ;->ᩳ()Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v4, p0, Ll/᩷ۡ᩻;->ۡ:Ll/۟ۢ֫;

    invoke-virtual {v4}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v4

    sget-object v5, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v4, v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v4, 0x1

    :goto_3
    if-eqz v4, :cond_4

    .line 562
    invoke-virtual {v10}, Ll/ۙ֡ܿ;->ܽ()V

    return-void

    .line 557
    :cond_4
    :try_start_1
    invoke-virtual {v11}, Ll/ۛۢܳ;->ܳ()V

    .line 558
    invoke-virtual {v1}, Ll/᩷۫ܳ;->᩷()V

    .line 559
    iget-object v4, p0, Ll/᩷ۡ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ll/ۛۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 562
    :cond_5
    invoke-virtual {v10}, Ll/ۙ֡ܿ;->ܽ()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v10}, Ll/ۙ֡ܿ;->ܽ()V

    .line 563
    throw v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 585
    iget-object v0, p0, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {v0}, Ll/֫۬ܿ;->ۧ()V

    .line 586
    iget-object v0, p0, Ll/᩷ۡ᩻;->᩻:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩷ۡ᩻;->ۖ:Ll/ܽۢܳ;

    invoke-virtual {v1, v0}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 587
    invoke-virtual {v1}, Ll/ܽۢܳ;->ۖ֫()V

    .line 588
    iget-object v0, p0, Ll/᩷ۡ᩻;->ܺ:Ll/ۗۢ᩻;

    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    return-void
.end method
