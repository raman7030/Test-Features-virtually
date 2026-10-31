.class public Lorg/bouncycastle/pqc/jcajce/provider/falcon/SignatureSpi$Falcon512;
.super Lorg/bouncycastle/pqc/jcajce/provider/falcon/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/falcon/FalconSigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/falcon/FalconSigner;-><init>()V

    sget-object v1, Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;->falcon_512:Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/pqc/jcajce/provider/falcon/SignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/falcon/FalconSigner;Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;)V

    return-void
.end method
