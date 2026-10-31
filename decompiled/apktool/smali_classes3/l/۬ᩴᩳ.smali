.class public final Ll/۬ᩴᩳ;
.super Ljava/lang/Object;
.source "36RQ"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֫֫:Ljava/util/UUID;

.field public final ۗ:[B

.field public final ۙ:Landroid/os/Bundle;

.field public ۛ:Ljava/lang/String;

.field public ۟:Z

.field public ۤ:I

.field public ۧ֫:Landroid/os/Bundle;

.field public ۨ:Z

.field public ۫:Z

.field public ۬:[B

.field public final ܰ:J

.field public final ܽ֫:Ll/ۗ֫ܿ;

.field public ᩶:Z

.field public ᩸:Ll/ۨۙᩳ;

.field public ᩹:Ll/۟ۗᩳ;

.field public ᩺:Ll/۫ᩴᩳ;


# direct methods
.method public constructor <init>(Ll/۟ۗᩳ;Ll/۫ᩴᩳ;Landroid/os/Bundle;Ll/ۗ֫ܿ;)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p4, p0, Ll/۬ᩴᩳ;->ܽ֫:Ll/ۗ֫ܿ;

    .line 45
    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p4, p0, Ll/۬ᩴᩳ;->ۧ֫:Landroid/os/Bundle;

    .line 46
    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p4, p0, Ll/۬ᩴᩳ;->ۙ:Landroid/os/Bundle;

    .line 47
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p3

    invoke-virtual {p2}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p3

    iput-object p3, p0, Ll/۬ᩴᩳ;->ۗ:[B

    .line 48
    invoke-virtual {p1}, Ll/۟ۗᩳ;->ᩳ()Ljava/util/UUID;

    move-result-object p3

    iput-object p3, p0, Ll/۬ᩴᩳ;->֫֫:Ljava/util/UUID;

    invoke-virtual {p1}, Ll/۟ۗᩳ;->ܽ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۬ᩴᩳ;->ܰ:J

    .line 49
    invoke-virtual {p1}, Ll/۟ۗᩳ;->֫()[B

    move-result-object p4

    iput-object p4, p0, Ll/۬ᩴᩳ;->۬:[B

    .line 50
    invoke-static {p3, p4}, Ll/۠֫ܿ;->ۧ(Ljava/util/UUID;[B)V

    .line 51
    iput-object p1, p0, Ll/۬ᩴᩳ;->᩹:Ll/۟ۗᩳ;

    iput-object p2, p0, Ll/۬ᩴᩳ;->᩺:Ll/۫ᩴᩳ;

    return-void
.end method

.method public static ֫(Ll/۫ۨᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;[B[BIJ[B)Ll/۬ᩴᩳ;
    .locals 16

    move-object/from16 v0, p2

    .line 67
    invoke-virtual/range {p0 .. p0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v8

    .line 68
    instance-of v1, v8, Ll/ۙ֫ܿ;

    if-eqz v1, :cond_3

    move-object v9, v8

    check-cast v9, Ll/ۙ֫ܿ;

    .line 69
    invoke-virtual {v9}, Ll/ۙ֫ܿ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v10

    .line 70
    invoke-virtual {v10}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v11

    .line 71
    invoke-virtual/range {p0 .. p0}, Ll/۫ۨᩳ;->᩶()Ll/ۗ֫ܿ;

    move-result-object v13

    .line 73
    invoke-virtual {v10}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v14

    move-object v1, v14

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v13

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v7, p5

    .line 74
    :try_start_0
    invoke-static/range {v1 .. v7}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)Ll/۫ᩴᩳ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 75
    invoke-virtual {v14}, Ll/۬᩹ᩳ;->close()V

    move-object v15, v10

    .line 79
    :try_start_1
    monitor-enter v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 80
    :try_start_2
    invoke-virtual {v10}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v2

    cmp-long v4, v2, v11

    if-nez v4, :cond_2

    invoke-virtual/range {p0 .. p0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    if-ne v2, v8, :cond_2

    cmp-long v2, v11, p6

    if-nez v2, :cond_0

    .line 81
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v2

    invoke-virtual {v1}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2

    move-object/from16 v3, p8

    invoke-static {v3, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    invoke-virtual {v1}, Ll/۫ᩴᩳ;->close()V

    const/4 v0, 0x0

    return-object v0

    .line 82
    :cond_0
    :try_start_3
    invoke-virtual {v10}, Ll/᩻۬ᩳ;->ܳ()Ll/۟ۗᩳ;

    move-result-object v2

    .line 83
    monitor-exit v15
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 85
    :try_start_4
    new-instance v3, Ll/۬ᩴᩳ;

    move-object/from16 v4, p1

    invoke-direct {v3, v2, v1, v4, v13}, Ll/۬ᩴᩳ;-><init>(Ll/۟ۗᩳ;Ll/۫ᩴᩳ;Landroid/os/Bundle;Ll/ۗ֫ܿ;)V

    .line 86
    invoke-virtual {v9}, Ll/ۙ֫ܿ;->isChanged()Z

    move-result v4

    iput-boolean v4, v3, Ll/۬ᩴᩳ;->۫:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 87
    :cond_1
    iget v0, v0, Ll/᩺ܶᩳ;->ܽ:I

    :goto_0
    iput v0, v3, Ll/۬ᩴᩳ;->ۤ:I

    .line 88
    invoke-virtual/range {p0 .. p0}, Ll/۫ۨᩳ;->᩹֫()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Ll/۬ᩴᩳ;->ۛ:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v3

    :catchall_0
    move-exception v0

    .line 91
    :try_start_5
    invoke-virtual {v2}, Ll/۟ۗᩳ;->close()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 80
    :cond_2
    :try_start_6
    new-instance v0, Ll/ۗᩴᩳ;

    const-string v2, "Fragment owner changed during capture"

    .line 97
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    throw v0

    :catchall_1
    move-exception v0

    .line 83
    monitor-exit v15
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    .line 92
    invoke-virtual {v1}, Ll/۫ᩴᩳ;->close()V

    throw v0

    :catchall_3
    move-exception v0

    move-object v1, v0

    .line 73
    :try_start_8
    invoke-virtual {v14}, Ll/۬᩹ᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_1

    :catchall_4
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1

    .line 68
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment checkpoint requires a session owner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ᩵()Ll/۟ۗᩳ;
    .locals 3

    .line 158
    iget-object v0, p0, Ll/۬ᩴᩳ;->᩹:Ll/۟ۗᩳ;

    const/4 v1, 0x0

    .line 159
    iput-object v1, p0, Ll/۬ᩴᩳ;->᩹:Ll/۟ۗᩳ;

    .line 160
    iput-object v1, p0, Ll/۬ᩴᩳ;->۬:[B

    iput-object v1, p0, Ll/۬ᩴᩳ;->ۧ֫:Landroid/os/Bundle;

    .line 161
    iget-object v2, p0, Ll/۬ᩴᩳ;->᩺:Ll/۫ᩴᩳ;

    iput-object v1, p0, Ll/۬ᩴᩳ;->᩺:Ll/۫ᩴᩳ;

    if-eqz v2, :cond_0

    .line 162
    invoke-virtual {v2}, Ll/۫ᩴᩳ;->close()V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    move-object v0, p0

    .line 149
    monitor-enter v0

    const/4 v1, 0x1

    .line 150
    :try_start_0
    iput-boolean v1, p0, Ll/۬ᩴᩳ;->᩶:Z

    .line 151
    iget-boolean v1, p0, Ll/۬ᩴᩳ;->۟:Z

    if-nez v1, :cond_0

    invoke-direct {p0}, Ll/۬ᩴᩳ;->᩵()Ll/۟ۗᩳ;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 152
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 153
    invoke-virtual {v1}, Ll/۟ۗᩳ;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 152
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)J
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v16, p0

    .line 113
    monitor-enter v16

    .line 114
    :try_start_0
    iget-boolean v0, v1, Ll/۬ᩴᩳ;->᩶:Z

    if-nez v0, :cond_a

    iget-boolean v0, v1, Ll/۬ᩴᩳ;->ۨ:Z

    if-nez v0, :cond_a

    iget-boolean v0, v1, Ll/۬ᩴᩳ;->۟:Z

    if-nez v0, :cond_a

    const/4 v0, 0x1

    .line 115
    iput-boolean v0, v1, Ll/۬ᩴᩳ;->۟:Z

    iget-object v2, v1, Ll/۬ᩴᩳ;->᩹:Ll/۟ۗᩳ;

    iget-object v3, v1, Ll/۬ᩴᩳ;->᩺:Ll/۫ᩴᩳ;

    invoke-virtual {v3}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v4

    iget-object v5, v1, Ll/۬ᩴᩳ;->᩸:Ll/ۨۙᩳ;

    .line 116
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 117
    :try_start_1
    array-length v8, v4

    int-to-long v8, v8

    const-wide/16 v10, 0x4

    mul-long v8, v8, v10

    const-wide/32 v10, 0x8000

    add-long/2addr v8, v10

    invoke-virtual {v3, v8, v9}, Ll/۫ᩴᩳ;->ۧ(J)Ll/ۚ۬ᩳ;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    if-nez v5, :cond_0

    .line 119
    :try_start_2
    iget-object v9, v1, Ll/۬ᩴᩳ;->֫֫:Ljava/util/UUID;

    new-instance v10, Ljava/io/ByteArrayInputStream;

    invoke-direct {v10, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length v5, v4

    int-to-long v11, v5

    array-length v4, v4

    int-to-long v13, v4

    move-object/from16 v8, p1

    move-object/from16 v15, p2

    invoke-static/range {v8 .. v15}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/io/ByteArrayInputStream;JJLl/֨۬ᩳ;)Ll/ۨۙᩳ;

    move-result-object v5

    :cond_0
    move-object/from16 v16, p0

    .line 121
    monitor-enter v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 122
    :try_start_3
    iput-object v5, v1, Ll/۬ᩴᩳ;->᩸:Ll/ۨۙᩳ;

    .line 123
    iget-boolean v4, v1, Ll/۬ᩴᩳ;->᩶:Z

    if-nez v4, :cond_5

    .line 124
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 126
    :try_start_4
    iget-object v4, v1, Ll/۬ᩴᩳ;->ۧ֫:Landroid/os/Bundle;

    move-object/from16 v8, p1

    invoke-static {v8, v4}, Ll/ۢ֡ᩳ;->֫(Ll/᩷۠ᩴ;Landroid/os/Bundle;)V

    .line 127
    iget-object v4, v1, Ll/۬ᩴᩳ;->۬:[B

    iget-object v8, v1, Ll/۬ᩴᩳ;->֫֫:Ljava/util/UUID;

    invoke-static {v4, v5, v8}, Ll/۠֫ܿ;->֫([BLl/ۨۙᩳ;Ljava/util/UUID;)[B

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/۟ۗᩳ;->ۧ([B)J

    move-result-wide v4

    move-object/from16 v16, p0

    .line 128
    monitor-enter v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    iput-boolean v0, v1, Ll/۬ᩴᩳ;->ۨ:Z

    monitor-exit v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v3, :cond_1

    .line 130
    :try_start_6
    invoke-virtual {v3}, Ll/ۚ۬ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :cond_1
    move-object/from16 v16, p0

    .line 132
    monitor-enter v16

    .line 133
    :try_start_7
    iput-boolean v6, v1, Ll/۬ᩴᩳ;->۟:Z

    .line 134
    iget-boolean v0, v1, Ll/۬ᩴᩳ;->᩶:Z

    if-nez v0, :cond_2

    iget-boolean v0, v1, Ll/۬ᩴᩳ;->ۨ:Z

    if-eqz v0, :cond_3

    :cond_2
    invoke-direct/range {p0 .. p0}, Ll/۬ᩴᩳ;->᩵()Ll/۟ۗᩳ;

    move-result-object v7

    .line 135
    :cond_3
    monitor-exit v16
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v7, :cond_4

    .line 136
    invoke-virtual {v7}, Ll/۟ۗᩳ;->close()V

    :cond_4
    return-wide v4

    :catchall_0
    move-exception v0

    .line 135
    :try_start_8
    monitor-exit v16
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    .line 128
    :try_start_9
    monitor-exit v16
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 123
    :cond_5
    :try_start_b
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v2, "Fragment checkpoint was discarded"

    invoke-direct {v0, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    .line 124
    monitor-exit v16
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :try_start_c
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :catchall_3
    move-exception v0

    move-object v2, v0

    if-eqz v3, :cond_6

    .line 117
    :try_start_d
    invoke-virtual {v3}, Ll/ۚ۬ᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    goto :goto_0

    :catchall_4
    move-exception v0

    move-object v3, v0

    :try_start_e
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_0
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :catchall_5
    move-exception v0

    move-object/from16 v16, p0

    .line 132
    monitor-enter v16

    .line 133
    :try_start_f
    iput-boolean v6, v1, Ll/۬ᩴᩳ;->۟:Z

    .line 134
    iget-boolean v2, v1, Ll/۬ᩴᩳ;->᩶:Z

    if-nez v2, :cond_7

    iget-boolean v2, v1, Ll/۬ᩴᩳ;->ۨ:Z

    if-eqz v2, :cond_8

    :cond_7
    invoke-direct/range {p0 .. p0}, Ll/۬ᩴᩳ;->᩵()Ll/۟ۗᩳ;

    move-result-object v7

    .line 135
    :cond_8
    monitor-exit v16
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    if-eqz v7, :cond_9

    .line 136
    invoke-virtual {v7}, Ll/۟ۗᩳ;->close()V

    .line 137
    :cond_9
    throw v0

    :catchall_6
    move-exception v0

    .line 135
    :try_start_10
    monitor-exit v16
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    throw v0

    .line 114
    :cond_a
    :try_start_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Fragment checkpoint is unavailable"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_7
    move-exception v0

    .line 116
    monitor-exit v16
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    throw v0
.end method

.method public final declared-synchronized ֫()Ll/ۨۙᩳ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 144
    :try_start_0
    iget-object v1, p0, Ll/۬ᩴᩳ;->᩸:Ll/ۨۙᩳ;
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

.method public final ۖ()J
    .locals 2

    .line 140
    iget-wide v0, p0, Ll/۬ᩴᩳ;->ܰ:J

    return-wide v0
.end method

.method public final ۘ()Ljava/util/UUID;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/۬ᩴᩳ;->֫֫:Ljava/util/UUID;

    return-object v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/۬ᩴᩳ;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Ll/۬ᩴᩳ;->۫:Z

    return v0
.end method

.method public final ܽ()Landroid/os/Bundle;
    .locals 2

    .line 35
    new-instance v0, Landroid/os/Bundle;

    iget-object v1, p0, Ll/۬ᩴᩳ;->ۙ:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 1

    .line 100
    iget-object v0, p0, Ll/۬ᩴᩳ;->ۗ:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public final ᩴ()Ll/ۗ֫ܿ;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/۬ᩴᩳ;->ܽ֫:Ll/ۗ֫ܿ;

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 33
    iget v0, p0, Ll/۬ᩴᩳ;->ۤ:I

    return v0
.end method
