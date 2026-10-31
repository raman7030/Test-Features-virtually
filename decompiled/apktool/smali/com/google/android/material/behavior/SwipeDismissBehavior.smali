.class public Lcom/google/android/material/behavior/SwipeDismissBehavior;
.super Ll/ۛ᩸;
.source "SwipeDismissBehavior.java"


# static fields
.field public static final DEFAULT_ALPHA_END_DISTANCE:F = 0.5f

.field public static final DEFAULT_ALPHA_START_DISTANCE:F = 0.0f

.field public static final DEFAULT_DRAG_DISMISS_THRESHOLD:F = 0.5f

.field public static final STATE_DRAGGING:I = 0x1

.field public static final STATE_IDLE:I = 0x0

.field public static final STATE_SETTLING:I = 0x2

.field public static final SWIPE_DIRECTION_ANY:I = 0x2

.field public static final SWIPE_DIRECTION_END_TO_START:I = 0x1

.field public static final SWIPE_DIRECTION_START_TO_END:I


# instance fields
.field public alphaEndSwipeDistance:F

.field public alphaStartSwipeDistance:F

.field public final dragCallback:Ll/ۡۧ֫;

.field public dragDismissThreshold:F

.field public interceptingEvents:Z

.field public listener:Lcom/google/android/material/behavior/SwipeDismissBehavior$OnDismissListener;

.field public requestingDisallowInterceptTouchEvent:Z

.field public sensitivity:F

.field public sensitivitySet:Z

.field public swipeDirection:I

.field public viewDragHelper:Ll/ܺۧ֫;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 43
    invoke-direct {p0}, Ll/ۛ᩸;-><init>()V

    const/4 v0, 0x0

    .line 90
    iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->sensitivity:F

    const/4 v1, 0x2

    .line 93
    iput v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->swipeDirection:I

    const/high16 v1, 0x3f000000    # 0.5f

    .line 94
    iput v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->dragDismissThreshold:F

    .line 95
    iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->alphaStartSwipeDistance:F

    .line 96
    iput v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->alphaEndSwipeDistance:F

    .line 237
    new-instance v0, Lcom/google/android/material/behavior/SwipeDismissBehavior$1;

    invoke-direct {v0, p0}, Lcom/google/android/material/behavior/SwipeDismissBehavior$1;-><init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;)V

    iput-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->dragCallback:Ll/ۡۧ֫;

    return-void
.end method

.method public static synthetic access$002(Lcom/google/android/material/behavior/SwipeDismissBehavior;Z)Z
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->requestingDisallowInterceptTouchEvent:Z

    return p1
.end method

.method public static clamp(FFF)F
    .locals 0

    .line 451
    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {p0, p2}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method

.method public static clamp(III)I
    .locals 0

    .line 455
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method private ensureViewDragHelper(Landroid/view/ViewGroup;)V
    .locals 2

    .line 391
    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->viewDragHelper:Ll/ܺۧ֫;

    if-nez v0, :cond_1

    .line 393
    iget-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->sensitivitySet:Z

    if-eqz v0, :cond_0

    .line 394
    iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->sensitivity:F

    iget-object v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->dragCallback:Ll/ۡۧ֫;

    invoke-static {p1, v0, v1}, Ll/ܺۧ֫;->֫(Landroid/view/ViewGroup;FLl/ۡۧ֫;)Ll/ܺۧ֫;

    move-result-object p1

    goto :goto_0

    .line 395
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->dragCallback:Ll/ۡۧ֫;

    invoke-static {p1, v0}, Ll/ܺۧ֫;->֫(Landroid/view/ViewGroup;Ll/ۡۧ֫;)Ll/ܺۧ֫;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->viewDragHelper:Ll/ܺۧ֫;

    :cond_1
    return-void
.end method

.method public static fraction(FFF)F
    .locals 0

    sub-float/2addr p2, p0

    sub-float/2addr p1, p0

    div-float/2addr p2, p1

    return p2
.end method

.method private updateAccessibilityActions(Landroid/view/View;)V
    .locals 3

    const/high16 v0, 0x100000

    .line 421
    invoke-static {v0, p1}, Ll/ܿ᩺;->ᩳ(ILandroid/view/View;)V

    .line 422
    invoke-virtual {p0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->canSwipeDismissView(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    sget-object v0, Ll/ܰܰ;->ۜ:Ll/ܰܰ;

    new-instance v1, Lcom/google/android/material/behavior/SwipeDismissBehavior$2;

    invoke-direct {v1, p0}, Lcom/google/android/material/behavior/SwipeDismissBehavior$2;-><init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;)V

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܰܰ;Ljava/lang/String;Ll/ۚ۟;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public canSwipeDismissView(Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public getDragState()I
    .locals 1

    .line 465
    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->viewDragHelper:Ll/ܺۧ֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܺۧ֫;->᩷()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getListener()Lcom/google/android/material/behavior/SwipeDismissBehavior$OnDismissListener;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->listener:Lcom/google/android/material/behavior/SwipeDismissBehavior$OnDismissListener;

    return-object v0
.end method

.method public onInterceptTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 191
    iget-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->interceptingEvents:Z

    .line 193
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    const/4 p2, 0x3

    if-eq v1, p2, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    iput-boolean v3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->interceptingEvents:Z

    goto :goto_0

    .line 196
    :cond_1
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1, p2, v0, v1}, Ll/ᩳ᩹;->isPointInChildBounds(Landroid/view/View;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->interceptingEvents:Z

    :goto_0
    if-eqz v0, :cond_2

    .line 207
    invoke-direct {p0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->ensureViewDragHelper(Landroid/view/ViewGroup;)V

    .line 208
    iget-boolean p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->requestingDisallowInterceptTouchEvent:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->viewDragHelper:Ll/ܺۧ֫;

    .line 209
    invoke-virtual {p1, p3}, Ll/ܺۧ֫;->ۧ(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v3
.end method

.method public onLayoutChild(Ll/ᩳ᩹;Landroid/view/View;I)Z
    .locals 0

    .line 179
    invoke-super {p0, p1, p2, p3}, Ll/ۛ᩸;->onLayoutChild(Ll/ᩳ᩹;Landroid/view/View;I)Z

    move-result p1

    .line 180
    sget p3, Ll/ܿ᩺;->֫:I

    .line 1400
    invoke-virtual {p2}, Landroid/view/View;->getImportantForAccessibility()I

    move-result p3

    if-nez p3, :cond_0

    const/4 p3, 0x1

    .line 1427
    invoke-virtual {p2, p3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 183
    invoke-direct {p0, p2}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->updateAccessibilityActions(Landroid/view/View;)V

    :cond_0
    return p1
.end method

.method public onTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 216
    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->viewDragHelper:Ll/ܺۧ֫;

    if-eqz p1, :cond_2

    .line 218
    iget-boolean p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->requestingDisallowInterceptTouchEvent:Z

    if-eqz p1, :cond_0

    .line 219
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    .line 220
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->viewDragHelper:Ll/ܺۧ֫;

    invoke-virtual {p1, p3}, Ll/ܺۧ֫;->֫(Landroid/view/MotionEvent;)V

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public setDragDismissDistance(F)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 143
    invoke-static {v0, p1, v1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->clamp(FFF)F

    move-result p1

    iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->dragDismissThreshold:F

    return-void
.end method

.method public setEndAlphaSwipeDistance(F)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 161
    invoke-static {v0, p1, v1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->clamp(FFF)F

    move-result p1

    iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->alphaEndSwipeDistance:F

    return-void
.end method

.method public setListener(Lcom/google/android/material/behavior/SwipeDismissBehavior$OnDismissListener;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->listener:Lcom/google/android/material/behavior/SwipeDismissBehavior$OnDismissListener;

    return-void
.end method

.method public setSensitivity(F)V
    .locals 0

    .line 172
    iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->sensitivity:F

    const/4 p1, 0x1

    .line 173
    iput-boolean p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->sensitivitySet:Z

    return-void
.end method

.method public setStartAlphaSwipeDistance(F)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 152
    invoke-static {v0, p1, v1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->clamp(FFF)F

    move-result p1

    iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->alphaStartSwipeDistance:F

    return-void
.end method

.method public setSwipeDirection(I)V
    .locals 0

    .line 134
    iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->swipeDirection:I

    return-void
.end method
