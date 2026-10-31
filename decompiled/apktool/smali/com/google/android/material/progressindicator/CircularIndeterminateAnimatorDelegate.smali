.class public final Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;
.super Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;
.source "CircularIndeterminateAnimatorDelegate.java"


# static fields
.field public static final ANIMATION_FRACTION:Landroid/util/Property;

.field public static final COMPLETE_END_FRACTION:Landroid/util/Property;

.field public static final CONSTANT_ROTATION_DEGREES:I = 0x5f0

.field public static final DELAY_TO_COLLAPSE_IN_MS:[I

.field public static final DELAY_TO_EXPAND_IN_MS:[I

.field public static final DELAY_TO_FADE_IN_MS:[I

.field public static final DURATION_TO_COLLAPSE_IN_MS:I = 0x29b

.field public static final DURATION_TO_COMPLETE_END_IN_MS:I = 0x14d

.field public static final DURATION_TO_EXPAND_IN_MS:I = 0x29b

.field public static final DURATION_TO_FADE_IN_MS:I = 0x14d

.field public static final EXTRA_DEGREES_PER_CYCLE:I = 0xfa

.field public static final TAIL_DEGREES_OFFSET:I = -0x14

.field public static final TOTAL_CYCLES:I = 0x4

.field public static final TOTAL_DURATION_IN_MS:I = 0x1518


# instance fields
.field public animationFraction:F

.field public animator:Landroid/animation/ObjectAnimator;

.field public animatorCompleteCallback:Ll/ᩳ᩺ۧ;

.field public final baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

.field public completeEndAnimator:Landroid/animation/ObjectAnimator;

.field public completeEndFraction:F

.field public indicatorColorIndexOffset:I

.field public final interpolator:Ll/ۡۢ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xa8c

    const/16 v1, 0xfd2

    const/4 v2, 0x0

    const/16 v3, 0x546

    .line 44
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->DELAY_TO_EXPAND_IN_MS:[I

    const/16 v0, 0xd27

    const/16 v1, 0x126d

    const/16 v2, 0x29b

    const/16 v3, 0x7e1

    .line 45
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->DELAY_TO_COLLAPSE_IN_MS:[I

    const/16 v0, 0xe74

    const/16 v1, 0x13ba

    const/16 v2, 0x3e8

    const/16 v3, 0x92e

    .line 46
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->DELAY_TO_FADE_IN_MS:[I

    .line 240
    new-instance v0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate$3;

    const-string v1, "animationFraction"

    const-class v2, Ljava/lang/Float;

    invoke-direct {v0, v2, v1}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate$3;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->ANIMATION_FRACTION:Landroid/util/Property;

    .line 254
    new-instance v0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate$4;

    const-string v1, "completeEndFraction"

    invoke-direct {v0, v2, v1}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate$4;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->COMPLETE_END_FRACTION:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;)V
    .locals 1

    const/4 v0, 0x1

    .line 67
    invoke-direct {p0, v0}, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;-><init>(I)V

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->indicatorColorIndexOffset:I

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animatorCompleteCallback:Ll/ᩳ᩺ۧ;

    .line 69
    iput-object p1, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 71
    new-instance p1, Ll/ۡۢ֫;

    invoke-direct {p1}, Ll/ۡۢ֫;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->interpolator:Ll/ۡۢ֫;

    return-void
.end method

.method public static synthetic access$000(Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;)I
    .locals 0

    .line 34
    iget p0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->indicatorColorIndexOffset:I

    return p0
.end method

.method public static synthetic access$002(Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;I)I
    .locals 0

    .line 34
    iput p1, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->indicatorColorIndexOffset:I

    return p1
.end method

.method public static synthetic access$100(Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;)Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    return-object p0
.end method

.method public static synthetic access$200(Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;)F
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->getAnimationFraction()F

    move-result p0

    return p0
.end method

.method public static synthetic access$300(Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;)F
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->getCompleteEndFraction()F

    move-result p0

    return p0
.end method

.method public static synthetic access$400(Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;F)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->setCompleteEndFraction(F)V

    return-void
.end method

.method private getAnimationFraction()F
    .locals 1

    .line 217
    iget v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animationFraction:F

    return v0
.end method

.method private getCompleteEndFraction()F
    .locals 1

    .line 231
    iget v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndFraction:F

    return v0
.end method

.method private maybeInitializeAnimators()V
    .locals 4

    .line 85
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 87
    sget-object v0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->ANIMATION_FRACTION:Landroid/util/Property;

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    invoke-static {p0, v0, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    const-wide/16 v2, 0x1518

    .line 88
    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 89
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 90
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 91
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    new-instance v2, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate$1;

    invoke-direct {v2, p0}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate$1;-><init>(Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;)V

    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_1

    .line 103
    sget-object v0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->COMPLETE_END_FRACTION:Landroid/util/Property;

    new-array v1, v1, [F

    fill-array-data v1, :array_1

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x14d

    .line 104
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 105
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    iget-object v1, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->interpolator:Ll/ۡۢ֫;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 106
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    new-instance v1, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate$2;

    invoke-direct {v1, p0}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate$2;-><init>(Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_1
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private maybeUpdateSegmentColors(I)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 190
    sget-object v2, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->DELAY_TO_FADE_IN_MS:[I

    aget v2, v2, v1

    const/16 v3, 0x14d

    .line 191
    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->getFractionInRange(III)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_0

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v3, v2, v3

    if-gtz v3, :cond_0

    .line 193
    iget p1, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->indicatorColorIndexOffset:I

    add-int/2addr v1, p1

    iget-object p1, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    iget-object p1, p1, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorColors:[I

    array-length v3, p1

    rem-int/2addr v1, v3

    add-int/lit8 v3, v1, 0x1

    .line 195
    array-length v4, p1

    rem-int/2addr v3, v4

    .line 196
    aget v1, p1, v1

    .line 197
    aget p1, p1, v3

    .line 198
    iget-object v3, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->interpolator:Ll/ۡۢ֫;

    invoke-virtual {v3, v2}, Ll/ۖۢ֫;->getInterpolation(F)F

    move-result v2

    .line 199
    iget-object v3, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 200
    invoke-static {}, Lcom/google/android/material/animation/ArgbEvaluatorCompat;->getInstance()Lcom/google/android/material/animation/ArgbEvaluatorCompat;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, v2, v1, p1}, Lcom/google/android/material/animation/ArgbEvaluatorCompat;->evaluate(FLjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private setCompleteEndFraction(F)V
    .locals 0

    .line 235
    iput p1, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndFraction:F

    return-void
.end method

.method private updateSegmentPositions(I)V
    .locals 6

    .line 160
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 162
    iget v2, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animationFraction:F

    const/high16 v3, 0x44be0000    # 1520.0f

    mul-float v4, v2, v3

    const/high16 v5, -0x3e600000    # -20.0f

    add-float/2addr v4, v5

    iput v4, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    mul-float v2, v2, v3

    .line 164
    iput v2, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    .line 168
    sget-object v2, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->DELAY_TO_EXPAND_IN_MS:[I

    aget v2, v2, v1

    const/16 v3, 0x29b

    .line 169
    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->getFractionInRange(III)F

    move-result v2

    .line 170
    iget v4, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    iget-object v5, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->interpolator:Ll/ۡۢ֫;

    .line 171
    invoke-virtual {v5, v2}, Ll/ۖۢ֫;->getInterpolation(F)F

    move-result v2

    const/high16 v5, 0x437a0000    # 250.0f

    mul-float v2, v2, v5

    add-float/2addr v2, v4

    iput v2, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    .line 173
    sget-object v2, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->DELAY_TO_COLLAPSE_IN_MS:[I

    aget v2, v2, v1

    .line 174
    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->getFractionInRange(III)F

    move-result v2

    .line 176
    iget v3, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    iget-object v4, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->interpolator:Ll/ۡۢ֫;

    .line 177
    invoke-virtual {v4, v2}, Ll/ۖۢ֫;->getInterpolation(F)F

    move-result v2

    mul-float v2, v2, v5

    add-float/2addr v2, v3

    iput v2, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 180
    :cond_0
    iget p1, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    iget v1, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    sub-float v2, v1, p1

    iget v3, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndFraction:F

    mul-float v2, v2, v3

    add-float/2addr v2, p1

    const/high16 p1, 0x43b40000    # 360.0f

    div-float/2addr v2, p1

    .line 183
    iput v2, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    div-float/2addr v1, p1

    .line 184
    iput v1, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    return-void
.end method


# virtual methods
.method public cancelAnimatorImmediately()V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    return-void
.end method

.method public invalidateSpecValues()V
    .locals 0

    .line 143
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->resetPropertiesForNewStart()V

    return-void
.end method

.method public registerAnimatorsCompleteCallback(Ll/ᩳ᩺ۧ;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animatorCompleteCallback:Ll/ᩳ᩺ۧ;

    return-void
.end method

.method public requestCancelAnimatorAfterCurrentCycle()V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->drawable:Lcom/google/android/material/progressindicator/IndeterminateDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    .line 137
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->cancelAnimatorImmediately()V

    :cond_2
    :goto_0
    return-void
.end method

.method public resetPropertiesForNewStart()V
    .locals 3

    const/4 v0, 0x0

    .line 209
    iput v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->indicatorColorIndexOffset:I

    .line 210
    iget-object v1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    iget-object v2, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    iget-object v2, v2, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorColors:[I

    aget v0, v2, v0

    iput v0, v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    const/4 v0, 0x0

    .line 211
    iput v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->completeEndFraction:F

    return-void
.end method

.method public setAnimationFraction(F)V
    .locals 1

    .line 223
    iput p1, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animationFraction:F

    const v0, 0x45a8c000    # 5400.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    .line 225
    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->updateSegmentPositions(I)V

    .line 226
    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->maybeUpdateSegmentColors(I)V

    .line 227
    iget-object p1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->drawable:Lcom/google/android/material/progressindicator/IndeterminateDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public startAnimator()V
    .locals 1

    .line 78
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->maybeInitializeAnimators()V

    .line 80
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->resetPropertiesForNewStart()V

    .line 81
    iget-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public unregisterAnimatorsCompleteCallback()V
    .locals 1

    const/4 v0, 0x0

    .line 153
    iput-object v0, p0, Lcom/google/android/material/progressindicator/CircularIndeterminateAnimatorDelegate;->animatorCompleteCallback:Ll/ᩳ᩺ۧ;

    return-void
.end method
