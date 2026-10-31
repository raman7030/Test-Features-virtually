.class public Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
.super Ljava/io/FilterOutputStream;
.source "ZstdOutputStreamNoFinalizer.java"


# static fields
.field public static final dstSize:I


# instance fields
.field public final bufferPool:Lcom/github/luben/zstd/BufferPool;

.field public closeFrameOnFlush:Z

.field public final dst:[B

.field public final dstByteBuffer:Ljava/nio/ByteBuffer;

.field public dstPos:J

.field public frameClosed:Z

.field public frameStarted:Z

.field public isClosed:Z

.field public srcPos:J

.field public final stream:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 18
    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    .line 30
    invoke-static {}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->recommendedCOutSize()J

    move-result-wide v0

    long-to-int v1, v0

    sput v1, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    .line 60
    sget-object v0, Lcom/github/luben/zstd/NoPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {p0, p1, v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 2

    .line 51
    sget-object v0, Lcom/github/luben/zstd/NoPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {p0, p1, v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    .line 52
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p2}, Lcom/github/luben/zstd/Zstd;->setCompressionLevel(JI)I

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V
    .locals 2

    .line 79
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    const-wide/16 v0, 0x0

    .line 24
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->srcPos:J

    .line 25
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    const/4 p1, 0x0

    .line 29
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    .line 31
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->closeFrameOnFlush:Z

    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    .line 33
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameStarted:Z

    .line 81
    invoke-static {}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->createCStream()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    .line 82
    iput-object p2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    .line 83
    sget p1, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    invoke-static {p2, p1}, Lcom/github/luben/zstd/Zstd;->getArrayBackedBuffer(Lcom/github/luben/zstd/BufferPool;I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstByteBuffer:Ljava/nio/ByteBuffer;

    .line 84
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;I)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    .line 70
    iget-wide p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {p1, p2, p3}, Lcom/github/luben/zstd/Zstd;->setCompressionLevel(JI)I

    return-void
.end method

.method private close(Z)V
    .locals 7

    .line 414
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 422
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameStarted:Z

    const/4 v2, 0x0

    if-nez v1, :cond_2

    .line 423
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-direct {p0, v3, v4}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->resetCStream(J)I

    move-result v1

    int-to-long v3, v1

    .line 424
    invoke-static {v3, v4}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v1

    if-nez v1, :cond_1

    .line 427
    iput-boolean v2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    goto :goto_0

    .line 425
    :cond_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v3, v4}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 430
    :cond_2
    :goto_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-nez v1, :cond_5

    .line 432
    :cond_3
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    iget-object v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    sget v5, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    invoke-direct {p0, v3, v4, v1, v5}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->endStream(J[BI)I

    move-result v1

    int-to-long v3, v1

    .line 433
    invoke-static {v3, v4}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v5

    if-nez v5, :cond_4

    .line 436
    iget-object v3, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v4, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    iget-wide v5, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    long-to-int v6, v5

    invoke-virtual {v3, v4, v2, v6}, Ljava/io/OutputStream;->write([BII)V

    if-gtz v1, :cond_3

    goto :goto_1

    .line 434
    :cond_4
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v3, v4}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :cond_5
    :goto_1
    if-eqz p1, :cond_6

    .line 440
    iget-object p1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 444
    :cond_6
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    .line 445
    iget-object p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstByteBuffer:Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V

    .line 446
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->freeCStream(J)I

    return-void

    :catchall_0
    move-exception p1

    .line 444
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    .line 445
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    iget-object v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstByteBuffer:Ljava/nio/ByteBuffer;

    invoke-interface {v0, v1}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V

    .line 446
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->freeCStream(J)I

    .line 447
    throw p1
.end method

.method private native compressStream(J[BI[BI)I
.end method

.method public static native createCStream()J
.end method

.method private native endStream(J[BI)I
.end method

.method private native flushStream(J[BI)I
.end method

.method public static native freeCStream(J)I
.end method

.method public static native recommendedCOutSize()J
.end method

.method private native resetCStream(J)I
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x1

    .line 405
    :try_start_0
    invoke-direct {p0, v1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->close(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 406
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

.method public declared-synchronized closeWithoutClosingParentStream()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 409
    :try_start_0
    invoke-direct {p0, v1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->close(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 410
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

.method public declared-synchronized flush()V
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 373
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    if-nez v1, :cond_5

    .line 376
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-nez v1, :cond_4

    .line 377
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->closeFrameOnFlush:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 381
    :cond_0
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    iget-object v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    sget v5, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    invoke-direct {p0, v3, v4, v1, v5}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->endStream(J[BI)I

    move-result v1

    int-to-long v3, v1

    .line 382
    invoke-static {v3, v4}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v5

    if-nez v5, :cond_1

    .line 385
    iget-object v3, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v4, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    iget-wide v5, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    long-to-int v6, v5

    invoke-virtual {v3, v4, v2, v6}, Ljava/io/OutputStream;->write([BII)V

    if-gtz v1, :cond_0

    const/4 v1, 0x1

    .line 387
    iput-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    goto :goto_0

    .line 383
    :cond_1
    new-instance v1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v1, v3, v4}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v1

    .line 392
    :cond_2
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    iget-object v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    sget v5, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    invoke-direct {p0, v3, v4, v1, v5}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->flushStream(J[BI)I

    move-result v1

    int-to-long v3, v1

    .line 393
    invoke-static {v3, v4}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v5

    if-nez v5, :cond_3

    .line 396
    iget-object v3, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v4, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    iget-wide v5, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    long-to-int v6, v5

    invoke-virtual {v3, v4, v2, v6}, Ljava/io/OutputStream;->write([BII)V

    if-gtz v1, :cond_2

    .line 399
    :goto_0
    iget-object v1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    goto :goto_1

    .line 394
    :cond_3
    new-instance v1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v1, v3, v4}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 401
    :cond_4
    :goto_1
    monitor-exit v0

    return-void

    .line 374
    :cond_5
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "StreamClosed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 401
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public declared-synchronized setChainLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 241
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 244
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionChainLog(JI)I

    move-result p1

    int-to-long v1, p1

    .line 245
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 248
    monitor-exit v0

    return-object p0

    .line 246
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 242
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 248
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setChecksum(Z)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 93
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 96
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionChecksums(JZ)I

    move-result p1

    int-to-long v1, p1

    .line 97
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 100
    monitor-exit v0

    return-object p0

    .line 98
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 94
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 100
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setCloseFrameOnFlush(Z)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 309
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_0

    .line 312
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->closeFrameOnFlush:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 313
    monitor-exit v0

    return-object p0

    .line 310
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 313
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 328
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 331
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->loadFastDictCompress(JLcom/github/luben/zstd/ZstdDictCompress;)I

    move-result p1

    int-to-long v1, p1

    .line 332
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 335
    monitor-exit v0

    return-object p0

    .line 333
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 329
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 335
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setDict([B)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 4

    move-object v0, p0

    monitor-enter v0

    .line 317
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 320
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    array-length v3, p1

    invoke-static {v1, v2, p1, v3}, Lcom/github/luben/zstd/Zstd;->loadDictCompress(J[BI)I

    move-result p1

    int-to-long v1, p1

    .line 321
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 324
    monitor-exit v0

    return-object p0

    .line 322
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 318
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 324
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setHashLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 257
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 260
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionHashLog(JI)I

    move-result p1

    int-to-long v1, p1

    .line 261
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 264
    monitor-exit v0

    return-object p0

    .line 262
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 258
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 264
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setJobSize(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 175
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 178
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionJobSize(JI)I

    move-result p1

    int-to-long v1, p1

    .line 179
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 182
    monitor-exit v0

    return-object p0

    .line 180
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 176
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 182
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setLevel(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 109
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 112
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionLevel(JI)I

    move-result p1

    int-to-long v1, p1

    .line 113
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 116
    monitor-exit v0

    return-object p0

    .line 114
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 110
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 116
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setLong(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 125
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 128
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionLong(JI)I

    move-result p1

    int-to-long v1, p1

    .line 129
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 132
    monitor-exit v0

    return-object p0

    .line 130
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 126
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 132
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setMinMatch(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 207
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 210
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionMinMatch(JI)I

    move-result p1

    int-to-long v1, p1

    .line 211
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 214
    monitor-exit v0

    return-object p0

    .line 212
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 208
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 214
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setOverlapLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 158
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 161
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionOverlapLog(JI)I

    move-result p1

    int-to-long v1, p1

    .line 162
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 165
    monitor-exit v0

    return-object p0

    .line 163
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 159
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 165
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setSearchLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 224
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 227
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionSearchLog(JI)I

    move-result p1

    int-to-long v1, p1

    .line 228
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 231
    monitor-exit v0

    return-object p0

    .line 229
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 225
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 231
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setStrategy(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 289
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 292
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionStrategy(JI)I

    move-result p1

    int-to-long v1, p1

    .line 293
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 296
    monitor-exit v0

    return-object p0

    .line 294
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 290
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 296
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setTargetLength(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 191
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 194
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionTargetLength(JI)I

    move-result p1

    int-to-long v1, p1

    .line 195
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 198
    monitor-exit v0

    return-object p0

    .line 196
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 192
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 198
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setWindowLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 273
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 276
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionWindowLog(JI)I

    move-result p1

    int-to-long v1, p1

    .line 277
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 280
    monitor-exit v0

    return-object p0

    .line 278
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 274
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 280
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setWorkers(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 141
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v1, :cond_1

    .line 144
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionWorkers(JI)I

    move-result p1

    int-to-long v1, p1

    .line 145
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 148
    monitor-exit v0

    return-object p0

    .line 146
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 142
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Change of parameter on initialized stream"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 148
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public write(I)V
    .locals 3

    int-to-byte p1, p1

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    .line 366
    invoke-virtual {p0, v1, v2, v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->write([BII)V

    return-void
.end method

.method public declared-synchronized write([BII)V
    .locals 10

    move-object v0, p0

    monitor-enter v0

    .line 339
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    if-nez v1, :cond_5

    .line 342
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 343
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-direct {p0, v3, v4}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->resetCStream(J)I

    move-result v1

    int-to-long v3, v1

    .line 344
    invoke-static {v3, v4}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v1

    if-nez v1, :cond_0

    .line 347
    iput-boolean v2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    const/4 v1, 0x1

    .line 348
    iput-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameStarted:Z

    goto :goto_0

    .line 345
    :cond_0
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v3, v4}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    add-int/2addr p3, p2

    int-to-long v3, p2

    .line 351
    iput-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->srcPos:J

    .line 352
    :cond_2
    :goto_1
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->srcPos:J

    int-to-long v5, p3

    cmp-long p2, v3, v5

    if-gez p2, :cond_4

    .line 353
    iget-wide v4, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    iget-object v6, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    sget v7, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    move-object v3, p0

    move-object v8, p1

    move v9, p3

    invoke-direct/range {v3 .. v9}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->compressStream(J[BI[BI)I

    move-result p2

    int-to-long v3, p2

    .line 354
    invoke-static {v3, v4}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p2

    if-nez p2, :cond_3

    .line 357
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    const-wide/16 v5, 0x0

    cmp-long p2, v3, v5

    if-lez p2, :cond_2

    .line 358
    iget-object p2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    long-to-int v4, v3

    invoke-virtual {p2, v1, v2, v4}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_1

    .line 355
    :cond_3
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v3, v4}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 361
    :cond_4
    monitor-exit v0

    return-void

    .line 340
    :cond_5
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "StreamClosed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 361
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
