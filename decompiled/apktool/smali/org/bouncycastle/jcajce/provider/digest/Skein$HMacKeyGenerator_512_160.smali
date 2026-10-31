.class public Lorg/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_512_160;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/CipherKeyGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/CipherKeyGenerator;-><init>()V

    const-string v1, "HMACSkein-512-160"

    const/16 v2, 0xa0

    invoke-direct {p0, v1, v2, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;-><init>(Ljava/lang/String;ILorg/bouncycastle/crypto/CipherKeyGenerator;)V

    return-void
.end method
