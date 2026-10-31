.class public Ll/۟ۜ᩷;
.super Ljava/lang/Object;
.source "A7OH"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginView;


# instance fields
.field public ֫:Ljava/lang/String;

.field public final ۧ:Lbin/mt/plugin/api/ui/PluginViewGroup;

.field public final ܽ:Lbin/mt/plugin/api/ui/PluginUI;

.field public ܿ:Landroid/view/View;

.field public ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 29
    iput-object p2, p0, Ll/۟ۜ᩷;->ۧ:Lbin/mt/plugin/api/ui/PluginViewGroup;

    if-nez p2, :cond_1

    .line 30
    instance-of p1, p0, Lbin/mt/plugin/api/ui/PluginViewGroup;

    if-eqz p1, :cond_0

    return-void

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "PluginView which is not a PluginViewGroup must have a parent"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method


# virtual methods
.method public final findViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;
    .locals 1

    if-eqz p1, :cond_1

    .line 52
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->֫(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getAlpha()F
    .locals 1

    .line 559
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v0

    return v0
.end method

.method public final getBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 543
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    .line 170
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/۟ۜ᩷;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final getLayoutGravity()I
    .locals 2

    .line 148
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 149
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getLayoutWeight()F
    .locals 2

    .line 131
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 132
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getMarginBottom()I
    .locals 2

    .line 229
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 230
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getMarginLeft()I
    .locals 2

    .line 205
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 206
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getMarginRight()I
    .locals 2

    .line 221
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 222
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getMarginTop()I
    .locals 2

    .line 213
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 214
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getPaddingBottom()I
    .locals 1

    .line 200
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    return v0
.end method

.method public final getPaddingLeft()I
    .locals 1

    .line 185
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    return v0
.end method

.method public final getPaddingRight()I
    .locals 1

    .line 195
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    return v0
.end method

.method public final getPaddingTop()I
    .locals 1

    .line 190
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    return v0
.end method

.method public final getParentView()Lbin/mt/plugin/api/ui/PluginViewGroup;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/۟ۜ᩷;->ۧ:Lbin/mt/plugin/api/ui/PluginViewGroup;

    return-object v0
.end method

.method public final getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    return-object v0
.end method

.method public final getRootView()Lbin/mt/plugin/api/ui/PluginViewGroup;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/۟ۜ᩷;->ۧ:Lbin/mt/plugin/api/ui/PluginViewGroup;

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, Lbin/mt/plugin/api/ui/PluginViewGroup;

    return-object v0

    :cond_0
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginView;->getRootView()Lbin/mt/plugin/api/ui/PluginViewGroup;

    move-result-object v0

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    .line 121
    iget-object v0, p0, Ll/۟ۜ᩷;->ᩳ:Ljava/lang/Object;

    return-object v0
.end method

.method public final getViewHeight()I
    .locals 1

    .line 180
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0
.end method

.method public final getViewWidth()I
    .locals 1

    .line 175
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    return v0
.end method

.method public final getVisibility()I
    .locals 1

    .line 594
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 165
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    return v0
.end method

.method public final isEnabled()Z
    .locals 1

    .line 532
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public final isFocused()Z
    .locals 1

    .line 607
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v0

    return v0
.end method

.method public final performClick()Z
    .locals 1

    .line 522
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    move-result v0

    return v0
.end method

.method public final performLongClick()Z
    .locals 1

    .line 527
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->performLongClick()Z

    move-result v0

    return v0
.end method

.method public final requestFocus()Z
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 613
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v0

    return v0

    .line 649
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireId()Ljava/lang/String;
    .locals 2

    .line 79
    iget-object v0, p0, Ll/۟ۜ᩷;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 86
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 87
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "The id not set"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireParentView()Lbin/mt/plugin/api/ui/PluginViewGroup;
    .locals 2

    .line 102
    iget-object v0, p0, Ll/۟ۜ᩷;->ۧ:Lbin/mt/plugin/api/ui/PluginViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    .line 103
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "No parent view"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;
    .locals 3

    .line 61
    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->findViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 63
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ID \'"

    const-string v2, "\' does not reference a PluginView"

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 63
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setAlpha(F)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 565
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 549
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setBackgroundColor(I)V
    .locals 1

    .line 554
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public final setEnabled(Z)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 538
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setGone()V
    .locals 2

    .line 586
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 588
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 649
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public final setHeight(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 256
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 257
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setHeightDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 403
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setHeight(I)V

    return-void
.end method

.method public final setInvisible()V
    .locals 2

    .line 578
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 580
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 649
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public final setLayoutGravity(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 158
    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 159
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setLayoutWeight(F)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 141
    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 142
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMargin(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 323
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 324
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 325
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 326
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 327
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 328
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMargin(IIII)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 311
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 312
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 313
    iput p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 314
    iput p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 315
    iput p4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 316
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method must be called on the UI thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMarginBottom(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 362
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 363
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 364
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMarginBottomDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 487
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setMarginBottom(I)V

    return-void
.end method

.method public final setMarginDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 463
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setMargin(I)V

    return-void
.end method

.method public final setMarginDp(FFFF)V
    .locals 1

    .line 457
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-interface {v0, p2}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p2

    invoke-interface {v0, p3}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p3

    invoke-interface {v0, p4}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Ll/۟ۜ᩷;->setMargin(IIII)V

    return-void
.end method

.method public final setMarginHorizontal(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 371
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 372
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 373
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 374
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMarginHorizontalDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 493
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setMarginHorizontal(I)V

    return-void
.end method

.method public final setMarginLeft(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 335
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 336
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 337
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMarginLeftDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 469
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setMarginLeft(I)V

    return-void
.end method

.method public final setMarginRight(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 353
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 354
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 355
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMarginRightDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 481
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setMarginRight(I)V

    return-void
.end method

.method public final setMarginTop(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 345
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 346
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMarginTopDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 475
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setMarginTop(I)V

    return-void
.end method

.method public final setMarginVertical(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 381
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 382
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 383
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 384
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMarginVerticalDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 499
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setMarginVertical(I)V

    return-void
.end method

.method public setOnClickListener(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)V
    .locals 2

    if-nez p1, :cond_0

    .line 505
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 507
    :cond_0
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    new-instance v1, Ll/ܰۜ᩷;

    invoke-direct {v1, p0, p1}, Ll/ܰۜ᩷;-><init>(Ll/۟ۜ᩷;Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnLongClickListener(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)V
    .locals 2

    if-nez p1, :cond_0

    .line 514
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void

    .line 516
    :cond_0
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    new-instance v1, Ll/᩺ۜ᩷;

    invoke-direct {v1, p0, p1}, Ll/᩺ۜ᩷;-><init>(Ll/۟ۜ᩷;Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public final setPadding(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPadding(IIII)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method must be called on the UI thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPaddingBottom(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    const/4 v1, -0x1

    .line 35
    invoke-static {v0, v1, v1, v1, p1}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPaddingBottomDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 439
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setPaddingBottom(I)V

    return-void
.end method

.method public final setPaddingDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 415
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setPadding(I)V

    return-void
.end method

.method public final setPaddingDp(FFFF)V
    .locals 1

    .line 409
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-interface {v0, p2}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p2

    invoke-interface {v0, p3}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p3

    invoke-interface {v0, p4}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Ll/۟ۜ᩷;->setPadding(IIII)V

    return-void
.end method

.method public final setPaddingHorizontal(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    const/4 v1, -0x1

    invoke-static {v0, p1, v1, p1, v1}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPaddingHorizontalDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 445
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setPaddingHorizontal(I)V

    return-void
.end method

.method public final setPaddingLeft(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    const/4 v1, -0x1

    .line 23
    invoke-static {v0, p1, v1, v1, v1}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPaddingLeftDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 421
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setPaddingLeft(I)V

    return-void
.end method

.method public final setPaddingRight(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 287
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    const/4 v1, -0x1

    .line 31
    invoke-static {v0, v1, v1, p1, v1}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPaddingRightDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 433
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setPaddingRight(I)V

    return-void
.end method

.method public final setPaddingTop(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 281
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    const/4 v1, -0x1

    .line 27
    invoke-static {v0, v1, p1, v1, v1}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPaddingTopDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 427
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setPaddingTop(I)V

    return-void
.end method

.method public final setPaddingVertical(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    const/4 v1, -0x1

    invoke-static {v0, v1, p1, v1, p1}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPaddingVerticalDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 451
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setPaddingVertical(I)V

    return-void
.end method

.method public final setSize(II)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 239
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 240
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 241
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method must be called on the UI thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSizeDp(FF)V
    .locals 1

    .line 391
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-interface {v0, p2}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ll/۟ۜ᩷;->setSize(II)V

    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 0

    .line 126
    iput-object p1, p0, Ll/۟ۜ᩷;->ᩳ:Ljava/lang/Object;

    return-void
.end method

.method public final setVisibility(I)V
    .locals 1

    .line 599
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, p1, :cond_1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 601
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final setVisible()V
    .locals 2

    .line 570
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 649
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public final setWidth(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 248
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 249
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setWidthDp(F)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    .line 397
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginUI;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->setWidth(I)V

    return-void
.end method

.method public final varargs unifyWidth([Lbin/mt/plugin/api/ui/PluginView;)V
    .locals 3

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 632
    array-length v0, p1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 635
    array-length v0, p1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    .line 636
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 637
    aget-object v2, p1, v1

    check-cast v2, Ll/۟ۜ᩷;

    .line 42
    iget-object v2, v2, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    .line 637
    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 639
    :cond_0
    invoke-static {v0}, Ll/ܿ᩷᩷;->֫([Landroid/view/View;)V

    return-void

    .line 633
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 649
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs unifyWidth([Ljava/lang/String;)V
    .locals 3

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 619
    array-length v0, p1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 622
    array-length v0, p1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    .line 623
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 624
    aget-object v2, p1, v1

    invoke-virtual {p0, v2}, Ll/۟ۜ᩷;->requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v2

    check-cast v2, Ll/۟ۜ᩷;

    .line 42
    iget-object v2, v2, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    .line 624
    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 626
    :cond_0
    invoke-static {v0}, Ll/ܿ᩷᩷;->֫([Landroid/view/View;)V

    return-void

    .line 620
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 649
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Landroid/view/View;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    return-object v0
.end method

.method public ֫(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/۟ۜ᩷;->֫:Ljava/lang/String;

    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 160
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x7b

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v1

    const/16 v2, 0x7d

    if-ne v1, v2, :cond_0

    .line 161
    iget-object v1, p0, Ll/۟ۜ᩷;->ܽ:Lbin/mt/plugin/api/ui/PluginUI;

    invoke-interface {v1}, Lbin/mt/plugin/api/ui/PluginUI;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v1

    invoke-interface {v1, v0}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p1
.end method

.method public ֫(Landroid/view/View;)V
    .locals 0

    .line 46
    iput-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Ll/۟ۜ᩷;->֫:Ljava/lang/String;

    return-void
.end method
