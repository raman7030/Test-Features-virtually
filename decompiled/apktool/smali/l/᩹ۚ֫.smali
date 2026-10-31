.class public final Ll/᩹ۚ֫;
.super Ljava/lang/Object;
.source "L8SE"


# instance fields
.field public final ֫:Ll/ܽۚ֫;

.field public final ۜ:Ljava/lang/Object;

.field public final ۧ:Ljava/util/ArrayDeque;

.field public final ܳ:Ljava/util/ArrayDeque;

.field public final ܽ:Ll/᩵ۚ֫;

.field public final ܿ:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final ᩳ:Ll/ܶۚ֫;

.field public ᩷:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;Ll/ܽۚ֫;Ll/ܶۚ֫;)V
    .locals 6

    .line 102
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    const/4 v5, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩹ۚ֫;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Ll/ܽۚ֫;Ll/ܶۚ֫;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Ll/ܽۚ֫;Ll/ܶۚ֫;Z)V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    iput-object p3, p0, Ll/᩹ۚ֫;->֫:Ll/ܽۚ֫;

    .line 117
    iput-object p1, p0, Ll/᩹ۚ֫;->ܿ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 118
    iput-object p4, p0, Ll/᩹ۚ֫;->ᩳ:Ll/ܶۚ֫;

    .line 119
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۚ֫;->ۜ:Ljava/lang/Object;

    .line 120
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/᩹ۚ֫;->ۧ:Ljava/util/ArrayDeque;

    .line 121
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/᩹ۚ֫;->ܳ:Ljava/util/ArrayDeque;

    .line 124
    new-instance p1, Ll/ۚۚ֫;

    invoke-direct {p1, p0}, Ll/ۚۚ֫;-><init>(Ll/᩹ۚ֫;)V

    invoke-interface {p3, p2, p1}, Ll/ܽۚ֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    move-result-object p1

    .line 125
    iput-object p1, p0, Ll/᩹ۚ֫;->ܽ:Ll/᩵ۚ֫;

    .line 126
    iput-boolean p5, p0, Ll/᩹ۚ֫;->᩷:Z

    return-void
.end method

.method public static ֫(Ll/᩹ۚ֫;)V
    .locals 3

    .line 296
    iget-object v0, p0, Ll/᩹ۚ֫;->ܿ:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۚ֫;

    .line 297
    iget-object v2, p0, Ll/᩹ۚ֫;->ᩳ:Ll/ܶۚ֫;

    invoke-virtual {v1, v2}, Ll/᩸ۚ֫;->֫(Ll/ܶۚ֫;)V

    .line 298
    iget-object v1, p0, Ll/᩹ۚ֫;->ܽ:Ll/᩵ۚ֫;

    invoke-interface {v1}, Ll/᩵ۚ֫;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    return-void
.end method

.method private ܽ()V
    .locals 2

    .line 309
    iget-boolean v0, p0, Ll/᩹ۚ֫;->᩷:Z

    if-nez v0, :cond_0

    return-void

    .line 312
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Ll/᩹ۚ֫;->ܽ:Ll/᩵ۚ֫;

    invoke-interface {v1}, Ll/᩵ۚ֫;->ܽ()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/os/Looper;Ll/ܿۖۜ;)Ll/᩹ۚ֫;
    .locals 7

    .line 158
    new-instance v6, Ll/᩹ۚ֫;

    iget-object v1, p0, Ll/᩹ۚ֫;->ܿ:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-boolean v5, p0, Ll/᩹ۚ֫;->᩷:Z

    iget-object v3, p0, Ll/᩹ۚ֫;->֫:Ll/ܽۚ֫;

    move-object v0, v6

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ll/᩹ۚ֫;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Ll/ܽۚ֫;Ll/ܶۚ֫;Z)V

    return-object v6
.end method

.method public final ֫()V
    .locals 3

    .line 233
    invoke-direct {p0}, Ll/᩹ۚ֫;->ܽ()V

    .line 234
    iget-object v0, p0, Ll/᩹ۚ֫;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 237
    :cond_0
    iget-object v1, p0, Ll/᩹ۚ֫;->ܽ:Ll/᩵ۚ֫;

    invoke-interface {v1}, Ll/᩵ۚ֫;->֫()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    .line 238
    invoke-interface {v1, v2}, Ll/᩵ۚ֫;->֫(I)Ll/ᩴۚ֫;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩵ۚ֫;->֫(Ll/ᩴۚ֫;)Z

    .line 240
    :cond_1
    iget-object v1, p0, Ll/᩹ۚ֫;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    .line 241
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 242
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    if-nez v2, :cond_2

    goto :goto_1

    .line 247
    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 248
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 249
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final ֫(ILl/۠ۚ֫;)V
    .locals 2

    .line 221
    invoke-direct {p0}, Ll/᩹ۚ֫;->ܽ()V

    .line 222
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v1, p0, Ll/᩹ۚ֫;->ܿ:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    .line 223
    new-instance v1, Ll/֨ۚ֫;

    invoke-direct {v1, v0, p1, p2}, Ll/֨ۚ֫;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILl/۠ۚ֫;)V

    iget-object p1, p0, Ll/᩹ۚ֫;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    iget-object v0, p0, Ll/᩹ۚ֫;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 174
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۚ֫;->᩻:Z

    if-eqz v1, :cond_0

    .line 175
    monitor-exit v0

    return-void

    .line 177
    :cond_0
    iget-object v1, p0, Ll/᩹ۚ֫;->ܿ:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v2, Ll/᩸ۚ֫;

    invoke-direct {v2, p1}, Ll/᩸ۚ֫;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 178
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/֡᩵֫;)V
    .locals 4

    .line 189
    invoke-direct {p0}, Ll/᩹ۚ֫;->ܽ()V

    .line 190
    iget-object v0, p0, Ll/᩹ۚ֫;->ܿ:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸ۚ֫;

    .line 191
    iget-object v3, v2, Ll/᩸ۚ֫;->ۧ:Ljava/lang/Object;

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 192
    iget-object v3, p0, Ll/᩹ۚ֫;->ᩳ:Ll/ܶۚ֫;

    invoke-virtual {v2, v3}, Ll/᩸ۚ֫;->ۧ(Ll/ܶۚ֫;)V

    .line 193
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 272
    invoke-direct {p0}, Ll/᩹ۚ֫;->ܽ()V

    .line 273
    iget-object v0, p0, Ll/᩹ۚ֫;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 274
    :try_start_0
    iput-boolean v1, p0, Ll/᩹ۚ֫;->᩻:Z

    .line 275
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    iget-object v0, p0, Ll/᩹ۚ֫;->ܿ:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۚ֫;

    .line 277
    iget-object v2, p0, Ll/᩹ۚ֫;->ᩳ:Ll/ܶۚ֫;

    invoke-virtual {v1, v2}, Ll/᩸ۚ֫;->ۧ(Ll/ܶۚ֫;)V

    goto :goto_0

    .line 279
    :cond_0
    iget-object v0, p0, Ll/᩹ۚ֫;->ܿ:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    return-void

    :catchall_0
    move-exception v1

    .line 275
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۧ(ILl/۠ۚ֫;)V
    .locals 0

    .line 262
    invoke-virtual {p0, p1, p2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    .line 263
    invoke-virtual {p0}, Ll/᩹ۚ֫;->֫()V

    return-void
.end method
