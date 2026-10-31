.class public final Ll/ᩳ۟ۖ;
.super Ljava/lang/Object;
.source "43Q0"


# direct methods
.method public static ֫(JLjava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 2

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    sget-object v1, Ll/ۖ۟ۖ;->᩸:Ll/ܽ۟ۖ;

    .line 42
    :try_start_0
    invoke-interface {p2, p0, p1, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 47
    :goto_0
    invoke-interface {v1, p0}, Ll/ܽ۟ۖ;->֫(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :catch_2
    move-exception p0

    .line 44
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 45
    invoke-interface {v1, p0}, Ll/ܽ۟ۖ;->֫(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method
