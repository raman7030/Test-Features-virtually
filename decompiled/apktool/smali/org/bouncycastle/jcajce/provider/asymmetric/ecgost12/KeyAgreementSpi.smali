.class public Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseAgreementSpi;


# instance fields
.field public agreement:Lorg/bouncycastle/crypto/agreement/ECVKOAgreement;

.field public kaAlgorithm:Ljava/lang/String;

.field public parameters:Lorg/bouncycastle/crypto/params/ECDomainParameters;

.field public result:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/crypto/agreement/ECVKOAgreement;Lorg/bouncycastle/crypto/DerivationFunction;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p3}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseAgreementSpi;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/DerivationFunction;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->kaAlgorithm:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->agreement:Lorg/bouncycastle/crypto/agreement/ECVKOAgreement;

    return-void
.end method

.method public static generatePublicKeyParameter(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 1

    .line 0
    instance-of v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/BCECGOST3410_2012PublicKey;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/BCECGOST3410_2012PublicKey;

    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/BCECGOST3410_2012PublicKey;->engineGetKeyParameters()Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;->generatePublicKeyParameter(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p0

    return-object p0
.end method

.method public static getSimpleName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public doCalcSecret()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->result:[B

    return-object v0
.end method

.method public doInitFromKey(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 1

    .line 2
    instance-of p3, p1, Ljava/security/PrivateKey;

    if-eqz p3, :cond_3

    if-eqz p2, :cond_1

    .line 8
    instance-of p3, p2, Lorg/bouncycastle/jcajce/spec/UserKeyingMaterialSpec;

    if-eqz p3, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "No algorithm parameters supported"

    .line 18
    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 19
    throw p1

    .line 21
    :cond_1
    :goto_0
    check-cast p1, Ljava/security/PrivateKey;

    .line 24
    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;->generatePrivateKeyParameter(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p1

    .line 27
    check-cast p1, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    .line 30
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ECKeyParameters;->getParameters()Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object p3

    .line 33
    iput-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->parameters:Lorg/bouncycastle/crypto/params/ECDomainParameters;

    .line 35
    instance-of p3, p2, Lorg/bouncycastle/jcajce/spec/UserKeyingMaterialSpec;

    if-eqz p3, :cond_2

    .line 39
    check-cast p2, Lorg/bouncycastle/jcajce/spec/UserKeyingMaterialSpec;

    .line 42
    invoke-virtual {p2}, Lorg/bouncycastle/jcajce/spec/UserKeyingMaterialSpec;->getUserKeyingMaterial()[B

    move-result-object p2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    .line 47
    :goto_1
    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseAgreementSpi;->ukmParameters:[B

    .line 49
    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->agreement:Lorg/bouncycastle/crypto/agreement/ECVKOAgreement;

    .line 51
    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithUKM;

    .line 54
    invoke-direct {v0, p1, p2}, Lorg/bouncycastle/crypto/params/ParametersWithUKM;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    .line 57
    invoke-virtual {p3, v0}, Lorg/bouncycastle/crypto/agreement/ECVKOAgreement;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    .line 60
    :cond_3
    new-instance p1, Ljava/security/InvalidKeyException;

    .line 62
    new-instance p2, Ljava/lang/StringBuilder;

    .line 65
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->kaAlgorithm:Ljava/lang/String;

    .line 70
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " key agreement requires "

    .line 75
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    const-class p3, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;

    .line 80
    invoke-static {p3}, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->getSimpleName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p3

    const-string v0, " for initialisation"

    .line 0
    invoke-static {p2, p3, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineDoPhase(Ljava/security/Key;Z)Ljava/security/Key;
    .locals 2

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->parameters:Lorg/bouncycastle/crypto/params/ECDomainParameters;

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    .line 8
    instance-of p2, p1, Ljava/security/PublicKey;

    if-eqz p2, :cond_0

    .line 12
    check-cast p1, Ljava/security/PublicKey;

    .line 15
    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->generatePublicKeyParameter(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p1

    .line 18
    :try_start_0
    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->agreement:Lorg/bouncycastle/crypto/agreement/ECVKOAgreement;

    .line 21
    invoke-virtual {p2, p1}, Lorg/bouncycastle/crypto/agreement/ECVKOAgreement;->calculateAgreement(Lorg/bouncycastle/crypto/CipherParameters;)[B

    move-result-object p1

    .line 24
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->result:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    .line 29
    new-instance p2, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi$1;

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "calculation failed: "

    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, p0, v0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi$1;-><init>(Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->kaAlgorithm:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " key agreement requires "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v0, Lorg/bouncycastle/jce/interfaces/ECPublicKey;

    invoke-static {v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->getSimpleName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " for doPhase"

    invoke-static {p2, v0, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->kaAlgorithm:Ljava/lang/String;

    const-string v1, " can only be between two parties."

    invoke-static {p2, v0, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost12/KeyAgreementSpi;->kaAlgorithm:Ljava/lang/String;

    const-string v1, " not initialised."

    invoke-static {p2, v0, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
