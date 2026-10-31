.class public Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;
.super Ljavax/crypto/MacSpi;

# interfaces
.implements Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE;


# instance fields
.field public keySize:I

.field public macEngine:Lorg/bouncycastle/crypto/Mac;

.field public pbeHash:I

.field public scheme:I


# direct methods
.method public constructor <init>(ILorg/bouncycastle/crypto/Mac;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljavax/crypto/MacSpi;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->scheme:I

    const/4 v0, 0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->pbeHash:I

    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->keySize:I

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/Mac;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljavax/crypto/MacSpi;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->scheme:I

    const/4 v0, 0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->pbeHash:I

    const/16 v0, 0xa0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->keySize:I

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/Mac;III)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljavax/crypto/MacSpi;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    iput p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->scheme:I

    iput p3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->pbeHash:I

    iput p4, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->keySize:I

    return-void
.end method

.method public static copyMap(Ljava/util/Map;)Ljava/util/Hashtable;
    .locals 4

    .line 0
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public engineDoFinal()[B
    .locals 3

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->engineGetMacLength()I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lorg/bouncycastle/crypto/Mac;->doFinal([BI)I

    return-object v0
.end method

.method public engineGetMacLength()I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    return v0
.end method

.method public engineInit(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 6

    if-eqz p1, :cond_15

    .line 4
    instance-of v0, p1, Lorg/bouncycastle/jcajce/PKCS12Key;

    if-eqz v0, :cond_8

    .line 9
    :try_start_0
    move-object v0, p1

    check-cast v0, Ljavax/crypto/SecretKey;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 12
    :try_start_1
    move-object v1, p2

    check-cast v1, Ljavax/crypto/spec/PBEParameterSpec;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 14
    instance-of v2, v0, Ljavax/crypto/interfaces/PBEKey;

    if-eqz v2, :cond_0

    if-nez v1, :cond_0

    .line 20
    new-instance v1, Ljavax/crypto/spec/PBEParameterSpec;

    .line 23
    move-object v2, v0

    check-cast v2, Ljavax/crypto/interfaces/PBEKey;

    .line 26
    invoke-interface {v2}, Ljavax/crypto/interfaces/PBEKey;->getSalt()[B

    move-result-object v3

    .line 30
    invoke-interface {v2}, Ljavax/crypto/interfaces/PBEKey;->getIterationCount()I

    move-result v2

    .line 34
    invoke-direct {v1, v3, v2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    .line 36
    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    .line 39
    invoke-interface {v2}, Lorg/bouncycastle/crypto/Mac;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "GOST"

    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x2

    const/16 v4, 0x100

    if-eqz v2, :cond_1

    const/4 v2, 0x6

    goto/16 :goto_1

    .line 56
    :cond_1
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    .line 58
    instance-of v5, v2, Lorg/bouncycastle/crypto/macs/HMac;

    if-eqz v5, :cond_7

    .line 65
    invoke-interface {v2}, Lorg/bouncycastle/crypto/Mac;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "SHA-1"

    .line 71
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 76
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    .line 79
    invoke-interface {v2}, Lorg/bouncycastle/crypto/Mac;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "SHA-224"

    .line 85
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x7

    const/16 v4, 0xe0

    goto :goto_1

    .line 94
    :cond_2
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    .line 97
    invoke-interface {v2}, Lorg/bouncycastle/crypto/Mac;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "SHA-256"

    .line 103
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x4

    goto :goto_1

    .line 110
    :cond_3
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    .line 113
    invoke-interface {v2}, Lorg/bouncycastle/crypto/Mac;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "SHA-384"

    .line 119
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x8

    const/16 v4, 0x180

    goto :goto_1

    .line 129
    :cond_4
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    .line 132
    invoke-interface {v2}, Lorg/bouncycastle/crypto/Mac;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "SHA-512"

    .line 138
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x9

    const/16 v4, 0x200

    goto :goto_1

    .line 148
    :cond_5
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    .line 151
    invoke-interface {v2}, Lorg/bouncycastle/crypto/Mac;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "RIPEMD160"

    .line 157
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, 0x2

    goto :goto_0

    .line 166
    :cond_6
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    .line 168
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "no PKCS12 mapping for HMAC: "

    .line 173
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    .line 178
    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    .line 182
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 189
    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 190
    throw p1

    :cond_7
    const/4 v2, 0x1

    :goto_0
    const/16 v4, 0xa0

    .line 195
    :goto_1
    invoke-static {v0, v3, v2, v4, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE$Util;->makePBEMacParameters(Ljavax/crypto/SecretKey;IIILjavax/crypto/spec/PBEParameterSpec;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    goto :goto_2

    .line 199
    :catch_0
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "PKCS12 requires a PBEParameterSpec"

    .line 204
    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 205
    throw p1

    .line 207
    :catch_1
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string p2, "PKCS12 requires a SecretKey/PBEKey"

    .line 212
    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 213
    throw p1

    .line 215
    :cond_8
    instance-of v0, p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;

    if-eqz v0, :cond_b

    .line 220
    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;

    .line 223
    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;->getParam()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 229
    invoke-virtual {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;->getParam()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    goto :goto_2

    .line 233
    :cond_9
    instance-of v1, p2, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v1, :cond_a

    .line 238
    invoke-static {v0, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE$Util;->makePBEMacParameters(Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;Ljava/security/spec/AlgorithmParameterSpec;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    goto :goto_2

    .line 242
    :cond_a
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "PBE requires PBE parameters to be set."

    .line 247
    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 248
    throw p1

    .line 250
    :cond_b
    instance-of v0, p2, Ljavax/crypto/spec/PBEParameterSpec;

    if-nez v0, :cond_14

    .line 254
    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 257
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    .line 261
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    .line 263
    :goto_2
    instance-of v1, v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v1, :cond_c

    .line 268
    move-object v1, v0

    check-cast v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    .line 271
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    .line 274
    check-cast v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    goto :goto_3

    .line 278
    :cond_c
    move-object v1, v0

    check-cast v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 280
    :goto_3
    instance-of v2, p2, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;

    if-eqz v2, :cond_d

    .line 284
    check-cast p2, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;

    .line 286
    new-instance v0, Lorg/bouncycastle/crypto/params/AEADParameters;

    .line 289
    invoke-virtual {p2}, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;->getMacSizeInBits()I

    move-result p1

    .line 293
    invoke-virtual {p2}, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;->getNonce()[B

    move-result-object v2

    .line 297
    invoke-virtual {p2}, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;->getAssociatedData()[B

    move-result-object p2

    .line 301
    invoke-direct {v0, v1, p1, v2, p2}, Lorg/bouncycastle/crypto/params/AEADParameters;-><init>(Lorg/bouncycastle/crypto/params/KeyParameter;I[B[B)V

    goto :goto_4

    .line 304
    :cond_d
    instance-of v2, p2, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v2, :cond_e

    .line 308
    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    .line 310
    check-cast p2, Ljavax/crypto/spec/IvParameterSpec;

    .line 313
    invoke-virtual {p2}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object p1

    .line 317
    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    goto :goto_4

    .line 320
    :cond_e
    instance-of v2, p2, Ljavax/crypto/spec/RC2ParameterSpec;

    if-eqz v2, :cond_f

    .line 324
    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    .line 326
    new-instance p1, Lorg/bouncycastle/crypto/params/RC2Parameters;

    .line 329
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v1

    .line 332
    check-cast p2, Ljavax/crypto/spec/RC2ParameterSpec;

    .line 335
    invoke-virtual {p2}, Ljavax/crypto/spec/RC2ParameterSpec;->getEffectiveKeyBits()I

    move-result v2

    .line 339
    invoke-direct {p1, v1, v2}, Lorg/bouncycastle/crypto/params/RC2Parameters;-><init>([BI)V

    .line 342
    invoke-virtual {p2}, Ljavax/crypto/spec/RC2ParameterSpec;->getIV()[B

    move-result-object p2

    .line 346
    invoke-direct {v0, p1, p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    goto :goto_4

    .line 349
    :cond_f
    instance-of v2, p2, Lorg/bouncycastle/jcajce/spec/SkeinParameterSpec;

    if-eqz v2, :cond_10

    .line 353
    new-instance p1, Lorg/bouncycastle/crypto/params/SkeinParameters$Builder;

    .line 355
    check-cast p2, Lorg/bouncycastle/jcajce/spec/SkeinParameterSpec;

    .line 358
    invoke-virtual {p2}, Lorg/bouncycastle/jcajce/spec/SkeinParameterSpec;->getParameters()Ljava/util/Map;

    move-result-object p2

    .line 362
    invoke-static {p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->copyMap(Ljava/util/Map;)Ljava/util/Hashtable;

    move-result-object p2

    .line 366
    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/params/SkeinParameters$Builder;-><init>(Ljava/util/Hashtable;)V

    .line 369
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object p2

    .line 373
    invoke-virtual {p1, p2}, Lorg/bouncycastle/crypto/params/SkeinParameters$Builder;->setKey([B)Lorg/bouncycastle/crypto/params/SkeinParameters$Builder;

    move-result-object p1

    .line 377
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/SkeinParameters$Builder;->build()Lorg/bouncycastle/crypto/params/SkeinParameters;

    move-result-object v0

    goto :goto_4

    :cond_10
    if-nez p2, :cond_11

    .line 383
    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 386
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    .line 390
    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    goto :goto_4

    .line 394
    :cond_11
    invoke-static {p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/GcmSpecUtil;->isGcmSpec(Ljava/security/spec/AlgorithmParameterSpec;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 400
    invoke-static {v1, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/GcmSpecUtil;->extractAeadParameters(Lorg/bouncycastle/crypto/params/KeyParameter;Ljava/security/spec/AlgorithmParameterSpec;)Lorg/bouncycastle/crypto/params/AEADParameters;

    move-result-object v0

    goto :goto_4

    .line 404
    :cond_12
    instance-of p1, p2, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz p1, :cond_13

    .line 408
    :goto_4
    :try_start_2
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    .line 411
    invoke-interface {p1, v0}, Lorg/bouncycastle/crypto/Mac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception p1

    .line 415
    new-instance p2, Ljava/security/InvalidAlgorithmParameterException;

    .line 417
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "cannot initialize MAC: "

    .line 422
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_13
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "unknown parameter type: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "inappropriate parameter type: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string p2, "key is null"

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineReset()V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->reset()V

    return-void
.end method

.method public engineUpdate(B)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Mac;->update(B)V

    return-void
.end method

.method public engineUpdate([BII)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;->macEngine:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    return-void
.end method
