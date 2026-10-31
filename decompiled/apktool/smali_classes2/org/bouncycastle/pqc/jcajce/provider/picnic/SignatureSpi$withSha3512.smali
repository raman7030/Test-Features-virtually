.class public Lorg/bouncycastle/pqc/jcajce/provider/picnic/SignatureSpi$withSha3512;
.super Lorg/bouncycastle/pqc/jcajce/provider/picnic/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/SHA3Digest;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/digests/SHA3Digest;-><init>(I)V

    new-instance v1, Lorg/bouncycastle/pqc/crypto/picnic/PicnicSigner;

    invoke-direct {v1}, Lorg/bouncycastle/pqc/crypto/picnic/PicnicSigner;-><init>()V

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/pqc/jcajce/provider/picnic/SignatureSpi;-><init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/pqc/crypto/picnic/PicnicSigner;)V

    return-void
.end method
