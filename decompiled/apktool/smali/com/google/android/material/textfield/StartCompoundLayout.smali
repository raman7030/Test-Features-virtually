.class public Lcom/google/android/material/textfield/StartCompoundLayout;
.super Landroid/widget/LinearLayout;
.source "StartCompoundLayout.java"


# instance fields
.field public hintExpanded:Z

.field public prefixText:Ljava/lang/CharSequence;

.field public final prefixTextView:Landroid/widget/TextView;

.field public startIconMinSize:I

.field public startIconOnLongClickListener:Landroid/view/View$OnLongClickListener;

.field public startIconScaleType:Landroid/widget/ImageView$ScaleType;

.field public startIconTintList:Landroid/content/res/ColorStateList;

.field public startIconTintMode:Landroid/graphics/PorterDuff$Mode;

.field public final startIconView:Lcom/google/android/material/internal/CheckableImageButton;

.field public final textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Ll/᩺ۘ;)V
    .locals 4

    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 82
    iput-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 p1, 0x8

    .line 84
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    .line 85
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 86
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const v2, 0x800003

    const/4 v3, -0x2

    invoke-direct {v0, v3, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 93
    sget v1, Ll/ܺ۠ܺ;->ۢ֫:I

    .line 95
    invoke-virtual {v0, v1, p0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    iput-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 96
    invoke-static {p1}, Lcom/google/android/material/textfield/IconHelper;->setCompatRippleBackgroundIfNeeded(Lcom/google/android/material/internal/CheckableImageButton;)V

    .line 98
    new-instance v0, Ll/ܳܺ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    .line 100
    invoke-direct {p0, p2}, Lcom/google/android/material/textfield/StartCompoundLayout;->initStartIconView(Ll/᩺ۘ;)V

    .line 101
    invoke-direct {p0, p2}, Lcom/google/android/material/textfield/StartCompoundLayout;->initPrefixTextView(Ll/᩺ۘ;)V

    .line 103
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 104
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initPrefixTextView(Ll/᩺ۘ;)V
    .locals 3

    .line 148
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 150
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    sget v1, Ll/᩷۠ܺ;->۫ۢ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 151
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 153
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    sget v1, Ll/ܿ᩺;->֫:I

    const/4 v1, 0x1

    .line 2205
    invoke-virtual {v0, v1}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 156
    sget v0, Ll/᩵۠ܺ;->ᩳ᩵֫:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ll/᩺ۘ;->ܳ(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/StartCompoundLayout;->setPrefixTextAppearance(I)V

    .line 157
    sget v0, Ll/᩵۠ܺ;->ܿ᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    sget v0, Ll/᩵۠ܺ;->ܿ᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/StartCompoundLayout;->setPrefixTextColor(Landroid/content/res/ColorStateList;)V

    .line 160
    :cond_0
    sget v0, Ll/᩵۠ܺ;->ܽ᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/StartCompoundLayout;->setPrefixText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initStartIconView(Ll/᩺ۘ;)V
    .locals 4

    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/resources/MaterialResources;->isFontScaleAtLeast1_3(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    .line 99
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    :cond_0
    const/4 v0, 0x0

    .line 114
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 117
    sget v1, Ll/᩵۠ܺ;->ۖ᩵֫:I

    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 120
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Ll/᩵۠ܺ;->ۖ᩵֫:I

    .line 119
    invoke-static {v1, p1, v2}, Lcom/google/android/material/resources/MaterialResources;->getColorStateList(Landroid/content/Context;Ll/᩺ۘ;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintList:Landroid/content/res/ColorStateList;

    .line 123
    :cond_1
    sget v1, Ll/᩵۠ܺ;->ۘ᩵֫:I

    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    .line 124
    sget v1, Ll/᩵۠ܺ;->ۘ᩵֫:I

    .line 126
    invoke-virtual {p1, v1, v2}, Ll/᩺ۘ;->ܽ(II)I

    move-result v1

    .line 125
    invoke-static {v1, v0}, Lcom/google/android/material/internal/ViewUtils;->parseTintMode(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 129
    :cond_2
    sget v0, Ll/᩵۠ܺ;->ۢ᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 130
    sget v0, Ll/᩵۠ܺ;->ۢ᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 131
    sget v0, Ll/᩵۠ܺ;->᩷᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 132
    sget v0, Ll/᩵۠ܺ;->᩷᩵֫:I

    .line 133
    invoke-virtual {p1, v0}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 132
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconContentDescription(Ljava/lang/CharSequence;)V

    .line 135
    :cond_3
    sget v0, Ll/᩵۠ܺ;->ۜ᩵֫:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconCheckable(Z)V

    .line 137
    :cond_4
    sget v0, Ll/᩵۠ܺ;->ۡ᩵֫:I

    .line 140
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Ll/᩻۠ܺ;->۬۠:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 138
    invoke-virtual {p1, v0, v1}, Ll/᩺ۘ;->ۧ(II)I

    move-result v0

    .line 137
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconMinSize(I)V

    .line 141
    sget v0, Ll/᩵۠ܺ;->ܺ᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 142
    sget v0, Ll/᩵۠ܺ;->ܺ᩵֫:I

    .line 143
    invoke-virtual {p1, v0, v2}, Ll/᩺ۘ;->ܽ(II)I

    move-result p1

    invoke-static {p1}, Lcom/google/android/material/textfield/IconHelper;->convertScaleType(I)Landroid/widget/ImageView$ScaleType;

    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_5
    return-void
.end method

.method private updateVisibility()V
    .locals 3

    .line 353
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixText:Ljava/lang/CharSequence;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->hintExpanded:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 354
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 355
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_1

    if-nez v0, :cond_2

    :cond_1
    const/4 v1, 0x0

    .line 356
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 359
    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 360
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->updateDummyDrawables()Z

    return-void
.end method


# virtual methods
.method public getPrefixText()Ljava/lang/CharSequence;
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixText:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getPrefixTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getPrefixTextStartOffset()I
    .locals 3

    .line 333
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->isStartIconVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 335
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 337
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 65
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v1

    add-int/2addr v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 341
    :goto_0
    sget v0, Ll/ܿ᩺;->֫:I

    .line 2220
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    .line 341
    iget-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    .line 2220
    invoke-virtual {v2}, Landroid/view/View;->getPaddingStart()I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2
.end method

.method public getPrefixTextView()Landroid/widget/TextView;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method public getStartIconContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getStartIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getStartIconMinSize()I
    .locals 1

    .line 293
    iget v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconMinSize:I

    return v0
.end method

.method public getStartIconScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 303
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconScaleType:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public isStartIconCheckable()Z
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Lcom/google/android/material/internal/CheckableImageButton;->isCheckable()Z

    move-result v0

    return v0
.end method

.method public isStartIconVisible()Z
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onHintStateChanged(Z)V
    .locals 0

    .line 347
    iput-boolean p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->hintExpanded:Z

    .line 348
    invoke-direct {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->updateVisibility()V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 165
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 166
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->updatePrefixTextViewPadding()V

    return-void
.end method

.method public refreshStartIconDrawableState()V
    .locals 3

    .line 246
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintList:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, v2}, Lcom/google/android/material/textfield/IconHelper;->refreshIconDrawableState(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setPrefixText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 175
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iput-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixText:Ljava/lang/CharSequence;

    .line 176
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    invoke-direct {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->updateVisibility()V

    return-void
.end method

.method public setPrefixTextAppearance(I)V
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    invoke-static {v0, p1}, Ll/ۙ֫֫;->ᩳ(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setPrefixTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setStartIconCheckable(Z)V
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    return-void
.end method

.method public setStartIconContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 258
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->getStartIconContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 259
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 205
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Ll/ۧۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    .line 207
    iget-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintList:Landroid/content/res/ColorStateList;

    iget-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintMode:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    const/4 p1, 0x1

    .line 208
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconVisible(Z)V

    .line 209
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->refreshStartIconDrawableState()V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 211
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconVisible(Z)V

    const/4 p1, 0x0

    .line 212
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 214
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/StartCompoundLayout;->setStartIconContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setStartIconMinSize(I)V
    .locals 1

    if-ltz p1, :cond_1

    .line 286
    iget v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconMinSize:I

    if-eq p1, v0, :cond_0

    .line 287
    iput p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconMinSize:I

    .line 288
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->setIconMinSize(Lcom/google/android/material/internal/CheckableImageButton;I)V

    :cond_0
    return-void

    .line 284
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "startIconSize cannot be less than 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setStartIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 224
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconOnLongClickListener:Landroid/view/View$OnLongClickListener;

    invoke-static {v0, p1, v1}, Lcom/google/android/material/textfield/IconHelper;->setIconOnClickListener(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setStartIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 229
    iput-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconOnLongClickListener:Landroid/view/View$OnLongClickListener;

    .line 230
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->setIconOnLongClickListener(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setStartIconScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .line 297
    iput-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconScaleType:Landroid/widget/ImageView$ScaleType;

    .line 298
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->setIconScaleType(Lcom/google/android/material/internal/CheckableImageButton;Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public setStartIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 269
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintList:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    .line 270
    iput-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintList:Landroid/content/res/ColorStateList;

    .line 271
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintMode:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setStartIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    .line 276
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintMode:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    .line 277
    iput-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 278
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconTintList:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, v2, p1}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setStartIconVisible(Z)V
    .locals 1

    .line 234
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->isStartIconVisible()Z

    move-result v0

    if-eq v0, p1, :cond_1

    .line 235
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 236
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->updatePrefixTextViewPadding()V

    .line 237
    invoke-direct {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->updateVisibility()V

    :cond_1
    return-void
.end method

.method public setupAccessibilityNodeInfo(Ll/ܳ۟;)V
    .locals 1

    .line 307
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ll/ܳ۟;->ۧ(Landroid/view/View;)V

    .line 309
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ll/ܳ۟;->ܿ(Landroid/view/View;)V

    return-void

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->startIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1, v0}, Ll/ܳ۟;->ܿ(Landroid/view/View;)V

    return-void
.end method

.method public updatePrefixTextViewPadding()V
    .locals 6

    .line 316
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->editText:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    .line 320
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->isStartIconVisible()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    sget v1, Ll/ܿ᩺;->֫:I

    .line 2220
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v1

    .line 321
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->prefixTextView:Landroid/widget/TextView;

    .line 324
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v3

    .line 325
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 326
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Ll/᩻۠ܺ;->ܰ᩵:I

    .line 327
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 328
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v0

    .line 321
    sget v5, Ll/ܿ᩺;->֫:I

    .line 2255
    invoke-virtual {v2, v1, v3, v4, v0}, Landroid/view/View;->setPaddingRelative(IIII)V

    return-void
.end method
