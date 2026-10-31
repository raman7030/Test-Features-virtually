.class public final Ll/۠ۡۘ;
.super Ljava/lang/Object;
.source "U7YJ"

# interfaces
.implements Ll/֫ۢۘ;


# instance fields
.field public ֫:Lorg/bouncycastle/crypto/generators/Argon2BytesGenerator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/HashMap;)V
    .locals 11

    const-string v0, "Invalid argon2 params."

    :try_start_0
    const-string v1, "Key-Derivation"

    .line 41
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "Argon2-Salt"

    .line 42
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_4

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x5b3b15e8

    const/4 v5, 0x0

    if-eq v3, v4, :cond_1

    const v4, 0x36dd0fc7

    if-eq v3, v4, :cond_0

    const v4, 0x36dd0fcc

    if-ne v3, v4, :cond_3

    const-string v3, "Argon2i"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const-string v3, "Argon2d"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const-string v3, "Argon2id"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x2

    :goto_0
    const-string v3, "Argon2-Memory"

    .line 63
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "Argon2-Passes"

    .line 64
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const-string v6, "Argon2-Parallelism"

    .line 65
    invoke-virtual {p1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 66
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    new-array v7, v6, [B

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v6, :cond_2

    mul-int/lit8 v9, v8, 0x2

    add-int/lit8 v10, v9, 0x2

    .line 69
    invoke-virtual {v2, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0x10

    invoke-static {v9, v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    int-to-byte v9, v9

    aput-byte v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 72
    :cond_2
    new-instance v2, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;

    invoke-direct {v2, v1}, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;-><init>(I)V

    .line 73
    invoke-virtual {v2, v7}, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;->withSalt([B)Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;

    move-result-object v1

    new-array v2, v5, [B

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;->withAdditional([B)Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;

    move-result-object v1

    new-array v2, v5, [B

    .line 74
    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;->withSecret([B)Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;

    move-result-object v1

    invoke-virtual {v1, v4}, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;->withIterations(I)Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;

    move-result-object v1

    invoke-virtual {v1, v3}, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;->withMemoryAsKB(I)Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;

    move-result-object v1

    .line 75
    invoke-virtual {v1, p1}, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;->withParallelism(I)Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;

    move-result-object p1

    const/16 v1, 0x13

    invoke-virtual {p1, v1}, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;->withVersion(I)Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/Argon2Parameters$Builder;->build()Lorg/bouncycastle/crypto/params/Argon2Parameters;

    move-result-object p1

    .line 76
    new-instance v1, Lorg/bouncycastle/crypto/generators/Argon2BytesGenerator;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/generators/Argon2BytesGenerator;-><init>()V

    iput-object v1, p0, Ll/۠ۡۘ;->֫:Lorg/bouncycastle/crypto/generators/Argon2BytesGenerator;

    .line 77
    invoke-virtual {v1, p1}, Lorg/bouncycastle/crypto/generators/Argon2BytesGenerator;->init(Lorg/bouncycastle/crypto/params/Argon2Parameters;)V

    return-void

    .line 60
    :cond_3
    new-instance p1, Ll/۫᩷ۘ;

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 60
    throw p1

    .line 45
    :cond_4
    new-instance p1, Ll/۫᩷ۘ;

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 45
    throw p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 79
    new-instance v1, Ll/۫᩷ۘ;

    .line 43
    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    throw v1
.end method

.method public final ֫([B)V
    .locals 1

    .line 35
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "initWithOpenSSHv1KDFOptions() not supported"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 35
    throw p1
.end method

.method public final ֫(I[B)[B
    .locals 1

    .line 85
    new-array p1, p1, [B

    .line 86
    iget-object v0, p0, Ll/۠ۡۘ;->֫:Lorg/bouncycastle/crypto/generators/Argon2BytesGenerator;

    invoke-virtual {v0, p2, p1}, Lorg/bouncycastle/crypto/generators/Argon2BytesGenerator;->generateBytes([B[B)I

    return-object p1
.end method

.method public final ۧ([B)V
    .locals 1

    .line 43
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "initWithASN1() not supported"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 43
    throw p1
.end method
