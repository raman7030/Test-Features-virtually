.class public final Ll/ᩴ᩷֨;
.super Ll/ۖ᩷֨;
.source "M1RV"


# instance fields
.field public ۛ:I

.field public final ۤ:Ll/֡᩷֨;

.field public ۨ:I

.field public ۫:Ll/֫᩷֨;

.field public final ܰ:[I

.field public final ᩺:[Ll/᩵᩷֨;


# direct methods
.method public constructor <init>(Ll/ܶ᩷֨;IIIIIIILl/ۘ᩻֨;)V
    .locals 9

    move-object v7, p0

    const/16 v8, 0x1000

    move v0, p5

    .line 42
    invoke-static {p5, v8}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/16 v2, 0x1000

    move v0, p4

    move v3, p6

    move/from16 v4, p7

    move/from16 v5, p8

    move-object/from16 v6, p9

    .line 41
    invoke-static/range {v0 .. v6}, Ll/ܰۜ֨;->֫(IIIIIILl/ۘ᩻֨;)Ll/ܰۜ֨;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Ll/ۖ᩷֨;-><init>(Ll/ܶ᩷֨;Ll/ܰۜ֨;IIII)V

    new-array v0, v8, [Ll/᩵᩷֨;

    .line 19
    iput-object v0, v7, Ll/ᩴ᩷֨;->᩺:[Ll/᩵᩷֨;

    const/4 v0, 0x0

    .line 20
    iput v0, v7, Ll/ᩴ᩷֨;->ۛ:I

    .line 21
    iput v0, v7, Ll/ᩴ᩷֨;->ۨ:I

    const/4 v1, 0x4

    new-array v1, v1, [I

    .line 27
    iput-object v1, v7, Ll/ᩴ᩷֨;->ܰ:[I

    .line 28
    new-instance v1, Ll/֡᩷֨;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v7, Ll/ᩴ᩷֨;->ۤ:Ll/֡᩷֨;

    :goto_0
    if-ge v0, v8, :cond_0

    .line 50
    iget-object v1, v7, Ll/ᩴ᩷֨;->᩺:[Ll/᩵᩷֨;

    new-instance v2, Ll/᩵᩷֨;

    invoke-direct {v2}, Ll/᩵᩷֨;-><init>()V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 55
    iput v0, p0, Ll/ᩴ᩷֨;->ۛ:I

    .line 56
    iput v0, p0, Ll/ᩴ᩷֨;->ۨ:I

    .line 57
    invoke-super {p0}, Ll/ۖ᩷֨;->֫()V

    return-void
.end method

.method public final ܿ()I
    .locals 33

    move-object/from16 v0, p0

    .line 101
    iget v1, v0, Ll/ᩴ᩷֨;->ۛ:I

    iget v2, v0, Ll/ᩴ᩷֨;->ۨ:I

    iget-object v3, v0, Ll/ᩴ᩷֨;->᩺:[Ll/᩵᩷֨;

    if-ge v1, v2, :cond_0

    .line 102
    aget-object v2, v3, v1

    iget v2, v2, Ll/᩵᩷֨;->ᩳ:I

    sub-int v1, v2, v1

    .line 103
    iput v2, v0, Ll/ᩴ᩷֨;->ۛ:I

    .line 104
    aget-object v2, v3, v2

    iget v2, v2, Ll/᩵᩷֨;->֫:I

    iput v2, v0, Ll/ۖ᩷֨;->ᩴ:I

    return v1

    :cond_0
    const/4 v1, 0x0

    .line 109
    iput v1, v0, Ll/ᩴ᩷֨;->ۛ:I

    .line 110
    iput v1, v0, Ll/ᩴ᩷֨;->ۨ:I

    const/4 v2, -0x1

    .line 111
    iput v2, v0, Ll/ۖ᩷֨;->ᩴ:I

    .line 113
    iget v4, v0, Ll/ۖ᩷֨;->ۙ:I

    if-ne v4, v2, :cond_1

    .line 114
    invoke-virtual/range {p0 .. p0}, Ll/ۖ᩷֨;->ᩳ()Ll/֫᩷֨;

    move-result-object v4

    iput-object v4, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    .line 120
    :cond_1
    iget-object v4, v0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    invoke-virtual {v4}, Ll/ܰۜ֨;->֫()I

    move-result v5

    const/16 v6, 0x111

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-ge v5, v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 126
    :goto_0
    iget-object v10, v0, Ll/ܿ᩷֨;->ۡ:[I

    iget-object v11, v0, Ll/ᩴ᩷֨;->ܰ:[I

    const/4 v12, 0x4

    if-ge v8, v12, :cond_5

    .line 127
    aget v10, v10, v8

    invoke-virtual {v4, v10, v5}, Ll/ܰۜ֨;->ۧ(II)I

    move-result v10

    aput v10, v11, v8

    if-ge v10, v6, :cond_3

    .line 130
    aput v1, v11, v8

    goto :goto_1

    .line 134
    :cond_3
    aget v11, v11, v9

    if-le v10, v11, :cond_4

    move v9, v8

    :cond_4
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 139
    :cond_5
    aget v5, v11, v9

    iget v8, v0, Ll/ۖ᩷֨;->᩹:I

    if-lt v5, v8, :cond_6

    .line 140
    iput v9, v0, Ll/ۖ᩷֨;->ᩴ:I

    sub-int/2addr v5, v7

    .line 141
    invoke-virtual {v0, v5}, Ll/ۖ᩷֨;->֫(I)V

    .line 142
    aget v1, v11, v9

    return v1

    .line 149
    :cond_6
    iget-object v5, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget v13, v5, Ll/֫᩷֨;->֫:I

    if-lez v13, :cond_7

    .line 150
    iget-object v14, v5, Ll/֫᩷֨;->ܽ:[I

    sub-int/2addr v13, v7

    aget v14, v14, v13

    .line 151
    iget-object v5, v5, Ll/֫᩷֨;->ۧ:[I

    aget v5, v5, v13

    if-lt v14, v8, :cond_8

    add-int/2addr v5, v12

    .line 155
    iput v5, v0, Ll/ۖ᩷֨;->ᩴ:I

    add-int/lit8 v1, v14, -0x1

    .line 156
    invoke-virtual {v0, v1}, Ll/ۖ᩷֨;->֫(I)V

    return v14

    :cond_7
    const/4 v14, 0x0

    .line 161
    :cond_8
    invoke-virtual {v4, v1}, Ll/ܰۜ֨;->֫(I)I

    move-result v5

    .line 162
    aget v12, v10, v1

    add-int/2addr v12, v7

    invoke-virtual {v4, v12}, Ll/ܰۜ֨;->֫(I)I

    move-result v12

    if-ge v14, v6, :cond_9

    if-eq v5, v12, :cond_9

    .line 167
    aget v13, v11, v9

    if-ge v13, v6, :cond_9

    :goto_2
    return v7

    .line 172
    :cond_9
    invoke-virtual {v4}, Ll/ܰۜ֨;->ܽ()I

    move-result v6

    .line 173
    iget v13, v0, Ll/ܿ᩷֨;->ۢ:I

    and-int v15, v6, v13

    .line 177
    invoke-virtual {v4, v7}, Ll/ܰۜ֨;->֫(I)I

    move-result v18

    .line 178
    iget-object v7, v0, Ll/ۖ᩷֨;->۠:Ll/ܺ᩷֨;

    iget-object v1, v0, Ll/ܿ᩷֨;->ܺ:Ll/֡᩷֨;

    move/from16 v22, v15

    move-object v15, v7

    move/from16 v16, v5

    move/from16 v17, v12

    move/from16 v19, v6

    move-object/from16 v20, v1

    invoke-virtual/range {v15 .. v20}, Ll/ܺ᩷֨;->֫(IIIILl/֡᩷֨;)I

    move-result v7

    const/4 v15, 0x1

    .line 180
    aget-object v15, v3, v15

    move/from16 v16, v6

    const/4 v6, 0x0

    invoke-virtual {v15, v7, v6, v2}, Ll/᩵᩷֨;->֫(III)V

    .line 369
    invoke-virtual {v1}, Ll/֡᩷֨;->֫()I

    move-result v2

    iget-object v6, v0, Ll/ܿ᩷֨;->ᩳ:[[S

    aget-object v2, v6, v2

    move/from16 v7, v22

    aget-short v2, v2, v7

    const/4 v15, 0x1

    invoke-static {v2, v15}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v2

    .line 379
    invoke-virtual {v1}, Ll/֡᩷֨;->֫()I

    move-result v17

    move-object/from16 v18, v6

    iget-object v6, v0, Ll/ܿ᩷֨;->ܿ:[S

    move/from16 v19, v13

    aget-short v13, v6, v17

    invoke-static {v13, v15}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v13

    add-int/2addr v13, v2

    .line 188
    iget-object v15, v0, Ll/ܿ᩷֨;->᩻:[[S

    move/from16 v17, v8

    iget-object v8, v0, Ll/ܿ᩷֨;->ܳ:[S

    if-ne v12, v5, :cond_a

    .line 384
    invoke-virtual {v1}, Ll/֡᩷֨;->֫()I

    move-result v5

    aget-short v5, v8, v5

    const/4 v12, 0x0

    invoke-static {v5, v12}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v5

    add-int/2addr v5, v13

    .line 385
    invoke-virtual {v1}, Ll/֡᩷֨;->֫()I

    move-result v20

    aget-object v20, v15, v20

    move-object/from16 v21, v15

    aget-short v15, v20, v7

    invoke-static {v15, v12}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v15

    add-int/2addr v15, v5

    const/4 v5, 0x1

    .line 191
    aget-object v12, v3, v5

    iget v5, v12, Ll/᩵᩷֨;->᩻:I

    if-ge v15, v5, :cond_b

    const/4 v5, 0x0

    .line 192
    invoke-virtual {v12, v15, v5, v5}, Ll/᩵᩷֨;->֫(III)V

    goto :goto_3

    :cond_a
    move-object/from16 v21, v15

    :cond_b
    :goto_3
    const/4 v5, 0x1

    .line 197
    aget v9, v11, v9

    invoke-static {v14, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    iput v9, v0, Ll/ᩴ᩷֨;->ۨ:I

    const/4 v12, 0x2

    if-ge v9, v12, :cond_c

    .line 200
    aget-object v1, v3, v5

    iget v1, v1, Ll/᩵᩷֨;->֫:I

    iput v1, v0, Ll/ۖ᩷֨;->ᩴ:I

    return v5

    .line 208
    :cond_c
    invoke-virtual/range {p0 .. p0}, Ll/ۖ᩷֨;->ۜ()V

    const/4 v5, 0x0

    .line 213
    aget-object v9, v3, v5

    iget-object v9, v9, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    invoke-virtual {v9, v1}, Ll/֡᩷֨;->֫(Ll/֡᩷֨;)V

    .line 214
    aget-object v9, v3, v5

    iget-object v9, v9, Ll/᩵᩷֨;->ۜ:[I

    const/4 v12, 0x4

    invoke-static {v10, v5, v9, v5, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 217
    iget v5, v0, Ll/ᩴ᩷֨;->ۨ:I

    :goto_4
    const/high16 v9, 0x40000000    # 2.0f

    const/4 v10, 0x2

    if-lt v5, v10, :cond_d

    .line 218
    aget-object v10, v3, v5

    .line 31
    iput v9, v10, Ll/᩵᩷֨;->᩻:I

    add-int/lit8 v5, v5, -0x1

    goto :goto_4

    :cond_d
    const/4 v5, 0x0

    .line 221
    :goto_5
    iget-object v9, v0, Ll/ۖ᩷֨;->ۗ:Ll/ۢ᩷֨;

    const/4 v12, 0x4

    if-ge v5, v12, :cond_11

    .line 222
    aget v12, v11, v5

    if-ge v12, v10, :cond_e

    move/from16 v22, v13

    goto :goto_7

    .line 226
    :cond_e
    invoke-virtual {v0, v13, v5, v1, v7}, Ll/ۖ᩷֨;->֫(IILl/֡᩷֨;I)I

    move-result v10

    .line 229
    :goto_6
    invoke-virtual {v9, v12, v7}, Ll/ۢ᩷֨;->ۧ(II)I

    move-result v15

    add-int/2addr v15, v10

    move/from16 v20, v10

    .line 231
    aget-object v10, v3, v12

    move/from16 v22, v13

    iget v13, v10, Ll/᩵᩷֨;->᩻:I

    if-ge v15, v13, :cond_f

    const/4 v13, 0x0

    .line 232
    invoke-virtual {v10, v15, v13, v5}, Ll/᩵᩷֨;->֫(III)V

    :cond_f
    add-int/lit8 v12, v12, -0x1

    const/4 v10, 0x2

    if-ge v12, v10, :cond_10

    :goto_7
    add-int/lit8 v5, v5, 0x1

    const/4 v10, 0x2

    move/from16 v13, v22

    goto :goto_5

    :cond_10
    move/from16 v10, v20

    move/from16 v13, v22

    goto :goto_6

    :cond_11
    const/4 v5, 0x2

    const/4 v10, 0x0

    .line 238
    aget v11, v11, v10

    add-int/lit8 v11, v11, 0x1

    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-gt v5, v14, :cond_15

    .line 374
    invoke-virtual {v1}, Ll/֡᩷֨;->֫()I

    move-result v1

    aget-short v1, v6, v1

    invoke-static {v1, v10}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v1

    add-int/2addr v1, v2

    const/4 v2, 0x0

    .line 246
    :goto_8
    iget-object v10, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget-object v10, v10, Ll/֫᩷֨;->ܽ:[I

    aget v10, v10, v2

    if-le v5, v10, :cond_12

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 250
    :cond_12
    :goto_9
    iget-object v10, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget-object v10, v10, Ll/֫᩷֨;->ۧ:[I

    aget v10, v10, v2

    .line 251
    invoke-virtual {v0, v1, v10, v5, v7}, Ll/ۖ᩷֨;->֫(IIII)I

    move-result v11

    .line 253
    aget-object v12, v3, v5

    iget v13, v12, Ll/᩵᩷֨;->᩻:I

    if-ge v11, v13, :cond_13

    add-int/lit8 v10, v10, 0x4

    const/4 v13, 0x0

    .line 254
    invoke-virtual {v12, v11, v13, v10}, Ll/᩵᩷֨;->֫(III)V

    .line 256
    :cond_13
    iget-object v10, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget-object v11, v10, Ll/֫᩷֨;->ܽ:[I

    aget v11, v11, v2

    if-ne v5, v11, :cond_14

    add-int/lit8 v2, v2, 0x1

    .line 257
    iget v10, v10, Ll/֫᩷֨;->֫:I

    if-ne v2, v10, :cond_14

    goto :goto_a

    :cond_14
    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    .line 266
    :cond_15
    :goto_a
    invoke-virtual {v4}, Ll/ܰۜ֨;->֫()I

    move-result v1

    const/16 v2, 0xfff

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 271
    :goto_b
    iget v2, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Ll/ᩴ᩷֨;->ۛ:I

    iget v5, v0, Ll/ᩴ᩷֨;->ۨ:I

    if-ge v2, v5, :cond_40

    .line 272
    invoke-virtual/range {p0 .. p0}, Ll/ۖ᩷֨;->ᩳ()Ll/֫᩷֨;

    move-result-object v2

    iput-object v2, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    .line 273
    iget v5, v2, Ll/֫᩷֨;->֫:I

    if-lez v5, :cond_16

    iget-object v2, v2, Ll/֫᩷֨;->ܽ:[I

    add-int/lit8 v5, v5, -0x1

    aget v2, v2, v5

    move/from16 v5, v17

    if-lt v2, v5, :cond_17

    goto/16 :goto_25

    :cond_16
    move/from16 v5, v17

    :cond_17
    add-int/lit8 v2, v1, -0x1

    add-int/lit8 v7, v16, 0x1

    and-int v15, v7, v19

    .line 304
    iget v10, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v10, v3, v10

    iget v11, v10, Ll/᩵᩷֨;->ᩳ:I

    iget-object v12, v10, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    .line 307
    iget-boolean v13, v10, Ll/᩵᩷֨;->ܳ:Z

    if-eqz v13, :cond_1a

    add-int/lit8 v11, v11, -0x1

    .line 310
    iget-boolean v13, v10, Ll/᩵᩷֨;->ܽ:Z

    if-eqz v13, :cond_19

    .line 311
    iget v10, v10, Ll/᩵᩷֨;->ܿ:I

    aget-object v10, v3, v10

    iget-object v10, v10, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    invoke-virtual {v12, v10}, Ll/֡᩷֨;->֫(Ll/֡᩷֨;)V

    .line 312
    iget v10, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v10, v3, v10

    iget v12, v10, Ll/᩵᩷֨;->ۧ:I

    iget-object v10, v10, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    const/4 v13, 0x4

    if-ge v12, v13, :cond_18

    .line 313
    invoke-virtual {v10}, Ll/֡᩷֨;->ܿ()V

    goto :goto_c

    .line 315
    :cond_18
    invoke-virtual {v10}, Ll/֡᩷֨;->ܳ()V

    goto :goto_c

    .line 317
    :cond_19
    aget-object v10, v3, v11

    iget-object v10, v10, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    invoke-virtual {v12, v10}, Ll/֡᩷֨;->֫(Ll/֡᩷֨;)V

    .line 320
    :goto_c
    iget v10, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v10, v3, v10

    iget-object v10, v10, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    invoke-virtual {v10}, Ll/֡᩷֨;->ᩳ()V

    goto :goto_d

    .line 322
    :cond_1a
    aget-object v10, v3, v11

    iget-object v10, v10, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    invoke-virtual {v12, v10}, Ll/֡᩷֨;->֫(Ll/֡᩷֨;)V

    .line 325
    :goto_d
    iget v10, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int/lit8 v12, v10, -0x1

    if-ne v11, v12, :cond_1c

    .line 329
    aget-object v10, v3, v10

    iget v12, v10, Ll/᩵᩷֨;->֫:I

    iget-object v10, v10, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    if-nez v12, :cond_1b

    .line 330
    invoke-virtual {v10}, Ll/֡᩷֨;->᩻()V

    goto :goto_e

    .line 332
    :cond_1b
    invoke-virtual {v10}, Ll/֡᩷֨;->ᩳ()V

    .line 334
    :goto_e
    aget-object v10, v3, v11

    iget-object v10, v10, Ll/᩵᩷֨;->ۜ:[I

    iget v11, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v11, v3, v11

    iget-object v11, v11, Ll/᩵᩷֨;->ۜ:[I

    const/4 v12, 0x0

    const/4 v13, 0x4

    invoke-static {v10, v12, v11, v12, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_12

    .line 338
    :cond_1c
    aget-object v10, v3, v10

    iget-boolean v12, v10, Ll/᩵᩷֨;->ܳ:Z

    iget-object v13, v10, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    if-eqz v12, :cond_1d

    iget-boolean v12, v10, Ll/᩵᩷֨;->ܽ:Z

    if-eqz v12, :cond_1d

    .line 339
    iget v11, v10, Ll/᩵᩷֨;->ܿ:I

    .line 340
    iget v10, v10, Ll/᩵᩷֨;->ۧ:I

    .line 341
    invoke-virtual {v13}, Ll/֡᩷֨;->ܿ()V

    const/4 v12, 0x4

    goto :goto_f

    .line 343
    :cond_1d
    iget v10, v10, Ll/᩵᩷֨;->֫:I

    const/4 v12, 0x4

    if-ge v10, v12, :cond_1e

    .line 345
    invoke-virtual {v13}, Ll/֡᩷֨;->ܿ()V

    goto :goto_f

    .line 347
    :cond_1e
    invoke-virtual {v13}, Ll/֡᩷֨;->ܳ()V

    :goto_f
    if-ge v10, v12, :cond_21

    .line 351
    iget v12, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v12, v3, v12

    iget-object v12, v12, Ll/᩵᩷֨;->ۜ:[I

    aget-object v13, v3, v11

    iget-object v13, v13, Ll/᩵᩷֨;->ۜ:[I

    aget v13, v13, v10

    const/4 v14, 0x0

    aput v13, v12, v14

    const/4 v12, 0x1

    :goto_10
    if-gt v12, v10, :cond_1f

    .line 355
    iget v13, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v13, v3, v13

    iget-object v13, v13, Ll/᩵᩷֨;->ۜ:[I

    aget-object v14, v3, v11

    iget-object v14, v14, Ll/᩵᩷֨;->ۜ:[I

    add-int/lit8 v17, v12, -0x1

    aget v14, v14, v17

    aput v14, v13, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_10

    :cond_1f
    :goto_11
    const/4 v10, 0x4

    if-ge v12, v10, :cond_20

    .line 358
    iget v10, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v10, v3, v10

    iget-object v10, v10, Ll/᩵᩷֨;->ۜ:[I

    aget-object v13, v3, v11

    iget-object v13, v13, Ll/᩵᩷֨;->ۜ:[I

    aget v13, v13, v12

    aput v13, v10, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_11

    :cond_20
    :goto_12
    const/4 v10, 0x1

    goto :goto_13

    .line 360
    :cond_21
    iget v12, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v12, v3, v12

    iget-object v12, v12, Ll/᩵᩷֨;->ۜ:[I

    add-int/lit8 v10, v10, -0x4

    const/4 v13, 0x0

    aput v10, v12, v13

    .line 361
    aget-object v10, v3, v11

    iget-object v10, v10, Ll/᩵᩷֨;->ۜ:[I

    const/4 v11, 0x3

    const/4 v14, 0x1

    invoke-static {v10, v13, v12, v14, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_12

    .line 282
    :goto_13
    iget v11, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v11, v3, v11

    iget v12, v11, Ll/᩵᩷֨;->᩻:I

    iget-object v11, v11, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    .line 369
    invoke-virtual {v11}, Ll/֡᩷֨;->֫()I

    move-result v11

    aget-object v11, v18, v11

    aget-short v11, v11, v15

    invoke-static {v11, v10}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v11

    add-int v17, v11, v12

    .line 284
    iget v11, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v11, v3, v11

    iget-object v11, v11, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    .line 379
    invoke-virtual {v11}, Ll/֡᩷֨;->֫()I

    move-result v11

    aget-short v11, v6, v11

    invoke-static {v11, v10}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v11

    add-int v14, v11, v17

    const/4 v11, 0x0

    .line 375
    invoke-virtual {v4, v11}, Ll/ܰۜ֨;->֫(I)I

    move-result v13

    .line 376
    iget v12, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v12, v3, v12

    iget-object v12, v12, Ll/᩵᩷֨;->ۜ:[I

    aget v11, v12, v11

    add-int/2addr v11, v10

    invoke-virtual {v4, v11}, Ll/ܰۜ֨;->֫(I)I

    move-result v12

    .line 379
    iget v11, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v11, v3, v11

    iget v11, v11, Ll/᩵᩷֨;->᩻:I

    .line 380
    invoke-virtual {v4, v10}, Ll/ܰۜ֨;->֫(I)I

    move-result v20

    iget v10, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v10, v3, v10

    iget-object v10, v10, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    move-object/from16 v22, v10

    iget-object v10, v0, Ll/ۖ᩷֨;->۠:Ll/ܺ᩷֨;

    move/from16 v23, v11

    move v11, v13

    move/from16 v24, v12

    move-object/from16 v25, v6

    move v6, v13

    move/from16 v13, v20

    move-object/from16 v20, v9

    move v9, v14

    move v14, v7

    move/from16 v26, v7

    move v7, v15

    move-object/from16 v15, v22

    invoke-virtual/range {v10 .. v15}, Ll/ܺ᩷֨;->֫(IIIILl/֡᩷֨;)I

    move-result v10

    add-int v11, v23, v10

    .line 382
    iget v10, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int/lit8 v12, v10, 0x1

    aget-object v12, v3, v12

    iget v13, v12, Ll/᩵᩷֨;->᩻:I

    if-ge v11, v13, :cond_22

    const/4 v13, -0x1

    .line 383
    invoke-virtual {v12, v11, v10, v13}, Ll/᩵᩷֨;->֫(III)V

    const/4 v10, 0x1

    goto :goto_14

    :cond_22
    const/4 v10, 0x0

    :goto_14
    move/from16 v12, v24

    if-ne v12, v6, :cond_24

    .line 388
    iget v13, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int/lit8 v14, v13, 0x1

    aget-object v14, v3, v14

    iget v15, v14, Ll/᩵᩷֨;->ᩳ:I

    if-eq v15, v13, :cond_23

    iget v14, v14, Ll/᩵᩷֨;->֫:I

    if-eqz v14, :cond_24

    .line 390
    :cond_23
    aget-object v13, v3, v13

    iget-object v13, v13, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    .line 384
    invoke-virtual {v13}, Ll/֡᩷֨;->֫()I

    move-result v14

    aget-short v14, v8, v14

    const/4 v15, 0x0

    invoke-static {v14, v15}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v14

    add-int/2addr v14, v9

    .line 385
    invoke-virtual {v13}, Ll/֡᩷֨;->֫()I

    move-result v13

    aget-object v13, v21, v13

    aget-short v13, v13, v7

    invoke-static {v13, v15}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v13

    add-int/2addr v13, v14

    .line 393
    iget v14, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int/lit8 v15, v14, 0x1

    aget-object v15, v3, v15

    move-object/from16 v22, v8

    iget v8, v15, Ll/᩵᩷֨;->᩻:I

    if-gt v13, v8, :cond_25

    const/4 v8, 0x0

    .line 394
    invoke-virtual {v15, v13, v14, v8}, Ll/᩵᩷֨;->֫(III)V

    const/4 v10, 0x1

    goto :goto_15

    :cond_24
    move-object/from16 v22, v8

    .line 401
    :cond_25
    :goto_15
    iget-object v8, v0, Ll/ᩴ᩷֨;->ۤ:Ll/֡᩷֨;

    if-nez v10, :cond_27

    if-eq v12, v6, :cond_27

    const/4 v6, 0x2

    if-le v2, v6, :cond_27

    add-int/lit8 v1, v1, -0x2

    .line 402
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 403
    iget v10, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v10, v3, v10

    iget-object v10, v10, Ll/᩵᩷֨;->ۜ:[I

    const/4 v12, 0x0

    aget v10, v10, v12

    const/4 v12, 0x1

    invoke-virtual {v4, v12, v10, v1}, Ll/ܰۜ֨;->֫(III)I

    move-result v1

    if-lt v1, v6, :cond_27

    .line 406
    iget v6, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v6, v3, v6

    iget-object v6, v6, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    invoke-virtual {v8, v6}, Ll/֡᩷֨;->֫(Ll/֡᩷֨;)V

    .line 407
    invoke-virtual {v8}, Ll/֡᩷֨;->ᩳ()V

    add-int/lit8 v16, v16, 0x2

    and-int v6, v16, v19

    .line 410
    invoke-virtual {v0, v1, v8, v6}, Ll/ۖ᩷֨;->֫(ILl/֡᩷֨;I)I

    move-result v6

    add-int/2addr v11, v6

    .line 413
    iget v6, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int/lit8 v6, v6, 0x1

    add-int/2addr v6, v1

    .line 414
    :goto_16
    iget v1, v0, Ll/ᩴ᩷֨;->ۨ:I

    if-ge v1, v6, :cond_26

    add-int/lit8 v1, v1, 0x1

    .line 415
    iput v1, v0, Ll/ᩴ᩷֨;->ۨ:I

    aget-object v1, v3, v1

    const/high16 v10, 0x40000000    # 2.0f

    .line 31
    iput v10, v1, Ll/᩵᩷֨;->᩻:I

    goto :goto_16

    .line 417
    :cond_26
    aget-object v1, v3, v6

    iget v6, v1, Ll/᩵᩷֨;->᩻:I

    if-ge v11, v6, :cond_27

    .line 418
    iget v6, v0, Ll/ᩴ᩷֨;->ۛ:I

    .line 48
    iput v11, v1, Ll/᩵᩷֨;->᩻:I

    const/4 v10, 0x1

    add-int/2addr v6, v10

    .line 49
    iput v6, v1, Ll/᩵᩷֨;->ᩳ:I

    const/4 v6, 0x0

    .line 50
    iput v6, v1, Ll/᩵᩷֨;->֫:I

    .line 51
    iput-boolean v10, v1, Ll/᩵᩷֨;->ܳ:Z

    .line 52
    iput-boolean v6, v1, Ll/᩵᩷֨;->ܽ:Z

    :cond_27
    const/4 v1, 0x2

    if-lt v2, v1, :cond_3e

    .line 429
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/4 v10, 0x2

    const/4 v11, 0x0

    :goto_17
    const/4 v12, 0x4

    if-ge v11, v12, :cond_31

    .line 432
    iget v12, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v12, v3, v12

    iget-object v12, v12, Ll/᩵᩷֨;->ۜ:[I

    aget v12, v12, v11

    invoke-virtual {v4, v12, v6}, Ll/ܰۜ֨;->ۧ(II)I

    move-result v12

    if-ge v12, v1, :cond_28

    move/from16 v16, v6

    move/from16 v23, v9

    move-object/from16 v14, v20

    goto/16 :goto_1c

    .line 436
    :cond_28
    :goto_18
    iget v1, v0, Ll/ᩴ᩷֨;->ۨ:I

    iget v13, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int v14, v13, v12

    if-ge v1, v14, :cond_29

    add-int/lit8 v1, v1, 0x1

    .line 437
    iput v1, v0, Ll/ᩴ᩷֨;->ۨ:I

    aget-object v1, v3, v1

    const/high16 v13, 0x40000000    # 2.0f

    .line 31
    iput v13, v1, Ll/᩵᩷֨;->᩻:I

    goto :goto_18

    .line 439
    :cond_29
    aget-object v1, v3, v13

    iget-object v1, v1, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    invoke-virtual {v0, v9, v11, v1, v7}, Ll/ۖ᩷֨;->֫(IILl/֡᩷֨;I)I

    move-result v1

    move v13, v12

    :goto_19
    const/4 v14, 0x2

    if-lt v13, v14, :cond_2b

    move-object/from16 v14, v20

    .line 444
    invoke-virtual {v14, v13, v7}, Ll/ۢ᩷֨;->ۧ(II)I

    move-result v15

    add-int/2addr v15, v1

    move/from16 v16, v6

    .line 445
    iget v6, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int v20, v6, v13

    move/from16 v23, v9

    aget-object v9, v3, v20

    move/from16 v20, v10

    iget v10, v9, Ll/᩵᩷֨;->᩻:I

    if-ge v15, v10, :cond_2a

    .line 446
    invoke-virtual {v9, v15, v6, v11}, Ll/᩵᩷֨;->֫(III)V

    :cond_2a
    add-int/lit8 v13, v13, -0x1

    move/from16 v6, v16

    move/from16 v10, v20

    move/from16 v9, v23

    move-object/from16 v20, v14

    goto :goto_19

    :cond_2b
    move/from16 v16, v6

    move/from16 v23, v9

    move-object/from16 v14, v20

    move/from16 v20, v10

    if-nez v11, :cond_2c

    add-int/lit8 v10, v12, 0x1

    goto :goto_1a

    :cond_2c
    move/from16 v10, v20

    :goto_1a
    sub-int v6, v2, v12

    add-int/lit8 v6, v6, -0x1

    const/4 v9, 0x2

    if-ge v6, v9, :cond_2d

    goto/16 :goto_1c

    :cond_2d
    if-le v6, v5, :cond_2e

    move v6, v5

    :cond_2e
    add-int/lit8 v9, v12, 0x1

    .line 459
    iget v13, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v13, v3, v13

    iget-object v13, v13, Ll/᩵᩷֨;->ۜ:[I

    aget v13, v13, v11

    invoke-virtual {v4, v9, v13, v6}, Ll/ܰۜ֨;->֫(III)I

    move-result v6

    const/4 v9, 0x2

    if-lt v6, v9, :cond_30

    .line 465
    invoke-virtual {v14, v12, v7}, Ll/ۢ᩷֨;->ۧ(II)I

    move-result v9

    add-int/2addr v1, v9

    .line 466
    iget v9, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v9, v3, v9

    iget-object v9, v9, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    invoke-virtual {v8, v9}, Ll/֡᩷֨;->֫(Ll/֡᩷֨;)V

    .line 467
    invoke-virtual {v8}, Ll/֡᩷֨;->ܿ()V

    const/4 v9, 0x0

    .line 470
    invoke-virtual {v4, v12, v9}, Ll/ܰۜ֨;->֫(II)I

    move-result v28

    .line 471
    invoke-virtual {v4, v9}, Ll/ܰۜ֨;->֫(I)I

    move-result v29

    const/4 v9, 0x1

    .line 472
    invoke-virtual {v4, v12, v9}, Ll/ܰۜ֨;->֫(II)I

    move-result v30

    add-int v9, v26, v12

    .line 473
    iget-object v13, v0, Ll/ᩴ᩷֨;->ۤ:Ll/֡᩷֨;

    iget-object v15, v0, Ll/ۖ᩷֨;->۠:Ll/ܺ᩷֨;

    move-object/from16 v27, v15

    move/from16 v31, v9

    move-object/from16 v32, v13

    invoke-virtual/range {v27 .. v32}, Ll/ܺ᩷֨;->֫(IIIILl/֡᩷֨;)I

    move-result v13

    add-int/2addr v1, v13

    .line 475
    invoke-virtual {v8}, Ll/֡᩷֨;->ᩳ()V

    add-int/lit8 v9, v9, 0x1

    and-int v9, v9, v19

    .line 479
    invoke-virtual {v0, v6, v8, v9}, Ll/ۖ᩷֨;->֫(ILl/֡᩷֨;I)I

    move-result v9

    add-int/2addr v1, v9

    .line 482
    iget v9, v0, Ll/ᩴ᩷֨;->ۛ:I

    const/4 v13, 0x1

    invoke-static {v9, v12, v13, v6}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result v6

    .line 483
    :goto_1b
    iget v9, v0, Ll/ᩴ᩷֨;->ۨ:I

    if-ge v9, v6, :cond_2f

    add-int/lit8 v9, v9, 0x1

    .line 484
    iput v9, v0, Ll/ᩴ᩷֨;->ۨ:I

    aget-object v9, v3, v9

    const/high16 v13, 0x40000000    # 2.0f

    .line 31
    iput v13, v9, Ll/᩵᩷֨;->᩻:I

    goto :goto_1b

    .line 486
    :cond_2f
    aget-object v6, v3, v6

    iget v9, v6, Ll/᩵᩷֨;->᩻:I

    if-ge v1, v9, :cond_30

    .line 487
    iget v9, v0, Ll/ᩴ᩷֨;->ۛ:I

    .line 60
    iput v1, v6, Ll/᩵᩷֨;->᩻:I

    add-int/2addr v12, v9

    const/4 v1, 0x1

    add-int/2addr v12, v1

    .line 61
    iput v12, v6, Ll/᩵᩷֨;->ᩳ:I

    const/4 v12, 0x0

    .line 62
    iput v12, v6, Ll/᩵᩷֨;->֫:I

    .line 63
    iput-boolean v1, v6, Ll/᩵᩷֨;->ܳ:Z

    .line 64
    iput-boolean v1, v6, Ll/᩵᩷֨;->ܽ:Z

    .line 65
    iput v9, v6, Ll/᩵᩷֨;->ܿ:I

    .line 66
    iput v11, v6, Ll/᩵᩷֨;->ۧ:I

    :cond_30
    :goto_1c
    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x2

    move-object/from16 v20, v14

    move/from16 v6, v16

    move/from16 v9, v23

    goto/16 :goto_17

    :cond_31
    move-object/from16 v14, v20

    move/from16 v20, v10

    .line 291
    iget-object v1, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget v6, v1, Ll/֫᩷֨;->֫:I

    if-lez v6, :cond_3f

    .line 501
    iget-object v9, v1, Ll/֫᩷֨;->ܽ:[I

    add-int/lit8 v6, v6, -0x1

    aget v6, v9, v6

    if-le v6, v2, :cond_33

    const/4 v6, 0x0

    .line 502
    iput v6, v1, Ll/֫᩷֨;->֫:I

    .line 503
    :goto_1d
    iget-object v1, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget-object v6, v1, Ll/֫᩷֨;->ܽ:[I

    iget v9, v1, Ll/֫᩷֨;->֫:I

    aget v10, v6, v9

    if-ge v10, v2, :cond_32

    add-int/lit8 v9, v9, 0x1

    .line 504
    iput v9, v1, Ll/֫᩷֨;->֫:I

    goto :goto_1d

    :cond_32
    add-int/lit8 v10, v9, 0x1

    .line 506
    iput v10, v1, Ll/֫᩷֨;->֫:I

    aput v2, v6, v9

    .line 509
    :cond_33
    iget-object v1, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget-object v6, v1, Ll/֫᩷֨;->ܽ:[I

    iget v1, v1, Ll/֫᩷֨;->֫:I

    add-int/lit8 v1, v1, -0x1

    aget v1, v6, v1

    move/from16 v10, v20

    if-ge v1, v10, :cond_34

    goto/16 :goto_24

    .line 512
    :cond_34
    :goto_1e
    iget v1, v0, Ll/ᩴ᩷֨;->ۨ:I

    iget v6, v0, Ll/ᩴ᩷֨;->ۛ:I

    iget-object v9, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget-object v11, v9, Ll/֫᩷֨;->ܽ:[I

    iget v9, v9, Ll/֫᩷֨;->֫:I

    add-int/lit8 v9, v9, -0x1

    aget v9, v11, v9

    add-int/2addr v9, v6

    if-ge v1, v9, :cond_35

    add-int/lit8 v1, v1, 0x1

    .line 513
    iput v1, v0, Ll/ᩴ᩷֨;->ۨ:I

    aget-object v1, v3, v1

    const/high16 v6, 0x40000000    # 2.0f

    .line 31
    iput v6, v1, Ll/᩵᩷֨;->᩻:I

    goto :goto_1e

    .line 515
    :cond_35
    aget-object v1, v3, v6

    iget-object v1, v1, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    .line 374
    invoke-virtual {v1}, Ll/֡᩷֨;->֫()I

    move-result v1

    aget-short v1, v25, v1

    const/4 v6, 0x0

    invoke-static {v1, v6}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v1

    add-int v1, v1, v17

    .line 519
    :goto_1f
    iget-object v9, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget-object v9, v9, Ll/֫᩷֨;->ܽ:[I

    aget v9, v9, v6

    if-le v10, v9, :cond_36

    add-int/lit8 v6, v6, 0x1

    goto :goto_1f

    .line 523
    :cond_36
    :goto_20
    iget-object v9, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget-object v9, v9, Ll/֫᩷֨;->ۧ:[I

    aget v9, v9, v6

    .line 527
    invoke-virtual {v0, v1, v9, v10, v7}, Ll/ۖ᩷֨;->֫(IIII)I

    move-result v11

    .line 529
    iget v12, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int v13, v12, v10

    aget-object v13, v3, v13

    iget v15, v13, Ll/᩵᩷֨;->᩻:I

    if-ge v11, v15, :cond_37

    add-int/lit8 v15, v9, 0x4

    .line 530
    invoke-virtual {v13, v11, v12, v15}, Ll/᩵᩷֨;->֫(III)V

    .line 533
    :cond_37
    iget-object v12, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget-object v12, v12, Ll/֫᩷֨;->ܽ:[I

    aget v12, v12, v6

    if-eq v10, v12, :cond_38

    move/from16 v17, v1

    goto/16 :goto_23

    :cond_38
    sub-int v12, v2, v10

    add-int/lit8 v12, v12, -0x1

    const/4 v13, 0x2

    if-lt v12, v13, :cond_3b

    if-le v12, v5, :cond_39

    move v12, v5

    :cond_39
    add-int/lit8 v15, v10, 0x1

    .line 542
    invoke-virtual {v4, v15, v9, v12}, Ll/ܰۜ֨;->֫(III)I

    move-result v12

    if-lt v12, v13, :cond_3b

    .line 544
    iget v13, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v13, v3, v13

    iget-object v13, v13, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    invoke-virtual {v8, v13}, Ll/֡᩷֨;->֫(Ll/֡᩷֨;)V

    .line 545
    invoke-virtual {v8}, Ll/֡᩷֨;->ܳ()V

    const/4 v13, 0x0

    .line 548
    invoke-virtual {v4, v10, v13}, Ll/ܰۜ֨;->֫(II)I

    move-result v28

    .line 549
    invoke-virtual {v4, v13}, Ll/ܰۜ֨;->֫(I)I

    move-result v29

    const/4 v13, 0x1

    .line 550
    invoke-virtual {v4, v10, v13}, Ll/ܰۜ֨;->֫(II)I

    move-result v30

    add-int v15, v26, v10

    .line 551
    iget-object v13, v0, Ll/ᩴ᩷֨;->ۤ:Ll/֡᩷֨;

    move/from16 v17, v1

    .line 552
    iget-object v1, v0, Ll/ۖ᩷֨;->۠:Ll/ܺ᩷֨;

    move-object/from16 v27, v1

    move/from16 v31, v15

    move-object/from16 v32, v13

    invoke-virtual/range {v27 .. v32}, Ll/ܺ᩷֨;->֫(IIIILl/֡᩷֨;)I

    move-result v1

    add-int/2addr v11, v1

    .line 555
    invoke-virtual {v8}, Ll/֡᩷֨;->ᩳ()V

    add-int/lit8 v15, v15, 0x1

    and-int v1, v15, v19

    .line 559
    invoke-virtual {v0, v12, v8, v1}, Ll/ۖ᩷֨;->֫(ILl/֡᩷֨;I)I

    move-result v1

    add-int/2addr v11, v1

    .line 562
    iget v1, v0, Ll/ᩴ᩷֨;->ۛ:I

    const/4 v13, 0x1

    invoke-static {v1, v10, v13, v12}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result v1

    .line 563
    :goto_21
    iget v12, v0, Ll/ᩴ᩷֨;->ۨ:I

    if-ge v12, v1, :cond_3a

    add-int/lit8 v12, v12, 0x1

    .line 564
    iput v12, v0, Ll/ᩴ᩷֨;->ۨ:I

    aget-object v12, v3, v12

    const/high16 v13, 0x40000000    # 2.0f

    .line 31
    iput v13, v12, Ll/᩵᩷֨;->᩻:I

    goto :goto_21

    .line 566
    :cond_3a
    aget-object v1, v3, v1

    iget v12, v1, Ll/᩵᩷֨;->᩻:I

    if-ge v11, v12, :cond_3c

    .line 567
    iget v12, v0, Ll/ᩴ᩷֨;->ۛ:I

    add-int/lit8 v9, v9, 0x4

    .line 60
    iput v11, v1, Ll/᩵᩷֨;->᩻:I

    add-int v11, v12, v10

    const/4 v13, 0x1

    add-int/2addr v11, v13

    .line 61
    iput v11, v1, Ll/᩵᩷֨;->ᩳ:I

    const/4 v11, 0x0

    .line 62
    iput v11, v1, Ll/᩵᩷֨;->֫:I

    .line 63
    iput-boolean v13, v1, Ll/᩵᩷֨;->ܳ:Z

    .line 64
    iput-boolean v13, v1, Ll/᩵᩷֨;->ܽ:Z

    .line 65
    iput v12, v1, Ll/᩵᩷֨;->ܿ:I

    .line 66
    iput v9, v1, Ll/᩵᩷֨;->ۧ:I

    goto :goto_22

    :cond_3b
    move/from16 v17, v1

    :cond_3c
    :goto_22
    add-int/lit8 v6, v6, 0x1

    .line 571
    iget-object v1, v0, Ll/ᩴ᩷֨;->۫:Ll/֫᩷֨;

    iget v1, v1, Ll/֫᩷֨;->֫:I

    if-ne v6, v1, :cond_3d

    goto :goto_24

    :cond_3d
    :goto_23
    add-int/lit8 v10, v10, 0x1

    move/from16 v1, v17

    goto/16 :goto_20

    :cond_3e
    move-object/from16 v14, v20

    :cond_3f
    :goto_24
    move v1, v2

    move/from16 v17, v5

    move-object v9, v14

    move-object/from16 v8, v22

    move-object/from16 v6, v25

    move/from16 v16, v26

    goto/16 :goto_b

    .line 66
    :cond_40
    :goto_25
    iget v1, v0, Ll/ᩴ᩷֨;->ۛ:I

    iput v1, v0, Ll/ᩴ᩷֨;->ۨ:I

    .line 68
    aget-object v1, v3, v1

    iget v1, v1, Ll/᩵᩷֨;->ᩳ:I

    .line 71
    :goto_26
    iget v2, v0, Ll/ᩴ᩷֨;->ۛ:I

    aget-object v4, v3, v2

    .line 73
    iget-boolean v5, v4, Ll/᩵᩷֨;->ܳ:Z

    if-eqz v5, :cond_42

    .line 74
    aget-object v5, v3, v1

    iput v2, v5, Ll/᩵᩷֨;->ᩳ:I

    const/4 v2, -0x1

    .line 75
    iput v2, v5, Ll/᩵᩷֨;->֫:I

    add-int/lit8 v2, v1, -0x1

    .line 76
    iput v1, v0, Ll/ᩴ᩷֨;->ۛ:I

    .line 78
    iget-boolean v5, v4, Ll/᩵᩷֨;->ܽ:Z

    if-eqz v5, :cond_41

    .line 79
    aget-object v5, v3, v2

    iput v1, v5, Ll/᩵᩷֨;->ᩳ:I

    .line 80
    iget v1, v4, Ll/᩵᩷֨;->ۧ:I

    iput v1, v5, Ll/᩵᩷֨;->֫:I

    .line 81
    iput v2, v0, Ll/ᩴ᩷֨;->ۛ:I

    .line 82
    iget v1, v4, Ll/᩵᩷֨;->ܿ:I

    goto :goto_27

    :cond_41
    move v1, v2

    .line 86
    :cond_42
    :goto_27
    aget-object v2, v3, v1

    iget v4, v2, Ll/᩵᩷֨;->ᩳ:I

    .line 87
    iget v5, v0, Ll/ᩴ᩷֨;->ۛ:I

    iput v5, v2, Ll/᩵᩷֨;->ᩳ:I

    .line 88
    iput v1, v0, Ll/ᩴ᩷֨;->ۛ:I

    const/4 v2, 0x0

    if-gtz v1, :cond_43

    .line 92
    aget-object v1, v3, v2

    iget v1, v1, Ll/᩵᩷֨;->ᩳ:I

    iput v1, v0, Ll/ᩴ᩷֨;->ۛ:I

    .line 93
    aget-object v2, v3, v1

    iget v2, v2, Ll/᩵᩷֨;->֫:I

    iput v2, v0, Ll/ۖ᩷֨;->ᩴ:I

    return v1

    :cond_43
    move v1, v4

    goto :goto_26
.end method
