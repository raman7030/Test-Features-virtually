.class public final Ll/ۖ֡ۢ;
.super Ljava/lang/Object;
.source "T7B2"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    .line 730
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Remote LAN KeepAlive #"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ll/᩵֡ۢ;->ᩳ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 731
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method
