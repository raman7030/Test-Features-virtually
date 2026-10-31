.class public final Ll/ܶ۬ܳ;
.super Ll/᩷۫ܳ;
.source "D4TJ"


# static fields
.field public static final ֡:Ll/ᩴ۬ܳ;

.field public static final ᩵:Ll/ۖ۫᩷;


# instance fields
.field public ۖ:Ljava/lang/String;

.field public ۘ:Z

.field public ۜ:Z

.field public ۡ:Z

.field public ۢ:Z

.field public final ܳ:Ljava/util/ArrayList;

.field public final ܺ:Ljava/util/function/Predicate;

.field public final ܿ:Ll/᩸۬ܳ;

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:Ljava/util/ArrayList;

.field public final ᩻:Ll/᩵۬ܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 34
    new-instance v0, Ll/ۖ۫᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۖ۫᩷;-><init>(I)V

    sput-object v0, Ll/ܶ۬ܳ;->᩵:Ll/ۖ۫᩷;

    .line 1555
    new-instance v0, Ll/ᩴ۬ܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܶ۬ܳ;->֡:Ll/ᩴ۬ܳ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/᩸۬ܳ;ZZLl/᩵۬ܳ;Ljava/util/function/Predicate;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ll/᩷۫ܳ;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶ۬ܳ;->ܳ:Ljava/util/ArrayList;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶ۬ܳ;->᩷:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Ll/ܶ۬ܳ;->ۜ:Z

    .line 76
    iput-object p1, p0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    .line 77
    iput-object p2, p0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    .line 78
    iput-boolean p3, p0, Ll/ܶ۬ܳ;->ۡ:Z

    .line 79
    iput-boolean p4, p0, Ll/ܶ۬ܳ;->ۢ:Z

    .line 80
    iput-object p5, p0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    .line 81
    iput-object p6, p0, Ll/ܶ۬ܳ;->ܺ:Ljava/util/function/Predicate;

    return-void
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ll/ᩳۜܳ;Ljava/lang/String;)I
    .locals 7

    .line 391
    iget-object v0, p0, Ll/ܶ۬ܳ;->ܺ:Ljava/util/function/Predicate;

    invoke-interface {v0, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v6

    .line 392
    iget-object v0, p0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    invoke-interface {v0, v6}, Ll/᩸۬ܳ;->֫(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 393
    sget-object v4, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    const/4 v5, 0x0

    iget-object v1, p0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    move-object v2, p3

    move-object v3, v4

    invoke-interface/range {v1 .. v6}, Ll/᩸۬ܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I

    move-result p1

    return p1

    .line 396
    :cond_0
    invoke-static {p2}, Ll/᩹۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;

    move-result-object v3

    .line 397
    invoke-static {p1}, Ll/᩹۬ܳ;->֫(Ll/ܶ᩵ܿ;)Ll/᩹۬ܳ;

    move-result-object v4

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v5

    .line 396
    iget-object v1, p0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    move-object v2, p3

    invoke-interface/range {v1 .. v6}, Ll/᩸۬ܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I

    move-result p1

    return p1
.end method

.method public static ֫(Ljava/lang/String;Ll/ۗۢ᩻;Ll/᩸۬ܳ;Ll/᩵۬ܳ;)Ll/ܶ۬ܳ;
    .locals 8

    .line 63
    new-instance v7, Ll/ܶ۬ܳ;

    .line 64
    invoke-virtual {p1}, Ll/ۗۢ᩻;->᩹()Z

    move-result v3

    const/4 v4, 0x0

    sget-object v6, Ll/ܶ۬ܳ;->᩵:Ll/ۖ۫᩷;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Ll/ܶ۬ܳ;-><init>(Ljava/lang/String;Ll/᩸۬ܳ;ZZLl/᩵۬ܳ;Ljava/util/function/Predicate;)V

    const/4 p0, 0x1

    .line 106
    iput-boolean p0, v7, Ll/ܶ۬ܳ;->ۜ:Z

    return-object v7
.end method

.method public static ֫(Ljava/lang/String;Ll/ۙۤܳ;Ll/᩵۬ܳ;)Ll/ܶ۬ܳ;
    .locals 1

    .line 48
    sget-object v0, Ll/ܶ۬ܳ;->᩵:Ll/ۖ۫᩷;

    invoke-static {p0, p1, p2, v0}, Ll/ܶ۬ܳ;->֫(Ljava/lang/String;Ll/᩸۬ܳ;Ll/᩵۬ܳ;Ljava/util/function/Predicate;)Ll/ܶ۬ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ll/᩸۬ܳ;Ll/᩵۬ܳ;Ljava/util/function/Predicate;)Ll/ܶ۬ܳ;
    .locals 8

    .line 57
    invoke-static {p0}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 573
    invoke-static {p0}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 58
    :goto_1
    new-instance v0, Ll/ܶ۬ܳ;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, v5

    move-object v6, p2

    move-object v7, p3

    .line 59
    invoke-direct/range {v1 .. v7}, Ll/ܶ۬ܳ;-><init>(Ljava/lang/String;Ll/᩸۬ܳ;ZZLl/᩵۬ܳ;Ljava/util/function/Predicate;)V

    return-object v0
.end method

.method public static ֫(Ll/᩵۬ܳ;)Ll/ܶ۬ܳ;
    .locals 8

    .line 70
    new-instance v7, Ll/ܶ۬ܳ;

    const/4 v4, 0x1

    sget-object v6, Ll/ܶ۬ܳ;->᩵:Ll/ۖ۫᩷;

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v0, v7

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Ll/ܶ۬ܳ;-><init>(Ljava/lang/String;Ll/᩸۬ܳ;ZZLl/᩵۬ܳ;Ljava/util/function/Predicate;)V

    return-object v7
.end method

.method private ֫(Ljava/util/ArrayList;Ll/۠۬ܳ;)V
    .locals 6

    .line 1206
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 1207
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1208
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 1209
    move-object v1, p2

    check-cast v1, Ll/᩶ܿ᩻;

    iget-object v2, v1, Ll/᩶ܿ᩻;->֫:Ljava/lang/String;

    iget-object v3, v1, Ll/᩶ܿ᩻;->ۧ:Ll/᩵ۙ᩻;

    iget v1, v1, Ll/᩶ܿ᩻;->ܽ:I

    sget v4, Ll/۬ܿ᩻;->ۤ֫:I

    .line 158
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v4

    if-nez v4, :cond_5

    .line 0
    invoke-static {v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 159
    invoke-virtual {v0}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 160
    invoke-virtual {v3, v2}, Ll/᩵ۙ᩻;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    const/4 v3, 0x2

    if-ne v1, v3, :cond_2

    goto :goto_1

    .line 167
    :cond_2
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v3

    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v1

    cmp-long v5, v3, v1

    if-lez v5, :cond_3

    goto :goto_2

    .line 1210
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 1211
    iget v1, p0, Ll/᩷۫ܳ;->ܽ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/᩷۫ܳ;->ܽ:I

    .line 1212
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1213
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܶ۬ܳ;->ۧ(Ll/֡۬ܳ;)V

    goto :goto_0

    .line 1215
    :cond_4
    iget-wide v1, p0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-static {v0}, Ll/֨۬ܳ;->ۧ(Ll/֨۬ܳ;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷۫ܳ;->ᩳ:J

    goto :goto_0

    .line 1217
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1218
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-static {v0}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ܶ۬ܳ;->֫(Ljava/util/ArrayList;Ll/۠۬ܳ;)V

    goto :goto_0

    :cond_6
    return-void
.end method

.method private ֫(Ll/֡۬ܳ;)V
    .locals 12

    .line 529
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۜ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 530
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 413
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 531
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, p0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    if-eqz v3, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    .line 532
    invoke-interface {v4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_6

    .line 0
    :cond_0
    invoke-static {v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 535
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 536
    iget-object v6, p0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 537
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Ll/ܿ֡ܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    .line 540
    :cond_1
    invoke-virtual {p1}, Ll/֨۬ܳ;->֡()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    .line 543
    :goto_1
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v9

    if-eqz v9, :cond_3

    .line 544
    new-instance v9, Ll/֡۬ܳ;

    invoke-direct {v9}, Ll/֡۬ܳ;-><init>()V

    goto :goto_2

    .line 546
    :cond_3
    new-instance v9, Ll/ۚ۬ܳ;

    invoke-direct {v9}, Ll/ۚ۬ܳ;-><init>()V

    .line 547
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Ll/֨۬ܳ;->֫(J)V

    .line 549
    :goto_2
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Ll/֨۬ܳ;->ۧ(J)V

    .line 550
    iget-boolean v10, p0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v10, :cond_4

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v10

    if-eqz v10, :cond_4

    const/4 v8, 0x1

    :cond_4
    invoke-virtual {v9, v8}, Ll/֨۬ܳ;->֫(Z)V

    .line 551
    invoke-virtual {v9, v3}, Ll/֨۬ܳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 552
    invoke-virtual {v9, v6}, Ll/֨۬ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 553
    invoke-virtual {v9, v5}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 554
    invoke-virtual {v9, v7}, Ll/֨۬ܳ;->ܽ(Z)V

    .line 557
    invoke-virtual {p1}, Ll/֨۬ܳ;->֡()Z

    move-result v8

    if-eqz v8, :cond_6

    if-nez v7, :cond_6

    .line 558
    invoke-interface {v4, v5}, Ll/᩵۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 559
    invoke-virtual {v3, v6}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 561
    invoke-virtual {v9}, Ll/֨۬ܳ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 562
    invoke-virtual {v9}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v3

    invoke-virtual {v6, v3, v4}, Ll/ܶ᩵ܿ;->֫(J)Z

    .line 564
    :cond_5
    iget-object v3, p0, Ll/ܶ۬ܳ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    iget v3, p0, Ll/᩷۫ܳ;->ܽ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/᩷۫ܳ;->ܽ:I

    .line 566
    invoke-virtual {p0}, Ll/᩷۫ܳ;->᩷()V

    goto/16 :goto_0

    :cond_6
    if-eqz v7, :cond_a

    .line 571
    invoke-static {v9}, Ll/֨۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 572
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_3

    .line 1152
    :cond_7
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ۬ܳ;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 575
    :cond_8
    invoke-virtual {v9}, Ll/֨۬ܳ;->ۘ()Z

    move-result v8

    if-eqz v8, :cond_9

    .line 576
    invoke-static {v6}, Ll/ܶ۬ܳ;->֫(Ll/ܶ᩵ܿ;)V

    goto :goto_3

    .line 578
    :cond_9
    invoke-static {v6}, Ll/ܶ۬ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 581
    :cond_a
    :goto_3
    invoke-static {v9}, Ll/֨۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v8

    if-nez v8, :cond_b

    invoke-virtual {v9}, Ll/֨۬ܳ;->ۘ()Z

    move-result v8

    if-nez v8, :cond_13

    .line 582
    :cond_b
    invoke-virtual {v9}, Ll/֨۬ܳ;->ۧ()Ll/ۚ۬ܳ;

    move-result-object v8

    if-eqz v7, :cond_12

    .line 584
    invoke-virtual {p1}, Ll/֨۬ܳ;->֡()Z

    move-result v7

    if-eqz v7, :cond_c

    .line 585
    invoke-virtual {v8}, Ll/֨۬ܳ;->᩹()V

    .line 587
    :cond_c
    iget-object v7, p0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    invoke-interface {v7}, Ll/᩸۬ܳ;->᩵()Z

    move-result v10

    if-eqz v10, :cond_d

    .line 588
    invoke-static {v3}, Ll/᩹۬ܳ;->֫(Ll/ܶ᩵ܿ;)Ll/᩹۬ܳ;

    move-result-object v3

    invoke-static {v6}, Ll/᩹۬ܳ;->֫(Ll/ܶ᩵ܿ;)Ll/᩹۬ܳ;

    move-result-object v10

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v11

    invoke-interface {v7, v5, v3, v10, v11}, Ll/᩸۬ܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    .line 590
    :cond_d
    invoke-interface {v7}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3

    if-eqz v3, :cond_e

    .line 591
    invoke-interface {v4}, Ll/᩵۬ܳ;->֫()V

    return-void

    .line 594
    :cond_e
    invoke-interface {v7}, Ll/᩸۬ܳ;->۬()I

    move-result v3

    if-ne v3, v2, :cond_f

    .line 595
    invoke-static {p1}, Ll/֡۬ܳ;->ۧ(Ll/֡۬ܳ;)V

    goto/16 :goto_0

    .line 598
    :cond_f
    invoke-interface {v7}, Ll/᩸۬ܳ;->۬()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_10

    .line 599
    invoke-virtual {v8}, Ll/֨۬ܳ;->᩸()V

    goto :goto_4

    .line 600
    :cond_10
    invoke-static {v9}, Ll/֨۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v3

    if-nez v3, :cond_11

    .line 601
    new-instance v3, Ll/ܿ᩵ܿ;

    invoke-direct {v3}, Ll/ܿ᩵ܿ;-><init>()V

    .line 602
    invoke-virtual {v3, v6}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 603
    invoke-virtual {v3}, Ll/ܿ᩵ܿ;->ۧ()Ll/ᩳ᩵ܿ;

    move-result-object v3

    invoke-virtual {v8, v3}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 605
    :cond_11
    :goto_4
    invoke-interface {v7}, Ll/᩸۬ܳ;->۬()I

    move-result v3

    if-nez v3, :cond_12

    invoke-interface {v7}, Ll/᩸۬ܳ;->ܶ()Z

    move-result v3

    if-eqz v3, :cond_12

    .line 606
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v3

    if-eqz v3, :cond_12

    .line 607
    invoke-virtual {v8, v2}, Ll/֨۬ܳ;->ۧ(Z)V

    .line 611
    :cond_12
    invoke-static {v9}, Ll/֨۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v3

    if-nez v3, :cond_13

    .line 612
    iget-wide v3, p0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-static {v9}, Ll/֨۬ܳ;->ۧ(Ll/֨۬ܳ;)J

    move-result-wide v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/᩷۫ܳ;->ᩳ:J

    .line 615
    :cond_13
    invoke-static {p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 616
    iget v3, p0, Ll/᩷۫ܳ;->ܽ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/᩷۫ܳ;->ܽ:I

    goto/16 :goto_0

    .line 618
    :cond_14
    invoke-interface {v4}, Ll/᩵۬ܳ;->۟()V

    .line 619
    invoke-static {p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_15
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 620
    invoke-interface {v4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_6

    .line 623
    :cond_16
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-virtual {v0}, Ll/֨۬ܳ;->᩵()Z

    move-result v1

    if-nez v1, :cond_15

    .line 624
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;)V

    goto :goto_5

    :cond_17
    :goto_6
    return-void
.end method

.method private ֫(Ll/֡۬ܳ;Ll/ۗۢ᩻;Ll/᩹ۡ᩻;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 937
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 938
    invoke-virtual/range {p1 .. p1}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    .line 199
    invoke-virtual {v1, v4, v5}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v4

    .line 938
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    iget-object v7, v0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    if-eqz v6, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 939
    invoke-interface {v7}, Ll/ܿۖ᩷;->᩻()Z

    move-result v8

    if-eqz v8, :cond_0

    goto/16 :goto_6

    .line 0
    :cond_0
    invoke-static {v3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 942
    invoke-interface {v6}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 943
    iget-object v9, v0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    invoke-static {v9, v8}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 944
    invoke-virtual/range {p1 .. p1}, Ll/֨۬ܳ;->֡()Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_1

    invoke-virtual {v1, v9}, Ll/ۗۢ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    .line 946
    :goto_1
    invoke-interface {v6}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 947
    invoke-interface {v2, v8}, Ll/֨ۡ᩻;->setName(Ljava/lang/String;)V

    .line 948
    new-instance v7, Ll/֡۬ܳ;

    invoke-direct {v7}, Ll/֡۬ܳ;-><init>()V

    if-eqz v10, :cond_8

    .line 950
    invoke-static {v1, v9}, Ll/ܶ۬ܳ;->֫(Ll/ۗۢ᩻;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 953
    :cond_2
    new-instance v12, Ll/ۚ۬ܳ;

    invoke-direct {v12}, Ll/ۚ۬ܳ;-><init>()V

    if-eqz v10, :cond_7

    .line 955
    invoke-static {v1, v9}, Ll/ܶ۬ܳ;->ۧ(Ll/ۗۢ᩻;Ljava/lang/String;)V

    .line 956
    iget-object v13, v0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    invoke-interface {v13}, Ll/᩸۬ܳ;->᩵()Z

    move-result v14

    if-eqz v14, :cond_3

    .line 957
    invoke-static {v6}, Ll/᩹۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;

    move-result-object v14

    .line 1251
    :try_start_0
    invoke-virtual {v1, v9}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v15

    invoke-static {v15}, Ll/᩹۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;

    move-result-object v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 1253
    :catch_0
    sget-object v15, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    .line 957
    :goto_2
    invoke-interface {v13, v8, v14, v15, v11}, Ll/᩸۬ܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    .line 959
    :cond_3
    invoke-interface {v13}, Ll/ܿۖ᩷;->᩻()Z

    move-result v14

    if-eqz v14, :cond_4

    .line 960
    invoke-interface {v7}, Ll/᩵۬ܳ;->֫()V

    return-void

    .line 963
    :cond_4
    invoke-interface {v13}, Ll/᩸۬ܳ;->۬()I

    move-result v7

    if-ne v7, v5, :cond_5

    .line 964
    invoke-static/range {p1 .. p1}, Ll/֡۬ܳ;->ۧ(Ll/֡۬ܳ;)V

    goto/16 :goto_0

    .line 967
    :cond_5
    invoke-interface {v13}, Ll/᩸۬ܳ;->۬()I

    move-result v7

    const/4 v13, 0x2

    if-ne v7, v13, :cond_6

    .line 968
    invoke-virtual {v12}, Ll/֨۬ܳ;->᩸()V

    goto :goto_3

    .line 969
    :cond_6
    iget-boolean v7, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v7, :cond_7

    .line 970
    invoke-virtual {v1, v9}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v7

    invoke-interface {v7}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v7

    if-eqz v7, :cond_7

    .line 972
    new-instance v13, Ll/ᩳ᩵ܿ;

    invoke-virtual {v7}, Ll/ܽۜܳ;->᩻()I

    move-result v7

    const/4 v14, -0x1

    invoke-direct {v13, v7, v14, v14}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v12, v13}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 976
    :cond_7
    :goto_3
    invoke-interface {v6}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v13

    invoke-virtual {v12, v13, v14}, Ll/֨۬ܳ;->֫(J)V

    .line 977
    iget-wide v13, v0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-virtual {v12}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v15

    add-long/2addr v13, v15

    iput-wide v13, v0, Ll/᩷۫ܳ;->ᩳ:J

    move-object v7, v12

    .line 979
    :cond_8
    :goto_4
    invoke-interface {v6}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v12

    invoke-virtual {v7, v12, v13}, Ll/֨۬ܳ;->ۧ(J)V

    .line 980
    iget-boolean v12, v0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v12, :cond_9

    invoke-interface {v6}, Ll/ᩳۜܳ;->۬()Z

    move-result v12

    if-eqz v12, :cond_9

    const/4 v11, 0x1

    :cond_9
    invoke-virtual {v7, v11}, Ll/֨۬ܳ;->֫(Z)V

    .line 981
    invoke-virtual {v7}, Ll/֨۬ܳ;->᩵()Z

    move-result v11

    if-eqz v11, :cond_a

    .line 982
    invoke-interface {v6}, Ll/ᩳۜܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ll/֨۬ܳ;->֫(Ljava/lang/String;)V

    .line 984
    :cond_a
    iget-boolean v11, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v11, :cond_c

    invoke-virtual {v7}, Ll/֨۬ܳ;->ܿ()Ll/ᩳ᩵ܿ;

    move-result-object v11

    if-nez v11, :cond_c

    .line 985
    invoke-interface {v6}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v11

    if-eqz v11, :cond_c

    .line 987
    invoke-virtual {v11}, Ll/ܽۜܳ;->᩻()I

    move-result v12

    .line 988
    instance-of v13, v6, Ll/ۢۧ᩻;

    if-eqz v13, :cond_b

    .line 989
    invoke-static {v11}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v11

    if-eqz v11, :cond_b

    .line 990
    invoke-interface {v6}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v11

    if-nez v11, :cond_b

    .line 992
    :try_start_1
    invoke-interface {v6}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v11

    .line 993
    invoke-virtual {v11}, Ll/ܿ᩹ܿ;->᩻()I

    move-result v12
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1000
    :catch_1
    :cond_b
    new-instance v11, Ll/ᩳ᩵ܿ;

    const/4 v13, -0x1

    invoke-direct {v11, v12, v13, v13}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v7, v11}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 1003
    :cond_c
    invoke-interface {v6}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ll/֨۬ܳ;->ܽ(Ljava/lang/String;)V

    .line 1004
    invoke-virtual {v7, v9}, Ll/֨۬ܳ;->ܿ(Ljava/lang/String;)V

    .line 1005
    invoke-virtual {v7, v8}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 1006
    invoke-virtual {v7, v10}, Ll/֨۬ܳ;->ܽ(Z)V

    .line 1007
    invoke-static/range {p1 .. p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1008
    iget v6, v0, Ll/᩷۫ܳ;->ܽ:I

    add-int/2addr v6, v5

    iput v6, v0, Ll/᩷۫ܳ;->ܽ:I

    goto/16 :goto_0

    .line 1010
    :cond_d
    invoke-interface {v7}, Ll/᩵۬ܳ;->۟()V

    .line 1011
    invoke-static/range {p1 .. p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_e
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֨۬ܳ;

    .line 1012
    invoke-interface {v7}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5

    if-eqz v5, :cond_f

    goto :goto_6

    .line 1015
    :cond_f
    invoke-virtual {v4}, Ll/֨۬ܳ;->ۘ()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-virtual {v4}, Ll/֨۬ܳ;->᩵()Z

    move-result v5

    if-eqz v5, :cond_10

    iget-boolean v5, v0, Ll/ܶ۬ܳ;->ۜ:Z

    if-eqz v5, :cond_e

    .line 1016
    :cond_10
    invoke-virtual {v4}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v4

    invoke-direct {v0, v4, v1, v2}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;Ll/ۗۢ᩻;Ll/᩹ۡ᩻;)V

    goto :goto_5

    :cond_11
    :goto_6
    return-void
.end method

.method private ֫(Ll/֡۬ܳ;Ll/ܰܺܳ;)V
    .locals 11

    .line 1090
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1091
    invoke-virtual {p1}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 199
    invoke-virtual {p2, v1, v2}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v1

    .line 1091
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, p0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 1092
    invoke-interface {v4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_5

    .line 1095
    :cond_0
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    .line 0
    invoke-static {v0, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1098
    invoke-interface {v3}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 1099
    new-instance v5, Ll/֡۬ܳ;

    invoke-direct {v5}, Ll/֡۬ܳ;-><init>()V

    goto :goto_1

    .line 1101
    :cond_1
    new-instance v5, Ll/ۚ۬ܳ;

    invoke-direct {v5}, Ll/ۚ۬ܳ;-><init>()V

    .line 1102
    invoke-interface {v3}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ll/֨۬ܳ;->֫(J)V

    .line 1103
    iget-wide v6, p0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-virtual {v5}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v8

    add-long/2addr v8, v6

    iput-wide v8, p0, Ll/᩷۫ܳ;->ᩳ:J

    .line 1105
    :goto_1
    invoke-interface {v3}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ll/֨۬ܳ;->ۧ(J)V

    .line 1106
    iget-boolean v6, p0, Ll/ܶ۬ܳ;->ۢ:Z

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ll/ᩳۜܳ;->۬()Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v5, v6}, Ll/֨۬ܳ;->֫(Z)V

    .line 1107
    invoke-virtual {v5}, Ll/֨۬ܳ;->᩵()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 1108
    invoke-interface {v3}, Ll/ᩳۜܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/֨۬ܳ;->֫(Ljava/lang/String;)V

    .line 1110
    :cond_3
    iget-boolean v6, p0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v6, :cond_6

    .line 1111
    invoke-interface {v3}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 1113
    instance-of v8, v3, Ll/ۢۧ᩻;

    if-eqz v8, :cond_5

    .line 1114
    invoke-static {v6}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 1115
    invoke-interface {v3}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v6

    if-nez v6, :cond_6

    .line 1117
    :try_start_0
    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v6

    .line 1118
    new-instance v8, Ll/ᩳ᩵ܿ;

    invoke-direct {v8, v6}, Ll/ᩳ᩵ܿ;-><init>(Ll/ܿ᩹ܿ;)V

    invoke-virtual {v5, v8}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 1124
    :cond_4
    new-instance v8, Ll/ᩳ᩵ܿ;

    invoke-virtual {v6}, Ll/ܽۜܳ;->᩻()I

    move-result v9

    invoke-virtual {v6}, Ll/ܽۜܳ;->ܽ()I

    move-result v10

    invoke-virtual {v6}, Ll/ܽۜܳ;->ۧ()I

    move-result v6

    invoke-direct {v8, v9, v10, v6}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v5, v8}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    goto :goto_3

    .line 1127
    :cond_5
    new-instance v8, Ll/ᩳ᩵ܿ;

    invoke-virtual {v6}, Ll/ܽۜܳ;->᩻()I

    move-result v6

    const/4 v9, -0x1

    invoke-direct {v8, v6, v9, v9}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v5, v8}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 1131
    :catch_0
    :cond_6
    :goto_3
    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ll/֨۬ܳ;->ܽ(Ljava/lang/String;)V

    .line 1132
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ll/֨۬ܳ;->ܿ(Ljava/lang/String;)V

    .line 1133
    invoke-virtual {v5, v4}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 1134
    invoke-virtual {v5, v7}, Ll/֨۬ܳ;->ܽ(Z)V

    .line 1135
    invoke-static {p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1136
    iget v3, p0, Ll/᩷۫ܳ;->ܽ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/᩷۫ܳ;->ܽ:I

    goto/16 :goto_0

    .line 1138
    :cond_7
    invoke-interface {v4}, Ll/᩵۬ܳ;->۟()V

    .line 1139
    invoke-static {p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 1140
    invoke-interface {v4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_5

    .line 1143
    :cond_9
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Ll/֨۬ܳ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-boolean v1, p0, Ll/ܶ۬ܳ;->ۜ:Z

    if-eqz v1, :cond_8

    .line 1144
    :cond_a
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;Ll/ܰܺܳ;)V

    goto :goto_4

    :cond_b
    :goto_5
    return-void
.end method

.method private ֫(Ll/֡۬ܳ;Ll/ܰܺܳ;Ll/ۗۢ᩻;Ll/֨ۡ᩻;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 732
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 733
    invoke-virtual/range {p1 .. p1}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    .line 199
    invoke-virtual {v1, v5, v6}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v5

    .line 733
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    iget-object v7, v0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    if-eqz v6, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 734
    invoke-interface {v7}, Ll/ܿۖ᩷;->᩻()Z

    move-result v8

    if-eqz v8, :cond_0

    goto/16 :goto_6

    .line 0
    :cond_0
    invoke-static {v4}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 737
    invoke-interface {v6}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 738
    iget-object v9, v0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    invoke-static {v9, v8}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 739
    invoke-virtual/range {p1 .. p1}, Ll/֨۬ܳ;->֡()Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_1

    invoke-virtual {v2, v9}, Ll/ۗۢ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    .line 741
    :goto_1
    invoke-interface {v6}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 742
    invoke-interface {v3, v8}, Ll/֨ۡ᩻;->setName(Ljava/lang/String;)V

    .line 743
    new-instance v7, Ll/֡۬ܳ;

    invoke-direct {v7}, Ll/֡۬ܳ;-><init>()V

    if-eqz v10, :cond_8

    .line 745
    invoke-static {v2, v9}, Ll/ܶ۬ܳ;->֫(Ll/ۗۢ᩻;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 748
    :cond_2
    new-instance v12, Ll/ۚ۬ܳ;

    invoke-direct {v12}, Ll/ۚ۬ܳ;-><init>()V

    if-eqz v10, :cond_7

    .line 750
    invoke-static {v2, v9}, Ll/ܶ۬ܳ;->ۧ(Ll/ۗۢ᩻;Ljava/lang/String;)V

    .line 751
    iget-object v13, v0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    invoke-interface {v13}, Ll/᩸۬ܳ;->᩵()Z

    move-result v14

    if-eqz v14, :cond_3

    .line 752
    invoke-static {v6}, Ll/᩹۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;

    move-result-object v14

    .line 1251
    :try_start_0
    invoke-virtual {v2, v9}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v15

    invoke-static {v15}, Ll/᩹۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;

    move-result-object v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 1253
    :catch_0
    sget-object v15, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    .line 752
    :goto_2
    invoke-interface {v13, v8, v14, v15, v11}, Ll/᩸۬ܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    .line 754
    :cond_3
    invoke-interface {v13}, Ll/ܿۖ᩷;->᩻()Z

    move-result v14

    if-eqz v14, :cond_4

    .line 755
    invoke-interface {v7}, Ll/᩵۬ܳ;->֫()V

    return-void

    .line 758
    :cond_4
    invoke-interface {v13}, Ll/᩸۬ܳ;->۬()I

    move-result v7

    const/4 v14, 0x1

    if-ne v7, v14, :cond_5

    .line 759
    invoke-static/range {p1 .. p1}, Ll/֡۬ܳ;->ۧ(Ll/֡۬ܳ;)V

    goto/16 :goto_0

    .line 762
    :cond_5
    invoke-interface {v13}, Ll/᩸۬ܳ;->۬()I

    move-result v7

    const/4 v13, 0x2

    if-ne v7, v13, :cond_6

    .line 763
    invoke-virtual {v12}, Ll/֨۬ܳ;->᩸()V

    goto :goto_3

    .line 764
    :cond_6
    iget-boolean v7, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v7, :cond_7

    .line 765
    invoke-virtual {v2, v9}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v7

    invoke-interface {v7}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v7

    if-eqz v7, :cond_7

    .line 767
    new-instance v13, Ll/ᩳ᩵ܿ;

    invoke-virtual {v7}, Ll/ܽۜܳ;->᩻()I

    move-result v7

    const/4 v14, -0x1

    invoke-direct {v13, v7, v14, v14}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v12, v13}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 771
    :cond_7
    :goto_3
    invoke-interface {v6}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v13

    invoke-virtual {v12, v13, v14}, Ll/֨۬ܳ;->֫(J)V

    .line 772
    iget-wide v13, v0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-virtual {v12}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v15

    add-long/2addr v13, v15

    iput-wide v13, v0, Ll/᩷۫ܳ;->ᩳ:J

    move-object v7, v12

    .line 774
    :cond_8
    :goto_4
    invoke-interface {v6}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v12

    invoke-virtual {v7, v12, v13}, Ll/֨۬ܳ;->ۧ(J)V

    .line 775
    iget-boolean v12, v0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v12, :cond_9

    invoke-interface {v6}, Ll/ᩳۜܳ;->۬()Z

    move-result v12

    if-eqz v12, :cond_9

    const/4 v11, 0x1

    :cond_9
    invoke-virtual {v7, v11}, Ll/֨۬ܳ;->֫(Z)V

    .line 776
    invoke-virtual {v7}, Ll/֨۬ܳ;->᩵()Z

    move-result v11

    if-eqz v11, :cond_a

    .line 777
    invoke-interface {v6}, Ll/ᩳۜܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ll/֨۬ܳ;->֫(Ljava/lang/String;)V

    .line 779
    :cond_a
    iget-boolean v11, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v11, :cond_c

    invoke-virtual {v7}, Ll/֨۬ܳ;->ܿ()Ll/ᩳ᩵ܿ;

    move-result-object v11

    if-nez v11, :cond_c

    .line 780
    invoke-interface {v6}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v11

    if-eqz v11, :cond_c

    .line 782
    invoke-virtual {v11}, Ll/ܽۜܳ;->᩻()I

    move-result v12

    .line 783
    instance-of v13, v6, Ll/ۢۧ᩻;

    if-eqz v13, :cond_b

    .line 784
    invoke-static {v11}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v11

    if-eqz v11, :cond_b

    .line 785
    invoke-interface {v6}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v11

    if-nez v11, :cond_b

    .line 787
    :try_start_1
    invoke-interface {v6}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v11

    .line 788
    invoke-virtual {v11}, Ll/ܿ᩹ܿ;->᩻()I

    move-result v12
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 795
    :catch_1
    :cond_b
    new-instance v11, Ll/ᩳ᩵ܿ;

    const/4 v13, -0x1

    invoke-direct {v11, v12, v13, v13}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v7, v11}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 798
    :cond_c
    invoke-interface {v6}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ll/֨۬ܳ;->ܽ(Ljava/lang/String;)V

    .line 799
    invoke-virtual {v7, v9}, Ll/֨۬ܳ;->ܿ(Ljava/lang/String;)V

    .line 800
    invoke-virtual {v7, v8}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 801
    invoke-virtual {v7, v10}, Ll/֨۬ܳ;->ܽ(Z)V

    .line 802
    invoke-static/range {p1 .. p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 803
    iget v6, v0, Ll/᩷۫ܳ;->ܽ:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v0, Ll/᩷۫ܳ;->ܽ:I

    goto/16 :goto_0

    .line 805
    :cond_d
    invoke-interface {v7}, Ll/᩵۬ܳ;->۟()V

    .line 806
    invoke-static/range {p1 .. p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_e
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֨۬ܳ;

    .line 807
    invoke-interface {v7}, Ll/ܿۖ᩷;->᩻()Z

    move-result v6

    if-eqz v6, :cond_f

    goto :goto_6

    .line 810
    :cond_f
    invoke-virtual {v5}, Ll/֨۬ܳ;->ۘ()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v5}, Ll/֨۬ܳ;->᩵()Z

    move-result v6

    if-eqz v6, :cond_10

    iget-boolean v6, v0, Ll/ܶ۬ܳ;->ۜ:Z

    if-eqz v6, :cond_e

    .line 811
    :cond_10
    invoke-virtual {v5}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v5

    invoke-direct {v0, v5, v1, v2, v3}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;Ll/ܰܺܳ;Ll/ۗۢ᩻;Ll/֨ۡ᩻;)V

    goto :goto_5

    :cond_11
    :goto_6
    return-void
.end method

.method private ֫(Ll/֡۬ܳ;Ll/ܰܺܳ;Z)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    .line 295
    invoke-virtual/range {p1 .. p1}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object v3

    .line 296
    invoke-virtual/range {p1 .. p1}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    .line 199
    invoke-virtual {v1, v4, v5}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v4

    .line 296
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    iget-object v7, v0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    if-eqz v6, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 297
    invoke-interface {v7}, Ll/ܿۖ᩷;->᩻()Z

    move-result v8

    if-eqz v8, :cond_0

    goto/16 :goto_9

    .line 300
    :cond_0
    invoke-interface {v6}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v8

    .line 176
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    const-string v9, "/"

    .line 0
    invoke-static {v3, v9, v8}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 301
    :goto_1
    invoke-interface {v6}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v9

    if-nez v2, :cond_2

    goto :goto_2

    .line 172
    :cond_2
    invoke-static {v8, v9}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    .line 302
    :goto_2
    iget-object v9, v0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 303
    invoke-virtual/range {p1 .. p1}, Ll/֨۬ܳ;->֡()Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_3

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v10

    if-eqz v10, :cond_3

    const/4 v10, 0x1

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    .line 304
    :goto_3
    iget-boolean v12, v0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v12, :cond_4

    invoke-interface {v6}, Ll/ᩳۜܳ;->۬()Z

    move-result v12

    if-eqz v12, :cond_4

    const/4 v12, 0x1

    goto :goto_4

    :cond_4
    const/4 v12, 0x0

    :goto_4
    if-eqz v10, :cond_5

    if-eqz v12, :cond_5

    .line 305
    iget-boolean v13, v0, Ll/ܶ۬ܳ;->ۘ:Z

    if-eqz v13, :cond_5

    const/4 v11, 0x1

    .line 307
    :cond_5
    invoke-interface {v6}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v13

    if-eqz v13, :cond_6

    .line 308
    new-instance v7, Ll/֡۬ܳ;

    invoke-direct {v7}, Ll/֡۬ܳ;-><init>()V

    if-eqz v10, :cond_b

    if-nez v11, :cond_b

    .line 310
    invoke-static {v9}, Ll/ܶ۬ܳ;->֫(Ll/ܶ᩵ܿ;)V

    goto :goto_6

    .line 313
    :cond_6
    new-instance v13, Ll/ۚ۬ܳ;

    invoke-direct {v13}, Ll/ۚ۬ܳ;-><init>()V

    if-eqz v10, :cond_a

    if-nez v11, :cond_a

    .line 316
    invoke-static {v9}, Ll/ܶ۬ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 317
    invoke-direct {v0, v9, v6, v8}, Ll/ܶ۬ܳ;->֫(Ll/ܶ᩵ܿ;Ll/ᩳۜܳ;Ljava/lang/String;)I

    move-result v11

    .line 318
    iget-object v14, v0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    invoke-interface {v14}, Ll/ܿۖ᩷;->᩻()Z

    move-result v15

    if-eqz v15, :cond_7

    .line 319
    invoke-interface {v7}, Ll/᩵۬ܳ;->֫()V

    return-void

    :cond_7
    if-ne v11, v5, :cond_8

    .line 323
    invoke-static/range {p1 .. p1}, Ll/֡۬ܳ;->ۧ(Ll/֡۬ܳ;)V

    goto/16 :goto_0

    :cond_8
    const/4 v7, 0x2

    if-ne v11, v7, :cond_9

    .line 327
    invoke-virtual {v13}, Ll/֨۬ܳ;->᩸()V

    goto :goto_5

    .line 329
    :cond_9
    new-instance v7, Ll/ܿ᩵ܿ;

    invoke-direct {v7}, Ll/ܿ᩵ܿ;-><init>()V

    .line 330
    invoke-virtual {v7, v9}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 331
    invoke-virtual {v7}, Ll/ܿ᩵ܿ;->ۧ()Ll/ᩳ᩵ܿ;

    move-result-object v7

    invoke-virtual {v13, v7}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    :goto_5
    if-nez v11, :cond_a

    .line 333
    invoke-interface {v14}, Ll/᩸۬ܳ;->ܶ()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 334
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 335
    invoke-virtual {v13, v5}, Ll/֨۬ܳ;->ۧ(Z)V

    .line 339
    :cond_a
    invoke-interface {v6}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v14

    invoke-virtual {v13, v14, v15}, Ll/֨۬ܳ;->֫(J)V

    .line 340
    iget-wide v14, v0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-virtual {v13}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v16

    add-long v14, v16, v14

    iput-wide v14, v0, Ll/᩷۫ܳ;->ᩳ:J

    move-object v7, v13

    .line 342
    :cond_b
    :goto_6
    invoke-interface {v6}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v13

    invoke-virtual {v7, v13, v14}, Ll/֨۬ܳ;->ۧ(J)V

    .line 343
    invoke-virtual {v7, v12}, Ll/֨۬ܳ;->֫(Z)V

    .line 344
    invoke-virtual {v7}, Ll/֨۬ܳ;->᩵()Z

    move-result v11

    if-eqz v11, :cond_c

    .line 345
    invoke-interface {v6}, Ll/ᩳۜܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ll/֨۬ܳ;->֫(Ljava/lang/String;)V

    .line 347
    :cond_c
    iget-boolean v11, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v11, :cond_f

    invoke-virtual {v7}, Ll/֨۬ܳ;->ܿ()Ll/ᩳ᩵ܿ;

    move-result-object v11

    if-nez v11, :cond_f

    .line 348
    invoke-interface {v6}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v11

    if-eqz v11, :cond_f

    .line 350
    instance-of v12, v6, Ll/ۢۧ᩻;

    if-eqz v12, :cond_e

    .line 351
    invoke-static {v11}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v12

    if-eqz v12, :cond_d

    .line 352
    invoke-interface {v6}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v11

    if-nez v11, :cond_f

    .line 354
    :try_start_0
    invoke-interface {v6}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v11

    .line 355
    new-instance v12, Ll/ᩳ᩵ܿ;

    invoke-direct {v12, v11}, Ll/ᩳ᩵ܿ;-><init>(Ll/ܿ᩹ܿ;)V

    invoke-virtual {v7, v12}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    .line 361
    :cond_d
    new-instance v12, Ll/ᩳ᩵ܿ;

    invoke-virtual {v11}, Ll/ܽۜܳ;->᩻()I

    move-result v13

    invoke-virtual {v11}, Ll/ܽۜܳ;->ܽ()I

    move-result v14

    invoke-virtual {v11}, Ll/ܽۜܳ;->ۧ()I

    move-result v11

    invoke-direct {v12, v13, v14, v11}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v7, v12}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    goto :goto_7

    .line 364
    :cond_e
    new-instance v12, Ll/ᩳ᩵ܿ;

    invoke-virtual {v11}, Ll/ܽۜܳ;->᩻()I

    move-result v11

    const/4 v13, -0x1

    invoke-direct {v12, v11, v13, v13}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v7, v12}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 368
    :catch_0
    :cond_f
    :goto_7
    invoke-interface {v6}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ll/֨۬ܳ;->ܽ(Ljava/lang/String;)V

    .line 369
    invoke-virtual {v7, v9}, Ll/֨۬ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 370
    invoke-virtual {v7, v8}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 371
    invoke-virtual {v7, v10}, Ll/֨۬ܳ;->ܽ(Z)V

    .line 372
    invoke-static/range {p1 .. p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 373
    iget v6, v0, Ll/᩷۫ܳ;->ܽ:I

    add-int/2addr v6, v5

    iput v6, v0, Ll/᩷۫ܳ;->ܽ:I

    goto/16 :goto_0

    .line 375
    :cond_10
    invoke-interface {v7}, Ll/᩵۬ܳ;->۟()V

    .line 376
    invoke-static/range {p1 .. p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_11
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֨۬ܳ;

    .line 377
    invoke-interface {v7}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5

    if-eqz v5, :cond_12

    goto :goto_9

    .line 380
    :cond_12
    invoke-direct {v0, v4}, Ll/ܶ۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v5

    if-eqz v5, :cond_11

    .line 381
    invoke-virtual {v4}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v4

    invoke-direct {v0, v4, v1, v2}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;Ll/ܰܺܳ;Z)V

    goto :goto_8

    :cond_13
    :goto_9
    return-void
.end method

.method public static ֫(Ll/ۗۢ᩻;Ljava/lang/String;)V
    .locals 2

    .line 1166
    invoke-virtual {p0, p1}, Ll/ۗۢ᩻;->ۜ(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 1167
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "File \'"

    const-string v1, "\' exists but is not a directory"

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1167
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)V
    .locals 3

    .line 1178
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1179
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' exists but is not a directory"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ᩳۜܳ;Ljava/lang/String;Ll/ܰܺܳ;Z)V
    .locals 5

    const-string v0, "/"

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p3, :cond_0

    .line 138
    invoke-interface {p0}, Ll/ᩳۜܳ;->۬()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 142
    :goto_0
    :try_start_0
    invoke-interface {p0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_1

    if-nez v3, :cond_1

    const/4 v1, 0x1

    .line 172
    :cond_1
    invoke-static {p1, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_3

    .line 152
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 156
    invoke-static {v1, v3}, Ll/ܿ֡ܿ;->ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    .line 154
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p2, "Archive symbolic link target is missing: "

    .line 0
    invoke-static {p2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 154
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 158
    :cond_3
    :goto_1
    invoke-interface {p0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 161
    invoke-interface {p0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p0

    .line 199
    invoke-virtual {p2, p0, v2}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object p0

    .line 161
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۜܳ;

    .line 162
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 176
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_3

    .line 0
    :cond_4
    invoke-static {v1, v0, v2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 162
    :goto_3
    invoke-static {p1, v2, p2, p3}, Ll/ܶ۬ܳ;->֫(Ll/ᩳۜܳ;Ljava/lang/String;Ll/ܰܺܳ;Z)V

    goto :goto_2

    :cond_5
    return-void

    :catch_0
    move-exception p1

    .line 145
    invoke-interface {p0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p0

    .line 146
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 147
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 149
    :cond_6
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Unsafe archive entry path: "

    .line 0
    invoke-static {p3, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 149
    invoke-direct {p2, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static ֫([Ljava/lang/String;Ll/ܰܺܳ;Z)V
    .locals 4

    .line 128
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    .line 129
    invoke-virtual {p1, v2}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v2

    .line 130
    move-object v3, v2

    check-cast v3, Ll/ܺۘܳ;

    invoke-virtual {v3}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, p1, p2}, Ll/ܶ۬ܳ;->֫(Ll/ᩳۜܳ;Ljava/lang/String;Ll/ܰܺܳ;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(Ll/֨۬ܳ;)Z
    .locals 1

    .line 404
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/֨۬ܳ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ܶ۬ܳ;->ۜ:Z

    if-eqz v0, :cond_2

    :cond_0
    iget-boolean v0, p0, Ll/ܶ۬ܳ;->ۘ:Z

    if-eqz v0, :cond_1

    .line 405
    invoke-virtual {p1}, Ll/֨۬ܳ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/֨۬ܳ;->֡()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 2

    .line 1156
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cannot create symbolic link because it already exists: "

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1156
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۧ(Ll/֡۬ܳ;)V
    .locals 5

    .line 1224
    invoke-static {p1}, Ll/֡۬ܳ;->֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 1225
    iget v1, p0, Ll/᩷۫ܳ;->ܽ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/᩷۫ܳ;->ܽ:I

    .line 1226
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1227
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܶ۬ܳ;->ۧ(Ll/֡۬ܳ;)V

    goto :goto_0

    .line 1229
    :cond_0
    iget-wide v1, p0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-static {v0}, Ll/֨۬ܳ;->ۧ(Ll/֨۬ܳ;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷۫ܳ;->ᩳ:J

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۧ(Ll/ۗۢ᩻;Ljava/lang/String;)V
    .locals 2

    .line 1160
    invoke-virtual {p0, p1}, Ll/ۗۢ᩻;->ۜ(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 1161
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "File \'"

    const-string v1, "\' exists but is a directory"

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1161
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)V
    .locals 3

    .line 1172
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1173
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' exists but is a directory"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ(Ll/֡۬ܳ;)V
    .locals 3

    .line 1184
    invoke-virtual {p0}, Ll/֨۬ܳ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 1187
    :cond_0
    invoke-virtual {p0}, Ll/֨۬ܳ;->֡()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1188
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 1510
    iput-object v0, p0, Ll/֨۬ܳ;->ܿ:Ljava/util/concurrent/CountDownLatch;

    .line 1190
    invoke-virtual {p0}, Ll/֡۬ܳ;->᩶()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 1191
    invoke-virtual {v2, v0}, Ll/֨۬ܳ;->֫(Ljava/util/concurrent/CountDownLatch;)V

    goto :goto_0

    .line 1194
    :cond_1
    invoke-virtual {p0}, Ll/֡۬ܳ;->᩶()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 1195
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1196
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-static {v0}, Ll/ܶ۬ܳ;->ܽ(Ll/֡۬ܳ;)V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public static bridge synthetic ᩵()Ll/ᩴ۬ܳ;
    .locals 1

    .line 0
    sget-object v0, Ll/ܶ۬ܳ;->֡:Ll/ᩴ۬ܳ;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Ll/ܶ۬ܳ;->ۖ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/᩶ܿ᩻;)V
    .locals 1

    .line 1202
    iget-object v0, p0, Ll/ܶ۬ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Ll/ܶ۬ܳ;->֫(Ljava/util/ArrayList;Ll/۠۬ܳ;)V

    return-void
.end method

.method public final ֫([Ljava/lang/String;)V
    .locals 14

    .line 416
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Ll/ܶ۬ܳ;->ܳ:Ljava/util/ArrayList;

    iget-object v4, p0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    if-ge v2, v0, :cond_13

    aget-object v5, p1, v2

    .line 417
    invoke-interface {v4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_9

    :cond_0
    new-array v6, v1, [Ljava/lang/String;

    .line 420
    invoke-static {v5, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 421
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 422
    iget-object v7, p0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 424
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Ll/ܿ֡ܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto/16 :goto_5

    .line 427
    :cond_1
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v8

    .line 430
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v9

    const/4 v10, 0x1

    if-eqz v9, :cond_3

    .line 431
    invoke-virtual {v7, v5}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v9

    if-nez v9, :cond_2

    .line 434
    new-instance v9, Ll/֡۬ܳ;

    invoke-direct {v9}, Ll/֡۬ܳ;-><init>()V

    goto :goto_1

    .line 432
    :cond_2
    new-instance p1, Ll/᩵ۤۡ;

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const v0, 0x7f120617

    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 432
    throw p1

    .line 436
    :cond_3
    new-instance v9, Ll/ۚ۬ܳ;

    invoke-direct {v9}, Ll/ۚ۬ܳ;-><init>()V

    .line 437
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, Ll/֨۬ܳ;->֫(J)V

    .line 439
    :goto_1
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ll/֨۬ܳ;->ᩳ(Ljava/lang/String;)V

    .line 440
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, Ll/֨۬ܳ;->ۧ(J)V

    .line 441
    iget-boolean v11, p0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v11, :cond_4

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v11

    if-eqz v11, :cond_4

    const/4 v11, 0x1

    goto :goto_2

    :cond_4
    const/4 v11, 0x0

    :goto_2
    invoke-virtual {v9, v11}, Ll/֨۬ܳ;->֫(Z)V

    .line 442
    invoke-virtual {v9, v5}, Ll/֨۬ܳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 443
    invoke-virtual {v9, v7}, Ll/֨۬ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 444
    invoke-virtual {v9, v6}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 445
    invoke-virtual {v9, v8}, Ll/֨۬ܳ;->ܽ(Z)V

    if-nez v8, :cond_6

    .line 449
    invoke-interface {v4, v6}, Ll/᩵۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 450
    invoke-virtual {v5, v7}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 452
    invoke-virtual {v9}, Ll/֨۬ܳ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 453
    invoke-virtual {v9}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v3

    invoke-virtual {v7, v3, v4}, Ll/ܶ᩵ܿ;->֫(J)Z

    .line 455
    :cond_5
    iget-object v3, p0, Ll/ܶ۬ܳ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    iget v3, p0, Ll/᩷۫ܳ;->ܽ:I

    add-int/2addr v3, v10

    iput v3, p0, Ll/᩷۫ܳ;->ܽ:I

    .line 457
    invoke-virtual {p0}, Ll/᩷۫ܳ;->᩷()V

    goto/16 :goto_5

    .line 461
    :cond_6
    invoke-static {v9}, Ll/֨۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 462
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v11

    if-eqz v11, :cond_7

    goto :goto_3

    .line 1152
    :cond_7
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ۬ܳ;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 465
    :cond_8
    invoke-virtual {v9}, Ll/֨۬ܳ;->ۘ()Z

    move-result v11

    if-eqz v11, :cond_9

    .line 466
    invoke-static {v7}, Ll/ܶ۬ܳ;->֫(Ll/ܶ᩵ܿ;)V

    goto :goto_3

    .line 468
    :cond_9
    invoke-static {v7}, Ll/ܶ۬ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 471
    :cond_a
    :goto_3
    invoke-static {v9}, Ll/֨۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v11

    if-nez v11, :cond_b

    invoke-virtual {v9}, Ll/֨۬ܳ;->ۘ()Z

    move-result v11

    if-nez v11, :cond_12

    .line 472
    :cond_b
    invoke-virtual {v9}, Ll/֨۬ܳ;->ۧ()Ll/ۚ۬ܳ;

    move-result-object v11

    if-eqz v8, :cond_11

    .line 474
    invoke-virtual {v11}, Ll/֨۬ܳ;->᩹()V

    .line 475
    iget-object v8, p0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    invoke-interface {v8}, Ll/᩸۬ܳ;->᩵()Z

    move-result v12

    if-eqz v12, :cond_c

    .line 476
    invoke-static {v5}, Ll/᩹۬ܳ;->֫(Ll/ܶ᩵ܿ;)Ll/᩹۬ܳ;

    move-result-object v5

    invoke-static {v7}, Ll/᩹۬ܳ;->֫(Ll/ܶ᩵ܿ;)Ll/᩹۬ܳ;

    move-result-object v12

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v13

    invoke-interface {v8, v6, v5, v12, v13}, Ll/᩸۬ܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    .line 478
    :cond_c
    invoke-interface {v8}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5

    if-eqz v5, :cond_d

    .line 479
    invoke-interface {v4}, Ll/᩵۬ܳ;->֫()V

    return-void

    .line 482
    :cond_d
    invoke-interface {v8}, Ll/᩸۬ܳ;->۬()I

    move-result v4

    if-ne v4, v10, :cond_e

    goto :goto_5

    .line 485
    :cond_e
    invoke-interface {v8}, Ll/᩸۬ܳ;->۬()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_f

    .line 486
    invoke-virtual {v11}, Ll/֨۬ܳ;->᩸()V

    goto :goto_4

    .line 487
    :cond_f
    invoke-static {v9}, Ll/֨۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v4

    if-nez v4, :cond_10

    .line 488
    new-instance v4, Ll/ܿ᩵ܿ;

    invoke-direct {v4}, Ll/ܿ᩵ܿ;-><init>()V

    .line 489
    invoke-virtual {v4, v7}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 490
    invoke-virtual {v4}, Ll/ܿ᩵ܿ;->ۧ()Ll/ᩳ᩵ܿ;

    move-result-object v4

    invoke-virtual {v11, v4}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 492
    :cond_10
    :goto_4
    invoke-interface {v8}, Ll/᩸۬ܳ;->۬()I

    move-result v4

    if-nez v4, :cond_11

    invoke-interface {v8}, Ll/᩸۬ܳ;->ܶ()Z

    move-result v4

    if-eqz v4, :cond_11

    .line 493
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v4

    if-eqz v4, :cond_11

    .line 494
    invoke-virtual {v11, v10}, Ll/֨۬ܳ;->ۧ(Z)V

    .line 498
    :cond_11
    invoke-static {v9}, Ll/֨۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v4

    if-nez v4, :cond_12

    .line 499
    iget-wide v4, p0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-static {v9}, Ll/֨۬ܳ;->ۧ(Ll/֨۬ܳ;)J

    move-result-wide v6

    add-long/2addr v4, v6

    iput-wide v4, p0, Ll/᩷۫ܳ;->ᩳ:J

    .line 502
    :cond_12
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 503
    iget v3, p0, Ll/᩷۫ܳ;->ܽ:I

    add-int/2addr v3, v10

    iput v3, p0, Ll/᩷۫ܳ;->ܽ:I

    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 505
    :cond_13
    invoke-interface {v4}, Ll/᩵۬ܳ;->۟()V

    .line 506
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_14
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 507
    invoke-interface {v4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-eqz v1, :cond_15

    goto :goto_9

    .line 510
    :cond_15
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-virtual {v0}, Ll/֨۬ܳ;->᩵()Z

    move-result v1

    if-nez v1, :cond_14

    .line 511
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;)V

    goto :goto_6

    .line 514
    :cond_16
    invoke-interface {v4}, Ll/᩵۬ܳ;->۟()V

    .line 515
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_17
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 516
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_17

    .line 517
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-static {v0}, Ll/ܶ۬ܳ;->ܽ(Ll/֡۬ܳ;)V

    goto :goto_7

    .line 520
    :cond_18
    sget-object p1, Ll/ܶ۬ܳ;->֡:Ll/ᩴ۬ܳ;

    invoke-static {v3, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 521
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_19
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 522
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 523
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡۬ܳ;->ۗ()V

    goto :goto_8

    :cond_1a
    :goto_9
    return-void
.end method

.method public final ֫([Ljava/lang/String;Ll/ۗۢ᩻;Ll/᩹ۡ᩻;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 819
    invoke-virtual/range {p2 .. p2}, Ll/ܰܺܳ;->ᩳ()Z

    move-result v4

    .line 820
    array-length v5, v1

    const/4 v6, 0x0

    :goto_0
    iget-object v7, v0, Ll/ܶ۬ܳ;->ܳ:Ljava/util/ArrayList;

    iget-object v8, v0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    if-ge v6, v5, :cond_12

    aget-object v9, v1, v6

    .line 821
    invoke-interface {v8}, Ll/ܿۖ᩷;->᩻()Z

    move-result v10

    if-eqz v10, :cond_0

    goto/16 :goto_d

    .line 824
    :cond_0
    invoke-virtual {v2, v9}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v9

    .line 825
    move-object v10, v9

    check-cast v10, Ll/ܺۘܳ;

    invoke-virtual {v10}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v11

    .line 826
    iget-object v12, v0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    invoke-static {v12, v11}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 828
    invoke-virtual {v10}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v13

    if-eqz v4, :cond_1

    .line 829
    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_2

    goto :goto_1

    :cond_1
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    :goto_1
    move/from16 v16, v4

    move/from16 v18, v5

    goto/16 :goto_9

    .line 832
    :cond_2
    invoke-virtual {v2, v12}, Ll/ۗۢ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_4

    .line 834
    iget-boolean v15, v0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v15, :cond_4

    invoke-virtual {v10}, Ll/ܺۘܳ;->۬()Z

    move-result v15

    if-nez v15, :cond_3

    goto :goto_2

    .line 835
    :cond_3
    invoke-static {v12}, Ll/ܶ۬ܳ;->ۧ(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    .line 837
    :cond_4
    :goto_2
    invoke-virtual {v10}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v15

    if-eqz v15, :cond_6

    .line 838
    invoke-interface {v3, v11}, Ll/֨ۡ᩻;->setName(Ljava/lang/String;)V

    .line 839
    new-instance v8, Ll/֡۬ܳ;

    invoke-direct {v8}, Ll/֡۬ܳ;-><init>()V

    if-eqz v14, :cond_5

    .line 841
    invoke-static {v2, v12}, Ll/ܶ۬ܳ;->֫(Ll/ۗۢ᩻;Ljava/lang/String;)V

    :cond_5
    move/from16 v16, v4

    move/from16 v18, v5

    goto/16 :goto_7

    .line 844
    :cond_6
    new-instance v15, Ll/ۚ۬ܳ;

    invoke-direct {v15}, Ll/ۚ۬ܳ;-><init>()V

    if-eqz v14, :cond_b

    .line 846
    invoke-static {v2, v12}, Ll/ܶ۬ܳ;->ۧ(Ll/ۗۢ᩻;Ljava/lang/String;)V

    .line 847
    iget-object v1, v0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    invoke-interface {v1}, Ll/᩸۬ܳ;->᩵()Z

    move-result v16

    if-eqz v16, :cond_7

    move/from16 v16, v4

    .line 848
    invoke-static {v9}, Ll/᩹۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;

    move-result-object v4

    .line 1251
    :try_start_0
    invoke-virtual {v2, v12}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Ll/᩹۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;

    move-result-object v17
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    move/from16 v18, v5

    move-object/from16 v5, v17

    goto :goto_4

    .line 1253
    :catch_0
    sget-object v17, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    goto :goto_3

    :goto_4
    const/4 v3, 0x0

    .line 848
    invoke-interface {v1, v11, v4, v5, v3}, Ll/᩸۬ܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    goto :goto_5

    :cond_7
    move/from16 v16, v4

    move/from16 v18, v5

    .line 850
    :goto_5
    invoke-interface {v1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 851
    invoke-interface {v8}, Ll/᩵۬ܳ;->֫()V

    return-void

    .line 854
    :cond_8
    invoke-interface {v1}, Ll/᩸۬ܳ;->۬()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_9

    goto/16 :goto_9

    .line 857
    :cond_9
    invoke-interface {v1}, Ll/᩸۬ܳ;->۬()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_a

    .line 858
    invoke-virtual {v15}, Ll/֨۬ܳ;->᩸()V

    goto :goto_6

    .line 859
    :cond_a
    iget-boolean v1, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v1, :cond_c

    .line 860
    invoke-virtual {v2, v12}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 862
    new-instance v3, Ll/ᩳ᩵ܿ;

    invoke-virtual {v1}, Ll/ܽۜܳ;->᩻()I

    move-result v1

    const/4 v4, -0x1

    invoke-direct {v3, v1, v4, v4}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v15, v3}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    goto :goto_6

    :cond_b
    move/from16 v16, v4

    move/from16 v18, v5

    .line 866
    :cond_c
    :goto_6
    invoke-virtual {v10}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v3

    invoke-virtual {v15, v3, v4}, Ll/֨۬ܳ;->֫(J)V

    .line 867
    iget-wide v3, v0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-virtual {v15}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v19

    add-long v3, v19, v3

    iput-wide v3, v0, Ll/᩷۫ܳ;->ᩳ:J

    move-object v8, v15

    .line 869
    :goto_7
    invoke-virtual {v8, v11}, Ll/֨۬ܳ;->ᩳ(Ljava/lang/String;)V

    .line 870
    invoke-virtual {v10}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v3

    invoke-virtual {v8, v3, v4}, Ll/֨۬ܳ;->ۧ(J)V

    .line 871
    iget-boolean v1, v0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v1, :cond_d

    invoke-virtual {v10}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x1

    goto :goto_8

    :cond_d
    const/4 v1, 0x0

    :goto_8
    invoke-virtual {v8, v1}, Ll/֨۬ܳ;->֫(Z)V

    .line 872
    invoke-virtual {v8}, Ll/֨۬ܳ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 873
    invoke-virtual {v10}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ll/֨۬ܳ;->֫(Ljava/lang/String;)V

    .line 875
    :cond_e
    iget-boolean v1, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v1, :cond_10

    invoke-virtual {v8}, Ll/֨۬ܳ;->ܿ()Ll/ᩳ᩵ܿ;

    move-result-object v1

    if-nez v1, :cond_10

    .line 876
    invoke-interface {v9}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 878
    invoke-virtual {v1}, Ll/ܽۜܳ;->᩻()I

    move-result v3

    .line 879
    instance-of v4, v9, Ll/ۢۧ᩻;

    if-eqz v4, :cond_f

    .line 880
    invoke-static {v1}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 881
    move-object v1, v9

    check-cast v1, Ll/ۢۧ᩻;

    invoke-virtual {v1}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v1

    if-nez v1, :cond_f

    .line 883
    :try_start_1
    check-cast v9, Ll/ܺۘܳ;

    invoke-virtual {v9}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v1

    .line 884
    invoke-virtual {v1}, Ll/ܿ᩹ܿ;->᩻()I

    move-result v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 891
    :catch_1
    :cond_f
    new-instance v1, Ll/ᩳ᩵ܿ;

    const/4 v4, -0x1

    invoke-direct {v1, v3, v4, v4}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v8, v1}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 894
    :cond_10
    invoke-virtual {v8, v13}, Ll/֨۬ܳ;->ܽ(Ljava/lang/String;)V

    .line 895
    invoke-virtual {v8, v12}, Ll/֨۬ܳ;->ܿ(Ljava/lang/String;)V

    .line 896
    invoke-virtual {v8, v11}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 897
    invoke-virtual {v8, v14}, Ll/֨۬ܳ;->ܽ(Z)V

    if-nez v14, :cond_11

    .line 898
    invoke-virtual {v8}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 900
    :try_start_2
    invoke-virtual {v8}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Ll/֨۬ܳ;->ܺ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ll/ۗۢ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 901
    iget-object v1, v0, Ll/ܶ۬ܳ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 902
    iget v1, v0, Ll/᩷۫ܳ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/᩷۫ܳ;->ܽ:I

    .line 903
    invoke-virtual/range {p0 .. p0}, Ll/᩷۫ܳ;->᩷()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_9

    .line 910
    :catch_2
    :cond_11
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 911
    iget v1, v0, Ll/᩷۫ܳ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/᩷۫ܳ;->ܽ:I

    :goto_9
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p1

    move-object/from16 v3, p3

    move/from16 v4, v16

    move/from16 v5, v18

    goto/16 :goto_0

    .line 913
    :cond_12
    invoke-interface {v8}, Ll/᩵۬ܳ;->۟()V

    .line 914
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨۬ܳ;

    .line 915
    invoke-interface {v8}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_14

    goto :goto_d

    .line 918
    :cond_14
    invoke-virtual {v3}, Ll/֨۬ܳ;->ۘ()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-virtual {v3}, Ll/֨۬ܳ;->᩵()Z

    move-result v4

    if-eqz v4, :cond_15

    iget-boolean v4, v0, Ll/ܶ۬ܳ;->ۜ:Z

    if-eqz v4, :cond_13

    .line 919
    :cond_15
    invoke-virtual {v3}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v3

    move-object/from16 v4, p3

    invoke-direct {v0, v3, v2, v4}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;Ll/ۗۢ᩻;Ll/᩹ۡ᩻;)V

    goto :goto_a

    :cond_16
    move-object/from16 v4, p3

    goto :goto_a

    .line 922
    :cond_17
    invoke-interface {v8}, Ll/᩵۬ܳ;->۟()V

    .line 923
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_18
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 924
    invoke-virtual {v2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_18

    .line 925
    invoke-virtual {v2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v2

    invoke-static {v2}, Ll/ܶ۬ܳ;->ܽ(Ll/֡۬ܳ;)V

    goto :goto_b

    .line 928
    :cond_19
    sget-object v1, Ll/ܶ۬ܳ;->֡:Ll/ᩴ۬ܳ;

    invoke-static {v7, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 929
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1a
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 930
    invoke-virtual {v2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_1a

    .line 931
    invoke-virtual {v2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡۬ܳ;->ۗ()V

    goto :goto_c

    :cond_1b
    :goto_d
    return-void
.end method

.method public final ֫([Ljava/lang/String;Ll/ܰܺܳ;)V
    .locals 13

    .line 1024
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    iget-object v4, p0, Ll/ܶ۬ܳ;->ܳ:Ljava/util/ArrayList;

    if-ge v2, v0, :cond_7

    aget-object v5, p1, v2

    .line 1025
    invoke-interface {v3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_6

    .line 1028
    :cond_0
    invoke-virtual {p2, v5}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v3

    .line 1029
    move-object v6, v3

    check-cast v6, Ll/ܺۘܳ;

    invoke-virtual {v6}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v7

    .line 1031
    invoke-virtual {v6}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 1032
    new-instance v8, Ll/֡۬ܳ;

    invoke-direct {v8}, Ll/֡۬ܳ;-><init>()V

    goto :goto_1

    .line 1034
    :cond_1
    new-instance v8, Ll/ۚ۬ܳ;

    invoke-direct {v8}, Ll/ۚ۬ܳ;-><init>()V

    .line 1035
    invoke-virtual {v6}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ll/֨۬ܳ;->֫(J)V

    .line 1036
    iget-wide v9, p0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-virtual {v8}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v11

    add-long/2addr v11, v9

    iput-wide v11, p0, Ll/᩷۫ܳ;->ᩳ:J

    .line 1038
    :goto_1
    invoke-virtual {v8, v7}, Ll/֨۬ܳ;->ᩳ(Ljava/lang/String;)V

    .line 1039
    invoke-virtual {v6}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ll/֨۬ܳ;->ۧ(J)V

    .line 1040
    iget-boolean v9, p0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v9, :cond_2

    invoke-virtual {v6}, Ll/ܺۘܳ;->۬()Z

    move-result v9

    if-eqz v9, :cond_2

    const/4 v9, 0x1

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    :goto_2
    invoke-virtual {v8, v9}, Ll/֨۬ܳ;->֫(Z)V

    .line 1041
    invoke-virtual {v8}, Ll/֨۬ܳ;->᩵()Z

    move-result v9

    if-eqz v9, :cond_3

    .line 1042
    invoke-virtual {v6}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ll/֨۬ܳ;->֫(Ljava/lang/String;)V

    .line 1044
    :cond_3
    iget-boolean v6, p0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v6, :cond_6

    .line 1045
    invoke-interface {v3}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 1047
    instance-of v9, v3, Ll/ۢۧ᩻;

    if-eqz v9, :cond_5

    .line 1048
    invoke-static {v6}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 1049
    move-object v6, v3

    check-cast v6, Ll/ۢۧ᩻;

    invoke-virtual {v6}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v6

    if-nez v6, :cond_6

    .line 1051
    :try_start_0
    check-cast v3, Ll/ܺۘܳ;

    invoke-virtual {v3}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v3

    .line 1052
    new-instance v6, Ll/ᩳ᩵ܿ;

    invoke-direct {v6, v3}, Ll/ᩳ᩵ܿ;-><init>(Ll/ܿ᩹ܿ;)V

    invoke-virtual {v8, v6}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 1058
    :cond_4
    new-instance v3, Ll/ᩳ᩵ܿ;

    invoke-virtual {v6}, Ll/ܽۜܳ;->᩻()I

    move-result v9

    invoke-virtual {v6}, Ll/ܽۜܳ;->ܽ()I

    move-result v10

    invoke-virtual {v6}, Ll/ܽۜܳ;->ۧ()I

    move-result v6

    invoke-direct {v3, v9, v10, v6}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v8, v3}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    goto :goto_3

    .line 1061
    :cond_5
    new-instance v3, Ll/ᩳ᩵ܿ;

    invoke-virtual {v6}, Ll/ܽۜܳ;->᩻()I

    move-result v6

    const/4 v9, -0x1

    invoke-direct {v3, v6, v9, v9}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v8, v3}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 1065
    :catch_0
    :cond_6
    :goto_3
    invoke-virtual {v8, v5}, Ll/֨۬ܳ;->ܽ(Ljava/lang/String;)V

    .line 1066
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ll/֨۬ܳ;->ܿ(Ljava/lang/String;)V

    .line 1067
    invoke-virtual {v8, v7}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 1068
    invoke-virtual {v8, v1}, Ll/֨۬ܳ;->ܽ(Z)V

    .line 1069
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1070
    iget v3, p0, Ll/᩷۫ܳ;->ܽ:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Ll/᩷۫ܳ;->ܽ:I

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 1072
    :cond_7
    invoke-interface {v3}, Ll/᩵۬ܳ;->۟()V

    .line 1073
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 1074
    invoke-interface {v3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_6

    .line 1077
    :cond_9
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Ll/֨۬ܳ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-boolean v1, p0, Ll/ܶ۬ܳ;->ۜ:Z

    if-eqz v1, :cond_8

    .line 1078
    :cond_a
    invoke-virtual {v0}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;Ll/ܰܺܳ;)V

    goto :goto_4

    .line 1081
    :cond_b
    sget-object p1, Ll/ܶ۬ܳ;->֡:Ll/ᩴ۬ܳ;

    invoke-static {v4, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1082
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_c
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֨۬ܳ;

    .line 1083
    invoke-virtual {p2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1084
    invoke-virtual {p2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/֡۬ܳ;->ۗ()V

    goto :goto_5

    :cond_d
    :goto_6
    return-void
.end method

.method public final ֫([Ljava/lang/String;Ll/ܰܺܳ;Ll/ۗۢ᩻;Ll/֨ۡ᩻;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 632
    array-length v5, v1

    const/4 v6, 0x0

    :goto_0
    iget-object v7, v0, Ll/ܶ۬ܳ;->ܳ:Ljava/util/ArrayList;

    iget-object v8, v0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    if-ge v6, v5, :cond_f

    aget-object v9, v1, v6

    .line 633
    invoke-interface {v8}, Ll/ܿۖ᩷;->᩻()Z

    move-result v10

    if-eqz v10, :cond_0

    goto/16 :goto_c

    .line 636
    :cond_0
    invoke-virtual {v2, v9}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v9

    .line 637
    move-object v10, v9

    check-cast v10, Ll/ܺۘܳ;

    invoke-virtual {v10}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v11

    .line 638
    iget-object v12, v0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    invoke-static {v12, v11}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 639
    invoke-virtual {v3, v12}, Ll/ۗۢ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_2

    .line 641
    iget-boolean v14, v0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v14, :cond_2

    invoke-virtual {v10}, Ll/ܺۘܳ;->۬()Z

    move-result v14

    if-nez v14, :cond_1

    goto :goto_1

    .line 642
    :cond_1
    invoke-static {v12}, Ll/ܶ۬ܳ;->ۧ(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    .line 644
    :cond_2
    :goto_1
    invoke-virtual {v10}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v14

    if-eqz v14, :cond_4

    .line 645
    invoke-interface {v4, v11}, Ll/֨ۡ᩻;->setName(Ljava/lang/String;)V

    .line 646
    new-instance v8, Ll/֡۬ܳ;

    invoke-direct {v8}, Ll/֡۬ܳ;-><init>()V

    if-eqz v13, :cond_3

    .line 648
    invoke-static {v3, v12}, Ll/ܶ۬ܳ;->֫(Ll/ۗۢ᩻;Ljava/lang/String;)V

    :cond_3
    move/from16 v17, v5

    goto/16 :goto_6

    .line 651
    :cond_4
    new-instance v14, Ll/ۚ۬ܳ;

    invoke-direct {v14}, Ll/ۚ۬ܳ;-><init>()V

    if-eqz v13, :cond_9

    .line 653
    invoke-static {v3, v12}, Ll/ܶ۬ܳ;->ۧ(Ll/ۗۢ᩻;Ljava/lang/String;)V

    .line 654
    iget-object v15, v0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    invoke-interface {v15}, Ll/᩸۬ܳ;->᩵()Z

    move-result v16

    if-eqz v16, :cond_5

    .line 655
    invoke-static {v9}, Ll/᩹۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;

    move-result-object v1

    .line 1251
    :try_start_0
    invoke-virtual {v3, v12}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ll/᩹۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;

    move-result-object v16
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    move/from16 v17, v5

    move-object/from16 v5, v16

    goto :goto_3

    .line 1253
    :catch_0
    sget-object v16, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    goto :goto_2

    :goto_3
    const/4 v2, 0x0

    .line 655
    invoke-interface {v15, v11, v1, v5, v2}, Ll/᩸۬ܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    goto :goto_4

    :cond_5
    move/from16 v17, v5

    .line 657
    :goto_4
    invoke-interface {v15}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 658
    invoke-interface {v8}, Ll/᩵۬ܳ;->֫()V

    return-void

    .line 661
    :cond_6
    invoke-interface {v15}, Ll/᩸۬ܳ;->۬()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_7

    goto/16 :goto_8

    .line 664
    :cond_7
    invoke-interface {v15}, Ll/᩸۬ܳ;->۬()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_8

    .line 665
    invoke-virtual {v14}, Ll/֨۬ܳ;->᩸()V

    goto :goto_5

    .line 666
    :cond_8
    iget-boolean v1, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v1, :cond_a

    .line 667
    invoke-virtual {v3, v12}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 669
    new-instance v2, Ll/ᩳ᩵ܿ;

    invoke-virtual {v1}, Ll/ܽۜܳ;->᩻()I

    move-result v1

    const/4 v5, -0x1

    invoke-direct {v2, v1, v5, v5}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v14, v2}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    goto :goto_5

    :cond_9
    move/from16 v17, v5

    .line 673
    :cond_a
    :goto_5
    invoke-virtual {v10}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v14, v1, v2}, Ll/֨۬ܳ;->֫(J)V

    .line 674
    iget-wide v1, v0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-virtual {v14}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v15

    add-long/2addr v1, v15

    iput-wide v1, v0, Ll/᩷۫ܳ;->ᩳ:J

    move-object v8, v14

    .line 676
    :goto_6
    invoke-virtual {v8, v11}, Ll/֨۬ܳ;->ᩳ(Ljava/lang/String;)V

    .line 677
    invoke-virtual {v10}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v8, v1, v2}, Ll/֨۬ܳ;->ۧ(J)V

    .line 678
    iget-boolean v1, v0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v1, :cond_b

    invoke-virtual {v10}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_b

    const/4 v1, 0x1

    goto :goto_7

    :cond_b
    const/4 v1, 0x0

    :goto_7
    invoke-virtual {v8, v1}, Ll/֨۬ܳ;->֫(Z)V

    .line 679
    invoke-virtual {v8}, Ll/֨۬ܳ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 680
    invoke-virtual {v10}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ll/֨۬ܳ;->֫(Ljava/lang/String;)V

    .line 682
    :cond_c
    iget-boolean v1, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v1, :cond_e

    invoke-virtual {v8}, Ll/֨۬ܳ;->ܿ()Ll/ᩳ᩵ܿ;

    move-result-object v1

    if-nez v1, :cond_e

    .line 683
    invoke-interface {v9}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 685
    invoke-virtual {v1}, Ll/ܽۜܳ;->᩻()I

    move-result v2

    .line 686
    instance-of v5, v9, Ll/ۢۧ᩻;

    if-eqz v5, :cond_d

    .line 687
    invoke-static {v1}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 688
    move-object v1, v9

    check-cast v1, Ll/ۢۧ᩻;

    invoke-virtual {v1}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v1

    if-nez v1, :cond_d

    .line 690
    :try_start_1
    check-cast v9, Ll/ܺۘܳ;

    invoke-virtual {v9}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v1

    .line 691
    invoke-virtual {v1}, Ll/ܿ᩹ܿ;->᩻()I

    move-result v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 698
    :catch_1
    :cond_d
    new-instance v1, Ll/ᩳ᩵ܿ;

    const/4 v5, -0x1

    invoke-direct {v1, v2, v5, v5}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v8, v1}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 701
    :cond_e
    invoke-virtual {v10}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ll/֨۬ܳ;->ܽ(Ljava/lang/String;)V

    .line 702
    invoke-virtual {v8, v12}, Ll/֨۬ܳ;->ܿ(Ljava/lang/String;)V

    .line 703
    invoke-virtual {v8, v11}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 704
    invoke-virtual {v8, v13}, Ll/֨۬ܳ;->ܽ(Z)V

    .line 705
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 706
    iget v1, v0, Ll/᩷۫ܳ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/᩷۫ܳ;->ܽ:I

    :goto_8
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v5, v17

    goto/16 :goto_0

    .line 708
    :cond_f
    invoke-interface {v8}, Ll/᩵۬ܳ;->۟()V

    .line 709
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_10
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 710
    invoke-interface {v8}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5

    if-eqz v5, :cond_11

    goto :goto_c

    .line 713
    :cond_11
    invoke-virtual {v2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-virtual {v2}, Ll/֨۬ܳ;->᩵()Z

    move-result v5

    if-eqz v5, :cond_12

    iget-boolean v5, v0, Ll/ܶ۬ܳ;->ۜ:Z

    if-eqz v5, :cond_10

    .line 714
    :cond_12
    invoke-virtual {v2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v2

    move-object/from16 v5, p2

    invoke-direct {v0, v2, v5, v3, v4}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;Ll/ܰܺܳ;Ll/ۗۢ᩻;Ll/֨ۡ᩻;)V

    goto :goto_9

    :cond_13
    move-object/from16 v5, p2

    goto :goto_9

    .line 717
    :cond_14
    invoke-interface {v8}, Ll/᩵۬ܳ;->۟()V

    .line 718
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_15
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 719
    invoke-virtual {v2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_15

    .line 720
    invoke-virtual {v2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v2

    invoke-static {v2}, Ll/ܶ۬ܳ;->ܽ(Ll/֡۬ܳ;)V

    goto :goto_a

    .line 723
    :cond_16
    sget-object v1, Ll/ܶ۬ܳ;->֡:Ll/ᩴ۬ܳ;

    invoke-static {v7, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 724
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_17
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 725
    invoke-virtual {v2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_17

    .line 726
    invoke-virtual {v2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡۬ܳ;->ۗ()V

    goto :goto_b

    :cond_18
    :goto_c
    return-void
.end method

.method public final ֫([Ljava/lang/String;Ll/ܰܺܳ;ZZ)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    .line 181
    iget-object v4, v0, Ll/ܶ۬ܳ;->ۖ:Ljava/lang/String;

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    .line 182
    array-length v6, v1

    if-ne v6, v5, :cond_0

    goto :goto_0

    .line 183
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 185
    :cond_1
    :goto_0
    array-length v5, v1

    const/4 v6, 0x0

    :goto_1
    iget-object v7, v0, Ll/ܶ۬ܳ;->ܳ:Ljava/util/ArrayList;

    iget-object v8, v0, Ll/ܶ۬ܳ;->᩻:Ll/᩵۬ܳ;

    if-ge v6, v5, :cond_15

    aget-object v9, v1, v6

    .line 186
    invoke-interface {v8}, Ll/ܿۖ᩷;->᩻()Z

    move-result v10

    if-eqz v10, :cond_2

    goto/16 :goto_f

    .line 189
    :cond_2
    invoke-virtual {v2, v9}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v10

    if-eqz v4, :cond_3

    move-object v11, v4

    goto :goto_2

    .line 190
    :cond_3
    move-object v11, v10

    check-cast v11, Ll/ܺۘܳ;

    invoke-virtual {v11}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v11

    .line 191
    :goto_2
    move-object v12, v10

    check-cast v12, Ll/ܺۘܳ;

    invoke-virtual {v12}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v13

    if-nez v3, :cond_4

    goto :goto_3

    .line 172
    :cond_4
    invoke-static {v11, v13}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v11

    .line 192
    :goto_3
    iget-object v13, v0, Ll/ܶ۬ܳ;->ᩴ:Ljava/lang/String;

    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v13

    .line 193
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v14

    .line 194
    iget-boolean v15, v0, Ll/ܶ۬ܳ;->ۢ:Z

    if-eqz v15, :cond_5

    invoke-virtual {v12}, Ll/ܺۘܳ;->۬()Z

    move-result v15

    if-eqz v15, :cond_5

    const/4 v15, 0x1

    goto :goto_4

    :cond_5
    const/4 v15, 0x0

    :goto_4
    if-eqz v14, :cond_6

    if-eqz v15, :cond_6

    .line 195
    iget-boolean v1, v0, Ll/ܶ۬ܳ;->ۘ:Z

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    :goto_5
    if-eqz v14, :cond_8

    if-eqz v15, :cond_8

    move-object/from16 v16, v4

    .line 198
    iget-boolean v4, v0, Ll/ܶ۬ܳ;->ۘ:Z

    if-eqz v4, :cond_7

    goto :goto_6

    .line 1152
    :cond_7
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܶ۬ܳ;->ۧ(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    :cond_8
    move-object/from16 v16, v4

    .line 201
    :goto_6
    invoke-virtual {v12}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_a

    .line 202
    new-instance v4, Ll/֡۬ܳ;

    invoke-direct {v4}, Ll/֡۬ܳ;-><init>()V

    if-eqz v14, :cond_9

    if-nez v1, :cond_9

    .line 204
    invoke-static {v13}, Ll/ܶ۬ܳ;->֫(Ll/ܶ᩵ܿ;)V

    :cond_9
    move/from16 v17, v5

    goto :goto_9

    .line 207
    :cond_a
    new-instance v4, Ll/ۚ۬ܳ;

    invoke-direct {v4}, Ll/ۚ۬ܳ;-><init>()V

    if-eqz v14, :cond_f

    if-nez v1, :cond_f

    .line 210
    invoke-static {v13}, Ll/ܶ۬ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 211
    invoke-direct {v0, v13, v10, v11}, Ll/ܶ۬ܳ;->֫(Ll/ܶ᩵ܿ;Ll/ᩳۜܳ;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v5

    .line 212
    iget-object v5, v0, Ll/ܶ۬ܳ;->ܿ:Ll/᩸۬ܳ;

    invoke-interface {v5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v18

    if-eqz v18, :cond_b

    .line 213
    invoke-interface {v8}, Ll/᩵۬ܳ;->֫()V

    return-void

    :cond_b
    const/4 v8, 0x1

    if-ne v1, v8, :cond_c

    goto/16 :goto_b

    :cond_c
    const/4 v8, 0x2

    if-ne v1, v8, :cond_d

    .line 220
    invoke-virtual {v4}, Ll/֨۬ܳ;->᩸()V

    goto :goto_7

    .line 221
    :cond_d
    iget-boolean v8, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v8, :cond_e

    .line 222
    new-instance v8, Ll/ܿ᩵ܿ;

    invoke-direct {v8}, Ll/ܿ᩵ܿ;-><init>()V

    .line 223
    invoke-virtual {v8, v13}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 224
    invoke-virtual {v8}, Ll/ܿ᩵ܿ;->ۧ()Ll/ᩳ᩵ܿ;

    move-result-object v8

    invoke-virtual {v4, v8}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    :cond_e
    :goto_7
    if-nez v1, :cond_10

    .line 226
    invoke-interface {v5}, Ll/᩸۬ܳ;->ܶ()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 227
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 v1, 0x1

    .line 228
    invoke-virtual {v4, v1}, Ll/֨۬ܳ;->ۧ(Z)V

    goto :goto_8

    :cond_f
    move/from16 v17, v5

    .line 232
    :cond_10
    :goto_8
    invoke-virtual {v12}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, Ll/֨۬ܳ;->֫(J)V

    .line 233
    iget-wide v1, v0, Ll/᩷۫ܳ;->ᩳ:J

    invoke-virtual {v4}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v18

    add-long v1, v18, v1

    iput-wide v1, v0, Ll/᩷۫ܳ;->ᩳ:J

    .line 235
    :goto_9
    invoke-virtual {v4, v11}, Ll/֨۬ܳ;->ᩳ(Ljava/lang/String;)V

    .line 236
    invoke-virtual {v12}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, Ll/֨۬ܳ;->ۧ(J)V

    .line 237
    invoke-virtual {v4, v15}, Ll/֨۬ܳ;->֫(Z)V

    .line 238
    invoke-virtual {v4}, Ll/֨۬ܳ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 239
    invoke-virtual {v12}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ll/֨۬ܳ;->֫(Ljava/lang/String;)V

    .line 241
    :cond_11
    iget-boolean v1, v0, Ll/ܶ۬ܳ;->ۡ:Z

    if-eqz v1, :cond_14

    invoke-virtual {v4}, Ll/֨۬ܳ;->ܿ()Ll/ᩳ᩵ܿ;

    move-result-object v1

    if-nez v1, :cond_14

    .line 242
    invoke-interface {v10}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    if-eqz v1, :cond_14

    .line 244
    instance-of v2, v10, Ll/ۢۧ᩻;

    if-eqz v2, :cond_13

    .line 245
    invoke-static {v1}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 246
    move-object v1, v10

    check-cast v1, Ll/ۢۧ᩻;

    invoke-virtual {v1}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v1

    if-nez v1, :cond_14

    .line 248
    :try_start_0
    check-cast v10, Ll/ܺۘܳ;

    invoke-virtual {v10}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v1

    .line 249
    new-instance v2, Ll/ᩳ᩵ܿ;

    invoke-direct {v2, v1}, Ll/ᩳ᩵ܿ;-><init>(Ll/ܿ᩹ܿ;)V

    invoke-virtual {v4, v2}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_a

    .line 255
    :cond_12
    new-instance v2, Ll/ᩳ᩵ܿ;

    invoke-virtual {v1}, Ll/ܽۜܳ;->᩻()I

    move-result v5

    invoke-virtual {v1}, Ll/ܽۜܳ;->ܽ()I

    move-result v8

    invoke-virtual {v1}, Ll/ܽۜܳ;->ۧ()I

    move-result v1

    invoke-direct {v2, v5, v8, v1}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v4, v2}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    goto :goto_a

    .line 258
    :cond_13
    new-instance v2, Ll/ᩳ᩵ܿ;

    invoke-virtual {v1}, Ll/ܽۜܳ;->᩻()I

    move-result v1

    const/4 v5, -0x1

    invoke-direct {v2, v1, v5, v5}, Ll/ᩳ᩵ܿ;-><init>(III)V

    invoke-virtual {v4, v2}, Ll/֨۬ܳ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 262
    :catch_0
    :cond_14
    :goto_a
    invoke-virtual {v4, v9}, Ll/֨۬ܳ;->ܽ(Ljava/lang/String;)V

    .line 263
    invoke-virtual {v4, v13}, Ll/֨۬ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 264
    invoke-virtual {v4, v11}, Ll/֨۬ܳ;->ۧ(Ljava/lang/String;)V

    .line 265
    invoke-virtual {v4, v14}, Ll/֨۬ܳ;->ܽ(Z)V

    .line 266
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    iget v1, v0, Ll/᩷۫ܳ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/᩷۫ܳ;->ܽ:I

    :goto_b
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v4, v16

    move/from16 v5, v17

    goto/16 :goto_1

    .line 269
    :cond_15
    invoke-interface {v8}, Ll/᩵۬ܳ;->۟()V

    .line 270
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 271
    invoke-interface {v8}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_16

    goto :goto_f

    .line 274
    :cond_16
    invoke-direct {v0, v2}, Ll/ܶ۬ܳ;->֫(Ll/֨۬ܳ;)Z

    move-result v4

    if-eqz v4, :cond_17

    .line 275
    invoke-virtual {v2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v2

    move-object/from16 v4, p2

    invoke-direct {v0, v2, v4, v3}, Ll/ܶ۬ܳ;->֫(Ll/֡۬ܳ;Ll/ܰܺܳ;Z)V

    goto :goto_c

    :cond_17
    move-object/from16 v4, p2

    goto :goto_c

    :cond_18
    if-eqz p4, :cond_1a

    .line 279
    invoke-interface {v8}, Ll/᩵۬ܳ;->۟()V

    .line 280
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_19
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 281
    invoke-virtual {v2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_19

    .line 282
    invoke-virtual {v2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v2

    invoke-static {v2}, Ll/ܶ۬ܳ;->ܽ(Ll/֡۬ܳ;)V

    goto :goto_d

    .line 286
    :cond_1a
    sget-object v1, Ll/ܶ۬ܳ;->֡:Ll/ᩴ۬ܳ;

    invoke-static {v7, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 287
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1b
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 288
    invoke-virtual {v2}, Ll/֨۬ܳ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_1b

    .line 289
    invoke-virtual {v2}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡۬ܳ;->ۗ()V

    goto :goto_e

    :cond_1c
    :goto_f
    return-void
.end method

.method public final ֫(Z)Z
    .locals 3

    .line 1258
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    .line 1259
    new-instance v0, Ll/۠۠ܿ;

    invoke-direct {v0}, Ll/۠۠ܿ;-><init>()V

    .line 1239
    iget-object v1, p0, Ll/ܶ۬ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 1260
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 1261
    invoke-virtual {v2, v0, p1}, Ll/֨۬ܳ;->֫(Ll/۠۠ܿ;Z)V

    goto :goto_0

    .line 1263
    :cond_0
    invoke-virtual {v0}, Ll/۠۠ܿ;->֫()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final ۖ()Ljava/util/List;
    .locals 1

    .line 1243
    iget-object v0, p0, Ll/ܶ۬ܳ;->᩷:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()V
    .locals 1

    const/4 v0, 0x1

    .line 106
    iput-boolean v0, p0, Ll/ܶ۬ܳ;->ۜ:Z

    return-void
.end method

.method public final ۡ()V
    .locals 1

    const/4 v0, 0x0

    .line 85
    iput-boolean v0, p0, Ll/ܶ۬ܳ;->ۡ:Z

    return-void
.end method

.method public final ۢ()V
    .locals 1

    const/4 v0, 0x0

    .line 92
    iput-boolean v0, p0, Ll/ܶ۬ܳ;->ۢ:Z

    return-void
.end method

.method public final ܺ()Ljava/util/List;
    .locals 1

    .line 1239
    iget-object v0, p0, Ll/ܶ۬ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()V
    .locals 1

    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p0, Ll/ܶ۬ܳ;->ۘ:Z

    return-void
.end method
