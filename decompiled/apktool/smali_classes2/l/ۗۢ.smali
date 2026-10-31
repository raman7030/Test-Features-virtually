.class public Ll/ۗۢ;
.super Landroid/widget/CheckedTextView;
.source "W4U7"

# interfaces
.implements Ll/۫֫֫;


# instance fields
.field public final ۙ:Ll/֫ܺ;

.field public final ᩶:Ll/۬ۢ;

.field public ᩸:Ll/۟ۢ;

.field public final ᩹:Ll/᩹ۢ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0400c2

    .line 81
    invoke-direct {p0, p1, p2, v0}, Ll/ۗۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 86
    invoke-static {p1}, Ll/ۤۘ;->֫(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 90
    new-instance p1, Ll/֫ܺ;

    invoke-direct {p1, p0}, Ll/֫ܺ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/ۗۢ;->ۙ:Ll/֫ܺ;

    .line 91
    invoke-virtual {p1, p2, p3}, Ll/֫ܺ;->֫(Landroid/util/AttributeSet;I)V

    .line 92
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    .line 94
    new-instance p1, Ll/᩹ۢ;

    invoke-direct {p1, p0}, Ll/᩹ۢ;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/ۗۢ;->᩹:Ll/᩹ۢ;

    .line 95
    invoke-virtual {p1, p2, p3}, Ll/᩹ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 97
    new-instance p1, Ll/۬ۢ;

    invoke-direct {p1, p0}, Ll/۬ۢ;-><init>(Ll/ۗۢ;)V

    iput-object p1, p0, Ll/ۗۢ;->᩶:Ll/۬ۢ;

    .line 98
    invoke-virtual {p1, p2, p3}, Ll/۬ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 287
    iget-object p1, p0, Ll/ۗۢ;->᩸:Ll/۟ۢ;

    if-nez p1, :cond_0

    .line 288
    new-instance p1, Ll/۟ۢ;

    invoke-direct {p1, p0}, Ll/۟ۢ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/ۗۢ;->᩸:Ll/۟ۢ;

    .line 290
    :cond_0
    iget-object p1, p0, Ll/ۗۢ;->᩸:Ll/۟ۢ;

    .line 101
    invoke-virtual {p1, p2, p3}, Ll/۟ۢ;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    .line 244
    invoke-super {p0}, Landroid/widget/CheckedTextView;->drawableStateChanged()V

    .line 245
    iget-object v0, p0, Ll/ۗۢ;->ۙ:Ll/֫ܺ;

    if-eqz v0, :cond_0

    .line 246
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    .line 248
    :cond_0
    iget-object v0, p0, Ll/ۗۢ;->᩹:Ll/᩹ۢ;

    if-eqz v0, :cond_1

    .line 249
    invoke-virtual {v0}, Ll/᩹ۢ;->֫()V

    .line 251
    :cond_1
    iget-object v0, p0, Ll/ۗۢ;->᩶:Ll/۬ۢ;

    if-eqz v0, :cond_2

    .line 252
    invoke-virtual {v0}, Ll/۬ۢ;->֫()V

    :cond_2
    return-void
.end method

.method public final getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1

    .line 278
    invoke-super {p0}, Landroid/widget/CheckedTextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    .line 277
    invoke-static {v0}, Ll/ۙ֫֫;->֫(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object v0

    return-object v0
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .line 259
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Ll/֫ۡ;->֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V

    return-object v0
.end method

.method public final setAllCaps(Z)V
    .locals 1

    .line 295
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setAllCaps(Z)V

    .line 287
    iget-object v0, p0, Ll/ۗۢ;->᩸:Ll/۟ۢ;

    if-nez v0, :cond_0

    .line 288
    new-instance v0, Ll/۟ۢ;

    invoke-direct {v0, p0}, Ll/۟ۢ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/ۗۢ;->᩸:Ll/۟ۢ;

    .line 290
    :cond_0
    iget-object v0, p0, Ll/ۗۢ;->᩸:Ll/۟ۢ;

    .line 296
    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫(Z)V

    return-void
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 220
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 221
    iget-object p1, p0, Ll/ۗۢ;->᩹:Ll/᩹ۢ;

    if-eqz p1, :cond_0

    .line 222
    invoke-virtual {p1}, Ll/᩹ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    .line 228
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setBackgroundResource(I)V

    .line 229
    iget-object v0, p0, Ll/ۗۢ;->᩹:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 230
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final setCheckMarkDrawable(I)V
    .locals 1

    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗۢ;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 106
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 107
    iget-object p1, p0, Ll/ۗۢ;->᩶:Ll/۬ۢ;

    if-eqz p1, :cond_0

    .line 108
    invoke-virtual {p1}, Ll/۬ۢ;->ۧ()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 313
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckedTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 314
    iget-object p1, p0, Ll/ۗۢ;->ۙ:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 322
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckedTextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 323
    iget-object p1, p0, Ll/ۗۢ;->ۙ:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public final setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 271
    invoke-static {p1, p0}, Ll/ۙ֫֫;->֫(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 270
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public final setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 363
    iget-object v0, p0, Ll/ۗۢ;->ۙ:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/content/res/ColorStateList;)V

    .line 364
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public final setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 401
    iget-object v0, p0, Ll/ۗۢ;->ۙ:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    .line 402
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    .line 236
    invoke-super {p0, p1, p2}, Landroid/widget/CheckedTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 237
    iget-object v0, p0, Ll/ۗۢ;->ۙ:Ll/֫ܺ;

    if-eqz v0, :cond_0

    .line 238
    invoke-virtual {v0, p1, p2}, Ll/֫ܺ;->֫(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
