.class public final Ll/ۤܳ;
.super Ljava/lang/Object;
.source "A5FO"

# interfaces
.implements Ll/᩶ۜ;


# instance fields
.field public final synthetic ᩸:Ll/ۨܳ;


# direct methods
.method public constructor <init>(Ll/ۨܳ;)V
    .locals 0

    .line 580
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤܳ;->᩸:Ll/ۨܳ;

    return-void
.end method


# virtual methods
.method public final onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onMenuModeChange(Ll/ۗۜ;)V
    .locals 4

    .line 590
    iget-object v0, p0, Ll/ۤܳ;->᩸:Ll/ۨܳ;

    iget-object v1, v0, Ll/ۨܳ;->ۜ:Landroid/view/Window$Callback;

    iget-object v0, v0, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->ᩳ()Z

    move-result v0

    const/16 v2, 0x6c

    if-eqz v0, :cond_0

    .line 591
    invoke-interface {v1, v2, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 592
    invoke-interface {v1, v0, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 593
    invoke-interface {v1, v2, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    return-void
.end method
