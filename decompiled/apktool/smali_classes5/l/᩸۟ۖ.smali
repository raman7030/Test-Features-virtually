.class public final Ll/᩸۟ۖ;
.super Ljava/lang/Object;
.source "G9IQ"

# interfaces
.implements Ll/᩶ܰۖ;


# virtual methods
.method public final create()Ljava/lang/Object;
    .locals 3

    .line 43
    new-instance v0, Ll/ܶ۟ۖ;

    new-instance v1, Lorg/bouncycastle/crypto/modes/CCMBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/engines/AESEngine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/AESEngine;-><init>()V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/CCMBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Ll/ۙ۟ۖ;-><init>(Lorg/bouncycastle/crypto/modes/AEADBlockCipher;)V

    return-object v0
.end method
