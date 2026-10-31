.class public final Ll/ᩴۖܿ;
.super Ljava/lang/Object;
.source "N70B"


# instance fields
.field public ֫:Ll/ۘۖܿ;

.field public ۧ:J

.field public ܽ:Ll/ܺۖܿ;

.field public ᩳ:J


# direct methods
.method public static bridge synthetic ֫(Ll/ᩴۖܿ;Ll/ۘۖܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ᩴۖܿ;->ۧ(Ll/ۘۖܿ;)V

    return-void
.end method

.method private declared-synchronized ۧ(Ll/ۘۖܿ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 167
    :try_start_0
    invoke-static {p1}, Ll/ۘۖܿ;->ܳ(Ll/ۘۖܿ;)V

    .line 168
    iget-object v1, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 169
    iput-object p1, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
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

.method private declared-synchronized ܽ(Ll/ۘۖܿ;)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 94
    :try_start_0
    invoke-static {p1}, Ll/ۘۖܿ;->ܽ(Ll/ۘۖܿ;)J

    move-result-wide v1

    .line 95
    iget-wide v3, p0, Ll/ᩴۖܿ;->ᩳ:J

    cmp-long v5, v3, v1

    if-eqz v5, :cond_0

    .line 97
    invoke-static {p1}, Ll/ۘۖܿ;->ܳ(Ll/ۘۖܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    monitor-exit v0

    return-void

    .line 159
    :cond_0
    :try_start_1
    iget-object v3, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;

    if-eqz v3, :cond_1

    .line 160
    invoke-static {v3}, Ll/ۘۖܿ;->ܳ(Ll/ۘۖܿ;)V

    const/4 v3, 0x0

    .line 161
    iput-object v3, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;

    .line 102
    :cond_1
    iget-object v3, p0, Ll/ᩴۖܿ;->ܽ:Ll/ܺۖܿ;

    if-nez v3, :cond_2

    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v3

    goto :goto_0

    :cond_2
    invoke-static {v3}, Ll/ܺۖܿ;->ܳ(Ll/ܺۖܿ;)Ll/ۢۖܿ;

    move-result-object v3

    :goto_0
    invoke-static {p1, v3}, Ll/ۘۖܿ;->֫(Ll/ۘۖܿ;Ll/ۢۖܿ;)V

    .line 103
    iget-object v3, p0, Ll/ᩴۖܿ;->ܽ:Ll/ܺۖܿ;

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v3}, Ll/ܺۖܿ;->ᩳ(Ll/ܺۖܿ;)J

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    iput-wide v1, p0, Ll/ᩴۖܿ;->ۧ:J

    .line 105
    iput-object p1, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/ۡۖܿ;Ll/۟᩸ᩳ;JLl/֡ۡܿ;)Ll/ۘۖܿ;
    .locals 13

    move-object v11, p0

    const/4 v0, 0x1

    move-object v1, p1

    .line 83
    invoke-static {p1, p0, v0}, Ll/ۡۖܿ;->֫(Ll/ۡۖܿ;Ll/ᩴۖܿ;Z)V

    .line 86
    invoke-static {p1}, Ll/ۡۖܿ;->֫(Ll/ۡۖܿ;)Ll/ܺۖܿ;

    move-result-object v9

    .line 87
    invoke-static {p1}, Ll/ۡۖܿ;->ۧ(Ll/ۡۖܿ;)Ll/ܶۘܿ;

    move-result-object v10

    .line 88
    new-instance v12, Ll/ۘۖܿ;

    invoke-static {v9}, Ll/ܺۖܿ;->ܿ(Ll/ܺۖܿ;)Ll/᩺ܺܿ;

    move-result-object v2

    invoke-static {p1}, Ll/ۡۖܿ;->ܽ(Ll/ۡۖܿ;)J

    move-result-wide v6

    move-object v0, v12

    move-object v1, p0

    move-object v3, p2

    move-wide/from16 v4, p3

    move-object/from16 v8, p5

    invoke-direct/range {v0 .. v10}, Ll/ۘۖܿ;-><init>(Ll/ᩴۖܿ;Ll/᩺ܺܿ;Ll/۟᩸ᩳ;JJLl/ܿۖ᩷;Ll/ܺۖܿ;Ll/ܶۘܿ;)V

    invoke-direct {p0, v12}, Ll/ᩴۖܿ;->ܽ(Ll/ۘۖܿ;)V

    return-object v12
.end method

.method public final ֫(Ll/ۡۖܿ;Ll/۟᩸ᩳ;JLl/ܿۖ᩷;)Ll/ۘۖܿ;
    .locals 13

    move-object v11, p0

    const/4 v0, 0x0

    move-object v1, p1

    .line 74
    invoke-static {p1, p0, v0}, Ll/ۡۖܿ;->֫(Ll/ۡۖܿ;Ll/ᩴۖܿ;Z)V

    .line 77
    new-instance v12, Ll/ۘۖܿ;

    invoke-static {p1}, Ll/ۡۖܿ;->ᩳ(Ll/ۡۖܿ;)Ll/᩺ܺܿ;

    move-result-object v2

    invoke-static {p1}, Ll/ۡۖܿ;->ܽ(Ll/ۡۖܿ;)J

    move-result-wide v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, v12

    move-object v1, p0

    move-object v3, p2

    move-wide/from16 v4, p3

    move-object/from16 v8, p5

    invoke-direct/range {v0 .. v10}, Ll/ۘۖܿ;-><init>(Ll/ᩴۖܿ;Ll/᩺ܺܿ;Ll/۟᩸ᩳ;JJLl/ܿۖ᩷;Ll/ܺۖܿ;Ll/ܶۘܿ;)V

    invoke-direct {p0, v12}, Ll/ᩴۖܿ;->ܽ(Ll/ۘۖܿ;)V

    return-object v12
.end method

.method public final declared-synchronized ֫(Ll/ܺۖܿ;Ll/ܶۘܿ;)Ll/ۡۖܿ;
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 63
    :try_start_0
    iget-object v1, p0, Ll/ᩴۖܿ;->ܽ:Ll/ܺۖܿ;

    if-ne p1, v1, :cond_1

    .line 66
    invoke-virtual {p2}, Ll/ܶۘܿ;->ܿ()I

    move-result v1

    invoke-static {p1}, Ll/ܺۖܿ;->ܽ(Ll/ܺۖܿ;)Ll/۫ۘܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۫ۘܿ;->ۧ()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 69
    new-instance v1, Ll/ۡۖܿ;

    iget-wide v2, p0, Ll/ᩴۖܿ;->ᩳ:J

    const-wide/16 v4, 0x1

    add-long v5, v2, v4

    iput-wide v5, p0, Ll/ᩴۖܿ;->ᩳ:J

    invoke-static {p1}, Ll/ܺۖܿ;->ܿ(Ll/ܺۖܿ;)Ll/᩺ܺܿ;

    move-result-object v7

    move-object v3, v1

    move-object v4, p0

    move-object v8, p1

    move-object v9, p2

    invoke-direct/range {v3 .. v9}, Ll/ۡۖܿ;-><init>(Ll/ᩴۖܿ;JLl/᩺ܺܿ;Ll/ܺۖܿ;Ll/ܶۘܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 67
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Base result and change set lengths differ"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Base result is not the current published result"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 69
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/᩺ܺܿ;)Ll/ۡۖܿ;
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 54
    :try_start_0
    new-instance v8, Ll/ۡۖܿ;

    iget-wide v1, p0, Ll/ᩴۖܿ;->ᩳ:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Ll/ᩴۖܿ;->ᩳ:J

    const-string v1, "program"

    .line 55
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Ll/ۡۖܿ;-><init>(Ll/ᩴۖܿ;JLl/᩺ܺܿ;Ll/ܺۖܿ;Ll/ܶۘܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    monitor-exit v0

    return-object v8

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 117
    :try_start_0
    iget-wide v1, p0, Ll/ᩴۖܿ;->ᩳ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ᩴۖܿ;->ᩳ:J

    iput-wide v1, p0, Ll/ᩴۖܿ;->ۧ:J

    .line 159
    iget-object v1, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 160
    invoke-static {v1}, Ll/ۘۖܿ;->ܳ(Ll/ۘۖܿ;)V

    .line 161
    iput-object v2, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;

    .line 119
    :cond_0
    iput-object v2, p0, Ll/ᩴۖܿ;->ܽ:Ll/ܺۖܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ۘۖܿ;)Z
    .locals 8

    const-string v0, "work"

    .line 133
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 134
    invoke-static {p1}, Ll/ۘۖܿ;->ᩳ(Ll/ۘۖܿ;)Ll/ᩴۖܿ;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    invoke-static {p1}, Ll/ۘۖܿ;->ۧ(Ll/ۘۖܿ;)Ll/ܺۖܿ;

    move-result-object v2

    if-nez v2, :cond_1

    :goto_0
    return v1

    .line 142
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p1}, Ll/ۘۖܿ;->᩻(Ll/ۘۖܿ;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, p0

    .line 146
    monitor-enter v0

    .line 147
    :try_start_0
    iget-object v3, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;

    if-ne v3, p1, :cond_4

    iget-wide v3, p0, Ll/ᩴۖܿ;->ۧ:J

    invoke-static {p1}, Ll/ۘۖܿ;->ܽ(Ll/ۘۖܿ;)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_4

    invoke-static {p1}, Ll/ۘۖܿ;->ܿ(Ll/ۘۖܿ;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 150
    :cond_3
    iput-object v2, p0, Ll/ᩴۖܿ;->ܽ:Ll/ܺۖܿ;

    const/4 p1, 0x0

    .line 152
    iput-object p1, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;

    const/4 p1, 0x1

    .line 153
    monitor-exit v0

    return p1

    .line 148
    :cond_4
    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    .line 154
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 143
    :cond_5
    :goto_2
    invoke-direct {p0, p1}, Ll/ᩴۖܿ;->ۧ(Ll/ۘۖܿ;)V

    return v1
.end method

.method public final declared-synchronized ۧ()Ll/ܺۖܿ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 125
    :try_start_0
    iget-object v1, p0, Ll/ᩴۖܿ;->ܽ:Ll/ܺۖܿ;
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

.method public final declared-synchronized ܽ()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 111
    :try_start_0
    iget-wide v1, p0, Ll/ᩴۖܿ;->ᩳ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ᩴۖܿ;->ᩳ:J

    iput-wide v1, p0, Ll/ᩴۖܿ;->ۧ:J

    .line 159
    iget-object v1, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;

    if-eqz v1, :cond_0

    .line 160
    invoke-static {v1}, Ll/ۘۖܿ;->ܳ(Ll/ۘۖܿ;)V

    const/4 v1, 0x0

    .line 161
    iput-object v1, p0, Ll/ᩴۖܿ;->֫:Ll/ۘۖܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
