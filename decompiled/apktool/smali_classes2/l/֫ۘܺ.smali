.class public final Ll/֫ۘܺ;
.super Ljava/lang/Object;
.source "MBGQ"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۜ:Ll/᩷ۘܺ;

.field public final ۢ:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܳ:[I

.field public final ܽ:Ljava/util/ArrayList;

.field public final ܿ:[Ll/ܰۡܺ;

.field public final ᩳ:Ljava/util/BitSet;

.field public final ᩷:Ljava/util/ArrayList;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 3

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Ll/֫ۘܺ;->ۜ:Ll/᩷ۘܺ;

    .line 92
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۜ()I

    move-result v0

    iput v0, p0, Ll/֫ۘܺ;->᩻:I

    .line 93
    new-array v1, v0, [I

    iput-object v1, p0, Ll/֫ۘܺ;->ܳ:[I

    .line 94
    new-array v0, v0, [Ll/ܰۡܺ;

    iput-object v0, p0, Ll/֫ۘܺ;->ܿ:[Ll/ܰۡܺ;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۘܺ;->ܽ:Ljava/util/ArrayList;

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۘܺ;->ۧ:Ljava/util/ArrayList;

    .line 97
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Ll/֫ۘܺ;->ᩳ:Ljava/util/BitSet;

    .line 98
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֫ۘܺ;->᩷:Ljava/util/ArrayList;

    .line 99
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֫ۘܺ;->ۢ:Ljava/util/ArrayList;

    .line 100
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֫ۘܺ;->֫:Ljava/util/ArrayList;

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 101
    :goto_0
    iget v1, p0, Ll/֫ۘܺ;->᩻:I

    if-ge v0, v1, :cond_0

    .line 102
    iget-object v1, p0, Ll/֫ۘܺ;->ܳ:[I

    aput p1, v1, v0

    .line 103
    iget-object v1, p0, Ll/֫ۘܺ;->ܿ:[Ll/ܰۡܺ;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(II)V
    .locals 2

    const/4 v0, 0x2

    .line 138
    iget-object v1, p0, Ll/֫ۘܺ;->ۜ:Ll/᩷ۘܺ;

    if-ne p2, v0, :cond_0

    .line 139
    invoke-virtual {v1, p1}, Ll/᩷ۘܺ;->ᩳ(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܳۘܺ;

    .line 140
    iget-object v0, p0, Ll/֫ۘܺ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {v1, p1}, Ll/᩷ۘܺ;->ᩳ(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܳۘܺ;

    .line 144
    iget-object v0, p0, Ll/֫ۘܺ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-void
.end method

.method private ֫(Ll/ܰۖܺ;)V
    .locals 12

    .line 186
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 188
    iget-object v1, p0, Ll/֫ۘܺ;->ܳ:[I

    aget v2, v1, v0

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    goto :goto_3

    .line 192
    :cond_0
    invoke-virtual {p1}, Ll/ܰۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v2

    .line 195
    invoke-virtual {v2}, Ll/ܿᩴܺ;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v5, v4, :cond_5

    .line 198
    invoke-virtual {p1, v5}, Ll/ܰۖܺ;->ᩳ(I)I

    move-result v8

    .line 199
    invoke-virtual {v2, v5}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v9

    invoke-virtual {v9}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v9

    .line 200
    aget v10, v1, v9

    .line 202
    iget-object v11, p0, Ll/֫ۘܺ;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {v11, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    const/4 v8, 0x1

    if-ne v10, v8, :cond_4

    .line 207
    iget-object v8, p0, Ll/֫ۘܺ;->ܿ:[Ll/ܰۡܺ;

    if-nez v6, :cond_2

    .line 208
    aget-object v6, v8, v9

    const/4 v7, 0x1

    goto :goto_1

    .line 210
    :cond_2
    aget-object v8, v8, v9

    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    move v3, v10

    goto :goto_2

    :cond_5
    move v3, v7

    .line 219
    :goto_2
    invoke-direct {p0, v0, v3, v6}, Ll/֫ۘܺ;->֫(IILl/ܰۡܺ;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 220
    invoke-direct {p0, v0, v3}, Ll/֫ۘܺ;->֫(II)V

    :cond_6
    :goto_3
    return-void
.end method

.method private ֫(Ll/ܳۘܺ;)V
    .locals 16

    move-object/from16 v0, p0

    .line 504
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v1

    .line 505
    invoke-virtual {v1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗۡܺ;->ۧ()I

    move-result v2

    const/4 v3, 0x6

    const-string v4, "Unexpected op"

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v8, v0, Ll/֫ۘܺ;->ܳ:[I

    iget-object v9, v0, Ll/֫ۘܺ;->ܿ:[Ll/ܰۡܺ;

    const/4 v10, 0x1

    if-ne v2, v10, :cond_1

    .line 506
    invoke-virtual {v1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗۡܺ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v11, p1

    goto/16 :goto_9

    .line 274
    :cond_1
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v2

    .line 275
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v11

    .line 281
    invoke-virtual {v2}, Ll/ۗۡܺ;->ۧ()I

    move-result v12

    const/4 v13, 0x4

    iget-object v14, v0, Ll/֫ۘܺ;->ۜ:Ll/᩷ۘܺ;

    if-ne v12, v13, :cond_8

    .line 285
    invoke-virtual {v11, v7}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v12

    .line 286
    invoke-virtual {v12}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v13

    .line 287
    invoke-virtual {v14, v12}, Ll/᩷ۘܺ;->֫(Ll/᩸ۡܺ;)Z

    move-result v12

    if-nez v12, :cond_2

    aget v12, v8, v13

    if-ne v12, v10, :cond_2

    .line 289
    aget-object v12, v9, v13

    goto :goto_1

    :cond_2
    move-object v12, v6

    .line 292
    :goto_1
    invoke-virtual {v11}, Ll/ܿᩴܺ;->size()I

    move-result v13

    if-ne v13, v5, :cond_3

    .line 293
    invoke-virtual {v11, v10}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v13

    .line 294
    invoke-virtual {v13}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v15

    .line 295
    invoke-virtual {v14, v13}, Ll/᩷ۘܺ;->֫(Ll/᩸ۡܺ;)Z

    move-result v13

    if-nez v13, :cond_3

    aget v13, v8, v15

    if-ne v13, v10, :cond_3

    .line 297
    aget-object v13, v9, v15

    goto :goto_2

    :cond_3
    move-object v13, v6

    :goto_2
    if-eqz v12, :cond_5

    .line 302
    invoke-virtual {v11}, Ll/ܿᩴܺ;->size()I

    move-result v11

    if-ne v11, v10, :cond_5

    .line 303
    move-object v11, v12

    check-cast v11, Ll/ۛܺܺ;

    invoke-virtual {v11}, Ll/ۛܺܺ;->ܿ()I

    move-result v11

    if-eq v11, v3, :cond_4

    goto/16 :goto_5

    .line 306
    :cond_4
    check-cast v12, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v12}, Ll/֡ܺܺ;->ᩴ()I

    move-result v11

    .line 307
    invoke-virtual {v2}, Ll/ۗۡܺ;->ᩳ()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 327
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    if-lez v11, :cond_7

    goto :goto_3

    :pswitch_1
    if-gtz v11, :cond_7

    goto :goto_3

    :pswitch_2
    if-ltz v11, :cond_7

    goto :goto_3

    :pswitch_3
    if-gez v11, :cond_7

    goto :goto_3

    :pswitch_4
    if-eqz v11, :cond_7

    goto :goto_3

    :pswitch_5
    if-nez v11, :cond_7

    goto :goto_3

    :cond_5
    if-eqz v12, :cond_8

    if-eqz v13, :cond_8

    .line 334
    move-object v11, v12

    check-cast v11, Ll/ۛܺܺ;

    invoke-virtual {v11}, Ll/ۛܺܺ;->ܿ()I

    move-result v11

    if-eq v11, v3, :cond_6

    goto :goto_5

    .line 337
    :cond_6
    check-cast v12, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v12}, Ll/֡ܺܺ;->ᩴ()I

    move-result v11

    .line 338
    check-cast v13, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v13}, Ll/֡ܺܺ;->ᩴ()I

    move-result v12

    .line 339
    invoke-virtual {v2}, Ll/ۗۡܺ;->ᩳ()I

    move-result v2

    packed-switch v2, :pswitch_data_1

    .line 359
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_6
    if-le v11, v12, :cond_7

    goto :goto_3

    :pswitch_7
    if-gt v11, v12, :cond_7

    goto :goto_3

    :pswitch_8
    if-lt v11, v12, :cond_7

    goto :goto_3

    :pswitch_9
    if-ge v11, v12, :cond_7

    goto :goto_3

    :pswitch_a
    if-eq v11, v12, :cond_7

    goto :goto_3

    :pswitch_b
    if-ne v11, v12, :cond_7

    :goto_3
    const/4 v2, 0x1

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    :goto_4
    const/4 v11, 0x1

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v2, 0x0

    const/4 v11, 0x0

    .line 372
    :goto_6
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v12

    if-eqz v11, :cond_a

    if-eqz v2, :cond_9

    .line 377
    invoke-virtual {v12}, Ll/ܽۘܺ;->ۖ()Ll/᩷ᩴܺ;

    move-result-object v2

    invoke-virtual {v2, v10}, Ll/᩷ᩴܺ;->get(I)I

    move-result v2

    goto :goto_7

    .line 379
    :cond_9
    invoke-virtual {v12}, Ll/ܽۘܺ;->ۖ()Ll/᩷ᩴܺ;

    move-result-object v2

    invoke-virtual {v2, v7}, Ll/᩷ᩴܺ;->get(I)I

    move-result v2

    .line 381
    :goto_7
    invoke-virtual {v14}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۘܺ;

    invoke-direct {v0, v2}, Ll/֫ۘܺ;->֫(Ll/ܽۘܺ;)V

    .line 382
    iget-object v2, v0, Ll/֫ۘܺ;->֫:Ljava/util/ArrayList;

    move-object/from16 v11, p1

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_a
    move-object/from16 v11, p1

    const/4 v2, 0x0

    .line 384
    :goto_8
    invoke-virtual {v12}, Ll/ܽۘܺ;->ۖ()Ll/᩷ᩴܺ;

    move-result-object v13

    invoke-virtual {v13}, Ll/᩷ᩴܺ;->size()I

    move-result v13

    if-ge v2, v13, :cond_b

    .line 385
    invoke-virtual {v12}, Ll/ܽۘܺ;->ۖ()Ll/᩷ᩴܺ;

    move-result-object v13

    invoke-virtual {v13, v2}, Ll/᩷ᩴܺ;->get(I)I

    move-result v13

    .line 386
    invoke-virtual {v14}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v15

    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܽۘܺ;

    invoke-direct {v0, v13}, Ll/֫ۘܺ;->֫(Ll/ܽۘܺ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 510
    :cond_b
    :goto_9
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗۡܺ;->ᩳ()I

    move-result v2

    .line 511
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v12

    if-nez v12, :cond_d

    const/16 v12, 0x11

    if-eq v2, v12, :cond_c

    const/16 v12, 0x12

    if-ne v2, v12, :cond_1c

    .line 516
    :cond_c
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v12

    invoke-virtual {v12}, Ll/ܽۘܺ;->ۜ()Ll/ܽۘܺ;

    move-result-object v12

    .line 517
    invoke-virtual {v12}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v12

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܳۘܺ;

    invoke-virtual {v12}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v12

    .line 523
    :cond_d
    invoke-virtual {v12}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v13

    if-eq v2, v5, :cond_1a

    const/4 v14, 0x5

    if-eq v2, v14, :cond_19

    const/16 v1, 0x38

    if-eq v2, v1, :cond_18

    packed-switch v2, :pswitch_data_2

    packed-switch v2, :pswitch_data_3

    goto/16 :goto_10

    .line 553
    :pswitch_c
    invoke-virtual {v12}, Ll/᩸ۡܺ;->ܿ()I

    move-result v1

    .line 399
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v2

    .line 400
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v12

    invoke-virtual {v12}, Ll/ۗۡܺ;->ᩳ()I

    move-result v12

    .line 401
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v11

    .line 402
    invoke-virtual {v11, v7}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v14

    invoke-virtual {v14}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v14

    .line 406
    aget v15, v8, v14

    if-eq v15, v10, :cond_e

    move-object v14, v6

    goto :goto_a

    .line 409
    :cond_e
    aget-object v14, v9, v14

    .line 412
    :goto_a
    invoke-virtual {v11}, Ll/ܿᩴܺ;->size()I

    move-result v15

    if-ne v15, v10, :cond_f

    .line 413
    check-cast v2, Ll/ܳۡܺ;

    .line 414
    invoke-virtual {v2}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v2

    goto :goto_b

    .line 416
    :cond_f
    invoke-virtual {v11, v10}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    .line 417
    aget v8, v8, v2

    if-eq v8, v10, :cond_10

    move-object v2, v6

    goto :goto_b

    .line 420
    :cond_10
    aget-object v2, v9, v2

    :goto_b
    if-eqz v14, :cond_17

    if-nez v2, :cond_11

    goto :goto_e

    :cond_11
    if-eq v1, v3, :cond_12

    goto :goto_e

    .line 434
    :cond_12
    check-cast v14, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v14}, Ll/֡ܺܺ;->ᩴ()I

    move-result v1

    .line 435
    check-cast v2, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v2}, Ll/֡ܺܺ;->ᩴ()I

    move-result v2

    packed-switch v12, :pswitch_data_4

    .line 487
    :pswitch_d
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_e
    ushr-int/2addr v1, v2

    goto :goto_d

    :pswitch_f
    shr-int/2addr v1, v2

    goto :goto_d

    :pswitch_10
    shl-int/2addr v1, v2

    goto :goto_d

    :pswitch_11
    xor-int/2addr v1, v2

    goto :goto_d

    :pswitch_12
    or-int/2addr v1, v2

    goto :goto_d

    :pswitch_13
    and-int/2addr v1, v2

    goto :goto_d

    :pswitch_14
    if-nez v2, :cond_13

    goto :goto_c

    .line 483
    :cond_13
    rem-int/2addr v1, v2

    goto :goto_d

    :pswitch_15
    if-nez v2, :cond_14

    :goto_c
    const/4 v1, 0x0

    const/4 v7, 0x1

    goto :goto_d

    .line 457
    :cond_14
    div-int/2addr v1, v2

    goto :goto_d

    :pswitch_16
    mul-int v1, v1, v2

    goto :goto_d

    .line 443
    :pswitch_17
    invoke-virtual {v11}, Ll/ܿᩴܺ;->size()I

    move-result v3

    if-ne v3, v10, :cond_15

    sub-int v1, v2, v1

    goto :goto_d

    :cond_15
    sub-int/2addr v1, v2

    goto :goto_d

    :pswitch_18
    add-int/2addr v1, v2

    :goto_d
    if-eqz v7, :cond_16

    goto :goto_e

    .line 490
    :cond_16
    invoke-static {v1}, Ll/ۖܺܺ;->֫(I)Ll/ۖܺܺ;

    move-result-object v1

    move-object v6, v1

    :cond_17
    :goto_e
    if-eqz v6, :cond_1b

    goto :goto_f

    .line 560
    :cond_18
    aget v1, v8, v13

    if-ne v1, v10, :cond_1b

    .line 562
    aget-object v6, v9, v13

    move v5, v1

    goto :goto_10

    .line 529
    :cond_19
    check-cast v1, Ll/ܳۡܺ;

    .line 531
    invoke-virtual {v1}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v1

    move-object v6, v1

    :goto_f
    const/4 v5, 0x1

    goto :goto_10

    .line 535
    :cond_1a
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿᩴܺ;->size()I

    move-result v1

    if-ne v1, v10, :cond_1b

    .line 536
    invoke-virtual/range {p1 .. p1}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-virtual {v1, v7}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    .line 537
    aget v5, v8, v1

    .line 538
    aget-object v6, v9, v1

    .line 571
    :cond_1b
    :goto_10
    invoke-direct {v0, v13, v5, v6}, Ll/֫ۘܺ;->֫(IILl/ܰۡܺ;)Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 572
    invoke-direct {v0, v13, v5}, Ll/֫ۘܺ;->֫(II)V

    :cond_1c
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xe
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x14
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0xe
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_d
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch
.end method

.method private ֫(Ll/ܽۘܺ;)V
    .locals 2

    .line 123
    invoke-virtual {p1}, Ll/ܽۘܺ;->ۧ()I

    move-result v0

    iget-object v1, p0, Ll/֫ۘܺ;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 124
    iget-object v0, p0, Ll/֫ۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    invoke-virtual {p1}, Ll/ܽۘܺ;->ۧ()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    return-void

    .line 127
    :cond_0
    iget-object v0, p0, Ll/֫ۘܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ֫(Ll/᩷ۘܺ;)V
    .locals 10

    .line 113
    new-instance v0, Ll/֫ۘܺ;

    invoke-direct {v0, p0}, Ll/֫ۘܺ;-><init>(Ll/᩷ۘܺ;)V

    .line 577
    invoke-virtual {p0}, Ll/᩷ۘܺ;->ܽ()Ll/ܽۘܺ;

    move-result-object v1

    .line 578
    invoke-direct {v0, v1}, Ll/֫ۘܺ;->֫(Ll/ܽۘܺ;)V

    .line 581
    :cond_0
    iget-object v1, v0, Ll/֫ۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    iget-object v3, v0, Ll/֫ۘܺ;->ᩳ:Ljava/util/BitSet;

    iget-object v4, v0, Ll/֫ۘܺ;->ۢ:Ljava/util/ArrayList;

    iget-object v5, v0, Ll/֫ۘܺ;->᩷:Ljava/util/ArrayList;

    iget-object v6, v0, Ll/֫ۘܺ;->ۧ:Ljava/util/ArrayList;

    const/4 v7, 0x1

    if-eqz v2, :cond_d

    .line 582
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 583
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 584
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    const/4 v1, 0x0

    .line 637
    :goto_0
    iget v2, v0, Ll/֫ۘܺ;->᩻:I

    if-ge v1, v2, :cond_7

    .line 638
    iget-object v2, v0, Ll/֫ۘܺ;->ܳ:[I

    aget v2, v2, v1

    if-eq v2, v7, :cond_2

    goto :goto_2

    .line 641
    :cond_2
    iget-object v2, v0, Ll/֫ۘܺ;->ܿ:[Ll/ܰۡܺ;

    aget-object v4, v2, v1

    instance-of v4, v4, Ll/ۛܺܺ;

    if-nez v4, :cond_3

    goto :goto_2

    .line 646
    :cond_3
    invoke-virtual {p0, v1}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v4

    .line 647
    invoke-virtual {v4}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v5

    .line 649
    invoke-interface {v5}, Ll/֫ۖܺ;->ۡ()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    .line 658
    :cond_4
    invoke-virtual {v4}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v5

    .line 659
    aget-object v6, v2, v1

    check-cast v6, Ll/ۛܺܺ;

    .line 660
    invoke-virtual {v5, v6}, Ll/᩸ۡܺ;->֫(Ll/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v5

    .line 661
    invoke-virtual {v4, v5}, Ll/ܳۘܺ;->֫(Ll/᩸ۡܺ;)V

    .line 667
    invoke-virtual {p0, v1}, Ll/᩷ۘܺ;->ᩳ(I)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳۘܺ;

    .line 668
    invoke-virtual {v5}, Ll/ܳۘܺ;->֨()Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_1

    .line 672
    :cond_5
    move-object v6, v5

    check-cast v6, Ll/۫ۖܺ;

    .line 673
    invoke-virtual {v5}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v5

    .line 675
    invoke-virtual {v5, v1}, Ll/᩶ۡܺ;->ᩳ(I)I

    move-result v8

    .line 677
    invoke-virtual {v5, v8}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v5

    .line 678
    aget-object v9, v2, v1

    check-cast v9, Ll/ۛܺܺ;

    .line 679
    invoke-virtual {v5, v9}, Ll/᩸ۡܺ;->֫(Ll/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v5

    .line 681
    invoke-virtual {v6, v8, v5}, Ll/۫ۖܺ;->֫(ILl/᩸ۡܺ;)V

    goto :goto_1

    :cond_6
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 690
    :cond_7
    iget-object p0, v0, Ll/֫ۘܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۘܺ;

    .line 693
    invoke-virtual {v0}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v1

    .line 694
    invoke-virtual {v1}, Ll/ܽۘܺ;->ۖ()Ll/᩷ᩴܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ᩴܺ;->size()I

    move-result v2

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    :goto_4
    if-ge v5, v2, :cond_a

    .line 696
    invoke-virtual {v1}, Ll/ܽۘܺ;->ۖ()Ll/᩷ᩴܺ;

    move-result-object v7

    invoke-virtual {v7, v5}, Ll/᩷ᩴܺ;->get(I)I

    move-result v7

    .line 697
    invoke-virtual {v3, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-nez v8, :cond_9

    move v6, v7

    :cond_9
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_a
    const/4 v5, 0x2

    if-ne v2, v5, :cond_8

    if-ne v6, v4, :cond_b

    goto :goto_3

    .line 709
    :cond_b
    invoke-virtual {v0}, Ll/ܳۘܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v0

    .line 710
    new-instance v2, Ll/֨ۡܺ;

    sget-object v4, Ll/۫ۡܺ;->ᩴۧ:Ll/ۗۡܺ;

    .line 711
    invoke-virtual {v0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    const/4 v5, 0x0

    sget-object v7, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    invoke-direct {v2, v4, v0, v5, v7}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    .line 710
    invoke-virtual {v1, v2}, Ll/ܽۘܺ;->ۧ(Ll/ܺۡܺ;)V

    .line 712
    invoke-virtual {v1, v6}, Ll/ܽۘܺ;->ᩳ(I)V

    goto :goto_3

    :cond_c
    return-void

    .line 585
    :cond_d
    :goto_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_f

    .line 0
    invoke-static {v1, v7}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 587
    check-cast v2, Ll/ܽۘܺ;

    .line 230
    invoke-virtual {v2}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܳۘܺ;

    .line 231
    instance-of v9, v8, Ll/ܰۖܺ;

    if-eqz v9, :cond_e

    .line 232
    check-cast v8, Ll/ܰۖܺ;

    invoke-direct {v0, v8}, Ll/֫ۘܺ;->֫(Ll/ܰۖܺ;)V

    goto :goto_6

    .line 234
    :cond_e
    invoke-direct {v0, v8}, Ll/֫ۘܺ;->֫(Ll/ܳۘܺ;)V

    goto :goto_6

    .line 591
    :cond_f
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    .line 0
    invoke-static {v6, v7}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    .line 593
    check-cast v1, Ll/ܽۘܺ;

    .line 245
    invoke-virtual {v1}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳۘܺ;

    .line 246
    instance-of v8, v2, Ll/ܰۖܺ;

    if-eqz v8, :cond_f

    .line 247
    check-cast v2, Ll/ܰۖܺ;

    invoke-direct {v0, v2}, Ll/֫ۘܺ;->֫(Ll/ܰۖܺ;)V

    goto :goto_7

    .line 597
    :cond_10
    :goto_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_13

    .line 0
    invoke-static {v4, v7}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    .line 599
    check-cast v1, Ll/ܳۘܺ;

    .line 601
    invoke-virtual {v1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۘܺ;->ۧ()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_8

    .line 605
    :cond_11
    instance-of v2, v1, Ll/ܰۖܺ;

    if-eqz v2, :cond_12

    .line 606
    check-cast v1, Ll/ܰۖܺ;

    invoke-direct {v0, v1}, Ll/֫ۘܺ;->֫(Ll/ܰۖܺ;)V

    goto :goto_8

    .line 608
    :cond_12
    invoke-direct {v0, v1}, Ll/֫ۘܺ;->֫(Ll/ܳۘܺ;)V

    goto :goto_8

    .line 611
    :cond_13
    :goto_9
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 0
    invoke-static {v5, v7}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    .line 613
    check-cast v1, Ll/ܳۘܺ;

    .line 615
    invoke-virtual {v1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۘܺ;->ۧ()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_9

    .line 619
    :cond_14
    instance-of v2, v1, Ll/ܰۖܺ;

    if-eqz v2, :cond_15

    .line 620
    check-cast v1, Ll/ܰۖܺ;

    invoke-direct {v0, v1}, Ll/֫ۘܺ;->֫(Ll/ܰۖܺ;)V

    goto :goto_9

    .line 622
    :cond_15
    invoke-direct {v0, v1}, Ll/֫ۘܺ;->֫(Ll/ܳۘܺ;)V

    goto :goto_9
.end method

.method private ֫(IILl/ܰۡܺ;)Z
    .locals 5

    const/4 v0, 0x0

    .line 158
    iget-object v1, p0, Ll/֫ۘܺ;->ܳ:[I

    const/4 v2, 0x1

    if-eq p2, v2, :cond_1

    .line 159
    aget p3, v1, p1

    if-eq p3, p2, :cond_0

    .line 160
    aput p2, v1, p1

    return v2

    :cond_0
    return v0

    .line 165
    :cond_1
    aget v3, v1, p1

    iget-object v4, p0, Ll/֫ۘܺ;->ܿ:[Ll/ܰۡܺ;

    if-ne v3, p2, :cond_3

    aget-object v3, v4, p1

    .line 166
    invoke-virtual {v3, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    return v0

    .line 167
    :cond_3
    :goto_0
    aput p2, v1, p1

    .line 168
    aput-object p3, v4, p1

    return v2
.end method
