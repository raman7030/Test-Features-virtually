.class public Lnet/engio/mbassy/bus/SyncMessageBus;
.super Lnet/engio/mbassy/bus/AbstractPubSubSupport;
.source "SyncMessageBus.java"

# interfaces
.implements Lnet/engio/mbassy/bus/common/PubSubSupport;
.implements Lnet/engio/mbassy/bus/common/ErrorHandlingSupport;
.implements Lnet/engio/mbassy/bus/common/GenericMessagePublicationSupport;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 24
    new-instance v0, Lnet/engio/mbassy/bus/config/BusConfiguration;

    invoke-direct {v0}, Lnet/engio/mbassy/bus/config/BusConfiguration;-><init>()V

    invoke-static {}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->Default()Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/config/BusConfiguration;->addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;-><init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V

    return-void
.end method

.method public constructor <init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;-><init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V

    return-void
.end method

.method public constructor <init>(Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;)V
    .locals 2

    .line 32
    new-instance v0, Lnet/engio/mbassy/bus/config/BusConfiguration;

    invoke-direct {v0}, Lnet/engio/mbassy/bus/config/BusConfiguration;-><init>()V

    invoke-static {}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->Default()Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/config/BusConfiguration;->addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;

    move-result-object v0

    invoke-interface {v0, p1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->addPublicationErrorHandler(Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;)Lnet/engio/mbassy/bus/config/BusConfiguration;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;-><init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V

    return-void
.end method


# virtual methods
.method public post(Ljava/lang/Object;)Lnet/engio/mbassy/bus/SyncMessageBus$SyncPostCommand;
    .locals 1

    .line 61
    new-instance v0, Lnet/engio/mbassy/bus/SyncMessageBus$SyncPostCommand;

    invoke-direct {v0, p0, p1}, Lnet/engio/mbassy/bus/SyncMessageBus$SyncPostCommand;-><init>(Lnet/engio/mbassy/bus/SyncMessageBus;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic post(Ljava/lang/Object;)Lnet/engio/mbassy/bus/publication/IPublicationCommand;
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/bus/SyncMessageBus;->post(Ljava/lang/Object;)Lnet/engio/mbassy/bus/SyncMessageBus$SyncPostCommand;

    move-result-object p1

    return-object p1
.end method

.method public publish(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 3

    .line 46
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->createMessagePublication(Ljava/lang/Object;)Lnet/engio/mbassy/bus/MessagePublication;

    move-result-object p1

    .line 48
    :try_start_0
    invoke-interface {p1}, Lnet/engio/mbassy/bus/IMessagePublication;->execute()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    .line 50
    :try_start_1
    new-instance v1, Lnet/engio/mbassy/bus/error/PublicationError;

    invoke-direct {v1}, Lnet/engio/mbassy/bus/error/PublicationError;-><init>()V

    const-string v2, "Error during publication of message"

    invoke-virtual {v1, v2}, Lnet/engio/mbassy/bus/error/PublicationError;->setMessage(Ljava/lang/String;)Lnet/engio/mbassy/bus/error/PublicationError;

    move-result-object v1

    .line 51
    invoke-virtual {v1, v0}, Lnet/engio/mbassy/bus/error/PublicationError;->setCause(Ljava/lang/Throwable;)Lnet/engio/mbassy/bus/error/PublicationError;

    move-result-object v0

    .line 52
    invoke-virtual {v0, p1}, Lnet/engio/mbassy/bus/error/PublicationError;->setPublication(Lnet/engio/mbassy/bus/IMessagePublication;)Lnet/engio/mbassy/bus/error/PublicationError;

    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->handlePublicationError(Lnet/engio/mbassy/bus/error/PublicationError;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-object p1
.end method
