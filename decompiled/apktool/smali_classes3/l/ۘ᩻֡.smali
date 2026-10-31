.class public final Ll/ۘ᩻֡;
.super Ll/ۨܳ֡;
.source "KARX"


# instance fields
.field public final ۜ:Ll/ۖ᩻֡;

.field public ۢ:I

.field public ܳ:I

.field public final ܿ:[Ll/ۛۜ֡;

.field public ᩳ:I

.field public final ᩷:Ll/᩻ܳ֡;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/᩻ܳ֡;Ll/᩸ܳ֡;[Ll/ۛۜ֡;Ll/ᩳۜ֡;)V
    .locals 1

    .line 91
    invoke-direct {p0, p2, p4}, Ll/ۨܳ֡;-><init>(Ll/᩸ܳ֡;Ll/ᩳۜ֡;)V

    const/4 p2, -0x1

    .line 65
    iput p2, p0, Ll/ۘ᩻֡;->ۢ:I

    const/4 p4, 0x1

    .line 68
    iput p4, p0, Ll/ۘ᩻֡;->ܳ:I

    const/4 p4, 0x0

    .line 71
    iput p4, p0, Ll/ۘ᩻֡;->ᩳ:I

    .line 75
    iput p4, p0, Ll/ۘ᩻֡;->᩻:I

    .line 79
    new-instance v0, Ll/ۖ᩻֡;

    .line 43
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput p2, v0, Ll/ۖ᩻֡;->ܽ:I

    .line 45
    iput p4, v0, Ll/ۖ᩻֡;->ᩳ:I

    .line 46
    iput p2, v0, Ll/ۖ᩻֡;->֫:I

    .line 79
    iput-object v0, p0, Ll/ۘ᩻֡;->ۜ:Ll/ۖ᩻֡;

    .line 92
    iput-object p3, p0, Ll/ۘ᩻֡;->ܿ:[Ll/ۛۜ֡;

    .line 93
    iput-object p1, p0, Ll/ۘ᩻֡;->᩷:Ll/᩻ܳ֡;

    return-void
.end method

.method public static ֫(Ll/ܰۜ֡;ILl/ܰۜ֡;)V
    .locals 2

    if-ltz p1, :cond_2

    const/16 v0, 0x7f

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 653
    monitor-enter v0

    .line 654
    :try_start_0
    iget-object v1, p0, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    if-nez v1, :cond_1

    const/16 v1, 0x80

    new-array v1, v1, [Ll/ܰۜ֡;

    .line 656
    iput-object v1, p0, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    .line 658
    :cond_1
    iget-object p0, p0, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    aput-object p2, p0, p1

    .line 659
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩺ܿ֡;I)I
    .locals 4

    .line 104
    iput p2, p0, Ll/ۘ᩻֡;->᩻:I

    .line 105
    invoke-interface {p1}, Ll/ܳܳ֡;->֫()I

    move-result v0

    .line 107
    :try_start_0
    invoke-interface {p1}, Ll/ܳܳ֡;->index()I

    move-result v1

    iput v1, p0, Ll/ۘ᩻֡;->ۢ:I

    .line 108
    iget-object v1, p0, Ll/ۘ᩻֡;->ۜ:Ll/ۖ᩻֡;

    const/4 v2, -0x1

    .line 50
    iput v2, v1, Ll/ۖ᩻֡;->ܽ:I

    const/4 v3, 0x0

    .line 51
    iput v3, v1, Ll/ۖ᩻֡;->ᩳ:I

    .line 52
    iput v2, v1, Ll/ۖ᩻֡;->֫:I

    const/4 v2, 0x0

    .line 53
    iput-object v2, v1, Ll/ۖ᩻֡;->ۧ:Ll/ܰۜ֡;

    .line 109
    iget-object v1, p0, Ll/ۘ᩻֡;->ܿ:[Ll/ۛۜ֡;

    aget-object p2, v1, p2

    .line 110
    iget-object v1, p2, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    if-nez v1, :cond_0

    .line 111
    invoke-virtual {p0, p1}, Ll/ۘ᩻֡;->ܽ(Ll/᩺ܿ֡;)I

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    invoke-interface {p1, v0}, Ll/ܳܳ֡;->ܽ(I)V

    return p2

    .line 114
    :cond_0
    :try_start_1
    iget-object p2, p2, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    invoke-virtual {p0, p1, p2}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;Ll/ܰۜ֡;)I

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    invoke-interface {p1, v0}, Ll/ܳܳ֡;->ܽ(I)V

    return p2

    :catchall_0
    move-exception p2

    invoke-interface {p1, v0}, Ll/ܳܳ֡;->ܽ(I)V

    .line 119
    throw p2
.end method

.method public final ֫(Ll/᩺ܿ֡;Ll/ܰۜ֡;)I
    .locals 22

    move-object/from16 v7, p0

    move-object/from16 v0, p2

    .line 171
    iget-boolean v1, v0, Ll/ܰۜ֡;->ܽ:Z

    iget-object v8, v7, Ll/ۘ᩻֡;->ۜ:Ll/ۖ᩻֡;

    if-eqz v1, :cond_0

    .line 607
    invoke-interface/range {p1 .. p1}, Ll/ܳܳ֡;->index()I

    move-result v1

    iput v1, v8, Ll/ۖ᩻֡;->ܽ:I

    .line 608
    iget v1, v7, Ll/ۘ᩻֡;->ܳ:I

    iput v1, v8, Ll/ۖ᩻֡;->ᩳ:I

    .line 609
    iget v1, v7, Ll/ۘ᩻֡;->ᩳ:I

    iput v1, v8, Ll/ۖ᩻֡;->֫:I

    .line 610
    iput-object v0, v8, Ll/ۖ᩻֡;->ۧ:Ll/ܰۜ֡;

    :cond_0
    const/4 v1, 0x1

    move-object/from16 v9, p1

    .line 176
    invoke-interface {v9, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v1

    move-object v10, v0

    move v11, v1

    move-object v0, v7

    move-object v1, v9

    .line 246
    :goto_0
    iget-object v2, v10, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    if-eqz v2, :cond_2

    if-ltz v11, :cond_2

    const/16 v3, 0x7f

    if-le v11, v3, :cond_1

    goto :goto_1

    .line 250
    :cond_1
    aget-object v2, v2, v11

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v2, 0x0

    .line 203
    :goto_2
    sget-object v12, Ll/ۨܳ֡;->ܽ:Ll/ܰۜ֡;

    if-nez v2, :cond_f

    .line 273
    new-instance v13, Ll/ۛ᩻֡;

    invoke-direct {v13}, Ll/ۛ᩻֡;-><init>()V

    .line 277
    iget-object v2, v10, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    .line 359
    iget-object v2, v2, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    const/4 v2, 0x0

    const/4 v15, 0x0

    .line 321
    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ll/᩹ܳ֡;

    .line 322
    iget v2, v6, Ll/᩹ܳ֡;->֫:I

    iget-object v5, v6, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    if-ne v2, v15, :cond_3

    const/4 v2, 0x1

    const/16 v16, 0x1

    goto :goto_4

    :cond_3
    const/4 v2, 0x0

    const/16 v16, 0x0

    :goto_4
    if-eqz v16, :cond_4

    .line 323
    move-object v2, v6

    check-cast v2, Ll/ܺ᩻֡;

    invoke-virtual {v2}, Ll/ܺ᩻֡;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_3

    .line 154
    :cond_4
    iget-object v2, v5, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v4, :cond_a

    .line 333
    invoke-virtual {v5, v3}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v2

    move-object/from16 p2, v1

    const v1, 0x10ffff

    .line 372
    invoke-virtual {v2, v11, v1}, Ll/۬ۜ֡;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 373
    iget-object v1, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    goto :goto_6

    :cond_5
    const/4 v1, 0x0

    :goto_6
    if-eqz v1, :cond_9

    .line 336
    move-object v2, v6

    check-cast v2, Ll/ܺ᩻֡;

    move/from16 v17, v3

    invoke-virtual {v2}, Ll/ܺ᩻֡;->֫()Ll/᩵᩻֡;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 338
    invoke-interface/range {p1 .. p1}, Ll/ܳܳ֡;->index()I

    move-result v18

    iget v0, v0, Ll/ۘ᩻֡;->ۢ:I

    sub-int v0, v18, v0

    invoke-virtual {v3, v0}, Ll/᩵᩻֡;->֫(I)Ll/᩵᩻֡;

    move-result-object v3

    :cond_6
    const/4 v0, -0x1

    if-ne v11, v0, :cond_7

    const/4 v0, 0x1

    const/16 v18, 0x1

    goto :goto_7

    :cond_7
    const/4 v0, 0x0

    const/16 v18, 0x0

    .line 342
    :goto_7
    new-instance v0, Ll/ܺ᩻֡;

    invoke-direct {v0, v2, v1, v3}, Ll/ܺ᩻֡;-><init>(Ll/ܺ᩻֡;Ll/᩺ܳ֡;Ll/᩵᩻֡;)V

    const/16 v19, 0x1

    move-object v2, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v3, v13

    move/from16 v20, v4

    move/from16 v4, v16

    move-object/from16 v21, v5

    move/from16 v5, v19

    move-object v7, v6

    move/from16 v6, v18

    invoke-virtual/range {v0 .. v6}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;Ll/ܺ᩻֡;Ll/ۛ᩻֡;ZZZ)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 345
    iget v0, v7, Ll/᩹ܳ֡;->֫:I

    move v15, v0

    move-object v1, v9

    move-object/from16 v0, p0

    goto :goto_9

    :cond_8
    move-object/from16 v0, p0

    move-object v1, v9

    goto :goto_8

    :cond_9
    move/from16 v17, v3

    move/from16 v20, v4

    move-object/from16 v21, v5

    move-object v7, v6

    move-object/from16 v1, p2

    :goto_8
    add-int/lit8 v3, v17, 0x1

    move-object v6, v7

    move/from16 v4, v20

    move-object/from16 v5, v21

    move-object/from16 v7, p0

    goto :goto_5

    :cond_a
    move-object/from16 p2, v1

    :goto_9
    move-object/from16 v7, p0

    goto/16 :goto_3

    .line 333
    :cond_b
    iget-object v2, v13, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 280
    iget-boolean v2, v13, Ll/۬ܳ֡;->ۤ:Z

    if-nez v2, :cond_c

    .line 283
    invoke-static {v10, v11, v12}, Ll/ۘ᩻֡;->֫(Ll/ܰۜ֡;ILl/ܰۜ֡;)V

    :cond_c
    move-object v3, v12

    goto :goto_a

    .line 629
    :cond_d
    iget-boolean v2, v13, Ll/۬ܳ֡;->ۤ:Z

    const/4 v3, 0x0

    .line 630
    iput-boolean v3, v13, Ll/۬ܳ֡;->ۤ:Z

    .line 633
    invoke-virtual {v0, v13}, Ll/ۘ᩻֡;->֫(Ll/ۛ᩻֡;)Ll/ܰۜ֡;

    move-result-object v3

    if-eqz v2, :cond_e

    goto :goto_a

    .line 639
    :cond_e
    invoke-static {v10, v11, v3}, Ll/ۘ᩻֡;->֫(Ll/ܰۜ֡;ILl/ܰۜ֡;)V

    :goto_a
    move-object v10, v3

    goto :goto_b

    :cond_f
    move-object v10, v2

    :goto_b
    if-ne v10, v12, :cond_10

    goto :goto_c

    :cond_10
    const/4 v2, -0x1

    if-eq v11, v2, :cond_11

    .line 216
    invoke-virtual/range {p0 .. p1}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;)V

    .line 219
    :cond_11
    iget-boolean v2, v10, Ll/ܰۜ֡;->ܽ:Z

    if-eqz v2, :cond_15

    .line 607
    invoke-interface {v1}, Ll/ܳܳ֡;->index()I

    move-result v2

    iput v2, v8, Ll/ۖ᩻֡;->ܽ:I

    .line 608
    iget v2, v0, Ll/ۘ᩻֡;->ܳ:I

    iput v2, v8, Ll/ۖ᩻֡;->ᩳ:I

    .line 609
    iget v2, v0, Ll/ۘ᩻֡;->ᩳ:I

    iput v2, v8, Ll/ۖ᩻֡;->֫:I

    .line 610
    iput-object v10, v8, Ll/ۖ᩻֡;->ۧ:Ll/ܰۜ֡;

    const/4 v2, -0x1

    if-ne v11, v2, :cond_15

    .line 297
    :goto_c
    iget-object v2, v8, Ll/ۖ᩻֡;->ۧ:Ll/ܰۜ֡;

    iget-object v3, v0, Ll/ۘ᩻֡;->᩷:Ll/᩻ܳ֡;

    if-eqz v2, :cond_13

    .line 298
    iget-object v2, v2, Ll/ܰۜ֡;->ᩳ:Ll/᩵᩻֡;

    .line 299
    iget v4, v0, Ll/ۘ᩻֡;->ۢ:I

    iget v5, v8, Ll/ۖ᩻֡;->ܽ:I

    iget v6, v8, Ll/ۖ᩻֡;->ᩳ:I

    iget v7, v8, Ll/ۖ᩻֡;->֫:I

    .line 361
    invoke-interface {v1, v5}, Ll/ܳܳ֡;->֫(I)V

    .line 362
    iput v6, v0, Ll/ۘ᩻֡;->ܳ:I

    .line 363
    iput v7, v0, Ll/ۘ᩻֡;->ᩳ:I

    if-eqz v2, :cond_12

    .line 366
    invoke-virtual {v2, v3, v1, v4}, Ll/᩵᩻֡;->֫(Ll/᩻ܳ֡;Ll/᩺ܿ֡;I)V

    .line 301
    :cond_12
    iget-object v0, v8, Ll/ۖ᩻֡;->ۧ:Ll/ܰۜ֡;

    iget v0, v0, Ll/ܰۜ֡;->ܳ:I

    return v0

    :cond_13
    const/4 v2, -0x1

    if-ne v11, v2, :cond_14

    .line 305
    invoke-interface {v1}, Ll/ܳܳ֡;->index()I

    move-result v4

    iget v5, v0, Ll/ۘ᩻֡;->ۢ:I

    if-ne v4, v5, :cond_14

    return v2

    .line 309
    :cond_14
    new-instance v2, Ll/ۜܳ֡;

    iget v0, v0, Ll/ۘ᩻֡;->ۢ:I

    invoke-direct {v2, v3, v1, v0}, Ll/ۜܳ֡;-><init>(Ll/᩻ܳ֡;Ll/᩺ܿ֡;I)V

    throw v2

    :cond_15
    const/4 v2, 0x1

    .line 226
    invoke-interface {v1, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v11

    move-object/from16 v7, p0

    goto/16 :goto_0
.end method

.method public final ֫(Ll/ۛ᩻֡;)Ll/ܰۜ֡;
    .locals 4

    .line 674
    new-instance v1, Ll/ܰۜ֡;

    invoke-direct {v1, p1}, Ll/ܰۜ֡;-><init>(Ll/۬ܳ֡;)V

    .line 359
    iget-object v0, p1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 676
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳ֡;

    .line 677
    iget-object v3, v2, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    instance-of v3, v3, Ll/ۢۜ֡;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    const/4 v0, 0x1

    .line 684
    iput-boolean v0, v1, Ll/ܰۜ֡;->ܽ:Z

    .line 685
    move-object v0, v2

    check-cast v0, Ll/ܺ᩻֡;

    invoke-virtual {v0}, Ll/ܺ᩻֡;->֫()Ll/᩵᩻֡;

    move-result-object v0

    iput-object v0, v1, Ll/ܰۜ֡;->ᩳ:Ll/᩵᩻֡;

    .line 686
    iget-object v0, p0, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    iget-object v0, v0, Ll/᩸ܳ֡;->ۜ:[I

    iget-object v2, v2, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v2, v2, Ll/᩺ܳ֡;->ᩳ:I

    aget v0, v0, v2

    iput v0, v1, Ll/ܰۜ֡;->ܳ:I

    .line 689
    :cond_2
    iget-object v0, p0, Ll/ۘ᩻֡;->ܿ:[Ll/ۛۜ֡;

    iget v2, p0, Ll/ۘ᩻֡;->᩻:I

    aget-object v2, v0, v2

    .line 690
    iget-object v0, v2, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    monitor-enter v0

    .line 691
    :try_start_0
    iget-object v3, v2, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۜ֡;

    if-eqz v3, :cond_3

    .line 692
    monitor-exit v0

    return-object v3

    .line 696
    :cond_3
    iget-object v3, v2, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    iput v3, v1, Ll/ܰۜ֡;->ۜ:I

    .line 697
    invoke-virtual {p1}, Ll/۬ܳ֡;->ܽ()V

    .line 698
    iput-object p1, v1, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    .line 699
    iget-object p1, v2, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    invoke-virtual {p1, v1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 701
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 4

    .line 50
    iget-object v0, p0, Ll/ۘ᩻֡;->ۜ:Ll/ۖ᩻֡;

    const/4 v1, -0x1

    iput v1, v0, Ll/ۖ᩻֡;->ܽ:I

    const/4 v2, 0x0

    .line 51
    iput v2, v0, Ll/ۖ᩻֡;->ᩳ:I

    .line 52
    iput v1, v0, Ll/ۖ᩻֡;->֫:I

    const/4 v3, 0x0

    .line 53
    iput-object v3, v0, Ll/ۖ᩻֡;->ۧ:Ll/ܰۜ֡;

    .line 125
    iput v1, p0, Ll/ۘ᩻֡;->ۢ:I

    const/4 v0, 0x1

    .line 126
    iput v0, p0, Ll/ۘ᩻֡;->ܳ:I

    .line 127
    iput v2, p0, Ll/ۘ᩻֡;->ᩳ:I

    .line 128
    iput v2, p0, Ll/ۘ᩻֡;->᩻:I

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 730
    iput p1, p0, Ll/ۘ᩻֡;->ᩳ:I

    return-void
.end method

.method public final ֫(Ll/᩺ܿ֡;)V
    .locals 3

    const/4 v0, 0x1

    .line 734
    invoke-interface {p1, v0}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    .line 736
    iget v1, p0, Ll/ۘ᩻֡;->ܳ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۘ᩻֡;->ܳ:I

    const/4 v0, 0x0

    .line 737
    iput v0, p0, Ll/ۘ᩻֡;->ᩳ:I

    goto :goto_0

    .line 740
    :cond_0
    iget v1, p0, Ll/ۘ᩻֡;->ᩳ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۘ᩻֡;->ᩳ:I

    .line 742
    :goto_0
    invoke-interface {p1}, Ll/ܳܳ֡;->ۧ()V

    return-void
.end method

.method public final ֫(Ll/᩺ܿ֡;Ll/ܺ᩻֡;Ll/ۛ᩻֡;ZZZ)Z
    .locals 16

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v0, p2

    move-object/from16 v10, p3

    .line 408
    iget-object v11, v0, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    instance-of v1, v11, Ll/ۢۜ֡;

    const/4 v2, 0x0

    iget-object v12, v8, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    const/4 v3, 0x1

    if-eqz v1, :cond_7

    .line 418
    iget-object v1, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/ܽۜ֡;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v3, p4

    goto :goto_1

    .line 419
    :cond_1
    :goto_0
    iget-object v1, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ll/ܽۜ֡;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_3

    .line 424
    :cond_2
    new-instance v1, Ll/ܺ᩻֡;

    sget-object v4, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    invoke-direct {v1, v0, v11, v4}, Ll/ܺ᩻֡;-><init>(Ll/ܺ᩻֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;)V

    .line 132
    invoke-virtual {v10, v1, v2}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    .line 429
    :goto_1
    iget-object v1, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ll/ܽۜ֡;->ۧ()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x0

    move v5, v3

    const/4 v11, 0x0

    .line 430
    :goto_2
    iget-object v1, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v1}, Ll/ܽۜ֡;->ܽ()I

    move-result v1

    if-ge v11, v1, :cond_4

    .line 431
    iget-object v1, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v1, v11}, Ll/ܽۜ֡;->ۧ(I)I

    move-result v1

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_3

    .line 432
    iget-object v1, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v1, v11}, Ll/ܽۜ֡;->֫(I)Ll/ܽۜ֡;

    move-result-object v1

    .line 433
    iget-object v2, v12, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    iget-object v3, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v3, v11}, Ll/ܽۜ֡;->ۧ(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ܳ֡;

    .line 434
    new-instance v3, Ll/ܺ᩻֡;

    invoke-direct {v3, v0, v2, v1}, Ll/ܺ᩻֡;-><init>(Ll/ܺ᩻֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    .line 435
    invoke-virtual/range {v1 .. v7}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;Ll/ܺ᩻֡;Ll/ۛ᩻֡;ZZZ)Z

    move-result v5

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    return v5

    :cond_5
    return v3

    .line 132
    :cond_6
    :goto_3
    invoke-virtual {v10, v0, v2}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    return v3

    .line 203
    :cond_7
    iget-boolean v1, v11, Ll/᩺ܳ֡;->ۧ:Z

    if-nez v1, :cond_9

    if-eqz p4, :cond_8

    .line 445
    invoke-virtual/range {p2 .. p2}, Ll/ܺ᩻֡;->ۧ()Z

    move-result v1

    if-nez v1, :cond_9

    .line 132
    :cond_8
    invoke-virtual {v10, v0, v2}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    :cond_9
    const/4 v1, 0x0

    move/from16 v5, p4

    const/4 v13, 0x0

    .line 154
    :goto_4
    iget-object v1, v11, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v13, v1, :cond_10

    .line 452
    invoke-virtual {v11, v13}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v1

    .line 472
    invoke-virtual {v1}, Ll/۬ۜ֡;->֫()I

    move-result v4

    const/16 v6, 0xa

    if-eq v4, v6, :cond_f

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_8

    .line 513
    :pswitch_0
    iget-object v3, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ll/ܽۜ֡;->֫()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    .line 532
    :cond_a
    new-instance v3, Ll/ܺ᩻֡;

    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-direct {v3, v0, v1}, Ll/ܺ᩻֡;-><init>(Ll/ܺ᩻֡;Ll/᩺ܳ֡;)V

    goto/16 :goto_7

    .line 526
    :cond_b
    :goto_5
    invoke-virtual/range {p2 .. p2}, Ll/ܺ᩻֡;->֫()Ll/᩵᩻֡;

    move-result-object v3

    iget-object v4, v12, Ll/᩸ܳ֡;->ܽ:[Ll/ᩴ᩻֡;

    move-object v6, v1

    check-cast v6, Ll/֫᩻֡;

    iget v6, v6, Ll/֫᩻֡;->ܽ:I

    aget-object v4, v4, v6

    invoke-static {v3, v4}, Ll/᩵᩻֡;->֫(Ll/᩵᩻֡;Ll/ᩴ᩻֡;)Ll/᩵᩻֡;

    move-result-object v3

    .line 527
    new-instance v4, Ll/ܺ᩻֡;

    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-direct {v4, v0, v1, v3}, Ll/ܺ᩻֡;-><init>(Ll/ܺ᩻֡;Ll/᩺ܳ֡;Ll/᩵᩻֡;)V

    move-object v3, v4

    goto/16 :goto_7

    .line 502
    :pswitch_1
    move-object v4, v1

    check-cast v4, Ll/ۧۜ֡;

    .line 506
    iput-boolean v3, v10, Ll/۬ܳ֡;->ۤ:Z

    .line 507
    iget v3, v4, Ll/ۧۜ֡;->ܿ:I

    iget v4, v4, Ll/ۧۜ֡;->ᩳ:I

    .line 583
    iget-object v6, v8, Ll/ۘ᩻֡;->᩷:Ll/᩻ܳ֡;

    if-nez p5, :cond_c

    .line 584
    invoke-virtual {v6, v2, v3, v4}, Ll/ᩴܳ֡;->֫(Ll/᩵ܳ֡;II)Z

    move-result v3

    goto :goto_6

    .line 587
    :cond_c
    iget v2, v8, Ll/ۘ᩻֡;->ᩳ:I

    .line 588
    iget v7, v8, Ll/ۘ᩻֡;->ܳ:I

    .line 589
    invoke-interface/range {p1 .. p1}, Ll/ܳܳ֡;->index()I

    move-result v14

    .line 590
    invoke-interface/range {p1 .. p1}, Ll/ܳܳ֡;->֫()I

    move-result v15

    .line 592
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;)V

    const/4 v10, 0x0

    .line 593
    invoke-virtual {v6, v10, v3, v4}, Ll/ᩴܳ֡;->֫(Ll/᩵ܳ֡;II)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 596
    iput v2, v8, Ll/ۘ᩻֡;->ᩳ:I

    .line 597
    iput v7, v8, Ll/ۘ᩻֡;->ܳ:I

    .line 598
    invoke-interface {v9, v14}, Ll/ܳܳ֡;->֫(I)V

    .line 599
    invoke-interface {v9, v15}, Ll/ܳܳ֡;->ܽ(I)V

    move-object v2, v10

    :goto_6
    if-eqz v3, :cond_d

    .line 508
    new-instance v3, Ll/ܺ᩻֡;

    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-direct {v3, v0, v1}, Ll/ܺ᩻֡;-><init>(Ll/ܺ᩻֡;Ll/᩺ܳ֡;)V

    goto :goto_7

    :catchall_0
    move-exception v0

    .line 596
    iput v2, v8, Ll/ۘ᩻֡;->ᩳ:I

    .line 597
    iput v7, v8, Ll/ۘ᩻֡;->ܳ:I

    .line 598
    invoke-interface {v9, v14}, Ll/ܳܳ֡;->֫(I)V

    .line 599
    invoke-interface {v9, v15}, Ll/ܳܳ֡;->ܽ(I)V

    .line 600
    throw v0

    .line 474
    :pswitch_2
    move-object v3, v1

    check-cast v3, Ll/ۡۜ֡;

    .line 475
    iget-object v4, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object v3, v3, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    iget v3, v3, Ll/᩺ܳ֡;->ܿ:I

    .line 476
    invoke-static {v4, v3}, Ll/۠ۜ֡;->֫(Ll/ܽۜ֡;I)Ll/۠ۜ֡;

    move-result-object v3

    .line 477
    new-instance v4, Ll/ܺ᩻֡;

    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-direct {v4, v0, v1, v3}, Ll/ܺ᩻֡;-><init>(Ll/ܺ᩻֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;)V

    move-object v10, v2

    move-object v3, v4

    goto :goto_9

    :pswitch_3
    if-eqz p6, :cond_d

    const/4 v3, -0x1

    const v4, 0x10ffff

    .line 544
    invoke-virtual {v1, v3, v4}, Ll/۬ۜ֡;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 545
    new-instance v3, Ll/ܺ᩻֡;

    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-direct {v3, v0, v1}, Ll/ܺ᩻֡;-><init>(Ll/ܺ᩻֡;Ll/᩺ܳ֡;)V

    goto :goto_7

    .line 537
    :pswitch_4
    new-instance v3, Ll/ܺ᩻֡;

    iget-object v1, v1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-direct {v3, v0, v1}, Ll/ܺ᩻֡;-><init>(Ll/ܺ᩻֡;Ll/᩺ܳ֡;)V

    :goto_7
    move-object v10, v2

    goto :goto_9

    :cond_d
    :goto_8
    move-object v3, v2

    move-object v10, v3

    :goto_9
    if-eqz v3, :cond_e

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    .line 455
    invoke-virtual/range {v1 .. v7}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;Ll/ܺ᩻֡;Ll/ۛ᩻֡;ZZZ)Z

    move-result v1

    move v5, v1

    :cond_e
    add-int/lit8 v13, v13, 0x1

    const/4 v3, 0x1

    move-object v2, v10

    move-object/from16 v10, p3

    goto/16 :goto_4

    .line 481
    :cond_f
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Precedence predicates are not supported in lexers."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public final ۧ()I
    .locals 1

    .line 726
    iget v0, p0, Ll/ۘ᩻֡;->ᩳ:I

    return v0
.end method

.method public final ۧ(Ll/᩺ܿ֡;)Ljava/lang/String;
    .locals 2

    .line 714
    iget v0, p0, Ll/ۘ᩻֡;->ۢ:I

    invoke-interface {p1}, Ll/ܳܳ֡;->index()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/᩺ܿ֡;->֫(Ll/ܳ᩷֡;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(I)V
    .locals 0

    .line 722
    iput p1, p0, Ll/ۘ᩻֡;->ܳ:I

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 718
    iget v0, p0, Ll/ۘ᩻֡;->ܳ:I

    return v0
.end method

.method public final ܽ(Ll/᩺ܿ֡;)I
    .locals 12

    .line 139
    iget-object v0, p0, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    iget-object v0, v0, Ll/᩸ܳ֡;->ܿ:Ljava/util/ArrayList;

    iget v1, p0, Ll/ۘ᩻֡;->᩻:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܳ֡;

    .line 383
    sget-object v1, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    .line 384
    new-instance v9, Ll/ۛ᩻֡;

    invoke-direct {v9}, Ll/ۛ᩻֡;-><init>()V

    const/4 v10, 0x0

    const/4 v2, 0x0

    .line 154
    :goto_0
    iget-object v3, v0, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 386
    invoke-virtual {v0, v2}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v3

    iget-object v3, v3, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 387
    new-instance v4, Ll/ܺ᩻֡;

    add-int/lit8 v11, v2, 0x1

    invoke-direct {v4, v3, v11, v1}, Ll/ܺ᩻֡;-><init>(Ll/᩺ܳ֡;ILl/ܽۜ֡;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v5, v9

    .line 388
    invoke-virtual/range {v2 .. v8}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;Ll/ܺ᩻֡;Ll/ۛ᩻֡;ZZZ)Z

    move v2, v11

    goto :goto_0

    .line 148
    :cond_0
    iget-boolean v0, v9, Ll/۬ܳ֡;->ۤ:Z

    .line 149
    iput-boolean v10, v9, Ll/۬ܳ֡;->ۤ:Z

    .line 151
    invoke-virtual {p0, v9}, Ll/ۘ᩻֡;->֫(Ll/ۛ᩻֡;)Ll/ܰۜ֡;

    move-result-object v1

    if-nez v0, :cond_1

    .line 153
    iget-object v0, p0, Ll/ۘ᩻֡;->ܿ:[Ll/ۛۜ֡;

    iget v2, p0, Ll/ۘ᩻֡;->᩻:I

    aget-object v0, v0, v2

    iput-object v1, v0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    .line 156
    :cond_1
    invoke-virtual {p0, p1, v1}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;Ll/ܰۜ֡;)I

    move-result p1

    return p1
.end method
