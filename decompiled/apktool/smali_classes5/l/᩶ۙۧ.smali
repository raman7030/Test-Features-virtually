.class public final Ll/᩶ۙۧ;
.super Ljava/lang/Object;
.source "B66A"

# interfaces
.implements Ll/᩷۬ۧ;


# instance fields
.field public final synthetic ֫:Ll/֫ۗۧ;


# direct methods
.method public constructor <init>(Ll/֫ۗۧ;)V
    .locals 0

    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۙۧ;->֫:Ll/֫ۗۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/MotionEvent;)V
    .locals 8

    .line 365
    iget-object v0, p0, Ll/᩶ۙۧ;->֫:Ll/֫ۗۧ;

    iget-object v1, v0, Ll/֫ۗۧ;->ۚ:Ljava/lang/Runnable;

    iget-object v2, v0, Ll/֫ۗۧ;->ۜ:Ll/֨ۛ;

    invoke-virtual {v2, p1}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    .line 370
    iget-object v2, v0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_0

    .line 371
    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 373
    :cond_0
    iget v2, v0, Ll/֫ۗۧ;->ۧ:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    goto :goto_0

    .line 376
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    .line 377
    iget v4, v0, Ll/֫ۗۧ;->ۧ:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    if-ltz v4, :cond_2

    .line 379
    invoke-virtual {v0, v2, v4, p1}, Ll/֫ۗۧ;->֫(IILandroid/view/MotionEvent;)V

    .line 381
    :cond_2
    iget-object v5, v0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v2, v7, :cond_9

    const/4 v7, 0x2

    if-eq v2, v7, :cond_7

    const/4 v1, 0x3

    if-eq v2, v1, :cond_6

    const/4 v1, 0x6

    if-eq v2, v1, :cond_4

    goto :goto_0

    .line 407
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    .line 408
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    .line 409
    iget v3, v0, Ll/֫ۗۧ;->ۧ:I

    if-ne v2, v3, :cond_8

    if-nez v1, :cond_5

    const/4 v6, 0x1

    .line 413
    :cond_5
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, v0, Ll/֫ۗۧ;->ۧ:I

    .line 414
    iget v2, v0, Ll/֫ۗۧ;->۠:I

    invoke-virtual {v0, v2, v1, p1}, Ll/֫ۗۧ;->ۧ(IILandroid/view/MotionEvent;)V

    return-void

    .line 398
    :cond_6
    iget-object p1, v0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_9

    .line 399
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_1

    :cond_7
    if-ltz v4, :cond_8

    .line 389
    iget v2, v0, Ll/֫ۗۧ;->۠:I

    invoke-virtual {v0, v2, v4, p1}, Ll/֫ۗۧ;->ۧ(IILandroid/view/MotionEvent;)V

    .line 390
    invoke-virtual {v0, v5}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;)V

    .line 391
    iget-object p1, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {p1, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 392
    check-cast v1, Ll/᩹ۙۧ;

    invoke-virtual {v1}, Ll/᩹ۙۧ;->run()V

    .line 393
    iget-object p1, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_8
    :goto_0
    return-void

    :cond_9
    :goto_1
    const/4 p1, 0x0

    .line 403
    invoke-virtual {v0, p1, v6}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;I)V

    .line 404
    iput v3, v0, Ll/֫ۗۧ;->ۧ:I

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 426
    iget-object v1, p0, Ll/᩶ۙۧ;->֫:Ll/֫ۗۧ;

    invoke-virtual {v1, p1, v0}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;I)V

    return-void
.end method

.method public final ۧ(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 320
    iget-object v0, p0, Ll/᩶ۙۧ;->֫:Ll/֫ۗۧ;

    iget-object v1, v0, Ll/֫ۗۧ;->ۜ:Ll/֨ۛ;

    invoke-virtual {v1, p1}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    .line 324
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_5

    .line 326
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, v0, Ll/֫ۗۧ;->ۧ:I

    .line 327
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Ll/֫ۗۧ;->᩷:F

    .line 328
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, Ll/֫ۗۧ;->ۢ:F

    .line 947
    iget-object v1, v0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_0

    .line 948
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 950
    :cond_0
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v1

    iput-object v1, v0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    .line 330
    iget-object v1, v0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    if-nez v1, :cond_8

    .line 1166
    iget-object v1, v0, Ll/֫ۗۧ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    .line 1169
    :cond_1
    invoke-virtual {v0, p1}, Ll/֫ۗۧ;->ܽ(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v5

    .line 1170
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v3

    :goto_0
    if-ltz v6, :cond_3

    .line 1171
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩺ۙۧ;

    .line 1172
    iget-object v8, v7, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    iget-object v8, v8, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    if-ne v8, v5, :cond_2

    move-object v2, v7

    goto :goto_1

    :cond_2
    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v2, :cond_8

    .line 332
    iget-object v1, v2, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    .line 333
    iget v5, v0, Ll/֫ۗۧ;->᩷:F

    iget v6, v2, Ll/᩺ۙۧ;->ܺ:F

    sub-float/2addr v5, v6

    iput v5, v0, Ll/֫ۗۧ;->᩷:F

    .line 334
    iget v5, v0, Ll/֫ۗۧ;->ۢ:F

    iget v6, v2, Ll/᩺ۙۧ;->ۖ:F

    sub-float/2addr v5, v6

    iput v5, v0, Ll/֫ۗۧ;->ۢ:F

    .line 335
    invoke-virtual {v0, v1, v3}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;Z)V

    .line 336
    iget-object v5, v0, Ll/֫ۗۧ;->ᩴ:Ljava/util/ArrayList;

    iget-object v6, v1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 337
    iget-object v5, v0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    iget-object v6, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v5, v6, v1}, Ll/ۤۙۧ;->֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;)V

    .line 339
    :cond_4
    iget v2, v2, Ll/᩺ۙۧ;->֫:I

    invoke-virtual {v0, v1, v2}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;I)V

    .line 340
    iget v1, v0, Ll/֫ۗۧ;->۠:I

    invoke-virtual {v0, v1, v4, p1}, Ll/֫ۗۧ;->ۧ(IILandroid/view/MotionEvent;)V

    goto :goto_3

    :cond_5
    const/4 v5, 0x3

    const/4 v6, -0x1

    if-eq v1, v5, :cond_7

    if-ne v1, v3, :cond_6

    goto :goto_2

    .line 346
    :cond_6
    iget v2, v0, Ll/֫ۗۧ;->ۧ:I

    if-eq v2, v6, :cond_8

    .line 349
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    if-ltz v2, :cond_8

    .line 354
    invoke-virtual {v0, v1, v2, p1}, Ll/֫ۗۧ;->֫(IILandroid/view/MotionEvent;)V

    goto :goto_3

    .line 344
    :cond_7
    :goto_2
    iput v6, v0, Ll/֫ۗۧ;->ۧ:I

    .line 345
    invoke-virtual {v0, v2, v4}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;I)V

    .line 357
    :cond_8
    :goto_3
    iget-object v1, v0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_9

    .line 358
    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 360
    :cond_9
    iget-object p1, v0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    if-eqz p1, :cond_a

    return v3

    :cond_a
    return v4
.end method
