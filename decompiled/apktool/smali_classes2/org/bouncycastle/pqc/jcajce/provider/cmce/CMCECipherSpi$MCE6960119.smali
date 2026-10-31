.class public Lorg/bouncycastle/pqc/jcajce/provider/cmce/CMCECipherSpi$MCE6960119;
.super Lorg/bouncycastle/pqc/jcajce/provider/cmce/CMCECipherSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece6960119r3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/cmce/CMCECipherSpi;-><init>(Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;)V

    return-void
.end method
