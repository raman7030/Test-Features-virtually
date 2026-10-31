.class public final Ll/ۨۡ֡;
.super Ll/ۛۡ֡;
.source "K2S3"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 103
    invoke-direct {p0}, Ll/ۛۡ֡;-><init>()V

    move-object v0, p0

    .line 107
    monitor-enter v0

    const/16 v1, 0x400

    .line 108
    :try_start_0
    invoke-virtual {p0, v1}, Ll/ۛۡ֡;->֫(I)V

    .line 109
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final declared-synchronized write(I)V
    .locals 1

    move-object v0, p0

    monitor-enter v0

    .line 159
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۛۡ֡;->ۧ(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
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

.method public final write([BII)V
    .locals 2

    if-ltz p2, :cond_1

    .line 137
    array-length v0, p1

    if-gt p2, v0, :cond_1

    if-ltz p3, :cond_1

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_1

    if-ltz v0, :cond_1

    if-nez p3, :cond_0

    return-void

    :cond_0
    move-object v0, p0

    .line 147
    monitor-enter v0

    .line 148
    :try_start_0
    invoke-virtual {p0, p2, p3, p1}, Ll/ۛۡ֡;->ܿ(II[B)V

    .line 149
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 142
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final declared-synchronized ֫()[B
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 127
    :try_start_0
    invoke-virtual {p0}, Ll/ۛۡ֡;->ܽ()[B

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
