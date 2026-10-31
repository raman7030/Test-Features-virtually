.class public final Ll/ۤۧ֡;
.super Ljava/lang/Object;
.source "T4F2"


# instance fields
.field public ֫:J

.field public final ۜ:Ll/ۗۧ֡;

.field public final ۡ:Ll/۫ۧ֡;

.field public ۢ:J

.field public final ۧ:Ll/᩹ۧ֡;

.field public final ܳ:I

.field public ܽ:Ll/ܰ֫֡;

.field public final ܿ:Ljava/util/ArrayDeque;

.field public ᩳ:Z

.field public final ᩷:Ll/۬ۧ֡;

.field public final ᩻:Ll/۫ۧ֡;


# direct methods
.method public constructor <init>(ILl/᩹ۧ֡;ZZLl/ۤܰ᩵;)V
    .locals 3

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 46
    iput-wide v0, p0, Ll/ۤۧ֡;->ۢ:J

    .line 63
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۤۧ֡;->ܿ:Ljava/util/ArrayDeque;

    .line 71
    new-instance v1, Ll/۫ۧ֡;

    invoke-direct {v1, p0}, Ll/۫ۧ֡;-><init>(Ll/ۤۧ֡;)V

    iput-object v1, p0, Ll/ۤۧ֡;->᩻:Ll/۫ۧ֡;

    .line 72
    new-instance v1, Ll/۫ۧ֡;

    invoke-direct {v1, p0}, Ll/۫ۧ֡;-><init>(Ll/ۤۧ֡;)V

    iput-object v1, p0, Ll/ۤۧ֡;->ۡ:Ll/۫ۧ֡;

    const/4 v1, 0x0

    .line 79
    iput-object v1, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;

    if-eqz p2, :cond_5

    .line 85
    iput p1, p0, Ll/ۤۧ֡;->ܳ:I

    .line 86
    iput-object p2, p0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    .line 87
    iget-object p1, p2, Ll/᩹ۧ֡;->ۧ֫:Ll/֫ܽ֡;

    .line 88
    invoke-virtual {p1}, Ll/֫ܽ֡;->ۧ()I

    move-result p1

    int-to-long v1, p1

    iput-wide v1, p0, Ll/ۤۧ֡;->֫:J

    .line 89
    new-instance p1, Ll/۬ۧ֡;

    iget-object p2, p2, Ll/᩹ۧ֡;->֫֫:Ll/֫ܽ֡;

    invoke-virtual {p2}, Ll/֫ܽ֡;->ۧ()I

    move-result p2

    int-to-long v1, p2

    invoke-direct {p1, p0, v1, v2}, Ll/۬ۧ֡;-><init>(Ll/ۤۧ֡;J)V

    iput-object p1, p0, Ll/ۤۧ֡;->᩷:Ll/۬ۧ֡;

    .line 90
    new-instance p2, Ll/ۗۧ֡;

    invoke-direct {p2, p0}, Ll/ۗۧ֡;-><init>(Ll/ۤۧ֡;)V

    iput-object p2, p0, Ll/ۤۧ֡;->ۜ:Ll/ۗۧ֡;

    .line 91
    iput-boolean p4, p1, Ll/۬ۧ֡;->᩹:Z

    .line 92
    iput-boolean p3, p2, Ll/ۗۧ֡;->᩹:Z

    if-eqz p5, :cond_0

    .line 94
    invoke-virtual {v0, p5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 97
    :cond_0
    invoke-virtual {p0}, Ll/ۤۧ֡;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_2

    if-nez p5, :cond_1

    goto :goto_0

    .line 98
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "locally-initiated streams shouldn\'t have headers yet"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 99
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ll/ۤۧ֡;->ܿ()Z

    move-result p1

    if-nez p1, :cond_4

    if-eqz p5, :cond_3

    return-void

    .line 100
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "remotely-initiated streams should have headers"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void

    .line 83
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "connection == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ֫(Ll/ۤۧ֡;)Ljava/util/ArrayDeque;
    .locals 0

    .line 37
    iget-object p0, p0, Ll/ۤۧ֡;->ܿ:Ljava/util/ArrayDeque;

    return-object p0
.end method

.method private ᩳ(Ll/ܰ֫֡;)Z
    .locals 3

    move-object v0, p0

    .line 260
    monitor-enter v0

    .line 261
    :try_start_0
    iget-object v1, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 262
    monitor-exit v0

    return v2

    .line 264
    :cond_0
    iget-object v1, p0, Ll/ۤۧ֡;->᩷:Ll/۬ۧ֡;

    iget-boolean v1, v1, Ll/۬ۧ֡;->᩹:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۤۧ֡;->ۜ:Ll/ۗۧ֡;

    iget-boolean v1, v1, Ll/ۗۧ֡;->᩹:Z

    if-eqz v1, :cond_1

    .line 265
    monitor-exit v0

    return v2

    .line 267
    :cond_1
    iput-object p1, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;

    .line 268
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 269
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    iget-object p1, p0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    iget v0, p0, Ll/ۤۧ֡;->ܳ:I

    invoke-virtual {p1, v0}, Ll/᩹ۧ֡;->ۧ(I)Ll/ۤۧ֡;

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 269
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    move-object v0, p0

    .line 522
    monitor-enter v0

    .line 523
    :try_start_0
    iget-object v1, p0, Ll/ۤۧ֡;->᩷:Ll/۬ۧ֡;

    iget-boolean v2, v1, Ll/۬ۧ֡;->᩹:Z

    if-nez v2, :cond_1

    iget-boolean v1, v1, Ll/۬ۧ֡;->᩸:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۤۧ֡;->ۜ:Ll/ۗۧ֡;

    iget-boolean v2, v1, Ll/ۗۧ֡;->᩹:Z

    if-nez v2, :cond_0

    iget-boolean v1, v1, Ll/ۗۧ֡;->᩸:Z

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 524
    :goto_0
    invoke-virtual {p0}, Ll/ۤۧ֡;->ܳ()Z

    move-result v2

    .line 525
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 531
    sget-object v0, Ll/ܰ֫֡;->᩶:Ll/ܰ֫֡;

    invoke-virtual {p0, v0}, Ll/ۤۧ֡;->֫(Ll/ܰ֫֡;)V

    return-void

    :cond_2
    if-nez v2, :cond_3

    .line 533
    iget-object v0, p0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    iget v1, p0, Ll/ۤۧ֡;->ܳ:I

    invoke-virtual {v0, v1}, Ll/᩹ۧ֡;->ۧ(I)Ll/ۤۧ֡;

    :cond_3
    return-void

    :catchall_0
    move-exception v1

    .line 525
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 2

    move-object v0, p0

    .line 281
    monitor-enter v0

    const/4 v1, 0x1

    .line 282
    :try_start_0
    iput-boolean v1, p0, Ll/ۤۧ֡;->ᩳ:Z

    .line 283
    iget-object v1, p0, Ll/ۤۧ֡;->ܿ:Ljava/util/ArrayDeque;

    invoke-static {p1}, Ll/᩶۟᩵;->֫(Ljava/util/ArrayList;)Ll/ۤܰ᩵;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 284
    invoke-virtual {p0}, Ll/ۤۧ֡;->ܳ()Z

    move-result p1

    .line 285
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 286
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 288
    iget-object p1, p0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    iget v0, p0, Ll/ۤۧ֡;->ܳ:I

    invoke-virtual {p1, v0}, Ll/᩹ۧ֡;->ۧ(I)Ll/ۤۧ֡;

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 286
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۛܽ֡;I)V
    .locals 3

    .line 294
    iget-object v0, p0, Ll/ۤۧ֡;->᩷:Ll/۬ۧ֡;

    int-to-long v1, p2

    invoke-virtual {v0, p1, v1, v2}, Ll/۬ۧ֡;->֫(Ll/ۛܽ֡;J)V

    return-void
.end method

.method public final ֫(Ll/ܰ֫֡;)V
    .locals 2

    .line 240
    invoke-direct {p0, p1}, Ll/ۤۧ֡;->ᩳ(Ll/ܰ֫֡;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 243
    :cond_0
    iget v0, p0, Ll/ۤۧ֡;->ܳ:I

    .line 354
    iget-object v1, p0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    iget-object v1, v1, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {v1, v0, p1}, Ll/ۛۧ֡;->֫(ILl/ܰ֫֡;)V

    return-void
.end method

.method public final declared-synchronized ۜ()Ll/ۤܰ᩵;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 147
    :try_start_0
    iget-object v1, p0, Ll/ۤۧ֡;->᩻:Ll/۫ۧ֡;

    invoke-virtual {v1}, Ll/ۙܽ֡;->᩻()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 149
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/ۤۧ֡;->ܿ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_0

    .line 654
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 656
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 657
    new-instance v1, Ljava/io/InterruptedIOException;

    invoke-direct {v1}, Ljava/io/InterruptedIOException;-><init>()V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 153
    :cond_0
    :try_start_4
    iget-object v1, p0, Ll/ۤۧ֡;->᩻:Ll/۫ۧ֡;

    invoke-virtual {v1}, Ll/۫ۧ֡;->ۡ()V

    .line 155
    iget-object v1, p0, Ll/ۤۧ֡;->ܿ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 156
    iget-object v1, p0, Ll/ۤۧ֡;->ܿ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤܰ᩵;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v0

    return-object v1

    .line 158
    :cond_1
    :try_start_5
    new-instance v1, Ll/ۧܽ֡;

    iget-object v2, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;

    invoke-direct {v1, v2}, Ll/ۧܽ֡;-><init>(Ll/ܰ֫֡;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 153
    iget-object v2, p0, Ll/ۤۧ֡;->᩻:Ll/۫ۧ֡;

    invoke-virtual {v2}, Ll/۫ۧ֡;->ۡ()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method

.method public final ۧ()V
    .locals 2

    .line 639
    iget-object v0, p0, Ll/ۤۧ֡;->ۜ:Ll/ۗۧ֡;

    iget-boolean v1, v0, Ll/ۗۧ֡;->᩸:Z

    if-nez v1, :cond_2

    .line 641
    iget-boolean v0, v0, Ll/ۗۧ֡;->᩹:Z

    if-nez v0, :cond_1

    .line 643
    iget-object v0, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;

    if-nez v0, :cond_0

    return-void

    .line 644
    :cond_0
    new-instance v0, Ll/ۧܽ֡;

    iget-object v1, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;

    invoke-direct {v0, v1}, Ll/ۧܽ֡;-><init>(Ll/ܰ֫֡;)V

    throw v0

    .line 642
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 640
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ll/ܰ֫֡;)V
    .locals 2

    .line 251
    invoke-direct {p0, p1}, Ll/ۤۧ֡;->ᩳ(Ll/ܰ֫֡;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 254
    :cond_0
    iget-object v0, p0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    iget v1, p0, Ll/ۤۧ֡;->ܳ:I

    invoke-virtual {v0, v1, p1}, Ll/᩹ۧ֡;->ۧ(ILl/ܰ֫֡;)V

    return-void
.end method

.method public final declared-synchronized ܳ()Z
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 120
    :try_start_0
    iget-object v1, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 121
    monitor-exit v0

    return v2

    .line 123
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۤۧ֡;->᩷:Ll/۬ۧ֡;

    iget-boolean v3, v1, Ll/۬ۧ֡;->᩹:Z

    if-nez v3, :cond_1

    iget-boolean v1, v1, Ll/۬ۧ֡;->᩸:Z

    if-eqz v1, :cond_3

    :cond_1
    iget-object v1, p0, Ll/ۤۧ֡;->ۜ:Ll/ۗۧ֡;

    iget-boolean v3, v1, Ll/ۗۧ֡;->᩹:Z

    if-nez v3, :cond_2

    iget-boolean v1, v1, Ll/ۗۧ֡;->᩸:Z

    if-eqz v1, :cond_3

    :cond_2
    iget-boolean v1, p0, Ll/ۤۧ֡;->ᩳ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_3

    .line 126
    monitor-exit v0

    return v2

    .line 128
    :cond_3
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ܽ()Ll/ۚᩳ֡;
    .locals 3

    move-object v0, p0

    .line 227
    monitor-enter v0

    .line 228
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۧ֡;->ᩳ:Z

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ll/ۤۧ֡;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 229
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "reply before requesting the sink"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 231
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    iget-object v0, p0, Ll/ۤۧ֡;->ۜ:Ll/ۗۧ֡;

    return-object v0

    :catchall_0
    move-exception v1

    .line 231
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ(Ll/ܰ֫֡;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 311
    :try_start_0
    iget-object v1, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;

    if-nez v1, :cond_0

    .line 312
    iput-object p1, p0, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;

    .line 313
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 315
    :cond_0
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

.method public final ܿ()Z
    .locals 4

    .line 133
    iget v0, p0, Ll/ۤۧ֡;->ܳ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 134
    :goto_0
    iget-object v3, p0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    iget-boolean v3, v3, Ll/᩹ۧ֡;->᩶:Z

    if-ne v3, v0, :cond_1

    return v1

    :cond_1
    return v2
.end method

.method public final ᩳ()Ll/֨ᩳ֡;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ۤۧ֡;->᩷:Ll/۬ۧ֡;

    return-object v0
.end method

.method public final ᩻()V
    .locals 3

    move-object v0, p0

    .line 300
    monitor-enter v0

    .line 301
    :try_start_0
    iget-object v1, p0, Ll/ۤۧ֡;->᩷:Ll/۬ۧ֡;

    const/4 v2, 0x1

    iput-boolean v2, v1, Ll/۬ۧ֡;->᩹:Z

    .line 302
    invoke-virtual {p0}, Ll/ۤۧ֡;->ܳ()Z

    move-result v1

    .line 303
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 304
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 306
    iget-object v0, p0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    iget v1, p0, Ll/ۤۧ֡;->ܳ:I

    invoke-virtual {v0, v1}, Ll/᩹ۧ֡;->ۧ(I)Ll/ۤۧ֡;

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 304
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
