.class public final Ll/᩹ۛۜ;
.super Ljava/lang/Object;
.source "E6MO"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ll/᩶ۛۜ;

.field public ᩸:J

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/᩶ۛۜ;J)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    .line 59
    iput-wide p2, p0, Ll/᩹ۛۜ;->᩸:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 9

    .line 85
    iget-object v0, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    monitor-enter v0

    .line 86
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۛۜ;->᩹:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 87
    :cond_0
    iget-wide v1, p0, Ll/᩹ۛۜ;->᩸:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    iget-object v1, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    invoke-static {v1}, Ll/᩶ۛۜ;->ܽ(Ll/᩶ۛۜ;)Ljava/lang/Runnable;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 88
    :goto_0
    iget-object v2, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    invoke-static {v2}, Ll/᩶ۛۜ;->ᩳ(Ll/᩶ۛۜ;)J

    move-result-wide v5

    iget-wide v7, p0, Ll/᩹ۛۜ;->᩸:J

    sub-long/2addr v5, v7

    invoke-static {v2, v5, v6}, Ll/᩶ۛۜ;->ۧ(Ll/᩶ۛۜ;J)V

    .line 89
    iput-wide v3, p0, Ll/᩹ۛۜ;->᩸:J

    const/4 v2, 0x1

    .line 90
    iput-boolean v2, p0, Ll/᩹ۛۜ;->᩹:Z

    .line 91
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 92
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 91
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫()J
    .locals 3

    .line 79
    iget-object v0, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Ll/᩹ۛۜ;->᩸:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ(J)Z
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_4

    .line 66
    iget-object v0, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    monitor-enter v0

    .line 67
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۛۜ;->᩹:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    invoke-static {v1}, Ll/᩶ۛۜ;->֫(Ll/᩶ۛۜ;)J

    move-result-wide v1

    iget-object v3, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    invoke-static {v3}, Ll/᩶ۛۜ;->ᩳ(Ll/᩶ۛۜ;)J

    move-result-wide v3

    iget-wide v5, p0, Ll/᩹ۛۜ;->᩸:J

    sub-long/2addr v3, v5

    sub-long/2addr v1, v3

    cmp-long v3, p1, v1

    if-gtz v3, :cond_3

    iget-object v1, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    invoke-static {v1}, Ll/᩶ۛۜ;->ᩳ(Ll/᩶ۛۜ;)J

    move-result-wide v2

    iget-wide v4, p0, Ll/᩹ۛۜ;->᩸:J

    sub-long/2addr v2, v4

    add-long/2addr v2, p1

    .line 68
    invoke-static {v1, v2, v3}, Ll/᩶ۛۜ;->ܽ(Ll/᩶ۛۜ;J)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 69
    :cond_0
    iget-wide v1, p0, Ll/᩹ۛۜ;->᩸:J

    cmp-long v3, p1, v1

    if-gez v3, :cond_1

    iget-object v1, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    invoke-static {v1}, Ll/᩶ۛۜ;->ܽ(Ll/᩶ۛۜ;)Ljava/lang/Runnable;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 70
    :goto_0
    iget-object v2, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    invoke-static {v2}, Ll/᩶ۛۜ;->ᩳ(Ll/᩶ۛۜ;)J

    move-result-wide v3

    iget-wide v5, p0, Ll/᩹ۛۜ;->᩸:J

    sub-long v5, p1, v5

    add-long/2addr v5, v3

    invoke-static {v2, v5, v6}, Ll/᩶ۛۜ;->ۧ(Ll/᩶ۛۜ;J)V

    .line 71
    iput-wide p1, p0, Ll/᩹ۛۜ;->᩸:J

    .line 72
    iget-object p1, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    invoke-static {p1}, Ll/᩶ۛۜ;->ۧ(Ll/᩶ۛۜ;)J

    move-result-wide v2

    iget-object p2, p0, Ll/᩹ۛۜ;->᩶:Ll/᩶ۛۜ;

    invoke-static {p2}, Ll/᩶ۛۜ;->ᩳ(Ll/᩶ۛۜ;)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-static {p1, v2, v3}, Ll/᩶ۛۜ;->֫(Ll/᩶ۛۜ;J)V

    .line 73
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 74
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 68
    :try_start_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 73
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 64
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Allocation must not be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
