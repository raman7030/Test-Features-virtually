.class public Lorg/bouncycastle/jcajce/provider/asymmetric/SLHDSA$Mappings;
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
    .locals 33

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const-string v0, "KeyFactory.SLH-DSA"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Pure"

    .line 9
    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyPairGenerator.SLH-DSA"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Pure"

    .line 16
    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyFactory.HASH-SLH-DSA"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Hash"

    .line 23
    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyPairGenerator.HASH-SLH-DSA"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Hash"

    .line 30
    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    new-instance v8, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi$Hash;

    .line 35
    invoke-direct {v8}, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi$Hash;-><init>()V

    .line 37
    sget-object v9, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-128S"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_128s"

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v4, v9

    move-object v5, v8

    .line 46
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 49
    sget-object v10, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-128F"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_128f"

    move-object v4, v10

    .line 56
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 59
    sget-object v11, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-192S"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_192s"

    move-object v4, v11

    .line 66
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 69
    sget-object v12, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-192F"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_192f"

    move-object v4, v12

    .line 76
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 79
    sget-object v13, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-256S"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_256s"

    move-object v4, v13

    .line 86
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 89
    sget-object v14, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-256F"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Sha2_256f"

    move-object v4, v14

    .line 96
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 99
    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-128S"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_128s"

    move-object v4, v15

    .line 106
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 109
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-128F"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_128f"

    move-object v4, v5

    move-object/from16 v16, v5

    move-object v5, v8

    .line 116
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 119
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-192S"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_192s"

    move-object v4, v5

    move-object/from16 v17, v5

    move-object v5, v8

    .line 126
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 129
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-192F"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_192f"

    move-object v4, v5

    move-object/from16 v18, v5

    move-object v5, v8

    .line 136
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 139
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-256S"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_256s"

    move-object v4, v5

    move-object/from16 v19, v5

    move-object v5, v8

    .line 146
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 148
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-256F"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$Shake_256f"

    move-object v4, v5

    move-object/from16 v20, v5

    move-object v5, v8

    .line 160
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 162
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_128s_with_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-128S-WITH-SHA256"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_128s"

    move-object v4, v5

    move-object/from16 v21, v5

    move-object v5, v8

    .line 174
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 176
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_128f_with_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-128F-WITH-SHA256"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_128f"

    move-object v4, v5

    move-object/from16 v22, v5

    move-object v5, v8

    .line 188
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 190
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_192s_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-192S-WITH-SHA512"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_192s"

    move-object v4, v5

    move-object/from16 v23, v5

    move-object v5, v8

    .line 202
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 204
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_192f_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-192F-WITH-SHA512"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_192f"

    move-object v4, v5

    move-object/from16 v24, v5

    move-object v5, v8

    .line 216
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 218
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_256s_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-256S-WITH-SHA512"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_256s"

    move-object v4, v5

    move-object/from16 v25, v5

    move-object v5, v8

    .line 230
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 232
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_256f_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHA2-256F-WITH-SHA512"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashSha2_256f"

    move-object v4, v5

    move-object/from16 v26, v5

    move-object v5, v8

    .line 244
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 246
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_128s_with_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-128S-WITH-SHAKE128"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_128s"

    move-object v4, v5

    move-object/from16 v27, v5

    move-object v5, v8

    .line 258
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 260
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_128f_with_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-128F-WITH-SHAKE128"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_128f"

    move-object v4, v5

    move-object/from16 v28, v5

    move-object v5, v8

    .line 272
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 274
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_192s_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-192S-WITH-SHAKE256"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_192s"

    move-object v4, v5

    move-object/from16 v29, v5

    move-object v5, v8

    .line 286
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 288
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_192f_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-192F-WITH-SHAKE256"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_192f"

    move-object v4, v5

    move-object/from16 v30, v5

    move-object v5, v8

    .line 300
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 302
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_256s_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-256S-WITH-SHAKE256"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_256s"

    move-object v4, v5

    move-object/from16 v31, v5

    move-object v5, v8

    .line 314
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 316
    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_256f_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SLH-DSA-SHAKE-256F-WITH-SHAKE256"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyFactorySpi$HashShake_256f"

    move-object v4, v5

    move-object/from16 v32, v5

    move-object v5, v8

    .line 328
    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    const-string v0, "SLH-DSA-SHA2-128S"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_128s"

    .line 335
    invoke-virtual {v6, v7, v0, v1, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-128F"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_128f"

    .line 342
    invoke-virtual {v6, v7, v0, v1, v10}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-192S"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_192s"

    .line 349
    invoke-virtual {v6, v7, v0, v1, v11}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-192F"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_192f"

    .line 356
    invoke-virtual {v6, v7, v0, v1, v12}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-256S"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_256s"

    .line 363
    invoke-virtual {v6, v7, v0, v1, v13}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-256F"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Sha2_256f"

    .line 370
    invoke-virtual {v6, v7, v0, v1, v14}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-128S"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_128s"

    .line 377
    invoke-virtual {v6, v7, v0, v1, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-128F"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_128f"

    move-object/from16 v2, v16

    .line 384
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-192S"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_192s"

    move-object/from16 v2, v17

    .line 391
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-192F"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_192f"

    move-object/from16 v2, v18

    .line 398
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-256S"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_256s"

    move-object/from16 v2, v19

    .line 407
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-256F"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$Shake_256f"

    move-object/from16 v2, v20

    .line 416
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-128S-WITH-SHA256"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_128s"

    move-object/from16 v2, v21

    .line 425
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-128F-WITH-SHA256"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_128f"

    move-object/from16 v2, v22

    .line 434
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-192S-WITH-SHA512"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_192s"

    move-object/from16 v2, v23

    .line 443
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-192F-WITH-SHA512"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_192f"

    move-object/from16 v2, v24

    .line 452
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-256S-WITH-SHA512"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_256s"

    move-object/from16 v2, v25

    .line 461
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHA2-256F-WITH-SHA512"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashSha2_256f"

    move-object/from16 v2, v26

    .line 470
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-128S-WITH-SHAKE128"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_128s"

    move-object/from16 v2, v27

    .line 479
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-128F-WITH-SHAKE128"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_128f"

    move-object/from16 v2, v28

    .line 488
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-192S-WITH-SHAKE256"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_192s"

    move-object/from16 v2, v29

    .line 497
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-192F-WITH-SHAKE256"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_192f"

    move-object/from16 v2, v30

    .line 506
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-256S-WITH-SHAKE256"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_256s"

    move-object/from16 v2, v31

    .line 515
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SLH-DSA-SHAKE-256F-WITH-SHAKE256"

    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SLHDSAKeyPairGeneratorSpi$HashShake_256f"

    move-object/from16 v2, v32

    .line 522
    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v18, "SLH-DSA-SHAKE-256S"

    const-string v19, "SLH-DSA-SHAKE-256F"

    const-string v8, "SLH-DSA-SHA2-128S"

    const-string v9, "SLH-DSA-SHA2-128F"

    const-string v10, "SLH-DSA-SHA2-192S"

    const-string v11, "SLH-DSA-SHA2-192F"

    const-string v12, "SLH-DSA-SHA2-256S"

    const-string v13, "SLH-DSA-SHA2-256F"

    const-string v14, "SLH-DSA-SHAKE-128S"

    const-string v15, "SLH-DSA-SHAKE-128F"

    const-string v16, "SLH-DSA-SHAKE-192S"

    const-string v17, "SLH-DSA-SHAKE-192F"

    .line 549
    filled-new-array/range {v8 .. v19}, [Ljava/lang/String;

    move-result-object v0

    const-string v18, "SLH-DSA-SHAKE-256S-WITH-SHAKE256"

    const-string v19, "SLH-DSA-SHAKE-256F-WITH-SHAKE256"

    const-string v8, "SLH-DSA-SHA2-128S-WITH-SHA256"

    const-string v9, "SLH-DSA-SHA2-128F-WITH-SHA256"

    const-string v10, "SLH-DSA-SHA2-192S-WITH-SHA512"

    const-string v11, "SLH-DSA-SHA2-192F-WITH-SHA512"

    const-string v12, "SLH-DSA-SHA2-256S-WITH-SHA512"

    const-string v13, "SLH-DSA-SHA2-256F-WITH-SHA512"

    const-string v14, "SLH-DSA-SHAKE-128S-WITH-SHAKE128"

    const-string v15, "SLH-DSA-SHAKE-128F-WITH-SHAKE128"

    const-string v16, "SLH-DSA-SHAKE-192S-WITH-SHAKE256"

    const-string v17, "SLH-DSA-SHAKE-192F-WITH-SHAKE256"

    .line 577
    filled-new-array/range {v8 .. v19}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "SLH-DSA"

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.SignatureSpi$Direct"

    const/4 v4, 0x0

    .line 586
    invoke-virtual {v6, v7, v2, v3, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "Alg.Alias.Signature.SLHDSA"

    .line 591
    invoke-interface {v7, v3, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.slhdsa.HashSignatureSpi$Direct"

    const-string v5, "HASH-SLH-DSA"

    .line 598
    invoke-virtual {v6, v7, v5, v3, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v3, "Alg.Alias.Signature.HASHWITHSLHDSA"

    .line 603
    invoke-interface {v7, v3, v5}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const-string v8, "Alg.Alias.Signature."

    const/16 v9, 0xc

    if-eq v4, v9, :cond_0

    .line 613
    new-instance v9, Ljava/lang/StringBuilder;

    .line 616
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 618
    aget-object v8, v0, v4

    .line 621
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 628
    invoke-interface {v7, v8, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-eq v0, v9, :cond_1

    .line 636
    new-instance v4, Ljava/lang/StringBuilder;

    .line 639
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 641
    aget-object v10, v1, v0

    .line 644
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 651
    invoke-interface {v7, v4, v5}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    new-array v0, v9, [Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 658
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v1, v0, v3

    .line 662
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 667
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v3, 0x2

    aput-object v1, v0, v3

    .line 672
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 677
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v4, 0x4

    aput-object v1, v0, v4

    .line 682
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v10, 0x5

    aput-object v1, v0, v10

    .line 687
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v11, 0x6

    aput-object v1, v0, v11

    .line 692
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v12, 0x7

    aput-object v1, v0, v12

    .line 697
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/16 v13, 0x8

    aput-object v1, v0, v13

    .line 703
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/16 v14, 0x9

    aput-object v1, v0, v14

    .line 709
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/16 v15, 0xa

    aput-object v1, v0, v15

    .line 715
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/16 v16, 0xb

    aput-object v1, v0, v16

    const/4 v1, 0x0

    const/16 v17, 0x0

    :goto_2
    const-string v15, "Alg.Alias.Signature.OID."

    if-eq v1, v9, :cond_2

    .line 730
    new-instance v14, Ljava/lang/StringBuilder;

    .line 733
    invoke-direct {v14, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 737
    aget-object v13, v0, v1

    .line 0
    invoke-static {v2, v15, v14, v13, v7}, Ll/ᩴۖܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v13

    aget-object v14, v0, v1

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v7, v13, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    const/16 v13, 0x8

    const/16 v14, 0x9

    goto :goto_2

    :cond_2
    const/4 v0, 0x1

    const/4 v1, 0x2

    new-array v2, v9, [Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v13, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_128s_with_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v13, v2, v17

    sget-object v13, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_128f_with_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v13, v2, v0

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_128s_with_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v0, v2, v1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_128f_with_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v0, v2, v3

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_192s_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v0, v2, v4

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_192f_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v0, v2, v10

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_192s_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v0, v2, v11

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_192f_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v0, v2, v12

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_256s_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/16 v1, 0x8

    aput-object v0, v2, v1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_256f_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/16 v1, 0x9

    aput-object v0, v2, v1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_256s_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/16 v1, 0xa

    aput-object v0, v2, v1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_256f_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v0, v2, v16

    const/4 v0, 0x0

    :goto_3
    if-eq v0, v9, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v3, v2, v0

    invoke-static {v5, v15, v1, v3, v7}, Ll/ᩴۖܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v3, v2, v0

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1, v5}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    return-void
.end method
