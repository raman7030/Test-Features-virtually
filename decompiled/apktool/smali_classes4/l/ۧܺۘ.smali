.class public abstract Ll/ۧܺۘ;
.super Ljava/lang/Object;
.source "W7VX"

# interfaces
.implements Ll/᩻ۡۘ;


# instance fields
.field public ֫:Lorg/bouncycastle/crypto/Signer;


# virtual methods
.method public init()V
    .locals 3

    .line 54
    invoke-virtual {p0}, Ll/ۧܺۘ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ed25519"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۧܺۘ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Ed448"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    invoke-virtual {p0}, Ll/ۧܺۘ;->֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "invalid curve "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ۧܺۘ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    new-instance v0, Lorg/bouncycastle/crypto/signers/Ed25519Signer;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/signers/Ed25519Signer;-><init>()V

    iput-object v0, p0, Ll/ۧܺۘ;->֫:Lorg/bouncycastle/crypto/Signer;

    return-void

    .line 61
    :cond_2
    new-instance v0, Lorg/bouncycastle/crypto/signers/Ed448Signer;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/signers/Ed448Signer;-><init>([B)V

    iput-object v0, p0, Ll/ۧܺۘ;->֫:Lorg/bouncycastle/crypto/Signer;

    return-void
.end method

.method public verify([B)Z
    .locals 4

    .line 118
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 120
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v2

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 121
    invoke-virtual {p0}, Ll/ۧܺۘ;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 122
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    .line 123
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩻()I

    move-result v0

    .line 124
    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 125
    invoke-static {p1, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v2

    .line 130
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ۧܺۘ;->֫:Lorg/bouncycastle/crypto/Signer;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Signer;->verifySignature([B)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 132
    new-instance v0, Ljava/security/SignatureException;

    invoke-direct {v0, p1}, Ljava/security/SignatureException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract ֫()Ljava/lang/String;
.end method

.method public ֫([B)V
    .locals 3

    .line 83
    :try_start_0
    invoke-virtual {p0}, Ll/ۧܺۘ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ed25519"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 84
    new-instance v0, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;

    invoke-direct {v0, p1, v2}, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;-><init>([BI)V

    .line 85
    iget-object p1, p0, Ll/ۧܺۘ;->֫:Lorg/bouncycastle/crypto/Signer;

    invoke-interface {p1, v1, v0}, Lorg/bouncycastle/crypto/Signer;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    .line 87
    :cond_0
    new-instance v0, Lorg/bouncycastle/crypto/params/Ed448PrivateKeyParameters;

    invoke-direct {v0, p1, v2}, Lorg/bouncycastle/crypto/params/Ed448PrivateKeyParameters;-><init>([BI)V

    .line 88
    iget-object p1, p0, Ll/ۧܺۘ;->֫:Lorg/bouncycastle/crypto/Signer;

    invoke-interface {p1, v1, v0}, Lorg/bouncycastle/crypto/Signer;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 91
    new-instance v0, Ljava/security/InvalidKeyException;

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract ۧ()Ljava/lang/String;
.end method

.method public ۧ([B)V
    .locals 2

    .line 68
    :try_start_0
    invoke-virtual {p0}, Ll/ۧܺۘ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ed25519"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 69
    new-instance v0, Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;

    invoke-direct {v0, p1, v1}, Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;-><init>([BI)V

    .line 70
    iget-object p1, p0, Ll/ۧܺۘ;->֫:Lorg/bouncycastle/crypto/Signer;

    invoke-interface {p1, v1, v0}, Lorg/bouncycastle/crypto/Signer;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    .line 72
    :cond_0
    new-instance v0, Lorg/bouncycastle/crypto/params/Ed448PublicKeyParameters;

    invoke-direct {v0, p1, v1}, Lorg/bouncycastle/crypto/params/Ed448PublicKeyParameters;-><init>([BI)V

    .line 73
    iget-object p1, p0, Ll/ۧܺۘ;->֫:Lorg/bouncycastle/crypto/Signer;

    invoke-interface {p1, v1, v0}, Lorg/bouncycastle/crypto/Signer;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 76
    new-instance v0, Ljava/security/InvalidKeyException;

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
