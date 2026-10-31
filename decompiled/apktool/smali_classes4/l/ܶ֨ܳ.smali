.class public final synthetic Ll/ܶ֨ܳ;
.super Ljava/lang/Object;
.source "E4GI"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/֡ۚۢ;

.field public final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ᩸:Ll/۫֨ܳ;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public synthetic constructor <init>(Ll/۫֨ܳ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ֨ܳ;->᩸:Ll/۫֨ܳ;

    iput-object p2, p0, Ll/ܶ֨ܳ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p3, p0, Ll/ܶ֨ܳ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Ll/ܶ֨ܳ;->ۙ:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 2
    iget-object p1, p0, Ll/ܶ֨ܳ;->᩸:Ll/۫֨ܳ;

    .line 4
    iget-object v0, p0, Ll/ܶ֨ܳ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    iget-object v1, p0, Ll/ܶ֨ܳ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    iget-object v2, p0, Ll/ܶ֨ܳ;->ۙ:Ll/֡ۚۢ;

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gez v0, :cond_0

    return-void

    :cond_0
    move-object v0, p1

    .line 271
    monitor-enter v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 272
    :try_start_0
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 273
    invoke-virtual {v2}, Ll/֡ۚۢ;->dismiss()V

    .line 274
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 276
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
