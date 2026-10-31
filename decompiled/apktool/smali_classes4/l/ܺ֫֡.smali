.class public final Ll/ܺ֫֡;
.super Ljava/lang/Object;
.source "L4DX"


# instance fields
.field public final ֫:Ll/ۙ᩺᩵;

.field public ۖ:Ll/᩷֫֡;

.field public final ۘ:Ll/ۢ֫֡;

.field public final ۜ:Ll/᩶ܰ᩵;

.field public ۡ:Z

.field public ۢ:Z

.field public final ۧ:Ll/ܽܰ᩵;

.field public ܳ:Ll/᩻֫֡;

.field public ܺ:Ll/ۚ۟᩵;

.field public final ܽ:Ljava/lang/Object;

.field public ܿ:Ll/᩵֫֡;

.field public ᩳ:Z

.field public ᩷:I

.field public final ᩻:Ll/ۡܰ᩵;


# direct methods
.method public constructor <init>(Ll/ۡܰ᩵;Ll/ۙ᩺᩵;Ll/ܽܰ᩵;Ll/᩶ܰ᩵;Ljava/lang/Object;)V
    .locals 2

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput-object p1, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    .line 98
    iput-object p2, p0, Ll/ܺ֫֡;->֫:Ll/ۙ᩺᩵;

    .line 99
    iput-object p3, p0, Ll/ܺ֫֡;->ۧ:Ll/ܽܰ᩵;

    .line 100
    iput-object p4, p0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    .line 101
    new-instance v0, Ll/ۢ֫֡;

    .line 336
    sget-object v1, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    invoke-virtual {v1, p1}, Ll/۠۟᩵;->֫(Ll/ۡܰ᩵;)Ll/ۡ᩵֡;

    move-result-object p1

    .line 101
    invoke-direct {v0, p2, p1, p3, p4}, Ll/ۢ֫֡;-><init>(Ll/ۙ᩺᩵;Ll/ۡ᩵֡;Ll/ܽܰ᩵;Ll/᩶ܰ᩵;)V

    iput-object v0, p0, Ll/ܺ֫֡;->ۘ:Ll/ۢ֫֡;

    .line 102
    iput-object p5, p0, Ll/ܺ֫֡;->ܽ:Ljava/lang/Object;

    return-void
.end method

.method private ֫(ZZZ)Ljava/net/Socket;
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 389
    iput-object v0, p0, Ll/ܺ֫֡;->ܿ:Ll/᩵֫֡;

    :cond_0
    const/4 p3, 0x1

    if-eqz p2, :cond_1

    .line 392
    iput-boolean p3, p0, Ll/ܺ֫֡;->ۢ:Z

    .line 395
    :cond_1
    iget-object p2, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    if-eqz p2, :cond_7

    if-eqz p1, :cond_2

    .line 397
    iput-boolean p3, p2, Ll/᩻֫֡;->ۜ:Z

    .line 399
    :cond_2
    iget-object p1, p0, Ll/ܺ֫֡;->ܿ:Ll/᩵֫֡;

    if-nez p1, :cond_7

    iget-boolean p1, p0, Ll/ܺ֫֡;->ۢ:Z

    if-nez p1, :cond_3

    iget-boolean p1, p2, Ll/᩻֫֡;->ۜ:Z

    if-eqz p1, :cond_7

    .line 486
    :cond_3
    iget-object p1, p2, Ll/᩻֫֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_6

    .line 487
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/Reference;

    .line 488
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p0, :cond_5

    .line 489
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 401
    iget-object p1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    iget-object p1, p1, Ll/᩻֫֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 402
    iget-object p1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p2

    iput-wide p2, p1, Ll/᩻֫֡;->᩻:J

    .line 403
    sget-object p1, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object p2, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    iget-object p3, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    invoke-virtual {p1, p2, p3}, Ll/۠۟᩵;->֫(Ll/ۡܰ᩵;Ll/᩻֫֡;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 404
    iget-object p1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    invoke-virtual {p1}, Ll/᩻֫֡;->ܿ()Ljava/net/Socket;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v0

    .line 407
    :goto_1
    iput-object v0, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    return-object p1

    :cond_5
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 493
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_7
    return-object v0
.end method

.method private ֫(IIIIZ)Ll/᩻֫֡;
    .locals 17

    move-object/from16 v1, p0

    .line 167
    iget-object v0, v1, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    move-object/from16 v16, v0

    monitor-enter v16

    .line 168
    :try_start_0
    iget-boolean v0, v1, Ll/ܺ֫֡;->ۢ:Z

    if-nez v0, :cond_13

    .line 169
    iget-object v0, v1, Ll/ܺ֫֡;->ܿ:Ll/᩵֫֡;

    if-nez v0, :cond_12

    .line 170
    iget-boolean v0, v1, Ll/ܺ֫֡;->ᩳ:Z

    if-nez v0, :cond_11

    .line 174
    iget-object v0, v1, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    .line 291
    iget-boolean v5, v0, Ll/᩻֫֡;->ۜ:Z

    if-eqz v5, :cond_0

    .line 292
    invoke-direct {v1, v3, v3, v2}, Ll/ܺ֫֡;->֫(ZZZ)Ljava/net/Socket;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    .line 176
    :goto_0
    iget-object v6, v1, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    if-eqz v6, :cond_1

    move-object v0, v4

    goto :goto_1

    :cond_1
    move-object v6, v4

    .line 181
    :goto_1
    iget-boolean v7, v1, Ll/ܺ֫֡;->ۡ:Z

    if-nez v7, :cond_2

    move-object v0, v4

    :cond_2
    if-nez v6, :cond_4

    .line 188
    sget-object v7, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object v8, v1, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    iget-object v9, v1, Ll/ܺ֫֡;->֫:Ll/ۙ᩺᩵;

    invoke-virtual {v7, v8, v9, v1, v4}, Ll/۠۟᩵;->֫(Ll/ۡܰ᩵;Ll/ۙ᩺᩵;Ll/ܺ֫֡;Ll/ۚ۟᩵;)Ll/᩻֫֡;

    .line 189
    iget-object v7, v1, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    if-eqz v7, :cond_3

    const/4 v6, 0x1

    move-object v8, v4

    goto :goto_3

    .line 193
    :cond_3
    iget-object v7, v1, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    goto :goto_2

    :cond_4
    move-object v7, v4

    :goto_2
    const/4 v8, 0x0

    move-object v8, v7

    move-object v7, v6

    const/4 v6, 0x0

    .line 196
    :goto_3
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 197
    invoke-static {v5}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    if-eqz v0, :cond_5

    .line 200
    iget-object v0, v1, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    if-eqz v6, :cond_6

    .line 203
    iget-object v0, v1, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_6
    if-eqz v7, :cond_7

    .line 207
    iget-object v0, v1, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    invoke-virtual {v0}, Ll/᩻֫֡;->ᩳ()Ll/ۚ۟᩵;

    move-result-object v0

    iput-object v0, v1, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    return-object v7

    :cond_7
    if-nez v8, :cond_9

    .line 213
    iget-object v0, v1, Ll/ܺ֫֡;->ۖ:Ll/᩷֫֡;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ll/᩷֫֡;->ۧ()Z

    move-result v0

    if-nez v0, :cond_9

    .line 215
    :cond_8
    iget-object v0, v1, Ll/ܺ֫֡;->ۘ:Ll/ۢ֫֡;

    invoke-virtual {v0}, Ll/ۢ֫֡;->ۧ()Ll/᩷֫֡;

    move-result-object v0

    iput-object v0, v1, Ll/ܺ֫֡;->ۖ:Ll/᩷֫֡;

    const/4 v0, 0x1

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    .line 218
    :goto_4
    iget-object v5, v1, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    move-object/from16 v16, v5

    monitor-enter v16

    .line 219
    :try_start_1
    iget-boolean v5, v1, Ll/ܺ֫֡;->ᩳ:Z

    if-nez v5, :cond_10

    if-eqz v0, :cond_b

    .line 224
    iget-object v0, v1, Ll/ܺ֫֡;->ۖ:Ll/᩷֫֡;

    invoke-virtual {v0}, Ll/᩷֫֡;->֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 225
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v5, :cond_b

    .line 226
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۚ۟᩵;

    .line 227
    sget-object v11, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object v12, v1, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    iget-object v13, v1, Ll/ܺ֫֡;->֫:Ll/ۙ᩺᩵;

    invoke-virtual {v11, v12, v13, v1, v10}, Ll/۠۟᩵;->֫(Ll/ۡܰ᩵;Ll/ۙ᩺᩵;Ll/ܺ֫֡;Ll/ۚ۟᩵;)Ll/᩻֫֡;

    .line 228
    iget-object v11, v1, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    if-eqz v11, :cond_a

    .line 231
    iput-object v10, v1, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    const/4 v6, 0x1

    move-object v7, v11

    goto :goto_6

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_b
    :goto_6
    if-nez v6, :cond_d

    if-nez v8, :cond_c

    .line 239
    iget-object v0, v1, Ll/ܺ֫֡;->ۖ:Ll/᩷֫֡;

    invoke-virtual {v0}, Ll/᩷֫֡;->ܽ()Ll/ۚ۟᩵;

    move-result-object v8

    .line 244
    :cond_c
    iput-object v8, v1, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    .line 245
    iput v3, v1, Ll/ܺ֫֡;->᩷:I

    .line 246
    new-instance v7, Ll/᩻֫֡;

    iget-object v0, v1, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    invoke-direct {v7, v0, v8}, Ll/᩻֫֡;-><init>(Ll/ۡܰ᩵;Ll/ۚ۟᩵;)V

    .line 247
    invoke-virtual {v1, v7, v3}, Ll/ܺ֫֡;->֫(Ll/᩻֫֡;Z)V

    .line 249
    :cond_d
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v6, :cond_e

    .line 253
    iget-object v0, v1, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v7

    .line 258
    :cond_e
    iget-object v15, v1, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    move-object v9, v7

    move/from16 v10, p1

    move/from16 v11, p2

    move/from16 v12, p3

    move/from16 v13, p4

    move/from16 v14, p5

    invoke-virtual/range {v9 .. v15}, Ll/᩻֫֡;->֫(IIIIZLl/᩶ܰ᩵;)V

    .line 336
    sget-object v0, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object v3, v1, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    invoke-virtual {v0, v3}, Ll/۠۟᩵;->֫(Ll/ۡܰ᩵;)Ll/ۡ᩵֡;

    move-result-object v0

    .line 260
    invoke-virtual {v7}, Ll/᩻֫֡;->ᩳ()Ll/ۚ۟᩵;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۡ᩵֡;->֫(Ll/ۚ۟᩵;)V

    .line 263
    iget-object v0, v1, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    move-object/from16 v16, v0

    monitor-enter v16

    .line 264
    :try_start_2
    iput-boolean v2, v1, Ll/ܺ֫֡;->ۡ:Z

    .line 267
    sget-object v0, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object v2, v1, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    invoke-virtual {v0, v2, v7}, Ll/۠۟᩵;->ۧ(Ll/ۡܰ᩵;Ll/᩻֫֡;)V

    .line 271
    invoke-virtual {v7}, Ll/᩻֫֡;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 272
    sget-object v0, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object v2, v1, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    iget-object v3, v1, Ll/ܺ֫֡;->֫:Ll/ۙ᩺᩵;

    invoke-virtual {v0, v2, v3, v1}, Ll/۠۟᩵;->֫(Ll/ۡܰ᩵;Ll/ۙ᩺᩵;Ll/ܺ֫֡;)Ljava/net/Socket;

    move-result-object v4

    .line 273
    iget-object v7, v1, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    .line 275
    :cond_f
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 276
    invoke-static {v4}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    .line 278
    iget-object v0, v1, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v7

    :catchall_0
    move-exception v0

    .line 275
    :try_start_3
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 219
    :cond_10
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    .line 249
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 170
    :cond_11
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 169
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "codec != null"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 168
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "released"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    .line 196
    monitor-exit v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0
.end method

.method private ֫(IIIIZZ)Ll/᩻֫֡;
    .locals 3

    .line 135
    :goto_0
    invoke-direct/range {p0 .. p5}, Ll/ܺ֫֡;->֫(IIIIZ)Ll/᩻֫֡;

    move-result-object v1

    .line 139
    iget-object v0, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    monitor-enter v0

    .line 140
    :try_start_0
    iget v2, v1, Ll/᩻֫֡;->ᩴ:I

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ll/᩻֫֡;->ܽ()Z

    move-result v2

    if-nez v2, :cond_0

    .line 141
    monitor-exit v0

    return-object v1

    .line 143
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    invoke-virtual {v1, p6}, Ll/᩻֫֡;->֫(Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 148
    invoke-virtual {p0}, Ll/ܺ֫֡;->ܿ()V

    goto :goto_0

    :cond_1
    return-object v1

    :catchall_0
    move-exception p1

    .line 143
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 526
    invoke-virtual {p0}, Ll/ܺ֫֡;->ܽ()Ll/᩻֫֡;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 527
    invoke-virtual {v0}, Ll/᩻֫֡;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ܺ֫֡;->֫:Ll/ۙ᩺᩵;

    invoke-virtual {v0}, Ll/ۙ᩺᩵;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩻֫֡;)Ljava/net/Socket;
    .locals 3

    .line 506
    iget-object v0, p0, Ll/ܺ֫֡;->ܿ:Ll/᩵֫֡;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    iget-object v0, v0, Ll/᩻֫֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 509
    iget-object v0, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    iget-object v0, v0, Ll/᩻֫֡;->ܽ:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/Reference;

    .line 510
    invoke-direct {p0, v1, v2, v2}, Ll/ܺ֫֡;->֫(ZZZ)Ljava/net/Socket;

    move-result-object v1

    .line 513
    iput-object p1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    .line 514
    iget-object p1, p1, Ll/᩻֫֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1

    .line 506
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ܿ۟᩵;Ll/۠֫֡;Z)Ll/᩵֫֡;
    .locals 7

    .line 107
    invoke-virtual {p2}, Ll/۠֫֡;->ۧ()I

    move-result v1

    .line 108
    invoke-virtual {p2}, Ll/۠֫֡;->ܳ()I

    move-result v2

    .line 109
    invoke-virtual {p2}, Ll/۠֫֡;->᩷()I

    move-result v3

    .line 111
    invoke-virtual {p1}, Ll/ܿ۟᩵;->֨()Z

    move-result v5

    const/4 v4, 0x0

    move-object v0, p0

    move v6, p3

    .line 114
    :try_start_0
    invoke-direct/range {v0 .. v6}, Ll/ܺ֫֡;->֫(IIIIZZ)Ll/᩻֫֡;

    move-result-object p3

    .line 116
    invoke-virtual {p3, p1, p2, p0}, Ll/᩻֫֡;->֫(Ll/ܿ۟᩵;Ll/۠֫֡;Ll/ܺ֫֡;)Ll/᩵֫֡;

    move-result-object p1

    .line 118
    iget-object p2, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    move-object v0, p2

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    :try_start_1
    iput-object p1, p0, Ll/ܺ֫֡;->ܿ:Ll/᩵֫֡;

    .line 120
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 121
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 123
    new-instance p2, Ll/ۜ֫֡;

    invoke-direct {p2, p1}, Ll/ۜ֫֡;-><init>(Ljava/io/IOException;)V

    throw p2
.end method

.method public final ֫()V
    .locals 3

    .line 416
    iget-object v0, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    monitor-enter v0

    const/4 v1, 0x1

    .line 417
    :try_start_0
    iput-boolean v1, p0, Ll/ܺ֫֡;->ᩳ:Z

    .line 418
    iget-object v1, p0, Ll/ܺ֫֡;->ܿ:Ll/᩵֫֡;

    .line 419
    iget-object v2, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    .line 420
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 422
    invoke-interface {v1}, Ll/᩵֫֡;->cancel()V

    return-void

    :cond_0
    if-eqz v2, :cond_1

    .line 424
    invoke-virtual {v2}, Ll/᩻֫֡;->֫()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 420
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/io/IOException;)V
    .locals 6

    .line 433
    iget-object v0, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    monitor-enter v0

    .line 434
    :try_start_0
    instance-of v1, p1, Ll/ۧܽ֡;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 435
    check-cast p1, Ll/ۧܽ֡;

    iget-object p1, p1, Ll/ۧܽ֡;->᩸:Ll/ܰ֫֡;

    .line 436
    sget-object v1, Ll/ܰ֫֡;->۟:Ll/ܰ֫֡;

    if-ne p1, v1, :cond_0

    .line 438
    iget p1, p0, Ll/ܺ֫֡;->᩷:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ܺ֫֡;->᩷:I

    if-le p1, v3, :cond_5

    .line 441
    iput-object v2, p0, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    goto :goto_0

    .line 443
    :cond_0
    sget-object v1, Ll/ܰ֫֡;->᩶:Ll/ܰ֫֡;

    if-eq p1, v1, :cond_5

    .line 446
    iput-object v2, p0, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    goto :goto_0

    .line 448
    :cond_1
    iget-object v1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    if-eqz v1, :cond_5

    .line 449
    invoke-virtual {v1}, Ll/᩻֫֡;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Ll/᩺֫֡;

    if-eqz v1, :cond_5

    .line 453
    :cond_2
    iget-object v1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    iget v1, v1, Ll/᩻֫֡;->ᩴ:I

    if-nez v1, :cond_4

    .line 454
    iget-object v1, p0, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    if-eqz v1, :cond_3

    if-eqz p1, :cond_3

    .line 455
    iget-object v5, p0, Ll/ܺ֫֡;->ۘ:Ll/ۢ֫֡;

    invoke-virtual {v5, v1, p1}, Ll/ۢ֫֡;->֫(Ll/ۚ۟᩵;Ljava/io/IOException;)V

    .line 457
    :cond_3
    iput-object v2, p0, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    :cond_4
    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    .line 460
    :goto_1
    iget-object v1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    .line 461
    invoke-direct {p0, p1, v4, v3}, Ll/ܺ֫֡;->֫(ZZZ)Ljava/net/Socket;

    move-result-object p1

    .line 462
    iget-object v3, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    if-nez v3, :cond_7

    iget-boolean v3, p0, Ll/ܺ֫֡;->ۡ:Z

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    move-object v2, v1

    .line 463
    :cond_7
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 465
    invoke-static {p1}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    if-eqz v2, :cond_8

    .line 467
    iget-object p1, p0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 463
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/᩻֫֡;Z)V
    .locals 1

    .line 477
    iget-object v0, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    if-nez v0, :cond_0

    .line 479
    iput-object p1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    .line 480
    iput-boolean p2, p0, Ll/ܺ֫֡;->ۡ:Z

    .line 481
    iget-object p1, p1, Ll/᩻֫֡;->ܽ:Ljava/util/ArrayList;

    new-instance p2, Ll/ۡ֫֡;

    iget-object v0, p0, Ll/ܺ֫֡;->ܽ:Ljava/lang/Object;

    invoke-direct {p2, p0, v0}, Ll/ۡ֫֡;-><init>(Ll/ܺ֫֡;Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 477
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(ZLl/᩵֫֡;Ljava/io/IOException;)V
    .locals 3

    const-string v1, "expected "

    .line 298
    iget-object v0, p0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    iget-object v0, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    monitor-enter v0

    .line 304
    :try_start_0
    iget-object v2, p0, Ll/ܺ֫֡;->ܿ:Ll/᩵֫֡;

    if-ne p2, v2, :cond_5

    const/4 p2, 0x1

    if-nez p1, :cond_0

    .line 308
    iget-object v1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    iget v2, v1, Ll/᩻֫֡;->ᩴ:I

    add-int/2addr v2, p2

    iput v2, v1, Ll/᩻֫֡;->ᩴ:I

    .line 310
    :cond_0
    iget-object v1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    const/4 v2, 0x0

    .line 311
    invoke-direct {p0, p1, v2, p2}, Ll/ܺ֫֡;->֫(ZZZ)Ljava/net/Socket;

    move-result-object p1

    .line 312
    iget-object p2, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    move-object v1, v2

    .line 313
    :cond_1
    iget-boolean p2, p0, Ll/ܺ֫֡;->ۢ:Z

    .line 314
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 315
    invoke-static {p1}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    if-eqz v1, :cond_2

    .line 317
    iget-object p1, p0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    if-eqz p3, :cond_3

    .line 321
    sget-object p1, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object p2, p0, Ll/ܺ֫֡;->ۧ:Ll/ܽܰ᩵;

    invoke-virtual {p1, p2, p3}, Ll/۠۟᩵;->֫(Ll/ܽܰ᩵;Ljava/io/IOException;)Ljava/io/IOException;

    .line 322
    iget-object p1, p0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_3
    if-eqz p2, :cond_4

    .line 324
    sget-object p1, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object p2, p0, Ll/ܺ֫֡;->ۧ:Ll/ܽܰ᩵;

    invoke-virtual {p1, p2, v2}, Ll/۠۟᩵;->֫(Ll/ܽܰ᩵;Ljava/io/IOException;)Ljava/io/IOException;

    .line 325
    iget-object p1, p0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    return-void

    .line 305
    :cond_5
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܺ֫֡;->ܿ:Ll/᩵֫֡;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 314
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()Ll/᩵֫֡;
    .locals 2

    .line 330
    iget-object v0, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    monitor-enter v0

    .line 331
    :try_start_0
    iget-object v1, p0, Ll/ܺ֫֡;->ܿ:Ll/᩵֫֡;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 332
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܳ()V
    .locals 5

    .line 350
    iget-object v0, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    monitor-enter v0

    .line 351
    :try_start_0
    iget-object v1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 352
    invoke-direct {p0, v3, v2, v3}, Ll/ܺ֫֡;->֫(ZZZ)Ljava/net/Socket;

    move-result-object v2

    .line 353
    iget-object v3, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v1, v4

    .line 354
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 355
    invoke-static {v2}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    if-eqz v1, :cond_1

    .line 357
    sget-object v0, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object v1, p0, Ll/ܺ֫֡;->ۧ:Ll/ܽܰ᩵;

    invoke-virtual {v0, v1, v4}, Ll/۠۟᩵;->֫(Ll/ܽܰ᩵;Ljava/io/IOException;)Ljava/io/IOException;

    .line 358
    iget-object v0, p0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    iget-object v0, p0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 354
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()Ll/᩻֫֡;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 344
    :try_start_0
    iget-object v1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;
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

.method public final ܿ()V
    .locals 4

    .line 367
    iget-object v0, p0, Ll/ܺ֫֡;->᩻:Ll/ۡܰ᩵;

    monitor-enter v0

    .line 368
    :try_start_0
    iget-object v1, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 369
    invoke-direct {p0, v2, v3, v3}, Ll/ܺ֫֡;->֫(ZZZ)Ljava/net/Socket;

    move-result-object v2

    .line 370
    iget-object v3, p0, Ll/ܺ֫֡;->ܳ:Ll/᩻֫֡;

    if-eqz v3, :cond_0

    const/4 v1, 0x0

    .line 371
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 372
    invoke-static {v2}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    if-eqz v1, :cond_1

    .line 374
    iget-object v0, p0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 371
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩳ()Z
    .locals 1

    .line 520
    iget-object v0, p0, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ܺ֫֡;->ۖ:Ll/᩷֫֡;

    if-eqz v0, :cond_0

    .line 521
    invoke-virtual {v0}, Ll/᩷֫֡;->ۧ()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Ll/ܺ֫֡;->ۘ:Ll/ۢ֫֡;

    .line 522
    invoke-virtual {v0}, Ll/ۢ֫֡;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩻()Ll/ۚ۟᩵;
    .locals 1

    .line 340
    iget-object v0, p0, Ll/ܺ֫֡;->ܺ:Ll/ۚ۟᩵;

    return-object v0
.end method
