.class public final Lorg/bouncycastle/jcajce/provider/symmetric/TLSKDF$TLS12withSHA256;
.super Lorg/bouncycastle/jcajce/provider/symmetric/TLSKDF$TLS12;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/macs/HMac;

    invoke-static {}, Lorg/bouncycastle/crypto/digests/SHA256Digest;->newInstance()Lorg/bouncycastle/crypto/SavableDigest;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/macs/HMac;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    const-string v1, "TLS12withSHA256KDF"

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/TLSKDF$TLS12;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/Mac;)V

    return-void
.end method
