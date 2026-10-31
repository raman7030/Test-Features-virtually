.class public final Ll/ܿᩴ;
.super Ljava/lang/Object;
.source "V659"

# interfaces
.implements Ll/ܳ᩷;


# instance fields
.field public final synthetic ᩶:Ll/ۢᩴ;

.field public ᩸:Ll/ۛۜ;

.field public ᩹:Ll/ۗۜ;


# direct methods
.method public constructor <init>(Ll/ۢᩴ;)V
    .locals 0

    .line 2660
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿᩴ;->᩶:Ll/ۢᩴ;

    return-void
.end method


# virtual methods
.method public final collapseItemActionView(Ll/ۗۜ;Ll/ۛۜ;)Z
    .locals 2

    .line 2761
    iget-object p1, p0, Ll/ܿᩴ;->᩶:Ll/ۢᩴ;

    iget-object v0, p1, Ll/ۢᩴ;->mExpandedActionView:Landroid/view/View;

    instance-of v1, v0, Ll/۬᩻;

    if-eqz v1, :cond_0

    .line 2762
    check-cast v0, Ll/۬᩻;

    invoke-interface {v0}, Ll/۬᩻;->ۧ()V

    .line 2765
    :cond_0
    iget-object v0, p1, Ll/ۢᩴ;->mExpandedActionView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2766
    iget-object v0, p1, Ll/ۢᩴ;->mCollapseButtonView:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 2767
    iput-object v0, p1, Ll/ۢᩴ;->mExpandedActionView:Landroid/view/View;

    .line 2769
    invoke-virtual {p1}, Ll/ۢᩴ;->addChildrenForExpandedActionView()V

    .line 2770
    iput-object v0, p0, Ll/ܿᩴ;->᩸:Ll/ۛۜ;

    .line 2771
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    const/4 v0, 0x0

    .line 2772
    invoke-virtual {p2, v0}, Ll/ۛۜ;->֫(Z)V

    .line 2775
    invoke-virtual {p1}, Ll/ۢᩴ;->updateBackInvokedCallbackState()V

    const/4 p1, 0x1

    return p1
.end method

.method public final expandItemActionView(Ll/ۗۜ;Ll/ۛۜ;)Z
    .locals 3

    .line 2721
    iget-object p1, p0, Ll/ܿᩴ;->᩶:Ll/ۢᩴ;

    invoke-virtual {p1}, Ll/ۢᩴ;->ensureCollapseButtonView()V

    .line 2722
    iget-object v0, p1, Ll/ۢᩴ;->mCollapseButtonView:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p1, :cond_1

    .line 2724
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 2725
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p1, Ll/ۢᩴ;->mCollapseButtonView:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2727
    :cond_0
    iget-object v0, p1, Ll/ۢᩴ;->mCollapseButtonView:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2729
    :cond_1
    invoke-virtual {p2}, Ll/ۛۜ;->getActionView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Ll/ۢᩴ;->mExpandedActionView:Landroid/view/View;

    .line 2730
    iput-object p2, p0, Ll/ܿᩴ;->᩸:Ll/ۛۜ;

    .line 2731
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p1, :cond_3

    .line 2733
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    .line 2734
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p1, Ll/ۢᩴ;->mExpandedActionView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2736
    :cond_2
    invoke-virtual {p1}, Ll/ۢᩴ;->generateDefaultLayoutParams()Ll/ܳᩴ;

    move-result-object v0

    .line 2737
    iget v1, p1, Ll/ۢᩴ;->mButtonGravity:I

    and-int/lit8 v1, v1, 0x70

    const v2, 0x800003

    or-int/2addr v1, v2

    iput v1, v0, Ll/۬ᩳ;->֫:I

    const/4 v1, 0x2

    .line 2738
    iput v1, v0, Ll/ܳᩴ;->ۧ:I

    .line 2739
    iget-object v1, p1, Ll/ۢᩴ;->mExpandedActionView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2740
    iget-object v0, p1, Ll/ۢᩴ;->mExpandedActionView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2743
    :cond_3
    invoke-virtual {p1}, Ll/ۢᩴ;->removeChildrenForExpandedActionView()V

    .line 2744
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    const/4 v0, 0x1

    .line 2745
    invoke-virtual {p2, v0}, Ll/ۛۜ;->֫(Z)V

    .line 2747
    iget-object p2, p1, Ll/ۢᩴ;->mExpandedActionView:Landroid/view/View;

    instance-of v1, p2, Ll/۬᩻;

    if-eqz v1, :cond_4

    .line 2748
    check-cast p2, Ll/۬᩻;

    invoke-interface {p2}, Ll/۬᩻;->֫()V

    .line 2752
    :cond_4
    invoke-virtual {p1}, Ll/ۢᩴ;->updateBackInvokedCallbackState()V

    return v0
.end method

.method public final flagActionItems()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final initForMenu(Landroid/content/Context;Ll/ۗۜ;)V
    .locals 1

    .line 2666
    iget-object p1, p0, Ll/ܿᩴ;->᩹:Ll/ۗۜ;

    if-eqz p1, :cond_0

    iget-object v0, p0, Ll/ܿᩴ;->᩸:Ll/ۛۜ;

    if-eqz v0, :cond_0

    .line 2667
    invoke-virtual {p1, v0}, Ll/ۗۜ;->collapseItemActionView(Ll/ۛۜ;)Z

    .line 2669
    :cond_0
    iput-object p2, p0, Ll/ܿᩴ;->᩹:Ll/ۗۜ;

    return-void
.end method

.method public final onCloseMenu(Ll/ۗۜ;Z)V
    .locals 0

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final onSubMenuSelected(Ll/᩵᩷;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final updateMenuView(Z)V
    .locals 3

    .line 2680
    iget-object p1, p0, Ll/ܿᩴ;->᩸:Ll/ۛۜ;

    if-eqz p1, :cond_2

    .line 2683
    iget-object p1, p0, Ll/ܿᩴ;->᩹:Ll/ۗۜ;

    if-eqz p1, :cond_1

    .line 2684
    invoke-virtual {p1}, Ll/ۗۜ;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    .line 2686
    iget-object v1, p0, Ll/ܿᩴ;->᩹:Ll/ۗۜ;

    invoke-virtual {v1, v0}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 2687
    iget-object v2, p0, Ll/ܿᩴ;->᩸:Ll/ۛۜ;

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2696
    :cond_1
    iget-object p1, p0, Ll/ܿᩴ;->᩹:Ll/ۗۜ;

    iget-object v0, p0, Ll/ܿᩴ;->᩸:Ll/ۛۜ;

    invoke-virtual {p0, p1, v0}, Ll/ܿᩴ;->collapseItemActionView(Ll/ۗۜ;Ll/ۛۜ;)Z

    :cond_2
    return-void
.end method
