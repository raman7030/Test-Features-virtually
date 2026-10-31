.class public Lorg/bouncycastle/crypto/macs/Blake3Mac;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/Mac;


# instance fields
.field public final theDigest:Lorg/bouncycastle/crypto/digests/Blake3Digest;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/digests/Blake3Digest;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/macs/Blake3Mac;->theDigest:Lorg/bouncycastle/crypto/digests/Blake3Digest;

    return-void
.end method


# virtual methods
.method public doFinal([BI)I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/Blake3Mac;->theDigest:Lorg/bouncycastle/crypto/digests/Blake3Digest;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/crypto/digests/Blake3Digest;->doFinal([BI)I

    move-result p1

    return p1
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/macs/Blake3Mac;->theDigest:Lorg/bouncycastle/crypto/digests/Blake3Digest;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/digests/Blake3Digest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Mac"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMacSize()I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/Blake3Mac;->theDigest:Lorg/bouncycastle/crypto/digests/Blake3Digest;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/digests/Blake3Digest;->getDigestSize()I

    move-result v0

    return v0
.end method

.method public init(Lorg/bouncycastle/crypto/CipherParameters;)V
    .locals 2

    .line 2
    instance-of v0, p1, Lorg/bouncycastle/crypto/params/KeyParameter;

    if-eqz v0, :cond_0

    .line 7
    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 10
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    .line 14
    invoke-static {v0}, Lorg/bouncycastle/crypto/params/Blake3Parameters;->key([B)Lorg/bouncycastle/crypto/params/Blake3Parameters;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 19
    :goto_0
    instance-of v1, v0, Lorg/bouncycastle/crypto/params/Blake3Parameters;

    if-eqz v1, :cond_2

    .line 23
    check-cast v0, Lorg/bouncycastle/crypto/params/Blake3Parameters;

    .line 26
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/Blake3Parameters;->getKey()[B

    move-result-object p1

    if-eqz p1, :cond_1

    .line 31
    iget-object p1, p0, Lorg/bouncycastle/crypto/macs/Blake3Mac;->theDigest:Lorg/bouncycastle/crypto/digests/Blake3Digest;

    .line 34
    invoke-virtual {p1, v0}, Lorg/bouncycastle/crypto/digests/Blake3Digest;->init(Lorg/bouncycastle/crypto/params/Blake3Parameters;)V

    return-void

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Blake3Mac requires a key parameter."

    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    throw p1

    .line 45
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid parameter passed to Blake3Mac init - "

    .line 0
    invoke-static {v1, p1}, Ll/᩶۫᩷;->֫(Ljava/lang/String;Lorg/bouncycastle/crypto/CipherParameters;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public reset()V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/Blake3Mac;->theDigest:Lorg/bouncycastle/crypto/digests/Blake3Digest;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/digests/Blake3Digest;->reset()V

    return-void
.end method

.method public update(B)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/Blake3Mac;->theDigest:Lorg/bouncycastle/crypto/digests/Blake3Digest;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/crypto/digests/Blake3Digest;->update(B)V

    return-void
.end method

.method public update([BII)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/Blake3Mac;->theDigest:Lorg/bouncycastle/crypto/digests/Blake3Digest;

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/Blake3Digest;->update([BII)V

    return-void
.end method
