.class public final Lorg/bouncycastle/jcajce/provider/asymmetric/edec/KeyAgreementSpi$X448withSHA512KDF;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/edec/KeyAgreementSpi;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/generators/KDF2BytesGenerator;

    invoke-static {}, Lorg/bouncycastle/crypto/util/DigestFactory;->createSHA512()Lorg/bouncycastle/crypto/Digest;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/generators/KDF2BytesGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    const-string v1, "X448withSHA512KDF"

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/KeyAgreementSpi;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/DerivationFunction;)V

    return-void
.end method
