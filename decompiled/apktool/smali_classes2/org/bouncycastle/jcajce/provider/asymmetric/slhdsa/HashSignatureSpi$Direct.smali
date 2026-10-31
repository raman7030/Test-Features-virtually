.class public Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/HashSignatureSpi$Direct;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/HashSignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/slhdsa/HashSLHDSASigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/slhdsa/HashSLHDSASigner;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/HashSignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/slhdsa/HashSLHDSASigner;)V

    return-void
.end method
