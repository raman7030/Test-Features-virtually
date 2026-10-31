.class public Lorg/bouncycastle/crypto/digests/AsconDigest;
.super Lorg/bouncycastle/crypto/digests/AsconBaseDigest;


# instance fields
.field public asconParameters:Lorg/bouncycastle/crypto/digests/AsconDigest$AsconParameters;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/digests/AsconDigest$AsconParameters;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/digests/AsconDigest;->asconParameters:Lorg/bouncycastle/crypto/digests/AsconDigest$AsconParameters;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/16 p1, 0x8

    iput p1, p0, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->ASCON_PB_ROUNDS:I

    const-string p1, "Ascon-HashA"

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid parameter settings for Ascon Hash"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/16 p1, 0xc

    iput p1, p0, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->ASCON_PB_ROUNDS:I

    const-string p1, "Ascon-Hash"

    :goto_0
    iput-object p1, p0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->algorithmName:Ljava/lang/String;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/AsconDigest;->reset()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doFinal([BI)I
    .locals 0

    .line 0
    invoke-super {p0, p1, p2}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->doFinal([BI)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getAlgorithmName()Ljava/lang/String;
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getByteLength()I
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->getByteLength()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getDigestSize()I
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->getDigestSize()I

    move-result v0

    return v0
.end method

.method public loadBytes([BI)J
    .locals 0

    .line 0
    invoke-static {p1, p2}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide p1

    return-wide p1
.end method

.method public loadBytes([BII)J
    .locals 0

    .line 0
    invoke-static {p1, p2, p3}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BII)J

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

.method public reset()V
    .locals 25

    move-object/from16 v0, p0

    .line 0
    invoke-super/range {p0 .. p0}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->reset()V

    iget-object v1, v0, Lorg/bouncycastle/crypto/digests/AsconDigest;->asconParameters:Lorg/bouncycastle/crypto/digests/AsconDigest$AsconParameters;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v3, v0, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    const-wide v10, -0x29095ab280adc883L    # -8.509507695364991E110

    const-wide v12, -0x5ec3bd5ddc417279L

    const-wide v4, 0x1470194fc6528a6L

    const-wide v6, 0x738ec38ac0adffa7L    # 4.301965536445435E248

    const-wide v8, 0x2ec8e3296c76384cL    # 2.5621814324380113E-83

    invoke-virtual/range {v3 .. v13}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->set(JJJJJ)V

    return-void

    :cond_1
    iget-object v14, v0, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    const-wide v21, 0x43189921b8f8e3e8L    # 1.730942389336314E15

    const-wide v23, 0x348fa5c9d525e140L    # 1.613361697436867E-55

    const-wide v15, -0x116c675524980fc3L    # -4.533484413786092E224

    const-wide v17, -0x744de7ce39f0effeL

    const-wide v19, -0x4b756d24672a259eL    # -1.3546972168863344E-55

    invoke-virtual/range {v14 .. v24}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->set(JJJJJ)V

    return-void
.end method

.method public setBytes(J[BI)V
    .locals 0

    .line 0
    invoke-static {p1, p2, p3, p4}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    return-void
.end method

.method public setBytes(J[BII)V
    .locals 0

    .line 0
    invoke-static {p1, p2, p3, p4, p5}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BII)V

    return-void
.end method

.method public bridge synthetic update(B)V
    .locals 0

    .line 0
    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->update(B)V

    return-void
.end method

.method public bridge synthetic update([BII)V
    .locals 0

    .line 0
    invoke-super {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->update([BII)V

    return-void
.end method
