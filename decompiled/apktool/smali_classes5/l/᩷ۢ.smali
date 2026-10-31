.class public final Ll/᩷ۢ;
.super Ljava/lang/Object;
.source "M5Y2"

# interfaces
.implements Ll/᩶ۜ;


# instance fields
.field public final synthetic ᩸:Ll/ۡۢ;


# direct methods
.method public constructor <init>(Ll/ۡۢ;)V
    .locals 0

    .line 763
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۢ;->᩸:Ll/ۡۢ;

    return-void
.end method


# virtual methods
.method public final onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 3

    .line 768
    iget-object p1, p0, Ll/᩷ۢ;->᩸:Ll/ۡۢ;

    iget-object p1, p1, Ll/ۡۢ;->ۤ:Ll/ۢۢ;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 769
    check-cast p1, Ll/ܰۘ;

    .line 220
    iget-object p1, p1, Ll/ܰۘ;->֫:Ll/ۢᩴ;

    iget-object v1, p1, Ll/ۢᩴ;->mMenuHostHelper:Ll/۫ۛ;

    invoke-virtual {v1, p2}, Ll/۫ۛ;->֫(Landroid/view/MenuItem;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    .line 223
    :cond_0
    iget-object p1, p1, Ll/ۢᩴ;->mOnMenuItemClickListener:Ll/᩻ᩴ;

    if-eqz p1, :cond_1

    .line 224
    invoke-interface {p1, p2}, Ll/᩻ᩴ;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final onMenuModeChange(Ll/ۗۜ;)V
    .locals 1

    .line 774
    iget-object v0, p0, Ll/᩷ۢ;->᩸:Ll/ۡۢ;

    iget-object v0, v0, Ll/ۡۢ;->۬:Ll/᩶ۜ;

    if-eqz v0, :cond_0

    .line 775
    invoke-interface {v0, p1}, Ll/᩶ۜ;->onMenuModeChange(Ll/ۗۜ;)V

    :cond_0
    return-void
.end method
