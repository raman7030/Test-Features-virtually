.class public Lorg/bouncycastle/pqc/jcajce/provider/cmce/CMCECipherSpi$MCE8192128;
.super Lorg/bouncycastle/pqc/jcajce/provider/cmce/CMCECipherSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece8192128r3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/cmce/CMCECipherSpi;-><init>(Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;)V

    return-void
.end method
