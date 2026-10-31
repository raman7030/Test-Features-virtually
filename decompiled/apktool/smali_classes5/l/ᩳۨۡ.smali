.class public final Ll/ᩳۨۡ;
.super Ljava/io/InputStream;
.source "N8BL"

# interfaces
.implements Ll/ܶ֨ᩴ;


# static fields
.field public static final ۨ:Ll/ܽۨۡ;


# instance fields
.field public final ۗ:Ljava/io/InputStream;

.field public final ۙ:Ljava/util/concurrent/LinkedBlockingQueue;

.field public final ۛ:Ljava/lang/Thread;

.field public volatile ۤ:Ljava/lang/Exception;

.field public final ۫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ۬:I

.field public ᩶:Ll/ܽۨۡ;

.field public final ᩸:Ljava/util/concurrent/LinkedBlockingQueue;

.field public final ᩹:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ll/ܽۨۡ;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Ll/ܽۨۡ;-><init>([B)V

    sput-object v0, Ll/ᩳۨۡ;->ۨ:Ll/ܽۨۡ;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 5

    .line 63
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 64
    iput-object p1, p0, Ll/ᩳۨۡ;->ۗ:Ljava/io/InputStream;

    .line 65
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Ll/ᩳۨۡ;->ۙ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 66
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Ll/ᩳۨۡ;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 67
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/ᩳۨۡ;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    .line 70
    iput v2, p0, Ll/ᩳۨۡ;->۬:I

    :goto_0
    if-ge v2, v1, :cond_0

    .line 74
    iget-object v0, p0, Ll/ᩳۨۡ;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v3, Ll/ܽۨۡ;

    const/high16 v4, 0x20000

    new-array v4, v4, [B

    invoke-direct {v3, v4}, Ll/ܽۨۡ;-><init>([B)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ll/᩵۫᩻;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0, p1}, Ll/᩵۫᩻;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Ll/ᩳۨۡ;->ۛ:Ljava/lang/Thread;

    const-string p1, "InputStream-Decompress-Thread"

    .line 128
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 129
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 130
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method private ֫()V
    .locals 3

    .line 258
    iget-object v0, p0, Ll/ᩳۨۡ;->ۤ:Ljava/lang/Exception;

    if-eqz v0, :cond_1

    .line 259
    iget-object v0, p0, Ll/ᩳۨۡ;->ۤ:Ljava/lang/Exception;

    instance-of v0, v0, Ljava/io/IOException;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Ll/ᩳۨۡ;->ۤ:Ljava/lang/Exception;

    check-cast v0, Ljava/io/IOException;

    throw v0

    .line 262
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Error in reader thread"

    iget-object v2, p0, Ll/ᩳۨۡ;->ۤ:Ljava/lang/Exception;

    invoke-direct {v0, v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ᩳۨۡ;Ljava/io/InputStream;)V
    .locals 7

    .line 81
    sget-object v0, Ll/ᩳۨۡ;->ۨ:Ll/ܽۨۡ;

    :cond_0
    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v2

    if-nez v2, :cond_4

    .line 83
    iget-object v2, p0, Ll/ᩳۨۡ;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x64

    invoke-virtual {v2, v4, v5, v3}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۡ;

    if-nez v2, :cond_1

    .line 85
    iget-object v2, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 92
    :cond_1
    iget-object v3, v2, Ll/ܽۨۡ;->֫:[B

    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v6, -0x1

    if-ne v3, v6, :cond_2

    .line 96
    iget-object p1, p0, Ll/ᩳۨۡ;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_1

    .line 101
    :cond_2
    iput v3, v2, Ll/ܽۨۡ;->ۧ:I

    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_3

    .line 105
    iget-object v6, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v6

    if-nez v6, :cond_3

    .line 106
    iget-object v3, p0, Ll/ᩳۨۡ;->ۙ:Ljava/util/concurrent/LinkedBlockingQueue;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v2, v4, v5, v6}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    move-result v3

    goto :goto_0

    :cond_3
    if-nez v3, :cond_0

    .line 111
    iget-object p1, p0, Ll/ᩳۨۡ;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    :cond_4
    :goto_1
    iget-object p1, p0, Ll/ᩳۨۡ;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 123
    :try_start_1
    iget-object p0, p0, Ll/ᩳۨۡ;->ۙ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 116
    :try_start_2
    iget-object v2, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_5

    .line 117
    iput-object p1, p0, Ll/ᩳۨۡ;->ۤ:Ljava/lang/Exception;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    :cond_5
    iget-object p1, p0, Ll/ᩳۨۡ;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 123
    :try_start_3
    iget-object p0, p0, Ll/ᩳۨۡ;->ۙ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    return-void

    .line 120
    :goto_2
    iget-object v2, p0, Ll/ᩳۨۡ;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 123
    :try_start_4
    iget-object p0, p0, Ll/ᩳۨۡ;->ۙ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2

    .line 126
    :catch_2
    throw p1
.end method

.method private ܽ()Z
    .locals 8

    .line 208
    iget-object v0, p0, Ll/ᩳۨۡ;->ۙ:Ljava/util/concurrent/LinkedBlockingQueue;

    :try_start_0
    iget-object v1, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x0

    sget-object v3, Ll/ᩳۨۡ;->ۨ:Ll/ܽۨۡ;

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    if-eq v1, v3, :cond_0

    .line 52
    :try_start_1
    iput v4, v1, Ll/ܽۨۡ;->ۧ:I

    .line 210
    iget-object v5, p0, Ll/ᩳۨۡ;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v5, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    .line 211
    iput-object v2, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    .line 215
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v5, p0, Ll/ᩳۨۡ;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v1, :cond_1

    :try_start_2
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v1, :cond_1

    goto :goto_0

    .line 221
    :cond_1
    iget-object v1, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-nez v2, :cond_2

    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v6

    if-nez v6, :cond_2

    .line 222
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x64

    invoke-virtual {v0, v6, v7, v2}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۡ;

    if-nez v2, :cond_1

    .line 227
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 235
    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    :goto_0
    return v4

    :cond_4
    if-ne v2, v3, :cond_5

    .line 241
    iput-object v3, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    return v4

    .line 245
    :cond_5
    iput-object v2, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    .line 246
    iput v4, p0, Ll/ᩳۨۡ;->۬:I
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    .line 249
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 250
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Interrupted while waiting for data"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 297
    iget-object v0, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 301
    iget-object v0, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    if-eqz v0, :cond_0

    .line 302
    iget v0, v0, Ll/ܽۨۡ;->ۧ:I

    iget v1, p0, Ll/ᩳۨۡ;->۬:I

    sub-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 298
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 5

    .line 269
    iget-object v0, p0, Ll/ᩳۨۡ;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, Ll/ᩳۨۡ;->ۛ:Ljava/lang/Thread;

    iget-object v2, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 272
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v2, 0x3e8

    .line 276
    :try_start_1
    invoke-virtual {v1, v2, v3}, Ljava/lang/Thread;->join(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 278
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 282
    :goto_0
    iget-object v1, p0, Ll/ᩳۨۡ;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 285
    iget-object v1, p0, Ll/ᩳۨۡ;->ۙ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    .line 286
    iget-object v1, p0, Ll/ᩳۨۡ;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    const/4 v1, 0x0

    .line 287
    iput-object v1, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 290
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 291
    throw v1

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 3

    .line 143
    iget-object v0, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    .line 148
    invoke-direct {p0}, Ll/ᩳۨۡ;->֫()V

    .line 151
    iget-object v0, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    if-eqz v0, :cond_0

    iget v1, p0, Ll/ᩳۨۡ;->۬:I

    iget v0, v0, Ll/ܽۨۡ;->ۧ:I

    if-lt v1, v0, :cond_1

    .line 152
    :cond_0
    invoke-direct {p0}, Ll/ᩳۨۡ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 153
    invoke-direct {p0}, Ll/ᩳۨۡ;->֫()V

    const/4 v0, -0x1

    return v0

    .line 159
    :cond_1
    iget-object v0, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    iget-object v0, v0, Ll/ܽۨۡ;->֫:[B

    iget v1, p0, Ll/ᩳۨۡ;->۬:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳۨۡ;->۬:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0

    .line 144
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([BII)I
    .locals 2

    .line 165
    iget-object v0, p0, Ll/ᩳۨۡ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_4

    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p2, :cond_3

    if-ltz p3, :cond_3

    .line 172
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 179
    :cond_0
    invoke-direct {p0}, Ll/ᩳۨۡ;->֫()V

    .line 182
    iget-object v0, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    if-eqz v0, :cond_1

    iget v1, p0, Ll/ᩳۨۡ;->۬:I

    iget v0, v0, Ll/ܽۨۡ;->ۧ:I

    if-lt v1, v0, :cond_2

    .line 183
    :cond_1
    invoke-direct {p0}, Ll/ᩳۨۡ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 184
    invoke-direct {p0}, Ll/ᩳۨۡ;->֫()V

    const/4 p1, -0x1

    return p1

    .line 190
    :cond_2
    iget-object v0, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    iget v0, v0, Ll/ܽۨۡ;->ۧ:I

    iget v1, p0, Ll/ᩳۨۡ;->۬:I

    sub-int/2addr v0, v1

    .line 191
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 194
    iget-object v0, p0, Ll/ᩳۨۡ;->᩶:Ll/ܽۨۡ;

    iget-object v0, v0, Ll/ܽۨۡ;->֫:[B

    iget v1, p0, Ll/ᩳۨۡ;->۬:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 195
    iget p1, p0, Ll/ᩳۨۡ;->۬:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ᩳۨۡ;->۬:I

    return p3

    .line 173
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 166
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
