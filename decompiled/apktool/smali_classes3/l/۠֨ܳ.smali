.class public final synthetic Ll/۠֨ܳ;
.super Ljava/lang/Object;
.source "E4GI"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/۠֨ܳ;->᩸:I

    iput-object p1, p0, Ll/۠֨ܳ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/۠֨ܳ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/۠֨ܳ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 2
    iget p1, p0, Ll/۠֨ܳ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/۠֨ܳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/ܶᩴܺ;

    .line 11
    iget-object p2, p0, Ll/۠֨ܳ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast p2, Ljava/lang/Runnable;

    .line 15
    iget-object v0, p0, Ll/۠֨ܳ;->ۙ:Ljava/lang/Object;

    .line 17
    check-cast v0, Landroid/content/Context;

    .line 20
    invoke-static {v0, p1, p2}, Ll/᩸ᩴܺ;->֫(Landroid/content/Context;Ll/ܶᩴܺ;Ljava/lang/Runnable;)V

    return-void

    .line 23
    :pswitch_0
    iget-object p1, p0, Ll/۠֨ܳ;->᩹:Ljava/lang/Object;

    .line 25
    check-cast p1, Ll/۫֨ܳ;

    .line 27
    iget-object p2, p0, Ll/۠֨ܳ;->᩶:Ljava/lang/Object;

    .line 29
    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    iget-object v0, p0, Ll/۠֨ܳ;->ۙ:Ljava/lang/Object;

    .line 33
    move-object v1, v0

    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v0, p1

    .line 246
    monitor-enter v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 247
    :try_start_0
    invoke-virtual {p2, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    .line 248
    invoke-virtual {v1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 249
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 251
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
