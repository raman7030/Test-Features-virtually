.class public Lorg/bouncycastle/jcajce/provider/asymmetric/MLKEM$Mappings;
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

    const-string v0, "KeyFactory.ML-KEM"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi"

    .line 0
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.KeyFactory.MLKEM"

    const-string v1, "ML-KEM"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_alg_ml_kem_512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v7, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi$MLKEM512;

    invoke-direct {v7}, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi$MLKEM512;-><init>()V

    const-string v4, "ML-KEM-512"

    const-string v5, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi$MLKEM512"

    move-object v2, p0

    move-object v3, p1

    move-object v6, v0

    invoke-virtual/range {v2 .. v7}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_alg_ml_kem_768:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v13, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi$MLKEM768;

    invoke-direct {v13}, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi$MLKEM768;-><init>()V

    const-string v10, "ML-KEM-768"

    const-string v11, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi$MLKEM768"

    move-object v8, p0

    move-object v9, p1

    move-object v12, v2

    invoke-virtual/range {v8 .. v13}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v9, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_alg_ml_kem_1024:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v8, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi$MLKEM1024;

    invoke-direct {v8}, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi$MLKEM1024;-><init>()V

    const-string v5, "ML-KEM-1024"

    const-string v6, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi$MLKEM1024"

    move-object v3, p0

    move-object v4, p1

    move-object v7, v9

    invoke-virtual/range {v3 .. v8}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    const-string v3, "KeyPairGenerator.ML-KEM"

    const-string v4, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi"

    invoke-interface {p1, v3, v4}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Alg.Alias.KeyPairGenerator.MLKEM"

    invoke-interface {p1, v3, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi$MLKEM512"

    const-string v4, "ML-KEM-512"

    invoke-virtual {p0, p1, v4, v3, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi$MLKEM768"

    const-string v5, "ML-KEM-768"

    invoke-virtual {p0, p1, v5, v3, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyPairGeneratorSpi$MLKEM1024"

    const-string v6, "ML-KEM-1024"

    invoke-virtual {p0, p1, v6, v3, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "KeyGenerator.ML-KEM"

    const-string v7, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi"

    invoke-interface {p1, v3, v7}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi$MLKEM512"

    invoke-virtual {p0, p1, v4, v3, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi$MLKEM768"

    invoke-virtual {p0, p1, v5, v3, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyGeneratorSpi$MLKEM1024"

    invoke-virtual {p0, p1, v6, v3, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    new-instance v3, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi;

    invoke-direct {v3}, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi;-><init>()V

    const-string v7, "Cipher.ML-KEM"

    const-string v8, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$Base"

    invoke-interface {p1, v7, v8}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "Alg.Alias.Cipher.MLKEM"

    invoke-interface {p1, v7, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$MLKEM512"

    invoke-virtual {p0, p1, v4, v1, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$MLKEM768"

    invoke-virtual {p0, p1, v5, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMCipherSpi$MLKEM1024"

    invoke-virtual {p0, p1, v6, v1, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-interface {p1, v0, v3}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {p1, v2, v3}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {p1, v9, v3}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    return-void
.end method
