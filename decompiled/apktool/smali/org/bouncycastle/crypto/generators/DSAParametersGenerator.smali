.class public Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;
.super Ljava/lang/Object;


# static fields
.field public static final ONE:Ljava/math/BigInteger;

.field public static final TWO:Ljava/math/BigInteger;

.field public static final ZERO:Ljava/math/BigInteger;


# instance fields
.field public L:I

.field public N:I

.field public certainty:I

.field public digest:Lorg/bouncycastle/crypto/Digest;

.field public iterations:I

.field public random:Ljava/security/SecureRandom;

.field public usageIndex:I

.field public use186_3:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 0
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->ZERO:Ljava/math/BigInteger;

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->ONE:Ljava/math/BigInteger;

    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->TWO:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/util/DigestFactory;->createSHA1()Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/Digest;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method

.method public static calculateGenerator_FIPS186_2(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;
    .locals 4

    .line 0
    sget-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->ONE:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    sget-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->TWO:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    :cond_0
    sget-object v1, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->TWO:Ljava/math/BigInteger;

    invoke-static {v1, v0, p2}, Lorg/bouncycastle/util/BigIntegers;->createRandomInRange(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, p1, p0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    return-object v1
.end method

.method public static calculateGenerator_FIPS186_3_Unverifiable(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->calculateGenerator_FIPS186_2(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static calculateGenerator_FIPS186_3_Verifiable(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;Ljava/math/BigInteger;[BI)Ljava/math/BigInteger;
    .locals 5

    .line 0
    sget-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->ONE:Ljava/math/BigInteger;

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p2

    const-string v0, "6767656E"

    invoke-static {v0}, Lorg/bouncycastle/util/encoders/Hex;->decodeStrict(Ljava/lang/String;)[B

    move-result-object v0

    array-length v1, p3

    array-length v2, v0

    add-int/2addr v1, v2

    add-int/lit8 v2, v1, 0x3

    new-array v2, v2, [B

    array-length v3, p3

    const/4 v4, 0x0

    invoke-static {p3, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p3, p3

    array-length v3, v0

    invoke-static {v0, v4, v2, p3, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    int-to-byte p3, p4

    aput-byte p3, v2, v1

    invoke-interface {p0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result p3

    new-array p3, p3, [B

    const/4 p4, 0x1

    const/4 v0, 0x1

    :goto_0
    const/high16 v1, 0x10000

    if-ge v0, v1, :cond_1

    invoke-static {v2}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    invoke-static {p0, v2, p3, v4}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[BI)V

    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, p4, p3}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v1, p2, p1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->TWO:Ljava/math/BigInteger;

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-ltz v3, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private generateParameters_FIPS186_2()Lorg/bouncycastle/crypto/params/DSAParameters;
    .locals 15

    const/16 v0, 0x14

    new-array v1, v0, [B

    new-array v2, v0, [B

    new-array v3, v0, [B

    new-array v4, v0, [B

    .line 0
    iget v5, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->L:I

    add-int/lit8 v6, v5, -0x1

    div-int/lit16 v6, v6, 0xa0

    div-int/lit8 v5, v5, 0x8

    new-array v7, v5, [B

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    instance-of v8, v8, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    if-eqz v8, :cond_6

    :cond_0
    :goto_0
    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->random:Ljava/security/SecureRandom;

    invoke-virtual {v8, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    const/4 v9, 0x0

    invoke-static {v8, v1, v2, v9}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[BI)V

    invoke-static {v1, v9, v3, v9, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v3}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-static {v8, v3, v3, v9}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[BI)V

    const/4 v8, 0x0

    :goto_1
    if-eq v8, v0, :cond_1

    aget-byte v10, v2, v8

    aget-byte v11, v3, v8

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, v4, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    aget-byte v8, v4, v9

    or-int/lit8 v8, v8, -0x80

    int-to-byte v8, v8

    aput-byte v8, v4, v9

    const/16 v8, 0x13

    aget-byte v10, v4, v8

    const/4 v11, 0x1

    or-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, v4, v8

    new-instance v8, Ljava/math/BigInteger;

    invoke-direct {v8, v11, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {p0, v8}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->isProbablePrime(Ljava/math/BigInteger;)Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object v10

    invoke-static {v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    const/4 v12, 0x0

    :goto_2
    const/16 v13, 0x1000

    if-ge v12, v13, :cond_0

    const/4 v0, 0x1

    :goto_3
    if-gt v0, v6, :cond_3

    invoke-static {v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    iget-object v13, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    mul-int/lit8 v14, v0, 0x14

    sub-int v14, v5, v14

    invoke-static {v13, v10, v7, v14}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[BI)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    mul-int/lit8 v0, v6, 0x14

    sub-int v0, v5, v0

    invoke-static {v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    iget-object v13, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-static {v13, v10, v2, v9}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[BI)V

    rsub-int/lit8 v13, v0, 0x14

    invoke-static {v2, v13, v7, v9, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v0, v7, v9

    or-int/lit8 v0, v0, -0x80

    int-to-byte v0, v0

    aput-byte v0, v7, v9

    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v11, v7}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v8, v11}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v13

    invoke-virtual {v0, v13}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v13

    sget-object v14, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v13, v14}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v13

    invoke-virtual {v0, v13}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v13

    iget v14, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->L:I

    if-eq v13, v14, :cond_4

    goto :goto_4

    :cond_4
    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->isProbablePrime(Ljava/math/BigInteger;)Z

    move-result v13

    if-eqz v13, :cond_5

    iget-object v2, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->random:Ljava/security/SecureRandom;

    invoke-static {v0, v8, v2}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->calculateGenerator_FIPS186_2(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v2

    new-instance v3, Lorg/bouncycastle/crypto/params/DSAParameters;

    new-instance v4, Lorg/bouncycastle/crypto/params/DSAValidationParameters;

    invoke-direct {v4, v1, v12}, Lorg/bouncycastle/crypto/params/DSAValidationParameters;-><init>([BI)V

    invoke-direct {v3, v0, v8, v2, v4}, Lorg/bouncycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DSAValidationParameters;)V

    return-object v3

    :cond_5
    :goto_4
    add-int/lit8 v12, v12, 0x1

    const/16 v0, 0x14

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "can only use SHA-1 for generating FIPS 186-2 parameters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private generateParameters_FIPS186_3()Lorg/bouncycastle/crypto/params/DSAParameters;
    .locals 15

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    iget v2, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->N:I

    div-int/lit8 v2, v2, 0x8

    new-array v2, v2, [B

    iget v3, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->L:I

    add-int/lit8 v4, v3, -0x1

    div-int/2addr v4, v1

    add-int/lit8 v5, v3, -0x1

    rem-int/2addr v5, v1

    div-int/lit8 v3, v3, 0x8

    new-array v1, v3, [B

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v5

    new-array v6, v5, [B

    :cond_0
    :goto_0
    iget-object v7, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->random:Ljava/security/SecureRandom;

    invoke-virtual {v7, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 v7, 0x0

    invoke-static {v0, v2, v6, v7}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[BI)V

    new-instance v8, Ljava/math/BigInteger;

    const/4 v9, 0x1

    invoke-direct {v8, v9, v6}, Ljava/math/BigInteger;-><init>(I[B)V

    sget-object v10, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->ONE:Ljava/math/BigInteger;

    iget v11, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->N:I

    sub-int/2addr v11, v9

    invoke-virtual {v10, v11}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object v8

    iget v10, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->N:I

    sub-int/2addr v10, v9

    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object v8

    invoke-direct {p0, v8}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->isProbablePrime(Ljava/math/BigInteger;)Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object v10

    iget v11, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->L:I

    mul-int/lit8 v11, v11, 0x4

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_0

    const/4 v13, 0x1

    :goto_2
    if-gt v13, v4, :cond_2

    invoke-static {v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    mul-int v14, v13, v5

    sub-int v14, v3, v14

    invoke-static {v0, v10, v1, v14}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[BI)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_2
    mul-int v13, v4, v5

    sub-int v13, v3, v13

    invoke-static {v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    invoke-static {v0, v10, v6, v7}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[BI)V

    sub-int v14, v5, v13

    invoke-static {v6, v14, v1, v7, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v13, v1, v7

    or-int/lit8 v13, v13, -0x80

    int-to-byte v13, v13

    aput-byte v13, v1, v7

    new-instance v7, Ljava/math/BigInteger;

    invoke-direct {v7, v9, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v13

    sget-object v14, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v13, v14}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v7}, Ljava/math/BigInteger;->bitLength()I

    move-result v13

    iget v14, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->L:I

    if-eq v13, v14, :cond_3

    goto :goto_3

    :cond_3
    invoke-direct {p0, v7}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->isProbablePrime(Ljava/math/BigInteger;)Z

    move-result v13

    if-eqz v13, :cond_5

    iget v1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->usageIndex:I

    if-ltz v1, :cond_4

    invoke-static {v0, v7, v8, v2, v1}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->calculateGenerator_FIPS186_3_Verifiable(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;Ljava/math/BigInteger;[BI)Ljava/math/BigInteger;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lorg/bouncycastle/crypto/params/DSAParameters;

    new-instance v3, Lorg/bouncycastle/crypto/params/DSAValidationParameters;

    iget v4, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->usageIndex:I

    invoke-direct {v3, v2, v12, v4}, Lorg/bouncycastle/crypto/params/DSAValidationParameters;-><init>([BII)V

    invoke-direct {v1, v7, v8, v0, v3}, Lorg/bouncycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DSAValidationParameters;)V

    return-object v1

    :cond_4
    iget-object v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->random:Ljava/security/SecureRandom;

    invoke-static {v7, v8, v0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->calculateGenerator_FIPS186_3_Unverifiable(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/params/DSAParameters;

    new-instance v3, Lorg/bouncycastle/crypto/params/DSAValidationParameters;

    invoke-direct {v3, v2, v12}, Lorg/bouncycastle/crypto/params/DSAValidationParameters;-><init>([BI)V

    invoke-direct {v1, v7, v8, v0, v3}, Lorg/bouncycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DSAValidationParameters;)V

    return-object v1

    :cond_5
    :goto_3
    add-int/lit8 v12, v12, 0x1

    const/4 v7, 0x0

    goto :goto_1
.end method

.method public static getDefaultN(I)I
    .locals 1

    const/16 v0, 0x400

    if-le p0, v0, :cond_0

    const/16 p0, 0x100

    return p0

    :cond_0
    const/16 p0, 0xa0

    return p0
.end method

.method public static getMinimumIterations(I)I
    .locals 1

    const/16 v0, 0x400

    if-gt p0, v0, :cond_0

    const/16 p0, 0x28

    return p0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    .line 0
    div-int/2addr p0, v0

    mul-int/lit8 p0, p0, 0x8

    add-int/lit8 p0, p0, 0x30

    return p0
.end method

.method public static hash(Lorg/bouncycastle/crypto/Digest;[B[BI)V
    .locals 2

    const/4 v0, 0x0

    .line 0
    array-length v1, p1

    invoke-interface {p0, p1, v0, v1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {p0, p2, p3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    return-void
.end method

.method public static inc([B)V
    .locals 2

    .line 0
    array-length v0, p0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    aget-byte v1, p0, v0

    add-int/lit8 v1, v1, 0x1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    if-eqz v1, :cond_0

    :cond_1
    return-void
.end method

.method private isProbablePrime(Ljava/math/BigInteger;)Z
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->certainty:I

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public generateParameters()Lorg/bouncycastle/crypto/params/DSAParameters;
    .locals 1

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->use186_3:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->generateParameters_FIPS186_3()Lorg/bouncycastle/crypto/params/DSAParameters;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->generateParameters_FIPS186_2()Lorg/bouncycastle/crypto/params/DSAParameters;

    move-result-object v0

    return-object v0
.end method

.method public init(IILjava/security/SecureRandom;)V
    .locals 0

    .line 0
    iput p1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->L:I

    invoke-static {p1}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->getDefaultN(I)I

    move-result p1

    iput p1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->N:I

    iput p2, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->certainty:I

    iget p1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->L:I

    invoke-static {p1}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->getMinimumIterations(I)I

    move-result p1

    add-int/lit8 p2, p2, 0x1

    div-int/lit8 p2, p2, 0x2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->iterations:I

    iput-object p3, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->random:Ljava/security/SecureRandom;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->use186_3:Z

    const/4 p1, -0x1

    iput p1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->usageIndex:I

    return-void
.end method

.method public init(Lorg/bouncycastle/crypto/params/DSAParameterGenerationParameters;)V
    .locals 5

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/DSAParameterGenerationParameters;->getL()I

    move-result v0

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/DSAParameterGenerationParameters;->getN()I

    move-result v1

    const/16 v2, 0x400

    if-lt v0, v2, :cond_7

    const/16 v3, 0xc00

    if-gt v0, v3, :cond_7

    rem-int/lit16 v4, v0, 0x400

    if-nez v4, :cond_7

    if-ne v0, v2, :cond_1

    const/16 v2, 0xa0

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "N must be 160 for L = 1024"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/16 v2, 0x800

    const/16 v4, 0x100

    if-ne v0, v2, :cond_3

    const/16 v2, 0xe0

    if-eq v1, v2, :cond_3

    if-ne v1, v4, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "N must be 224 or 256 for L = 2048"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    if-ne v0, v3, :cond_5

    if-ne v1, v4, :cond_4

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "N must be 256 for L = 3072"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    iget-object v2, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v2

    mul-int/lit8 v2, v2, 0x8

    if-lt v2, v1, :cond_6

    iput v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->L:I

    iput v1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->N:I

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/DSAParameterGenerationParameters;->getCertainty()I

    move-result v1

    iput v1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->certainty:I

    invoke-static {v0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->getMinimumIterations(I)I

    move-result v0

    iget v1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->certainty:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->iterations:I

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/DSAParameterGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->random:Ljava/security/SecureRandom;

    iput-boolean v2, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->use186_3:Z

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/DSAParameterGenerationParameters;->getUsageIndex()I

    move-result p1

    iput p1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->usageIndex:I

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Digest output size too small for value of N"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "L values must be between 1024 and 3072 and a multiple of 1024"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
