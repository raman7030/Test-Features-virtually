.class public Lorg/bouncycastle/pqc/crypto/lms/DigestUtil;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;
    .locals 2

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Lorg/bouncycastle/crypto/digests/SHA256Digest;

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/SHA256Digest;-><init>()V

    return-object p0

    :cond_0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_shake256_len:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v0, 0x100

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unrecognized digest OID: "

    .line 0
    invoke-static {v1, p0}, Ll/ۡܽܳ;->֫(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;I)Lorg/bouncycastle/crypto/Digest;
    .locals 2

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/DigestUtil;->createDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_shake256_len:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, p0}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result p0

    if-eq p0, p1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    new-instance p0, Lorg/bouncycastle/pqc/crypto/lms/DigestUtil$WrapperDigest;

    invoke-direct {p0, v0, p1}, Lorg/bouncycastle/pqc/crypto/lms/DigestUtil$WrapperDigest;-><init>(Lorg/bouncycastle/crypto/Digest;I)V

    return-object p0
.end method

.method public static getDigest(Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;)Lorg/bouncycastle/crypto/Digest;
    .locals 1

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->getDigestOID()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->getN()I

    move-result p0

    invoke-static {v0, p0}, Lorg/bouncycastle/pqc/crypto/lms/DigestUtil;->createDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;I)Lorg/bouncycastle/crypto/Digest;

    move-result-object p0

    return-object p0
.end method

.method public static getDigest(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;)Lorg/bouncycastle/crypto/Digest;
    .locals 1

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->getDigestOID()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->getM()I

    move-result p0

    invoke-static {v0, p0}, Lorg/bouncycastle/pqc/crypto/lms/DigestUtil;->createDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;I)Lorg/bouncycastle/crypto/Digest;

    move-result-object p0

    return-object p0
.end method
