.class public Lorg/bouncycastle/jcajce/provider/digest/SHA256$HashMac;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/macs/HMac;

    invoke-static {}, Lorg/bouncycastle/crypto/digests/SHA256Digest;->newInstance()Lorg/bouncycastle/crypto/SavableDigest;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/macs/HMac;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;-><init>(Lorg/bouncycastle/crypto/Mac;)V

    return-void
.end method
