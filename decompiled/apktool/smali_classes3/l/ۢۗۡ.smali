.class public final Ll/ۢۗۡ;
.super Ll/ܳ᩻ۚ;
.source "51V0"


# instance fields
.field public final ֫:Ll/᩹ۗۡ;

.field public ۧ:Ljava/lang/String;

.field public final ܽ:Ll/ۘۗۡ;


# direct methods
.method public constructor <init>(Ll/ۘۗۡ;Ll/᩹ۗۡ;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Ll/ۢۗۡ;->ܽ:Ll/ۘۗۡ;

    .line 68
    iput-object p2, p0, Ll/ۢۗۡ;->֫:Ll/᩹ۗۡ;

    return-void
.end method

.method public static bridge synthetic ֫(IILjava/util/List;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۢۗۡ;->ܽ(IILjava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۢۗۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۢۗۡ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۗۡ;->ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static ֫(Ll/ۢۗۡ;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 92
    iget-object p0, p0, Ll/ۢۗۡ;->ܽ:Ll/ۘۗۡ;

    .line 52
    invoke-virtual {p0, p1, p1}, Ll/ۘۗۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩺֫ۚ;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۢۗۡ;->ۧ(Ll/᩺֫ۚ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;)Ljava/util/Set;
    .locals 1

    .line 366
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 367
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object p0

    .line 368
    :cond_0
    new-instance v0, Ll/᩺ۙۡ;

    invoke-direct {v0, p0}, Ll/᩺ۙۡ;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static synthetic ֫(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/ۚܽۚ;)Ll/۟ۗۡ;
    .locals 2

    .line 99
    iget-object v0, p0, Ll/ۢۗۡ;->ܽ:Ll/ۘۗۡ;

    invoke-interface {p2}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۘۗۡ;->ۧ(Ljava/lang/String;)Ll/ۖۗۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 101
    iget-object p0, p0, Ll/ۢۗۡ;->֫:Ll/᩹ۗۡ;

    invoke-virtual {v0, p1, p2, p0}, Ll/ۖۗۡ;->֫(Ll/ܽܳۚ;Ll/ۚܽۚ;Ll/᩹ۗۡ;)Ll/ۚܽۚ;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    new-instance p0, Ll/۟ۗۡ;

    invoke-direct {p0, p1, p2}, Ll/۟ۗۡ;-><init>(Ll/ܽܳۚ;Ll/ۚܽۚ;)V

    .line 0
    :goto_0
    check-cast p0, Ll/۟ۗۡ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/᩷֫ۚ;)Ll/ۨۗۡ;
    .locals 2

    .line 129
    invoke-interface {p2}, Ll/᩷֫ۚ;->getVisibility()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 130
    invoke-interface {p2}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "Ldalvik/annotation/InnerClass;"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "Ldalvik/annotation/Signature;"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 132
    :cond_0
    new-instance v0, Ll/᩷ۗۡ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩷ۗۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/᩷֫ۚ;)V

    return-object v0

    .line 134
    :cond_1
    new-instance v0, Ll/ܳۗۡ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܳۗۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/᩷֫ۚ;)V

    return-object v0

    .line 141
    :cond_2
    iget-object v0, p0, Ll/ۢۗۡ;->ܽ:Ll/ۘۗۡ;

    invoke-interface {p2}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۘۗۡ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 142
    new-instance v0, Ll/ᩳۗۡ;

    invoke-direct {v0, p0, p1, p2}, Ll/ᩳۗۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/᩷֫ۚ;)V

    return-object v0

    .line 144
    :cond_3
    :goto_0
    new-instance p0, Ll/ۨۗۡ;

    invoke-direct {p0, p1, p2}, Ll/ۨۗۡ;-><init>(Ll/ܽܳۚ;Ll/᩷֫ۚ;)V

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/ᩴܽۚ;)Ll/᩺ۗۡ;
    .locals 2

    .line 114
    iget-object v0, p0, Ll/ۢۗۡ;->ܽ:Ll/ۘۗۡ;

    invoke-interface {p2}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۘۗۡ;->ۧ(Ljava/lang/String;)Ll/ۖۗۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 116
    iget-object p0, p0, Ll/ۢۗۡ;->֫:Ll/᩹ۗۡ;

    invoke-virtual {v0, p1, p2, p0}, Ll/ۖۗۡ;->֫(Ll/ܽܳۚ;Ll/ᩴܽۚ;Ll/᩹ۗۡ;)Ll/ᩴܽۚ;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 121
    :cond_0
    new-instance p0, Ll/᩺ۗۡ;

    invoke-direct {p0, p1, p2}, Ll/᩺ۗۡ;-><init>(Ll/ܽܳۚ;Ll/ᩴܽۚ;)V

    .line 0
    :goto_0
    check-cast p0, Ll/᩺ۗۡ;

    return-object p0
.end method

.method public static ֫(Ll/ۢۗۡ;Ljava/util/List;Ljava/util/HashMap;II)V
    .locals 2

    const/4 v0, -0x1

    if-eq p3, v0, :cond_1

    .line 551
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 552
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺֫ۚ;

    invoke-static {p1}, Ll/ۢۗۡ;->ۧ(Ll/᩺֫ۚ;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 553
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 554
    invoke-static {p1}, Ll/ۢۗۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p1}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v0

    const/16 v1, 0x3b

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    iget-object p0, p0, Ll/ۢۗۡ;->ܽ:Ll/ۘۗۡ;

    .line 52
    invoke-virtual {p0, p1, p1}, Ll/ۘۗۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 560
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 562
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p3, Ll/ۧ۬ۡ;

    invoke-static {p0}, Ll/ۢۗۡ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p3, p4, p0}, Ll/ۧ۬ۡ;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ۢۗۡ;Ljava/util/List;Ljava/util/HashMap;Ll/ۖۗۡ;II)V
    .locals 0

    .line 535
    invoke-static {p4, p5, p1}, Ll/ۢۗۡ;->ᩳ(IILjava/util/List;)I

    move-result p0

    const/4 p4, -0x1

    if-ne p0, p4, :cond_0

    goto :goto_0

    .line 538
    :cond_0
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺֫ۚ;

    invoke-static {p1}, Ll/ۢۗۡ;->ۧ(Ll/᩺֫ۚ;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 541
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    goto :goto_0

    .line 543
    :cond_2
    invoke-virtual {p3, p1}, Ll/ۖۗۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_3

    .line 544
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 546
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    new-instance p1, Ll/ۧ۬ۡ;

    invoke-direct {p1, p5, p3}, Ll/ۧ۬ۡ;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ۢۗۡ;Ljava/util/List;Ljava/util/HashMap;Ll/ۖۗۡ;III)V
    .locals 7

    .line 480
    invoke-static {p4, p5, p1}, Ll/ۢۗۡ;->ᩳ(IILjava/util/List;)I

    move-result p0

    const/4 p5, -0x1

    if-ne p0, p5, :cond_0

    goto/16 :goto_4

    .line 483
    :cond_0
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺֫ۚ;

    invoke-static {v0}, Ll/ۢۗۡ;->ۧ(Ll/᩺֫ۚ;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_4

    .line 486
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_4

    .line 489
    :cond_2
    invoke-static {p4, p6, p1}, Ll/ۢۗۡ;->ᩳ(IILjava/util/List;)I

    move-result v1

    if-ne v1, p5, :cond_3

    goto/16 :goto_4

    .line 492
    :cond_3
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺֫ۚ;

    .line 493
    invoke-interface {v2}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v3

    sget-object v4, Ll/֨ۗ֡;->ۡܳ:Ll/֨ۗ֡;

    if-eq v3, v4, :cond_4

    goto/16 :goto_4

    .line 495
    :cond_4
    move-object v3, v2

    check-cast v3, Ll/ۧۧۚ;

    invoke-interface {v3}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v3

    check-cast v3, Ll/᩸ܽۚ;

    invoke-interface {v3}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "[Ljava/lang/Class;"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_4

    .line 498
    :cond_5
    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 572
    invoke-static {v1, v2, p1}, Ll/ۢۗۡ;->ᩳ(IILjava/util/List;)I

    move-result v2

    if-ne v2, p5, :cond_6

    goto :goto_0

    .line 575
    :cond_6
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺֫ۚ;

    .line 576
    instance-of v3, v2, Ll/ܰ֫ۚ;

    if-eqz v3, :cond_7

    .line 577
    check-cast v2, Ll/ܰ֫ۚ;

    invoke-interface {v2}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v2

    if-ge v2, p5, :cond_8

    :cond_7
    :goto_0
    const/4 v2, -0x1

    :cond_8
    if-ne v2, p5, :cond_9

    goto/16 :goto_4

    .line 501
    :cond_9
    new-array v3, v2, [Ljava/lang/String;

    :cond_a
    :goto_1
    add-int/lit8 v1, v1, 0x1

    if-ge v1, p4, :cond_12

    .line 503
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺֫ۚ;

    .line 504
    invoke-interface {v4}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v5

    sget-object v6, Ll/֨ۗ֡;->᩶֫:Ll/֨ۗ֡;

    if-eq v5, v6, :cond_b

    goto :goto_1

    .line 506
    :cond_b
    check-cast v4, Ll/ۛۧۚ;

    .line 507
    invoke-interface {v4}, Ll/᩻ۧۚ;->ܶ()I

    move-result v5

    if-eq v5, p6, :cond_c

    goto :goto_1

    .line 509
    :cond_c
    invoke-interface {v4}, Ll/ܳۧۚ;->ᩳ()I

    move-result v5

    .line 572
    invoke-static {v1, v5, p1}, Ll/ۢۗۡ;->ᩳ(IILjava/util/List;)I

    move-result v5

    if-ne v5, p5, :cond_d

    goto :goto_2

    .line 575
    :cond_d
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺֫ۚ;

    .line 576
    instance-of v6, v5, Ll/ܰ֫ۚ;

    if-eqz v6, :cond_e

    .line 577
    check-cast v5, Ll/ܰ֫ۚ;

    invoke-interface {v5}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v5

    if-ge v5, p5, :cond_f

    :cond_e
    :goto_2
    const/4 v5, -0x1

    :cond_f
    if-eq v5, p5, :cond_a

    if-lt v5, v2, :cond_10

    goto :goto_1

    .line 512
    :cond_10
    invoke-interface {v4}, Ll/֫ۧۚ;->֫()I

    move-result v4

    invoke-static {v1, v4, p1}, Ll/ۢۗۡ;->ܽ(IILjava/util/List;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_11

    goto :goto_1

    .line 515
    :cond_11
    aput-object v4, v3, v5

    goto :goto_1

    .line 517
    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 p5, 0x28

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p5, 0x0

    :goto_3
    if-ge p5, v2, :cond_14

    .line 518
    aget-object p6, v3, p5

    if-nez p6, :cond_13

    goto :goto_4

    .line 521
    :cond_13
    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p5, p5, 0x1

    goto :goto_3

    :cond_14
    const/16 p5, 0x29

    .line 523
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 524
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/ۖۗۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_15

    .line 525
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_15

    .line 527
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-instance p4, Ll/ۧ۬ۡ;

    invoke-direct {p4, p0, p1}, Ll/ۧ۬ۡ;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2, p3, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    :goto_4
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚܽۚ;)Z
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۢۗۡ;->ۧ(Ll/ۚܽۚ;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۧ(IILjava/util/List;)I
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۢۗۡ;->ᩳ(IILjava/util/List;)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۢۗۡ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/᩺֫ۚ;)Ljava/lang/String;
    .locals 1

    .line 662
    invoke-interface {p0}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v0

    iget v0, v0, Ll/֨ۗ֡;->۬:I

    if-nez v0, :cond_0

    .line 663
    check-cast p0, Ll/ۧۧۚ;

    invoke-interface {p0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object p0

    check-cast p0, Ll/ܶܽۚ;

    invoke-interface {p0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۢۗۡ;)Ll/ۘۗۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۗۡ;->ܽ:Ll/ۘۗۡ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۢۗۡ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۢۗۡ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ۧ(Ll/ۚܽۚ;)Z
    .locals 3

    .line 728
    invoke-interface {p0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ljava/lang/Class;"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 729
    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "forName"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 730
    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(IILjava/util/List;)Ljava/lang/String;
    .locals 4

    .line 611
    invoke-static {p0, p1, p2}, Ll/ۢۗۡ;->ᩳ(IILjava/util/List;)I

    move-result p0

    const/4 p1, 0x0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    goto/16 :goto_3

    .line 614
    :cond_0
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺֫ۚ;

    .line 615
    invoke-interface {v1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v2

    sget-object v3, Ll/֨ۗ֡;->᩻ۧ:Ll/֨ۗ֡;

    if-ne v2, v3, :cond_1

    .line 617
    check-cast v1, Ll/ۧۧۚ;

    invoke-interface {v1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object p0

    check-cast p0, Ll/᩸ܽۚ;

    invoke-interface {p0}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 618
    :cond_1
    invoke-interface {v1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v2

    sget-object v3, Ll/֨ۗ֡;->ۗܿ:Ll/֨ۗ֡;

    if-ne v2, v3, :cond_5

    add-int/lit8 p0, p0, -0x1

    :goto_0
    if-ltz p0, :cond_3

    .line 687
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺֫ۚ;

    .line 688
    invoke-interface {v1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget v1, v1, Ll/֨ۗ֡;->᩶:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_3
    const/4 p0, -0x1

    :goto_1
    if-eq p0, v0, :cond_f

    .line 624
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺֫ۚ;

    .line 625
    invoke-interface {v1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v2

    sget-object v3, Ll/֨ۗ֡;->֨ᩳ:Ll/֨ۗ֡;

    if-ne v2, v3, :cond_f

    .line 626
    check-cast v1, Ll/ۧܽۚ;

    .line 627
    invoke-interface {v1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v2

    check-cast v2, Ll/ۚܽۚ;

    .line 628
    invoke-static {v2}, Ll/ۢۗۡ;->ۧ(Ll/ۚܽۚ;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 629
    invoke-interface {v1}, Ll/ۤ֫ۚ;->ᩳ()I

    move-result v1

    .line 668
    invoke-static {p0, v1, p2}, Ll/ۢۗۡ;->ᩳ(IILjava/util/List;)I

    move-result p0

    if-eq p0, v0, :cond_4

    .line 670
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩺֫ۚ;

    invoke-static {p0}, Ll/ۢۗۡ;->ۧ(Ll/᩺֫ۚ;)Ljava/lang/String;

    move-result-object p1

    .line 629
    :cond_4
    invoke-static {p1}, Ll/ۢۗۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 633
    :cond_5
    invoke-interface {v1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object p0

    sget-object p2, Ll/֨ۗ֡;->֡᩻:Ll/֨ۗ֡;

    if-ne p0, p2, :cond_f

    .line 634
    check-cast v1, Ll/ۧۧۚ;

    invoke-interface {v1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object p0

    check-cast p0, Ll/ᩴܽۚ;

    .line 635
    invoke-interface {p0}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v1, "TYPE"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-interface {p0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p2

    const-string v1, "Ljava/lang/Class;"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_f

    .line 636
    invoke-interface {p0}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p2

    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string p2, "Ljava/lang/Short;"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_2

    :cond_6
    const/16 v0, 0x8

    goto/16 :goto_2

    :sswitch_1
    const-string p2, "Ljava/lang/Void;"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x7

    goto :goto_2

    :sswitch_2
    const-string p2, "Ljava/lang/Long;"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_2

    :cond_8
    const/4 v0, 0x6

    goto :goto_2

    :sswitch_3
    const-string p2, "Ljava/lang/Byte;"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_2

    :cond_9
    const/4 v0, 0x5

    goto :goto_2

    :sswitch_4
    const-string p2, "Ljava/lang/Float;"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_2

    :cond_a
    const/4 v0, 0x4

    goto :goto_2

    :sswitch_5
    const-string p2, "Ljava/lang/Character;"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_2

    :cond_b
    const/4 v0, 0x3

    goto :goto_2

    :sswitch_6
    const-string p2, "Ljava/lang/Double;"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_2

    :cond_c
    const/4 v0, 0x2

    goto :goto_2

    :sswitch_7
    const-string p2, "Ljava/lang/Boolean;"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_2

    :cond_d
    const/4 v0, 0x1

    goto :goto_2

    :sswitch_8
    const-string p2, "Ljava/lang/Integer;"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto :goto_2

    :cond_e
    const/4 v0, 0x0

    :goto_2
    packed-switch v0, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    const-string p0, "S"

    return-object p0

    :pswitch_1
    const-string p0, "V"

    return-object p0

    :pswitch_2
    const-string p0, "J"

    return-object p0

    :pswitch_3
    const-string p0, "F"

    return-object p0

    :pswitch_4
    const-string p0, "C"

    return-object p0

    :pswitch_5
    const-string p0, "D"

    return-object p0

    :pswitch_6
    const-string p0, "B"

    return-object p0

    :pswitch_7
    const-string p0, "I"

    return-object p0

    :cond_f
    :goto_3
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x53c18a03 -> :sswitch_8
        0x1d5e853 -> :sswitch_7
        0x305d474a -> :sswitch_6
        0x52c8a972 -> :sswitch_5
        0x5fa2c89f -> :sswitch_4
        0x6e3e38f3 -> :sswitch_3
        0x6ec681ff -> :sswitch_2
        0x6f5359e7 -> :sswitch_1
        0x7599aa7f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_4

    .line 586
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 588
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x5b

    const/16 v2, 0x2e

    const/16 v3, 0x2f

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v0

    const/16 v1, 0x3b

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 592
    :cond_1
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 594
    :cond_2
    invoke-virtual {p0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    :goto_0
    return-object p0

    .line 597
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "L"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ";"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(Ll/ۢۗۡ;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 92
    iget-object p0, p0, Ll/ۢۗۡ;->ܽ:Ll/ۘۗۡ;

    .line 52
    invoke-virtual {p0, p1, p1}, Ll/ۘۗۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(IILjava/util/List;)I
    .locals 2

    :cond_0
    add-int/lit8 p0, p0, -0x1

    if-ltz p0, :cond_1

    .line 676
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺֫ۚ;

    .line 677
    invoke-interface {v0}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget v1, v1, Ll/֨ۗ֡;->᩶:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_0

    instance-of v1, v0, Ll/֫ۧۚ;

    if-eqz v1, :cond_0

    .line 678
    check-cast v0, Ll/֫ۧۚ;

    invoke-interface {v0}, Ll/֫ۧۚ;->֫()I

    move-result v0

    if-ne v0, p1, :cond_0

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 605
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    const/4 v3, 0x1

    if-le v0, v3, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x4c

    if-eq v0, v4, :cond_2

    .line 0
    :cond_1
    invoke-static {v3, p0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v0

    const/16 v4, 0x3b

    if-ne v0, v4, :cond_3

    .line 606
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 607
    :cond_3
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܽܳۚ;)Ll/ܶܿۚ;
    .locals 1

    .line 126
    new-instance v0, Ll/ܶܿۚ;

    invoke-direct {v0, p1}, Ll/ܶܿۚ;-><init>(Ll/ܽܳۚ;)V

    return-object v0
.end method

.method public final ۜ(Ll/ܽܳۚ;)Ll/ᩳ᩻ۚ;
    .locals 1

    .line 406
    new-instance v0, Ll/۫ۙۡ;

    invoke-direct {v0, p0, p1}, Ll/۫ۙۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;)V

    return-object v0
.end method

.method public final ۧ()Ll/ᩳ᩻ۚ;
    .locals 1

    .line 87
    new-instance v0, Ll/۬ۙۡ;

    invoke-direct {v0, p0}, Ll/۬ۙۡ;-><init>(Ll/ۢۗۡ;)V

    return-object v0
.end method

.method public final ۧ(Ll/ܽܳۚ;)Ll/ᩳ᩻ۚ;
    .locals 1

    .line 128
    new-instance v0, Ll/ۤۙۡ;

    invoke-direct {v0, p0, p1}, Ll/ۤۙۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;)V

    return-object v0
.end method

.method public final ܽ(Ll/ܽܳۚ;)Ll/ᩳ᩻ۚ;
    .locals 1

    .line 74
    new-instance v0, Ll/ۛۙۡ;

    invoke-direct {v0, p0, p1}, Ll/ۛۙۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;)V

    return-object v0
.end method

.method public final ܿ(Ll/ܽܳۚ;)Ll/ᩳ᩻ۚ;
    .locals 1

    .line 113
    new-instance v0, Ll/ۗۙۡ;

    invoke-direct {v0, p0, p1}, Ll/ۗۙۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;)V

    return-object v0
.end method

.method public final ᩳ(Ll/ܽܳۚ;)Ll/ᩳ᩻ۚ;
    .locals 1

    .line 151
    new-instance v0, Ll/ۨۙۡ;

    invoke-direct {v0, p0, p1}, Ll/ۨۙۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;)V

    return-object v0
.end method

.method public final ᩷(Ll/ܽܳۚ;)Ll/ᩳ᩻ۚ;
    .locals 1

    .line 98
    new-instance v0, Ll/ۙۙۡ;

    invoke-direct {v0, p0, p1}, Ll/ۙۙۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;)V

    return-object v0
.end method
