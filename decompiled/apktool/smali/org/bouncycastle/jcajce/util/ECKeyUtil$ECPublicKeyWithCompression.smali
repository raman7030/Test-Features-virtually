.class public Lorg/bouncycastle/jcajce/util/ECKeyUtil$ECPublicKeyWithCompression;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/interfaces/ECPublicKey;


# instance fields
.field public final ecPublicKey:Ljava/security/interfaces/ECPublicKey;


# direct methods
.method public constructor <init>(Ljava/security/interfaces/ECPublicKey;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/util/ECKeyUtil$ECPublicKeyWithCompression;->ecPublicKey:Ljava/security/interfaces/ECPublicKey;

    return-void
.end method


# virtual methods
.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/util/ECKeyUtil$ECPublicKeyWithCompression;->ecPublicKey:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEncoded()[B
    .locals 4

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/util/ECKeyUtil$ECPublicKeyWithCompression;->ecPublicKey:Ljava/security/interfaces/ECPublicKey;

    .line 5
    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    .line 9
    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    .line 21
    invoke-static {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x9/X962Parameters;

    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->isNamedCurve()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 31
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->getParameters()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v1

    .line 34
    check-cast v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 37
    invoke-static {v1}, Lorg/bouncycastle/crypto/ec/CustomNamedCurves;->getByOIDLazy(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;

    move-result-object v2

    if-nez v2, :cond_0

    .line 43
    invoke-static {v1}, Lorg/bouncycastle/asn1/x9/ECNamedCurveTable;->getByOIDLazy(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;

    move-result-object v2

    .line 47
    :cond_0
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->isImplicitlyCA()Z

    move-result v2

    if-nez v2, :cond_2

    .line 58
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->getParameters()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v1

    .line 62
    invoke-static {v1}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    .line 70
    :goto_0
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getPublicKeyData()Lorg/bouncycastle/asn1/ASN1BitString;

    move-result-object v2

    .line 74
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1BitString;->getOctets()[B

    move-result-object v2

    .line 78
    invoke-virtual {v1, v2}, Lorg/bouncycastle/math/ec/ECCurve;->decodePoint([B)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v1

    .line 81
    new-instance v2, Lorg/bouncycastle/asn1/x9/X9ECPoint;

    const/4 v3, 0x1

    .line 85
    invoke-direct {v2, v1, v3}, Lorg/bouncycastle/asn1/x9/X9ECPoint;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Z)V

    .line 88
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECPoint;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v1

    .line 92
    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v1

    .line 95
    :try_start_0
    new-instance v2, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    .line 98
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    .line 102
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v1

    .line 106
    invoke-direct {v2, v0, v1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    .line 109
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 114
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 116
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unable to encode EC public key: "

    .line 121
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v2}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unable to identify implictlyCA"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/util/ECKeyUtil$ECPublicKeyWithCompression;->ecPublicKey:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/Key;->getFormat()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getParams()Ljava/security/spec/ECParameterSpec;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/util/ECKeyUtil$ECPublicKeyWithCompression;->ecPublicKey:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    return-object v0
.end method

.method public getW()Ljava/security/spec/ECPoint;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/util/ECKeyUtil$ECPublicKeyWithCompression;->ecPublicKey:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v0

    return-object v0
.end method
