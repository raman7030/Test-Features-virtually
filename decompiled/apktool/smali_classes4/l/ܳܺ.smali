.class public Ll/ܳܺ;
.super Landroid/widget/TextView;
.source "254T"

# interfaces
.implements Ll/۫֫֫;


# instance fields
.field public final mBackgroundTintHelper:Ll/᩹ۢ;

.field public mEmojiTextViewHelper:Ll/۟ۢ;

.field public mIsSetTypefaceProcessing:Z

.field public mPrecomputedTextFuture:Ljava/util/concurrent/Future;

.field public mSuperCaller:Ll/ۧܺ;

.field public final mTextClassifierHelper:Ll/۫ۡ;

.field public final mTextHelper:Ll/֫ܺ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 106
    invoke-direct {p0, p1, v0}, Ll/ܳܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    .line 110
    invoke-direct {p0, p1, p2, v0}, Ll/ܳܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 115
    invoke-static {p1}, Ll/ۤۘ;->֫(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 97
    iput-boolean p1, p0, Ll/ܳܺ;->mIsSetTypefaceProcessing:Z

    const/4 p1, 0x0

    .line 99
    iput-object p1, p0, Ll/ܳܺ;->mSuperCaller:Ll/ۧܺ;

    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 119
    new-instance p1, Ll/᩹ۢ;

    invoke-direct {p1, p0}, Ll/᩹ۢ;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/ܳܺ;->mBackgroundTintHelper:Ll/᩹ۢ;

    .line 120
    invoke-virtual {p1, p2, p3}, Ll/᩹ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 122
    new-instance p1, Ll/֫ܺ;

    invoke-direct {p1, p0}, Ll/֫ܺ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    .line 123
    invoke-virtual {p1, p2, p3}, Ll/֫ܺ;->֫(Landroid/util/AttributeSet;I)V

    .line 124
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    .line 126
    new-instance p1, Ll/۫ۡ;

    invoke-direct {p1, p0}, Ll/۫ۡ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/ܳܺ;->mTextClassifierHelper:Ll/۫ۡ;

    .line 128
    invoke-direct {p0}, Ll/ܳܺ;->ᩳ()Ll/۟ۢ;

    move-result-object p1

    .line 129
    invoke-virtual {p1, p2, p3}, Ll/۟ۢ;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳܺ;)I
    .locals 0

    .line 87
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result p0

    return p0
.end method

.method public static synthetic ֫(Ll/ܳܺ;I)V
    .locals 0

    .line 87
    invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳܺ;IF)V
    .locals 0

    .line 87
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setLineHeight(IF)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳܺ;IIII)V
    .locals 0

    .line 87
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳܺ;Landroid/view/textclassifier/TextClassifier;)V
    .locals 0

    .line 87
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳܺ;[II)V
    .locals 0

    .line 87
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ܳܺ;)I
    .locals 0

    .line 87
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result p0

    return p0
.end method

.method public static synthetic ۧ(Ll/ܳܺ;I)V
    .locals 0

    .line 87
    invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V

    return-void
.end method

.method public static synthetic ܳ(Ll/ܳܺ;)Landroid/view/textclassifier/TextClassifier;
    .locals 0

    .line 87
    invoke-super {p0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ܳܺ;)I
    .locals 0

    .line 87
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result p0

    return p0
.end method

.method private ܽ()V
    .locals 2

    .line 545
    iget-object v0, p0, Ll/ܳܺ;->mPrecomputedTextFuture:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 548
    :try_start_0
    iput-object v1, p0, Ll/ܳܺ;->mPrecomputedTextFuture:Ljava/util/concurrent/Future;

    .line 549
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ۤ;

    invoke-static {p0, v0}, Ll/ۙ֫֫;->֫(Ll/ܳܺ;Ll/۠ۤ;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static synthetic ܽ(Ll/ܳܺ;I)V
    .locals 0

    .line 87
    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    return-void
.end method

.method public static synthetic ܿ(Ll/ܳܺ;)I
    .locals 0

    .line 87
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result p0

    return p0
.end method

.method private ᩳ()Ll/۟ۢ;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ܳܺ;->mEmojiTextViewHelper:Ll/۟ۢ;

    if-nez v0, :cond_0

    .line 139
    new-instance v0, Ll/۟ۢ;

    invoke-direct {v0, p0}, Ll/۟ۢ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/ܳܺ;->mEmojiTextViewHelper:Ll/۟ۢ;

    .line 141
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mEmojiTextViewHelper:Ll/۟ۢ;

    return-object v0
.end method

.method public static synthetic ᩳ(Ll/ܳܺ;)[I
    .locals 0

    .line 87
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 243
    invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V

    .line 244
    iget-object v0, p0, Ll/ܳܺ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 245
    invoke-virtual {v0}, Ll/᩹ۢ;->֫()V

    .line 247
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 248
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    .line 411
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 412
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 838
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0}, Ll/ܳܺ;->֫(Ll/ܳܺ;)I

    move-result v0

    return v0

    .line 414
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 415
    invoke-virtual {v0}, Ll/֫ܺ;->ܽ()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    .line 393
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 394
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 843
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0}, Ll/ܳܺ;->ۧ(Ll/ܳܺ;)I

    move-result v0

    return v0

    .line 396
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 397
    invoke-virtual {v0}, Ll/֫ܺ;->ᩳ()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    .line 375
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 376
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 848
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0}, Ll/ܳܺ;->ܽ(Ll/ܳܺ;)I

    move-result v0

    return v0

    .line 378
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 379
    invoke-virtual {v0}, Ll/֫ܺ;->ܿ()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    .line 429
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 430
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 853
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0}, Ll/ܳܺ;->ᩳ(Ll/ܳܺ;)[I

    move-result-object v0

    return-object v0

    .line 432
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 433
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

    .line 354
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 355
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 858
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0}, Ll/ܳܺ;->ܿ(Ll/ܳܺ;)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1

    .line 360
    :cond_1
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_2

    .line 361
    invoke-virtual {v0}, Ll/֫ܺ;->᩻()I

    move-result v0

    return v0

    :cond_2
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1

    .line 505
    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    .line 504
    invoke-static {v0}, Ll/ۙ֫֫;->֫(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object v0

    return-object v0
.end method

.method public getFirstBaselineToTopHeight()I
    .locals 2

    .line 689
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getLastBaselineToBottomHeight()I
    .locals 2

    .line 699
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getSuperCaller()Ll/ۧܺ;
    .locals 2

    .line 798
    iget-object v0, p0, Ll/ܳܺ;->mSuperCaller:Ll/ۧܺ;

    if-nez v0, :cond_2

    .line 799
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 800
    new-instance v0, Ll/ܿܺ;

    invoke-direct {v0, p0}, Ll/ܿܺ;-><init>(Ll/ܳܺ;)V

    iput-object v0, p0, Ll/ܳܺ;->mSuperCaller:Ll/ۧܺ;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    .line 802
    new-instance v0, Ll/ᩳܺ;

    invoke-direct {v0, p0}, Ll/ᩳܺ;-><init>(Ll/ܳܺ;)V

    iput-object v0, p0, Ll/ܳܺ;->mSuperCaller:Ll/ۧܺ;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    .line 804
    new-instance v0, Ll/ܽܺ;

    invoke-direct {v0, p0}, Ll/ܽܺ;-><init>(Ll/ܳܺ;)V

    iput-object v0, p0, Ll/ܳܺ;->mSuperCaller:Ll/ۧܺ;

    .line 807
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ܳܺ;->mSuperCaller:Ll/ۧܺ;

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 182
    iget-object v0, p0, Ll/ܳܺ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 183
    invoke-virtual {v0}, Ll/᩹ۢ;->ۧ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ܳܺ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 209
    invoke-virtual {v0}, Ll/᩹ۢ;->ܽ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 693
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->ۜ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 734
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->᩷()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .line 558
    invoke-direct {p0}, Ll/ܳܺ;->ܽ()V

    .line 559
    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 2

    .line 586
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Ll/ܳܺ;->mTextClassifierHelper:Ll/۫ۡ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 589
    :cond_0
    invoke-virtual {v0}, Ll/۫ۡ;->֫()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0

    .line 587
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 863
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0}, Ll/ܳܺ;->ܳ(Ll/ܳܺ;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public getTextMetricsParamsCompat()Ll/֨ۤ;
    .locals 1

    .line 517
    invoke-static {p0}, Ll/ۙ֫֫;->֫(Ll/ܳܺ;)Ll/֨ۤ;

    move-result-object v0

    return-object v0
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    .line 238
    invoke-direct {p0}, Ll/ܳܺ;->ᩳ()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ;->֫()Z

    move-result v0

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    .line 441
    invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 442
    iget-object v1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    if-eqz v0, :cond_0

    .line 729
    invoke-virtual {p0}, Ll/ܳܺ;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p1, v1}, Ll/᩶۟;->֫(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 443
    :cond_0
    invoke-static {v0, p1, p0}, Ll/֫ۡ;->֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 782
    invoke-super {p0}, Landroid/widget/TextView;->onDetachedFromWindow()V

    .line 783
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 784
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 791
    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    :cond_0
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 254
    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    .line 255
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 575
    sget-boolean p2, Ll/᩹ᩴ;->ۧ:Z

    if-nez p2, :cond_0

    .line 576
    invoke-virtual {p1}, Ll/֫ܺ;->ۧ()V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 613
    invoke-direct {p0}, Ll/ܳܺ;->ܽ()V

    .line 614
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 273
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 274
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    sget-boolean p2, Ll/᩹ᩴ;->ۧ:Z

    if-nez p2, :cond_0

    .line 275
    invoke-virtual {p1}, Ll/֫ܺ;->ۢ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 277
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->ۧ()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    .line 227
    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 228
    invoke-direct {p0}, Ll/ܳܺ;->ᩳ()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫(Z)V

    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    .line 313
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 314
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 869
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0, p1, p2, p3, p4}, Ll/ܳܺ;->֫(Ll/ܳܺ;IIII)V

    return-void

    .line 317
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 318
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/֫ܺ;->֫(IIII)V

    :cond_1
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    .line 334
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 335
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 875
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0, p1, p2}, Ll/ܳܺ;->֫(Ll/ܳܺ;[II)V

    return-void

    .line 337
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 338
    invoke-virtual {v0, p1, p2}, Ll/֫ܺ;->֫([II)V

    :cond_1
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    .line 291
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 292
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 880
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0, p1}, Ll/ܳܺ;->ܽ(Ll/ܳܺ;I)V

    return-void

    .line 294
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 295
    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(I)V

    :cond_1
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 154
    invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 155
    iget-object p1, p0, Ll/ܳܺ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz p1, :cond_0

    .line 156
    invoke-virtual {p1}, Ll/᩹ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 146
    invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 147
    iget-object v0, p0, Ll/ܳܺ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 148
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(I)V

    :cond_0
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 620
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 621
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 629
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 630
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .locals 2

    .line 669
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 671
    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 672
    invoke-static {v0, p2}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 673
    invoke-static {v0, p3}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 674
    invoke-static {v0, p4}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 670
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Ll/ܳܺ;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 675
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_4

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_4
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 660
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 661
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .locals 2

    .line 646
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 648
    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 649
    invoke-static {v0, p2}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 650
    invoke-static {v0, p3}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 651
    invoke-static {v0, p4}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 647
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Ll/ܳܺ;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 652
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_4

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_4
    return-void
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 638
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 639
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 498
    invoke-static {p1, p0}, Ll/ۙ֫֫;->֫(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 497
    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    .line 233
    invoke-direct {p0}, Ll/ܳܺ;->ᩳ()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->ۧ(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    .line 222
    invoke-direct {p0}, Ll/ܳܺ;->ᩳ()Ll/۟ۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ;->֫([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setFirstBaselineToTopHeight(I)V
    .locals 2

    .line 448
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 449
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ۧܺ;->ۧ(I)V

    return-void

    .line 451
    :cond_0
    invoke-static {p0, p1}, Ll/ۙ֫֫;->֫(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setLastBaselineToBottomHeight(I)V
    .locals 2

    .line 458
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 459
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ۧܺ;->֫(I)V

    return-void

    .line 461
    :cond_0
    invoke-static {p0, p1}, Ll/ۙ֫֫;->ۧ(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setLineHeight(I)V
    .locals 0

    .line 478
    invoke-static {p0, p1}, Ll/ۙ֫֫;->ܽ(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setLineHeight(IF)V
    .locals 2

    .line 483
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 484
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/ۧܺ;->֫(IF)V

    return-void

    .line 486
    :cond_0
    invoke-static {p0, p1, p2}, Ll/ۙ֫֫;->֫(Landroid/widget/TextView;IF)V

    return-void
.end method

.method public setPrecomputedText(Ll/۠ۤ;)V
    .locals 0

    .line 541
    invoke-static {p0, p1}, Ll/ۙ֫֫;->֫(Ll/ܳܺ;Ll/۠ۤ;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 168
    iget-object v0, p0, Ll/ܳܺ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 169
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->ۧ(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ܳܺ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 195
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 715
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/content/res/ColorStateList;)V

    .line 716
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 753
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    .line 754
    iget-object p1, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    .line 214
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 215
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_0

    .line 216
    invoke-virtual {v0, p1, p2}, Ll/֫ܺ;->֫(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 2

    .line 568
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Ll/ܳܺ;->mTextClassifierHelper:Ll/۫ۡ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 572
    :cond_0
    invoke-virtual {v0, p1}, Ll/۫ۡ;->֫(Landroid/view/textclassifier/TextClassifier;)V

    return-void

    .line 569
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ܳܺ;->getSuperCaller()Ll/ۧܺ;

    move-result-object v0

    check-cast v0, Ll/ܽܺ;

    .line 885
    iget-object v0, v0, Ll/ܽܺ;->֫:Ll/ܳܺ;

    invoke-static {v0, p1}, Ll/ܳܺ;->֫(Ll/ܳܺ;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public setTextFuture(Ljava/util/concurrent/Future;)V
    .locals 0

    .line 605
    iput-object p1, p0, Ll/ܳܺ;->mPrecomputedTextFuture:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_0

    .line 607
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setTextMetricsParamsCompat(Ll/֨ۤ;)V
    .locals 0

    .line 528
    invoke-static {p0, p1}, Ll/ۙ֫֫;->֫(Ll/ܳܺ;Ll/֨ۤ;)V

    return-void
.end method

.method public setTextSize(IF)V
    .locals 1

    .line 262
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 263
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    return-void

    .line 265
    :cond_0
    iget-object v0, p0, Ll/ܳܺ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 266
    invoke-virtual {v0, p1, p2}, Ll/֫ܺ;->֫(IF)V

    :cond_1
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;I)V
    .locals 2

    .line 759
    iget-boolean v0, p0, Ll/ܳܺ;->mIsSetTypefaceProcessing:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    if-lez p2, :cond_2

    .line 768
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Ll/ۜ۬;->֫:I

    if-eqz v0, :cond_1

    .line 288
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_0

    .line 277
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Context cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    .line 771
    iput-boolean v1, p0, Ll/ܳܺ;->mIsSetTypefaceProcessing:Z

    if-eqz v0, :cond_3

    move-object p1, v0

    :cond_3
    const/4 v0, 0x0

    .line 773
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 775
    iput-boolean v0, p0, Ll/ܳܺ;->mIsSetTypefaceProcessing:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Ll/ܳܺ;->mIsSetTypefaceProcessing:Z

    .line 776
    throw p1
.end method
