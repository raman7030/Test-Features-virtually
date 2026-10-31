.class public Lnet/engio/mbassy/common/WeakConcurrentSet$1;
.super Ljava/lang/Object;
.source "WeakConcurrentSet.java"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public current:Lnet/engio/mbassy/common/ISetEntry;

.field public final synthetic this$0:Lnet/engio/mbassy/common/WeakConcurrentSet;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/common/WeakConcurrentSet;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->this$0:Lnet/engio/mbassy/common/WeakConcurrentSet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iget-object p1, p1, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    iput-object p1, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    return-void
.end method

.method private removeOrphans()V
    .locals 4

    .line 37
    iget-object v0, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->this$0:Lnet/engio/mbassy/common/WeakConcurrentSet;

    iget-object v0, v0, Lnet/engio/mbassy/common/AbstractConcurrentSet;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    .line 39
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 41
    :cond_0
    iget-object v1, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    .line 42
    invoke-interface {v1}, Lnet/engio/mbassy/common/ISetEntry;->next()Lnet/engio/mbassy/common/ISetEntry;

    move-result-object v2

    iput-object v2, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    .line 43
    iget-object v2, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->this$0:Lnet/engio/mbassy/common/WeakConcurrentSet;

    iget-object v3, v2, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    if-ne v1, v3, :cond_1

    .line 44
    invoke-virtual {v3}, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next()Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    move-result-object v3

    iput-object v3, v2, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    .line 46
    :cond_1
    invoke-interface {v1}, Lnet/engio/mbassy/common/ISetEntry;->remove()V

    .line 47
    iget-object v1, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lnet/engio/mbassy/common/ISetEntry;->getValue()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 50
    :cond_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method


# virtual methods
.method public hasNext()Z
    .locals 3

    .line 56
    iget-object v0, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 57
    :cond_0
    invoke-interface {v0}, Lnet/engio/mbassy/common/ISetEntry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    .line 60
    invoke-direct {p0}, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->removeOrphans()V

    .line 61
    iget-object v0, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    if-eqz v0, :cond_1

    return v2

    :cond_1
    return v1

    :cond_2
    return v2
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .line 68
    iget-object v0, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 71
    :cond_0
    invoke-interface {v0}, Lnet/engio/mbassy/common/ISetEntry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 73
    invoke-direct {p0}, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->removeOrphans()V

    .line 74
    invoke-virtual {p0}, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 76
    :cond_1
    iget-object v1, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    invoke-interface {v1}, Lnet/engio/mbassy/common/ISetEntry;->next()Lnet/engio/mbassy/common/ISetEntry;

    move-result-object v1

    iput-object v1, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    return-object v0
.end method

.method public remove()V
    .locals 3

    .line 83
    iget-object v0, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    if-nez v0, :cond_0

    return-void

    .line 86
    :cond_0
    invoke-interface {v0}, Lnet/engio/mbassy/common/ISetEntry;->next()Lnet/engio/mbassy/common/ISetEntry;

    move-result-object v0

    .line 87
    iget-object v1, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->this$0:Lnet/engio/mbassy/common/WeakConcurrentSet;

    iget-object v2, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    invoke-interface {v2}, Lnet/engio/mbassy/common/ISetEntry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/engio/mbassy/common/AbstractConcurrentSet;->remove(Ljava/lang/Object;)Z

    .line 88
    iput-object v0, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    return-void
.end method
