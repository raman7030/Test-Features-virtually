.class public Lorg/bouncycastle/crypto/util/OpenSSHPrivateKeyUtil;
.super Ljava/lang/Object;


# static fields
.field public static final AUTH_MAGIC:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "openssh-key-v1\u0000"

    .line 0
    invoke-static {v0}, Lorg/bouncycastle/util/Strings;->toByteArray(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/util/OpenSSHPrivateKeyUtil;->AUTH_MAGIC:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static allIntegers(Lorg/bouncycastle/asn1/ASN1Sequence;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 0
    :goto_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v2

    instance-of v2, v2, Lorg/bouncycastle/asn1/ASN1Integer;

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static encodePrivateKey(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)[B
    .locals 5

    if-eqz p0, :cond_4

    .line 4
    instance-of v0, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;

    if-eqz v0, :cond_0

    .line 9
    invoke-static {p0}, Lorg/bouncycastle/crypto/util/PrivateKeyInfoFactory;->createPrivateKeyInfo(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->parsePrivateKey()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    .line 17
    invoke-interface {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object p0

    return-object p0

    .line 25
    :cond_0
    instance-of v0, p0, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    if-eqz v0, :cond_1

    .line 30
    invoke-static {p0}, Lorg/bouncycastle/crypto/util/PrivateKeyInfoFactory;->createPrivateKeyInfo(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object p0

    .line 34
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->parsePrivateKey()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    .line 38
    invoke-interface {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p0

    .line 42
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object p0

    return-object p0

    .line 46
    :cond_1
    instance-of v0, p0, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;

    if-eqz v0, :cond_2

    .line 50
    check-cast p0, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;

    .line 53
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/params/DSAKeyParameters;->getParameters()Lorg/bouncycastle/crypto/params/DSAParameters;

    move-result-object v0

    .line 56
    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 59
    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 61
    new-instance v2, Lorg/bouncycastle/asn1/ASN1Integer;

    const-wide/16 v3, 0x0

    .line 66
    invoke-direct {v2, v3, v4}, Lorg/bouncycastle/asn1/ASN1Integer;-><init>(J)V

    .line 69
    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 71
    new-instance v2, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 74
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/DSAParameters;->getP()Ljava/math/BigInteger;

    move-result-object v3

    .line 78
    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    .line 81
    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 83
    new-instance v2, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 86
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/DSAParameters;->getQ()Ljava/math/BigInteger;

    move-result-object v3

    .line 90
    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    .line 93
    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 95
    new-instance v2, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 98
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/DSAParameters;->getG()Ljava/math/BigInteger;

    move-result-object v3

    .line 102
    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    .line 105
    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 108
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/DSAParameters;->getG()Ljava/math/BigInteger;

    move-result-object v2

    .line 112
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;->getX()Ljava/math/BigInteger;

    move-result-object v3

    .line 116
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/DSAParameters;->getP()Ljava/math/BigInteger;

    move-result-object v0

    .line 120
    invoke-virtual {v2, v3, v0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 123
    new-instance v2, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 126
    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    .line 129
    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 131
    new-instance v0, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 134
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;->getX()Ljava/math/BigInteger;

    move-result-object p0

    .line 138
    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    .line 141
    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 143
    :try_start_0
    new-instance p0, Lorg/bouncycastle/asn1/DERSequence;

    .line 146
    invoke-direct {p0, v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 149
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 154
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 156
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to encode DSAPrivateKeyParameters "

    .line 161
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    instance-of v0, p0, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;

    if-eqz v0, :cond_3

    check-cast p0, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;->generatePublicKey()Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/util/SSHBuilder;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/util/SSHBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/crypto/util/OpenSSHPrivateKeyUtil;->AUTH_MAGIC:[B

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeBytes([B)V

    const-string v2, "none"

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeString(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeString(Ljava/lang/String;)V

    const-string v2, ""

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeString(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lorg/bouncycastle/crypto/util/SSHBuilder;->u32(I)V

    invoke-static {v0}, Lorg/bouncycastle/crypto/util/OpenSSHPublicKeyUtil;->encodePublicKey(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeBlock([B)V

    new-instance v3, Lorg/bouncycastle/crypto/util/SSHBuilder;

    invoke-direct {v3}, Lorg/bouncycastle/crypto/util/SSHBuilder;-><init>()V

    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Random;->nextInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lorg/bouncycastle/crypto/util/SSHBuilder;->u32(I)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/crypto/util/SSHBuilder;->u32(I)V

    const-string v4, "ssh-ed25519"

    invoke-virtual {v3, v4}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeBlock([B)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;->getEncoded()[B

    move-result-object p0

    invoke-static {p0, v0}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object p0

    invoke-virtual {v3, p0}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeBlock([B)V

    invoke-virtual {v3, v2}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeString(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/util/SSHBuilder;->getPaddedBytes()[B

    move-result-object p0

    invoke-virtual {v1, p0}, Lorg/bouncycastle/crypto/util/SSHBuilder;->writeBlock([B)V

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuilder;->getBytes()[B

    move-result-object p0

    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to convert "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " to openssh private key"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "param is null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static parsePrivateKeyBlob([B)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 14

    const/4 v0, 0x0

    .line 3
    aget-byte v1, p0, v0

    const/16 v2, 0x30

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_3

    .line 12
    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object p0

    .line 16
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v1

    const/4 v2, 0x6

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-ne v1, v2, :cond_0

    .line 25
    invoke-static {p0}, Lorg/bouncycastle/crypto/util/OpenSSHPrivateKeyUtil;->allIntegers(Lorg/bouncycastle/asn1/ASN1Sequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 31
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    .line 34
    check-cast v0, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 37
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Integer;->getPositiveValue()Ljava/math/BigInteger;

    move-result-object v0

    .line 40
    sget-object v1, Lorg/bouncycastle/util/BigIntegers;->ZERO:Ljava/math/BigInteger;

    .line 43
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 48
    new-instance v4, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;

    const/4 v0, 0x5

    .line 52
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    .line 55
    check-cast v0, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 58
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Integer;->getPositiveValue()Ljava/math/BigInteger;

    move-result-object v0

    .line 61
    new-instance v1, Lorg/bouncycastle/crypto/params/DSAParameters;

    .line 64
    invoke-virtual {p0, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v2

    .line 67
    check-cast v2, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 70
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Integer;->getPositiveValue()Ljava/math/BigInteger;

    move-result-object v2

    .line 74
    invoke-virtual {p0, v6}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    .line 77
    check-cast v3, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 80
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1Integer;->getPositiveValue()Ljava/math/BigInteger;

    move-result-object v3

    .line 84
    invoke-virtual {p0, v5}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    .line 87
    check-cast p0, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 90
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Integer;->getPositiveValue()Ljava/math/BigInteger;

    move-result-object p0

    .line 94
    invoke-direct {v1, v2, v3, p0}, Lorg/bouncycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 97
    invoke-direct {v4, v0, v1}, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DSAParameters;)V

    goto/16 :goto_2

    .line 102
    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v1

    const/16 v2, 0x9

    if-ne v1, v2, :cond_1

    .line 110
    invoke-static {p0}, Lorg/bouncycastle/crypto/util/OpenSSHPrivateKeyUtil;->allIntegers(Lorg/bouncycastle/asn1/ASN1Sequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 116
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    .line 119
    check-cast v0, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 122
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Integer;->getPositiveValue()Ljava/math/BigInteger;

    move-result-object v0

    .line 125
    sget-object v1, Lorg/bouncycastle/util/BigIntegers;->ZERO:Ljava/math/BigInteger;

    .line 128
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 134
    invoke-static {p0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;

    move-result-object p0

    .line 137
    new-instance v9, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;

    .line 140
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    .line 144
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v2

    .line 148
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;->getPrivateExponent()Ljava/math/BigInteger;

    move-result-object v3

    .line 152
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;->getPrime1()Ljava/math/BigInteger;

    move-result-object v4

    .line 156
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;->getPrime2()Ljava/math/BigInteger;

    move-result-object v5

    .line 160
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;->getExponent1()Ljava/math/BigInteger;

    move-result-object v6

    .line 164
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;->getExponent2()Ljava/math/BigInteger;

    move-result-object v7

    .line 168
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKey;->getCoefficient()Ljava/math/BigInteger;

    move-result-object v8

    move-object v0, v9

    .line 172
    invoke-direct/range {v0 .. v8}, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    move-object v4, v9

    goto/16 :goto_2

    .line 178
    :cond_1
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_a

    .line 185
    invoke-virtual {p0, v5}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    .line 188
    instance-of v0, v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_a

    .line 193
    invoke-virtual {p0, v6}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    .line 196
    instance-of v0, v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_a

    .line 201
    invoke-static {p0}, Lorg/bouncycastle/asn1/sec/ECPrivateKey;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/sec/ECPrivateKey;

    move-result-object p0

    .line 205
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/sec/ECPrivateKey;->getParametersObject()Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Object;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 213
    invoke-static {v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x9/X962Parameters;

    move-result-object v0

    .line 217
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;->isNamedCurve()Z

    move-result v1

    .line 221
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;->getParameters()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v0

    if-eqz v1, :cond_2

    .line 227
    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 231
    invoke-static {v0}, Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;->lookup(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;

    move-result-object v0

    goto :goto_0

    .line 236
    :cond_2
    invoke-static {v0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    .line 239
    new-instance v1, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    .line 242
    invoke-direct {v1, v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/asn1/x9/X9ECParameters;)V

    move-object v0, v1

    .line 246
    :goto_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/sec/ECPrivateKey;->getKey()Ljava/math/BigInteger;

    move-result-object p0

    .line 249
    new-instance v4, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    .line 252
    invoke-direct {v4, p0, v0}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    goto/16 :goto_2

    .line 256
    :cond_3
    new-instance v1, Lorg/bouncycastle/crypto/util/SSHBuffer;

    .line 258
    sget-object v2, Lorg/bouncycastle/crypto/util/OpenSSHPrivateKeyUtil;->AUTH_MAGIC:[B

    .line 261
    invoke-direct {v1, v2, p0}, Lorg/bouncycastle/crypto/util/SSHBuffer;-><init>([B[B)V

    .line 264
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "none"

    .line 270
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_10

    .line 276
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->skipBlock()V

    .line 279
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->skipBlock()V

    .line 282
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readU32()I

    move-result p0

    if-ne p0, v3, :cond_f

    .line 288
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object p0

    .line 292
    invoke-static {p0}, Lorg/bouncycastle/crypto/util/OpenSSHPublicKeyUtil;->parsePublicKey([B)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    .line 295
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readPaddedBlock()[B

    move-result-object p0

    .line 299
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_e

    .line 304
    new-instance v1, Lorg/bouncycastle/crypto/util/SSHBuffer;

    .line 307
    invoke-direct {v1, p0}, Lorg/bouncycastle/crypto/util/SSHBuffer;-><init>([B)V

    .line 310
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readU32()I

    move-result p0

    .line 314
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readU32()I

    move-result v2

    if-ne p0, v2, :cond_d

    .line 320
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "ssh-ed25519"

    .line 326
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 332
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    .line 335
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object p0

    .line 337
    array-length v2, p0

    const/16 v3, 0x40

    if-ne v2, v3, :cond_4

    .line 343
    new-instance v2, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;

    .line 346
    invoke-direct {v2, p0, v0}, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;-><init>([BI)V

    move-object v4, v2

    goto/16 :goto_1

    .line 350
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "private key value of wrong length"

    .line 355
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 356
    throw p0

    :cond_5
    const-string v0, "ecdsa"

    .line 361
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 367
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object v0

    .line 371
    invoke-static {v0}, Lorg/bouncycastle/util/Strings;->fromByteArray([B)Ljava/lang/String;

    move-result-object v0

    .line 375
    invoke-static {v0}, Lorg/bouncycastle/crypto/util/SSHNamedCurves;->getByName(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 381
    invoke-static {v0}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->getByOID(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 387
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    .line 390
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object v2

    .line 393
    new-instance v4, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    .line 395
    new-instance v5, Ljava/math/BigInteger;

    .line 398
    invoke-direct {v5, v3, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 400
    new-instance v2, Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;

    .line 403
    invoke-direct {v2, v0, p0}, Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParameters;)V

    .line 406
    invoke-direct {v4, v5, v2}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    goto :goto_1

    .line 409
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "Curve not found for: "

    .line 0
    invoke-static {v1, v0}, Ll/ۡܽܳ;->֫(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OID not found for: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    const-string v0, "ssh-rsa"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_9

    new-instance v6, Ljava/math/BigInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object p0

    invoke-direct {v6, v3, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v7, Ljava/math/BigInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object p0

    invoke-direct {v7, v3, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v8, Ljava/math/BigInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object p0

    invoke-direct {v8, v3, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v13, Ljava/math/BigInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object p0

    invoke-direct {v13, v3, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v9, Ljava/math/BigInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object p0

    invoke-direct {v9, v3, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v10, Ljava/math/BigInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->readBlock()[B

    move-result-object p0

    invoke-direct {v10, v3, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    sget-object p0, Lorg/bouncycastle/util/BigIntegers;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v9, p0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v10, p0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v8, v0}, Ljava/math/BigInteger;->remainder(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    invoke-virtual {v8, p0}, Ljava/math/BigInteger;->remainder(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v12

    new-instance p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;

    move-object v5, p0

    invoke-direct/range {v5 .. v13}, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    move-object v4, p0

    :cond_9
    :goto_1
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->skipBlock()V

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/util/SSHBuffer;->hasRemaining()Z

    move-result p0

    if-nez p0, :cond_c

    :cond_a
    :goto_2
    if-eqz v4, :cond_b

    return-object v4

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "unable to parse key"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "private key block has trailing data"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "private key check values are not the same"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "decoded key has trailing data"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "multiple keys not supported"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "encrypted keys not supported"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
