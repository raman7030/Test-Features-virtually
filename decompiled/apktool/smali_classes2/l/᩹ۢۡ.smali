.class public Ll/᩹ۢۡ;
.super Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
.source "I5VL"


# instance fields
.field public ֫֫:F

.field public ۗ:Landroid/animation/ValueAnimator;

.field public ۙ:Z

.field public ۛ:Landroid/view/WindowManager$LayoutParams;

.field public ۜ֫:F

.field public ۟:Z

.field public ۡ֫:Landroid/view/WindowManager;

.field public ۢ֫:Landroid/view/VelocityTracker;

.field public ۤ:I

.field public final ۧ֫:Ljava/lang/String;

.field public ۨ:I

.field public ۫:Ll/֨ۚۢ;

.field public ۬:Z

.field public ܰ:Landroid/graphics/Point;

.field public ܳ֫:Z

.field public ܽ֫:F

.field public ܿ֫:Z

.field public final ᩳ֫:Ljava/lang/String;

.field public ᩶:F

.field public ᩷֫:F

.field public ᩸:Z

.field public ᩹:F

.field public ᩺:I

.field public ᩻֫:Landroid/animation/AnimatorSet;


# direct methods
.method public constructor <init>(Landroid/app/Service;Ljava/lang/String;)V
    .locals 4

    .line 66
    invoke-direct {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;-><init>(Landroid/content/Context;)V

    .line 33
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Ll/᩹ۢۡ;->ܰ:Landroid/graphics/Point;

    .line 47
    new-instance v1, Ll/֨ۚۢ;

    new-instance v2, Ll/᩺᩵ܿ;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Ll/᩺᩵ܿ;-><init>(I)V

    invoke-direct {v1, p0, v2}, Ll/֨ۚۢ;-><init>(Ljava/lang/Object;Ll/ۚۚۢ;)V

    iput-object v1, p0, Ll/᩹ۢۡ;->۫:Ll/֨ۚۢ;

    .line 262
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v1

    iput-object v1, p0, Ll/᩹ۢۡ;->ۢ֫:Landroid/view/VelocityTracker;

    const-string v1, "fbpx:"

    .line 67
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/᩹ۢۡ;->ۧ֫:Ljava/lang/String;

    const-string v1, "fbpy:"

    .line 68
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/᩹ۢۡ;->ᩳ֫:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v1, "window"

    invoke-virtual {p2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Ll/᩹ۢۡ;->ۡ֫:Landroid/view/WindowManager;

    .line 70
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 72
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, p2

    .line 74
    iput p2, p0, Ll/᩹ۢۡ;->᩷֫:F

    .line 75
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p2

    iput p2, p0, Ll/᩹ۢۡ;->ۤ:I

    .line 76
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    mul-int/lit8 p1, p1, 0x8

    int-to-float p1, p1

    iput p1, p0, Ll/᩹ۢۡ;->ۜ֫:F

    const/4 p1, 0x0

    .line 79
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setCompatElevation(F)V

    const p1, 0x3f59999a    # 0.85f

    .line 80
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    const/4 p1, 0x1

    .line 81
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setSize(I)V

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

.method public static ֫(Landroid/app/Service;Ljava/lang/String;)Ll/᩹ۢۡ;
    .locals 1

    .line 93
    new-instance v0, Ll/᩹ۢۡ;

    invoke-direct {v0, p0, p1}, Ll/᩹ۢۡ;-><init>(Landroid/app/Service;Ljava/lang/String;)V

    return-object v0
.end method

.method private ֫(II)V
    .locals 4

    .line 136
    iget-object v0, p0, Ll/᩹ۢۡ;->ܰ:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    sub-int/2addr v1, p1

    const/4 p1, 0x0

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 137
    iget v2, v0, Landroid/graphics/Point;->y:I

    sub-int/2addr v2, p2

    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 138
    iget-object p2, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v2, p0, Ll/᩹ۢۡ;->֫֫:F

    int-to-float v3, v1

    mul-float v2, v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v2, v1}, Ll/᩹ۢۡ;->֫(FI)I

    move-result v1

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 139
    iget-object p2, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Ll/᩹ۢۡ;->ܽ֫:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v0, v0, Landroid/graphics/Point;->y:I

    div-int/lit8 v0, v0, 0x3

    goto :goto_0

    .line 140
    :cond_0
    iget v0, p0, Ll/᩹ۢۡ;->ܽ֫:F

    int-to-float v1, p1

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_0
    int-to-float v0, v0

    .line 139
    invoke-static {v0, p1}, Ll/᩹ۢۡ;->֫(FI)I

    move-result p1

    iput p1, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    return-void
.end method

.method public static synthetic ֫(Ll/᩹ۢۡ;)V
    .locals 6

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 50
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40a00000    # 5.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    mul-float v0, v0, v1

    .line 51
    iget-object v1, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    if-nez v1, :cond_1

    neg-float v0, v0

    :cond_1
    const/4 v1, 0x2

    new-array v2, v1, [F

    .line 54
    fill-array-data v2, :array_0

    const-string v3, "alpha"

    invoke-static {p0, v3, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    new-array v3, v1, [F

    const/4 v4, 0x0

    const/4 v5, 0x0

    aput v4, v3, v5

    const/4 v4, 0x1

    aput v0, v3, v4

    const-string v0, "translationX"

    .line 55
    invoke-static {p0, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 57
    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v1, v1, [Landroid/animation/Animator;

    aput-object v2, v1, v5

    aput-object v0, v1, v4

    .line 58
    invoke-virtual {v3, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 v0, 0x12c

    .line 59
    invoke-virtual {v3, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 60
    iput-object v3, p0, Ll/᩹ۢۡ;->᩻֫:Landroid/animation/AnimatorSet;

    .line 61
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->start()V

    .line 62
    iput-boolean v4, p0, Ll/᩹ۢۡ;->ܳ֫:Z

    return-void

    :array_0
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3eb33333    # 0.35f
    .end array-data
.end method

.method public static synthetic ֫(Ll/᩹ۢۡ;[JLl/᩸ۢۡ;IILandroid/animation/ValueAnimator;)V
    .locals 5

    .line 362
    invoke-virtual {p5}, Landroid/animation/ValueAnimator;->getCurrentPlayTime()J

    move-result-wide v0

    const/4 v2, 0x0

    .line 363
    aget-wide v3, p1, v2

    sub-long v3, v0, v3

    long-to-float v3, v3

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    .line 364
    aput-wide v0, p1, v2

    const/4 p1, 0x0

    cmpg-float v4, v3, p1

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    cmpl-float v4, v3, p1

    if-lez v4, :cond_1

    if-nez v2, :cond_1

    const v2, 0x3d03126f    # 0.032f

    .line 370
    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 371
    invoke-virtual {p2, p3, v2, p4}, Ll/᩸ۢۡ;->֫(IFI)Z

    move-result v4

    sub-float/2addr v3, v2

    move v2, v4

    goto :goto_0

    :cond_1
    const-wide/16 v3, 0x3e8

    const/4 p1, 0x1

    cmp-long p4, v0, v3

    if-ltz p4, :cond_2

    if-nez v2, :cond_2

    .line 375
    invoke-virtual {p2, p3}, Ll/᩸ۢۡ;->֫(I)V

    const/4 v2, 0x1

    .line 378
    :cond_2
    iget-object p3, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget p4, p2, Ll/᩸ۢۡ;->ܿ:F

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    iput p4, p3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 379
    iget-object p3, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget p2, p2, Ll/᩸ۢۡ;->ܳ:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iput p2, p3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 380
    iput-boolean p1, p0, Ll/᩹ۢۡ;->۟:Z

    .line 381
    iget-boolean p1, p0, Ll/᩹ۢۡ;->᩸:Z

    if-eqz p1, :cond_3

    .line 382
    iget-object p1, p0, Ll/᩹ۢۡ;->ۡ֫:Landroid/view/WindowManager;

    iget-object p2, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, p2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    if-eqz v2, :cond_4

    const/4 p1, 0x0

    .line 385
    iput-object p1, p0, Ll/᩹ۢۡ;->ۗ:Landroid/animation/ValueAnimator;

    .line 386
    invoke-virtual {p5}, Landroid/animation/ValueAnimator;->cancel()V

    .line 387
    invoke-direct {p0}, Ll/᩹ۢۡ;->ܿ()V

    .line 388
    invoke-direct {p0}, Ll/᩹ۢۡ;->ܳ()V

    :cond_4
    :goto_1
    return-void
.end method

.method private ܳ()V
    .locals 5

    .line 200
    iget-object v0, p0, Ll/᩹ۢۡ;->᩻֫:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 201
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    const/4 v0, 0x0

    .line 202
    iput-object v0, p0, Ll/᩹ۢۡ;->᩻֫:Landroid/animation/AnimatorSet;

    .line 185
    :cond_0
    iget-boolean v0, p0, Ll/᩹ۢۡ;->ܳ֫:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    .line 186
    :cond_1
    iput-boolean v2, p0, Ll/᩹ۢۡ;->ܳ֫:Z

    const v0, 0x3f4ccccd    # 0.8f

    .line 187
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 188
    invoke-virtual {p0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationX(F)V

    .line 190
    :cond_2
    iget-object v0, p0, Ll/᩹ۢۡ;->۫:Ll/֨ۚۢ;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 191
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "floating_button_stick_to_edge"

    const/4 v4, 0x1

    invoke-interface {v1, v3, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const-wide/16 v3, 0xbb8

    .line 192
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_3
    return-void
.end method

.method private ܿ()V
    .locals 5

    .line 147
    iget-boolean v0, p0, Ll/᩹ۢۡ;->۟:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    if-nez v0, :cond_0

    goto :goto_2

    .line 149
    :cond_0
    iget-object v0, p0, Ll/᩹ۢۡ;->ܰ:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 150
    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v3, 0x0

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    .line 151
    :cond_1
    iget-object v4, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v4, v4, Landroid/view/WindowManager$LayoutParams;->x:I

    int-to-float v4, v4

    invoke-static {v4, v1}, Ll/᩹ۢۡ;->֫(FI)I

    move-result v4

    int-to-float v4, v4

    int-to-float v1, v1

    div-float v1, v4, v1

    :goto_0
    iput v1, p0, Ll/᩹ۢۡ;->֫֫:F

    if-nez v0, :cond_2

    goto :goto_1

    .line 152
    :cond_2
    iget-object v1, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    int-to-float v1, v1

    invoke-static {v1, v0}, Ll/᩹ۢۡ;->֫(FI)I

    move-result v1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float v3, v1, v0

    :goto_1
    iput v3, p0, Ll/᩹ۢۡ;->ܽ֫:F

    .line 153
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/᩹ۢۡ;->ۧ֫:Ljava/lang/String;

    iget v3, p0, Ll/᩹ۢۡ;->֫֫:F

    .line 154
    invoke-interface {v0, v1, v3}, Ll/۬ۤۡ;->putFloat(Ljava/lang/String;F)Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/᩹ۢۡ;->ᩳ֫:Ljava/lang/String;

    iget v3, p0, Ll/᩹ۢۡ;->ܽ֫:F

    .line 155
    invoke-interface {v0, v1, v3}, Ll/۬ۤۡ;->putFloat(Ljava/lang/String;F)Ll/۬ۤۡ;

    move-result-object v0

    .line 156
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 157
    iput-boolean v2, p0, Ll/᩹ۢۡ;->۟:Z

    :cond_3
    :goto_2
    return-void
.end method

.method private ᩳ()V
    .locals 1

    .line 210
    iget-object v0, p0, Ll/᩹ۢۡ;->ۗ:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 211
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 212
    iput-object v0, p0, Ll/᩹ۢۡ;->ۗ:Landroid/animation/ValueAnimator;

    .line 214
    :cond_0
    invoke-direct {p0}, Ll/᩹ۢۡ;->ܿ()V

    return-void
.end method


# virtual methods
.method public final hide()V
    .locals 2

    const/16 v0, 0x8

    .line 169
    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 170
    iget-object v0, p0, Ll/᩹ۢۡ;->۫:Ll/֨ۚۢ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 171
    invoke-direct {p0}, Ll/᩹ۢۡ;->ᩳ()V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 231
    invoke-super {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 232
    iput-boolean v0, p0, Ll/᩹ۢۡ;->᩸:Z

    .line 233
    iput-boolean v0, p0, Ll/᩹ۢۡ;->۬:Z

    .line 234
    invoke-direct {p0}, Ll/᩹ۢۡ;->ܳ()V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 248
    invoke-direct {p0}, Ll/᩹ۢۡ;->ᩳ()V

    .line 249
    iget-object p1, p0, Ll/᩹ۢۡ;->ۡ֫:Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Ll/᩹ۢۡ;->ܰ:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 250
    iget-boolean v0, p0, Ll/᩹ۢۡ;->᩸:Z

    if-eqz v0, :cond_0

    .line 251
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Ll/᩹ۢۡ;->֫(II)V

    .line 252
    iget-object v0, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 239
    invoke-super {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 240
    iput-boolean v0, p0, Ll/᩹ۢۡ;->᩸:Z

    .line 241
    iget-object v1, p0, Ll/᩹ۢۡ;->۫:Ll/֨ۚۢ;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 200
    iget-object v0, p0, Ll/᩹ۢۡ;->᩻֫:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 201
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    const/4 v0, 0x0

    .line 202
    iput-object v0, p0, Ll/᩹ۢۡ;->᩻֫:Landroid/animation/AnimatorSet;

    .line 243
    :cond_0
    invoke-direct {p0}, Ll/᩹ۢۡ;->ᩳ()V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 222
    iget-boolean p1, p0, Ll/᩹ۢۡ;->۬:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 223
    iput-boolean p1, p0, Ll/᩹ۢۡ;->۬:Z

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 224
    invoke-direct {p0, p4, p5}, Ll/᩹ۢۡ;->֫(II)V

    .line 225
    iget-object p1, p0, Ll/᩹ۢۡ;->ۡ֫:Landroid/view/WindowManager;

    iget-object p2, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, p2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    .line 272
    iget-boolean v0, p0, Ll/᩹ۢۡ;->᩸:Z

    if-nez v0, :cond_0

    .line 273
    invoke-super {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 274
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 275
    iget-object v1, p0, Ll/᩹ۢۡ;->ۢ֫:Landroid/view/VelocityTracker;

    if-nez v0, :cond_1

    .line 276
    invoke-direct {p0}, Ll/᩹ۢۡ;->ᩳ()V

    .line 277
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    .line 337
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-float/2addr v2, v3

    .line 338
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    sub-float/2addr v3, v4

    .line 339
    invoke-virtual {p1, v2, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 341
    :try_start_0
    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    neg-float v2, v2

    neg-float v3, v3

    .line 344
    invoke-virtual {p1, v2, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_8

    const/4 v4, 0x2

    .line 280
    iget-object v5, p0, Ll/᩹ۢۡ;->ܰ:Landroid/graphics/Point;

    if-eq v0, v3, :cond_4

    if-eq v0, v4, :cond_2

    const/4 p1, 0x3

    if-eq v0, p1, :cond_4

    goto/16 :goto_0

    .line 293
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    .line 294
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    .line 295
    iget v1, p0, Ll/᩹ۢۡ;->᩹:F

    sub-float/2addr v1, v0

    .line 296
    iget v0, p0, Ll/᩹ۢۡ;->᩶:F

    sub-float/2addr v0, p1

    .line 297
    iget-boolean p1, p0, Ll/᩹ۢۡ;->ۙ:Z

    if-nez p1, :cond_3

    .line 298
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 299
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v4

    mul-float p1, p1, p1

    mul-float v4, v4, v4

    add-float/2addr v4, p1

    .line 300
    iget p1, p0, Ll/᩹ۢۡ;->᩷֫:F

    cmpl-float p1, v4, p1

    if-lez p1, :cond_3

    .line 301
    invoke-virtual {p0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 302
    iput-boolean v3, p0, Ll/᩹ۢۡ;->ۙ:Z

    .line 305
    :cond_3
    iget-boolean p1, p0, Ll/᩹ۢۡ;->ۙ:Z

    if-eqz p1, :cond_7

    .line 306
    invoke-direct {p0}, Ll/᩹ۢۡ;->ܳ()V

    .line 307
    iget-object p1, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v2, p0, Ll/᩹ۢۡ;->ۨ:I

    int-to-float v2, v2

    sub-float/2addr v2, v1

    iget v1, v5, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int/2addr v1, v4

    invoke-static {v2, v1}, Ll/᩹ۢۡ;->֫(FI)I

    move-result v1

    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 308
    iget-object p1, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Ll/᩹ۢۡ;->᩺:I

    int-to-float v1, v1

    sub-float/2addr v1, v0

    iget v0, v5, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v1, v0}, Ll/᩹ۢۡ;->֫(FI)I

    move-result v0

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 309
    iput-boolean v3, p0, Ll/᩹ۢۡ;->۟:Z

    .line 310
    iget-object p1, p0, Ll/᩹ۢۡ;->ۡ֫:Landroid/view/WindowManager;

    iget-object v0, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return v3

    .line 315
    :cond_4
    iget-boolean p1, p0, Ll/᩹ۢۡ;->ܿ֫:Z

    .line 316
    iput-boolean v2, p0, Ll/᩹ۢۡ;->ܿ֫:Z

    .line 317
    invoke-direct {p0}, Ll/᩹ۢۡ;->ܳ()V

    .line 318
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 319
    invoke-virtual {p0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 320
    :cond_5
    iget-boolean v6, p0, Ll/᩹ۢۡ;->ۙ:Z

    if-eqz v6, :cond_6

    const/16 p1, 0x3e8

    .line 321
    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 322
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    .line 323
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    .line 352
    invoke-direct {p0}, Ll/᩹ۢۡ;->ᩳ()V

    .line 353
    iget v1, v5, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    sub-int/2addr v1, v6

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 354
    iget v5, v5, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 355
    iget v6, p0, Ll/᩹ۢۡ;->ۤ:I

    neg-int v7, v6

    int-to-float v7, v7

    int-to-float v6, v6

    invoke-static {p1, v6}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v7, p1}, Ljava/lang/Math;->max(FF)F

    move-result v9

    .line 356
    invoke-static {v0, v6}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v7, p1}, Ljava/lang/Math;->max(FF)F

    move-result v10

    .line 357
    new-instance p1, Ll/᩸ۢۡ;

    iget-object v0, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    int-to-float v0, v0

    invoke-static {v0, v1}, Ll/᩹ۢۡ;->֫(FI)I

    move-result v0

    int-to-float v7, v0

    iget-object v0, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    int-to-float v0, v0

    invoke-static {v0, v5}, Ll/᩹ۢۡ;->֫(FI)I

    move-result v0

    int-to-float v8, v0

    iget v12, p0, Ll/᩹ۢۡ;->ۜ֫:F

    move-object v6, p1

    move v11, v1

    invoke-direct/range {v6 .. v12}, Ll/᩸ۢۡ;-><init>(FFFFIF)V

    new-array v8, v3, [J

    const-wide/16 v6, 0x0

    aput-wide v6, v8, v2

    new-array v0, v4, [F

    .line 360
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 361
    new-instance v2, Ll/ܶۢۡ;

    move-object v6, v2

    move-object v7, p0

    move-object v9, p1

    move v10, v1

    move v11, v5

    invoke-direct/range {v6 .. v11}, Ll/ܶۢۡ;-><init>(Ll/᩹ۢۡ;[JLl/᩸ۢۡ;II)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v1, 0x3e8

    .line 391
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 392
    iput-object v0, p0, Ll/᩹ۢۡ;->ۗ:Landroid/animation/ValueAnimator;

    .line 393
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return v3

    :cond_6
    if-ne v0, v3, :cond_7

    if-nez p1, :cond_7

    .line 326
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    :cond_7
    :goto_0
    return v3

    .line 283
    :cond_8
    iget-boolean v0, p0, Ll/᩹ۢۡ;->ܳ֫:Z

    if-nez v0, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_9

    goto :goto_1

    :cond_9
    const/4 v0, 0x0

    goto :goto_2

    :cond_a
    :goto_1
    const/4 v0, 0x1

    :goto_2
    iput-boolean v0, p0, Ll/᩹ۢۡ;->ܿ֫:Z

    xor-int/2addr v0, v3

    .line 285
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 286
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Ll/᩹ۢۡ;->᩹:F

    .line 287
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Ll/᩹ۢۡ;->᩶:F

    .line 288
    iput-boolean v2, p0, Ll/᩹ۢۡ;->ۙ:Z

    .line 289
    iget-object p1, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    iget v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v0, p0, Ll/᩹ۢۡ;->ۨ:I

    .line 290
    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    iput p1, p0, Ll/᩹ۢۡ;->᩺:I

    return v3

    :catchall_0
    move-exception v0

    neg-float v1, v2

    neg-float v2, v3

    .line 344
    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 345
    throw v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final show()V
    .locals 4

    const/4 v0, 0x0

    .line 176
    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 177
    invoke-direct {p0}, Ll/᩹ۢۡ;->ܳ()V

    .line 178
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v1

    const/4 v2, 0x0

    .line 179
    invoke-virtual {p0, v2}, Landroid/view/View;->setAlpha(F)V

    const/4 v3, 0x2

    new-array v3, v3, [F

    aput v2, v3, v0

    const/4 v0, 0x1

    aput v1, v3, v0

    const-string v0, "alpha"

    .line 180
    invoke-static {p0, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 109
    iget-object v0, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    if-nez v0, :cond_1

    .line 110
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    .line 111
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    const/16 v1, 0x7f6

    .line 112
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    goto :goto_0

    :cond_0
    const/16 v1, 0x7d3

    .line 114
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    :goto_0
    const/4 v1, 0x1

    .line 116
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    const v1, 0x800033

    .line 117
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/16 v1, 0x28

    .line 118
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/4 v1, -0x2

    .line 119
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 120
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 123
    :cond_1
    iget-object v0, p0, Ll/᩹ۢۡ;->ܰ:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    const/high16 v2, -0x80000000

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 124
    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 125
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->measure(II)V

    .line 126
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    iget-object v1, p0, Ll/᩹ۢۡ;->ۧ֫:Ljava/lang/String;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Ll/᩹ۢۡ;->֫֫:F

    .line 127
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    iget-object v1, p0, Ll/᩹ۢۡ;->ᩳ֫:Ljava/lang/String;

    const/high16 v2, 0x7fc00000    # Float.NaN

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Ll/᩹ۢۡ;->ܽ֫:F

    .line 128
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Ll/᩹ۢۡ;->֫(II)V

    .line 129
    iget-object v0, p0, Ll/᩹ۢۡ;->ۡ֫:Landroid/view/WindowManager;

    iget-object v1, p0, Ll/᩹ۢۡ;->ۛ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Ll/᩹ۢۡ;->᩸:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Ll/᩹ۢۡ;->ۡ֫:Landroid/view/WindowManager;

    invoke-interface {v0, p0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method
