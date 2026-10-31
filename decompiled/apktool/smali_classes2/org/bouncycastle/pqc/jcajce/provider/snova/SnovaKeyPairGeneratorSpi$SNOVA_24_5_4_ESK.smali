.class public Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi$SNOVA_24_5_4_ESK;
.super Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;-><init>(Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;)V

    return-void
.end method
