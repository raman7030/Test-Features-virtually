.class public Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;
.super Lorg/bouncycastle/pqc/crypto/lms/LMSKeyParameters;

# interfaces
.implements Lorg/bouncycastle/pqc/crypto/lms/LMSContextBasedSigner;


# instance fields
.field public index:J

.field public final indexLimit:J

.field public final isShard:Z

.field public keys:Ljava/util/List;

.field public final l:I

.field public publicKey:Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

.field public sig:Ljava/util/List;


# direct methods
.method public constructor <init>(ILjava/util/List;Ljava/util/List;JJ)V
    .locals 2

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/crypto/lms/LMSKeyParameters;-><init>(Z)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-static {p3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    iput-wide p4, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    iput-wide p6, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->indexLimit:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard:Z

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->resetKeyToIndex()V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/util/List;JJZ)V
    .locals 2

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/crypto/lms/LMSKeyParameters;-><init>(Z)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-static {p3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    iput-wide p4, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    iput-wide p6, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->indexLimit:J

    iput-boolean p8, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard:Z

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;JJ)V
    .locals 3

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/crypto/lms/LMSKeyParameters;-><init>(Z)V

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    iput-wide p2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    iput-wide p4, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->indexLimit:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard:Z

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->resetKeyToIndex()V

    return-void
.end method

.method public static getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;
    .locals 11

    instance-of v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/io/DataInputStream;

    if-eqz v0, :cond_4

    move-object v0, p0

    check-cast v0, Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v6

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v8

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readBoolean()Z

    move-result v10

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_1

    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/lit8 v1, v3, -0x1

    if-ge v0, v1, :cond_2

    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    new-instance p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    move-object v2, p0

    invoke-direct/range {v2 .. v10}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;-><init>(ILjava/util/List;Ljava/util/List;JJZ)V

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "unknown version for hss private key"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    instance-of v0, p0, [B

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    move-object v3, p0

    check-cast v3, [B

    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v1}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_0
    :try_start_2
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    move-result-object v3

    new-instance p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getIndex()I

    move-result v0

    int-to-long v4, v0

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getIndexLimit()I

    move-result v0

    int-to-long v6, v0

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object p0

    :goto_2
    move-object v0, v1

    goto :goto_3

    :catchall_1
    move-exception p0

    :goto_3
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_5
    throw p0

    :cond_6
    instance-of v0, p0, Ljava/io/InputStream;

    if-eqz v0, :cond_7

    check-cast p0, Ljava/io/InputStream;

    invoke-static {p0}, Lorg/bouncycastle/util/io/Streams;->readAll(Ljava/io/InputStream;)[B

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot parse "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getInstance([B[B)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;
    .locals 0

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    move-result-object p0

    invoke-static {p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->publicKey:Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

    return-object p0
.end method

.method public static makeCopy(Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;
    .locals 2

    .line 0
    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getEncoded()[B

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->makeCopy(Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_7

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    iget v2, p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-boolean v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard:Z

    iget-boolean v2, p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard:Z

    if-eq v1, v2, :cond_3

    return v0

    :cond_3
    iget-wide v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->indexLimit:J

    iget-wide v3, p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->indexLimit:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_4

    return v0

    :cond_4
    iget-wide v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    iget-wide v3, p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_5

    return v0

    :cond_5
    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    iget-object v2, p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    iget-object p1, p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    :goto_0
    return v0
.end method

.method public extractKeyShard(I)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;
    .locals 14

    move-object v0, p0

    .line 0
    monitor-enter v0

    if-ltz p1, :cond_1

    int-to-long v1, p1

    :try_start_0
    iget-wide v3, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->indexLimit:J

    iget-wide v9, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    sub-long/2addr v3, v9

    cmp-long p1, v1, v3

    if-gtz p1, :cond_0

    add-long v11, v9, v1

    iput-wide v11, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    new-instance v7, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getKeys()Ljava/util/List;

    move-result-object p1

    invoke-direct {v7, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v8, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getSig()Ljava/util/List;

    move-result-object p1

    invoke-direct {v8, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    iget v6, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    const/4 v13, 0x1

    move-object v5, p1

    invoke-direct/range {v5 .. v13}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;-><init>(ILjava/util/List;Ljava/util/List;JJZ)V

    invoke-static {p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->makeCopy(Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;)Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;

    move-result-object p1

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->resetKeyToIndex()V

    monitor-exit v0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "usageCount exceeds usages remaining in current leaf"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "usageCount cannot be negative"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public generateLMSContext()Lorg/bouncycastle/pqc/crypto/lms/LMSContext;
    .locals 11

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

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    new-array v5, v1, [Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v1, :cond_0

    new-instance v7, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    add-int/lit8 v9, v6, 0x1

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v10}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v10

    invoke-direct {v7, v8, v10}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;)V

    aput-object v7, v5, v6

    move v6, v9

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->incIndex()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->generateLMSContext()Lorg/bouncycastle/pqc/crypto/lms/LMSContext;

    move-result-object v0

    invoke-virtual {v0, v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;->withSignedPublicKeys([Lorg/bouncycastle/pqc/crypto/lms/LMSSignedPubKey;)Lorg/bouncycastle/pqc/crypto/lms/LMSContext;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public generateSignature(Lorg/bouncycastle/pqc/crypto/lms/LMSContext;)[B
    .locals 3

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getL()I

    move-result v0

    .line 7
    invoke-static {v0, p1}, Lorg/bouncycastle/pqc/crypto/lms/HSS;->generateSignature(ILorg/bouncycastle/pqc/crypto/lms/LMSContext;)Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/HSSSignature;->getEncoded()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to encode signature: "

    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public declared-synchronized getEncoded()[B
    .locals 4

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    invoke-static {}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->compose()Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->u32str(I)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v1

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    invoke-virtual {v1, v2}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->u32str(I)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v1

    iget-wide v2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    invoke-virtual {v1, v2, v3}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->u64str(J)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v1

    iget-wide v2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->indexLimit:J

    invoke-virtual {v1, v2, v3}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->u64str(J)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v1

    iget-boolean v2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard:Z

    invoke-virtual {v1, v2}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->bool(Z)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->bytes(Lorg/bouncycastle/util/Encodable;)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->bytes(Lorg/bouncycastle/util/Encodable;)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->build()[B

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public declared-synchronized getIndex()J
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getIndexLimit()J
    .locals 2

    .line 0
    iget-wide v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->indexLimit:J

    return-wide v0
.end method

.method public declared-synchronized getKeys()Ljava/util/List;
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getL()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    return v0
.end method

.method public declared-synchronized getLMSParameters()[Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;
    .locals 7

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    iget-object v4, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    new-instance v5, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getSigParameters()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v6

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getOtsParameters()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v4

    invoke-direct {v5, v6, v4}, Lorg/bouncycastle/pqc/crypto/lms/LMSParameters;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;)V

    aput-object v5, v2, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public declared-synchronized getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;
    .locals 4

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    new-instance v1, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getRootKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/pqc/crypto/lms/HSSPublicKeyParameters;-><init>(ILorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getRootKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    return-object v0
.end method

.method public declared-synchronized getSig()Ljava/util/List;
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getUsagesRemaining()J
    .locals 4

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getIndexLimit()J

    move-result-wide v0

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getIndex()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public hashCode()I
    .locals 6

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->l:I

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->indexLimit:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    return v0
.end method

.method public declared-synchronized incIndex()V
    .locals 5

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->index:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public isShard()Z
    .locals 1

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->isShard:Z

    return v0
.end method

.method public replaceConsumedKey(I)V
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getCurrentOTSKey()Lorg/bouncycastle/pqc/crypto/lms/LMOtsPrivateKey;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPrivateKey;->getParameter()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->getN()I

    move-result v2

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPrivateKey;->getDerivationFunction()Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;

    move-result-object v0

    const/4 v3, -0x2

    invoke-virtual {v0, v3}, Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;->setJ(I)V

    new-array v3, v2, [B

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v4}, Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;->deriveSeed([BZ)V

    new-array v2, v2, [B

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4}, Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;->deriveSeed([BZ)V

    const/16 v0, 0x10

    new-array v5, v0, [B

    invoke-static {v2, v4, v5, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getSigParameters()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v6

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getOtsParameters()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v2

    invoke-static {v6, v2, v4, v5, v3}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->generateKeys(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;I[B[B)Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object p1

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->toByteArray()[B

    move-result-object p1

    invoke-static {v3, p1}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->generateSign(Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;[B)Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    return-void
.end method

.method public resetKeyToIndex()V
    .locals 15

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getKeys()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [J

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getIndex()J

    move-result-wide v3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    :goto_0
    if-ltz v5, :cond_0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v7}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getSigParameters()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v7

    invoke-virtual {v7}, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->getH()I

    move-result v8

    shl-int v8, v6, v8

    sub-int/2addr v8, v6

    int-to-long v8, v8

    and-long/2addr v8, v3

    aput-wide v8, v2, v5

    invoke-virtual {v7}, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->getH()I

    move-result v7

    ushr-long/2addr v3, v7

    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-interface {v0, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    iget-object v4, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    invoke-interface {v4, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->getRootKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    move-result-object v5

    const/4 v7, 0x0

    aget-object v8, v3, v7

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getIndex()I

    move-result v8

    sub-int/2addr v8, v6

    int-to-long v8, v8

    aget-wide v10, v2, v7

    cmp-long v6, v8, v10

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getSigParameters()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v6

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getOtsParameters()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v8

    aget-wide v9, v2, v7

    long-to-int v10, v9

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getI()[B

    move-result-object v9

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getMasterSecret()[B

    move-result-object v5

    invoke-static {v6, v8, v10, v9, v5}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->generateKeys(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;I[B[B)Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    move-result-object v5

    aput-object v5, v3, v7

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    const/4 v6, 0x1

    :goto_2
    if-ge v6, v1, :cond_6

    add-int/lit8 v7, v6, -0x1

    aget-object v8, v3, v7

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getOtsParameters()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v9

    invoke-virtual {v9}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->getN()I

    move-result v9

    const/16 v10, 0x10

    new-array v10, v10, [B

    new-array v11, v9, [B

    new-instance v12, Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getI()[B

    move-result-object v13

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getMasterSecret()[B

    move-result-object v14

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getOtsParameters()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v8

    invoke-static {v8}, Lorg/bouncycastle/pqc/crypto/lms/DigestUtil;->getDigest(Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;)Lorg/bouncycastle/crypto/Digest;

    move-result-object v8

    invoke-direct {v12, v13, v14, v8}, Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;-><init>([B[BLorg/bouncycastle/crypto/Digest;)V

    aget-wide v13, v2, v7

    long-to-int v8, v13

    invoke-virtual {v12, v8}, Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;->setQ(I)V

    const/4 v8, -0x2

    invoke-virtual {v12, v8}, Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;->setJ(I)V

    const/4 v8, 0x1

    invoke-virtual {v12, v11, v8}, Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;->deriveSeed([BZ)V

    new-array v9, v9, [B

    const/4 v13, 0x0

    invoke-virtual {v12, v9, v13}, Lorg/bouncycastle/pqc/crypto/lms/SeedDerive;->deriveSeed([BZ)V

    const/16 v12, 0x10

    invoke-static {v9, v13, v10, v13, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v9, v1, -0x1

    if-ge v6, v9, :cond_2

    aget-wide v12, v2, v6

    aget-object v9, v3, v6

    invoke-virtual {v9}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getIndex()I

    move-result v9

    sub-int/2addr v9, v8

    int-to-long v8, v9

    cmp-long v14, v12, v8

    if-nez v14, :cond_3

    goto :goto_3

    :cond_2
    aget-wide v8, v2, v6

    aget-object v12, v3, v6

    invoke-virtual {v12}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getIndex()I

    move-result v12

    int-to-long v12, v12

    cmp-long v14, v8, v12

    if-nez v14, :cond_3

    :goto_3
    const/4 v8, 0x1

    goto :goto_4

    :cond_3
    const/4 v8, 0x0

    :goto_4
    aget-object v9, v3, v6

    invoke-virtual {v9}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getI()[B

    move-result-object v9

    invoke-static {v10, v9}, Lorg/bouncycastle/util/Arrays;->areEqual([B[B)Z

    move-result v9

    if-eqz v9, :cond_4

    aget-object v9, v3, v6

    invoke-virtual {v9}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getMasterSecret()[B

    move-result-object v9

    invoke-static {v11, v9}, Lorg/bouncycastle/util/Arrays;->areEqual([B[B)Z

    move-result v9

    if-eqz v9, :cond_4

    if-nez v8, :cond_5

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getSigParameters()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v5

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v7}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getOtsParameters()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v7

    aget-wide v8, v2, v6

    long-to-int v9, v8

    invoke-static {v5, v7, v9, v10, v11}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->generateKeys(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;I[B[B)Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    move-result-object v5

    aput-object v5, v3, v6

    goto :goto_5

    :cond_4
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getSigParameters()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    move-result-object v5

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getOtsParameters()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v8

    aget-wide v12, v2, v6

    long-to-int v9, v12

    invoke-static {v5, v8, v9, v10, v11}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->generateKeys(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;I[B[B)Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;

    move-result-object v5

    aput-object v5, v3, v6

    aget-object v8, v3, v7

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;->getPublicKey()Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/lms/LMSPublicKeyParameters;->toByteArray()[B

    move-result-object v5

    invoke-static {v8, v5}, Lorg/bouncycastle/pqc/crypto/lms/LMS;->generateSign(Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;[B)Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;

    move-result-object v5

    aput-object v5, v4, v7

    :goto_5
    const/4 v5, 0x1

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_2

    :cond_6
    if-eqz v5, :cond_7

    invoke-virtual {p0, v3, v4}, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->updateHierarchy([Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;[Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;)V

    :cond_7
    return-void
.end method

.method public updateHierarchy([Lorg/bouncycastle/pqc/crypto/lms/LMSPrivateKeyParameters;[Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;)V
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->keys:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/HSSPrivateKeyParameters;->sig:Ljava/util/List;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
