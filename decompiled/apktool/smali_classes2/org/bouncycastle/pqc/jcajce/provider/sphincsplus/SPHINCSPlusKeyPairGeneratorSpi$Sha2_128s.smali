.class public Lorg/bouncycastle/pqc/jcajce/provider/sphincsplus/SPHINCSPlusKeyPairGeneratorSpi$Sha2_128s;
.super Lorg/bouncycastle/pqc/jcajce/provider/sphincsplus/SPHINCSPlusKeyPairGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/jcajce/spec/SPHINCSPlusParameterSpec;->sha2_128s:Lorg/bouncycastle/pqc/jcajce/spec/SPHINCSPlusParameterSpec;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/sphincsplus/SPHINCSPlusKeyPairGeneratorSpi;-><init>(Lorg/bouncycastle/pqc/jcajce/spec/SPHINCSPlusParameterSpec;)V

    return-void
.end method
