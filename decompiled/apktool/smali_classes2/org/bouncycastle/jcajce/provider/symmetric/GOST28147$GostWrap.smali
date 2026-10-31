.class public Lorg/bouncycastle/jcajce/provider/symmetric/GOST28147$GostWrap;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/engines/GOST28147WrapEngine;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/GOST28147WrapEngine;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>(Lorg/bouncycastle/crypto/Wrapper;)V

    return-void
.end method
