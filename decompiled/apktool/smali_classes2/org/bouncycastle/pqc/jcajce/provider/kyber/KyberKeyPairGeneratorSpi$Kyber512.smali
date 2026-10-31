.class public Lorg/bouncycastle/pqc/jcajce/provider/kyber/KyberKeyPairGeneratorSpi$Kyber512;
.super Lorg/bouncycastle/pqc/jcajce/provider/kyber/KyberKeyPairGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;->ml_kem_512:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/kyber/KyberKeyPairGeneratorSpi;-><init>(Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;)V

    return-void
.end method
