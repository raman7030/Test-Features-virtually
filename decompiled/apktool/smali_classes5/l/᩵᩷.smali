.class public Ll/᩵᩷;
.super Ll/ۗۜ;
.source "A53X"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public mItem:Ll/ۛۜ;

.field public mParentMenu:Ll/ۗۜ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ۗۜ;Ll/ۛۜ;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Ll/ۗۜ;-><init>(Landroid/content/Context;)V

    .line 44
    iput-object p2, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    .line 45
    iput-object p3, p0, Ll/᩵᩷;->mItem:Ll/ۛۜ;

    return-void
.end method


# virtual methods
.method public collapseItemActionView(Ll/ۛۜ;)Z
    .locals 1

    .line 137
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->collapseItemActionView(Ll/ۛۜ;)Z

    move-result p1

    return p1
.end method

.method public dispatchMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 1

    .line 89
    invoke-super {p0, p1, p2}, Ll/ۗۜ;->dispatchMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    .line 90
    invoke-virtual {v0, p1, p2}, Ll/ۗۜ;->dispatchMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z

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

.method public expandItemActionView(Ll/ۛۜ;)Z
    .locals 1

    .line 132
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->expandItemActionView(Ll/ۛۜ;)Z

    move-result p1

    return p1
.end method

.method public getActionViewStatesKey()Ljava/lang/String;
    .locals 3

    .line 142
    iget-object v0, p0, Ll/᩵᩷;->mItem:Ll/ۛۜ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۛۜ;->getItemId()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 146
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/ۗۜ;->getActionViewStatesKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItem()Landroid/view/MenuItem;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/᩵᩷;->mItem:Ll/ۛۜ;

    return-object v0
.end method

.method public getParentMenu()Landroid/view/Menu;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    return-object v0
.end method

.method public getRootMenu()Ll/ۗۜ;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->getRootMenu()Ll/ۗۜ;

    move-result-object v0

    return-object v0
.end method

.method public isGroupDividerEnabled()Z
    .locals 1

    .line 156
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->isGroupDividerEnabled()Z

    move-result v0

    return v0
.end method

.method public isQwertyMode()Z
    .locals 1

    .line 55
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->isQwertyMode()Z

    move-result v0

    return v0
.end method

.method public isShortcutsVisible()Z
    .locals 1

    .line 65
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->isShortcutsVisible()Z

    move-result v0

    return v0
.end method

.method public setCallback(Ll/᩶ۜ;)V
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->setCallback(Ll/᩶ۜ;)V

    return-void
.end method

.method public setGroupDividerEnabled(Z)V
    .locals 1

    .line 151
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->setGroupDividerEnabled(Z)V

    return-void
.end method

.method public setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 0

    .line 112
    invoke-super {p0, p1}, Ll/ۗۜ;->setHeaderIconInt(I)Ll/ۗۜ;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 0

    .line 107
    invoke-super {p0, p1}, Ll/ۗۜ;->setHeaderIconInt(Landroid/graphics/drawable/Drawable;)Ll/ۗۜ;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 0

    .line 122
    invoke-super {p0, p1}, Ll/ۗۜ;->setHeaderTitleInt(I)Ll/ۗۜ;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 117
    invoke-super {p0, p1}, Ll/ۗۜ;->setHeaderTitleInt(Ljava/lang/CharSequence;)Ll/ۗۜ;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 0

    .line 127
    invoke-super {p0, p1}, Ll/ۗۜ;->setHeaderViewInt(Landroid/view/View;)Ll/ۗۜ;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/᩵᩷;->mItem:Ll/ۛۜ;

    invoke-virtual {v0, p1}, Ll/ۛۜ;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/᩵᩷;->mItem:Ll/ۛۜ;

    invoke-virtual {v0, p1}, Ll/ۛۜ;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setQwertyMode(Z)V
    .locals 1

    .line 50
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->setQwertyMode(Z)V

    return-void
.end method

.method public setShortcutsVisible(Z)V
    .locals 1

    .line 60
    iget-object v0, p0, Ll/᩵᩷;->mParentMenu:Ll/ۗۜ;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->setShortcutsVisible(Z)V

    return-void
.end method
