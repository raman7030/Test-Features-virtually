.class public Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;
.super Ljava/security/KeyPairGenerator;


# static fields
.field public static parameters:Ljava/util/Map;


# instance fields
.field public engine:Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;

.field public initialised:Z

.field public param:Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyGenerationParameters;

.field public random:Ljava/security/SecureRandom;

.field public snovaParameters:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;


# direct methods
.method public static constructor <clinit>()V
    .locals 46

    .line 0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v2, "SNOVA_24_5_4_SSK"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v2, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v3, "SNOVA_24_5_4_ESK"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v4, "SNOVA_24_5_4_SHAKE_SSK"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v4, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v5, "SNOVA_24_5_4_SHAKE_ESK"

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_5_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v6, "SNOVA_24_5_5_SSK"

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v6, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_5_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v7, "SNOVA_24_5_5_ESK"

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_5_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v8, "SNOVA_24_5_5_SHAKE_SSK"

    invoke-interface {v0, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v8, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_5_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v9, "SNOVA_24_5_5_SHAKE_ESK"

    invoke-interface {v0, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_25_8_3_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v10, "SNOVA_25_8_3_SSK"

    invoke-interface {v0, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v10, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_25_8_3_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v11, "SNOVA_25_8_3_ESK"

    invoke-interface {v0, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_25_8_3_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v12, "SNOVA_25_8_3_SHAKE_SSK"

    invoke-interface {v0, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v12, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_25_8_3_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v13, "SNOVA_25_8_3_SHAKE_ESK"

    invoke-interface {v0, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_29_6_5_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v14, "SNOVA_29_6_5_SSK"

    invoke-interface {v0, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_29_6_5_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    const-string v15, "SNOVA_29_6_5_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_29_6_5_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v16, v14

    const-string v14, "SNOVA_29_6_5_SHAKE_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_29_6_5_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v17, v15

    const-string v15, "SNOVA_29_6_5_SHAKE_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_8_4_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v18, v14

    const-string v14, "SNOVA_37_8_4_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_8_4_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v19, v15

    const-string v15, "SNOVA_37_8_4_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_8_4_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v20, v14

    const-string v14, "SNOVA_37_8_4_SHAKE_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_8_4_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v21, v15

    const-string v15, "SNOVA_37_8_4_SHAKE_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_17_2_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v22, v14

    const-string v14, "SNOVA_37_17_2_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_17_2_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v23, v15

    const-string v15, "SNOVA_37_17_2_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_17_2_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v24, v14

    const-string v14, "SNOVA_37_17_2_SHAKE_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_17_2_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v25, v15

    const-string v15, "SNOVA_37_17_2_SHAKE_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_49_11_3_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v26, v14

    const-string v14, "SNOVA_49_11_3_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_49_11_3_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v27, v15

    const-string v15, "SNOVA_49_11_3_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_49_11_3_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v28, v14

    const-string v14, "SNOVA_49_11_3_SHAKE_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_49_11_3_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v29, v15

    const-string v15, "SNOVA_49_11_3_SHAKE_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_56_25_2_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v30, v14

    const-string v14, "SNOVA_56_25_2_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_56_25_2_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v31, v15

    const-string v15, "SNOVA_56_25_2_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_56_25_2_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v32, v14

    const-string v14, "SNOVA_56_25_2_SHAKE_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_56_25_2_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v33, v15

    const-string v15, "SNOVA_56_25_2_SHAKE_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_60_10_4_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v34, v14

    const-string v14, "SNOVA_60_10_4_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_60_10_4_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v35, v15

    const-string v15, "SNOVA_60_10_4_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_60_10_4_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v36, v14

    const-string v14, "SNOVA_60_10_4_SHAKE_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_60_10_4_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v37, v15

    const-string v15, "SNOVA_60_10_4_SHAKE_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_66_15_3_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v38, v14

    const-string v14, "SNOVA_66_15_3_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_66_15_3_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v39, v15

    const-string v15, "SNOVA_66_15_3_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_66_15_3_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v40, v14

    const-string v14, "SNOVA_66_15_3_SHAKE_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_66_15_3_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v41, v15

    const-string v15, "SNOVA_66_15_3_SHAKE_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_75_33_2_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v42, v14

    const-string v14, "SNOVA_75_33_2_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_75_33_2_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v43, v15

    const-string v15, "SNOVA_75_33_2_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_75_33_2_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v44, v14

    const-string v14, "SNOVA_75_33_2_SHAKE_SSK"

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_75_33_2_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v45, v15

    const-string v15, "SNOVA_75_33_2_SHAKE_ESK"

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_24_5_4_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v15}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_24_5_4_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_24_5_4_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_24_5_4_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_24_5_5_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_24_5_5_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_24_5_5_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_24_5_5_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_25_8_3_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_25_8_3_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_25_8_3_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_25_8_3_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_29_6_5_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_29_6_5_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_29_6_5_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v17

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_29_6_5_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_37_8_4_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_37_8_4_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_37_8_4_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v21

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_37_8_4_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v22

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_37_17_2_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v23

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_37_17_2_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v24

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_37_17_2_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v25

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_37_17_2_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v26

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_49_11_3_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v27

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_49_11_3_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v28

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_49_11_3_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v29

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_49_11_3_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v30

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_56_25_2_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v31

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_56_25_2_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v32

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_56_25_2_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v33

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_56_25_2_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v34

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_60_10_4_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v35

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_60_10_4_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v36

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_60_10_4_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v37

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_60_10_4_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v38

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_66_15_3_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v39

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_66_15_3_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v40

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_66_15_3_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v41

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_66_15_3_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v42

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_75_33_2_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v43

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_75_33_2_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v44

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_75_33_2_SHAKE_SSK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v45

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->SNOVA_75_33_2_SHAKE_ESK:Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "Snova"

    .line 0
    invoke-direct {p0, v0}, Ljava/security/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;

    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->random:Ljava/security/SecureRandom;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->initialised:Z

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;)V
    .locals 1

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;

    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->random:Ljava/security/SecureRandom;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->initialised:Z

    iput-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->snovaParameters:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    return-void
.end method

.method public static getNameFromParams(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/lang/String;
    .locals 1

    .line 0
    instance-of v0, p0, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/jcajce/spec/SnovaParameterSpec;->getName()Ljava/lang/String;

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
    iget-boolean v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->initialised:Z

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyGenerationParameters;

    iget-object v1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->random:Ljava/security/SecureRandom;

    sget-object v2, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;)V

    iput-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->param:Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyGenerationParameters;

    iget-object v1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->initialised:Z

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/pqc/crypto/snova/SnovaPublicKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaPrivateKeyParameters;

    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPublicKey;

    invoke-direct {v3, v1}, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPublicKey;-><init>(Lorg/bouncycastle/pqc/crypto/snova/SnovaPublicKeyParameters;)V

    new-instance v1, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPrivateKey;

    invoke-direct {v1, v0}, Lorg/bouncycastle/pqc/jcajce/provider/snova/BCSnovaPrivateKey;-><init>(Lorg/bouncycastle/pqc/crypto/snova/SnovaPrivateKeyParameters;)V

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

    invoke-static {p1}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->getNameFromParams(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyGenerationParameters;

    sget-object v1, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->parameters:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    invoke-direct {p1, p2, v0}, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;)V

    iput-object p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->param:Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyGenerationParameters;

    iget-object p2, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->engine:Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;

    invoke-virtual {p2, p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyPairGeneratorSpi;->initialised:Z

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
