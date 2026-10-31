.class public final Ll/᩷۠֡;
.super Ljava/lang/Object;
.source "07SK"


# instance fields
.field public final ֫:Ll/ۧ۠֡;

.field public final ۜ:[B

.field public final ۧ:[[I

.field public ܳ:I

.field public final ܽ:[[I

.field public final ܿ:[C

.field public ᩳ:I

.field public final ᩻:[I


# direct methods
.method public constructor <init>(Ll/ۧ۠֡;[CII[I)V
    .locals 3

    .line 389
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 391
    iput-object p1, p0, Ll/᩷۠֡;->֫:Ll/ۧ۠֡;

    .line 392
    iput-object p2, p0, Ll/᩷۠֡;->ܿ:[C

    .line 393
    iput p3, p0, Ll/᩷۠֡;->ܳ:I

    .line 394
    iput p4, p0, Ll/᩷۠֡;->ᩳ:I

    .line 395
    iput-object p5, p0, Ll/᩷۠֡;->᩻:[I

    const/16 p1, 0x960

    const/4 p2, 0x2

    if-lt p3, p1, :cond_0

    const/4 p1, 0x6

    goto :goto_0

    :cond_0
    const/16 p1, 0x4b0

    if-lt p3, p1, :cond_1

    const/4 p1, 0x5

    goto :goto_0

    :cond_1
    const/16 p1, 0x258

    if-lt p3, p1, :cond_2

    const/4 p1, 0x4

    goto :goto_0

    :cond_2
    const/16 p1, 0xc8

    if-lt p3, p1, :cond_3

    const/4 p1, 0x3

    goto :goto_0

    :cond_3
    const/4 p1, 0x2

    :goto_0
    new-array p5, p2, [I

    const/4 v0, 0x1

    aput p4, p5, v0

    const/4 v1, 0x0

    aput p1, p5, v1

    .line 399
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2, p5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, [[I

    iput-object p5, p0, Ll/᩷۠֡;->ۧ:[[I

    new-array p2, p2, [I

    aput p4, p2, v0

    aput p1, p2, v1

    .line 400
    invoke-static {v2, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[I

    iput-object p1, p0, Ll/᩷۠֡;->ܽ:[[I

    add-int/lit8 p3, p3, 0x31

    .line 401
    div-int/lit8 p3, p3, 0x32

    new-array p1, p3, [B

    iput-object p1, p0, Ll/᩷۠֡;->ۜ:[B

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 22

    move-object/from16 v0, p0

    .line 145
    iget-object v1, v0, Ll/᩷۠֡;->ۧ:[[I

    array-length v2, v1

    .line 150
    iget v3, v0, Ll/᩷۠֡;->ܳ:I

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, v3

    :goto_0
    const/16 v8, 0xf

    iget v9, v0, Ll/᩷۠֡;->ᩳ:I

    if-ge v6, v2, :cond_5

    sub-int v10, v2, v6

    .line 152
    div-int v11, v7, v10

    add-int/lit8 v12, v4, 0x1

    const/4 v13, 0x0

    .line 156
    :goto_1
    iget-object v14, v0, Ll/᩷۠֡;->᩻:[I

    if-ge v13, v11, :cond_0

    add-int/lit8 v15, v9, -0x1

    if-ge v4, v15, :cond_0

    add-int/lit8 v4, v4, 0x1

    .line 157
    aget v14, v14, v4

    add-int/2addr v13, v14

    goto :goto_1

    :cond_0
    if-le v4, v12, :cond_1

    if-eqz v6, :cond_1

    add-int/lit8 v11, v2, -0x1

    if-eq v6, v11, :cond_1

    and-int/lit8 v10, v10, 0x1

    if-nez v10, :cond_1

    add-int/lit8 v10, v4, -0x1

    .line 161
    aget v4, v14, v4

    sub-int/2addr v13, v4

    move v4, v10

    .line 164
    :cond_1
    aget-object v10, v1, v6

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v9, :cond_4

    if-lt v11, v12, :cond_2

    if-le v11, v4, :cond_3

    .line 167
    :cond_2
    aput v8, v10, v11

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    sub-int/2addr v7, v13

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    const/4 v2, 0x3

    :goto_3
    const/4 v4, 0x2

    .line 370
    iget-object v6, v0, Ll/᩷۠֡;->ܿ:[C

    iget-object v7, v0, Ll/᩷۠֡;->ۜ:[B

    const/4 v8, 0x1

    if-ltz v2, :cond_12

    if-nez v2, :cond_6

    const/4 v10, 0x1

    goto :goto_4

    :cond_6
    const/4 v10, 0x0

    .line 194
    :goto_4
    array-length v11, v1

    new-array v4, v4, [I

    aput v9, v4, v8

    .line 195
    aput v11, v4, v5

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[I

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_5
    if-ge v5, v3, :cond_d

    add-int/lit8 v13, v5, 0x32

    .line 202
    invoke-static {v13, v3}, Ljava/lang/Math;->min(II)I

    move-result v13

    add-int/lit8 v14, v13, -0x1

    .line 205
    new-array v15, v11, [S

    move v12, v5

    :goto_6
    if-gt v12, v14, :cond_8

    .line 207
    aget-char v17, v6, v12

    const/16 v18, 0x0

    move/from16 v19, v5

    const/4 v5, 0x0

    :goto_7
    if-ge v5, v11, :cond_7

    .line 209
    aget-short v18, v15, v5

    aget-object v20, v1, v5

    aget v20, v20, v17

    move/from16 v21, v13

    add-int v13, v18, v20

    int-to-short v13, v13

    aput-short v13, v15, v5

    add-int/lit8 v5, v5, 0x1

    move/from16 v13, v21

    goto :goto_7

    :cond_7
    move/from16 v21, v13

    add-int/lit8 v12, v12, 0x1

    move/from16 v5, v19

    goto :goto_6

    :cond_8
    move/from16 v19, v5

    move/from16 v21, v13

    const/4 v5, 0x0

    .line 215
    aget-short v5, v15, v5

    const/4 v12, 0x1

    const/4 v13, 0x0

    :goto_8
    if-ge v12, v11, :cond_a

    move/from16 v16, v3

    .line 217
    aget-short v3, v15, v12

    if-ge v3, v5, :cond_9

    move v5, v3

    move v13, v12

    :cond_9
    add-int/lit8 v12, v12, 0x1

    int-to-byte v12, v12

    move/from16 v3, v16

    goto :goto_8

    :cond_a
    move/from16 v16, v3

    .line 225
    aget-object v3, v4, v13

    move/from16 v5, v19

    :goto_9
    if-gt v5, v14, :cond_b

    .line 227
    aget-char v12, v6, v5

    aget v15, v3, v12

    add-int/lit8 v15, v15, 0x1

    aput v15, v3, v12

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_b
    if-eqz v10, :cond_c

    add-int/lit8 v3, v8, 0x1

    .line 232
    aput-byte v13, v7, v8

    move v8, v3

    :cond_c
    move/from16 v3, v16

    move/from16 v5, v21

    goto :goto_5

    :cond_d
    move/from16 v16, v3

    const/4 v3, 0x0

    :goto_a
    if-ge v3, v11, :cond_11

    .line 241
    aget-object v5, v4, v3

    aget-object v6, v1, v3

    .line 104
    new-array v7, v9, [I

    .line 105
    new-array v8, v9, [I

    const/4 v10, 0x0

    :goto_b
    if-ge v10, v9, :cond_e

    .line 115
    aget v12, v5, v10

    shl-int/lit8 v12, v12, 0x9

    or-int/2addr v12, v10

    aput v12, v7, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_b

    .line 117
    :cond_e
    invoke-static {v7}, Ljava/util/Arrays;->sort([I)V

    const/4 v5, 0x0

    :goto_c
    if-ge v5, v9, :cond_f

    .line 119
    aget v10, v7, v5

    ushr-int/lit8 v10, v10, 0x9

    aput v10, v8, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    .line 123
    :cond_f
    invoke-static {v8}, Ll/᩺ۤۡ;->֫([I)V

    const/4 v5, 0x0

    :goto_d
    if-ge v5, v9, :cond_10

    .line 127
    aget v10, v7, v5

    and-int/lit16 v10, v10, 0x1ff

    aget v12, v8, v5

    aput v12, v6, v10

    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    :cond_10
    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_11
    add-int/lit8 v2, v2, -0x1

    const/4 v5, 0x0

    move/from16 v3, v16

    goto/16 :goto_3

    :cond_12
    move/from16 v16, v3

    .line 256
    array-length v2, v1

    const/4 v3, 0x0

    .line 258
    :goto_e
    iget-object v5, v0, Ll/᩷۠֡;->ܽ:[[I

    if-ge v3, v2, :cond_19

    .line 260
    aget-object v8, v1, v3

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_f
    if-ge v11, v9, :cond_15

    .line 265
    aget v13, v8, v11

    if-le v13, v12, :cond_13

    move v12, v13

    :cond_13
    if-ge v13, v10, :cond_14

    move v10, v13

    :cond_14
    add-int/lit8 v11, v11, 0x1

    goto :goto_f

    :cond_15
    const/4 v8, 0x0

    :goto_10
    if-gt v10, v12, :cond_18

    const/4 v11, 0x0

    :goto_11
    if-ge v11, v9, :cond_17

    .line 277
    aget-object v13, v1, v3

    aget v13, v13, v11

    and-int/lit16 v13, v13, 0xff

    if-ne v13, v10, :cond_16

    .line 278
    aget-object v13, v5, v3

    shl-int/lit8 v14, v10, 0x18

    or-int/2addr v14, v8

    aput v14, v13, v11

    add-int/lit8 v8, v8, 0x1

    :cond_16
    add-int/lit8 v11, v11, 0x1

    goto :goto_11

    :cond_17
    shl-int/lit8 v8, v8, 0x1

    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    :cond_18
    add-int/lit8 v3, v3, 0x1

    goto :goto_e

    .line 298
    :cond_19
    array-length v2, v7

    .line 302
    array-length v3, v1

    .line 304
    iget-object v8, v0, Ll/᩷۠֡;->֫:Ll/ۧ۠֡;

    const/4 v10, 0x3

    invoke-virtual {v8, v10, v3}, Ll/ۧ۠֡;->֫(II)V

    const/16 v11, 0xf

    .line 305
    invoke-virtual {v8, v11, v2}, Ll/ۧ۠֡;->֫(II)V

    .line 308
    new-instance v11, Ll/ۘ۠֡;

    invoke-direct {v11}, Ll/ۘ۠֡;-><init>()V

    const/4 v12, 0x0

    :goto_12
    if-ge v12, v2, :cond_1b

    .line 310
    aget-byte v13, v7, v12

    invoke-virtual {v11, v13}, Ll/ۘ۠֡;->֫(B)I

    move-result v13

    :goto_13
    add-int/lit8 v14, v13, -0x1

    if-lez v13, :cond_1a

    const/4 v13, 0x1

    .line 82
    invoke-virtual {v8, v13}, Ll/ۧ۠֡;->֫(Z)V

    move v13, v14

    goto :goto_13

    :cond_1a
    const/4 v13, 0x0

    .line 84
    invoke-virtual {v8, v13}, Ll/ۧ۠֡;->֫(Z)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_12

    :cond_1b
    const/4 v2, 0x0

    :goto_14
    const/4 v11, 0x0

    if-ge v2, v3, :cond_1f

    .line 315
    aget-object v12, v1, v2

    .line 316
    aget v11, v12, v11

    const/4 v13, 0x5

    .line 318
    invoke-virtual {v8, v13, v11}, Ll/ۧ۠֡;->֫(II)V

    const/4 v13, 0x0

    :goto_15
    if-ge v13, v9, :cond_1e

    .line 321
    aget v14, v12, v13

    if-ge v11, v14, :cond_1c

    const/4 v10, 0x2

    :cond_1c
    sub-int v11, v14, v11

    .line 323
    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v11

    :goto_16
    add-int/lit8 v15, v11, -0x1

    if-lez v11, :cond_1d

    .line 325
    invoke-virtual {v8, v4, v10}, Ll/ۧ۠֡;->֫(II)V

    move v11, v15

    goto :goto_16

    :cond_1d
    const/4 v10, 0x0

    .line 327
    invoke-virtual {v8, v10}, Ll/ۧ۠֡;->֫(Z)V

    add-int/lit8 v13, v13, 0x1

    const/4 v10, 0x3

    move v11, v14

    goto :goto_15

    :cond_1e
    add-int/lit8 v2, v2, 0x1

    const/4 v10, 0x3

    goto :goto_14

    :cond_1f
    const/4 v1, 0x0

    const/4 v2, 0x0

    move/from16 v3, v16

    :goto_17
    if-ge v1, v3, :cond_21

    add-int/lit8 v4, v1, 0x32

    .line 350
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    add-int/lit8 v9, v2, 0x1

    .line 351
    aget-byte v2, v7, v2

    aget-object v2, v5, v2

    :goto_18
    if-gt v1, v4, :cond_20

    add-int/lit8 v10, v1, 0x1

    .line 354
    aget-char v1, v6, v1

    aget v1, v2, v1

    ushr-int/lit8 v11, v1, 0x18

    .line 355
    invoke-virtual {v8, v11, v1}, Ll/ۧ۠֡;->֫(II)V

    move v1, v10

    goto :goto_18

    :cond_20
    move v2, v9

    goto :goto_17

    :cond_21
    return-void
.end method
