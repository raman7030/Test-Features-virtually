.class public final Ll/ۡ֡᩻;
.super Ljava/lang/Object;
.source "47G4"


# instance fields
.field public ֫:J

.field public volatile ۜ:Ll/ܺ֡᩻;

.field public ۧ:Ll/ۜ֡᩻;

.field public final ܳ:Ljava/lang/Object;

.field public ܽ:Ljava/lang/Throwable;

.field public ܿ:J

.field public ᩳ:J

.field public ᩷:J

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget-object v0, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    iput-object v0, p0, Ll/ۡ֡᩻;->ۜ:Ll/ܺ֡᩻;

    .line 8
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۡ֡᩻;->ܳ:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/Throwable;)V
    .locals 2

    .line 163
    instance-of v0, p0, Ljava/io/IOException;

    if-nez v0, :cond_2

    .line 166
    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-nez v0, :cond_1

    .line 169
    instance-of v0, p0, Ljava/lang/Error;

    if-eqz v0, :cond_0

    .line 170
    check-cast p0, Ljava/lang/Error;

    throw p0

    .line 172
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SMB protocol probing failed"

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 167
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    .line 164
    :cond_2
    check-cast p0, Ljava/io/IOException;

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/֨֡᩻;Ll/۠֡᩻;)Ll/ۢ֡᩻;
    .locals 12

    .line 49
    :cond_0
    iget-object v0, p2, Ll/۠֡᩻;->֫:Ll/۬֡᩻;

    iget-object v1, p2, Ll/۠֡᩻;->ۧ:Ll/᩶֡᩻;

    invoke-static {v0, v1}, Ll/۬֡᩻;->֫(Ll/۬֡᩻;Ll/᩶֡᩻;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 191
    new-instance p1, Ll/ۢ֡᩻;

    sget-object p2, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    invoke-direct {p1, p2, v1}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    return-object p1

    .line 52
    :cond_1
    iget-object v0, p0, Ll/ۡ֡᩻;->ۜ:Ll/ܺ֡᩻;

    .line 53
    sget-object v2, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    const/4 v3, 0x0

    if-eq v0, v2, :cond_2

    .line 187
    new-instance p1, Ll/ۢ֡᩻;

    invoke-direct {p1, v0, v3}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    return-object p1

    .line 59
    :cond_2
    iget-object v0, p0, Ll/ۡ֡᩻;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 60
    :try_start_0
    iget-object v4, p2, Ll/۠֡᩻;->֫:Ll/۬֡᩻;

    iget-object v5, p2, Ll/۠֡᩻;->ۧ:Ll/᩶֡᩻;

    invoke-static {v4, v5}, Ll/۬֡᩻;->֫(Ll/۬֡᩻;Ll/᩶֡᩻;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 191
    new-instance p1, Ll/ۢ֡᩻;

    invoke-direct {p1, v2, v1}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    .line 61
    monitor-exit v0

    return-object p1

    .line 63
    :cond_3
    iget-object v4, p0, Ll/ۡ֡᩻;->ۜ:Ll/ܺ֡᩻;

    if-eq v4, v2, :cond_4

    .line 187
    new-instance p1, Ll/ۢ֡᩻;

    invoke-direct {p1, v4, v3}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    .line 65
    monitor-exit v0

    return-object p1

    .line 67
    :cond_4
    iget-boolean v2, p0, Ll/ۡ֡᩻;->᩻:Z

    const/4 v4, 0x0

    if-nez v2, :cond_b

    .line 68
    iput-boolean v1, p0, Ll/ۡ֡᩻;->᩻:Z

    .line 69
    iget-wide v5, p0, Ll/ۡ֡᩻;->ܿ:J

    const-wide/16 v7, 0x1

    add-long/2addr v5, v7

    iput-wide v5, p0, Ll/ۡ֡᩻;->ܿ:J

    .line 70
    iput-wide v5, p0, Ll/ۡ֡᩻;->᩷:J

    .line 96
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 106
    :try_start_1
    invoke-virtual {p1}, Ll/֨֡᩻;->֫()Ll/ۜ֡᩻;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v2, v0

    move-object v7, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v7, v0

    move-object v2, v4

    .line 111
    :goto_0
    iget-object v0, p0, Ll/ۡ֡᩻;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 112
    :try_start_2
    iget-wide v8, p0, Ll/ۡ֡᩻;->ܿ:J

    cmp-long v10, v8, v5

    if-eqz v10, :cond_5

    const/4 v8, 0x1

    goto :goto_1

    :cond_5
    const/4 v8, 0x0

    :goto_1
    if-nez v8, :cond_6

    .line 114
    iput-object v2, p0, Ll/ۡ֡᩻;->ۧ:Ll/ۜ֡᩻;

    .line 115
    iput-wide v5, p0, Ll/ۡ֡᩻;->֫:J

    .line 116
    iput-object v7, p0, Ll/ۡ֡᩻;->ܽ:Ljava/lang/Throwable;

    .line 117
    iput-wide v5, p0, Ll/ۡ֡᩻;->ᩳ:J

    if-nez v7, :cond_6

    if-eqz v2, :cond_6

    .line 118
    invoke-virtual {v2}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object v9

    sget-object v10, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    if-eq v9, v10, :cond_6

    .line 119
    invoke-virtual {v2}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object v9

    iput-object v9, p0, Ll/ۡ֡᩻;->ۜ:Ll/ܺ֡᩻;

    .line 123
    :cond_6
    iget-wide v9, p0, Ll/ۡ֡᩻;->᩷:J

    cmp-long v11, v9, v5

    if-nez v11, :cond_7

    .line 124
    iput-boolean v3, p0, Ll/ۡ֡᩻;->᩻:Z

    const-wide/16 v5, 0x0

    .line 125
    iput-wide v5, p0, Ll/ۡ֡᩻;->᩷:J

    .line 127
    :cond_7
    iget-object v5, p0, Ll/ۡ֡᩻;->ܳ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V

    .line 128
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v8, :cond_8

    .line 191
    new-instance p1, Ll/ۢ֡᩻;

    sget-object p2, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    invoke-direct {p1, p2, v1}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    return-object p1

    :cond_8
    if-nez v7, :cond_a

    .line 136
    invoke-virtual {v2}, Ll/ۜ֡᩻;->֫()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_9

    .line 139
    invoke-virtual {v2}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object v0

    sget-object v1, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    if-eq v0, v1, :cond_0

    .line 140
    invoke-virtual {v2}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object p1

    .line 187
    new-instance p2, Ll/ۢ֡᩻;

    invoke-direct {p2, p1, v3}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    return-object p2

    .line 137
    :cond_9
    invoke-virtual {v2}, Ll/ۜ֡᩻;->֫()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ll/ۡ֡᩻;->֫(Ljava/lang/Throwable;)V

    throw v4

    .line 134
    :cond_a
    invoke-static {v7}, Ll/ۡ֡᩻;->֫(Ljava/lang/Throwable;)V

    throw v4

    :catchall_1
    move-exception p1

    .line 128
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    .line 73
    :cond_b
    :try_start_4
    iget-wide v5, p0, Ll/ۡ֡᩻;->᩷:J

    .line 149
    :goto_2
    iget-boolean p1, p0, Ll/ۡ֡᩻;->᩻:Z

    if-eqz p1, :cond_c

    iget-wide v7, p0, Ll/ۡ֡᩻;->᩷:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    cmp-long p1, v7, v5

    if-nez p1, :cond_c

    .line 151
    :try_start_5
    iget-object p1, p0, Ll/ۡ֡᩻;->ܳ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->wait()V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catch_0
    move-exception p1

    .line 153
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 154
    new-instance p2, Ljava/io/IOException;

    const-string v1, "Interrupted while waiting for SMB protocol probing"

    invoke-direct {p2, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 75
    :cond_c
    iget-object p1, p2, Ll/۠֡᩻;->֫:Ll/۬֡᩻;

    iget-object p2, p2, Ll/۠֡᩻;->ۧ:Ll/᩶֡᩻;

    invoke-static {p1, p2}, Ll/۬֡᩻;->֫(Ll/۬֡᩻;Ll/᩶֡᩻;)Z

    move-result p1

    if-nez p1, :cond_d

    .line 191
    new-instance p1, Ll/ۢ֡᩻;

    sget-object p2, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    invoke-direct {p1, p2, v1}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    .line 76
    monitor-exit v0

    return-object p1

    .line 78
    :cond_d
    iget-object p1, p0, Ll/ۡ֡᩻;->ۜ:Ll/ܺ֡᩻;

    .line 79
    sget-object p2, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    if-eq p1, p2, :cond_e

    .line 187
    new-instance p2, Ll/ۢ֡᩻;

    invoke-direct {p2, p1, v3}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    .line 80
    monitor-exit v0

    return-object p2

    .line 82
    :cond_e
    iget-object p1, p0, Ll/ۡ֡᩻;->ۧ:Ll/ۜ֡᩻;

    if-eqz p1, :cond_10

    iget-wide v7, p0, Ll/ۡ֡᩻;->֫:J

    cmp-long v2, v7, v5

    if-nez v2, :cond_10

    .line 83
    invoke-virtual {p1}, Ll/ۜ֡᩻;->֫()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_f

    .line 86
    iget-object p1, p0, Ll/ۡ֡᩻;->ۧ:Ll/ۜ֡᩻;

    invoke-virtual {p1}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object p1

    if-eq p1, p2, :cond_10

    .line 87
    iget-object p1, p0, Ll/ۡ֡᩻;->ۧ:Ll/ۜ֡᩻;

    invoke-virtual {p1}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object p1

    .line 187
    new-instance p2, Ll/ۢ֡᩻;

    invoke-direct {p2, p1, v3}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    .line 87
    monitor-exit v0

    return-object p2

    .line 84
    :cond_f
    iget-object p1, p0, Ll/ۡ֡᩻;->ۧ:Ll/ۜ֡᩻;

    invoke-virtual {p1}, Ll/ۜ֡᩻;->֫()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ll/ۡ֡᩻;->֫(Ljava/lang/Throwable;)V

    throw v4

    .line 90
    :cond_10
    iget-object p1, p0, Ll/ۡ֡᩻;->ܽ:Ljava/lang/Throwable;

    if-eqz p1, :cond_12

    iget-wide v2, p0, Ll/ۡ֡᩻;->ᩳ:J

    cmp-long v7, v2, v5

    if-eqz v7, :cond_11

    goto :goto_3

    .line 91
    :cond_11
    invoke-static {p1}, Ll/ۡ֡᩻;->֫(Ljava/lang/Throwable;)V

    throw v4

    .line 191
    :cond_12
    :goto_3
    new-instance p1, Ll/ۢ֡᩻;

    invoke-direct {p1, p2, v1}, Ll/ۢ֡᩻;-><init>(Ll/ܺ֡᩻;Z)V

    .line 94
    monitor-exit v0

    return-object p1

    :catchall_2
    move-exception p1

    .line 96
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1
.end method

.method public final ֫()Ll/ܺ֡᩻;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ۡ֡᩻;->ۜ:Ll/ܺ֡᩻;

    return-object v0
.end method

.method public final ۧ()V
    .locals 5

    .line 25
    iget-object v0, p0, Ll/ۡ֡᩻;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 26
    :try_start_0
    sget-object v1, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    iput-object v1, p0, Ll/ۡ֡᩻;->ۜ:Ll/ܺ֡᩻;

    const/4 v1, 0x0

    .line 27
    iput-object v1, p0, Ll/ۡ֡᩻;->ۧ:Ll/ۜ֡᩻;

    .line 28
    iput-object v1, p0, Ll/ۡ֡᩻;->ܽ:Ljava/lang/Throwable;

    .line 29
    iget-wide v1, p0, Ll/ۡ֡᩻;->ܿ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۡ֡᩻;->ܿ:J

    const/4 v1, 0x0

    .line 31
    iput-boolean v1, p0, Ll/ۡ֡᩻;->᩻:Z

    const-wide/16 v1, 0x0

    .line 32
    iput-wide v1, p0, Ll/ۡ֡᩻;->᩷:J

    .line 33
    iget-object v1, p0, Ll/ۡ֡᩻;->ܳ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 34
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
