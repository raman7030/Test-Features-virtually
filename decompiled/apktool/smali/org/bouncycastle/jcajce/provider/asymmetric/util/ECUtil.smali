.class public Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertMidTerms([I)[I
    .locals 7

    const/4 v0, 0x3

    new-array v1, v0, [I

    .line 0
    array-length v2, p0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    aget p0, p0, v3

    aput p0, v1, v3

    return-object v1

    :cond_0
    array-length v2, p0

    if-ne v2, v0, :cond_6

    aget v0, p0, v3

    aget v2, p0, v4

    const/4 v5, 0x2

    if-ge v0, v2, :cond_2

    aget v6, p0, v5

    if-ge v0, v6, :cond_2

    aput v0, v1, v3

    if-ge v2, v6, :cond_1

    aput v2, v1, v4

    aput v6, v1, v5

    return-object v1

    :cond_1
    aput v6, v1, v4

    aget p0, p0, v4

    aput p0, v1, v5

    return-object v1

    :cond_2
    aget v0, p0, v5

    if-ge v2, v0, :cond_4

    aput v2, v1, v3

    aget p0, p0, v3

    if-ge p0, v0, :cond_3

    aput p0, v1, v4

    aput v0, v1, v5

    return-object v1

    :cond_3
    aput v0, v1, v4

    aput p0, v1, v5

    return-object v1

    :cond_4
    aput v0, v1, v3

    aget v0, p0, v3

    if-ge v0, v2, :cond_5

    aput v0, v1, v4

    aget p0, p0, v4

    aput p0, v1, v5

    return-object v1

    :cond_5
    aput v2, v1, v4

    aput v0, v1, v5

    return-object v1

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only Trinomials and pentanomials supported"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static generateKeyFingerprint(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/jce/spec/ECParameterSpec;)Ljava/lang/String;
    .locals 4

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Lorg/bouncycastle/util/Fingerprint;

    invoke-virtual {p0, v1}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object p0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve;->getA()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECFieldElement;->getEncoded()[B

    move-result-object v3

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve;->getB()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECFieldElement;->getEncoded()[B

    move-result-object v0

    invoke-virtual {p1, v1}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object p1

    invoke-static {p0, v3, v0, p1}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B[B[B)[B

    move-result-object p0

    invoke-direct {v2, p0}, Lorg/bouncycastle/util/Fingerprint;-><init>([B)V

    invoke-virtual {v2}, Lorg/bouncycastle/util/Fingerprint;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Lorg/bouncycastle/util/Fingerprint;

    invoke-virtual {p0, v1}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object p0

    invoke-direct {p1, p0}, Lorg/bouncycastle/util/Fingerprint;-><init>([B)V

    invoke-virtual {p1}, Lorg/bouncycastle/util/Fingerprint;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static generatePrivateKeyParameter(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 11

    .line 2
    instance-of v0, p0, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;

    if-eqz v0, :cond_2

    .line 6
    check-cast p0, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;

    .line 9
    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECKey;->getParameters()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    if-nez v0, :cond_0

    .line 14
    sget-object v0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->CONFIGURATION:Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;

    .line 17
    invoke-interface {v0}, Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;->getEcImplicitlyCa()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    .line 21
    :cond_0
    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECKey;->getParameters()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    .line 24
    instance-of v1, v1, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;

    if-eqz v1, :cond_1

    .line 29
    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECKey;->getParameters()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    .line 32
    check-cast v1, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;

    .line 35
    invoke-virtual {v1}, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    .line 38
    new-instance v2, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    .line 41
    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;->getD()Ljava/math/BigInteger;

    move-result-object p0

    .line 44
    new-instance v10, Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;

    .line 47
    invoke-static {v1}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getOID(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    .line 51
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v5

    .line 55
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v6

    .line 59
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v7

    .line 63
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v8

    .line 67
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getSeed()[B

    move-result-object v9

    move-object v3, v10

    .line 71
    invoke-direct/range {v3 .. v9}, Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 74
    invoke-direct {v2, p0, v10}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    return-object v2

    .line 77
    :cond_1
    new-instance v1, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    .line 80
    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;->getD()Ljava/math/BigInteger;

    move-result-object p0

    .line 83
    new-instance v8, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    .line 86
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v3

    .line 90
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    .line 94
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v5

    .line 98
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v6

    .line 102
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getSeed()[B

    move-result-object v7

    move-object v2, v8

    .line 106
    invoke-direct/range {v2 .. v7}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 109
    invoke-direct {v1, p0, v8}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    return-object v1

    .line 112
    :cond_2
    instance-of v0, p0, Ljava/security/interfaces/ECPrivateKey;

    if-eqz v0, :cond_3

    .line 116
    check-cast p0, Ljava/security/interfaces/ECPrivateKey;

    .line 119
    invoke-interface {p0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    .line 123
    invoke-static {v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/EC5Util;->convertSpec(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    .line 126
    new-instance v1, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    .line 129
    invoke-interface {p0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object p0

    .line 132
    new-instance v8, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    .line 135
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v3

    .line 139
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    .line 143
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v5

    .line 147
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v6

    .line 151
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getSeed()[B

    move-result-object v7

    move-object v2, v8

    .line 155
    invoke-direct/range {v2 .. v7}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 158
    invoke-direct {v1, p0, v8}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    return-object v1

    .line 162
    :cond_3
    :try_start_0
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    if-eqz p0, :cond_5

    .line 168
    invoke-static {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object p0

    .line 172
    invoke-static {p0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->getPrivateKey(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)Ljava/security/PrivateKey;

    move-result-object p0

    .line 175
    instance-of v0, p0, Ljava/security/interfaces/ECPrivateKey;

    if-eqz v0, :cond_4

    .line 180
    invoke-static {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;->generatePrivateKeyParameter(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 184
    :cond_4
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string v0, "can\'t identify EC private key."

    .line 189
    invoke-direct {p0, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 190
    throw p0

    .line 192
    :cond_5
    :try_start_1
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string v0, "no encoding for EC private key"

    .line 197
    invoke-direct {p0, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 198
    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p0

    .line 202
    new-instance v0, Ljava/security/InvalidKeyException;

    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot identify EC private key: "

    .line 209
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static generatePublicKeyParameter(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 9

    .line 2
    instance-of v0, p0, Lorg/bouncycastle/jce/interfaces/ECPublicKey;

    if-eqz v0, :cond_0

    .line 6
    check-cast p0, Lorg/bouncycastle/jce/interfaces/ECPublicKey;

    .line 9
    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECKey;->getParameters()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    .line 12
    new-instance v1, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    .line 15
    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECPublicKey;->getQ()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 18
    new-instance v8, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    .line 21
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v3

    .line 25
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    .line 29
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v5

    .line 33
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v6

    .line 37
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getSeed()[B

    move-result-object v7

    move-object v2, v8

    .line 41
    invoke-direct/range {v2 .. v7}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 44
    invoke-direct {v1, p0, v8}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    return-object v1

    .line 47
    :cond_0
    instance-of v0, p0, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_1

    .line 51
    check-cast p0, Ljava/security/interfaces/ECPublicKey;

    .line 54
    invoke-interface {p0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    .line 58
    invoke-static {v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/EC5Util;->convertSpec(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    .line 61
    new-instance v1, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    .line 64
    invoke-interface {p0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    .line 68
    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object p0

    .line 72
    invoke-static {v2, p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/EC5Util;->convertPoint(Ljava/security/spec/ECParameterSpec;Ljava/security/spec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 75
    new-instance v8, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    .line 78
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v3

    .line 82
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    .line 86
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v5

    .line 90
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v6

    .line 94
    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getSeed()[B

    move-result-object v7

    move-object v2, v8

    .line 98
    invoke-direct/range {v2 .. v7}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 101
    invoke-direct {v1, p0, v8}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    return-object v1

    .line 105
    :cond_1
    :try_start_0
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    if-eqz p0, :cond_3

    .line 111
    invoke-static {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object p0

    .line 115
    invoke-static {p0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->getPublicKey(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Ljava/security/PublicKey;

    move-result-object p0

    .line 118
    instance-of v0, p0, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_2

    .line 123
    invoke-static {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;->generatePublicKeyParameter(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 127
    :cond_2
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string v0, "cannot identify EC public key."

    .line 132
    invoke-direct {p0, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 133
    throw p0

    .line 135
    :cond_3
    :try_start_1
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string v0, "no encoding for EC public key"

    .line 140
    invoke-direct {p0, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 141
    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p0

    .line 145
    new-instance v0, Ljava/security/InvalidKeyException;

    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot identify EC public key: "

    .line 152
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getCurveName(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getName(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getDomainParameters(Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;Lorg/bouncycastle/asn1/x9/X962Parameters;)Lorg/bouncycastle/crypto/params/ECDomainParameters;
    .locals 6

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->isNamedCurve()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->getParameters()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;->getNamedCurveByOid(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;->getAdditionalECParameters()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lorg/bouncycastle/asn1/x9/X9ECParameters;

    :cond_0
    new-instance p0, Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParameters;)V

    return-object p0

    :cond_1
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->isImplicitlyCA()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;->getEcImplicitlyCa()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object p0

    new-instance p1, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getSeed()[B

    move-result-object v5

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->getParameters()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object p0

    new-instance p1, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getN()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getH()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getSeed()[B

    move-result-object v5

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object p1
.end method

.method public static getDomainParameters(Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;Lorg/bouncycastle/jce/spec/ECParameterSpec;)Lorg/bouncycastle/crypto/params/ECDomainParameters;
    .locals 12

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;->getNamedCurveOid(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    new-instance p0, Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v2

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getSeed()[B

    move-result-object v6

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/crypto/params/ECNamedDomainParameters;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    invoke-interface {p0}, Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;->getEcImplicitlyCa()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object p0

    new-instance p1, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getSeed()[B

    move-result-object v5

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object p1

    :cond_1
    new-instance p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v7

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v8

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getSeed()[B

    move-result-object v11

    move-object v6, p0

    invoke-direct/range {v6 .. v11}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object p0
.end method

.method public static getNameFrom(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/jcajce/util/SpecUtil;->getNameFrom(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getNamedCurveByName(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;
    .locals 1

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/crypto/ec/CustomNamedCurves;->getByName(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getByName(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static getNamedCurveByOid(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;
    .locals 1

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/crypto/ec/CustomNamedCurves;->getByOID(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getByOID(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static getNamedCurveOid(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 0
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_2

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_2
    invoke-static {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;->getOID(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    invoke-static {p0}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getOID(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p0

    return-object p0
.end method

.method public static getNamedCurveOid(Lorg/bouncycastle/jce/spec/ECParameterSpec;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 5

    .line 0
    invoke-static {}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getNames()Ljava/util/Enumeration;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getByName(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getN()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getH()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v3

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/bouncycastle/math/ec/ECCurve;->equals(Lorg/bouncycastle/math/ec/ECCurve;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/bouncycastle/math/ec/ECPoint;->equals(Lorg/bouncycastle/math/ec/ECPoint;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getOID(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getOID(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 2

    const/4 v0, 0x0

    .line 0
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-lt v0, v1, :cond_0

    const/16 v1, 0x32

    if-gt v0, v1, :cond_0

    :try_start_0
    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getOrderBitLength(Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;Ljava/math/BigInteger;Ljava/math/BigInteger;)I
    .locals 0

    if-nez p1, :cond_2

    if-nez p0, :cond_0

    .line 0
    invoke-virtual {p2}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    return p0

    :cond_0
    invoke-interface {p0}, Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;->getEcImplicitlyCa()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-virtual {p2}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    return p0

    :cond_2
    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    return p0
.end method

.method public static privateKeyToString(Ljava/lang/String;Ljava/math/BigInteger;Lorg/bouncycastle/jce/spec/ECParameterSpec;)Ljava/lang/String;
    .locals 4

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lorg/bouncycastle/util/Strings;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/math/ec/FixedPointCombMultiplier;

    invoke-direct {v2}, Lorg/bouncycastle/math/ec/FixedPointCombMultiplier;-><init>()V

    invoke-virtual {p2}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-virtual {v2, v3, p1}, Lorg/bouncycastle/math/ec/AbstractECMultiplier;->multiply(Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECPoint;->normalize()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " Private Key ["

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;->generateKeyFingerprint(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/jce/spec/ECParameterSpec;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "            X: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECPoint;->getAffineXCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    const/16 p2, 0x10

    invoke-virtual {p0, p2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "            Y: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECPoint;->getAffineYCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static publicKeyToString(Ljava/lang/String;Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/jce/spec/ECParameterSpec;)Ljava/lang/String;
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lorg/bouncycastle/util/Strings;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " Public Key ["

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/ECUtil;->generateKeyFingerprint(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/jce/spec/ECParameterSpec;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "            X: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECPoint;->getAffineXCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    const/16 p2, 0x10

    invoke-virtual {p0, p2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "            Y: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECPoint;->getAffineYCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
