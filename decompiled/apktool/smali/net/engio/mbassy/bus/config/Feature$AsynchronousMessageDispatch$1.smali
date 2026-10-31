.class public final Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch$1;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final threadID:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch$1;->threadID:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 124
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p1

    const/4 v0, 0x1

    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Dispatcher-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch$1;->threadID:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-object p1
.end method
