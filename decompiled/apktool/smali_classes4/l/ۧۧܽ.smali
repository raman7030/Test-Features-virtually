.class public final Ll/ۧۧܽ;
.super Ljava/lang/Object;
.source "TAN9"

# interfaces
.implements Ll/ۨۧܽ;


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public final ۧ:Landroidx/window/extensions/layout/WindowLayoutComponent;

.field public final ܽ:Ljava/util/concurrent/locks/ReentrantLock;

.field public final ᩳ:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Landroidx/window/extensions/layout/WindowLayoutComponent;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/ۧۧܽ;->ۧ:Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 40
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Ll/ۧۧܽ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 42
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/ۧۧܽ;->֫:Ljava/util/LinkedHashMap;

    .line 44
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/ۧۧܽ;->ᩳ:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/app/Activity;Ll/᩺᩹ۧ;Ll/ۧܽܽ;)V
    .locals 3

    .line 2
    iget-object p2, p0, Ll/ۧۧܽ;->֫:Ljava/util/LinkedHashMap;

    .line 59
    iget-object v0, p0, Ll/ۧۧܽ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 60
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۧܽ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Ll/ۧۧܽ;->ᩳ:Ljava/util/LinkedHashMap;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 61
    :cond_0
    :try_start_1
    invoke-virtual {v1, p3}, Ll/֫ۧܽ;->֫(Ll/ۧܽܽ;)V

    .line 62
    invoke-interface {v2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    :goto_0
    if-nez v1, :cond_1

    .line 64
    new-instance v1, Ll/֫ۧܽ;

    invoke-direct {v1, p1}, Ll/֫ۧܽ;-><init>(Landroid/app/Activity;)V

    .line 65
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    invoke-interface {v2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    invoke-virtual {v1, p3}, Ll/֫ۧܽ;->֫(Ll/ۧܽܽ;)V

    .line 68
    iget-object p2, p0, Ll/ۧۧܽ;->ۧ:Landroidx/window/extensions/layout/WindowLayoutComponent;

    invoke-interface {p2, p1, v1}, Landroidx/window/extensions/layout/WindowLayoutComponent;->addWindowLayoutInfoListener(Landroid/app/Activity;Ljava/util/function/Consumer;)V

    .line 70
    :cond_1
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
    .locals 3

    const-string v0, "callback"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Ll/ۧۧܽ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 80
    :try_start_0
    iget-object v1, p0, Ll/ۧۧܽ;->ᩳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    .line 81
    :cond_0
    :try_start_1
    iget-object v2, p0, Ll/ۧۧܽ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۧܽ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    .line 82
    :cond_1
    :try_start_2
    invoke-virtual {v1, p1}, Ll/֫ۧܽ;->֫(Ll/۬ۤ;)V

    .line 83
    invoke-virtual {v1}, Ll/֫ۧܽ;->֫()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 84
    iget-object p1, p0, Ll/ۧۧܽ;->ۧ:Landroidx/window/extensions/layout/WindowLayoutComponent;

    invoke-interface {p1, v1}, Landroidx/window/extensions/layout/WindowLayoutComponent;->removeWindowLayoutInfoListener(Ljava/util/function/Consumer;)V

    .line 86
    :cond_2
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method
