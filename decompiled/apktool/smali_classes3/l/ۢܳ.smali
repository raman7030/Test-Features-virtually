.class public final Ll/ۢܳ;
.super Ll/ܳۜ;
.source "422Y"


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public final synthetic ۬:Ll/ۚܳ;

.field public ᩶:Z

.field public ᩹:Ll/֫ܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;Landroid/view/Window$Callback;)V
    .locals 0

    .line 3382
    iput-object p1, p0, Ll/ۢܳ;->۬:Ll/ۚܳ;

    .line 3383
    invoke-direct {p0, p2}, Ll/ܳۜ;-><init>(Landroid/view/Window$Callback;)V

    return-void
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 3392
    iget-boolean v0, p0, Ll/ۢܳ;->᩶:Z

    if-eqz v0, :cond_0

    .line 3393
    invoke-virtual {p0}, Ll/ܳۜ;->֫()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 3396
    :cond_0
    iget-object v0, p0, Ll/ۢܳ;->۬:Ll/ۚܳ;

    invoke-virtual {v0, p1}, Ll/ۚܳ;->֫(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3397
    invoke-super {p0, p1}, Ll/ܳۜ;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 3402
    invoke-super {p0, p1}, Ll/ܳۜ;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۢܳ;->۬:Ll/ۚܳ;

    .line 3403
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Ll/ۚܳ;->֫(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onContentChanged()V
    .locals 1

    .line 3429
    iget-boolean v0, p0, Ll/ۢܳ;->ۙ:Z

    if-eqz v0, :cond_0

    .line 3430
    invoke-virtual {p0}, Ll/ܳۜ;->֫()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    :cond_0
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    if-nez p1, :cond_0

    .line 3408
    instance-of v0, p2, Ll/ۗۜ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3413
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܳۜ;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 2

    .line 3418
    iget-object v0, p0, Ll/ۢܳ;->᩹:Ll/֫ܳ;

    if-eqz v0, :cond_1

    .line 3419
    check-cast v0, Ll/ۛܳ;

    if-nez p1, :cond_0

    .line 538
    new-instance v1, Landroid/view/View;

    iget-object v0, v0, Ll/ۛܳ;->֫:Ll/ۨܳ;

    iget-object v0, v0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    return-object v1

    .line 3424
    :cond_1
    invoke-super {p0, p1}, Ll/ܳۜ;->onCreatePanelView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    .line 3473
    invoke-super {p0, p1, p2}, Ll/ܳۜ;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 3474
    iget-object p2, p0, Ll/ۢܳ;->۬:Ll/ۚܳ;

    invoke-virtual {p2, p1}, Ll/ۚܳ;->᩷(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    .line 3480
    iget-boolean v0, p0, Ll/ۢܳ;->ۗ:Z

    if-eqz v0, :cond_0

    .line 3481
    invoke-virtual {p0}, Ll/ܳۜ;->֫()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    .line 3485
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܳۜ;->onPanelClosed(ILandroid/view/Menu;)V

    .line 3486
    iget-object p2, p0, Ll/ۢܳ;->۬:Ll/ۚܳ;

    invoke-virtual {p2, p1}, Ll/ۚܳ;->ۢ(I)V

    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 5

    .line 3440
    instance-of v0, p3, Ll/ۗۜ;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ll/ۗۜ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 3453
    invoke-virtual {v0, v2}, Ll/ۗۜ;->setOverrideVisibleItems(Z)V

    .line 3457
    :cond_2
    iget-object v3, p0, Ll/ۢܳ;->᩹:Ll/֫ܳ;

    if-eqz v3, :cond_3

    check-cast v3, Ll/ۛܳ;

    .line 523
    iget-object v3, v3, Ll/ۛܳ;->֫:Ll/ۨܳ;

    if-nez p1, :cond_3

    iget-boolean v4, v3, Ll/ۨܳ;->᩻:Z

    if-nez v4, :cond_3

    .line 524
    iget-object v4, v3, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v4}, Ll/ۖᩴ;->ܿ()V

    .line 525
    iput-boolean v2, v3, Ll/ۨܳ;->᩻:Z

    .line 3461
    :cond_3
    invoke-super {p0, p1, p2, p3}, Ll/ܳۜ;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    if-eqz v0, :cond_4

    .line 3465
    invoke-virtual {v0, v1}, Ll/ۗۜ;->setOverrideVisibleItems(Z)V

    :cond_4
    return p1
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2

    .line 3544
    iget-object v0, p0, Ll/ۢܳ;->۬:Ll/ۚܳ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 3545
    iget-object v0, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-eqz v0, :cond_0

    .line 3548
    invoke-super {p0, p1, v0, p3}, Ll/ܳۜ;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    return-void

    .line 3551
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/ܳۜ;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 4

    .line 3492
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return-object v2

    .line 3497
    :cond_0
    iget-object v0, p0, Ll/ۢܳ;->۬:Ll/ۚܳ;

    invoke-virtual {v0}, Ll/ۚܳ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3511
    new-instance v1, Ll/ۛ᩻;

    iget-object v3, v0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-direct {v1, v3, p1}, Ll/ۛ᩻;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 3516
    invoke-virtual {v0, v1}, Ll/ۚܳ;->֫(Ll/ۛ᩻;)Ll/ۗ᩻;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3520
    invoke-virtual {v1, p1}, Ll/ۛ᩻;->ۧ(Ll/ۗ᩻;)Ll/ۨ᩻;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v2

    .line 3501
    :cond_2
    invoke-super {p0, p1}, Ll/ܳۜ;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 2

    .line 3529
    iget-object v0, p0, Ll/ۢܳ;->۬:Ll/ۚܳ;

    invoke-virtual {v0}, Ll/ۚܳ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 3511
    :cond_0
    new-instance p2, Ll/ۛ᩻;

    iget-object v1, v0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-direct {p2, v1, p1}, Ll/ۛ᩻;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 3516
    invoke-virtual {v0, p2}, Ll/ۚܳ;->֫(Ll/ۛ᩻;)Ll/ۗ᩻;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3520
    invoke-virtual {p2, p1}, Ll/ۛ᩻;->ۧ(Ll/ۗ᩻;)Ll/ۨ᩻;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    .line 3537
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Ll/ܳۜ;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/view/Window$Callback;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3564
    :try_start_0
    iput-boolean v0, p0, Ll/ۢܳ;->ۙ:Z

    .line 3565
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3567
    iput-boolean v1, p0, Ll/ۢܳ;->ۙ:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Ll/ۢܳ;->ۙ:Z

    .line 3568
    throw p1
.end method

.method public final ֫(Landroid/view/Window$Callback;ILandroid/view/Menu;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3600
    :try_start_0
    iput-boolean v0, p0, Ll/ۢܳ;->ۗ:Z

    .line 3601
    invoke-interface {p1, p2, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3603
    iput-boolean v1, p0, Ll/ۢܳ;->ۗ:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Ll/ۢܳ;->ۗ:Z

    .line 3604
    throw p1
.end method

.method public final ֫(Ll/֫ܳ;)V
    .locals 0

    .line 3387
    iput-object p1, p0, Ll/ۢܳ;->᩹:Ll/֫ܳ;

    return-void
.end method

.method public final ֫(Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3582
    :try_start_0
    iput-boolean v0, p0, Ll/ۢܳ;->᩶:Z

    .line 3583
    invoke-interface {p1, p2}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3585
    iput-boolean v1, p0, Ll/ۢܳ;->᩶:Z

    return p1

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Ll/ۢܳ;->᩶:Z

    .line 3586
    throw p1
.end method
