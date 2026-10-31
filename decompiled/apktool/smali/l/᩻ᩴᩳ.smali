.class public final Ll/᩻ᩴᩳ;
.super Ljava/lang/Object;
.source "Y6SG"


# instance fields
.field public ֫:Ll/ܳᩴᩳ;

.field public ۖ:Ll/ۜ֡ᩳ;

.field public final ۘ:Ll/᩻۬ᩳ;

.field public final ۜ:Ljava/util/concurrent/Executor;

.field public ۡ:Ll/ܳᩴᩳ;

.field public ۢ:I

.field public final ۧ:Ll/֨۬ᩳ;

.field public ܳ:Ll/ܰۘᩳ;

.field public ܺ:I

.field public ܽ:Z

.field public final ܿ:Ll/᩷۠ᩴ;

.field public volatile ᩳ:Ljava/io/IOException;

.field public final ᩴ:Ljava/util/UUID;

.field public ᩷:J

.field public final ᩻:Ll/ۗ᩻᩵;


# direct methods
.method public constructor <init>(Ll/᩻۬ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/᩻ᩴᩳ;->᩻:Ll/ۗ᩻᩵;

    const-wide/16 v0, -0x1

    .line 30
    iput-wide v0, p0, Ll/᩻ᩴᩳ;->᩷:J

    .line 36
    iput-object p1, p0, Ll/᩻ᩴᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ᩴᩳ;->ᩴ:Ljava/util/UUID;

    .line 37
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/᩻ᩴᩳ;->ܿ:Ll/᩷۠ᩴ;

    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Ll/᩻ᩴᩳ;->ۧ:Ll/֨۬ᩳ;

    .line 38
    invoke-static {p4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p4, p0, Ll/᩻ᩴᩳ;->ۜ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private ֫(Ll/۬ᩴᩳ;Z)Ll/ۗ᩻᩵;
    .locals 10

    .line 86
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    new-instance v1, Ll/ܳᩴᩳ;

    invoke-direct {v1, p1, p2}, Ll/ܳᩴᩳ;-><init>(Ll/۬ᩴᩳ;Z)V

    move-object v0, p0

    .line 90
    monitor-enter v0

    .line 91
    :try_start_0
    iget-object p2, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p2, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    if-eq p2, p1, :cond_1

    :cond_0
    iget-object p2, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    if-eqz p2, :cond_2

    iget-object p2, p2, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    if-ne p2, p1, :cond_2

    .line 93
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v5, "Checkpoint is already queued"

    invoke-direct {p2, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    move-object v9, v3

    move-object v3, p2

    move-object p2, v9

    goto :goto_2

    .line 94
    :cond_2
    iget-boolean p2, p0, Ll/᩻ᩴᩳ;->ܽ:Z

    if-nez p2, :cond_6

    .line 95
    iget-object p2, p0, Ll/᩻ᩴᩳ;->ᩴ:Ljava/util/UUID;

    invoke-virtual {p1}, Ll/۬ᩴᩳ;->ۘ()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v2, "Checkpoint belongs to another session"

    invoke-direct {p2, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 96
    :cond_3
    invoke-virtual {p1}, Ll/۬ᩴᩳ;->ۖ()J

    move-result-wide v5

    iget-wide v7, p0, Ll/᩻ᩴᩳ;->᩷:J

    cmp-long p2, v5, v7

    if-gtz p2, :cond_4

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v2, "Checkpoint is out of order"

    invoke-direct {p2, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 98
    :cond_4
    invoke-virtual {p1}, Ll/۬ᩴᩳ;->ۖ()J

    move-result-wide v5

    iput-wide v5, p0, Ll/᩻ᩴᩳ;->᩷:J

    .line 99
    iget-object p2, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    if-nez p2, :cond_5

    iput-object v1, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    const/4 v2, 0x0

    const/4 v4, 0x1

    move-object p2, v3

    goto :goto_2

    .line 100
    :cond_5
    iget-object p2, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    iput-object v1, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    if-eqz p2, :cond_7

    iget v5, p0, Ll/᩻ᩴᩳ;->ܺ:I

    add-int/2addr v5, v2

    iput v5, p0, Ll/᩻ᩴᩳ;->ܺ:I

    goto :goto_1

    .line 94
    :cond_6
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v2, "Checkpoint queue is closed"

    invoke-direct {p2, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_0
    move-object v9, v3

    move-object v3, p2

    move-object p2, v9

    :cond_7
    :goto_1
    const/4 v2, 0x0

    .line 102
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_9

    if-nez v2, :cond_8

    .line 105
    invoke-virtual {p1}, Ll/۬ᩴᩳ;->close()V

    .line 106
    :cond_8
    iget-object p1, v1, Ll/ܳᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    invoke-virtual {p1, v3}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    :cond_9
    if-eqz p2, :cond_a

    .line 108
    invoke-direct {p0, p2}, Ll/᩻ᩴᩳ;->֫(Ll/ܳᩴᩳ;)V

    .line 202
    iget-object p1, p2, Ll/ܳᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    new-instance p2, Ljava/util/concurrent/CancellationException;

    const-string v0, "Checkpoint was superseded or discarded"

    invoke-direct {p2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    :cond_a
    if-eqz v4, :cond_b

    .line 109
    invoke-direct {p0, v1}, Ll/᩻ᩴᩳ;->ۧ(Ll/ܳᩴᩳ;)V

    .line 110
    :cond_b
    iget-object p1, v1, Ll/ܳᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    new-instance p2, Ll/ۗ᩵֫;

    const/4 v0, 0x3

    invoke-direct {p2, v0}, Ll/ۗ᩵֫;-><init>(I)V

    invoke-virtual {p1, p2}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 102
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ܳᩴᩳ;)V
    .locals 1

    .line 195
    iget-object p1, p1, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    invoke-virtual {p1}, Ll/۬ᩴᩳ;->close()V

    move-object v0, p0

    .line 197
    monitor-enter v0

    :try_start_0
    iget p1, p0, Ll/᩻ᩴᩳ;->ܺ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/᩻ᩴᩳ;->ܺ:I

    invoke-direct {p0}, Ll/᩻ᩴᩳ;->ܿ()Z

    move-result p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 198
    iget-object p1, p0, Ll/᩻ᩴᩳ;->᩻:Ll/ۗ᩻᩵;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 197
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ܳᩴᩳ;Ljava/lang/RuntimeException;)V
    .locals 5

    move-object v0, p0

    .line 157
    monitor-enter v0

    .line 158
    :try_start_0
    iget-object v1, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    if-eq v1, p1, :cond_0

    monitor-exit v0

    return-void

    .line 159
    :cond_0
    iget-object p1, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    const/4 v2, 0x0

    iput-object v2, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    iput-object v2, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    .line 160
    iget v2, p0, Ll/᩻ᩴᩳ;->ܺ:I

    const/4 v3, 0x1

    if-nez p1, :cond_1

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    :goto_0
    add-int/2addr v3, v4

    add-int/2addr v3, v2

    iput v3, p0, Ll/᩻ᩴᩳ;->ܺ:I

    .line 161
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    invoke-direct {p0, v1}, Ll/᩻ᩴᩳ;->֫(Ll/ܳᩴᩳ;)V

    if-eqz p1, :cond_2

    .line 163
    invoke-direct {p0, p1}, Ll/᩻ᩴᩳ;->֫(Ll/ܳᩴᩳ;)V

    .line 164
    :cond_2
    iget-object v0, v1, Ll/ܳᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    invoke-virtual {v0, p2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    if-eqz p1, :cond_3

    .line 165
    iget-object p1, p1, Ll/ܳᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    invoke-virtual {p1, p2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    .line 161
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static ֫(Ll/᩻ᩴᩳ;Ll/ܳᩴᩳ;)V
    .locals 11

    move-object v0, p0

    .line 120
    monitor-enter v0

    .line 122
    :try_start_0
    iget-boolean v1, p0, Ll/᩻ᩴᩳ;->ܽ:Z

    if-nez v1, :cond_7

    iget-object v1, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    if-eq v1, p1, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v1, 0x1

    .line 123
    iput-boolean v1, p1, Ll/ܳᩴᩳ;->ᩳ:Z

    .line 124
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v1, 0x0

    .line 128
    :try_start_1
    iget-object v0, p1, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    iget-object v2, p0, Ll/᩻ᩴᩳ;->ܿ:Ll/᩷۠ᩴ;

    iget-object v3, p0, Ll/᩻ᩴᩳ;->ۧ:Ll/֨۬ᩳ;

    invoke-virtual {v0, v2, v3}, Ll/۬ᩴᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    :try_start_2
    iget-object v4, p0, Ll/᩻ᩴᩳ;->ܳ:Ll/ܰۘᩳ;

    if-eqz v4, :cond_1

    .line 130
    iget-object v4, p0, Ll/᩻ᩴᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v4, v2, v3}, Ll/᩻۬ᩳ;->ۧ(J)Ll/ۗ᩻᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    .line 131
    iget-object v5, p0, Ll/᩻ᩴᩳ;->ܳ:Ll/ܰۘᩳ;

    iget v6, p0, Ll/᩻ᩴᩳ;->ۢ:I

    iget-object v4, p1, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    invoke-virtual {v4}, Ll/۬ᩴᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v7

    iget-object v4, p1, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    invoke-virtual {v4}, Ll/۬ᩴᩳ;->ܳ()Z

    move-result v8

    iget-object v4, p1, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    .line 132
    invoke-virtual {v4}, Ll/۬ᩴᩳ;->᩻()I

    move-result v9

    iget-object v4, p1, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    invoke-virtual {v4}, Ll/۬ᩴᩳ;->ۜ()Ljava/lang/String;

    move-result-object v10

    .line 131
    invoke-virtual/range {v5 .. v10}, Ll/ܰۘᩳ;->֫(ILandroid/os/Bundle;ZILjava/lang/String;)V

    .line 134
    :cond_1
    iget-boolean v4, p1, Ll/ܳᩴᩳ;->ܽ:Z

    if-eqz v4, :cond_3

    .line 135
    iget-object v4, p0, Ll/᩻ᩴᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v4, v2, v3}, Ll/᩻۬ᩳ;->ۧ(J)Ll/ۗ᩻᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    .line 136
    iget-object v2, p1, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    :try_start_3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 55
    invoke-virtual {v2}, Ll/۬ᩴᩳ;->֫()Ll/ۨۙᩳ;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    iget-object v2, p0, Ll/᩻ᩴᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v2}, Ll/᩻۬ᩳ;->ۗ()[B

    move-result-object v2

    iget-object v4, p0, Ll/᩻ᩴᩳ;->ᩴ:Ljava/util/UUID;

    invoke-static {v4, v2}, Ll/۠֫ܿ;->֫(Ljava/util/UUID;[B)Ll/ۨۙᩳ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 57
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    :cond_2
    iget-object v2, p0, Ll/᩻ᩴᩳ;->ܿ:Ll/᩷۠ᩴ;

    iget-object v4, p0, Ll/᩻ᩴᩳ;->ᩴ:Ljava/util/UUID;

    invoke-static {v2, v4, v3}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/util/List;)V

    .line 59
    iput-object v1, p0, Ll/᩻ᩴᩳ;->ᩳ:Ljava/io/IOException;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 60
    :try_start_4
    iput-object v2, p0, Ll/᩻ᩴᩳ;->ᩳ:Ljava/io/IOException;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 140
    :cond_3
    :goto_0
    iget-object v2, p1, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    invoke-virtual {v2}, Ll/۬ᩴᩳ;->close()V

    move-object v2, v0

    move-object v3, v1

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    move-object v0, v1

    :goto_1
    iget-object v3, p1, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    invoke-virtual {v3}, Ll/۬ᩴᩳ;->close()V

    move-object v3, v2

    move-object v2, v0

    :goto_2
    move-object v0, p0

    .line 143
    monitor-enter v0

    .line 144
    :try_start_5
    iget-object v4, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    iput-object v1, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    iput-object v4, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    .line 145
    invoke-direct {p0}, Ll/᩻ᩴᩳ;->ܿ()Z

    move-result v5

    .line 146
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v5, :cond_4

    .line 148
    iget-object v0, p0, Ll/᩻ᩴᩳ;->᩻:Ll/ۗ᩻᩵;

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    :cond_4
    if-nez v3, :cond_5

    .line 149
    iget-object p1, p1, Ll/ܳᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    invoke-virtual {p1, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_3

    .line 150
    :cond_5
    iget-object p1, p1, Ll/ܳᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    invoke-virtual {p1, v3}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    :goto_3
    if-eqz v4, :cond_6

    .line 151
    invoke-direct {p0, v4}, Ll/᩻ᩴᩳ;->ۧ(Ll/ܳᩴᩳ;)V

    :cond_6
    return-void

    :catchall_2
    move-exception p0

    .line 146
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p0

    .line 122
    :cond_7
    :goto_4
    :try_start_7
    monitor-exit v0

    return-void

    :catchall_3
    move-exception p0

    .line 124
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p0
.end method

.method private ۧ(Ll/ܳᩴᩳ;)V
    .locals 2

    move-object v0, p0

    .line 114
    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll/᩻ᩴᩳ;->ܽ:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    if-eq v1, p1, :cond_0

    goto :goto_0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    :try_start_1
    iget-object v0, p0, Ll/᩻ᩴᩳ;->ۜ:Ljava/util/concurrent/Executor;

    new-instance v1, Ll/ᩳᩴᩳ;

    invoke-direct {v1, p0, p1}, Ll/ᩳᩴᩳ;-><init>(Ll/᩻ᩴᩳ;Ll/ܳᩴᩳ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 116
    invoke-direct {p0, p1, v0}, Ll/᩻ᩴᩳ;->֫(Ll/ܳᩴᩳ;Ljava/lang/RuntimeException;)V

    return-void

    .line 114
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private ܿ()Z
    .locals 1

    .line 192
    iget-boolean v0, p0, Ll/᩻ᩴᩳ;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    if-nez v0, :cond_0

    iget v0, p0, Ll/᩻ᩴᩳ;->ܺ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final ֫()Ll/ۗ᩻᩵;
    .locals 8

    move-object v0, p0

    .line 175
    monitor-enter v0

    const/4 v1, 0x1

    .line 176
    :try_start_0
    iput-boolean v1, p0, Ll/᩻ᩴᩳ;->ܽ:Z

    iget-object v2, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    iget-object v3, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    const/4 v4, 0x0

    iput-object v4, p0, Ll/᩻ᩴᩳ;->ۡ:Ll/ܳᩴᩳ;

    if-eqz v2, :cond_0

    .line 177
    iget-boolean v5, v2, Ll/ܳᩴᩳ;->ᩳ:Z

    if-nez v5, :cond_0

    iput-object v4, p0, Ll/᩻ᩴᩳ;->֫:Ll/ܳᩴᩳ;

    move-object v5, v4

    goto :goto_0

    :cond_0
    move-object v5, v2

    move-object v2, v4

    .line 178
    :goto_0
    iget v6, p0, Ll/᩻ᩴᩳ;->ܺ:I

    if-nez v2, :cond_1

    const/4 v7, 0x0

    goto :goto_1

    :cond_1
    const/4 v7, 0x1

    :goto_1
    if-nez v3, :cond_2

    const/4 v1, 0x0

    :cond_2
    add-int/2addr v7, v1

    add-int/2addr v7, v6

    iput v7, p0, Ll/᩻ᩴᩳ;->ܺ:I

    .line 179
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_3

    .line 180
    invoke-direct {p0, v2}, Ll/᩻ᩴᩳ;->֫(Ll/ܳᩴᩳ;)V

    :cond_3
    if-eqz v3, :cond_4

    .line 181
    invoke-direct {p0, v3}, Ll/᩻ᩴᩳ;->֫(Ll/ܳᩴᩳ;)V

    :cond_4
    if-eqz v5, :cond_5

    .line 182
    iget-object v0, v5, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    invoke-virtual {v0}, Ll/۬ᩴᩳ;->close()V

    :cond_5
    move-object v0, p0

    .line 184
    monitor-enter v0

    :try_start_1
    invoke-direct {p0}, Ll/᩻ᩴᩳ;->ܿ()Z

    move-result v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_6

    .line 185
    iget-object v0, p0, Ll/᩻ᩴᩳ;->᩻:Ll/ۗ᩻᩵;

    invoke-virtual {v0, v4}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    :cond_6
    if-eqz v2, :cond_7

    .line 205
    iget-object v0, p0, Ll/᩻ᩴᩳ;->᩻:Ll/ۗ᩻᩵;

    new-instance v1, Ll/ܿᩴᩳ;

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2}, Ll/ܿᩴᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Runnable;)Ll/ۗ᩻᩵;

    :cond_7
    if-eqz v3, :cond_8

    iget-object v0, p0, Ll/᩻ᩴᩳ;->᩻:Ll/ۗ᩻᩵;

    new-instance v1, Ll/ܿᩴᩳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v3}, Ll/ܿᩴᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Runnable;)Ll/ۗ᩻᩵;

    .line 189
    :cond_8
    iget-object v0, p0, Ll/᩻ᩴᩳ;->᩻:Ll/ۗ᩻᩵;

    new-instance v1, Ll/ۚ۬ۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 184
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 179
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final ֫(Ll/۬ᩴᩳ;)Ll/ۗ᩻᩵;
    .locals 1

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, v0}, Ll/᩻ᩴᩳ;->֫(Ll/۬ᩴᩳ;Z)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩻۬ᩳ;)Z
    .locals 1

    .line 74
    iget-object v0, p0, Ll/᩻ᩴᩳ;->ۘ:Ll/᩻۬ᩳ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/۬ᩴᩳ;)Ll/ۗ᩻᩵;
    .locals 1

    const/4 v0, 0x1

    .line 48
    invoke-direct {p0, p1, v0}, Ll/᩻ᩴᩳ;->֫(Ll/۬ᩴᩳ;Z)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()V
    .locals 6

    move-object v0, p0

    .line 65
    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ll/᩻ᩴᩳ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    :try_start_1
    iget-object v0, p0, Ll/᩻ᩴᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ۗ()[B

    move-result-object v0

    iget-object v1, p0, Ll/᩻ᩴᩳ;->ᩴ:Ljava/util/UUID;

    invoke-static {v1, v0}, Ll/۠֫ܿ;->֫(Ljava/util/UUID;[B)Ll/ۨۙᩳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    iget-object v1, p0, Ll/᩻ᩴᩳ;->ܿ:Ll/᩷۠ᩴ;

    iget-object v2, p0, Ll/᩻ᩴᩳ;->ᩴ:Ljava/util/UUID;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v3, v4, v5

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 68
    invoke-static {v1, v2, v0}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/util/List;)V

    :cond_0
    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Ll/᩻ᩴᩳ;->ᩳ:Ljava/io/IOException;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 70
    iput-object v0, p0, Ll/᩻ᩴᩳ;->ᩳ:Ljava/io/IOException;

    return-void

    .line 65
    :cond_1
    :try_start_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Attachment collection requires a drained queue"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ܽ()Ljava/io/IOException;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/᩻ᩴᩳ;->ᩳ:Ljava/io/IOException;

    return-object v0
.end method

.method public final ᩳ()Ll/᩷۠ᩴ;
    .locals 1

    .line 23
    iget-object v0, p0, Ll/᩻ᩴᩳ;->ܿ:Ll/᩷۠ᩴ;

    return-object v0
.end method
