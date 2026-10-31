.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSA;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;)V

    return-void
.end method
