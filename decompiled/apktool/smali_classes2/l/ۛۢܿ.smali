.class public final Ll/ۛۢܿ;
.super Ljava/lang/Object;
.source "570W"


# instance fields
.field public ֫:Ll/۫ۢܿ;


# direct methods
.method private ֫(Ll/᩺ܺܿ;Ljava/lang/Object;)Ll/۫ۢܿ;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ll/۫ۢܿ;->֫(Ll/۫ۢܿ;)Ll/᩺ܺܿ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    invoke-static {v0}, Ll/۫ۢܿ;->ܽ(Ll/۫ۢܿ;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 131
    iget-object p1, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    return-object p1

    .line 133
    :cond_0
    iget-object v0, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴۖܿ;->֫()V

    .line 134
    :cond_1
    new-instance v0, Ll/۫ۢܿ;

    invoke-direct {v0, p1, p2}, Ll/۫ۢܿ;-><init>(Ll/᩺ܺܿ;Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    return-object v0
.end method

.method public static ֫(Ll/ۛۢܿ;Ll/ۤۢܿ;)Z
    .locals 4

    move-object v0, p0

    .line 140
    monitor-enter v0

    .line 141
    :try_start_0
    invoke-static {p1}, Ll/ۤۢܿ;->ۧ(Ll/ۤۢܿ;)Ll/ۛۢܿ;

    move-result-object v1

    const/4 v2, 0x0

    if-ne v1, p0, :cond_3

    iget-object v1, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    invoke-static {p1}, Ll/ۤۢܿ;->֫(Ll/ۤۢܿ;)Ll/۫ۢܿ;

    move-result-object v3

    if-eq v1, v3, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 143
    invoke-static {p1}, Ll/ۤۢܿ;->֫(Ll/ۤۢܿ;)Ll/۫ۢܿ;

    move-result-object v0

    invoke-static {v0}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v0

    invoke-static {p1}, Ll/ۤۢܿ;->ܽ(Ll/ۤۢܿ;)Ll/ۘۖܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩴۖܿ;->֫(Ll/ۘۖܿ;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    move-object v0, p0

    .line 144
    monitor-enter v0

    .line 145
    :try_start_1
    iget-object p0, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    invoke-static {p1}, Ll/ۤۢܿ;->֫(Ll/ۤۢܿ;)Ll/۫ۢܿ;

    move-result-object p1

    if-ne p0, p1, :cond_2

    const/4 v2, 0x1

    :cond_2
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p0

    .line 146
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 141
    :cond_3
    :goto_0
    :try_start_2
    monitor-exit v0

    return v2

    :catchall_1
    move-exception p0

    .line 142
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;Ll/۟᩸ᩳ;JLl/֡ۡܿ;)Ll/ۤۢܿ;
    .locals 8

    const-string v0, "program"

    .line 23
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "textOwner"

    .line 24
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p0

    .line 29
    monitor-enter v0

    .line 30
    :try_start_0
    invoke-direct {p0, p1, p2}, Ll/ۛۢܿ;->֫(Ll/᩺ܺܿ;Ljava/lang/Object;)Ll/۫ۢܿ;

    move-result-object p2

    .line 31
    invoke-static {p2}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ᩴۖܿ;->֫(Ll/᩺ܺܿ;)Ll/ۡۖܿ;

    move-result-object v3

    .line 32
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-static {p2}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-virtual/range {v2 .. v7}, Ll/ᩴۖܿ;->֫(Ll/ۡۖܿ;Ll/۟᩸ᩳ;JLl/ܿۖ᩷;)Ll/ۘۖܿ;

    move-result-object p1

    .line 35
    new-instance p3, Ll/ۤۢܿ;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p2, p1, p4}, Ll/ۤۢܿ;-><init>(Ll/ۛۢܿ;Ll/۫ۢܿ;Ll/ۘۖܿ;Z)V

    return-object p3

    :catchall_0
    move-exception p1

    .line 32
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;Ll/۟᩸ᩳ;Ll/ܺۖܿ;JLl/ܶۘܿ;Ll/֡ۡܿ;)Ll/ۤۢܿ;
    .locals 14

    move-object v0, p1

    move-object/from16 v1, p4

    move-object/from16 v2, p7

    if-eqz v1, :cond_0

    const-string v3, "changes"

    .line 56
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :cond_0
    const-string v3, "program"

    .line 66
    invoke-static {p1, v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v3, "textOwner"

    move-object/from16 v4, p2

    .line 67
    invoke-static {v4, v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v12, p0

    .line 78
    monitor-enter v12

    .line 79
    :try_start_0
    invoke-direct/range {p0 .. p2}, Ll/ۛۢܿ;->֫(Ll/᩺ܺܿ;Ljava/lang/Object;)Ll/۫ۢܿ;

    move-result-object v3

    .line 81
    invoke-static {v3}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v4

    move-object v13, v4

    monitor-enter v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 82
    :try_start_1
    invoke-static {v3}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ᩴۖܿ;->ۧ()Ll/ܺۖܿ;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    if-ne v4, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    .line 87
    invoke-static {v3}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/ᩴۖܿ;->֫(Ll/᩺ܺܿ;)Ll/ۡۖܿ;

    move-result-object v0

    const/4 v2, 0x0

    move-object v5, v0

    goto :goto_2

    .line 89
    :cond_2
    invoke-virtual {v4}, Ll/ܺۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v0

    int-to-long v7, v6

    add-long/2addr v7, v7

    int-to-long v9, v0

    cmp-long v11, v7, v9

    if-gtz v11, :cond_7

    if-eqz v2, :cond_3

    move-object v0, v2

    goto :goto_1

    .line 94
    :cond_3
    new-instance v2, Ll/۠ۘܿ;

    long-to-int v8, v7

    invoke-direct {v2, v6, v8, v6}, Ll/۠ۘܿ;-><init>(III)V

    new-array v5, v5, [Ll/۠ۘܿ;

    aput-object v2, v5, v6

    invoke-static {v0, v5}, Ll/ܶۘܿ;->֫(I[Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object v0

    .line 96
    :goto_1
    invoke-static {v3}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v2

    invoke-virtual {v2, v4, v0}, Ll/ᩴۖܿ;->֫(Ll/ܺۖܿ;Ll/ܶۘܿ;)Ll/ۡۖܿ;

    move-result-object v2

    move-object v5, v2

    move-object v2, v0

    .line 98
    :goto_2
    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    :try_start_2
    monitor-exit v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_5

    .line 101
    invoke-virtual {v2}, Ll/ܶۘܿ;->ᩳ()I

    move-result v0

    invoke-virtual/range {p3 .. p3}, Ll/۟᩸ᩳ;->length()I

    move-result v2

    if-ne v0, v2, :cond_4

    goto :goto_3

    .line 102
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Syntax edit does not match the current base"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    if-eqz v1, :cond_6

    .line 105
    invoke-static {v3}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v4

    move-object/from16 v6, p3

    move-wide/from16 v7, p5

    move-object/from16 v9, p8

    invoke-virtual/range {v4 .. v9}, Ll/ᩴۖܿ;->֫(Ll/ۡۖܿ;Ll/۟᩸ᩳ;JLl/֡ۡܿ;)Ll/ۘۖܿ;

    move-result-object v0

    goto :goto_4

    .line 107
    :cond_6
    invoke-static {v3}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v4

    move-object/from16 v6, p3

    move-wide/from16 v7, p5

    move-object/from16 v9, p8

    invoke-virtual/range {v4 .. v9}, Ll/ᩴۖܿ;->֫(Ll/ۡۖܿ;Ll/۟᩸ᩳ;JLl/ܿۖ᩷;)Ll/ۘۖܿ;

    move-result-object v0

    .line 108
    :goto_4
    new-instance v2, Ll/ۤۢܿ;

    move-object v4, p0

    invoke-direct {v2, p0, v3, v0, v1}, Ll/ۤۢܿ;-><init>(Ll/ۛۢܿ;Ll/۫ۢܿ;Ll/ۘۖܿ;Z)V

    return-object v2

    :cond_7
    move-object v4, p0

    .line 92
    :try_start_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Syntax edit does not match the current base"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    move-object v4, p0

    .line 98
    :goto_5
    monitor-exit v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v4, p0

    .line 99
    :goto_6
    monitor-exit v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v0

    :catchall_3
    move-exception v0

    goto :goto_6
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 124
    :try_start_0
    iget-object v1, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴۖܿ;->֫()V

    :cond_0
    const/4 v1, 0x0

    .line 125
    iput-object v1, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
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

.method public final declared-synchronized ۧ()Ll/ܺۖܿ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 114
    :try_start_0
    iget-object v1, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴۖܿ;->ۧ()Ll/ܺۖܿ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
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
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 119
    :try_start_0
    iget-object v1, p0, Ll/ۛۢܿ;->֫:Ll/۫ۢܿ;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ll/۫ۢܿ;->ۧ(Ll/۫ۢܿ;)Ll/ᩴۖܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴۖܿ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
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
