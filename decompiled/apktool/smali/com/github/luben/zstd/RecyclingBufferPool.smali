.class public Lcom/github/luben/zstd/RecyclingBufferPool;
.super Ljava/lang/Object;
.source "RecyclingBufferPool.java"

# interfaces
.implements Lcom/github/luben/zstd/BufferPool;


# static fields
.field public static final INSTANCE:Lcom/github/luben/zstd/BufferPool;

.field public static final buffSize:I


# instance fields
.field public final pool:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 14
    new-instance v0, Lcom/github/luben/zstd/RecyclingBufferPool;

    invoke-direct {v0}, Lcom/github/luben/zstd/RecyclingBufferPool;-><init>()V

    sput-object v0, Lcom/github/luben/zstd/RecyclingBufferPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    .line 17
    invoke-static {}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->recommendedCOutSize()J

    move-result-wide v0

    long-to-int v1, v0

    .line 18
    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->recommendedDInSize()J

    move-result-wide v2

    long-to-int v0, v2

    .line 16
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 19
    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->recommendedDOutSize()J

    move-result-wide v1

    long-to-int v2, v1

    .line 16
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Lcom/github/luben/zstd/RecyclingBufferPool;->buffSize:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/github/luben/zstd/RecyclingBufferPool;->pool:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-void
.end method


# virtual methods
.method public get(I)Ljava/nio/ByteBuffer;
    .locals 5

    .line 29
    sget v0, Lcom/github/luben/zstd/RecyclingBufferPool;->buffSize:I

    if-gt p1, v0, :cond_2

    .line 39
    :cond_0
    iget-object p1, p0, Lcom/github/luben/zstd/RecyclingBufferPool;->pool:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/SoftReference;

    if-nez p1, :cond_1

    .line 42
    sget p1, Lcom/github/luben/zstd/RecyclingBufferPool;->buffSize:I

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    .line 44
    :cond_1
    invoke-virtual {p1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_0

    return-object p1

    .line 30
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, ". Supported buffer sizes: "

    const-string v3, " or smaller."

    const-string v4, "Unsupported buffer size: "

    .line 0
    invoke-static {v4, p1, v2, v3, v0}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public release(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 53
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    sget v1, Lcom/github/luben/zstd/RecyclingBufferPool;->buffSize:I

    if-lt v0, v1, :cond_0

    .line 54
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 55
    iget-object v0, p0, Lcom/github/luben/zstd/RecyclingBufferPool;->pool:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
