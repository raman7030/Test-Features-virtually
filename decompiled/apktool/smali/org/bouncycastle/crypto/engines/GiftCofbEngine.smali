.class public Lorg/bouncycastle/crypto/engines/GiftCofbEngine;
.super Lorg/bouncycastle/crypto/engines/AEADBaseEngine;


# static fields
.field public static final GIFT_RC:[B


# instance fields
.field public Y:[B

.field public input:[B

.field public k:[B

.field public npub:[B

.field public offset:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x28

    new-array v0, v0, [B

    .line 0
    fill-array-data v0, :array_0

    sput-object v0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->GIFT_RC:[B

    return-void

    :array_0
    .array-data 1
        0x1t
        0x3t
        0x7t
        0xft
        0x1ft
        0x3et
        0x3dt
        0x3bt
        0x37t
        0x2ft
        0x1et
        0x3ct
        0x39t
        0x33t
        0x27t
        0xet
        0x1dt
        0x3at
        0x35t
        0x2bt
        0x16t
        0x2ct
        0x18t
        0x30t
        0x21t
        0x2t
        0x5t
        0xbt
        0x17t
        0x2et
        0x1ct
        0x38t
        0x31t
        0x23t
        0x6t
        0xdt
        0x1bt
        0x36t
        0x2dt
        0x1at
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;-><init>()V

    const/16 v0, 0x10

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    const-string v0, "GIFT-COFB AEAD"

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;->Buffered:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;

    sget-object v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;->Default:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;

    sget-object v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;->Counter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;

    invoke-virtual {p0, v0, v1, v2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->setInnerMembers(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;)V

    return-void
.end method

.method private double_half_block([B)V
    .locals 6

    const/4 v0, 0x0

    .line 0
    aget-byte v1, p1, v0

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x7

    ushr-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1b

    :goto_0
    if-ge v0, v2, :cond_0

    aget-byte v3, p1, v0

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v0, 0x1

    aget-byte v5, p1, v4

    and-int/lit16 v5, v5, 0xff

    ushr-int/2addr v5, v2

    or-int/2addr v3, v5

    int-to-byte v3, v3

    aput-byte v3, p1, v0

    move v0, v4

    goto :goto_0

    :cond_0
    aget-byte v0, p1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x1

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, p1, v2

    return-void
.end method

.method private giftb128([B[B[B)V
    .locals 29

    const/4 v0, 0x4

    new-array v1, v0, [I

    const/16 v2, 0x8

    new-array v3, v2, [S

    const/4 v4, 0x0

    .line 0
    aget-byte v5, p1, v4

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x18

    const/4 v6, 0x1

    aget-byte v7, p1, v6

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x10

    or-int/2addr v5, v7

    const/4 v7, 0x2

    aget-byte v8, p1, v7

    and-int/lit16 v8, v8, 0xff

    shl-int/2addr v8, v2

    or-int/2addr v5, v8

    const/4 v8, 0x3

    aget-byte v9, p1, v8

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v5, v9

    aput v5, v1, v4

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/4 v5, 0x5

    aget-byte v9, p1, v5

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x10

    or-int/2addr v0, v9

    const/4 v9, 0x6

    aget-byte v10, p1, v9

    and-int/lit16 v10, v10, 0xff

    shl-int/2addr v10, v2

    or-int/2addr v0, v10

    const/4 v10, 0x7

    aget-byte v11, p1, v10

    and-int/lit16 v11, v11, 0xff

    or-int/2addr v0, v11

    aput v0, v1, v6

    aget-byte v0, p1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/16 v11, 0x9

    aget-byte v12, p1, v11

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x10

    or-int/2addr v0, v12

    const/16 v12, 0xa

    aget-byte v13, p1, v12

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v2, v13, 0x8

    or-int/2addr v0, v2

    const/16 v2, 0xb

    aget-byte v13, p1, v2

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v0, v13

    aput v0, v1, v7

    const/16 v0, 0xc

    aget-byte v13, p1, v0

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x18

    const/16 v14, 0xd

    const/4 v15, 0x4

    aget-byte v0, p1, v14

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v13

    const/16 v13, 0xe

    const/16 v17, 0x8

    aget-byte v14, p1, v13

    and-int/lit16 v14, v14, 0xff

    shl-int/lit8 v14, v14, 0x8

    or-int/2addr v0, v14

    const/16 v14, 0xf

    aget-byte v13, p1, v14

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v0, v13

    aput v0, v1, v8

    aget-byte v0, p2, v4

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte v13, p2, v6

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v0, v13

    int-to-short v0, v0

    aput-short v0, v3, v4

    aget-byte v0, p2, v7

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte v13, p2, v8

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v0, v13

    int-to-short v0, v0

    aput-short v0, v3, v6

    aget-byte v0, p2, v15

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte v13, p2, v5

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v0, v13

    int-to-short v0, v0

    aput-short v0, v3, v7

    aget-byte v0, p2, v9

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte v13, p2, v10

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v0, v13

    int-to-short v0, v0

    aput-short v0, v3, v8

    aget-byte v0, p2, v17

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte v13, p2, v11

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v0, v13

    int-to-short v0, v0

    aput-short v0, v3, v15

    aget-byte v0, p2, v12

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte v13, p2, v2

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v0, v13

    int-to-short v0, v0

    aput-short v0, v3, v5

    const/16 v0, 0xc

    aget-byte v13, p2, v0

    and-int/lit16 v0, v13, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/16 v13, 0xd

    aget-byte v4, p2, v13

    and-int/lit16 v4, v4, 0xff

    or-int/2addr v0, v4

    int-to-short v0, v0

    aput-short v0, v3, v9

    const/16 v0, 0xe

    aget-byte v4, p2, v0

    and-int/lit16 v0, v4, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte v4, p2, v14

    and-int/lit16 v4, v4, 0xff

    or-int/2addr v0, v4

    int-to-short v0, v0

    aput-short v0, v3, v10

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_0
    const/16 v13, 0x28

    if-ge v0, v13, :cond_0

    aget v13, v1, v6

    aget v19, v1, v4

    aget v20, v1, v7

    and-int v21, v19, v20

    xor-int v13, v13, v21

    aput v13, v1, v6

    aget v21, v1, v8

    and-int v22, v13, v21

    xor-int v19, v19, v22

    aput v19, v1, v4

    or-int v4, v19, v13

    xor-int v4, v20, v4

    aput v4, v1, v7

    const/16 v20, 0x0

    xor-int v14, v21, v4

    aput v14, v1, v8

    xor-int/2addr v13, v14

    aput v13, v1, v6

    not-int v14, v14

    aput v14, v1, v8

    and-int v13, v19, v13

    xor-int/2addr v4, v13

    aput v4, v1, v7

    aput v14, v1, v20

    aput v19, v1, v8

    const/16 v27, 0x2

    const/16 v28, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x3

    move-object/from16 v23, p0

    move/from16 v24, v14

    invoke-direct/range {v23 .. v28}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->rowperm(IIIII)I

    move-result v4

    aput v4, v1, v20

    aget v24, v1, v6

    const/16 v27, 0x3

    const/16 v28, 0x2

    const/16 v25, 0x1

    const/16 v26, 0x0

    invoke-direct/range {v23 .. v28}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->rowperm(IIIII)I

    move-result v4

    aput v4, v1, v6

    aget v24, v1, v7

    const/16 v27, 0x0

    const/16 v28, 0x3

    const/16 v25, 0x2

    const/16 v26, 0x1

    invoke-direct/range {v23 .. v28}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->rowperm(IIIII)I

    move-result v4

    aput v4, v1, v7

    aget v24, v1, v8

    const/16 v27, 0x1

    const/16 v28, 0x0

    const/16 v25, 0x3

    const/16 v26, 0x2

    invoke-direct/range {v23 .. v28}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->rowperm(IIIII)I

    move-result v4

    aput v4, v1, v8

    aget v13, v1, v7

    aget-short v14, v3, v7

    const v19, 0xffff

    and-int v21, v14, v19

    shl-int/lit8 v21, v21, 0x10

    aget-short v23, v3, v8

    and-int v24, v23, v19

    or-int v21, v21, v24

    xor-int v13, v13, v21

    aput v13, v1, v7

    aget v13, v1, v6

    aget-short v21, v3, v9

    and-int v24, v21, v19

    shl-int/lit8 v24, v24, 0x10

    aget-short v25, v3, v10

    and-int v26, v25, v19

    or-int v24, v24, v26

    xor-int v13, v13, v24

    aput v13, v1, v6

    sget-object v13, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->GIFT_RC:[B

    aget-byte v13, v13, v0

    and-int/lit16 v13, v13, 0xff

    const/high16 v24, -0x80000000

    xor-int v13, v13, v24

    xor-int/2addr v4, v13

    aput v4, v1, v8

    and-int v4, v21, v19

    ushr-int/2addr v4, v7

    and-int v13, v21, v19

    const/16 v18, 0xe

    shl-int/lit8 v13, v13, 0xe

    or-int/2addr v4, v13

    int-to-short v4, v4

    and-int v13, v25, v19

    const/16 v16, 0xc

    ushr-int/lit8 v13, v13, 0xc

    and-int v19, v25, v19

    shl-int/lit8 v19, v19, 0x4

    or-int v13, v13, v19

    int-to-short v13, v13

    aget-short v19, v3, v5

    aput-short v19, v3, v10

    aget-short v19, v3, v15

    aput-short v19, v3, v9

    aput-short v23, v3, v5

    aput-short v14, v3, v15

    aget-short v14, v3, v6

    aput-short v14, v3, v8

    aget-short v14, v3, v20

    aput-short v14, v3, v7

    aput-short v13, v3, v6

    aput-short v4, v3, v20

    add-int/lit8 v0, v0, 0x1

    const/4 v4, 0x0

    const/16 v14, 0xf

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x0

    aget v3, v1, v0

    ushr-int/lit8 v4, v3, 0x18

    int-to-byte v4, v4

    aput-byte v4, p3, v0

    ushr-int/lit8 v0, v3, 0x10

    int-to-byte v0, v0

    aput-byte v0, p3, v6

    ushr-int/lit8 v0, v3, 0x8

    int-to-byte v0, v0

    aput-byte v0, p3, v7

    int-to-byte v0, v3

    aput-byte v0, p3, v8

    aget v0, v1, v6

    ushr-int/lit8 v3, v0, 0x18

    int-to-byte v3, v3

    aput-byte v3, p3, v15

    ushr-int/lit8 v3, v0, 0x10

    int-to-byte v3, v3

    aput-byte v3, p3, v5

    ushr-int/lit8 v3, v0, 0x8

    int-to-byte v3, v3

    aput-byte v3, p3, v9

    int-to-byte v0, v0

    aput-byte v0, p3, v10

    aget v0, v1, v7

    ushr-int/lit8 v3, v0, 0x18

    int-to-byte v3, v3

    aput-byte v3, p3, v17

    ushr-int/lit8 v3, v0, 0x10

    int-to-byte v3, v3

    aput-byte v3, p3, v11

    ushr-int/lit8 v3, v0, 0x8

    int-to-byte v3, v3

    aput-byte v3, p3, v12

    int-to-byte v0, v0

    aput-byte v0, p3, v2

    aget v0, v1, v8

    ushr-int/lit8 v1, v0, 0x18

    int-to-byte v1, v1

    const/16 v2, 0xc

    aput-byte v1, p3, v2

    ushr-int/lit8 v1, v0, 0x10

    int-to-byte v1, v1

    const/16 v2, 0xd

    aput-byte v1, p3, v2

    ushr-int/lit8 v1, v0, 0x8

    int-to-byte v1, v1

    const/16 v2, 0xe

    aput-byte v1, p3, v2

    int-to-byte v0, v0

    const/16 v1, 0xf

    aput-byte v0, p3, v1

    return-void
.end method

.method private pho1([B[B[BII)V
    .locals 5

    const/16 v0, 0x10

    new-array v1, v0, [B

    new-array v2, v0, [B

    const/16 v3, -0x80

    const/4 v4, 0x0

    if-nez p5, :cond_0

    aput-byte v3, v1, v4

    goto :goto_0

    .line 0
    :cond_0
    invoke-static {p3, p4, v1, v4, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-ge p5, v0, :cond_1

    aput-byte v3, v1, p5

    :cond_1
    :goto_0
    const/16 p3, 0x8

    invoke-static {p2, p3, v2, v4, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p3, 0x0

    :goto_1
    const/4 p4, 0x7

    if-ge p3, p4, :cond_2

    add-int/lit8 p4, p3, 0x8

    aget-byte p5, p2, p3

    and-int/lit16 p5, p5, 0xff

    shl-int/lit8 p5, p5, 0x1

    add-int/lit8 p3, p3, 0x1

    aget-byte v3, p2, p3

    and-int/lit16 v3, v3, 0xff

    ushr-int/lit8 v3, v3, 0x7

    or-int/2addr p5, v3

    int-to-byte p5, p5

    aput-byte p5, v2, p4

    goto :goto_1

    :cond_2
    aget-byte p3, p2, p4

    and-int/lit16 p3, p3, 0xff

    shl-int/lit8 p3, p3, 0x1

    aget-byte p4, p2, v4

    and-int/lit16 p4, p4, 0xff

    ushr-int/lit8 p4, p4, 0x7

    or-int/2addr p3, p4

    int-to-byte p3, p3

    const/16 p4, 0xf

    aput-byte p3, v2, p4

    invoke-static {v2, v4, p2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0, p2, v1, p1}, Lorg/bouncycastle/util/Bytes;->xor(I[B[B[B)V

    return-void
.end method

.method private rowperm(IIIII)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x8

    if-ge v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x4

    ushr-int v3, p1, v2

    and-int/lit8 v3, v3, 0x1

    mul-int/lit8 v4, p2, 0x8

    add-int/2addr v4, v0

    shl-int/2addr v3, v4

    or-int/2addr v1, v3

    add-int/lit8 v3, v2, 0x1

    ushr-int v3, p1, v3

    and-int/lit8 v3, v3, 0x1

    mul-int/lit8 v4, p3, 0x8

    add-int/2addr v4, v0

    shl-int/2addr v3, v4

    or-int/2addr v1, v3

    add-int/lit8 v3, v2, 0x2

    ushr-int v3, p1, v3

    and-int/lit8 v3, v3, 0x1

    mul-int/lit8 v4, p4, 0x8

    add-int/2addr v4, v0

    shl-int/2addr v3, v4

    or-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x3

    ushr-int v2, p1, v2

    and-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, p5, 0x8

    add-int/2addr v3, v0

    shl-int/2addr v2, v3

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method private triple_half_block([B)V
    .locals 7

    const/16 v0, 0x8

    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x7

    if-ge v3, v4, :cond_0

    .line 0
    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v3, 0x1

    aget-byte v6, p1, v5

    and-int/lit16 v6, v6, 0xff

    ushr-int/lit8 v6, v6, 0x7

    or-int/2addr v4, v6

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    move v3, v5

    goto :goto_0

    :cond_0
    aget-byte v3, p1, v4

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x1

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    ushr-int/2addr v2, v4

    mul-int/lit8 v2, v2, 0x1b

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v1, v4

    invoke-static {v0, v1, p1}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    return-void
.end method


# virtual methods
.method public bridge synthetic doFinal([BI)I
    .locals 0

    .line 0
    invoke-super {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->doFinal([BI)I

    move-result p1

    return p1
.end method

.method public finishAAD(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;Z)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->finishAAD3(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;Z)V

    return-void
.end method

.method public bridge synthetic getAlgorithmName()Ljava/lang/String;
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getIVBytesSize()I
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getIVBytesSize()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getKeyBytesSize()I
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getKeyBytesSize()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getMac()[B
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getMac()[B

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getOutputSize(I)I
    .locals 0

    .line 0
    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getOutputSize(I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getUpdateOutputSize(I)I
    .locals 0

    .line 0
    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getUpdateOutputSize(I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 0

    .line 0
    invoke-super {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public init([B[B)V
    .locals 0

    .line 0
    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->npub:[B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->k:[B

    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    const/16 p1, 0x10

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    const/16 p1, 0x8

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    return-void
.end method

.method public bridge synthetic processAADByte(B)V
    .locals 0

    .line 0
    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processAADByte(B)V

    return-void
.end method

.method public bridge synthetic processAADBytes([BII)V
    .locals 0

    .line 0
    invoke-super {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processAADBytes([BII)V

    return-void
.end method

.method public processBufferAAD([BI)V
    .locals 6

    .line 0
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    const/16 v5, 0x10

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->pho1([B[B[BII)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->double_half_block([B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    const/16 v0, 0x8

    invoke-static {v0, p1, p2}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->k:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    invoke-direct {p0, p1, p2, v0}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->giftb128([B[B[B)V

    return-void
.end method

.method public processBufferDecrypt([BI[BI)V
    .locals 9

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->double_half_block([B)V

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    invoke-static/range {v1 .. v6}, Lorg/bouncycastle/util/Bytes;->xor(I[B[BI[BI)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    iget v8, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    move-object v3, p0

    move-object v6, p3

    move v7, p4

    invoke-direct/range {v3 .. v8}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->pho1([B[B[BII)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    const/16 p3, 0x8

    invoke-static {p3, p1, p2}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->k:[B

    iget-object p3, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->giftb128([B[B[B)V

    return-void
.end method

.method public processBufferEncrypt([BI[BI)V
    .locals 9

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->double_half_block([B)V

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    invoke-static/range {v1 .. v6}, Lorg/bouncycastle/util/Bytes;->xor(I[B[BI[BI)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    iget v8, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    move-object v3, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v3 .. v8}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->pho1([B[B[BII)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    const/16 p3, 0x8

    invoke-static {p3, p1, p2}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->k:[B

    iget-object p3, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->giftb128([B[B[B)V

    return-void
.end method

.method public bridge synthetic processByte(B[BI)I
    .locals 0

    .line 0
    invoke-super {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processByte(B[BI)I

    move-result p1

    return p1
.end method

.method public bridge synthetic processBytes([BII[BI)I
    .locals 0

    .line 0
    invoke-super/range {p0 .. p5}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBytes([BII[BI)I

    move-result p1

    return p1
.end method

.method public processFinalAAD()V
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->getLen()I

    move-result v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    :goto_0
    sub-int/2addr v0, v1

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    invoke-direct {p0, v1}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->triple_half_block([B)V

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    and-int/lit8 v1, v1, 0xf

    if-nez v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    sget-object v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecInit:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    if-eq v1, v2, :cond_1

    sget-object v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncInit:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    invoke-direct {p0, v1}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->triple_half_block([B)V

    :cond_2
    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->triple_half_block([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->triple_half_block([B)V

    :cond_3
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    const/4 v5, 0x0

    iget v6, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->pho1([B[B[BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    const/16 v2, 0x8

    invoke-static {v2, v0, v1}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->k:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    invoke-direct {p0, v0, v1, v2}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->giftb128([B[B[B)V

    return-void
.end method

.method public processFinalBlock([BI)V
    .locals 14

    move-object v6, p0

    .line 0
    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->getLen()I

    move-result v0

    iget-boolean v1, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    const/4 v7, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    :goto_0
    sub-int/2addr v0, v1

    if-eqz v0, :cond_3

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    invoke-direct {p0, v1}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->triple_half_block([B)V

    and-int/lit8 v0, v0, 0xf

    if-eqz v0, :cond_1

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->triple_half_block([B)V

    :cond_1
    iget v8, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    iget-object v9, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    iget-object v10, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    const/4 v11, 0x0

    move-object v12, p1

    move/from16 v13, p2

    invoke-static/range {v8 .. v13}, Lorg/bouncycastle/util/Bytes;->xor(I[B[BI[BI)V

    iget-boolean v0, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object v2, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    if-eqz v0, :cond_2

    iget-object v3, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    const/4 v4, 0x0

    iget v5, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->pho1([B[B[BII)V

    goto :goto_1

    :cond_2
    iget v5, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    move-object v0, p0

    move-object v3, p1

    move/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->pho1([B[B[BII)V

    :goto_1
    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    const/16 v2, 0x8

    invoke-static {v2, v0, v1}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->k:[B

    iget-object v2, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    invoke-direct {p0, v0, v1, v2}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->giftb128([B[B[B)V

    :cond_3
    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    iget v2, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-static {v0, v7, v1, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public bridge synthetic reset()V
    .locals 0

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset()V

    return-void
.end method

.method public reset(Z)V
    .locals 3

    .line 0
    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset(Z)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->npub:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->input:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->k:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    invoke-direct {p0, p1, v0, v1}, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->giftb128([B[B[B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->Y:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/GiftCofbEngine;->offset:[B

    const/16 v1, 0x8

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
