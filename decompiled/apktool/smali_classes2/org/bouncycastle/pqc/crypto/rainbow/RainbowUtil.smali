.class public Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static cloneArray([[S)[[S
    .locals 3

    .line 0
    array-length v0, p0

    new-array v0, v0, [[S

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-object v2, p0, v1

    invoke-static {v2}, Lorg/bouncycastle/util/Arrays;->clone([S)[S

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static cloneArray([[[S)[[[S
    .locals 6

    .line 0
    array-length v0, p0

    const/4 v1, 0x0

    aget-object v2, p0, v1

    array-length v2, v2

    const/4 v3, 0x2

    new-array v3, v3, [I

    const/4 v4, 0x1

    aput v2, v3, v4

    aput v0, v3, v1

    const-class v0, [S

    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[[S

    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_1

    const/4 v3, 0x0

    :goto_1
    aget-object v4, p0, v1

    array-length v4, v4

    if-ge v3, v4, :cond_0

    aget-object v4, v0, v2

    aget-object v5, p0, v2

    aget-object v5, v5, v3

    invoke-static {v5}, Lorg/bouncycastle/util/Arrays;->clone([S)[S

    move-result-object v5

    aput-object v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static convertArray([S)[B
    .locals 3

    .line 0
    array-length v0, p0

    new-array v0, v0, [B

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-short v2, p0, v1

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static convertArray([B)[S
    .locals 3

    .line 0
    array-length v0, p0

    new-array v0, v0, [S

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    int-to-short v2, v2

    aput-short v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static equals([S[S)Z
    .locals 4

    .line 0
    array-length v0, p0

    array-length v1, p1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    :goto_0
    if-ltz v0, :cond_2

    aget-short v2, p0, v0

    aget-short v3, p1, v0

    if-ne v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    and-int/2addr v1, v2

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static equals([[S[[S)Z
    .locals 4

    .line 0
    array-length v0, p0

    array-length v1, p1

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    aget-object v2, p0, v0

    aget-object v3, p1, v0

    invoke-static {v2, v3}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;->equals([S[S)Z

    move-result v2

    and-int/2addr v1, v2

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static equals([[[S[[[S)Z
    .locals 4

    .line 0
    array-length v0, p0

    array-length v1, p1

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    aget-object v2, p0, v0

    aget-object v3, p1, v0

    invoke-static {v2, v3}, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowUtil;->equals([[S[[S)Z

    move-result v2

    and-int/2addr v1, v2

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static generate_random(Ljava/security/SecureRandom;IIIZ)[[[S
    .locals 7

    const/4 v0, 0x2

    if-eqz p4, :cond_0

    add-int/lit8 v1, p2, 0x1

    mul-int v1, v1, p2

    .line 0
    div-int/2addr v1, v0

    mul-int v1, v1, p1

    goto :goto_0

    :cond_0
    mul-int v1, p1, p2

    mul-int v1, v1, p3

    :goto_0
    new-array v1, v1, [B

    invoke-virtual {p0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 p0, 0x3

    new-array p0, p0, [I

    aput p3, p0, v0

    const/4 v0, 0x1

    aput p2, p0, v0

    const/4 v0, 0x0

    aput p1, p0, v0

    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v0, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [[[S

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_1
    if-ge v0, p2, :cond_4

    const/4 v3, 0x0

    :goto_2
    if-ge v3, p3, :cond_3

    const/4 v4, 0x0

    :goto_3
    if-ge v4, p1, :cond_2

    if-eqz p4, :cond_1

    if-le v0, v3, :cond_1

    goto :goto_4

    :cond_1
    aget-object v5, p0, v4

    aget-object v5, v5, v0

    add-int/lit8 v6, v2, 0x1

    aget-byte v2, v1, v2

    and-int/lit16 v2, v2, 0xff

    int-to-short v2, v2

    aput-short v2, v5, v3

    move v2, v6

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    return-object p0
.end method

.method public static generate_random_2d(Ljava/security/SecureRandom;II)[[S
    .locals 5

    mul-int v0, p1, p2

    .line 0
    new-array v0, v0, [B

    invoke-virtual {p0, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 p0, 0x2

    new-array p0, p0, [I

    const/4 v1, 0x1

    aput p2, p0, v1

    const/4 v1, 0x0

    aput p1, p0, v1

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v1, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [[S

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_0

    aget-object v3, p0, v2

    mul-int v4, v1, p1

    add-int/2addr v4, v2

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    int-to-short v4, v4

    aput-short v4, v3, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public static getEncoded([[S)[B
    .locals 7

    .line 0
    array-length v0, p0

    const/4 v1, 0x0

    aget-object v1, p0, v1

    array-length v1, v1

    mul-int v2, v0, v1

    new-array v2, v2, [B

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v0, :cond_0

    mul-int v5, v3, v0

    add-int/2addr v5, v4

    aget-object v6, p0, v4

    aget-short v6, v6, v3

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public static getEncoded([[[SZ)[B
    .locals 9

    .line 0
    array-length v0, p0

    const/4 v1, 0x0

    aget-object v2, p0, v1

    array-length v3, v2

    aget-object v1, v2, v1

    array-length v1, v1

    if-eqz p1, :cond_0

    add-int/lit8 v2, v3, 0x1

    mul-int v2, v2, v3

    div-int/lit8 v2, v2, 0x2

    mul-int v2, v2, v0

    goto :goto_0

    :cond_0
    mul-int v2, v0, v3

    mul-int v2, v2, v1

    :goto_0
    new-array v2, v2, [B

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v4, v3, :cond_4

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v1, :cond_3

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v0, :cond_2

    if-eqz p1, :cond_1

    if-le v4, v6, :cond_1

    goto :goto_4

    :cond_1
    aget-object v8, p0, v7

    aget-object v8, v8, v4

    aget-short v8, v8, v6

    int-to-byte v8, v8

    aput-byte v8, v2, v5

    add-int/lit8 v5, v5, 0x1

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    return-object v2
.end method

.method public static hash(Lorg/bouncycastle/crypto/Digest;[BI)[B
    .locals 3

    .line 0
    invoke-interface {p0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    array-length v1, p1

    const/4 v2, 0x0

    invoke-interface {p0, p1, v2, v1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    new-array p1, v0, [B

    invoke-interface {p0, p1, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    if-ne p2, v0, :cond_0

    return-object p1

    :cond_0
    if-ge p2, v0, :cond_1

    invoke-static {p1, p2}, Lorg/bouncycastle/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p1, v0}, Lorg/bouncycastle/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    :goto_0
    sub-int/2addr p2, v0

    if-lt p2, v0, :cond_2

    invoke-interface {p0, p1, v2, v0}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    new-array p1, v0, [B

    invoke-interface {p0, p1, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    invoke-static {v1, p1}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object v1

    goto :goto_0

    :cond_2
    if-lez p2, :cond_3

    invoke-interface {p0, p1, v2, v0}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    new-array p1, v0, [B

    invoke-interface {p0, p1, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    array-length p0, v1

    add-int v0, p0, p2

    invoke-static {v1, v0}, Lorg/bouncycastle/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {p1, v2, v0, p0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_3
    return-object v1
.end method

.method public static hash(Lorg/bouncycastle/crypto/Digest;[B[B[B)[B
    .locals 3

    .line 0
    invoke-interface {p0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    array-length v1, p1

    const/4 v2, 0x0

    invoke-interface {p0, p1, v2, v1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    array-length p1, p2

    invoke-interface {p0, p2, v2, p1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    array-length p1, p3

    if-ne p1, v0, :cond_0

    invoke-interface {p0, p3, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    return-object p3

    :cond_0
    new-array p1, v0, [B

    invoke-interface {p0, p1, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    array-length p2, p3

    if-ge p2, v0, :cond_1

    array-length p0, p3

    invoke-static {p1, v2, p3, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p3

    :cond_1
    invoke-static {p1, v2, p3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p2, p3

    sub-int/2addr p2, v0

    move v1, v0

    :goto_0
    if-lt p2, v0, :cond_2

    invoke-interface {p0, p1, v2, v0}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {p0, p1, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    invoke-static {p1, v2, p3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr p2, v0

    add-int/2addr v1, v0

    goto :goto_0

    :cond_2
    if-lez p2, :cond_3

    invoke-interface {p0, p1, v2, v0}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {p0, p1, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    invoke-static {p1, v2, p3, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object p3
.end method

.method public static loadEncoded([[S[BI)I
    .locals 6

    .line 0
    array-length v0, p0

    const/4 v1, 0x0

    aget-object v1, p0, v1

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_0

    aget-object v4, p0, v3

    invoke-static {v2, v0, p2, v3}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v5

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    int-to-short v5, v5

    aput-short v5, v4, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    mul-int v0, v0, v1

    return v0
.end method

.method public static loadEncoded([[[S[BIZ)I
    .locals 9

    .line 0
    array-length v0, p0

    const/4 v1, 0x0

    aget-object v2, p0, v1

    array-length v3, v2

    aget-object v1, v2, v1

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, v3, :cond_3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v1, :cond_2

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v0, :cond_1

    if-eqz p3, :cond_0

    if-le v2, v5, :cond_0

    goto :goto_3

    :cond_0
    aget-object v7, p0, v6

    aget-object v7, v7, v2

    add-int/lit8 v8, v4, 0x1

    add-int/2addr v4, p2

    aget-byte v4, p1, v4

    and-int/lit16 v4, v4, 0xff

    int-to-short v4, v4

    aput-short v4, v7, v5

    move v4, v8

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v4
.end method
