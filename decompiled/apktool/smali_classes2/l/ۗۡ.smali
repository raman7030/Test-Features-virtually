.class public Ll/ۗۡ;
.super Landroid/widget/Spinner;
.source "N5WL"


# static fields
.field public static final ۛ:[I
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceType"
        }
    .end annotation
.end field


# instance fields
.field public final ۗ:Landroid/content/Context;

.field public ۙ:Ll/ۙۡ;

.field public final ۤ:Landroid/graphics/Rect;

.field public ۫:Landroid/widget/SpinnerAdapter;

.field public final ۬:Z

.field public ᩶:Ll/ܰܺ;

.field public final ᩸:Ll/᩹ۢ;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x10102f1

    .line 86
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/ۗۡ;->ۛ:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f04044f

    .line 151
    invoke-direct {p0, p1, p2, v0}, Ll/ۗۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    .line 216
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 113
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۗۡ;->ۤ:Landroid/graphics/Rect;

    .line 218
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 220
    sget-object v0, Ll/ۗᩳ;->᩶:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object v2

    .line 223
    new-instance v3, Ll/᩹ۢ;

    invoke-direct {v3, p0}, Ll/᩹ۢ;-><init>(Landroid/view/View;)V

    iput-object v3, p0, Ll/ۗۡ;->᩸:Ll/᩹ۢ;

    const/4 v3, 0x4

    .line 228
    invoke-virtual {v2, v3, v1}, Ll/᩺ۘ;->ܳ(II)I

    move-result v3

    if-eqz v3, :cond_0

    .line 230
    new-instance v4, Ll/۫᩻;

    invoke-direct {v4, p1, v3}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    iput-object v4, p0, Ll/ۗۡ;->ۗ:Landroid/content/Context;

    goto :goto_0

    .line 232
    :cond_0
    iput-object p1, p0, Ll/ۗۡ;->ۗ:Landroid/content/Context;

    :goto_0
    const/4 v3, -0x1

    const/4 v4, 0x0

    .line 239
    :try_start_0
    sget-object v5, Ll/ۗۡ;->ۛ:[I

    invoke-virtual {p1, p2, v5, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 241
    :try_start_1
    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 242
    invoke-virtual {v5, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    move-object v4, v5

    goto :goto_1

    :catch_0
    nop

    goto :goto_2

    :catchall_1
    move-exception p1

    :goto_1
    if-eqz v4, :cond_1

    .line 248
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 250
    :cond_1
    throw p1

    :catch_1
    move-object v5, v4

    :goto_2
    if-eqz v5, :cond_3

    .line 248
    :cond_2
    :goto_3
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3
    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_5

    if-eq v3, v6, :cond_4

    goto :goto_4

    .line 260
    :cond_4
    new-instance v3, Ll/᩸ۡ;

    iget-object v7, p0, Ll/ۗۡ;->ۗ:Landroid/content/Context;

    invoke-direct {v3, p0, v7, p2, p3}, Ll/᩸ۡ;-><init>(Ll/ۗۡ;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 261
    iget-object v7, p0, Ll/ۗۡ;->ۗ:Landroid/content/Context;

    invoke-static {v7, p2, v0, p3, v1}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v7, -0x2

    .line 263
    invoke-virtual {v0, v1, v7}, Ll/᩺ۘ;->ܿ(II)I

    move-result v1

    iput v1, p0, Ll/ۗۡ;->᩹:I

    .line 266
    invoke-virtual {v0, v6}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 265
    invoke-virtual {v3, v1}, Ll/ۢۖ;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 267
    invoke-virtual {v2, v5}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/᩸ۡ;->֫(Ljava/lang/CharSequence;)V

    .line 268
    invoke-virtual {v0}, Ll/᩺ۘ;->ܿ()V

    .line 270
    iput-object v3, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    .line 271
    new-instance v0, Ll/ۘۡ;

    invoke-direct {v0, p0, p0, v3}, Ll/ۘۡ;-><init>(Ll/ۗۡ;Ll/ۗۡ;Ll/᩸ۡ;)V

    iput-object v0, p0, Ll/ۗۡ;->᩶:Ll/ܰܺ;

    goto :goto_4

    .line 255
    :cond_5
    new-instance v0, Ll/֡ۡ;

    invoke-direct {v0, p0}, Ll/֡ۡ;-><init>(Ll/ۗۡ;)V

    iput-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    .line 256
    invoke-virtual {v2, v5}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֡ۡ;->֫(Ljava/lang/CharSequence;)V

    .line 288
    :goto_4
    invoke-virtual {v2}, Ll/᩺ۘ;->ۧ()[Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 290
    new-instance v1, Landroid/widget/ArrayAdapter;

    const v3, 0x1090008

    invoke-direct {v1, p1, v3, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const p1, 0x7f0d01cb

    .line 292
    invoke-virtual {v1, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 293
    invoke-virtual {p0, v1}, Ll/ۗۡ;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 296
    :cond_6
    invoke-virtual {v2}, Ll/᩺ۘ;->ܿ()V

    .line 298
    iput-boolean v6, p0, Ll/ۗۡ;->۬:Z

    .line 302
    iget-object p1, p0, Ll/ۗۡ;->۫:Landroid/widget/SpinnerAdapter;

    if-eqz p1, :cond_7

    .line 303
    invoke-virtual {p0, p1}, Ll/ۗۡ;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 304
    iput-object v4, p0, Ll/ۗۡ;->۫:Landroid/widget/SpinnerAdapter;

    .line 307
    :cond_7
    iget-object p1, p0, Ll/ۗۡ;->᩸:Ll/᩹ۢ;

    invoke-virtual {p1, p2, p3}, Ll/᩹ۢ;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    .line 549
    invoke-super {p0}, Landroid/widget/Spinner;->drawableStateChanged()V

    .line 550
    iget-object v0, p0, Ll/ۗۡ;->᩸:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 551
    invoke-virtual {v0}, Ll/᩹ۢ;->֫()V

    :cond_0
    return-void
.end method

.method public final getDropDownHorizontalOffset()I
    .locals 1

    .line 377
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    .line 378
    invoke-interface {v0}, Ll/ۙۡ;->֫()I

    move-result v0

    return v0

    .line 380
    :cond_0
    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownHorizontalOffset()I

    move-result v0

    return v0
.end method

.method public final getDropDownVerticalOffset()I
    .locals 1

    .line 352
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    .line 353
    invoke-interface {v0}, Ll/ۙۡ;->ܽ()I

    move-result v0

    return v0

    .line 355
    :cond_0
    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownVerticalOffset()I

    move-result v0

    return v0
.end method

.method public final getDropDownWidth()I
    .locals 1

    .line 395
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    .line 396
    iget v0, p0, Ll/ۗۡ;->᩹:I

    return v0

    .line 398
    :cond_0
    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownWidth()I

    move-result v0

    return v0
.end method

.method public final getPopupBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 334
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    .line 335
    invoke-interface {v0}, Ll/ۙۡ;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 337
    :cond_0
    invoke-super {p0}, Landroid/widget/Spinner;->getPopupBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final getPopupContext()Landroid/content/Context;
    .locals 1

    .line 315
    iget-object v0, p0, Ll/ۗۡ;->ۗ:Landroid/content/Context;

    return-object v0
.end method

.method public final getPrompt()Ljava/lang/CharSequence;
    .locals 1

    .line 474
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۙۡ;->ۧ()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Landroid/widget/Spinner;->getPrompt()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 421
    invoke-super {p0}, Landroid/widget/Spinner;->onDetachedFromWindow()V

    .line 423
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۙۡ;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 424
    invoke-interface {v0}, Ll/ۙۡ;->dismiss()V

    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 438
    invoke-super {p0, p1, p2}, Landroid/widget/Spinner;->onMeasure(II)V

    .line 440
    iget-object p2, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz p2, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_0

    .line 441
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    .line 443
    invoke-virtual {p0}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll/ۗۡ;->֫(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v0

    .line 442
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 444
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 442
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 445
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    .line 442
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    :cond_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 619
    check-cast p1, Ll/᩶ۡ;

    .line 621
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/Spinner;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 623
    iget-boolean p1, p1, Ll/᩶ۡ;->᩸:Z

    if-eqz p1, :cond_0

    .line 624
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 626
    new-instance v0, Ll/ᩴۡ;

    invoke-direct {v0, p0}, Ll/ᩴۡ;-><init>(Ll/ۗۡ;)V

    .line 638
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 611
    new-instance v0, Ll/᩶ۡ;

    .line 612
    invoke-super {p0}, Landroid/widget/Spinner;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 647
    invoke-direct {v0, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 613
    iget-object v1, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ll/ۙۡ;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Ll/᩶ۡ;->᩸:Z

    return-object v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 430
    iget-object v0, p0, Ll/ۗۡ;->᩶:Ll/ܰܺ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Ll/ܰܺ;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 433
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public performClick()Z
    .locals 1

    .line 451
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_1

    .line 453
    invoke-interface {v0}, Ll/ۙۡ;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 454
    invoke-virtual {p0}, Ll/ۗۡ;->ۧ()V

    :cond_0
    const/4 v0, 0x1

    return v0

    .line 460
    :cond_1
    invoke-super {p0}, Landroid/widget/Spinner;->performClick()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 81
    check-cast p1, Landroid/widget/SpinnerAdapter;

    invoke-virtual {p0, p1}, Ll/ۗۡ;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public final setAdapter(Landroid/widget/SpinnerAdapter;)V
    .locals 3

    .line 406
    iget-boolean v0, p0, Ll/ۗۡ;->۬:Z

    if-nez v0, :cond_0

    .line 407
    iput-object p1, p0, Ll/ۗۡ;->۫:Landroid/widget/SpinnerAdapter;

    return-void

    .line 411
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 413
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_2

    .line 414
    iget-object v1, p0, Ll/ۗۡ;->ۗ:Landroid/content/Context;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 415
    :cond_1
    new-instance v2, Ll/ۚۡ;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-direct {v2, p1, v1}, Ll/ۚۡ;-><init>(Landroid/widget/SpinnerAdapter;Landroid/content/res/Resources$Theme;)V

    invoke-interface {v0, v2}, Ll/ۙۡ;->֫(Landroid/widget/ListAdapter;)V

    :cond_2
    return-void
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 487
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 488
    iget-object p1, p0, Ll/ۗۡ;->᩸:Ll/᩹ۢ;

    if-eqz p1, :cond_0

    .line 489
    invoke-virtual {p1}, Ll/᩹ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    .line 479
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundResource(I)V

    .line 480
    iget-object v0, p0, Ll/ۗۡ;->᩸:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 481
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final setDropDownHorizontalOffset(I)V
    .locals 1

    .line 361
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    .line 362
    invoke-interface {v0, p1}, Ll/ۙۡ;->ܽ(I)V

    .line 363
    invoke-interface {v0, p1}, Ll/ۙۡ;->֫(I)V

    return-void

    .line 365
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownHorizontalOffset(I)V

    return-void
.end method

.method public final setDropDownVerticalOffset(I)V
    .locals 1

    .line 343
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    .line 344
    invoke-interface {v0, p1}, Ll/ۙۡ;->ۧ(I)V

    return-void

    .line 346
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownVerticalOffset(I)V

    return-void
.end method

.method public final setDropDownWidth(I)V
    .locals 1

    .line 386
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    .line 387
    iput p1, p0, Ll/ۗۡ;->᩹:I

    return-void

    .line 389
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownWidth(I)V

    return-void
.end method

.method public final setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 320
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    .line 321
    invoke-interface {v0, p1}, Ll/ۙۡ;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 323
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setPopupBackgroundResource(I)V
    .locals 1

    .line 315
    iget-object v0, p0, Ll/ۗۡ;->ۗ:Landroid/content/Context;

    .line 329
    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗۡ;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setPrompt(Ljava/lang/CharSequence;)V
    .locals 1

    .line 465
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    if-eqz v0, :cond_0

    .line 466
    invoke-interface {v0, p1}, Ll/ۙۡ;->֫(Ljava/lang/CharSequence;)V

    return-void

    .line 468
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setPrompt(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 564
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 566
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 570
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 571
    invoke-interface {p1}, Landroid/widget/Adapter;->getCount()I

    move-result v4

    add-int/lit8 v5, v3, 0xf

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int v5, v4, v3

    rsub-int/lit8 v5, v5, 0xf

    sub-int/2addr v3, v5

    .line 573
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, v5

    :goto_0
    if-ge v3, v4, :cond_3

    .line 575
    invoke-interface {p1, v3}, Landroid/widget/Adapter;->getItemViewType(I)I

    move-result v8

    if-eq v8, v0, :cond_1

    move-object v7, v5

    move v0, v8

    .line 580
    :cond_1
    invoke-interface {p1, v3, v7, p0}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 581
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    if-nez v8, :cond_2

    .line 582
    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    const/4 v9, -0x2

    invoke-direct {v8, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 586
    :cond_2
    invoke-virtual {v7, v1, v2}, Landroid/view/View;->measure(II)V

    .line 587
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    .line 592
    iget-object p1, p0, Ll/ۗۡ;->ۤ:Landroid/graphics/Rect;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 593
    iget p2, p1, Landroid/graphics/Rect;->left:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr p2, p1

    add-int/2addr p2, v6

    return p2

    :cond_4
    return v6
.end method

.method public final ֫()Ll/ۙۡ;
    .locals 1

    .line 601
    iget-object v0, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    return-object v0
.end method

.method public final ۧ()V
    .locals 3

    .line 605
    invoke-virtual {p0}, Landroid/view/View;->getTextDirection()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getTextAlignment()I

    move-result v1

    iget-object v2, p0, Ll/ۗۡ;->ۙ:Ll/ۙۡ;

    invoke-interface {v2, v0, v1}, Ll/ۙۡ;->֫(II)V

    return-void
.end method
