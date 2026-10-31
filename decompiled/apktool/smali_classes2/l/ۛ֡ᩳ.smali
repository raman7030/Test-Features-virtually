.class public Ll/ۛ֡ᩳ;
.super Landroid/view/ViewGroup;
.source "2APP"


# static fields
.field public static final ۢ֫:Ljava/util/WeakHashMap;

.field public static final synthetic ᩷֫:I


# instance fields
.field public ֫֫:F

.field public final ۗ:[I

.field public ۙ:Z

.field public ۛ:I

.field public ۜ֫:Landroid/view/VelocityTracker;

.field public ۟:I

.field public ۤ:I

.field public final ۧ֫:Ll/ۧۚᩳ;

.field public ۨ:I

.field public ۫:I

.field public ۬:I

.field public final ܰ:Landroid/graphics/Paint;

.field public ܳ֫:F

.field public final ܽ֫:Ll/ۢܶۡ;

.field public final ܿ֫:F

.field public final ᩳ֫:Lcom/google/android/material/tabs/TabLayout;

.field public final ᩶:Landroid/content/Context;

.field public final ᩸:Ll/ۤ֨ۘ;

.field public ᩹:Z

.field public ᩺:I

.field public ᩻֫:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll/ۛ֡ᩳ;->ۢ֫:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, p1, p2, v0}, Ll/ۛ֡ᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 72
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 54
    new-instance p2, Ll/ۢܶۡ;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Ll/ۢܶۡ;-><init>(I)V

    iput-object p2, p0, Ll/ۛ֡ᩳ;->ܽ֫:Ll/ۢܶۡ;

    const/4 p2, 0x2

    new-array p2, p2, [I

    .line 196
    iput-object p2, p0, Ll/ۛ֡ᩳ;->ۗ:[I

    .line 254
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object p2

    iput-object p2, p0, Ll/ۛ֡ᩳ;->ۜ֫:Landroid/view/VelocityTracker;

    .line 73
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Ll/ۛ֡ᩳ;->ܿ֫:F

    .line 75
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const p3, 0x7f0d01e7

    const/4 v0, 0x0

    .line 76
    invoke-virtual {p2, p3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/google/android/material/tabs/TabLayout;

    iput-object p3, p0, Ll/ۛ֡ᩳ;->ᩳ֫:Lcom/google/android/material/tabs/TabLayout;

    const v1, 0x7f0d01d4

    .line 77
    invoke-virtual {p2, v1, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/ۤ֨ۘ;

    iput-object p2, p0, Ll/ۛ֡ᩳ;->᩸:Ll/ۤ֨ۘ;

    .line 78
    new-instance v0, Ll/ۧۚᩳ;

    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p1, v1}, Ll/ۧۚᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 78
    iput-object v0, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    .line 80
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 81
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 p2, -0x1

    const/4 v1, -0x2

    .line 82
    invoke-virtual {p0, v0, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 84
    invoke-virtual {p3, v0}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Ll/֡ܰۧ;)V

    .line 85
    new-instance p2, Ll/۬֡ᩳ;

    invoke-direct {p2, p0}, Ll/۬֡ᩳ;-><init>(Ll/ۛ֡ᩳ;)V

    invoke-virtual {v0, p2}, Ll/֡ܰۧ;->֫(Ll/ܺܰۧ;)V

    .line 87
    invoke-static {p1}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    .line 91
    :goto_0
    iput-object p1, p0, Ll/ۛ֡ᩳ;->᩶:Landroid/content/Context;

    .line 93
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Ll/ۛ֡ᩳ;->ܰ:Landroid/graphics/Paint;

    .line 94
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 95
    invoke-direct {p0}, Ll/ۛ֡ᩳ;->ܳ()V

    .line 96
    invoke-direct {p0}, Ll/ۛ֡ᩳ;->ܿ()V

    return-void
.end method

.method private ֫(Landroid/view/MotionEvent;)V
    .locals 8

    .line 402
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v7

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object p1

    .line 403
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ۜ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 404
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛ֡ᩳ;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 471
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۛ֡ᩳ;->ۧ(I)V

    return-void
.end method

.method public static ֫(Ll/ۛ֡ᩳ;Ll/֡ܰۧ;)V
    .locals 1

    .line 85
    iget-object p0, p0, Ll/ۛ֡ᩳ;->᩸:Ll/ۤ֨ۘ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "viewPager"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    invoke-static {p0, p1}, Ll/᩻۠ۘ;->֫(Ll/ۙ֨ۘ;Ll/֡ܰۧ;)V

    return-void
.end method

.method private ۧ(I)V
    .locals 5

    .line 408
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 409
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v1, p1, :cond_2

    .line 410
    iget v1, p0, Ll/ۛ֡ᩳ;->ۛ:I

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۛ֡ᩳ;->᩶:Landroid/content/Context;

    sget-object v4, Ll/ۛ֡ᩳ;->ۢ֫:Ljava/util/WeakHashMap;

    if-ne p1, v1, :cond_0

    .line 411
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v3, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 412
    invoke-static {v1}, Ll/ۙ֡ᩳ;->ۧ(Z)V

    goto :goto_0

    .line 413
    :cond_0
    iget v1, p0, Ll/ۛ֡ᩳ;->۬:I

    if-ne p1, v1, :cond_1

    .line 414
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v3, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    invoke-static {v2}, Ll/ۙ֡ᩳ;->ۧ(Z)V

    .line 417
    :cond_1
    :goto_0
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 418
    iput-boolean v2, p0, Ll/ۛ֡ᩳ;->ۙ:Z

    .line 419
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    return-void
.end method

.method public static synthetic ۧ(Ll/ۛ֡ᩳ;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 459
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۛ֡ᩳ;->ۧ(I)V

    return-void
.end method

.method private ܳ()V
    .locals 5

    .line 100
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    sget v0, Ll/۠ܳܿ;->֫:I

    .line 245
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "text_function_min_line"

    invoke-interface {v0, v2, v1}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 101
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    sget v2, Ll/۠ܳܿ;->֫:I

    .line 249
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "text_function_max_line"

    const/4 v4, 0x4

    invoke-interface {v2, v3, v4}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v2

    :goto_1
    if-ge v0, v1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v0

    :goto_2
    if-ge v2, v1, :cond_3

    move v2, v1

    .line 108
    :cond_3
    iget v0, p0, Ll/ۛ֡ᩳ;->ۨ:I

    if-ne v0, v1, :cond_5

    iget v0, p0, Ll/ۛ֡ᩳ;->۫:I

    if-eq v0, v2, :cond_4

    goto :goto_3

    :cond_4
    return-void

    .line 109
    :cond_5
    :goto_3
    iput v1, p0, Ll/ۛ֡ᩳ;->ۨ:I

    .line 110
    iput v2, p0, Ll/ۛ֡ᩳ;->۫:I

    .line 111
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method private ܿ()V
    .locals 6

    .line 116
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget v0, Ll/۠ܳܿ;->֫:I

    .line 267
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "tfgi"

    invoke-interface {v0, v2, v1}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 116
    :goto_0
    iget-object v2, p0, Ll/ۛ֡ᩳ;->᩸:Ll/ۤ֨ۘ;

    iget-object v3, p0, Ll/ۛ֡ᩳ;->ᩳ֫:Lcom/google/android/material/tabs/TabLayout;

    const/16 v4, 0x8

    if-eqz v0, :cond_3

    const/4 v5, 0x1

    if-eq v0, v5, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    return-void

    .line 126
    :cond_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 127
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 122
    :cond_2
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 123
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 118
    :cond_3
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 119
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private ᩳ()I
    .locals 1

    .line 424
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gez v0, :cond_0

    .line 426
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    :cond_0
    return v0
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 492
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 493
    sget v0, Ll/᩹֡᩷;->ܳ:I

    iget-object v6, p0, Ll/ۛ֡ᩳ;->ܰ:Landroid/graphics/Paint;

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 494
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    int-to-float v2, v0

    .line 495
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    add-float v4, v2, v0

    .line 496
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    int-to-float v3, v0

    const/high16 v0, 0x3f800000    # 1.0f

    add-float v5, v3, v0

    move-object v1, p1

    .line 498
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 261
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    invoke-virtual {v0}, Ll/ۧۚᩳ;->᩻()Ll/֫ۚᩳ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 263
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 262
    :cond_0
    iget-object v1, v0, Ll/֫ۚᩳ;->ܿ:Ll/ۨ֡ᩳ;

    .line 193
    iget v0, v0, Ll/֫ۚᩳ;->ᩳ:I

    iget v2, p0, Ll/ۛ֡ᩳ;->ۤ:I

    sub-int/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 269
    iget v3, p0, Ll/ۛ֡ᩳ;->ۛ:I

    iget v4, p0, Ll/ۛ֡ᩳ;->۬:I

    if-ne v3, v4, :cond_1

    if-nez v0, :cond_1

    .line 270
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 273
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v4, :cond_2

    goto :goto_0

    .line 297
    :cond_2
    invoke-direct {p0, p1}, Ll/ۛ֡ᩳ;->֫(Landroid/view/MotionEvent;)V

    .line 298
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iget v1, p0, Ll/ۛ֡ᩳ;->ܳ֫:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 299
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    iget v3, p0, Ll/ۛ֡ᩳ;->᩻֫:F

    sub-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 300
    iget v3, p0, Ll/ۛ֡ᩳ;->ܿ֫:F

    cmpl-float v3, v1, v3

    if-lez v3, :cond_3

    cmpl-float v0, v1, v0

    if-lez v0, :cond_3

    .line 302
    iput-boolean v5, p0, Ll/ۛ֡ᩳ;->᩹:Z

    .line 305
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Ll/ۛ֡ᩳ;->֫֫:F

    return v5

    :cond_3
    :goto_0
    return v2

    .line 276
    :cond_4
    iput-boolean v2, p0, Ll/ۛ֡ᩳ;->᩹:Z

    .line 277
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    iput v3, p0, Ll/ۛ֡ᩳ;->ܳ֫:F

    .line 278
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    iput v3, p0, Ll/ۛ֡ᩳ;->᩻֫:F

    .line 295
    invoke-virtual {v1}, Ll/ۨ֡ᩳ;->֫()V

    .line 280
    iget-object v3, p0, Ll/ۛ֡ᩳ;->ۜ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v3}, Landroid/view/VelocityTracker;->clear()V

    .line 281
    invoke-direct {p0, p1}, Ll/ۛ֡ᩳ;->֫(Landroid/view/MotionEvent;)V

    .line 284
    invoke-direct {p0}, Ll/ۛ֡ᩳ;->ᩳ()I

    move-result p1

    iget v3, p0, Ll/ۛ֡ᩳ;->۬:I

    if-ne p1, v3, :cond_8

    if-nez v0, :cond_5

    goto :goto_2

    .line 271
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    move-result p1

    if-nez p1, :cond_7

    .line 288
    iget p1, p0, Ll/ۛ֡ᩳ;->۬:I

    iget v0, p0, Ll/ۛ֡ᩳ;->ۛ:I

    if-ne p1, v0, :cond_6

    goto :goto_1

    .line 293
    :cond_6
    iput v2, p0, Ll/ۛ֡ᩳ;->᩺:I

    return v2

    .line 290
    :cond_7
    :goto_1
    iput v4, p0, Ll/ۛ֡ᩳ;->᩺:I

    return v2

    .line 287
    :cond_8
    :goto_2
    iput v5, p0, Ll/ۛ֡ᩳ;->᩺:I

    return v2
.end method

.method public final onLayout(ZIIII)V
    .locals 4

    .line 200
    iget-object p1, p0, Ll/ۛ֡ᩳ;->ᩳ֫:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eq v0, v3, :cond_4

    sub-int/2addr p5, p3

    .line 201
    iget p3, p0, Ll/ۛ֡ᩳ;->ۛ:I

    sub-int/2addr p5, p3

    int-to-float p5, p5

    iget v0, p0, Ll/ۛ֡ᩳ;->۬:I

    sub-int/2addr v0, p3

    int-to-float p3, v0

    div-float/2addr p5, p3

    sub-int/2addr p4, p2

    .line 202
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p1, v2, v2, p4, p2}, Landroid/view/View;->layout(IIII)V

    const/high16 p2, 0x3f000000    # 0.5f

    sub-float p2, p5, p2

    const/high16 p3, 0x40000000    # 2.0f

    mul-float p2, p2, p3

    const/4 p3, 0x0

    .line 203
    invoke-static {p3, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    cmpl-float p2, p5, p3

    if-nez p2, :cond_0

    .line 205
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p2

    const/4 p3, 0x4

    if-eq p2, p3, :cond_1

    .line 206
    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 209
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-eqz p2, :cond_1

    .line 210
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p2, p5, p2

    if-nez p2, :cond_3

    const/4 p2, 0x0

    .line 214
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result p3

    if-ge p2, p3, :cond_3

    .line 215
    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p3

    if-eqz p3, :cond_2

    .line 217
    iget-object p3, p3, Lcom/google/android/material/tabs/TabLayout$Tab;->view:Lcom/google/android/material/tabs/TabLayout$TabView;

    const v0, 0x7f0a05a0

    .line 218
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 219
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ܽ֫:Ll/ۢܶۡ;

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 223
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, p5

    float-to-int p1, p1

    .line 224
    iget p2, p0, Ll/ۛ֡ᩳ;->ۤ:I

    add-int/2addr p2, p1

    invoke-virtual {v1, v2, p1, p4, p2}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_4
    sub-int/2addr p4, p2

    .line 227
    iget p1, p0, Ll/ۛ֡ᩳ;->ۤ:I

    invoke-virtual {v1, v2, v2, p4, p1}, Landroid/view/View;->layout(IIII)V

    .line 228
    iget-object p1, p0, Ll/ۛ֡ᩳ;->᩸:Ll/ۤ֨ۘ;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-eq p2, v3, :cond_6

    .line 229
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    sub-int/2addr p4, p2

    .line 230
    div-int/lit8 p4, p4, 0x2

    .line 231
    iget p3, p0, Ll/ۛ֡ᩳ;->ۤ:I

    add-int/2addr p2, p4

    iget p5, p0, Ll/ۛ֡ᩳ;->۬:I

    invoke-virtual {p1, p4, p3, p2, p5}, Landroid/view/View;->layout(IIII)V

    .line 232
    iget-object p2, p0, Ll/ۛ֡ᩳ;->ۗ:[I

    invoke-virtual {p0, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p3, 0x1

    .line 234
    aget p2, p2, p3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p3

    add-int/2addr p3, p2

    sget-object p2, Ll/ۧ᩸ۡ;->ܽ:Landroid/graphics/Point;

    iget p2, p2, Landroid/graphics/Point;->y:I

    if-ne p3, p2, :cond_5

    .line 235
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    if-nez p2, :cond_6

    const/high16 p2, 0x40800000    # 4.0f

    .line 236
    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    .line 237
    invoke-virtual {p1, v2, p2, v2, p2}, Landroid/view/View;->setPadding(IIII)V

    return-void

    .line 240
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    if-eqz p2, :cond_6

    .line 241
    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    :cond_6
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 136
    iget-boolean v0, p0, Ll/ۛ֡ᩳ;->ۙ:Z

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 137
    iput-boolean v2, p0, Ll/ۛ֡ᩳ;->ۙ:Z

    .line 138
    iget v0, p0, Ll/ۛ֡ᩳ;->۟:I

    if-ne v0, p1, :cond_0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    .line 143
    :cond_0
    iput p1, p0, Ll/ۛ֡ᩳ;->۟:I

    .line 146
    iget-object p2, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    invoke-virtual {p2, p1, v2}, Landroid/view/View;->measure(II)V

    .line 148
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ᩳ֫:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_1

    .line 150
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/view/View;->measure(II)V

    goto :goto_0

    .line 151
    :cond_1
    iget-object v0, p0, Ll/ۛ֡ᩳ;->᩸:Ll/ۤ֨ۘ;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eq v1, v4, :cond_2

    .line 153
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    const/high16 v3, -0x80000000

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 158
    :goto_0
    invoke-virtual {p2}, Ll/ۧۚᩳ;->᩻()Ll/֫ۚᩳ;

    move-result-object v1

    .line 160
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_5

    sget v3, Ll/۠ܳܿ;->֫:I

    .line 276
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v5, "tfugh"

    invoke-interface {v3, v5, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    .line 164
    iget p2, v1, Ll/֫ۚᩳ;->ܽ:I

    .line 165
    iget v3, v1, Ll/֫ۚᩳ;->ᩳ:I

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    const/4 v3, 0x0

    goto :goto_2

    .line 161
    :cond_5
    :goto_1
    invoke-virtual {p2}, Ll/ۧۚᩳ;->ۜ()I

    move-result v3

    .line 162
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    move v7, v3

    move v3, p2

    move p2, v7

    :goto_2
    if-eqz v0, :cond_6

    .line 169
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    .line 170
    :goto_3
    iget v5, p0, Ll/ۛ֡ᩳ;->ۨ:I

    mul-int v5, v5, p2

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 171
    iget v6, p0, Ll/ۛ֡ᩳ;->۫:I

    mul-int p2, p2, v6

    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/ۛ֡ᩳ;->ۤ:I

    add-int/2addr p2, v0

    .line 172
    iput p2, p0, Ll/ۛ֡ᩳ;->۬:I

    .line 173
    iput v5, p0, Ll/ۛ֡ᩳ;->ۛ:I

    .line 176
    invoke-static {}, Ll/ۙ֡ᩳ;->ܿ()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 177
    invoke-static {}, Ll/ۙ֡ᩳ;->ᩳ()Z

    move-result p2

    goto :goto_5

    .line 179
    :cond_7
    sget-object p2, Ll/ۛ֡ᩳ;->ۢ֫:Ljava/util/WeakHashMap;

    iget-object v0, p0, Ll/ۛ֡ᩳ;->᩶:Landroid/content/Context;

    invoke-virtual {p2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne p2, v0, :cond_8

    goto :goto_4

    :cond_8
    const/4 v4, 0x0

    :goto_4
    move p2, v4

    .line 181
    :goto_5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    if-eqz p2, :cond_9

    .line 182
    iget p2, p0, Ll/ۛ֡ᩳ;->۬:I

    goto :goto_6

    :cond_9
    iget p2, p0, Ll/ۛ֡ᩳ;->ۛ:I

    .line 181
    :goto_6
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v1, :cond_a

    .line 184
    iget-object p1, v1, Ll/֫ۚᩳ;->ܿ:Ll/ۨ֡ᩳ;

    .line 193
    iget p2, v1, Ll/֫ۚᩳ;->ᩳ:I

    iget v0, p0, Ll/ۛ֡ᩳ;->ۤ:I

    sub-int/2addr p2, v0

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 271
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-le v0, p2, :cond_a

    .line 275
    invoke-virtual {p1, p2}, Landroid/view/View;->setScrollY(I)V

    :cond_a
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 318
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    invoke-virtual {v0}, Ll/ۧۚᩳ;->᩻()Ll/֫ۚᩳ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 319
    :cond_0
    iget-object v2, v0, Ll/֫ۚᩳ;->ܿ:Ll/ۨ֡ᩳ;

    .line 193
    iget v0, v0, Ll/֫ۚᩳ;->ᩳ:I

    iget v3, p0, Ll/ۛ֡ᩳ;->ۤ:I

    sub-int/2addr v0, v3

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 323
    iget-boolean v3, p0, Ll/ۛ֡ᩳ;->᩹:Z

    const/4 v4, 0x1

    if-nez v3, :cond_2

    .line 325
    iget v2, p0, Ll/ۛ֡ᩳ;->ۛ:I

    iget v3, p0, Ll/ۛ֡ᩳ;->۬:I

    if-ne v2, v3, :cond_1

    if-nez v0, :cond_1

    :goto_0
    return v1

    .line 330
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۛ֡ᩳ;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    return v4

    .line 337
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const/4 v5, 0x2

    if-eq v3, v4, :cond_e

    if-eq v3, v5, :cond_3

    const/4 p1, 0x3

    if-eq v3, p1, :cond_e

    return v4

    .line 339
    :cond_3
    invoke-direct {p0, p1}, Ll/ۛ֡ᩳ;->֫(Landroid/view/MotionEvent;)V

    .line 340
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    iget v6, p0, Ll/ۛ֡ᩳ;->֫֫:F

    sub-float/2addr v3, v6

    .line 341
    iget v6, p0, Ll/ۛ֡ᩳ;->᩺:I

    const/4 v7, 0x0

    if-nez v6, :cond_5

    cmpl-float v6, v3, v7

    if-lez v6, :cond_4

    .line 344
    iput v4, p0, Ll/ۛ֡ᩳ;->᩺:I

    goto :goto_1

    :cond_4
    cmpg-float v6, v3, v7

    if-gez v6, :cond_5

    .line 347
    iput v5, p0, Ll/ۛ֡ᩳ;->᩺:I

    .line 350
    :cond_5
    :goto_1
    iget v6, p0, Ll/ۛ֡ᩳ;->᩺:I

    if-ne v6, v4, :cond_8

    .line 352
    invoke-direct {p0}, Ll/ۛ֡ᩳ;->ᩳ()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f99999a    # 1.2f

    mul-float v3, v3, v1

    sub-float/2addr v0, v3

    float-to-int v0, v0

    .line 353
    iget v1, p0, Ll/ۛ֡ᩳ;->۬:I

    if-le v0, v1, :cond_6

    :goto_2
    move v0, v1

    goto :goto_3

    .line 355
    :cond_6
    iget v1, p0, Ll/ۛ֡ᩳ;->ۛ:I

    if-ge v0, v1, :cond_7

    goto :goto_2

    .line 358
    :cond_7
    :goto_3
    invoke-direct {p0, v0}, Ll/ۛ֡ᩳ;->ۧ(I)V

    goto :goto_5

    :cond_8
    if-ne v6, v5, :cond_d

    .line 271
    invoke-virtual {v2}, Landroid/view/View;->getScrollY()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v5, v3

    float-to-int v5, v5

    if-le v5, v0, :cond_9

    move v1, v0

    goto :goto_4

    :cond_9
    if-gez v5, :cond_a

    goto :goto_4

    :cond_a
    move v1, v5

    :goto_4
    invoke-virtual {v2}, Landroid/view/View;->getScrollY()I

    move-result v5

    if-eq v1, v5, :cond_b

    .line 275
    invoke-virtual {v2, v1}, Landroid/view/View;->setScrollY(I)V

    goto :goto_5

    :cond_b
    cmpl-float v5, v3, v7

    if-lez v5, :cond_c

    if-nez v1, :cond_c

    .line 370
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v3, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 283
    invoke-virtual {v2, v3, v0}, Ll/ۨ֡ᩳ;->ۧ(FF)V

    goto :goto_5

    :cond_c
    cmpg-float v5, v3, v7

    if-gez v5, :cond_d

    if-ne v1, v0, :cond_d

    neg-float v0, v3

    .line 372
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v1, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v3, v1

    .line 287
    invoke-virtual {v2, v0, v3}, Ll/ۨ֡ᩳ;->֫(FF)V

    .line 375
    :cond_d
    :goto_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Ll/ۛ֡ᩳ;->֫֫:F

    return v4

    .line 379
    :cond_e
    iput-boolean v1, p0, Ll/ۛ֡ᩳ;->᩹:Z

    .line 279
    invoke-virtual {v2}, Ll/ۨ֡ᩳ;->ܽ()V

    const/16 p1, 0x3e8

    .line 381
    iget-object v1, p0, Ll/ۛ֡ᩳ;->ۜ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 382
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result p1

    .line 383
    iget v1, p0, Ll/ۛ֡ᩳ;->᩺:I

    if-eq v1, v5, :cond_12

    const/high16 v0, -0x3bb80000    # -800.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_f

    .line 385
    invoke-virtual {p0}, Ll/ۛ֡ᩳ;->ܽ()V

    return v4

    :cond_f
    const/high16 v0, 0x44480000    # 800.0f

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_10

    .line 387
    invoke-virtual {p0}, Ll/ۛ֡ᩳ;->֫()V

    return v4

    .line 388
    :cond_10
    invoke-virtual {p0}, Ll/ۛ֡ᩳ;->ۧ()F

    move-result p1

    const v0, 0x3ecccccd    # 0.4f

    cmpl-float p1, p1, v0

    if-lez p1, :cond_11

    .line 389
    invoke-virtual {p0}, Ll/ۛ֡ᩳ;->ܽ()V

    return v4

    .line 391
    :cond_11
    invoke-virtual {p0}, Ll/ۛ֡ᩳ;->֫()V

    return v4

    :cond_12
    neg-float p1, p1

    float-to-int p1, p1

    .line 291
    invoke-virtual {v2, p1, v0}, Ll/ۨ֡ᩳ;->֫(II)V

    return v4
.end method

.method public final ֫()V
    .locals 3

    .line 466
    invoke-direct {p0}, Ll/ۛ֡ᩳ;->ᩳ()I

    move-result v0

    .line 467
    iget v1, p0, Ll/ۛ֡ᩳ;->ۛ:I

    if-eq v0, v1, :cond_0

    .line 468
    filled-new-array {v0, v1}, [I

    move-result-object v0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 469
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/high16 v1, 0x437a0000    # 250.0f

    .line 470
    invoke-virtual {p0}, Ll/ۛ֡ᩳ;->ۧ()F

    move-result v2

    mul-float v2, v2, v1

    float-to-long v1, v2

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 471
    new-instance v1, Ll/۫֡ᩳ;

    invoke-direct {v1, p0}, Ll/۫֡ᩳ;-><init>(Ll/ۛ֡ᩳ;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 472
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 474
    :cond_0
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    invoke-virtual {v0}, Ll/ۧۚᩳ;->᩷()V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 440
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    invoke-virtual {v0, p1}, Ll/֡ܰۧ;->ᩳ(I)V

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 1

    .line 482
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    invoke-virtual {v0, p1}, Ll/ۧۚᩳ;->֫(Ljava/util/ArrayList;)V

    .line 483
    invoke-direct {p0}, Ll/ۛ֡ᩳ;->ܳ()V

    .line 484
    invoke-direct {p0}, Ll/ۛ֡ᩳ;->ܿ()V

    .line 485
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/4 v0, -0x2

    .line 486
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 487
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;Ll/֫ܿܿ;Ll/ۤۤᩳ;Ll/ۤۤᩳ;)V
    .locals 1

    .line 478
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۧۚᩳ;->֫(Ljava/util/ArrayList;Ll/֫ܿܿ;Ll/ۤۤᩳ;Ll/ۤۤᩳ;)V

    return-void
.end method

.method public final ֫(Ll/ۖܰۧ;)V
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    invoke-virtual {v0, p1}, Ll/֡ܰۧ;->֫(Ll/ۖܰۧ;)V

    return-void
.end method

.method public final ۧ()F
    .locals 4

    .line 448
    invoke-direct {p0}, Ll/ۛ֡ᩳ;->ᩳ()I

    move-result v0

    iget v1, p0, Ll/ۛ֡ᩳ;->ۛ:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    .line 449
    iget v2, p0, Ll/ۛ֡ᩳ;->۬:I

    sub-int/2addr v2, v1

    int-to-float v1, v2

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-nez v3, :cond_0

    return v2

    :cond_0
    div-float/2addr v0, v1

    return v0
.end method

.method public final ܽ()V
    .locals 3

    .line 454
    invoke-direct {p0}, Ll/ۛ֡ᩳ;->ᩳ()I

    move-result v0

    .line 455
    iget v1, p0, Ll/ۛ֡ᩳ;->۬:I

    if-eq v0, v1, :cond_0

    .line 456
    filled-new-array {v0, v1}, [I

    move-result-object v0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 457
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 458
    invoke-virtual {p0}, Ll/ۛ֡ᩳ;->ۧ()F

    move-result v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x437a0000    # 250.0f

    mul-float v1, v1, v2

    float-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 459
    new-instance v1, Ll/ۤ֡ᩳ;

    invoke-direct {v1, p0}, Ll/ۤ֡ᩳ;-><init>(Ll/ۛ֡ᩳ;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 460
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 462
    :cond_0
    iget-object v0, p0, Ll/ۛ֡ᩳ;->ۧ֫:Ll/ۧۚᩳ;

    invoke-virtual {v0}, Ll/ۧۚᩳ;->᩷()V

    return-void
.end method
