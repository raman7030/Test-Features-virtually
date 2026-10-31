.class public final Ll/ܶۖ֡;
.super Ljava/io/FilterOutputStream;
.source "84T7"


# instance fields
.field public ᩸:Z


# direct methods
.method public constructor <init>(Ljava/io/BufferedOutputStream;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/4 p1, 0x0

    .line 39
    iput-boolean p1, p0, Ll/ܶۖ֡;->᩸:Z

    return-void
.end method


# virtual methods
.method public final declared-synchronized write(I)V
    .locals 3

    move-object v0, p0

    monitor-enter v0

    const/16 v1, 0xa

    const/16 v2, 0xd

    if-eq p1, v1, :cond_1

    if-eq p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 79
    :try_start_0
    iput-boolean p1, p0, Ll/ܶۖ֡;->᩸:Z

    .line 80
    iget-object p1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    monitor-exit v0

    return-void

    .line 83
    :cond_1
    :try_start_1
    iget-boolean v1, p0, Ll/ܶۖ֡;->᩸:Z

    if-nez v1, :cond_2

    .line 84
    iget-object v1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    :cond_2
    :goto_0
    const/4 v1, 0x0

    .line 88
    iput-boolean v1, p0, Ll/ܶۖ֡;->᩸:Z

    .line 89
    iget-object v1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized write([B)V
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 50
    :try_start_0
    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, v1}, Ll/ܶۖ֡;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized write([BII)V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    :goto_0
    add-int/lit8 v1, p3, -0x1

    if-lez p3, :cond_0

    add-int/lit8 p3, p2, 0x1

    .line 64
    :try_start_0
    aget-byte p2, p1, p2

    invoke-virtual {p0, p2}, Ll/ܶۖ֡;->write(I)V

    move p2, p3

    move p3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 66
    :cond_0
    monitor-exit v0

    return-void
.end method
