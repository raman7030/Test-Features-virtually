.class public Lnet/engio/mbassy/subscription/SubscriptionManager;
.super Ljava/lang/Object;
.source "SubscriptionManager.java"


# instance fields
.field public final metadataReader:Lnet/engio/mbassy/listener/MetadataReader;

.field public final nonListeners:Lnet/engio/mbassy/common/StrongConcurrentSet;

.field public final readWriteLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final runtime:Lnet/engio/mbassy/bus/BusRuntime;

.field public final subscriptionFactory:Lnet/engio/mbassy/subscription/SubscriptionFactory;

.field public final subscriptionsPerListener:Ljava/util/Map;

.field public final subscriptionsPerMessage:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/listener/MetadataReader;Lnet/engio/mbassy/subscription/SubscriptionFactory;Lnet/engio/mbassy/bus/BusRuntime;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Lnet/engio/mbassy/common/StrongConcurrentSet;

    invoke-direct {v0}, Lnet/engio/mbassy/common/StrongConcurrentSet;-><init>()V

    iput-object v0, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->nonListeners:Lnet/engio/mbassy/common/StrongConcurrentSet;

    .line 47
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->readWriteLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 52
    iput-object p1, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->metadataReader:Lnet/engio/mbassy/listener/MetadataReader;

    .line 53
    iput-object p2, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionFactory:Lnet/engio/mbassy/subscription/SubscriptionFactory;

    .line 54
    iput-object p3, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    .line 56
    new-instance p1, Ljava/util/HashMap;

    const/16 p2, 0x100

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionsPerMessage:Ljava/util/Map;

    .line 57
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionsPerListener:Ljava/util/Map;

    return-void
.end method

.method private getSubscriptionsByListener(Ljava/lang/Object;)[Lnet/engio/mbassy/subscription/Subscription;
    .locals 2

    .line 79
    iget-object v0, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->readWriteLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    .line 81
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 82
    iget-object v1, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionsPerListener:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lnet/engio/mbassy/subscription/Subscription;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw p1
.end method

.method private subscribe(Ljava/lang/Object;[Lnet/engio/mbassy/subscription/Subscription;)V
    .locals 10

    .line 132
    iget-object v0, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->readWriteLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    .line 134
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 140
    invoke-direct {p0, p1}, Lnet/engio/mbassy/subscription/SubscriptionManager;->getSubscriptionsByListener(Ljava/lang/Object;)[Lnet/engio/mbassy/subscription/Subscription;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    .line 143
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 144
    aget-object v3, p2, v2

    .line 145
    invoke-virtual {v3, p1}, Lnet/engio/mbassy/subscription/Subscription;->subscribe(Ljava/lang/Object;)V

    .line 147
    invoke-virtual {v3}, Lnet/engio/mbassy/subscription/Subscription;->getHandledMessageTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 149
    iget-object v8, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionsPerMessage:Ljava/util/Map;

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/ArrayList;

    if-nez v8, :cond_0

    .line 151
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0x8

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 152
    iget-object v9, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionsPerMessage:Ljava/util/Map;

    invoke-interface {v9, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    :cond_0
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 158
    :cond_2
    iget-object v1, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionsPerListener:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 163
    :cond_3
    array-length p2, v1

    :goto_2
    if-ge v2, p2, :cond_4

    .line 164
    aget-object v3, v1, v2

    .line 165
    invoke-virtual {v3, p1}, Lnet/engio/mbassy/subscription/Subscription;->subscribe(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 169
    :cond_4
    :goto_3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw p1
.end method


# virtual methods
.method public getSubscriptionsByMessageType(Ljava/lang/Class;)Ljava/util/Collection;
    .locals 10

    .line 176
    new-instance v0, Ljava/util/TreeSet;

    sget-object v1, Lnet/engio/mbassy/subscription/Subscription;->SubscriptionByPriorityDesc:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 177
    iget-object v1, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->readWriteLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v1

    .line 179
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 182
    iget-object v2, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionsPerMessage:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    .line 185
    invoke-virtual {v0, v2}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    .line 188
    :cond_0
    invoke-static {p1}, Lnet/engio/mbassy/common/ReflectionUtils;->getSuperTypes(Ljava/lang/Class;)[Ljava/lang/Class;

    move-result-object v2

    .line 189
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    .line 190
    aget-object v5, v2, v4

    .line 192
    iget-object v6, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionsPerMessage:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    if-eqz v5, :cond_2

    .line 194
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_2

    .line 195
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnet/engio/mbassy/subscription/Subscription;

    .line 197
    invoke-virtual {v8, p1}, Lnet/engio/mbassy/subscription/Subscription;->handlesMessageType(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 198
    invoke-virtual {v0, v8}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 204
    :cond_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw p1
.end method

.method public subscribe(Ljava/lang/Object;)V
    .locals 7

    .line 91
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 93
    iget-object v1, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->nonListeners:Lnet/engio/mbassy/common/StrongConcurrentSet;

    invoke-virtual {v1, v0}, Lnet/engio/mbassy/common/AbstractConcurrentSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 96
    :cond_0
    invoke-direct {p0, p1}, Lnet/engio/mbassy/subscription/SubscriptionManager;->getSubscriptionsByListener(Ljava/lang/Object;)[Lnet/engio/mbassy/subscription/Subscription;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    .line 99
    iget-object v1, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->metadataReader:Lnet/engio/mbassy/listener/MetadataReader;

    invoke-virtual {v1, v0}, Lnet/engio/mbassy/listener/MetadataReader;->getMessageListener(Ljava/lang/Class;)Lnet/engio/mbassy/listener/MessageListener;

    move-result-object v1

    invoke-virtual {v1}, Lnet/engio/mbassy/listener/MessageListener;->getHandlers()[Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object v1

    .line 100
    array-length v3, v1

    if-nez v3, :cond_1

    .line 103
    iget-object p1, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->nonListeners:Lnet/engio/mbassy/common/StrongConcurrentSet;

    invoke-virtual {p1, v0}, Lnet/engio/mbassy/common/AbstractConcurrentSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 106
    :cond_1
    new-array v0, v3, [Lnet/engio/mbassy/subscription/Subscription;

    :goto_0
    if-ge v2, v3, :cond_2

    .line 111
    aget-object v4, v1, v2

    .line 112
    iget-object v5, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscriptionFactory:Lnet/engio/mbassy/subscription/SubscriptionFactory;

    iget-object v6, p0, Lnet/engio/mbassy/subscription/SubscriptionManager;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    invoke-virtual {v5, v6, v4}, Lnet/engio/mbassy/subscription/SubscriptionFactory;->createSubscription(Lnet/engio/mbassy/bus/BusRuntime;Lnet/engio/mbassy/listener/MessageHandler;)Lnet/engio/mbassy/subscription/Subscription;

    move-result-object v4

    aput-object v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 117
    :cond_2
    invoke-direct {p0, p1, v0}, Lnet/engio/mbassy/subscription/SubscriptionManager;->subscribe(Ljava/lang/Object;[Lnet/engio/mbassy/subscription/Subscription;)V

    return-void

    .line 120
    :cond_3
    array-length v0, v1

    :goto_1
    if-ge v2, v0, :cond_4

    aget-object v3, v1, v2

    .line 121
    invoke-virtual {v3, p1}, Lnet/engio/mbassy/subscription/Subscription;->subscribe(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-void

    :catch_0
    move-exception p1

    .line 126
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public unsubscribe(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 65
    :cond_0
    invoke-direct {p0, p1}, Lnet/engio/mbassy/subscription/SubscriptionManager;->getSubscriptionsByListener(Ljava/lang/Object;)[Lnet/engio/mbassy/subscription/Subscription;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 70
    :cond_1
    array-length v2, v1

    const/4 v3, 0x1

    :goto_0
    if-ge v0, v2, :cond_2

    aget-object v4, v1, v0

    .line 71
    invoke-virtual {v4, p1}, Lnet/engio/mbassy/subscription/Subscription;->unsubscribe(Ljava/lang/Object;)Z

    move-result v4

    and-int/2addr v3, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v3
.end method
