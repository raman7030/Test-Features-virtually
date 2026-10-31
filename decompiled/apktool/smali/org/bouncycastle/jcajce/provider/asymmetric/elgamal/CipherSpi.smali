.class public Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;


# instance fields
.field public bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

.field public cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

.field public engineParams:Ljava/security/AlgorithmParameters;

.field public paramSpec:Ljava/security/spec/AlgorithmParameterSpec;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;-><init>()V

    new-instance v0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-direct {v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    return-void
.end method

.method private getOutput()[B
    .locals 5

    const-string v0, "unable to decrypt block"

    .line 0
    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {v2}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;->getBuf()[B

    move-result-object v2

    iget-object v3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v3

    const/4 v4, 0x0

    invoke-interface {v1, v2, v4, v3}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B

    move-result-object v0
    :try_end_0
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;->erase()V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_1
    new-instance v2, Lorg/bouncycastle/jcajce/provider/util/BadBlockException;

    invoke-direct {v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/BadBlockException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v1

    new-instance v2, Lorg/bouncycastle/jcajce/provider/util/BadBlockException;

    invoke-direct {v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/BadBlockException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;->erase()V

    throw v0
.end method

.method private initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V
    .locals 4

    .line 0
    invoke-virtual {p1}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFParameters()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v0

    check-cast v0, Ljava/security/spec/MGF1ParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/jcajce/provider/util/DigestFactory;->getDigest(Ljava/lang/String;)Lorg/bouncycastle/crypto/Digest;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/encodings/OAEPEncoding;

    new-instance v2, Lorg/bouncycastle/crypto/engines/ElGamalEngine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/ElGamalEngine;-><init>()V

    invoke-virtual {p1}, Ljavax/crypto/spec/OAEPParameterSpec;->getPSource()Ljavax/crypto/spec/PSource;

    move-result-object v3

    check-cast v3, Ljavax/crypto/spec/PSource$PSpecified;

    invoke-virtual {v3}, Ljavax/crypto/spec/PSource$PSpecified;->getValue()[B

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, Lorg/bouncycastle/crypto/encodings/OAEPEncoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;[B)V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->paramSpec:Ljava/security/spec/AlgorithmParameterSpec;

    return-void

    :cond_0
    new-instance p1, Ljavax/crypto/NoSuchPaddingException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no match on OAEP constructor for digest algorithm: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public engineDoFinal([BII[BI)I
    .locals 2

    .line 0
    invoke-virtual {p0, p3}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->engineGetOutputSize(I)I

    move-result v0

    add-int/2addr v0, p5

    array-length v1, p4

    if-gt v0, v1, :cond_5

    if-eqz p1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :cond_0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    instance-of p1, p1, Lorg/bouncycastle/crypto/engines/ElGamalEngine;

    const-string p2, "too much data for ElGamal block"

    if-eqz p1, :cond_2

    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {p3}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->getInputBlockSize()I

    move-result p3

    add-int/lit8 p3, p3, 0x1

    if-gt p1, p3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {p3}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->getInputBlockSize()I

    move-result p3

    if-gt p1, p3, :cond_4

    :goto_0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->getOutput()[B

    move-result-object p1

    const/4 p2, 0x0

    :goto_1
    array-length p3, p1

    if-eq p2, p3, :cond_3

    add-int p3, p5, p2

    aget-byte v0, p1, p2

    aput-byte v0, p4, p3

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_3
    array-length p1, p1

    return p1

    :cond_4
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljavax/crypto/ShortBufferException;

    const-string p2, "output buffer too short for input."

    invoke-direct {p1, p2}, Ljavax/crypto/ShortBufferException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineDoFinal([BII)[B
    .locals 1

    if-eqz p1, :cond_0

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :cond_0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    instance-of p1, p1, Lorg/bouncycastle/crypto/engines/ElGamalEngine;

    const-string p2, "too much data for ElGamal block"

    if-eqz p1, :cond_2

    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {p3}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->getInputBlockSize()I

    move-result p3

    add-int/lit8 p3, p3, 0x1

    if-gt p1, p3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {p3}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->getInputBlockSize()I

    move-result p3

    if-gt p1, p3, :cond_3

    :goto_0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->getOutput()[B

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineGetBlockSize()I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->getInputBlockSize()I

    move-result v0

    return v0
.end method

.method public engineGetKeySize(Ljava/security/Key;)I
    .locals 1

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/jce/interfaces/ElGamalKey;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/bouncycastle/jce/interfaces/ElGamalKey;

    invoke-interface {p1}, Lorg/bouncycastle/jce/interfaces/ElGamalKey;->getParameters()Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljavax/crypto/interfaces/DHKey;

    if-eqz v0, :cond_1

    check-cast p1, Ljavax/crypto/interfaces/DHKey;

    invoke-interface {p1}, Ljavax/crypto/interfaces/DHKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object p1

    invoke-virtual {p1}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not an ElGamal key!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineGetOutputSize(I)I
    .locals 0

    .line 0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->getOutputBlockSize()I

    move-result p1

    return p1
.end method

.method public engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->engineParams:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->paramSpec:Ljava/security/spec/AlgorithmParameterSpec;

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "OAEP"

    invoke-virtual {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;->createParametersInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->engineParams:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->paramSpec:Ljava/security/spec/AlgorithmParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->engineParams:Ljava/security/AlgorithmParameters;

    return-object v0
.end method

.method public engineInit(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V
    .locals 0

    .line 0
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "can\'t handle parameters in ElGamal"

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineInit(ILjava/security/Key;Ljava/security/SecureRandom;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    :try_start_0
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/security/InvalidKeyException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Eeeek! "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 4

    instance-of v0, p2, Ljavax/crypto/interfaces/DHPublicKey;

    if-eqz v0, :cond_0

    check-cast p2, Ljava/security/PublicKey;

    invoke-static {p2}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/ElGamalUtil;->generatePublicKeyParameter(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p2

    goto :goto_0

    :cond_0
    instance-of v0, p2, Ljavax/crypto/interfaces/DHPrivateKey;

    if-eqz v0, :cond_c

    check-cast p2, Ljava/security/PrivateKey;

    invoke-static {p2}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/ElGamalUtil;->generatePrivateKeyParameter(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p2

    :goto_0
    instance-of v0, p3, Ljavax/crypto/spec/OAEPParameterSpec;

    if-eqz v0, :cond_6

    move-object v0, p3

    check-cast v0, Ljavax/crypto/spec/OAEPParameterSpec;

    iput-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->paramSpec:Ljava/security/spec/AlgorithmParameterSpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFAlgorithm()Ljava/lang/String;

    move-result-object p3

    const-string v1, "MGF1"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_2

    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFAlgorithm()Ljava/lang/String;

    move-result-object p3

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_mgf1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "unknown mask generation function specified"

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFParameters()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p3

    instance-of p3, p3, Ljava/security/spec/MGF1ParameterSpec;

    if-eqz p3, :cond_5

    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lorg/bouncycastle/jcajce/provider/util/DigestFactory;->getDigest(Ljava/lang/String;)Lorg/bouncycastle/crypto/Digest;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFParameters()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v1

    check-cast v1, Ljava/security/spec/MGF1ParameterSpec;

    invoke-virtual {v1}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/jcajce/provider/util/DigestFactory;->getDigest(Ljava/lang/String;)Lorg/bouncycastle/crypto/Digest;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v1, Lorg/bouncycastle/crypto/encodings/OAEPEncoding;

    new-instance v3, Lorg/bouncycastle/crypto/engines/ElGamalEngine;

    invoke-direct {v3}, Lorg/bouncycastle/crypto/engines/ElGamalEngine;-><init>()V

    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getPSource()Ljavax/crypto/spec/PSource;

    move-result-object v0

    check-cast v0, Ljavax/crypto/spec/PSource$PSpecified;

    invoke-virtual {v0}, Ljavax/crypto/spec/PSource$PSpecified;->getValue()[B

    move-result-object v0

    invoke-direct {v1, v3, p3, v2, v0}, Lorg/bouncycastle/crypto/encodings/OAEPEncoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;[B)V

    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "no match on MGF digest algorithm: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "no match on digest algorithm: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "unkown MGF parameters"

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez p3, :cond_b

    :goto_2
    if-eqz p4, :cond_7

    new-instance p3, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-direct {p3, p2, p4}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    move-object p2, p3

    :cond_7
    const/4 p3, 0x1

    if-eq p1, p3, :cond_a

    const/4 p4, 0x2

    if-eq p1, p4, :cond_9

    const/4 p4, 0x3

    if-eq p1, p4, :cond_a

    const/4 p3, 0x4

    if-ne p1, p3, :cond_8

    goto :goto_3

    :cond_8
    new-instance p2, Ljava/security/InvalidParameterException;

    const-string p3, "unknown opmode "

    const-string p4, " passed to ElGamal"

    .line 0
    invoke-static {p1, p3, p4}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    :goto_3
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    const/4 p3, 0x0

    goto :goto_4

    :cond_a
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    :goto_4
    invoke-interface {p1, p3, p2}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_b
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "unknown parameter type."

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string p2, "unknown key type passed to ElGamal"

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSetMode(Ljava/lang/String;)V
    .locals 2

    .line 3
    invoke-static {p1}, Lorg/bouncycastle/util/Strings;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "NONE"

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "ECB"

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    const-string v1, "can\'t support mode "

    .line 0
    invoke-static {v1, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public engineSetPadding(Ljava/lang/String;)V
    .locals 4

    .line 3
    invoke-static {p1}, Lorg/bouncycastle/util/Strings;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "NOPADDING"

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 14
    new-instance p1, Lorg/bouncycastle/crypto/engines/ElGamalEngine;

    .line 17
    invoke-direct {p1}, Lorg/bouncycastle/crypto/engines/ElGamalEngine;-><init>()V

    .line 19
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    return-void

    :cond_0
    const-string v1, "PKCS1PADDING"

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 30
    new-instance p1, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;

    .line 32
    new-instance v0, Lorg/bouncycastle/crypto/engines/ElGamalEngine;

    .line 35
    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/ElGamalEngine;-><init>()V

    .line 38
    invoke-direct {p1, v0}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    .line 40
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    return-void

    :cond_1
    const-string v1, "ISO9796-1PADDING"

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 51
    new-instance p1, Lorg/bouncycastle/crypto/encodings/ISO9796d1Encoding;

    .line 53
    new-instance v0, Lorg/bouncycastle/crypto/engines/ElGamalEngine;

    .line 56
    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/ElGamalEngine;-><init>()V

    .line 59
    invoke-direct {p1, v0}, Lorg/bouncycastle/crypto/encodings/ISO9796d1Encoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    .line 61
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->cipher:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    return-void

    :cond_2
    const-string v1, "OAEPPADDING"

    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 72
    sget-object p1, Ljavax/crypto/spec/OAEPParameterSpec;->DEFAULT:Ljavax/crypto/spec/OAEPParameterSpec;

    .line 75
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_3
    const-string v1, "OAEPWITHMD5ANDMGF1PADDING"

    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "MGF1"

    if-eqz v1, :cond_4

    .line 88
    new-instance p1, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 90
    new-instance v0, Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "MD5"

    .line 95
    invoke-direct {v0, v1}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    .line 97
    sget-object v3, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    .line 100
    invoke-direct {p1, v1, v2, v0, v3}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 103
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_4
    const-string v1, "OAEPWITHSHA1ANDMGF1PADDING"

    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 114
    sget-object p1, Ljavax/crypto/spec/OAEPParameterSpec;->DEFAULT:Ljavax/crypto/spec/OAEPParameterSpec;

    .line 117
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_5
    const-string v1, "OAEPWITHSHA224ANDMGF1PADDING"

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 128
    new-instance p1, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 130
    new-instance v0, Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "SHA-224"

    .line 135
    invoke-direct {v0, v1}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    .line 137
    sget-object v3, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    .line 140
    invoke-direct {p1, v1, v2, v0, v3}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 143
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_6
    const-string v1, "OAEPWITHSHA256ANDMGF1PADDING"

    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 154
    new-instance p1, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 156
    sget-object v0, Ljava/security/spec/MGF1ParameterSpec;->SHA256:Ljava/security/spec/MGF1ParameterSpec;

    .line 158
    sget-object v1, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    const-string v3, "SHA-256"

    .line 163
    invoke-direct {p1, v3, v2, v0, v1}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 166
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_7
    const-string v1, "OAEPWITHSHA384ANDMGF1PADDING"

    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 177
    new-instance p1, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 179
    sget-object v0, Ljava/security/spec/MGF1ParameterSpec;->SHA384:Ljava/security/spec/MGF1ParameterSpec;

    .line 181
    sget-object v1, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    const-string v3, "SHA-384"

    .line 186
    invoke-direct {p1, v3, v2, v0, v1}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 189
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_8
    const-string v1, "OAEPWITHSHA512ANDMGF1PADDING"

    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 200
    new-instance p1, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 202
    sget-object v0, Ljava/security/spec/MGF1ParameterSpec;->SHA512:Ljava/security/spec/MGF1ParameterSpec;

    .line 204
    sget-object v1, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    const-string v3, "SHA-512"

    .line 209
    invoke-direct {p1, v3, v2, v0, v1}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 212
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_9
    const-string v1, "OAEPWITHSHA3-224ANDMGF1PADDING"

    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 223
    new-instance p1, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 225
    new-instance v0, Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "SHA3-224"

    .line 230
    invoke-direct {v0, v1}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    .line 232
    sget-object v3, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    .line 235
    invoke-direct {p1, v1, v2, v0, v3}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 238
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_a
    const-string v1, "OAEPWITHSHA3-256ANDMGF1PADDING"

    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 249
    new-instance p1, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 251
    new-instance v0, Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "SHA3-256"

    .line 256
    invoke-direct {v0, v1}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    .line 258
    sget-object v3, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    .line 261
    invoke-direct {p1, v1, v2, v0, v3}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 264
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_b
    const-string v1, "OAEPWITHSHA3-384ANDMGF1PADDING"

    .line 270
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 275
    new-instance p1, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 277
    new-instance v0, Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "SHA3-384"

    .line 282
    invoke-direct {v0, v1}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    .line 284
    sget-object v3, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    .line 287
    invoke-direct {p1, v1, v2, v0, v3}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 290
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    :cond_c
    const-string v1, "OAEPWITHSHA3-512ANDMGF1PADDING"

    .line 296
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 301
    new-instance p1, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 303
    new-instance v0, Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "SHA3-512"

    .line 308
    invoke-direct {v0, v1}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    .line 310
    sget-object v3, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    .line 313
    invoke-direct {p1, v1, v2, v0, v3}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 316
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->initFromSpec(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void

    .line 319
    :cond_d
    new-instance v0, Ljavax/crypto/NoSuchPaddingException;

    const-string v1, " unavailable with ElGamal."

    .line 0
    invoke-static {p1, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public engineUpdate([BII[BI)I
    .locals 0

    .line 0
    iget-object p4, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {p4, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    const/4 p1, 0x0

    return p1
.end method

.method public engineUpdate([BII)[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/elgamal/CipherSpi;->bOut:Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    const/4 p1, 0x0

    return-object p1
.end method
