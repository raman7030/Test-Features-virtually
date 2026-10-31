.class public final Ll/ۡ᩻᩻;
.super Ljava/lang/Object;
.source "J7HX"


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ۜ:Ll/ۙ֡ܿ;

.field public final ۢ:J

.field public volatile ۧ:J

.field public final ܳ:Ll/۠ۖܽ;

.field public final ܽ:I

.field public final ܿ:J

.field public final ᩳ:Ljava/lang/String;

.field public final ᩷:J

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;ILjava/lang/String;JJJLl/۠ۖܽ;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput p1, p0, Ll/ۡ᩻᩻;->ܽ:I

    .line 75
    iput-object p2, p0, Ll/ۡ᩻᩻;->ᩳ:Ljava/lang/String;

    .line 77
    iput-object p4, p0, Ll/ۡ᩻᩻;->᩻:Ljava/lang/String;

    .line 78
    iput-wide p5, p0, Ll/ۡ᩻᩻;->ܿ:J

    .line 79
    iput-wide p7, p0, Ll/ۡ᩻᩻;->᩷:J

    .line 80
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1, p7, p8}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Ll/ۡ᩻᩻;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    .line 81
    iput-wide p9, p0, Ll/ۡ᩻᩻;->ۧ:J

    .line 82
    iput-object p11, p0, Ll/ۡ᩻᩻;->ܳ:Ll/۠ۖܽ;

    .line 83
    new-instance p1, Ll/ۙ֡ܿ;

    invoke-direct {p1}, Ll/ۙ֡ܿ;-><init>()V

    invoke-virtual {p1}, Ll/ۙ֡ܿ;->ۧ()V

    iput-object p1, p0, Ll/ۡ᩻᩻;->ۜ:Ll/ۙ֡ܿ;

    .line 84
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۡ᩻᩻;->ۢ:J

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ll/ۨܳ᩻;)V
    .locals 1

    .line 321
    instance-of v0, p0, Ll/᩺ܳ᩻;

    if-eqz v0, :cond_0

    check-cast p0, Ll/᩺ܳ᩻;

    .line 322
    invoke-interface {p0, p1}, Ll/᩺ܳ᩻;->֫(Ll/ۨܳ᩻;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Ll/ۖ᩻᩻;ILl/᩹ۢ᩻;)Ll/ۡ᩻᩻;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v12, p0

    .line 3
    monitor-enter v12

    .line 97
    :try_start_0
    iget-object v0, v1, Ll/ۡ᩻᩻;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    .line 98
    iget-wide v4, v1, Ll/ۡ᩻᩻;->ۧ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr v4, v2

    const-wide/32 v2, 0x200000

    const/4 v0, 0x0

    cmp-long v6, v4, v2

    if-gez v6, :cond_0

    .line 105
    monitor-exit v12

    return-object v0

    .line 109
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v6, v1, Ll/ۡ᩻᩻;->ۢ:J

    sub-long/2addr v2, v6

    .line 110
    invoke-virtual/range {p3 .. p3}, Ll/᩹ۢ᩻;->ܽ()J

    move-result-wide v6

    cmp-long v8, v2, v6

    if-ltz v8, :cond_2

    .line 125
    iget-object v2, v1, Ll/ۡ᩻᩻;->ۜ:Ll/ۙ֡ܿ;

    invoke-virtual {v2}, Ll/ۙ֡ܿ;->֫()J

    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-gtz v8, :cond_1

    .line 130
    monitor-exit v12

    return-object v0

    .line 132
    :cond_1
    :try_start_2
    div-long v2, v4, v2

    .line 133
    invoke-virtual/range {p3 .. p3}, Ll/᩹ۢ᩻;->֫()J

    move-result-wide v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    cmp-long v8, v2, v6

    if-gez v8, :cond_3

    .line 137
    monitor-exit v12

    return-object v0

    :cond_2
    const-wide/32 v2, 0x3200000

    cmp-long v6, v4, v2

    if-gtz v6, :cond_3

    .line 118
    monitor-exit v12

    return-object v0

    :cond_3
    add-int/lit8 v0, p2, 0x1

    int-to-long v2, v0

    .line 143
    :try_start_3
    div-long/2addr v4, v2

    const-wide/32 v2, 0x100000

    cmp-long v0, v4, v2

    if-gez v0, :cond_4

    move-wide v4, v2

    .line 151
    :cond_4
    iget-wide v2, v1, Ll/ۡ᩻᩻;->ۧ:J

    sub-long/2addr v2, v4

    .line 152
    iget-wide v4, v1, Ll/ۡ᩻᩻;->ۧ:J

    .line 153
    iput-wide v2, v1, Ll/ۡ᩻᩻;->ۧ:J

    move-object/from16 v0, p1

    .line 119
    iget-object v0, v0, Ll/ۖ᩻᩻;->֡:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v16

    .line 155
    new-instance v0, Ll/ۡ᩻᩻;

    iget v6, v1, Ll/ۡ᩻᩻;->ܽ:I

    iget-object v7, v1, Ll/ۡ᩻᩻;->ᩳ:Ljava/lang/String;

    iget-object v8, v1, Ll/ۡ᩻᩻;->᩻:Ljava/lang/String;

    iget-wide v9, v1, Ll/ۡ᩻᩻;->ܿ:J

    iget-object v11, v1, Ll/ۡ᩻᩻;->ܳ:Ll/۠ۖܽ;

    move-object v13, v0

    move v14, v6

    move-object v15, v7

    move-object/from16 v17, v8

    move-wide/from16 v18, v9

    move-wide/from16 v20, v2

    move-wide/from16 v22, v4

    move-object/from16 v24, v11

    invoke-direct/range {v13 .. v24}, Ll/ۡ᩻᩻;-><init>(ILjava/lang/String;ILjava/lang/String;JJJLl/۠ۖܽ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 176
    monitor-exit v12

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public final ֫(Ll/ۗۢ᩻;Ll/ۖ᩻᩻;Ll/֫᩵ܿ;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v8, p2

    .line 205
    iget-object v2, v1, Ll/ۡ᩻᩻;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v16

    .line 206
    iget-wide v6, v1, Ll/ۡ᩻᩻;->ۧ:J

    sub-long v2, v6, v16

    const-wide/16 v4, 0x0

    .line 207
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v13

    .line 310
    instance-of v2, v0, Ll/ܽ᩻᩻;

    if-eqz v2, :cond_0

    move-object v9, v0

    check-cast v9, Ll/ܽ᩻᩻;

    .line 311
    new-instance v15, Ll/ۢ᩻᩻;

    invoke-direct {v15, v1}, Ll/ۢ᩻᩻;-><init>(Ll/ۡ᩻᩻;)V

    .line 312
    iget-object v10, v1, Ll/ۡ᩻᩻;->᩻:Ljava/lang/String;

    move-wide/from16 v11, v16

    invoke-interface/range {v9 .. v15}, Ll/ܽ᩻᩻;->֫(Ljava/lang/String;JJLl/ۢ᩻᩻;)Ljava/io/InputStream;

    move-result-object v0

    move-object v2, v0

    move-wide v9, v6

    goto :goto_0

    .line 314
    :cond_0
    iget-object v3, v1, Ll/ۡ᩻᩻;->᩻:Ljava/lang/String;

    move-object/from16 v2, p1

    move-wide/from16 v4, v16

    move-wide v9, v6

    move-wide v6, v13

    invoke-virtual/range {v2 .. v7}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;JJ)Ljava/io/InputStream;

    move-result-object v0

    move-object v2, v0

    :goto_0
    const/high16 v0, 0x10000

    :try_start_0
    new-array v3, v0, [B

    move-wide/from16 v4, v16

    .line 212
    :goto_1
    iget-wide v6, v1, Ll/ۡ᩻᩻;->ۧ:J

    cmp-long v11, v4, v6

    if-gez v11, :cond_8

    invoke-virtual/range {p3 .. p3}, Ll/֫᩵ܿ;->᩻()Z

    move-result v6

    if-nez v6, :cond_8

    .line 213
    iget-wide v6, v1, Ll/ۡ᩻᩻;->ۧ:J

    cmp-long v11, v4, v6

    if-ltz v11, :cond_2

    cmp-long v0, v6, v9

    if-gez v0, :cond_1

    .line 331
    sget-object v0, Ll/ۨܳ᩻;->᩹:Ll/ۨܳ᩻;

    goto :goto_2

    .line 332
    :cond_1
    sget-object v0, Ll/ۨܳ᩻;->ۙ:Ll/ۨܳ᩻;

    .line 215
    :goto_2
    invoke-static {v2, v0}, Ll/ۡ᩻᩻;->֫(Ljava/io/InputStream;Ll/ۨܳ᩻;)V

    goto/16 :goto_4

    :cond_2
    int-to-long v11, v0

    sub-long/2addr v6, v4

    .line 218
    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v0, v6

    const/4 v6, 0x0

    .line 220
    invoke-virtual {v2, v3, v6, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    const/4 v7, -0x1

    if-ne v0, v7, :cond_4

    .line 227
    iget-wide v6, v1, Ll/ۡ᩻᩻;->ۧ:J

    cmp-long v0, v4, v6

    if-ltz v0, :cond_8

    .line 228
    iget-wide v6, v1, Ll/ۡ᩻᩻;->ۧ:J

    cmp-long v0, v6, v9

    if-gez v0, :cond_3

    .line 331
    sget-object v0, Ll/ۨܳ᩻;->᩹:Ll/ۨܳ᩻;

    goto :goto_3

    .line 332
    :cond_3
    sget-object v0, Ll/ۨܳ᩻;->ۙ:Ll/ۨܳ᩻;

    .line 228
    :goto_3
    invoke-static {v2, v0}, Ll/ۡ᩻᩻;->֫(Ljava/io/InputStream;Ll/ۨܳ᩻;)V

    goto :goto_4

    .line 238
    :cond_4
    iget-wide v11, v1, Ll/ۡ᩻᩻;->ۧ:J

    int-to-long v13, v0

    sub-long/2addr v11, v4

    const-wide/16 v6, 0x0

    .line 239
    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v7, v6

    if-gtz v7, :cond_5

    .line 241
    sget-object v0, Ll/ۨܳ᩻;->᩹:Ll/ۨܳ᩻;

    invoke-static {v2, v0}, Ll/ۡ᩻᩻;->֫(Ljava/io/InputStream;Ll/ۨܳ᩻;)V

    goto :goto_4

    .line 253
    :cond_5
    iget-object v6, v1, Ll/ۡ᩻᩻;->ܳ:Ll/۠ۖܽ;

    move-object/from16 v16, v6

    monitor-enter v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 257
    :try_start_1
    iget-object v6, v1, Ll/ۡ᩻᩻;->ܳ:Ll/۠ۖܽ;

    invoke-interface {v6}, Ll/۠ۖܽ;->isClosed()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 258
    sget-object v0, Ll/ۨܳ᩻;->᩹:Ll/ۨܳ᩻;

    invoke-static {v2, v0}, Ll/ۡ᩻᩻;->֫(Ljava/io/InputStream;Ll/ۨܳ᩻;)V

    .line 264
    monitor-exit v16

    goto :goto_7

    .line 267
    :cond_6
    iget-object v6, v1, Ll/ۡ᩻᩻;->ܳ:Ll/۠ۖܽ;

    invoke-interface {v6, v4, v5}, Ll/۠ۖܽ;->seek(J)V

    .line 268
    iget-object v6, v1, Ll/ۡ᩻᩻;->ܳ:Ll/۠ۖܽ;

    const/4 v11, 0x0

    invoke-interface {v6, v3, v11, v7}, Ll/۠ۖܽ;->write([BII)V

    .line 273
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    int-to-long v13, v7

    add-long/2addr v4, v13

    .line 276
    :try_start_2
    iget-object v6, v1, Ll/ۡ᩻᩻;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v6, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 277
    iget-object v6, v1, Ll/ۡ᩻᩻;->ۜ:Ll/ۙ֡ܿ;

    invoke-virtual {v6, v13, v14}, Ll/ۙ֡ܿ;->֫(J)V

    .line 279
    invoke-virtual/range {p2 .. p3}, Ll/ۖ᩻᩻;->֫(Ll/֫᩵ܿ;)V

    .line 282
    iget-object v6, v8, Ll/ۖ᩻᩻;->ܳ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v6, v13, v14}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v15

    .line 283
    iget-wide v11, v8, Ll/ۖ᩻᩻;->ۜ:J

    move-wide/from16 v17, v11

    move-object/from16 v12, p3

    invoke-virtual/range {v12 .. v18}, Ll/֫᩵ܿ;->֫(JJJ)V

    if-ge v7, v0, :cond_7

    .line 285
    sget-object v0, Ll/ۨܳ᩻;->᩹:Ll/ۨܳ᩻;

    invoke-static {v2, v0}, Ll/ۡ᩻᩻;->֫(Ljava/io/InputStream;Ll/ۨܳ᩻;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :cond_7
    const/high16 v0, 0x10000

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    .line 273
    :try_start_3
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0

    .line 296
    :cond_8
    :goto_4
    iget-wide v6, v1, Ll/ۡ᩻᩻;->ۧ:J

    cmp-long v0, v4, v6

    if-ltz v0, :cond_a

    .line 297
    iget-wide v3, v1, Ll/ۡ᩻᩻;->ۧ:J

    cmp-long v0, v3, v9

    if-gez v0, :cond_9

    .line 331
    sget-object v0, Ll/ۨܳ᩻;->᩹:Ll/ۨܳ᩻;

    goto :goto_5

    .line 332
    :cond_9
    sget-object v0, Ll/ۨܳ᩻;->ۙ:Ll/ۨܳ᩻;

    .line 297
    :goto_5
    invoke-static {v2, v0}, Ll/ۡ᩻᩻;->֫(Ljava/io/InputStream;Ll/ۨܳ᩻;)V

    goto :goto_6

    .line 298
    :cond_a
    invoke-virtual/range {p3 .. p3}, Ll/֫᩵ܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 299
    sget-object v0, Ll/ۨܳ᩻;->᩹:Ll/ۨܳ᩻;

    invoke-static {v2, v0}, Ll/ۡ᩻᩻;->֫(Ljava/io/InputStream;Ll/ۨܳ᩻;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_b
    :goto_6
    if-eqz v2, :cond_c

    .line 301
    :goto_7
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 302
    :cond_c
    iget-object v0, v1, Ll/ۡ᩻᩻;->ۜ:Ll/ۙ֡ܿ;

    invoke-virtual {v0}, Ll/ۙ֡ܿ;->ܽ()V

    return-void

    :catchall_1
    move-exception v0

    move-object v3, v0

    if-eqz v2, :cond_d

    .line 208
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_7
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_d
    :goto_8
    throw v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v0

    .line 302
    iget-object v2, v1, Ll/ۡ᩻᩻;->ۜ:Ll/ۙ֡ܿ;

    invoke-virtual {v2}, Ll/ۙ֡ܿ;->ܽ()V

    .line 303
    throw v0
.end method
