.class public final Ll/֫ᩳ᩵;
.super Ljava/util/concurrent/CountedCompleter;
.source "N673"


# instance fields
.field public final a:Ll/ۡ᩺ᩴ;

.field public b:Ll/ܶ۫ᩴ;

.field public final c:J

.field public final d:Ll/ۧۤᩴ;

.field public final e:Ll/᩶ܽ᩵;

.field public final f:Ll/֫ᩳ᩵;

.field public g:Ll/ۚ۟ᩴ;


# direct methods
.method public constructor <init>(Ll/֫ᩳ᩵;Ll/ܶ۫ᩴ;Ll/֫ᩳ᩵;)V
    .locals 2

    .line 388
    invoke-direct {p0, p1}, Ljava/util/concurrent/CountedCompleter;-><init>(Ljava/util/concurrent/CountedCompleter;)V

    .line 389
    iget-object v0, p1, Ll/֫ᩳ᩵;->a:Ll/ۡ᩺ᩴ;

    iput-object v0, p0, Ll/֫ᩳ᩵;->a:Ll/ۡ᩺ᩴ;

    .line 390
    iput-object p2, p0, Ll/֫ᩳ᩵;->b:Ll/ܶ۫ᩴ;

    .line 391
    iget-wide v0, p1, Ll/֫ᩳ᩵;->c:J

    iput-wide v0, p0, Ll/֫ᩳ᩵;->c:J

    .line 392
    iget-object p2, p1, Ll/֫ᩳ᩵;->d:Ll/ۧۤᩴ;

    iput-object p2, p0, Ll/֫ᩳ᩵;->d:Ll/ۧۤᩴ;

    .line 393
    iget-object p1, p1, Ll/֫ᩳ᩵;->e:Ll/᩶ܽ᩵;

    iput-object p1, p0, Ll/֫ᩳ᩵;->e:Ll/᩶ܽ᩵;

    .line 394
    iput-object p3, p0, Ll/֫ᩳ᩵;->f:Ll/֫ᩳ᩵;

    return-void
.end method

.method public constructor <init>(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ll/᩶ܽ᩵;)V
    .locals 2

    const/4 v0, 0x0

    .line 375
    invoke-direct {p0, v0}, Ljava/util/concurrent/CountedCompleter;-><init>(Ljava/util/concurrent/CountedCompleter;)V

    .line 376
    iput-object p1, p0, Ll/֫ᩳ᩵;->a:Ll/ۡ᩺ᩴ;

    .line 377
    iput-object p2, p0, Ll/֫ᩳ᩵;->b:Ll/ܶ۫ᩴ;

    .line 378
    invoke-interface {p2}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide p1

    invoke-static {p1, p2}, Ll/۬ܰᩴ;->e(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/֫ᩳ᩵;->c:J

    .line 380
    new-instance p1, Ll/ۧۤᩴ;

    .line 168
    sget p2, Ll/۬ܰᩴ;->g:I

    shl-int/lit8 p2, p2, 0x1

    const/16 v1, 0x10

    .line 380
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-direct {p1, p2}, Ll/ۧۤᩴ;-><init>(I)V

    iput-object p1, p0, Ll/֫ᩳ᩵;->d:Ll/ۧۤᩴ;

    .line 381
    iput-object p3, p0, Ll/֫ᩳ᩵;->e:Ll/᩶ܽ᩵;

    .line 382
    iput-object v0, p0, Ll/֫ᩳ᩵;->f:Ll/֫ᩳ᩵;

    return-void
.end method


# virtual methods
.method public final compute()V
    .locals 10

    .line 403
    iget-object v0, p0, Ll/֫ᩳ᩵;->b:Ll/ܶ۫ᩴ;

    .line 404
    iget-wide v1, p0, Ll/֫ᩳ᩵;->c:J

    const/4 v3, 0x0

    move-object v4, p0

    .line 406
    :goto_0
    invoke-interface {v0}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v5

    cmp-long v7, v5, v1

    if-lez v7, :cond_3

    .line 407
    invoke-interface {v0}, Ll/ܶ۫ᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 408
    new-instance v6, Ll/֫ᩳ᩵;

    iget-object v7, v4, Ll/֫ᩳ᩵;->f:Ll/֫ᩳ᩵;

    invoke-direct {v6, v4, v5, v7}, Ll/֫ᩳ᩵;-><init>(Ll/֫ᩳ᩵;Ll/ܶ۫ᩴ;Ll/֫ᩳ᩵;)V

    .line 410
    new-instance v7, Ll/֫ᩳ᩵;

    invoke-direct {v7, v4, v0, v6}, Ll/֫ᩳ᩵;-><init>(Ll/֫ᩳ᩵;Ll/ܶ۫ᩴ;Ll/֫ᩳ᩵;)V

    const/4 v8, 0x1

    .line 416
    invoke-virtual {v4, v8}, Ljava/util/concurrent/CountedCompleter;->addToPendingCount(I)V

    .line 419
    invoke-virtual {v7, v8}, Ljava/util/concurrent/CountedCompleter;->addToPendingCount(I)V

    .line 420
    iget-object v9, v4, Ll/֫ᩳ᩵;->d:Ll/ۧۤᩴ;

    invoke-virtual {v9, v6, v7}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    iget-object v9, v4, Ll/֫ᩳ᩵;->f:Ll/֫ᩳ᩵;

    if-eqz v9, :cond_1

    .line 433
    invoke-virtual {v6, v8}, Ljava/util/concurrent/CountedCompleter;->addToPendingCount(I)V

    .line 436
    iget-object v8, v4, Ll/֫ᩳ᩵;->d:Ll/ۧۤᩴ;

    iget-object v9, v4, Ll/֫ᩳ᩵;->f:Ll/֫ᩳ᩵;

    invoke-virtual {v8, v9, v4, v6}, Ll/ۧۤᩴ;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const/4 v9, -0x1

    if-eqz v8, :cond_0

    .line 439
    invoke-virtual {v4, v9}, Ljava/util/concurrent/CountedCompleter;->addToPendingCount(I)V

    goto :goto_1

    .line 444
    :cond_0
    invoke-virtual {v6, v9}, Ljava/util/concurrent/CountedCompleter;->addToPendingCount(I)V

    :cond_1
    :goto_1
    if-eqz v3, :cond_2

    move-object v0, v5

    move-object v4, v6

    move-object v6, v7

    goto :goto_2

    :cond_2
    move-object v4, v7

    :goto_2
    xor-int/lit8 v3, v3, 0x1

    .line 460
    invoke-virtual {v6}, Ljava/util/concurrent/CountedCompleter;->fork()Ljava/util/concurrent/ForkJoinTask;

    goto :goto_0

    .line 471
    :cond_3
    invoke-virtual {v4}, Ljava/util/concurrent/CountedCompleter;->getPendingCount()I

    move-result v1

    if-lez v1, :cond_4

    .line 475
    new-instance v1, Ll/ۧۧ᩵;

    const/16 v2, 0x13

    .line 0
    invoke-direct {v1, v2}, Ll/ۧۧ᩵;-><init>(I)V

    .line 476
    iget-object v2, v4, Ll/֫ᩳ᩵;->a:Ll/ۡ᩺ᩴ;

    .line 477
    invoke-virtual {v2, v0}, Ll/ۡ᩺ᩴ;->R(Ll/ܶ۫ᩴ;)J

    move-result-wide v5

    .line 476
    invoke-virtual {v2, v5, v6, v1}, Ll/ۡ᩺ᩴ;->c0(JLjava/util/function/IntFunction;)Ll/ۡܳ᩵;

    move-result-object v1

    .line 479
    iget-object v2, v4, Ll/֫ᩳ᩵;->a:Ll/ۡ᩺ᩴ;

    invoke-virtual {v2, v0, v1}, Ll/ۡ᩺ᩴ;->f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    invoke-interface {v1}, Ll/ۡܳ᩵;->build()Ll/ۚ۟ᩴ;

    move-result-object v0

    iput-object v0, v4, Ll/֫ᩳ᩵;->g:Ll/ۚ۟ᩴ;

    const/4 v0, 0x0

    .line 480
    iput-object v0, v4, Ll/֫ᩳ᩵;->b:Ll/ܶ۫ᩴ;

    .line 482
    :cond_4
    invoke-virtual {v4}, Ljava/util/concurrent/CountedCompleter;->tryComplete()V

    return-void
.end method

.method public final onCompletion(Ljava/util/concurrent/CountedCompleter;)V
    .locals 3

    .line 487
    iget-object p1, p0, Ll/֫ᩳ᩵;->g:Ll/ۚ۟ᩴ;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 489
    iget-object v1, p0, Ll/֫ᩳ᩵;->e:Ll/᩶ܽ᩵;

    invoke-interface {p1, v1}, Ll/ۚ۟ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 490
    iput-object v0, p0, Ll/֫ᩳ᩵;->g:Ll/ۚ۟ᩴ;

    goto :goto_0

    .line 492
    :cond_0
    iget-object p1, p0, Ll/֫ᩳ᩵;->b:Ll/ܶ۫ᩴ;

    if-eqz p1, :cond_1

    .line 494
    iget-object v1, p0, Ll/֫ᩳ᩵;->a:Ll/ۡ᩺ᩴ;

    iget-object v2, p0, Ll/֫ᩳ᩵;->e:Ll/᩶ܽ᩵;

    invoke-virtual {v1, p1, v2}, Ll/ۡ᩺ᩴ;->f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    .line 495
    iput-object v0, p0, Ll/֫ᩳ᩵;->b:Ll/ܶ۫ᩴ;

    .line 502
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/֫ᩳ᩵;->d:Ll/ۧۤᩴ;

    invoke-virtual {p1, p0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ᩳ᩵;

    if-eqz p1, :cond_2

    .line 504
    invoke-virtual {p1}, Ljava/util/concurrent/CountedCompleter;->tryComplete()V

    :cond_2
    return-void
.end method
