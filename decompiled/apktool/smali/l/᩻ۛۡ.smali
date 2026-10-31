.class public final Ll/᩻ۛۡ;
.super Ljava/lang/Object;
.source "9975"


# direct methods
.method public static ֫(Ljava/lang/Process;J)Z
    .locals 9

    .line 10
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 14
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    .line 15
    invoke-virtual {p0, p1, p2, v0}, Ljava/lang/Process;->waitFor(JLjava/util/concurrent/TimeUnit;)Z

    move-result p0

    return p0

    .line 17
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    .line 18
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    .line 22
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Process;->exitValue()I
    :try_end_0
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    goto :goto_0

    :catch_0
    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-lez v7, :cond_2

    .line 26
    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    invoke-virtual {v7, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    const-wide/16 v7, 0x1

    add-long/2addr v3, v7

    const-wide/16 v7, 0x64

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    .line 26
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 29
    :cond_2
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    sub-long/2addr v7, v1

    sub-long/2addr v3, v7

    cmp-long v7, v3, v5

    if-gtz v7, :cond_1

    const/4 p0, 0x0

    :goto_0
    return p0
.end method
