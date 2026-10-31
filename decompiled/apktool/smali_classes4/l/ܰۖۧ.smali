.class public final Ll/ܰۖۧ;
.super Ljava/lang/Object;
.source "G8N2"

# interfaces
.implements Ll/֨᩷ۧ;
.implements Ll/ۢۢۧ;


# instance fields
.field public final ֡:Ll/ᩳ֨֫;

.field public ֨:I

.field public ֫:[[J

.field public final ۖ:I

.field public final ۗ:Ll/ᩳ֨֫;

.field public ۘ:Z

.field public ۙ:I

.field public final ۚ:Ll/ᩳ֨֫;

.field public final ۛ:Ljava/util/ArrayList;

.field public final ۜ:Ljava/util/ArrayDeque;

.field public ۠:Z

.field public ۡ:I

.field public ۢ:Ll/᩸᩷ۧ;

.field public final ۤ:Ll/ᩳۘۧ;

.field public ۧ:Ll/ᩳ֨֫;

.field public final ۨ:Ll/ۜᩴۧ;

.field public ۫:Z

.field public ۬:Z

.field public ܳ:I

.field public ܶ:I

.field public ܺ:I

.field public final ܽ:Ll/ᩳ֨֫;

.field public ܿ:J

.field public ᩳ:I

.field public ᩴ:Ll/ܳ۬ܺ;

.field public ᩵:Ll/ۖܺۧ;

.field public ᩶:J

.field public ᩷:J

.field public ᩸:I

.field public ᩹:I

.field public ᩺:[Ll/᩺ۖۧ;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/ۜᩴۧ;I)V
    .locals 1

    .line 306
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 307
    iput-object p1, p0, Ll/ܰۖۧ;->ۨ:Ll/ۜᩴۧ;

    .line 308
    iput p2, p0, Ll/ܰۖۧ;->ۖ:I

    .line 309
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۖۧ;->ᩴ:Ll/ܳ۬ܺ;

    and-int/lit8 p1, p2, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 311
    :goto_0
    iput p1, p0, Ll/ܰۖۧ;->֨:I

    .line 312
    new-instance p1, Ll/ᩳۘۧ;

    invoke-direct {p1}, Ll/ᩳۘۧ;-><init>()V

    iput-object p1, p0, Ll/ܰۖۧ;->ۤ:Ll/ᩳۘۧ;

    .line 313
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܰۖۧ;->ۛ:Ljava/util/ArrayList;

    .line 314
    new-instance p1, Ll/ᩳ֨֫;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ܰۖۧ;->ܽ:Ll/ᩳ֨֫;

    .line 315
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/ܰۖۧ;->ۜ:Ljava/util/ArrayDeque;

    .line 316
    new-instance p1, Ll/ᩳ֨֫;

    sget-object v0, Ll/ܽ۠֫;->ۧ:[B

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object p1, p0, Ll/ܰۖۧ;->ۚ:Ll/ᩳ֨֫;

    .line 317
    new-instance p1, Ll/ᩳ֨֫;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ܰۖۧ;->֡:Ll/ᩳ֨֫;

    .line 318
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ܰۖۧ;->ۗ:Ll/ᩳ֨֫;

    const/4 p1, -0x1

    .line 319
    iput p1, p0, Ll/ܰۖۧ;->ۙ:I

    .line 320
    sget-object p1, Ll/᩸᩷ۧ;->ܿ:Ll/᩸᩷ۧ;

    iput-object p1, p0, Ll/ܰۖۧ;->ۢ:Ll/᩸᩷ۧ;

    new-array p1, p2, [Ll/᩺ۖۧ;

    .line 321
    iput-object p1, p0, Ll/ܰۖۧ;->᩺:[Ll/᩺ۖۧ;

    return-void
.end method

.method private ܽ(J)V
    .locals 31

    move-object/from16 v0, p0

    .line 649
    :cond_0
    :goto_0
    iget-object v1, v0, Ll/ܰۖۧ;->ۜ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-nez v2, :cond_23

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨֨֫;

    iget-wide v5, v2, Ll/֨֨֫;->ܽ:J

    cmp-long v2, v5, p1

    if-nez v2, :cond_23

    .line 650
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ll/֨֨֫;

    .line 651
    iget v2, v5, Ll/ܶ֨֫;->֫:I

    const v6, 0x6d6f6f76

    if-ne v2, v6, :cond_22

    const v2, 0x6d657461

    .line 675
    invoke-virtual {v5, v2}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v2

    .line 676
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x3

    const/4 v8, 0x1

    const-wide/16 v9, 0x0

    .line 677
    iget v13, v0, Ll/ܰۖۧ;->ۖ:I

    if-eqz v2, :cond_a

    .line 678
    invoke-static {v2}, Ll/᩹ۖۧ;->֫(Ll/֨֨֫;)Ll/᩻᩵֫;

    move-result-object v2

    .line 679
    iget-boolean v11, v0, Ll/ܰۖۧ;->۠:Z

    if-eqz v11, :cond_7

    .line 680
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    const-string v6, "auxiliary.tracks.interleaved"

    .line 824
    invoke-static {v2, v6}, Ll/ۤۖۧ;->֫(Ll/᩻᩵֫;Ljava/lang/String;)Ll/֡֨֫;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 826
    iget-object v6, v6, Ll/֡֨֫;->ᩳ:[B

    aget-byte v6, v6, v3

    if-nez v6, :cond_1

    .line 827
    iget-wide v9, v0, Ll/ܰۖۧ;->᩻:J

    const-wide/16 v11, 0x10

    add-long/2addr v9, v11

    iput-wide v9, v0, Ll/ܰۖۧ;->᩶:J

    :cond_1
    const-string v6, "auxiliary.tracks.map"

    .line 836
    invoke-static {v2, v6}, Ll/ۤۖۧ;->֫(Ll/᩻᩵֫;Ljava/lang/String;)Ll/֡֨֫;

    move-result-object v6

    .line 835
    invoke-static {v6}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 837
    invoke-virtual {v6}, Ll/֡֨֫;->ܽ()Ljava/util/ArrayList;

    move-result-object v6

    .line 838
    new-instance v9, Ljava/util/ArrayList;

    .line 839
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v10, 0x0

    .line 840
    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_6

    .line 842
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-eqz v11, :cond_5

    if-eq v11, v8, :cond_4

    if-eq v11, v4, :cond_3

    if-eq v11, v7, :cond_2

    const/4 v11, 0x0

    goto :goto_2

    :cond_2
    const/4 v11, 0x4

    goto :goto_2

    :cond_3
    const/4 v11, 0x3

    goto :goto_2

    :cond_4
    const/4 v11, 0x2

    goto :goto_2

    :cond_5
    const/4 v11, 0x1

    .line 858
    :goto_2
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_6
    move-object v4, v9

    goto :goto_4

    :cond_7
    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    and-int/lit8 v4, v13, 0x40

    if-eqz v4, :cond_9

    const-string v4, "auxiliary.tracks.offset"

    .line 805
    invoke-static {v2, v4}, Ll/ۤۖۧ;->֫(Ll/᩻᩵֫;Ljava/lang/String;)Ll/֡֨֫;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 807
    new-instance v7, Ll/ᩳ֨֫;

    iget-object v4, v4, Ll/֡֨֫;->ᩳ:[B

    invoke-direct {v7, v4}, Ll/ᩳ֨֫;-><init>([B)V

    invoke-virtual {v7}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v11

    cmp-long v4, v11, v9

    if-lez v4, :cond_9

    .line 809
    iput-wide v11, v0, Ll/ܰۖۧ;->᩻:J

    .line 685
    iput-boolean v8, v0, Ll/ܰۖۧ;->۬:Z

    move-object/from16 v23, v1

    goto/16 :goto_16

    :cond_9
    :goto_3
    move-object v4, v6

    goto :goto_4

    :cond_a
    move-object v4, v6

    const/4 v2, 0x0

    .line 691
    :goto_4
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 694
    iget v6, v0, Ll/ܰۖۧ;->ۡ:I

    if-ne v6, v8, :cond_b

    const/4 v6, 0x1

    const/4 v11, 0x1

    goto :goto_5

    :cond_b
    const/4 v6, 0x0

    const/4 v11, 0x0

    .line 695
    :goto_5
    new-instance v12, Ll/۟᩷ۧ;

    invoke-direct {v12}, Ll/۟᩷ۧ;-><init>()V

    const v6, 0x75647461

    .line 697
    invoke-virtual {v5, v6}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v6

    if-eqz v6, :cond_c

    .line 699
    invoke-static {v6}, Ll/᩹ۖۧ;->֫(Ll/۠֨֫;)Ll/᩻᩵֫;

    move-result-object v6

    .line 700
    invoke-virtual {v12, v6}, Ll/۟᩷ۧ;->֫(Ll/᩻᩵֫;)V

    move-object/from16 v16, v6

    goto :goto_6

    :cond_c
    const/16 v16, 0x0

    .line 703
    :goto_6
    new-instance v10, Ll/᩻᩵֫;

    const v6, 0x6d766864

    .line 705
    invoke-virtual {v5, v6}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v6

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    iget-object v6, v6, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    invoke-static {v6}, Ll/᩹ۖۧ;->ܽ(Ll/ᩳ֨֫;)Ll/᩹֨֫;

    move-result-object v6

    new-array v7, v8, [Ll/ܳ᩵֫;

    aput-object v6, v7, v3

    invoke-direct {v10, v7}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    and-int/lit8 v6, v13, 0x1

    if-eqz v6, :cond_d

    const/4 v6, 0x1

    const/16 v17, 0x1

    goto :goto_7

    :cond_d
    const/4 v6, 0x0

    const/16 v17, 0x0

    .line 708
    :goto_7
    new-instance v18, Ll/᩻ᩳᩴ;

    invoke-direct/range {v18 .. v18}, Ljava/lang/Object;-><init>()V

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    move-object v6, v12

    move-object/from16 v19, v10

    move/from16 v10, v17

    move-object v3, v12

    move-object/from16 v12, v18

    .line 709
    invoke-static/range {v5 .. v12}, Ll/᩹ۖۧ;->֫(Ll/֨֨֫;Ll/۟᩷ۧ;JLl/᩵ᩴ֫;ZZLl/ܽܶܺ;)Ljava/util/ArrayList;

    move-result-object v5

    .line 718
    iget-boolean v6, v0, Ll/ܰۖۧ;->۠:Z

    if-eqz v6, :cond_f

    .line 720
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v6, v7, :cond_e

    const/4 v6, 0x1

    goto :goto_8

    :cond_e
    const/4 v6, 0x0

    :goto_8
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 725
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    .line 726
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    const-string v9, ") is not same as the number of auxiliary tracks ("

    const-string v10, ")"

    const-string v11, "The number of auxiliary track types from metadata ("

    .line 0
    invoke-static {v11, v7, v9, v10, v8}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    .line 719
    invoke-static {v7, v6}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    .line 729
    :cond_f
    invoke-static {v5}, Ll/ۛۖۧ;->֫(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v6

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/16 v18, 0x0

    move-wide v8, v7

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v14, -0x1

    .line 730
    :goto_9
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_1c

    .line 731
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۘۧ;

    .line 732
    iget v12, v11, Ll/᩷ۘۧ;->ܿ:I

    move-object/from16 v22, v5

    iget v5, v11, Ll/᩷ۘۧ;->ܽ:I

    if-nez v12, :cond_10

    move-object/from16 v23, v1

    move-object v5, v3

    move-object v11, v4

    move-object v3, v6

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v30, v15

    move-object v15, v2

    move-object/from16 v2, v30

    goto/16 :goto_12

    .line 735
    :cond_10
    iget-object v12, v11, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    move-object/from16 v23, v1

    .line 736
    new-instance v1, Ll/᩺ۖۧ;

    move-object/from16 v24, v15

    iget-object v15, v0, Ll/ܰۖۧ;->ۢ:Ll/᩸᩷ۧ;

    add-int/lit8 v25, v7, 0x1

    move-object/from16 v26, v6

    iget v6, v12, Ll/ܳۘۧ;->ۖ:I

    move-object/from16 v27, v2

    iget-object v2, v12, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    .line 737
    invoke-interface {v15, v7, v6}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v7

    invoke-direct {v1, v12, v11, v7}, Ll/᩺ۖۧ;-><init>(Ll/ܳۘۧ;Ll/᩷ۘۧ;Ll/᩵ۢۧ;)V

    move-object/from16 v28, v3

    move-object v15, v4

    .line 740
    iget-wide v3, v12, Ll/ܳۘۧ;->֫:J

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v29, v3, v20

    if-eqz v29, :cond_11

    goto :goto_a

    :cond_11
    iget-wide v3, v11, Ll/᩷ۘۧ;->֫:J

    .line 741
    :goto_a
    invoke-interface {v7, v3, v4}, Ll/᩵ۢۧ;->֫(J)V

    .line 742
    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    const-string v8, "audio/true-hd"

    .line 745
    iget-object v9, v2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    mul-int/lit8 v5, v5, 0x10

    goto :goto_b

    :cond_12
    add-int/lit8 v5, v5, 0x1e

    .line 754
    :goto_b
    invoke-virtual {v2}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v8

    .line 755
    invoke-virtual {v8, v5}, Ll/֨ᩴ֫;->ۖ(I)V

    const/4 v5, 0x2

    if-ne v6, v5, :cond_16

    .line 757
    iget v5, v2, Ll/۠ᩴ֫;->۟:I

    and-int/lit8 v9, v13, 0x8

    if-eqz v9, :cond_14

    const/4 v9, -0x1

    if-ne v14, v9, :cond_13

    const/4 v9, 0x1

    goto :goto_c

    :cond_13
    const/4 v9, 0x2

    :goto_c
    or-int/2addr v5, v9

    .line 762
    :cond_14
    iget-boolean v9, v0, Ll/ܰۖۧ;->۠:Z

    if-eqz v9, :cond_15

    const v9, 0x8000

    or-int/2addr v5, v9

    move-object v11, v15

    .line 764
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v8, v9}, Ll/֨ᩴ֫;->ۧ(I)V

    goto :goto_d

    :cond_15
    move-object v11, v15

    .line 766
    :goto_d
    invoke-virtual {v8, v5}, Ll/֨ᩴ֫;->ۚ(I)V

    goto :goto_e

    :cond_16
    move-object v11, v15

    :goto_e
    const/4 v5, 0x1

    if-ne v6, v5, :cond_17

    move-object/from16 v5, v28

    .line 109
    iget v9, v5, Ll/۟᩷ۧ;->֫:I

    const/4 v15, -0x1

    move-wide/from16 v28, v3

    if-eq v9, v15, :cond_18

    iget v3, v5, Ll/۟᩷ۧ;->ۧ:I

    if-eq v3, v15, :cond_18

    .line 137
    invoke-virtual {v8, v9}, Ll/֨ᩴ֫;->᩷(I)V

    iget v3, v5, Ll/۟᩷ۧ;->ۧ:I

    .line 138
    invoke-virtual {v8, v3}, Ll/֨ᩴ֫;->ۢ(I)V

    goto :goto_f

    :cond_17
    move-object/from16 v5, v28

    move-wide/from16 v28, v3

    .line 770
    :cond_18
    :goto_f
    iget-object v3, v2, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    .line 775
    iget-object v4, v0, Ll/ܰۖۧ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_19

    const/4 v9, 0x0

    goto :goto_10

    :cond_19
    new-instance v9, Ll/᩻᩵֫;

    invoke-direct {v9, v4}, Ll/᩻᩵֫;-><init>(Ljava/util/List;)V

    :goto_10
    const/4 v4, 0x3

    new-array v4, v4, [Ll/᩻᩵֫;

    aput-object v9, v4, v18

    const/4 v9, 0x1

    aput-object v16, v4, v9

    const/4 v9, 0x2

    aput-object v19, v4, v9

    move-object/from16 v15, v27

    .line 770
    invoke-static {v6, v15, v8, v3, v4}, Ll/ۤۖۧ;->֫(ILl/᩻᩵֫;Ll/֨ᩴ֫;Ll/᩻᩵֫;[Ll/᩻᩵֫;)V

    move-object/from16 v3, v26

    .line 778
    invoke-virtual {v8, v3}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 779
    invoke-virtual {v8}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v4

    .line 780
    iput-object v4, v1, Ll/᩺ۖۧ;->֫:Ll/۠ᩴ֫;

    .line 1276
    iget-boolean v8, v12, Ll/ܳۘۧ;->ܿ:Z

    if-eqz v8, :cond_1a

    iget v8, v12, Ll/ܳۘۧ;->᩷:I

    if-eqz v8, :cond_1a

    iget-object v2, v2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v8, "video/hevc"

    .line 1278
    invoke-static {v2, v8}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    const/4 v2, 0x1

    goto :goto_11

    :cond_1a
    const/4 v2, 0x0

    .line 781
    :goto_11
    iput-boolean v2, v1, Ll/᩺ۖۧ;->ۧ:Z

    .line 782
    invoke-interface {v7, v4}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    const/4 v2, 0x2

    const/4 v4, -0x1

    if-ne v6, v2, :cond_1b

    if-ne v14, v4, :cond_1b

    .line 785
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->size()I

    move-result v14

    :cond_1b
    move-object/from16 v2, v24

    .line 787
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v7, v25

    move-wide/from16 v8, v28

    :goto_12
    add-int/lit8 v10, v10, 0x1

    move-object v6, v3

    move-object v3, v5

    move-object v4, v11

    move-object/from16 v5, v22

    move-object/from16 v1, v23

    move-object/from16 v30, v15

    move-object v15, v2

    move-object/from16 v2, v30

    goto/16 :goto_9

    :cond_1c
    move-object/from16 v23, v1

    move-object v2, v15

    .line 789
    iput v14, v0, Ll/ܰۖۧ;->ܺ:I

    .line 790
    iput-wide v8, v0, Ll/ܰۖۧ;->᩷:J

    const/4 v1, 0x0

    new-array v1, v1, [Ll/᩺ۖۧ;

    .line 791
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/᩺ۖۧ;

    iput-object v1, v0, Ll/ܰۖۧ;->᩺:[Ll/᩺ۖۧ;

    .line 1286
    array-length v2, v1

    new-array v2, v2, [[J

    .line 1287
    array-length v3, v1

    new-array v3, v3, [I

    .line 1288
    array-length v4, v1

    new-array v4, v4, [J

    .line 1289
    array-length v5, v1

    new-array v5, v5, [Z

    const/4 v6, 0x0

    .line 1290
    :goto_13
    array-length v7, v1

    if-ge v6, v7, :cond_1d

    .line 1291
    aget-object v7, v1, v6

    iget-object v7, v7, Ll/᩺ۖۧ;->ᩳ:Ll/᩷ۘۧ;

    iget v7, v7, Ll/᩷ۘۧ;->ܿ:I

    new-array v7, v7, [J

    aput-object v7, v2, v6

    .line 1292
    aget-object v7, v1, v6

    iget-object v7, v7, Ll/᩺ۖۧ;->ᩳ:Ll/᩷ۘۧ;

    iget-object v7, v7, Ll/᩷ۘۧ;->᩻:[J

    const/4 v8, 0x0

    aget-wide v8, v7, v8

    aput-wide v8, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_13

    :cond_1d
    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    .line 1296
    :goto_14
    array-length v9, v1

    if-ge v6, v9, :cond_21

    const-wide v9, 0x7fffffffffffffffL

    const/4 v11, 0x0

    const/4 v12, -0x1

    .line 1299
    :goto_15
    array-length v13, v1

    if-ge v11, v13, :cond_1f

    .line 1300
    aget-boolean v13, v5, v11

    if-nez v13, :cond_1e

    aget-wide v13, v4, v11

    cmp-long v15, v13, v9

    if-gtz v15, :cond_1e

    move v12, v11

    move-wide v9, v13

    :cond_1e
    add-int/lit8 v11, v11, 0x1

    goto :goto_15

    .line 1305
    :cond_1f
    aget v9, v3, v12

    .line 1306
    aget-object v10, v2, v12

    aput-wide v7, v10, v9

    .line 1307
    aget-object v11, v1, v12

    iget-object v11, v11, Ll/᩺ۖۧ;->ᩳ:Ll/᩷ۘۧ;

    iget-object v13, v11, Ll/᩷ۘۧ;->ܳ:[I

    aget v13, v13, v9

    int-to-long v13, v13

    add-long/2addr v7, v13

    const/4 v13, 0x1

    add-int/lit8 v9, v9, 0x1

    .line 1308
    aput v9, v3, v12

    .line 1309
    array-length v10, v10

    if-ge v9, v10, :cond_20

    .line 1310
    iget-object v10, v11, Ll/᩷ۘۧ;->᩻:[J

    aget-wide v9, v10, v9

    aput-wide v9, v4, v12

    goto :goto_14

    .line 1313
    :cond_20
    aput-boolean v13, v5, v12

    add-int/lit8 v6, v6, 0x1

    goto :goto_14

    .line 792
    :cond_21
    iput-object v2, v0, Ll/ܰۖۧ;->֫:[[J

    .line 794
    iget-object v1, v0, Ll/ܰۖۧ;->ۢ:Ll/᩸᩷ۧ;

    invoke-interface {v1}, Ll/᩸᩷ۧ;->ܳ()V

    .line 795
    iget-object v1, v0, Ll/ܰۖۧ;->ۢ:Ll/᩸᩷ۧ;

    invoke-interface {v1, v0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 654
    :goto_16
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayDeque;->clear()V

    .line 655
    iget-boolean v1, v0, Ll/ܰۖۧ;->۬:Z

    if-nez v1, :cond_0

    const/4 v1, 0x2

    .line 656
    iput v1, v0, Ll/ܰۖۧ;->֨:I

    goto/16 :goto_0

    :cond_22
    move-object/from16 v23, v1

    .line 658
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 659
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨֨֫;

    .line 543
    iget-object v1, v1, Ll/֨֨֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 662
    :cond_23
    iget v1, v0, Ll/ܰۖۧ;->֨:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_24

    const/4 v1, 0x0

    .line 522
    iput v1, v0, Ll/ܰۖۧ;->֨:I

    .line 523
    iput v1, v0, Ll/ܰۖۧ;->ᩳ:I

    :cond_24
    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    .line 400
    :goto_0
    iget v3, v1, Ll/ܰۖۧ;->֨:I

    const/16 v4, 0x8

    const v5, 0x66747970

    iget-object v6, v1, Ll/ܰۖۧ;->ۜ:Ljava/util/ArrayDeque;

    iget v7, v1, Ll/ܰۖۧ;->ۖ:I

    const/4 v8, -0x1

    iget-object v9, v1, Ll/ܰۖۧ;->ۗ:Ll/ᩳ֨֫;

    const/4 v10, 0x0

    const/4 v11, 0x2

    const-wide/16 v12, 0x0

    const/4 v14, 0x1

    if-eqz v3, :cond_45

    if-eq v3, v14, :cond_35

    if-eq v3, v11, :cond_1

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    .line 641
    iget-object v3, v1, Ll/ܰۖۧ;->ۤ:Ll/ᩳۘۧ;

    iget-object v4, v1, Ll/ܰۖۧ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2, v0, v4}, Ll/ᩳۘۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;Ljava/util/ArrayList;)V

    .line 642
    iget-wide v2, v0, Ll/᩻ۢۧ;->֫:J

    cmp-long v0, v2, v12

    if-nez v0, :cond_44

    .line 522
    iput v10, v1, Ll/ܰۖۧ;->֨:I

    .line 523
    iput v10, v1, Ll/ܰۖۧ;->ᩳ:I

    return v14

    .line 416
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 879
    :cond_1
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v3

    .line 880
    iget v5, v1, Ll/ܰۖۧ;->ۙ:I

    if-ne v5, v8, :cond_c

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide v10, 0x7fffffffffffffffL

    const/4 v14, 0x1

    const-wide v17, 0x7fffffffffffffffL

    const/16 v19, -0x1

    const/16 v20, -0x1

    const-wide v21, 0x7fffffffffffffffL

    const-wide v23, 0x7fffffffffffffffL

    .line 1184
    :goto_1
    iget-object v8, v1, Ll/ܰۖۧ;->᩺:[Ll/᩺ۖۧ;

    array-length v15, v8

    if-ge v6, v15, :cond_9

    .line 1185
    aget-object v8, v8, v6

    .line 1186
    iget v15, v8, Ll/᩺ۖۧ;->ܽ:I

    .line 1187
    iget-object v8, v8, Ll/᩺ۖۧ;->ᩳ:Ll/᩷ۘۧ;

    iget v12, v8, Ll/᩷ۘۧ;->ܿ:I

    if-ne v15, v12, :cond_2

    goto :goto_4

    .line 1190
    :cond_2
    iget-object v8, v8, Ll/᩷ۘۧ;->ᩳ:[J

    aget-wide v12, v8, v15

    .line 1191
    iget-object v8, v1, Ll/ܰۖۧ;->֫:[[J

    sget-object v16, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    aget-object v8, v8, v6

    aget-wide v15, v8, v15

    sub-long/2addr v12, v3

    const-wide/16 v28, 0x0

    cmp-long v8, v12, v28

    if-ltz v8, :cond_4

    const-wide/32 v26, 0x40000

    cmp-long v8, v12, v26

    if-ltz v8, :cond_3

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v8, 0x1

    :goto_3
    if-nez v8, :cond_5

    if-nez v5, :cond_6

    :cond_5
    if-ne v8, v5, :cond_7

    cmp-long v30, v12, v23

    if-gez v30, :cond_7

    :cond_6
    move/from16 v20, v6

    move v5, v8

    move-wide/from16 v23, v12

    move-wide/from16 v17, v15

    :cond_7
    cmp-long v12, v15, v10

    if-gez v12, :cond_8

    move/from16 v19, v6

    move v14, v8

    move-wide v10, v15

    :cond_8
    :goto_4
    add-int/lit8 v6, v6, 0x1

    const-wide/16 v12, 0x0

    goto :goto_1

    :cond_9
    cmp-long v5, v10, v21

    if-eqz v5, :cond_b

    if-eqz v14, :cond_b

    const-wide/32 v5, 0xa00000

    add-long/2addr v10, v5

    cmp-long v5, v17, v10

    if-gez v5, :cond_a

    goto :goto_5

    :cond_a
    move/from16 v5, v19

    goto :goto_6

    :cond_b
    :goto_5
    move/from16 v5, v20

    .line 881
    :goto_6
    iput v5, v1, Ll/ܰۖۧ;->ۙ:I

    const/4 v6, -0x1

    if-ne v5, v6, :cond_c

    goto/16 :goto_2c

    .line 886
    :cond_c
    iget-object v5, v1, Ll/ܰۖۧ;->᩺:[Ll/᩺ۖۧ;

    iget v6, v1, Ll/ܰۖۧ;->ۙ:I

    aget-object v5, v5, v6

    .line 887
    iget-object v6, v5, Ll/᩺ۖۧ;->ܳ:Ll/᩵ۢۧ;

    iget-object v8, v5, Ll/᩺ۖۧ;->ᩳ:Ll/᩷ۘۧ;

    iget-object v10, v5, Ll/᩺ۖۧ;->ܿ:Ll/ܳۘۧ;

    .line 888
    iget v15, v5, Ll/᩺ۖۧ;->ܽ:I

    .line 889
    iget-object v11, v8, Ll/᩷ۘۧ;->ᩳ:[J

    iget-object v12, v8, Ll/᩷ۘۧ;->ۧ:[I

    iget-object v13, v8, Ll/᩷ۘۧ;->ܳ:[I

    aget-wide v16, v11, v15

    move-object/from16 v18, v8

    move-object v11, v9

    iget-wide v8, v1, Ll/ܰۖۧ;->᩶:J

    add-long v8, v16, v8

    .line 890
    aget v14, v13, v15

    .line 891
    iget-object v0, v5, Ll/᩺ۖۧ;->᩻:Ll/֡ۢۧ;

    sub-long v3, v8, v3

    move-wide/from16 v16, v8

    .line 892
    iget v8, v1, Ll/ܰۖۧ;->ܶ:I

    int-to-long v8, v8

    add-long/2addr v3, v8

    const-wide/16 v8, 0x0

    cmp-long v19, v3, v8

    if-ltz v19, :cond_34

    const-wide/32 v8, 0x40000

    cmp-long v19, v3, v8

    if-ltz v19, :cond_d

    goto/16 :goto_1d

    .line 897
    :cond_d
    iget v8, v10, Ll/ܳۘۧ;->ۡ:I

    iget v9, v10, Ll/ܳۘۧ;->᩷:I

    move-object/from16 v19, v0

    const/4 v0, 0x1

    if-ne v8, v0, :cond_e

    const-wide/16 v16, 0x8

    add-long v3, v3, v16

    add-int/lit8 v14, v14, -0x8

    :cond_e
    long-to-int v0, v3

    .line 903
    invoke-interface {v2, v0}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 905
    iget-boolean v0, v5, Ll/᩺ۖۧ;->ۧ:Z

    if-eqz v0, :cond_21

    iget v0, v1, Ll/ܰۖۧ;->ܶ:I

    if-nez v0, :cond_21

    iget v0, v1, Ll/ܰۖۧ;->᩸:I

    if-nez v0, :cond_21

    iget v0, v1, Ll/ܰۖۧ;->᩹:I

    if-nez v0, :cond_21

    .line 909
    aget v0, v12, v15

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_21

    const/high16 v0, 0x400000

    if-le v14, v0, :cond_f

    const/4 v0, 0x0

    .line 1052
    iput-boolean v0, v5, Ll/᩺ۖۧ;->ۧ:Z

    const/4 v0, 0x0

    move/from16 v25, v7

    move/from16 v16, v9

    move-object/from16 v24, v10

    move-object/from16 v22, v11

    move-object/from16 v21, v12

    move-object/from16 v20, v13

    move/from16 v23, v15

    goto/16 :goto_13

    :cond_f
    const/4 v0, 0x0

    .line 1055
    new-array v3, v14, [B

    .line 1057
    :try_start_0
    invoke-interface {v2, v0, v14, v3}, Ll/۠᩷ۧ;->֫(II[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1059
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    if-lez v9, :cond_20

    const/4 v0, 0x4

    if-le v9, v0, :cond_10

    goto/16 :goto_10

    :cond_10
    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    :goto_7
    if-ge v8, v14, :cond_19

    move-object/from16 v21, v12

    sub-int v12, v14, v8

    if-ge v12, v9, :cond_11

    move/from16 v25, v7

    move/from16 v16, v9

    move-object/from16 v24, v10

    move-object/from16 v22, v11

    goto/16 :goto_f

    :cond_11
    const/4 v12, 0x0

    const/16 v22, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    :goto_8
    if-ge v11, v9, :cond_12

    shl-int/lit8 v12, v12, 0x8

    add-int v23, v8, v11

    move-object/from16 v24, v10

    .line 1148
    aget-byte v10, v3, v23

    and-int/lit16 v10, v10, 0xff

    or-int/2addr v12, v10

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v10, v24

    goto :goto_8

    :cond_12
    move-object/from16 v24, v10

    add-int/2addr v8, v9

    const/4 v10, 0x2

    if-lt v12, v10, :cond_1f

    sub-int v10, v14, v8

    if-le v12, v10, :cond_13

    goto/16 :goto_e

    .line 1160
    :cond_13
    aget-byte v10, v3, v8

    and-int/lit8 v10, v10, 0x7e

    shr-int/lit8 v10, v10, 0x1

    add-int/lit8 v11, v12, 0x4

    add-int/2addr v0, v11

    move/from16 p2, v0

    const/16 v0, 0x20

    if-eq v10, v0, :cond_14

    const/16 v0, 0x21

    if-eq v10, v0, :cond_14

    const/16 v0, 0x22

    if-ne v10, v0, :cond_18

    :cond_14
    add-int/2addr v4, v11

    const/16 v0, 0x20

    if-ne v10, v0, :cond_15

    const/4 v0, 0x1

    goto :goto_9

    :cond_15
    const/4 v0, 0x0

    :goto_9
    or-int v0, v16, v0

    const/16 v11, 0x21

    if-ne v10, v11, :cond_16

    const/4 v11, 0x1

    goto :goto_a

    :cond_16
    const/4 v11, 0x0

    :goto_a
    or-int v11, v17, v11

    move/from16 v16, v0

    const/16 v0, 0x22

    if-ne v10, v0, :cond_17

    const/4 v0, 0x1

    goto :goto_b

    :cond_17
    const/4 v0, 0x0

    :goto_b
    or-int v0, v20, v0

    move/from16 v20, v0

    move/from16 v17, v11

    :cond_18
    add-int/2addr v8, v12

    move/from16 v0, p2

    move-object/from16 v12, v21

    move-object/from16 v11, v22

    move-object/from16 v10, v24

    goto :goto_7

    :cond_19
    move-object/from16 v24, v10

    move-object/from16 v22, v11

    move-object/from16 v21, v12

    if-eqz v16, :cond_1f

    if-eqz v17, :cond_1f

    if-nez v20, :cond_1a

    goto/16 :goto_e

    .line 1104
    :cond_1a
    new-array v0, v0, [B

    .line 1105
    new-array v4, v4, [B

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_c
    if-ge v10, v14, :cond_1e

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object/from16 v20, v13

    const/4 v13, 0x0

    :goto_d
    if-ge v13, v9, :cond_1b

    shl-int/lit8 v12, v12, 0x8

    add-int v16, v10, v13

    move/from16 v23, v15

    .line 1148
    aget-byte v15, v3, v16

    and-int/lit16 v15, v15, 0xff

    or-int/2addr v12, v15

    add-int/lit8 v13, v13, 0x1

    move/from16 v15, v23

    goto :goto_d

    :cond_1b
    move/from16 v23, v15

    add-int/2addr v10, v9

    .line 1160
    aget-byte v13, v3, v10

    and-int/lit8 v13, v13, 0x7e

    shr-int/lit8 v13, v13, 0x1

    .line 1133
    sget-object v15, Ll/ܽ۠֫;->ۧ:[B

    move/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v25, v7

    const/4 v7, 0x4

    invoke-static {v15, v9, v0, v11, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v11, v7

    .line 1140
    invoke-static {v3, v10, v0, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v11, v12

    const/16 v9, 0x20

    if-eq v13, v9, :cond_1c

    const/16 v9, 0x21

    if-eq v13, v9, :cond_1c

    const/16 v9, 0x22

    if-ne v13, v9, :cond_1d

    :cond_1c
    const/4 v9, 0x0

    .line 1133
    invoke-static {v15, v9, v4, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v8, v8, 0x4

    .line 1140
    invoke-static {v3, v10, v4, v8, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v8, v12

    :cond_1d
    add-int/2addr v10, v12

    move/from16 v9, v16

    move-object/from16 v13, v20

    move/from16 v15, v23

    move/from16 v7, v25

    goto :goto_c

    :cond_1e
    move/from16 v25, v7

    move/from16 v16, v9

    move-object/from16 v20, v13

    move/from16 v23, v15

    .line 1128
    new-instance v3, Ll/ۨۖۧ;

    invoke-direct {v3, v4, v0}, Ll/ۨۖۧ;-><init>([B[B)V

    move-object v0, v3

    goto :goto_12

    :cond_1f
    :goto_e
    move/from16 v25, v7

    move/from16 v16, v9

    :goto_f
    move-object/from16 v20, v13

    move/from16 v23, v15

    goto :goto_11

    :cond_20
    :goto_10
    move/from16 v25, v7

    move/from16 v16, v9

    move-object/from16 v24, v10

    move-object/from16 v22, v11

    move-object/from16 v21, v12

    goto :goto_f

    :goto_11
    const/4 v0, 0x0

    :goto_12
    const/4 v3, 0x0

    .line 1064
    iput-boolean v3, v5, Ll/᩺ۖۧ;->ۧ:Z

    :goto_13
    if-eqz v0, :cond_22

    .line 912
    iget-object v3, v0, Ll/ۨۖۧ;->ۧ:[B

    .line 913
    iget-object v4, v5, Ll/᩺ۖۧ;->֫:Ll/۠ᩴ֫;

    .line 915
    invoke-virtual {v4}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v4

    iget-object v0, v0, Ll/ۨۖۧ;->֫:[B

    .line 916
    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 917
    invoke-virtual {v4}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 918
    iput-object v0, v5, Ll/᩺ۖۧ;->֫:Ll/۠ᩴ֫;

    .line 919
    invoke-interface {v6, v0}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 920
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0, v3}, Ll/ᩳ֨֫;-><init>([B)V

    array-length v4, v3

    invoke-interface {v6, v4, v0}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 923
    invoke-interface {v2, v14}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 924
    iput v14, v1, Ll/ܰۖۧ;->ܶ:I

    .line 925
    array-length v0, v3

    iput v0, v1, Ll/ܰۖۧ;->᩸:I

    .line 926
    array-length v14, v3

    const/4 v0, 0x0

    .line 927
    iput v0, v1, Ll/ܰۖۧ;->᩹:I

    const/4 v0, 0x1

    .line 928
    iput-boolean v0, v1, Ll/ܰۖۧ;->ۘ:Z

    goto :goto_14

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 1059
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 1060
    throw v3

    :cond_21
    move/from16 v25, v7

    move/from16 v16, v9

    move-object/from16 v24, v10

    move-object/from16 v22, v11

    move-object/from16 v21, v12

    move-object/from16 v20, v13

    move/from16 v23, v15

    :cond_22
    const/4 v0, 0x0

    :goto_14
    if-nez v0, :cond_25

    .line 933
    iget-object v3, v5, Ll/᩺ۖۧ;->֫:Ll/۠ᩴ֫;

    .line 1266
    iget-object v4, v3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v7, "video/avc"

    invoke-static {v4, v7}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_23

    and-int/lit8 v3, v25, 0x20

    if-eqz v3, :cond_24

    goto :goto_15

    .line 1269
    :cond_23
    iget-object v3, v3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v4, "video/hevc"

    invoke-static {v3, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_24

    move/from16 v3, v25

    and-int/lit16 v3, v3, 0x80

    if-eqz v3, :cond_24

    goto :goto_15

    :cond_24
    const/4 v3, 0x1

    .line 934
    iput-boolean v3, v1, Ll/ܰۖۧ;->ۘ:Z

    goto :goto_16

    :cond_25
    :goto_15
    const/4 v3, 0x1

    :goto_16
    if-eqz v0, :cond_26

    goto/16 :goto_19

    :cond_26
    if-eqz v16, :cond_2c

    .line 941
    iget-object v0, v1, Ll/ܰۖۧ;->֡:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    const/4 v7, 0x0

    .line 942
    aput-byte v7, v4, v7

    .line 943
    aput-byte v7, v4, v3

    const/4 v3, 0x2

    .line 944
    aput-byte v7, v4, v3

    rsub-int/lit8 v3, v16, 0x4

    add-int/2addr v14, v3

    .line 950
    :cond_27
    :goto_17
    iget v7, v1, Ll/ܰۖۧ;->᩸:I

    if-ge v7, v14, :cond_2b

    .line 951
    iget v7, v1, Ll/ܰۖۧ;->᩹:I

    if-nez v7, :cond_2a

    .line 954
    iget-boolean v7, v1, Ll/ܰۖۧ;->ۘ:Z

    if-nez v7, :cond_28

    iget-object v7, v5, Ll/᩺ۖۧ;->֫:Ll/۠ᩴ֫;

    .line 955
    invoke-static {v7}, Ll/ܽ۠֫;->֫(Ll/۠ᩴ֫;)I

    move-result v7

    add-int v7, v7, v16

    aget v8, v20, v23

    iget v9, v1, Ll/ܰۖۧ;->ܶ:I

    sub-int/2addr v8, v9

    if-gt v7, v8, :cond_28

    .line 961
    iget-object v7, v5, Ll/᩺ۖۧ;->֫:Ll/۠ᩴ֫;

    .line 962
    invoke-static {v7}, Ll/ܽ۠֫;->֫(Ll/۠ᩴ֫;)I

    move-result v7

    add-int v9, v16, v7

    goto :goto_18

    :cond_28
    const/4 v7, 0x0

    move/from16 v9, v16

    .line 967
    :goto_18
    invoke-interface {v2, v4, v3, v9}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 968
    iget v8, v1, Ll/ܰۖۧ;->ܶ:I

    add-int/2addr v8, v9

    iput v8, v1, Ll/ܰۖۧ;->ܶ:I

    const/4 v8, 0x0

    .line 969
    invoke-virtual {v0, v8}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 970
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    if-ltz v9, :cond_29

    sub-int/2addr v9, v7

    .line 975
    iput v9, v1, Ll/ܰۖۧ;->᩹:I

    .line 978
    iget-object v9, v1, Ll/ܰۖۧ;->ۚ:Ll/ᩳ֨֫;

    invoke-virtual {v9, v8}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v8, 0x4

    .line 979
    invoke-interface {v6, v8, v9}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 980
    iget v9, v1, Ll/ܰۖۧ;->᩸:I

    add-int/2addr v9, v8

    iput v9, v1, Ll/ܰۖۧ;->᩸:I

    if-lez v7, :cond_27

    .line 983
    invoke-interface {v6, v7, v0}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 984
    iget v8, v1, Ll/ܰۖۧ;->᩸:I

    add-int/2addr v8, v7

    iput v8, v1, Ll/ܰۖۧ;->᩸:I

    .line 987
    iget-object v8, v5, Ll/᩺ۖۧ;->֫:Ll/۠ᩴ֫;

    invoke-static {v4, v7, v8}, Ll/ܽ۠֫;->֫([BILl/۠ᩴ֫;)Z

    move-result v7

    if-eqz v7, :cond_27

    const/4 v7, 0x1

    .line 992
    iput-boolean v7, v1, Ll/ܰۖۧ;->ۘ:Z

    goto :goto_17

    :cond_29
    const-string v0, "Invalid NAL length"

    const/4 v2, 0x0

    .line 972
    invoke-static {v0, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_2a
    const/4 v8, 0x0

    .line 997
    invoke-interface {v6, v2, v7, v8}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result v7

    .line 998
    iget v8, v1, Ll/ܰۖۧ;->ܶ:I

    add-int/2addr v8, v7

    iput v8, v1, Ll/ܰۖۧ;->ܶ:I

    .line 999
    iget v8, v1, Ll/ܰۖۧ;->᩸:I

    add-int/2addr v8, v7

    iput v8, v1, Ll/ܰۖۧ;->᩸:I

    .line 1000
    iget v8, v1, Ll/ܰۖۧ;->᩹:I

    sub-int/2addr v8, v7

    iput v8, v1, Ll/ܰۖۧ;->᩹:I

    goto :goto_17

    :cond_2b
    :goto_19
    move v2, v14

    move-object/from16 v0, v19

    goto :goto_1b

    :cond_2c
    move-object/from16 v0, v24

    .line 1004
    iget-object v0, v0, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v3, "audio/ac4"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 1005
    iget v0, v1, Ll/ܰۖۧ;->᩸:I

    if-nez v0, :cond_2d

    move-object/from16 v0, v22

    .line 1006
    invoke-static {v14, v0}, Ll/ܰۜۧ;->֫(ILl/ᩳ֨֫;)V

    const/4 v3, 0x7

    .line 1007
    invoke-interface {v6, v3, v0}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 1008
    iget v0, v1, Ll/ܰۖۧ;->᩸:I

    add-int/2addr v0, v3

    iput v0, v1, Ll/ܰۖۧ;->᩸:I

    :cond_2d
    add-int/lit8 v14, v14, 0x7

    move-object/from16 v0, v19

    goto :goto_1a

    :cond_2e
    move-object/from16 v0, v19

    if-eqz v19, :cond_2f

    .line 1012
    invoke-virtual {v0, v2}, Ll/֡ۢۧ;->֫(Ll/۠᩷ۧ;)V

    .line 1015
    :cond_2f
    :goto_1a
    iget v3, v1, Ll/ܰۖۧ;->᩸:I

    if-ge v3, v14, :cond_30

    sub-int v3, v14, v3

    const/4 v4, 0x0

    .line 1016
    invoke-interface {v6, v2, v3, v4}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result v3

    .line 1017
    iget v4, v1, Ll/ܰۖۧ;->ܶ:I

    add-int/2addr v4, v3

    iput v4, v1, Ll/ܰۖۧ;->ܶ:I

    .line 1018
    iget v4, v1, Ll/ܰۖۧ;->᩸:I

    add-int/2addr v4, v3

    iput v4, v1, Ll/ܰۖۧ;->᩸:I

    .line 1019
    iget v4, v1, Ll/ܰۖۧ;->᩹:I

    sub-int/2addr v4, v3

    iput v4, v1, Ll/ܰۖۧ;->᩹:I

    goto :goto_1a

    :cond_30
    move v2, v14

    :goto_1b
    move-object/from16 v3, v18

    .line 1023
    iget-object v4, v3, Ll/᩷ۘۧ;->᩻:[J

    aget-wide v7, v4, v23

    .line 1024
    aget v4, v21, v23

    .line 1025
    iget-boolean v9, v1, Ll/ܰۖۧ;->ۘ:Z

    if-nez v9, :cond_31

    const/high16 v9, 0x4000000

    or-int/2addr v4, v9

    :cond_31
    if-eqz v0, :cond_32

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v10, v0

    move-object v11, v6

    move-wide v12, v7

    move v14, v4

    move/from16 v4, v23

    move v15, v2

    .line 1029
    invoke-virtual/range {v10 .. v17}, Ll/֡ۢۧ;->֫(Ll/᩵ۢۧ;JIIILl/ᩴۢۧ;)V

    const/4 v2, 0x1

    add-int/lit8 v15, v4, 0x1

    .line 1031
    iget v3, v3, Ll/᩷ۘۧ;->ܿ:I

    if-ne v15, v3, :cond_33

    const/4 v3, 0x0

    .line 1032
    invoke-virtual {v0, v6, v3}, Ll/֡ۢۧ;->֫(Ll/᩵ۢۧ;Ll/ᩴۢۧ;)V

    goto :goto_1c

    :cond_32
    const/4 v0, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v10, v6

    move-wide v11, v7

    move v13, v4

    move v14, v2

    .line 1035
    invoke-interface/range {v10 .. v16}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    const/4 v2, 0x1

    .line 1039
    :cond_33
    :goto_1c
    iget v0, v5, Ll/᩺ۖۧ;->ܽ:I

    add-int/2addr v0, v2

    iput v0, v5, Ll/᩺ۖۧ;->ܽ:I

    const/4 v0, -0x1

    .line 1040
    iput v0, v1, Ll/ܰۖۧ;->ۙ:I

    const/4 v0, 0x0

    .line 1041
    iput v0, v1, Ll/ܰۖۧ;->ܶ:I

    .line 1042
    iput v0, v1, Ll/ܰۖۧ;->᩸:I

    .line 1043
    iput v0, v1, Ll/ܰۖۧ;->᩹:I

    .line 1044
    iput-boolean v0, v1, Ll/ܰۖۧ;->ۘ:Z

    return v0

    :cond_34
    :goto_1d
    const/4 v0, 0x1

    move-object/from16 v7, p2

    move-wide/from16 v2, v16

    .line 894
    iput-wide v2, v7, Ll/᩻ۢۧ;->֫:J

    return v0

    :cond_35
    move-object v7, v0

    .line 603
    iget-wide v8, v1, Ll/ܰۖۧ;->ܿ:J

    iget v0, v1, Ll/ܰۖۧ;->ᩳ:I

    int-to-long v10, v0

    sub-long/2addr v8, v10

    .line 604
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    add-long/2addr v10, v8

    .line 606
    iget-object v0, v1, Ll/ܰۖۧ;->ۧ:Ll/ᩳ֨֫;

    if-eqz v0, :cond_3e

    .line 608
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    iget v12, v1, Ll/ܰۖۧ;->ᩳ:I

    long-to-int v9, v8

    invoke-interface {v2, v3, v12, v9}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 609
    iget v3, v1, Ll/ܰۖۧ;->ܳ:I

    if-ne v3, v5, :cond_3d

    const/4 v3, 0x1

    .line 610
    iput-boolean v3, v1, Ll/ܰۖۧ;->۫:Z

    .line 1366
    invoke-virtual {v0, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1367
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    const v4, 0x71742020

    const v5, 0x68656963

    if-eq v3, v5, :cond_37

    if-eq v3, v4, :cond_36

    const/4 v3, 0x0

    goto :goto_1e

    :cond_36
    const/4 v3, 0x1

    goto :goto_1e

    :cond_37
    const/4 v3, 0x2

    :goto_1e
    if-eqz v3, :cond_38

    goto :goto_20

    :cond_38
    const/4 v3, 0x4

    .line 1372
    invoke-virtual {v0, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1373
    :cond_39
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    if-lez v3, :cond_3c

    .line 1374
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    if-eq v3, v5, :cond_3b

    if-eq v3, v4, :cond_3a

    const/4 v3, 0x0

    goto :goto_1f

    :cond_3a
    const/4 v3, 0x1

    goto :goto_1f

    :cond_3b
    const/4 v3, 0x2

    :goto_1f
    if-eqz v3, :cond_39

    goto :goto_20

    :cond_3c
    const/4 v3, 0x0

    .line 611
    :goto_20
    iput v3, v1, Ll/ܰۖۧ;->ۡ:I

    goto :goto_21

    .line 612
    :cond_3d
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_40

    .line 613
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨֨֫;

    new-instance v4, Ll/۠֨֫;

    iget v5, v1, Ll/ܰۖۧ;->ܳ:I

    invoke-direct {v4, v5, v0}, Ll/۠֨֫;-><init>(ILl/ᩳ֨֫;)V

    .line 534
    iget-object v0, v3, Ll/֨֨֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_21

    .line 616
    :cond_3e
    iget-boolean v0, v1, Ll/ܰۖۧ;->۫:Z

    if-nez v0, :cond_3f

    iget v0, v1, Ll/ܰۖۧ;->ܳ:I

    const v3, 0x6d646174

    if-ne v0, v3, :cond_3f

    const/4 v0, 0x1

    .line 619
    iput v0, v1, Ll/ܰۖۧ;->ۡ:I

    :cond_3f
    const-wide/32 v3, 0x40000

    cmp-long v0, v8, v3

    if-gez v0, :cond_41

    long-to-int v0, v8

    .line 623
    invoke-interface {v2, v0}, Ll/۠᩷ۧ;->ܽ(I)V

    :cond_40
    :goto_21
    const/4 v0, 0x0

    goto :goto_22

    .line 625
    :cond_41
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v3

    add-long/2addr v3, v8

    iput-wide v3, v7, Ll/᩻ۢۧ;->֫:J

    const/4 v0, 0x1

    .line 629
    :goto_22
    invoke-direct {v1, v10, v11}, Ll/ܰۖۧ;->ܽ(J)V

    .line 630
    iget-boolean v3, v1, Ll/ܰۖۧ;->۬:Z

    if-eqz v3, :cond_42

    const/4 v0, 0x1

    .line 631
    iput-boolean v0, v1, Ll/ܰۖۧ;->۠:Z

    .line 632
    iget-wide v3, v1, Ll/ܰۖۧ;->᩻:J

    iput-wide v3, v7, Ll/᩻ۢۧ;->֫:J

    const/4 v0, 0x0

    .line 634
    iput-boolean v0, v1, Ll/ܰۖۧ;->۬:Z

    const/4 v0, 0x1

    :cond_42
    if-eqz v0, :cond_43

    .line 636
    iget v0, v1, Ll/ܰۖۧ;->֨:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_43

    const/4 v0, 0x1

    goto :goto_23

    :cond_43
    const/4 v0, 0x0

    :goto_23
    if-eqz v0, :cond_56

    :cond_44
    const/4 v0, 0x1

    return v0

    :cond_45
    move v3, v7

    move-object v7, v0

    move-object v0, v9

    const/4 v8, 0x1

    .line 527
    iget v9, v1, Ll/ܰۖۧ;->ᩳ:I

    iget-object v10, v1, Ll/ܰۖۧ;->ܽ:Ll/ᩳ֨֫;

    if-nez v9, :cond_49

    .line 529
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v9

    const/4 v11, 0x0

    invoke-interface {v2, v8, v11, v4, v9}, Ll/۠᩷ۧ;->֫(ZII[B)Z

    move-result v8

    if-nez v8, :cond_48

    .line 1227
    iget v0, v1, Ll/ܰۖۧ;->ۡ:I

    const/4 v4, 0x2

    if-ne v0, v4, :cond_47

    and-int/lit8 v0, v3, 0x2

    if-eqz v0, :cond_47

    .line 1229
    iget-object v0, v1, Ll/ܰۖۧ;->ۢ:Ll/᩸᩷ۧ;

    const/4 v3, 0x4

    invoke-interface {v0, v11, v3}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    .line 1231
    iget-object v3, v1, Ll/ܰۖۧ;->᩵:Ll/ۖܺۧ;

    if-nez v3, :cond_46

    const/4 v3, 0x0

    goto :goto_24

    :cond_46
    new-instance v4, Ll/᩻᩵֫;

    const/4 v5, 0x1

    new-array v5, v5, [Ll/ܳ᩵֫;

    aput-object v3, v5, v11

    invoke-direct {v4, v5}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    move-object v3, v4

    .line 1232
    :goto_24
    new-instance v4, Ll/֨ᩴ֫;

    invoke-direct {v4}, Ll/֨ᩴ֫;-><init>()V

    invoke-virtual {v4, v3}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    invoke-virtual {v4}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v3

    invoke-interface {v0, v3}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 1233
    iget-object v0, v1, Ll/ܰۖۧ;->ۢ:Ll/᩸᩷ۧ;

    invoke-interface {v0}, Ll/᩸᩷ۧ;->ܳ()V

    .line 1234
    iget-object v0, v1, Ll/ܰۖۧ;->ۢ:Ll/᩸᩷ۧ;

    new-instance v3, Ll/᩷ۢۧ;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v3, v4, v5}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {v0, v3}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    :cond_47
    const/4 v0, 0x0

    goto/16 :goto_2b

    .line 533
    :cond_48
    iput v4, v1, Ll/ܰۖۧ;->ᩳ:I

    const/4 v3, 0x0

    .line 534
    invoke-virtual {v10, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 535
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v8

    iput-wide v8, v1, Ll/ܰۖۧ;->ܿ:J

    .line 536
    invoke-virtual {v10}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    iput v3, v1, Ll/ܰۖۧ;->ܳ:I

    .line 539
    :cond_49
    iget-wide v8, v1, Ll/ܰۖۧ;->ܿ:J

    const-wide/16 v11, 0x1

    cmp-long v3, v8, v11

    if-nez v3, :cond_4a

    .line 542
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    invoke-interface {v2, v3, v4, v4}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 543
    iget v3, v1, Ll/ܰۖۧ;->ᩳ:I

    add-int/2addr v3, v4

    iput v3, v1, Ll/ܰۖۧ;->ᩳ:I

    .line 544
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v8

    iput-wide v8, v1, Ll/ܰۖۧ;->ܿ:J

    goto :goto_25

    :cond_4a
    const-wide/16 v11, 0x0

    cmp-long v3, v8, v11

    if-nez v3, :cond_4c

    .line 548
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v8

    const-wide/16 v11, -0x1

    cmp-long v3, v8, v11

    if-nez v3, :cond_4b

    .line 550
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨֨֫;

    if-eqz v3, :cond_4b

    .line 552
    iget-wide v8, v3, Ll/֨֨֫;->ܽ:J

    :cond_4b
    cmp-long v3, v8, v11

    if-eqz v3, :cond_4c

    .line 556
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v11

    sub-long/2addr v8, v11

    iget v3, v1, Ll/ܰۖۧ;->ᩳ:I

    int-to-long v11, v3

    add-long/2addr v8, v11

    iput-wide v8, v1, Ll/ܰۖۧ;->ܿ:J

    .line 560
    :cond_4c
    :goto_25
    iget-wide v8, v1, Ll/ܰۖۧ;->ܿ:J

    iget v3, v1, Ll/ܰۖۧ;->ᩳ:I

    int-to-long v11, v3

    cmp-long v13, v8, v11

    if-ltz v13, :cond_57

    .line 565
    iget v8, v1, Ll/ܰۖۧ;->ܳ:I

    const v9, 0x6d6f6f76

    const v11, 0x6d657461

    if-eq v8, v9, :cond_53

    const v9, 0x7472616b

    if-eq v8, v9, :cond_53

    const v9, 0x6d646961

    if-eq v8, v9, :cond_53

    const v9, 0x6d696e66

    if-eq v8, v9, :cond_53

    const v9, 0x7374626c

    if-eq v8, v9, :cond_53

    const v9, 0x65647473

    if-eq v8, v9, :cond_53

    if-eq v8, v11, :cond_53

    const v9, 0x61787465

    if-ne v8, v9, :cond_4d

    goto/16 :goto_29

    :cond_4d
    const v0, 0x6d646864

    if-eq v8, v0, :cond_50

    const v0, 0x6d766864

    if-eq v8, v0, :cond_50

    const v0, 0x68646c72    # 4.3148E24f

    if-eq v8, v0, :cond_50

    const v0, 0x73747364

    if-eq v8, v0, :cond_50

    const v0, 0x73747473

    if-eq v8, v0, :cond_50

    const v0, 0x73747373

    if-eq v8, v0, :cond_50

    const v0, 0x63747473

    if-eq v8, v0, :cond_50

    const v0, 0x656c7374

    if-eq v8, v0, :cond_50

    const v0, 0x73747363

    if-eq v8, v0, :cond_50

    const v0, 0x7374737a

    if-eq v8, v0, :cond_50

    const v0, 0x73747a32

    if-eq v8, v0, :cond_50

    const v0, 0x7374636f

    if-eq v8, v0, :cond_50

    const v0, 0x636f3634

    if-eq v8, v0, :cond_50

    const v0, 0x746b6864

    if-eq v8, v0, :cond_50

    if-eq v8, v5, :cond_50

    const v0, 0x75647461

    if-eq v8, v0, :cond_50

    const v0, 0x6b657973

    if-eq v8, v0, :cond_50

    const v0, 0x696c7374

    if-ne v8, v0, :cond_4e

    goto :goto_26

    .line 587
    :cond_4e
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v3

    iget v0, v1, Ll/ܰۖۧ;->ᩳ:I

    int-to-long v5, v0

    sub-long v11, v3, v5

    .line 1248
    iget v0, v1, Ll/ܰۖۧ;->ܳ:I

    const v3, 0x6d707664

    if-ne v0, v3, :cond_4f

    .line 1251
    new-instance v0, Ll/ۖܺۧ;

    add-long v15, v11, v5

    iget-wide v3, v1, Ll/ܰۖۧ;->ܿ:J

    sub-long v17, v3, v5

    const-wide/16 v9, 0x0

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    move-object v8, v0

    invoke-direct/range {v8 .. v18}, Ll/ۖܺۧ;-><init>(JJJJJ)V

    iput-object v0, v1, Ll/ܰۖۧ;->᩵:Ll/ۖܺۧ;

    :cond_4f
    const/4 v0, 0x0

    .line 588
    iput-object v0, v1, Ll/ܰۖۧ;->ۧ:Ll/ᩳ֨֫;

    const/4 v0, 0x1

    .line 589
    iput v0, v1, Ll/ܰۖۧ;->֨:I

    goto/16 :goto_2a

    :cond_50
    :goto_26
    if-ne v3, v4, :cond_51

    const/4 v0, 0x1

    goto :goto_27

    :cond_51
    const/4 v0, 0x0

    .line 580
    :goto_27
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 581
    iget-wide v5, v1, Ll/ܰۖۧ;->ܿ:J

    const-wide/32 v8, 0x7fffffff

    cmp-long v0, v5, v8

    if-gtz v0, :cond_52

    const/4 v0, 0x1

    goto :goto_28

    :cond_52
    const/4 v0, 0x0

    :goto_28
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 582
    new-instance v0, Ll/ᩳ֨֫;

    iget-wide v5, v1, Ll/ܰۖۧ;->ܿ:J

    long-to-int v3, v5

    invoke-direct {v0, v3}, Ll/ᩳ֨֫;-><init>(I)V

    .line 583
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v3, v6, v5, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 584
    iput-object v0, v1, Ll/ܰۖۧ;->ۧ:Ll/ᩳ֨֫;

    const/4 v0, 0x1

    .line 585
    iput v0, v1, Ll/ܰۖۧ;->֨:I

    goto :goto_2a

    .line 566
    :cond_53
    :goto_29
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v8

    iget-wide v12, v1, Ll/ܰۖۧ;->ܿ:J

    add-long/2addr v8, v12

    iget v3, v1, Ll/ܰۖۧ;->ᩳ:I

    int-to-long v14, v3

    sub-long/2addr v8, v14

    cmp-long v3, v12, v14

    if-eqz v3, :cond_54

    .line 567
    iget v3, v1, Ll/ܰۖۧ;->ܳ:I

    if-ne v3, v11, :cond_54

    .line 1239
    invoke-virtual {v0, v4}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 1240
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    const/4 v5, 0x0

    invoke-interface {v2, v5, v4, v3}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 1241
    invoke-static {v0}, Ll/᩹ۖۧ;->֫(Ll/ᩳ֨֫;)V

    .line 1242
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    invoke-interface {v2, v0}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 1243
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 570
    :cond_54
    new-instance v0, Ll/֨֨֫;

    iget v3, v1, Ll/ܰۖۧ;->ܳ:I

    invoke-direct {v0, v3, v8, v9}, Ll/֨֨֫;-><init>(IJ)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 571
    iget-wide v3, v1, Ll/ܰۖۧ;->ܿ:J

    iget v0, v1, Ll/ܰۖۧ;->ᩳ:I

    int-to-long v5, v0

    cmp-long v0, v3, v5

    if-nez v0, :cond_55

    .line 572
    invoke-direct {v1, v8, v9}, Ll/ܰۖۧ;->ܽ(J)V

    goto :goto_2a

    :cond_55
    const/4 v0, 0x0

    .line 522
    iput v0, v1, Ll/ܰۖۧ;->֨:I

    .line 523
    iput v0, v1, Ll/ܰۖۧ;->ᩳ:I

    :goto_2a
    const/4 v0, 0x1

    :goto_2b
    if-nez v0, :cond_56

    :goto_2c
    const/4 v0, -0x1

    return v0

    :cond_56
    move-object v0, v7

    goto/16 :goto_0

    :cond_57
    const-string v0, "Atom size less than header length (unsupported)."

    .line 561
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0
.end method

.method public final ֫(J)Ll/ۜۢۧ;
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 451
    iget-object v3, v0, Ll/ܰۖۧ;->᩺:[Ll/᩺ۖۧ;

    array-length v4, v3

    sget-object v5, Ll/ۡۢۧ;->ܽ:Ll/ۡۢۧ;

    if-nez v4, :cond_0

    .line 452
    new-instance v1, Ll/ۜۢۧ;

    .line 83
    invoke-direct {v1, v5, v5}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v1

    .line 461
    :cond_0
    iget v4, v0, Ll/ܰۖۧ;->ܺ:I

    const/4 v6, 0x0

    const/4 v7, -0x1

    const-wide/16 v8, -0x1

    if-eq v4, v7, :cond_6

    .line 464
    aget-object v3, v3, v4

    iget-object v3, v3, Ll/᩺ۖۧ;->ᩳ:Ll/᩷ۘۧ;

    iget-object v4, v3, Ll/᩷ۘۧ;->᩻:[J

    .line 86
    invoke-static {v4, v1, v2, v6}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v10

    :goto_0
    if-ltz v10, :cond_2

    .line 88
    iget-object v11, v3, Ll/᩷ۘۧ;->ۧ:[I

    aget v11, v11, v10

    and-int/lit8 v11, v11, 0x1

    if-eqz v11, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v10, v10, -0x1

    goto :goto_0

    :cond_2
    const/4 v10, -0x1

    :goto_1
    if-ne v10, v7, :cond_3

    .line 1354
    invoke-virtual {v3, v1, v2}, Ll/᩷ۘۧ;->֫(J)I

    move-result v10

    .line 465
    :cond_3
    iget-object v11, v3, Ll/᩷ۘۧ;->ᩳ:[J

    if-ne v10, v7, :cond_4

    .line 467
    new-instance v1, Ll/ۜۢۧ;

    .line 83
    invoke-direct {v1, v5, v5}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v1

    .line 469
    :cond_4
    aget-wide v12, v4, v10

    .line 471
    aget-wide v14, v11, v10

    cmp-long v5, v12, v1

    if-gez v5, :cond_5

    .line 472
    iget v5, v3, Ll/᩷ۘۧ;->ܿ:I

    add-int/lit8 v5, v5, -0x1

    if-ge v10, v5, :cond_5

    .line 473
    invoke-virtual {v3, v1, v2}, Ll/᩷ۘۧ;->֫(J)I

    move-result v1

    if-eq v1, v7, :cond_5

    if-eq v1, v10, :cond_5

    .line 475
    aget-wide v2, v4, v1

    .line 476
    aget-wide v8, v11, v1

    goto :goto_3

    :cond_5
    move-wide v1, v12

    goto :goto_2

    :cond_6
    const-wide v14, 0x7fffffffffffffffL

    :goto_2
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v12, v1

    move-wide v2, v3

    :goto_3
    const/4 v1, 0x0

    .line 486
    :goto_4
    iget-object v4, v0, Ll/ܰۖۧ;->᩺:[Ll/᩺ۖۧ;

    array-length v5, v4

    if-ge v1, v5, :cond_11

    .line 487
    iget v5, v0, Ll/ܰۖۧ;->ܺ:I

    if-eq v1, v5, :cond_10

    .line 488
    aget-object v4, v4, v1

    iget-object v4, v4, Ll/᩺ۖۧ;->ᩳ:Ll/᩷ۘۧ;

    iget-object v5, v4, Ll/᩷ۘۧ;->ᩳ:[J

    iget-object v10, v4, Ll/᩷ۘۧ;->ۧ:[I

    iget-object v11, v4, Ll/᩷ۘۧ;->᩻:[J

    .line 86
    invoke-static {v11, v12, v13, v6}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v6

    :goto_5
    if-ltz v6, :cond_8

    .line 88
    aget v16, v10, v6

    and-int/lit8 v16, v16, 0x1

    if-eqz v16, :cond_7

    goto :goto_6

    :cond_7
    add-int/lit8 v6, v6, -0x1

    goto :goto_5

    :cond_8
    const/4 v6, -0x1

    :goto_6
    if-ne v6, v7, :cond_9

    .line 1354
    invoke-virtual {v4, v12, v13}, Ll/᩷ۘۧ;->֫(J)I

    move-result v6

    :cond_9
    if-ne v6, v7, :cond_a

    goto :goto_7

    .line 1335
    :cond_a
    aget-wide v6, v5, v6

    .line 1336
    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    :goto_7
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v16, v2, v6

    if-eqz v16, :cond_f

    const/4 v6, 0x0

    .line 86
    invoke-static {v11, v2, v3, v6}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v7

    :goto_8
    if-ltz v7, :cond_c

    .line 88
    aget v11, v10, v7

    and-int/lit8 v11, v11, 0x1

    if-eqz v11, :cond_b

    goto :goto_9

    :cond_b
    add-int/lit8 v7, v7, -0x1

    goto :goto_8

    :cond_c
    const/4 v7, -0x1

    :goto_9
    const/4 v10, -0x1

    if-ne v7, v10, :cond_d

    .line 1354
    invoke-virtual {v4, v2, v3}, Ll/᩷ۘۧ;->֫(J)I

    move-result v7

    :cond_d
    if-ne v7, v10, :cond_e

    goto :goto_a

    .line 1335
    :cond_e
    aget-wide v4, v5, v7

    .line 1336
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    move-wide v8, v4

    goto :goto_a

    :cond_f
    const/4 v4, 0x0

    const/4 v6, 0x0

    :cond_10
    :goto_a
    add-int/lit8 v1, v1, 0x1

    const/4 v7, -0x1

    goto :goto_4

    :cond_11
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 497
    new-instance v1, Ll/ۡۢۧ;

    invoke-direct {v1, v12, v13, v14, v15}, Ll/ۡۢۧ;-><init>(JJ)V

    cmp-long v6, v2, v4

    if-nez v6, :cond_12

    .line 499
    new-instance v2, Ll/ۜۢۧ;

    .line 83
    invoke-direct {v2, v1, v1}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v2

    .line 501
    :cond_12
    new-instance v4, Ll/ۡۢۧ;

    invoke-direct {v4, v2, v3, v8, v9}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 502
    new-instance v2, Ll/ۜۢۧ;

    invoke-direct {v2, v1, v4}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v2
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 7

    .line 366
    iget-object v0, p0, Ll/ܰۖۧ;->ۜ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    const/4 v0, 0x0

    .line 367
    iput v0, p0, Ll/ܰۖۧ;->ᩳ:I

    const/4 v1, -0x1

    .line 368
    iput v1, p0, Ll/ܰۖۧ;->ۙ:I

    .line 369
    iput v0, p0, Ll/ܰۖۧ;->ܶ:I

    .line 370
    iput v0, p0, Ll/ܰۖۧ;->᩸:I

    .line 371
    iput v0, p0, Ll/ܰۖۧ;->᩹:I

    .line 372
    iput-boolean v0, p0, Ll/ܰۖۧ;->ۘ:Z

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-nez v4, :cond_1

    .line 376
    iget p1, p0, Ll/ܰۖۧ;->֨:I

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    .line 522
    iput v0, p0, Ll/ܰۖۧ;->֨:I

    .line 523
    iput v0, p0, Ll/ܰۖۧ;->ᩳ:I

    return-void

    .line 379
    :cond_0
    iget-object p1, p0, Ll/ܰۖۧ;->ۤ:Ll/ᩳۘۧ;

    invoke-virtual {p1}, Ll/ᩳۘۧ;->֫()V

    .line 380
    iget-object p1, p0, Ll/ܰۖۧ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void

    .line 383
    :cond_1
    iget-object p1, p0, Ll/ܰۖۧ;->᩺:[Ll/᩺ۖۧ;

    array-length p2, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_6

    aget-object v3, p1, v2

    .line 1216
    iget-object v4, v3, Ll/᩺ۖۧ;->ᩳ:Ll/᩷ۘۧ;

    .line 86
    iget-object v5, v4, Ll/᩷ۘۧ;->᩻:[J

    invoke-static {v5, p3, p4, v0}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v5

    :goto_1
    if-ltz v5, :cond_3

    .line 88
    iget-object v6, v4, Ll/᩷ۘۧ;->ۧ:[I

    aget v6, v6, v5

    and-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_3
    const/4 v5, -0x1

    :goto_2
    if-ne v5, v1, :cond_4

    .line 1220
    invoke-virtual {v4, p3, p4}, Ll/᩷ۘۧ;->֫(J)I

    move-result v5

    .line 1222
    :cond_4
    iput v5, v3, Ll/᩺ۖۧ;->ܽ:I

    .line 385
    iget-object v3, v3, Ll/᩺ۖۧ;->᩻:Ll/֡ۢۧ;

    if-eqz v3, :cond_5

    .line 386
    invoke-virtual {v3}, Ll/֡ۢۧ;->֫()V

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 2

    .line 359
    iget v0, p0, Ll/ܰۖۧ;->ۖ:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    .line 360
    new-instance v0, Ll/ۡᩴۧ;

    iget-object v1, p0, Ll/ܰۖۧ;->ۨ:Ll/ۜᩴۧ;

    invoke-direct {v0, p1, v1}, Ll/ۡᩴۧ;-><init>(Ll/᩸᩷ۧ;Ll/ۜᩴۧ;)V

    move-object p1, v0

    .line 361
    :cond_0
    iput-object p1, p0, Ll/ܰۖۧ;->ۢ:Ll/᩸᩷ۧ;

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 3

    .line 344
    iget v0, p0, Ll/ܰۖۧ;->ۖ:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 345
    :goto_0
    invoke-static {p1, v0}, Ll/ܿۘۧ;->֫(Ll/۠᩷ۧ;Z)Ll/ۘۢۧ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 347
    invoke-static {p1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Ll/ܰۖۧ;->ᩴ:Ll/ܳ۬ܺ;

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final ۜ()J
    .locals 2

    .line 430
    iget-wide v0, p0, Ll/ܰۖۧ;->᩷:J

    return-wide v0
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 353
    iget-object v0, p0, Ll/ܰۖۧ;->ᩴ:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
