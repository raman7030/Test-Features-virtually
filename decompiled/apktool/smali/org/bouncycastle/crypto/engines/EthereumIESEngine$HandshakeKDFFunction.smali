.class public Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/DigestDerivationFunction;


# instance fields
.field public counterStart:I

.field public digest:Lorg/bouncycastle/crypto/Digest;

.field public iv:[B

.field public shared:[B


# direct methods
.method public constructor <init>(ILorg/bouncycastle/crypto/Digest;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->counterStart:I

    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->digest:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method


# virtual methods
.method public generateBytes([BII)I
    .locals 12

    .line 0
    array-length v0, p1

    sub-int/2addr v0, p3

    if-lt v0, p2, :cond_5

    int-to-long v0, p3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v2

    const-wide v3, 0x1ffffffffL

    cmp-long v5, v0, v3

    if-gtz v5, :cond_4

    int-to-long v3, v2

    add-long v5, v0, v3

    const-wide/16 v7, 0x1

    sub-long/2addr v5, v7

    div-long/2addr v5, v3

    long-to-int v3, v5

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v4

    new-array v4, v4, [B

    const/4 v5, 0x4

    new-array v6, v5, [B

    iget v7, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->counterStart:I

    const/4 v8, 0x0

    invoke-static {v7, v6, v8}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    iget v7, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->counterStart:I

    and-int/lit16 v7, v7, -0x100

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v3, :cond_3

    iget-object v10, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v10, v6, v8, v5}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->digest:Lorg/bouncycastle/crypto/Digest;

    iget-object v10, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->shared:[B

    array-length v11, v10

    invoke-interface {v5, v10, v8, v11}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->iv:[B

    if-eqz v5, :cond_0

    iget-object v10, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->digest:Lorg/bouncycastle/crypto/Digest;

    array-length v11, v5

    invoke-interface {v10, v5, v8, v11}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    :cond_0
    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5, v4, v8}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    if-le p3, v2, :cond_1

    invoke-static {v4, v8, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    goto :goto_1

    :cond_1
    invoke-static {v4, v8, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    const/4 v5, 0x3

    aget-byte v10, v6, v5

    add-int/lit8 v10, v10, 0x1

    int-to-byte v10, v10

    aput-byte v10, v6, v5

    if-nez v10, :cond_2

    add-int/lit16 v7, v7, 0x100

    invoke-static {v7, v6, v8}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    :cond_2
    add-int/lit8 v9, v9, 0x1

    const/4 v5, 0x4

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/Digest;->reset()V

    long-to-int p1, v0

    return p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "output length too large"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lorg/bouncycastle/crypto/OutputLengthException;

    const-string p2, "output buffer too small"

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/OutputLengthException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getDigest()Lorg/bouncycastle/crypto/Digest;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->digest:Lorg/bouncycastle/crypto/Digest;

    return-object v0
.end method

.method public init(Lorg/bouncycastle/crypto/DerivationParameters;)V
    .locals 1

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/crypto/params/KDFParameters;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/bouncycastle/crypto/params/KDFParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/KDFParameters;->getSharedSecret()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->shared:[B

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/KDFParameters;->getIV()[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->iv:[B

    return-void

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/crypto/params/ISO18033KDFParameters;

    if-eqz v0, :cond_1

    check-cast p1, Lorg/bouncycastle/crypto/params/ISO18033KDFParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ISO18033KDFParameters;->getSeed()[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->shared:[B

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/EthereumIESEngine$HandshakeKDFFunction;->iv:[B

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "KDF parameters required for generator"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
