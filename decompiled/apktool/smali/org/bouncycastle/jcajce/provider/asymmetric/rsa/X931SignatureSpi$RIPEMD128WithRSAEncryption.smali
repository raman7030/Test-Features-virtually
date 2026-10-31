.class public Lorg/bouncycastle/jcajce/provider/asymmetric/rsa/X931SignatureSpi$RIPEMD128WithRSAEncryption;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/rsa/X931SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/RIPEMD128Digest;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/RIPEMD128Digest;-><init>()V

    new-instance v1, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jcajce/provider/asymmetric/rsa/X931SignatureSpi;-><init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    return-void
.end method
