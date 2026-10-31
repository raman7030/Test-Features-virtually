.class public final Ll/ۜᩳ֡;
.super Ljava/lang/Object;
.source "L3AO"

# interfaces
.implements Ll/ۚᩳ֡;


# instance fields
.field public final synthetic ᩸:Ll/ۢᩳ֡;

.field public final ᩹:Ll/ܶᩳ֡;


# direct methods
.method public constructor <init>(Ll/ۢᩳ֡;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    .line 60
    new-instance p1, Ll/ܶᩳ֡;

    .line 69
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Ll/ۜᩳ֡;->᩹:Ll/ܶᩳ֡;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 7

    .line 91
    iget-object v0, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    iget-object v0, v0, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    monitor-enter v0

    .line 92
    :try_start_0
    iget-object v1, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    iget-boolean v2, v1, Ll/ۢᩳ֡;->ᩳ:Z

    if-eqz v2, :cond_0

    monitor-exit v0

    return-void

    .line 93
    :cond_0
    iget-boolean v2, v1, Ll/ۢᩳ֡;->ܳ:Z

    if-eqz v2, :cond_2

    iget-object v2, v1, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    .line 67
    iget-wide v2, v2, Ll/۫ܽ֡;->᩹:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    goto :goto_0

    .line 93
    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "source is closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    .line 94
    iput-boolean v2, v1, Ll/ۢᩳ֡;->ᩳ:Z

    .line 95
    iget-object v1, v1, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 96
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final flush()V
    .locals 6

    .line 84
    iget-object v0, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    iget-object v0, v0, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    monitor-enter v0

    .line 85
    :try_start_0
    iget-object v1, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    iget-boolean v2, v1, Ll/ۢᩳ֡;->ᩳ:Z

    if-nez v2, :cond_2

    .line 86
    iget-boolean v2, v1, Ll/ۢᩳ֡;->ܳ:Z

    if-eqz v2, :cond_1

    iget-object v1, v1, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    .line 67
    iget-wide v1, v1, Ll/۫ܽ֡;->᩹:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    goto :goto_0

    .line 86
    :cond_0
    new-instance v1, Ljava/io/IOException;

    const-string v2, "source is closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 87
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    .line 85
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 87
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/۫ܽ֡;J)V
    .locals 8

    .line 63
    iget-object v0, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    iget-object v0, v0, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    monitor-enter v0

    .line 64
    :try_start_0
    iget-object v1, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    iget-boolean v1, v1, Ll/ۢᩳ֡;->ᩳ:Z

    if-nez v1, :cond_3

    :goto_0
    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-lez v3, :cond_2

    .line 67
    iget-object v3, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    iget-boolean v4, v3, Ll/ۢᩳ֡;->ܳ:Z

    if-nez v4, :cond_1

    .line 69
    iget-wide v4, v3, Ll/ۢᩳ֡;->ۧ:J

    iget-object v3, v3, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    .line 67
    iget-wide v6, v3, Ll/۫ܽ֡;->᩹:J

    sub-long/2addr v4, v6

    cmp-long v6, v4, v1

    if-nez v6, :cond_0

    .line 71
    iget-object v1, p0, Ll/ۜᩳ֡;->᩹:Ll/ܶᩳ֡;

    invoke-virtual {v1, v3}, Ll/ܶᩳ֡;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 75
    :cond_0
    invoke-static {v4, v5, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    .line 76
    iget-object v3, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    iget-object v3, v3, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    invoke-virtual {v3, p1, v1, v2}, Ll/۫ܽ֡;->֫(Ll/۫ܽ֡;J)V

    sub-long/2addr p2, v1

    .line 78
    iget-object v1, p0, Ll/ۜᩳ֡;->᩸:Ll/ۢᩳ֡;

    iget-object v1, v1, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    .line 67
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "source is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 80
    :cond_2
    monitor-exit v0

    return-void

    .line 64
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 80
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 100
    iget-object v0, p0, Ll/ۜᩳ֡;->᩹:Ll/ܶᩳ֡;

    return-object v0
.end method
