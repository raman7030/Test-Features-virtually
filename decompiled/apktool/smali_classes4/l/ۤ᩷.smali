.class public Ll/ۤ᩷;
.super Landroid/view/ViewGroup;
.source "Q63C"

# interfaces
.implements Ll/᩵ܺ;
.implements Ll/۟ۛ;
.implements Ll/֫ۨ;


# static fields
.field public static final ֡֫:Ll/᩸ܰ;

.field public static final ۚ֫:Landroid/graphics/Rect;

.field public static final ᩵֫:[I


# instance fields
.field public ֫֫:Z

.field public final ۖ֫:Landroid/animation/AnimatorListenerAdapter;

.field public ۗ:Z

.field public ۘ֫:Landroid/graphics/drawable/Drawable;

.field public final ۙ:Ljava/lang/Runnable;

.field public final ۛ:Landroid/graphics/Rect;

.field public final ۜ֫:Ll/۫᩷;

.field public ۟:Z

.field public final ۡ֫:Ljava/lang/Runnable;

.field public final ۢ֫:Ll/ۧۨ;

.field public ۤ:Ll/ᩴܺ;

.field public ۧ֫:I

.field public ۨ:Landroid/view/ViewPropertyAnimator;

.field public ۫:Ll/᩸ܰ;

.field public final ۬:Landroid/graphics/Rect;

.field public ܰ:Landroid/widget/OverScroller;

.field public ܳ֫:Ll/᩸ܰ;

.field public final ܺ֫:Landroid/graphics/Rect;

.field public ܽ֫:Ll/᩸ܰ;

.field public ܿ֫:Ll/᩸ܰ;

.field public final ᩳ֫:Landroid/graphics/Rect;

.field public ᩴ֫:I

.field public ᩶:Ll/ܿ᩻;

.field public ᩷֫:Z

.field public ᩸:I

.field public ᩹:Ll/ܶ᩷;

.field public ᩺:Ll/֡ܺ;

.field public ᩻֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const v0, 0x7f040003

    const v1, 0x1010059

    .line 146
    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ۤ᩷;->᩵֫:[I

    .line 157
    new-instance v0, Ll/᩻ܰ;

    invoke-direct {v0}, Ll/᩻ܰ;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 159
    invoke-static {v1, v2, v1, v2}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Ll/᩻ܰ;->ۧ(Ll/ۧ۬;)V

    .line 159
    invoke-virtual {v0}, Ll/᩻ܰ;->֫()Ll/᩸ܰ;

    move-result-object v0

    sput-object v0, Ll/ۤ᩷;->֡֫:Ll/᩸ܰ;

    .line 160
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Ll/ۤ᩷;->ۚ֫:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 181
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 70
    iput p2, p0, Ll/ۤ᩷;->ᩴ֫:I

    .line 88
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Ll/ۤ᩷;->۬:Landroid/graphics/Rect;

    .line 89
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Ll/ۤ᩷;->ᩳ֫:Landroid/graphics/Rect;

    .line 90
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Ll/ۤ᩷;->ۛ:Landroid/graphics/Rect;

    .line 91
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Ll/ۤ᩷;->ܺ֫:Landroid/graphics/Rect;

    .line 94
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 95
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 96
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 97
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 100
    sget-object p2, Ll/᩸ܰ;->ۧ:Ll/᩸ܰ;

    iput-object p2, p0, Ll/ۤ᩷;->۫:Ll/᩸ܰ;

    .line 101
    iput-object p2, p0, Ll/ۤ᩷;->ܿ֫:Ll/᩸ܰ;

    .line 102
    iput-object p2, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    .line 103
    iput-object p2, p0, Ll/ۤ᩷;->ܳ֫:Ll/᩸ܰ;

    .line 113
    new-instance p2, Ll/᩶᩷;

    invoke-direct {p2, p0}, Ll/᩶᩷;-><init>(Ll/ۤ᩷;)V

    iput-object p2, p0, Ll/ۤ᩷;->ۖ֫:Landroid/animation/AnimatorListenerAdapter;

    .line 127
    new-instance p2, Ll/ۙ᩷;

    invoke-direct {p2, p0}, Ll/ۙ᩷;-><init>(Ll/ۤ᩷;)V

    iput-object p2, p0, Ll/ۤ᩷;->ۡ֫:Ljava/lang/Runnable;

    .line 136
    new-instance p2, Ll/ۗ᩷;

    invoke-direct {p2, p0}, Ll/ۗ᩷;-><init>(Ll/ۤ᩷;)V

    iput-object p2, p0, Ll/ۤ᩷;->ۙ:Ljava/lang/Runnable;

    .line 182
    invoke-direct {p0, p1}, Ll/ۤ᩷;->֫(Landroid/content/Context;)V

    .line 184
    new-instance p2, Ll/ۧۨ;

    .line 50
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 184
    iput-object p2, p0, Ll/ۤ᩷;->ۢ֫:Ll/ۧۨ;

    .line 185
    new-instance p2, Ll/۫᩷;

    .line 164
    invoke-direct {p2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 165
    invoke-virtual {p2, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 185
    iput-object p2, p0, Ll/ۤ᩷;->ۜ֫:Ll/۫᩷;

    .line 186
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private ֫(Landroid/content/Context;)V
    .locals 3

    .line 190
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Ll/ۤ᩷;->᩵֫:[I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x0

    .line 191
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p0, Ll/ۤ᩷;->᩸:I

    const/4 v2, 0x1

    .line 192
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Ll/ۤ᩷;->ۘ֫:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_0

    const/4 v1, 0x1

    .line 193
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 194
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 196
    new-instance v0, Landroid/widget/OverScroller;

    invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/ۤ᩷;->ܰ:Landroid/widget/OverScroller;

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 4

    .line 299
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Ll/۬᩷;

    .line 300
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, p1, Landroid/graphics/Rect;->left:I

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    .line 302
    iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 304
    :goto_0
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v3, p1, Landroid/graphics/Rect;->top:I

    if-eq v1, v3, :cond_1

    .line 306
    iput v3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/4 v0, 0x1

    .line 308
    :cond_1
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v3, p1, Landroid/graphics/Rect;->right:I

    if-eq v1, v3, :cond_2

    .line 310
    iput v3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v0, 0x1

    :cond_2
    if-eqz p2, :cond_3

    .line 312
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    if-eq p2, p1, :cond_3

    .line 314
    iput p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    return v2

    :cond_3
    return v0
.end method


# virtual methods
.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 421
    instance-of p1, p1, Ll/۬᩷;

    return p1
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 560
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 561
    iget-object v0, p0, Ll/ۤ᩷;->ۘ֫:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 562
    iget-object v0, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 563
    iget-object v0, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    move-result v2

    add-float/2addr v2, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr v2, v0

    float-to-int v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 565
    :goto_0
    iget-object v2, p0, Ll/ۤ᩷;->ۘ֫:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    iget-object v4, p0, Ll/ۤ᩷;->ۘ֫:Landroid/graphics/drawable/Drawable;

    .line 566
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    add-int/2addr v4, v0

    .line 565
    invoke-virtual {v2, v1, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 567
    iget-object v0, p0, Ll/ۤ᩷;->ۘ֫:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public final fitSystemWindows(Landroid/graphics/Rect;)Z
    .locals 0

    .line 324
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->fitSystemWindows(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 406
    new-instance v0, Ll/۬᩷;

    const/4 v1, -0x1

    .line 903
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 411
    new-instance v0, Ll/۬᩷;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/۬᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 416
    new-instance v0, Ll/۬᩷;

    .line 907
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final getNestedScrollAxes()I
    .locals 1

    .line 687
    iget-object v0, p0, Ll/ۤ᩷;->ۢ֫:Ll/ۧۨ;

    invoke-virtual {v0}, Ll/ۧۨ;->֫()I

    move-result v0

    return v0
.end method

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 6

    .line 364
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 366
    invoke-static {p0, p1}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object p1

    .line 368
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Ll/᩸ܰ;->ۜ()I

    move-result v1

    .line 369
    invoke-virtual {p1}, Ll/᩸ܰ;->ۢ()I

    move-result v2

    invoke-virtual {p1}, Ll/᩸ܰ;->᩷()I

    move-result v3

    .line 370
    invoke-virtual {p1}, Ll/᩸ܰ;->᩻()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 373
    iget-object v1, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ll/ۤ᩷;->֫(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    move-result v0

    .line 377
    iget-object v1, p0, Ll/ۤ᩷;->۬:Landroid/graphics/Rect;

    invoke-static {p0, p1, v1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/᩸ܰ;Landroid/graphics/Rect;)V

    .line 378
    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->top:I

    iget v4, v1, Landroid/graphics/Rect;->right:I

    iget v5, v1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, v2, v3, v4, v5}, Ll/᩸ܰ;->֫(IIII)Ll/᩸ܰ;

    move-result-object v2

    iput-object v2, p0, Ll/ۤ᩷;->۫:Ll/᩸ܰ;

    .line 381
    iget-object v3, p0, Ll/ۤ᩷;->ܿ֫:Ll/᩸ܰ;

    invoke-virtual {v3, v2}, Ll/᩸ܰ;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    .line 383
    iget-object v0, p0, Ll/ۤ᩷;->۫:Ll/᩸ܰ;

    iput-object v0, p0, Ll/ۤ᩷;->ܿ֫:Ll/᩸ܰ;

    const/4 v0, 0x1

    .line 385
    :cond_0
    iget-object v2, p0, Ll/ۤ᩷;->ᩳ֫:Landroid/graphics/Rect;

    invoke-virtual {v2, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 387
    invoke-virtual {v2, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_1
    move v3, v0

    :goto_0
    if-eqz v3, :cond_2

    .line 391
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 398
    :cond_2
    invoke-virtual {p1}, Ll/᩸ܰ;->֫()Ll/᩸ܰ;

    move-result-object p1

    .line 399
    invoke-virtual {p1}, Ll/᩸ܰ;->ܽ()Ll/᩸ܰ;

    move-result-object p1

    .line 400
    invoke-virtual {p1}, Ll/᩸ܰ;->ۧ()Ll/᩸ܰ;

    move-result-object p1

    .line 401
    invoke-virtual {p1}, Ll/᩸ܰ;->ۘ()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 254
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 255
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۤ᩷;->֫(Landroid/content/Context;)V

    .line 256
    invoke-static {p0}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 201
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 202
    invoke-virtual {p0}, Ll/ۤ᩷;->ۜ()V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 4

    .line 537
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    .line 539
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    .line 540
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p1, :cond_1

    .line 543
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    .line 544
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 545
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/۬᩷;

    .line 547
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 548
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 550
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v3, p2

    .line 551
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, p3

    add-int/2addr v1, v3

    add-int/2addr v2, v0

    .line 553
    invoke-virtual {p5, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    :cond_0
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 427
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 436
    iget-object v1, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 437
    iget-object v0, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/۬᩷;

    .line 438
    iget-object v1, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    .line 439
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, v2

    const/4 v2, 0x0

    .line 438
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 440
    iget-object v3, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    .line 441
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v3, v4

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v3, v0

    .line 440
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 442
    iget-object v3, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I

    move-result v3

    invoke-static {v2, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v3

    .line 444
    sget v4, Ll/ܿ᩺;->֫:I

    .line 2793
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result v4

    and-int/lit16 v4, v4, 0x100

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    .line 450
    iget v6, p0, Ll/ۤ᩷;->᩸:I

    .line 451
    iget-boolean v7, p0, Ll/ۤ᩷;->۟:Z

    if-eqz v7, :cond_3

    .line 452
    iget-object v7, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    .line 458
    :cond_1
    iget-object v6, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-eq v6, v7, :cond_2

    .line 461
    iget-object v6, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 468
    :cond_3
    :goto_1
    iget-object v7, p0, Ll/ۤ᩷;->۬:Landroid/graphics/Rect;

    iget-object v8, p0, Ll/ۤ᩷;->ۛ:Landroid/graphics/Rect;

    invoke-virtual {v8, v7}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 470
    iget-object v7, p0, Ll/ۤ᩷;->۫:Ll/᩸ܰ;

    iput-object v7, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    .line 475
    iget-boolean v7, p0, Ll/ۤ᩷;->᩷֫:Z

    if-nez v7, :cond_4

    if-nez v4, :cond_4

    .line 356
    iget-object v4, p0, Ll/ۤ᩷;->ۜ֫:Ll/۫᩷;

    sget-object v7, Ll/ۤ᩷;->֡֫:Ll/᩸ܰ;

    iget-object v9, p0, Ll/ۤ᩷;->ܺ֫:Landroid/graphics/Rect;

    invoke-static {v4, v7, v9}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/᩸ܰ;Landroid/graphics/Rect;)V

    .line 358
    sget-object v4, Ll/ۤ᩷;->ۚ֫:Landroid/graphics/Rect;

    invoke-virtual {v9, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 476
    iget v4, v8, Landroid/graphics/Rect;->top:I

    add-int/2addr v4, v6

    iput v4, v8, Landroid/graphics/Rect;->top:I

    .line 477
    iget v4, v8, Landroid/graphics/Rect;->bottom:I

    iput v4, v8, Landroid/graphics/Rect;->bottom:I

    .line 481
    iget-object v4, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    invoke-virtual {v4, v2, v6, v2, v2}, Ll/᩸ܰ;->֫(IIII)Ll/᩸ܰ;

    move-result-object v2

    iput-object v2, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    goto :goto_2

    .line 486
    :cond_4
    iget-object v2, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    .line 487
    invoke-virtual {v2}, Ll/᩸ܰ;->ۜ()I

    move-result v2

    iget-object v4, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    .line 488
    invoke-virtual {v4}, Ll/᩸ܰ;->ۢ()I

    move-result v4

    add-int/2addr v4, v6

    iget-object v6, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    .line 489
    invoke-virtual {v6}, Ll/᩸ܰ;->᩷()I

    move-result v6

    iget-object v7, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    .line 490
    invoke-virtual {v7}, Ll/᩸ܰ;->᩻()I

    move-result v7

    .line 486
    invoke-static {v2, v4, v6, v7}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object v2

    .line 492
    new-instance v4, Ll/᩻ܰ;

    iget-object v6, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    invoke-direct {v4, v6}, Ll/᩻ܰ;-><init>(Ll/᩸ܰ;)V

    .line 493
    invoke-virtual {v4, v2}, Ll/᩻ܰ;->ۧ(Ll/ۧ۬;)V

    .line 494
    invoke-virtual {v4}, Ll/᩻ܰ;->֫()Ll/᩸ܰ;

    move-result-object v2

    iput-object v2, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    .line 500
    :goto_2
    iget-object v2, p0, Ll/ۤ᩷;->ۤ:Ll/ᩴܺ;

    invoke-static {v2, v8, v5}, Ll/ۤ᩷;->֫(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 505
    iget-object v2, p0, Ll/ۤ᩷;->ܳ֫:Ll/᩸ܰ;

    iget-object v4, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    invoke-virtual {v2, v4}, Ll/᩸ܰ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 506
    iget-object v2, p0, Ll/ۤ᩷;->ܽ֫:Ll/᩸ܰ;

    iput-object v2, p0, Ll/ۤ᩷;->ܳ֫:Ll/᩸ܰ;

    .line 507
    iget-object v4, p0, Ll/ۤ᩷;->ۤ:Ll/ᩴܺ;

    invoke-static {v4, v2}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    .line 513
    :cond_5
    iget-object v6, p0, Ll/ۤ᩷;->ۤ:Ll/ᩴܺ;

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v5, p0

    move v7, p1

    move v9, p2

    invoke-virtual/range {v5 .. v10}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 514
    iget-object v2, p0, Ll/ۤ᩷;->ۤ:Ll/ᩴܺ;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/۬᩷;

    .line 515
    iget-object v4, p0, Ll/ۤ᩷;->ۤ:Ll/ᩴܺ;

    .line 516
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v4, v5

    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    .line 515
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 517
    iget-object v4, p0, Ll/ۤ᩷;->ۤ:Ll/ᩴܺ;

    .line 518
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v4, v5

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, v2

    .line 517
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 519
    iget-object v2, p0, Ll/ۤ᩷;->ۤ:Ll/ᩴܺ;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    invoke-static {v3, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    .line 522
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, v1

    .line 523
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v1

    add-int/2addr v3, v0

    .line 526
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 527
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 530
    invoke-static {v1, p1, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    shl-int/lit8 v1, v2, 0x10

    .line 531
    invoke-static {v0, p2, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    .line 529
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 9

    .line 663
    iget-boolean p1, p0, Ll/ۤ᩷;->֫֫:Z

    if-eqz p1, :cond_2

    if-nez p4, :cond_0

    goto :goto_1

    .line 763
    :cond_0
    iget-object v0, p0, Ll/ۤ᩷;->ܰ:Landroid/widget/OverScroller;

    float-to-int v4, p3

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 764
    iget-object p1, p0, Ll/ۤ᩷;->ܰ:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->getFinalY()I

    move-result p1

    .line 765
    iget-object p2, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    if-le p1, p2, :cond_1

    .line 758
    invoke-virtual {p0}, Ll/ۤ᩷;->ۜ()V

    .line 759
    iget-object p1, p0, Ll/ۤ᩷;->ۙ:Ljava/lang/Runnable;

    check-cast p1, Ll/ۗ᩷;

    invoke-virtual {p1}, Ll/ۗ᩷;->run()V

    goto :goto_0

    .line 753
    :cond_1
    invoke-virtual {p0}, Ll/ۤ᩷;->ۜ()V

    .line 754
    iget-object p1, p0, Ll/ۤ᩷;->ۡ֫:Ljava/lang/Runnable;

    check-cast p1, Ll/ۙ᩷;

    invoke-virtual {p1}, Ll/ۙ᩷;->run()V

    :goto_0
    const/4 p1, 0x1

    .line 671
    iput-boolean p1, p0, Ll/ۤ᩷;->ۗ:Z

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 0

    return-void
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 0

    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    .line 643
    iget p1, p0, Ll/ۤ᩷;->ۧ֫:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ۤ᩷;->ۧ֫:I

    .line 728
    invoke-virtual {p0}, Ll/ۤ᩷;->ۜ()V

    .line 729
    iget-object p2, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    const/4 p3, 0x0

    .line 730
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 731
    iget-object p2, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    neg-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIIII)V
    .locals 0

    if-nez p6, :cond_0

    .line 609
    invoke-virtual/range {p0 .. p5}, Ll/ۤ᩷;->onNestedScroll(Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIIII[I)V
    .locals 0

    .line 581
    invoke-virtual/range {p0 .. p6}, Ll/ۤ᩷;->onNestedScroll(Landroid/view/View;IIIII)V

    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 632
    iget-object p1, p0, Ll/ۤ᩷;->ۢ֫:Ll/ۧۨ;

    invoke-virtual {p1, p3}, Ll/ۧۨ;->֫(I)V

    .line 724
    iget-object p1, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    float-to-int p1, p1

    neg-int p1, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 633
    :goto_0
    iput p1, p0, Ll/ۤ᩷;->ۧ֫:I

    .line 634
    invoke-virtual {p0}, Ll/ۤ᩷;->ۜ()V

    .line 635
    iget-object p1, p0, Ll/ۤ᩷;->᩶:Ll/ܿ᩻;

    if-eqz p1, :cond_1

    .line 636
    invoke-virtual {p1}, Ll/ܿ᩻;->ۢ()V

    :cond_1
    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    if-nez p4, :cond_0

    .line 594
    invoke-virtual {p0, p1, p2, p3}, Ll/ۤ᩷;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_1

    .line 624
    iget-object p1, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 627
    :cond_0
    iget-boolean p1, p0, Ll/ۤ᩷;->֫֫:Z

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    if-nez p4, :cond_0

    .line 588
    invoke-virtual {p0, p1, p2, p3}, Ll/ۤ᩷;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 3

    .line 649
    iget-boolean p1, p0, Ll/ۤ᩷;->֫֫:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Ll/ۤ᩷;->ۗ:Z

    if-nez p1, :cond_1

    .line 650
    iget p1, p0, Ll/ۤ᩷;->ۧ֫:I

    iget-object v0, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    const-wide/16 v1, 0x258

    if-gt p1, v0, :cond_0

    .line 743
    invoke-virtual {p0}, Ll/ۤ᩷;->ۜ()V

    .line 744
    iget-object p1, p0, Ll/ۤ᩷;->ۡ֫:Ljava/lang/Runnable;

    invoke-virtual {p0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 748
    :cond_0
    invoke-virtual {p0}, Ll/ۤ᩷;->ۜ()V

    .line 749
    iget-object p1, p0, Ll/ۤ᩷;->ۙ:Ljava/lang/Runnable;

    invoke-virtual {p0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final onStopNestedScroll(Landroid/view/View;I)V
    .locals 0

    if-nez p2, :cond_0

    .line 601
    invoke-virtual {p0, p1}, Ll/ۤ᩷;->onStopNestedScroll(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final onWindowSystemUiVisibilityChanged(I)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 266
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowSystemUiVisibilityChanged(I)V

    .line 267
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 268
    iget v0, p0, Ll/ۤ᩷;->᩻֫:I

    xor-int/2addr v0, p1

    .line 269
    iput p1, p0, Ll/ۤ᩷;->᩻֫:I

    and-int/lit8 v1, p1, 0x4

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit16 p1, p1, 0x100

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    .line 272
    :cond_1
    iget-object p1, p0, Ll/ۤ᩷;->᩶:Ll/ܿ᩻;

    if-eqz p1, :cond_4

    xor-int/lit8 v3, v2, 0x1

    .line 276
    invoke-virtual {p1, v3}, Ll/ܿ᩻;->ܳ(Z)V

    if-nez v1, :cond_3

    if-nez v2, :cond_2

    goto :goto_1

    .line 278
    :cond_2
    iget-object p1, p0, Ll/ۤ᩷;->᩶:Ll/ܿ᩻;

    invoke-virtual {p1}, Ll/ܿ᩻;->᩷()V

    goto :goto_2

    .line 277
    :cond_3
    :goto_1
    iget-object p1, p0, Ll/ۤ᩷;->᩶:Ll/ܿ᩻;

    invoke-virtual {p1}, Ll/ܿ᩻;->ۡ()V

    :cond_4
    :goto_2
    and-int/lit16 p1, v0, 0x100

    if-eqz p1, :cond_5

    .line 281
    iget-object p1, p0, Ll/ۤ᩷;->᩶:Ll/ܿ᩻;

    if-eqz p1, :cond_5

    .line 282
    invoke-static {p0}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    :cond_5
    return-void
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 1

    .line 289
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowVisibilityChanged(I)V

    .line 290
    iput p1, p0, Ll/ۤ᩷;->ᩴ֫:I

    .line 291
    iget-object v0, p0, Ll/ۤ᩷;->᩶:Ll/ܿ᩻;

    if-eqz v0, :cond_0

    .line 292
    invoke-virtual {v0, p1}, Ll/ܿ᩻;->ۧ(I)V

    :cond_0
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 788
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const/16 v0, 0x6d

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 220
    iput-boolean p1, p0, Ll/ۤ᩷;->᩷֫:Z

    return-void

    .line 794
    :cond_1
    iget-object p1, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 791
    :cond_2
    iget-object p1, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Landroid/view/Menu;Ll/ܿ᩷;)V
    .locals 1

    .line 875
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 876
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0, p1, p2}, Ll/֡ܺ;->֫(Landroid/view/Menu;Ll/ܿ᩷;)V

    return-void
.end method

.method public final ֫(Landroid/view/Window$Callback;)V
    .locals 1

    .line 770
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 771
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0, p1}, Ll/֡ܺ;->֫(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 776
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 777
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0, p1}, Ll/֡ܺ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ll/ܿ᩻;)V
    .locals 1

    .line 206
    iput-object p1, p0, Ll/ۤ᩷;->᩶:Ll/ܿ᩻;

    .line 207
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 210
    iget-object p1, p0, Ll/ۤ᩷;->᩶:Ll/ܿ᩻;

    iget v0, p0, Ll/ۤ᩷;->ᩴ֫:I

    invoke-virtual {p1, v0}, Ll/ܿ᩻;->ۧ(I)V

    .line 211
    iget p1, p0, Ll/ۤ᩷;->᩻֫:I

    if-eqz p1, :cond_0

    .line 213
    invoke-virtual {p0, p1}, Ll/ۤ᩷;->onWindowSystemUiVisibilityChanged(I)V

    .line 214
    invoke-static {p0}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 228
    iput-boolean p1, p0, Ll/ۤ᩷;->۟:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 839
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 840
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ۜ()V
    .locals 1

    .line 735
    iget-object v0, p0, Ll/ۤ᩷;->ۡ֫:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 736
    iget-object v0, p0, Ll/ۤ᩷;->ۙ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 737
    iget-object v0, p0, Ll/ۤ᩷;->ۨ:Landroid/view/ViewPropertyAnimator;

    if-eqz v0, :cond_0

    .line 738
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    :cond_0
    return-void
.end method

.method public final ۢ()V
    .locals 3

    .line 691
    iget-object v0, p0, Ll/ۤ᩷;->ۤ:Ll/ᩴܺ;

    if-nez v0, :cond_2

    const v0, 0x7f0a0043

    .line 692
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ᩴܺ;

    iput-object v0, p0, Ll/ۤ᩷;->ۤ:Ll/ᩴܺ;

    const v0, 0x7f0a0044

    .line 693
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶ᩷;

    iput-object v0, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    const v0, 0x7f0a0042

    .line 694
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 699
    instance-of v1, v0, Ll/֡ܺ;

    if-eqz v1, :cond_0

    .line 700
    check-cast v0, Ll/֡ܺ;

    goto :goto_0

    .line 701
    :cond_0
    instance-of v1, v0, Ll/ۢᩴ;

    if-eqz v1, :cond_1

    .line 702
    check-cast v0, Ll/ۢᩴ;

    invoke-virtual {v0}, Ll/ۢᩴ;->getWrapper()Ll/֡ܺ;

    move-result-object v0

    .line 694
    :goto_0
    iput-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    return-void

    .line 704
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 705
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Can\'t make a decor toolbar out of "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    return-void
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 710
    iget-boolean v0, p0, Ll/ۤ᩷;->֫֫:Z

    if-eq p1, v0, :cond_0

    .line 711
    iput-boolean p1, p0, Ll/ۤ᩷;->֫֫:Z

    if-nez p1, :cond_0

    .line 713
    invoke-virtual {p0}, Ll/ۤ᩷;->ۜ()V

    .line 728
    invoke-virtual {p0}, Ll/ۤ᩷;->ۜ()V

    .line 729
    iget-object p1, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    const/4 v0, 0x0

    .line 730
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 731
    iget-object v0, p0, Ll/ۤ᩷;->᩹:Ll/ܶ᩷;

    neg-int p1, p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 863
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 864
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 851
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 852
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->ܳ()Z

    move-result v0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 857
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 858
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->ܽ()Z

    move-result v0

    return v0
.end method

.method public final ܿ()V
    .locals 1

    .line 869
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 870
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->ܿ()V

    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 845
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 846
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 224
    iget-boolean v0, p0, Ll/ۤ᩷;->᩷֫:Z

    return v0
.end method

.method public final ᩻()V
    .locals 1

    .line 893
    invoke-virtual {p0}, Ll/ۤ᩷;->ۢ()V

    .line 894
    iget-object v0, p0, Ll/ۤ᩷;->᩺:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->ۜ()V

    return-void
.end method
