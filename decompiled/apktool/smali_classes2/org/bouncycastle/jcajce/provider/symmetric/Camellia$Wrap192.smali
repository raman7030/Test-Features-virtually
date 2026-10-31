.class public Lorg/bouncycastle/jcajce/provider/symmetric/Camellia$Wrap192;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/engines/CamelliaWrapEngine;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/CamelliaWrapEngine;-><init>()V

    const/16 v1, 0xc0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>(ILorg/bouncycastle/crypto/Wrapper;)V

    return-void
.end method
