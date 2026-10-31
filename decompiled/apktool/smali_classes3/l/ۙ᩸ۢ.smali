.class public final synthetic Ll/ۙ᩸ۢ;
.super Ljava/lang/Object;
.source "N1TT"

# interfaces
.implements Ll/ܶۖ;
.implements Ll/ۢ۠ۡ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۙ᩸ۢ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۙ᩸ۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۙ᩸ۢ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/۟᩸ۢ;

    iget-object v1, p0, Ll/ۙ᩸ۢ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/֡ۚۢ;

    invoke-static {v0, v1, p1}, Ll/۟᩸ۢ;->֫(Ll/۟᩸ۢ;Ll/֡ۚۢ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ֫(I[B)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۙ᩸ۢ;->᩸:Ljava/lang/Object;

    .line 4
    move-object v1, v0

    check-cast v1, Ll/ۡܰۡ;

    .line 6
    iget-object v0, p0, Ll/ۙ᩸ۢ;->᩹:Ljava/lang/Object;

    .line 8
    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v0, v1

    .line 1342
    monitor-enter v0

    .line 1343
    :try_start_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v2

    invoke-static {v2}, Ll/ܽۛܽ;->֫(I)Ljava/lang/String;

    move-result-object v2

    .line 1344
    invoke-virtual {v1, v2}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 1345
    invoke-virtual {v1, p2, v2, p1}, Ll/ۡܰۡ;->write([BII)V

    .line 1346
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ֫(Ll/᩻ᩴۡ;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۙ᩸ۢ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۬۬ܿ;

    .line 6
    iget-object v1, p0, Ll/ۙ᩸ۢ;->᩹:Ljava/lang/Object;

    .line 8
    check-cast v1, Ll/֡ۚۢ;

    .line 10
    sget v2, Ll/ۛۚۡ;->ۢۧ:I

    const-string v2, "response"

    .line 0
    invoke-static {p1, v2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 691
    invoke-virtual {v0}, Ll/۬۬ܿ;->֫()V

    .line 692
    invoke-virtual {p1}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f120b06

    .line 693
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 694
    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    return-void

    :cond_0
    const v0, 0x7f120ae4

    .line 185
    invoke-static {p1, v0}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object p1

    .line 696
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void
.end method
