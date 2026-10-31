.class public final Ll/֫ۧܽ;
.super Ljava/lang/Object;
.source "TAN9"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final ۙ:Ljava/util/LinkedHashSet;

.field public final ᩶:Ljava/util/concurrent/locks/ReentrantLock;

.field public final ᩸:Landroid/app/Activity;

.field public ᩹:Ll/ܿܽܽ;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p1, p0, Ll/֫ۧܽ;->᩸:Landroid/app/Activity;

    .line 98
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Ll/֫ۧܽ;->᩶:Ljava/util/concurrent/locks/ReentrantLock;

    .line 102
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Ll/֫ۧܽ;->ۙ:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 94
    check-cast p1, Landroidx/window/extensions/layout/WindowLayoutInfo;

    const-string v0, "value"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Ll/֫ۧܽ;->᩶:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 106
    :try_start_0
    iget-object v1, p0, Ll/֫ۧܽ;->᩸:Landroid/app/Activity;

    invoke-static {v1, p1}, Ll/ܽۧܽ;->֫(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Ll/ܿܽܽ;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۧܽ;->᩹:Ll/ܿܽܽ;

    .line 107
    iget-object p1, p0, Ll/֫ۧܽ;->ۙ:Ljava/util/LinkedHashSet;

    .line 1849
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۤ;

    .line 107
    iget-object v2, p0, Ll/֫ۧܽ;->᩹:Ll/ܿܽܽ;

    invoke-interface {v1, v2}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    .line 108
    :cond_0
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۧܽܽ;)V
    .locals 2

    .line 112
    iget-object v0, p0, Ll/֫ۧܽ;->᩶:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 113
    :try_start_0
    iget-object v1, p0, Ll/֫ۧܽ;->᩹:Ll/ܿܽܽ;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Ll/ۧܽܽ;->accept(Ljava/lang/Object;)V

    .line 114
    :goto_0
    iget-object v1, p0, Ll/֫ۧܽ;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final ֫(Ll/۬ۤ;)V
    .locals 2

    const-string v0, "listener"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Ll/֫ۧܽ;->᩶:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 120
    :try_start_0
    iget-object v1, p0, Ll/֫ۧܽ;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 125
    iget-object v0, p0, Ll/֫ۧܽ;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method
