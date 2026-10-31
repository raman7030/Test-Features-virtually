.class public final Ll/᩵ܿۜ;
.super Ljava/lang/Object;
.source "L78E"


# instance fields
.field public final ֡:Ll/ܳ᩻ۜ;

.field public final ֫:Ll/ۘܿۜ;

.field public ۖ:Z

.field public ۘ:Z

.field public ۜ:I

.field public final ۡ:Ll/᩻ۜۜ;

.field public final ۢ:Ll/֫۟᩻;

.field public final ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ܳ:Ljava/util/ArrayList;

.field public final ܺ:I

.field public final ܽ:Ll/ۢ᩺᩻;

.field public final ܿ:I

.field public final ᩳ:[Ll/ܳܿۜ;

.field public final synthetic ᩴ:Ll/ۚܿۜ;

.field public final ᩵:[Ljava/lang/Thread;

.field public ᩷:I

.field public final ᩻:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۚܿۜ;Ll/ܳ᩻ۜ;Ll/᩻ۜۜ;Ll/ۘܿۜ;ILl/֫۟᩻;Ljava/util/ArrayList;IIILl/ۢ᩺᩻;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 1259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܿۜ;->ᩴ:Ll/ۚܿۜ;

    .line 1234
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    const/16 p1, 0x10

    new-array p1, p1, [Ll/ܳܿۜ;

    .line 1244
    iput-object p1, p0, Ll/᩵ܿۜ;->ᩳ:[Ll/ܳܿۜ;

    .line 1260
    iput-object p2, p0, Ll/᩵ܿۜ;->֡:Ll/ܳ᩻ۜ;

    .line 1261
    iput-object p3, p0, Ll/᩵ܿۜ;->ۡ:Ll/᩻ۜۜ;

    .line 1262
    iput-object p4, p0, Ll/᩵ܿۜ;->֫:Ll/ۘܿۜ;

    .line 1263
    iput p5, p0, Ll/᩵ܿۜ;->ܺ:I

    .line 1264
    iput-object p6, p0, Ll/᩵ܿۜ;->ۢ:Ll/֫۟᩻;

    .line 1265
    iput-object p7, p0, Ll/᩵ܿۜ;->ܳ:Ljava/util/ArrayList;

    .line 1266
    iput p8, p0, Ll/᩵ܿۜ;->ۜ:I

    .line 1267
    iput p8, p0, Ll/᩵ܿۜ;->᩷:I

    .line 1268
    iput p9, p0, Ll/᩵ܿۜ;->ܿ:I

    .line 1269
    iput-object p11, p0, Ll/᩵ܿۜ;->ܽ:Ll/ۢ᩺᩻;

    .line 1270
    iput-object p12, p0, Ll/᩵ܿۜ;->ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1271
    new-array p1, p10, [Ljava/lang/Thread;

    iput-object p1, p0, Ll/᩵ܿۜ;->᩵:[Ljava/lang/Thread;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p10, :cond_0

    .line 1300
    new-instance p3, Ll/֡ܿۜ;

    iget-object p4, p0, Ll/᩵ܿۜ;->ۡ:Ll/᩻ۜۜ;

    invoke-direct {p3, p4}, Ll/֡ܿۜ;-><init>(Ll/᩻ۜۜ;)V

    .line 1301
    new-instance p4, Ljava/lang/Thread;

    new-instance p5, Ll/ᩴܿۜ;

    invoke-direct {p5, p0, p3}, Ll/ᩴܿۜ;-><init>(Ll/᩵ܿۜ;Ll/֡ܿۜ;)V

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p6, "MT MCP Smali Search #"

    invoke-direct {p3, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 p6, p2, 0x1

    invoke-virtual {p3, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p4, p5, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 1302
    aput-object p4, p1, p2

    .line 1303
    invoke-virtual {p4}, Ljava/lang/Thread;->start()V

    move p2, p6

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(Ll/ܳܿۜ;)V
    .locals 5

    .line 1343
    iget-object v0, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    monitor-enter v0

    .line 1344
    :try_start_0
    iget v1, p1, Ll/ܳܿۜ;->֫:I

    rem-int/lit8 v1, v1, 0x10

    .line 1345
    :goto_0
    iget-boolean v2, p0, Ll/᩵ܿۜ;->ۖ:Z

    const/4 v3, 0x1

    if-nez v2, :cond_0

    iget-object v4, p0, Ll/᩵ܿۜ;->ᩳ:[Ll/ܳܿۜ;

    aget-object v4, v4, v1

    if-eqz v4, :cond_0

    .line 1391
    iget-object v2, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1393
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->interrupt()V

    .line 1394
    iput-boolean v3, p0, Ll/᩵ܿۜ;->ۖ:Z

    .line 1395
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    .line 1349
    monitor-exit v0

    return-void

    .line 1351
    :cond_1
    iget-object v2, p0, Ll/᩵ܿۜ;->ᩳ:[Ll/ܳܿۜ;

    aput-object p1, v2, v1

    .line 1352
    iget-object p1, p1, Ll/ܳܿۜ;->ۧ:Ljava/lang/Throwable;

    if-eqz p1, :cond_2

    .line 1353
    iput-boolean v3, p0, Ll/᩵ܿۜ;->ۘ:Z

    .line 1355
    :cond_2
    iget-object p1, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 1356
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static ֫(Ll/᩵ܿۜ;Ll/֡ܿۜ;)V
    .locals 11

    .line 1326
    :goto_0
    iget-object v0, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    monitor-enter v0

    .line 1328
    :goto_1
    :try_start_0
    iget-boolean v1, p0, Ll/᩵ܿۜ;->ۖ:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ll/᩵ܿۜ;->ۘ:Z

    if-nez v1, :cond_2

    iget v1, p0, Ll/᩵ܿۜ;->ۜ:I

    iget v2, p0, Ll/᩵ܿۜ;->ܿ:I

    if-lt v1, v2, :cond_0

    goto :goto_2

    .line 1331
    :cond_0
    iget v2, p0, Ll/᩵ܿۜ;->᩷:I

    add-int/lit8 v2, v2, 0x10

    if-ge v1, v2, :cond_1

    add-int/lit8 v2, v1, 0x1

    .line 1332
    iput v2, p0, Ll/᩵ܿۜ;->ۜ:I

    monitor-exit v0

    move v8, v1

    goto :goto_3

    .line 1391
    :cond_1
    iget-object v1, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 1393
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    const/4 v2, 0x1

    .line 1394
    iput-boolean v2, p0, Ll/᩵ܿۜ;->ۖ:Z

    .line 1395
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_1

    .line 1329
    :cond_2
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, -0x1

    const/4 v8, -0x1

    :goto_3
    if-gez v8, :cond_3

    return-void

    .line 1316
    :cond_3
    iget-object v2, p0, Ll/᩵ܿۜ;->ᩴ:Ll/ۚܿۜ;

    iget-object v3, p0, Ll/᩵ܿۜ;->֡:Ll/ܳ᩻ۜ;

    iget-object v4, p0, Ll/᩵ܿۜ;->ۡ:Ll/᩻ۜۜ;

    iget-object v5, p0, Ll/᩵ܿۜ;->ۢ:Ll/֫۟᩻;

    iget-object v6, p0, Ll/᩵ܿۜ;->ܳ:Ljava/util/ArrayList;

    iget-object v9, p0, Ll/᩵ܿۜ;->ܽ:Ll/ۢ᩺᩻;

    iget-object v10, p0, Ll/᩵ܿۜ;->ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    move-object v7, p1

    invoke-static/range {v2 .. v10}, Ll/ۚܿۜ;->֫(Ll/ۚܿۜ;Ll/ܳ᩻ۜ;Ll/᩻ۜۜ;Ll/֫۟᩻;Ljava/util/ArrayList;Ll/֡ܿۜ;ILl/ۢ᩺᩻;Ljava/util/concurrent/atomic/AtomicBoolean;)Ll/ܳܿۜ;

    move-result-object v0

    .line 1318
    invoke-direct {p0, v0}, Ll/᩵ܿۜ;->֫(Ll/ܳܿۜ;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 1336
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method private ܽ()V
    .locals 2

    .line 1416
    iget-object v0, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 1417
    :try_start_0
    iput-boolean v1, p0, Ll/᩵ܿۜ;->ۘ:Z

    .line 1418
    iget-object v1, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 1419
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private ᩳ()Ll/ܳܿۜ;
    .locals 6

    .line 1363
    iget-object v0, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    monitor-enter v0

    .line 1365
    :goto_0
    :try_start_0
    iget v1, p0, Ll/᩵ܿۜ;->᩷:I

    rem-int/lit8 v2, v1, 0x10

    .line 1366
    iget-object v3, p0, Ll/᩵ܿۜ;->ᩳ:[Ll/ܳܿۜ;

    aget-object v4, v3, v2

    if-eqz v4, :cond_1

    .line 1368
    iget v5, v4, Ll/ܳܿۜ;->֫:I

    if-ne v5, v1, :cond_0

    const/4 v5, 0x0

    .line 1372
    aput-object v5, v3, v2

    add-int/lit8 v1, v1, 0x1

    .line 1373
    iput v1, p0, Ll/᩵ܿۜ;->᩷:I

    .line 1374
    iget-object v1, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 1375
    monitor-exit v0

    return-object v4

    :cond_0
    const-string v1, "SMALI_READ_FAILED"

    const-string v2, "Smali search result window is out of order"

    .line 1369
    invoke-static {v1, v2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    throw v1

    .line 1377
    :cond_1
    iget-boolean v1, p0, Ll/᩵ܿۜ;->ۖ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_2

    .line 1404
    :try_start_1
    iget-object v1, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1406
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    const-string v1, "SMALI_READ_FAILED"

    const-string v2, "Interrupted while searching smali"

    .line 1407
    invoke-static {v1, v2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    throw v1

    :cond_2
    const-string v1, "SMALI_READ_FAILED"

    const-string v2, "Smali search worker stopped"

    .line 1378
    invoke-static {v1, v2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    throw v1

    :catchall_0
    move-exception v1

    .line 1383
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 1426
    iget-object v0, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 1427
    :try_start_0
    iput-boolean v1, p0, Ll/᩵ܿۜ;->ۖ:Z

    .line 1428
    iput-boolean v1, p0, Ll/᩵ܿۜ;->ۘ:Z

    .line 1429
    iget-object v1, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 1430
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1438
    iget-object v0, p0, Ll/᩵ܿۜ;->᩵:[Ljava/lang/Thread;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    const/4 v4, 0x0

    .line 1445
    :goto_1
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v4, :cond_1

    .line 1452
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 1430
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ۧ()Z
    .locals 4

    .line 1280
    :cond_0
    iget-object v0, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    monitor-enter v0

    .line 1281
    :try_start_0
    iget v1, p0, Ll/᩵ܿۜ;->᩷:I

    iget v2, p0, Ll/᩵ܿۜ;->ܿ:I

    const/4 v3, 0x1

    if-lt v1, v2, :cond_1

    .line 1282
    iput-boolean v3, p0, Ll/᩵ܿۜ;->ۘ:Z

    .line 1283
    iget-object v1, p0, Ll/᩵ܿۜ;->᩻:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    const/4 v1, 0x0

    .line 1284
    monitor-exit v0

    return v1

    .line 1286
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1287
    invoke-direct {p0}, Ll/᩵ܿۜ;->ᩳ()Ll/ܳܿۜ;

    move-result-object v0

    .line 1288
    iget-object v1, p0, Ll/᩵ܿۜ;->֫:Ll/ۘܿۜ;

    iget v2, p0, Ll/᩵ܿۜ;->ܺ:I

    invoke-static {v1, v2, v0}, Ll/ۚܿۜ;->֫(Ll/ۘܿۜ;ILl/ܳܿۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1289
    invoke-direct {p0}, Ll/᩵ܿۜ;->ܽ()V

    return v3

    :catchall_0
    move-exception v1

    .line 1286
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
