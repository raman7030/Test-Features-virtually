.class public final Ll/ۚ᩶ܿ;
.super Ljava/lang/Object;
.source "N17O"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/᩵᩶ܿ;

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/᩵᩶ܿ;I)V
    .locals 0

    .line 349
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 351
    iput-object p1, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    .line 352
    iput p2, p0, Ll/ۚ᩶ܿ;->ܽ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚ᩶ܿ;)Ll/᩵᩶ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    return-object p0
.end method

.method private ܿ()V
    .locals 2

    .line 356
    iget-boolean v0, p0, Ll/ۚ᩶ܿ;->֫:Z

    if-nez v0, :cond_0

    return-void

    .line 357
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫([BII)I
    .locals 9

    .line 362
    invoke-direct {p0}, Ll/ۚ᩶ܿ;->ܿ()V

    .line 363
    iget-object v6, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    iget v7, p0, Ll/ۚ᩶ܿ;->ܽ:I

    .line 810
    new-instance v8, Ll/۬᩹ܿ;

    move-object v0, v8

    move-object v1, v6

    move v2, v7

    move v3, p3

    move v4, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll/۬᩹ܿ;-><init>(Ll/᩵᩶ܿ;III[B)V

    .line 1727
    iget-object v0, v6, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    .line 1729
    :try_start_0
    iget-object v3, v6, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1733
    iget-object v3, v6, Ll/᩵᩶ܿ;->ۨ:Ll/ۙ᩸ܿ;

    invoke-interface {v3}, Ll/ۙ᩸ܿ;->ۨۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Ll/ۧۨۡ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1734
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ll/ܰܶܿ;

    const/4 p3, 0x1

    invoke-direct {p2, p3, v8}, Ll/ܰܶܿ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1736
    :try_start_1
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 1738
    :try_start_2
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v0

    .line 1741
    :cond_0
    invoke-static {v6, v7, p3, p2, p1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;III[B)I

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1750
    :goto_0
    iget-object p2, v6, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1751
    iput-wide v1, v6, Ll/᩵᩶ܿ;->۬:J

    return p1

    .line 1730
    :cond_1
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Connection closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 1832
    :try_start_4
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 1750
    iget-object p2, v6, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1751
    iput-wide v1, v6, Ll/᩵᩶ܿ;->۬:J

    .line 1752
    throw p1
.end method

.method public final ֫()V
    .locals 2

    .line 377
    iget-boolean v0, p0, Ll/ۚ᩶ܿ;->֫:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 378
    iput-boolean v0, p0, Ll/ۚ᩶ܿ;->֫:Z

    .line 379
    iget-object v0, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    iget v1, p0, Ll/ۚ᩶ܿ;->ܽ:I

    invoke-virtual {v0, v1}, Ll/᩵᩶ܿ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final ֫(J)V
    .locals 2

    .line 389
    invoke-direct {p0}, Ll/ۚ᩶ܿ;->ܿ()V

    .line 390
    iget-object v0, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    iget v1, p0, Ll/ۚ᩶ܿ;->ܽ:I

    invoke-virtual {v0, v1, p1, p2}, Ll/᩵᩶ܿ;->֫(IJ)V

    return-void
.end method

.method public final ۧ()J
    .locals 2

    .line 394
    invoke-direct {p0}, Ll/ۚ᩶ܿ;->ܿ()V

    .line 395
    iget-object v0, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    iget v1, p0, Ll/ۚ᩶ܿ;->ܽ:I

    invoke-virtual {v0, v1}, Ll/᩵᩶ܿ;->ۧ(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(J)V
    .locals 2

    .line 399
    invoke-direct {p0}, Ll/ۚ᩶ܿ;->ܿ()V

    .line 400
    iget-object v0, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    iget v1, p0, Ll/ۚ᩶ܿ;->ܽ:I

    invoke-virtual {v0, v1, p1, p2}, Ll/᩵᩶ܿ;->ۧ(IJ)V

    return-void
.end method

.method public final ۧ([BII)V
    .locals 2

    .line 367
    invoke-direct {p0}, Ll/ۚ᩶ܿ;->ܿ()V

    .line 368
    iget-object v0, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    iget v1, p0, Ll/ۚ᩶ܿ;->ܽ:I

    invoke-virtual {v0, v1, p1, p2, p3}, Ll/᩵᩶ܿ;->ۧ(I[BII)V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 372
    invoke-direct {p0}, Ll/ۚ᩶ܿ;->ܿ()V

    .line 373
    iget-object v0, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    iget v1, p0, Ll/ۚ᩶ܿ;->ܽ:I

    invoke-virtual {v0, v1}, Ll/᩵᩶ܿ;->ܽ(I)V

    return-void
.end method

.method public final ᩳ()J
    .locals 2

    .line 384
    invoke-direct {p0}, Ll/ۚ᩶ܿ;->ܿ()V

    .line 385
    iget-object v0, p0, Ll/ۚ᩶ܿ;->ۧ:Ll/᩵᩶ܿ;

    iget v1, p0, Ll/ۚ᩶ܿ;->ܽ:I

    invoke-virtual {v0, v1}, Ll/᩵᩶ܿ;->ᩳ(I)J

    move-result-wide v0

    return-wide v0
.end method
