.class public Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;
.super Ljava/security/KeyStoreSpi;

# interfaces
.implements Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;
.implements Lorg/bouncycastle/jce/interfaces/BCKeyStore;


# static fields
.field public static final CERTIFICATE:I = 0x1

.field public static final KEY:I = 0x2

.field public static final KEY_PRIVATE:I = 0x0

.field public static final KEY_PUBLIC:I = 0x1

.field public static final KEY_SECRET:I = 0x2

.field public static final MIN_ITERATIONS:I = 0xc800

.field public static final NULL:I = 0x0

.field public static final PKCS12_MAX_IT_COUNT_PROPERTY:Ljava/lang/String; = "org.bouncycastle.pkcs12.max_it_count"

.field public static final SALT_SIZE:I = 0x14

.field public static final SEALED:I = 0x4

.field public static final SECRET:I = 0x3

.field public static final keySizeProvider:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$DefaultSecretKeyProvider;


# instance fields
.field public certAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public certFact:Ljava/security/cert/CertificateFactory;

.field public certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

.field public chainCerts:Ljava/util/Hashtable;

.field public final helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

.field public itCount:I

.field public keyAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public keyCerts:Ljava/util/Hashtable;

.field public keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

.field public localIds:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

.field public macAlgorithm:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public random:Ljava/security/SecureRandom;

.field public saltLength:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$DefaultSecretKeyProvider;

    invoke-direct {v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$DefaultSecretKeyProvider;-><init>()V

    sput-object v0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keySizeProvider:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$DefaultSecretKeyProvider;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/jcajce/util/JcaJceHelper;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/security/KeyStoreSpi;-><init>()V

    .line 5
    new-instance v0, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;

    .line 8
    invoke-direct {v0}, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;-><init>()V

    .line 10
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    .line 12
    new-instance v0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$1;)V

    .line 18
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 20
    new-instance v0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 23
    invoke-direct {v0, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$1;)V

    .line 25
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->localIds:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 27
    new-instance v0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 30
    invoke-direct {v0, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$1;)V

    .line 32
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 34
    new-instance v0, Ljava/util/Hashtable;

    .line 37
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 39
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    .line 41
    new-instance v0, Ljava/util/Hashtable;

    .line 44
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 46
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    .line 49
    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    .line 52
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->random:Ljava/security/SecureRandom;

    .line 54
    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 56
    sget-object v1, Lorg/bouncycastle/internal/asn1/oiw/OIWObjectIdentifiers;->idSHA1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 58
    sget-object v2, Lorg/bouncycastle/asn1/DERNull;->INSTANCE:Lorg/bouncycastle/asn1/DERNull;

    .line 61
    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 63
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->macAlgorithm:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    const v0, 0x19000

    .line 68
    iput v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->itCount:I

    const/16 v0, 0x14

    .line 72
    iput v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->saltLength:I

    .line 74
    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 76
    iput-object p3, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    :try_start_0
    const-string p2, "X.509"

    .line 81
    invoke-interface {p1, p2}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createCertificateFactory(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object p1

    .line 84
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certFact:Ljava/security/cert/CertificateFactory;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 88
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 90
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "can\'t create cert factory - "

    .line 95
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p3}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static synthetic access$100(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createSubjectKeyId(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object p0

    return-object p0
.end method

.method private calculatePbeMac(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[BI[CZ[B)[B
    .locals 3

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_PBMAC1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->macAlgorithm:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/pkcs/PBMAC1Params;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PBMAC1Params;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_PBKDF2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PBMAC1Params;->getKeyDerivationFunc()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PBMAC1Params;->getKeyDerivationFunc()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getKeyLength()Ljava/math/BigInteger;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance p2, Lorg/bouncycastle/crypto/macs/HMac;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PBMAC1Params;->getMessageAuthScheme()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object p3

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p3

    invoke-static {p3}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->getPrf(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;

    move-result-object p3

    invoke-direct {p2, p3}, Lorg/bouncycastle/crypto/macs/HMac;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    new-instance p3, Lorg/bouncycastle/crypto/generators/PKCS5S2ParametersGenerator;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getPrf()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object p5

    invoke-virtual {p5}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p5

    invoke-static {p5}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->getPrf(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;

    move-result-object p5

    invoke-direct {p3, p5}, Lorg/bouncycastle/crypto/generators/PKCS5S2ParametersGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    invoke-static {p4}, Lorg/bouncycastle/util/Strings;->toUTF8ByteArray([C)[B

    move-result-object p4

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getSalt()[B

    move-result-object p5

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getIterationCount()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/BigIntegers;->intValueExact(Ljava/math/BigInteger;)I

    move-result v0

    invoke-virtual {p3, p4, p5, v0}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->init([B[BI)V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getKeyLength()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/util/BigIntegers;->intValueExact(Ljava/math/BigInteger;)I

    move-result p1

    mul-int/lit8 p1, p1, 0x8

    invoke-virtual {p3, p1}, Lorg/bouncycastle/crypto/generators/PKCS5S2ParametersGenerator;->generateDerivedParameters(I)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object p1

    invoke-virtual {p3}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->getPassword()[B

    move-result-object p3

    invoke-static {p3}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    invoke-virtual {p2, p1}, Lorg/bouncycastle/crypto/macs/HMac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    array-length p1, p6

    const/4 p3, 0x0

    invoke-virtual {p2, p6, p3, p1}, Lorg/bouncycastle/crypto/macs/HMac;->update([BII)V

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/macs/HMac;->getMacSize()I

    move-result p1

    new-array p1, p1, [B

    invoke-virtual {p2, p1, p3}, Lorg/bouncycastle/crypto/macs/HMac;->doFinal([BI)I

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Key length must be present when using PBMAC1."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "If the DigestAlgorithmIdentifier is id-PBMAC1, then the parameters field must contain valid PBMAC1-params parameters."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance v0, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-direct {v0, p2, p3}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    new-instance p2, Lorg/bouncycastle/jcajce/PKCS12Key;

    invoke-direct {p2, p4, p5}, Lorg/bouncycastle/jcajce/PKCS12Key;-><init>([CZ)V

    :try_start_0
    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createMac(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {p1, p6}, Ljavax/crypto/Mac;->update([B)V

    invoke-virtual {p1}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Lorg/bouncycastle/jcajce/PKCS12Key;->getPassword()[C

    move-result-object p2

    invoke-static {p2}, Lorg/bouncycastle/util/Arrays;->clear([C)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Lorg/bouncycastle/jcajce/PKCS12Key;->getPassword()[C

    move-result-object p2

    invoke-static {p2}, Lorg/bouncycastle/util/Arrays;->clear([C)V

    throw p1
.end method

.method private createCipher(I[CLorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)Ljavax/crypto/Cipher;
    .locals 12

    .line 0
    invoke-virtual {p3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p3

    invoke-static {p3}, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;

    move-result-object p3

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;->getKeyDerivationFunc()Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;

    move-result-object v0

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;->getEncryptionScheme()Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;->getKeyDerivationFunc()Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createSecretKeyFactory(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v2

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->isDefaultPrf()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getSalt()[B

    move-result-object v4

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getIterationCount()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->validateIterationCount(Ljava/math/BigInteger;)I

    move-result v0

    sget-object v5, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keySizeProvider:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$DefaultSecretKeyProvider;

    invoke-virtual {v5, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$DefaultSecretKeyProvider;->getKeySize(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)I

    move-result v5

    invoke-direct {v3, p2, v4, v0, v5}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    goto :goto_0

    :cond_0
    new-instance v3, Lorg/bouncycastle/jcajce/spec/PBKDF2KeySpec;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getSalt()[B

    move-result-object v8

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getIterationCount()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {p0, v4}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->validateIterationCount(Ljava/math/BigInteger;)I

    move-result v9

    sget-object v4, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keySizeProvider:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$DefaultSecretKeyProvider;

    invoke-virtual {v4, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$DefaultSecretKeyProvider;->getKeySize(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)I

    move-result v10

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getPrf()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v11

    move-object v6, v3

    move-object v7, p2

    invoke-direct/range {v6 .. v11}, Lorg/bouncycastle/jcajce/spec/PBKDF2KeySpec;-><init>([C[BIILorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)V

    :goto_0
    invoke-virtual {v2, v3}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object p2

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;->getEncryptionScheme()Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createCipher(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;->getEncryptionScheme()Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;

    move-result-object p3

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p3

    instance-of v2, p3, Lorg/bouncycastle/asn1/ASN1OctetString;

    if-eqz v2, :cond_1

    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-static {p3}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p3

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object p3

    invoke-direct {v1, p3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    goto :goto_1

    :cond_1
    invoke-static {p3}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    instance-of v3, v3, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v3, :cond_2

    invoke-static {p3}, Lorg/bouncycastle/asn1/cryptopro/GOST28147Parameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/cryptopro/GOST28147Parameters;

    move-result-object p3

    new-instance v1, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/cryptopro/GOST28147Parameters;->getEncryptionParamSet()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/cryptopro/GOST28147Parameters;->getIV()[B

    move-result-object p3

    invoke-direct {v1, v2, p3}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[B)V

    :goto_1
    invoke-virtual {v0, p1, p2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    return-object v0

    :cond_2
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p3

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object p3

    const-string v1, "BC"

    invoke-static {p3, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object p3

    :try_start_0
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/security/AlgorithmParameters;->init([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, p1, p2, p3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/AlgorithmParameters;)V

    return-object v0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/security/spec/InvalidKeySpecException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private createSafeBag(Ljava/lang/String;Ljava/security/cert/Certificate;Z)Lorg/bouncycastle/asn1/pkcs/SafeBag;
    .locals 6

    .line 0
    new-instance v0, Lorg/bouncycastle/asn1/pkcs/CertBag;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->x509Certificate:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v2, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-virtual {p2}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v3

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/pkcs/CertBag;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    instance-of v2, p2, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    move-object v2, p2

    check-cast v2, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    sget-object v4, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v4}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v5

    check-cast v5, Lorg/bouncycastle/asn1/ASN1BMPString;

    if-eqz p3, :cond_1

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ASN1BMPString;->getString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    :cond_0
    if-eqz p1, :cond_1

    new-instance p3, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-direct {p3, p1}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v4, p3}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->setBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    :cond_1
    invoke-interface {v2}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttributeKeys()Ljava/util/Enumeration;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_2
    sget-object v5, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_oracle_pkcs12_trusted_key_usage:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    new-instance v3, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    new-instance v5, Lorg/bouncycastle/asn1/DERSet;

    invoke-interface {v2, v4}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    invoke-direct {v5, v4}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v3, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    new-instance v4, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v4, v3}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v1, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v3, 0x1

    goto :goto_0

    :cond_4
    if-nez v3, :cond_5

    new-instance p3, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {p3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p3, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    new-instance v2, Lorg/bouncycastle/asn1/DERSet;

    new-instance v3, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-direct {v3, p1}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {p3, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    new-instance p1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {p1, p3}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v1, p1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    :cond_5
    instance-of p1, p2, Ljava/security/cert/X509Certificate;

    if-eqz p1, :cond_7

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-virtual {p2}, Ljava/security/cert/X509Certificate;->getTBSCertificate()[B

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/TBSCertificate;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertificate;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/TBSCertificate;->getExtensions()Lorg/bouncycastle/asn1/x509/Extensions;

    move-result-object p1

    sget-object p2, Lorg/bouncycastle/asn1/x509/Extension;->extendedKeyUsage:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, p2}, Lorg/bouncycastle/asn1/x509/Extensions;->getExtensionValue(Lorg/bouncycastle/asn1/x509/Extensions;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p1

    new-instance p2, Lorg/bouncycastle/asn1/DERSet;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/ExtendedKeyUsage;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/ExtendedKeyUsage;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/ExtendedKeyUsage;->getUsages()[Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/bouncycastle/asn1/DERSet;-><init>([Lorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_1

    :cond_6
    sget-object p1, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->anyExtendedKeyUsage:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    invoke-direct {p2, p1}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    :goto_1
    new-instance p1, Lorg/bouncycastle/asn1/DERSequence;

    sget-object p3, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_oracle_pkcs12_trusted_key_usage:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p1, p3, p2}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, p1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    :cond_7
    new-instance p1, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    sget-object p2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->certBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/CertBag;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p3

    new-instance v0, Lorg/bouncycastle/asn1/DERSet;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {p1, p2, p3, v0}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;Lorg/bouncycastle/asn1/ASN1Set;)V

    return-object p1
.end method

.method private createSubjectKeyId(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;
    .locals 1

    .line 0
    :try_start_0
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object p1

    new-instance v0, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->getDigest(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)[B

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "error creating key"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private doStore(Ljava/io/OutputStream;[CZZ)V
    .locals 20

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v7, p2

    move/from16 v1, p4

    if-nez v1, :cond_0

    .line 13
    invoke-direct/range {p0 .. p0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->syncFriendlyName()V

    .line 15
    :cond_0
    iget-object v2, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 18
    invoke-virtual {v2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->size()I

    move-result v2

    const-string v9, "BER"

    const/4 v3, 0x0

    const-string v4, "Error encoding certificate: "

    const-string v10, "DER"

    if-nez v2, :cond_3

    if-nez v7, :cond_4

    .line 32
    iget-object v2, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 35
    invoke-virtual {v2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v2

    .line 38
    new-instance v5, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 41
    invoke-direct {v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 44
    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 50
    :try_start_0
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v6

    .line 53
    check-cast v6, Ljava/lang/String;

    .line 55
    iget-object v7, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 58
    invoke-virtual {v7, v6}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    .line 61
    check-cast v7, Ljava/security/cert/Certificate;

    .line 64
    invoke-direct {v8, v6, v7, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createSafeBag(Ljava/lang/String;Ljava/security/cert/Certificate;Z)Lorg/bouncycastle/asn1/pkcs/SafeBag;

    move-result-object v6

    .line 68
    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 72
    new-instance v1, Ljava/io/IOException;

    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    .line 77
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 92
    throw v1

    .line 94
    :cond_1
    new-instance v1, Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    .line 96
    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->data:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz p3, :cond_2

    .line 100
    new-instance v4, Lorg/bouncycastle/asn1/DEROctetString;

    .line 102
    new-instance v6, Lorg/bouncycastle/asn1/DERSequence;

    .line 105
    invoke-direct {v6, v5}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 108
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v5

    .line 112
    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    .line 115
    invoke-direct {v1, v2, v4}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 117
    new-instance v4, Lorg/bouncycastle/asn1/pkcs/Pfx;

    .line 119
    new-instance v5, Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    .line 121
    new-instance v6, Lorg/bouncycastle/asn1/DEROctetString;

    .line 123
    new-instance v7, Lorg/bouncycastle/asn1/DERSequence;

    .line 126
    invoke-direct {v7, v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 129
    invoke-virtual {v7}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v1

    .line 133
    invoke-direct {v6, v1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    .line 136
    invoke-direct {v5, v2, v6}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 139
    invoke-direct {v4, v5, v3}, Lorg/bouncycastle/asn1/pkcs/Pfx;-><init>(Lorg/bouncycastle/asn1/pkcs/ContentInfo;Lorg/bouncycastle/asn1/pkcs/MacData;)V

    .line 142
    invoke-virtual {v4, v0, v10}, Lorg/bouncycastle/asn1/ASN1Object;->encodeTo(Ljava/io/OutputStream;Ljava/lang/String;)V

    return-void

    .line 145
    :cond_2
    new-instance v4, Lorg/bouncycastle/asn1/BEROctetString;

    .line 147
    new-instance v6, Lorg/bouncycastle/asn1/BERSequence;

    .line 150
    invoke-direct {v6, v5}, Lorg/bouncycastle/asn1/BERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 153
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v5

    .line 157
    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/BEROctetString;-><init>([B)V

    .line 160
    invoke-direct {v1, v2, v4}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 162
    new-instance v4, Lorg/bouncycastle/asn1/pkcs/Pfx;

    .line 164
    new-instance v5, Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    .line 166
    new-instance v6, Lorg/bouncycastle/asn1/BEROctetString;

    .line 168
    new-instance v7, Lorg/bouncycastle/asn1/BERSequence;

    .line 171
    invoke-direct {v7, v1}, Lorg/bouncycastle/asn1/BERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 174
    invoke-virtual {v7}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v1

    .line 178
    invoke-direct {v6, v1}, Lorg/bouncycastle/asn1/BEROctetString;-><init>([B)V

    .line 181
    invoke-direct {v5, v2, v6}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 184
    invoke-direct {v4, v5, v3}, Lorg/bouncycastle/asn1/pkcs/Pfx;-><init>(Lorg/bouncycastle/asn1/pkcs/ContentInfo;Lorg/bouncycastle/asn1/pkcs/MacData;)V

    .line 187
    invoke-virtual {v4, v0, v9}, Lorg/bouncycastle/asn1/ASN1Object;->encodeTo(Ljava/io/OutputStream;Ljava/lang/String;)V

    return-void

    :cond_3
    if-eqz v7, :cond_1f

    .line 192
    :cond_4
    new-instance v2, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 195
    invoke-direct {v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 197
    iget-object v3, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 200
    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v3

    .line 204
    :goto_1
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    const/16 v6, 0x14

    if-eqz v5, :cond_c

    new-array v5, v6, [B

    .line 213
    iget-object v6, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->random:Ljava/security/SecureRandom;

    .line 216
    invoke-virtual {v6, v5}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 219
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v6

    .line 222
    check-cast v6, Ljava/lang/String;

    .line 224
    iget-object v11, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 227
    invoke-virtual {v11, v6}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    .line 230
    check-cast v11, Ljava/security/PrivateKey;

    .line 232
    iget-object v12, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 235
    invoke-static {v12}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->isPBKDF2(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 240
    new-instance v12, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;

    .line 244
    iget-object v13, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 247
    invoke-static {v13}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->getKeyLength(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)I

    move-result v13

    .line 252
    new-instance v14, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 254
    sget-object v15, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_hmacWithSHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v16, v3

    .line 258
    sget-object v3, Lorg/bouncycastle/asn1/DERNull;->INSTANCE:Lorg/bouncycastle/asn1/DERNull;

    .line 261
    invoke-direct {v14, v15, v3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    const v3, 0xc800

    .line 267
    invoke-direct {v12, v5, v3, v13, v14}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;-><init>([BIILorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)V

    .line 269
    new-instance v3, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;

    .line 271
    iget-object v5, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 274
    invoke-direct {v8, v5}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->getAlgParams(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v13

    .line 278
    invoke-direct {v3, v5, v13}, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 280
    new-instance v5, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 282
    sget-object v13, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_PBES2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 284
    new-instance v14, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;

    .line 286
    new-instance v15, Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;

    move-object/from16 v17, v9

    .line 290
    sget-object v9, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_PBKDF2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 293
    invoke-direct {v15, v9, v12}, Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 296
    invoke-direct {v14, v15, v3}, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;-><init>(Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;)V

    .line 299
    invoke-direct {v5, v13, v14}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 302
    invoke-virtual {v8, v3, v11, v12, v7}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->wrapKey(Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;Ljava/security/Key;Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;[C)[B

    move-result-object v3

    goto :goto_2

    :cond_5
    move-object/from16 v16, v3

    move-object/from16 v17, v9

    .line 314
    new-instance v3, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;

    const v9, 0xc800

    .line 320
    invoke-direct {v3, v5, v9}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;-><init>([BI)V

    .line 322
    iget-object v5, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 325
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v5

    .line 329
    invoke-virtual {v8, v5, v11, v3, v7}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->wrapKey(Ljava/lang/String;Ljava/security/Key;Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;[C)[B

    move-result-object v5

    .line 332
    new-instance v9, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 334
    iget-object v12, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 337
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v3

    .line 341
    invoke-direct {v9, v12, v3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    move-object v3, v5

    move-object v5, v9

    .line 344
    :goto_2
    new-instance v9, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    .line 347
    invoke-direct {v9, v5, v3}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    .line 349
    new-instance v3, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 352
    invoke-direct {v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 354
    instance-of v5, v11, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v5, :cond_9

    .line 358
    check-cast v11, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 360
    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 363
    invoke-interface {v11, v5}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v12

    .line 366
    check-cast v12, Lorg/bouncycastle/asn1/ASN1BMPString;

    if-eqz v1, :cond_7

    if-eqz v12, :cond_6

    .line 373
    invoke-virtual {v12}, Lorg/bouncycastle/asn1/ASN1BMPString;->getString()Ljava/lang/String;

    move-result-object v12

    .line 377
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    .line 382
    :cond_6
    new-instance v12, Lorg/bouncycastle/asn1/DERBMPString;

    .line 385
    invoke-direct {v12, v6}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    .line 388
    invoke-interface {v11, v5, v12}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->setBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 390
    :cond_7
    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 393
    invoke-interface {v11, v5}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v12

    if-nez v12, :cond_8

    .line 399
    invoke-virtual {v8, v6}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v12

    .line 403
    invoke-virtual {v12}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v12

    .line 407
    invoke-direct {v8, v12}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createSubjectKeyId(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v12

    .line 411
    invoke-interface {v11, v5, v12}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->setBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 414
    :cond_8
    invoke-interface {v11}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttributeKeys()Ljava/util/Enumeration;

    move-result-object v5

    const/4 v12, 0x0

    .line 419
    :goto_3
    invoke-interface {v5}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v13

    if-eqz v13, :cond_a

    .line 425
    invoke-interface {v5}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v12

    .line 428
    check-cast v12, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 430
    new-instance v13, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 433
    invoke-direct {v13}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 436
    invoke-virtual {v13, v12}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 438
    new-instance v14, Lorg/bouncycastle/asn1/DERSet;

    .line 441
    invoke-interface {v11, v12}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v12

    .line 445
    invoke-direct {v14, v12}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 448
    invoke-virtual {v13, v14}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 450
    new-instance v12, Lorg/bouncycastle/asn1/DERSequence;

    .line 453
    invoke-direct {v12, v13}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 456
    invoke-virtual {v3, v12}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v12, 0x1

    goto :goto_3

    :cond_9
    const/4 v12, 0x0

    :cond_a
    if-nez v12, :cond_b

    .line 463
    new-instance v5, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 466
    invoke-direct {v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 469
    invoke-virtual {v8, v6}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v11

    .line 472
    sget-object v12, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 475
    invoke-virtual {v5, v12}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 477
    new-instance v12, Lorg/bouncycastle/asn1/DERSet;

    .line 480
    invoke-virtual {v11}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v11

    .line 484
    invoke-direct {v8, v11}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createSubjectKeyId(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v11

    .line 488
    invoke-direct {v12, v11}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 491
    invoke-virtual {v5, v12}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 493
    new-instance v11, Lorg/bouncycastle/asn1/DERSequence;

    .line 496
    invoke-direct {v11, v5}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 499
    invoke-virtual {v3, v11}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 501
    new-instance v5, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 504
    invoke-direct {v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 506
    sget-object v11, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 509
    invoke-virtual {v5, v11}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 511
    new-instance v11, Lorg/bouncycastle/asn1/DERSet;

    .line 513
    new-instance v12, Lorg/bouncycastle/asn1/DERBMPString;

    .line 516
    invoke-direct {v12, v6}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    .line 519
    invoke-direct {v11, v12}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 522
    invoke-virtual {v5, v11}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 524
    new-instance v6, Lorg/bouncycastle/asn1/DERSequence;

    .line 527
    invoke-direct {v6, v5}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 530
    invoke-virtual {v3, v6}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 532
    :cond_b
    new-instance v5, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    .line 534
    sget-object v6, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs8ShroudedKeyBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 537
    invoke-virtual {v9}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v9

    .line 540
    new-instance v11, Lorg/bouncycastle/asn1/DERSet;

    .line 543
    invoke-direct {v11, v3}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 546
    invoke-direct {v5, v6, v9, v11}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;Lorg/bouncycastle/asn1/ASN1Set;)V

    .line 549
    invoke-virtual {v2, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    move-object/from16 v3, v16

    move-object/from16 v9, v17

    goto/16 :goto_1

    :cond_c
    move-object/from16 v17, v9

    .line 564
    new-instance v3, Lorg/bouncycastle/asn1/DERSequence;

    .line 567
    invoke-direct {v3, v2}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 570
    invoke-virtual {v3, v10}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded(Ljava/lang/String;)[B

    move-result-object v2

    .line 573
    new-instance v12, Lorg/bouncycastle/asn1/BEROctetString;

    .line 576
    invoke-direct {v12, v2}, Lorg/bouncycastle/asn1/BEROctetString;-><init>([B)V

    new-array v2, v6, [B

    .line 580
    iget-object v3, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->random:Ljava/security/SecureRandom;

    .line 583
    invoke-virtual {v3, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 585
    new-instance v3, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 588
    invoke-direct {v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 590
    iget-object v5, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 593
    invoke-static {v5}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->isPBKDF2(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 598
    new-instance v5, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;

    .line 600
    iget-object v6, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 603
    invoke-static {v6}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->getKeyLength(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)I

    move-result v6

    .line 606
    new-instance v13, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 608
    sget-object v14, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_hmacWithSHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 610
    sget-object v15, Lorg/bouncycastle/asn1/DERNull;->INSTANCE:Lorg/bouncycastle/asn1/DERNull;

    .line 613
    invoke-direct {v13, v14, v15}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    const v14, 0xc800

    .line 619
    invoke-direct {v5, v2, v14, v6, v13}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;-><init>([BIILorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)V

    .line 621
    new-instance v2, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 623
    sget-object v6, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_PBES2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 625
    new-instance v13, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;

    .line 627
    new-instance v14, Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;

    .line 629
    sget-object v15, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_PBKDF2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 632
    invoke-direct {v14, v15, v5}, Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 634
    new-instance v5, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;

    .line 636
    iget-object v15, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 639
    invoke-direct {v8, v15}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->getAlgParams(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v9

    .line 643
    invoke-direct {v5, v15, v9}, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 646
    invoke-direct {v13, v14, v5}, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;-><init>(Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;)V

    .line 649
    invoke-direct {v2, v6, v13}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_4

    .line 652
    :cond_d
    new-instance v5, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;

    const v6, 0xc800

    .line 658
    invoke-direct {v5, v2, v6}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;-><init>([BI)V

    .line 660
    new-instance v2, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 662
    iget-object v6, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 665
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v5

    .line 669
    invoke-direct {v2, v6, v5}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    :goto_4
    move-object v9, v2

    .line 671
    new-instance v2, Ljava/util/Hashtable;

    .line 674
    invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V

    .line 676
    iget-object v5, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 679
    invoke-virtual {v5}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v5

    .line 683
    :goto_5
    invoke-interface {v5}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v6

    if-eqz v6, :cond_14

    .line 689
    :try_start_1
    invoke-interface {v5}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v6

    .line 692
    check-cast v6, Ljava/lang/String;

    .line 695
    invoke-virtual {v8, v6}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v13

    .line 698
    new-instance v14, Lorg/bouncycastle/asn1/pkcs/CertBag;

    .line 700
    sget-object v15, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->x509Certificate:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 702
    new-instance v11, Lorg/bouncycastle/asn1/DEROctetString;

    move-object/from16 v18, v5

    .line 707
    invoke-virtual {v13}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v5

    .line 711
    invoke-direct {v11, v5}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    .line 714
    invoke-direct {v14, v15, v11}, Lorg/bouncycastle/asn1/pkcs/CertBag;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 716
    new-instance v5, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 719
    invoke-direct {v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 721
    instance-of v11, v13, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v11, :cond_11

    .line 726
    move-object v11, v13

    check-cast v11, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 728
    sget-object v15, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 731
    invoke-interface {v11, v15}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v19

    .line 734
    check-cast v19, Lorg/bouncycastle/asn1/ASN1BMPString;

    if-eqz v1, :cond_f

    if-eqz v19, :cond_e

    .line 741
    invoke-virtual/range {v19 .. v19}, Lorg/bouncycastle/asn1/ASN1BMPString;->getString()Ljava/lang/String;

    move-result-object v7

    .line 745
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    .line 754
    :cond_e
    new-instance v7, Lorg/bouncycastle/asn1/DERBMPString;

    .line 757
    invoke-direct {v7, v6}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    .line 760
    invoke-interface {v11, v15, v7}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->setBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 762
    :cond_f
    sget-object v7, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 765
    invoke-interface {v11, v7}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v15

    if-nez v15, :cond_10

    .line 771
    invoke-virtual {v13}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v15

    .line 775
    invoke-direct {v8, v15}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createSubjectKeyId(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v15

    .line 779
    invoke-interface {v11, v7, v15}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->setBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 782
    :cond_10
    invoke-interface {v11}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttributeKeys()Ljava/util/Enumeration;

    move-result-object v7

    const/4 v15, 0x0

    .line 787
    :goto_6
    invoke-interface {v7}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v19

    if-eqz v19, :cond_12

    .line 793
    invoke-interface {v7}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v15

    .line 796
    check-cast v15, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-object/from16 v19, v7

    .line 800
    new-instance v7, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 803
    invoke-direct {v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 806
    invoke-virtual {v7, v15}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 810
    new-instance v0, Lorg/bouncycastle/asn1/DERSet;

    .line 813
    invoke-interface {v11, v15}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v15

    .line 817
    invoke-direct {v0, v15}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 820
    invoke-virtual {v7, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 822
    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    .line 825
    invoke-direct {v0, v7}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 828
    invoke-virtual {v5, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v15, 0x1

    move-object/from16 v0, p1

    move-object/from16 v7, v19

    goto :goto_6

    :cond_11
    const/4 v15, 0x0

    :cond_12
    if-nez v15, :cond_13

    .line 843
    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 846
    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 848
    sget-object v7, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 851
    invoke-virtual {v0, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 853
    new-instance v7, Lorg/bouncycastle/asn1/DERSet;

    .line 856
    invoke-virtual {v13}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v11

    .line 860
    invoke-direct {v8, v11}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createSubjectKeyId(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v11

    .line 864
    invoke-direct {v7, v11}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 867
    invoke-virtual {v0, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 869
    new-instance v7, Lorg/bouncycastle/asn1/DERSequence;

    .line 872
    invoke-direct {v7, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 875
    invoke-virtual {v5, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 877
    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 880
    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 882
    sget-object v7, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 885
    invoke-virtual {v0, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 887
    new-instance v7, Lorg/bouncycastle/asn1/DERSet;

    .line 889
    new-instance v11, Lorg/bouncycastle/asn1/DERBMPString;

    .line 892
    invoke-direct {v11, v6}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    .line 895
    invoke-direct {v7, v11}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 898
    invoke-virtual {v0, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 900
    new-instance v6, Lorg/bouncycastle/asn1/DERSequence;

    .line 903
    invoke-direct {v6, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 906
    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 908
    :cond_13
    new-instance v0, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    .line 910
    sget-object v6, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->certBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 913
    invoke-virtual {v14}, Lorg/bouncycastle/asn1/pkcs/CertBag;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v7

    .line 916
    new-instance v11, Lorg/bouncycastle/asn1/DERSet;

    .line 919
    invoke-direct {v11, v5}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 922
    invoke-direct {v0, v6, v7, v11}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;Lorg/bouncycastle/asn1/ASN1Set;)V

    .line 925
    invoke-virtual {v3, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 928
    invoke-virtual {v2, v13, v13}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v0, p1

    move-object/from16 v7, p2

    move-object/from16 v5, v18

    goto/16 :goto_5

    :catch_1
    move-exception v0

    .line 938
    new-instance v1, Ljava/io/IOException;

    .line 940
    new-instance v2, Ljava/lang/StringBuilder;

    .line 943
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 946
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 950
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 953
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 957
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 958
    throw v1

    .line 962
    :cond_14
    iget-object v0, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 965
    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    .line 969
    :goto_7
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_16

    .line 975
    :try_start_2
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    .line 978
    check-cast v5, Ljava/lang/String;

    .line 980
    iget-object v6, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 983
    invoke-virtual {v6, v5}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 986
    check-cast v6, Ljava/security/cert/Certificate;

    .line 988
    iget-object v7, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 991
    invoke-virtual {v7, v5}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_15

    goto :goto_7

    .line 998
    :cond_15
    invoke-direct {v8, v5, v6, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createSafeBag(Ljava/lang/String;Ljava/security/cert/Certificate;Z)Lorg/bouncycastle/asn1/pkcs/SafeBag;

    move-result-object v5

    .line 1002
    invoke-virtual {v3, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 1005
    invoke-virtual {v2, v6, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :catch_2
    move-exception v0

    .line 1009
    new-instance v1, Ljava/io/IOException;

    .line 1011
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1014
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1017
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1021
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1024
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1028
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1029
    throw v1

    .line 1032
    :cond_16
    invoke-direct/range {p0 .. p0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->getUsedCertificateSet()Ljava/util/Set;

    move-result-object v0

    .line 1035
    iget-object v1, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    .line 1038
    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    .line 1042
    :goto_8
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 1048
    :try_start_3
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    .line 1051
    check-cast v5, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;

    .line 1053
    iget-object v6, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    .line 1056
    invoke-virtual {v6, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 1059
    check-cast v5, Ljava/security/cert/Certificate;

    .line 1062
    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_17

    goto :goto_8

    .line 1069
    :cond_17
    invoke-virtual {v2, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_18

    goto :goto_8

    .line 1075
    :cond_18
    new-instance v6, Lorg/bouncycastle/asn1/pkcs/CertBag;

    .line 1077
    sget-object v7, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->x509Certificate:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 1079
    new-instance v11, Lorg/bouncycastle/asn1/DEROctetString;

    .line 1082
    invoke-virtual {v5}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v13

    .line 1086
    invoke-direct {v11, v13}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    .line 1089
    invoke-direct {v6, v7, v11}, Lorg/bouncycastle/asn1/pkcs/CertBag;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 1091
    new-instance v7, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 1094
    invoke-direct {v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1096
    instance-of v11, v5, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v11, :cond_1a

    .line 1100
    check-cast v5, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 1103
    invoke-interface {v5}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttributeKeys()Ljava/util/Enumeration;

    move-result-object v11

    .line 1107
    :goto_9
    invoke-interface {v11}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v13

    if-eqz v13, :cond_1a

    .line 1113
    invoke-interface {v11}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v13

    .line 1116
    check-cast v13, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 1118
    sget-object v14, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 1121
    invoke-virtual {v13, v14}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v14

    if-eqz v14, :cond_19

    goto :goto_9

    .line 1127
    :cond_19
    new-instance v14, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 1130
    invoke-direct {v14}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1133
    invoke-virtual {v14, v13}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 1135
    new-instance v15, Lorg/bouncycastle/asn1/DERSet;

    .line 1138
    invoke-interface {v5, v13}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v13

    .line 1142
    invoke-direct {v15, v13}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 1145
    invoke-virtual {v14, v15}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 1147
    new-instance v13, Lorg/bouncycastle/asn1/DERSequence;

    .line 1150
    invoke-direct {v13, v14}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 1153
    invoke-virtual {v7, v13}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_9

    .line 1158
    :cond_1a
    new-instance v5, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    .line 1160
    sget-object v11, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->certBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 1163
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/pkcs/CertBag;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v6

    .line 1166
    new-instance v13, Lorg/bouncycastle/asn1/DERSet;

    .line 1169
    invoke-direct {v13, v7}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 1172
    invoke-direct {v5, v11, v6, v13}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;Lorg/bouncycastle/asn1/ASN1Set;)V

    .line 1175
    invoke-virtual {v3, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V
    :try_end_3
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_8

    :catch_3
    move-exception v0

    .line 1179
    new-instance v1, Ljava/io/IOException;

    .line 1181
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1184
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1187
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1191
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1194
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1198
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1199
    throw v1

    .line 1201
    :cond_1b
    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    .line 1204
    invoke-direct {v0, v3}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 1207
    invoke-virtual {v0, v10}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded(Ljava/lang/String;)[B

    move-result-object v6

    const/4 v2, 0x1

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object v3, v9

    move-object/from16 v4, p2

    .line 1217
    invoke-virtual/range {v1 .. v6}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->cryptData(ZLorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[CZ[B)[B

    move-result-object v0

    .line 1220
    new-instance v1, Lorg/bouncycastle/asn1/pkcs/EncryptedData;

    .line 1222
    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->data:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 1224
    new-instance v3, Lorg/bouncycastle/asn1/BEROctetString;

    .line 1227
    invoke-direct {v3, v0}, Lorg/bouncycastle/asn1/BEROctetString;-><init>([B)V

    .line 1230
    invoke-direct {v1, v2, v9, v3}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 1232
    new-instance v0, Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    .line 1235
    invoke-direct {v0, v2, v12}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 1237
    new-instance v3, Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    .line 1239
    sget-object v4, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->encryptedData:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 1242
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v1

    .line 1246
    invoke-direct {v3, v4, v1}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    const/4 v4, 0x0

    aput-object v0, v1, v4

    const/4 v0, 0x1

    aput-object v3, v1, v0

    .line 1255
    new-instance v0, Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;

    .line 1258
    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;-><init>([Lorg/bouncycastle/asn1/pkcs/ContentInfo;)V

    if-eqz p3, :cond_1c

    move-object v1, v10

    goto :goto_a

    :cond_1c
    move-object/from16 v1, v17

    .line 1267
    :goto_a
    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded(Ljava/lang/String;)[B

    move-result-object v0

    .line 1270
    new-instance v9, Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    .line 1272
    new-instance v1, Lorg/bouncycastle/asn1/BEROctetString;

    .line 1275
    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/BEROctetString;-><init>([B)V

    .line 1278
    invoke-direct {v9, v2, v1}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 1280
    iget v0, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->saltLength:I

    .line 1282
    new-array v0, v0, [B

    .line 1284
    iget-object v1, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->random:Ljava/security/SecureRandom;

    .line 1287
    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 1290
    invoke-virtual {v9}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContent()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    .line 1293
    check-cast v1, Lorg/bouncycastle/asn1/ASN1OctetString;

    .line 1296
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v7

    .line 1299
    iget-object v1, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyAlgorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 1301
    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes256_GCM:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 1304
    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v1

    if-eqz v1, :cond_1d

    const/4 v0, 0x0

    goto :goto_b

    .line 1311
    :cond_1d
    :try_start_4
    iget-object v1, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->macAlgorithm:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 1314
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    .line 1317
    iget v4, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->itCount:I

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object v3, v0

    move-object/from16 v5, p2

    .line 1323
    invoke-direct/range {v1 .. v7}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->calculatePbeMac(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[BI[CZ[B)[B

    move-result-object v1

    .line 1326
    new-instance v2, Lorg/bouncycastle/asn1/x509/DigestInfo;

    .line 1328
    iget-object v3, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->macAlgorithm:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 1331
    invoke-direct {v2, v3, v1}, Lorg/bouncycastle/asn1/x509/DigestInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    .line 1333
    new-instance v1, Lorg/bouncycastle/asn1/pkcs/MacData;

    .line 1335
    iget v3, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->itCount:I

    .line 1338
    invoke-direct {v1, v2, v0, v3}, Lorg/bouncycastle/asn1/pkcs/MacData;-><init>(Lorg/bouncycastle/asn1/x509/DigestInfo;[BI)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    move-object v0, v1

    .line 1340
    :goto_b
    new-instance v1, Lorg/bouncycastle/asn1/pkcs/Pfx;

    .line 1343
    invoke-direct {v1, v9, v0}, Lorg/bouncycastle/asn1/pkcs/Pfx;-><init>(Lorg/bouncycastle/asn1/pkcs/ContentInfo;Lorg/bouncycastle/asn1/pkcs/MacData;)V

    if-eqz p3, :cond_1e

    move-object/from16 v0, p1

    move-object v9, v10

    goto :goto_c

    :cond_1e
    move-object/from16 v0, p1

    move-object/from16 v9, v17

    .line 1352
    :goto_c
    invoke-virtual {v1, v0, v9}, Lorg/bouncycastle/asn1/ASN1Object;->encodeTo(Ljava/io/OutputStream;Ljava/lang/String;)V

    return-void

    :catch_4
    move-exception v0

    .line 1356
    new-instance v1, Ljava/io/IOException;

    .line 1358
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error constructing MAC: "

    .line 1363
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1f
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "no password supplied for PKCS#12 KeyStore"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getAlgParams(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Primitive;
    .locals 2

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes128_CBC:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    const/16 v1, 0x10

    if-nez v0, :cond_3

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes256_CBC:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes128_GCM:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes256_GCM:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unknown encryption OID in getAlgParams()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    const/16 p1, 0xc

    new-array p1, p1, [B

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->random:Ljava/security/SecureRandom;

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v0, Lorg/bouncycastle/internal/asn1/cms/GCMParameters;

    invoke-direct {v0, p1, v1}, Lorg/bouncycastle/internal/asn1/cms/GCMParameters;-><init>([BI)V

    invoke-virtual {v0}, Lorg/bouncycastle/internal/asn1/cms/GCMParameters;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    new-array p1, v1, [B

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->random:Ljava/security/SecureRandom;

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v0, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    return-object v0
.end method

.method public static getDigest(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)[B
    .locals 4

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/util/DigestFactory;->createSHA1()Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getPublicKeyData()Lorg/bouncycastle/asn1/ASN1BitString;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1BitString;->getBytes()[B

    move-result-object p0

    array-length v2, p0

    const/4 v3, 0x0

    invoke-interface {v0, p0, v3, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {v0, v1, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    return-object v1
.end method

.method public static getKeyLength(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)I
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes256_CBC:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes256_GCM:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p0, 0x10

    return p0

    :cond_1
    :goto_0
    const/16 p0, 0x20

    return p0
.end method

.method public static getPrf(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;
    .locals 2

    .line 2
    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_hmacWithSHA256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 5
    invoke-virtual {v0, p0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    new-instance p0, Lorg/bouncycastle/crypto/digests/SHA256Digest;

    .line 13
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/SHA256Digest;-><init>()V

    return-object p0

    .line 16
    :cond_0
    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_hmacWithSHA512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 19
    invoke-virtual {v0, p0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    new-instance p0, Lorg/bouncycastle/crypto/digests/SHA512Digest;

    .line 27
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/SHA512Digest;-><init>()V

    return-object p0

    .line 30
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown prf id "

    .line 0
    invoke-static {v1, p0}, Ll/ۡܽܳ;->֫(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getUsedCertificateSet()Ljava/util/Set;
    .locals 5

    .line 0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineGetCertificateChain(Ljava/lang/String;)[Ljava/security/cert/Certificate;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    array-length v4, v2

    if-eq v3, v4, :cond_0

    aget-object v4, v2, v3

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public static isPBKDF2(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Z
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes256_CBC:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes256_GCM:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes128_CBC:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_aes128_GCM:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private processKeyBag(Lorg/bouncycastle/asn1/pkcs/SafeBag;)V
    .locals 8

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagValue()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->getPrivateKey(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)Ljava/security/PrivateKey;

    move-result-object v0

    instance-of v1, v0, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    move-object v1, v0

    check-cast v1, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagAttributes()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Set;->getObjects()Ljava/util/Enumeration;

    move-result-object p1

    move-object v3, v2

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v6

    invoke-static {v6}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    invoke-static {v4}, Lorg/bouncycastle/asn1/ASN1Set;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1Set;->size()I

    move-result v7

    if-lez v7, :cond_0

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1Set;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/asn1/ASN1Primitive;

    invoke-interface {v1, v6}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-interface {v5}, Lorg/bouncycastle/asn1/ASN1Encodable;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v5

    invoke-virtual {v5, v4}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "attempt to add existing attribute with different value"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-interface {v1, v6, v4}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->setBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    :goto_1
    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v6, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_3

    check-cast v4, Lorg/bouncycastle/asn1/ASN1BMPString;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1BMPString;->getString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v4, v2, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v6, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v3, v4

    check-cast v3, Lorg/bouncycastle/asn1/ASN1OctetString;

    goto :goto_0

    :cond_4
    move-object p1, v2

    move-object v2, v3

    goto :goto_2

    :cond_5
    move-object p1, v2

    :goto_2
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/util/encoders/Hex;->encode([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    if-nez p1, :cond_6

    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {p1, v1, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_6
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->localIds:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private processShroudedKeyBag(Lorg/bouncycastle/asn1/pkcs/SafeBag;[CZ)Z
    .locals 8

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagValue()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->getEncryptionAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->getEncryptedData()[B

    move-result-object v0

    invoke-virtual {p0, v1, v0, p2, p3}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->unwrapKey(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B[CZ)Ljava/security/PrivateKey;

    move-result-object p2

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagAttributes()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p3, :cond_7

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagAttributes()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Set;->getObjects()Ljava/util/Enumeration;

    move-result-object p1

    move-object p3, v2

    move-object v3, p3

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v4, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v5

    check-cast v5, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1Set;->size()I

    move-result v6

    if-lez v6, :cond_3

    invoke-virtual {v4, v1}, Lorg/bouncycastle/asn1/ASN1Set;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/asn1/ASN1Primitive;

    instance-of v6, p2, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v6, :cond_4

    move-object v6, p2

    check-cast v6, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-interface {v6, v5}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-interface {v7}, Lorg/bouncycastle/asn1/ASN1Encodable;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v6

    invoke-virtual {v6, v4}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "attempt to add existing attribute with different value"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-interface {v6, v5, v4}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->setBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_1

    :cond_3
    move-object v4, v2

    :cond_4
    :goto_1
    sget-object v6, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v6

    if-eqz v6, :cond_5

    check-cast v4, Lorg/bouncycastle/asn1/ASN1BMPString;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1BMPString;->getString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v4, v3, p2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    sget-object v6, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object p3, v4

    check-cast p3, Lorg/bouncycastle/asn1/ASN1OctetString;

    goto :goto_0

    :cond_6
    move-object v2, p3

    goto :goto_2

    :cond_7
    move-object v3, v2

    :goto_2
    if-eqz v2, :cond_9

    new-instance p1, Ljava/lang/String;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object p3

    invoke-static {p3}, Lorg/bouncycastle/util/encoders/Hex;->encode([B)[B

    move-result-object p3

    invoke-direct {p1, p3}, Ljava/lang/String;-><init>([B)V

    if-nez v3, :cond_8

    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {p3, p1, p2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_8
    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->localIds:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {p2, v3, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_3
    return v1

    :cond_9
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    const-string p3, "unmarked"

    invoke-virtual {p1, p3, p2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return v0
.end method

.method private syncFriendlyName()V
    .locals 5

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v2, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/PrivateKey;

    instance-of v3, v2, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    sget-object v4, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v3, v4}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3, v2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v2, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->remove(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v2, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    instance-of v3, v2, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    sget-object v4, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v3, v4}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3, v2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v2, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->remove(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    instance-of v3, v2, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v3, :cond_4

    move-object v3, v2

    check-cast v3, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    sget-object v4, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v3, v4}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    iget-object v4, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    return-void
.end method

.method private validateIterationCount(Ljava/math/BigInteger;)I
    .locals 4

    .line 3
    invoke-static {p1}, Lorg/bouncycastle/util/BigIntegers;->intValueExact(Ljava/math/BigInteger;)I

    move-result p1

    if-ltz p1, :cond_2

    const-string v0, "org.bouncycastle.pkcs12.max_it_count"

    .line 11
    invoke-static {v0}, Lorg/bouncycastle/util/Properties;->asBigInteger(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 17
    invoke-static {v0}, Lorg/bouncycastle/util/BigIntegers;->intValueExact(Ljava/math/BigInteger;)I

    move-result v1

    if-lt v1, p1, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "iteration count "

    const-string v3, " greater than "

    .line 0
    invoke-static {p1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {v0}, Lorg/bouncycastle/util/BigIntegers;->intValueExact(Ljava/math/BigInteger;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "negative iteration count found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public cryptData(ZLorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[CZ[B)[B
    .locals 3

    .line 3
    invoke-virtual {p2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    .line 11
    :goto_0
    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_12PbeIds:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 14
    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->on(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Z

    move-result v1

    const-string v2, "exception decrypting data - "

    if-eqz v1, :cond_1

    .line 22
    invoke-virtual {p2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p2

    .line 26
    invoke-static {p2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;

    move-result-object p2

    .line 29
    new-instance v1, Lorg/bouncycastle/jcajce/PKCS12Key;

    .line 32
    invoke-direct {v1, p3, p4}, Lorg/bouncycastle/jcajce/PKCS12Key;-><init>([CZ)V

    .line 34
    :try_start_0
    new-instance p3, Ljavax/crypto/spec/PBEParameterSpec;

    .line 37
    invoke-virtual {p2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->getIV()[B

    move-result-object p4

    .line 41
    invoke-virtual {p2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->getIterations()Ljava/math/BigInteger;

    move-result-object p2

    .line 45
    invoke-static {p2}, Lorg/bouncycastle/util/BigIntegers;->intValueExact(Ljava/math/BigInteger;)I

    move-result p2

    .line 49
    invoke-direct {p3, p4, p2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    .line 51
    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    .line 54
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object p4

    .line 58
    invoke-interface {p2, p4}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createCipher(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p2

    .line 62
    invoke-virtual {p2, p1, v1, p3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 65
    invoke-virtual {p2, p5}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/PKCS12Key;->getPassword()[C

    move-result-object p2

    .line 73
    invoke-static {p2}, Lorg/bouncycastle/util/Arrays;->clear([C)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 79
    :try_start_1
    new-instance p2, Ljava/io/IOException;

    .line 81
    new-instance p3, Ljava/lang/StringBuilder;

    .line 84
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 91
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 98
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 99
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    :goto_1
    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/PKCS12Key;->getPassword()[C

    move-result-object p2

    .line 106
    invoke-static {p2}, Lorg/bouncycastle/util/Arrays;->clear([C)V

    .line 107
    throw p1

    .line 109
    :cond_1
    sget-object p4, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_PBES2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 112
    invoke-virtual {v0, p4}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 118
    :try_start_2
    invoke-direct {p0, p1, p3, p2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createCipher(I[CLorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)Ljavax/crypto/Cipher;

    move-result-object p1

    .line 122
    invoke-virtual {p1, p5}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    .line 127
    new-instance p2, Ljava/io/IOException;

    .line 129
    new-instance p3, Ljava/lang/StringBuilder;

    .line 132
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p3}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "unknown PBE algorithm: "

    invoke-static {p2, v0}, Ll/ۡܽܳ;->֫(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineAliases()Ljava/util/Enumeration;
    .locals 4

    .line 0
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "cert"

    invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "key"

    invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public engineContainsAlias(Ljava/lang/String;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public engineDeleteEntry(Ljava/lang/String;)V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    new-instance v2, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-direct {v2, p0, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;Ljava/security/PublicKey;)V

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Key;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->localIds:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/Certificate;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    new-instance v1, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;Ljava/security/PublicKey;)V

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;
    .locals 1

    if-eqz p1, :cond_2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->localIds:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {p1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/security/cert/Certificate;

    return-object p1

    :cond_1
    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "null alias passed to getCertificate."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineGetCertificateAlias(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->elements()Ljava/util/Enumeration;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v3

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :cond_2
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v3

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public engineGetCertificateChain(Ljava/lang/String;)[Ljava/security/cert/Certificate;
    .locals 8

    if-eqz p1, :cond_8

    .line 0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineIsKeyEntry(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    :goto_0
    if-eqz p1, :cond_6

    move-object v2, p1

    check-cast v2, Ljava/security/cert/X509Certificate;

    sget-object v3, Lorg/bouncycastle/asn1/x509/Extension;->authorityKeyIdentifier:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/security/cert/X509Extension;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/x509/AuthorityKeyIdentifier;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AuthorityKeyIdentifier;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/AuthorityKeyIdentifier;->getKeyIdentifierOctets()[B

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v4, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    new-instance v5, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;

    invoke-direct {v5, p0, v3}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;[B)V

    invoke-virtual {v4, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/Certificate;

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-nez v3, :cond_3

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v4

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/security/Principal;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v5, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    invoke-virtual {v5}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v5

    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v6, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    invoke-interface {v5}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/security/cert/X509Certificate;

    invoke-virtual {v6}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v7

    invoke-interface {v7, v4}, Ljava/security/Principal;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    :try_start_0
    invoke-virtual {v6}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/security/cert/Certificate;->verify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v6

    goto :goto_3

    :catch_0
    nop

    goto :goto_2

    :cond_3
    :goto_3
    invoke-virtual {v0, p1}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    if-eq v3, p1, :cond_5

    move-object p1, v3

    goto :goto_0

    :cond_5
    :goto_4
    move-object p1, v1

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result p1

    new-array v1, p1, [Ljava/security/cert/Certificate;

    const/4 v2, 0x0

    :goto_5
    if-eq v2, p1, :cond_7

    invoke-virtual {v0, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/Certificate;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_7
    return-object v1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "null alias passed to getCertificateChain."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineGetCreationDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    if-eqz p1, :cond_1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "alias == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineGetKey(Ljava/lang/String;[C)Ljava/security/Key;
    .locals 0

    if-eqz p1, :cond_0

    .line 0
    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {p2, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/Key;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null alias passed to getKey."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineIsCertificateEntry(Ljava/lang/String;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public engineIsKeyEntry(Ljava/lang/String;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public engineLoad(Ljava/io/InputStream;[C)V
    .locals 16

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v9, p2

    if-nez v0, :cond_0

    goto/16 :goto_e

    :cond_0
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->read()I

    move-result v0

    if-ltz v0, :cond_24

    const/16 v2, 0x30

    if-ne v0, v2, :cond_23

    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->reset()V

    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    :try_start_0
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->readObject()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/pkcs/Pfx;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/Pfx;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/Pfx;->getAuthSafe()Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    move-result-object v10

    new-instance v11, Ljava/util/Vector;

    invoke-direct {v11}, Ljava/util/Vector;-><init>()V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/Pfx;->getMacData()Lorg/bouncycastle/asn1/pkcs/MacData;

    move-result-object v1

    if-eqz v1, :cond_5

    if-eqz v9, :cond_4

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/Pfx;->getMacData()Lorg/bouncycastle/asn1/pkcs/MacData;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/MacData;->getMac()Lorg/bouncycastle/asn1/x509/DigestInfo;

    move-result-object v12

    invoke-virtual {v12}, Lorg/bouncycastle/asn1/x509/DigestInfo;->getAlgorithmId()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    iput-object v1, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->macAlgorithm:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/MacData;->getSalt()[B

    move-result-object v13

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/MacData;->getIterationCount()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v8, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->validateIterationCount(Ljava/math/BigInteger;)I

    move-result v0

    iput v0, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->itCount:I

    array-length v0, v13

    iput v0, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->saltLength:I

    invoke-virtual {v10}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContent()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v0

    :try_start_1
    iget-object v1, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->macAlgorithm:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    iget v4, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->itCount:I

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object v3, v13

    move-object/from16 v5, p2

    move-object v7, v0

    invoke-direct/range {v1 .. v7}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->calculatePbeMac(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[BI[CZ[B)[B

    move-result-object v1

    invoke-virtual {v12}, Lorg/bouncycastle/asn1/x509/DigestInfo;->getDigest()[B

    move-result-object v12

    invoke-static {v1, v12}, Lorg/bouncycastle/util/Arrays;->constantTimeAreEqual([B[B)Z

    move-result v1

    if-nez v1, :cond_3

    array-length v1, v9
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v14, "PKCS12 key store mac invalid"

    const-string v15, "PKCS12 key store mac invalid - wrong password or corrupted file"

    if-gtz v1, :cond_2

    :try_start_2
    iget-object v1, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->macAlgorithm:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    iget v4, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->itCount:I

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move-object v3, v13

    move-object/from16 v5, p2

    move-object v7, v0

    invoke-direct/range {v1 .. v7}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->calculatePbeMac(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;[BI[CZ[B)[B

    move-result-object v0

    invoke-static {v0, v12}, Lorg/bouncycastle/util/Arrays;->constantTimeAreEqual([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/security/UnrecoverableKeyException;

    invoke-direct {v0, v14}, Ljava/security/UnrecoverableKeyException;-><init>(Ljava/lang/String;)V

    invoke-static {v15, v0}, Lorg/bouncycastle/util/Exceptions;->ioException(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_2
    new-instance v0, Ljava/security/UnrecoverableKeyException;

    invoke-direct {v0, v14}, Ljava/security/UnrecoverableKeyException;-><init>(Ljava/lang/String;)V

    invoke-static {v15, v0}, Lorg/bouncycastle/util/Exceptions;->ioException(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    const/4 v7, 0x0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error constructing MAC: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_1
    move-exception v0

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "no password supplied when one expected"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v7, 0x1

    :goto_1
    new-instance v1, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    const/4 v12, 0x0

    invoke-direct {v1, v12}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$1;)V

    iput-object v1, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    new-instance v1, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-direct {v1, v12}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$1;)V

    iput-object v1, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->localIds:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v10}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContentType()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->data:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v10}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContent()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;->getContentInfo()[Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    move-result-object v10

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_2
    array-length v2, v10

    if-eq v13, v2, :cond_11

    aget-object v2, v10, v13

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContentType()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    sget-object v3, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->data:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_9

    aget-object v2, v10, v13

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContent()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v2

    const/4 v3, 0x0

    :goto_3
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v4

    if-eq v3, v4, :cond_f

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    invoke-static {v4}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/SafeBag;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v5

    sget-object v6, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs8ShroudedKeyBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-direct {v8, v4, v9, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->processShroudedKeyBag(Lorg/bouncycastle/asn1/pkcs/SafeBag;[CZ)Z

    move-result v1

    const/4 v4, 0x0

    move v14, v1

    const/4 v1, 0x0

    goto :goto_4

    :cond_6
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v5

    sget-object v6, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->certBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v11, v4}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v5

    sget-object v6, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->keyBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-direct {v8, v4}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->processKeyBag(Lorg/bouncycastle/asn1/pkcs/SafeBag;)V

    goto :goto_4

    :cond_8
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v15, "extra in data "

    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v15

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {v4}, Lorg/bouncycastle/asn1/util/ASN1Dump;->dumpAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_9
    aget-object v2, v10, v13

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContentType()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    sget-object v3, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->encryptedData:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_e

    aget-object v1, v10, v13

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContent()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/EncryptedData;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;->getEncryptionAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v3

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;->getContent()Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v6

    const/4 v2, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p2

    move v5, v0

    invoke-virtual/range {v1 .. v6}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->cryptData(ZLorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[CZ[B)[B

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    :goto_5
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v3

    if-eq v2, v3, :cond_d

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/SafeBag;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->certBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v11, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs8ShroudedKeyBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-direct {v8, v3, v9, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->processShroudedKeyBag(Lorg/bouncycastle/asn1/pkcs/SafeBag;[CZ)Z

    move-result v3

    move v14, v3

    goto :goto_6

    :cond_b
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->keyBag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-direct {v8, v3}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->processKeyBag(Lorg/bouncycastle/asn1/pkcs/SafeBag;)V

    goto :goto_6

    :cond_c
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "extra in encryptedData "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {v3}, Lorg/bouncycastle/asn1/util/ASN1Dump;->dumpAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_d
    const/4 v1, 0x0

    goto :goto_7

    :cond_e
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "extra "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v5, v10, v13

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContentType()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v4, v10, v13

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->getContent()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    invoke-static {v4}, Lorg/bouncycastle/asn1/util/ASN1Dump;->dumpAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_f
    :goto_7
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_2

    :cond_10
    const/4 v1, 0x1

    const/4 v14, 0x0

    :cond_11
    new-instance v0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-direct {v0, v12}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$1;)V

    iput-object v0, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    const/4 v0, 0x0

    :goto_8
    invoke-virtual {v11}, Ljava/util/Vector;->size()I

    move-result v2

    if-eq v0, v2, :cond_20

    invoke-virtual {v11, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagValue()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/pkcs/CertBag;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/CertBag;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/CertBag;->getCertId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->x509Certificate:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v4

    if-eqz v4, :cond_1f

    :try_start_3
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/CertBag;->getCertValue()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    check-cast v3, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iget-object v3, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certFact:Ljava/security/cert/CertificateFactory;

    invoke-virtual {v3, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagAttributes()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v4

    if-eqz v4, :cond_1a

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->getBagAttributes()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Set;->getObjects()Ljava/util/Enumeration;

    move-result-object v2

    move-object v4, v12

    :goto_9
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v10

    invoke-static {v10}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v10

    const/4 v13, 0x1

    invoke-virtual {v5, v13}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v5

    invoke-static {v5}, Lorg/bouncycastle/asn1/ASN1Set;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ASN1Set;->size()I

    move-result v13

    if-lez v13, :cond_18

    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1Set;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v6

    check-cast v6, Lorg/bouncycastle/asn1/ASN1Primitive;

    instance-of v13, v3, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v13, :cond_16

    move-object v13, v3

    check-cast v13, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-interface {v13, v10}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->getBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v15

    if-eqz v15, :cond_14

    sget-object v5, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v10, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_12

    move-object v5, v6

    check-cast v5, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v5

    invoke-static {v5}, Lorg/bouncycastle/util/encoders/Hex;->toHexString([B)Ljava/lang/String;

    move-result-object v5

    iget-object v13, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-static {v13}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->access$200(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;)Ljava/util/Hashtable;

    move-result-object v13

    invoke-virtual {v13, v5}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_12

    iget-object v13, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->localIds:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-static {v13}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->access$200(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;)Ljava/util/Hashtable;

    move-result-object v13

    invoke-virtual {v13, v5}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_9

    :cond_12
    invoke-interface {v15}, Lorg/bouncycastle/asn1/ASN1Encodable;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v5

    invoke-virtual {v5, v6}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_a

    :cond_13
    new-instance v0, Ljava/io/IOException;

    const-string v1, "attempt to add existing attribute with different value"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ASN1Set;->size()I

    move-result v15

    move-object/from16 p1, v2

    const/4 v2, 0x1

    if-le v15, v2, :cond_15

    invoke-interface {v13, v10, v5}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->setBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_b

    :cond_15
    invoke-interface {v13, v10, v6}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->setBagAttribute(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_b

    :cond_16
    :goto_a
    move-object/from16 p1, v2

    :goto_b
    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_friendlyName:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v10, v2}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_17

    check-cast v6, Lorg/bouncycastle/asn1/ASN1BMPString;

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1BMPString;->getString()Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    goto :goto_c

    :cond_17
    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_9_at_localKeyId:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v10, v2}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_19

    check-cast v6, Lorg/bouncycastle/asn1/ASN1OctetString;

    move-object v12, v6

    goto :goto_c

    :cond_18
    move-object/from16 p1, v2

    :cond_19
    :goto_c
    move-object/from16 v2, p1

    goto/16 :goto_9

    :cond_1a
    const/4 v12, 0x0

    const/4 v4, 0x0

    :cond_1b
    iget-object v2, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    new-instance v5, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v6

    invoke-direct {v5, v8, v6}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;Ljava/security/PublicKey;)V

    invoke-virtual {v2, v5, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v14, :cond_1c

    iget-object v2, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v2}, Ljava/util/Hashtable;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1e

    new-instance v2, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v4

    invoke-direct {v8, v4}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createSubjectKeyId(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;->getKeyIdentifier()[B

    move-result-object v4

    invoke-static {v4}, Lorg/bouncycastle/util/encoders/Hex;->encode([B)[B

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/String;-><init>([B)V

    iget-object v4, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v4, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    const-string v4, "unmarked"

    invoke-virtual {v3, v4}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_d

    :cond_1c
    if-eqz v12, :cond_1d

    new-instance v2, Ljava/lang/String;

    invoke-virtual {v12}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v5

    invoke-static {v5}, Lorg/bouncycastle/util/encoders/Hex;->encode([B)[B

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/lang/String;-><init>([B)V

    iget-object v5, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keyCerts:Ljava/util/Hashtable;

    invoke-virtual {v5, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1d
    if-eqz v4, :cond_1e

    iget-object v2, v8, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v2, v4, v3}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1e
    :goto_d
    add-int/lit8 v0, v0, 0x1

    const/4 v12, 0x0

    goto/16 :goto_8

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1f
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported certificate type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/CertBag;->getCertId()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    if-eqz v7, :cond_22

    if-eqz v1, :cond_22

    if-eqz v9, :cond_22

    array-length v0, v9

    if-eqz v0, :cond_22

    const-string v0, "org.bouncycastle.pkcs12.ignore_useless_passwd"

    invoke-static {v0}, Lorg/bouncycastle/util/Properties;->isOverrideSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    goto :goto_e

    :cond_21
    new-instance v0, Ljava/io/IOException;

    const-string v1, "password supplied for keystore that does not require one"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    :goto_e
    return-void

    :catch_3
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_23
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream does not represent a PKCS12 key store"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "no data in keystore stream"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public engineLoad(Ljava/security/KeyStore$LoadStoreParameter;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 0
    invoke-virtual {p0, p1, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineLoad(Ljava/io/InputStream;[C)V

    return-void

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/jcajce/BCLoadStoreParameter;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/jcajce/BCLoadStoreParameter;

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/BCLoadStoreParameter;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/keystore/util/ParameterUtil;->extractPassword(Ljava/security/KeyStore$LoadStoreParameter;)[C

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineLoad(Ljava/io/InputStream;[C)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "no support for \'param\' of type "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public engineProbe(Ljava/io/InputStream;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public engineSetCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 5
    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 10
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    .line 13
    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    .line 17
    new-instance v0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;

    .line 20
    invoke-virtual {p2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    .line 24
    invoke-direct {v0, p0, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;Ljava/security/PublicKey;)V

    .line 27
    invoke-virtual {p1, v0, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 30
    :cond_0
    new-instance p2, Ljava/security/KeyStoreException;

    const-string v0, "There is a key entry with the name "

    const-string v1, "."

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public engineSetKeyEntry(Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V
    .locals 1

    .line 0
    instance-of p3, p2, Ljava/security/PrivateKey;

    if-eqz p3, :cond_3

    if-eqz p4, :cond_2

    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {p3, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->engineDeleteEntry(Ljava/lang/String;)V

    :cond_0
    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {p3, p1, p2}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p4, :cond_1

    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    const/4 p3, 0x0

    aget-object v0, p4, p3

    invoke-virtual {p2, p1, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->put(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    array-length p1, p4

    if-eq p3, p1, :cond_1

    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->chainCerts:Ljava/util/Hashtable;

    new-instance p2, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;

    aget-object v0, p4, p3

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-direct {p2, p0, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$CertId;-><init>(Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;Ljava/security/PublicKey;)V

    aget-object v0, p4, p3

    invoke-virtual {p1, p2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/security/KeyStoreException;

    const-string p2, "no certificate chain for private key"

    invoke-direct {p1, p2}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/KeyStoreException;

    const-string p2, "PKCS12 does not support non-PrivateKeys"

    invoke-direct {p1, p2}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSetKeyEntry(Ljava/lang/String;[B[Ljava/security/cert/Certificate;)V
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "operation not supported"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSize()I
    .locals 4

    .line 0
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->certs:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "cert"

    invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->keys:Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi$IgnoresCaseHashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "key"

    invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    return v0
.end method

.method public engineStore(Ljava/io/OutputStream;[C)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 0
    invoke-direct {p0, p1, p2, v0, v1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->doStore(Ljava/io/OutputStream;[CZZ)V

    return-void
.end method

.method public engineStore(Ljava/security/KeyStore$LoadStoreParameter;)V
    .locals 5

    if-eqz p1, :cond_5

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/jcajce/PKCS12StoreParameter;

    if-nez v0, :cond_1

    instance-of v1, p1, Lorg/bouncycastle/jce/provider/JDKPKCS12StoreParameter;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "No support for \'param\' of type "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/jcajce/PKCS12StoreParameter;

    goto :goto_1

    :cond_2
    new-instance v0, Lorg/bouncycastle/jcajce/PKCS12StoreParameter;

    move-object v1, p1

    check-cast v1, Lorg/bouncycastle/jce/provider/JDKPKCS12StoreParameter;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12StoreParameter;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-interface {p1}, Ljava/security/KeyStore$LoadStoreParameter;->getProtectionParameter()Ljava/security/KeyStore$ProtectionParameter;

    move-result-object v3

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12StoreParameter;->isUseDEREncoding()Z

    move-result v4

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12StoreParameter;->isOverwriteFriendlyName()Z

    move-result v1

    invoke-direct {v0, v2, v3, v4, v1}, Lorg/bouncycastle/jcajce/PKCS12StoreParameter;-><init>(Ljava/io/OutputStream;Ljava/security/KeyStore$ProtectionParameter;ZZ)V

    :goto_1
    invoke-interface {p1}, Ljava/security/KeyStore$LoadStoreParameter;->getProtectionParameter()Ljava/security/KeyStore$ProtectionParameter;

    move-result-object p1

    if-nez p1, :cond_3

    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    instance-of v1, p1, Ljava/security/KeyStore$PasswordProtection;

    if-eqz v1, :cond_4

    check-cast p1, Ljava/security/KeyStore$PasswordProtection;

    invoke-virtual {p1}, Ljava/security/KeyStore$PasswordProtection;->getPassword()[C

    move-result-object p1

    :goto_2
    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/PKCS12StoreParameter;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/PKCS12StoreParameter;->isForDEREncoding()Z

    move-result v2

    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/PKCS12StoreParameter;->isOverwriteFriendlyName()Z

    move-result v0

    invoke-direct {p0, v1, p1, v2, v0}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->doStore(Ljava/io/OutputStream;[CZZ)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "No support for protection parameter of type "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'param\' arg cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setRandom(Ljava/security/SecureRandom;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->random:Ljava/security/SecureRandom;

    return-void
.end method

.method public unwrapKey(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B[CZ)Ljava/security/PrivateKey;
    .locals 6

    .line 3
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 6
    :try_start_0
    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->pkcs_12PbeIds:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 9
    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->on(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Z

    move-result v1
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x2

    const-string v3, ""

    const/4 v4, 0x4

    if-eqz v1, :cond_0

    .line 19
    :try_start_1
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p1

    .line 23
    invoke-static {p1}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;

    move-result-object p1

    .line 26
    new-instance v1, Ljavax/crypto/spec/PBEParameterSpec;

    .line 29
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->getIV()[B

    move-result-object v5

    .line 33
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->getIterations()Ljava/math/BigInteger;

    move-result-object p1

    .line 37
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->validateIterationCount(Ljava/math/BigInteger;)I

    move-result p1

    .line 41
    invoke-direct {v1, v5, p1}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    .line 43
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    .line 46
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-interface {p1, v0}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createCipher(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p1

    .line 53
    new-instance v0, Lorg/bouncycastle/jcajce/PKCS12Key;

    .line 56
    invoke-direct {v0, p3, p4}, Lorg/bouncycastle/jcajce/PKCS12Key;-><init>([CZ)V

    .line 59
    invoke-virtual {p1, v4, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    goto :goto_0

    .line 72
    :cond_0
    sget-object p4, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_PBES2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 75
    invoke-virtual {v0, p4}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result p4

    if-eqz p4, :cond_1

    .line 81
    invoke-direct {p0, v4, p3, p1}, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->createCipher(I[CLorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)Ljavax/crypto/Cipher;

    move-result-object p1

    .line 62
    :goto_0
    invoke-virtual {p1, p2, v3, v2}, Ljavax/crypto/Cipher;->unwrap([BLjava/lang/String;I)Ljava/security/Key;

    move-result-object p1

    .line 65
    check-cast p1, Ljava/security/PrivateKey;
    :try_end_1
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    .line 85
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "exception unwrapping private key - cannot recognise: "

    .line 0
    invoke-static {p2, v0}, Ll/ۡܽܳ;->֫(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "exception unwrapping private key: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lorg/bouncycastle/util/Exceptions;->ioException(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "exception unwrapping private key:"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/security/UnrecoverableKeyException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/security/UnrecoverableKeyException;-><init>(Ljava/lang/String;)V

    invoke-static {p2, p3}, Lorg/bouncycastle/util/Exceptions;->ioException(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method public wrapKey(Ljava/lang/String;Ljava/security/Key;Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;[C)[B
    .locals 3

    new-instance v0, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v0, p4}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    :try_start_0
    iget-object p4, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    invoke-interface {p4, p1}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createSecretKeyFactory(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object p4

    new-instance v1, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->getIV()[B

    move-result-object v2

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->getIterations()Ljava/math/BigInteger;

    move-result-object p3

    invoke-static {p3}, Lorg/bouncycastle/util/BigIntegers;->intValueExact(Ljava/math/BigInteger;)I

    move-result p3

    invoke-direct {v1, v2, p3}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    invoke-interface {p3, p1}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createCipher(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p1

    invoke-virtual {p4, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object p3

    const/4 p4, 0x3

    invoke-virtual {p1, p4, p3, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {p1, p2}, Ljavax/crypto/Cipher;->wrap(Ljava/security/Key;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "exception encrypting data - "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p3}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public wrapKey(Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;Ljava/security/Key;Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;[C)[B
    .locals 3

    new-instance v0, Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getSalt()[B

    move-result-object v1

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getIterationCount()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/util/BigIntegers;->intValueExact(Ljava/math/BigInteger;)I

    move-result v2

    invoke-virtual {p3}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;->getKeyLength()Ljava/math/BigInteger;

    move-result-object p3

    invoke-static {p3}, Lorg/bouncycastle/util/BigIntegers;->intValueExact(Ljava/math/BigInteger;)I

    move-result p3

    mul-int/lit8 p3, p3, 0x8

    invoke-direct {v0, p4, v1, v2, p3}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    :try_start_0
    iget-object p3, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    const-string p4, "PBKDF2withHMacSHA256"

    invoke-interface {p3, p4}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createSecretKeyFactory(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object p3

    iget-object p4, p0, Lorg/bouncycastle/jcajce/provider/keystore/pkcs12/PKCS12KeyStoreSpi;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p4, v1}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createCipher(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p4

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p1

    invoke-interface {p1}, Lorg/bouncycastle/asn1/ASN1Encodable;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/security/AlgorithmParameters;->init([B)V

    invoke-virtual {p3, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object p1

    const/4 p3, 0x3

    invoke-virtual {p4, p3, p1, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/AlgorithmParameters;)V

    invoke-virtual {p4, p2}, Ljavax/crypto/Cipher;->wrap(Ljava/security/Key;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "exception encrypting data - "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p3}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
