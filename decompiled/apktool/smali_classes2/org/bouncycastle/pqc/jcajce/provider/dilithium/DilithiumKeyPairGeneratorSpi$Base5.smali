.class public Lorg/bouncycastle/pqc/jcajce/provider/dilithium/DilithiumKeyPairGeneratorSpi$Base5;
.super Lorg/bouncycastle/pqc/jcajce/provider/dilithium/DilithiumKeyPairGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;->dilithium5:Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/dilithium/DilithiumKeyPairGeneratorSpi;-><init>(Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;)V

    return-void
.end method
