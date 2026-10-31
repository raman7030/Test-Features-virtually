.class public final Ll/᩻֡ᩳ;
.super Ljava/lang/Object;
.source "P6RO"


# static fields
.field public static final ֫:Ll/ۜ֡ᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 40
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 41
    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v1, 0x100

    invoke-direct {v7, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    new-instance v8, Ll/ܳ֡ᩳ;

    invoke-direct {v8, v0}, Ll/ܳ֡ᩳ;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;)V

    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;

    invoke-direct {v9}, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x2

    const-wide/16 v4, 0x1e

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    const/4 v0, 0x1

    .line 47
    invoke-virtual {v10, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 48
    new-instance v0, Ll/ۜ֡ᩳ;

    new-instance v1, Ll/֨۬ᩳ;

    const-wide/32 v2, 0x2000000

    invoke-direct {v1, v2, v3}, Ll/֨۬ᩳ;-><init>(J)V

    new-instance v2, Ll/ۙ۬ᩳ;

    invoke-direct {v2}, Ll/ۙ۬ᩳ;-><init>()V

    invoke-direct {v0, v1, v2, v10}, Ll/ۜ֡ᩳ;-><init>(Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;)V

    .line 52
    sput-object v0, Ll/᩻֡ᩳ;->֫:Ll/ۜ֡ᩳ;

    return-void
.end method
