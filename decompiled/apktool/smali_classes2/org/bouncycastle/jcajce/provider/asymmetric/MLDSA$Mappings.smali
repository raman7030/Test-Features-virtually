.class public Lorg/bouncycastle/jcajce/provider/asymmetric/MLDSA$Mappings;
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
    .locals 18

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const-string v0, "KeyFactory.ML-DSA"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$Pure"

    .line 0
    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyPairGenerator.ML-DSA"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$Pure"

    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.KeyFactory.MLDSA"

    const-string v8, "ML-DSA"

    invoke-interface {v7, v0, v8}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.KeyPairGenerator.MLDSA"

    invoke-interface {v7, v0, v8}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyFactory.HASH-ML-DSA"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$Hash"

    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyPairGenerator.HASH-ML-DSA"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$Hash"

    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.KeyFactory.SHA512WITHMLDSA"

    const-string v9, "HASH-ML-DSA"

    invoke-interface {v7, v0, v9}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.KeyPairGenerator.SHA512WITHMLDSA"

    invoke-interface {v7, v0, v9}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v10, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_44:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$MLDSA44;

    invoke-direct {v5}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$MLDSA44;-><init>()V

    const-string v2, "ML-DSA-44"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$MLDSA44"

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v4, v10

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v11, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_65:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$MLDSA65;

    invoke-direct {v5}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$MLDSA65;-><init>()V

    const-string v2, "ML-DSA-65"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$MLDSA65"

    move-object v4, v11

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v12, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_87:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$MLDSA87;

    invoke-direct {v5}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$MLDSA87;-><init>()V

    const-string v2, "ML-DSA-87"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$MLDSA87"

    move-object v4, v12

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v13, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_ml_dsa_44_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$HashMLDSA44;

    invoke-direct {v5}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$HashMLDSA44;-><init>()V

    const-string v2, "ML-DSA-44-WITH-SHA512"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$HashMLDSA44"

    move-object v4, v13

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v14, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_ml_dsa_65_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$HashMLDSA65;

    invoke-direct {v5}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$HashMLDSA65;-><init>()V

    const-string v2, "ML-DSA-65-WITH-SHA512"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$HashMLDSA65"

    move-object v4, v14

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_ml_dsa_87_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$HashMLDSA87;

    invoke-direct {v5}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$HashMLDSA87;-><init>()V

    const-string v2, "ML-DSA-87-WITH-SHA512"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyFactorySpi$HashMLDSA87"

    move-object v4, v15

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA44"

    const-string v1, "ML-DSA-44"

    invoke-virtual {v6, v7, v1, v0, v10}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA65"

    const-string v2, "ML-DSA-65"

    invoke-virtual {v6, v7, v2, v0, v11}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA87"

    const-string v3, "ML-DSA-87"

    invoke-virtual {v6, v7, v3, v0, v12}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA44withSHA512"

    const-string v4, "ML-DSA-44-WITH-SHA512"

    invoke-virtual {v6, v7, v4, v0, v13}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA65withSHA512"

    const-string v5, "ML-DSA-65-WITH-SHA512"

    invoke-virtual {v6, v7, v5, v0, v14}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.MLDSAKeyPairGeneratorSpi$MLDSA87withSHA512"

    move-object/from16 v16, v5

    const-string v5, "ML-DSA-87-WITH-SHA512"

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA"

    move-object/from16 v17, v5

    const/4 v5, 0x0

    invoke-virtual {v6, v7, v8, v0, v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA44"

    invoke-virtual {v6, v7, v1, v0, v10}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA65"

    invoke-virtual {v6, v7, v2, v0, v11}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSA87"

    invoke-virtual {v6, v7, v3, v0, v12}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "Alg.Alias.Signature.MLDSA"

    invoke-interface {v7, v0, v8}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSACalcMu"

    const-string v1, "ML-DSA-CALCULATE-MU"

    invoke-virtual {v6, v7, v1, v0, v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "Alg.Alias.Signature.MLDSA-CALCULATE-MU"

    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi$MLDSAExtMu"

    const-string v1, "ML-DSA-EXTERNAL-MU"

    invoke-virtual {v6, v7, v1, v0, v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "Alg.Alias.Signature.MLDSA-EXTERNAL-MU"

    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA"

    invoke-virtual {v6, v7, v9, v0, v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA44"

    invoke-virtual {v6, v7, v4, v0, v13}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA65"

    move-object/from16 v1, v16

    invoke-virtual {v6, v7, v1, v0, v14}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.jcajce.provider.asymmetric.mldsa.HashSignatureSpi$MLDSA87"

    move-object/from16 v2, v17

    invoke-virtual {v6, v7, v2, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "Alg.Alias.Signature.SHA512WITHMLDSA"

    invoke-interface {v7, v0, v9}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.Signature.SHA512WITHMLDSA44"

    invoke-interface {v7, v0, v4}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.Signature.SHA512WITHMLDSA65"

    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.Signature.SHA512WITHMLDSA87"

    invoke-interface {v7, v0, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$Hash;

    invoke-direct {v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$Hash;-><init>()V

    invoke-interface {v7, v10, v0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {v7, v11, v0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {v7, v12, v0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {v7, v13, v0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {v7, v14, v0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-interface {v7, v15, v0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    return-void
.end method
