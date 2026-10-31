.class public Lnet/engio/mbassy/bus/MBassador;
.super Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;
.source "MBassador.java"

# interfaces
.implements Lnet/engio/mbassy/bus/common/IMessageBus;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 21
    new-instance v0, Lnet/engio/mbassy/bus/config/BusConfiguration;

    invoke-direct {v0}, Lnet/engio/mbassy/bus/config/BusConfiguration;-><init>()V

    .line 22
    invoke-static {}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->Default()Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/config/BusConfiguration;->addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;

    move-result-object v0

    .line 23
    invoke-static {}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;->Default()Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;

    move-result-object v0

    .line 24
    invoke-static {}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;->Default()Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;

    move-result-object v0

    .line 21
    invoke-direct {p0, v0}, Lnet/engio/mbassy/bus/MBassador;-><init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V

    return-void
.end method

.method public constructor <init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;-><init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V

    return-void
.end method

.method public constructor <init>(Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;)V
    .locals 2

    .line 33
    new-instance v0, Lnet/engio/mbassy/bus/config/BusConfiguration;

    invoke-direct {v0}, Lnet/engio/mbassy/bus/config/BusConfiguration;-><init>()V

    invoke-static {}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->Default()Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/config/BusConfiguration;->addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;

    move-result-object v0

    .line 34
    invoke-static {}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;->Default()Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;

    move-result-object v0

    .line 35
    invoke-static {}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;->Default()Lnet/engio/mbassy/bus/config/Feature$AsynchronousMessageDispatch;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;

    move-result-object v0

    .line 36
    invoke-interface {v0, p1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->addPublicationErrorHandler(Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;)Lnet/engio/mbassy/bus/config/BusConfiguration;

    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;-><init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic post(Ljava/lang/Object;)Lnet/engio/mbassy/bus/publication/IPublicationCommand;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/bus/MBassador;->post(Ljava/lang/Object;)Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic post(Ljava/lang/Object;)Lnet/engio/mbassy/bus/publication/ISyncAsyncPublicationCommand;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/bus/MBassador;->post(Ljava/lang/Object;)Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;

    move-result-object p1

    return-object p1
.end method

.method public post(Ljava/lang/Object;)Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;
    .locals 1

    .line 81
    new-instance v0, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;

    invoke-direct {v0, p0, p1}, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;-><init>(Lnet/engio/mbassy/bus/MBassador;Ljava/lang/Object;)V

    return-object v0
.end method

.method public publish(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 3

    .line 64
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->createMessagePublication(Ljava/lang/Object;)Lnet/engio/mbassy/bus/MessagePublication;

    move-result-object p1

    .line 66
    :try_start_0
    invoke-interface {p1}, Lnet/engio/mbassy/bus/IMessagePublication;->execute()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    .line 68
    :try_start_1
    new-instance v1, Lnet/engio/mbassy/bus/error/PublicationError;

    invoke-direct {v1}, Lnet/engio/mbassy/bus/error/PublicationError;-><init>()V

    const-string v2, "Error during publication of message"

    .line 69
    invoke-virtual {v1, v2}, Lnet/engio/mbassy/bus/error/PublicationError;->setMessage(Ljava/lang/String;)Lnet/engio/mbassy/bus/error/PublicationError;

    move-result-object v1

    .line 70
    invoke-virtual {v1, v0}, Lnet/engio/mbassy/bus/error/PublicationError;->setCause(Ljava/lang/Throwable;)Lnet/engio/mbassy/bus/error/PublicationError;

    move-result-object v0

    .line 71
    invoke-virtual {v0, p1}, Lnet/engio/mbassy/bus/error/PublicationError;->setPublication(Lnet/engio/mbassy/bus/IMessagePublication;)Lnet/engio/mbassy/bus/error/PublicationError;

    move-result-object v0

    .line 68
    invoke-virtual {p0, v0}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->handlePublicationError(Lnet/engio/mbassy/bus/error/PublicationError;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-object p1
.end method

.method public publishAsync(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 0

    .line 49
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->createMessagePublication(Ljava/lang/Object;)Lnet/engio/mbassy/bus/MessagePublication;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->addAsynchronousPublication(Lnet/engio/mbassy/bus/MessagePublication;)Lnet/engio/mbassy/bus/IMessagePublication;

    move-result-object p1

    return-object p1
.end method

.method public publishAsync(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 0

    .line 53
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->createMessagePublication(Ljava/lang/Object;)Lnet/engio/mbassy/bus/MessagePublication;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->addAsynchronousPublication(Lnet/engio/mbassy/bus/MessagePublication;JLjava/util/concurrent/TimeUnit;)Lnet/engio/mbassy/bus/IMessagePublication;

    move-result-object p1

    return-object p1
.end method
