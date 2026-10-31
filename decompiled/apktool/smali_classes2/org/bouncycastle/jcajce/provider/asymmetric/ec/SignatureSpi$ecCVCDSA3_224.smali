.class public Lorg/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA3_224;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/util/DigestFactory;->createSHA3_224()Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/signers/ECDSASigner;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/signers/ECDSASigner;-><init>()V

    sget-object v2, Lorg/bouncycastle/crypto/signers/PlainDSAEncoding;->INSTANCE:Lorg/bouncycastle/crypto/signers/PlainDSAEncoding;

    invoke-direct {p0, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi;-><init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/DSAExt;Lorg/bouncycastle/crypto/signers/DSAEncoding;)V

    return-void
.end method
