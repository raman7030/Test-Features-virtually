.class public final Ll/ۙ᩸ۡ;
.super Ljava/lang/Object;
.source "X53D"


# direct methods
.method public static ֫(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x4

    if-eqz p1, :cond_1

    const/4 v1, -0x1

    .line 196
    invoke-virtual {p0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    .line 195
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    if-eqz p2, :cond_3

    const/4 p1, 0x1

    .line 200
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 v0, 0x0

    .line 199
    :cond_2
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method public static bridge synthetic ֫(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۙ᩸ۡ;->֫(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static ֫(Landroid/widget/ListView;)V
    .locals 5

    .line 159
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x7f0a04cb

    .line 160
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a04ca

    .line 161
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 163
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_2

    const/4 v3, 0x3

    .line 165
    invoke-static {p0, v3, v3}, Ll/ܿ᩺;->֫(Landroid/view/ViewGroup;II)V

    if-eqz v1, :cond_0

    .line 170
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    if-eqz v2, :cond_1

    .line 173
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    return-void

    .line 177
    :cond_2
    new-instance v0, Ll/ܶ᩸ۡ;

    invoke-direct {v0, v1, v2}, Ll/ܶ᩸ۡ;-><init>(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0, v0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 189
    new-instance v0, Ll/֨᩸ۡ;

    invoke-direct {v0, p0, v1, v2}, Ll/֨᩸ۡ;-><init>(Landroid/widget/ListView;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ֫(Landroid/widget/ListView;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 189
    invoke-static {p0, p1, p2}, Ll/ۙ᩸ۡ;->֫(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static ֫(Ll/۬۬ۧ;)V
    .locals 5

    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x7f0a04cb

    .line 126
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a04ca

    .line 127
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 129
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_2

    const/4 v3, 0x3

    .line 131
    invoke-static {p0, v3, v3}, Ll/ܿ᩺;->֫(Landroid/view/ViewGroup;II)V

    if-eqz v1, :cond_0

    .line 136
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    if-eqz v2, :cond_1

    .line 139
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    return-void

    .line 142
    :cond_2
    new-instance v0, Ll/۠᩸ۡ;

    invoke-direct {v0, v1, v2}, Ll/۠᩸ۡ;-><init>(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0, v0}, Ll/۬۬ۧ;->addOnScrollListener(Ll/ۢ۬ۧ;)V

    .line 154
    new-instance v0, Ll/ۚ᩸ۡ;

    invoke-direct {v0, p0, v1, v2}, Ll/ۚ᩸ۡ;-><init>(Ll/۬۬ۧ;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ֫(Ll/۬۬ۧ;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 154
    invoke-static {p0, p1, p2}, Ll/ۙ᩸ۡ;->֫(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
