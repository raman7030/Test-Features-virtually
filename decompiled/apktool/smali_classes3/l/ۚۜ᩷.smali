.class public final Ll/ۚۜ᩷;
.super Ll/ۨۜ᩷;
.source "L7NC"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginFrameLayout;


# virtual methods
.method public final ֫(Lbin/mt/plugin/api/ui/PluginView;)V
    .locals 4

    .line 19
    move-object v0, p1

    check-cast v0, Ll/۟ۜ᩷;

    .line 20
    iget-object v1, p0, Ll/ۨۜ᩷;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    iget-object p1, v0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of v1, p1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v1, :cond_0

    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 22
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iget v3, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    iget p1, p1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-direct {v1, v2, v3, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 23
    iget-object p1, v0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    :cond_0
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Landroid/widget/FrameLayout;

    iget-object v0, v0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method
