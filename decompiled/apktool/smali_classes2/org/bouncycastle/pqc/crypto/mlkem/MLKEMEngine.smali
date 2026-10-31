.class public Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;
.super Ljava/lang/Object;


# static fields
.field public static final KyberEta2:I = 0x2

.field public static final KyberIndCpaMsgBytes:I = 0x20

.field public static final KyberN:I = 0x100

.field public static final KyberPolyBytes:I = 0x180

.field public static final KyberQ:I = 0xd01

.field public static final KyberQinv:I = 0xf301

.field public static final KyberSharedSecretBytes:I = 0x20

.field public static final KyberSymBytes:I = 0x20


# instance fields
.field public final CryptoBytes:I

.field public final CryptoCipherTextBytes:I

.field public final CryptoPublicKeyBytes:I

.field public final CryptoSecretKeyBytes:I

.field public final KyberCipherTextBytes:I

.field public final KyberEta1:I

.field public final KyberIndCpaBytes:I

.field public final KyberIndCpaPublicKeyBytes:I

.field public final KyberIndCpaSecretKeyBytes:I

.field public final KyberK:I

.field public final KyberPolyCompressedBytes:I

.field public final KyberPolyVecBytes:I

.field public final KyberPolyVecCompressedBytes:I

.field public final KyberPublicKeyBytes:I

.field public final KyberSecretKeyBytes:I

.field public final indCpa:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;

.field public random:Ljava/security/SecureRandom;

.field public final sessionKeyLength:I

.field public final symmetric:Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;


# direct methods
.method public constructor <init>(I)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberK:I

    const/16 v0, 0x80

    const/4 v1, 0x3

    const/16 v2, 0x20

    const/4 v3, 0x2

    if-eq p1, v3, :cond_2

    if-eq p1, v1, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 20
    iput v3, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberEta1:I

    const/16 v0, 0xa0

    .line 24
    iput v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyCompressedBytes:I

    mul-int/lit16 v0, p1, 0x160

    .line 28
    iput v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyVecCompressedBytes:I

    .line 30
    iput v2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->sessionKeyLength:I

    goto :goto_1

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "K: "

    const-string v2, " is not supported for Crystals Kyber"

    .line 0
    invoke-static {p1, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput v3, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberEta1:I

    goto :goto_0

    :cond_2
    iput v1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberEta1:I

    :goto_0
    iput v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyCompressedBytes:I

    mul-int/lit16 v0, p1, 0x140

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyVecCompressedBytes:I

    iput v2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->sessionKeyLength:I

    :goto_1
    mul-int/lit16 p1, p1, 0x180

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyVecBytes:I

    add-int/lit8 v0, p1, 0x20

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberIndCpaPublicKeyBytes:I

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberIndCpaSecretKeyBytes:I

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyVecCompressedBytes:I

    iget v3, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyCompressedBytes:I

    add-int/2addr v1, v3

    iput v1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberIndCpaBytes:I

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPublicKeyBytes:I

    add-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x40

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberSecretKeyBytes:I

    iput v1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberCipherTextBytes:I

    iput v2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->CryptoBytes:I

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->CryptoSecretKeyBytes:I

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->CryptoPublicKeyBytes:I

    iput v1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->CryptoCipherTextBytes:I

    new-instance p1, Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric$ShakeSymmetric;

    invoke-direct {p1}, Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric$ShakeSymmetric;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->symmetric:Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;

    new-instance p1, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;

    invoke-direct {p1, p0}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;-><init>(Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;)V

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->indCpa:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;

    return-void
.end method

.method private cmov([B[BII)V
    .locals 4

    const/4 v0, 0x0

    rsub-int/lit8 p4, p4, 0x0

    shr-int/lit8 p4, p4, 0x18

    :goto_0
    if-eq v0, p3, :cond_0

    .line 0
    aget-byte v1, p2, v0

    and-int/2addr v1, p4

    aget-byte v2, p1, v0

    not-int v3, p4

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constantTimeZeroOnEqual([B[B)I
    .locals 4

    .line 0
    array-length v0, p2

    array-length v1, p1

    xor-int/2addr v0, v1

    const/4 v1, 0x0

    :goto_0
    array-length v2, p2

    if-eq v1, v2, :cond_0

    aget-byte v2, p1, v1

    aget-byte v3, p2, v1

    xor-int/2addr v2, v3

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    and-int/lit16 p1, v0, 0xff

    return p1
.end method

.method public static getKyberEta2()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static getKyberIndCpaMsgBytes()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method


# virtual methods
.method public checkModulus([B)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lorg/bouncycastle/pqc/crypto/mlkem/PolyVec;->checkModulus(Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;[B)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public generateKemKeyPair()[[B
    .locals 3

    const/16 v0, 0x20

    new-array v1, v0, [B

    new-array v0, v0, [B

    .line 0
    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->random:Ljava/security/SecureRandom;

    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->random:Ljava/security/SecureRandom;

    invoke-virtual {v2, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-virtual {p0, v1, v0}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->generateKemKeyPairInternal([B[B)[[B

    move-result-object v0

    return-object v0
.end method

.method public generateKemKeyPairInternal([B[B)[[B
    .locals 8

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->indCpa:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;->generateKeyPair([B)[[B

    move-result-object v0

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberIndCpaSecretKeyBytes:I

    new-array v2, v1, [B

    const/4 v3, 0x1

    aget-object v4, v0, v3

    const/4 v5, 0x0

    invoke-static {v4, v5, v2, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v1, 0x20

    new-array v1, v1, [B

    iget-object v4, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->symmetric:Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;

    aget-object v6, v0, v5

    invoke-virtual {v4, v1, v6, v5}, Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;->hash_h([B[BI)V

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberIndCpaPublicKeyBytes:I

    new-array v6, v4, [B

    aget-object v0, v0, v5

    invoke-static {v0, v5, v6, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, v4, -0x20

    invoke-static {v6, v5, v0}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v7

    invoke-static {v6, v0, v4}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    invoke-static {p1, p2}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object p1

    const/4 v4, 0x6

    new-array v4, v4, [[B

    aput-object v7, v4, v5

    aput-object v0, v4, v3

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v1, v4, v0

    const/4 v0, 0x4

    aput-object p2, v4, v0

    const/4 p2, 0x5

    aput-object p1, v4, p2

    return-object v4
.end method

.method public getCryptoBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->CryptoBytes:I

    return v0
.end method

.method public getCryptoCipherTextBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->CryptoCipherTextBytes:I

    return v0
.end method

.method public getCryptoPublicKeyBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->CryptoPublicKeyBytes:I

    return v0
.end method

.method public getCryptoSecretKeyBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->CryptoSecretKeyBytes:I

    return v0
.end method

.method public getKyberCipherTextBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberCipherTextBytes:I

    return v0
.end method

.method public getKyberEta1()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberEta1:I

    return v0
.end method

.method public getKyberIndCpaBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberIndCpaBytes:I

    return v0
.end method

.method public getKyberIndCpaPublicKeyBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberIndCpaPublicKeyBytes:I

    return v0
.end method

.method public getKyberIndCpaSecretKeyBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberIndCpaSecretKeyBytes:I

    return v0
.end method

.method public getKyberK()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberK:I

    return v0
.end method

.method public getKyberPolyCompressedBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyCompressedBytes:I

    return v0
.end method

.method public getKyberPolyVecBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyVecBytes:I

    return v0
.end method

.method public getKyberPolyVecCompressedBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPolyVecCompressedBytes:I

    return v0
.end method

.method public getKyberPublicKeyBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberPublicKeyBytes:I

    return v0
.end method

.method public getKyberSecretKeyBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberSecretKeyBytes:I

    return v0
.end method

.method public getSymmetric()Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->symmetric:Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;

    return-object v0
.end method

.method public init(Ljava/security/SecureRandom;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->random:Ljava/security/SecureRandom;

    return-void
.end method

.method public kemDecrypt(Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPrivateKeyParameters;[B)[B
    .locals 8

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPrivateKeyParameters;->getEncoded()[B

    move-result-object p1

    const/16 v0, 0x40

    new-array v1, v0, [B

    new-array v2, v0, [B

    iget v3, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberIndCpaSecretKeyBytes:I

    array-length v4, p1

    invoke-static {p1, v3, v4}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v3

    iget-object v4, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->indCpa:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;

    invoke-virtual {v4, p1, p2}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;->decrypt([B[B)[B

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x20

    invoke-static {v4, v5, v1, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberSecretKeyBytes:I

    sub-int/2addr v4, v0

    invoke-static {p1, v4, v1, v6, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->symmetric:Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;

    invoke-virtual {v4, v2, v1}, Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;->hash_g([B[B)V

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberCipherTextBytes:I

    add-int/2addr v4, v6

    new-array v4, v4, [B

    iget v7, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberSecretKeyBytes:I

    sub-int/2addr v7, v6

    invoke-static {p1, v7, v4, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->KyberCipherTextBytes:I

    invoke-static {p2, v5, v4, v6, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->symmetric:Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;

    invoke-virtual {p1, v4, v4}, Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;->kdf([B[B)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->indCpa:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;

    invoke-static {v1, v5, v6}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    invoke-static {v2, v6, v0}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    invoke-virtual {p1, v3, v1, v0}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;->encrypt([B[B[B)[B

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->constantTimeZeroOnEqual([B[B)I

    move-result p1

    invoke-direct {p0, v2, v4, v6, p1}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->cmov([B[BII)V

    iget p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->sessionKeyLength:I

    invoke-static {v2, v5, p1}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    return-object p1
.end method

.method public kemEncrypt(Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPublicKeyParameters;[B)[[B
    .locals 5

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPublicKeyParameters;->getEncoded()[B

    move-result-object p1

    const/16 v0, 0x40

    new-array v1, v0, [B

    new-array v2, v0, [B

    const/4 v3, 0x0

    const/16 v4, 0x20

    invoke-static {p2, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->symmetric:Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;

    invoke-virtual {p2, v1, p1, v4}, Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;->hash_h([B[BI)V

    iget-object p2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->symmetric:Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;

    invoke-virtual {p2, v2, v1}, Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;->hash_g([B[B)V

    iget-object p2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->indCpa:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;

    invoke-static {v1, v3, v4}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    invoke-static {v2, v4, v0}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    invoke-virtual {p2, p1, v1, v0}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMIndCpa;->encrypt([B[B[B)[B

    move-result-object p1

    iget p2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMEngine;->sessionKeyLength:I

    new-array v0, p2, [B

    invoke-static {v2, v3, v0, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p2, 0x2

    new-array p2, p2, [[B

    aput-object v0, p2, v3

    const/4 v0, 0x1

    aput-object p1, p2, v0

    return-object p2
.end method
