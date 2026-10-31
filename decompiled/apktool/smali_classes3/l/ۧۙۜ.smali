.class public final Ll/ۧۙۜ;
.super Ljava/lang/Object;
.source "B74E"


# static fields
.field public static final ֫:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 13
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x4

    const-wide/16 v3, 0xa

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v7, Ll/ۧۙۜ;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static ֫()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 1

    .line 25
    sget-object v0, Ll/ۧۙۜ;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method
