.class public final Ll/ۨۜ;
.super Ll/ܿۛ;
.source "E5GW"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public final ֫:Landroid/view/ActionProvider;

.field public ۧ:Ll/ᩳۛ;

.field public final synthetic ܽ:Ll/֫᩷;


# direct methods
.method public constructor <init>(Ll/֫᩷;Landroid/view/ActionProvider;)V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 428
    iput-object p1, p0, Ll/ۨۜ;->ܽ:Ll/֫᩷;

    .line 430
    iput-object p2, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    return-void
.end method

.method public static synthetic ֫(Ll/ۨۜ;)Landroid/view/ActionProvider;
    .locals 0

    .line 423
    iget-object p0, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    return-object p0
.end method


# virtual methods
.method public final onActionProviderVisibilityChanged(Z)V
    .locals 1

    .line 461
    iget-object p1, p0, Ll/ۨۜ;->ۧ:Ll/ᩳۛ;

    if-eqz p1, :cond_0

    .line 462
    check-cast p1, Ll/ۤۜ;

    .line 806
    iget-object p1, p1, Ll/ۤۜ;->֫:Ll/ۛۜ;

    iget-object v0, p1, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->onItemVisibleChanged(Ll/ۛۜ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۛۜ;)Landroid/view/View;
    .locals 1

    .line 435
    iget-object v0, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳۛ;)V
    .locals 0

    .line 455
    iput-object p1, p0, Ll/ۨۜ;->ۧ:Ll/ᩳۛ;

    .line 456
    iget-object p1, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    invoke-virtual {p1, p0}, Landroid/view/ActionProvider;->setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V

    return-void
.end method

.method public final ֫(Ll/᩵᩷;)V
    .locals 1

    .line 484
    iget-object v0, p0, Ll/ۨۜ;->ܽ:Ll/֫᩷;

    invoke-virtual {v0, p1}, Ll/ܺۜ;->֫(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object p1

    iget-object v0, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 479
    iget-object v0, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->hasSubMenu()Z

    move-result v0

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 445
    iget-object v0, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->isVisible()Z

    move-result v0

    return v0
.end method

.method public final ܽ()Landroid/view/View;
    .locals 1

    .line 474
    iget-object v0, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onCreateActionView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 440
    iget-object v0, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->overridesItemVisibility()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 468
    iget-object v0, p0, Ll/ۨۜ;->֫:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onPerformDefaultAction()Z

    move-result v0

    return v0
.end method
