.class public Lorg/bouncycastle/pqc/jcajce/provider/Snova$Mappings;
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
    .locals 71

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const-string v0, "KeyFactory.Snova"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi"

    .line 0
    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_4_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_4_SSK;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_4_SSK;-><init>()V

    const-string v2, "SNOVA_24_5_4_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_24_5_4_SSK"

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v4, v8

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v9, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_4_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_4_ESK;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_4_ESK;-><init>()V

    const-string v2, "SNOVA_24_5_4_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_24_5_4_ESK"

    move-object v4, v9

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_4_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_4_SHAKE_SSK;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_4_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_24_5_4_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_24_5_4_SHAKE_SSK"

    move-object v4, v10

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v11, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_4_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_4_SHAKE_ESK;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_4_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_24_5_4_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_24_5_4_SHAKE_ESK"

    move-object v4, v11

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v12, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_5_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_5_SSK;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_5_SSK;-><init>()V

    const-string v2, "SNOVA_24_5_5_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_24_5_5_SSK"

    move-object v4, v12

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v13, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_5_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_5_ESK;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_5_ESK;-><init>()V

    const-string v2, "SNOVA_24_5_5_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_24_5_5_ESK"

    move-object v4, v13

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v14, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_5_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_5_SHAKE_SSK;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_5_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_24_5_5_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_24_5_5_SHAKE_SSK"

    move-object v4, v14

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_5_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_5_SHAKE_ESK;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_5_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_24_5_5_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_24_5_5_SHAKE_ESK"

    move-object v4, v15

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_25_8_3_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_25_8_3_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_25_8_3_SSK;-><init>()V

    const-string v2, "SNOVA_25_8_3_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_25_8_3_SSK"

    move-object v4, v5

    move-object/from16 v17, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_25_8_3_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_25_8_3_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_25_8_3_ESK;-><init>()V

    const-string v2, "SNOVA_25_8_3_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_25_8_3_ESK"

    move-object v4, v5

    move-object/from16 v18, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_25_8_3_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_25_8_3_SHAKE_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_25_8_3_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_25_8_3_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_25_8_3_SHAKE_SSK"

    move-object v4, v5

    move-object/from16 v19, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_25_8_3_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_25_8_3_SHAKE_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_25_8_3_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_25_8_3_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_25_8_3_SHAKE_ESK"

    move-object v4, v5

    move-object/from16 v20, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_29_6_5_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_29_6_5_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_29_6_5_SSK;-><init>()V

    const-string v2, "SNOVA_29_6_5_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_29_6_5_SSK"

    move-object v4, v5

    move-object/from16 v21, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_29_6_5_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_29_6_5_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_29_6_5_ESK;-><init>()V

    const-string v2, "SNOVA_29_6_5_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_29_6_5_ESK"

    move-object v4, v5

    move-object/from16 v22, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_29_6_5_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_29_6_5_SHAKE_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_29_6_5_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_29_6_5_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_29_6_5_SHAKE_SSK"

    move-object v4, v5

    move-object/from16 v23, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_29_6_5_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_29_6_5_SHAKE_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_29_6_5_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_29_6_5_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_29_6_5_SHAKE_ESK"

    move-object v4, v5

    move-object/from16 v24, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_8_4_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_8_4_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_8_4_SSK;-><init>()V

    const-string v2, "SNOVA_37_8_4_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_37_8_4_SSK"

    move-object v4, v5

    move-object/from16 v25, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_8_4_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_8_4_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_8_4_ESK;-><init>()V

    const-string v2, "SNOVA_37_8_4_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_37_8_4_ESK"

    move-object v4, v5

    move-object/from16 v26, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_8_4_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_8_4_SHAKE_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_8_4_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_37_8_4_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_37_8_4_SHAKE_SSK"

    move-object v4, v5

    move-object/from16 v27, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_8_4_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_8_4_SHAKE_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_8_4_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_37_8_4_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_37_8_4_SHAKE_ESK"

    move-object v4, v5

    move-object/from16 v28, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_17_2_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_17_2_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_17_2_SSK;-><init>()V

    const-string v2, "SNOVA_37_17_2_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_37_17_2_SSK"

    move-object v4, v5

    move-object/from16 v29, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_17_2_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_17_2_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_17_2_ESK;-><init>()V

    const-string v2, "SNOVA_37_17_2_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_37_17_2_ESK"

    move-object v4, v5

    move-object/from16 v30, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_17_2_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_17_2_SHAKE_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_17_2_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_37_17_2_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_37_17_2_SHAKE_SSK"

    move-object v4, v5

    move-object/from16 v31, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_17_2_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_17_2_SHAKE_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_37_17_2_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_37_17_2_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_37_17_2_SHAKE_ESK"

    move-object v4, v5

    move-object/from16 v32, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_49_11_3_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_49_11_3_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_49_11_3_SSK;-><init>()V

    const-string v2, "SNOVA_49_11_3_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_49_11_3_SSK"

    move-object v4, v5

    move-object/from16 v33, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_49_11_3_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_49_11_3_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_49_11_3_ESK;-><init>()V

    const-string v2, "SNOVA_49_11_3_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_49_11_3_ESK"

    move-object v4, v5

    move-object/from16 v34, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_49_11_3_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_49_11_3_SHAKE_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_49_11_3_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_49_11_3_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_49_11_3_SHAKE_SSK"

    move-object v4, v5

    move-object/from16 v35, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_49_11_3_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_49_11_3_SHAKE_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_49_11_3_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_49_11_3_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_49_11_3_SHAKE_ESK"

    move-object v4, v5

    move-object/from16 v36, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_56_25_2_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_56_25_2_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_56_25_2_SSK;-><init>()V

    const-string v2, "SNOVA_56_25_2_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_56_25_2_SSK"

    move-object v4, v5

    move-object/from16 v37, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_56_25_2_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_56_25_2_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_56_25_2_ESK;-><init>()V

    const-string v2, "SNOVA_56_25_2_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_56_25_2_ESK"

    move-object v4, v5

    move-object/from16 v38, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_56_25_2_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_56_25_2_SHAKE_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_56_25_2_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_56_25_2_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_56_25_2_SHAKE_SSK"

    move-object v4, v5

    move-object/from16 v39, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_56_25_2_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_56_25_2_SHAKE_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_56_25_2_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_56_25_2_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_56_25_2_SHAKE_ESK"

    move-object v4, v5

    move-object/from16 v40, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_60_10_4_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_60_10_4_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_60_10_4_SSK;-><init>()V

    const-string v2, "SNOVA_60_10_4_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_60_10_4_SSK"

    move-object v4, v5

    move-object/from16 v41, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_60_10_4_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_60_10_4_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_60_10_4_ESK;-><init>()V

    const-string v2, "SNOVA_60_10_4_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_60_10_4_ESK"

    move-object v4, v5

    move-object/from16 v42, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_60_10_4_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_60_10_4_SHAKE_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_60_10_4_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_60_10_4_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_60_10_4_SHAKE_SSK"

    move-object v4, v5

    move-object/from16 v43, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_60_10_4_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_60_10_4_SHAKE_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_60_10_4_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_60_10_4_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_60_10_4_SHAKE_ESK"

    move-object v4, v5

    move-object/from16 v44, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_66_15_3_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_66_15_3_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_66_15_3_SSK;-><init>()V

    const-string v2, "SNOVA_66_15_3_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_66_15_3_SSK"

    move-object v4, v5

    move-object/from16 v45, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_66_15_3_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_66_15_3_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_66_15_3_ESK;-><init>()V

    const-string v2, "SNOVA_66_15_3_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_66_15_3_ESK"

    move-object v4, v5

    move-object/from16 v46, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_66_15_3_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_66_15_3_SHAKE_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_66_15_3_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_66_15_3_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_66_15_3_SHAKE_SSK"

    move-object v4, v5

    move-object/from16 v47, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_66_15_3_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_66_15_3_SHAKE_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_66_15_3_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_66_15_3_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_66_15_3_SHAKE_ESK"

    move-object v4, v5

    move-object/from16 v48, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_75_33_2_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_75_33_2_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_75_33_2_SSK;-><init>()V

    const-string v2, "SNOVA_75_33_2_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_75_33_2_SSK"

    move-object v4, v5

    move-object/from16 v49, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_75_33_2_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_75_33_2_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_75_33_2_ESK;-><init>()V

    const-string v2, "SNOVA_75_33_2_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_75_33_2_ESK"

    move-object v4, v5

    move-object/from16 v50, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_75_33_2_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_75_33_2_SHAKE_SSK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_75_33_2_SHAKE_SSK;-><init>()V

    const-string v2, "SNOVA_75_33_2_SHAKE_SSK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_75_33_2_SHAKE_SSK"

    move-object v4, v5

    move-object/from16 v51, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_75_33_2_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v16, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_75_33_2_SHAKE_ESK;

    invoke-direct/range {v16 .. v16}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_75_33_2_SHAKE_ESK;-><init>()V

    const-string v2, "SNOVA_75_33_2_SHAKE_ESK"

    const-string v3, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi$SNOVA_75_33_2_SHAKE_ESK"

    move-object v4, v5

    move-object/from16 v52, v5

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyFactoryAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    const-string v0, "KeyPairGenerator.Snova"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi"

    invoke-interface {v7, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_24_5_4_SSK"

    const-string v1, "SNOVA_24_5_4_SSK"

    invoke-virtual {v6, v7, v1, v0, v8}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_24_5_4_ESK"

    const-string v2, "SNOVA_24_5_4_ESK"

    invoke-virtual {v6, v7, v2, v0, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_24_5_4_SHAKE_SSK"

    const-string v3, "SNOVA_24_5_4_SHAKE_SSK"

    invoke-virtual {v6, v7, v3, v0, v10}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_24_5_4_SHAKE_ESK"

    const-string v4, "SNOVA_24_5_4_SHAKE_ESK"

    invoke-virtual {v6, v7, v4, v0, v11}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_24_5_5_SSK"

    const-string v5, "SNOVA_24_5_5_SSK"

    invoke-virtual {v6, v7, v5, v0, v12}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_24_5_5_ESK"

    move-object/from16 v16, v5

    const-string v5, "SNOVA_24_5_5_ESK"

    invoke-virtual {v6, v7, v5, v0, v13}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_24_5_5_SHAKE_SSK"

    move-object/from16 v53, v5

    const-string v5, "SNOVA_24_5_5_SHAKE_SSK"

    invoke-virtual {v6, v7, v5, v0, v14}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_24_5_5_SHAKE_ESK"

    move-object/from16 v54, v5

    const-string v5, "SNOVA_24_5_5_SHAKE_ESK"

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_25_8_3_SSK"

    move-object/from16 v55, v5

    const-string v5, "SNOVA_25_8_3_SSK"

    move-object/from16 v56, v15

    move-object/from16 v15, v17

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_25_8_3_ESK"

    move-object/from16 v17, v5

    const-string v5, "SNOVA_25_8_3_ESK"

    move-object/from16 v57, v15

    move-object/from16 v15, v18

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_25_8_3_SHAKE_SSK"

    move-object/from16 v18, v5

    const-string v5, "SNOVA_25_8_3_SHAKE_SSK"

    move-object/from16 v58, v15

    move-object/from16 v15, v19

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_25_8_3_SHAKE_ESK"

    move-object/from16 v19, v5

    const-string v5, "SNOVA_25_8_3_SHAKE_ESK"

    move-object/from16 v59, v15

    move-object/from16 v15, v20

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_29_6_5_SSK"

    move-object/from16 v20, v5

    const-string v5, "SNOVA_29_6_5_SSK"

    move-object/from16 v60, v15

    move-object/from16 v15, v21

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_29_6_5_ESK"

    move-object/from16 v21, v5

    const-string v5, "SNOVA_29_6_5_ESK"

    move-object/from16 v61, v15

    move-object/from16 v15, v22

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_29_6_5_SHAKE_SSK"

    move-object/from16 v22, v5

    const-string v5, "SNOVA_29_6_5_SHAKE_SSK"

    move-object/from16 v62, v15

    move-object/from16 v15, v23

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_29_6_5_SHAKE_ESK"

    move-object/from16 v23, v5

    const-string v5, "SNOVA_29_6_5_SHAKE_ESK"

    move-object/from16 v63, v15

    move-object/from16 v15, v24

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_37_8_4_SSK"

    move-object/from16 v24, v5

    const-string v5, "SNOVA_37_8_4_SSK"

    move-object/from16 v64, v15

    move-object/from16 v15, v25

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_37_8_4_ESK"

    move-object/from16 v25, v5

    const-string v5, "SNOVA_37_8_4_ESK"

    move-object/from16 v65, v15

    move-object/from16 v15, v26

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_37_8_4_SHAKE_SSK"

    move-object/from16 v26, v5

    const-string v5, "SNOVA_37_8_4_SHAKE_SSK"

    move-object/from16 v66, v15

    move-object/from16 v15, v27

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_37_8_4_SHAKE_ESK"

    move-object/from16 v27, v5

    const-string v5, "SNOVA_37_8_4_SHAKE_ESK"

    move-object/from16 v67, v15

    move-object/from16 v15, v28

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_37_17_2_SSK"

    move-object/from16 v28, v5

    const-string v5, "SNOVA_37_17_2_SSK"

    move-object/from16 v68, v15

    move-object/from16 v15, v29

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_37_17_2_ESK"

    move-object/from16 v29, v5

    const-string v5, "SNOVA_37_17_2_ESK"

    move-object/from16 v69, v15

    move-object/from16 v15, v30

    invoke-virtual {v6, v7, v5, v0, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_37_17_2_SHAKE_SSK"

    move-object/from16 v30, v5

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_37_17_2_SHAKE_SSK"

    move-object/from16 v70, v15

    move-object/from16 v15, v31

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_37_17_2_SHAKE_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_37_17_2_SHAKE_ESK"

    move-object/from16 v15, v32

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_49_11_3_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_49_11_3_SSK"

    move-object/from16 v15, v33

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_49_11_3_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_49_11_3_ESK"

    move-object/from16 v15, v34

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_49_11_3_SHAKE_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_49_11_3_SHAKE_SSK"

    move-object/from16 v15, v35

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_49_11_3_SHAKE_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_49_11_3_SHAKE_ESK"

    move-object/from16 v15, v36

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_56_25_2_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_56_25_2_SSK"

    move-object/from16 v15, v37

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_56_25_2_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_56_25_2_ESK"

    move-object/from16 v15, v38

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_56_25_2_SHAKE_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_56_25_2_SHAKE_SSK"

    move-object/from16 v15, v39

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_56_25_2_SHAKE_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_56_25_2_SHAKE_ESK"

    move-object/from16 v15, v40

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_60_10_4_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_60_10_4_SSK"

    move-object/from16 v15, v41

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_60_10_4_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_60_10_4_ESK"

    move-object/from16 v15, v42

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_60_10_4_SHAKE_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_60_10_4_SHAKE_SSK"

    move-object/from16 v15, v43

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_60_10_4_SHAKE_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_60_10_4_SHAKE_ESK"

    move-object/from16 v15, v44

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_66_15_3_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_66_15_3_SSK"

    move-object/from16 v15, v45

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_66_15_3_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_66_15_3_ESK"

    move-object/from16 v15, v46

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_66_15_3_SHAKE_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_66_15_3_SHAKE_SSK"

    move-object/from16 v15, v47

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_66_15_3_SHAKE_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_66_15_3_SHAKE_ESK"

    move-object/from16 v15, v48

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_75_33_2_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_75_33_2_SSK"

    move-object/from16 v15, v49

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_75_33_2_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_75_33_2_ESK"

    move-object/from16 v15, v50

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_75_33_2_SHAKE_SSK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_75_33_2_SHAKE_SSK"

    move-object/from16 v15, v51

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_75_33_2_SHAKE_ESK"

    const-string v5, "org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyPairGeneratorSpi$SNOVA_75_33_2_SHAKE_ESK"

    move-object/from16 v15, v52

    invoke-virtual {v6, v7, v0, v5, v15}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addKeyPairGeneratorAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$Base"

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v15, "Snova"

    invoke-virtual {v6, v7, v15, v0, v5}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_24_5_4_SSK"

    invoke-virtual {v6, v7, v1, v0, v8}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_24_5_4_ESK"

    invoke-virtual {v6, v7, v2, v0, v9}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_24_5_4_SHAKE_SSK"

    invoke-virtual {v6, v7, v3, v0, v10}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_24_5_4_SHAKE_ESK"

    invoke-virtual {v6, v7, v4, v0, v11}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_24_5_5_SSK"

    move-object/from16 v1, v16

    invoke-virtual {v6, v7, v1, v0, v12}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_24_5_5_ESK"

    move-object/from16 v1, v53

    invoke-virtual {v6, v7, v1, v0, v13}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_24_5_5_SHAKE_SSK"

    move-object/from16 v1, v54

    invoke-virtual {v6, v7, v1, v0, v14}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_24_5_5_SHAKE_ESK"

    move-object/from16 v2, v55

    move-object/from16 v1, v56

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_25_8_3_SSK"

    move-object/from16 v2, v17

    move-object/from16 v1, v57

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_25_8_3_ESK"

    move-object/from16 v2, v18

    move-object/from16 v1, v58

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_25_8_3_SHAKE_SSK"

    move-object/from16 v2, v19

    move-object/from16 v1, v59

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_25_8_3_SHAKE_ESK"

    move-object/from16 v2, v20

    move-object/from16 v1, v60

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_29_6_5_SSK"

    move-object/from16 v2, v21

    move-object/from16 v1, v61

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_29_6_5_ESK"

    move-object/from16 v2, v22

    move-object/from16 v1, v62

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_29_6_5_SHAKE_SSK"

    move-object/from16 v2, v23

    move-object/from16 v1, v63

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_29_6_5_SHAKE_ESK"

    move-object/from16 v2, v24

    move-object/from16 v1, v64

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_37_8_4_SSK"

    move-object/from16 v2, v25

    move-object/from16 v1, v65

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_37_8_4_ESK"

    move-object/from16 v2, v26

    move-object/from16 v1, v66

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_37_8_4_SHAKE_SSK"

    move-object/from16 v2, v27

    move-object/from16 v1, v67

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_37_8_4_SHAKE_ESK"

    move-object/from16 v2, v28

    move-object/from16 v1, v68

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_37_17_2_SSK"

    move-object/from16 v2, v29

    move-object/from16 v1, v69

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_37_17_2_ESK"

    move-object/from16 v2, v30

    move-object/from16 v1, v70

    invoke-virtual {v6, v7, v2, v0, v1}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_37_17_2_SHAKE_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_37_17_2_SHAKE_SSK"

    move-object/from16 v2, v31

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_37_17_2_SHAKE_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_37_17_2_SHAKE_ESK"

    move-object/from16 v2, v32

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_49_11_3_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_49_11_3_SSK"

    move-object/from16 v2, v33

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_49_11_3_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_49_11_3_ESK"

    move-object/from16 v2, v34

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_49_11_3_SHAKE_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_49_11_3_SHAKE_SSK"

    move-object/from16 v2, v35

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_49_11_3_SHAKE_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_49_11_3_SHAKE_ESK"

    move-object/from16 v2, v36

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_56_25_2_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_56_25_2_SSK"

    move-object/from16 v2, v37

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_56_25_2_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_56_25_2_ESK"

    move-object/from16 v2, v38

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_56_25_2_SHAKE_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_56_25_2_SHAKE_SSK"

    move-object/from16 v2, v39

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_56_25_2_SHAKE_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_56_25_2_SHAKE_ESK"

    move-object/from16 v2, v40

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_60_10_4_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_60_10_4_SSK"

    move-object/from16 v2, v41

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_60_10_4_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_60_10_4_ESK"

    move-object/from16 v2, v42

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_60_10_4_SHAKE_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_60_10_4_SHAKE_SSK"

    move-object/from16 v2, v43

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_60_10_4_SHAKE_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_60_10_4_SHAKE_ESK"

    move-object/from16 v2, v44

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_66_15_3_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_66_15_3_SSK"

    move-object/from16 v2, v45

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_66_15_3_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_66_15_3_ESK"

    move-object/from16 v2, v46

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_66_15_3_SHAKE_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_66_15_3_SHAKE_SSK"

    move-object/from16 v2, v47

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_66_15_3_SHAKE_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_66_15_3_SHAKE_ESK"

    move-object/from16 v2, v48

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_75_33_2_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_75_33_2_SSK"

    move-object/from16 v2, v49

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_75_33_2_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_75_33_2_ESK"

    move-object/from16 v2, v50

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_75_33_2_SHAKE_SSK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_75_33_2_SHAKE_SSK"

    move-object/from16 v2, v51

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v0, "SNOVA_75_33_2_SHAKE_ESK"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.snova.SignatureSpi$SNOVA_75_33_2_SHAKE_ESK"

    move-object/from16 v2, v52

    invoke-virtual {v6, v7, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addSignatureAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
