.class public final Ll/ۚܽۘ;
.super Ljava/lang/Object;
.source "E9CL"


# instance fields
.field public ֫:Ljava/util/concurrent/locks/ReentrantLock;

.field public ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Ll/ۚܽۘ;->֫:Ljava/util/concurrent/locks/ReentrantLock;

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۚܽۘ;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/֡ܽۘ;
    .locals 2

    .line 27
    iget-object v0, p0, Ll/ۚܽۘ;->֫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 29
    :try_start_0
    iget-object v1, p0, Ll/ۚܽۘ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܽۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 32
    throw p1
.end method

.method public final ֫(Ll/֡ܽۘ;)V
    .locals 3

    .line 36
    iget-object v0, p0, Ll/ۚܽۘ;->֫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 38
    :try_start_0
    iget-object v1, p0, Ll/ۚܽۘ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/֡ܽۘ;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 41
    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 45
    iget-object v0, p0, Ll/ۚܽۘ;->֫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 47
    :try_start_0
    iget-object v1, p0, Ll/ۚܽۘ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 50
    throw p1
.end method
