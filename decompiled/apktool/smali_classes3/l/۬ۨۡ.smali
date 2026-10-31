.class public final Ll/۬ۨۡ;
.super Ljava/lang/Object;
.source "K50I"


# instance fields
.field public ֫:[I

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 565
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    new-array v0, v0, [I

    .line 566
    iput-object v0, p0, Ll/۬ۨۡ;->֫:[I

    return-void
.end method

.method private final ֫(IZ)I
    .locals 5

    .line 749
    iget v0, p0, Ll/۬ۨۡ;->ۧ:I

    if-eqz v0, :cond_3

    if-gez p1, :cond_0

    goto :goto_1

    .line 753
    :cond_0
    iget v0, p0, Ll/۬ۨۡ;->ܽ:I

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_3

    .line 754
    iget-object v2, p0, Ll/۬ۨۡ;->֫:[I

    aget v3, v2, v1

    const/4 v4, 0x2

    if-lt p1, v3, :cond_1

    sub-int/2addr p1, v3

    .line 756
    invoke-static {v3, v4, v4, v1}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 753
    invoke-static {p1, v4, v0, v1}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result p1

    if-nez p2, :cond_2

    add-int/lit8 p1, p1, 0x1

    .line 764
    :cond_2
    aget p1, v2, p1

    return p1

    :cond_3
    :goto_1
    const/4 p1, -0x1

    return p1
.end method


# virtual methods
.method public final ֫(I)I
    .locals 5

    .line 725
    iget v0, p0, Ll/۬ۨۡ;->ۧ:I

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 729
    iget v1, p0, Ll/۬ۨۡ;->ܽ:I

    :goto_0
    if-eqz v1, :cond_3

    .line 730
    iget-object v2, p0, Ll/۬ۨۡ;->֫:[I

    aget v2, v2, v0

    add-int/lit8 v0, v0, -0x2

    :goto_1
    if-eqz v2, :cond_2

    .line 738
    iget-object v3, p0, Ll/۬ۨۡ;->֫:[I

    add-int/lit8 v4, v0, 0x1

    aget v4, v3, v4

    if-ne v4, p1, :cond_1

    .line 739
    aget p1, v3, v0

    return p1

    :cond_1
    add-int/lit8 v0, v0, -0x2

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    :goto_2
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫()V
    .locals 3

    .line 700
    iget v0, p0, Ll/۬ۨۡ;->ۧ:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v0, -0x1

    .line 704
    iget-object v2, p0, Ll/۬ۨۡ;->֫:[I

    aget v1, v2, v1

    add-int/lit8 v2, v0, -0x2

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v2, v1

    if-nez v2, :cond_1

    :goto_0
    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    .line 708
    iput v0, p0, Ll/۬ۨۡ;->ۧ:I

    .line 710
    iget v0, p0, Ll/۬ۨۡ;->ܽ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۬ۨۡ;->ܽ:I

    return-void
.end method

.method public final ֫(II)V
    .locals 7

    .line 606
    iget v0, p0, Ll/۬ۨۡ;->ܽ:I

    if-nez v0, :cond_0

    .line 607
    invoke-virtual {p0}, Ll/۬ۨۡ;->ܽ()V

    .line 714
    :cond_0
    iget-object v0, p0, Ll/۬ۨۡ;->֫:[I

    array-length v1, v0

    iget v2, p0, Ll/۬ۨۡ;->ۧ:I

    sub-int/2addr v1, v2

    const/4 v3, 0x2

    if-le v1, v3, :cond_1

    goto :goto_0

    .line 718
    :cond_1
    array-length v4, v0

    add-int/2addr v4, v1

    mul-int/lit8 v4, v4, 0x2

    .line 719
    new-array v1, v4, [I

    const/4 v4, 0x0

    .line 720
    invoke-static {v0, v4, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 721
    iput-object v1, p0, Ll/۬ۨۡ;->֫:[I

    .line 610
    :goto_0
    iget v0, p0, Ll/۬ۨۡ;->ۧ:I

    add-int/lit8 v1, v0, -0x1

    .line 611
    iget-object v2, p0, Ll/۬ۨۡ;->֫:[I

    aget v4, v2, v1

    add-int/lit8 v5, v0, -0x2

    mul-int/lit8 v6, v4, 0x2

    sub-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    .line 612
    aput v4, v2, v5

    .line 613
    aput p1, v2, v1

    .line 614
    aput p2, v2, v0

    add-int/lit8 p1, v0, 0x1

    .line 615
    aput v4, v2, p1

    add-int/2addr v0, v3

    .line 616
    iput v0, p0, Ll/۬ۨۡ;->ۧ:I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 687
    iget v0, p0, Ll/۬ۨۡ;->ܽ:I

    return v0
.end method

.method public final ۧ(I)I
    .locals 4

    .line 589
    iget v0, p0, Ll/۬ۨۡ;->ۧ:I

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-gez p1, :cond_0

    goto :goto_1

    .line 592
    :cond_0
    iget v0, p0, Ll/۬ۨۡ;->ܽ:I

    if-le p1, v0, :cond_1

    move p1, v0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 598
    iget-object v2, p0, Ll/۬ۨۡ;->֫:[I

    aget v2, v2, v0

    add-int/2addr v1, v2

    const/4 v3, 0x2

    .line 599
    invoke-static {v2, v3, v3, v0}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v0

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method public final ܽ(I)I
    .locals 1

    const/4 v0, 0x1

    .line 671
    invoke-direct {p0, p1, v0}, Ll/۬ۨۡ;->֫(IZ)I

    move-result p1

    return p1
.end method

.method public final ܽ()V
    .locals 6

    .line 714
    iget-object v0, p0, Ll/۬ۨۡ;->֫:[I

    array-length v1, v0

    iget v2, p0, Ll/۬ۨۡ;->ۧ:I

    sub-int/2addr v1, v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-le v1, v3, :cond_0

    goto :goto_0

    .line 718
    :cond_0
    array-length v5, v0

    add-int/2addr v5, v1

    mul-int/lit8 v5, v5, 0x2

    .line 719
    new-array v1, v5, [I

    .line 720
    invoke-static {v0, v4, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 721
    iput-object v1, p0, Ll/۬ۨۡ;->֫:[I

    .line 692
    :goto_0
    iget v0, p0, Ll/۬ۨۡ;->ۧ:I

    .line 693
    iget-object v1, p0, Ll/۬ۨۡ;->֫:[I

    aput v4, v1, v0

    add-int/lit8 v2, v0, 0x1

    .line 694
    aput v4, v1, v2

    add-int/2addr v0, v3

    .line 695
    iput v0, p0, Ll/۬ۨۡ;->ۧ:I

    .line 696
    iget v0, p0, Ll/۬ۨۡ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۬ۨۡ;->ܽ:I

    return-void
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x0

    .line 570
    iput v0, p0, Ll/۬ۨۡ;->ۧ:I

    .line 572
    iput v0, p0, Ll/۬ۨۡ;->ܽ:I

    return-void
.end method

.method public final ᩳ(I)I
    .locals 1

    const/4 v0, 0x0

    .line 675
    invoke-direct {p0, p1, v0}, Ll/۬ۨۡ;->֫(IZ)I

    move-result p1

    return p1
.end method

.method public final ᩳ()V
    .locals 5

    .line 652
    iget v0, p0, Ll/۬ۨۡ;->ۧ:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v0, -0x1

    .line 656
    iget-object v2, p0, Ll/۬ۨۡ;->֫:[I

    aget v1, v2, v1

    if-nez v1, :cond_1

    :goto_0
    return-void

    :cond_1
    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v3, v0, -0x3

    .line 662
    aput v1, v2, v3

    mul-int/lit8 v4, v1, 0x2

    add-int/lit8 v4, v4, 0x1

    sub-int/2addr v3, v4

    .line 664
    aput v1, v2, v3

    add-int/lit8 v0, v0, -0x2

    .line 665
    iput v0, p0, Ll/۬ۨۡ;->ۧ:I

    return-void
.end method
