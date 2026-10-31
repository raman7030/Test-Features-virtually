.class public Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SignatureSpi$Direct;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSASigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSASigner;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSASigner;)V

    return-void
.end method
