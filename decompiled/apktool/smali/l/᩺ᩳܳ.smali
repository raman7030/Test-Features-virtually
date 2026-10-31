.class public final Ll/᩺ᩳܳ;
.super Ljava/io/InputStream;
.source "N6KV"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ۗ:Ljava/util/function/Consumer;

.field public final ۙ:Z

.field public final ۫:Ll/ۨᩳܳ;

.field public final ۬:Ljava/lang/Object;

.field public final ᩶:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/util/function/Consumer;)V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 16
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩺ᩳܳ;->۬:Ljava/lang/Object;

    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/᩺ᩳܳ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v1, p0, Ll/᩺ᩳܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    .line 30
    iput-object v1, p0, Ll/᩺ᩳܳ;->۫:Ll/ۨᩳܳ;

    const/4 v1, 0x0

    .line 31
    iput-boolean v1, p0, Ll/᩺ᩳܳ;->ۙ:Z

    .line 32
    iput-object p2, p0, Ll/᩺ᩳܳ;->ۗ:Ljava/util/function/Consumer;

    .line 33
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ll/ۨᩳܳ;Ljava/util/function/Consumer;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 16
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩺ᩳܳ;->۬:Ljava/lang/Object;

    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/᩺ᩳܳ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/᩺ᩳܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    iput-object p1, p0, Ll/᩺ᩳܳ;->۫:Ll/ۨᩳܳ;

    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Ll/᩺ᩳܳ;->ۙ:Z

    .line 25
    iput-object p2, p0, Ll/᩺ᩳܳ;->ۗ:Ljava/util/function/Consumer;

    return-void
.end method

.method private ֫()Ljava/io/InputStream;
    .locals 4

    .line 37
    iget-object v0, p0, Ll/᩺ᩳܳ;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 38
    :try_start_0
    iget-object v1, p0, Ll/᩺ᩳܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_5

    .line 41
    iget-object v1, p0, Ll/᩺ᩳܳ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/InputStream;

    if-nez v1, :cond_4

    .line 43
    iget-object v1, p0, Ll/᩺ᩳܳ;->۫:Ll/ۨᩳܳ;

    invoke-interface {v1}, Ll/ۨᩳܳ;->֫()Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 47
    iget-object v2, p0, Ll/᩺ᩳܳ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 48
    iget-object v2, p0, Ll/᩺ᩳܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 49
    :cond_0
    iget-object v1, p0, Ll/᩺ᩳܳ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/InputStream;

    if-eqz v1, :cond_2

    .line 128
    new-instance v2, Ll/᩷۠᩷;

    const/4 v3, 0x4

    invoke-direct {v2, v3, v1}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    .line 134
    iget-boolean v1, p0, Ll/᩺ᩳܳ;->ۙ:Z

    if-eqz v1, :cond_1

    sget-object v1, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 135
    :cond_1
    invoke-virtual {v2}, Ll/᩷۠᩷;->run()V

    .line 50
    :cond_2
    :goto_0
    new-instance v1, Ljava/io/IOException;

    const-string v2, "HTML preview stream is closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 45
    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "HTML preview source was not opened"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 53
    :cond_4
    :goto_1
    monitor-exit v0

    return-object v1

    .line 39
    :cond_5
    new-instance v1, Ljava/io/IOException;

    const-string v2, "HTML preview stream is closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 54
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 89
    iget-boolean v0, p0, Ll/᩺ᩳܳ;->᩹:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/᩺ᩳܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 92
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/᩺ᩳܳ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    if-nez v0, :cond_1

    goto :goto_1

    .line 93
    :cond_1
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 95
    :goto_0
    invoke-virtual {p0}, Ll/᩺ᩳܳ;->close()V

    .line 96
    throw v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public final close()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 120
    iget-object v2, p0, Ll/᩺ᩳܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 121
    iget-object v0, p0, Ll/᩺ᩳܳ;->ۗ:Ljava/util/function/Consumer;

    invoke-interface {v0, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Ll/᩺ᩳܳ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    if-nez v0, :cond_0

    goto :goto_0

    .line 128
    :cond_0
    new-instance v1, Ll/᩷۠᩷;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v0}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    .line 134
    iget-boolean v0, p0, Ll/᩺ᩳܳ;->ۙ:Z

    if-eqz v0, :cond_1

    sget-object v0, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 135
    :cond_1
    invoke-virtual {v1}, Ll/᩷۠᩷;->run()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final read()I
    .locals 2

    .line 59
    iget-boolean v0, p0, Ll/᩺ᩳܳ;->᩹:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    .line 61
    :cond_0
    :try_start_0
    invoke-direct {p0}, Ll/᩺ᩳܳ;->֫()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ne v0, v1, :cond_1

    const/4 v1, 0x1

    .line 113
    iput-boolean v1, p0, Ll/᩺ᩳܳ;->᩹:Z

    .line 114
    invoke-virtual {p0}, Ll/᩺ᩳܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 65
    :goto_0
    invoke-virtual {p0}, Ll/᩺ᩳܳ;->close()V

    .line 66
    throw v0
.end method

.method public final read([BII)I
    .locals 2

    if-ltz p2, :cond_3

    if-ltz p3, :cond_3

    .line 72
    array-length v0, p1

    sub-int/2addr v0, p3

    if-gt p2, v0, :cond_3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 76
    :cond_0
    iget-boolean v0, p0, Ll/᩺ᩳܳ;->᩹:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    return v1

    .line 78
    :cond_1
    :try_start_0
    invoke-direct {p0}, Ll/᩺ᩳܳ;->֫()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ne p1, v1, :cond_2

    const/4 p2, 0x1

    .line 113
    iput-boolean p2, p0, Ll/᩺ᩳܳ;->᩹:Z

    .line 114
    invoke-virtual {p0}, Ll/᩺ᩳܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 82
    :goto_0
    invoke-virtual {p0}, Ll/᩺ᩳܳ;->close()V

    .line 83
    throw p1

    .line 73
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final skip(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    .line 102
    iget-boolean v2, p0, Ll/᩺ᩳܳ;->᩹:Z

    if-eqz v2, :cond_0

    goto :goto_1

    .line 105
    :cond_0
    :try_start_0
    invoke-direct {p0}, Ll/᩺ᩳܳ;->֫()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 107
    :goto_0
    invoke-virtual {p0}, Ll/᩺ᩳܳ;->close()V

    .line 108
    throw p1

    :cond_1
    :goto_1
    return-wide v0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
