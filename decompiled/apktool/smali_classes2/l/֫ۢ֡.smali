.class public abstract Ll/֫ۢ֡;
.super Ljava/io/InputStream;
.source "58FP"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩶:Ljava/nio/ByteBuffer;

.field public final ᩸:J

.field public ᩹:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 3

    .line 41
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    add-long v0, p1, p3

    .line 42
    iput-wide v0, p0, Ll/֫ۢ֡;->᩸:J

    cmp-long v2, v0, p1

    if-ltz v2, :cond_0

    .line 47
    iput-wide p1, p0, Ll/֫ۢ֡;->᩹:J

    return-void

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid length of stream at offset="

    const-string v2, ", length="

    .line 0
    invoke-static {v1, v2, p1, p2}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 45
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final declared-synchronized read()I
    .locals 7

    move-object v0, p0

    monitor-enter v0

    .line 52
    :try_start_0
    iget-wide v1, p0, Ll/֫ۢ֡;->᩹:J

    iget-wide v3, p0, Ll/֫ۢ֡;->᩸:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, -0x1

    cmp-long v6, v1, v3

    if-ltz v6, :cond_0

    .line 53
    monitor-exit v0

    return v5

    .line 55
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/֫ۢ֡;->᩶:Ljava/nio/ByteBuffer;

    const/4 v2, 0x1

    if-nez v1, :cond_1

    .line 56
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Ll/֫ۢ֡;->᩶:Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 60
    :goto_0
    iget-wide v3, p0, Ll/֫ۢ֡;->᩹:J

    iget-object v1, p0, Ll/֫ۢ֡;->᩶:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v3, v4, v1}, Ll/֫ۢ֡;->֫(JLjava/nio/ByteBuffer;)I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ge v1, v2, :cond_2

    .line 62
    monitor-exit v0

    return v5

    .line 64
    :cond_2
    :try_start_2
    iget-wide v1, p0, Ll/֫ۢ֡;->᩹:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/֫ۢ֡;->᩹:J

    .line 65
    iget-object v1, p0, Ll/֫ۢ֡;->᩶:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    and-int/lit16 v1, v1, 0xff

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public final declared-synchronized read([BII)I
    .locals 7

    move-object v0, p0

    monitor-enter v0

    .line 70
    :try_start_0
    iget-wide v1, p0, Ll/֫ۢ֡;->᩹:J

    iget-wide v3, p0, Ll/֫ۢ֡;->᩸:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    .line 71
    monitor-exit v0

    const/4 p1, -0x1

    return p1

    :cond_0
    int-to-long v5, p3

    sub-long/2addr v3, v1

    .line 73
    :try_start_1
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-wide/16 v3, 0x0

    cmp-long p3, v1, v3

    if-gtz p3, :cond_1

    .line 75
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_1
    if-ltz p2, :cond_3

    .line 77
    :try_start_2
    array-length p3, p1

    if-gt p2, p3, :cond_3

    array-length p3, p1

    sub-int/2addr p3, p2

    int-to-long v3, p3

    cmp-long p3, v1, v3

    if-gtz p3, :cond_3

    long-to-int p3, v1

    .line 81
    invoke-static {p1, p2, p3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 82
    iget-wide p2, p0, Ll/֫ۢ֡;->᩹:J

    invoke-virtual {p0, p2, p3, p1}, Ll/֫ۢ֡;->֫(JLjava/nio/ByteBuffer;)I

    move-result p1

    if-lez p1, :cond_2

    .line 84
    iget-wide p2, p0, Ll/֫ۢ֡;->᩹:J

    int-to-long v1, p1

    add-long/2addr p2, v1

    iput-wide p2, p0, Ll/֫ۢ֡;->᩹:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    :cond_2
    monitor-exit v0

    return p1

    .line 78
    :cond_3
    :try_start_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "offset or len are out of bounds"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract ֫(JLjava/nio/ByteBuffer;)I
.end method
