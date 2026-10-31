.class public final Ll/֨ۙ۠;
.super Ljava/lang/Object;
.source "28VZ"

# interfaces
.implements Ll/֡ۙ۠;


# instance fields
.field public ֫:Z

.field public final ۜ:Landroid/view/VelocityTracker;

.field public ۧ:F

.field public final ܳ:Landroid/view/ScaleGestureDetector;

.field public ܽ:F

.field public final ܿ:F

.field public ᩳ:Ll/ᩴۙ۠;

.field public ᩷:I

.field public final ᩻:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۙ۠;->ۜ:Landroid/view/VelocityTracker;

    .line 29
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Ll/֨ۙ۠;->ܿ:F

    .line 31
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Ll/֨ۙ۠;->᩻:F

    .line 32
    new-instance v0, Ll/ۚۙ۠;

    invoke-direct {v0, p0}, Ll/ۚۙ۠;-><init>(Ll/֨ۙ۠;)V

    .line 54
    new-instance v1, Landroid/view/ScaleGestureDetector;

    invoke-direct {v1, p1, v0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v1, p0, Ll/֨ۙ۠;->ܳ:Landroid/view/ScaleGestureDetector;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/MotionEvent;)V
    .locals 11

    .line 67
    iget-object v0, p0, Ll/֨ۙ۠;->ܳ:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/֨ۙ۠;->ۜ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_9

    const/4 v3, 0x1

    if-eq v0, v3, :cond_7

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    const/4 p1, 0x5

    if-eq v0, p1, :cond_1

    const/4 p1, 0x6

    if-eq v0, p1, :cond_0

    goto/16 :goto_1

    .line 83
    :cond_0
    iget p1, p0, Ll/֨ۙ۠;->᩷:I

    sub-int/2addr p1, v3

    iput p1, p0, Ll/֨ۙ۠;->᩷:I

    if-nez p1, :cond_8

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 85
    iput p1, p0, Ll/֨ۙ۠;->ۧ:F

    .line 86
    iput p1, p0, Ll/֨ۙ۠;->ܽ:F

    .line 87
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V

    return-void

    .line 79
    :cond_1
    iget p1, p0, Ll/֨ۙ۠;->᩷:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/֨ۙ۠;->᩷:I

    .line 80
    iput-boolean v1, p0, Ll/֨ۙ۠;->֫:Z

    return-void

    .line 91
    :cond_2
    iget v0, p0, Ll/֨ۙ۠;->᩷:I

    if-nez v0, :cond_8

    .line 92
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 93
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 94
    iget v4, p0, Ll/֨ۙ۠;->ۧ:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_6

    iget v4, p0, Ll/֨ۙ۠;->ܽ:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    .line 100
    :cond_3
    iget v4, p0, Ll/֨ۙ۠;->ۧ:F

    sub-float v4, v0, v4

    .line 101
    iget v5, p0, Ll/֨ۙ۠;->ܽ:F

    sub-float v5, v3, v5

    .line 102
    iget-boolean v6, p0, Ll/֨ۙ۠;->֫:Z

    if-nez v6, :cond_5

    mul-float v6, v4, v4

    mul-float v7, v5, v5

    add-float/2addr v7, v6

    float-to-double v6, v7

    .line 103
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    iget v8, p0, Ll/֨ۙ۠;->᩻:F

    float-to-double v8, v8

    cmpl-double v10, v6, v8

    if-ltz v10, :cond_4

    const/4 v1, 0x1

    :cond_4
    iput-boolean v1, p0, Ll/֨ۙ۠;->֫:Z

    .line 105
    :cond_5
    iget-boolean v1, p0, Ll/֨ۙ۠;->֫:Z

    if-eqz v1, :cond_8

    .line 106
    iget-object v1, p0, Ll/֨ۙ۠;->ᩳ:Ll/ᩴۙ۠;

    invoke-virtual {v1, v4, v5}, Ll/ᩴۙ۠;->֫(FF)V

    .line 107
    iput v0, p0, Ll/֨ۙ۠;->ۧ:F

    .line 108
    iput v3, p0, Ll/֨ۙ۠;->ܽ:F

    .line 109
    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    return-void

    .line 95
    :cond_6
    :goto_0
    iput v0, p0, Ll/֨ۙ۠;->ۧ:F

    .line 96
    iput v3, p0, Ll/֨ۙ۠;->ܽ:F

    .line 97
    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    return-void

    .line 115
    :cond_7
    iget-boolean v0, p0, Ll/֨ۙ۠;->֫:Z

    if-eqz v0, :cond_8

    .line 116
    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    const/16 v0, 0x3e8

    .line 117
    invoke-virtual {v2, v0}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 118
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v0

    .line 119
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v1

    .line 120
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget v3, p0, Ll/֨ۙ۠;->ܿ:F

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_8

    .line 121
    iget-object v2, p0, Ll/֨ۙ۠;->ᩳ:Ll/ᩴۙ۠;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    neg-float p1, v0

    neg-float v0, v1

    invoke-virtual {v2, p1, v0}, Ll/ᩴۙ۠;->ۧ(FF)V

    :cond_8
    :goto_1
    return-void

    .line 70
    :cond_9
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V

    .line 71
    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 72
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Ll/֨ۙ۠;->ۧ:F

    .line 73
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Ll/֨ۙ۠;->ܽ:F

    .line 74
    iput-boolean v1, p0, Ll/֨ۙ۠;->֫:Z

    .line 75
    iput v1, p0, Ll/֨ۙ۠;->᩷:I

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 58
    iget-object v0, p0, Ll/֨ۙ۠;->ܳ:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    return v0
.end method
