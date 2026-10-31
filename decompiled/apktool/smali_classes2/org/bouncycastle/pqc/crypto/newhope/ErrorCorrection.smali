.class public Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static LDDecode(IIII)S
    .locals 0

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->g(I)I

    move-result p0

    invoke-static {p1}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->g(I)I

    move-result p1

    add-int/2addr p0, p1

    invoke-static {p2}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->g(I)I

    move-result p1

    add-int/2addr p0, p1

    invoke-static {p3}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->g(I)I

    move-result p1

    add-int/2addr p0, p1

    const p1, 0x18008

    sub-int/2addr p0, p1

    ushr-int/lit8 p0, p0, 0x1f

    int-to-short p0, p0

    return p0
.end method

.method public static abs(I)I
    .locals 1

    shr-int/lit8 v0, p0, 0x1f

    xor-int/2addr p0, v0

    sub-int/2addr p0, v0

    return p0
.end method

.method public static f([IIII)I
    .locals 3

    mul-int/lit16 v0, p3, 0xaaa

    shr-int/lit8 v0, v0, 0x19

    mul-int/lit16 v1, v0, 0x3001

    sub-int v1, p3, v1

    rsub-int v1, v1, 0x3000

    shr-int/lit8 v1, v1, 0x1f

    sub-int/2addr v0, v1

    and-int/lit8 v1, v0, 0x1

    shr-int/lit8 v2, v0, 0x1

    add-int/2addr v2, v1

    .line 0
    aput v2, p0, p1

    add-int/lit8 v0, v0, -0x1

    and-int/lit8 v1, v0, 0x1

    shr-int/lit8 v0, v0, 0x1

    add-int/2addr v0, v1

    aput v0, p0, p2

    aget p0, p0, p1

    mul-int/lit16 p0, p0, 0x6002

    sub-int/2addr p3, p0

    invoke-static {p3}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->abs(I)I

    move-result p0

    return p0
.end method

.method public static g(I)I
    .locals 3

    mul-int/lit16 v0, p0, 0xaaa

    shr-int/lit8 v0, v0, 0x1b

    const v1, 0xc004

    mul-int v1, v1, v0

    sub-int v1, p0, v1

    const v2, 0xc003

    sub-int/2addr v2, v1

    shr-int/lit8 v1, v2, 0x1f

    sub-int/2addr v0, v1

    and-int/lit8 v1, v0, 0x1

    shr-int/lit8 v0, v0, 0x1

    add-int/2addr v0, v1

    const v1, 0x18008

    mul-int v0, v0, v1

    sub-int/2addr v0, p0

    .line 0
    invoke-static {v0}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->abs(I)I

    move-result p0

    return p0
.end method

.method public static helpRec([S[S[BB)V
    .locals 17

    const/16 v0, 0x8

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p3, v1, v2

    const/16 v3, 0x20

    new-array v4, v3, [B

    move-object/from16 v5, p2

    .line 0
    invoke-static {v5, v1, v4, v2, v3}, Lorg/bouncycastle/pqc/crypto/newhope/ChaCha20;->process([B[B[BII)V

    new-array v0, v0, [I

    const/4 v1, 0x0

    :goto_0
    const/16 v3, 0x100

    if-ge v1, v3, :cond_0

    ushr-int/lit8 v3, v1, 0x3

    aget-byte v3, v4, v3

    and-int/lit8 v5, v1, 0x7

    ushr-int/2addr v3, v5

    const/4 v5, 0x1

    and-int/2addr v3, v5

    aget-short v6, p1, v1

    mul-int/lit8 v6, v6, 0x8

    const/4 v7, 0x4

    mul-int/lit8 v3, v3, 0x4

    add-int/2addr v6, v3

    invoke-static {v0, v2, v7, v6}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->f([IIII)I

    move-result v6

    add-int/lit16 v8, v1, 0x100

    aget-short v9, p1, v8

    mul-int/lit8 v9, v9, 0x8

    add-int/2addr v9, v3

    const/4 v10, 0x5

    invoke-static {v0, v5, v10, v9}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->f([IIII)I

    move-result v9

    add-int/2addr v6, v9

    add-int/lit16 v9, v1, 0x200

    aget-short v11, p1, v9

    mul-int/lit8 v11, v11, 0x8

    add-int/2addr v11, v3

    const/4 v12, 0x2

    const/4 v13, 0x6

    invoke-static {v0, v12, v13, v11}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->f([IIII)I

    move-result v11

    add-int/2addr v6, v11

    add-int/lit16 v11, v1, 0x300

    aget-short v14, p1, v11

    mul-int/lit8 v14, v14, 0x8

    add-int/2addr v14, v3

    const/4 v3, 0x3

    const/4 v15, 0x7

    invoke-static {v0, v3, v15, v14}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->f([IIII)I

    move-result v14

    add-int/2addr v6, v14

    rsub-int v6, v6, 0x6001

    shr-int/lit8 v6, v6, 0x1f

    not-int v14, v6

    aget v16, v0, v2

    and-int v16, v14, v16

    aget v7, v0, v7

    and-int/2addr v7, v6

    xor-int v7, v16, v7

    aget v16, v0, v5

    and-int v16, v14, v16

    aget v10, v0, v10

    and-int/2addr v10, v6

    xor-int v10, v16, v10

    aget v16, v0, v12

    and-int v16, v14, v16

    aget v13, v0, v13

    and-int/2addr v13, v6

    xor-int v13, v16, v13

    aget v16, v0, v3

    and-int v14, v14, v16

    aget v15, v0, v15

    and-int/2addr v15, v6

    xor-int/2addr v14, v15

    filled-new-array {v7, v10, v13, v14}, [I

    move-result-object v7

    aget v10, v7, v2

    aget v13, v7, v3

    sub-int/2addr v10, v13

    and-int/2addr v10, v3

    int-to-short v10, v10

    aput-short v10, p0, v1

    aget v5, v7, v5

    sub-int/2addr v5, v13

    and-int/2addr v5, v3

    int-to-short v5, v5

    aput-short v5, p0, v8

    aget v5, v7, v12

    sub-int/2addr v5, v13

    and-int/2addr v3, v5

    int-to-short v3, v3

    aput-short v3, p0, v9

    neg-int v3, v6

    mul-int/lit8 v13, v13, 0x2

    add-int/2addr v13, v3

    and-int/lit8 v3, v13, 0x3

    int-to-short v3, v3

    aput-short v3, p0, v11

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_0
    return-void
.end method

.method public static rec([B[S[S)V
    .locals 10

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x100

    if-ge v1, v2, :cond_0

    aget-short v2, p1, v1

    mul-int/lit8 v2, v2, 0x8

    const v3, 0x30010

    add-int/2addr v2, v3

    aget-short v4, p2, v1

    const/4 v5, 0x2

    mul-int/lit8 v4, v4, 0x2

    add-int/lit16 v6, v1, 0x300

    aget-short v7, p2, v6

    add-int/2addr v4, v7

    mul-int/lit16 v4, v4, 0x3001

    sub-int/2addr v2, v4

    add-int/lit16 v4, v1, 0x100

    aget-short v8, p1, v4

    mul-int/lit8 v8, v8, 0x8

    add-int/2addr v8, v3

    aget-short v4, p2, v4

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v7

    mul-int/lit16 v4, v4, 0x3001

    sub-int/2addr v8, v4

    add-int/lit16 v4, v1, 0x200

    aget-short v9, p1, v4

    mul-int/lit8 v9, v9, 0x8

    add-int/2addr v9, v3

    aget-short v4, p2, v4

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v7

    mul-int/lit16 v4, v4, 0x3001

    sub-int/2addr v9, v4

    aget-short v4, p1, v6

    mul-int/lit8 v4, v4, 0x8

    add-int/2addr v4, v3

    mul-int/lit16 v7, v7, 0x3001

    sub-int/2addr v4, v7

    filled-new-array {v2, v8, v9, v4}, [I

    move-result-object v2

    ushr-int/lit8 v3, v1, 0x3

    aget-byte v4, p0, v3

    aget v6, v2, v0

    const/4 v7, 0x1

    aget v7, v2, v7

    aget v5, v2, v5

    const/4 v8, 0x3

    aget v2, v2, v8

    invoke-static {v6, v7, v5, v2}, Lorg/bouncycastle/pqc/crypto/newhope/ErrorCorrection;->LDDecode(IIII)S

    move-result v2

    and-int/lit8 v5, v1, 0x7

    shl-int/2addr v2, v5

    or-int/2addr v2, v4

    int-to-byte v2, v2

    aput-byte v2, p0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
