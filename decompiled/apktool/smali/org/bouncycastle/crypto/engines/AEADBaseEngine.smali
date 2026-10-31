.class public abstract Lorg/bouncycastle/crypto/engines/AEADBaseEngine;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/modes/AEADCipher;


# instance fields
.field public AADBufferSize:I

.field public BlockSize:I

.field public IV_SIZE:I

.field public KEY_SIZE:I

.field public MAC_SIZE:I

.field public aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

.field public algorithmName:Ljava/lang/String;

.field public dataLimitCounter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitCounter;

.field public dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

.field public decryptionFailureCounter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DecryptionFailureCounter;

.field public forEncryption:Z

.field public initialAssociatedText:[B

.field public m_aad:[B

.field public m_aadPos:I

.field public m_buf:[B

.field public m_bufPos:I

.field public m_bufferSizeDecrypt:I

.field public m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

.field public mac:[B

.field public macSizeLowerBound:I

.field public processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->macSizeLowerBound:I

    sget-object v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->Uninitialized:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->decryptionFailureCounter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DecryptionFailureCounter;

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataLimitCounter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitCounter;

    return-void
.end method

.method public static synthetic access$1200(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;[BII)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processAadBytes([BII)V

    return-void
.end method

.method private processAadBytes([BII)V
    .locals 4

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    const/4 v1, 0x0

    if-lez v0, :cond_1

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    sub-int/2addr v2, v0

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    invoke-interface {v0, p3, v2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->isLengthWithinAvailableSpace(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    add-int/2addr p1, p3

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    return-void

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    invoke-static {p1, p2, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferAAD([BI)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    invoke-interface {v0, p3, v2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->isLengthExceedingBlockSize(II)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferAAD([BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    return-void
.end method


# virtual methods
.method public checkAAD()V
    .locals 4

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    .line 4
    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v3, " needs to be initialized"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecAad:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v3, " cannot be reused for encryption"

    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    return-void

    :cond_4
    sget-object v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncAad:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    :goto_1
    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    return-void
.end method

.method public checkData(Z)Z
    .locals 3

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    .line 4
    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " needs to be initialized"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    return v2

    :pswitch_1
    sget-object v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecData:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    invoke-virtual {p0, v0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->finishAAD(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;Z)V

    return v2

    :pswitch_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " cannot be reused for encryption"

    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    return v1

    :pswitch_4
    sget-object v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncData:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    invoke-virtual {p0, v0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->finishAAD(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;Z)V

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public doFinal([BI)I
    .locals 5

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->checkData(Z)Z

    move-result v0

    .line 7
    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    .line 9
    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    if-eqz v0, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    if-lt v1, v2, :cond_4

    sub-int/2addr v1, v2

    .line 18
    iput v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    .line 21
    :goto_0
    invoke-virtual {p0, p1, p2, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->ensureSufficientOutputBuffer([BII)V

    .line 23
    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    .line 25
    new-array v2, v2, [B

    .line 27
    iput-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    .line 30
    invoke-virtual {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processFinalBlock([BI)V

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 35
    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    add-int/2addr p2, v1

    .line 38
    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    sub-int/2addr p2, v4

    .line 42
    invoke-static {v3, v2, p1, p2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 45
    :cond_1
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    .line 47
    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    .line 49
    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    .line 51
    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    .line 54
    invoke-static {p1, p2, v2, v3, v4}, Lorg/bouncycastle/util/Arrays;->constantTimeAreEqual(I[BI[BI)Z

    move-result p1

    if-nez p1, :cond_3

    .line 59
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->decryptionFailureCounter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DecryptionFailureCounter;

    if-eqz p1, :cond_2

    .line 64
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DecryptionFailureCounter;->increment()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 69
    new-instance p1, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    .line 71
    new-instance p2, Ljava/lang/StringBuilder;

    .line 74
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    const-string v1, " decryption failure limit exceeded"

    .line 0
    invoke-static {p2, v0, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    const-string v1, " mac does not match"

    invoke-static {p2, v0, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    xor-int/lit8 p1, v0, 0x1

    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset(Z)V

    return v1

    :cond_4
    new-instance p1, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    const-string p2, "data too short"

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ensureInitialized()V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    sget-object v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->Uninitialized:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Need to call init function before operation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ensureSufficientInputBuffer([BII)V
    .locals 0

    add-int/2addr p2, p3

    .line 0
    array-length p1, p1

    if-gt p2, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Lorg/bouncycastle/crypto/DataLengthException;

    const-string p2, "input buffer too short"

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ensureSufficientOutputBuffer([BII)V
    .locals 0

    add-int/2addr p2, p3

    .line 0
    array-length p1, p1

    if-gt p2, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Lorg/bouncycastle/crypto/OutputLengthException;

    const-string p2, "output buffer too short"

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/OutputLengthException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract finishAAD(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;Z)V
.end method

.method public finishAAD1(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processFinalAAD()V

    :goto_0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    return-void
.end method

.method public finishAAD2(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processFinalAAD()V

    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    return-void
.end method

.method public finishAAD3(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;Z)V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->getLen()I

    move-result p2

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    if-gt p2, v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processFinalAAD()V

    :goto_0
    const/4 p2, 0x0

    iput p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    return-void
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    return-object v0
.end method

.method public final getBlockSize()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    return v0
.end method

.method public getIVBytesSize()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    return v0
.end method

.method public getKeyBytesSize()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    return v0
.end method

.method public getMac()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    return-object v0
.end method

.method public getOutputSize(I)I
    .locals 2

    const/4 v0, 0x0

    .line 0
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget v1, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    packed-switch v1, :pswitch_data_0

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    add-int/2addr p1, v0

    return p1

    :pswitch_0
    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr p1, v1

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    sub-int/2addr p1, v1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :pswitch_1
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr p1, v0

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    add-int/2addr p1, v0

    return p1

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public getTotalBytesForUpdate(I)I
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->getUpdateOutputSize(I)I

    move-result p1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    return p1

    :pswitch_0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr p1, v0

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    sub-int/2addr p1, v0

    goto :goto_0

    :pswitch_1
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr p1, v0

    :goto_0
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public getUpdateOutputSize(I)I
    .locals 1

    .line 0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getTotalBytesForUpdate(I)I

    move-result p1

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    rem-int v0, p1, v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 6

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/AEADParameters;

    const/16 v1, 0x80

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/crypto/params/AEADParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/AEADParameters;->getKey()Lorg/bouncycastle/crypto/params/KeyParameter;

    move-result-object v2

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/AEADParameters;->getNonce()[B

    move-result-object v3

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/AEADParameters;->getAssociatedText()[B

    move-result-object v4

    iput-object v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->initialAssociatedText:[B

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/AEADParameters;->getMacSize()I

    move-result v0

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->macSizeLowerBound:I

    if-nez v4, :cond_1

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    shl-int/lit8 v4, v4, 0x3

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid value for MAC size: "

    .line 0
    invoke-static {v0, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-gt v0, v1, :cond_2

    shl-int/lit8 v4, v4, 0x3

    if-lt v0, v4, :cond_2

    and-int/lit8 v4, v0, 0x7

    if-nez v4, :cond_2

    ushr-int/lit8 v0, v0, 0x3

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "MAC size must be between "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->macSizeLowerBound:I

    shl-int/lit8 v0, v0, 0x3

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " and 128 bits for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_a

    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->initialAssociatedText:[B

    :goto_0
    if-eqz v2, :cond_9

    if-eqz v3, :cond_8

    array-length v0, v3

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    if-ne v0, v4, :cond_8

    invoke-virtual {v2}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    array-length v2, v0

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    if-ne v2, v4, :cond_7

    new-instance v2, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/Utils;->getPurpose(Z)Lorg/bouncycastle/crypto/CryptoServicePurpose;

    move-result-object v5

    invoke-direct {v2, v4, v1, p2, v5}, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;-><init>(Ljava/lang/String;ILjava/lang/Object;Lorg/bouncycastle/crypto/CryptoServicePurpose;)V

    invoke-static {v2}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->checkConstraints(Lorg/bouncycastle/crypto/CryptoServiceProperties;)V

    if-eqz p1, :cond_4

    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncInit:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    goto :goto_1

    :cond_4
    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecInit:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    :goto_1
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    invoke-virtual {p0, v0, v3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->init([B[B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataLimitCounter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitCounter;

    if-eqz p1, :cond_5

    array-length p2, v3

    invoke-virtual {p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitCounter;->increment(I)V

    :cond_5
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset(Z)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->initialAssociatedText:[B

    if-eqz p1, :cond_6

    const/4 p2, 0x0

    array-length v0, p1

    invoke-virtual {p0, p1, p2, v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processAADBytes([BII)V

    :cond_6
    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " key must be "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    const-string v1, " bytes long"

    invoke-static {v0, v1, p2}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " requires exactly "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    const-string v1, " bytes of IV"

    invoke-static {v0, v1, p2}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    const-string v1, " Init parameters must include a key"

    invoke-static {p2, v0, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "invalid parameters passed to "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract init([B[B)V
.end method

.method public processAADByte(B)V
    .locals 1

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->checkAAD()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;->processAADByte(B)V

    return-void
.end method

.method public processAADBytes([BII)V
    .locals 1

    .line 0
    invoke-virtual {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->ensureSufficientInputBuffer([BII)V

    if-gtz p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->checkAAD()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;->processAADBytes([BII)V

    return-void
.end method

.method public abstract processBufferAAD([BI)V
.end method

.method public abstract processBufferDecrypt([BI[BI)V
.end method

.method public abstract processBufferEncrypt([BI[BI)V
.end method

.method public processByte(B[BI)I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->processByte(B[BI)I

    move-result p1

    return p1
.end method

.method public processBytes([BII[BI)I
    .locals 6

    .line 0
    invoke-virtual {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->ensureSufficientInputBuffer([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->processBytes([BII[BI)I

    move-result p1

    return p1
.end method

.method public processEncDecByte([BI)I
    .locals 2

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    :goto_0
    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-virtual {p0, p1, p2, v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->ensureSufficientOutputBuffer([BII)V

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    invoke-virtual {p0, v0, v1, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferEncrypt([BI[BI)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    invoke-virtual {p0, v0, v1, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferDecrypt([BI[BI)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    iget p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    sub-int/2addr v0, p2

    invoke-static {p1, p2, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    iget p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    sub-int/2addr p1, p2

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    return p2

    :cond_2
    return v1
.end method

.method public processEncDecBytes([BII[BI)I
    .locals 7

    const/4 v0, 0x0

    .line 0
    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->checkData(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    goto :goto_0

    :cond_0
    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    :goto_0
    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    sub-int/2addr v2, v3

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    invoke-interface {v3, p3, v2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->isLengthWithinAvailableSpace(II)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object p4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    iget p5, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    invoke-static {p1, p2, p4, p5, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr p1, p3

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    return v0

    :cond_1
    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    invoke-interface {v3, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->getUpdateOutputSize(I)I

    move-result v3

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr v4, v3

    if-eqz v1, :cond_2

    const/4 v5, 0x0

    goto :goto_1

    :cond_2
    iget v5, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    :goto_1
    sub-int/2addr v4, v5

    iget v5, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    rem-int v5, v4, v5

    sub-int/2addr v4, v5

    invoke-virtual {p0, p4, p5, v4}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->ensureSufficientOutputBuffer([BII)V

    if-ne p1, p4, :cond_3

    invoke-static {p2, p3, p5, v3}, Lorg/bouncycastle/util/Arrays;->segmentsOverlap(IIII)Z

    move-result v3

    if-eqz v3, :cond_3

    new-array p1, p3, [B

    invoke-static {p4, p2, p1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p2, 0x0

    :cond_3
    if-eqz v1, :cond_6

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    if-lez v1, :cond_4

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    invoke-static {p1, p2, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    invoke-virtual {p0, v1, v0, p4, p5}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferEncrypt([BI[BI)V

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-interface {v2, p3, v3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->isLengthExceedingBlockSize(II)Z

    move-result v2

    if-eqz v2, :cond_5

    add-int v2, p5, v1

    invoke-virtual {p0, p1, p2, p4, v2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferEncrypt([BI[BI)V

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    add-int/2addr v1, v2

    goto :goto_2

    :cond_5
    move-object v2, p0

    goto/16 :goto_6

    :cond_6
    const/4 v1, 0x0

    :goto_3
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-interface {v2, v3, v4}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->isLengthExceedingBlockSize(II)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr v3, p3

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    invoke-interface {v2, v3, v4}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->isLengthExceedingBlockSize(II)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    add-int v3, p5, v1

    invoke-virtual {p0, v2, v1, p4, v3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferDecrypt([BI[BI)V

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    sub-int/2addr v2, v3

    iput v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr v1, v3

    goto :goto_3

    :cond_7
    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    if-lez v2, :cond_9

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    invoke-static {v3, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr v3, p3

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    invoke-interface {v2, v3, v4}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->isLengthWithinAvailableSpace(II)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object p4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    iget p5, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    invoke-static {p1, p2, p4, p5, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr p1, p3

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    return v1

    :cond_8
    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    sub-int/2addr v2, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    iget v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    invoke-static {p1, p2, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    add-int v3, p5, v1

    invoke-virtual {p0, v2, v0, p4, v3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferDecrypt([BI[BI)V

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    move-object v3, p0

    goto :goto_5

    :cond_9
    move-object v2, p0

    :goto_4
    iget-object v3, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    iget v4, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    invoke-interface {v3, p3, v4}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->isLengthExceedingBlockSize(II)Z

    move-result v3

    if-eqz v3, :cond_a

    add-int v3, p5, v1

    invoke-virtual {v2, p1, p2, p4, v3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferDecrypt([BI[BI)V

    iget v3, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    move v6, v3

    move-object v3, v2

    move v2, v6

    :goto_5
    add-int/2addr v1, v2

    move-object v2, v3

    goto :goto_4

    :cond_a
    :goto_6
    iget-object p4, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    invoke-static {p1, p2, p4, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    return v1
.end method

.method public abstract processFinalAAD()V
.end method

.method public abstract processFinalBlock([BI)V
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset(Z)V

    return-void
.end method

.method public reset(Z)V
    .locals 3

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->ensureInitialized()V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    :cond_0
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    :cond_1
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    if-eqz p1, :cond_2

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    :cond_2
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget p1, p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " needs to be initialized"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecFinal:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    goto :goto_0

    :pswitch_1
    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncFinal:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    return-void

    :goto_0
    :pswitch_2
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;->reset()V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->reset()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public setInnerMembers(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;)V
    .locals 4

    .line 0
    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;->access$000(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;)I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ImmediateAADProcessor;

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ImmediateAADProcessor;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$BufferedAADProcessor;

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$BufferedAADProcessor;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V

    :goto_0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    :goto_1
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    add-int/2addr p1, v2

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    invoke-static {p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;->access$300(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;)I

    move-result p1

    const/4 p2, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eqz p1, :cond_5

    if-eq p1, v0, :cond_4

    if-eq p1, v3, :cond_3

    if-eq p1, v2, :cond_2

    goto :goto_3

    :cond_2
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitCounter;

    invoke-direct {p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitCounter;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataLimitCounter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitCounter;

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitAADOperator;

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitAADOperator;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V

    goto :goto_2

    :cond_3
    iput p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamAADOperator;

    invoke-direct {p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamAADOperator;-><init>()V

    goto :goto_2

    :cond_4
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$CounterAADOperator;

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$CounterAADOperator;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V

    goto :goto_2

    :cond_5
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultAADOperator;

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultAADOperator;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V

    :goto_2
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    :goto_3
    invoke-static {p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;->access$700(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;)I

    move-result p1

    if-eqz p1, :cond_a

    if-eq p1, v0, :cond_9

    if-eq p1, v3, :cond_8

    if-eq p1, v2, :cond_7

    const/4 p2, 0x4

    if-eq p1, p2, :cond_6

    return-void

    :cond_6
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitDataOperator;

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataLimitDataOperator;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V

    goto :goto_4

    :cond_7
    iput p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamCipherOperator;

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamCipherOperator;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V

    goto :goto_4

    :cond_8
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;

    invoke-direct {p1, p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;)V

    goto :goto_4

    :cond_9
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$CounterDataOperator;

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$CounterDataOperator;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V

    goto :goto_4

    :cond_a
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufferSizeDecrypt:I

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultDataOperator;

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultDataOperator;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V

    :goto_4
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    return-void
.end method
