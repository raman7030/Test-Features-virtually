.class public abstract Ll/ܶܳۧ;
.super Ll/ۙ᩹֫;
.source "E8FJ"


# instance fields
.field public ֡֫:I

.field public final ֨֫:Ll/᩷֨֫;

.field public ֫ۧ:Ll/ۜ֡֫;

.field public ۖ֫:I

.field public ۗ֫:J

.field public ۘ֫:J

.field public ۙ֫:J

.field public final ۚ֫:Ll/᩸᩸֫;

.field public ۛ֫:Ll/᩸᩻ۧ;

.field public ۜ֫:I

.field public ۟֫:Landroid/view/Surface;

.field public ۠֫:Ll/᩹᩻ۧ;

.field public ۡ֫:Ll/֡ۛ֫;

.field public ۢ֫:Ll/ۗ᩹֫;

.field public ۤ֫:Ll/۬᩸֫;

.field public ۧۧ:Ll/֡ۛ֫;

.field public ۨ֫:Ll/۠ᩴ֫;

.field public ۫֫:Ljava/lang/Object;

.field public final ۬֫:I

.field public ܰ֫:Z

.field public final ܳ֫:J

.field public ܶ֫:J

.field public ܺ֫:Z

.field public ܽۧ:Z

.field public ᩴ֫:I

.field public final ᩵֫:Ll/ۧۜۧ;

.field public ᩶֫:Z

.field public ᩷֫:Ll/֨᩸֫;

.field public ᩸֫:Ll/᩸᩸֫;

.field public ᩹֫:Ll/۠ᩴ֫;

.field public ᩺֫:I

.field public ᩻֫:I


# direct methods
.method public constructor <init>(JLandroid/os/Handler;Ll/ܽۜۧ;I)V
    .locals 1

    const/4 v0, 0x2

    .line 174
    invoke-direct {p0, v0}, Ll/ۙ᩹֫;-><init>(I)V

    .line 175
    iput-wide p1, p0, Ll/ܶܳۧ;->ܳ֫:J

    .line 176
    iput p5, p0, Ll/ܶܳۧ;->۬֫:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 177
    iput-wide p1, p0, Ll/ܶܳۧ;->ۙ֫:J

    .line 178
    new-instance p1, Ll/᩷֨֫;

    invoke-direct {p1}, Ll/᩷֨֫;-><init>()V

    iput-object p1, p0, Ll/ܶܳۧ;->֨֫:Ll/᩷֨֫;

    .line 123
    new-instance p1, Ll/᩸᩸֫;

    const/4 p2, 0x0

    .line 132
    invoke-direct {p1, p2, p2}, Ll/᩸᩸֫;-><init>(II)V

    .line 179
    iput-object p1, p0, Ll/ܶܳۧ;->ۚ֫:Ll/᩸᩸֫;

    .line 180
    new-instance p1, Ll/ۧۜۧ;

    invoke-direct {p1, p3, p4}, Ll/ۧۜۧ;-><init>(Landroid/os/Handler;Ll/ܽۜۧ;)V

    iput-object p1, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    .line 181
    iput p2, p0, Ll/ܶܳۧ;->ۖ֫:I

    const/4 p1, -0x1

    .line 182
    iput p1, p0, Ll/ܶܳۧ;->᩺֫:I

    .line 183
    iput p2, p0, Ll/ܶܳۧ;->֡֫:I

    .line 184
    new-instance p1, Ll/ۗ᩹֫;

    .line 31
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 184
    iput-object p1, p0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    return-void
.end method

.method private ܽ(J)Z
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 807
    iget-object v3, v0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    .line 808
    iget-object v3, v0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    invoke-interface {v3}, Ll/֨᩸֫;->ۧ()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬᩸֫;

    iput-object v3, v0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    if-nez v3, :cond_0

    return v4

    .line 812
    :cond_0
    iget-object v5, v0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    iget v6, v5, Ll/ۗ᩹֫;->ۢ:I

    iget v3, v3, Ll/᩶᩸֫;->᩶:I

    add-int/2addr v6, v3

    iput v6, v5, Ll/ۗ᩹֫;->ۢ:I

    .line 813
    iget v5, v0, Ll/ܶܳۧ;->᩻֫:I

    sub-int/2addr v5, v3

    iput v5, v0, Ll/ܶܳۧ;->᩻֫:I

    .line 816
    :cond_1
    iget-object v3, v0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    invoke-virtual {v3}, Ll/ۘ᩸֫;->᩻()Z

    move-result v3

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eqz v3, :cond_3

    .line 817
    iget v1, v0, Ll/ܶܳۧ;->ۖ֫:I

    if-ne v1, v5, :cond_2

    .line 819
    invoke-virtual/range {p0 .. p0}, Ll/ܶܳۧ;->ۧ֫()V

    .line 820
    invoke-direct/range {p0 .. p0}, Ll/ܶܳۧ;->ᩳ֫()V

    return v4

    .line 822
    :cond_2
    iget-object v1, v0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    throw v6

    .line 849
    :cond_3
    iget-wide v3, v0, Ll/ܶܳۧ;->ܶ֫:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v9, v3, v7

    if-nez v9, :cond_4

    .line 850
    iput-wide v1, v0, Ll/ܶܳۧ;->ܶ֫:J

    .line 853
    :cond_4
    iget-object v3, v0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    iget-wide v7, v3, Ll/᩶᩸֫;->ۙ:J

    sub-long v9, v7, v1

    .line 923
    iget v4, v0, Ll/ܶܳۧ;->᩺֫:I

    const/4 v11, -0x1

    const/4 v12, 0x1

    if-eq v4, v11, :cond_14

    .line 865
    iget-object v4, v0, Ll/ܶܳۧ;->֨֫:Ll/᩷֨֫;

    invoke-virtual {v4, v7, v8}, Ll/᩷֨֫;->ۧ(J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۠ᩴ֫;

    if-eqz v11, :cond_5

    .line 867
    iput-object v11, v0, Ll/ܶܳۧ;->ۨ֫:Ll/۠ᩴ֫;

    goto :goto_0

    .line 868
    :cond_5
    iget-object v11, v0, Ll/ܶܳۧ;->ۨ֫:Ll/۠ᩴ֫;

    if-nez v11, :cond_6

    .line 872
    invoke-virtual {v4}, Ll/᩷֨֫;->ۧ()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ᩴ֫;

    iput-object v4, v0, Ll/ܶܳۧ;->ۨ֫:Ll/۠ᩴ֫;

    .line 877
    :cond_6
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ll/ۙ᩹֫;->ۗ()J

    move-result-wide v13

    sub-long/2addr v7, v13

    .line 908
    invoke-virtual/range {p0 .. p0}, Ll/ۙ᩹֫;->getState()I

    move-result v4

    if-ne v4, v5, :cond_7

    const/4 v4, 0x1

    goto :goto_1

    :cond_7
    const/4 v4, 0x0

    .line 909
    :goto_1
    iget v5, v0, Ll/ܶܳۧ;->֡֫:I

    if-eqz v5, :cond_b

    if-eq v5, v12, :cond_a

    const-wide/16 v13, -0x7530

    const/4 v11, 0x3

    if-ne v5, v11, :cond_9

    .line 915
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v15

    move-wide/from16 v17, v7

    iget-wide v6, v0, Ll/ܶܳۧ;->ۗ֫:J

    sub-long/2addr v15, v6

    if-eqz v4, :cond_8

    cmp-long v4, v9, v13

    if-gez v4, :cond_8

    const-wide/32 v6, 0x186a0

    cmp-long v4, v15, v6

    if-lez v4, :cond_8

    goto :goto_2

    :cond_8
    const/4 v4, 0x0

    goto :goto_3

    .line 918
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_a
    move-wide/from16 v17, v7

    const-wide/16 v13, -0x7530

    :goto_2
    const/4 v4, 0x1

    goto :goto_3

    :cond_b
    move-wide/from16 v17, v7

    const-wide/16 v13, -0x7530

    :goto_3
    if-eqz v4, :cond_c

    .line 879
    iget-object v1, v0, Ll/ܶܳۧ;->ۨ֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide/from16 v7, v17

    .line 879
    invoke-virtual {v0, v3, v7, v8, v1}, Ll/ܶܳۧ;->֫(Ll/۬᩸֫;JLl/۠ᩴ֫;)V

    goto :goto_8

    :cond_c
    move-wide/from16 v7, v17

    .line 883
    invoke-virtual/range {p0 .. p0}, Ll/ۙ᩹֫;->getState()I

    move-result v4

    const/4 v6, 0x2

    if-ne v4, v6, :cond_d

    const/4 v4, 0x1

    goto :goto_4

    :cond_d
    const/4 v4, 0x0

    :goto_4
    if-eqz v4, :cond_15

    .line 884
    iget-wide v5, v0, Ll/ܶܳۧ;->ܶ֫:J

    cmp-long v11, v1, v5

    if-nez v11, :cond_e

    goto :goto_9

    :cond_e
    const-wide/32 v5, -0x7a120

    cmp-long v11, v9, v5

    if-gez v11, :cond_f

    const/4 v5, 0x1

    goto :goto_5

    :cond_f
    const/4 v5, 0x0

    :goto_5
    if-eqz v5, :cond_11

    .line 527
    invoke-virtual/range {p0 .. p2}, Ll/ۙ᩹֫;->ۧ(J)I

    move-result v1

    if-nez v1, :cond_10

    const/4 v1, 0x0

    goto :goto_6

    .line 531
    :cond_10
    iget-object v2, v0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    iget v5, v2, Ll/ۗ᩹֫;->ܿ:I

    add-int/2addr v5, v12

    iput v5, v2, Ll/ۗ᩹֫;->ܿ:I

    .line 534
    iget v2, v0, Ll/ܶܳۧ;->᩻֫:I

    invoke-virtual {v0, v1, v2}, Ll/ܶܳۧ;->֫(II)V

    .line 536
    invoke-virtual/range {p0 .. p0}, Ll/ܶܳۧ;->֫֫()V

    const/4 v1, 0x1

    :goto_6
    if-eqz v1, :cond_11

    goto :goto_9

    :cond_11
    cmp-long v1, v9, v13

    if-gez v1, :cond_12

    const/4 v1, 0x1

    goto :goto_7

    :cond_12
    const/4 v1, 0x0

    :goto_7
    if-nez v1, :cond_13

    const-wide/16 v1, 0x7530

    cmp-long v5, v9, v1

    if-gez v5, :cond_15

    .line 898
    iget-object v1, v0, Ll/ܶܳۧ;->ۨ֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 898
    invoke-virtual {v0, v3, v7, v8, v1}, Ll/ܶܳۧ;->֫(Ll/۬᩸֫;JLl/۠ᩴ֫;)V

    :goto_8
    const/4 v1, 0x1

    goto :goto_a

    :cond_13
    const/4 v1, 0x0

    .line 512
    invoke-virtual {v0, v1, v12}, Ll/ܶܳۧ;->֫(II)V

    const/4 v1, 0x0

    .line 81
    throw v1

    :cond_14
    const-wide/16 v1, -0x7530

    cmp-long v3, v9, v1

    if-ltz v3, :cond_17

    :cond_15
    :goto_9
    const/4 v1, 0x0

    :goto_a
    if-eqz v1, :cond_16

    .line 831
    iget-object v2, v0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    iget v2, v0, Ll/ܶܳۧ;->᩻֫:I

    sub-int/2addr v2, v12

    iput v2, v0, Ll/ܶܳۧ;->᩻֫:I

    const/4 v2, 0x0

    .line 832
    iput-object v2, v0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    :cond_16
    return v1

    :cond_17
    const/4 v2, 0x0

    .line 502
    iget-object v1, v0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    iget v3, v1, Ll/ۗ᩹֫;->ۢ:I

    add-int/2addr v3, v12

    iput v3, v1, Ll/ۗ᩹֫;->ۢ:I

    .line 81
    throw v2
.end method

.method private ܽ֫()Z
    .locals 8

    .line 740
    iget-object v0, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    iget v2, p0, Ll/ܶܳۧ;->ۖ֫:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_8

    iget-boolean v2, p0, Ll/ܶܳۧ;->᩶֫:Z

    if-eqz v2, :cond_0

    goto/16 :goto_0

    .line 747
    :cond_0
    iget-object v2, p0, Ll/ܶܳۧ;->᩸֫:Ll/᩸᩸֫;

    if-nez v2, :cond_1

    .line 748
    invoke-interface {v0}, Ll/֨᩸֫;->ܽ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸᩸֫;

    iput-object v0, p0, Ll/ܶܳۧ;->᩸֫:Ll/᩸᩸֫;

    if-nez v0, :cond_1

    goto/16 :goto_0

    .line 754
    :cond_1
    iget-object v0, p0, Ll/ܶܳۧ;->᩸֫:Ll/᩸᩸֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    iget v2, p0, Ll/ܶܳۧ;->ۖ֫:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v5, :cond_2

    const/4 v2, 0x4

    .line 756
    invoke-virtual {v0, v2}, Ll/ۘ᩸֫;->ܿ(I)V

    .line 757
    iget-object v2, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    invoke-interface {v2, v0}, Ll/֨᩸֫;->֫(Ljava/lang/Object;)V

    .line 758
    iput-object v4, p0, Ll/ܶܳۧ;->᩸֫:Ll/᩸᩸֫;

    .line 759
    iput v3, p0, Ll/ܶܳۧ;->ۖ֫:I

    return v1

    .line 763
    :cond_2
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩸()Ll/ۗۙ֫;

    move-result-object v2

    .line 764
    invoke-virtual {p0, v2, v0, v1}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result v3

    const/4 v6, -0x5

    if-eq v3, v6, :cond_7

    const/4 v2, -0x4

    if-eq v3, v2, :cond_4

    const/4 v0, -0x3

    if-ne v3, v0, :cond_3

    goto :goto_0

    .line 791
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 771
    :cond_4
    invoke-virtual {v0}, Ll/ۘ᩸֫;->᩻()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 772
    iput-boolean v5, p0, Ll/ܶܳۧ;->᩶֫:Z

    .line 773
    iget-object v2, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    invoke-interface {v2, v0}, Ll/֨᩸֫;->֫(Ljava/lang/Object;)V

    .line 774
    iput-object v4, p0, Ll/ܶܳۧ;->᩸֫:Ll/᩸᩸֫;

    return v1

    .line 777
    :cond_5
    iget-boolean v2, p0, Ll/ܶܳۧ;->ܽۧ:Z

    if-eqz v2, :cond_6

    .line 778
    iget-wide v2, v0, Ll/᩸᩸֫;->ۤ:J

    iget-object v6, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 778
    iget-object v7, p0, Ll/ܶܳۧ;->֨֫:Ll/᩷֨֫;

    invoke-virtual {v7, v2, v3, v6}, Ll/᩷֨֫;->֫(JLjava/lang/Object;)V

    .line 779
    iput-boolean v1, p0, Ll/ܶܳۧ;->ܽۧ:Z

    .line 781
    :cond_6
    invoke-virtual {v0}, Ll/᩸᩸֫;->ᩴ()V

    .line 782
    iget-object v1, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    iput-object v1, v0, Ll/᩸᩸֫;->ۗ:Ll/۠ᩴ֫;

    .line 784
    iget-object v1, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    invoke-interface {v1, v0}, Ll/֨᩸֫;->֫(Ljava/lang/Object;)V

    .line 785
    iget v0, p0, Ll/ܶܳۧ;->᩻֫:I

    add-int/2addr v0, v5

    iput v0, p0, Ll/ܶܳۧ;->᩻֫:I

    .line 786
    iput-boolean v5, p0, Ll/ܶܳۧ;->ܺ֫:Z

    .line 787
    iget-object v0, p0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    iget v1, v0, Ll/ۗ᩹֫;->᩻:I

    add-int/2addr v1, v5

    iput v1, v0, Ll/ۗ᩹֫;->᩻:I

    .line 788
    iput-object v4, p0, Ll/ܶܳۧ;->᩸֫:Ll/᩸᩸֫;

    return v5

    .line 768
    :cond_7
    invoke-virtual {p0, v2}, Ll/ܶܳۧ;->֫(Ll/ۗۙ֫;)V

    return v5

    :cond_8
    :goto_0
    return v1
.end method

.method private ᩳ֫()V
    .locals 3

    .line 696
    iget-object v0, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 700
    :cond_0
    iget-object v0, p0, Ll/ܶܳۧ;->ۧۧ:Ll/֡ۛ֫;

    .line 691
    iget-object v1, p0, Ll/ܶܳۧ;->ۡ֫:Ll/֡ۛ֫;

    invoke-static {v1, v0}, Ll/ᩴۛ֫;->֫(Ll/֡ۛ֫;Ll/֡ۛ֫;)V

    .line 692
    iput-object v0, p0, Ll/ܶܳۧ;->ۡ֫:Ll/֡ۛ֫;

    if-eqz v0, :cond_1

    .line 704
    invoke-interface {v0}, Ll/֡ۛ֫;->ܽ()Ll/ᩴ᩸֫;

    move-result-object v0

    if-nez v0, :cond_1

    .line 706
    iget-object v0, p0, Ll/ܶܳۧ;->ۡ֫:Ll/֡ۛ֫;

    invoke-interface {v0}, Ll/֡ۛ֫;->getError()Ll/᩵ۛ֫;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const/16 v0, 0xfa1

    .line 718
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 719
    iget-object v1, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    invoke-virtual {p0, v1}, Ll/ܶܳۧ;->ۧ(Ll/۠ᩴ֫;)Ll/֨᩸֫;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;
    :try_end_0
    .catch Ll/۠᩸֫; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 720
    throw v1

    :catch_0
    move-exception v1

    .line 734
    iget-object v2, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    invoke-virtual {p0, v1, v2, v0}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v1

    const-string v2, "Video codec error"

    .line 729
    invoke-static {v2, v1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 730
    iget-object v2, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    invoke-virtual {v2, v1}, Ll/ۧۜۧ;->֫(Ljava/lang/Exception;)V

    .line 731
    iget-object v2, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    invoke-virtual {p0, v1, v2, v0}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public ֫(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;
    .locals 7

    .line 679
    new-instance v6, Ll/۬᩹֫;

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    return-object v6
.end method

.method public final ֫(II)V
    .locals 4

    .line 550
    iget-object v0, p0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    iget v1, v0, Ll/ۗ᩹֫;->ᩳ:I

    add-int/2addr v1, p1

    iput v1, v0, Ll/ۗ᩹֫;->ᩳ:I

    add-int/2addr p1, p2

    .line 552
    iget p2, v0, Ll/ۗ᩹֫;->ܽ:I

    add-int/2addr p2, p1

    iput p2, v0, Ll/ۗ᩹֫;->ܽ:I

    .line 553
    iget p2, p0, Ll/ܶܳۧ;->ᩴ֫:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ܶܳۧ;->ᩴ֫:I

    .line 554
    iget p2, p0, Ll/ܶܳۧ;->ۜ֫:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ܶܳۧ;->ۜ֫:I

    .line 555
    iget p1, v0, Ll/ۗ᩹֫;->ܳ:I

    .line 556
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v0, Ll/ۗ᩹֫;->ܳ:I

    .line 557
    iget p1, p0, Ll/ܶܳۧ;->۬֫:I

    if-lez p1, :cond_0

    iget p2, p0, Ll/ܶܳۧ;->ᩴ֫:I

    if-lt p2, p1, :cond_0

    if-lez p2, :cond_0

    .line 991
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    .line 992
    iget-wide v0, p0, Ll/ܶܳۧ;->ۘ֫:J

    sub-long v0, p1, v0

    .line 993
    iget-object v2, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    iget v3, p0, Ll/ܶܳۧ;->ᩴ֫:I

    invoke-virtual {v2, v3, v0, v1}, Ll/ۧۜۧ;->֫(IJ)V

    const/4 v0, 0x0

    .line 994
    iput v0, p0, Ll/ܶܳۧ;->ᩴ֫:I

    .line 995
    iput-wide p1, p0, Ll/ܶܳۧ;->ۘ֫:J

    :cond_0
    return-void
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_7

    .line 627
    instance-of p1, p2, Landroid/view/Surface;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 628
    move-object p1, p2

    check-cast p1, Landroid/view/Surface;

    iput-object p1, p0, Ll/ܶܳۧ;->۟֫:Landroid/view/Surface;

    .line 629
    iput-object v1, p0, Ll/ܶܳۧ;->ۛ֫:Ll/᩸᩻ۧ;

    .line 630
    iput v0, p0, Ll/ܶܳۧ;->᩺֫:I

    goto :goto_0

    .line 631
    :cond_0
    instance-of p1, p2, Ll/᩸᩻ۧ;

    if-eqz p1, :cond_1

    .line 632
    iput-object v1, p0, Ll/ܶܳۧ;->۟֫:Landroid/view/Surface;

    .line 633
    move-object p1, p2

    check-cast p1, Ll/᩸᩻ۧ;

    iput-object p1, p0, Ll/ܶܳۧ;->ۛ֫:Ll/᩸᩻ۧ;

    const/4 p1, 0x0

    .line 634
    iput p1, p0, Ll/ܶܳۧ;->᩺֫:I

    goto :goto_0

    .line 638
    :cond_1
    iput-object v1, p0, Ll/ܶܳۧ;->۟֫:Landroid/view/Surface;

    .line 639
    iput-object v1, p0, Ll/ܶܳۧ;->ۛ֫:Ll/᩸᩻ۧ;

    const/4 p1, -0x1

    .line 640
    iput p1, p0, Ll/ܶܳۧ;->᩺֫:I

    move-object p2, v1

    .line 642
    :goto_0
    iget-object p1, p0, Ll/ܶܳۧ;->۫֫:Ljava/lang/Object;

    iget-object v2, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    if-eq p1, p2, :cond_5

    .line 643
    iput-object p2, p0, Ll/ܶܳۧ;->۫֫:Ljava/lang/Object;

    if-eqz p2, :cond_4

    .line 984
    iget-object p1, p0, Ll/ܶܳۧ;->֫ۧ:Ll/ۜ֡֫;

    if-eqz p1, :cond_2

    .line 985
    invoke-virtual {v2, p1}, Ll/ۧۜۧ;->֫(Ll/ۜ֡֫;)V

    .line 956
    :cond_2
    iget p1, p0, Ll/ܶܳۧ;->֡֫:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ܶܳۧ;->֡֫:I

    .line 931
    invoke-virtual {p0}, Ll/ۙ᩹֫;->getState()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_8

    const-wide/16 p1, 0x0

    .line 950
    iget-wide v0, p0, Ll/ܶܳۧ;->ܳ֫:J

    cmp-long v2, v0, p1

    if-lez v2, :cond_3

    .line 951
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    add-long/2addr p1, v0

    goto :goto_1

    :cond_3
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 952
    :goto_1
    iput-wide p1, p0, Ll/ܶܳۧ;->ۙ֫:J

    return-void

    .line 937
    :cond_4
    iput-object v1, p0, Ll/ܶܳۧ;->֫ۧ:Ll/ۜ֡֫;

    .line 956
    iget p1, p0, Ll/ܶܳۧ;->֡֫:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ܶܳۧ;->֡֫:I

    return-void

    :cond_5
    if-eqz p2, :cond_8

    .line 984
    iget-object p1, p0, Ll/ܶܳۧ;->֫ۧ:Ll/ۜ֡֫;

    if-eqz p1, :cond_6

    .line 985
    invoke-virtual {v2, p1}, Ll/ۧۜۧ;->֫(Ll/ۜ֡֫;)V

    .line 969
    :cond_6
    iget p1, p0, Ll/ܶܳۧ;->֡֫:I

    const/4 p2, 0x3

    if-ne p1, p2, :cond_8

    iget-object p1, p0, Ll/ܶܳۧ;->۫֫:Ljava/lang/Object;

    if-eqz p1, :cond_8

    .line 970
    invoke-virtual {v2, p1}, Ll/ۧۜۧ;->֫(Ljava/lang/Object;)V

    return-void

    :cond_7
    const/4 v0, 0x7

    if-ne p1, v0, :cond_8

    .line 267
    check-cast p2, Ll/᩹᩻ۧ;

    iput-object p2, p0, Ll/ܶܳۧ;->۠֫:Ll/᩹᩻ۧ;

    :cond_8
    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 191
    iget-boolean p3, p0, Ll/ܶܳۧ;->ܰ֫:Z

    if-eqz p3, :cond_0

    goto :goto_3

    .line 195
    :cond_0
    iget-object p3, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    if-nez p3, :cond_2

    .line 197
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩸()Ll/ۗۙ֫;

    move-result-object p3

    .line 198
    iget-object p4, p0, Ll/ܶܳۧ;->ۚ֫:Ll/᩸᩸֫;

    invoke-virtual {p4}, Ll/᩸᩸֫;->ۧ()V

    .line 199
    iget-object p4, p0, Ll/ܶܳۧ;->ۚ֫:Ll/᩸᩸֫;

    const/4 v0, 0x2

    invoke-virtual {p0, p3, p4, v0}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result p4

    const/4 v0, -0x5

    if-ne p4, v0, :cond_1

    .line 201
    invoke-virtual {p0, p3}, Ll/ܶܳۧ;->֫(Ll/ۗۙ֫;)V

    goto :goto_0

    :cond_1
    const/4 p1, -0x4

    if-ne p4, p1, :cond_5

    .line 204
    iget-object p1, p0, Ll/ܶܳۧ;->ۚ֫:Ll/᩸᩸֫;

    invoke-virtual {p1}, Ll/ۘ᩸֫;->᩻()Z

    move-result p1

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    const/4 p1, 0x1

    .line 205
    iput-boolean p1, p0, Ll/ܶܳۧ;->᩶֫:Z

    .line 206
    iput-boolean p1, p0, Ll/ܶܳۧ;->ܰ֫:Z

    return-void

    .line 215
    :cond_2
    :goto_0
    invoke-direct {p0}, Ll/ܶܳۧ;->ᩳ֫()V

    .line 217
    iget-object p3, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    if-eqz p3, :cond_5

    :try_start_0
    const-string p3, "drainAndFeed"

    .line 38
    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 221
    :goto_1
    invoke-direct {p0, p1, p2}, Ll/ܶܳۧ;->ܽ(J)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_1

    .line 222
    :cond_3
    :goto_2
    invoke-direct {p0}, Ll/ܶܳۧ;->ܽ֫()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    .line 49
    :cond_4
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_0
    .catch Ll/۠᩸֫; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    iget-object p1, p0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    move-object v0, p1

    .line 0
    monitor-enter v0

    .line 133
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Video codec error"

    .line 225
    invoke-static {p2, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 226
    iget-object p2, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    invoke-virtual {p2, p1}, Ll/ۧۜۧ;->֫(Ljava/lang/Exception;)V

    .line 227
    iget-object p2, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    const/16 p3, 0xfa3

    invoke-virtual {p0, p1, p2, p3}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    :cond_5
    :goto_3
    return-void
.end method

.method public final ֫(JZ)V
    .locals 4

    const/4 p1, 0x0

    .line 295
    iput-boolean p1, p0, Ll/ܶܳۧ;->᩶֫:Z

    .line 296
    iput-boolean p1, p0, Ll/ܶܳۧ;->ܰ֫:Z

    const/4 p2, 0x1

    .line 956
    iget v0, p0, Ll/ܶܳۧ;->֡֫:I

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/ܶܳۧ;->֡֫:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 298
    iput-wide v0, p0, Ll/ܶܳۧ;->ܶ֫:J

    .line 299
    iput p1, p0, Ll/ܶܳۧ;->ۜ֫:I

    .line 300
    iget-object p1, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    if-eqz p1, :cond_0

    .line 301
    invoke-virtual {p0}, Ll/ܶܳۧ;->֫֫()V

    :cond_0
    if-eqz p3, :cond_2

    const-wide/16 p1, 0x0

    .line 950
    iget-wide v2, p0, Ll/ܶܳۧ;->ܳ֫:J

    cmp-long p3, v2, p1

    if-lez p3, :cond_1

    .line 951
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    add-long v0, p1, v2

    .line 952
    :cond_1
    iput-wide v0, p0, Ll/ܶܳۧ;->ۙ֫:J

    goto :goto_0

    .line 306
    :cond_2
    iput-wide v0, p0, Ll/ܶܳۧ;->ۙ֫:J

    .line 308
    :goto_0
    iget-object p1, p0, Ll/ܶܳۧ;->֨֫:Ll/᩷֨֫;

    invoke-virtual {p1}, Ll/᩷֨֫;->֫()V

    return-void
.end method

.method public final ֫(Ll/ۗۙ֫;)V
    .locals 8

    const/4 v0, 0x1

    .line 398
    iput-boolean v0, p0, Ll/ܶܳۧ;->ܽۧ:Z

    .line 399
    iget-object v4, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    iget-object p1, p1, Ll/ۗۙ֫;->֫:Ll/֡ۛ֫;

    .line 686
    iget-object v1, p0, Ll/ܶܳۧ;->ۧۧ:Ll/֡ۛ֫;

    invoke-static {v1, p1}, Ll/ᩴۛ֫;->֫(Ll/֡ۛ֫;Ll/֡ۛ֫;)V

    .line 687
    iput-object p1, p0, Ll/ܶܳۧ;->ۧۧ:Ll/֡ۛ֫;

    .line 401
    iget-object v3, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    .line 402
    iput-object v4, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    .line 404
    iget-object v1, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    iget-object v7, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    if-nez v1, :cond_0

    .line 405
    invoke-direct {p0}, Ll/ܶܳۧ;->ᩳ֫()V

    .line 406
    iget-object p1, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 406
    invoke-virtual {v7, p1, v0}, Ll/ۧۜۧ;->֫(Ll/۠ᩴ֫;Ll/۬᩹֫;)V

    return-void

    .line 412
    :cond_0
    iget-object v2, p0, Ll/ܶܳۧ;->ۡ֫:Ll/֡ۛ֫;

    if-eq p1, v2, :cond_1

    .line 413
    new-instance p1, Ll/۬᩹֫;

    .line 415
    invoke-interface {v1}, Ll/֨᩸֫;->getName()Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    const/16 v6, 0x80

    move-object v1, p1

    .line 416
    invoke-direct/range {v1 .. v6}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    goto :goto_0

    .line 421
    :cond_1
    invoke-interface {v1}, Ll/֨᩸֫;->getName()Ljava/lang/String;

    move-result-object p1

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    invoke-virtual {p0, p1, v3, v4}, Ll/ܶܳۧ;->֫(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;

    move-result-object p1

    .line 424
    :goto_0
    iget v1, p1, Ll/۬᩹֫;->ܿ:I

    if-nez v1, :cond_3

    .line 425
    iget-boolean v1, p0, Ll/ܶܳۧ;->ܺ֫:Z

    if-eqz v1, :cond_2

    .line 427
    iput v0, p0, Ll/ܶܳۧ;->ۖ֫:I

    goto :goto_1

    .line 430
    :cond_2
    invoke-virtual {p0}, Ll/ܶܳۧ;->ۧ֫()V

    .line 431
    invoke-direct {p0}, Ll/ܶܳۧ;->ᩳ֫()V

    .line 434
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    invoke-virtual {v7, v0, p1}, Ll/ۧۜۧ;->֫(Ll/۠ᩴ֫;Ll/۬᩹֫;)V

    return-void
.end method

.method public final ֫(Ll/۬᩸֫;JLl/۠ᩴ֫;)V
    .locals 7

    .line 589
    iget-object v0, p0, Ll/ܶܳۧ;->۠֫:Ll/᩹᩻ۧ;

    if-eqz v0, :cond_0

    .line 591
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object v1

    invoke-interface {v1}, Ll/ܽۚ֫;->ᩳ()J

    move-result-wide v3

    const/4 v6, 0x0

    move-wide v1, p2

    move-object v5, p4

    .line 590
    invoke-interface/range {v0 .. v6}, Ll/᩹᩻ۧ;->֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V

    .line 593
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    invoke-static {p2, p3}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide p2

    iput-wide p2, p0, Ll/ܶܳۧ;->ۗ֫:J

    .line 594
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    iget-object p2, p0, Ll/ܶܳۧ;->ۛ֫:Ll/᩸᩻ۧ;

    const/4 p3, 0x1

    const/4 p4, 0x0

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_6

    .line 975
    iget-object v0, p0, Ll/ܶܳۧ;->֫ۧ:Ll/ۜ֡֫;

    iget-object v1, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    if-eqz v0, :cond_2

    iget v2, v0, Ll/ۜ֡֫;->ܽ:I

    if-nez v2, :cond_2

    iget v0, v0, Ll/ۜ֡֫;->֫:I

    if-eqz v0, :cond_3

    .line 978
    :cond_2
    new-instance v0, Ll/ۜ֡֫;

    invoke-direct {v0, p4, p4}, Ll/ۜ֡֫;-><init>(II)V

    iput-object v0, p0, Ll/ܶܳۧ;->֫ۧ:Ll/ۜ֡֫;

    .line 979
    invoke-virtual {v1, v0}, Ll/ۧۜۧ;->֫(Ll/ۜ֡֫;)V

    :cond_3
    if-eqz p2, :cond_4

    .line 602
    iget-object p2, p0, Ll/ܶܳۧ;->ۛ֫:Ll/᩸᩻ۧ;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    invoke-interface {p2, p1}, Ll/᩸᩻ۧ;->֫(Ll/۬᩸֫;)V

    goto :goto_1

    .line 604
    :cond_4
    iget-object p1, p0, Ll/ܶܳۧ;->۟֫:Landroid/view/Surface;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    :goto_1
    iput p4, p0, Ll/ܶܳۧ;->ۜ֫:I

    .line 607
    iget-object p1, p0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    iget p2, p1, Ll/ۗ᩹֫;->ۜ:I

    add-int/2addr p2, p3

    iput p2, p1, Ll/ۗ᩹֫;->ۜ:I

    .line 960
    iget p1, p0, Ll/ܶܳۧ;->֡֫:I

    const/4 p2, 0x3

    if-eq p1, p2, :cond_5

    .line 961
    iput p2, p0, Ll/ܶܳۧ;->֡֫:I

    .line 962
    iget-object p1, p0, Ll/ܶܳۧ;->۫֫:Ljava/lang/Object;

    if-eqz p1, :cond_5

    .line 963
    invoke-virtual {v1, p1}, Ll/ۧۜۧ;->֫(Ljava/lang/Object;)V

    :cond_5
    return-void

    .line 512
    :cond_6
    invoke-virtual {p0, p4, p3}, Ll/ܶܳۧ;->֫(II)V

    const/4 p1, 0x0

    .line 81
    throw p1
.end method

.method public final ֫(ZZ)V
    .locals 1

    .line 278
    new-instance p1, Ll/ۗ᩹֫;

    .line 31
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 278
    iput-object p1, p0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    .line 279
    iget-object v0, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    invoke-virtual {v0, p1}, Ll/ۧۜۧ;->ۧ(Ll/ۗ᩹֫;)V

    .line 283
    iput p2, p0, Ll/ܶܳۧ;->֡֫:I

    return-void
.end method

.method public final ֫([Ll/۠ᩴ֫;JJLl/ܺۧۧ;)V
    .locals 0

    return-void
.end method

.method public final ֫֫()V
    .locals 4

    const/4 v0, 0x0

    .line 356
    iput v0, p0, Ll/ܶܳۧ;->᩻֫:I

    .line 357
    iget v1, p0, Ll/ܶܳۧ;->ۖ֫:I

    if-eqz v1, :cond_0

    .line 358
    invoke-virtual {p0}, Ll/ܶܳۧ;->ۧ֫()V

    .line 359
    invoke-direct {p0}, Ll/ܶܳۧ;->ᩳ֫()V

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 361
    iput-object v1, p0, Ll/ܶܳۧ;->᩸֫:Ll/᩸᩸֫;

    .line 362
    iget-object v2, p0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    if-nez v2, :cond_1

    .line 366
    iget-object v1, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    invoke-interface {v1}, Ll/֨᩸֫;->flush()V

    .line 368
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Ll/֨᩸֫;->ۧ(J)V

    .line 369
    iput-boolean v0, p0, Ll/ܶܳۧ;->ܺ֫:Z

    return-void

    .line 81
    :cond_1
    throw v1
.end method

.method public final ۜ()V
    .locals 1

    .line 288
    iget v0, p0, Ll/ܶܳۧ;->֡֫:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 289
    iput v0, p0, Ll/ܶܳۧ;->֡֫:I

    :cond_0
    return-void
.end method

.method public final ۟()V
    .locals 6

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 320
    iput-wide v0, p0, Ll/ܶܳۧ;->ۙ֫:J

    .line 990
    iget v0, p0, Ll/ܶܳۧ;->ᩴ֫:I

    if-lez v0, :cond_0

    .line 991
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 992
    iget-wide v2, p0, Ll/ܶܳۧ;->ۘ֫:J

    sub-long v2, v0, v2

    .line 993
    iget-object v4, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    iget v5, p0, Ll/ܶܳۧ;->ᩴ֫:I

    invoke-virtual {v4, v5, v2, v3}, Ll/ۧۜۧ;->֫(IJ)V

    const/4 v2, 0x0

    .line 994
    iput v2, p0, Ll/ܶܳۧ;->ᩴ֫:I

    .line 995
    iput-wide v0, p0, Ll/ܶܳۧ;->ۘ֫:J

    :cond_0
    return-void
.end method

.method public final ۤ()V
    .locals 4

    .line 326
    iget-object v0, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    .line 327
    iput-object v1, p0, Ll/ܶܳۧ;->֫ۧ:Ll/ۜ֡֫;

    const/4 v2, 0x0

    .line 956
    iget v3, p0, Ll/ܶܳۧ;->֡֫:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Ll/ܶܳۧ;->֡֫:I

    .line 686
    :try_start_0
    iget-object v2, p0, Ll/ܶܳۧ;->ۧۧ:Ll/֡ۛ֫;

    invoke-static {v2, v1}, Ll/ᩴۛ֫;->֫(Ll/֡ۛ֫;Ll/֡ۛ֫;)V

    .line 687
    iput-object v1, p0, Ll/ܶܳۧ;->ۧۧ:Ll/֡ۛ֫;

    .line 331
    invoke-virtual {p0}, Ll/ܶܳۧ;->ۧ֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 333
    iget-object v1, p0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    invoke-virtual {v0, v1}, Ll/ۧۜۧ;->֫(Ll/ۗ᩹֫;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    invoke-virtual {v0, v2}, Ll/ۧۜۧ;->֫(Ll/ۗ᩹֫;)V

    .line 334
    throw v1
.end method

.method public abstract ۧ(Ll/۠ᩴ֫;)Ll/֨᩸֫;
.end method

.method public final ۧ()Z
    .locals 1

    .line 235
    iget-boolean v0, p0, Ll/ܶܳۧ;->ܰ֫:Z

    return v0
.end method

.method public final ۧ֫()V
    .locals 4

    const/4 v0, 0x0

    .line 376
    iput-object v0, p0, Ll/ܶܳۧ;->᩸֫:Ll/᩸᩸֫;

    .line 377
    iput-object v0, p0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    const/4 v1, 0x0

    .line 378
    iput v1, p0, Ll/ܶܳۧ;->ۖ֫:I

    .line 379
    iput-boolean v1, p0, Ll/ܶܳۧ;->ܺ֫:Z

    .line 380
    iput v1, p0, Ll/ܶܳۧ;->᩻֫:I

    .line 381
    iget-object v1, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    if-eqz v1, :cond_0

    .line 382
    iget-object v2, p0, Ll/ܶܳۧ;->ۢ֫:Ll/ۗ᩹֫;

    iget v3, v2, Ll/ۗ᩹֫;->ۧ:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Ll/ۗ᩹֫;->ۧ:I

    .line 383
    invoke-interface {v1}, Ll/֨᩸֫;->֫()V

    .line 384
    iget-object v1, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    invoke-interface {v1}, Ll/֨᩸֫;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ܶܳۧ;->᩵֫:Ll/ۧۜۧ;

    invoke-virtual {v2, v1}, Ll/ۧۜۧ;->֫(Ljava/lang/String;)V

    .line 385
    iput-object v0, p0, Ll/ܶܳۧ;->᩷֫:Ll/֨᩸֫;

    .line 691
    :cond_0
    iget-object v1, p0, Ll/ܶܳۧ;->ۡ֫:Ll/֡ۛ֫;

    invoke-static {v1, v0}, Ll/ᩴۛ֫;->֫(Ll/֡ۛ֫;Ll/֡ۛ֫;)V

    .line 692
    iput-object v0, p0, Ll/ܶܳۧ;->ۡ֫:Ll/֡ۛ֫;

    return-void
.end method

.method public final ܰ()V
    .locals 2

    const/4 v0, 0x0

    .line 313
    iput v0, p0, Ll/ܶܳۧ;->ᩴ֫:I

    .line 314
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܶܳۧ;->ۘ֫:J

    .line 315
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܶܳۧ;->ۗ֫:J

    return-void
.end method

.method public final ܿ()Z
    .locals 9

    .line 240
    iget-object v0, p0, Ll/ܶܳۧ;->᩹֫:Ll/۠ᩴ֫;

    const/4 v1, 0x1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_2

    .line 241
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܶܳۧ;->ۤ֫:Ll/۬᩸֫;

    if-eqz v0, :cond_2

    :cond_0
    iget v0, p0, Ll/ܶܳۧ;->֡֫:I

    const/4 v4, 0x3

    if-eq v0, v4, :cond_1

    .line 923
    iget v0, p0, Ll/ܶܳۧ;->᩺֫:I

    const/4 v4, -0x1

    if-eq v0, v4, :cond_1

    goto :goto_0

    .line 244
    :cond_1
    iput-wide v2, p0, Ll/ܶܳۧ;->ۙ֫:J

    return v1

    .line 246
    :cond_2
    :goto_0
    iget-wide v4, p0, Ll/ܶܳۧ;->ۙ֫:J

    const/4 v0, 0x0

    cmp-long v6, v4, v2

    if-nez v6, :cond_3

    return v0

    .line 249
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, p0, Ll/ܶܳۧ;->ۙ֫:J

    cmp-long v8, v4, v6

    if-gez v8, :cond_4

    return v1

    .line 254
    :cond_4
    iput-wide v2, p0, Ll/ܶܳۧ;->ۙ֫:J

    return v0
.end method
