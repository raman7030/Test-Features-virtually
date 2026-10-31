.class public final Ll/ۨܳ;
.super Ll/ۤᩳ;
.source "A5FO"


# instance fields
.field public final ֫:Ll/ۖᩴ;

.field public final ۜ:Landroid/view/Window$Callback;

.field public ۧ:Z

.field public ܳ:Ljava/util/ArrayList;

.field public final ܽ:Ll/ۛܳ;

.field public final ܿ:Ljava/lang/Runnable;

.field public ᩳ:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۢᩴ;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V
    .locals 3

    .line 71
    invoke-direct {p0}, Ll/ۤᩳ;-><init>()V

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۨܳ;->ܳ:Ljava/util/ArrayList;

    .line 55
    new-instance v0, Ll/ۗܳ;

    invoke-direct {v0, p0}, Ll/ۗܳ;-><init>(Ll/ۨܳ;)V

    iput-object v0, p0, Ll/ۨܳ;->ܿ:Ljava/lang/Runnable;

    .line 62
    new-instance v0, Ll/۬ܳ;

    invoke-direct {v0, p0}, Ll/۬ܳ;-><init>(Ll/ۨܳ;)V

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    new-instance v1, Ll/ۖᩴ;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ll/ۖᩴ;-><init>(Ll/ۢᩴ;Z)V

    iput-object v1, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    .line 136
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    iput-object p3, p0, Ll/ۨܳ;->ۜ:Landroid/view/Window$Callback;

    .line 76
    invoke-virtual {v1, p3}, Ll/ۖᩴ;->֫(Landroid/view/Window$Callback;)V

    .line 77
    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setOnMenuItemClickListener(Ll/᩻ᩴ;)V

    .line 78
    invoke-virtual {v1, p2}, Ll/ۖᩴ;->֫(Ljava/lang/CharSequence;)V

    .line 80
    new-instance p1, Ll/ۛܳ;

    invoke-direct {p1, p0}, Ll/ۛܳ;-><init>(Ll/ۨܳ;)V

    iput-object p1, p0, Ll/ۨܳ;->ܽ:Ll/ۛܳ;

    return-void
.end method

.method private ۢ()Landroid/view/Menu;
    .locals 3

    .line 545
    iget-boolean v0, p0, Ll/ۨܳ;->ᩳ:Z

    iget-object v1, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    if-nez v0, :cond_0

    .line 546
    new-instance v0, Ll/۫ܳ;

    invoke-direct {v0, p0}, Ll/۫ܳ;-><init>(Ll/ۨܳ;)V

    new-instance v2, Ll/ۤܳ;

    invoke-direct {v2, p0}, Ll/ۤܳ;-><init>(Ll/ۨܳ;)V

    invoke-virtual {v1, v0, v2}, Ll/ۖᩴ;->֫(Ll/ܿ᩷;Ll/᩶ۜ;)V

    const/4 v0, 0x1

    .line 548
    iput-boolean v0, p0, Ll/ۨܳ;->ᩳ:Z

    .line 550
    :cond_0
    invoke-virtual {v1}, Ll/ۖᩴ;->ۡ()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 179
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0, p1}, Ll/ۖᩴ;->ۧ(I)V

    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0, p1}, Ll/ۖᩴ;->֫(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 231
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0, p1}, Ll/ۖᩴ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    .line 507
    iget-boolean v0, p0, Ll/ۨܳ;->ۧ:Z

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 510
    :cond_0
    iput-boolean p1, p0, Ll/ۨܳ;->ۧ:Z

    .line 512
    iget-object p1, p0, Ll/ۨܳ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 514
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ᩳ;

    invoke-interface {v2}, Ll/۫ᩳ;->֫()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 431
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ֫(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 479
    invoke-direct {p0}, Ll/ۨܳ;->ۢ()Landroid/view/Menu;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 482
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    .line 481
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    .line 483
    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 484
    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_1
    return v1
.end method

.method public final ֫(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 471
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 472
    invoke-virtual {p0}, Ll/ۨܳ;->ۜ()Z

    :cond_0
    return v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 426
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->ܽ()Z

    move-result v0

    return v0
.end method

.method public final ۧ(Z)V
    .locals 0

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 443
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 444
    invoke-virtual {v0}, Ll/ۖᩴ;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()V
    .locals 0

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 326
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->ۢ()I

    move-result v0

    return v0
.end method

.method public final ܽ(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 262
    :goto_0
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->ۢ()I

    move-result v1

    and-int/lit8 p1, p1, 0x4

    and-int/lit8 v1, v1, -0x5

    or-int/2addr p1, v1

    .line 263
    invoke-virtual {v0, p1}, Ll/ۖᩴ;->֫(I)V

    return-void
.end method

.method public final ܿ()Z
    .locals 3

    .line 436
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->ܺ()Ll/ۢᩴ;

    move-result-object v1

    iget-object v2, p0, Ll/ۨܳ;->ܿ:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 437
    invoke-virtual {v0}, Ll/ۖᩴ;->ܺ()Ll/ۢᩴ;

    move-result-object v0

    sget v1, Ll/ܿ᩺;->֫:I

    .line 1359
    invoke-virtual {v0, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Landroid/content/Context;
    .locals 1

    .line 149
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Z)V
    .locals 0

    return-void
.end method

.method public final ᩷()V
    .locals 6

    .line 451
    iget-object v0, p0, Ll/ۨܳ;->ۜ:Landroid/view/Window$Callback;

    invoke-direct {p0}, Ll/ۨܳ;->ۢ()Landroid/view/Menu;

    move-result-object v1

    .line 452
    instance-of v2, v1, Ll/ۗۜ;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ll/ۗۜ;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_1

    .line 454
    invoke-virtual {v2}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 457
    :cond_1
    :try_start_0
    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    const/4 v4, 0x0

    .line 458
    invoke-interface {v0, v4, v1}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 459
    invoke-interface {v0, v4, v3, v1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 460
    :cond_2
    invoke-interface {v1}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    if-eqz v2, :cond_4

    .line 464
    invoke-virtual {v2}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    .line 466
    :cond_5
    throw v0
.end method

.method public final ᩻()V
    .locals 2

    .line 492
    iget-object v0, p0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->ܺ()Ll/ۢᩴ;

    move-result-object v0

    iget-object v1, p0, Ll/ۨܳ;->ܿ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method
