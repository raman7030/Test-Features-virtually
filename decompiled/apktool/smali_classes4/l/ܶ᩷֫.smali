.class public final Ll/ܶ᩷֫;
.super Ll/ۙ᩷֫;
.source "VB94"


# instance fields
.field public final ۜ:Ll/ۛۜ֫;


# direct methods
.method public constructor <init>(Ll/᩶᩷֫;Ll/᩹᩷֫;Ll/ۛۜ֫;Ll/᩻۫;)V
    .locals 1

    .line 726
    invoke-virtual {p3}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0, p4}, Ll/ۙ᩷֫;-><init>(Ll/᩶᩷֫;Ll/᩹᩷֫;Ll/ۡ᩻֫;Ll/᩻۫;)V

    .line 728
    iput-object p3, p0, Ll/ܶ᩷֫;->ۜ:Ll/ۛۜ֫;

    return-void
.end method


# virtual methods
.method public final ۜ()V
    .locals 5

    .line 733
    invoke-virtual {p0}, Ll/ۙ᩷֫;->ܿ()Ll/᩹᩷֫;

    move-result-object v0

    sget-object v1, Ll/᩹᩷֫;->᩹:Ll/᩹᩷֫;

    const/4 v2, 0x2

    iget-object v3, p0, Ll/ܶ᩷֫;->ۜ:Ll/ۛۜ֫;

    if-ne v0, v1, :cond_3

    .line 734
    invoke-virtual {v3}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    .line 735
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 737
    invoke-virtual {v0, v1}, Ll/ۡ᩻֫;->setFocusedView(Landroid/view/View;)V

    .line 738
    invoke-static {v2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 739
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 743
    :cond_0
    invoke-virtual {p0}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireView()Landroid/view/View;

    move-result-object v1

    .line 747
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const/4 v4, 0x0

    if-nez v2, :cond_1

    .line 748
    invoke-virtual {v3}, Ll/ۛۜ֫;->֫()V

    .line 749
    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 753
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v2

    cmpl-float v2, v2, v4

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x4

    .line 754
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 756
    :cond_2
    invoke-virtual {v0}, Ll/ۡ᩻֫;->getPostOnViewCreatedAlpha()F

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    .line 757
    :cond_3
    invoke-virtual {p0}, Ll/ۙ᩷֫;->ܿ()Ll/᩹᩷֫;

    move-result-object v0

    sget-object v1, Ll/᩹᩷֫;->ۙ:Ll/᩹᩷֫;

    if-ne v0, v1, :cond_5

    .line 758
    invoke-virtual {v3}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    .line 759
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireView()Landroid/view/View;

    move-result-object v1

    .line 760
    invoke-static {v2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 761
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 764
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    :cond_5
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 770
    invoke-super {p0}, Ll/ۙ᩷֫;->ۧ()V

    .line 771
    iget-object v0, p0, Ll/ܶ᩷֫;->ۜ:Ll/ۛۜ֫;

    invoke-virtual {v0}, Ll/ۛۜ֫;->ۢ()V

    return-void
.end method
