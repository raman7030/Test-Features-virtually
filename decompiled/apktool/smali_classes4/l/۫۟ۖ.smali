.class public final Ll/۫۟ۖ;
.super Ljava/lang/Object;
.source "99JQ"

# interfaces
.implements Ll/᩶ܰۖ;


# virtual methods
.method public final create()Ljava/lang/Object;
    .locals 3

    .line 41
    new-instance v0, Ll/۬۟ۖ;

    new-instance v1, Lorg/bouncycastle/crypto/BufferedBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/engines/DESEngine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/DESEngine;-><init>()V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Ll/ۨ۟ۖ;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    return-object v0
.end method
