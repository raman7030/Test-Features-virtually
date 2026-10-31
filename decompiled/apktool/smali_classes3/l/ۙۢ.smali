.class public Ll/ۙۢ;
.super Landroid/widget/CheckBox;
.source "Z4TZ"

# interfaces
.implements Ll/۬֫֫;
.implements Ll/۫֫֫;


# instance fields
.field public mAppCompatEmojiTextHelper:Ll/۟ۢ;

.field public final mBackgroundTintHelper:Ll/᩹ۢ;

.field public final mCompoundButtonHelper:Ll/۫ۢ;

.field public final mTextHelper:Ll/֫ܺ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, p1, v0}, Ll/ۙۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0400b6

    .line 72
    invoke-direct {p0, p1, p2, v0}, Ll/ۙۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 77
    invoke-static {p1}, Ll/ۤۘ;->֫(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 81
    new-instance p1, Ll/۫ۢ;

    invoke-direct {p1, p0}, Ll/۫ۢ;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Ll/ۙۢ;->mCompoundButtonHelper:Ll/۫ۢ;

    .line 82
    invoke-virtual {p1, p2, p3}, Ll/۫ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 84
    new-instance p1, Ll/᩹ۢ;

    invoke-direct {p1, p0}, Ll/᩹ۢ;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/ۙۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    .line 85
    invoke-virtual {p1, p2, p3}, Ll/᩹ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 87
    new-instance p1, Ll/֫ܺ;

    invoke-direct {p1, p0}, Ll/֫ܺ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    .line 88
    invoke-virtual {p1, p2, p3}, Ll/֫ܺ;->֫(Landroid/util/AttributeSet;I)V

    .line 90
    invoke-direct {p0}, Ll/ۙۢ;->֫()Ll/۟ۢ;

    move-result-object p1

    .line 91
    invoke-virtual {p1, p2, p3}, Ll/۟ۢ;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private ֫()Ll/۟ۢ;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۙۢ;->mAppCompatEmojiTextHelper:Ll/۟ۢ;

    if-nez v0, :cond_0

    .line 100
    new-instance v0, Ll/۟ۢ;

    invoke-direct {v0, p0}, Ll/۟ۢ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/ۙۢ;->mAppCompatEmojiTextHelper:Ll/۟ۢ;

    .line 102
    :cond_0
    iget-object v0, p0, Ll/ۙۢ;->mAppCompatEmojiTextHelper:Ll/۟ۢ;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 233
    invoke-super {p0}, Landroid/widget/CheckBox;->drawableStateChanged()V

    .line 234
    iget-object v0, p0, Ll/ۙۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 235
    invoke-virtual {v0}, Ll/᩹ۢ;->֫()V

    .line 237
    :cond_0
    iget-object v0, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 238
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 185
    iget-object v0, p0, Ll/ۙۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {v0}, Ll/᩹ۢ;->ۧ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ۙۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 212
    invoke-virtual {v0}, Ll/᩹ۢ;->ܽ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ۙۢ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {v0}, Ll/۫ۢ;->ۧ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ۙۢ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v0}, Ll/۫ۢ;->ܽ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 294
    iget-object v0, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->ۜ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 335
    iget-object v0, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->᩷()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    .line 260
    invoke-direct {p0}, Ll/ۙۢ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ;->֫()Z

    move-result v0

    return v0
.end method

.method public setAllCaps(Z)V
    .locals 1

    .line 249
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setAllCaps(Z)V

    .line 250
    invoke-direct {p0}, Ll/ۙۢ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 217
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 218
    iget-object p1, p0, Ll/ۙۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz p1, :cond_0

    .line 219
    invoke-virtual {p1}, Ll/᩹ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 225
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundResource(I)V

    .line 226
    iget-object v0, p0, Ll/ۙۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 227
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙۢ;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 107
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 108
    iget-object p1, p0, Ll/ۙۢ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz p1, :cond_0

    .line 109
    invoke-virtual {p1}, Ll/۫ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 266
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 267
    iget-object p1, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 275
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 276
    iget-object p1, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    .line 255
    invoke-direct {p0}, Ll/ۙۢ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->ۧ(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    .line 244
    invoke-direct {p0}, Ll/ۙۢ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ۙۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->ۧ(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 197
    iget-object v0, p0, Ll/ۙۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 198
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ۙۢ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz v0, :cond_0

    .line 125
    invoke-virtual {v0, p1}, Ll/۫ۢ;->֫(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ۙۢ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz v0, :cond_0

    .line 148
    invoke-virtual {v0, p1}, Ll/۫ۢ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 316
    iget-object v0, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/content/res/ColorStateList;)V

    .line 317
    iget-object p1, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 354
    iget-object v0, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    .line 355
    iget-object p1, p0, Ll/ۙۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method
