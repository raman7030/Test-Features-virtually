.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;


# instance fields
.field public parameters:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

.field public signer:Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;)V
    .locals 1

    const-string v0, "HashMLDSA"

    .line 0
    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->parameters:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;)V
    .locals 1

    .line 0
    invoke-virtual {p2}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;->fromName(Ljava/lang/String;)Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->parameters:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    return-void
.end method


# virtual methods
.method public engineSign()[B
    .locals 2

    .line 0
    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;->generateSignature()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public engineVerify([B)Z
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;->verifySignature([B)Z

    move-result p1

    return p1
.end method

.method public reInitialize(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public signInit(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V
    .locals 1

    .line 0
    iput-object p2, p0, Ljava/security/SignatureSpi;->appRandom:Ljava/security/SecureRandom;

    instance-of p2, p1, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/BCMLDSAPrivateKey;

    if-eqz p2, :cond_2

    check-cast p1, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/BCMLDSAPrivateKey;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/BCMLDSAPrivateKey;->getKeyParams()Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAPrivateKeyParameters;

    move-result-object p2

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->keyParams:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->parameters:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;->fromName(Ljava/lang/String;)Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;

    move-result-object p2

    invoke-virtual {p2}, Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/BCMLDSAPrivateKey;->getAlgorithm()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "signature configured for "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string p2, "unknown private key passed to ML-DSA"

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public updateEngine(B)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;->update(B)V

    return-void
.end method

.method public updateEngine([BII)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/pqc/crypto/mldsa/HashMLDSASigner;->update([BII)V

    return-void
.end method

.method public verifyInit(Ljava/security/PublicKey;)V
    .locals 2

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/BCMLDSAPublicKey;

    if-eqz v0, :cond_2

    check-cast p1, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/BCMLDSAPublicKey;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/BCMLDSAPublicKey;->getKeyParams()Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAPublicKeyParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->keyParams:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/HashSignatureSpi;->parameters:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;->fromName(Ljava/lang/String;)Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/spec/MLDSAParameterSpec;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/BCMLDSAPublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v1, "signature configured for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "unknown public key passed to ML-DSA"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
