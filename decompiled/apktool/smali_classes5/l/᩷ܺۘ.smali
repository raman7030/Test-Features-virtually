.class public abstract Ll/᩷ܺۘ;
.super Ljava/lang/Object;
.source "M7WT"

# interfaces
.implements Ll/᩻ۜۘ;


# instance fields
.field public ֫:Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;


# virtual methods
.method public final synthetic ֫(I)V
    .locals 0

    return-void
.end method

.method public ֫(I[BI[BI)V
    .locals 6

    .line 74
    iget-object v0, p0, Ll/᩷ܺۘ;->֫:Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    move-object v1, p2

    move v2, p1

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;->processBytes([BII[BI)I

    return-void
.end method

.method public ֫(I[B[B)V
    .locals 4

    .line 49
    array-length v0, p3

    const/4 v1, 0x0

    const/16 v2, 0x10

    if-le v0, v2, :cond_0

    new-array v0, v2, [B

    .line 51
    invoke-static {p3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p3, v0

    .line 54
    :cond_0
    invoke-interface {p0}, Ll/᩻ۜۘ;->getBlockSize()I

    move-result v0

    .line 55
    array-length v2, p2

    if-le v2, v0, :cond_1

    .line 56
    new-array v2, v0, [B

    .line 57
    invoke-static {p2, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p2, v2

    .line 62
    :cond_1
    :try_start_0
    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    new-instance v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    array-length v3, p2

    invoke-direct {v2, p2, v1, v3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    array-length p2, p3

    invoke-direct {v0, v2, p3, v1, p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[BII)V

    .line 64
    new-instance p2, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    new-instance p3, Lorg/bouncycastle/crypto/engines/TwofishEngine;

    invoke-direct {p3}, Lorg/bouncycastle/crypto/engines/TwofishEngine;-><init>()V

    invoke-static {p3}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/CBCModeCipher;

    move-result-object p3

    invoke-direct {p2, p3}, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object p2, p0, Ll/᩷ܺۘ;->֫:Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    if-nez p1, :cond_2

    const/4 v1, 0x1

    .line 65
    :cond_2
    invoke-virtual {p2, v1, v0}, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 67
    iput-object p2, p0, Ll/᩷ܺۘ;->֫:Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    .line 68
    throw p1
.end method

.method public final synthetic ֫([B)V
    .locals 0

    return-void
.end method

.method public final synthetic ۧ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic ۧ(I[BI[BI)V
    .locals 0

    return-void
.end method

.method public final synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic ܿ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
