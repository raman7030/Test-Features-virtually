.class public final Ll/ۛۧܽ;
.super Ljava/lang/Object;
.source "NAO7"

# interfaces
.implements Ll/ۨۧܽ;


# static fields
.field public static volatile ܽ:Ll/ۛۧܽ;

.field public static final ᩳ:Ljava/util/concurrent/locks/ReentrantLock;


# instance fields
.field public ֫:Ll/۟֫ܽ;

.field public final ۧ:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 174
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Ll/ۛۧܽ;->ᩳ:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method public constructor <init>(Ll/۬ۧܽ;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/ۛۧܽ;->֫:Ll/۟֫ܽ;

    .line 50
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛۧܽ;->ۧ:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez p1, :cond_0

    return-void

    .line 51
    :cond_0
    new-instance v0, Ll/۫ۧܽ;

    invoke-direct {v0, p0}, Ll/۫ۧܽ;-><init>(Ll/ۛۧܽ;)V

    invoke-virtual {p1, v0}, Ll/۬ۧܽ;->֫(Ll/۫ۧܽ;)V

    return-void
.end method

.method public static final synthetic ֫(Ll/ۛۧܽ;)V
    .locals 0

    .line 36
    sput-object p0, Ll/ۛۧܽ;->ܽ:Ll/ۛۧܽ;

    return-void
.end method

.method public static final synthetic ۧ()Ll/ۛۧܽ;
    .locals 1

    .line 36
    sget-object v0, Ll/ۛۧܽ;->ܽ:Ll/ۛۧܽ;

    return-object v0
.end method

.method public static final synthetic ܽ()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .line 36
    sget-object v0, Ll/ۛۧܽ;->ᩳ:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۛۧܽ;->ۧ:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public final ֫(Landroid/app/Activity;Ll/᩺᩹ۧ;Ll/ۧܽܽ;)V
    .locals 6

    .line 59
    sget-object v0, Ll/ۛۧܽ;->ᩳ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 39
    :try_start_0
    iget-object v1, p0, Ll/ۛۧܽ;->֫:Ll/۟֫ܽ;

    if-nez v1, :cond_0

    .line 65
    new-instance p1, Ll/ܿܽܽ;

    sget-object p2, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    invoke-direct {p1, p2}, Ll/ܿܽܽ;-><init>(Ljava/util/List;)V

    invoke-virtual {p3, p1}, Ll/ۧܽܽ;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 246
    iget-object v3, p0, Ll/ۛۧܽ;->ۧ:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v3, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    :try_start_1
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    .line 247
    :cond_2
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤۧܽ;

    .line 91
    invoke-virtual {v5}, Ll/ۤۧܽ;->֫()Landroid/app/Activity;

    move-result-object v5

    invoke-static {v5, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v2, 0x0

    .line 72
    :goto_2
    new-instance v4, Ll/ۤۧܽ;

    invoke-direct {v4, p1, p2, p3}, Ll/ۤۧܽ;-><init>(Landroid/app/Activity;Ll/᩺᩹ۧ;Ll/ۧܽܽ;)V

    .line 73
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    if-nez v2, :cond_5

    .line 75
    invoke-interface {v1, p1}, Ll/۟֫ܽ;->֫(Landroid/app/Activity;)V

    goto :goto_5

    .line 244
    :cond_5
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 v1, 0x0

    if-eqz p3, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Ll/ۤۧܽ;

    .line 80
    invoke-virtual {v2}, Ll/ۤۧܽ;->֫()Landroid/app/Activity;

    move-result-object v2

    .line 169
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_7
    move-object p3, v1

    .line 79
    :goto_3
    check-cast p3, Ll/ۤۧܽ;

    if-nez p3, :cond_8

    goto :goto_4

    .line 81
    :cond_8
    invoke-virtual {p3}, Ll/ۤۧܽ;->ܽ()Ll/ܿܽܽ;

    move-result-object v1

    :goto_4
    if-eqz v1, :cond_9

    .line 83
    invoke-virtual {v4, v1}, Ll/ۤۧܽ;->֫(Ll/ܿܽܽ;)V

    .line 86
    :cond_9
    :goto_5
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final ֫(Ll/۬ۤ;)V
    .locals 5

    const-string v0, "callback"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    sget-object v0, Ll/ۛۧܽ;->ᩳ:Ljava/util/concurrent/locks/ReentrantLock;

    monitor-enter v0

    .line 39
    :try_start_0
    iget-object v1, p0, Ll/ۛۧܽ;->֫:Ll/۟֫ܽ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 101
    monitor-exit v0

    return-void

    .line 106
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    iget-object v2, p0, Ll/ۛۧܽ;->ۧ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 107
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۧܽ;

    .line 108
    invoke-virtual {v3}, Ll/ۤۧܽ;->ۧ()Ll/۬ۤ;

    move-result-object v4

    if-ne v4, p1, :cond_1

    .line 110
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_2
    iget-object p1, p0, Ll/ۛۧܽ;->ۧ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 114
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 115
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۧܽ;

    .line 116
    invoke-virtual {v1}, Ll/ۤۧܽ;->֫()Landroid/app/Activity;

    move-result-object v1

    .line 127
    iget-object v2, p0, Ll/ۛۧܽ;->ۧ:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v2, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_4

    .line 249
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_3

    .line 250
    :cond_4
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۧܽ;

    .line 128
    invoke-virtual {v3}, Ll/ۤۧܽ;->֫()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_1

    .line 134
    :cond_6
    :goto_3
    iget-object v2, p0, Ll/ۛۧܽ;->֫:Ll/۟֫ܽ;

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    invoke-interface {v2, v1}, Ll/۟֫ܽ;->ۧ(Landroid/app/Activity;)V

    goto :goto_1

    .line 118
    :cond_8
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
