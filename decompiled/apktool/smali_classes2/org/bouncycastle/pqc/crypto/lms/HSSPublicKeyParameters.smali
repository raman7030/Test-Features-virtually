.class public Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;
.super Lorg/bouncycastle/pqc/crypto/lms/LMSKeyParameters;

# interfaces
.implements Lorg/bouncycastle/pqc/crypto/lms/LMSContextBasedVerifier;


# instance fields
.field public final l:I

.field public final lmsPublicKey:Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;


# direct methods
.method public constructor <init>(ILorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/crypto/lms/LMSKeyParameters;-><init>(Z)V

    if-eqz p2, :cond_0

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->l:I

    iput-object p2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->lmsPublicKey:Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "lmsPublicKey"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;
    .locals 3

    .line 2
    instance-of v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

    if-eqz v0, :cond_0

    .line 6
    check-cast p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

    return-object p0

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/io/DataInputStream;

    if-eqz v0, :cond_1

    .line 14
    move-object v0, p0

    check-cast v0, Ljava/io/DataInputStream;

    .line 17
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 21
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object p0

    .line 24
    new-instance v1, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

    .line 27
    invoke-direct {v1, v0, p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;-><init>(ILorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;)V

    return-object v1

    .line 30
    :cond_1
    instance-of v0, p0, [B

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 35
    :try_start_0
    new-instance v1, Ljava/io/DataInputStream;

    .line 37
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 39
    check-cast p0, [B

    .line 42
    invoke-direct {v2, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 45
    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    :try_start_1
    invoke-static {v1}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p0

    :goto_0
    if-eqz v0, :cond_2

    .line 62
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 63
    :cond_2
    throw p0

    .line 65
    :cond_3
    instance-of v0, p0, Ljava/io/InputStream;

    if-eqz v0, :cond_4

    .line 69
    check-cast p0, Ljava/io/InputStream;

    .line 72
    invoke-static {p0}, Lorg/bouncycastle/util/io/Streams;->readAll(Ljava/io/InputStream;)[B

    move-result-object p0

    .line 76
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

    move-result-object p0

    return-object p0

    .line 80
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot parse "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->l:I

    iget v2, p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->l:I

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->lmsPublicKey:Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    iget-object p1, p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->lmsPublicKey:Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public generateLMSContext([B)Lorg/bouncycastle/pqc/crypto/lms/LMSContext;
    .locals 3

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->getL()I

    move-result v0

    .line 7
    invoke-static {p1, v0}, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;->getInstance(Ljava/lang/Object;I)Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;->getSignedPubKey()[Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;

    move-result-object v0

    .line 13
    array-length v1, v0

    if-eqz v1, :cond_0

    .line 16
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    .line 20
    aget-object v1, v0, v1

    .line 23
    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;->getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v1

    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->getLMSPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v1

    .line 32
    :goto_0
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;->getSignature()Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    move-result-object p1

    .line 36
    invoke-virtual {v1, p1}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->generateOtsContext(Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;)Lorg/bouncycastle/pqc/crypto/lms/LMSContext;

    move-result-object p1

    .line 40
    invoke-virtual {p1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;->withSignedPublicKeys([Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;)Lorg/bouncycastle/pqc/crypto/lms/LMSContext;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 45
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot parse signature: "

    .line 52
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getEncoded()[B
    .locals 2

    .line 0
    invoke-static {}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->compose()Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v0

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->l:I

    invoke-virtual {v0, v1}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->u32str(I)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->lmsPublicKey:Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->getEncoded()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->bytes([B)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->build()[B

    move-result-object v0

    return-object v0
.end method

.method public getL()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->l:I

    return v0
.end method

.method public getLMSPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->lmsPublicKey:Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->l:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->lmsPublicKey:Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public verify(Lorg/bouncycastle/pqc/crypto/lms/LMSContext;)Z
    .locals 6

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;->getSignedPubKeys()[Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;

    move-result-object v0

    array-length v1, v0

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->getL()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    return v4

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->getLMSPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v1

    :goto_0
    array-length v2, v0

    if-ge v4, v2, :cond_1

    aget-object v2, v0, v4

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;->getSignature()Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    move-result-object v2

    aget-object v5, v0, v4

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;->getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->toByteArray()[B

    move-result-object v5

    invoke-static {v1, v2, v5}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->verifySignature(Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;[B)Z

    move-result v1

    and-int/2addr v3, v1

    aget-object v1, v0, v4

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;->getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, p1}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->verify(Lorg/bouncycastle/pqc/crypto/lms/LMSContext;)Z

    move-result p1

    and-int/2addr p1, v3

    return p1
.end method
