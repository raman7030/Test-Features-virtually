.class public Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyGeneratorSpi$HQC192;
.super Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc192:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyGeneratorSpi;-><init>(Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;)V

    return-void
.end method
