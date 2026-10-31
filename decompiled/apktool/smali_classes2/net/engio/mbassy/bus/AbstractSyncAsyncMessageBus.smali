.class public abstract Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;
.super Lnet/engio/mbassy/bus/AbstractPubSubSupport;
.source "AbstractSyncAsyncMessageBus.java"

# interfaces
.implements Lnet/engio/mbassy/bus/common/IMessageBus;


# instance fields
.field public final dispatchers:Ljava/util/List;

.field public final executor:Ljava/util/concurrent/ExecutorService;

.field public final pendingMessages:Ljava/util/concurrent/BlockingQueue;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V
    .locals 3

    .line 35
    invoke-direct {p0, p1}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;-><init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V

    .line 38
    const-class v0, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;

    invoke-interface {p1, v0}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->getFeature(Ljava/lang/Class;)Lnet/engio/mbassy/bus/config/Feature;

    move-result-object v1

    check-cast v1, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;

    if-eqz v1, :cond_1

    .line 42
    invoke-virtual {v1}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;->getMessageQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    iput-object v0, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->pendingMessages:Ljava/util/concurrent/BlockingQueue;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v1}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;->getNumberOfMessageDispatchers()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->dispatchers:Ljava/util/List;

    .line 44
    invoke-direct {p0, v1}, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->initDispatcherThreads(Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;)V

    .line 47
    const-class v0, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;

    invoke-interface {p1, v0}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->getFeature(Ljava/lang/Class;)Lnet/engio/mbassy/bus/config/Feature;

    move-result-object p1

    check-cast p1, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;

    if-eqz p1, :cond_0

    .line 51
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->executor:Ljava/util/concurrent/ExecutorService;

    .line 52
    invoke-virtual {p0}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->getRuntime()Lnet/engio/mbassy/bus/BusRuntime;

    move-result-object v0

    const-string v1, "bus.handlers.async-executor"

    invoke-virtual {v0, v1, p1}, Lnet/engio/mbassy/bus/BusRuntime;->add(Ljava/lang/String;Ljava/lang/Object;)Lnet/engio/mbassy/bus/BusRuntime;

    return-void

    .line 49
    :cond_0
    invoke-static {v0}, Lnet/engio/mbassy/bus/config/ConfigurationError;->MissingFeature(Ljava/lang/Class;)Lnet/engio/mbassy/bus/config/ConfigurationError;

    move-result-object p1

    throw p1

    .line 40
    :cond_1
    invoke-static {v0}, Lnet/engio/mbassy/bus/config/ConfigurationError;->MissingFeature(Ljava/lang/Class;)Lnet/engio/mbassy/bus/config/ConfigurationError;

    move-result-object p1

    throw p1
.end method

.method public static synthetic access$000(Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    .line 22
    iget-object p0, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->pendingMessages:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method

.method private initDispatcherThreads(Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;)V
    .locals 4

    const/4 v0, 0x0

    .line 58
    :goto_0
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;->getNumberOfMessageDispatchers()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 61
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;->getDispatcherThreadFactory()Ljava/util/concurrent/ThreadFactory;

    move-result-object v1

    new-instance v2, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus$1;

    invoke-direct {v2, p0}, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus$1;-><init>(Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v1

    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MsgDispatcher-"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 78
    iget-object v2, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->dispatchers:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public addAsynchronousPublication(Lnet/engio/mbassy/bus/MessagePublication;)Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 3

    .line 87
    :try_start_0
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->pendingMessages:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 88
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/MessagePublication;->markScheduled()Lnet/engio/mbassy/bus/MessagePublication;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 90
    new-instance v1, Lnet/engio/mbassy/bus/error/InternalPublicationError;

    const-string v2, "Error while adding an asynchronous message publication"

    invoke-direct {v1, v0, v2, p1}, Lnet/engio/mbassy/bus/error/InternalPublicationError;-><init>(Ljava/lang/Throwable;Ljava/lang/String;Lnet/engio/mbassy/bus/IMessagePublication;)V

    invoke-virtual {p0, v1}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->handlePublicationError(Lnet/engio/mbassy/bus/error/PublicationError;)V

    return-object p1
.end method

.method public addAsynchronousPublication(Lnet/engio/mbassy/bus/MessagePublication;JLjava/util/concurrent/TimeUnit;)Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 1

    .line 98
    :try_start_0
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->pendingMessages:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 99
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/MessagePublication;->markScheduled()Lnet/engio/mbassy/bus/MessagePublication;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p2

    .line 102
    new-instance p3, Lnet/engio/mbassy/bus/error/InternalPublicationError;

    const-string p4, "Error while adding an asynchronous message publication"

    invoke-direct {p3, p2, p4, p1}, Lnet/engio/mbassy/bus/error/InternalPublicationError;-><init>(Ljava/lang/Throwable;Ljava/lang/String;Lnet/engio/mbassy/bus/IMessagePublication;)V

    invoke-virtual {p0, p3}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->handlePublicationError(Lnet/engio/mbassy/bus/error/PublicationError;)V

    return-object p1
.end method

.method public finalize()V
    .locals 0

    .line 109
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 110
    invoke-virtual {p0}, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->shutdown()V

    return-void
.end method

.method public hasPendingMessages()Z
    .locals 1

    .line 123
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->pendingMessages:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public shutdown()V
    .locals 2

    .line 115
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->dispatchers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Thread;

    .line 116
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0

    .line 118
    :cond_0
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->executor:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_1
    return-void
.end method
