.class public Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;
.super Ljava/lang/Object;


# instance fields
.field public bd:[B

.field public ptr:I

.field public sd:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x200

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->bd:[B

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->ptr:I

    const/16 v0, 0x100

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->sd:[B

    return-void
.end method

.method private QROUND(IIII[I)V
    .locals 2

    .line 0
    aget v0, p5, p1

    aget v1, p5, p2

    add-int/2addr v0, v1

    aput v0, p5, p1

    aget v1, p5, p4

    xor-int/2addr v0, v1

    aput v0, p5, p4

    shl-int/lit8 v1, v0, 0x10

    ushr-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v1

    aput v0, p5, p4

    aget v1, p5, p3

    add-int/2addr v1, v0

    aput v1, p5, p3

    aget v0, p5, p2

    xor-int/2addr v0, v1

    aput v0, p5, p2

    shl-int/lit8 v1, v0, 0xc

    ushr-int/lit8 v0, v0, 0x14

    or-int/2addr v0, v1

    aput v0, p5, p2

    aget v1, p5, p1

    add-int/2addr v1, v0

    aput v1, p5, p1

    aget p1, p5, p4

    xor-int/2addr p1, v1

    aput p1, p5, p4

    shl-int/lit8 v0, p1, 0x8

    ushr-int/lit8 p1, p1, 0x18

    or-int/2addr p1, v0

    aput p1, p5, p4

    aget p4, p5, p3

    add-int/2addr p4, p1

    aput p4, p5, p3

    aget p1, p5, p2

    xor-int/2addr p1, p4

    aput p1, p5, p2

    shl-int/lit8 p3, p1, 0x7

    ushr-int/lit8 p1, p1, 0x19

    or-int/2addr p1, p3

    aput p1, p5, p2

    return-void
.end method


# virtual methods
.method public prng_get_u64()J
    .locals 2

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->ptr:I

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->bd:[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x9

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->prng_refill()V

    const/4 v0, 0x0

    :cond_0
    add-int/lit8 v1, v0, 0x8

    iput v1, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->ptr:I

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->bd:[B

    invoke-static {v1, v0}, Lorg/bouncycastle/util/Pack;->littleEndianToLong([BI)J

    move-result-wide v0

    return-wide v0
.end method

.method public prng_get_u8()B
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->bd:[B

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->ptr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->ptr:I

    aget-byte v1, v0, v1

    array-length v0, v0

    if-ne v2, v0, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->prng_refill()V

    :cond_0
    return v1
.end method

.method public prng_init(Lorg/bouncycastle/crypto/digests/SHAKEDigest;)V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->sd:[B

    const/4 v1, 0x0

    const/16 v2, 0x38

    invoke-virtual {p1, v0, v1, v2}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doOutput([BII)I

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->prng_refill()V

    return-void
.end method

.method public prng_refill()V
    .locals 24

    const v0, 0x79622d32

    const v1, 0x6b206574

    const v2, 0x61707865

    const v3, 0x3320646e

    .line 0
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    move-object/from16 v7, p0

    iget-object v1, v7, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->sd:[B

    const/16 v8, 0x30

    invoke-static {v1, v8}, Lorg/bouncycastle/util/Pack;->littleEndianToLong([BI)J

    move-result-wide v1

    const/16 v9, 0x10

    new-array v6, v9, [I

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-wide v3, v1

    move-object v1, v7

    const/4 v2, 0x0

    :goto_0
    const/16 v10, 0x8

    if-ge v2, v10, :cond_4

    const/4 v15, 0x4

    invoke-static {v0, v5, v6, v5, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v10, v1, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->sd:[B

    const/16 v11, 0xc

    invoke-static {v10, v5, v6, v15, v11}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI[III)V

    const/16 v14, 0xe

    aget v10, v6, v14

    long-to-int v13, v3

    xor-int/2addr v10, v13

    aput v10, v6, v14

    const/16 v16, 0xf

    aget v10, v6, v16

    const/16 v11, 0x20

    ushr-long v11, v3, v11

    long-to-int v12, v11

    xor-int/2addr v10, v12

    aput v10, v6, v16

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    const/16 v10, 0xa

    if-ge v11, v10, :cond_0

    const/16 v17, 0x8

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/16 v20, 0x4

    move-object v10, v1

    move/from16 v21, v11

    move/from16 v11, v19

    move/from16 v19, v12

    move/from16 v12, v20

    move/from16 v20, v13

    move/from16 v13, v17

    const/16 v1, 0xe

    move/from16 v14, v18

    const/4 v8, 0x4

    move-object v15, v6

    invoke-direct/range {v10 .. v15}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->QROUND(IIII[I)V

    const/16 v10, 0x9

    const/16 v11, 0xd

    const/4 v12, 0x1

    const/4 v13, 0x5

    const/16 v14, 0xe

    move-object/from16 v1, p0

    move v15, v2

    move v2, v12

    move-wide/from16 v22, v3

    move v3, v13

    move v4, v10

    const/4 v10, 0x0

    move v5, v11

    move-object v11, v6

    invoke-direct/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->QROUND(IIII[I)V

    const/16 v4, 0xa

    const/16 v5, 0xe

    const/4 v2, 0x2

    const/4 v3, 0x6

    invoke-direct/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->QROUND(IIII[I)V

    const/16 v4, 0xb

    const/16 v12, 0xf

    const/4 v2, 0x3

    const/4 v3, 0x7

    move v5, v12

    invoke-direct/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->QROUND(IIII[I)V

    const/16 v4, 0xa

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-direct/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->QROUND(IIII[I)V

    const/16 v4, 0xb

    const/16 v5, 0xc

    const/4 v2, 0x1

    const/4 v3, 0x6

    invoke-direct/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->QROUND(IIII[I)V

    const/16 v4, 0x8

    const/16 v5, 0xd

    const/4 v2, 0x2

    const/4 v3, 0x7

    invoke-direct/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->QROUND(IIII[I)V

    const/16 v4, 0x9

    const/16 v5, 0xe

    const/4 v2, 0x3

    const/4 v3, 0x4

    invoke-direct/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->QROUND(IIII[I)V

    add-int/lit8 v1, v21, 0x1

    move v2, v15

    move/from16 v12, v19

    move/from16 v13, v20

    move-wide/from16 v3, v22

    const/4 v5, 0x0

    const/16 v8, 0x30

    const/4 v15, 0x4

    move v11, v1

    move-object v1, v7

    goto :goto_1

    :cond_0
    move v15, v2

    move-wide/from16 v22, v3

    move-object v11, v6

    move/from16 v19, v12

    move/from16 v20, v13

    const/4 v8, 0x4

    const/4 v10, 0x0

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v8, :cond_1

    aget v3, v11, v2

    aget v4, v0, v2

    add-int/2addr v3, v4

    aput v3, v11, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_1
    :goto_3
    if-ge v8, v14, :cond_2

    aget v2, v11, v8

    iget-object v3, v1, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->sd:[B

    mul-int/lit8 v4, v8, 0x4

    sub-int/2addr v4, v9

    invoke-static {v3, v4}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v3

    add-int/2addr v3, v2

    aput v3, v11, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_2
    aget v2, v11, v14

    iget-object v3, v1, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->sd:[B

    const/16 v4, 0x28

    invoke-static {v3, v4}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v3

    xor-int v3, v3, v20

    add-int/2addr v2, v3

    aput v2, v11, v14

    aget v2, v11, v16

    iget-object v3, v1, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->sd:[B

    const/16 v4, 0x2c

    invoke-static {v3, v4}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v3

    xor-int v3, v3, v19

    add-int/2addr v2, v3

    aput v2, v11, v16

    const-wide/16 v2, 0x1

    move-wide/from16 v4, v22

    add-long v3, v4, v2

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v9, :cond_3

    aget v5, v11, v2

    iget-object v6, v1, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->bd:[B

    shl-int/lit8 v8, v15, 0x2

    shl-int/lit8 v12, v2, 0x5

    add-int/2addr v8, v12

    invoke-static {v5, v6, v8}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v2, v15, 0x1

    move-object v6, v11

    const/4 v5, 0x0

    const/16 v8, 0x30

    goto/16 :goto_0

    :cond_4
    move-wide v4, v3

    const/4 v10, 0x0

    iget-object v0, v1, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->sd:[B

    const/16 v2, 0x30

    invoke-static {v4, v5, v0, v2}, Lorg/bouncycastle/util/Pack;->longToLittleEndian(J[BI)V

    iput v10, v1, Lorg/bouncycastle/pqc/crypto/falcon/FalconRNG;->ptr:I

    return-void
.end method
