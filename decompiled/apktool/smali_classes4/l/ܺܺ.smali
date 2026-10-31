.class public Ll/ܺܺ;
.super Landroid/widget/ToggleButton;
.source "Z20Z"

# interfaces
.implements Ll/۫֫֫;


# instance fields
.field public final ᩶:Ll/֫ܺ;

.field public ᩸:Ll/۟ۢ;

.field public final ᩹:Ll/᩹ۢ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x101004b

    .line 67
    invoke-direct {p0, p1, p2, v0}, Ll/ܺܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 76
    new-instance p1, Ll/᩹ۢ;

    invoke-direct {p1, p0}, Ll/᩹ۢ;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/ܺܺ;->᩹:Ll/᩹ۢ;

    .line 77
    invoke-virtual {p1, p2, p3}, Ll/᩹ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 79
    new-instance p1, Ll/֫ܺ;

    invoke-direct {p1, p0}, Ll/֫ܺ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/ܺܺ;->᩶:Ll/֫ܺ;

    .line 80
    invoke-virtual {p1, p2, p3}, Ll/֫ܺ;->֫(Landroid/util/AttributeSet;I)V

    .line 177
    iget-object p1, p0, Ll/ܺܺ;->᩸:Ll/۟ۢ;

    if-nez p1, :cond_0

    .line 178
    new-instance p1, Ll/۟ۢ;

    invoke-direct {p1, p0}, Ll/۟ۢ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/ܺܺ;->᩸:Ll/۟ۢ;

    .line 180
    :cond_0
    iget-object p1, p0, Ll/ܺܺ;->᩸:Ll/۟ۢ;

    .line 83
    invoke-virtual {p1, p2, p3}, Ll/۟ۢ;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    .line 156
    invoke-super {p0}, Landroid/widget/ToggleButton;->drawableStateChanged()V

    .line 157
    iget-object v0, p0, Ll/ܺܺ;->᩹:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 158
    invoke-virtual {v0}, Ll/᩹ۢ;->֫()V

    .line 160
    :cond_0
    iget-object v0, p0, Ll/ܺܺ;->᩶:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 161
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    :cond_1
    return-void
.end method

.method public final setAllCaps(Z)V
    .locals 1

    .line 185
    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setAllCaps(Z)V

    .line 177
    iget-object v0, p0, Ll/ܺܺ;->᩸:Ll/۟ۢ;

    if-nez v0, :cond_0

    .line 178
    new-instance v0, Ll/۟ۢ;

    invoke-direct {v0, p0}, Ll/۟ۢ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/ܺܺ;->᩸:Ll/۟ۢ;

    .line 180
    :cond_0
    iget-object v0, p0, Ll/ܺܺ;->᩸:Ll/۟ۢ;

    .line 186
    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫(Z)V

    return-void
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 96
    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    iget-object p1, p0, Ll/ܺܺ;->᩹:Ll/᩹ۢ;

    if-eqz p1, :cond_0

    .line 98
    invoke-virtual {p1}, Ll/᩹ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    .line 88
    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setBackgroundResource(I)V

    .line 89
    iget-object v0, p0, Ll/ܺܺ;->᩹:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 202
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ToggleButton;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 203
    iget-object p1, p0, Ll/ܺܺ;->᩶:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 211
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ToggleButton;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 212
    iget-object p1, p0, Ll/ܺܺ;->᩶:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public final setFilters([Landroid/text/InputFilter;)V
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ܺܺ;->᩸:Ll/۟ۢ;

    if-nez v0, :cond_0

    .line 178
    new-instance v0, Ll/۟ۢ;

    invoke-direct {v0, p0}, Ll/۟ۢ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/ܺܺ;->᩸:Ll/۟ۢ;

    .line 180
    :cond_0
    iget-object v0, p0, Ll/ܺܺ;->᩸:Ll/۟ۢ;

    .line 167
    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public final setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 252
    iget-object v0, p0, Ll/ܺܺ;->᩶:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/content/res/ColorStateList;)V

    .line 253
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public final setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 290
    iget-object v0, p0, Ll/ܺܺ;->᩶:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    .line 291
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    return-void
.end method
