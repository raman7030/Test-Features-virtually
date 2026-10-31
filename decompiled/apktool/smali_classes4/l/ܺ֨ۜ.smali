.class public final Ll/ܺ֨ۜ;
.super Ljava/lang/Object;
.source "O741"

# interfaces
.implements Ll/ܶۚۜ;


# instance fields
.field public final ֫:Ll/᩷֨ۜ;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ll/ۢ֨ۜ;

.field public final ܽ:Ll/ۢ֨ۜ;

.field public final ܿ:J

.field public final ᩳ:Ll/ܶ۠֫;


# direct methods
.method public constructor <init>(Ll/ܶ۠֫;Ll/᩷֨ۜ;Ll/ۢ֨ۜ;Ll/ۢ֨ۜ;JLjava/lang/String;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ܺ֨ۜ;->ᩳ:Ll/ܶ۠֫;

    .line 50
    iput-object p2, p0, Ll/ܺ֨ۜ;->֫:Ll/᩷֨ۜ;

    .line 51
    iput-object p3, p0, Ll/ܺ֨ۜ;->ܽ:Ll/ۢ֨ۜ;

    .line 52
    iput-object p4, p0, Ll/ܺ֨ۜ;->ܳ:Ll/ۢ֨ۜ;

    .line 53
    iput-wide p5, p0, Ll/ܺ֨ۜ;->ܿ:J

    .line 54
    iput-object p7, p0, Ll/ܺ֨ۜ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ۖ֨ۜ;Ll/᩸᩺֫;)Ljava/lang/String;
    .locals 4

    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۖ֨ۜ;->ᩳ()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۖ֨ۜ;->ܳ()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    invoke-virtual {p0}, Ll/ۖ֨ۜ;->ܽ()Ll/ۙ᩺֫;

    move-result-object p0

    iget-object p0, p0, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-object v2, p1, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    invoke-static {p0, v2}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p1, Ll/᩹᩺֫;->᩹:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide p0, p1, Ll/᩹᩺֫;->᩸:J

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۙ᩺֫;Ll/᩸᩺֫;Ll/ܶ۠֫;Ll/᩻۬ۜ;Ll/֨۠ۜ;Ll/ܽۚۜ;Ljava/util/concurrent/ThreadPoolExecutor;)Ll/ۢ֨ۜ;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p0

    .line 207
    iget-object v4, v4, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-object v5, v0, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    invoke-static {v4, v5}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    .line 208
    iget-wide v9, v0, Ll/᩹᩺֫;->᩹:J

    .line 209
    iget-wide v4, v0, Ll/᩹᩺֫;->᩸:J

    .line 362
    invoke-virtual {v11}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v6, "http"

    .line 363
    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    const-wide/16 v7, -0x1

    const/4 v12, 0x0

    if-nez v6, :cond_2

    const-string v6, "https"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v3, :cond_a

    .line 214
    invoke-virtual {v3, v11}, Ll/ܽۚۜ;->ۧ(Landroid/net/Uri;)Ll/ᩳۜܳ;

    move-result-object v0

    .line 216
    invoke-virtual/range {p5 .. p5}, Ll/ܽۚۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v3

    invoke-virtual/range {p3 .. p3}, Ll/᩻۬ۜ;->ܳ()Ljava/lang/String;

    move-result-object v6

    .line 215
    invoke-static {v3, v0, v6}, Ll/᩷۬ۜ;->֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    cmp-long v6, v4, v7

    if-nez v6, :cond_1

    .line 218
    invoke-interface {v0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v4

    :cond_1
    move-object v13, v3

    goto :goto_1

    .line 212
    :cond_2
    :goto_0
    invoke-static {v11, v1}, Ll/᩷۬ۜ;->֫(Landroid/net/Uri;Ll/ܶ۠֫;)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    .line 223
    :goto_1
    invoke-virtual/range {p3 .. p3}, Ll/᩻۬ۜ;->ᩳ()Ll/ܺ᩸֫;

    move-result-object v3

    .line 362
    invoke-virtual {v11}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v6, "http"

    .line 363
    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    const/4 v14, 0x0

    if-nez v6, :cond_4

    const-string v6, "https"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v0, 0x1

    :goto_3
    const-wide/16 v15, 0x0

    cmp-long v6, v4, v15

    if-gez v6, :cond_5

    if-eqz v3, :cond_5

    .line 227
    invoke-virtual {v3, v13}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;)Ll/ۜ᩸֫;

    move-result-object v6

    .line 226
    invoke-static {v6}, Ll/۬᩵ᩳ;->֫(Ll/ܳ᩸֫;)J

    move-result-wide v17

    cmp-long v6, v17, v9

    if-lez v6, :cond_5

    sub-long v4, v17, v9

    :cond_5
    cmp-long v6, v4, v15

    if-gez v6, :cond_7

    if-eqz v0, :cond_7

    .line 233
    invoke-virtual {v2, v11, v1}, Ll/֨۠ۜ;->֫(Landroid/net/Uri;Ll/ܶ۠֫;)Ll/֡۠ۜ;

    move-result-object v4

    .line 234
    invoke-virtual {v4}, Ll/֡۠ۜ;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v4}, Ll/֡۠ۜ;->֫()J

    move-result-wide v5

    cmp-long v17, v5, v7

    if-nez v17, :cond_6

    goto :goto_4

    .line 237
    :cond_6
    invoke-virtual {v4}, Ll/֡۠ۜ;->֫()J

    move-result-wide v4

    sub-long/2addr v4, v9

    :cond_7
    move-wide/from16 v17, v4

    cmp-long v4, v17, v15

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    if-eqz v3, :cond_9

    move-object v4, v13

    move-wide v5, v9

    move-wide/from16 v7, v17

    .line 242
    invoke-virtual/range {v3 .. v8}, Ll/ܺ᩸֫;->ܳ(Ljava/lang/String;JJ)Z

    move-result v3

    if-eqz v3, :cond_9

    const/4 v14, 0x1

    :cond_9
    if-nez v14, :cond_15

    if-eqz v0, :cond_b

    .line 245
    invoke-virtual {v2, v11, v1}, Ll/֨۠ۜ;->֫(Landroid/net/Uri;Ll/ܶ۠֫;)Ll/֡۠ۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡۠ۜ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_15

    :cond_a
    :goto_4
    return-object v12

    .line 267
    :cond_b
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_14

    cmp-long v0, v9, v15

    if-lez v0, :cond_c

    move-wide v2, v9

    goto :goto_5

    :cond_c
    const-wide/16 v2, 0x1

    cmp-long v0, v17, v2

    if-lez v0, :cond_d

    goto :goto_5

    :cond_d
    move-wide v2, v15

    .line 271
    :goto_5
    new-instance v4, Ll/ۡ֨ۜ;

    invoke-interface/range {p2 .. p2}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v0

    invoke-direct {v4, v0}, Ll/ۡ֨ۜ;-><init>(Ll/᩸۠֫;)V

    .line 272
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_13

    .line 279
    :try_start_0
    new-instance v0, Ll/ۜ֨ۜ;

    invoke-direct {v0, v4, v11, v2, v3}, Ll/ۜ֨ۜ;-><init>(Ll/ۡ֨ۜ;Landroid/net/Uri;J)V

    move-object/from16 v1, p6

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    move-object/from16 v16, v4

    .line 288
    monitor-enter v16

    .line 289
    :goto_6
    :try_start_1
    invoke-static {v4}, Ll/ۡ֨ۜ;->ܽ(Ll/ۡ֨ۜ;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_e

    .line 291
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    .line 294
    :catch_0
    :try_start_3
    invoke-static {v4}, Ll/ۡ֨ۜ;->ܿ(Ll/ۡ֨ۜ;)V

    .line 295
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 296
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "Visitor range probe was canceled"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 299
    :cond_e
    invoke-static {v4}, Ll/ۡ֨ۜ;->ۧ(Ll/ۡ֨ۜ;)Ljava/lang/Throwable;

    move-result-object v0

    .line 300
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_11

    .line 303
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_10

    .line 306
    instance-of v1, v0, Ljava/lang/Error;

    if-nez v1, :cond_f

    .line 309
    monitor-exit v16

    goto :goto_9

    .line 306
    :cond_f
    check-cast v0, Ljava/lang/Error;

    .line 307
    throw v0

    .line 303
    :cond_10
    check-cast v0, Ljava/lang/RuntimeException;

    .line 304
    throw v0

    .line 300
    :cond_11
    check-cast v0, Ljava/io/IOException;

    .line 301
    throw v0

    :catchall_0
    move-exception v0

    .line 310
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :catch_1
    move-exception v0

    move-object v1, v0

    .line 282
    invoke-static {v4}, Ll/ۡ֨ۜ;->ᩳ(Ll/ۡ֨ۜ;)Ll/᩸۠֫;

    move-result-object v0

    .line 317
    :try_start_4
    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object v2, v0

    .line 319
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 283
    :goto_7
    instance-of v0, v1, Ljava/util/concurrent/RejectedExecutionException;

    if-eqz v0, :cond_12

    .line 284
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Visitor range probe capacity is exhausted"

    invoke-direct {v0, v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 286
    :cond_12
    throw v1

    .line 273
    :cond_13
    new-instance v1, Ljava/io/InterruptedIOException;

    const-string v0, "Visitor range probe was canceled"

    invoke-direct {v1, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 275
    invoke-static {v4}, Ll/ۡ֨ۜ;->ᩳ(Ll/ۡ֨ۜ;)Ll/᩸۠֫;

    move-result-object v0

    .line 317
    :try_start_5
    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 319
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 276
    :goto_8
    throw v1

    .line 268
    :cond_14
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "Visitor range probe was canceled"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    :goto_9
    if-eqz v14, :cond_16

    .line 254
    invoke-static/range {p3 .. p3}, Ll/ۢۗۜ;->֫(Ll/᩻۬ۜ;)Ll/ܶ۠֫;

    move-result-object v0

    move-object v12, v0

    .line 256
    :cond_16
    new-instance v0, Ll/ۢ֨ۜ;

    move-object v6, v0

    move-wide v7, v9

    move-wide/from16 v9, v17

    invoke-direct/range {v6 .. v13}, Ll/ۢ֨ۜ;-><init>(JJLandroid/net/Uri;Ll/ܶ۠֫;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ll/ۖ֨ۜ;JLl/ܶ۠֫;Ll/ܶ۠֫;Ll/᩻۬ۜ;Ll/֨۠ۜ;Ll/ܽۚۜ;)Ll/ܺ֨ۜ;
    .locals 19

    .line 76
    invoke-static {}, Ll/ۧۙۜ;->֫()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v7

    .line 89
    invoke-virtual/range {p0 .. p0}, Ll/ۖ֨ۜ;->ܽ()Ll/ۙ᩺֫;

    move-result-object v8

    .line 90
    invoke-static/range {p0 .. p2}, Ll/ܺ֨ۜ;->ۧ(Ll/ۖ֨ۜ;J)Ll/᩸᩺֫;

    move-result-object v9

    .line 91
    invoke-static {v8, v9}, Ll/ܺ֨ۜ;->֫(Ll/ۙ᩺֫;Ll/᩸᩺֫;)Ll/᩷֨ۜ;

    move-result-object v12

    const/16 v18, 0x0

    if-eqz v12, :cond_4

    if-nez v9, :cond_0

    goto :goto_1

    .line 96
    :cond_0
    :try_start_0
    iget-object v1, v9, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    if-nez v1, :cond_1

    move-object/from16 v13, v18

    goto :goto_0

    :cond_1
    move-object v0, v8

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object v6, v7

    .line 97
    invoke-static/range {v0 .. v6}, Ll/ܺ֨ۜ;->֫(Ll/ۙ᩺֫;Ll/᩸᩺֫;Ll/ܶ۠֫;Ll/᩻۬ۜ;Ll/֨۠ۜ;Ll/ܽۚۜ;Ljava/util/concurrent/ThreadPoolExecutor;)Ll/ۢ֨ۜ;

    move-result-object v0

    move-object v13, v0

    :goto_0
    move-object v0, v8

    move-object v1, v9

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object v6, v7

    .line 105
    invoke-static/range {v0 .. v6}, Ll/ܺ֨ۜ;->֫(Ll/ۙ᩺֫;Ll/᩸᩺֫;Ll/ܶ۠֫;Ll/᩻۬ۜ;Ll/֨۠ۜ;Ll/ܽۚۜ;Ljava/util/concurrent/ThreadPoolExecutor;)Ll/ۢ֨ۜ;

    move-result-object v14

    .line 113
    sget-object v0, Ll/᩷֨ۜ;->᩹:Ll/᩷֨ۜ;

    if-ne v12, v0, :cond_2

    if-eqz v13, :cond_4

    :cond_2
    if-nez v14, :cond_3

    goto :goto_1

    .line 117
    :cond_3
    iget-wide v0, v8, Ll/ۙ᩺֫;->۠:J

    .line 118
    invoke-virtual/range {p0 .. p0}, Ll/ۖ֨ۜ;->֫()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-wide v2, v9, Ll/᩹᩺֫;->ۨ:J

    add-long/2addr v0, v2

    const-wide/16 v2, 0x0

    sub-long v0, p1, v0

    .line 119
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v15

    move-object/from16 v0, p0

    .line 120
    invoke-static {v0, v9}, Ll/ܺ֨ۜ;->֫(Ll/ۖ֨ۜ;Ll/᩸᩺֫;)Ljava/lang/String;

    move-result-object v17

    .line 121
    new-instance v0, Ll/ܺ֨ۜ;

    move-object v10, v0

    move-object/from16 v11, p4

    invoke-direct/range {v10 .. v17}, Ll/ܺ֨ۜ;-><init>(Ll/ܶ۠֫;Ll/᩷֨ۜ;Ll/ۢ֨ۜ;Ll/ۢ֨ۜ;JLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_4
    :goto_1
    return-object v18
.end method

.method public static ֫(Ll/ۙ᩺֫;Ll/᩸᩺֫;)Ll/᩷֨ۜ;
    .locals 9

    if-eqz p1, :cond_a

    .line 140
    iget-object v0, p1, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    iget-boolean v1, p0, Ll/ۤ᩺֫;->ۧ:Z

    if-eqz v1, :cond_a

    iget-object v1, p0, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    .line 142
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    iget v1, p0, Ll/ۙ᩺֫;->ۖ:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    iget-boolean v1, p0, Ll/ۙ᩺֫;->᩻:Z

    if-eqz v1, :cond_a

    :cond_0
    iget-object p1, p1, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    .line 145
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_2

    :cond_1
    if-eqz v0, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 149
    :goto_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 150
    iget-object v3, p0, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸᩺֫;

    .line 151
    iget v5, v4, Ll/᩹᩺֫;->ۛ:I

    iget-object v6, v4, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    if-nez v5, :cond_a

    iget-object v5, v4, Ll/᩹᩺֫;->᩶:Ll/᩵ᩴ֫;

    if-nez v5, :cond_a

    iget-object v5, v4, Ll/᩹᩺֫;->۬:Ljava/lang/String;

    if-nez v5, :cond_a

    iget-object v4, v4, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    .line 154
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_6

    if-nez v6, :cond_5

    goto :goto_2

    .line 369
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-object v7, v6, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    invoke-static {v5, v7}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v7, v6, Ll/᩹᩺֫;->᩹:J

    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v6, Ll/᩹᩺֫;->᩸:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 161
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    if-eqz v6, :cond_3

    goto :goto_2

    :cond_7
    if-nez p1, :cond_8

    .line 167
    sget-object p0, Ll/᩷֨ۜ;->᩶:Ll/᩷֨ۜ;

    return-object p0

    .line 170
    :cond_8
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result p0

    if-ne p0, v2, :cond_a

    if-eqz v0, :cond_a

    iget-object p0, v0, Ll/᩹᩺֫;->᩶:Ll/᩵ᩴ֫;

    if-nez p0, :cond_a

    iget-object p0, v0, Ll/᩹᩺֫;->۬:Ljava/lang/String;

    if-eqz p0, :cond_9

    goto :goto_2

    .line 176
    :cond_9
    sget-object p0, Ll/᩷֨ۜ;->᩹:Ll/᩷֨ۜ;

    return-object p0

    :cond_a
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ll/ۖ֨ۜ;J)Ll/᩸᩺֫;
    .locals 8

    .line 183
    invoke-virtual {p0}, Ll/ۖ֨ۜ;->ܽ()Ll/ۙ᩺֫;

    move-result-object v0

    .line 184
    iget-wide v1, v0, Ll/ۙ᩺֫;->۠:J

    invoke-virtual {p0}, Ll/ۖ֨ۜ;->֫()J

    move-result-wide v3

    sub-long/2addr v1, v3

    .line 186
    iget-object p0, v0, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸᩺֫;

    .line 187
    iget-wide v4, v3, Ll/᩹᩺֫;->ۨ:J

    add-long/2addr v4, v1

    cmp-long v6, p1, v4

    if-gez v6, :cond_0

    goto :goto_1

    .line 192
    :cond_0
    iget-wide v6, v3, Ll/᩹᩺֫;->ۙ:J

    add-long/2addr v4, v6

    cmp-long v0, p1, v4

    if-gez v0, :cond_1

    return-object v3

    :cond_1
    move-object v0, v3

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ۖ֨ۜ;J)Ll/ܺ֨ۜ;
    .locals 10

    .line 443
    invoke-static {p1, p2, p3}, Ll/ܺ֨ۜ;->ۧ(Ll/ۖ֨ۜ;J)Ll/᩸᩺֫;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 444
    iget-object v1, p0, Ll/ܺ֨ۜ;->ۧ:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ܺ֨ۜ;->֫(Ll/ۖ֨ۜ;Ll/᩸᩺֫;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 448
    :cond_0
    invoke-virtual {p1}, Ll/ۖ֨ۜ;->ܽ()Ll/ۙ᩺֫;

    move-result-object v1

    iget-wide v1, v1, Ll/ۙ᩺֫;->۠:J

    invoke-virtual {p1}, Ll/ۖ֨ۜ;->֫()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iget-wide v3, v0, Ll/᩹᩺֫;->ۨ:J

    add-long/2addr v1, v3

    sub-long/2addr p2, v1

    const-wide/16 v0, 0x0

    .line 447
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    .line 450
    new-instance p1, Ll/ܺ֨ۜ;

    iget-object v6, p0, Ll/ܺ֨ۜ;->ܳ:Ll/ۢ֨ۜ;

    iget-object v9, p0, Ll/ܺ֨ۜ;->ۧ:Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ۜ;->ᩳ:Ll/ܶ۠֫;

    iget-object v4, p0, Ll/ܺ֨ۜ;->֫:Ll/᩷֨ۜ;

    iget-object v5, p0, Ll/ܺ֨ۜ;->ܽ:Ll/ۢ֨ۜ;

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Ll/ܺ֨ۜ;-><init>(Ll/ܶ۠֫;Ll/᩷֨ۜ;Ll/ۢ֨ۜ;Ll/ۢ֨ۜ;JLjava/lang/String;)V

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ll/᩷֨ۜ;
    .locals 1

    .line 425
    iget-object v0, p0, Ll/ܺ֨ۜ;->֫:Ll/᩷֨ۜ;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 436
    iget-object v0, p0, Ll/ܺ֨ۜ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()J
    .locals 2

    .line 430
    iget-wide v0, p0, Ll/ܺ֨ۜ;->ܿ:J

    return-wide v0
.end method

.method public final ܿ()Ll/۟ܰۜ;
    .locals 10

    .line 405
    iget-object v0, p0, Ll/ܺ֨ۜ;->ܳ:Ll/ۢ֨ۜ;

    invoke-static {v0}, Ll/ۢ֨ۜ;->ۧ(Ll/ۢ֨ۜ;)Ll/ܶ۠֫;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 406
    invoke-static {v0}, Ll/ۢ֨ۜ;->ۧ(Ll/ۢ֨ۜ;)Ll/ܶ۠֫;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/ܺ֨ۜ;->ᩳ:Ll/ܶ۠֫;

    .line 407
    :goto_0
    new-instance v2, Ll/ۙ۠֫;

    invoke-direct {v2}, Ll/ۙ۠֫;-><init>()V

    invoke-static {v0}, Ll/ۢ֨ۜ;->ܿ(Ll/ۢ֨ۜ;)Landroid/net/Uri;

    move-result-object v3

    .line 408
    invoke-virtual {v2, v3}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    invoke-static {v0}, Ll/ۢ֨ۜ;->ᩳ(Ll/ۢ֨ۜ;)J

    move-result-wide v3

    .line 409
    invoke-virtual {v2, v3, v4}, Ll/ۙ۠֫;->ۧ(J)V

    invoke-static {v0}, Ll/ۢ֨ۜ;->֫(Ll/ۢ֨ۜ;)Ljava/lang/String;

    move-result-object v3

    .line 410
    invoke-virtual {v2, v3}, Ll/ۙ۠֫;->֫(Ljava/lang/String;)V

    .line 411
    invoke-virtual {v2}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v6

    .line 412
    new-instance v2, Ll/ܿ᩸ۜ;

    .line 413
    invoke-interface {v1}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v5

    invoke-static {v0}, Ll/ۢ֨ۜ;->ܽ(Ll/ۢ֨ۜ;)J

    move-result-wide v7

    new-instance v9, Ll/᩶۫᩷;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Ll/ܿ᩸ۜ;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;JLl/᩶۫᩷;)V

    return-object v2
.end method

.method public final ᩳ()Ll/ۡۚۜ;
    .locals 21

    move-object/from16 v1, p0

    .line 376
    iget-object v0, v1, Ll/ܺ֨ۜ;->ܳ:Ll/ۢ֨ۜ;

    .line 377
    iget-object v2, v1, Ll/ܺ֨ۜ;->֫:Ll/᩷֨ۜ;

    sget-object v3, Ll/᩷֨ۜ;->᩹:Ll/᩷֨ۜ;

    if-ne v2, v3, :cond_2

    iget-object v2, v1, Ll/ܺ֨ۜ;->ܽ:Ll/ۢ֨ۜ;

    if-eqz v2, :cond_2

    .line 380
    new-instance v11, Ll/ۙ᩶ۜ;

    .line 381
    invoke-static {v2}, Ll/ۢ֨ۜ;->ۧ(Ll/ۢ֨ۜ;)Ll/ܶ۠֫;

    move-result-object v3

    iget-object v12, v1, Ll/ܺ֨ۜ;->ᩳ:Ll/ܶ۠֫;

    if-eqz v3, :cond_0

    .line 382
    invoke-static {v2}, Ll/ۢ֨ۜ;->ۧ(Ll/ۢ֨ۜ;)Ll/ܶ۠֫;

    move-result-object v3

    move-object v9, v3

    goto :goto_0

    :cond_0
    move-object v9, v12

    :goto_0
    invoke-static {v2}, Ll/ۢ֨ۜ;->ܿ(Ll/ۢ֨ۜ;)Landroid/net/Uri;

    move-result-object v8

    invoke-static {v2}, Ll/ۢ֨ۜ;->֫(Ll/ۢ֨ۜ;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v2}, Ll/ۢ֨ۜ;->ᩳ(Ll/ۢ֨ۜ;)J

    move-result-wide v4

    invoke-static {v2}, Ll/ۢ֨ۜ;->ܽ(Ll/ۢ֨ۜ;)J

    move-result-wide v6

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Ll/ۙ᩶ۜ;-><init>(JJLandroid/net/Uri;Ll/ܶ۠֫;Ljava/lang/String;)V

    .line 388
    :try_start_0
    new-instance v2, Ll/ۙ᩶ۜ;

    .line 389
    invoke-static {v0}, Ll/ۢ֨ۜ;->ۧ(Ll/ۢ֨ۜ;)Ll/ܶ۠֫;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v0}, Ll/ۢ֨ۜ;->ۧ(Ll/ۢ֨ۜ;)Ll/ܶ۠֫;

    move-result-object v12

    :cond_1
    move-object/from16 v19, v12

    invoke-static {v0}, Ll/ۢ֨ۜ;->ܿ(Ll/ۢ֨ۜ;)Landroid/net/Uri;

    move-result-object v18

    invoke-static {v0}, Ll/ۢ֨ۜ;->֫(Ll/ۢ֨ۜ;)Ljava/lang/String;

    move-result-object v20

    invoke-static {v0}, Ll/ۢ֨ۜ;->ᩳ(Ll/ۢ֨ۜ;)J

    move-result-wide v14

    invoke-static {v0}, Ll/ۢ֨ۜ;->ܽ(Ll/ۢ֨ۜ;)J

    move-result-wide v16

    move-object v13, v2

    invoke-direct/range {v13 .. v20}, Ll/ۙ᩶ۜ;-><init>(JJLandroid/net/Uri;Ll/ܶ۠֫;Ljava/lang/String;)V

    .line 394
    new-instance v0, Ll/ۡۚۜ;

    invoke-direct {v0, v11, v2}, Ll/ۡۚۜ;-><init>(Ll/ۙ᩶ۜ;Ll/ۙ᩶ۜ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    .line 396
    invoke-virtual {v11}, Ll/ۙ᩶ۜ;->close()V

    .line 397
    throw v0

    .line 378
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HLS preview does not have an initialization segment"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
