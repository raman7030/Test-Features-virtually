.class public final Ll/ܿ۬ᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/᩸۬ᩳ;

.field public ۙ:Ll/ۢۗᩳ;

.field public final ᩶:Ll/᩶۬ᩳ;

.field public ᩸:Ll/۟ۙᩳ;

.field public final ᩹:Ll/ۡۗᩳ;


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;Ll/ۡۗᩳ;Ll/ۢۗᩳ;Ll/᩶۬ᩳ;)V
    .locals 0

    .line 1264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1265
    iput-object p1, p0, Ll/ܿ۬ᩳ;->ۗ:Ll/᩸۬ᩳ;

    .line 1266
    iput-object p2, p0, Ll/ܿ۬ᩳ;->᩹:Ll/ۡۗᩳ;

    .line 1267
    iput-object p3, p0, Ll/ܿ۬ᩳ;->ۙ:Ll/ۢۗᩳ;

    .line 1268
    iput-object p4, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿ۬ᩳ;Ll/۟ۙᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;

    return-void
.end method

.method private ۜ()Ll/ۢۗᩳ;
    .locals 2

    .line 1312
    iget-object v0, p0, Ll/ܿ۬ᩳ;->ۙ:Ll/ۢۗᩳ;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recovery handle is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1318
    :try_start_0
    iget-object v1, p0, Ll/ܿ۬ᩳ;->ۙ:Ll/ۢۗᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 1320
    :try_start_1
    iput-object v2, p0, Ll/ܿ۬ᩳ;->ۙ:Ll/ۢۗᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 1321
    :try_start_2
    invoke-virtual {v1}, Ll/ۢۗᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 1322
    :try_start_3
    iget-object v1, p0, Ll/ܿ۬ᩳ;->ۗ:Ll/᩸۬ᩳ;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1324
    :cond_1
    :try_start_4
    iget-object v1, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;

    if-eqz v1, :cond_2

    .line 1326
    iput-object v2, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1327
    :try_start_5
    invoke-virtual {v1}, Ll/۟ۙᩳ;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 1328
    :try_start_6
    new-instance v2, Ljava/io/UncheckedIOException;

    invoke-direct {v2, v1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1330
    :cond_2
    :goto_0
    :try_start_7
    iget-object v1, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    invoke-virtual {v1}, Ll/᩶۬ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 1333
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 1330
    :try_start_8
    iget-object v2, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    invoke-virtual {v2}, Ll/᩶۬ᩳ;->close()V

    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    :catchall_1
    move-exception v1

    .line 1324
    :try_start_9
    iget-object v3, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;

    if-eqz v3, :cond_3

    .line 1326
    iput-object v2, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 1327
    :try_start_a
    invoke-virtual {v3}, Ll/۟ۙᩳ;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_1

    :catch_1
    move-exception v1

    .line 1328
    :try_start_b
    new-instance v2, Ljava/io/UncheckedIOException;

    invoke-direct {v2, v1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1330
    :cond_3
    :goto_1
    :try_start_c
    iget-object v2, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    invoke-virtual {v2}, Ll/᩶۬ᩳ;->close()V

    .line 1331
    throw v1

    :catchall_2
    move-exception v1

    .line 1330
    iget-object v2, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    invoke-virtual {v2}, Ll/᩶۬ᩳ;->close()V

    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :catchall_3
    move-exception v1

    .line 1322
    :try_start_d
    iget-object v3, p0, Ll/ܿ۬ᩳ;->ۗ:Ll/᩸۬ᩳ;

    if-eqz v3, :cond_4

    iget-object v3, p0, Ll/ܿ۬ᩳ;->ۗ:Ll/᩸۬ᩳ;

    invoke-virtual {v3}, Ll/᩸۬ᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 1324
    :cond_4
    :try_start_e
    iget-object v3, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;

    if-eqz v3, :cond_5

    .line 1326
    iput-object v2, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 1327
    :try_start_f
    invoke-virtual {v3}, Ll/۟ۙᩳ;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_2
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    goto :goto_2

    :catch_2
    move-exception v1

    .line 1328
    :try_start_10
    new-instance v2, Ljava/io/UncheckedIOException;

    invoke-direct {v2, v1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 1330
    :cond_5
    :goto_2
    :try_start_11
    iget-object v2, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    invoke-virtual {v2}, Ll/᩶۬ᩳ;->close()V

    .line 1332
    throw v1

    :catchall_4
    move-exception v1

    .line 1330
    iget-object v2, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    invoke-virtual {v2}, Ll/᩶۬ᩳ;->close()V

    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :catchall_5
    move-exception v1

    .line 1324
    :try_start_12
    iget-object v3, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;

    if-eqz v3, :cond_6

    .line 1326
    iput-object v2, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 1327
    :try_start_13
    invoke-virtual {v3}, Ll/۟ۙᩳ;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_3
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    goto :goto_3

    :catch_3
    move-exception v1

    .line 1328
    :try_start_14
    new-instance v2, Ljava/io/UncheckedIOException;

    invoke-direct {v2, v1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 1330
    :cond_6
    :goto_3
    :try_start_15
    iget-object v2, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    invoke-virtual {v2}, Ll/᩶۬ᩳ;->close()V

    .line 1331
    throw v1

    :catchall_6
    move-exception v1

    .line 1330
    iget-object v2, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    invoke-virtual {v2}, Ll/᩶۬ᩳ;->close()V

    throw v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    throw v1
.end method

.method public final declared-synchronized ֫()[B
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1276
    :try_start_0
    invoke-direct {p0}, Ll/ܿ۬ᩳ;->ۜ()Ll/ۢۗᩳ;

    move-result-object v1

    iget-object v1, v1, Ll/ۢۗᩳ;->ۨ:[B

    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B
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

.method public final declared-synchronized ܳ()Ljava/util/UUID;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1278
    :try_start_0
    invoke-direct {p0}, Ll/ܿ۬ᩳ;->ۜ()Ll/ۢۗᩳ;

    iget-object v1, p0, Ll/ܿ۬ᩳ;->ۗ:Ll/᩸۬ᩳ;

    iget-object v1, v1, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;
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

.method public final declared-synchronized ܽ()Ll/᩻۬ᩳ;
    .locals 14

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1289
    :try_start_0
    invoke-direct {p0}, Ll/ܿ۬ᩳ;->ۜ()Ll/ۢۗᩳ;

    move-result-object v1

    .line 1290
    new-instance v11, Ll/ۖ᩹ᩳ;

    iget-object v2, v1, Ll/ۢۗᩳ;->ܰ:Ll/ۨ᩹ᩳ;

    iget-wide v3, v1, Ll/ۢۗᩳ;->᩺:J

    invoke-direct {v11, v2, v3, v4}, Ll/ۖ᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V

    .line 1291
    invoke-virtual {v1}, Ll/ۢۗᩳ;->֫()Ll/ۖۗᩳ;

    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1294
    :try_start_1
    iget-object v2, p0, Ll/ܿ۬ᩳ;->᩹:Ll/ۡۗᩳ;

    invoke-virtual {v2, v1}, Ll/ۡۗᩳ;->֫(Ll/ۢۗᩳ;)V

    .line 1295
    new-instance v13, Ll/᩻۬ᩳ;

    iget-object v3, p0, Ll/ܿ۬ᩳ;->ۗ:Ll/᩸۬ᩳ;

    iget-object v2, v1, Ll/ۢۗᩳ;->᩶:Ll/ۖۙᩳ;

    if-nez v2, :cond_0

    new-instance v2, Ll/ۖۙᩳ;

    invoke-direct {v2}, Ll/ۖۙᩳ;-><init>()V

    :cond_0
    move-object v6, v2

    iget-object v7, p0, Ll/ܿ۬ᩳ;->᩹:Ll/ۡۗᩳ;

    iget-object v8, p0, Ll/ܿ۬ᩳ;->᩶:Ll/᩶۬ᩳ;

    sget-object v9, Ll/۬ۙᩳ;->ܿ:Ll/۬ۙᩳ;

    const/4 v10, 0x0

    move-object v2, v13

    move-object v4, v11

    move-object v5, v12

    invoke-direct/range {v2 .. v10}, Ll/᩻۬ᩳ;-><init>(Ll/᩸۬ᩳ;Ll/ۖ᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۡۗᩳ;Ll/᩶۬ᩳ;Ll/۬ۙᩳ;I)V

    .line 1297
    iget-object v2, v1, Ll/ۢۗᩳ;->ۙ:Ll/ۚۙᩳ;

    invoke-static {v13, v2}, Ll/᩻۬ᩳ;->֫(Ll/᩻۬ᩳ;Ll/ۚۙᩳ;)V

    .line 1298
    iget-object v2, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;

    invoke-static {v13, v2}, Ll/᩻۬ᩳ;->֫(Ll/᩻۬ᩳ;Ll/۟ۙᩳ;)V

    const/4 v2, 0x0

    .line 1299
    iput-object v2, p0, Ll/ܿ۬ᩳ;->᩸:Ll/۟ۙᩳ;

    .line 1300
    iput-object v2, p0, Ll/ܿ۬ᩳ;->ۙ:Ll/ۢۗᩳ;

    .line 1301
    invoke-virtual {v1}, Ll/ۢۗᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1303
    monitor-exit v0

    return-object v13

    :catchall_0
    move-exception v1

    .line 1306
    :try_start_2
    invoke-virtual {v11}, Ll/ۖ᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v12}, Ll/ۖۗᩳ;->close()V

    .line 1308
    throw v1

    :catchall_1
    move-exception v1

    .line 1306
    invoke-virtual {v12}, Ll/ۖۗᩳ;->close()V

    throw v1

    :catchall_2
    move-exception v1

    .line 1308
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v1
.end method

.method public final declared-synchronized ᩳ()J
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1271
    :try_start_0
    invoke-direct {p0}, Ll/ܿ۬ᩳ;->ۜ()Ll/ۢۗᩳ;

    move-result-object v1

    iget-wide v1, v1, Ll/ۢۗᩳ;->ۛ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩻()Ll/۫᩹ᩳ;
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1283
    :try_start_0
    invoke-direct {p0}, Ll/ܿ۬ᩳ;->ۜ()Ll/ۢۗᩳ;

    move-result-object v1

    .line 1284
    new-instance v2, Ll/۫᩹ᩳ;

    iget-object v3, v1, Ll/ۢۗᩳ;->ܰ:Ll/ۨ᩹ᩳ;

    iget-wide v4, v1, Ll/ۢۗᩳ;->᩺:J

    invoke-direct {v2, v3, v4, v5}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
