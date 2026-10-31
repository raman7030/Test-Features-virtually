.class public Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi;
.super Lorg/bouncycastle/pqc/jcajce/provider/util/BaseKeyFactorySpi;


# static fields
.field public static final hashKeyOids:Ljava/util/Set;

.field public static final pureKeyOids:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi;->pureKeyOids:Ljava/util/Set;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    sput-object v1, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi;->hashKeyOids:Ljava/util/Set;

    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v3, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v4, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v6, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v7, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_sha2_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v8, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_128f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v9, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_128s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v10, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_192f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v11, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_192s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v12, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_256f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v13, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_slh_dsa_shake_256s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_128f_with_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_128s_with_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_192f_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_192s_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_256f_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_sha2_256s_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_128f_with_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_128s_with_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_192f_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_192s_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_256f_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_256s_with_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/pqc/jcajce/provider/util/BaseKeyFactorySpi;-><init>(Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/pqc/jcajce/provider/util/BaseKeyFactorySpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method

.method public static synthetic access$000()Ljava/util/Set;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi;->pureKeyOids:Ljava/util/Set;

    return-object v0
.end method

.method public static synthetic access$100()Ljava/util/Set;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi;->hashKeyOids:Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method public final engineGetKeySpec(Ljava/security/Key;Ljava/lang/Class;)Ljava/security/spec/KeySpec;
    .locals 3

    .line 2
    instance-of v0, p1, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/BCSLHDSAPrivateKey;

    const-string v1, "."

    if-eqz v0, :cond_0

    .line 8
    const-class v0, Ljava/security/spec/PKCS8EncodedKeySpec;

    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    new-instance p2, Ljava/security/spec/PKCS8EncodedKeySpec;

    .line 19
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    .line 23
    invoke-direct {p2, p1}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    return-object p2

    .line 26
    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/BCSLHDSAPublicKey;

    if-eqz v0, :cond_2

    .line 30
    const-class v0, Ljava/security/spec/X509EncodedKeySpec;

    .line 33
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    new-instance p2, Ljava/security/spec/X509EncodedKeySpec;

    .line 41
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    .line 45
    invoke-direct {p2, p1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    return-object p2

    .line 48
    :cond_1
    new-instance p1, Ljava/security/spec/InvalidKeySpecException;

    const-string v0, "Unknown key specification: "

    .line 0
    invoke-static {p2, v0, v1}, Ll/᩸ܳۡ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p2, Ljava/security/spec/InvalidKeySpecException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported key type: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0, v1}, Ll/۟֫ᩴ;->֫(Ljava/security/Key;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final engineTranslateKey(Ljava/security/Key;)Ljava/security/Key;
    .locals 1

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/BCSLHDSAPrivateKey;

    if-nez v0, :cond_1

    instance-of v0, p1, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/BCSLHDSAPublicKey;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "Unsupported key type"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object p1
.end method

.method public generatePrivate(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)Ljava/security/PrivateKey;
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/BCSLHDSAPrivateKey;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/BCSLHDSAPrivateKey;-><init>(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)V

    return-object v0
.end method

.method public generatePublic(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Ljava/security/PublicKey;
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/BCSLHDSAPublicKey;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/BCSLHDSAPublicKey;-><init>(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)V

    return-object v0
.end method
