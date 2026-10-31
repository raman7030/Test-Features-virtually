.class public Lorg/bouncycastle/jcajce/provider/asymmetric/ec/GMCipherSpi$SM2;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/ec/GMCipherSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/engines/SM2Engine;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/SM2Engine;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/ec/GMCipherSpi;-><init>(Lorg/bouncycastle/crypto/engines/SM2Engine;)V

    return-void
.end method
