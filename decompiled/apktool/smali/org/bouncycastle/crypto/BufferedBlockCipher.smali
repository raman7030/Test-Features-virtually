.class public Lorg/bouncycastle/crypto/BufferedBlockCipher;
.super Ljava/lang/Object;


# instance fields
.field public buf:[B

.field public bufOff:I

.field public cipher:Lorg/bouncycastle/crypto/BlockCipher;

.field public forEncryption:Z

.field public mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

.field public partialBlockOkay:Z

.field public pgpCFB:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 5

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    instance-of v0, p1, Lorg/bouncycastle/crypto/MultiBlockCipher;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/crypto/MultiBlockCipher;

    iput-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/MultiBlockCipher;->getMultiBlockSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2f

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    if-lez v2, :cond_1

    const-string v4, "PGP"

    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iput-boolean v4, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->pgpCFB:Z

    if-nez v4, :cond_4

    instance-of p1, p1, Lorg/bouncycastle/crypto/StreamCipher;

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    if-lez v2, :cond_3

    const-string p1, "OpenPGP"

    invoke-virtual {v1, p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    :cond_3
    iput-boolean v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->partialBlockOkay:Z

    return-void

    :cond_4
    :goto_2
    iput-boolean v3, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->partialBlockOkay:Z

    return-void
.end method

.method private processBuffer([BI)I
    .locals 7

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    array-length v0, v2

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v3

    div-int v4, v0, v3

    const/4 v3, 0x0

    move-object v5, p1

    move v6, p2

    invoke-interface/range {v1 .. v6}, Lorg/bouncycastle/crypto/MultiBlockCipher;->processBlocks([BII[BI)I

    move-result p1

    return p1

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    invoke-interface {v1, v2, v0, p1, p2}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    move-result p1

    return p1
.end method


# virtual methods
.method public doFinal([BI)I
    .locals 9

    .line 0
    :try_start_0
    iget v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    add-int v1, p2, v0

    array-length v2, p1

    if-gt v1, v2, :cond_4

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v2

    div-int/2addr v0, v2

    iget-object v3, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

    iget-object v4, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    const/4 v5, 0x0

    move v6, v0

    move-object v7, p1

    move v8, p2

    invoke-interface/range {v3 .. v8}, Lorg/bouncycastle/crypto/MultiBlockCipher;->processBlocks([BII[BI)I

    move-result v2

    iget-object v3, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

    invoke-interface {v3}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v3

    mul-int v0, v0, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v0, 0x0

    :goto_0
    iget v3, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    if-eq v3, v0, :cond_2

    iget-boolean v3, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->partialBlockOkay:Z

    if-eqz v3, :cond_1

    iget-object v3, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    invoke-interface {v3, v4, v0, v4, v0}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iget-object v3, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    add-int/2addr p2, v2

    iget v4, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    sub-int/2addr v4, v0

    invoke-static {v3, v0, p1, p2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    sub-int/2addr p1, v0

    add-int/2addr p1, v2

    iput v1, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    move v1, p1

    goto :goto_1

    :cond_1
    new-instance p1, Lorg/bouncycastle/crypto/DataLengthException;

    const-string p2, "data not block size aligned"

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    move v1, v2

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->reset()V

    return v1

    :cond_4
    :try_start_1
    new-instance p1, Lorg/bouncycastle/crypto/OutputLengthException;

    const-string p2, "output buffer too short for doFinal()"

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/OutputLengthException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->reset()V

    throw p1
.end method

.method public getBlockSize()I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    return v0
.end method

.method public getOutputSize(I)I
    .locals 1

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->pgpCFB:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->forEncryption:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p1

    return v0

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    add-int/2addr p1, v0

    return p1
.end method

.method public getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    return-object v0
.end method

.method public getUpdateOutputSize(I)I
    .locals 2

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    add-int/2addr p1, v0

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->pgpCFB:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->forEncryption:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    array-length v0, v0

    rem-int v0, p1, v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    array-length v0, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    array-length v0, v0

    :goto_0
    rem-int v0, p1, v0

    :goto_1
    sub-int/2addr p1, v0

    return p1
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 1

    .line 0
    iput-boolean p1, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->forEncryption:Z

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public processByte(B[BI)I
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    iget v1, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    aput-byte p1, v0, v1

    array-length p1, v0

    if-ne v2, p1, :cond_0

    invoke-direct {p0, p2, p3}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->processBuffer([BI)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public processBytes([BII[BI)I
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v7, p4

    move/from16 v8, p5

    if-ltz v3, :cond_9

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getBlockSize()I

    move-result v9

    invoke-virtual {p0, v3}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getUpdateOutputSize(I)I

    move-result v4

    if-lez v4, :cond_1

    add-int/2addr v4, v8

    array-length v5, v7

    if-gt v4, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/bouncycastle/crypto/OutputLengthException;

    const-string v2, "output buffer too short"

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/OutputLengthException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v4, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    array-length v5, v4

    iget v6, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    sub-int/2addr v5, v6

    const/4 v10, 0x0

    if-le v3, v5, :cond_6

    if-eqz v6, :cond_2

    invoke-static {v1, v2, v4, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v2, v5

    sub-int/2addr v3, v5

    :cond_2
    move v11, v3

    if-ne v1, v7, :cond_3

    new-array v1, v11, [B

    invoke-static {v7, v2, v1, v10, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v2, 0x0

    move-object v12, v1

    const/4 v13, 0x0

    goto :goto_1

    :cond_3
    move-object v12, v1

    move v13, v2

    :goto_1
    iget v1, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    if-eqz v1, :cond_4

    invoke-direct {p0, v7, v8}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->processBuffer([BI)I

    move-result v10

    :cond_4
    iget-object v1, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Lorg/bouncycastle/crypto/MultiBlockCipher;->getMultiBlockSize()I

    move-result v1

    div-int v1, v11, v1

    iget-object v2, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/MultiBlockCipher;->getMultiBlockSize()I

    move-result v2

    div-int/2addr v2, v9

    mul-int v14, v2, v1

    if-lez v14, :cond_7

    iget-object v1, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->mbCipher:Lorg/bouncycastle/crypto/MultiBlockCipher;

    add-int v6, v8, v10

    move-object v2, v12

    move v3, v13

    move v4, v14

    move-object/from16 v5, p4

    invoke-interface/range {v1 .. v6}, Lorg/bouncycastle/crypto/MultiBlockCipher;->processBlocks([BII[BI)I

    move-result v1

    add-int/2addr v10, v1

    mul-int v14, v14, v9

    sub-int v1, v11, v14

    add-int v2, v13, v14

    move v11, v1

    move v13, v2

    goto :goto_3

    :cond_5
    :goto_2
    iget-object v1, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    array-length v1, v1

    if-le v11, v1, :cond_7

    iget-object v1, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    add-int v2, v8, v10

    invoke-interface {v1, v12, v13, v7, v2}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    move-result v1

    add-int/2addr v10, v1

    sub-int/2addr v11, v9

    add-int/2addr v13, v9

    goto :goto_2

    :cond_6
    move-object v12, v1

    move v13, v2

    move v11, v3

    :cond_7
    :goto_3
    iget-object v1, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    iget v2, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    invoke-static {v12, v13, v1, v2, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    add-int/2addr v1, v11

    iput v1, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    iget-object v2, v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    array-length v2, v2

    if-ne v1, v2, :cond_8

    add-int v1, v8, v10

    invoke-direct {p0, v7, v1}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->processBuffer([BI)I

    move-result v1

    add-int/2addr v10, v1

    :cond_8
    return v10

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Can\'t have a negative input length!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public reset()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 0
    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->buf:[B

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aput-byte v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->bufOff:I

    iget-object v0, p0, Lorg/bouncycastle/crypto/BufferedBlockCipher;->cipher:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->reset()V

    return-void
.end method
