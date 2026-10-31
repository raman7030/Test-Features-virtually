.class public Lorg/bouncycastle/jcajce/provider/asymmetric/edec/EdECUtil;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static generatePrivateKeyParameter(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 3

    .line 2
    instance-of v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCXDHPrivateKey;

    if-eqz v0, :cond_0

    .line 6
    check-cast p0, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCXDHPrivateKey;

    .line 9
    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCXDHPrivateKey;->engineGetKeyParameters()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p0

    return-object p0

    .line 13
    :cond_0
    instance-of v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCEdDSAPrivateKey;

    if-eqz v0, :cond_1

    .line 17
    check-cast p0, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCEdDSAPrivateKey;

    .line 20
    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCEdDSAPrivateKey;->engineGetKeyParameters()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p0

    return-object p0

    .line 25
    :cond_1
    :try_start_0
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    if-eqz p0, :cond_2

    .line 31
    invoke-static {p0}, Lorg/bouncycastle/crypto/util/PrivateKeyFactory;->createKey([B)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p0

    return-object p0

    .line 35
    :cond_2
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string v0, "no encoding for EdEC/XDH private key"

    .line 40
    invoke-direct {p0, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 41
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 44
    new-instance v0, Ljava/security/InvalidKeyException;

    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot identify EdEC/XDH private key: "

    .line 51
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static generatePublicKeyParameter(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 3

    .line 2
    instance-of v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCXDHPublicKey;

    if-eqz v0, :cond_0

    .line 6
    check-cast p0, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCXDHPublicKey;

    .line 9
    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCXDHPublicKey;->engineGetKeyParameters()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p0

    return-object p0

    .line 13
    :cond_0
    instance-of v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCEdDSAPublicKey;

    if-eqz v0, :cond_1

    .line 17
    check-cast p0, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCEdDSAPublicKey;

    .line 20
    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/edec/BCEdDSAPublicKey;->engineGetKeyParameters()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p0

    return-object p0

    .line 25
    :cond_1
    :try_start_0
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    if-eqz p0, :cond_2

    .line 31
    invoke-static {p0}, Lorg/bouncycastle/crypto/util/PublicKeyFactory;->createKey([B)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object p0

    return-object p0

    .line 35
    :cond_2
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string v0, "no encoding for EdEC/XDH public key"

    .line 40
    invoke-direct {p0, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 41
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 44
    new-instance v0, Ljava/security/InvalidKeyException;

    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot identify EdEC/XDH public key: "

    .line 51
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
