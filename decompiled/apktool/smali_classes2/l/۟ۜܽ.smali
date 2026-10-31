.class public final Ll/۟ۜܽ;
.super Ljava/lang/Object;
.source "7B6P"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ᩸:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ll/۟ۜܽ;->᩸:Ljava/io/InputStream;

    return-void
.end method

.method private ֫(I)I
    .locals 2

    .line 130
    iget-object v0, p0, Ll/۟ۜܽ;->᩸:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    and-int/lit16 v0, v0, 0xff

    shl-int p1, v0, p1

    return p1

    .line 132
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 149
    iget-object v0, p0, Ll/۟ۜܽ;->᩸:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final declared-synchronized readInt()I
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 63
    :try_start_0
    invoke-direct {p0, v1}, Ll/۟ۜܽ;->֫(I)I

    move-result v1

    const/16 v2, 0x8

    invoke-direct {p0, v2}, Ll/۟ۜܽ;->֫(I)I

    move-result v2

    or-int/2addr v1, v2

    const/16 v2, 0x10

    invoke-direct {p0, v2}, Ll/۟ۜܽ;->֫(I)I

    move-result v2

    or-int/2addr v1, v2

    const/16 v2, 0x18

    invoke-direct {p0, v2}, Ll/۟ۜܽ;->֫(I)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    or-int/2addr v1, v2

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

.method public final declared-synchronized readShort()S
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 55
    :try_start_0
    invoke-direct {p0, v1}, Ll/۟ۜܽ;->֫(I)I

    move-result v1

    const/16 v2, 0x8

    invoke-direct {p0, v2}, Ll/۟ۜܽ;->֫(I)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    or-int/2addr v1, v2

    int-to-short v1, v1

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

.method public final declared-synchronized skipBytes(I)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-ltz p1, :cond_2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 45
    :try_start_0
    iget-object v2, p0, Ll/۟ۜܽ;->᩸:Ljava/io/InputStream;

    sub-int v3, p1, v1

    int-to-long v3, v3

    invoke-virtual {v2, v3, v4}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v3, v2

    if-lez v3, :cond_0

    add-int/2addr v1, v3

    goto :goto_0

    :cond_0
    if-ne v1, p1, :cond_1

    .line 52
    monitor-exit v0

    return-void

    .line 50
    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 40
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 50
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۛۧ()I
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 59
    :try_start_0
    invoke-direct {p0, v1}, Ll/۟ۜܽ;->֫(I)I

    move-result v1

    const/16 v2, 0x8

    invoke-direct {p0, v2}, Ll/۟ۜܽ;->֫(I)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    or-int/2addr v1, v2

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
