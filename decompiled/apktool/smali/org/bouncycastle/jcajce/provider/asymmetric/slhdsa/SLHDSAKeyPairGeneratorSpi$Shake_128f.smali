.class public Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyPairGeneratorSpi$Shake_128f;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyPairGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/spec/SLHDSAParameterSpec;->slh_dsa_shake_128f:Lorg/bouncycastle/jcajce/spec/SLHDSAParameterSpec;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyPairGeneratorSpi;-><init>(Lorg/bouncycastle/jcajce/spec/SLHDSAParameterSpec;)V

    return-void
.end method
