.class public final Ll/۫᩻ۧ;
.super Ljava/lang/Object;
.source "68R4"

# interfaces
.implements Landroid/hardware/display/DisplayManager$DisplayListener;


# instance fields
.field public final ֫:Landroid/hardware/display/DisplayManager;

.field public final synthetic ۧ:Ll/ۛ᩻ۧ;


# direct methods
.method public constructor <init>(Ll/ۛ᩻ۧ;Landroid/hardware/display/DisplayManager;)V
    .locals 0

    .line 447
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩻ۧ;->ۧ:Ll/ۛ᩻ۧ;

    .line 448
    iput-object p2, p0, Ll/۫᩻ۧ;->֫:Landroid/hardware/display/DisplayManager;

    return-void
.end method


# virtual methods
.method public final onDisplayAdded(I)V
    .locals 0

    return-void
.end method

.method public final onDisplayChanged(I)V
    .locals 1

    if-nez p1, :cond_0

    .line 478
    iget-object p1, p0, Ll/۫᩻ۧ;->֫:Landroid/hardware/display/DisplayManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object p1

    .line 463
    iget-object v0, p0, Ll/۫᩻ۧ;->ۧ:Ll/ۛ᩻ۧ;

    invoke-static {v0, p1}, Ll/ۛ᩻ۧ;->֫(Ll/ۛ᩻ۧ;Landroid/view/Display;)V

    :cond_0
    return-void
.end method

.method public final onDisplayRemoved(I)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 715
    invoke-static {v0}, Ll/ۘ֨֫;->֫(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object v0

    .line 452
    iget-object v1, p0, Ll/۫᩻ۧ;->֫:Landroid/hardware/display/DisplayManager;

    invoke-virtual {v1, p0, v0}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    const/4 v0, 0x0

    .line 478
    invoke-virtual {v1, v0}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v0

    .line 453
    iget-object v1, p0, Ll/۫᩻ۧ;->ۧ:Ll/ۛ᩻ۧ;

    invoke-static {v1, v0}, Ll/ۛ᩻ۧ;->֫(Ll/ۛ᩻ۧ;Landroid/view/Display;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 457
    iget-object v0, p0, Ll/۫᩻ۧ;->֫:Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0, p0}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    return-void
.end method
