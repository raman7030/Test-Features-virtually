.class public abstract Ll/᩵ۨۘ;
.super Ljava/lang/Object;
.source "F90M"


# direct methods
.method public static ֫(Landroid/widget/TextView;)[Ll/֡ۨۘ;
    .locals 3

    .line 94
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 96
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 99
    instance-of v2, p0, Landroid/text/Spanned;

    if-nez v2, :cond_1

    goto :goto_1

    .line 107
    :cond_1
    check-cast p0, Landroid/text/Spanned;

    const-class v2, Ll/֡ۨۘ;

    invoke-interface {p0, v0, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/֡ۨۘ;

    return-object p0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Landroid/widget/TextView;)V
    .locals 7

    const v0, 0x7f0a02fa

    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 30
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    if-eqz v1, :cond_0

    .line 32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 35
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 38
    invoke-static {p0}, Ll/᩵ۨۘ;->֫(Landroid/widget/TextView;)[Ll/֡ۨۘ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 39
    array-length v1, v0

    if-lez v1, :cond_2

    const v1, 0x7f0a02f9

    .line 42
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    .line 43
    new-instance v2, Ll/ܺۨۘ;

    invoke-direct {v2, p0}, Ll/ܺۨۘ;-><init>(Landroid/widget/TextView;)V

    .line 56
    invoke-virtual {p0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 57
    invoke-virtual {p0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 61
    :cond_1
    new-instance v1, Ll/ᩴۨۘ;

    invoke-direct {v1, p0}, Ll/ᩴۨۘ;-><init>(Landroid/widget/TextView;)V

    .line 65
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    .line 66
    invoke-virtual {v4}, Ll/֡ۨۘ;->֫()Ll/ܿۨۘ;

    move-result-object v4

    .line 67
    new-instance v5, Ll/ۘۨۘ;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v6

    invoke-direct {v5, p0, v1, v6}, Ll/ۘۨۘ;-><init>(Landroid/widget/TextView;Ll/ᩴۨۘ;Landroid/graphics/Rect;)V

    invoke-virtual {v4, v5}, Ll/ܿۨۘ;->֫(Landroid/graphics/drawable/Drawable$Callback;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static ܽ(Landroid/widget/TextView;)V
    .locals 4

    const v0, 0x7f0a02fa

    .line 76
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 79
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 82
    invoke-static {p0}, Ll/᩵ۨۘ;->֫(Landroid/widget/TextView;)[Ll/֡ۨۘ;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 83
    array-length v0, p0

    if-lez v0, :cond_1

    .line 85
    array-length v0, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    .line 86
    invoke-virtual {v3}, Ll/֡ۨۘ;->֫()Ll/ܿۨۘ;

    move-result-object v3

    invoke-virtual {v3, v1}, Ll/ܿۨۘ;->֫(Landroid/graphics/drawable/Drawable$Callback;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
