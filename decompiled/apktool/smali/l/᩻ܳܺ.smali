.class public final Ll/᩻ܳܺ;
.super Ljava/lang/Object;
.source "FBGP"


# instance fields
.field public final ֫:Ll/ۢܿܺ;

.field public final ۜ:I

.field public ۧ:Z

.field public ܳ:I

.field public ܽ:Z

.field public final ܿ:I

.field public ᩳ:Ljava/util/ArrayList;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۢܿܺ;III)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Ll/᩻ܳܺ;->֫:Ll/ۢܿܺ;

    .line 99
    iput p3, p0, Ll/᩻ܳܺ;->ۜ:I

    .line 100
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    const/4 p1, -0x1

    .line 101
    iput p1, p0, Ll/᩻ܳܺ;->ܳ:I

    const/4 p1, 0x0

    .line 102
    iput-boolean p1, p0, Ll/᩻ܳܺ;->ܽ:Z

    .line 103
    iput-boolean p1, p0, Ll/᩻ܳܺ;->ۧ:Z

    .line 104
    iput p4, p0, Ll/᩻ܳܺ;->ܿ:I

    return-void
.end method

.method private ֫(Ll/ۙܿܺ;Ll/۬ܿܺ;)Ll/۬ܿܺ;
    .locals 1

    :goto_0
    if-eqz p2, :cond_1

    .line 579
    invoke-virtual {p2}, Ll/۬ܿܺ;->ۧ()Ll/ۨܿܺ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۨܿܺ;->ۧ(Ll/ۙܿܺ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 584
    iget-object p1, p0, Ll/᩻ܳܺ;->֫:Ll/ۢܿܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p2

    .line 590
    :cond_0
    invoke-static {p2}, Ll/۫ܿܺ;->֫(Ll/۬ܿܺ;)Ll/۬ܿܺ;

    move-result-object p2

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method public static ֫(Ljava/util/HashSet;Ll/᩸ۡܺ;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    .line 225
    :cond_0
    invoke-virtual {p1}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v0

    .line 226
    invoke-virtual {v0}, Ll/ᩴۡܺ;->getName()Ll/۬ܺܺ;

    move-result-object v1

    .line 227
    invoke-virtual {v0}, Ll/ᩴۡܺ;->getSignature()Ll/۬ܺܺ;

    move-result-object v0

    .line 228
    invoke-virtual {p1}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object p1

    .line 230
    sget-object v2, Ll/۟ܺܺ;->ᩴ֫:Ll/۟ܺܺ;

    if-eq p1, v2, :cond_1

    .line 231
    invoke-static {p1}, Ll/۫ܺܺ;->֫(Ll/۟ܺܺ;)Ll/۫ܺܺ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 235
    :cond_1
    sget-object p1, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    invoke-static {p1}, Ll/۫ܺܺ;->֫(Ll/۟ܺܺ;)Ll/۫ܺܺ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_0
    if-eqz v1, :cond_2

    .line 239
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz v0, :cond_3

    .line 243
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method private ֫([Ll/۬ܿܺ;)Z
    .locals 8

    .line 465
    iget v0, p0, Ll/᩻ܳܺ;->ܳ:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    const/4 v1, 0x0

    .line 520
    :goto_0
    iget-object v2, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 528
    iget v3, p0, Ll/᩻ܳܺ;->ܳ:I

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_3

    .line 531
    iget-object v5, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙܿܺ;

    .line 532
    aget-object v6, p1, v4

    .line 533
    invoke-direct {p0, v5, v6}, Ll/᩻ܳܺ;->֫(Ll/ۙܿܺ;Ll/۬ܿܺ;)Ll/۬ܿܺ;

    move-result-object v7

    if-nez v7, :cond_1

    .line 540
    invoke-direct {p0, v5}, Ll/᩻ܳܺ;->ۧ(Ll/ۙܿܺ;)Ll/۬ܿܺ;

    move-result-object v6

    .line 541
    invoke-virtual {v6}, Ll/۬ܿܺ;->ۧ()Ll/ۨܿܺ;

    move-result-object v6

    invoke-virtual {v6, v5}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;)Ljava/util/BitSet;

    move-result-object v6

    .line 542
    invoke-virtual {v5, v6}, Ll/ۙܿܺ;->ᩳ(Ljava/util/BitSet;)I

    move-result v5

    if-le v5, v3, :cond_2

    move v3, v5

    goto :goto_2

    :cond_1
    if-ne v6, v7, :cond_2

    goto :goto_3

    .line 550
    :cond_2
    :goto_2
    aput-object v7, p1, v4

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    if-lt v0, v3, :cond_4

    .line 503
    iput v0, p0, Ll/᩻ܳܺ;->ܳ:I

    return v1

    :cond_4
    sub-int v0, v3, v0

    .line 480
    iget-object v1, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_6

    .line 490
    iget-object v4, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙܿܺ;

    .line 491
    instance-of v5, v4, Ll/ܶܿܺ;

    if-nez v5, :cond_5

    .line 496
    iget-object v5, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ll/ۙܿܺ;->ۧ(I)Ll/ۙܿܺ;

    move-result-object v4

    invoke-virtual {v5, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v1, 0x1

    move v0, v3

    goto :goto_0
.end method

.method private ۧ(Ll/ۙܿܺ;)Ll/۬ܿܺ;
    .locals 3

    .line 604
    invoke-virtual {p1}, Ll/ۙܿܺ;->ܳ()Ll/ۙܿܺ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ll/᩻ܳܺ;->֫(Ll/ۙܿܺ;Ll/۬ܿܺ;)Ll/۬ܿܺ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 606
    :cond_0
    new-instance v0, Ll/֡ۧܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No expanded opcode for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 60
    invoke-direct {v0, p1, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 606
    throw v0
.end method

.method private ܳ()V
    .locals 8

    .line 933
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 934
    iget v1, p0, Ll/᩻ܳܺ;->ۜ:I

    iget v2, p0, Ll/᩻ܳܺ;->ܳ:I

    add-int/2addr v1, v2

    iget v2, p0, Ll/᩻ܳܺ;->᩻:I

    add-int/2addr v1, v2

    .line 935
    iget v2, p0, Ll/᩻ܳܺ;->ܿ:I

    sub-int v2, v1, v2

    .line 937
    new-instance v3, Ll/ܽۖܺ;

    invoke-direct {v3, v1}, Ll/ܽۖܺ;-><init>(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x1

    if-ge v5, v1, :cond_1

    if-lt v5, v2, :cond_0

    add-int/lit8 v7, v5, 0x1

    .line 940
    invoke-virtual {v3, v5, v7, v6}, Ll/ܽۖܺ;->֫(III)V

    goto :goto_1

    .line 942
    :cond_0
    invoke-virtual {v3, v5, v5, v6}, Ll/ܽۖܺ;->֫(III)V

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_2
    if-ge v4, v0, :cond_3

    .line 947
    iget-object v1, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙܿܺ;

    .line 950
    instance-of v2, v1, Ll/ܶܿܺ;

    if-nez v2, :cond_2

    .line 951
    iget-object v2, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ll/ۙܿܺ;->֫(Ll/ܽۖܺ;)Ll/ۙܿܺ;

    move-result-object v1

    invoke-virtual {v2, v4, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 911
    :cond_3
    iget v0, p0, Ll/᩻ܳܺ;->᩻:I

    add-int/2addr v0, v6

    iput v0, p0, Ll/᩻ܳܺ;->᩻:I

    return-void
.end method

.method private ᩻()V
    .locals 5

    .line 920
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x1

    if-ge v1, v0, :cond_1

    .line 923
    iget-object v3, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙܿܺ;

    .line 926
    instance-of v4, v3, Ll/ܶܿܺ;

    if-nez v4, :cond_0

    .line 927
    iget-object v4, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ll/ۙܿܺ;->ۧ(I)Ll/ۙܿܺ;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 916
    :cond_1
    iget v0, p0, Ll/᩻ܳܺ;->ܳ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/᩻ܳܺ;->ܳ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۗܿܺ;
    .locals 13

    .line 417
    iget v0, p0, Ll/᩻ܳܺ;->ܳ:I

    if-gez v0, :cond_1e

    .line 441
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 442
    new-array v1, v0, [Ll/۬ܿܺ;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 445
    iget-object v3, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙܿܺ;

    .line 446
    invoke-virtual {v3}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 422
    :cond_0
    invoke-direct {p0, v1}, Ll/᩻ܳܺ;->֫([Ll/۬ܿܺ;)Z

    .line 423
    iget-object v0, p0, Ll/᩻ܳܺ;->֫:Ll/ۢܿܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    :cond_1
    iget v0, p0, Ll/᩻ܳܺ;->ܳ:I

    iget v2, p0, Ll/᩻ܳܺ;->ۜ:I

    add-int/2addr v0, v2

    iget v3, p0, Ll/᩻ܳܺ;->᩻:I

    add-int/2addr v0, v3

    .line 859
    iget v3, p0, Ll/᩻ܳܺ;->ܿ:I

    sub-int/2addr v0, v3

    .line 862
    iget-object v4, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۙܿܺ;

    .line 863
    invoke-virtual {v9}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v9

    const/4 v10, 0x0

    .line 864
    :goto_1
    invoke-virtual {v9}, Ll/ܿᩴܺ;->size()I

    move-result v11

    if-ge v10, v11, :cond_2

    .line 865
    invoke-virtual {v9, v10}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v11

    .line 866
    invoke-virtual {v11}, Ll/᩸ۡܺ;->ۚ()Z

    move-result v12

    if-eqz v12, :cond_7

    .line 867
    invoke-virtual {v11}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v12

    if-lt v12, v0, :cond_3

    const/4 v12, 0x1

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    .line 868
    :goto_2
    invoke-virtual {v11}, Ll/᩸ۡܺ;->֨()Z

    move-result v11

    if-eqz v11, :cond_5

    if-eqz v12, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_5
    if-eqz v12, :cond_6

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    add-int/lit8 v7, v7, 0x1

    :cond_7
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_8
    if-le v5, v6, :cond_9

    if-le v7, v8, :cond_9

    .line 887
    invoke-direct {p0}, Ll/᩻ܳܺ;->᩻()V

    goto :goto_4

    :cond_9
    if-le v5, v6, :cond_a

    .line 889
    invoke-direct {p0}, Ll/᩻ܳܺ;->ܳ()V

    goto :goto_4

    :cond_a
    if-le v7, v8, :cond_c

    .line 891
    invoke-direct {p0}, Ll/᩻ܳܺ;->᩻()V

    if-eqz v3, :cond_b

    if-le v6, v5, :cond_b

    .line 897
    invoke-direct {p0}, Ll/᩻ܳܺ;->ܳ()V

    .line 903
    :cond_b
    :goto_4
    invoke-direct {p0, v1}, Ll/᩻ܳܺ;->֫([Ll/۬ܿܺ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 634
    :cond_c
    iget v0, p0, Ll/᩻ܳܺ;->ܳ:I

    if-nez v0, :cond_e

    .line 642
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v0, :cond_17

    .line 645
    iget-object v4, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙܿܺ;

    .line 646
    invoke-virtual {v4}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v5

    .line 647
    aget-object v6, v1, v3

    if-eq v5, v6, :cond_d

    .line 650
    iget-object v5, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ll/ۙܿܺ;->֫(Ll/۬ܿܺ;)Ll/ۙܿܺ;

    move-result-object v4

    invoke-virtual {v5, v3, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 674
    :cond_e
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 675
    new-instance v3, Ljava/util/ArrayList;

    mul-int/lit8 v4, v0, 0x2

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 677
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v0, :cond_16

    .line 680
    iget-object v6, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙܿܺ;

    .line 681
    invoke-virtual {v6}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v7

    .line 682
    aget-object v8, v1, v5

    if-eqz v8, :cond_f

    const/4 v9, 0x0

    move-object v11, v9

    goto :goto_7

    .line 692
    :cond_f
    invoke-direct {p0, v6}, Ll/᩻ܳܺ;->ۧ(Ll/ۙܿܺ;)Ll/۬ܿܺ;

    move-result-object v8

    .line 694
    invoke-virtual {v8}, Ll/۬ܿܺ;->ۧ()Ll/ۨܿܺ;

    move-result-object v9

    invoke-virtual {v9, v6}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;)Ljava/util/BitSet;

    move-result-object v9

    .line 695
    invoke-virtual {v6, v9}, Ll/ۙܿܺ;->֫(Ljava/util/BitSet;)Ll/ۛܿܺ;

    move-result-object v10

    .line 696
    invoke-virtual {v6, v9}, Ll/ۙܿܺ;->ۧ(Ljava/util/BitSet;)Ll/ᩴܳܺ;

    move-result-object v11

    .line 699
    invoke-virtual {v6, v9}, Ll/ۙܿܺ;->ܽ(Ljava/util/BitSet;)Ll/ۙܿܺ;

    move-result-object v6

    move-object v9, v10

    .line 702
    :goto_7
    instance-of v10, v6, Ll/ܶܿܺ;

    if-eqz v10, :cond_10

    .line 706
    move-object v10, v6

    check-cast v10, Ll/ܶܿܺ;

    invoke-virtual {v10}, Ll/ܶܿܺ;->ۖ()Z

    move-result v12

    if-eqz v12, :cond_10

    .line 707
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_10
    if-eqz v9, :cond_11

    .line 713
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 717
    :cond_11
    instance-of v9, v6, Ll/۠ܳܺ;

    if-nez v9, :cond_13

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-lez v9, :cond_13

    .line 718
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_12

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܶܿܺ;

    .line 719
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 721
    :cond_12
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    :cond_13
    if-eq v8, v7, :cond_14

    .line 725
    invoke-virtual {v6, v8}, Ll/ۙܿܺ;->֫(Ll/۬ܿܺ;)Ll/ۙܿܺ;

    move-result-object v6

    .line 727
    :cond_14
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v11, :cond_15

    .line 730
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    :goto_9
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 658
    :cond_16
    iput-object v3, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    .line 758
    :cond_17
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_a
    if-ge v1, v0, :cond_18

    .line 761
    iget-object v4, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙܿܺ;

    .line 762
    invoke-virtual {v4, v3}, Ll/ۙܿܺ;->֫(I)V

    .line 763
    invoke-virtual {v4}, Ll/ۙܿܺ;->ۧ()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    .line 779
    :cond_18
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_b
    if-ge v1, v0, :cond_1d

    .line 783
    iget-object v4, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙܿܺ;

    .line 784
    instance-of v5, v4, Ll/ۚܳܺ;

    if-nez v5, :cond_19

    goto :goto_d

    .line 789
    :cond_19
    invoke-virtual {v4}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v5

    .line 790
    move-object v6, v4

    check-cast v6, Ll/ۚܳܺ;

    .line 792
    invoke-virtual {v5}, Ll/۬ܿܺ;->ۧ()Ll/ۨܿܺ;

    move-result-object v7

    invoke-virtual {v7, v6}, Ll/ۨܿܺ;->֫(Ll/ۚܳܺ;)Z

    move-result v7

    if-eqz v7, :cond_1a

    goto :goto_d

    .line 796
    :cond_1a
    invoke-virtual {v5}, Ll/۬ܿܺ;->֫()I

    move-result v3

    const/16 v7, 0x28

    if-ne v3, v7, :cond_1c

    .line 798
    invoke-direct {p0, v4, v5}, Ll/᩻ܳܺ;->֫(Ll/ۙܿܺ;Ll/۬ܿܺ;)Ll/۬ܿܺ;

    move-result-object v3

    if-eqz v3, :cond_1b

    .line 807
    iget-object v5, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ll/ۙܿܺ;->֫(Ll/۬ܿܺ;)Ll/ۙܿܺ;

    move-result-object v3

    invoke-virtual {v5, v1, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    .line 805
    :cond_1b
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "method too long"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 828
    :cond_1c
    :try_start_0
    iget-object v3, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶܿܺ;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 837
    new-instance v5, Ll/ۚܳܺ;

    sget-object v7, Ll/۫ܿܺ;->᩵֫:Ll/۬ܿܺ;

    .line 838
    invoke-virtual {v6}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v8

    sget-object v9, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    .line 839
    invoke-virtual {v6}, Ll/ۚܳܺ;->ۖ()Ll/ܶܿܺ;

    move-result-object v10

    invoke-direct {v5, v7, v8, v9, v10}, Ll/ۚܳܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܶܿܺ;)V

    .line 840
    iget-object v7, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v7, v1, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 841
    iget-object v5, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    .line 81
    invoke-virtual {v6}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v7

    invoke-virtual {v7}, Ll/۬ܿܺ;->ܳ()Ll/۬ܿܺ;

    move-result-object v7

    .line 83
    new-instance v8, Ll/ۚܳܺ;

    invoke-virtual {v6}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v9

    invoke-virtual {v6}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v6

    invoke-direct {v8, v7, v9, v6, v3}, Ll/ۚܳܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܶܿܺ;)V

    .line 841
    invoke-virtual {v5, v1, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    move v1, v4

    :goto_c
    const/4 v3, 0x1

    :goto_d
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_b

    .line 835
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unpaired TargetInsn"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 831
    :catch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unpaired TargetInsn (dangling)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    if-nez v3, :cond_17

    .line 429
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    iget v1, p0, Ll/᩻ܳܺ;->ܳ:I

    add-int/2addr v1, v2

    iget v2, p0, Ll/᩻ܳܺ;->᩻:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ll/ۗܿܺ;->֫(Ljava/util/ArrayList;I)Ll/ۗܿܺ;

    move-result-object v0

    return-object v0

    .line 418
    :cond_1e
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "already processed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)Ll/ۙܿܺ;
    .locals 1

    .line 269
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙܿܺ;

    return-object p1
.end method

.method public final ֫(Ll/ۙܿܺ;)V
    .locals 4

    .line 253
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    iget-boolean v0, p0, Ll/᩻ܳܺ;->ܽ:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 284
    invoke-virtual {p1}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    .line 285
    invoke-virtual {v0}, Ll/ۤۡܺ;->֫()I

    move-result v0

    if-ltz v0, :cond_0

    .line 286
    iput-boolean v1, p0, Ll/᩻ܳܺ;->ܽ:Z

    .line 290
    :cond_0
    iget-boolean v0, p0, Ll/᩻ܳܺ;->ۧ:Z

    if-nez v0, :cond_3

    .line 136
    instance-of v0, p1, Ll/ۧܳܺ;

    if-eqz v0, :cond_2

    .line 137
    check-cast p1, Ll/ۧܳܺ;

    invoke-virtual {p1}, Ll/ۧܳܺ;->ۖ()Ll/ۙۡܺ;

    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ll/ۙۡܺ;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 140
    invoke-virtual {p1, v2}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 164
    invoke-virtual {v3}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ᩴۡܺ;->getName()Ll/۬ܺܺ;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 144
    :cond_2
    instance-of v0, p1, Ll/ܽܳܺ;

    if-eqz v0, :cond_3

    .line 145
    check-cast p1, Ll/ܽܳܺ;

    invoke-virtual {p1}, Ll/ܽܳܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 164
    invoke-virtual {p1}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴۡܺ;->getName()Ll/۬ܺܺ;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 292
    :goto_1
    iput-boolean v1, p0, Ll/᩻ܳܺ;->ۧ:Z

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ܶܿܺ;)V
    .locals 6

    .line 309
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    .line 314
    :try_start_0
    iget-object v1, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚܳܺ;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 327
    iget-object v2, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    .line 81
    invoke-virtual {v1}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۬ܿܺ;->ܳ()Ll/۬ܿܺ;

    move-result-object v3

    .line 83
    new-instance v4, Ll/ۚܳܺ;

    invoke-virtual {v1}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v5

    invoke-virtual {v1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-direct {v4, v3, v5, v1, p1}, Ll/ۚܳܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܶܿܺ;)V

    .line 327
    invoke-virtual {v2, v0, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 320
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "non-reversible instruction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 317
    :catch_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "too few instructions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩹ܿܺ;)V
    .locals 5

    .line 338
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙܿܺ;

    .line 339
    instance-of v2, v1, Ll/᩸ܿܺ;

    if-eqz v2, :cond_2

    .line 340
    check-cast v1, Ll/᩸ܿܺ;

    .line 356
    invoke-virtual {v1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object v2

    .line 357
    invoke-interface {p1, v2}, Ll/᩹ܿܺ;->֫(Ll/ܰۡܺ;)I

    move-result v3

    if-ltz v3, :cond_1

    .line 360
    invoke-virtual {v1, v3}, Ll/᩸ܿܺ;->ᩳ(I)V

    .line 363
    :cond_1
    instance-of v3, v2, Ll/ܶܺܺ;

    if-eqz v3, :cond_0

    .line 364
    check-cast v2, Ll/ܶܺܺ;

    .line 365
    invoke-virtual {v2}, Ll/ܶܺܺ;->ܳ()Ll/۫ܺܺ;

    move-result-object v2

    .line 366
    invoke-interface {p1, v2}, Ll/᩹ܿܺ;->֫(Ll/ܰۡܺ;)I

    move-result v2

    if-ltz v2, :cond_0

    .line 369
    invoke-virtual {v1, v2}, Ll/᩸ܿܺ;->ܽ(I)V

    goto :goto_0

    .line 341
    :cond_2
    instance-of v2, v1, Ll/ᩳܳܺ;

    if-eqz v2, :cond_0

    .line 342
    check-cast v1, Ll/ᩳܳܺ;

    const/4 v2, 0x0

    .line 382
    :goto_1
    invoke-virtual {v1}, Ll/ᩳܳܺ;->ۖ()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 383
    invoke-virtual {v1, v2}, Ll/ᩳܳܺ;->ܽ(I)Ll/ܰۡܺ;

    move-result-object v3

    .line 384
    invoke-interface {p1, v3}, Ll/᩹ܿܺ;->֫(Ll/ܰۡܺ;)I

    move-result v4

    .line 385
    invoke-virtual {v1, v2, v4}, Ll/ᩳܳܺ;->֫(II)V

    .line 387
    instance-of v4, v3, Ll/ܶܺܺ;

    if-eqz v4, :cond_3

    .line 388
    check-cast v3, Ll/ܶܺܺ;

    .line 389
    invoke-virtual {v3}, Ll/ܶܺܺ;->ܳ()Ll/۫ܺܺ;

    move-result-object v3

    .line 390
    invoke-interface {p1, v3}, Ll/᩹ܿܺ;->֫(Ll/ܰۡܺ;)I

    move-result v3

    .line 391
    invoke-virtual {v1, v3}, Ll/ᩳܳܺ;->ܿ(I)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final ۧ()Ljava/util/HashSet;
    .locals 6

    .line 174
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 176
    iget-object v1, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙܿܺ;

    .line 192
    instance-of v3, v2, Ll/᩸ܿܺ;

    if-eqz v3, :cond_1

    .line 193
    check-cast v2, Ll/᩸ܿܺ;

    invoke-virtual {v2}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object v2

    .line 194
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 195
    :cond_1
    instance-of v3, v2, Ll/ᩳܳܺ;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 196
    check-cast v2, Ll/ᩳܳܺ;

    .line 197
    :goto_1
    invoke-virtual {v2}, Ll/ᩳܳܺ;->ۖ()I

    move-result v3

    if-ge v4, v3, :cond_0

    .line 198
    invoke-virtual {v2, v4}, Ll/ᩳܳܺ;->ܽ(I)Ll/ܰۡܺ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 200
    :cond_2
    instance-of v3, v2, Ll/ۧܳܺ;

    if-eqz v3, :cond_3

    .line 201
    check-cast v2, Ll/ۧܳܺ;

    invoke-virtual {v2}, Ll/ۧܳܺ;->ۖ()Ll/ۙۡܺ;

    move-result-object v2

    .line 202
    invoke-virtual {v2}, Ll/ۙۡܺ;->size()I

    move-result v3

    :goto_2
    if-ge v4, v3, :cond_0

    .line 204
    invoke-virtual {v2, v4}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v5

    invoke-static {v0, v5}, Ll/᩻ܳܺ;->֫(Ljava/util/HashSet;Ll/᩸ۡܺ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 206
    :cond_3
    instance-of v3, v2, Ll/ܽܳܺ;

    if-eqz v3, :cond_0

    .line 207
    check-cast v2, Ll/ܽܳܺ;

    invoke-virtual {v2}, Ll/ܽܳܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v2

    .line 208
    invoke-static {v0, v2}, Ll/᩻ܳܺ;->֫(Ljava/util/HashSet;Ll/᩸ۡܺ;)V

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 124
    iget-boolean v0, p0, Ll/᩻ܳܺ;->ۧ:Z

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 273
    iget-object v0, p0, Ll/᩻ܳܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Ll/᩻ܳܺ;->ܽ:Z

    return v0
.end method
