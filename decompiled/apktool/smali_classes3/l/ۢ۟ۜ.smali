.class public final Ll/ۢ۟ۜ;
.super Ljava/lang/Object;
.source "R790"


# instance fields
.field public ֫:J

.field public ۧ:Ll/᩻۟ۜ;

.field public ܽ:Ll/ۜ۟ۜ;

.field public final ܿ:Ll/ܿ۟ۜ;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/۟ܰۜ;)V
    .locals 2

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x7fffffffffffffffL

    .line 132
    iput-wide v0, p0, Ll/ۢ۟ۜ;->ᩳ:J

    .line 135
    new-instance v0, Ll/ܿ۟ۜ;

    invoke-direct {v0, p1}, Ll/ܿ۟ۜ;-><init>(Ll/۟ܰۜ;)V

    iput-object v0, p0, Ll/ۢ۟ۜ;->ܿ:Ll/ܿ۟ۜ;

    return-void
.end method

.method public static ֫(Ll/ۢ۟ۜ;J)Ll/ۚ۟ۜ;
    .locals 31

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 172
    iget-object v3, v0, Ll/ۢ۟ۜ;->ܿ:Ll/ܿ۟ۜ;

    invoke-static {v3}, Ll/ܿ۟ۜ;->֫(Ll/ܿ۟ۜ;)J

    move-result-wide v3

    iput-wide v3, v0, Ll/ۢ۟ۜ;->֫:J

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-lez v7, :cond_17

    cmp-long v7, v1, v3

    if-gez v7, :cond_17

    const-wide/32 v3, 0x1000000

    cmp-long v7, v1, v3

    if-lez v7, :cond_0

    goto/16 :goto_a

    .line 177
    :cond_0
    iput-wide v1, v0, Ll/ۢ۟ۜ;->ᩳ:J

    .line 178
    invoke-direct/range {p0 .. p0}, Ll/ۢ۟ۜ;->ۧ()Ll/ۜ۟ۜ;

    move-result-object v3

    iput-object v3, v0, Ll/ۢ۟ۜ;->ܽ:Ll/ۜ۟ۜ;

    if-eqz v3, :cond_17

    .line 179
    invoke-static {v3}, Ll/ۜ۟ۜ;->ܿ(Ll/ۜ۟ۜ;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_a

    .line 182
    :cond_1
    iget-object v3, v0, Ll/ۢ۟ۜ;->ܽ:Ll/ۜ۟ۜ;

    const/4 v4, 0x1

    invoke-static {v3, v4}, Ll/ۜ۟ۜ;->ۧ(Ll/ۜ۟ۜ;I)Ljava/util/ArrayList;

    move-result-object v3

    .line 183
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-eq v7, v4, :cond_2

    goto/16 :goto_a

    :cond_2
    const/4 v4, 0x0

    .line 186
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖ۟ۜ;

    .line 187
    new-instance v4, Ll/᩻۟ۜ;

    iget-wide v7, v0, Ll/ۢ۟ۜ;->֫:J

    invoke-direct {v4, v7, v8}, Ll/᩻۟ۜ;-><init>(J)V

    iput-object v4, v0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    .line 189
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 190
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 192
    :goto_0
    iget-wide v8, v0, Ll/ۢ۟ۜ;->֫:J

    cmp-long v10, v1, v8

    if-gez v10, :cond_6

    .line 193
    invoke-direct {v0, v1, v2, v8, v9}, Ll/ۢ۟ۜ;->֫(JJ)Ll/ᩳ۟ۜ;

    move-result-object v8

    .line 194
    invoke-static {v8}, Ll/ᩳ۟ۜ;->ܳ(Ll/ᩳ۟ۜ;)I

    move-result v9

    invoke-static {}, Ll/֡۟ۜ;->ۖ()I

    move-result v10

    if-ne v9, v10, :cond_3

    .line 195
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 196
    :cond_3
    invoke-static {v8}, Ll/ᩳ۟ۜ;->ܳ(Ll/ᩳ۟ۜ;)I

    move-result v1

    invoke-static {}, Ll/֡۟ۜ;->ܳ()I

    move-result v2

    if-ne v1, v2, :cond_4

    .line 197
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 198
    :cond_4
    invoke-static {v8}, Ll/ᩳ۟ۜ;->ܳ(Ll/ᩳ۟ۜ;)I

    move-result v1

    invoke-static {}, Ll/֡۟ۜ;->᩸()I

    move-result v2

    if-eq v1, v2, :cond_5

    goto/16 :goto_a

    .line 201
    :cond_5
    :goto_1
    invoke-static {v8}, Ll/ᩳ۟ۜ;->֫(Ll/ᩳ۟ۜ;)J

    move-result-wide v1

    goto :goto_0

    :cond_6
    if-nez v10, :cond_17

    .line 203
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto/16 :goto_a

    .line 207
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 208
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 209
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const-wide/high16 v9, -0x8000000000000000L

    const/4 v11, 0x0

    .line 211
    :goto_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v11, v12, :cond_14

    .line 212
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    add-int/lit8 v11, v11, 0x1

    .line 213
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-ge v11, v15, :cond_8

    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Long;

    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    move-wide v5, v15

    goto :goto_3

    :cond_8
    iget-wide v5, v0, Ll/ۢ۟ۜ;->֫:J

    :goto_3
    move-wide/from16 p1, v9

    sub-long v9, v5, v13

    const-wide/16 v15, 0x0

    cmp-long v17, v9, v15

    if-lez v17, :cond_17

    const-wide/32 v17, 0x7fffffff

    cmp-long v19, v9, v17

    if-lez v19, :cond_9

    goto/16 :goto_a

    .line 218
    :cond_9
    invoke-direct {v0, v13, v14}, Ll/ۢ۟ۜ;->֫(J)Ll/᩷۟ۜ;

    move-result-object v17

    .line 219
    invoke-static/range {v17 .. v17}, Ll/᩷۟ۜ;->֫(Ll/᩷۟ۜ;)Ljava/util/HashMap;

    move-result-object v15

    invoke-static {v3}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_17

    .line 220
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v15

    move-object/from16 v16, v4

    const/4 v4, 0x1

    if-eq v15, v4, :cond_a

    goto/16 :goto_a

    :cond_a
    const/4 v4, 0x0

    .line 223
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ۟ۜ;

    .line 224
    invoke-static {v0}, Ll/ۘ۟ۜ;->ܳ(Ll/ۘ۟ۜ;)Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-static {v0}, Ll/ۘ۟ۜ;->ܿ(Ll/ۘ۟ۜ;)Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_a

    .line 526
    :cond_b
    invoke-static {v0, v13, v14, v5, v6}, Ll/ۢ۟ۜ;->֫(Ll/ۘ۟ۜ;JJ)V

    .line 527
    invoke-static {v0}, Ll/ۘ۟ۜ;->ۜ(Ll/ۘ۟ۜ;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ᩴ۟ۜ;

    .line 528
    invoke-static {v15}, Ll/ᩴ۟ۜ;->ۧ(Ll/ᩴ۟ۜ;)J

    move-result-wide v20

    const/16 v17, 0x0

    move-object/from16 v22, v4

    move-object/from16 v17, v8

    const/4 v4, 0x0

    move-wide/from16 v29, v9

    move-wide/from16 v8, v20

    move-wide/from16 v20, v29

    .line 529
    :goto_5
    invoke-static {v15}, Ll/ᩴ۟ۜ;->ܽ(Ll/ᩴ۟ۜ;)I

    move-result v10

    if-ge v4, v10, :cond_e

    .line 530
    invoke-static {v15}, Ll/ᩴ۟ۜ;->ܿ(Ll/ᩴ۟ۜ;)[I

    move-result-object v10

    aget v10, v10, v4

    move/from16 v23, v11

    int-to-long v10, v10

    invoke-static {v8, v9, v10, v11}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v10

    .line 532
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v24

    :cond_c
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_d

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Ll/ᩳ۟ۜ;

    .line 533
    invoke-static/range {v25 .. v25}, Ll/ᩳ۟ۜ;->ܿ(Ll/ᩳ۟ۜ;)J

    move-result-wide v26

    cmp-long v28, v26, v13

    if-ltz v28, :cond_c

    invoke-static/range {v25 .. v25}, Ll/ᩳ۟ۜ;->֫(Ll/ᩳ۟ۜ;)J

    move-result-wide v26

    cmp-long v28, v26, v5

    if-gtz v28, :cond_c

    invoke-static/range {v25 .. v25}, Ll/ᩳ۟ۜ;->ܽ(Ll/ᩳ۟ۜ;)J

    move-result-wide v26

    cmp-long v28, v8, v26

    if-ltz v28, :cond_c

    invoke-static/range {v25 .. v25}, Ll/ᩳ۟ۜ;->֫(Ll/ᩳ۟ۜ;)J

    move-result-wide v25

    cmp-long v27, v10, v25

    if-gtz v27, :cond_c

    add-int/lit8 v4, v4, 0x1

    move-wide v8, v10

    move/from16 v11, v23

    goto :goto_5

    .line 540
    :cond_d
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 540
    throw v0

    :cond_e
    move-object/from16 v8, v17

    move-wide/from16 v9, v20

    move-object/from16 v4, v22

    goto :goto_4

    :cond_f
    move-object/from16 v17, v8

    move-wide/from16 v20, v9

    move/from16 v23, v11

    .line 228
    invoke-static {v0}, Ll/ۘ۟ۜ;->ۜ(Ll/ۘ۟ۜ;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide/from16 v9, p1

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩴ۟ۜ;

    .line 229
    invoke-static {v0}, Ll/ۘ۟ۜ;->֫(Ll/ۘ۟ۜ;)J

    move-result-wide v13

    move-object v8, v7

    invoke-static {v5}, Ll/ᩴ۟ۜ;->ܳ(Ll/ᩴ۟ۜ;)J

    move-result-wide v6

    invoke-static {v13, v14, v6, v7}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v6

    const/4 v11, 0x0

    .line 230
    :goto_7
    invoke-static {v5}, Ll/ᩴ۟ۜ;->ܽ(Ll/ᩴ۟ۜ;)I

    move-result v13

    if-ge v11, v13, :cond_12

    .line 231
    invoke-static {v5}, Ll/ᩴ۟ۜ;->᩻(Ll/ᩴ۟ۜ;)[Z

    move-result-object v13

    aget-boolean v13, v13, v11

    if-eqz v13, :cond_11

    .line 232
    invoke-static {v5}, Ll/ᩴ۟ۜ;->֫(Ll/ᩴ۟ۜ;)[I

    move-result-object v13

    aget v13, v13, v11

    int-to-long v13, v13

    invoke-static {v6, v7, v13, v14}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v13

    move-wide/from16 v24, v6

    .line 233
    invoke-static {v3}, Ll/ۖ۟ۜ;->ܳ(Ll/ۖ۟ۜ;)J

    move-result-wide v6

    invoke-static {v13, v14, v6, v7}, Ll/֡۟ۜ;->ۧ(JJ)J

    move-result-wide v6

    cmp-long v13, v6, v9

    if-gtz v13, :cond_10

    goto/16 :goto_a

    .line 238
    :cond_10
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide/from16 v13, v20

    long-to-int v9, v13

    .line 240
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v15, v17

    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide v9, v6

    goto :goto_8

    :cond_11
    move-wide/from16 v24, v6

    move-object/from16 v15, v17

    move-wide/from16 v13, v20

    .line 242
    :goto_8
    invoke-static {v5}, Ll/ᩴ۟ۜ;->ᩳ(Ll/ᩴ۟ۜ;)[I

    move-result-object v6

    aget v6, v6, v11

    int-to-long v6, v6

    move-object/from16 v17, v3

    move-object/from16 p1, v4

    move-wide/from16 v3, v24

    invoke-static {v3, v4, v6, v7}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v6

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v4, p1

    move-wide/from16 v20, v13

    move-object/from16 v3, v17

    move-object/from16 v17, v15

    goto :goto_7

    :cond_12
    move-object/from16 v15, v17

    move-object v7, v8

    goto/16 :goto_6

    :cond_13
    move-object/from16 v15, v17

    move-object/from16 v0, p0

    move-object v8, v15

    move-object/from16 v4, v16

    move/from16 v11, v23

    const-wide/16 v5, 0x0

    goto/16 :goto_2

    :cond_14
    move-object v15, v8

    .line 246
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    goto :goto_a

    .line 249
    :cond_15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 250
    new-array v3, v0, [J

    .line 251
    new-array v4, v0, [J

    .line 252
    new-array v5, v0, [I

    const/4 v6, 0x0

    :goto_9
    if-ge v6, v0, :cond_16

    .line 254
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    aput-wide v7, v3, v6

    .line 255
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    aput-wide v7, v4, v6

    .line 256
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    aput v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    .line 258
    :cond_16
    new-instance v0, Ll/ۚ۟ۜ;

    invoke-direct {v0, v3, v4, v5}, Ll/ۚ۟ۜ;-><init>([J[J[I)V

    return-object v0

    :cond_17
    :goto_a
    const/4 v0, 0x0

    return-object v0
.end method

.method private ֫(JJ)Ll/ᩳ۟ۜ;
    .locals 20

    move-wide/from16 v1, p1

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-ltz v0, :cond_4

    const-wide/16 v5, 0x8

    add-long v7, v1, v5

    cmp-long v0, v7, p3

    if-gtz v0, :cond_4

    move-object/from16 v10, p0

    .line 961
    iget-object v0, v10, Ll/ۢ۟ۜ;->ܿ:Ll/ܿ۟ۜ;

    const/16 v9, 0x8

    invoke-static {v0, v1, v2, v9}, Ll/ܿ۟ۜ;->֫(Ll/ܿ۟ۜ;JI)[B

    move-result-object v11

    const/4 v12, 0x0

    .line 962
    invoke-static {v12, v11}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v13

    const/4 v15, 0x4

    .line 963
    invoke-static {v15, v11}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v11

    const-wide/16 v15, 0x1

    cmp-long v17, v13, v15

    if-nez v17, :cond_1

    const-wide/16 v3, 0x10

    add-long v5, v1, v3

    cmp-long v13, v5, p3

    if-gtz v13, :cond_0

    .line 969
    invoke-static {v0, v7, v8, v9}, Ll/ܿ۟ۜ;->֫(Ll/ܿ۟ۜ;JI)[B

    move-result-object v0

    invoke-static {v12, v0}, Ll/֡۟ۜ;->ۧ(I[B)J

    move-result-wide v5

    move-wide/from16 v18, v3

    move-wide v3, v5

    move-wide/from16 v5, v18

    goto :goto_0

    .line 967
    :cond_0
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 967
    throw v0

    :cond_1
    cmp-long v0, v13, v3

    if-eqz v0, :cond_3

    move-wide v3, v13

    .line 974
    :goto_0
    invoke-static {v1, v2, v3, v4}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v7

    cmp-long v0, v3, v5

    if-ltz v0, :cond_2

    cmp-long v0, v7, p3

    if-gtz v0, :cond_2

    .line 978
    new-instance v12, Ll/ᩳ۟ۜ;

    move-object v0, v12

    move-wide/from16 v1, p1

    move v9, v11

    invoke-direct/range {v0 .. v9}, Ll/ᩳ۟ۜ;-><init>(JJJJI)V

    return-object v12

    .line 976
    :cond_2
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 976
    throw v0

    .line 972
    :cond_3
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 972
    throw v0

    :cond_4
    move-object/from16 v10, p0

    .line 959
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 959
    throw v0
.end method

.method private ֫(J)Ll/᩷۟ۜ;
    .locals 21

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 565
    iget-wide v3, v0, Ll/ۢ۟ۜ;->֫:J

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۢ۟ۜ;->֫(JJ)Ll/ᩳ۟ۜ;

    move-result-object v3

    .line 566
    invoke-static {v3}, Ll/ᩳ۟ۜ;->ܳ(Ll/ᩳ۟ۜ;)I

    move-result v4

    invoke-static {}, Ll/֡۟ۜ;->ۖ()I

    move-result v5

    if-ne v4, v5, :cond_2b

    invoke-static {v3}, Ll/ᩳ۟ۜ;->᩻(Ll/ᩳ۟ۜ;)J

    move-result-wide v4

    const-wide/32 v6, 0x400000

    cmp-long v8, v4, v6

    if-gtz v8, :cond_2b

    invoke-static {v3}, Ll/ᩳ۟ۜ;->֫(Ll/ᩳ۟ۜ;)J

    move-result-wide v4

    iget-object v6, v0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    invoke-static {v6}, Ll/᩻۟ۜ;->ۧ(Ll/᩻۟ۜ;)J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-gtz v8, :cond_2b

    .line 569
    invoke-static {v3}, Ll/ᩳ۟ۜ;->ᩳ(Ll/ᩳ۟ۜ;)J

    move-result-wide v4

    long-to-int v5, v4

    iget-object v4, v0, Ll/ۢ۟ۜ;->ܿ:Ll/ܿ۟ۜ;

    invoke-static {v4, v1, v2, v5}, Ll/ܿ۟ۜ;->֫(Ll/ܿ۟ۜ;JI)[B

    move-result-object v4

    .line 570
    new-instance v5, Ll/᩷۟ۜ;

    invoke-direct {v5}, Ll/᩷۟ۜ;-><init>()V

    .line 571
    invoke-static {v3}, Ll/ᩳ۟ۜ;->ۧ(Ll/ᩳ۟ۜ;)J

    move-result-wide v6

    long-to-int v3, v6

    array-length v6, v4

    invoke-static {v3, v6, v4}, Ll/֡۟ۜ;->ۧ(II[B)Ljava/util/ArrayList;

    move-result-object v3

    .line 572
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽ۟ۜ;

    .line 573
    invoke-static {v6}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v7

    invoke-static {}, Ll/֡۟ۜ;->۫()I

    move-result v8

    if-eq v7, v8, :cond_0

    goto :goto_0

    .line 592
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 593
    invoke-static {v6}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v8

    invoke-static {v6}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v6

    invoke-static {v8, v6, v4}, Ll/֡۟ۜ;->ۧ(II[B)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v8, 0x0

    move-object v9, v8

    :cond_1
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܽ۟ۜ;

    .line 594
    invoke-static {v10}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v11

    invoke-static {}, Ll/֡۟ۜ;->ۙ()I

    move-result v12

    if-ne v11, v12, :cond_2

    move-object v8, v10

    goto :goto_1

    .line 596
    :cond_2
    invoke-static {v10}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v11

    invoke-static {}, Ll/֡۟ۜ;->᩶()I

    move-result v12

    if-ne v11, v12, :cond_3

    move-object v9, v10

    goto :goto_1

    .line 598
    :cond_3
    invoke-static {v10}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v11

    invoke-static {}, Ll/֡۟ۜ;->ۨ()I

    move-result v12

    if-ne v11, v12, :cond_4

    .line 599
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 600
    :cond_4
    invoke-static {v10}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v11

    invoke-static {v11}, Ll/֡۟ۜ;->֫(I)Z

    move-result v11

    if-nez v11, :cond_5

    invoke-static {v10}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v11

    invoke-static {}, Ll/֡۟ۜ;->᩺()I

    move-result v12

    if-ne v11, v12, :cond_1

    .line 601
    invoke-static {v4, v10}, Ll/֡۟ۜ;->֫([BLl/ܽ۟ۜ;)Z

    move-result v10

    if-nez v10, :cond_5

    goto :goto_1

    .line 602
    :cond_5
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 602
    throw v1

    :cond_6
    if-eqz v8, :cond_29

    .line 605
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_29

    .line 644
    invoke-static {v8}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v6

    .line 645
    invoke-static {v6, v4}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v8

    add-int/lit8 v10, v6, 0x4

    .line 647
    invoke-static {v10, v4}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v10

    add-int/lit8 v11, v6, 0x8

    .line 649
    iget-object v12, v0, Ll/ۢ۟ۜ;->ܽ:Ll/ۜ۟ۜ;

    invoke-static {v12}, Ll/ۜ۟ۜ;->ۧ(Ll/ۜ۟ۜ;)Ljava/util/HashMap;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۖ۟ۜ;

    const/4 v13, 0x0

    if-nez v12, :cond_7

    .line 651
    invoke-static {v10}, Ll/ۘ۟ۜ;->֫(I)Ll/ۘ۟ۜ;

    move-result-object v6

    goto :goto_3

    .line 653
    :cond_7
    iget-object v14, v0, Ll/ۢ۟ۜ;->ܽ:Ll/ۜ۟ۜ;

    invoke-static {v14, v10}, Ll/ۜ۟ۜ;->֫(Ll/ۜ۟ۜ;I)Ll/ܳ۟ۜ;

    move-result-object v14

    if-eqz v14, :cond_28

    .line 657
    new-instance v15, Ll/ۘ۟ۜ;

    invoke-static {v12}, Ll/ۖ۟ۜ;->ܳ(Ll/ۖ۟ۜ;)J

    invoke-direct {v15, v10, v13}, Ll/ۘ۟ۜ;-><init>(II)V

    .line 658
    invoke-static {v15, v1, v2}, Ll/ۘ۟ۜ;->ۧ(Ll/ۘ۟ۜ;J)V

    and-int/lit8 v10, v8, 0x1

    if-eqz v10, :cond_8

    .line 660
    invoke-static {v11, v4}, Ll/֡۟ۜ;->ۧ(I[B)J

    move-result-wide v11

    invoke-static {v15, v11, v12}, Ll/ۘ۟ۜ;->ۧ(Ll/ۘ۟ۜ;J)V

    add-int/lit8 v11, v6, 0x10

    :cond_8
    if-nez v10, :cond_9

    const/high16 v6, 0x20000

    and-int/2addr v6, v8

    if-eqz v6, :cond_9

    const/4 v6, 0x1

    goto :goto_2

    :cond_9
    const/4 v6, 0x0

    .line 663
    :goto_2
    invoke-static {v15, v6}, Ll/ۘ۟ۜ;->֫(Ll/ۘ۟ۜ;Z)V

    .line 664
    invoke-static {v14}, Ll/ܳ۟ۜ;->ܽ(Ll/ܳ۟ۜ;)I

    move-result v6

    .line 665
    invoke-static {v14}, Ll/ܳ۟ۜ;->֫(Ll/ܳ۟ۜ;)I

    move-result v10

    .line 666
    invoke-static {v14}, Ll/ܳ۟ۜ;->ᩳ(Ll/ܳ۟ۜ;)I

    move-result v12

    .line 667
    invoke-static {v14}, Ll/ܳ۟ۜ;->ۧ(Ll/ܳ۟ۜ;)I

    move-result v13

    and-int/lit8 v14, v8, 0x2

    if-eqz v14, :cond_a

    .line 669
    invoke-static {v11, v4}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    add-int/lit8 v11, v11, 0x4

    :cond_a
    and-int/lit8 v14, v8, 0x8

    if-eqz v14, :cond_b

    .line 673
    invoke-static {v11, v4}, Ll/֡۟ۜ;->ܽ(I[B)I

    move-result v10

    add-int/lit8 v11, v11, 0x4

    :cond_b
    and-int/lit8 v14, v8, 0x10

    if-eqz v14, :cond_c

    .line 677
    invoke-static {v11, v4}, Ll/֡۟ۜ;->ܽ(I[B)I

    move-result v12

    add-int/lit8 v11, v11, 0x4

    :cond_c
    and-int/lit8 v8, v8, 0x20

    if-eqz v8, :cond_d

    .line 681
    invoke-static {v11, v4}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v13

    .line 683
    :cond_d
    new-instance v8, Ll/ܳ۟ۜ;

    invoke-direct {v8, v6, v10, v12, v13}, Ll/ܳ۟ۜ;-><init>(IIII)V

    invoke-static {v15, v8}, Ll/ۘ۟ۜ;->֫(Ll/ۘ۟ۜ;Ll/ܳ۟ۜ;)V

    move-object v6, v15

    .line 612
    :goto_3
    invoke-static {v6}, Ll/ۘ۟ۜ;->ᩳ(Ll/ۘ۟ۜ;)Z

    move-result v8

    if-eqz v8, :cond_f

    :cond_e
    move-object/from16 v16, v3

    goto/16 :goto_12

    :cond_f
    if-eqz v9, :cond_13

    .line 616
    invoke-static {v6}, Ll/ۘ۟ۜ;->᩷(Ll/ۘ۟ۜ;)V

    .line 688
    invoke-static {v9}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v8

    .line 689
    aget-byte v9, v4, v8

    and-int/lit16 v9, v9, 0xff

    const/4 v10, 0x1

    if-eqz v9, :cond_11

    if-ne v9, v10, :cond_10

    goto :goto_4

    .line 691
    :cond_10
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 691
    throw v1

    :cond_11
    :goto_4
    add-int/lit8 v8, v8, 0x4

    if-ne v9, v10, :cond_12

    .line 694
    invoke-static {v8, v4}, Ll/֡۟ۜ;->ۧ(I[B)J

    move-result-wide v8

    goto :goto_5

    :cond_12
    invoke-static {v8, v4}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v8

    .line 617
    :goto_5
    invoke-static {v6, v8, v9}, Ll/ۘ۟ۜ;->֫(Ll/ۘ۟ۜ;J)V

    .line 621
    :cond_13
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܽ۟ۜ;

    .line 639
    invoke-static {v11}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v12

    add-int/lit8 v12, v12, 0x4

    invoke-static {v12, v4}, Ll/֡۟ۜ;->ܽ(I[B)I

    move-result v12

    if-lez v12, :cond_26

    const/16 v13, 0x1000

    if-gt v12, v13, :cond_26

    rsub-int v12, v12, 0x1000

    if-gt v10, v12, :cond_26

    .line 703
    invoke-static {v11}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v11

    .line 704
    invoke-static {v11, v4}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v12

    add-int/lit8 v14, v11, 0x4

    .line 706
    invoke-static {v14, v4}, Ll/֡۟ۜ;->ܽ(I[B)I

    move-result v14

    add-int/lit8 v15, v11, 0x8

    if-lez v14, :cond_25

    if-gt v14, v13, :cond_25

    .line 711
    new-instance v13, Ll/ᩴ۟ۜ;

    invoke-direct {v13, v14}, Ll/ᩴ۟ۜ;-><init>(I)V

    .line 712
    invoke-static {v13, v8, v9}, Ll/ᩴ۟ۜ;->ۧ(Ll/ᩴ۟ۜ;J)V

    .line 713
    invoke-static {v6}, Ll/ۘ۟ۜ;->ۧ(Ll/ۘ۟ۜ;)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Ll/ᩴ۟ۜ;->֫(Ll/ᩴ۟ۜ;J)V

    and-int/lit8 v0, v12, 0x1

    if-eqz v0, :cond_14

    .line 715
    invoke-static {v13}, Ll/ᩴ۟ۜ;->ۧ(Ll/ᩴ۟ۜ;)J

    move-result-wide v0

    invoke-static {v15, v4}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v2

    move-object/from16 v16, v3

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Ll/ᩴ۟ۜ;->֫(Ll/ᩴ۟ۜ;J)V

    add-int/lit8 v15, v11, 0xc

    goto :goto_7

    :cond_14
    move-object/from16 v16, v3

    :goto_7
    and-int/lit8 v0, v12, 0x4

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    goto :goto_8

    :cond_15
    const/4 v0, 0x0

    .line 719
    :goto_8
    invoke-static {v6}, Ll/ۘ۟ۜ;->ܽ(Ll/ۘ۟ۜ;)Ll/ܳ۟ۜ;

    move-result-object v1

    invoke-static {v1}, Ll/ܳ۟ۜ;->ۧ(Ll/ܳ۟ۜ;)I

    move-result v1

    if-eqz v0, :cond_16

    .line 721
    invoke-static {v15, v4}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v1

    add-int/lit8 v15, v15, 0x4

    :cond_16
    and-int/lit16 v2, v12, 0x100

    if-eqz v2, :cond_17

    const/4 v2, 0x1

    goto :goto_9

    :cond_17
    const/4 v2, 0x0

    :goto_9
    and-int/lit16 v3, v12, 0x200

    if-eqz v3, :cond_18

    const/4 v3, 0x1

    goto :goto_a

    :cond_18
    const/4 v3, 0x0

    :goto_a
    and-int/lit16 v11, v12, 0x400

    if-eqz v11, :cond_19

    const/4 v11, 0x1

    goto :goto_b

    :cond_19
    const/4 v11, 0x0

    :goto_b
    and-int/lit16 v12, v12, 0x800

    if-eqz v12, :cond_1a

    const/4 v12, 0x1

    goto :goto_c

    :cond_1a
    const/4 v12, 0x0

    :goto_c
    const/16 v17, 0x0

    move/from16 v17, v1

    const/4 v1, 0x0

    :goto_d
    if-ge v1, v14, :cond_24

    .line 729
    invoke-static {v13}, Ll/ᩴ۟ۜ;->ᩳ(Ll/ᩴ۟ۜ;)[I

    move-result-object v18

    if-eqz v2, :cond_1b

    invoke-static {v15, v4}, Ll/֡۟ۜ;->ܽ(I[B)I

    move-result v19

    goto :goto_e

    :cond_1b
    invoke-static {v6}, Ll/ۘ۟ۜ;->ܽ(Ll/ۘ۟ۜ;)Ll/ܳ۟ۜ;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ll/ܳ۟ۜ;->֫(Ll/ܳ۟ۜ;)I

    move-result v19

    :goto_e
    aput v19, v18, v1

    if-eqz v2, :cond_1c

    add-int/lit8 v15, v15, 0x4

    .line 733
    :cond_1c
    invoke-static {v13}, Ll/ᩴ۟ۜ;->ܿ(Ll/ᩴ۟ۜ;)[I

    move-result-object v18

    if-eqz v3, :cond_1d

    invoke-static {v15, v4}, Ll/֡۟ۜ;->ܽ(I[B)I

    move-result v19

    goto :goto_f

    :cond_1d
    invoke-static {v6}, Ll/ۘ۟ۜ;->ܽ(Ll/ۘ۟ۜ;)Ll/ܳ۟ۜ;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ll/ܳ۟ۜ;->ᩳ(Ll/ܳ۟ۜ;)I

    move-result v19

    :goto_f
    aput v19, v18, v1

    if-eqz v3, :cond_1e

    add-int/lit8 v15, v15, 0x4

    :cond_1e
    if-eqz v11, :cond_1f

    .line 738
    invoke-static {v15, v4}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v18

    goto :goto_10

    :cond_1f
    add-int v18, v10, v1

    if-nez v18, :cond_20

    if-eqz v0, :cond_20

    move/from16 v18, v17

    goto :goto_10

    .line 739
    :cond_20
    invoke-static {v6}, Ll/ۘ۟ۜ;->ܽ(Ll/ۘ۟ۜ;)Ll/ܳ۟ۜ;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Ll/ܳ۟ۜ;->ۧ(Ll/ܳ۟ۜ;)I

    move-result v18

    :goto_10
    if-eqz v11, :cond_21

    add-int/lit8 v15, v15, 0x4

    :cond_21
    if-eqz v12, :cond_22

    .line 744
    invoke-static {v13}, Ll/ᩴ۟ۜ;->֫(Ll/ᩴ۟ۜ;)[I

    move-result-object v19

    invoke-static {v15, v4}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v20

    aput v20, v19, v1

    add-int/lit8 v15, v15, 0x4

    .line 747
    :cond_22
    invoke-static {v13}, Ll/ᩴ۟ۜ;->᩻(Ll/ᩴ۟ۜ;)[Z

    move-result-object v19

    shr-int/lit8 v18, v18, 0x10

    and-int/lit8 v18, v18, 0x1

    if-nez v18, :cond_23

    const/16 v18, 0x1

    goto :goto_11

    :cond_23
    const/16 v18, 0x0

    :goto_11
    aput-boolean v18, v19, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    .line 628
    :cond_24
    invoke-static {v13}, Ll/ᩴ۟ۜ;->ۜ(Ll/ᩴ۟ۜ;)J

    move-result-wide v0

    invoke-static {v8, v9, v0, v1}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v8

    .line 629
    invoke-static {v13}, Ll/ᩴ۟ۜ;->ܽ(Ll/ᩴ۟ۜ;)I

    move-result v0

    add-int/2addr v10, v0

    .line 630
    invoke-static {v6}, Ll/ۘ۟ۜ;->ۜ(Ll/ۘ۟ۜ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, v16

    goto/16 :goto_6

    .line 709
    :cond_25
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 709
    throw v0

    .line 625
    :cond_26
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 625
    throw v0

    .line 578
    :goto_12
    invoke-static {v5}, Ll/᩷۟ۜ;->ۧ(Ll/᩷۟ۜ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    invoke-static {v6}, Ll/ۘ۟ۜ;->ᩳ(Ll/ۘ۟ۜ;)Z

    move-result v0

    if-eqz v0, :cond_27

    goto :goto_13

    .line 582
    :cond_27
    invoke-static {v5}, Ll/᩷۟ۜ;->֫(Ll/᩷۟ۜ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v6}, Ll/ۘ۟ۜ;->᩻(Ll/ۘ۟ۜ;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/ۖۘܽ;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ll/ۖۘܽ;-><init>(I)V

    invoke-static {v0, v1, v2}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_13
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, v16

    goto/16 :goto_0

    .line 655
    :cond_28
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 655
    throw v0

    .line 606
    :cond_29
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 606
    throw v0

    :cond_2a
    return-object v5

    .line 567
    :cond_2b
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 567
    throw v0
.end method

.method private ֫()Ll/᩷᩷ۧ;
    .locals 34

    move-object/from16 v0, p0

    .line 143
    iget-object v1, v0, Ll/ۢ۟ۜ;->ܿ:Ll/ܿ۟ۜ;

    invoke-static {v1}, Ll/ܿ۟ۜ;->֫(Ll/ܿ۟ۜ;)J

    move-result-wide v2

    iput-wide v2, v0, Ll/ۢ۟ۜ;->֫:J

    const-wide v2, 0x7fffffffffffffffL

    .line 144
    iput-wide v2, v0, Ll/ۢ۟ۜ;->ᩳ:J

    .line 145
    invoke-direct/range {p0 .. p0}, Ll/ۢ۟ۜ;->ۧ()Ll/ۜ۟ۜ;

    move-result-object v4

    iput-object v4, v0, Ll/ۢ۟ۜ;->ܽ:Ll/ۜ۟ۜ;

    if-eqz v4, :cond_3d

    .line 146
    invoke-static {v4}, Ll/ۜ۟ۜ;->ܿ(Ll/ۜ۟ۜ;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_1f

    .line 287
    :cond_0
    iget-wide v4, v0, Ll/ۢ۟ۜ;->֫:J

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x10

    cmp-long v14, v4, v12

    if-gez v14, :cond_1

    const/4 v1, 0x0

    :goto_0
    const/4 v4, 0x0

    goto/16 :goto_8

    :cond_1
    sub-long v14, v4, v12

    .line 290
    invoke-direct {v0, v14, v15, v4, v5}, Ll/ۢ۟ۜ;->֫(JJ)Ll/ᩳ۟ۜ;

    move-result-object v4

    .line 291
    invoke-static {v4}, Ll/ᩳ۟ۜ;->ܳ(Ll/ᩳ۟ۜ;)I

    move-result v5

    invoke-static {}, Ll/֡۟ۜ;->ۡ()I

    move-result v14

    if-ne v5, v14, :cond_d

    invoke-static {v4}, Ll/ᩳ۟ۜ;->ᩳ(Ll/ᩳ۟ۜ;)J

    move-result-wide v14

    cmp-long v5, v14, v12

    if-nez v5, :cond_d

    invoke-static {v4}, Ll/ᩳ۟ۜ;->֫(Ll/ᩳ۟ۜ;)J

    move-result-wide v4

    iget-wide v12, v0, Ll/ۢ۟ۜ;->֫:J

    cmp-long v14, v4, v12

    if-eqz v14, :cond_2

    goto/16 :goto_6

    :cond_2
    const-wide/16 v4, 0x4

    sub-long/2addr v12, v4

    const/4 v4, 0x4

    .line 294
    invoke-static {v1, v12, v13, v4}, Ll/ܿ۟ۜ;->֫(Ll/ܿ۟ۜ;JI)[B

    move-result-object v4

    .line 295
    invoke-static {v9, v4}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v4

    cmp-long v12, v4, v10

    if-lez v12, :cond_d

    const-wide/32 v12, 0x400000

    cmp-long v14, v4, v12

    if-gtz v14, :cond_d

    .line 296
    iget-wide v12, v0, Ll/ۢ۟ۜ;->֫:J

    cmp-long v14, v4, v12

    if-lez v14, :cond_3

    goto/16 :goto_6

    :cond_3
    sub-long v4, v12, v4

    .line 300
    invoke-direct {v0, v4, v5, v12, v13}, Ll/ۢ۟ۜ;->֫(JJ)Ll/ᩳ۟ۜ;

    move-result-object v12

    .line 301
    invoke-static {v12}, Ll/ᩳ۟ۜ;->ܳ(Ll/ᩳ۟ۜ;)I

    move-result v13

    invoke-static {}, Ll/֡۟ۜ;->ۢ()I

    move-result v14

    if-ne v13, v14, :cond_c

    invoke-static {v12}, Ll/ᩳ۟ۜ;->֫(Ll/ᩳ۟ۜ;)J

    move-result-wide v13

    iget-wide v6, v0, Ll/ۢ۟ۜ;->֫:J

    cmp-long v18, v13, v6

    if-eqz v18, :cond_4

    goto/16 :goto_5

    .line 304
    :cond_4
    invoke-static {v12}, Ll/ᩳ۟ۜ;->ܽ(Ll/ᩳ۟ۜ;)J

    move-result-wide v6

    invoke-static {v12}, Ll/ᩳ۟ۜ;->᩻(Ll/ᩳ۟ۜ;)J

    move-result-wide v12

    long-to-int v13, v12

    invoke-static {v1, v6, v7, v13}, Ll/ܿ۟ۜ;->֫(Ll/ܿ۟ۜ;JI)[B

    move-result-object v1

    .line 305
    new-instance v6, Ll/᩻۟ۜ;

    invoke-direct {v6, v4, v5}, Ll/᩻۟ۜ;-><init>(J)V

    .line 306
    array-length v4, v1

    .line 904
    invoke-static {v9, v4, v1}, Ll/֡۟ۜ;->ۧ(II[B)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/16 v5, 0x1000

    const/4 v7, 0x2

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܽ۟ۜ;

    .line 905
    invoke-static {v12}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v13

    invoke-static {}, Ll/֡۟ۜ;->ۗ()I

    move-result v14

    if-ne v13, v14, :cond_a

    .line 912
    invoke-static {v12}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v12

    .line 913
    aget-byte v13, v1, v12

    and-int/lit16 v13, v13, 0xff

    if-eqz v13, :cond_6

    if-ne v13, v8, :cond_5

    goto :goto_2

    .line 915
    :cond_5
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 915
    throw v1

    :cond_6
    :goto_2
    add-int/lit8 v14, v12, 0x4

    .line 918
    invoke-static {v14, v1}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v14

    add-int/lit8 v16, v12, 0xb

    .line 920
    aget-byte v15, v1, v16

    and-int/lit16 v2, v15, 0xff

    shr-int/lit8 v3, v2, 0x4

    and-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, 0x1

    shr-int/2addr v2, v7

    and-int/lit8 v2, v2, 0x3

    add-int/2addr v2, v8

    and-int/lit8 v7, v15, 0x3

    add-int/2addr v7, v8

    add-int/lit8 v15, v12, 0xc

    .line 925
    invoke-static {v15, v1}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v15

    add-int/lit8 v12, v12, 0x10

    if-ltz v15, :cond_9

    if-gt v15, v5, :cond_9

    .line 930
    invoke-static {v6}, Ll/᩻۟ۜ;->֫(Ll/᩻۟ۜ;)Ljava/util/HashMap;

    move-result-object v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v9, Ll/۠ۡ۠;

    const/4 v10, 0x1

    invoke-direct {v9, v10}, Ll/۠ۡ۠;-><init>(I)V

    invoke-static {v5, v14, v9}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v15, :cond_a

    if-ne v13, v8, :cond_7

    .line 935
    invoke-static {v12, v1}, Ll/֡۟ۜ;->ۧ(I[B)J

    move-result-wide v10

    add-int/lit8 v14, v12, 0x8

    .line 936
    invoke-static {v14, v1}, Ll/֡۟ۜ;->ۧ(I[B)J

    move-result-wide v22

    add-int/lit8 v12, v12, 0x10

    goto :goto_4

    .line 939
    :cond_7
    invoke-static {v12, v1}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v10

    add-int/lit8 v14, v12, 0x4

    .line 940
    invoke-static {v14, v1}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v22

    add-int/lit8 v12, v12, 0x8

    :goto_4
    move-wide/from16 v25, v10

    move-wide/from16 v30, v22

    .line 943
    invoke-static {v12, v3, v1}, Ll/֡۟ۜ;->ᩳ(II[B)I

    move-result v10

    add-int/2addr v12, v3

    .line 945
    invoke-static {v12, v2, v1}, Ll/֡۟ۜ;->ᩳ(II[B)I

    move-result v11

    add-int/2addr v12, v2

    .line 947
    invoke-static {v12, v7, v1}, Ll/֡۟ۜ;->ᩳ(II[B)I

    move-result v14

    add-int/2addr v12, v7

    const-wide/16 v20, 0x0

    cmp-long v22, v25, v20

    if-ltz v22, :cond_8

    cmp-long v22, v30, v20

    if-ltz v22, :cond_8

    if-lez v10, :cond_8

    if-lez v11, :cond_8

    if-lez v14, :cond_8

    .line 952
    new-instance v8, Ll/ۡ۟ۜ;

    add-int/lit8 v27, v10, -0x1

    add-int/lit8 v28, v11, -0x1

    add-int/lit8 v29, v14, -0x1

    move-object/from16 v24, v8

    invoke-direct/range {v24 .. v31}, Ll/ۡ۟ۜ;-><init>(JIIIJ)V

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    const/4 v8, 0x1

    goto :goto_3

    .line 950
    :cond_8
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 950
    throw v1

    .line 928
    :cond_9
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 928
    throw v1

    :cond_a
    const/16 v5, 0x1000

    const/4 v7, 0x2

    const-wide v2, 0x7fffffffffffffffL

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    goto/16 :goto_1

    :cond_b
    move-object v1, v6

    goto/16 :goto_0

    :cond_c
    :goto_5
    const/4 v15, 0x0

    move-object v1, v15

    goto :goto_7

    :cond_d
    :goto_6
    const/4 v1, 0x0

    :goto_7
    move-object v4, v1

    .line 149
    :goto_8
    iput-object v1, v0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    if-nez v1, :cond_f

    :cond_e
    :goto_9
    move-object/from16 v17, v4

    goto/16 :goto_1e

    .line 358
    :cond_f
    iget-object v1, v0, Ll/ۢ۟ۜ;->ܽ:Ll/ۜ۟ۜ;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ll/ۜ۟ۜ;->ۧ(Ll/ۜ۟ۜ;I)Ljava/util/ArrayList;

    move-result-object v1

    .line 359
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_11

    .line 360
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v2, :cond_13

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖ۟ۜ;

    invoke-direct {v0, v3}, Ll/ۢ۟ۜ;->֫(Ll/ۖ۟ۜ;)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_a

    .line 363
    :cond_10
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ۟ۜ;

    goto :goto_b

    :cond_11
    const/4 v2, 0x0

    .line 365
    iget-object v1, v0, Ll/ۢ۟ۜ;->ܽ:Ll/ۜ۟ۜ;

    const/4 v3, 0x2

    invoke-static {v1, v3}, Ll/ۜ۟ۜ;->ۧ(Ll/ۜ۟ۜ;I)Ljava/util/ArrayList;

    move-result-object v1

    .line 366
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_13

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖ۟ۜ;

    invoke-direct {v0, v3}, Ll/ۢ۟ۜ;->֫(Ll/ۖ۟ۜ;)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_a

    .line 369
    :cond_12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ۟ۜ;

    goto :goto_b

    :cond_13
    :goto_a
    move-object v1, v4

    :goto_b
    if-nez v1, :cond_14

    goto :goto_9

    .line 316
    :cond_14
    iget-object v2, v0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    invoke-static {v2}, Ll/᩻۟ۜ;->֫(Ll/᩻۟ۜ;)Ljava/util/HashMap;

    move-result-object v2

    invoke-static {v1}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_e

    .line 317
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_e

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/16 v5, 0x1000

    if-le v3, v5, :cond_15

    goto :goto_9

    .line 379
    :cond_15
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 382
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/high16 v5, -0x8000000000000000L

    const-wide/high16 v7, -0x8000000000000000L

    :cond_16
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۡ۟ۜ;

    .line 383
    invoke-static {v9}, Ll/ۡ۟ۜ;->ܽ(Ll/ۡ۟ۜ;)J

    move-result-wide v10

    cmp-long v12, v10, v5

    if-lez v12, :cond_18

    invoke-static {v9}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v5

    const-wide/16 v10, 0x0

    cmp-long v12, v5, v10

    if-lez v12, :cond_18

    invoke-static {v9}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v5

    iget-object v10, v0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    invoke-static {v10}, Ll/᩻۟ۜ;->ۧ(Ll/᩻۟ۜ;)J

    move-result-wide v10

    cmp-long v12, v5, v10

    if-gez v12, :cond_18

    .line 386
    invoke-static {v9}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v5

    cmp-long v10, v5, v7

    if-ltz v10, :cond_17

    .line 389
    invoke-static {v9}, Ll/ۡ۟ۜ;->ܽ(Ll/ۡ۟ۜ;)J

    move-result-wide v5

    .line 390
    invoke-static {v9}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v10

    cmp-long v12, v10, v7

    if-eqz v12, :cond_16

    .line 391
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    invoke-static {v9}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v7

    goto :goto_c

    .line 387
    :cond_17
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 387
    throw v1

    .line 384
    :cond_18
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 384
    throw v1

    .line 395
    :cond_19
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡ۟ۜ;

    .line 396
    invoke-static {v5}, Ll/ۡ۟ۜ;->ܽ(Ll/ۡ۟ۜ;)J

    move-result-wide v5

    invoke-static {v1}, Ll/ۖ۟ۜ;->ܳ(Ll/ۖ۟ۜ;)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ll/֡۟ۜ;->ۧ(JJ)J

    goto :goto_d

    .line 321
    :cond_1a
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1b

    goto/16 :goto_9

    .line 324
    :cond_1b
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 325
    new-array v5, v2, [I

    .line 326
    new-array v6, v2, [J

    .line 327
    new-array v7, v2, [J

    .line 328
    new-array v8, v2, [J

    .line 402
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 403
    iget-object v10, v0, Ll/ۢ۟ۜ;->ܽ:Ll/ۜ۟ۜ;

    invoke-static {v10}, Ll/ۜ۟ۜ;->ܳ(Ll/ۜ۟ۜ;)Ljava/util/ArrayList;

    move-result-object v10

    .line 405
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const-wide v11, 0x7fffffffffffffffL

    :goto_e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_20

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۖ۟ۜ;

    .line 406
    invoke-static {v13}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v14

    invoke-static {v1}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v15

    if-ne v14, v15, :cond_1d

    .line 407
    invoke-direct {v0, v13}, Ll/ۢ۟ۜ;->ۧ(Ll/ۖ۟ۜ;)Ll/ۡ۟ۜ;

    move-result-object v14

    if-eqz v14, :cond_1c

    .line 411
    invoke-static {v13}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v17, v4

    new-instance v4, Ll/ܺ۟ۜ;

    move-object/from16 v22, v7

    move-object/from16 v23, v8

    invoke-static {v14}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v7

    move-object/from16 v24, v10

    const/4 v10, 0x0

    invoke-direct {v4, v13, v7, v8, v10}, Ll/ܺ۟ۜ;-><init>(Ll/ۖ۟ۜ;JI)V

    invoke-virtual {v9, v15, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    invoke-static {v14}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v7

    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    goto :goto_f

    .line 409
    :cond_1c
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 409
    throw v1

    :cond_1d
    move-object/from16 v17, v4

    move-object/from16 v22, v7

    move-object/from16 v23, v8

    move-object/from16 v24, v10

    .line 415
    invoke-static {v13}, Ll/ۖ۟ۜ;->ܿ(Ll/ۖ۟ۜ;)J

    move-result-wide v7

    const-wide/16 v14, 0x0

    cmp-long v4, v7, v14

    if-lez v4, :cond_1e

    .line 417
    invoke-static {v13}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v13, v7, v8}, Ll/ܺ۟ۜ;->֫(Ll/ۖ۟ۜ;J)Ll/ܺ۟ۜ;

    move-result-object v7

    invoke-virtual {v9, v4, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_f
    const/4 v10, 0x0

    goto :goto_10

    .line 420
    :cond_1e
    invoke-direct {v0, v13}, Ll/ۢ۟ۜ;->ۧ(Ll/ۖ۟ۜ;)Ll/ۡ۟ۜ;

    move-result-object v4

    if-eqz v4, :cond_1f

    .line 424
    invoke-static {v13}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v8, Ll/ܺ۟ۜ;

    invoke-static {v4}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v14

    const/4 v10, 0x0

    invoke-direct {v8, v13, v14, v15, v10}, Ll/ܺ۟ۜ;-><init>(Ll/ۖ۟ۜ;JI)V

    invoke-virtual {v9, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    invoke-static {v4}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v7

    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    move-wide v11, v7

    :goto_10
    move-object/from16 v4, v17

    move-object/from16 v7, v22

    move-object/from16 v8, v23

    move-object/from16 v10, v24

    goto/16 :goto_e

    .line 422
    :cond_1f
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 422
    throw v1

    :cond_20
    move-object/from16 v17, v4

    move-object/from16 v22, v7

    move-object/from16 v23, v8

    const-wide v7, 0x7fffffffffffffffL

    const/4 v10, 0x0

    cmp-long v4, v11, v7

    if-eqz v4, :cond_2c

    .line 450
    :goto_11
    iget-object v4, v0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    invoke-static {v4}, Ll/᩻۟ۜ;->ۧ(Ll/᩻۟ۜ;)J

    move-result-wide v7

    cmp-long v4, v11, v7

    if-gez v4, :cond_2a

    .line 451
    iget-object v4, v0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    invoke-static {v4}, Ll/᩻۟ۜ;->ۧ(Ll/᩻۟ۜ;)J

    move-result-wide v7

    invoke-direct {v0, v11, v12, v7, v8}, Ll/ۢ۟ۜ;->֫(JJ)Ll/ᩳ۟ۜ;

    move-result-object v4

    .line 452
    invoke-static {v4}, Ll/ᩳ۟ۜ;->ܳ(Ll/ᩳ۟ۜ;)I

    move-result v7

    invoke-static {}, Ll/֡۟ۜ;->ۖ()I

    move-result v8

    if-ne v7, v8, :cond_29

    .line 453
    invoke-direct {v0, v11, v12}, Ll/ۢ۟ۜ;->֫(J)Ll/᩷۟ۜ;

    move-result-object v7

    .line 454
    invoke-virtual {v9}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_28

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܺ۟ۜ;

    .line 455
    invoke-static {v13}, Ll/ܺ۟ۜ;->ܿ(Ll/ܺ۟ۜ;)Z

    move-result v14

    if-eqz v14, :cond_27

    invoke-static {v13}, Ll/ܺ۟ۜ;->֫(Ll/ܺ۟ۜ;)J

    move-result-wide v14

    cmp-long v16, v11, v14

    if-gez v16, :cond_21

    goto/16 :goto_15

    .line 458
    :cond_21
    invoke-static {v13}, Ll/ܺ۟ۜ;->ۧ(Ll/ܺ۟ۜ;)Ll/ۖ۟ۜ;

    move-result-object v14

    .line 459
    invoke-static {v7}, Ll/᩷۟ۜ;->֫(Ll/᩷۟ۜ;)Ljava/util/HashMap;

    move-result-object v15

    invoke-static {v14}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    if-eqz v14, :cond_26

    .line 460
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v15

    move-object/from16 v16, v7

    const/4 v7, 0x1

    if-ne v15, v7, :cond_26

    .line 463
    invoke-interface {v14, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۘ۟ۜ;

    .line 464
    invoke-static {v7}, Ll/ۘ۟ۜ;->ܳ(Ll/ۘ۟ۜ;)Z

    move-result v10

    if-eqz v10, :cond_25

    .line 467
    invoke-static {v13}, Ll/ܺ۟ۜ;->ܽ(Ll/ܺ۟ۜ;)J

    move-result-wide v14

    .line 549
    invoke-static {v7}, Ll/ۘ۟ۜ;->ۜ(Ll/ۘ۟ۜ;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const-wide/high16 v18, -0x8000000000000000L

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-wide/from16 v5, v18

    :goto_13
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_23

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ll/ᩴ۟ۜ;

    move-object/from16 v19, v1

    move/from16 v26, v2

    .line 550
    invoke-static {v7}, Ll/ۘ۟ۜ;->֫(Ll/ۘ۟ۜ;)J

    move-result-wide v1

    move-object/from16 v28, v7

    move-object/from16 v27, v8

    invoke-static/range {v18 .. v18}, Ll/ᩴ۟ۜ;->ܳ(Ll/ᩴ۟ۜ;)J

    move-result-wide v7

    invoke-static {v1, v2, v7, v8}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v1

    const/4 v7, 0x0

    .line 551
    :goto_14
    invoke-static/range {v18 .. v18}, Ll/ᩴ۟ۜ;->ܽ(Ll/ᩴ۟ۜ;)I

    move-result v8

    if-ge v7, v8, :cond_22

    .line 552
    invoke-static/range {v18 .. v18}, Ll/ᩴ۟ۜ;->֫(Ll/ᩴ۟ۜ;)[I

    move-result-object v8

    aget v8, v8, v7

    move-object/from16 v29, v9

    int-to-long v8, v8

    invoke-static {v1, v2, v8, v9}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v8

    invoke-static/range {v18 .. v18}, Ll/ᩴ۟ۜ;->ᩳ(Ll/ᩴ۟ۜ;)[I

    move-result-object v30

    move-object/from16 v31, v10

    aget v10, v30, v7

    move-wide/from16 v32, v11

    int-to-long v10, v10

    invoke-static {v8, v9, v10, v11}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v8

    .line 553
    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    .line 554
    invoke-static/range {v18 .. v18}, Ll/ᩴ۟ۜ;->ᩳ(Ll/ᩴ۟ۜ;)[I

    move-result-object v8

    aget v8, v8, v7

    int-to-long v8, v8

    invoke-static {v1, v2, v8, v9}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v1

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v9, v29

    move-object/from16 v10, v31

    move-wide/from16 v11, v32

    goto :goto_14

    :cond_22
    move-object/from16 v1, v19

    move/from16 v2, v26

    move-object/from16 v8, v27

    move-object/from16 v7, v28

    goto :goto_13

    :cond_23
    move-object/from16 v19, v1

    move/from16 v26, v2

    move-object/from16 v27, v8

    move-object/from16 v29, v9

    move-wide/from16 v32, v11

    const-wide/16 v1, 0x0

    cmp-long v7, v5, v1

    if-ltz v7, :cond_24

    .line 467
    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-static {v13, v1, v2}, Ll/ܺ۟ۜ;->֫(Ll/ܺ۟ۜ;J)V

    const/4 v10, 0x0

    goto :goto_16

    .line 558
    :cond_24
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 558
    throw v1

    .line 465
    :cond_25
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 465
    throw v1

    .line 461
    :cond_26
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 461
    throw v1

    :cond_27
    :goto_15
    move-object/from16 v19, v1

    move/from16 v26, v2

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v16, v7

    move-object/from16 v27, v8

    move-object/from16 v29, v9

    move-wide/from16 v32, v11

    :goto_16
    move-object/from16 v7, v16

    move-object/from16 v1, v19

    move-object/from16 v5, v24

    move-object/from16 v6, v25

    move/from16 v2, v26

    move-object/from16 v8, v27

    move-object/from16 v9, v29

    move-wide/from16 v11, v32

    goto/16 :goto_12

    :cond_28
    move-object/from16 v19, v1

    move/from16 v26, v2

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v29, v9

    goto :goto_17

    :cond_29
    move-object/from16 v19, v1

    move/from16 v26, v2

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v29, v9

    .line 469
    invoke-static {}, Ll/֡۟ۜ;->ܳ()I

    .line 472
    :goto_17
    invoke-static {v4}, Ll/ᩳ۟ۜ;->֫(Ll/ᩳ۟ۜ;)J

    move-result-wide v11

    const/4 v10, 0x0

    move-object/from16 v1, v19

    move-object/from16 v5, v24

    move-object/from16 v6, v25

    move/from16 v2, v26

    move-object/from16 v9, v29

    goto/16 :goto_11

    :cond_2a
    move-object/from16 v19, v1

    move/from16 v26, v2

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v29, v9

    move-wide/from16 v32, v11

    .line 474
    iget-object v1, v0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    invoke-static {v1}, Ll/᩻۟ۜ;->ۧ(Ll/᩻۟ۜ;)J

    move-result-wide v1

    cmp-long v4, v32, v1

    if-nez v4, :cond_2b

    goto :goto_18

    .line 475
    :cond_2b
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 475
    throw v1

    :cond_2c
    move-object/from16 v19, v1

    move/from16 v26, v2

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v29, v9

    .line 431
    :goto_18
    invoke-virtual/range {v29 .. v29}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v4, 0x0

    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ۟ۜ;

    .line 432
    invoke-static {v2}, Ll/ܺ۟ۜ;->ᩳ(Ll/ܺ۟ۜ;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v2, v6, v8

    if-lez v2, :cond_2d

    .line 436
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    goto :goto_19

    .line 434
    :cond_2d
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 434
    throw v1

    :cond_2e
    const/4 v1, 0x0

    move/from16 v2, v26

    :goto_1a
    if-ge v1, v2, :cond_38

    .line 331
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۡ۟ۜ;

    add-int/lit8 v7, v1, 0x1

    if-ge v7, v2, :cond_2f

    .line 332
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۡ۟ۜ;

    invoke-static {v8}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v8

    goto :goto_1b

    :cond_2f
    iget-object v8, v0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    invoke-static {v8}, Ll/᩻۟ۜ;->ۧ(Ll/᩻۟ۜ;)J

    move-result-wide v8

    .line 333
    :goto_1b
    invoke-static {v6}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v10

    sub-long v10, v8, v10

    const-wide/16 v12, 0x0

    cmp-long v14, v10, v12

    if-lez v14, :cond_3c

    const-wide/32 v12, 0x7fffffff

    cmp-long v14, v10, v12

    if-lez v14, :cond_30

    goto/16 :goto_1e

    .line 482
    :cond_30
    invoke-static {v6}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v12

    invoke-direct {v0, v12, v13}, Ll/ۢ۟ۜ;->֫(J)Ll/᩷۟ۜ;

    move-result-object v12

    .line 483
    invoke-static {v6}, Ll/ۡ۟ۜ;->ᩳ(Ll/ۡ۟ۜ;)I

    move-result v13

    if-ltz v13, :cond_37

    invoke-static {v6}, Ll/ۡ۟ۜ;->ᩳ(Ll/ۡ۟ۜ;)I

    move-result v13

    invoke-static {v12}, Ll/᩷۟ۜ;->ۧ(Ll/᩷۟ۜ;)Ljava/util/ArrayList;

    move-result-object v14

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v13, v14, :cond_37

    .line 486
    invoke-static {v12}, Ll/᩷۟ۜ;->ۧ(Ll/᩷۟ۜ;)Ljava/util/ArrayList;

    move-result-object v13

    invoke-static {v6}, Ll/ۡ۟ۜ;->ᩳ(Ll/ۡ۟ۜ;)I

    move-result v14

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۘ۟ۜ;

    .line 487
    invoke-static {v13}, Ll/ۘ۟ۜ;->᩻(Ll/ۘ۟ۜ;)I

    move-result v14

    invoke-static/range {v19 .. v19}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v15

    if-ne v14, v15, :cond_36

    .line 490
    invoke-static {v12}, Ll/᩷۟ۜ;->֫(Ll/᩷۟ۜ;)Ljava/util/HashMap;

    move-result-object v12

    invoke-static/range {v19 .. v19}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    if-eqz v12, :cond_35

    .line 491
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    const/4 v14, 0x1

    if-ne v12, v14, :cond_35

    .line 494
    invoke-static {v6}, Ll/ۡ۟ۜ;->ܿ(Ll/ۡ۟ۜ;)I

    move-result v12

    if-ltz v12, :cond_34

    invoke-static {v6}, Ll/ۡ۟ۜ;->ܿ(Ll/ۡ۟ۜ;)I

    move-result v12

    invoke-static {v13}, Ll/ۘ۟ۜ;->ۜ(Ll/ۘ۟ۜ;)Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v12, v14, :cond_34

    .line 497
    invoke-static {v13}, Ll/ۘ۟ۜ;->ۜ(Ll/ۘ۟ۜ;)Ljava/util/List;

    move-result-object v12

    invoke-static {v6}, Ll/ۡ۟ۜ;->ܿ(Ll/ۡ۟ۜ;)I

    move-result v14

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩴ۟ۜ;

    .line 498
    invoke-static {v6}, Ll/ۡ۟ۜ;->ۧ(Ll/ۡ۟ۜ;)I

    move-result v14

    if-ltz v14, :cond_33

    invoke-static {v6}, Ll/ۡ۟ۜ;->ۧ(Ll/ۡ۟ۜ;)I

    move-result v14

    invoke-static {v12}, Ll/ᩴ۟ۜ;->ܽ(Ll/ᩴ۟ۜ;)I

    move-result v15

    if-ge v14, v15, :cond_33

    .line 501
    invoke-static {v6}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v14

    invoke-static {v13, v14, v15, v8, v9}, Ll/ۢ۟ۜ;->֫(Ll/ۘ۟ۜ;JJ)V

    .line 502
    invoke-static {v12}, Ll/ᩴ۟ۜ;->᩻(Ll/ᩴ۟ۜ;)[Z

    move-result-object v8

    invoke-static {v6}, Ll/ۡ۟ۜ;->ۧ(Ll/ۡ۟ۜ;)I

    move-result v9

    aget-boolean v8, v8, v9

    if-eqz v8, :cond_32

    .line 338
    invoke-static {v6}, Ll/ۡ۟ۜ;->֫(Ll/ۡ۟ۜ;)J

    move-result-wide v8

    aput-wide v8, v25, v1

    long-to-int v8, v10

    .line 339
    aput v8, v24, v1

    .line 340
    invoke-static {v6}, Ll/ۡ۟ۜ;->ܽ(Ll/ۡ۟ۜ;)J

    move-result-wide v8

    invoke-static/range {v19 .. v19}, Ll/ۖ۟ۜ;->ܳ(Ll/ۖ۟ۜ;)J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Ll/֡۟ۜ;->ۧ(JJ)J

    move-result-wide v8

    aput-wide v8, v22, v1

    if-lez v1, :cond_31

    add-int/lit8 v1, v1, -0x1

    .line 341
    aget-wide v10, v22, v1

    cmp-long v1, v8, v10

    if-gtz v1, :cond_31

    goto :goto_1e

    :cond_31
    move v1, v7

    goto/16 :goto_1a

    .line 503
    :cond_32
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 503
    throw v1

    .line 499
    :cond_33
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 499
    throw v1

    .line 495
    :cond_34
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 495
    throw v1

    .line 492
    :cond_35
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 492
    throw v1

    .line 488
    :cond_36
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 488
    throw v1

    .line 484
    :cond_37
    new-instance v1, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 484
    throw v1

    :cond_38
    const/4 v1, 0x0

    :goto_1c
    if-ge v1, v2, :cond_3b

    add-int/lit8 v3, v1, 0x1

    if-ge v3, v2, :cond_39

    .line 346
    aget-wide v6, v22, v3

    goto :goto_1d

    :cond_39
    move-wide v6, v4

    .line 347
    :goto_1d
    aget-wide v8, v22, v1

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-gtz v10, :cond_3a

    goto :goto_1e

    .line 351
    :cond_3a
    aput-wide v6, v23, v1

    move v1, v3

    goto :goto_1c

    .line 353
    :cond_3b
    new-instance v1, Ll/᩷᩷ۧ;

    move-object/from16 v4, v22

    move-object/from16 v5, v23

    move-object/from16 v2, v24

    move-object/from16 v3, v25

    invoke-direct {v1, v2, v3, v5, v4}, Ll/᩷᩷ۧ;-><init>([I[J[J[J)V

    return-object v1

    :cond_3c
    :goto_1e
    move-object/from16 v4, v17

    goto :goto_20

    :cond_3d
    :goto_1f
    const/4 v4, 0x0

    :goto_20
    return-object v4
.end method

.method public static bridge synthetic ֫(Ll/ۢ۟ۜ;)Ll/᩷᩷ۧ;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۢ۟ۜ;->֫()Ll/᩷᩷ۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۘ۟ۜ;JJ)V
    .locals 9

    .line 508
    invoke-static {p0}, Ll/ۘ۟ۜ;->ۜ(Ll/ۘ۟ۜ;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴ۟ۜ;

    .line 509
    invoke-static {v0}, Ll/ᩴ۟ۜ;->ۧ(Ll/ᩴ۟ۜ;)J

    move-result-wide v1

    const/4 v3, 0x0

    .line 510
    :goto_0
    invoke-static {v0}, Ll/ᩴ۟ۜ;->ܽ(Ll/ᩴ۟ۜ;)I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 511
    invoke-static {v0}, Ll/ᩴ۟ۜ;->ܿ(Ll/ᩴ۟ۜ;)[I

    move-result-object v4

    aget v4, v4, v3

    int-to-long v4, v4

    .line 512
    invoke-static {v1, v2, v4, v5}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v6

    cmp-long v8, v1, p1

    if-ltz v8, :cond_1

    const-wide/16 v1, 0x0

    cmp-long v8, v4, v1

    if-ltz v8, :cond_1

    cmp-long v1, v6, p3

    if-gtz v1, :cond_1

    add-int/lit8 v3, v3, 0x1

    move-wide v1, v6

    goto :goto_0

    .line 514
    :cond_1
    new-instance p0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 514
    throw p0

    :cond_2
    return-void
.end method

.method private ֫(Ll/ۖ۟ۜ;)Z
    .locals 1

    .line 373
    iget-object v0, p0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    invoke-static {v0}, Ll/᩻۟ۜ;->֫(Ll/᩻۟ۜ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 374
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x1000

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ()Ll/ۜ۟ۜ;
    .locals 15

    .line 264
    iget-wide v0, p0, Ll/ۢ۟ۜ;->֫:J

    const-wide/32 v2, 0x1000000

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۢ۟ۜ;->ᩳ:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    :goto_0
    cmp-long v4, v2, v0

    if-gez v4, :cond_25

    .line 266
    iget-wide v4, p0, Ll/ۢ۟ۜ;->֫:J

    invoke-direct {p0, v2, v3, v4, v5}, Ll/ۢ۟ۜ;->֫(JJ)Ll/ᩳ۟ۜ;

    move-result-object v2

    .line 267
    invoke-static {v2}, Ll/ᩳ۟ۜ;->ܳ(Ll/ᩳ۟ۜ;)I

    move-result v3

    invoke-static {}, Ll/֡۟ۜ;->֡()I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_10

    .line 270
    :cond_0
    invoke-static {v2}, Ll/ᩳ۟ۜ;->ܳ(Ll/ᩳ۟ۜ;)I

    move-result v3

    invoke-static {}, Ll/֡۟ۜ;->ۘ()I

    move-result v4

    if-ne v3, v4, :cond_24

    .line 271
    invoke-static {v2}, Ll/ᩳ۟ۜ;->᩻(Ll/ᩳ۟ۜ;)J

    move-result-wide v0

    const-wide/32 v3, 0x400000

    cmp-long v5, v0, v3

    if-lez v5, :cond_1

    goto/16 :goto_10

    .line 274
    :cond_1
    invoke-static {v2}, Ll/ᩳ۟ۜ;->ܽ(Ll/ᩳ۟ۜ;)J

    move-result-wide v0

    invoke-static {v2}, Ll/ᩳ۟ۜ;->᩻(Ll/ᩳ۟ۜ;)J

    move-result-wide v2

    long-to-int v3, v2

    iget-object v2, p0, Ll/ۢ۟ۜ;->ܿ:Ll/ܿ۟ۜ;

    invoke-static {v2, v0, v1, v3}, Ll/ܿ۟ۜ;->֫(Ll/ܿ۟ۜ;JI)[B

    move-result-object v0

    .line 275
    new-instance v1, Ll/ۜ۟ۜ;

    invoke-direct {v1}, Ll/ۜ۟ۜ;-><init>()V

    .line 276
    array-length v2, v0

    const/4 v3, 0x0

    .line 753
    invoke-static {v3, v2, v0}, Ll/֡۟ۜ;->ۧ(II[B)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_23

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽ۟ۜ;

    .line 754
    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v5

    invoke-static {}, Ll/֡۟ۜ;->᩵()I

    move-result v6

    const/4 v7, 0x1

    if-ne v5, v6, :cond_5

    .line 770
    invoke-static {v4}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v3

    .line 771
    aget-byte v4, v0, v3

    and-int/lit16 v4, v4, 0xff

    if-eqz v4, :cond_3

    if-ne v4, v7, :cond_2

    goto :goto_2

    .line 773
    :cond_2
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 773
    throw v0

    :cond_3
    :goto_2
    if-ne v4, v7, :cond_4

    add-int/lit8 v3, v3, 0x14

    .line 776
    invoke-static {v3, v0}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v3

    invoke-static {v1, v3, v4}, Ll/ۜ۟ۜ;->ۧ(Ll/ۜ۟ۜ;J)V

    goto/16 :goto_f

    :cond_4
    add-int/lit8 v3, v3, 0xc

    .line 778
    invoke-static {v3, v0}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v3

    invoke-static {v1, v3, v4}, Ll/ۜ۟ۜ;->ۧ(Ll/ۜ۟ۜ;J)V

    goto/16 :goto_f

    .line 756
    :cond_5
    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v5

    invoke-static {}, Ll/֡۟ۜ;->ۤ()I

    move-result v6

    if-ne v5, v6, :cond_1b

    .line 784
    new-instance v5, Ll/ۖ۟ۜ;

    invoke-direct {v5, v3}, Ll/ۖ۟ۜ;-><init>(I)V

    .line 785
    invoke-static {v4}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v3

    invoke-static {v4}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v4

    invoke-static {v3, v4, v0}, Ll/֡۟ۜ;->ۧ(II[B)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽ۟ۜ;

    .line 786
    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v6

    invoke-static {}, Ll/֡۟ۜ;->۬()I

    move-result v8

    const/16 v9, 0x8

    const/4 v10, 0x4

    if-ne v6, v8, :cond_9

    .line 801
    invoke-static {v4}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v4

    .line 802
    aget-byte v6, v0, v4

    and-int/lit16 v6, v6, 0xff

    if-eqz v6, :cond_7

    if-ne v6, v7, :cond_6

    goto :goto_4

    .line 804
    :cond_6
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 804
    throw v0

    :cond_7
    :goto_4
    if-ne v6, v7, :cond_8

    add-int/lit8 v6, v4, 0x14

    .line 807
    invoke-static {v6, v0}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v6

    invoke-static {v5, v6}, Ll/ۖ۟ۜ;->֫(Ll/ۖ۟ۜ;I)V

    add-int/lit8 v4, v4, 0x1c

    .line 808
    invoke-static {v4, v9, v0}, Ll/֡۟ۜ;->ܽ(II[B)J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Ll/ۖ۟ۜ;->ᩳ(Ll/ۖ۟ۜ;J)V

    goto/16 :goto_b

    :cond_8
    add-int/lit8 v6, v4, 0xc

    .line 810
    invoke-static {v6, v0}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v6

    invoke-static {v5, v6}, Ll/ۖ۟ۜ;->֫(Ll/ۖ۟ۜ;I)V

    add-int/lit8 v4, v4, 0x14

    .line 811
    invoke-static {v4, v10, v0}, Ll/֡۟ۜ;->ܽ(II[B)J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Ll/ۖ۟ۜ;->ᩳ(Ll/ۖ۟ۜ;J)V

    goto/16 :goto_b

    .line 788
    :cond_9
    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v6

    invoke-static {}, Ll/֡۟ۜ;->ۜ()I

    move-result v8

    if-ne v6, v8, :cond_15

    .line 816
    invoke-static {v4}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v6

    invoke-static {v4}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v4

    invoke-static {v6, v4, v0}, Ll/֡۟ۜ;->ۧ(II[B)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽ۟ۜ;

    .line 817
    invoke-static {v6}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v8

    invoke-static {}, Ll/֡۟ۜ;->᩻()I

    move-result v11

    if-ne v8, v11, :cond_d

    .line 828
    invoke-static {v6}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v6

    .line 829
    aget-byte v8, v0, v6

    and-int/lit16 v8, v8, 0xff

    if-eqz v8, :cond_b

    if-ne v8, v7, :cond_a

    goto :goto_6

    .line 831
    :cond_a
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 831
    throw v0

    :cond_b
    :goto_6
    if-ne v8, v7, :cond_c

    add-int/lit8 v7, v6, 0x14

    .line 834
    invoke-static {v7, v0}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v7

    invoke-static {v5, v7, v8}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;J)V

    add-int/lit8 v6, v6, 0x18

    .line 835
    invoke-static {v6, v9, v0}, Ll/֡۟ۜ;->ܽ(II[B)J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Ll/ۖ۟ۜ;->֫(Ll/ۖ۟ۜ;J)V

    goto/16 :goto_a

    :cond_c
    add-int/lit8 v7, v6, 0xc

    .line 837
    invoke-static {v7, v0}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v7

    invoke-static {v5, v7, v8}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;J)V

    add-int/lit8 v6, v6, 0x10

    .line 838
    invoke-static {v6, v10, v0}, Ll/֡۟ۜ;->ܽ(II[B)J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Ll/ۖ۟ۜ;->֫(Ll/ۖ۟ۜ;J)V

    goto/16 :goto_a

    .line 819
    :cond_d
    invoke-static {v6}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v8

    invoke-static {}, Ll/֡۟ۜ;->ܿ()I

    move-result v10

    if-ne v8, v10, :cond_f

    .line 843
    invoke-static {v6}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v6

    add-int/2addr v6, v9

    invoke-static {v6, v0}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v6

    .line 844
    invoke-static {}, Ll/֡۟ۜ;->ܰ()I

    move-result v8

    if-ne v6, v8, :cond_e

    .line 845
    invoke-static {v5, v7}, Ll/ۖ۟ۜ;->ۧ(Ll/ۖ۟ۜ;I)V

    goto/16 :goto_a

    .line 846
    :cond_e
    invoke-static {}, Ll/֡۟ۜ;->֨()I

    move-result v7

    if-ne v6, v7, :cond_14

    const/4 v6, 0x2

    .line 847
    invoke-static {v5, v6}, Ll/ۖ۟ۜ;->ۧ(Ll/ۖ۟ۜ;I)V

    goto/16 :goto_a

    .line 821
    :cond_f
    invoke-static {v6}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v7

    invoke-static {}, Ll/֡۟ۜ;->ܺ()I

    move-result v8

    if-ne v7, v8, :cond_14

    .line 852
    invoke-static {v6}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v7

    invoke-static {v6}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v6

    invoke-static {v7, v6, v0}, Ll/֡۟ۜ;->ۧ(II[B)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܽ۟ۜ;

    .line 853
    invoke-static {v7}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v8

    invoke-static {}, Ll/֡۟ۜ;->۠()I

    move-result v10

    if-ne v8, v10, :cond_13

    .line 860
    invoke-static {v7}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v8

    invoke-static {v7}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v7

    invoke-static {v8, v7, v0}, Ll/֡۟ۜ;->ۧ(II[B)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܽ۟ۜ;

    .line 861
    invoke-static {v8}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v10

    invoke-static {}, Ll/֡۟ۜ;->ܶ()I

    move-result v11

    if-ne v10, v11, :cond_12

    .line 868
    invoke-static {v8}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v10

    add-int/lit8 v11, v10, 0x4

    .line 869
    invoke-static {v11, v0}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v11

    add-int/2addr v10, v9

    const/4 v9, 0x0

    :goto_9
    if-ge v9, v11, :cond_12

    .line 871
    invoke-static {v8}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v12

    if-ge v10, v12, :cond_12

    .line 872
    invoke-static {v8}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v12

    invoke-static {v10, v12, v0}, Ll/֡۟ۜ;->֫(II[B)Ll/ܽ۟ۜ;

    move-result-object v10

    .line 873
    invoke-static {v10}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v12

    invoke-static {}, Ll/֡۟ۜ;->ᩳ()I

    move-result v13

    if-eq v12, v13, :cond_10

    invoke-static {v10}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v12

    invoke-static {}, Ll/֡۟ۜ;->ܽ()I

    move-result v13

    if-eq v12, v13, :cond_10

    invoke-static {v10}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v12

    invoke-static {v10}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v13

    invoke-static {}, Ll/֡۟ۜ;->ۚ()I

    move-result v14

    .line 874
    invoke-static {v12, v0, v13, v14}, Ll/֡۟ۜ;->֫(I[BII)Z

    move-result v12

    if-nez v12, :cond_10

    invoke-static {v10}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v12

    invoke-static {v10}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v13

    invoke-static {}, Ll/֡۟ۜ;->᩹()I

    move-result v14

    .line 875
    invoke-static {v12, v0, v13, v14}, Ll/֡۟ۜ;->֫(I[BII)Z

    move-result v12

    if-eqz v12, :cond_11

    .line 876
    :cond_10
    invoke-static {v5}, Ll/ۖ۟ۜ;->᩷(Ll/ۖ۟ۜ;)V

    .line 878
    :cond_11
    invoke-static {v10}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v10

    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    :cond_12
    const/16 v9, 0x8

    goto :goto_8

    :cond_13
    const/16 v9, 0x8

    goto/16 :goto_7

    :cond_14
    :goto_a
    const/4 v7, 0x1

    const/16 v9, 0x8

    const/4 v10, 0x4

    goto/16 :goto_5

    .line 790
    :cond_15
    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v6

    invoke-static {}, Ll/֡۟ۜ;->֫()I

    move-result v7

    if-eq v6, v7, :cond_16

    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v4

    invoke-static {}, Ll/֡۟ۜ;->ۧ()I

    move-result v6

    if-ne v4, v6, :cond_17

    .line 791
    :cond_16
    invoke-static {v5}, Ll/ۖ۟ۜ;->ۢ(Ll/ۖ۟ۜ;)V

    :cond_17
    :goto_b
    const/4 v7, 0x1

    goto/16 :goto_3

    :cond_18
    const/4 v3, 0x0

    .line 794
    invoke-static {v5}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result v4

    if-eqz v4, :cond_19

    invoke-static {v5}, Ll/ۖ۟ۜ;->ۜ(Ll/ۖ۟ۜ;)I

    move-result v4

    if-nez v4, :cond_1a

    :cond_19
    move-object v5, v3

    :cond_1a
    if-eqz v5, :cond_22

    .line 759
    invoke-static {v1, v5}, Ll/ۜ۟ۜ;->֫(Ll/ۜ۟ۜ;Ll/ۖ۟ۜ;)V

    goto/16 :goto_f

    .line 761
    :cond_1b
    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v3

    invoke-static {}, Ll/֡۟ۜ;->ᩴ()I

    move-result v5

    if-ne v3, v5, :cond_21

    .line 883
    invoke-static {v4}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v3

    invoke-static {v4}, Ll/ܽ۟ۜ;->֫(Ll/ܽ۟ۜ;)I

    move-result v4

    invoke-static {v3, v4, v0}, Ll/֡۟ۜ;->ۧ(II[B)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1c
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_22

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽ۟ۜ;

    .line 884
    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v5

    invoke-static {}, Ll/֡۟ۜ;->᩷()I

    move-result v6

    if-ne v5, v6, :cond_20

    .line 885
    invoke-static {v4}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v4

    .line 886
    aget-byte v5, v0, v4

    and-int/lit16 v5, v5, 0xff

    const/4 v6, 0x1

    if-eqz v5, :cond_1e

    if-ne v5, v6, :cond_1d

    goto :goto_d

    .line 888
    :cond_1d
    new-instance v0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 888
    throw v0

    :cond_1e
    :goto_d
    add-int/lit8 v4, v4, 0x4

    if-ne v5, v6, :cond_1f

    .line 890
    invoke-static {v4, v0}, Ll/֡۟ۜ;->ۧ(I[B)J

    move-result-wide v4

    goto :goto_e

    :cond_1f
    invoke-static {v4, v0}, Ll/֡۟ۜ;->ᩳ(I[B)J

    move-result-wide v4

    :goto_e
    invoke-static {v1, v4, v5}, Ll/ۜ۟ۜ;->֫(Ll/ۜ۟ۜ;J)V

    goto :goto_c

    .line 891
    :cond_20
    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v5

    invoke-static {}, Ll/֡۟ۜ;->ۛ()I

    move-result v6

    if-ne v5, v6, :cond_1c

    .line 892
    invoke-static {v4}, Ll/ܽ۟ۜ;->ۧ(Ll/ܽ۟ۜ;)I

    move-result v4

    add-int/lit8 v5, v4, 0x4

    .line 893
    invoke-static {v5, v0}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v5

    add-int/lit8 v6, v4, 0x8

    .line 894
    invoke-static {v6, v0}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    add-int/lit8 v7, v4, 0xc

    .line 895
    invoke-static {v7, v0}, Ll/֡۟ۜ;->ܽ(I[B)I

    move-result v7

    add-int/lit8 v8, v4, 0x10

    .line 896
    invoke-static {v8, v0}, Ll/֡۟ۜ;->ܽ(I[B)I

    move-result v8

    add-int/lit8 v4, v4, 0x14

    .line 897
    invoke-static {v4, v0}, Ll/֡۟ۜ;->֫(I[B)I

    move-result v4

    .line 898
    invoke-static {v1}, Ll/ۜ۟ۜ;->֫(Ll/ۜ۟ۜ;)Ljava/util/HashMap;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v10, Ll/ܳ۟ۜ;

    invoke-direct {v10, v6, v7, v8, v4}, Ll/ܳ۟ۜ;-><init>(IIII)V

    invoke-virtual {v9, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    .line 763
    :cond_21
    invoke-static {v4}, Ll/ܽ۟ۜ;->ܽ(Ll/ܽ۟ۜ;)I

    move-result v3

    invoke-static {}, Ll/֡۟ۜ;->֡()I

    move-result v4

    if-ne v3, v4, :cond_22

    .line 764
    invoke-static {v1}, Ll/ۜ۟ۜ;->ܽ(Ll/ۜ۟ۜ;)V

    :cond_22
    :goto_f
    const/4 v3, 0x0

    goto/16 :goto_1

    .line 277
    :cond_23
    invoke-static {v1}, Ll/ۜ۟ۜ;->ᩳ(Ll/ۜ۟ۜ;)V

    return-object v1

    .line 280
    :cond_24
    invoke-static {v2}, Ll/ᩳ۟ۜ;->֫(Ll/ᩳ۟ۜ;)J

    move-result-wide v2

    goto/16 :goto_0

    :cond_25
    :goto_10
    const/4 v0, 0x0

    return-object v0
.end method

.method private ۧ(Ll/ۖ۟ۜ;)Ll/ۡ۟ۜ;
    .locals 1

    .line 443
    iget-object v0, p0, Ll/ۢ۟ۜ;->ۧ:Ll/᩻۟ۜ;

    invoke-static {v0}, Ll/᩻۟ۜ;->֫(Ll/᩻۟ۜ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Ll/ۖ۟ۜ;->ܽ(Ll/ۖ۟ۜ;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    .line 444
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p1}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    .line 444
    check-cast p1, Ll/ۡ۟ۜ;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static ۧ(Ll/ۢ۟ۜ;)Ll/ۧ۟ۜ;
    .locals 5

    .line 158
    invoke-direct {p0}, Ll/ۢ۟ۜ;->֫()Ll/᩷᩷ۧ;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 159
    iget v0, p0, Ll/᩷᩷ۧ;->ܽ:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 162
    :cond_0
    iget-object v0, p0, Ll/᩷᩷ۧ;->ᩳ:[J

    const/4 v1, 0x0

    aget-wide v1, v0, v1

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-lez v0, :cond_2

    const-wide/32 v3, 0x1000000

    cmp-long v0, v1, v3

    if-lez v0, :cond_1

    goto :goto_0

    .line 167
    :cond_1
    new-instance v0, Ll/ۧ۟ۜ;

    invoke-direct {v0, p0, v1, v2}, Ll/ۧ۟ۜ;-><init>(Ll/᩷᩷ۧ;J)V

    return-object v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
