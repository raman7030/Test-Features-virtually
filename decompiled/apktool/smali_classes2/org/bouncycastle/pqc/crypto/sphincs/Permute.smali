.class public Lorg/bouncycastle/pqc/crypto/sphincs/Permute;
.super Ljava/lang/Object;


# static fields
.field public static final CHACHA_ROUNDS:I = 0xc


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static permute(I[I)V
    .locals 31

    move-object/from16 v0, p1

    .line 0
    array-length v1, v0

    const/16 v2, 0x10

    if-ne v1, v2, :cond_2

    rem-int/lit8 v1, p0, 0x2

    if-nez v1, :cond_1

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v3, 0x1

    aget v3, v0, v3

    const/4 v4, 0x2

    aget v4, v0, v4

    const/4 v5, 0x3

    aget v5, v0, v5

    const/4 v6, 0x4

    aget v6, v0, v6

    const/4 v7, 0x5

    aget v7, v0, v7

    const/4 v8, 0x6

    aget v8, v0, v8

    const/4 v10, 0x7

    aget v11, v0, v10

    const/16 v13, 0x8

    aget v14, v0, v13

    const/16 v15, 0x9

    aget v16, v0, v15

    const/16 v17, 0xa

    aget v18, v0, v17

    const/16 v19, 0xb

    aget v20, v0, v19

    const/16 v21, 0x2

    const/16 v2, 0xc

    aget v23, v0, v2

    const/16 v24, 0xd

    aget v25, v0, v24

    const/16 v26, 0xe

    aget v27, v0, v26

    const/16 v28, 0xf

    aget v29, v0, v28

    move v10, v7

    move/from16 v22, v18

    move/from16 v30, v29

    const/4 v13, 0x7

    const/16 v15, 0x8

    move v7, v5

    move/from16 v18, v14

    move/from16 v29, v27

    move v5, v3

    move v14, v11

    move/from16 v27, v25

    move v3, v1

    move v11, v8

    move/from16 v25, v23

    move/from16 v1, p0

    move v8, v6

    move/from16 v23, v20

    move v6, v4

    move/from16 v20, v16

    const/16 v4, 0x10

    :goto_0
    if-lez v1, :cond_0

    add-int/2addr v3, v8

    xor-int v12, v25, v3

    invoke-static {v12, v4}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v12

    add-int v18, v18, v12

    xor-int v8, v8, v18

    invoke-static {v8, v2}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v8

    add-int/2addr v3, v8

    xor-int/2addr v12, v3

    invoke-static {v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v12

    add-int v18, v18, v12

    xor-int v8, v8, v18

    invoke-static {v8, v13}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v8

    add-int/2addr v5, v10

    xor-int v9, v27, v5

    invoke-static {v9, v4}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v9

    add-int v20, v20, v9

    xor-int v10, v10, v20

    invoke-static {v10, v2}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v10

    add-int/2addr v5, v10

    xor-int/2addr v9, v5

    invoke-static {v9, v15}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v9

    add-int v20, v20, v9

    xor-int v10, v10, v20

    invoke-static {v10, v13}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v10

    add-int/2addr v6, v11

    xor-int v2, v29, v6

    invoke-static {v2, v4}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v2

    add-int v22, v22, v2

    xor-int v11, v11, v22

    const/16 v0, 0xc

    invoke-static {v11, v0}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v11

    add-int/2addr v6, v11

    xor-int v0, v2, v6

    invoke-static {v0, v15}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v0

    add-int v22, v22, v0

    xor-int v2, v11, v22

    invoke-static {v2, v13}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v2

    add-int/2addr v7, v14

    xor-int v11, v30, v7

    invoke-static {v11, v4}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v4

    add-int v23, v23, v4

    xor-int v11, v14, v23

    const/16 v13, 0xc

    invoke-static {v11, v13}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v11

    add-int/2addr v7, v11

    xor-int/2addr v4, v7

    invoke-static {v4, v15}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v4

    add-int v23, v23, v4

    xor-int v11, v11, v23

    const/4 v13, 0x7

    invoke-static {v11, v13}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v11

    add-int/2addr v3, v10

    xor-int/2addr v4, v3

    const/16 v13, 0x10

    invoke-static {v4, v13}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v4

    add-int v22, v22, v4

    xor-int v10, v10, v22

    const/16 v13, 0xc

    invoke-static {v10, v13}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v10

    add-int/2addr v3, v10

    xor-int/2addr v4, v3

    const/16 v13, 0x8

    invoke-static {v4, v13}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v30

    add-int v22, v22, v30

    xor-int v4, v10, v22

    const/4 v10, 0x7

    invoke-static {v4, v10}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v10

    add-int/2addr v5, v2

    xor-int v4, v12, v5

    const/16 v12, 0x10

    invoke-static {v4, v12}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v4

    add-int v23, v23, v4

    xor-int v2, v2, v23

    const/16 v12, 0xc

    invoke-static {v2, v12}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v2

    add-int/2addr v5, v2

    xor-int/2addr v4, v5

    const/16 v12, 0x8

    invoke-static {v4, v12}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v25

    add-int v23, v23, v25

    xor-int v2, v2, v23

    const/4 v4, 0x7

    invoke-static {v2, v4}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v2

    add-int/2addr v6, v11

    xor-int v4, v9, v6

    const/16 v9, 0x10

    invoke-static {v4, v9}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v4

    add-int v18, v18, v4

    xor-int v9, v11, v18

    const/16 v11, 0xc

    invoke-static {v9, v11}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v9

    add-int/2addr v6, v9

    xor-int/2addr v4, v6

    const/16 v11, 0x8

    invoke-static {v4, v11}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v27

    add-int v18, v18, v27

    xor-int v4, v9, v18

    const/4 v9, 0x7

    invoke-static {v4, v9}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v14

    add-int/2addr v7, v8

    xor-int/2addr v0, v7

    const/16 v4, 0x10

    invoke-static {v0, v4}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v0

    add-int v20, v20, v0

    xor-int v4, v8, v20

    const/16 v8, 0xc

    invoke-static {v4, v8}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v4

    add-int/2addr v7, v4

    xor-int/2addr v0, v7

    const/16 v8, 0x8

    invoke-static {v0, v8}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v29

    add-int v20, v20, v29

    xor-int v0, v4, v20

    const/4 v4, 0x7

    invoke-static {v0, v4}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->rotl(II)I

    move-result v8

    add-int/lit8 v1, v1, -0x2

    const/4 v13, 0x7

    const/16 v4, 0x10

    const/16 v15, 0x8

    move-object/from16 v0, p1

    move v11, v2

    const/16 v2, 0xc

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x7

    const/4 v1, 0x3

    const/4 v2, 0x4

    const/4 v4, 0x5

    const/4 v9, 0x6

    const/4 v12, 0x0

    aput v3, p1, v12

    const/4 v3, 0x1

    aput v5, p1, v3

    aput v6, p1, v21

    aput v7, p1, v1

    aput v8, p1, v2

    aput v10, p1, v4

    aput v11, p1, v9

    aput v14, p1, v0

    const/16 v0, 0x8

    aput v18, p1, v0

    const/16 v0, 0x9

    aput v20, p1, v0

    aput v22, p1, v17

    aput v23, p1, v19

    const/16 v0, 0xc

    aput v25, p1, v0

    aput v27, p1, v24

    aput v29, p1, v26

    aput v30, p1, v28

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Number of rounds must be even"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public static rotl(II)I
    .locals 1

    shl-int v0, p0, p1

    neg-int p1, p1

    ushr-int/2addr p0, p1

    or-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public chacha_permute([B[B)V
    .locals 5

    const/16 v0, 0x10

    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    mul-int/lit8 v4, v3, 0x4

    .line 0
    invoke-static {p2, v4}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v4

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/16 p2, 0xc

    invoke-static {p2, v1}, Lorg/bouncycastle/pqc/crypto/sphincs/Permute;->permute(I[I)V

    :goto_1
    if-ge v2, v0, :cond_1

    aget p2, v1, v2

    mul-int/lit8 v3, v2, 0x4

    invoke-static {p2, p1, v3}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
