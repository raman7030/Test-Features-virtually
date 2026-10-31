.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyPairGeneratorSpi$MLKEM512;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyPairGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/spec/MLKEMParameterSpec;->ml_kem_512:Lorg/bouncycastle/jcajce/spec/MLKEMParameterSpec;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyPairGeneratorSpi;-><init>(Lorg/bouncycastle/jcajce/spec/MLKEMParameterSpec;)V

    return-void
.end method
