.class public final Ll/ۘۧܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ll/ܺۧܳ;
.implements Ll/ۜᩳܳ;


# instance fields
.field public ۗ:[B

.field public final ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ᩶:I

.field public final ᩸:Ll/ۖۧܳ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(ILl/ۖۧܳ;Z)V
    .locals 2

    .line 6289
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6279
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/ۘۧܳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6290
    invoke-virtual {p2}, Ll/ۖۧܳ;->length()I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 6293
    iput p1, p0, Ll/ۘۧܳ;->᩹:I

    .line 6294
    iput-object p2, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    if-eqz p3, :cond_0

    const/high16 p2, 0x100000

    .line 6296
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    new-array p1, p1, [B

    iput-object p1, p0, Ll/ۘۧܳ;->ۗ:[B

    :cond_0
    return-void

    .line 6291
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Hex clipboard allocation length mismatch"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۘۧܳ;)Ll/ۖۧܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    return-object p0
.end method

.method public static ֫(I)Ll/ۘۧܳ;
    .locals 3

    if-lez p0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 6454
    invoke-static {v2, p0, v0, v1}, Ll/ۘۧܳ;->֫(Ljava/io/File;IZZ)Ll/ۘۧܳ;

    move-result-object p0

    return-object p0

    .line 6314
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Hex clipboard allocation is empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(IJLl/᩺ۧܳ;)Ll/ۘۧܳ;
    .locals 3

    .line 6327
    invoke-static {}, Ll/ᩳܽܳ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 6328
    :try_start_0
    invoke-static {}, Ll/ᩳܽܳ;->ۗ()Ll/᩺ۧܳ;

    move-result-object v1

    const/4 v2, 0x0

    if-eq v1, p3, :cond_0

    .line 6329
    monitor-exit v0

    return-object v2

    .line 6331
    :cond_0
    invoke-virtual {p3, p0, p1, p2}, Ll/᩺ۧܳ;->֫(IJ)Ll/ۖۧܳ;

    move-result-object p1

    .line 6332
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_1

    return-object v2

    .line 6337
    :cond_1
    :try_start_1
    new-instance p2, Ll/ۘۧܳ;

    const/4 p3, 0x1

    .line 6284
    invoke-direct {p2, p0, p1, p3}, Ll/ۘۧܳ;-><init>(ILl/ۖۧܳ;Z)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object p2

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 6340
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Ll/ۖۧܳ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception p1

    .line 6342
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 6344
    :goto_1
    throw p0

    :catchall_0
    move-exception p0

    .line 6332
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/io/File;I)Ll/ۘۧܳ;
    .locals 1

    const/high16 v0, 0x10000

    if-le p1, v0, :cond_1

    .line 6305
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 6454
    invoke-static {p0, p1, v0, v0}, Ll/ۘۧܳ;->֫(Ljava/io/File;IZZ)Ll/ۘۧܳ;

    move-result-object p0

    return-object p0

    .line 6306
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Hex clipboard cache directory is unavailable"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 6303
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Hex clipboard file allocation is too small"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/io/File;IZZ)Ll/ۘۧܳ;
    .locals 3

    const/4 v1, 0x0

    .line 6463
    :try_start_0
    invoke-static {}, Ll/ᩳܽܳ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 6464
    :try_start_1
    invoke-static {}, Ll/ᩳܽܳ;->ۗ()Ll/᩺ۧܳ;

    move-result-object v2

    if-nez v2, :cond_1

    if-eqz p2, :cond_0

    .line 6468
    invoke-static {p0}, Ll/᩺ۧܳ;->֫(Ljava/io/File;)Ll/᩺ۧܳ;

    move-result-object p0

    invoke-static {p0}, Ll/ᩳܽܳ;->֫(Ll/᩺ۧܳ;)V

    goto :goto_0

    .line 6466
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Hex clipboard shared arena is unavailable"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 6471
    :cond_1
    :goto_0
    invoke-static {}, Ll/ᩳܽܳ;->ۗ()Ll/᩺ۧܳ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/᩺ۧܳ;->֫(I)Ll/ۖۧܳ;

    move-result-object v1

    .line 6472
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6473
    :try_start_2
    new-instance p0, Ll/ۘۧܳ;

    invoke-direct {p0, p1, v1, p3}, Ll/ۘۧܳ;-><init>(ILl/ۖۧܳ;Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 6472
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    :goto_1
    if-eqz v1, :cond_2

    .line 6478
    :try_start_5
    invoke-virtual {v1}, Ll/ۖۧܳ;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_2

    :catch_3
    move-exception p1

    .line 6480
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 6483
    :cond_2
    :goto_2
    throw p0
.end method

.method public static ֫(Ljava/io/File;Ll/ۡᩳܳ;Ll/ܿۖ᩷;)Ll/ۘۧܳ;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 45
    :cond_0
    iget v0, p1, Ll/ۡᩳܳ;->᩻:I

    :goto_0
    if-lez v0, :cond_2

    const/4 v1, 0x1

    .line 6403
    invoke-static {p0, v0, v1, v1}, Ll/ۘۧܳ;->֫(Ljava/io/File;IZZ)Ll/ۘۧܳ;

    move-result-object p0

    .line 6406
    :try_start_0
    invoke-static {p1}, Ll/᩵ᩳܳ;->ܿ(Ll/ۡᩳܳ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ᩳܳ;

    .line 6407
    invoke-virtual {p0, v0, p2}, Ll/ۘۧܳ;->֫(Ll/᩷ᩳܳ;Ll/ܿۖ᩷;)I

    goto :goto_1

    .line 6409
    :cond_1
    invoke-virtual {p0}, Ll/ۘۧܳ;->finish()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    .line 6413
    :goto_2
    :try_start_1
    invoke-virtual {p0}, Ll/ۘۧܳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_3

    :catch_3
    move-exception p0

    .line 6415
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 6417
    :goto_3
    throw p1

    .line 6401
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Hex literal range is empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/io/File;[BIILl/ܿۖ᩷;)Ll/ۘۧܳ;
    .locals 4

    if-lez p3, :cond_4

    .line 6363
    invoke-static {p4}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p4

    .line 6364
    invoke-interface {p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 6367
    invoke-static {p0, p3, v0, v1}, Ll/ۘۧܳ;->֫(Ljava/io/File;IZZ)Ll/ۘۧܳ;

    move-result-object p0

    :goto_0
    if-ge v1, p3, :cond_1

    .line 6372
    :try_start_0
    invoke-interface {p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    const/high16 v0, 0x100000

    sub-int v2, p3, v1

    .line 6375
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 6376
    iget-object v2, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    add-int v3, p2, v1

    invoke-virtual {v2, v1, p1, v3, v0}, Ll/ۖۧܳ;->ۧ(I[BII)V

    add-int/2addr v1, v0

    goto :goto_0

    .line 6373
    :cond_0
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    .line 6380
    :cond_1
    invoke-interface {p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-nez p1, :cond_2

    .line 6383
    iput p3, p0, Ll/ۘۧܳ;->᩶:I

    return-object p0

    .line 6381
    :cond_2
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    .line 6387
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Ll/ۘۧܳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_2

    :catch_3
    move-exception p0

    .line 6389
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 6391
    :goto_2
    throw p1

    .line 6365
    :cond_3
    new-instance p0, Ll/᩻ܽܳ;

    invoke-direct {p0}, Ll/᩻ܽܳ;-><init>()V

    throw p0

    .line 6361
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Hex literal file allocation is empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/io/File;I)Ll/ۘۧܳ;
    .locals 2

    const/high16 v0, 0x10000

    if-le p1, v0, :cond_2

    .line 6427
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6432
    invoke-static {p0}, Ll/᩺ۧܳ;->֫(Ljava/io/File;)Ll/᩺ۧܳ;

    move-result-object p0

    const/4 v1, 0x0

    .line 6435
    :try_start_0
    invoke-static {}, Ll/ᩳܽܳ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 6436
    :try_start_1
    invoke-virtual {p0, p1}, Ll/᩺ۧܳ;->֫(I)Ll/ۖۧܳ;

    move-result-object v1

    .line 6437
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6438
    :try_start_2
    new-instance p0, Ll/ۘۧܳ;

    const/4 v0, 0x1

    .line 6284
    invoke-direct {p0, p1, v1, v0}, Ll/ۘۧܳ;-><init>(ILl/ۖۧܳ;Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 6437
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    :goto_0
    if-eqz v1, :cond_0

    .line 6442
    :try_start_5
    invoke-virtual {v1}, Ll/ۖۧܳ;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_1

    :catch_3
    move-exception p1

    .line 6444
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 6447
    :cond_0
    :goto_1
    throw p0

    .line 6428
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Hex clipboard cache directory is unavailable"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 6425
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Hex clipboard file allocation is too small"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ܳ()V
    .locals 1

    .line 6590
    iget-object v0, p0, Ll/ۘۧܳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    invoke-virtual {v0}, Ll/ۖۧܳ;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 6591
    :cond_0
    new-instance v0, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {v0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 6557
    iget-object v0, p0, Ll/ۘۧܳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-nez v1, :cond_0

    .line 6559
    iget-object v0, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    invoke-virtual {v0}, Ll/ۖۧܳ;->close()V

    return-void

    :cond_0
    if-ltz v1, :cond_1

    return-void

    .line 6561
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 6562
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Hex clipboard file source already closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final finish()V
    .locals 2

    .line 6515
    invoke-direct {p0}, Ll/ۘۧܳ;->ܳ()V

    .line 6516
    iget v0, p0, Ll/ۘۧܳ;->᩶:I

    iget v1, p0, Ll/ۘۧܳ;->᩹:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 6519
    iput-object v0, p0, Ll/ۘۧܳ;->ۗ:[B

    return-void

    .line 6517
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete hex clipboard file backing"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final length()I
    .locals 1

    .line 6524
    iget v0, p0, Ll/ۘۧܳ;->᩹:I

    return v0
.end method

.method public final ֫(Ll/᩷ᩳܳ;Ll/ܿۖ᩷;)I
    .locals 8

    .line 6490
    invoke-direct {p0}, Ll/ۘۧܳ;->ܳ()V

    .line 6491
    iget v0, p0, Ll/ۘۧܳ;->᩶:I

    int-to-long v1, v0

    iget v3, p1, Ll/᩷ᩳܳ;->֫:I

    iget v4, p1, Ll/᩷ᩳܳ;->֫:I

    int-to-long v5, v3

    add-long/2addr v1, v5

    iget v3, p0, Ll/ۘۧܳ;->᩹:I

    int-to-long v5, v3

    cmp-long v3, v1, v5

    if-gtz v3, :cond_3

    iget-object v1, p0, Ll/ۘۧܳ;->ۗ:[B

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v4, :cond_2

    .line 6497
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3

    if-nez v3, :cond_1

    .line 6500
    iget-object v3, p0, Ll/ۘۧܳ;->ۗ:[B

    array-length v3, v3

    sub-int v5, v4, v2

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 6501
    iget-object v5, p0, Ll/ۘۧܳ;->ۗ:[B

    invoke-virtual {p1, v2, v5, v1, v3}, Ll/᩷ᩳܳ;->֫(I[BII)V

    .line 6502
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5

    if-nez v5, :cond_0

    .line 6505
    iget v5, p0, Ll/ۘۧܳ;->᩶:I

    iget-object v6, p0, Ll/ۘۧܳ;->ۗ:[B

    .line 6233
    iget-object v7, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    invoke-virtual {v7, v5, v6, v1, v3}, Ll/ۖۧܳ;->ۧ(I[BII)V

    add-int/2addr v2, v3

    .line 6507
    iget v5, p0, Ll/ۘۧܳ;->᩶:I

    add-int/2addr v5, v3

    iput v5, p0, Ll/ۘۧܳ;->᩶:I

    goto :goto_0

    .line 6503
    :cond_0
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    .line 6498
    :cond_1
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    :cond_2
    return v0

    .line 6492
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Hex clipboard file backing overflow"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 6568
    iget-object v0, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    return-object v0
.end method

.method public final ֫(I[BII)V
    .locals 2

    .line 6530
    invoke-direct {p0}, Ll/ۘۧܳ;->ܳ()V

    .line 6531
    iget v0, p0, Ll/ۘۧܳ;->᩶:I

    iget v1, p0, Ll/ۘۧܳ;->᩹:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۘۧܳ;->ۗ:[B

    if-nez v0, :cond_0

    .line 6534
    iget-object v0, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۖۧܳ;->֫(I[BII)V

    return-void

    .line 6532
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Hex clipboard file backing is incomplete"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۫()Z
    .locals 1

    .line 6539
    iget-object v0, p0, Ll/ۘۧܳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    invoke-virtual {v0}, Ll/ۖۧܳ;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 6586
    iget-object v0, p0, Ll/ۘۧܳ;->᩸:Ll/ۖۧܳ;

    invoke-virtual {v0}, Ll/ۖۧܳ;->length()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ܿ()J
    .locals 2

    .line 6574
    iget v0, p0, Ll/ۘۧܳ;->᩹:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 6574
    iget v0, p0, Ll/ۘۧܳ;->᩹:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ᩺ۧ()Ll/ᩴܽܳ;
    .locals 8

    .line 6545
    :cond_0
    iget-object v0, p0, Ll/ۘۧܳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_2

    int-to-long v2, v1

    const/4 v4, 0x1

    int-to-long v4, v4

    add-long/2addr v2, v4

    long-to-int v4, v2

    int-to-long v5, v4

    cmp-long v7, v2, v5

    if-nez v7, :cond_1

    .line 6549
    invoke-virtual {v0, v1, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 0
    :cond_1
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 6547
    :cond_2
    new-instance v0, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {v0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw v0
.end method
