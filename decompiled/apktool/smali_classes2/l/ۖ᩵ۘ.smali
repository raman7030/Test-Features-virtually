.class public Ll/ۖ᩵ۘ;
.super Ljava/lang/Object;
.source "G8CV"

# interfaces
.implements Ll/ۖۢܽ;
.implements Ll/ᩴ᩹ۖ;
.implements Ll/᩶ۧۘ;


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I
    .locals 3

    .line 50
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1, p0, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result p0

    return p0

    .line 51
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0

    .line 52
    :cond_1
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v0, v2

    :goto_0
    if-gt p2, v0, :cond_3

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1, v1, p2, p0, v2}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    return p2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 2

    .line 25
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 28
    :catchall_0
    :try_start_1
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    .line 29
    invoke-static {p0, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    if-eqz p1, :cond_0

    .line 32
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Caught "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static ֫(IILjava/lang/CharSequence;)Ljava/lang/String;
    .locals 3

    .line 13
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    if-ltz p0, :cond_3

    if-lt p1, p0, :cond_3

    .line 14
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p1, v0, :cond_3

    if-ne p0, p1, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    sub-int/2addr p1, p0

    .line 16
    new-array v0, p1, [C

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    add-int v2, p0, v1

    .line 17
    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18
    :cond_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0

    .line 14
    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z
    .locals 4

    const/4 v0, 0x0

    if-ltz p2, :cond_5

    .line 36
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, p4

    if-gt p2, v1, :cond_5

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, p4

    if-gez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_4

    add-int v2, p2, v1

    .line 38
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    goto :goto_2

    .line 41
    :cond_2
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    .line 42
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    if-eq v2, v3, :cond_3

    .line 43
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    if-eq v2, v3, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_2
    return v0
.end method

.method public static ֫(Ljava/lang/String;[B)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "RSA"

    .line 14
    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    const-string v2, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqlaL2//kwVLAAn+mac25arQOjgrRXVr4kl2nrcaoW05YzgdQzyPvADHD1zv3gg33fS+wQlzfnvKUHDSxOFGHubeW36Qkk85sNIZuBZk5ezJx00OdZafzdC6wUr7mreDUlylJWEGbfVALtP8osW8gS1c8H2i4jsHvamAWpwsYR0QIDAQAB"

    .line 16
    invoke-static {v2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 17
    new-instance v3, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v3, v2}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-virtual {v1, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v1

    const-string v2, "SHA1WithRSA"

    .line 18
    invoke-static {v2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v2

    .line 19
    invoke-virtual {v2, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 20
    invoke-virtual {v2, p1}, Ljava/security/Signature;->update([B)V

    .line 21
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/security/Signature;->verify([B)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v0
.end method


# virtual methods
.method public ֫(Ll/ܽۨۖ;Ljavax/crypto/SecretKey;)Ll/ܽۨۖ;
    .locals 0

    return-object p1
.end method

.method public ֫(Ll/ܺܺܽ;)V
    .locals 3

    .line 16
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۨ᩷ܽ;->֫(J)V

    .line 18
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
