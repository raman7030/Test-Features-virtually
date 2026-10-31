.class public Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;
.super Ljava/security/KeyPairGeneratorSpi;


# instance fields
.field public final algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public final generators:[Ljava/security/KeyPairGenerator;

.field public parametersInitialized:Z

.field public secureRandom:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 5

    .line 3
    invoke-direct {p0}, Ljava/security/KeyPairGeneratorSpi;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->parametersInitialized:Z

    .line 8
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 11
    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getPairing(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)[Ljava/lang/String;

    move-result-object v1

    .line 15
    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getKeyPairSpecs(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)[Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p1

    .line 17
    array-length v2, v1

    .line 19
    new-array v2, v2, [Ljava/security/KeyPairGenerator;

    .line 21
    iput-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->generators:[Ljava/security/KeyPairGenerator;

    .line 22
    :goto_0
    array-length v2, v1

    if-eq v0, v2, :cond_1

    .line 26
    :try_start_0
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->generators:[Ljava/security/KeyPairGenerator;

    .line 28
    aget-object v3, v1, v0

    .line 31
    invoke-static {v3}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getBaseName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "BC"

    .line 37
    invoke-static {v3, v4}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v3

    .line 40
    aput-object v3, v2, v0

    .line 42
    aget-object v2, p1, v0

    if-eqz v2, :cond_0

    .line 46
    iget-object v3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->generators:[Ljava/security/KeyPairGenerator;

    .line 48
    aget-object v3, v3, v0

    .line 51
    invoke-virtual {v3, v2}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to create base generator: "

    .line 66
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private getCompositeKeyPair()Ljava/security/KeyPair;
    .locals 5

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->generators:[Ljava/security/KeyPairGenerator;

    array-length v1, v0

    new-array v1, v1, [Ljava/security/PublicKey;

    array-length v0, v0

    new-array v0, v0, [Ljava/security/PrivateKey;

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->generators:[Ljava/security/KeyPairGenerator;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    aget-object v3, v3, v2

    invoke-virtual {v3}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-virtual {v3}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Lorg/bouncycastle/jcajce/CompositePublicKey;

    iget-object v3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v2, v3, v1}, Lorg/bouncycastle/jcajce/CompositePublicKey;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[Ljava/security/PublicKey;)V

    new-instance v1, Lorg/bouncycastle/jcajce/CompositePrivateKey;

    iget-object v3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, v3, v0}, Lorg/bouncycastle/jcajce/CompositePrivateKey;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[Ljava/security/PrivateKey;)V

    new-instance v0, Ljava/security/KeyPair;

    invoke-direct {v0, v2, v1}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v0
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->getCompositeKeyPair()Ljava/security/KeyPair;

    move-result-object v0

    return-object v0
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
    .locals 3

    if-nez p1, :cond_2

    .line 0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getKeyPairSpecs(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)[Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-eq v0, v1, :cond_1

    aget-object v1, p1, v0

    if-eqz v1, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyPairGeneratorSpi;->generators:[Ljava/security/KeyPairGenerator;

    aget-object v2, v2, v0

    invoke-virtual {v2, v1, p2}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Use initialize only for custom SecureRandom. AlgorithmParameterSpec must be null because it is determined by algorithm name."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
