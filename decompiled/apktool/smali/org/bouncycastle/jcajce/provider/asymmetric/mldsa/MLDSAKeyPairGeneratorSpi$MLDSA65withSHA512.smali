.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyPairGeneratorSpi$MLDSA65withSHA512;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyPairGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;->ml_dsa_65_with_sha512:Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyPairGeneratorSpi;-><init>(Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;)V

    return-void
.end method
