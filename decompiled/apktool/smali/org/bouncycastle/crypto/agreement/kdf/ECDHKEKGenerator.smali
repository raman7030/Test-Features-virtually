.class public Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/DigestDerivationFunction;


# instance fields
.field public algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public kdf:Lorg/bouncycastle/crypto/DigestDerivationFunction;

.field public keySize:I

.field public z:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/Digest;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/generators/KDF2BytesGenerator;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/generators/KDF2BytesGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->kdf:Lorg/bouncycastle/crypto/DigestDerivationFunction;

    return-void
.end method


# virtual methods
.method public generateBytes([BII)I
    .locals 5

    add-int v0, p2, p3

    .line 3
    array-length v1, p1

    if-gt v0, v1, :cond_0

    .line 7
    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 10
    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 12
    new-instance v1, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 14
    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 16
    sget-object v3, Lorg/bouncycastle/asn1/DERNull;->INSTANCE:Lorg/bouncycastle/asn1/DERNull;

    .line 19
    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 22
    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 24
    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    .line 26
    new-instance v2, Lorg/bouncycastle/asn1/DEROctetString;

    .line 28
    iget v3, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->keySize:I

    .line 31
    invoke-static {v3}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I)[B

    move-result-object v3

    .line 35
    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    const/4 v3, 0x1

    const/4 v4, 0x2

    .line 40
    invoke-direct {v1, v3, v4, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 43
    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 45
    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->kdf:Lorg/bouncycastle/crypto/DigestDerivationFunction;

    .line 47
    new-instance v2, Lorg/bouncycastle/crypto/params/KDFParameters;

    .line 49
    iget-object v3, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->z:[B

    .line 51
    new-instance v4, Lorg/bouncycastle/asn1/DERSequence;

    .line 54
    invoke-direct {v4, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    const-string v0, "DER"

    .line 59
    invoke-virtual {v4, v0}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded(Ljava/lang/String;)[B

    move-result-object v0

    .line 63
    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/crypto/params/KDFParameters;-><init>([B[B)V

    .line 66
    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->kdf:Lorg/bouncycastle/crypto/DigestDerivationFunction;

    .line 71
    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    move-result p1

    return p1

    :catch_0
    move-exception p1

    .line 76
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 78
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "unable to initialise kdf: "

    .line 83
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p3}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    new-instance p1, Lorg/bouncycastle/crypto/DataLengthException;

    const-string p2, "output buffer too small"

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getDigest()Lorg/bouncycastle/crypto/Digest;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->kdf:Lorg/bouncycastle/crypto/DigestDerivationFunction;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/DigestDerivationFunction;->getDigest()Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    return-object v0
.end method

.method public init(Lorg/bouncycastle/crypto/DerivationParameters;)V
    .locals 1

    .line 0
    check-cast p1, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getKeySize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->keySize:I

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getZ()[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->z:[B

    return-void
.end method
