.class public final Ll/ۤۙᩳ;
.super Ljava/lang/Object;
.source "K6UK"


# instance fields
.field public ֡:Z

.field public ֨:Ljava/util/concurrent/ScheduledFuture;

.field public ֫:Ll/᩸ۗᩳ;

.field public ۖ:Z

.field public ۘ:Ll/ܶۙᩳ;

.field public ۚ:J

.field public ۜ:J

.field public final ۠:Ll/᩶۬ᩳ;

.field public ۡ:Ll/ۗ᩻᩵;

.field public ۢ:Ll/ۛۗᩳ;

.field public ۧ:Z

.field public volatile ܳ:Ll/ۡۗᩳ;

.field public ܶ:Ll/᩸۬ᩳ;

.field public ܺ:Ljava/lang/Thread;

.field public final ܽ:Ll/ۗ᩻᩵;

.field public ܿ:J

.field public ᩳ:J

.field public final ᩴ:Ll/۬ۙᩳ;

.field public ᩵:Z

.field public final ᩶:Ljava/util/ArrayList;

.field public ᩷:Z

.field public ᩸:Ljava/lang/Throwable;

.field public ᩹:Z

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/ۡۗᩳ;Ll/᩸۬ᩳ;Ll/᩶۬ᩳ;Ll/۬ۙᩳ;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۤۙᩳ;->᩶:Ljava/util/ArrayList;

    .line 21
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/ۤۙᩳ;->ܽ:Ll/ۗ᩻᩵;

    .line 41
    iput-object p1, p0, Ll/ۤۙᩳ;->ܳ:Ll/ۡۗᩳ;

    .line 42
    iput-object p2, p0, Ll/ۤۙᩳ;->ܶ:Ll/᩸۬ᩳ;

    .line 43
    iput-object p4, p0, Ll/ۤۙᩳ;->ᩴ:Ll/۬ۙᩳ;

    .line 44
    iput-object p3, p0, Ll/ۤۙᩳ;->۠:Ll/᩶۬ᩳ;

    .line 45
    :try_start_0
    invoke-virtual {p2}, Ll/᩸۬ᩳ;->᩺ۧ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    invoke-virtual {p1}, Ll/ۡۗᩳ;->֫()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۤۙᩳ;->ۜ:J

    return-void

    :catch_0
    move-exception p1

    .line 45
    invoke-virtual {p3}, Ll/᩶۬ᩳ;->close()V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۤۙᩳ;)Ll/᩸۬ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۙᩳ;->ܶ:Ll/᩸۬ᩳ;

    return-object p0
.end method

.method private ֫(Ljava/lang/Runnable;)V
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 278
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v0, p0

    .line 281
    monitor-enter v0

    .line 282
    :try_start_1
    iput-boolean v2, p0, Ll/ۤۙᩳ;->֡:Z

    .line 283
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܳ()V

    .line 284
    iget-boolean p1, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ll/ۤۙᩳ;->᩵:Z

    if-nez p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    .line 285
    iput-boolean v1, p0, Ll/ۤۙᩳ;->᩵:Z

    .line 286
    :cond_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    .line 287
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܿ()V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 286
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    move-object v0, p0

    .line 281
    monitor-enter v0

    .line 282
    :try_start_3
    iput-boolean v2, p0, Ll/ۤۙᩳ;->֡:Z

    .line 283
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܳ()V

    .line 284
    iget-boolean v3, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-eqz v3, :cond_3

    iget-boolean v3, p0, Ll/ۤۙᩳ;->᩵:Z

    if-nez v3, :cond_3

    const/4 v2, 0x1

    :cond_3
    if-eqz v2, :cond_4

    .line 285
    iput-boolean v1, p0, Ll/ۤۙᩳ;->᩵:Z

    .line 286
    :cond_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v2, :cond_5

    .line 287
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܿ()V

    .line 288
    :cond_5
    throw p1

    :catchall_2
    move-exception p1

    .line 286
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method private ֫(Ll/ۗۙᩳ;)V
    .locals 17

    move-object/from16 v1, p0

    const/4 v2, 0x0

    .line 294
    :try_start_0
    invoke-interface/range {p1 .. p1}, Ll/ۗۙᩳ;->run()J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v2

    goto :goto_0

    :catchall_0
    move-exception v0

    const-wide/16 v3, -0x1

    move-object v5, v0

    .line 296
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 300
    iget-object v0, v1, Ll/ۤۙᩳ;->ܳ:Ll/ۡۗᩳ;

    invoke-virtual {v0}, Ll/ۡۗᩳ;->֫()J

    move-result-wide v7

    move-object/from16 v16, p0

    .line 301
    monitor-enter v16

    const/4 v0, 0x0

    .line 302
    :try_start_1
    iput-boolean v0, v1, Ll/ۤۙᩳ;->֡:Z

    .line 303
    iput-object v2, v1, Ll/ۤۙᩳ;->ܺ:Ljava/lang/Thread;

    .line 304
    iget-object v9, v1, Ll/ۤۙᩳ;->ۡ:Ll/ۗ᩻᩵;

    .line 305
    iput-object v2, v1, Ll/ۤۙᩳ;->ۡ:Ll/ۗ᩻᩵;

    .line 306
    iget-object v10, v1, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    .line 307
    iget-object v11, v1, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    if-eqz v11, :cond_0

    iget-wide v12, v11, Ll/ܶۙᩳ;->᩶:J

    cmp-long v14, v12, v7

    if-gtz v14, :cond_0

    .line 309
    iput-object v2, v1, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    const-wide/16 v12, 0x0

    .line 310
    iput-wide v12, v1, Ll/ۤۙᩳ;->ᩳ:J

    .line 311
    iput-boolean v0, v1, Ll/ۤۙᩳ;->᩹:Z

    move-object v2, v11

    .line 313
    :cond_0
    iget-object v11, v1, Ll/ۤۙᩳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_1
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3

    .line 314
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۫ۙᩳ;

    if-nez v10, :cond_2

    .line 315
    iget-wide v13, v12, Ll/۫ۙᩳ;->ۧ:J

    cmp-long v15, v13, v7

    if-gtz v15, :cond_1

    .line 316
    :cond_2
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    invoke-interface {v11}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 320
    :cond_3
    invoke-direct/range {p0 .. p0}, Ll/ۤۙᩳ;->ܳ()V

    .line 321
    iget-boolean v11, v1, Ll/ۤۙᩳ;->ۧ:Z

    const/4 v12, 0x1

    if-eqz v11, :cond_4

    iget-boolean v11, v1, Ll/ۤۙᩳ;->᩵:Z

    if-nez v11, :cond_4

    const/4 v0, 0x1

    const/4 v11, 0x1

    goto :goto_2

    :cond_4
    const/4 v11, 0x0

    :goto_2
    if-eqz v11, :cond_5

    .line 322
    iput-boolean v12, v1, Ll/ۤۙᩳ;->᩵:Z

    .line 323
    :cond_5
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v2, :cond_a

    .line 325
    :try_start_2
    invoke-virtual {v2}, Ll/ܶۙᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v2, v0

    if-eqz v11, :cond_6

    .line 327
    invoke-direct/range {p0 .. p0}, Ll/ۤۙᩳ;->ܿ()V

    .line 328
    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۫ۙᩳ;

    if-nez v10, :cond_7

    .line 329
    iget-object v6, v6, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v6, v11}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_3

    .line 330
    :cond_7
    iget-object v6, v6, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-virtual {v6, v10}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_8
    if-nez v5, :cond_9

    .line 332
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_4

    .line 333
    :cond_9
    invoke-virtual {v9, v5}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    .line 334
    :goto_4
    throw v2

    :cond_a
    :goto_5
    if-eqz v11, :cond_b

    .line 327
    invoke-direct/range {p0 .. p0}, Ll/ۤۙᩳ;->ܿ()V

    .line 328
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ۙᩳ;

    if-nez v10, :cond_c

    .line 329
    iget-object v2, v2, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_6

    .line 330
    :cond_c
    iget-object v2, v2, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-virtual {v2, v10}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_d
    if-nez v5, :cond_e

    .line 332
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_7

    .line 333
    :cond_e
    invoke-virtual {v9, v5}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    .line 335
    :goto_7
    instance-of v0, v5, Ljava/lang/Error;

    if-nez v0, :cond_f

    return-void

    :cond_f
    check-cast v5, Ljava/lang/Error;

    throw v5

    :catchall_2
    move-exception v0

    .line 323
    :try_start_3
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0
.end method

.method public static ֫(Ll/ۤۙᩳ;J)V
    .locals 12

    move-object v0, p0

    .line 209
    monitor-enter v0

    .line 210
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-nez v1, :cond_15

    iget-boolean v1, p0, Ll/ۤۙᩳ;->֡:Z

    if-nez v1, :cond_15

    iget-object v1, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    if-nez v1, :cond_15

    iget-wide v1, p0, Ll/ۤۙᩳ;->ۚ:J

    cmp-long v3, p1, v1

    if-nez v3, :cond_15

    iget-object p1, p0, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    if-nez p1, :cond_0

    iget-object p2, p0, Ll/ۤۙᩳ;->ۢ:Ll/ۛۗᩳ;

    if-nez p2, :cond_0

    iget-object p2, p0, Ll/ۤۙᩳ;->֫:Ll/᩸ۗᩳ;

    if-nez p2, :cond_0

    goto/16 :goto_8

    :cond_0
    const/4 p2, 0x0

    .line 211
    iput-object p2, p0, Ll/ۤۙᩳ;->֨:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    .line 212
    iput-boolean v1, p0, Ll/ۤۙᩳ;->֡:Z

    .line 213
    iget-boolean v2, p0, Ll/ۤۙᩳ;->᩷:Z

    if-eqz v2, :cond_1

    if-eqz p1, :cond_1

    iget-boolean v2, p0, Ll/ۤۙᩳ;->ۖ:Z

    if-nez v2, :cond_1

    move-object v2, p2

    goto :goto_0

    :cond_1
    iget-object v2, p0, Ll/ۤۙᩳ;->ۢ:Ll/ۛۗᩳ;

    :goto_0
    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 216
    iput-object p2, p0, Ll/ۤۙᩳ;->ۢ:Ll/ۛۗᩳ;

    .line 217
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iput-object p1, p0, Ll/ۤۙᩳ;->ܺ:Ljava/lang/Thread;

    move-object p1, p2

    move-object v4, p1

    goto :goto_1

    .line 219
    :cond_2
    iget-object v4, p0, Ll/ۤۙᩳ;->֫:Ll/᩸ۗᩳ;

    if-eqz v4, :cond_4

    if-eqz p1, :cond_3

    iget-boolean v5, p0, Ll/ۤۙᩳ;->ۖ:Z

    if-nez v5, :cond_3

    iget-boolean v5, p0, Ll/ۤۙᩳ;->᩹:Z

    if-nez v5, :cond_4

    .line 221
    :cond_3
    iput-object p2, p0, Ll/ۤۙᩳ;->֫:Ll/᩸ۗᩳ;

    move-object p1, p2

    goto :goto_1

    .line 225
    :cond_4
    iput-object p2, p0, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    const-wide/16 v4, 0x0

    .line 226
    iput-wide v4, p0, Ll/ۤۙᩳ;->ᩳ:J

    .line 227
    iput-boolean v3, p0, Ll/ۤۙᩳ;->᩹:Z

    move-object v4, p2

    .line 229
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v2, :cond_5

    .line 230
    invoke-direct {p0, v2}, Ll/ۤۙᩳ;->֫(Ll/ۗۙᩳ;)V

    return-void

    :cond_5
    if-eqz v4, :cond_6

    .line 231
    invoke-direct {p0, v4}, Ll/ۤۙᩳ;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 234
    :cond_6
    :try_start_1
    iget-object v5, p0, Ll/ۤۙᩳ;->ܳ:Ll/ۡۗᩳ;

    iget-object v6, p1, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    iget-object v0, p1, Ll/ܶۙᩳ;->ۙ:Ll/ۖۗᩳ;

    iget-object v7, v0, Ll/ۖۗᩳ;->᩸:[B

    iget-object v8, p1, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    iget-object v9, p1, Ll/ܶۙᩳ;->᩹:Ll/ۚۙᩳ;

    iget-wide v10, p1, Ll/ܶۙᩳ;->᩶:J

    invoke-virtual/range {v5 .. v11}, Ll/ۡۗᩳ;->֫(Ll/۫᩹ᩳ;[BLl/ۖۙᩳ;Ll/ۚۙᩳ;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v2, p2

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 238
    :goto_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 240
    iget-object v0, p0, Ll/ۤۙᩳ;->ܳ:Ll/ۡۗᩳ;

    invoke-virtual {v0}, Ll/ۡۗᩳ;->֫()J

    move-result-wide v5

    move-object v0, p0

    .line 241
    monitor-enter v0

    .line 242
    :try_start_2
    iput-boolean v3, p0, Ll/ۤۙᩳ;->֡:Z

    if-eqz v2, :cond_7

    .line 244
    iget-boolean v7, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-nez v7, :cond_7

    .line 246
    iput-boolean v1, p0, Ll/ۤۙᩳ;->ۖ:Z

    .line 247
    iget-object v7, p0, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    if-nez v7, :cond_7

    .line 248
    iput-object p1, p0, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    .line 250
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    iput-wide v7, p0, Ll/ۤۙᩳ;->᩻:J

    iput-wide v7, p0, Ll/ۤۙᩳ;->ܿ:J

    goto :goto_3

    :cond_7
    move-object p2, p1

    .line 253
    :goto_3
    iget-object p1, p0, Ll/ۤۙᩳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 254
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۫ۙᩳ;

    if-nez v2, :cond_9

    .line 255
    iget-wide v8, v7, Ll/۫ۙᩳ;->ۧ:J

    cmp-long v10, v8, v5

    if-gtz v10, :cond_8

    .line 256
    :cond_9
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_4

    .line 260
    :cond_a
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܳ()V

    .line 261
    iget-boolean p1, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-eqz p1, :cond_b

    iget-boolean p1, p0, Ll/ۤۙᩳ;->᩵:Z

    if-nez p1, :cond_b

    const/4 v3, 0x1

    :cond_b
    if-eqz v3, :cond_c

    .line 262
    iput-boolean v1, p0, Ll/ۤۙᩳ;->᩵:Z

    .line 263
    :cond_c
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p2, :cond_10

    .line 266
    :try_start_3
    invoke-virtual {p2}, Ll/ܶۙᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p1

    if-eqz v3, :cond_d

    .line 268
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܿ()V

    .line 269
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۫ۙᩳ;

    if-nez v2, :cond_e

    .line 270
    iget-object p2, p2, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_5

    .line 271
    :cond_e
    iget-object p2, p2, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-virtual {p2, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    goto :goto_5

    .line 273
    :cond_f
    throw p1

    :cond_10
    :goto_6
    if-eqz v3, :cond_11

    .line 268
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܿ()V

    .line 269
    :cond_11
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ۙᩳ;

    if-nez v2, :cond_12

    .line 270
    iget-object p1, p1, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_7

    .line 271
    :cond_12
    iget-object p1, p1, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-virtual {p1, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    goto :goto_7

    .line 274
    :cond_13
    instance-of p0, v2, Ljava/lang/Error;

    if-nez p0, :cond_14

    return-void

    :cond_14
    check-cast v2, Ljava/lang/Error;

    throw v2

    :catchall_2
    move-exception p0

    .line 263
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p0

    .line 210
    :cond_15
    :goto_8
    :try_start_5
    monitor-exit v0

    return-void

    :catchall_3
    move-exception p0

    .line 229
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۤۙᩳ;Ll/ۡۗᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۤۙᩳ;->ܳ:Ll/ۡۗᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۤۙᩳ;Ll/᩸۬ᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۤۙᩳ;->ܶ:Ll/᩸۬ᩳ;

    return-void
.end method

.method public static ۧ(Ljava/lang/Throwable;)Ll/ۗ᩻᩵;
    .locals 1

    .line 380
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 381
    invoke-virtual {v0, p0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ۤۙᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ۤۙᩳ;->ۖ:Z

    return-void
.end method

.method private ܳ()V
    .locals 11

    .line 196
    iget-boolean v0, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/ۤۙᩳ;->֡:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۤۙᩳ;->ۢ:Ll/ۛۗᩳ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۤۙᩳ;->֫:Ll/᩸ۗᩳ;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۤۙᩳ;->ۖ:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    if-nez v0, :cond_0

    goto :goto_1

    .line 197
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 198
    iget-object v2, p0, Ll/ۤۙᩳ;->ۢ:Ll/ۛۗᩳ;

    const-wide/16 v3, 0x0

    if-nez v2, :cond_2

    iget-object v2, p0, Ll/ۤۙᩳ;->֫:Ll/᩸ۗᩳ;

    if-nez v2, :cond_2

    iget-boolean v2, p0, Ll/ۤۙᩳ;->᩹:Z

    if-nez v2, :cond_2

    iget-wide v5, p0, Ll/ۤۙᩳ;->ᩳ:J

    iget-object v2, p0, Ll/ۤۙᩳ;->ᩴ:Ll/۬ۙᩳ;

    iget-wide v7, v2, Ll/۬ۙᩳ;->ۧ:J

    cmp-long v9, v5, v7

    if-ltz v9, :cond_1

    goto :goto_0

    .line 199
    :cond_1
    iget-wide v5, v2, Ll/۬ۙᩳ;->֫:J

    iget-wide v7, p0, Ll/ۤۙᩳ;->᩻:J

    sub-long v7, v0, v7

    sub-long/2addr v5, v7

    iget-wide v7, v2, Ll/۬ۙᩳ;->ܽ:J

    iget-wide v9, p0, Ll/ۤۙᩳ;->ܿ:J

    sub-long/2addr v0, v9

    sub-long/2addr v7, v0

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 200
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ۤۙᩳ;->֨:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 201
    :cond_3
    iget-wide v0, p0, Ll/ۤۙᩳ;->ۚ:J

    const-wide/16 v5, 0x1

    add-long/2addr v0, v5

    iput-wide v0, p0, Ll/ۤۙᩳ;->ۚ:J

    .line 202
    new-instance v2, Ll/᩸ۙᩳ;

    invoke-direct {v2, p0, v0, v1}, Ll/᩸ۙᩳ;-><init>(Ll/ۤۙᩳ;J)V

    iget-object v0, p0, Ll/ۤۙᩳ;->۠:Ll/᩶۬ᩳ;

    invoke-virtual {v0, v2, v3, v4}, Ll/᩶۬ᩳ;->֫(Ll/᩸ۙᩳ;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Ll/ۤۙᩳ;->֨:Ljava/util/concurrent/ScheduledFuture;

    :cond_4
    :goto_1
    return-void
.end method

.method private ܿ()V
    .locals 3

    .line 372
    iget-object v0, p0, Ll/ۤۙᩳ;->۠:Ll/᩶۬ᩳ;

    const/4 v1, 0x0

    .line 373
    :try_start_0
    iget-object v2, p0, Ll/ۤۙᩳ;->ܶ:Ll/᩸۬ᩳ;

    invoke-virtual {v2}, Ll/᩸۬ᩳ;->᩻()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    invoke-virtual {v0}, Ll/᩶۬ᩳ;->close()V

    move-object v2, v1

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Ll/᩶۬ᩳ;->close()V

    .line 375
    :goto_0
    iget-object v0, p0, Ll/ۤۙᩳ;->ܽ:Ll/ۗ᩻᩵;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 376
    :cond_0
    invoke-virtual {v0, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/ۗ᩻᩵;
    .locals 4

    move-object v0, p0

    .line 75
    monitor-enter v0

    .line 76
    :try_start_0
    iget-object v1, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ll/ۤۙᩳ;->ۧ(Ljava/lang/Throwable;)Ll/ۗ᩻᩵;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_5

    .line 77
    iget-wide v1, p0, Ll/ۤۙᩳ;->ۜ:J

    cmp-long v3, p1, v1

    if-lez v3, :cond_1

    goto :goto_0

    .line 78
    :cond_1
    iget-object v1, p0, Ll/ۤۙᩳ;->ܳ:Ll/ۡۗᩳ;

    invoke-virtual {v1}, Ll/ۡۗᩳ;->֫()J

    move-result-wide v1

    cmp-long v3, p1, v1

    if-gtz v3, :cond_2

    .line 79
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 80
    :cond_2
    iget-boolean v1, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-eqz v1, :cond_3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Persistence coordinator is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۤۙᩳ;->ۧ(Ljava/lang/Throwable;)Ll/ۗ᩻᩵;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 81
    :cond_3
    iget-object v1, p0, Ll/ۤۙᩳ;->᩶:Ljava/util/ArrayList;

    new-instance v2, Ll/᩹ۙᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v2}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 82
    iget-object v1, p0, Ll/ۤۙᩳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Ll/ۤۙᩳ;->ᩴ:Ll/۬ۙᩳ;

    iget v2, v2, Ll/۬ۙᩳ;->ᩳ:I

    if-lt v1, v2, :cond_4

    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    const-string p2, "Persistence waiter limit reached"

    invoke-direct {p1, p2}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۤۙᩳ;->ۧ(Ljava/lang/Throwable;)Ll/ۗ᩻᩵;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 83
    :cond_4
    new-instance v1, Ll/ۗ᩻᩵;

    invoke-direct {v1}, Ll/ۗ᩻᩵;-><init>()V

    .line 84
    iget-object v2, p0, Ll/ۤۙᩳ;->᩶:Ljava/util/ArrayList;

    new-instance v3, Ll/۫ۙᩳ;

    invoke-direct {v3, p1, p2, v1}, Ll/۫ۙᩳ;-><init>(JLl/ۗ᩻᩵;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 85
    iput-boolean p1, p0, Ll/ۤۙᩳ;->᩹:Z

    const/4 p1, 0x0

    .line 86
    iput-boolean p1, p0, Ll/ۤۙᩳ;->ۖ:Z

    .line 87
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܳ()V

    .line 88
    monitor-exit v0

    return-object v1

    .line 77
    :cond_5
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown session revision"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۤۙᩳ;->ۧ(Ljava/lang/Throwable;)Ll/ۗ᩻᩵;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ۛۗᩳ;Z)Ll/ۗ᩻᩵;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 120
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-eqz v1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Persistence coordinator is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۤۙᩳ;->ۧ(Ljava/lang/Throwable;)Ll/ۗ᩻᩵;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 121
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    if-eqz v1, :cond_1

    invoke-static {v1}, Ll/ۤۙᩳ;->ۧ(Ljava/lang/Throwable;)Ll/ۗ᩻᩵;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    .line 122
    :cond_1
    :try_start_2
    iget-object v1, p0, Ll/ۤۙᩳ;->ۡ:Ll/ۗ᩻᩵;

    if-eqz v1, :cond_4

    if-eqz p2, :cond_2

    const-wide/16 p1, -0x1

    .line 123
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p1

    .line 125
    :cond_2
    :try_start_3
    iget-boolean p2, p0, Ll/ۤۙᩳ;->᩷:Z

    if-eqz p2, :cond_3

    new-instance p2, Ll/᩶ۙᩳ;

    invoke-direct {p2, p0, p1}, Ll/᩶ۙᩳ;-><init>(Ll/ۤۙᩳ;Ll/ۛۗᩳ;)V

    invoke-virtual {v1, p2}, Ll/ۗ᩻᩵;->ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object p1

    .line 127
    :cond_3
    monitor-exit v0

    return-object v1

    .line 129
    :cond_4
    :try_start_4
    iput-object p1, p0, Ll/ۤۙᩳ;->ۢ:Ll/ۛۗᩳ;

    .line 130
    iput-boolean p2, p0, Ll/ۤۙᩳ;->᩷:Z

    .line 131
    new-instance p1, Ll/ۗ᩻᩵;

    invoke-direct {p1}, Ll/ۗ᩻᩵;-><init>()V

    iput-object p1, p0, Ll/ۤۙᩳ;->ۡ:Ll/ۗ᩻᩵;

    .line 132
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܳ()V

    .line 133
    iget-object p1, p0, Ll/ۤۙᩳ;->ۡ:Ll/ۗ᩻᩵;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ۡۗᩳ;Ll/᩸۬ᩳ;)Ll/ۙۙᩳ;
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 138
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۤۙᩳ;->ܺ:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 139
    invoke-virtual {p1}, Ll/ۡۗᩳ;->֫()J

    move-result-wide v1

    iget-wide v3, p0, Ll/ۤۙᩳ;->ۜ:J

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    invoke-virtual {p1}, Ll/ۡۗᩳ;->֫()J

    move-result-wide v1

    iget-object v3, p0, Ll/ۤۙᩳ;->ܳ:Ll/ۡۗᩳ;

    invoke-virtual {v3}, Ll/ۡۗᩳ;->֫()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    .line 142
    new-instance v1, Ll/ۙۙᩳ;

    invoke-direct {v1, p0, p1, p2}, Ll/ۙۙᩳ;-><init>(Ll/ۤۙᩳ;Ll/ۡۗᩳ;Ll/᩸۬ᩳ;)V

    .line 143
    invoke-virtual {p2}, Ll/᩸۬ᩳ;->᩺ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    monitor-exit v0

    return-object v1

    .line 140
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recovery generation cannot replace current writer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 7

    move-object v0, p0

    .line 344
    monitor-enter v0

    .line 345
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 346
    iput-boolean v1, p0, Ll/ۤۙᩳ;->ۧ:Z

    .line 347
    iget-object v2, p0, Ll/ۤۙᩳ;->֨:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    const/4 v2, 0x0

    .line 348
    iput-object v2, p0, Ll/ۤۙᩳ;->֨:Ljava/util/concurrent/ScheduledFuture;

    .line 349
    iget-wide v3, p0, Ll/ۤۙᩳ;->ۚ:J

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/ۤۙᩳ;->ۚ:J

    .line 350
    iget-object v3, p0, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    .line 351
    iput-object v2, p0, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    .line 352
    new-instance v4, Ljava/util/ArrayList;

    iget-object v5, p0, Ll/ۤۙᩳ;->᩶:Ljava/util/ArrayList;

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 353
    iget-object v5, p0, Ll/ۤۙᩳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 354
    iget-object v5, p0, Ll/ۤۙᩳ;->ۢ:Ll/ۛۗᩳ;

    if-eqz v5, :cond_2

    iget-object v5, p0, Ll/ۤۙᩳ;->ۡ:Ll/ۗ᩻᩵;

    goto :goto_0

    :cond_2
    move-object v5, v2

    .line 355
    :goto_0
    iput-object v2, p0, Ll/ۤۙᩳ;->ۢ:Ll/ۛۗᩳ;

    .line 356
    iput-object v2, p0, Ll/ۤۙᩳ;->֫:Ll/᩸ۗᩳ;

    if-eqz v5, :cond_3

    .line 357
    iput-object v2, p0, Ll/ۤۙᩳ;->ۡ:Ll/ۗ᩻᩵;

    .line 358
    :cond_3
    iget-boolean v2, p0, Ll/ۤۙᩳ;->֡:Z

    if-nez v2, :cond_4

    .line 359
    iput-boolean v1, p0, Ll/ۤۙᩳ;->᩵:Z

    .line 360
    :cond_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v3, :cond_8

    .line 362
    :try_start_1
    invoke-virtual {v3}, Ll/ܶۙᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    if-nez v2, :cond_5

    .line 364
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܿ()V

    .line 365
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ۙᩳ;

    iget-object v2, v2, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    new-instance v3, Ljava/util/concurrent/CancellationException;

    const-string v4, "Persistence session abandoned"

    invoke-direct {v3, v4}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_6
    if-eqz v5, :cond_7

    .line 366
    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Persistence session abandoned"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    .line 367
    :cond_7
    throw v0

    :cond_8
    :goto_2
    if-nez v2, :cond_9

    .line 364
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܿ()V

    .line 365
    :cond_9
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ۙᩳ;

    iget-object v1, v1, Ll/۫ۙᩳ;->֫:Ll/ۗ᩻᩵;

    new-instance v2, Ljava/util/concurrent/CancellationException;

    const-string v3, "Persistence session abandoned"

    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_a
    if-eqz v5, :cond_b

    .line 366
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Persistence session abandoned"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    :cond_b
    return-void

    :catchall_1
    move-exception v1

    .line 360
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final declared-synchronized ֫(Ljava/lang/Throwable;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 149
    :try_start_0
    iput-object p1, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
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

.method public final ֫(Ll/ܶۙᩳ;J)V
    .locals 11

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    .line 54
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 55
    :try_start_1
    iget-boolean v3, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-nez v3, :cond_5

    .line 56
    iget-object v3, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    if-nez v3, :cond_4

    .line 57
    iget-wide v3, p1, Ll/ܶۙᩳ;->᩶:J

    iget-wide v5, p0, Ll/ۤۙᩳ;->ۜ:J

    cmp-long v7, v3, v5

    if-lez v7, :cond_3

    const-wide/16 v3, 0x0

    cmp-long v5, p2, v3

    if-ltz v5, :cond_3

    .line 58
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    .line 59
    iget-object v5, p0, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    if-nez v5, :cond_0

    iput-wide v3, p0, Ll/ۤۙᩳ;->ܿ:J

    .line 60
    :cond_0
    iput-wide v3, p0, Ll/ۤۙᩳ;->᩻:J

    .line 61
    iget-wide v3, p0, Ll/ۤۙᩳ;->ᩳ:J

    const-wide v6, 0x7fffffffffffffffL

    sub-long v8, v6, v3

    cmp-long v10, p2, v8

    if-lez v10, :cond_1

    goto :goto_0

    :cond_1
    add-long v6, v3, p2

    :goto_0
    iput-wide v6, p0, Ll/ۤۙᩳ;->ᩳ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    :try_start_2
    iput-object p1, p0, Ll/ۤۙᩳ;->ۘ:Ll/ܶۙᩳ;

    .line 64
    iget-wide p2, p1, Ll/ܶۙᩳ;->᩶:J

    iput-wide p2, p0, Ll/ۤۙᩳ;->ۜ:J

    const/4 v2, 0x1

    .line 66
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܳ()V

    .line 67
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v5, :cond_2

    .line 69
    invoke-virtual {v5}, Ll/ܶۙᩳ;->close()V

    :cond_2
    return-void

    :catchall_0
    move-exception p2

    move-object v1, v5

    goto :goto_1

    .line 57
    :cond_3
    :try_start_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Invalid persistence request"

    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 56
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Persistence requires reopening"

    iget-object v3, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    invoke-direct {p2, p3, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 55
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Persistence coordinator is closed"

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_1
    move-exception p2

    .line 67
    :goto_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p2

    if-eqz v1, :cond_6

    .line 69
    invoke-virtual {v1}, Ll/ܶۙᩳ;->close()V

    :cond_6
    if-nez v2, :cond_7

    .line 70
    invoke-virtual {p1}, Ll/ܶۙᩳ;->close()V

    .line 71
    :cond_7
    throw p2
.end method

.method public final declared-synchronized ֫(Ll/᩸ۗᩳ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 157
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    iput-object p1, p0, Ll/ۤۙᩳ;->֫:Ll/᩸ۗᩳ;

    .line 159
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    monitor-exit v0

    return-void

    .line 157
    :cond_1
    :goto_0
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

.method public final ۧ()J
    .locals 2

    .line 105
    iget-object v0, p0, Ll/ۤۙᩳ;->ܳ:Ll/ۡۗᩳ;

    invoke-virtual {v0}, Ll/ۡۗᩳ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final declared-synchronized ܽ()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 93
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۙᩳ;->ۧ:Z

    if-nez v1, :cond_1

    .line 94
    iget-object v1, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 95
    iput-boolean v1, p0, Ll/ۤۙᩳ;->᩹:Z

    const/4 v1, 0x0

    .line 96
    iput-boolean v1, p0, Ll/ۤۙᩳ;->ۖ:Z

    .line 97
    invoke-direct {p0}, Ll/ۤۙᩳ;->ܳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    monitor-exit v0

    return-void

    .line 94
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Persistence requires reopening"

    iget-object v3, p0, Ll/ۤۙᩳ;->᩸:Ljava/lang/Throwable;

    invoke-direct {v1, v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 93
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Persistence coordinator is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 98
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩳ()Ll/ۗ᩻᩵;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۤۙᩳ;->ܽ:Ll/ۗ᩻᩵;

    return-object v0
.end method
