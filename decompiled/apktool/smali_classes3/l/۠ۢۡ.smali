.class public Ll/۠ۢۡ;
.super Landroid/widget/FrameLayout;
.source "21RX"


# instance fields
.field public ֫֫:Z

.field public ۗ:I

.field public ۙ:I

.field public ۛ:F

.field public ۟:Ll/ۚۢۡ;

.field public ۤ:F

.field public ۧ֫:Ll/֨ۢۡ;

.field public ۨ:Z

.field public ۫:F

.field public ۬:F

.field public final ܰ:Landroid/graphics/PointF;

.field public ܳ֫:Landroid/view/WindowManager;

.field public ܽ֫:Landroid/view/WindowManager$LayoutParams;

.field public ܿ֫:F

.field public ᩳ֫:Landroid/graphics/Point;

.field public ᩶:Ll/֡ۢۡ;

.field public ᩸:Z

.field public ᩹:Ll/᩵ۢۡ;

.field public ᩺:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    iput-object p2, p0, Ll/۠ۢۡ;->ᩳ֫:Landroid/graphics/Point;

    .line 96
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 97
    new-instance p2, Landroid/graphics/PointF;

    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    iput-object p2, p0, Ll/۠ۢۡ;->ܰ:Landroid/graphics/PointF;

    .line 40
    invoke-direct {p0, p1}, Ll/۠ۢۡ;->֫(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    iput-object p2, p0, Ll/۠ۢۡ;->ᩳ֫:Landroid/graphics/Point;

    .line 96
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 97
    new-instance p2, Landroid/graphics/PointF;

    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    iput-object p2, p0, Ll/۠ۢۡ;->ܰ:Landroid/graphics/PointF;

    .line 45
    invoke-direct {p0, p1}, Ll/۠ۢۡ;->֫(Landroid/content/Context;)V

    return-void
.end method

.method public static ֫(FI)I
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    int-to-float p1, p1

    cmpl-float v0, p0, p1

    if-lez v0, :cond_1

    move p0, p1

    :cond_1
    :goto_0
    float-to-int p0, p0

    return p0
.end method

.method private ֫(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x1

    .line 61
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 62
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 63
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    const/4 v3, 0x0

    if-lt v1, v2, :cond_0

    .line 64
    invoke-virtual {p0, v3}, Landroid/widget/FrameLayout;->setForceDarkAllowed(Z)V

    .line 67
    :cond_0
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    .line 68
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v2

    .line 69
    iput v2, p0, Ll/۠ۢۡ;->ܿ֫:F

    .line 71
    iput-boolean v3, p0, Ll/۠ۢۡ;->᩸:Z

    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "window"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Ll/۠ۢۡ;->ܳ֫:Landroid/view/WindowManager;

    .line 73
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    iget-object v2, p0, Ll/۠ۢۡ;->ᩳ֫:Landroid/graphics/Point;

    invoke-virtual {p1, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 75
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object p1, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_1

    const/16 v1, 0x7f6

    .line 77
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    goto :goto_0

    :cond_1
    const/16 v1, 0x7d3

    .line 79
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 81
    :goto_0
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    const v0, 0x800033

    .line 82
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/16 v0, 0x28

    .line 83
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/4 v0, -0x2

    .line 84
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 85
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠ۢۡ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/۠ۢۡ;->֫֫:Z

    return-void
.end method

.method public static synthetic ۧ(Ll/۠ۢۡ;)I
    .locals 0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWindowAttachCount()I

    move-result p0

    return p0
.end method

.method public static synthetic ܽ(Ll/۠ۢۡ;)I
    .locals 0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWindowAttachCount()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final isAttachedToWindow()Z
    .locals 1

    .line 381
    iget-boolean v0, p0, Ll/۠ۢۡ;->᩸:Z

    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 351
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 352
    iput-boolean v0, p0, Ll/۠ۢۡ;->᩸:Z

    .line 354
    iget-object v0, p0, Ll/۠ۢۡ;->ۧ֫:Ll/֨ۢۡ;

    if-eqz v0, :cond_0

    .line 356
    check-cast v0, Ll/֡ۨܿ;

    invoke-virtual {v0}, Ll/֡ۨܿ;->֫()V

    :cond_0
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 272
    iget-object p1, p0, Ll/۠ۢۡ;->ܳ֫:Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    iget-object v0, p0, Ll/۠ۢۡ;->ᩳ֫:Landroid/graphics/Point;

    invoke-virtual {p1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 273
    iget-boolean p1, p0, Ll/۠ۢۡ;->᩸:Z

    if-eqz p1, :cond_2

    .line 274
    iget-object p1, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    if-eqz p1, :cond_2

    .line 275
    iget v1, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    if-lez v1, :cond_0

    .line 276
    iget v1, v0, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 278
    :cond_0
    iget-object p1, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    iget v1, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    if-le p1, v1, :cond_1

    .line 279
    iget-object p1, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 280
    :cond_1
    iget-object p1, p0, Ll/۠ۢۡ;->ܳ֫:Landroid/view/WindowManager;

    iget-object v0, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 362
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 363
    iput-boolean v0, p0, Ll/۠ۢۡ;->᩸:Z

    .line 385
    iget-object v0, p0, Ll/۠ۢۡ;->᩹:Ll/᩵ۢۡ;

    if-eqz v0, :cond_0

    .line 386
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 251
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 103
    iget-boolean v0, p0, Ll/۠ۢۡ;->᩸:Z

    if-nez v0, :cond_0

    .line 104
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 107
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_a

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_7

    goto/16 :goto_0

    .line 128
    :cond_1
    iget-boolean v0, p0, Ll/۠ۢۡ;->֫֫:Z

    if-eqz v0, :cond_2

    goto/16 :goto_0

    .line 130
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    .line 131
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    .line 132
    iget v1, p0, Ll/۠ۢۡ;->۬:F

    sub-float/2addr v1, v0

    .line 133
    iget v3, p0, Ll/۠ۢۡ;->۫:F

    sub-float/2addr v3, p1

    .line 134
    iget-boolean v4, p0, Ll/۠ۢۡ;->᩺:Z

    if-nez v4, :cond_5

    .line 135
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 136
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v5

    mul-float v4, v4, v4

    mul-float v5, v5, v5

    add-float/2addr v5, v4

    .line 137
    iget v4, p0, Ll/۠ۢۡ;->ܿ֫:F

    cmpl-float v4, v5, v4

    if-lez v4, :cond_5

    .line 138
    iput-boolean v2, p0, Ll/۠ۢۡ;->᩺:Z

    .line 139
    iget-boolean v4, p0, Ll/۠ۢۡ;->ۨ:Z

    if-eqz v4, :cond_3

    .line 140
    iput v0, p0, Ll/۠ۢۡ;->۬:F

    .line 141
    iput p1, p0, Ll/۠ۢۡ;->۫:F

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 385
    :cond_3
    iget-object p1, p0, Ll/۠ۢۡ;->᩹:Ll/᩵ۢۡ;

    if-eqz p1, :cond_4

    .line 386
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 146
    :cond_4
    iget-object p1, p0, Ll/۠ۢۡ;->۟:Ll/ۚۢۡ;

    if-eqz p1, :cond_5

    .line 148
    invoke-interface {p1}, Ll/ۚۢۡ;->֫()V

    .line 152
    :cond_5
    iget-boolean p1, p0, Ll/۠ۢۡ;->᩺:Z

    if-eqz p1, :cond_c

    .line 154
    iget-object p1, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    iget v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    int-to-float v0, v0

    iget-object v5, p0, Ll/۠ۢۡ;->ܰ:Landroid/graphics/PointF;

    iput v0, v5, Landroid/graphics/PointF;->x:F

    .line 155
    iget v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    int-to-float v0, v0

    iput v0, v5, Landroid/graphics/PointF;->y:F

    .line 156
    iget v6, p0, Ll/۠ۢۡ;->ۙ:I

    iget v7, p0, Ll/۠ۢۡ;->ۗ:I

    neg-float v8, v1

    neg-float v9, v3

    .line 211
    iget-object v4, p0, Ll/۠ۢۡ;->᩶:Ll/֡ۢۡ;

    if-eqz v4, :cond_6

    .line 213
    invoke-interface/range {v4 .. v9}, Ll/֡ۢۡ;->֫(Landroid/graphics/PointF;IIFF)V

    return v2

    :cond_6
    int-to-float v0, v6

    add-float/2addr v0, v8

    .line 215
    iput v0, v5, Landroid/graphics/PointF;->x:F

    int-to-float v1, v7

    add-float/2addr v1, v9

    .line 216
    iput v1, v5, Landroid/graphics/PointF;->y:F

    .line 157
    iget-object v1, p0, Ll/۠ۢۡ;->ᩳ֫:Landroid/graphics/Point;

    iget v3, v1, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v0, v3}, Ll/۠ۢۡ;->֫(FI)I

    move-result v0

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 158
    iget-object p1, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    iget v0, v5, Landroid/graphics/PointF;->y:F

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ll/۠ۢۡ;->֫(FI)I

    move-result v0

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 159
    iget-object p1, p0, Ll/۠ۢۡ;->ܳ֫:Landroid/view/WindowManager;

    iget-object v0, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return v2

    .line 385
    :cond_7
    iget-object p1, p0, Ll/۠ۢۡ;->᩹:Ll/᩵ۢۡ;

    if-eqz p1, :cond_8

    .line 386
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 170
    :cond_8
    invoke-virtual {p0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 171
    iget-boolean p1, p0, Ll/۠ۢۡ;->᩺:Z

    if-eqz p1, :cond_9

    .line 178
    iput-boolean v1, p0, Ll/۠ۢۡ;->᩺:Z

    return v2

    .line 183
    :cond_9
    iget-boolean p1, p0, Ll/۠ۢۡ;->֫֫:Z

    if-nez p1, :cond_c

    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result p1

    if-eqz p1, :cond_c

    if-ne v0, v2, :cond_c

    .line 184
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    return v2

    .line 110
    :cond_a
    invoke-virtual {p0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 111
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Ll/۠ۢۡ;->ۤ:F

    .line 112
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Ll/۠ۢۡ;->ۛ:F

    .line 113
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Ll/۠ۢۡ;->۬:F

    .line 114
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Ll/۠ۢۡ;->۫:F

    .line 115
    iput-boolean v1, p0, Ll/۠ۢۡ;->᩺:Z

    .line 116
    iget-object p1, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    iget v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v0, p0, Ll/۠ۢۡ;->ۙ:I

    .line 117
    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    iput p1, p0, Ll/۠ۢۡ;->ۗ:I

    .line 118
    iput-boolean v1, p0, Ll/۠ۢۡ;->֫֫:Z

    .line 119
    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    move-result p1

    if-eqz p1, :cond_c

    .line 120
    iget-object p1, p0, Ll/۠ۢۡ;->᩹:Ll/᩵ۢۡ;

    if-nez p1, :cond_b

    .line 121
    new-instance p1, Ll/᩵ۢۡ;

    invoke-direct {p1, p0}, Ll/᩵ۢۡ;-><init>(Ll/۠ۢۡ;)V

    iput-object p1, p0, Ll/۠ۢۡ;->᩹:Ll/᩵ۢۡ;

    .line 122
    :cond_b
    iget-object p1, p0, Ll/۠ۢۡ;->᩹:Ll/᩵ۢۡ;

    invoke-virtual {p1}, Ll/᩵ۢۡ;->֫()V

    .line 123
    iget-object p1, p0, Ll/۠ۢۡ;->᩹:Ll/᩵ۢۡ;

    invoke-virtual {p1}, Ll/᩵ۢۡ;->ۧ()V

    .line 124
    iget-object p1, p0, Ll/۠ۢۡ;->᩹:Ll/᩵ۢۡ;

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_c
    :goto_0
    return v2
.end method

.method public final ֫()V
    .locals 5

    .line 319
    iget-boolean v0, p0, Ll/۠ۢۡ;->᩸:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/ۢ֨ۢ;->֫(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 381
    :cond_0
    iget-boolean v0, p0, Ll/۠ۢۡ;->᩸:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 323
    :cond_1
    iget-object v0, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Ll/۠ۢۡ;->ᩳ֫:Landroid/graphics/Point;

    iget v3, v2, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v1, v3}, Ll/۠ۢۡ;->֫(FI)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 324
    iget-object v0, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    int-to-float v1, v1

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ll/۠ۢۡ;->֫(FI)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 325
    iget-object v0, p0, Ll/۠ۢۡ;->ܳ֫:Landroid/view/WindowManager;

    iget-object v1, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(II)V
    .locals 2

    .line 337
    iget-object v0, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    if-ne v1, p1, :cond_0

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    if-eq v1, p2, :cond_1

    .line 338
    :cond_0
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 339
    iput p2, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 381
    iget-boolean p1, p0, Ll/۠ۢۡ;->᩸:Z

    if-eqz p1, :cond_1

    .line 341
    iget-object p1, p0, Ll/۠ۢۡ;->ܳ֫:Landroid/view/WindowManager;

    invoke-interface {p1, p0, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/֡ۢۡ;)V
    .locals 0

    .line 221
    iput-object p1, p0, Ll/۠ۢۡ;->᩶:Ll/֡ۢۡ;

    return-void
.end method

.method public final ֫(Ll/֡ۨܿ;)V
    .locals 0

    .line 372
    iput-object p1, p0, Ll/۠ۢۡ;->ۧ֫:Ll/֨ۢۡ;

    return-void
.end method

.method public final ֫(Ll/ۚۢۡ;)V
    .locals 0

    .line 231
    iput-object p1, p0, Ll/۠ۢۡ;->۟:Ll/ۚۢۡ;

    return-void
.end method

.method public final ֫([I)V
    .locals 3

    .line 204
    iget-object v0, p0, Ll/۠ۢۡ;->ܽ֫:Landroid/view/WindowManager$LayoutParams;

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    const/4 v2, 0x0

    aput v1, p1, v2

    const/4 v1, 0x1

    .line 205
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    aput v0, p1, v1

    return-void
.end method

.method public final ۧ()F
    .locals 1

    .line 196
    iget v0, p0, Ll/۠ۢۡ;->ۤ:F

    return v0
.end method

.method public final ܽ()F
    .locals 1

    .line 200
    iget v0, p0, Ll/۠ۢۡ;->ۛ:F

    return v0
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 192
    iput-boolean v0, p0, Ll/۠ۢۡ;->ۨ:Z

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 329
    iget-boolean v0, p0, Ll/۠ۢۡ;->᩸:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 333
    :cond_1
    iget-object v0, p0, Ll/۠ۢۡ;->ܳ֫:Landroid/view/WindowManager;

    invoke-interface {v0, p0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    return-void
.end method
