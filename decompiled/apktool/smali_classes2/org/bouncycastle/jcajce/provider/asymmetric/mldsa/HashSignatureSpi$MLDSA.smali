.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi$MLDSA;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;)V

    return-void
.end method
