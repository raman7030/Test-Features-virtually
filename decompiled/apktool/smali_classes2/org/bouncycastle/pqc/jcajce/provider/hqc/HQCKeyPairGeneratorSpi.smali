.class public Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;
.super Ljava/security/KeyPairGenerator;


# static fields
.field public static parameters:Ljava/util/Map;


# instance fields
.field public engine:Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;

.field public initialised:Z

.field public param:Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyGenerationParameters;

.field public random:Ljava/security/SecureRandom;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc128:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    const-string v2, "hqc-128"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v2, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc192:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    const-string v3, "hqc-192"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc256:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    const-string v4, "hqc-256"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v4, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;->hqc128:Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;->hqc192:Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;->hqc256:Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "HQC"

    .line 0
    invoke-direct {p0, v0}, Ljava/security/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;

    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->random:Ljava/security/SecureRandom;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->initialised:Z

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;)V
    .locals 0

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/util/Strings;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance p1, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;

    invoke-direct {p1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;

    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->random:Ljava/security/SecureRandom;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->initialised:Z

    return-void
.end method

.method public static getNameFromParams(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/lang/String;
    .locals 1

    .line 0
    instance-of v0, p0, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/jcajce/spec/HQCParameterSpec;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lorg/bouncycastle/jcajce/util/SpecUtil;->getNameFrom(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/util/Strings;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 4

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->initialised:Z

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyGenerationParameters;

    iget-object v1, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->random:Ljava/security/SecureRandom;

    sget-object v2, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc128:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;)V

    iput-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->param:Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyGenerationParameters;

    iget-object v1, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->initialised:Z

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/pqc/crypto/hqc/HQCPublicKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCPrivateKeyParameters;

    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/bouncycastle/pqc/jcajce/provider/hqc/BCHQCPublicKey;

    invoke-direct {v3, v1}, Lorg/bouncycastle/pqc/jcajce/provider/hqc/BCHQCPublicKey;-><init>(Lorg/bouncycastle/pqc/crypto/hqc/HQCPublicKeyParameters;)V

    new-instance v1, Lorg/bouncycastle/pqc/jcajce/provider/hqc/BCHQCPrivateKey;

    invoke-direct {v1, v0}, Lorg/bouncycastle/pqc/jcajce/provider/hqc/BCHQCPrivateKey;-><init>(Lorg/bouncycastle/pqc/crypto/hqc/HQCPrivateKeyParameters;)V

    invoke-direct {v2, v3, v1}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v2
.end method

.method public initialize(ILjava/security/SecureRandom;)V
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "use AlgorithmParameterSpec"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 2

    invoke-static {p1}, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->getNameFromParams(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyGenerationParameters;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    invoke-direct {p1, p2, v0}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;)V

    iput-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->param:Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyGenerationParameters;

    iget-object p2, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;

    invoke-virtual {p2, p1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyPairGeneratorSpi;->initialised:Z

    return-void

    :cond_0
    new-instance p2, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "invalid ParameterSpec: "

    .line 0
    invoke-static {v0, p1}, Ll/ܽܳۧ;->֫(Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
