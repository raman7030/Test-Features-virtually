.class public Lorg/bouncycastle/pqc/jcajce/provider/bike/BIKECipherSpi$BIKE256;
.super Lorg/bouncycastle/pqc/jcajce/provider/bike/BIKECipherSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;->bike256:Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/bike/BIKECipherSpi;-><init>(Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;)V

    return-void
.end method
