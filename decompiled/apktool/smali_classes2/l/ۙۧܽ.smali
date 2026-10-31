.class public final Ll/ۙۧܽ;
.super Ljava/lang/Object;
.source "OANW"

# interfaces
.implements Landroidx/window/sidecar/SidecarInterface$SidecarCallback;


# instance fields
.field public final synthetic ֫:Ll/۬ۧܽ;


# direct methods
.method public constructor <init>(Ll/۬ۧܽ;)V
    .locals 0

    .line 334
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۧܽ;->֫:Ll/۬ۧܽ;

    return-void
.end method


# virtual methods
.method public ֫(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V
    .locals 2

    const-string v0, "windowToken"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newLayout"

    .line 11
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    iget-object v0, p0, Ll/ۙۧܽ;->֫:Ll/۬ۧܽ;

    invoke-static {v0}, Ll/۬ۧܽ;->ܽ(Ll/۬ۧܽ;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_0

    goto :goto_1

    .line 361
    :cond_0
    iget-object v0, p0, Ll/ۙۧܽ;->֫:Ll/۬ۧܽ;

    invoke-static {v0}, Ll/۬ۧܽ;->ۧ(Ll/۬ۧܽ;)Ll/۠ۧܽ;

    move-result-object v0

    .line 363
    iget-object v1, p0, Ll/ۙۧܽ;->֫:Ll/۬ۧܽ;

    invoke-virtual {v1}, Ll/۬ۧܽ;->֫()Landroidx/window/sidecar/SidecarInterface;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Landroidx/window/sidecar/SidecarInterface;->getDeviceState()Landroidx/window/sidecar/SidecarDeviceState;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_2

    new-instance v1, Landroidx/window/sidecar/SidecarDeviceState;

    invoke-direct {v1}, Landroidx/window/sidecar/SidecarDeviceState;-><init>()V

    .line 361
    :cond_2
    invoke-virtual {v0, p2, v1}, Ll/۠ۧܽ;->֫(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Ll/ܿܽܽ;

    move-result-object p2

    .line 365
    iget-object v0, p0, Ll/ۙۧܽ;->֫:Ll/۬ۧܽ;

    invoke-static {v0}, Ll/۬ۧܽ;->֫(Ll/۬ۧܽ;)Ll/ܰ֫ܽ;

    move-result-object v0

    if-nez v0, :cond_3

    :goto_1
    return-void

    :cond_3
    check-cast v0, Ll/᩸ۧܽ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۧܽ;->֫(Landroid/app/Activity;Ll/ܿܽܽ;)V

    return-void
.end method

.method public ֫(Landroidx/window/sidecar/SidecarDeviceState;)V
    .locals 6

    const-string v0, "newDeviceState"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    iget-object v0, p0, Ll/ۙۧܽ;->֫:Ll/۬ۧܽ;

    invoke-static {v0}, Ll/۬ۧܽ;->ܽ(Ll/۬ۧܽ;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Ll/ۙۧܽ;->֫:Ll/۬ۧܽ;

    .line 1849
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_1

    .line 475
    :cond_0
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    if-nez v4, :cond_2

    :goto_1
    move-object v4, v3

    goto :goto_2

    :cond_2
    iget-object v4, v4, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    :goto_2
    if-nez v4, :cond_3

    goto :goto_3

    .line 339
    :cond_3
    invoke-virtual {v1}, Ll/۬ۧܽ;->֫()Landroidx/window/sidecar/SidecarInterface;

    move-result-object v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v5, v4}, Landroidx/window/sidecar/SidecarInterface;->getWindowLayoutInfo(Landroid/os/IBinder;)Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    move-result-object v3

    .line 340
    :goto_3
    invoke-static {v1}, Ll/۬ۧܽ;->֫(Ll/۬ۧܽ;)Ll/ܰ֫ܽ;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_0

    .line 342
    :cond_5
    invoke-static {v1}, Ll/۬ۧܽ;->ۧ(Ll/۬ۧܽ;)Ll/۠ۧܽ;

    move-result-object v5

    invoke-virtual {v5, v3, p1}, Ll/۠ۧܽ;->֫(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Ll/ܿܽܽ;

    move-result-object v3

    .line 340
    check-cast v4, Ll/᩸ۧܽ;

    invoke-virtual {v4, v2, v3}, Ll/᩸ۧܽ;->֫(Landroid/app/Activity;Ll/ܿܽܽ;)V

    goto :goto_0

    :cond_6
    return-void
.end method
