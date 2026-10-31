.class public Ll/ۖܳܺ;
.super Ljava/lang/Object;
.source "UBEJ"

# interfaces
.implements Ll/ۡۡܺ;


# instance fields
.field public ֫:Ll/ܽۡܺ;

.field public ۧ:Ll/ܶܿܺ;

.field public final ܽ:Ll/ܳܳܺ;

.field public final synthetic ᩳ:Ll/ۘܳܺ;


# direct methods
.method public constructor <init>(Ll/ۘܳܺ;Ll/ܳܳܺ;)V
    .locals 0

    .line 536
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܳܺ;->ᩳ:Ll/ۘܳܺ;

    .line 537
    iput-object p2, p0, Ll/ۖܳܺ;->ܽ:Ll/ܳܳܺ;

    return-void
.end method

.method private ֫()Ll/᩸ۡܺ;
    .locals 3

    .line 703
    iget-object v0, p0, Ll/ۖܳܺ;->֫:Ll/ܽۡܺ;

    invoke-virtual {v0}, Ll/ܽۡܺ;->ܳ()I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    .line 709
    :cond_0
    iget-object v1, p0, Ll/ۖܳܺ;->ᩳ:Ll/ۘܳܺ;

    invoke-static {v1}, Ll/ۘܳܺ;->ۧ(Ll/ۘܳܺ;)Ll/۬ۡܺ;

    move-result-object v1

    .line 710
    invoke-virtual {v1}, Ll/۬ۡܺ;->֫()Ll/ܿۡܺ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܿۡܺ;->ܿ(I)Ll/ܽۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۡܺ;->ᩳ()Ll/ۖۡܺ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/ܺۡܺ;

    move-result-object v0

    .line 712
    invoke-virtual {v0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗۡܺ;->ᩳ()I

    move-result v1

    const/16 v2, 0x38

    if-eq v1, v2, :cond_1

    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 715
    :cond_1
    invoke-virtual {v0}, Ll/ܺۡܺ;->ܺ()Ll/᩸ۡܺ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public ֫(Ll/֨ۡܺ;)V
    .locals 5

    .line 557
    invoke-virtual {p1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    .line 558
    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v1

    const/16 v2, 0x36

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 565
    :cond_0
    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v1

    const/16 v2, 0x38

    if-ne v1, v2, :cond_1

    goto :goto_0

    .line 570
    :cond_1
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v1

    .line 571
    invoke-static {p1}, Ll/ۢܳܺ;->֫(Ll/ܺۡܺ;)Ll/۬ܿܺ;

    move-result-object v2

    .line 574
    invoke-virtual {v0}, Ll/ۗۡܺ;->ۧ()I

    move-result v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_5

    const/4 v4, 0x2

    if-eq v0, v4, :cond_5

    const/4 v4, 0x3

    if-eq v0, v4, :cond_4

    const/4 v4, 0x4

    if-eq v0, v4, :cond_3

    const/4 v3, 0x6

    if-ne v0, v3, :cond_2

    goto :goto_1

    .line 596
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 590
    :cond_3
    iget-object v0, p0, Ll/ۖܳܺ;->֫:Ll/ܽۡܺ;

    invoke-virtual {v0}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/᩷ᩴܺ;->get(I)I

    move-result v0

    .line 591
    new-instance v3, Ll/ۚܳܺ;

    invoke-static {p1}, Ll/ۘܳܺ;->֫(Ll/ܺۡܺ;)Ll/᩶ۡܺ;

    move-result-object p1

    iget-object v4, p0, Ll/ۖܳܺ;->ᩳ:Ll/ۘܳܺ;

    invoke-static {v4}, Ll/ۘܳܺ;->֫(Ll/ۘܳܺ;)Ll/᩵ܿܺ;

    move-result-object v4

    .line 592
    invoke-virtual {v4, v0}, Ll/᩵ܿܺ;->֫(I)Ll/ܶܿܺ;

    move-result-object v0

    invoke-direct {v3, v2, v1, p1, v0}, Ll/ۚܳܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܶܿܺ;)V

    goto :goto_2

    :cond_4
    :goto_0
    return-void

    .line 578
    :cond_5
    :goto_1
    new-instance v3, Ll/ᩴܳܺ;

    invoke-static {p1}, Ll/ۘܳܺ;->֫(Ll/ܺۡܺ;)Ll/᩶ۡܺ;

    move-result-object p1

    .line 47
    invoke-direct {v3, v2, v1, p1}, Ll/ۙܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    .line 600
    :goto_2
    invoke-virtual {p0, v3}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    return-void
.end method

.method public final ֫(Ll/ۘۡܺ;)V
    .locals 6

    .line 724
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    .line 725
    invoke-static {p1}, Ll/ۢܳܺ;->֫(Ll/ܺۡܺ;)Ll/۬ܿܺ;

    move-result-object v1

    .line 726
    invoke-virtual {p1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v2

    .line 728
    invoke-virtual {v2}, Ll/ۗۡܺ;->ۧ()I

    move-result v3

    const/4 v4, 0x6

    if-ne v3, v4, :cond_1

    .line 730
    invoke-virtual {v2}, Ll/ۗۡܺ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 734
    iget-object v2, p0, Ll/ۖܳܺ;->ۧ:Ll/ܶܿܺ;

    invoke-virtual {p0, v2}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    .line 736
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object v2

    .line 738
    invoke-virtual {p1}, Ll/ۘۡܺ;->᩵()Ll/᩹ܺܺ;

    move-result-object v3

    .line 739
    invoke-virtual {p1}, Ll/ۘۡܺ;->ᩴ()Ll/ۙܺܺ;

    move-result-object p1

    const/4 v4, 0x2

    new-array v4, v4, [Ll/ܰۡܺ;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object p1, v4, v3

    .line 741
    new-instance p1, Ll/ᩳܳܺ;

    invoke-direct {p1, v1, v0, v2, v4}, Ll/ᩳܳܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;[Ll/ܰۡܺ;)V

    .line 743
    invoke-virtual {p0, p1}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    return-void

    .line 731
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Expected call-like operation"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 729
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected BRANCH_THROW got "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/ۗۡܺ;->ۧ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۙܿܺ;)V
    .locals 1

    .line 886
    iget-object v0, p0, Ll/ۖܳܺ;->ܽ:Ll/ܳܳܺ;

    invoke-virtual {v0, p1}, Ll/ܳܳܺ;->֫(Ll/ۙܿܺ;)V

    return-void
.end method

.method public ֫(Ll/ۚۡܺ;)V
    .locals 5

    .line 608
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    .line 609
    invoke-static {p1}, Ll/ۢܳܺ;->֫(Ll/ܺۡܺ;)Ll/۬ܿܺ;

    move-result-object v1

    .line 610
    invoke-virtual {p1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v2

    .line 611
    invoke-virtual {v2}, Ll/ۗۡܺ;->ᩳ()I

    move-result v3

    .line 614
    invoke-virtual {v2}, Ll/ۗۡܺ;->ۧ()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_2

    const/4 v2, 0x3

    if-ne v3, v2, :cond_1

    .line 619
    iget-object v2, p0, Ll/ۖܳܺ;->ᩳ:Ll/ۘܳܺ;

    invoke-static {v2}, Ll/ۘܳܺ;->ᩳ(Ll/ۘܳܺ;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 625
    invoke-virtual {p1}, Ll/ܺۡܺ;->ܺ()Ll/᩸ۡܺ;

    move-result-object v3

    .line 627
    invoke-virtual {p1}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {p1}, Ll/֡ܺܺ;->ᩴ()I

    move-result p1

    .line 628
    invoke-static {v2}, Ll/ۘܳܺ;->ܿ(Ll/ۘܳܺ;)I

    move-result v4

    invoke-static {v2}, Ll/ۘܳܺ;->ܽ(Ll/ۘܳܺ;)I

    move-result v2

    sub-int/2addr v4, v2

    add-int/2addr v4, p1

    .line 630
    invoke-virtual {v3}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object p1

    .line 629
    invoke-static {v4, p1}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    .line 631
    new-instance v2, Ll/ᩴܳܺ;

    .line 632
    invoke-static {v3, p1}, Ll/᩶ۡܺ;->֫(Ll/᩸ۡܺ;Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object p1

    .line 47
    invoke-direct {v2, v1, v0, p1}, Ll/ۙܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    .line 633
    invoke-virtual {p0, v2}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    :cond_0
    return-void

    .line 637
    :cond_1
    invoke-static {p1}, Ll/ۘܳܺ;->֫(Ll/ܺۡܺ;)Ll/᩶ۡܺ;

    move-result-object v2

    .line 638
    new-instance v3, Ll/᩸ܿܺ;

    invoke-virtual {p1}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object p1

    invoke-direct {v3, v1, v0, v2, p1}, Ll/᩸ܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 639
    invoke-virtual {p0, v3}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    return-void

    .line 615
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/ۛۡܺ;)V
    .locals 10

    .line 648
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    .line 649
    invoke-virtual {p1}, Ll/ۛۡܺ;->ᩴ()Ll/᩷ᩴܺ;

    move-result-object v1

    .line 650
    iget-object v2, p0, Ll/ۖܳܺ;->֫:Ll/ܽۡܺ;

    invoke-virtual {v2}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object v2

    .line 651
    invoke-virtual {v1}, Ll/᩷ᩴܺ;->size()I

    move-result v3

    .line 652
    invoke-virtual {v2}, Ll/᩷ᩴܺ;->size()I

    move-result v4

    .line 653
    iget-object v5, p0, Ll/ۖܳܺ;->֫:Ll/ܽۡܺ;

    invoke-virtual {v5}, Ll/ܽۡܺ;->ܳ()I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v4, v6

    if-ne v3, v4, :cond_2

    .line 664
    invoke-virtual {v2, v3}, Ll/᩷ᩴܺ;->get(I)I

    move-result v4

    if-ne v5, v4, :cond_2

    .line 668
    new-array v4, v3, [Ll/ܶܿܺ;

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_0

    .line 671
    invoke-virtual {v2, v7}, Ll/᩷ᩴܺ;->get(I)I

    move-result v8

    .line 672
    iget-object v9, p0, Ll/ۖܳܺ;->ᩳ:Ll/ۘܳܺ;

    invoke-static {v9}, Ll/ۘܳܺ;->֫(Ll/ۘܳܺ;)Ll/᩵ܿܺ;

    move-result-object v9

    invoke-virtual {v9, v8}, Ll/᩵ܿܺ;->֫(I)Ll/ܶܿܺ;

    move-result-object v8

    aput-object v8, v4, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 675
    :cond_0
    new-instance v2, Ll/ܶܿܺ;

    .line 42
    invoke-direct {v2, v0, v5}, Ll/ܶܿܺ;-><init>(Ll/ۤۡܺ;Z)V

    .line 677
    new-instance v3, Ll/ܶܿܺ;

    iget-object v5, p0, Ll/ۖܳܺ;->ۧ:Ll/ܶܿܺ;

    .line 678
    invoke-virtual {v5}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v5

    invoke-direct {v3, v5, v6}, Ll/ܶܿܺ;-><init>(Ll/ۤۡܺ;Z)V

    .line 679
    new-instance v5, Ll/֡ܳܺ;

    invoke-direct {v5, v0, v3, v1, v4}, Ll/֡ܳܺ;-><init>(Ll/ۤۡܺ;Ll/ܶܿܺ;Ll/᩷ᩴܺ;[Ll/ܶܿܺ;)V

    .line 681
    invoke-virtual {v5}, Ll/֡ܳܺ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 682
    sget-object v1, Ll/۫ܿܺ;->᩶ܽ:Ll/۬ܿܺ;

    goto :goto_1

    :cond_1
    sget-object v1, Ll/۫ܿܺ;->ۘᩳ:Ll/۬ܿܺ;

    .line 683
    :goto_1
    new-instance v4, Ll/ۚܳܺ;

    .line 684
    invoke-static {p1}, Ll/ۘܳܺ;->֫(Ll/ܺۡܺ;)Ll/᩶ۡܺ;

    move-result-object p1

    invoke-direct {v4, v1, v0, p1, v2}, Ll/ۚܳܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܶܿܺ;)V

    .line 686
    invoke-virtual {p0, v3}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    .line 687
    invoke-virtual {p0, v4}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    .line 689
    new-instance p1, Ll/ܿܳܺ;

    invoke-direct {p1, v0}, Ll/ܿܳܺ;-><init>(Ll/ۤۡܺ;)V

    invoke-virtual {p0, p1}, Ll/ۖܳܺ;->ۧ(Ll/ۙܿܺ;)V

    .line 690
    invoke-virtual {p0, v2}, Ll/ۖܳܺ;->ۧ(Ll/ۙܿܺ;)V

    .line 691
    invoke-virtual {p0, v5}, Ll/ۖܳܺ;->ۧ(Ll/ۙܿܺ;)V

    return-void

    .line 665
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/ۨۡܺ;)V
    .locals 10

    .line 751
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    .line 752
    invoke-static {p1}, Ll/ۢܳܺ;->֫(Ll/ܺۡܺ;)Ll/۬ܿܺ;

    move-result-object v1

    .line 753
    invoke-virtual {p1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v2

    .line 754
    invoke-virtual {p1}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v3

    .line 756
    invoke-virtual {v2}, Ll/ۗۡܺ;->ۧ()I

    move-result v4

    const/4 v5, 0x6

    if-ne v4, v5, :cond_a

    .line 760
    iget-object v4, p0, Ll/ۖܳܺ;->ۧ:Ll/ܶܿܺ;

    invoke-virtual {p0, v4}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    .line 762
    invoke-virtual {v2}, Ll/ۗۡܺ;->᩻()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 763
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object p1

    .line 764
    new-instance v2, Ll/᩸ܿܺ;

    invoke-direct {v2, v1, v0, p1, v3}, Ll/᩸ܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 766
    invoke-virtual {p0, v2}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    return-void

    .line 768
    :cond_0
    invoke-direct {p0}, Ll/ۖܳܺ;->֫()Ll/᩸ۡܺ;

    move-result-object v4

    .line 770
    invoke-static {p1, v4}, Ll/ۘܳܺ;->֫(Ll/ܺۡܺ;Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v5

    .line 773
    invoke-virtual {v1}, Ll/۬ܿܺ;->᩻()Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v6, :cond_2

    .line 774
    invoke-virtual {v2}, Ll/ۗۡܺ;->ᩳ()I

    move-result v6

    const/16 v9, 0x2b

    if-ne v6, v9, :cond_1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v6, 0x1

    :goto_1
    if-eqz v4, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    if-ne v6, v4, :cond_9

    .line 782
    invoke-virtual {v2}, Ll/ۗۡܺ;->ᩳ()I

    move-result p1

    const/16 v2, 0x29

    if-ne p1, v2, :cond_4

    .line 783
    invoke-virtual {v1}, Ll/۬ܿܺ;->ܿ()I

    move-result p1

    const/16 v2, 0x23

    if-eq p1, v2, :cond_4

    .line 789
    new-instance p1, Ll/ᩴܳܺ;

    .line 47
    invoke-direct {p1, v1, v0, v5}, Ll/ۙܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    goto :goto_3

    .line 795
    :cond_4
    new-instance p1, Ll/᩸ܿܺ;

    invoke-direct {p1, v1, v0, v5, v3}, Ll/᩸ܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 890
    :goto_3
    iget-object v2, p0, Ll/ۖܳܺ;->ܽ:Ll/ܳܳܺ;

    invoke-virtual {v2}, Ll/ܳܳܺ;->ۧ()I

    move-result v3

    sub-int/2addr v3, v8

    :goto_4
    if-ltz v3, :cond_6

    .line 891
    invoke-virtual {v2, v3}, Ll/ܳܳܺ;->֫(I)Ll/ۙܿܺ;

    move-result-object v4

    .line 892
    invoke-virtual {v4}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/۬ܿܺ;->ܿ()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v3, v3, -0x1

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    .line 805
    :goto_5
    invoke-virtual {v1}, Ll/۬ܿܺ;->ܿ()I

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_8

    if-eqz v4, :cond_8

    .line 806
    invoke-virtual {v4}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۬ܿܺ;->ܿ()I

    move-result v1

    const/4 v2, 0x7

    if-eq v1, v2, :cond_7

    const/16 v2, 0x8

    if-eq v1, v2, :cond_7

    const/16 v2, 0x9

    if-ne v1, v2, :cond_8

    .line 810
    :cond_7
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿᩴܺ;->size()I

    move-result v1

    if-lez v1, :cond_8

    invoke-virtual {v4}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿᩴܺ;->size()I

    move-result v1

    if-le v1, v8, :cond_8

    .line 811
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-virtual {v1, v7}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    .line 812
    invoke-virtual {v4}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v2

    invoke-virtual {v2, v8}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    if-ne v1, v2, :cond_8

    .line 813
    new-instance v1, Ll/ᩴܳܺ;

    sget-object v2, Ll/۫ܿܺ;->ۚܽ:Ll/۬ܿܺ;

    sget-object v3, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    .line 47
    invoke-direct {v1, v2, v0, v3}, Ll/ۙܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    .line 814
    invoke-virtual {p0, v1}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    .line 818
    :cond_8
    invoke-virtual {p0, p1}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    return-void

    .line 777
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Insn with result/move-result-pseudo mismatch "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 757
    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected BRANCH_THROW got "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/ۗۡܺ;->ۧ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܽۡܺ;Ll/ܶܿܺ;)V
    .locals 0

    .line 548
    iput-object p1, p0, Ll/ۖܳܺ;->֫:Ll/ܽۡܺ;

    .line 549
    iput-object p2, p0, Ll/ۖܳܺ;->ۧ:Ll/ܶܿܺ;

    return-void
.end method

.method public final ֫(Ll/᩷ۡܺ;)V
    .locals 6

    .line 856
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    .line 857
    invoke-virtual {p1}, Ll/᩷ۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v1

    .line 858
    invoke-virtual {p1}, Ll/᩷ۡܺ;->᩵()Ljava/util/ArrayList;

    move-result-object v2

    .line 859
    invoke-virtual {p1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v3

    .line 861
    invoke-virtual {v3}, Ll/ۗۡܺ;->ۧ()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 864
    new-instance v3, Ll/ܶܿܺ;

    const/4 v4, 0x0

    .line 42
    invoke-direct {v3, v0, v4}, Ll/ܶܿܺ;-><init>(Ll/ۤۡܺ;Z)V

    .line 865
    new-instance v4, Ll/ᩴܿܺ;

    iget-object v5, p0, Ll/ۖܳܺ;->ۧ:Ll/ܶܿܺ;

    invoke-direct {v4, v0, v5, v2, v1}, Ll/ᩴܿܺ;-><init>(Ll/ۤۡܺ;Ll/ܶܿܺ;Ljava/util/ArrayList;Ll/ܰۡܺ;)V

    .line 868
    new-instance v1, Ll/ۚܳܺ;

    sget-object v2, Ll/۫ܿܺ;->ܺ֫:Ll/۬ܿܺ;

    .line 869
    invoke-static {p1}, Ll/ۘܳܺ;->֫(Ll/ܺۡܺ;)Ll/᩶ۡܺ;

    move-result-object p1

    invoke-direct {v1, v2, v0, p1, v3}, Ll/ۚܳܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܶܿܺ;)V

    .line 872
    iget-object p1, p0, Ll/ۖܳܺ;->ۧ:Ll/ܶܿܺ;

    invoke-virtual {p0, p1}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    .line 873
    invoke-virtual {p0, v1}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    .line 875
    new-instance p1, Ll/ܿܳܺ;

    invoke-direct {p1, v0}, Ll/ܿܳܺ;-><init>(Ll/ۤۡܺ;)V

    invoke-virtual {p0, p1}, Ll/ۖܳܺ;->ۧ(Ll/ۙܿܺ;)V

    .line 876
    invoke-virtual {p0, v3}, Ll/ۖܳܺ;->ۧ(Ll/ۙܿܺ;)V

    .line 877
    invoke-virtual {p0, v4}, Ll/ۖܳܺ;->ۧ(Ll/ۙܿܺ;)V

    return-void

    .line 862
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/᩺ۡܺ;)V
    .locals 5

    .line 827
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    .line 828
    invoke-static {p1}, Ll/ۢܳܺ;->֫(Ll/ܺۡܺ;)Ll/۬ܿܺ;

    move-result-object v1

    .line 829
    invoke-virtual {p1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v2

    .line 832
    invoke-virtual {v2}, Ll/ۗۡܺ;->ۧ()I

    move-result v2

    const/4 v3, 0x6

    if-ne v2, v3, :cond_2

    .line 836
    invoke-direct {p0}, Ll/ۖܳܺ;->֫()Ll/᩸ۡܺ;

    move-result-object v2

    .line 838
    invoke-virtual {v1}, Ll/۬ܿܺ;->᩻()Z

    move-result v3

    if-eqz v2, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ne v3, v4, :cond_1

    .line 843
    iget-object v3, p0, Ll/ۖܳܺ;->ۧ:Ll/ܶܿܺ;

    invoke-virtual {p0, v3}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    .line 845
    new-instance v3, Ll/ᩴܳܺ;

    .line 846
    invoke-static {p1, v2}, Ll/ۘܳܺ;->֫(Ll/ܺۡܺ;Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object p1

    .line 47
    invoke-direct {v3, v1, v0, p1}, Ll/ۙܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    .line 848
    invoke-virtual {p0, v3}, Ll/ۖܳܺ;->֫(Ll/ۙܿܺ;)V

    return-void

    .line 839
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Insn with result/move-result-pseudo mismatch"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 833
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)V
    .locals 1

    .line 905
    iget-object v0, p0, Ll/ۖܳܺ;->ܽ:Ll/ܳܳܺ;

    invoke-virtual {v0, p1}, Ll/ܳܳܺ;->ۧ(Ll/ۙܿܺ;)V

    return-void
.end method
