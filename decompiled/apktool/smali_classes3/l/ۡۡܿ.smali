.class public final Ll/ۡۡܿ;
.super Ljava/lang/Object;
.source "C6VW"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩸:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 10

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 15
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, p0, Ll/ۡۡܿ;->᩹:I

    .line 16
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 17
    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v8, Ll/ۢۡܿ;

    invoke-direct {v8, p1}, Ll/ۢۡܿ;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;)V

    const-wide/16 v4, 0x1e

    move-object v1, v9

    move v2, v3

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v9, p0, Ll/ۡۡܿ;->᩸:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 20
    invoke-virtual {v9, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ۡۡܿ;->᩸:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    return-void
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۡۡܿ;->᩸:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
