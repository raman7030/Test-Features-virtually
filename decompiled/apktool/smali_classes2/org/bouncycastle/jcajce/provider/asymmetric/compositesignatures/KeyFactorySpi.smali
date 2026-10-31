.class public Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseKeyFactorySpi;

# interfaces
.implements Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;


# static fields
.field public static componentKeySizes:Ljava/util/Map;

.field public static final ecDsaBrainpoolP256r1:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final ecDsaBrainpoolP384r1:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final ecDsaP256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final ecDsaP384:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final ecDsaP521:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final ed25519:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final ed448:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final falcon512Identifier:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final mlDsa44:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final mlDsa65:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final mlDsa87:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static pairings:Ljava/util/Map;

.field public static final rsa:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;


# instance fields
.field public helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;


# direct methods
.method public static constructor <clinit>()V
    .locals 25

    .line 0
    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_44:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->mlDsa44:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v1, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_65:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v1, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->mlDsa65:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v2, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v3, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_87:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v2, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->mlDsa87:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v3, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->falcon_512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v3, v4}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v3, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->falcon512Identifier:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v3, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/bouncycastle/internal/asn1/edec/EdECObjectIdentifiers;->id_Ed25519:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v3, v4}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v3, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->ed25519:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v4, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v5, Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;->id_ecPublicKey:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v6, Lorg/bouncycastle/asn1/x9/X962Parameters;

    sget-object v7, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->secp256r1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v6, v7}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-direct {v4, v5, v6}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    sput-object v4, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->ecDsaP256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v6, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v7, Lorg/bouncycastle/asn1/x9/X962Parameters;

    sget-object v8, Lorg/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->brainpoolP256r1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v7, v8}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-direct {v6, v5, v7}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    sput-object v6, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->ecDsaBrainpoolP256r1:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v7, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v8, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->rsaEncryption:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v7, v8}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v7, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->rsa:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v8, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v9, Lorg/bouncycastle/internal/asn1/edec/EdECObjectIdentifiers;->id_Ed448:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v8, v9}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v8, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->ed448:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v9, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v10, Lorg/bouncycastle/asn1/x9/X962Parameters;

    sget-object v11, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->secp384r1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v10, v11}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-direct {v9, v5, v10}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    sput-object v9, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->ecDsaP384:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v10, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v11, Lorg/bouncycastle/asn1/x9/X962Parameters;

    sget-object v12, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->secp521r1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v11, v12}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-direct {v10, v5, v11}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    sput-object v10, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->ecDsaP521:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v11, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v12, Lorg/bouncycastle/asn1/x9/X962Parameters;

    sget-object v13, Lorg/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->brainpoolP384r1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v12, v13}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-direct {v11, v5, v12}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    sput-object v11, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->ecDsaBrainpoolP384r1:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    sput-object v5, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    sput-object v5, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    sget-object v5, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v12, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_RSA2048_PSS_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v13, 0x2

    new-array v14, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    const/4 v15, 0x0

    aput-object v0, v14, v15

    const/4 v15, 0x1

    aput-object v7, v14, v15

    invoke-interface {v5, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_RSA2048_PKCS15_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/16 v16, 0x0

    move-object/from16 v17, v12

    new-array v12, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v0, v12, v16

    aput-object v7, v12, v15

    invoke-interface {v5, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v12, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_Ed25519_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v18, v14

    new-array v14, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v0, v14, v16

    aput-object v3, v14, v15

    invoke-interface {v5, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v14, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_ECDSA_P256_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v19, v12

    new-array v12, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v0, v12, v16

    aput-object v4, v12, v15

    invoke-interface {v5, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA3072_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v12, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v1, v12, v16

    aput-object v7, v12, v15

    invoke-interface {v0, v5, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v12, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA3072_PKCS15_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v20, v5

    new-array v5, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v1, v5, v16

    aput-object v7, v5, v15

    invoke-interface {v0, v12, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA4096_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v21, v12

    new-array v12, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v1, v12, v16

    aput-object v7, v12, v15

    invoke-interface {v0, v5, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v12, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA4096_PKCS15_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v22, v5

    new-array v5, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v1, v5, v16

    aput-object v7, v5, v15

    invoke-interface {v0, v12, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_ECDSA_P256_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v23, v12

    new-array v12, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v1, v12, v16

    aput-object v4, v12, v15

    invoke-interface {v0, v5, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v4, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_ECDSA_P384_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v12, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v1, v12, v16

    aput-object v9, v12, v15

    invoke-interface {v0, v4, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v12, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_ECDSA_brainpoolP256r1_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v24, v4

    new-array v4, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v1, v4, v16

    aput-object v6, v4, v15

    invoke-interface {v0, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v4, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_Ed25519_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v6, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v1, v6, v16

    aput-object v3, v6, v15

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_ECDSA_P384_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v3, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v2, v3, v16

    aput-object v9, v3, v15

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v3, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_ECDSA_brainpoolP384r1_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v6, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v2, v6, v16

    aput-object v11, v6, v15

    invoke-interface {v0, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v6, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_Ed448_SHAKE256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v9, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v2, v9, v16

    aput-object v8, v9, v15

    invoke-interface {v0, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v8, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_RSA4096_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v9, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v2, v9, v16

    aput-object v7, v9, v15

    invoke-interface {v0, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v9, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_ECDSA_P521_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v11, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v2, v11, v16

    aput-object v10, v11, v15

    invoke-interface {v0, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    sget-object v10, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_RSA3072_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-array v11, v13, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    aput-object v2, v11, v16

    aput-object v7, v11, v15

    invoke-interface {v0, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v2, 0x10c

    const/16 v7, 0x520

    filled-new-array {v7, v2}, [I

    move-result-object v2

    move-object/from16 v11, v17

    invoke-interface {v0, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v2, 0x11c

    filled-new-array {v7, v2}, [I

    move-result-object v2

    move-object/from16 v11, v18

    invoke-interface {v0, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v2, 0x20

    filled-new-array {v7, v2}, [I

    move-result-object v11

    move-object/from16 v13, v19

    invoke-interface {v0, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v11, 0x4c

    filled-new-array {v7, v11}, [I

    move-result-object v7

    invoke-interface {v0, v14, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v7, 0x7a0

    const/16 v13, 0x100

    filled-new-array {v7, v13}, [I

    move-result-object v14

    move-object/from16 v15, v20

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    filled-new-array {v7, v13}, [I

    move-result-object v14

    move-object/from16 v15, v21

    invoke-interface {v0, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v14, 0x21e

    filled-new-array {v7, v14}, [I

    move-result-object v15

    move-object/from16 v13, v22

    invoke-interface {v0, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    filled-new-array {v7, v14}, [I

    move-result-object v13

    move-object/from16 v15, v23

    invoke-interface {v0, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    filled-new-array {v7, v11}, [I

    move-result-object v13

    invoke-interface {v0, v5, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v5, 0x57

    filled-new-array {v7, v5}, [I

    move-result-object v13

    move-object/from16 v15, v24

    invoke-interface {v0, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    filled-new-array {v7, v11}, [I

    move-result-object v11

    invoke-interface {v0, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    filled-new-array {v7, v2}, [I

    move-result-object v2

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v2, 0xa20

    filled-new-array {v2, v5}, [I

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    filled-new-array {v2, v5}, [I

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v1, 0x39

    filled-new-array {v2, v1}, [I

    move-result-object v1

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    filled-new-array {v2, v14}, [I

    move-result-object v1

    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v1, 0x100

    filled-new-array {v2, v1}, [I

    move-result-object v1

    invoke-interface {v0, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    const/16 v1, 0x5d

    filled-new-array {v2, v1}, [I

    move-result-object v1

    invoke-interface {v0, v9, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;-><init>(Lorg/bouncycastle/jcajce/util/JcaJceHelper;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/jcajce/util/JcaJceHelper;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseKeyFactorySpi;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    return-void
.end method

.method private getKeyFactoriesFromIdentifier(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/util/List;
    .locals 3

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getPairing(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    const/4 v2, 0x0

    aget-object v2, p1, v2

    invoke-static {v2}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getBaseName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createKeyFactory(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    const/4 v2, 0x1

    aget-object p1, p1, v2

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getBaseName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createKeyFactory(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/NoSuchAlgorithmException;

    const-string v0, "Cannot create KeyFactories. Unsupported algorithm identifier."

    invoke-direct {p1, v0}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private getKeysSpecs(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[Lorg/bouncycastle/asn1/ASN1BitString;)[Ljava/security/spec/X509EncodedKeySpec;
    .locals 6

    .line 0
    array-length v0, p2

    new-array v0, v0, [Ljava/security/spec/X509EncodedKeySpec;

    array-length v1, p2

    new-array v1, v1, [Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    sget-object v2, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    if-eqz p1, :cond_0

    new-instance v2, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    const/4 v3, 0x0

    aget-object v4, p1, v3

    aget-object v5, p2, v3

    invoke-direct {v2, v4, v5}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/ASN1BitString;)V

    aput-object v2, v1, v3

    new-instance v2, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    const/4 v4, 0x1

    aget-object p1, p1, v4

    aget-object p2, p2, v4

    invoke-direct {v2, p1, p2}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/ASN1BitString;)V

    aput-object v2, v1, v4

    new-instance p1, Ljava/security/spec/X509EncodedKeySpec;

    aget-object p2, v1, v3

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    aput-object p1, v0, v3

    new-instance p1, Ljava/security/spec/X509EncodedKeySpec;

    aget-object p2, v1, v4

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    aput-object p1, v0, v4

    return-object v0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Cannot create key specs. Unsupported algorithm identifier."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public engineTranslateKey(Ljava/security/Key;)Ljava/security/Key;
    .locals 3

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;

    .line 9
    invoke-direct {v0}, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;-><init>()V

    .line 11
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    .line 13
    :cond_0
    :try_start_0
    instance-of v0, p1, Ljava/security/PrivateKey;

    if-eqz v0, :cond_1

    .line 18
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    .line 22
    invoke-static {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->generatePrivate(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)Ljava/security/PrivateKey;

    move-result-object p1

    return-object p1

    .line 32
    :cond_1
    instance-of v0, p1, Ljava/security/PublicKey;

    if-eqz v0, :cond_2

    .line 37
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    .line 41
    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->generatePublic(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Ljava/security/PublicKey;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 49
    :cond_2
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "Key not recognized"

    .line 54
    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 55
    throw p1

    :catch_0
    move-exception p1

    .line 57
    new-instance v0, Ljava/security/InvalidKeyException;

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Key could not be parsed: "

    .line 64
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public generatePrivate(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)Ljava/security/PrivateKey;
    .locals 9

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;

    .line 9
    invoke-direct {v0}, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;-><init>()V

    .line 11
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    .line 14
    :cond_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getPrivateKeyAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 21
    sget-object v1, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_alg_composite:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 24
    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_6

    .line 30
    sget-object v1, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_composite_key:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 33
    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_4

    .line 41
    :cond_1
    :try_start_0
    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->getKeyFactoriesFromIdentifier(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/util/List;

    move-result-object v1

    .line 44
    new-instance v3, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 47
    invoke-direct {v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 50
    :try_start_1
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->parsePrivateKey()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    .line 54
    invoke-static {v4}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v4

    .line 58
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 63
    :catch_0
    :try_start_2
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getPrivateKey()Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v4

    .line 67
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v4

    .line 70
    :goto_0
    new-instance v5, Lorg/bouncycastle/asn1/DEROctetString;

    const/16 v6, 0x20

    .line 75
    invoke-static {v4, v2, v6}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v7

    .line 79
    invoke-direct {v5, v7}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    .line 82
    invoke-virtual {v3, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v5, 0x1

    .line 86
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 89
    check-cast v5, Ljava/security/KeyFactory;

    .line 92
    invoke-virtual {v5}, Ljava/security/KeyFactory;->getAlgorithm()Ljava/lang/String;

    move-result-object v5

    const-string v7, "Ed25519"

    .line 98
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x2

    if-eqz v7, :cond_2

    .line 104
    new-instance v5, Lorg/bouncycastle/asn1/DEROctetString;

    new-array v7, v8, [B

    .line 109
    fill-array-data v7, :array_0

    .line 110
    array-length v8, v4

    .line 113
    invoke-static {v4, v6, v8}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v4

    .line 117
    invoke-static {v7, v4}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object v4

    .line 121
    invoke-direct {v5, v4}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    goto :goto_1

    :cond_2
    const-string v7, "Ed448"

    .line 133
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 138
    new-instance v5, Lorg/bouncycastle/asn1/DEROctetString;

    new-array v7, v8, [B

    .line 143
    fill-array-data v7, :array_1

    .line 144
    array-length v8, v4

    .line 147
    invoke-static {v4, v6, v8}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v4

    .line 151
    invoke-static {v7, v4}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object v4

    .line 155
    invoke-direct {v5, v4}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    goto :goto_1

    .line 158
    :cond_3
    new-instance v5, Lorg/bouncycastle/asn1/DEROctetString;

    .line 159
    array-length v7, v4

    .line 162
    invoke-static {v4, v6, v7}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v4

    .line 166
    invoke-direct {v5, v4}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    .line 124
    :goto_1
    invoke-virtual {v3, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 169
    new-instance v4, Lorg/bouncycastle/asn1/DERSequence;

    .line 172
    invoke-direct {v4, v3}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 175
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v3

    .line 178
    new-array v3, v3, [Ljava/security/PrivateKey;

    .line 180
    sget-object v5, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->pairings:Ljava/util/Map;

    .line 183
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 186
    check-cast v5, [Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 189
    :goto_2
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v6

    if-ge v2, v6, :cond_5

    .line 195
    invoke-virtual {v4, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v6

    .line 198
    instance-of v6, v6, Lorg/bouncycastle/asn1/ASN1OctetString;

    if-eqz v6, :cond_4

    .line 202
    new-instance v6, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    const/4 v7, 0x3

    .line 206
    invoke-direct {v6, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>(I)V

    .line 209
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getVersion()Lorg/bouncycastle/asn1/ASN1Integer;

    move-result-object v7

    .line 213
    invoke-virtual {v6, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 215
    aget-object v7, v5, v2

    .line 218
    invoke-virtual {v6, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 221
    invoke-virtual {v4, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v7

    .line 225
    invoke-virtual {v6, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 227
    new-instance v7, Ljava/security/spec/PKCS8EncodedKeySpec;

    .line 229
    new-instance v8, Lorg/bouncycastle/asn1/DERSequence;

    .line 232
    invoke-direct {v8, v6}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 235
    invoke-static {v8}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object v6

    .line 239
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v6

    .line 243
    invoke-direct {v7, v6}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    .line 246
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 249
    check-cast v6, Ljava/security/KeyFactory;

    .line 252
    invoke-virtual {v6, v7}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v6

    .line 255
    aput-object v6, v3, v2

    goto :goto_3

    .line 259
    :cond_4
    invoke-virtual {v4, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v6

    .line 263
    invoke-static {v6}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v6

    .line 266
    new-instance v7, Ljava/security/spec/PKCS8EncodedKeySpec;

    .line 269
    invoke-static {v6}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object v6

    .line 273
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v6

    .line 277
    invoke-direct {v7, v6}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    .line 280
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 283
    check-cast v6, Ljava/security/KeyFactory;

    .line 286
    invoke-virtual {v6, v7}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v6

    .line 289
    aput-object v6, v3, v2

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 294
    :cond_5
    new-instance p1, Lorg/bouncycastle/jcajce/CompositePrivateKey;

    .line 297
    invoke-direct {p1, v0, v3}, Lorg/bouncycastle/jcajce/CompositePrivateKey;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[Ljava/security/PrivateKey;)V
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    .line 301
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 305
    invoke-static {v0, p1}, Lorg/bouncycastle/util/Exceptions;->ioException(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/io/IOException;

    move-result-object p1

    .line 307
    throw p1

    .line 310
    :cond_6
    :goto_4
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->parsePrivateKey()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p1

    .line 314
    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object p1

    .line 318
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v0

    .line 321
    new-array v0, v0, [Ljava/security/PrivateKey;

    .line 324
    :goto_5
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v1

    if-eq v2, v1, :cond_7

    .line 330
    invoke-virtual {p1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    .line 334
    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    .line 338
    invoke-static {v1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object v1

    .line 341
    :try_start_3
    iget-object v3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    .line 344
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getPrivateKeyAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v4

    .line 348
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    .line 352
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v4

    .line 356
    invoke-interface {v3, v4}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createKeyFactory(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v3

    .line 359
    new-instance v4, Ljava/security/spec/PKCS8EncodedKeySpec;

    .line 362
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v1

    .line 366
    invoke-direct {v4, v1}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    .line 369
    invoke-virtual {v3, v4}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v1

    .line 372
    aput-object v1, v0, v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :catch_2
    move-exception p1

    .line 378
    new-instance v0, Ljava/io/IOException;

    .line 380
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot decode generic composite: "

    .line 385
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_7
    new-instance p1, Lorg/bouncycastle/jcajce/CompositePrivateKey;

    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/CompositePrivateKey;-><init>([Ljava/security/PrivateKey;)V

    return-object p1

    :array_0
    .array-data 1
        0x4t
        0x20t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x4t
        0x39t
    .end array-data
.end method

.method public generatePublic(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Ljava/security/PublicKey;
    .locals 9

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;

    .line 9
    invoke-direct {v0}, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;-><init>()V

    .line 11
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    .line 14
    :cond_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [[B

    .line 25
    :try_start_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getPublicKeyData()Lorg/bouncycastle/asn1/ASN1BitString;

    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1BitString;->getBytes()[B

    move-result-object v2

    .line 33
    invoke-static {v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 38
    :catch_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getPublicKeyData()Lorg/bouncycastle/asn1/ASN1BitString;

    move-result-object v1

    .line 42
    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->split(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1BitString;)[[B

    move-result-object v1

    const/4 v2, 0x0

    .line 46
    :goto_0
    sget-object v3, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_alg_composite:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 49
    invoke-virtual {v3, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_7

    .line 55
    sget-object v3, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_composite_key:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 58
    invoke-virtual {v3, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_5

    :cond_1
    if-nez v2, :cond_2

    .line 66
    :try_start_1
    array-length p1, v1

    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result p1

    .line 76
    :goto_1
    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->getKeyFactoriesFromIdentifier(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/util/List;

    move-result-object v3

    .line 79
    new-array v5, p1, [Lorg/bouncycastle/asn1/ASN1BitString;

    const/4 v6, 0x0

    :goto_2
    if-ge v6, p1, :cond_5

    if-eqz v2, :cond_4

    .line 87
    invoke-virtual {v2, v6}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v7

    .line 90
    instance-of v7, v7, Lorg/bouncycastle/asn1/DEROctetString;

    if-eqz v7, :cond_3

    .line 94
    new-instance v7, Lorg/bouncycastle/asn1/DERBitString;

    .line 97
    invoke-virtual {v2, v6}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v8

    .line 100
    check-cast v8, Lorg/bouncycastle/asn1/DEROctetString;

    .line 103
    invoke-virtual {v8}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v8

    .line 107
    invoke-direct {v7, v8}, Lorg/bouncycastle/asn1/DERBitString;-><init>([B)V

    .line 109
    aput-object v7, v5, v6

    goto :goto_3

    .line 113
    :cond_3
    invoke-virtual {v2, v6}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v7

    .line 116
    check-cast v7, Lorg/bouncycastle/asn1/DERBitString;

    .line 118
    aput-object v7, v5, v6

    goto :goto_3

    .line 121
    :cond_4
    new-instance v7, Lorg/bouncycastle/asn1/DERBitString;

    .line 123
    aget-object v8, v1, v6

    .line 126
    invoke-direct {v7, v8}, Lorg/bouncycastle/asn1/DERBitString;-><init>([B)V

    .line 128
    aput-object v7, v5, v6

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 134
    :cond_5
    invoke-direct {p0, v0, v5}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->getKeysSpecs(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[Lorg/bouncycastle/asn1/ASN1BitString;)[Ljava/security/spec/X509EncodedKeySpec;

    move-result-object v1

    .line 137
    new-array v2, p1, [Ljava/security/PublicKey;

    :goto_4
    if-ge v4, p1, :cond_6

    .line 142
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 145
    check-cast v5, Ljava/security/KeyFactory;

    .line 147
    aget-object v6, v1, v4

    .line 150
    invoke-virtual {v5, v6}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v5

    .line 153
    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 158
    :cond_6
    new-instance p1, Lorg/bouncycastle/jcajce/CompositePublicKey;

    .line 161
    invoke-direct {p1, v0, v2}, Lorg/bouncycastle/jcajce/CompositePublicKey;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[Ljava/security/PublicKey;)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    .line 165
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 169
    invoke-static {v0, p1}, Lorg/bouncycastle/util/Exceptions;->ioException(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/io/IOException;

    move-result-object p1

    .line 171
    throw p1

    .line 174
    :cond_7
    :goto_5
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getPublicKeyData()Lorg/bouncycastle/asn1/ASN1BitString;

    move-result-object p1

    .line 178
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1BitString;->getBytes()[B

    move-result-object p1

    .line 182
    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object p1

    .line 186
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v0

    .line 189
    new-array v0, v0, [Ljava/security/PublicKey;

    .line 192
    :goto_6
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v1

    if-eq v4, v1, :cond_8

    .line 198
    invoke-virtual {p1, v4}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    .line 202
    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v1

    .line 205
    :try_start_2
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    .line 208
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v3

    .line 212
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    .line 216
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v3

    .line 220
    invoke-interface {v2, v3}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createKeyFactory(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v2

    .line 223
    new-instance v3, Ljava/security/spec/X509EncodedKeySpec;

    .line 226
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v1

    .line 230
    invoke-direct {v3, v1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 233
    invoke-virtual {v2, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v1

    .line 236
    aput-object v1, v0, v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :catch_2
    move-exception p1

    .line 242
    new-instance v0, Ljava/io/IOException;

    .line 244
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot decode generic composite: "

    .line 249
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_8
    new-instance p1, Lorg/bouncycastle/jcajce/CompositePublicKey;

    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/CompositePublicKey;-><init>([Ljava/security/PublicKey;)V

    return-object p1
.end method

.method public split(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1BitString;)[[B
    .locals 5

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/KeyFactorySpi;->componentKeySizes:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/ASN1BitString;->getOctets()[B

    move-result-object p2

    const/4 v0, 0x0

    aget v1, p1, v0

    new-array v2, v1, [B

    array-length v3, p2

    sub-int/2addr v3, v1

    new-array v3, v3, [B

    const/4 v4, 0x2

    new-array v4, v4, [[B

    aput-object v2, v4, v0

    const/4 v2, 0x1

    aput-object v3, v4, v2

    aget-object v3, v4, v0

    invoke-static {p2, v0, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget p1, p1, v0

    aget-object v1, v4, v2

    array-length v2, v1

    invoke-static {p2, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v4
.end method
