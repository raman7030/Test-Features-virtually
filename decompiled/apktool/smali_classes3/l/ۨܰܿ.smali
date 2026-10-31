.class public final Ll/ۨܰܿ;
.super Ljava/lang/Object;
.source "F70U"


# instance fields
.field public volatile ֫:Z

.field public final ۧ:Ljava/nio/channels/FileChannel;

.field public volatile ܳ:Z

.field public final ܽ:Ll/ܿܽܳ;

.field public final ܿ:J

.field public final ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Ljava/nio/channels/FileChannel;Ll/ܿܽܳ;)V
    .locals 2

    .line 1128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1122
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/ۨܰܿ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1129
    iput-object p1, p0, Ll/ۨܰܿ;->ۧ:Ljava/nio/channels/FileChannel;

    .line 1130
    iput-object p2, p0, Ll/ۨܰܿ;->ܽ:Ll/ܿܽܳ;

    .line 1132
    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۨܰܿ;->ܿ:J

    return-void
.end method

.method private declared-synchronized ܳ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1205
    :try_start_0
    iget-boolean v1, p0, Ll/ۨܰܿ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 1206
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1208
    :try_start_1
    iput-boolean v1, p0, Ll/ۨܰܿ;->֫:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1210
    :try_start_2
    iget-object v1, p0, Ll/ۨܰܿ;->ۧ:Ljava/nio/channels/FileChannel;

    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1212
    :try_start_3
    iget-object v1, p0, Ll/ۨܰܿ;->ܽ:Ll/ܿܽܳ;

    invoke-virtual {v1}, Ll/ܿܽܳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1214
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 1212
    :try_start_4
    iget-object v2, p0, Ll/ۨܰܿ;->ܽ:Ll/ܿܽܳ;

    invoke-virtual {v2}, Ll/ܿܽܳ;->close()V

    .line 1213
    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method


# virtual methods
.method public final ֫(J[BII)V
    .locals 1

    .line 1160
    iget-boolean v0, p0, Ll/ۨܰܿ;->ܳ:Z

    if-nez v0, :cond_4

    .line 1163
    invoke-static {p3, p4, p5}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 1165
    :goto_0
    :try_start_0
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 1166
    iget-object p4, p0, Ll/ۨܰܿ;->ۧ:Ljava/nio/channels/FileChannel;

    invoke-virtual {p4, p3, p1, p2}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result p4

    if-ltz p4, :cond_1

    if-nez p4, :cond_0

    .line 1171
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_0
    int-to-long p4, p4

    add-long/2addr p1, p4

    goto :goto_0

    .line 1168
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected end of hex checkpoint delta"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :catch_0
    move-exception p1

    .line 1177
    iget-boolean p2, p0, Ll/ۨܰܿ;->ܳ:Z

    if-eqz p2, :cond_3

    .line 1178
    new-instance p2, Ll/ۚᩳܳ;

    invoke-direct {p2, p1}, Ll/ۚᩳܳ;-><init>(Ljava/io/IOException;)V

    throw p2

    .line 1180
    :cond_3
    throw p1

    .line 1161
    :cond_4
    new-instance p1, Ll/ۚᩳܳ;

    invoke-direct {p1}, Ll/ۚᩳܳ;-><init>()V

    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 1141
    iget-boolean v0, p0, Ll/ۨܰܿ;->ܳ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۨܰܿ;->֫:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۨܰܿ;->ۧ:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()V
    .locals 2

    .line 1192
    iget-object v0, p0, Ll/ۨܰܿ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-lez v1, :cond_0

    return-void

    :cond_0
    if-ltz v1, :cond_1

    .line 1200
    invoke-direct {p0}, Ll/ۨܰܿ;->ܳ()V

    return-void

    .line 1197
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1198
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Hex restore delta channel already closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()V
    .locals 3

    .line 1147
    :cond_0
    iget-object v0, p0, Ll/ۨܰܿ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_1

    add-int/lit8 v2, v1, 0x1

    .line 1151
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1149
    :cond_1
    new-instance v0, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {v0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw v0
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 1186
    iput-boolean v0, p0, Ll/ۨܰܿ;->ܳ:Z

    .line 1187
    invoke-direct {p0}, Ll/ۨܰܿ;->ܳ()V

    return-void
.end method

.method public final ᩳ()J
    .locals 2

    .line 1136
    iget-wide v0, p0, Ll/ۨܰܿ;->ܿ:J

    return-wide v0
.end method
