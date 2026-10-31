.class public abstract Ll/ۨۖۘ;
.super Ljava/lang/Object;
.source "77V1"

# interfaces
.implements Ll/ۜۡۘ;


# instance fields
.field public ֫:Ljava/security/KeyFactory;

.field public ۧ:Ljava/security/Signature;


# virtual methods
.method public init()V
    .locals 2

    .line 49
    invoke-virtual {p0}, Ll/ۨۖۘ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rsa-sha2-256"

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "ssh-rsa-sha256@ssh.com"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "rsa-sha2-512"

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "ssh-rsa-sha512@ssh.com"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "ssh-rsa-sha384@ssh.com"

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "SHA384withRSA"

    goto :goto_2

    :cond_2
    const-string v1, "ssh-rsa-sha224@ssh.com"

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "SHA224withRSA"

    goto :goto_2

    :cond_3
    const-string v0, "SHA1withRSA"

    goto :goto_2

    :cond_4
    :goto_0
    const-string v0, "SHA512withRSA"

    goto :goto_2

    :cond_5
    :goto_1
    const-string v0, "SHA256withRSA"

    .line 59
    :goto_2
    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    iput-object v0, p0, Ll/ۨۖۘ;->ۧ:Ljava/security/Signature;

    const-string v0, "RSA"

    .line 60
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    iput-object v0, p0, Ll/ۨۖۘ;->֫:Ljava/security/KeyFactory;

    return-void
.end method

.method public update([B)V
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۨۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    return-void
.end method

.method public verify([B)Z
    .locals 4

    .line 93
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 95
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v2

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v2, "ssh-rsa"

    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "rsa-sha2-256"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "rsa-sha2-512"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "ssh-rsa-sha224@ssh.com"

    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "ssh-rsa-sha256@ssh.com"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "ssh-rsa-sha384@ssh.com"

    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "ssh-rsa-sha512@ssh.com"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 99
    :cond_0
    invoke-virtual {p0}, Ll/ۨۖۘ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 101
    :cond_1
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    .line 102
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩻()I

    move-result v0

    .line 103
    new-array v3, v1, [B

    .line 104
    invoke-static {p1, v0, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v3

    .line 108
    :cond_2
    iget-object v0, p0, Ll/ۨۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {v0, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p1

    return p1
.end method

.method public abstract ֫()Ljava/lang/String;
.end method

.method public ֫([B[B)V
    .locals 2

    .line 65
    new-instance v0, Ljava/security/spec/RSAPublicKeySpec;

    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, p2}, Ljava/math/BigInteger;-><init>([B)V

    new-instance p2, Ljava/math/BigInteger;

    invoke-direct {p2, p1}, Ljava/math/BigInteger;-><init>([B)V

    invoke-direct {v0, v1, p2}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 66
    iget-object p1, p0, Ll/ۨۖۘ;->֫:Ljava/security/KeyFactory;

    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    .line 67
    iget-object p2, p0, Ll/ۨۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {p2, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    return-void
.end method

.method public ۧ([B[B)V
    .locals 2

    .line 72
    new-instance v0, Ljava/security/spec/RSAPrivateKeySpec;

    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, p2}, Ljava/math/BigInteger;-><init>([B)V

    new-instance p2, Ljava/math/BigInteger;

    invoke-direct {p2, p1}, Ljava/math/BigInteger;-><init>([B)V

    invoke-direct {v0, v1, p2}, Ljava/security/spec/RSAPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 73
    iget-object p1, p0, Ll/ۨۖۘ;->֫:Ljava/security/KeyFactory;

    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p1

    .line 74
    iget-object p2, p0, Ll/ۨۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {p2, p1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    return-void
.end method
