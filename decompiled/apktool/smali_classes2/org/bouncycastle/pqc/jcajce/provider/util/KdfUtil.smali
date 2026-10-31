.class public Lorg/bouncycastle/pqc/jcajce/provider/util/KdfUtil;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

.method public static makeKeyBytes(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B[BI)[B
    .locals 6

    add-int/lit8 p3, p3, 0x7

    .line 0
    div-int/lit8 p3, p3, 0x8

    new-array v0, p3, [B

    const/4 v1, 0x0

    if-nez p0, :cond_0

    invoke-static {p1, v1, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_0
    sget-object v2, Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;->id_kdf_kdf2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object p0

    new-instance v2, Lorg/bouncycastle/crypto/generators/KDF2BytesGenerator;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/pqc/jcajce/provider/util/KdfUtil;->getDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;

    move-result-object p0

    invoke-direct {v2, p0}, Lorg/bouncycastle/crypto/generators/KDF2BytesGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    new-instance p0, Lorg/bouncycastle/crypto/params/KDFParameters;

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/params/KDFParameters;-><init>([B[B)V

    invoke-interface {v2, p0}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    invoke-interface {v2, v0, v1, p3}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    return-object v0

    :cond_1
    sget-object v2, Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;->id_kdf_kdf3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object p0

    new-instance v2, Lorg/bouncycastle/crypto/agreement/kdf/ConcatenationKDFGenerator;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/pqc/jcajce/provider/util/KdfUtil;->getDigest(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;

    move-result-object p0

    invoke-direct {v2, p0}, Lorg/bouncycastle/crypto/agreement/kdf/ConcatenationKDFGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    new-instance p0, Lorg/bouncycastle/crypto/params/KDFParameters;

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/params/KDFParameters;-><init>([B[B)V

    invoke-interface {v2, p0}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    invoke-interface {v2, v0, v1, p3}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    return-object v0

    :cond_2
    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_alg_hkdf_with_sha256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    const-string v3, "HDKF parameter support not added"

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    if-nez p0, :cond_3

    new-instance p0, Lorg/bouncycastle/crypto/generators/HKDFBytesGenerator;

    new-instance v2, Lorg/bouncycastle/crypto/digests/SHA256Digest;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct {p0, v2}, Lorg/bouncycastle/crypto/generators/HKDFBytesGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    new-instance v2, Lorg/bouncycastle/crypto/params/HKDFParameters;

    invoke-direct {v2, p1, v4, p2}, Lorg/bouncycastle/crypto/params/HKDFParameters;-><init>([B[B[B)V

    invoke-interface {p0, v2}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    invoke-interface {p0, v0, v1, p3}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    return-object v0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_alg_hkdf_with_sha384:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    if-nez p0, :cond_5

    new-instance p0, Lorg/bouncycastle/crypto/generators/HKDFBytesGenerator;

    new-instance v2, Lorg/bouncycastle/crypto/digests/SHA384Digest;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/digests/SHA384Digest;-><init>()V

    invoke-direct {p0, v2}, Lorg/bouncycastle/crypto/generators/HKDFBytesGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    new-instance v2, Lorg/bouncycastle/crypto/params/HKDFParameters;

    invoke-direct {v2, p1, v4, p2}, Lorg/bouncycastle/crypto/params/HKDFParameters;-><init>([B[B[B)V

    invoke-interface {p0, v2}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    invoke-interface {p0, v0, v1, p3}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    return-object v0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_alg_hkdf_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    if-nez p0, :cond_7

    new-instance p0, Lorg/bouncycastle/crypto/generators/HKDFBytesGenerator;

    new-instance v2, Lorg/bouncycastle/crypto/digests/SHA512Digest;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/digests/SHA512Digest;-><init>()V

    invoke-direct {p0, v2}, Lorg/bouncycastle/crypto/generators/HKDFBytesGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    new-instance v2, Lorg/bouncycastle/crypto/params/HKDFParameters;

    invoke-direct {v2, p1, v4, p2}, Lorg/bouncycastle/crypto/params/HKDFParameters;-><init>([B[B[B)V

    invoke-interface {p0, v2}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    invoke-interface {p0, v0, v1, p3}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    return-object v0

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_Kmac128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_a

    new-array v2, v1, [B

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v2

    :cond_9
    new-instance p0, Lorg/bouncycastle/crypto/macs/KMAC;

    const/16 v3, 0x80

    invoke-direct {p0, v3, v2}, Lorg/bouncycastle/crypto/macs/KMAC;-><init>(I[B)V

    new-instance v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    array-length v3, p1

    invoke-direct {v2, p1, v1, v3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-virtual {p0, v2}, Lorg/bouncycastle/crypto/macs/KMAC;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    array-length p1, p2

    invoke-virtual {p0, p2, v1, p1}, Lorg/bouncycastle/crypto/macs/KMAC;->update([BII)V

    invoke-virtual {p0, v0, v1, p3}, Lorg/bouncycastle/crypto/macs/KMAC;->doFinal([BII)I

    return-object v0

    :cond_a
    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_Kmac256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    const/16 v3, 0x100

    if-eqz v2, :cond_c

    new-array v2, v1, [B

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v2

    :cond_b
    new-instance p0, Lorg/bouncycastle/crypto/macs/KMAC;

    invoke-direct {p0, v3, v2}, Lorg/bouncycastle/crypto/macs/KMAC;-><init>(I[B)V

    new-instance v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    array-length v3, p1

    invoke-direct {v2, p1, v1, v3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-virtual {p0, v2}, Lorg/bouncycastle/crypto/macs/KMAC;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    array-length p1, p2

    invoke-virtual {p0, p2, v1, p1}, Lorg/bouncycastle/crypto/macs/KMAC;->update([BII)V

    invoke-virtual {p0, v0, v1, p3}, Lorg/bouncycastle/crypto/macs/KMAC;->doFinal([BII)I

    return-object v0

    :cond_c
    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_shake256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    invoke-virtual {v2, v4}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v2

    if-eqz v2, :cond_d

    new-instance p0, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-direct {p0, v3}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    array-length v2, p1

    invoke-interface {p0, p1, v1, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    array-length p1, p2

    invoke-interface {p0, p2, v1, p1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {p0, v0, v1, p3}, Lorg/bouncycastle/crypto/Xof;->doFinal([BII)I

    return-object v0

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Unrecognized KDF: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static makeKeyBytes(Lorg/bouncycastle/jcajce/spec/KEMKDFSpec;[B)[B
    .locals 2

    if-nez p0, :cond_0

    .line 0
    :try_start_0
    array-length p0, p1

    new-array v0, p0, [B

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/spec/KEMKDFSpec;->getKdfAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/spec/KEMKDFSpec;->getOtherInfo()[B

    move-result-object v1

    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/spec/KEMKDFSpec;->getKeySize()I

    move-result p0

    invoke-static {v0, p1, v1, p0}, Lorg/bouncycastle/pqc/jcajce/provider/util/KdfUtil;->makeKeyBytes(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B[BI)[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {p1}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-static {p1}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    throw p0
.end method
