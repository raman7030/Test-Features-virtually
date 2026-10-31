.class public Ll/᩶ۢ;
.super Landroid/widget/Button;
.source "X4G5"

# interfaces
.implements Ll/۫֫֫;


# instance fields
.field public mAppCompatEmojiTextHelper:Ll/۟ۢ;

.field public final mBackgroundTintHelper:Ll/᩹ۢ;

.field public final mTextHelper:Ll/֫ܺ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 72
    invoke-direct {p0, p1, v0}, Ll/᩶ۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0400a3

    .line 76
    invoke-direct {p0, p1, p2, v0}, Ll/᩶ۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 81
    invoke-static {p1}, Ll/ۤۘ;->֫(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 85
    new-instance p1, Ll/᩹ۢ;

    invoke-direct {p1, p0}, Ll/᩹ۢ;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/᩶ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    .line 86
    invoke-virtual {p1, p2, p3}, Ll/᩹ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 88
    new-instance p1, Ll/֫ܺ;

    invoke-direct {p1, p0}, Ll/֫ܺ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    .line 89
    invoke-virtual {p1, p2, p3}, Ll/֫ܺ;->֫(Landroid/util/AttributeSet;I)V

    .line 90
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    .line 92
    invoke-direct {p0}, Ll/᩶ۢ;->֫()Ll/۟ۢ;

    move-result-object p1

    .line 93
    invoke-virtual {p1, p2, p3}, Ll/۟ۢ;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private ֫()Ll/۟ۢ;
    .locals 1

    .line 440
    iget-object v0, p0, Ll/᩶ۢ;->mAppCompatEmojiTextHelper:Ll/۟ۢ;

    if-nez v0, :cond_0

    .line 441
    new-instance v0, Ll/۟ۢ;

    invoke-direct {v0, p0}, Ll/۟ۢ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/᩶ۢ;->mAppCompatEmojiTextHelper:Ll/۟ۢ;

    .line 443
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mAppCompatEmojiTextHelper:Ll/۟ۢ;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 166
    invoke-super {p0}, Landroid/widget/Button;->drawableStateChanged()V

    .line 167
    iget-object v0, p0, Ll/᩶ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 168
    invoke-virtual {v0}, Ll/᩹ۢ;->֫()V

    .line 170
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 171
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    .line 329
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 330
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    .line 332
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 333
    invoke-virtual {v0}, Ll/֫ܺ;->ܽ()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    .line 314
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 315
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    .line 317
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 318
    invoke-virtual {v0}, Ll/֫ܺ;->ᩳ()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    .line 299
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 300
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    .line 302
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 303
    invoke-virtual {v0}, Ll/֫ܺ;->ܿ()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    .line 344
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 345
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    .line 347
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 348
    invoke-virtual {v0}, Ll/֫ܺ;->ܳ()[I

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 3

    .line 282
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 283
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1

    .line 287
    :cond_1
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_2

    .line 288
    invoke-virtual {v0}, Ll/֫ܺ;->᩻()I

    move-result v0

    return v0

    :cond_2
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1

    .line 384
    invoke-super {p0}, Landroid/widget/Button;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    .line 383
    invoke-static {v0}, Ll/ۙ֫֫;->֫(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object v0

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/᩶ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 135
    invoke-virtual {v0}, Ll/᩹ۢ;->ۧ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/᩶ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 161
    invoke-virtual {v0}, Ll/᩹ۢ;->ܽ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 404
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->ۜ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 424
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->᩷()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    .line 460
    invoke-direct {p0}, Ll/᩶ۢ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ;->֫()Z

    move-result v0

    return v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 185
    invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 186
    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 191
    invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 192
    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 197
    invoke-super/range {p0 .. p5}, Landroid/widget/Button;->onLayout(ZIIII)V

    .line 198
    iget-object p1, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 575
    sget-boolean p2, Ll/᩹ᩴ;->ۧ:Z

    if-nez p2, :cond_0

    .line 576
    invoke-virtual {p1}, Ll/֫ܺ;->ۧ()V

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 216
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 217
    iget-object p1, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    sget-boolean p2, Ll/᩹ᩴ;->ۧ:Z

    if-nez p2, :cond_0

    .line 218
    invoke-virtual {p1}, Ll/֫ܺ;->ۢ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 220
    iget-object p1, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->ۧ()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    .line 448
    invoke-super {p0, p1}, Landroid/widget/Button;->setAllCaps(Z)V

    .line 449
    invoke-direct {p0}, Ll/᩶ۢ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫(Z)V

    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    .line 248
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 249
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    return-void

    .line 252
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 253
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/֫ܺ;->֫(IIII)V

    :cond_1
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    .line 265
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 266
    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    return-void

    .line 268
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 269
    invoke-virtual {v0, p1, p2}, Ll/֫ܺ;->֫([II)V

    :cond_1
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    .line 230
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 231
    invoke-super {p0, p1}, Landroid/widget/Button;->setAutoSizeTextTypeWithDefaults(I)V

    return-void

    .line 233
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 234
    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(I)V

    :cond_1
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 106
    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 107
    iget-object p1, p0, Ll/᩶ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz p1, :cond_0

    .line 108
    invoke-virtual {p1}, Ll/᩹ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 98
    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 99
    iget-object v0, p0, Ll/᩶ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(I)V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 377
    invoke-static {p1, p0}, Ll/ۙ֫֫;->֫(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 376
    invoke-super {p0, p1}, Landroid/widget/Button;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    .line 455
    invoke-direct {p0}, Ll/᩶ۢ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->ۧ(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    .line 430
    invoke-direct {p0}, Ll/᩶ۢ;->֫()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/Button;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportAllCaps(Z)V
    .locals 1

    .line 364
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_0

    .line 365
    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Z)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 120
    iget-object v0, p0, Ll/᩶ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->ۧ(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/᩶ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 147
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 393
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/content/res/ColorStateList;)V

    .line 394
    iget-object p1, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 413
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    .line 414
    iget-object p1, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    .line 177
    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextAppearance(Landroid/content/Context;I)V

    .line 178
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_0

    .line 179
    invoke-virtual {v0, p1, p2}, Ll/֫ܺ;->֫(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextSize(IF)V
    .locals 1

    .line 205
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 206
    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextSize(IF)V

    return-void

    .line 208
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 209
    invoke-virtual {v0, p1, p2}, Ll/֫ܺ;->֫(IF)V

    :cond_1
    return-void
.end method
