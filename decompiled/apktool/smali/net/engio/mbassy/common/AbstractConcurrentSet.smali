.class public abstract Lnet/engio/mbassy/common/AbstractConcurrentSet;
.super Ljava/lang/Object;
.source "AbstractConcurrentSet.java"

# interfaces
.implements Ljava/util/Set;


# static fields
.field public static final id:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public final ID:J

.field public final entries:Ljava/util/Map;

.field public head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

.field public final lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    sput-object v0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->id:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    sget-object v0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->id:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->ID:J

    .line 27
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 32
    iput-object p1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    return-void
.end method

.method private insert(Ljava/lang/Object;)Z
    .locals 2

    .line 70
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    invoke-virtual {p0, p1, v0}, Lnet/engio/mbassy/common/AbstractConcurrentSet;->createEntry(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    move-result-object v0

    iput-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    .line 72
    iget-object v1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 40
    :cond_0
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    .line 43
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 44
    invoke-direct {p0, p1}, Lnet/engio/mbassy/common/AbstractConcurrentSet;->insert(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 3

    .line 91
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    .line 93
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 94
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 96
    invoke-direct {p0, v2}, Lnet/engio/mbassy/common/AbstractConcurrentSet;->insert(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    or-int/2addr v1, v2

    goto :goto_0

    .line 100
    :cond_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public clear()V
    .locals 2

    .line 159
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    .line 161
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x0

    .line 162
    iput-object v1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    .line 163
    iget-object v1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2

    .line 53
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    .line 56
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 57
    iget-object v1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/engio/mbassy/common/ISetEntry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-eqz p1, :cond_0

    .line 61
    invoke-interface {p1}, Lnet/engio/mbassy/common/ISetEntry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    .line 59
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 144
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Not implemented"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract createEntry(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 185
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 189
    :cond_2
    check-cast p1, Lnet/engio/mbassy/common/AbstractConcurrentSet;

    .line 190
    iget-wide v2, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->ID:J

    iget-wide v4, p1, Lnet/engio/mbassy/common/AbstractConcurrentSet;->ID:J

    cmp-long p1, v2, v4

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 173
    iget-wide v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->ID:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    add-int/lit8 v1, v1, 0x1f

    return v1
.end method

.method public isEmpty()Z
    .locals 1

    .line 85
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 3

    .line 107
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/common/AbstractConcurrentSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 110
    :cond_0
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    .line 112
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 113
    iget-object v2, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/engio/mbassy/common/ISetEntry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    .line 125
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v1

    .line 117
    :cond_1
    :try_start_1
    iget-object v1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    if-eq v2, v1, :cond_2

    .line 118
    invoke-interface {v2}, Lnet/engio/mbassy/common/ISetEntry;->remove()V

    goto :goto_0

    .line 120
    :cond_2
    invoke-virtual {v1}, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next()Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    move-result-object v1

    iput-object v1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    .line 123
    :goto_0
    iget-object v1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 149
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Not implemented"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 154
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Not implemented"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public size()I
    .locals 1

    .line 80
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .line 133
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 139
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->entries:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
