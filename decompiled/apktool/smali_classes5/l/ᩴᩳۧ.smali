.class public final Ll/ᩴᩳۧ;
.super Ll/֡ᩳۧ;
.source "Q8SE"


# instance fields
.field public final ֡:J

.field public ֨:F

.field public ۖ:J

.field public final ۘ:J

.field public final ۚ:J

.field public final ۜ:F

.field public ۠:I

.field public final ۡ:Ll/ܳ֨֫;

.field public final ۢ:F

.field public ܶ:I

.field public ܺ:Ll/ۧᩳۧ;

.field public final ᩴ:I

.field public final ᩵:I

.field public final ᩷:Ll/۬ܿۧ;

.field public final ᩻:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ll/۬᩵֫;[ILl/۬ܿۧ;JJJLl/ܳ۬ܺ;)V
    .locals 0

    .line 392
    invoke-direct {p0, p1, p2}, Ll/֡ᩳۧ;-><init>(Ll/۬᩵֫;[I)V

    cmp-long p1, p8, p4

    if-gez p1, :cond_0

    const-string p1, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs"

    .line 394
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    move-wide p8, p4

    .line 400
    :cond_0
    iput-object p3, p0, Ll/ᩴᩳۧ;->᩷:Ll/۬ܿۧ;

    const-wide/16 p1, 0x3e8

    mul-long p4, p4, p1

    .line 401
    iput-wide p4, p0, Ll/ᩴᩳۧ;->֡:J

    mul-long p6, p6, p1

    .line 402
    iput-wide p6, p0, Ll/ᩴᩳۧ;->ۘ:J

    mul-long p8, p8, p1

    .line 403
    iput-wide p8, p0, Ll/ᩴᩳۧ;->ۚ:J

    const/16 p1, 0x4ff

    .line 404
    iput p1, p0, Ll/ᩴᩳۧ;->᩵:I

    const/16 p1, 0x2cf

    .line 405
    iput p1, p0, Ll/ᩴᩳۧ;->ᩴ:I

    const p1, 0x3f333333    # 0.7f

    .line 406
    iput p1, p0, Ll/ᩴᩳۧ;->ۜ:F

    const/high16 p1, 0x3f400000    # 0.75f

    .line 407
    iput p1, p0, Ll/ᩴᩳۧ;->ۢ:F

    .line 409
    invoke-static {p10}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴᩳۧ;->᩻:Ll/ܳ۬ܺ;

    .line 410
    sget-object p1, Ll/ܽۚ֫;->֫:Ll/ܳ֨֫;

    iput-object p1, p0, Ll/ᩴᩳۧ;->ۡ:Ll/ܳ֨֫;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 411
    iput p1, p0, Ll/ᩴᩳۧ;->֨:F

    const/4 p1, 0x0

    .line 412
    iput p1, p0, Ll/ᩴᩳۧ;->۠:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 413
    iput-wide p1, p0, Ll/ᩴᩳۧ;->ۖ:J

    return-void
.end method

.method private ֫(JJ)I
    .locals 7

    .line 691
    iget-object p3, p0, Ll/ᩴᩳۧ;->᩷:Ll/۬ܿۧ;

    invoke-interface {p3}, Ll/۬ܿۧ;->ۧ()J

    move-result-wide p3

    long-to-float p3, p3

    .line 692
    iget p4, p0, Ll/ᩴᩳۧ;->ۜ:F

    mul-float p3, p3, p4

    float-to-long p3, p3

    long-to-float p3, p3

    .line 695
    iget p4, p0, Ll/ᩴᩳۧ;->֨:F

    div-float/2addr p3, p4

    float-to-long p3, p3

    .line 672
    iget-object v0, p0, Ll/ᩴᩳۧ;->᩻:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    .line 676
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    .line 677
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖᩳۧ;

    iget-wide v2, v2, Ll/ۖᩳۧ;->ۧ:J

    cmp-long v4, v2, p3

    if-gez v4, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v1, -0x1

    .line 680
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖᩳۧ;

    .line 681
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖᩳۧ;

    .line 682
    iget-wide v3, v2, Ll/ۖᩳۧ;->ۧ:J

    sub-long/2addr p3, v3

    long-to-float p3, p3

    iget-wide v5, v0, Ll/ۖᩳۧ;->ۧ:J

    sub-long/2addr v5, v3

    long-to-float p4, v5

    div-float/2addr p3, p4

    .line 685
    iget-wide v1, v2, Ll/ۖᩳۧ;->֫:J

    iget-wide v3, v0, Ll/ۖᩳۧ;->֫:J

    sub-long/2addr v3, v1

    long-to-float p4, v3

    mul-float p3, p3, p4

    float-to-long p3, p3

    add-long/2addr p3, v1

    :goto_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 602
    :goto_2
    iget v2, p0, Ll/֡ᩳۧ;->ܿ:I

    if-ge v0, v2, :cond_5

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, p1, v2

    if-eqz v4, :cond_2

    .line 603
    invoke-virtual {p0, v0, p1, p2}, Ll/֡ᩳۧ;->֫(IJ)Z

    move-result v2

    if-nez v2, :cond_4

    .line 604
    :cond_2
    invoke-virtual {p0, v0}, Ll/֡ᩳۧ;->֫(I)Ll/۠ᩴ֫;

    move-result-object v1

    .line 605
    iget v1, v1, Ll/۠ᩴ֫;->ᩳ:I

    int-to-long v1, v1

    cmp-long v3, v1, p3

    if-gtz v3, :cond_3

    return v0

    :cond_3
    move v1, v0

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    return v1
.end method

.method public static ֫(Ljava/util/List;)J
    .locals 7

    .line 661
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_0

    goto :goto_0

    .line 664
    :cond_0
    invoke-static {p0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۧᩳۧ;

    .line 665
    iget-wide v3, p0, Ll/۟ܽۧ;->ܿ:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    iget-wide v5, p0, Ll/۟ܽۧ;->ܽ:J

    cmp-long p0, v5, v1

    if-eqz p0, :cond_1

    sub-long/2addr v5, v3

    return-wide v5

    :cond_1
    :goto_0
    return-wide v1
.end method

.method public static ֫([Ll/᩷ܿۧ;)Ll/ܳ۬ܺ;
    .locals 22

    move-object/from16 v0, p0

    .line 712
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 714
    :goto_0
    array-length v4, v0

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    if-ge v3, v4, :cond_1

    .line 715
    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    iget-object v4, v4, Ll/᩷ܿۧ;->ۧ:[I

    array-length v4, v4

    if-le v4, v7, :cond_0

    .line 716
    sget v4, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v4, Ll/֫۬ܺ;

    invoke-direct {v4}, Ll/֫۬ܺ;-><init>()V

    .line 718
    new-instance v7, Ll/ۖᩳۧ;

    invoke-direct {v7, v5, v6, v5, v6}, Ll/ۖᩳۧ;-><init>(JJ)V

    invoke-virtual {v4, v7}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 719
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 721
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 757
    :cond_1
    array-length v3, v0

    new-array v4, v3, [[J

    const/4 v8, 0x0

    .line 758
    :goto_2
    array-length v9, v0

    const-wide/16 v10, -0x1

    if-ge v8, v9, :cond_5

    .line 759
    aget-object v9, v0, v8

    if-nez v9, :cond_2

    new-array v9, v2, [J

    .line 761
    aput-object v9, v4, v8

    goto :goto_4

    .line 760
    :cond_2
    iget-object v12, v9, Ll/᩷ܿۧ;->ۧ:[I

    .line 764
    array-length v13, v12

    new-array v13, v13, [J

    aput-object v13, v4, v8

    const/4 v13, 0x0

    .line 765
    :goto_3
    array-length v14, v12

    if-ge v13, v14, :cond_4

    .line 766
    iget-object v14, v9, Ll/᩷ܿۧ;->֫:Ll/۬᩵֫;

    aget v15, v12, v13

    invoke-virtual {v14, v15}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v14

    iget v14, v14, Ll/۠ᩴ֫;->ᩳ:I

    int-to-long v14, v14

    .line 767
    aget-object v16, v4, v8

    cmp-long v17, v14, v10

    if-nez v17, :cond_3

    move-wide v14, v5

    :cond_3
    aput-wide v14, v16, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .line 769
    :cond_4
    aget-object v9, v4, v8

    invoke-static {v9}, Ljava/util/Arrays;->sort([J)V

    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 726
    :cond_5
    new-array v8, v3, [I

    .line 727
    new-array v9, v3, [J

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v3, :cond_7

    .line 729
    aget-object v13, v4, v12

    array-length v14, v13

    if-nez v14, :cond_6

    move-wide v14, v5

    goto :goto_6

    :cond_6
    aget-wide v14, v13, v2

    :goto_6
    aput-wide v14, v9, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    .line 731
    :cond_7
    invoke-static {v1, v9}, Ll/ᩴᩳۧ;->֫(Ljava/util/ArrayList;[J)V

    .line 785
    invoke-static {}, Ll/᩶ۤܺ;->ۧ()Ll/᩹ۤܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩹ۤܺ;->֫()Ll/ܶۤܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶۤܺ;->ܽ()Ll/ۗ۫ܺ;

    move-result-object v2

    const/4 v5, 0x0

    :goto_7
    if-ge v5, v3, :cond_d

    .line 787
    aget-object v6, v4, v5

    array-length v12, v6

    if-gt v12, v7, :cond_8

    goto :goto_c

    .line 790
    :cond_8
    array-length v6, v6

    new-array v7, v6, [D

    const/4 v12, 0x0

    .line 791
    :goto_8
    aget-object v13, v4, v5

    const/4 v14, 0x0

    array-length v15, v13

    const-wide/16 v16, 0x0

    if-ge v12, v15, :cond_a

    .line 793
    aget-wide v14, v13, v12

    cmp-long v13, v14, v10

    if-nez v13, :cond_9

    goto :goto_9

    :cond_9
    long-to-double v13, v14

    invoke-static {v13, v14}, Ljava/lang/Math;->log(D)D

    move-result-wide v16

    :goto_9
    aput-wide v16, v7, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_a
    add-int/lit8 v6, v6, -0x1

    .line 795
    aget-wide v12, v7, v6

    aget-wide v18, v7, v14

    sub-double v12, v12, v18

    const/4 v15, 0x0

    :goto_a
    if-ge v15, v6, :cond_c

    .line 797
    aget-wide v18, v7, v15

    add-int/lit8 v15, v15, 0x1

    aget-wide v20, v7, v15

    add-double v18, v18, v20

    const-wide/high16 v20, 0x3fe0000000000000L    # 0.5

    mul-double v18, v18, v20

    cmpl-double v20, v12, v16

    if-nez v20, :cond_b

    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    goto :goto_b

    .line 799
    :cond_b
    aget-wide v20, v7, v14

    sub-double v18, v18, v20

    div-double v18, v18, v12

    .line 800
    :goto_b
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v10, v11}, Ll/֡ۤܺ;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-wide/16 v10, -0x1

    goto :goto_a

    :cond_c
    :goto_c
    add-int/lit8 v5, v5, 0x1

    const/4 v7, 0x1

    const-wide/16 v10, -0x1

    goto :goto_7

    .line 803
    :cond_d
    invoke-interface {v2}, Ll/֡ۤܺ;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-static {v2}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v2

    const/4 v3, 0x0

    .line 734
    :goto_d
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ge v3, v5, :cond_e

    .line 735
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 736
    aget v6, v8, v5

    add-int/lit8 v6, v6, 0x1

    aput v6, v8, v5

    .line 737
    aget-object v7, v4, v5

    aget-wide v6, v7, v6

    aput-wide v6, v9, v5

    .line 738
    invoke-static {v1, v9}, Ll/ᩴᩳۧ;->֫(Ljava/util/ArrayList;[J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :cond_e
    const/4 v2, 0x0

    .line 741
    :goto_e
    array-length v3, v0

    if-ge v2, v3, :cond_10

    .line 742
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 743
    aget-wide v3, v9, v2

    const-wide/16 v5, 0x2

    mul-long v3, v3, v5

    aput-wide v3, v9, v2

    :cond_f
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    .line 746
    :cond_10
    invoke-static {v1, v9}, Ll/ᩴᩳۧ;->֫(Ljava/util/ArrayList;[J)V

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    const/4 v2, 0x0

    .line 748
    :goto_f
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_12

    .line 749
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫۬ܺ;

    if-nez v3, :cond_11

    .line 750
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v3

    goto :goto_10

    :cond_11
    invoke-virtual {v3}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v3

    :goto_10
    invoke-virtual {v0, v3}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    .line 752
    :cond_12
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;[J)V
    .locals 7

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 817
    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_0

    .line 818
    aget-wide v4, p1, v3

    add-long/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 820
    :cond_0
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 821
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫۬ܺ;

    if-nez v3, :cond_1

    goto :goto_2

    .line 825
    :cond_1
    new-instance v4, Ll/ۖᩳۧ;

    aget-wide v5, p1, v2

    invoke-direct {v4, v0, v1, v5, v6}, Ll/ۖᩳۧ;-><init>(JJ)V

    invoke-virtual {v3, v4}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 489
    iget v0, p0, Ll/ᩴᩳۧ;->ܶ:I

    return v0
.end method

.method public final ֫(JLjava/util/List;)I
    .locals 10

    .line 505
    iget-object v0, p0, Ll/ᩴᩳۧ;->ۡ:Ll/ܳ֨֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 576
    iget-wide v2, p0, Ll/ᩴᩳۧ;->ۖ:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    cmp-long v6, v2, v4

    if-gez v6, :cond_1

    .line 578
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p3}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧᩳۧ;

    iget-object v3, p0, Ll/ᩴᩳۧ;->ܺ:Ll/ۧᩳۧ;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 507
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1

    .line 509
    :cond_1
    :goto_0
    iput-wide v0, p0, Ll/ᩴᩳۧ;->ۖ:J

    .line 510
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    invoke-static {p3}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧᩳۧ;

    :goto_1
    iput-object v2, p0, Ll/ᩴᩳۧ;->ܺ:Ll/ۧᩳۧ;

    .line 512
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    return v3

    .line 515
    :cond_3
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v4, v2, -0x1

    .line 516
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧᩳۧ;

    .line 517
    iget-wide v4, v4, Ll/۟ܽۧ;->ܿ:J

    sub-long/2addr v4, p1

    iget v6, p0, Ll/ᩴᩳۧ;->֨:F

    .line 518
    invoke-static {v4, v5, v6}, Ll/ۘ֨֫;->ۧ(JF)J

    move-result-wide v4

    .line 521
    iget-wide v6, p0, Ll/ᩴᩳۧ;->ۚ:J

    cmp-long v8, v4, v6

    if-gez v8, :cond_4

    goto :goto_3

    .line 524
    :cond_4
    invoke-static {p3}, Ll/ᩴᩳۧ;->֫(Ljava/util/List;)J

    move-result-wide v4

    invoke-direct {p0, v0, v1, v4, v5}, Ll/ᩴᩳۧ;->֫(JJ)I

    move-result v0

    .line 525
    invoke-virtual {p0, v0}, Ll/֡ᩳۧ;->֫(I)Ll/۠ᩴ֫;

    move-result-object v0

    :goto_2
    if-ge v3, v2, :cond_6

    .line 530
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧᩳۧ;

    .line 531
    iget-object v4, v1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    .line 532
    iget-wide v8, v1, Ll/۟ܽۧ;->ܿ:J

    sub-long/2addr v8, p1

    .line 533
    iget v1, p0, Ll/ᩴᩳۧ;->֨:F

    .line 534
    invoke-static {v8, v9, v1}, Ll/ۘ֨֫;->ۧ(JF)J

    move-result-wide v8

    cmp-long v1, v8, v6

    if-ltz v1, :cond_5

    .line 535
    iget v1, v4, Ll/۠ᩴ֫;->ᩳ:I

    iget v5, v0, Ll/۠ᩴ֫;->ᩳ:I

    if-ge v1, v5, :cond_5

    iget v1, v4, Ll/۠ᩴ֫;->۠:I

    const/4 v5, -0x1

    if-eq v1, v5, :cond_5

    iget v8, p0, Ll/ᩴᩳۧ;->ᩴ:I

    if-gt v1, v8, :cond_5

    iget v4, v4, Ll/۠ᩴ֫;->᩷֫:I

    if-eq v4, v5, :cond_5

    iget v5, p0, Ll/ᩴᩳۧ;->᩵:I

    if-gt v4, v5, :cond_5

    iget v4, v0, Ll/۠ᩴ֫;->۠:I

    if-ge v1, v4, :cond_5

    return v3

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    return v2
.end method

.method public final ֫(F)V
    .locals 0

    .line 433
    iput p1, p0, Ll/ᩴᩳۧ;->֨:F

    return-void
.end method

.method public final ֫(JJJLjava/util/List;[Ll/ᩳᩳۧ;)V
    .locals 13

    move-object v0, p0

    move-object/from16 v1, p8

    .line 443
    iget-object v2, v0, Ll/ᩴᩳۧ;->ۡ:Ll/ܳ֨֫;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 640
    iget v4, v0, Ll/ᩴᩳۧ;->ܶ:I

    array-length v5, v1

    if-ge v4, v5, :cond_0

    aget-object v4, v1, v4

    invoke-interface {v4}, Ll/ᩳᩳۧ;->next()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 641
    iget v4, v0, Ll/ᩴᩳۧ;->ܶ:I

    aget-object v1, v1, v4

    .line 642
    invoke-interface {v1}, Ll/ᩳᩳۧ;->ۧ()J

    move-result-wide v4

    invoke-interface {v1}, Ll/ᩳᩳۧ;->֫()J

    move-result-wide v6

    :goto_0
    sub-long/2addr v4, v6

    goto :goto_2

    .line 646
    :cond_0
    array-length v4, v1

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, v1, v5

    .line 647
    invoke-interface {v6}, Ll/ᩳᩳۧ;->next()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 648
    invoke-interface {v6}, Ll/ᩳᩳۧ;->ۧ()J

    move-result-wide v4

    invoke-interface {v6}, Ll/ᩳᩳۧ;->֫()J

    move-result-wide v6

    goto :goto_0

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 653
    :cond_2
    invoke-static/range {p7 .. p7}, Ll/ᩴᩳۧ;->֫(Ljava/util/List;)J

    move-result-wide v4

    .line 447
    :goto_2
    iget v1, v0, Ll/ᩴᩳۧ;->۠:I

    if-nez v1, :cond_3

    const/4 v1, 0x1

    .line 448
    iput v1, v0, Ll/ᩴᩳۧ;->۠:I

    .line 449
    invoke-direct {p0, v2, v3, v4, v5}, Ll/ᩴᩳۧ;->֫(JJ)I

    move-result v1

    iput v1, v0, Ll/ᩴᩳۧ;->ܶ:I

    return-void

    .line 453
    :cond_3
    iget v6, v0, Ll/ᩴᩳۧ;->ܶ:I

    .line 456
    invoke-interface/range {p7 .. p7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    const/4 v8, -0x1

    if-eqz v7, :cond_4

    const/4 v7, -0x1

    goto :goto_3

    :cond_4
    invoke-static/range {p7 .. p7}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۧᩳۧ;

    iget-object v7, v7, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    invoke-virtual {p0, v7}, Ll/֡ᩳۧ;->֫(Ll/۠ᩴ֫;)I

    move-result v7

    :goto_3
    if-eq v7, v8, :cond_5

    .line 459
    invoke-static/range {p7 .. p7}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧᩳۧ;

    iget v1, v1, Ll/۟ܽۧ;->ۜ:I

    move v6, v7

    .line 461
    :cond_5
    invoke-direct {p0, v2, v3, v4, v5}, Ll/ᩴᩳۧ;->֫(JJ)I

    move-result v7

    if-eq v7, v6, :cond_9

    .line 463
    invoke-virtual {p0, v6, v2, v3}, Ll/֡ᩳۧ;->֫(IJ)Z

    move-result v2

    if-nez v2, :cond_9

    .line 465
    invoke-virtual {p0, v6}, Ll/֡ᩳۧ;->֫(I)Ll/۠ᩴ֫;

    move-result-object v2

    .line 466
    invoke-virtual {p0, v7}, Ll/֡ᩳۧ;->֫(I)Ll/۠ᩴ֫;

    move-result-object v3

    .line 616
    iget-wide v8, v0, Ll/ᩴᩳۧ;->֡:J

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v12, p5, v10

    if-nez v12, :cond_6

    goto :goto_5

    :cond_6
    cmp-long v12, v4, v10

    if-eqz v12, :cond_7

    sub-long v4, p5, v4

    goto :goto_4

    :cond_7
    move-wide/from16 v4, p5

    :goto_4
    long-to-float v4, v4

    .line 628
    iget v5, v0, Ll/ᩴᩳۧ;->ۢ:F

    mul-float v4, v4, v5

    float-to-long v4, v4

    .line 630
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    .line 469
    :goto_5
    iget v3, v3, Ll/۠ᩴ֫;->ᩳ:I

    iget v2, v2, Ll/۠ᩴ֫;->ᩳ:I

    if-le v3, v2, :cond_8

    cmp-long v4, p3, v8

    if-gez v4, :cond_8

    goto :goto_6

    :cond_8
    if-ge v3, v2, :cond_9

    .line 474
    iget-wide v2, v0, Ll/ᩴᩳۧ;->ۘ:J

    cmp-long v4, p3, v2

    if-ltz v4, :cond_9

    :goto_6
    move v7, v6

    :cond_9
    if-ne v7, v6, :cond_a

    goto :goto_7

    :cond_a
    const/4 v1, 0x3

    .line 483
    :goto_7
    iput v1, v0, Ll/ᩴᩳۧ;->۠:I

    .line 484
    iput v7, v0, Ll/ᩴᩳۧ;->ܶ:I

    return-void
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܳ()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 420
    iput-wide v0, p0, Ll/ᩴᩳۧ;->ۖ:J

    const/4 v0, 0x0

    .line 421
    iput-object v0, p0, Ll/ᩴᩳۧ;->ܺ:Ll/ۧᩳۧ;

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 428
    iput-object v0, p0, Ll/ᩴᩳۧ;->ܺ:Ll/ۧᩳۧ;

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 494
    iget v0, p0, Ll/ᩴᩳۧ;->۠:I

    return v0
.end method
