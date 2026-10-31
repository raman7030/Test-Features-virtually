.class public final Ll/ۢ۠ܽ;
.super Ljava/lang/Object;
.source "06VH"


# instance fields
.field public final ֡:Ll/۫᩵ܽ;

.field public final ֫:Ll/᩻۠ܽ;

.field public final ۖ:I

.field public final ۘ:Ll/᩷۠ܽ;

.field public final ۚ:Z

.field public final ۜ:Z

.field public final ۡ:Z

.field public final ۢ:I

.field public final ۧ:Ll/۬᩵ܽ;

.field public final ܳ:Ll/ܽ֡ܽ;

.field public final ܺ:[Ljava/lang/Object;

.field public final ܽ:Z

.field public final ܿ:[I

.field public final ᩳ:Ll/ۤ᩵ܽ;

.field public final ᩴ:I

.field public final ᩵:Ll/ۖ۠ܽ;

.field public final ᩷:Z

.field public final ᩻:I


# direct methods
.method public constructor <init>([I[Ljava/lang/Object;IIIZZLl/۫᩵ܽ;ZLl/ۖ۠ܽ;Ll/᩻۠ܽ;Ll/ۛۚܽ;Ll/ۛۚܽ;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p9

    .line 84
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object v1, v0, Ll/ۢ۠ܽ;->ܿ:[I

    .line 86
    iput-object v2, v0, Ll/ۢ۠ܽ;->ܺ:[Ljava/lang/Object;

    .line 87
    iput v3, v0, Ll/ۢ۠ܽ;->᩻:I

    move/from16 v7, p4

    .line 88
    iput v7, v0, Ll/ۢ۠ܽ;->ᩴ:I

    move/from16 v8, p5

    .line 89
    iput v8, v0, Ll/ۢ۠ܽ;->ۖ:I

    .line 90
    iput-boolean v4, v0, Ll/ۢ۠ܽ;->ۜ:Z

    .line 91
    iput-boolean v5, v0, Ll/ۢ۠ܽ;->᩷:Z

    move-object/from16 v8, p8

    .line 92
    iput-object v8, v0, Ll/ۢ۠ܽ;->֡:Ll/۫᩵ܽ;

    .line 93
    iput-boolean v6, v0, Ll/ۢ۠ܽ;->ܽ:Z

    move-object/from16 v8, p10

    .line 94
    iput-object v8, v0, Ll/ۢ۠ܽ;->᩵:Ll/ۖ۠ܽ;

    move-object/from16 v8, p11

    .line 95
    iput-object v8, v0, Ll/ۢ۠ܽ;->֫:Ll/᩻۠ܽ;

    if-eqz v6, :cond_0

    const/4 v8, 0x0

    goto :goto_0

    .line 96
    :cond_0
    invoke-static/range {p1 .. p3}, Ll/ܽ֡ܽ;->ۧ([I[Ljava/lang/Object;I)Ll/ܽ֡ܽ;

    move-result-object v8

    :goto_0
    iput-object v8, v0, Ll/ۢ۠ܽ;->ܳ:Ll/ܽ֡ܽ;

    .line 97
    aget v8, v1, v3

    const/16 v9, 0x11

    if-ne v8, v9, :cond_1

    add-int/lit8 v8, v3, 0x2

    .line 98
    aget v8, v1, v8

    aget-object v8, v2, v8

    check-cast v8, Ll/۬᩵ܽ;

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    iput-object v8, v0, Ll/ۢ۠ܽ;->ۧ:Ll/۬᩵ܽ;

    const/4 v8, 0x0

    move v9, v3

    .line 221
    :goto_2
    array-length v10, v1

    div-int/lit8 v10, v10, 0x8

    const/16 v11, 0x10

    const/16 v12, 0x14

    const/4 v13, 0x4

    const/4 v15, 0x3

    const/4 v14, 0x1

    if-ge v8, v10, :cond_9

    .line 222
    aget v10, v1, v9

    if-ne v10, v12, :cond_2

    goto :goto_4

    :cond_2
    if-eq v10, v14, :cond_8

    if-eq v10, v15, :cond_8

    if-ne v10, v11, :cond_3

    add-int/lit8 v11, v9, 0x2

    .line 224
    aget v11, v1, v11

    if-eqz v11, :cond_3

    goto :goto_5

    :cond_3
    if-ne v10, v13, :cond_9

    add-int/lit8 v8, v9, 0x1

    .line 229
    aget v8, v1, v8

    aget v10, v1, v8

    if-eq v10, v12, :cond_4

    goto :goto_6

    :cond_4
    add-int/lit8 v8, v8, 0x2

    .line 230
    aget v8, v1, v8

    aget-object v8, v2, v8

    check-cast v8, Ll/ۘ۠ܽ;

    .line 231
    iget v10, v8, Ll/ۘ۠ܽ;->ۧ:I

    if-nez v10, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v9, v9, 0x2

    .line 232
    aget v9, v1, v9

    aget-object v9, v2, v9

    check-cast v9, Ll/ۧۚܽ;

    .line 233
    invoke-static {v9}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v10

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_7

    .line 235
    invoke-interface {v9, v11}, Ll/ۧۚܽ;->֫(I)Z

    move-result v12

    if-eqz v12, :cond_6

    iget-object v12, v8, Ll/ۘ۠ܽ;->᩻:Ll/ۧۚܽ;

    invoke-interface {v12, v11}, Ll/ۧۚܽ;->֫(I)Z

    move-result v12

    if-nez v12, :cond_9

    iget v12, v8, Ll/ۘ۠ܽ;->ܽ:I

    if-eq v11, v12, :cond_9

    iget-boolean v12, v8, Ll/ۘ۠ܽ;->ܳ:Z

    if-nez v12, :cond_6

    int-to-char v12, v11

    .line 236
    invoke-static {v12}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v12

    if-eqz v12, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    const/4 v8, 0x1

    goto :goto_7

    :cond_8
    :goto_5
    add-int/lit8 v9, v9, 0x1

    .line 226
    aget v9, v1, v9

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_9
    :goto_6
    const/4 v8, 0x0

    .line 99
    :goto_7
    iput-boolean v8, v0, Ll/ۢ۠ܽ;->ۚ:Z

    .line 100
    aget v9, v1, v3

    const/16 v10, 0x15

    if-ne v9, v10, :cond_a

    add-int/lit8 v9, v3, 0x2

    .line 101
    aget v9, v1, v9

    aget-object v9, v2, v9

    check-cast v9, Ll/ۤ᩵ܽ;

    goto :goto_8

    :cond_a
    const/4 v9, 0x0

    :goto_8
    iput-object v9, v0, Ll/ۢ۠ܽ;->ᩳ:Ll/ۤ᩵ܽ;

    const/16 v10, 0xb

    if-nez v6, :cond_23

    .line 103
    iget-object v11, v0, Ll/ۢ۠ܽ;->ۧ:Ll/۬᩵ܽ;

    if-nez v11, :cond_23

    iget-object v11, v0, Ll/ۢ۠ܽ;->ܳ:Ll/ܽ֡ܽ;

    if-nez v11, :cond_23

    if-nez v8, :cond_23

    if-nez v9, :cond_23

    .line 117
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v16, v3

    .line 120
    :goto_9
    array-length v3, v1

    div-int/lit8 v3, v3, 0x8

    if-ge v9, v3, :cond_23

    .line 121
    aget v3, v1, v16

    if-eqz v3, :cond_22

    if-eq v3, v14, :cond_e

    if-eq v3, v15, :cond_e

    const/16 v14, 0x1c

    const/4 v15, 0x7

    if-eq v3, v13, :cond_f

    if-eq v3, v15, :cond_d

    const/16 v13, 0x8

    if-eq v3, v13, :cond_c

    if-eq v3, v10, :cond_e

    const/16 v10, 0x10

    if-eq v3, v10, :cond_b

    if-eq v3, v14, :cond_e

    const/16 v10, 0x1d

    if-eq v3, v10, :cond_e

    goto/16 :goto_17

    :cond_b
    add-int/lit8 v3, v16, 0x2

    .line 127
    aget v3, v1, v3

    if-nez v3, :cond_e

    goto :goto_a

    .line 134
    :cond_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_23

    const/4 v3, 0x1

    .line 0
    invoke-static {v8, v3}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v3

    .line 134
    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/lit8 v10, v16, 0x2

    aget v10, v1, v10

    if-eq v3, v10, :cond_e

    goto/16 :goto_17

    :cond_d
    add-int/lit8 v3, v16, 0x2

    .line 130
    aget v3, v1, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_a
    const/4 v3, 0x1

    const/4 v12, 0x1

    :cond_e
    const/4 v15, 0x0

    goto/16 :goto_16

    :cond_f
    add-int/lit8 v3, v16, 0x2

    .line 150
    aget v3, v1, v3

    aget-object v3, v2, v3

    check-cast v3, Ll/ۧۚܽ;

    add-int/lit8 v10, v16, 0x1

    .line 151
    aget v10, v1, v10

    const/4 v11, 0x0

    .line 152
    :goto_b
    array-length v13, v1

    const/16 v14, 0x8

    div-int/2addr v13, v14

    if-ge v11, v13, :cond_1f

    .line 153
    aget v13, v1, v10

    if-eq v13, v15, :cond_1e

    if-eq v13, v14, :cond_1e

    const/16 v14, 0xb

    if-ne v13, v14, :cond_10

    goto/16 :goto_12

    :cond_10
    if-nez v13, :cond_11

    const/4 v15, 0x0

    goto/16 :goto_11

    :cond_11
    const/4 v14, 0x1

    if-eq v13, v14, :cond_1a

    const/4 v14, 0x4

    if-ne v13, v14, :cond_12

    add-int/lit8 v14, v10, 0x3

    .line 159
    aget v14, v1, v14

    if-lez v14, :cond_12

    goto :goto_e

    :cond_12
    const/4 v14, 0x3

    if-eq v13, v14, :cond_13

    const/16 v14, 0x1c

    if-eq v13, v14, :cond_13

    const/16 v14, 0x1d

    if-ne v13, v14, :cond_1f

    :cond_13
    add-int/lit8 v14, v10, 0x2

    .line 172
    aget v14, v1, v14

    aget-object v14, v2, v14

    check-cast v14, [I

    .line 173
    array-length v15, v14

    if-nez v15, :cond_14

    add-int/lit8 v10, v10, 0x1

    .line 174
    aget v10, v1, v10

    const/4 v15, 0x0

    goto/16 :goto_13

    :cond_14
    const/4 v15, 0x0

    .line 177
    aget v10, v14, v15

    const/4 v11, 0x3

    if-ne v13, v11, :cond_15

    .line 178
    invoke-interface {v3, v10}, Ll/ۧۚܽ;->֫(I)Z

    move-result v3

    goto :goto_f

    :cond_15
    const/16 v11, 0x1c

    if-ne v13, v11, :cond_17

    add-int/lit8 v11, v10, -0x61

    rsub-int/lit8 v13, v10, 0x7a

    or-int/2addr v11, v13

    if-ltz v11, :cond_16

    add-int/lit8 v11, v10, -0x20

    goto :goto_c

    :cond_16
    move v11, v10

    .line 182
    :goto_c
    invoke-interface {v3, v10}, Ll/ۧۚܽ;->֫(I)Z

    move-result v13

    if-nez v13, :cond_20

    if-eq v11, v10, :cond_1d

    invoke-interface {v3, v11}, Ll/ۧۚܽ;->֫(I)Z

    move-result v3

    if-nez v3, :cond_20

    goto :goto_11

    .line 184
    :cond_17
    invoke-static {v3}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v11

    const/4 v13, 0x0

    :goto_d
    if-ge v13, v11, :cond_1d

    if-eq v13, v10, :cond_18

    .line 186
    invoke-static {v13}, Ll/ۗᩳۘ;->ۧ(I)I

    move-result v14

    if-ne v10, v14, :cond_19

    :cond_18
    invoke-interface {v3, v13}, Ll/ۧۚܽ;->֫(I)Z

    move-result v14

    if-eqz v14, :cond_19

    goto :goto_14

    :cond_19
    add-int/lit8 v13, v13, 0x1

    goto :goto_d

    :cond_1a
    :goto_e
    const/4 v15, 0x0

    add-int/lit8 v10, v10, 0x2

    .line 160
    aget v10, v1, v10

    aget-object v10, v2, v10

    check-cast v10, Ll/ۧۚܽ;

    .line 162
    sget-object v11, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2478
    invoke-static {v10}, Ll/ܿ֨ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v11

    if-ltz v11, :cond_1b

    .line 163
    invoke-interface {v3, v11}, Ll/ۧۚܽ;->֫(I)Z

    move-result v3

    :goto_f
    xor-int/lit8 v3, v3, 0x1

    goto :goto_15

    .line 165
    :cond_1b
    invoke-static {v3}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v11

    invoke-static {v10}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v13

    invoke-static {v11, v13}, Ljava/lang/Math;->min(II)I

    move-result v11

    const/4 v13, 0x0

    :goto_10
    if-ge v13, v11, :cond_1d

    .line 167
    invoke-interface {v3, v13}, Ll/ۧۚܽ;->֫(I)Z

    move-result v14

    if-eqz v14, :cond_1c

    invoke-interface {v10, v13}, Ll/ۧۚܽ;->֫(I)Z

    move-result v14

    if-eqz v14, :cond_1c

    goto :goto_14

    :cond_1c
    add-int/lit8 v13, v13, 0x1

    goto :goto_10

    :cond_1d
    :goto_11
    const/4 v3, 0x1

    goto :goto_15

    :cond_1e
    :goto_12
    const/4 v15, 0x0

    add-int/lit8 v10, v10, 0x1

    .line 155
    aget v10, v1, v10

    :goto_13
    add-int/lit8 v11, v11, 0x1

    const/4 v13, 0x7

    const/4 v15, 0x7

    goto/16 :goto_b

    :cond_1f
    const/4 v15, 0x0

    :cond_20
    :goto_14
    const/4 v3, 0x0

    :goto_15
    if-nez v3, :cond_21

    goto :goto_17

    :cond_21
    const/4 v3, 0x1

    const/4 v11, 0x1

    :goto_16
    add-int/lit8 v16, v16, 0x1

    .line 143
    aget v16, v1, v16

    add-int/lit8 v9, v9, 0x1

    const/4 v13, 0x4

    const/4 v3, 0x3

    const/4 v14, 0x1

    const/16 v10, 0xb

    const/4 v15, 0x3

    goto/16 :goto_9

    :cond_22
    if-eqz v11, :cond_23

    .line 123
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_23

    goto :goto_18

    :cond_23
    :goto_17
    const/4 v12, -0x1

    .line 105
    :goto_18
    iget-object v3, v0, Ll/ۢ۠ܽ;->ۧ:Ll/۬᩵ܽ;

    if-eqz v3, :cond_24

    const/4 v3, 0x1

    goto :goto_19

    :cond_24
    iget-object v3, v0, Ll/ۢ۠ܽ;->ܳ:Ll/ܽ֡ܽ;

    if-eqz v3, :cond_25

    const/4 v3, 0x2

    goto :goto_19

    .line 106
    :cond_25
    iget-boolean v3, v0, Ll/ۢ۠ܽ;->ۚ:Z

    if-eqz v3, :cond_26

    const/4 v3, 0x3

    goto :goto_19

    .line 107
    :cond_26
    iget-object v3, v0, Ll/ۢ۠ܽ;->ᩳ:Ll/ۤ᩵ܽ;

    if-eqz v3, :cond_27

    const/4 v3, 0x4

    goto :goto_19

    :cond_27
    if-ltz v12, :cond_28

    const/4 v3, 0x5

    goto :goto_19

    :cond_28
    const/4 v3, 0x0

    .line 108
    :goto_19
    iput v3, v0, Ll/ۢ۠ܽ;->ۢ:I

    if-ltz v12, :cond_29

    if-eqz v12, :cond_2d

    goto :goto_1d

    :cond_29
    if-nez v6, :cond_2e

    .line 110
    iget-boolean v3, v0, Ll/ۢ۠ܽ;->ۚ:Z

    if-nez v3, :cond_2d

    const/4 v3, 0x0

    move/from16 v8, p3

    .line 199
    :goto_1a
    array-length v9, v1

    div-int/lit8 v9, v9, 0x8

    if-ge v3, v9, :cond_2c

    .line 200
    aget v9, v1, v8

    const/4 v10, 0x1

    if-eqz v9, :cond_2b

    if-eq v9, v10, :cond_2a

    const/4 v10, 0x2

    if-eq v9, v10, :cond_2a

    const/4 v10, 0x3

    const/16 v11, 0xb

    if-eq v9, v10, :cond_2a

    if-eq v9, v11, :cond_2a

    const/16 v10, 0x14

    if-eq v9, v10, :cond_2b

    const/16 v10, 0x22

    if-eq v9, v10, :cond_2a

    const/16 v10, 0x27

    if-eq v9, v10, :cond_2a

    const/16 v10, 0x2a

    if-eq v9, v10, :cond_2a

    const/16 v10, 0x24

    if-eq v9, v10, :cond_2a

    const/16 v10, 0x25

    if-eq v9, v10, :cond_2a

    packed-switch v9, :pswitch_data_0

    packed-switch v9, :pswitch_data_1

    goto :goto_1b

    :pswitch_0
    add-int/lit8 v9, v8, 0x2

    .line 204
    aget v9, v1, v9

    if-nez v9, :cond_2a

    goto :goto_1b

    :cond_2a
    :pswitch_1
    add-int/lit8 v8, v8, 0x1

    .line 213
    aget v8, v1, v8

    add-int/lit8 v3, v3, 0x1

    goto :goto_1a

    :cond_2b
    :pswitch_2
    const/4 v3, 0x1

    goto :goto_1c

    :cond_2c
    :goto_1b
    const/4 v3, 0x0

    :goto_1c
    if-nez v3, :cond_2d

    goto :goto_1d

    :cond_2d
    const/4 v3, 0x0

    goto :goto_1e

    :cond_2e
    :goto_1d
    const/4 v3, 0x1

    .line 110
    :goto_1e
    iput-boolean v3, v0, Ll/ۢ۠ܽ;->ۡ:Z

    if-nez v6, :cond_30

    if-nez v4, :cond_30

    if-eqz v5, :cond_2f

    goto :goto_1f

    :cond_2f
    const/4 v3, 0x0

    goto :goto_20

    :cond_30
    :goto_1f
    const/4 v3, 0x1

    :goto_20
    move-object/from16 p5, p1

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, p12

    move-object/from16 p10, p13

    move/from16 p11, v3

    .line 111
    invoke-static/range {p5 .. p11}, Ll/᩷۠ܽ;->֫([I[Ljava/lang/Object;IILl/ۛۚܽ;Ll/ۛۚܽ;Z)Ll/᩷۠ܽ;

    move-result-object v1

    iput-object v1, v0, Ll/ۢ۠ܽ;->ۘ:Ll/᩷۠ܽ;

    return-void

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1c
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
