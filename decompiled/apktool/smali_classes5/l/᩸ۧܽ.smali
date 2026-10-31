.class public final Ll/᩸ۧܽ;
.super Ljava/lang/Object;
.source "OANW"

# interfaces
.implements Ll/ܰ֫ܽ;


# instance fields
.field public final ֫:Ljava/util/WeakHashMap;

.field public final ۧ:Ll/۫ۧܽ;

.field public final ܽ:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method public constructor <init>(Ll/۫ۧܽ;)V
    .locals 0

    .line 375
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 376
    iput-object p1, p0, Ll/᩸ۧܽ;->ۧ:Ll/۫ۧܽ;

    .line 378
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Ll/᩸ۧܽ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 385
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Ll/᩸ۧܽ;->֫:Ljava/util/WeakHashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/app/Activity;Ll/ܿܽܽ;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/᩸ۧܽ;->֫:Ljava/util/WeakHashMap;

    const-string v1, "activity"

    .line 7
    invoke-static {p1, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    iget-object v1, p0, Ll/᩸ۧܽ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 391
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿܽܽ;

    .line 169
    invoke-virtual {p2, v2}, Ll/ܿܽܽ;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 393
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    .line 395
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿܽܽ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 390
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 397
    iget-object v0, p0, Ll/᩸ۧܽ;->ۧ:Ll/۫ۧܽ;

    .line 144
    iget-object v0, v0, Ll/۫ۧܽ;->֫:Ll/ۛۧܽ;

    invoke-virtual {v0}, Ll/ۛۧܽ;->֫()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۧܽ;

    .line 145
    invoke-virtual {v1}, Ll/ۤۧܽ;->֫()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 148
    :cond_1
    invoke-virtual {v1, p2}, Ll/ۤۧܽ;->֫(Ll/ܿܽܽ;)V

    goto :goto_0

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 390
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method
