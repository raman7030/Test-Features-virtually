.class public Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
.super Ljava/io/FilterInputStream;
.source "ZstdInputStreamNoFinalizer.java"

# interfaces
.implements Ll/ܶ֨ᩴ;


# static fields
.field public static final srcBuffSize:I


# instance fields
.field public final bufferPool:Lcom/github/luben/zstd/BufferPool;

.field public dstPos:J

.field public frameFinished:Z

.field public isClosed:Z

.field public isContinuous:Z

.field public needRead:Z

.field public final src:[B

.field public final srcByteBuffer:Ljava/nio/ByteBuffer;

.field public srcPos:J

.field public srcSize:J

.field public final stream:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 23
    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    .line 35
    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->recommendedDInSize()J

    move-result-wide v0

    long-to-int v1, v0

    sput v1, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcBuffSize:I

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 54
    sget-object v0, Lcom/github/luben/zstd/NoPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {p0, p1, v0}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;-><init>(Ljava/io/InputStream;Lcom/github/luben/zstd/BufferPool;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lcom/github/luben/zstd/BufferPool;)V
    .locals 2

    .line 63
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v0, 0x0

    .line 28
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    .line 29
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcPos:J

    .line 30
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z

    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isContinuous:Z

    .line 38
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->frameFinished:Z

    .line 39
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z

    .line 64
    iput-object p2, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    .line 65
    sget p1, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcBuffSize:I

    invoke-static {p2, p1}, Lcom/github/luben/zstd/Zstd;->getArrayBackedBuffer(Lcom/github/luben/zstd/BufferPool;I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcByteBuffer:Ljava/nio/ByteBuffer;

    .line 66
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->src:[B

    move-object v0, p0

    .line 68
    monitor-enter v0

    .line 69
    :try_start_0
    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->createDStream()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->initDStream(J)I

    .line 71
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static native createDStream()J
.end method

.method private native decompressStream(J[BI[BI)I
.end method

.method public static native freeDStream(J)I
.end method

.method private native initDStream(J)I
.end method

.method public static native recommendedDInSize()J
.end method

.method public static native recommendedDOutSize()J
.end method


# virtual methods
.method public declared-synchronized available()I
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 220
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z

    if-nez v1, :cond_1

    .line 223
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 224
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    .line 226
    :cond_0
    :try_start_1
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v1

    .line 221
    :cond_1
    :try_start_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Stream closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 226
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 265
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 266
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 268
    :try_start_1
    iput-boolean v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z

    .line 269
    iget-object v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    iget-object v2, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcByteBuffer:Ljava/nio/ByteBuffer;

    invoke-interface {v1, v2}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V

    .line 270
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->freeDStream(J)I

    .line 271
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 272
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public declared-synchronized getContinuous()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 85
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isContinuous:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public markSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public declared-synchronized read()I
    .locals 5

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    new-array v2, v1, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_0

    .line 210
    invoke-virtual {p0, v2, v3, v1}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->readInternal([BII)I

    move-result v4

    goto :goto_0

    :cond_0
    if-ne v4, v1, :cond_1

    .line 213
    aget-byte v1, v2, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/lit16 v1, v1, 0xff

    monitor-exit v0

    return v1

    .line 215
    :cond_1
    monitor-exit v0

    const/4 v0, -0x1

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public declared-synchronized read([BII)I
    .locals 4

    const-string v1, "Requested length "

    move-object v0, p0

    monitor-enter v0

    if-ltz p2, :cond_2

    .line 127
    :try_start_0
    array-length v2, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int/2addr v2, p2

    if-gt p3, v2, :cond_2

    const/4 v1, 0x0

    if-nez p3, :cond_0

    .line 132
    monitor-exit v0

    return v1

    :cond_0
    :goto_0
    if-nez v1, :cond_1

    .line 136
    :try_start_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->readInternal([BII)I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 138
    :cond_1
    monitor-exit v0

    return v1

    .line 128
    :cond_2
    :try_start_2
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " from offset "

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " in buffer of size "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public readInternal([BII)I
    .locals 19

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v0, p2

    move/from16 v1, p3

    .line 144
    iget-boolean v2, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z

    if-nez v2, :cond_d

    if-ltz v0, :cond_c

    .line 149
    array-length v2, v8

    sub-int/2addr v2, v0

    if-gt v1, v2, :cond_c

    add-int v9, v0, v1

    int-to-long v10, v0

    .line 154
    iput-wide v10, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    const-wide/16 v0, -0x1

    .line 157
    :goto_0
    iget-wide v2, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    int-to-long v12, v9

    cmp-long v4, v2, v12

    if-gez v4, :cond_b

    cmp-long v4, v0, v2

    if-gez v4, :cond_b

    .line 160
    iget-boolean v2, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z

    const/4 v14, 0x0

    if-eqz v2, :cond_6

    iget-object v2, v7, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v2

    if-gtz v2, :cond_0

    iget-wide v2, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    cmp-long v4, v2, v10

    if-nez v4, :cond_6

    .line 161
    :cond_0
    iget-object v2, v7, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v3, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->src:[B

    sget v4, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcBuffSize:I

    invoke-virtual {v2, v3, v14, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    const-wide/16 v4, 0x0

    .line 162
    iput-wide v4, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcPos:J

    cmp-long v6, v2, v4

    if-gez v6, :cond_4

    .line 164
    iput-wide v4, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    .line 165
    iget-boolean v0, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->frameFinished:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    return v1

    .line 167
    :cond_1
    iget-boolean v0, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isContinuous:Z

    if-eqz v0, :cond_3

    .line 168
    iget-wide v2, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    sub-long/2addr v2, v10

    long-to-int v0, v2

    int-to-long v2, v0

    iput-wide v2, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    long-to-int v0, v2

    return v0

    :cond_2
    return v1

    .line 174
    :cond_3
    new-instance v0, Lcom/github/luben/zstd/ZstdIOException;

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->errCorruptionDetected()J

    move-result-wide v1

    const-string v3, "Truncated source"

    invoke-direct {v0, v1, v2, v3}, Lcom/github/luben/zstd/ZstdIOException;-><init>(JLjava/lang/String;)V

    throw v0

    :cond_4
    cmp-long v6, v2, v4

    if-nez v6, :cond_5

    goto :goto_0

    .line 179
    :cond_5
    iput-boolean v14, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->frameFinished:Z

    .line 183
    :cond_6
    iget-wide v5, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    .line 184
    iget-wide v1, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    iget-object v15, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->src:[B

    iget-wide v3, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    long-to-int v4, v3

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move/from16 v16, v4

    move v4, v9

    move-wide/from16 v17, v5

    move-object v5, v15

    move/from16 v6, v16

    invoke-direct/range {v0 .. v6}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->decompressStream(J[BI[BI)I

    move-result v0

    int-to-long v1, v0

    .line 186
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v3

    if-nez v3, :cond_a

    const/4 v1, 0x1

    if-nez v0, :cond_8

    .line 192
    iput-boolean v1, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->frameFinished:Z

    .line 195
    iget-wide v0, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcPos:J

    iget-wide v2, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_7

    const/4 v14, 0x1

    :cond_7
    iput-boolean v14, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z

    .line 196
    iget-wide v0, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    sub-long/2addr v0, v10

    long-to-int v1, v0

    return v1

    .line 200
    :cond_8
    iget-wide v0, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    cmp-long v2, v0, v12

    if-gez v2, :cond_9

    const/4 v14, 0x1

    :cond_9
    iput-boolean v14, v7, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z

    move-wide/from16 v0, v17

    goto/16 :goto_0

    .line 187
    :cond_a
    new-instance v0, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v0, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v0

    :cond_b
    sub-long/2addr v2, v10

    long-to-int v0, v2

    return v0

    .line 150
    :cond_c
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    const-string v3, " from offset "

    const-string v4, " in buffer of size "

    const-string v5, "Requested length "

    .line 0
    invoke-static {v5, v1, v3, v4, v0}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 150
    array-length v1, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 145
    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public declared-synchronized setContinuous(Z)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 80
    :try_start_0
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isContinuous:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setDict(Lcom/github/luben/zstd/ZstdDictDecompress;)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 4

    move-object v0, p0

    monitor-enter v0

    .line 97
    :try_start_0
    invoke-virtual {p1}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 99
    :try_start_1
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->loadFastDictDecompress(JLcom/github/luben/zstd/ZstdDictDecompress;)I

    move-result v1

    int-to-long v1, v1

    .line 100
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_0

    .line 104
    :try_start_2
    invoke-virtual {p1}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 106
    monitor-exit v0

    return-object p0

    .line 101
    :cond_0
    :try_start_3
    new-instance v3, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v3, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v1

    .line 104
    :try_start_4
    invoke-virtual {p1}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    .line 105
    throw v1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public declared-synchronized setDict([B)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 4

    move-object v0, p0

    monitor-enter v0

    .line 89
    :try_start_0
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    array-length v3, p1

    invoke-static {v1, v2, p1, v3}, Lcom/github/luben/zstd/Zstd;->loadDictDecompress(J[BI)I

    move-result p1

    int-to-long v1, p1

    .line 90
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 93
    monitor-exit v0

    return-object p0

    .line 91
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    .line 93
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setLongMax(I)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 110
    :try_start_0
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setDecompressionLongMax(JI)I

    move-result p1

    int-to-long v1, p1

    .line 111
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 114
    monitor-exit v0

    return-object p0

    .line 112
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    .line 114
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setRefMultipleDDicts(Z)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 118
    :try_start_0
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    invoke-static {v1, v2, p1}, Lcom/github/luben/zstd/Zstd;->setRefMultipleDDicts(JZ)I

    move-result p1

    int-to-long v1, p1

    .line 119
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 122
    monitor-exit v0

    return-object p0

    .line 120
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    .line 122
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized skip(J)J
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 237
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_4

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-gtz v3, :cond_0

    .line 241
    monitor-exit v0

    return-wide v1

    .line 243
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->recommendedDOutSize()J

    move-result-wide v3

    long-to-int v4, v3

    int-to-long v5, v4

    cmp-long v3, v5, p1

    if-lez v3, :cond_1

    long-to-int v4, p1

    .line 247
    :cond_1
    iget-object v3, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    invoke-static {v3, v4}, Lcom/github/luben/zstd/Zstd;->getArrayBackedBuffer(Lcom/github/luben/zstd/BufferPool;I)Ljava/nio/ByteBuffer;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 250
    :try_start_2
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    move-wide v6, p1

    :goto_0
    cmp-long v8, v6, v1

    if-lez v8, :cond_3

    int-to-long v8, v4

    .line 252
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    long-to-int v9, v8

    const/4 v8, 0x0

    invoke-virtual {p0, v5, v8, v9}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->read([BII)I

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-gez v8, :cond_2

    goto :goto_1

    :cond_2
    int-to-long v8, v8

    sub-long/2addr v6, v8

    goto :goto_0

    .line 259
    :cond_3
    :goto_1
    :try_start_3
    iget-object v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    invoke-interface {v1, v3}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    sub-long/2addr p1, v6

    .line 261
    monitor-exit v0

    return-wide p1

    :catchall_0
    move-exception p1

    .line 259
    :try_start_4
    iget-object p2, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    invoke-interface {p2, v3}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V

    .line 260
    throw p1

    .line 238
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 260
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
