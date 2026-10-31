.class public Lorg/bouncycastle/pqc/crypto/lms/HSS;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static generateHSSKeyPair(Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;
    .locals 23

    .line 0
    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getDepth()I

    move-result v0

    new-array v1, v0, [Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getDepth()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    new-array v2, v2, [Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getLmsParameters()[Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    move-result-object v4

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;->getLMSigParam()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->getM()I

    move-result v4

    new-array v4, v4, [B

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/crypto/KeyGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/16 v6, 0x10

    new-array v13, v6, [B

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/crypto/KeyGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object v6

    invoke-virtual {v6, v13}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-array v15, v5, [B

    const-wide/16 v6, 0x1

    move-wide/from16 v21, v6

    :goto_0
    if-ge v5, v0, :cond_1

    if-nez v5, :cond_0

    new-instance v14, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getLmsParameters()[Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    move-result-object v6

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;->getLMSigParam()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getLmsParameters()[Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    move-result-object v6

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;->getLMOTSParam()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getLmsParameters()[Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    move-result-object v6

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;->getLMSigParam()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->getH()I

    move-result v6

    shl-int v11, v3, v6

    const/4 v9, 0x0

    move-object v6, v14

    move-object v10, v13

    move-object v12, v4

    invoke-direct/range {v6 .. v12}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;I[BI[B)V

    aput-object v14, v1, v5

    move-object v8, v15

    goto :goto_1

    :cond_0
    new-instance v6, Lorg/bouncycastle/pqc/crypto/lms/HSS$PlaceholderLMSPrivateKey;

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getLmsParameters()[Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    move-result-object v7

    aget-object v7, v7, v5

    invoke-virtual {v7}, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;->getLMSigParam()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getLmsParameters()[Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    move-result-object v8

    aget-object v8, v8, v5

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;->getLMOTSParam()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getLmsParameters()[Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    move-result-object v8

    aget-object v8, v8, v5

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;->getLMSigParam()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v8

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->getH()I

    move-result v8

    shl-int v19, v3, v8

    const/16 v17, -0x1

    move-object v14, v6

    move-object v8, v15

    move-object v15, v7

    move-object/from16 v18, v8

    move-object/from16 v20, v8

    invoke-direct/range {v14 .. v20}, Lorg/bouncycastle/pqc/crypto/lms/HSS$PlaceholderLMSPrivateKey;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;I[BI[B)V

    aput-object v6, v1, v5

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getLmsParameters()[Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    move-result-object v6

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;->getLMSigParam()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->getH()I

    move-result v6

    shl-int v6, v3, v6

    int-to-long v6, v6

    mul-long v21, v21, v6

    add-int/lit8 v5, v5, 0x1

    move-object v15, v8

    goto :goto_0

    :cond_1
    const-wide/16 v3, 0x0

    cmp-long v0, v21, v3

    if-nez v0, :cond_2

    const-wide v21, 0x7fffffffffffffffL

    :cond_2
    move-wide/from16 v9, v21

    new-instance v0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    invoke-virtual/range {p0 .. p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSKeyGenerationParameters;->getDepth()I

    move-result v4

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-wide/16 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v10}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;-><init>(ILjava/util/List;Ljava/util/List;JJ)V

    return-object v0
.end method

.method public static generateSignature(ILorg/bouncycastle/pqc/crypto/lms/LMSContext;)Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;->getSignedPubKeys()[Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;

    move-result-object v1

    invoke-static {p1}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->generateSign(Lorg/bouncycastle/pqc/crypto/lms/LMSContext;)Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    move-result-object p1

    invoke-direct {v0, p0, v1, p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;-><init>(I[Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;)V

    return-object v0
.end method

.method public static generateSignature(Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;[B)Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;
    .locals 13

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getL()I

    move-result v1

    move-object v0, p0

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSS;->rangeTestKeys(Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;)V

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getKeys()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getSig()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getKeys()Ljava/util/List;

    move-result-object v4

    add-int/lit8 v5, v1, -0x1

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    new-array v6, v5, [Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v5, :cond_0

    new-instance v9, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    add-int/lit8 v11, v8, 0x1

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v12}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v12

    invoke-direct {v9, v10, v12}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;)V

    aput-object v9, v6, v8

    move v8, v11

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->incIndex()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->generateLMSContext()Lorg/bouncycastle/pqc/crypto/lms/LMSContext;

    move-result-object p0

    invoke-virtual {p0, v6}, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;->withSignedPublicKeys([Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;)Lorg/bouncycastle/pqc/crypto/lms/LMSContext;

    move-result-object p0

    array-length v0, p1

    invoke-virtual {p0, p1, v7, v0}, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;->update([BII)V

    invoke-static {v1, p0}, Lorg/bouncycastle/pqc/crypto/lms/HSS;->generateSignature(ILorg/bouncycastle/pqc/crypto/lms/LMSContext;)Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static incrementIndex(Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSS;->rangeTestKeys(Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;)V

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->incIndex()V

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getKeys()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getL()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->incIndex()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static rangeTestKeys(Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;)V
    .locals 8

    const-string v1, "hss private key"

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getIndex()J

    move-result-wide v2

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getIndexLimit()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_1

    new-instance v2, Lorg/bouncycastle/pqc/crypto/ExhaustedPrivateKeyException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, " shard"

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is exhausted"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Lorg/bouncycastle/pqc/crypto/ExhaustedPrivateKeyException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getL()I

    move-result v1

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getKeys()Ljava/util/List;

    move-result-object v2

    move v3, v1

    :goto_1
    add-int/lit8 v4, v3, -0x1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getIndex()I

    move-result v5

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getSigParameters()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->getH()I

    move-result v6

    const/4 v7, 0x1

    shl-int v6, v7, v6

    if-ne v5, v6, :cond_4

    if-nez v4, :cond_3

    new-instance v1, Lorg/bouncycastle/pqc/crypto/ExhaustedPrivateKeyException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hss private key"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard()Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, " shard"

    goto :goto_2

    :cond_2
    const-string p0, ""

    :goto_2
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is exhausted the maximum limit for this HSS private key"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lorg/bouncycastle/pqc/crypto/ExhaustedPrivateKeyException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move v3, v4

    goto :goto_1

    :cond_4
    :goto_3
    if-ge v3, v1, :cond_5

    invoke-virtual {p0, v3}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->replaceConsumedKey(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static verifySignature(Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;[B)Z
    .locals 6

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;->getlMinus1()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->getL()I

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    return v3

    :cond_0
    new-array v1, v1, [Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    new-array v2, v0, [Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_1

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;->getSignedPubKey()[Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;

    move-result-object v5

    aget-object v5, v5, v4

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;->getSignature()Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    move-result-object v5

    aput-object v5, v1, v4

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;->getSignedPubKey()[Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;

    move-result-object v5

    aget-object v5, v5, v4

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;->getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;->getSignature()Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    move-result-object p1

    aput-object p1, v1, v0

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->getLMSPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object p0

    const/4 p1, 0x0

    :goto_1
    if-ge p1, v0, :cond_3

    aget-object v4, v1, p1

    aget-object v5, v2, p1

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->toByteArray()[B

    move-result-object v5

    invoke-static {p0, v4, v5}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->verifySignature(Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;[B)Z

    move-result p0

    if-nez p0, :cond_2

    return v3

    :cond_2
    :try_start_0
    aget-object p0, v2, p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_3
    aget-object p1, v1, v0

    invoke-static {p0, p1, p2}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->verifySignature(Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;[B)Z

    move-result p0

    return p0
.end method
