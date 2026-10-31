.class public Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;
.super Ljava/lang/Object;


# instance fields
.field public final PARAM_N:I

.field public final RED_MASK:J

.field public final VEC_N_SIZE_64:I


# direct methods
.method public constructor <init>(IIJ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->VEC_N_SIZE_64:I

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->PARAM_N:I

    iput-wide p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->RED_MASK:J

    return-void
.end method

.method private karatsuba([JI[JI[JII[JI)V
    .locals 25

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p7

    move-object/from16 v12, p8

    move/from16 v13, p9

    const/16 v3, 0x10

    if-gt v2, v3, :cond_0

    .line 0
    invoke-direct/range {p0 .. p7}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->schoolbookMul([JI[JI[JII)V

    return-void

    :cond_0
    shr-int/lit8 v14, v2, 0x1

    sub-int v15, v2, v14

    shl-int/lit8 v3, v2, 0x1

    shl-int/lit8 v11, v14, 0x1

    shl-int/lit8 v10, v15, 0x1

    add-int v9, v13, v3

    add-int v16, v9, v3

    add-int v17, v16, v3

    add-int v18, v17, v2

    shl-int/lit8 v2, v2, 0x3

    add-int v19, v13, v2

    move-object/from16 v2, p0

    move-object/from16 v3, p8

    move/from16 v4, p9

    move-object/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move/from16 p7, v9

    move v9, v14

    move/from16 v20, v10

    move-object/from16 v10, p8

    move v0, v11

    move/from16 v11, v19

    invoke-direct/range {v2 .. v11}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->karatsuba([JI[JI[JII[JI)V

    add-int v21, p4, v14

    add-int v22, p6, v14

    move/from16 v4, p7

    move/from16 v6, v21

    move/from16 v8, v22

    move v9, v15

    invoke-direct/range {v2 .. v11}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->karatsuba([JI[JI[JII[JI)V

    const/4 v2, 0x0

    :goto_0
    const-wide/16 v23, 0x0

    if-ge v2, v15, :cond_3

    if-ge v2, v14, :cond_1

    add-int v3, p4, v2

    aget-wide v3, p3, v3

    goto :goto_1

    :cond_1
    move-wide/from16 v3, v23

    :goto_1
    if-ge v2, v14, :cond_2

    add-int v5, p6, v2

    aget-wide v23, p5, v5

    :cond_2
    add-int v5, v17, v2

    add-int v6, v21, v2

    aget-wide v6, p3, v6

    xor-long/2addr v3, v6

    aput-wide v3, v12, v5

    add-int v3, v18, v2

    add-int v4, v22, v2

    aget-wide v4, p5, v4

    xor-long v4, v23, v4

    aput-wide v4, v12, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    move-object/from16 v2, p0

    move-object/from16 v3, p8

    move/from16 v4, v16

    move-object/from16 v5, p8

    move/from16 v6, v17

    move-object/from16 v7, p8

    move/from16 v8, v18

    move v9, v15

    move-object/from16 v10, p8

    move/from16 v11, v19

    invoke-direct/range {v2 .. v11}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->karatsuba([JI[JI[JII[JI)V

    move v2, v0

    move-object/from16 v0, p1

    invoke-static {v12, v13, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int v3, v1, v2

    move/from16 v5, p7

    move/from16 v4, v20

    invoke-static {v12, v5, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v3, 0x0

    :goto_2
    mul-int/lit8 v6, v15, 0x2

    if-ge v3, v6, :cond_6

    if-ge v3, v2, :cond_4

    add-int v6, v13, v3

    aget-wide v6, v12, v6

    goto :goto_3

    :cond_4
    move-wide/from16 v6, v23

    :goto_3
    if-ge v3, v4, :cond_5

    add-int v9, v5, v3

    aget-wide v8, v12, v9

    goto :goto_4

    :cond_5
    move-wide/from16 v8, v23

    :goto_4
    add-int v10, v1, v14

    add-int/2addr v10, v3

    aget-wide v17, v0, v10

    add-int v11, v16, v3

    aget-wide v19, v12, v11

    xor-long v6, v19, v6

    xor-long/2addr v6, v8

    xor-long v6, v17, v6

    aput-wide v6, v0, v10

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method private reduce([J[J)V
    .locals 10

    const/4 v0, 0x0

    .line 0
    :goto_0
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->VEC_N_SIZE_64:I

    if-ge v0, v1, :cond_0

    aget-wide v2, p2, v0

    add-int v4, v0, v1

    add-int/lit8 v4, v4, -0x1

    aget-wide v4, p2, v4

    iget v6, p0, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->PARAM_N:I

    and-int/lit8 v7, v6, 0x3f

    ushr-long/2addr v4, v7

    xor-long/2addr v2, v4

    add-int/2addr v1, v0

    aget-wide v4, p2, v1

    int-to-long v6, v6

    const-wide/16 v8, 0x3f

    and-long/2addr v6, v8

    const-wide/16 v8, 0x40

    sub-long/2addr v8, v6

    long-to-int v1, v8

    shl-long/2addr v4, v1

    xor-long v1, v2, v4

    aput-wide v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, -0x1

    aget-wide v2, p1, v1

    iget-wide v4, p0, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->RED_MASK:J

    and-long/2addr v2, v4

    aput-wide v2, p1, v1

    return-void
.end method

.method private schoolbookMul([JI[JI[JII)V
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p7

    shl-int/lit8 v3, v2, 0x1

    add-int/2addr v3, v1

    const-wide/16 v4, 0x0

    .line 0
    invoke-static {v0, v1, v3, v4, v5}, Lorg/bouncycastle/util/Arrays;->fill([JIIJ)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    add-int v4, v3, p4

    aget-wide v4, p3, v4

    const/4 v6, 0x0

    :goto_1
    const/16 v7, 0x40

    if-ge v6, v7, :cond_2

    shr-long v7, v4, v6

    const-wide/16 v9, 0x1

    and-long/2addr v7, v9

    neg-long v7, v7

    if-nez v6, :cond_0

    const/4 v9, 0x0

    move/from16 v11, p6

    move v10, v1

    :goto_2
    if-ge v9, v2, :cond_1

    aget-wide v12, v0, v10

    aget-wide v14, p5, v11

    and-long/2addr v14, v7

    xor-long/2addr v12, v14

    aput-wide v12, v0, v10

    add-int/lit8 v9, v9, 0x1

    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_0
    rsub-int/lit8 v9, v6, 0x40

    const/4 v10, 0x0

    move/from16 v12, p6

    move v11, v1

    :goto_3
    if-ge v10, v2, :cond_1

    add-int/lit8 v13, v11, 0x1

    aget-wide v14, v0, v11

    aget-wide v16, p5, v12

    shl-long v16, v16, v6

    and-long v16, v16, v7

    xor-long v14, v14, v16

    aput-wide v14, v0, v11

    aget-wide v14, v0, v13

    aget-wide v16, p5, v12

    ushr-long v16, v16, v9

    and-long v16, v16, v7

    xor-long v14, v14, v16

    aput-wide v14, v0, v13

    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v12, v12, 0x1

    move v11, v13

    goto :goto_3

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public vectMul([J[J[J)V
    .locals 11

    .line 0
    iget v7, p0, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->VEC_N_SIZE_64:I

    shl-int/lit8 v0, v7, 0x1

    new-array v10, v0, [J

    shl-int/lit8 v0, v7, 0x4

    new-array v8, v0, [J

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, v10

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v9}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->karatsuba([JI[JI[JII[JI)V

    invoke-direct {p0, p1, v10}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->reduce([J[J)V

    return-void
.end method
