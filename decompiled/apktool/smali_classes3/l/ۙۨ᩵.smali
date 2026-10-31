.class public final Ll/ۙۨ᩵;
.super Ll/ۗۘۢ;
.source "68AX"


# static fields
.field public static final ۧ:Ll/ۗۘۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Ll/ۙۨ᩵;

    const/4 v1, 0x2

    .line 27
    invoke-direct {v0, v1}, Ll/ۗۘۢ;-><init>(I)V

    .line 31
    sput-object v0, Ll/ۙۨ᩵;->ۧ:Ll/ۗۘۢ;

    return-void
.end method


# virtual methods
.method public final ֫(II[B[B)I
    .locals 19

    move/from16 v0, p1

    move/from16 v5, p2

    move-object/from16 v1, p3

    move-object/from16 v3, p4

    const/4 v2, 0x0

    .line 270
    invoke-static {v2, v0, v1}, Ll/ۛ᩸ۘ;->֫(II[B)V

    .line 271
    invoke-static {v2, v5, v3}, Ll/ۛ᩸ۘ;->֫(II[B)V

    const v2, 0x1000b

    const-string v4, "maxDestLen is too small"

    const/16 v6, 0xf

    const/4 v7, 0x1

    if-ge v0, v2, :cond_9

    add-int/lit8 v2, v0, -0x5

    add-int/lit8 v8, v0, -0xc

    const/16 v9, 0xd

    if-lt v0, v9, :cond_8

    const/16 v9, 0x2000

    new-array v9, v9, [S

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 56
    :goto_0
    sget v13, Ll/ۖۨ᩵;->֫:I

    shl-int/2addr v7, v13

    const/4 v13, 0x1

    :goto_1
    const v14, -0x61c8864f

    add-int/2addr v13, v10

    add-int/lit8 v15, v7, 0x1

    .line 60
    sget v16, Ll/ۖۨ᩵;->֫:I

    ushr-int v7, v7, v16

    if-le v13, v8, :cond_0

    goto/16 :goto_5

    .line 66
    :cond_0
    invoke-static {v10, v1}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v16

    mul-int v16, v16, v14

    ushr-int/lit8 v16, v16, 0x13

    .line 94
    aget-short v17, v9, v16

    const v18, 0xffff

    and-int v14, v17, v18

    move/from16 v17, v7

    int-to-short v7, v10

    .line 86
    aput-short v7, v9, v16

    .line 69
    invoke-static {v14, v10, v1}, Ll/۬ۨ᩵;->֫(II[B)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 72
    invoke-static {v14, v1, v10, v11}, Ll/۬ۨ᩵;->ۧ(I[BII)I

    move-result v7

    sub-int/2addr v10, v7

    sub-int/2addr v14, v7

    sub-int v7, v10, v11

    add-int/lit8 v13, v12, 0x1

    add-int v15, v13, v7

    add-int/lit8 v15, v15, 0x8

    ushr-int/lit8 v16, v7, 0x8

    add-int v15, v15, v16

    if-gt v15, v5, :cond_6

    if-lt v7, v6, :cond_1

    const/16 v6, 0xf0

    int-to-byte v6, v6

    .line 82
    aput-byte v6, v3, v12

    add-int/lit8 v6, v7, -0xf

    .line 88
    invoke-static {v6, v13, v3}, Ll/۬ۨ᩵;->ۧ(II[B)I

    move-result v13

    goto :goto_2

    :cond_1
    shl-int/lit8 v6, v7, 0x4

    int-to-byte v6, v6

    .line 82
    aput-byte v6, v3, v12

    .line 94
    :goto_2
    invoke-static {v11, v1, v13, v3, v7}, Ll/۬ۨ᩵;->֫(I[BI[BI)V

    add-int/2addr v13, v7

    :goto_3
    sub-int v6, v10, v14

    int-to-short v6, v6

    add-int/lit8 v7, v13, 0x1

    int-to-byte v11, v6

    .line 69
    aput-byte v11, v3, v13

    ushr-int/lit8 v6, v6, 0x8

    int-to-byte v6, v6

    .line 70
    aput-byte v6, v3, v7

    add-int/lit8 v6, v13, 0x2

    add-int/lit8 v10, v10, 0x4

    add-int/lit8 v14, v14, 0x4

    .line 105
    invoke-static {v14, v1, v10, v2}, Ll/۬ۨ᩵;->֫(I[BII)I

    move-result v7

    add-int/lit8 v13, v13, 0x8

    ushr-int/lit8 v11, v7, 0x8

    add-int/2addr v13, v11

    if-gt v13, v5, :cond_5

    add-int/2addr v10, v7

    const/16 v11, 0xf

    if-lt v7, v11, :cond_2

    .line 44
    aget-byte v13, v3, v12

    or-int/2addr v11, v13

    int-to-byte v11, v11

    .line 82
    aput-byte v11, v3, v12

    add-int/lit8 v7, v7, -0xf

    .line 114
    invoke-static {v7, v6, v3}, Ll/۬ۨ᩵;->ۧ(II[B)I

    move-result v6

    goto :goto_4

    .line 44
    :cond_2
    aget-byte v11, v3, v12

    or-int/2addr v7, v11

    int-to-byte v7, v7

    .line 82
    aput-byte v7, v3, v12

    :goto_4
    move v12, v6

    if-le v10, v8, :cond_3

    move v11, v10

    :goto_5
    move v4, v12

    goto :goto_6

    :cond_3
    add-int/lit8 v6, v10, -0x2

    .line 126
    invoke-static {v6, v1}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v7

    const v14, -0x61c8864f

    mul-int v7, v7, v14

    ushr-int/lit8 v7, v7, 0x13

    int-to-short v6, v6

    .line 86
    aput-short v6, v9, v7

    .line 129
    invoke-static {v10, v1}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v6

    mul-int v6, v6, v14

    ushr-int/lit8 v6, v6, 0x13

    .line 94
    aget-short v7, v9, v6

    and-int v7, v7, v18

    int-to-short v11, v10

    .line 86
    aput-short v11, v9, v6

    .line 133
    invoke-static {v10, v7, v1}, Ll/۬ۨ᩵;->֫(II[B)Z

    move-result v6

    if-nez v6, :cond_4

    add-int/lit8 v6, v10, 0x1

    const/16 v7, 0xf

    const/4 v11, 0x1

    move v11, v10

    const/4 v7, 0x1

    move v10, v6

    const/16 v6, 0xf

    goto/16 :goto_0

    :cond_4
    add-int/lit8 v13, v12, 0x1

    const/4 v6, 0x0

    int-to-byte v6, v6

    .line 82
    aput-byte v6, v3, v12

    move v14, v7

    goto :goto_3

    .line 107
    :cond_5
    new-instance v0, Ll/ۘۨ᩵;

    .line 31
    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 107
    throw v0

    .line 83
    :cond_6
    new-instance v0, Ll/ۘۨ᩵;

    .line 31
    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 83
    throw v0

    :cond_7
    move v10, v13

    move v7, v15

    move/from16 v13, v17

    goto/16 :goto_1

    :cond_8
    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    :goto_6
    sub-int v2, v0, v11

    move-object/from16 v0, p3

    move v1, v11

    move-object/from16 v3, p4

    move/from16 v5, p2

    .line 146
    invoke-static/range {v0 .. v5}, Ll/۬ۨ᩵;->֫([BII[BII)I

    move-result v0

    return v0

    :cond_9
    const v2, -0x61c8864f

    const/4 v6, 0x1

    add-int/lit8 v7, v0, -0x5

    add-int/lit8 v8, v0, -0xc

    const/16 v9, 0x1000

    new-array v9, v9, [I

    const/4 v10, 0x0

    .line 286
    invoke-static {v9, v10}, Ljava/util/Arrays;->fill([II)V

    const/4 v11, 0x0

    const/4 v12, 0x1

    .line 296
    :goto_7
    sget v13, Ll/ۖۨ᩵;->֫:I

    shl-int v13, v6, v13

    const/4 v14, 0x1

    :goto_8
    add-int/2addr v14, v12

    add-int/lit8 v15, v13, 0x1

    .line 301
    sget v16, Ll/ۖۨ᩵;->֫:I

    ushr-int v13, v13, v16

    if-le v14, v8, :cond_a

    move v12, v10

    :goto_9
    move v4, v11

    goto/16 :goto_d

    .line 307
    :cond_a
    invoke-static {v12, v1}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v16

    mul-int v16, v16, v2

    ushr-int/lit8 v16, v16, 0x14

    .line 78
    aget v6, v9, v16

    sub-int v2, v12, v6

    .line 74
    aput v12, v9, v16

    move/from16 v16, v13

    const/high16 v13, 0x10000

    if-ge v2, v13, :cond_12

    .line 311
    invoke-static {v6, v12, v1}, Ll/۬ۨ᩵;->֫(II[B)Z

    move-result v13

    if-eqz v13, :cond_12

    .line 314
    invoke-static {v6, v1, v12, v10}, Ll/۬ۨ᩵;->ۧ(I[BII)I

    move-result v13

    sub-int/2addr v12, v13

    sub-int/2addr v6, v13

    sub-int v13, v12, v10

    add-int/lit8 v14, v11, 0x1

    add-int v15, v14, v13

    add-int/lit8 v15, v15, 0x8

    ushr-int/lit8 v16, v13, 0x8

    add-int v15, v15, v16

    if-gt v15, v5, :cond_11

    const/16 v15, 0xf

    if-lt v13, v15, :cond_b

    const/16 v15, 0xf0

    int-to-byte v15, v15

    .line 82
    aput-byte v15, v3, v11

    add-int/lit8 v15, v13, -0xf

    .line 330
    invoke-static {v15, v14, v3}, Ll/۬ۨ᩵;->ۧ(II[B)I

    move-result v14

    goto :goto_a

    :cond_b
    shl-int/lit8 v15, v13, 0x4

    int-to-byte v15, v15

    .line 82
    aput-byte v15, v3, v11

    .line 336
    :goto_a
    invoke-static {v10, v1, v14, v3, v13}, Ll/۬ۨ᩵;->֫(I[BI[BI)V

    add-int/2addr v14, v13

    :goto_b
    add-int/lit8 v10, v14, 0x1

    int-to-byte v13, v2

    .line 69
    aput-byte v13, v3, v14

    ushr-int/lit8 v2, v2, 0x8

    int-to-byte v2, v2

    .line 70
    aput-byte v2, v3, v10

    add-int/lit8 v2, v14, 0x2

    add-int/lit8 v12, v12, 0x4

    add-int/lit8 v6, v6, 0x4

    .line 346
    invoke-static {v6, v1, v12, v7}, Ll/۬ۨ᩵;->֫(I[BII)I

    move-result v6

    add-int/lit8 v14, v14, 0x8

    ushr-int/lit8 v10, v6, 0x8

    add-int/2addr v14, v10

    if-gt v14, v5, :cond_10

    add-int/2addr v12, v6

    const/16 v10, 0xf

    if-lt v6, v10, :cond_c

    .line 44
    aget-byte v13, v3, v11

    or-int/2addr v10, v13

    int-to-byte v10, v10

    .line 82
    aput-byte v10, v3, v11

    add-int/lit8 v6, v6, -0xf

    .line 355
    invoke-static {v6, v2, v3}, Ll/۬ۨ᩵;->ۧ(II[B)I

    move-result v2

    goto :goto_c

    .line 44
    :cond_c
    aget-byte v10, v3, v11

    or-int/2addr v6, v10

    int-to-byte v6, v6

    .line 82
    aput-byte v6, v3, v11

    :goto_c
    move v11, v2

    if-le v12, v8, :cond_d

    goto/16 :goto_9

    :goto_d
    sub-int v2, v0, v12

    move-object/from16 v0, p3

    move v1, v12

    move-object/from16 v3, p4

    move/from16 v5, p2

    .line 387
    invoke-static/range {v0 .. v5}, Ll/۬ۨ᩵;->֫([BII[BII)I

    move-result v0

    return v0

    :cond_d
    add-int/lit8 v2, v12, -0x2

    .line 367
    invoke-static {v2, v1}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v6

    const v13, -0x61c8864f

    mul-int v6, v6, v13

    ushr-int/lit8 v6, v6, 0x14

    .line 74
    aput v2, v9, v6

    .line 370
    invoke-static {v12, v1}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v2

    mul-int v2, v2, v13

    ushr-int/lit8 v2, v2, 0x14

    .line 78
    aget v6, v9, v2

    .line 74
    aput v12, v9, v2

    sub-int v2, v12, v6

    const/high16 v10, 0x10000

    if-ge v2, v10, :cond_f

    .line 375
    invoke-static {v6, v12, v1}, Ll/۬ۨ᩵;->֫(II[B)Z

    move-result v10

    if-nez v10, :cond_e

    goto :goto_e

    :cond_e
    add-int/lit8 v14, v11, 0x1

    const/4 v10, 0x0

    int-to-byte v10, v10

    .line 82
    aput-byte v10, v3, v11

    goto :goto_b

    :cond_f
    :goto_e
    add-int/lit8 v2, v12, 0x1

    move v10, v12

    const/4 v6, 0x1

    move v12, v2

    const v2, -0x61c8864f

    goto/16 :goto_7

    .line 348
    :cond_10
    new-instance v0, Ll/ۘۨ᩵;

    .line 31
    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 348
    throw v0

    .line 325
    :cond_11
    new-instance v0, Ll/ۘۨ᩵;

    .line 31
    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 325
    throw v0

    :cond_12
    const v13, -0x61c8864f

    move v12, v14

    move v13, v15

    move/from16 v14, v16

    const v2, -0x61c8864f

    const/4 v6, 0x1

    goto/16 :goto_8
.end method
