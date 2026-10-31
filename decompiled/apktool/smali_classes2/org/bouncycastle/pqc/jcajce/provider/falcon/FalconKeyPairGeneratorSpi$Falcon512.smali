.class public Lorg/bouncycastle/pqc/jcajce/provider/falcon/FalconKeyPairGeneratorSpi$Falcon512;
.super Lorg/bouncycastle/pqc/jcajce/provider/falcon/FalconKeyPairGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;->falcon_512:Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/falcon/FalconKeyPairGeneratorSpi;-><init>(Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;)V

    return-void
.end method
