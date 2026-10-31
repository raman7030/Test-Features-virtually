.class public Lorg/bouncycastle/crypto/engines/ChaChaEngine;
.super Lorg/bouncycastle/crypto/engines/Salsa20Engine;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;-><init>(I)V

    return-void
.end method

.method public static chachaCore(I[I[I)V
    .locals 32

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 0
    array-length v2, v0

    const/16 v3, 0x10

    if-ne v2, v3, :cond_3

    array-length v2, v1

    if-ne v2, v3, :cond_2

    rem-int/lit8 v2, p0, 0x2

    if-nez v2, :cond_1

    const/4 v2, 0x0

    aget v2, v0, v2

    const/4 v4, 0x1

    aget v4, v0, v4

    const/4 v5, 0x2

    aget v5, v0, v5

    const/4 v6, 0x3

    aget v6, v0, v6

    const/4 v7, 0x4

    aget v7, v0, v7

    const/4 v8, 0x5

    aget v8, v0, v8

    const/4 v9, 0x6

    aget v9, v0, v9

    const/4 v11, 0x7

    aget v12, v0, v11

    const/16 v14, 0x8

    aget v15, v0, v14

    const/16 v16, 0x9

    aget v17, v0, v16

    const/16 v18, 0xa

    aget v19, v0, v18

    const/16 v20, 0xb

    aget v21, v0, v20

    const/16 v22, 0x2

    const/16 v23, 0xc

    aget v24, v0, v23

    const/16 v25, 0xd

    aget v26, v0, v25

    const/16 v27, 0xe

    aget v28, v0, v27

    const/16 v29, 0xf

    aget v30, v0, v29

    move v3, v2

    move v11, v9

    move v14, v12

    move/from16 v23, v21

    move/from16 v31, v30

    const/4 v12, 0x7

    const/16 v13, 0xc

    move/from16 v2, p0

    move v9, v8

    move/from16 v21, v19

    move/from16 v30, v28

    move v8, v7

    move/from16 v19, v17

    move/from16 v28, v26

    move v7, v6

    move/from16 v17, v15

    move/from16 v26, v24

    const/16 v15, 0x8

    move v6, v5

    move v5, v4

    const/16 v4, 0x10

    :goto_0
    if-lez v2, :cond_0

    add-int/2addr v3, v8

    xor-int v10, v26, v3

    invoke-static {v10, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v10

    add-int v17, v17, v10

    xor-int v8, v8, v17

    invoke-static {v8, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v8

    add-int/2addr v3, v8

    xor-int/2addr v10, v3

    invoke-static {v10, v15}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v10

    add-int v17, v17, v10

    xor-int v8, v8, v17

    invoke-static {v8, v12}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v8

    add-int/2addr v5, v9

    xor-int v1, v28, v5

    invoke-static {v1, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v1

    add-int v19, v19, v1

    xor-int v9, v9, v19

    invoke-static {v9, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v9

    add-int/2addr v5, v9

    xor-int/2addr v1, v5

    invoke-static {v1, v15}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v1

    add-int v19, v19, v1

    xor-int v9, v9, v19

    invoke-static {v9, v12}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v9

    add-int/2addr v6, v11

    xor-int v0, v30, v6

    invoke-static {v0, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v0

    add-int v21, v21, v0

    xor-int v4, v11, v21

    invoke-static {v4, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v4

    add-int/2addr v6, v4

    xor-int/2addr v0, v6

    invoke-static {v0, v15}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v0

    add-int v21, v21, v0

    xor-int v4, v4, v21

    invoke-static {v4, v12}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v4

    add-int/2addr v7, v14

    xor-int v11, v31, v7

    const/16 v12, 0x10

    invoke-static {v11, v12}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v11

    add-int v23, v23, v11

    xor-int v12, v14, v23

    invoke-static {v12, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v12

    add-int/2addr v7, v12

    xor-int/2addr v11, v7

    const/16 v13, 0x8

    invoke-static {v11, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v11

    add-int v23, v23, v11

    xor-int v12, v12, v23

    const/4 v13, 0x7

    invoke-static {v12, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v12

    add-int/2addr v3, v9

    xor-int/2addr v11, v3

    const/16 v13, 0x10

    invoke-static {v11, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v11

    add-int v21, v21, v11

    xor-int v9, v9, v21

    const/16 v13, 0xc

    invoke-static {v9, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v9

    add-int/2addr v3, v9

    xor-int/2addr v11, v3

    const/16 v13, 0x8

    invoke-static {v11, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v31

    add-int v21, v21, v31

    xor-int v9, v9, v21

    const/4 v11, 0x7

    invoke-static {v9, v11}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v9

    add-int/2addr v5, v4

    xor-int/2addr v10, v5

    const/16 v11, 0x10

    invoke-static {v10, v11}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v10

    add-int v23, v23, v10

    xor-int v4, v4, v23

    const/16 v11, 0xc

    invoke-static {v4, v11}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v4

    add-int/2addr v5, v4

    xor-int/2addr v10, v5

    const/16 v11, 0x8

    invoke-static {v10, v11}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v26

    add-int v23, v23, v26

    xor-int v4, v4, v23

    const/4 v10, 0x7

    invoke-static {v4, v10}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v11

    add-int/2addr v6, v12

    xor-int/2addr v1, v6

    const/16 v4, 0x10

    invoke-static {v1, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v1

    add-int v17, v17, v1

    xor-int v4, v12, v17

    const/16 v10, 0xc

    invoke-static {v4, v10}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v4

    add-int/2addr v6, v4

    xor-int/2addr v1, v6

    const/16 v10, 0x8

    invoke-static {v1, v10}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v28

    add-int v17, v17, v28

    xor-int v1, v4, v17

    const/4 v4, 0x7

    invoke-static {v1, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v14

    add-int/2addr v7, v8

    xor-int/2addr v0, v7

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v0

    add-int v19, v19, v0

    xor-int v1, v8, v19

    const/16 v4, 0xc

    invoke-static {v1, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v1

    add-int/2addr v7, v1

    xor-int/2addr v0, v7

    const/16 v4, 0x8

    invoke-static {v0, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v30

    add-int v19, v19, v30

    xor-int v0, v1, v19

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v8

    add-int/lit8 v2, v2, -0x2

    const/4 v12, 0x7

    const/16 v4, 0x10

    const/16 v15, 0x8

    const/16 v13, 0xc

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x5

    const/4 v4, 0x6

    const/4 v10, 0x0

    aget v12, p1, v10

    add-int/2addr v3, v12

    aput v3, p2, v10

    const/4 v3, 0x1

    aget v10, p1, v3

    add-int/2addr v5, v10

    aput v5, p2, v3

    aget v3, p1, v22

    add-int/2addr v6, v3

    aput v6, p2, v22

    aget v3, p1, v0

    add-int/2addr v7, v3

    aput v7, p2, v0

    aget v0, p1, v1

    add-int/2addr v8, v0

    aput v8, p2, v1

    aget v0, p1, v2

    add-int/2addr v9, v0

    aput v9, p2, v2

    aget v0, p1, v4

    add-int/2addr v11, v0

    aput v11, p2, v4

    const/4 v0, 0x7

    aget v1, p1, v0

    add-int/2addr v14, v1

    aput v14, p2, v0

    const/16 v0, 0x8

    aget v1, p1, v0

    add-int v17, v17, v1

    aput v17, p2, v0

    aget v0, p1, v16

    add-int v19, v19, v0

    aput v19, p2, v16

    aget v0, p1, v18

    add-int v21, v21, v0

    aput v21, p2, v18

    aget v0, p1, v20

    add-int v23, v23, v0

    aput v23, p2, v20

    const/16 v0, 0xc

    aget v1, p1, v0

    add-int v26, v26, v1

    aput v26, p2, v0

    aget v0, p1, v25

    add-int v28, v28, v0

    aput v28, p2, v25

    aget v0, p1, v27

    add-int v30, v30, v0

    aput v30, p2, v27

    aget v0, p1, v29

    add-int v31, v31, v0

    aput v31, p2, v29

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

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method


# virtual methods
.method public advanceCounter()V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    const/16 v1, 0xc

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    if-nez v2, :cond_0

    const/16 v1, 0xd

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    :cond_0
    return-void
.end method

.method public advanceCounter(J)V
    .locals 3

    const/16 v0, 0x20

    ushr-long v0, p1, v0

    long-to-int v1, v0

    long-to-int p2, p1

    const/16 p1, 0xd

    if-lez v1, :cond_0

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    aget v2, v0, p1

    add-int/2addr v2, v1

    aput v2, v0, p1

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    const/16 v1, 0xc

    aget v2, v0, v1

    add-int/2addr p2, v2

    aput p2, v0, v1

    if-eqz v2, :cond_1

    if-ge p2, v2, :cond_1

    aget p2, v0, p1

    add-int/lit8 p2, p2, 0x1

    aput p2, v0, p1

    :cond_1
    return-void
.end method

.method public generateKeyStream([B)V
    .locals 3

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rounds:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->x:[I

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/crypto/engines/ChaChaEngine;->chachaCore(I[I[I)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->x:[I

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lorg/bouncycastle/util/Pack;->intToLittleEndian([I[BI)V

    return-void
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ChaCha"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rounds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCounter()J
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    const/16 v1, 0xd

    aget v1, v0, v1

    int-to-long v1, v1

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    const/16 v3, 0xc

    aget v0, v0, v3

    int-to-long v3, v0

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long v0, v1, v3

    return-wide v0
.end method

.method public resetCounter()V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    const/16 v1, 0xd

    const/4 v2, 0x0

    aput v2, v0, v1

    const/16 v1, 0xc

    aput v2, v0, v1

    return-void
.end method

.method public retreatCounter()V
    .locals 5

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    const/16 v1, 0xc

    aget v2, v0, v1

    const/16 v3, 0xd

    if-nez v2, :cond_1

    aget v4, v0, v3

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "attempt to reduce counter past zero."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    add-int/lit8 v2, v2, -0x1

    aput v2, v0, v1

    const/4 v1, -0x1

    if-ne v2, v1, :cond_2

    aget v1, v0, v3

    add-int/lit8 v1, v1, -0x1

    aput v1, v0, v3

    :cond_2
    return-void
.end method

.method public retreatCounter(J)V
    .locals 11

    const/16 v0, 0x20

    ushr-long v0, p1, v0

    long-to-int v1, v0

    long-to-int p2, p1

    const-string p1, "attempt to reduce counter past zero."

    const-wide v2, 0xffffffffL

    const/16 v0, 0xd

    if-eqz v1, :cond_1

    .line 0
    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    aget v5, v4, v0

    int-to-long v6, v5

    and-long/2addr v6, v2

    int-to-long v8, v1

    and-long/2addr v8, v2

    cmp-long v10, v6, v8

    if-ltz v10, :cond_0

    sub-int/2addr v5, v1

    aput v5, v4, v0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    const/16 v4, 0xc

    aget v5, v1, v4

    int-to-long v6, v5

    and-long/2addr v6, v2

    int-to-long v8, p2

    and-long/2addr v2, v8

    cmp-long v8, v6, v2

    if-ltz v8, :cond_2

    sub-int/2addr v5, p2

    aput v5, v1, v4

    return-void

    :cond_2
    aget v2, v1, v0

    if-eqz v2, :cond_3

    add-int/lit8 v2, v2, -0x1

    aput v2, v1, v0

    sub-int/2addr v5, p2

    aput v5, v1, v4

    return-void

    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public setKey([B[B)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 0
    array-length v1, p1

    const/16 v2, 0x10

    if-eq v1, v2, :cond_1

    array-length v1, p1

    const/16 v3, 0x20

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/ChaChaEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " requires 128 bit or 256 bit key"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    array-length v1, p1

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    invoke-virtual {p0, v1, v3, v0}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->packTauOrSigma(I[II)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    const/4 v3, 0x4

    invoke-static {p1, v0, v1, v3, v3}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI[III)V

    array-length v1, p1

    sub-int/2addr v1, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    const/16 v4, 0x8

    invoke-static {p1, v1, v2, v4, v3}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI[III)V

    :cond_2
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->engineState:[I

    const/16 v1, 0xe

    const/4 v2, 0x2

    invoke-static {p2, v0, p1, v1, v2}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI[III)V

    return-void
.end method
