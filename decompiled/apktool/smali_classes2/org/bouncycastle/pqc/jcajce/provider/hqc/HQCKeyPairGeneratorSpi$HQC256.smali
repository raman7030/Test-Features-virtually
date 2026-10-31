.class public Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi$HQC256;
.super Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;->hqc256:Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;-><init>(Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;)V

    return-void
.end method
