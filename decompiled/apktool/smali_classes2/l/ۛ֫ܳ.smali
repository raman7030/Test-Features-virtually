.class public final Ll/ۛ֫ܳ;
.super Ljava/lang/Object;
.source "A70P"


# instance fields
.field public final ֫:[J

.field public ۧ:I

.field public ܳ:J

.field public ܽ:Z

.field public ܿ:Ll/۫֫ܳ;

.field public ᩳ:J

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 635
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x10000

    .line 636
    invoke-static {v0}, Ll/ܰ֫ܳ;->֫(I)I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Ll/ۛ֫ܳ;->֫:[J

    const-wide v0, 0x7fffffffffffffffL

    .line 641
    iput-wide v0, p0, Ll/ۛ֫ܳ;->ᩳ:J

    return-void
.end method

.method private ֫(I)V
    .locals 6

    .line 706
    iget-boolean v0, p0, Ll/ۛ֫ܳ;->ܽ:Z

    if-nez v0, :cond_2

    if-ltz p1, :cond_1

    .line 712
    iget v0, p0, Ll/ۛ֫ܳ;->᩻:I

    int-to-long v1, v0

    int-to-long v3, p1

    add-long/2addr v1, v3

    const-wide/32 v3, 0x7fffffff

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    add-int/2addr v0, p1

    .line 715
    iput v0, p0, Ll/ۛ֫ܳ;->᩻:I

    return-void

    .line 713
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    const-string v0, "Dirty length overflow"

    invoke-direct {p1, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 710
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Dirty length must not be negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 707
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Dirty sequence builder already built"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ܽ()V
    .locals 14

    .line 720
    iget v0, p0, Ll/ۛ֫ܳ;->ۧ:I

    if-nez v0, :cond_0

    return-void

    .line 723
    :cond_0
    invoke-static {v0}, Ll/ܰ֫ܳ;->֫(I)I

    move-result v0

    .line 724
    iget v1, p0, Ll/ۛ֫ܳ;->ۧ:I

    .line 743
    invoke-static {v1}, Ll/ܰ֫ܳ;->֫(I)I

    move-result v2

    and-int/lit8 v1, v1, 0x3f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    :goto_0
    const-wide/16 v7, 0x0

    .line 745
    iget-object v9, p0, Ll/ۛ֫ܳ;->֫:[J

    if-ge v4, v2, :cond_4

    add-int/lit8 v10, v2, -0x1

    if-ne v4, v10, :cond_1

    if-eqz v1, :cond_1

    const-wide/16 v10, 0x1

    shl-long v12, v10, v1

    sub-long/2addr v12, v10

    goto :goto_1

    :cond_1
    const-wide/16 v12, -0x1

    .line 748
    :goto_1
    aget-wide v10, v9, v4

    and-long v9, v10, v12

    cmp-long v11, v9, v7

    if-eqz v11, :cond_2

    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    or-int/2addr v5, v7

    cmp-long v7, v9, v12

    if-nez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    and-int/2addr v6, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    const-wide/16 v1, 0x8

    if-eqz v5, :cond_6

    if-nez v6, :cond_6

    .line 725
    invoke-virtual {p0}, Ll/ۛ֫ܳ;->ۧ()J

    move-result-wide v4

    int-to-long v10, v0

    mul-long v10, v10, v1

    invoke-static {v4, v5, v10, v11}, Ll/ܰ֫ܳ;->֫(JJ)J

    move-result-wide v4

    iget-wide v10, p0, Ll/ۛ֫ܳ;->ᩳ:J

    cmp-long v6, v4, v10

    if-gtz v6, :cond_5

    goto :goto_4

    .line 727
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Dirty bitmap exceeds memory limit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 729
    :cond_6
    :goto_4
    iget v4, p0, Ll/ۛ֫ܳ;->ۧ:I

    .line 730
    invoke-static {v9, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    .line 729
    invoke-static {v4, v0}, Ll/ܰ֫ܳ;->֫(I[J)Ll/۫֫ܳ;

    move-result-object v0

    .line 731
    invoke-virtual {v0}, Ll/۫֫ܳ;->֫()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 732
    iget-wide v4, p0, Ll/ۛ֫ܳ;->ܳ:J

    iget-object v6, v0, Ll/۫֫ܳ;->ۧ:[J

    array-length v6, v6

    int-to-long v10, v6

    mul-long v10, v10, v1

    add-long/2addr v10, v4

    iput-wide v10, p0, Ll/ۛ֫ܳ;->ܳ:J

    .line 734
    :cond_7
    iget-object v1, p0, Ll/ۛ֫ܳ;->ܿ:Ll/۫֫ܳ;

    invoke-static {v1, v0}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ֫ܳ;->ܿ:Ll/۫֫ܳ;

    .line 735
    invoke-static {v9, v7, v8}, Ljava/util/Arrays;->fill([JJ)V

    .line 736
    iput v3, p0, Ll/ۛ֫ܳ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۫֫ܳ;
    .locals 2

    .line 683
    iget-boolean v0, p0, Ll/ۛ֫ܳ;->ܽ:Z

    if-nez v0, :cond_0

    .line 686
    invoke-direct {p0}, Ll/ۛ֫ܳ;->ܽ()V

    const/4 v0, 0x1

    .line 687
    iput-boolean v0, p0, Ll/ۛ֫ܳ;->ܽ:Z

    .line 688
    iget-object v0, p0, Ll/ۛ֫ܳ;->ܿ:Ll/۫֫ܳ;

    return-object v0

    .line 684
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Dirty sequence builder already built"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(II[J)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 668
    invoke-direct {v0, v1}, Ll/ۛ֫ܳ;->֫(I)V

    move v2, v1

    move/from16 v1, p1

    :cond_0
    :goto_0
    if-lez v2, :cond_4

    .line 670
    iget v3, v0, Ll/ۛ֫ܳ;->ۧ:I

    const/high16 v4, 0x10000

    sub-int/2addr v4, v3

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 671
    iget v4, v0, Ll/ۛ֫ܳ;->ۧ:I

    move v6, v1

    move v5, v3

    :goto_1
    if-lez v5, :cond_3

    ushr-int/lit8 v7, v6, 0x6

    and-int/lit8 v8, v6, 0x3f

    ushr-int/lit8 v9, v4, 0x6

    and-int/lit8 v10, v4, 0x3f

    rsub-int/lit8 v11, v10, 0x40

    .line 764
    invoke-static {v5, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    .line 765
    aget-wide v12, p3, v7

    ushr-long/2addr v12, v8

    const/16 v14, 0x40

    if-eqz v8, :cond_1

    add-int v15, v8, v11

    if-le v15, v14, :cond_1

    add-int/lit8 v7, v7, 0x1

    .line 767
    aget-wide v15, p3, v7

    rsub-int/lit8 v7, v8, 0x40

    shl-long v7, v15, v7

    or-long/2addr v12, v7

    :cond_1
    if-ne v11, v14, :cond_2

    const-wide/16 v7, -0x1

    goto :goto_2

    :cond_2
    const-wide/16 v7, 0x1

    shl-long v14, v7, v11

    sub-long v7, v14, v7

    .line 770
    :goto_2
    iget-object v14, v0, Ll/ۛ֫ܳ;->֫:[J

    aget-wide v15, v14, v9

    and-long/2addr v7, v12

    shl-long/2addr v7, v10

    or-long/2addr v7, v15

    aput-wide v7, v14, v9

    add-int/2addr v6, v11

    add-int/2addr v4, v11

    sub-int/2addr v5, v11

    goto :goto_1

    :cond_3
    add-int/2addr v1, v3

    .line 673
    iget v4, v0, Ll/ۛ֫ܳ;->ۧ:I

    add-int/2addr v4, v3

    iput v4, v0, Ll/ۛ֫ܳ;->ۧ:I

    sub-int/2addr v2, v3

    const/high16 v3, 0x10000

    if-ne v4, v3, :cond_0

    .line 676
    invoke-direct/range {p0 .. p0}, Ll/ۛ֫ܳ;->ܽ()V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ֫(IZ)V
    .locals 5

    .line 646
    invoke-direct {p0, p1}, Ll/ۛ֫ܳ;->֫(I)V

    :cond_0
    :goto_0
    if-lez p1, :cond_3

    .line 648
    iget v0, p0, Ll/ۛ֫ܳ;->ۧ:I

    const/high16 v1, 0x10000

    if-nez v0, :cond_1

    if-lt p1, v1, :cond_1

    const/high16 v0, -0x10000

    and-int/2addr v0, p1

    .line 650
    iget-object v1, p0, Ll/ۛ֫ܳ;->ܿ:Ll/۫֫ܳ;

    invoke-static {v0, p2}, Ll/ܰ֫ܳ;->ۧ(IZ)Ll/۫֫ܳ;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v1

    iput-object v1, p0, Ll/ۛ֫ܳ;->ܿ:Ll/۫֫ܳ;

    sub-int/2addr p1, v0

    goto :goto_0

    :cond_1
    sub-int v0, v1, v0

    .line 654
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-eqz p2, :cond_2

    .line 656
    iget v2, p0, Ll/ۛ֫ܳ;->ۧ:I

    add-int v3, v2, v0

    iget-object v4, p0, Ll/ۛ֫ܳ;->֫:[J

    invoke-static {v2, v3, v4}, Ll/ܰ֫ܳ;->֫(II[J)V

    .line 658
    :cond_2
    iget v2, p0, Ll/ۛ֫ܳ;->ۧ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ۛ֫ܳ;->ۧ:I

    sub-int/2addr p1, v0

    if-ne v2, v1, :cond_0

    .line 661
    invoke-direct {p0}, Ll/ۛ֫ܳ;->ܽ()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ֫(J)V
    .locals 3

    const-wide/16 v0, 0x0

    .line 698
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۛ֫ܳ;->ᩳ:J

    .line 699
    invoke-virtual {p0}, Ll/ۛ֫ܳ;->ۧ()J

    move-result-wide p1

    iget-wide v0, p0, Ll/ۛ֫ܳ;->ᩳ:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    return-void

    .line 700
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Dirty bitmap exceeds memory limit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()J
    .locals 6

    .line 693
    iget-wide v0, p0, Ll/ۛ֫ܳ;->ܳ:J

    iget-object v2, p0, Ll/ۛ֫ܳ;->֫:[J

    array-length v2, v2

    int-to-long v2, v2

    const-wide/16 v4, 0x8

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    return-wide v2
.end method
