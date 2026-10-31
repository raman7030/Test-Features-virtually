.class public abstract Ll/ܳ֡ᩴ;
.super Ljava/lang/Object;
.source "DD2"


# instance fields
.field public final synthetic ۗ:Ll/ۢ֡ᩴ;

.field public ۙ:I

.field public ۬:Ll/᩵֡ᩴ;

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۢ֡ᩴ;)V
    .locals 1

    .line 631
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ֡ᩴ;->ۗ:Ll/ۢ֡ᩴ;

    .line 637
    iget v0, p1, Ll/ۢ֡ᩴ;->ۛ:I

    iput v0, p0, Ll/ܳ֡ᩴ;->ۙ:I

    const/4 v0, -0x1

    .line 643
    iput v0, p0, Ll/ܳ֡ᩴ;->᩹:I

    .line 645
    iget v0, p1, Ll/ۢ֡ᩴ;->ۨ:I

    iput v0, p0, Ll/ܳ֡ᩴ;->᩸:I

    .line 647
    iget-boolean p1, p1, Ll/ۢ֡ᩴ;->᩸:Z

    iput-boolean p1, p0, Ll/ܳ֡ᩴ;->᩶:Z

    return-void
.end method


# virtual methods
.method public forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 6

    .line 683
    iget-boolean v0, p0, Ll/ܳ֡ᩴ;->᩶:Z

    iget-object v1, p0, Ll/ܳ֡ᩴ;->ۗ:Ll/ۢ֡ᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 684
    iput-boolean v0, p0, Ll/ܳ֡ᩴ;->᩶:Z

    .line 685
    iget v0, v1, Ll/ۢ֡ᩴ;->ۛ:I

    iput v0, p0, Ll/ܳ֡ᩴ;->᩹:I

    invoke-virtual {p0, v0, p1}, Ll/ܳ֡ᩴ;->֫(ILjava/lang/Object;)V

    .line 686
    iget v0, p0, Ll/ܳ֡ᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܳ֡ᩴ;->᩸:I

    .line 688
    :cond_0
    iget-object v0, v1, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 689
    :cond_1
    :goto_0
    iget v2, p0, Ll/ܳ֡ᩴ;->᩸:I

    if-eqz v2, :cond_4

    .line 690
    iget v2, p0, Ll/ܳ֡ᩴ;->ۙ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܳ֡ᩴ;->ۙ:I

    if-gez v2, :cond_3

    const/high16 v3, -0x80000000

    .line 692
    iput v3, p0, Ll/ܳ֡ᩴ;->᩹:I

    .line 693
    iget-object v3, p0, Ll/ܳ֡ᩴ;->۬:Ll/᩵֡ᩴ;

    neg-int v2, v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v3, v2}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 694
    iget-object v3, v1, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v3, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, v1, Ll/ۢ֡ᩴ;->۬:I

    :goto_1
    and-int/2addr v3, v4

    .line 695
    iget-object v4, v1, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    aget-object v5, v0, v3

    invoke-interface {v4, v2, v5}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    iget v4, v1, Ll/ۢ֡ᩴ;->۬:I

    goto :goto_1

    .line 696
    :cond_2
    invoke-virtual {p0, v3, p1}, Ll/ܳ֡ᩴ;->֫(ILjava/lang/Object;)V

    .line 697
    iget v2, p0, Ll/ܳ֡ᩴ;->᩸:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܳ֡ᩴ;->᩸:I

    goto :goto_0

    .line 698
    :cond_3
    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    .line 699
    iput v2, p0, Ll/ܳ֡ᩴ;->᩹:I

    invoke-virtual {p0, v2, p1}, Ll/ܳ֡ᩴ;->֫(ILjava/lang/Object;)V

    .line 700
    iget v2, p0, Ll/ܳ֡ᩴ;->᩸:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܳ֡ᩴ;->᩸:I

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 658
    iget v0, p0, Ll/ܳ֡ᩴ;->᩸:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public remove()V
    .locals 10

    .line 739
    iget v0, p0, Ll/ܳ֡ᩴ;->᩹:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 740
    iget-object v2, p0, Ll/ܳ֡ᩴ;->ۗ:Ll/ۢ֡ᩴ;

    iget v3, v2, Ll/ۢ֡ᩴ;->ۛ:I

    const/4 v4, 0x0

    if-ne v0, v3, :cond_0

    const/4 v0, 0x0

    .line 741
    iput-boolean v0, v2, Ll/ۢ֡ᩴ;->᩸:Z

    .line 742
    iget-object v0, v2, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    aput-object v4, v0, v3

    .line 743
    iget-object v0, v2, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aput-object v4, v0, v3

    goto :goto_2

    .line 744
    :cond_0
    iget v3, p0, Ll/ܳ֡ᩴ;->ۙ:I

    if-ltz v3, :cond_7

    .line 715
    iget-object v5, v2, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 716
    iget-object v6, v2, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    :goto_0
    add-int/lit8 v3, v0, 0x1

    .line 718
    iget v7, v2, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v3, v7

    .line 720
    :goto_1
    aget-object v7, v5, v3

    if-nez v7, :cond_1

    .line 721
    aput-object v4, v5, v0

    .line 722
    aput-object v4, v6, v0

    .line 751
    :goto_2
    iget v0, v2, Ll/ۢ֡ᩴ;->ۨ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v2, Ll/ۢ֡ᩴ;->ۨ:I

    .line 752
    iput v1, p0, Ll/ܳ֡ᩴ;->᩹:I

    return-void

    .line 725
    :cond_1
    iget-object v8, v2, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v8, v7}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v8

    invoke-static {v8}, Ll/ܰۛۡ;->֫(I)I

    move-result v8

    iget v9, v2, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v8, v9

    if-gt v0, v3, :cond_2

    if-ge v0, v8, :cond_3

    if-le v8, v3, :cond_6

    goto :goto_3

    :cond_2
    if-lt v0, v8, :cond_6

    if-le v8, v3, :cond_6

    :cond_3
    :goto_3
    if-ge v3, v0, :cond_5

    .line 730
    iget-object v8, p0, Ll/ܳ֡ᩴ;->۬:Ll/᩵֡ᩴ;

    if-nez v8, :cond_4

    new-instance v8, Ll/᩵֡ᩴ;

    const/4 v9, 0x2

    invoke-direct {v8, v9}, Ll/᩵֡ᩴ;-><init>(I)V

    iput-object v8, p0, Ll/ܳ֡ᩴ;->۬:Ll/᩵֡ᩴ;

    .line 731
    :cond_4
    iget-object v8, p0, Ll/ܳ֡ᩴ;->۬:Ll/᩵֡ᩴ;

    aget-object v9, v5, v3

    invoke-virtual {v8, v9}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    .line 733
    :cond_5
    aput-object v7, v5, v0

    .line 734
    aget-object v7, v6, v3

    aput-object v7, v6, v0

    move v0, v3

    goto :goto_0

    :cond_6
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v9

    goto :goto_1

    .line 747
    :cond_7
    iget-object v0, p0, Ll/ܳ֡ᩴ;->۬:Ll/᩵֡ᩴ;

    neg-int v3, v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3, v4}, Ll/᩵֡ᩴ;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ۢ֡ᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 748
    iput v1, p0, Ll/ܳ֡ᩴ;->᩹:I

    return-void

    .line 739
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ֫()I
    .locals 6

    .line 662
    invoke-virtual {p0}, Ll/ܳ֡ᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 663
    iget v0, p0, Ll/ܳ֡ᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܳ֡ᩴ;->᩸:I

    .line 664
    iget-boolean v0, p0, Ll/ܳ֡ᩴ;->᩶:Z

    iget-object v1, p0, Ll/ܳ֡ᩴ;->ۗ:Ll/ۢ֡ᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 665
    iput-boolean v0, p0, Ll/ܳ֡ᩴ;->᩶:Z

    .line 666
    iget v0, v1, Ll/ۢ֡ᩴ;->ۛ:I

    iput v0, p0, Ll/ܳ֡ᩴ;->᩹:I

    return v0

    .line 668
    :cond_0
    iget-object v0, v1, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 670
    :cond_1
    iget v2, p0, Ll/ܳ֡ᩴ;->ۙ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܳ֡ᩴ;->ۙ:I

    if-gez v2, :cond_3

    const/high16 v3, -0x80000000

    .line 672
    iput v3, p0, Ll/ܳ֡ᩴ;->᩹:I

    .line 673
    iget-object v3, p0, Ll/ܳ֡ᩴ;->۬:Ll/᩵֡ᩴ;

    neg-int v2, v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v3, v2}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 674
    iget-object v3, v1, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v3, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, v1, Ll/ۢ֡ᩴ;->۬:I

    :goto_0
    and-int/2addr v3, v4

    .line 675
    iget-object v4, v1, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    aget-object v5, v0, v3

    invoke-interface {v4, v2, v5}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    iget v4, v1, Ll/ۢ֡ᩴ;->۬:I

    goto :goto_0

    :cond_2
    return v3

    .line 678
    :cond_3
    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    iput v2, p0, Ll/ܳ֡ᩴ;->᩹:I

    return v2

    .line 662
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public abstract ֫(ILjava/lang/Object;)V
.end method
