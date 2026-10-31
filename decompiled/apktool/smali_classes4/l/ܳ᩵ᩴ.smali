.class public abstract Ll/ܳ᩵ᩴ;
.super Ljava/lang/Object;
.source "H1MW"


# instance fields
.field public final synthetic ۗ:Ll/ۢ᩵ᩴ;

.field public ۙ:I

.field public ۬:Ll/᩵֡ᩴ;

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۢ᩵ᩴ;)V
    .locals 1

    .line 696
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩵ᩴ;->ۗ:Ll/ۢ᩵ᩴ;

    .line 702
    iget v0, p1, Ll/ۢ᩵ᩴ;->ۛ:I

    iput v0, p0, Ll/ܳ᩵ᩴ;->ۙ:I

    const/4 v0, -0x1

    .line 708
    iput v0, p0, Ll/ܳ᩵ᩴ;->᩹:I

    .line 710
    iget v0, p1, Ll/ۢ᩵ᩴ;->ۨ:I

    iput v0, p0, Ll/ܳ᩵ᩴ;->᩸:I

    .line 712
    iget-boolean p1, p1, Ll/ۢ᩵ᩴ;->᩸:Z

    iput-boolean p1, p0, Ll/ܳ᩵ᩴ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final forEachRemaining(Ljava/lang/Object;)V
    .locals 5

    .line 748
    iget-boolean v0, p0, Ll/ܳ᩵ᩴ;->᩶:Z

    iget-object v1, p0, Ll/ܳ᩵ᩴ;->ۗ:Ll/ۢ᩵ᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 749
    iput-boolean v0, p0, Ll/ܳ᩵ᩴ;->᩶:Z

    .line 750
    iget v0, v1, Ll/ۢ᩵ᩴ;->ۛ:I

    iput v0, p0, Ll/ܳ᩵ᩴ;->᩹:I

    invoke-virtual {p0, v0, p1}, Ll/ܳ᩵ᩴ;->֫(ILjava/lang/Object;)V

    .line 751
    iget v0, p0, Ll/ܳ᩵ᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܳ᩵ᩴ;->᩸:I

    .line 753
    :cond_0
    iget-object v0, v1, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 754
    :cond_1
    :goto_0
    iget v2, p0, Ll/ܳ᩵ᩴ;->᩸:I

    if-eqz v2, :cond_4

    .line 755
    iget v2, p0, Ll/ܳ᩵ᩴ;->ۙ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܳ᩵ᩴ;->ۙ:I

    if-gez v2, :cond_3

    const/high16 v3, -0x80000000

    .line 757
    iput v3, p0, Ll/ܳ᩵ᩴ;->᩹:I

    .line 758
    iget-object v3, p0, Ll/ܳ᩵ᩴ;->۬:Ll/᩵֡ᩴ;

    neg-int v2, v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v3, v2}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 759
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, v1, Ll/ۢ᩵ᩴ;->۬:I

    :goto_1
    and-int/2addr v3, v4

    .line 760
    aget-object v4, v0, v3

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    iget v4, v1, Ll/ۢ᩵ᩴ;->۬:I

    goto :goto_1

    .line 761
    :cond_2
    invoke-virtual {p0, v3, p1}, Ll/ܳ᩵ᩴ;->֫(ILjava/lang/Object;)V

    .line 762
    iget v2, p0, Ll/ܳ᩵ᩴ;->᩸:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܳ᩵ᩴ;->᩸:I

    goto :goto_0

    .line 763
    :cond_3
    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    .line 764
    iput v2, p0, Ll/ܳ᩵ᩴ;->᩹:I

    invoke-virtual {p0, v2, p1}, Ll/ܳ᩵ᩴ;->֫(ILjava/lang/Object;)V

    .line 765
    iget v2, p0, Ll/ܳ᩵ᩴ;->᩸:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܳ᩵ᩴ;->᩸:I

    goto :goto_0

    :cond_4
    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 826
    invoke-virtual {p0, p1}, Ll/ܳ᩵ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 0

    .line 1231
    invoke-virtual {p0, p1}, Ll/ܳ᩵ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 723
    iget v0, p0, Ll/ܳ᩵ᩴ;->᩸:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public remove()V
    .locals 10

    .line 803
    iget v0, p0, Ll/ܳ᩵ᩴ;->᩹:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 804
    iget-object v2, p0, Ll/ܳ᩵ᩴ;->ۗ:Ll/ۢ᩵ᩴ;

    iget v3, v2, Ll/ۢ᩵ᩴ;->ۛ:I

    const/4 v4, 0x0

    if-ne v0, v3, :cond_0

    const/4 v0, 0x0

    .line 805
    iput-boolean v0, v2, Ll/ۢ᩵ᩴ;->᩸:Z

    .line 806
    iget-object v0, v2, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    aput-object v4, v0, v3

    goto :goto_2

    .line 807
    :cond_0
    iget v3, p0, Ll/ܳ᩵ᩴ;->ۙ:I

    if-ltz v3, :cond_7

    .line 780
    iget-object v5, v2, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 781
    iget-object v6, v2, Ll/ۢ᩵ᩴ;->᩺:[I

    :goto_0
    add-int/lit8 v3, v0, 0x1

    .line 783
    iget v7, v2, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v3, v7

    .line 785
    :goto_1
    aget-object v7, v5, v3

    if-nez v7, :cond_1

    .line 786
    aput-object v4, v5, v0

    .line 814
    :goto_2
    iget v0, v2, Ll/ۢ᩵ᩴ;->ۨ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v2, Ll/ۢ᩵ᩴ;->ۨ:I

    .line 815
    iput v1, p0, Ll/ܳ᩵ᩴ;->᩹:I

    return-void

    .line 789
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v8

    invoke-static {v8}, Ll/ܰۛۡ;->֫(I)I

    move-result v8

    iget v9, v2, Ll/ۢ᩵ᩴ;->۬:I

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

    .line 794
    iget-object v8, p0, Ll/ܳ᩵ᩴ;->۬:Ll/᩵֡ᩴ;

    if-nez v8, :cond_4

    new-instance v8, Ll/᩵֡ᩴ;

    const/4 v9, 0x2

    invoke-direct {v8, v9}, Ll/᩵֡ᩴ;-><init>(I)V

    iput-object v8, p0, Ll/ܳ᩵ᩴ;->۬:Ll/᩵֡ᩴ;

    .line 795
    :cond_4
    iget-object v8, p0, Ll/ܳ᩵ᩴ;->۬:Ll/᩵֡ᩴ;

    aget-object v9, v5, v3

    invoke-virtual {v8, v9}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    .line 797
    :cond_5
    aput-object v7, v5, v0

    .line 798
    aget v7, v6, v3

    aput v7, v6, v0

    move v0, v3

    goto :goto_0

    :cond_6
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v9

    goto :goto_1

    .line 810
    :cond_7
    iget-object v0, p0, Ll/ܳ᩵ᩴ;->۬:Ll/᩵֡ᩴ;

    neg-int v3, v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3, v4}, Ll/᩵֡ᩴ;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ۢ᩵ᩴ;->֫(Ljava/lang/Object;)I

    .line 811
    iput v1, p0, Ll/ܳ᩵ᩴ;->᩹:I

    return-void

    .line 803
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ֫()I
    .locals 5

    .line 727
    invoke-virtual {p0}, Ll/ܳ᩵ᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 728
    iget v0, p0, Ll/ܳ᩵ᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܳ᩵ᩴ;->᩸:I

    .line 729
    iget-boolean v0, p0, Ll/ܳ᩵ᩴ;->᩶:Z

    iget-object v1, p0, Ll/ܳ᩵ᩴ;->ۗ:Ll/ۢ᩵ᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 730
    iput-boolean v0, p0, Ll/ܳ᩵ᩴ;->᩶:Z

    .line 731
    iget v0, v1, Ll/ۢ᩵ᩴ;->ۛ:I

    iput v0, p0, Ll/ܳ᩵ᩴ;->᩹:I

    return v0

    .line 733
    :cond_0
    iget-object v0, v1, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 735
    :cond_1
    iget v2, p0, Ll/ܳ᩵ᩴ;->ۙ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܳ᩵ᩴ;->ۙ:I

    if-gez v2, :cond_3

    const/high16 v3, -0x80000000

    .line 737
    iput v3, p0, Ll/ܳ᩵ᩴ;->᩹:I

    .line 738
    iget-object v3, p0, Ll/ܳ᩵ᩴ;->۬:Ll/᩵֡ᩴ;

    neg-int v2, v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v3, v2}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 739
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, v1, Ll/ۢ᩵ᩴ;->۬:I

    :goto_0
    and-int/2addr v3, v4

    .line 740
    aget-object v4, v0, v3

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    iget v4, v1, Ll/ۢ᩵ᩴ;->۬:I

    goto :goto_0

    :cond_2
    return v3

    .line 743
    :cond_3
    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    iput v2, p0, Ll/ܳ᩵ᩴ;->᩹:I

    return v2

    .line 727
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public abstract ֫(ILjava/lang/Object;)V
.end method
