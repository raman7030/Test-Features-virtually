.class public final Ll/֫ܶ;
.super Ll/۠ܶ;
.source "H1AQ"


# instance fields
.field public ۡ:I

.field public ܺ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ܶ۠;I)V
    .locals 4

    .line 36
    invoke-direct {p0, p1}, Ll/۠ܶ;-><init>(Ll/ܶ۠;)V

    .line 32
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    .line 37
    iput p2, p0, Ll/۠ܶ;->ܳ:I

    .line 77
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 78
    invoke-virtual {v0, p2}, Ll/ܶ۠;->ᩳ(I)Ll/ܶ۠;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_0

    .line 81
    iget v0, p0, Ll/۠ܶ;->ܳ:I

    invoke-virtual {p2, v0}, Ll/ܶ۠;->ᩳ(I)Ll/ܶ۠;

    move-result-object v0

    move-object v3, v0

    move-object v0, p2

    move-object p2, v3

    goto :goto_0

    .line 83
    :cond_0
    iput-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 84
    iget p2, p0, Ll/۠ܶ;->ܳ:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p2, :cond_1

    .line 77
    iget-object p2, v0, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    goto :goto_1

    :cond_1
    if-ne p2, v2, :cond_2

    .line 79
    iget-object p2, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    goto :goto_1

    :cond_2
    move-object p2, v1

    .line 84
    :goto_1
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    iget p2, p0, Ll/۠ܶ;->ܳ:I

    invoke-virtual {v0, p2}, Ll/ܶ۠;->ܽ(I)Ll/ܶ۠;

    move-result-object p2

    :goto_2
    if-eqz p2, :cond_5

    .line 88
    iget v0, p0, Ll/۠ܶ;->ܳ:I

    if-nez v0, :cond_3

    .line 77
    iget-object v0, p2, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    goto :goto_3

    :cond_3
    if-ne v0, v2, :cond_4

    .line 79
    iget-object v0, p2, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    goto :goto_3

    :cond_4
    move-object v0, v1

    .line 88
    :goto_3
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    iget v0, p0, Ll/۠ܶ;->ܳ:I

    invoke-virtual {p2, v0}, Ll/ܶ۠;->ܽ(I)Ll/ܶ۠;

    move-result-object p2

    goto :goto_2

    .line 91
    :cond_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܶ;

    .line 92
    iget v1, p0, Ll/۠ܶ;->ܳ:I

    if-nez v1, :cond_7

    .line 93
    iget-object v0, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iput-object p0, v0, Ll/ܶ۠;->ۧ:Ll/֫ܶ;

    goto :goto_4

    :cond_7
    if-ne v1, v2, :cond_6

    .line 95
    iget-object v0, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iput-object p0, v0, Ll/ܶ۠;->ۤ֫:Ll/֫ܶ;

    goto :goto_4

    .line 98
    :cond_8
    iget p2, p0, Ll/۠ܶ;->ܳ:I

    if-nez p2, :cond_9

    iget-object p2, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 620
    iget-object p2, p2, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 98
    check-cast p2, Ll/᩸۠;

    invoke-virtual {p2}, Ll/᩸۠;->ܺ֫()Z

    move-result p2

    if-eqz p2, :cond_9

    .line 99
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-le p2, v2, :cond_9

    .line 0
    invoke-static {p1, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p1

    .line 100
    check-cast p1, Ll/۠ܶ;

    iget-object p1, p1, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iput-object p1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 102
    :cond_9
    iget p1, p0, Ll/۠ܶ;->ܳ:I

    if-nez p1, :cond_a

    iget-object p1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {p1}, Ll/ܶ۠;->ۢ()I

    move-result p1

    goto :goto_5

    :cond_a
    iget-object p1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {p1}, Ll/ܶ۠;->֨()I

    move-result p1

    :goto_5
    iput p1, p0, Ll/֫ܶ;->ۡ:I

    return-void
.end method

.method private ۜ()Ll/ܶ۠;
    .locals 5

    .line 511
    iget-object v0, p0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    .line 512
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ܶ;

    .line 513
    iget-object v3, v2, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v3}, Ll/ܶ۠;->۠()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_0

    .line 514
    iget-object v0, v2, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private ᩻()Ll/ܶ۠;
    .locals 4

    const/4 v0, 0x0

    .line 501
    :goto_0
    iget-object v1, p0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 502
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܶ;

    .line 503
    iget-object v2, v1, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v2}, Ll/ܶ۠;->۠()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    .line 504
    iget-object v0, v1, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 43
    iget v0, p0, Ll/۠ܶ;->ܳ:I

    if-nez v0, :cond_0

    const-string v0, "horizontal : "

    goto :goto_0

    :cond_0
    const-string v0, "vertical : "

    :goto_0
    const-string v1, "ChainRun "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 44
    iget-object v1, p0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ܶ;

    const-string v3, "<"

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "> "

    .line 0
    invoke-static {v0, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public final ֫()V
    .locals 7

    .line 523
    iget-object v0, p0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ܶ;

    .line 524
    invoke-virtual {v2}, Ll/۠ܶ;->֫()V

    goto :goto_0

    .line 526
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ge v1, v2, :cond_1

    return-void

    :cond_1
    const/4 v3, 0x0

    .line 532
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ܶ;

    iget-object v4, v4, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    sub-int/2addr v1, v2

    .line 533
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܶ;

    iget-object v0, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 535
    iget v1, p0, Ll/۠ܶ;->ܳ:I

    iget-object v5, p0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v6, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    if-nez v1, :cond_5

    .line 536
    iget-object v1, v4, Ll/ܶ۠;->۫:Ll/ۚ۠;

    .line 537
    iget-object v0, v0, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    .line 538
    invoke-static {v1, v3}, Ll/۠ܶ;->֫(Ll/ۚ۠;I)Ll/ܿܶ;

    move-result-object v2

    .line 539
    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    .line 540
    invoke-direct {p0}, Ll/֫ܶ;->᩻()Ll/ܶ۠;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 542
    iget-object v1, v4, Ll/ܶ۠;->۫:Ll/ۚ۠;

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    :cond_2
    if-eqz v2, :cond_3

    .line 545
    invoke-static {v6, v2, v1}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 547
    :cond_3
    invoke-static {v0, v3}, Ll/۠ܶ;->֫(Ll/ۚ۠;I)Ll/ܿܶ;

    move-result-object v1

    .line 548
    invoke-virtual {v0}, Ll/ۚ۠;->ܽ()I

    move-result v0

    .line 549
    invoke-direct {p0}, Ll/֫ܶ;->ۜ()Ll/ܶ۠;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 551
    iget-object v0, v2, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    invoke-virtual {v0}, Ll/ۚ۠;->ܽ()I

    move-result v0

    :cond_4
    if-eqz v1, :cond_9

    neg-int v0, v0

    .line 554
    invoke-static {v5, v1, v0}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    goto :goto_1

    .line 557
    :cond_5
    iget-object v1, v4, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    .line 558
    iget-object v0, v0, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    .line 559
    invoke-static {v1, v2}, Ll/۠ܶ;->֫(Ll/ۚ۠;I)Ll/ܿܶ;

    move-result-object v3

    .line 560
    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    .line 561
    invoke-direct {p0}, Ll/֫ܶ;->᩻()Ll/ܶ۠;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 563
    iget-object v1, v4, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    :cond_6
    if-eqz v3, :cond_7

    .line 566
    invoke-static {v6, v3, v1}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 568
    :cond_7
    invoke-static {v0, v2}, Ll/۠ܶ;->֫(Ll/ۚ۠;I)Ll/ܿܶ;

    move-result-object v1

    .line 569
    invoke-virtual {v0}, Ll/ۚ۠;->ܽ()I

    move-result v0

    .line 570
    invoke-direct {p0}, Ll/֫ܶ;->ۜ()Ll/ܶ۠;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 572
    iget-object v0, v2, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    invoke-virtual {v0}, Ll/ۚ۠;->ܽ()I

    move-result v0

    :cond_8
    if-eqz v1, :cond_9

    neg-int v0, v0

    .line 575
    invoke-static {v5, v1, v0}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 578
    :cond_9
    :goto_1
    iput-object p0, v6, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    .line 579
    iput-object p0, v5, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    return-void
.end method

.method public final ֫(Ll/ۧܶ;)V
    .locals 23

    move-object/from16 v0, p0

    .line 122
    iget-object v1, v0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-boolean v2, v1, Ll/ܿܶ;->᩻:Z

    if-eqz v2, :cond_57

    iget-object v2, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-boolean v3, v2, Ll/ܿܶ;->᩻:Z

    if-nez v3, :cond_0

    goto/16 :goto_32

    .line 126
    :cond_0
    iget-object v3, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 620
    iget-object v3, v3, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v3, :cond_1

    .line 128
    instance-of v4, v3, Ll/᩸۠;

    if-eqz v4, :cond_1

    .line 129
    check-cast v3, Ll/᩸۠;

    invoke-virtual {v3}, Ll/᩸۠;->ܺ֫()Z

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 131
    :goto_0
    iget v4, v2, Ll/ܿܶ;->ܺ:I

    iget v5, v1, Ll/ܿܶ;->ܺ:I

    sub-int/2addr v4, v5

    .line 136
    iget-object v5, v0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    const/4 v8, -0x1

    const/16 v9, 0x8

    if-ge v7, v6, :cond_2

    .line 140
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۠ܶ;

    .line 141
    iget-object v10, v10, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v10}, Ll/ܶ۠;->۠()I

    move-result v10

    if-ne v10, v9, :cond_3

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, -0x1

    :cond_3
    add-int/lit8 v10, v6, -0x1

    move v11, v10

    :goto_2
    if-ltz v11, :cond_5

    .line 150
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۠ܶ;

    .line 151
    iget-object v12, v12, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v12}, Ll/ܶ۠;->۠()I

    move-result v12

    if-ne v12, v9, :cond_4

    add-int/lit8 v11, v11, -0x1

    goto :goto_2

    :cond_4
    move v8, v11

    :cond_5
    const/4 v11, 0x0

    :goto_3
    const/4 v12, 0x2

    if-ge v11, v12, :cond_14

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_4
    if-ge v14, v6, :cond_11

    .line 159
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v12, v18

    check-cast v12, Ll/۠ܶ;

    move-object/from16 v18, v5

    .line 160
    iget-object v5, v12, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v5}, Ll/ܶ۠;->۠()I

    move-result v5

    if-ne v5, v9, :cond_6

    move/from16 v20, v7

    const/4 v7, 0x0

    goto/16 :goto_a

    :cond_6
    add-int/lit8 v16, v16, 0x1

    if-lez v14, :cond_7

    if-lt v14, v7, :cond_7

    .line 165
    iget-object v5, v12, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget v5, v5, Ll/ܿܶ;->ܽ:I

    add-int/2addr v13, v5

    .line 167
    :cond_7
    iget-object v5, v12, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget v9, v5, Ll/ܿܶ;->ܺ:I

    move/from16 v19, v9

    .line 168
    iget-object v9, v12, Ll/۠ܶ;->ۧ:Ll/۠۠;

    move/from16 v20, v7

    sget-object v7, Ll/۠۠;->᩶:Ll/۠۠;

    if-eq v9, v7, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    if-eqz v7, :cond_b

    .line 170
    iget v5, v0, Ll/۠ܶ;->ܳ:I

    if-nez v5, :cond_9

    iget-object v9, v12, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v9, v9, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v9, v9, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-boolean v9, v9, Ll/ܿܶ;->᩻:Z

    if-nez v9, :cond_9

    goto/16 :goto_32

    :cond_9
    const/4 v9, 0x1

    if-ne v5, v9, :cond_a

    .line 173
    iget-object v5, v12, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v5, v5, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v5, v5, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-boolean v5, v5, Ll/ܿܶ;->᩻:Z

    if-nez v5, :cond_a

    goto/16 :goto_32

    :cond_a
    move/from16 v21, v7

    goto :goto_7

    :cond_b
    const/4 v9, 0x1

    move/from16 v21, v7

    .line 176
    iget v7, v12, Ll/۠ܶ;->ܿ:I

    if-ne v7, v9, :cond_c

    if-nez v11, :cond_c

    .line 178
    iget v9, v5, Ll/ܳܶ;->ۖ:I

    add-int/lit8 v15, v15, 0x1

    goto :goto_6

    .line 180
    :cond_c
    iget-boolean v5, v5, Ll/ܿܶ;->᩻:Z

    if-eqz v5, :cond_d

    move/from16 v9, v19

    :goto_6
    const/4 v7, 0x1

    goto :goto_8

    :cond_d
    :goto_7
    move/from16 v9, v19

    move/from16 v7, v21

    :goto_8
    if-nez v7, :cond_e

    add-int/lit8 v15, v15, 0x1

    .line 185
    iget-object v5, v12, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v5, v5, Ll/ܶ۠;->᩸֫:[F

    iget v7, v0, Ll/۠ܶ;->ܳ:I

    aget v5, v5, v7

    const/4 v7, 0x0

    cmpl-float v9, v5, v7

    if-ltz v9, :cond_f

    add-float v17, v17, v5

    goto :goto_9

    :cond_e
    const/4 v7, 0x0

    add-int/2addr v13, v9

    :cond_f
    :goto_9
    if-ge v14, v10, :cond_10

    if-ge v14, v8, :cond_10

    .line 193
    iget-object v5, v12, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget v5, v5, Ll/ܿܶ;->ܽ:I

    neg-int v5, v5

    add-int/2addr v13, v5

    :cond_10
    :goto_a
    add-int/lit8 v14, v14, 0x1

    const/16 v9, 0x8

    move-object/from16 v5, v18

    move/from16 v7, v20

    goto/16 :goto_4

    :cond_11
    move-object/from16 v18, v5

    move/from16 v20, v7

    const/4 v7, 0x0

    if-lt v13, v4, :cond_13

    if-nez v15, :cond_12

    goto :goto_b

    :cond_12
    add-int/lit8 v11, v11, 0x1

    const/16 v9, 0x8

    move-object/from16 v5, v18

    move/from16 v7, v20

    goto/16 :goto_3

    :cond_13
    :goto_b
    move/from16 v5, v16

    const/4 v12, 0x0

    goto :goto_c

    :cond_14
    move-object/from16 v18, v5

    move/from16 v20, v7

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v5, 0x0

    .line 206
    :goto_c
    iget v1, v1, Ll/ܿܶ;->ܺ:I

    if-eqz v3, :cond_15

    .line 208
    iget v1, v2, Ll/ܿܶ;->ܺ:I

    :cond_15
    const/high16 v2, 0x3f000000    # 0.5f

    if-le v13, v4, :cond_17

    const/high16 v7, 0x40000000    # 2.0f

    sub-int v9, v13, v4

    int-to-float v9, v9

    div-float/2addr v9, v7

    add-float/2addr v9, v2

    float-to-int v7, v9

    if-eqz v3, :cond_16

    add-int/2addr v1, v7

    goto :goto_d

    :cond_16
    sub-int/2addr v1, v7

    :cond_17
    :goto_d
    if-lez v15, :cond_27

    sub-int v7, v4, v13

    int-to-float v7, v7

    int-to-float v9, v15

    div-float v9, v7, v9

    add-float/2addr v9, v2

    float-to-int v2, v9

    const/4 v9, 0x0

    const/4 v11, 0x0

    :goto_e
    if-ge v9, v6, :cond_21

    move-object/from16 v14, v18

    .line 223
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    const/high16 v18, 0x3f000000    # 0.5f

    move/from16 v19, v2

    move-object/from16 v2, v16

    check-cast v2, Ll/۠ܶ;

    move/from16 v16, v13

    .line 224
    iget-object v13, v2, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    move/from16 p1, v1

    iget-object v1, v2, Ll/۠ܶ;->֫:Ll/ܳܶ;

    invoke-virtual {v13}, Ll/ܶ۠;->۠()I

    move-result v13

    move/from16 v21, v3

    const/16 v3, 0x8

    if-ne v13, v3, :cond_19

    :cond_18
    move/from16 v18, v7

    move/from16 v22, v12

    goto/16 :goto_13

    .line 227
    :cond_19
    iget-object v3, v2, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v13, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v3, v13, :cond_18

    iget-boolean v3, v1, Ll/ܿܶ;->᩻:Z

    if-nez v3, :cond_18

    cmpl-float v3, v17, v12

    if-lez v3, :cond_1a

    .line 230
    iget-object v3, v2, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v3, v3, Ll/ܶ۠;->᩸֫:[F

    iget v13, v0, Ll/۠ܶ;->ܳ:I

    aget v3, v3, v13

    mul-float v3, v3, v7

    div-float v3, v3, v17

    add-float v3, v3, v18

    float-to-int v3, v3

    goto :goto_f

    :cond_1a
    move/from16 v3, v19

    .line 233
    :goto_f
    iget v13, v0, Ll/۠ܶ;->ܳ:I

    if-nez v13, :cond_1d

    .line 234
    iget-object v13, v2, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    move/from16 v18, v7

    iget v7, v13, Ll/ܶ۠;->֫֫:I

    .line 235
    iget v13, v13, Ll/ܶ۠;->ܽ֫:I

    .line 237
    iget v2, v2, Ll/۠ܶ;->ܿ:I

    move/from16 v22, v12

    const/4 v12, 0x1

    if-ne v2, v12, :cond_1b

    .line 238
    iget v2, v1, Ll/ܳܶ;->ۖ:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_10

    :cond_1b
    move v2, v3

    .line 240
    :goto_10
    invoke-static {v13, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v7, :cond_1c

    .line 242
    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_1c
    if-eq v2, v3, :cond_20

    goto :goto_12

    :cond_1d
    move/from16 v18, v7

    move/from16 v22, v12

    .line 249
    iget-object v7, v2, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v12, v7, Ll/ܶ۠;->۟:I

    .line 250
    iget v7, v7, Ll/ܶ۠;->ۧ֫:I

    .line 252
    iget v2, v2, Ll/۠ܶ;->ܿ:I

    const/4 v13, 0x1

    if-ne v2, v13, :cond_1e

    .line 253
    iget v2, v1, Ll/ܳܶ;->ۖ:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_11

    :cond_1e
    move v2, v3

    .line 255
    :goto_11
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v12, :cond_1f

    .line 257
    invoke-static {v12, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_1f
    if-eq v2, v3, :cond_20

    :goto_12
    move v3, v2

    add-int/lit8 v11, v11, 0x1

    .line 265
    :cond_20
    invoke-virtual {v1, v3}, Ll/ܳܶ;->֫(I)V

    :goto_13
    add-int/lit8 v9, v9, 0x1

    move/from16 v1, p1

    move/from16 v13, v16

    move/from16 v7, v18

    move/from16 v2, v19

    move/from16 v3, v21

    move/from16 v12, v22

    move-object/from16 v18, v14

    goto/16 :goto_e

    :cond_21
    move/from16 p1, v1

    move/from16 v21, v3

    move/from16 v16, v13

    move-object/from16 v14, v18

    const/high16 v1, 0x3f000000    # 0.5f

    if-lez v11, :cond_26

    sub-int/2addr v15, v11

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_14
    if-ge v2, v6, :cond_25

    .line 273
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠ܶ;

    .line 274
    iget-object v9, v7, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v9}, Ll/ܶ۠;->۠()I

    move-result v9

    const/16 v12, 0x8

    if-ne v9, v12, :cond_22

    move/from16 v9, v20

    goto :goto_15

    :cond_22
    move/from16 v9, v20

    if-lez v2, :cond_23

    if-lt v2, v9, :cond_23

    .line 278
    iget-object v12, v7, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget v12, v12, Ll/ܿܶ;->ܽ:I

    add-int/2addr v3, v12

    .line 280
    :cond_23
    iget-object v12, v7, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget v12, v12, Ll/ܿܶ;->ܺ:I

    add-int/2addr v3, v12

    if-ge v2, v10, :cond_24

    if-ge v2, v8, :cond_24

    .line 282
    iget-object v7, v7, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget v7, v7, Ll/ܿܶ;->ܽ:I

    neg-int v7, v7

    add-int/2addr v3, v7

    :cond_24
    :goto_15
    add-int/lit8 v2, v2, 0x1

    move/from16 v20, v9

    goto :goto_14

    :cond_25
    move/from16 v9, v20

    move v13, v3

    goto :goto_16

    :cond_26
    move/from16 v9, v20

    move/from16 v13, v16

    .line 286
    :goto_16
    iget v2, v0, Ll/֫ܶ;->ۡ:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_28

    if-nez v11, :cond_28

    const/4 v2, 0x0

    .line 287
    iput v2, v0, Ll/֫ܶ;->ۡ:I

    goto :goto_17

    :cond_27
    move/from16 p1, v1

    move/from16 v21, v3

    move/from16 v16, v13

    move-object/from16 v14, v18

    move/from16 v9, v20

    const/4 v3, 0x2

    const/high16 v1, 0x3f000000    # 0.5f

    :cond_28
    :goto_17
    if-le v13, v4, :cond_29

    .line 292
    iput v3, v0, Ll/֫ܶ;->ۡ:I

    :cond_29
    if-lez v5, :cond_2a

    if-nez v15, :cond_2a

    if-ne v9, v8, :cond_2a

    .line 297
    iput v3, v0, Ll/֫ܶ;->ۡ:I

    .line 300
    :cond_2a
    iget v2, v0, Ll/֫ܶ;->ۡ:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3a

    if-le v5, v3, :cond_2b

    sub-int/2addr v4, v13

    sub-int/2addr v5, v3

    .line 303
    div-int/2addr v4, v5

    goto :goto_18

    :cond_2b
    if-ne v5, v3, :cond_2c

    sub-int/2addr v4, v13

    .line 305
    div-int/lit8 v4, v4, 0x2

    goto :goto_18

    :cond_2c
    const/4 v4, 0x0

    :goto_18
    if-lez v15, :cond_2d

    const/4 v4, 0x0

    :cond_2d
    const/4 v1, 0x0

    move/from16 v2, p1

    :goto_19
    if-ge v1, v6, :cond_57

    if-eqz v21, :cond_2e

    add-int/lit8 v3, v1, 0x1

    sub-int v3, v6, v3

    goto :goto_1a

    :cond_2e
    move v3, v1

    .line 315
    :goto_1a
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܶ;

    .line 316
    iget-object v5, v3, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v7, v3, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v11, v3, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-virtual {v5}, Ll/ܶ۠;->۠()I

    move-result v5

    const/16 v12, 0x8

    if-ne v5, v12, :cond_2f

    .line 317
    invoke-virtual {v11, v2}, Ll/ܿܶ;->֫(I)V

    .line 318
    invoke-virtual {v7, v2}, Ll/ܿܶ;->֫(I)V

    goto :goto_20

    :cond_2f
    if-lez v1, :cond_31

    if-eqz v21, :cond_30

    sub-int/2addr v2, v4

    goto :goto_1b

    :cond_30
    add-int/2addr v2, v4

    :cond_31
    :goto_1b
    if-lez v1, :cond_33

    if-lt v1, v9, :cond_33

    if-eqz v21, :cond_32

    .line 330
    iget v5, v11, Ll/ܿܶ;->ܽ:I

    sub-int/2addr v2, v5

    goto :goto_1c

    .line 332
    :cond_32
    iget v5, v11, Ll/ܿܶ;->ܽ:I

    add-int/2addr v2, v5

    :cond_33
    :goto_1c
    if-eqz v21, :cond_34

    .line 337
    invoke-virtual {v7, v2}, Ll/ܿܶ;->֫(I)V

    goto :goto_1d

    .line 339
    :cond_34
    invoke-virtual {v11, v2}, Ll/ܿܶ;->֫(I)V

    .line 342
    :goto_1d
    iget-object v5, v3, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget v12, v5, Ll/ܿܶ;->ܺ:I

    .line 343
    iget-object v13, v3, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v15, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v13, v15, :cond_35

    iget v13, v3, Ll/۠ܶ;->ܿ:I

    const/4 v15, 0x1

    if-ne v13, v15, :cond_35

    .line 345
    iget v12, v5, Ll/ܳܶ;->ۖ:I

    :cond_35
    if-eqz v21, :cond_36

    sub-int/2addr v2, v12

    goto :goto_1e

    :cond_36
    add-int/2addr v2, v12

    :goto_1e
    if-eqz v21, :cond_37

    .line 354
    invoke-virtual {v11, v2}, Ll/ܿܶ;->֫(I)V

    goto :goto_1f

    .line 356
    :cond_37
    invoke-virtual {v7, v2}, Ll/ܿܶ;->֫(I)V

    :goto_1f
    const/4 v5, 0x1

    .line 358
    iput-boolean v5, v3, Ll/۠ܶ;->᩻:Z

    if-ge v1, v10, :cond_39

    if-ge v1, v8, :cond_39

    if-eqz v21, :cond_38

    .line 361
    iget v3, v7, Ll/ܿܶ;->ܽ:I

    neg-int v3, v3

    sub-int/2addr v2, v3

    goto :goto_20

    .line 363
    :cond_38
    iget v3, v7, Ll/ܿܶ;->ܽ:I

    neg-int v3, v3

    add-int/2addr v2, v3

    :cond_39
    :goto_20
    add-int/lit8 v1, v1, 0x1

    goto :goto_19

    :cond_3a
    if-nez v2, :cond_47

    sub-int/2addr v4, v13

    add-int/lit8 v5, v5, 0x1

    .line 368
    div-int/2addr v4, v5

    if-lez v15, :cond_3b

    const/4 v4, 0x0

    :cond_3b
    const/4 v1, 0x0

    move/from16 v2, p1

    :goto_21
    if-ge v1, v6, :cond_57

    if-eqz v21, :cond_3c

    add-int/lit8 v3, v1, 0x1

    sub-int v3, v6, v3

    goto :goto_22

    :cond_3c
    move v3, v1

    .line 377
    :goto_22
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܶ;

    .line 378
    iget-object v5, v3, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v7, v3, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v11, v3, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-virtual {v5}, Ll/ܶ۠;->۠()I

    move-result v5

    const/16 v12, 0x8

    if-ne v5, v12, :cond_3d

    .line 379
    invoke-virtual {v11, v2}, Ll/ܿܶ;->֫(I)V

    .line 380
    invoke-virtual {v7, v2}, Ll/ܿܶ;->֫(I)V

    goto :goto_28

    :cond_3d
    if-eqz v21, :cond_3e

    sub-int/2addr v2, v4

    goto :goto_23

    :cond_3e
    add-int/2addr v2, v4

    :goto_23
    if-lez v1, :cond_40

    if-lt v1, v9, :cond_40

    if-eqz v21, :cond_3f

    .line 390
    iget v5, v11, Ll/ܿܶ;->ܽ:I

    sub-int/2addr v2, v5

    goto :goto_24

    .line 392
    :cond_3f
    iget v5, v11, Ll/ܿܶ;->ܽ:I

    add-int/2addr v2, v5

    :cond_40
    :goto_24
    if-eqz v21, :cond_41

    .line 397
    invoke-virtual {v7, v2}, Ll/ܿܶ;->֫(I)V

    goto :goto_25

    .line 399
    :cond_41
    invoke-virtual {v11, v2}, Ll/ܿܶ;->֫(I)V

    .line 402
    :goto_25
    iget-object v5, v3, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget v12, v5, Ll/ܿܶ;->ܺ:I

    .line 403
    iget-object v13, v3, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v15, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v13, v15, :cond_42

    iget v3, v3, Ll/۠ܶ;->ܿ:I

    const/4 v13, 0x1

    if-ne v3, v13, :cond_42

    .line 405
    iget v3, v5, Ll/ܳܶ;->ۖ:I

    invoke-static {v12, v3}, Ljava/lang/Math;->min(II)I

    move-result v12

    :cond_42
    if-eqz v21, :cond_43

    sub-int/2addr v2, v12

    goto :goto_26

    :cond_43
    add-int/2addr v2, v12

    :goto_26
    if-eqz v21, :cond_44

    .line 415
    invoke-virtual {v11, v2}, Ll/ܿܶ;->֫(I)V

    goto :goto_27

    .line 417
    :cond_44
    invoke-virtual {v7, v2}, Ll/ܿܶ;->֫(I)V

    :goto_27
    if-ge v1, v10, :cond_46

    if-ge v1, v8, :cond_46

    if-eqz v21, :cond_45

    .line 421
    iget v3, v7, Ll/ܿܶ;->ܽ:I

    neg-int v3, v3

    sub-int/2addr v2, v3

    goto :goto_28

    .line 423
    :cond_45
    iget v3, v7, Ll/ܿܶ;->ܽ:I

    neg-int v3, v3

    add-int/2addr v2, v3

    :cond_46
    :goto_28
    add-int/lit8 v1, v1, 0x1

    goto :goto_21

    :cond_47
    const/4 v3, 0x2

    if-ne v2, v3, :cond_57

    .line 428
    iget v2, v0, Ll/۠ܶ;->ܳ:I

    if-nez v2, :cond_48

    iget-object v2, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v2}, Ll/ܶ۠;->᩷()F

    move-result v2

    goto :goto_29

    :cond_48
    iget-object v2, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 429
    invoke-virtual {v2}, Ll/ܶ۠;->ۚ()F

    move-result v2

    :goto_29
    if-eqz v21, :cond_49

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v2, v3, v2

    :cond_49
    sub-int/2addr v4, v13

    int-to-float v3, v4

    mul-float v3, v3, v2

    add-float/2addr v3, v1

    float-to-int v1, v3

    if-ltz v1, :cond_4a

    if-lez v15, :cond_4b

    :cond_4a
    const/4 v1, 0x0

    :cond_4b
    if-eqz v21, :cond_4c

    sub-int v1, p1, v1

    goto :goto_2a

    :cond_4c
    add-int v1, p1, v1

    :goto_2a
    const/4 v2, 0x0

    :goto_2b
    if-ge v2, v6, :cond_57

    if-eqz v21, :cond_4d

    add-int/lit8 v3, v2, 0x1

    sub-int v3, v6, v3

    goto :goto_2c

    :cond_4d
    move v3, v2

    .line 447
    :goto_2c
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܶ;

    .line 448
    iget-object v4, v3, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v5, v3, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v7, v3, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-virtual {v4}, Ll/ܶ۠;->۠()I

    move-result v4

    const/16 v11, 0x8

    if-ne v4, v11, :cond_4e

    .line 449
    invoke-virtual {v7, v1}, Ll/ܿܶ;->֫(I)V

    .line 450
    invoke-virtual {v5, v1}, Ll/ܿܶ;->֫(I)V

    goto :goto_31

    :cond_4e
    if-lez v2, :cond_50

    if-lt v2, v9, :cond_50

    if-eqz v21, :cond_4f

    .line 455
    iget v4, v7, Ll/ܿܶ;->ܽ:I

    sub-int/2addr v1, v4

    goto :goto_2d

    .line 457
    :cond_4f
    iget v4, v7, Ll/ܿܶ;->ܽ:I

    add-int/2addr v1, v4

    :cond_50
    :goto_2d
    if-eqz v21, :cond_51

    .line 461
    invoke-virtual {v5, v1}, Ll/ܿܶ;->֫(I)V

    goto :goto_2e

    .line 463
    :cond_51
    invoke-virtual {v7, v1}, Ll/ܿܶ;->֫(I)V

    .line 466
    :goto_2e
    iget-object v4, v3, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget v11, v4, Ll/ܿܶ;->ܺ:I

    .line 467
    iget-object v12, v3, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v13, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v12, v13, :cond_52

    iget v3, v3, Ll/۠ܶ;->ܿ:I

    const/4 v12, 0x1

    if-ne v3, v12, :cond_52

    .line 469
    iget v11, v4, Ll/ܳܶ;->ۖ:I

    :cond_52
    if-eqz v21, :cond_53

    sub-int/2addr v1, v11

    goto :goto_2f

    :cond_53
    add-int/2addr v1, v11

    :goto_2f
    if-eqz v21, :cond_54

    .line 478
    invoke-virtual {v7, v1}, Ll/ܿܶ;->֫(I)V

    goto :goto_30

    .line 480
    :cond_54
    invoke-virtual {v5, v1}, Ll/ܿܶ;->֫(I)V

    :goto_30
    if-ge v2, v10, :cond_56

    if-ge v2, v8, :cond_56

    if-eqz v21, :cond_55

    .line 484
    iget v3, v5, Ll/ܿܶ;->ܽ:I

    neg-int v3, v3

    sub-int/2addr v1, v3

    goto :goto_31

    .line 486
    :cond_55
    iget v3, v5, Ll/ܿܶ;->ܽ:I

    neg-int v3, v3

    add-int/2addr v1, v3

    :cond_56
    :goto_31
    add-int/lit8 v2, v2, 0x1

    goto :goto_2b

    :cond_57
    :goto_32
    return-void
.end method

.method public final ۧ()V
    .locals 3

    const/4 v0, 0x0

    .line 494
    :goto_0
    iget-object v1, p0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 495
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܶ;

    .line 496
    invoke-virtual {v1}, Ll/۠ܶ;->ۧ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ()Z
    .locals 5

    .line 54
    iget-object v0, p0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 56
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ܶ;

    .line 57
    invoke-virtual {v4}, Ll/۠ܶ;->ܳ()Z

    move-result v4

    if-nez v4, :cond_0

    return v2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()V
    .locals 2

    const/4 v0, 0x0

    .line 108
    iput-object v0, p0, Ll/۠ܶ;->ۜ:Ll/ۖܶ;

    .line 109
    iget-object v0, p0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܶ;

    .line 110
    invoke-virtual {v1}, Ll/۠ܶ;->ܽ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ()J
    .locals 8

    .line 65
    iget-object v0, p0, Ll/֫ܶ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 68
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܶ;

    .line 69
    iget-object v6, v5, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget v6, v6, Ll/ܿܶ;->ܽ:I

    int-to-long v6, v6

    add-long/2addr v2, v6

    .line 70
    invoke-virtual {v5}, Ll/۠ܶ;->ᩳ()J

    move-result-wide v6

    add-long/2addr v6, v2

    .line 71
    iget-object v2, v5, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget v2, v2, Ll/ܿܶ;->ܽ:I

    int-to-long v2, v2

    add-long/2addr v2, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method
