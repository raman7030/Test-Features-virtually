.class public final Lorg/bouncycastle/crypto/signers/Ed448Signer$Buffer;
.super Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/crypto/signers/Ed448Signer$1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/signers/Ed448Signer$Buffer;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized generateSignature(Lorg/bouncycastle/crypto/params/Ed448PrivateKeyParameters;[B)[B
    .locals 10

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/16 v1, 0x72

    :try_start_0
    new-array v1, v1, [B

    iget-object v5, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    iget v7, p0, Ljava/io/ByteArrayOutputStream;->count:I

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    move-object v4, p2

    move-object v8, v1

    invoke-virtual/range {v2 .. v9}, Lorg/bouncycastle/crypto/params/Ed448PrivateKeyParameters;->sign(I[B[BII[BI)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/signers/Ed448Signer$Buffer;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized reset()V
    .locals 4

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    iget v2, p0, Ljava/io/ByteArrayOutputStream;->count:I

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lorg/bouncycastle/util/Arrays;->fill([BIIB)V

    iput v3, p0, Ljava/io/ByteArrayOutputStream;->count:I
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

.method public declared-synchronized verifySignature(Lorg/bouncycastle/crypto/params/Ed448PublicKeyParameters;[B[B)Z
    .locals 9

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    array-length v1, p3

    const/16 v2, 0x72

    if-eq v2, v1, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/signers/Ed448Signer$Buffer;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_1
    iget-object v4, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    iget v6, p0, Ljava/io/ByteArrayOutputStream;->count:I

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v3, p2

    move-object v7, p3

    invoke-virtual/range {v1 .. v8}, Lorg/bouncycastle/crypto/params/Ed448PublicKeyParameters;->verify(I[B[BII[BI)Z

    move-result p1

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/signers/Ed448Signer$Buffer;->reset()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
