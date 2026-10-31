.class public final Ll/ۤۢ֨;
.super Ll/ۛۢ֨;
.source "Z4KI"


# virtual methods
.method public final ֫()V
    .locals 7

    .line 17
    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-object v1, v0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    iget-object v0, v0, Ll/֫ۢ֨;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v0}, Lpl/droidsonroids/gif/GifInfoHandle;->֫(Landroid/graphics/Bitmap;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_3

    .line 19
    iget-object v4, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    add-long/2addr v5, v0

    iput-wide v5, v4, Ll/֫ۢ֨;->ۛ:J

    .line 20
    iget-object v4, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-boolean v4, v4, Ll/֫ۢ֨;->۬:Z

    if-eqz v4, :cond_0

    iget-object v4, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-boolean v5, v4, Ll/֫ۢ֨;->ۗ:Z

    if-nez v5, :cond_0

    .line 21
    iget-object v4, v4, Ll/֫ۢ֨;->᩶:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v4, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    .line 22
    iget-object v4, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-object v5, v4, Ll/֫ۢ֨;->᩶:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, p0, v0, v1, v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, v4, Ll/֫ۢ֨;->ܰ:Ljava/util/concurrent/ScheduledFuture;

    .line 24
    :cond_0
    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-object v0, v0, Ll/֫ۢ֨;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    .line 937
    iget-object v0, v0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ۧ()I

    move-result v0

    .line 24
    iget-object v1, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-object v1, v1, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v1}, Lpl/droidsonroids/gif/GifInfoHandle;->ۢ()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_4

    .line 25
    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-object v1, v0, Ll/֫ۢ֨;->ۙ:Ll/ۗۢ֨;

    .line 947
    iget-object v0, v0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ܽ()I

    move-result v4

    if-eqz v4, :cond_2

    .line 948
    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->᩻()I

    move-result v0

    if-ge v4, v0, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v4, -0x1

    .line 25
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-wide v5, v0, Ll/֫ۢ֨;->ۛ:J

    invoke-virtual {v1, v4, v5, v6}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    goto :goto_1

    .line 28
    :cond_3
    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    const-wide/high16 v4, -0x8000000000000000L

    iput-wide v4, v0, Ll/֫ۢ֨;->ۛ:J

    const/4 v1, 0x0

    .line 29
    iput-boolean v1, v0, Ll/֫ۢ֨;->۬:Z

    .line 31
    :cond_4
    :goto_1
    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-object v0, v0, Ll/֫ۢ֨;->ۙ:Ll/ۗۢ֨;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_5

    .line 32
    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-object v0, v0, Ll/֫ۢ֨;->ۙ:Ll/ۗۢ֨;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    :cond_5
    return-void
.end method
