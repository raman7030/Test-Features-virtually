.class public Lorg/bouncycastle/crypto/util/PublicKeyFactory$RSAConverter;
.super Lorg/bouncycastle/crypto/util/PublicKeyFactory$SubjectPublicKeyInfoConverter;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/util/PublicKeyFactory$SubjectPublicKeyInfoConverter;-><init>(Lorg/bouncycastle/crypto/util/PublicKeyFactory$1;)V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/crypto/util/PublicKeyFactory$1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/util/PublicKeyFactory$RSAConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public getPublicKeyParameters(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;Ljava/lang/Object;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 2

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->parsePublicKey()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/asn1/pkcs/RSAPublicKey;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/RSAPublicKey;

    move-result-object p1

    new-instance p2, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/RSAPublicKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {p2, v1, v0, p1}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;-><init>(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object p2
.end method
