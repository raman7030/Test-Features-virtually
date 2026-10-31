.class public Lnet/engio/mbassy/subscription/SubscriptionFactory;
.super Ljava/lang/Object;
.source "SubscriptionFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public buildDispatcher(Lnet/engio/mbassy/subscription/SubscriptionContext;Lnet/engio/mbassy/dispatch/IHandlerInvocation;)Lnet/engio/mbassy/dispatch/IMessageDispatcher;
    .locals 1

    .line 48
    new-instance v0, Lnet/engio/mbassy/dispatch/MessageDispatcher;

    invoke-direct {v0, p1, p2}, Lnet/engio/mbassy/dispatch/MessageDispatcher;-><init>(Lnet/engio/mbassy/subscription/SubscriptionContext;Lnet/engio/mbassy/dispatch/IHandlerInvocation;)V

    .line 49
    invoke-virtual {p1}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object p2

    invoke-virtual {p2}, Lnet/engio/mbassy/listener/MessageHandler;->isEnveloped()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 50
    new-instance p2, Lnet/engio/mbassy/dispatch/EnvelopedMessageDispatcher;

    invoke-direct {p2, v0}, Lnet/engio/mbassy/dispatch/EnvelopedMessageDispatcher;-><init>(Lnet/engio/mbassy/dispatch/IMessageDispatcher;)V

    move-object v0, p2

    .line 52
    :cond_0
    invoke-virtual {p1}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object p1

    invoke-virtual {p1}, Lnet/engio/mbassy/listener/MessageHandler;->isFiltered()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 53
    new-instance p1, Lnet/engio/mbassy/dispatch/FilteredMessageDispatcher;

    invoke-direct {p1, v0}, Lnet/engio/mbassy/dispatch/FilteredMessageDispatcher;-><init>(Lnet/engio/mbassy/dispatch/IMessageDispatcher;)V

    return-object p1

    :cond_1
    return-object v0
.end method

.method public buildInvocationForHandler(Lnet/engio/mbassy/subscription/SubscriptionContext;)Lnet/engio/mbassy/dispatch/IHandlerInvocation;
    .locals 2

    .line 37
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/subscription/SubscriptionFactory;->createBaseHandlerInvocation(Lnet/engio/mbassy/subscription/SubscriptionContext;)Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    move-result-object v0

    .line 38
    invoke-virtual {p1}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object v1

    invoke-virtual {v1}, Lnet/engio/mbassy/listener/MessageHandler;->isSynchronized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 39
    new-instance v1, Lnet/engio/mbassy/dispatch/SynchronizedHandlerInvocation;

    invoke-direct {v1, v0}, Lnet/engio/mbassy/dispatch/SynchronizedHandlerInvocation;-><init>(Lnet/engio/mbassy/dispatch/IHandlerInvocation;)V

    move-object v0, v1

    .line 41
    :cond_0
    invoke-virtual {p1}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object p1

    invoke-virtual {p1}, Lnet/engio/mbassy/listener/MessageHandler;->isAsynchronous()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 42
    new-instance p1, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;

    invoke-direct {p1, v0}, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;-><init>(Lnet/engio/mbassy/dispatch/IHandlerInvocation;)V

    return-object p1

    :cond_1
    return-object v0
.end method

.method public createBaseHandlerInvocation(Lnet/engio/mbassy/subscription/SubscriptionContext;)Lnet/engio/mbassy/dispatch/IHandlerInvocation;
    .locals 5

    .line 59
    invoke-virtual {p1}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object v0

    invoke-virtual {v0}, Lnet/engio/mbassy/listener/MessageHandler;->getHandlerInvocation()Ljava/lang/Class;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    new-instance p1, Lnet/engio/mbassy/bus/error/MessageBusException;

    const-string v0, "The handler invocation must be top level class or nested STATIC inner class"

    invoke-direct {p1, v0}, Lnet/engio/mbassy/bus/error/MessageBusException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    .line 64
    const-class v3, Lnet/engio/mbassy/subscription/SubscriptionContext;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v4

    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/engio/mbassy/dispatch/IHandlerInvocation;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 70
    new-instance v1, Lnet/engio/mbassy/bus/error/MessageBusException;

    .line 71
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Could not instantiate the provided handler invocation "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lnet/engio/mbassy/bus/error/MessageBusException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception p1

    .line 67
    new-instance v1, Lnet/engio/mbassy/bus/error/MessageBusException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The provided handler invocation did not specify the necessary constructor "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "(SubscriptionContext);"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lnet/engio/mbassy/bus/error/MessageBusException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public createSubscription(Lnet/engio/mbassy/bus/BusRuntime;Lnet/engio/mbassy/listener/MessageHandler;)Lnet/engio/mbassy/subscription/Subscription;
    .locals 2

    :try_start_0
    const-string v0, "bus.handlers.error"

    .line 24
    invoke-virtual {p1, v0}, Lnet/engio/mbassy/bus/BusRuntime;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 25
    new-instance v1, Lnet/engio/mbassy/subscription/SubscriptionContext;

    invoke-direct {v1, p1, p2, v0}, Lnet/engio/mbassy/subscription/SubscriptionContext;-><init>(Lnet/engio/mbassy/bus/BusRuntime;Lnet/engio/mbassy/listener/MessageHandler;Ljava/util/Collection;)V

    .line 26
    invoke-virtual {p0, v1}, Lnet/engio/mbassy/subscription/SubscriptionFactory;->buildInvocationForHandler(Lnet/engio/mbassy/subscription/SubscriptionContext;)Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    move-result-object p1

    .line 27
    invoke-virtual {p0, v1, p1}, Lnet/engio/mbassy/subscription/SubscriptionFactory;->buildDispatcher(Lnet/engio/mbassy/subscription/SubscriptionContext;Lnet/engio/mbassy/dispatch/IHandlerInvocation;)Lnet/engio/mbassy/dispatch/IMessageDispatcher;

    move-result-object p1

    .line 28
    new-instance v0, Lnet/engio/mbassy/subscription/Subscription;

    invoke-virtual {p2}, Lnet/engio/mbassy/listener/MessageHandler;->useStrongReferences()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lnet/engio/mbassy/common/StrongConcurrentSet;

    invoke-direct {p2}, Lnet/engio/mbassy/common/StrongConcurrentSet;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p2, Lnet/engio/mbassy/common/WeakConcurrentSet;

    invoke-direct {p2}, Lnet/engio/mbassy/common/WeakConcurrentSet;-><init>()V

    :goto_0
    invoke-direct {v0, v1, p1, p2}, Lnet/engio/mbassy/subscription/Subscription;-><init>(Lnet/engio/mbassy/subscription/SubscriptionContext;Lnet/engio/mbassy/dispatch/IMessageDispatcher;Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 32
    new-instance p2, Lnet/engio/mbassy/bus/error/MessageBusException;

    invoke-direct {p2, p1}, Lnet/engio/mbassy/bus/error/MessageBusException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
