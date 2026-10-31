.class public final Ll/ۡܺۘ;
.super Ljava/lang/Object;
.source "S7ZB"

# interfaces
.implements Ll/֡ۡۘ;


# instance fields
.field public ֫:[B

.field public ۧ:I

.field public ܽ:Ljava/lang/String;

.field public ᩳ:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getQ()[B
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۡܺۘ;->֫:[B

    return-object v0
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 2

    const-string v0, "X25519"

    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "X448"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    new-instance p1, Ljava/security/NoSuchAlgorithmException;

    const-string v0, "invalid curve "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_1
    :goto_0
    iput p1, p0, Ll/ۡܺۘ;->ۧ:I

    .line 49
    iput-object p2, p0, Ll/ۡܺۘ;->ܽ:Ljava/lang/String;

    .line 50
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 51
    new-instance p1, Lorg/bouncycastle/crypto/params/X25519PrivateKeyParameters;

    new-instance p2, Ljava/security/SecureRandom;

    invoke-direct {p2}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/params/X25519PrivateKeyParameters;-><init>(Ljava/security/SecureRandom;)V

    .line 52
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/X25519PrivateKeyParameters;->generatePublicKey()Lorg/bouncycastle/crypto/params/X25519PublicKeyParameters;

    move-result-object p2

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/X25519PublicKeyParameters;->getEncoded()[B

    move-result-object p2

    iput-object p2, p0, Ll/ۡܺۘ;->֫:[B

    .line 53
    iput-object p1, p0, Ll/ۡܺۘ;->ᩳ:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    return-void

    .line 55
    :cond_2
    new-instance p1, Lorg/bouncycastle/crypto/params/X448PrivateKeyParameters;

    new-instance p2, Ljava/security/SecureRandom;

    invoke-direct {p2}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/params/X448PrivateKeyParameters;-><init>(Ljava/security/SecureRandom;)V

    .line 56
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/X448PrivateKeyParameters;->generatePublicKey()Lorg/bouncycastle/crypto/params/X448PublicKeyParameters;

    move-result-object p2

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/X448PublicKeyParameters;->getEncoded()[B

    move-result-object p2

    iput-object p2, p0, Ll/ۡܺۘ;->֫:[B

    .line 57
    iput-object p1, p0, Ll/ۡܺۘ;->ᩳ:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    return-void
.end method

.method public final ֫([B)[B
    .locals 3

    .line 68
    iget v0, p0, Ll/ۡܺۘ;->ۧ:I

    new-array v0, v0, [B

    .line 69
    iget-object v1, p0, Ll/ۡܺۘ;->ܽ:Ljava/lang/String;

    const-string v2, "X25519"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 72
    :try_start_0
    new-instance v1, Lorg/bouncycastle/crypto/params/X25519PublicKeyParameters;

    invoke-direct {v1, p1, v2}, Lorg/bouncycastle/crypto/params/X25519PublicKeyParameters;-><init>([BI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 77
    iget-object p1, p0, Ll/ۡܺۘ;->ᩳ:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    check-cast p1, Lorg/bouncycastle/crypto/params/X25519PrivateKeyParameters;

    .line 79
    :try_start_1
    invoke-virtual {p1, v1, v0, v2}, Lorg/bouncycastle/crypto/params/X25519PrivateKeyParameters;->generateSecret(Lorg/bouncycastle/crypto/params/X25519PublicKeyParameters;[BI)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 81
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 74
    new-instance v0, Ljava/security/InvalidKeyException;

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 86
    :cond_0
    :try_start_2
    new-instance v1, Lorg/bouncycastle/crypto/params/X448PublicKeyParameters;

    invoke-direct {v1, p1, v2}, Lorg/bouncycastle/crypto/params/X448PublicKeyParameters;-><init>([BI)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 91
    iget-object p1, p0, Ll/ۡܺۘ;->ᩳ:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    check-cast p1, Lorg/bouncycastle/crypto/params/X448PrivateKeyParameters;

    .line 93
    :try_start_3
    invoke-virtual {p1, v1, v0, v2}, Lorg/bouncycastle/crypto/params/X448PrivateKeyParameters;->generateSecret(Lorg/bouncycastle/crypto/params/X448PublicKeyParameters;[BI)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    return-object v0

    :catch_2
    move-exception p1

    .line 95
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p1

    .line 88
    new-instance v0, Ljava/security/InvalidKeyException;

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ۧ([B)Z
    .locals 1

    .line 113
    array-length p1, p1

    iget v0, p0, Ll/ۡܺۘ;->ۧ:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
