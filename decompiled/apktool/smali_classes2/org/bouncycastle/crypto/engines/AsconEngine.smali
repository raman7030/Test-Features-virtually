.class public Lorg/bouncycastle/crypto/engines/AsconEngine;
.super Lorg/bouncycastle/crypto/engines/AsconBaseEngine;


# instance fields
.field public K2:J

.field public final asconParameters:Lorg/bouncycastle/crypto/engines/AsconEngine$AsconParameters;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/AsconEngine$AsconParameters;)V
    .locals 4

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AsconEngine;->asconParameters:Lorg/bouncycastle/crypto/engines/AsconEngine$AsconParameters;

    const/16 v0, 0x10

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/16 v1, 0x8

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    iput v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    const-wide v2, -0x7fbff3fa00000000L    # -1.785284289241434E-307

    iput-wide v2, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->ASCON_IV:J

    const-string p1, "Ascon-128 AEAD"

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid parameter setting for ASCON AEAD"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    const-wide v2, -0x7f7ff3f800000000L

    iput-wide v2, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->ASCON_IV:J

    const-string p1, "Ascon-128a AEAD"

    goto :goto_0

    :cond_2
    const/16 p1, 0x14

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    iput v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    const-wide v2, -0x5fbff3fa00000000L    # -2.393674885049323E-153

    iput-wide v2, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->ASCON_IV:J

    const-string p1, "Ascon-80pq AEAD"

    :goto_0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    if-ne p1, v1, :cond_3

    const/4 v1, 0x6

    :cond_3
    iput v1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->nr:I

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->dsep:J

    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;->Immediate:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;

    sget-object v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;->Default:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;

    sget-object v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;->Default:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;

    invoke-virtual {p0, p1, v0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->setInnerMembers(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;)V

    return-void
.end method


# virtual methods
.method public ascon_aeadinit()V
    .locals 11

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->ASCON_IV:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K1:J

    iget-wide v5, p0, Lorg/bouncycastle/crypto/engines/AsconEngine;->K2:J

    iget-wide v7, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->N0:J

    iget-wide v9, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->N1:J

    invoke-virtual/range {v0 .. v10}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->set(JJJJJ)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    const/16 v1, 0x14

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v2, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    iget-wide v4, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K0:J

    xor-long/2addr v2, v4

    iput-wide v2, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K0:J

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K1:J

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x4:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconEngine;->K2:J

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x4:J

    return-void
.end method

.method public bridge synthetic doFinal([BI)I
    .locals 0

    .line 0
    invoke-super {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->doFinal([BI)I

    move-result p1

    return p1
.end method

.method public finishData(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;)V
    .locals 10

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconEngine;->asconParameters:Lorg/bouncycastle/crypto/engines/AsconEngine$AsconParameters;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K1:J

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconEngine;->K2:J

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K1:J

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconEngine;->K2:J

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K0:J

    const/16 v5, 0x20

    shl-long/2addr v3, v5

    iget-wide v6, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K1:J

    shr-long v8, v6, v5

    or-long/2addr v3, v8

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    shl-long v3, v6, v5

    iget-wide v6, p0, Lorg/bouncycastle/crypto/engines/AsconEngine;->K2:J

    shr-long v8, v6, v5

    or-long/2addr v3, v8

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    shl-long v3, v6, v5

    :goto_0
    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    :goto_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K1:J

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x4:J

    iget-wide v3, p0, Lorg/bouncycastle/crypto/engines/AsconEngine;->K2:J

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x4:J

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    return-void
.end method

.method public bridge synthetic getAlgorithmName()Ljava/lang/String;
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAlgorithmVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "v1.2"

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
    .locals 4

    const/4 v0, 0x0

    .line 0
    invoke-static {p2, v0}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide v1

    iput-wide v1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->N0:J

    const/16 v1, 0x8

    invoke-static {p2, v1}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide v2

    iput-wide v2, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->N1:J

    iget p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    const/16 v2, 0x10

    if-ne p2, v2, :cond_0

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide v2

    iput-wide v2, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K1:J

    invoke-static {p1, v1}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/16 v1, 0x14

    if-ne p2, v1, :cond_1

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result p2

    int-to-long v0, p2

    iput-wide v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K0:J

    const/4 p2, 0x4

    invoke-static {p1, p2}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->K1:J

    const/16 p2, 0xc

    invoke-static {p1, p2}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, Lorg/bouncycastle/crypto/engines/AsconEngine;->K2:J

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public loadBytes([BI)J
    .locals 0

    .line 0
    invoke-static {p1, p2}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide p1

    return-wide p1
.end method

.method public pad(I)J
    .locals 2

    shl-int/lit8 p1, p1, 0x3

    rsub-int/lit8 p1, p1, 0x38

    const-wide/16 v0, 0x80

    shl-long/2addr v0, p1

    return-wide v0
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
    .locals 10

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    const/16 v2, -0x80

    aput-byte v2, v0, v1

    const-wide/16 v2, -0x1

    const/4 v4, 0x0

    const/16 v5, 0x8

    if-lt v1, v5, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v6, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {v0, v4}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide v8

    xor-long/2addr v6, v8

    iput-wide v6, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v6, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    invoke-static {v1, v5}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide v8

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    sub-int/2addr v1, v5

    shl-int/lit8 v1, v1, 0x3

    rsub-int/lit8 v1, v1, 0x38

    shl-long v1, v2, v1

    and-long/2addr v1, v8

    xor-long/2addr v1, v6

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    return-void

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v5, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {v0, v4}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide v7

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    shl-int/lit8 v0, v0, 0x3

    rsub-int/lit8 v0, v0, 0x38

    shl-long/2addr v2, v0

    and-long/2addr v2, v7

    xor-long/2addr v2, v5

    iput-wide v2, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    return-void
.end method

.method public processFinalDecrypt([BI[BI)V
    .locals 8

    const-wide/16 v0, -0x1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-lt p2, v3, :cond_0

    .line 0
    invoke-static {p1, v2}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide v4

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v6, v2, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    xor-long/2addr v6, v4

    iput-wide v6, v2, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {v6, v7, p3, p4}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iput-wide v4, v2, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    add-int/2addr p4, v3

    add-int/lit8 p2, p2, -0x8

    iget-wide v4, v2, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    invoke-virtual {p0, p2}, Lorg/bouncycastle/crypto/engines/AsconEngine;->pad(I)J

    move-result-wide v6

    xor-long/2addr v4, v6

    iput-wide v4, v2, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    if-eqz p2, :cond_1

    invoke-static {p1, v3, p2}, Lorg/bouncycastle/util/Pack;->littleEndianToLong_High([BII)J

    move-result-wide v2

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v4, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    xor-long/2addr v4, v2

    iput-wide v4, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    invoke-static {v4, v5, p3, p4, p2}, Lorg/bouncycastle/util/Pack;->longToLittleEndian_High(J[BII)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide p3, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    shl-int/lit8 p2, p2, 0x3

    ushr-long/2addr v0, p2

    and-long p2, p3, v0

    xor-long/2addr p2, v2

    iput-wide p2, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v4, v3, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-virtual {p0, p2}, Lorg/bouncycastle/crypto/engines/AsconEngine;->pad(I)J

    move-result-wide v6

    xor-long/2addr v4, v6

    iput-wide v4, v3, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    if-eqz p2, :cond_1

    invoke-static {p1, v2, p2}, Lorg/bouncycastle/util/Pack;->littleEndianToLong_High([BII)J

    move-result-wide v2

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v4, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    xor-long/2addr v4, v2

    iput-wide v4, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {v4, v5, p3, p4, p2}, Lorg/bouncycastle/util/Pack;->longToLittleEndian_High(J[BII)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide p3, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    shl-int/lit8 p2, p2, 0x3

    ushr-long/2addr v0, p2

    and-long p2, p3, v0

    xor-long/2addr p2, v2

    iput-wide p2, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    :cond_1
    :goto_0
    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecFinal:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/engines/AsconEngine;->finishData(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;)V

    return-void
.end method

.method public processFinalEncrypt([BI[BI)V
    .locals 7

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-lt p2, v1, :cond_0

    .line 0
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v3, v2, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide v5

    xor-long/2addr v3, v5

    iput-wide v3, v2, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v2, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {v2, v3, p3, p4}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    add-int/2addr p4, v1

    add-int/lit8 p2, p2, -0x8

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v2, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    invoke-virtual {p0, p2}, Lorg/bouncycastle/crypto/engines/AsconEngine;->pad(I)J

    move-result-wide v4

    xor-long/2addr v2, v4

    iput-wide v2, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    if-eqz p2, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v2, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    invoke-static {p1, v1, p2}, Lorg/bouncycastle/util/Pack;->littleEndianToLong_High([BII)J

    move-result-wide v4

    xor-long v1, v2, v4

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v0, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v2, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-virtual {p0, p2}, Lorg/bouncycastle/crypto/engines/AsconEngine;->pad(I)J

    move-result-wide v4

    xor-long/2addr v2, v4

    iput-wide v2, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    if-eqz p2, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v2, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {p1, v0, p2}, Lorg/bouncycastle/util/Pack;->littleEndianToLong_High([BII)J

    move-result-wide v4

    xor-long/2addr v2, v4

    iput-wide v2, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AsconBaseEngine;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v0, p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    :goto_0
    invoke-static {v0, v1, p3, p4, p2}, Lorg/bouncycastle/util/Pack;->longToLittleEndian_High(J[BII)V

    :cond_1
    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncFinal:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/engines/AsconEngine;->finishData(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;)V

    return-void
.end method

.method public bridge synthetic reset()V
    .locals 0

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset()V

    return-void
.end method

.method public setBytes(J[BI)V
    .locals 0

    .line 0
    invoke-static {p1, p2, p3, p4}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    return-void
.end method
