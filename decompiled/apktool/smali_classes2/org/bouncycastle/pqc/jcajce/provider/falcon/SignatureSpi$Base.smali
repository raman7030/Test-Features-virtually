.class public Lorg/bouncycastle/pqc/jcajce/provider/falcon/SignatureSpi$Base;
.super Lorg/bouncycastle/pqc/jcajce/provider/falcon/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/falcon/FalconSigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSigner;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/falcon/SignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/falcon/FalconSigner;)V

    return-void
.end method
