.class public Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;
.super Ljava/security/Signature;


# instance fields
.field public final bOut:Ljava/io/ByteArrayOutputStream;

.field public final parameters:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

.field public random:Ljava/security/SecureRandom;

.field public final signer:Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;)V
    .locals 1

    const-string v0, "Snova"

    .line 0
    invoke-direct {p0, v0}, Ljava/security/Signature;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->bOut:Ljava/io/ByteArrayOutputStream;

    iput-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->parameters:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;)V
    .locals 1

    .line 0
    invoke-virtual {p2}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/Strings;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/Signature;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->parameters:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object p2, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->bOut:Ljava/io/ByteArrayOutputStream;

    iput-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;

    return-void
.end method


# virtual methods
.method public engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "engineSetParameter unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineInitSign(Ljava/security/PrivateKey;)V
    .locals 4

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPrivateKey;

    if-eqz v0, :cond_3

    check-cast p1, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPrivateKey;

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPrivateKey;->getKeyParams()Lorg/bouncycastle/pqc/crypto/snova/SnovaPrivateKeyParameters;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->parameters:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/util/Strings;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPrivateKey;->getAlgorithm()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "signature configured for "

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->random:Ljava/security/SecureRandom;

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    iget-object v2, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;

    new-instance v3, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-direct {v3, v0, p1}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    invoke-virtual {v2, v1, v3}, Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_2
    iget-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;

    invoke-virtual {p1, v1, v0}, Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_3
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "unknown private key passed to Snova"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineInitSign(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V
    .locals 0

    .line 0
    iput-object p2, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->random:Ljava/security/SecureRandom;

    invoke-virtual {p0, p1}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->engineInitSign(Ljava/security/PrivateKey;)V

    return-void
.end method

.method public engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    .line 2
    instance-of v0, p1, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPublicKey;

    if-nez v0, :cond_0

    .line 6
    :try_start_0
    new-instance v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPublicKey;

    .line 9
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    .line 13
    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object p1

    .line 17
    invoke-direct {v0, p1}, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPublicKey;-><init>(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 22
    new-instance v0, Ljava/security/InvalidKeyException;

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown public key passed to Snova: "

    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :goto_0
    check-cast p1, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPublicKey;

    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->parameters:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/Strings;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v1, "signature configured for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPublicKey;->getKeyParams()Lorg/bouncycastle/pqc/crypto/snova/SnovaPublicKeyParameters;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "engineSetParameter unsupported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "engineSetParameter unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSign()[B
    .locals 2

    .line 0
    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    iget-object v1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;->generateSignature([B)[B

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

.method public engineUpdate(B)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    return-void
.end method

.method public engineUpdate([BII)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    return-void
.end method

.method public engineVerify([B)Z
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    iget-object v1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;

    invoke-virtual {v1, v0, p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaSigner;->verifySignature([B[B)Z

    move-result p1

    return p1
.end method
