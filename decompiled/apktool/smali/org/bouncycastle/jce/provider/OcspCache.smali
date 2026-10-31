.class public Lorg/bouncycastle/jce/provider/OcspCache;
.super Ljava/lang/Object;


# static fields
.field public static final DEFAULT_MAX_RESPONSE_SIZE:I = 0x8000

.field public static final DEFAULT_TIMEOUT:I = 0x3a98

.field public static cache:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/OcspCache;->cache:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getOcspResponse(Lorg/bouncycastle/asn1/ocsp/CertID;Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;Ljava/net/URI;Ljava/security/cert/X509Certificate;Ljava/util/List;Lorg/bouncycastle/jcajce/util/JcaJceHelper;)Lorg/bouncycastle/asn1/ocsp/OCSPResponse;
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p2

    const-string v2, "configuration error: "

    .line 6
    sget-object v3, Lorg/bouncycastle/jce/provider/OcspCache;->cache:Ljava/util/Map;

    .line 9
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 12
    check-cast v3, Ljava/lang/ref/WeakReference;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 18
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    .line 21
    check-cast v3, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    if-eqz v3, :cond_2

    .line 28
    invoke-interface {v3, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 31
    check-cast v5, Lorg/bouncycastle/asn1/ocsp/OCSPResponse;

    if-eqz v5, :cond_2

    .line 36
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ocsp/OCSPResponse;->getResponseBytes()Lorg/bouncycastle/asn1/ocsp/ResponseBytes;

    move-result-object v6

    .line 40
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ocsp/ResponseBytes;->getResponse()Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v6

    .line 44
    invoke-static {v6}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v6

    .line 48
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v6

    .line 52
    invoke-static {v6}, Lorg/bouncycastle/asn1/ocsp/BasicOCSPResponse;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ocsp/BasicOCSPResponse;

    move-result-object v6

    .line 56
    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getValidDate()Ljava/util/Date;

    move-result-object v7

    .line 60
    invoke-static {v6, v7, p0}, Lorg/bouncycastle/jce/provider/OcspCache;->isCertIDFoundAndCurrent(Lorg/bouncycastle/asn1/ocsp/BasicOCSPResponse;Ljava/util/Date;Lorg/bouncycastle/asn1/ocsp/CertID;)Z

    move-result v6

    if-eqz v6, :cond_1

    return-object v5

    .line 67
    :cond_1
    invoke-interface {v3, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    :cond_2
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v5
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_2

    .line 73
    new-instance v6, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 76
    invoke-direct {v6}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 78
    new-instance v7, Lorg/bouncycastle/asn1/ocsp/Request;

    .line 81
    invoke-direct {v7, p0, v4}, Lorg/bouncycastle/asn1/ocsp/Request;-><init>(Lorg/bouncycastle/asn1/ocsp/CertID;Lorg/bouncycastle/asn1/x509/Extensions;)V

    .line 84
    invoke-virtual {v6, v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 86
    new-instance v7, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 89
    invoke-direct {v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    const/4 v8, 0x0

    move-object v9, v4

    .line 94
    :goto_1
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v10

    if-eq v8, v10, :cond_4

    move-object/from16 v10, p4

    .line 102
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 106
    invoke-static {v11}, Ll/۟ۤ᩻;->֫(Ljava/lang/Object;)Ljava/security/cert/Extension;

    move-result-object v11

    .line 109
    new-instance v12, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 112
    invoke-interface {v11}, Ljava/security/cert/Extension;->getId()Ljava/lang/String;

    move-result-object v13

    .line 116
    invoke-direct {v12, v13}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    .line 118
    new-instance v13, Lorg/bouncycastle/asn1/DEROctetString;

    .line 121
    invoke-interface {v11}, Ljava/security/cert/Extension;->getValue()[B

    move-result-object v14

    .line 125
    invoke-direct {v13, v14}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    .line 127
    sget-object v14, Lorg/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers;->id_pkix_ocsp_nonce:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 130
    invoke-virtual {v14, v12}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v14

    if-eqz v14, :cond_3

    .line 136
    invoke-virtual {v13}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v9

    .line 140
    invoke-static {v9}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object v9

    .line 143
    :cond_3
    new-instance v14, Lorg/bouncycastle/asn1/x509/Extension;

    .line 146
    invoke-interface {v11}, Ljava/security/cert/Extension;->isCritical()Z

    move-result v11

    .line 150
    invoke-direct {v14, v12, v11, v13}, Lorg/bouncycastle/asn1/x509/Extension;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;ZLorg/bouncycastle/asn1/ASN1OctetString;)V

    .line 153
    invoke-virtual {v7, v14}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 159
    :cond_4
    invoke-virtual {v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->size()I

    move-result v8

    if-eqz v8, :cond_5

    .line 164
    new-instance v8, Lorg/bouncycastle/asn1/ocsp/TBSRequest;

    .line 166
    new-instance v10, Lorg/bouncycastle/asn1/DERSequence;

    .line 169
    invoke-direct {v10, v6}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 171
    new-instance v6, Lorg/bouncycastle/asn1/DERSequence;

    .line 174
    invoke-direct {v6, v7}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 177
    invoke-static {v6}, Lorg/bouncycastle/asn1/x509/Extensions;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Extensions;

    move-result-object v6

    .line 181
    invoke-direct {v8, v4, v10, v6}, Lorg/bouncycastle/asn1/ocsp/TBSRequest;-><init>(Lorg/bouncycastle/asn1/x509/GeneralName;Lorg/bouncycastle/asn1/ASN1Sequence;Lorg/bouncycastle/asn1/x509/Extensions;)V

    goto :goto_2

    .line 184
    :cond_5
    new-instance v8, Lorg/bouncycastle/asn1/ocsp/TBSRequest;

    .line 186
    new-instance v7, Lorg/bouncycastle/asn1/DERSequence;

    .line 189
    invoke-direct {v7, v6}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 192
    invoke-direct {v8, v4, v7, v4}, Lorg/bouncycastle/asn1/ocsp/TBSRequest;-><init>(Lorg/bouncycastle/asn1/x509/GeneralName;Lorg/bouncycastle/asn1/ASN1Sequence;Lorg/bouncycastle/asn1/x509/Extensions;)V

    .line 194
    :goto_2
    :try_start_1
    new-instance v6, Lorg/bouncycastle/asn1/ocsp/OCSPRequest;

    .line 197
    invoke-direct {v6, v8, v4}, Lorg/bouncycastle/asn1/ocsp/OCSPRequest;-><init>(Lorg/bouncycastle/asn1/ocsp/TBSRequest;Lorg/bouncycastle/asn1/ocsp/Signature;)V

    .line 200
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v6

    .line 204
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v5

    .line 207
    check-cast v5, Ljava/net/HttpURLConnection;

    const/16 v7, 0x3a98

    .line 212
    invoke-virtual {v5, v7}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 215
    invoke-virtual {v5, v7}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const/4 v7, 0x1

    .line 219
    invoke-virtual {v5, v7}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 222
    invoke-virtual {v5, v7}, Ljava/net/URLConnection;->setDoInput(Z)V

    const-string v7, "POST"

    .line 227
    invoke-virtual {v5, v7}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v7, "Content-type"

    const-string v8, "application/ocsp-request"

    .line 234
    invoke-virtual {v5, v7, v8}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "Content-length"

    .line 237
    array-length v8, v6

    .line 240
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    .line 244
    invoke-virtual {v5, v7, v8}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    invoke-virtual {v5}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v7

    .line 251
    invoke-virtual {v7, v6}, Ljava/io/OutputStream;->write([B)V

    .line 254
    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V

    .line 257
    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    .line 261
    invoke-virtual {v5}, Ljava/net/URLConnection;->getContentLength()I

    move-result v5

    if-gez v5, :cond_6

    const v5, 0x8000

    .line 270
    :cond_6
    invoke-static {v6, v5}, Lorg/bouncycastle/util/io/Streams;->readAllLimited(Ljava/io/InputStream;I)[B

    move-result-object v5

    .line 274
    invoke-static {v5}, Lorg/bouncycastle/asn1/ocsp/OCSPResponse;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ocsp/OCSPResponse;

    move-result-object v5

    .line 278
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ocsp/OCSPResponse;->getResponseStatus()Lorg/bouncycastle/asn1/ocsp/OCSPResponseStatus;

    move-result-object v6

    .line 282
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ocsp/OCSPResponseStatus;->getIntValue()I

    move-result v6

    if-nez v6, :cond_b

    .line 288
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ocsp/OCSPResponse;->getResponseBytes()Lorg/bouncycastle/asn1/ocsp/ResponseBytes;

    move-result-object v6

    .line 292
    invoke-static {v6}, Lorg/bouncycastle/asn1/ocsp/ResponseBytes;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ocsp/ResponseBytes;

    move-result-object v6

    .line 296
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ocsp/ResponseBytes;->getResponseType()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v7

    .line 299
    sget-object v8, Lorg/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers;->id_pkix_ocsp_basic:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 302
    invoke-virtual {v7, v8}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 308
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ocsp/ResponseBytes;->getResponse()Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v6

    .line 312
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v6

    .line 316
    invoke-static {v6}, Lorg/bouncycastle/asn1/ocsp/BasicOCSPResponse;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ocsp/BasicOCSPResponse;

    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v7, p1

    move-object/from16 v8, p3

    move-object/from16 v10, p5

    .line 324
    :try_start_2
    invoke-static {v6, v7, v9, v8, v10}, Lorg/bouncycastle/jce/provider/ProvOcspRevocationChecker;->validatedOcspResponse(Lorg/bouncycastle/asn1/ocsp/BasicOCSPResponse;Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;[BLjava/security/cert/X509Certificate;Lorg/bouncycastle/jcajce/util/JcaJceHelper;)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 330
    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getValidDate()Ljava/util/Date;

    move-result-object v8

    .line 334
    invoke-static {v6, v8, p0}, Lorg/bouncycastle/jce/provider/OcspCache;->isCertIDFoundAndCurrent(Lorg/bouncycastle/asn1/ocsp/BasicOCSPResponse;Ljava/util/Date;Lorg/bouncycastle/asn1/ocsp/CertID;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 339
    sget-object v4, Lorg/bouncycastle/jce/provider/OcspCache;->cache:Ljava/util/Map;

    .line 342
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 345
    check-cast v4, Ljava/lang/ref/WeakReference;

    if-eqz v4, :cond_7

    .line 350
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    .line 353
    check-cast v3, Ljava/util/Map;

    :cond_7
    if-eqz v3, :cond_8

    .line 362
    invoke-interface {v3, p0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v5

    .line 365
    :cond_8
    new-instance v3, Ljava/util/HashMap;

    .line 368
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 371
    invoke-virtual {v3, p0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    sget-object v0, Lorg/bouncycastle/jce/provider/OcspCache;->cache:Ljava/util/Map;

    .line 375
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 378
    invoke-direct {v4, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 381
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v5

    :cond_9
    move-object/from16 v7, p1

    .line 384
    :cond_a
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "OCSP response failed to validate"

    .line 389
    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getCertPath()Ljava/security/cert/CertPath;

    move-result-object v3

    .line 393
    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getIndex()I

    move-result v5

    .line 397
    invoke-direct {v0, v1, v4, v3, v5}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    .line 398
    throw v0

    :cond_b
    move-object/from16 v7, p1

    .line 400
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    .line 402
    new-instance v1, Ljava/lang/StringBuilder;

    .line 405
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OCSP responder failed: "

    .line 410
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ocsp/OCSPResponse;->getResponseStatus()Lorg/bouncycastle/asn1/ocsp/OCSPResponseStatus;

    move-result-object v3

    .line 417
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ocsp/OCSPResponseStatus;->getValue()Ljava/math/BigInteger;

    move-result-object v3

    .line 421
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 424
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 428
    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getCertPath()Ljava/security/cert/CertPath;

    move-result-object v3

    .line 432
    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getIndex()I

    move-result v5

    .line 436
    invoke-direct {v0, v1, v4, v3, v5}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    .line 437
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object/from16 v7, p1

    .line 439
    :goto_3
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    .line 441
    new-instance v3, Ljava/lang/StringBuilder;

    .line 444
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v3}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getCertPath()Ljava/security/cert/CertPath;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getIndex()I

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_2
    move-exception v0

    move-object/from16 v7, p1

    move-object v1, v0

    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getCertPath()Ljava/security/cert/CertPath;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/jcajce/PKIXCertRevocationCheckerParameters;->getIndex()I

    move-result v4

    invoke-direct {v0, v2, v1, v3, v4}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0
.end method

.method public static isCertIDFoundAndCurrent(Lorg/bouncycastle/asn1/ocsp/BasicOCSPResponse;Ljava/util/Date;Lorg/bouncycastle/asn1/ocsp/CertID;)Z
    .locals 4

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ocsp/BasicOCSPResponse;->getTbsResponseData()Lorg/bouncycastle/asn1/ocsp/ResponseData;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/asn1/ocsp/ResponseData;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ocsp/ResponseData;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ocsp/ResponseData;->getResponses()Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v2

    if-eq v1, v2, :cond_2

    invoke-virtual {p0, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/ocsp/SingleResponse;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ocsp/SingleResponse;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ocsp/SingleResponse;->getCertID()Lorg/bouncycastle/asn1/ocsp/CertID;

    move-result-object v3

    invoke-virtual {p2, v3}, Lorg/bouncycastle/asn1/ocsp/CertID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ocsp/SingleResponse;->getNextUpdate()Lorg/bouncycastle/asn1/ASN1GeneralizedTime;

    move-result-object p0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1GeneralizedTime;->getDate()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    :catch_0
    return v0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method
