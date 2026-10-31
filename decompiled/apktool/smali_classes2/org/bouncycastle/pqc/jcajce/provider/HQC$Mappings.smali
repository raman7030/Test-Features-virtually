.class public Lorg/bouncycastle/pqc/jcajce/provider/HQC$Mappings;
.super Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V
    .locals 14

    const-string v0, "KeyFactory.HQC"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi"

    .line 7
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.KeyFactory.HQC"

    const-string v1, "HQC"

    .line 14
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->hqc128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 18
    new-instance v7, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyFactorySpi$HQC128;

    .line 21
    invoke-direct {v7}, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyFactorySpi$HQC128;-><init>()V

    const-string v4, "HQC128"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi$HQC128"

    move-object v2, p0

    move-object v3, p1

    move-object v6, v0

    .line 30
    invoke-virtual/range {v2 .. v7}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 33
    sget-object v2, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->hqc192:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 35
    new-instance v13, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyFactorySpi$HQC192;

    .line 38
    invoke-direct {v13}, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyFactorySpi$HQC192;-><init>()V

    const-string v10, "HQC192"

    const-string v11, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi$HQC192"

    move-object v8, p0

    move-object v9, p1

    move-object v12, v2

    .line 46
    invoke-virtual/range {v8 .. v13}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 49
    sget-object v9, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->hqc256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 51
    new-instance v8, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyFactorySpi$HQC256;

    .line 54
    invoke-direct {v8}, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyFactorySpi$HQC256;-><init>()V

    const-string v5, "HQC256"

    const-string v6, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi$HQC256"

    move-object v3, p0

    move-object v4, p1

    move-object v7, v9

    .line 61
    invoke-virtual/range {v3 .. v8}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    const-string v3, "KeyPairGenerator.HQC"

    const-string v4, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyPairGeneratorSpi"

    .line 68
    invoke-interface {p1, v3, v4}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Alg.Alias.KeyPairGenerator.HQC"

    .line 73
    invoke-interface {p1, v3, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyPairGeneratorSpi$HQC128"

    const-string v4, "HQC128"

    .line 80
    invoke-virtual {p0, p1, v4, v3, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyPairGeneratorSpi$HQC192"

    const-string v5, "HQC192"

    .line 87
    invoke-virtual {p0, p1, v5, v3, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyPairGeneratorSpi$HQC256"

    const-string v6, "HQC256"

    .line 94
    invoke-virtual {p0, p1, v6, v3, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "KeyGenerator.HQC"

    const-string v7, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyGeneratorSpi"

    .line 101
    invoke-interface {p1, v3, v7}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyGeneratorSpi$HQC128"

    .line 106
    invoke-virtual {p0, p1, v4, v3, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyGeneratorSpi$HQC192"

    .line 111
    invoke-virtual {p0, p1, v5, v3, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyGeneratorSpi$HQC256"

    .line 116
    invoke-virtual {p0, p1, v6, v3, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    .line 118
    new-instance v3, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyFactorySpi;

    .line 121
    invoke-direct {v3}, Lorg/bouncycastle/pqc/jcajce/provider/hqc/HQCKeyFactorySpi;-><init>()V

    const-string v7, "Cipher.HQC"

    const-string v8, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$Base"

    .line 128
    invoke-interface {p1, v7, v8}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "Alg.Alias.Cipher.HQC"

    .line 133
    invoke-interface {p1, v7, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Alg.Alias.Cipher."

    .line 140
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->pqc_kem_hqc:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 0
    invoke-static {v7, v8, p1, v1}, Ll/᩵۫ۡ;->֫(Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V

    const-string v7, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$HQC128"

    invoke-virtual {p0, p1, v4, v7, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v4, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$HQC192"

    invoke-virtual {p0, p1, v5, v4, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v4, "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$HQC256"

    invoke-virtual {p0, p1, v6, v4, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-virtual {p0, p1, v8, v1, v3}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->registerOid(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {p1, v0, v3}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {p1, v2, v3}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {p1, v9, v3}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    return-void
.end method
