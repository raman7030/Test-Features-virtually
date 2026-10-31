.class public final Ll/۟ܳۘ;
.super Ljava/lang/Object;
.source "21MS"


# instance fields
.field public final ֫:[I

.field public final ۜ:[I

.field public final ۢ:I

.field public final ۧ:[I

.field public final ܳ:I

.field public final ܽ:Ljava/util/BitSet;

.field public final ܿ:I

.field public final ᩳ:Ljava/util/BitSet;

.field public final ᩷:I

.field public final ᩻:[I


# direct methods
.method public constructor <init>([I[IIIIILjava/util/BitSet;Ljava/util/BitSet;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ll/۟ܳۘ;->᩻:[I

    .line 48
    iput-object p2, p0, Ll/۟ܳۘ;->ۜ:[I

    .line 49
    iput p3, p0, Ll/۟ܳۘ;->᩷:I

    .line 50
    iput p5, p0, Ll/۟ܳۘ;->ۢ:I

    .line 51
    iput p4, p0, Ll/۟ܳۘ;->ܿ:I

    .line 52
    iput p6, p0, Ll/۟ܳۘ;->ܳ:I

    .line 54
    iput-object p7, p0, Ll/۟ܳۘ;->ܽ:Ljava/util/BitSet;

    .line 55
    iput-object p8, p0, Ll/۟ܳۘ;->ᩳ:Ljava/util/BitSet;

    add-int p1, p3, p4

    .line 57
    invoke-virtual {p7, p3, p1}, Ljava/util/BitSet;->set(II)V

    add-int p1, p5, p6

    .line 58
    invoke-virtual {p8, p5, p1}, Ljava/util/BitSet;->set(II)V

    add-int/2addr p4, p6

    add-int/lit8 p4, p4, 0x1

    .line 61
    new-array p1, p4, [I

    iput-object p1, p0, Ll/۟ܳۘ;->ۧ:[I

    .line 62
    new-array p1, p4, [I

    iput-object p1, p0, Ll/۟ܳۘ;->֫:[I

    return-void
.end method

.method private ֫(III)I
    .locals 5

    .line 197
    iget v0, p0, Ll/۟ܳۘ;->ܿ:I

    sub-int/2addr v0, p1

    iget v1, p0, Ll/۟ܳۘ;->ܳ:I

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    move v0, p1

    :goto_0
    sub-int v1, v0, p1

    if-ge v1, p3, :cond_0

    .line 198
    iget v2, p0, Ll/۟ܳۘ;->᩷:I

    add-int/2addr v2, v0

    iget-object v3, p0, Ll/۟ܳۘ;->᩻:[I

    aget v2, v3, v2

    iget v3, p0, Ll/۟ܳۘ;->ۢ:I

    add-int/2addr v3, p2

    iget-object v4, p0, Ll/۟ܳۘ;->ۜ:[I

    aget v3, v4, v3

    if-ne v2, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method private ֫(IIIIIZ)V
    .locals 22

    move-object/from16 v7, p0

    move/from16 v8, p1

    move/from16 v9, p2

    move/from16 v10, p3

    move/from16 v11, p4

    if-ge v8, v9, :cond_13

    if-ge v10, v11, :cond_13

    sub-int v0, v9, v8

    sub-int v1, v11, v10

    add-int/lit8 v2, v1, 0x1

    .line 106
    iget-object v3, v7, Ll/۟ܳۘ;->ۧ:[I

    const/4 v4, 0x0

    aput v4, v3, v2

    .line 107
    iget-object v5, v7, Ll/۟ܳۘ;->֫:[I

    aput v4, v5, v2

    const/4 v2, 0x1

    add-int/lit8 v4, p5, 0x1

    .line 108
    div-int/lit8 v4, v4, 0x2

    const/4 v6, 0x0

    .line 113
    :goto_0
    iget v12, v7, Ll/۟ܳۘ;->ۢ:I

    iget v13, v7, Ll/۟ܳۘ;->᩷:I

    if-gt v6, v4, :cond_c

    neg-int v14, v6

    neg-int v15, v1

    xor-int v16, v6, v1

    and-int/lit8 v16, v16, 0x1

    add-int v15, v15, v16

    .line 114
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v14

    add-int/2addr v14, v1

    xor-int v15, v6, v0

    and-int/2addr v2, v15

    sub-int v2, v0, v2

    .line 115
    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, v1

    move v15, v14

    :goto_1
    if-gt v15, v2, :cond_3

    if-eq v15, v14, :cond_2

    if-eq v15, v2, :cond_0

    add-int/lit8 v16, v15, -0x1

    move/from16 p5, v4

    .line 117
    aget v4, v3, v16

    add-int/lit8 v16, v15, 0x1

    move/from16 v17, v12

    aget v12, v3, v16

    if-ge v4, v12, :cond_1

    goto :goto_2

    :cond_0
    move/from16 p5, v4

    move/from16 v17, v12

    :cond_1
    add-int/lit8 v4, v15, -0x1

    aget v4, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_2
    move/from16 p5, v4

    move/from16 v17, v12

    :goto_2
    add-int/lit8 v4, v15, 0x1

    aget v4, v3, v4

    :goto_3
    sub-int v12, v4, v15

    add-int/2addr v12, v1

    move/from16 v16, v13

    add-int v13, v8, v4

    add-int v8, v10, v12

    sub-int v10, v0, v4

    sub-int v12, v1, v12

    .line 120
    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 119
    invoke-direct {v7, v13, v8, v10}, Ll/۟ܳۘ;->֫(III)I

    move-result v8

    add-int/2addr v4, v8

    .line 121
    aput v4, v3, v15

    add-int/lit8 v15, v15, 0x2

    move/from16 v8, p1

    move/from16 v10, p3

    move/from16 v4, p5

    move/from16 v13, v16

    move/from16 v12, v17

    goto :goto_1

    :cond_3
    move/from16 p5, v4

    move/from16 v17, v12

    move/from16 v16, v13

    sub-int v4, v0, v1

    .line 124
    rem-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_5

    move v8, v14

    :goto_4
    if-gt v8, v2, :cond_5

    add-int/lit8 v10, v6, -0x1

    sub-int v12, v0, v10

    if-gt v12, v8, :cond_4

    add-int/2addr v10, v0

    if-gt v8, v10, :cond_4

    .line 127
    aget v10, v3, v8

    add-int v12, v1, v0

    sub-int/2addr v12, v8

    aget v12, v5, v12

    add-int/2addr v12, v10

    if-lt v12, v0, :cond_4

    mul-int/lit8 v6, v6, 0x2

    add-int/lit8 v6, v6, -0x1

    goto/16 :goto_a

    :cond_4
    add-int/lit8 v8, v8, 0x2

    goto :goto_4

    :cond_5
    move v8, v14

    :goto_5
    if-gt v8, v2, :cond_9

    if-eq v8, v14, :cond_7

    if-eq v8, v2, :cond_6

    add-int/lit8 v10, v8, -0x1

    .line 138
    aget v10, v5, v10

    add-int/lit8 v12, v8, 0x1

    aget v12, v5, v12

    if-ge v10, v12, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v10, v8, -0x1

    aget v10, v5, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_7
    :goto_6
    add-int/lit8 v10, v8, 0x1

    aget v10, v5, v10

    :goto_7
    sub-int v12, v10, v8

    add-int/2addr v12, v1

    add-int/lit8 v13, v9, -0x1

    sub-int/2addr v13, v10

    add-int/lit8 v15, v11, -0x1

    sub-int/2addr v15, v12

    move/from16 v18, v14

    sub-int v14, v0, v10

    sub-int v12, v1, v12

    .line 141
    invoke-static {v14, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 209
    invoke-static {v13, v15}, Ljava/lang/Math;->min(II)I

    move-result v14

    add-int/lit8 v14, v14, 0x1

    invoke-static {v12, v14}, Ljava/lang/Math;->min(II)I

    move-result v12

    move v14, v13

    :goto_8
    sub-int v11, v13, v14

    if-ge v11, v12, :cond_8

    move/from16 v19, v12

    .line 210
    iget-object v12, v7, Ll/۟ܳۘ;->᩻:[I

    add-int v20, v16, v14

    aget v12, v12, v20

    move/from16 v20, v13

    iget-object v13, v7, Ll/۟ܳۘ;->ۜ:[I

    add-int v21, v17, v15

    aget v13, v13, v21

    if-ne v12, v13, :cond_8

    add-int/lit8 v14, v14, -0x1

    add-int/lit8 v15, v15, -0x1

    move/from16 v12, v19

    move/from16 v13, v20

    goto :goto_8

    :cond_8
    add-int/2addr v10, v11

    .line 142
    aput v10, v5, v8

    add-int/lit8 v8, v8, 0x2

    move/from16 v11, p4

    move/from16 v14, v18

    goto :goto_5

    :cond_9
    move/from16 v18, v14

    if-nez v4, :cond_b

    move/from16 v14, v18

    :goto_9
    if-gt v14, v2, :cond_b

    sub-int v4, v0, v6

    if-gt v4, v14, :cond_a

    add-int v4, v0, v6

    if-gt v14, v4, :cond_a

    add-int v4, v0, v1

    sub-int v8, v4, v14

    .line 148
    aget v4, v3, v8

    aget v10, v5, v14

    add-int/2addr v4, v10

    if-lt v4, v0, :cond_a

    sub-int v10, v0, v10

    mul-int/lit8 v6, v6, 0x2

    :goto_a
    const/4 v2, 0x1

    move v3, v8

    move v8, v6

    goto :goto_b

    :cond_a
    add-int/lit8 v14, v14, 0x2

    goto :goto_9

    :cond_b
    add-int/lit8 v6, v6, 0x1

    const/4 v2, 0x1

    move/from16 v8, p1

    move/from16 v10, p3

    move/from16 v11, p4

    move/from16 v4, p5

    goto/16 :goto_0

    :cond_c
    move/from16 v17, v12

    move/from16 v16, v13

    const/4 v8, -0x1

    const/4 v2, 0x1

    const/4 v10, -0x1

    const/4 v6, -0x1

    const/4 v3, -0x1

    const/4 v8, -0x1

    :goto_b
    if-le v8, v2, :cond_e

    sub-int v0, v10, v3

    add-int v11, v0, v1

    add-int/lit8 v0, v8, 0x1

    .line 161
    div-int/lit8 v12, v0, 0x2

    if-lez v10, :cond_d

    if-lez v11, :cond_d

    add-int v2, p1, v10

    add-int v4, p3, v11

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v3, p3

    move v5, v12

    move/from16 v6, p6

    .line 163
    invoke-direct/range {v0 .. v6}, Ll/۟ܳۘ;->֫(IIIIIZ)V

    :cond_d
    add-int v1, p1, v10

    if-ge v1, v9, :cond_13

    add-int v3, p3, v11

    move/from16 v4, p4

    if-ge v3, v4, :cond_13

    sub-int v5, v8, v12

    move-object/from16 v0, p0

    move/from16 v2, p2

    move/from16 v4, p4

    move/from16 v6, p6

    .line 165
    invoke-direct/range {v0 .. v6}, Ll/۟ܳۘ;->֫(IIIIIZ)V

    return-void

    :cond_e
    move/from16 v4, p4

    if-ltz v8, :cond_11

    move/from16 v2, p1

    move/from16 v3, p3

    :goto_c
    if-ge v2, v9, :cond_13

    if-ge v3, v4, :cond_13

    sub-int v5, v9, v2

    sub-int v6, v4, v3

    .line 170
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-direct {v7, v2, v3, v5}, Ll/۟ܳۘ;->֫(III)I

    move-result v5

    if-lez v5, :cond_f

    add-int v13, v16, v2

    add-int v6, v13, v5

    .line 189
    iget-object v8, v7, Ll/۟ܳۘ;->ܽ:Ljava/util/BitSet;

    const/4 v10, 0x0

    invoke-virtual {v8, v13, v6, v10}, Ljava/util/BitSet;->set(IIZ)V

    add-int v12, v17, v3

    add-int v6, v12, v5

    .line 190
    iget-object v8, v7, Ll/۟ܳۘ;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {v8, v12, v6, v10}, Ljava/util/BitSet;->set(IIZ)V

    add-int/2addr v2, v5

    add-int/2addr v3, v5

    goto :goto_c

    :cond_f
    if-le v0, v1, :cond_10

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_10
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_11
    if-nez p6, :cond_12

    goto :goto_d

    .line 183
    :cond_12
    new-instance v0, Ll/ܰܳۘ;

    invoke-direct {v0}, Ll/ܰܳۘ;-><init>()V

    throw v0

    :cond_13
    :goto_d
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 8

    .line 73
    :try_start_0
    iget v0, p0, Ll/۟ܳۘ;->ܿ:I

    iget v1, p0, Ll/۟ܳۘ;->ܳ:I

    add-int/2addr v0, v1

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    mul-int/lit8 v0, v0, 0xa

    add-int/lit16 v0, v0, 0x4e20

    .line 95
    iget v3, p0, Ll/۟ܳۘ;->ܿ:I

    if-eqz v3, :cond_1

    iget v5, p0, Ll/۟ܳۘ;->ܳ:I

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    add-int v1, v3, v5

    .line 96
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ll/۟ܳۘ;->֫(IIIIIZ)V
    :try_end_0
    .catch Ll/ܰܳۘ; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    .line 76
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ۧ()V
    .locals 8

    .line 89
    iget v0, p0, Ll/۟ܳۘ;->ܿ:I

    iget v1, p0, Ll/۟ܳۘ;->ܳ:I

    add-int/2addr v0, v1

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    mul-int/lit8 v0, v0, 0xa

    const/16 v1, 0x4e20

    add-int/2addr v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 95
    iget v3, p0, Ll/۟ܳۘ;->ܿ:I

    if-eqz v3, :cond_1

    iget v5, p0, Ll/۟ܳۘ;->ܳ:I

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    add-int v1, v3, v5

    .line 96
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ll/۟ܳۘ;->֫(IIIIIZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ܽ()[Ljava/util/BitSet;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/util/BitSet;

    const/4 v1, 0x0

    .line 218
    iget-object v2, p0, Ll/۟ܳۘ;->ܽ:Ljava/util/BitSet;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/۟ܳۘ;->ᩳ:Ljava/util/BitSet;

    aput-object v2, v0, v1

    return-object v0
.end method
