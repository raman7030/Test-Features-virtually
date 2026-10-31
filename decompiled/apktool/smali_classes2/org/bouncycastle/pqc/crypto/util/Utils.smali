.class public Lorg/bouncycastle/pqc/crypto/util/Utils;
.super Ljava/lang/Object;


# static fields
.field public static final SPHINCS_SHA3_256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final SPHINCS_SHA512_256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final XMSS_SHA256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final XMSS_SHA512:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final XMSS_SHAKE128:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final XMSS_SHAKE256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public static final bikeOids:Ljava/util/Map;

.field public static final bikeParams:Ljava/util/Map;

.field public static final dilithiumOids:Ljava/util/Map;

.field public static final dilithiumParams:Ljava/util/Map;

.field public static final falconOids:Ljava/util/Map;

.field public static final falconParams:Ljava/util/Map;

.field public static final frodoOids:Ljava/util/Map;

.field public static final frodoParams:Ljava/util/Map;

.field public static final hqcOids:Ljava/util/Map;

.field public static final hqcParams:Ljava/util/Map;

.field public static final mayoOids:Ljava/util/Map;

.field public static final mayoParams:Ljava/util/Map;

.field public static final mcElieceOids:Ljava/util/Map;

.field public static final mcElieceParams:Ljava/util/Map;

.field public static final mldsaOids:Ljava/util/Map;

.field public static final mldsaParams:Ljava/util/Map;

.field public static final mlkemOids:Ljava/util/Map;

.field public static final mlkemParams:Ljava/util/Map;

.field public static final ntruOids:Ljava/util/Map;

.field public static final ntruParams:Ljava/util/Map;

.field public static final ntruprimeOids:Ljava/util/Map;

.field public static final ntruprimeParams:Ljava/util/Map;

.field public static final picnicOids:Ljava/util/Map;

.field public static final picnicParams:Ljava/util/Map;

.field public static final rainbowOids:Ljava/util/Map;

.field public static final rainbowParams:Ljava/util/Map;

.field public static final saberOids:Ljava/util/Map;

.field public static final saberParams:Ljava/util/Map;

.field public static final sikeOids:Ljava/util/Map;

.field public static final sikeParams:Ljava/util/Map;

.field public static final slhdsaOids:Ljava/util/Map;

.field public static final slhdsaParams:Ljava/util/Map;

.field public static final snovaOids:Ljava/util/Map;

.field public static final snovaParams:Ljava/util/Map;

.field public static final sntruprimeOids:Ljava/util/Map;

.field public static final sntruprimeParams:Ljava/util/Map;

.field public static final sphincsPlusOids:Ljava/util/Map;

.field public static final sphincsPlusParams:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 90

    .line 0
    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha3_256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->SPHINCS_SHA3_256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha512_256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->SPHINCS_SHA512_256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->XMSS_SHA256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->XMSS_SHA512:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->XMSS_SHAKE128:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->XMSS_SHAKE256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->picnicOids:Ljava/util/Map;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Lorg/bouncycastle/pqc/crypto/util/Utils;->picnicParams:Ljava/util/Map;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, Lorg/bouncycastle/pqc/crypto/util/Utils;->frodoOids:Ljava/util/Map;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, Lorg/bouncycastle/pqc/crypto/util/Utils;->frodoParams:Ljava/util/Map;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    sput-object v4, Lorg/bouncycastle/pqc/crypto/util/Utils;->saberOids:Ljava/util/Map;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    sput-object v5, Lorg/bouncycastle/pqc/crypto/util/Utils;->saberParams:Ljava/util/Map;

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    sput-object v6, Lorg/bouncycastle/pqc/crypto/util/Utils;->mcElieceOids:Ljava/util/Map;

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    sput-object v7, Lorg/bouncycastle/pqc/crypto/util/Utils;->mcElieceParams:Ljava/util/Map;

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->sphincsPlusOids:Ljava/util/Map;

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    sput-object v9, Lorg/bouncycastle/pqc/crypto/util/Utils;->sphincsPlusParams:Ljava/util/Map;

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    sput-object v10, Lorg/bouncycastle/pqc/crypto/util/Utils;->sikeOids:Ljava/util/Map;

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    sput-object v10, Lorg/bouncycastle/pqc/crypto/util/Utils;->sikeParams:Ljava/util/Map;

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    sput-object v10, Lorg/bouncycastle/pqc/crypto/util/Utils;->ntruOids:Ljava/util/Map;

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    sput-object v11, Lorg/bouncycastle/pqc/crypto/util/Utils;->ntruParams:Ljava/util/Map;

    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/util/Utils;->falconOids:Ljava/util/Map;

    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/util/Utils;->falconParams:Ljava/util/Map;

    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    sput-object v14, Lorg/bouncycastle/pqc/crypto/util/Utils;->ntruprimeOids:Ljava/util/Map;

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/util/Utils;->ntruprimeParams:Ljava/util/Map;

    move-object/from16 v16, v9

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    sput-object v9, Lorg/bouncycastle/pqc/crypto/util/Utils;->sntruprimeOids:Ljava/util/Map;

    move-object/from16 v17, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->sntruprimeParams:Ljava/util/Map;

    move-object/from16 v18, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->dilithiumOids:Ljava/util/Map;

    move-object/from16 v19, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->dilithiumParams:Ljava/util/Map;

    move-object/from16 v20, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->bikeOids:Ljava/util/Map;

    move-object/from16 v21, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->bikeParams:Ljava/util/Map;

    move-object/from16 v22, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->hqcOids:Ljava/util/Map;

    move-object/from16 v23, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->hqcParams:Ljava/util/Map;

    move-object/from16 v24, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->rainbowOids:Ljava/util/Map;

    move-object/from16 v25, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->rainbowParams:Ljava/util/Map;

    move-object/from16 v26, v8

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/util/Utils;->mlkemOids:Ljava/util/Map;

    move-object/from16 v27, v9

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    sput-object v9, Lorg/bouncycastle/pqc/crypto/util/Utils;->mlkemParams:Ljava/util/Map;

    move-object/from16 v28, v15

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/util/Utils;->mldsaOids:Ljava/util/Map;

    move-object/from16 v29, v15

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/util/Utils;->mldsaParams:Ljava/util/Map;

    move-object/from16 v30, v15

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/util/Utils;->slhdsaOids:Ljava/util/Map;

    move-object/from16 v31, v15

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/util/Utils;->slhdsaParams:Ljava/util/Map;

    move-object/from16 v32, v15

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/util/Utils;->mayoOids:Ljava/util/Map;

    move-object/from16 v33, v15

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/util/Utils;->mayoParams:Ljava/util/Map;

    move-object/from16 v34, v15

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/util/Utils;->snovaOids:Ljava/util/Map;

    move-object/from16 v35, v15

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    sput-object v15, Lorg/bouncycastle/pqc/crypto/util/Utils;->snovaParams:Ljava/util/Map;

    move-object/from16 v36, v15

    sget-object v15, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece348864r3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v37, v14

    sget-object v14, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece348864_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v38, v9

    sget-object v9, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece348864fr3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v39, v8

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece348864f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v40, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece460896r3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v41, v12

    sget-object v12, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece460896_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v42, v11

    sget-object v11, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece460896fr3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v43, v10

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece460896f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v44, v1

    sget-object v1, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece6688128r3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v45, v0

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece6688128_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v46, v5

    sget-object v5, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece6688128fr3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v47, v4

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece6688128f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v48, v3

    sget-object v3, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece6960119r3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v49, v2

    sget-object v2, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece6960119_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v50, v2

    sget-object v2, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece6960119fr3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v51, v3

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece6960119f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v52, v2

    sget-object v2, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece8192128r3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v53, v3

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece8192128_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v54, v2

    sget-object v2, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;->mceliece8192128fr3:Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    move-object/from16 v55, v3

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece8192128f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v6, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v50

    move-object/from16 v0, v51

    invoke-interface {v7, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v52

    move-object/from16 v1, v53

    invoke-interface {v7, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v54

    move-object/from16 v1, v55

    invoke-interface {v7, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;->frodokem640aes:Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->frodokem640aes:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v49

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;->frodokem640shake:Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->frodokem640shake:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;->frodokem976aes:Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->frodokem976aes:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;->frodokem976shake:Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->frodokem976shake:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;->frodokem1344aes:Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->frodokem1344aes:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;->frodokem1344shake:Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;

    sget-object v12, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->frodokem1344shake:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v48

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->lightsaberkem128r3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->lightsaberkem128r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v47

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->saberkem128r3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->saberkem128r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->firesaberkem128r3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->firesaberkem128r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->lightsaberkem192r3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->lightsaberkem192r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->saberkem192r3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->saberkem192r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->firesaberkem192r3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    sget-object v12, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->firesaberkem192r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->lightsaberkem256r3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    sget-object v14, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->lightsaberkem256r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->saberkem256r3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v47, v13

    sget-object v13, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->saberkem256r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v48, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->firesaberkem256r3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v49, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->firesaberkem256r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v50, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->ulightsaberkemr3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v51, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ulightsaberkemr3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v52, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->usaberkemr3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v53, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->usaberkemr3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v54, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->ufiresaberkemr3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v55, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ufiresaberkemr3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v56, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->lightsaberkem90sr3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v57, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->lightsaberkem90sr3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v58, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->saberkem90sr3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v59, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->saberkem90sr3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v60, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->firesaberkem90sr3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v61, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->firesaberkem90sr3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v62, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->ulightsaberkem90sr3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v63, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ulightsaberkem90sr3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v64, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->usaberkem90sr3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v65, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->usaberkem90sr3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v66, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;->ufiresaberkem90sr3:Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    move-object/from16 v67, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ufiresaberkem90sr3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v46

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v47

    invoke-interface {v2, v14, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v48

    move-object/from16 v0, v49

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v50

    move-object/from16 v1, v51

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v52

    move-object/from16 v1, v53

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v54

    move-object/from16 v1, v55

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v56

    move-object/from16 v1, v57

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v58

    move-object/from16 v1, v59

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v60

    move-object/from16 v1, v61

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v62

    move-object/from16 v1, v63

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v64

    move-object/from16 v1, v65

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v66

    move-object/from16 v1, v67

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnicl1fs:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnicl1fs:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v45

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnicl1ur:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnicl1ur:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnicl3fs:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnicl3fs:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnicl3ur:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnicl3ur:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnicl5fs:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnicl5fs:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnicl5ur:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    sget-object v12, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnicl5ur:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v13, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnic3l1:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    sget-object v14, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnic3l1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnic3l3:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    move-object/from16 v45, v13

    sget-object v13, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnic3l3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v46, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnic3l5:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    move-object/from16 v47, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnic3l5:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v48, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnicl1full:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    move-object/from16 v49, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnicl1full:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v50, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnicl3full:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    move-object/from16 v51, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnicl3full:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v52, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;->picnicl5full:Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    move-object/from16 v53, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->picnicl5full:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v44

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v45

    invoke-interface {v2, v14, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v46

    move-object/from16 v0, v47

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v48

    move-object/from16 v1, v49

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v50

    move-object/from16 v1, v51

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v52

    move-object/from16 v1, v53

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;->ntruhps2048509:Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntruhps2048509:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v43

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;->ntruhps2048677:Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntruhps2048677:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;->ntruhps4096821:Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntruhps4096821:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;->ntruhps40961229:Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntruhps40961229:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;->ntruhrss701:Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntruhrss701:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;->ntruhrss1373:Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;

    sget-object v12, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntruhrss1373:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v42

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;->falcon_512:Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->falcon_512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v41

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;->falcon_1024:Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->falcon_1024:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v40

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->old_falcon_512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->old_falcon_1024:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;->ml_kem_512:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_alg_ml_kem_512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v39

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;->ml_kem_768:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    sget-object v4, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_alg_ml_kem_768:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;->ml_kem_1024:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    sget-object v6, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_alg_ml_kem_1024:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v38

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;->ntrulpr653:Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntrulpr653:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v37

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;->ntrulpr761:Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntrulpr761:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;->ntrulpr857:Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntrulpr857:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;->ntrulpr953:Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntrulpr953:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;->ntrulpr1013:Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntrulpr1013:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;->ntrulpr1277:Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;

    sget-object v12, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->ntrulpr1277:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v28

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;->sntrup653:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sntrup653:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v27

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;->sntrup761:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sntrup761:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;->sntrup857:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sntrup857:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;->sntrup953:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sntrup953:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;->sntrup1013:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sntrup1013:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;->sntrup1277:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    sget-object v12, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sntrup1277:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v18

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->ml_dsa_44:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_44:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v29

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->ml_dsa_65:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    sget-object v4, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_65:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->ml_dsa_87:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    sget-object v6, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_87:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->ml_dsa_44_with_sha512:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    sget-object v8, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_ml_dsa_44_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->ml_dsa_65_with_sha512:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    sget-object v10, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_ml_dsa_65_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;->ml_dsa_87_with_sha512:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    sget-object v12, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_ml_dsa_87_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v30

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;->dilithium2:Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->dilithium2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;->dilithium3:Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->dilithium3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;->dilithium5:Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->dilithium5:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v20

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->bike128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v1, Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;->bike128:Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;

    move-object/from16 v2, v22

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->bike192:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v4, Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;->bike192:Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->bike256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v6, Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;->bike256:Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v21

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->hqc128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v1, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc128:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    move-object/from16 v2, v24

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->hqc192:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v4, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc192:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->hqc256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v6, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->hqc256:Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v23

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->rainbow_III_classic:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v1, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->rainbowIIIclassic:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    move-object/from16 v2, v26

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->rainbow_III_circumzenithal:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v4, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->rainbowIIIcircumzenithal:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->rainbow_III_compressed:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v6, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->rainbowIIIcompressed:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->rainbow_V_classic:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v8, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->rainbowVclassic:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->rainbow_V_circumzenithal:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v10, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->rainbowVcircumzenithal:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->rainbow_V_compressed:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v12, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;->rainbowVcompressed:Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v25

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_128s:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v31

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_128f:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    sget-object v4, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_192s:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    sget-object v6, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_192f:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    sget-object v8, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_256s:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    sget-object v10, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_256f:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    sget-object v12, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_128s:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    sget-object v14, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_128f:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v18, v13

    sget-object v13, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v19, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_192s:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v20, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v21, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_192f:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v22, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v23, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_256s:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v24, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v25, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_256f:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v26, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v27, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_128s_with_sha256:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v28, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_128s_with_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v29, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_128f_with_sha256:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v30, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_128f_with_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v31, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_192s_with_sha512:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v37, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_192s_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v38, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_192f_with_sha512:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v39, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_192f_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v40, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_256s_with_sha512:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v41, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_256s_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v42, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->sha2_256f_with_sha512:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v43, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_256f_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v44, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_128s_with_shake128:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v45, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_128s_with_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v46, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_128f_with_shake128:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v47, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_128f_with_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v48, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_192s_with_shake256:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v49, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_192s_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v50, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_192f_with_shake256:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v51, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_192f_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v52, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_256s_with_shake256:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v53, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_256s_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v54, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;->shake_256f_with_shake256:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    move-object/from16 v55, v15

    sget-object v15, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_256f_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v32

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v18

    invoke-interface {v2, v14, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, v19

    move-object/from16 v4, v20

    invoke-interface {v2, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, v21

    move-object/from16 v8, v22

    invoke-interface {v2, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v23

    move-object/from16 v10, v24

    invoke-interface {v2, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v10, v25

    move-object/from16 v12, v26

    invoke-interface {v2, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v27

    move-object/from16 v14, v28

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v14, v29

    move-object/from16 v12, v30

    invoke-interface {v2, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v31

    move-object/from16 v14, v37

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v38

    move-object/from16 v14, v39

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v40

    move-object/from16 v14, v41

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v42

    move-object/from16 v14, v43

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v44

    move-object/from16 v14, v45

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v46

    move-object/from16 v14, v47

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v48

    move-object/from16 v14, v49

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v50

    move-object/from16 v14, v51

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v52

    move-object/from16 v14, v53

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v54

    move-object/from16 v14, v55

    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v12, v17

    invoke-interface {v12, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v1, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v13, v27

    invoke-interface {v12, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_128s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    sget-object v14, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_128s_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_128f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v17, v13

    sget-object v13, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_128f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v18, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_128s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v19, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_128s_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v20, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_128f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v21, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_128f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v22, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_128s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v23, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_128s_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v24, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_128f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v25, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_128f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v26, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_192s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v27, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_192s_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v28, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_192f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v29, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_192f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v30, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_192s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v31, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_192s_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v32, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_192f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v37, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_192f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v38, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_192s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v39, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_192s_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v40, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_192f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v41, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_192f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v42, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_256s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v43, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_256s_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v44, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_256f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v45, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_256f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v46, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_256s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v47, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_256s_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v48, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_256f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v49, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_256f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v50, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_256s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v51, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_256s_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v52, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_256f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v53, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_256f_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v54, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_128s_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v55, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_128s_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v56, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_128f_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v57, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_128f_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v58, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_192s_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v59, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_192s_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v60, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_192f_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v61, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_192f_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v62, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_256s_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v63, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_256s_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v64, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_256f_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    move-object/from16 v65, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_haraka_256f_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v66, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_128s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v67, v15

    sget-object v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_128f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v15, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v68, v14

    sget-object v14, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_192s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v14, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v69, v3

    sget-object v3, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_192f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v70, v3

    sget-object v3, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_256s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v71, v3

    sget-object v3, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_256f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v72, v3

    sget-object v3, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_128s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v73, v9

    sget-object v9, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_128f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v9, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v74, v7

    sget-object v7, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_192s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v75, v4

    sget-object v4, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_192f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v76, v4

    sget-object v4, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_256s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v77, v4

    sget-object v4, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_256f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    invoke-interface {v12, v4, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, v16

    invoke-interface {v12, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v12, v0, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v12, v11, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v12, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v69

    invoke-interface {v12, v0, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v70

    invoke-interface {v12, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v75

    invoke-interface {v12, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v76

    invoke-interface {v12, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v5, v71

    move-object/from16 v2, v74

    invoke-interface {v12, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, v72

    move-object/from16 v2, v73

    invoke-interface {v12, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v77

    invoke-interface {v12, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v12, v10, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v17

    move-object/from16 v10, v68

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v10, v18

    move-object/from16 v8, v19

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v20

    move-object/from16 v10, v21

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v22

    move-object/from16 v10, v23

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v24

    move-object/from16 v10, v25

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v26

    move-object/from16 v10, v27

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v28

    move-object/from16 v10, v29

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v30

    move-object/from16 v10, v31

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v32

    move-object/from16 v10, v37

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v38

    move-object/from16 v10, v39

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v40

    move-object/from16 v10, v41

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v42

    move-object/from16 v10, v43

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v44

    move-object/from16 v10, v45

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v46

    move-object/from16 v10, v47

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v48

    move-object/from16 v10, v49

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v50

    move-object/from16 v10, v51

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v52

    move-object/from16 v10, v53

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v54

    move-object/from16 v10, v55

    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_128s_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v8, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_128f_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v8, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_128s_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_128f_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v3, v56

    move-object/from16 v8, v57

    invoke-interface {v12, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v3, v58

    move-object/from16 v8, v59

    invoke-interface {v12, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_192s_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v3, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_192f_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_192s_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_192f_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v60

    move-object/from16 v1, v61

    invoke-interface {v12, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v62

    move-object/from16 v1, v63

    invoke-interface {v12, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_256s_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_sha2_256f_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_256s_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->sphincsPlus_shake_256f_r3_simple:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v12, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v64

    move-object/from16 v1, v65

    invoke-interface {v12, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v66

    move-object/from16 v1, v67

    invoke-interface {v12, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->mayo1:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v33

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->mayo2:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->mayo3:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->mayo5:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo5:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v34

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    sget-object v1, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_4_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v2, v35

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_4_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    sget-object v6, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_4_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_4_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    sget-object v8, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_4_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_5_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    sget-object v10, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_5_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v11, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_5_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    sget-object v12, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_5_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_5_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    sget-object v14, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_5_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v15, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_24_5_5_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v16, v13

    sget-object v13, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_5_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v17, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_25_8_3_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v18, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_25_8_3_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v19, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_25_8_3_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v20, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_25_8_3_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v21, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_25_8_3_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v22, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_25_8_3_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v23, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_25_8_3_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v24, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_25_8_3_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v25, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_29_6_5_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v26, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_29_6_5_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v27, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_29_6_5_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v28, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_29_6_5_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v29, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_29_6_5_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v30, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_29_6_5_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v31, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_29_6_5_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v32, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_29_6_5_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v33, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_8_4_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v34, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_8_4_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v35, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_8_4_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v37, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_8_4_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v38, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_8_4_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v39, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_8_4_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v40, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_8_4_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v41, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_8_4_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v42, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_17_2_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v43, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_17_2_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v44, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_17_2_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v45, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_17_2_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v46, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_17_2_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v47, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_17_2_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v48, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_37_17_2_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v49, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_37_17_2_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v50, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_49_11_3_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v51, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_49_11_3_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v52, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_49_11_3_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v53, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_49_11_3_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v54, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_49_11_3_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v55, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_49_11_3_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v56, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_49_11_3_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v57, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_49_11_3_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v58, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_56_25_2_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v59, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_56_25_2_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v60, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_56_25_2_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v61, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_56_25_2_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v62, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_56_25_2_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v63, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_56_25_2_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v64, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_56_25_2_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v65, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_56_25_2_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v66, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_60_10_4_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v67, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_60_10_4_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v68, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_60_10_4_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v69, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_60_10_4_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v70, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_60_10_4_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v71, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_60_10_4_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v72, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_60_10_4_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v73, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_60_10_4_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v74, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_66_15_3_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v75, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_66_15_3_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v76, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_66_15_3_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v77, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_66_15_3_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v78, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_66_15_3_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v79, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_66_15_3_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v80, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_66_15_3_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v81, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_66_15_3_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v82, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_75_33_2_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v83, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_75_33_2_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v84, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_75_33_2_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v85, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_75_33_2_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v86, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_75_33_2_SHAKE_SSK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v87, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_75_33_2_shake_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v88, v13

    sget-object v13, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->SNOVA_75_33_2_SHAKE_ESK:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    move-object/from16 v89, v15

    sget-object v15, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_75_33_2_shake_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v36

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v16

    invoke-interface {v2, v14, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v17

    move-object/from16 v0, v18

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v25

    move-object/from16 v1, v26

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v27

    move-object/from16 v1, v28

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v29

    move-object/from16 v1, v30

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v31

    move-object/from16 v1, v32

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v33

    move-object/from16 v1, v34

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v35

    move-object/from16 v1, v37

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v38

    move-object/from16 v1, v39

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v40

    move-object/from16 v1, v41

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v42

    move-object/from16 v1, v43

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v44

    move-object/from16 v1, v45

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v46

    move-object/from16 v1, v47

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v48

    move-object/from16 v1, v49

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v50

    move-object/from16 v1, v51

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v52

    move-object/from16 v1, v53

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v54

    move-object/from16 v1, v55

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v56

    move-object/from16 v1, v57

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v58

    move-object/from16 v1, v59

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v60

    move-object/from16 v1, v61

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v62

    move-object/from16 v1, v63

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v64

    move-object/from16 v1, v65

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v66

    move-object/from16 v1, v67

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v68

    move-object/from16 v1, v69

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v70

    move-object/from16 v1, v71

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v72

    move-object/from16 v1, v73

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v74

    move-object/from16 v1, v75

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v76

    move-object/from16 v1, v77

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v78

    move-object/from16 v1, v79

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v80

    move-object/from16 v1, v81

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v82

    move-object/from16 v1, v83

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v84

    move-object/from16 v1, v85

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v86

    move-object/from16 v1, v87

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v88

    move-object/from16 v1, v89

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bikeOidLookup(Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->bikeOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static bikeParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->bikeParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/bike/BIKEParameters;

    return-object p0
.end method

.method public static dilithiumOidLookup(Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->dilithiumOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static dilithiumParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->dilithiumParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumParameters;

    return-object p0
.end method

.method public static falconOidLookup(Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->falconOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static falconParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->falconParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/falcon/FalconParameters;

    return-object p0
.end method

.method public static frodoOidLookup(Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->frodoOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static frodoParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->frodoParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/frodo/FrodoParameters;

    return-object p0
.end method

.method public static getAlgorithmIdentifier(Ljava/lang/String;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;
    .locals 2

    const-string v0, "SHA-1"

    .line 0
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v0, Lorg/bouncycastle/internal/asn1/oiw/OIWObjectIdentifiers;->idSHA1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/DERNull;->INSTANCE:Lorg/bouncycastle/asn1/DERNull;

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    return-object p0

    :cond_0
    const-string v0, "SHA-224"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha224:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-object p0

    :cond_1
    const-string v0, "SHA-256"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-object p0

    :cond_2
    const-string v0, "SHA-384"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha384:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-object p0

    :cond_3
    const-string v0, "SHA-512"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance p0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-object p0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unrecognised digest algorithm: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;
    .locals 2

    .line 2
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 5
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    new-instance p0, Lorg/bouncycastle/crypto/digests/SHA256Digest;

    .line 13
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/SHA256Digest;-><init>()V

    return-object p0

    .line 16
    :cond_0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 19
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    new-instance p0, Lorg/bouncycastle/crypto/digests/SHA512Digest;

    .line 27
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/SHA512Digest;-><init>()V

    return-object p0

    .line 30
    :cond_1
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 33
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 38
    new-instance p0, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v0, 0x80

    .line 43
    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    return-object p0

    .line 46
    :cond_2
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 49
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 54
    new-instance p0, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v0, 0x100

    .line 59
    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    return-object p0

    .line 62
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unrecognized digest OID: "

    .line 0
    invoke-static {v1, p0}, Ll/ۡܽܳ;->֫(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getDigestName(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    .locals 2

    .line 2
    sget-object v0, Lorg/bouncycastle/internal/asn1/oiw/OIWObjectIdentifiers;->idSHA1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 5
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "SHA-1"

    return-object p0

    .line 13
    :cond_0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha224:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 16
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "SHA-224"

    return-object p0

    .line 24
    :cond_1
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 27
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "SHA-256"

    return-object p0

    .line 35
    :cond_2
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha384:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 38
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "SHA-384"

    return-object p0

    .line 46
    :cond_3
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 49
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p0, "SHA-512"

    return-object p0

    .line 57
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unrecognised digest algorithm: "

    .line 0
    invoke-static {v1, p0}, Ll/ۡܽܳ;->֫(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static hqcOidLookup(Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->hqcOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static hqcParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->hqcParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    return-object p0
.end method

.method public static isRaw([B)Z
    .locals 1

    .line 0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->read()I

    invoke-static {v0}, Lorg/bouncycastle/pqc/crypto/util/Utils;->readLen(Ljava/io/ByteArrayInputStream;)I

    move-result p0

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static mayoOidLookup(Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->mayoOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static mayoParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->mayoParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    return-object p0
.end method

.method public static mcElieceOidLookup(Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->mcElieceOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static mcElieceParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->mcElieceParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/cmce/CMCEParameters;

    return-object p0
.end method

.method public static mldsaOidLookup(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->mldsaOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static mldsaParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->mldsaParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAParameters;

    return-object p0
.end method

.method public static mlkemOidLookup(Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->mlkemOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static mlkemParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->mlkemParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    return-object p0
.end method

.method public static ntruOidLookup(Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->ntruOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static ntruParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->ntruParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/ntru/NTRUParameters;

    return-object p0
.end method

.method public static ntrulprimeOidLookup(Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->ntruprimeOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static ntrulprimeParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->ntruprimeParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/ntruprime/NTRULPRimeParameters;

    return-object p0
.end method

.method public static parseData([B)Lorg/bouncycastle/asn1/ASN1Primitive;
    .locals 3

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/util/Utils;->isRaw([B)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    aget-byte v1, p0, v0

    const/16 v2, 0x30

    if-ne v1, v2, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p0

    return-object p0

    :cond_1
    and-int/lit16 v1, v1, 0xff

    const/16 v2, 0x80

    if-ne v1, v2, :cond_2

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1TaggedObject;

    move-result-object p0

    invoke-static {p0, v0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseOctetData([B)Lorg/bouncycastle/asn1/ASN1OctetString;
    .locals 2

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/util/Utils;->isRaw([B)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static picnicOidLookup(Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->picnicOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static picnicParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->picnicParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/picnic/PicnicParameters;

    return-object p0
.end method

.method public static rainbowOidLookup(Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->rainbowOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static rainbowParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->rainbowParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;

    return-object p0
.end method

.method public static readLen(Ljava/io/ByteArrayInputStream;)I
    .locals 3

    .line 0
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    if-gez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    and-int/lit8 v1, v0, 0x7f

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v1

    add-int/2addr v0, v1

    move v1, v2

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static saberOidLookup(Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->saberOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static saberParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->saberParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/saber/SABERParameters;

    return-object p0
.end method

.method public static slhdsaOidLookup(Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->slhdsaOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static slhdsaParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->slhdsaParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters;

    return-object p0
.end method

.method public static snovaOidLookup(Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->snovaOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static snovaParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->snovaParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    return-object p0
.end method

.method public static sntruprimeOidLookup(Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->sntruprimeOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static sntruprimeParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->sntruprimeParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    return-object p0
.end method

.method public static sphincs256LookupTreeAlgID(Ljava/lang/String;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;
    .locals 2

    const-string v0, "SHA3-256"

    .line 0
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lorg/bouncycastle/pqc/crypto/util/Utils;->SPHINCS_SHA3_256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-object p0

    :cond_0
    const-string v0, "SHA-512/256"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lorg/bouncycastle/pqc/crypto/util/Utils;->SPHINCS_SHA512_256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown tree digest: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static sphincs256LookupTreeAlgName(Lorg/bouncycastle/pqc/asn1/SPHINCS256KeyParams;)Ljava/lang/String;
    .locals 3

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/asn1/SPHINCS256KeyParams;->getTreeDigest()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/pqc/crypto/util/Utils;->SPHINCS_SHA3_256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "SHA3-256"

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/pqc/crypto/util/Utils;->SPHINCS_SHA512_256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "SHA-512/256"

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown tree digest: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static sphincsPlusOidLookup(Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->sphincsPlusOids:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static sphincsPlusParamsLookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/util/Utils;->sphincsPlusParams:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    return-object p0
.end method

.method public static xmssLookupTreeAlgID(Ljava/lang/String;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;
    .locals 2

    const-string v0, "SHA-256"

    .line 0
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lorg/bouncycastle/pqc/crypto/util/Utils;->XMSS_SHA256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-object p0

    :cond_0
    const-string v0, "SHA-512"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lorg/bouncycastle/pqc/crypto/util/Utils;->XMSS_SHA512:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-object p0

    :cond_1
    const-string v0, "SHAKE128"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lorg/bouncycastle/pqc/crypto/util/Utils;->XMSS_SHAKE128:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-object p0

    :cond_2
    const-string v0, "SHAKE256"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lorg/bouncycastle/pqc/crypto/util/Utils;->XMSS_SHAKE256:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown tree digest: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
