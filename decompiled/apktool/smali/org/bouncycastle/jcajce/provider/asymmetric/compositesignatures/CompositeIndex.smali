.class public Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;
.super Ljava/lang/Object;


# static fields
.field public static algorithmNames:Ljava/util/Map;

.field public static kpgInitSpecs:Ljava/util/Map;

.field public static pairings:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 44

    .line 0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_RSA2048_PSS_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "ML-DSA-44"

    const-string v3, "RSASSA-PSS"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v4, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_RSA2048_PKCS15_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "sha256WithRSAEncryption"

    filled-new-array {v2, v5}, [Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v6, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_Ed25519_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v7, "Ed25519"

    filled-new-array {v2, v7}, [Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v8, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_ECDSA_P256_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v9, "SHA256withECDSA"

    filled-new-array {v2, v9}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v2, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA3072_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v10, "ML-DSA-65"

    filled-new-array {v10, v3}, [Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v11, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA3072_PKCS15_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    filled-new-array {v10, v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v11, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA4096_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    filled-new-array {v10, v3}, [Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v5, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v12, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA4096_PKCS15_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v13, "sha384WithRSAEncryption"

    filled-new-array {v10, v13}, [Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v13, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_ECDSA_P256_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    filled-new-array {v10, v9}, [Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_ECDSA_P384_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v15, "SHA384withECDSA"

    move-object/from16 v16, v13

    filled-new-array {v10, v15}, [Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v13, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_ECDSA_brainpoolP256r1_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    filled-new-array {v10, v9}, [Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v9, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_Ed25519_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    filled-new-array {v10, v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v7, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_ECDSA_P384_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v10, "ML-DSA-87"

    move-object/from16 v17, v9

    filled-new-array {v10, v15}, [Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v9, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_ECDSA_brainpoolP384r1_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    filled-new-array {v10, v15}, [Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v9, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_Ed448_SHAKE256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v18, v9

    const-string v9, "Ed448"

    filled-new-array {v10, v9}, [Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v15, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v9, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_RSA3072_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v19, v15

    filled-new-array {v10, v3}, [Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v9, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_RSA4096_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    filled-new-array {v10, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v15, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    sget-object v3, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_ECDSA_P521_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v20, v9

    const-string v9, "SHA512withECDSA"

    filled-new-array {v10, v9}, [Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v9, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA44_RSA2048_PSS_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v10, Ljava/security/spec/RSAKeyGenParameterSpec;

    move-object/from16 v21, v3

    sget-object v3, Ljava/security/spec/RSAKeyGenParameterSpec;->F4:Ljava/math/BigInteger;

    move-object/from16 v22, v15

    const/16 v15, 0x800

    invoke-direct {v10, v15, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    const/4 v15, 0x2

    move-object/from16 v23, v7

    new-array v7, v15, [Ljava/security/spec/AlgorithmParameterSpec;

    const/16 v24, 0x0

    const/16 v25, 0x0

    aput-object v25, v7, v24

    const/16 v26, 0x1

    aput-object v10, v7, v26

    invoke-interface {v0, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v7, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA44_RSA2048_PKCS15_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v10, Ljava/security/spec/RSAKeyGenParameterSpec;

    move-object/from16 v27, v9

    const/16 v9, 0x800

    invoke-direct {v10, v9, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v9, v15, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v9, v24

    aput-object v10, v9, v26

    invoke-interface {v0, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v9, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA44_Ed25519_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v10, v15, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v10, v24

    aput-object v25, v10, v26

    invoke-interface {v0, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v10, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA44_ECDSA_P256_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v15, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    move-object/from16 v28, v9

    const-string v9, "P-256"

    invoke-direct {v15, v9}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    move-object/from16 v29, v7

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v7, v24

    aput-object v15, v7, v26

    invoke-interface {v0, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v7, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA65_RSA3072_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v15, Ljava/security/spec/RSAKeyGenParameterSpec;

    move-object/from16 v30, v10

    const/16 v10, 0xc00

    invoke-direct {v15, v10, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    const/4 v10, 0x2

    move-object/from16 v31, v13

    new-array v13, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v13, v24

    aput-object v15, v13, v26

    invoke-interface {v0, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v13, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA65_RSA3072_PKCS15_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v15, Ljava/security/spec/RSAKeyGenParameterSpec;

    move-object/from16 v32, v7

    const/16 v7, 0xc00

    invoke-direct {v15, v7, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v7, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v7, v24

    aput-object v15, v7, v26

    invoke-interface {v0, v13, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v7, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA65_RSA4096_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v15, Ljava/security/spec/RSAKeyGenParameterSpec;

    move-object/from16 v33, v13

    const/16 v13, 0x1000

    invoke-direct {v15, v13, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v13, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v13, v24

    aput-object v15, v13, v26

    invoke-interface {v0, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v13, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA65_RSA4096_PKCS15_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v15, Ljava/security/spec/RSAKeyGenParameterSpec;

    move-object/from16 v34, v7

    const/16 v7, 0x1000

    invoke-direct {v15, v7, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v7, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v7, v24

    aput-object v15, v7, v26

    invoke-interface {v0, v13, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v7, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA65_ECDSA_P384_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v15, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    move-object/from16 v35, v13

    const-string v13, "P-384"

    invoke-direct {v15, v13}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    new-array v10, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v10, v24

    aput-object v15, v10, v26

    invoke-interface {v0, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v10, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA65_ECDSA_brainpoolP256r1_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v15, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    move-object/from16 v36, v7

    const-string v7, "brainpoolP256r1"

    invoke-direct {v15, v7}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    move-object/from16 v37, v7

    const/4 v7, 0x2

    move-object/from16 v38, v14

    new-array v14, v7, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v14, v24

    aput-object v15, v14, v26

    invoke-interface {v0, v10, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA65_Ed25519_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v15, v7, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v25, v15, v26

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v15, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA87_ECDSA_P384_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v39, v14

    new-instance v14, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    invoke-direct {v14, v13}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    new-array v7, v7, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v7, v24

    aput-object v14, v7, v26

    invoke-interface {v0, v15, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v7, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA87_ECDSA_brainpoolP384r1_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v14, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    move-object/from16 v40, v15

    const-string v15, "brainpoolP384r1"

    invoke-direct {v14, v15}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    move-object/from16 v41, v10

    const/4 v10, 0x2

    move-object/from16 v42, v15

    new-array v15, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v14, v15, v26

    invoke-interface {v0, v7, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_HashMLDSA87_Ed448_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v15, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v25, v15, v26

    invoke-interface {v0, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v15, Ljava/security/spec/RSAKeyGenParameterSpec;

    move-object/from16 v43, v14

    const/16 v14, 0x800

    invoke-direct {v15, v14, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v14, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v14, v24

    aput-object v15, v14, v26

    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v14, Ljava/security/spec/RSAKeyGenParameterSpec;

    const/16 v15, 0x800

    invoke-direct {v14, v15, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v15, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v14, v15, v26

    invoke-interface {v0, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-array v14, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v14, v24

    aput-object v25, v14, v26

    invoke-interface {v0, v6, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v14, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    invoke-direct {v14, v9}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    new-array v15, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v14, v15, v26

    invoke-interface {v0, v8, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v14, Ljava/security/spec/RSAKeyGenParameterSpec;

    const/16 v15, 0xc00

    invoke-direct {v14, v15, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v15, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v14, v15, v26

    invoke-interface {v0, v2, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v14, Ljava/security/spec/RSAKeyGenParameterSpec;

    const/16 v15, 0xc00

    invoke-direct {v14, v15, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v15, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v14, v15, v26

    invoke-interface {v0, v11, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v14, Ljava/security/spec/RSAKeyGenParameterSpec;

    const/16 v15, 0x1000

    invoke-direct {v14, v15, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v15, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v14, v15, v26

    invoke-interface {v0, v5, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v14, Ljava/security/spec/RSAKeyGenParameterSpec;

    const/16 v15, 0x1000

    invoke-direct {v14, v15, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    new-array v15, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v14, v15, v26

    invoke-interface {v0, v12, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v14, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    invoke-direct {v14, v9}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    new-array v9, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v9, v24

    aput-object v14, v9, v26

    move-object/from16 v14, v16

    invoke-interface {v0, v14, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v9, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    invoke-direct {v9, v13}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    new-array v15, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v15, v24

    aput-object v9, v15, v26

    move-object/from16 v9, v38

    invoke-interface {v0, v9, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v15, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    move-object/from16 v9, v37

    invoke-direct {v15, v9}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    new-array v9, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v9, v24

    aput-object v15, v9, v26

    move-object/from16 v15, v31

    invoke-interface {v0, v15, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-array v9, v10, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v9, v24

    aput-object v25, v9, v26

    move-object/from16 v10, v17

    invoke-interface {v0, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v9, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    invoke-direct {v9, v13}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    const/4 v13, 0x2

    new-array v13, v13, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v13, v24

    aput-object v9, v13, v26

    move-object/from16 v9, v23

    invoke-interface {v0, v9, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v13, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    move-object/from16 v9, v42

    invoke-direct {v13, v9}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v9, v24

    aput-object v13, v9, v26

    move-object/from16 v13, v18

    invoke-interface {v0, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v9, v24

    aput-object v25, v9, v26

    move-object/from16 v13, v19

    invoke-interface {v0, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v9, Ljava/security/spec/RSAKeyGenParameterSpec;

    const/16 v13, 0x1000

    invoke-direct {v9, v13, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    const/4 v13, 0x2

    new-array v13, v13, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v13, v24

    aput-object v9, v13, v26

    move-object/from16 v9, v22

    invoke-interface {v0, v9, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v13, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;

    const-string v9, "P-521"

    invoke-direct {v13, v9}, Lorg/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v9, v24

    aput-object v13, v9, v26

    move-object/from16 v13, v21

    invoke-interface {v0, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    new-instance v9, Ljava/security/spec/RSAKeyGenParameterSpec;

    const/16 v13, 0xc00

    invoke-direct {v9, v13, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/security/spec/AlgorithmParameterSpec;

    aput-object v25, v3, v24

    aput-object v9, v3, v26

    move-object/from16 v9, v20

    invoke-interface {v0, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA44-RSA2048-PSS-SHA256"

    move-object/from16 v13, v27

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA44-RSA2048-PKCS15-SHA256"

    move-object/from16 v13, v29

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA44-Ed25519-SHA512"

    move-object/from16 v13, v28

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA44-ECDSA-P256-SHA256"

    move-object/from16 v13, v30

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA65-RSA3072-PSS-SHA512"

    move-object/from16 v13, v32

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA65-RSA3072-PKCS15-SHA512"

    move-object/from16 v13, v33

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA65-RSA4096-PSS-SHA512"

    move-object/from16 v13, v34

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA65-RSA4096-PKCS15-SHA512"

    move-object/from16 v13, v35

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA65-ECDSA-P384-SHA512"

    move-object/from16 v13, v36

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA65-ECDSA-brainpoolP256r1-SHA512"

    move-object/from16 v13, v41

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA65-Ed25519-SHA512"

    move-object/from16 v13, v39

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA87-ECDSA-P384-SHA512"

    move-object/from16 v13, v40

    invoke-interface {v0, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA87-ECDSA-brainpoolP384r1-SHA512"

    invoke-interface {v0, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "HashMLDSA87-Ed448-SHA512"

    move-object/from16 v7, v43

    invoke-interface {v0, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v3, "MLDSA44-RSA2048-PSS-SHA256"

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA44-RSA2048-PKCS15-SHA256"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA44-Ed25519-SHA512"

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA44-ECDSA-P256-SHA256"

    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA65-RSA3072-PSS-SHA512"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA65-RSA3072-PKCS15-SHA512"

    invoke-interface {v0, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA65-RSA4096-PSS-SHA512"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA65-RSA4096-PKCS15-SHA512"

    invoke-interface {v0, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA65-ECDSA-P256-SHA512"

    invoke-interface {v0, v14, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA65-ECDSA-P384-SHA512"

    move-object/from16 v2, v38

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA65-ECDSA-brainpoolP256r1-SHA512"

    invoke-interface {v0, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA65-Ed25519-SHA512"

    invoke-interface {v0, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA87-ECDSA-P384-SHA512"

    move-object/from16 v2, v23

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA87-ECDSA-brainpoolP384r1-SHA512"

    move-object/from16 v2, v18

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA87-Ed448-SHAKE256"

    move-object/from16 v2, v19

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA87-RSA4096-PSS-SHA512"

    move-object/from16 v2, v22

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA87-ECDSA-P521-SHA512"

    move-object/from16 v2, v21

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    const-string v1, "MLDSA87-RSA3072-PSS-SHA512"

    invoke-interface {v0, v9, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAlgorithmName(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static getBaseName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "RSA"

    .line 0
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ECDSA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    const-string p0, "EC"

    :cond_1
    return-object p0
.end method

.method public static getDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->algorithmNames:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const-string v0, "SHA256"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Lorg/bouncycastle/crypto/digests/SHA256Digest;

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/SHA256Digest;-><init>()V

    return-object p0

    :cond_0
    const-string v0, "SHA384"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Lorg/bouncycastle/crypto/digests/SHA384Digest;

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/SHA384Digest;-><init>()V

    return-object p0

    :cond_1
    const-string v0, "SHA512"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    new-instance p0, Lorg/bouncycastle/crypto/digests/SHA512Digest;

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/SHA512Digest;-><init>()V

    return-object p0

    :cond_2
    new-instance p0, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v0, 0x100

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    return-object p0
.end method

.method public static getKeyPairSpecs(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)[Ljava/security/spec/AlgorithmParameterSpec;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->kpgInitSpecs:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/security/spec/AlgorithmParameterSpec;

    return-object p0
.end method

.method public static getPairing(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)[Ljava/lang/String;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static getSupportedIdentifiers()Ljava/util/Set;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static isAlgorithmSupported(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Z
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->pairings:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
