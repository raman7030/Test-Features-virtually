.class public Lnet/engio/mbassy/subscription/Subscription;
.super Ljava/lang/Object;
.source "Subscription.java"


# static fields
.field public static final SubscriptionByPriorityDesc:Ljava/util/Comparator;


# instance fields
.field public final context:Lnet/engio/mbassy/subscription/SubscriptionContext;

.field public final dispatcher:Lnet/engio/mbassy/dispatch/IMessageDispatcher;

.field public final id:Ljava/util/UUID;

.field public final listeners:Ljava/util/Collection;

.field public final onSubscription:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 100
    new-instance v0, Lnet/engio/mbassy/subscription/Subscription$1;

    invoke-direct {v0}, Lnet/engio/mbassy/subscription/Subscription$1;-><init>()V

    sput-object v0, Lnet/engio/mbassy/subscription/Subscription;->SubscriptionByPriorityDesc:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Lnet/engio/mbassy/subscription/SubscriptionContext;Lnet/engio/mbassy/dispatch/IMessageDispatcher;Ljava/util/Collection;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->id:Ljava/util/UUID;

    .line 35
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->onSubscription:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 39
    iput-object p1, p0, Lnet/engio/mbassy/subscription/Subscription;->context:Lnet/engio/mbassy/subscription/SubscriptionContext;

    .line 40
    iput-object p2, p0, Lnet/engio/mbassy/subscription/Subscription;->dispatcher:Lnet/engio/mbassy/dispatch/IMessageDispatcher;

    .line 41
    iput-object p3, p0, Lnet/engio/mbassy/subscription/Subscription;->listeners:Ljava/util/Collection;

    return-void
.end method

.method public static synthetic access$000(Lnet/engio/mbassy/subscription/Subscription;)Ljava/util/UUID;
    .locals 0

    .line 25
    iget-object p0, p0, Lnet/engio/mbassy/subscription/Subscription;->id:Ljava/util/UUID;

    return-object p0
.end method

.method public static synthetic access$100(Lnet/engio/mbassy/subscription/Subscription;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 25
    iget-object p0, p0, Lnet/engio/mbassy/subscription/Subscription;->onSubscription:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method


# virtual methods
.method public belongsTo(Ljava/lang/Class;)Z
    .locals 1

    .line 48
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->context:Lnet/engio/mbassy/subscription/SubscriptionContext;

    invoke-virtual {v0}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/engio/mbassy/listener/MessageHandler;->isFromListener(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 55
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->listeners:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getHandle()Lnet/engio/mbassy/subscription/Subscription$Handle;
    .locals 1

    .line 97
    new-instance v0, Lnet/engio/mbassy/subscription/Subscription$Handle;

    invoke-direct {v0, p0}, Lnet/engio/mbassy/subscription/Subscription$Handle;-><init>(Lnet/engio/mbassy/subscription/Subscription;)V

    return-object v0
.end method

.method public getHandledMessageTypes()[Ljava/lang/Class;
    .locals 1

    .line 66
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->context:Lnet/engio/mbassy/subscription/SubscriptionContext;

    invoke-virtual {v0}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object v0

    invoke-virtual {v0}, Lnet/engio/mbassy/listener/MessageHandler;->getHandledMessages()[Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public getPriority()I
    .locals 1

    .line 76
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->context:Lnet/engio/mbassy/subscription/SubscriptionContext;

    invoke-virtual {v0}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object v0

    invoke-virtual {v0}, Lnet/engio/mbassy/listener/MessageHandler;->getPriority()I

    move-result v0

    return v0
.end method

.method public handlesMessageType(Ljava/lang/Class;)Z
    .locals 1

    .line 62
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->context:Lnet/engio/mbassy/subscription/SubscriptionContext;

    invoke-virtual {v0}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/engio/mbassy/listener/MessageHandler;->handlesMessage(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method public publish(Lnet/engio/mbassy/bus/MessagePublication;Ljava/lang/Object;)V
    .locals 2

    .line 71
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->listeners:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->dispatcher:Lnet/engio/mbassy/dispatch/IMessageDispatcher;

    iget-object v1, p0, Lnet/engio/mbassy/subscription/Subscription;->listeners:Ljava/util/Collection;

    invoke-interface {v0, p1, p2, v1}, Lnet/engio/mbassy/dispatch/IMessageDispatcher;->dispatch(Lnet/engio/mbassy/bus/MessagePublication;Ljava/lang/Object;Ljava/lang/Iterable;)V

    :cond_0
    return-void
.end method

.method public size()I
    .locals 1

    .line 92
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->listeners:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public subscribe(Ljava/lang/Object;)V
    .locals 3

    .line 81
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->listeners:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 82
    iget-object p1, p0, Lnet/engio/mbassy/subscription/Subscription;->onSubscription:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Runnable;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Runnable;

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p1, v0

    .line 83
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public unsubscribe(Ljava/lang/Object;)Z
    .locals 1

    .line 88
    iget-object v0, p0, Lnet/engio/mbassy/subscription/Subscription;->listeners:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
