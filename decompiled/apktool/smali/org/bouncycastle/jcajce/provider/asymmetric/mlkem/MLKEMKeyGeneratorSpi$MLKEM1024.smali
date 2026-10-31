.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyGeneratorSpi$MLKEM1024;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;->ml_kem_1024:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyGeneratorSpi;-><init>(Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;)V

    return-void
.end method
