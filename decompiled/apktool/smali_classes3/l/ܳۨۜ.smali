.class public final Ll/ܳۨۜ;
.super Ljava/lang/Object;
.source "X6NG"


# instance fields
.field public ֡:F

.field public ֡֫:F

.field public ֨:F

.field public final ֨֫:F

.field public ֫:I

.field public ֫֫:F

.field public ۖ:F

.field public ۖ֫:F

.field public ۗ:F

.field public ۗ֫:Z

.field public ۘ:F

.field public ۘ֫:Z

.field public ۙ:F

.field public ۙ֫:F

.field public ۚ:F

.field public ۚ֫:F

.field public ۛ:F

.field public ۜ:F

.field public ۜ֫:F

.field public ۟:Z

.field public ۠:Z

.field public ۠֫:F

.field public ۡ:J

.field public ۡ֫:F

.field public final ۢ:F

.field public ۢ֫:J

.field public ۤ:Z

.field public final ۧ:Ll/᩶ܰۜ;

.field public ۧ֫:I

.field public final ۨ:F

.field public final ۫:F

.field public final ۫֫:Ll/۠ܰۜ;

.field public final ۬:F

.field public ۬֫:Landroid/view/VelocityTracker;

.field public ܰ:F

.field public ܳ:F

.field public ܳ֫:Z

.field public ܶ:Z

.field public ܶ֫:Ll/ܿۨۜ;

.field public ܺ:F

.field public ܺ֫:Landroid/view/VelocityTracker;

.field public final ܽ:F

.field public ܽ֫:F

.field public ܿ:F

.field public ܿ֫:Z

.field public ᩳ:F

.field public ᩳ֫:F

.field public ᩴ:I

.field public ᩴ֫:I

.field public ᩵:F

.field public ᩵֫:Z

.field public ᩶:F

.field public ᩶֫:F

.field public final ᩷:F

.field public ᩷֫:J

.field public ᩸:J

.field public ᩸֫:Z

.field public ᩹:J

.field public ᩹֫:J

.field public ᩺:Z

.field public ᩻:F

.field public ᩻֫:Z


# direct methods
.method public constructor <init>(Ll/۠ܰۜ;)V
    .locals 4

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    sget-object v0, Ll/ܿۨۜ;->᩶:Ll/ܿۨۜ;

    iput-object v0, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    const/4 v0, -0x1

    .line 17
    iput v0, p0, Ll/ܳۨۜ;->ᩴ:I

    iput v0, p0, Ll/ܳۨۜ;->ᩴ֫:I

    .line 38
    iput-object p1, p0, Ll/ܳۨۜ;->۫֫:Ll/۠ܰۜ;

    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Ll/ܳۨۜ;->ܽ:F

    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Ll/ܳۨۜ;->֨֫:F

    .line 42
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledDoubleTapSlop()I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Ll/ܳۨۜ;->ۢ:F

    .line 43
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Ll/ܳۨۜ;->۫:F

    .line 44
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Ll/ܳۨۜ;->۬:F

    const/high16 v3, 0x44160000    # 600.0f

    mul-float v3, v3, v0

    .line 45
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iput v3, p0, Ll/ܳۨۜ;->ۨ:F

    const/high16 v3, 0x447a0000    # 1000.0f

    mul-float v0, v0, v3

    .line 46
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Ll/ܳۨۜ;->᩷:F

    .line 47
    new-instance v0, Ll/᩶ܰۜ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Ll/᩶ܰۜ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܳۨۜ;->ۧ:Ll/᩶ܰۜ;

    return-void
.end method

.method private ֫(F)V
    .locals 5

    .line 512
    iget-object v0, p0, Ll/ܳۨۜ;->۫֫:Ll/۠ܰۜ;

    invoke-virtual {v0}, Ll/۠ܰۜ;->ۜ()F

    move-result v1

    .line 513
    iget v2, p0, Ll/ܳۨۜ;->᩷:F

    neg-float v3, v2

    cmpg-float v3, p1, v3

    if-gtz v3, :cond_0

    goto :goto_0

    .line 514
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    const v4, 0x3e4ccccd    # 0.2f

    mul-float v3, v3, v4

    cmpl-float v3, v1, v3

    if-gez v3, :cond_2

    const/high16 v3, 0x42400000    # 48.0f

    iget v4, p0, Ll/ܳۨۜ;->ܽ:F

    mul-float v4, v4, v3

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_1

    cmpl-float p1, p1, v2

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    :goto_2
    invoke-virtual {v0, p1}, Ll/۠ܰۜ;->ۧ(Z)V

    return-void
.end method

.method private ֫(FFFJLandroid/view/MotionEvent;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    .line 558
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v3, v0, Ll/ܳۨۜ;->֨֫:F

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_0

    return-void

    .line 559
    :cond_0
    iget v2, v0, Ll/ܳۨۜ;->ۛ:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_1

    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->signum(F)F

    move-result v2

    iget v3, v0, Ll/ܳۨۜ;->ۛ:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_1

    iget-object v2, v0, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_1

    .line 561
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V

    .line 562
    new-instance v2, Landroid/view/MotionEvent$PointerProperties;

    invoke-direct {v2}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 563
    iget v3, v0, Ll/ܳۨۜ;->ᩴ:I

    iput v3, v2, Landroid/view/MotionEvent$PointerProperties;->id:I

    .line 564
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    iput v3, v2, Landroid/view/MotionEvent$PointerProperties;->toolType:I

    .line 565
    new-instance v3, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v3}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 566
    iget v4, v0, Ll/ܳۨۜ;->᩵:F

    sub-float v4, v4, p2

    iput v4, v3, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 567
    iget v4, v0, Ll/ܳۨۜ;->֡:F

    sub-float v4, v4, p3

    iput v4, v3, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 568
    iget-wide v5, v0, Ll/ܳۨۜ;->ۡ:J

    const/4 v4, 0x1

    new-array v11, v4, [Landroid/view/MotionEvent$PointerProperties;

    const/4 v7, 0x0

    aput-object v2, v11, v7

    new-array v12, v4, [Landroid/view/MotionEvent$PointerCoords;

    aput-object v3, v12, v7

    .line 570
    invoke-virtual/range {p6 .. p6}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v17

    invoke-virtual/range {p6 .. p6}, Landroid/view/MotionEvent;->getSource()I

    move-result v19

    const/16 v20, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    const/high16 v16, 0x3f800000    # 1.0f

    const/16 v18, 0x0

    move-wide/from16 v7, p4

    .line 568
    invoke-static/range {v5 .. v20}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v2

    .line 571
    iget-object v3, v0, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    invoke-virtual {v3, v2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 572
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 573
    iget-object v2, v0, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 575
    :cond_1
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    iput v1, v0, Ll/ܳۨۜ;->ۛ:F

    return-void
.end method

.method private ֫(FFLl/ۨܰۜ;)V
    .locals 7

    const/4 v0, 0x0

    .line 408
    iget-object v1, p0, Ll/ܳۨۜ;->۫֫:Ll/۠ܰۜ;

    const/4 v2, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ll/ۨܰۜ;->۠()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 409
    invoke-virtual {p3}, Ll/ۨܰۜ;->֡()F

    move-result v3

    .line 410
    invoke-virtual {p3, p1, p2}, Ll/ۨܰۜ;->ۧ(FF)F

    move-result p1

    .line 411
    invoke-virtual {p3}, Ll/ۨܰۜ;->֡()F

    move-result v4

    sub-float/2addr v4, v3

    sub-float/2addr p2, v4

    cmpl-float v3, p2, v2

    if-eqz v3, :cond_0

    .line 412
    invoke-virtual {p3}, Ll/ۨܰۜ;->ۚ()Z

    move-result v3

    if-nez v3, :cond_0

    .line 413
    invoke-virtual {p3}, Ll/ۨܰۜ;->ۖ()F

    move-result v3

    invoke-virtual {p3}, Ll/ۨܰۜ;->֡()F

    move-result v4

    sub-float/2addr v3, v4

    .line 414
    invoke-virtual {p3}, Ll/ۨܰۜ;->֡()F

    move-result v4

    invoke-virtual {p3}, Ll/ۨܰۜ;->ۢ()F

    move-result v5

    sub-float/2addr v4, v5

    .line 413
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    .line 415
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v3, v4}, Ll/᩻ۨۜ;->֫(FF)F

    move-result v3

    .line 416
    invoke-virtual {p3}, Ll/ۨܰۜ;->ᩴ()F

    move-result v4

    invoke-virtual {p3}, Ll/ۨܰۜ;->᩵()F

    move-result v5

    .line 417
    invoke-virtual {p3}, Ll/ۨܰۜ;->֡()F

    move-result v6

    mul-float p2, p2, v3

    add-float/2addr p2, v6

    .line 416
    invoke-virtual {p3, v4, v5, p2, v0}, Ll/ۨܰۜ;->֫(FFFZ)V

    :cond_0
    cmpl-float p2, p1, v2

    if-eqz p2, :cond_2

    .line 420
    iget v3, p0, Ll/ܳۨۜ;->֫:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    iget-boolean v3, p0, Ll/ܳۨۜ;->᩺:Z

    if-nez v3, :cond_2

    .line 421
    iget p2, p0, Ll/ܳۨۜ;->ۘ:F

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result v0

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_1

    iput v2, p0, Ll/ܳۨۜ;->ۘ:F

    .line 422
    :cond_1
    iget p2, p0, Ll/ܳۨۜ;->ۘ:F

    add-float/2addr p2, p1

    iput p2, p0, Ll/ܳۨۜ;->ۘ:F

    .line 423
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget v0, p0, Ll/ܳۨۜ;->֨֫:F

    cmpl-float p2, p2, v0

    if-lez p2, :cond_3

    .line 424
    sget-object p2, Ll/ܿۨۜ;->ۙ:Ll/ܿۨۜ;

    iput-object p2, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    .line 425
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    iput p1, p0, Ll/ܳۨۜ;->ۛ:F

    .line 426
    iget p1, p0, Ll/ܳۨۜ;->ۘ:F

    invoke-static {v0, p1}, Ljava/lang/Math;->copySign(FF)F

    move-result p2

    sub-float/2addr p1, p2

    invoke-virtual {v1, p1}, Ll/۠ܰۜ;->ۧ(F)V

    .line 427
    iput v2, p0, Ll/ܳۨۜ;->ۘ:F

    goto :goto_0

    .line 430
    :cond_2
    iput v2, p0, Ll/ܳۨۜ;->ۘ:F

    if-eqz p3, :cond_3

    .line 431
    invoke-virtual {p3}, Ll/ۨܰۜ;->۠()Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p3}, Ll/ۨܰۜ;->ۚ()Z

    move-result p2

    if-nez p2, :cond_3

    .line 432
    invoke-virtual {p3}, Ll/ۨܰۜ;->ܺ()F

    move-result p2

    invoke-virtual {p3}, Ll/ۨܰۜ;->᩵()F

    move-result v2

    sub-float/2addr p2, v2

    .line 433
    invoke-virtual {p3}, Ll/ۨܰۜ;->᩵()F

    move-result v2

    invoke-virtual {p3}, Ll/ۨܰۜ;->᩷()F

    move-result v3

    sub-float/2addr v2, v3

    .line 432
    invoke-static {p2, v2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 434
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-static {p2, v2}, Ll/᩻ۨۜ;->֫(FF)F

    move-result p2

    .line 435
    invoke-virtual {p3}, Ll/ۨܰۜ;->ᩴ()F

    move-result v2

    invoke-virtual {p3}, Ll/ۨܰۜ;->᩵()F

    move-result v3

    mul-float p1, p1, p2

    add-float/2addr p1, v3

    .line 436
    invoke-virtual {p3}, Ll/ۨܰۜ;->֡()F

    move-result p2

    .line 435
    invoke-virtual {p3, v2, p1, p2, v0}, Ll/ۨܰۜ;->֫(FFFZ)V

    .line 439
    :cond_3
    :goto_0
    iget-object p1, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object p2, Ll/ܿۨۜ;->۬:Ll/ܿۨۜ;

    if-ne p1, p2, :cond_4

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Ll/ۨܰۜ;->۠()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ll/ܿۨۜ;->ۗ:Ll/ܿۨۜ;

    iput-object p1, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    .line 440
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private ֫(FJJ)V
    .locals 3

    .line 589
    iget-wide v0, p0, Ll/ܳۨۜ;->ۢ֫:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    .line 590
    iget-object v0, p0, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    invoke-direct {p0, p2, p3}, Ll/ܳۨۜ;->ۧ(J)V

    .line 591
    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Ll/ܳۨۜ;->֨֫:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 592
    iget v0, p0, Ll/ܳۨۜ;->ۜ֫:F

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result v0

    iget v1, p0, Ll/ܳۨۜ;->ۜ֫:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 593
    iget-object v0, p0, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 594
    invoke-direct {p0, p2, p3}, Ll/ܳۨۜ;->֫(J)V

    .line 596
    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p2

    iput p2, p0, Ll/ܳۨۜ;->ۜ֫:F

    :cond_2
    cmpl-float p2, p1, v2

    if-eqz p2, :cond_3

    .line 598
    iput-wide p4, p0, Ll/ܳۨۜ;->᩷֫:J

    .line 599
    :cond_3
    iget p2, p0, Ll/ܳۨۜ;->ۡ֫:F

    add-float/2addr p2, p1

    iput p2, p0, Ll/ܳۨۜ;->ۡ֫:F

    .line 600
    invoke-direct {p0, p4, p5}, Ll/ܳۨۜ;->֫(J)V

    return-void
.end method

.method private ֫(J)V
    .locals 8

    .line 604
    iget-wide v0, p0, Ll/ܳۨۜ;->ۡ:J

    iget v6, p0, Ll/ܳۨۜ;->ۡ֫:F

    const/4 v7, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-wide v2, p1

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 606
    iget-object v1, p0, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v1, v0}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 607
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 608
    iput-wide p1, p0, Ll/ܳۨۜ;->ۢ֫:J

    return-void
.end method

.method private ֫(Landroid/view/MotionEvent;I)V
    .locals 4

    const/4 v0, -0x1

    if-gez p2, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    .line 519
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 520
    :goto_0
    iget v2, p0, Ll/ܳۨۜ;->ᩴ:I

    if-ne v2, v1, :cond_1

    iget v2, p0, Ll/ܳۨۜ;->ᩴ֫:I

    iput v2, p0, Ll/ܳۨۜ;->ᩴ:I

    .line 521
    :cond_1
    iget v2, p0, Ll/ܳۨۜ;->ᩴ֫:I

    if-eq v2, v1, :cond_2

    iget v1, p0, Ll/ܳۨۜ;->ᩴ:I

    if-ne v2, v1, :cond_3

    :cond_2
    iput v0, p0, Ll/ܳۨۜ;->ᩴ֫:I

    .line 522
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x0

    if-ltz p2, :cond_4

    const/4 v2, 0x1

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    sub-int/2addr v0, v2

    iput v0, p0, Ll/ܳۨۜ;->ۧ֫:I

    .line 523
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ge v1, v0, :cond_8

    if-ne v1, p2, :cond_5

    goto :goto_3

    .line 525
    :cond_5
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 526
    iget v2, p0, Ll/ܳۨۜ;->ᩴ:I

    if-gez v2, :cond_6

    iput v0, p0, Ll/ܳۨۜ;->ᩴ:I

    goto :goto_3

    .line 527
    :cond_6
    iget v3, p0, Ll/ܳۨۜ;->ᩴ֫:I

    if-gez v3, :cond_7

    if-eq v0, v2, :cond_7

    iput v0, p0, Ll/ܳۨۜ;->ᩴ֫:I

    :cond_7
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 529
    :cond_8
    invoke-direct {p0, p1}, Ll/ܳۨۜ;->ۧ(Landroid/view/MotionEvent;)V

    return-void
.end method

.method private ֫(Ll/ۨܰۜ;FFFFFF)V
    .locals 8

    if-eqz p1, :cond_4

    .line 392
    invoke-virtual {p1}, Ll/ۨܰۜ;->۠()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 393
    :cond_0
    invoke-virtual {p1}, Ll/ۨܰۜ;->ᩴ()F

    move-result v1

    invoke-virtual {p1}, Ll/ۨܰۜ;->ۡ()F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    cmpg-float v1, p2, v3

    if-ltz v1, :cond_2

    .line 394
    :cond_1
    invoke-virtual {p1}, Ll/ۨܰۜ;->ᩴ()F

    move-result v1

    const/high16 v2, 0x41000000    # 8.0f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_3

    cmpl-float v1, p2, v3

    if-lez v1, :cond_3

    :cond_2
    float-to-double v0, p2

    const-wide v2, 0x3fd3333340000000L    # 0.30000001192092896

    .line 395
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float v0, v0

    goto :goto_0

    :cond_3
    move v0, p2

    .line 397
    :goto_0
    invoke-virtual {p1}, Ll/ۨܰۜ;->ᩴ()F

    move-result v1

    mul-float v1, v1, v0

    invoke-virtual {p1}, Ll/ۨܰۜ;->ۘ()F

    move-result v0

    add-float v2, v0, p3

    const/4 v7, 0x0

    move-object v0, p1

    move v3, p4

    move v4, p5

    move v5, p6

    move v6, p7

    invoke-virtual/range {v0 .. v7}, Ll/ۨܰۜ;->֫(FFFFFFZ)V

    .line 399
    iget-object v1, p0, Ll/ܳۨۜ;->۫֫:Ll/۠ܰۜ;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    :cond_4
    :goto_1
    return-void
.end method

.method private ֫(Ll/ۨܰۜ;FFFFFFFJJ)V
    .locals 11

    move-object v8, p0

    .line 372
    iget-object v0, v8, Ll/ܳۨۜ;->۫֫:Ll/۠ܰۜ;

    invoke-virtual {v0}, Ll/۠ܰۜ;->ۜ()F

    move-result v1

    .line 373
    invoke-virtual {v0, v1}, Ll/۠ܰۜ;->ܽ(F)F

    move-result v2

    move/from16 v3, p8

    .line 374
    invoke-virtual {v0, v3}, Ll/۠ܰۜ;->֫(F)V

    .line 375
    invoke-virtual {v0}, Ll/۠ܰۜ;->ۜ()F

    move-result v3

    .line 376
    invoke-virtual {v0, v3}, Ll/۠ܰۜ;->ܽ(F)F

    move-result v4

    .line 377
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    const/high16 v6, 0x3f000000    # 0.5f

    mul-float v5, v5, v6

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v6

    sub-float v6, p4, v5

    div-float/2addr v6, v2

    add-float/2addr v6, v5

    sub-float v7, p5, v0

    sub-float/2addr v7, v1

    div-float/2addr v7, v2

    add-float/2addr v7, v0

    sub-float v1, p6, v5

    div-float/2addr v1, v4

    add-float v9, v5, v1

    sub-float v1, p7, v0

    sub-float/2addr v1, v3

    div-float/2addr v1, v4

    add-float v10, v1, v0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, v6

    move v5, v7

    move v6, v9

    move v7, v10

    .line 378
    invoke-direct/range {v0 .. v7}, Ll/ܳۨۜ;->֫(Ll/ۨܰۜ;FFFFFF)V

    sub-float v0, p7, p5

    move-object p1, p0

    move p2, v0

    move-wide/from16 p3, p9

    move-wide/from16 p5, p11

    .line 383
    invoke-direct/range {p1 .. p6}, Ll/ܳۨۜ;->֫(FJJ)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۨۜ;Ll/۠ܰۜ;)V
    .locals 2

    .line 48
    iget-boolean v0, p0, Ll/ܳۨۜ;->۟:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, Ll/ܳۨۜ;->۟:Z

    .line 50
    iget-object v0, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object v1, Ll/ܿۨۜ;->᩶:Ll/ܿۨۜ;

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܳۨۜ;->᩶֫:F

    iget p0, p0, Ll/ܳۨۜ;->ۙ֫:F

    invoke-virtual {p1, v0, p0}, Ll/۠ܰۜ;->ۧ(FF)V

    :cond_0
    return-void
.end method

.method private ۜ()V
    .locals 8

    .line 540
    iget v0, p0, Ll/ܳۨۜ;->᩵:F

    iput v0, p0, Ll/ܳۨۜ;->ۙ:F

    iput v0, p0, Ll/ܳۨۜ;->ܺ:F

    .line 541
    iget v1, p0, Ll/ܳۨۜ;->֡:F

    iput v1, p0, Ll/ܳۨۜ;->ۗ:F

    iput v1, p0, Ll/ܳۨۜ;->ۖ:F

    .line 542
    iget v2, p0, Ll/ܳۨۜ;->֡֫:F

    add-float v3, v0, v2

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v3, v3, v4

    iput v3, p0, Ll/ܳۨۜ;->ۚ:F

    .line 543
    iget v3, p0, Ll/ܳۨۜ;->ۚ֫:F

    add-float v5, v1, v3

    mul-float v5, v5, v4

    iput v5, p0, Ll/ܳۨۜ;->֨:F

    .line 544
    iget v4, p0, Ll/ܳۨۜ;->ᩴ֫:I

    const/4 v5, 0x0

    if-gez v4, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sub-float/2addr v0, v2

    float-to-double v6, v0

    sub-float/2addr v1, v3

    float-to-double v0, v1

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_0
    iput v0, p0, Ll/ܳۨۜ;->۠֫:F

    .line 403
    iget v0, p0, Ll/ܳۨۜ;->ۚ֫:F

    iget v1, p0, Ll/ܳۨۜ;->֡:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    iget v2, p0, Ll/ܳۨۜ;->֡֫:F

    iget v3, p0, Ll/ܳۨۜ;->᩵:F

    sub-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 545
    iput v0, p0, Ll/ܳۨۜ;->֫֫:F

    .line 546
    iget v0, p0, Ll/ܳۨۜ;->۠֫:F

    const/4 v1, 0x0

    .line 335
    iput-boolean v1, p0, Ll/ܳۨۜ;->ۘ֫:Z

    iput-boolean v1, p0, Ll/ܳۨۜ;->ܿ֫:Z

    .line 336
    iput v5, p0, Ll/ܳۨۜ;->ᩳ֫:F

    iput v5, p0, Ll/ܳۨۜ;->ܽ֫:F

    iput v5, p0, Ll/ܳۨۜ;->ܰ:F

    .line 337
    iput v0, p0, Ll/ܳۨۜ;->ۖ֫:F

    .line 547
    iget v0, p0, Ll/ܳۨۜ;->ۚ֫:F

    iput v0, p0, Ll/ܳۨۜ;->᩶:F

    .line 548
    iput-boolean v1, p0, Ll/ܳۨۜ;->᩻֫:Z

    .line 549
    iput v5, p0, Ll/ܳۨۜ;->ۘ:F

    .line 550
    iput v1, p0, Ll/ܳۨۜ;->֫:I

    return-void
.end method

.method private ۧ(J)V
    .locals 1

    .line 584
    iget-object v0, p0, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    .line 585
    :cond_0
    invoke-direct {p0, p1, p2}, Ll/ܳۨۜ;->֫(J)V

    return-void
.end method

.method private ۧ(Landroid/view/MotionEvent;)V
    .locals 2

    .line 533
    iget v0, p0, Ll/ܳۨۜ;->ᩴ:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 534
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, Ll/ܳۨۜ;->᩵:F

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iput v0, p0, Ll/ܳۨۜ;->֡:F

    .line 535
    :cond_0
    iget v0, p0, Ll/ܳۨۜ;->ᩴ֫:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ltz v0, :cond_1

    .line 536
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, Ll/ܳۨۜ;->֡֫:F

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput p1, p0, Ll/ܳۨۜ;->ۚ֫:F

    :cond_1
    return-void
.end method

.method private ܳ()V
    .locals 2

    const/4 v0, 0x0

    .line 612
    iput-boolean v0, p0, Ll/ܳۨۜ;->᩻֫:Z

    iput-boolean v0, p0, Ll/ܳۨۜ;->ܳ֫:Z

    const/4 v0, 0x0

    .line 613
    iput v0, p0, Ll/ܳۨۜ;->ۜ֫:F

    iput v0, p0, Ll/ܳۨۜ;->ۡ֫:F

    const-wide/16 v0, 0x0

    .line 614
    iput-wide v0, p0, Ll/ܳۨۜ;->ۢ֫:J

    iput-wide v0, p0, Ll/ܳۨۜ;->᩷֫:J

    .line 615
    iget-object v0, p0, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 616
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 617
    iput-object v0, p0, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private ᩻()V
    .locals 2

    const/4 v0, 0x0

    .line 622
    iput-boolean v0, p0, Ll/ܳۨۜ;->۟:Z

    .line 623
    iget-object v0, p0, Ll/ܳۨۜ;->۫֫:Ll/۠ܰۜ;

    iget-object v1, p0, Ll/ܳۨۜ;->ۧ:Ll/᩶ܰۜ;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 72
    invoke-direct {p0}, Ll/ܳۨۜ;->᩻()V

    .line 579
    iget-object v0, p0, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    .line 74
    :cond_0
    invoke-direct {p0}, Ll/ܳۨۜ;->ܳ()V

    .line 75
    sget-object v0, Ll/ܿۨۜ;->᩶:Ll/ܿۨۜ;

    iput-object v0, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    const/4 v0, -0x1

    .line 76
    iput v0, p0, Ll/ܳۨۜ;->ᩴ֫:I

    iput v0, p0, Ll/ܳۨۜ;->ᩴ:I

    const/4 v0, 0x0

    .line 77
    iput v0, p0, Ll/ܳۨۜ;->ۧ֫:I

    .line 78
    iput-boolean v0, p0, Ll/ܳۨۜ;->۠:Z

    iput-boolean v0, p0, Ll/ܳۨۜ;->ܶ:Z

    iput-boolean v0, p0, Ll/ܳۨۜ;->᩵֫:Z

    iput-boolean v0, p0, Ll/ܳۨۜ;->᩺:Z

    iput-boolean v0, p0, Ll/ܳۨۜ;->ۗ֫:Z

    const/4 v1, 0x0

    .line 79
    iput v1, p0, Ll/ܳۨۜ;->ۘ:F

    .line 80
    iget-object v1, p0, Ll/ܳۨۜ;->۫֫:Ll/۠ܰۜ;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1
    return-void
.end method

.method public final ֫(Landroid/view/MotionEvent;)V
    .locals 21

    move-object/from16 v13, p0

    move-object/from16 v6, p1

    .line 111
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v7, 0x0

    const/4 v8, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 112
    iget-object v9, v13, Ll/ܳۨۜ;->۫֫:Ll/۠ܰۜ;

    const/4 v3, 0x1

    if-nez v0, :cond_5

    .line 232
    invoke-virtual {v9}, Ll/۠ܰۜ;->ܽ()Z

    move-result v0

    .line 233
    invoke-virtual {v9}, Ll/۠ܰۜ;->ۡ()V

    .line 234
    iget-boolean v4, v13, Ll/ܳۨۜ;->۟:Z

    if-eqz v4, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    iget-wide v10, v13, Ll/ܳۨۜ;->᩹֫:J

    sub-long/2addr v4, v10

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v10

    int-to-long v10, v10

    cmp-long v12, v4, v10

    if-gtz v12, :cond_0

    .line 235
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    iget v5, v13, Ll/ܳۨۜ;->᩶֫:F

    sub-float/2addr v4, v5

    float-to-double v4, v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    iget v11, v13, Ll/ܳۨۜ;->ۙ֫:F

    sub-float/2addr v10, v11

    float-to-double v10, v10

    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    iget v10, v13, Ll/ܳۨۜ;->ۢ:F

    float-to-double v10, v10

    cmpg-double v12, v4, v10

    if-gtz v12, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 236
    :goto_0
    invoke-direct/range {p0 .. p0}, Ll/ܳۨۜ;->᩻()V

    .line 579
    iget-object v5, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v7, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    .line 238
    :cond_1
    invoke-direct/range {p0 .. p0}, Ll/ܳۨۜ;->ܳ()V

    .line 239
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v5

    iput-object v5, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    .line 240
    invoke-virtual {v5, v6}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 241
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v5

    iput v5, v13, Ll/ܳۨۜ;->ᩴ:I

    .line 242
    iput v8, v13, Ll/ܳۨۜ;->ᩴ֫:I

    .line 243
    iput v3, v13, Ll/ܳۨۜ;->ۧ֫:I

    .line 244
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    iput v5, v13, Ll/ܳۨۜ;->ۙ:F

    iput v5, v13, Ll/ܳۨۜ;->ܺ:F

    iput v5, v13, Ll/ܳۨۜ;->᩵:F

    .line 245
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    iput v5, v13, Ll/ܳۨۜ;->ۗ:F

    iput v5, v13, Ll/ܳۨۜ;->ۖ:F

    iput v5, v13, Ll/ܳۨۜ;->֡:F

    .line 246
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    iput-wide v5, v13, Ll/ܳۨۜ;->ۡ:J

    .line 247
    iput-wide v5, v13, Ll/ܳۨۜ;->᩹:J

    iput-wide v5, v13, Ll/ܳۨۜ;->᩸:J

    .line 248
    iput v2, v13, Ll/ܳۨۜ;->ۛ:F

    .line 249
    sget-object v5, Ll/ܿۨۜ;->۬:Ll/ܿۨۜ;

    iput-object v5, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    if-eqz v4, :cond_2

    if-nez v0, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    .line 250
    :goto_1
    iput-boolean v4, v13, Ll/ܳۨۜ;->᩵֫:Z

    xor-int/2addr v0, v3

    .line 251
    iput-boolean v0, v13, Ll/ܳۨۜ;->᩸֫:Z

    .line 252
    iput-boolean v1, v13, Ll/ܳۨۜ;->ۗ֫:Z

    iput-boolean v1, v13, Ll/ܳۨۜ;->᩺:Z

    iput-boolean v1, v13, Ll/ܳۨۜ;->ۤ:Z

    .line 253
    iput v2, v13, Ll/ܳۨۜ;->ۘ:F

    .line 254
    iput v1, v13, Ll/ܳۨۜ;->֫:I

    .line 255
    invoke-virtual {v9}, Ll/۠ܰۜ;->᩷()F

    move-result v0

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, v13, Ll/ܳۨۜ;->ܶ:Z

    .line 256
    invoke-virtual {v9}, Ll/۠ܰۜ;->ۜ()F

    move-result v0

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    iput-boolean v1, v13, Ll/ܳۨۜ;->۠:Z

    .line 257
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_52

    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return-void

    :cond_5
    const/4 v4, 0x3

    if-ne v0, v4, :cond_6

    .line 117
    invoke-virtual/range {p0 .. p0}, Ll/ܳۨۜ;->֫()V

    .line 118
    invoke-virtual {v9, v1}, Ll/۠ܰۜ;->֫(Z)V

    return-void

    .line 121
    :cond_6
    iget v4, v13, Ll/ܳۨۜ;->ᩴ:I

    if-gez v4, :cond_7

    goto/16 :goto_20

    .line 122
    :cond_7
    iget-object v4, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    if-eqz v4, :cond_8

    iget-boolean v5, v13, Ll/ܳۨۜ;->ۗ֫:Z

    if-nez v5, :cond_8

    invoke-virtual {v4, v6}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_8
    const/4 v4, 0x5

    if-ne v0, v4, :cond_d

    .line 124
    invoke-direct {v13, v6, v8}, Ll/ܳۨۜ;->֫(Landroid/view/MotionEvent;I)V

    .line 125
    iput-boolean v1, v13, Ll/ܳۨۜ;->᩸֫:Z

    .line 126
    iput-boolean v1, v13, Ll/ܳۨۜ;->᩵֫:Z

    .line 127
    invoke-direct/range {p0 .. p0}, Ll/ܳۨۜ;->᩻()V

    .line 128
    iput-boolean v3, v13, Ll/ܳۨۜ;->᩺:Z

    .line 554
    iget-object v0, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 130
    :cond_9
    iget-boolean v0, v13, Ll/ܳۨۜ;->ܳ֫:Z

    if-eqz v0, :cond_a

    .line 131
    sget-object v0, Ll/ܿۨۜ;->ۤ:Ll/ܿۨۜ;

    iput-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    .line 132
    invoke-direct/range {p0 .. p0}, Ll/ܳۨۜ;->ۜ()V

    .line 133
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    invoke-direct {v13, v0, v1}, Ll/ܳۨۜ;->ۧ(J)V

    return-void

    .line 134
    :cond_a
    iget-boolean v0, v13, Ll/ܳۨۜ;->ۗ֫:Z

    if-nez v0, :cond_c

    invoke-virtual {v9}, Ll/۠ܰۜ;->᩷()F

    move-result v0

    cmpl-float v0, v0, v2

    if-nez v0, :cond_b

    invoke-virtual {v9}, Ll/۠ܰۜ;->ۜ()F

    move-result v0

    cmpl-float v0, v0, v2

    if-nez v0, :cond_b

    iget-boolean v0, v13, Ll/ܳۨۜ;->ܶ:Z

    if-nez v0, :cond_b

    iget-boolean v0, v13, Ll/ܳۨۜ;->۠:Z

    if-eqz v0, :cond_c

    .line 136
    :cond_b
    iput-boolean v3, v13, Ll/ܳۨۜ;->ۗ֫:Z

    .line 137
    invoke-virtual {v9, v3}, Ll/۠ܰۜ;->֫(Z)V

    return-void

    .line 138
    :cond_c
    iget-boolean v0, v13, Ll/ܳۨۜ;->ۗ֫:Z

    if-nez v0, :cond_52

    .line 139
    sget-object v0, Ll/ܿۨۜ;->ۤ:Ll/ܿۨۜ;

    iput-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    .line 140
    invoke-direct/range {p0 .. p0}, Ll/ܳۨۜ;->ۜ()V

    return-void

    :cond_d
    const/4 v1, 0x6

    if-ne v0, v1, :cond_11

    .line 145
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-direct {v13, v6, v0}, Ll/ܳۨۜ;->֫(Landroid/view/MotionEvent;I)V

    .line 146
    iput-boolean v3, v13, Ll/ܳۨۜ;->᩺:Z

    .line 554
    iget-object v0, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 148
    :cond_e
    invoke-direct/range {p0 .. p0}, Ll/ܳۨۜ;->ۜ()V

    .line 149
    iget-boolean v0, v13, Ll/ܳۨۜ;->ܳ֫:Z

    if-eqz v0, :cond_f

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    invoke-direct {v13, v0, v1}, Ll/ܳۨۜ;->ۧ(J)V

    .line 150
    :cond_f
    iget-boolean v0, v13, Ll/ܳۨۜ;->ۗ֫:Z

    if-nez v0, :cond_52

    iget v0, v13, Ll/ܳۨۜ;->ᩴ֫:I

    if-ltz v0, :cond_10

    sget-object v0, Ll/ܿۨۜ;->ۤ:Ll/ܿۨۜ;

    goto :goto_3

    :cond_10
    sget-object v0, Ll/ܿۨۜ;->ۗ:Ll/ܿۨۜ;

    :goto_3
    iput-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    return-void

    :cond_11
    const/4 v1, 0x2

    .line 153
    iget v10, v13, Ll/ܳۨۜ;->֨֫:F

    if-ne v0, v1, :cond_39

    .line 154
    iget-wide v11, v13, Ll/ܳۨۜ;->᩹:J

    .line 155
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    iput-wide v0, v13, Ll/ܳۨۜ;->᩹:J

    .line 156
    invoke-direct/range {p0 .. p1}, Ll/ܳۨۜ;->ۧ(Landroid/view/MotionEvent;)V

    .line 157
    iget-boolean v0, v13, Ll/ܳۨۜ;->ۗ֫:Z

    if-eqz v0, :cond_12

    goto/16 :goto_20

    .line 158
    :cond_12
    iget-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object v1, Ll/ܿۨۜ;->ۤ:Ll/ܿۨۜ;

    iget v2, v13, Ll/ܳۨۜ;->ܽ:F

    if-ne v0, v1, :cond_20

    iget v0, v13, Ll/ܳۨۜ;->ᩴ֫:I

    if-ltz v0, :cond_20

    .line 159
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v14

    .line 272
    iget v0, v13, Ll/ܳۨۜ;->᩵:F

    iget v1, v13, Ll/ܳۨۜ;->֡֫:F

    add-float v3, v0, v1

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v8, v3, v4

    .line 273
    iget v5, v13, Ll/ܳۨۜ;->֡:F

    iget v7, v13, Ll/ܳۨۜ;->ۚ֫:F

    add-float v16, v5, v7

    const/16 v17, 0x0

    mul-float v3, v16, v4

    sub-float/2addr v0, v1

    float-to-double v0, v0

    sub-float/2addr v5, v7

    float-to-double v4, v5

    .line 274
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v5, v0

    .line 403
    iget v0, v13, Ll/ܳۨۜ;->ۚ֫:F

    iget v1, v13, Ll/ܳۨۜ;->֡:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    iget v4, v13, Ll/ܳۨۜ;->֡֫:F

    iget v7, v13, Ll/ܳۨۜ;->᩵:F

    sub-float/2addr v4, v7

    float-to-double v6, v4

    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v7, v0

    sub-long v0, v14, v11

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v6, v10, v4

    const/high16 v4, 0x42400000    # 48.0f

    mul-float v2, v2, v4

    .line 305
    invoke-static {v6, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 307
    iget v4, v13, Ll/ܳۨۜ;->۠֫:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpg-float v4, v4, v2

    if-lez v4, :cond_18

    cmpg-float v2, v5, v2

    if-gtz v2, :cond_13

    goto/16 :goto_5

    .line 312
    :cond_13
    iget v2, v13, Ll/ܳۨۜ;->֫֫:F

    sub-float v2, v7, v2

    const/high16 v4, 0x44070000    # 540.0f

    add-float/2addr v2, v4

    const/high16 v4, 0x43b40000    # 360.0f

    rem-float/2addr v2, v4

    const/high16 v4, 0x43340000    # 180.0f

    sub-float/2addr v2, v4

    .line 313
    iget-boolean v4, v13, Ll/ܳۨۜ;->ܿ֫:Z

    if-eqz v4, :cond_14

    move v6, v2

    move/from16 v18, v7

    goto/16 :goto_7

    .line 314
    :cond_14
    iget v4, v13, Ll/ܳۨۜ;->ܰ:F

    add-float/2addr v4, v2

    iput v4, v13, Ll/ܳۨۜ;->ܰ:F

    .line 315
    iget v4, v13, Ll/ܳۨۜ;->ۖ֫:F

    cmpl-float v18, v4, v17

    if-lez v18, :cond_15

    div-float v4, v5, v4

    sub-float/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const v18, 0x3da3d70a    # 0.08f

    cmpl-float v4, v4, v18

    if-ltz v4, :cond_15

    const/4 v4, 0x1

    .line 316
    iput-boolean v4, v13, Ll/ܳۨۜ;->ۘ֫:Z

    :cond_15
    move/from16 v18, v7

    const-wide/16 v6, 0x0

    .line 319
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    neg-long v0, v0

    long-to-double v0, v0

    const-wide/high16 v6, 0x4054000000000000L    # 80.0

    div-double/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 320
    iget v1, v13, Ll/ܳۨۜ;->ܽ֫:F

    mul-float v1, v1, v0

    float-to-double v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    double-to-float v6, v6

    add-float/2addr v1, v6

    iput v1, v13, Ll/ܳۨۜ;->ܽ֫:F

    .line 321
    iget v1, v13, Ll/ܳۨۜ;->ᩳ֫:F

    mul-float v1, v1, v0

    iget v0, v13, Ll/ܳۨۜ;->۠֫:F

    div-float v0, v5, v0

    float-to-double v6, v0

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    double-to-float v0, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    add-float/2addr v0, v1

    iput v0, v13, Ll/ܳۨۜ;->ᩳ֫:F

    .line 322
    iget-boolean v0, v13, Ll/ܳۨۜ;->ۘ֫:Z

    if-eqz v0, :cond_16

    const/high16 v0, 0x41a00000    # 20.0f

    goto :goto_4

    :cond_16
    const/high16 v0, 0x41400000    # 12.0f

    .line 324
    :goto_4
    iget v1, v13, Ll/ܳۨۜ;->ܰ:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v0

    if-lez v1, :cond_19

    iget v1, v13, Ll/ܳۨۜ;->ܰ:F

    mul-float v1, v1, v2

    cmpg-float v1, v1, v17

    if-lez v1, :cond_19

    iget-boolean v1, v13, Ll/ܳۨۜ;->ۘ֫:Z

    if-eqz v1, :cond_17

    iget v1, v13, Ll/ܳۨۜ;->ܽ֫:F

    .line 325
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v6, v13, Ll/ܳۨۜ;->ᩳ֫:F

    const v7, 0x3f99999a    # 1.2f

    mul-float v6, v6, v7

    cmpg-float v1, v1, v6

    if-gtz v1, :cond_17

    goto :goto_6

    :cond_17
    const/4 v1, 0x1

    .line 328
    iput-boolean v1, v13, Ll/ܳۨۜ;->ܿ֫:Z

    .line 330
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v2, v13, Ll/ܳۨۜ;->ܰ:F

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float/2addr v2, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget v1, v13, Ll/ܳۨۜ;->ܰ:F

    invoke-static {v0, v1}, Ljava/lang/Math;->copySign(FF)F

    move-result v0

    move v6, v0

    goto :goto_7

    :cond_18
    :goto_5
    move/from16 v18, v7

    const/4 v0, 0x0

    .line 335
    iput-boolean v0, v13, Ll/ܳۨۜ;->ۘ֫:Z

    iput-boolean v0, v13, Ll/ܳۨۜ;->ܿ֫:Z

    const/4 v0, 0x0

    .line 336
    iput v0, v13, Ll/ܳۨۜ;->ᩳ֫:F

    iput v0, v13, Ll/ܳۨۜ;->ܽ֫:F

    iput v0, v13, Ll/ܳۨۜ;->ܰ:F

    .line 337
    iput v5, v13, Ll/ܳۨۜ;->ۖ֫:F

    :cond_19
    :goto_6
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 277
    :goto_7
    invoke-virtual {v9}, Ll/۠ܰۜ;->᩻()Ll/ۨܰۜ;

    move-result-object v1

    .line 278
    iget v0, v13, Ll/ܳۨۜ;->۠֫:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1f

    cmpl-float v0, v5, v2

    if-lez v0, :cond_1f

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 279
    iget v0, v13, Ll/ܳۨۜ;->֨:F

    sub-float v0, v3, v0

    .line 281
    iget-boolean v2, v13, Ll/ܳۨۜ;->ܳ֫:Z

    if-nez v2, :cond_1d

    .line 342
    iget-boolean v2, v13, Ll/ܳۨۜ;->ܿ֫:Z

    if-nez v2, :cond_1a

    invoke-virtual {v1}, Ll/ۨܰۜ;->ۘ()F

    move-result v2

    const/4 v4, 0x0

    cmpl-float v2, v2, v4

    if-nez v2, :cond_1a

    const/4 v2, 0x0

    .line 343
    iput-boolean v2, v13, Ll/ܳۨۜ;->᩻֫:Z

    goto/16 :goto_8

    .line 346
    :cond_1a
    iget-boolean v2, v13, Ll/ܳۨۜ;->᩻֫:Z

    if-eqz v2, :cond_1b

    iget v2, v13, Ll/ܳۨۜ;->֨:F

    cmpg-float v2, v3, v2

    if-gtz v2, :cond_1c

    :cond_1b
    const/4 v2, 0x1

    .line 347
    iput-boolean v2, v13, Ll/ܳۨۜ;->᩻֫:Z

    .line 348
    iget v2, v13, Ll/ܳۨۜ;->ۚ:F

    iput v2, v13, Ll/ܳۨۜ;->᩻:F

    .line 349
    iget v2, v13, Ll/ܳۨۜ;->֨:F

    iput v2, v13, Ll/ܳۨۜ;->ۜ:F

    .line 350
    iget v4, v13, Ll/ܳۨۜ;->ۗ:F

    iput v4, v13, Ll/ܳۨۜ;->ᩳ:F

    .line 351
    iget v4, v13, Ll/ܳۨۜ;->᩶:F

    iput v4, v13, Ll/ܳۨۜ;->ܿ:F

    .line 352
    iget v4, v13, Ll/ܳۨۜ;->۠֫:F

    iput v4, v13, Ll/ܳۨۜ;->ܳ:F

    cmpg-float v2, v3, v2

    if-gtz v2, :cond_1c

    .line 354
    iput v8, v13, Ll/ܳۨۜ;->᩻:F

    .line 355
    iput v3, v13, Ll/ܳۨۜ;->ۜ:F

    .line 356
    iget v2, v13, Ll/ܳۨۜ;->֡:F

    iput v2, v13, Ll/ܳۨۜ;->ᩳ:F

    .line 357
    iget v2, v13, Ll/ܳۨۜ;->ۚ֫:F

    iput v2, v13, Ll/ܳۨۜ;->ܿ:F

    .line 358
    iput v5, v13, Ll/ܳۨۜ;->ܳ:F

    goto :goto_8

    .line 362
    :cond_1c
    iget v2, v13, Ll/ܳۨۜ;->᩻:F

    sub-float v2, v8, v2

    iget v4, v13, Ll/ܳۨۜ;->ۜ:F

    sub-float v4, v3, v4

    cmpl-float v7, v4, v10

    if-lez v7, :cond_1d

    .line 363
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v7, 0x3f99999a    # 1.2f

    mul-float v2, v2, v7

    cmpl-float v2, v4, v2

    if-ltz v2, :cond_1d

    iget v2, v13, Ll/ܳۨۜ;->ܳ:F

    sub-float v2, v5, v2

    .line 364
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float v2, v2, v7

    add-float/2addr v2, v10

    cmpl-float v2, v4, v2

    if-lez v2, :cond_1d

    iget v2, v13, Ll/ܳۨۜ;->֡:F

    iget v4, v13, Ll/ܳۨۜ;->ᩳ:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_1d

    iget v2, v13, Ll/ܳۨۜ;->ۚ֫:F

    iget v4, v13, Ll/ܳۨۜ;->ܿ:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_1d

    const/4 v2, 0x1

    .line 282
    iput-boolean v2, v13, Ll/ܳۨۜ;->ܳ֫:Z

    .line 284
    iget v2, v13, Ll/ܳۨۜ;->ۜ:F

    sub-float v2, v3, v2

    sub-float/2addr v2, v10

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 285
    invoke-direct {v13, v11, v12}, Ll/ܳۨۜ;->ۧ(J)V

    :cond_1d
    :goto_8
    move v9, v0

    .line 287
    iget-boolean v0, v13, Ll/ܳۨۜ;->ܳ֫:Z

    if-eqz v0, :cond_1e

    .line 288
    iget v0, v13, Ll/ܳۨۜ;->۠֫:F

    div-float v2, v5, v0

    iget v4, v13, Ll/ܳۨۜ;->ۚ:F

    iget v7, v13, Ll/ܳۨۜ;->֨:F

    move-object/from16 v0, p0

    move v10, v3

    move v3, v6

    move v6, v5

    move v5, v7

    move v7, v6

    move v6, v8

    move/from16 v19, v7

    move/from16 v20, v18

    move v7, v10

    move/from16 p1, v8

    move v8, v9

    move/from16 v16, v10

    move-wide v9, v11

    move-wide v11, v14

    invoke-direct/range {v0 .. v12}, Ll/ܳۨۜ;->֫(Ll/ۨܰۜ;FFFFFFFJJ)V

    move/from16 v3, p1

    move/from16 v8, v19

    goto :goto_a

    :cond_1e
    move/from16 v16, v3

    move/from16 v19, v5

    move/from16 p1, v8

    move/from16 v20, v18

    .line 291
    iget v0, v13, Ll/ܳۨۜ;->۠֫:F

    move/from16 v8, v19

    div-float v2, v8, v0

    iget v4, v13, Ll/ܳۨۜ;->ۚ:F

    iget v5, v13, Ll/ܳۨۜ;->֨:F

    move-object/from16 v0, p0

    move v3, v6

    move/from16 v6, p1

    move/from16 v7, v16

    invoke-direct/range {v0 .. v7}, Ll/ܳۨۜ;->֫(Ll/ۨܰۜ;FFFFFF)V

    goto :goto_9

    :cond_1f
    move/from16 v16, v3

    move/from16 p1, v8

    move/from16 v20, v18

    move v8, v5

    :goto_9
    move/from16 v3, p1

    .line 294
    :goto_a
    iput v3, v13, Ll/ܳۨۜ;->ۚ:F

    move/from16 v0, v16

    .line 295
    iput v0, v13, Ll/ܳۨۜ;->֨:F

    .line 296
    iput v8, v13, Ll/ܳۨۜ;->۠֫:F

    move/from16 v0, v20

    .line 297
    iput v0, v13, Ll/ܳۨۜ;->֫֫:F

    .line 298
    iget v0, v13, Ll/ܳۨۜ;->᩵:F

    iput v0, v13, Ll/ܳۨۜ;->ۙ:F

    .line 299
    iget v0, v13, Ll/ܳۨۜ;->֡:F

    iput v0, v13, Ll/ܳۨۜ;->ۗ:F

    .line 300
    iget v0, v13, Ll/ܳۨۜ;->ۚ֫:F

    iput v0, v13, Ll/ܳۨۜ;->᩶:F

    return-void

    .line 162
    :cond_20
    iget v3, v13, Ll/ܳۨۜ;->᩵:F

    iget v4, v13, Ll/ܳۨۜ;->ۙ:F

    sub-float v7, v3, v4

    iget v4, v13, Ll/ܳۨۜ;->֡:F

    iget v5, v13, Ll/ܳۨۜ;->ۗ:F

    sub-float v8, v4, v5

    .line 163
    iget v5, v13, Ll/ܳۨۜ;->ܺ:F

    sub-float v5, v3, v5

    iget v14, v13, Ll/ܳۨۜ;->ۖ:F

    sub-float v14, v4, v14

    .line 164
    iput v3, v13, Ll/ܳۨۜ;->ۙ:F

    .line 165
    iput v4, v13, Ll/ܳۨۜ;->ۗ:F

    .line 166
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v15, v7, v4

    if-nez v15, :cond_21

    cmpl-float v4, v8, v4

    if-eqz v4, :cond_22

    .line 167
    :cond_21
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    iput-wide v0, v13, Ll/ܳۨۜ;->᩸:J

    :cond_22
    cmpl-float v0, v3, v10

    if-lez v0, :cond_23

    const/4 v0, 0x1

    .line 169
    iput-boolean v0, v13, Ll/ܳۨۜ;->ۤ:Z

    const/4 v0, 0x0

    .line 170
    iput-boolean v0, v13, Ll/ܳۨۜ;->᩸֫:Z

    .line 171
    invoke-direct/range {p0 .. p0}, Ll/ܳۨۜ;->᩻()V

    .line 173
    :cond_23
    invoke-virtual {v9}, Ll/۠ܰۜ;->᩻()Ll/ۨܰۜ;

    move-result-object v1

    .line 174
    iget-boolean v0, v13, Ll/ܳۨۜ;->᩵֫:Z

    if-eqz v0, :cond_24

    iget-boolean v0, v13, Ll/ܳۨۜ;->᩺:Z

    if-nez v0, :cond_24

    iget-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object v3, Ll/ܿۨۜ;->۬:Ll/ܿۨۜ;

    if-ne v0, v3, :cond_24

    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v10

    if-lez v0, :cond_24

    if-eqz v1, :cond_24

    .line 175
    invoke-virtual {v1}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_24

    sget-object v0, Ll/ܿۨۜ;->۫:Ll/ܿۨۜ;

    iput-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    .line 176
    :cond_24
    iget-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object v3, Ll/ܿۨۜ;->۫:Ll/ܿۨۜ;

    if-ne v0, v3, :cond_25

    const/high16 v0, 0x43200000    # 160.0f

    mul-float v2, v2, v0

    div-float/2addr v8, v2

    float-to-double v2, v8

    .line 177
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v2

    double-to-float v2, v2

    iget v6, v13, Ll/ܳۨۜ;->ܺ:F

    iget v7, v13, Ll/ܳۨۜ;->ۖ:F

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move v4, v6

    move v5, v7

    .line 387
    invoke-direct/range {v0 .. v7}, Ll/ܳۨۜ;->֫(Ll/ۨܰۜ;FFFFFF)V

    return-void

    .line 180
    :cond_25
    iget-boolean v2, v13, Ll/ܳۨۜ;->ۤ:Z

    if-nez v2, :cond_26

    sget-object v2, Ll/ܿۨۜ;->۬:Ll/ܿۨۜ;

    if-ne v0, v2, :cond_26

    goto/16 :goto_20

    .line 181
    :cond_26
    iget-boolean v0, v13, Ll/ܳۨۜ;->ܳ֫:Z

    if-eqz v0, :cond_27

    .line 182
    sget-object v0, Ll/ܿۨۜ;->ۗ:Ll/ܿۨۜ;

    iput-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    .line 183
    iget v9, v13, Ll/ܳۨۜ;->᩵:F

    sub-float v4, v9, v7

    iget v7, v13, Ll/ܳۨۜ;->֡:F

    sub-float v5, v7, v8

    .line 184
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v14

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move v6, v9

    move-wide v9, v11

    move-wide v11, v14

    .line 183
    invoke-direct/range {v0 .. v12}, Ll/ܳۨۜ;->֫(Ll/ۨܰۜ;FFFFFFFJJ)V

    return-void

    .line 187
    :cond_27
    iget-boolean v0, v13, Ll/ܳۨۜ;->ܶ:Z

    if-eqz v0, :cond_28

    .line 188
    sget-object v0, Ll/ܿۨۜ;->ۙ:Ll/ܿۨۜ;

    iput-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    const/4 v0, 0x1

    .line 189
    iput v0, v13, Ll/ܳۨۜ;->֫:I

    const/4 v0, 0x0

    .line 190
    iput-boolean v0, v13, Ll/ܳۨۜ;->ܶ:Z

    goto :goto_b

    :cond_28
    const/4 v0, 0x0

    .line 191
    iget-boolean v2, v13, Ll/ܳۨۜ;->۠:Z

    if-eqz v2, :cond_29

    .line 192
    sget-object v2, Ll/ܿۨۜ;->᩹:Ll/ܿۨۜ;

    iput-object v2, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    const/4 v2, 0x2

    .line 193
    iput v2, v13, Ll/ܳۨۜ;->֫:I

    .line 194
    iput-boolean v0, v13, Ll/ܳۨۜ;->۠:Z

    .line 196
    :cond_29
    :goto_b
    iget-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object v2, Ll/ܿۨۜ;->ۙ:Ll/ܿۨۜ;

    if-ne v0, v2, :cond_2b

    move-object/from16 v0, p0

    move v1, v7

    move v2, v7

    move v3, v8

    move-wide v4, v11

    move-object/from16 v6, p1

    .line 197
    invoke-direct/range {v0 .. v6}, Ll/ܳۨۜ;->֫(FFFJLandroid/view/MotionEvent;)V

    .line 444
    invoke-virtual {v9}, Ll/۠ܰۜ;->᩷()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_2a

    .line 445
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_2a

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_2a

    .line 446
    invoke-virtual {v9}, Ll/۠ܰۜ;->ۢ()V

    .line 447
    sget-object v1, Ll/ܿۨۜ;->ۗ:Ll/ܿۨۜ;

    iput-object v1, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    const/4 v1, 0x0

    .line 448
    iput v1, v13, Ll/ܳۨۜ;->ۘ:F

    add-float/2addr v7, v0

    .line 449
    invoke-virtual {v9}, Ll/۠ܰۜ;->᩻()Ll/ۨܰۜ;

    move-result-object v0

    invoke-direct {v13, v7, v8, v0}, Ll/ܳۨۜ;->֫(FFLl/ۨܰۜ;)V

    return-void

    .line 450
    :cond_2a
    invoke-virtual {v9, v7}, Ll/۠ܰۜ;->ۧ(F)V

    return-void

    .line 201
    :cond_2b
    sget-object v2, Ll/ܿۨۜ;->᩹:Ll/ܿۨۜ;

    if-ne v0, v2, :cond_2c

    move-object/from16 v0, p0

    move v1, v8

    move v2, v7

    move v3, v8

    move-wide v4, v11

    move-object/from16 v6, p1

    .line 202
    invoke-direct/range {v0 .. v6}, Ll/ܳۨۜ;->֫(FFFJLandroid/view/MotionEvent;)V

    .line 203
    invoke-virtual {v9, v8}, Ll/۠ܰۜ;->֫(F)V

    return-void

    .line 206
    :cond_2c
    sget-object v3, Ll/ܿۨۜ;->ۗ:Ll/ܿۨۜ;

    if-ne v0, v3, :cond_2e

    .line 208
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const v4, 0x3f99999a    # 1.2f

    mul-float v5, v5, v4

    cmpl-float v0, v0, v5

    if-lez v0, :cond_2d

    const/4 v0, 0x1

    goto :goto_c

    :cond_2d
    const/4 v0, 0x2

    :goto_c
    iput v0, v13, Ll/ܳۨۜ;->֫:I

    goto :goto_10

    .line 261
    :cond_2e
    iget v0, v13, Ll/ܳۨۜ;->֫:I

    if-eqz v0, :cond_2f

    goto :goto_10

    .line 262
    :cond_2f
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpl-float v6, v0, v10

    const v4, 0x3f99999a    # 1.2f

    if-lez v6, :cond_30

    mul-float v6, v5, v4

    cmpl-float v6, v0, v6

    if-ltz v6, :cond_30

    const/4 v0, 0x1

    .line 263
    iput v0, v13, Ll/ܳۨۜ;->֫:I

    goto :goto_10

    :cond_30
    cmpl-float v6, v5, v10

    if-lez v6, :cond_31

    mul-float v4, v4, v0

    cmpl-float v4, v5, v4

    if-ltz v4, :cond_31

    const/4 v0, 0x2

    .line 264
    iput v0, v13, Ll/ܳۨۜ;->֫:I

    goto :goto_10

    .line 265
    :cond_31
    invoke-static {v0, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v10

    cmpl-float v4, v4, v6

    if-ltz v4, :cond_35

    cmpl-float v4, v0, v5

    if-lez v4, :cond_32

    goto :goto_e

    :cond_32
    cmpl-float v0, v5, v0

    if-lez v0, :cond_33

    goto :goto_d

    :cond_33
    if-eqz v1, :cond_34

    .line 267
    invoke-virtual {v1}, Ll/ۨܰۜ;->֨()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-virtual {v1}, Ll/ۨܰۜ;->ۚ()Z

    move-result v0

    if-nez v0, :cond_34

    :goto_d
    const/4 v0, 0x2

    goto :goto_f

    :cond_34
    :goto_e
    const/4 v0, 0x1

    :goto_f
    iput v0, v13, Ll/ܳۨۜ;->֫:I

    .line 210
    :cond_35
    :goto_10
    iget-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object v4, Ll/ܿۨۜ;->۬:Ll/ܿۨۜ;

    if-ne v0, v4, :cond_36

    iget-boolean v0, v13, Ll/ܳۨۜ;->᩺:Z

    if-nez v0, :cond_36

    iget v0, v13, Ll/ܳۨۜ;->֫:I

    const/4 v5, 0x2

    if-ne v0, v5, :cond_36

    const/4 v0, 0x0

    cmpl-float v5, v14, v0

    if-lez v5, :cond_36

    if-eqz v1, :cond_36

    .line 211
    invoke-virtual {v1}, Ll/ۨܰۜ;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_36

    .line 212
    iput-object v2, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    .line 213
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    move-result v1

    iput v1, v13, Ll/ܳۨۜ;->ۛ:F

    sub-float/2addr v14, v10

    .line 214
    invoke-static {v0, v14}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-virtual {v9, v0}, Ll/۠ܰۜ;->֫(F)V

    return-void

    .line 217
    :cond_36
    iget-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    if-ne v0, v4, :cond_38

    if-eqz v1, :cond_37

    .line 218
    invoke-virtual {v1}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_37

    invoke-virtual {v1, v7, v8}, Ll/ۨܰۜ;->֫(FF)Z

    move-result v0

    if-eqz v0, :cond_37

    iput-object v3, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    goto :goto_11

    .line 219
    :cond_37
    iget v0, v13, Ll/ܳۨۜ;->֫:I

    if-nez v0, :cond_38

    goto/16 :goto_20

    .line 221
    :cond_38
    :goto_11
    invoke-direct {v13, v7, v8, v1}, Ll/ܳۨۜ;->֫(FFLl/ۨܰۜ;)V

    return-void

    :cond_39
    const/4 v1, 0x1

    const/high16 v11, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_52

    .line 456
    iget-object v0, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    iget v12, v13, Ll/ܳۨۜ;->۬:F

    const/16 v14, 0x3e8

    const-wide/16 v15, 0x50

    if-eqz v0, :cond_3a

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    iget-wide v2, v13, Ll/ܳۨۜ;->᩸:J

    sub-long/2addr v0, v2

    cmp-long v2, v0, v15

    if-gtz v2, :cond_3a

    .line 457
    iget-object v0, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    invoke-virtual {v0, v14, v12}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 458
    iget-object v0, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    iget v1, v13, Ll/ܳۨۜ;->ᩴ:I

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    .line 459
    iget-object v1, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    iget v2, v13, Ll/ܳۨۜ;->ᩴ:I

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    move/from16 v17, v0

    goto :goto_12

    :cond_3a
    const/4 v1, 0x0

    const/4 v0, 0x0

    const/16 v17, 0x0

    .line 461
    :goto_12
    iget-boolean v0, v13, Ll/ܳۨۜ;->ܳ֫:Z

    if-eqz v0, :cond_3d

    iget-object v0, v13, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_3d

    .line 462
    iget v0, v13, Ll/ܳۨۜ;->ᩴ:I

    invoke-virtual {v6, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ltz v0, :cond_3b

    .line 463
    invoke-virtual {v6, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iget v1, v13, Ll/ܳۨۜ;->֡:F

    sub-float/2addr v0, v1

    move v1, v0

    goto :goto_13

    :cond_3b
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 464
    :goto_13
    iget-wide v2, v13, Ll/ܳۨۜ;->ۢ֫:J

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ܳۨۜ;->֫(FJJ)V

    .line 466
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    iget-wide v2, v13, Ll/ܳۨۜ;->᩷֫:J

    sub-long/2addr v0, v2

    cmp-long v2, v0, v15

    if-gtz v2, :cond_3c

    .line 467
    iget-object v0, v13, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v0, v14, v12}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 468
    iget-object v0, v13, Ll/ܳۨۜ;->ܺ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v1

    goto :goto_14

    :cond_3c
    const/4 v0, 0x0

    const/4 v1, 0x0

    goto :goto_15

    :cond_3d
    :goto_14
    const/4 v0, 0x0

    .line 471
    :goto_15
    iput v0, v13, Ll/ܳۨۜ;->ۧ֫:I

    .line 472
    iput v8, v13, Ll/ܳۨۜ;->ᩴ֫:I

    iput v8, v13, Ll/ܳۨۜ;->ᩴ:I

    .line 579
    iget-object v0, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_3e

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v7, v13, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    .line 474
    :cond_3e
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_3f

    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 475
    :cond_3f
    iget-boolean v0, v13, Ll/ܳۨۜ;->ۗ֫:Z

    if-eqz v0, :cond_40

    goto/16 :goto_20

    .line 476
    :cond_40
    iget-boolean v0, v13, Ll/ܳۨۜ;->ܶ:Z

    if-nez v0, :cond_51

    iget-boolean v0, v13, Ll/ܳۨۜ;->۠:Z

    if-eqz v0, :cond_41

    goto/16 :goto_1e

    .line 478
    :cond_41
    iget-boolean v0, v13, Ll/ܳۨۜ;->ܳ֫:Z

    if-eqz v0, :cond_42

    .line 479
    invoke-direct {v13, v1}, Ll/ܳۨۜ;->֫(F)V

    goto/16 :goto_1c

    .line 480
    :cond_42
    iget-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object v2, Ll/ܿۨۜ;->ۙ:Ll/ܿۨۜ;

    if-ne v0, v2, :cond_48

    .line 481
    invoke-virtual {v9}, Ll/۠ܰۜ;->᩷()F

    move-result v0

    .line 482
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v2, v13, Ll/ܳۨۜ;->ۨ:F

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_43

    const/4 v1, 0x1

    goto :goto_16

    :cond_43
    const/4 v1, 0x0

    :goto_16
    if-eqz v1, :cond_44

    .line 483
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->signum(F)F

    move-result v2

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v3

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_44

    goto :goto_17

    .line 484
    :cond_44
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x3e800000    # 0.25f

    mul-float v3, v3, v4

    cmpl-float v2, v2, v3

    if-gez v2, :cond_46

    if-eqz v1, :cond_45

    .line 485
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    mul-float v10, v10, v11

    cmpl-float v1, v1, v10

    if-ltz v1, :cond_45

    goto :goto_18

    :cond_45
    :goto_17
    const/4 v8, 0x0

    goto :goto_19

    :cond_46
    :goto_18
    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_47

    const/4 v8, 0x1

    .line 486
    :cond_47
    :goto_19
    invoke-virtual {v9, v8}, Ll/۠ܰۜ;->ܿ(I)V

    goto/16 :goto_1c

    .line 487
    :cond_48
    sget-object v2, Ll/ܿۨۜ;->᩹:Ll/ܿۨۜ;

    if-ne v0, v2, :cond_49

    .line 488
    invoke-direct {v13, v1}, Ll/ܳۨۜ;->֫(F)V

    goto/16 :goto_1c

    .line 489
    :cond_49
    sget-object v2, Ll/ܿۨۜ;->ۤ:Ll/ܿۨۜ;

    if-eq v0, v2, :cond_50

    sget-object v2, Ll/ܿۨۜ;->۫:Ll/ܿۨۜ;

    if-ne v0, v2, :cond_4a

    goto/16 :goto_1d

    .line 491
    :cond_4a
    sget-object v2, Ll/ܿۨۜ;->ۗ:Ll/ܿۨۜ;

    if-ne v0, v2, :cond_4d

    .line 492
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, v13, Ll/ܳۨۜ;->۫:F

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_4b

    move/from16 v0, v17

    goto :goto_1a

    :cond_4b
    const/16 v17, 0x0

    const/4 v0, 0x0

    :goto_1a
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v2, v3, v2

    if-ltz v2, :cond_4c

    goto :goto_1b

    :cond_4c
    const/4 v1, 0x0

    :goto_1b
    invoke-virtual {v9, v0, v1}, Ll/۠ܰۜ;->֫(FF)V

    goto :goto_1c

    .line 493
    :cond_4d
    sget-object v1, Ll/ܿۨۜ;->۬:Ll/ܿۨۜ;

    if-ne v0, v1, :cond_4f

    iget-boolean v0, v13, Ll/ܳۨۜ;->᩸֫:Z

    if-eqz v0, :cond_4f

    iget-boolean v0, v13, Ll/ܳۨۜ;->ۤ:Z

    if-nez v0, :cond_4f

    .line 494
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    iget-wide v2, v13, Ll/ܳۨۜ;->ۡ:J

    sub-long/2addr v0, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v2

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_4f

    .line 495
    sget-object v0, Ll/ܿۨۜ;->᩶:Ll/ܿۨۜ;

    iput-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    .line 496
    iget-boolean v0, v13, Ll/ܳۨۜ;->᩵֫:Z

    if-eqz v0, :cond_4e

    iget v0, v13, Ll/ܳۨۜ;->ܺ:F

    iget v1, v13, Ll/ܳۨۜ;->ۖ:F

    invoke-virtual {v9, v0, v1}, Ll/۠ܰۜ;->ܽ(FF)V

    goto :goto_1c

    :cond_4e
    const/4 v0, 0x1

    .line 498
    iput-boolean v0, v13, Ll/ܳۨۜ;->۟:Z

    .line 499
    iget v0, v13, Ll/ܳۨۜ;->ܺ:F

    iput v0, v13, Ll/ܳۨۜ;->᩶֫:F

    .line 500
    iget v0, v13, Ll/ܳۨۜ;->ۖ:F

    iput v0, v13, Ll/ܳۨۜ;->ۙ֫:F

    .line 501
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    iput-wide v0, v13, Ll/ܳۨۜ;->᩹֫:J

    .line 502
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v0

    int-to-long v0, v0

    iget-object v2, v13, Ll/ܳۨۜ;->ۧ:Ll/᩶ܰۜ;

    invoke-virtual {v9, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_1c
    const/4 v0, 0x0

    goto :goto_1f

    .line 505
    :cond_4f
    sget-object v0, Ll/ܿۨۜ;->᩶:Ll/ܿۨۜ;

    iput-object v0, v13, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    const/4 v0, 0x0

    .line 506
    invoke-virtual {v9, v0}, Ll/۠ܰۜ;->֫(Z)V

    goto :goto_1f

    :cond_50
    :goto_1d
    const/4 v0, 0x0

    .line 490
    invoke-virtual {v9, v0}, Ll/۠ܰۜ;->֫(Z)V

    goto :goto_1f

    :cond_51
    :goto_1e
    const/4 v0, 0x0

    .line 477
    invoke-virtual {v9, v0}, Ll/۠ܰۜ;->֫(Z)V

    .line 508
    :goto_1f
    iput-boolean v0, v13, Ll/ܳۨۜ;->᩵֫:Z

    :cond_52
    :goto_20
    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    const/4 v0, 0x0

    .line 89
    iput-boolean v0, p0, Ll/ܳۨۜ;->۠:Z

    iput-boolean v0, p0, Ll/ܳۨۜ;->ܶ:Z

    const/4 v1, 0x0

    .line 90
    iput v1, p0, Ll/ܳۨۜ;->ۘ:F

    if-eqz p1, :cond_2

    .line 91
    iget-boolean v1, p0, Ll/ܳۨۜ;->ۗ֫:Z

    if-eqz v1, :cond_2

    iget v1, p0, Ll/ܳۨۜ;->ۧ֫:I

    if-lez v1, :cond_2

    .line 92
    iput-boolean v0, p0, Ll/ܳۨۜ;->ۗ֫:Z

    const/4 p1, 0x1

    .line 93
    iput-boolean p1, p0, Ll/ܳۨۜ;->᩺:Z

    .line 94
    invoke-direct {p0}, Ll/ܳۨۜ;->ۜ()V

    .line 554
    iget-object p1, p0, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 96
    :cond_0
    iget p1, p0, Ll/ܳۨۜ;->ᩴ֫:I

    if-ltz p1, :cond_1

    sget-object p1, Ll/ܿۨۜ;->ۤ:Ll/ܿۨۜ;

    goto :goto_0

    :cond_1
    sget-object p1, Ll/ܿۨۜ;->ۗ:Ll/ܿۨۜ;

    :goto_0
    iput-object p1, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    return-void

    .line 98
    :cond_2
    iput-boolean v0, p0, Ll/ܳۨۜ;->ۗ֫:Z

    .line 99
    sget-object v1, Ll/ܿۨۜ;->᩶:Ll/ܿۨۜ;

    iput-object v1, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    .line 100
    invoke-direct {p0}, Ll/ܳۨۜ;->ܳ()V

    .line 101
    iget-object v1, p0, Ll/ܳۨۜ;->۫֫:Ll/۠ܰۜ;

    invoke-virtual {v1}, Ll/۠ܰۜ;->᩻()Ll/ۨܰۜ;

    move-result-object v2

    if-eqz p1, :cond_3

    .line 103
    iget p1, p0, Ll/ܳۨۜ;->ۧ֫:I

    if-nez p1, :cond_3

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ll/ۨܰۜ;->۠()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 104
    invoke-virtual {v2}, Ll/ۨܰۜ;->ۘ()F

    move-result p1

    invoke-virtual {v2}, Ll/ۨܰۜ;->ᩳ()F

    move-result v2

    cmpl-float p1, p1, v2

    if-eqz p1, :cond_3

    .line 105
    invoke-virtual {v1, v0}, Ll/۠ܰۜ;->֫(Z)V

    :cond_3
    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 60
    iget v0, p0, Ll/ܳۨۜ;->ۧ֫:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 57
    iget-object v0, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object v1, Ll/ܿۨۜ;->ۗ:Ll/ܿۨۜ;

    if-eq v0, v1, :cond_1

    sget-object v1, Ll/ܿۨۜ;->ۤ:Ll/ܿۨۜ;

    if-eq v0, v1, :cond_1

    sget-object v1, Ll/ܿۨۜ;->۫:Ll/ܿۨۜ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()V
    .locals 2

    .line 64
    iget-object v0, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    sget-object v1, Ll/ܿۨۜ;->۬:Ll/ܿۨۜ;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ܳۨۜ;->ۤ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ܳۨۜ;->ܶ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ܳۨۜ;->۠:Z

    if-nez v0, :cond_0

    .line 65
    invoke-direct {p0}, Ll/ܳۨۜ;->ۜ()V

    const/4 v0, 0x0

    .line 66
    iput-boolean v0, p0, Ll/ܳۨۜ;->ۤ:Z

    .line 554
    iget-object v0, p0, Ll/ܳۨۜ;->۬֫:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 84
    invoke-direct {p0}, Ll/ܳۨۜ;->᩻()V

    .line 85
    sget-object v0, Ll/ܿۨۜ;->ۛ:Ll/ܿۨۜ;

    iput-object v0, p0, Ll/ܳۨۜ;->ܶ֫:Ll/ܿۨۜ;

    return-void
.end method
