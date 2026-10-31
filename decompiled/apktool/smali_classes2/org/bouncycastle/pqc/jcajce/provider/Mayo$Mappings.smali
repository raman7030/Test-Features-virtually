.class public Lorg/bouncycastle/pqc/jcajce/provider/Mayo$Mappings;
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
    .locals 11

    const-string v0, "KeyFactory.Mayo"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi"

    .line 0
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi$Mayo1;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi$Mayo1;-><init>()V

    const-string v2, "MAYO_1"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi$Mayo1"

    move-object v0, p0

    move-object v1, p1

    move-object v4, v6

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v7, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi$Mayo2;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi$Mayo2;-><init>()V

    const-string v2, "MAYO_2"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi$Mayo2"

    move-object v4, v7

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi$Mayo3;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi$Mayo3;-><init>()V

    const-string v2, "MAYO_3"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi$Mayo3"

    move-object v4, v8

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v9, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo5:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi$Mayo5;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi$Mayo5;-><init>()V

    const-string v2, "MAYO_5"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyFactorySpi$Mayo5"

    move-object v4, v9

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    const-string v0, "KeyPairGenerator.Mayo"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi$Mayo1"

    const-string v1, "MAYO_1"

    invoke-virtual {p0, p1, v1, v0, v6}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi$Mayo2"

    const-string v2, "MAYO_2"

    invoke-virtual {p0, p1, v2, v0, v7}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi$Mayo3"

    const-string v3, "MAYO_3"

    invoke-virtual {p0, p1, v3, v0, v8}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.mayo.MayoKeyPairGeneratorSpi$Mayo5"

    const-string v4, "MAYO_5"

    invoke-virtual {p0, p1, v4, v0, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Base"

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v10, "Mayo"

    invoke-virtual {p0, p1, v10, v0, v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Mayo1"

    invoke-virtual {p0, p1, v1, v0, v6}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Mayo2"

    invoke-virtual {p0, p1, v2, v0, v7}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Mayo3"

    invoke-virtual {p0, p1, v3, v0, v8}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.mayo.SignatureSpi$Mayo5"

    invoke-virtual {p0, p1, v4, v0, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
