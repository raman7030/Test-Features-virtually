.class public Lorg/bouncycastle/jcajce/provider/asymmetric/Falcon$Mappings;
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

    const-string v0, "KeyFactory.FALCON"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi"

    .line 7
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->falcon_512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 11
    new-instance v7, Lorg/bouncycastle/pqc/jcajce/provider/falcon/FalconKeyFactorySpi$Falcon512;

    .line 14
    invoke-direct {v7}, Lorg/bouncycastle/pqc/jcajce/provider/falcon/FalconKeyFactorySpi$Falcon512;-><init>()V

    const-string v4, "FALCON-512"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi$Falcon512"

    move-object v2, p0

    move-object v3, p1

    move-object v6, v0

    .line 23
    invoke-virtual/range {v2 .. v7}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 25
    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->falcon_1024:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 27
    new-instance v13, Lorg/bouncycastle/pqc/jcajce/provider/falcon/FalconKeyFactorySpi$Falcon1024;

    .line 30
    invoke-direct {v13}, Lorg/bouncycastle/pqc/jcajce/provider/falcon/FalconKeyFactorySpi$Falcon1024;-><init>()V

    const-string v10, "FALCON-1024"

    const-string v11, "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi$Falcon1024"

    move-object v8, p0

    move-object v9, p1

    move-object v12, v1

    .line 39
    invoke-virtual/range {v8 .. v13}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    const-string v2, "KeyPairGenerator.FALCON"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi"

    .line 47
    invoke-interface {p1, v2, v3}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi$Falcon512"

    const-string v3, "FALCON-512"

    .line 54
    invoke-virtual {p0, p1, v3, v2, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v2, "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi$Falcon1024"

    const-string v4, "FALCON-1024"

    .line 61
    invoke-virtual {p0, p1, v4, v2, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v2, "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Base"

    .line 65
    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->falcon:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v6, "FALCON"

    .line 70
    invoke-virtual {p0, p1, v6, v2, v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v2, "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Falcon512"

    .line 75
    invoke-virtual {p0, p1, v3, v2, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Falcon1024"

    .line 80
    invoke-virtual {p0, p1, v4, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Alg.Alias.Signature."

    .line 87
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    sget-object v2, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->old_falcon_512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "Alg.Alias.Signature.OID."

    .line 0
    invoke-static {v3, v5, v0, v2, p1}, Ll/ᩴۖܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3, v1, v0, v2, p1}, Ll/ᩴۖܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->old_falcon_1024:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v4, v5, v0, v1, p1}, Ll/ᩴۖܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v1, p1, v4}, Ll/᩵۫ۡ;->֫(Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V

    return-void
.end method
