.class public Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;
.super Ljava/lang/Object;


# static fields
.field public static final M41:J = 0x1ffffffffffL

.field public static final M59:J = 0x7ffffffffffffffL


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static add([J[J[J)V
    .locals 5

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x1

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x2

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x3

    aget-wide v1, p0, v0

    aget-wide p0, p1, v0

    xor-long/2addr p0, v1

    aput-wide p0, p2, v0

    return-void
.end method

.method public static addExt([J[J[J)V
    .locals 5

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x1

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x2

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x3

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x4

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x5

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x6

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x7

    aget-wide v1, p0, v0

    aget-wide p0, p1, v0

    xor-long/2addr p0, v1

    aput-wide p0, p2, v0

    return-void
.end method

.method public static addOne([J[J)V
    .locals 5

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    const-wide/16 v3, 0x1

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x1

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    const/4 v0, 0x2

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    const/4 v0, 0x3

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    return-void
.end method

.method public static addTo([J[J)V
    .locals 5

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p1, v0

    aget-wide v3, p0, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x1

    aget-wide v1, p1, v0

    aget-wide v3, p0, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x2

    aget-wide v1, p1, v0

    aget-wide v3, p0, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x3

    aget-wide v1, p1, v0

    aget-wide v3, p0, v0

    xor-long/2addr v1, v3

    aput-wide v1, p1, v0

    return-void
.end method

.method public static fromBigInteger(Ljava/math/BigInteger;)[J
    .locals 1

    const/16 v0, 0xe9

    .line 0
    invoke-static {v0, p0}, Lorg/bouncycastle/math/raw/Nat;->fromBigInteger64(ILjava/math/BigInteger;)[J

    move-result-object p0

    return-object p0
.end method

.method public static halfTrace([J[J)V
    .locals 3

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/raw/Nat256;->createExt64()[J

    move-result-object v0

    invoke-static {p0, p1}, Lorg/bouncycastle/math/raw/Nat256;->copy64([J[J)V

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0xe9

    if-ge v1, v2, :cond_0

    invoke-static {p1, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implSquare([J[J)V

    invoke-static {v0, p1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->reduce([J[J)V

    invoke-static {p1, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implSquare([J[J)V

    invoke-static {v0, p1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->reduce([J[J)V

    invoke-static {p0, p1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->addTo([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static implCompactExt([J)V
    .locals 26

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    const/4 v3, 0x1

    aget-wide v4, p0, v3

    const/4 v6, 0x2

    aget-wide v7, p0, v6

    const/4 v9, 0x3

    aget-wide v10, p0, v9

    const/4 v12, 0x4

    aget-wide v13, p0, v12

    const/4 v15, 0x5

    aget-wide v16, p0, v15

    const/16 v18, 0x6

    aget-wide v19, p0, v18

    const/16 v21, 0x7

    aget-wide v22, p0, v21

    const/16 v24, 0x3b

    shl-long v24, v4, v24

    xor-long v1, v1, v24

    aput-wide v1, p0, v0

    ushr-long v0, v4, v15

    const/16 v2, 0x36

    shl-long v4, v7, v2

    xor-long/2addr v0, v4

    aput-wide v0, p0, v3

    const/16 v0, 0xa

    ushr-long v0, v7, v0

    const/16 v2, 0x31

    shl-long v2, v10, v2

    xor-long/2addr v0, v2

    aput-wide v0, p0, v6

    const/16 v0, 0xf

    ushr-long v0, v10, v0

    const/16 v2, 0x2c

    shl-long v2, v13, v2

    xor-long/2addr v0, v2

    aput-wide v0, p0, v9

    const/16 v0, 0x14

    ushr-long v0, v13, v0

    const/16 v2, 0x27

    shl-long v2, v16, v2

    xor-long/2addr v0, v2

    aput-wide v0, p0, v12

    const/16 v0, 0x19

    ushr-long v0, v16, v0

    const/16 v2, 0x22

    shl-long v2, v19, v2

    xor-long/2addr v0, v2

    aput-wide v0, p0, v15

    const/16 v0, 0x1e

    ushr-long v0, v19, v0

    const/16 v2, 0x1d

    shl-long v2, v22, v2

    xor-long/2addr v0, v2

    aput-wide v0, p0, v18

    const/16 v0, 0x23

    ushr-long v0, v22, v0

    aput-wide v0, p0, v21

    return-void
.end method

.method public static implExpand([J[J)V
    .locals 16

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    const/4 v3, 0x1

    aget-wide v4, p0, v3

    const/4 v6, 0x2

    aget-wide v7, p0, v6

    const/4 v9, 0x3

    aget-wide v10, p0, v9

    const-wide v12, 0x7ffffffffffffffL

    and-long v14, v1, v12

    aput-wide v14, p1, v0

    const/16 v0, 0x3b

    ushr-long v0, v1, v0

    const/4 v2, 0x5

    shl-long v14, v4, v2

    xor-long/2addr v0, v14

    and-long/2addr v0, v12

    aput-wide v0, p1, v3

    const/16 v0, 0x36

    ushr-long v0, v4, v0

    const/16 v2, 0xa

    shl-long v2, v7, v2

    xor-long/2addr v0, v2

    and-long/2addr v0, v12

    aput-wide v0, p1, v6

    const/16 v0, 0x31

    ushr-long v0, v7, v0

    const/16 v2, 0xf

    shl-long v2, v10, v2

    xor-long/2addr v0, v2

    aput-wide v0, p1, v9

    return-void
.end method

.method public static implMultiply([J[J[J)V
    .locals 24

    const/4 v7, 0x4

    new-array v8, v7, [J

    new-array v9, v7, [J

    move-object/from16 v0, p0

    .line 0
    invoke-static {v0, v8}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implExpand([J[J)V

    move-object/from16 v0, p1

    invoke-static {v0, v9}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implExpand([J[J)V

    const/16 v0, 0x8

    new-array v15, v0, [J

    const/16 v17, 0x0

    aget-wide v1, v8, v17

    aget-wide v3, v9, v17

    const/4 v6, 0x0

    move-object v0, v15

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMulwAcc([JJJ[JI)V

    const/4 v13, 0x1

    aget-wide v1, v8, v13

    aget-wide v3, v9, v13

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMulwAcc([JJJ[JI)V

    const/16 v18, 0x2

    aget-wide v1, v8, v18

    aget-wide v3, v9, v18

    const/4 v6, 0x2

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMulwAcc([JJJ[JI)V

    const/4 v14, 0x3

    aget-wide v1, v8, v14

    aget-wide v3, v9, v14

    const/4 v6, 0x3

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMulwAcc([JJJ[JI)V

    const/16 v19, 0x5

    const/4 v0, 0x5

    :goto_0
    if-lez v0, :cond_0

    aget-wide v1, p2, v0

    add-int/lit8 v3, v0, -0x1

    aget-wide v3, p2, v3

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    aget-wide v0, v8, v17

    aget-wide v2, v8, v13

    xor-long v1, v0, v2

    aget-wide v3, v9, v17

    aget-wide v5, v9, v13

    xor-long/2addr v3, v5

    const/4 v6, 0x1

    move-object v0, v15

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMulwAcc([JJJ[JI)V

    aget-wide v0, v8, v18

    aget-wide v2, v8, v14

    xor-long v1, v0, v2

    aget-wide v3, v9, v18

    aget-wide v5, v9, v14

    xor-long/2addr v3, v5

    const/4 v6, 0x3

    move-object v0, v15

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMulwAcc([JJJ[JI)V

    const/4 v0, 0x7

    :goto_1
    if-le v0, v13, :cond_1

    aget-wide v1, p2, v0

    add-int/lit8 v3, v0, -0x2

    aget-wide v3, p2, v3

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    aget-wide v0, v8, v17

    aget-wide v2, v8, v18

    xor-long v11, v0, v2

    aget-wide v0, v8, v13

    aget-wide v2, v8, v14

    xor-long v20, v0, v2

    aget-wide v0, v9, v17

    aget-wide v2, v9, v18

    xor-long v22, v0, v2

    aget-wide v0, v9, v13

    aget-wide v2, v9, v14

    xor-long v8, v2, v0

    xor-long v1, v11, v20

    xor-long v3, v22, v8

    const/4 v6, 0x3

    move-object v0, v15

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMulwAcc([JJJ[JI)V

    new-array v0, v14, [J

    const/16 v16, 0x0

    move-object v10, v15

    const/4 v1, 0x1

    const/4 v2, 0x3

    move-wide/from16 v13, v22

    move-object v3, v15

    move-object v15, v0

    invoke-static/range {v10 .. v16}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMulwAcc([JJJ[JI)V

    const/16 v16, 0x1

    move-object v10, v3

    move-wide/from16 v11, v20

    move-wide v13, v8

    invoke-static/range {v10 .. v16}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMulwAcc([JJJ[JI)V

    aget-wide v3, v0, v17

    aget-wide v5, v0, v1

    aget-wide v8, v0, v18

    aget-wide v0, p2, v18

    xor-long/2addr v0, v3

    aput-wide v0, p2, v18

    aget-wide v0, p2, v2

    xor-long/2addr v3, v5

    xor-long/2addr v0, v3

    aput-wide v0, p2, v2

    aget-wide v0, p2, v7

    xor-long v2, v5, v8

    xor-long/2addr v0, v2

    aput-wide v0, p2, v7

    aget-wide v0, p2, v19

    xor-long/2addr v0, v8

    aput-wide v0, p2, v19

    invoke-static/range {p2 .. p2}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implCompactExt([J)V

    return-void
.end method

.method public static implMulwAcc([JJJ[JI)V
    .locals 14

    move-wide v0, p1

    const/4 v2, 0x1

    .line 0
    aput-wide p3, p0, v2

    shl-long v3, p3, v2

    const/4 v5, 0x2

    aput-wide v3, p0, v5

    xor-long v3, v3, p3

    const/4 v6, 0x3

    aput-wide v3, p0, v6

    shl-long v7, p3, v5

    const/4 v5, 0x4

    aput-wide v7, p0, v5

    xor-long v7, v7, p3

    const/4 v5, 0x5

    aput-wide v7, p0, v5

    shl-long v2, v3, v2

    const/4 v4, 0x6

    aput-wide v2, p0, v4

    xor-long v2, v2, p3

    const/4 v4, 0x7

    aput-wide v2, p0, v4

    long-to-int v2, v0

    and-int/lit8 v3, v2, 0x7

    aget-wide v7, p0, v3

    ushr-int/2addr v2, v6

    and-int/2addr v2, v4

    aget-wide v2, p0, v2

    shl-long/2addr v2, v6

    xor-long/2addr v2, v7

    const-wide/16 v7, 0x0

    const/16 v9, 0x36

    :cond_0
    ushr-long v10, v0, v9

    long-to-int v11, v10

    and-int/lit8 v10, v11, 0x7

    aget-wide v12, p0, v10

    ushr-int/lit8 v10, v11, 0x3

    and-int/2addr v10, v4

    aget-wide v10, p0, v10

    shl-long/2addr v10, v6

    xor-long/2addr v10, v12

    shl-long v12, v10, v9

    xor-long/2addr v2, v12

    neg-int v12, v9

    ushr-long/2addr v10, v12

    xor-long/2addr v7, v10

    add-int/lit8 v9, v9, -0x6

    if-gtz v9, :cond_0

    aget-wide v0, p5, p6

    const-wide v9, 0x7ffffffffffffffL

    and-long/2addr v9, v2

    xor-long/2addr v0, v9

    aput-wide v0, p5, p6

    add-int/lit8 v0, p6, 0x1

    aget-wide v9, p5, v0

    const/16 v1, 0x3b

    ushr-long v1, v2, v1

    shl-long v3, v7, v5

    xor-long/2addr v1, v3

    xor-long/2addr v1, v9

    aput-wide v1, p5, v0

    return-void
.end method

.method public static implSquare([J[J)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x4

    .line 0
    invoke-static {p0, v0, v1, p1, v0}, Lorg/bouncycastle/math/raw/Interleave;->expand64To128([JII[JI)V

    return-void
.end method

.method public static invert([J[J)V
    .locals 3

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/math/raw/Nat256;->isZero64([J)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lorg/bouncycastle/math/raw/Nat256;->create64()[J

    move-result-object v0

    invoke-static {}, Lorg/bouncycastle/math/raw/Nat256;->create64()[J

    move-result-object v1

    invoke-static {p0, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->square([J[J)V

    invoke-static {v0, p0, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    invoke-static {v0, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->square([J[J)V

    invoke-static {v0, p0, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    const/4 v2, 0x3

    invoke-static {v0, v2, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->squareN([JI[J)V

    invoke-static {v1, v0, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    invoke-static {v1, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->square([J[J)V

    invoke-static {v1, p0, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    const/4 v2, 0x7

    invoke-static {v1, v2, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->squareN([JI[J)V

    invoke-static {v0, v1, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    const/16 v2, 0xe

    invoke-static {v0, v2, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->squareN([JI[J)V

    invoke-static {v1, v0, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    invoke-static {v1, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->square([J[J)V

    invoke-static {v1, p0, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    const/16 p0, 0x1d

    invoke-static {v1, p0, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->squareN([JI[J)V

    invoke-static {v0, v1, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    const/16 p0, 0x3a

    invoke-static {v0, p0, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->squareN([JI[J)V

    invoke-static {v1, v0, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    const/16 p0, 0x74

    invoke-static {v1, p0, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->squareN([JI[J)V

    invoke-static {v0, v1, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->multiply([J[J[J)V

    invoke-static {v0, p1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->square([J[J)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method public static multiply([J[J[J)V
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/raw/Nat256;->createExt64()[J

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMultiply([J[J[J)V

    invoke-static {v0, p2}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->reduce([J[J)V

    return-void
.end method

.method public static multiplyAddToExt([J[J[J)V
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/raw/Nat256;->createExt64()[J

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implMultiply([J[J[J)V

    invoke-static {p2, v0, p2}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->addExt([J[J[J)V

    return-void
.end method

.method public static reduce([J[J)V
    .locals 27

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    const/4 v3, 0x1

    aget-wide v4, p0, v3

    const/4 v6, 0x2

    aget-wide v7, p0, v6

    const/4 v9, 0x3

    aget-wide v10, p0, v9

    const/4 v12, 0x4

    aget-wide v12, p0, v12

    const/4 v14, 0x5

    aget-wide v14, p0, v14

    const/16 v16, 0x6

    aget-wide v16, p0, v16

    const/16 v18, 0x7

    aget-wide v18, p0, v18

    const/16 v20, 0x17

    shl-long v21, v18, v20

    xor-long v10, v10, v21

    const/16 v21, 0x29

    ushr-long v22, v18, v21

    const/16 v24, 0x21

    shl-long v25, v18, v24

    xor-long v22, v22, v25

    xor-long v12, v12, v22

    const/16 v22, 0x1f

    ushr-long v18, v18, v22

    xor-long v14, v14, v18

    shl-long v18, v16, v20

    xor-long v7, v7, v18

    ushr-long v18, v16, v21

    shl-long v25, v16, v24

    xor-long v18, v18, v25

    xor-long v10, v10, v18

    ushr-long v16, v16, v22

    xor-long v12, v12, v16

    shl-long v16, v14, v20

    xor-long v4, v4, v16

    ushr-long v16, v14, v21

    shl-long v18, v14, v24

    xor-long v16, v16, v18

    xor-long v7, v7, v16

    ushr-long v14, v14, v22

    xor-long/2addr v10, v14

    shl-long v14, v12, v20

    xor-long/2addr v1, v14

    ushr-long v14, v12, v21

    shl-long v16, v12, v24

    xor-long v14, v14, v16

    xor-long/2addr v4, v14

    ushr-long v12, v12, v22

    xor-long/2addr v7, v12

    ushr-long v12, v10, v21

    xor-long/2addr v1, v12

    aput-wide v1, p1, v0

    const/16 v0, 0xa

    shl-long v0, v12, v0

    xor-long/2addr v0, v4

    aput-wide v0, p1, v3

    aput-wide v7, p1, v6

    const-wide v0, 0x1ffffffffffL

    and-long/2addr v0, v10

    aput-wide v0, p1, v9

    return-void
.end method

.method public static reduce23([JI)V
    .locals 8

    add-int/lit8 v0, p1, 0x3

    .line 0
    aget-wide v1, p0, v0

    const/16 v3, 0x29

    ushr-long v3, v1, v3

    aget-wide v5, p0, p1

    xor-long/2addr v5, v3

    aput-wide v5, p0, p1

    add-int/lit8 p1, p1, 0x1

    aget-wide v5, p0, p1

    const/16 v7, 0xa

    shl-long/2addr v3, v7

    xor-long/2addr v3, v5

    aput-wide v3, p0, p1

    const-wide v3, 0x1ffffffffffL

    and-long/2addr v1, v3

    aput-wide v1, p0, v0

    return-void
.end method

.method public static sqrt([J[J)V
    .locals 24

    move-object/from16 v0, p1

    const/4 v1, 0x0

    .line 0
    aget-wide v1, p0, v1

    invoke-static {v1, v2}, Lorg/bouncycastle/math/raw/Interleave;->unshuffle(J)J

    move-result-wide v1

    const/4 v3, 0x1

    aget-wide v3, p0, v3

    invoke-static {v3, v4}, Lorg/bouncycastle/math/raw/Interleave;->unshuffle(J)J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long v7, v1, v5

    const/16 v9, 0x20

    shl-long v10, v3, v9

    or-long/2addr v7, v10

    ushr-long/2addr v1, v9

    const-wide v10, -0x100000000L

    and-long/2addr v3, v10

    or-long/2addr v1, v3

    const/4 v3, 0x2

    aget-wide v3, p0, v3

    invoke-static {v3, v4}, Lorg/bouncycastle/math/raw/Interleave;->unshuffle(J)J

    move-result-wide v3

    const/4 v12, 0x3

    aget-wide v13, p0, v12

    invoke-static {v13, v14}, Lorg/bouncycastle/math/raw/Interleave;->unshuffle(J)J

    move-result-wide v13

    and-long/2addr v5, v3

    shl-long v15, v13, v9

    or-long/2addr v5, v15

    ushr-long/2addr v3, v9

    and-long/2addr v10, v13

    or-long/2addr v3, v10

    const/16 v10, 0x1b

    ushr-long v13, v3, v10

    ushr-long v10, v1, v10

    const/16 v15, 0x25

    shl-long v16, v3, v15

    or-long v10, v10, v16

    xor-long/2addr v3, v10

    shl-long v10, v1, v15

    xor-long/2addr v1, v10

    invoke-static {}, Lorg/bouncycastle/math/raw/Nat256;->createExt64()[J

    move-result-object v10

    const/16 v11, 0x75

    const/16 v15, 0xbf

    filled-new-array {v9, v11, v15}, [I

    move-result-object v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v12, :cond_0

    aget v15, v9, v11

    ushr-int/lit8 v16, v15, 0x6

    and-int/lit8 v15, v15, 0x3f

    aget-wide v17, v10, v16

    shl-long v19, v1, v15

    xor-long v17, v17, v19

    aput-wide v17, v10, v16

    add-int/lit8 v17, v16, 0x1

    aget-wide v18, v10, v17

    shl-long v20, v3, v15

    neg-int v12, v15

    ushr-long v22, v1, v12

    or-long v20, v20, v22

    xor-long v18, v18, v20

    aput-wide v18, v10, v17

    add-int/lit8 v17, v16, 0x2

    aget-wide v18, v10, v17

    shl-long v20, v13, v15

    ushr-long v22, v3, v12

    or-long v20, v20, v22

    xor-long v18, v18, v20

    aput-wide v18, v10, v17

    add-int/lit8 v16, v16, 0x3

    aget-wide v17, v10, v16

    ushr-long v19, v13, v12

    xor-long v17, v17, v19

    aput-wide v17, v10, v16

    add-int/lit8 v11, v11, 0x1

    const/4 v12, 0x3

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-static {v10, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->reduce([J[J)V

    const/4 v2, 0x0

    aget-wide v3, v0, v2

    xor-long/2addr v3, v7

    aput-wide v3, v0, v2

    aget-wide v2, v0, v1

    xor-long/2addr v2, v5

    aput-wide v2, v0, v1

    return-void
.end method

.method public static square([J[J)V
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/raw/Nat256;->createExt64()[J

    move-result-object v0

    invoke-static {p0, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implSquare([J[J)V

    invoke-static {v0, p1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->reduce([J[J)V

    return-void
.end method

.method public static squareAddToExt([J[J)V
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/raw/Nat256;->createExt64()[J

    move-result-object v0

    invoke-static {p0, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implSquare([J[J)V

    invoke-static {p1, v0, p1}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->addExt([J[J[J)V

    return-void
.end method

.method public static squareN([JI[J)V
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/raw/Nat256;->createExt64()[J

    move-result-object v0

    invoke-static {p0, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implSquare([J[J)V

    :goto_0
    invoke-static {v0, p2}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->reduce([J[J)V

    add-int/lit8 p1, p1, -0x1

    if-lez p1, :cond_0

    invoke-static {p2, v0}, Lorg/bouncycastle/math/ec/custom/sec/SecT233Field;->implSquare([J[J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static trace([J)I
    .locals 4

    const/4 v0, 0x0

    .line 0
    aget-wide v0, p0, v0

    const/4 v2, 0x2

    aget-wide v2, p0, v2

    const/16 p0, 0x1f

    ushr-long/2addr v2, p0

    xor-long/2addr v0, v2

    long-to-int p0, v0

    and-int/lit8 p0, p0, 0x1

    return p0
.end method
