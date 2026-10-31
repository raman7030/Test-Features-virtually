.class public Lorg/bouncycastle/pqc/crypto/mayo/GF16Utils;
.super Ljava/lang/Object;


# static fields
.field public static final MASK_LSB:J = 0x1111111111111111L

.field public static final MASK_MSB:J = -0x7777777777777778L

.field public static final NIBBLE_MASK_LSB:J = -0x1111111111111112L

.field public static final NIBBLE_MASK_MSB:J = 0x7777777777777777L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static mVecMulAdd(I[JII[JI)V
    .locals 25

    move/from16 v0, p3

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v2, v0

    const-wide/16 v4, 0x1

    and-long/2addr v0, v4

    const/4 v6, 0x1

    ushr-long v7, v2, v6

    and-long/2addr v7, v4

    const/4 v9, 0x2

    ushr-long v9, v2, v9

    and-long/2addr v9, v4

    const/4 v11, 0x3

    ushr-long/2addr v2, v11

    and-long/2addr v2, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x1

    move/from16 v12, p0

    move/from16 v4, p2

    move/from16 v5, p5

    :goto_0
    if-ge v6, v12, :cond_0

    add-int/lit8 v13, v4, 0x1

    .line 0
    aget-wide v14, p1, v4

    move/from16 p2, v5

    neg-long v4, v0

    and-long/2addr v4, v14

    const-wide v16, -0x7777777777777778L    # -1.48603973805866E-267

    and-long v18, v14, v16

    const-wide v20, 0x7777777777777777L    # 3.0266874179647486E267

    and-long v14, v14, v20

    const/16 v22, 0x3

    ushr-long v18, v18, v22

    shl-long/2addr v14, v11

    shl-long v23, v18, v11

    add-long v18, v18, v23

    xor-long v14, v14, v18

    move-wide/from16 v18, v0

    neg-long v0, v7

    and-long/2addr v0, v14

    xor-long/2addr v0, v4

    and-long v4, v14, v16

    and-long v14, v14, v20

    ushr-long v4, v4, v22

    shl-long/2addr v14, v11

    shl-long v23, v4, v11

    add-long v4, v4, v23

    xor-long/2addr v4, v14

    const/4 v11, 0x1

    neg-long v14, v9

    and-long/2addr v14, v4

    xor-long/2addr v0, v14

    and-long v14, v4, v16

    and-long v4, v4, v20

    ushr-long v14, v14, v22

    shl-long/2addr v4, v11

    shl-long v16, v14, v11

    add-long v14, v14, v16

    xor-long/2addr v4, v14

    add-int/lit8 v11, p2, 0x1

    aget-wide v14, p4, p2

    move-wide/from16 v16, v7

    neg-long v7, v2

    and-long/2addr v4, v7

    xor-long/2addr v0, v4

    xor-long/2addr v0, v14

    aput-wide v0, p4, p2

    add-int/lit8 v6, v6, 0x1

    const/4 v0, 0x1

    move v5, v11

    move v4, v13

    move-wide/from16 v7, v16

    move-wide/from16 v0, v18

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static matMul([B[BI[BII)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v0, p5, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v3, p4, :cond_0

    add-int/lit8 v5, v1, 0x1

    .line 0
    aget-byte v1, p0, v1

    add-int v6, p2, v3

    aget-byte v6, p1, v6

    invoke-static {v1, v6}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v1

    xor-int/2addr v1, v4

    int-to-byte v4, v1

    add-int/lit8 v3, v3, 0x1

    move v1, v5

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v2, 0x1

    aput-byte v4, p3, v2

    add-int/lit8 v0, v0, 0x1

    move v2, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static mulAddMUpperTriangularMatXMat(I[J[B[JIII)V
    .locals 17

    move/from16 v6, p5

    move/from16 v7, p6

    mul-int v8, v7, p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v9, v6, :cond_2

    move v12, v3

    move v13, v9

    move v14, v10

    :goto_1
    if-ge v13, v6, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_2
    if-ge v15, v7, :cond_0

    add-int v0, v14, v15

    .line 0
    aget-byte v3, p2, v0

    add-int v0, p4, v11

    add-int v5, v0, v16

    move/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move-object/from16 v4, p3

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/mayo/GF16Utils;->mVecMulAdd(I[JII[JI)V

    add-int/lit8 v15, v15, 0x1

    add-int v16, v16, p0

    goto :goto_2

    :cond_0
    add-int v12, v12, p0

    add-int/lit8 v13, v13, 0x1

    add-int/2addr v14, v7

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    add-int/2addr v10, v7

    add-int/2addr v11, v8

    move v3, v12

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static mulAddMUpperTriangularMatXMatTrans(I[J[B[JII)V
    .locals 16

    move/from16 v6, p4

    move/from16 v7, p5

    mul-int v8, p0, v7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v9, v6, :cond_2

    move v11, v2

    move v12, v9

    :goto_1
    if-ge v12, v6, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_2
    if-ge v13, v7, :cond_0

    add-int v0, v14, v12

    .line 0
    aget-byte v3, p2, v0

    add-int v5, v10, v15

    move/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move-object/from16 v4, p3

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/mayo/GF16Utils;->mVecMulAdd(I[JII[JI)V

    add-int/lit8 v13, v13, 0x1

    add-int/2addr v14, v6

    add-int v15, v15, p0

    goto :goto_2

    :cond_0
    add-int v11, v11, p0

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    add-int/2addr v10, v8

    move v2, v11

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static mulAddMatTransXMMat(I[B[JI[JII)V
    .locals 17

    move/from16 v6, p6

    mul-int v7, v6, p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v8, v6, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move/from16 v13, p5

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1
    if-ge v10, v13, :cond_1

    add-int v0, v11, v8

    .line 0
    aget-byte v14, p1, v0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_2
    if-ge v15, v6, :cond_0

    add-int v0, p3, v12

    add-int v2, v0, v16

    add-int v5, v9, v16

    move/from16 v0, p0

    move-object/from16 v1, p2

    move v3, v14

    move-object/from16 v4, p4

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/mayo/GF16Utils;->mVecMulAdd(I[JII[JI)V

    add-int/lit8 v15, v15, 0x1

    add-int v16, v16, p0

    goto :goto_2

    :cond_0
    add-int/lit8 v10, v10, 0x1

    add-int/2addr v11, v6

    add-int/2addr v12, v7

    goto :goto_1

    :cond_1
    add-int/lit8 v8, v8, 0x1

    add-int/2addr v9, v7

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static mulAddMatXMMat(I[B[JI[JIII)V
    .locals 19

    move/from16 v6, p6

    move/from16 v7, p7

    mul-int v8, p0, v7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move/from16 v12, p5

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v9, v12, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_1
    if-ge v13, v6, :cond_1

    add-int v0, v11, v13

    .line 0
    aget-byte v15, p1, v0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/16 v16, 0x0

    :goto_2
    if-ge v5, v7, :cond_0

    add-int v0, v14, v16

    add-int v2, v0, p3

    add-int v17, v10, v16

    move/from16 v0, p0

    move-object/from16 v1, p2

    move v3, v15

    move-object/from16 v4, p4

    move/from16 v18, v5

    move/from16 v5, v17

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/mayo/GF16Utils;->mVecMulAdd(I[JII[JI)V

    add-int/lit8 v5, v18, 0x1

    add-int v16, v16, p0

    goto :goto_2

    :cond_0
    add-int/lit8 v13, v13, 0x1

    add-int/2addr v14, v8

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    add-int/2addr v10, v8

    add-int/2addr v11, v6

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static mulAddMatXMMat(I[B[J[JII)V
    .locals 17

    move/from16 v6, p4

    move/from16 v7, p5

    mul-int v8, p0, v6

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v9, v6, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_1
    if-ge v12, v7, :cond_1

    add-int v0, v10, v12

    .line 0
    aget-byte v14, p1, v0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_2
    if-ge v15, v6, :cond_0

    add-int v2, v13, v16

    add-int v5, v11, v16

    move/from16 v0, p0

    move-object/from16 v1, p2

    move v3, v14

    move-object/from16 v4, p3

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/mayo/GF16Utils;->mVecMulAdd(I[JII[JI)V

    add-int/lit8 v15, v15, 0x1

    add-int v16, v16, p0

    goto :goto_2

    :cond_0
    add-int/lit8 v12, v12, 0x1

    add-int/2addr v13, v8

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    add-int/2addr v10, v7

    add-int/2addr v11, v8

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static mulFx8(BJ)J
    .locals 8

    and-int/lit16 v0, p0, 0xff

    const/4 v1, 0x1

    and-int/2addr p0, v1

    neg-int p0, p0

    int-to-long v2, p0

    and-long/2addr v2, p1

    shr-int/lit8 p0, v0, 0x1

    and-int/2addr p0, v1

    neg-int p0, p0

    int-to-long v4, p0

    shl-long v6, p1, v1

    and-long/2addr v4, v6

    xor-long/2addr v2, v4

    shr-int/lit8 p0, v0, 0x2

    and-int/2addr p0, v1

    neg-int p0, p0

    int-to-long v4, p0

    const/4 p0, 0x2

    shl-long v6, p1, p0

    and-long/2addr v4, v6

    xor-long/2addr v2, v4

    const/4 p0, 0x3

    shr-int/2addr v0, p0

    and-int/2addr v0, v1

    neg-int v0, v0

    int-to-long v0, v0

    shl-long/2addr p1, p0

    and-long/2addr p1, v0

    xor-long/2addr p1, v2

    const-wide v0, -0xf0f0f0f0f0f0f10L    # -1.0773087426743214E236

    and-long/2addr v0, p1

    const/4 v2, 0x4

    ushr-long v2, v0, v2

    xor-long/2addr p1, v2

    ushr-long/2addr v0, p0

    xor-long p0, p1, v0

    const-wide v0, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    and-long/2addr p0, v0

    return-wide p0
.end method
