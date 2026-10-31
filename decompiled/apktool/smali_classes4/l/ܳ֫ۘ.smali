.class public final Ll/ܳ֫ۘ;
.super Ljava/lang/Object;
.source "L9KD"

# interfaces
.implements Ll/᩶ܰۖ;


# virtual methods
.method public final create()Ljava/lang/Object;
    .locals 2

    .line 50
    new-instance v0, Lorg/bouncycastle/crypto/macs/CMac;

    new-instance v1, Lorg/bouncycastle/crypto/engines/AESEngine;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/engines/AESEngine;-><init>()V

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/macs/CMac;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    return-object v0
.end method
