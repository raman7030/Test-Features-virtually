.class public final Ll/ۙܽᩳ;
.super Ljava/lang/Object;
.source "L1W7"


# instance fields
.field public ֫:Ljava/io/ByteArrayOutputStream;

.field public ۧ:Ljava/io/ByteArrayOutputStream;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 338
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Ll/ۙܽᩳ;->֫:Ljava/io/ByteArrayOutputStream;

    const/4 v0, 0x0

    .line 340
    iput-object v0, p0, Ll/ۙܽᩳ;->ܽ:Ljava/lang/String;

    .line 341
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v1, p0, Ll/ۙܽᩳ;->ۧ:Ljava/io/ByteArrayOutputStream;

    .line 343
    iput-object v0, p0, Ll/ۙܽᩳ;->ܿ:Ljava/lang/String;

    .line 344
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Ll/ۙܽᩳ;->ᩳ:Ljava/io/ByteArrayOutputStream;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙܽᩳ;)Ljava/io/ByteArrayOutputStream;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽᩳ;->֫:Ljava/io/ByteArrayOutputStream;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۙܽᩳ;)Ljava/io/ByteArrayOutputStream;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽᩳ;->ۧ:Ljava/io/ByteArrayOutputStream;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۙܽᩳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽᩳ;->ܽ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۙܽᩳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽᩳ;->ܿ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۙܽᩳ;)Ljava/io/ByteArrayOutputStream;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽᩳ;->ᩳ:Ljava/io/ByteArrayOutputStream;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۧۤᩴ;Ll/۬ܿᩳ;Ll/ܰۧᩳ;Ll/۟ۧᩳ;Ljava/lang/String;ZZJLl/᩻ܽᩳ;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p10

    .line 350
    invoke-virtual/range {p1 .. p1}, Ll/ۧۤᩴ;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    int-to-long v3, v3

    .line 351
    div-long v5, p8, v3

    mul-long v3, v3, v5

    sub-long v3, p8, v3

    .line 353
    invoke-virtual {v2, v5, v6}, Ll/᩻ܽᩳ;->֫(J)V

    .line 356
    new-instance v7, Ljava/util/TreeMap;

    invoke-direct {v7}, Ljava/util/TreeMap;-><init>()V

    .line 358
    new-instance v8, Ljava/util/jar/Attributes;

    invoke-direct {v8}, Ljava/util/jar/Attributes;-><init>()V

    const-string v9, "Manifest-Version"

    const-string v10, "1.0"

    .line 359
    invoke-virtual {v8, v9, v10}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v9, "Built-By"

    const-string v11, "Signflinger"

    .line 360
    invoke-virtual {v8, v9, v11}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v9, "Created-By"

    const-string v11, "Android Gradle 8.0.2"

    .line 361
    invoke-virtual {v8, v9, v11}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    sget-object v12, Ljava/util/jar/Attributes$Name;->MANIFEST_VERSION:Ljava/util/jar/Attributes$Name;

    invoke-virtual {v8, v12}, Ljava/util/jar/Attributes;->getValue(Ljava/util/jar/Attributes$Name;)Ljava/lang/String;

    move-result-object v13

    const-string v14, " attribute missing"

    const-string v15, "Mandatory "

    if-eqz v13, :cond_10

    move-object/from16 p8, v14

    .line 52
    iget-object v14, v0, Ll/ۙܽᩳ;->֫:Ljava/io/ByteArrayOutputStream;

    invoke-static {v14, v12, v13}, Ll/ᩳܽᩳ;->֫(Ljava/io/ByteArrayOutputStream;Ljava/util/jar/Attributes$Name;Ljava/lang/String;)V

    .line 54
    invoke-virtual {v8}, Ljava/util/jar/Attributes;->size()I

    move-result v13

    move-object/from16 p9, v15

    const/4 v15, 0x1

    if-le v13, v15, :cond_0

    .line 55
    invoke-static {v8}, Ll/ᩳܽᩳ;->֫(Ljava/util/jar/Attributes;)Ljava/util/TreeMap;

    move-result-object v8

    .line 56
    invoke-virtual {v12}, Ljava/util/jar/Attributes$Name;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    invoke-static {v14, v8}, Ll/ᩳܽᩳ;->֫(Ljava/io/OutputStream;Ljava/util/TreeMap;)V

    .line 59
    :cond_0
    invoke-static {v14}, Ll/ᩳܽᩳ;->֫(Ljava/io/ByteArrayOutputStream;)V

    .line 364
    new-instance v8, Ljava/util/ArrayList;

    invoke-virtual/range {p1 .. p1}, Ll/ۧۤᩴ;->keySet()Ljava/util/Set;

    move-result-object v12

    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 365
    invoke-static {v8}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 366
    invoke-static/range {p3 .. p3}, Ll/ۗܽᩳ;->֫(Ll/ܰۧᩳ;)Ljava/lang/String;

    move-result-object v12

    .line 367
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    move-object/from16 v15, p1

    .line 368
    invoke-virtual {v15, v13}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v8

    move-object/from16 v8, v16

    check-cast v8, [B

    .line 369
    new-instance v15, Ljava/util/jar/Attributes;

    invoke-direct {v15}, Ljava/util/jar/Attributes;-><init>()V

    move-wide/from16 v18, v3

    const/4 v3, 0x2

    .line 327
    invoke-static {v8, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    .line 370
    invoke-virtual {v15, v12, v3}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 373
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 374
    invoke-static {v3, v13, v15}, Ll/ᩳܽᩳ;->֫(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;Ljava/util/jar/Attributes;)V

    .line 375
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    .line 376
    invoke-virtual {v14, v3}, Ljava/io/OutputStream;->write([B)V

    .line 377
    invoke-virtual {v7, v13, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, v17

    move-wide/from16 v3, v18

    goto :goto_0

    :cond_1
    move-wide/from16 v18, v3

    .line 383
    new-instance v3, Ljava/util/jar/Attributes;

    invoke-direct {v3}, Ljava/util/jar/Attributes;-><init>()V

    const-string v4, "Signature-Version"

    .line 384
    invoke-virtual {v3, v4, v10}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 385
    invoke-virtual {v3, v9, v11}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    if-nez p6, :cond_2

    if-eqz p7, :cond_5

    :cond_2
    const-string v4, "X-Android-APK-Signed"

    if-eqz p6, :cond_3

    if-eqz p7, :cond_3

    const-string v8, "2,3"

    .line 388
    invoke-virtual {v3, v4, v8}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :cond_3
    if-eqz p6, :cond_4

    const-string v8, "2"

    .line 390
    invoke-virtual {v3, v4, v8}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :cond_4
    const-string v8, "3"

    .line 392
    invoke-virtual {v3, v4, v8}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    :cond_5
    :goto_1
    invoke-virtual/range {p3 .. p3}, Ll/ܰۧᩳ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    .line 315
    sget-object v8, Ll/᩶ܽᩳ;->֫:[I

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    const/4 v9, 0x1

    if-eq v8, v9, :cond_7

    const/4 v9, 0x2

    if-ne v8, v9, :cond_6

    const-string v8, "SHA-256-Digest-Manifest"

    goto :goto_2

    .line 321
    :cond_6
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unexpected content digest algorithm: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_7
    const-string v8, "SHA1-Digest-Manifest"

    .line 395
    :goto_2
    invoke-virtual {v14}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v9

    const/4 v10, 0x2

    .line 327
    invoke-static {v9, v10}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v9

    .line 395
    invoke-virtual {v3, v8, v9}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    sget-object v8, Ljava/util/jar/Attributes$Name;->SIGNATURE_VERSION:Ljava/util/jar/Attributes$Name;

    invoke-virtual {v3, v8}, Ljava/util/jar/Attributes;->getValue(Ljava/util/jar/Attributes$Name;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_f

    .line 43
    iget-object v10, v0, Ll/ۙܽᩳ;->ۧ:Ljava/io/ByteArrayOutputStream;

    invoke-static {v10, v8, v9}, Ll/ᩳܽᩳ;->֫(Ljava/io/ByteArrayOutputStream;Ljava/util/jar/Attributes$Name;Ljava/lang/String;)V

    .line 45
    invoke-virtual {v3}, Ljava/util/jar/Attributes;->size()I

    move-result v9

    const/4 v11, 0x1

    if-le v9, v11, :cond_8

    .line 47
    invoke-static {v3}, Ll/ᩳܽᩳ;->֫(Ljava/util/jar/Attributes;)Ljava/util/TreeMap;

    move-result-object v3

    .line 48
    invoke-virtual {v8}, Ljava/util/jar/Attributes$Name;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    invoke-static {v10, v3}, Ll/ᩳܽᩳ;->֫(Ljava/io/OutputStream;Ljava/util/TreeMap;)V

    .line 60
    :cond_8
    invoke-static {v10}, Ll/ᩳܽᩳ;->֫(Ljava/io/ByteArrayOutputStream;)V

    .line 397
    invoke-static/range {p3 .. p3}, Ll/ۗܽᩳ;->֫(Ll/ܰۧᩳ;)Ljava/lang/String;

    move-result-object v3

    .line 398
    invoke-virtual {v7}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 399
    invoke-virtual {v2, v5, v6}, Ll/᩻ܽᩳ;->֫(J)V

    .line 400
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 401
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [B

    .line 402
    invoke-virtual {v4, v8}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v8

    .line 403
    new-instance v11, Ljava/util/jar/Attributes;

    invoke-direct {v11}, Ljava/util/jar/Attributes;-><init>()V

    const/4 v12, 0x2

    .line 327
    invoke-static {v8, v12}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v8

    .line 404
    invoke-virtual {v11, v3, v8}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    invoke-static {v10, v9, v11}, Ll/ᩳܽᩳ;->֫(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;Ljava/util/jar/Attributes;)V

    goto :goto_3

    .line 407
    :cond_9
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v3

    if-lez v3, :cond_a

    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v3

    rem-int/lit16 v3, v3, 0x400

    if-nez v3, :cond_a

    .line 60
    invoke-static {v10}, Ll/ᩳܽᩳ;->֫(Ljava/io/ByteArrayOutputStream;)V

    :cond_a
    add-long v5, v5, v18

    .line 411
    invoke-virtual {v2, v5, v6}, Ll/᩻ܽᩳ;->֫(J)V

    .line 415
    invoke-virtual/range {p2 .. p2}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v2

    .line 416
    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v1, v4}, Ll/ۛܿᩳ;->֫(Ljava/security/PublicKey;Ll/ܰۧᩳ;Z)Ll/ܺ᩺ۘ;

    move-result-object v3

    .line 417
    invoke-interface {v3}, Ll/ܺ᩺ۘ;->first()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v4

    .line 418
    invoke-virtual/range {p2 .. p2}, Ll/۬ܿᩳ;->ܺ()Ljava/security/PrivateKey;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 419
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/security/Signature;->update([B)V

    .line 420
    invoke-virtual {v4}, Ljava/security/Signature;->sign()[B

    move-result-object v4

    move-object/from16 v5, p4

    .line 423
    iget-object v5, v5, Ll/۟ۧᩳ;->ۧ:Ljava/lang/String;

    if-eqz v5, :cond_b

    const-string v6, "catch_.me_.if_.you_.can_"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    .line 424
    :cond_b
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_c

    move-object/from16 v5, p5

    goto :goto_5

    :cond_c
    const-string v5, "CN=([^,\\s]+)"

    .line 467
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v6

    invoke-virtual {v6}, Ljavax/security/auth/x500/X500Principal;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 468
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_d

    const/4 v6, 0x1

    .line 469
    invoke-virtual {v5, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_d
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_e

    const-string v6, "[a-zA-Z0-9_\\-]+"

    .line 428
    invoke-virtual {v5, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e

    .line 429
    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_e
    const-string v5, "CERT"

    :goto_5
    const-string v6, ".SF"

    const-string v7, "META-INF/"

    .line 0
    invoke-static {v7, v5, v6}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 433
    iput-object v6, v0, Ll/ۙܽᩳ;->ܽ:Ljava/lang/String;

    const-string v6, "."

    .line 0
    invoke-static {v7, v5, v6}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 434
    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v6

    invoke-interface {v6}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Ll/ۙܽᩳ;->ܿ:Ljava/lang/String;

    .line 435
    new-instance v5, Ll/ۜܳᩳ;

    invoke-direct {v5}, Ll/ۜܳᩳ;-><init>()V

    const/4 v6, 0x1

    .line 436
    iput v6, v5, Ll/ۜܳᩳ;->᩻:I

    .line 437
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v6

    .line 438
    new-instance v7, Ll/᩻ܳᩳ;

    new-instance v8, Ll/۟ܿᩳ;

    new-instance v9, Ll/᩺ᩳᩳ;

    .line 440
    invoke-virtual {v6}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v6

    invoke-direct {v9, v6}, Ll/᩺ᩳᩳ;-><init>([B)V

    .line 441
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v6

    invoke-direct {v8, v9, v6}, Ll/۟ܿᩳ;-><init>(Ll/᩺ᩳᩳ;Ljava/math/BigInteger;)V

    invoke-direct {v7, v8}, Ll/᩻ܳᩳ;-><init>(Ll/۟ܿᩳ;)V

    iput-object v7, v5, Ll/ۜܳᩳ;->ۧ:Ll/᩻ܳᩳ;

    .line 442
    invoke-static/range {p3 .. p3}, Ll/ۛܿᩳ;->֫(Ll/ܰۧᩳ;)Ll/ۛܿᩳ;

    move-result-object v1

    .line 443
    invoke-interface {v3}, Ll/ܺ᩺ۘ;->ᩳ()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛܿᩳ;

    .line 444
    iput-object v1, v5, Ll/ۜܳᩳ;->֫:Ll/ۛܿᩳ;

    .line 445
    iput-object v3, v5, Ll/ۜܳᩳ;->ᩳ:Ll/ۛܿᩳ;

    .line 446
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    iput-object v3, v5, Ll/ۜܳᩳ;->ܽ:Ljava/nio/ByteBuffer;

    .line 448
    new-instance v3, Ll/ܳܳᩳ;

    invoke-direct {v3}, Ll/ܳܳᩳ;-><init>()V

    .line 449
    new-instance v4, Ljava/util/ArrayList;

    const/4 v6, 0x1

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v4, v3, Ll/ܳܳᩳ;->֫:Ljava/util/List;

    .line 450
    new-instance v7, Ll/᩺ᩳᩳ;

    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v2

    invoke-direct {v7, v2}, Ll/᩺ᩳᩳ;-><init>([B)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 451
    iput v6, v3, Ll/ܳܳᩳ;->ܳ:I

    .line 452
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v3, Ll/ܳܳᩳ;->ܽ:Ljava/util/List;

    .line 453
    new-instance v1, Ll/ܰܿᩳ;

    const-string v2, "1.2.840.113549.1.7.1"

    invoke-direct {v1, v2}, Ll/ܰܿᩳ;-><init>(Ljava/lang/String;)V

    iput-object v1, v3, Ll/ܳܳᩳ;->ᩳ:Ll/ܰܿᩳ;

    .line 454
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v3, Ll/ܳܳᩳ;->ܿ:Ljava/util/List;

    .line 456
    new-instance v1, Ll/᩺ܿᩳ;

    invoke-direct {v1}, Ll/᩺ܿᩳ;-><init>()V

    const-string v2, "1.2.840.113549.1.7.2"

    .line 457
    iput-object v2, v1, Ll/᩺ܿᩳ;->ۧ:Ljava/lang/String;

    .line 458
    new-instance v2, Ll/᩺ᩳᩳ;

    invoke-static {v3}, Ll/ۤᩳᩳ;->ܽ(Ljava/lang/Object;)[B

    move-result-object v3

    invoke-direct {v2, v3}, Ll/᩺ᩳᩳ;-><init>([B)V

    iput-object v2, v1, Ll/᩺ܿᩳ;->֫:Ll/᩺ᩳᩳ;

    .line 460
    iget-object v2, v0, Ll/ۙܽᩳ;->ᩳ:Ljava/io/ByteArrayOutputStream;

    invoke-static {v1}, Ll/ۤᩳᩳ;->ܽ(Ljava/lang/Object;)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write([B)V

    return-void

    .line 40
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, p9

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v4, p8

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    move-object v4, v14

    move-object v3, v15

    .line 49
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
