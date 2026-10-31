.class public final Ll/ۙ֨ۢ;
.super Ljava/lang/Object;
.source "B9B2"

# interfaces
.implements Ll/ۛ᩶۠;


# instance fields
.field public final ֫:Ljava/util/concurrent/CountDownLatch;

.field public volatile ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 348
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 342
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Ll/ۙ֨ۢ;->֫:Ljava/util/concurrent/CountDownLatch;

    const/high16 v0, -0x80000000

    .line 343
    iput v0, p0, Ll/ۙ֨ۢ;->ۧ:I

    const/16 v0, 0x5348

    .line 349
    iput v0, p0, Ll/ۙ֨ۢ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 1

    .line 357
    iget v0, p0, Ll/ۙ֨ۢ;->ܽ:I

    if-eq v0, p1, :cond_0

    return-void

    .line 360
    :cond_0
    iput p2, p0, Ll/ۙ֨ۢ;->ۧ:I

    .line 361
    iget-object p1, p0, Ll/ۙ֨ۢ;->֫:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 393
    iget v0, p0, Ll/ۙ֨ۢ;->ۧ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(J)Z
    .locals 5

    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    .line 369
    iget-object v3, p0, Ll/ۙ֨ۢ;->֫:Ljava/util/concurrent/CountDownLatch;

    cmp-long v4, p1, v0

    if-lez v4, :cond_0

    .line 370
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, p1, p2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    return v2

    .line 373
    :cond_0
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    .line 377
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 386
    iget v0, p0, Ll/ۙ֨ۢ;->ۧ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
