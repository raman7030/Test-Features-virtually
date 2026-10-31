.class public Lorg/bouncycastle/crypto/engines/XoodyakEngine;
.super Lorg/bouncycastle/crypto/engines/AEADBaseEngine;


# static fields
.field public static final ModeHash:I = 0x1

.field public static final ModeKeyed:I = 0x0

.field public static final PhaseDown:I = 0x1

.field public static final PhaseUp:I = 0x2

.field public static final RC:[I

.field public static final f_bPrime_1:I = 0x2f


# instance fields
.field public K:[B

.field public aadcd:B

.field public encrypted:Z

.field public iv:[B

.field public mode:I

.field public phase:I

.field public final state:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    new-array v0, v0, [I

    .line 0
    fill-array-data v0, :array_0

    sput-object v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->RC:[I

    return-void

    :array_0
    .array-data 4
        0x58
        0x38
        0x3c0
        0xd0
        0x120
        0x14
        0x60
        0x2c
        0x380
        0xf0
        0x1a0
        0x12
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;-><init>()V

    const-string v0, "Xoodyak AEAD"

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    const/16 v0, 0x10

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    const/16 v0, 0x18

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    const/16 v0, 0x2c

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    const/16 v0, 0x30

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    sget-object v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;->Immediate:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;

    sget-object v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;->Default:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;

    sget-object v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;->Counter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;

    invoke-virtual {p0, v0, v1, v2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->setInnerMembers(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;)V

    return-void
.end method

.method private AbsorbAny([BIII)V
    .locals 9

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->phase:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    iget v0, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->up(I[BI)V

    :cond_0
    move v8, p4

    :goto_0
    iget p4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    move-result p4

    iget v3, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    move-object v5, p1

    move v6, p2

    move v7, p4

    invoke-static/range {v3 .. v8}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->down(I[B[BIII)V

    const/4 v0, 0x1

    iput v0, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->phase:I

    add-int/2addr p2, p4

    sub-int/2addr p3, p4

    if-nez p3, :cond_1

    return-void

    :cond_1
    const/4 v8, 0x0

    goto :goto_0
.end method

.method public static down(I[B[BIII)V
    .locals 0

    .line 0
    invoke-static {p4, p2, p3, p1}, Lorg/bouncycastle/util/Bytes;->xorTo(I[BI[B)V

    aget-byte p2, p1, p4

    const/4 p3, 0x1

    xor-int/2addr p2, p3

    int-to-byte p2, p2

    aput-byte p2, p1, p4

    const/16 p2, 0x2f

    aget-byte p4, p1, p2

    if-ne p0, p3, :cond_0

    and-int/lit8 p5, p5, 0x1

    :cond_0
    xor-int p0, p4, p5

    int-to-byte p0, p0

    aput-byte p0, p1, p2

    return-void
.end method

.method public static down(Lorg/bouncycastle/crypto/digests/XoodyakDigest$Friend;I[B[BIII)V
    .locals 0

    if-eqz p0, :cond_0

    .line 0
    invoke-static/range {p1 .. p6}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->down(I[B[BIII)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "This method is only for use by XoodyakDigest"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static up(I[BI)V
    .locals 19

    move-object/from16 v0, p1

    const/4 v1, 0x1

    move/from16 v2, p0

    if-eq v2, v1, :cond_0

    const/16 v1, 0x2f

    .line 0
    aget-byte v2, v0, v1

    xor-int v2, v2, p2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    :cond_0
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v0, v2}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v2

    const/16 v3, 0x8

    invoke-static {v0, v3}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v3

    const/16 v4, 0xc

    invoke-static {v0, v4}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v5

    const/16 v6, 0x10

    invoke-static {v0, v6}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v6

    const/16 v7, 0x14

    invoke-static {v0, v7}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v7

    const/16 v8, 0x18

    invoke-static {v0, v8}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v8

    const/16 v9, 0x1c

    invoke-static {v0, v9}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v9

    const/16 v10, 0x20

    invoke-static {v0, v10}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v10

    const/16 v11, 0x24

    invoke-static {v0, v11}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v11

    const/16 v12, 0x28

    invoke-static {v0, v12}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v12

    const/16 v13, 0x2c

    invoke-static {v0, v13}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result v13

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v4, :cond_1

    xor-int v4, v1, v6

    xor-int/2addr v4, v10

    xor-int v15, v2, v7

    xor-int/2addr v15, v11

    xor-int v16, v3, v8

    xor-int v0, v16, v12

    xor-int v16, v5, v9

    move/from16 p0, v14

    xor-int v14, v16, v13

    move/from16 p2, v13

    const/4 v13, 0x5

    invoke-static {v14, v13}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v13

    move/from16 v16, v9

    const/16 v9, 0xe

    invoke-static {v14, v9}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v14

    xor-int/2addr v13, v14

    const/4 v14, 0x5

    invoke-static {v4, v14}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v17

    invoke-static {v4, v9}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v4

    xor-int v4, v17, v4

    invoke-static {v15, v14}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v17

    invoke-static {v15, v9}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v15

    xor-int v15, v17, v15

    invoke-static {v0, v14}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v14

    invoke-static {v0, v9}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int/2addr v1, v13

    xor-int/2addr v6, v13

    xor-int v9, v10, v13

    xor-int/2addr v2, v4

    xor-int/2addr v7, v4

    xor-int/2addr v4, v11

    xor-int/2addr v3, v15

    xor-int/2addr v8, v15

    xor-int v10, v12, v15

    xor-int/2addr v5, v0

    xor-int v11, v16, v0

    xor-int v0, p2, v0

    const/16 v12, 0xb

    invoke-static {v9, v12}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v9

    invoke-static {v4, v12}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v4

    invoke-static {v10, v12}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v10

    invoke-static {v0, v12}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v0

    sget-object v12, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->RC:[I

    aget v12, v12, p0

    xor-int/2addr v1, v12

    not-int v12, v11

    and-int/2addr v12, v9

    xor-int/2addr v12, v1

    not-int v13, v6

    and-int/2addr v13, v4

    xor-int/2addr v13, v2

    not-int v14, v7

    and-int/2addr v14, v10

    xor-int/2addr v14, v3

    not-int v15, v8

    and-int/2addr v15, v0

    xor-int/2addr v15, v5

    move/from16 p2, v12

    not-int v12, v9

    and-int/2addr v12, v1

    xor-int/2addr v12, v11

    move/from16 v16, v13

    not-int v13, v4

    and-int/2addr v13, v2

    xor-int/2addr v13, v6

    move/from16 v17, v14

    not-int v14, v10

    and-int/2addr v14, v3

    xor-int/2addr v14, v7

    move/from16 v18, v15

    not-int v15, v0

    and-int/2addr v15, v5

    xor-int/2addr v15, v8

    not-int v1, v1

    and-int/2addr v1, v11

    xor-int/2addr v1, v9

    not-int v2, v2

    and-int/2addr v2, v6

    xor-int/2addr v2, v4

    not-int v3, v3

    and-int/2addr v3, v7

    xor-int/2addr v3, v10

    not-int v4, v5

    and-int/2addr v4, v8

    xor-int/2addr v0, v4

    const/4 v4, 0x1

    invoke-static {v12, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v6

    invoke-static {v13, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v7

    invoke-static {v14, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v8

    invoke-static {v15, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v9

    const/16 v4, 0x8

    invoke-static {v3, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v10

    invoke-static {v0, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v11

    invoke-static {v1, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v12

    invoke-static {v2, v4}, Lorg/bouncycastle/util/Integers;->rotateLeft(II)I

    move-result v13

    add-int/lit8 v14, p0, 0x1

    const/16 v4, 0xc

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, v16

    move/from16 v3, v17

    move/from16 v5, v18

    goto/16 :goto_0

    :cond_1
    move/from16 v16, v9

    move/from16 p2, v13

    const/4 v0, 0x0

    const/16 v4, 0x8

    move-object/from16 v9, p1

    invoke-static {v1, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/4 v0, 0x4

    invoke-static {v2, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    invoke-static {v3, v9, v4}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/16 v0, 0xc

    invoke-static {v5, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/16 v0, 0x10

    invoke-static {v6, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/16 v0, 0x14

    invoke-static {v7, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/16 v0, 0x18

    invoke-static {v8, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/16 v0, 0x1c

    move/from16 v1, v16

    invoke-static {v1, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/16 v0, 0x20

    invoke-static {v10, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/16 v0, 0x24

    invoke-static {v11, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/16 v0, 0x28

    invoke-static {v12, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    const/16 v0, 0x2c

    invoke-static {v13, v9, v0}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    return-void
.end method

.method public static up(Lorg/bouncycastle/crypto/digests/XoodyakDigest$Friend;I[BI)V
    .locals 0

    if-eqz p0, :cond_0

    .line 0
    invoke-static {p1, p2, p3}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->up(I[BI)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "This method is only for use by XoodyakDigest"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
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
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->K:[B

    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->iv:[B

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
    .locals 2

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    iget-byte v1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->aadcd:B

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->AbsorbAny([BIII)V

    const/4 p1, 0x0

    iput-byte p1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->aadcd:B

    return-void
.end method

.method public processBufferDecrypt([BI[BI)V
    .locals 11

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    iget-boolean v2, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->encrypted:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x80

    :goto_0
    invoke-static {v0, v1, v2}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->up(I[BI)V

    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    move v8, p4

    invoke-static/range {v3 .. v8}, Lorg/bouncycastle/util/Bytes;->xor(I[B[BI[BI)V

    iget v5, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    iget v9, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->down(I[B[BIII)V

    const/4 p1, 0x1

    iput p1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->phase:I

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->encrypted:Z

    return-void
.end method

.method public processBufferEncrypt([BI[BI)V
    .locals 11

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    iget-boolean v2, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->encrypted:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x80

    :goto_0
    invoke-static {v0, v1, v2}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->up(I[BI)V

    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    move v8, p4

    invoke-static/range {v3 .. v8}, Lorg/bouncycastle/util/Bytes;->xor(I[B[BI[BI)V

    iget v5, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    iget v9, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    const/4 v10, 0x0

    move-object v7, p1

    move v8, p2

    invoke-static/range {v5 .. v10}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->down(I[B[BIII)V

    const/4 p1, 0x1

    iput p1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->phase:I

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->encrypted:Z

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
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    iget-byte v2, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->aadcd:B

    const/4 v3, 0x0

    invoke-direct {p0, v0, v3, v1, v2}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->AbsorbAny([BIII)V

    return-void
.end method

.method public processFinalBlock([BI)V
    .locals 15

    move-object v0, p0

    .line 0
    iget v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-boolean v1, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->encrypted:Z

    if-nez v1, :cond_3

    :cond_0
    iget v1, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v3, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    iget-boolean v4, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->encrypted:Z

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    const/16 v4, 0x80

    :goto_0
    invoke-static {v1, v3, v4}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->up(I[BI)V

    iget v5, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    iget-object v6, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    iget-object v7, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    const/4 v8, 0x0

    move-object/from16 v9, p1

    move/from16 v10, p2

    invoke-static/range {v5 .. v10}, Lorg/bouncycastle/util/Bytes;->xor(I[B[BI[BI)V

    iget-boolean v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    if-eqz v1, :cond_2

    iget v3, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v4, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    iget-object v5, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    iget v7, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->down(I[B[BIII)V

    goto :goto_1

    :cond_2
    iget v9, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v10, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    iget v13, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    const/4 v14, 0x0

    move-object/from16 v11, p1

    move/from16 v12, p2

    invoke-static/range {v9 .. v14}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->down(I[B[BIII)V

    :goto_1
    const/4 v1, 0x1

    iput v1, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->phase:I

    :cond_3
    iget v1, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    iget-object v3, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    const/16 v4, 0x40

    invoke-static {v1, v3, v4}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->up(I[BI)V

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    iget-object v3, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    iget v4, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    invoke-static {v1, v2, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x2

    iput v1, v0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->phase:I

    return-void
.end method

.method public bridge synthetic reset()V
    .locals 0

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset()V

    return-void
.end method

.method public reset(Z)V
    .locals 5

    .line 0
    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset(Z)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->state:[B

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    iput-boolean v0, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->encrypted:Z

    const/4 p1, 0x2

    iput p1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->phase:I

    const/4 v1, 0x3

    iput-byte v1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->aadcd:B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->K:[B

    array-length v2, v1

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->iv:[B

    array-length v3, v3

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    new-array v4, v4, [B

    iput v0, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->mode:I

    invoke-static {v1, v0, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->iv:[B

    invoke-static {v1, v0, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v2, v3

    int-to-byte v1, v3

    aput-byte v1, v4, v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {p0, v4, v0, v2, p1}, Lorg/bouncycastle/crypto/engines/XoodyakEngine;->AbsorbAny([BIII)V

    return-void
.end method
