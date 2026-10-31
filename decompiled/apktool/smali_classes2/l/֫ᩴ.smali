.class public final Ll/֫ᩴ;
.super Ljava/lang/Object;
.source "V659"

# interfaces
.implements Ll/᩶ۜ;


# instance fields
.field public final synthetic ᩸:Ll/ۢᩴ;


# direct methods
.method public constructor <init>(Ll/ۢᩴ;)V
    .locals 0

    .line 1251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ᩴ;->᩸:Ll/ۢᩴ;

    return-void
.end method


# virtual methods
.method public final onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 1

    .line 1259
    iget-object v0, p0, Ll/֫ᩴ;->᩸:Ll/ۢᩴ;

    iget-object v0, v0, Ll/ۢᩴ;->mMenuBuilderCallback:Ll/᩶ۜ;

    if-eqz v0, :cond_0

    .line 1260
    invoke-interface {v0, p1, p2}, Ll/᩶ۜ;->onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onMenuModeChange(Ll/ۗۜ;)V
    .locals 2

    .line 1267
    iget-object v0, p0, Ll/֫ᩴ;->᩸:Ll/ۢᩴ;

    iget-object v1, v0, Ll/ۢᩴ;->mMenuView:Ll/ۡۢ;

    invoke-virtual {v1}, Ll/ۡۢ;->᩷()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1268
    iget-object v1, v0, Ll/ۢᩴ;->mMenuHostHelper:Ll/۫ۛ;

    invoke-virtual {v1, p1}, Ll/۫ۛ;->ۧ(Landroid/view/Menu;)V

    .line 1271
    :cond_0
    iget-object v0, v0, Ll/ۢᩴ;->mMenuBuilderCallback:Ll/᩶ۜ;

    if-eqz v0, :cond_1

    .line 1272
    invoke-interface {v0, p1}, Ll/᩶ۜ;->onMenuModeChange(Ll/ۗۜ;)V

    :cond_1
    return-void
.end method
