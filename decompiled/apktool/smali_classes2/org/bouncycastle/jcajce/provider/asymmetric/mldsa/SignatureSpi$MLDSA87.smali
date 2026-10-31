.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSA87;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;-><init>()V

    sget-object v1, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->ml_dsa_87:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;)V

    return-void
.end method
