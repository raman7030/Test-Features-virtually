.class public final Ll/֡᩷;
.super Ll/᩷᩷;
.source "K4O7"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public final ܿ:Ll/۟۬;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/۟۬;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Ll/᩷᩷;-><init>(Landroid/content/Context;Ll/᩺۬;)V

    .line 39
    iput-object p2, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    return-void
.end method


# virtual methods
.method public final clearHeader()V
    .locals 1

    .line 74
    iget-object v0, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    return-void
.end method

.method public final getItem()Landroid/view/MenuItem;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܺۜ;->֫(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public final setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(I)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(I)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(I)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/֡᩷;->ܿ:Ll/۟۬;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;

    return-object p0
.end method
