.class public Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;
.super Ljava/security/SignatureSpi;


# static fields
.field public static final ML_DSA_44:Ljava/lang/String; = "ML-DSA-44"

.field public static final ML_DSA_65:Ljava/lang/String; = "ML-DSA-65"

.field public static final ML_DSA_87:Ljava/lang/String; = "ML-DSA-87"

.field public static final algorithmsParameterSpecs:Ljava/util/HashMap;

.field public static final canonicalNames:Ljava/util/Map;

.field public static final domainSeparators:Ljava/util/HashMap;

.field public static final prefix:[B


# instance fields
.field public algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public algs:[Ljava/lang/String;

.field public baseDigest:Lorg/bouncycastle/crypto/Digest;

.field public componentSignatures:[Ljava/security/Signature;

.field public compositeKey:Ljava/security/Key;

.field public contextSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

.field public domain:[B

.field public engineParams:Ljava/security/AlgorithmParameters;

.field public helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

.field public final isPrehash:Z

.field public preHashDigest:Lorg/bouncycastle/crypto/Digest;

.field public final random:Ljava/security/SecureRandom;

.field public unprimed:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 21

    const-string v0, "436f6d706f73697465416c676f726974686d5369676e61747572657332303235"

    .line 0
    invoke-static {v0}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->prefix:[B

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->canonicalNames:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v1, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->domainSeparators:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithmsParameterSpecs:Ljava/util/HashMap;

    const-string v3, "MLDSA44"

    const-string v4, "ML-DSA-44"

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "MLDSA65"

    const-string v5, "ML-DSA-65"

    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "MLDSA87"

    const-string v6, "ML-DSA-87"

    invoke-interface {v0, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_44:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_65:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_ml_dsa_87:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_RSA2048_PSS_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v3, "434f4d505349472d4d4c44534134342d525341323034382d5053532d534841323536"

    invoke-static {v3}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_RSA2048_PKCS15_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "434f4d505349472d4d4c44534134342d525341323034382d504b435331352d534841323536"

    invoke-static {v4}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_Ed25519_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "434f4d505349472d4d4c44534134342d456432353531392d534841353132"

    invoke-static {v4}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA44_ECDSA_P256_SHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "434f4d505349472d4d4c44534134342d45434453412d503235362d534841323536"

    invoke-static {v4}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA3072_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "434f4d505349472d4d4c44534136352d525341333037322d5053532d534841353132"

    invoke-static {v4}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA3072_PKCS15_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "434f4d505349472d4d4c44534136352d525341333037322d504b435331352d534841353132"

    invoke-static {v5}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA4096_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "434f4d505349472d4d4c44534136352d525341343039362d5053532d534841353132"

    invoke-static {v5}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_RSA4096_PKCS15_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v6, "434f4d505349472d4d4c44534136352d525341343039362d504b435331352d534841353132"

    invoke-static {v6}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_ECDSA_P256_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v6, "434f4d505349472d4d4c44534136352d45434453412d503235362d534841353132"

    invoke-static {v6}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_ECDSA_P384_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v6, "434f4d505349472d4d4c44534136352d45434453412d503338342d534841353132"

    invoke-static {v6}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_ECDSA_brainpoolP256r1_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v6, "434f4d505349472d4d4c44534136352d45434453412d42503235362d534841353132"

    invoke-static {v6}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA65_Ed25519_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v6, "434f4d505349472d4d4c44534136352d456432353531392d534841353132"

    invoke-static {v6}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_ECDSA_brainpoolP384r1_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v6, "434f4d505349472d4d4c44534138372d45434453412d42503338342d534841353132"

    invoke-static {v6}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_Ed448_SHAKE256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v6, "434f4d505349472d4d4c44534138372d45643434382d5348414b45323536"

    invoke-static {v6}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_RSA3072_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v6, "434f4d505349472d4d4c44534138372d525341333037322d5053532d534841353132"

    invoke-static {v6}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_RSA4096_PSS_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v7, "434f4d505349472d4d4c44534138372d525341343039362d5053532d534841353132"

    invoke-static {v7}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_ECDSA_P384_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v8, "434f4d505349472d4d4c44534138372d45434453412d503338342d534841353132"

    invoke-static {v8}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_ECDSA_P521_SHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v8, "434f4d505349472d4d4c44534138372d45434453412d503532312d534841353132"

    invoke-static {v8}, Lorg/bouncycastle/util/encoders/Hex;->decode(Ljava/lang/String;)[B

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/security/spec/PSSParameterSpec;

    new-instance v12, Ljava/security/spec/MGF1ParameterSpec;

    const-string v7, "SHA-256"

    invoke-direct {v12, v7}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    const/16 v13, 0x20

    const/4 v14, 0x1

    const-string v10, "SHA-256"

    const-string v11, "MGF1"

    move-object v9, v1

    invoke-direct/range {v9 .. v14}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/security/spec/PSSParameterSpec;

    new-instance v1, Ljava/security/spec/MGF1ParameterSpec;

    invoke-direct {v1, v7}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    const/16 v19, 0x20

    const/16 v20, 0x1

    const-string v16, "SHA-256"

    const-string v17, "MGF1"

    move-object v15, v0

    move-object/from16 v18, v1

    invoke-direct/range {v15 .. v20}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/security/spec/PSSParameterSpec;

    new-instance v11, Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "SHA-384"

    invoke-direct {v11, v1}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    const/16 v12, 0x30

    const/4 v13, 0x1

    const-string v9, "SHA-384"

    const-string v10, "MGF1"

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/security/spec/PSSParameterSpec;

    new-instance v3, Ljava/security/spec/MGF1ParameterSpec;

    invoke-direct {v3, v1}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    const/16 v18, 0x30

    const/16 v19, 0x1

    const-string v15, "SHA-384"

    const-string v16, "MGF1"

    move-object v14, v0

    move-object/from16 v17, v3

    invoke-direct/range {v14 .. v19}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/security/spec/PSSParameterSpec;

    new-instance v11, Ljava/security/spec/MGF1ParameterSpec;

    invoke-direct {v11, v7}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    const/16 v12, 0x20

    const-string v9, "SHA-256"

    const-string v10, "MGF1"

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/crypto/Digest;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, p1, p2, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/crypto/Digest;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/crypto/Digest;Z)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->random:Ljava/security/SecureRandom;

    new-instance v0, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;

    invoke-direct {v0}, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->engineParams:Ljava/security/AlgorithmParameters;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->unprimed:Z

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    iput-boolean p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->isPrehash:Z

    if-eqz p1, :cond_1

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->baseDigest:Lorg/bouncycastle/crypto/Digest;

    if-eqz p3, :cond_0

    new-instance p3, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi$NullDigest;

    invoke-interface {p2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result p2

    invoke-direct {p3, p2}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi$NullDigest;-><init>(I)V

    move-object p2, p3

    :cond_0
    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->preHashDigest:Lorg/bouncycastle/crypto/Digest;

    sget-object p2, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->domainSeparators:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->domain:[B

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getPairing(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algs:[Ljava/lang/String;

    array-length p1, p1

    new-array p1, p1, [Ljava/security/Signature;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    :cond_1
    return-void
.end method

.method private baseSigInit()V
    .locals 4

    .line 0
    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    new-instance v2, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    iget-object v3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->domain:[B

    invoke-direct {v2, v3}, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;-><init>([B)V

    invoke-virtual {v0, v2}, Ljava/security/Signature;->setParameter(Ljava/security/spec/AlgorithmParameterSpec;)V

    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithmsParameterSpecs:Ljava/util/HashMap;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/spec/AlgorithmParameterSpec;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v2, v0}, Ljava/security/Signature;->setParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    iput-boolean v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->unprimed:Z

    return-void

    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unable to set context on ML-DSA"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private createComponentSignatures(Ljava/util/List;Ljava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 0
    :goto_0
    :try_start_0
    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    array-length v1, p2

    if-eq v0, v1, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algs:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->getDefaultSignature(Ljava/lang/String;Ljava/lang/Object;)Ljava/security/Signature;

    move-result-object v1

    aput-object v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_1
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    array-length v1, v1

    if-eq v0, v1, :cond_2

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/Provider;

    if-nez v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algs:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->getDefaultSignature(Ljava/lang/String;Ljava/lang/Object;)Ljava/security/Signature;

    move-result-object v2

    aput-object v2, v1, v0

    goto :goto_2

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algs:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/Provider;

    invoke-static {v2, v3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object v2

    aput-object v2, v1, v0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lorg/bouncycastle/util/Exceptions;->illegalStateException(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1
.end method

.method private getCanonicalName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->canonicalNames:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p1
.end method

.method private getDefaultSignature(Ljava/lang/String;Ljava/lang/Object;)Ljava/security/Signature;
    .locals 0

    .line 0
    instance-of p2, p2, Lorg/bouncycastle/jcajce/interfaces/BCKey;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    invoke-interface {p2, p1}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createSignature(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p1

    return-object p1
.end method

.method private processPreHashedMessage([B)V
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->baseDigest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v1, v0, [B

    :try_start_0
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->preHashDigest:Lorg/bouncycastle/crypto/Digest;

    const/4 v3, 0x0

    invoke-interface {v2, v1, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x0

    :goto_0
    iget-object v4, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    array-length v5, v4

    if-ge v2, v5, :cond_2

    aget-object v4, v4, v2

    sget-object v5, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->prefix:[B

    invoke-virtual {v4, v5}, Ljava/security/Signature;->update([B)V

    iget-object v5, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->domain:[B

    invoke-virtual {v4, v5}, Ljava/security/Signature;->update([B)V

    iget-object v5, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->contextSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-nez v5, :cond_0

    invoke-virtual {v4, v3}, Ljava/security/Signature;->update(B)V

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;->getContext()[B

    move-result-object v5

    array-length v6, v5

    int-to-byte v6, v6

    invoke-virtual {v4, v6}, Ljava/security/Signature;->update(B)V

    invoke-virtual {v4, v5}, Ljava/security/Signature;->update([B)V

    :goto_1
    if-eqz p1, :cond_1

    array-length v5, p1

    invoke-virtual {v4, p1, v3, v5}, Ljava/security/Signature;->update([BII)V

    :cond_1
    invoke-virtual {v4, v1, v3, v0}, Ljava/security/Signature;->update([BII)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/SignatureException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private sigInitSign()V
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->compositeKey:Ljava/security/Key;

    check-cast v0, Lorg/bouncycastle/jcajce/CompositePrivateKey;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/CompositePrivateKey;->getPrivateKeys()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/PrivateKey;

    invoke-virtual {v2, v3}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->unprimed:Z

    return-void
.end method

.method private sigInitVerify()V
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->compositeKey:Ljava/security/Key;

    check-cast v0, Lorg/bouncycastle/jcajce/CompositePublicKey;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/CompositePublicKey;->getPublicKeys()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/PublicKey;

    invoke-virtual {v2, v3}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->unprimed:Z

    return-void
.end method

.method public static splitCompositeSignature([BI)[[B
    .locals 4

    .line 0
    new-array v0, p1, [B

    array-length v1, p0

    sub-int/2addr v1, p1

    new-array v2, v1, [B

    const/4 v3, 0x0

    invoke-static {p0, v3, v0, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p0, p1, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p0, 0x2

    new-array p0, p0, [[B

    aput-object v0, p0, v3

    const/4 p1, 0x1

    aput-object v2, p0, p1

    return-object p0
.end method


# virtual methods
.method public engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "engineGetParameter unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->engineParams:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->contextSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    const-string v1, "CONTEXT"

    invoke-interface {v0, v1}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createAlgorithmParameters(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->engineParams:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->contextSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/bouncycastle/util/Exceptions;->illegalStateException(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->engineParams:Ljava/security/AlgorithmParameters;

    return-object v0
.end method

.method public engineInitSign(Ljava/security/PrivateKey;)V
    .locals 3

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/jcajce/CompositePrivateKey;

    if-eqz v0, :cond_3

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->compositeKey:Ljava/security/Key;

    check-cast p1, Lorg/bouncycastle/jcajce/CompositePrivateKey;

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/CompositePrivateKey;->getAlgorithmIdentifier()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "provided composite public key cannot be used with the composite signature algorithm"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/CompositePrivateKey;->getAlgorithmIdentifier()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->baseDigest:Lorg/bouncycastle/crypto/Digest;

    iget-boolean v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->isPrehash:Z

    if-eqz v2, :cond_2

    new-instance v2, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi$NullDigest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    invoke-direct {v2, v1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi$NullDigest;-><init>(I)V

    move-object v1, v2

    :cond_2
    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->preHashDigest:Lorg/bouncycastle/crypto/Digest;

    sget-object v1, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->domainSeparators:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->domain:[B

    invoke-static {v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getPairing(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algs:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [Ljava/security/Signature;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    :goto_0
    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/CompositePrivateKey;->getPrivateKeys()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/CompositePrivateKey;->getProviders()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->createComponentSignatures(Ljava/util/List;Ljava/util/List;)V

    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->sigInitSign()V

    return-void

    :cond_3
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "Private key is not composite."

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/jcajce/CompositePublicKey;

    if-eqz v0, :cond_3

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->compositeKey:Ljava/security/Key;

    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/jcajce/CompositePublicKey;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/CompositePublicKey;->getAlgorithmIdentifier()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p1

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "provided composite public key cannot be used with the composite signature algorithm"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->baseDigest:Lorg/bouncycastle/crypto/Digest;

    iget-boolean v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->isPrehash:Z

    if-eqz v2, :cond_2

    new-instance v2, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi$NullDigest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    invoke-direct {v2, v1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi$NullDigest;-><init>(I)V

    move-object v1, v2

    :cond_2
    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->preHashDigest:Lorg/bouncycastle/crypto/Digest;

    sget-object v1, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->domainSeparators:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->domain:[B

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/CompositeIndex;->getPairing(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algs:[Ljava/lang/String;

    array-length p1, p1

    new-array p1, p1, [Ljava/security/Signature;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    :goto_0
    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/CompositePublicKey;->getPublicKeys()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/CompositePublicKey;->getProviders()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->createComponentSignatures(Ljava/util/List;Ljava/util/List;)V

    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->sigInitVerify()V

    return-void

    :cond_3
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "public key is not composite"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "engineSetParameter unsupported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 3

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->unprimed:Z

    if-eqz v0, :cond_9

    instance-of v0, p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    const-string v1, "keys invalid on reset: "

    if-eqz v0, :cond_1

    check-cast p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->contextSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    :try_start_0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->compositeKey:Ljava/security/Key;

    instance-of p1, p1, Ljava/security/PublicKey;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->sigInitVerify()V

    return-void

    :cond_0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->sigInitSign()V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    instance-of v0, p1, Lorg/bouncycastle/jcajce/spec/CompositeSignatureSpec;

    const-string v2, "unknown parameterSpec passed to composite signature"

    if-eqz v0, :cond_6

    check-cast p1, Lorg/bouncycastle/jcajce/spec/CompositeSignatureSpec;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/spec/CompositeSignatureSpec;->isPrehashMode()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi$NullDigest;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->baseDigest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi$NullDigest;-><init>(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->baseDigest:Lorg/bouncycastle/crypto/Digest;

    :goto_0
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->preHashDigest:Lorg/bouncycastle/crypto/Digest;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/spec/CompositeSignatureSpec;->getSecondarySpec()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_5

    instance-of v1, v0, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lorg/bouncycastle/jcajce/util/SpecUtil;->getContextFrom(Ljava/security/spec/AlgorithmParameterSpec;)[B

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;-><init>([B)V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->contextSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    return-void

    :cond_4
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    invoke-direct {p1, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/spec/CompositeSignatureSpec;->getSecondarySpec()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->contextSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    return-void

    :cond_6
    invoke-static {p1}, Lorg/bouncycastle/jcajce/util/SpecUtil;->getContextFrom(Ljava/security/spec/AlgorithmParameterSpec;)[B

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;-><init>([B)V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->contextSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    :try_start_1
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->compositeKey:Ljava/security/Key;

    instance-of p1, p1, Ljava/security/PublicKey;

    if-eqz p1, :cond_7

    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->sigInitVerify()V

    goto :goto_2

    :cond_7
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->sigInitSign()V
    :try_end_1
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_8
    :goto_2
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    invoke-direct {p1, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "attempt to set parameter after update"

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSign()[B
    .locals 5

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->random:Ljava/security/SecureRandom;

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->preHashDigest:Lorg/bouncycastle/crypto/Digest;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->processPreHashedMessage([B)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object v0

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/security/Signature;->sign()[B

    move-result-object v2

    array-length v3, v0

    array-length v4, v2

    add-int/2addr v3, v4

    new-array v3, v3, [B

    array-length v4, v0

    invoke-static {v0, v1, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v0

    array-length v4, v2

    invoke-static {v2, v1, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v3
.end method

.method public engineUpdate(B)V
    .locals 3

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->unprimed:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->baseSigInit()V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->preHashDigest:Lorg/bouncycastle/crypto/Digest;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/security/Signature;->update(B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public engineUpdate([BII)V
    .locals 3

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->unprimed:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->baseSigInit()V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->preHashDigest:Lorg/bouncycastle/crypto/Digest;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    aget-object v1, v1, v0

    invoke-virtual {v1, p1, p2, p3}, Ljava/security/Signature;->update([BII)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public engineVerify([B)Z
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algs:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v2, "44"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    const/16 v0, 0x974

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algs:[Ljava/lang/String;

    aget-object v0, v0, v1

    const-string v2, "65"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    const/16 v0, 0xced

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->algs:[Ljava/lang/String;

    aget-object v0, v0, v1

    const-string v2, "87"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    const/16 v0, 0x1213

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->splitCompositeSignature([BI)[[B

    move-result-object p1

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->preHashDigest:Lorg/bouncycastle/crypto/Digest;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->processPreHashedMessage([B)V

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;->componentSignatures:[Ljava/security/Signature;

    array-length v3, v2

    if-ge v1, v3, :cond_5

    aget-object v2, v2, v1

    aget-object v3, p1, v1

    invoke-virtual {v2, v3}, Ljava/security/Signature;->verify([B)Z

    move-result v2

    if-nez v2, :cond_4

    const/4 v0, 0x1

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    xor-int/lit8 p1, v0, 0x1

    return p1
.end method
