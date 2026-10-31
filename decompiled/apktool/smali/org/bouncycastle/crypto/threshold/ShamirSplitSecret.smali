.class public Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/threshold/SplitSecret;


# instance fields
.field public final poly:Lorg/bouncycastle/crypto/threshold/Polynomial;

.field public final secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/threshold/Polynomial;[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    iput-object p1, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->poly:Lorg/bouncycastle/crypto/threshold/Polynomial;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Algorithm;Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    invoke-static {p1, p2}, Lorg/bouncycastle/crypto/threshold/Polynomial;->newInstance(Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Algorithm;Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;)Lorg/bouncycastle/crypto/threshold/Polynomial;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->poly:Lorg/bouncycastle/crypto/threshold/Polynomial;

    return-void
.end method


# virtual methods
.method public divide(I)Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;
    .locals 5

    const/4 v0, 0x0

    .line 0
    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;->getEncoded()[B

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    array-length v3, v1

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->poly:Lorg/bouncycastle/crypto/threshold/Polynomial;

    aget-byte v4, v1, v2

    and-int/lit16 v4, v4, 0xff

    invoke-virtual {v3, v4, p1}, Lorg/bouncycastle/crypto/threshold/Polynomial;->gfDiv(II)B

    move-result v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    new-instance v3, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    add-int/lit8 v4, v0, 0x1

    invoke-direct {v3, v1, v4}, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;-><init>([BI)V

    aput-object v3, v2, v0

    move v0, v4

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public getSecret()[B
    .locals 12

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    array-length v1, v0

    new-array v2, v1, [B

    add-int/lit8 v3, v1, -0x1

    new-array v4, v3, [B

    const/4 v5, 0x0

    aget-object v0, v0, v5

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;->getEncoded()[B

    move-result-object v0

    array-length v0, v0

    const/4 v6, 0x2

    new-array v6, v6, [I

    const/4 v7, 0x1

    aput v0, v6, v7

    aput v1, v6, v5

    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    :goto_0
    if-ge v5, v1, :cond_3

    iget-object v6, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;->getEncoded()[B

    move-result-object v6

    aput-object v6, v0, v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1
    if-ge v6, v1, :cond_1

    if-eq v6, v5, :cond_0

    add-int/lit8 v8, v7, 0x1

    int-to-byte v8, v8

    iget-object v9, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->poly:Lorg/bouncycastle/crypto/threshold/Polynomial;

    iget-object v10, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    aget-object v11, v10, v6

    iget v11, v11, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;->r:I

    aget-object v10, v10, v5

    iget v10, v10, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;->r:I

    xor-int/2addr v10, v11

    invoke-virtual {v9, v11, v10}, Lorg/bouncycastle/crypto/threshold/Polynomial;->gfDiv(II)B

    move-result v9

    aput-byte v9, v4, v7

    move v7, v8

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    const/4 v7, 0x1

    :goto_2
    if-eq v6, v3, :cond_2

    iget-object v8, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->poly:Lorg/bouncycastle/crypto/threshold/Polynomial;

    and-int/lit16 v7, v7, 0xff

    aget-byte v9, v4, v6

    and-int/lit16 v9, v9, 0xff

    invoke-virtual {v8, v7, v9}, Lorg/bouncycastle/crypto/threshold/Polynomial;->gfMul(II)B

    move-result v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    aput-byte v7, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->poly:Lorg/bouncycastle/crypto/threshold/Polynomial;

    invoke-virtual {v1, v2, v0}, Lorg/bouncycastle/crypto/threshold/Polynomial;->gfVecMul([B[[B)[B

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getSecretShares()[Lorg/bouncycastle/crypto/threshold/SecretShare;
    .locals 1

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->getSecretShares()[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    move-result-object v0

    return-object v0
.end method

.method public getSecretShares()[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    return-object v0
.end method

.method public multiple(I)Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;
    .locals 5

    const/4 v0, 0x0

    .line 0
    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;->getEncoded()[B

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    array-length v3, v1

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->poly:Lorg/bouncycastle/crypto/threshold/Polynomial;

    aget-byte v4, v1, v2

    and-int/lit16 v4, v4, 0xff

    invoke-virtual {v3, v4, p1}, Lorg/bouncycastle/crypto/threshold/Polynomial;->gfMul(II)B

    move-result v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecret;->secretShares:[Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    new-instance v3, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;

    add-int/lit8 v4, v0, 0x1

    invoke-direct {v3, v1, v4}, Lorg/bouncycastle/crypto/threshold/ShamirSplitSecretShare;-><init>([BI)V

    aput-object v3, v2, v0

    move v0, v4

    goto :goto_0

    :cond_1
    return-object p0
.end method
