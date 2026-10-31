.class public Ll/᩷ۡ;
.super Landroid/widget/RadioButton;
.source "15T9"

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
    invoke-direct {p0, p1, v0}, Ll/᩷ۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0403e8

    .line 72
    invoke-direct {p0, p1, p2, v0}, Ll/᩷ۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 76
    invoke-static {p1}, Ll/ۤۘ;->֫(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 80
    new-instance p1, Ll/۫ۢ;

    invoke-direct {p1, p0}, Ll/۫ۢ;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Ll/᩷ۡ;->mCompoundButtonHelper:Ll/۫ۢ;

    .line 81
    invoke-virtual {p1, p2, p3}, Ll/۫ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 83
    new-instance p1, Ll/᩹ۢ;

    invoke-direct {p1, p0}, Ll/᩹ۢ;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/᩷ۡ;->mBackgroundTintHelper:Ll/᩹ۢ;

    .line 84
    invoke-virtual {p1, p2, p3}, Ll/᩹ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 86
    new-instance p1, Ll/֫ܺ;

    invoke-direct {p1, p0}, Ll/֫ܺ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    .line 87
    invoke-virtual {p1, p2, p3}, Ll/֫ܺ;->֫(Landroid/util/AttributeSet;I)V

    .line 88
    invoke-direct {p0}, Ll/᩷ۡ;->֫()Ll/۟ۢ;

    move-result-object p1

    .line 89
    invoke-virtual {p1, p2, p3}, Ll/۟ۢ;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private ֫()Ll/۟ۢ;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/᩷ۡ;->mAppCompatEmojiTextHelper:Ll/۟ۢ;

    if-nez v0, :cond_0

    .line 98
    new-instance v0, Ll/۟ۢ;

    invoke-direct {v0, p0}, Ll/۟ۢ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/᩷ۡ;->mAppCompatEmojiTextHelper:Ll/۟ۢ;

    .line 100
    :cond_0
    iget-object v0, p0, Ll/᩷ۡ;->mAppCompatEmojiTextHelper:Ll/۟ۢ;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 232
    invoke-super {p0}, Landroid/widget/RadioButton;->drawableStateChanged()V

    .line 233
    iget-object v0, p0, Ll/᩷ۡ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 234
    invoke-virtual {v0}, Ll/᩹ۢ;->֫()V

    .line 236
    :cond_0
    iget-object v0, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 237
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 184
    iget-object v0, p0, Ll/᩷ۡ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 185
    invoke-virtual {v0}, Ll/᩹ۢ;->ۧ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 210
    iget-object v0, p0, Ll/᩷ۡ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 211
    invoke-virtual {v0}, Ll/᩹ۢ;->ܽ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/᩷ۡ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz v0, :cond_0

    .line 135
    invoke-virtual {v0}, Ll/۫ۢ;->ۧ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/᩷ۡ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz v0, :cond_0

    .line 158
    invoke-virtual {v0}, Ll/۫ۢ;->ܽ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 293
    iget-object v0, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->ۜ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 334
    iget-object v0, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->᩷()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    .line 259
    invoke-direct {p0}, Ll/᩷ۡ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ;->֫()Z

    move-result v0

    return v0
.end method

.method public setAllCaps(Z)V
    .locals 1

    .line 248
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setAllCaps(Z)V

    .line 249
    invoke-direct {p0}, Ll/᩷ۡ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 216
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 217
    iget-object p1, p0, Ll/᩷ۡ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz p1, :cond_0

    .line 218
    invoke-virtual {p1}, Ll/᩹ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 224
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 225
    iget-object v0, p0, Ll/᩷ۡ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 226
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩷ۡ;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 105
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 106
    iget-object p1, p0, Ll/᩷ۡ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz p1, :cond_0

    .line 107
    invoke-virtual {p1}, Ll/۫ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 265
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RadioButton;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 266
    iget-object p1, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 274
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RadioButton;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 275
    iget-object p1, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    .line 254
    invoke-direct {p0}, Ll/᩷ۡ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->ۧ(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    .line 243
    invoke-direct {p0}, Ll/᩷ۡ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 170
    iget-object v0, p0, Ll/᩷ۡ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 171
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->ۧ(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 196
    iget-object v0, p0, Ll/᩷ۡ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 197
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 122
    iget-object v0, p0, Ll/᩷ۡ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {v0, p1}, Ll/۫ۢ;->֫(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 145
    iget-object v0, p0, Ll/᩷ۡ;->mCompoundButtonHelper:Ll/۫ۢ;

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {v0, p1}, Ll/۫ۢ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 315
    iget-object v0, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/content/res/ColorStateList;)V

    .line 316
    iget-object p1, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 353
    iget-object v0, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    .line 354
    iget-object p1, p0, Ll/᩷ۡ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method
