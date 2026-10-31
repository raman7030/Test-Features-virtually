.class public Lorg/bouncycastle/pqc/jcajce/provider/dilithium/SignatureSpi$Base;
.super Lorg/bouncycastle/pqc/jcajce/provider/dilithium/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumSigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumSigner;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/dilithium/SignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumSigner;)V

    return-void
.end method
