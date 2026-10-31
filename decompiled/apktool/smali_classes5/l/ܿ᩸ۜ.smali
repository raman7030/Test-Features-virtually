.class public final Ll/ܿ᩸ۜ;
.super Ljava/lang/Object;
.source "B749"

# interfaces
.implements Ll/۟ܰۜ;


# instance fields
.field public final ֫֫:Ll/ۚۙܳ;

.field public ۗ:Ljava/lang/Throwable;

.field public ۙ:Z

.field public final ۛ:Ll/᩶۫᩷;

.field public final ۟:Ll/ۗ۠֫;

.field public ۤ:Z

.field public volatile ۧ֫:Z

.field public ۨ:[B

.field public ۫:Ljava/lang/Thread;

.field public final ۬:Ljava/lang/Object;

.field public final ܰ:Ll/᩸۠֫;

.field public ܽ֫:Ll/۟᩶ۜ;

.field public final ܿ֫:J

.field public final ᩳ֫:I

.field public ᩶:Ll/᩶᩶ۜ;

.field public ᩸:Ll/᩶᩶ۜ;

.field public final ᩹:Ljava/lang/Object;

.field public ᩺:I


# direct methods
.method public constructor <init>(Ll/᩸۠֫;Ll/ۗ۠֫;JLl/᩶۫᩷;)V
    .locals 5

    .line 67
    new-instance v0, Ll/ۚۙܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/ܿ᩸ۜ;->۬:Ljava/lang/Object;

    .line 39
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    const-wide/16 v1, 0x0

    cmp-long v3, p3, v1

    if-lez v3, :cond_1

    const v1, 0x7ff70

    int-to-long v1, v1

    .line 87
    invoke-static {p3, p4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    const-wide/16 v3, 0xbc

    div-long/2addr v1, v3

    mul-long v1, v1, v3

    long-to-int v2, v1

    const/16 v1, 0x3ac

    if-lt v2, v1, :cond_0

    .line 92
    iput-object p1, p0, Ll/ܿ᩸ۜ;->ܰ:Ll/᩸۠֫;

    .line 93
    iput-object p2, p0, Ll/ܿ᩸ۜ;->۟:Ll/ۗ۠֫;

    .line 94
    iput-wide p3, p0, Ll/ܿ᩸ۜ;->ܿ֫:J

    .line 95
    iput v2, p0, Ll/ܿ᩸ۜ;->ᩳ֫:I

    .line 96
    iput-object p5, p0, Ll/ܿ᩸ۜ;->ۛ:Ll/᩶۫᩷;

    .line 97
    iput-object v0, p0, Ll/ܿ᩸ۜ;->֫֫:Ll/ۚۙܳ;

    return-void

    .line 90
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "MPEG-TS segment is too short to preview"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 79
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "MPEG-TS segment length must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(I[B)I
    .locals 4

    const/16 v0, 0xbb

    add-int/lit16 p0, p0, -0x3ac

    .line 382
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p0, :cond_2

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x5

    if-ge v1, v2, :cond_1

    mul-int/lit16 v2, v1, 0xbc

    add-int/2addr v2, v0

    .line 386
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    const/16 v3, 0x47

    if-eq v2, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return v0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method private ֫()Ll/۟ܶۜ;
    .locals 12

    .line 177
    invoke-static {}, Ll/֫ۙۜ;->֫()Ll/֫ۙۜ;

    move-result-object v0

    iget v1, p0, Ll/ܿ᩸ۜ;->ᩳ֫:I

    invoke-virtual {v0, v1}, Ll/֫ۙۜ;->֫(I)Ll/۟᩶ۜ;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 183
    :try_start_0
    new-array v9, v1, [B

    .line 184
    iget-object v2, p0, Ll/ܿ᩸ۜ;->۟:Ll/ۗ۠֫;

    invoke-virtual {v2}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object v2

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Ll/ۙ۠֫;->֫(J)V

    invoke-virtual {v2}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v1

    .line 185
    invoke-direct {p0, v1}, Ll/ܿ᩸ۜ;->֫(Ll/ۗ۠֫;)Ll/᩶᩶ۜ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v10, 0x0

    .line 189
    :try_start_1
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ܿ()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v2, v5, v7

    if-eqz v2, :cond_1

    cmp-long v2, v5, v3

    if-ltz v2, :cond_0

    goto :goto_0

    .line 191
    :cond_0
    new-instance v2, Ljava/io/EOFException;

    const-string v3, "MPEG-TS preview source is shorter than expected"

    invoke-direct {v2, v3}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 193
    :cond_1
    :goto_0
    new-instance v11, Ll/֫᩸ۜ;

    iget-object v3, p0, Ll/ܿ᩸ۜ;->ܰ:Ll/᩸۠֫;

    iget v5, p0, Ll/ܿ᩸ۜ;->ᩳ֫:I

    iget-wide v6, p0, Ll/ܿ᩸ۜ;->ܿ֫:J

    new-instance v8, Ll/ܰܶۜ;

    invoke-direct {v8, p0}, Ll/ܰܶۜ;-><init>(Ljava/lang/Object;)V

    move-object v2, v11

    move-object v4, v9

    invoke-direct/range {v2 .. v8}, Ll/֫᩸ۜ;-><init>(Ll/ۢᩴ֫;[BIJLl/ܰܶۜ;)V

    .line 195
    new-instance v2, Ll/ܺ᩷ۧ;

    iget-wide v7, p0, Ll/ܿ᩸ۜ;->ܿ֫:J

    const-wide/16 v5, 0x0

    move-object v3, v2

    move-object v4, v11

    invoke-direct/range {v3 .. v8}, Ll/ܺ᩷ۧ;-><init>(Ll/ۢᩴ֫;JJ)V

    .line 196
    new-instance v3, Ll/ۧ᩸ۜ;

    invoke-direct {v3}, Ll/ۧ᩸ۜ;-><init>()V

    .line 197
    iget-object v4, p0, Ll/ܿ᩸ۜ;->֫֫:Ll/ۚۙܳ;

    invoke-virtual {v4}, Ll/ۚۙܳ;->֫()Ll/ܺۚۧ;

    move-result-object v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 199
    :try_start_2
    invoke-virtual {v4, v2}, Ll/ܺۚۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 202
    invoke-virtual {v11}, Ll/֫᩸ۜ;->ܳ()I

    move-result v5

    invoke-static {v5, v9}, Ll/ܿ᩸ۜ;->֫(I[B)I

    move-result v5

    if-ltz v5, :cond_7

    .line 206
    invoke-virtual {v2}, Ll/ܺ᩷ۧ;->ۧ()V

    .line 207
    invoke-virtual {v4, v3}, Ll/ܺۚۧ;->֫(Ll/᩸᩷ۧ;)V

    .line 208
    new-instance v5, Ll/᩻ۢۧ;

    .line 22
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 209
    :cond_2
    invoke-virtual {v3}, Ll/ۧ᩸ۜ;->֫()Z

    move-result v6

    if-nez v6, :cond_4

    .line 210
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ᩳ()V

    .line 211
    invoke-virtual {v4, v2, v5}, Ll/ܺۚۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_3

    const/4 v7, -0x1

    if-ne v6, v7, :cond_2

    goto :goto_1

    .line 213
    :cond_3
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Unexpected seek while scanning MPEG-TS preview"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 222
    :cond_4
    :goto_1
    :try_start_3
    invoke-virtual {v3}, Ll/ۧ᩸ۜ;->֫()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 225
    invoke-virtual {v11}, Ll/֫᩸ۜ;->ܳ()I

    move-result v2

    invoke-static {v2, v9}, Ll/ܿ᩸ۜ;->֫(I[B)I

    move-result v2

    .line 226
    invoke-virtual {v11}, Ll/֫᩸ۜ;->ܳ()I

    move-result v4

    sub-int/2addr v4, v2

    div-int/lit16 v4, v4, 0xbc

    mul-int/lit16 v4, v4, 0xbc

    add-int/2addr v4, v2

    if-lez v4, :cond_5

    .line 231
    new-instance v8, Ll/۟ܶۜ;

    .line 232
    invoke-virtual {v3}, Ll/ۧ᩸ۜ;->ۧ()J

    move-result-wide v5

    move-object v2, v8

    move v3, v4

    move-wide v4, v5

    move-object v6, v0

    move-object v7, v9

    invoke-direct/range {v2 .. v7}, Ll/۟ܶۜ;-><init>(IJLl/۟᩶ۜ;[B)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 238
    :try_start_4
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 246
    :try_start_5
    invoke-direct {p0, v1}, Ll/ܿ᩸ۜ;->֫(Ll/᩶᩶ۜ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    return-object v8

    :catchall_0
    move-exception v2

    goto :goto_3

    :catch_0
    move-exception v2

    goto :goto_2

    :catch_1
    move-exception v2

    goto :goto_2

    :catch_2
    move-exception v2

    .line 243
    :goto_2
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 246
    :goto_3
    :try_start_7
    invoke-direct {p0, v1}, Ll/ܿ᩸ۜ;->֫(Ll/᩶᩶ۜ;)V

    .line 247
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 229
    :cond_5
    :try_start_8
    new-instance v2, Ljava/io/IOException;

    const-string v3, "MPEG-TS preview does not contain a complete packet"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 223
    :cond_6
    new-instance v2, Ljava/io/IOException;

    const-string v3, "No decodable video keyframe found in MPEG-TS preview"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 204
    :cond_7
    :try_start_9
    new-instance v2, Ljava/io/IOException;

    const-string v3, "MPEG-TS preview packet alignment is invalid"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 200
    :cond_8
    new-instance v2, Ljava/io/IOException;

    const-string v3, "MPEG-TS preview source could not be recognized"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_1
    move-exception v2

    .line 221
    :try_start_a
    throw v2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v2

    goto :goto_5

    :catch_3
    move-exception v2

    goto :goto_4

    :catch_4
    move-exception v2

    goto :goto_4

    :catch_5
    move-exception v2

    :goto_4
    move-object v10, v2

    .line 235
    :try_start_b
    throw v10
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 238
    :goto_5
    :try_start_c
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_7
    .catch Ljava/lang/Error; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_9

    :catchall_3
    move-exception v2

    goto :goto_8

    :catch_6
    move-exception v3

    goto :goto_6

    :catch_7
    move-exception v3

    goto :goto_6

    :catch_8
    move-exception v3

    :goto_6
    if-eqz v10, :cond_a

    if-ne v10, v3, :cond_9

    goto :goto_7

    .line 241
    :cond_9
    :try_start_d
    invoke-virtual {v10, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_9

    :cond_a
    :goto_7
    if-nez v10, :cond_b

    .line 243
    throw v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 246
    :goto_8
    :try_start_e
    invoke-direct {p0, v1}, Ll/ܿ᩸ۜ;->֫(Ll/᩶᩶ۜ;)V

    .line 247
    throw v2

    .line 246
    :cond_b
    :goto_9
    invoke-direct {p0, v1}, Ll/ܿ᩸ۜ;->֫(Ll/᩶᩶ۜ;)V

    .line 248
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :catchall_4
    move-exception v1

    .line 253
    invoke-virtual {v0}, Ll/۟᩶ۜ;->close()V

    .line 255
    throw v1

    .line 179
    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "MPEG-TS preview memory budget is exhausted"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(Ll/ۗ۠֫;)Ll/᩶᩶ۜ;
    .locals 7

    .line 262
    new-instance v1, Ll/᩶᩶ۜ;

    iget-object v0, p0, Ll/ܿ᩸ۜ;->ܰ:Ll/᩸۠֫;

    .line 263
    invoke-static {}, Ll/ۧۙۜ;->֫()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v2

    invoke-direct {v1, v0, p1, v2}, Ll/᩶᩶ۜ;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;Ljava/util/concurrent/ThreadPoolExecutor;)V

    const/4 p1, 0x0

    const/4 v2, 0x0

    .line 267
    :try_start_0
    iget-object v0, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 268
    :try_start_1
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ᩳ()V

    .line 269
    iput-object v1, p0, Ll/ܿ᩸ۜ;->᩶:Ll/᩶᩶ۜ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    const/4 v3, 0x1

    .line 271
    :try_start_2
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ܳ()V

    .line 272
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 273
    :try_start_3
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->֫()V

    .line 274
    iget-object v0, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 275
    :try_start_4
    iget-boolean v4, p0, Ll/ܿ᩸ۜ;->ۧ֫:Z

    if-nez v4, :cond_0

    iget-object v4, p0, Ll/ܿ᩸ۜ;->᩶:Ll/᩶᩶ۜ;

    if-ne v4, v1, :cond_0

    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 276
    iput-object p1, p0, Ll/ܿ᩸ۜ;->᩶:Ll/᩶᩶ۜ;

    .line 277
    iput-object v1, p0, Ll/ܿ᩸ۜ;->᩸:Ll/᩶᩶ۜ;

    const/4 v2, 0x1

    .line 280
    :cond_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v2, :cond_3

    if-nez v2, :cond_2

    .line 603
    :try_start_5
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ۧ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 292
    :catchall_0
    iget-object v0, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 293
    :try_start_6
    iget-object v2, p0, Ll/ܿ᩸ۜ;->᩶:Ll/᩶᩶ۜ;

    if-ne v2, v1, :cond_1

    .line 294
    iput-object p1, p0, Ll/ܿ᩸ۜ;->᩶:Ll/᩶᩶ۜ;

    .line 296
    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1

    :cond_2
    :goto_0
    return-object v1

    .line 282
    :cond_3
    :try_start_7
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v4, "MPEG-TS preview read was canceled"

    invoke-direct {v0, v4}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_2
    move-exception v4

    .line 280
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    throw v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catchall_3
    move-exception v0

    move-object v5, p0

    goto :goto_2

    :catchall_4
    move-exception v4

    move-object v5, p0

    move-object v3, v4

    const/4 v4, 0x1

    goto :goto_1

    :catchall_5
    move-exception v3

    const/4 v4, 0x0

    move-object v5, p0

    .line 272
    :goto_1
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    :try_start_b
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :catchall_6
    move-exception v0

    move v3, v4

    :goto_2
    move-object v6, v1

    move-object v1, v0

    move v0, v2

    move-object v2, v6

    goto :goto_3

    :catchall_7
    move-exception v3

    goto :goto_1

    :catchall_8
    move-exception v0

    const/4 v3, 0x0

    move-object v5, p0

    move-object v2, v1

    move-object v1, v0

    const/4 v0, 0x0

    :goto_3
    if-nez v0, :cond_6

    if-eqz v3, :cond_4

    .line 603
    :try_start_c
    invoke-virtual {v2}, Ll/᩶᩶ۜ;->ۧ()V

    goto :goto_4

    .line 679
    :cond_4
    invoke-virtual {v2}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 292
    :catchall_9
    :goto_4
    iget-object v0, v5, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 293
    :try_start_d
    iget-object v3, v5, Ll/ܿ᩸ۜ;->᩶:Ll/᩶᩶ۜ;

    if-ne v3, v2, :cond_5

    .line 294
    iput-object p1, v5, Ll/ܿ᩸ۜ;->᩶:Ll/᩶᩶ۜ;

    .line 296
    :cond_5
    monitor-exit v0

    goto :goto_5

    :catchall_a
    move-exception p1

    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    throw p1

    .line 298
    :cond_6
    :goto_5
    throw v1
.end method

.method public static ֫(Ljava/lang/Throwable;)V
    .locals 2

    .line 409
    instance-of v0, p0, Ljava/io/IOException;

    if-nez v0, :cond_3

    .line 412
    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-nez v0, :cond_2

    .line 415
    instance-of v0, p0, Ljava/lang/Error;

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    return-void

    .line 419
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "MPEG-TS preview operation failed"

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 415
    :cond_1
    check-cast p0, Ljava/lang/Error;

    .line 416
    throw p0

    .line 412
    :cond_2
    check-cast p0, Ljava/lang/RuntimeException;

    .line 413
    throw p0

    .line 409
    :cond_3
    check-cast p0, Ljava/io/IOException;

    .line 410
    throw p0
.end method

.method public static synthetic ֫(Ll/ܿ᩸ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ᩳ()V

    return-void
.end method

.method private ֫(Ll/᩶᩶ۜ;)V
    .locals 2

    .line 303
    iget-object v0, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 304
    :try_start_0
    iget-object v1, p0, Ll/ܿ᩸ۜ;->᩸:Ll/᩶᩶ۜ;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 305
    iput-object p1, p0, Ll/ܿ᩸ۜ;->᩸:Ll/᩶᩶ۜ;

    .line 307
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ܽ()V
    .locals 8

    .line 131
    iget-object v0, p0, Ll/ܿ᩸ۜ;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 132
    :try_start_0
    iget-boolean v1, p0, Ll/ܿ᩸ۜ;->ۤ:Z

    if-eqz v1, :cond_0

    .line 133
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ᩳ()V

    .line 134
    monitor-exit v0

    return-void

    .line 136
    :cond_0
    iget-boolean v1, p0, Ll/ܿ᩸ۜ;->ۙ:Z

    if-eqz v1, :cond_1

    .line 137
    iget-object v1, p0, Ll/ܿ᩸ۜ;->ۗ:Ljava/lang/Throwable;

    invoke-static {v1}, Ll/ܿ᩸ۜ;->֫(Ljava/lang/Throwable;)V

    :cond_1
    const/4 v2, 0x1

    .line 139
    iput-boolean v2, p0, Ll/ܿ᩸ۜ;->ۙ:Z

    .line 140
    iget-object v1, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    .line 141
    :try_start_1
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ᩳ()V

    .line 142
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    iput-object v3, p0, Ll/ܿ᩸ۜ;->۫:Ljava/lang/Thread;

    .line 143
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    const/4 v3, 0x0

    .line 146
    :try_start_2
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ᩳ()V

    .line 147
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->֫()Ll/۟ܶۜ;

    move-result-object v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 148
    :try_start_3
    iget-object v1, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 149
    :try_start_4
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ᩳ()V

    .line 150
    invoke-static {v4}, Ll/۟ܶۜ;->֫(Ll/۟ܶۜ;)[B

    move-result-object v5

    iput-object v5, p0, Ll/ܿ᩸ۜ;->ۨ:[B

    .line 151
    invoke-static {v4}, Ll/۟ܶۜ;->ۧ(Ll/۟ܶۜ;)I

    move-result v5

    iput v5, p0, Ll/ܿ᩸ۜ;->᩺:I

    .line 153
    invoke-static {v4}, Ll/۟ܶۜ;->ܽ(Ll/۟ܶۜ;)Ll/۟᩶ۜ;

    move-result-object v5

    iput-object v5, p0, Ll/ܿ᩸ۜ;->ܽ֫:Ll/۟᩶ۜ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 155
    :try_start_5
    iput-boolean v2, p0, Ll/ܿ᩸ۜ;->ۤ:Z

    .line 156
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 161
    :try_start_6
    iget-object v1, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    .line 162
    :try_start_7
    iget-object v2, p0, Ll/ܿ᩸ۜ;->۫:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    if-ne v2, v4, :cond_2

    .line 163
    iput-object v3, p0, Ll/ܿ᩸ۜ;->۫:Ljava/lang/Thread;

    .line 165
    :cond_2
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 170
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    return-void

    :catchall_0
    move-exception v2

    .line 165
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    :catchall_1
    move-exception v2

    move-object v5, p0

    move-object v4, v3

    goto :goto_0

    :catchall_2
    move-exception v2

    move-object v5, p0

    .line 156
    :goto_0
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    throw v2
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/Error; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :catch_0
    move-exception v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_3

    :catch_2
    move-exception v1

    goto :goto_3

    :catchall_3
    move-exception v2

    goto :goto_0

    :catchall_4
    move-exception v1

    move-object v5, p0

    goto :goto_4

    :catch_3
    move-exception v1

    :goto_1
    move-object v5, p0

    goto :goto_3

    :catch_4
    move-exception v1

    goto :goto_1

    :catch_5
    move-exception v1

    goto :goto_1

    :catchall_5
    move-exception v1

    move-object v5, p0

    move-object v2, v1

    move-object v4, v3

    goto :goto_5

    :catch_6
    move-exception v1

    goto :goto_2

    :catch_7
    move-exception v1

    goto :goto_2

    :catch_8
    move-exception v1

    :goto_2
    move-object v5, p0

    move-object v4, v3

    .line 158
    :goto_3
    :try_start_d
    iput-object v1, v5, Ll/ܿ᩸ۜ;->ۗ:Ljava/lang/Throwable;

    .line 159
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    :catchall_6
    move-exception v1

    :goto_4
    move-object v2, v1

    .line 161
    :goto_5
    :try_start_e
    iget-object v1, v5, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 162
    :try_start_f
    iget-object v6, v5, Ll/ܿ᩸ۜ;->۫:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    if-ne v6, v7, :cond_3

    .line 163
    iput-object v3, v5, Ll/ܿ᩸ۜ;->۫:Ljava/lang/Thread;

    .line 165
    :cond_3
    monitor-exit v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    if-eqz v4, :cond_4

    .line 167
    :try_start_10
    invoke-static {v4}, Ll/۟ܶۜ;->ܽ(Ll/۟ܶۜ;)Ll/۟᩶ۜ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟᩶ۜ;->close()V

    .line 169
    :cond_4
    throw v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    :catchall_7
    move-exception v2

    .line 165
    :try_start_11
    monitor-exit v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :try_start_12
    throw v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    :catchall_8
    move-exception v2

    .line 143
    :try_start_13
    monitor-exit v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    :try_start_14
    throw v2

    :catchall_9
    move-exception v1

    .line 170
    monitor-exit v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    throw v1
.end method

.method private ᩳ()V
    .locals 2

    .line 359
    iget-boolean v0, p0, Ll/ܿ᩸ۜ;->ۧ֫:Z

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    .line 362
    iget-object v0, p0, Ll/ܿ᩸ۜ;->ۛ:Ll/᩶۫᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 360
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "MPEG-TS preview read was canceled"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 316
    iget-object v0, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 317
    :try_start_0
    iput-boolean v1, p0, Ll/ܿ᩸ۜ;->ۧ֫:Z

    .line 318
    iget-object v1, p0, Ll/ܿ᩸ۜ;->᩶:Ll/᩶᩶ۜ;

    .line 319
    iget-object v2, p0, Ll/ܿ᩸ۜ;->᩸:Ll/᩶᩶ۜ;

    .line 320
    iget-object v3, p0, Ll/ܿ᩸ۜ;->۫:Ljava/lang/Thread;

    .line 321
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    .line 325
    :try_start_1
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ۧ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v0, v4

    :goto_1
    if-eqz v3, :cond_1

    .line 330
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v3, v1, :cond_1

    .line 331
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    if-eqz v2, :cond_3

    .line 335
    :try_start_2
    invoke-virtual {v2}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    if-eq v0, v1, :cond_3

    .line 403
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    move-object v1, v0

    .line 340
    :goto_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq v3, v0, :cond_4

    .line 341
    iget-object v2, p0, Ll/ܿ᩸ۜ;->۬:Ljava/lang/Object;

    move-object v0, v2

    monitor-enter v0

    .line 343
    :try_start_3
    monitor-exit v0

    goto :goto_4

    :catchall_2
    move-exception v0

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    .line 346
    :cond_4
    :goto_4
    iget-object v0, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 347
    :try_start_4
    iput-object v4, p0, Ll/ܿ᩸ۜ;->ۨ:[B

    .line 348
    iget-object v2, p0, Ll/ܿ᩸ۜ;->ܽ֫:Ll/۟᩶ۜ;

    .line 349
    iput-object v4, p0, Ll/ܿ᩸ۜ;->ܽ֫:Ll/۟᩶ۜ;

    .line 350
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v2, :cond_5

    .line 352
    invoke-virtual {v2}, Ll/۟᩶ۜ;->close()V

    .line 354
    :cond_5
    invoke-static {v1}, Ll/ܿ᩸ۜ;->֫(Ljava/lang/Throwable;)V

    return-void

    :catchall_3
    move-exception v1

    .line 350
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v1

    :catchall_4
    move-exception v1

    .line 321
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    throw v1
.end method

.method public final length()J
    .locals 2

    .line 108
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ܽ()V

    .line 109
    iget v0, p0, Ll/ܿ᩸ۜ;->᩺:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ۧ(J[BII)V
    .locals 5

    .line 114
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ܽ()V

    .line 115
    iget-object v0, p0, Ll/ܿ᩸ۜ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 116
    :try_start_0
    invoke-direct {p0}, Ll/ܿ᩸ۜ;->ᩳ()V

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    if-ltz p4, :cond_1

    if-ltz p5, :cond_1

    .line 117
    array-length v1, p3

    sub-int/2addr v1, p5

    if-gt p4, v1, :cond_1

    iget v1, p0, Ll/ܿ᩸ۜ;->᩺:I

    int-to-long v1, v1

    int-to-long v3, p5

    sub-long/2addr v1, v3

    cmp-long v3, p1, v1

    if-gtz v3, :cond_1

    .line 121
    iget-object v1, p0, Ll/ܿ᩸ۜ;->ۨ:[B

    if-eqz v1, :cond_0

    long-to-int p2, p1

    .line 125
    invoke-static {v1, p2, p3, p4, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    monitor-exit v0

    return-void

    .line 123
    :cond_0
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "MPEG-TS preview clip was closed"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 119
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "MPEG-TS preview read exceeds clip length"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 126
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
