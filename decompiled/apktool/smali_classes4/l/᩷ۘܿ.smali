.class public final Ll/᩷ۘܿ;
.super Ljava/lang/Object;
.source "470W"


# instance fields
.field public ֫:Ll/ۜۘܿ;

.field public ۧ:J

.field public ܽ:Ll/ܳۘܿ;

.field public ܿ:J

.field public ᩳ:Ljava/lang/Object;


# direct methods
.method private ֫(Ll/ܿۘܿ;Ll/۟᩸ᩳ;Ll/֡ۡܿ;)Ll/ۜۘܿ;
    .locals 4

    .line 91
    invoke-static {p1, p0}, Ll/ܿۘܿ;->֫(Ll/ܿۘܿ;Ll/᩷ۘܿ;)V

    .line 94
    new-instance v1, Ll/ۜۘܿ;

    invoke-direct {v1, p0, p1, p2, p3}, Ll/ۜۘܿ;-><init>(Ll/᩷ۘܿ;Ll/ܿۘܿ;Ll/۟᩸ᩳ;Ll/֡ۡܿ;)V

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 99
    :try_start_0
    iget-wide p1, p0, Ll/᩷ۘܿ;->ܿ:J

    invoke-static {v1}, Ll/ۜۘܿ;->ܽ(Ll/ۜۘܿ;)J

    move-result-wide v2

    cmp-long p3, p1, v2

    if-eqz p3, :cond_0

    .line 100
    invoke-static {v1}, Ll/ۜۘܿ;->ۜ(Ll/ۜۘܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    monitor-exit v0

    return-object v1

    .line 172
    :cond_0
    :try_start_1
    iget-object p1, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 173
    invoke-static {p1}, Ll/ۜۘܿ;->ۜ(Ll/ۜۘܿ;)V

    .line 174
    iput-object p2, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;

    .line 105
    :cond_1
    iget-object p1, p0, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/᩷ۘܿ;->ᩳ:Ljava/lang/Object;

    invoke-static {v1}, Ll/ۜۘܿ;->᩻(Ll/ۜۘܿ;)Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_2

    iget-object p1, p0, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    invoke-static {p1}, Ll/ܳۘܿ;->ܽ(Ll/ܳۘܿ;)Ll/᩺ܺܿ;

    move-result-object p1

    invoke-static {v1}, Ll/ۜۘܿ;->ܿ(Ll/ۜۘܿ;)Ll/᩺ܺܿ;

    move-result-object p3

    if-eq p1, p3, :cond_3

    .line 108
    :cond_2
    iput-object p2, p0, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    .line 109
    iput-object p2, p0, Ll/᩷ۘܿ;->ᩳ:Ljava/lang/Object;

    .line 111
    :cond_3
    invoke-static {v1}, Ll/ۜۘܿ;->ܽ(Ll/ۜۘܿ;)J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩷ۘܿ;->ۧ:J

    .line 112
    iput-object v1, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/᩷ۘܿ;Ll/ۜۘܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩷ۘܿ;->ۧ(Ll/ۜۘܿ;)V

    return-void
.end method

.method private declared-synchronized ۧ(Ll/ۜۘܿ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 180
    :try_start_0
    invoke-static {p1}, Ll/ۜۘܿ;->ۜ(Ll/ۜۘܿ;)V

    .line 181
    iget-object v1, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 182
    iput-object p1, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
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


# virtual methods
.method public final ֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;Ll/۟᩸ᩳ;JIILl/֡ۡܿ;Ll/ܳۘܿ;Ll/ܶۘܿ;)Ll/ۜۘܿ;
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v3, p6

    move/from16 v4, p7

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    const-string v7, "program"

    .line 35
    invoke-static {v0, v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v7, "textOwner"

    .line 36
    invoke-static {v2, v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    invoke-virtual/range {p3 .. p3}, Ll/۟᩸ᩳ;->length()I

    move-result v7

    .line 43
    invoke-static {v3, v4, v7}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    move-object/from16 v14, p0

    .line 0
    monitor-enter v14

    .line 53
    :try_start_0
    iget-wide v8, v1, Ll/᩷ۘܿ;->ܿ:J

    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    iput-wide v8, v1, Ll/᩷ۘܿ;->ܿ:J

    .line 165
    iget-object v10, v1, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    if-eqz v10, :cond_0

    iget-object v11, v1, Ll/᩷ۘܿ;->ᩳ:Ljava/lang/Object;

    if-ne v11, v2, :cond_0

    invoke-static {v10}, Ll/ܳۘܿ;->ܽ(Ll/ܳۘܿ;)Ll/᩺ܺܿ;

    move-result-object v10

    if-ne v10, v0, :cond_0

    iget-object v10, v1, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    invoke-static {v10}, Ll/ܳۘܿ;->ܳ(Ll/ܳۘܿ;)J

    move-result-wide v10

    cmp-long v12, v10, p4

    if-nez v12, :cond_0

    iget-object v10, v1, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    invoke-static {v10}, Ll/ܳۘܿ;->ܿ(Ll/ܳۘܿ;)I

    move-result v10

    if-ne v10, v7, :cond_0

    .line 60
    iget-object v10, v1, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    invoke-virtual {v10}, Ll/ܳۘܿ;->ܿ()Ll/ܽۘܿ;

    move-result-object v10

    .line 61
    iget-object v11, v1, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    invoke-virtual {v11}, Ll/ܳۘܿ;->֫()Ll/ۨۖܿ;

    move-result-object v11

    .line 62
    iget-object v12, v1, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    invoke-static {v12}, Ll/ܳۘܿ;->ۧ(Ll/ܳۘܿ;)Ll/ᩳۘܿ;

    move-result-object v12

    if-eq v3, v4, :cond_1

    .line 65
    invoke-virtual {v11, v0, v3}, Ll/ۨۖܿ;->֫(Ll/᩺ܺܿ;I)Ll/ۤ᩷ܿ;

    move-result-object v13

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :cond_1
    const/4 v13, 0x0

    :goto_0
    move-object/from16 v27, v11

    move-object/from16 v28, v13

    if-nez v10, :cond_4

    if-eqz v5, :cond_4

    .line 68
    iget-object v11, v1, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    if-ne v11, v5, :cond_4

    iget-object v11, v1, Ll/᩷ۘܿ;->ᩳ:Ljava/lang/Object;

    if-ne v11, v2, :cond_4

    invoke-static/range {p9 .. p9}, Ll/ܳۘܿ;->ܽ(Ll/ܳۘܿ;)Ll/᩺ܺܿ;

    move-result-object v11

    if-ne v11, v0, :cond_4

    if-eqz v6, :cond_4

    .line 70
    invoke-virtual/range {p10 .. p10}, Ll/ܶۘܿ;->ܿ()I

    move-result v11

    invoke-static/range {p9 .. p9}, Ll/ܳۘܿ;->ܿ(Ll/ܳۘܿ;)I

    move-result v13

    if-ne v11, v13, :cond_4

    .line 71
    invoke-virtual/range {p10 .. p10}, Ll/ܶۘܿ;->ᩳ()I

    move-result v11

    if-ne v11, v7, :cond_4

    .line 72
    invoke-virtual/range {p9 .. p9}, Ll/ܳۘܿ;->ܿ()Ll/ܽۘܿ;

    move-result-object v10

    .line 74
    invoke-virtual/range {p10 .. p10}, Ll/ܶۘܿ;->ܽ()Z

    move-result v11

    if-nez v11, :cond_3

    invoke-virtual/range {p1 .. p1}, Ll/᩺ܺܿ;->᩷()Z

    move-result v11

    if-eqz v11, :cond_3

    .line 75
    invoke-virtual/range {p1 .. p1}, Ll/᩺ܺܿ;->᩻()Z

    move-result v11

    if-eqz v11, :cond_3

    .line 76
    invoke-static/range {p9 .. p9}, Ll/ܳۘܿ;->ۧ(Ll/ܳۘܿ;)Ll/ᩳۘܿ;

    move-result-object v11

    if-nez v11, :cond_2

    .line 77
    new-instance v11, Ll/ᩳۘܿ;

    invoke-static/range {p9 .. p9}, Ll/ܳۘܿ;->ᩳ(Ll/ܳۘܿ;)Ll/ܽۘܿ;

    move-result-object v12

    invoke-static/range {p9 .. p9}, Ll/ܳۘܿ;->֫(Ll/ܳۘܿ;)Ll/ۨۖܿ;

    move-result-object v5

    invoke-direct {v11, v12, v5, v6}, Ll/ᩳۘܿ;-><init>(Ll/ܽۘܿ;Ll/ۨۖܿ;Ll/ܶۘܿ;)V

    move-object v12, v11

    goto :goto_1

    .line 78
    :cond_2
    invoke-static/range {p9 .. p9}, Ll/ܳۘܿ;->ۧ(Ll/ܳۘܿ;)Ll/ᩳۘܿ;

    move-result-object v5

    invoke-virtual {v5, v6}, Ll/ᩳۘܿ;->֫(Ll/ܶۘܿ;)Ll/ᩳۘܿ;

    move-result-object v5

    move-object v12, v5

    :cond_3
    :goto_1
    move-object/from16 v29, v6

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    move-object/from16 v29, v5

    :goto_2
    move-object/from16 v26, v10

    if-eqz v12, :cond_5

    .line 81
    iget-object v5, v12, Ll/ᩳۘܿ;->ܽ:Ll/ܽۘܿ;

    iget-object v6, v12, Ll/ᩳۘܿ;->֫:Ll/ܶۘܿ;

    invoke-virtual {v5, v6}, Ll/ܽۘܿ;->ۧ(Ll/ܶۘܿ;)Z

    move-result v5

    if-nez v5, :cond_5

    const/4 v5, 0x0

    move-object/from16 v30, v5

    goto :goto_3

    :cond_5
    move-object/from16 v30, v12

    .line 84
    :goto_3
    new-instance v5, Ll/ܿۘܿ;

    move-object v15, v5

    move-object/from16 v16, p0

    move-wide/from16 v17, v8

    move-object/from16 v19, p1

    move-object/from16 v20, p2

    move-wide/from16 v21, p4

    move/from16 v23, v7

    move/from16 v24, p6

    move/from16 v25, p7

    invoke-direct/range {v15 .. v30}, Ll/ܿۘܿ;-><init>(Ll/᩷ۘܿ;JLl/᩺ܺܿ;Ljava/lang/Object;JIIILl/ܽۘܿ;Ll/ۨۖܿ;Ll/ۤ᩷ܿ;Ll/ܶۘܿ;Ll/ᩳۘܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v14

    move-object/from16 v0, p3

    move-object/from16 v2, p8

    .line 46
    invoke-direct {v1, v5, v0, v2}, Ll/᩷ۘܿ;->֫(Ll/ܿۘܿ;Ll/۟᩸ᩳ;Ll/֡ۡܿ;)Ll/ۜۘܿ;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    .line 84
    :try_start_1
    monitor-exit v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ֫()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 124
    :try_start_0
    iget-wide v1, p0, Ll/᩷ۘܿ;->ܿ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷ۘܿ;->ܿ:J

    iput-wide v1, p0, Ll/᩷ۘܿ;->ۧ:J

    .line 172
    iget-object v1, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 173
    invoke-static {v1}, Ll/ۜۘܿ;->ۜ(Ll/ۜۘܿ;)V

    .line 174
    iput-object v2, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;

    .line 126
    :cond_0
    iput-object v2, p0, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    .line 127
    iput-object v2, p0, Ll/᩷ۘܿ;->ᩳ:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
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

.method public final ֫(Ll/ۜۘܿ;)Z
    .locals 8

    const-string v0, "work"

    .line 138
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 139
    invoke-static {p1}, Ll/ۜۘܿ;->ᩳ(Ll/ۜۘܿ;)Ll/᩷ۘܿ;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    invoke-static {p1}, Ll/ۜۘܿ;->ۧ(Ll/ۜۘܿ;)Ll/ܳۘܿ;

    move-result-object v2

    if-nez v2, :cond_1

    :goto_0
    return v1

    .line 147
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p1}, Ll/ۜۘܿ;->᩷(Ll/ۜۘܿ;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, p0

    .line 151
    monitor-enter v0

    .line 152
    :try_start_0
    iget-object v3, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;

    if-ne v3, p1, :cond_4

    iget-wide v3, p0, Ll/᩷ۘܿ;->ۧ:J

    invoke-static {p1}, Ll/ۜۘܿ;->ܽ(Ll/ۜۘܿ;)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_4

    invoke-static {p1}, Ll/ۜۘܿ;->ܳ(Ll/ۜۘܿ;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 155
    :cond_3
    iput-object v2, p0, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;

    .line 156
    invoke-static {p1}, Ll/ۜۘܿ;->᩻(Ll/ۜۘܿ;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۘܿ;->ᩳ:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 157
    iput-object p1, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;

    const/4 p1, 0x1

    .line 158
    monitor-exit v0

    return p1

    .line 153
    :cond_4
    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    .line 159
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 148
    :cond_5
    :goto_2
    invoke-direct {p0, p1}, Ll/᩷ۘܿ;->ۧ(Ll/ۜۘܿ;)V

    return v1
.end method

.method public final declared-synchronized ۧ()Ll/ܳۘܿ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 133
    :try_start_0
    iget-object v1, p0, Ll/᩷ۘܿ;->ܽ:Ll/ܳۘܿ;
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

    .line 118
    :try_start_0
    iget-wide v1, p0, Ll/᩷ۘܿ;->ܿ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷ۘܿ;->ܿ:J

    iput-wide v1, p0, Ll/᩷ۘܿ;->ۧ:J

    .line 172
    iget-object v1, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;

    if-eqz v1, :cond_0

    .line 173
    invoke-static {v1}, Ll/ۜۘܿ;->ۜ(Ll/ۜۘܿ;)V

    const/4 v1, 0x0

    .line 174
    iput-object v1, p0, Ll/᩷ۘܿ;->֫:Ll/ۜۘܿ;
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
