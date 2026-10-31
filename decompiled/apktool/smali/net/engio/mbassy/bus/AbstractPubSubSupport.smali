.class public abstract Lnet/engio/mbassy/bus/AbstractPubSubSupport;
.super Ljava/lang/Object;
.source "AbstractPubSubSupport.java"

# interfaces
.implements Lnet/engio/mbassy/bus/common/PubSubSupport;


# static fields
.field public static final ERROR_HANDLER_MSG:Ljava/lang/String; = "INFO: No error handler has been configured to handle exceptions during publication.\nPublication error handlers can be added by IBusConfiguration.addPublicationErrorHandler()\nFalling back to console logger."


# instance fields
.field public final errorHandlers:Ljava/util/List;

.field public final publicationFactory:Lnet/engio/mbassy/bus/MessagePublication$Factory;

.field public final runtime:Lnet/engio/mbassy/bus/BusRuntime;

.field public final subscriptionManager:Lnet/engio/mbassy/subscription/SubscriptionManager;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/bus/config/IBusConfiguration;)V
    .locals 4

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->errorHandlers:Ljava/util/List;

    .line 41
    invoke-interface {p1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->getRegisteredPublicationErrorHandlers()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 42
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 43
    new-instance v1, Lnet/engio/mbassy/bus/error/IPublicationErrorHandler$ConsoleLogger;

    invoke-direct {v1}, Lnet/engio/mbassy/bus/error/IPublicationErrorHandler$ConsoleLogger;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "INFO: No error handler has been configured to handle exceptions during publication.\nPublication error handlers can be added by IBusConfiguration.addPublicationErrorHandler()\nFalling back to console logger."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 46
    :cond_0
    new-instance v0, Lnet/engio/mbassy/bus/BusRuntime;

    invoke-direct {v0, p0}, Lnet/engio/mbassy/bus/BusRuntime;-><init>(Lnet/engio/mbassy/bus/common/PubSubSupport;)V

    const-string v1, "bus.handlers.error"

    .line 47
    invoke-interface {p1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->getRegisteredPublicationErrorHandlers()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lnet/engio/mbassy/bus/BusRuntime;->add(Ljava/lang/String;Ljava/lang/Object;)Lnet/engio/mbassy/bus/BusRuntime;

    move-result-object v0

    .line 48
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bus.id"

    invoke-interface {p1, v2, v1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->getProperty(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lnet/engio/mbassy/bus/BusRuntime;->add(Ljava/lang/String;Ljava/lang/Object;)Lnet/engio/mbassy/bus/BusRuntime;

    move-result-object v0

    iput-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    .line 50
    const-class v1, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    invoke-interface {p1, v1}, Lnet/engio/mbassy/bus/config/IBusConfiguration;->getFeature(Ljava/lang/Class;)Lnet/engio/mbassy/bus/config/Feature;

    move-result-object p1

    check-cast p1, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    if-eqz p1, :cond_1

    .line 54
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->getSubscriptionManagerProvider()Lnet/engio/mbassy/subscription/ISubscriptionManagerProvider;

    move-result-object v1

    .line 55
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->getMetadataReader()Lnet/engio/mbassy/listener/MetadataReader;

    move-result-object v2

    invoke-virtual {p1}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->getSubscriptionFactory()Lnet/engio/mbassy/subscription/SubscriptionFactory;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lnet/engio/mbassy/subscription/ISubscriptionManagerProvider;->createManager(Lnet/engio/mbassy/listener/MetadataReader;Lnet/engio/mbassy/subscription/SubscriptionFactory;Lnet/engio/mbassy/bus/BusRuntime;)Lnet/engio/mbassy/subscription/SubscriptionManager;

    move-result-object v0

    iput-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->subscriptionManager:Lnet/engio/mbassy/subscription/SubscriptionManager;

    .line 56
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->getPublicationFactory()Lnet/engio/mbassy/bus/MessagePublication$Factory;

    move-result-object p1

    iput-object p1, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->publicationFactory:Lnet/engio/mbassy/bus/MessagePublication$Factory;

    return-void

    .line 52
    :cond_1
    invoke-static {v1}, Lnet/engio/mbassy/bus/config/ConfigurationError;->MissingFeature(Ljava/lang/Class;)Lnet/engio/mbassy/bus/config/ConfigurationError;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public createMessagePublication(Ljava/lang/Object;)Lnet/engio/mbassy/bus/MessagePublication;
    .locals 4

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->getSubscriptionsByMessageType(Ljava/lang/Class;)Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 85
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 86
    const-class v2, Lnet/engio/mbassy/bus/common/DeadMessage;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 88
    invoke-virtual {p0, v2}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->getSubscriptionsByMessageType(Ljava/lang/Class;)Ljava/util/Collection;

    move-result-object v0

    .line 89
    invoke-virtual {p0}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->getPublicationFactory()Lnet/engio/mbassy/bus/MessagePublication$Factory;

    move-result-object v1

    iget-object v2, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    new-instance v3, Lnet/engio/mbassy/bus/common/DeadMessage;

    invoke-direct {v3, p1}, Lnet/engio/mbassy/bus/common/DeadMessage;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v0, v3}, Lnet/engio/mbassy/bus/MessagePublication$Factory;->createPublication(Lnet/engio/mbassy/bus/BusRuntime;Ljava/util/Collection;Ljava/lang/Object;)Lnet/engio/mbassy/bus/MessagePublication;

    move-result-object p1

    return-object p1

    .line 91
    :cond_1
    invoke-virtual {p0}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->getPublicationFactory()Lnet/engio/mbassy/bus/MessagePublication$Factory;

    move-result-object v1

    iget-object v2, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    invoke-virtual {v1, v2, v0, p1}, Lnet/engio/mbassy/bus/MessagePublication$Factory;->createPublication(Lnet/engio/mbassy/bus/BusRuntime;Ljava/util/Collection;Ljava/lang/Object;)Lnet/engio/mbassy/bus/MessagePublication;

    move-result-object p1

    return-object p1
.end method

.method public getPublicationFactory()Lnet/engio/mbassy/bus/MessagePublication$Factory;
    .locals 1

    .line 60
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->publicationFactory:Lnet/engio/mbassy/bus/MessagePublication$Factory;

    return-object v0
.end method

.method public getRegisteredErrorHandlers()Ljava/util/Collection;
    .locals 1

    .line 65
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->errorHandlers:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getRuntime()Lnet/engio/mbassy/bus/BusRuntime;
    .locals 1

    .line 80
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    return-object v0
.end method

.method public getSubscriptionsByMessageType(Ljava/lang/Class;)Ljava/util/Collection;
    .locals 1

    .line 98
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->subscriptionManager:Lnet/engio/mbassy/subscription/SubscriptionManager;

    invoke-virtual {v0, p1}, Lnet/engio/mbassy/subscription/SubscriptionManager;->getSubscriptionsByMessageType(Ljava/lang/Class;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public handlePublicationError(Lnet/engio/mbassy/bus/error/PublicationError;)V
    .locals 2

    .line 103
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->errorHandlers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;

    .line 106
    :try_start_0
    invoke-interface {v1, p1}, Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;->handleError(Lnet/engio/mbassy/bus/error/PublicationError;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    goto :goto_0

    :cond_0
    return-void
.end method

.method public subscribe(Ljava/lang/Object;)V
    .locals 1

    .line 74
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->subscriptionManager:Lnet/engio/mbassy/subscription/SubscriptionManager;

    invoke-virtual {v0, p1}, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscribe(Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    const-string v2, "bus.id"

    invoke-virtual {v1, v2}, Lnet/engio/mbassy/bus/BusRuntime;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public unsubscribe(Ljava/lang/Object;)Z
    .locals 1

    .line 69
    iget-object v0, p0, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->subscriptionManager:Lnet/engio/mbassy/subscription/SubscriptionManager;

    invoke-virtual {v0, p1}, Lnet/engio/mbassy/subscription/SubscriptionManager;->unsubscribe(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
