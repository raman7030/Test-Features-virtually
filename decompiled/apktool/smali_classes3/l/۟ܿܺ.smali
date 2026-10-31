.class public final Ll/۟ܿܺ;
.super Ljava/lang/Object;
.source "3BHK"


# instance fields
.field public ֫:[I

.field public ۧ:I

.field public ܽ:Ll/ۙۡܺ;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 511
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 512
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/۟ܿܺ;->ᩳ:Ljava/util/ArrayList;

    const/4 p1, 0x0

    .line 513
    iput p1, p0, Ll/۟ܿܺ;->ۧ:I

    const/4 p1, 0x0

    .line 514
    iput-object p1, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    .line 515
    iput-object p1, p0, Ll/۟ܿܺ;->֫:[I

    return-void
.end method

.method private ֫(II)V
    .locals 3

    .line 527
    iget-object v0, p0, Ll/۟ܿܺ;->֫:[I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez p1, :cond_1

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    if-ltz p1, :cond_5

    if-nez v2, :cond_3

    .line 537
    array-length p1, v0

    if-lt p2, p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    return-void

    :cond_3
    :goto_2
    add-int/lit8 p2, p2, 0x1

    .line 545
    new-instance p1, Ll/ۙۡܺ;

    invoke-direct {p1, p2}, Ll/ۙۡܺ;-><init>(I)V

    .line 546
    new-array p2, p2, [I

    const/4 v0, -0x1

    .line 547
    invoke-static {p2, v0}, Ljava/util/Arrays;->fill([II)V

    if-nez v2, :cond_4

    .line 550
    iget-object v0, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    invoke-virtual {p1, v0}, Ll/ۙۡܺ;->ۧ(Ll/ۙۡܺ;)V

    .line 551
    iget-object v0, p0, Ll/۟ܿܺ;->֫:[I

    array-length v2, v0

    invoke-static {v0, v1, p2, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 555
    :cond_4
    iput-object p1, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    .line 556
    iput-object p2, p0, Ll/۟ܿܺ;->֫:[I

    return-void

    .line 534
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "shouldn\'t happen"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۧ(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V
    .locals 2

    .line 883
    invoke-virtual {p3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 885
    new-instance v1, Ll/ܰܿܺ;

    invoke-direct {v1, p1, p2, p3}, Ll/ܰܿܺ;-><init>(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    iget-object p1, p0, Ll/۟ܿܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 887
    sget-object v1, Ll/᩺ܿܺ;->۫:Ll/᩺ܿܺ;

    if-ne p2, v1, :cond_0

    .line 888
    iget-object p1, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    invoke-virtual {p1, p3}, Ll/ۙۡܺ;->ۧ(Ll/᩸ۡܺ;)V

    .line 889
    iget-object p1, p0, Ll/۟ܿܺ;->֫:[I

    const/4 p2, -0x1

    aput p2, p1, v0

    return-void

    .line 891
    :cond_0
    iget-object p2, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    invoke-virtual {p2, p3}, Ll/ۙۡܺ;->ܽ(Ll/᩸ۡܺ;)V

    .line 892
    iget-object p2, p0, Ll/۟ܿܺ;->֫:[I

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    aput p1, p2, v0

    return-void
.end method

.method private ܽ(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V
    .locals 4

    .line 907
    sget-object v0, Ll/᩺ܿܺ;->۫:Ll/᩺ܿܺ;

    if-eq p2, v0, :cond_1

    .line 911
    invoke-virtual {p3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 912
    iget-object v1, p0, Ll/۟ܿܺ;->֫:[I

    aget v0, v1, v0

    if-ltz v0, :cond_0

    .line 916
    iget-object v1, p0, Ll/۟ܿܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰܿܺ;

    .line 917
    invoke-virtual {v2}, Ll/ܰܿܺ;->֫()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 918
    invoke-virtual {v2}, Ll/ܰܿܺ;->᩻()Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3, p3}, Ll/᩸ۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 923
    invoke-virtual {v2, p2}, Ll/ܰܿܺ;->֫(Ll/᩺ܿܺ;)Ll/ܰܿܺ;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 924
    iget-object p1, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    invoke-virtual {p1, p3}, Ll/ۙۡܺ;->ܽ(Ll/᩸ۡܺ;)V

    return-void

    .line 929
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ll/۟ܿܺ;->֫(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    return-void

    .line 908
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "shouldn\'t happen"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/֫ܳܺ;
    .locals 7

    const v0, 0x7fffffff

    const/4 v1, 0x0

    .line 938
    invoke-direct {p0, v0, v1}, Ll/۟ܿܺ;->֫(II)V

    .line 940
    iget-object v0, p0, Ll/۟ܿܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 941
    iget v3, p0, Ll/۟ܿܺ;->ۧ:I

    sub-int v3, v2, v3

    if-nez v3, :cond_0

    .line 944
    sget-object v0, Ll/֫ܳܺ;->᩶:Ll/֫ܳܺ;

    return-object v0

    .line 955
    :cond_0
    new-array v4, v3, [Ll/ܰܿܺ;

    if-ne v2, v3, :cond_1

    .line 958
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    goto :goto_1

    .line 961
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰܿܺ;

    if-eqz v5, :cond_2

    add-int/lit8 v6, v2, 0x1

    .line 963
    aput-object v5, v4, v2

    move v2, v6

    goto :goto_0

    .line 968
    :cond_3
    :goto_1
    invoke-static {v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 970
    new-instance v0, Ll/֫ܳܺ;

    .line 52
    invoke-direct {v0, v3}, Ll/ܿᩴܺ;-><init>(I)V

    :goto_2
    if-ge v1, v3, :cond_4

    .line 973
    aget-object v2, v4, v1

    invoke-virtual {v0, v1, v2}, Ll/ܿᩴܺ;->֫(ILl/ܰܿܺ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 976
    :cond_4
    invoke-virtual {v0}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v0
.end method

.method public final ֫(ILl/ۙۡܺ;)V
    .locals 6

    .line 573
    invoke-virtual {p2}, Ll/ۙۡܺ;->ۚ()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 574
    invoke-direct {p0, p1, v1}, Ll/۟ܿܺ;->֫(II)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    .line 577
    iget-object v2, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    invoke-virtual {v2, v1}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    .line 578
    invoke-virtual {p2, v1}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 866
    invoke-virtual {v3}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v4

    sget-object v5, Ll/۟ܺܺ;->ᩴ֫:Ll/۟ܺܺ;

    if-ne v4, v5, :cond_0

    .line 867
    sget-object v4, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    invoke-virtual {v3, v4}, Ll/᩸ۡܺ;->֫(Ll/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v3

    :cond_0
    if-nez v2, :cond_1

    if-eqz v3, :cond_3

    .line 582
    invoke-virtual {p0, p1, v3}, Ll/۟ܿܺ;->֫(ILl/᩸ۡܺ;)V

    goto :goto_1

    :cond_1
    if-nez v3, :cond_2

    .line 728
    sget-object v3, Ll/᩺ܿܺ;->۬:Ll/᩺ܿܺ;

    invoke-virtual {p0, p1, v3, v2}, Ll/۟ܿܺ;->֫(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    goto :goto_1

    .line 586
    :cond_2
    invoke-virtual {v3, v2}, Ll/᩸ۡܺ;->ۧ(Ll/᩸ۡܺ;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 728
    sget-object v4, Ll/᩺ܿܺ;->۬:Ll/᩺ܿܺ;

    invoke-virtual {p0, p1, v4, v2}, Ll/۟ܿܺ;->֫(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    .line 588
    invoke-virtual {p0, p1, v3}, Ll/۟ܿܺ;->֫(ILl/᩸ۡܺ;)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ֫(ILl/᩸ۡܺ;)V
    .locals 5

    .line 609
    invoke-virtual {p2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 866
    invoke-virtual {p2}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v1

    sget-object v2, Ll/۟ܺܺ;->ᩴ֫:Ll/۟ܺܺ;

    if-ne v1, v2, :cond_0

    .line 867
    sget-object v1, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    invoke-virtual {p2, v1}, Ll/᩸ۡܺ;->֫(Ll/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object p2

    .line 612
    :cond_0
    invoke-direct {p0, p1, v0}, Ll/۟ܿܺ;->֫(II)V

    .line 614
    iget-object v1, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    invoke-virtual {v1, v0}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    .line 616
    invoke-virtual {p2, v1}, Ll/᩸ۡܺ;->ۧ(Ll/᩸ۡܺ;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    .line 621
    :cond_1
    iget-object v2, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    invoke-virtual {v2, p2}, Ll/ۙۡܺ;->֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 627
    sget-object v3, Ll/᩺ܿܺ;->ۙ:Ll/᩺ܿܺ;

    invoke-direct {p0, p1, v3, v2}, Ll/۟ܿܺ;->ܽ(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    .line 630
    :cond_2
    iget-object v2, p0, Ll/۟ܿܺ;->֫:[I

    aget v2, v2, v0

    if-eqz v1, :cond_3

    .line 637
    sget-object v2, Ll/᩺ܿܺ;->ۗ:Ll/᩺ܿܺ;

    invoke-direct {p0, p1, v2, v1}, Ll/۟ܿܺ;->ۧ(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    goto :goto_0

    :cond_3
    if-ltz v2, :cond_5

    .line 645
    iget-object v1, p0, Ll/۟ܿܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰܿܺ;

    .line 646
    invoke-virtual {v3}, Ll/ܰܿܺ;->֫()I

    move-result v4

    if-ne v4, p1, :cond_5

    .line 647
    invoke-virtual {v3, p2}, Ll/ܰܿܺ;->֫(Ll/᩸ۡܺ;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 p1, 0x0

    .line 658
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 659
    iget p1, p0, Ll/۟ܿܺ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۟ܿܺ;->ۧ:I

    .line 660
    iget-object p1, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    invoke-virtual {p1, p2}, Ll/ۙۡܺ;->ۧ(Ll/᩸ۡܺ;)V

    .line 661
    iget-object p1, p0, Ll/۟ܿܺ;->֫:[I

    const/4 p2, -0x1

    aput p2, p1, v0

    return-void

    .line 670
    :cond_4
    sget-object v4, Ll/᩺ܿܺ;->ۗ:Ll/᩺ܿܺ;

    invoke-virtual {v3, v4}, Ll/ܰܿܺ;->֫(Ll/᩺ܿܺ;)Ll/ܰܿܺ;

    move-result-object v3

    .line 672
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_0
    if-lez v0, :cond_6

    .line 688
    iget-object v1, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 689
    invoke-virtual {v1}, Ll/᩸ۡܺ;->ۚ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 690
    sget-object v2, Ll/᩺ܿܺ;->᩹:Ll/᩺ܿܺ;

    invoke-direct {p0, p1, v2, v1}, Ll/۟ܿܺ;->ܽ(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    .line 701
    :cond_6
    invoke-virtual {p2}, Ll/᩸ۡܺ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 702
    iget-object v1, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 704
    sget-object v1, Ll/᩺ܿܺ;->᩶:Ll/᩺ܿܺ;

    invoke-direct {p0, p1, v1, v0}, Ll/۟ܿܺ;->ܽ(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    .line 716
    :cond_7
    sget-object v0, Ll/᩺ܿܺ;->۫:Ll/᩺ܿܺ;

    invoke-direct {p0, p1, v0, p2}, Ll/۟ܿܺ;->ۧ(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    return-void
.end method

.method public final ֫(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V
    .locals 5

    .line 745
    invoke-virtual {p3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 866
    invoke-virtual {p3}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v1

    sget-object v2, Ll/۟ܺܺ;->ᩴ֫:Ll/۟ܺܺ;

    if-ne v1, v2, :cond_0

    .line 867
    sget-object v1, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    invoke-virtual {p3, v1}, Ll/᩸ۡܺ;->֫(Ll/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object p3

    .line 748
    :cond_0
    invoke-direct {p0, p1, v0}, Ll/۟ܿܺ;->֫(II)V

    .line 750
    iget-object v1, p0, Ll/۟ܿܺ;->֫:[I

    aget v0, v1, v0

    if-ltz v0, :cond_1

    goto :goto_5

    .line 785
    :cond_1
    iget-object v0, p0, Ll/۟ܿܺ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_5

    .line 790
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰܿܺ;

    if-nez v3, :cond_2

    goto :goto_1

    .line 796
    :cond_2
    invoke-virtual {v3}, Ll/ܰܿܺ;->֫()I

    move-result v4

    if-eq v4, p1, :cond_3

    .line 765
    invoke-direct {p0, p1, p2, p3}, Ll/۟ܿܺ;->ۧ(ILl/᩺ܿܺ;Ll/᩸ۡܺ;)V

    return-void

    .line 801
    :cond_3
    invoke-virtual {v3, p3}, Ll/ܰܿܺ;->֫(Ll/᩸ۡܺ;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 811
    :cond_5
    :goto_2
    iget-object p2, p0, Ll/۟ܿܺ;->ܽ:Ll/ۙۡܺ;

    invoke-virtual {p2, p3}, Ll/ۙۡܺ;->ܽ(Ll/᩸ۡܺ;)V

    const/4 p2, 0x0

    .line 812
    invoke-virtual {v0, v1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 813
    iget v3, p0, Ll/۟ܿܺ;->ۧ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/۟ܿܺ;->ۧ:I

    .line 815
    invoke-virtual {p3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p3

    :cond_6
    :goto_3
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_8

    .line 821
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܰܿܺ;

    if-nez p2, :cond_7

    goto :goto_3

    .line 827
    :cond_7
    invoke-virtual {p2}, Ll/ܰܿܺ;->᩻()Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    if-ne v3, p3, :cond_6

    goto :goto_4

    :cond_8
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_9

    .line 835
    iget-object v2, p0, Ll/۟ܿܺ;->֫:[I

    aput v1, v2, p3

    .line 837
    invoke-virtual {p2}, Ll/ܰܿܺ;->֫()I

    move-result p3

    if-ne p3, p1, :cond_9

    .line 842
    sget-object p1, Ll/᩺ܿܺ;->۬:Ll/᩺ܿܺ;

    .line 843
    invoke-virtual {p2, p1}, Ll/ܰܿܺ;->֫(Ll/᩺ܿܺ;)Ll/ܰܿܺ;

    move-result-object p1

    .line 842
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_5
    return-void
.end method
