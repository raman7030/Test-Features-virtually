.class public Lorg/bouncycastle/jcajce/provider/asymmetric/edec/IESCipher$XIESwithSHA512;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/edec/IESCipher$XIES;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/util/DigestFactory;->createSHA512()Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    invoke-static {}, Lorg/bouncycastle/crypto/util/DigestFactory;->createSHA512()Lorg/bouncycastle/crypto/Digest;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/IESCipher$XIES;-><init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;)V

    return-void
.end method
