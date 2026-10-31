.class public Lorg/bouncycastle/pqc/jcajce/provider/BIKE$Mappings;
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
    .locals 6

    const-string v0, "KeyFactory.BIKE"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyFactorySpi"

    .line 7
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyPairGenerator.BIKE"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyPairGeneratorSpi"

    .line 14
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyGenerator.BIKE"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyGeneratorSpi"

    .line 21
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    new-instance v0, Lorg/bouncycastle/pqc/jcajce/provider/bike/BIKEKeyFactorySpi;

    .line 26
    invoke-direct {v0}, Lorg/bouncycastle/pqc/jcajce/provider/bike/BIKEKeyFactorySpi;-><init>()V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.bike.BIKECipherSpi$Base"

    const-string v2, "Alg.Alias.Cipher."

    const-string v3, "Cipher.BIKE"

    .line 0
    invoke-static {p1, v3, v1, v2}, Ll/ᩴۘܿ;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->pqc_kem_bike:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v3, "BIKE"

    invoke-static {v1, v2, p1, v3}, Ll/᩵۫ۡ;->֫(Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.bike.BIKECipherSpi$BIKE128"

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->bike128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "BIKE128"

    invoke-virtual {p0, p1, v5, v1, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.bike.BIKECipherSpi$BIKE192"

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->bike192:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "BIKE192"

    invoke-virtual {p0, p1, v5, v1, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.bike.BIKECipherSpi$BIKE256"

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->bike256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "BIKE256"

    invoke-virtual {p0, p1, v5, v1, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-virtual {p0, p1, v2, v3, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->registerOid(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    return-void
.end method
