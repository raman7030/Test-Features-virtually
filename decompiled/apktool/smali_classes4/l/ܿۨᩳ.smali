.class public final Ll/ܿۨᩳ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "X68P"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ֫֫:Z

.field public ۖ֫:Z

.field public ۗ:Z

.field public ۘ֫:F

.field public ۙ:F

.field public ۛ:I

.field public ۜ֫:I

.field public ۟:Z

.field public ۡ֫:I

.field public ۢ֫:I

.field public ۤ:J

.field public ۧ֫:Z

.field public ۨ:F

.field public ۫:Ll/ۘܰᩳ;

.field public ۬:Z

.field public ܰ:I

.field public ܳ֫:F

.field public ܺ֫:Z

.field public ܽ֫:Z

.field public ܿ֫:F

.field public ᩳ֫:F

.field public final synthetic ᩴ֫:Ll/۫ۨᩳ;

.field public ᩵֫:Z

.field public ᩶:F

.field public ᩷֫:Z

.field public ᩸:I

.field public ᩹:I

.field public ᩺:F

.field public ᩻֫:I


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Landroid/content/Context;)V
    .locals 1

    .line 7741
    iput-object p1, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    const/4 v0, 0x0

    .line 7908
    iput-boolean v0, p0, Ll/ܿۨᩳ;->᩷֫:Z

    .line 7996
    iget-object p1, p1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {p1}, Ll/ۗۤᩳ;->᩵()Z

    move-result p1

    iput-boolean p1, p0, Ll/ܿۨᩳ;->ܺ֫:Z

    .line 7997
    new-instance p1, Ll/ۘܰᩳ;

    invoke-direct {p1}, Ll/ۘܰᩳ;-><init>()V

    iput-object p1, p0, Ll/ܿۨᩳ;->۫:Ll/ۘܰᩳ;

    const/4 p1, -0x1

    .line 8111
    iput p1, p0, Ll/ܿۨᩳ;->ۜ֫:I

    .line 8119
    iput p1, p0, Ll/ܿۨᩳ;->ܰ:I

    .line 7742
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Ll/ܿۨᩳ;->ۛ:I

    return-void
.end method

.method private ֫()V
    .locals 3

    .line 8181
    iget-boolean v0, p0, Ll/ܿۨᩳ;->۟:Z

    const/4 v1, 0x0

    .line 8182
    iput-boolean v1, p0, Ll/ܿۨᩳ;->ܽ֫:Z

    .line 8183
    iput-boolean v1, p0, Ll/ܿۨᩳ;->ۧ֫:Z

    .line 8184
    iput-boolean v1, p0, Ll/ܿۨᩳ;->֫֫:Z

    .line 8185
    iput-boolean v1, p0, Ll/ܿۨᩳ;->۟:Z

    const/4 v2, -0x1

    .line 8186
    iput v2, p0, Ll/ܿۨᩳ;->ܰ:I

    const/4 v2, 0x0

    .line 8187
    iput v2, p0, Ll/ܿۨᩳ;->ۨ:F

    .line 8188
    iput v2, p0, Ll/ܿۨᩳ;->᩺:F

    .line 8189
    iget-object v2, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    iput v1, v2, Ll/۫ۨᩳ;->֨֫:I

    if-eqz v0, :cond_0

    .line 8191
    invoke-direct {p0, v1}, Ll/ܿۨᩳ;->֫(Z)V

    :cond_0
    return-void
.end method

.method private ֫(FF)V
    .locals 3

    .line 8324
    iget-object v0, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, p1

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p1, p2

    invoke-virtual {v1, v2, p1}, Ll/ۗۤᩳ;->֫(FF)I

    move-result p1

    .line 8325
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result p2

    iget v1, p0, Ll/ܿۨᩳ;->ܰ:I

    if-ne p2, v1, :cond_1

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result p2

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 8326
    :cond_1
    :goto_0
    invoke-static {v0}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object p2

    iget v1, p0, Ll/ܿۨᩳ;->ܰ:I

    invoke-interface {p2, v1, p1}, Ll/᩶᩸ᩳ;->setSelection(II)V

    .line 8327
    invoke-static {v0, p1}, Ll/۫ۨᩳ;->ܿ(Ll/۫ۨᩳ;I)V

    .line 8328
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private ֫(Landroid/view/MotionEvent;)V
    .locals 6

    .line 8268
    invoke-direct {p0, p1}, Ll/ܿۨᩳ;->ܿ(Landroid/view/MotionEvent;)V

    .line 8288
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    .line 8289
    iget-object v1, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    iget v2, v1, Ll/۫ۨᩳ;->֨֫:I

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 8290
    :goto_0
    iget v4, v1, Ll/۫ۨᩳ;->۠֫:F

    cmpg-float v5, v0, v4

    if-gez v5, :cond_2

    sub-float/2addr v4, v0

    float-to-int v0, v4

    .line 8291
    invoke-static {v0}, Ll/۫ۨᩳ;->۠(I)I

    move-result v0

    neg-int v0, v0

    iput v0, v1, Ll/۫ۨᩳ;->֨֫:I

    if-eqz v2, :cond_1

    .line 8293
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Ll/۫ۨᩳ;->ۡۧ:J

    .line 8295
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_1

    .line 8296
    :cond_2
    iget v4, v1, Ll/۫ۨᩳ;->ۚ֫:F

    cmpl-float v5, v0, v4

    if-lez v5, :cond_4

    sub-float/2addr v0, v4

    float-to-int v0, v0

    .line 8297
    invoke-static {v0}, Ll/۫ۨᩳ;->۠(I)I

    move-result v0

    iput v0, v1, Ll/۫ۨᩳ;->֨֫:I

    if-eqz v2, :cond_3

    .line 8299
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Ll/۫ۨᩳ;->ۡۧ:J

    .line 8301
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_1

    .line 8303
    :cond_4
    iput v3, v1, Ll/۫ۨᩳ;->֨֫:I

    .line 8312
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    .line 8313
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr p1, v2

    .line 8314
    iput v0, v1, Ll/۫ۨᩳ;->ᩴۧ:F

    .line 8315
    iput p1, v1, Ll/۫ۨᩳ;->᩵ۧ:F

    .line 8316
    invoke-direct {p0, v0, p1}, Ll/ܿۨᩳ;->֫(FF)V

    return-void
.end method

.method public static ֫(Ll/ܿۨᩳ;)V
    .locals 2

    .line 8347
    iget-object v0, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 8348
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶ܽ()V

    .line 8349
    invoke-direct {p0}, Ll/ܿۨᩳ;->֫()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿۨᩳ;FF)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ܿۨᩳ;->֫(FF)V

    return-void
.end method

.method private ֫(Z)V
    .locals 1

    .line 7911
    iget-boolean v0, p0, Ll/ܿۨᩳ;->᩷֫:Z

    if-eq v0, p1, :cond_0

    .line 7912
    iget-object v0, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 7913
    iput-boolean p1, p0, Ll/ܿۨᩳ;->᩷֫:Z

    :cond_0
    return-void
.end method

.method private ۧ()V
    .locals 2

    .line 8816
    iget-boolean v0, p0, Ll/ܿۨᩳ;->ۖ֫:Z

    if-eqz v0, :cond_0

    .line 8818
    iget-object v0, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۘۧ()V

    .line 8819
    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v1}, Ll/ۗۤᩳ;->᩸()V

    .line 8820
    invoke-static {v0}, Ll/۫ۨᩳ;->ᩳۧ(Ll/۫ۨᩳ;)V

    :cond_0
    return-void
.end method

.method private ۧ(Landroid/view/MotionEvent;)V
    .locals 9

    .line 8789
    iget-object v0, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    iget-object v1, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-static {p1}, Ll/ܿۨᩳ;->ܽ(Landroid/view/MotionEvent;)F

    move-result v2

    .line 8790
    iget-boolean v3, p0, Ll/ܿۨᩳ;->ۖ֫:Z

    const/4 v4, 0x1

    if-nez v3, :cond_0

    .line 8791
    iget v3, p0, Ll/ܿۨᩳ;->ܳ֫:F

    sub-float v3, v2, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v5, p0, Ll/ܿۨᩳ;->ۛ:I

    int-to-float v5, v5

    cmpl-float v3, v3, v5

    if-lez v3, :cond_6

    .line 8792
    iput-boolean v4, p0, Ll/ܿۨᩳ;->ۖ֫:Z

    .line 8795
    :cond_0
    iget v3, p0, Ll/ܿۨᩳ;->ܳ֫:F

    div-float/2addr v2, v3

    .line 8796
    iget-object v3, v1, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    .line 8797
    iget v5, p0, Ll/ܿۨᩳ;->ۘ֫:F

    mul-float v5, v5, v2

    invoke-virtual {v1, v5}, Ll/᩺֫ܿ;->ۧ(F)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 8798
    iget-object v1, v1, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    iget v2, p0, Ll/ܿۨᩳ;->ۘ֫:F

    div-float/2addr v1, v2

    .line 8799
    iget-object v2, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v2, v3}, Ll/ۗۤᩳ;->֫(F)V

    .line 8801
    iget-object v2, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v2}, Ll/ۗۤᩳ;->֫()Z

    move-result v2

    const/4 v3, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    .line 8802
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    add-float/2addr v7, v2

    div-float/2addr v7, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v7, v2

    .line 8803
    iget v2, p0, Ll/ܿۨᩳ;->ۢ֫:I

    int-to-float v2, v2

    add-float/2addr v2, v7

    mul-float v2, v2, v1

    sub-float/2addr v2, v7

    cmpg-float v7, v2, v3

    if-gez v7, :cond_1

    goto :goto_0

    .line 6018
    :cond_1
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܶ֫()I

    move-result v7

    int-to-float v7, v7

    cmpl-float v8, v2, v7

    if-lez v8, :cond_3

    move v2, v7

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 8807
    :cond_3
    :goto_1
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v6

    div-float/2addr p1, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr p1, v4

    .line 8808
    iget v4, p0, Ll/ܿۨᩳ;->ۡ֫:I

    int-to-float v4, v4

    add-float/2addr v4, p1

    mul-float v4, v4, v1

    sub-float/2addr v4, p1

    cmpg-float p1, v4, v3

    if-gez p1, :cond_4

    goto :goto_2

    .line 6042
    :cond_4
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩸֫()I

    move-result p1

    int-to-float v3, p1

    cmpl-float p1, v4, v3

    if-lez p1, :cond_5

    goto :goto_2

    :cond_5
    move v3, v4

    :goto_2
    float-to-int p1, v2

    float-to-int v1, v3

    .line 8810
    invoke-virtual {v0, p1, v1}, Ll/۫ۨᩳ;->ۜ(II)V

    .line 8811
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_6
    return-void
.end method

.method public static ܽ(Landroid/view/MotionEvent;)F
    .locals 4

    const/4 v0, 0x0

    .line 8825
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    .line 8826
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p0

    sub-float/2addr v0, p0

    mul-float v1, v1, v1

    mul-float v0, v0, v0

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 8827
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method private ܿ(Landroid/view/MotionEvent;)V
    .locals 4

    .line 8356
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 8357
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 8358
    iget-object v1, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    const/4 v2, 0x0

    cmpl-float v3, v0, v2

    if-ltz v3, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    cmpl-float v0, p1, v2

    if-ltz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 8359
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-eq p1, v0, :cond_1

    .line 8360
    invoke-virtual {v1, p1}, Landroid/view/View;->setPressed(Z)V

    .line 8361
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method private ᩳ(Landroid/view/MotionEvent;)V
    .locals 8

    .line 8773
    invoke-static {p1}, Ll/ܿۨᩳ;->ܽ(Landroid/view/MotionEvent;)F

    move-result p1

    iput p1, p0, Ll/ܿۨᩳ;->ܳ֫:F

    const/4 p1, 0x1

    .line 8774
    iput-boolean p1, p0, Ll/ܿۨᩳ;->᩵֫:Z

    const/4 p1, 0x0

    .line 8775
    iput-boolean p1, p0, Ll/ܿۨᩳ;->ۖ֫:Z

    .line 8776
    iget-object v0, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    iget-object v1, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-object v1, v1, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    iput v1, p0, Ll/ܿۨᩳ;->ۘ֫:F

    .line 8777
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v1

    iput v1, p0, Ll/ܿۨᩳ;->ۢ֫:I

    .line 8778
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v1

    iput v1, p0, Ll/ܿۨᩳ;->ۡ֫:I

    .line 8779
    invoke-static {v0}, Ll/۫ۨᩳ;->᩻֫(Ll/۫ۨᩳ;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/۫ۨᩳ;->ܳ֫(Ll/۫ۨᩳ;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/۫ۨᩳ;->ۜ֫(Ll/۫ۨᩳ;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/۫ۨᩳ;->֡(Ll/۫ۨᩳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 8784
    :cond_0
    invoke-static {v0}, Ll/۫ۨᩳ;->ܺ(Ll/۫ۨᩳ;)Ll/֨ۛ;

    move-result-object p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    return-void

    .line 8780
    :cond_1
    :goto_0
    invoke-static {v0}, Ll/۫ۨᩳ;->ۗ֫(Ll/۫ۨᩳ;)V

    .line 8781
    invoke-static {v0}, Ll/۫ۨᩳ;->۬֫(Ll/۫ۨᩳ;)V

    .line 8782
    invoke-static {v0, p1}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Z)V

    invoke-static {v0, p1}, Ll/۫ۨᩳ;->ܳ(Ll/۫ۨᩳ;Z)V

    invoke-static {v0, p1}, Ll/۫ۨᩳ;->ᩳ(Ll/۫ۨᩳ;Z)V

    invoke-static {v0, p1}, Ll/۫ۨᩳ;->ܿ(Ll/۫ۨᩳ;Z)V

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 7755
    invoke-direct {p0}, Ll/ܿۨᩳ;->֫()V

    .line 7756
    iget-object p1, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result v0

    .line 7757
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۬֫()I

    move-result v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 7759
    invoke-virtual {p1, v0, v2}, Ll/۫ۨᩳ;->ᩳ(IZ)V

    .line 7760
    invoke-virtual {p1, v2}, Ll/۫ۨᩳ;->֫(Z)V

    const/4 v0, -0x1

    .line 2448
    invoke-virtual {p1, v0}, Ll/۫ۨᩳ;->֨(I)V

    .line 7763
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Ll/۫ۨᩳ;->ܳܽ:J

    .line 7764
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۟ܽ()V

    return v2
.end method

.method public final onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 7790
    iget-object p1, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    move-result v0

    iput-boolean v0, p0, Ll/ܿۨᩳ;->۬:Z

    .line 7791
    invoke-static {p1}, Ll/۫ۨᩳ;->᩶(Ll/۫ۨᩳ;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 7792
    invoke-static {p1}, Ll/۫ۨᩳ;->᩶(Ll/۫ۨᩳ;)Landroid/widget/OverScroller;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 11

    .line 7803
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p2

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    cmpl-float p1, p1, p2

    if-lez p1, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 7805
    :cond_0
    iget-object p1, v1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {p1}, Ll/ۗۤᩳ;->֫()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p4, 0x0

    .line 7810
    :goto_0
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܶ֫()I

    move-result v8

    .line 7811
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩸֫()I

    move-result v10

    .line 7812
    invoke-static {v1}, Ll/۫ۨᩳ;->᩵֫(Ll/۫ۨᩳ;)V

    .line 7813
    invoke-static {v1}, Ll/۫ۨᩳ;->᩶(Ll/۫ۨᩳ;)Landroid/widget/OverScroller;

    move-result-object v2

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v3

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v4

    neg-float p1, p3

    float-to-int v5, p1

    neg-float p1, p4

    float-to-int v6, p1

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v2 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    const/4 p1, 0x1

    cmpl-float p2, p4, v0

    if-eqz p2, :cond_1

    .line 7816
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܰܽ()V

    return p1

    :cond_1
    cmpl-float p2, p3, v0

    if-eqz p2, :cond_2

    .line 7818
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۨܽ()V

    return p1

    .line 7820
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 10

    .line 7830
    iget-object v0, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    iget-object v1, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 7832
    :cond_0
    invoke-direct {p0}, Ll/ܿۨᩳ;->֫()V

    const/4 v2, 0x0

    .line 7833
    invoke-virtual {v0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 7834
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-nez v3, :cond_1

    .line 7835
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 7837
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    .line 7838
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    .line 7839
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v5

    .line 7840
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v6

    if-le v5, v6, :cond_2

    move v9, v6

    move v6, v5

    move v5, v9

    .line 7846
    :cond_2
    iget-boolean v7, v1, Ll/᩺֫ܿ;->۫ۧ:Z

    const/4 v8, -0x1

    if-eqz v7, :cond_7

    .line 7847
    invoke-static {v0, v3}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;F)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 7849
    iget-object p1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    float-to-double v1, v4

    invoke-virtual {p1, v1, v2}, Ll/ۗۤᩳ;->֫(D)I

    move-result p1

    .line 7850
    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget-object v1, v1, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 127
    invoke-virtual {v1, p1}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v1

    .line 7850
    iget v1, v1, Ll/ۨܰᩳ;->᩶:I

    .line 7851
    iget-object v2, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget-object v2, v2, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 131
    invoke-virtual {v2, p1}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result p1

    invoke-virtual {v2, p1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object p1

    .line 7851
    iget p1, p1, Ll/ۨܰᩳ;->᩸:I

    .line 7852
    invoke-static {v0}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-static {v2}, Landroid/view/inputmethod/BaseInputConnection;->removeComposingSpans(Landroid/text/Spannable;)V

    if-ne v5, v6, :cond_3

    .line 7854
    invoke-static {v0}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-interface {v2, v1, p1}, Ll/᩶᩸ᩳ;->setSelection(II)V

    .line 7855
    invoke-static {v0, v1}, Ll/۫ۨᩳ;->ܽ(Ll/۫ۨᩳ;I)V

    .line 7856
    invoke-static {v0, p1}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;I)V

    goto :goto_0

    .line 7858
    :cond_3
    invoke-static {v0}, Ll/۫ۨᩳ;->֨(Ll/۫ۨᩳ;)I

    move-result v2

    if-ne v2, v8, :cond_4

    .line 7859
    invoke-static {v0, v5}, Ll/۫ۨᩳ;->ܽ(Ll/۫ۨᩳ;I)V

    .line 7860
    invoke-static {v0, v6}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;I)V

    .line 7862
    :cond_4
    invoke-static {v0}, Ll/۫ۨᩳ;->֨(Ll/۫ۨᩳ;)I

    move-result v2

    if-ge v1, v2, :cond_5

    move v5, v1

    .line 7865
    :cond_5
    invoke-static {v0}, Ll/۫ۨᩳ;->ۚ(Ll/۫ۨᩳ;)I

    move-result v1

    if-lt p1, v1, :cond_6

    move v6, p1

    .line 7868
    :cond_6
    invoke-static {v0}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-interface {p1, v5, v6}, Ll/᩶᩸ᩳ;->setSelection(II)V

    .line 7870
    :goto_0
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶ܽ()V

    .line 7871
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    .line 7875
    :cond_7
    iget-object v7, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v7, v3, v4}, Ll/ۗۤᩳ;->֫(FF)I

    move-result v3

    .line 7876
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬ۧ()Z

    move-result v4

    const/4 v7, 0x1

    if-eqz v4, :cond_a

    if-eq v5, v6, :cond_9

    if-gt v5, v3, :cond_9

    if-le v3, v6, :cond_8

    goto :goto_1

    .line 2448
    :cond_8
    invoke-virtual {v0, v8}, Ll/۫ۨᩳ;->֨(I)V

    .line 7893
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Ll/۫ۨᩳ;->ܳܽ:J

    .line 7894
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۟ܽ()V

    goto/16 :goto_2

    .line 7878
    :cond_9
    :goto_1
    invoke-virtual {v0, v3, v2}, Ll/۫ۨᩳ;->ܽ(IZ)[I

    move-result-object v4

    .line 7879
    invoke-static {v0, v7}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Z)V

    .line 7880
    invoke-static {v0, v3}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;I)V

    .line 7881
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v3

    aget v5, v4, v2

    invoke-virtual {v0, v3, v5}, Ll/۫ۨᩳ;->ܳ(II)V

    .line 7882
    aget v3, v4, v2

    aget v5, v4, v7

    invoke-virtual {v0, v3, v5}, Ll/۫ۨᩳ;->᩷(II)V

    .line 7883
    aget v3, v4, v2

    invoke-static {v0, v3}, Ll/۫ۨᩳ;->ᩳ(Ll/۫ۨᩳ;I)V

    const-wide/16 v3, 0x0

    .line 7884
    iput-wide v3, v0, Ll/۫ۨᩳ;->ܳܽ:J

    .line 7885
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܳۧ()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v4, v3

    invoke-virtual {v1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    add-float/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iput v3, v0, Ll/۫ۨᩳ;->۠֫:F

    .line 7886
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܳۧ()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    iput v3, v0, Ll/۫ۨᩳ;->ۚ֫:F

    .line 7887
    iput v2, v0, Ll/۫ۨᩳ;->֨֫:I

    .line 7888
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 7889
    invoke-virtual {v0, v7}, Ll/۫ۨᩳ;->֫(Z)V

    .line 7890
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    iget v1, v1, Ll/᩺֫ܿ;->ܺۧ:I

    invoke-static {v0, v2, p1, v1}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;III)V

    goto :goto_2

    :cond_a
    if-eq v5, v6, :cond_b

    if-gt v5, v3, :cond_b

    if-le v3, v6, :cond_c

    .line 7898
    :cond_b
    invoke-virtual {v0, v3, v2}, Ll/۫ۨᩳ;->ᩳ(IZ)V

    .line 7899
    invoke-virtual {v0, v7}, Ll/۫ۨᩳ;->֫(Z)V

    .line 2448
    :cond_c
    invoke-virtual {v0, v8}, Ll/۫ۨᩳ;->֨(I)V

    .line 7902
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Ll/۫ۨᩳ;->ܳܽ:J

    .line 7903
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۟ܽ()V

    .line 7905
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 5

    .line 7921
    iget-object p1, p0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    iget-object v0, p1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-nez v1, :cond_0

    .line 7922
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 7924
    :cond_0
    iget-object v1, p1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v1}, Ll/ۗۤᩳ;->֫()Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v1, v1, v4

    if-lez v1, :cond_5

    .line 7925
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p4

    float-to-int v1, p3

    add-int/2addr p4, v1

    if-gez p4, :cond_2

    if-eqz p2, :cond_1

    .line 7929
    iget-boolean p4, v0, Ll/᩺֫ܿ;->ᩴ֫:Z

    if-eqz p4, :cond_1

    .line 7930
    invoke-static {p1}, Ll/۫ۨᩳ;->᩸(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p4

    neg-float p3, p3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p3, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    sub-float/2addr v2, p2

    invoke-static {p4, p3, v2}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 7931
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 7932
    invoke-static {p1}, Ll/۫ۨᩳ;->᩹(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_1

    .line 7933
    invoke-static {p1}, Ll/۫ۨᩳ;->᩹(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_1
    const/4 p4, 0x0

    goto :goto_0

    .line 7936
    :cond_2
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ܶ֫()I

    move-result v1

    if-le p4, v1, :cond_4

    if-eqz p2, :cond_3

    .line 7940
    iget-boolean p4, v0, Ll/᩺֫ܿ;->ᩴ֫:Z

    if-eqz p4, :cond_3

    .line 7941
    invoke-static {p1}, Ll/۫ۨᩳ;->᩹(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p4

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p3, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-static {p4, p3, p2}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 7942
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 7943
    invoke-static {p1}, Ll/۫ۨᩳ;->᩸(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_3

    .line 7944
    invoke-static {p1}, Ll/۫ۨᩳ;->᩸(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_3
    move p4, v1

    .line 7948
    :cond_4
    :goto_0
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result p2

    invoke-virtual {p1, p4, p2}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 7949
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۨܽ()V

    goto/16 :goto_2

    .line 7951
    :cond_5
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result p3

    float-to-int v1, p4

    add-int/2addr p3, v1

    if-gez p3, :cond_8

    .line 7953
    iget-boolean p3, p0, Ll/ܿۨᩳ;->ۗ:Z

    if-eqz p3, :cond_6

    .line 7954
    invoke-direct {p0, v3}, Ll/ܿۨᩳ;->֫(Z)V

    :cond_6
    if-eqz p2, :cond_7

    .line 7958
    iget-boolean p3, v0, Ll/᩺֫ܿ;->ᩴ֫:Z

    if-eqz p3, :cond_7

    .line 7959
    invoke-static {p1}, Ll/۫ۨᩳ;->ۗ(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    neg-float p4, p4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p4, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-static {p3, p4, p2}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 7960
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 7961
    invoke-static {p1}, Ll/۫ۨᩳ;->۠(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_7

    .line 7962
    invoke-static {p1}, Ll/۫ۨᩳ;->۠(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_7
    const/4 p3, 0x0

    goto :goto_1

    .line 7965
    :cond_8
    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩸֫()I

    move-result v1

    if-le p3, v1, :cond_b

    .line 7967
    iget-boolean p3, p0, Ll/ܿۨᩳ;->ۗ:Z

    if-eqz p3, :cond_9

    .line 7968
    invoke-direct {p0, v3}, Ll/ܿۨᩳ;->֫(Z)V

    :cond_9
    if-eqz p2, :cond_a

    .line 7972
    iget-boolean p3, v0, Ll/᩺֫ܿ;->ᩴ֫:Z

    if-eqz p3, :cond_a

    .line 7973
    invoke-static {p1}, Ll/۫ۨᩳ;->۠(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p4, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    sub-float/2addr v2, p2

    invoke-static {p3, p4, v2}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 7974
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 7975
    invoke-static {p1}, Ll/۫ۨᩳ;->ۗ(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_a

    .line 7976
    invoke-static {p1}, Ll/۫ۨᩳ;->ۗ(Ll/۫ۨᩳ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_a
    move p3, v1

    .line 7980
    :cond_b
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p2

    invoke-virtual {p1, p2, p3}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 7981
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ܰܽ()V

    .line 7983
    :goto_2
    iget-boolean p1, p0, Ll/ܿۨᩳ;->ۗ:Z

    if-eqz p1, :cond_c

    .line 7984
    iput-boolean v3, p0, Ll/ܿۨᩳ;->ۗ:Z

    :cond_c
    const/4 p1, 0x1

    return p1
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 18

    move-object/from16 v0, p0

    .line 8013
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget-object v2, v0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v3

    iget-object v4, v2, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    int-to-float v3, v3

    add-float/2addr v1, v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v1, v3

    .line 8014
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v3, v5

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v3, v5

    .line 8015
    iget-object v5, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v5, v1, v3}, Ll/ۗۤᩳ;->֫(FF)I

    move-result v1

    .line 8016
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۫֫()I

    move-result v3

    .line 8017
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۬֫()I

    move-result v5

    if-le v3, v5, :cond_0

    move/from16 v17, v5

    move v5, v3

    move/from16 v3, v17

    .line 8025
    :cond_0
    iget-object v6, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v6}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v6

    iget-object v7, v0, Ll/ܿۨᩳ;->۫:Ll/ۘܰᩳ;

    const/4 v8, 0x0

    if-nez v6, :cond_1

    iget-boolean v6, v4, Ll/᩺֫ܿ;->ܶۧ:Z

    if-nez v6, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 8026
    invoke-virtual {v7}, Ll/ۘܰᩳ;->ۧ()V

    .line 8027
    invoke-static {v2}, Ll/۫ۨᩳ;->ۘ(Ll/۫ۨᩳ;)Landroid/view/inputmethod/InputMethodManager;

    move-result-object v6

    invoke-virtual {v6, v2, v8, v7}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;ILandroid/os/ResultReceiver;)Z

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 8030
    :goto_0
    iget-object v9, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 372
    iget-boolean v9, v9, Ll/ۗۤᩳ;->ۛ:Z

    const-wide/16 v10, 0x64

    const/4 v12, 0x2

    const-wide/16 v15, 0x1194

    const-wide/16 v13, 0x0

    if-eqz v9, :cond_6

    if-eqz v6, :cond_2

    if-eq v3, v5, :cond_2

    if-gt v3, v1, :cond_2

    if-gt v1, v5, :cond_2

    .line 8036
    invoke-virtual {v7}, Ll/ۘܰᩳ;->֫()I

    move-result v6

    if-ne v6, v12, :cond_2

    .line 8040
    new-instance v1, Ll/ۧۨᩳ;

    invoke-direct {v1, v2}, Ll/ۧۨᩳ;-><init>(Ll/۫ۨᩳ;)V

    invoke-virtual {v2, v1, v10, v11}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_2
    if-ne v3, v5, :cond_4

    if-ne v3, v1, :cond_4

    .line 8042
    iget-object v1, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v1}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v1

    if-nez v1, :cond_5

    iget-boolean v1, v4, Ll/᩺֫ܿ;->ܶۧ:Z

    if-nez v1, :cond_5

    .line 8045
    iget-boolean v1, v0, Ll/ܿۨᩳ;->۬:Z

    if-eqz v1, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    iget-wide v9, v0, Ll/ܿۨᩳ;->ۤ:J

    sub-long/2addr v5, v9

    cmp-long v1, v5, v15

    if-lez v1, :cond_3

    .line 8046
    iget-boolean v1, v0, Ll/ܿۨᩳ;->ܺ֫:Z

    iget-object v3, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v3}, Ll/ۗۤᩳ;->᩵()Z

    move-result v3

    if-ne v1, v3, :cond_5

    const/4 v1, -0x1

    .line 2448
    invoke-virtual {v2, v1}, Ll/۫ۨᩳ;->֨(I)V

    .line 8048
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    iput-wide v5, v0, Ll/ܿۨᩳ;->ۤ:J

    goto :goto_1

    .line 8051
    :cond_3
    iput-wide v13, v0, Ll/ܿۨᩳ;->ۤ:J

    goto :goto_1

    .line 8054
    :cond_4
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۫֫()I

    move-result v3

    invoke-virtual {v2, v3, v1}, Ll/۫ۨᩳ;->ܳ(II)V

    .line 8055
    invoke-static {v2}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-interface {v3, v1}, Ll/᩶᩸ᩳ;->setSelection(I)V

    .line 8056
    invoke-static {v2}, Ll/۫ۨᩳ;->۟֫(Ll/۫ۨᩳ;)V

    .line 8057
    iput-wide v13, v0, Ll/ܿۨᩳ;->ۤ:J

    .line 8059
    :cond_5
    :goto_1
    iget-object v1, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v1}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v1

    if-nez v1, :cond_d

    iget-boolean v1, v4, Ll/᩺֫ܿ;->ܶۧ:Z

    if-nez v1, :cond_d

    .line 1330
    invoke-virtual {v2, v8}, Ll/۫ۨᩳ;->֫(Z)V

    goto/16 :goto_4

    :cond_6
    if-ne v3, v5, :cond_8

    if-ne v1, v3, :cond_8

    .line 8063
    iget-boolean v1, v0, Ll/ܿۨᩳ;->۬:Z

    if-eqz v1, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, v0, Ll/ܿۨᩳ;->ۤ:J

    sub-long/2addr v3, v5

    cmp-long v1, v3, v15

    if-lez v1, :cond_7

    .line 8064
    iget-boolean v1, v0, Ll/ܿۨᩳ;->ܺ֫:Z

    iget-object v3, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v3}, Ll/ۗۤᩳ;->᩵()Z

    move-result v3

    if-ne v1, v3, :cond_d

    const/4 v1, -0x1

    .line 2448
    invoke-virtual {v2, v1}, Ll/۫ۨᩳ;->֨(I)V

    .line 8066
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v0, Ll/ܿۨᩳ;->ۤ:J

    goto :goto_4

    .line 8069
    :cond_7
    iput-wide v13, v0, Ll/ܿۨᩳ;->ۤ:J

    goto :goto_4

    :cond_8
    if-gt v3, v1, :cond_c

    if-gt v1, v5, :cond_c

    .line 8070
    iget-boolean v3, v4, Ll/᩺֫ܿ;->ۤۧ:Z

    if-nez v3, :cond_9

    goto :goto_3

    :cond_9
    if-eqz v6, :cond_b

    .line 8079
    invoke-virtual {v7}, Ll/ۘܰᩳ;->֫()I

    move-result v1

    if-eq v1, v12, :cond_a

    goto :goto_2

    .line 8082
    :cond_a
    new-instance v1, Ll/ۧۨᩳ;

    invoke-direct {v1, v2}, Ll/ۧۨᩳ;-><init>(Ll/۫ۨᩳ;)V

    invoke-virtual {v2, v1, v10, v11}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_4

    :cond_b
    :goto_2
    const/4 v1, -0x1

    .line 2448
    invoke-virtual {v2, v1}, Ll/۫ۨᩳ;->֨(I)V

    goto :goto_4

    .line 8071
    :cond_c
    :goto_3
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۫֫()I

    move-result v3

    invoke-virtual {v2, v3, v1}, Ll/۫ۨᩳ;->ܳ(II)V

    .line 8072
    invoke-static {v2}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-interface {v3, v1}, Ll/᩶᩸ᩳ;->setSelection(I)V

    .line 8073
    invoke-static {v2}, Ll/۫ۨᩳ;->۟֫(Ll/۫ۨᩳ;)V

    .line 8074
    iput-wide v13, v0, Ll/ܿۨᩳ;->ۤ:J

    .line 8075
    iget-object v3, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v3}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v3

    if-nez v3, :cond_d

    iget-boolean v3, v4, Ll/᩺֫ܿ;->ܶۧ:Z

    if-nez v3, :cond_d

    .line 1357
    invoke-virtual {v2, v1, v8}, Ll/۫ۨᩳ;->֫(IZ)Z

    .line 8085
    :cond_d
    :goto_4
    iget-object v1, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v1}, Ll/ۗۤᩳ;->᩵()Z

    move-result v1

    iput-boolean v1, v0, Ll/ܿۨᩳ;->ܺ֫:Z

    .line 8086
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Ll/۫ۨᩳ;->ܳܽ:J

    .line 8087
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۟ܽ()V

    .line 8088
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    const/4 v1, 0x1

    return v1
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 8432
    iget-object v2, v1, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    iget-object v3, v2, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    .line 8434
    invoke-static {v2}, Ll/۫ۨᩳ;->ۙ֫(Ll/۫ۨᩳ;)V

    .line 8435
    invoke-static {v2, v5}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ll/ۘۨᩳ;)V

    .line 8437
    :cond_0
    invoke-static {v2}, Ll/۫ۨᩳ;->᩵(Ll/۫ۨᩳ;)Ll/ۘۨᩳ;

    move-result-object v6

    if-nez v6, :cond_1

    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩶ۧ()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 8438
    invoke-static {v2}, Ll/۫ۨᩳ;->ᩴ(Ll/۫ۨᩳ;)Ll/ۘۨᩳ;

    move-result-object v6

    invoke-static {v2, v6}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ll/ۘۨᩳ;)V

    .line 8440
    :cond_1
    invoke-static {v2}, Ll/۫ۨᩳ;->᩵(Ll/۫ۨᩳ;)Ll/ۘۨᩳ;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v8, 0x1

    if-eqz v6, :cond_5

    .line 8442
    :try_start_0
    invoke-static {v2}, Ll/۫ۨᩳ;->᩵(Ll/۫ۨᩳ;)Ll/ۘۨᩳ;

    move-result-object v3

    invoke-virtual {v3, v0}, Ll/ۘۨᩳ;->֫(Landroid/view/MotionEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v4, v8, :cond_2

    if-ne v4, v7, :cond_42

    .line 8445
    :cond_2
    invoke-static {v2, v5}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ll/ۘۨᩳ;)V

    return v8

    :catchall_0
    move-exception v0

    if-eq v4, v8, :cond_3

    if-ne v4, v7, :cond_4

    :cond_3
    invoke-static {v2, v5}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ll/ۘۨᩳ;)V

    .line 8447
    :cond_4
    throw v0

    .line 8402
    :cond_5
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-nez v4, :cond_9

    .line 8404
    invoke-static {v2}, Ll/۫ۨᩳ;->᩶֫(Ll/۫ۨᩳ;)V

    .line 8417
    invoke-static/range {p2 .. p2}, Ll/۫ۨᩳ;->֫(Landroid/view/MotionEvent;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v4

    and-int/2addr v4, v8

    if-nez v4, :cond_6

    goto :goto_0

    .line 8420
    :cond_6
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v4, v6

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v4, v6

    .line 8421
    iget-object v6, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    invoke-virtual {v6, v9}, Ll/ۗۤᩳ;->ۧ(F)F

    move-result v6

    .line 8423
    iget-object v9, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 647
    iget-boolean v10, v9, Ll/ۗۤᩳ;->᩵:Z

    if-eqz v10, :cond_7

    .line 639
    iget-object v9, v9, Ll/ۗۤᩳ;->ۘ:Ll/ܳ᩸ۡ;

    .line 8424
    invoke-virtual {v9, v4, v6}, Ll/ܳ᩸ۡ;->֫(FF)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_7
    iget-object v9, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 651
    iget-boolean v10, v9, Ll/ۗۤᩳ;->ᩴ:Z

    if-eqz v10, :cond_8

    .line 643
    iget-object v9, v9, Ll/ۗۤᩳ;->ۖ:Ll/ܳ᩸ۡ;

    .line 8426
    invoke-virtual {v9, v4, v6}, Ll/ܳ᩸ۡ;->֫(FF)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_1

    .line 8406
    :cond_8
    :goto_0
    invoke-static {v2}, Ll/۫ۨᩳ;->ܶ֫(Ll/۫ۨᩳ;)V

    goto :goto_1

    :cond_9
    if-ne v4, v7, :cond_a

    .line 8409
    invoke-static {v2}, Ll/۫ۨᩳ;->᩸֫(Ll/۫ۨᩳ;)V

    .line 8450
    :cond_a
    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    move-result v4

    if-nez v4, :cond_b

    .line 8451
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-ne v4, v8, :cond_b

    invoke-virtual {v2}, Landroid/view/View;->isPressed()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 8452
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 8370
    :cond_b
    invoke-static/range {p2 .. p2}, Ll/۫ۨᩳ;->֫(Landroid/view/MotionEvent;)Z

    move-result v4

    const/4 v6, 0x2

    const/4 v9, 0x0

    if-nez v4, :cond_c

    goto :goto_2

    .line 8373
    :cond_c
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    .line 8374
    invoke-static {v2}, Ll/۫ۨᩳ;->ۛ(Ll/۫ۨᩳ;)Z

    move-result v10

    if-eqz v10, :cond_f

    .line 8375
    invoke-static {v2}, Ll/۫ۨᩳ;->ۚ֫(Ll/۫ۨᩳ;)V

    if-nez v4, :cond_d

    .line 8377
    invoke-virtual {v2, v8}, Landroid/view/View;->setPressed(Z)V

    return v8

    :cond_d
    if-eq v4, v8, :cond_e

    if-ne v4, v7, :cond_42

    .line 8379
    :cond_e
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8380
    invoke-direct {v1, v9}, Ll/ܿۨᩳ;->֫(Z)V

    .line 8381
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩶ܽ()V

    .line 8382
    invoke-static {v2}, Ll/۫ۨᩳ;->᩹֫(Ll/۫ۨᩳ;)V

    return v8

    :cond_f
    if-nez v4, :cond_10

    .line 8387
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v4

    and-int/2addr v4, v6

    if-eqz v4, :cond_10

    .line 8388
    invoke-static {v2}, Ll/۫ۨᩳ;->ܽۧ(Ll/۫ۨᩳ;)V

    .line 8389
    invoke-static {v2}, Ll/۫ۨᩳ;->ۚ֫(Ll/۫ۨᩳ;)V

    .line 8390
    invoke-virtual {v2, v8}, Landroid/view/View;->setPressed(Z)V

    .line 8391
    invoke-static {v2, v0}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Landroid/view/MotionEvent;)V

    return v8

    .line 8458
    :cond_10
    :goto_2
    iget-boolean v4, v1, Ll/ܿۨᩳ;->ۧ֫:Z

    if-eqz v4, :cond_14

    .line 8249
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-eq v4, v8, :cond_13

    if-eq v4, v6, :cond_12

    if-eq v4, v7, :cond_11

    goto :goto_3

    .line 8347
    :cond_11
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8348
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩶ܽ()V

    .line 8349
    invoke-direct/range {p0 .. p0}, Ll/ܿۨᩳ;->֫()V

    return v8

    .line 8251
    :cond_12
    invoke-direct {v1, v0}, Ll/ܿۨᩳ;->֫(Landroid/view/MotionEvent;)V

    return v8

    .line 8337
    :cond_13
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8338
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩶ܽ()V

    .line 8339
    invoke-direct/range {p0 .. p0}, Ll/ܿۨᩳ;->֫()V

    return v8

    .line 8461
    :cond_14
    :goto_3
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩻ۧ()Ll/᩺ۛᩳ;

    move-result-object v4

    if-eqz v4, :cond_15

    .line 9253
    iget-object v4, v4, Ll/᩺ۛᩳ;->֫:[Ll/ۡ֫ܿ;

    aget-object v10, v4, v9

    invoke-virtual {v10}, Ll/ۡ֫ܿ;->ᩳ()Z

    move-result v10

    if-nez v10, :cond_42

    aget-object v10, v4, v8

    .line 9254
    invoke-virtual {v10}, Ll/ۡ֫ܿ;->ᩳ()Z

    move-result v10

    if-nez v10, :cond_42

    aget-object v4, v4, v6

    .line 9255
    invoke-virtual {v4}, Ll/ۡ֫ܿ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_15

    goto/16 :goto_f

    .line 8200
    :cond_15
    iget-boolean v4, v1, Ll/ܿۨᩳ;->ܽ֫:Z

    if-nez v4, :cond_16

    goto/16 :goto_4

    .line 8203
    :cond_16
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-eq v4, v8, :cond_1c

    if-eq v4, v6, :cond_17

    if-eq v4, v7, :cond_1c

    goto/16 :goto_4

    .line 8205
    :cond_17
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    iget v10, v1, Ll/ܿۨᩳ;->ۨ:F

    sub-float/2addr v4, v10

    .line 8206
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    iget v11, v1, Ll/ܿۨᩳ;->᩺:F

    sub-float/2addr v10, v11

    .line 8207
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v11, v1, Ll/ܿۨᩳ;->ۛ:I

    int-to-float v11, v11

    cmpg-float v4, v4, v11

    if-gtz v4, :cond_18

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v10, v1, Ll/ܿۨᩳ;->ۛ:I

    int-to-float v10, v10

    cmpg-float v4, v4, v10

    if-gtz v4, :cond_18

    goto/16 :goto_4

    .line 8226
    :cond_18
    iput-boolean v9, v1, Ll/ܿۨᩳ;->ܽ֫:Z

    .line 8227
    iput-boolean v8, v1, Ll/ܿۨᩳ;->ۧ֫:Z

    .line 8228
    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    move-result v4

    if-nez v4, :cond_19

    .line 8229
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 8231
    :cond_19
    iget-boolean v4, v1, Ll/ܿۨᩳ;->֫֫:Z

    if-nez v4, :cond_1a

    .line 8232
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۫֫()I

    move-result v4

    iget v5, v1, Ll/ܿۨᩳ;->ܰ:I

    invoke-virtual {v2, v4, v5}, Ll/۫ۨᩳ;->ܳ(II)V

    .line 8233
    invoke-static {v2}, Ll/۫ۨᩳ;->۟֫(Ll/۫ۨᩳ;)V

    .line 8234
    iput-boolean v8, v1, Ll/ܿۨᩳ;->֫֫:Z

    .line 8278
    :cond_1a
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v5

    add-float/2addr v5, v4

    iget v4, v1, Ll/ܿۨᩳ;->᩺:F

    invoke-static {v5, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    iput v4, v2, Ll/۫ۨᩳ;->۠֫:F

    .line 8279
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    sub-float/2addr v4, v3

    iget v3, v1, Ll/ܿۨᩳ;->᩺:F

    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    iput v3, v2, Ll/۫ۨᩳ;->ۚ֫:F

    .line 8280
    iput v9, v2, Ll/۫ۨᩳ;->֨֫:I

    const-wide/16 v3, 0x0

    .line 8168
    iput-wide v3, v2, Ll/۫ۨᩳ;->ܳܽ:J

    .line 8169
    invoke-static {v2}, Ll/۫ۨᩳ;->ۘ֫(Ll/۫ۨᩳ;)Ll/᩺ۛᩳ;

    move-result-object v3

    if-eqz v3, :cond_1b

    .line 8171
    invoke-virtual {v3}, Ll/᩺ۛᩳ;->֫()V

    .line 8173
    :cond_1b
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 8238
    invoke-direct {v1, v8}, Ll/ܿۨᩳ;->֫(Z)V

    .line 8239
    iput-boolean v8, v1, Ll/ܿۨᩳ;->۟:Z

    .line 8240
    invoke-static {v2}, Ll/۫ۨᩳ;->ܺ(Ll/۫ۨᩳ;)Ll/֨ۛ;

    move-result-object v2

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    .line 8241
    invoke-direct {v1, v0}, Ll/ܿۨᩳ;->֫(Landroid/view/MotionEvent;)V

    return v8

    .line 8215
    :cond_1c
    invoke-direct/range {p0 .. p0}, Ll/ܿۨᩳ;->֫()V

    .line 8468
    :goto_4
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    and-int/lit16 v4, v4, 0xff

    const/high16 v10, 0x40000000    # 2.0f

    if-eqz v4, :cond_4a

    if-eq v4, v8, :cond_3e

    const/4 v11, 0x6

    if-eq v4, v6, :cond_25

    if-eq v4, v7, :cond_21

    const/4 v5, 0x5

    if-eq v4, v5, :cond_1f

    if-eq v4, v11, :cond_1d

    goto/16 :goto_14

    .line 8488
    :cond_1d
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const v4, 0xff00

    and-int/2addr v3, v4

    ushr-int/lit8 v3, v3, 0x8

    .line 8489
    invoke-static {v2}, Ll/۫ۨᩳ;->ۨ(Ll/۫ۨᩳ;)Z

    move-result v4

    if-eqz v4, :cond_1e

    iget v4, v1, Ll/ܿۨᩳ;->ۜ֫:I

    if-eq v3, v4, :cond_1e

    .line 8490
    invoke-static {v2, v9}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;Z)V

    .line 8492
    :cond_1e
    iget v3, v1, Ll/ܿۨᩳ;->᩻֫:I

    sub-int/2addr v3, v8

    iput v3, v1, Ll/ܿۨᩳ;->᩻֫:I

    goto/16 :goto_14

    .line 8470
    :cond_1f
    iget v4, v1, Ll/ܿۨᩳ;->᩻֫:I

    add-int/2addr v4, v8

    iput v4, v1, Ll/ܿۨᩳ;->᩻֫:I

    .line 8471
    invoke-static {v2}, Ll/۫ۨᩳ;->ۨ(Ll/۫ۨᩳ;)Z

    move-result v4

    if-eqz v4, :cond_20

    .line 8472
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, v1, Ll/ܿۨᩳ;->ۜ֫:I

    .line 8473
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    iput v2, v1, Ll/ܿۨᩳ;->᩶:F

    .line 8474
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iput v0, v1, Ll/ܿۨᩳ;->ۙ:F

    return v8

    .line 8478
    :cond_20
    iget-boolean v3, v3, Ll/᩺֫ܿ;->֡ۧ:Z

    if-eqz v3, :cond_57

    iget-boolean v3, v1, Ll/ܿۨᩳ;->᩵֫:Z

    if-nez v3, :cond_57

    .line 8479
    invoke-direct {v1, v0}, Ll/ܿۨᩳ;->ᩳ(Landroid/view/MotionEvent;)V

    .line 8480
    invoke-static {v2}, Ll/۫ۨᩳ;->ᩴ֫(Ll/۫ۨᩳ;)Ll/۫ۨᩳ;

    move-result-object v3

    if-eqz v3, :cond_57

    .line 8482
    invoke-static {v3}, Ll/۫ۨᩳ;->ۖ(Ll/۫ۨᩳ;)Ll/ܿۨᩳ;

    move-result-object v3

    invoke-direct {v3, v0}, Ll/ܿۨᩳ;->ᩳ(Landroid/view/MotionEvent;)V

    .line 8483
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    goto/16 :goto_14

    .line 8679
    :cond_21
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8680
    invoke-direct {v1, v9}, Ll/ܿۨᩳ;->֫(Z)V

    .line 8681
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩶ܽ()V

    .line 8682
    iget-boolean v3, v1, Ll/ܿۨᩳ;->᩵֫:Z

    if-eqz v3, :cond_22

    .line 8683
    invoke-direct/range {p0 .. p0}, Ll/ܿۨᩳ;->ۧ()V

    .line 8684
    invoke-static {v2}, Ll/۫ۨᩳ;->ᩴ֫(Ll/۫ۨᩳ;)Ll/۫ۨᩳ;

    move-result-object v0

    if-eqz v0, :cond_42

    .line 8686
    invoke-static {v0}, Ll/۫ۨᩳ;->ۖ(Ll/۫ۨᩳ;)Ll/ܿۨᩳ;

    move-result-object v3

    invoke-direct {v3}, Ll/ܿۨᩳ;->ۧ()V

    .line 8687
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 8688
    invoke-static {v2}, Ll/۫ۨᩳ;->ܰ(Ll/۫ۨᩳ;)Ll/֨۟ᩳ;

    move-result-object v3

    if-eqz v3, :cond_42

    .line 8690
    new-instance v4, Ll/۟ۛᩳ;

    invoke-direct {v4, v1, v0, v3}, Ll/۟ۛᩳ;-><init>(Ll/ܿۨᩳ;Ll/۫ۨᩳ;Ll/֨۟ᩳ;)V

    invoke-static {v2, v4}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ljava/lang/Runnable;)V

    return v8

    .line 8700
    :cond_22
    invoke-static {v2}, Ll/۫ۨᩳ;->᩻֫(Ll/۫ۨᩳ;)Z

    move-result v3

    if-nez v3, :cond_24

    invoke-static {v2}, Ll/۫ۨᩳ;->ܳ֫(Ll/۫ۨᩳ;)Z

    move-result v3

    if-nez v3, :cond_24

    invoke-static {v2}, Ll/۫ۨᩳ;->ۨ(Ll/۫ۨᩳ;)Z

    move-result v3

    if-nez v3, :cond_24

    invoke-static {v2}, Ll/۫ۨᩳ;->ۜ֫(Ll/۫ۨᩳ;)Z

    move-result v3

    if-nez v3, :cond_24

    invoke-static {v2}, Ll/۫ۨᩳ;->֡(Ll/۫ۨᩳ;)Z

    move-result v3

    if-eqz v3, :cond_23

    goto :goto_5

    .line 8706
    :cond_23
    invoke-static {v2}, Ll/۫ۨᩳ;->᩺֫(Ll/۫ۨᩳ;)V

    goto/16 :goto_14

    .line 8701
    :cond_24
    :goto_5
    invoke-static {v2}, Ll/۫ۨᩳ;->۬֫(Ll/۫ۨᩳ;)V

    .line 8702
    invoke-static {v2, v9}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Z)V

    invoke-static {v2, v9}, Ll/۫ۨᩳ;->ܳ(Ll/۫ۨᩳ;Z)V

    invoke-static {v2, v9}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;Z)V

    invoke-static {v2, v9}, Ll/۫ۨᩳ;->ᩳ(Ll/۫ۨᩳ;Z)V

    invoke-static {v2, v9}, Ll/۫ۨᩳ;->ܿ(Ll/۫ۨᩳ;Z)V

    .line 8703
    invoke-static {v2}, Ll/۫ۨᩳ;->ۗ֫(Ll/۫ۨᩳ;)V

    return v8

    .line 8576
    :cond_25
    invoke-direct {v1, v0}, Ll/ܿۨᩳ;->ܿ(Landroid/view/MotionEvent;)V

    .line 8577
    iget v4, v1, Ll/ܿۨᩳ;->᩻֫:I

    if-ne v4, v8, :cond_27

    .line 8579
    invoke-static {v2}, Ll/۫ۨᩳ;->ۨ(Ll/۫ۨᩳ;)Z

    move-result v4

    if-eqz v4, :cond_26

    .line 8580
    iget v4, v1, Ll/ܿۨᩳ;->᩶:F

    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    sub-float/2addr v4, v6

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v4, v6

    .line 8581
    iget v6, v1, Ll/ܿۨᩳ;->ۙ:F

    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    sub-float/2addr v6, v7

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    int-to-float v7, v7

    sub-float/2addr v6, v7

    .line 8582
    invoke-static {v2}, Ll/۫ۨᩳ;->ۖ(Ll/۫ۨᩳ;)Ll/ܿۨᩳ;

    move-result-object v7

    invoke-virtual {v7, v5, v5, v4, v6}, Ll/ܿۨᩳ;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    .line 8583
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    iput v4, v1, Ll/ܿۨᩳ;->᩶:F

    .line 8584
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    iput v4, v1, Ll/ܿۨᩳ;->ۙ:F

    goto :goto_6

    .line 8585
    :cond_26
    iget-boolean v4, v1, Ll/ܿۨᩳ;->᩵֫:Z

    if-eqz v4, :cond_27

    .line 8586
    invoke-direct {v1, v0}, Ll/ܿۨᩳ;->ۧ(Landroid/view/MotionEvent;)V

    .line 8587
    invoke-static {v2}, Ll/۫ۨᩳ;->ᩴ֫(Ll/۫ۨᩳ;)Ll/۫ۨᩳ;

    move-result-object v3

    if-eqz v3, :cond_42

    .line 8589
    invoke-static {v3}, Ll/۫ۨᩳ;->ۖ(Ll/۫ۨᩳ;)Ll/ܿۨᩳ;

    move-result-object v3

    invoke-direct {v3, v0}, Ll/ܿۨᩳ;->ۧ(Landroid/view/MotionEvent;)V

    .line 8590
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return v8

    .line 8595
    :cond_27
    :goto_6
    invoke-static {v2}, Ll/۫ۨᩳ;->ۜ֫(Ll/۫ۨᩳ;)Z

    move-result v4

    if-nez v4, :cond_30

    invoke-static {v2}, Ll/۫ۨᩳ;->ۨ(Ll/۫ۨᩳ;)Z

    move-result v4

    if-nez v4, :cond_30

    invoke-static {v2}, Ll/۫ۨᩳ;->֡(Ll/۫ۨᩳ;)Z

    move-result v4

    if-eqz v4, :cond_28

    goto/16 :goto_a

    .line 8646
    :cond_28
    invoke-static {v2}, Ll/۫ۨᩳ;->᩻֫(Ll/۫ۨᩳ;)Z

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    if-eqz v4, :cond_2b

    .line 8647
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v0, v4

    iget v4, v1, Ll/ܿۨᩳ;->ܿ֫:F

    add-float/2addr v0, v4

    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩻֫()I

    move-result v4

    iget v3, v3, Ll/᩺֫ܿ;->᩶֫:I

    sub-int/2addr v4, v3

    int-to-float v3, v4

    div-float/2addr v0, v3

    cmpg-float v3, v0, v6

    if-gez v3, :cond_29

    const/4 v5, 0x0

    goto :goto_7

    :cond_29
    cmpl-float v3, v0, v5

    if-lez v3, :cond_2a

    goto :goto_7

    :cond_2a
    move v5, v0

    .line 8652
    :goto_7
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩸֫()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v5

    float-to-int v0, v0

    .line 8654
    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v3

    if-eq v0, v3, :cond_42

    .line 8655
    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v3

    invoke-virtual {v2, v3, v0}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 8656
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;J)V

    .line 8657
    invoke-static {v2}, Ll/۫ۨᩳ;->ܶ(Ll/۫ۨᩳ;)Ll/ܰۛᩳ;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/os/Handler;->removeMessages(I)V

    .line 8658
    invoke-static {v2}, Ll/۫ۨᩳ;->ܶ(Ll/۫ۨᩳ;)Ll/ܰۛᩳ;

    move-result-object v0

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v11, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return v8

    .line 8661
    :cond_2b
    invoke-static {v2}, Ll/۫ۨᩳ;->ܳ֫(Ll/۫ۨᩳ;)Z

    move-result v4

    if-eqz v4, :cond_57

    .line 8662
    iget-boolean v4, v3, Ll/᩺֫ܿ;->۫ۧ:Z

    if-eqz v4, :cond_2c

    iget-boolean v4, v3, Ll/᩺֫ܿ;->۬֫:Z

    if-eqz v4, :cond_2c

    iget-object v4, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget v4, v4, Ll/ۗۤᩳ;->ۙ:I

    goto :goto_8

    :cond_2c
    const/4 v4, 0x0

    :goto_8
    if-eqz v4, :cond_2d

    .line 8663
    iget-boolean v7, v3, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v7, :cond_2d

    move v9, v4

    .line 8664
    :cond_2d
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    int-to-float v7, v9

    sub-float/2addr v0, v7

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    int-to-float v7, v7

    sub-float/2addr v0, v7

    iget v7, v1, Ll/ܿۨᩳ;->ᩳ֫:F

    add-float/2addr v0, v7

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v7

    sub-int/2addr v7, v4

    iget v3, v3, Ll/᩺֫ܿ;->᩶֫:I

    sub-int/2addr v7, v3

    int-to-float v3, v7

    div-float/2addr v0, v3

    cmpg-float v3, v0, v6

    if-gez v3, :cond_2e

    const/4 v5, 0x0

    goto :goto_9

    :cond_2e
    cmpl-float v3, v0, v5

    if-lez v3, :cond_2f

    goto :goto_9

    :cond_2f
    move v5, v0

    .line 8669
    :goto_9
    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܶ֫()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v5

    float-to-int v0, v0

    .line 8671
    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v3

    if-eq v0, v3, :cond_42

    .line 8672
    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Ll/۫ۨᩳ;->scrollTo(II)V

    return v8

    .line 8596
    :cond_30
    :goto_a
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    .line 8597
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v5, v6

    .line 8598
    iget-boolean v6, v1, Ll/ܿۨᩳ;->ۖ֫:Z

    if-nez v6, :cond_32

    .line 8599
    iget v6, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v6, v6

    sub-float v6, v4, v6

    float-to-int v6, v6

    .line 8600
    iget v7, v1, Ll/ܿۨᩳ;->᩹:I

    int-to-float v7, v7

    sub-float v7, v5, v7

    float-to-int v7, v7

    .line 8601
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    iget v11, v1, Ll/ܿۨᩳ;->ۛ:I

    if-gt v6, v11, :cond_31

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v6

    iget v7, v1, Ll/ܿۨᩳ;->ۛ:I

    if-le v6, v7, :cond_42

    .line 8602
    :cond_31
    iput-boolean v8, v1, Ll/ܿۨᩳ;->ۖ֫:Z

    .line 8605
    :cond_32
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    .line 8606
    iget v6, v2, Ll/۫ۨᩳ;->֨֫:I

    if-nez v6, :cond_33

    const/4 v6, 0x1

    goto :goto_b

    :cond_33
    const/4 v6, 0x0

    .line 8607
    :goto_b
    iget v7, v2, Ll/۫ۨᩳ;->۠֫:F

    cmpg-float v11, v0, v7

    if-gez v11, :cond_35

    sub-float/2addr v7, v0

    float-to-int v0, v7

    .line 8608
    invoke-static {v0}, Ll/۫ۨᩳ;->۠(I)I

    move-result v0

    neg-int v0, v0

    iput v0, v2, Ll/۫ۨᩳ;->֨֫:I

    if-eqz v6, :cond_34

    .line 8610
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    iput-wide v6, v2, Ll/۫ۨᩳ;->ۡۧ:J

    .line 8612
    :cond_34
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_c

    .line 8613
    :cond_35
    iget v7, v2, Ll/۫ۨᩳ;->ۚ֫:F

    cmpl-float v11, v0, v7

    if-lez v11, :cond_37

    sub-float/2addr v0, v7

    float-to-int v0, v0

    .line 8614
    invoke-static {v0}, Ll/۫ۨᩳ;->۠(I)I

    move-result v0

    iput v0, v2, Ll/۫ۨᩳ;->֨֫:I

    if-eqz v6, :cond_36

    .line 8616
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    iput-wide v6, v2, Ll/۫ۨᩳ;->ۡۧ:J

    .line 8618
    :cond_36
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_c

    .line 8620
    :cond_37
    iput v9, v2, Ll/۫ۨᩳ;->֨֫:I

    .line 8622
    :goto_c
    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v0

    div-float/2addr v0, v10

    .line 8623
    iget v3, v2, Ll/۫ۨᩳ;->ۚ֫:F

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v3, v6

    .line 8624
    invoke-static {v2}, Ll/۫ۨᩳ;->֡(Ll/۫ۨᩳ;)Z

    move-result v6

    if-eqz v6, :cond_3a

    cmpg-float v6, v5, v0

    if-gez v6, :cond_38

    move v5, v0

    goto :goto_d

    :cond_38
    cmpl-float v0, v5, v3

    if-lez v0, :cond_39

    move v5, v3

    .line 8631
    :cond_39
    :goto_d
    invoke-virtual {v2, v4, v5}, Ll/۫ۨᩳ;->ۧ(FF)V

    return v8

    .line 8633
    :cond_3a
    iget v6, v1, Ll/ܿۨᩳ;->ܿ֫:F

    add-float/2addr v5, v6

    cmpg-float v6, v5, v0

    if-gez v6, :cond_3b

    goto :goto_e

    :cond_3b
    cmpl-float v0, v5, v3

    if-lez v0, :cond_3c

    move v0, v3

    goto :goto_e

    :cond_3c
    move v0, v5

    .line 8639
    :goto_e
    invoke-static {v2}, Ll/۫ۨᩳ;->ۜ֫(Ll/۫ۨᩳ;)Z

    move-result v3

    if-eqz v3, :cond_3d

    .line 8640
    iget v3, v1, Ll/ܿۨᩳ;->ᩳ֫:F

    add-float/2addr v4, v3

    invoke-virtual {v2, v4, v0}, Ll/۫ۨᩳ;->ᩳ(FF)V

    return v8

    .line 8642
    :cond_3d
    iget v3, v1, Ll/ܿۨᩳ;->ᩳ֫:F

    add-float/2addr v4, v3

    invoke-virtual {v2, v4, v0}, Ll/۫ۨᩳ;->ܽ(FF)V

    return v8

    .line 8709
    :cond_3e
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8710
    invoke-direct {v1, v9}, Ll/ܿۨᩳ;->֫(Z)V

    .line 8711
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩶ܽ()V

    .line 8712
    iget-boolean v3, v1, Ll/ܿۨᩳ;->᩵֫:Z

    if-eqz v3, :cond_3f

    .line 8713
    invoke-direct/range {p0 .. p0}, Ll/ܿۨᩳ;->ۧ()V

    .line 8714
    invoke-static {v2}, Ll/۫ۨᩳ;->ᩴ֫(Ll/۫ۨᩳ;)Ll/۫ۨᩳ;

    move-result-object v0

    if-eqz v0, :cond_42

    .line 8716
    invoke-static {v0}, Ll/۫ۨᩳ;->ۖ(Ll/۫ۨᩳ;)Ll/ܿۨᩳ;

    move-result-object v3

    invoke-direct {v3}, Ll/ܿۨᩳ;->ۧ()V

    .line 8717
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 8718
    invoke-static {v2}, Ll/۫ۨᩳ;->ܰ(Ll/۫ۨᩳ;)Ll/֨۟ᩳ;

    move-result-object v3

    if-eqz v3, :cond_42

    .line 8720
    new-instance v4, Ll/֫ۨᩳ;

    invoke-direct {v4, v1, v0, v3}, Ll/֫ۨᩳ;-><init>(Ll/ܿۨᩳ;Ll/۫ۨᩳ;Ll/֨۟ᩳ;)V

    invoke-static {v2, v4}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ljava/lang/Runnable;)V

    return v8

    .line 8730
    :cond_3f
    invoke-static {v2}, Ll/۫ۨᩳ;->ۜ֫(Ll/۫ۨᩳ;)Z

    move-result v3

    if-nez v3, :cond_44

    invoke-static {v2}, Ll/۫ۨᩳ;->ۨ(Ll/۫ۨᩳ;)Z

    move-result v3

    if-nez v3, :cond_44

    invoke-static {v2}, Ll/۫ۨᩳ;->֡(Ll/۫ۨᩳ;)Z

    move-result v3

    if-eqz v3, :cond_40

    goto :goto_10

    .line 8748
    :cond_40
    invoke-static {v2}, Ll/۫ۨᩳ;->᩻֫(Ll/۫ۨᩳ;)Z

    move-result v3

    if-eqz v3, :cond_41

    .line 8749
    invoke-static {v2}, Ll/۫ۨᩳ;->۬֫(Ll/۫ۨᩳ;)V

    .line 8750
    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܰܽ()V

    .line 8751
    invoke-static/range {p2 .. p2}, Ll/۫ۨᩳ;->֫(Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_42

    .line 8752
    invoke-static {v2, v8, v0}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;ILandroid/view/MotionEvent;)V

    return v8

    .line 8756
    :cond_41
    invoke-static {v2}, Ll/۫ۨᩳ;->ܳ֫(Ll/۫ۨᩳ;)Z

    move-result v3

    if-eqz v3, :cond_43

    .line 8757
    invoke-static {v2, v9}, Ll/۫ۨᩳ;->ᩳ(Ll/۫ۨᩳ;Z)V

    .line 8758
    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۨܽ()V

    .line 8759
    invoke-static/range {p2 .. p2}, Ll/۫ۨᩳ;->֫(Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_42

    .line 8760
    invoke-static {v2, v6, v0}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;ILandroid/view/MotionEvent;)V

    :cond_42
    :goto_f
    return v8

    .line 8764
    :cond_43
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Ll/۫ۨᩳ;->ܳܽ:J

    .line 8765
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 8766
    invoke-static {v2}, Ll/۫ۨᩳ;->᩺֫(Ll/۫ۨᩳ;)V

    goto/16 :goto_14

    .line 8731
    :cond_44
    :goto_10
    invoke-static {v2}, Ll/۫ۨᩳ;->ۗ֫(Ll/۫ۨᩳ;)V

    .line 8732
    invoke-static {v2}, Ll/۫ۨᩳ;->ۜ֫(Ll/۫ۨᩳ;)Z

    move-result v0

    if-eqz v0, :cond_45

    const/4 v0, -0x1

    .line 2448
    invoke-virtual {v2, v0}, Ll/۫ۨᩳ;->֨(I)V

    goto :goto_12

    .line 8734
    :cond_45
    invoke-static {v2}, Ll/۫ۨᩳ;->ۨ(Ll/۫ۨᩳ;)Z

    move-result v0

    if-nez v0, :cond_46

    invoke-static {v2}, Ll/۫ۨᩳ;->֡(Ll/۫ۨᩳ;)Z

    move-result v0

    if-eqz v0, :cond_49

    .line 8735
    :cond_46
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۫֫()I

    move-result v0

    .line 8736
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۬֫()I

    move-result v3

    if-le v0, v3, :cond_47

    move/from16 v17, v3

    move v3, v0

    move/from16 v0, v17

    .line 8742
    :cond_47
    invoke-static {v2}, Ll/۫ۨᩳ;->᩺(Ll/۫ۨᩳ;)Z

    move-result v4

    if-eqz v4, :cond_48

    goto :goto_11

    :cond_48
    move v0, v3

    :goto_11
    invoke-virtual {v2, v0}, Ll/۫ۨᩳ;->֨(I)V

    .line 8744
    :cond_49
    :goto_12
    invoke-static {v2, v9}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Z)V

    invoke-static {v2, v9}, Ll/۫ۨᩳ;->ܳ(Ll/۫ۨᩳ;Z)V

    invoke-static {v2, v9}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;Z)V

    .line 8745
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Ll/۫ۨᩳ;->ܳܽ:J

    return v8

    .line 8495
    :cond_4a
    invoke-virtual {v2, v8}, Landroid/view/View;->setPressed(Z)V

    .line 8496
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۫()V

    .line 8497
    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    move-result v4

    if-nez v4, :cond_4b

    .line 8498
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 8500
    :cond_4b
    iput-boolean v8, v1, Ll/ܿۨᩳ;->ۗ:Z

    .line 8501
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩸ܽ()Z

    move-result v4

    if-eqz v4, :cond_4c

    .line 8502
    invoke-direct {v1, v8}, Ll/ܿۨᩳ;->֫(Z)V

    .line 8504
    :cond_4c
    iput-boolean v9, v1, Ll/ܿۨᩳ;->᩵֫:Z

    .line 8505
    iput v9, v1, Ll/ܿۨᩳ;->᩻֫:I

    .line 8506
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v5, v4

    iput v5, v1, Ll/ܿۨᩳ;->᩸:I

    .line 8507
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v5, v4

    iput v5, v1, Ll/ܿۨᩳ;->᩹:I

    .line 8508
    iput-boolean v9, v1, Ll/ܿۨᩳ;->ۖ֫:Z

    .line 8509
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۫֫()I

    move-result v4

    .line 8510
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۬֫()I

    move-result v5

    if-le v4, v5, :cond_4d

    move/from16 v17, v5

    move v5, v4

    move/from16 v4, v17

    .line 8516
    :cond_4d
    iget-object v6, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    invoke-virtual {v6, v7}, Ll/ۗۤᩳ;->ۧ(F)F

    move-result v6

    .line 8519
    iget-object v7, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 647
    iget-boolean v11, v7, Ll/ۗۤᩳ;->᩵:Z

    if-eqz v11, :cond_4f

    .line 639
    iget-object v7, v7, Ll/ۗۤᩳ;->ۘ:Ll/ܳ᩸ۡ;

    .line 8520
    iget v11, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v11, v11

    invoke-virtual {v7, v11, v6}, Ll/ܳ᩸ۡ;->֫(FF)Z

    move-result v11

    if-eqz v11, :cond_4f

    .line 8521
    invoke-static {v2, v8}, Ll/۫ۨᩳ;->ܿ(Ll/۫ۨᩳ;Z)V

    .line 8522
    iget v0, v7, Ll/ܳ᩸ۡ;->ܿ:F

    sub-float/2addr v0, v6

    iput v0, v1, Ll/ܿۨᩳ;->ܿ֫:F

    .line 8523
    invoke-static {v2}, Ll/۫ۨᩳ;->᩶(Ll/۫ۨᩳ;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_4e

    .line 8524
    invoke-static {v2}, Ll/۫ۨᩳ;->᩶(Ll/۫ۨᩳ;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 8525
    :cond_4e
    invoke-direct {v1, v8}, Ll/ܿۨᩳ;->֫(Z)V

    .line 8526
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    return v8

    .line 8528
    :cond_4f
    iget-object v7, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 651
    iget-boolean v11, v7, Ll/ۗۤᩳ;->ᩴ:Z

    if-eqz v11, :cond_51

    .line 643
    iget-object v7, v7, Ll/ۗۤᩳ;->ۖ:Ll/ܳ᩸ۡ;

    .line 8529
    iget v11, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v11, v11

    invoke-virtual {v7, v11, v6}, Ll/ܳ᩸ۡ;->֫(FF)Z

    move-result v11

    if-eqz v11, :cond_51

    .line 8530
    invoke-static {v2, v8}, Ll/۫ۨᩳ;->ᩳ(Ll/۫ۨᩳ;Z)V

    .line 8531
    iget v0, v7, Ll/ܳ᩸ۡ;->ۧ:F

    iget v3, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    iput v0, v1, Ll/ܿۨᩳ;->ᩳ֫:F

    .line 8532
    invoke-static {v2}, Ll/۫ۨᩳ;->᩶(Ll/۫ۨᩳ;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_50

    .line 8533
    invoke-static {v2}, Ll/۫ۨᩳ;->᩶(Ll/۫ۨᩳ;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 8534
    :cond_50
    invoke-direct {v1, v8}, Ll/ܿۨᩳ;->֫(Z)V

    .line 8535
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    return v8

    :cond_51
    if-ne v4, v5, :cond_52

    .line 8538
    iget-object v4, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 626
    iget-object v4, v4, Ll/ۗۤᩳ;->ۜ֫:Landroid/graphics/RectF;

    .line 8539
    iget v5, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v5, v5

    invoke-virtual {v4, v5, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v5

    if-eqz v5, :cond_54

    .line 8540
    invoke-static {v2, v8}, Ll/۫ۨᩳ;->ܳ(Ll/۫ۨᩳ;Z)V

    .line 8541
    iget v5, v4, Landroid/graphics/RectF;->left:F

    iget v7, v4, Landroid/graphics/RectF;->right:F

    add-float/2addr v5, v7

    div-float/2addr v5, v10

    iget v7, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v7, v7

    sub-float/2addr v5, v7

    iput v5, v1, Ll/ܿۨᩳ;->ᩳ֫:F

    .line 8542
    iget v4, v4, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v6

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v5

    div-float/2addr v5, v10

    sub-float/2addr v4, v5

    iput v4, v1, Ll/ܿۨᩳ;->ܿ֫:F

    .line 8543
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܳۧ()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v10

    add-float/2addr v5, v4

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    add-float/2addr v3, v5

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iput v3, v2, Ll/۫ۨᩳ;->۠֫:F

    .line 8544
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܳۧ()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v2, Ll/۫ۨᩳ;->ۚ֫:F

    .line 8545
    iput v9, v2, Ll/۫ۨᩳ;->֨֫:I

    .line 8546
    invoke-direct {v1, v8}, Ll/ܿۨᩳ;->֫(Z)V

    return v8

    .line 8549
    :cond_52
    iget-object v7, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 630
    iget-object v7, v7, Ll/ۗۤᩳ;->᩷֫:Landroid/graphics/RectF;

    .line 8549
    iget v11, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v11, v11

    invoke-virtual {v7, v11, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v11

    const/high16 v12, 0x40800000    # 4.0f

    if-eqz v11, :cond_53

    .line 8550
    invoke-static {v2, v8}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;Z)V

    .line 8551
    invoke-static {v2, v5}, Ll/۫ۨᩳ;->ᩳ(Ll/۫ۨᩳ;I)V

    .line 8552
    iget v4, v7, Landroid/graphics/RectF;->left:F

    iget v5, v7, Landroid/graphics/RectF;->right:F

    sub-float/2addr v5, v4

    const/high16 v11, 0x40400000    # 3.0f

    mul-float v5, v5, v11

    div-float/2addr v5, v12

    add-float/2addr v5, v4

    iget v4, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v4, v4

    sub-float/2addr v5, v4

    iput v5, v1, Ll/ܿۨᩳ;->ᩳ֫:F

    .line 8553
    iget v4, v7, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v6

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v5

    div-float/2addr v5, v10

    sub-float/2addr v4, v5

    iput v4, v1, Ll/ܿۨᩳ;->ܿ֫:F

    .line 8554
    invoke-static {v2, v8}, Ll/۫ۨᩳ;->ܽ(Ll/۫ۨᩳ;Z)V

    .line 8555
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܳۧ()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v10

    add-float/2addr v5, v4

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    add-float/2addr v3, v5

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iput v3, v2, Ll/۫ۨᩳ;->۠֫:F

    .line 8556
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܳۧ()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v2, Ll/۫ۨᩳ;->ۚ֫:F

    .line 8557
    iput v9, v2, Ll/۫ۨᩳ;->֨֫:I

    .line 8558
    invoke-direct {v1, v8}, Ll/ܿۨᩳ;->֫(Z)V

    return v8

    .line 8560
    :cond_53
    iget-object v5, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 634
    iget-object v5, v5, Ll/ۗۤᩳ;->ۢ֫:Landroid/graphics/RectF;

    .line 8560
    iget v7, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v7, v7

    invoke-virtual {v5, v7, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v7

    if-eqz v7, :cond_54

    .line 8561
    invoke-static {v2, v8}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;Z)V

    .line 8562
    invoke-static {v2, v4}, Ll/۫ۨᩳ;->ᩳ(Ll/۫ۨᩳ;I)V

    .line 8563
    iget v4, v5, Landroid/graphics/RectF;->left:F

    iget v7, v5, Landroid/graphics/RectF;->right:F

    sub-float/2addr v7, v4

    div-float/2addr v7, v12

    add-float/2addr v7, v4

    iget v4, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v4, v4

    sub-float/2addr v7, v4

    iput v7, v1, Ll/ܿۨᩳ;->ᩳ֫:F

    .line 8564
    iget v4, v5, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v6

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v5

    div-float/2addr v5, v10

    sub-float/2addr v4, v5

    iput v4, v1, Ll/ܿۨᩳ;->ܿ֫:F

    .line 8565
    invoke-static {v2, v9}, Ll/۫ۨᩳ;->ܽ(Ll/۫ۨᩳ;Z)V

    .line 8566
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܳۧ()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v10

    add-float/2addr v5, v4

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    add-float/2addr v3, v5

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iput v3, v2, Ll/۫ۨᩳ;->۠֫:F

    .line 8567
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܳۧ()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v2, Ll/۫ۨᩳ;->ۚ֫:F

    .line 8568
    iput v9, v2, Ll/۫ۨᩳ;->֨֫:I

    .line 8569
    invoke-direct {v1, v8}, Ll/ܿۨᩳ;->֫(Z)V

    return v8

    .line 8128
    :cond_54
    iget-boolean v3, v3, Ll/᩺֫ܿ;->ᩴۧ:Z

    if-eqz v3, :cond_57

    .line 8129
    invoke-static/range {p2 .. p2}, Ll/۫ۨᩳ;->֫(Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_57

    .line 8148
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v3

    and-int/2addr v3, v8

    if-eqz v3, :cond_57

    .line 8130
    iget-object v3, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 8131
    invoke-virtual {v3}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v3

    if-nez v3, :cond_57

    .line 8132
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 8156
    invoke-static {v2, v3, v4}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;FF)Z

    move-result v4

    if-nez v4, :cond_55

    const/4 v3, 0x0

    goto :goto_13

    .line 8159
    :cond_55
    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    .line 8160
    invoke-static {v2, v3}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;F)Z

    move-result v3

    xor-int/2addr v3, v8

    :goto_13
    if-nez v3, :cond_56

    goto :goto_14

    .line 8135
    :cond_56
    iput-boolean v8, v1, Ll/ܿۨᩳ;->ܽ֫:Z

    .line 8136
    iput-boolean v9, v1, Ll/ܿۨᩳ;->ۧ֫:Z

    .line 8137
    iput-boolean v9, v1, Ll/ܿۨᩳ;->֫֫:Z

    .line 8138
    iget-object v3, v2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget v4, v1, Ll/ܿۨᩳ;->᩸:I

    int-to-float v4, v4

    iget v5, v1, Ll/ܿۨᩳ;->᩹:I

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Ll/ۗۤᩳ;->֫(FF)I

    move-result v3

    iput v3, v1, Ll/ܿۨᩳ;->ܰ:I

    .line 8139
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    iput v3, v1, Ll/ܿۨᩳ;->ۨ:F

    .line 8140
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, v1, Ll/ܿۨᩳ;->᩺:F

    .line 8769
    :cond_57
    :goto_14
    invoke-static {v2}, Ll/۫ۨᩳ;->ܺ(Ll/۫ۨᩳ;)Ll/֨ۛ;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
