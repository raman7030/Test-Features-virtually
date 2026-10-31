.class public Lorg/bouncycastle/pqc/math/ntru/HRSSPolynomial;
.super Lorg/bouncycastle/pqc/math/ntru/Polynomial;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUHRSSParameterSet;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;-><init>(Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;)V

    return-void
.end method


# virtual methods
.method public lift(Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 14

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v1

    rem-int/lit8 v2, v0, 0x3

    const/4 v3, 0x3

    rsub-int/lit8 v2, v2, 0x3

    int-to-short v2, v2

    iget-object v4, v1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    iget-object v5, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    const/4 v6, 0x0

    aget-short v7, v5, v6

    rsub-int/lit8 v8, v2, 0x2

    mul-int v7, v7, v8

    const/4 v9, 0x1

    aget-short v10, v5, v9

    const/4 v11, 0x2

    aget-short v5, v5, v11

    mul-int v12, v5, v2

    add-int/2addr v12, v7

    int-to-short v7, v12

    aput-short v7, v4, v6

    mul-int v10, v10, v8

    int-to-short v7, v10

    aput-short v7, v4, v9

    mul-int v5, v5, v8

    int-to-short v5, v5

    aput-short v5, v4, v11

    const/4 v4, 0x3

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_0

    iget-object v7, v1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v8, v7, v6

    iget-object v10, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v12, v10, v4

    mul-int/lit8 v13, v2, 0x2

    add-int/2addr v13, v5

    mul-int v13, v13, v12

    add-int/2addr v13, v8

    int-to-short v8, v13

    aput-short v8, v7, v6

    aget-short v8, v7, v9

    aget-short v12, v10, v4

    add-int v13, v5, v2

    mul-int v12, v12, v13

    add-int/2addr v12, v8

    int-to-short v8, v12

    aput-short v8, v7, v9

    aget-short v8, v7, v11

    aget-short v10, v10, v4

    mul-int v10, v10, v5

    add-int/2addr v10, v8

    int-to-short v5, v10

    aput-short v5, v7, v11

    rem-int/2addr v13, v3

    int-to-short v5, v13

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-object v4, v1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v4, v9

    iget-object v8, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v10, v8, v6

    add-int/2addr v2, v5

    mul-int v12, v10, v2

    add-int/2addr v12, v7

    int-to-short v7, v12

    aput-short v7, v4, v9

    aget-short v7, v4, v11

    mul-int v10, v10, v5

    add-int/2addr v10, v7

    int-to-short v5, v10

    aput-short v5, v4, v11

    aget-short v7, v8, v9

    mul-int v7, v7, v2

    add-int/2addr v7, v5

    int-to-short v2, v7

    aput-short v2, v4, v11

    :goto_1
    if-ge v3, v0, :cond_1

    iget-object v2, v1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v4, v3, -0x3

    aget-short v4, v2, v4

    iget-object v5, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v5, v3

    add-int/lit8 v8, v3, -0x1

    aget-short v8, v5, v8

    add-int/2addr v7, v8

    add-int/lit8 v8, v3, -0x2

    aget-short v5, v5, v8

    invoke-static {v7, v5, v11, v4}, Ll/᩶ۢᩴ;->֫(IIII)I

    move-result v4

    int-to-short v4, v4

    aput-short v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3PhiN()V

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->z3ToZq()V

    iget-object p1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    iget-object v2, v1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v2, v2, v6

    neg-int v2, v2

    int-to-short v2, v2

    aput-short v2, p1, v6

    :goto_2
    add-int/lit8 p1, v0, -0x1

    if-ge v6, p1, :cond_2

    iget-object p1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v2, v6, 0x1

    iget-object v3, v1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v4, v3, v6

    aget-short v3, v3, v2

    sub-int/2addr v4, v3

    int-to-short v3, v4

    aput-short v3, p1, v2

    move v6, v2

    goto :goto_2

    :cond_2
    return-void
.end method

.method public sqFromBytes([B)V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 0
    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v2

    div-int/lit8 v2, v2, 0x8

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    mul-int/lit8 v5, v1, 0x8

    mul-int/lit8 v6, v1, 0xd

    aget-byte v7, p1, v6

    and-int/lit16 v7, v7, 0xff

    add-int/lit8 v8, v6, 0x1

    aget-byte v8, p1, v8

    and-int/lit16 v9, v8, 0xff

    int-to-short v9, v9

    and-int/lit8 v9, v9, 0x1f

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v7, v9

    int-to-short v7, v7

    aput-short v7, v2, v5

    add-int/lit8 v7, v5, 0x1

    and-int/lit16 v8, v8, 0xff

    ushr-int/lit8 v8, v8, 0x5

    add-int/lit8 v9, v6, 0x2

    aget-byte v9, p1, v9

    and-int/lit16 v9, v9, 0xff

    int-to-short v9, v9

    shl-int/lit8 v9, v9, 0x3

    or-int/2addr v8, v9

    add-int/lit8 v9, v6, 0x3

    aget-byte v9, p1, v9

    and-int/lit16 v10, v9, 0xff

    int-to-short v10, v10

    and-int/lit8 v10, v10, 0x3

    shl-int/lit8 v10, v10, 0xb

    or-int/2addr v8, v10

    int-to-short v8, v8

    aput-short v8, v2, v7

    add-int/lit8 v7, v5, 0x2

    and-int/lit16 v8, v9, 0xff

    ushr-int/lit8 v4, v8, 0x2

    add-int/lit8 v8, v6, 0x4

    aget-byte v8, p1, v8

    and-int/lit16 v9, v8, 0xff

    int-to-short v9, v9

    and-int/lit8 v9, v9, 0x7f

    shl-int/lit8 v9, v9, 0x6

    or-int/2addr v4, v9

    int-to-short v4, v4

    aput-short v4, v2, v7

    add-int/lit8 v4, v5, 0x3

    and-int/lit16 v7, v8, 0xff

    ushr-int/lit8 v7, v7, 0x7

    add-int/lit8 v8, v6, 0x5

    aget-byte v8, p1, v8

    and-int/lit16 v8, v8, 0xff

    int-to-short v8, v8

    shl-int/lit8 v8, v8, 0x1

    or-int/2addr v7, v8

    add-int/lit8 v8, v6, 0x6

    aget-byte v8, p1, v8

    and-int/lit16 v9, v8, 0xff

    int-to-short v9, v9

    and-int/lit8 v9, v9, 0xf

    shl-int/lit8 v9, v9, 0x9

    or-int/2addr v7, v9

    int-to-short v7, v7

    aput-short v7, v2, v4

    add-int/lit8 v4, v5, 0x4

    and-int/lit16 v7, v8, 0xff

    ushr-int/lit8 v3, v7, 0x4

    add-int/lit8 v7, v6, 0x7

    aget-byte v7, p1, v7

    and-int/lit16 v7, v7, 0xff

    int-to-short v7, v7

    shl-int/lit8 v7, v7, 0x4

    or-int/2addr v3, v7

    add-int/lit8 v7, v6, 0x8

    aget-byte v7, p1, v7

    and-int/lit16 v8, v7, 0xff

    int-to-short v8, v8

    and-int/lit8 v8, v8, 0x1

    shl-int/lit8 v8, v8, 0xc

    or-int/2addr v3, v8

    int-to-short v3, v3

    aput-short v3, v2, v4

    add-int/lit8 v3, v5, 0x5

    and-int/lit16 v4, v7, 0xff

    ushr-int/lit8 v4, v4, 0x1

    add-int/lit8 v7, v6, 0x9

    aget-byte v7, p1, v7

    and-int/lit16 v8, v7, 0xff

    int-to-short v8, v8

    and-int/lit8 v8, v8, 0x3f

    shl-int/lit8 v8, v8, 0x7

    or-int/2addr v4, v8

    int-to-short v4, v4

    aput-short v4, v2, v3

    add-int/lit8 v3, v5, 0x6

    and-int/lit16 v4, v7, 0xff

    ushr-int/lit8 v4, v4, 0x6

    add-int/lit8 v7, v6, 0xa

    aget-byte v7, p1, v7

    and-int/lit16 v7, v7, 0xff

    int-to-short v7, v7

    shl-int/lit8 v7, v7, 0x2

    or-int/2addr v4, v7

    add-int/lit8 v7, v6, 0xb

    aget-byte v7, p1, v7

    and-int/lit16 v8, v7, 0xff

    int-to-short v8, v8

    and-int/lit8 v8, v8, 0x7

    shl-int/lit8 v8, v8, 0xa

    or-int/2addr v4, v8

    int-to-short v4, v4

    aput-short v4, v2, v3

    add-int/lit8 v5, v5, 0x7

    and-int/lit16 v3, v7, 0xff

    ushr-int/lit8 v3, v3, 0x3

    add-int/lit8 v6, v6, 0xc

    aget-byte v4, p1, v6

    and-int/lit16 v4, v4, 0xff

    int-to-short v4, v4

    shl-int/lit8 v4, v4, 0x5

    or-int/2addr v3, v4

    int-to-short v3, v3

    aput-short v3, v2, v5

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v2

    and-int/lit8 v2, v2, 0x7

    if-eq v2, v4, :cond_2

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    mul-int/lit8 v3, v1, 0x8

    mul-int/lit8 v1, v1, 0xd

    aget-byte v4, p1, v1

    and-int/lit16 v4, v4, 0xff

    add-int/lit8 v5, v1, 0x1

    aget-byte v5, p1, v5

    and-int/lit16 v6, v5, 0xff

    int-to-short v6, v6

    and-int/lit8 v6, v6, 0x1f

    shl-int/lit8 v6, v6, 0x8

    or-int/2addr v4, v6

    int-to-short v4, v4

    aput-short v4, v2, v3

    add-int/lit8 v4, v3, 0x1

    and-int/lit16 v5, v5, 0xff

    ushr-int/lit8 v5, v5, 0x5

    add-int/lit8 v6, v1, 0x2

    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    int-to-short v6, v6

    shl-int/lit8 v6, v6, 0x3

    or-int/2addr v5, v6

    add-int/lit8 v6, v1, 0x3

    aget-byte v6, p1, v6

    and-int/lit16 v7, v6, 0xff

    int-to-short v7, v7

    and-int/lit8 v7, v7, 0x3

    shl-int/lit8 v7, v7, 0xb

    or-int/2addr v5, v7

    int-to-short v5, v5

    aput-short v5, v2, v4

    add-int/lit8 v4, v3, 0x2

    and-int/lit16 v5, v6, 0xff

    ushr-int/lit8 v5, v5, 0x2

    add-int/lit8 v6, v1, 0x4

    aget-byte v6, p1, v6

    and-int/lit16 v7, v6, 0xff

    int-to-short v7, v7

    and-int/lit8 v7, v7, 0x7f

    shl-int/lit8 v7, v7, 0x6

    or-int/2addr v5, v7

    int-to-short v5, v5

    aput-short v5, v2, v4

    add-int/lit8 v3, v3, 0x3

    and-int/lit16 v4, v6, 0xff

    ushr-int/lit8 v4, v4, 0x7

    add-int/lit8 v5, v1, 0x5

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    int-to-short v5, v5

    shl-int/lit8 v5, v5, 0x1

    or-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x6

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    int-to-short p1, p1

    and-int/lit8 p1, p1, 0xf

    shl-int/lit8 p1, p1, 0x9

    or-int/2addr p1, v4

    int-to-short p1, p1

    aput-short p1, v2, v3

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    mul-int/lit8 v3, v1, 0x8

    mul-int/lit8 v1, v1, 0xd

    aget-byte v4, p1, v1

    and-int/lit16 v4, v4, 0xff

    add-int/lit8 v5, v1, 0x1

    aget-byte v5, p1, v5

    and-int/lit16 v6, v5, 0xff

    int-to-short v6, v6

    and-int/lit8 v6, v6, 0x1f

    shl-int/lit8 v6, v6, 0x8

    or-int/2addr v4, v6

    int-to-short v4, v4

    aput-short v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    and-int/lit16 v4, v5, 0xff

    ushr-int/lit8 v4, v4, 0x5

    add-int/lit8 v5, v1, 0x2

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    int-to-short v5, v5

    shl-int/lit8 v5, v5, 0x3

    or-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x3

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    int-to-short p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0xb

    or-int/2addr p1, v4

    int-to-short p1, p1

    aput-short p1, v2, v3

    :goto_1
    iget-object p1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    iget-object v1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->n()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aput-short v0, p1, v1

    return-void
.end method

.method public sqToBytes(I)[B
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 0
    new-array v1, v1, [B

    const/16 v2, 0x8

    new-array v3, v2, [S

    const/4 v4, 0x0

    :goto_0
    iget-object v5, v0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v5

    div-int/2addr v5, v2

    const v6, 0xffff

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v10, 0x7

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-ge v4, v5, :cond_1

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_0

    iget-object v14, v0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    mul-int/lit8 v15, v4, 0x8

    add-int/2addr v15, v5

    aget-short v14, v14, v15

    and-int/2addr v14, v6

    iget-object v15, v0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v15}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->q()I

    move-result v15

    invoke-static {v14, v15}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->modQ(II)I

    move-result v14

    int-to-short v14, v14

    aput-short v14, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    mul-int/lit8 v6, v4, 0xd

    aget-short v5, v3, v5

    and-int/lit16 v14, v5, 0xff

    int-to-byte v14, v14

    aput-byte v14, v1, v6

    add-int/lit8 v14, v6, 0x1

    ushr-int/2addr v5, v2

    aget-short v15, v3, v13

    and-int/lit8 v16, v15, 0x7

    shl-int/lit8 v16, v16, 0x5

    or-int v5, v5, v16

    int-to-byte v5, v5

    aput-byte v5, v1, v14

    add-int/lit8 v5, v6, 0x2

    ushr-int/lit8 v14, v15, 0x3

    and-int/lit16 v14, v14, 0xff

    int-to-byte v14, v14

    aput-byte v14, v1, v5

    add-int/lit8 v5, v6, 0x3

    ushr-int/lit8 v14, v15, 0xb

    aget-short v12, v3, v12

    and-int/lit8 v15, v12, 0x3f

    shl-int/lit8 v15, v15, 0x2

    or-int/2addr v14, v15

    int-to-byte v14, v14

    aput-byte v14, v1, v5

    add-int/lit8 v5, v6, 0x4

    ushr-int/lit8 v12, v12, 0x6

    aget-short v14, v3, v11

    and-int/lit8 v15, v14, 0x1

    shl-int/2addr v15, v10

    or-int/2addr v12, v15

    int-to-byte v12, v12

    aput-byte v12, v1, v5

    add-int/lit8 v5, v6, 0x5

    ushr-int/lit8 v12, v14, 0x1

    and-int/lit16 v12, v12, 0xff

    int-to-byte v12, v12

    aput-byte v12, v1, v5

    add-int/lit8 v5, v6, 0x6

    ushr-int/lit8 v12, v14, 0x9

    aget-short v9, v3, v9

    and-int/lit8 v14, v9, 0xf

    shl-int/lit8 v14, v14, 0x4

    or-int/2addr v12, v14

    int-to-byte v12, v12

    aput-byte v12, v1, v5

    add-int/lit8 v5, v6, 0x7

    ushr-int/lit8 v12, v9, 0x4

    and-int/lit16 v12, v12, 0xff

    int-to-byte v12, v12

    aput-byte v12, v1, v5

    add-int/lit8 v5, v6, 0x8

    ushr-int/lit8 v9, v9, 0xc

    aget-short v8, v3, v8

    and-int/lit8 v12, v8, 0x7f

    shl-int/2addr v12, v13

    or-int/2addr v9, v12

    int-to-byte v9, v9

    aput-byte v9, v1, v5

    add-int/lit8 v5, v6, 0x9

    ushr-int/lit8 v8, v8, 0x7

    aget-short v7, v3, v7

    and-int/lit8 v9, v7, 0x3

    shl-int/lit8 v9, v9, 0x6

    or-int/2addr v8, v9

    int-to-byte v8, v8

    aput-byte v8, v1, v5

    add-int/lit8 v5, v6, 0xa

    ushr-int/lit8 v8, v7, 0x2

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v1, v5

    add-int/lit8 v5, v6, 0xb

    ushr-int/lit8 v7, v7, 0xa

    aget-short v8, v3, v10

    and-int/lit8 v9, v8, 0x1f

    shl-int/2addr v9, v11

    or-int/2addr v7, v9

    int-to-byte v7, v7

    aput-byte v7, v1, v5

    add-int/lit8 v6, v6, 0xc

    ushr-int/lit8 v5, v8, 0x5

    int-to-byte v5, v5

    aput-byte v5, v1, v6

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_1
    const/4 v5, 0x0

    const/4 v10, 0x0

    :goto_2
    iget-object v14, v0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v14}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v14

    mul-int/lit8 v15, v4, 0x8

    sub-int/2addr v14, v15

    if-ge v10, v14, :cond_2

    iget-object v14, v0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/2addr v15, v10

    aget-short v14, v14, v15

    and-int/2addr v14, v6

    iget-object v15, v0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v15}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->q()I

    move-result v15

    invoke-static {v14, v15}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->modQ(II)I

    move-result v14

    int-to-short v14, v14

    aput-short v14, v3, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_2
    :goto_3
    if-ge v10, v2, :cond_3

    aput-short v5, v3, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_3
    iget-object v6, v0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v6

    iget-object v10, v0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v10}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v10

    div-int/2addr v10, v2

    mul-int/lit8 v10, v10, 0x8

    sub-int/2addr v6, v10

    if-eq v6, v12, :cond_5

    if-eq v6, v9, :cond_4

    return-object v1

    :cond_4
    mul-int/lit8 v6, v4, 0xd

    aget-short v10, v3, v5

    and-int/lit16 v14, v10, 0xff

    int-to-byte v14, v14

    aput-byte v14, v1, v6

    add-int/lit8 v14, v6, 0x1

    ushr-int/lit8 v2, v10, 0x8

    aget-short v10, v3, v13

    and-int/lit8 v15, v10, 0x7

    shl-int/lit8 v15, v15, 0x5

    or-int/2addr v2, v15

    int-to-byte v2, v2

    aput-byte v2, v1, v14

    add-int/lit8 v2, v6, 0x2

    ushr-int/lit8 v14, v10, 0x3

    and-int/lit16 v14, v14, 0xff

    int-to-byte v14, v14

    aput-byte v14, v1, v2

    add-int/lit8 v2, v6, 0x3

    ushr-int/lit8 v10, v10, 0xb

    aget-short v14, v3, v12

    and-int/lit8 v15, v14, 0x3f

    shl-int/lit8 v15, v15, 0x2

    or-int/2addr v10, v15

    int-to-byte v10, v10

    aput-byte v10, v1, v2

    add-int/lit8 v2, v6, 0x4

    ushr-int/lit8 v10, v14, 0x6

    aget-short v14, v3, v11

    and-int/lit8 v15, v14, 0x1

    shl-int/lit8 v15, v15, 0x7

    or-int/2addr v10, v15

    int-to-byte v10, v10

    aput-byte v10, v1, v2

    add-int/lit8 v2, v6, 0x5

    ushr-int/lit8 v10, v14, 0x1

    and-int/lit16 v10, v10, 0xff

    int-to-byte v10, v10

    aput-byte v10, v1, v2

    add-int/2addr v6, v7

    ushr-int/lit8 v2, v14, 0x9

    aget-short v7, v3, v9

    and-int/lit8 v7, v7, 0xf

    shl-int/2addr v7, v9

    or-int/2addr v2, v7

    int-to-byte v2, v2

    aput-byte v2, v1, v6

    :cond_5
    mul-int/lit8 v4, v4, 0xd

    aget-short v2, v3, v5

    and-int/lit16 v5, v2, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v5, v4, 0x1

    ushr-int/lit8 v2, v2, 0x8

    aget-short v6, v3, v13

    and-int/lit8 v7, v6, 0x7

    shl-int/2addr v7, v8

    or-int/2addr v2, v7

    int-to-byte v2, v2

    aput-byte v2, v1, v5

    add-int/lit8 v2, v4, 0x2

    ushr-int/lit8 v5, v6, 0x3

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v2

    add-int/2addr v4, v11

    ushr-int/lit8 v2, v6, 0xb

    aget-short v3, v3, v12

    and-int/lit8 v3, v3, 0x3f

    shl-int/2addr v3, v12

    or-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v1, v4

    return-object v1
.end method
