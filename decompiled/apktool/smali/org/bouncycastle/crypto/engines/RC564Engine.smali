.class public Lorg/bouncycastle/crypto/engines/RC564Engine;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/BlockCipher;


# static fields
.field public static final P64:J = -0x481eae9d7512d595L

.field public static final Q64:J = -0x61c8864680b583ebL

.field public static final bytesPerWord:I = 0x8

.field public static final wordSize:I = 0x40


# instance fields
.field public _S:[J

.field public _noRounds:I

.field public forEncryption:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xc

    iput v0, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_noRounds:I

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    return-void
.end method

.method private bytesToWord([BI)J
    .locals 5

    const-wide/16 v0, 0x0

    const/4 v2, 0x7

    :goto_0
    if-ltz v2, :cond_0

    const/16 v3, 0x8

    shl-long/2addr v0, v3

    add-int v3, v2, p2

    .line 0
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    add-long/2addr v0, v3

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method private decryptBlock([BI[BI)I
    .locals 7

    .line 0
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/RC564Engine;->bytesToWord([BI)J

    move-result-wide v0

    add-int/lit8 p2, p2, 0x8

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/RC564Engine;->bytesToWord([BI)J

    move-result-wide p1

    iget v2, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_noRounds:I

    :goto_0
    const/4 v3, 0x1

    if-lt v2, v3, :cond_0

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    mul-int/lit8 v4, v2, 0x2

    add-int/lit8 v5, v4, 0x1

    aget-wide v5, v3, v5

    sub-long/2addr p1, v5

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/bouncycastle/crypto/engines/RC564Engine;->rotateRight(JJ)J

    move-result-wide p1

    xor-long/2addr p1, v0

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    aget-wide v4, v3, v4

    sub-long/2addr v0, v4

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/bouncycastle/crypto/engines/RC564Engine;->rotateRight(JJ)J

    move-result-wide v0

    xor-long/2addr v0, p1

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    const/4 v4, 0x0

    aget-wide v4, v2, v4

    sub-long/2addr v0, v4

    invoke-direct {p0, v0, v1, p3, p4}, Lorg/bouncycastle/crypto/engines/RC564Engine;->wordToBytes(J[BI)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    aget-wide v1, v0, v3

    sub-long/2addr p1, v1

    add-int/lit8 p4, p4, 0x8

    invoke-direct {p0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/engines/RC564Engine;->wordToBytes(J[BI)V

    const/16 p1, 0x10

    return p1
.end method

.method private encryptBlock([BI[BI)I
    .locals 8

    .line 0
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/RC564Engine;->bytesToWord([BI)J

    move-result-wide v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    const/4 v3, 0x0

    aget-wide v3, v2, v3

    add-long/2addr v0, v3

    add-int/lit8 p2, p2, 0x8

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/RC564Engine;->bytesToWord([BI)J

    move-result-wide p1

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    const/4 v3, 0x1

    aget-wide v4, v2, v3

    add-long/2addr p1, v4

    const/4 v2, 0x1

    :goto_0
    iget v4, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_noRounds:I

    if-gt v2, v4, :cond_0

    xor-long/2addr v0, p1

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/bouncycastle/crypto/engines/RC564Engine;->rotateLeft(JJ)J

    move-result-wide v0

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    mul-int/lit8 v5, v2, 0x2

    aget-wide v6, v4, v5

    add-long/2addr v0, v6

    xor-long/2addr p1, v0

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/bouncycastle/crypto/engines/RC564Engine;->rotateLeft(JJ)J

    move-result-wide p1

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    add-int/2addr v5, v3

    aget-wide v5, v4, v5

    add-long/2addr p1, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, v0, v1, p3, p4}, Lorg/bouncycastle/crypto/engines/RC564Engine;->wordToBytes(J[BI)V

    add-int/lit8 p4, p4, 0x8

    invoke-direct {p0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/engines/RC564Engine;->wordToBytes(J[BI)V

    const/16 p1, 0x10

    return p1
.end method

.method private rotateLeft(JJ)J
    .locals 4

    const-wide/16 v0, 0x3f

    and-long/2addr p3, v0

    long-to-int v0, p3

    shl-long v0, p1, v0

    const-wide/16 v2, 0x40

    sub-long/2addr v2, p3

    long-to-int p3, v2

    ushr-long/2addr p1, p3

    or-long/2addr p1, v0

    return-wide p1
.end method

.method private rotateRight(JJ)J
    .locals 4

    const-wide/16 v0, 0x3f

    and-long/2addr p3, v0

    long-to-int v0, p3

    ushr-long v0, p1, v0

    const-wide/16 v2, 0x40

    sub-long/2addr v2, p3

    long-to-int p3, v2

    shl-long/2addr p1, p3

    or-long/2addr p1, v0

    return-wide p1
.end method

.method private setKey([B)V
    .locals 12

    .line 0
    array-length v0, p1

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    new-array v1, v0, [J

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    array-length v4, p1

    if-eq v3, v4, :cond_0

    div-int/lit8 v4, v3, 0x8

    aget-wide v5, v1, v4

    aget-byte v7, p1, v3

    and-int/lit16 v7, v7, 0xff

    int-to-long v7, v7

    rem-int/lit8 v9, v3, 0x8

    mul-int/lit8 v9, v9, 0x8

    shl-long/2addr v7, v9

    add-long/2addr v5, v7

    aput-wide v5, v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget p1, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_noRounds:I

    add-int/lit8 p1, p1, 0x1

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [J

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    const-wide v3, -0x481eae9d7512d595L    # -1.590398847350152E-39

    aput-wide v3, p1, v2

    const/4 p1, 0x1

    :goto_1
    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    array-length v4, v3

    if-ge p1, v4, :cond_1

    add-int/lit8 v4, p1, -0x1

    aget-wide v4, v3, v4

    const-wide v6, -0x61c8864680b583ebL

    add-long/2addr v4, v6

    aput-wide v4, v3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    array-length p1, v3

    if-le v0, p1, :cond_2

    mul-int/lit8 p1, v0, 0x3

    goto :goto_2

    :cond_2
    array-length p1, v3

    mul-int/lit8 p1, p1, 0x3

    :goto_2
    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-wide v5, v3

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_3
    if-ge v2, p1, :cond_3

    iget-object v9, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    aget-wide v10, v9, v7

    add-long/2addr v10, v3

    add-long/2addr v10, v5

    const-wide/16 v3, 0x3

    invoke-direct {p0, v10, v11, v3, v4}, Lorg/bouncycastle/crypto/engines/RC564Engine;->rotateLeft(JJ)J

    move-result-wide v3

    aput-wide v3, v9, v7

    aget-wide v9, v1, v8

    add-long/2addr v9, v3

    add-long/2addr v9, v5

    add-long/2addr v5, v3

    invoke-direct {p0, v9, v10, v5, v6}, Lorg/bouncycastle/crypto/engines/RC564Engine;->rotateLeft(JJ)J

    move-result-wide v5

    aput-wide v5, v1, v8

    add-int/lit8 v7, v7, 0x1

    iget-object v9, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_S:[J

    array-length v9, v9

    rem-int/2addr v7, v9

    add-int/lit8 v8, v8, 0x1

    rem-int/2addr v8, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    return-void
.end method

.method private wordToBytes(J[BI)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    add-int v2, v0, p4

    long-to-int v3, p1

    int-to-byte v3, v3

    .line 0
    aput-byte v3, p3, v2

    ushr-long/2addr p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public getAlgorithmName()Ljava/lang/String;
    .locals 1

    const-string v0, "RC5-64"

    return-object v0
.end method

.method public getBlockSize()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 3

    .line 2
    instance-of v0, p2, Lorg/bouncycastle/crypto/params/RC5Parameters;

    if-eqz v0, :cond_0

    .line 7
    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/crypto/params/RC5Parameters;

    .line 9
    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->forEncryption:Z

    .line 12
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RC5Parameters;->getRounds()I

    move-result v1

    .line 15
    iput v1, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->_noRounds:I

    .line 18
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RC5Parameters;->getKey()[B

    move-result-object v0

    .line 22
    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/RC564Engine;->setKey([B)V

    .line 24
    new-instance v1, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;

    .line 27
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/RC564Engine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    .line 29
    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    .line 34
    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/Utils;->getPurpose(Z)Lorg/bouncycastle/crypto/CryptoServicePurpose;

    move-result-object p1

    .line 38
    invoke-direct {v1, v2, v0, p2, p1}, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;-><init>(Ljava/lang/String;ILjava/lang/Object;Lorg/bouncycastle/crypto/CryptoServicePurpose;)V

    .line 41
    invoke-static {v1}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->checkConstraints(Lorg/bouncycastle/crypto/CryptoServiceProperties;)V

    return-void

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid parameter passed to RC564 init - "

    .line 0
    invoke-static {v0, p2}, Ll/᩶۫᩷;->֫(Ljava/lang/String;Lorg/bouncycastle/crypto/CipherParameters;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public processBlock([BI[BI)I
    .locals 1

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/engines/RC564Engine;->forEncryption:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/engines/RC564Engine;->encryptBlock([BI[BI)I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/engines/RC564Engine;->decryptBlock([BI[BI)I

    move-result p1

    return p1
.end method

.method public reset()V
    .locals 0

    return-void
.end method
