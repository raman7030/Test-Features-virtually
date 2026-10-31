.class public Lorg/bouncycastle/pqc/jcajce/provider/dilithium/SignatureSpi$Base3;
.super Lorg/bouncycastle/pqc/jcajce/provider/dilithium/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumSigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumSigner;-><init>()V

    sget-object v1, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;->dilithium3:Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/pqc/jcajce/provider/dilithium/SignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumSigner;Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;)V

    return-void
.end method
