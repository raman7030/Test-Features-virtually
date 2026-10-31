.class public final Ll/᩶ۖ;
.super Ljava/lang/Object;
.source "A513"


# direct methods
.method public static ֫(Ll/֡ۖ;)Landroid/widget/ListView;
    .locals 0

    .line 141
    iget-object p0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    return-object p0
.end method

.method public static ֫(Ll/᩸ۖ;)Ll/ᩳ᩷;
    .locals 0

    .line 109
    iget-object p0, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    return-object p0
.end method

.method public static ֫(Landroid/view/View;)Ll/᩸ۖ;
    .locals 4

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 47
    instance-of v2, v1, Ll/ۡۢ;

    if-eqz v2, :cond_0

    check-cast v1, Ll/ۡۢ;

    .line 48
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 49
    invoke-virtual {v1}, Ll/ۡۢ;->ܳ()I

    move-result v1

    if-eqz v1, :cond_0

    .line 51
    new-instance v2, Ll/۫᩻;

    invoke-direct {v2, v0, v1}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    move-object v0, v2

    .line 33
    :cond_0
    new-instance v1, Ll/᩸ۖ;

    const v2, 0x800003

    const v3, 0x7f040020

    invoke-direct {v1, v0, p0, v2, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;II)V

    return-object v1
.end method

.method public static ֫(Ll/᩸ۖ;Ljava/lang/String;Landroid/view/View;)V
    .locals 1

    .line 63
    invoke-virtual {p0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v0

    .line 64
    invoke-static {v0, p1}, Ll/۬ۜ;->֫(Ll/ۗۜ;Ljava/lang/CharSequence;)V

    .line 65
    iget-object p0, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    invoke-static {p0}, Ll/ᩴ᩷;->֫(Ll/ᩳ᩷;)V

    .line 318
    invoke-virtual {p0}, Ll/ᩳ᩷;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 344
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ᩷;->ܽ()Ll/ۧ᩷;

    move-result-object p0

    invoke-interface {p0}, Ll/ۢ᩷;->ᩳ()Landroid/widget/ListView;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_2

    .line 68
    invoke-static {p0, p2}, Ll/᩶ۖ;->ۧ(Landroid/widget/ListView;Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v0, Ll/᩹ۖ;

    invoke-direct {v0, p0, p2}, Ll/᩹ۖ;-><init>(Landroid/widget/ListView;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static bridge synthetic ֫(Landroid/widget/ListView;Landroid/view/View;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩶ۖ;->ۧ(Landroid/widget/ListView;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/᩸ۖ;)V
    .locals 0

    .line 132
    :try_start_0
    iget-object p0, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    invoke-virtual {p0}, Ll/ᩳ᩷;->ܽ()Ll/ۧ᩷;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ᩷;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ۧ(Landroid/widget/ListView;Landroid/view/View;)Z
    .locals 2

    .line 87
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 90
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    const v0, 0x1020016

    .line 91
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_3

    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of v0, p0, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_3

    check-cast p0, Landroid/widget/FrameLayout;

    .line 95
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/view/ViewGroup;

    .line 96
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 98
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 99
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f08004c

    invoke-static {p1, v0}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    const/16 p1, 0x57

    .line 104
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setForegroundGravity(I)V

    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v1
.end method

.method public static ܽ(Ll/᩸ۖ;)V
    .locals 3

    .line 114
    :try_start_0
    iget-object p0, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    .line 115
    invoke-virtual {p0}, Ll/ᩳ᩷;->ܽ()Ll/ۧ᩷;

    move-result-object p0

    const-string v0, "l.\u06d6\u1a77"

    .line 116
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "mAdapter"

    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 119
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹ۜ;

    .line 120
    const-class v0, Ll/᩹ۜ;

    const-string v2, "\u06d7"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const v1, 0x7f0d0182

    .line 122
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
